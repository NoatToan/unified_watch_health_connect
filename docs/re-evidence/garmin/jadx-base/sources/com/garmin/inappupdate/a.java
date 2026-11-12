package com.garmin.inappupdate;

import e23.l;
import e23.p;
import ht2.g;
import ht2.n;
import o13.q;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lo13/q;", "Lcom/garmin/inappupdate/e;", "<anonymous>", "(Lo53/b0;)Lo13/q;"}, k = 3, mv = {2, 0, 0})
@v13.e(c = "com.garmin.inappupdate.InAppUpdateCheckHelper$checkForUpdate$2", f = "InAppUpdateCheckHelper.kt", l = {149}, m = "invokeSuspend")
public final class a extends i implements p<b0, t13.d<? super q<? extends e>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f52399a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f52400b;

    /* JADX INFO: renamed from: com.garmin.inappupdate.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo13/q;", "Lcom/garmin/inappupdate/e;", "<anonymous>", "()Lo13/q;"}, k = 3, mv = {2, 0, 0})
    @v13.e(c = "com.garmin.inappupdate.InAppUpdateCheckHelper$checkForUpdate$2$1", f = "InAppUpdateCheckHelper.kt", l = {158}, m = "invokeSuspend")
    public static final class C1116a extends i implements l<t13.d<? super q<? extends e>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f52401a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g f52402b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1116a(g gVar, t13.d<? super C1116a> dVar) {
            super(1, dVar);
            this.f52402b = gVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(t13.d<?> dVar) {
            return new C1116a(this.f52402b, dVar);
        }

        @Override // e23.l
        public final Object invoke(t13.d<? super q<? extends e>> dVar) {
            return ((C1116a) create(dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f52401a;
            Object bVar = null;
            try {
                if (i14 == 0) {
                    r.b(obj);
                    n nVar = n.f85666a;
                    nVar.getClass();
                    if (n.f85669d.a()) {
                        g gVar = this.f52402b;
                        if (gVar.f85642a) {
                            e eVarC = n.c(gVar, new zy2.a().getInfo());
                            this.f52401a = 1;
                            obj = nVar.b(eVarC, this);
                            if (obj == aVar) {
                                return aVar;
                            }
                        } else {
                            ht2.a.f85620a.c("checkForUpdate: no-op, library not initialized", null);
                            int i15 = q.f128596b;
                        }
                    } else {
                        int i16 = q.f128596b;
                        bVar = new q.b(new IllegalStateException("library not initialized"));
                    }
                    return q.a(bVar);
                }
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
                d dVar = (d) obj;
                if (dVar == d.NONE) {
                    n.f85666a.getClass();
                    ht2.a.f85620a.b("checkForUpdate: promptType " + dVar);
                    int i17 = q.f128596b;
                } else {
                    e eVar = n.f85670e;
                    eVar.getClass();
                    dVar.getClass();
                    eVar.f52422a = dVar;
                    ht2.a aVar2 = ht2.a.f85620a;
                    String str = "checkForUpdate: " + n.f85670e;
                    n.f85666a.getClass();
                    aVar2.b(str);
                    int i18 = q.f128596b;
                    bVar = n.f85670e;
                }
            } catch (Throwable th3) {
                ht2.a aVar3 = ht2.a.f85620a;
                n.f85666a.getClass();
                aVar3.c("checkForUpdate", th3);
                int i19 = q.f128596b;
                bVar = new q.b(th3);
            }
            return q.a(bVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(g gVar, t13.d<? super a> dVar) {
        super(2, dVar);
        this.f52400b = gVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new a(this.f52400b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super q<? extends e>> dVar) {
        return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f52399a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        ht2.q<q<e>> qVar = n.f85668c;
        C1116a c1116a = new C1116a(this.f52400b, null);
        this.f52399a = 1;
        Object objA = qVar.a(c1116a, this);
        return objA == aVar ? aVar : objA;
    }
}
