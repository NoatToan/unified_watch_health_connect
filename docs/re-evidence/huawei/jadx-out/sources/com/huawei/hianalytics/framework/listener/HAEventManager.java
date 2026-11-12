package com.huawei.hianalytics.framework.listener;

/* JADX INFO: loaded from: classes3.dex */
public class HAEventManager {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HAEventManager f11523b = new HAEventManager();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public IHAEventListener f11524a;

    public static HAEventManager getInstance() {
        return f11523b;
    }

    public IHAEventListener getEventListener() {
        return this.f11524a;
    }

    public void setEventListener(IHAEventListener iHAEventListener) {
        this.f11524a = iHAEventListener;
    }
}
