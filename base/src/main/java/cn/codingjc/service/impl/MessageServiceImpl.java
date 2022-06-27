package cn.codingjc.service.impl;

import cn.codingjc.service.IMessageService;

/**
 * @author codingjc
 * @date 2022-06-19 9:56
 */
public class MessageServiceImpl implements IMessageService {

    @Override
    public String echo(String msg) {
        return "[ECHO] " + msg;
    }
}
