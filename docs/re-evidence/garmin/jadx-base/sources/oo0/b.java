package oo0;

import android.content.Context;
import android.text.format.DateFormat;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.garmin.android.apps.connectmobile.R;
import gl1.y;
import l72.c1;
import nw0.x;
import org.joda.time.DateTime;
import org.joda.time.Minutes;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;
import yz.k;

/* JADX INFO: loaded from: classes8.dex */
public final class b {
    /* JADX WARN: Code duplicated, block: B:56:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:65:0x0114  */
    public static final void a(gs1.d.b bVar, DateTime dateTime, e23.a<Unit> aVar, e23.a<Unit> aVar2, m mVar, int i14) {
        o0 o0Var;
        String string;
        Integer num = bVar.f78714b;
        o0 o0VarP = fb1.c.p(aVar, aVar2, mVar, 1949888229);
        int i15 = i14 | (o0VarP.r(bVar) ? 4 : 2) | (o0VarP.r(dateTime) ? 32 : 16) | (o0VarP.r(aVar) ? 256 : 128) | (o0VarP.r(aVar2) ? 2048 : 1024);
        if (o0VarP.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = n.f135158a;
            mo0.a aVar3 = new mo0.a((Context) o0VarP.A(AndroidCompositionLocals_androidKt.f6042b));
            c1 c1Var = c1.f110940a;
            DateTime dateTimeNow = bVar.f78713a;
            if (dateTimeNow == null) {
                dateTimeNow = DateTime.now();
            }
            int minutes = Minutes.minutesBetween(dateTime, dateTimeNow).getMinutes();
            boolean z14 = (num != null ? num.intValue() : 0) <= 60;
            boolean z15 = (num != null ? num.intValue() : 0) >= 100;
            String strA = new k(DateFormat.is24HourFormat(aVar3.f119868a)).a(minutes);
            l22.a aVar4 = aVar3.f119871d;
            if (z14) {
                string = aVar4.getString(R.string.lbl_heart_rate_low_short);
            } else {
                string = z15 ? aVar4.getString(R.string.lbl_heart_rate_high_short) : "";
            }
            String strA2 = aVar4.a(R.string.msg_ask_delete_abnormal_hr, strA, string, aVar4.getString(R.string.lbl_heart_rate_initials));
            String strQ = y.Q(o0VarP, R.string.lbl_delete);
            String strQ2 = y.Q(o0VarP, R.string.common_cancel);
            boolean z16 = (i15 & 7168) == 2048;
            Object objQ = o0VarP.q();
            m.a aVar5 = m.f135153a;
            if (z16) {
                objQ = new x(aVar2, 25);
                o0VarP.K(objQ);
            } else {
                aVar5.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new x(aVar2, 25);
                    o0VarP.K(objQ);
                }
            }
            e23.a<Unit> aVar6 = (e23.a) objQ;
            boolean z17 = (i15 & 896) == 256;
            Object objQ2 = o0VarP.q();
            if (z17) {
                objQ2 = new x(aVar, 26);
                o0VarP.K(objQ2);
            } else {
                aVar5.getClass();
                if (objQ2 == m.a.f135155b) {
                    objQ2 = new x(aVar, 26);
                    o0VarP.K(objQ2);
                }
            }
            o0Var = o0VarP;
            c1Var.a(false, null, strA2, null, null, strQ, false, false, aVar6, strQ2, (e23.a) objQ2, o0Var, 6, 0, 218);
        } else {
            o0Var = o0VarP;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new na0.a(bVar, dateTime, aVar, aVar2, i14, 14);
        }
    }
}
