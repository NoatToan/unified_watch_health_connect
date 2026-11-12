package lo;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.ActivityTypesActivity;
import com.garmin.android.apps.connectmobile.activities.PrivacyType;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexTwoLineButton;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;
import java.util.function.UnaryOperator;
import org.apache.commons.lang3.time.TimeZones;
import org.json.JSONException;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes7.dex */
public class b extends t {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public oo.k f113711h;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f113712a;

        static {
            int[] iArr = new int[fw.p.values().length];
            f113712a = iArr;
            try {
                iArr[fw.p.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f113712a[fw.p.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f113712a[fw.p.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @Override // lo.f0.d
    public final void A3(am.x0 x0Var, am.x0 x0Var2) {
        ActivityTypesActivity.f28779c.getClass();
        ActivityTypesActivity.a.b(this, null, x0Var, x0Var2, false, false);
    }

    @Override // lo.f0.d
    public final void j4(am.x0 x0Var) {
        ActivityTypesActivity.f28779c.getClass();
        x0Var.getClass();
        ActivityTypesActivity.a.b(this, null, x0Var, null, false, false);
    }

    @Override // lo.t, androidx.fragment.app.Fragment
    public final void onActivityResult(int i14, int i15, Intent intent) {
        if (i15 == -1 && i14 == 10) {
            this.f113711h.x4(am.z0.l(am.x0.f4308n, intent.getStringExtra("GCM_extra_activity_type")), this.f113949a.H1);
        }
        super.onActivityResult(i14, i15, intent);
    }

    @Override // lo.t, androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        super.onViewCreated(view2, bundle);
        Bundle arguments = getArguments();
        am.x0 x0VarT = (arguments == null || !arguments.containsKey("extra_activity_type")) ? null : (am.x0) arguments.getSerializable("extra_activity_type");
        am.d dVar = (am.d) KoinJavaComponent.get(am.d.class);
        if (x0VarT == null) {
            x0VarT = dVar.T();
        }
        am.x0 x0Var = x0VarT;
        f0 f0Var = new f0(requireActivity(), Calendar.getInstance(Locale.getDefault()), x0Var, false, this);
        this.f113949a = f0Var;
        f0.w0(f0Var.f113775f, f0Var.Y1.get("name"), f0Var.E1);
        f0.w0(f0Var.f113765c1, f0Var.Y1.get("notes"), f0Var.D1);
        f0Var.c();
        double dC0 = f0Var.c0("min_temperature");
        GCMComplexTwoLineButton gCMComplexTwoLineButton = f0Var.H;
        f0.v0(gCMComplexTwoLineButton, f0.T(gCMComplexTwoLineButton, dC0));
        double dC1 = f0Var.c0("average_temperature");
        GCMComplexTwoLineButton gCMComplexTwoLineButton2 = f0Var.F;
        f0.v0(gCMComplexTwoLineButton2, f0.T(gCMComplexTwoLineButton2, dC1));
        double dC2 = f0Var.c0("max_temperature");
        GCMComplexTwoLineButton gCMComplexTwoLineButton3 = f0Var.G;
        f0.v0(gCMComplexTwoLineButton3, f0.T(gCMComplexTwoLineButton3, dC2));
        GCMComplexTwoLineButton gCMComplexTwoLineButton4 = f0Var.f113836w;
        f0.v0(gCMComplexTwoLineButton4, f0.O(gCMComplexTwoLineButton4.getContext(), f0Var.c0("max_heart_rate")));
        GCMComplexTwoLineButton gCMComplexTwoLineButton5 = f0Var.f113833v;
        f0.v0(gCMComplexTwoLineButton5, f0.O(gCMComplexTwoLineButton5.getContext(), f0Var.c0("max_heart_rate")));
        GCMComplexTwoLineButton gCMComplexTwoLineButton6 = f0Var.f113839x;
        f0.v0(gCMComplexTwoLineButton6, f0.Q(gCMComplexTwoLineButton6.getContext(), f0Var.c0("average_respiration_rate")));
        GCMComplexTwoLineButton gCMComplexTwoLineButton7 = f0Var.f113842y;
        f0.v0(gCMComplexTwoLineButton7, f0.Q(gCMComplexTwoLineButton7.getContext(), f0Var.c0("max_respiration_rate")));
        GCMComplexTwoLineButton gCMComplexTwoLineButton8 = f0Var.P;
        f0.w0(gCMComplexTwoLineButton8, c22.l3.e(gCMComplexTwoLineButton8.getContext(), f0Var.c0("floors_climbed")), f0Var.P.getContext().getString(R.string.lbl_climbed));
        double dC3 = f0Var.c0("elevation_gain");
        GCMComplexTwoLineButton gCMComplexTwoLineButton9 = f0Var.A;
        f0.v0(gCMComplexTwoLineButton9, f0Var.N(gCMComplexTwoLineButton9, dC3));
        double dC4 = f0Var.c0("elevation_loss");
        GCMComplexTwoLineButton gCMComplexTwoLineButton10 = f0Var.B;
        f0.v0(gCMComplexTwoLineButton10, f0Var.N(gCMComplexTwoLineButton10, dC4));
        double dC5 = f0Var.c0("avgAscent");
        GCMComplexTwoLineButton gCMComplexTwoLineButton11 = f0Var.C;
        f0.v0(gCMComplexTwoLineButton11, f0Var.N(gCMComplexTwoLineButton11, dC5));
        double dC6 = f0Var.c0("maxAscent");
        GCMComplexTwoLineButton gCMComplexTwoLineButton12 = f0Var.D;
        f0.v0(gCMComplexTwoLineButton12, f0Var.N(gCMComplexTwoLineButton12, dC6));
        double dC7 = f0Var.c0("totalAscent");
        GCMComplexTwoLineButton gCMComplexTwoLineButton13 = f0Var.E;
        f0.v0(gCMComplexTwoLineButton13, f0Var.N(gCMComplexTwoLineButton13, dC7));
        double dC8 = f0Var.c0("average_cadence");
        GCMComplexTwoLineButton gCMComplexTwoLineButton14 = f0Var.J;
        f0.v0(gCMComplexTwoLineButton14, f0Var.M(gCMComplexTwoLineButton14, dC8));
        f0.v0(f0Var.K, f0Var.M(f0Var.B, f0Var.c0("max_cadence")));
        f0Var.M0(f0Var.G1);
        f0Var.O0(f0Var.H1);
        f0Var.Q0(f0Var.J1);
        f0Var.J0(f0Var.I1);
        f0Var.P0(f0Var.I1);
        qs.g gVar = f0Var.L1;
        f0Var.L1 = gVar;
        GCMComplexTwoLineButton gCMComplexTwoLineButton15 = f0Var.f113811o;
        if (gCMComplexTwoLineButton15 != null) {
            f0.v0(gCMComplexTwoLineButton15, gCMComplexTwoLineButton15.getContext().getString(gVar.f147087d));
        }
        GCMComplexTwoLineButton gCMComplexTwoLineButton16 = f0Var.f113815p;
        if (gCMComplexTwoLineButton16 != null) {
            f0.v0(gCMComplexTwoLineButton16, gCMComplexTwoLineButton16.getContext().getString(gVar.f147087d));
        }
        f0Var.K0();
        f0Var.g1();
        f0Var.e();
        this.f113949a.R0();
        Button button = (Button) view2.findViewById(R.id.btn_save_manual_activity);
        Button button2 = (Button) view2.findViewById(R.id.btn_cancel_manual_activity);
        final int i14 = 0;
        button.setOnClickListener(new View.OnClickListener(this) { // from class: lo.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f113706b;

            {
                this.f113706b = this;
            }

            /* JADX WARN: Code duplicated, block: B:155:0x0ace  */
            /* JADX WARN: Code duplicated, block: B:157:0x0ada  */
            /* JADX WARN: Code duplicated, block: B:158:0x0ade  */
            /* JADX WARN: Code duplicated, block: B:162:0x0b00  */
            /* JADX WARN: Code duplicated, block: B:169:0x0b2a  */
            /* JADX WARN: Code duplicated, block: B:172:0x0b9e  */
            /* JADX WARN: Code duplicated, block: B:173:0x0ba2  */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                Class cls;
                b bVar;
                com.garmin.android.apps.connectmobile.activities.newmodel.h hVar;
                com.garmin.android.apps.connectmobile.activities.newmodel.i0 i0Var;
                String str;
                com.garmin.android.apps.connectmobile.activities.newmodel.s sVar;
                am.z0 z0Var;
                String str2;
                double dC9;
                d80.f<com.garmin.android.apps.connectmobile.activities.newmodel.h> fVar;
                double dR1;
                oo.l lVar;
                String strX;
                ps.a1 a1Var;
                d80.f<com.garmin.android.apps.connectmobile.activities.newmodel.h> fVar2;
                int i15 = i14;
                b bVar2 = this.f113706b;
                switch (i15) {
                    case 0:
                        if (g22.e.e(bVar2)) {
                            g22.e.l(bVar2);
                            am.d dVar2 = (am.d) KoinJavaComponent.get(am.d.class);
                            dVar2.c0(bVar2.f113949a.J1);
                            f0 f0Var2 = bVar2.f113949a;
                            dVar2.X(f0Var2.M1, f0Var2.N1);
                            final k kVar = new k(bVar2.f113949a, true);
                            f0 f0Var3 = kVar.f113887a;
                            HashMap<String, Double> map = f0Var3.Z1;
                            HashMap<String, String> map2 = f0Var3.Y1;
                            com.garmin.android.apps.connectmobile.activities.newmodel.h hVar2 = kVar.f113889c;
                            ps.a1 a1Var2 = hVar2.f29459l;
                            ps.a1 a1Var3 = a1Var2 == null ? new ps.a1(null, null, null, null, null, null, null, null, null, null, null, 0, 0, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 524287, null) : a1Var2;
                            com.garmin.android.apps.connectmobile.courses.model.d dVar3 = f0Var3.f113806m2;
                            String str3 = dVar3 != null ? dVar3.courseId : null;
                            if (str3 == null) {
                                str3 = "";
                            }
                            hVar2.f29459l = ps.a1.b(a1Var3, null, str3, null, false, Integer.valueOf(f0Var3.X() == 0 ? 1 : f0Var3.X()), null, null, null, -9, 524286);
                            if (hVar2.f29460m == null) {
                                hVar2.f29460m = new com.garmin.android.apps.connectmobile.activities.newmodel.i0();
                            }
                            com.garmin.android.apps.connectmobile.activities.newmodel.i0 i0Var2 = hVar2.f29460m;
                            hVar2.f29450c = map2.get("notes");
                            hVar2.f29449b = map2.get("name");
                            qs.g gVar2 = f0Var3.L1;
                            gVar2.getClass();
                            hVar2.f29456i = new ps.p0(gVar2);
                            am.x0 x0Var2 = f0Var3.J1;
                            hVar2.getClass();
                            am.z0 z0Var2 = am.z0.f4390a;
                            hVar2.f29455h = ((am.y0) KoinJavaComponent.get$default(am.y0.class, null, null, 6, null)).f(x0Var2);
                            hVar2.Z(f0Var3.H1);
                            i0Var2.getClass();
                            ps.s1 s1Var = hVar2.f29458k;
                            if (s1Var == null || TextUtils.isEmpty(s1Var.getCom.google.firebase.remoteconfig.RemoteConfigConstants.RequestFieldKey.TIME_ZONE java.lang.String())) {
                                Calendar calendar = f0Var3.I1;
                                calendar.getClass();
                                String strF = c22.j0.f(calendar, "yyyy-MM-dd'T'HH:mm:ss.SSS", null);
                                String strF2 = c22.j0.f(calendar, "yyyy-MM-dd'T'HH:mm:ss.SSS", TimeZone.getTimeZone(TimeZones.GMT_ID));
                                i0Var2.f29484a = strF;
                                i0Var2.f29488b = strF2;
                            } else {
                                Calendar calendar2 = f0Var3.I1;
                                calendar2.getClass();
                                Calendar calendar3 = Calendar.getInstance();
                                calendar3.setTimeZone(TimeZone.getTimeZone(hVar2.f29458k.getCom.google.firebase.remoteconfig.RemoteConfigConstants.RequestFieldKey.TIME_ZONE java.lang.String()));
                                calendar3.set(1, calendar2.get(1));
                                calendar3.set(2, calendar2.get(2));
                                calendar3.set(5, calendar2.get(5));
                                calendar3.set(10, calendar2.get(10));
                                calendar3.set(12, calendar2.get(12));
                                calendar3.set(13, calendar2.get(13));
                                calendar3.set(9, calendar2.get(9));
                                calendar3.set(11, calendar2.get(11));
                                calendar3.set(14, calendar2.get(14));
                                String strF3 = c22.j0.f(calendar3, "yyyy-MM-dd'T'HH:mm:ss.SSS", calendar3.getTimeZone());
                                String str4 = i0Var2.f29484a;
                                if (str4 == null || !d53.u.y(strF3, str4, false)) {
                                    String strF4 = c22.j0.f(calendar3, "yyyy-MM-dd'T'HH:mm:ss.SSS", TimeZone.getTimeZone(TimeZones.GMT_ID));
                                    i0Var2.f29484a = strF3;
                                    i0Var2.f29488b = strF4;
                                }
                            }
                            i0Var2.F = f0Var3.c0("average_temperature");
                            i0Var2.I = f0Var3.c0("max_temperature");
                            i0Var2.P = f0Var3.c0("min_temperature");
                            if (ar.i.a(hVar2)) {
                                i0Var2.H2 = f0Var3.A1;
                                i0Var2.I2 = f0Var3.B1;
                            }
                            i0Var2.f29560x = f0Var3.c0("average_heart_rate");
                            i0Var2.f29563y = f0Var3.c0("max_heart_rate");
                            i0Var2.f29553u2 = f0Var3.c0("average_respiration_rate");
                            i0Var2.f29551t2 = f0Var3.c0("max_respiration_rate");
                            i0Var2.R1 = f0Var3.c0("floors_climbed");
                            i0Var2.T1 = Double.NaN;
                            i0Var2.U1 = Double.NaN;
                            i0Var2.f29526l = f0Var3.c0("elevation_gain");
                            i0Var2.f29529m = f0Var3.c0("elevation_loss");
                            i0Var2.f29544r = f0Var3.c0("max_speed");
                            ps.a1 a1Var4 = hVar2.f29459l;
                            a1Var4.getClass();
                            hVar2.f29459l = ps.a1.b(a1Var4, null, null, Boolean.valueOf(kVar.f113888b), false, null, null, null, null, -33, 524287);
                            if (f0Var3.t0()) {
                                i0Var2.f29557w = f0Var3.c0("bmrCalories");
                                i0Var2.f29549t = f0Var3.c0("calories_burned");
                                i0Var2.f29546r2 = f0Var3.c0("calories_consumed");
                                i0Var2.f29559w2 = f0Var3.c0("fluids_loss");
                                i0Var2.f29562x2 = f0Var3.c0("fluids_consumed");
                            } else {
                                i0Var2.f29557w = f0Var3.c0("bmrCalories");
                                i0Var2.f29549t = f0Var3.c0("calories");
                            }
                            double d14 = i0Var2.f29549t;
                            if (Double.isNaN(d14)) {
                                d14 = 0.0d;
                            }
                            i0Var2.f29549t = d14;
                            i0Var2.f29566z = f0Var3.y();
                            i0Var2.A = f0Var3.b0();
                            i0Var2.B = f0Var3.x();
                            i0Var2.C = f0Var3.a0();
                            String str5 = f0Var3.J1.f4358a;
                            am.x0 x0Var3 = am.x0.f4268a3;
                            i0Var2.O2 = am.z0.b(x0Var3, str5) ? f0Var3.c0("average_cadence") : Double.NaN;
                            i0Var2.P2 = am.z0.b(x0Var3, f0Var3.J1.f4358a) ? f0Var3.c0("max_cadence") : Double.NaN;
                            i0Var2.T = f0Var3.g0("average_power");
                            i0Var2.X = f0Var3.g0("max_power");
                            i0Var2.Y = f0Var3.g0("max_average_power");
                            double d15 = f0Var3.G1;
                            i0Var2.f29516i = d15;
                            i0Var2.f29522k = d15;
                            i0Var2.f29519j = Double.NaN;
                            i0Var2.f29512h = f0Var3.q();
                            i0Var2.S2 = Double.NaN;
                            i0Var2.T2 = Double.NaN;
                            int iX = f0Var3.X() == 0 ? 1 : f0Var3.X();
                            String str6 = f0Var3.J1.f4358a;
                            try {
                                if (am.z0.b(am.x0.f4313o1, str6)) {
                                    i0Var2.f29501e1 = f0Var3.M1;
                                    i0Var2.f29505f1 = f0Var3.O1;
                                    f0.e eVarA = f0.e.a(f0Var3.N1, f0.e.METER);
                                    i0Var2.f29509g1 = new ps.z1(Double.valueOf(eVarA.f113856c), Integer.valueOf(eVarA.f113855b), eVarA.f113854a);
                                } else if (am.z0.O(str6)) {
                                    hVar2.f29454g = f0Var3.Y();
                                    i0Var2.f29516i = f0Var3.c0("elapsed_time");
                                    c22.l3.a aVar = c22.l3.f23124b;
                                    double dC10 = f0Var3.c0("bestLapTime");
                                    aVar.getClass();
                                    i0Var2.f29565y2 = dC10 / ((double) 1000);
                                    i0Var2.f29544r = f0Var3.c0("racingMaxSpeed");
                                    i0Var2.f29512h = f0Var3.q() * ((double) iX);
                                } else if (am.z0.b(am.x0.f4352y2, str6)) {
                                    ps.o1 o1Var = new ps.o1(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, 7, null);
                                    o1Var.V1(qs.x.CLIMB_ACTIVE.f147220a);
                                    o1Var.M1(Integer.valueOf((int) f0Var3.c0("routes")));
                                    o1Var.v1(Double.valueOf(f0Var3.c0("avgAscent")));
                                    o1Var.F1(Double.valueOf(f0Var3.c0("maxAscent")));
                                    o1Var.A1(Double.valueOf(f0Var3.c0("totalAscent")));
                                    o1Var.U1(null);
                                    o1Var.S1(null);
                                    ArrayList arrayList = new ArrayList();
                                    arrayList.add(o1Var);
                                    hVar2.f29464q = arrayList;
                                    i0Var2.f29526l = Double.NaN;
                                } else if (am.z0.b(am.x0.f4356z2, str6)) {
                                    ps.o1 o1Var2 = new ps.o1(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, 7, null);
                                    o1Var2.V1(qs.x.CLIMB_ACTIVE.f147220a);
                                    o1Var2.M1(Integer.valueOf((int) f0Var3.c0("routes")));
                                    o1Var2.G1(am.v1.c(f0Var3.J1.f4358a, map2.get("difficultyScale"), map2.get("max_difficulty")));
                                    ArrayList arrayList2 = new ArrayList();
                                    arrayList2.add(o1Var2);
                                    hVar2.f29464q = arrayList2;
                                    i0Var2.f29526l = Double.NaN;
                                } else if (!am.z0.b(am.x0.D2, str6)) {
                                    if (am.z0.P(str6)) {
                                        ArrayList<ps.o1> arrayList3 = hVar2.f29464q;
                                        arrayList3.getClass();
                                        if (!arrayList3.isEmpty()) {
                                            for (ps.o1 o1Var3 : arrayList3) {
                                                if (p005kotlin.jvm.internal.s.g(o1Var3.getSplitType(), qs.x.SKI_RUN.f147220a) || p005kotlin.jvm.internal.s.g(o1Var3.getSplitType(), qs.x.SKI_LIFT.f147220a)) {
                                                    hVar2.f29464q.replaceAll(new UnaryOperator() { // from class: lo.j
                                                        @Override // java.util.function.Function
                                                        public final Object apply(Object obj) {
                                                            f0 f0Var4 = kVar.f113887a;
                                                            ps.o1 o1Var4 = (ps.o1) obj;
                                                            String splitType = o1Var4.getSplitType();
                                                            if (!p005kotlin.jvm.internal.s.g(splitType, qs.x.SKI_RUN.f147220a)) {
                                                                return p005kotlin.jvm.internal.s.g(splitType, qs.x.SKI_LIFT.f147220a) ? ps.o1.b(o1Var4, Double.valueOf(f0Var4.c0("restSplitsDuration")), null, null, -5) : o1Var4;
                                                            }
                                                            return ps.o1.b(o1Var4, Double.valueOf(f0Var4.c0("activeSplitsIdleDuration") + f0Var4.c0("activeSplitsMovingDuration")), Double.valueOf(f0Var4.c0("activeSplitsMovingDuration")), Double.valueOf(f0Var4.c0("max_speed")), -525);
                                                        }
                                                    });
                                                }
                                            }
                                        }
                                    } else if (am.z0.X(str6) || am.z0.a0(str6)) {
                                        cls = am.d.class;
                                        bVar = bVar2;
                                        hVar = hVar2;
                                        i0Var = i0Var2;
                                        str = str6;
                                        hVar.f29454g = f0Var3.Y();
                                        ps.o1 o1Var4 = new ps.o1(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, 7, null);
                                        o1Var4.V1(qs.x.SURF_ACTIVE.f147220a);
                                        o1Var4.M1(Integer.valueOf((int) f0Var3.c0("splitsCount")));
                                        o1Var4.y1(Double.valueOf(f0Var3.c0("splitsDuration")));
                                        o1Var4.I1(Double.valueOf(f0Var3.c0("splitsMaxSpeed")));
                                        double dC11 = f0Var3.c0("splitsMaxDistance");
                                        c22.m3 m3Var = f0Var3.f113770d2 ? c22.m3.METER : c22.m3.FOOT;
                                        c22.l3.f23124b.getClass();
                                        o1Var4.D1(Double.valueOf(c22.l3.a.h(dC11, m3Var)));
                                        ArrayList arrayList4 = new ArrayList();
                                        arrayList4.add(o1Var4);
                                        hVar.f29464q = arrayList4;
                                    } else {
                                        cls = am.d.class;
                                        int i16 = iX;
                                        bVar = bVar2;
                                        if (am.z0.M(str6)) {
                                            str = str6;
                                            hVar2.f29454g = f0Var3.Y();
                                            i0Var2.f29516i = f0Var3.c0("bottom_time");
                                            i0Var2.f29522k = f0Var3.c0("totalSurfaceTime") + f0Var3.c0("bottom_time");
                                            i0Var2.f29502e2 = f0Var3.c0("bottom_time");
                                            c22.l3.a aVar2 = c22.l3.f23124b;
                                            double dC12 = f0Var3.c0("max_depth");
                                            c22.m3 m3Var2 = am.j.z(f12.l.f68084a) ? c22.m3.METER : c22.m3.FOOT;
                                            aVar2.getClass();
                                            i0Var2.V1 = c22.l3.a.h(dC12, m3Var2);
                                            i0Var2.f29549t = Double.NaN;
                                            Double dU = f0Var3.u();
                                            dU.getClass();
                                            i0Var2.f29496d = dU.doubleValue();
                                            Double dV = f0Var3.v();
                                            dV.getClass();
                                            i0Var2.f29500e = dV.doubleValue();
                                            Double dR = f0Var3.r();
                                            dR.getClass();
                                            i0Var2.f29504f = dR.doubleValue();
                                            Double dS = f0Var3.s();
                                            dS.getClass();
                                            i0Var2.f29508g = dS.doubleValue();
                                            com.garmin.android.apps.connectmobile.activities.newmodel.s sVar2 = new com.garmin.android.apps.connectmobile.activities.newmodel.s();
                                            int iC0 = (int) f0Var3.c0("weight");
                                            boolean z14 = f0Var3.f113762b2;
                                            sVar2.f29656a = iC0;
                                            sVar2.f29657b = new ps.z1((Double) null, (Integer) null, (z14 ? qs.y.UNIT_WEIGHT_KILOGRAM : qs.y.UNIT_WEIGHT_POUND).f147239a, 3, (p005kotlin.jvm.internal.j) null);
                                            boolean z15 = f0Var3.f113766c2;
                                            sVar2.f29660e = (int) f0Var3.c0("visibility");
                                            sVar2.f29661f = new ps.z1((Double) null, (Integer) null, (z15 ? qs.y.UNIT_DISTANCE_METER : qs.y.UNIT_DISTANCE_FOOT).f147239a, 3, (p005kotlin.jvm.internal.j) null);
                                            sVar2.f29667l = f0Var3.c0("totalSurfaceTime");
                                            com.garmin.android.apps.connectmobile.activities.newmodel.t tVar = f0Var3.K1;
                                            if (tVar == null) {
                                                tVar = new com.garmin.android.apps.connectmobile.activities.newmodel.t();
                                            }
                                            sVar2.f29668m = tVar;
                                            sVar2.f29658c = map2.get("suit_type");
                                            sVar2.f29659d = f0Var3.c0("suit_thickness");
                                            sVar2.f29662g = map2.get("surface_conditions");
                                            sVar2.f29663h = map2.get("current");
                                            sVar2.f29664i = map2.get("entry_type");
                                            sVar2.f29665j = map2.get("equipment");
                                            sVar2.f29666k = map2.get("buddy");
                                            hVar2.f29461n = sVar2;
                                            ps.a1 a1Var5 = hVar2.f29459l;
                                            a1Var5.getClass();
                                            hVar2.f29459l = ps.a1.b(a1Var5, null, null, null, false, Integer.valueOf(i16), null, null, null, -1, 524286);
                                            hVar = hVar2;
                                            i0Var = i0Var2;
                                        } else if (am.z0.b(am.x0.D, str6)) {
                                            hVar2.f29454g = f0Var3.Y();
                                            str = str6;
                                            i0Var2.f29502e2 = f0Var3.c0("bottom_time");
                                            i0Var2.f29516i = f0Var3.c0("bottom_time");
                                            i0Var2.f29522k = f0Var3.c0("bottom_time");
                                            i0Var2.f29494c2 = Boolean.valueOf(f0Var3.q0());
                                            c22.m3 m3Var3 = am.j.z(f12.l.f68084a) ? c22.m3.METER : c22.m3.FOOT;
                                            c22.l3.a aVar3 = c22.l3.f23124b;
                                            double dC13 = f0Var3.c0("max_depth");
                                            aVar3.getClass();
                                            i0Var2.V1 = c22.l3.a.h(dC13, m3Var3);
                                            double dC14 = f0Var3.c0("avg_depth");
                                            c22.m3 m3Var4 = c22.m3.METER;
                                            i0Var2.W1 = c22.l3.a.g(dC14, m3Var3, m3Var4);
                                            i0Var2.X1 = f0Var3.c0("surface_interval");
                                            i0Var2.f29549t = Double.NaN;
                                            Double dU2 = f0Var3.u();
                                            dU2.getClass();
                                            i0Var2.f29496d = dU2.doubleValue();
                                            Double dV2 = f0Var3.v();
                                            dV2.getClass();
                                            i0Var2.f29500e = dV2.doubleValue();
                                            Double dR2 = f0Var3.r();
                                            dR2.getClass();
                                            i0Var2.f29504f = dR2.doubleValue();
                                            Double dS2 = f0Var3.s();
                                            dS2.getClass();
                                            i0Var2.f29508g = dS2.doubleValue();
                                            com.garmin.android.apps.connectmobile.activities.newmodel.s sVar3 = new com.garmin.android.apps.connectmobile.activities.newmodel.s();
                                            hVar = hVar2;
                                            int iC1 = (int) f0Var3.c0("weight");
                                            boolean z16 = f0Var3.f113762b2;
                                            sVar3.f29656a = iC1;
                                            sVar3.f29657b = new ps.z1((Double) null, (Integer) null, (z16 ? qs.y.UNIT_WEIGHT_KILOGRAM : qs.y.UNIT_WEIGHT_POUND).f147239a, 3, (p005kotlin.jvm.internal.j) null);
                                            boolean z17 = f0Var3.f113766c2;
                                            sVar3.f29660e = (int) f0Var3.c0("visibility");
                                            sVar3.f29661f = new ps.z1((Double) null, (Integer) null, (z17 ? qs.y.UNIT_DISTANCE_METER : qs.y.UNIT_DISTANCE_FOOT).f147239a, 3, (p005kotlin.jvm.internal.j) null);
                                            com.garmin.android.apps.connectmobile.activities.newmodel.t tVar2 = f0Var3.K1;
                                            if (tVar2 == null) {
                                                tVar2 = new com.garmin.android.apps.connectmobile.activities.newmodel.t();
                                            }
                                            if (am.z0.b(am.x0.X, hVar.C().f4358a)) {
                                                tVar2.f29677h = Double.valueOf(f0Var3.e0());
                                                tVar2.f29680k = Double.valueOf(f0Var3.d0());
                                                tVar2.f29681l = Double.valueOf(c22.l3.a.g(map.get("po2HighPointDepth").doubleValue(), m3Var3, m3Var4));
                                                tVar2.f29678i = Double.valueOf(c22.l3.a.g(map.get("po2LowPointDepth").doubleValue(), m3Var3, m3Var4));
                                            }
                                            sVar3.f29668m = tVar2;
                                            sVar3.f29658c = map2.get("suit_type");
                                            sVar3.f29659d = f0Var3.c0("suit_thickness");
                                            sVar3.f29662g = map2.get("surface_conditions");
                                            sVar3.f29663h = map2.get("current");
                                            sVar3.f29664i = map2.get("entry_type");
                                            sVar3.f29665j = map2.get("equipment");
                                            sVar3.f29666k = map2.get("buddy");
                                            com.garmin.android.apps.connectmobile.activities.newmodel.h hVar3 = f0Var3.f113778f2;
                                            sVar3.f29669n = (hVar3 == null || (sVar = hVar3.f29461n) == null) ? null : sVar.f29669n;
                                            hVar.f29461n = sVar3;
                                            i0Var = i0Var2;
                                        } else {
                                            hVar = hVar2;
                                            i0Var = i0Var2;
                                            str = str6;
                                            i0Var.f29496d = Double.NaN;
                                            i0Var.f29500e = Double.NaN;
                                            i0Var.f29504f = Double.NaN;
                                            i0Var.f29508g = Double.NaN;
                                        }
                                    }
                                    z0Var = am.z0.f4390a;
                                    str2 = str;
                                    if (!xy2.b.C(z0Var, str2) || xy2.b.B(z0Var, str2)) {
                                        dC9 = f0Var3.c0("packWeight");
                                        if (Double.isNaN(dC9)) {
                                            dR1 = Double.NaN;
                                            fVar = null;
                                        } else {
                                            fVar = null;
                                            boolean zY = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y();
                                            c22.l3.f23124b.getClass();
                                            dR1 = c22.l3.a.R1(dC9, zY);
                                        }
                                        i0Var.f29495c3 = dR1;
                                    } else {
                                        fVar = null;
                                    }
                                    if (hVar.C() != am.x0.f4313o1) {
                                        i0Var.f29538p = f0Var3.b(i0Var);
                                        i0Var.f29501e1 = Double.NaN;
                                        i0Var.f29505f1 = Double.NaN;
                                    }
                                    if (am.z0.G(str2) && hVar.f29455h.getIsHidden()) {
                                        bv.b.f21239a.getClass();
                                        bv.b.a();
                                        if (com.garmin.android.apps.connectmobile.k1.f37122a.w()) {
                                            hVar.f29457j = new ps.a(0, PrivacyType.ONLY_ME.getCategoryAccessRule());
                                        }
                                    }
                                    hVar.f29460m = i0Var;
                                    b bVar3 = bVar;
                                    oo.k kVar2 = bVar3.f113711h;
                                    kVar2.getClass();
                                    hVar.getClass();
                                    androidx.lifecycle.y0 y0Var = new androidx.lifecycle.y0();
                                    y0Var.m(com.garmin.android.apps.connectmobile.g3.a.c(com.garmin.android.apps.connectmobile.g3.f35298f));
                                    ps.a1 a1Var6 = hVar.f29459l;
                                    a1Var6.getClass();
                                    bv.b.f21239a.getClass();
                                    bv.b.a();
                                    hVar.f29459l = ps.a1.b(a1Var6, null, null, null, false, null, null, Boolean.valueOf(com.garmin.android.apps.connectmobile.k1.f37122a.F()), null, -1, 522239);
                                    am.b bVarM = am.b.M();
                                    lVar = new oo.l(y0Var);
                                    bVarM.getClass();
                                    strX = ((am.d) KoinJavaComponent.get(cls)).x();
                                    a1Var = hVar.f29459l;
                                    if (a1Var != null) {
                                        a1Var.P0(strX);
                                    } else {
                                        ps.a1 a1Var7 = new ps.a1();
                                        a1Var7.P0(strX);
                                        hVar.f29459l = a1Var7;
                                    }
                                    String string = hVar.e0().toString();
                                    lj0.a aVar4 = lj0.a.f112939l;
                                    aVar4.f112948f = string;
                                    d80.f.b bVar4 = new d80.f.b(new Object[0], aVar4);
                                    am.a aVar5 = new am.a(bVarM, lVar);
                                    bVar4.f58273c = com.garmin.android.apps.connectmobile.activities.newmodel.h.class;
                                    bVar4.f58274d = aVar5;
                                    bVar4.f58275e = d80.g.JSON_OBJECT;
                                    d80.f<com.garmin.android.apps.connectmobile.activities.newmodel.h> fVarA = bVar4.a();
                                    fVarA.b();
                                    fVar2 = fVarA;
                                    kVar2.f133107e = fVar2;
                                    y0Var.f(bVar3.getViewLifecycleOwner(), new hc0.f(2, bVar3, hVar));
                                } else {
                                    ps.o1 o1Var5 = new ps.o1(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, 7, null);
                                    o1Var5.V1(qs.x.RUN_ACTIVE.f147220a);
                                    o1Var5.y1(Double.valueOf(f0Var3.c0("activeSplitsDuration")));
                                    ps.o1 o1Var6 = new ps.o1(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, 7, null);
                                    o1Var6.V1(qs.x.RUN_REST.f147220a);
                                    o1Var6.y1(Double.valueOf(f0Var3.c0("restSplitsDuration")));
                                    ArrayList arrayList5 = new ArrayList();
                                    arrayList5.add(o1Var5);
                                    arrayList5.add(o1Var6);
                                    hVar2.f29464q = arrayList5;
                                }
                                String string2 = hVar.e0().toString();
                                lj0.a aVar6 = lj0.a.f112939l;
                                aVar6.f112948f = string2;
                                d80.f.b bVar5 = new d80.f.b(new Object[0], aVar6);
                                am.a aVar7 = new am.a(bVarM, lVar);
                                bVar5.f58273c = com.garmin.android.apps.connectmobile.activities.newmodel.h.class;
                                bVar5.f58274d = aVar7;
                                bVar5.f58275e = d80.g.JSON_OBJECT;
                                d80.f<com.garmin.android.apps.connectmobile.activities.newmodel.h> fVarA2 = bVar5.a();
                                fVarA2.b();
                                fVar2 = fVarA2;
                            } catch (JSONException e4) {
                                lc.u0.v(e4, new StringBuilder("Create activity json object error: "), com.garmin.android.apps.connectmobile.a2.ACTIVITIES, "ActivitiesDataManager");
                                lVar.a(lj0.b.f112956j);
                                fVar2 = fVar;
                            }
                            cls = am.d.class;
                            bVar = bVar2;
                            hVar = hVar2;
                            i0Var = i0Var2;
                            str = str6;
                            z0Var = am.z0.f4390a;
                            str2 = str;
                            if (xy2.b.C(z0Var, str2)) {
                                dC9 = f0Var3.c0("packWeight");
                                if (Double.isNaN(dC9)) {
                                    dR1 = Double.NaN;
                                    fVar = null;
                                } else {
                                    fVar = null;
                                    boolean zY2 = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y();
                                    c22.l3.f23124b.getClass();
                                    dR1 = c22.l3.a.R1(dC9, zY2);
                                }
                                i0Var.f29495c3 = dR1;
                            } else {
                                dC9 = f0Var3.c0("packWeight");
                                if (Double.isNaN(dC9)) {
                                    dR1 = Double.NaN;
                                    fVar = null;
                                } else {
                                    fVar = null;
                                    boolean zY3 = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y();
                                    c22.l3.f23124b.getClass();
                                    dR1 = c22.l3.a.R1(dC9, zY3);
                                }
                                i0Var.f29495c3 = dR1;
                            }
                            if (hVar.C() != am.x0.f4313o1) {
                                i0Var.f29538p = f0Var3.b(i0Var);
                                i0Var.f29501e1 = Double.NaN;
                                i0Var.f29505f1 = Double.NaN;
                            }
                            if (am.z0.G(str2)) {
                                bv.b.f21239a.getClass();
                                bv.b.a();
                                if (com.garmin.android.apps.connectmobile.k1.f37122a.w()) {
                                    hVar.f29457j = new ps.a(0, PrivacyType.ONLY_ME.getCategoryAccessRule());
                                }
                            }
                            hVar.f29460m = i0Var;
                            b bVar6 = bVar;
                            oo.k kVar3 = bVar6.f113711h;
                            kVar3.getClass();
                            hVar.getClass();
                            androidx.lifecycle.y0 y0Var2 = new androidx.lifecycle.y0();
                            y0Var2.m(com.garmin.android.apps.connectmobile.g3.a.c(com.garmin.android.apps.connectmobile.g3.f35298f));
                            ps.a1 a1Var8 = hVar.f29459l;
                            a1Var8.getClass();
                            bv.b.f21239a.getClass();
                            bv.b.a();
                            hVar.f29459l = ps.a1.b(a1Var8, null, null, null, false, null, null, Boolean.valueOf(com.garmin.android.apps.connectmobile.k1.f37122a.F()), null, -1, 522239);
                            am.b bVarM2 = am.b.M();
                            lVar = new oo.l(y0Var2);
                            bVarM2.getClass();
                            strX = ((am.d) KoinJavaComponent.get(cls)).x();
                            a1Var = hVar.f29459l;
                            if (a1Var != null) {
                                a1Var.P0(strX);
                            } else {
                                ps.a1 a1Var9 = new ps.a1();
                                a1Var9.P0(strX);
                                hVar.f29459l = a1Var9;
                            }
                            kVar3.f133107e = fVar2;
                            y0Var2.f(bVar6.getViewLifecycleOwner(), new hc0.f(2, bVar6, hVar));
                        }
                        break;
                    default:
                        bVar2.requireActivity().onBackPressed();
                        break;
                }
            }
        });
        final int i15 = 1;
        button2.setOnClickListener(new View.OnClickListener(this) { // from class: lo.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f113706b;

            {
                this.f113706b = this;
            }

            /* JADX WARN: Code duplicated, block: B:155:0x0ace  */
            /* JADX WARN: Code duplicated, block: B:157:0x0ada  */
            /* JADX WARN: Code duplicated, block: B:158:0x0ade  */
            /* JADX WARN: Code duplicated, block: B:162:0x0b00  */
            /* JADX WARN: Code duplicated, block: B:169:0x0b2a  */
            /* JADX WARN: Code duplicated, block: B:172:0x0b9e  */
            /* JADX WARN: Code duplicated, block: B:173:0x0ba2  */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                Class cls;
                b bVar;
                com.garmin.android.apps.connectmobile.activities.newmodel.h hVar;
                com.garmin.android.apps.connectmobile.activities.newmodel.i0 i0Var;
                String str;
                com.garmin.android.apps.connectmobile.activities.newmodel.s sVar;
                am.z0 z0Var;
                String str2;
                double dC9;
                d80.f<com.garmin.android.apps.connectmobile.activities.newmodel.h> fVar;
                double dR1;
                oo.l lVar;
                String strX;
                ps.a1 a1Var;
                d80.f<com.garmin.android.apps.connectmobile.activities.newmodel.h> fVar2;
                int i16 = i15;
                b bVar2 = this.f113706b;
                switch (i16) {
                    case 0:
                        if (g22.e.e(bVar2)) {
                            g22.e.l(bVar2);
                            am.d dVar2 = (am.d) KoinJavaComponent.get(am.d.class);
                            dVar2.c0(bVar2.f113949a.J1);
                            f0 f0Var2 = bVar2.f113949a;
                            dVar2.X(f0Var2.M1, f0Var2.N1);
                            final k kVar = new k(bVar2.f113949a, true);
                            f0 f0Var3 = kVar.f113887a;
                            HashMap<String, Double> map = f0Var3.Z1;
                            HashMap<String, String> map2 = f0Var3.Y1;
                            com.garmin.android.apps.connectmobile.activities.newmodel.h hVar2 = kVar.f113889c;
                            ps.a1 a1Var2 = hVar2.f29459l;
                            ps.a1 a1Var3 = a1Var2 == null ? new ps.a1(null, null, null, null, null, null, null, null, null, null, null, 0, 0, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 524287, null) : a1Var2;
                            com.garmin.android.apps.connectmobile.courses.model.d dVar3 = f0Var3.f113806m2;
                            String str3 = dVar3 != null ? dVar3.courseId : null;
                            if (str3 == null) {
                                str3 = "";
                            }
                            hVar2.f29459l = ps.a1.b(a1Var3, null, str3, null, false, Integer.valueOf(f0Var3.X() == 0 ? 1 : f0Var3.X()), null, null, null, -9, 524286);
                            if (hVar2.f29460m == null) {
                                hVar2.f29460m = new com.garmin.android.apps.connectmobile.activities.newmodel.i0();
                            }
                            com.garmin.android.apps.connectmobile.activities.newmodel.i0 i0Var2 = hVar2.f29460m;
                            hVar2.f29450c = map2.get("notes");
                            hVar2.f29449b = map2.get("name");
                            qs.g gVar2 = f0Var3.L1;
                            gVar2.getClass();
                            hVar2.f29456i = new ps.p0(gVar2);
                            am.x0 x0Var2 = f0Var3.J1;
                            hVar2.getClass();
                            am.z0 z0Var2 = am.z0.f4390a;
                            hVar2.f29455h = ((am.y0) KoinJavaComponent.get$default(am.y0.class, null, null, 6, null)).f(x0Var2);
                            hVar2.Z(f0Var3.H1);
                            i0Var2.getClass();
                            ps.s1 s1Var = hVar2.f29458k;
                            if (s1Var == null || TextUtils.isEmpty(s1Var.getCom.google.firebase.remoteconfig.RemoteConfigConstants.RequestFieldKey.TIME_ZONE java.lang.String())) {
                                Calendar calendar = f0Var3.I1;
                                calendar.getClass();
                                String strF = c22.j0.f(calendar, "yyyy-MM-dd'T'HH:mm:ss.SSS", null);
                                String strF2 = c22.j0.f(calendar, "yyyy-MM-dd'T'HH:mm:ss.SSS", TimeZone.getTimeZone(TimeZones.GMT_ID));
                                i0Var2.f29484a = strF;
                                i0Var2.f29488b = strF2;
                            } else {
                                Calendar calendar2 = f0Var3.I1;
                                calendar2.getClass();
                                Calendar calendar3 = Calendar.getInstance();
                                calendar3.setTimeZone(TimeZone.getTimeZone(hVar2.f29458k.getCom.google.firebase.remoteconfig.RemoteConfigConstants.RequestFieldKey.TIME_ZONE java.lang.String()));
                                calendar3.set(1, calendar2.get(1));
                                calendar3.set(2, calendar2.get(2));
                                calendar3.set(5, calendar2.get(5));
                                calendar3.set(10, calendar2.get(10));
                                calendar3.set(12, calendar2.get(12));
                                calendar3.set(13, calendar2.get(13));
                                calendar3.set(9, calendar2.get(9));
                                calendar3.set(11, calendar2.get(11));
                                calendar3.set(14, calendar2.get(14));
                                String strF3 = c22.j0.f(calendar3, "yyyy-MM-dd'T'HH:mm:ss.SSS", calendar3.getTimeZone());
                                String str4 = i0Var2.f29484a;
                                if (str4 == null || !d53.u.y(strF3, str4, false)) {
                                    String strF4 = c22.j0.f(calendar3, "yyyy-MM-dd'T'HH:mm:ss.SSS", TimeZone.getTimeZone(TimeZones.GMT_ID));
                                    i0Var2.f29484a = strF3;
                                    i0Var2.f29488b = strF4;
                                }
                            }
                            i0Var2.F = f0Var3.c0("average_temperature");
                            i0Var2.I = f0Var3.c0("max_temperature");
                            i0Var2.P = f0Var3.c0("min_temperature");
                            if (ar.i.a(hVar2)) {
                                i0Var2.H2 = f0Var3.A1;
                                i0Var2.I2 = f0Var3.B1;
                            }
                            i0Var2.f29560x = f0Var3.c0("average_heart_rate");
                            i0Var2.f29563y = f0Var3.c0("max_heart_rate");
                            i0Var2.f29553u2 = f0Var3.c0("average_respiration_rate");
                            i0Var2.f29551t2 = f0Var3.c0("max_respiration_rate");
                            i0Var2.R1 = f0Var3.c0("floors_climbed");
                            i0Var2.T1 = Double.NaN;
                            i0Var2.U1 = Double.NaN;
                            i0Var2.f29526l = f0Var3.c0("elevation_gain");
                            i0Var2.f29529m = f0Var3.c0("elevation_loss");
                            i0Var2.f29544r = f0Var3.c0("max_speed");
                            ps.a1 a1Var4 = hVar2.f29459l;
                            a1Var4.getClass();
                            hVar2.f29459l = ps.a1.b(a1Var4, null, null, Boolean.valueOf(kVar.f113888b), false, null, null, null, null, -33, 524287);
                            if (f0Var3.t0()) {
                                i0Var2.f29557w = f0Var3.c0("bmrCalories");
                                i0Var2.f29549t = f0Var3.c0("calories_burned");
                                i0Var2.f29546r2 = f0Var3.c0("calories_consumed");
                                i0Var2.f29559w2 = f0Var3.c0("fluids_loss");
                                i0Var2.f29562x2 = f0Var3.c0("fluids_consumed");
                            } else {
                                i0Var2.f29557w = f0Var3.c0("bmrCalories");
                                i0Var2.f29549t = f0Var3.c0("calories");
                            }
                            double d14 = i0Var2.f29549t;
                            if (Double.isNaN(d14)) {
                                d14 = 0.0d;
                            }
                            i0Var2.f29549t = d14;
                            i0Var2.f29566z = f0Var3.y();
                            i0Var2.A = f0Var3.b0();
                            i0Var2.B = f0Var3.x();
                            i0Var2.C = f0Var3.a0();
                            String str5 = f0Var3.J1.f4358a;
                            am.x0 x0Var3 = am.x0.f4268a3;
                            i0Var2.O2 = am.z0.b(x0Var3, str5) ? f0Var3.c0("average_cadence") : Double.NaN;
                            i0Var2.P2 = am.z0.b(x0Var3, f0Var3.J1.f4358a) ? f0Var3.c0("max_cadence") : Double.NaN;
                            i0Var2.T = f0Var3.g0("average_power");
                            i0Var2.X = f0Var3.g0("max_power");
                            i0Var2.Y = f0Var3.g0("max_average_power");
                            double d15 = f0Var3.G1;
                            i0Var2.f29516i = d15;
                            i0Var2.f29522k = d15;
                            i0Var2.f29519j = Double.NaN;
                            i0Var2.f29512h = f0Var3.q();
                            i0Var2.S2 = Double.NaN;
                            i0Var2.T2 = Double.NaN;
                            int iX = f0Var3.X() == 0 ? 1 : f0Var3.X();
                            String str6 = f0Var3.J1.f4358a;
                            try {
                                if (am.z0.b(am.x0.f4313o1, str6)) {
                                    i0Var2.f29501e1 = f0Var3.M1;
                                    i0Var2.f29505f1 = f0Var3.O1;
                                    f0.e eVarA = f0.e.a(f0Var3.N1, f0.e.METER);
                                    i0Var2.f29509g1 = new ps.z1(Double.valueOf(eVarA.f113856c), Integer.valueOf(eVarA.f113855b), eVarA.f113854a);
                                } else if (am.z0.O(str6)) {
                                    hVar2.f29454g = f0Var3.Y();
                                    i0Var2.f29516i = f0Var3.c0("elapsed_time");
                                    c22.l3.a aVar = c22.l3.f23124b;
                                    double dC10 = f0Var3.c0("bestLapTime");
                                    aVar.getClass();
                                    i0Var2.f29565y2 = dC10 / ((double) 1000);
                                    i0Var2.f29544r = f0Var3.c0("racingMaxSpeed");
                                    i0Var2.f29512h = f0Var3.q() * ((double) iX);
                                } else if (am.z0.b(am.x0.f4352y2, str6)) {
                                    ps.o1 o1Var = new ps.o1(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, 7, null);
                                    o1Var.V1(qs.x.CLIMB_ACTIVE.f147220a);
                                    o1Var.M1(Integer.valueOf((int) f0Var3.c0("routes")));
                                    o1Var.v1(Double.valueOf(f0Var3.c0("avgAscent")));
                                    o1Var.F1(Double.valueOf(f0Var3.c0("maxAscent")));
                                    o1Var.A1(Double.valueOf(f0Var3.c0("totalAscent")));
                                    o1Var.U1(null);
                                    o1Var.S1(null);
                                    ArrayList arrayList = new ArrayList();
                                    arrayList.add(o1Var);
                                    hVar2.f29464q = arrayList;
                                    i0Var2.f29526l = Double.NaN;
                                } else if (am.z0.b(am.x0.f4356z2, str6)) {
                                    ps.o1 o1Var2 = new ps.o1(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, 7, null);
                                    o1Var2.V1(qs.x.CLIMB_ACTIVE.f147220a);
                                    o1Var2.M1(Integer.valueOf((int) f0Var3.c0("routes")));
                                    o1Var2.G1(am.v1.c(f0Var3.J1.f4358a, map2.get("difficultyScale"), map2.get("max_difficulty")));
                                    ArrayList arrayList2 = new ArrayList();
                                    arrayList2.add(o1Var2);
                                    hVar2.f29464q = arrayList2;
                                    i0Var2.f29526l = Double.NaN;
                                } else if (!am.z0.b(am.x0.D2, str6)) {
                                    if (am.z0.P(str6)) {
                                        ArrayList<ps.o1> arrayList3 = hVar2.f29464q;
                                        arrayList3.getClass();
                                        if (!arrayList3.isEmpty()) {
                                            for (ps.o1 o1Var3 : arrayList3) {
                                                if (p005kotlin.jvm.internal.s.g(o1Var3.getSplitType(), qs.x.SKI_RUN.f147220a) || p005kotlin.jvm.internal.s.g(o1Var3.getSplitType(), qs.x.SKI_LIFT.f147220a)) {
                                                    hVar2.f29464q.replaceAll(new UnaryOperator() { // from class: lo.j
                                                        @Override // java.util.function.Function
                                                        public final Object apply(Object obj) {
                                                            f0 f0Var4 = kVar.f113887a;
                                                            ps.o1 o1Var4 = (ps.o1) obj;
                                                            String splitType = o1Var4.getSplitType();
                                                            if (!p005kotlin.jvm.internal.s.g(splitType, qs.x.SKI_RUN.f147220a)) {
                                                                return p005kotlin.jvm.internal.s.g(splitType, qs.x.SKI_LIFT.f147220a) ? ps.o1.b(o1Var4, Double.valueOf(f0Var4.c0("restSplitsDuration")), null, null, -5) : o1Var4;
                                                            }
                                                            return ps.o1.b(o1Var4, Double.valueOf(f0Var4.c0("activeSplitsIdleDuration") + f0Var4.c0("activeSplitsMovingDuration")), Double.valueOf(f0Var4.c0("activeSplitsMovingDuration")), Double.valueOf(f0Var4.c0("max_speed")), -525);
                                                        }
                                                    });
                                                }
                                            }
                                        }
                                    } else if (am.z0.X(str6) || am.z0.a0(str6)) {
                                        cls = am.d.class;
                                        bVar = bVar2;
                                        hVar = hVar2;
                                        i0Var = i0Var2;
                                        str = str6;
                                        hVar.f29454g = f0Var3.Y();
                                        ps.o1 o1Var4 = new ps.o1(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, 7, null);
                                        o1Var4.V1(qs.x.SURF_ACTIVE.f147220a);
                                        o1Var4.M1(Integer.valueOf((int) f0Var3.c0("splitsCount")));
                                        o1Var4.y1(Double.valueOf(f0Var3.c0("splitsDuration")));
                                        o1Var4.I1(Double.valueOf(f0Var3.c0("splitsMaxSpeed")));
                                        double dC11 = f0Var3.c0("splitsMaxDistance");
                                        c22.m3 m3Var = f0Var3.f113770d2 ? c22.m3.METER : c22.m3.FOOT;
                                        c22.l3.f23124b.getClass();
                                        o1Var4.D1(Double.valueOf(c22.l3.a.h(dC11, m3Var)));
                                        ArrayList arrayList4 = new ArrayList();
                                        arrayList4.add(o1Var4);
                                        hVar.f29464q = arrayList4;
                                    } else {
                                        cls = am.d.class;
                                        int i17 = iX;
                                        bVar = bVar2;
                                        if (am.z0.M(str6)) {
                                            str = str6;
                                            hVar2.f29454g = f0Var3.Y();
                                            i0Var2.f29516i = f0Var3.c0("bottom_time");
                                            i0Var2.f29522k = f0Var3.c0("totalSurfaceTime") + f0Var3.c0("bottom_time");
                                            i0Var2.f29502e2 = f0Var3.c0("bottom_time");
                                            c22.l3.a aVar2 = c22.l3.f23124b;
                                            double dC12 = f0Var3.c0("max_depth");
                                            c22.m3 m3Var2 = am.j.z(f12.l.f68084a) ? c22.m3.METER : c22.m3.FOOT;
                                            aVar2.getClass();
                                            i0Var2.V1 = c22.l3.a.h(dC12, m3Var2);
                                            i0Var2.f29549t = Double.NaN;
                                            Double dU = f0Var3.u();
                                            dU.getClass();
                                            i0Var2.f29496d = dU.doubleValue();
                                            Double dV = f0Var3.v();
                                            dV.getClass();
                                            i0Var2.f29500e = dV.doubleValue();
                                            Double dR = f0Var3.r();
                                            dR.getClass();
                                            i0Var2.f29504f = dR.doubleValue();
                                            Double dS = f0Var3.s();
                                            dS.getClass();
                                            i0Var2.f29508g = dS.doubleValue();
                                            com.garmin.android.apps.connectmobile.activities.newmodel.s sVar2 = new com.garmin.android.apps.connectmobile.activities.newmodel.s();
                                            int iC0 = (int) f0Var3.c0("weight");
                                            boolean z14 = f0Var3.f113762b2;
                                            sVar2.f29656a = iC0;
                                            sVar2.f29657b = new ps.z1((Double) null, (Integer) null, (z14 ? qs.y.UNIT_WEIGHT_KILOGRAM : qs.y.UNIT_WEIGHT_POUND).f147239a, 3, (p005kotlin.jvm.internal.j) null);
                                            boolean z15 = f0Var3.f113766c2;
                                            sVar2.f29660e = (int) f0Var3.c0("visibility");
                                            sVar2.f29661f = new ps.z1((Double) null, (Integer) null, (z15 ? qs.y.UNIT_DISTANCE_METER : qs.y.UNIT_DISTANCE_FOOT).f147239a, 3, (p005kotlin.jvm.internal.j) null);
                                            sVar2.f29667l = f0Var3.c0("totalSurfaceTime");
                                            com.garmin.android.apps.connectmobile.activities.newmodel.t tVar = f0Var3.K1;
                                            if (tVar == null) {
                                                tVar = new com.garmin.android.apps.connectmobile.activities.newmodel.t();
                                            }
                                            sVar2.f29668m = tVar;
                                            sVar2.f29658c = map2.get("suit_type");
                                            sVar2.f29659d = f0Var3.c0("suit_thickness");
                                            sVar2.f29662g = map2.get("surface_conditions");
                                            sVar2.f29663h = map2.get("current");
                                            sVar2.f29664i = map2.get("entry_type");
                                            sVar2.f29665j = map2.get("equipment");
                                            sVar2.f29666k = map2.get("buddy");
                                            hVar2.f29461n = sVar2;
                                            ps.a1 a1Var5 = hVar2.f29459l;
                                            a1Var5.getClass();
                                            hVar2.f29459l = ps.a1.b(a1Var5, null, null, null, false, Integer.valueOf(i17), null, null, null, -1, 524286);
                                            hVar = hVar2;
                                            i0Var = i0Var2;
                                        } else if (am.z0.b(am.x0.D, str6)) {
                                            hVar2.f29454g = f0Var3.Y();
                                            str = str6;
                                            i0Var2.f29502e2 = f0Var3.c0("bottom_time");
                                            i0Var2.f29516i = f0Var3.c0("bottom_time");
                                            i0Var2.f29522k = f0Var3.c0("bottom_time");
                                            i0Var2.f29494c2 = Boolean.valueOf(f0Var3.q0());
                                            c22.m3 m3Var3 = am.j.z(f12.l.f68084a) ? c22.m3.METER : c22.m3.FOOT;
                                            c22.l3.a aVar3 = c22.l3.f23124b;
                                            double dC13 = f0Var3.c0("max_depth");
                                            aVar3.getClass();
                                            i0Var2.V1 = c22.l3.a.h(dC13, m3Var3);
                                            double dC14 = f0Var3.c0("avg_depth");
                                            c22.m3 m3Var4 = c22.m3.METER;
                                            i0Var2.W1 = c22.l3.a.g(dC14, m3Var3, m3Var4);
                                            i0Var2.X1 = f0Var3.c0("surface_interval");
                                            i0Var2.f29549t = Double.NaN;
                                            Double dU2 = f0Var3.u();
                                            dU2.getClass();
                                            i0Var2.f29496d = dU2.doubleValue();
                                            Double dV2 = f0Var3.v();
                                            dV2.getClass();
                                            i0Var2.f29500e = dV2.doubleValue();
                                            Double dR2 = f0Var3.r();
                                            dR2.getClass();
                                            i0Var2.f29504f = dR2.doubleValue();
                                            Double dS2 = f0Var3.s();
                                            dS2.getClass();
                                            i0Var2.f29508g = dS2.doubleValue();
                                            com.garmin.android.apps.connectmobile.activities.newmodel.s sVar3 = new com.garmin.android.apps.connectmobile.activities.newmodel.s();
                                            hVar = hVar2;
                                            int iC1 = (int) f0Var3.c0("weight");
                                            boolean z16 = f0Var3.f113762b2;
                                            sVar3.f29656a = iC1;
                                            sVar3.f29657b = new ps.z1((Double) null, (Integer) null, (z16 ? qs.y.UNIT_WEIGHT_KILOGRAM : qs.y.UNIT_WEIGHT_POUND).f147239a, 3, (p005kotlin.jvm.internal.j) null);
                                            boolean z17 = f0Var3.f113766c2;
                                            sVar3.f29660e = (int) f0Var3.c0("visibility");
                                            sVar3.f29661f = new ps.z1((Double) null, (Integer) null, (z17 ? qs.y.UNIT_DISTANCE_METER : qs.y.UNIT_DISTANCE_FOOT).f147239a, 3, (p005kotlin.jvm.internal.j) null);
                                            com.garmin.android.apps.connectmobile.activities.newmodel.t tVar2 = f0Var3.K1;
                                            if (tVar2 == null) {
                                                tVar2 = new com.garmin.android.apps.connectmobile.activities.newmodel.t();
                                            }
                                            if (am.z0.b(am.x0.X, hVar.C().f4358a)) {
                                                tVar2.f29677h = Double.valueOf(f0Var3.e0());
                                                tVar2.f29680k = Double.valueOf(f0Var3.d0());
                                                tVar2.f29681l = Double.valueOf(c22.l3.a.g(map.get("po2HighPointDepth").doubleValue(), m3Var3, m3Var4));
                                                tVar2.f29678i = Double.valueOf(c22.l3.a.g(map.get("po2LowPointDepth").doubleValue(), m3Var3, m3Var4));
                                            }
                                            sVar3.f29668m = tVar2;
                                            sVar3.f29658c = map2.get("suit_type");
                                            sVar3.f29659d = f0Var3.c0("suit_thickness");
                                            sVar3.f29662g = map2.get("surface_conditions");
                                            sVar3.f29663h = map2.get("current");
                                            sVar3.f29664i = map2.get("entry_type");
                                            sVar3.f29665j = map2.get("equipment");
                                            sVar3.f29666k = map2.get("buddy");
                                            com.garmin.android.apps.connectmobile.activities.newmodel.h hVar3 = f0Var3.f113778f2;
                                            sVar3.f29669n = (hVar3 == null || (sVar = hVar3.f29461n) == null) ? null : sVar.f29669n;
                                            hVar.f29461n = sVar3;
                                            i0Var = i0Var2;
                                        } else {
                                            hVar = hVar2;
                                            i0Var = i0Var2;
                                            str = str6;
                                            i0Var.f29496d = Double.NaN;
                                            i0Var.f29500e = Double.NaN;
                                            i0Var.f29504f = Double.NaN;
                                            i0Var.f29508g = Double.NaN;
                                        }
                                    }
                                    z0Var = am.z0.f4390a;
                                    str2 = str;
                                    if (!xy2.b.C(z0Var, str2) || xy2.b.B(z0Var, str2)) {
                                        dC9 = f0Var3.c0("packWeight");
                                        if (Double.isNaN(dC9)) {
                                            dR1 = Double.NaN;
                                            fVar = null;
                                        } else {
                                            fVar = null;
                                            boolean zY3 = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y();
                                            c22.l3.f23124b.getClass();
                                            dR1 = c22.l3.a.R1(dC9, zY3);
                                        }
                                        i0Var.f29495c3 = dR1;
                                    } else {
                                        fVar = null;
                                    }
                                    if (hVar.C() != am.x0.f4313o1) {
                                        i0Var.f29538p = f0Var3.b(i0Var);
                                        i0Var.f29501e1 = Double.NaN;
                                        i0Var.f29505f1 = Double.NaN;
                                    }
                                    if (am.z0.G(str2) && hVar.f29455h.getIsHidden()) {
                                        bv.b.f21239a.getClass();
                                        bv.b.a();
                                        if (com.garmin.android.apps.connectmobile.k1.f37122a.w()) {
                                            hVar.f29457j = new ps.a(0, PrivacyType.ONLY_ME.getCategoryAccessRule());
                                        }
                                    }
                                    hVar.f29460m = i0Var;
                                    b bVar6 = bVar;
                                    oo.k kVar3 = bVar6.f113711h;
                                    kVar3.getClass();
                                    hVar.getClass();
                                    androidx.lifecycle.y0 y0Var2 = new androidx.lifecycle.y0();
                                    y0Var2.m(com.garmin.android.apps.connectmobile.g3.a.c(com.garmin.android.apps.connectmobile.g3.f35298f));
                                    ps.a1 a1Var8 = hVar.f29459l;
                                    a1Var8.getClass();
                                    bv.b.f21239a.getClass();
                                    bv.b.a();
                                    hVar.f29459l = ps.a1.b(a1Var8, null, null, null, false, null, null, Boolean.valueOf(com.garmin.android.apps.connectmobile.k1.f37122a.F()), null, -1, 522239);
                                    am.b bVarM2 = am.b.M();
                                    lVar = new oo.l(y0Var2);
                                    bVarM2.getClass();
                                    strX = ((am.d) KoinJavaComponent.get(cls)).x();
                                    a1Var = hVar.f29459l;
                                    if (a1Var != null) {
                                        a1Var.P0(strX);
                                    } else {
                                        ps.a1 a1Var9 = new ps.a1();
                                        a1Var9.P0(strX);
                                        hVar.f29459l = a1Var9;
                                    }
                                    String string2 = hVar.e0().toString();
                                    lj0.a aVar6 = lj0.a.f112939l;
                                    aVar6.f112948f = string2;
                                    d80.f.b bVar5 = new d80.f.b(new Object[0], aVar6);
                                    am.a aVar7 = new am.a(bVarM2, lVar);
                                    bVar5.f58273c = com.garmin.android.apps.connectmobile.activities.newmodel.h.class;
                                    bVar5.f58274d = aVar7;
                                    bVar5.f58275e = d80.g.JSON_OBJECT;
                                    d80.f<com.garmin.android.apps.connectmobile.activities.newmodel.h> fVarA2 = bVar5.a();
                                    fVarA2.b();
                                    fVar2 = fVarA2;
                                    kVar3.f133107e = fVar2;
                                    y0Var2.f(bVar6.getViewLifecycleOwner(), new hc0.f(2, bVar6, hVar));
                                } else {
                                    ps.o1 o1Var5 = new ps.o1(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, 7, null);
                                    o1Var5.V1(qs.x.RUN_ACTIVE.f147220a);
                                    o1Var5.y1(Double.valueOf(f0Var3.c0("activeSplitsDuration")));
                                    ps.o1 o1Var6 = new ps.o1(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, 7, null);
                                    o1Var6.V1(qs.x.RUN_REST.f147220a);
                                    o1Var6.y1(Double.valueOf(f0Var3.c0("restSplitsDuration")));
                                    ArrayList arrayList5 = new ArrayList();
                                    arrayList5.add(o1Var5);
                                    arrayList5.add(o1Var6);
                                    hVar2.f29464q = arrayList5;
                                }
                                String string3 = hVar.e0().toString();
                                lj0.a aVar8 = lj0.a.f112939l;
                                aVar8.f112948f = string3;
                                d80.f.b bVar7 = new d80.f.b(new Object[0], aVar8);
                                am.a aVar9 = new am.a(bVarM2, lVar);
                                bVar7.f58273c = com.garmin.android.apps.connectmobile.activities.newmodel.h.class;
                                bVar7.f58274d = aVar9;
                                bVar7.f58275e = d80.g.JSON_OBJECT;
                                d80.f<com.garmin.android.apps.connectmobile.activities.newmodel.h> fVarA3 = bVar7.a();
                                fVarA3.b();
                                fVar2 = fVarA3;
                            } catch (JSONException e4) {
                                lc.u0.v(e4, new StringBuilder("Create activity json object error: "), com.garmin.android.apps.connectmobile.a2.ACTIVITIES, "ActivitiesDataManager");
                                lVar.a(lj0.b.f112956j);
                                fVar2 = fVar;
                            }
                            cls = am.d.class;
                            bVar = bVar2;
                            hVar = hVar2;
                            i0Var = i0Var2;
                            str = str6;
                            z0Var = am.z0.f4390a;
                            str2 = str;
                            if (xy2.b.C(z0Var, str2)) {
                                dC9 = f0Var3.c0("packWeight");
                                if (Double.isNaN(dC9)) {
                                    dR1 = Double.NaN;
                                    fVar = null;
                                } else {
                                    fVar = null;
                                    boolean zY4 = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y();
                                    c22.l3.f23124b.getClass();
                                    dR1 = c22.l3.a.R1(dC9, zY4);
                                }
                                i0Var.f29495c3 = dR1;
                            } else {
                                dC9 = f0Var3.c0("packWeight");
                                if (Double.isNaN(dC9)) {
                                    dR1 = Double.NaN;
                                    fVar = null;
                                } else {
                                    fVar = null;
                                    boolean zY5 = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y();
                                    c22.l3.f23124b.getClass();
                                    dR1 = c22.l3.a.R1(dC9, zY5);
                                }
                                i0Var.f29495c3 = dR1;
                            }
                            if (hVar.C() != am.x0.f4313o1) {
                                i0Var.f29538p = f0Var3.b(i0Var);
                                i0Var.f29501e1 = Double.NaN;
                                i0Var.f29505f1 = Double.NaN;
                            }
                            if (am.z0.G(str2)) {
                                bv.b.f21239a.getClass();
                                bv.b.a();
                                if (com.garmin.android.apps.connectmobile.k1.f37122a.w()) {
                                    hVar.f29457j = new ps.a(0, PrivacyType.ONLY_ME.getCategoryAccessRule());
                                }
                            }
                            hVar.f29460m = i0Var;
                            b bVar8 = bVar;
                            oo.k kVar4 = bVar8.f113711h;
                            kVar4.getClass();
                            hVar.getClass();
                            androidx.lifecycle.y0 y0Var3 = new androidx.lifecycle.y0();
                            y0Var3.m(com.garmin.android.apps.connectmobile.g3.a.c(com.garmin.android.apps.connectmobile.g3.f35298f));
                            ps.a1 a1Var10 = hVar.f29459l;
                            a1Var10.getClass();
                            bv.b.f21239a.getClass();
                            bv.b.a();
                            hVar.f29459l = ps.a1.b(a1Var10, null, null, null, false, null, null, Boolean.valueOf(com.garmin.android.apps.connectmobile.k1.f37122a.F()), null, -1, 522239);
                            am.b bVarM3 = am.b.M();
                            lVar = new oo.l(y0Var3);
                            bVarM3.getClass();
                            strX = ((am.d) KoinJavaComponent.get(cls)).x();
                            a1Var = hVar.f29459l;
                            if (a1Var != null) {
                                a1Var.P0(strX);
                            } else {
                                ps.a1 a1Var11 = new ps.a1();
                                a1Var11.P0(strX);
                                hVar.f29459l = a1Var11;
                            }
                            kVar4.f133107e = fVar2;
                            y0Var3.f(bVar8.getViewLifecycleOwner(), new hc0.f(2, bVar8, hVar));
                        }
                        break;
                    default:
                        bVar2.requireActivity().onBackPressed();
                        break;
                }
            }
        });
        oo.k kVar = (oo.k) new androidx.lifecycle.x1(this).b(p005kotlin.jvm.internal.s0.f105811a.b(oo.k.class));
        this.f113711h = kVar;
        kVar.f133106d.f(getViewLifecycleOwner(), new iz1.g(this, 7));
        g22.e.l(this);
        this.f113711h.x4(x0Var, this.f113949a.H1);
    }
}
