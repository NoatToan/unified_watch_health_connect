package ha0;

import android.content.Context;
import android.content.DialogInterface;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.v1;
import c2.b0;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.model.ActivityListItemDTO;
import e23.l;
import e23.p;
import h4.r;
import h5.e0;
import ij1.n;
import java.util.ArrayList;
import java.util.List;
import jy0.i0;
import l72.x0;
import l72.y2;
import lc.u0;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p13.x;
import p3.b4;
import p3.i2;
import p3.m;
import p3.p0;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class e implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f82632a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f82633b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f82634c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f82635d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f82636e;

    public /* synthetic */ e(com.garmin.android.apps.connectmobile.settings.primarytrainingdevice.view.a aVar, boolean z14, gj1.b bVar, boolean z15) {
        this.f82632a = 1;
        this.f82635d = aVar;
        this.f82633b = z14;
        this.f82636e = bVar;
        this.f82634c = z15;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:100:0x030a  */
    /* JADX WARN: Code duplicated, block: B:102:0x0310  */
    /* JADX WARN: Code duplicated, block: B:107:0x0357  */
    /* JADX WARN: Code duplicated, block: B:139:0x0349 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:34:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:37:0x0104  */
    /* JADX WARN: Code duplicated, block: B:39:0x0112  */
    /* JADX WARN: Code duplicated, block: B:42:0x011d  */
    /* JADX WARN: Code duplicated, block: B:43:0x0120  */
    /* JADX WARN: Code duplicated, block: B:46:0x0133 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:47:0x0135 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:48:0x0137 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x0139  */
    /* JADX WARN: Code duplicated, block: B:50:0x0144  */
    /* JADX WARN: Code duplicated, block: B:51:0x014c  */
    /* JADX WARN: Code duplicated, block: B:52:0x0157  */
    /* JADX WARN: Code duplicated, block: B:53:0x0162  */
    /* JADX WARN: Code duplicated, block: B:56:0x018a  */
    /* JADX WARN: Code duplicated, block: B:57:0x018d  */
    /* JADX WARN: Code duplicated, block: B:60:0x0197 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:61:0x0199 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:62:0x019b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:63:0x019d  */
    /* JADX WARN: Code duplicated, block: B:64:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:65:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:66:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:67:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:70:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:71:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:74:0x0206 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:75:0x0208 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:76:0x020a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:77:0x020c  */
    /* JADX WARN: Code duplicated, block: B:78:0x0217  */
    /* JADX WARN: Code duplicated, block: B:79:0x021f  */
    /* JADX WARN: Code duplicated, block: B:80:0x022f  */
    /* JADX WARN: Code duplicated, block: B:81:0x0242  */
    /* JADX WARN: Code duplicated, block: B:84:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:86:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:87:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:90:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:92:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:96:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:98:0x0300  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        String string;
        String strA;
        String str;
        String str2;
        boolean z14;
        boolean z15;
        Throwable th3;
        mp.k kVar;
        mp.k kVar2;
        int i14;
        int i15;
        String string2;
        mp.k kVar3;
        mp.k kVar4;
        int i16;
        String string3;
        mp.k kVar5;
        mp.k kVar6;
        int i17;
        String string4;
        i53.f fVarJ;
        z zVarA;
        int iHashCode;
        i2 i2VarX;
        r rVarC;
        e0.a aVar;
        h5.g.a.b bVar;
        int i18;
        int i19;
        float f14;
        int i24 = this.f82632a;
        Object obj3 = this.f82636e;
        Object obj4 = this.f82635d;
        switch (i24) {
            case 0:
                ((Integer) obj2).getClass();
                f.b(this.f82633b, this.f82634c, (d.b) obj4, (l) obj3, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 1:
                com.garmin.android.apps.connectmobile.settings.primarytrainingdevice.view.a aVar2 = (com.garmin.android.apps.connectmobile.settings.primarytrainingdevice.view.a) obj4;
                gj1.b bVar2 = (gj1.b) obj3;
                DialogInterface dialogInterface = (DialogInterface) obj;
                ((Integer) obj2).getClass();
                com.garmin.android.apps.connectmobile.settings.primarytrainingdevice.view.a.C0810a c0810a = com.garmin.android.apps.connectmobile.settings.primarytrainingdevice.view.a.f43671l;
                dialogInterface.getClass();
                if (aVar2.u6().f93835b == ej1.b.WEARABLE_DEVICE && this.f82633b) {
                    Long deviceId = bVar2.getDeviceId();
                    if (deviceId != null) {
                        aVar2.u6().C4(deviceId.longValue(), false);
                    }
                } else if (aVar2.u6().f93835b == ej1.b.TRAINING_DEVICE && this.f82634c) {
                    Long deviceId2 = bVar2.getDeviceId();
                    if (deviceId2 != null) {
                        gj1.d dVar = new gj1.d(Long.valueOf(deviceId2.longValue()));
                        ij1.g gVarU6 = aVar2.u6();
                        ge1.b.T(v1.a(gVarU6), null, null, new n(gVarU6, dVar, false, null), 3);
                    }
                } else {
                    dialogInterface.dismiss();
                }
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).getClass();
                i0.a((ActivityListItemDTO) obj4, this.f82633b, this.f82634c, (l) obj3, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 3:
                ((Integer) obj2).getClass();
                y2 y2Var = y2.f111386a;
                ((y2) obj4).e(this.f82633b, (r) obj3, this.f82634c, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 4:
                ((Integer) obj2).getClass();
                n40.n.a((com.garmin.android.apps.connectmobile.courses.model.h) obj4, this.f82633b, this.f82634c, (e23.a) obj3, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 5:
                ((Integer) obj2).getClass();
                com.garmin.android.apps.connectmobile.training.itp.a.C0880a c0880a = com.garmin.android.apps.connectmobile.training.itp.a.f45600c;
                ((com.garmin.android.apps.connectmobile.training.itp.a) obj4).v6((vw1.e) obj3, this.f82633b, this.f82634c, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 6:
                yp.f fVar = (yp.f) obj4;
                mp.k kVar7 = (mp.k) obj3;
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(1 & iIntValue, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    Context context = (Context) mVar.A(AndroidCompositionLocals_androidKt.f6042b);
                    context.getClass();
                    kVar7.getClass();
                    ArrayList arrayList = new ArrayList();
                    int[] iArr = wp.c.a.f186522a;
                    int i25 = iArr[kVar7.ordinal()];
                    Double d14 = fVar.f198618a;
                    Double dValueOf = i25 == 18 ? d14 : Double.valueOf(d14 != null ? d14.doubleValue() : 0.0d);
                    int i26 = iArr[kVar7.ordinal()];
                    int i27 = R.string.activity_stats_details_total_time_label;
                    switch (i26) {
                        case 1:
                        case 2:
                            string = context.getString(i27);
                            string.getClass();
                            switch (iArr[kVar7.ordinal()]) {
                                case 10:
                                case 11:
                                case 12:
                                case 13:
                                case 14:
                                case 15:
                                case 16:
                                case 17:
                                case 19:
                                case 20:
                                case 21:
                                    strA = oi0.c.A(context, new wp.b(0), string);
                                    break;
                                case 18:
                                default:
                                    strA = string;
                                    break;
                            }
                            o13.p pVar = new o13.p(string, strA);
                            str = (String) pVar.f128594a;
                            str2 = (String) pVar.f128595b;
                            z14 = this.f82633b;
                            z15 = this.f82634c;
                            if (d14 != null) {
                                th3 = null;
                                wp.c.a(arrayList, context, z14, z15, dValueOf, str, str2, kVar7);
                            } else {
                                th3 = null;
                            }
                            Double d15 = fVar.f198620c;
                            kVar = fVar.f198621d;
                            if (kVar == null) {
                                kVar2 = kVar7;
                            } else {
                                kVar2 = kVar;
                            }
                            i14 = iArr[kVar2.ordinal()];
                            i15 = 10;
                            if (i14 != 10) {
                                string2 = context.getString(R.string.gaming_avg_daily_win_rate);
                                string2.getClass();
                            } else if (i14 != 14) {
                                string2 = context.getString(R.string.allday_stress_average_daily_stress);
                                string2.getClass();
                            } else if (i14 != 18) {
                                string2 = context.getString(R.string.common_lbl_avg_daily_total);
                                string2.getClass();
                            } else if (i14 != 21) {
                                string2 = context.getString(R.string.common_lbl_avg_daily);
                                string2.getClass();
                            } else {
                                string2 = context.getString(R.string.lbl_avg_pace);
                                string2.getClass();
                            }
                            String string5 = string2.toString();
                            wp.c.a(arrayList, context, z14, z15, d15, string5, oi0.c.A(context, new wl.a(23), string5), kVar2);
                            Double d16 = fVar.f198622e;
                            kVar3 = fVar.f198623f;
                            if (kVar3 == null) {
                                kVar4 = kVar7;
                            } else {
                                kVar4 = kVar3;
                            }
                            i16 = iArr[kVar4.ordinal()];
                            if (i16 != 10) {
                                string3 = context.getString(R.string.gaming_avg_weekly_win_rate);
                                string3.getClass();
                            } else if (i16 != 14) {
                                string3 = context.getString(R.string.allday_stress_average_weekly_stress);
                                string3.getClass();
                            } else if (i16 != 18) {
                                string3 = context.getString(R.string.lbl_avg_weekly_with_suffix, context.getString(R.string.lbl_total));
                                string3.getClass();
                            } else if (i16 != 21) {
                                string3 = context.getString(R.string.lbl_weekly_average);
                                string3.getClass();
                            } else {
                                string3 = context.getString(R.string.lbl_avg_pace);
                                string3.getClass();
                            }
                            String string6 = string3.toString();
                            wp.c.a(arrayList, context, z14, z15, d16, string6, oi0.c.A(context, new wl.a(28), string6), kVar4);
                            Double d17 = fVar.f198624g;
                            kVar5 = fVar.f198625h;
                            if (kVar5 == null) {
                                kVar6 = kVar7;
                            } else {
                                kVar6 = kVar5;
                            }
                            i17 = iArr[kVar6.ordinal()];
                            if (i17 != 10) {
                                string4 = context.getString(R.string.lbl_avg_monthly_with_suffix, context.getString(R.string.lbl_win_rate));
                                string4.getClass();
                            } else if (i17 != 14) {
                                string4 = context.getString(R.string.lbl_avg_monthly_with_suffix, context.getString(R.string.title_stress));
                                string4.getClass();
                            } else if (i17 != 18) {
                                string4 = context.getString(R.string.lbl_avg_monthly_with_suffix, context.getString(r17));
                                string4.getClass();
                            } else if (i17 != 21) {
                                string4 = context.getString(R.string.lbl_average_monthly);
                                string4.getClass();
                            } else {
                                string4 = context.getString(R.string.lbl_avg_pace);
                                string4.getClass();
                            }
                            String string7 = string4.toString();
                            wp.c.a(arrayList, context, z14, z15, d17, string7, oi0.c.A(context, new wl.a(29), string7), kVar6);
                            fVarJ = i53.a.j(arrayList);
                            r rVarF = x2.f(r.S, 1.0f);
                            c2.j.f22691a.getClass();
                            c2.j.k kVar8 = c2.j.f22694d;
                            h4.d.f81522a.getClass();
                            zVarA = y.a(kVar8, h4.d.a.f81536n, mVar, 0);
                            iHashCode = Long.hashCode(mVar.getU());
                            i2VarX = mVar.x();
                            rVarC = h4.k.c(rVarF, mVar);
                            h5.g.V.getClass();
                            aVar = h5.g.a.f81805b;
                            if (mVar.F() != null) {
                                p0.l();
                                throw th3;
                            }
                            mVar.z();
                            if (mVar.getT()) {
                                mVar.M(aVar);
                            } else {
                                mVar.c();
                            }
                            b4.c(h5.g.a.f81810g, zVarA, mVar);
                            b4.c(h5.g.a.f81809f, i2VarX, mVar);
                            bVar = h5.g.a.f81813j;
                            if (mVar.getT() || !s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                                v.h.z(iHashCode, mVar, iHashCode, bVar);
                            }
                            b4.c(h5.g.a.f81807d, rVarC, mVar);
                            b0 b0Var = b0.f22601a;
                            mVar.C(675564872);
                            i18 = 0;
                            for (Object obj5 : h0.Q(fVarJ, 2)) {
                                i19 = i18 + 1;
                                if (i18 >= 0) {
                                    x.q();
                                    throw th3;
                                }
                                List list = (List) obj5;
                                if (i19 * 2 >= fVarJ.size()) {
                                    f14 = 0;
                                    g6.f.a aVar3 = g6.f.f75994b;
                                } else {
                                    d92.b.f58623a.getClass();
                                    d92.b.f58625c.getClass();
                                    f14 = j92.b.f97899b.f97920e;
                                }
                                x0.f111346a.e(c2.l.C(x2.f(r.S, 1.0f), 0.0f, 0.0f, 0.0f, f14, 7), z3.f.c(771803400, new o72.b(i15, kVar7, list), mVar), mVar, (x0.f111348c << 6) | 48, 0);
                                i18 = i19;
                            }
                            mVar.f();
                            mVar.y();
                            x1 x1Var2 = p3.n.f135158a;
                            break;
                            break;
                        case 3:
                        case 4:
                            i27 = R.string.lbl_total_distance;
                            string = context.getString(i27);
                            string.getClass();
                            switch (iArr[kVar7.ordinal()]) {
                                case 10:
                                case 11:
                                case 12:
                                case 13:
                                case 14:
                                case 15:
                                case 16:
                                case 17:
                                case 19:
                                case 20:
                                case 21:
                                    strA = oi0.c.A(context, new wp.b(0), string);
                                    break;
                                case 18:
                                default:
                                    strA = string;
                                    break;
                            }
                            o13.p pVar2 = new o13.p(string, strA);
                            str = (String) pVar2.f128594a;
                            str2 = (String) pVar2.f128595b;
                            z14 = this.f82633b;
                            z15 = this.f82634c;
                            if (d14 != null) {
                                th3 = null;
                                wp.c.a(arrayList, context, z14, z15, dValueOf, str, str2, kVar7);
                            } else {
                                th3 = null;
                            }
                            Double d18 = fVar.f198620c;
                            kVar = fVar.f198621d;
                            if (kVar == null) {
                                kVar2 = kVar7;
                            } else {
                                kVar2 = kVar;
                            }
                            i14 = iArr[kVar2.ordinal()];
                            i15 = 10;
                            if (i14 != 10) {
                                string2 = context.getString(R.string.gaming_avg_daily_win_rate);
                                string2.getClass();
                            } else if (i14 != 14) {
                                string2 = context.getString(R.string.allday_stress_average_daily_stress);
                                string2.getClass();
                            } else if (i14 != 18) {
                                string2 = context.getString(R.string.common_lbl_avg_daily_total);
                                string2.getClass();
                            } else if (i14 != 21) {
                                string2 = context.getString(R.string.common_lbl_avg_daily);
                                string2.getClass();
                            } else {
                                string2 = context.getString(R.string.lbl_avg_pace);
                                string2.getClass();
                            }
                            String string8 = string2.toString();
                            wp.c.a(arrayList, context, z14, z15, d18, string8, oi0.c.A(context, new wl.a(23), string8), kVar2);
                            Double d19 = fVar.f198622e;
                            kVar3 = fVar.f198623f;
                            if (kVar3 == null) {
                                kVar4 = kVar7;
                            } else {
                                kVar4 = kVar3;
                            }
                            i16 = iArr[kVar4.ordinal()];
                            if (i16 != 10) {
                                string3 = context.getString(R.string.gaming_avg_weekly_win_rate);
                                string3.getClass();
                            } else if (i16 != 14) {
                                string3 = context.getString(R.string.allday_stress_average_weekly_stress);
                                string3.getClass();
                            } else if (i16 != 18) {
                                string3 = context.getString(R.string.lbl_avg_weekly_with_suffix, context.getString(R.string.lbl_total));
                                string3.getClass();
                            } else if (i16 != 21) {
                                string3 = context.getString(R.string.lbl_weekly_average);
                                string3.getClass();
                            } else {
                                string3 = context.getString(R.string.lbl_avg_pace);
                                string3.getClass();
                            }
                            String string9 = string3.toString();
                            wp.c.a(arrayList, context, z14, z15, d19, string9, oi0.c.A(context, new wl.a(28), string9), kVar4);
                            Double d110 = fVar.f198624g;
                            kVar5 = fVar.f198625h;
                            if (kVar5 == null) {
                                kVar6 = kVar7;
                            } else {
                                kVar6 = kVar5;
                            }
                            i17 = iArr[kVar6.ordinal()];
                            if (i17 != 10) {
                                string4 = context.getString(R.string.lbl_avg_monthly_with_suffix, context.getString(R.string.lbl_win_rate));
                                string4.getClass();
                            } else if (i17 != 14) {
                                string4 = context.getString(R.string.lbl_avg_monthly_with_suffix, context.getString(R.string.title_stress));
                                string4.getClass();
                            } else if (i17 != 18) {
                                string4 = context.getString(R.string.lbl_avg_monthly_with_suffix, context.getString(r17));
                                string4.getClass();
                            } else if (i17 != 21) {
                                string4 = context.getString(R.string.lbl_average_monthly);
                                string4.getClass();
                            } else {
                                string4 = context.getString(R.string.lbl_avg_pace);
                                string4.getClass();
                            }
                            String string10 = string4.toString();
                            wp.c.a(arrayList, context, z14, z15, d110, string10, oi0.c.A(context, new wl.a(29), string10), kVar6);
                            fVarJ = i53.a.j(arrayList);
                            r rVarF2 = x2.f(r.S, 1.0f);
                            c2.j.f22691a.getClass();
                            c2.j.k kVar9 = c2.j.f22694d;
                            h4.d.f81522a.getClass();
                            zVarA = y.a(kVar9, h4.d.a.f81536n, mVar, 0);
                            iHashCode = Long.hashCode(mVar.getU());
                            i2VarX = mVar.x();
                            rVarC = h4.k.c(rVarF2, mVar);
                            h5.g.V.getClass();
                            aVar = h5.g.a.f81805b;
                            if (mVar.F() != null) {
                                p0.l();
                                throw th3;
                            }
                            mVar.z();
                            if (mVar.getT()) {
                                mVar.M(aVar);
                            } else {
                                mVar.c();
                            }
                            b4.c(h5.g.a.f81810g, zVarA, mVar);
                            b4.c(h5.g.a.f81809f, i2VarX, mVar);
                            bVar = h5.g.a.f81813j;
                            if (mVar.getT()) {
                                v.h.z(iHashCode, mVar, iHashCode, bVar);
                            } else {
                                v.h.z(iHashCode, mVar, iHashCode, bVar);
                            }
                            b4.c(h5.g.a.f81807d, rVarC, mVar);
                            b0 b0Var2 = b0.f22601a;
                            mVar.C(675564872);
                            i18 = 0;
                            while (r3.hasNext()) {
                                i19 = i18 + 1;
                                if (i18 >= 0) {
                                    x.q();
                                    throw th3;
                                }
                                List list2 = (List) obj5;
                                if (i19 * 2 >= fVarJ.size()) {
                                    f14 = 0;
                                    g6.f.a aVar4 = g6.f.f75994b;
                                } else {
                                    d92.b.f58623a.getClass();
                                    d92.b.f58625c.getClass();
                                    f14 = j92.b.f97899b.f97920e;
                                }
                                x0.f111346a.e(c2.l.C(x2.f(r.S, 1.0f), 0.0f, 0.0f, 0.0f, f14, 7), z3.f.c(771803400, new o72.b(i15, kVar7, list2), mVar), mVar, (x0.f111348c << 6) | 48, 0);
                                i18 = i19;
                            }
                            mVar.f();
                            mVar.y();
                            x1 x1Var3 = p3.n.f135158a;
                            break;
                            break;
                        case 5:
                            i27 = R.string.activities_total_ascent;
                            string = context.getString(i27);
                            string.getClass();
                            switch (iArr[kVar7.ordinal()]) {
                                case 10:
                                case 11:
                                case 12:
                                case 13:
                                case 14:
                                case 15:
                                case 16:
                                case 17:
                                case 19:
                                case 20:
                                case 21:
                                    strA = oi0.c.A(context, new wp.b(0), string);
                                    break;
                                case 18:
                                default:
                                    strA = string;
                                    break;
                            }
                            o13.p pVar3 = new o13.p(string, strA);
                            str = (String) pVar3.f128594a;
                            str2 = (String) pVar3.f128595b;
                            z14 = this.f82633b;
                            z15 = this.f82634c;
                            if (d14 != null) {
                                th3 = null;
                                wp.c.a(arrayList, context, z14, z15, dValueOf, str, str2, kVar7);
                            } else {
                                th3 = null;
                            }
                            Double d111 = fVar.f198620c;
                            kVar = fVar.f198621d;
                            if (kVar == null) {
                                kVar2 = kVar7;
                            } else {
                                kVar2 = kVar;
                            }
                            i14 = iArr[kVar2.ordinal()];
                            i15 = 10;
                            if (i14 != 10) {
                                string2 = context.getString(R.string.gaming_avg_daily_win_rate);
                                string2.getClass();
                            } else if (i14 != 14) {
                                string2 = context.getString(R.string.allday_stress_average_daily_stress);
                                string2.getClass();
                            } else if (i14 != 18) {
                                string2 = context.getString(R.string.common_lbl_avg_daily_total);
                                string2.getClass();
                            } else if (i14 != 21) {
                                string2 = context.getString(R.string.common_lbl_avg_daily);
                                string2.getClass();
                            } else {
                                string2 = context.getString(R.string.lbl_avg_pace);
                                string2.getClass();
                            }
                            String string11 = string2.toString();
                            wp.c.a(arrayList, context, z14, z15, d111, string11, oi0.c.A(context, new wl.a(23), string11), kVar2);
                            Double d112 = fVar.f198622e;
                            kVar3 = fVar.f198623f;
                            if (kVar3 == null) {
                                kVar4 = kVar7;
                            } else {
                                kVar4 = kVar3;
                            }
                            i16 = iArr[kVar4.ordinal()];
                            if (i16 != 10) {
                                string3 = context.getString(R.string.gaming_avg_weekly_win_rate);
                                string3.getClass();
                            } else if (i16 != 14) {
                                string3 = context.getString(R.string.allday_stress_average_weekly_stress);
                                string3.getClass();
                            } else if (i16 != 18) {
                                string3 = context.getString(R.string.lbl_avg_weekly_with_suffix, context.getString(R.string.lbl_total));
                                string3.getClass();
                            } else if (i16 != 21) {
                                string3 = context.getString(R.string.lbl_weekly_average);
                                string3.getClass();
                            } else {
                                string3 = context.getString(R.string.lbl_avg_pace);
                                string3.getClass();
                            }
                            String string12 = string3.toString();
                            wp.c.a(arrayList, context, z14, z15, d112, string12, oi0.c.A(context, new wl.a(28), string12), kVar4);
                            Double d113 = fVar.f198624g;
                            kVar5 = fVar.f198625h;
                            if (kVar5 == null) {
                                kVar6 = kVar7;
                            } else {
                                kVar6 = kVar5;
                            }
                            i17 = iArr[kVar6.ordinal()];
                            if (i17 != 10) {
                                string4 = context.getString(R.string.lbl_avg_monthly_with_suffix, context.getString(R.string.lbl_win_rate));
                                string4.getClass();
                            } else if (i17 != 14) {
                                string4 = context.getString(R.string.lbl_avg_monthly_with_suffix, context.getString(R.string.title_stress));
                                string4.getClass();
                            } else if (i17 != 18) {
                                string4 = context.getString(R.string.lbl_avg_monthly_with_suffix, context.getString(r17));
                                string4.getClass();
                            } else if (i17 != 21) {
                                string4 = context.getString(R.string.lbl_average_monthly);
                                string4.getClass();
                            } else {
                                string4 = context.getString(R.string.lbl_avg_pace);
                                string4.getClass();
                            }
                            String string13 = string4.toString();
                            wp.c.a(arrayList, context, z14, z15, d113, string13, oi0.c.A(context, new wl.a(29), string13), kVar6);
                            fVarJ = i53.a.j(arrayList);
                            r rVarF3 = x2.f(r.S, 1.0f);
                            c2.j.f22691a.getClass();
                            c2.j.k kVar10 = c2.j.f22694d;
                            h4.d.f81522a.getClass();
                            zVarA = y.a(kVar10, h4.d.a.f81536n, mVar, 0);
                            iHashCode = Long.hashCode(mVar.getU());
                            i2VarX = mVar.x();
                            rVarC = h4.k.c(rVarF3, mVar);
                            h5.g.V.getClass();
                            aVar = h5.g.a.f81805b;
                            if (mVar.F() != null) {
                                p0.l();
                                throw th3;
                            }
                            mVar.z();
                            if (mVar.getT()) {
                                mVar.M(aVar);
                            } else {
                                mVar.c();
                            }
                            b4.c(h5.g.a.f81810g, zVarA, mVar);
                            b4.c(h5.g.a.f81809f, i2VarX, mVar);
                            bVar = h5.g.a.f81813j;
                            if (mVar.getT()) {
                                v.h.z(iHashCode, mVar, iHashCode, bVar);
                            } else {
                                v.h.z(iHashCode, mVar, iHashCode, bVar);
                            }
                            b4.c(h5.g.a.f81807d, rVarC, mVar);
                            b0 b0Var3 = b0.f22601a;
                            mVar.C(675564872);
                            i18 = 0;
                            while (r3.hasNext()) {
                                i19 = i18 + 1;
                                if (i18 >= 0) {
                                    x.q();
                                    throw th3;
                                }
                                List list3 = (List) obj5;
                                if (i19 * 2 >= fVarJ.size()) {
                                    f14 = 0;
                                    g6.f.a aVar5 = g6.f.f75994b;
                                } else {
                                    d92.b.f58623a.getClass();
                                    d92.b.f58625c.getClass();
                                    f14 = j92.b.f97899b.f97920e;
                                }
                                x0.f111346a.e(c2.l.C(x2.f(r.S, 1.0f), 0.0f, 0.0f, 0.0f, f14, 7), z3.f.c(771803400, new o72.b(i15, kVar7, list3), mVar), mVar, (x0.f111348c << 6) | 48, 0);
                                i18 = i19;
                            }
                            mVar.f();
                            mVar.y();
                            x1 x1Var4 = p3.n.f135158a;
                            break;
                            break;
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                            i27 = R.string.calories_total_label;
                            string = context.getString(i27);
                            string.getClass();
                            switch (iArr[kVar7.ordinal()]) {
                                case 10:
                                case 11:
                                case 12:
                                case 13:
                                case 14:
                                case 15:
                                case 16:
                                case 17:
                                case 19:
                                case 20:
                                case 21:
                                    strA = oi0.c.A(context, new wp.b(0), string);
                                    break;
                                case 18:
                                default:
                                    strA = string;
                                    break;
                            }
                            o13.p pVar4 = new o13.p(string, strA);
                            str = (String) pVar4.f128594a;
                            str2 = (String) pVar4.f128595b;
                            z14 = this.f82633b;
                            z15 = this.f82634c;
                            if (d14 != null) {
                                th3 = null;
                                wp.c.a(arrayList, context, z14, z15, dValueOf, str, str2, kVar7);
                            } else {
                                th3 = null;
                            }
                            Double d114 = fVar.f198620c;
                            kVar = fVar.f198621d;
                            if (kVar == null) {
                                kVar2 = kVar7;
                            } else {
                                kVar2 = kVar;
                            }
                            i14 = iArr[kVar2.ordinal()];
                            i15 = 10;
                            if (i14 != 10) {
                                string2 = context.getString(R.string.gaming_avg_daily_win_rate);
                                string2.getClass();
                            } else if (i14 != 14) {
                                string2 = context.getString(R.string.allday_stress_average_daily_stress);
                                string2.getClass();
                            } else if (i14 != 18) {
                                string2 = context.getString(R.string.common_lbl_avg_daily_total);
                                string2.getClass();
                            } else if (i14 != 21) {
                                string2 = context.getString(R.string.common_lbl_avg_daily);
                                string2.getClass();
                            } else {
                                string2 = context.getString(R.string.lbl_avg_pace);
                                string2.getClass();
                            }
                            String string14 = string2.toString();
                            wp.c.a(arrayList, context, z14, z15, d114, string14, oi0.c.A(context, new wl.a(23), string14), kVar2);
                            Double d115 = fVar.f198622e;
                            kVar3 = fVar.f198623f;
                            if (kVar3 == null) {
                                kVar4 = kVar7;
                            } else {
                                kVar4 = kVar3;
                            }
                            i16 = iArr[kVar4.ordinal()];
                            if (i16 != 10) {
                                string3 = context.getString(R.string.gaming_avg_weekly_win_rate);
                                string3.getClass();
                            } else if (i16 != 14) {
                                string3 = context.getString(R.string.allday_stress_average_weekly_stress);
                                string3.getClass();
                            } else if (i16 != 18) {
                                string3 = context.getString(R.string.lbl_avg_weekly_with_suffix, context.getString(R.string.lbl_total));
                                string3.getClass();
                            } else if (i16 != 21) {
                                string3 = context.getString(R.string.lbl_weekly_average);
                                string3.getClass();
                            } else {
                                string3 = context.getString(R.string.lbl_avg_pace);
                                string3.getClass();
                            }
                            String string15 = string3.toString();
                            wp.c.a(arrayList, context, z14, z15, d115, string15, oi0.c.A(context, new wl.a(28), string15), kVar4);
                            Double d116 = fVar.f198624g;
                            kVar5 = fVar.f198625h;
                            if (kVar5 == null) {
                                kVar6 = kVar7;
                            } else {
                                kVar6 = kVar5;
                            }
                            i17 = iArr[kVar6.ordinal()];
                            if (i17 != 10) {
                                string4 = context.getString(R.string.lbl_avg_monthly_with_suffix, context.getString(R.string.lbl_win_rate));
                                string4.getClass();
                            } else if (i17 != 14) {
                                string4 = context.getString(R.string.lbl_avg_monthly_with_suffix, context.getString(R.string.title_stress));
                                string4.getClass();
                            } else if (i17 != 18) {
                                string4 = context.getString(R.string.lbl_avg_monthly_with_suffix, context.getString(r17));
                                string4.getClass();
                            } else if (i17 != 21) {
                                string4 = context.getString(R.string.lbl_average_monthly);
                                string4.getClass();
                            } else {
                                string4 = context.getString(R.string.lbl_avg_pace);
                                string4.getClass();
                            }
                            String string16 = string4.toString();
                            wp.c.a(arrayList, context, z14, z15, d116, string16, oi0.c.A(context, new wl.a(29), string16), kVar6);
                            fVarJ = i53.a.j(arrayList);
                            r rVarF4 = x2.f(r.S, 1.0f);
                            c2.j.f22691a.getClass();
                            c2.j.k kVar11 = c2.j.f22694d;
                            h4.d.f81522a.getClass();
                            zVarA = y.a(kVar11, h4.d.a.f81536n, mVar, 0);
                            iHashCode = Long.hashCode(mVar.getU());
                            i2VarX = mVar.x();
                            rVarC = h4.k.c(rVarF4, mVar);
                            h5.g.V.getClass();
                            aVar = h5.g.a.f81805b;
                            if (mVar.F() != null) {
                                p0.l();
                                throw th3;
                            }
                            mVar.z();
                            if (mVar.getT()) {
                                mVar.M(aVar);
                            } else {
                                mVar.c();
                            }
                            b4.c(h5.g.a.f81810g, zVarA, mVar);
                            b4.c(h5.g.a.f81809f, i2VarX, mVar);
                            bVar = h5.g.a.f81813j;
                            if (mVar.getT()) {
                                v.h.z(iHashCode, mVar, iHashCode, bVar);
                            } else {
                                v.h.z(iHashCode, mVar, iHashCode, bVar);
                            }
                            b4.c(h5.g.a.f81807d, rVarC, mVar);
                            b0 b0Var4 = b0.f22601a;
                            mVar.C(675564872);
                            i18 = 0;
                            while (r3.hasNext()) {
                                i19 = i18 + 1;
                                if (i18 >= 0) {
                                    x.q();
                                    throw th3;
                                }
                                List list4 = (List) obj5;
                                if (i19 * 2 >= fVarJ.size()) {
                                    f14 = 0;
                                    g6.f.a aVar6 = g6.f.f75994b;
                                } else {
                                    d92.b.f58623a.getClass();
                                    d92.b.f58625c.getClass();
                                    f14 = j92.b.f97899b.f97920e;
                                }
                                x0.f111346a.e(c2.l.C(x2.f(r.S, 1.0f), 0.0f, 0.0f, 0.0f, f14, 7), z3.f.c(771803400, new o72.b(i15, kVar7, list4), mVar), mVar, (x0.f111348c << 6) | 48, 0);
                                i18 = i19;
                            }
                            mVar.f();
                            mVar.y();
                            x1 x1Var5 = p3.n.f135158a;
                            break;
                            break;
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                            i27 = R.string.gaming_avg_win_rate;
                            string = context.getString(i27);
                            string.getClass();
                            switch (iArr[kVar7.ordinal()]) {
                                case 10:
                                case 11:
                                case 12:
                                case 13:
                                case 14:
                                case 15:
                                case 16:
                                case 17:
                                case 19:
                                case 20:
                                case 21:
                                    strA = oi0.c.A(context, new wp.b(0), string);
                                    break;
                                case 18:
                                default:
                                    strA = string;
                                    break;
                            }
                            o13.p pVar5 = new o13.p(string, strA);
                            str = (String) pVar5.f128594a;
                            str2 = (String) pVar5.f128595b;
                            z14 = this.f82633b;
                            z15 = this.f82634c;
                            if (d14 != null) {
                                th3 = null;
                                wp.c.a(arrayList, context, z14, z15, dValueOf, str, str2, kVar7);
                            } else {
                                th3 = null;
                            }
                            Double d117 = fVar.f198620c;
                            kVar = fVar.f198621d;
                            if (kVar == null) {
                                kVar2 = kVar7;
                            } else {
                                kVar2 = kVar;
                            }
                            i14 = iArr[kVar2.ordinal()];
                            i15 = 10;
                            if (i14 != 10) {
                                string2 = context.getString(R.string.gaming_avg_daily_win_rate);
                                string2.getClass();
                            } else if (i14 != 14) {
                                string2 = context.getString(R.string.allday_stress_average_daily_stress);
                                string2.getClass();
                            } else if (i14 != 18) {
                                string2 = context.getString(R.string.common_lbl_avg_daily_total);
                                string2.getClass();
                            } else if (i14 != 21) {
                                string2 = context.getString(R.string.common_lbl_avg_daily);
                                string2.getClass();
                            } else {
                                string2 = context.getString(R.string.lbl_avg_pace);
                                string2.getClass();
                            }
                            String string17 = string2.toString();
                            wp.c.a(arrayList, context, z14, z15, d117, string17, oi0.c.A(context, new wl.a(23), string17), kVar2);
                            Double d118 = fVar.f198622e;
                            kVar3 = fVar.f198623f;
                            if (kVar3 == null) {
                                kVar4 = kVar7;
                            } else {
                                kVar4 = kVar3;
                            }
                            i16 = iArr[kVar4.ordinal()];
                            if (i16 != 10) {
                                string3 = context.getString(R.string.gaming_avg_weekly_win_rate);
                                string3.getClass();
                            } else if (i16 != 14) {
                                string3 = context.getString(R.string.allday_stress_average_weekly_stress);
                                string3.getClass();
                            } else if (i16 != 18) {
                                string3 = context.getString(R.string.lbl_avg_weekly_with_suffix, context.getString(R.string.lbl_total));
                                string3.getClass();
                            } else if (i16 != 21) {
                                string3 = context.getString(R.string.lbl_weekly_average);
                                string3.getClass();
                            } else {
                                string3 = context.getString(R.string.lbl_avg_pace);
                                string3.getClass();
                            }
                            String string18 = string3.toString();
                            wp.c.a(arrayList, context, z14, z15, d118, string18, oi0.c.A(context, new wl.a(28), string18), kVar4);
                            Double d119 = fVar.f198624g;
                            kVar5 = fVar.f198625h;
                            if (kVar5 == null) {
                                kVar6 = kVar7;
                            } else {
                                kVar6 = kVar5;
                            }
                            i17 = iArr[kVar6.ordinal()];
                            if (i17 != 10) {
                                string4 = context.getString(R.string.lbl_avg_monthly_with_suffix, context.getString(R.string.lbl_win_rate));
                                string4.getClass();
                            } else if (i17 != 14) {
                                string4 = context.getString(R.string.lbl_avg_monthly_with_suffix, context.getString(R.string.title_stress));
                                string4.getClass();
                            } else if (i17 != 18) {
                                string4 = context.getString(R.string.lbl_avg_monthly_with_suffix, context.getString(r17));
                                string4.getClass();
                            } else if (i17 != 21) {
                                string4 = context.getString(R.string.lbl_average_monthly);
                                string4.getClass();
                            } else {
                                string4 = context.getString(R.string.lbl_avg_pace);
                                string4.getClass();
                            }
                            String string19 = string4.toString();
                            wp.c.a(arrayList, context, z14, z15, d119, string19, oi0.c.A(context, new wl.a(29), string19), kVar6);
                            fVarJ = i53.a.j(arrayList);
                            r rVarF5 = x2.f(r.S, 1.0f);
                            c2.j.f22691a.getClass();
                            c2.j.k kVar12 = c2.j.f22694d;
                            h4.d.f81522a.getClass();
                            zVarA = y.a(kVar12, h4.d.a.f81536n, mVar, 0);
                            iHashCode = Long.hashCode(mVar.getU());
                            i2VarX = mVar.x();
                            rVarC = h4.k.c(rVarF5, mVar);
                            h5.g.V.getClass();
                            aVar = h5.g.a.f81805b;
                            if (mVar.F() != null) {
                                p0.l();
                                throw th3;
                            }
                            mVar.z();
                            if (mVar.getT()) {
                                mVar.M(aVar);
                            } else {
                                mVar.c();
                            }
                            b4.c(h5.g.a.f81810g, zVarA, mVar);
                            b4.c(h5.g.a.f81809f, i2VarX, mVar);
                            bVar = h5.g.a.f81813j;
                            if (mVar.getT()) {
                                v.h.z(iHashCode, mVar, iHashCode, bVar);
                            } else {
                                v.h.z(iHashCode, mVar, iHashCode, bVar);
                            }
                            b4.c(h5.g.a.f81807d, rVarC, mVar);
                            b0 b0Var5 = b0.f22601a;
                            mVar.C(675564872);
                            i18 = 0;
                            while (r3.hasNext()) {
                                i19 = i18 + 1;
                                if (i18 >= 0) {
                                    x.q();
                                    throw th3;
                                }
                                List list5 = (List) obj5;
                                if (i19 * 2 >= fVarJ.size()) {
                                    f14 = 0;
                                    g6.f.a aVar7 = g6.f.f75994b;
                                } else {
                                    d92.b.f58623a.getClass();
                                    d92.b.f58625c.getClass();
                                    f14 = j92.b.f97899b.f97920e;
                                }
                                x0.f111346a.e(c2.l.C(x2.f(r.S, 1.0f), 0.0f, 0.0f, 0.0f, f14, 7), z3.f.c(771803400, new o72.b(i15, kVar7, list5), mVar), mVar, (x0.f111348c << 6) | 48, 0);
                                i18 = i19;
                            }
                            mVar.f();
                            mVar.y();
                            x1 x1Var6 = p3.n.f135158a;
                            break;
                            break;
                        case 14:
                        case 15:
                        case 16:
                        case 17:
                            i27 = R.string.lbl_stress_avg_short;
                            string = context.getString(i27);
                            string.getClass();
                            switch (iArr[kVar7.ordinal()]) {
                                case 10:
                                case 11:
                                case 12:
                                case 13:
                                case 14:
                                case 15:
                                case 16:
                                case 17:
                                case 19:
                                case 20:
                                case 21:
                                    strA = oi0.c.A(context, new wp.b(0), string);
                                    break;
                                case 18:
                                default:
                                    strA = string;
                                    break;
                            }
                            o13.p pVar6 = new o13.p(string, strA);
                            str = (String) pVar6.f128594a;
                            str2 = (String) pVar6.f128595b;
                            z14 = this.f82633b;
                            z15 = this.f82634c;
                            if (d14 != null) {
                                th3 = null;
                                wp.c.a(arrayList, context, z14, z15, dValueOf, str, str2, kVar7);
                            } else {
                                th3 = null;
                            }
                            Double d1110 = fVar.f198620c;
                            kVar = fVar.f198621d;
                            if (kVar == null) {
                                kVar2 = kVar7;
                            } else {
                                kVar2 = kVar;
                            }
                            i14 = iArr[kVar2.ordinal()];
                            i15 = 10;
                            if (i14 != 10) {
                                string2 = context.getString(R.string.gaming_avg_daily_win_rate);
                                string2.getClass();
                            } else if (i14 != 14) {
                                string2 = context.getString(R.string.allday_stress_average_daily_stress);
                                string2.getClass();
                            } else if (i14 != 18) {
                                string2 = context.getString(R.string.common_lbl_avg_daily_total);
                                string2.getClass();
                            } else if (i14 != 21) {
                                string2 = context.getString(R.string.common_lbl_avg_daily);
                                string2.getClass();
                            } else {
                                string2 = context.getString(R.string.lbl_avg_pace);
                                string2.getClass();
                            }
                            String string110 = string2.toString();
                            wp.c.a(arrayList, context, z14, z15, d1110, string110, oi0.c.A(context, new wl.a(23), string110), kVar2);
                            Double d1111 = fVar.f198622e;
                            kVar3 = fVar.f198623f;
                            if (kVar3 == null) {
                                kVar4 = kVar7;
                            } else {
                                kVar4 = kVar3;
                            }
                            i16 = iArr[kVar4.ordinal()];
                            if (i16 != 10) {
                                string3 = context.getString(R.string.gaming_avg_weekly_win_rate);
                                string3.getClass();
                            } else if (i16 != 14) {
                                string3 = context.getString(R.string.allday_stress_average_weekly_stress);
                                string3.getClass();
                            } else if (i16 != 18) {
                                string3 = context.getString(R.string.lbl_avg_weekly_with_suffix, context.getString(R.string.lbl_total));
                                string3.getClass();
                            } else if (i16 != 21) {
                                string3 = context.getString(R.string.lbl_weekly_average);
                                string3.getClass();
                            } else {
                                string3 = context.getString(R.string.lbl_avg_pace);
                                string3.getClass();
                            }
                            String string111 = string3.toString();
                            wp.c.a(arrayList, context, z14, z15, d1111, string111, oi0.c.A(context, new wl.a(28), string111), kVar4);
                            Double d1112 = fVar.f198624g;
                            kVar5 = fVar.f198625h;
                            if (kVar5 == null) {
                                kVar6 = kVar7;
                            } else {
                                kVar6 = kVar5;
                            }
                            i17 = iArr[kVar6.ordinal()];
                            if (i17 != 10) {
                                string4 = context.getString(R.string.lbl_avg_monthly_with_suffix, context.getString(R.string.lbl_win_rate));
                                string4.getClass();
                            } else if (i17 != 14) {
                                string4 = context.getString(R.string.lbl_avg_monthly_with_suffix, context.getString(R.string.title_stress));
                                string4.getClass();
                            } else if (i17 != 18) {
                                string4 = context.getString(R.string.lbl_avg_monthly_with_suffix, context.getString(r17));
                                string4.getClass();
                            } else if (i17 != 21) {
                                string4 = context.getString(R.string.lbl_average_monthly);
                                string4.getClass();
                            } else {
                                string4 = context.getString(R.string.lbl_avg_pace);
                                string4.getClass();
                            }
                            String string112 = string4.toString();
                            wp.c.a(arrayList, context, z14, z15, d1112, string112, oi0.c.A(context, new wl.a(29), string112), kVar6);
                            fVarJ = i53.a.j(arrayList);
                            r rVarF6 = x2.f(r.S, 1.0f);
                            c2.j.f22691a.getClass();
                            c2.j.k kVar13 = c2.j.f22694d;
                            h4.d.f81522a.getClass();
                            zVarA = y.a(kVar13, h4.d.a.f81536n, mVar, 0);
                            iHashCode = Long.hashCode(mVar.getU());
                            i2VarX = mVar.x();
                            rVarC = h4.k.c(rVarF6, mVar);
                            h5.g.V.getClass();
                            aVar = h5.g.a.f81805b;
                            if (mVar.F() != null) {
                                p0.l();
                                throw th3;
                            }
                            mVar.z();
                            if (mVar.getT()) {
                                mVar.M(aVar);
                            } else {
                                mVar.c();
                            }
                            b4.c(h5.g.a.f81810g, zVarA, mVar);
                            b4.c(h5.g.a.f81809f, i2VarX, mVar);
                            bVar = h5.g.a.f81813j;
                            if (mVar.getT()) {
                                v.h.z(iHashCode, mVar, iHashCode, bVar);
                            } else {
                                v.h.z(iHashCode, mVar, iHashCode, bVar);
                            }
                            b4.c(h5.g.a.f81807d, rVarC, mVar);
                            b0 b0Var6 = b0.f22601a;
                            mVar.C(675564872);
                            i18 = 0;
                            while (r3.hasNext()) {
                                i19 = i18 + 1;
                                if (i18 >= 0) {
                                    x.q();
                                    throw th3;
                                }
                                List list6 = (List) obj5;
                                if (i19 * 2 >= fVarJ.size()) {
                                    f14 = 0;
                                    g6.f.a aVar8 = g6.f.f75994b;
                                } else {
                                    d92.b.f58623a.getClass();
                                    d92.b.f58625c.getClass();
                                    f14 = j92.b.f97899b.f97920e;
                                }
                                x0.f111346a.e(c2.l.C(x2.f(r.S, 1.0f), 0.0f, 0.0f, 0.0f, f14, 7), z3.f.c(771803400, new o72.b(i15, kVar7, list6), mVar), mVar, (x0.f111348c << 6) | 48, 0);
                                i18 = i19;
                            }
                            mVar.f();
                            mVar.y();
                            x1 x1Var7 = p3.n.f135158a;
                            break;
                            break;
                        case 18:
                            i27 = R.string.lbl_total;
                            string = context.getString(i27);
                            string.getClass();
                            switch (iArr[kVar7.ordinal()]) {
                                case 10:
                                case 11:
                                case 12:
                                case 13:
                                case 14:
                                case 15:
                                case 16:
                                case 17:
                                case 19:
                                case 20:
                                case 21:
                                    strA = oi0.c.A(context, new wp.b(0), string);
                                    break;
                                case 18:
                                default:
                                    strA = string;
                                    break;
                            }
                            o13.p pVar7 = new o13.p(string, strA);
                            str = (String) pVar7.f128594a;
                            str2 = (String) pVar7.f128595b;
                            z14 = this.f82633b;
                            z15 = this.f82634c;
                            if (d14 != null) {
                                th3 = null;
                                wp.c.a(arrayList, context, z14, z15, dValueOf, str, str2, kVar7);
                            } else {
                                th3 = null;
                            }
                            Double d1113 = fVar.f198620c;
                            kVar = fVar.f198621d;
                            if (kVar == null) {
                                kVar2 = kVar7;
                            } else {
                                kVar2 = kVar;
                            }
                            i14 = iArr[kVar2.ordinal()];
                            i15 = 10;
                            if (i14 != 10) {
                                string2 = context.getString(R.string.gaming_avg_daily_win_rate);
                                string2.getClass();
                            } else if (i14 != 14) {
                                string2 = context.getString(R.string.allday_stress_average_daily_stress);
                                string2.getClass();
                            } else if (i14 != 18) {
                                string2 = context.getString(R.string.common_lbl_avg_daily_total);
                                string2.getClass();
                            } else if (i14 != 21) {
                                string2 = context.getString(R.string.common_lbl_avg_daily);
                                string2.getClass();
                            } else {
                                string2 = context.getString(R.string.lbl_avg_pace);
                                string2.getClass();
                            }
                            String string113 = string2.toString();
                            wp.c.a(arrayList, context, z14, z15, d1113, string113, oi0.c.A(context, new wl.a(23), string113), kVar2);
                            Double d1114 = fVar.f198622e;
                            kVar3 = fVar.f198623f;
                            if (kVar3 == null) {
                                kVar4 = kVar7;
                            } else {
                                kVar4 = kVar3;
                            }
                            i16 = iArr[kVar4.ordinal()];
                            if (i16 != 10) {
                                string3 = context.getString(R.string.gaming_avg_weekly_win_rate);
                                string3.getClass();
                            } else if (i16 != 14) {
                                string3 = context.getString(R.string.allday_stress_average_weekly_stress);
                                string3.getClass();
                            } else if (i16 != 18) {
                                string3 = context.getString(R.string.lbl_avg_weekly_with_suffix, context.getString(R.string.lbl_total));
                                string3.getClass();
                            } else if (i16 != 21) {
                                string3 = context.getString(R.string.lbl_weekly_average);
                                string3.getClass();
                            } else {
                                string3 = context.getString(R.string.lbl_avg_pace);
                                string3.getClass();
                            }
                            String string114 = string3.toString();
                            wp.c.a(arrayList, context, z14, z15, d1114, string114, oi0.c.A(context, new wl.a(28), string114), kVar4);
                            Double d1115 = fVar.f198624g;
                            kVar5 = fVar.f198625h;
                            if (kVar5 == null) {
                                kVar6 = kVar7;
                            } else {
                                kVar6 = kVar5;
                            }
                            i17 = iArr[kVar6.ordinal()];
                            if (i17 != 10) {
                                string4 = context.getString(R.string.lbl_avg_monthly_with_suffix, context.getString(R.string.lbl_win_rate));
                                string4.getClass();
                            } else if (i17 != 14) {
                                string4 = context.getString(R.string.lbl_avg_monthly_with_suffix, context.getString(R.string.title_stress));
                                string4.getClass();
                            } else if (i17 != 18) {
                                string4 = context.getString(R.string.lbl_avg_monthly_with_suffix, context.getString(r17));
                                string4.getClass();
                            } else if (i17 != 21) {
                                string4 = context.getString(R.string.lbl_average_monthly);
                                string4.getClass();
                            } else {
                                string4 = context.getString(R.string.lbl_avg_pace);
                                string4.getClass();
                            }
                            String string115 = string4.toString();
                            wp.c.a(arrayList, context, z14, z15, d1115, string115, oi0.c.A(context, new wl.a(29), string115), kVar6);
                            fVarJ = i53.a.j(arrayList);
                            r rVarF7 = x2.f(r.S, 1.0f);
                            c2.j.f22691a.getClass();
                            c2.j.k kVar14 = c2.j.f22694d;
                            h4.d.f81522a.getClass();
                            zVarA = y.a(kVar14, h4.d.a.f81536n, mVar, 0);
                            iHashCode = Long.hashCode(mVar.getU());
                            i2VarX = mVar.x();
                            rVarC = h4.k.c(rVarF7, mVar);
                            h5.g.V.getClass();
                            aVar = h5.g.a.f81805b;
                            if (mVar.F() != null) {
                                p0.l();
                                throw th3;
                            }
                            mVar.z();
                            if (mVar.getT()) {
                                mVar.M(aVar);
                            } else {
                                mVar.c();
                            }
                            b4.c(h5.g.a.f81810g, zVarA, mVar);
                            b4.c(h5.g.a.f81809f, i2VarX, mVar);
                            bVar = h5.g.a.f81813j;
                            if (mVar.getT()) {
                                v.h.z(iHashCode, mVar, iHashCode, bVar);
                            } else {
                                v.h.z(iHashCode, mVar, iHashCode, bVar);
                            }
                            b4.c(h5.g.a.f81807d, rVarC, mVar);
                            b0 b0Var7 = b0.f22601a;
                            mVar.C(675564872);
                            i18 = 0;
                            while (r3.hasNext()) {
                                i19 = i18 + 1;
                                if (i18 >= 0) {
                                    x.q();
                                    throw th3;
                                }
                                List list7 = (List) obj5;
                                if (i19 * 2 >= fVarJ.size()) {
                                    f14 = 0;
                                    g6.f.a aVar9 = g6.f.f75994b;
                                } else {
                                    d92.b.f58623a.getClass();
                                    d92.b.f58625c.getClass();
                                    f14 = j92.b.f97899b.f97920e;
                                }
                                x0.f111346a.e(c2.l.C(x2.f(r.S, 1.0f), 0.0f, 0.0f, 0.0f, f14, 7), z3.f.c(771803400, new o72.b(i15, kVar7, list7), mVar), mVar, (x0.f111348c << 6) | 48, 0);
                                i18 = i19;
                            }
                            mVar.f();
                            mVar.y();
                            x1 x1Var8 = p3.n.f135158a;
                            break;
                            break;
                        case 19:
                        case 20:
                        case 21:
                            i27 = R.string.lbl_avg_pack_weight_abbreviated;
                            string = context.getString(i27);
                            string.getClass();
                            switch (iArr[kVar7.ordinal()]) {
                                case 10:
                                case 11:
                                case 12:
                                case 13:
                                case 14:
                                case 15:
                                case 16:
                                case 17:
                                case 19:
                                case 20:
                                case 21:
                                    strA = oi0.c.A(context, new wp.b(0), string);
                                    break;
                                case 18:
                                default:
                                    strA = string;
                                    break;
                            }
                            o13.p pVar8 = new o13.p(string, strA);
                            str = (String) pVar8.f128594a;
                            str2 = (String) pVar8.f128595b;
                            z14 = this.f82633b;
                            z15 = this.f82634c;
                            if (d14 != null) {
                                th3 = null;
                                wp.c.a(arrayList, context, z14, z15, dValueOf, str, str2, kVar7);
                            } else {
                                th3 = null;
                            }
                            Double d1116 = fVar.f198620c;
                            kVar = fVar.f198621d;
                            if (kVar == null) {
                                kVar2 = kVar7;
                            } else {
                                kVar2 = kVar;
                            }
                            i14 = iArr[kVar2.ordinal()];
                            i15 = 10;
                            if (i14 != 10) {
                                string2 = context.getString(R.string.gaming_avg_daily_win_rate);
                                string2.getClass();
                            } else if (i14 != 14) {
                                string2 = context.getString(R.string.allday_stress_average_daily_stress);
                                string2.getClass();
                            } else if (i14 != 18) {
                                string2 = context.getString(R.string.common_lbl_avg_daily_total);
                                string2.getClass();
                            } else if (i14 != 21) {
                                string2 = context.getString(R.string.common_lbl_avg_daily);
                                string2.getClass();
                            } else {
                                string2 = context.getString(R.string.lbl_avg_pace);
                                string2.getClass();
                            }
                            String string116 = string2.toString();
                            wp.c.a(arrayList, context, z14, z15, d1116, string116, oi0.c.A(context, new wl.a(23), string116), kVar2);
                            Double d1117 = fVar.f198622e;
                            kVar3 = fVar.f198623f;
                            if (kVar3 == null) {
                                kVar4 = kVar7;
                            } else {
                                kVar4 = kVar3;
                            }
                            i16 = iArr[kVar4.ordinal()];
                            if (i16 != 10) {
                                string3 = context.getString(R.string.gaming_avg_weekly_win_rate);
                                string3.getClass();
                            } else if (i16 != 14) {
                                string3 = context.getString(R.string.allday_stress_average_weekly_stress);
                                string3.getClass();
                            } else if (i16 != 18) {
                                string3 = context.getString(R.string.lbl_avg_weekly_with_suffix, context.getString(R.string.lbl_total));
                                string3.getClass();
                            } else if (i16 != 21) {
                                string3 = context.getString(R.string.lbl_weekly_average);
                                string3.getClass();
                            } else {
                                string3 = context.getString(R.string.lbl_avg_pace);
                                string3.getClass();
                            }
                            String string117 = string3.toString();
                            wp.c.a(arrayList, context, z14, z15, d1117, string117, oi0.c.A(context, new wl.a(28), string117), kVar4);
                            Double d1118 = fVar.f198624g;
                            kVar5 = fVar.f198625h;
                            if (kVar5 == null) {
                                kVar6 = kVar7;
                            } else {
                                kVar6 = kVar5;
                            }
                            i17 = iArr[kVar6.ordinal()];
                            if (i17 != 10) {
                                string4 = context.getString(R.string.lbl_avg_monthly_with_suffix, context.getString(R.string.lbl_win_rate));
                                string4.getClass();
                            } else if (i17 != 14) {
                                string4 = context.getString(R.string.lbl_avg_monthly_with_suffix, context.getString(R.string.title_stress));
                                string4.getClass();
                            } else if (i17 != 18) {
                                string4 = context.getString(R.string.lbl_avg_monthly_with_suffix, context.getString(r17));
                                string4.getClass();
                            } else if (i17 != 21) {
                                string4 = context.getString(R.string.lbl_average_monthly);
                                string4.getClass();
                            } else {
                                string4 = context.getString(R.string.lbl_avg_pace);
                                string4.getClass();
                            }
                            String string118 = string4.toString();
                            wp.c.a(arrayList, context, z14, z15, d1118, string118, oi0.c.A(context, new wl.a(29), string118), kVar6);
                            fVarJ = i53.a.j(arrayList);
                            r rVarF8 = x2.f(r.S, 1.0f);
                            c2.j.f22691a.getClass();
                            c2.j.k kVar15 = c2.j.f22694d;
                            h4.d.f81522a.getClass();
                            zVarA = y.a(kVar15, h4.d.a.f81536n, mVar, 0);
                            iHashCode = Long.hashCode(mVar.getU());
                            i2VarX = mVar.x();
                            rVarC = h4.k.c(rVarF8, mVar);
                            h5.g.V.getClass();
                            aVar = h5.g.a.f81805b;
                            if (mVar.F() != null) {
                                p0.l();
                                throw th3;
                            }
                            mVar.z();
                            if (mVar.getT()) {
                                mVar.M(aVar);
                            } else {
                                mVar.c();
                            }
                            b4.c(h5.g.a.f81810g, zVarA, mVar);
                            b4.c(h5.g.a.f81809f, i2VarX, mVar);
                            bVar = h5.g.a.f81813j;
                            if (mVar.getT()) {
                                v.h.z(iHashCode, mVar, iHashCode, bVar);
                            } else {
                                v.h.z(iHashCode, mVar, iHashCode, bVar);
                            }
                            b4.c(h5.g.a.f81807d, rVarC, mVar);
                            b0 b0Var8 = b0.f22601a;
                            mVar.C(675564872);
                            i18 = 0;
                            while (r3.hasNext()) {
                                i19 = i18 + 1;
                                if (i18 >= 0) {
                                    x.q();
                                    throw th3;
                                }
                                List list8 = (List) obj5;
                                if (i19 * 2 >= fVarJ.size()) {
                                    f14 = 0;
                                    g6.f.a aVar10 = g6.f.f75994b;
                                } else {
                                    d92.b.f58623a.getClass();
                                    d92.b.f58625c.getClass();
                                    f14 = j92.b.f97899b.f97920e;
                                }
                                x0.f111346a.e(c2.l.C(x2.f(r.S, 1.0f), 0.0f, 0.0f, 0.0f, f14, 7), z3.f.c(771803400, new o72.b(i15, kVar7, list8), mVar), mVar, (x0.f111348c << 6) | 48, 0);
                                i18 = i19;
                            }
                            mVar.f();
                            mVar.y();
                            x1 x1Var9 = p3.n.f135158a;
                            break;
                            break;
                        default:
                            u0.r();
                            return null;
                    }
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 7:
                ((Integer) obj2).getClass();
                rv1.g.a((Integer) obj4, (List) obj3, this.f82633b, this.f82634c, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                t82.d.a(this.f82633b, this.f82634c, (b92.a) obj4, (e23.a) obj3, (m) obj, p0.t(49));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ e(int i14, int i15, Object obj, o13.h hVar, boolean z14, boolean z15) {
        this.f82632a = i15;
        this.f82633b = z14;
        this.f82634c = z15;
        this.f82635d = obj;
        this.f82636e = hVar;
    }

    public /* synthetic */ e(Comparable comparable, boolean z14, boolean z15, o13.h hVar, int i14, int i15) {
        this.f82632a = i15;
        this.f82635d = comparable;
        this.f82633b = z14;
        this.f82634c = z15;
        this.f82636e = hVar;
    }

    public /* synthetic */ e(Object obj, Object obj2, boolean z14, boolean z15, int i14, int i15) {
        this.f82632a = i15;
        this.f82635d = obj;
        this.f82636e = obj2;
        this.f82633b = z14;
        this.f82634c = z15;
    }

    public /* synthetic */ e(y2 y2Var, boolean z14, r rVar, boolean z15, int i14) {
        this.f82632a = 3;
        this.f82635d = y2Var;
        this.f82633b = z14;
        this.f82636e = rVar;
        this.f82634c = z15;
    }

    public /* synthetic */ e(yp.f fVar, mp.k kVar, boolean z14, boolean z15) {
        this.f82632a = 6;
        this.f82635d = fVar;
        this.f82636e = kVar;
        this.f82633b = z14;
        this.f82634c = z15;
    }
}
