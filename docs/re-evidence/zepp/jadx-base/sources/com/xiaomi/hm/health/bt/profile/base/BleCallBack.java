package com.xiaomi.hm.health.bt.profile.base;

import com.xiaomi.hm.health.bt.debug.Debug;

/* JADX INFO: loaded from: classes11.dex */
public class BleCallBack {
    private final String a = "BleCallBack";

    private void a(Object obj) {
        Debug.i("BleCallBack", "onFailed:" + obj);
    }

    private void b(int progress) {
        Debug.i("BleCallBack", "onProgress:" + progress);
    }

    public boolean onDataUpdated(Object obj) {
        Debug.i("BleCallBack", "onData:" + obj);
        return true;
    }

    public void onFinish(Object obj) {
        Debug.i("BleCallBack", "onFinish:" + obj);
    }

    public void onProgress(int max, int progress) {
        Debug.i("BleCallBack", "onProgress:" + progress);
    }

    public void onStart() {
        Debug.i("BleCallBack", "onStart");
    }
}
