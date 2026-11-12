package m41;

import b63.o;
import c83.a0;
import e23.l;
import o13.r;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Li41/e;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@e(c = "com.garmin.android.apps.connectmobile.overnighthrv.repo.OvernightHrvRepo$getDailySummery$2", f = "OvernightHrvRepo.kt", l = {40}, m = "invokeSuspend", v = 2)
public final class c extends i implements l<t13.d<? super a0<i41.e>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f116601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f116602b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o f116603c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o f116604d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b bVar, o oVar, o oVar2, t13.d<? super c> dVar) {
        super(1, dVar);
        this.f116602b = bVar;
        this.f116603c = oVar;
        this.f116604d = oVar2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new c(this.f116602b, this.f116603c, this.f116604d, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<i41.e>> dVar) {
        return ((c) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f116601a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        i0<a0<i41.e>> i0VarA = this.f116602b.f116599a.a(fz0.d.a(this.f116603c), fz0.d.a(this.f116604d));
        this.f116601a = 1;
        Object objAwait = i0VarA.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
