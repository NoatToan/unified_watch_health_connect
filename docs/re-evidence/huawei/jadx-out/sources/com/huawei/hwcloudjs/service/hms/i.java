package com.huawei.hwcloudjs.service.hms;

import android.app.Activity;
import com.huawei.hms.api.HuaweiApiClient;
import com.huawei.hms.support.api.client.ResultCallback;
import com.huawei.hms.support.api.hwid.SignInResult;
import com.huawei.hwcloudjs.core.JsCallback;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes10.dex */
class i implements ResultCallback<SignInResult> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ boolean f17159a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ WeakReference f17160b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ WeakReference f17161c;
    final /* synthetic */ boolean d;
    final /* synthetic */ JsCallback e;
    final /* synthetic */ HmsCoreApi f;

    @Override // com.huawei.hms.support.api.client.ResultCallback
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onResult(SignInResult signInResult) {
        this.f.a(signInResult, this.f17159a, (WeakReference<Activity>) this.f17160b, (WeakReference<HuaweiApiClient>) this.f17161c, this.d, this.e);
    }

    i(HmsCoreApi hmsCoreApi, boolean z, WeakReference weakReference, WeakReference weakReference2, boolean z2, JsCallback jsCallback) {
        this.f = hmsCoreApi;
        this.f17159a = z;
        this.f17160b = weakReference;
        this.f17161c = weakReference2;
        this.d = z2;
        this.e = jsCallback;
    }
}
