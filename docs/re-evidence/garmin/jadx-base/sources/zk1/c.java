package zk1;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c22.l3;
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
import org.apache.commons.lang3.StringUtils;
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
public final class c {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.settings.usersettings.stride.components.MeasuredDistanceKt$MeasuredDistance$5$1", f = "MeasuredDistance.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ m4.b0 f205093a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(m4.b0 b0Var, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f205093a = b0Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f205093a, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            m4.b0.a(this.f205093a);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(StrideLengthSettingsActivity strideLengthSettingsActivity, al1.a aVar, l<? super Double, Unit> lVar, m mVar, int i14) {
        p1 p1Var;
        aVar.getClass();
        double d14 = aVar.f3752a;
        lVar.getClass();
        o0 o0VarE = mVar.E(1354302643);
        int i15 = i14 | (o0VarE.r(strideLengthSettingsActivity) ? 4 : 2) | (o0VarE.B(aVar) ? 32 : 16) | (o0VarE.r(lVar) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
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
            p2 p2Var = p2.f111205a;
            String strQ = y.Q(o0VarE, R.string.user_stride_measured_distance);
            int i16 = aVar.f3753b == 0 ? R.string.lbl_foot : R.string.lbl_meter;
            String str = d14 <= 0.0d ? bVar.f197597b : l3.f23125c.format(d14);
            String string = bVar.f197596a.getString(i16);
            z3.e eVarJ = u0.j(strideLengthSettingsActivity, zl.a.c(string, str, StringUtils.SPACE, string), o0VarE);
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = new l0(p1Var2, 27);
                o0VarE.K(objQ2);
            }
            p2Var.g(strQ, null, null, null, eVarJ, false, false, (e23.a) objQ2, o0VarE, 100663296, 238);
            if (((Boolean) p1Var2.getF182175a()).booleanValue()) {
                o0VarE.C(-892004139);
                String str2 = d14 > 0.0d ? l3.f23125c.format(d14) : "";
                Object objQ3 = o0VarE.q();
                if (objQ3 == c2565a) {
                    objQ3 = p0.n(str2);
                    o0VarE.K(objQ3);
                }
                p1 p1Var3 = (p1) objQ3;
                Object objQ4 = o0VarE.q();
                if (objQ4 == c2565a) {
                    objQ4 = f.j(o0VarE);
                }
                m4.b0 b0Var = (m4.b0) objQ4;
                c1 c1Var = c1.f110940a;
                String strQ2 = y.Q(o0VarE, R.string.user_stride_measured_distance);
                String strQ3 = y.Q(o0VarE, R.string.lbl_done);
                Locale locale = Locale.ROOT;
                String upperCase = strQ3.toUpperCase(locale);
                upperCase.getClass();
                String upperCase2 = y.Q(o0VarE, R.string.lbl_cancel).toUpperCase(locale);
                upperCase2.getClass();
                z3.e eVarC = z3.f.c(-717933996, new zk1.a(str2, b0Var, p1Var3, 0), o0VarE);
                boolean z14 = ((i15 & 112) == 32) | ((i15 & 896) == 256);
                Object objQ5 = o0VarE.q();
                if (z14 || objQ5 == c2565a) {
                    p1Var = p1Var2;
                    objQ5 = new b(p1Var3, aVar, lVar, p1Var, 0);
                    o0VarE.K(objQ5);
                } else {
                    p1Var = p1Var2;
                }
                e23.a<Unit> aVar2 = (e23.a) objQ5;
                Object objQ6 = o0VarE.q();
                if (objQ6 == c2565a) {
                    objQ6 = new l0(p1Var, 28);
                    o0VarE.K(objQ6);
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
                o0VarE.g0(false);
            } else {
                o0VarE.C(-890564561);
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new xk1.e(strideLengthSettingsActivity, aVar, lVar, i14, 28);
        }
    }
}
