package com.codingapi.txlcn.tracing.spring;

import com.codingapi.txlcn.common.util.id.ModIdProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author dinghuang123@gmail.com
 * @since 2019/7/31
 */
@Component
public class MyModIdProvider implements ModIdProvider {

    @Autowired
    private SpringConfig springConfig;

    @Override
    public String modId() {
        return springConfig.getServiceName() + "(" + springConfig.getIp() + ":" + springConfig.getPort() + ")";
    }
}
