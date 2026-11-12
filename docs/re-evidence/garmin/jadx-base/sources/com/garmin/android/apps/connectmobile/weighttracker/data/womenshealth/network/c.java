package com.garmin.android.apps.connectmobile.weighttracker.data.womenshealth.network;

import p005kotlin.Metadata;
import v13.e;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@e(c = "com.garmin.android.apps.connectmobile.weighttracker.data.womenshealth.network.WomensHealthServiceApi$Companion", f = "WomensHealthServiceApi.kt", l = {32, 37}, m = "getDetailedDailySummary", v = 2)
public final class c extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f47987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b.C0937b f47988b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f47989c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b.C0937b c0937b, t13.d<? super c> dVar) {
        super(dVar);
        this.f47988b = c0937b;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f47987a = obj;
        this.f47989c |= Integer.MIN_VALUE;
        return this.f47988b.a(null, this);
    }
}
