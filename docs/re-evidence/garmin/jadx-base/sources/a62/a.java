package a62;

import a42.f;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.workouts.data.model.d;
import g22.k;
import gl1.y;
import i3.e5;
import j20.x;
import java.util.ArrayList;
import java.util.Locale;
import lc.u0;
import o13.p;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p13.u;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;
import r70.q;
import r70.r;
import yz1.e;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"La62/a;", "Lr70/r;", "Lb62/a;", "stateHolder", "<init>", "(Lb62/a;)V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b62.a f1698a;

    public a(b62.a aVar) {
        aVar.getClass();
        this.f1698a = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:68:0x01c5  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // r70.r
    public final void a(h4.r rVar, q qVar, m mVar, int i14) {
        p pVar;
        String strJ;
        String strJ2;
        String str;
        String str2;
        o0 o0VarQ = u0.q(rVar, qVar, mVar, 1889059210);
        int i15 = (i14 & 6) == 0 ? (o0VarQ.B(rVar) ? 4 : 2) | i14 : i14;
        if ((i14 & 384) == 0) {
            i15 |= o0VarQ.r(this) ? 256 : 128;
        }
        if (o0VarQ.n(i15 & 1, (i15 & 131) != 130)) {
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarQ.A(AndroidCompositionLocals_androidKt.f6042b);
            b62.a aVar = this.f1698a;
            d dVar = aVar.f16167b;
            String strD = x.d(dVar.getWorkoutName(), ". ", y.Q(o0VarQ, R.string.lbl_workout_category), ", ", y.Q(o0VarQ, dVar.j().f116769e));
            Integer estimatedDurationInSecs = dVar.getEstimatedDurationInSecs();
            if (estimatedDurationInSecs == null) {
                o0VarQ.C(6899773);
                o0VarQ.g0(false);
                pVar = null;
            } else {
                o0VarQ.C(6899774);
                int iIntValue = estimatedDurationInSecs.intValue();
                if (iIntValue == 0) {
                    pVar = null;
                } else {
                    p<String, String> pVarA = new u00.a(new l22.a(context)).a(iIntValue);
                    pVar = new p(y.P(R.string.abbreviated_est, new Object[]{pVarA.f128594a}, o0VarQ), y.P(R.string.estimated_duration, new Object[]{pVarA.f128595b}, o0VarQ));
                }
                o0VarQ.g0(false);
            }
            if (dVar.getAtpPlanId() == null) {
                o0VarQ.C(7383931);
                o0VarQ.g0(false);
                strJ = null;
            } else {
                strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarQ, 7383932, R.string.lbl_adaptive_training_plan, o0VarQ, false);
            }
            if (strJ == null) {
                strJ = dVar.getTrainingPlanName();
            }
            if (strJ == null) {
                strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarQ, -1385231203, R.string.lbl_scheduled_workout, o0VarQ, false);
            } else {
                o0VarQ.C(-1385235636);
                o0VarQ.g0(false);
            }
            String strG = e5.g(y.Q(o0VarQ, R.string.lbl_training_plan), ", ", strJ);
            DateTime dateTimeG = dVar.g();
            if (dateTimeG == null || !k.l(dateTimeG)) {
                o0VarQ.C(7778995);
                o0VarQ.g0(false);
                strJ2 = null;
            } else {
                strJ2 = com.airbnb.lottie.animation.keyframe.a.j(o0VarQ, -1385223977, R.string.common_tomorrow, o0VarQ, false);
            }
            ArrayList<String> arrayListC = u.C(new String[]{y.Q(o0VarQ, R.string.lbl_workout), strJ2});
            ArrayList arrayList = new ArrayList(p13.y.r(arrayListC, 10));
            for (String str3 : arrayListC) {
                Locale locale = Locale.getDefault();
                locale.getClass();
                String upperCase = str3.toUpperCase(locale);
                upperCase.getClass();
                arrayList.add(upperCase);
            }
            boolean zB = e.b(aVar.f16166a);
            u4.d dVar2 = dVar.j().f116772h;
            m52.k.a aVar2 = m52.k.f116753m;
            m52.k kVarJ = dVar.j();
            aVar2.getClass();
            long jA = m52.k.a.a(kVarJ, o0VarQ);
            String workoutName = dVar.getWorkoutName();
            if (workoutName == null) {
                workoutName = com.airbnb.lottie.animation.keyframe.a.j(o0VarQ, -1385209042, R.string.lbl_workout, o0VarQ, false);
            } else {
                o0VarQ.C(-1385209755);
                o0VarQ.g0(false);
            }
            if (pVar == null || (str = (String) pVar.f128594a) == null) {
                str = strJ;
            }
            if (pVar == null) {
                strJ = null;
            }
            if (pVar == null || (str2 = (String) pVar.f128595b) == null) {
                str2 = strG;
            }
            boolean zR = o0VarQ.r(dVar) | o0VarQ.r(context);
            String str4 = str;
            Object objQ = o0VarQ.q();
            if (zR) {
                objQ = new a11.n(5, dVar, context);
                o0VarQ.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new a11.n(5, dVar, context);
                    o0VarQ.K(objQ);
                }
            }
            c.a(rVar, zB, arrayList, dVar2, jA, workoutName, str4, strJ, strD, str2, strG, (e23.a) objQ, o0VarQ, i15 & 14);
            x1 x1Var2 = n.f135158a;
        } else {
            o0VarQ.e();
        }
        p2 p2VarI0 = o0VarQ.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new f(this, rVar, qVar, i14, 1);
        }
    }
}
