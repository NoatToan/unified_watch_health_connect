package com.facebook.yrn.manager;

import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import defpackage.sk1;

/* JADX INFO: loaded from: classes4.dex */
public class YRNOptionsConfig extends WritableNativeMap {
    private static final String CONFIG = "config";
    public static final String INSTANCE_ID = "instanceId";
    private static final String MAX_API_LEVEL = "maxApiLevel";

    public YRNOptionsConfig(int i, WritableMap writableMap) {
        sk1.b(writableMap != null, "Biz bundle config should not be null,or js polyfill will not execute!");
        putInt(MAX_API_LEVEL, i);
        putMap("config", writableMap);
    }
}
