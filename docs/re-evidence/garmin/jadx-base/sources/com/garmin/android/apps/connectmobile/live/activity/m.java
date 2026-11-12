package com.garmin.android.apps.connectmobile.live.activity;

import am.x0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.live.activity.LiveActivityExerciseProviderImpl", f = "LiveActivityExerciseProviderImpl.kt", l = {47}, m = "getExerciseList", v = 2)
public final class m extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public x0 f38442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f38443b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f38444c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f38445d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(k kVar, t13.d<? super m> dVar) {
        super(dVar);
        this.f38444c = kVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f38443b = obj;
        this.f38445d |= Integer.MIN_VALUE;
        int i14 = k.f38433c;
        return this.f38444c.c(null, this);
    }
}
