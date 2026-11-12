package com.garmin.android.apps.connectmobile.dashboard.data.datasource;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.data.datasource.PregnancyWeightGoalDataSourceImpl", f = "PregnancyWeightGoalDataSourceImpl.kt", l = {19, 23, 30}, m = "getPregnancyWeightGoal", v = 2)
public final class e2 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f33184a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f33185b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f33186c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f33187d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d2 f33188e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f33189f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2(d2 d2Var, t13.d<? super e2> dVar) {
        super(dVar);
        this.f33188e = d2Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f33187d = obj;
        this.f33189f |= Integer.MIN_VALUE;
        return this.f33188e.a(null, false, this);
    }
}
