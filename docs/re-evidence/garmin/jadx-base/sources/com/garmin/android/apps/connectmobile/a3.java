package com.garmin.android.apps.connectmobile;

import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc83/a0;", "", "Lo61/c;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.StatisticsRepo$fetchActivityStatsWithExcludedActivitySubTypes$2", f = "StatisticsRepo.kt", l = {26}, m = "invokeSuspend", v = 2)
public final class a3 extends v13.i implements e23.l<t13.d<? super c83.a0<List<? extends o61.c>>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f28757a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z2 f28758b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f28759c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f28760d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f28761e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f28762f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f28763g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3(z2 z2Var, String str, String str2, boolean z14, String str3, String str4, t13.d<? super a3> dVar) {
        super(1, dVar);
        this.f28758b = z2Var;
        this.f28759c = str;
        this.f28760d = str2;
        this.f28761e = z14;
        this.f28762f = str3;
        this.f28763g = str4;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new a3(this.f28758b, this.f28759c, this.f28760d, this.f28761e, this.f28762f, this.f28763g, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<List<? extends o61.c>>> dVar) {
        return ((a3) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f28757a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        o53.i0<c83.a0<List<o61.c>>> i0VarB = this.f28758b.f49780a.b(this.f28759c, this.f28760d, this.f28761e, this.f28762f, this.f28763g);
        this.f28757a = 1;
        Object objAwait = i0VarB.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
