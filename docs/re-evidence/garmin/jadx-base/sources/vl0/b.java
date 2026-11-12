package vl0;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.garmin.android.apps.connectmobile.R;
import gl1.y;
import java.text.NumberFormat;
import lc.u0;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Marker;
import p005kotlin.Metadata;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;
import r70.q;
import r70.r;
import t21.l0;
import ug2.h;
import yz1.e;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lvl0/b;", "Lr70/r;", "Lvl0/c;", "stateHolder", "<init>", "(Lvl0/c;)V", "gcm-golf_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f178691a;

    public b(c cVar) {
        cVar.getClass();
        this.f178691a = cVar;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00e3  */
    @Override // r70.r
    public final void a(h4.r rVar, q qVar, m mVar, int i14) {
        int i15;
        String string;
        o0 o0VarQ = u0.q(rVar, qVar, mVar, -350974917);
        if ((i14 & 6) == 0) {
            i15 = (o0VarQ.B(rVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarQ.r(this) ? 256 : 128;
        }
        if (o0VarQ.n(i15 & 1, (i15 & 131) != 130)) {
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarQ.A(AndroidCompositionLocals_androidKt.f6042b);
            c cVar = this.f178691a;
            sl0.a aVar = cVar.f178693b;
            boolean zB = e.b(cVar.f178692a);
            String courseName = aVar.getCourseName();
            cl0.c cVar2 = cl0.c.f27927a;
            int strokes = aVar.getStrokes();
            int scoreWithoutHandicap = aVar.getScoreWithoutHandicap();
            cVar2.getClass();
            context.getClass();
            StringBuilder sb3 = new StringBuilder("(");
            if (scoreWithoutHandicap == 0) {
                sb3.append("E");
            } else {
                if (scoreWithoutHandicap > 0) {
                    sb3.append(Marker.ANY_NON_NULL_MARKER);
                }
                sb3.append(scoreWithoutHandicap);
            }
            sb3.append(")");
            if (strokes > 0) {
                string = strokes + StringUtils.SPACE + ((Object) sb3);
            } else {
                string = context.getString(R.string.no_value_card);
                string.getClass();
            }
            String str = NumberFormat.getInstance().format(Integer.valueOf(aVar.getHolesCompleted()));
            str.getClass();
            String strP = y.P(R.string.golf_downloaded_course_num_holes, new Object[]{str}, o0VarQ);
            String strA = cl0.c.a(context, aVar.getScoreType());
            boolean zR = o0VarQ.r(context) | o0VarQ.B(aVar);
            Object objQ = o0VarQ.q();
            if (zR) {
                objQ = new h(26, context, aVar);
                o0VarQ.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new h(26, context, aVar);
                    o0VarQ.K(objQ);
                }
            }
            a.a(rVar, zB, courseName, string, strP, strA, (e23.a) objQ, o0VarQ, i15 & 14);
        } else {
            o0VarQ.e();
        }
        p2 p2VarI0 = o0VarQ.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new l0(this, rVar, qVar, false, i14, 20);
        }
    }
}
