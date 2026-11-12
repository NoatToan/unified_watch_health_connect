package com.huawei.hwcloudjs.service.hms;

import com.huawei.hms.api.HuaweiApiClient;
import com.huawei.hwcloudjs.core.JsCallback;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes10.dex */
class h implements HuaweiApiClient.ConnectionCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ WeakReference f17156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ JsCallback f17157b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ WeakReference f17158c;
    final /* synthetic */ boolean d;
    final /* synthetic */ boolean e;
    final /* synthetic */ HmsCoreApi f;

    @Override // com.huawei.hms.api.HuaweiApiClient.ConnectionCallbacks
    public void onConnectionSuspended(int i) {
    }

    @Override // com.huawei.hms.api.HuaweiApiClient.ConnectionCallbacks
    public void onConnected() {
        this.f.a(this.f17156a, this.f17157b, this.f17158c, this.d, this.e);
    }

    h(HmsCoreApi hmsCoreApi, WeakReference weakReference, JsCallback jsCallback, WeakReference weakReference2, boolean z, boolean z2) {
        this.f = hmsCoreApi;
        this.f17156a = weakReference;
        this.f17157b = jsCallback;
        this.f17158c = weakReference2;
        this.d = z;
        this.e = z2;
    }
}
