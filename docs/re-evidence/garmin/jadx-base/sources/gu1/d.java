package gu1;

import c83.a0;
import java.util.List;
import o13.r;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc83/a0;", "", "Lxw1/h;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.training.atp.network.ATPRepo$getChangeCoachPlan$2", f = "ATPRepo.kt", l = {56}, m = "invokeSuspend", v = 2)
public final class d extends v13.i implements e23.l<t13.d<? super a0<List<? extends xw1.h>>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f79057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f79058b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f79059c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f79060d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Integer f79061e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f79062f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(b bVar, long j8, String str, Integer num, String str2, t13.d<? super d> dVar) {
        super(1, dVar);
        this.f79058b = bVar;
        this.f79059c = j8;
        this.f79060d = str;
        this.f79061e = num;
        this.f79062f = str2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new d(this.f79058b, this.f79059c, this.f79060d, this.f79061e, this.f79062f, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<List<? extends xw1.h>>> dVar) {
        return ((d) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f79057a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        i0<a0<List<xw1.h>>> i0VarC = this.f79058b.f79048a.c(this.f79059c, this.f79060d, this.f79061e, this.f79062f);
        this.f79057a = 1;
        Object objAwait = i0VarC.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
