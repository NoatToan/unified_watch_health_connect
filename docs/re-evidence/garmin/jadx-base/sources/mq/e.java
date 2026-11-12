package mq;

import am.r1;
import am.z0;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.core.widget.NestedScrollView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.newmodel.h0;
import gg1.o0;
import i3.e5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import org.apache.commons.lang3.StringUtils;
import org.koin.java.KoinJavaComponent;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.j0;
import p13.w;
import p13.x;
import p13.y;
import ps.c0;
import ps.d0;
import ps.g0;
import ps.q1;
import ps.x0;
import ps.x1;
import qs.t;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u0001:\u0001\u0014BY\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lmq/e;", "", "Landroid/content/Context;", "mContext", "Lrs/b;", "mLapsData", "", "Lcom/garmin/android/apps/connectmobile/activities/newmodel/j;", "mActivityWorkouts", "Lps/c0;", "mConnectIqAppDtoList", "", "mUserWeight", "", "mPortrait", "hasFiveHz", "", "deviceName", "<init>", "(Landroid/content/Context;Lrs/b;Ljava/util/List;Ljava/util/List;DZZLjava/lang/String;)V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class e {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Logger f120159p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f120160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rs.b f120161b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<com.garmin.android.apps.connectmobile.activities.newmodel.j> f120162c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<c0> f120163d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final double f120164e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f120165f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ArrayList f120166g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f120167h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public List<x0> f120168i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f120169j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int[] f120170k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f120171l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public lq.h f120172m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f120173n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f120174o;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f120175a;

        static {
            int[] iArr = new int[am.x0.values().length];
            try {
                iArr[am.x0.D3.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[am.x0.C3.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f120175a = iArr;
        }
    }

    static {
        new a(null);
        int i14 = gt2.c.f79010a;
        f120159p = gt2.b.f79005a.h("ActivityStatsLapsAdapter");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(Context context, rs.b bVar, List<? extends com.garmin.android.apps.connectmobile.activities.newmodel.j> list, List<c0> list2, double d14, boolean z14, boolean z15, String str) {
        context.getClass();
        bVar.getClass();
        this.f120160a = context;
        this.f120161b = bVar;
        this.f120162c = list;
        this.f120163d = list2;
        this.f120164e = d14;
        this.f120165f = z14;
        this.f120172m = lq.h.ALL;
        ar.c cVar = bVar.f154298d;
        f12.l.f68084a.getClass();
        this.f120169j = ar.b.g(cVar, f12.l.a.a().y());
        this.f120171l = cVar.f12517a;
        this.f120173n = z15;
        this.f120174o = str;
    }

    /* JADX WARN: Code duplicated, block: B:66:0x01bb A[PHI: r5
      0x01bb: PHI (r5v48 java.lang.Double) = (r5v46 java.lang.Double), (r5v50 java.lang.Double) binds: [B:68:0x01c5, B:65:0x01b9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x0068. Please report as an issue. */
    public void a(ArrayList arrayList, mq.a aVar) {
        Object objJ;
        Object duration;
        Object g0Var;
        Double averagePower;
        aVar.getClass();
        ls.e eVarA = mq.b.a(aVar);
        if (eVarA != null) {
            rs.b bVar = this.f120161b;
            objJ = ss.k.j(eVarA, new ls.a(this.f120171l, bVar.f154296b, null, null, false, null, null, bVar.f154302h, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 33554300, null));
        } else {
            objJ = null;
        }
        for (x0 x0Var : g()) {
            x0Var.getClass();
            int i14 = mq.b.a.f120144a[aVar.ordinal()];
            double d14 = this.f120164e;
            switch (i14) {
                case 1:
                case 2:
                case 3:
                case 4:
                    duration = x0Var.getDuration();
                    break;
                case 5:
                    Double duration2 = x0Var.getDuration();
                    double dDoubleValue = duration2 != null ? duration2.doubleValue() : 0.0d;
                    Double movingDuration = x0Var.getMovingDuration();
                    duration = Double.valueOf(dDoubleValue - (movingDuration != null ? movingDuration.doubleValue() : 0.0d));
                    break;
                case 6:
                case 7:
                case 8:
                case 9:
                    duration = x0Var.getMovingDuration();
                    break;
                case 10:
                case 11:
                case 12:
                case 13:
                    duration = x0Var.getDistance();
                    break;
                case 14:
                case 15:
                case 16:
                    duration = x0Var.getElevationGain();
                    break;
                case 17:
                case 18:
                case 19:
                    duration = x0Var.getElevationLoss();
                    break;
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                    duration = x0Var.getAverageSpeed();
                    break;
                case 25:
                    duration = x0Var.getAverageMovingSpeed();
                    break;
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                    duration = x0Var.getMaxSpeed();
                    break;
                case 32:
                    duration = x0Var.getAverageGradeAdjustedSpeed();
                    break;
                case 33:
                case 34:
                    duration = x0Var.getAverageMovingSpeed();
                    break;
                case 35:
                case 36:
                    duration = x0Var.getAverageHR();
                    break;
                case 37:
                case 38:
                    duration = x0Var.getMaxHR();
                    break;
                case 39:
                case 40:
                case 41:
                case 42:
                    duration = x0Var.getAverageRunCadence();
                    break;
                case 43:
                case 44:
                case 45:
                    duration = x0Var.getMaxRunCadence();
                    break;
                case 46:
                case 47:
                    duration = x0Var.getAverageBikeCadence();
                    break;
                case 48:
                case 49:
                    duration = x0Var.getMaxBikeCadence();
                    break;
                case 50:
                    duration = x0Var.getSeatedTime();
                    break;
                case 51:
                    duration = x0Var.getStandingTime();
                    break;
                case 52:
                    duration = x0Var.getAvgRiderTorsoAngle();
                    break;
                case 53:
                    duration = x0Var.getAvgAeroTorsoAngle();
                    break;
                case 54:
                    duration = x0Var.getAvgLoweredTorsoAngle();
                    break;
                case 55:
                    duration = x0Var.getAvgUprightTorsoAngle();
                    break;
                case 56:
                    duration = x0Var.getAvgStandingTorsoAngle();
                    break;
                case 57:
                    duration = x0Var.getAeroTime();
                    break;
                case 58:
                    duration = x0Var.getLoweredTime();
                    break;
                case 59:
                    duration = x0Var.getUprightTime();
                    break;
                case 60:
                    duration = x0Var.getAvgAeroPower();
                    break;
                case 61:
                    duration = x0Var.getMaxAeroPower();
                    break;
                case 62:
                    duration = x0Var.getAvgLoweredPower();
                    break;
                case 63:
                    duration = x0Var.getMaxLoweredPower();
                    break;
                case 64:
                    duration = x0Var.getAvgUprightPower();
                    break;
                case 65:
                    duration = x0Var.getMaxUprightPower();
                    break;
                case 66:
                    duration = x0Var.getAvgBikeForce();
                    break;
                case 67:
                    duration = x0Var.getMaxBikeForce();
                    break;
                case 68:
                    duration = x0Var.getNormalizedForce();
                    break;
                case 69:
                    duration = x0Var.getNormalizedPower();
                    break;
                case 70:
                    g0Var = new g0(x0Var.getLeftBalance(), x0Var.getRightBalance());
                    break;
                case 71:
                    g0Var = new g0(x0Var.getLeftTorqueEffectiveness(), x0Var.getRightTorqueEffectiveness());
                    break;
                case 72:
                    g0Var = new g0(x0Var.getLeftPedalSmoothness(), x0Var.getRightPedalSmoothness());
                    break;
                case 73:
                    duration = x0Var.getAveragePower();
                    break;
                case 74:
                    duration = x0Var.getMaxPower();
                    break;
                case 75:
                    averagePower = x0Var.getAveragePower();
                    if (averagePower != null) {
                        duration = u0.h(d14, averagePower);
                    } else {
                        duration = null;
                    }
                    break;
                case 76:
                    averagePower = x0Var.getMaxPower();
                    if (averagePower != null) {
                        duration = u0.h(d14, averagePower);
                    } else {
                        duration = null;
                    }
                    break;
                case 77:
                    duration = x0Var.getAverageSeatedPower();
                    break;
                case 78:
                    duration = x0Var.getMaxSeatedPower();
                    break;
                case 79:
                    duration = x0Var.getAverageStandingPower();
                    break;
                case 80:
                    duration = x0Var.getMaxStandingPower();
                    break;
                case 81:
                    duration = x0Var.getAverageStepSpeedLoss();
                    break;
                case 82:
                    duration = x0Var.getAverageStepSpeedLossPercent();
                    break;
                case 83:
                    duration = x0Var.getStrideLength();
                    break;
                case 84:
                    duration = x0Var.getTotalNumberOfStrokes();
                    break;
                case 85:
                    duration = x0Var.getMinTemperature();
                    break;
                case 86:
                    duration = x0Var.getMaxTemperature();
                    break;
                case 87:
                    duration = x0Var.getAverageTemperature();
                    break;
                case 88:
                    duration = x0Var.getCalories();
                    break;
                case 89:
                    duration = x0Var.getStrokeRate();
                    break;
                case 90:
                    duration = x0Var.getMaxStrokeRate();
                    break;
                case 91:
                    duration = x0Var.getAverageStrokeCadence();
                    break;
                case 92:
                    duration = x0Var.getMaxStrokeCadence();
                    break;
                case 93:
                    duration = x0Var.getAverageFlow();
                    break;
                case 94:
                    duration = x0Var.getGrit();
                    break;
                case 95:
                    duration = x0Var.getJumpCount();
                    break;
                case 96:
                    duration = x0Var.getGroundContactTime();
                    break;
                case 97:
                    duration = x0Var.getGroundContactBalanceLeft();
                    break;
                case 98:
                    duration = x0Var.getVerticalOscillation();
                    break;
                case 99:
                    duration = x0Var.getAverageVerticalRatio();
                    break;
                case 100:
                case 101:
                    duration = x0Var.getAverageVerticalSpeed();
                    break;
                case 102:
                    duration = x0Var.getAverageSwimCadence();
                    break;
                case 103:
                    duration = x0Var.getMaxSwimCadence();
                    break;
                case 104:
                    duration = x0Var.getAverageSWOLF();
                    break;
                case 105:
                    duration = x0Var.getMinSWOLF();
                    break;
                case 106:
                    duration = ar.h.b(x0Var);
                    break;
                case 107:
                    duration = ar.h.a(x0Var);
                    break;
                case 108:
                    duration = x0Var.getMinStrokes();
                    break;
                case 109:
                    duration = x0Var.getAverageStrokes();
                    break;
                case 110:
                    duration = x0Var.getNumberOfActiveLengths();
                    break;
                case 111:
                    duration = x0Var.getAverageStrokeDistance();
                    break;
                case 112:
                    duration = x0Var.getFloorsClimbed();
                    break;
                case 113:
                    g0Var = x0Var.getBottomTime();
                    duration = g0Var == null ? x0Var.getDuration() : g0Var;
                    break;
                case 114:
                    duration = x0Var.getMaxDepth();
                    break;
                case 115:
                    duration = x0Var.getSurfaceInterval();
                    break;
                case 116:
                    duration = x0Var.getMinTemperature();
                    break;
                case 117:
                    duration = x0Var.getDifficulty();
                    break;
                case 118:
                    duration = x0Var.getNumFalls();
                    break;
                case 119:
                    duration = x0Var.R0();
                    break;
                case 120:
                    duration = x0Var.getTotalReps();
                    break;
                case 121:
                    duration = x0Var.getAvgJumpRopeCadence();
                    break;
                case 122:
                    duration = x0Var.getAvgWheelchairCadence();
                    break;
                case 123:
                    duration = x0Var.getMaxWheelchairCadence();
                    break;
                case 124:
                    duration = x0Var.getSurfaceTypeUnpavedPercentage();
                    break;
                case 125:
                    duration = x0Var.k3();
                    break;
                case 126:
                    duration = x0Var.getStartLatitude() + "," + x0Var.getStartLongitude();
                    break;
                default:
                    duration = null;
                    break;
            }
            if ((eVarA == null && duration != null) || (eVarA != null && (ss.k.p(eVarA, duration) || ss.k.p(eVarA, objJ)))) {
                arrayList.add(aVar);
                return;
            }
        }
    }

    public ArrayList b(String str) {
        str.getClass();
        ArrayList arrayList = new ArrayList();
        z0 z0Var = z0.f4390a;
        if (z0.b(am.x0.R0, str)) {
            arrayList.add(mq.a.SKI_RUN);
            return arrayList;
        }
        if (z0.x(str)) {
            arrayList.add(mq.a.SKI_RUN);
            arrayList.add(mq.a.SPLIT_TYPE);
            return arrayList;
        }
        if (z0.b(am.x0.f4308n, str) || z0.b(am.x0.f4312o, str)) {
            arrayList.add(mq.a.LAP);
            return arrayList;
        }
        if (z0.b(am.x0.f4324r, str)) {
            if (z0.b(am.x0.f4317p1, str)) {
                arrayList.add(mq.a.LAP);
                return arrayList;
            }
            arrayList.add(mq.a.INTERVAL);
            return arrayList;
        }
        if (z0.M(str)) {
            arrayList.add(mq.a.DIVE_NUMBER_LANDSCAPE);
            return arrayList;
        }
        if (z0.P(str)) {
            arrayList.add(mq.a.SKI_RUN);
            return arrayList;
        }
        if (z0.b(am.x0.f4352y2, str)) {
            arrayList.add(mq.a.ROUTE);
            return arrayList;
        }
        if (z0.o(str)) {
            arrayList.add(mq.a.SPLIT);
            arrayList.add(mq.a.SPLIT_TYPE);
            return arrayList;
        }
        if (z0.v(str)) {
            arrayList.add(mq.a.SPLIT);
            return arrayList;
        }
        if (z0.b(am.x0.f4297k1, str) || z0.v(str)) {
            arrayList.add(mq.a.INTERVAL);
            return arrayList;
        }
        arrayList.add(mq.a.LAP);
        return arrayList;
    }

    public int c(int i14) {
        return !l(i14) ? 1 : 0;
    }

    public View d() throws Throwable {
        h hVar;
        Context context;
        ArrayList arrayList;
        boolean z14;
        boolean z15;
        ArrayList arrayList2;
        Context context2;
        ArrayList arrayList3;
        double d14;
        Context context3 = this.f120160a;
        Object systemService = context3.getSystemService("layout_inflater");
        systemService.getClass();
        Throwable th3 = null;
        View viewInflate = ((LayoutInflater) systemService).inflate(R.layout.activity_stats_laps_landscape_3_0, (ViewGroup) null);
        LinearLayout linearLayout = (LinearLayout) viewInflate.findViewById(R.id.activity_stats_laps_number_container);
        LinearLayout linearLayout2 = (LinearLayout) viewInflate.findViewById(R.id.activity_stats_laps_data_container);
        LinearLayout linearLayout3 = (LinearLayout) viewInflate.findViewById(R.id.number_container);
        LinearLayout linearLayout4 = (LinearLayout) viewInflate.findViewById(R.id.data_container);
        ScrollView scrollView = (ScrollView) viewInflate.findViewById(R.id.number_scroll_view);
        ScrollView scrollView2 = (ScrollView) viewInflate.findViewById(R.id.data_scroll_view);
        lq.a aVar = new lq.a(scrollView2, 4);
        lq.a aVar2 = new lq.a(scrollView, 5);
        scrollView.setOnScrollChangeListener(aVar);
        scrollView2.setOnScrollChangeListener(aVar2);
        rs.b bVar = this.f120161b;
        rs.a aVar3 = bVar.f154297c;
        ArrayList arrayListE = e(aVar3);
        String str = aVar3.f154290a;
        ArrayList arrayListB = b(str);
        to.j jVar = new to.j(0, 0, 0, this.f120169j, aVar3.f154290a);
        Context context4 = context3;
        h hVar2 = new h(context4, arrayListE, arrayListB, bVar, jVar, null);
        rs.b bVar2 = bVar;
        to.j jVar2 = jVar;
        LinearLayout linearLayoutE = hVar2.e(hVar2.f120191a, false);
        if (linearLayoutE != null) {
            linearLayout4.addView(linearLayoutE, 0);
        }
        LinearLayout linearLayoutE2 = hVar2.e(hVar2.f120180c, true);
        if (linearLayoutE2 != null) {
            linearLayout3.addView(linearLayoutE2, 0);
        }
        int iJ = j();
        int i14 = 0;
        int i15 = 0;
        while (i14 < iJ) {
            Throwable th4 = th3;
            List<x0> listG = g();
            ArrayList arrayList4 = this.f120166g;
            int i16 = iJ;
            double d15 = this.f120164e;
            View viewD = hVar2.d(d15, listG, arrayList4);
            View view2 = viewInflate;
            LinearLayout linearLayoutC = hVar2.c(g(), this.f120166g, d15);
            if (viewD == null || linearLayoutC == null) {
                hVar = hVar2;
                context = context4;
                arrayList = arrayListE;
                jVar2 = jVar2;
                linearLayout = linearLayout;
                aVar3 = aVar3;
            } else {
                int iE = fb2.g.e(16, context4);
                Context context5 = context4;
                linearLayoutC.setPadding(iE, 0, 0, 0);
                viewD.setPadding(0, 0, iE, 0);
                ArrayList arrayList5 = arrayListE;
                o oVar = new o(viewD, arrayList5.size(), hVar2, false);
                o oVar2 = new o(linearLayoutC, arrayListB.size(), hVar2, true);
                jVar2.f165806a = i14;
                int i17 = h()[i14];
                jVar2.f165807b = i17;
                int iC = c(i14);
                if (iC != 0) {
                    hVar = hVar2;
                    bVar2 = bVar2;
                    q1 q1Var = bVar2.f154296b;
                    if (iC != 1) {
                        context = context5;
                        i14 = i14;
                        z15 = false;
                        g.b(context, oVar, arrayList5, q1Var, jVar2, Double.valueOf(d15), Integer.valueOf(i15));
                        g.b(context, oVar2, arrayListB, q1Var, jVar2, Double.valueOf(d15), Integer.valueOf(i15));
                        i15++;
                        linearLayout2.addView(viewD);
                        linearLayout.addView(linearLayoutC);
                        arrayList = arrayList5;
                    } else {
                        z15 = false;
                        context = context5;
                        i14 = i14;
                        g.b(context, oVar, arrayList5, q1Var, jVar2, Double.valueOf(d15), Integer.valueOf(i15));
                        g.b(context, oVar2, arrayListB, q1Var, jVar2, Double.valueOf(d15), Integer.valueOf(i15));
                        i15++;
                        linearLayout2.addView(viewD);
                        linearLayout.addView(linearLayoutC);
                        arrayList = arrayList5;
                    }
                    z14 = true;
                } else {
                    ArrayList arrayList6 = arrayList5;
                    double d16 = d15;
                    hVar = hVar2;
                    g.a(context5, oVar, arrayList6, g(), jVar2, this.f120166g, Double.valueOf(d16), Integer.valueOf(i15));
                    linearLayout2.addView(viewD);
                    g.a(context5, oVar2, arrayListB, g(), jVar2, this.f120166g, Double.valueOf(d16), Integer.valueOf(i15));
                    Context context6 = context5;
                    to.j jVar3 = jVar2;
                    oVar.f120193a.post(new c(oVar2, oVar, 2));
                    linearLayout.addView(linearLayoutC);
                    i15++;
                    x0 x0Var = g().get(jVar3.f165806a);
                    List<ps.z0> listC1 = x0Var.c1();
                    t tVarB = ar.h.b(x0Var);
                    if (listC1 != null && tVarB != t.REST) {
                        to.j jVar4 = new to.j(0, 0, 0, this.f120169j, aVar3.f154290a);
                        qs.f fVarA = ar.h.a(x0Var);
                        fVarA.getClass();
                        tVarB.getClass();
                        int i18 = ss.i.f160606a;
                        ArrayList arrayList7 = new ArrayList(y.r(listC1, 10));
                        int i19 = 0;
                        for (Object obj : listC1) {
                            int i24 = i19 + 1;
                            if (i19 < 0) {
                                x.q();
                                throw th4;
                            }
                            ps.z0 z0Var = (ps.z0) obj;
                            z0Var.getClass();
                            Integer lengthIndex = z0Var.getLengthIndex();
                            int iIntValue = lengthIndex != null ? lengthIndex.intValue() + 1 : -1;
                            String startTimeGMT = z0Var.getStartTimeGMT();
                            Double averageSpeed = z0Var.getAverageSpeed();
                            double dDoubleValue = averageSpeed != null ? averageSpeed.doubleValue() : -1.0d;
                            Double averageMovingSpeed = z0Var.getAverageMovingSpeed();
                            double dDoubleValue2 = averageMovingSpeed != null ? averageMovingSpeed.doubleValue() : -1.0d;
                            Double distance = z0Var.getDistance();
                            double dDoubleValue3 = distance != null ? distance.doubleValue() : -1.0d;
                            Double duration = z0Var.getDuration();
                            double dDoubleValue4 = duration != null ? duration.doubleValue() : -1.0d;
                            Double movingDuration = z0Var.getMovingDuration();
                            double dDoubleValue5 = movingDuration != null ? movingDuration.doubleValue() : -1.0d;
                            Double averageHR = z0Var.getAverageHR();
                            double dDoubleValue6 = averageHR != null ? averageHR.doubleValue() : -1.0d;
                            Double maxHR = z0Var.getMaxHR();
                            double dDoubleValue7 = maxHR != null ? maxHR.doubleValue() : -1.0d;
                            Double elevationGain = z0Var.getElevationGain();
                            double dDoubleValue8 = elevationGain != null ? elevationGain.doubleValue() : -1.0d;
                            Double elevationLoss = z0Var.getElevationLoss();
                            double dDoubleValue9 = elevationLoss != null ? elevationLoss.doubleValue() : -1.0d;
                            Double calories = z0Var.getCalories();
                            double dDoubleValue10 = calories != null ? calories.doubleValue() : Double.NaN;
                            Double strideLength = z0Var.getStrideLength();
                            double dDoubleValue11 = strideLength != null ? strideLength.doubleValue() : -1.0d;
                            Double minTemperature = z0Var.getMinTemperature();
                            double dDoubleValue12 = minTemperature != null ? minTemperature.doubleValue() : -1.0d;
                            Double maxTemperature = z0Var.getMaxTemperature();
                            double dDoubleValue13 = maxTemperature != null ? maxTemperature.doubleValue() : -1.0d;
                            Double averageTemperature = z0Var.getAverageTemperature();
                            double dDoubleValue14 = averageTemperature != null ? averageTemperature.doubleValue() : -1.0d;
                            Double maxSpeed = z0Var.getMaxSpeed();
                            double dDoubleValue15 = maxSpeed != null ? maxSpeed.doubleValue() : -1.0d;
                            Double startLatitude = z0Var.getStartLatitude();
                            double dDoubleValue16 = startLatitude != null ? startLatitude.doubleValue() : Double.NaN;
                            Double startLongitude = z0Var.getStartLongitude();
                            double dDoubleValue17 = startLongitude != null ? startLongitude.doubleValue() : Double.NaN;
                            Double endLatitude = z0Var.getEndLatitude();
                            double dDoubleValue18 = endLatitude != null ? endLatitude.doubleValue() : Double.NaN;
                            Double endLongitude = z0Var.getEndLongitude();
                            double dDoubleValue19 = endLongitude != null ? endLongitude.doubleValue() : Double.NaN;
                            qs.f fVar = fVarA;
                            arrayList7.add(new x0(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, Double.valueOf(dDoubleValue6), null, null, Double.valueOf(dDoubleValue2), null, null, null, null, Double.valueOf(dDoubleValue), null, null, null, null, null, null, null, z0Var.getAverageSWOLF(), Double.valueOf(dDoubleValue14), null, null, null, null, null, null, null, null, Double.valueOf(dDoubleValue10), null, null, false, null, null, Double.valueOf(dDoubleValue3), Double.valueOf(dDoubleValue4), null, Double.valueOf(dDoubleValue8), Double.valueOf(dDoubleValue9), null, Double.valueOf(dDoubleValue18), Double.valueOf(dDoubleValue19), null, null, null, null, null, null, null, null, null, null, null, null, null, fVar.name(), tVarB.name(), false, null, iIntValue, null, null, null, null, null, null, null, null, null, null, (i19 < 0 || i19 >= listC1.size()) ? j0.f134944a : w.c(listC1.get(i19)), null, null, null, null, null, null, null, Double.valueOf(dDoubleValue7), null, null, null, null, null, null, Double.valueOf(dDoubleValue15), null, null, null, null, Double.valueOf(dDoubleValue13), null, null, null, null, null, null, null, null, null, null, null, Double.valueOf(dDoubleValue12), null, Double.valueOf(dDoubleValue5), 0, null, null, Double.valueOf(1.0d), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, Double.valueOf(dDoubleValue16), Double.valueOf(dDoubleValue17), null, null, startTimeGMT, null, null, null, null, Double.valueOf(dDoubleValue11), null, null, null, null, z0Var.getTotalNumberOfStrokes(), null, null, null, null, null, null, null, null, null, null, null, null, 0, null, 0, null, null, null, -69468161, -57413645, -1077938561, -289408033, -139198465, 524286, null));
                            i19 = i24;
                            fVarA = fVar;
                        }
                        str.getClass();
                        ArrayList arrayList8 = new ArrayList();
                        z0 z0Var2 = z0.f4390a;
                        if (!z0.b(am.x0.f4324r, str)) {
                            b(str);
                        } else if (z0.b(am.x0.f4317p1, str)) {
                            arrayList8.add(mq.a.LAP);
                        } else {
                            arrayList8.add(mq.a.INTERVAL_LENGTH);
                        }
                        for (int i25 = 0; i25 < arrayList7.size(); i25++) {
                            double d17 = d16;
                            View viewD2 = hVar.d(d17, g(), this.f120166g);
                            t tVarB2 = ar.h.b((x0) arrayList7.get(i25));
                            if (viewD2 != null) {
                                ArrayList arrayList9 = arrayList8;
                                if (tVarB2 == t.REST || tVarB2 == t.UNKNOWN) {
                                    context2 = context6;
                                    arrayList2 = arrayList9;
                                } else {
                                    aVar3 = aVar3;
                                    o oVar3 = new o(viewD2, arrayList6.size(), hVar, false);
                                    jVar4.f165806a = i25;
                                    jVar4.f165807b = i25 + 1;
                                    jVar4.f165808c = i17;
                                    jVar3 = jVar3;
                                    context2 = context6;
                                    ArrayList arrayList10 = arrayList6;
                                    LinearLayout linearLayout5 = linearLayout;
                                    d14 = d17;
                                    g.a(context2, oVar3, arrayList10, arrayList7, jVar4, this.f120166g, Double.valueOf(d17), Integer.valueOf(i15));
                                    arrayList3 = arrayList10;
                                    linearLayout2.addView(viewD2);
                                    LinearLayout linearLayoutC2 = hVar.c(g(), this.f120166g, d14);
                                    if (linearLayoutC2 != null) {
                                        linearLayoutC2.setPadding(iE, 0, 0, 0);
                                        arrayList2 = arrayList9;
                                        g.a(context2, new o(linearLayoutC2, arrayList9.size(), hVar, true), arrayList2, arrayList7, jVar4, this.f120166g, Double.valueOf(d14), Integer.valueOf(i15));
                                        linearLayout = linearLayout5;
                                        linearLayout.addView(linearLayoutC2);
                                    } else {
                                        arrayList2 = arrayList9;
                                        linearLayout = linearLayout5;
                                    }
                                    i15++;
                                }
                                Context context7 = context2;
                                jVar3 = jVar3;
                                arrayList8 = arrayList2;
                                context6 = context7;
                                aVar3 = aVar3;
                                arrayList6 = arrayList3;
                                d16 = d14;
                                linearLayout = linearLayout;
                            } else {
                                Context context8 = context6;
                                arrayList2 = arrayList8;
                                context2 = context8;
                            }
                            arrayList3 = arrayList6;
                            d14 = d17;
                            Context context9 = context2;
                            jVar3 = jVar3;
                            arrayList8 = arrayList2;
                            context6 = context9;
                            aVar3 = aVar3;
                            arrayList6 = arrayList3;
                            d16 = d14;
                            linearLayout = linearLayout;
                        }
                    }
                    jVar2 = jVar3;
                    context = context6;
                    linearLayout = linearLayout;
                    aVar3 = aVar3;
                    arrayList = arrayList6;
                }
                i14++;
                jVar2 = jVar2;
                linearLayout = linearLayout;
                th3 = th4;
                iJ = i16;
                viewInflate = view2;
                bVar2 = bVar2;
                aVar3 = aVar3;
                arrayListE = arrayList;
                context4 = context;
                hVar2 = hVar;
            }
            z14 = true;
            z15 = false;
            i14++;
            jVar2 = jVar2;
            linearLayout = linearLayout;
            th3 = th4;
            iJ = i16;
            viewInflate = view2;
            bVar2 = bVar2;
            aVar3 = aVar3;
            arrayListE = arrayList;
            context4 = context;
            hVar2 = hVar;
        }
        return viewInflate;
    }

    public ArrayList e(rs.a aVar) {
        aVar.getClass();
        ArrayList arrayList = new ArrayList();
        String str = aVar.f154290a;
        z0 z0Var = z0.f4390a;
        if (z0.b(am.x0.O0, str)) {
            a(arrayList, mq.a.TIME);
            a(arrayList, mq.a.CUMULATIVE_TIME);
            a(arrayList, mq.a.DISTANCE);
            a(arrayList, mq.a.AVG_PACE);
            a(arrayList, mq.a.AVG_GAP);
            a(arrayList, mq.a.AVG_HR);
            a(arrayList, mq.a.MAX_HR);
            a(arrayList, mq.a.ELEV_GAIN);
            a(arrayList, mq.a.ELEV_LOSS);
            a(arrayList, mq.a.MAX_POWER);
            a(arrayList, mq.a.WEIGHT_MAX_POWER);
            a(arrayList, mq.a.AVG_RUN_CADENCE);
            a(arrayList, mq.a.MAX_RUN_CADENCE);
            a(arrayList, mq.a.AVG_STRIDE_LENGTH);
            a(arrayList, mq.a.CALORIES);
            a(arrayList, mq.a.AVG_TEMPERATURE);
            a(arrayList, mq.a.BEST_PACE);
        } else if (z0.b(am.x0.f4308n, str)) {
            a(arrayList, mq.a.TIME);
            a(arrayList, mq.a.CUMULATIVE_TIME);
            a(arrayList, mq.a.DISTANCE);
            a(arrayList, mq.a.AVG_PACE);
            if (this.f120167h) {
                a(arrayList, mq.a.TARGET_TYPE);
            }
            a(arrayList, mq.a.AVG_GAP);
            a(arrayList, mq.a.AVG_HR);
            a(arrayList, mq.a.MAX_HR);
            a(arrayList, mq.a.ELEV_GAIN);
            a(arrayList, mq.a.ELEV_LOSS);
            a(arrayList, mq.a.AVG_POWER);
            a(arrayList, mq.a.WEIGHT_AVG_POWER);
            a(arrayList, mq.a.MAX_POWER);
            a(arrayList, mq.a.WEIGHT_MAX_POWER);
            a(arrayList, mq.a.AVG_RUN_CADENCE);
            a(arrayList, mq.a.AVG_GCT);
            a(arrayList, mq.a.AVG_GCT_BAL);
            a(arrayList, mq.a.AVG_STRIDE_LENGTH);
            a(arrayList, mq.a.AVG_VERT_OSC);
            a(arrayList, mq.a.AVG_VERT_OSC_RATIO);
            a(arrayList, mq.a.CALORIES);
            a(arrayList, mq.a.AVG_TEMPERATURE);
            a(arrayList, mq.a.BEST_PACE);
            a(arrayList, mq.a.MAX_RUN_CADENCE);
            a(arrayList, mq.a.MOVING_TIME);
            a(arrayList, mq.a.AVG_MOVING_PACE);
            a(arrayList, mq.a.AVG_STEP_SPEED_LOSS);
            a(arrayList, mq.a.AVG_STEP_SPEED_LOSS_PERCENT);
        } else if (z0.b(am.x0.Y2, str) || z0.b(am.x0.Z2, str)) {
            a(arrayList, mq.a.TIME);
            a(arrayList, mq.a.CUMULATIVE_TIME);
            a(arrayList, mq.a.DISTANCE);
            a(arrayList, mq.a.MOVING_TIME);
            a(arrayList, mq.a.AVG_SPEED);
            a(arrayList, mq.a.AVG_MOVING_SPEED);
            a(arrayList, mq.a.MAX_SPEED);
            a(arrayList, mq.a.AVG_HR);
            a(arrayList, mq.a.MAX_HR);
            a(arrayList, mq.a.ELEV_GAIN);
            a(arrayList, mq.a.ELEV_LOSS);
            a(arrayList, mq.a.AVG_BIKE_CADENCE);
            a(arrayList, mq.a.MAX_BIKE_CADENCE);
            a(arrayList, mq.a.ATA);
            a(arrayList, mq.a.AATA);
            a(arrayList, mq.a.ALTA);
            a(arrayList, mq.a.AUTA);
            a(arrayList, mq.a.ASTA);
            a(arrayList, mq.a.SEATED_TIME);
            a(arrayList, mq.a.AT);
            a(arrayList, mq.a.LT);
            a(arrayList, mq.a.UT);
            a(arrayList, mq.a.STANDING_TIME);
            a(arrayList, mq.a.AVG_POWER);
            a(arrayList, mq.a.MAX_POWER);
            if (this.f120167h) {
                a(arrayList, mq.a.TARGET_TYPE);
            }
            a(arrayList, mq.a.AVG_SEATED_POWER);
            a(arrayList, mq.a.MAX_SEATED_POWER);
            a(arrayList, mq.a.AAP);
            a(arrayList, mq.a.MAP);
            a(arrayList, mq.a.ALP);
            a(arrayList, mq.a.MLP);
            a(arrayList, mq.a.AUP);
            a(arrayList, mq.a.MUP);
            a(arrayList, mq.a.AVG_STANDING_POWER);
            a(arrayList, mq.a.MAX_STANDING_POWER);
            a(arrayList, mq.a.NORMALIZED_POWER);
            a(arrayList, mq.a.AVG_BIKE_FORCE);
            a(arrayList, mq.a.MAX_BIKE_FORCE);
            a(arrayList, mq.a.NORMALIZED_FORCE);
            a(arrayList, mq.a.LR_BALANCE);
            a(arrayList, mq.a.LR_TORQUE_EFFECTIVENESS);
            a(arrayList, mq.a.LR_PEDAL_SMOOTHNESS);
            a(arrayList, mq.a.CALORIES);
            a(arrayList, mq.a.AVG_TEMPERATURE);
        } else if (z0.b(am.x0.R0, str)) {
            a(arrayList, mq.a.ELEV_LOSS);
            a(arrayList, mq.a.DISTANCE_SHORT);
            a(arrayList, mq.a.MAX_SPEED);
            a(arrayList, mq.a.TIME);
            a(arrayList, mq.a.RUN_MOVING_TIME);
            a(arrayList, mq.a.AVG_SPEED);
            a(arrayList, mq.a.AVG_MOVING_SPEED);
            a(arrayList, mq.a.CALORIES);
            a(arrayList, mq.a.AVG_HR);
            a(arrayList, mq.a.MAX_HR);
            a(arrayList, mq.a.CUMULATIVE_TIME);
            a(arrayList, mq.a.IDLE_TIME);
            a(arrayList, mq.a.AVG_TEMPERATURE);
            a(arrayList, mq.a.GRIT);
            a(arrayList, mq.a.FLOW);
            a(arrayList, mq.a.JUMP_COUNT);
        } else if (z0.x(str)) {
            a(arrayList, mq.a.TIME);
            a(arrayList, mq.a.DISTANCE);
            a(arrayList, mq.a.ASCENT_ELEV_GAIN);
            a(arrayList, mq.a.DESCENT_ELEV_LOSS);
            a(arrayList, mq.a.AVG_SPEED);
            a(arrayList, mq.a.MAX_SPEED);
            a(arrayList, mq.a.AVG_HR);
            a(arrayList, mq.a.MAX_HR);
            a(arrayList, mq.a.CUMULATIVE_TIME);
            a(arrayList, mq.a.MOVING_TIME);
            a(arrayList, mq.a.CALORIES);
            a(arrayList, mq.a.GRIT);
            a(arrayList, mq.a.FLOW);
            a(arrayList, mq.a.JUMP_COUNT);
        } else if (z0.b(am.x0.f4312o, str)) {
            a(arrayList, mq.a.TIME);
            a(arrayList, mq.a.CUMULATIVE_TIME);
            a(arrayList, mq.a.DISTANCE);
            a(arrayList, mq.a.SURFACE_TYPE_PAVED_PERCENTAGE);
            a(arrayList, mq.a.SURFACE_TYPE_UNPAVED_PERCENTAGE);
            a(arrayList, mq.a.MOVING_TIME);
            a(arrayList, mq.a.AVG_SPEED);
            a(arrayList, mq.a.AVG_MOVING_SPEED);
            a(arrayList, mq.a.MAX_SPEED);
            a(arrayList, mq.a.AVG_HR);
            a(arrayList, mq.a.MAX_HR);
            a(arrayList, mq.a.ELEV_GAIN);
            a(arrayList, mq.a.ELEV_LOSS);
            a(arrayList, mq.a.AVG_BIKE_CADENCE);
            a(arrayList, mq.a.MAX_BIKE_CADENCE);
            a(arrayList, mq.a.ATA);
            a(arrayList, mq.a.AATA);
            a(arrayList, mq.a.ALTA);
            a(arrayList, mq.a.AUTA);
            a(arrayList, mq.a.ASTA);
            a(arrayList, mq.a.SEATED_TIME);
            a(arrayList, mq.a.AT);
            a(arrayList, mq.a.LT);
            a(arrayList, mq.a.UT);
            a(arrayList, mq.a.STANDING_TIME);
            a(arrayList, mq.a.AVG_POWER);
            a(arrayList, mq.a.MAX_POWER);
            if (this.f120167h) {
                a(arrayList, mq.a.TARGET_TYPE);
            }
            a(arrayList, mq.a.AVG_SEATED_POWER);
            a(arrayList, mq.a.MAX_SEATED_POWER);
            a(arrayList, mq.a.AAP);
            a(arrayList, mq.a.MAP);
            a(arrayList, mq.a.ALP);
            a(arrayList, mq.a.MLP);
            a(arrayList, mq.a.AUP);
            a(arrayList, mq.a.MUP);
            a(arrayList, mq.a.AVG_STANDING_POWER);
            a(arrayList, mq.a.MAX_STANDING_POWER);
            a(arrayList, mq.a.NORMALIZED_POWER);
            a(arrayList, mq.a.AVG_BIKE_FORCE);
            a(arrayList, mq.a.MAX_BIKE_FORCE);
            a(arrayList, mq.a.NORMALIZED_FORCE);
            a(arrayList, mq.a.LR_BALANCE);
            a(arrayList, mq.a.LR_TORQUE_EFFECTIVENESS);
            a(arrayList, mq.a.LR_PEDAL_SMOOTHNESS);
            a(arrayList, mq.a.CALORIES);
            a(arrayList, mq.a.AVG_TEMPERATURE);
            a(arrayList, mq.a.GRIT);
            a(arrayList, mq.a.FLOW);
            a(arrayList, mq.a.JUMP_COUNT);
        } else if (z0.b(am.x0.f4317p1, str)) {
            a(arrayList, mq.a.TIME);
            a(arrayList, mq.a.CUMULATIVE_TIME);
            a(arrayList, mq.a.MOVING_TIME);
            a(arrayList, mq.a.SWIM_DISTANCE);
            a(arrayList, mq.a.ELEV_GAIN);
            a(arrayList, mq.a.ELEV_LOSS);
            a(arrayList, mq.a.AVG_SWIM_PACE);
            a(arrayList, mq.a.BEST_SWIM_PACE);
            a(arrayList, mq.a.AVG_HR);
            a(arrayList, mq.a.MAX_HR);
            a(arrayList, mq.a.AVG_SWOLF);
            a(arrayList, mq.a.BEST_SWOLF);
            a(arrayList, mq.a.AVG_SWIM_CADENCE);
            a(arrayList, mq.a.MAX_SWIM_CADENCE);
            a(arrayList, mq.a.AVG_TEMPERATURE);
            a(arrayList, mq.a.TOTAL_STROKES);
            a(arrayList, mq.a.CALORIES);
        } else if (z0.b(am.x0.f4324r, str) || z0.b(am.x0.f4313o1, str)) {
            a(arrayList, mq.a.SWIM_STROKE);
            a(arrayList, mq.a.DRILL_TYPE);
            a(arrayList, mq.a.LENGTHS);
            a(arrayList, mq.a.SWIM_DISTANCE);
            a(arrayList, mq.a.TIME);
            a(arrayList, mq.a.CUMULATIVE_TIME);
            a(arrayList, mq.a.AVG_SWIM_PACE);
            a(arrayList, mq.a.BEST_SWIM_PACE);
            a(arrayList, mq.a.AVG_SWOLF);
            a(arrayList, mq.a.BEST_SWOLF);
            a(arrayList, mq.a.AVG_HR);
            a(arrayList, mq.a.MAX_HR);
            a(arrayList, mq.a.TOTAL_STROKES);
            a(arrayList, mq.a.AVG_STROKES);
            for (x0 x0Var : g()) {
                if (x0Var.getMinStrokes() != null) {
                    Double minStrokes = x0Var.getMinStrokes();
                    minStrokes.getClass();
                    if (minStrokes.doubleValue() > 0.0d) {
                        a(arrayList, mq.a.MIN_STROKES);
                        break;
                    }
                }
            }
            a(arrayList, mq.a.CALORIES);
        } else if (z0.b(am.x0.O1, str)) {
            a(arrayList, mq.a.TIME);
            a(arrayList, mq.a.DISTANCE);
            a(arrayList, mq.a.FLYING_ELEV_GAIN);
            a(arrayList, mq.a.FLYING_ELEV_LOSS);
            a(arrayList, mq.a.AVG_SPEED);
            a(arrayList, mq.a.MAX_SPEED);
            a(arrayList, mq.a.AVG_PACE);
            a(arrayList, mq.a.BEST_PACE);
            a(arrayList, mq.a.AVG_HR);
            a(arrayList, mq.a.MAX_HR);
            a(arrayList, mq.a.AVG_TEMPERATURE);
            a(arrayList, mq.a.CALORIES);
        } else if (z0.s(str) || z0.U(str) || z0.Q(str)) {
            a(arrayList, mq.a.TIME);
            a(arrayList, mq.a.CUMULATIVE_TIME);
            a(arrayList, mq.a.MOVING_TIME);
            a(arrayList, mq.a.DISTANCE);
            a(arrayList, mq.a.AVG_STROKE_RATE);
            a(arrayList, mq.a.MAX_STROKE_RATE);
            a(arrayList, mq.a.AVG_NAUTICAL_STROKE_RATE);
            a(arrayList, mq.a.MAX_NAUTICAL_STROKE_RATE);
            a(arrayList, mq.a.AVG_DISTANCE_STROKE);
            a(arrayList, mq.a.AVG_PACE);
            a(arrayList, mq.a.BEST_PACE);
            a(arrayList, mq.a.AVG_HR);
            a(arrayList, mq.a.MAX_HR);
            a(arrayList, mq.a.AVG_TEMPERATURE);
            a(arrayList, mq.a.CALORIES);
        } else if (z0.b(am.x0.f4297k1, str)) {
            a(arrayList, mq.a.TIME);
            a(arrayList, mq.a.CUMULATIVE_TIME);
            a(arrayList, mq.a.MOVING_TIME);
            a(arrayList, mq.a.DISTANCE);
            a(arrayList, mq.a.AVG_NAUTICAL_STROKE_RATE);
            a(arrayList, mq.a.MAX_NAUTICAL_STROKE_RATE);
            a(arrayList, mq.a.AVG_DISTANCE_STROKE);
            a(arrayList, mq.a.NORMALIZED_POWER);
            a(arrayList, mq.a.AVG_POWER);
            a(arrayList, mq.a.WEIGHT_AVG_POWER);
            a(arrayList, mq.a.MAX_POWER);
            a(arrayList, mq.a.WEIGHT_MAX_POWER);
            a(arrayList, mq.a.AVG_PACE);
            a(arrayList, mq.a.AVG_MOVING_PACE);
            a(arrayList, mq.a.BEST_PACE);
            a(arrayList, mq.a.AVG_HR);
            a(arrayList, mq.a.MAX_HR);
            a(arrayList, mq.a.AVG_TEMPERATURE);
            a(arrayList, mq.a.CALORIES);
        } else if (z0.b(am.x0.f4352y2, str)) {
            a(arrayList, mq.a.DIFFICULTY);
            a(arrayList, mq.a.FALLS);
            a(arrayList, mq.a.STATUS);
            a(arrayList, mq.a.TIME);
            a(arrayList, mq.a.ASCENT_ELEV_GAIN);
            a(arrayList, mq.a.AVG_HR);
            a(arrayList, mq.a.MAX_HR);
            a(arrayList, mq.a.CALORIES);
        } else if (z0.z(str)) {
            a(arrayList, mq.a.TIME);
            a(arrayList, mq.a.FLOORS);
            a(arrayList, mq.a.FLOOR_SPEED);
        } else if (z0.V(str)) {
            a(arrayList, mq.a.TIME);
            a(arrayList, mq.a.CUMULATIVE_TIME);
            a(arrayList, mq.a.AVG_HR);
            a(arrayList, mq.a.MAX_HR);
            a(arrayList, mq.a.CALORIES);
        } else if (z0.M(str) || z0.b(am.x0.f4296k0, str)) {
            a(arrayList, mq.a.BOTTOM_TIME);
            a(arrayList, mq.a.MAX_DEPTH);
            a(arrayList, mq.a.SURFACE_INTERVAL);
            a(arrayList, mq.a.ENTRY_LOCATION);
            a(arrayList, mq.a.MIN_WATER_TEMP);
            a(arrayList, mq.a.AVG_HR);
            a(arrayList, mq.a.MAX_HR);
        } else if (z0.O(str)) {
            a(arrayList, mq.a.LAP_TIME);
            a(arrayList, mq.a.MAX_SPEED);
            a(arrayList, mq.a.AVG_SPEED);
            a(arrayList, mq.a.LAP_DISTANCE);
        } else if (z0.P(str)) {
            a(arrayList, mq.a.TIME);
            a(arrayList, mq.a.RUN_MOVING_TIME);
            a(arrayList, mq.a.DISTANCE_SHORT);
            a(arrayList, mq.a.ELEV_LOSS);
            a(arrayList, mq.a.MAX_SPEED);
            a(arrayList, mq.a.AVG_SPEED);
            a(arrayList, mq.a.AVG_MOVING_SPEED);
            a(arrayList, mq.a.CALORIES);
            a(arrayList, mq.a.AVG_HR);
            a(arrayList, mq.a.MAX_HR);
            a(arrayList, mq.a.CUMULATIVE_TIME);
            a(arrayList, mq.a.IDLE_TIME);
            a(arrayList, mq.a.AVG_TEMPERATURE);
        } else if (z0.o(str)) {
            a(arrayList, mq.a.TIME);
            a(arrayList, mq.a.DISTANCE);
            a(arrayList, mq.a.ASCENT_ELEV_GAIN);
            a(arrayList, mq.a.DESCENT_ELEV_LOSS);
            a(arrayList, mq.a.AVG_SPEED);
            a(arrayList, mq.a.MAX_SPEED);
            a(arrayList, mq.a.AVG_HR);
            a(arrayList, mq.a.MAX_HR);
            a(arrayList, mq.a.CUMULATIVE_TIME);
            a(arrayList, mq.a.MOVING_TIME);
            a(arrayList, mq.a.CALORIES);
        } else if (z0.v(str)) {
            a(arrayList, mq.a.TIME);
            a(arrayList, mq.a.DISTANCE);
            a(arrayList, mq.a.AVG_SPEED);
            a(arrayList, mq.a.AVG_MOVING_SPEED);
            a(arrayList, mq.a.MAX_SPEED);
            a(arrayList, mq.a.AVG_POWER);
            a(arrayList, mq.a.MAX_POWER);
            a(arrayList, mq.a.ELEV_GAIN);
            a(arrayList, mq.a.ELEV_LOSS);
            a(arrayList, mq.a.AVG_SKI_CADENCE);
            a(arrayList, mq.a.MAX_SKI_CADENCE);
            a(arrayList, mq.a.AVG_STRIDE_LENGTH);
            a(arrayList, mq.a.AVG_HR);
            a(arrayList, mq.a.MAX_HR);
            a(arrayList, mq.a.CUMULATIVE_TIME);
            a(arrayList, mq.a.MOVING_TIME);
            a(arrayList, mq.a.MIN_TEMPERATURE);
            a(arrayList, mq.a.MAX_TEMPERATURE);
            a(arrayList, mq.a.AVG_TEMPERATURE);
            a(arrayList, mq.a.CALORIES);
        } else if (z0.X(str) || z0.a0(str)) {
            a(arrayList, mq.a.TIME);
            a(arrayList, mq.a.CUMULATIVE_TIME);
            a(arrayList, mq.a.DISTANCE);
            a(arrayList, mq.a.AVG_SPEED);
            a(arrayList, mq.a.AVG_HR);
            a(arrayList, mq.a.MAX_HR);
            a(arrayList, mq.a.ELEV_GAIN);
            a(arrayList, mq.a.ELEV_LOSS);
            a(arrayList, mq.a.CALORIES);
            a(arrayList, mq.a.AVG_TEMPERATURE);
            a(arrayList, mq.a.MAX_SPEED);
            a(arrayList, mq.a.MOVING_TIME);
            a(arrayList, mq.a.AVG_MOVING_SPEED);
        } else if (z0.d0(str)) {
            a(arrayList, mq.a.TIME);
            a(arrayList, mq.a.DISTANCE);
            a(arrayList, mq.a.AVG_SPEED);
            a(arrayList, mq.a.MAX_SPEED);
            a(arrayList, mq.a.AVG_SPEED_IN_USER_UNIT);
            a(arrayList, mq.a.MAX_SPEED_IN_USER_UNIT);
            a(arrayList, mq.a.AVG_HR);
            a(arrayList, mq.a.MAX_HR);
            a(arrayList, mq.a.CALORIES);
        } else if (z0.b(am.x0.f4331t, str)) {
            a(arrayList, mq.a.TIME);
            a(arrayList, mq.a.CUMULATIVE_TIME);
            a(arrayList, mq.a.DISTANCE);
            a(arrayList, mq.a.AVG_PACE);
            a(arrayList, mq.a.AVG_GAP);
            a(arrayList, mq.a.BEST_PACE);
            a(arrayList, mq.a.AVG_SPEED);
            a(arrayList, mq.a.MAX_SPEED);
            a(arrayList, mq.a.AVG_HR);
            a(arrayList, mq.a.MAX_HR);
            a(arrayList, mq.a.AVG_CADENCE);
            a(arrayList, mq.a.MAX_CADENCE);
            a(arrayList, mq.a.ELEV_GAIN);
            a(arrayList, mq.a.ELEV_LOSS);
            a(arrayList, mq.a.AVG_TEMPERATURE);
            a(arrayList, mq.a.CALORIES);
        } else if (z0.b(am.x0.f4320q, str) || z0.b(am.x0.F2, str)) {
            a(arrayList, mq.a.TIME);
            a(arrayList, mq.a.CUMULATIVE_TIME);
            a(arrayList, mq.a.MOVING_TIME);
            a(arrayList, mq.a.DISTANCE);
            a(arrayList, mq.a.AVG_PACE);
            a(arrayList, mq.a.BEST_PACE);
            a(arrayList, mq.a.AVG_GAP);
            a(arrayList, mq.a.AVG_SPEED);
            a(arrayList, mq.a.AVG_MOVING_SPEED);
            a(arrayList, mq.a.MAX_SPEED);
            a(arrayList, mq.a.AVG_HR);
            a(arrayList, mq.a.MAX_HR);
            a(arrayList, mq.a.AVG_CADENCE);
            a(arrayList, mq.a.MAX_CADENCE);
            a(arrayList, mq.a.ELEV_GAIN);
            a(arrayList, mq.a.ELEV_LOSS);
            a(arrayList, mq.a.AVG_TEMPERATURE);
            a(arrayList, mq.a.CALORIES);
        } else if (z0.b(am.x0.f4271b3, str) || z0.b(am.x0.f4274c3, str)) {
            a(arrayList, mq.a.TIME);
            a(arrayList, mq.a.CUMULATIVE_TIME);
            a(arrayList, mq.a.DISTANCE);
            a(arrayList, mq.a.AVG_SPEED);
            a(arrayList, mq.a.AVG_HR);
            a(arrayList, mq.a.MAX_HR);
            a(arrayList, mq.a.ELEV_GAIN);
            a(arrayList, mq.a.ELEV_LOSS);
            a(arrayList, mq.a.CALORIES);
            a(arrayList, mq.a.AVG_TEMPERATURE);
            a(arrayList, mq.a.MAX_SPEED);
            a(arrayList, mq.a.AVG_WHEELCHAIR_CADENCE);
            a(arrayList, mq.a.MAX_WHEELCHAIR_CADENCE);
            a(arrayList, mq.a.MOVING_TIME);
            a(arrayList, mq.a.AVG_MOVING_SPEED);
        } else if (z0.b(am.x0.C3, str)) {
            f120159p.error("Landscape view is not supported for Dance");
        } else if (z0.L(str)) {
            a(arrayList, mq.a.TOTAL_TIME);
            a(arrayList, mq.a.MOVING_TIME);
            a(arrayList, mq.a.AVG_HR);
            a(arrayList, mq.a.MAX_HR);
            a(arrayList, mq.a.AVG_BIKE_CADENCE_DEFAULT_LABEL);
            a(arrayList, mq.a.MAX_BIKE_CADENCE_DEFAULT_LABEL);
            a(arrayList, mq.a.NORMALIZED_POWER);
            a(arrayList, mq.a.LR_BALANCE);
            a(arrayList, mq.a.AVG_POWER);
            a(arrayList, mq.a.MAX_POWER);
            a(arrayList, mq.a.AVG_TEMPERATURE);
            a(arrayList, mq.a.CALORIES);
            a(arrayList, mq.a.DISTANCE);
        } else if (z0.J(str)) {
            a(arrayList, mq.a.AVG_NAUT_SOG);
            a(arrayList, mq.a.MAX_NAUT_SOG);
            a(arrayList, mq.a.TOTAL_TIME);
            a(arrayList, mq.a.MOVING_TIME);
            a(arrayList, mq.a.AVG_HR);
            a(arrayList, mq.a.MAX_HR);
            a(arrayList, mq.a.AVG_BIKE_CADENCE_DEFAULT_LABEL);
            a(arrayList, mq.a.MAX_BIKE_CADENCE_DEFAULT_LABEL);
            a(arrayList, mq.a.NORMALIZED_POWER);
            a(arrayList, mq.a.LR_BALANCE);
            a(arrayList, mq.a.AVG_POWER);
            a(arrayList, mq.a.MAX_POWER);
            a(arrayList, mq.a.AVG_TEMPERATURE);
            a(arrayList, mq.a.CALORIES);
            a(arrayList, mq.a.DISTANCE);
        } else {
            boolean zT = z0.t(str);
            boolean z14 = this.f120167h;
            if (zT) {
                if (z14) {
                    a(arrayList, mq.a.TARGET_TYPE);
                }
                a(arrayList, mq.a.TIME);
                a(arrayList, mq.a.CUMULATIVE_TIME);
                a(arrayList, mq.a.DISTANCE);
                a(arrayList, mq.a.AVG_SPEED);
                a(arrayList, mq.a.AVG_HR);
                a(arrayList, mq.a.MAX_HR);
                a(arrayList, mq.a.ELEV_GAIN);
                a(arrayList, mq.a.ELEV_LOSS);
                a(arrayList, mq.a.CALORIES);
                a(arrayList, mq.a.AVG_TEMPERATURE);
                a(arrayList, mq.a.MAX_SPEED);
                a(arrayList, mq.a.MOVING_TIME);
                a(arrayList, mq.a.AVG_MOVING_SPEED);
            } else {
                if (z14) {
                    a(arrayList, mq.a.TARGET_TYPE);
                }
                a(arrayList, mq.a.TIME);
                a(arrayList, mq.a.CUMULATIVE_TIME);
                a(arrayList, mq.a.MOVING_TIME);
                a(arrayList, mq.a.DISTANCE);
                a(arrayList, mq.a.ELEV_GAIN);
                a(arrayList, mq.a.ELEV_LOSS);
                a(arrayList, mq.a.AVG_SPEED);
                a(arrayList, mq.a.AVG_MOVING_SPEED);
                a(arrayList, mq.a.MAX_SPEED);
                a(arrayList, mq.a.AVG_GAP);
                a(arrayList, mq.a.AVG_PACE);
                a(arrayList, mq.a.BEST_PACE);
                a(arrayList, mq.a.AVG_HR);
                a(arrayList, mq.a.MAX_HR);
                a(arrayList, mq.a.AVG_TEMPERATURE);
                a(arrayList, mq.a.CALORIES);
            }
        }
        List<c0> list = this.f120163d;
        if (list != null && !list.isEmpty()) {
            for (c0 c0Var : list) {
                ArrayList<d0> arrayListD = c0Var.d();
                if (arrayListD != null && !arrayListD.isEmpty()) {
                    for (d0 d0Var : arrayListD) {
                        String appID = c0Var.getAppID();
                        if (d0Var.getIsLapVisible() && appID != null) {
                            arrayList.add(new j(appID, d0Var));
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    public ArrayList f(String str) {
        str.getClass();
        ArrayList arrayList = new ArrayList();
        z0 z0Var = z0.f4390a;
        if (z0.b(am.x0.O0, str)) {
            arrayList.add(mq.a.LAP);
            a(arrayList, mq.a.TIME);
            a(arrayList, mq.a.DISTANCE);
            a(arrayList, mq.a.AVG_PACE);
            return arrayList;
        }
        if (z0.b(am.x0.f4308n, str)) {
            arrayList.add(mq.a.LAP);
            a(arrayList, mq.a.TIME);
            a(arrayList, mq.a.DISTANCE);
            a(arrayList, mq.a.AVG_PACE);
            if (this.f120167h) {
                a(arrayList, mq.a.TARGET_TYPE);
            }
            return arrayList;
        }
        if (z0.b(am.x0.R0, str)) {
            arrayList.add(mq.a.SKI_RUN);
            a(arrayList, mq.a.ELEV_LOSS);
            a(arrayList, mq.a.DISTANCE_SHORT);
            a(arrayList, mq.a.MAX_SPEED);
            a(arrayList, mq.a.TIME);
            return arrayList;
        }
        if (z0.x(str)) {
            arrayList.add(mq.a.SKI_RUN);
            arrayList.add(mq.a.SPLIT_TYPE);
            a(arrayList, mq.a.TIME);
            a(arrayList, mq.a.DISTANCE);
            a(arrayList, mq.a.ASCENT_ELEV_GAIN);
            a(arrayList, mq.a.DESCENT_ELEV_LOSS);
            return arrayList;
        }
        if (z0.b(am.x0.f4312o, str)) {
            arrayList.add(mq.a.LAP);
            a(arrayList, mq.a.TIME);
            a(arrayList, mq.a.DISTANCE);
            a(arrayList, mq.a.AVG_SPEED);
            return arrayList;
        }
        if (z0.t(str) || z0.b(am.x0.f4357z3, str) || z0.b(am.x0.A3, str)) {
            arrayList.add(mq.a.LAP);
            if (this.f120167h) {
                a(arrayList, mq.a.TARGET_TYPE);
            }
            a(arrayList, mq.a.TIME);
            a(arrayList, mq.a.AVG_HR);
            a(arrayList, mq.a.CALORIES);
            return arrayList;
        }
        if (z0.b(am.x0.f4324r, str)) {
            if (z0.b(am.x0.f4317p1, str)) {
                arrayList.add(mq.a.LAP);
            } else {
                arrayList.add(mq.a.INTERVAL);
            }
            a(arrayList, mq.a.TIME);
            a(arrayList, mq.a.SWIM_DISTANCE);
            a(arrayList, mq.a.AVG_SWIM_PACE);
            return arrayList;
        }
        if (z0.b(am.x0.O1, str)) {
            arrayList.add(mq.a.LAP);
            a(arrayList, mq.a.TIME);
            a(arrayList, mq.a.DISTANCE);
            a(arrayList, mq.a.AVG_SPEED);
            return arrayList;
        }
        if (z0.b(am.x0.f4297k1, str)) {
            arrayList.add(mq.a.INTERVAL_SHORT);
            a(arrayList, mq.a.TIME);
            a(arrayList, mq.a.DISTANCE_SHORT);
            a(arrayList, mq.a.AVG_PACE);
            return arrayList;
        }
        if (z0.b(am.x0.f4352y2, str)) {
            arrayList.add(mq.a.ROUTE);
            a(arrayList, mq.a.DIFFICULTY);
            a(arrayList, mq.a.FALLS);
            a(arrayList, mq.a.STATUS);
            return arrayList;
        }
        if (z0.z(str)) {
            arrayList.add(mq.a.LAP);
            a(arrayList, mq.a.TIME);
            a(arrayList, mq.a.FLOORS);
            a(arrayList, mq.a.FLOOR_SPEED);
            return arrayList;
        }
        if (z0.M(str)) {
            arrayList.add(mq.a.DIVE_NUMBER);
            a(arrayList, mq.a.BOTTOM_TIME);
            a(arrayList, mq.a.MAX_DEPTH);
            a(arrayList, mq.a.SURFACE_INTERVAL);
            return arrayList;
        }
        if (z0.O(str)) {
            arrayList.add(mq.a.LAP);
            a(arrayList, mq.a.LAP_TIME);
            a(arrayList, mq.a.MAX_SPEED);
            a(arrayList, mq.a.AVG_SPEED);
            return arrayList;
        }
        if (z0.P(str)) {
            arrayList.add(mq.a.SKI_RUN);
            a(arrayList, mq.a.TIME);
            a(arrayList, mq.a.DISTANCE_SHORT);
            a(arrayList, mq.a.ELEV_LOSS);
            return arrayList;
        }
        if (z0.o(str)) {
            arrayList.add(mq.a.SPLIT);
            arrayList.add(mq.a.SPLIT_TYPE);
            a(arrayList, mq.a.TIME);
            a(arrayList, mq.a.DISTANCE);
            a(arrayList, mq.a.ASCENT_ELEV_GAIN);
            a(arrayList, mq.a.DESCENT_ELEV_LOSS);
            return arrayList;
        }
        if (z0.v(str)) {
            arrayList.add(mq.a.SPLIT);
            a(arrayList, mq.a.TIME);
            a(arrayList, mq.a.DISTANCE);
            a(arrayList, mq.a.AVG_SPEED);
            return arrayList;
        }
        if (z0.b(am.x0.f4320q, str) || z0.b(am.x0.F2, str)) {
            arrayList.add(mq.a.LAP);
            a(arrayList, mq.a.TIME);
            a(arrayList, mq.a.DISTANCE);
            a(arrayList, mq.a.AVG_PACE);
            return arrayList;
        }
        if (z0.U(str) || z0.s(str) || z0.Q(str)) {
            arrayList.add(mq.a.LAP);
            a(arrayList, mq.a.TIME);
            a(arrayList, mq.a.DISTANCE);
            a(arrayList, mq.a.AVG_PACE);
            return arrayList;
        }
        if (z0.b(am.x0.f4331t, str)) {
            arrayList.add(mq.a.LAP);
            a(arrayList, mq.a.TIME);
            a(arrayList, mq.a.DISTANCE);
            a(arrayList, mq.a.AVG_PACE);
            return arrayList;
        }
        if (z0.b(am.x0.C3, str)) {
            arrayList.add(mq.a.SONG);
            a(arrayList, mq.a.DANCE_TIME);
            a(arrayList, mq.a.MAX_HR_SHORT);
            a(arrayList, mq.a.AVG_TEMPO);
            return arrayList;
        }
        if (z0.b(am.x0.D3, str)) {
            arrayList.add(mq.a.ROUND);
            a(arrayList, mq.a.JUMP_TIME);
            a(arrayList, mq.a.REPS);
            a(arrayList, mq.a.JUMP_ROPE_SPEED);
            return arrayList;
        }
        if (z0.L(str)) {
            arrayList.add(mq.a.LAP);
            a(arrayList, mq.a.TIME);
            a(arrayList, mq.a.AVG_POWER);
            a(arrayList, mq.a.AVG_HR_SHORT);
            return arrayList;
        }
        if (z0.J(str)) {
            arrayList.add(mq.a.LAP);
            a(arrayList, mq.a.TIME);
            a(arrayList, mq.a.MAX_NAUT_SOG_SHORT);
            a(arrayList, mq.a.AVG_POWER);
            return arrayList;
        }
        if (z0.V(str)) {
            arrayList.add(mq.a.LAP);
            a(arrayList, mq.a.TIME);
            a(arrayList, mq.a.AVG_HR);
            a(arrayList, mq.a.CALORIES);
            return arrayList;
        }
        arrayList.add(mq.a.LAP);
        if (this.f120167h) {
            a(arrayList, mq.a.TARGET_TYPE);
        }
        a(arrayList, mq.a.TIME);
        a(arrayList, mq.a.DISTANCE);
        a(arrayList, mq.a.AVG_SPEED);
        return arrayList;
    }

    public final List<x0> g() {
        List<x0> list = this.f120168i;
        if (list != null) {
            return list;
        }
        s.m("mLaps");
        throw null;
    }

    public final int[] h() {
        int[] iArr = this.f120170k;
        if (iArr != null) {
            return iArr;
        }
        s.m("mLapsNumber");
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0095  */
    /* JADX WARN: Code duplicated, block: B:16:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:17:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:19:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:22:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:24:0x0120  */
    /* JADX WARN: Code duplicated, block: B:25:0x012d  */
    /* JADX WARN: Code duplicated, block: B:27:0x0131  */
    /* JADX WARN: Code duplicated, block: B:29:0x0135  */
    /* JADX WARN: Code duplicated, block: B:31:0x013d  */
    /* JADX WARN: Code duplicated, block: B:32:0x014c  */
    /* JADX WARN: Code duplicated, block: B:35:0x0163  */
    /* JADX WARN: Code duplicated, block: B:37:0x016f  */
    /* JADX WARN: Code duplicated, block: B:38:0x018c  */
    /* JADX WARN: Code duplicated, block: B:40:0x0196  */
    /* JADX WARN: Code duplicated, block: B:41:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:44:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:45:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:47:0x021d  */
    /* JADX WARN: Code duplicated, block: B:49:0x022d  */
    /* JADX WARN: Code duplicated, block: B:50:0x024a  */
    /* JADX WARN: Code duplicated, block: B:52:0x0254  */
    /* JADX WARN: Code duplicated, block: B:53:0x025c  */
    /* JADX WARN: Code duplicated, block: B:56:0x0263  */
    /* JADX WARN: Code duplicated, block: B:57:0x0292  */
    /* JADX WARN: Code duplicated, block: B:58:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:61:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:63:0x02db  */
    /* JADX WARN: Code duplicated, block: B:66:0x0309  */
    /* JADX WARN: Code duplicated, block: B:69:0x0311  */
    /* JADX WARN: Code duplicated, block: B:71:0x0334  */
    /* JADX WARN: Code duplicated, block: B:73:0x033b  */
    /* JADX WARN: Code duplicated, block: B:74:0x0358  */
    /* JADX WARN: Code duplicated, block: B:75:0x0375  */
    /* JADX WARN: Code duplicated, block: B:76:0x039a  */
    /* JADX WARN: Instruction removed from duplicated block: B:57:0x0292, please report this as an issue */
    public View i() {
        ViewGroup viewGroup;
        List<x0> listG;
        ArrayList arrayList;
        Context context;
        o0 o0VarG;
        LinearLayout linearLayout;
        LinearLayout linearLayout2;
        int i14;
        to.j jVar;
        LinearLayout linearLayout3;
        rs.b bVar;
        LinearLayout linearLayout4;
        l lVar;
        List<l> list;
        sr.b bVar2;
        to.j jVar2;
        int i15;
        ArrayList arrayList2;
        float f120143b;
        View viewA;
        List<x0> list2;
        Context context2;
        List<l> list3;
        sr.b bVar3;
        boolean z14;
        rs.b bVar4;
        String strL;
        int size;
        Context context3;
        double d14;
        sr.b bVar5;
        q1 q1Var;
        q1 q1Var2;
        String string;
        x0 x0Var;
        List<x0> list4;
        Context context4;
        String strF;
        String str;
        LinearLayout linearLayout5;
        o oVar;
        int i16;
        to.j jVar3;
        int iC;
        double d15;
        q1 q1Var3;
        Context context5 = this.f120160a;
        LinearLayout linearLayout6 = new LinearLayout(context5);
        linearLayout6.setOrientation(1);
        ViewGroup nestedScrollView = new NestedScrollView(context5);
        LinearLayout linearLayout7 = new LinearLayout(context5);
        linearLayout7.setOrientation(1);
        rs.b bVar6 = this.f120161b;
        ArrayList arrayListF = f(bVar6.f154297c.f154290a);
        to.j jVar4 = new to.j(0, 0, 0, this.f120169j, this.f120171l);
        f fVar = new f(context5, arrayListF, bVar6, jVar4, null);
        Context context6 = context5;
        rs.b bVar7 = bVar6;
        int iE = fb2.g.e(16, context6);
        linearLayout6.addView(fVar.c());
        z0 z0Var = z0.f4390a;
        boolean zB = z0.b(am.x0.f4324r, this.f120171l);
        int iJ = j();
        int i17 = 0;
        int i18 = 0;
        while (i17 < iJ) {
            if (!zB || i17 >= g().size()) {
                viewGroup = nestedScrollView;
                listG = g();
                arrayList = this.f120166g;
                context = fVar.f120192b.get();
                o0VarG = ((f12.l) KoinJavaComponent.get(f12.l.class)).g();
                if (context == null) {
                    linearLayout2 = linearLayout6;
                    arrayListF = arrayListF;
                    i14 = i17;
                    jVar = jVar4;
                    linearLayout4 = null;
                    iJ = iJ;
                    linearLayout3 = linearLayout7;
                    bVar = bVar7;
                } else {
                    linearLayout = (LinearLayout) LayoutInflater.from(context).inflate(R.layout.activity_stats_laps_list_data_row_3_0, (ViewGroup) null);
                    if (linearLayout != null) {
                        List<l> list5 = fVar.f120191a;
                        lVar = list5.get(0);
                        list = list5;
                        bVar2 = new sr.b(context);
                        jVar2 = fVar.f120178e;
                        i15 = jVar2.f165807b;
                        for (l lVar2 : list) {
                            arrayList2 = arrayList;
                            LinearLayout linearLayout8 = linearLayout6;
                            int f120187a = lVar2.getF120187a();
                            LinearLayout linearLayout9 = linearLayout7;
                            f120143b = lVar2.getF120143b();
                            rs.b bVar8 = bVar7;
                            int i19 = i17;
                            viewA = fVar.a(R.layout.activity_stats_laps_list_data_row_item_3_0, f120187a, null, null);
                            if (viewA != null) {
                                viewA.setLayoutParams(new LinearLayout.LayoutParams(0, -2, f120143b));
                            }
                            if (viewA != null) {
                                if (lVar == mq.a.LAP) {
                                    z14 = lVar2 instanceof mq.a;
                                    bVar4 = fVar.f120176c;
                                    if (z14) {
                                        strL = bVar2.l(h.f(context, lVar2, bVar4.f154298d, fVar.f120177d));
                                    } else {
                                        strL = "";
                                    }
                                    size = listG.size();
                                    context3 = context;
                                    d14 = this.f120164e;
                                    bVar5 = bVar2;
                                    if (i15 != size) {
                                        x0Var = listG.get(i15);
                                        int i24 = i15 + 1;
                                        if (z14) {
                                            List<x0> list6 = listG;
                                            o0 o0Var = o0VarG;
                                            strF = g.e(context3, (mq.a) lVar2, list6, x0Var, fVar.f120178e, o0Var, arrayList2, Double.valueOf(d14));
                                            context4 = context3;
                                            list4 = list6;
                                            o0VarG = o0Var;
                                        } else {
                                            list4 = listG;
                                            context4 = context3;
                                            if (lVar2 instanceof j) {
                                                strF = g.f(context4, (j) lVar2, x0Var);
                                                x0Var = x0Var;
                                            } else {
                                                x0Var = x0Var;
                                                strF = "";
                                            }
                                        }
                                        str = lVar + StringUtils.SPACE + i24;
                                        if (lVar2 == lVar) {
                                            StringBuilder sbK = e5.k(str);
                                            List<l> list7 = list;
                                            o0 o0Var2 = o0VarG;
                                            List<x0> list8 = list4;
                                            Context context7 = context4;
                                            context2 = context7;
                                            list = list7;
                                            o0VarG = o0Var2;
                                            sbK.append(g.c(context7, x0Var, list8, list7, fVar.f120178e, o0Var2, arrayList2, d14, fVar.f120176c, bVar5, Boolean.FALSE, fVar.f120177d));
                                            viewA.setContentDescription(sbK);
                                            list2 = list8;
                                            bVar3 = bVar5;
                                        } else {
                                            context2 = context4;
                                            list2 = list4;
                                            bVar3 = bVar5;
                                            StringBuilder sbI = sn.a.i(str, ", ");
                                            sbI.append(lVar2.d(context2, bVar3));
                                            sbI.append(", ");
                                            sbI.append(strF);
                                            sbI.append(strL);
                                            viewA.setContentDescription(sbI.toString());
                                        }
                                        list3 = list;
                                    } else {
                                        list2 = listG;
                                        bVar3 = bVar5;
                                        i15 = i15;
                                        arrayList2 = arrayList2;
                                        q1Var = bVar4.f154296b;
                                        if (z14 != 0) {
                                            string = g.g(context3, (mq.a) lVar2, q1Var, jVar2.f165809d, o0VarG, jVar2.f165810e, Double.valueOf(d14));
                                            context2 = context3;
                                            q1Var2 = q1Var;
                                        } else {
                                            q1Var2 = q1Var;
                                            context2 = context3;
                                            if (lVar2 instanceof j) {
                                                string = context2.getString(R.string.lbl_none);
                                            } else {
                                                string = "";
                                            }
                                        }
                                        if (lVar2 == lVar) {
                                            StringBuilder sb3 = new StringBuilder();
                                            sb3.append(context2.getString(R.string.lbl_total));
                                            list3 = list;
                                            sb3.append(g.d(context2, q1Var2, list3, fVar.f120178e, o0VarG, d14, fVar.f120176c, bVar3, Boolean.FALSE, fVar.f120177d));
                                            viewA.setContentDescription(sb3);
                                        } else {
                                            list3 = list;
                                            viewA.setContentDescription(context2.getString(R.string.lbl_total) + StringUtils.SPACE + lVar2.d(context2, bVar3) + ", " + string + strL);
                                        }
                                    }
                                } else {
                                    list2 = listG;
                                    i15 = i15;
                                    context2 = context;
                                    arrayList2 = arrayList2;
                                    list3 = list;
                                    bVar3 = bVar2;
                                }
                                if (n.b(lVar2.getF120187a())) {
                                    viewA.setTextAlignment(2);
                                }
                                linearLayout.addView(viewA);
                            } else {
                                jVar2 = jVar2;
                                list2 = listG;
                                i15 = i15;
                                context2 = context;
                                arrayList2 = arrayList2;
                                list3 = list;
                                bVar3 = bVar2;
                            }
                            context = context2;
                            bVar2 = bVar3;
                            arrayList = arrayList2;
                            jVar2 = jVar2;
                            list = list3;
                            listG = list2;
                            i15 = i15;
                            linearLayout6 = linearLayout8;
                            linearLayout7 = linearLayout9;
                            bVar7 = bVar8;
                            i17 = i19;
                            jVar4 = jVar4;
                        }
                    }
                    linearLayout2 = linearLayout6;
                    i14 = i17;
                    jVar = jVar4;
                    linearLayout3 = linearLayout7;
                    bVar = bVar7;
                    linearLayout4 = linearLayout;
                }
                if (linearLayout4 != null) {
                    linearLayout4.setPadding(iE, 0, iE, 0);
                    oVar = new o(linearLayout4, arrayListF.size(), fVar, false);
                    i16 = i14;
                    jVar3 = jVar;
                    jVar3.f165806a = i16;
                    jVar3.f165807b = h()[i16];
                    iC = c(i16);
                    d15 = this.f120164e;
                    if (iC != 0) {
                        bVar7 = bVar;
                        q1Var3 = bVar7.f154296b;
                        if (iC != 1) {
                            i14 = i16;
                            arrayListF = arrayListF;
                            jVar4 = jVar3;
                            context6 = context6;
                            g.b(context6, oVar, arrayListF, q1Var3, jVar4, Double.valueOf(d15), Integer.valueOf(i18));
                            i18++;
                            linearLayout5 = linearLayout3;
                            linearLayout5.addView(linearLayout4);
                        } else {
                            i14 = i16;
                            arrayListF = arrayListF;
                            linearLayout5 = linearLayout3;
                            jVar4 = jVar3;
                            context6 = context6;
                            g.b(context6, oVar, arrayListF, q1Var3, jVar4, Double.valueOf(d15), Integer.valueOf(i18));
                            i18++;
                            linearLayout5.addView(linearLayout4);
                        }
                    } else {
                        i14 = i16;
                        arrayListF = arrayListF;
                        linearLayout5 = linearLayout3;
                        bVar7 = bVar;
                        jVar4 = jVar3;
                        context6 = context6;
                        g.a(context6, oVar, arrayListF, g(), jVar4, this.f120166g, Double.valueOf(d15), Integer.valueOf(i18));
                        i18++;
                        linearLayout5.addView(linearLayout4);
                    }
                } else {
                    context6 = context6;
                    arrayListF = arrayListF;
                    linearLayout5 = linearLayout3;
                    bVar7 = bVar;
                    jVar4 = jVar;
                }
                i17 = i14 + 1;
                linearLayout7 = linearLayout5;
                nestedScrollView = viewGroup;
                iJ = iJ;
                linearLayout6 = linearLayout2;
            } else {
                x0 x0Var2 = g().get(i17);
                if (x0Var2.getDistance() != null) {
                    viewGroup = nestedScrollView;
                    if (s.c(x0Var2.getDistance(), 0.0d)) {
                        linearLayout2 = linearLayout6;
                        i14 = i17;
                        iJ = iJ;
                        linearLayout5 = linearLayout7;
                    }
                } else {
                    viewGroup = nestedScrollView;
                }
                listG = g();
                arrayList = this.f120166g;
                context = fVar.f120192b.get();
                o0VarG = ((f12.l) KoinJavaComponent.get(f12.l.class)).g();
                if (context == null) {
                    linearLayout2 = linearLayout6;
                    arrayListF = arrayListF;
                    i14 = i17;
                    jVar = jVar4;
                    linearLayout4 = null;
                    iJ = iJ;
                    linearLayout3 = linearLayout7;
                    bVar = bVar7;
                } else {
                    linearLayout = (LinearLayout) LayoutInflater.from(context).inflate(R.layout.activity_stats_laps_list_data_row_3_0, (ViewGroup) null);
                    if (linearLayout != null) {
                        List<l> list9 = fVar.f120191a;
                        lVar = list9.get(0);
                        list = list9;
                        bVar2 = new sr.b(context);
                        jVar2 = fVar.f120178e;
                        i15 = jVar2.f165807b;
                        while (r37.hasNext()) {
                            arrayList2 = arrayList;
                            LinearLayout linearLayout10 = linearLayout6;
                            int f120187a2 = lVar2.getF120187a();
                            LinearLayout linearLayout11 = linearLayout7;
                            f120143b = lVar2.getF120143b();
                            rs.b bVar9 = bVar7;
                            int i110 = i17;
                            viewA = fVar.a(R.layout.activity_stats_laps_list_data_row_item_3_0, f120187a2, null, null);
                            if (viewA != null) {
                                viewA.setLayoutParams(new LinearLayout.LayoutParams(0, -2, f120143b));
                            }
                            if (viewA != null) {
                                if (lVar == mq.a.LAP) {
                                    z14 = lVar2 instanceof mq.a;
                                    bVar4 = fVar.f120176c;
                                    if (z14) {
                                        strL = bVar2.l(h.f(context, lVar2, bVar4.f154298d, fVar.f120177d));
                                    } else {
                                        strL = "";
                                    }
                                    size = listG.size();
                                    context3 = context;
                                    d14 = this.f120164e;
                                    bVar5 = bVar2;
                                    if (i15 != size) {
                                        x0Var = listG.get(i15);
                                        int i25 = i15 + 1;
                                        if (z14) {
                                            List<x0> list10 = listG;
                                            o0 o0Var3 = o0VarG;
                                            strF = g.e(context3, (mq.a) lVar2, list10, x0Var, fVar.f120178e, o0Var3, arrayList2, Double.valueOf(d14));
                                            context4 = context3;
                                            list4 = list10;
                                            o0VarG = o0Var3;
                                        } else {
                                            list4 = listG;
                                            context4 = context3;
                                            if (lVar2 instanceof j) {
                                                strF = g.f(context4, (j) lVar2, x0Var);
                                                x0Var = x0Var;
                                            } else {
                                                x0Var = x0Var;
                                                strF = "";
                                            }
                                        }
                                        str = lVar + StringUtils.SPACE + i25;
                                        if (lVar2 == lVar) {
                                            StringBuilder sbK2 = e5.k(str);
                                            List<l> list11 = list;
                                            o0 o0Var4 = o0VarG;
                                            List<x0> list12 = list4;
                                            Context context8 = context4;
                                            context2 = context8;
                                            list = list11;
                                            o0VarG = o0Var4;
                                            sbK2.append(g.c(context8, x0Var, list12, list11, fVar.f120178e, o0Var4, arrayList2, d14, fVar.f120176c, bVar5, Boolean.FALSE, fVar.f120177d));
                                            viewA.setContentDescription(sbK2);
                                            list2 = list12;
                                            bVar3 = bVar5;
                                        } else {
                                            context2 = context4;
                                            list2 = list4;
                                            bVar3 = bVar5;
                                            StringBuilder sbI2 = sn.a.i(str, ", ");
                                            sbI2.append(lVar2.d(context2, bVar3));
                                            sbI2.append(", ");
                                            sbI2.append(strF);
                                            sbI2.append(strL);
                                            viewA.setContentDescription(sbI2.toString());
                                        }
                                        list3 = list;
                                    } else {
                                        list2 = listG;
                                        bVar3 = bVar5;
                                        i15 = i15;
                                        arrayList2 = arrayList2;
                                        q1Var = bVar4.f154296b;
                                        if (z14 != 0) {
                                            string = g.g(context3, (mq.a) lVar2, q1Var, jVar2.f165809d, o0VarG, jVar2.f165810e, Double.valueOf(d14));
                                            context2 = context3;
                                            q1Var2 = q1Var;
                                        } else {
                                            q1Var2 = q1Var;
                                            context2 = context3;
                                            if (lVar2 instanceof j) {
                                                string = context2.getString(R.string.lbl_none);
                                            } else {
                                                string = "";
                                            }
                                        }
                                        if (lVar2 == lVar) {
                                            StringBuilder sb4 = new StringBuilder();
                                            sb4.append(context2.getString(R.string.lbl_total));
                                            list3 = list;
                                            sb4.append(g.d(context2, q1Var2, list3, fVar.f120178e, o0VarG, d14, fVar.f120176c, bVar3, Boolean.FALSE, fVar.f120177d));
                                            viewA.setContentDescription(sb4);
                                        } else {
                                            list3 = list;
                                            viewA.setContentDescription(context2.getString(R.string.lbl_total) + StringUtils.SPACE + lVar2.d(context2, bVar3) + ", " + string + strL);
                                        }
                                    }
                                } else {
                                    list2 = listG;
                                    i15 = i15;
                                    context2 = context;
                                    arrayList2 = arrayList2;
                                    list3 = list;
                                    bVar3 = bVar2;
                                }
                                if (n.b(lVar2.getF120187a())) {
                                    viewA.setTextAlignment(2);
                                }
                                linearLayout.addView(viewA);
                            } else {
                                jVar2 = jVar2;
                                list2 = listG;
                                i15 = i15;
                                context2 = context;
                                arrayList2 = arrayList2;
                                list3 = list;
                                bVar3 = bVar2;
                            }
                            context = context2;
                            bVar2 = bVar3;
                            arrayList = arrayList2;
                            jVar2 = jVar2;
                            list = list3;
                            listG = list2;
                            i15 = i15;
                            linearLayout6 = linearLayout10;
                            linearLayout7 = linearLayout11;
                            bVar7 = bVar9;
                            i17 = i110;
                            jVar4 = jVar4;
                        }
                    }
                    linearLayout2 = linearLayout6;
                    i14 = i17;
                    jVar = jVar4;
                    linearLayout3 = linearLayout7;
                    bVar = bVar7;
                    linearLayout4 = linearLayout;
                }
                if (linearLayout4 != null) {
                    linearLayout4.setPadding(iE, 0, iE, 0);
                    oVar = new o(linearLayout4, arrayListF.size(), fVar, false);
                    i16 = i14;
                    jVar3 = jVar;
                    jVar3.f165806a = i16;
                    jVar3.f165807b = h()[i16];
                    iC = c(i16);
                    d15 = this.f120164e;
                    if (iC != 0) {
                        bVar7 = bVar;
                        q1Var3 = bVar7.f154296b;
                        if (iC != 1) {
                            i14 = i16;
                            arrayListF = arrayListF;
                            jVar4 = jVar3;
                            context6 = context6;
                            g.b(context6, oVar, arrayListF, q1Var3, jVar4, Double.valueOf(d15), Integer.valueOf(i18));
                            i18++;
                            linearLayout5 = linearLayout3;
                            linearLayout5.addView(linearLayout4);
                        } else {
                            i14 = i16;
                            arrayListF = arrayListF;
                            linearLayout5 = linearLayout3;
                            jVar4 = jVar3;
                            context6 = context6;
                            g.b(context6, oVar, arrayListF, q1Var3, jVar4, Double.valueOf(d15), Integer.valueOf(i18));
                            i18++;
                            linearLayout5.addView(linearLayout4);
                        }
                    } else {
                        i14 = i16;
                        arrayListF = arrayListF;
                        linearLayout5 = linearLayout3;
                        bVar7 = bVar;
                        jVar4 = jVar3;
                        context6 = context6;
                        g.a(context6, oVar, arrayListF, g(), jVar4, this.f120166g, Double.valueOf(d15), Integer.valueOf(i18));
                        i18++;
                        linearLayout5.addView(linearLayout4);
                    }
                } else {
                    context6 = context6;
                    arrayListF = arrayListF;
                    linearLayout5 = linearLayout3;
                    bVar7 = bVar;
                    jVar4 = jVar;
                }
                i17 = i14 + 1;
                linearLayout7 = linearLayout5;
                nestedScrollView = viewGroup;
                iJ = iJ;
                linearLayout6 = linearLayout2;
            }
            i17 = i14 + 1;
            linearLayout7 = linearLayout5;
            nestedScrollView = viewGroup;
            iJ = iJ;
            linearLayout6 = linearLayout2;
        }
        ViewGroup viewGroup2 = linearLayout6;
        ViewGroup viewGroup3 = nestedScrollView;
        ViewGroup viewGroup4 = linearLayout7;
        int i26 = b.f120175a[bVar7.f154295a.ordinal()];
        if (i26 != 1 && i26 != 2) {
            if (this.f120173n) {
                k.a(LayoutInflater.from(context6).inflate(R.layout.composable_container, viewGroup4), new mh1.i(this, 4));
            }
            LayoutInflater.from(context6).inflate(R.layout.orientation_hint, viewGroup4).findViewById(R.id.orientation_hint_img).setContentDescription(context6.getString(R.string.msg_rotate_phone_for_more_stats));
        }
        viewGroup3.addView(viewGroup4);
        viewGroup2.addView(viewGroup3);
        return viewGroup2;
    }

    public int j() {
        int i14 = 0;
        if (this.f120168i == null || g().isEmpty()) {
            return 0;
        }
        int size = g().size();
        String str = this.f120171l;
        if (!z0.M(str) && !z0.b(am.x0.f4352y2, str)) {
            i14 = 1;
        }
        return i14 + size;
    }

    public View k() {
        if (this.f120168i != null) {
            return this.f120165f ? i() : d();
        }
        return null;
    }

    public boolean l(int i14) {
        int iJ = j();
        String str = this.f120171l;
        return i14 < iJ - ((z0.M(str) || z0.b(am.x0.f4352y2, str)) ? 0 : 1);
    }

    public void m(List<x1> list, List<x0> list2, ln.b bVar, Boolean bool) {
        bVar.getClass();
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:46:0x00d8  */
    public final void n(List<x0> list, lq.h hVar) {
        boolean z14;
        Context context;
        String string;
        com.garmin.android.apps.connectmobile.activities.newmodel.j jVar;
        List<h0> listD;
        h0 h0VarD;
        int i14;
        int i15;
        list.getClass();
        hVar.getClass();
        this.f120168i = list;
        this.f120172m = hVar;
        if (g().isEmpty()) {
            return;
        }
        o();
        List<x0> listG = g();
        ArrayList<String> arrayList = new ArrayList(listG.size());
        Iterator<x0> it = listG.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            z14 = false;
            int i16 = 0;
            int i17 = 0;
            z14 = false;
            context = this.f120160a;
            if (!zHasNext) {
                break;
            }
            x0 next = it.next();
            int workoutIndex = next.getWorkoutIndex();
            int workoutStepIndex = next.getWorkoutStepIndex();
            List<com.garmin.android.apps.connectmobile.activities.newmodel.j> list2 = this.f120162c;
            if (list2 == null || list2.size() <= workoutIndex || workoutIndex < 0 || (jVar = list2.get(workoutIndex)) == null || (listD = jVar.d()) == null || listD.size() <= workoutStepIndex || (h0VarD = r1.d(workoutStepIndex, listD)) == null) {
                string = context.getString(R.string.no_value);
            } else if (h0VarD.b() == null || !h0VarD.b().equals(com.garmin.android.apps.connectmobile.activities.newmodel.j.b.ACTIVE.name())) {
                String strB = h0VarD.b();
                if (strB != null) {
                    com.garmin.android.apps.connectmobile.activities.newmodel.j.b[] bVarArrValues = com.garmin.android.apps.connectmobile.activities.newmodel.j.b.values();
                    int length = bVarArrValues.length;
                    while (true) {
                        if (i17 < length) {
                            com.garmin.android.apps.connectmobile.activities.newmodel.j.b bVar = bVarArrValues[i17];
                            if (strB.equals(bVar.name())) {
                                i14 = bVar.f29576a;
                                break;
                            }
                            i17++;
                        }
                    }
                    if (i14 != -1) {
                        string = context.getString(i14);
                    } else {
                        string = context.getString(R.string.no_value);
                    }
                } else {
                    com.garmin.android.apps.connectmobile.activities.newmodel.j.b bVar2 = com.garmin.android.apps.connectmobile.activities.newmodel.j.b.ACTIVE;
                }
                i14 = -1;
                if (i14 != -1) {
                    string = context.getString(i14);
                } else {
                    string = context.getString(R.string.no_value);
                }
            } else {
                String strB2 = jVar.b();
                m52.k.f116753m.getClass();
                strB2.getClass();
                m52.k[] kVarArrValues = m52.k.values();
                int length2 = kVarArrValues.length;
                while (true) {
                    if (i16 >= length2) {
                        i15 = -1;
                        break;
                    }
                    m52.k kVar = kVarArrValues[i16];
                    if (strB2.equalsIgnoreCase(kVar.f116765a)) {
                        i15 = kVar.f116769e;
                        break;
                    }
                    i16++;
                }
                string = i15 != -1 ? context.getString(i15) : context.getString(R.string.no_value);
            }
            arrayList.add(string);
        }
        this.f120166g = arrayList;
        String string2 = context.getString(R.string.no_value);
        for (String str : arrayList) {
            if (str != null && !str.equals(string2)) {
                if (!this.f120161b.f154299e) {
                    break;
                }
                z14 = true;
                break;
            }
        }
        this.f120167h = z14;
    }

    public void o() {
        int i14;
        int i15;
        z0 z0Var = z0.f4390a;
        boolean zB = z0.b(am.x0.f4324r, this.f120171l);
        this.f120170k = new int[j()];
        int i16 = 0;
        if (!zB) {
            int size = g().size();
            while (i16 < size) {
                int i17 = i16 + 1;
                h()[i16] = i17;
                i16 = i17;
            }
            return;
        }
        int size2 = g().size();
        int i18 = 0;
        int i19 = 0;
        while (i18 < size2) {
            x0 x0Var = g().get(i18);
            int[] iArrH = h();
            if (x0Var.getDistance() == null || !s.c(x0Var.getDistance(), 0.0d)) {
                i14 = i19 + 1;
                i15 = i14;
            } else {
                i15 = i19;
                i14 = 0;
            }
            iArrH[i18] = i14;
            i18++;
            i19 = i15;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lmq/e$a;", "", "<init>", "()V", "", "NO_DISPLAY_ROW_NUMBER", "I", "TYPE_LAP", "TYPE_TOTAL", "Lorg/slf4j/Logger;", "logger", "Lorg/slf4j/Logger;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
