package wl;

import android.content.Context;
import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b.u;
import b63.o;
import c2.k3;
import c2.l1;
import c2.n3;
import e23.l;
import e23.p;
import g22.k;
import h2.j0;
import i3.hb;
import n82.f;
import n82.j;
import o13.r;
import o53.b0;
import o82.g;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.q;
import p3.l0;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;
import v13.i;
import vb.h;
import w52.z0;

/* JADX INFO: loaded from: classes7.dex */
public final class c {

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class a extends q implements e23.a<Unit> {
        public a(Object obj) {
            super(0, obj, u.class, "onBackPressed", "onBackPressed()V", 0);
        }

        @Override // e23.a
        public final Unit invoke() {
            ((u) this.receiver).d();
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.acclimation.reports.presentation.composables.screen.PulseOxAcclimationDailyReportsScreenKt$PulseOxAcclimationDailyReportsScreen$3$1", f = "PulseOxAcclimationDailyReportsScreen.kt", l = {120}, m = "invokeSuspend", v = 2)
    public static final class b extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public l f185884a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f185885b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Long f185886c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ f f185887d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ l<Long, Unit> f185888e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Long l14, f fVar, l<? super Long, Unit> lVar, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f185886c = l14;
            this.f185887d = fVar;
            this.f185888e = lVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f185886c, this.f185887d, this.f185888e, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            l<Long, Unit> lVar;
            Object obj2 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f185885b;
            if (i14 == 0) {
                r.b(obj);
                Long l14 = this.f185886c;
                if (l14 != null) {
                    LocalDate localDate = new DateTime(l14.longValue()).toLocalDate();
                    localDate.getClass();
                    o oVarT = k.t(localDate);
                    l<Long, Unit> lVar2 = this.f185888e;
                    this.f185884a = lVar2;
                    this.f185885b = 1;
                    f fVar = this.f185887d;
                    n82.b bVar = fVar.f124961b;
                    g gVarA = bVar.a();
                    gVarA.getClass();
                    n82.g gVar = fVar.f124962c;
                    if (gVar != null) {
                        gVar.f124966a.put(gVarA, oVarT);
                    }
                    int iA = bVar.f124952e.a(oVarT);
                    j0 j0Var = fVar.f124960a.f117196a;
                    if (iA < 0) {
                        iA = 0;
                    }
                    Object objW = j0.w(j0Var, iA, this);
                    if (objW != obj2) {
                        objW = Unit.INSTANCE;
                    }
                    if (objW != obj2) {
                        objW = Unit.INSTANCE;
                    }
                    if (objW == obj2) {
                        return obj2;
                    }
                    lVar = lVar2;
                }
                return Unit.INSTANCE;
            }
            if (i14 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            lVar = this.f185884a;
            r.b(obj);
            lVar.invoke(null);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: wl.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"wl/c$c", "Lq82/c;", "Ln82/d;", "gcm-pulse-ox-acclimation_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C3456c implements q82.c<n82.d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final pi0.e f185889a;

        public C3456c(Context context) {
            this.f185889a = new pi0.e(context);
        }

        @Override // q82.c
        public final String a(n82.d dVar) {
            return this.f185889a.a(h.k(dVar.f124956a.f130843a), qi0.a.RELATIVE_YEAR_MONTH_DAY);
        }
    }

    public static final void a(u82.d<o82.a, yl.d> dVar, tf0.i iVar, Long l14, l<? super Long, Unit> lVar, e23.a<Unit> aVar, m mVar, int i14) {
        int i15;
        o0 o0Var;
        k3 k3VarA;
        dVar.getClass();
        iVar.getClass();
        lVar.getClass();
        aVar.getClass();
        o0 o0VarE = mVar.E(-494242666);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(dVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= (i14 & 64) == 0 ? o0VarE.B(iVar) : o0VarE.r(iVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.B(l14) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(lVar) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.r(aVar) ? 16384 : 8192;
        }
        int i16 = i15;
        if (o0VarE.n(i16 & 1, (i16 & 9363) != 9362)) {
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new f.a(g.f130850c, null, null, 6, null);
                o0VarE.K(objQ);
            }
            f fVarA = j.a((f.a) objQ, null, o0VarE, 2);
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = new C3456c(context);
                o0VarE.K(objQ2);
            }
            C3456c c3456c = (C3456c) objQ2;
            boolean z14 = ((Configuration) o0VarE.A(AndroidCompositionLocals_androidKt.f6041a)).orientation == 2;
            hb.f88319a.getClass();
            l1 l1VarC = n3.c(hb.a(o0VarE), o0VarE);
            z3.e eVarC = z3.f.c(1940695259, new a42.e(z14, aVar, 24), o0VarE);
            if (z14) {
                o0VarE.C(1774226820);
                o0VarE.g0(false);
                k3VarA = n3.f22788a;
            } else {
                o0VarE.C(1774228009);
                k3VarA = hb.a(o0VarE);
                o0VarE.g0(false);
            }
            z02.d.a(false, eVarC, null, null, k3VarA, z3.f.c(-1922191393, new z0(z14, l1VarC, fVarA, c3456c, dVar, iVar, 1), o0VarE), o0VarE, 196656, 13);
            o0Var = o0VarE;
            boolean zB = ((i16 & 896) == 256) | o0Var.B(fVarA) | ((i16 & 7168) == 2048);
            Object objQ3 = o0Var.q();
            if (zB || objQ3 == c2565a) {
                objQ3 = new b(l14, fVarA, lVar, null);
                o0Var.K(objQ3);
            }
            l0.e((p) objQ3, l14, o0Var);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new w52.j0(dVar, iVar, l14, lVar, aVar, i14, 2);
        }
    }
}
