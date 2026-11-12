package com.facebook.react.uimanager;

import com.facebook.react.bridge.ReactApplicationContext;
import defpackage.pd8;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class c {
    public b createUIImplementation(ReactApplicationContext reactApplicationContext, UIManagerModule.f fVar, pd8 pd8Var, int i) {
        return new b(reactApplicationContext, fVar, pd8Var, i);
    }

    public b createUIImplementation(ReactApplicationContext reactApplicationContext, List<ViewManager> list, pd8 pd8Var, int i) {
        return new b(reactApplicationContext, list, pd8Var, i);
    }

    b createUIImplementation(ReactApplicationContext reactApplicationContext, f fVar, pd8 pd8Var, int i) {
        return new b(reactApplicationContext, fVar, pd8Var, i);
    }
}
