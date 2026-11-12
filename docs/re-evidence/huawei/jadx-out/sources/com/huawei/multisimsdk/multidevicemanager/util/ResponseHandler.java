package com.huawei.multisimsdk.multidevicemanager.util;

/* JADX INFO: loaded from: classes12.dex */
public interface ResponseHandler {
    default void onCallback(int i, String str) {
    }

    void onCallback(String str);
}
