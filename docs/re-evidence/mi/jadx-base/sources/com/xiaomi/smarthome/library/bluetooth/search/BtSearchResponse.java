package com.xiaomi.smarthome.library.bluetooth.search;

/* JADX INFO: loaded from: classes2.dex */
public interface BtSearchResponse<T> {
    void onDeviceFounded(T t);

    void onSearchCanceled();

    void onSearchStarted();

    void onSearchStopped();
}
