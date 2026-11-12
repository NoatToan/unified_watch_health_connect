package com.garmin.android.apps.connectmobile.googlehealthconnect;

import org.joda.time.DateTime;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.googlehealthconnect.HealthConnectDelegateImpl", f = "GoogleHealthConnectDelegateImpl.kt", l = {209, 220}, m = "deleteAllWeightRecordsForDate", v = 2)
public final class k extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public DateTime f36116a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f36117b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f36118c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f36119d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(i iVar, t13.d<? super k> dVar) {
        super(dVar);
        this.f36118c = iVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f36117b = obj;
        this.f36119d |= Integer.MIN_VALUE;
        return this.f36118c.e(null, this);
    }
}
