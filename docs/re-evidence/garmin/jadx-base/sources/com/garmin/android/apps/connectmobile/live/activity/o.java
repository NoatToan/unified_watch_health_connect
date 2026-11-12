package com.garmin.android.apps.connectmobile.live.activity;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.live.activity.LiveActivityExerciseProviderImpl", f = "LiveActivityExerciseProviderImpl.kt", l = {61}, m = "getExerciseList", v = 2)
public final class o extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f38447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f38448b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f38449c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(k kVar, t13.d<? super o> dVar) {
        super(dVar);
        this.f38448b = kVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f38447a = obj;
        this.f38449c |= Integer.MIN_VALUE;
        return this.f38448b.b(null, this);
    }
}
