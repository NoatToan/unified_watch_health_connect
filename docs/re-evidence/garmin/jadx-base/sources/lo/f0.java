package lo;

import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.text.format.DateFormat;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import androidx.compose.ui.platform.ComposeView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.ui.RPESeekBar;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexOneLineButton;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexTwoLineButton;
import com.google.common.base.Ascii;
import i3.e5;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.apache.commons.lang3.StringUtils;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes7.dex */
public class f0 {
    public final GCMComplexTwoLineButton A;
    public final GCMComplexTwoLineButton A0;
    public int A1;
    public final GCMComplexTwoLineButton B;
    public final TextView B0;
    public int B1;
    public final GCMComplexTwoLineButton C;
    public final GCMComplexTwoLineButton C0;
    public final d C1;
    public final GCMComplexTwoLineButton D;
    public final GCMComplexTwoLineButton D0;
    public final String D1;
    public final GCMComplexTwoLineButton E;
    public final GCMComplexTwoLineButton E0;
    public final String E1;
    public final GCMComplexTwoLineButton F;
    public final GCMComplexTwoLineButton F0;
    public final boolean F1;
    public final GCMComplexTwoLineButton G;
    public final GCMComplexTwoLineButton G0;
    public double G1;
    public final GCMComplexTwoLineButton H;
    public final GCMComplexTwoLineButton H0;
    public am.l H1;
    public final GCMComplexTwoLineButton I;
    public final GCMComplexTwoLineButton I0;
    public Calendar I1;
    public final GCMComplexTwoLineButton J;
    public final GCMComplexTwoLineButton J0;
    public am.x0 J1;
    public final GCMComplexTwoLineButton K;
    public final GCMComplexTwoLineButton K0;
    public com.garmin.android.apps.connectmobile.activities.newmodel.t K1;
    public final GCMComplexTwoLineButton L;
    public final GCMComplexTwoLineButton L0;
    public qs.g L1;
    public final GCMComplexTwoLineButton M;
    public final GCMComplexTwoLineButton M0;
    public double M1;
    public final GCMComplexTwoLineButton N;
    public final GCMComplexTwoLineButton N0;
    public String N1;
    public final GCMComplexTwoLineButton O;
    public final GCMComplexTwoLineButton O0;
    public int O1;
    public final GCMComplexTwoLineButton P;
    public final GCMComplexTwoLineButton P0;
    public int P1;
    public final GCMComplexTwoLineButton Q;
    public final GCMComplexTwoLineButton Q0;
    public int Q1;
    public final GCMComplexTwoLineButton R;
    public final GCMComplexTwoLineButton R0;
    public double R1;
    public final GCMComplexTwoLineButton S;
    public final GCMComplexTwoLineButton S0;
    public l3 S1;
    public final GCMComplexTwoLineButton T;
    public final GCMComplexTwoLineButton T0;
    public double T1;
    public final GCMComplexTwoLineButton U;
    public final GCMComplexTwoLineButton U0;
    public double U1;
    public final GCMComplexTwoLineButton V;
    public final GCMComplexTwoLineButton V0;
    public double V1;
    public final GCMComplexTwoLineButton W;
    public final GCMComplexTwoLineButton W0;
    public double W1;
    public final GCMComplexTwoLineButton X;
    public final TextView X0;
    public boolean X1;
    public final GCMComplexTwoLineButton Y;
    public final GCMComplexOneLineButton Y0;
    public final HashMap<String, String> Y1;
    public final GCMComplexTwoLineButton Z;
    public final GCMComplexOneLineButton Z0;
    public final HashMap<String, Double> Z1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GCMComplexOneLineButton f113755a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final GCMComplexTwoLineButton f113756a0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public final GCMComplexOneLineButton f113757a1;

    /* JADX INFO: renamed from: a2, reason: collision with root package name */
    public final HashMap<String, Boolean> f113758a2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f113759b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final GCMComplexTwoLineButton f113760b0;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public final GCMComplexTwoLineButton f113761b1;

    /* JADX INFO: renamed from: b2, reason: collision with root package name */
    public boolean f113762b2;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f113763c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public final GCMComplexTwoLineButton f113764c0;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public final GCMComplexTwoLineButton f113765c1;

    /* JADX INFO: renamed from: c2, reason: collision with root package name */
    public boolean f113766c2;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f113767d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final GCMComplexTwoLineButton f113768d0;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public final TextView f113769d1;

    /* JADX INFO: renamed from: d2, reason: collision with root package name */
    public boolean f113770d2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final GCMComplexTwoLineButton f113771e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final GCMComplexTwoLineButton f113772e0;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public final View f113773e1;

    /* JADX INFO: renamed from: e2, reason: collision with root package name */
    public final ArrayList f113774e2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final GCMComplexTwoLineButton f113775f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public final GCMComplexTwoLineButton f113776f0;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public final View f113777f1;

    /* JADX INFO: renamed from: f2, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.activities.newmodel.h f113778f2;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final GCMComplexTwoLineButton f113779g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public final GCMComplexTwoLineButton f113780g0;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public final GCMComplexTwoLineButton f113781g1;

    /* JADX INFO: renamed from: g2, reason: collision with root package name */
    public final boolean f113782g2;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final GCMComplexTwoLineButton f113783h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final GCMComplexTwoLineButton f113784h0;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public final GCMComplexTwoLineButton f113785h1;

    /* JADX INFO: renamed from: h2, reason: collision with root package name */
    public final boolean f113786h2;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final GCMComplexTwoLineButton f113787i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public final GCMComplexTwoLineButton f113788i0;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public final GCMComplexTwoLineButton f113789i1;

    /* JADX INFO: renamed from: i2, reason: collision with root package name */
    public final boolean f113790i2;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final GCMComplexTwoLineButton f113791j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public final GCMComplexTwoLineButton f113792j0;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public final GCMComplexTwoLineButton f113793j1;

    /* JADX INFO: renamed from: j2, reason: collision with root package name */
    public final boolean f113794j2;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final GCMComplexTwoLineButton f113795k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final GCMComplexTwoLineButton f113796k0;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public final GCMComplexTwoLineButton f113797k1;

    /* JADX INFO: renamed from: k2, reason: collision with root package name */
    public final boolean f113798k2;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final GCMComplexTwoLineButton f113799l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public final GCMComplexTwoLineButton f113800l0;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public final GCMComplexTwoLineButton f113801l1;

    /* JADX INFO: renamed from: l2, reason: collision with root package name */
    public final String f113802l2;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final GCMComplexTwoLineButton f113803m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public final GCMComplexTwoLineButton f113804m0;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    public final ComposeView f113805m1;

    /* JADX INFO: renamed from: m2, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.courses.model.d f113806m2;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final GCMComplexTwoLineButton f113807n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public final GCMComplexTwoLineButton f113808n0;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    public final boolean f113809n1;

    /* JADX INFO: renamed from: n2, reason: collision with root package name */
    public boolean f113810n2;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final GCMComplexTwoLineButton f113811o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public final GCMComplexTwoLineButton f113812o0;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    public boolean f113813o1;

    /* JADX INFO: renamed from: o2, reason: collision with root package name */
    public final sr.r f113814o2;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final GCMComplexTwoLineButton f113815p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final GCMComplexTwoLineButton f113816p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public boolean f113817p1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final GCMComplexTwoLineButton f113818q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final GCMComplexTwoLineButton f113819q0;

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    public boolean f113820q1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final GCMComplexTwoLineButton f113821r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final GCMComplexTwoLineButton f113822r0;

    /* JADX INFO: renamed from: r1, reason: collision with root package name */
    public boolean f113823r1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final GCMComplexTwoLineButton f113824s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final GCMComplexTwoLineButton f113825s0;

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    public ArrayList f113826s1;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final GCMComplexTwoLineButton f113827t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final GCMComplexTwoLineButton f113828t0;

    /* JADX INFO: renamed from: t1, reason: collision with root package name */
    public ArrayList f113829t1;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final GCMComplexTwoLineButton f113830u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final GCMComplexTwoLineButton f113831u0;

    /* JADX INFO: renamed from: u1, reason: collision with root package name */
    public final a f113832u1;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final GCMComplexTwoLineButton f113833v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public final GCMComplexTwoLineButton f113834v0;

    /* JADX INFO: renamed from: v1, reason: collision with root package name */
    public final View f113835v1;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final GCMComplexTwoLineButton f113836w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final GCMComplexTwoLineButton f113837w0;

    /* JADX INFO: renamed from: w1, reason: collision with root package name */
    public final TextView f113838w1;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final GCMComplexTwoLineButton f113839x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final GCMComplexTwoLineButton f113840x0;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    public final RPESeekBar f113841x1;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final GCMComplexTwoLineButton f113842y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final GCMComplexTwoLineButton f113843y0;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    public final RecyclerView f113844y1;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final GCMComplexTwoLineButton f113845z;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public final GCMComplexTwoLineButton f113846z0;

    /* JADX INFO: renamed from: z1, reason: collision with root package name */
    public final cr.e0 f113847z1;

    public class a implements mo.a {
        public a() {
        }

        @Override // mo.a
        public final void a(boolean z14) {
            f0 f0Var = f0.this;
            f0Var.f113823r1 = z14;
            f0Var.u0();
            d dVar = f0Var.C1;
            if (dVar != null) {
                dVar.S4();
            }
        }

        @Override // mo.a
        public final void b(List<Long> list) {
            ArrayList arrayList = new ArrayList(list);
            f0 f0Var = f0.this;
            f0Var.f113826s1 = arrayList;
            f0Var.u0();
            d dVar = f0Var.C1;
            if (dVar != null) {
                dVar.j1();
            }
        }

        @Override // mo.a
        public final void d() {
            d dVar = f0.this.C1;
            if (dVar != null) {
                dVar.A0();
            }
        }

        @Override // mo.a
        public final void u() {
            d dVar = f0.this.C1;
            if (dVar != null) {
                dVar.u();
            }
        }
    }

    public static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f113849a;

