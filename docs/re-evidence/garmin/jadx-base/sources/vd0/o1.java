package vd0;

import android.net.Uri;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.x3;
import r53.p2;

/* JADX INFO: loaded from: classes8.dex */
public final class o1 {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.dogs.presentation.EditDogProfilePicturePageKt$EditDogProfilePicturePage$1$1", f = "EditDogProfilePicturePage.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ oe0.s f177345a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e23.a<Unit> f177346b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ x3<oe0.o> f177347c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(oe0.s sVar, e23.a<Unit> aVar, x3<oe0.o> x3Var, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f177345a = sVar;
            this.f177346b = aVar;
            this.f177347c = x3Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f177345a, this.f177346b, this.f177347c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            if (this.f177347c.getF182175a().f131395g) {
                p2 p2Var = this.f177345a.f131410f;
                do {
                    value = p2Var.getValue();
                } while (!p2Var.b(value, oe0.o.a((oe0.o) value, false, false, false, false, false, 63)));
                this.f177346b.invoke();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0094  */
    /* JADX WARN: Code duplicated, block: B:45:0x00d1  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(oe0.s sVar, long j8, e23.a<Unit> aVar, e23.a<Unit> aVar2, p3.m mVar, int i14) {
        sVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        p3.o0 o0VarE = mVar.E(1124422027);
        int i15 = i14 | (o0VarE.r(sVar) ? 4 : 2) | (o0VarE.r(aVar) ? 256 : 128) | (o0VarE.r(aVar2) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1155) != 1154)) {
            p3.x1 x1Var = p3.n.f135158a;
            p3.p1 p1VarC = s9.c.c(sVar.f131411g, o0VarE);
            p3.p1 p1VarC2 = s9.c.c(sVar.f131413i, o0VarE);
            Boolean boolValueOf = Boolean.valueOf(((oe0.o) p1VarC.getF182175a()).f131395g);
            int i16 = i15 & 14;
            boolean zB = ((i15 & 7168) == 2048) | o0VarE.B(p1VarC) | (i16 == 4 || o0VarE.r(sVar));
            Object objQ = o0VarE.q();
            p3.m.a aVar3 = p3.m.f135153a;
            if (zB) {
                objQ = new a(sVar, aVar2, p1VarC, null);
                o0VarE.K(objQ);
            } else {
                aVar3.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new a(sVar, aVar2, p1VarC, null);
                    o0VarE.K(objQ);
                }
            }
            p3.l0.e((e23.p) objQ, boolValueOf, o0VarE);
            Uri uri = ((pe0.j) p1VarC2.getF182175a()).f137461k;
            String str = ((pe0.j) p1VarC2.getF182175a()).f137460j;
            boolean z14 = !((oe0.o) p1VarC.getF182175a()).f131394f;
            boolean z15 = i16 == 4 || o0VarE.r(sVar);
            Object objQ2 = o0VarE.q();
            if (z15) {
                objQ2 = new d1(sVar, 1);
                o0VarE.K(objQ2);
            } else {
                aVar3.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new d1(sVar, 1);
                    o0VarE.K(objQ2);
                }
            }
            c1.a(uri, str, aVar, aVar2, (e23.l) objQ2, z14, o0VarE, i15 & 8064, 0);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new da0.d(sVar, j8, aVar, aVar2, i14);
        }
    }
}
