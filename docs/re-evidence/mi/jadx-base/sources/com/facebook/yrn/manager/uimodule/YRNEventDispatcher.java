package com.facebook.yrn.manager.uimodule;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.yrn.manager.utils.YRNReflectUtils;
import defpackage.pd8;

/* JADX INFO: loaded from: classes4.dex */
public class YRNEventDispatcher extends pd8 {
    private volatile YRNReactEventEmitter mYRNReactEventEmitter;

    public YRNEventDispatcher(YRNViewTagMappingManager yRNViewTagMappingManager, ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mYRNReactEventEmitter = new YRNReactEventEmitter(yRNViewTagMappingManager, reactApplicationContext);
        YRNReflectUtils.modifyPrivateObjectByReflect(pd8.class, "mReactEventEmitter", this, this.mYRNReactEventEmitter);
    }
}
