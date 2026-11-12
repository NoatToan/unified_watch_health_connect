package com.garmin.android.apps.connectmobile.dashboard.data.datasource;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.data.datasource.ActivityTrendsPreferencesDataSourceImpl", f = "ActivityTrendsPreferencesDataSourceImpl.kt", l = {53}, m = "getPromptSeen", v = 2)
public final class r extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f33331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f33332b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f33333c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(p pVar, t13.d<? super r> dVar) {
        super(dVar);
        this.f33332b = pVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f33331a = obj;
        this.f33333c |= Integer.MIN_VALUE;
        return p.c(this.f33332b, null, this);
    }
}
