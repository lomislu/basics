package com.coeho.basics.klock.handler.release;

import com.coeho.basics.klock.model.LockInfo;

/**
 * 获取锁超时的处理逻辑接口
 *
 * @author wanglaomo
 * @since 2019/4/15
 **/
public interface ReleaseTimeoutHandler {

    void handle(LockInfo lockInfo);
}
