package p50;

import android.annotation.SuppressLint;
import com.garmin.android.apps.connectmobile.R;
import e23.p;
import gl1.y;
import i3.e5;
import i3.mc;
import l72.w;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.l1;
import p3.m;
import p3.n;
import p3.n1;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import p3.y1;
import v13.i;
import vb.h;
import z3.f;

/* JADX INFO: loaded from: classes8.dex */
public final class e {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.courses.presentation.nutrition.components.WeatherBottomSheetKt$WeatherBottomSheet$1$1$1$1", f = "WeatherBottomSheet.kt", l = {82}, m = "invokeSuspend", v = 2)
    public static final class a extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f136115a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ mc f136116b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ p<a01.a, Double, Unit> f136117c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ p1<a01.a> f136118d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ l1 f136119e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(mc mcVar, p<? super a01.a, ? super Double, Unit> pVar, p1<a01.a> p1Var, l1 l1Var, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f136116b = mcVar;
            this.f136117c = pVar;
            this.f136118d = p1Var;
            this.f136119e = l1Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f136116b, this.f136117c, this.f136118d, this.f136119e, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f136115a;
            if (i14 == 0) {
                r.b(obj);
                this.f136115a = 1;
                if (this.f136116b.d(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            this.f136117c.invoke(this.f136118d.getF182175a(), new Double(this.f136119e.getDoubleValue()));
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.courses.presentation.nutrition.components.WeatherBottomSheetKt$WeatherBottomSheet$2$1$1", f = "WeatherBottomSheet.kt", l = {88}, m = "invokeSuspend", v = 2)
    public static final class b extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f136120a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ mc f136121b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(mc mcVar, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f136121b = mcVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f136121b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f136120a;
            if (i14 == 0) {
                r.b(obj);
                this.f136120a = 1;
                if (this.f136121b.d(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @SuppressLint({"PrivateResource"})
    public static final void a(mc mcVar, b0 b0Var, a01.a aVar, boolean z14, Double d14, p<? super a01.a, ? super Double, Unit> pVar, e23.a<Unit> aVar2, m mVar, int i14) {
        a01.a aVar3;
        mcVar.getClass();
        b0Var.getClass();
        aVar.getClass();
        pVar.getClass();
        aVar2.getClass();
        o0 o0VarE = mVar.E(2057667747);
        int i15 = i14 | (o0VarE.B(mcVar) ? 4 : 2) | (o0VarE.r(b0Var) ? 32 : 16) | (o0VarE.k(aVar.ordinal()) ? 256 : 128) | (o0VarE.h(z14) ? 2048 : 1024) | (o0VarE.B(d14) ? 16384 : 8192) | (o0VarE.r(pVar) ? 131072 : 65536);
        if (o0VarE.n(i15 & 1, (i15 & 599187) != 599186)) {
            x1 x1Var = n.f135158a;
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p0.n(Boolean.FALSE);
                o0VarE.K(objQ);
            }
            p1 p1Var = (p1) objQ;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                aVar3 = aVar;
                objQ2 = hb.a.n(aVar3 == a01.a.CUSTOM, o0VarE);
            } else {
                aVar3 = aVar;
            }
            p1 p1Var2 = (p1) objQ2;
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                objQ3 = new y1(zf.b.D(d14) ? d14.doubleValue() : 22.0d);
                o0VarE.K(objQ3);
            }
            l1 l1Var = (l1) objQ3;
            Object objQ4 = o0VarE.q();
            if (objQ4 == c2565a) {
                objQ4 = e5.o(0, o0VarE);
            }
            n1 n1Var = (n1) objQ4;
            Object objQ5 = o0VarE.q();
            if (objQ5 == c2565a) {
                objQ5 = p0.n(aVar3);
                o0VarE.K(objQ5);
            }
            p1 p1Var3 = (p1) objQ5;
            b92.a.C0235a c0235a = new b92.a.C0235a(null, 1, null);
            c0235a.f16962a.put("close", y.Q(o0VarE, R.string.lbl_close));
            b92.a aVarB = c0235a.b();
            w wVar = w.f111301a;
            String strQ = y.Q(o0VarE, R.string.weather_section_title);
            z3.e eVarC = f.c(1487218828, new ob0.e(b0Var, mcVar, pVar, p1Var3, l1Var, 8), o0VarE);
            boolean zR = o0VarE.r(b0Var) | ((i15 & 14) == 4);
            Object objQ6 = o0VarE.q();
            if (zR || objQ6 == c2565a) {
                objQ6 = new eu.b(b0Var, mcVar, aVar2, 7);
                o0VarE.K(objQ6);
            }
            int i16 = b92.a.f16960b;
            wVar.d(strQ, eVarC, (e23.a) objQ6, mcVar, aVarB, null, f.c(-1229280863, new l72.b(z14, p1Var3, p1Var2, l1Var, p1Var, n1Var), o0VarE), o0VarE, ((i15 << 9) & 7168) | 1572912, 32);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new defpackage.d(mcVar, b0Var, aVar, z14, d14, pVar, aVar2, i14, 13);
        }
    }
}
