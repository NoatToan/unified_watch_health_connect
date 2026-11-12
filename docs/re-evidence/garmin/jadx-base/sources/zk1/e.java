package zk1;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.settings.usersettings.stride.StrideLengthSettingsActivity;
import e23.l;
import e23.p;
import gl1.y;
import java.util.Locale;
import kg.f;
import l72.c1;
import l72.p2;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.x1;
import v13.i;
import w52.u0;
import yg2.l0;

/* JADX INFO: loaded from: classes10.dex */
public final class e {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.settings.usersettings.stride.components.StrideCountKt$StrideCount$5$1", f = "StrideCount.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ m4.b0 f205096a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(m4.b0 b0Var, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f205096a = b0Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f205096a, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            m4.b0.a(this.f205096a);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(StrideLengthSettingsActivity strideLengthSettingsActivity, al1.a aVar, boolean z14, l<? super Integer, Unit> lVar, m mVar, int i14) {
        p1 p1Var;
        boolean z15;
        aVar.getClass();
        int i15 = aVar.f3754c;
        lVar.getClass();
        o0 o0VarE = mVar.E(-680856085);
        int i16 = i14 | (o0VarE.r(strideLengthSettingsActivity) ? 4 : 2) | (o0VarE.B(aVar) ? 32 : 16) | (o0VarE.h(z14) ? 256 : 128) | (o0VarE.r(lVar) ? 2048 : 1024);
        if (o0VarE.n(i16 & 1, (i16 & 1171) != 1170)) {
            x1 x1Var = n.f135158a;
            yk1.b bVar = new yk1.b((Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b));
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p0.n(Boolean.FALSE);
                o0VarE.K(objQ);
            }
            p1 p1Var2 = (p1) objQ;
            int i17 = z14 ? R.string.lbl_total_pushes : R.string.lbl_total_steps;
            p2 p2Var = p2.f111205a;
            String strQ = y.Q(o0VarE, i17);
            z3.e eVarJ = u0.j(strideLengthSettingsActivity, i15 <= 0 ? bVar.f197597b : String.valueOf(i15), o0VarE);
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = new l0(p1Var2, 29);
                o0VarE.K(objQ2);
            }
            int i18 = i17;
            p2Var.g(strQ, null, null, null, eVarJ, false, false, (e23.a) objQ2, o0VarE, 100663296, 238);
            if (((Boolean) p1Var2.getF182175a()).booleanValue()) {
                o0VarE.C(1747556784);
                String strValueOf = i15 > 0 ? String.valueOf(i15) : "";
                Object objQ3 = o0VarE.q();
                if (objQ3 == c2565a) {
                    objQ3 = p0.n(strValueOf);
                    o0VarE.K(objQ3);
                }
                p1 p1Var3 = (p1) objQ3;
                Object objQ4 = o0VarE.q();
                if (objQ4 == c2565a) {
                    objQ4 = f.j(o0VarE);
                }
                m4.b0 b0Var = (m4.b0) objQ4;
                c1 c1Var = c1.f110940a;
                String strQ2 = y.Q(o0VarE, i18);
                String strQ3 = y.Q(o0VarE, R.string.lbl_done);
                Locale locale = Locale.ROOT;
                String upperCase = strQ3.toUpperCase(locale);
                upperCase.getClass();
                String upperCase2 = y.Q(o0VarE, R.string.lbl_cancel).toUpperCase(locale);
                upperCase2.getClass();
                z3.e eVarC = z3.f.c(916985804, new zk1.a(strValueOf, b0Var, p1Var3, 1), o0VarE);
                boolean z16 = ((i16 & 112) == 32) | ((i16 & 7168) == 2048);
                Object objQ5 = o0VarE.q();
                if (z16 || objQ5 == c2565a) {
                    p1Var = p1Var2;
                    b bVar2 = new b(p1Var3, aVar, lVar, p1Var, 1);
                    o0VarE.K(bVar2);
                    objQ5 = bVar2;
                } else {
                    p1Var = p1Var2;
                }
                e23.a<Unit> aVar2 = (e23.a) objQ5;
                Object objQ6 = o0VarE.q();
                if (objQ6 == c2565a) {
                    z15 = false;
                    objQ6 = new d(p1Var, 0);
                    o0VarE.K(objQ6);
                } else {
                    z15 = false;
                }
                c1Var.a(true, strQ2, null, eVarC, null, upperCase, false, false, aVar2, upperCase2, (e23.a) objQ6, o0VarE, 3078, 6, 212);
                o0VarE = o0VarE;
                Unit unit = Unit.INSTANCE;
                Object objQ7 = o0VarE.q();
                if (objQ7 == c2565a) {
                    objQ7 = new a(b0Var, null);
                    o0VarE.K(objQ7);
                }
                p3.l0.e((p) objQ7, unit, o0VarE);
                o0VarE.g0(z15);
            } else {
                o0VarE.C(1748885847);
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new x72.m(strideLengthSettingsActivity, aVar, z14, lVar, i14, 7);
        }
    }
}
