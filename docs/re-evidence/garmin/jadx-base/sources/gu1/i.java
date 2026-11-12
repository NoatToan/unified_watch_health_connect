package gu1;

import c83.a0;
import fu1.r;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lfu1/r;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.training.atp.network.ATPRepo$getPaceTimes$2", f = "ATPRepo.kt", l = {88}, m = "invokeSuspend", v = 2)
public final class i extends v13.i implements e23.l<t13.d<? super a0<r>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f79078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f79079b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f79080c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f79081d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f79082e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(b bVar, int i14, int i15, int i16, t13.d<? super i> dVar) {
        super(1, dVar);
        this.f79079b = bVar;
        this.f79080c = i14;
        this.f79081d = i15;
        this.f79082e = i16;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new i(this.f79079b, this.f79080c, this.f79081d, this.f79082e, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<r>> dVar) {
        return ((i) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f79078a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        i0<a0<r>> i0VarS = this.f79079b.f79048a.s(this.f79080c, this.f79081d, this.f79082e);
        this.f79078a = 1;
        Object objAwait = i0VarS.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
