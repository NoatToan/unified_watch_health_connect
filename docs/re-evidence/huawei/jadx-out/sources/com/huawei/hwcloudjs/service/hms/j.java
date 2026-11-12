package com.huawei.hwcloudjs.service.hms;

import android.app.Activity;
import com.huawei.hms.api.HuaweiApiClient;
import com.huawei.hwcloudjs.core.JsCallback;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes10.dex */
class j implements a.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ WeakReference f17162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ JsCallback f17163b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ WeakReference f17164c;
    final /* synthetic */ boolean d;
    final /* synthetic */ boolean e;
    final /* synthetic */ HmsCoreApi f;

    @Override // com.huawei.hwcloudjs.service.hms.a.c
    public void a(a.b bVar) {
        HmsCoreApi hmsCoreApi = this.f;
        WeakReference weakReference = this.f17162a;
        hmsCoreApi.a(bVar, (WeakReference<HuaweiApiClient>) weakReference, this.f17163b, (WeakReference<Activity>) this.f17164c, this.d, this.e);
    }

    j(HmsCoreApi hmsCoreApi, WeakReference weakReference, JsCallback jsCallback, WeakReference weakReference2, boolean z, boolean z2) {
        this.f = hmsCoreApi;
        this.f17162a = weakReference;
        this.f17163b = jsCallback;
        this.f17164c = weakReference2;
        this.d = z;
        this.e = z2;
    }
}
