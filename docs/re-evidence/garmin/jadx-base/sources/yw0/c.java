package yw0;

import p005kotlin.Metadata;
import v13.e;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@e(c = "com.garmin.android.apps.connectmobile.menstrualcycle.data.repository.MenstrualCycleRepositoryImpl", f = "MenstrualCycleRepositoryImpl.kt", l = {31, 31}, m = "postInitialCycle", v = 2)
public final class c extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f199891a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f199892b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f199893c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, t13.d<? super c> dVar2) {
        super(dVar2);
        this.f199892b = dVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f199891a = obj;
        this.f199893c |= Integer.MIN_VALUE;
        return this.f199892b.a(null, this);
    }
}
