package com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.presenter;

import health.compact.a.LogUtil;

/* JADX INFO: loaded from: classes10.dex */
public abstract class GlRenderThread2 extends Thread {
    private static final String TAG = "GlRenderThread2";

    protected abstract void doWork();

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        try {
            LogUtil.e(TAG, "thread start to work.");
            doWork();
        } finally {
            LogUtil.e(TAG, "thread work done");
        }
    }
}