        static {
            int[] iArr = new int[l3.values().length];
            f113849a = iArr;
            try {
                iArr[l3.KILOMETER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f113849a[l3.MILE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f113849a[l3.METER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f113849a[l3.YARD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f113849a[l3.NAUTICAL_MILES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public interface d {
        void A0();

        void A3(am.x0 x0Var, am.x0 x0Var2);

        void S4();

        void j0();

        void j1();

        void j4(am.x0 x0Var);

        void u();
    }

    public enum e {
        METER(qs.y.UNIT_DISTANCE_METER.f147239a, 100.0d, 1, R.string.common_meters_string),
        YARD(qs.y.UNIT_DISTANCE_YARD.f147239a, 91.44d, 230, R.string.common_yards_string);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f113854a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f113855b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final double f113856c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f113857d;

        e(String str, double d14, int i14, int i15) {
            this.f113854a = str;
            this.f113855b = i14;
            this.f113856c = d14;
            this.f113857d = i15;
        }

        public static e a(String str, e eVar) {
            if (!TextUtils.isEmpty(str)) {
                for (e eVar2 : values()) {
                    if (eVar2.f113854a.equals(str)) {
                        return eVar2;
                    }
                }
            }
            return eVar;
        }
    }

    public class f extends c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f113858b;

        public f(String str) {
            super(f0.this, 0);
            this.f113858b = str;
        }

        @Override // lo.f0.c
        public final void a(d dVar) {
            String buttonTopLabel;
            double dC0;
            String str;
            double d14;
            int iE;
            int iE2;
            f12.l.f68084a.getClass();
            boolean zC = f12.l.a.a().c();
            f0 f0Var = f0.this;
            String string = f0Var.F.getContext().getString(zC ? R.string.lbl_fahrenheit : R.string.lbl_celsius);
            String str2 = this.f113858b;
            str2.getClass();
            switch (str2) {
                case "max_temperature":
                    buttonTopLabel = f0Var.G.getButtonTopLabel();
                    dC0 = f0Var.c0("max_temperature");
                    str = buttonTopLabel;
                    d14 = dC0;
                    break;
                case "average_temperature":
                    buttonTopLabel = f0Var.F.getButtonTopLabel();
                    dC0 = f0Var.c0("average_temperature");
                    str = buttonTopLabel;
                    d14 = dC0;
                    break;
                case "min_temperature":
                    buttonTopLabel = f0Var.H.getButtonTopLabel();
                    dC0 = f0Var.c0("min_temperature");
                    str = buttonTopLabel;
                    d14 = dC0;
                    break;
                default:
                    d14 = Double.NaN;
                    str = "";
                    break;
            }
            if (zC) {
                c22.l3.f23124b.getClass();
                d14 = c22.l3.a.d(d14);
            }
            String string2 = Double.isNaN(d14) ? null : Integer.toString((int) d14);
            if (zC) {
                iE = -140;
            } else {
                c22.l3.f23124b.getClass();
                iE = (int) c22.l3.a.e(-140.0d);
            }
            int i14 = iE;
            if (zC) {
                iE2 = 150;
            } else {
                c22.l3.f23124b.getClass();
                iE2 = (int) c22.l3.a.e(150.0d);
            }
            ((t) dVar).F6(i14, iE2, this.f113858b, null, com.nimbusds.jose.shaded.gson.internal.a.h(str, " (", string, ")"), string2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:75:0x0c6f  */
    /* JADX WARN: Multi-variable type inference failed */
    public f0(Activity activity, com.garmin.android.apps.connectmobile.activities.newmodel.h hVar, boolean z14, Calendar calendar, d dVar, boolean z15) {
        Integer num;
        ar.c cVar;
        boolean z16;
        com.garmin.android.apps.connectmobile.activities.newmodel.i0 i0Var;
        com.garmin.android.apps.connectmobile.activities.newmodel.i0 i0Var2;
        ps.a1 a1Var;
        boolean z17 = false;
        this.f113767d = false;
        this.f113826s1 = new ArrayList();
        this.f113829t1 = new ArrayList();
        this.f113832u1 = new a();
        this.A1 = -1;
        this.B1 = -1;
        this.C1 = null;
        this.H1 = am.l.f4048d;
        bv.b.f21240b.getClass();
        this.J1 = com.garmin.android.apps.connectmobile.k1.f37122a.l0() ? am.x0.f4271b3 : am.x0.f4308n;
        this.L1 = qs.g.UNCATEGORIZED;
        this.O1 = 1;
        this.X1 = false;
        this.Y1 = new HashMap<>();
        this.Z1 = new HashMap<>();
        this.f113758a2 = new HashMap<>();
        this.f113762b2 = am.j.z(f12.l.f68084a);
        this.f113766c2 = f12.l.a.a().y();
        this.f113770d2 = f12.l.a.a().y();
        ArrayList arrayList = new ArrayList();
        this.f113774e2 = arrayList;
        this.f113810n2 = false;
        this.f113814o2 = null;
        this.F1 = true;
        this.C1 = dVar;
        this.f113778f2 = hVar;
        this.f113782g2 = z14;
        this.f113786h2 = z15;
        sr.r rVar = new sr.r(new l22.a(activity));
        this.f113814o2 = rVar;
        if (hVar != null) {
            this.J1 = hVar.C();
            com.garmin.android.apps.connectmobile.activities.newmodel.s sVar = hVar.f29461n;
            if (sVar != null) {
                this.K1 = sVar.f29668m;
            }
        }
        boolean zY = f12.l.a.a().y();
        this.f113790i2 = zY;
        com.garmin.android.apps.connectmobile.activities.newmodel.h hVar2 = this.f113778f2;
        if (hVar2 != null) {
            String str = hVar2.C().f4358a;
            com.garmin.android.apps.connectmobile.activities.newmodel.i0 i0Var3 = hVar2.f29460m;
            num = null;
            cVar = new ar.c(str, i0Var3.f29509g1, Double.valueOf(i0Var3.f29512h), Double.valueOf(hVar2.f29460m.f29505f1));
        } else {
            num = null;
            cVar = null;
        }
        this.f113794j2 = ar.b.g(cVar, zY);
        this.S1 = G(this.J1);
        this.D1 = am.z0.R(this.J1.f4358a) ? activity.getString(R.string.common_what_happened) : activity.getString(R.string.txt_title_description_hint);
        this.E1 = activity.getString(R.string.txt_untitle);
        this.f113775f = (GCMComplexTwoLineButton) activity.findViewById(R.id.activity_name);
        this.f113765c1 = (GCMComplexTwoLineButton) activity.findViewById(R.id.activity_notes_button);
        this.f113779g = (GCMComplexTwoLineButton) activity.findViewById(R.id.activity_type);
        this.f113821r = (GCMComplexTwoLineButton) activity.findViewById(R.id.activity_privacy_type);
        this.f113818q = (GCMComplexTwoLineButton) activity.findViewById(R.id.activity_dive_edit_gas_details);
        this.f113783h = (GCMComplexTwoLineButton) activity.findViewById(R.id.activity_date);
        this.f113824s = (GCMComplexTwoLineButton) activity.findViewById(R.id.activity_time);
        this.f113787i = (GCMComplexTwoLineButton) activity.findViewById(R.id.activity_time_se);
        this.f113791j = (GCMComplexTwoLineButton) activity.findViewById(R.id.activity_duration);
        this.f113771e = (GCMComplexTwoLineButton) activity.findViewById(R.id.activity_distance);
        this.f113827t = (GCMComplexTwoLineButton) activity.findViewById(R.id.activity_pool_size);
        this.f113830u = (GCMComplexTwoLineButton) activity.findViewById(R.id.activity_number_of_lengths);
        this.f113835v1 = activity.findViewById(R.id.self_evaluation_container);
        this.f113838w1 = (TextView) activity.findViewById(R.id.rpe_value);
        RPESeekBar rPESeekBar = (RPESeekBar) activity.findViewById(R.id.rpe_seek_bar);
        this.f113841x1 = rPESeekBar;
        rPESeekBar.getThumb().setColorFilter(a7.b.getColor(activity, R.color.gcm_icon_primary), PorterDuff.Mode.SRC_IN);
        RecyclerView recyclerView = (RecyclerView) activity.findViewById(R.id.workout_feel_recycler_view);
        this.f113844y1 = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(activity, 0, false));
        this.f113844y1.setHasFixedSize(true);
        cr.e0 e0Var = new cr.e0();
        this.f113847z1 = e0Var;
        this.f113844y1.setAdapter(e0Var);
        this.f113795k = (GCMComplexTwoLineButton) activity.findViewById(R.id.activity_average_speed);
        this.f113799l = (GCMComplexTwoLineButton) activity.findViewById(R.id.activity_cross_average_speed);
        this.f113803m = (GCMComplexTwoLineButton) activity.findViewById(R.id.activity_active_splits_average_speed);
        this.f113807n = (GCMComplexTwoLineButton) activity.findViewById(R.id.activity_calories);
        this.f113811o = (GCMComplexTwoLineButton) activity.findViewById(R.id.activity_event_type);
        this.f113815p = (GCMComplexTwoLineButton) activity.findViewById(R.id.activity_event_type_se);
        this.O = (GCMComplexTwoLineButton) activity.findViewById(R.id.activity_course);
        this.f113755a = (GCMComplexOneLineButton) activity.findViewById(R.id.activity_add_more_data);
        this.f113833v = (GCMComplexTwoLineButton) activity.findViewById(R.id.activity_average_heart_rate);
        this.f113836w = (GCMComplexTwoLineButton) activity.findViewById(R.id.activity_max_heart_rate);
        this.f113839x = (GCMComplexTwoLineButton) activity.findViewById(R.id.activity_average_respiration_rate);
        this.f113842y = (GCMComplexTwoLineButton) activity.findViewById(R.id.activity_max_respiration_rate);
        this.R = (GCMComplexTwoLineButton) activity.findViewById(R.id.activity_best_lap_time);
        this.f113845z = (GCMComplexTwoLineButton) activity.findViewById(R.id.activity_elapsed_time);
        this.A = (GCMComplexTwoLineButton) activity.findViewById(R.id.activity_elevation_gain);
        this.B = (GCMComplexTwoLineButton) activity.findViewById(R.id.activity_elevation_loss);
        this.C = (GCMComplexTwoLineButton) activity.findViewById(R.id.activity_avg_ascent);
        this.D = (GCMComplexTwoLineButton) activity.findViewById(R.id.activity_max_ascent);
        this.E = (GCMComplexTwoLineButton) activity.findViewById(R.id.activity_total_ascent);
        this.F = (GCMComplexTwoLineButton) activity.findViewById(R.id.activity_average_temperature);
        this.I = (GCMComplexTwoLineButton) activity.findViewById(R.id.activity_max_speed_or_pace);
        this.S = (GCMComplexTwoLineButton) activity.findViewById(R.id.activity_max_speed);
        this.T = (GCMComplexTwoLineButton) activity.findViewById(R.id.activity_min_speed);
        this.P = (GCMComplexTwoLineButton) activity.findViewById(R.id.activity_floors_climbed);
        this.G = (GCMComplexTwoLineButton) activity.findViewById(R.id.activity_max_temperature);
        this.H = (GCMComplexTwoLineButton) activity.findViewById(R.id.activity_min_temperature);
        boolean zB = am.z0.b(am.x0.D, this.J1.f4358a);
        B0(this.G, activity.getString(zB ? R.string.activity_details_max_water_temperature : R.string.activity_details_max_temperature));
        B0(this.H, activity.getString(zB ? R.string.activity_details_min_water_temperature : R.string.activity_details_min_temperature));
        this.J = (GCMComplexTwoLineButton) activity.findViewById(R.id.activity_average_cadence);
        this.K = (GCMComplexTwoLineButton) activity.findViewById(R.id.activity_max_cadence);
        this.L = (GCMComplexTwoLineButton) activity.findViewById(R.id.activity_average_power);
        this.M = (GCMComplexTwoLineButton) activity.findViewById(R.id.activity_max_power);
        this.N = (GCMComplexTwoLineButton) activity.findViewById(R.id.activity_max_average_power);
        this.f113759b = activity.findViewById(R.id.activity_more_data_container);
        this.X0 = (TextView) activity.findViewById(R.id.activity_category_additional_stats);
        this.f113763c = (TextView) activity.findViewById(R.id.activity_settings_header_title);
        this.Q = (GCMComplexTwoLineButton) activity.findViewById(R.id.activity_dive_location);
        this.U = (GCMComplexTwoLineButton) activity.findViewById(R.id.activity_dive_entry_location);
        this.V = (GCMComplexTwoLineButton) activity.findViewById(R.id.activity_dive_exit_location);
        this.W = (GCMComplexTwoLineButton) activity.findViewById(R.id.activity_dive_decompression);
        this.X = (GCMComplexTwoLineButton) activity.findViewById(R.id.activity_dive_surface_interval);
        this.Y = (GCMComplexTwoLineButton) activity.findViewById(R.id.activity_dive_max_depth);
        this.Z = (GCMComplexTwoLineButton) activity.findViewById(R.id.activity_dive_water_type);
        this.f113756a0 = (GCMComplexTwoLineButton) activity.findViewById(R.id.activity_dive_weight);
        this.f113760b0 = (GCMComplexTwoLineButton) activity.findViewById(R.id.activity_dive_suit_type);
        this.f113764c0 = (GCMComplexTwoLineButton) activity.findViewById(R.id.activity_dive_suit_thickness);
        this.f113768d0 = (GCMComplexTwoLineButton) activity.findViewById(R.id.activity_dive_visibility);
        this.f113772e0 = (GCMComplexTwoLineButton) activity.findViewById(R.id.activity_dive_bottom_time);
        this.f113776f0 = (GCMComplexTwoLineButton) activity.findViewById(R.id.activity_dive_average_depth);
        this.f113780g0 = (GCMComplexTwoLineButton) activity.findViewById(R.id.activity_dive_surface_conditions);
        this.f113784h0 = (GCMComplexTwoLineButton) activity.findViewById(R.id.activity_dive_water_current);
        this.f113788i0 = (GCMComplexTwoLineButton) activity.findViewById(R.id.activity_dive_water_entry_type);
        this.f113792j0 = (GCMComplexTwoLineButton) activity.findViewById(R.id.activity_dive_equipment);
        this.f113796k0 = (GCMComplexTwoLineButton) activity.findViewById(R.id.activity_dive_buddy);
        this.f113804m0 = (GCMComplexTwoLineButton) activity.findViewById(R.id.activity_dive_po2_high_point);
        this.f113800l0 = (GCMComplexTwoLineButton) activity.findViewById(R.id.activity_dive_po2_low_point);
        this.f113812o0 = (GCMComplexTwoLineButton) activity.findViewById(R.id.activity_dive_po2_high_point_depth);
        this.f113808n0 = (GCMComplexTwoLineButton) activity.findViewById(R.id.activity_dive_po2_low_point_depth);
        this.f113816p0 = (GCMComplexTwoLineButton) activity.findViewById(R.id.activity_apnea_bottom_time);
        this.f113819q0 = (GCMComplexTwoLineButton) activity.findViewById(R.id.activity_dive_total_surface_interval);
        this.f113822r0 = (GCMComplexTwoLineButton) activity.findViewById(R.id.activity_lap_count);
        this.f113825s0 = (GCMComplexTwoLineButton) activity.findViewById(R.id.activity_apnea_max_depth);
        this.f113828t0 = (GCMComplexTwoLineButton) activity.findViewById(R.id.activity_apnea_equipment);
        this.f113831u0 = (GCMComplexTwoLineButton) activity.findViewById(R.id.activity_apnea_buddy);
        this.f113834v0 = (GCMComplexTwoLineButton) activity.findViewById(R.id.activity_dive_location_additional);
        this.f113837w0 = (GCMComplexTwoLineButton) activity.findViewById(R.id.activity_dive_water_type_additional);
        this.f113840x0 = (GCMComplexTwoLineButton) activity.findViewById(R.id.activity_dive_weight_additional);
        this.f113843y0 = (GCMComplexTwoLineButton) activity.findViewById(R.id.activity_dive_suit_type_additional);
        this.f113846z0 = (GCMComplexTwoLineButton) activity.findViewById(R.id.activity_dive_suit_thickness_additional);
        this.A0 = (GCMComplexTwoLineButton) activity.findViewById(R.id.activity_dive_visibility_additional);
        this.f113769d1 = (TextView) activity.findViewById(R.id.stat_editing_lbl);
        this.Y0 = (GCMComplexOneLineButton) activity.findViewById(R.id.activity_trim_activity);
        this.Z0 = (GCMComplexOneLineButton) activity.findViewById(R.id.edit_multisport_legs_activity);
        this.f113757a1 = (GCMComplexOneLineButton) activity.findViewById(R.id.activity_convert_to_multisport);
        this.f113761b1 = (GCMComplexTwoLineButton) activity.findViewById(R.id.activity_edit_intervals);
        this.B0 = (TextView) activity.findViewById(R.id.activity_nutrition_hydration_title);
        this.C0 = (GCMComplexTwoLineButton) activity.findViewById(R.id.activity_calories_burned);
        this.D0 = (GCMComplexTwoLineButton) activity.findViewById(R.id.activity_calories_consumed);
        this.E0 = (GCMComplexTwoLineButton) activity.findViewById(R.id.activity_calories_net);
        this.F0 = (GCMComplexTwoLineButton) activity.findViewById(R.id.activity_fluid_loss);
        this.G0 = (GCMComplexTwoLineButton) activity.findViewById(R.id.activity_fluid_consumed);
        this.H0 = (GCMComplexTwoLineButton) activity.findViewById(R.id.activity_fluid_net);
        this.J0 = (GCMComplexTwoLineButton) activity.findViewById(R.id.activity_number_of_routes);
        this.I0 = (GCMComplexTwoLineButton) activity.findViewById(R.id.activity_climb_route_grading_system);
        this.K0 = (GCMComplexTwoLineButton) activity.findViewById(R.id.activity_climb_max_difficulty);
        this.L0 = (GCMComplexTwoLineButton) activity.findViewById(R.id.activity_climb_sends);
        this.M0 = (GCMComplexTwoLineButton) activity.findViewById(R.id.activity_climb_falls);
        this.N0 = (GCMComplexTwoLineButton) activity.findViewById(R.id.activity_number_of_splits);
        this.O0 = (GCMComplexTwoLineButton) activity.findViewById(R.id.activity_splits_duration);
        this.P0 = (GCMComplexTwoLineButton) activity.findViewById(R.id.activity_splits_max_speed);
        this.Q0 = (GCMComplexTwoLineButton) activity.findViewById(R.id.activity_splits_max_distance);
        this.R0 = (GCMComplexTwoLineButton) activity.findViewById(R.id.activity_active_splits_duration);
        this.S0 = (GCMComplexTwoLineButton) activity.findViewById(R.id.activity_rest_splits_duration);
        this.T0 = (GCMComplexTwoLineButton) activity.findViewById(R.id.activity_active_splits_moving_duration);
        this.U0 = (GCMComplexTwoLineButton) activity.findViewById(R.id.activity_active_splits_idle_duration);
        this.V0 = (GCMComplexTwoLineButton) activity.findViewById(R.id.activity_total_time);
        this.W0 = (GCMComplexTwoLineButton) activity.findViewById(R.id.activity_ski_average_speed);
        this.f113773e1 = activity.findViewById(R.id.pack_weight_container_rucking);
        this.f113777f1 = activity.findViewById(R.id.pack_weight_container_non_rucking);
        this.f113781g1 = (GCMComplexTwoLineButton) activity.findViewById(R.id.activity_pack_weight_rucking);
        this.f113785h1 = (GCMComplexTwoLineButton) activity.findViewById(R.id.activity_pack_weight_non_rucking);
        this.f113789i1 = (GCMComplexTwoLineButton) activity.findViewById(R.id.activity_max_pack_weight_rucking);
        this.f113793j1 = (GCMComplexTwoLineButton) activity.findViewById(R.id.activity_max_pack_weight_non_rucking);
        this.f113797k1 = (GCMComplexTwoLineButton) activity.findViewById(R.id.activity_avg_pack_weight_rucking);
        this.f113801l1 = (GCMComplexTwoLineButton) activity.findViewById(R.id.activity_avg_pack_weight_non_rucking);
        this.f113805m1 = (ComposeView) activity.findViewById(R.id.activity_dogs_section);
        arrayList.add(this.f113834v0);
        arrayList.add(this.f113837w0);
        arrayList.add(this.f113840x0);
        arrayList.add(this.A0);
        arrayList.add(this.f113843y0);
        arrayList.add(this.f113846z0);
        arrayList.add(this.f113780g0);
        arrayList.add(this.f113784h0);
        arrayList.add(this.f113788i0);
        arrayList.add(this.f113792j0);
        arrayList.add(this.f113796k0);
        arrayList.add(this.f113827t);
        arrayList.add(this.f113830u);
        arrayList.add(this.I);
        arrayList.add(this.f113845z);
        arrayList.add(this.A);
        arrayList.add(this.B);
        arrayList.add(this.C);
        arrayList.add(this.D);
        arrayList.add(this.E);
        arrayList.add(this.L);
        arrayList.add(this.f113795k);
        arrayList.add(this.M);
        arrayList.add(this.N);
        arrayList.add(this.J);
        arrayList.add(this.K);
        arrayList.add(this.J0);
        arrayList.add(this.I0);
        arrayList.add(this.K0);
        arrayList.add(this.L0);
        arrayList.add(this.M0);
        arrayList.add(this.N0);
        arrayList.add(this.O0);
        arrayList.add(this.P0);
        arrayList.add(this.Q0);
        arrayList.add(this.f113781g1);
        arrayList.add(this.f113785h1);
        this.f113755a.setLeftLabelColor(a7.b.getColor(activity, R.color.gcm_text_primary_action));
        this.f113757a1.setLeftLabelColor(a7.b.getColor(activity, R.color.gcm_text_primary_action));
        H0(false);
        this.f113765c1.setOnClickListener(new q0(this));
        this.f113775f.setOnClickListener(new b1(this));
        this.f113787i.setOnClickListener(new m1(this));
        this.f113791j.setOnClickListener(new x1(this));
        this.f113772e0.setOnClickListener(new i2(this));
        this.f113816p0.setOnClickListener(new t2(this));
        this.X.setOnClickListener(new e3(this));
        this.f113819q0.setOnClickListener(new k3(this));
        this.f113821r.setOnClickListener(new v(this));
        this.f113779g.setOnClickListener(new w(this));
        this.f113783h.setOnClickListener(new x(this));
        this.f113824s.setOnClickListener(new y(this));
        this.f113827t.setOnClickListener(new z(this));
        this.f113830u.setOnClickListener(new a0(this));
        this.f113771e.setOnClickListener(new b0(this));
        this.f113807n.setOnClickListener(new c0(this));
        this.C0.setOnClickListener(new d0(this));
        this.D0.setOnClickListener(new e0(this));
        this.F0.setOnClickListener(new g0(this));
        this.G0.setOnClickListener(new h0(this));
        this.f113755a.setOnClickListener(new i0(this));
        this.f113833v.setOnClickListener(new j0(this));
        this.f113836w.setOnClickListener(new k0(this));
        this.f113839x.setOnClickListener(new l0(this));
        this.f113842y.setOnClickListener(new m0(this));
        this.P.setOnClickListener(new n0(this));
        this.R.setOnClickListener(new o0(this));
        this.f113845z.setOnClickListener(new p0(this));
        this.A.setOnClickListener(new r0(this));
        this.B.setOnClickListener(new s0(this));
        this.C.setOnClickListener(new t0(this));
        this.D.setOnClickListener(new u0(this));
        this.E.setOnClickListener(new v0(this));
        this.Y.setOnClickListener(new w0(this));
        this.f113825s0.setOnClickListener(new x0(this));
        this.f113776f0.setOnClickListener(new y0(this));
        this.f113764c0.setOnClickListener(new z0(this));
        this.f113846z0.setOnClickListener(new a1(this));
        this.f113768d0.setOnClickListener(new c1(this));
        this.A0.setOnClickListener(new d1(this));
        this.F.setOnClickListener(new f("average_temperature"));
        this.G.setOnClickListener(new f("max_temperature"));
        this.H.setOnClickListener(new f("min_temperature"));
        this.I.setOnClickListener(new e1(this));
        this.S.setOnClickListener(new f1(this));
        this.T.setOnClickListener(new g1(this));
        this.f113811o.setOnClickListener(new h1(this));
        this.f113815p.setOnClickListener(new i1(this));
        this.J.setOnClickListener(new j1(this));
        this.K.setOnClickListener(new k1(this));
        this.L.setOnClickListener(new l1(this));
        this.M.setOnClickListener(new n1(this));
        this.N.setOnClickListener(new o1(this));
        this.O.setOnClickListener(new p1(this));
        this.W.setOnClickListener(new q1(this));
        this.Q.setOnClickListener(new r1(this));
        this.U.setOnClickListener(new s1(this));
        this.V.setOnClickListener(new t1(this));
        this.f113834v0.setOnClickListener(new u1(this));
        this.f113792j0.setOnClickListener(new v1(this));
        this.f113828t0.setOnClickListener(new w1(this));
        this.f113796k0.setOnClickListener(new y1(this));
        this.f113831u0.setOnClickListener(new z1(this));
        this.f113760b0.setOnClickListener(new a2(this));
        this.f113843y0.setOnClickListener(new b2(this));
        this.f113780g0.setOnClickListener(new c2(this));
        this.f113784h0.setOnClickListener(new d2(this));
        this.Z.setOnClickListener(new e2(this));
        this.f113837w0.setOnClickListener(new f2(this));
        this.f113788i0.setOnClickListener(new g2(this));
        this.f113756a0.setOnClickListener(new h2(this));
        this.f113840x0.setOnClickListener(new j2(this));
        this.f113781g1.setOnClickListener(new k2(this));
        this.f113785h1.setOnClickListener(new l2(this));
        this.f113822r0.setOnClickListener(new m2(this));
        this.f113818q.setOnClickListener(new n2(this));
        this.f113804m0.setOnClickListener(new o2(this));
        this.f113800l0.setOnClickListener(new p2(this));
        this.f113812o0.setOnClickListener(new q2(this));
        this.f113808n0.setOnClickListener(new r2(this));
        this.f113761b1.setOnClickListener(new s2(this));
        this.J0.setOnClickListener(new u2(this));
        this.L0.setOnClickListener(new v2(this));
        this.M0.setOnClickListener(new w2(this));
        this.I0.setOnClickListener(new x2(this));
        this.K0.setOnClickListener(new y2(this));
        this.N0.setOnClickListener(new z2(this));
        this.R0.setOnClickListener(new a3(this));
        this.S0.setOnClickListener(new b3(this));
        this.T0.setOnClickListener(new c3(this));
        this.V0.setOnClickListener(new d3(this));
        this.U0.setOnClickListener(new f3(this));
        this.O0.setOnClickListener(new g3(this));
        this.P0.setOnClickListener(new h3(this));
        this.Q0.setOnClickListener(new i3(this));
        g(this.f113795k, false);
        g(this.f113799l, false);
        g(this.W0, false);
        g(this.f113803m, false);
        Q0(this.J1);
        J0(calendar);
        com.garmin.android.apps.connectmobile.activities.newmodel.h hVar3 = this.f113778f2;
        g(this.f113783h, !((hVar3 == null || (a1Var = hVar3.f29459l) == null || a1Var.getIsAtpActivity() == null || !hVar3.f29459l.getIsAtpActivity().booleanValue()) ? false : true));
        g(this.f113787i, !am.z0.b(am.x0.D2, this.J1.f4358a));
        am.x0 x0Var = this.J1;
        am.x0 x0Var2 = am.x0.E;
        if (x0Var == x0Var2 || x0Var.f4358a.equals(x0Var2.f4358a)) {
            g(this.f113779g, false);
        }
        if (this.f113778f2 != null) {
            C0();
            com.garmin.android.apps.connectmobile.activities.newmodel.h hVar4 = this.f113778f2;
            if (hVar4 != null ? ar.i.a(hVar4) : false) {
                com.garmin.android.apps.connectmobile.activities.newmodel.h hVar5 = this.f113778f2;
                if (hVar5 != null) {
                    i0Var2 = hVar5.f29460m;
                } else {
                    i0Var = num;
                }
                if (i0Var != 0) {
                    int i14 = i0Var.I2;
                    this.B1 = i14;
                    if (i14 == -1) {
                        i0Var = i0Var2;
                        i14 = 0;
                    }
                    i0Var = i0Var2;
                    this.f113841x1.setRPE(i14);
                    this.f113838w1.setText(rVar.a(Integer.valueOf(i14)));
                    nr.z0.f127601f.getClass();
                    List listA = nr.z0.a.a(num);
                    int i15 = -1;
                    if (i0Var.H2 > -1) {
                        nr.z0 z0Var = (nr.z0) listA.stream().findFirst().filter(new a73.n(i0Var, 17)).orElse(num);
                        int iIndexOf = listA.indexOf(z0Var);
                        if (z0Var != null) {
                            listA.set(iIndexOf, new nr.z0(z0Var.f127602a, z0Var.f127603b, z0Var.f127604c, true, z0Var.f127606e));
                        }
                    }
                    cr.e0 e0Var2 = this.f113847z1;
                    e0Var2.getClass();
                    listA.getClass();
                    ArrayList arrayList2 = e0Var2.f55267b;
                    arrayList2.clear();
                    arrayList2.addAll(listA);
                    Iterator it = arrayList2.iterator();
                    int i16 = 0;
                    while (it.hasNext()) {
                        if (((nr.z0) it.next()).f127605d) {
                            i15 = i16;
                            break;
                        }
                        i16++;
                    }
                    e0Var2.f55268c = i15;
                    e0Var2.notifyDataSetChanged();
                }
                i0Var = i0Var2;
                this.f113841x1.setOnRPEChangeListener(new hy.d(this, 23));
                cr.e0 e0Var3 = this.f113847z1;
                j3 j3Var = new j3(this);
                e0Var3.getClass();
                e0Var3.f55266a = j3Var;
                activity.findViewById(R.id.workout_self_evaluation_help_btn).setOnClickListener(new ii0.j(activity, 1));
            }
        }
        if (hVar != null) {
            bv.b.f21240b.getClass();
            if (com.garmin.android.apps.connectmobile.k1.f37122a.H0()) {
                z16 = true;
            } else {
                z16 = false;
            }
        } else {
            z16 = false;
        }
        this.f113809n1 = z16;
        if (z16) {
            ps.a1 a1Var2 = hVar.f29459l;
            if (a1Var2 != null && Boolean.TRUE.equals(a1Var2.getHasDog())) {
                z17 = true;
            }
            this.f113823r1 = z17;
            ps.a1 a1Var3 = hVar.f29459l;
            this.f113826s1 = new ArrayList((a1Var3 == null || a1Var3.s() == null) ? Collections.EMPTY_LIST : hVar.f29459l.s());
            T0();
        } else {
            this.f113817p1 = false;
            this.f113805m1.setVisibility(8);
        }
        if (this.f113798k2) {
            return;
        }
        this.f113802l2 = this.f113771e.getButtonBottomLeftLabel();
        this.f113798k2 = true;
    }

    public static void B0(GCMComplexTwoLineButton gCMComplexTwoLineButton, String str) {
        if (gCMComplexTwoLineButton != null) {
            gCMComplexTwoLineButton.setButtonTopLabel(str);
        }
    }

    public static Calendar C(com.garmin.android.apps.connectmobile.activities.newmodel.i0 i0Var) {
        if (i0Var.f29484a == null) {
            return null;
        }
        Calendar calendar = Calendar.getInstance();
        try {
            calendar.setTime(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS", Locale.getDefault()).parse(i0Var.f29484a));
            return calendar;
        } catch (ParseException e4) {
            com.garmin.android.apps.connectmobile.i2.e(com.garmin.android.apps.connectmobile.a2.ACTIVITIES, "CreateActivityViewHolder", e4);
            return calendar;
        }
    }

    public static double K(double d14, boolean z14) {
        if (z14) {
            return d14;
        }
        c22.m3 m3Var = c22.m3.METER;
        c22.m3 m3Var2 = c22.m3.FOOT;
        c22.l3.f23124b.getClass();
        return c22.l3.a.g(d14, m3Var, m3Var2);
    }

    public static String O(Context context, double d14) {
        l22.a aVar = new l22.a(context);
        c22.l3.f23124b.getClass();
        String strK0 = c22.l3.a.k0(aVar, d14, true, "");
        return TextUtils.isEmpty(strK0) ? context.getString(R.string.lbl_bpm) : strK0;
    }

    public static String P(double d14, Context context, boolean z14) {
        ns.o3 o3Var = new ns.o3(new l22.a(context), true, new ms.z());
        String strB = o3Var.b(9, new ps.h0(Double.valueOf(d14), new ps.z1(null, null, (z14 ? qs.y.UNIT_WEIGHT_KILOGRAM : qs.y.UNIT_WEIGHT_POUND).f147239a)), false);
        return !TextUtils.isEmpty(strB) ? strB : String.join(StringUtils.SPACE, o3Var.d(8), o3Var.i(null, 8));
    }

    public static String Q(Context context, double d14) {
        String strK = new c22.l3(context).k(d14, true);
        return TextUtils.isEmpty(strK) ? context.getString(R.string.activities_brpm_common_lbl) : strK;
    }

    public static String R(int i14, Context context) {
        String string;
        String strValueOf;
        double d14 = i14;
        c22.m3 m3Var = c22.m3.MILLIMETER;
        DecimalFormat decimalFormatM = c22.l3.m();
        c22.l3.f23124b.getClass();
        m3Var.getClass();
        int i15 = m3Var.f23164e;
        if (Double.isNaN(d14) || d14 <= 0.0d) {
            string = "";
        } else {
            if (decimalFormatM == null || (strValueOf = decimalFormatM.format(d14)) == null) {
                strValueOf = String.valueOf(d14);
            }
            StringBuilder sb3 = new StringBuilder(strValueOf);
            if (context != null) {
                String string2 = context.getString(i15);
                string2.getClass();
                sb3.append(StringUtils.SPACE);
                sb3.append(string2);
            }
            string = sb3.toString();
        }
        return TextUtils.isEmpty(string) ? context.getString(i15) : string;
    }

    public static String S(double d14) {
        double d15;
        f12.l.f68084a.getClass();
        if (f12.l.a.a().c()) {
            c22.l3.f23124b.getClass();
            d15 = c22.l3.a.d(d14);
        } else {
            d15 = d14;
        }
        if (Double.isNaN(d14)) {
            return null;
        }
        return String.valueOf(d15);
    }

    public static String T(GCMComplexTwoLineButton gCMComplexTwoLineButton, double d14) {
        if (gCMComplexTwoLineButton == null) {
            return null;
        }
        Context context = gCMComplexTwoLineButton.getContext();
        f12.l.f68084a.getClass();
        boolean zC = f12.l.a.a().c();
        if (Double.isNaN(d14)) {
            return context.getString(zC ? R.string.lbl_fahrenheit : R.string.lbl_celsius);
        }
        l22.a aVar = new l22.a(context);
        c22.l3.f23124b.getClass();
        return c22.l3.a.U0(aVar, d14, zC, false, true);
    }

    public static String U(GCMComplexTwoLineButton gCMComplexTwoLineButton, double d14) {
        int i14 = (int) d14;
        Context context = gCMComplexTwoLineButton.getContext();
        String string = gCMComplexTwoLineButton.getContext().getString(R.string.activity_details_diving_select_one);
        if (i14 == 0) {
            return context.getString(R.string.activity_details_water_type_fresh);
        }
        if (i14 != 1) {
            return i14 != 3 ? string : context.getString(R.string.activity_details_water_type_custom);
        }
        return context.getString(R.string.activity_details_water_type_salt);
    }

    public static String V(double d14, Context context, boolean z14) {
        if (context == null) {
            return "";
        }
        if (d14 <= 0.0d || Double.isNaN(d14)) {
            return z14 ? context.getResources().getString(R.string.lbl_kg) : context.getResources().getString(R.string.lbl_lbs);
        }
        DecimalFormat decimalFormatN = c22.l3.n();
        if (z14) {
            return decimalFormatN.format(d14) + StringUtils.SPACE + context.getResources().getString(R.string.lbl_kg);
        }
        return decimalFormatN.format(d14) + StringUtils.SPACE + context.getResources().getString(R.string.lbl_lbs);
    }

    public static void g(GCMComplexTwoLineButton gCMComplexTwoLineButton, boolean z14) {
        if (gCMComplexTwoLineButton != null) {
            gCMComplexTwoLineButton.setEnabled(z14);
        }
    }

    public static void h(GCMComplexOneLineButton gCMComplexOneLineButton, boolean z14) {
        if (gCMComplexOneLineButton != null) {
            gCMComplexOneLineButton.setVisibility(z14 ? 0 : 8);
        }
    }

    public static void i(GCMComplexTwoLineButton gCMComplexTwoLineButton, boolean z14) {
        if (gCMComplexTwoLineButton != null) {
            gCMComplexTwoLineButton.setVisibility(z14 ? 0 : 8);
        }
    }

    public static void l(View view2, boolean z14) {
        if (view2 != null) {
            view2.setVisibility(z14 ? 0 : 8);
        }
    }

    public static String m(double d14, Context context, boolean z14) {
        c22.l3.f23124b.getClass();
        String strE1 = c22.l3.a.E1(context, z14, false);
        if (Double.isNaN(d14) || d14 == 0.0d) {
            return strE1;
        }
        return Math.round(d14) + StringUtils.SPACE + strE1;
    }

    public static double n1(double d14) {
        if (Double.isNaN(d14) || Double.compare(d14, 0.0d) == 0) {
            return Double.NaN;
        }
        return d14;
    }

    public static void v0(GCMComplexTwoLineButton gCMComplexTwoLineButton, String str) {
        w0(gCMComplexTwoLineButton, str, "");
    }

    public static void w0(GCMComplexTwoLineButton gCMComplexTwoLineButton, String str, String str2) {
        if (gCMComplexTwoLineButton != null) {
            if (TextUtils.isEmpty(str)) {
                str = str2;
            }
            gCMComplexTwoLineButton.setButtonBottomLeftLabel(str);
        }
    }

    public static void x0(Context context, GCMComplexTwoLineButton gCMComplexTwoLineButton, double d14) {
        if (Double.isNaN(d14)) {
            v0(gCMComplexTwoLineButton, context.getString(R.string.no_value));
        } else {
            v0(gCMComplexTwoLineButton, c22.l3.g(d14, context, true));
        }
    }

    public static void y0(Context context, GCMComplexTwoLineButton gCMComplexTwoLineButton, double d14) {
        if (Double.isNaN(d14)) {
            v0(gCMComplexTwoLineButton, context.getString(R.string.lbl_unit_milliliter_abr));
        } else {
            v0(gCMComplexTwoLineButton, c22.l3.g(d14, context, false));
        }
    }

    public final double A() {
        return c0("bestLapTime");
    }

    public final void A0(double d14, String str) {
        f12.l.f68084a.getClass();
        boolean zC = f12.l.a.a().c();
        HashMap<String, Double> map = this.Z1;
        if (!zC) {
            map.put(str, Double.valueOf(d14));
        } else {
            c22.l3.f23124b.getClass();
            map.put(str, Double.valueOf(c22.l3.a.e(d14)));
        }
    }

    public final double B() {
        return c0("bottom_time");
    }

    /* JADX WARN: Code duplicated, block: B:132:0x0364  */
    public final void C0() {
        am.l lVarA;
        Object next;
        c22.m3 m3Var;
        double d14;
        double d15;
        double d16;
        ps.a1 a1Var;
        d dVar;
        ps.o1 o1Var;
        ps.o1 o1Var2;
        ps.a1 a1Var2;
        ps.a1 a1Var3;
        com.garmin.android.apps.connectmobile.activities.newmodel.h hVar = this.f113778f2;
        if (hVar == null) {
            return;
        }
        c1("name", hVar.f29449b);
        c1("notes", this.f113778f2.f29450c);
        com.garmin.android.apps.connectmobile.activities.newmodel.i0 i0Var = this.f113778f2.f29460m;
        c1("min_temperature", S(i0Var.P));
        c1("average_temperature", S(i0Var.F));
        c1("max_temperature", S(i0Var.I));
        e1(false, "average_heart_rate", i0Var.f29560x);
        e1(false, "max_heart_rate", i0Var.f29563y);
        e1(false, "average_respiration_rate", i0Var.f29553u2);
        e1(false, "max_respiration_rate", i0Var.f29551t2);
        e1(false, "floors_climbed", i0Var.R1);
        this.f113767d = true;
        e1(false, "best_pace", i0Var.f29544r);
        e1(false, "elevation_gain", K(i0Var.f29526l, am.r1.r()));
        e1(false, "elevation_loss", K(i0Var.f29529m, am.r1.r()));
        e1(false, "duration", i0Var.f29516i);
        e1(false, "duration_millis", i0Var.f29516i);
        ps.a aVar = this.f113778f2.f29457j;
        if (aVar != null) {
            String categoryAccessRule = aVar.b().getCategoryAccessRule();
            am.l.f4047c.getClass();
            lVarA = am.l.a.a(categoryAccessRule, am.l.f4051g);
        } else {
            lVarA = am.l.f4051g;
        }
        O0(lVarA);
        Q0(this.f113778f2.C());
        J0(C(i0Var));
        P0(C(i0Var));
        double d17 = i0Var.f29565y2;
        c22.l3.a aVar2 = c22.l3.f23124b;
        aVar2.getClass();
        e1(false, "bestLapTime", d17 * ((double) 1000));
        e1(false, "elapsed_time", i0Var.f29516i);
        com.garmin.android.apps.connectmobile.activities.newmodel.h hVar2 = this.f113778f2;
        c1("dive_location", hVar2 != null ? hVar2.f29454g : null);
        if (!am.z0.P(this.f113778f2.C().f4358a)) {
            com.garmin.android.apps.connectmobile.activities.newmodel.h hVar3 = this.f113778f2;
            e1(false, "lapCount", (hVar3 == null || (a1Var3 = hVar3.f29459l) == null || a1Var3.getLapCount() == null) ? 0.0d : this.f113778f2.f29459l.getLapCount().intValue());
        }
        double d18 = i0Var.f29544r;
        boolean z14 = this.f113790i2;
        c22.q3 q3Var = z14 ? c22.q3.KILOMETER_PER_HOUR : c22.q3.MILE_PER_HOUR;
        aVar2.getClass();
        e1(false, "racingMaxSpeed", c22.l3.a.i(d18, q3Var));
        ps.p0 p0Var = this.f113778f2.f29456i;
        qs.g.f147071e.getClass();
        p0Var.getClass();
        Iterator<T> it = qs.g.f147083q.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            Integer typeId = p0Var.getTypeId();
            int i14 = ((qs.g) next).f147084a;
            if (typeId != null && typeId.intValue() == i14) {
                break;
            }
        }
        qs.g gVar = (qs.g) next;
        if (gVar == null) {
            gVar = qs.g.UNCATEGORIZED;
        }
        this.L1 = gVar;
        GCMComplexTwoLineButton gCMComplexTwoLineButton = this.f113811o;
        if (gCMComplexTwoLineButton != null) {
            v0(gCMComplexTwoLineButton, gCMComplexTwoLineButton.getContext().getString(gVar.f147087d));
        }
        GCMComplexTwoLineButton gCMComplexTwoLineButton2 = this.f113815p;
        if (gCMComplexTwoLineButton2 != null) {
            v0(gCMComplexTwoLineButton2, gCMComplexTwoLineButton2.getContext().getString(gVar.f147087d));
        }
        int i15 = b.f113849a[G(this.f113778f2.C()).ordinal()];
        if (i15 == 2) {
            m3Var = c22.m3.MILE;
        } else if (i15 == 3) {
            m3Var = c22.m3.METER;
        } else if (i15 != 4) {
            m3Var = i15 != 5 ? c22.m3.KILOMETER : c22.m3.NAUTICAL;
        } else {
            m3Var = c22.m3.YARD;
        }
        double dDoubleValue = i0Var.f29512h;
        double dDoubleValue2 = i0Var.f29529m;
        if (am.z0.O(this.f113778f2.C().f4358a)) {
            double d19 = i0Var.f29512h;
            com.garmin.android.apps.connectmobile.activities.newmodel.h hVar4 = this.f113778f2;
            d14 = 0.0d;
            dDoubleValue = d19 / ((double) ((hVar4 == null || (a1Var2 = hVar4.f29459l) == null || a1Var2.getLapCount() == null) ? 1 : this.f113778f2.f29459l.getLapCount().intValue()));
        } else {
            d14 = 0.0d;
        }
        if (am.z0.P(this.f113778f2.C().f4358a) && (o1Var2 = (ps.o1) this.f113778f2.f29464q.stream().filter(new im.c(4)).findFirst().orElse(null)) != null) {
            dDoubleValue = o1Var2.getDistance() != null ? o1Var2.getDistance().doubleValue() : d14;
            if (o1Var2.getElevationLoss() != null) {
                dDoubleValue2 = o1Var2.getElevationLoss().doubleValue();
            }
            e1(false, "elevation_loss", K(dDoubleValue2, am.r1.r()));
        }
        if (am.z0.b(am.x0.R0, this.f113778f2.C().f4358a) && (o1Var = (ps.o1) this.f113778f2.f29464q.stream().filter(new im.c(5)).findFirst().orElse(null)) != null) {
            dDoubleValue = o1Var.getDistance() != null ? o1Var.getDistance().doubleValue() : d14;
            double dDoubleValue3 = o1Var.getMaxSpeed() != null ? o1Var.getMaxSpeed().doubleValue() : d14;
            this.f113767d = true;
            e1(false, "best_pace", dDoubleValue3);
            e1(false, "elevation_loss", K(o1Var.getElevationLoss() != null ? o1Var.getElevationLoss().doubleValue() : d14, am.r1.r()));
        }
        c22.l3.f23124b.getClass();
        double dJ = c22.l3.a.j(dDoubleValue, m3Var);
        int i16 = (int) dJ;
        int iRound = (int) Math.round((dJ - ((double) i16)) * 100.0d);
        if (this.J1 == am.x0.f4313o1) {
            ps.z1 z1Var = i0Var.f29509g1;
            double d24 = Double.isNaN(i0Var.f29501e1) ? 25.0d : i0Var.f29501e1;
            String unitKey = (z14 ? e.METER : e.YARD).f113854a;
            if (z1Var != null) {
                unitKey = z1Var.getUnitKey();
            }
            N0(d24, unitKey);
            f1((int) i0Var.f29505f1);
        }
        L0(i16, iRound, G(this.f113778f2.C()));
        if (am.z0.b(am.x0.f4308n, this.J1.f4358a)) {
            d15 = i0Var.f29566z;
            d16 = i0Var.A;
        } else if (am.z0.b(am.x0.f4316p, this.J1.f4358a)) {
            d15 = i0Var.f29566z;
            d16 = i0Var.A;
        } else if (am.z0.b(am.x0.f4268a3, this.J1.f4358a)) {
            d15 = i0Var.O2;
            d16 = i0Var.P2;
        } else if (am.z0.b(am.x0.f4312o, this.J1.f4358a) || am.z0.J(this.J1.f4358a) || am.z0.L(this.J1.f4358a)) {
            d15 = i0Var.B;
            d16 = i0Var.C;
        } else {
            d15 = Double.NaN;
            d16 = Double.NaN;
        }
        e1(false, "average_cadence", d15);
        e1(false, "max_cadence", d16);
        e1(false, "average_power", i0Var.T);
        e1(false, "max_power", i0Var.X);
        e1(false, "max_average_power", i0Var.Y);
        if ((am.z0.b(am.x0.f4312o, this.J1.f4358a) || this.J1 == am.x0.C) && (a1Var = this.f113778f2.f29459l) != null) {
            String associatedCourseId = a1Var.getAssociatedCourseId();
            if (!TextUtils.isEmpty(associatedCourseId) && (dVar = this.C1) != null) {
                t tVar = (t) dVar;
                g22.e.l(tVar);
                tVar.f113955g = new s(tVar);
                tVar.f113954f = ((am.d) KoinJavaComponent.get(am.d.class)).c(associatedCourseId, tVar.f113955g);
            }
        }
        if (am.z0.M(this.J1.f4358a)) {
            D0();
        } else if (am.z0.b(am.x0.D, this.J1.f4358a)) {
            E0();
        }
        G0(this.J1.f4358a);
        double dU6 = i0Var.f29549t;
        if (dU6 == d14) {
            dU6 = t.u6(this.J1, this.G1, q());
        }
        double dV6 = i0Var.f29557w;
        if (dV6 == d14) {
            dV6 = t.v6(this.G1);
        }
        e1(false, "calories", dU6);
        e1(false, "bmrCalories", dV6);
        if (t0()) {
            e1(false, "calories_burned", dU6);
            e1(false, "calories_consumed", i0Var.f29546r2);
            e1(false, "fluids_loss", i0Var.f29559w2);
            e1(false, "fluids_consumed", i0Var.f29562x2);
        }
    }

    public final double D() {
        return c0("falls");
    }

    public final void D0() {
        com.garmin.android.apps.connectmobile.activities.newmodel.t tVar;
        Integer num;
        com.garmin.android.apps.connectmobile.activities.newmodel.h hVar = this.f113778f2;
        com.garmin.android.apps.connectmobile.activities.newmodel.i0 i0Var = hVar != null ? hVar.f29460m : null;
        ps.a1 a1Var = hVar != null ? hVar.f29459l : null;
        com.garmin.android.apps.connectmobile.activities.newmodel.s sVar = hVar != null ? hVar.f29461n : null;
        String str = hVar != null ? hVar.f29454g : null;
        e1(false, "lapCount", (a1Var == null || a1Var.getLapCount() == null) ? 0.0d : a1Var.getLapCount().intValue());
        e1(false, "max_depth", i0Var != null ? J(i0Var.V1) : 0.0d);
        e1(false, "water_type", (sVar == null || (tVar = sVar.f29668m) == null || (num = tVar.f29674e) == null) ? 0.0d : num.intValue());
        e1(false, "bottom_time", i0Var != null ? i0Var.f29502e2 : 0.0d);
        e1(false, "totalSurfaceTime", sVar != null ? sVar.f29667l : 0.0d);
        m1(sVar != null ? sVar.f29656a : 0, this.f113762b2);
        c1("dive_location", str);
        c1("suit_type", sVar == null ? null : sVar.f29658c);
        k1(sVar == null ? null : sVar.f29658c);
        e1(false, "suit_thickness", sVar == null ? 0.0d : sVar.f29659d);
        e1(false, "visibility", sVar != null ? sVar.f29660e : 0.0d);
        c1("surface_conditions", sVar == null ? null : sVar.f29662g);
        c1("current", sVar == null ? null : sVar.f29663h);
        c1("entry_type", sVar == null ? null : sVar.f29664i);
        c1("equipment", sVar == null ? null : sVar.f29665j);
        c1("buddy", sVar != null ? sVar.f29666k : null);
        c1("water_type", ar.d.a(this.Z.getContext(), this.K1));
        boolean z14 = this.f113782g2;
        this.f113816p0.setEnabled(!z14);
        com.garmin.android.apps.connectmobile.activities.newmodel.h hVar2 = this.f113778f2;
        this.f113822r0.setEnabled(hVar2 == null || hVar2.f29448a <= 0);
        this.f113819q0.setEnabled(!z14);
        double d14 = i0Var != null ? i0Var.f29496d : Double.NaN;
        this.T1 = d14;
        double d15 = i0Var != null ? i0Var.f29500e : Double.NaN;
        this.U1 = d15;
        this.V1 = i0Var != null ? i0Var.f29504f : Double.NaN;
        this.W1 = i0Var != null ? i0Var.f29508g : Double.NaN;
        X0(d14, d15);
        Y0(this.V1, this.W1);
    }

    public final double E() {
        return c0("routes");
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0027  */
    public final void E0() {
        boolean z14;
        Double d14;
        Double d15;
        Double d16;
        Double d17;
        com.garmin.android.apps.connectmobile.activities.newmodel.h hVar = this.f113778f2;
        com.garmin.android.apps.connectmobile.activities.newmodel.i0 i0Var = hVar != null ? hVar.f29460m : null;
        com.garmin.android.apps.connectmobile.activities.newmodel.s sVar = hVar != null ? hVar.f29461n : null;
        String str = hVar != null ? hVar.f29454g : null;
        if (i0Var == null) {
            z14 = false;
        } else {
            Boolean bool = i0Var.f29494c2;
            if (bool == null ? false : bool.booleanValue()) {
                z14 = true;
            } else {
                z14 = false;
            }
        }
        d1("deco_dive", z14);
        double dJ = 0.0d;
        e1(false, "surface_interval", i0Var != null ? i0Var.X1 : 0.0d);
        c1("dive_location", str);
        e1(false, "max_depth", i0Var != null ? J(i0Var.V1) : 0.0d);
        m1(sVar != null ? sVar.f29656a : 0, this.f113762b2);
        c1("suit_type", sVar == null ? null : sVar.f29658c);
        e1(false, "suit_thickness", sVar == null ? 0.0d : sVar.f29659d);
        k1(sVar == null ? null : sVar.f29658c);
        e1(false, "visibility", sVar != null ? sVar.f29660e : 0.0d);
        e1(false, "bottom_time", i0Var != null ? i0Var.f29502e2 : 0.0d);
        e1(false, "avg_depth", i0Var != null ? J(i0Var.W1) : 0.0d);
        c1("surface_conditions", sVar == null ? null : sVar.f29662g);
        c1("current", sVar == null ? null : sVar.f29663h);
        c1("entry_type", sVar == null ? null : sVar.f29664i);
        c1("equipment", sVar == null ? null : sVar.f29665j);
        c1("buddy", sVar != null ? sVar.f29666k : null);
        com.garmin.android.apps.connectmobile.activities.newmodel.t tVar = this.K1;
        e1(false, "po2HighPointDepth", (tVar == null || (d17 = tVar.f29681l) == null) ? 0.0d : J(d17.doubleValue()));
        com.garmin.android.apps.connectmobile.activities.newmodel.t tVar2 = this.K1;
        if (tVar2 != null && (d16 = tVar2.f29678i) != null) {
            dJ = J(d16.doubleValue());
        }
        e1(false, "po2LowPointDepth", dJ);
        com.garmin.android.apps.connectmobile.activities.newmodel.t tVar3 = this.K1;
        e1(false, "po2MaxValue", (tVar3 == null || (d15 = tVar3.f29680k) == null) ? 1.3d : d15.doubleValue());
        com.garmin.android.apps.connectmobile.activities.newmodel.t tVar4 = this.K1;
        e1(false, "po2MinValue", (tVar4 == null || (d14 = tVar4.f29677h) == null) ? 0.7d : d14.doubleValue());
        c1("water_type", ar.d.a(this.Z.getContext(), this.K1));
        F0(sVar);
        boolean z15 = !this.f113782g2;
        this.f113772e0.setEnabled(z15);
        this.X.setEnabled(z15);
        double d18 = i0Var != null ? i0Var.f29496d : Double.NaN;
        this.T1 = d18;
        double d19 = i0Var != null ? i0Var.f29500e : Double.NaN;
        this.U1 = d19;
        this.V1 = i0Var != null ? i0Var.f29504f : Double.NaN;
        this.W1 = i0Var != null ? i0Var.f29508g : Double.NaN;
        X0(d18, d19);
        Y0(this.V1, this.W1);
    }

    public final double F() {
        return c0("sends");
    }

    public final void F0(com.garmin.android.apps.connectmobile.activities.newmodel.s sVar) {
        String string;
        List<com.garmin.android.apps.connectmobile.activities.newmodel.r> list;
        Integer numValueOf = (sVar == null || (list = sVar.f29669n) == null) ? null : Integer.valueOf(list.size());
        if (numValueOf == null || numValueOf.intValue() == 0) {
            string = this.f113818q.getContext().getString(R.string.activity_details_diving_select_one);
        } else {
            int iIntValue = numValueOf.intValue();
            GCMComplexTwoLineButton gCMComplexTwoLineButton = this.f113818q;
            string = iIntValue > 1 ? gCMComplexTwoLineButton.getContext().getString(R.string.lbl_number_of_gases, String.valueOf(numValueOf)) : gCMComplexTwoLineButton.getContext().getString(R.string.lbl_single_gas);
        }
        v0(this.f113818q, string);
    }

    public final l3 G(am.x0 x0Var) {
        String str = x0Var.f4358a;
        String str2 = x0Var.f4358a;
        if (am.z0.i0(str)) {
            return l3.NAUTICAL_MILES;
        }
        boolean zB = am.z0.b(am.x0.f4324r, str2);
        boolean z14 = this.f113790i2;
        if (zB) {
            return z14 ? l3.METER : l3.YARD;
        }
        if (am.z0.b(am.x0.f4297k1, str2) || am.z0.b(am.x0.f4301l1, str2) || am.z0.Q(str2)) {
            return l3.METER;
        }
        if (am.z0.b(am.x0.I0, str2)) {
            return l3.METER;
        }
        return z14 ? l3.KILOMETER : l3.MILE;
    }

    public final void G0(String str) {
        boolean z14;
        ps.o1 o1VarA;
        am.z0 z0Var = am.z0.f4390a;
        if (xy2.b.B(z0Var, str)) {
            z14 = true;
        } else if (!xy2.b.C(z0Var, str)) {
            return;
        } else {
            z14 = false;
        }
        com.garmin.android.apps.connectmobile.activities.newmodel.h hVar = this.f113778f2;
        if (hVar != null) {
            o1VarA = ss.l.a(qs.x.PACK_WEIGHT.f147220a, hVar.f29464q);
        } else {
            o1VarA = null;
        }
        if (o1VarA != null) {
            double dDoubleValue = o1VarA.getMaxPackWeight() != null ? o1VarA.getMaxPackWeight().doubleValue() : Double.NaN;
            double dDoubleValue2 = o1VarA.getAvgPackWeight() != null ? o1VarA.getAvgPackWeight().doubleValue() : Double.NaN;
            if (z14) {
                GCMComplexTwoLineButton gCMComplexTwoLineButton = this.f113793j1;
                v0(gCMComplexTwoLineButton, P(dDoubleValue, gCMComplexTwoLineButton.getContext(), this.f113762b2));
                GCMComplexTwoLineButton gCMComplexTwoLineButton2 = this.f113801l1;
                v0(gCMComplexTwoLineButton2, P(dDoubleValue2, gCMComplexTwoLineButton2.getContext(), this.f113762b2));
            } else {
                GCMComplexTwoLineButton gCMComplexTwoLineButton3 = this.f113789i1;
                v0(gCMComplexTwoLineButton3, P(dDoubleValue, gCMComplexTwoLineButton3.getContext(), this.f113762b2));
                GCMComplexTwoLineButton gCMComplexTwoLineButton4 = this.f113797k1;
                v0(gCMComplexTwoLineButton4, P(dDoubleValue2, gCMComplexTwoLineButton4.getContext(), this.f113762b2));
            }
        }
        com.garmin.android.apps.connectmobile.activities.newmodel.h hVar2 = this.f113778f2;
        com.garmin.android.apps.connectmobile.activities.newmodel.i0 i0Var = hVar2 != null ? hVar2.f29460m : null;
        h1(i0Var != null ? i0Var.f29495c3 : Double.NaN, this.f113762b2, z14);
    }

    public final double H() {
        return c0("avg_depth");
    }

    public final void H0(boolean z14) {
        this.X1 = z14;
        View view2 = this.f113759b;
        if (view2 != null) {
            view2.setVisibility(z14 ? 0 : 8);
        }
        GCMComplexOneLineButton gCMComplexOneLineButton = this.f113755a;
        if (gCMComplexOneLineButton != null) {
            this.f113755a.setButtonLeftLabel(gCMComplexOneLineButton.getContext().getString(this.X1 ? R.string.activity_details_hide_data : R.string.activity_details_show_more_data));
        }
    }

    public final List<Long> I() {
        return this.f113817p1 ? this.f113826s1 : new ArrayList();
    }

    public final void I0() {
        double dU6;
        double dV6;
        com.garmin.android.apps.connectmobile.activities.newmodel.h hVar = this.f113778f2;
        if (hVar == null || hVar.f29459l == null || hVar.f29460m == null) {
            dU6 = t.u6(this.J1, this.G1, q());
            dV6 = t.v6(this.G1);
        } else {
            com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.ACTIVITIES;
            String str = "updateActivityCalories: " + this.f113778f2.f29459l.getAutoCalcCalories();
            com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
            com.garmin.android.apps.connectmobile.i2.a.k(a2Var, "CreateActivityViewHolder", str);
            if (this.f113778f2.f29459l.getAutoCalcCalories() == null || !this.f113778f2.f29459l.getAutoCalcCalories().booleanValue()) {
                com.garmin.android.apps.connectmobile.activities.newmodel.i0 i0Var = this.f113778f2.f29460m;
                double d14 = i0Var.f29549t;
                dV6 = i0Var.f29557w;
                dU6 = d14;
            } else {
                dU6 = t.u6(this.J1, this.G1, q());
                if (dU6 == 0.0d) {
                    dU6 = this.f113778f2.f29460m.f29549t;
                }
                dV6 = t.v6(this.G1);
                if (dV6 == 0.0d) {
                    dV6 = this.f113778f2.f29460m.f29557w;
                }
            }
        }
        e1(false, "bmrCalories", dV6);
        if (!this.f113810n2) {
            e1(false, "calories", dU6);
        }
        e1(false, "calories_burned", dU6);
        this.f113766c2 = true;
    }

    public final double J(double d14) {
        if (this.f113790i2) {
            return d14;
        }
        c22.m3 m3Var = c22.m3.METER;
        c22.m3 m3Var2 = c22.m3.FOOT;
        c22.l3.f23124b.getClass();
        return c22.l3.a.g(d14, m3Var, m3Var2);
    }

    public final void J0(Calendar calendar) {
        if (calendar == null) {
            calendar = Calendar.getInstance(Locale.getDefault());
        }
        this.I1 = calendar;
        GCMComplexTwoLineButton gCMComplexTwoLineButton = this.f113783h;
        if (gCMComplexTwoLineButton != null) {
            v0(this.f113783h, DateFormat.getMediumDateFormat(gCMComplexTwoLineButton.getContext()).format(this.I1.getTime()));
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00e0  */
    public final void K0() {
        String strD;
        if (am.z0.f0(this.J1.f4358a) || am.z0.z(this.J1.f4358a)) {
            return;
        }
        if (am.z0.b(am.x0.D, this.J1.f4358a)) {
            return;
        }
        GCMComplexTwoLineButton gCMComplexTwoLineButton = this.f113771e;
        if (gCMComplexTwoLineButton == null) {
            i(this.f113795k, false);
            i(this.W0, false);
            i(this.I, false);
            return;
        }
        Context context = gCMComplexTwoLineButton.getContext();
        am.x0 x0Var = this.J1;
        if (x0Var == am.x0.f4313o1) {
            double d14 = this.M1 * ((double) this.O1);
            this.R1 = d14;
            c22.l3.f23124b.getClass();
            strD = c22.l3.d(d14 == Math.rint(d14), context.getString(e.a(this.N1, e.METER).f113857d), this.R1);
        } else {
            boolean zB = am.z0.b(am.x0.f4324r, x0Var.f4358a);
            boolean zI0 = am.z0.i0(this.J1.f4358a);
            int i14 = this.P1;
            int i15 = this.Q1;
            if (zB) {
                c22.l3.f23124b.getClass();
                this.R1 = i15 / 10 < 1 ? (((double) i15) / 10.0d) + ((double) i14) : (((double) i15) / 100.0d) + ((double) i14);
            } else {
                c22.l3.f23124b.getClass();
                this.R1 = (((double) i15) / Math.pow(10.0d, 2)) + ((double) i14);
            }
            if (zI0) {
                strD = c22.l3.d(false, context.getString(R.string.lbl_nautical_miles_abr), this.R1);
            } else {
                if (am.z0.b(am.x0.I0, this.J1.f4358a)) {
                    strD = c22.l3.d(true, context.getString(this.S1.f113908b), this.R1);
                } else {
                    if (am.z0.b(am.x0.f4297k1, this.J1.f4358a)) {
                        strD = c22.l3.d(true, context.getString(this.S1.f113908b), this.R1);
                    } else {
                        if (am.z0.b(am.x0.f4301l1, this.J1.f4358a)) {
                            strD = c22.l3.d(true, context.getString(this.S1.f113908b), this.R1);
                        } else {
                            strD = c22.l3.d(zB, context.getString(this.S1.f113908b), this.R1);
                        }
                    }
                }
            }
        }
        v0(this.f113771e, strD);
        j1();
    }

    public final qs.g L() {
        return this.L1;
    }

    public final void L0(int i14, int i15, l3 l3Var) {
        this.P1 = i14;
        this.Q1 = i15;
        this.S1 = l3Var;
        K0();
        if (this.f113810n2) {
            return;
        }
        I0();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0034  */
    public final String M(GCMComplexTwoLineButton gCMComplexTwoLineButton, double d14) {
        boolean z14;
        if (gCMComplexTwoLineButton == null) {
            return "";
        }
        String str = this.J1.f4358a;
        am.z0 z0Var = am.z0.f4390a;
        if (am.z0.b(am.x0.f4312o, str)) {
            z14 = true;
        } else {
            if (am.z0.b(am.x0.Y2, this.J1.f4358a) || am.z0.J(this.J1.f4358a) || am.z0.L(this.J1.f4358a)) {
                z14 = true;
            } else {
                z14 = false;
            }
        }
        Context context = gCMComplexTwoLineButton.getContext();
        if (Double.isNaN(d14)) {
            return context.getString(z14 ? R.string.lbl_rpm : R.string.lbl_spm);
        }
        c22.l3.f23124b.getClass();
        return c22.l3.a.E(context, d14, true, z14);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x003a  */
    public final void M0(double d14) {
        boolean z14;
        String strB1;
        this.G1 = d14;
        int iRound = (int) Math.round(d14);
        GCMComplexTwoLineButton gCMComplexTwoLineButton = this.f113787i;
        if (gCMComplexTwoLineButton != null) {
            Context context = gCMComplexTwoLineButton.getContext();
            String str = this.J1.f4358a;
            am.z0 z0Var = am.z0.f4390a;
            boolean zB = am.z0.b(am.x0.O1, str);
            if (am.z0.b(am.x0.f4297k1, this.J1.f4358a)) {
                z14 = true;
            } else {
                if (am.z0.b(am.x0.f4301l1, this.J1.f4358a)) {
                    z14 = true;
                } else {
                    z14 = false;
                }
            }
            if (zB) {
                strB1 = new ns.f0(new l22.a(context)).b(9, Double.valueOf(d14), false);
            } else if (z14) {
                long jRound = Math.round(d14 * 1000.0d);
                c22.l3.f23124b.getClass();
                strB1 = c22.l3.a.w1(jRound, null, true);
            } else {
                c22.l3.f23124b.getClass();
                strB1 = c22.l3.a.b1(((long) iRound) * 1000);
            }
            v0(gCMComplexTwoLineButton, strB1);
            V0(context);
        }
        GCMComplexTwoLineButton gCMComplexTwoLineButton2 = this.f113791j;
        if (gCMComplexTwoLineButton2 != null) {
            c22.l3.f23124b.getClass();
            v0(gCMComplexTwoLineButton2, c22.l3.a.b1(((long) iRound) * 1000));
        }
        GCMComplexTwoLineButton gCMComplexTwoLineButton3 = this.V0;
        if (gCMComplexTwoLineButton3 != null) {
            Context context2 = gCMComplexTwoLineButton3.getContext();
            c22.l3.f23124b.getClass();
            v0(gCMComplexTwoLineButton3, c22.l3.a.i1(iRound, context2));
        }
        j1();
        if (this.f113810n2) {
            return;
        }
        I0();
    }

    public final String N(GCMComplexTwoLineButton gCMComplexTwoLineButton, double d14) {
        if (gCMComplexTwoLineButton == null) {
            return null;
        }
        Context context = gCMComplexTwoLineButton.getContext();
        gg1.o0 o0VarG = ((f12.l) KoinJavaComponent.get(f12.l.class)).g();
        DecimalFormat decimalFormat = am.z0.o(this.J1.f4358a) ? c22.l3.f23135m : c22.l3.f23126d;
        if (Double.isNaN(d14)) {
            c22.l3.f23124b.getClass();
            return c22.l3.a.G1(context, o0VarG);
        }
        c22.l3.f23124b.getClass();
        return c22.l3.a.Z(context, d14, o0VarG, false, decimalFormat);
    }

    public final void N0(double d14, String str) {
        this.M1 = d14;
        this.N1 = str;
        if (this.f113827t != null) {
            v0(this.f113827t, c22.l3.d(((double) Math.round(d14)) == this.M1, this.f113827t.getContext().getString(e.a(this.N1, e.METER).f113857d), this.M1));
        }
        K0();
    }

    public final void O0(am.l lVar) {
        this.H1 = lVar;
        GCMComplexTwoLineButton gCMComplexTwoLineButton = this.f113821r;
        if (gCMComplexTwoLineButton == null || lVar == null) {
            return;
        }
        v0(this.f113821r, gCMComplexTwoLineButton.getContext().getString(this.H1.b()));
    }

    public final void P0(Calendar calendar) {
        if (calendar == null) {
            calendar = Calendar.getInstance(Locale.getDefault());
        }
        this.I1 = calendar;
        GCMComplexTwoLineButton gCMComplexTwoLineButton = this.f113824s;
        if (gCMComplexTwoLineButton != null) {
            v0(this.f113824s, DateFormat.getTimeFormat(gCMComplexTwoLineButton.getContext()).format(this.I1.getTime()));
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0375  */
    /* JADX WARN: Code duplicated, block: B:127:0x03f9  */
    /* JADX WARN: Code duplicated, block: B:129:0x03ff  */
    /* JADX WARN: Code duplicated, block: B:135:0x0418  */
    /* JADX WARN: Code duplicated, block: B:137:0x041f  */
    /* JADX WARN: Code duplicated, block: B:140:0x0435  */
    /* JADX WARN: Code duplicated, block: B:146:0x0454  */
    /* JADX WARN: Code duplicated, block: B:149:0x0460  */
    /* JADX WARN: Code duplicated, block: B:151:0x0466  */
    /* JADX WARN: Code duplicated, block: B:152:0x046f  */
    /* JADX WARN: Code duplicated, block: B:155:0x0476  */
    /* JADX WARN: Code duplicated, block: B:156:0x0484  */
    /* JADX WARN: Code duplicated, block: B:162:0x04b0  */
    /* JADX WARN: Code duplicated, block: B:165:0x04cb  */
    /* JADX WARN: Code duplicated, block: B:167:0x04d1  */
    /* JADX WARN: Code duplicated, block: B:168:0x04da  */
    /* JADX WARN: Code duplicated, block: B:170:0x04e0  */
    /* JADX WARN: Code duplicated, block: B:177:0x0503  */
    /* JADX WARN: Code duplicated, block: B:179:0x050a  */
    /* JADX WARN: Code duplicated, block: B:201:0x05bf A[PHI: r2 r5 r8 r9 r11
      0x05bf: PHI (r2v56 com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexTwoLineButton) = 
      (r2v11 com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexTwoLineButton)
      (r2v66 com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexTwoLineButton)
     binds: [B:203:0x05d8, B:200:0x0565] A[DONT_GENERATE, DONT_INLINE]
      0x05bf: PHI (r5v31 com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexTwoLineButton) = 
      (r5v2 com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexTwoLineButton)
      (r5v32 com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexTwoLineButton)
     binds: [B:203:0x05d8, B:200:0x0565] A[DONT_GENERATE, DONT_INLINE]
      0x05bf: PHI (r8v12 com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexTwoLineButton) = 
      (r8v2 com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexTwoLineButton)
      (r8v13 com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexTwoLineButton)
     binds: [B:203:0x05d8, B:200:0x0565] A[DONT_GENERATE, DONT_INLINE]
      0x05bf: PHI (r9v13 com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexTwoLineButton) = 
      (r9v11 com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexTwoLineButton)
      (r9v15 com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexTwoLineButton)
     binds: [B:203:0x05d8, B:200:0x0565] A[DONT_GENERATE, DONT_INLINE]
      0x05bf: PHI (r11v22 com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexTwoLineButton) = 
      (r11v20 com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexTwoLineButton)
      (r11v25 com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexTwoLineButton)
     binds: [B:203:0x05d8, B:200:0x0565] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:202:0x05c5  */
    /* JADX WARN: Code duplicated, block: B:204:0x05da  */
    /* JADX WARN: Code duplicated, block: B:206:0x05e0  */
    /* JADX WARN: Code duplicated, block: B:216:0x0611  */
    /* JADX WARN: Code duplicated, block: B:220:0x0672 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:221:0x0674  */
    /* JADX WARN: Code duplicated, block: B:223:0x067c  */
    /* JADX WARN: Code duplicated, block: B:226:0x068c  */
    /* JADX WARN: Code duplicated, block: B:229:0x0696  */
    /* JADX WARN: Code duplicated, block: B:232:0x06a6  */
    /* JADX WARN: Code duplicated, block: B:235:0x06b0  */
    /* JADX WARN: Code duplicated, block: B:238:0x06c0  */
    /* JADX WARN: Code duplicated, block: B:241:0x06ca  */
    /* JADX WARN: Code duplicated, block: B:244:0x06d9  */
    /* JADX WARN: Code duplicated, block: B:247:0x06e2  */
    /* JADX WARN: Code duplicated, block: B:250:0x06f1  */
    /* JADX WARN: Code duplicated, block: B:253:0x06fa  */
    /* JADX WARN: Code duplicated, block: B:256:0x0709  */
    /* JADX WARN: Code duplicated, block: B:259:0x0712  */
    /* JADX WARN: Code duplicated, block: B:262:0x0721  */
    /* JADX WARN: Code duplicated, block: B:265:0x072c  */
    /* JADX WARN: Code duplicated, block: B:268:0x073b  */
    /* JADX WARN: Code duplicated, block: B:271:0x0743  */
    /* JADX WARN: Code duplicated, block: B:276:0x0779  */
    /* JADX WARN: Code duplicated, block: B:279:0x0789  */
    /* JADX WARN: Code duplicated, block: B:283:0x0795  */
    /* JADX WARN: Code duplicated, block: B:284:0x0799  */
    /* JADX WARN: Code duplicated, block: B:287:0x07a5  */
    /* JADX WARN: Code duplicated, block: B:288:0x07a9  */
    /* JADX WARN: Code duplicated, block: B:291:0x07b5  */
    /* JADX WARN: Code duplicated, block: B:294:0x07cc  */
    /* JADX WARN: Code duplicated, block: B:295:0x07ce  */
    /* JADX WARN: Code duplicated, block: B:297:0x07d1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:298:0x07d3  */
    /* JADX WARN: Code duplicated, block: B:299:0x07dc  */
    /* JADX WARN: Code duplicated, block: B:301:0x07fc  */
    /* JADX WARN: Code duplicated, block: B:302:0x07ff  */
    /* JADX WARN: Code duplicated, block: B:305:0x0805  */
    /* JADX WARN: Code duplicated, block: B:306:0x080a  */
    /* JADX WARN: Code duplicated, block: B:309:0x0818  */
    /* JADX WARN: Code duplicated, block: B:312:0x0836  */
    /* JADX WARN: Code duplicated, block: B:314:0x083a  */
    /* JADX WARN: Code duplicated, block: B:317:0x0857  */
    /* JADX WARN: Code duplicated, block: B:321:0x085f  */
    /* JADX WARN: Code duplicated, block: B:324:0x086f  */
    /* JADX WARN: Code duplicated, block: B:325:0x0889 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:326:0x088b  */
    /* JADX WARN: Code duplicated, block: B:328:0x0898  */
    /* JADX WARN: Code duplicated, block: B:331:0x08dc  */
    /* JADX WARN: Code duplicated, block: B:333:0x08e0  */
    /* JADX WARN: Code duplicated, block: B:336:0x08e5  */
    /* JADX WARN: Code duplicated, block: B:338:0x08e9  */
    /* JADX WARN: Code duplicated, block: B:342:0x08f2  */
    /* JADX WARN: Code duplicated, block: B:345:0x08f8  */
    /* JADX WARN: Code duplicated, block: B:346:0x0904  */
    /* JADX WARN: Code duplicated, block: B:349:0x090e  */
    /* JADX WARN: Code duplicated, block: B:350:0x0911  */
    /* JADX WARN: Code duplicated, block: B:353:0x091c  */
    /* JADX WARN: Code duplicated, block: B:355:0x0921  */
    /* JADX WARN: Code duplicated, block: B:358:0x092b  */
    /* JADX WARN: Code duplicated, block: B:364:0x0944  */
    /* JADX WARN: Code duplicated, block: B:367:0x094c  */
    /* JADX WARN: Code duplicated, block: B:368:0x094f  */
    /* JADX WARN: Code duplicated, block: B:370:0x0953  */
    /* JADX WARN: Code duplicated, block: B:371:0x0956  */
    /* JADX WARN: Code duplicated, block: B:375:0x0971  */
    /* JADX WARN: Code duplicated, block: B:379:0x097d  */
    /* JADX WARN: Code duplicated, block: B:382:0x0988  */
    /* JADX WARN: Code duplicated, block: B:383:0x098d  */
    /* JADX WARN: Code duplicated, block: B:387:0x09b4  */
    /* JADX WARN: Code duplicated, block: B:389:0x09de A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:395:0x09e9  */
    /* JADX WARN: Code duplicated, block: B:397:0x09ec A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:400:0x09f1  */
    /* JADX WARN: Code duplicated, block: B:403:0x0a26 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:411:0x0a35  */
    /* JADX WARN: Code duplicated, block: B:414:0x0a4a  */
    /* JADX WARN: Code duplicated, block: B:415:0x0a59 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:416:0x0a5b  */
    /* JADX WARN: Code duplicated, block: B:417:0x0a6a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:418:0x0a6c  */
    /* JADX WARN: Code duplicated, block: B:421:0x0a84  */
    /* JADX WARN: Code duplicated, block: B:423:0x0a98  */
    /* JADX WARN: Code duplicated, block: B:424:0x0a9f  */
    /* JADX WARN: Code duplicated, block: B:427:0x0aaa  */
    /* JADX WARN: Code duplicated, block: B:428:0x0aaf  */
    /* JADX WARN: Code duplicated, block: B:432:0x0ac2  */
    /* JADX WARN: Code duplicated, block: B:434:0x0aca  */
    /* JADX WARN: Code duplicated, block: B:436:0x0ad2  */
    /* JADX WARN: Code duplicated, block: B:438:0x0ada  */
    /* JADX WARN: Code duplicated, block: B:441:0x0b4a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:446:0x0b53 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:454:0x0b63  */
    /* JADX WARN: Code duplicated, block: B:456:0x0b6f  */
    /* JADX WARN: Code duplicated, block: B:463:0x0bee A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:465:0x0bf2  */
    /* JADX WARN: Code duplicated, block: B:468:0x0c01 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:478:0x0c15  */
    /* JADX WARN: Code duplicated, block: B:481:0x0c22  */
    /* JADX WARN: Code duplicated, block: B:484:0x0c37  */
    /* JADX WARN: Code duplicated, block: B:487:0x0c3f  */
    /* JADX WARN: Code duplicated, block: B:490:0x0c46  */
    /* JADX WARN: Code duplicated, block: B:491:0x0c48  */
    /* JADX WARN: Code duplicated, block: B:494:0x0c51 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:495:0x0c53 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:503:0x0c6c  */
    /* JADX WARN: Code duplicated, block: B:504:0x0c6f  */
    /* JADX WARN: Code duplicated, block: B:507:0x0c91 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:511:0x0c98  */
    /* JADX WARN: Code duplicated, block: B:513:0x0c9b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:517:0x0ca2  */
    /* JADX WARN: Code duplicated, block: B:520:0x0cbb  */
    /* JADX WARN: Code duplicated, block: B:521:0x0ccc  */
    /* JADX WARN: Code duplicated, block: B:523:0x0cd0  */
    /* JADX WARN: Code duplicated, block: B:528:0x0cea  */
    /* JADX WARN: Code duplicated, block: B:531:0x0d08  */
    /* JADX WARN: Code duplicated, block: B:69:0x0294  */
    /* JADX WARN: Code duplicated, block: B:74:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:81:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:83:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:86:0x02df  */
    /* JADX WARN: Code duplicated, block: B:88:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:90:0x0304  */
    /* JADX WARN: Code duplicated, block: B:92:0x030b  */
    /* JADX WARN: Code duplicated, block: B:93:0x0336  */
    /* JADX WARN: Code duplicated, block: B:96:0x034d  */
    public final void Q0(am.x0 x0Var) {
        HashMap<String, String> map;
        boolean z14;
        boolean z15;
        String str;
        boolean z16;
        com.garmin.android.apps.connectmobile.activities.newmodel.h hVar;
        GCMComplexTwoLineButton gCMComplexTwoLineButton;
        GCMComplexTwoLineButton gCMComplexTwoLineButton2;
        GCMComplexTwoLineButton gCMComplexTwoLineButton3;
        GCMComplexTwoLineButton gCMComplexTwoLineButton4;
        GCMComplexTwoLineButton gCMComplexTwoLineButton5;
        GCMComplexTwoLineButton gCMComplexTwoLineButton6;
        GCMComplexTwoLineButton gCMComplexTwoLineButton7;
        GCMComplexTwoLineButton gCMComplexTwoLineButton8;
        GCMComplexTwoLineButton gCMComplexTwoLineButton9;
        GCMComplexTwoLineButton gCMComplexTwoLineButton10;
        GCMComplexTwoLineButton gCMComplexTwoLineButton11;
        boolean zM;
        am.x0 x0Var2;
        boolean zB;
        GCMComplexTwoLineButton gCMComplexTwoLineButton12;
        GCMComplexTwoLineButton gCMComplexTwoLineButton13;
        GCMComplexTwoLineButton gCMComplexTwoLineButton14;
        GCMComplexTwoLineButton gCMComplexTwoLineButton15;
        GCMComplexTwoLineButton gCMComplexTwoLineButton16;
        TextView textView;
        GCMComplexTwoLineButton gCMComplexTwoLineButton17;
        GCMComplexTwoLineButton gCMComplexTwoLineButton18;
        com.garmin.android.apps.connectmobile.activities.newmodel.h hVar2;
        com.garmin.android.apps.connectmobile.activities.newmodel.s sVar;
        am.x0 x0Var3;
        boolean zB2;
        am.x0 x0Var4;
        ps.o1 o1VarD;
        double dIntValue;
        double dIntValue2;
        double dIntValue3;
        double dDoubleValue;
        double dDoubleValue2;
        double dDoubleValue3;
        double dDoubleValue4;
        String strI0;
        String scale;
        boolean z17;
        int i14;
        int i15;
        am.x0 x0Var5;
        am.x0 x0Var6;
        boolean z18;
        l3 l3VarG;
        l3 l3VarG2;
        ArrayList<Integer> arrayListB;
        String str2;
        com.garmin.android.apps.connectmobile.activities.newmodel.h hVar3;
        boolean zA;
        GCMComplexTwoLineButton gCMComplexTwoLineButton19;
        boolean zB3;
        GCMComplexTwoLineButton gCMComplexTwoLineButton20;
        GCMComplexTwoLineButton gCMComplexTwoLineButton21;
        GCMComplexTwoLineButton gCMComplexTwoLineButton22;
        boolean zB4;
        boolean z19;
        boolean z24;
        com.garmin.android.apps.connectmobile.activities.newmodel.h hVar4;
        boolean z25;
        am.x0 x0Var7;
        boolean z26;
        com.garmin.android.apps.connectmobile.courses.model.d dVar;
        Context context;
        String string;
        boolean zB5;
        boolean z27;
        boolean z28;
        String str3;
        am.z0 z0Var;
        GCMComplexTwoLineButton gCMComplexTwoLineButton23;
        GCMComplexTwoLineButton gCMComplexTwoLineButton24;
        GCMComplexTwoLineButton gCMComplexTwoLineButton25;
        com.garmin.android.apps.connectmobile.activities.newmodel.h hVar5;
        boolean zB6;
        boolean zB7;
        boolean zB8;
        boolean zJ;
        boolean z29;
        boolean z34;
        boolean zF0;
        boolean zB9;
        boolean z35;
        Context context2;
        String string2;
        String string3;
        GCMComplexTwoLineButton gCMComplexTwoLineButton26;
        Double d14;
        Double d15;
        double dDoubleValue5;
        double dDoubleValue6;
        com.garmin.android.apps.connectmobile.activities.newmodel.h hVar6;
        com.garmin.android.apps.connectmobile.activities.newmodel.i0 i0Var;
        boolean z36;
        double d16;
        double d17;
        com.garmin.android.apps.connectmobile.activities.newmodel.h hVar7;
        String str4;
        com.garmin.android.apps.connectmobile.activities.newmodel.h hVar8;
        double dIntValue4;
        double d18;
        c22.q3 q3Var;
        ps.a1 a1Var;
        String[] strArrSplit;
        double d19;
        String str5;
        double d24;
        String str6;
        double d25;
        com.garmin.android.apps.connectmobile.activities.newmodel.s sVar2;
        com.garmin.android.apps.connectmobile.activities.newmodel.h hVar9;
        boolean z37;
        ps.o1 o1VarD2;
        com.garmin.android.apps.connectmobile.activities.newmodel.h hVar10;
        int iIntValue;
        ps.a1 a1Var2;
        int iIntValue2;
        double dDoubleValue7;
        double dDoubleValue8;
        ps.o1 o1VarB;
        double dDoubleValue9;
        com.garmin.android.apps.connectmobile.activities.newmodel.h hVar11;
        boolean z38;
        ps.o1 o1VarD3;
        com.garmin.android.apps.connectmobile.activities.newmodel.h hVar12;
        double dIntValue5;
        ps.a1 a1Var3;
        ps.o1 o1VarD4;
        double dDoubleValue10;
        ps.o1 o1VarB2;
        double dDoubleValue11;
        am.x0 x0Var8 = this.J1;
        am.x0 x0Var9 = x0Var != null ? x0Var : am.x0.f4308n;
        this.J1 = x0Var9;
        String str7 = x0Var9.f4358a;
        am.z0 z0Var2 = am.z0.f4390a;
        am.x0 x0Var10 = am.x0.f4324r;
        boolean z39 = am.z0.b(x0Var10, str7) && !am.z0.b(x0Var10, x0Var8.f4358a);
        Z0(this.J1.f4358a);
        boolean zO = am.z0.O(this.J1.f4358a);
        TextView textView2 = this.X0;
        GCMComplexTwoLineButton gCMComplexTwoLineButton27 = this.P;
        GCMComplexTwoLineButton gCMComplexTwoLineButton28 = this.F;
        GCMComplexTwoLineButton gCMComplexTwoLineButton29 = this.f113811o;
        GCMComplexTwoLineButton gCMComplexTwoLineButton30 = this.f113795k;
        GCMComplexTwoLineButton gCMComplexTwoLineButton31 = this.Q;
        GCMComplexTwoLineButton gCMComplexTwoLineButton32 = this.H;
        GCMComplexTwoLineButton gCMComplexTwoLineButton33 = this.I;
        GCMComplexTwoLineButton gCMComplexTwoLineButton34 = this.f113824s;
        GCMComplexTwoLineButton gCMComplexTwoLineButton35 = this.f113787i;
        GCMComplexTwoLineButton gCMComplexTwoLineButton36 = this.G;
        GCMComplexTwoLineButton gCMComplexTwoLineButton37 = this.f113771e;
        boolean z44 = z39;
        GCMComplexTwoLineButton gCMComplexTwoLineButton38 = this.f113822r0;
        HashMap<String, String> map2 = this.Y1;
        if (zO) {
            map = map2;
            gCMComplexTwoLineButton31.setButtonTopLabel(gCMComplexTwoLineButton31.getContext().getString(R.string.lbl_race_location));
            gCMComplexTwoLineButton38.setButtonTopLabel(gCMComplexTwoLineButton38.getContext().getString(R.string.lbl_number_of_laps));
            gCMComplexTwoLineButton37.setButtonTopLabel(gCMComplexTwoLineButton38.getContext().getString(R.string.run_options_distance_lap));
            i(gCMComplexTwoLineButton31, true);
            i(gCMComplexTwoLineButton37, true);
            l(this.f113769d1, false);
            l(this.f113763c, true);
            i(gCMComplexTwoLineButton38, true);
            l(gCMComplexTwoLineButton30, false);
            l(gCMComplexTwoLineButton35, false);
            l(gCMComplexTwoLineButton34, false);
            l(gCMComplexTwoLineButton29, false);
            l(this.f113845z, true);
            l(gCMComplexTwoLineButton33, false);
            l(this.R, true);
            l(this.S, true);
            l(this.T, false);
            j(false, false);
            l(this.f113807n, true);
            l(gCMComplexTwoLineButton27, false);
            l(this.f113836w, false);
            l(this.f113833v, false);
            l(gCMComplexTwoLineButton28, false);
            l(gCMComplexTwoLineButton36, true);
            l(gCMComplexTwoLineButton32, true);
            l(gCMComplexTwoLineButton34, true);
            l(textView2, false);
            w0(this.f113775f, map.get("name"), this.E1);
        } else {
            map = map2;
            gCMComplexTwoLineButton31.setButtonTopLabel(gCMComplexTwoLineButton31.getContext().getString(R.string.lbl_location));
            gCMComplexTwoLineButton38.setButtonTopLabel(gCMComplexTwoLineButton38.getContext().getString(R.string.lbl_dive_lap_count));
            gCMComplexTwoLineButton37.setButtonTopLabel(gCMComplexTwoLineButton38.getContext().getString(R.string.lbl_distance));
            l(this.f113845z, false);
            l(gCMComplexTwoLineButton31, false);
            l(this.R, false);
            l(gCMComplexTwoLineButton38, false);
            l(this.S, false);
        }
        boolean zX = am.z0.X(this.J1.f4358a);
        boolean z45 = this.f113790i2;
        boolean z46 = this.f113782g2;
        if (!zX) {
            z14 = z46;
            if (!am.z0.a0(this.J1.f4358a)) {
                z15 = z45;
                str = "dive_location";
                gCMComplexTwoLineButton32 = gCMComplexTwoLineButton32;
            }
            if (am.z0.b(am.x0.D2, this.J1.f4358a)) {
                o1VarD4 = tq.k.d(this.f113778f2);
                if (o1VarD4 != null || o1VarD4.getDuration() == null) {
                    dDoubleValue10 = 0.0d;
                } else {
                    dDoubleValue10 = o1VarD4.getDuration().doubleValue();
                }
                e1(false, "activeSplitsDuration", dDoubleValue10);
                o1VarB2 = fr.a.b(this.f113778f2);
                if (o1VarB2 != null || o1VarB2.getDuration() == null) {
                    dDoubleValue11 = 0.0d;
                } else {
                    dDoubleValue11 = o1VarB2.getDuration().doubleValue();
                }
                z16 = false;
                e1(false, "restSplitsDuration", dDoubleValue11);
            } else {
                z16 = false;
            }
            hVar = this.f113778f2;
            gCMComplexTwoLineButton = this.f113779g;
            gCMComplexTwoLineButton2 = this.O;
            if (hVar != null) {
                if (hVar.f29453f) {
                    i(gCMComplexTwoLineButton, z16);
                    i(gCMComplexTwoLineButton35, z16);
                    i(gCMComplexTwoLineButton30, z16);
                    i(gCMComplexTwoLineButton37, z16);
                    i(gCMComplexTwoLineButton2, true);
                    h(this.f113755a, z16);
                    k(z16);
                    l(this.f113759b, z16);
                    gCMComplexTwoLineButton4 = gCMComplexTwoLineButton38;
                } else {
                    gCMComplexTwoLineButton4 = gCMComplexTwoLineButton38;
                    if (hVar.f29452e != 0) {
                        i(this.f113783h, false);
                        i(gCMComplexTwoLineButton34, false);
                        i(this.f113821r, false);
                        gCMComplexTwoLineButton3 = gCMComplexTwoLineButton29;
                        i(gCMComplexTwoLineButton3, false);
                        i(gCMComplexTwoLineButton2, false);
                        h(this.f113755a, true);
                        l(this.f113763c, false);
                        k(false);
                        l(this.f113759b, false);
                    }
                }
                gCMComplexTwoLineButton3 = gCMComplexTwoLineButton29;
            } else {
                gCMComplexTwoLineButton3 = gCMComplexTwoLineButton29;
                gCMComplexTwoLineButton4 = gCMComplexTwoLineButton38;
            }
            gCMComplexTwoLineButton5 = gCMComplexTwoLineButton4;
            if (am.z0.P(this.J1.f4358a)) {
                gCMComplexTwoLineButton8 = gCMComplexTwoLineButton2;
                gCMComplexTwoLineButton9 = gCMComplexTwoLineButton5;
                gCMComplexTwoLineButton10 = gCMComplexTwoLineButton;
                l(gCMComplexTwoLineButton9, true);
                gCMComplexTwoLineButton7 = gCMComplexTwoLineButton28;
                gCMComplexTwoLineButton9.setButtonTopLabel(gCMComplexTwoLineButton9.getContext().getString(R.string.lbl_number_of_runs));
                hVar11 = this.f113778f2;
                if (hVar11 != null || hVar11.f29448a <= 0) {
                    z38 = true;
                } else {
                    z38 = false;
                }
                gCMComplexTwoLineButton9.setEnabled(z38);
                o1VarD3 = tq.k.d(this.f113778f2);
                ps.o1 o1VarB3 = fr.a.b(this.f113778f2);
                if (o1VarD3 != null || o1VarB3 == null) {
                    gCMComplexTwoLineButton6 = gCMComplexTwoLineButton27;
                    hVar12 = this.f113778f2;
                    if (hVar12 != null || (a1Var3 = hVar12.f29459l) == null || a1Var3.getLapCount() == null) {
                        dIntValue5 = 0.0d;
                    } else {
                        dIntValue5 = this.f113778f2.f29459l.getLapCount().intValue();
                    }
                    e1(false, "lapCount", dIntValue5);
                } else {
                    gCMComplexTwoLineButton6 = gCMComplexTwoLineButton27;
                    e1(false, "lapCount", o1VarD3.getNoOfSplits() != null ? o1VarD3.getNoOfSplits().intValue() : 0.0d);
                    e1(false, "activeSplitsMovingDuration", o1VarD3.getMovingDuration() != null ? o1VarD3.getMovingDuration().doubleValue() : 0.0d);
                    e1(false, "activeSplitsIdleDuration", (o1VarD3.getDuration() == null || o1VarD3.getMovingDuration() == null) ? 0.0d : o1VarD3.getDuration().doubleValue() - o1VarD3.getMovingDuration().doubleValue());
                    e1(false, "restSplitsDuration", o1VarB3.getDuration() != null ? o1VarB3.getDuration().doubleValue() : 0.0d);
                }
            } else {
                gCMComplexTwoLineButton6 = gCMComplexTwoLineButton27;
                gCMComplexTwoLineButton7 = gCMComplexTwoLineButton28;
                gCMComplexTwoLineButton8 = gCMComplexTwoLineButton2;
                gCMComplexTwoLineButton9 = gCMComplexTwoLineButton5;
                gCMComplexTwoLineButton10 = gCMComplexTwoLineButton;
            }
            if (am.z0.b(am.x0.R0, this.J1.f4358a)) {
                l(gCMComplexTwoLineButton9, true);
                gCMComplexTwoLineButton9.setButtonTopLabel(gCMComplexTwoLineButton9.getContext().getString(R.string.lbl_number_of_runs));
                hVar9 = this.f113778f2;
                if (hVar9 != null || hVar9.f29448a <= 0) {
                    z37 = true;
                } else {
                    z37 = false;
                }
                gCMComplexTwoLineButton9.setEnabled(z37);
                o1VarD2 = tq.k.d(this.f113778f2);
                if (o1VarD2 != null) {
                    if (o1VarD2.getNoOfSplits() != null) {
                        iIntValue2 = o1VarD2.getNoOfSplits().intValue();
                    } else {
                        iIntValue2 = 0;
                    }
                    if (o1VarD2.getMovingDuration() != null) {
                        dDoubleValue7 = o1VarD2.getMovingDuration().doubleValue();
                    } else {
                        dDoubleValue7 = 0.0d;
                    }
                    if (o1VarD2.getDuration() != null || o1VarD2.getMovingDuration() == null) {
                        dDoubleValue8 = 0.0d;
                    } else {
                        dDoubleValue8 = o1VarD2.getDuration().doubleValue() - o1VarD2.getMovingDuration().doubleValue();
                    }
                    gCMComplexTwoLineButton11 = gCMComplexTwoLineButton34;
                    e1(false, "lapCount", iIntValue2);
                    e1(false, "activeSplitsMovingDuration", dDoubleValue7);
                    e1(false, "activeSplitsIdleDuration", dDoubleValue8);
                    o1VarB = fr.a.b(this.f113778f2);
                    if (o1VarB != null) {
                        if (o1VarB.getDuration() != null) {
                            dDoubleValue9 = o1VarB.getDuration().doubleValue();
                        } else {
                            dDoubleValue9 = 0.0d;
                        }
                        e1(false, "restSplitsDuration", dDoubleValue9);
                    }
                } else {
                    textView2 = textView2;
                    gCMComplexTwoLineButton37 = gCMComplexTwoLineButton37;
                    gCMComplexTwoLineButton11 = gCMComplexTwoLineButton34;
                    gCMComplexTwoLineButton35 = gCMComplexTwoLineButton35;
                    hVar10 = this.f113778f2;
                    if (hVar10 != null || (a1Var2 = hVar10.f29459l) == null || a1Var2.getLapCount() == null) {
                        iIntValue = 0;
                    } else {
                        iIntValue = this.f113778f2.f29459l.getLapCount().intValue();
                    }
                    e1(false, "lapCount", iIntValue);
                }
            } else {
                textView2 = textView2;
                gCMComplexTwoLineButton37 = gCMComplexTwoLineButton37;
                gCMComplexTwoLineButton11 = gCMComplexTwoLineButton34;
                gCMComplexTwoLineButton35 = gCMComplexTwoLineButton35;
            }
            zM = am.z0.M(this.J1.f4358a);
            String str8 = this.J1.f4358a;
            x0Var2 = am.x0.D;
            zB = am.z0.b(x0Var2, str8);
            if (zB || zM) {
                gCMComplexTwoLineButton12 = gCMComplexTwoLineButton32;
                gCMComplexTwoLineButton13 = gCMComplexTwoLineButton36;
                gCMComplexTwoLineButton14 = gCMComplexTwoLineButton35;
                gCMComplexTwoLineButton15 = gCMComplexTwoLineButton7;
                gCMComplexTwoLineButton16 = gCMComplexTwoLineButton37;
                textView = textView2;
                gCMComplexTwoLineButton17 = gCMComplexTwoLineButton6;
                gCMComplexTwoLineButton18 = gCMComplexTwoLineButton11;
                if (zM) {
                    hVar2 = this.f113778f2;
                    if (hVar2 != null || (sVar = hVar2.f29461n) == null) {
                        x0Var2 = x0Var2;
                    } else {
                        ps.z1 z1Var = sVar.f29661f;
                        if (z1Var != null) {
                            this.f113766c2 = qs.y.UNIT_DISTANCE_METER.equals(z1Var.h());
                        }
                        ps.z1 z1Var2 = this.f113778f2.f29461n.f29657b;
                        if (z1Var2 != null) {
                            this.f113762b2 = qs.y.UNIT_WEIGHT_KILOGRAM.equals(z1Var2.h());
                        }
                    }
                    f(true);
                    i(gCMComplexTwoLineButton30, false);
                    i(gCMComplexTwoLineButton16, false);
                    j(false, false);
                    i(this.A, false);
                    i(this.B, false);
                    i(this.C, false);
                    i(this.D, false);
                    i(this.E, false);
                    i(gCMComplexTwoLineButton33, false);
                    l(textView, true);
                    i(gCMComplexTwoLineButton14, false);
                    i(gCMComplexTwoLineButton18, true);
                    i(gCMComplexTwoLineButton3, false);
                    i(gCMComplexTwoLineButton17, false);
                    i(gCMComplexTwoLineButton15, false);
                    i(gCMComplexTwoLineButton13, true);
                    i(gCMComplexTwoLineButton12, true);
                    R0();
                    D0();
                }
                String str9 = this.J1.f4358a;
                x0Var3 = am.x0.f4352y2;
                zB2 = am.z0.b(x0Var3, str9);
                String str10 = this.J1.f4358a;
                x0Var4 = am.x0.f4356z2;
                boolean zB10 = am.z0.b(x0Var4, str10);
                if (zB2 || zB10) {
                    o1VarD = tq.k.d(this.f113778f2);
                    if (o1VarD != null || o1VarD.getNoOfSplits() == null) {
                        dIntValue = 0.0d;
                    } else {
                        dIntValue = o1VarD.getNoOfSplits().intValue();
                    }
                    e1(true, "routes", dIntValue);
                    if (o1VarD != null || o1VarD.getNumSends() == null) {
                        dIntValue2 = 0.0d;
                    } else {
                        dIntValue2 = o1VarD.getNumSends().intValue();
                    }
                    e1(true, "sends", dIntValue2);
                    if (o1VarD != null || o1VarD.getNumFalls() == null) {
                        dIntValue3 = 0.0d;
                    } else {
                        dIntValue3 = o1VarD.getNumFalls().intValue();
                    }
                    e1(true, "falls", dIntValue3);
                    if (o1VarD != null || o1VarD.getElevationGain() == null) {
                        dDoubleValue = 0.0d;
                    } else {
                        dDoubleValue = o1VarD.getElevationGain().doubleValue();
                    }
                    e1(true, "elevation_gain", dDoubleValue);
                    if (o1VarD != null || o1VarD.getAvgElevationGain() == null) {
                        dDoubleValue2 = 0.0d;
                    } else {
                        dDoubleValue2 = o1VarD.getAvgElevationGain().doubleValue();
                    }
                    e1(true, "avgAscent", dDoubleValue2);
                    if (o1VarD != null || o1VarD.getMaxElevationGain() == null) {
                        dDoubleValue3 = 0.0d;
                    } else {
                        dDoubleValue3 = o1VarD.getMaxElevationGain().doubleValue();
                    }
                    e1(true, "maxAscent", dDoubleValue3);
                    if (o1VarD != null || o1VarD.getElevationGain() == null) {
                        dDoubleValue4 = 0.0d;
                    } else {
                        dDoubleValue4 = o1VarD.getElevationGain().doubleValue();
                    }
                    e1(true, "totalAscent", dDoubleValue4);
                    strI0 = "";
                    if (o1VarD != null || o1VarD.getMaxGradeValue() == null) {
                        scale = "";
                    } else {
                        scale = o1VarD.getMaxGradeValue().getScale();
                    }
                    c1("difficultyScale", scale);
                    if (o1VarD != null && o1VarD.i0() != null) {
                        strI0 = o1VarD.i0();
                    }
                    c1("max_difficulty", strI0);
                    boolean z47 = !z14;
                    this.J0.setEnabled(z47);
                    this.D.setEnabled(z47);
                    this.C.setEnabled(z47);
                    this.E.setEnabled(z47);
                    this.L0.setEnabled(z47);
                    this.M0.setEnabled(z47);
                    this.A.setEnabled(z47);
                    if (!z14 || TextUtils.isEmpty(map.get("difficultyScale"))) {
                        z17 = false;
                    } else {
                        z17 = true;
                    }
                    this.K0.setEnabled(z17);
                }
                Context context3 = gCMComplexTwoLineButton13.getContext();
                if (zB != 0) {
                    i14 = R.string.activity_details_max_water_temperature;
                } else {
                    i14 = R.string.activity_details_max_temperature;
                }
                B0(gCMComplexTwoLineButton13, context3.getString(i14));
                if (zB) {
                    i15 = R.string.activity_details_min_water_temperature;
                } else {
                    i15 = R.string.activity_details_min_temperature;
                }
                B0(gCMComplexTwoLineButton12, context3.getString(i15));
                if (gCMComplexTwoLineButton10 != null) {
                    v0(gCMComplexTwoLineButton10, dh.b.A(gCMComplexTwoLineButton10.getContext(), this.J1.f4360c));
                }
                x0Var5 = this.J1;
                x0Var6 = am.x0.f4313o1;
                if (x0Var5 == x0Var6) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                if (z18) {
                    if (z44) {
                        d25 = am.g2.f3976e.f3984c;
                        str6 = null;
                    } else {
                        strArrSplit = ((am.d) KoinJavaComponent.get(am.d.class)).g0().split(StringUtils.SPACE);
                        d19 = Double.parseDouble(strArrSplit[0]);
                        if (strArrSplit.length > 1) {
                            str5 = strArrSplit[1];
                        } else {
                            str5 = null;
                        }
                        if (d19 != 0.0d) {
                            d24 = d19;
                        } else {
                            d24 = am.g2.f3976e.f3984c;
                        }
                        double d26 = d24;
                        if (TextUtils.isEmpty(str5)) {
                            this.R1 = q();
                            str5 = e.METER.f113854a;
                        }
                        f1((int) (this.R1 / d26));
                        str6 = str5;
                        d25 = d26;
                    }
                    N0(d25, str6);
                } else {
                    gCMComplexTwoLineButton12 = gCMComplexTwoLineButton12;
                }
                if (z18) {
                    f1(this.O1);
                }
                i(this.f113827t, z18);
                i(this.f113830u, z18);
                g(gCMComplexTwoLineButton16, !z18);
                if (this.J1.equals(x0Var6)) {
                    g(gCMComplexTwoLineButton33, true);
                }
                l3VarG = this.S1;
                if (l3VarG == null) {
                    l3VarG = G(this.J1);
                }
                l3VarG2 = G(this.J1);
                this.S1 = l3VarG2;
                if (z44) {
                    int iIntValue3 = p3.c(this.R1, l3VarG2, l3VarG, true).get(0).intValue();
                    this.P1 = iIntValue3;
                    this.Q1 = 0;
                    this.R1 = iIntValue3;
                } else if (l3VarG != l3VarG2) {
                    arrayListB = p3.b(this.R1, l3VarG2, l3VarG);
                    if (arrayListB.size() == 6) {
                        this.P1 = arrayListB.get(4).intValue();
                        this.Q1 = arrayListB.get(5).intValue();
                        this.R1 = (((double) arrayListB.get(5).intValue()) / 100.0d) + ((double) arrayListB.get(4).intValue());
                    }
                }
                V0(context3);
                if (am.z0.O(this.J1.f4358a)) {
                    hVar6 = this.f113778f2;
                    if (hVar6 != null || (i0Var = hVar6.f29460m) == null) {
                        i0Var = null;
                    }
                    if (hVar6 != null || hVar6.f29448a <= 0) {
                        z36 = true;
                    } else {
                        z36 = false;
                    }
                    gCMComplexTwoLineButton9.setEnabled(z36);
                    if (i0Var != null) {
                        double d27 = i0Var.f29565y2;
                        c22.l3.f23124b.getClass();
                        d16 = d27 * ((double) 1000);
                    } else {
                        d16 = 0.0d;
                    }
                    e1(false, "bestLapTime", d16);
                    if (i0Var != null) {
                        d17 = i0Var.f29516i;
                    } else {
                        d17 = 0.0d;
                    }
                    e1(false, "elapsed_time", d17);
                    hVar7 = this.f113778f2;
                    if (hVar7 != null) {
                        str4 = hVar7.f29454g;
                    } else {
                        str4 = null;
                    }
                    c1(str, str4);
                    hVar8 = this.f113778f2;
                    if (hVar8 != null || (a1Var = hVar8.f29459l) == null || a1Var.getLapCount() == null) {
                        dIntValue4 = 0.0d;
                    } else {
                        dIntValue4 = this.f113778f2.f29459l.getLapCount().intValue();
                    }
                    e1(false, "lapCount", dIntValue4);
                    if (i0Var != null) {
                        d18 = i0Var.f29544r;
                    } else {
                        d18 = 0.0d;
                    }
                    if (z15) {
                        q3Var = c22.q3.KILOMETER_PER_HOUR;
                    } else {
                        q3Var = c22.q3.MILE_PER_HOUR;
                    }
                    c22.l3.f23124b.getClass();
                    e1(false, "racingMaxSpeed", c22.l3.a.i(d18, q3Var));
                }
                str2 = x0Var.f4358a;
                if (am.z0.L(str2) || am.z0.X(str2) || am.z0.a0(str2)) {
                    i(gCMComplexTwoLineButton33, false);
                }
                G0(str2);
                hVar3 = this.f113778f2;
                if (hVar3 != null) {
                    zA = ar.i.a(hVar3);
                } else {
                    zA = false;
                }
                l(this.f113835v1, zA);
                g(gCMComplexTwoLineButton14, s0());
                g(this.V0, s0());
                K0();
                M0(this.G1);
                S0();
                gCMComplexTwoLineButton19 = this.J;
                if (gCMComplexTwoLineButton19 != null) {
                    String str11 = this.J1.f4358a;
                    zB6 = am.z0.b(am.x0.f4312o, str11);
                    zB7 = am.z0.b(am.x0.f4308n, str11);
                    boolean zB11 = am.z0.b(am.x0.f4316p, str11);
                    boolean zD = am.z0.D(str11);
                    zB8 = am.z0.b(am.x0.f4268a3, str11);
                    zJ = am.z0.J(str11);
                    boolean zL = am.z0.L(str11);
                    if (!zB6 || zB7 || ((zB11 && !zD) || zB8)) {
                        z29 = true;
                    } else {
                        z29 = false;
                    }
                    if (!zJ || zL) {
                        z34 = true;
                    } else {
                        z34 = false;
                    }
                    zF0 = am.z0.f0(str11);
                    zB9 = am.z0.b(x0Var3, str11);
                    boolean zB12 = am.z0.b(x0Var4, str11);
                    boolean zB13 = am.z0.b(am.x0.C2, str11);
                    boolean zB14 = am.z0.b(am.x0.f4274c3, str11);
                    boolean zB15 = am.z0.b(am.x0.C3, str11);
                    boolean zB16 = am.z0.b(am.x0.f4297k1, str11);
                    boolean zB17 = am.z0.b(am.x0.f4301l1, str11);
                    if (!zB9 || zB12 || zB13 || zB14 || zB15 || zB16 || zB17) {
                        z35 = true;
                    } else {
                        z35 = false;
                    }
                    context2 = gCMComplexTwoLineButton19.getContext();
                    string2 = context2.getString(R.string.activity_details_average_cadence);
                    string3 = context2.getString(R.string.activity_details_max_cadence);
                    if (zB6) {
                        string2 = context2.getString(R.string.activity_details_average_bike_cadence);
                        string3 = context2.getString(R.string.activity_details_max_bike_cadence);
                    } else if (zB7) {
                        string2 = context2.getString(R.string.activity_details_average_run_cadence);
                        string3 = context2.getString(R.string.activity_details_max_run_cadence);
                    } else if (zB8) {
                        string2 = context2.getString(R.string.activity_details_average_push_cadence);
                        string3 = context2.getString(R.string.activity_details_max_push_cadence);
                    }
                    B0(gCMComplexTwoLineButton19, string2);
                    gCMComplexTwoLineButton26 = this.K;
                    B0(gCMComplexTwoLineButton26, string3);
                    if (z29) {
                        HashMap<String, Double> map3 = this.Z1;
                        d14 = map3.get("average_cadence");
                        d15 = map3.get("max_cadence");
                        if (d14 != null) {
                            dDoubleValue5 = d14.doubleValue();
                        } else {
                            dDoubleValue5 = Double.NaN;
                        }
                        v0(gCMComplexTwoLineButton19, M(gCMComplexTwoLineButton19, dDoubleValue5));
                        if (d15 != null) {
                            dDoubleValue6 = d15.doubleValue();
                        } else {
                            dDoubleValue6 = Double.NaN;
                        }
                        v0(gCMComplexTwoLineButton26, M(gCMComplexTwoLineButton26, dDoubleValue6));
                    }
                    i(gCMComplexTwoLineButton19, false);
                    i(gCMComplexTwoLineButton26, false);
                    if (z29) {
                        i(gCMComplexTwoLineButton19, true);
                        i(gCMComplexTwoLineButton26, true);
                    }
                    if (zF0) {
                        i(gCMComplexTwoLineButton19, false);
                        i(gCMComplexTwoLineButton26, false);
                    }
                    if (z34) {
                        i(gCMComplexTwoLineButton19, true);
                        i(gCMComplexTwoLineButton26, true);
                    }
                    if (z35) {
                        i(gCMComplexTwoLineButton19, false);
                        i(gCMComplexTwoLineButton26, false);
                    }
                }
                String str12 = this.J1.f4358a;
                am.x0 x0Var11 = am.x0.f4312o;
                zB3 = am.z0.b(x0Var11, str12);
                String str13 = this.J1.f4358a;
                am.x0 x0Var12 = am.x0.f4316p;
                boolean zB18 = am.z0.b(x0Var12, str13);
                boolean zB19 = am.z0.b(x0Var3, this.J1.f4358a);
                boolean zB20 = am.z0.b(x0Var4, this.J1.f4358a);
                boolean zT = am.z0.t(this.J1.f4358a);
                boolean zF1 = am.z0.f0(this.J1.f4358a);
                boolean zJ2 = am.z0.J(this.J1.f4358a);
                boolean zL2 = am.z0.L(this.J1.f4358a);
                boolean zB21 = am.z0.b(am.x0.C2, this.J1.f4358a);
                boolean zB22 = am.z0.b(am.x0.C3, this.J1.f4358a);
                boolean zD2 = am.z0.D(this.J1.f4358a);
                gCMComplexTwoLineButton20 = this.M;
                gCMComplexTwoLineButton21 = this.N;
                if ((zB3 && !zB18 && !zJ2 && !zL2) || zF1 || zB19 || zB20 || zB21 || zB22 || zD2) {
                    GCMComplexTwoLineButton gCMComplexTwoLineButton39 = this.L;
                    if (zT) {
                        i(gCMComplexTwoLineButton39, true);
                        i(gCMComplexTwoLineButton21, false);
                        i(gCMComplexTwoLineButton20, true);
                    } else {
                        i(gCMComplexTwoLineButton39, false);
                        i(gCMComplexTwoLineButton21, false);
                        i(gCMComplexTwoLineButton20, false);
                    }
                } else {
                    gCMComplexTwoLineButton22 = this.L;
                    if (zB3) {
                        i(gCMComplexTwoLineButton22, true);
                        i(gCMComplexTwoLineButton21, true);
                        i(gCMComplexTwoLineButton20, true);
                    } else {
                        i(gCMComplexTwoLineButton22, true);
                        i(gCMComplexTwoLineButton21, false);
                        i(gCMComplexTwoLineButton20, true);
                    }
                }
                zB4 = am.z0.b(x0Var12, this.J1.f4358a);
                boolean zL3 = am.z0.L(this.J1.f4358a);
                boolean z48 = am.z0.z(this.J1.f4358a);
                boolean zR = am.z0.R(this.J1.f4358a);
                String str14 = this.J1.f4358a;
                am.x0 x0Var13 = am.x0.f4344w2;
                boolean zB23 = am.z0.b(x0Var13, str14);
                String str15 = this.J1.f4358a;
                am.x0 x0Var14 = am.x0.f4348x2;
                boolean zB24 = am.z0.b(x0Var14, str15);
                boolean zF2 = am.z0.f0(this.J1.f4358a);
                boolean zX2 = am.z0.X(this.J1.f4358a);
                boolean zA0 = am.z0.a0(this.J1.f4358a);
                boolean zB25 = am.z0.b(am.x0.E2, this.J1.f4358a);
                if (zB4 || zL3) {
                    z19 = false;
                } else {
                    z19 = true;
                }
                boolean zB26 = am.z0.b(am.x0.O1, this.J1.f4358a);
                if (!z19 || z48 || zR || zB23 || zF2 || zX2 || zA0 || zB25 || zB24 || zB26) {
                    z24 = false;
                } else {
                    z24 = true;
                }
                if (!am.z0.b(x0Var2, this.J1.f4358a)) {
                    i(gCMComplexTwoLineButton15, z24);
                }
                i(gCMComplexTwoLineButton13, z24);
                i(gCMComplexTwoLineButton12, z24);
                b1();
                W0();
                hVar4 = this.f113778f2;
                if (hVar4 != null || hVar4.f29452e == 0) {
                    z25 = false;
                } else {
                    z25 = true;
                }
                x0Var7 = this.J1;
                if (x0Var7 == am.x0.C) {
                    z26 = true;
                } else {
                    z26 = false;
                }
                boolean z49 = ((am.z0.b(x0Var11, x0Var7.f4358a) && !z26) || z25 || this.f113778f2 == null) ? false : true;
                GCMComplexTwoLineButton gCMComplexTwoLineButton40 = gCMComplexTwoLineButton8;
                i(gCMComplexTwoLineButton40, z49);
                dVar = this.f113806m2;
                context = gCMComplexTwoLineButton40.getContext();
                this.f113806m2 = dVar;
                if (dVar != null) {
                    string = dVar.courseName;
                } else {
                    string = context.getString(R.string.no_value);
                }
                v0(gCMComplexTwoLineButton40, string);
                I0();
                g1();
                String str16 = this.J1.f4358a;
                zB5 = am.z0.b(x0Var13, str16);
                boolean zB27 = am.z0.b(x0Var14, str16);
                boolean zE0 = am.z0.e0(str16);
                if (!zB5 || zE0 || zB27) {
                    z27 = true;
                } else {
                    z27 = false;
                }
                if (!zB5 || zE0 || zB27) {
                    z28 = true;
                } else {
                    z28 = false;
                }
                i(this.f113839x, z27);
                i(this.f113842y, z28);
                str3 = this.J1.f4358a;
                z0Var = am.z0.f4390a;
                if (!xy2.b.C(z0Var, str3)) {
                    if (this.F1 || !xy2.b.B(z0Var, str3)) {
                        l(this.f113773e1, false);
                        l(this.f113777f1, false);
                    } else {
                        l(this.f113773e1, false);
                        l(this.f113777f1, true);
                        gCMComplexTwoLineButton23 = this.f113785h1;
                        gCMComplexTwoLineButton24 = this.f113793j1;
                        gCMComplexTwoLineButton25 = this.f113801l1;
                    }
                    a1();
                }
                l(this.f113773e1, true);
                l(this.f113777f1, false);
                gCMComplexTwoLineButton23 = this.f113781g1;
                gCMComplexTwoLineButton24 = this.f113789i1;
                gCMComplexTwoLineButton25 = this.f113797k1;
                hVar5 = this.f113778f2;
                if (hVar5 == null && fr.a.d(hVar5.f29464q, qs.x.PACK_WEIGHT)) {
                    l(gCMComplexTwoLineButton23, false);
                    l(gCMComplexTwoLineButton24, true);
                    l(gCMComplexTwoLineButton25, true);
                    gCMComplexTwoLineButton24.setEnabled(false);
                    gCMComplexTwoLineButton25.setEnabled(false);
                } else {
                    l(gCMComplexTwoLineButton23, true);
                    l(gCMComplexTwoLineButton24, false);
                    l(gCMComplexTwoLineButton25, false);
                }
                a1();
            }
            com.garmin.android.apps.connectmobile.activities.newmodel.h hVar13 = this.f113778f2;
            gCMComplexTwoLineButton9.setEnabled(hVar13 == null || hVar13.f29448a <= 0);
            com.garmin.android.apps.connectmobile.activities.newmodel.h hVar14 = this.f113778f2;
            if (hVar14 != null && (sVar2 = hVar14.f29461n) != null) {
                ps.z1 z1Var3 = sVar2.f29661f;
                if (z1Var3 != null) {
                    this.f113766c2 = qs.y.UNIT_DISTANCE_METER.equals(z1Var3.h());
                }
                ps.z1 z1Var4 = this.f113778f2.f29461n.f29657b;
                if (z1Var4 != null) {
                    this.f113762b2 = qs.y.UNIT_WEIGHT_KILOGRAM.equals(z1Var4.h());
                }
            }
            k(true);
            i(gCMComplexTwoLineButton30, false);
            gCMComplexTwoLineButton16 = gCMComplexTwoLineButton37;
            i(gCMComplexTwoLineButton16, false);
            j(false, false);
            i(this.A, false);
            i(this.B, false);
            i(this.C, false);
            i(this.D, false);
            i(this.E, false);
            i(gCMComplexTwoLineButton33, false);
            l(textView2, true);
            gCMComplexTwoLineButton14 = gCMComplexTwoLineButton35;
            i(gCMComplexTwoLineButton14, false);
            i(gCMComplexTwoLineButton11, true);
            i(gCMComplexTwoLineButton3, false);
            i(gCMComplexTwoLineButton6, false);
            GCMComplexTwoLineButton gCMComplexTwoLineButton41 = gCMComplexTwoLineButton7;
            i(gCMComplexTwoLineButton41, false);
            gCMComplexTwoLineButton13 = gCMComplexTwoLineButton36;
            i(gCMComplexTwoLineButton13, true);
            gCMComplexTwoLineButton12 = gCMComplexTwoLineButton32;
            i(gCMComplexTwoLineButton12, true);
            R0();
            E0();
            gCMComplexTwoLineButton15 = gCMComplexTwoLineButton41;
            x0Var2 = x0Var2;
            String str17 = this.J1.f4358a;
            x0Var3 = am.x0.f4352y2;
            zB2 = am.z0.b(x0Var3, str17);
            String str18 = this.J1.f4358a;
            x0Var4 = am.x0.f4356z2;
            boolean zB110 = am.z0.b(x0Var4, str18);
            if (zB2) {
                o1VarD = tq.k.d(this.f113778f2);
                if (o1VarD != null) {
                    dIntValue = 0.0d;
                } else {
                    dIntValue = 0.0d;
                }
                e1(true, "routes", dIntValue);
                if (o1VarD != null) {
                    dIntValue2 = 0.0d;
                } else {
                    dIntValue2 = 0.0d;
                }
                e1(true, "sends", dIntValue2);
                if (o1VarD != null) {
                    dIntValue3 = 0.0d;
                } else {
                    dIntValue3 = 0.0d;
                }
                e1(true, "falls", dIntValue3);
                if (o1VarD != null) {
                    dDoubleValue = 0.0d;
                } else {
                    dDoubleValue = 0.0d;
                }
                e1(true, "elevation_gain", dDoubleValue);
                if (o1VarD != null) {
                    dDoubleValue2 = 0.0d;
                } else {
                    dDoubleValue2 = 0.0d;
                }
                e1(true, "avgAscent", dDoubleValue2);
                if (o1VarD != null) {
                    dDoubleValue3 = 0.0d;
                } else {
                    dDoubleValue3 = 0.0d;
                }
                e1(true, "maxAscent", dDoubleValue3);
                if (o1VarD != null) {
                    dDoubleValue4 = 0.0d;
                } else {
                    dDoubleValue4 = 0.0d;
                }
                e1(true, "totalAscent", dDoubleValue4);
                strI0 = "";
                if (o1VarD != null) {
                    scale = "";
                } else {
                    scale = "";
                }
                c1("difficultyScale", scale);
                if (o1VarD != null) {
                    strI0 = o1VarD.i0();
                }
                c1("max_difficulty", strI0);
                boolean z410 = !z14;
                this.J0.setEnabled(z410);
                this.D.setEnabled(z410);
                this.C.setEnabled(z410);
                this.E.setEnabled(z410);
                this.L0.setEnabled(z410);
                this.M0.setEnabled(z410);
                this.A.setEnabled(z410);
                if (z14) {
                    z17 = false;
                } else {
                    z17 = false;
                }
                this.K0.setEnabled(z17);
            } else {
                o1VarD = tq.k.d(this.f113778f2);
                if (o1VarD != null) {
                    dIntValue = 0.0d;
                } else {
                    dIntValue = 0.0d;
                }
                e1(true, "routes", dIntValue);
                if (o1VarD != null) {
                    dIntValue2 = 0.0d;
                } else {
                    dIntValue2 = 0.0d;
                }
                e1(true, "sends", dIntValue2);
                if (o1VarD != null) {
                    dIntValue3 = 0.0d;
                } else {
                    dIntValue3 = 0.0d;
                }
                e1(true, "falls", dIntValue3);
                if (o1VarD != null) {
                    dDoubleValue = 0.0d;
                } else {
                    dDoubleValue = 0.0d;
                }
                e1(true, "elevation_gain", dDoubleValue);
                if (o1VarD != null) {
                    dDoubleValue2 = 0.0d;
                } else {
                    dDoubleValue2 = 0.0d;
                }
                e1(true, "avgAscent", dDoubleValue2);
                if (o1VarD != null) {
                    dDoubleValue3 = 0.0d;
                } else {
                    dDoubleValue3 = 0.0d;
                }
                e1(true, "maxAscent", dDoubleValue3);
                if (o1VarD != null) {
                    dDoubleValue4 = 0.0d;
                } else {
                    dDoubleValue4 = 0.0d;
                }
                e1(true, "totalAscent", dDoubleValue4);
                strI0 = "";
                if (o1VarD != null) {
                    scale = "";
                } else {
                    scale = "";
                }
                c1("difficultyScale", scale);
                if (o1VarD != null) {
                    strI0 = o1VarD.i0();
                }
                c1("max_difficulty", strI0);
                boolean z411 = !z14;
                this.J0.setEnabled(z411);
                this.D.setEnabled(z411);
                this.C.setEnabled(z411);
                this.E.setEnabled(z411);
                this.L0.setEnabled(z411);
                this.M0.setEnabled(z411);
                this.A.setEnabled(z411);
                if (z14) {
                    z17 = false;
                } else {
                    z17 = false;
                }
                this.K0.setEnabled(z17);
            }
            Context context4 = gCMComplexTwoLineButton13.getContext();
            if (zB != 0) {
                i14 = R.string.activity_details_max_water_temperature;
            } else {
                i14 = R.string.activity_details_max_temperature;
            }
            B0(gCMComplexTwoLineButton13, context4.getString(i14));
            if (zB) {
                i15 = R.string.activity_details_min_water_temperature;
            } else {
                i15 = R.string.activity_details_min_temperature;
            }
            B0(gCMComplexTwoLineButton12, context4.getString(i15));
            if (gCMComplexTwoLineButton10 != null) {
                v0(gCMComplexTwoLineButton10, dh.b.A(gCMComplexTwoLineButton10.getContext(), this.J1.f4360c));
            }
            x0Var5 = this.J1;
            x0Var6 = am.x0.f4313o1;
            if (x0Var5 == x0Var6) {
                z18 = true;
            } else {
                z18 = false;
            }
            if (z18) {
                if (z44) {
                    d25 = am.g2.f3976e.f3984c;
                    str6 = null;
                } else {
                    strArrSplit = ((am.d) KoinJavaComponent.get(am.d.class)).g0().split(StringUtils.SPACE);
                    d19 = Double.parseDouble(strArrSplit[0]);
                    if (strArrSplit.length > 1) {
                        str5 = strArrSplit[1];
                    } else {
                        str5 = null;
                    }
                    if (d19 != 0.0d) {
                        d24 = d19;
                    } else {
                        d24 = am.g2.f3976e.f3984c;
                    }
                    double d28 = d24;
                    if (TextUtils.isEmpty(str5)) {
                        this.R1 = q();
                        str5 = e.METER.f113854a;
                    }
                    f1((int) (this.R1 / d28));
                    str6 = str5;
                    d25 = d28;
                }
                N0(d25, str6);
            } else {
                gCMComplexTwoLineButton12 = gCMComplexTwoLineButton12;
            }
            if (z18) {
                f1(this.O1);
            }
            i(this.f113827t, z18);
            i(this.f113830u, z18);
            g(gCMComplexTwoLineButton16, !z18);
            if (this.J1.equals(x0Var6)) {
                g(gCMComplexTwoLineButton33, true);
            }
            l3VarG = this.S1;
            if (l3VarG == null) {
                l3VarG = G(this.J1);
            }
            l3VarG2 = G(this.J1);
            this.S1 = l3VarG2;
            if (z44) {
                int iIntValue4 = p3.c(this.R1, l3VarG2, l3VarG, true).get(0).intValue();
                this.P1 = iIntValue4;
                this.Q1 = 0;
                this.R1 = iIntValue4;
            } else if (l3VarG != l3VarG2) {
                arrayListB = p3.b(this.R1, l3VarG2, l3VarG);
                if (arrayListB.size() == 6) {
                    this.P1 = arrayListB.get(4).intValue();
                    this.Q1 = arrayListB.get(5).intValue();
                    this.R1 = (((double) arrayListB.get(5).intValue()) / 100.0d) + ((double) arrayListB.get(4).intValue());
                }
            }
            V0(context4);
            if (am.z0.O(this.J1.f4358a)) {
                hVar6 = this.f113778f2;
                if (hVar6 != null) {
                    i0Var = null;
                } else {
                    i0Var = null;
                }
                if (hVar6 != null) {
                    z36 = true;
                } else {
                    z36 = true;
                }
                gCMComplexTwoLineButton9.setEnabled(z36);
                if (i0Var != null) {
                    double d29 = i0Var.f29565y2;
                    c22.l3.f23124b.getClass();
                    d16 = d29 * ((double) 1000);
                } else {
                    d16 = 0.0d;
                }
                e1(false, "bestLapTime", d16);
                if (i0Var != null) {
                    d17 = i0Var.f29516i;
                } else {
                    d17 = 0.0d;
                }
                e1(false, "elapsed_time", d17);
                hVar7 = this.f113778f2;
                if (hVar7 != null) {
                    str4 = hVar7.f29454g;
                } else {
                    str4 = null;
                }
                c1(str, str4);
                hVar8 = this.f113778f2;
                if (hVar8 != null) {
                    dIntValue4 = 0.0d;
                } else {
                    dIntValue4 = 0.0d;
                }
                e1(false, "lapCount", dIntValue4);
                if (i0Var != null) {
                    d18 = i0Var.f29544r;
                } else {
                    d18 = 0.0d;
                }
                if (z15) {
                    q3Var = c22.q3.KILOMETER_PER_HOUR;
                } else {
                    q3Var = c22.q3.MILE_PER_HOUR;
                }
                c22.l3.f23124b.getClass();
                e1(false, "racingMaxSpeed", c22.l3.a.i(d18, q3Var));
            }
            str2 = x0Var.f4358a;
            if (am.z0.L(str2)) {
                i(gCMComplexTwoLineButton33, false);
            } else {
                i(gCMComplexTwoLineButton33, false);
            }
            G0(str2);
            hVar3 = this.f113778f2;
            if (hVar3 != null) {
                zA = ar.i.a(hVar3);
            } else {
                zA = false;
            }
            l(this.f113835v1, zA);
            g(gCMComplexTwoLineButton14, s0());
            g(this.V0, s0());
            K0();
            M0(this.G1);
            S0();
            gCMComplexTwoLineButton19 = this.J;
            if (gCMComplexTwoLineButton19 != null) {
                String str19 = this.J1.f4358a;
                zB6 = am.z0.b(am.x0.f4312o, str19);
                zB7 = am.z0.b(am.x0.f4308n, str19);
                boolean zB111 = am.z0.b(am.x0.f4316p, str19);
                boolean zD3 = am.z0.D(str19);
                zB8 = am.z0.b(am.x0.f4268a3, str19);
                zJ = am.z0.J(str19);
                boolean zL4 = am.z0.L(str19);
                if (zB6) {
                    z29 = true;
                } else {
                    z29 = true;
                }
                if (zJ) {
                    z34 = true;
                } else {
                    z34 = true;
                }
                zF0 = am.z0.f0(str19);
                zB9 = am.z0.b(x0Var3, str19);
                boolean zB112 = am.z0.b(x0Var4, str19);
                boolean zB113 = am.z0.b(am.x0.C2, str19);
                boolean zB114 = am.z0.b(am.x0.f4274c3, str19);
                boolean zB115 = am.z0.b(am.x0.C3, str19);
                boolean zB116 = am.z0.b(am.x0.f4297k1, str19);
                boolean zB117 = am.z0.b(am.x0.f4301l1, str19);
                if (zB9) {
                    z35 = true;
                } else {
                    z35 = true;
                }
                context2 = gCMComplexTwoLineButton19.getContext();
                string2 = context2.getString(R.string.activity_details_average_cadence);
                string3 = context2.getString(R.string.activity_details_max_cadence);
                if (zB6) {
                    string2 = context2.getString(R.string.activity_details_average_bike_cadence);
                    string3 = context2.getString(R.string.activity_details_max_bike_cadence);
                } else if (zB7) {
                    string2 = context2.getString(R.string.activity_details_average_run_cadence);
                    string3 = context2.getString(R.string.activity_details_max_run_cadence);
                } else if (zB8) {
                    string2 = context2.getString(R.string.activity_details_average_push_cadence);
                    string3 = context2.getString(R.string.activity_details_max_push_cadence);
                }
                B0(gCMComplexTwoLineButton19, string2);
                gCMComplexTwoLineButton26 = this.K;
                B0(gCMComplexTwoLineButton26, string3);
                if (z29) {
                    HashMap<String, Double> map4 = this.Z1;
                    d14 = map4.get("average_cadence");
                    d15 = map4.get("max_cadence");
                    if (d14 != null) {
                        dDoubleValue5 = d14.doubleValue();
                    } else {
                        dDoubleValue5 = Double.NaN;
                    }
                    v0(gCMComplexTwoLineButton19, M(gCMComplexTwoLineButton19, dDoubleValue5));
                    if (d15 != null) {
                        dDoubleValue6 = d15.doubleValue();
                    } else {
                        dDoubleValue6 = Double.NaN;
                    }
                    v0(gCMComplexTwoLineButton26, M(gCMComplexTwoLineButton26, dDoubleValue6));
                }
                i(gCMComplexTwoLineButton19, false);
                i(gCMComplexTwoLineButton26, false);
                if (z29) {
                    i(gCMComplexTwoLineButton19, true);
                    i(gCMComplexTwoLineButton26, true);
                }
                if (zF0) {
                    i(gCMComplexTwoLineButton19, false);
                    i(gCMComplexTwoLineButton26, false);
                }
                if (z34) {
                    i(gCMComplexTwoLineButton19, true);
                    i(gCMComplexTwoLineButton26, true);
                }
                if (z35) {
                    i(gCMComplexTwoLineButton19, false);
                    i(gCMComplexTwoLineButton26, false);
                }
            }
            String str110 = this.J1.f4358a;
            am.x0 x0Var15 = am.x0.f4312o;
            zB3 = am.z0.b(x0Var15, str110);
            String str111 = this.J1.f4358a;
            am.x0 x0Var16 = am.x0.f4316p;
            boolean zB118 = am.z0.b(x0Var16, str111);
            boolean zB119 = am.z0.b(x0Var3, this.J1.f4358a);
            boolean zB28 = am.z0.b(x0Var4, this.J1.f4358a);
            boolean zT2 = am.z0.t(this.J1.f4358a);
            boolean zF3 = am.z0.f0(this.J1.f4358a);
            boolean zJ3 = am.z0.J(this.J1.f4358a);
            boolean zL5 = am.z0.L(this.J1.f4358a);
            boolean zB29 = am.z0.b(am.x0.C2, this.J1.f4358a);
            boolean zB210 = am.z0.b(am.x0.C3, this.J1.f4358a);
            boolean zD4 = am.z0.D(this.J1.f4358a);
            gCMComplexTwoLineButton20 = this.M;
            gCMComplexTwoLineButton21 = this.N;
            if (zB3) {
                gCMComplexTwoLineButton22 = this.L;
                if (zB3) {
                    i(gCMComplexTwoLineButton22, true);
                    i(gCMComplexTwoLineButton21, true);
                    i(gCMComplexTwoLineButton20, true);
                } else {
                    i(gCMComplexTwoLineButton22, true);
                    i(gCMComplexTwoLineButton21, false);
                    i(gCMComplexTwoLineButton20, true);
                }
            } else {
                gCMComplexTwoLineButton22 = this.L;
                if (zB3) {
                    i(gCMComplexTwoLineButton22, true);
                    i(gCMComplexTwoLineButton21, true);
                    i(gCMComplexTwoLineButton20, true);
                } else {
                    i(gCMComplexTwoLineButton22, true);
                    i(gCMComplexTwoLineButton21, false);
                    i(gCMComplexTwoLineButton20, true);
                }
            }
            zB4 = am.z0.b(x0Var16, this.J1.f4358a);
            boolean zL6 = am.z0.L(this.J1.f4358a);
            boolean z412 = am.z0.z(this.J1.f4358a);
            boolean zR2 = am.z0.R(this.J1.f4358a);
            String str112 = this.J1.f4358a;
            am.x0 x0Var17 = am.x0.f4344w2;
            boolean zB211 = am.z0.b(x0Var17, str112);
            String str113 = this.J1.f4358a;
            am.x0 x0Var18 = am.x0.f4348x2;
            boolean zB212 = am.z0.b(x0Var18, str113);
            boolean zF4 = am.z0.f0(this.J1.f4358a);
            boolean zX3 = am.z0.X(this.J1.f4358a);
            boolean zA1 = am.z0.a0(this.J1.f4358a);
            boolean zB213 = am.z0.b(am.x0.E2, this.J1.f4358a);
            if (zB4) {
                z19 = false;
            } else {
                z19 = false;
            }
            boolean zB214 = am.z0.b(am.x0.O1, this.J1.f4358a);
            if (z19) {
                z24 = false;
            } else {
                z24 = false;
            }
            if (!am.z0.b(x0Var2, this.J1.f4358a)) {
                i(gCMComplexTwoLineButton15, z24);
            }
            i(gCMComplexTwoLineButton13, z24);
            i(gCMComplexTwoLineButton12, z24);
            b1();
            W0();
            hVar4 = this.f113778f2;
            if (hVar4 != null) {
                z25 = false;
            } else {
                z25 = false;
            }
            x0Var7 = this.J1;
            if (x0Var7 == am.x0.C) {
                z26 = true;
            } else {
                z26 = false;
            }
            if (am.z0.b(x0Var15, x0Var7.f4358a)) {
            }
            GCMComplexTwoLineButton gCMComplexTwoLineButton42 = gCMComplexTwoLineButton8;
            i(gCMComplexTwoLineButton42, z49);
            dVar = this.f113806m2;
            context = gCMComplexTwoLineButton42.getContext();
            this.f113806m2 = dVar;
            if (dVar != null) {
                string = dVar.courseName;
            } else {
                string = context.getString(R.string.no_value);
            }
            v0(gCMComplexTwoLineButton42, string);
            I0();
            g1();
            String str114 = this.J1.f4358a;
            zB5 = am.z0.b(x0Var17, str114);
            boolean zB215 = am.z0.b(x0Var18, str114);
            boolean zE1 = am.z0.e0(str114);
            if (zB5) {
                z27 = true;
            } else {
                z27 = true;
            }
            if (zB5) {
                z28 = true;
            } else {
                z28 = true;
            }
            i(this.f113839x, z27);
            i(this.f113842y, z28);
            str3 = this.J1.f4358a;
            z0Var = am.z0.f4390a;
            if (!xy2.b.C(z0Var, str3)) {
                if (this.F1) {
                }
                l(this.f113773e1, false);
                l(this.f113777f1, false);
                a1();
            }
            l(this.f113773e1, true);
            l(this.f113777f1, false);
            gCMComplexTwoLineButton23 = this.f113781g1;
            gCMComplexTwoLineButton24 = this.f113789i1;
            gCMComplexTwoLineButton25 = this.f113797k1;
            hVar5 = this.f113778f2;
            if (hVar5 == null) {
                l(gCMComplexTwoLineButton23, true);
                l(gCMComplexTwoLineButton24, false);
                l(gCMComplexTwoLineButton25, false);
            } else {
                l(gCMComplexTwoLineButton23, true);
                l(gCMComplexTwoLineButton24, false);
                l(gCMComplexTwoLineButton25, false);
            }
            a1();
        }
        z14 = z46;
        i(gCMComplexTwoLineButton31, am.z0.X(this.J1.f4358a));
        com.garmin.android.apps.connectmobile.activities.newmodel.h hVar15 = this.f113778f2;
        c1("dive_location", hVar15 != null ? hVar15.f29454g : null);
        ps.o1 o1VarD5 = tq.k.d(this.f113778f2);
        z15 = z45;
        e1(false, "splitsCount", (o1VarD5 == null || o1VarD5.getNoOfSplits() == null) ? 0.0d : o1VarD5.getNoOfSplits().intValue());
        e1(false, "splitsDuration", (o1VarD5 == null || o1VarD5.getDuration() == null) ? 0.0d : o1VarD5.getDuration().doubleValue());
        double dDoubleValue12 = (o1VarD5 == null || o1VarD5.getMaxDistance() == null) ? 0.0d : o1VarD5.getMaxDistance().doubleValue();
        c22.m3 m3Var = c22.m3.METER;
        c22.m3 m3Var2 = this.f113770d2 ? m3Var : c22.m3.FOOT;
        c22.l3.f23124b.getClass();
        e1(false, "splitsMaxDistance", c22.l3.a.g(dDoubleValue12, m3Var, m3Var2));
        e1(false, "splitsMaxSpeed", c22.l3.a.w((o1VarD5 == null || o1VarD5.getMaxSpeed() == null) ? 0.0d : o1VarD5.getMaxSpeed().doubleValue(), c22.q3.METERS_PER_SECOND, z15 ? c22.q3.KILOMETER_PER_HOUR : c22.q3.MILE_PER_HOUR));
        boolean z54 = !z14;
        GCMComplexTwoLineButton gCMComplexTwoLineButton43 = this.N0;
        gCMComplexTwoLineButton43.setEnabled(z54);
        GCMComplexTwoLineButton gCMComplexTwoLineButton44 = this.O0;
        gCMComplexTwoLineButton44.setEnabled(z54);
        this.P0.setEnabled(z54);
        GCMComplexTwoLineButton gCMComplexTwoLineButton45 = this.Q0;
        gCMComplexTwoLineButton45.setEnabled(z54);
        Context context5 = gCMComplexTwoLineButton43.getContext();
        str = "dive_location";
        if (am.z0.a0(this.J1.f4358a)) {
            gCMComplexTwoLineButton43.setButtonTopLabel(context5.getString(R.string.lbl_activity_wakesports_runs));
            gCMComplexTwoLineButton44.setButtonTopLabel(context5.getString(R.string.lbl_wakesports_active_time));
            gCMComplexTwoLineButton45.setButtonTopLabel(context5.getString(R.string.activity_wakesports_run_distance_longest_run));
        } else {
            gCMComplexTwoLineButton43.setButtonTopLabel(context5.getString(R.string.activities_total_waves_label));
            if (am.z0.X(this.J1.f4358a)) {
                gCMComplexTwoLineButton44.setButtonTopLabel(context5.getString(R.string.activity_details_surf_time));
            } else {
                gCMComplexTwoLineButton44.setButtonTopLabel(context5.getString(R.string.lbl_rwd_active_time));
            }
            gCMComplexTwoLineButton45.setButtonTopLabel(context5.getString(R.string.activities_thumbnail_map_legend_longest_wave));
        }
        if (am.z0.b(am.x0.D2, this.J1.f4358a)) {
            o1VarD4 = tq.k.d(this.f113778f2);
            if (o1VarD4 != null) {
                dDoubleValue10 = 0.0d;
            } else {
                dDoubleValue10 = 0.0d;
            }
            e1(false, "activeSplitsDuration", dDoubleValue10);
            o1VarB2 = fr.a.b(this.f113778f2);
            if (o1VarB2 != null) {
                dDoubleValue11 = 0.0d;
            } else {
                dDoubleValue11 = 0.0d;
            }
            z16 = false;
            e1(false, "restSplitsDuration", dDoubleValue11);
        } else {
            z16 = false;
        }
        hVar = this.f113778f2;
        gCMComplexTwoLineButton = this.f113779g;
        gCMComplexTwoLineButton2 = this.O;
        if (hVar != null) {
            if (hVar.f29453f) {
                i(gCMComplexTwoLineButton, z16);
                i(gCMComplexTwoLineButton35, z16);
                i(gCMComplexTwoLineButton30, z16);
                i(gCMComplexTwoLineButton37, z16);
                i(gCMComplexTwoLineButton2, true);
                h(this.f113755a, z16);
                k(z16);
                l(this.f113759b, z16);
                gCMComplexTwoLineButton4 = gCMComplexTwoLineButton38;
            } else {
                gCMComplexTwoLineButton4 = gCMComplexTwoLineButton38;
                if (hVar.f29452e != 0) {
                    i(this.f113783h, false);
                    i(gCMComplexTwoLineButton34, false);
                    i(this.f113821r, false);
                    gCMComplexTwoLineButton3 = gCMComplexTwoLineButton29;
                    i(gCMComplexTwoLineButton3, false);
                    i(gCMComplexTwoLineButton2, false);
                    h(this.f113755a, true);
                    l(this.f113763c, false);
                    k(false);
                    l(this.f113759b, false);
                }
            }
            gCMComplexTwoLineButton3 = gCMComplexTwoLineButton29;
        } else {
            gCMComplexTwoLineButton3 = gCMComplexTwoLineButton29;
            gCMComplexTwoLineButton4 = gCMComplexTwoLineButton38;
        }
        gCMComplexTwoLineButton5 = gCMComplexTwoLineButton4;
        if (am.z0.P(this.J1.f4358a)) {
            gCMComplexTwoLineButton8 = gCMComplexTwoLineButton2;
            gCMComplexTwoLineButton9 = gCMComplexTwoLineButton5;
            gCMComplexTwoLineButton10 = gCMComplexTwoLineButton;
            l(gCMComplexTwoLineButton9, true);
            gCMComplexTwoLineButton7 = gCMComplexTwoLineButton28;
            gCMComplexTwoLineButton9.setButtonTopLabel(gCMComplexTwoLineButton9.getContext().getString(R.string.lbl_number_of_runs));
            hVar11 = this.f113778f2;
            if (hVar11 != null) {
                z38 = true;
            } else {
                z38 = true;
            }
            gCMComplexTwoLineButton9.setEnabled(z38);
            o1VarD3 = tq.k.d(this.f113778f2);
            ps.o1 o1VarB4 = fr.a.b(this.f113778f2);
            if (o1VarD3 != null) {
                gCMComplexTwoLineButton6 = gCMComplexTwoLineButton27;
                hVar12 = this.f113778f2;
                if (hVar12 != null) {
                    dIntValue5 = 0.0d;
                } else {
                    dIntValue5 = 0.0d;
                }
                e1(false, "lapCount", dIntValue5);
            } else {
                gCMComplexTwoLineButton6 = gCMComplexTwoLineButton27;
                hVar12 = this.f113778f2;
                if (hVar12 != null) {
                    dIntValue5 = 0.0d;
                } else {
                    dIntValue5 = 0.0d;
                }
                e1(false, "lapCount", dIntValue5);
            }
        } else {
            gCMComplexTwoLineButton6 = gCMComplexTwoLineButton27;
            gCMComplexTwoLineButton7 = gCMComplexTwoLineButton28;
            gCMComplexTwoLineButton8 = gCMComplexTwoLineButton2;
            gCMComplexTwoLineButton9 = gCMComplexTwoLineButton5;
            gCMComplexTwoLineButton10 = gCMComplexTwoLineButton;
        }
        if (am.z0.b(am.x0.R0, this.J1.f4358a)) {
            l(gCMComplexTwoLineButton9, true);
            gCMComplexTwoLineButton9.setButtonTopLabel(gCMComplexTwoLineButton9.getContext().getString(R.string.lbl_number_of_runs));
            hVar9 = this.f113778f2;
            if (hVar9 != null) {
                z37 = true;
            } else {
                z37 = true;
            }
            gCMComplexTwoLineButton9.setEnabled(z37);
            o1VarD2 = tq.k.d(this.f113778f2);
            if (o1VarD2 != null) {
                if (o1VarD2.getNoOfSplits() != null) {
                    iIntValue2 = o1VarD2.getNoOfSplits().intValue();
                } else {
                    iIntValue2 = 0;
                }
                if (o1VarD2.getMovingDuration() != null) {
                    dDoubleValue7 = o1VarD2.getMovingDuration().doubleValue();
                } else {
                    dDoubleValue7 = 0.0d;
                }
                if (o1VarD2.getDuration() != null) {
                    dDoubleValue8 = 0.0d;
                } else {
                    dDoubleValue8 = 0.0d;
                }
                gCMComplexTwoLineButton11 = gCMComplexTwoLineButton34;
                e1(false, "lapCount", iIntValue2);
                e1(false, "activeSplitsMovingDuration", dDoubleValue7);
                e1(false, "activeSplitsIdleDuration", dDoubleValue8);
                o1VarB = fr.a.b(this.f113778f2);
                if (o1VarB != null) {
                    if (o1VarB.getDuration() != null) {
                        dDoubleValue9 = o1VarB.getDuration().doubleValue();
                    } else {
                        dDoubleValue9 = 0.0d;
                    }
                    e1(false, "restSplitsDuration", dDoubleValue9);
                }
            } else {
                textView2 = textView2;
                gCMComplexTwoLineButton37 = gCMComplexTwoLineButton37;
                gCMComplexTwoLineButton11 = gCMComplexTwoLineButton34;
                gCMComplexTwoLineButton35 = gCMComplexTwoLineButton35;
                hVar10 = this.f113778f2;
                if (hVar10 != null) {
                    iIntValue = 0;
                } else {
                    iIntValue = 0;
                }
                e1(false, "lapCount", iIntValue);
            }
        } else {
            textView2 = textView2;
            gCMComplexTwoLineButton37 = gCMComplexTwoLineButton37;
            gCMComplexTwoLineButton11 = gCMComplexTwoLineButton34;
            gCMComplexTwoLineButton35 = gCMComplexTwoLineButton35;
        }
        zM = am.z0.M(this.J1.f4358a);
        String str20 = this.J1.f4358a;
        x0Var2 = am.x0.D;
        zB = am.z0.b(x0Var2, str20);
        if (zB) {
            gCMComplexTwoLineButton12 = gCMComplexTwoLineButton32;
            gCMComplexTwoLineButton13 = gCMComplexTwoLineButton36;
            gCMComplexTwoLineButton14 = gCMComplexTwoLineButton35;
            gCMComplexTwoLineButton15 = gCMComplexTwoLineButton7;
            gCMComplexTwoLineButton16 = gCMComplexTwoLineButton37;
            textView = textView2;
            gCMComplexTwoLineButton17 = gCMComplexTwoLineButton6;
            gCMComplexTwoLineButton18 = gCMComplexTwoLineButton11;
            if (zM) {
                hVar2 = this.f113778f2;
                if (hVar2 != null) {
                    x0Var2 = x0Var2;
                } else {
                    x0Var2 = x0Var2;
                }
                f(true);
                i(gCMComplexTwoLineButton30, false);
                i(gCMComplexTwoLineButton16, false);
                j(false, false);
                i(this.A, false);
                i(this.B, false);
                i(this.C, false);
                i(this.D, false);
                i(this.E, false);
                i(gCMComplexTwoLineButton33, false);
                l(textView, true);
                i(gCMComplexTwoLineButton14, false);
                i(gCMComplexTwoLineButton18, true);
                i(gCMComplexTwoLineButton3, false);
                i(gCMComplexTwoLineButton17, false);
                i(gCMComplexTwoLineButton15, false);
                i(gCMComplexTwoLineButton13, true);
                i(gCMComplexTwoLineButton12, true);
                R0();
                D0();
            } else {
                x0Var2 = x0Var2;
            }
        } else {
            gCMComplexTwoLineButton12 = gCMComplexTwoLineButton32;
            gCMComplexTwoLineButton13 = gCMComplexTwoLineButton36;
            gCMComplexTwoLineButton14 = gCMComplexTwoLineButton35;
            gCMComplexTwoLineButton15 = gCMComplexTwoLineButton7;
            gCMComplexTwoLineButton16 = gCMComplexTwoLineButton37;
            textView = textView2;
            gCMComplexTwoLineButton17 = gCMComplexTwoLineButton6;
            gCMComplexTwoLineButton18 = gCMComplexTwoLineButton11;
            if (zM) {
                hVar2 = this.f113778f2;
                if (hVar2 != null) {
                    x0Var2 = x0Var2;
                } else {
                    x0Var2 = x0Var2;
                }
                f(true);
                i(gCMComplexTwoLineButton30, false);
                i(gCMComplexTwoLineButton16, false);
                j(false, false);
                i(this.A, false);
                i(this.B, false);
                i(this.C, false);
                i(this.D, false);
                i(this.E, false);
                i(gCMComplexTwoLineButton33, false);
                l(textView, true);
                i(gCMComplexTwoLineButton14, false);
                i(gCMComplexTwoLineButton18, true);
                i(gCMComplexTwoLineButton3, false);
                i(gCMComplexTwoLineButton17, false);
                i(gCMComplexTwoLineButton15, false);
                i(gCMComplexTwoLineButton13, true);
                i(gCMComplexTwoLineButton12, true);
                R0();
                D0();
            } else {
                x0Var2 = x0Var2;
            }
        }
        String str115 = this.J1.f4358a;
        x0Var3 = am.x0.f4352y2;
        zB2 = am.z0.b(x0Var3, str115);
        String str116 = this.J1.f4358a;
        x0Var4 = am.x0.f4356z2;
        boolean zB1110 = am.z0.b(x0Var4, str116);
        if (zB2) {
            o1VarD = tq.k.d(this.f113778f2);
            if (o1VarD != null) {
                dIntValue = 0.0d;
            } else {
                dIntValue = 0.0d;
            }
            e1(true, "routes", dIntValue);
            if (o1VarD != null) {
                dIntValue2 = 0.0d;
            } else {
                dIntValue2 = 0.0d;
            }
            e1(true, "sends", dIntValue2);
            if (o1VarD != null) {
                dIntValue3 = 0.0d;
            } else {
                dIntValue3 = 0.0d;
            }
            e1(true, "falls", dIntValue3);
            if (o1VarD != null) {
                dDoubleValue = 0.0d;
            } else {
                dDoubleValue = 0.0d;
            }
            e1(true, "elevation_gain", dDoubleValue);
            if (o1VarD != null) {
                dDoubleValue2 = 0.0d;
            } else {
                dDoubleValue2 = 0.0d;
            }
            e1(true, "avgAscent", dDoubleValue2);
            if (o1VarD != null) {
                dDoubleValue3 = 0.0d;
            } else {
                dDoubleValue3 = 0.0d;
            }
            e1(true, "maxAscent", dDoubleValue3);
            if (o1VarD != null) {
                dDoubleValue4 = 0.0d;
            } else {
                dDoubleValue4 = 0.0d;
            }
            e1(true, "totalAscent", dDoubleValue4);
            strI0 = "";
            if (o1VarD != null) {
                scale = "";
            } else {
                scale = "";
            }
            c1("difficultyScale", scale);
            if (o1VarD != null) {
                strI0 = o1VarD.i0();
            }
            c1("max_difficulty", strI0);
            boolean z413 = !z14;
            this.J0.setEnabled(z413);
            this.D.setEnabled(z413);
            this.C.setEnabled(z413);
            this.E.setEnabled(z413);
            this.L0.setEnabled(z413);
            this.M0.setEnabled(z413);
            this.A.setEnabled(z413);
            if (z14) {
                z17 = false;
            } else {
                z17 = false;
            }
            this.K0.setEnabled(z17);
        } else {
            o1VarD = tq.k.d(this.f113778f2);
            if (o1VarD != null) {
                dIntValue = 0.0d;
            } else {
                dIntValue = 0.0d;
            }
            e1(true, "routes", dIntValue);
            if (o1VarD != null) {
                dIntValue2 = 0.0d;
            } else {
                dIntValue2 = 0.0d;
            }
            e1(true, "sends", dIntValue2);
            if (o1VarD != null) {
                dIntValue3 = 0.0d;
            } else {
                dIntValue3 = 0.0d;
            }
            e1(true, "falls", dIntValue3);
            if (o1VarD != null) {
                dDoubleValue = 0.0d;
            } else {
                dDoubleValue = 0.0d;
            }
            e1(true, "elevation_gain", dDoubleValue);
            if (o1VarD != null) {
                dDoubleValue2 = 0.0d;
            } else {
                dDoubleValue2 = 0.0d;
            }
            e1(true, "avgAscent", dDoubleValue2);
            if (o1VarD != null) {
                dDoubleValue3 = 0.0d;
            } else {
                dDoubleValue3 = 0.0d;
            }
            e1(true, "maxAscent", dDoubleValue3);
            if (o1VarD != null) {
                dDoubleValue4 = 0.0d;
            } else {
                dDoubleValue4 = 0.0d;
            }
            e1(true, "totalAscent", dDoubleValue4);
            strI0 = "";
            if (o1VarD != null) {
                scale = "";
            } else {
                scale = "";
            }
            c1("difficultyScale", scale);
            if (o1VarD != null) {
                strI0 = o1VarD.i0();
            }
            c1("max_difficulty", strI0);
            boolean z414 = !z14;
            this.J0.setEnabled(z414);
            this.D.setEnabled(z414);
            this.C.setEnabled(z414);
            this.E.setEnabled(z414);
            this.L0.setEnabled(z414);
            this.M0.setEnabled(z414);
            this.A.setEnabled(z414);
            if (z14) {
                z17 = false;
            } else {
                z17 = false;
            }
            this.K0.setEnabled(z17);
        }
        Context context6 = gCMComplexTwoLineButton13.getContext();
        if (zB != 0) {
            i14 = R.string.activity_details_max_water_temperature;
        } else {
            i14 = R.string.activity_details_max_temperature;
        }
        B0(gCMComplexTwoLineButton13, context6.getString(i14));
        if (zB) {
            i15 = R.string.activity_details_min_water_temperature;
        } else {
            i15 = R.string.activity_details_min_temperature;
        }
        B0(gCMComplexTwoLineButton12, context6.getString(i15));
        if (gCMComplexTwoLineButton10 != null) {
            v0(gCMComplexTwoLineButton10, dh.b.A(gCMComplexTwoLineButton10.getContext(), this.J1.f4360c));
        }
        x0Var5 = this.J1;
        x0Var6 = am.x0.f4313o1;
        if (x0Var5 == x0Var6) {
            z18 = true;
        } else {
            z18 = false;
        }
        if (z18) {
            if (z44) {
                d25 = am.g2.f3976e.f3984c;
                str6 = null;
            } else {
                strArrSplit = ((am.d) KoinJavaComponent.get(am.d.class)).g0().split(StringUtils.SPACE);
                d19 = Double.parseDouble(strArrSplit[0]);
                if (strArrSplit.length > 1) {
                    str5 = strArrSplit[1];
                } else {
                    str5 = null;
                }
                if (d19 != 0.0d) {
                    d24 = d19;
                } else {
                    d24 = am.g2.f3976e.f3984c;
                }
                double d210 = d24;
                if (TextUtils.isEmpty(str5)) {
                    this.R1 = q();
                    str5 = e.METER.f113854a;
                }
                f1((int) (this.R1 / d210));
                str6 = str5;
                d25 = d210;
            }
            N0(d25, str6);
        } else {
            gCMComplexTwoLineButton12 = gCMComplexTwoLineButton12;
        }
        if (z18) {
            f1(this.O1);
        }
        i(this.f113827t, z18);
        i(this.f113830u, z18);
        g(gCMComplexTwoLineButton16, !z18);
        if (this.J1.equals(x0Var6)) {
            g(gCMComplexTwoLineButton33, true);
        }
        l3VarG = this.S1;
        if (l3VarG == null) {
            l3VarG = G(this.J1);
        }
        l3VarG2 = G(this.J1);
        this.S1 = l3VarG2;
        if (z44) {
            int iIntValue5 = p3.c(this.R1, l3VarG2, l3VarG, true).get(0).intValue();
            this.P1 = iIntValue5;
            this.Q1 = 0;
            this.R1 = iIntValue5;
        } else if (l3VarG != l3VarG2) {
            arrayListB = p3.b(this.R1, l3VarG2, l3VarG);
            if (arrayListB.size() == 6) {
                this.P1 = arrayListB.get(4).intValue();
                this.Q1 = arrayListB.get(5).intValue();
                this.R1 = (((double) arrayListB.get(5).intValue()) / 100.0d) + ((double) arrayListB.get(4).intValue());
            }
        }
        V0(context6);
        if (am.z0.O(this.J1.f4358a)) {
            hVar6 = this.f113778f2;
            if (hVar6 != null) {
                i0Var = null;
            } else {
                i0Var = null;
            }
            if (hVar6 != null) {
                z36 = true;
            } else {
                z36 = true;
            }
            gCMComplexTwoLineButton9.setEnabled(z36);
            if (i0Var != null) {
                double d211 = i0Var.f29565y2;
                c22.l3.f23124b.getClass();
                d16 = d211 * ((double) 1000);
            } else {
                d16 = 0.0d;
            }
            e1(false, "bestLapTime", d16);
            if (i0Var != null) {
                d17 = i0Var.f29516i;
            } else {
                d17 = 0.0d;
            }
            e1(false, "elapsed_time", d17);
            hVar7 = this.f113778f2;
            if (hVar7 != null) {
                str4 = hVar7.f29454g;
            } else {
                str4 = null;
            }
            c1(str, str4);
            hVar8 = this.f113778f2;
            if (hVar8 != null) {
                dIntValue4 = 0.0d;
            } else {
                dIntValue4 = 0.0d;
            }
            e1(false, "lapCount", dIntValue4);
            if (i0Var != null) {
                d18 = i0Var.f29544r;
            } else {
                d18 = 0.0d;
            }
            if (z15) {
                q3Var = c22.q3.KILOMETER_PER_HOUR;
            } else {
                q3Var = c22.q3.MILE_PER_HOUR;
            }
            c22.l3.f23124b.getClass();
            e1(false, "racingMaxSpeed", c22.l3.a.i(d18, q3Var));
        }
        str2 = x0Var.f4358a;
        if (am.z0.L(str2)) {
            i(gCMComplexTwoLineButton33, false);
        } else {
            i(gCMComplexTwoLineButton33, false);
        }
        G0(str2);
        hVar3 = this.f113778f2;
        if (hVar3 != null) {
            zA = ar.i.a(hVar3);
        } else {
            zA = false;
        }
        l(this.f113835v1, zA);
        g(gCMComplexTwoLineButton14, s0());
        g(this.V0, s0());
        K0();
        M0(this.G1);
        S0();
        gCMComplexTwoLineButton19 = this.J;
        if (gCMComplexTwoLineButton19 != null) {
            String str117 = this.J1.f4358a;
            zB6 = am.z0.b(am.x0.f4312o, str117);
            zB7 = am.z0.b(am.x0.f4308n, str117);
            boolean zB1111 = am.z0.b(am.x0.f4316p, str117);
            boolean zD5 = am.z0.D(str117);
            zB8 = am.z0.b(am.x0.f4268a3, str117);
            zJ = am.z0.J(str117);
            boolean zL7 = am.z0.L(str117);
            if (zB6) {
                z29 = true;
            } else {
                z29 = true;
            }
            if (zJ) {
                z34 = true;
            } else {
                z34 = true;
            }
            zF0 = am.z0.f0(str117);
            zB9 = am.z0.b(x0Var3, str117);
            boolean zB1112 = am.z0.b(x0Var4, str117);
            boolean zB1113 = am.z0.b(am.x0.C2, str117);
            boolean zB1114 = am.z0.b(am.x0.f4274c3, str117);
            boolean zB1115 = am.z0.b(am.x0.C3, str117);
            boolean zB1116 = am.z0.b(am.x0.f4297k1, str117);
            boolean zB1117 = am.z0.b(am.x0.f4301l1, str117);
            if (zB9) {
                z35 = true;
            } else {
                z35 = true;
            }
            context2 = gCMComplexTwoLineButton19.getContext();
            string2 = context2.getString(R.string.activity_details_average_cadence);
            string3 = context2.getString(R.string.activity_details_max_cadence);
            if (zB6) {
                string2 = context2.getString(R.string.activity_details_average_bike_cadence);
                string3 = context2.getString(R.string.activity_details_max_bike_cadence);
            } else if (zB7) {
                string2 = context2.getString(R.string.activity_details_average_run_cadence);
                string3 = context2.getString(R.string.activity_details_max_run_cadence);
            } else if (zB8) {
                string2 = context2.getString(R.string.activity_details_average_push_cadence);
                string3 = context2.getString(R.string.activity_details_max_push_cadence);
            }
            B0(gCMComplexTwoLineButton19, string2);
            gCMComplexTwoLineButton26 = this.K;
            B0(gCMComplexTwoLineButton26, string3);
            if (z29) {
                HashMap<String, Double> map5 = this.Z1;
                d14 = map5.get("average_cadence");
                d15 = map5.get("max_cadence");
                if (d14 != null) {
                    dDoubleValue5 = d14.doubleValue();
                } else {
                    dDoubleValue5 = Double.NaN;
                }
                v0(gCMComplexTwoLineButton19, M(gCMComplexTwoLineButton19, dDoubleValue5));
                if (d15 != null) {
                    dDoubleValue6 = d15.doubleValue();
                } else {
                    dDoubleValue6 = Double.NaN;
                }
                v0(gCMComplexTwoLineButton26, M(gCMComplexTwoLineButton26, dDoubleValue6));
            }
            i(gCMComplexTwoLineButton19, false);
            i(gCMComplexTwoLineButton26, false);
            if (z29) {
                i(gCMComplexTwoLineButton19, true);
                i(gCMComplexTwoLineButton26, true);
            }
            if (zF0) {
                i(gCMComplexTwoLineButton19, false);
                i(gCMComplexTwoLineButton26, false);
            }
            if (z34) {
                i(gCMComplexTwoLineButton19, true);
                i(gCMComplexTwoLineButton26, true);
            }
            if (z35) {
                i(gCMComplexTwoLineButton19, false);
                i(gCMComplexTwoLineButton26, false);
            }
        }
        String str118 = this.J1.f4358a;
        am.x0 x0Var19 = am.x0.f4312o;
        zB3 = am.z0.b(x0Var19, str118);
        String str119 = this.J1.f4358a;
        am.x0 x0Var110 = am.x0.f4316p;
        boolean zB1118 = am.z0.b(x0Var110, str119);
        boolean zB1119 = am.z0.b(x0Var3, this.J1.f4358a);
        boolean zB216 = am.z0.b(x0Var4, this.J1.f4358a);
        boolean zT3 = am.z0.t(this.J1.f4358a);
        boolean zF5 = am.z0.f0(this.J1.f4358a);
        boolean zJ4 = am.z0.J(this.J1.f4358a);
        boolean zL8 = am.z0.L(this.J1.f4358a);
        boolean zB217 = am.z0.b(am.x0.C2, this.J1.f4358a);
        boolean zB218 = am.z0.b(am.x0.C3, this.J1.f4358a);
        boolean zD6 = am.z0.D(this.J1.f4358a);
        gCMComplexTwoLineButton20 = this.M;
        gCMComplexTwoLineButton21 = this.N;
        if (zB3) {
            gCMComplexTwoLineButton22 = this.L;
            if (zB3) {
                i(gCMComplexTwoLineButton22, true);
                i(gCMComplexTwoLineButton21, true);
                i(gCMComplexTwoLineButton20, true);
            } else {
                i(gCMComplexTwoLineButton22, true);
                i(gCMComplexTwoLineButton21, false);
                i(gCMComplexTwoLineButton20, true);
            }
        } else {
            gCMComplexTwoLineButton22 = this.L;
            if (zB3) {
                i(gCMComplexTwoLineButton22, true);
                i(gCMComplexTwoLineButton21, true);
                i(gCMComplexTwoLineButton20, true);
            } else {
                i(gCMComplexTwoLineButton22, true);
                i(gCMComplexTwoLineButton21, false);
                i(gCMComplexTwoLineButton20, true);
            }
        }
        zB4 = am.z0.b(x0Var110, this.J1.f4358a);
        boolean zL9 = am.z0.L(this.J1.f4358a);
        boolean z415 = am.z0.z(this.J1.f4358a);
        boolean zR3 = am.z0.R(this.J1.f4358a);
        String str1110 = this.J1.f4358a;
        am.x0 x0Var111 = am.x0.f4344w2;
        boolean zB219 = am.z0.b(x0Var111, str1110);
        String str1111 = this.J1.f4358a;
        am.x0 x0Var112 = am.x0.f4348x2;
        boolean zB2110 = am.z0.b(x0Var112, str1111);
        boolean zF6 = am.z0.f0(this.J1.f4358a);
        boolean zX4 = am.z0.X(this.J1.f4358a);
        boolean zA2 = am.z0.a0(this.J1.f4358a);
        boolean zB2111 = am.z0.b(am.x0.E2, this.J1.f4358a);
        if (zB4) {
            z19 = false;
        } else {
            z19 = false;
        }
        boolean zB2112 = am.z0.b(am.x0.O1, this.J1.f4358a);
        if (z19) {
            z24 = false;
        } else {
            z24 = false;
        }
        if (!am.z0.b(x0Var2, this.J1.f4358a)) {
            i(gCMComplexTwoLineButton15, z24);
        }
        i(gCMComplexTwoLineButton13, z24);
        i(gCMComplexTwoLineButton12, z24);
        b1();
        W0();
        hVar4 = this.f113778f2;
        if (hVar4 != null) {
            z25 = false;
        } else {
            z25 = false;
        }
        x0Var7 = this.J1;
        if (x0Var7 == am.x0.C) {
            z26 = true;
        } else {
            z26 = false;
        }
        if (am.z0.b(x0Var19, x0Var7.f4358a)) {
        }
        GCMComplexTwoLineButton gCMComplexTwoLineButton46 = gCMComplexTwoLineButton8;
        i(gCMComplexTwoLineButton46, z49);
        dVar = this.f113806m2;
        context = gCMComplexTwoLineButton46.getContext();
        this.f113806m2 = dVar;
        if (dVar != null) {
            string = dVar.courseName;
        } else {
            string = context.getString(R.string.no_value);
        }
        v0(gCMComplexTwoLineButton46, string);
        I0();
        g1();
        String str1112 = this.J1.f4358a;
        zB5 = am.z0.b(x0Var111, str1112);
        boolean zB2113 = am.z0.b(x0Var112, str1112);
        boolean zE2 = am.z0.e0(str1112);
        if (zB5) {
            z27 = true;
        } else {
            z27 = true;
        }
        if (zB5) {
            z28 = true;
        } else {
            z28 = true;
        }
        i(this.f113839x, z27);
        i(this.f113842y, z28);
        str3 = this.J1.f4358a;
        z0Var = am.z0.f4390a;
        if (!xy2.b.C(z0Var, str3)) {
            if (this.F1) {
            }
            l(this.f113773e1, false);
            l(this.f113777f1, false);
            a1();
        }
        l(this.f113773e1, true);
        l(this.f113777f1, false);
        gCMComplexTwoLineButton23 = this.f113781g1;
        gCMComplexTwoLineButton24 = this.f113789i1;
        gCMComplexTwoLineButton25 = this.f113797k1;
        hVar5 = this.f113778f2;
        if (hVar5 == null) {
            l(gCMComplexTwoLineButton23, true);
            l(gCMComplexTwoLineButton24, false);
            l(gCMComplexTwoLineButton25, false);
        } else {
            l(gCMComplexTwoLineButton23, true);
            l(gCMComplexTwoLineButton24, false);
            l(gCMComplexTwoLineButton25, false);
        }
        a1();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean, int] */
    public final void R0() {
        int i14;
        com.garmin.android.apps.connectmobile.activities.newmodel.h hVar = this.f113778f2;
        boolean z14 = false;
        boolean z15 = hVar == null || hVar.f29452e == 0;
        this.f113765c1.setVisible(z15);
        this.f113775f.setVisible(z15);
        ?? IsVisible = this.f113787i.isVisible();
        int i15 = IsVisible;
        if (this.f113771e.isVisible()) {
            i15 = IsVisible + 1;
        }
        int i16 = i15;
        if (this.Y0.isVisible()) {
            i16 = i15 + 1;
        }
        int i17 = i16;
        if (this.Z0.isVisible()) {
            i14 = i16 + 1;
        }
        if (i17 > 0) {
            i17 = i14;
            z14 = true;
        }
        i17 = i14;
        l(this.f113769d1, z14);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0075  */
    public final void S0() {
        String strI1;
        GCMComplexTwoLineButton gCMComplexTwoLineButton = this.I;
        if (gCMComplexTwoLineButton != null) {
            Context context = gCMComplexTwoLineButton.getContext();
            double dC0 = c0("max_speed");
            if (am.z0.c(this.J1.f4358a)) {
                c22.q3 q3VarK0 = k0();
                DecimalFormat decimalFormatN = c22.l3.n();
                c22.l3.f23124b.getClass();
                strI1 = c22.l3.a.M0(context, dC0, q3VarK0, decimalFormatN, false);
            } else {
                boolean zB = am.z0.b(am.x0.f4324r, this.J1.f4358a);
                c22.l3.a aVar = c22.l3.f23124b;
                aVar.getClass();
                context.getClass();
                strI1 = aVar.I1(dC0, "", new l22.a(context), zB, this.f113794j2, false);
                if (am.z0.Q(this.J1.f4358a)) {
                    aVar.getClass();
                    strI1 = aVar.r0(context, c22.l3.a.q(dC0), this.f113790i2, false, "");
                    context = context;
                } else {
                    if (am.z0.b(am.x0.f4297k1, this.J1.f4358a)) {
                        aVar.getClass();
                        strI1 = aVar.r0(context, c22.l3.a.q(dC0), this.f113790i2, false, "");
                        context = context;
                    } else {
                        if (am.z0.b(am.x0.f4301l1, this.J1.f4358a)) {
                            aVar.getClass();
                            strI1 = aVar.r0(context, c22.l3.a.q(dC0), this.f113790i2, false, "");
                            context = context;
                        } else {
                            context = context;
                        }
                    }
                }
            }
            StringBuilder sbI = sn.a.i(strI1, StringUtils.SPACE);
            sbI.append(context.getString(j0()));
            String string = sbI.toString();
            B0(this.I, context.getString(am.z0.J(this.J1.f4358a) ? R.string.activity_details_max_nautical_sog : i0(true)));
            v0(this.I, string);
        }
    }

    public final void T0() {
        boolean z14 = this.f113809n1 && this.f113813o1;
        this.f113817p1 = z14;
        if (z14) {
            u0();
        } else {
            this.f113805m1.setVisibility(8);
        }
    }

    public final void U0(GCMComplexTwoLineButton gCMComplexTwoLineButton, double d14) {
        if (gCMComplexTwoLineButton != null) {
            String string = gCMComplexTwoLineButton.getContext().getString(R.string.no_duration_value);
            if (!Double.isNaN(d14) && d14 != 0.0d) {
                long jRound = Math.round(d14) * 1000;
                c22.l3.f23124b.getClass();
                string = c22.l3.a.b1(jRound);
            }
            v0(gCMComplexTwoLineButton, string);
            I0();
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0056  */
    public final void V0(Context context) {
        int i14;
        String str = this.J1.f4358a;
        am.z0 z0Var = am.z0.f4390a;
        boolean zB = am.z0.b(am.x0.D2, str);
        boolean zP = am.z0.P(this.J1.f4358a);
        boolean zB2 = am.z0.b(am.x0.R0, this.J1.f4358a);
        String str2 = this.J1.f4358a;
        if (TextUtils.isEmpty(str2) || !am.z0.b(am.x0.f4285g2, str2)) {
            String str3 = this.J1.f4358a;
            if (TextUtils.isEmpty(str3) || !am.z0.b(am.x0.f4288h2, str3)) {
                String str4 = this.J1.f4358a;
                if (TextUtils.isEmpty(str4) || !am.z0.b(am.x0.f4291i2, str4)) {
                    i14 = (zB || zP || zB2) ? R.string.activity_stats_details_total_time_label : R.string.lbl_time;
                } else {
                    i14 = R.string.lbl_duration;
                }
            } else {
                i14 = R.string.lbl_duration;
            }
        } else {
            i14 = R.string.lbl_duration;
        }
        String string = context.getString(i14);
        B0(this.f113791j, string);
        B0(this.f113787i, string);
    }

    public final boolean W() {
        return this.f113817p1 && this.f113823r1;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x013d  */
    /* JADX WARN: Code duplicated, block: B:60:0x016a  */
    /* JADX WARN: Code duplicated, block: B:63:0x017b  */
    /* JADX WARN: Code duplicated, block: B:65:0x0195 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:66:0x0197  */
    /* JADX WARN: Code duplicated, block: B:68:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:69:0x01af  */
    /* JADX WARN: Code duplicated, block: B:74:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:77:0x01c7  */
    public final void W0() {
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        GCMComplexTwoLineButton gCMComplexTwoLineButton;
        GCMComplexTwoLineButton gCMComplexTwoLineButton2;
        ps.o1 o1VarD;
        String mode;
        String str = this.J1.f4358a;
        am.z0 z0Var = am.z0.f4390a;
        boolean zB = am.z0.b(am.x0.f4324r, str);
        boolean zB2 = am.z0.b(am.x0.D, this.J1.f4358a);
        boolean zR = am.z0.R(this.J1.f4358a);
        boolean z18 = am.z0.z(this.J1.f4358a);
        boolean zP = am.z0.P(this.J1.f4358a);
        boolean zO = am.z0.o(this.J1.f4358a);
        boolean zB3 = am.z0.b(am.x0.f4344w2, this.J1.f4358a);
        boolean zB4 = am.z0.b(am.x0.f4348x2, this.J1.f4358a);
        boolean zF0 = am.z0.f0(this.J1.f4358a);
        boolean zB5 = am.z0.b(am.x0.f4352y2, this.J1.f4358a);
        boolean zJ = am.z0.J(this.J1.f4358a);
        boolean zL = am.z0.L(this.J1.f4358a);
        boolean zB6 = am.z0.b(am.x0.f4356z2, this.J1.f4358a);
        boolean zX = am.z0.X(this.J1.f4358a);
        boolean zA0 = am.z0.a0(this.J1.f4358a);
        boolean zB7 = am.z0.b(am.x0.C2, this.J1.f4358a);
        boolean zB8 = am.z0.b(am.x0.E2, this.J1.f4358a);
        if (!am.z0.Q(this.J1.f4358a)) {
            z14 = zB8;
            if (!am.z0.b(am.x0.f4297k1, this.J1.f4358a)) {
                if (!am.z0.b(am.x0.f4301l1, this.J1.f4358a) && !am.z0.s(this.J1.f4358a) && !am.z0.U(this.J1.f4358a)) {
                    z15 = false;
                }
            }
            boolean z19 = z15;
            boolean zB9 = am.z0.b(am.x0.C3, this.J1.f4358a);
            boolean zD = am.z0.D(this.J1.f4358a);
            boolean zT = am.z0.t(this.J1.f4358a);
            boolean zB10 = am.z0.b(am.x0.O1, this.J1.f4358a);
            if (!zB || zB2 || z18 || zR || zP || zB3 || ((zF0 && !zT) || zB6 || zJ || zL || zX || zB7 || z14 || z19 || zA0 || zB4 || zB9 || zD || zB10)) {
                z16 = false;
            } else {
                z16 = true;
            }
            if (!zB || zB2 || z18 || zR || zB3 || ((zF0 && !zT) || zB5 || zB6 || zJ || zL || zX || zB7 || z14 || z19 || zA0 || zB4 || zB9 || zD || zB10)) {
                z17 = false;
            } else {
                z17 = true;
            }
            gCMComplexTwoLineButton = this.A;
            i(gCMComplexTwoLineButton, z16);
            gCMComplexTwoLineButton2 = this.B;
            i(gCMComplexTwoLineButton2, z17);
            if (zO) {
                gCMComplexTwoLineButton.setButtonTopLabel(gCMComplexTwoLineButton.getContext().getString(R.string.activities_ascent_label));
                gCMComplexTwoLineButton2.setButtonTopLabel(gCMComplexTwoLineButton.getContext().getString(R.string.activities_descent_label));
            } else {
                if (zB5) {
                    gCMComplexTwoLineButton.setButtonTopLabel(gCMComplexTwoLineButton.getContext().getString(R.string.lbl_total_ascent));
                    gCMComplexTwoLineButton2.setButtonTopLabel(gCMComplexTwoLineButton.getContext().getString(R.string.lbl_total_descent));
                    return;
                }
                gCMComplexTwoLineButton.setButtonTopLabel(gCMComplexTwoLineButton.getContext().getString(R.string.activities_ascent_label));
                o1VarD = tq.k.d(this.f113778f2);
                if (o1VarD != null) {
                    mode = o1VarD.getMode();
                } else {
                    mode = "";
                }
                i(gCMComplexTwoLineButton, !((to.i.SIMPLE.f165805a.equals(mode) && this.F1) ? false : true));
            }
        }
        z14 = zB8;
        z15 = true;
        boolean z110 = z15;
        boolean zB11 = am.z0.b(am.x0.C3, this.J1.f4358a);
        boolean zD2 = am.z0.D(this.J1.f4358a);
        boolean zT2 = am.z0.t(this.J1.f4358a);
        boolean zB12 = am.z0.b(am.x0.O1, this.J1.f4358a);
        if (zB) {
            z16 = false;
        } else {
            z16 = false;
        }
        if (zB) {
            z17 = false;
        } else {
            z17 = false;
        }
        gCMComplexTwoLineButton = this.A;
        i(gCMComplexTwoLineButton, z16);
        gCMComplexTwoLineButton2 = this.B;
        i(gCMComplexTwoLineButton2, z17);
        if (zO) {
            gCMComplexTwoLineButton.setButtonTopLabel(gCMComplexTwoLineButton.getContext().getString(R.string.activities_ascent_label));
            gCMComplexTwoLineButton2.setButtonTopLabel(gCMComplexTwoLineButton.getContext().getString(R.string.activities_descent_label));
        } else {
            if (zB5) {
                gCMComplexTwoLineButton.setButtonTopLabel(gCMComplexTwoLineButton.getContext().getString(R.string.lbl_total_ascent));
                gCMComplexTwoLineButton2.setButtonTopLabel(gCMComplexTwoLineButton.getContext().getString(R.string.lbl_total_descent));
                return;
            }
            gCMComplexTwoLineButton.setButtonTopLabel(gCMComplexTwoLineButton.getContext().getString(R.string.activities_ascent_label));
            o1VarD = tq.k.d(this.f113778f2);
            if (o1VarD != null) {
                mode = o1VarD.getMode();
            } else {
                mode = "";
            }
            i(gCMComplexTwoLineButton, !((to.i.SIMPLE.f165805a.equals(mode) && this.F1) ? false : true));
        }
    }

    public final int X() {
        return (int) c0("lapCount");
    }

    public final void X0(double d14, double d15) {
        this.T1 = d14;
        this.U1 = d15;
        if (this.U != null) {
            Context context = this.V.getContext();
            if (Double.isNaN(d14) || Double.isNaN(d15)) {
                this.U.setButtonBottomLeftLabel(R.string.no_value);
            } else {
                this.U.setButtonBottomLeftLabel(context.getString(R.string.location_format_with_6_decimals_and_comma, Double.valueOf(d14), Double.valueOf(d15)));
            }
        }
    }

    public final String Y() {
        return this.Y1.get("dive_location");
    }

    public final void Y0(double d14, double d15) {
        this.V1 = d14;
        this.W1 = d15;
        GCMComplexTwoLineButton gCMComplexTwoLineButton = this.V;
        if (gCMComplexTwoLineButton != null) {
            Context context = gCMComplexTwoLineButton.getContext();
            if (Double.isNaN(d14) || Double.isNaN(d15)) {
                this.V.setButtonBottomLeftLabel(R.string.no_value);
            } else {
                this.V.setButtonBottomLeftLabel(context.getString(R.string.location_format_with_6_decimals_and_comma, Double.valueOf(d14), Double.valueOf(d15)));
            }
        }
    }

    public final double Z() {
        return c0("maxAscent");
    }

    public final void Z0(String str) {
        i(this.f113779g, true);
        i(this.f113787i, true);
        i(this.f113824s, true);
        h(this.f113755a, true);
        i(this.f113821r, true);
        i(this.W0, false);
        i(this.f113799l, false);
        i(this.f113803m, false);
        l(this.S, false);
        i(this.f113822r0, false);
        h(this.Y0, false);
        h(this.Z0, false);
        h(this.f113757a1, false);
        i(this.f113761b1, false);
        l(this.f113769d1, false);
        i(this.C, false);
        i(this.D, false);
        i(this.E, false);
        i(this.J0, false);
        i(this.I0, false);
        i(this.K0, false);
        i(this.L0, false);
        i(this.M0, false);
        i(this.N0, false);
        i(this.f113791j, false);
        i(this.f113811o, false);
        i(this.f113815p, false);
        i(this.O0, false);
        i(this.P0, false);
        i(this.Q0, false);
        i(this.R0, false);
        i(this.S0, false);
        i(this.T0, false);
        i(this.U0, false);
        i(this.V0, false);
        GCMComplexTwoLineButton gCMComplexTwoLineButton = this.f113787i;
        gCMComplexTwoLineButton.setButtonTopLabel(gCMComplexTwoLineButton.getContext().getString(R.string.lbl_time));
        if (am.z0.M(str)) {
            f(true);
        } else {
            k(am.z0.b(am.x0.D, str));
            f(false);
        }
        if (am.z0.W(str)) {
            j(true, false);
            i(this.f113795k, false);
            i(this.f113771e, false);
            i(this.f113811o, true);
            i(this.I, false);
            i(this.P, false);
            l(this.f113763c, true);
            i(this.f113787i, false);
            i(this.f113791j, true);
        } else if (am.z0.t(str)) {
            j(true, false);
            i(this.f113795k, true);
            i(this.f113771e, false);
            i(this.f113811o, true);
            i(this.I, true);
            i(this.P, false);
            l(this.f113763c, true);
        } else if (am.z0.b(am.x0.f4357z3, str) || am.z0.b(am.x0.A3, str)) {
            j(true, false);
            i(this.f113795k, false);
            i(this.f113771e, false);
            i(this.f113811o, true);
            i(this.I, true);
            i(this.P, false);
            l(this.f113763c, true);
        } else if (am.z0.b(am.x0.C2, str)) {
            j(true, false);
            i(this.f113795k, false);
            i(this.f113771e, false);
            i(this.f113811o, true);
            i(this.I, false);
            i(this.P, false);
            l(this.f113763c, true);
            i(this.f113787i, false);
            i(this.f113791j, true);
        } else if (am.z0.e0(str)) {
            j(true, false);
            i(this.f113795k, false);
            i(this.f113771e, false);
            i(this.f113811o, true);
            i(this.I, false);
            i(this.P, false);
            l(this.f113763c, false);
            i(this.f113787i, false);
            i(this.f113791j, true);
        } else if (am.z0.N(str) || am.z0.G(str)) {
            j(true, false);
            i(this.f113795k, false);
            i(this.f113771e, false);
            i(this.f113811o, true);
            i(this.I, false);
            i(this.P, false);
            l(this.f113763c, true);
        } else if (am.z0.z(str)) {
            j(true, false);
            i(this.f113795k, false);
            i(this.f113771e, false);
            i(this.f113811o, false);
            i(this.I, false);
            i(this.P, true);
            l(this.f113763c, false);
        } else if (am.z0.R(str)) {
            j(false, false);
            i(this.f113795k, false);
            i(this.f113771e, true);
            i(this.f113811o, false);
            i(this.I, false);
            i(this.P, false);
            l(this.f113763c, false);
            l(this.X0, false);
            i(this.f113779g, false);
            i(this.f113821r, false);
            i(this.f113787i, false);
            l(this.f113759b, true);
            h(this.f113755a, false);
            l(this.f113836w, true);
            l(this.f113833v, true);
            i(this.f113791j, true);
        } else if (am.z0.b(am.x0.f4344w2, str) || am.z0.b(am.x0.f4348x2, str) || am.z0.b(am.x0.E2, str)) {
            j(false, false);
            i(this.f113795k, false);
            i(this.f113771e, false);
            i(this.f113811o, false);
            i(this.I, false);
            i(this.P, false);
            l(this.f113763c, true);
            i(this.W0, false);
            i(this.f113787i, false);
            i(this.f113791j, true);
        } else if (am.z0.o(str)) {
            j(true, false);
            i(this.f113795k, false);
            i(this.W0, true);
            i(this.f113771e, true);
            i(this.f113815p, false);
            i(this.f113811o, true);
            i(this.I, true);
            i(this.P, false);
            l(this.f113763c, true);
            l(this.f113836w, true);
            l(this.f113833v, true);
            i(this.f113787i, false);
            i(this.f113791j, true);
            i(this.f113824s, true);
        } else if (am.z0.v(str)) {
            j(true, false);
            i(this.f113795k, false);
            i(this.f113799l, true);
            l(this.f113769d1, false);
            i(this.f113771e, true);
            i(this.I, true);
            i(this.P, false);
            i(this.f113811o, true);
            l(this.f113763c, true);
            l(this.f113836w, true);
            l(this.f113833v, true);
            i(this.f113787i, true);
            i(this.f113791j, false);
            i(this.f113824s, true);
        } else if (am.z0.P(str)) {
            j(true, false);
            i(this.f113795k, false);
            com.garmin.android.apps.connectmobile.activities.newmodel.h hVar = this.f113778f2;
            if (hVar != null && fr.a.d(hVar.f29464q, qs.x.SKI_RUN, qs.x.SKI_LIFT)) {
                i(this.V0, true);
                i(this.T0, true);
                i(this.U0, true);
                i(this.S0, true);
                GCMComplexTwoLineButton gCMComplexTwoLineButton2 = this.S0;
                gCMComplexTwoLineButton2.setButtonTopLabel(gCMComplexTwoLineButton2.getContext().getString(R.string.activities_total_ski_run_lift_time));
            }
            i(this.f113791j, false);
            i(this.f113787i, true);
            i(this.f113771e, true);
            i(this.f113811o, true);
            i(this.I, true);
            i(this.P, false);
            l(this.f113763c, true);
            l(this.f113836w, true);
            l(this.f113833v, true);
            i(this.f113824s, true);
            i(this.f113795k, false);
            i(this.W0, true);
            i(this.f113822r0, true);
        } else if ((!TextUtils.isEmpty(str) && am.z0.b(am.x0.f4288h2, str)) || ((!TextUtils.isEmpty(str) && am.z0.b(am.x0.f4291i2, str)) || (!TextUtils.isEmpty(str) && am.z0.b(am.x0.f4285g2, str)))) {
            j(true, false);
            i(this.f113791j, false);
            i(this.f113787i, true);
            i(this.f113795k, true);
            i(this.f113771e, true);
            i(this.f113811o, true);
            i(this.I, true);
            i(this.P, false);
            l(this.f113763c, true);
        } else if (am.z0.x(str)) {
            j(true, false);
            i(this.f113824s, true);
            i(this.W0, true);
            i(this.f113771e, true);
            i(this.f113787i, true);
            i(this.f113791j, false);
            i(this.P, false);
            l(this.f113763c, true);
            i(this.f113811o, true);
            i(this.f113795k, false);
            i(this.S, true);
            i(this.B, true);
            i(this.A, true);
            i(this.L, true);
            i(this.M, true);
            i(this.N, true);
            i(this.J, true);
            i(this.K, true);
            l(this.f113833v, true);
            l(this.f113836w, true);
            l(this.F, true);
            l(this.H, true);
            l(this.G, true);
        } else {
            boolean zB = am.z0.b(am.x0.f4308n, str);
            boolean z14 = this.f113786h2;
            boolean z15 = this.F1;
            if (zB || am.z0.b(am.x0.f4312o, str)) {
                j(true, false);
                am.x0 x0Var = am.x0.D2;
                boolean zB2 = am.z0.b(x0Var, str);
                boolean z16 = (am.z0.b(x0Var, str) || am.z0.b(am.x0.R0, str) || !z15 || z14) ? false : true;
                i(this.f113795k, true);
                i(this.f113771e, true);
                i(this.f113811o, true);
                i(this.I, true);
                i(this.P, false);
                l(this.f113763c, true);
                i(this.f113761b1, z16);
                i(this.R0, zB2);
                i(this.S0, zB2);
                if (am.z0.b(am.x0.R0, str)) {
                    i(this.f113795k, false);
                    com.garmin.android.apps.connectmobile.activities.newmodel.h hVar2 = this.f113778f2;
                    if (hVar2 == null || !fr.a.d(hVar2.f29464q, qs.x.DOWNHILL_RUN, qs.x.DOWNHILL_LIFT)) {
                        GCMComplexTwoLineButton gCMComplexTwoLineButton3 = this.S0;
                        gCMComplexTwoLineButton3.setButtonTopLabel(gCMComplexTwoLineButton3.getContext().getString(R.string.strength_training_rest_time_label));
                        i(this.f113803m, false);
                    } else {
                        i(this.T0, true);
                        i(this.U0, true);
                        i(this.S0, true);
                        GCMComplexTwoLineButton gCMComplexTwoLineButton4 = this.S0;
                        gCMComplexTwoLineButton4.setButtonTopLabel(gCMComplexTwoLineButton4.getContext().getString(R.string.activities_total_ski_run_lift_time));
                        i(this.f113803m, true);
                        i(this.f113822r0, true);
                    }
                }
            } else {
                boolean zB3 = am.z0.b(am.x0.f4352y2, str);
                boolean z17 = this.f113782g2;
                if (zB3) {
                    ps.o1 o1VarD = tq.k.d(this.f113778f2);
                    boolean z18 = to.i.SIMPLE.f165805a.equals(o1VarD != null ? o1VarD.getMode() : "") || !z15;
                    j(true, false);
                    i(this.f113771e, false);
                    i(this.J0, true);
                    i(this.I0, (z17 || z18) ? false : true);
                    boolean z19 = !z18;
                    i(this.K0, z19);
                    i(this.L0, z19);
                    i(this.M0, z19);
                    i(this.A, z19);
                    i(this.C, z18);
                    i(this.D, z18);
                    i(this.E, z18);
                    l(this.f113836w, true);
                    l(this.f113833v, true);
                    i(this.P, false);
                    i(this.I, false);
                    i(this.f113795k, false);
                    i(this.S, false);
                } else if (am.z0.b(am.x0.f4356z2, str)) {
                    j(true, false);
                    i(this.f113771e, false);
                    i(this.J0, true);
                    i(this.I0, !z17);
                    i(this.K0, true);
                    l(this.f113836w, true);
                    l(this.f113833v, true);
                    i(this.P, false);
                    i(this.I, false);
                    i(this.f113795k, false);
                    i(this.S, false);
                    l(this.X0, true);
                } else if (am.z0.L(str)) {
                    j(true, false);
                    i(this.f113795k, false);
                    i(this.I, false);
                    i(this.f113771e, true);
                    i(this.f113811o, true);
                    i(this.I, true);
                    i(this.P, false);
                    l(this.f113763c, true);
                } else if (am.z0.X(str) || am.z0.a0(this.J1.f4358a)) {
                    j(true, false);
                    i(this.f113795k, false);
                    i(this.f113787i, false);
                    i(this.f113791j, true);
                    i(this.f113771e, false);
                    i(this.Q, true);
                    l(this.f113763c, true);
                    i(this.f113811o, true);
                    i(this.N0, true);
                    i(this.O0, true);
                    i(this.P0, true);
                    i(this.Q0, true);
                    i(this.P, false);
                } else if (am.z0.b(am.x0.f4317p1, str)) {
                    j(true, false);
                    i(this.I, false);
                    i(this.P, false);
                    i(this.f113811o, true);
                } else if (am.z0.b(am.x0.f4268a3, str)) {
                    boolean z24 = am.z0.b(am.x0.f4271b3, str) && z15 && !z14;
                    j(true, false);
                    i(this.f113795k, true);
                    i(this.I, true);
                    i(this.f113787i, true);
                    i(this.f113771e, true);
                    i(this.P, false);
                    i(this.f113811o, true);
                    i(this.A, true);
                    i(this.B, true);
                    i(this.F, true);
                    i(this.G, true);
                    i(this.H, true);
                    i(this.f113761b1, z24);
                } else if (am.z0.D(str)) {
                    i(this.f113795k, false);
                    i(this.f113787i, !z15);
                    i(this.f113771e, false);
                    h(this.Y0, false);
                    h(this.Z0, false);
                    i(this.P, false);
                    l(this.B0, true);
                    i(this.C0, true);
                    i(this.D0, true);
                    i(this.E0, true);
                    i(this.F0, true);
                    i(this.G0, true);
                    i(this.H0, true);
                    i(this.f113807n, false);
                    l(this.X0, false);
                    i(this.W0, false);
                    Iterator it = this.f113774e2.iterator();
                    while (it.hasNext()) {
                        i((GCMComplexTwoLineButton) it.next(), false);
                    }
                } else if (am.z0.b(am.x0.C3, str)) {
                    j(true, true);
                    i(this.f113795k, false);
                    i(this.f113771e, false);
                    i(this.f113811o, true);
                    i(this.I, false);
                    i(this.P, false);
                    l(this.f113763c, true);
                    i(this.W0, false);
                } else if (am.z0.b(am.x0.O1, str)) {
                    j(false, false);
                    i(this.f113795k, true);
                    i(this.f113771e, true);
                    i(this.f113811o, true);
                    i(this.I, true);
                    i(this.P, false);
                    l(this.f113763c, true);
                } else {
                    j(true, false);
                    i(this.f113795k, true);
                    i(this.f113771e, true);
                    i(this.f113811o, true);
                    i(this.I, true);
                    i(this.P, false);
                    l(this.f113763c, true);
                }
            }
        }
        j1();
        R0();
    }

    public final double a() {
        double d14 = this.G1;
        if (Double.isNaN(d14) || d14 <= 0.0d) {
            return 0.0d;
        }
        return q() / d14;
    }

    public final double a0() {
        String str = this.J1.f4358a;
        am.z0 z0Var = am.z0.f4390a;
        if (am.z0.b(am.x0.f4312o, str) || am.z0.J(this.J1.f4358a) || am.z0.L(this.J1.f4358a)) {
            return c0("max_cadence");
        }
        return Double.NaN;
    }

    public final void a1() {
        ArrayList arrayList = this.f113774e2;
        Object obj = null;
        if (arrayList != null) {
            for (Object obj2 : arrayList) {
                if (((GCMComplexTwoLineButton) obj2).isVisible()) {
                    obj = obj2;
                    break;
                }
            }
        }
        l(this.X0, ((GCMComplexTwoLineButton) obj) != null);
    }

    public final double b(com.garmin.android.apps.connectmobile.activities.newmodel.i0 i0Var) {
        return ((Double.compare(i0Var.f29516i, this.G1) != 0) || (Double.compare(i0Var.f29512h, q()) != 0)) ? a() : i0Var.f29538p;
    }

    public final double b0() {
        String str = this.J1.f4358a;
        am.z0 z0Var = am.z0.f4390a;
        if (!am.z0.b(am.x0.f4308n, str)) {
            if (!am.z0.b(am.x0.f4316p, this.J1.f4358a)) {
                return Double.NaN;
            }
        }
        return c0("max_cadence");
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0145  */
    public final void b1() {
        boolean z14;
        boolean z15;
        boolean z16;
        String str = this.J1.f4358a;
        am.z0 z0Var = am.z0.f4390a;
        boolean zB = am.z0.b(am.x0.f4308n, str);
        boolean zB2 = am.z0.b(am.x0.f4312o, this.J1.f4358a);
        boolean zB3 = am.z0.b(am.x0.f4324r, this.J1.f4358a);
        boolean zB4 = am.z0.b(am.x0.f4316p, this.J1.f4358a);
        boolean z17 = am.z0.z(this.J1.f4358a);
        boolean zR = am.z0.R(this.J1.f4358a);
        boolean zB5 = am.z0.b(am.x0.f4344w2, this.J1.f4358a);
        boolean zB6 = am.z0.b(am.x0.f4348x2, this.J1.f4358a);
        boolean zF0 = am.z0.f0(this.J1.f4358a);
        boolean zB7 = am.z0.b(am.x0.f4331t, this.J1.f4358a);
        boolean zB8 = am.z0.b(am.x0.f4320q, this.J1.f4358a);
        boolean zB9 = am.z0.b(am.x0.U1, this.J1.f4358a);
        boolean zL = am.z0.L(this.J1.f4358a);
        boolean zB10 = am.z0.b(am.x0.f4352y2, this.J1.f4358a);
        boolean z18 = am.z0.b(am.x0.f4350y, this.J1.f4358a) || am.z0.a0(this.J1.f4358a);
        boolean zB11 = am.z0.b(am.x0.C2, this.J1.f4358a);
        boolean zB12 = am.z0.b(am.x0.E2, this.J1.f4358a);
        boolean zD0 = am.z0.d0(this.J1.f4358a);
        boolean zB13 = am.z0.b(am.x0.f4277d3, this.J1.f4358a);
        boolean zB14 = am.z0.b(am.x0.f4323q3, this.J1.f4358a);
        boolean zB15 = am.z0.b(am.x0.f4268a3, this.J1.f4358a);
        boolean zB16 = am.z0.b(am.x0.C3, this.J1.f4358a);
        String str2 = this.J1.f4358a;
        if (!TextUtils.isEmpty(str2)) {
            z14 = zB16;
            if (am.z0.b(am.x0.f4346x, str2)) {
                z15 = true;
            }
            if (!zB || zB2 || zB3 || zB4 || z17 || zR || zB5 || zB6 || zF0 || zB7 || zB8 || zB9 || zL || zB10 || z18 || zB11 || zB12 || zD0 || zB13 || zB14 || zB15 || z14 || z15) {
                z16 = true;
            } else {
                z16 = false;
            }
            i(this.f113836w, z16);
            i(this.f113833v, z16);
        }
        z14 = zB16;
        z15 = false;
        if (zB) {
            z16 = true;
        } else {
            z16 = true;
        }
        i(this.f113836w, z16);
        i(this.f113833v, z16);
    }

    public final void c() {
        if (this.f113807n != null) {
            double dC0 = c0("calories");
            l22.a aVar = new l22.a(this.f113807n.getContext());
            boolean zIsNaN = Double.isNaN(dC0);
            GCMComplexTwoLineButton gCMComplexTwoLineButton = this.f113807n;
            if (zIsNaN) {
                v0(gCMComplexTwoLineButton, aVar.getString(R.string.calories_abbreviation));
            } else {
                v0(gCMComplexTwoLineButton, c22.l3.c(aVar, dC0, false));
            }
        }
    }

    public final double c0(String str) {
        Double d14 = this.Z1.get(str);
        if (d14 != null) {
            return d14.doubleValue();
        }
        return Double.NaN;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void c1(String str, String str2) {
        double dDoubleValue;
        am.u1 u1Var;
        double dDoubleValue2;
        double dDoubleValue3;
        if (str == null || "-".equals(str2)) {
            return;
        }
        HashMap<String, String> map = this.Y1;
        String str3 = map.get(str);
        if (!"max_temperature".equalsIgnoreCase(str) && !"min_temperature".equalsIgnoreCase(str) && !"average_temperature".equalsIgnoreCase(str)) {
            map.put(str, str2);
        }
        Context context = this.f113779g.getContext();
        byte b14 = -1;
        switch (str.hashCode()) {
            case -1965312281:
                if (str.equals("entry_type")) {
                    b14 = 0;
                }
                break;
            case -1837556436:
                if (str.equals("suit_type")) {
                    b14 = 1;
                }
                break;
            case -1829121255:
                if (str.equals("max_temperature")) {
                    b14 = 2;
                }
                break;
            case -1028604337:
                if (str.equals("difficultyScale")) {
                    b14 = 3;
                }
                break;
            case -1024410030:
                if (str.equals("average_temperature")) {
                    b14 = 4;
                }
                break;
            case -870042208:
                if (str.equals("dive_location")) {
                    b14 = 5;
                }
                break;
            case -868719987:
                if (str.equals("dive_entry_location")) {
                    b14 = 6;
                }
                break;
            case -733732490:
                if (str.equals("max_difficulty")) {
                    b14 = 7;
                }
                break;
            case 3373707:
                if (str.equals("name")) {
                    b14 = 8;
                }
                break;
            case 94089926:
                if (str.equals("buddy")) {
                    b14 = 9;
                }
                break;
            case 105008833:
                if (str.equals("notes")) {
                    b14 = 10;
                }
                break;
            case 193191595:
                if (str.equals("dive_exit_location")) {
                    b14 = Ascii.VT;
                }
                break;
            case 1076356494:
                if (str.equals("equipment")) {
                    b14 = Ascii.FF;
                }
                break;
            case 1126940025:
                if (str.equals("current")) {
                    b14 = Ascii.CR;
                }
                break;
            case 1337581962:
                if (str.equals("surface_conditions")) {
                    b14 = Ascii.SO;
                }
                break;
            case 1355407111:
                if (str.equals("min_temperature")) {
                    b14 = Ascii.SI;
                }
                break;
            case 1961433442:
                if (str.equals("water_type")) {
                    b14 = Ascii.DLE;
                }
                break;
        }
        GCMComplexTwoLineButton gCMComplexTwoLineButton = this.K0;
        GCMComplexTwoLineButton gCMComplexTwoLineButton2 = this.f113792j0;
        HashMap<String, Double> map2 = this.Z1;
        switch (b14) {
            case 0:
                w0(this.f113788i0, str2, context.getString(R.string.activity_details_diving_select_one));
                break;
            case 1:
                w0(this.f113760b0, str2, context.getString(R.string.activity_details_diving_select_one));
                w0(this.f113843y0, str2, context.getString(R.string.activity_details_diving_select_one));
                k1(str2);
                break;
            case 2:
                l1(str, str2);
                Double d14 = map2.get("average_temperature");
                Double d15 = map2.get("min_temperature");
                Double d16 = map2.get("max_temperature");
                Context context2 = this.G.getContext();
                if (d16 != null) {
                    f12.l.f68084a.getClass();
                    if (f12.l.a.a().c()) {
                        double dDoubleValue4 = d16.doubleValue();
                        c22.l3.f23124b.getClass();
                        dDoubleValue = c22.l3.a.d(dDoubleValue4);
                    } else {
                        dDoubleValue = d16.doubleValue();
                    }
                    Double dValueOf = Double.valueOf(dDoubleValue);
                    if (d14 != null && d14.doubleValue() > d16.doubleValue() && d15 != null && d15.doubleValue() > d16.doubleValue()) {
                        l1("min_temperature", dValueOf.toString());
                        l1("average_temperature", dValueOf.toString());
                        Toast.makeText(context2, context2.getString(R.string.avg_min_temp_decreased), 0).show();
                        break;
                    } else if (d14 != null && d14.doubleValue() > d16.doubleValue()) {
                        l1("average_temperature", dValueOf.toString());
                        Toast.makeText(context2, context2.getString(R.string.avg_temp_decreased), 0).show();
                        break;
                    } else if (d15 != null && d15.doubleValue() > d16.doubleValue()) {
                        l1("min_temperature", dValueOf.toString());
                        Toast.makeText(context2, context2.getString(R.string.min_temp_decreased), 0).show();
                        break;
                    }
                }
                break;
            case 3:
                if (!TextUtils.isEmpty(str3)) {
                    String str4 = this.J1.f4358a;
                    am.v1 v1Var = am.v1.f4245a;
                    str4.getClass();
                    am.v1.f4245a.getClass();
                    List list = (List) am.v1.b(str4).get(str2);
                    c1("max_difficulty", (list == null || (u1Var = (am.u1) p13.h0.d0(list)) == null) ? null : u1Var.f4232c);
                }
                w0(this.I0, str2, context.getString(R.string.no_value));
                gCMComplexTwoLineButton.setEnabled(!TextUtils.isEmpty(str2));
                break;
            case 4:
                l1(str, str2);
                Double d17 = map2.get("average_temperature");
                Double d18 = map2.get("min_temperature");
                Double d19 = map2.get("max_temperature");
                Context context3 = this.F.getContext();
                if (d17 != null) {
                    f12.l.f68084a.getClass();
                    if (f12.l.a.a().c()) {
                        double dDoubleValue5 = d17.doubleValue();
                        c22.l3.f23124b.getClass();
                        dDoubleValue2 = c22.l3.a.d(dDoubleValue5);
                    } else {
                        dDoubleValue2 = d17.doubleValue();
                    }
                    Double dValueOf2 = Double.valueOf(dDoubleValue2);
                    if (d18 != null && d18.doubleValue() > d17.doubleValue()) {
                        l1("min_temperature", dValueOf2.toString());
                        Toast.makeText(context3, context3.getString(R.string.min_temp_decreased), 0).show();
                        break;
                    } else if (d19 != null && d19.doubleValue() < d17.doubleValue()) {
                        l1("max_temperature", dValueOf2.toString());
                        Toast.makeText(context3, context3.getString(R.string.max_temp_increased), 0).show();
                        break;
                    }
                }
                break;
            case 5:
                w0(this.Q, str2, context.getString(R.string.no_value));
                w0(this.f113834v0, str2, context.getString(R.string.no_value));
                break;
            case 6:
                w0(this.U, str2, context.getString(R.string.no_value));
                break;
            case 7:
                w0(gCMComplexTwoLineButton, am.v1.d(this.J1.f4358a, str2), context.getString(R.string.no_value));
                break;
            case 8:
                w0(this.f113775f, str2, this.E1);
                break;
            case 9:
                w0(this.f113831u0, str2, gCMComplexTwoLineButton2.getContext().getString(R.string.activity_details_buddy));
                w0(this.f113796k0, str2, gCMComplexTwoLineButton2.getContext().getString(R.string.activity_details_buddy));
                break;
            case 10:
                w0(this.f113765c1, str2, this.D1);
                break;
            case 11:
                w0(this.V, str2, context.getString(R.string.no_value));
                break;
            case 12:
                String string = gCMComplexTwoLineButton2.getContext().getString(R.string.activity_details_equipment);
                GCMComplexTwoLineButton gCMComplexTwoLineButton3 = this.f113828t0;
                w0(gCMComplexTwoLineButton3, str2, string);
                w0(gCMComplexTwoLineButton2, str2, gCMComplexTwoLineButton3.getContext().getString(R.string.activity_details_equipment));
                break;
            case 13:
                w0(this.f113784h0, str2, context.getString(R.string.activity_details_diving_select_one));
                break;
            case 14:
                w0(this.f113780g0, str2, context.getString(R.string.activity_details_diving_select_one));
                break;
            case 15:
                l1(str, str2);
                Double d24 = map2.get("average_temperature");
                Double d25 = map2.get("min_temperature");
                Double d26 = map2.get("max_temperature");
                Context context4 = this.H.getContext();
                if (d25 != null) {
                    f12.l.f68084a.getClass();
                    if (f12.l.a.a().c()) {
                        double dDoubleValue6 = d25.doubleValue();
                        c22.l3.f23124b.getClass();
                        dDoubleValue3 = c22.l3.a.d(dDoubleValue6);
                    } else {
                        dDoubleValue3 = d25.doubleValue();
                    }
                    Double dValueOf3 = Double.valueOf(dDoubleValue3);
                    if (d24 != null && d24.doubleValue() < d25.doubleValue() && d26 != null && d26.doubleValue() < d25.doubleValue()) {
                        l1("max_temperature", dValueOf3.toString());
                        l1("average_temperature", dValueOf3.toString());
                        Toast.makeText(context4, context4.getString(R.string.avg_max_temp_increased), 0).show();
                        break;
                    } else if (d24 != null && d24.doubleValue() < d25.doubleValue()) {
                        l1("average_temperature", dValueOf3.toString());
                        Toast.makeText(context4, context4.getString(R.string.avg_temp_increased), 0).show();
                        break;
                    } else if (d26 != null && d26.doubleValue() < d25.doubleValue()) {
                        l1("max_temperature", dValueOf3.toString());
                        Toast.makeText(context4, context4.getString(R.string.max_temp_increased), 0).show();
                        break;
                    }
                }
                break;
            case 16:
                w0(this.f113837w0, str2, context.getString(R.string.activity_details_diving_select_one));
                w0(this.Z, str2, context.getString(R.string.activity_details_diving_select_one));
                break;
        }
    }

    public final void d() {
        GCMComplexTwoLineButton gCMComplexTwoLineButton = this.F0;
        if (gCMComplexTwoLineButton == null || this.G0 == null) {
            return;
        }
        Context context = gCMComplexTwoLineButton.getContext();
        y0(context, this.F0, c0("fluids_loss"));
        y0(context, this.G0, c0("fluids_consumed"));
        double dC0 = c0("fluids_loss");
        double dC1 = c0("fluids_consumed");
        boolean zIsNaN = Double.isNaN(dC0);
        GCMComplexTwoLineButton gCMComplexTwoLineButton2 = this.H0;
        if (zIsNaN || Double.isNaN(dC1)) {
            v0(gCMComplexTwoLineButton2, context.getString(R.string.lbl_unit_milliliter_abr));
        } else {
            v0(gCMComplexTwoLineButton2, c22.l3.a(context, dC0, dC1, false));
        }
    }

    public final double d0() {
        return this.Z1.get("po2MaxValue").doubleValue();
    }

    public final void d1(String str, boolean z14) {
        if (str.equals("deco_dive")) {
            this.f113758a2.put(str, Boolean.valueOf(z14));
            GCMComplexTwoLineButton gCMComplexTwoLineButton = this.W;
            v0(gCMComplexTwoLineButton, gCMComplexTwoLineButton.getContext().getString(z14 ? R.string.lbl_yes : R.string.lbl_no));
        }
    }

    public final void e() {
        GCMComplexTwoLineButton gCMComplexTwoLineButton = this.L;
        if (gCMComplexTwoLineButton != null) {
            Context context = gCMComplexTwoLineButton.getContext();
            String string = context.getString(R.string.lbl_watts);
            double dC0 = c0("average_power");
            double dC1 = c0("max_power");
            double dC2 = c0("max_average_power");
            v0(this.L, Double.isNaN(dC0) ? string : c22.l3.i(context, dC0));
            v0(this.M, Double.isNaN(dC1) ? string : c22.l3.i(context, dC1));
            if (!Double.isNaN(dC2)) {
                string = c22.l3.i(context, dC2);
            }
            v0(this.N, string);
        }
    }

    public final double e0() {
        return this.Z1.get("po2MinValue").doubleValue();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:304:0x05ab  */
    /* JADX WARN: Code duplicated, block: B:306:0x05bb  */
    public final void e1(boolean z14, String str, double d14) {
        String str2;
        String str3;
        String str4;
        String str5;
        f0 f0Var;
        if (str == null) {
            return;
        }
        Context context = this.f113779g.getContext();
        String str6 = "average_respiration_rate";
        String str7 = "floors_climbed";
        String str8 = "totalAscent";
        byte b14 = -1;
        switch (str.hashCode()) {
            case -2140649552:
                str2 = "max_respiration_rate";
                str3 = "activeSplitsDuration";
                str4 = "po2MinValue";
                if (str.equals("elapsed_time")) {
                    b14 = 0;
                }
                break;
            case -2093723454:
                str2 = "max_respiration_rate";
                str3 = "activeSplitsDuration";
                str4 = "po2MinValue";
                if (str.equals("suit_thickness")) {
                    b14 = 1;
                }
                break;
            case -2009387780:
                str2 = "max_respiration_rate";
                str3 = "activeSplitsDuration";
                str4 = "po2MinValue";
                if (str.equals("splitsMaxSpeed")) {
                    b14 = 2;
                }
                break;
            case -1992012396:
                str2 = "max_respiration_rate";
                str3 = "activeSplitsDuration";
                str4 = "po2MinValue";
                if (str.equals("duration")) {
                    b14 = 3;
                }
                break;
            case -1892755601:
                str2 = "max_respiration_rate";
                str3 = "activeSplitsDuration";
                str4 = "po2MinValue";
                if (str.equals("average_cadence")) {
                    b14 = 4;
                }
                break;
            case -1776038011:
                str2 = "max_respiration_rate";
                str3 = "activeSplitsDuration";
                str4 = "po2MinValue";
                b14 = str.equals(str6) ? (byte) 5 : (byte) -1;
                str6 = str6;
                break;
            case -1612195341:
                str5 = "po2MinValue";
                str2 = "max_respiration_rate";
                str3 = "activeSplitsDuration";
                if (str.equals(str3)) {
                    b14 = 6;
                }
                str4 = str5;
                break;
            case -1589737420:
                str5 = "po2MinValue";
                str2 = "max_respiration_rate";
                if (str.equals("lapCount")) {
                    b14 = 7;
                }
                str3 = "activeSplitsDuration";
                str4 = str5;
                break;
            case -1507448900:
                str5 = "po2MinValue";
                str2 = "max_respiration_rate";
                b14 = str.equals(str7) ? (byte) 8 : (byte) -1;
                str7 = str7;
                str3 = "activeSplitsDuration";
                str4 = str5;
                break;
            case -1416851466:
                str5 = "po2MinValue";
                str2 = "max_respiration_rate";
                if (str.equals("splitsCount")) {
                    b14 = 9;
                }
                str3 = "activeSplitsDuration";
                str4 = str5;
                break;
            case -1274136376:
                str5 = "po2MinValue";
                str2 = "max_respiration_rate";
                if (str.equals("max_average_power")) {
                    b14 = 10;
                }
                str3 = "activeSplitsDuration";
                str4 = str5;
                break;
            case -1252232898:
                str5 = "po2MinValue";
                str2 = "max_respiration_rate";
                b14 = str.equals(str8) ? Ascii.VT : (byte) -1;
                str8 = str8;
                str3 = "activeSplitsDuration";
                str4 = str5;
                break;
            case -1223986830:
                str5 = "po2MinValue";
                b14 = str.equals(str5) ? Ascii.FF : (byte) -1;
                str2 = "max_respiration_rate";
                str3 = "activeSplitsDuration";
                str4 = str5;
                break;
            case -1165797711:
                if (str.equals("racingMaxSpeed")) {
                    b14 = Ascii.CR;
                }
                str2 = "max_respiration_rate";
                str3 = "activeSplitsDuration";
                str4 = "po2MinValue";
                break;
            case -1093721250:
                if (str.equals("maxAscent")) {
                    b14 = Ascii.SO;
                }
                str2 = "max_respiration_rate";
                str3 = "activeSplitsDuration";
                str4 = "po2MinValue";
                break;
            case -925132982:
                if (str.equals("routes")) {
                    b14 = Ascii.SI;
                }
                str2 = "max_respiration_rate";
                str3 = "activeSplitsDuration";
                str4 = "po2MinValue";
                break;
            case -842486196:
                if (str.equals("avgAscent")) {
                    b14 = Ascii.DLE;
                }
                str2 = "max_respiration_rate";
                str3 = "activeSplitsDuration";
                str4 = "po2MinValue";
                break;
            case -787754341:
                if (str.equals("number_of_lengths")) {
                    b14 = 17;
                }
                str2 = "max_respiration_rate";
                str3 = "activeSplitsDuration";
                str4 = "po2MinValue";
                break;
            case -667181282:
                if (str.equals("max_respiration_rate")) {
                    b14 = Ascii.DC2;
                }
                str2 = "max_respiration_rate";
                str3 = "activeSplitsDuration";
                str4 = "po2MinValue";
                break;
            case -632784140:
                if (str.equals("max_heart_rate")) {
                    b14 = 19;
                }
                str2 = "max_respiration_rate";
                str3 = "activeSplitsDuration";
                str4 = "po2MinValue";
                break;
            case -608955295:
                if (str.equals("bottom_time")) {
                    b14 = Ascii.DC4;
                }
                str2 = "max_respiration_rate";
                str3 = "activeSplitsDuration";
                str4 = "po2MinValue";
                break;
            case -548824524:
                if (str.equals("po2LowPointDepth")) {
                    b14 = Ascii.NAK;
                }
                str2 = "max_respiration_rate";
                str3 = "activeSplitsDuration";
                str4 = "po2MinValue";
                break;
            case -292411616:
                if (str.equals("splitsMaxDistance")) {
                    b14 = Ascii.SYN;
                }
                str2 = "max_respiration_rate";
                str3 = "activeSplitsDuration";
                str4 = "po2MinValue";
                break;
            case -248629208:
                if (str.equals("max_depth")) {
                    b14 = Ascii.ETB;
                }
                str2 = "max_respiration_rate";
                str3 = "activeSplitsDuration";
                str4 = "po2MinValue";
                break;
            case -237242774:
                if (str.equals("max_power")) {
                    b14 = Ascii.CAN;
                }
                str2 = "max_respiration_rate";
                str3 = "activeSplitsDuration";
                str4 = "po2MinValue";
                break;
            case -234459732:
                if (str.equals("max_speed")) {
                    b14 = Ascii.EM;
                }
                str2 = "max_respiration_rate";
                str3 = "activeSplitsDuration";
                str4 = "po2MinValue";
                break;
            case -212991901:
                if (str.equals("average_power")) {
                    b14 = Ascii.SUB;
                }
                str2 = "max_respiration_rate";
                str3 = "activeSplitsDuration";
                str4 = "po2MinValue";
                break;
            case -191183717:
                if (str.equals("average_heart_rate")) {
                    b14 = Ascii.ESC;
                }
                str2 = "max_respiration_rate";
                str3 = "activeSplitsDuration";
                str4 = "po2MinValue";
                break;
            case -168965370:
                if (str.equals("calories")) {
                    b14 = Ascii.FS;
                }
                str2 = "max_respiration_rate";
                str3 = "activeSplitsDuration";
                str4 = "po2MinValue";
                break;
            case -103329459:
                if (str.equals("splitsDuration")) {
                    b14 = Ascii.GS;
                }
                str2 = "max_respiration_rate";
                str3 = "activeSplitsDuration";
                str4 = "po2MinValue";
                break;
            case 2605846:
                if (str.equals("avg_depth")) {
                    b14 = Ascii.RS;
                }
                str2 = "max_respiration_rate";
                str3 = "activeSplitsDuration";
                str4 = "po2MinValue";
                break;
            case 51590573:
                if (str.equals("bmrCalories")) {
                    b14 = Ascii.US;
                }
                str2 = "max_respiration_rate";
                str3 = "activeSplitsDuration";
                str4 = "po2MinValue";
                break;
            case 97196120:
                if (str.equals("falls")) {
                    b14 = 32;
                }
                str2 = "max_respiration_rate";
                str3 = "activeSplitsDuration";
                str4 = "po2MinValue";
                break;
            case 109322731:
                if (str.equals("sends")) {
                    b14 = 33;
                }
                str2 = "max_respiration_rate";
                str3 = "activeSplitsDuration";
                str4 = "po2MinValue";
                break;
            case 166075415:
                if (str.equals("surface_interval")) {
                    b14 = 34;
                }
                str2 = "max_respiration_rate";
                str3 = "activeSplitsDuration";
                str4 = "po2MinValue";
                break;
            case 178097022:
                if (str.equals("fluids_consumed")) {
                    b14 = 35;
                }
                str2 = "max_respiration_rate";
                str3 = "activeSplitsDuration";
                str4 = "po2MinValue";
                break;
            case 552209824:
                if (str.equals("po2MaxValue")) {
                    b14 = 36;
                }
                str2 = "max_respiration_rate";
                str3 = "activeSplitsDuration";
                str4 = "po2MinValue";
                break;
            case 571959222:
                if (str.equals("max_cadence")) {
                    b14 = 37;
                }
                str2 = "max_respiration_rate";
                str3 = "activeSplitsDuration";
                str4 = "po2MinValue";
                break;
            case 638334529:
                if (str.equals("restSplitsDuration")) {
                    b14 = 38;
                }
                str2 = "max_respiration_rate";
                str3 = "activeSplitsDuration";
                str4 = "po2MinValue";
                break;
            case 857567030:
                if (str.equals("totalSurfaceTime")) {
                    b14 = 39;
                }
                str2 = "max_respiration_rate";
                str3 = "activeSplitsDuration";
                str4 = "po2MinValue";
                break;
            case 864363111:
                if (str.equals("activeSplitsIdleDuration")) {
                    b14 = 40;
                }
                str2 = "max_respiration_rate";
                str3 = "activeSplitsDuration";
                str4 = "po2MinValue";
                break;
            case 878119353:
                if (str.equals("fluids_loss")) {
                    b14 = 41;
                }
                str2 = "max_respiration_rate";
                str3 = "activeSplitsDuration";
                str4 = "po2MinValue";
                break;
            case 943720483:
                if (str.equals("recovery_heart_rate")) {
                    b14 = 42;
                }
                str2 = "max_respiration_rate";
                str3 = "activeSplitsDuration";
                str4 = "po2MinValue";
                break;
            case 979285281:
                if (str.equals("activeSplitsMovingDuration")) {
                    b14 = 43;
                }
                str2 = "max_respiration_rate";
                str3 = "activeSplitsDuration";
                str4 = "po2MinValue";
                break;
            case 1051521281:
                if (str.equals("calories_consumed")) {
                    b14 = 44;
                }
                str2 = "max_respiration_rate";
                str3 = "activeSplitsDuration";
                str4 = "po2MinValue";
                break;
            case 1117783559:
                if (str.equals("calories_burned")) {
                    b14 = 45;
                }
                str2 = "max_respiration_rate";
                str3 = "activeSplitsDuration";
                str4 = "po2MinValue";
                break;
            case 1289163662:
                if (str.equals("best_pace")) {
                    b14 = 46;
                }
                str2 = "max_respiration_rate";
                str3 = "activeSplitsDuration";
                str4 = "po2MinValue";
                break;
            case 1352972931:
                if (str.equals("racingMinSpeed")) {
                    b14 = 47;
                }
                str2 = "max_respiration_rate";
                str3 = "activeSplitsDuration";
                str4 = "po2MinValue";
                break;
            case 1437857608:
                if (str.equals("po2HighPointDepth")) {
                    b14 = 48;
                }
                str2 = "max_respiration_rate";
                str3 = "activeSplitsDuration";
                str4 = "po2MinValue";
                break;
            case 1817418577:
                if (str.equals("duration_millis")) {
                    b14 = 49;
                }
                str2 = "max_respiration_rate";
                str3 = "activeSplitsDuration";
                str4 = "po2MinValue";
                break;
            case 1836973188:
                if (str.equals("bestLapTime")) {
                    b14 = 50;
                }
                str2 = "max_respiration_rate";
                str3 = "activeSplitsDuration";
                str4 = "po2MinValue";
                break;
            case 1902987297:
                if (str.equals("elevation_gain")) {
                    b14 = 51;
                }
                str2 = "max_respiration_rate";
                str3 = "activeSplitsDuration";
                str4 = "po2MinValue";
                break;
            case 1903150021:
                if (str.equals("elevation_loss")) {
                    b14 = 52;
                }
                str2 = "max_respiration_rate";
                str3 = "activeSplitsDuration";
                str4 = "po2MinValue";
                break;
            case 1941332754:
                if (str.equals("visibility")) {
                    b14 = 53;
                }
                str2 = "max_respiration_rate";
                str3 = "activeSplitsDuration";
                str4 = "po2MinValue";
                break;
            case 1961433442:
                if (str.equals("water_type")) {
                    b14 = 54;
                }
                str2 = "max_respiration_rate";
                str3 = "activeSplitsDuration";
                str4 = "po2MinValue";
                break;
            default:
                str2 = "max_respiration_rate";
                str3 = "activeSplitsDuration";
                str4 = "po2MinValue";
                break;
        }
        boolean z15 = this.f113790i2;
        HashMap<String, Double> map = this.Z1;
        switch (b14) {
            case 0:
                map.put(str, Double.valueOf(d14));
                U0(this.f113845z, d14);
                break;
            case 1:
                map.put(str, Double.valueOf(d14));
                int i14 = (int) d14;
                v0(this.f113764c0, R(i14, context));
                v0(this.f113846z0, R(i14, context));
                break;
            case 2:
                c22.q3 q3Var = z15 ? c22.q3.KILOMETER_PER_HOUR : c22.q3.MILE_PER_HOUR;
                c22.q3 q3Var2 = c22.q3.METERS_PER_SECOND;
                c22.l3.f23124b.getClass();
                double dW = c22.l3.a.w(d14, q3Var, q3Var2);
                map.put(str, Double.isNaN(dW) ? null : Double.valueOf(dW));
                v0(this.P0, e5.g(c22.l3.a.N0(context, dW, q3Var, c22.l3.n(), false, null), StringUtils.SPACE, context.getString(j0())));
                break;
            case 3:
            case 49:
                map.put(str, Double.valueOf(d14));
                if (o1(d14)) {
                    M0(d14);
                }
                break;
            case 4:
                double dN1 = n1(d14);
                map.put(str, Double.valueOf(dN1));
                GCMComplexTwoLineButton gCMComplexTwoLineButton = this.J;
                v0(gCMComplexTwoLineButton, M(gCMComplexTwoLineButton, dN1));
                break;
            case 5:
            case 18:
                map.put(str, Double.valueOf(n1(d14)));
                GCMComplexTwoLineButton gCMComplexTwoLineButton2 = this.f113839x;
                if (gCMComplexTwoLineButton2 != null) {
                    v0(gCMComplexTwoLineButton2, Q(gCMComplexTwoLineButton2.getContext(), c0(str6)));
                }
                GCMComplexTwoLineButton gCMComplexTwoLineButton3 = this.f113842y;
                if (gCMComplexTwoLineButton3 != null) {
                    v0(gCMComplexTwoLineButton3, Q(gCMComplexTwoLineButton3.getContext(), c0(str2)));
                }
                break;
            case 6:
                map.put(str, Double.valueOf(d14));
                if (o1(c0("restSplitsDuration") + d14)) {
                    U0(this.R0, d14);
                    M0(c0("restSplitsDuration") + c0(str3));
                }
                break;
            case 7:
                map.put(str, Double.valueOf(d14));
                GCMComplexTwoLineButton gCMComplexTwoLineButton4 = this.f113822r0;
                v0(gCMComplexTwoLineButton4, d14 > 0.0d ? Integer.toString((int) d14) : gCMComplexTwoLineButton4.getResources().getString(R.string.no_value));
                break;
            case 8:
                map.put(str, Double.valueOf(d14));
                w0(this.P, c22.l3.e(context, c0(str7)), this.P.getContext().getString(R.string.lbl_climbed));
                break;
            case 9:
                double dN2 = n1(d14);
                map.put(str, Double.valueOf(dN2));
                w0(this.N0, Long.toString(Math.round(dN2)), context.getString(R.string.no_value));
                break;
            case 10:
            case 24:
            case 26:
                map.put(str, Double.valueOf(d14));
                e();
                break;
            case 11:
                z0(z14, str, d14);
                double dC0 = c0(str8);
                GCMComplexTwoLineButton gCMComplexTwoLineButton5 = this.E;
                v0(gCMComplexTwoLineButton5, N(gCMComplexTwoLineButton5, dC0));
                break;
            case 12:
            case 36:
                map.put(str, Double.valueOf(n1(d14)));
                GCMComplexTwoLineButton gCMComplexTwoLineButton6 = this.f113804m0;
                if (gCMComplexTwoLineButton6 != null) {
                    Context context2 = gCMComplexTwoLineButton6.getContext();
                    v0(this.f113804m0, c22.l3.h(context2, c0("po2MaxValue"), context2.getString(R.string.lbl_bar)));
                }
                GCMComplexTwoLineButton gCMComplexTwoLineButton7 = this.f113800l0;
                if (gCMComplexTwoLineButton7 != null) {
                    Context context3 = gCMComplexTwoLineButton7.getContext();
                    v0(this.f113800l0, c22.l3.h(context3, c0(str4), context3.getString(R.string.lbl_bar)));
                }
                break;
            case 13:
                c22.q3 q3Var3 = z15 ? c22.q3.KILOMETER_PER_HOUR : c22.q3.MILE_PER_HOUR;
                c22.q3 q3Var4 = c22.q3.METERS_PER_SECOND;
                c22.l3.f23124b.getClass();
                double dW2 = c22.l3.a.w(d14, q3Var3, q3Var4);
                map.put("racingMaxSpeed", Double.isNaN(dW2) ? null : Double.valueOf(dW2));
                StringBuilder sbI = sn.a.i(c22.l3.a.N0(context, dW2, q3Var3, c22.l3.n(), false, null), StringUtils.SPACE);
                sbI.append(context.getString(j0()));
                v0(this.S, sbI.toString());
                break;
            case 14:
                z0(z14, str, d14);
                double dC1 = c0("maxAscent");
                GCMComplexTwoLineButton gCMComplexTwoLineButton8 = this.D;
                v0(gCMComplexTwoLineButton8, N(gCMComplexTwoLineButton8, dC1));
                break;
            case 15:
                double dN3 = n1(d14);
                map.put(str, Double.valueOf(dN3));
                w0(this.J0, Long.toString(Math.round(dN3)), context.getString(R.string.no_value));
                break;
            case 16:
                z0(z14, str, d14);
                double dC2 = c0("avgAscent");
                GCMComplexTwoLineButton gCMComplexTwoLineButton9 = this.C;
                v0(gCMComplexTwoLineButton9, N(gCMComplexTwoLineButton9, dC2));
                break;
            case 17:
                map.put(str, Double.valueOf(d14));
                f1((int) d14);
                break;
            case 19:
                double dN4 = n1(d14);
                map.put(str, Double.valueOf(dN4));
                v0(this.f113836w, O(context, dN4));
                break;
            case 20:
                map.put(str, Double.valueOf(d14));
                if (o1(d14)) {
                    M0(d14);
                }
                U0(this.f113772e0, d14);
                U0(this.f113816p0, d14);
                break;
            case 21:
                double dN5 = n1(d14);
                map.put(str, Double.valueOf(dN5));
                v0(this.f113808n0, Double.isNaN(dN5) ? context.getString(R.string.no_value) : n(context, dN5));
                break;
            case 22:
                map.put(str, Double.valueOf(d14));
                v0(this.Q0, m(d14, context, this.f113770d2));
                break;
            case 23:
                double dN6 = n1(d14);
                map.put(str, Double.valueOf(dN6));
                v0(this.Y, n(context, dN6));
                v0(this.f113825s0, n(context, dN6));
                break;
            case 25:
                c22.q3 q3VarK0 = k0();
                c22.q3 q3Var5 = c22.q3.METERS_PER_SECOND;
                c22.l3.f23124b.getClass();
                double dW3 = c22.l3.a.w(d14, q3VarK0, q3Var5);
                map.put("max_speed", Double.isNaN(dW3) ? null : Double.valueOf(dW3));
                S0();
                break;
            case 27:
                double dN7 = n1(d14);
                map.put(str, Double.valueOf(dN7));
                GCMComplexTwoLineButton gCMComplexTwoLineButton10 = this.f113833v;
                v0(gCMComplexTwoLineButton10, O(gCMComplexTwoLineButton10.getContext(), dN7));
                break;
            case 28:
                map.put(str, Double.valueOf(d14));
                c();
                break;
            case 29:
                map.put(str, Double.valueOf(d14));
                U0(this.O0, d14);
                break;
            case 30:
                map.put(str, Double.valueOf(d14));
                v0(this.f113776f0, n(context, d14));
                break;
            case 31:
            case 44:
            case 45:
                f0Var = this;
                map.put(str, Double.valueOf(d14));
                GCMComplexTwoLineButton gCMComplexTwoLineButton11 = f0Var.C0;
                if (gCMComplexTwoLineButton11 != null && f0Var.D0 != null) {
                    Context context4 = gCMComplexTwoLineButton11.getContext();
                    x0(context4, gCMComplexTwoLineButton11, f0Var.c0("calories_burned"));
                    x0(context4, f0Var.D0, f0Var.c0("calories_consumed"));
                    double dC3 = f0Var.c0("calories_burned");
                    double dC4 = f0Var.c0("calories_consumed");
                    boolean zIsNaN = Double.isNaN(dC3);
                    GCMComplexTwoLineButton gCMComplexTwoLineButton12 = f0Var.E0;
                    if (zIsNaN || Double.isNaN(dC4)) {
                        v0(gCMComplexTwoLineButton12, context4.getString(R.string.no_value));
                    } else {
                        v0(gCMComplexTwoLineButton12, c22.l3.a(context4, dC3, dC4, true));
                    }
                }
                break;
            case 32:
                double dN8 = n1(d14);
                map.put(str, Double.valueOf(dN8));
                w0(this.M0, Long.toString(Math.round(dN8)), context.getString(R.string.no_value));
                break;
            case 33:
                double dN9 = n1(d14);
                map.put(str, Double.valueOf(dN9));
                w0(this.L0, Long.toString(Math.round(dN9)), context.getString(R.string.no_value));
                break;
            case 34:
                map.put(str, Double.valueOf(d14));
                U0(this.X, d14);
                break;
            case 35:
            case 41:
                map.put(str, Double.valueOf(d14));
                d();
                break;
            case 37:
                double dN10 = n1(d14);
                map.put(str, Double.valueOf(dN10));
                GCMComplexTwoLineButton gCMComplexTwoLineButton13 = this.K;
                v0(gCMComplexTwoLineButton13, M(gCMComplexTwoLineButton13, dN10));
                break;
            case 38:
                f0Var = this;
                map.put(str, Double.valueOf(d14));
                boolean zP = am.z0.P(f0Var.J1.f4358a);
                GCMComplexTwoLineButton gCMComplexTwoLineButton14 = f0Var.S0;
                if (!zP) {
                    if (!am.z0.b(am.x0.R0, f0Var.J1.f4358a)) {
                        if (f0Var.o1(f0Var.c0(str3) + d14)) {
                            f0Var.U0(gCMComplexTwoLineButton14, d14);
                            f0Var.M0(f0Var.c0("restSplitsDuration") + f0Var.c0(str3));
                        }
                    } else if (f0Var.o1(f0Var.c0("activeSplitsIdleDuration") + f0Var.c0("activeSplitsMovingDuration") + d14)) {
                        f0Var.U0(gCMComplexTwoLineButton14, d14);
                        f0Var.M0(f0Var.c0("restSplitsDuration") + f0Var.c0("activeSplitsIdleDuration") + f0Var.c0("activeSplitsMovingDuration"));
                    }
                } else if (f0Var.o1(f0Var.c0("activeSplitsIdleDuration") + f0Var.c0("activeSplitsMovingDuration") + d14)) {
                    f0Var.U0(gCMComplexTwoLineButton14, d14);
                    f0Var.M0(f0Var.c0("restSplitsDuration") + f0Var.c0("activeSplitsIdleDuration") + f0Var.c0("activeSplitsMovingDuration"));
                }
                break;
            case 39:
                map.put(str, Double.valueOf(d14));
                U0(this.f113819q0, d14);
                break;
            case 40:
                f0Var = this;
                map.put(str, Double.valueOf(d14));
                if (f0Var.o1(f0Var.c0("restSplitsDuration") + f0Var.c0("activeSplitsMovingDuration") + d14)) {
                    f0Var.U0(f0Var.U0, d14);
                    f0Var.M0(f0Var.c0("restSplitsDuration") + f0Var.c0("activeSplitsIdleDuration") + f0Var.c0("activeSplitsMovingDuration"));
                }
                break;
            case 42:
                double dN11 = n1(d14);
                map.put(str, Double.valueOf(dN11));
                v0(null, O(context, dN11));
                break;
            case 43:
                f0Var = this;
                map.put(str, Double.valueOf(d14));
                if (f0Var.o1(f0Var.c0("restSplitsDuration") + f0Var.c0("activeSplitsIdleDuration") + d14)) {
                    f0Var.U0(f0Var.T0, d14);
                    f0Var.M0(f0Var.c0("restSplitsDuration") + f0Var.c0("activeSplitsIdleDuration") + f0Var.c0("activeSplitsMovingDuration"));
                }
                break;
            case 46:
                if (this.f113767d) {
                    map.put("max_speed", Double.isNaN(d14) ? null : Double.valueOf(d14));
                    this.f113767d = false;
                } else {
                    am.x0 x0Var = this.J1;
                    f12.l.f68084a.getClass();
                    double dA = q3.a(d14, x0Var, f12.l.a.a().y());
                    map.put("max_speed", Double.isNaN(dA) ? null : Double.valueOf(dA));
                }
                S0();
                break;
            case 47:
                c22.q3 q3Var6 = z15 ? c22.q3.KILOMETER_PER_HOUR : c22.q3.MILE_PER_HOUR;
                c22.q3 q3Var7 = c22.q3.METERS_PER_SECOND;
                c22.l3.f23124b.getClass();
                double dW4 = c22.l3.a.w(d14, q3Var6, q3Var7);
                map.put("racingMinSpeed", Double.isNaN(dW4) ? null : Double.valueOf(dW4));
                StringBuilder sbI2 = sn.a.i(c22.l3.a.N0(context, dW4, q3Var6, c22.l3.n(), false, null), StringUtils.SPACE);
                sbI2.append(context.getString(j0()));
                v0(this.T, sbI2.toString());
                break;
            case 48:
                double dN12 = n1(d14);
                map.put(str, Double.valueOf(dN12));
                v0(this.f113812o0, Double.isNaN(dN12) ? context.getString(R.string.no_value) : n(context, dN12));
                break;
            case 50:
                map.put(str, Double.valueOf(d14));
                long j8 = (long) d14;
                GCMComplexTwoLineButton gCMComplexTwoLineButton15 = this.R;
                if (gCMComplexTwoLineButton15 != null) {
                    String string = gCMComplexTwoLineButton15.getContext().getString(R.string.no_duration_value);
                    if (j8 != 0) {
                        string = gCMComplexTwoLineButton15.getContext().getString(R.string.race_lap_time_format_to_millis_edit, Long.valueOf((j8 / 60000) % 60), Long.valueOf((j8 / 1000) % 60), Long.valueOf(j8 % 1000));
                    }
                    v0(gCMComplexTwoLineButton15, string);
                    I0();
                }
                break;
            case 51:
                z0(z14, str, d14);
                double dC5 = c0("elevation_gain");
                GCMComplexTwoLineButton gCMComplexTwoLineButton16 = this.A;
                v0(gCMComplexTwoLineButton16, N(gCMComplexTwoLineButton16, dC5));
                break;
            case 52:
                z0(z14, str, d14);
                double dC6 = c0("elevation_loss");
                GCMComplexTwoLineButton gCMComplexTwoLineButton17 = this.B;
                v0(gCMComplexTwoLineButton17, N(gCMComplexTwoLineButton17, dC6));
                break;
            case 53:
                map.put(str, Double.valueOf(d14));
                v0(this.f113768d0, m(d14, context, this.f113766c2));
                v0(this.A0, m(d14, context, this.f113766c2));
                break;
            case 54:
                double dN13 = n1(d14);
                map.put(str, Double.valueOf(dN13));
                GCMComplexTwoLineButton gCMComplexTwoLineButton18 = this.Z;
                v0(gCMComplexTwoLineButton18, U(gCMComplexTwoLineButton18, dN13));
                GCMComplexTwoLineButton gCMComplexTwoLineButton19 = this.f113837w0;
                v0(gCMComplexTwoLineButton19, U(gCMComplexTwoLineButton19, dN13));
                break;
            default:
                break;
        }
    }

    public final void f(boolean z14) {
        boolean z15 = false;
        k(false);
        i(this.f113816p0, z14);
        i(this.f113819q0, z14);
        i(this.f113822r0, z14);
        i(this.U, !((f12.b) KoinJavaComponent.get(f12.b.class)).f() && z14);
        if (!((f12.b) KoinJavaComponent.get(f12.b.class)).f() && z14) {
            z15 = true;
        }
        i(this.V, z15);
        i(this.f113825s0, z14);
        i(this.f113828t0, z14);
        i(this.f113831u0, z14);
        i(this.f113834v0, z14);
        i(this.f113837w0, z14);
        i(this.f113840x0, z14);
        i(this.f113843y0, z14);
        i(this.f113846z0, z14);
        i(this.A0, z14);
        i(this.f113780g0, z14);
        i(this.f113784h0, z14);
        i(this.f113788i0, z14);
    }

    public final double f0() {
        return c0("packWeight");
    }

    public final void f1(int i14) {
        this.O1 = i14;
        v0(this.f113830u, Integer.toString(i14));
        K0();
    }

    public final double g0(String str) {
        String str2 = this.J1.f4358a;
        am.z0 z0Var = am.z0.f4390a;
        boolean zB = am.z0.b(am.x0.f4312o, str2);
        boolean zB2 = am.z0.b(am.x0.f4316p, this.J1.f4358a);
        boolean zJ = am.z0.J(this.J1.f4358a);
        boolean zL = am.z0.L(this.J1.f4358a);
        if (zB || zB2 || zJ || zL) {
            return c0(str);
        }
        return Double.NaN;
    }

    public final void g1() {
        com.garmin.android.apps.connectmobile.activities.newmodel.h hVar = this.f113778f2;
        if (hVar != null && hVar.f29460m != null) {
            String str = this.J1.f4358a;
            am.z0 z0Var = am.z0.f4390a;
            if (!am.z0.b(am.x0.f4352y2, str)) {
                if (!am.z0.b(am.x0.O1, this.J1.f4358a)) {
                    com.garmin.android.apps.connectmobile.activities.newmodel.i0 i0Var = this.f113778f2.f29460m;
                    double d14 = i0Var.f29549t;
                    double d15 = i0Var.f29546r2;
                    double d16 = i0Var.f29559w2;
                    double d17 = i0Var.f29562x2;
                    Context context = this.f113807n.getContext();
                    x0(context, this.C0, d14);
                    x0(context, this.D0, d15);
                    boolean zIsNaN = Double.isNaN(d14);
                    GCMComplexTwoLineButton gCMComplexTwoLineButton = this.E0;
                    if (zIsNaN || Double.isNaN(d15)) {
                        v0(gCMComplexTwoLineButton, context.getString(R.string.no_value));
                    } else {
                        v0(gCMComplexTwoLineButton, c22.l3.a(context, d14, d15, true));
                    }
                    y0(context, this.G0, d17);
                    y0(context, this.F0, d16);
                    boolean zIsNaN2 = Double.isNaN(d16);
                    GCMComplexTwoLineButton gCMComplexTwoLineButton2 = this.H0;
                    if (zIsNaN2 || Double.isNaN(d17)) {
                        v0(gCMComplexTwoLineButton2, context.getString(R.string.lbl_unit_milliliter_abr));
                        return;
                    } else {
                        v0(gCMComplexTwoLineButton2, c22.l3.a(context, d16, d17, false));
                        return;
                    }
                }
            }
        }
        d();
    }

    public final double h0() {
        return c0("racingMaxSpeed");
    }

    public final void h1(double d14, boolean z14, boolean z15) {
        double dQ1;
        this.f113762b2 = z14;
        if (!z15 && Double.isNaN(d14)) {
            d14 = 0.0d;
        }
        if (Double.isNaN(d14)) {
            dQ1 = Double.NaN;
        } else {
            c22.l3.f23124b.getClass();
            dQ1 = c22.l3.a.Q1((long) d14, z14);
        }
        GCMComplexTwoLineButton gCMComplexTwoLineButton = z15 ? this.f113785h1 : this.f113781g1;
        this.Z1.put("packWeight", Double.valueOf(dQ1));
        v0(gCMComplexTwoLineButton, P(d14, this.f113773e1.getContext(), z14));
    }

    public final int i0(boolean z14) {
        if (am.z0.c(this.J1.f4358a)) {
            return z14 ? am.z0.b(am.x0.R0, this.J1.f4358a) ? R.string.activity_details_max_descent_speed : R.string.activity_details_max_speed : R.string.lbl_avg_speed;
        }
        return z14 ? R.string.activity_details_best_pace : R.string.lbl_avg_pace;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0091  */
    public final void i1(GCMComplexTwoLineButton gCMComplexTwoLineButton) {
        Context context;
        String strQ0;
        Context context2 = gCMComplexTwoLineButton.getContext();
        double dA = a();
        if (am.z0.c(this.J1.f4358a)) {
            c22.q3 q3VarK0 = k0();
            DecimalFormat decimalFormatN = c22.l3.n();
            c22.l3.f23124b.getClass();
            String strM0 = c22.l3.a.M0(context2, dA, q3VarK0, decimalFormatN, false);
            context = context2;
            strQ0 = strM0;
        } else if (am.z0.I(this.J1.f4358a)) {
            context = context2;
            c22.l3.a aVar = c22.l3.f23124b;
            aVar.getClass();
            strQ0 = aVar.q0(context, c22.l3.a.o(dA), this.f113790i2, false);
        } else if (am.z0.Q(this.J1.f4358a)) {
            context = context2;
            context = context2;
            context = context2;
            c22.l3.a aVar2 = c22.l3.f23124b;
            aVar2.getClass();
            strQ0 = aVar2.q0(context, c22.l3.a.q(dA), this.f113790i2, false);
        } else {
            if (am.z0.b(am.x0.f4301l1, this.J1.f4358a)) {
                context = context2;
                context = context2;
                context = context2;
                c22.l3.a aVar3 = c22.l3.f23124b;
                aVar3.getClass();
                strQ0 = aVar3.q0(context, c22.l3.a.q(dA), this.f113790i2, false);
            } else {
                if (am.z0.b(am.x0.f4297k1, this.J1.f4358a)) {
                    context = context2;
                    context = context2;
                    context = context2;
                    c22.l3.a aVar4 = c22.l3.f23124b;
                    aVar4.getClass();
                    strQ0 = aVar4.q0(context, c22.l3.a.q(dA), this.f113790i2, false);
                } else {
                    context = context2;
                    boolean zB = am.z0.b(am.x0.f4324r, this.J1.f4358a);
                    c22.l3.a aVar5 = c22.l3.f23124b;
                    aVar5.getClass();
                    context.getClass();
                    strQ0 = aVar5.I1(dA, "", new l22.a(context), zB, this.f113794j2, false);
                }
            }
        }
        boolean zJ = am.z0.J(this.J1.f4358a);
        StringBuilder sbI = sn.a.i(strQ0, StringUtils.SPACE);
        sbI.append(context.getString(j0()));
        String string = sbI.toString();
        gCMComplexTwoLineButton.setButtonTopLabel(context.getString(zJ ? R.string.activity_details_average_nautical_sog : i0(false)));
        v0(gCMComplexTwoLineButton, string);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x006d  */
    /* JADX WARN: Code duplicated, block: B:23:0x008c  */
    public final void j(boolean z14, boolean z15) {
        boolean z16;
        boolean z17;
        boolean zP = am.z0.P(this.J1.f4358a);
        boolean zO = am.z0.o(this.J1.f4358a);
        boolean zV = am.z0.v(this.J1.f4358a);
        boolean zB = am.z0.b(am.x0.f4352y2, this.J1.f4358a);
        boolean zB2 = am.z0.b(am.x0.f4356z2, this.J1.f4358a);
        boolean z18 = (!am.z0.b(am.x0.f4350y, this.J1.f4358a) || am.z0.d0(this.J1.f4358a) || am.z0.F(this.J1.f4358a)) ? false : true;
        boolean zX = am.z0.X(this.J1.f4358a);
        if (this.f113778f2 == null) {
            if (am.z0.b(am.x0.f4268a3, this.J1.f4358a)) {
                z16 = true;
            } else {
                z16 = false;
            }
        } else {
            z16 = false;
        }
        if (this.f113778f2 == null) {
            if (!am.z0.b(am.x0.Y2, this.J1.f4358a)) {
                if (!am.z0.b(am.x0.Z2, this.J1.f4358a)) {
                    z17 = false;
                }
            }
            z17 = true;
        } else {
            z17 = false;
        }
        boolean z19 = z15 || (z14 && (!zP && !zO && !zV && !zB && !zB2 && !z18 && !zX && !am.z0.a0(this.J1.f4358a) && !z16 && !z17 && !am.z0.L(this.J1.f4358a) && !am.z0.b(am.x0.O1, this.J1.f4358a)));
        this.E0.setEnabled(false);
        this.H0.setEnabled(false);
        this.B0.setVisibility(z19 ? 0 : 8);
        i(this.C0, z19);
        i(this.D0, z19);
        i(this.E0, z19);
        i(this.F0, z19);
        i(this.G0, z19);
        i(this.H0, z19);
        i(this.f113807n, !z19 && z14);
    }

    public final int j0() {
        if (am.z0.c(this.J1.f4358a)) {
            return k0().f23223e;
        }
        return q3.b(this.J1, am.z0.b(am.x0.f4324r, this.J1.f4358a) ? this.f113794j2 : this.f113790i2);
    }

    public final void j1() {
        ps.o1 o1Var;
        GCMComplexTwoLineButton gCMComplexTwoLineButton = this.f113799l;
        if (gCMComplexTwoLineButton != null && gCMComplexTwoLineButton.isVisible()) {
            i1(gCMComplexTwoLineButton);
        }
        GCMComplexTwoLineButton gCMComplexTwoLineButton2 = this.f113795k;
        if (gCMComplexTwoLineButton2 != null) {
            i1(gCMComplexTwoLineButton2);
        }
        GCMComplexTwoLineButton gCMComplexTwoLineButton3 = this.W0;
        boolean z14 = this.f113790i2;
        if (gCMComplexTwoLineButton3 != null) {
            Context context = gCMComplexTwoLineButton3.getContext();
            double dA = a();
            c22.q3 q3Var = z14 ? c22.q3.KILOMETER_PER_HOUR : c22.q3.MILE_PER_HOUR;
            DecimalFormat decimalFormatN = c22.l3.n();
            c22.l3.f23124b.getClass();
            StringBuilder sbI = sn.a.i(c22.l3.a.M0(context, dA, q3Var, decimalFormatN, false), StringUtils.SPACE);
            sbI.append(context.getString(j0()));
            String string = sbI.toString();
            B0(gCMComplexTwoLineButton3, context.getString(i0(false)));
            v0(gCMComplexTwoLineButton3, string);
        }
        GCMComplexTwoLineButton gCMComplexTwoLineButton4 = this.f113803m;
        if (gCMComplexTwoLineButton4 == null || !gCMComplexTwoLineButton4.isVisible()) {
            return;
        }
        double dA2 = a();
        com.garmin.android.apps.connectmobile.activities.newmodel.h hVar = this.f113778f2;
        if (hVar != null) {
            String str = hVar.C().f4358a;
            am.z0 z0Var = am.z0.f4390a;
            if (am.z0.b(am.x0.R0, str) && (o1Var = (ps.o1) this.f113778f2.f29464q.stream().filter(new im.c(3)).findFirst().orElse(null)) != null && o1Var.getAverageSpeed() != null && !Double.isNaN(o1Var.getAverageSpeed().doubleValue())) {
                dA2 = o1Var.getAverageSpeed().doubleValue();
            }
        }
        double d14 = dA2;
        Context context2 = gCMComplexTwoLineButton4.getContext();
        c22.q3 q3Var2 = z14 ? c22.q3.KILOMETER_PER_HOUR : c22.q3.MILE_PER_HOUR;
        DecimalFormat decimalFormatN2 = c22.l3.n();
        c22.l3.f23124b.getClass();
        StringBuilder sbI2 = sn.a.i(c22.l3.a.M0(context2, d14, q3Var2, decimalFormatN2, false), StringUtils.SPACE);
        sbI2.append(context2.getString(j0()));
        String string2 = sbI2.toString();
        B0(gCMComplexTwoLineButton4, context2.getString(i0(false)));
        v0(gCMComplexTwoLineButton4, string2);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00a9  */
    public final void k(boolean z14) {
        i(this.Q, z14);
        i(this.X, z14);
        i(this.Y, z14);
        i(this.Z, z14);
        i(this.f113756a0, z14);
        i(this.f113760b0, z14);
        i(this.f113764c0, z14);
        i(this.f113768d0, z14);
        i(this.f113772e0, z14);
        i(this.U, !((f12.b) KoinJavaComponent.get(f12.b.class)).f() && z14);
        i(this.V, !((f12.b) KoinJavaComponent.get(f12.b.class)).f() && z14);
        String str = this.J1.f4358a;
        am.z0 z0Var = am.z0.f4390a;
        am.x0 x0Var = am.x0.X;
        boolean zB = am.z0.b(x0Var, str);
        GCMComplexTwoLineButton gCMComplexTwoLineButton = this.W;
        GCMComplexTwoLineButton gCMComplexTwoLineButton2 = this.f113818q;
        if (zB) {
            i(gCMComplexTwoLineButton2, z14);
            i(gCMComplexTwoLineButton, z14);
        } else {
            if (am.z0.b(am.x0.P, this.J1.f4358a)) {
                i(gCMComplexTwoLineButton2, z14);
                i(gCMComplexTwoLineButton, z14);
            } else {
                if (am.z0.b(am.x0.I, this.J1.f4358a)) {
                    i(gCMComplexTwoLineButton2, z14);
                    i(gCMComplexTwoLineButton, z14);
                } else {
                    if (am.z0.b(am.x0.T, this.J1.f4358a) || am.x0.D.f4358a.equalsIgnoreCase(this.J1.f4358a)) {
                        i(gCMComplexTwoLineButton2, z14);
                        i(gCMComplexTwoLineButton, z14);
                    } else {
                        i(gCMComplexTwoLineButton2, false);
                        i(gCMComplexTwoLineButton, false);
                    }
                }
            }
        }
        i(this.f113776f0, z14);
        i(this.f113780g0, z14);
        i(this.f113784h0, z14);
        i(this.f113788i0, z14);
        i(this.f113792j0, z14);
        i(this.f113796k0, z14);
        boolean zB2 = am.z0.b(x0Var, this.J1.f4358a);
        i(this.f113804m0, z14 && zB2);
        i(this.f113800l0, z14 && zB2);
        i(this.f113808n0, z14 && zB2);
        i(this.f113812o0, z14 && zB2);
    }

    public final c22.q3 k0() {
        com.garmin.android.apps.connectmobile.activities.newmodel.p pVar;
        boolean zI = am.z0.I(this.J1.f4358a);
        boolean zB = am.z0.b(am.x0.O1, this.J1.f4358a);
        if (zI) {
            return c22.q3.NAUTICAL_MILES_PER_HOUR;
        }
        if (!zB) {
            return this.f113790i2 ? c22.q3.KILOMETER_PER_HOUR : c22.q3.MILE_PER_HOUR;
        }
        com.garmin.android.apps.connectmobile.activities.newmodel.h hVar = this.f113778f2;
        return ss.k.a((hVar == null || (pVar = hVar.f29466t) == null) ? null : pVar.getSpeedDisplayMeasure()).f29425a;
    }

    public final void k1(String str) {
        boolean zEquals = this.f113760b0.getContext().getString(R.string.lbl_dive_no_suit).equals(str);
        GCMComplexTwoLineButton gCMComplexTwoLineButton = this.f113764c0;
        if (!zEquals) {
            gCMComplexTwoLineButton.setEnabled(true);
            this.f113764c0.setClickable(true);
            this.f113846z0.setEnabled(true);
            this.f113846z0.setClickable(true);
            return;
        }
        gCMComplexTwoLineButton.setEnabled(false);
        this.f113764c0.setClickable(false);
        this.f113846z0.setEnabled(false);
        this.f113846z0.setClickable(false);
        e1(false, "suit_thickness", 0.0d);
    }

    public final double l0() {
        return c0("splitsCount");
    }

    public final void l1(String str, String str2) {
        boolean zIsEmpty = TextUtils.isEmpty(str2);
        GCMComplexTwoLineButton gCMComplexTwoLineButton = this.F;
        GCMComplexTwoLineButton gCMComplexTwoLineButton2 = this.H;
        byte b14 = 2;
        GCMComplexTwoLineButton gCMComplexTwoLineButton3 = this.G;
        if (!zIsEmpty) {
            try {
                double d14 = Double.parseDouble(str2);
                f12.l.f68084a.getClass();
                if (!f12.l.a.a().c()) {
                    c22.l3.f23124b.getClass();
                    d14 = c22.l3.a.d(d14);
                }
                if (d14 >= -140.0d && d14 <= 150.0d) {
                    if ("max_temperature".equalsIgnoreCase(str) || "min_temperature".equalsIgnoreCase(str) || "average_temperature".equalsIgnoreCase(str)) {
                        double d15 = !TextUtils.isEmpty(str2) ? Double.parseDouble(str2) : Double.NaN;
                        str.getClass();
                        switch (str.hashCode()) {
                            case -1829121255:
                                b14 = !str.equals("max_temperature") ? (byte) -1 : (byte) 0;
                                break;
                            case -1024410030:
                                b14 = !str.equals("average_temperature") ? (byte) -1 : (byte) 1;
                                break;
                            case 1355407111:
                                if (!str.equals("min_temperature")) {
                                    b14 = -1;
                                }
                                break;
                            default:
                                b14 = -1;
                                break;
                        }
                        switch (b14) {
                            case 0:
                                A0(d15, str);
                                v0(gCMComplexTwoLineButton3, T(gCMComplexTwoLineButton3, c0("max_temperature")));
                                break;
                            case 1:
                                A0(d15, str);
                                v0(gCMComplexTwoLineButton, T(gCMComplexTwoLineButton, c0("average_temperature")));
                                break;
                            case 2:
                                A0(d15, str);
                                v0(gCMComplexTwoLineButton2, T(gCMComplexTwoLineButton2, c0("min_temperature")));
                                break;
                        }
                    }
                    return;
                }
            } catch (NumberFormatException unused) {
            }
        }
        Context context = gCMComplexTwoLineButton3.getContext();
        f12.l.f68084a.getClass();
        String string = context.getString(f12.l.a.a().c() ? R.string.lbl_fahrenheit : R.string.lbl_celsius);
        str.getClass();
        switch (str.hashCode()) {
            case -1829121255:
                b14 = !str.equals("max_temperature") ? (byte) -1 : (byte) 0;
                break;
            case -1024410030:
                b14 = !str.equals("average_temperature") ? (byte) -1 : (byte) 1;
                break;
            case 1355407111:
                if (!str.equals("min_temperature")) {
                    b14 = -1;
                }
                break;
            default:
                b14 = -1;
                break;
        }
        switch (b14) {
            case 0:
                v0(gCMComplexTwoLineButton3, string);
                break;
            case 1:
                v0(gCMComplexTwoLineButton, string);
                break;
            case 2:
                v0(gCMComplexTwoLineButton2, string);
                break;
        }
    }

    public final double m0() {
        return c0("splitsDuration");
    }

    public final void m1(double d14, boolean z14) {
        Context context = this.f113779g.getContext();
        this.f113762b2 = z14;
        this.Z1.put("weight", Double.valueOf(d14));
        v0(this.f113756a0, V(d14, context, z14));
        v0(this.f113840x0, V(d14, context, z14));
    }

    public final String n(Context context, double d14) {
        c22.l3.f23124b.getClass();
        String strE1 = c22.l3.a.E1(context, this.f113790i2, false);
        if (Double.isNaN(d14) || d14 == 0.0d) {
            return strE1;
        }
        return Math.round(d14) + StringUtils.SPACE + strE1;
    }

    public final double n0() {
        return c0("splitsMaxSpeed");
    }

    public final double o() {
        return c0("activeSplitsDuration");
    }

    public final double o0() {
        return c0("surface_interval");
    }

    public final boolean o1(double d14) {
        if (d14 <= 1800000.0d) {
            return true;
        }
        new androidx.appcompat.app.e.a(this.f113791j.getContext()).setMessage(this.f113791j.getContext().getString(R.string.activities_edit_activity_max_duration_error, 500)).setPositiveButton(R.string.lbl_ok, new jm0.c(18)).create().show();
        return false;
    }

    public final double p() {
        return c0("activeSplitsIdleDuration");
    }

    public final double p0() {
        return c0("totalAscent");
    }

    public final double q() {
        if (am.z0.i0(this.J1.f4358a)) {
            double d14 = this.R1;
            c22.m3 m3Var = c22.m3.NAUTICAL;
            c22.m3 m3Var2 = c22.m3.METER;
            c22.l3.f23124b.getClass();
            return c22.l3.a.g(d14, m3Var, m3Var2);
        }
        if (this.J1 != am.x0.f4313o1) {
            return ar.b.a(this.R1, this.S1.f113907a);
        }
        String str = this.N1;
        if (str == null) {
            return ar.b.a(this.R1, (this.f113790i2 ? e.METER : e.YARD).f113854a);
        }
        return ar.b.a(this.R1, str);
    }

    public final boolean q0() {
        return this.f113758a2.get("deco_dive").booleanValue();
    }

    public final Double r() {
        double d14 = this.V1;
        if (d14 != Double.NaN) {
            return Double.valueOf(d14);
        }
        return null;
    }

    public final boolean r0() {
        return this.f113817p1 && this.f113820q1;
    }

    public final Double s() {
        double d14 = this.W1;
        if (d14 != Double.NaN) {
            return Double.valueOf(d14);
        }
        return null;
    }

    public final boolean s0() {
        com.garmin.android.apps.connectmobile.activities.newmodel.h hVar;
        ArrayList arrayList;
        com.garmin.android.apps.connectmobile.activities.newmodel.h hVar2;
        ArrayList arrayList2;
        String str = this.J1.f4358a;
        am.z0 z0Var = am.z0.f4390a;
        return (am.z0.b(am.x0.D2, str) || (am.z0.b(am.x0.C2, this.J1.f4358a) && this.f113782g2) || (am.z0.P(this.J1.f4358a) && (hVar2 = this.f113778f2) != null && (arrayList2 = hVar2.f29464q) != null && fr.a.d(arrayList2, qs.x.SKI_RUN, qs.x.SKI_LIFT)) || (am.z0.b(am.x0.R0, this.J1.f4358a) && (hVar = this.f113778f2) != null && (arrayList = hVar.f29464q) != null && fr.a.d(arrayList, qs.x.DOWNHILL_RUN, qs.x.DOWNHILL_LIFT)) || (am.z0.b(am.x0.f4313o1, this.J1.f4358a) && this.F1)) ? false : true;
    }

    public final am.l t() {
        return this.H1;
    }

    public final boolean t0() {
        com.garmin.android.apps.connectmobile.activities.newmodel.i0 i0Var;
        Double dValueOf = Double.valueOf(c0("fluids_loss"));
        Double dValueOf2 = Double.valueOf(c0("fluids_consumed"));
        Double dValueOf3 = Double.valueOf(c0("calories_burned"));
        com.garmin.android.apps.connectmobile.activities.newmodel.h hVar = this.f113778f2;
        return (hVar != null && (i0Var = hVar.f29460m) != null && Double.isNaN(i0Var.f29559w2) && dValueOf2.isNaN() && dValueOf.isNaN() && dValueOf3.isNaN()) ? false : true;
    }

    public final Double u() {
        double d14 = this.T1;
        if (d14 != Double.NaN) {
            return Double.valueOf(d14);
        }
        return null;
    }

    public final void u0() {
        boolean z14 = this.f113823r1;
        ArrayList arrayList = this.f113829t1;
        HashSet hashSet = new HashSet(this.f113826s1);
        boolean zB = c22.s3.b();
        int i14 = mo.f.f119854a;
        ComposeView composeView = this.f113805m1;
        composeView.getClass();
        arrayList.getClass();
        a aVar = this.f113832u1;
        aVar.getClass();
        composeView.setVisibility(0);
        composeView.setContent(new z3.e(-416833679, true, new mo.b(z14, arrayList, hashSet, zB, aVar, 0)));
    }

    public final Double v() {
        double d14 = this.U1;
        if (d14 != Double.NaN) {
            return Double.valueOf(d14);
        }
        return null;
    }

    public final am.x0 w() {
        return this.J1;
    }

    public final double x() {
        String str = this.J1.f4358a;
        am.z0 z0Var = am.z0.f4390a;
        if (am.z0.b(am.x0.f4312o, str) || am.z0.J(this.J1.f4358a) || am.z0.L(this.J1.f4358a)) {
            return c0("average_cadence");
        }
        return Double.NaN;
    }

    public final double y() {
        String str = this.J1.f4358a;
        am.z0 z0Var = am.z0.f4390a;
        if (!am.z0.b(am.x0.f4308n, str)) {
            if (!am.z0.b(am.x0.f4316p, this.J1.f4358a)) {
                return Double.NaN;
            }
        }
        return c0("average_cadence");
    }

    public final double z() {
        return c0("avgAscent");
    }

    public final void z0(boolean z14, String str, double d14) {
        boolean zR = am.r1.r();
        HashMap<String, Double> map = this.Z1;
        if (zR || z14) {
            map.put(str, Double.valueOf(d14));
            return;
        }
        c22.m3 m3Var = c22.m3.FOOT;
        c22.m3 m3Var2 = c22.m3.METER;
        c22.l3.f23124b.getClass();
        map.put(str, Double.valueOf(Math.min(c22.l3.a.g(d14, m3Var, m3Var2), 27432.0d)));
    }

    public abstract class c implements View.OnClickListener {
        private c() {
        }

        public abstract void a(d dVar);

        @Override // android.view.View.OnClickListener
        public final void onClick(View view2) {
            d dVar = f0.this.C1;
            if (dVar != null) {
                a(dVar);
            }
        }

        public /* synthetic */ c(f0 f0Var, int i14) {
            this();
        }
    }

    public f0(Activity activity, Calendar calendar, am.x0 x0Var, boolean z14, d dVar) {
        this(activity, null, z14, calendar, dVar, false);
        this.J1 = x0Var;
        this.F1 = false;
    }
}
