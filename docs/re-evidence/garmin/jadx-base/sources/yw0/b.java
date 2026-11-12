package yw0;

import p005kotlin.Metadata;
import v13.e;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@e(c = "com.garmin.android.apps.connectmobile.menstrualcycle.data.repository.MenstrualCycleRepositoryImpl", f = "MenstrualCycleRepositoryImpl.kt", l = {27, 27}, m = "postCycleUpdates", v = 2)
public final class b extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f199888a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f199889b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f199890c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, t13.d<? super b> dVar2) {
        super(dVar2);
        this.f199889b = dVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f199888a = obj;
        this.f199890c |= Integer.MIN_VALUE;
        return this.f199889b.d(null, this);
    }
}
