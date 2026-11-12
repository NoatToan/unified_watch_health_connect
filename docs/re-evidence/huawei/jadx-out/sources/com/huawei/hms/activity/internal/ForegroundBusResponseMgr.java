package com.huawei.hms.activity.internal;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class ForegroundBusResponseMgr {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ForegroundBusResponseMgr f12692b = new ForegroundBusResponseMgr();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, BusResponseCallback> f12693a = new HashMap();

    public static ForegroundBusResponseMgr getInstance() {
        return f12692b;
    }

    public BusResponseCallback get(String str) {
        BusResponseCallback busResponseCallback;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        synchronized (this.f12693a) {
            busResponseCallback = this.f12693a.get(str);
        }
        return busResponseCallback;
    }

    public void registerObserver(String str, BusResponseCallback busResponseCallback) {
        if (TextUtils.isEmpty(str) || busResponseCallback == null) {
            return;
        }
        synchronized (this.f12693a) {
            if (!this.f12693a.containsKey(str)) {
                this.f12693a.put(str, busResponseCallback);
            }
        }
    }

    public void unRegisterObserver(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        synchronized (this.f12693a) {
            this.f12693a.remove(str);
        }
    }
}
