package mh1;

import android.os.Parcelable;
import androidx.lifecycle.v1;
import i3.c3;
import l72.p2;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.l0;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final class h {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.settings.devices.index.IndexConnectionsUnsupportedKt$IndexConnectionsUnsupported$1$1", f = "IndexConnectionsUnsupported.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.garmin.android.apps.connectmobile.userprofile.model.g f118474a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ w f118475b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f118476c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.garmin.android.apps.connectmobile.userprofile.model.g gVar, w wVar, long j8, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f118474a = gVar;
            this.f118475b = wVar;
            this.f118476c = j8;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f118474a, this.f118475b, this.f118476c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            if (this.f118474a.f46857a != null) {
                w wVar = this.f118475b;
                wVar.getClass();
                ge1.b.T(v1.a(wVar), null, null, new u(wVar, true, this.f118476c, null), 3);
            }
            return Unit.INSTANCE;
        }
    }

    public static final void a(com.garmin.android.apps.connectmobile.userprofile.model.g gVar, boolean z14, e23.a<Unit> aVar, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(1029071133);
        int i15 = i14 | ((i14 & 8) == 0 ? o0VarE.B(gVar) : o0VarE.r(gVar) ? 4 : 2) | (o0VarE.h(z14) ? 32 : 16) | (o0VarE.r(aVar) ? 256 : 128);
        int i16 = 0;
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            z3.e eVarC = z3.f.c(-1527460816, new g(gVar, i16), o0VarE);
            z3.e eVarC2 = z3.f.c(1493738872, new a42.e(z14, aVar, 10), o0VarE);
            p2 p2Var = p2.f111205a;
            h4.r.a aVar2 = h4.r.S;
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97917b;
            bVar.getClass();
            h4.r rVarC = c2.l.C(aVar2, 0.0f, f14, 0.0f, eVar.f97920e, 5);
            String str = gVar.f46858b;
            if (str == null) {
                str = "";
            }
            p2Var.g(str, rVarC, null, eVarC, eVarC2, false, false, null, o0VarE, 27648, 484);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new at.b((Parcelable) gVar, z14, (e23.a) aVar, i14, 15);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(w wVar, com.garmin.android.apps.connectmobile.userprofile.model.g gVar, long j8, String str, e23.a<Unit> aVar, p3.m mVar, int i14) {
        int i15;
        wVar.getClass();
        aVar.getClass();
        o0 o0VarE = mVar.E(-1735627454);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(wVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= (i14 & 64) == 0 ? o0VarE.B(gVar) : o0VarE.r(gVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.l(j8) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.B(str) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.r(aVar) ? 16384 : 8192;
        }
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p0.n(Boolean.FALSE);
                o0VarE.K(objQ);
            }
            p1 p1Var = (p1) objQ;
            p1 p1VarC = s9.c.c(wVar.f118517e, o0VarE);
            Unit unit = Unit.INSTANCE;
            boolean zR = ((i15 & 112) == 32 || ((i15 & 64) != 0 && o0VarE.r(gVar))) | o0VarE.r(wVar) | ((i15 & 896) == 256);
            Object objQ2 = o0VarE.q();
            if (zR || objQ2 == c2565a) {
                a aVar2 = new a(gVar, wVar, j8, null);
                o0VarE.K(aVar2);
                objQ2 = aVar2;
            }
            l0.e((e23.p) objQ2, unit, o0VarE);
            boolean z14 = ((mh1.a) p1VarC.getF182175a()).f118456b;
            b.f118457a.getClass();
            z02.d.a(z14, b.f118458b, null, null, null, z3.f.c(1216727193, new ix.h(p1VarC, gVar, aVar, str, p1Var), o0VarE), o0VarE, 196656, 28);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new c3(wVar, gVar, j8, str, aVar, i14);
        }
    }
}
