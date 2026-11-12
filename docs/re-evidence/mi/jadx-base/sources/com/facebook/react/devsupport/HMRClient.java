package com.facebook.react.devsupport;

import com.facebook.react.bridge.JavaScriptModule;

/* JADX INFO: loaded from: classes4.dex */
public interface HMRClient extends JavaScriptModule {
    void disable();

    void enable();

    void setup(String str, String str2, String str3, int i, boolean z);
}
