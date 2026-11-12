package com.facebook.yrn.manager.uimodule;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.b;
import com.facebook.react.uimanager.c;
import com.facebook.react.uimanager.f;
import defpackage.pd8;

/* JADX INFO: loaded from: classes4.dex */
public class YRNUIImplementationProvider extends c {
    private pd8 dispatcher;

    public YRNUIImplementationProvider(pd8 pd8Var) {
        this.dispatcher = pd8Var;
    }

    public b createUIImplementation(ReactApplicationContext reactApplicationContext, f fVar, pd8 pd8Var, int i) {
        return new YRNUIImplementation(reactApplicationContext, fVar, this.dispatcher, i);
    }
}
