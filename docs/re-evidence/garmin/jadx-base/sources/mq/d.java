package mq;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import d53.u;
import i3.e5;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.j0;
import p13.x;
import ps.c0;
import ps.g0;
import ps.o1;
import ps.p;
import ps.q1;
import ps.x0;
import ps.x1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0014BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\b\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lmq/d;", "Lmq/e;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lrs/b;", "lapsData", "Lps/p;", "activitySplits", "", "Lcom/garmin/android/apps/connectmobile/activities/newmodel/j;", "activityWorkouts", "", "Lps/c0;", "connectIqAppDtoList", "", "userWeight", "", "portrait", "<init>", "(Landroid/content/Context;Lrs/b;Lps/p;Ljava/util/List;Ljava/util/List;DZ)V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d extends e {
    public static final /* synthetic */ int B = 0;
    public Boolean A;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Context f120148q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final rs.b f120149r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final p f120150s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final double f120151t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final boolean f120152u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ArrayList f120153v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public o1 f120154w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ArrayList f120155x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final String f120156y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public ln.b f120157z;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f120158a;

        static {
            int[] iArr = new int[ln.b.values().length];
            try {
                iArr[ln.b.f113634h.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ln.b.f113636j.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f120158a = iArr;
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Context context, rs.b bVar, p pVar, List<? extends com.garmin.android.apps.connectmobile.activities.newmodel.j> list, List<c0> list2, double d14, boolean z14) {
        super(context, bVar, list, list2, d14, false, false, null);
        context.getClass();
        bVar.getClass();
        pVar.getClass();
        list.getClass();
        this.f120148q = context;
        this.f120149r = bVar;
        this.f120150s = pVar;
        this.f120151t = d14;
        this.f120152u = z14;
        this.f120153v = new ArrayList();
        this.f120155x = new ArrayList();
        this.f120157z = ln.b.f113638l;
        this.f120156y = bVar.f154298d.f12517a;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00a4 A[PHI: r2
      0x00a4: PHI (r2v6 java.lang.Double) = (r2v5 java.lang.Double), (r2v7 java.lang.Double) binds: [B:43:0x00ae, B:40:0x00a2] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // mq.e
    public final void a(ArrayList arrayList, mq.a aVar) {
        Object duration;
        Double avgPower;
        aVar.getClass();
        ls.e eVarA = mq.b.a(aVar);
        for (x1 x1Var : this.f120153v) {
            x1Var.getClass();
            int i14 = mq.b.a.f120144a[aVar.ordinal()];
            if (i14 == 1 || i14 == 2 || i14 == 3 || i14 == 4) {
                duration = x1Var.getDuration();
            } else if (i14 == 69) {
                duration = x1Var.getNormalizedPower();
            } else if (i14 == 70) {
                duration = new g0(x1Var.getLeftBalance(), x1Var.getRightBalance());
            } else if (i14 != 83) {
                switch (i14) {
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                        duration = x1Var.getMovingDuration();
                        break;
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                        duration = x1Var.getDistance();
                        break;
                    case 14:
                    case 15:
                    case 16:
                        duration = x1Var.getElevationGain();
                        break;
                    case 17:
                    case 18:
                    case 19:
                        duration = x1Var.getElevationLoss();
                        break;
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                        duration = x1Var.getAverageSpeed();
                        break;
                    case 25:
                        duration = x1Var.getAverageMovingSpeed();
                        break;
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                        duration = x1Var.getMaxSpeed();
                        break;
                    case 32:
                        duration = x1Var.getAvgGradeAdjustedSpeed();
                        break;
                    case 33:
                    case 34:
                        duration = x1Var.getAverageMovingSpeed();
                        break;
                    case 35:
                    case 36:
                        duration = x1Var.getAverageHR();
                        break;
                    case 37:
                    case 38:
                        duration = x1Var.getMaxHR();
                        break;
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                        duration = x1Var.getAverageRunCadence();
                        break;
                    case 43:
                    case 44:
                    case 45:
                        duration = x1Var.getMaxRunCadence();
                        break;
                    case 46:
                    case 47:
                        duration = x1Var.getAvgBikeCadence();
                        break;
                    case 48:
                    case 49:
                        duration = x1Var.getMaxBikeCadence();
                        break;
                    default:
                        double d14 = this.f120151t;
                        duration = null;
                        switch (i14) {
                            case 73:
                                duration = x1Var.getAvgPower();
                                break;
                            case 74:
                                duration = x1Var.getMaxPower();
                                break;
                            case 75:
                                avgPower = x1Var.getAvgPower();
                                if (avgPower != null) {
                                    duration = u0.h(d14, avgPower);
                                }
                                break;
                            case 76:
                                avgPower = x1Var.getMaxPower();
                                if (avgPower != null) {
                                    duration = u0.h(d14, avgPower);
                                }
                                break;
                            default:
                                switch (i14) {
                                    case 85:
                                        duration = x1Var.getMinTemperature();
                                        break;
                                    case 86:
                                        duration = x1Var.getMaxTemperature();
                                        break;
                                    case 87:
                                        duration = x1Var.getAvgTemperature();
                                        break;
                                    case 88:
                                        duration = x1Var.getCalories();
                                        break;
                                    default:
                                        switch (i14) {
                                            case 96:
                                                duration = x1Var.getGroundContactTime();
                                                break;
                                            case 97:
                                                duration = x1Var.getGroundContactBalanceLeft();
                                                break;
                                            case 98:
                                                duration = x1Var.getVerticalOscillation();
                                                break;
                                            case 99:
                                                duration = x1Var.getVerticalRatio();
                                                break;
                                            case 100:
                                            case 101:
                                                duration = x1Var.getAvgVerticalSpeed();
                                                break;
                                            default:
                                                switch (i14) {
                                                    case 116:
                                                        duration = x1Var.getMinTemperature();
                                                        break;
                                                    case 117:
                                                        duration = x1Var.getDifficulty();
                                                        break;
                                                    case 118:
                                                        duration = x1Var.getNumFalls();
                                                        break;
                                                    case 119:
                                                        duration = x1Var.G1();
                                                        break;
                                                }
                                                break;
                                        }
                                        break;
                                }
                                break;
                        }
                        break;
                }
            } else {
                duration = x1Var.getStrideLength();
            }
            if ((eVarA == null && duration != null) || (eVarA != null && ss.k.p(eVarA, duration))) {
                arrayList.add(aVar);
                return;
            }
        }
    }

    @Override // mq.e
    public final ArrayList b(String str) {
        str.getClass();
        return x.m(p());
    }

    @Override // mq.e
    public final int c(int i14) {
        return !l(i14) ? 1 : 0;
    }

    @Override // mq.e
    public final View d() {
        int i14;
        WeakReference<Context> weakReference;
        LinearLayout linearLayout;
        LinearLayout linearLayout2;
        ArrayList arrayList;
        List<l> list;
        Context context;
        to.j jVar;
        List<l> list2;
        boolean z14;
        boolean z15;
        o oVar;
        o oVar2;
        ArrayList arrayList2;
        int i15;
        Context context2 = this.f120148q;
        Object systemService = context2.getSystemService("layout_inflater");
        systemService.getClass();
        View viewInflate = ((LayoutInflater) systemService).inflate(R.layout.activity_stats_laps_landscape_3_0, (ViewGroup) null);
        LinearLayout linearLayout3 = (LinearLayout) viewInflate.findViewById(R.id.activity_stats_laps_number_container);
        LinearLayout linearLayout4 = (LinearLayout) viewInflate.findViewById(R.id.activity_stats_laps_data_container);
        LinearLayout linearLayout5 = (LinearLayout) viewInflate.findViewById(R.id.number_container);
        LinearLayout linearLayout6 = (LinearLayout) viewInflate.findViewById(R.id.data_container);
        ScrollView scrollView = (ScrollView) viewInflate.findViewById(R.id.number_scroll_view);
        ScrollView scrollView2 = (ScrollView) viewInflate.findViewById(R.id.data_scroll_view);
        lq.a aVar = new lq.a(scrollView2, 2);
        lq.a aVar2 = new lq.a(scrollView, 3);
        scrollView.setOnScrollChangeListener(aVar);
        scrollView2.setOnScrollChangeListener(aVar2);
        rs.a aVar3 = this.f120149r.f154297c;
        ArrayList arrayList3 = new ArrayList();
        a(arrayList3, mq.a.TIME);
        a(arrayList3, mq.a.CUMULATIVE_TIME);
        a(arrayList3, mq.a.DISTANCE);
        a(arrayList3, mq.a.AVG_PACE);
        a(arrayList3, mq.a.AVG_GAP);
        a(arrayList3, mq.a.AVG_HR);
        a(arrayList3, mq.a.MAX_HR);
        a(arrayList3, mq.a.ELEV_GAIN);
        a(arrayList3, mq.a.ELEV_LOSS);
        a(arrayList3, mq.a.AVG_POWER);
        a(arrayList3, mq.a.WEIGHT_AVG_POWER);
        a(arrayList3, mq.a.MAX_POWER);
        a(arrayList3, mq.a.WEIGHT_MAX_POWER);
        a(arrayList3, mq.a.AVG_RUN_CADENCE);
        a(arrayList3, mq.a.AVG_GCT);
        a(arrayList3, mq.a.AVG_GCT_BAL);
        a(arrayList3, mq.a.AVG_STRIDE_LENGTH);
        a(arrayList3, mq.a.AVG_VERT_OSC);
        a(arrayList3, mq.a.AVG_VERT_OSC_RATIO);
        a(arrayList3, mq.a.CALORIES);
        a(arrayList3, mq.a.BEST_PACE);
        a(arrayList3, mq.a.MAX_RUN_CADENCE);
        a(arrayList3, mq.a.MOVING_TIME);
        a(arrayList3, mq.a.AVG_MOVING_PACE);
        ArrayList arrayListB = b(aVar3.f154290a);
        ArrayList arrayListE = e(aVar3);
        ArrayList arrayListB2 = b(aVar3.f154290a);
        to.j jVar2 = new to.j(0, 0, 0, this.f120169j, aVar3.f154290a);
        h hVar = new h(this.f120148q, arrayList3, arrayListB, this.f120149r, jVar2, this.A);
        ArrayList arrayList4 = arrayListB;
        to.j jVar3 = jVar2;
        List<l> list3 = hVar.f120191a;
        LinearLayout linearLayoutE = hVar.e(list3, false);
        List<l> list4 = hVar.f120180c;
        LinearLayout linearLayoutE2 = hVar.e(list4, true);
        if (linearLayoutE != null) {
            linearLayout6.addView(linearLayoutE, 0);
        }
        if (linearLayoutE2 != null) {
            linearLayout5.addView(linearLayoutE2, 0);
        }
        int iJ = j() + 1;
        int i16 = 0;
        int i17 = 0;
        while (i16 < iJ) {
            WeakReference<Context> weakReference2 = hVar.f120192b;
            Context context3 = weakReference2.get();
            if (context3 == null) {
                i14 = iJ;
                weakReference = weakReference2;
                linearLayout = null;
            } else {
                String str = null;
                LinearLayout linearLayout7 = (LinearLayout) LayoutInflater.from(context3).inflate(R.layout.activity_stats_laps_list_data_row_3_0, (ViewGroup) null);
                if (linearLayout7 != null) {
                    for (l lVar : list3) {
                        int i18 = iJ;
                        int f120187a = lVar.getF120187a();
                        WeakReference<Context> weakReference3 = weakReference2;
                        int iG = hVar.g(lVar);
                        TextView textViewA = hVar.a(R.layout.activity_stats_laps_list_data_row_item_3_0, f120187a, str, str);
                        if (textViewA != null) {
                            textViewA.setLayoutParams(new LinearLayout.LayoutParams(iG, -2));
                        }
                        if (textViewA != null) {
                            if (n.b(lVar.getF120187a())) {
                                textViewA.setTextAlignment(2);
                            }
                            linearLayout7.addView(textViewA);
                        }
                        weakReference2 = weakReference3;
                        iJ = i18;
                        str = null;
                    }
                }
                i14 = iJ;
                weakReference = weakReference2;
                linearLayout = linearLayout7;
            }
            Context context4 = weakReference.get();
            if (context4 == null) {
                arrayList = arrayList4;
                list = list3;
                linearLayout2 = null;
            } else {
                String str2 = null;
                linearLayout2 = (LinearLayout) LayoutInflater.from(context4).inflate(R.layout.activity_stats_laps_list_data_row_3_0, (ViewGroup) null);
                if (linearLayout2 != null) {
                    Iterator<l> it = list4.iterator();
                    while (it.hasNext()) {
                        l next = it.next();
                        Iterator<l> it3 = it;
                        int f120187a2 = next.getF120187a();
                        ArrayList arrayList5 = arrayList4;
                        int iG2 = hVar.g(next);
                        List<l> list5 = list3;
                        TextView textViewA2 = hVar.a(R.layout.activity_stats_laps_list_data_row_item_3_0, f120187a2, str2, str2);
                        if (textViewA2 != null) {
                            textViewA2.setLayoutParams(new LinearLayout.LayoutParams(iG2, -2));
                        }
                        if (textViewA2 != null) {
                            if (n.b(next.getF120187a())) {
                                textViewA2.setTextAlignment(2);
                            }
                            linearLayout2.addView(textViewA2);
                        }
                        it = it3;
                        arrayList4 = arrayList5;
                        list3 = list5;
                        str2 = null;
                    }
                }
                arrayList = arrayList4;
                list = list3;
            }
            if (linearLayout == null || linearLayout2 == null) {
                context = context2;
                jVar = jVar3;
                list2 = list4;
                z14 = true;
            } else {
                int iE = fb2.g.e(16, context2);
                linearLayout2.setPadding(iE, 0, 0, 0);
                linearLayout.setPadding(0, 0, iE, 0);
                int size = this.f120157z.f113643d ? arrayList3.size() : arrayListE.size();
                int size2 = this.f120157z.f113643d ? arrayList.size() : arrayListB2.size();
                o oVar3 = new o(linearLayout, size, hVar, false);
                o oVar4 = new o(linearLayout2, size2, hVar, true);
                jVar3.f165806a = i16;
                jVar3.f165807b = this.f120157z.f113643d ? ((Number) this.f120155x.get(i16)).intValue() : h()[i16];
                int iC = c(i16);
                List<l> list6 = list4;
                Context context5 = this.f120160a;
                jVar = jVar3;
                double d14 = this.f120164e;
                if (iC != 0) {
                    context = context2;
                    z14 = true;
                    if (iC != 1) {
                        list2 = list6;
                    } else {
                        if (this.f120157z.f113643d) {
                            i iVar = i.f120185a;
                            o1 o1Var = this.f120154w;
                            Boolean bool = this.A;
                            iVar.getClass();
                            list2 = list6;
                            z15 = false;
                            i.a(this.f120148q, oVar3, arrayList3, o1Var, jVar, this.f120151t, i17, bool);
                            int i19 = i17;
                            ArrayList arrayList6 = arrayList;
                            i.a(this.f120148q, oVar4, arrayList6, this.f120154w, jVar, this.f120151t, i19, this.A);
                            arrayList2 = arrayList6;
                            i15 = i19;
                            jVar = jVar;
                        } else {
                            arrayList2 = arrayList;
                            list2 = list6;
                            i15 = i17;
                            z15 = false;
                            q1 q1Var = this.f120161b.f154296b;
                            ArrayList arrayList7 = arrayListE;
                            g.b(context5, oVar3, arrayList7, q1Var, jVar, Double.valueOf(d14), Integer.valueOf(i15));
                            arrayListE = arrayList7;
                            g.b(context5, oVar4, arrayListB2, q1Var, jVar, Double.valueOf(d14), Integer.valueOf(i15));
                        }
                        i17 = i15 + 1;
                        linearLayout4.addView(linearLayout);
                        linearLayout3.addView(linearLayout2);
                        arrayList = arrayList2;
                        arrayListE = arrayListE;
                    }
                } else {
                    ArrayList arrayList8 = arrayList;
                    context = context2;
                    hVar = hVar;
                    list2 = list6;
                    int i24 = i17;
                    list = list;
                    z14 = true;
                    z15 = false;
                    if (this.f120157z.f113643d) {
                        i iVar2 = i.f120185a;
                        ArrayList arrayList9 = this.f120153v;
                        Boolean bool2 = this.A;
                        iVar2.getClass();
                        oVar = oVar3;
                        i.b(this.f120148q, oVar, arrayList3, arrayList9, jVar, this.f120151t, i24, bool2);
                        linearLayout4.addView(linearLayout);
                        arrayList = arrayList8;
                        oVar2 = oVar4;
                        i.b(this.f120148q, oVar2, arrayList, this.f120153v, jVar, this.f120151t, i24, this.A);
                        i24 = i24;
                        jVar = jVar;
                        arrayListE = arrayListE;
                    } else {
                        arrayList = arrayList8;
                        oVar = oVar3;
                        arrayListE = arrayListE;
                        g.a(context5, oVar3, arrayListE, g(), jVar, this.f120166g, Double.valueOf(d14), Integer.valueOf(i24));
                        linearLayout4.addView(linearLayout);
                        g.a(context5, oVar4, arrayListB2, g(), jVar, this.f120166g, Double.valueOf(d14), Integer.valueOf(i24));
                        oVar2 = oVar4;
                    }
                    oVar.f120193a.post(new c(oVar2, oVar, 0));
                    linearLayout3.addView(linearLayout2);
                    i17 = i24 + 1;
                }
                i16++;
                hVar = hVar;
                arrayList4 = arrayList;
                arrayListE = arrayListE;
                jVar3 = jVar;
                iJ = i14;
                context2 = context;
                list3 = list;
                list4 = list2;
            }
            z15 = false;
            i17 = i17;
            i16++;
            hVar = hVar;
            arrayList4 = arrayList;
            arrayListE = arrayListE;
            jVar3 = jVar;
            iJ = i14;
            context2 = context;
            list3 = list;
            list4 = list2;
        }
        return viewInflate;
    }

    @Override // mq.e
    public final ArrayList f(String str) {
        str.getClass();
        ArrayList arrayList = new ArrayList();
        if (this.f120157z.f113643d) {
            arrayList.add(p());
            a(arrayList, mq.a.TIME);
            a(arrayList, mq.a.DISTANCE);
            a(arrayList, mq.a.AVG_PACE);
            return arrayList;
        }
        arrayList.add(mq.a.LAP);
        a(arrayList, mq.a.TIME);
        a(arrayList, mq.a.DISTANCE);
        a(arrayList, mq.a.AVG_PACE);
        if (this.f120167h) {
            a(arrayList, mq.a.TARGET_TYPE);
        }
        return arrayList;
    }

    @Override // mq.e
    public final View i() {
        int i14;
        ArrayList arrayList;
        LinearLayout linearLayout;
        boolean z14;
        int i15;
        Context context = this.f120148q;
        ScrollView scrollView = new ScrollView(context);
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        ArrayList arrayListF = f(this.f120149r.f154297c.f154290a);
        to.j jVar = new to.j(0, 0, 0, this.f120169j, this.f120156y);
        f fVar = new f(this.f120148q, arrayListF, this.f120149r, jVar, this.A);
        int iE = fb2.g.e(16, context);
        linearLayout2.addView(fVar.c());
        int iJ = j() + 1;
        int i16 = 0;
        int i17 = 0;
        while (i16 < iJ) {
            Context context2 = fVar.f120192b.get();
            String str = null;
            if (context2 == null) {
                i14 = iJ;
                arrayList = arrayListF;
                linearLayout = null;
            } else {
                LinearLayout linearLayout3 = (LinearLayout) LayoutInflater.from(context2).inflate(R.layout.activity_stats_laps_list_data_row_3_0, (ViewGroup) null);
                if (linearLayout3 != null) {
                    for (l lVar : fVar.f120191a) {
                        int f120187a = lVar.getF120187a();
                        float f120143b = lVar.getF120143b();
                        int i18 = iJ;
                        TextView textViewA = fVar.a(R.layout.activity_stats_laps_list_data_row_item_3_0, f120187a, str, str);
                        if (textViewA != null) {
                            textViewA.setLayoutParams(new LinearLayout.LayoutParams(0, -2, f120143b));
                        }
                        if (textViewA != null) {
                            if (n.b(lVar.getF120187a())) {
                                textViewA.setTextAlignment(2);
                            }
                            linearLayout3.addView(textViewA);
                        }
                        iJ = i18;
                        arrayListF = arrayListF;
                        str = null;
                    }
                }
                i14 = iJ;
                arrayList = arrayListF;
                linearLayout = linearLayout3;
            }
            if (linearLayout != null) {
                linearLayout.setPadding(iE, 0, iE, 0);
                o oVar = new o(linearLayout, arrayList.size(), fVar, false);
                jVar.f165806a = i16;
                jVar.f165807b = ((Number) this.f120155x.get(i16)).intValue();
                int iC = c(i16);
                if (iC == 0) {
                    i15 = i16;
                    arrayListF = arrayList;
                    z14 = true;
                    i iVar = i.f120185a;
                    ArrayList arrayList2 = this.f120153v;
                    Boolean bool = this.A;
                    iVar.getClass();
                    i.b(this.f120148q, oVar, arrayListF, arrayList2, jVar, this.f120151t, i17, bool);
                    i17++;
                    linearLayout2.addView(linearLayout);
                } else if (iC != 1) {
                    z14 = true;
                } else {
                    i iVar2 = i.f120185a;
                    int i19 = i16;
                    o1 o1Var = this.f120154w;
                    Boolean bool2 = this.A;
                    iVar2.getClass();
                    z14 = true;
                    i15 = i19;
                    arrayListF = arrayList;
                    i.a(this.f120148q, oVar, arrayListF, o1Var, jVar, this.f120151t, i17, bool2);
                    i17++;
                    linearLayout2.addView(linearLayout);
                }
                i16 = i15 + 1;
                iJ = i14;
            } else {
                z14 = true;
            }
            i15 = i16;
            arrayListF = arrayList;
            i16 = i15 + 1;
            iJ = i14;
        }
        LayoutInflater.from(context).inflate(R.layout.orientation_hint, linearLayout2).findViewById(R.id.orientation_hint_img).setContentDescription(context.getString(R.string.msg_rotate_phone_for_more_stats));
        scrollView.addView(linearLayout2);
        return scrollView;
    }

    @Override // mq.e
    public final int j() {
        return this.f120157z.f113643d ? this.f120153v.size() : super.j();
    }

    @Override // mq.e
    public final View k() {
        Object obj;
        ln.b bVar = this.f120157z;
        boolean z14 = bVar.f113643d;
        boolean z15 = this.f120152u;
        if (!z14) {
            this.f120165f = z15;
            if (g().isEmpty()) {
                return null;
            }
            return this.f120165f ? super.i() : super.d();
        }
        ln.b.a aVar = ln.b.f113631e;
        String str = bVar.f113640a;
        aVar.getClass();
        str.getClass();
        int i14 = 0;
        Object[] array = qs.x.P0.toArray(new qs.x[0]);
        int length = array.length;
        while (true) {
            if (i14 >= length) {
                obj = null;
                break;
            }
            obj = array[i14];
            if (s.g(((qs.x) obj).f147220a, str)) {
                break;
            }
            i14++;
        }
        qs.x xVar = (qs.x) obj;
        List<x1> listI = this.f120150s.i();
        if (listI == null) {
            listI = new ArrayList<>();
        }
        ArrayList arrayList = new ArrayList();
        for (x1 x1Var : listI) {
            if (x1Var.a2() != null) {
                qs.x xVarA2 = x1Var.a2();
                if (u.q(xVarA2 != null ? xVarA2.f147220a : null, this.f120157z.f113640a, true)) {
                    arrayList.add(x1Var);
                }
            }
        }
        this.f120153v = arrayList;
        this.f120154w = ss.l.c(this.f120149r.f154302h, xVar);
        return z15 ? i() : d();
    }

    @Override // mq.e
    public final boolean l(int i14) {
        if (this.f120157z.f113643d) {
            return i14 < j();
        }
        return super.l(i14);
    }

    @Override // mq.e
    public final void m(List<x1> list, List<x0> list2, ln.b bVar, Boolean bool) {
        bVar.getClass();
        this.f120153v = list != null ? new ArrayList(list) : new ArrayList();
        if (list2 == null) {
            list2 = j0.f134944a;
        }
        list2.getClass();
        this.f120168i = list2;
        this.f120157z = bVar;
        this.A = bool;
        if (!bVar.f113643d) {
            if (g().isEmpty()) {
                return;
            }
            o();
        } else {
            if (this.f120153v.isEmpty()) {
                return;
            }
            int iJ = j();
            ArrayList arrayList = new ArrayList(iJ);
            int i14 = 0;
            for (int iD = 0; iD < iJ; iD = e5.d(0, iD, arrayList, 1)) {
            }
            this.f120155x = arrayList;
            int size = this.f120153v.size();
            while (i14 < size) {
                int i15 = i14 + 1;
                this.f120155x.set(i14, Integer.valueOf(i15));
                i14 = i15;
            }
        }
    }

    public final mq.a p() {
        int i14 = b.f120158a[this.f120157z.ordinal()];
        if (i14 == 1 || i14 == 2) {
            return mq.a.LAP;
        }
        ln.b bVar = this.f120157z;
        if (bVar == ln.b.f113635i || bVar == ln.b.f113637k) {
            return mq.a.SPLIT;
        }
        return bVar == ln.b.f113633g ? mq.a.INTERVAL : mq.a.LAP;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lmq/d$a;", "", "<init>", "()V", "", "TYPE_LAP", "I", "TYPE_TOTAL", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
