package com.garmin.android.apps.connectmobile.live.activity;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.live.activity.LiveActivityExerciseProviderImpl", f = "LiveActivityExerciseProviderImpl.kt", l = {87}, m = "getExerciseData", v = 2)
public final class l extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f38436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f38437b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f38438c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f38439d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k f38440e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f38441f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(k kVar, t13.d<? super l> dVar) {
        super(dVar);
        this.f38440e = kVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f38439d = obj;
        this.f38441f |= Integer.MIN_VALUE;
        return this.f38440e.a(null, null, null, this);
    }
}
