package com.garmin.android.apps.connectmobile.consent;

import android.content.Intent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import q92.x;
import v92.e0;
import z10.y0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/consent/AdaptiveTrainingPlanConsentActivity;", "Lz10/y0;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class AdaptiveTrainingPlanConsentActivity extends y0 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final a f32137r = new a(null);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final i53.f<x> f32138t = i53.a.a(x.DI_CONNECT_UPLOAD, x.DI_CONNECT_ADAPTIVE_TRAINING_PLAN);

    @Override // z10.y0
    public final x[] Aa() {
        return (x[]) f32138t.toArray(new x[0]);
    }

    @Override // z10.y0
    public final void Ba() {
        setResult(-1, new Intent());
        finish();
        overridePendingTransition(0, 0);
    }

    @Override // com.garmin.android.apps.connectmobile.consent.a
    public final e0 oa() {
        return e0.UPDATE_DEVICE_UPLOAD_AUTOMATICALLY;
    }

    @Override // z10.y0, com.garmin.android.apps.connectmobile.consent.a
    public final void ua() {
        setResult(0);
        finish();
    }

    @Override // com.garmin.android.apps.connectmobile.consent.a
    public final void wa(Intent intent) {
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/consent/AdaptiveTrainingPlanConsentActivity$a;", "", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
