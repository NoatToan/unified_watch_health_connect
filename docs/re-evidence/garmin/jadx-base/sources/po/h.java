package po;

import am.f2;
import am.r1;
import am.z0;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.location.Location;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.SparseIntArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.compose.ui.platform.ComposeView;
import c22.a1;
import c22.k2;
import c22.l3;
import c22.m3;
import c22.q3;
import c22.r2;
import com.daasuu.bl.BubbleLayout;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.connectiq.y0;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.l2;
import com.garmin.android.apps.connectmobile.map.GCMMapView;
import com.garmin.android.apps.connectmobile.map.MapOptionsContainer;
import com.garmin.android.apps.connectmobile.v2;
import com.google.android.gms.maps.model.LatLng;
import com.google.mlkit.common.MlKitException;
import dm.n0;
import gg1.o0;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import kotlin.w3;
import o53.e1;
import o53.s0;
import okhttp3.internal.Util;
import org.apache.commons.lang3.BooleanUtils;
import org.joda.time.DateTime;
import org.koin.java.KoinJavaComponent;
import p005kotlin.math.MathKt;
import ps.b1;
import ps.c1;
import ps.d1;
import ps.f1;
import ps.t1;
import ps.w0;
import ps.x0;
import ps.x1;
import ps.y1;

/* JADX INFO: loaded from: classes7.dex */
public class h extends xf1.d {
    public static final /* synthetic */ int E1 = 0;
    public View A;
    public String A1;
    public View B;
    public View C;
    public TextView D;
    public TextView E;
    public TextView F;
    public TextView H0;
    public TextView I;
    public TextView I0;
    public TextView J0;
    public TextView K0;
    public TextView L0;
    public MapOptionsContainer M0;
    public BubbleLayout N0;
    public TextView P;
    public boolean Q0;
    public boolean R0;
    public List<w0> S0;
    public TextView T;
    public com.garmin.android.apps.connectmobile.activities.newmodel.a T0;
    public ps.p U0;
    public List<x1> V0;
    public ps.m W0;
    public TextView X;
    public ps.h X0;
    public TextView Y;
    public to.f Y0;
    public TextView Z;
    public String[] Z0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public Long[] f138841a1;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public d1[] f138842b1;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public os.b f138843c1;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public boolean f138845e1;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public String f138846f1;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public int f138849i1;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public com.garmin.android.library.mapsdkadapter.f f138850j1;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public TextView f138851k0;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public com.garmin.android.library.mapsdkadapter.f f138852k1;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public c1 f138853l1;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public View f138864t;

    /* JADX INFO: renamed from: u1, reason: collision with root package name */
    public s f138866u1;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public View f138867v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public TextView f138869w;

    /* JADX INFO: renamed from: w1, reason: collision with root package name */
    public k32.n f138870w1;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ImageView f138871x;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    public ie2.c f138872x1;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public View f138873y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public View f138875z;

    /* JADX INFO: renamed from: z1, reason: collision with root package name */
    public Boolean f138876z1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.activities.newmodel.h f138857p = null;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public d f138859q = null;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public SparseIntArray f138861r = null;
    public boolean O0 = false;
    public boolean P0 = true;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public int f138844d1 = 1;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public boolean f138847g1 = false;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public com.garmin.android.library.mapsdkadapter.i.d f138848h1 = com.garmin.android.library.mapsdkadapter.i.d.GOOGLE;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    public boolean f138854m1 = false;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    public boolean f138855n1 = false;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    public boolean f138856o1 = false;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public boolean f138858p1 = true;

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    public boolean f138860q1 = true;

    /* JADX INFO: renamed from: r1, reason: collision with root package name */
    public int f138862r1 = -1;

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    public int f138863s1 = -1;

    /* JADX INFO: renamed from: t1, reason: collision with root package name */
    public final ArrayList f138865t1 = new ArrayList();

    /* JADX INFO: renamed from: v1, reason: collision with root package name */
    public final am.e f138868v1 = ((am.d) KoinJavaComponent.get(am.d.class)).Y();

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    public boolean f138874y1 = false;
    public final qw0.s B1 = (qw0.s) KoinJavaComponent.get$default(qw0.s.class, null, null, 6, null);
    public final a C1 = new a();
    public final g D1 = new g(this, 0);

    public class a {
        public a() {
        }

        public final void a(boolean z14) {
            int i14 = h.E1;
            h hVar = h.this;
            GCMMapView gCMMapView = hVar.f148291b;
            if (gCMMapView != null) {
                gCMMapView.getMapProxy().b(z14, Boolean.FALSE);
                hVar.M0.set3dEnabled(z14);
                String strM7 = hVar.m7();
                if (strM7 != null) {
                    hVar.B1.s(strM7, z14);
                }
            }
        }

        public final void b(com.garmin.android.library.mapsdkadapter.i.d dVar) {
            int i14 = h.E1;
            h hVar = h.this;
            GCMMapView gCMMapView = hVar.f148291b;
            if (gCMMapView != null) {
                hVar.f138848h1 = dVar;
                gCMMapView.a(dVar, hVar);
                hVar.f148294e = gCMMapView.getMapProxy();
                hVar.M0.set3dEnabled(gCMMapView.getMapProxy().f144584a.getB());
                gCMMapView.getMapProxy().b(gCMMapView.getMapProxy().f144584a.getB(), Boolean.FALSE);
                gCMMapView.getMapProxy().setMapType(hVar.f138844d1);
                qe2.h mapProxy = gCMMapView.getMapProxy();
                mapProxy.R(new po.d(hVar, mapProxy));
                String strM7 = hVar.m7();
                if (strM7 != null) {
                    hVar.B1.D(strM7, dVar);
                }
            }
            hVar.d7();
        }

        public final void c(qw0.v vVar, boolean z14) {
            h.this.x7(vVar, z14);
        }
    }

    public class b implements t13.d<v2<ps.k>> {
        public b() {
        }

        @Override // t13.d
        /* JADX INFO: renamed from: getContext */
        public final t13.g getF157466b() {
            x53.c cVar = s0.f129406a;
            return u53.o.f168762a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // t13.d
        public final void resumeWith(Object obj) {
            v2 v2Var = (v2) obj;
            h hVar = h.this;
            if (hVar.isAdded()) {
                if (v2Var instanceof v2.b) {
                    ps.k kVar = (ps.k) ((v2.b) v2Var).f47386a;
                    hVar.W0 = kVar.getPolylineDTO();
                    hVar.X0 = kVar.getHeatmapDTO();
                    hVar.d7();
                    return;
                }
                if (v2Var instanceof v2.a) {
                    Exception exc = ((v2.a) v2Var).f47383a;
                    i2.f(a2.ACTIVITIES, "ActivityMapFragment", "Error fetching activity polyline from GC: " + exc.getMessage());
                    Toast.makeText(hVar.getActivity(), R.string.txt_error_occurred, 0).show();
                }
            }
        }
    }

    public static /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f138879a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f138880b;

        static {
            int[] iArr = new int[qw0.v.values().length];
            f138880b = iArr;
            try {
                iArr[qw0.v.LAPS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f138880b[qw0.v.TIMING_GATES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f138880b[qw0.v.OBSTACLES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f138880b[qw0.v.JUMPS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[qs.p.values().length];
            f138879a = iArr2;
            try {
                iArr2[qs.p.ASCENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f138879a[qs.p.DESCENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public com.garmin.android.library.mapsdkadapter.q f138881a = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ArrayList<com.garmin.android.library.mapsdkadapter.p> f138882b = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ArrayList<ie2.j> f138883c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public ArrayList<ie2.j> f138884d = null;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public com.garmin.android.library.mapsdkadapter.l f138885e = null;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public ie2.t f138886f = null;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public qe2.k f138887g = null;
    }

    public class e implements com.garmin.android.library.mapsdkadapter.i.c {
        public e() {
        }

        @Override // com.garmin.android.library.mapsdkadapter.i.c
        public final void a(ie2.j jVar) {
        }

        @Override // com.garmin.android.library.mapsdkadapter.i.c
        public final View b(ie2.j jVar) {
            String strJ1;
            int i14;
            q3 q3Var;
            int i15;
            int i16;
            Context context;
            q3 q3Var2;
            int i17;
            int i18;
            int i19;
            int i24;
            int i25;
            int i26 = h.E1;
            h hVar = h.this;
            List<x0> listZ7 = hVar.z7();
            String title = jVar.getTitle();
            if (hVar.u7() && !hVar.f190663m && listZ7 != null && !TextUtils.isEmpty(title)) {
                if (title.startsWith("Jump")) {
                    int iIndexOf = jVar.getTitle().indexOf(hVar.getString(R.string.no_value_small));
                    if (iIndexOf != -1) {
                        int i27 = Integer.parseInt(title.substring(iIndexOf + 1));
                        List<w0> list = hVar.S0;
                        if (list != null) {
                            w0 w0Var = list.get(i27);
                            hVar.f138869w.setText(hVar.getString(R.string.lbl_title_jump));
                            Context context2 = hVar.getContext();
                            if (w0Var == null || context2 == null) {
                                i19 = 8;
                                i24 = 8;
                                i25 = 8;
                            } else {
                                l22.a aVar = new l22.a(context2);
                                sr.j jVar2 = new sr.j(aVar);
                                Double hangTime = w0Var.getHangTime();
                                l22.b bVar = jVar2.f160573a;
                                if (hangTime != null) {
                                    TextView textView = hVar.H0;
                                    ls.e eVar = ls.e.HANG_TIME;
                                    Double hangTime2 = w0Var.getHangTime();
                                    eVar.getClass();
                                    String strB = ss.k.b(eVar, bVar, hangTime2, 9);
                                    if (strB == null) {
                                        strB = "";
                                    }
                                    textView.setText(strB);
                                    i25 = 0;
                                } else {
                                    i25 = 8;
                                }
                                if (w0Var.getSpeed() != null) {
                                    hVar.J0.setText(new ns.w0(aVar, ((f12.l) KoinJavaComponent.get(f12.l.class)).y(), new ms.a0()).b(1, w0Var.getSpeed(), false));
                                    i24 = 0;
                                } else {
                                    i24 = 8;
                                }
                                if (w0Var.getDistance() != null) {
                                    TextView textView2 = hVar.F;
                                    ls.e eVar2 = ls.e.AVERAGE_DISTANCE_PER_STROKE;
                                    Double distance = w0Var.getDistance();
                                    eVar2.getClass();
                                    String strB2 = ss.k.b(eVar2, bVar, distance, 9);
                                    textView2.setText(strB2 != null ? strB2 : "");
                                    i19 = 0;
                                } else {
                                    i19 = 8;
                                }
                            }
                            hVar.D7(0, 0, 8);
                            hVar.f138875z.setVisibility(i25);
                            hVar.H0.setVisibility(i25);
                            hVar.I0.setVisibility(i25);
                            hVar.A.setVisibility(i24);
                            hVar.K0.setVisibility(i24);
                            hVar.J0.setVisibility(i24);
                            hVar.B.setVisibility(i19);
                            hVar.L0.setVisibility(i19);
                            hVar.F.setVisibility(i19);
                            hVar.f138873y.setVisibility(8);
                            hVar.D.setVisibility(8);
                            hVar.E.setVisibility(8);
                            hVar.C.setVisibility(8);
                            hVar.P.setVisibility(8);
                            hVar.I.setVisibility(8);
                        }
                    }
                } else if (title.startsWith("obstacle")) {
                    try {
                        h.E6(hVar, (x1) ((List) hVar.V0.stream().filter(new im.c(11)).collect(Collectors.toList())).get(Integer.parseInt(title.substring(8))));
                    } catch (NumberFormatException unused) {
                        i2.h("invalid obstacle index on tapped map marker");
                    }
                } else if (title.startsWith("transition")) {
                    try {
                        h.E6(hVar, hVar.V0.get(Integer.parseInt(title.substring(10))));
                    } catch (NumberFormatException unused2) {
                        i2.h("invalid index on tapped map marker");
                    }
                } else if (!hVar.f190665o.containsValue(title)) {
                    int size = Integer.parseInt(title);
                    int i28 = size >= 0 ? hVar.f138861r.get(size) : -1;
                    x0 x0Var = i28 >= 0 ? listZ7.get(i28) : null;
                    boolean zE = hVar.f138868v1.e();
                    if (hVar.f138857p != null && zE && "-1".equals(title) && listZ7.size() > 0) {
                        size = listZ7.size();
                        x0Var = listZ7.get(0).getLapIndex() == 1 ? listZ7.get(size - 1) : listZ7.get(0);
                    }
                    String strValueOf = String.valueOf(size);
                    Double dValueOf = Double.valueOf(Double.NaN);
                    hVar.f138871x.setImageDrawable(null);
                    Context context3 = hVar.getContext();
                    String strM7 = hVar.m7();
                    z0 z0Var = z0.f4390a;
                    boolean zB = z0.b(am.x0.f4324r, strM7);
                    if (x0Var != null && context3 != null) {
                        String str = hVar.f138857p.C().f4358a;
                        am.x0 x0Var2 = am.x0.D;
                        if (z0.b(x0Var2, str)) {
                            hVar.D7(8, 8, 0);
                            Context context4 = hVar.getContext();
                            if (context4 != null) {
                                hVar.T.setText(strValueOf);
                                hVar.X.setText(aq.a.W(context4, Double.valueOf(x0Var.getBottomTime() == null ? Double.NaN : x0Var.getBottomTime().doubleValue())));
                                double dDoubleValue = x0Var.getMaxDepth() == null ? Double.NaN : x0Var.getMaxDepth().doubleValue();
                                TextView textView3 = hVar.Y;
                                m3 m3VarB = ar.b.b(x0Var2, null);
                                DecimalFormat decimalFormatM = l3.m();
                                String string = hVar.getString(R.string.no_value);
                                l3.f23124b.getClass();
                                textView3.setText(l3.a.P(context4, dDoubleValue, m3VarB, decimalFormatM, true, string));
                                hVar.Z.setText(aq.a.W(context4, Double.valueOf(x0Var.getSurfaceInterval() == null ? Double.NaN : x0Var.getSurfaceInterval().doubleValue())));
                                hVar.f138851k0.setText(aq.a.w(new l22.a(context4), x0Var.getStartLatitude(), x0Var.getStartLongitude()));
                            }
                        } else if (z0.o(hVar.f138857p.C().f4358a)) {
                            hVar.D7(0, 0, 8);
                            hVar.r7();
                            Context context5 = hVar.getContext();
                            qs.p pVarS0 = x0Var.S0();
                            if (context5 != null && pVarS0 != null) {
                                hVar.f138869w.setText(context5.getString(R.string.string_space_dot_space_string_pattern, context5.getString(R.string.string_space_string_pattern, context5.getString(R.string.lbl_split), strValueOf), aq.a.a0(context5, x0Var.getDuration())));
                                int i29 = c.f138879a[pVarS0.ordinal()];
                                if (i29 == 1) {
                                    i17 = R.drawable.ic_arrow_up_filled;
                                    i18 = R.color.gcm_polyline_activity_lap_ascent;
                                } else if (i29 != 2) {
                                    i17 = 0;
                                    i18 = 0;
                                } else {
                                    i17 = R.drawable.ic_arrow_down_filled;
                                    i18 = R.color.gcm_polyline_activity_lap_descent;
                                }
                                hVar.f138871x.setImageResource(i17);
                                hVar.f138871x.setColorFilter(a7.b.getColor(hVar.f138869w.getContext(), i18));
                                hVar.f138873y.setVisibility(8);
                                hVar.F.setText(new r1(context5).e(x0Var.getDistance() == null ? Double.NaN : x0Var.getDistance().doubleValue(), hVar.Q0));
                                boolean z14 = pVarS0 == qs.p.ASCENT;
                                hVar.I.setText(z14 ? R.string.activities_ascent_label : R.string.activities_descent_label);
                                Double elevationGain = z14 ? x0Var.getElevationGain() : x0Var.getElevationLoss();
                                if (elevationGain != null) {
                                    dValueOf = elevationGain;
                                }
                                TextView textView4 = hVar.P;
                                double dDoubleValue2 = dValueOf.doubleValue();
                                f12.l.f68084a.getClass();
                                o0 o0VarG = f12.l.a.a().g();
                                l3.f23124b.getClass();
                                textView4.setText(l3.a.Y(context5, dDoubleValue2, o0VarG, true));
                                hVar.P.setVisibility(0);
                                hVar.I.setVisibility(0);
                            }
                        } else {
                            String str2 = hVar.f138857p.C().f4358a;
                            am.x0 x0Var3 = am.x0.R0;
                            boolean zB2 = z0.b(x0Var3, str2);
                            int i30 = R.string.lbl_avg_speed;
                            if (zB2) {
                                hVar.D7(0, 8, 8);
                                hVar.f138873y.setVisibility(0);
                                hVar.E.setVisibility(0);
                                hVar.D.setVisibility(0);
                                hVar.f138875z.setVisibility(0);
                                hVar.H0.setVisibility(0);
                                hVar.I0.setVisibility(0);
                                hVar.B.setVisibility(0);
                                hVar.F.setVisibility(0);
                                hVar.L0.setVisibility(0);
                                Context contextRequireContext = hVar.requireContext();
                                hVar.f138869w.setText(contextRequireContext.getString(R.string.string_space_dot_space_string_pattern, hVar.o7(strValueOf), aq.a.a0(contextRequireContext, x0Var.getDuration())));
                                String strN7 = h.n7(false, x0Var, contextRequireContext, hVar.f138857p.C().f4358a);
                                hVar.D.setText(R.string.lbl_distance);
                                hVar.E.setText(strN7);
                                double dDoubleValue3 = x0Var.getAverageSpeed() == null ? Double.NaN : x0Var.getAverageSpeed().doubleValue();
                                if (Double.isNaN(dDoubleValue3)) {
                                    context = contextRequireContext;
                                } else {
                                    if (z0.I(x0Var3.f4358a)) {
                                        q3Var2 = q3.NAUTICAL_MILES_PER_HOUR;
                                    } else {
                                        q3Var2 = am.j.z(f12.l.f68084a) ? q3.KILOMETER_PER_HOUR : q3.MILE_PER_HOUR;
                                    }
                                    q3 q3Var3 = q3Var2;
                                    DecimalFormat decimalFormatN = l3.n();
                                    l3.f23124b.getClass();
                                    String strM0 = l3.a.M0(contextRequireContext, dDoubleValue3, q3Var3, decimalFormatN, true);
                                    context = contextRequireContext;
                                    hVar.I0.setText(R.string.lbl_avg_speed);
                                    hVar.H0.setText(strM0);
                                }
                                hVar.L0.setText(R.string.activities_descent_label);
                                Double elevationLoss = x0Var.getElevationLoss();
                                if (elevationLoss != null) {
                                    dValueOf = elevationLoss;
                                }
                                TextView textView5 = hVar.F;
                                double dDoubleValue4 = dValueOf.doubleValue();
                                f12.l.f68084a.getClass();
                                o0 o0VarG2 = f12.l.a.a().g();
                                l3.f23124b.getClass();
                                textView5.setText(l3.a.Y(context, dDoubleValue4, o0VarG2, true));
                            } else if (z0.x(hVar.f138857p.C().f4358a)) {
                                hVar.D7(0, 8, 8);
                                Context context6 = hVar.getContext();
                                qs.p pVarS1 = x0Var.S0();
                                if (context6 != null && pVarS1 != null) {
                                    hVar.f138869w.setText(context6.getString(R.string.string_space_dot_space_string_pattern, context6.getString(R.string.string_space_string_pattern, context6.getString(R.string.lbl_split), strValueOf), aq.a.a0(context6, x0Var.getDuration())));
                                    int i34 = c.f138879a[pVarS1.ordinal()];
                                    if (i34 == 1) {
                                        i15 = 2131232472;
                                        i16 = R.color.gcm_polyline_activity_lap_ascent;
                                    } else if (i34 != 2) {
                                        i15 = 0;
                                        i16 = 0;
                                    } else {
                                        i15 = 2131232533;
                                        i16 = R.color.gcm_polyline_activity_lap_descent;
                                    }
                                    hVar.f138871x.setImageResource(i15);
                                    hVar.f138871x.setColorFilter(a7.b.getColor(hVar.f138869w.getContext(), i16));
                                    hVar.f138873y.setVisibility(0);
                                    hVar.D.setVisibility(0);
                                    hVar.E.setVisibility(0);
                                    hVar.f138875z.setVisibility(0);
                                    hVar.I0.setVisibility(0);
                                    hVar.H0.setVisibility(0);
                                    double dDoubleValue5 = x0Var.getDistance() == null ? Double.NaN : x0Var.getDistance().doubleValue();
                                    m3 m3Var = ((f12.l) KoinJavaComponent.get(f12.l.class)).y() ? m3.KILOMETER : m3.MILE;
                                    DecimalFormat decimalFormat = l3.f23129g;
                                    String string2 = hVar.getString(R.string.no_value);
                                    l3.f23124b.getClass();
                                    String strP = l3.a.P(context6, dDoubleValue5, m3Var, decimalFormat, true, string2);
                                    hVar.D.setText(context6.getString(R.string.lbl_distance));
                                    hVar.E.setText(strP);
                                    boolean z15 = pVarS1 == qs.p.ASCENT;
                                    hVar.I0.setText(z15 ? R.string.activities_ascent_label : R.string.activities_descent_label);
                                    Double elevationGain2 = z15 ? x0Var.getElevationGain() : x0Var.getElevationLoss();
                                    if (elevationGain2 != null) {
                                        dValueOf = elevationGain2;
                                    }
                                    TextView textView6 = hVar.H0;
                                    double dDoubleValue6 = dValueOf.doubleValue();
                                    f12.l.f68084a.getClass();
                                    textView6.setText(l3.a.Y(context6, dDoubleValue6, f12.l.a.a().g(), true));
                                }
                            } else {
                                hVar.D7(0, 0, 8);
                                hVar.r7();
                                String strM8 = hVar.m7();
                                hVar.f138869w.setText(context3.getString(R.string.string_space_dot_space_string_pattern, hVar.o7(strValueOf), (z0.P(strM8) || z0.o(strM8) || z0.b(x0Var3, strM8) || z0.x(strM8)) ? aq.a.a0(context3, x0Var.getDuration()) : aq.a.W(context3, x0Var.getDuration())));
                                hVar.f138873y.setVisibility(8);
                                hVar.F.setText(h.n7(zB, x0Var, context3, hVar.f138857p.C().f4358a));
                                double dDoubleValue7 = x0Var.getAverageSpeed() == null ? Double.NaN : x0Var.getAverageSpeed().doubleValue();
                                if (z0.c(hVar.m7())) {
                                    if (z0.d0(hVar.m7())) {
                                        i30 = R.string.lbl_speed;
                                    }
                                    i14 = i30;
                                    if (Double.isNaN(dDoubleValue7)) {
                                        strJ1 = null;
                                    } else {
                                        if (z0.I(hVar.m7())) {
                                            q3Var = q3.NAUTICAL_MILES_PER_HOUR;
                                        } else {
                                            q3Var = am.j.z(f12.l.f68084a) ? q3.KILOMETER_PER_HOUR : q3.MILE_PER_HOUR;
                                        }
                                        DecimalFormat decimalFormatN2 = l3.n();
                                        l3.f23124b.getClass();
                                        strJ1 = l3.a.M0(context3, dDoubleValue7, q3Var, decimalFormatN2, true);
                                    }
                                } else {
                                    boolean z16 = hVar.Q0;
                                    l3.a aVar2 = l3.f23124b;
                                    aVar2.getClass();
                                    String string3 = context3.getString(R.string.no_duration_value);
                                    string3.getClass();
                                    strJ1 = aVar2.J1(context3, dDoubleValue7, zB, z16, true, string3);
                                    i14 = R.string.lbl_pace;
                                }
                                hVar.I.setText(i14);
                                hVar.P.setText(strJ1);
                            }
                        }
                    } else if (String.valueOf(strValueOf).equals("-2")) {
                        if (hVar.O0) {
                            hVar.f138869w.setText(hVar.getString(R.string.lbl_activity_start_point));
                            hVar.D7(0, 8, 8);
                        }
                    } else if (String.valueOf(strValueOf).equals("-1") && hVar.O0) {
                        hVar.f138869w.setText(hVar.getString(R.string.lbl_stop));
                        hVar.D7(0, 8, 8);
                    }
                } else if (hVar.O0) {
                    hVar.f138869w.setText(title);
                    hVar.D7(0, 8, 8);
                }
            }
            return hVar.f138864t;
        }
    }

    public static void E6(h hVar, x1 x1Var) {
        hVar.c7(0);
        j0 j0Var = new j0(hVar.requireActivity(), hVar.f138864t);
        x1Var.getClass();
        qs.x xVarA2 = x1Var.a2();
        int i14 = xVarA2 == null ? -1 : j0.a.f138916a[xVarA2.ordinal()];
        TextView textView = j0Var.f138915o;
        TextView textView2 = j0Var.f138914n;
        View view2 = j0Var.f138913m;
        TextView textView3 = j0Var.f138912l;
        TextView textView4 = j0Var.f138911k;
        TextView textView5 = j0Var.f138909i;
        TextView textView6 = j0Var.f138908h;
        TextView textView7 = j0Var.f138907g;
        TextView textView8 = j0Var.f138906f;
        TextView textView9 = j0Var.f138905e;
        TextView textView10 = j0Var.f138904d;
        Context context = j0Var.f138901a;
        TextView textView11 = j0Var.f138903c;
        if (i14 == 1) {
            boolean z14 = am.j.z(f12.l.f68084a);
            textView11.setText(context.getString(R.string.lbl_marker_title_obstacle));
            textView10.setText(R.string.lbl_distance);
            m3 m3Var = z14 ? m3.METER : m3.FOOT;
            l3.a aVar = l3.f23124b;
            Double distance = x1Var.getDistance();
            double dDoubleValue = distance != null ? distance.doubleValue() : 0.0d;
            DecimalFormat decimalFormat = l3.f23126d;
            aVar.getClass();
            textView9.setText(l3.a.O(context, dDoubleValue, m3Var, decimalFormat, true));
            textView8.setText(R.string.lbl_time);
            Double duration = x1Var.getDuration();
            textView7.setText(l3.a.e1(MathKt.d(duration != null ? duration.doubleValue() : 0.0d)));
            textView6.setText(R.string.activities_average_hr_lbl_short);
            Double averageHR = x1Var.getAverageHR();
            textView5.setText(l3.a.k0(new l22.a(context), averageHR != null ? averageHR.doubleValue() : 0.0d, false, ""));
            textView4.setText(R.string.lbl_max_hr);
            Double maxHR = x1Var.getMaxHR();
            textView3.setText(l3.a.k0(new l22.a(context), maxHR != null ? maxHR.doubleValue() : 0.0d, false, ""));
            v22.e.j(view2);
            v22.e.j(textView2);
            v22.e.j(textView);
            return;
        }
        if (i14 != 2) {
            return;
        }
        boolean z15 = am.j.z(f12.l.f68084a);
        textView11.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        textView11.setText(context.getString(R.string.lbl_transition));
        textView10.setText(R.string.activity_details_elevation);
        m3 m3Var2 = z15 ? m3.METER : m3.FOOT;
        l3.a aVar2 = l3.f23124b;
        Double startElevation = x1Var.getStartElevation();
        double dDoubleValue2 = startElevation != null ? startElevation.doubleValue() : 0.0d;
        DecimalFormat decimalFormat2 = l3.f23126d;
        aVar2.getClass();
        textView9.setText(l3.a.O(context, dDoubleValue2, m3Var2, decimalFormat2, true));
        textView8.setText(R.string.lbl_time);
        Double duration2 = x1Var.getDuration();
        textView7.setText(l3.a.e1(MathKt.d(duration2 != null ? duration2.doubleValue() : 0.0d)));
        textView6.setText(R.string.lbl_time_of_day);
        textView5.setText(c22.j0.r(context, x1Var.getStartDateTimeLocal()));
        v22.e.j(j0Var.f138910j);
        v22.e.j(textView4);
        v22.e.j(textView3);
        v22.e.j(view2);
        v22.e.j(textView2);
        v22.e.j(textView);
    }

    public static String n7(boolean z14, x0 x0Var, Context context, String str) {
        ls.e eVar;
        double dDoubleValue = x0Var.getDistance() == null ? Double.NaN : x0Var.getDistance().doubleValue();
        Object objValueOf = Double.valueOf(dDoubleValue);
        if (z14) {
            objValueOf = new ls.g(am.j.z(f12.l.f68084a), dDoubleValue);
        } else {
            z0 z0Var = z0.f4390a;
            if (z0.b(am.x0.f4297k1, str) || z0.b(am.x0.f4301l1, str)) {
                objValueOf = x0Var.getTotalNumberOfStrokes();
            }
        }
        if (z0.i0(str)) {
            eVar = ls.e.NAUTICAL_DISTANCE;
        } else if (z0.b(am.x0.f4297k1, str) || z0.b(am.x0.f4301l1, str)) {
            eVar = ls.e.TOTAL_SWIMMING_STROKES;
        } else if (z0.Q(str) || z0.b(am.x0.I0, str)) {
            eVar = ls.e.DISTANCE_METERS;
        } else {
            eVar = z0.b(am.x0.f4324r, str) ? ls.e.SWIMMING_DISTANCE : ls.e.DISTANCE;
        }
        return ss.k.b(eVar, new l22.a(context), objValueOf, 1);
    }

    @Override // xf1.d
    public final void A6() {
        super.A6();
        Y6();
    }

    public void A7() {
        B7();
    }

    public final void B7() {
        qe2.h hVar = this.f148294e;
        if (hVar == null) {
            return;
        }
        ((List) hVar.f144584a.Q().stream().collect(Collectors.toList())).forEach(new f(this, 2));
    }

    public final void C7() {
        i2.a(a2.ACTIVITIES, "ActivityMapFragment", "showMap()");
        if (this.U0 != null) {
            if (this.W0 == null && this.X0 == null) {
                String str = this.f138857p.C().f4358a;
                z0 z0Var = z0.f4390a;
                if (!z0.b(am.x0.D, str)) {
                    ge1.b.S(o53.f0.w(this), t13.h.f161748a, o53.d0.DEFAULT, new ov1.q(this, 10));
                    return;
                }
            }
            d7();
        }
    }

    public final void D7(int i14, int i15, int i16) {
        if (this.O0) {
            this.f138869w.setVisibility(i14);
            c7(i15);
            this.f138867v.setVisibility(i16);
        }
    }

    public final void E7(int i14, ArrayList arrayList) {
        Object next;
        if (this.f148294e == null || arrayList.isEmpty() || this.f138862r1 == -1 || this.f138853l1 == null || getActivity() == null) {
            return;
        }
        this.f138863s1 = i14;
        this.f148294e.clear();
        ArrayList arrayList2 = new ArrayList();
        t1 t1Var = null;
        com.garmin.android.library.mapsdkadapter.f fVar = null;
        com.garmin.android.library.mapsdkadapter.f fVar2 = null;
        for (int i15 = 0; i15 < arrayList.size(); i15++) {
            c1 c1VarA = f2.a((x1) arrayList.get(i15), this.f138853l1);
            if (c1VarA != null && c1VarA.d()) {
                t1 t1Var2 = this.f138853l1.f139768e;
                if (t1Var2 != null) {
                    String str = t1Var2.f140222a.f139689a;
                    if ("None".equals(str)) {
                        c1VarA.f139768e = this.f138853l1.f139768e;
                    } else {
                        List<t1> list = c1VarA.f139766c;
                        if (list == null) {
                            next = null;
                            break;
                        }
                        Iterator<T> it = list.iterator();
                        do {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                        } while (!((t1) next).f140222a.f139689a.equals(str));
                        c1VarA.f139768e = (t1) next;
                    }
                } else {
                    c1VarA.f139768e = null;
                }
                f1 f1Var = new f1(requireContext(), c1VarA, this.f148294e);
                if (i14 == i15 || i14 == -1) {
                    f1Var.a(true, null, null);
                } else {
                    f1Var.a(false, Integer.valueOf(MlKitException.CODE_SCANNER_TASK_IN_PROGRESS), Float.valueOf(-100.0f));
                }
                if (t1Var == null) {
                    t1Var = this.f138853l1.f139768e;
                }
                ArrayList arrayList3 = f1Var.f139817d;
                if (fVar == null) {
                    fVar = (com.garmin.android.library.mapsdkadapter.f) p13.h0.b0(arrayList3);
                }
                if (fVar2 == null) {
                    fVar2 = (com.garmin.android.library.mapsdkadapter.f) p13.h0.m0(arrayList3);
                }
                arrayList2.addAll(f1Var.f139818e);
            }
        }
        e7(t1Var);
        if (fVar != null) {
            Bitmap bitmapB = d7.b.b(new w(requireContext(), this.f138862r1, false), 0, 0, 7);
            qe2.h hVar = this.f148294e;
            com.garmin.android.library.mapsdkadapter.p pVar = new com.garmin.android.library.mapsdkadapter.p();
            pVar.f50327a.f50312d = "StartTimingGate";
            pVar.c(bitmapB);
            pVar.d(fVar);
            pVar.a(0.5f, 0.9f);
            pVar.f50327a.f50311c = 1.0f;
            hVar.x(pVar);
        }
        if (fVar2 != null) {
            Bitmap bitmapB2 = d7.b.b(new w(requireContext(), this.f138862r1 + 1, false), 0, 0, 7);
            qe2.h hVar2 = this.f148294e;
            com.garmin.android.library.mapsdkadapter.p pVar2 = new com.garmin.android.library.mapsdkadapter.p();
            pVar2.f50327a.f50312d = "EndTimingGate";
            pVar2.c(bitmapB2);
            pVar2.d(fVar2);
            pVar2.a(0.5f, 0.9f);
            pVar2.f50327a.f50311c = 1.0f;
            hVar2.x(pVar2);
        }
        G6(arrayList2);
        qe2.h hVar3 = this.f148294e;
        hVar3.getClass();
        com.garmin.android.library.mapsdkadapter.i.a.e(hVar3, true, true, 28);
    }

    public void F6() {
        List<w0> list;
        com.garmin.android.apps.connectmobile.activities.newmodel.h hVar = this.f138857p;
        if (hVar == null || (list = hVar.f29463p) == null || list.isEmpty() || !this.f138858p1) {
            return;
        }
        M6();
    }

    public boolean F7(boolean z14) {
        ArrayList<ie2.j> arrayList;
        if (this.f148294e == null) {
            return false;
        }
        d dVar = this.f138859q;
        if (dVar == null || (arrayList = dVar.f138883c) == null) {
            return true;
        }
        if (!z14) {
            Iterator<ie2.j> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().remove();
            }
            this.f138859q.f138883c.clear();
            return true;
        }
        ArrayList<com.garmin.android.library.mapsdkadapter.p> arrayList2 = dVar.f138882b;
        if (arrayList2 == null || arrayList2.isEmpty()) {
            return true;
        }
        this.f138859q.f138883c = new ArrayList<>();
        for (com.garmin.android.library.mapsdkadapter.p pVar : this.f138859q.f138882b) {
            if (!pVar.f50327a.f50312d.startsWith("-")) {
                this.f138859q.f138883c.add(this.f148294e.x(pVar));
            }
        }
        return true;
    }

    public void G6(ArrayList arrayList) {
        com.garmin.android.apps.connectmobile.activities.newmodel.h hVar;
        List<w0> list;
        Object next;
        com.garmin.android.library.mapsdkadapter.f fVar;
        if (this.f148294e == null || arrayList.isEmpty() || (hVar = this.f138857p) == null || (list = hVar.f29463p) == null || list.isEmpty() || !this.f138858p1) {
            return;
        }
        List<w0> list2 = this.f138857p.f29463p;
        this.S0 = list2;
        if (list2 != null) {
            int i14 = 0;
            for (w0 w0Var : list2) {
                com.garmin.android.library.mapsdkadapter.f fVar2 = new com.garmin.android.library.mapsdkadapter.f(w0Var.getLatitude() == null ? Double.NaN : w0Var.getLatitude().doubleValue(), w0Var.getLongitude() != null ? w0Var.getLongitude().doubleValue() : Double.NaN, com.garmin.android.library.mapsdkadapter.i.b.WGS84);
                Iterator it = arrayList.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it.next();
                        fVar = (com.garmin.android.library.mapsdkadapter.f) next;
                        fVar.getClass();
                    }
                } while (!fVar2.d(fVar, -1.0f));
                if (next != null) {
                    I6(fVar2, i14);
                }
                i14++;
            }
        }
    }

    public final boolean G7(int i14) {
        qe2.h hVar = this.f148294e;
        if (hVar == null) {
            return false;
        }
        if (this.f138844d1 == i14) {
            return true;
        }
        this.f138844d1 = i14;
        hVar.setMapType(i14);
        return true;
    }

    public final void H6(com.garmin.android.library.mapsdkadapter.f fVar) {
        if (fVar != null && this.f138852k1 == null) {
            this.f138852k1 = fVar;
            ArrayList<com.garmin.android.library.mapsdkadapter.p> arrayList = this.f138859q.f138882b;
            com.garmin.android.library.mapsdkadapter.p pVar = new com.garmin.android.library.mapsdkadapter.p();
            pVar.b(2131232001);
            pVar.a(0.5f, 0.9f);
            pVar.d(fVar);
            com.garmin.android.library.mapsdkadapter.o oVar = pVar.f50327a;
            oVar.f50311c = 0.5f;
            oVar.f50312d = "-1";
            arrayList.add(pVar);
        }
    }

    public final void H7(boolean z14) {
        qe2.h hVar = this.f148294e;
        if (hVar != null) {
            if (z14) {
                S6();
            } else {
                ((List) hVar.f144584a.Q().stream().collect(Collectors.toList())).forEach(new f(this, 0));
            }
        }
    }

    public final void I6(com.garmin.android.library.mapsdkadapter.f fVar, int i14) {
        qe2.h hVar = this.f148294e;
        com.garmin.android.library.mapsdkadapter.p pVar = new com.garmin.android.library.mapsdkadapter.p();
        pVar.b(2131232693);
        pVar.d(fVar);
        pVar.f50327a.f50312d = "Jump" + getString(R.string.no_value_small) + i14;
        hVar.x(pVar);
    }

    public final void J6(int i14, int i15, com.garmin.android.library.mapsdkadapter.f fVar) {
        this.f138861r.put(i14, i15);
        String strValueOf = String.valueOf(i14);
        Bitmap bitmapB = d7.b.b(new w(requireContext(), i14, false), 0, 0, 7);
        ArrayList<com.garmin.android.library.mapsdkadapter.p> arrayList = this.f138859q.f138882b;
        com.garmin.android.library.mapsdkadapter.p pVar = new com.garmin.android.library.mapsdkadapter.p();
        pVar.c(bitmapB);
        pVar.d(fVar);
        com.garmin.android.library.mapsdkadapter.o oVar = pVar.f50327a;
        oVar.f50312d = strValueOf;
        oVar.f50311c = 1.0f;
        arrayList.add(pVar);
    }

    public final void J7(t1 t1Var) {
        c1 c1Var = this.f138853l1;
        if (c1Var != null) {
            c1Var.f139768e = t1Var;
        }
        this.f148294e.clear();
        com.garmin.android.library.mapsdkadapter.q qVar = this.f138859q.f138881a;
        if (qVar != null) {
            qVar.b();
        }
        this.f148293d.removeAllViews();
        ps.m mVar = this.W0;
        if (mVar != null) {
            T6(mVar.getEncodedSamples(), this.W0.getEncodedLevels());
        }
        requireActivity().runOnUiThread(this.D1);
    }

    public final void K6() {
        i2.a(a2.ACTIVITIES, "ActivityMapFragment", "addLapMarkers() lap summary list null: ".concat(this.U0 != null ? BooleanUtils.NO : BooleanUtils.YES));
        List<x0> listZ7 = z7();
        if (listZ7 != null) {
            int size = listZ7.size();
            this.f138861r = new SparseIntArray(size);
            if (size > 1) {
                int i14 = listZ7.get(0).getLapIndex() != 1 ? 1 : 0;
                int i15 = 1;
                for (int i16 = i14; i16 < (size + i14) - 1; i16++) {
                    x0 x0Var = listZ7.get(i16);
                    Location location = new Location("");
                    if (x0Var != null && x0Var.getEndLatitude() != null && !Double.isNaN(x0Var.getEndLatitude().doubleValue()) && x0Var.getEndLongitude() != null && !Double.isNaN(x0Var.getEndLongitude().doubleValue())) {
                        location.setLatitude(x0Var.getEndLatitude().doubleValue());
                        location.setLongitude(x0Var.getEndLongitude().doubleValue());
                        if (com.garmin.android.library.mapsdkadapter.m.h(location)) {
                            J6(i15, i16, com.garmin.android.library.mapsdkadapter.n.c(location));
                            i15++;
                        }
                    }
                }
            }
            i2.a(a2.ACTIVITIES, "ActivityMapFragment", "Added lap markers to ".concat(d.class.getSimpleName()));
        }
    }

    public final void K7(boolean z14) {
        ComposeView composeView;
        qe2.h hVar = this.f148294e;
        if (hVar == null) {
            return;
        }
        if (z14) {
            X6();
            return;
        }
        ((List) hVar.f144584a.Q().stream().collect(Collectors.toList())).forEach(new f(this, 1));
        View view2 = getView();
        if (view2 != null && (composeView = (ComposeView) view2.findViewById(R.id.composable_container)) != null) {
            composeView.disposeComposition();
            composeView.setVisibility(8);
        }
        w7();
    }

    public void L7() {
    }

    public final void M6() {
        if (this.f148294e == null) {
            return;
        }
        List<w0> list = this.f138857p.f29463p;
        this.S0 = list;
        if (list != null) {
            int i14 = 0;
            for (w0 w0Var : list) {
                I6(new com.garmin.android.library.mapsdkadapter.f(w0Var.getLatitude() == null ? Double.NaN : w0Var.getLatitude().doubleValue(), w0Var.getLongitude() != null ? w0Var.getLongitude().doubleValue() : Double.NaN, com.garmin.android.library.mapsdkadapter.i.b.WGS84), i14);
                i14++;
            }
        }
    }

    public final com.garmin.android.library.mapsdkadapter.p N7(com.garmin.android.library.mapsdkadapter.p pVar) {
        com.garmin.android.apps.connectmobile.activities.newmodel.h hVar = this.f138857p;
        int i14 = 2131232000;
        if (hVar != null && hVar.C() != null && z0.R(hVar.C().f4358a)) {
            i14 = R.drawable.safety;
        }
        if (!z0.R(this.f138857p.C().f4358a)) {
            pVar.b(i14);
            return pVar;
        }
        Resources resources = getResources();
        int i15 = qw0.l.f148323a;
        resources.getClass();
        pVar.c(qw0.l.a(resources, i14));
        return pVar;
    }

    @Override // xf1.d, com.garmin.android.library.mapsdkadapter.i.m
    public boolean O2(ie2.j jVar) {
        ComposeView composeView;
        if (this.f138860q1) {
            String title = jVar.getTitle();
            if (title == null || (!title.equals("StartTimingGate") && !title.equals("EndTimingGate"))) {
                int iIntValue = jVar.mo329getTag() instanceof Integer ? ((Integer) jVar.mo329getTag()).intValue() : -1;
                if (iIntValue >= 0) {
                    this.f138862r1 = iIntValue;
                    ArrayList arrayListL = w02.b0.l(iIntValue, this.V0);
                    E7(-1, arrayListL);
                    ph1.d dVar = new ph1.d(4, this, arrayListL);
                    int i14 = 0;
                    po.b bVar = new po.b(this, i14);
                    po.c cVar = new po.c(this, i14);
                    po.c cVar2 = new po.c(this, 1);
                    View view2 = getView();
                    boolean zBooleanValue = this.f138876z1.booleanValue();
                    if (view2 != null && (composeView = (ComposeView) view2.findViewById(R.id.composable_container)) != null) {
                        composeView.setVisibility(0);
                        composeView.setViewCompositionStrategy(w3.b.f91619b);
                        composeView.setContent(new z3.e(-39533528, true, new l(iIntValue, arrayListL, dVar, bVar, zBooleanValue, cVar2, composeView, cVar, 0)));
                    }
                }
            }
            return true;
        }
        if (jVar.getTitle() == null || !jVar.getTitle().startsWith("s")) {
            return false;
        }
        super.O2(jVar);
        return true;
    }

    public final void S6() {
        List<x1> list = (List) this.V0.stream().filter(new im.c(9)).collect(Collectors.toList());
        for (x1 x1Var : list) {
            int iIndexOf = list.indexOf(x1Var);
            if (x1Var.getStartLatitude() != null && x1Var.getStartLongitude() != null) {
                Location location = new Location("");
                location.setLatitude(x1Var.getStartLatitude().doubleValue());
                location.setLongitude(x1Var.getStartLongitude().doubleValue());
                if (com.garmin.android.library.mapsdkadapter.m.h(location)) {
                    com.garmin.android.library.mapsdkadapter.f fVarC = com.garmin.android.library.mapsdkadapter.n.c(location);
                    qe2.h hVar = this.f148294e;
                    com.garmin.android.library.mapsdkadapter.p pVar = new com.garmin.android.library.mapsdkadapter.p();
                    pVar.f50327a.f50312d = am.j.h(iIndexOf, "obstacle");
                    pVar.b(2131232573);
                    pVar.d(fVarC);
                    hVar.x(pVar);
                }
            }
        }
    }

    public final void T6(String str, String str2) {
        f7();
        c1 c1Var = this.f138853l1;
        com.garmin.android.library.mapsdkadapter.f fVar = null;
        int i14 = 0;
        if (c1Var == null || c1Var.b() == null) {
            if (str2 == null || TextUtils.isEmpty(str2.trim()) || str == null || TextUtils.isEmpty(str.trim())) {
                return;
            }
            com.garmin.android.library.mapsdkadapter.f[] fVarArrA = k2.a(k2.b(str2).length, str);
            if (fVarArrA.length <= 0 || getActivity() == null) {
                return;
            }
            d dVar = this.f138859q;
            com.garmin.android.library.mapsdkadapter.q qVar = new com.garmin.android.library.mapsdkadapter.q();
            int color = a7.b.getColor(requireContext(), R.color.gcm_map_track_path);
            ie2.p pVar = qVar.f50328a;
            pVar.f93156d = color;
            pVar.f93155c = 5.0f;
            dVar.f138881a = qVar;
            com.garmin.android.library.mapsdkadapter.f fVar2 = null;
            while (i14 < fVarArrA.length) {
                if (fVarArrA[i14] != null) {
                    LatLng latLng = fVarArrA[i14].f50283a;
                    com.garmin.android.library.mapsdkadapter.f fVar3 = new com.garmin.android.library.mapsdkadapter.f(latLng.latitude, latLng.longitude, com.garmin.android.library.mapsdkadapter.i.b.WGS84);
                    this.f138859q.f138881a.f50328a.f93153a.add(fVar3);
                    if (i14 == 0) {
                        fVar = fVar3;
                    } else if (i14 == fVarArrA.length - 1) {
                        fVar2 = fVar3;
                    }
                }
                i14++;
            }
            H6(fVar2);
            U6(fVar);
            return;
        }
        if (this.f138853l1 == null || getActivity() == null) {
            return;
        }
        e7(this.f138853l1.b());
        List<x1> list = this.V0;
        if ((list != null ? list.stream().anyMatch(new im.c(10)) : false) && this.V0.size() > 1) {
            while (i14 < this.V0.size()) {
                x1 x1Var = this.V0.get(i14);
                if (x1Var != null) {
                    c1 c1VarA = f2.a(x1Var, this.f138853l1);
                    if (c1VarA != null) {
                        c1VarA.f139768e = this.f138853l1.f139768e;
                        new f1(requireContext(), c1VarA, this.f148294e).a(true, null, null);
                    }
                    if (i14 == 0) {
                        U6(new com.garmin.android.library.mapsdkadapter.f(new LatLng(x1Var.getStartLatitude().doubleValue(), x1Var.getStartLongitude().doubleValue()), com.garmin.android.library.mapsdkadapter.i.b.WGS84));
                    }
                    if (i14 == this.V0.size() - 1) {
                        H6(new com.garmin.android.library.mapsdkadapter.f(new LatLng(x1Var.getEndLatitude().doubleValue(), x1Var.getEndLongitude().doubleValue()), com.garmin.android.library.mapsdkadapter.i.b.WGS84));
                    }
                }
                i14++;
            }
            return;
        }
        f1 f1Var = new f1(requireContext(), this.f138853l1, this.f148294e);
        f1Var.a(true, null, null);
        ArrayList arrayList = f1Var.f139817d;
        com.garmin.android.library.mapsdkadapter.f fVar4 = (com.garmin.android.library.mapsdkadapter.f) p13.h0.b0(arrayList);
        H6((com.garmin.android.library.mapsdkadapter.f) p13.h0.m0(arrayList));
        U6(fVar4);
        c1 c1Var2 = this.f138853l1;
        if ((c1Var2 == null || c1Var2.b() == null || !(this.f138853l1.b().f140222a instanceof b1.w) || this.V0 == null || this.f138854m1) ? false : true) {
            ArrayList arrayList2 = this.f138865t1;
            arrayList2.clear();
            for (x1 x1Var2 : this.V0) {
                if (qs.x.RWD_STAND == x1Var2.a2() && x1Var2.getStartLatitude() != null && x1Var2.getStartLongitude() != null) {
                    Location location = new Location("");
                    location.setLatitude(x1Var2.getStartLatitude().doubleValue());
                    location.setLongitude(x1Var2.getStartLongitude().doubleValue());
                    if (com.garmin.android.library.mapsdkadapter.m.h(location)) {
                        com.garmin.android.library.mapsdkadapter.f fVarC = com.garmin.android.library.mapsdkadapter.n.c(location);
                        qe2.h hVar = this.f148294e;
                        com.garmin.android.library.mapsdkadapter.p pVar2 = new com.garmin.android.library.mapsdkadapter.p();
                        pVar2.b(2131232561);
                        pVar2.d(fVarC);
                        ie2.j jVarX = hVar.x(pVar2);
                        ((qe2.i) jVarX).setVisible(this.f148294e.f144584a.getF50270z() > 16.0f);
                        arrayList2.add(jVarX);
                    }
                }
            }
        }
        c1 c1Var3 = this.f138853l1;
        if (c1Var3 != null && c1Var3.b() != null && this.V0 != null && !this.f138854m1 && z0.o(this.f138857p.C().f4358a)) {
            i14 = 1;
        }
        if (i14 != 0) {
            for (x1 x1Var3 : this.V0) {
                if (x1Var3.getStartLatitude() != null && x1Var3.getStartLongitude() != null && x1Var3.a2() == qs.x.TRANSITION) {
                    int iIndexOf = this.V0.indexOf(x1Var3);
                    Location location2 = new Location("");
                    location2.setLatitude(x1Var3.getStartLatitude().doubleValue());
                    location2.setLongitude(x1Var3.getStartLongitude().doubleValue());
                    if (com.garmin.android.library.mapsdkadapter.m.h(location2)) {
                        com.garmin.android.library.mapsdkadapter.f fVarC2 = com.garmin.android.library.mapsdkadapter.n.c(location2);
                        qe2.h hVar2 = this.f148294e;
                        com.garmin.android.library.mapsdkadapter.p pVar3 = new com.garmin.android.library.mapsdkadapter.p();
                        pVar3.f50327a.f50312d = am.j.h(iIndexOf, "transition");
                        pVar3.b(2131233050);
                        pVar3.d(fVarC2);
                        hVar2.x(pVar3);
                    }
                }
            }
        }
    }

    public final void U6(com.garmin.android.library.mapsdkadapter.f fVar) {
        if (fVar != null && this.f138850j1 == null) {
            this.f138850j1 = fVar;
            ArrayList<com.garmin.android.library.mapsdkadapter.p> arrayList = this.f138859q.f138882b;
            com.garmin.android.library.mapsdkadapter.p pVar = new com.garmin.android.library.mapsdkadapter.p();
            N7(pVar);
            pVar.a(0.5f, 0.9f);
            pVar.d(fVar);
            com.garmin.android.library.mapsdkadapter.o oVar = pVar.f50327a;
            oVar.f50311c = 2.0f;
            oVar.f50312d = "-2";
            arrayList.add(pVar);
        }
    }

    public final void V6(int i14, int i15, com.garmin.android.library.mapsdkadapter.f fVar) {
        if (this.f148294e == null) {
            return;
        }
        String str = "TimingGate" + getString(R.string.no_value_small) + i14;
        Bitmap bitmapB = d7.b.b(new w(requireContext(), i14, false), 0, 0, 7);
        qe2.h hVar = this.f148294e;
        com.garmin.android.library.mapsdkadapter.p pVar = new com.garmin.android.library.mapsdkadapter.p();
        pVar.c(bitmapB);
        pVar.d(fVar);
        pVar.f50327a.f50312d = str;
        Integer numValueOf = Integer.valueOf(i15);
        com.garmin.android.library.mapsdkadapter.o oVar = pVar.f50327a;
        oVar.f50322n = numValueOf;
        oVar.f50311c = 1.0f;
        hVar.x(pVar);
    }

    public final void X6() {
        int size;
        if (this.f138853l1 == null) {
            return;
        }
        List<x1> list = this.V0;
        List arrayList = (list == null || list.isEmpty()) ? new ArrayList() : w02.b0.h(this.V0);
        if (arrayList.isEmpty() || (size = arrayList.size()) <= 1) {
            return;
        }
        c1 c1Var = this.f138853l1;
        List<Double> list2 = c1Var.f139767d;
        List<Double> list3 = c1Var.f139764a;
        List<Double> list4 = c1Var.f139765b;
        int i14 = 0;
        while (true) {
            if (i14 >= size) {
                break;
            }
            x1 x1Var = (x1) arrayList.get(i14);
            if (x1Var != null) {
                DateTime startDateTime = x1Var.getStartDateTime();
                int iIndexOf = list2.indexOf(list2.stream().filter(new y0(startDateTime != null ? startDateTime.getMillis() : 0L, 1)).findFirst().orElse(null));
                if (iIndexOf != -1) {
                    Location location = new Location("");
                    location.setLatitude(list3.get(iIndexOf).doubleValue());
                    location.setLongitude(list4.get(iIndexOf).doubleValue());
                    if (com.garmin.android.library.mapsdkadapter.m.h(location)) {
                        V6(i14, i14, com.garmin.android.library.mapsdkadapter.n.c(location));
                    }
                }
            }
            i14++;
        }
        int i15 = size - 1;
        x1 x1Var2 = (x1) arrayList.get(i15);
        if (x1Var2 != null) {
            DateTime endDateTime = x1Var2.getEndDateTime();
            long millis = endDateTime != null ? endDateTime.getMillis() : 0L;
            DateTime startDateTime2 = x1Var2.getStartDateTime();
            long millis2 = startDateTime2 != null ? startDateTime2.getMillis() : 0L;
            if (millis < millis2) {
                millis = ((x1Var2.getDuration() != null ? x1Var2.getDuration().longValue() : 0L) * 1000) + millis2;
            }
            int iIndexOf2 = list2.indexOf(list2.stream().filter(new y0(millis, 2)).findFirst().orElse(null));
            if (iIndexOf2 != -1) {
                Location location2 = new Location("");
                location2.setLatitude(list3.get(iIndexOf2).doubleValue());
                location2.setLongitude(list4.get(iIndexOf2).doubleValue());
                if (com.garmin.android.library.mapsdkadapter.m.h(location2)) {
                    V6(size, i15, com.garmin.android.library.mapsdkadapter.n.c(location2));
                }
            }
        }
    }

    public final void Y6() {
        float f14;
        if (this.R0 || this.f190659i == null || this.f148294e == null || this.f190663m) {
            return;
        }
        i2.a(a2.ACTIVITIES, "ActivityMapFragment", "centerMap()");
        ps.h hVar = this.X0;
        qe2.h hVar2 = this.f148294e;
        if (hVar != null) {
            this.f148294e.e(hVar2.f144584a.getF50264r() == com.garmin.android.library.mapsdkadapter.i.d.GOOGLE ? Float.valueOf(19.5f) : null);
        } else {
            hVar2.e(null);
        }
        int i14 = this.f138845e1 ? 1 : -1;
        if (this.X0 != null) {
            f14 = 0.05f;
        } else {
            f14 = this.f138843c1 == os.b.ACTIVITY_SEGMENTS_MAP ? 3.0f : -1.0f;
        }
        this.f148294e.j(this.f190659i, f14, this.f148290a, i14);
    }

    public final void c7(int i14) {
        this.f138873y.setVisibility(i14);
        this.E.setVisibility(i14);
        this.D.setVisibility(i14);
        this.f138875z.setVisibility(i14);
        this.H0.setVisibility(i14);
        this.I0.setVisibility(i14);
        this.A.setVisibility(i14);
        this.J0.setVisibility(i14);
        this.K0.setVisibility(i14);
        this.B.setVisibility(i14);
        this.F.setVisibility(i14);
        this.L0.setVisibility(i14);
        this.C.setVisibility(i14);
        this.P.setVisibility(i14);
        this.I.setVisibility(i14);
    }

    /* JADX WARN: Code duplicated, block: B:144:0x0326 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:145:0x0328  */
    /* JADX WARN: Code duplicated, block: B:147:0x032e  */
    /* JADX WARN: Code duplicated, block: B:149:0x034d  */
    /* JADX WARN: Code duplicated, block: B:150:0x0352  */
    /* JADX WARN: Code duplicated, block: B:159:0x0370  */
    /* JADX WARN: Code duplicated, block: B:160:0x0375  */
    /* JADX WARN: Code duplicated, block: B:163:0x0385  */
    /* JADX WARN: Code duplicated, block: B:166:0x0396 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:167:0x0398  */
    /* JADX WARN: Code duplicated, block: B:169:0x039e  */
    /* JADX WARN: Code duplicated, block: B:170:0x03a3  */
    /* JADX WARN: Code duplicated, block: B:173:0x03a9  */
    /* JADX WARN: Code duplicated, block: B:234:0x0554  */
    /* JADX WARN: Code duplicated, block: B:236:0x0562  */
    /* JADX WARN: Code duplicated, block: B:240:0x0573  */
    /* JADX WARN: Code duplicated, block: B:243:0x057a  */
    /* JADX WARN: Code duplicated, block: B:244:0x057d  */
    /* JADX WARN: Code duplicated, block: B:248:0x0591  */
    /* JADX WARN: Code duplicated, block: B:250:0x059f  */
    /* JADX WARN: Code duplicated, block: B:252:0x05ad A[ADDED_TO_REGION, LOOP:9: B:252:0x05ad->B:268:0x064d, LOOP_START, PHI: r4 r17
      0x05ad: PHI (r4v1 int) = (r4v0 int), (r4v2 int) binds: [B:251:0x05ab, B:268:0x064d] A[DONT_GENERATE, DONT_INLINE]
      0x05ad: PHI (r17v1 java.lang.Double) = (r17v0 java.lang.Double), (r17v2 java.lang.Double) binds: [B:251:0x05ab, B:268:0x064d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:253:0x05af  */
    /* JADX WARN: Code duplicated, block: B:255:0x05b7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:256:0x05b9  */
    /* JADX WARN: Code duplicated, block: B:257:0x05d9  */
    /* JADX WARN: Code duplicated, block: B:259:0x05df  */
    /* JADX WARN: Code duplicated, block: B:260:0x05e8  */
    /* JADX WARN: Code duplicated, block: B:264:0x061a  */
    /* JADX WARN: Code duplicated, block: B:266:0x0641  */
    /* JADX WARN: Code duplicated, block: B:267:0x064b  */
    /* JADX WARN: Code duplicated, block: B:289:0x03ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:290:0x03ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:295:0x0367 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:301:0x064d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:302:0x064d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x0110  */
    /* JADX WARN: Code duplicated, block: B:51:0x0114  */
    /* JADX WARN: Code duplicated, block: B:52:0x0180  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12, types: [ps.x0] */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r17v3 */
    /* JADX WARN: Type inference failed for: r17v4, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r17v5 */
    /* JADX WARN: Type inference failed for: r17v6 */
    /* JADX WARN: Type inference failed for: r18v8, types: [java.lang.Number] */
    /* JADX WARN: Type inference failed for: r1v43 */
    /* JADX WARN: Type inference failed for: r1v44, types: [java.lang.Iterable, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v45 */
    /* JADX WARN: Type inference failed for: r1v48 */
    /* JADX WARN: Type inference failed for: r1v54, types: [uo.a] */
    /* JADX WARN: Type inference failed for: r1v82 */
    /* JADX WARN: Type inference failed for: r1v83 */
    /* JADX WARN: Type inference failed for: r25v10, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r25v11, types: [java.lang.Number] */
    /* JADX WARN: Type inference failed for: r25v9 */
    /* JADX WARN: Type inference failed for: r36v0 */
    /* JADX WARN: Type inference failed for: r36v1, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r36v2 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r6v50 */
    /* JADX WARN: Type inference failed for: r7v14, types: [java.lang.Number] */
    /* JADX WARN: Type inference failed for: r9v20, types: [java.lang.Long[]] */
    public void d7() {
        String[] strArr;
        Double d14;
        int i14;
        ps.m mVar;
        boolean z14;
        String str;
        List<x0> listZ7;
        List<Double> list;
        List<Double> list2;
        List<Double> list3;
        int size;
        x0 x0Var;
        Double d15;
        double dDoubleValue;
        Double dOrElse;
        int iIndexOf;
        Location location;
        ?? r17;
        boolean z15;
        List list4;
        ?? r14;
        ?? r15;
        Iterator it;
        List list5;
        String[] strArr2;
        long j8;
        com.garmin.android.apps.connectmobile.activities.newmodel.a0 a0Var;
        List list6;
        String[] strArr3;
        long jZ2;
        long j14;
        ?? ValueOf;
        long jG;
        long jLongValue;
        long jZ3;
        int length;
        int i15;
        ?? r36;
        long jLongValue2;
        long jZ4;
        Double duration;
        Number numberC;
        ?? r25;
        com.garmin.android.apps.connectmobile.activities.newmodel.w wVarD;
        List<com.garmin.android.apps.connectmobile.activities.newmodel.a0> listC;
        com.garmin.android.apps.connectmobile.activities.newmodel.a aVar;
        uo.a aVarC;
        int i16 = 0;
        this.M0.setHasGCMaps3DSubscription(!z0.A(this.f138846f1) && this.f138847g1 && this.X0 == null);
        d dVar = new d();
        this.f138859q = dVar;
        dVar.f138882b = new ArrayList<>();
        com.garmin.android.library.mapsdkadapter.f fVar = null;
        this.f138850j1 = null;
        this.f138852k1 = null;
        com.garmin.android.apps.connectmobile.activities.newmodel.h hVar = this.f138857p;
        if (hVar != null) {
            String str2 = hVar.C().f4358a;
            am.x0 x0Var2 = am.x0.D;
            if (z0.b(x0Var2, str2)) {
                K6();
                com.garmin.android.apps.connectmobile.activities.newmodel.h hVar2 = this.f138857p;
                if (hVar2 != null && z0.b(x0Var2, hVar2.C().f4358a)) {
                    com.garmin.android.library.mapsdkadapter.e.a aVar2 = new com.garmin.android.library.mapsdkadapter.e.a();
                    com.garmin.android.apps.connectmobile.activities.newmodel.i0 i0Var = this.f138857p.f29460m;
                    LatLng latLng = (Double.isNaN(i0Var.f29496d) || Double.isNaN(i0Var.f29500e)) ? null : new LatLng(i0Var.f29496d, i0Var.f29500e);
                    com.garmin.android.library.mapsdkadapter.i.b bVar = com.garmin.android.library.mapsdkadapter.i.b.WGS84;
                    com.garmin.android.library.mapsdkadapter.m mVar2 = com.garmin.android.library.mapsdkadapter.m.f50298a;
                    bVar.getClass();
                    com.garmin.android.library.mapsdkadapter.f fVar2 = latLng != null ? new com.garmin.android.library.mapsdkadapter.f(latLng, bVar) : null;
                    this.f138850j1 = fVar2;
                    if (fVar2 != null) {
                        ArrayList<com.garmin.android.library.mapsdkadapter.p> arrayList = this.f138859q.f138882b;
                        com.garmin.android.library.mapsdkadapter.p pVar = new com.garmin.android.library.mapsdkadapter.p();
                        N7(pVar);
                        pVar.d(this.f138850j1);
                        com.garmin.android.library.mapsdkadapter.o oVar = pVar.f50327a;
                        oVar.f50311c = 2.0f;
                        oVar.f50312d = "-2";
                        arrayList.add(pVar);
                        aVar2.b(this.f138850j1);
                    }
                    com.garmin.android.apps.connectmobile.activities.newmodel.i0 i0Var2 = this.f138857p.f29460m;
                    LatLng latLng2 = (Double.isNaN(i0Var2.f29504f) || Double.isNaN(i0Var2.f29508g)) ? null : new LatLng(i0Var2.f29504f, i0Var2.f29508g);
                    fVar = latLng2 != null ? new com.garmin.android.library.mapsdkadapter.f(latLng2, bVar) : null;
                    this.f138852k1 = fVar;
                    if (fVar != null) {
                        ArrayList<com.garmin.android.library.mapsdkadapter.p> arrayList2 = this.f138859q.f138882b;
                        com.garmin.android.library.mapsdkadapter.p pVar2 = new com.garmin.android.library.mapsdkadapter.p();
                        pVar2.b(2131232001);
                        pVar2.d(this.f138852k1);
                        com.garmin.android.library.mapsdkadapter.o oVar2 = pVar2.f50327a;
                        oVar2.f50311c = 0.5f;
                        oVar2.f50312d = "-1";
                        arrayList2.add(pVar2);
                        aVar2.b(this.f138852k1);
                    }
                    if (this.f138850j1 != null || this.f138852k1 != null) {
                        this.f190659i = aVar2.a();
                    }
                }
            } else if (this.X0 != null) {
                com.garmin.android.library.mapsdkadapter.e.a aVar3 = new com.garmin.android.library.mapsdkadapter.e.a();
                this.X0.f().forEach(new a73.o(aVar3, 9));
                this.f190659i = aVar3.a();
                a1 a1Var = a1.f22992a;
                Context contextRequireContext = requireContext();
                a1Var.getClass();
                ie2.h.a aVarA = a1.a(contextRequireContext);
                aVarA.b((Collection) this.X0.f().stream().map(new com.google.android.material.color.utilities.f(17)).collect(Collectors.toList()));
                d dVar2 = this.f138859q;
                ie2.t tVar = new ie2.t();
                tVar.f93176a = aVarA.a();
                dVar2.f138886f = tVar;
                List<b1> list7 = fr.c.f73284a;
                b1.q qVar = b1.q.f139726m;
                p13.j0 j0Var = p13.j0.f134944a;
                e7(new t1(qVar, j0Var, j0Var));
                f7();
            } else {
                strArr = this.Z0;
                if (((strArr != null || strArr.length <= 0) && this.f138842b1 == null) || this.W0 == null) {
                    d14 = null;
                    i14 = 0;
                    mVar = this.W0;
                    if (mVar != null && mVar.getMaxLat() != null && this.W0.getMaxLon() != null && this.W0.getMinLat() != null && this.W0.getMinLon() != null) {
                        com.garmin.android.library.mapsdkadapter.e.a aVar4 = new com.garmin.android.library.mapsdkadapter.e.a();
                        double dDoubleValue2 = this.W0.getMaxLat().doubleValue();
                        double dDoubleValue3 = this.W0.getMaxLon().doubleValue();
                        com.garmin.android.library.mapsdkadapter.i.b bVar2 = com.garmin.android.library.mapsdkadapter.i.b.WGS84;
                        aVar4.b(new com.garmin.android.library.mapsdkadapter.f(dDoubleValue2, dDoubleValue3, bVar2));
                        aVar4.b(new com.garmin.android.library.mapsdkadapter.f(this.W0.getMinLat().doubleValue(), this.W0.getMinLon().doubleValue(), bVar2));
                        this.f190659i = aVar4.a();
                        if (!z0.P(this.f138857p.C().f4358a) || z0.o(this.f138857p.C().f4358a)) {
                            if (!z0.P(this.f138857p.C().f4358a) || z0.o(this.f138857p.C().f4358a)) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            a2 a2Var = a2.ACTIVITIES;
                            if (this.U0 != null) {
                                str = BooleanUtils.NO;
                            } else {
                                str = BooleanUtils.YES;
                            }
                            i2.a(a2Var, "ActivityMapFragment", "addLapMarkers() lap summary list null: ".concat(str));
                            if (this.f138853l1 != null) {
                                listZ7 = z7();
                                c1 c1Var = this.f138853l1;
                                list = c1Var.f139767d;
                                list2 = c1Var.f139764a;
                                list3 = c1Var.f139765b;
                                if (listZ7 != null) {
                                    size = listZ7.size();
                                    this.f138861r = new SparseIntArray(size);
                                    if (size > 1) {
                                        while (i14 < size) {
                                            x0Var = listZ7.get(i14);
                                            if (x0Var != null) {
                                                if (z14) {
                                                    dOrElse = list.stream().filter(new y0(x0Var.Z2(), 3)).findFirst().orElse(d14);
                                                    d15 = null;
                                                } else {
                                                    if (x0Var.getDuration() != null) {
                                                        dDoubleValue = x0Var.getDuration().doubleValue();
                                                    } else {
                                                        dDoubleValue = 0.0d;
                                                    }
                                                    l3.f23124b.getClass();
                                                    long jZ5 = (long) (x0Var.Z2() + (dDoubleValue * ((double) 1000)));
                                                    d15 = null;
                                                    dOrElse = list.stream().filter(new y0(jZ5, 4)).findFirst().orElse(null);
                                                }
                                                iIndexOf = list.indexOf(dOrElse);
                                                if (iIndexOf != -1) {
                                                    location = new Location("");
                                                    location.setLatitude(list2.get(iIndexOf).doubleValue());
                                                    location.setLongitude(list3.get(iIndexOf).doubleValue());
                                                    if (com.garmin.android.library.mapsdkadapter.m.h(location)) {
                                                        J6(i14 + 1, i14, com.garmin.android.library.mapsdkadapter.n.c(location));
                                                    }
                                                }
                                            } else {
                                                d15 = d14;
                                            }
                                            i14++;
                                            d14 = d15;
                                        }
                                    }
                                    i2.a(a2.ACTIVITIES, "ActivityMapFragment", "Added lap markers to ".concat(d.class.getSimpleName()));
                                }
                            }
                        } else if (z0.b(am.x0.R0, this.f138857p.C().f4358a) || z0.x(this.f138857p.C().f4358a)) {
                            if (z0.P(this.f138857p.C().f4358a)) {
                                z14 = true;
                            } else {
                                z14 = true;
                            }
                            a2 a2Var2 = a2.ACTIVITIES;
                            if (this.U0 != null) {
                                str = BooleanUtils.NO;
                            } else {
                                str = BooleanUtils.YES;
                            }
                            i2.a(a2Var2, "ActivityMapFragment", "addLapMarkers() lap summary list null: ".concat(str));
                            if (this.f138853l1 != null) {
                                listZ7 = z7();
                                c1 c1Var2 = this.f138853l1;
                                list = c1Var2.f139767d;
                                list2 = c1Var2.f139764a;
                                list3 = c1Var2.f139765b;
                                if (listZ7 != null) {
                                    size = listZ7.size();
                                    this.f138861r = new SparseIntArray(size);
                                    if (size > 1) {
                                        while (i14 < size) {
                                            x0Var = listZ7.get(i14);
                                            if (x0Var != null) {
                                                if (z14) {
                                                    dOrElse = list.stream().filter(new y0(x0Var.Z2(), 3)).findFirst().orElse(d14);
                                                    d15 = null;
                                                } else {
                                                    if (x0Var.getDuration() != null) {
                                                        dDoubleValue = x0Var.getDuration().doubleValue();
                                                    } else {
                                                        dDoubleValue = 0.0d;
                                                    }
                                                    l3.f23124b.getClass();
                                                    long jZ6 = (long) (x0Var.Z2() + (dDoubleValue * ((double) 1000)));
                                                    d15 = null;
                                                    dOrElse = list.stream().filter(new y0(jZ6, 4)).findFirst().orElse(null);
                                                }
                                                iIndexOf = list.indexOf(dOrElse);
                                                if (iIndexOf != -1) {
                                                    location = new Location("");
                                                    location.setLatitude(list2.get(iIndexOf).doubleValue());
                                                    location.setLongitude(list3.get(iIndexOf).doubleValue());
                                                    if (com.garmin.android.library.mapsdkadapter.m.h(location)) {
                                                        J6(i14 + 1, i14, com.garmin.android.library.mapsdkadapter.n.c(location));
                                                    }
                                                }
                                            } else {
                                                d15 = d14;
                                            }
                                            i14++;
                                            d14 = d15;
                                        }
                                    }
                                    i2.a(a2.ACTIVITIES, "ActivityMapFragment", "Added lap markers to ".concat(d.class.getSimpleName()));
                                }
                            }
                        } else {
                            K6();
                        }
                        T6(this.W0.getEncodedSamples(), this.W0.getEncodedLevels());
                    }
                } else {
                    f7();
                    if (this.f138842b1 == null || (aVar = this.T0) == null || aVar.D() == null) {
                        Resources resources = requireContext().getResources();
                        l22.a aVar5 = new l22.a(requireContext());
                        com.garmin.android.apps.connectmobile.activities.newmodel.a aVar6 = this.T0;
                        ps.p pVar3 = this.U0;
                        String[] strArr4 = this.Z0;
                        ?? r16 = this.f138841a1;
                        c0 c0Var = c0.f138827a;
                        resources.getClass();
                        List listG = pVar3 != null ? pVar3.g() : null;
                        if (r16 == 0 || (strArr4 != null && r16.length == strArr4.length)) {
                            r17 = 0;
                            z15 = true;
                            list4 = listG;
                        } else if (listG != null) {
                            ArrayList arrayList3 = new ArrayList();
                            for (Object obj : listG) {
                                x0 x0Var3 = (x0) obj;
                                com.garmin.android.library.mapsdkadapter.f fVar3 = fVar;
                                int length2 = r16.length;
                                while (i16 < length2) {
                                    long jLongValue3 = r16[i16].longValue();
                                    long jZ7 = x0Var3.Z2();
                                    long jZ8 = x0Var3.Z2();
                                    Double duration2 = x0Var3.getDuration();
                                    if (jLongValue3 <= (duration2 != null ? p6.b.c(1000.0d, duration2) : 0).longValue() + jZ8 && jZ7 <= jLongValue3) {
                                        arrayList3.add(obj);
                                        break;
                                    }
                                    i16++;
                                }
                                fVar = fVar3;
                                i16 = 0;
                            }
                            r17 = fVar;
                            z15 = true;
                            list4 = arrayList3;
                        } else {
                            r17 = 0;
                            z15 = true;
                            list4 = null;
                        }
                        if (list4 == null) {
                            list4 = p13.j0.f134944a;
                        }
                        if (aVar6 == null || (wVarD = aVar6.D()) == null) {
                            r14 = r17;
                        } else {
                            listC = wVarD.C();
                        }
                        if (r14 == 0 || r14.isEmpty() || listG == null || strArr4 == null) {
                            r14 = listC;
                            r14 = listC;
                            r15 = r17;
                        } else {
                            uo.a aVar7 = new uo.a();
                            Iterator it3 = list4.iterator();
                            int i17 = 0;
                            while (it3.hasNext()) {
                                Object next = it3.next();
                                int i18 = i17 + 1;
                                if (i17 < 0) {
                                    p13.x.q();
                                    throw r17;
                                }
                                x0 x0Var4 = (x0) next;
                                if (i17 < strArr4.length) {
                                    ?? r18 = i17 != listG.size() + (-1) ? (x0) p13.h0.e0(i18, list4) : r17;
                                    ArrayList arrayList4 = new ArrayList();
                                    for (Object obj2 : r14) {
                                        Iterator it4 = it3;
                                        com.garmin.android.apps.connectmobile.activities.newmodel.a0 a0Var2 = (com.garmin.android.apps.connectmobile.activities.newmodel.a0) obj2;
                                        int i19 = i17;
                                        if (r16 != 0) {
                                            int length3 = r16.length;
                                            list6 = listG;
                                            int i24 = 0;
                                            while (true) {
                                                if (i24 >= length3) {
                                                    strArr3 = strArr4;
                                                    r25 = r17;
                                                    break;
                                                }
                                                r25 = r16[i24];
                                                long jLongValue4 = r25.longValue();
                                                long jZ9 = x0Var4.Z2();
                                                long jZ10 = x0Var4.Z2();
                                                int i25 = length3;
                                                Double duration3 = x0Var4.getDuration();
                                                int i26 = i24;
                                                strArr3 = strArr4;
                                                if (jLongValue4 <= (duration3 != null ? p6.b.c(1000.0d, duration3) : 0).longValue() + jZ10 && jZ9 <= jLongValue4) {
                                                    break;
                                                }
                                                i24 = i26 + 1;
                                                length3 = i25;
                                                strArr4 = strArr3;
                                            }
                                            if (r25 != 0) {
                                                jZ2 = r25.longValue();
                                            }
                                            if (r18 != 0) {
                                                if (r16 != 0) {
                                                    length = r16.length;
                                                    j14 = jZ2;
                                                    i15 = 0;
                                                    while (true) {
                                                        if (i15 < length) {
                                                            r36 = r17;
                                                            break;
                                                        }
                                                        ?? r19 = r16[i15];
                                                        jLongValue2 = r19.longValue();
                                                        long jZ11 = r18.Z2();
                                                        jZ4 = r18.Z2();
                                                        int i27 = i15;
                                                        duration = r18.getDuration();
                                                        r36 = r19;
                                                        int i28 = length;
                                                        if (duration != null) {
                                                            numberC = p6.b.c(1000.0d, duration);
                                                        } else {
                                                            numberC = 0;
                                                        }
                                                        if (jLongValue2 > numberC.longValue() + jZ4 && jZ11 <= jLongValue2) {
                                                            break;
                                                        }
                                                        i15 = i27 + 1;
                                                        length = i28;
                                                    }
                                                    if (r36 != 0) {
                                                        jZ3 = r36.longValue();
                                                    }
                                                    ValueOf = Long.valueOf(jZ3);
                                                } else {
                                                    j14 = jZ2;
                                                }
                                                jZ3 = r18.Z2();
                                                ValueOf = Long.valueOf(jZ3);
                                            } else {
                                                j14 = jZ2;
                                                ValueOf = r17;
                                            }
                                            if (a0Var2.G() < j14) {
                                                if (r18 != 0) {
                                                    jG = a0Var2.G();
                                                    if (ValueOf != 0) {
                                                        jLongValue = ValueOf.longValue();
                                                    } else {
                                                        jLongValue = 0;
                                                    }
                                                    if (jG < jLongValue) {
                                                        arrayList4.add(obj2);
                                                    }
                                                } else {
                                                    arrayList4.add(obj2);
                                                }
                                            }
                                            it3 = it4;
                                            i17 = i19;
                                            listG = list6;
                                            strArr4 = strArr3;
                                        } else {
                                            list6 = listG;
                                            strArr3 = strArr4;
                                        }
                                        jZ2 = x0Var4.Z2();
                                        if (r18 != 0) {
                                            if (r16 != 0) {
                                                length = r16.length;
                                                j14 = jZ2;
                                                i15 = 0;
                                                while (true) {
                                                    if (i15 < length) {
                                                        r36 = r17;
                                                        break;
                                                    }
                                                    ?? r110 = r16[i15];
                                                    jLongValue2 = r110.longValue();
                                                    long jZ12 = r18.Z2();
                                                    jZ4 = r18.Z2();
                                                    int i29 = i15;
                                                    duration = r18.getDuration();
                                                    r36 = r110;
                                                    int i210 = length;
                                                    if (duration != null) {
                                                        numberC = p6.b.c(1000.0d, duration);
                                                    } else {
                                                        numberC = 0;
                                                    }
                                                    if (jLongValue2 > numberC.longValue() + jZ4) {
                                                    }
                                                    i15 = i29 + 1;
                                                    length = i210;
                                                }
                                                if (r36 != 0) {
                                                    jZ3 = r36.longValue();
                                                }
                                                ValueOf = Long.valueOf(jZ3);
                                            } else {
                                                j14 = jZ2;
                                            }
                                            jZ3 = r18.Z2();
                                            ValueOf = Long.valueOf(jZ3);
                                        } else {
                                            j14 = jZ2;
                                            ValueOf = r17;
                                        }
                                        if (a0Var2.G() < j14) {
                                            if (r18 != 0) {
                                                jG = a0Var2.G();
                                                if (ValueOf != 0) {
                                                    jLongValue = ValueOf.longValue();
                                                } else {
                                                    jLongValue = 0;
                                                }
                                                if (jG < jLongValue) {
                                                    arrayList4.add(obj2);
                                                }
                                            } else {
                                                arrayList4.add(obj2);
                                            }
                                        }
                                        it3 = it4;
                                        i17 = i19;
                                        listG = list6;
                                        strArr4 = strArr3;
                                    }
                                    it = it3;
                                    int i30 = i17;
                                    list5 = listG;
                                    strArr2 = strArr4;
                                    j8 = 4652007308841189376L;
                                    ArrayList arrayList5 = new ArrayList(arrayList4);
                                    com.garmin.android.apps.connectmobile.activities.newmodel.a0 a0Var3 = (com.garmin.android.apps.connectmobile.activities.newmodel.a0) p13.h0.n0(arrayList5);
                                    if (a0Var3 != null && (a0Var = (com.garmin.android.apps.connectmobile.activities.newmodel.a0) p13.h0.e0(r14.indexOf(a0Var3) + 1, r14)) != null) {
                                        arrayList5.add(a0Var);
                                    }
                                    am.x0 x0VarL = z0.l(am.x0.f4346x, strArr2[i30]);
                                    c0.f138827a.getClass();
                                    c0.b(resources, aVar5, aVar7, x0VarL, arrayList5);
                                } else {
                                    it = it3;
                                    list5 = listG;
                                    strArr2 = strArr4;
                                    j8 = 4652007308841189376L;
                                }
                                i17 = i18;
                                it3 = it;
                                listG = list5;
                                strArr4 = strArr2;
                            }
                            c0 c0Var2 = c0.f138827a;
                            Object objM0 = p13.h0.m0(r14);
                            objM0.getClass();
                            c0Var2.getClass();
                            c0.a(aVar5, aVar7, (com.garmin.android.apps.connectmobile.activities.newmodel.a0) objM0);
                            r15 = aVar7;
                        }
                    } else {
                        aVarC = c0.c(requireContext().getResources(), new l22.a(requireContext()), Arrays.asList(this.f138842b1), this.T0.D().C());
                        z15 = true;
                    }
                    if (r15 != 0) {
                        com.garmin.android.library.mapsdkadapter.e.a aVar8 = new com.garmin.android.library.mapsdkadapter.e.a();
                        List immutableList = Util.toImmutableList(r15.f172068b);
                        if (immutableList != null) {
                            r15 = aVarC;
                            Iterator it5 = immutableList.iterator();
                            while (it5.hasNext()) {
                                this.f148294e.x((com.garmin.android.library.mapsdkadapter.p) it5.next());
                            }
                        }
                        r15 = aVarC;
                        List<com.garmin.android.library.mapsdkadapter.q> immutableList2 = Util.toImmutableList(r15.f172067a);
                        if (immutableList2 != null) {
                            for (com.garmin.android.library.mapsdkadapter.q qVar2 : immutableList2) {
                                List<com.garmin.android.library.mapsdkadapter.f> list8 = qVar2.f50328a.f93153a;
                                if (list8 != null) {
                                    Iterator it6 = list8.iterator();
                                    while (it6.hasNext()) {
                                        aVar8.b((com.garmin.android.library.mapsdkadapter.f) it6.next());
                                    }
                                }
                                qe2.h hVar3 = this.f148294e;
                                hVar3.getClass();
                                hVar3.h(qVar2);
                            }
                        }
                        this.f190659i = aVar8.a();
                        if (this.f138842b1 == null && this.Z0 == null) {
                            qe2.h hVar4 = this.f148294e;
                            hVar4.getClass();
                            boolean z16 = z15;
                            com.garmin.android.library.mapsdkadapter.i.a.e(hVar4, z16, z16, 28);
                        } else {
                            boolean z17 = z15;
                            qe2.h hVar5 = this.f148294e;
                            if (hVar5 != null) {
                                hVar5.d(z17, false, 0.0f);
                            }
                        }
                    }
                }
            }
        } else if (this.X0 != null) {
            com.garmin.android.library.mapsdkadapter.e.a aVar9 = new com.garmin.android.library.mapsdkadapter.e.a();
            this.X0.f().forEach(new a73.o(aVar9, 9));
            this.f190659i = aVar9.a();
            a1 a1Var2 = a1.f22992a;
            Context contextRequireContext2 = requireContext();
            a1Var2.getClass();
            ie2.h.a aVarA2 = a1.a(contextRequireContext2);
            aVarA2.b((Collection) this.X0.f().stream().map(new com.google.android.material.color.utilities.f(17)).collect(Collectors.toList()));
            d dVar3 = this.f138859q;
            ie2.t tVar2 = new ie2.t();
            tVar2.f93176a = aVarA2.a();
            dVar3.f138886f = tVar2;
            List<b1> list9 = fr.c.f73284a;
            b1.q qVar3 = b1.q.f139726m;
            p13.j0 j0Var2 = p13.j0.f134944a;
            e7(new t1(qVar3, j0Var2, j0Var2));
            f7();
        } else {
            strArr = this.Z0;
            if (strArr != null) {
            }
            d14 = null;
            i14 = 0;
            mVar = this.W0;
            if (mVar != null) {
                com.garmin.android.library.mapsdkadapter.e.a aVar10 = new com.garmin.android.library.mapsdkadapter.e.a();
                double dDoubleValue4 = this.W0.getMaxLat().doubleValue();
                double dDoubleValue5 = this.W0.getMaxLon().doubleValue();
                com.garmin.android.library.mapsdkadapter.i.b bVar3 = com.garmin.android.library.mapsdkadapter.i.b.WGS84;
                aVar10.b(new com.garmin.android.library.mapsdkadapter.f(dDoubleValue4, dDoubleValue5, bVar3));
                aVar10.b(new com.garmin.android.library.mapsdkadapter.f(this.W0.getMinLat().doubleValue(), this.W0.getMinLon().doubleValue(), bVar3));
                this.f190659i = aVar10.a();
                if (z0.P(this.f138857p.C().f4358a)) {
                    if (z0.P(this.f138857p.C().f4358a)) {
                        z14 = true;
                    } else {
                        z14 = true;
                    }
                    a2 a2Var3 = a2.ACTIVITIES;
                    if (this.U0 != null) {
                        str = BooleanUtils.NO;
                    } else {
                        str = BooleanUtils.YES;
                    }
                    i2.a(a2Var3, "ActivityMapFragment", "addLapMarkers() lap summary list null: ".concat(str));
                    if (this.f138853l1 != null) {
                        listZ7 = z7();
                        c1 c1Var3 = this.f138853l1;
                        list = c1Var3.f139767d;
                        list2 = c1Var3.f139764a;
                        list3 = c1Var3.f139765b;
                        if (listZ7 != null) {
                            size = listZ7.size();
                            this.f138861r = new SparseIntArray(size);
                            if (size > 1) {
                                while (i14 < size) {
                                    x0Var = listZ7.get(i14);
                                    if (x0Var != null) {
                                        if (z14) {
                                            dOrElse = list.stream().filter(new y0(x0Var.Z2(), 3)).findFirst().orElse(d14);
                                            d15 = null;
                                        } else {
                                            if (x0Var.getDuration() != null) {
                                                dDoubleValue = x0Var.getDuration().doubleValue();
                                            } else {
                                                dDoubleValue = 0.0d;
                                            }
                                            l3.f23124b.getClass();
                                            long jZ13 = (long) (x0Var.Z2() + (dDoubleValue * ((double) 1000)));
                                            d15 = null;
                                            dOrElse = list.stream().filter(new y0(jZ13, 4)).findFirst().orElse(null);
                                        }
                                        iIndexOf = list.indexOf(dOrElse);
                                        if (iIndexOf != -1) {
                                            location = new Location("");
                                            location.setLatitude(list2.get(iIndexOf).doubleValue());
                                            location.setLongitude(list3.get(iIndexOf).doubleValue());
                                            if (com.garmin.android.library.mapsdkadapter.m.h(location)) {
                                                J6(i14 + 1, i14, com.garmin.android.library.mapsdkadapter.n.c(location));
                                            }
                                        }
                                    } else {
                                        d15 = d14;
                                    }
                                    i14++;
                                    d14 = d15;
                                }
                            }
                            i2.a(a2.ACTIVITIES, "ActivityMapFragment", "Added lap markers to ".concat(d.class.getSimpleName()));
                        }
                    }
                } else {
                    if (z0.P(this.f138857p.C().f4358a)) {
                        z14 = true;
                    } else {
                        z14 = true;
                    }
                    a2 a2Var4 = a2.ACTIVITIES;
                    if (this.U0 != null) {
                        str = BooleanUtils.NO;
                    } else {
                        str = BooleanUtils.YES;
                    }
                    i2.a(a2Var4, "ActivityMapFragment", "addLapMarkers() lap summary list null: ".concat(str));
                    if (this.f138853l1 != null) {
                        listZ7 = z7();
                        c1 c1Var4 = this.f138853l1;
                        list = c1Var4.f139767d;
                        list2 = c1Var4.f139764a;
                        list3 = c1Var4.f139765b;
                        if (listZ7 != null) {
                            size = listZ7.size();
                            this.f138861r = new SparseIntArray(size);
                            if (size > 1) {
                                while (i14 < size) {
                                    x0Var = listZ7.get(i14);
                                    if (x0Var != null) {
                                        if (z14) {
                                            dOrElse = list.stream().filter(new y0(x0Var.Z2(), 3)).findFirst().orElse(d14);
                                            d15 = null;
                                        } else {
                                            if (x0Var.getDuration() != null) {
                                                dDoubleValue = x0Var.getDuration().doubleValue();
                                            } else {
                                                dDoubleValue = 0.0d;
                                            }
                                            l3.f23124b.getClass();
                                            long jZ14 = (long) (x0Var.Z2() + (dDoubleValue * ((double) 1000)));
                                            d15 = null;
                                            dOrElse = list.stream().filter(new y0(jZ14, 4)).findFirst().orElse(null);
                                        }
                                        iIndexOf = list.indexOf(dOrElse);
                                        if (iIndexOf != -1) {
                                            location = new Location("");
                                            location.setLatitude(list2.get(iIndexOf).doubleValue());
                                            location.setLongitude(list3.get(iIndexOf).doubleValue());
                                            if (com.garmin.android.library.mapsdkadapter.m.h(location)) {
                                                J6(i14 + 1, i14, com.garmin.android.library.mapsdkadapter.n.c(location));
                                            }
                                        }
                                    } else {
                                        d15 = d14;
                                    }
                                    i14++;
                                    d14 = d15;
                                }
                            }
                            i2.a(a2.ACTIVITIES, "ActivityMapFragment", "Added lap markers to ".concat(d.class.getSimpleName()));
                        }
                    }
                }
                T6(this.W0.getEncodedSamples(), this.W0.getEncodedLevels());
            }
        }
        r15 = aVarC;
        requireActivity().runOnUiThread(this.D1);
    }

    public final void e7(t1 t1Var) {
        if (t1Var != null) {
            this.f148293d.removeAllViews();
            b1 b1Var = t1Var.f140222a;
            int i14 = b1Var.f139697i;
            if (i14 == 0) {
                return;
            }
            FrameLayout frameLayout = this.f148293d;
            if (i14 != -1) {
                frameLayout.addView(requireActivity().getLayoutInflater().inflate(i14, (ViewGroup) null));
            } else {
                frameLayout.addView(requireActivity().getLayoutInflater().inflate(R.layout.polyline_legend_full_map, (ViewGroup) null));
                ((ImageView) this.f148293d.findViewById(R.id.legend_view)).setImageDrawable(t1Var.d(requireContext()));
                ((TextView) this.f148293d.findViewById(R.id.legend_left_tv)).setText(getString(b1Var.f139691c));
                ((TextView) this.f148293d.findViewById(R.id.legend_right_tv)).setText(getString(b1Var.f139692d));
            }
        }
        this.f148293d.setVisibility(0);
        if (this.f148293d.getChildCount() > 0) {
            View childAt = this.f148293d.getChildAt(0);
            if (childAt instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) childAt;
                viewGroup.setBackground(a7.b.getDrawable(requireContext(), R.drawable.legend_bg_rounded_light));
                for (int i15 = 0; i15 < viewGroup.getChildCount(); i15++) {
                    View childAt2 = viewGroup.getChildAt(i15);
                    if (childAt2 instanceof TextView) {
                        ((TextView) childAt2).setTextColor(a7.b.getColor(requireContext(), R.color.gcm_map_legend_text_color));
                    }
                }
            }
        }
        this.f148293d.requestLayout();
    }

    public final void f7() {
        this.M0.setShowMapOptions(true);
        this.M0.setShowNewMapButtons(false);
    }

    public final void g7() {
        s sVar = this.f138866u1;
        com.garmin.android.apps.connectmobile.activities.newmodel.h hVar = this.f138857p;
        long j8 = hVar.f29448a;
        am.x0 x0VarC = hVar.C();
        sVar.getClass();
        x0VarC.getClass();
        androidx.lifecycle.w0 w0VarK = sVar.f138974c;
        if (w0VarK == null) {
            cw.a.M().getClass();
            w0VarK = new dm.c(j8, x0VarC, true).k();
            w0VarK.getClass();
            sVar.f138974c = w0VarK;
        }
        w0VarK.f(this, new po.e(this, 0));
    }

    public void h7() {
        s sVar = this.f138866u1;
        long j8 = this.f138857p.f29448a;
        androidx.lifecycle.w0 w0VarK = sVar.f138976e;
        if (w0VarK == null) {
            cw.a.M().getClass();
            w0VarK = new n0(j8, true).k();
            w0VarK.getClass();
            sVar.f138976e = w0VarK;
        }
        w0VarK.f(this, new po.e(this, 1));
    }

    public final void i7() {
        s sVar = this.f138866u1;
        long j8 = this.f138857p.f29448a;
        androidx.lifecycle.y0<fw.m<y1>> y0Var = sVar.f138975d;
        int i14 = 2;
        if (y0Var == null) {
            vq.d dVar = new vq.d();
            e1 e1Var = e1.f129333a;
            x53.c cVar = s0.f129406a;
            ge1.b.T(e1Var, x53.b.f189152a, null, new vq.b(dVar, j8, null), 2);
            y0Var = dVar.f179427b;
            sVar.f138975d = y0Var;
        }
        y0Var.f(this, new po.e(this, i14));
    }

    public ArrayList j7() {
        List<w0> list;
        ArrayList arrayList = new ArrayList();
        if (this.f138856o1) {
            arrayList.add(new qw0.u(qw0.v.OBSTACLES, this.f138868v1.n(), true));
        }
        com.garmin.android.apps.connectmobile.activities.newmodel.h hVar = this.f138857p;
        if (hVar != null && (list = hVar.f29463p) != null && !list.isEmpty()) {
            arrayList.add(new qw0.u(qw0.v.JUMPS, this.f138858p1, true));
        }
        return arrayList;
    }

    public final String m7() {
        com.garmin.android.apps.connectmobile.activities.newmodel.h hVar = this.f138857p;
        if (hVar != null) {
            return hVar.C().f4358a;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0034, code lost:
    
        if (am.z0.b(am.x0.R0, r2.f138857p.C().f4358a) != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String o7(String str) {
        List<x1> list = this.V0;
        if (list != null && !list.isEmpty()) {
            if (!z0.d0(this.f138857p.C().f4358a) && !z0.P(this.f138857p.C().f4358a)) {
            }
            return getString(R.string.lbl_enduro_split_index, str);
        }
        return getString(R.string.laps_num, str);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00c8  */
    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        c1 c1Var;
        t1 t1Var;
        com.garmin.android.library.mapsdkadapter.i.d dVarE;
        super.onActivityCreated(bundle);
        l2.f37135b.getClass();
        Bundle bundleC = l2.a.b().c(this);
        qw0.s sVar = this.B1;
        if (bundleC != null) {
            this.f138845e1 = bundleC.getBoolean("GCM_hide_map_until_camera_idle", false);
            this.Z0 = bundleC.getStringArray("GCM_extra_activity_legs_types");
            this.f138841a1 = (Long[]) bundleC.getSerializable("GCM_extra_activity_leg_start_times");
            this.f138842b1 = (d1[]) bundleC.getParcelableArray("extraMultisportLegs");
            this.f138843c1 = os.b.values()[bundleC.getInt("extraMapMode")];
            this.f138849i1 = bundleC.getInt("extraMapType", 1);
            this.f138853l1 = (c1) bundleC.getParcelable("extraMetricTrackLogs");
            this.f138854m1 = bundleC.getBoolean("isManualActivity");
            this.f138855n1 = bundleC.getBoolean("extraIsOwnActivity");
            this.f138876z1 = Boolean.valueOf(bundleC.getBoolean("extraHasFiveHzData"));
            this.A1 = bundleC.getString("extraDeviceName");
            this.f138846f1 = bundleC.getString("extraActivityType");
            this.f138872x1 = (ie2.c) bundleC.getParcelable("extraCameraState");
            os.b bVar = this.f138843c1;
            if (bVar == os.b.ACTIVITY_LAPS_MAP) {
                this.P0 = false;
            } else if (bVar == os.b.ACTIVITY_SEGMENTS_MAP) {
                this.P0 = true;
            } else if (bVar == os.b.ACTIVITY_MULTISPORT_MAP) {
                this.P0 = false;
            }
            qe2.h hVar = this.f148294e;
            if (hVar != null) {
                com.garmin.android.library.mapsdkadapter.i iVar = hVar.f144584a;
                if (this.X0 != null) {
                    com.garmin.android.library.mapsdkadapter.i.d f50264r = iVar.getF50264r();
                    dVarE = com.garmin.android.library.mapsdkadapter.i.d.GOOGLE;
                    if (f50264r == dVarE) {
                        dVarE = iVar.getF50264r();
                    }
                } else {
                    String str = this.f138846f1;
                    if (str == null || iVar.getF50264r() == (dVarE = sVar.E(str))) {
                        dVarE = iVar.getF50264r();
                    }
                }
            } else {
                dVarE = com.garmin.android.library.mapsdkadapter.i.d.GOOGLE;
            }
            this.f138848h1 = dVarE;
        }
        GCMMapView gCMMapView = this.f148291b;
        if (gCMMapView != null) {
            gCMMapView.a(this.f138848h1, this);
            this.f148294e = gCMMapView.getMapProxy();
            G7(this.f138849i1);
            String str2 = this.f138846f1;
            boolean zB = str2 != null ? sVar.B(str2) : false;
            qe2.h hVar2 = this.f148294e;
            if (hVar2 != null) {
                hVar2.R(new po.d(this, hVar2));
                if (this.f138846f1 != null) {
                    boolean z14 = zB && this.f138848h1 == com.garmin.android.library.mapsdkadapter.i.d.MAPBOX;
                    hVar2.D(z14);
                    this.M0.set3dEnabled(z14);
                }
                if (this.f138848h1 == com.garmin.android.library.mapsdkadapter.i.d.MAPBOX && zB && this.f138847g1) {
                    hVar2.A(new po.d(this, hVar2));
                } else {
                    hVar2.B(this);
                    hVar2.O(this);
                    hVar2.E(this);
                }
                if (this.f138843c1 != os.b.ACTIVITY_MULTISPORT_MAP) {
                    hVar2.k(new e());
                }
            }
        }
        this.M0.setMapSettingsClickListener(new r2(new po.b(this, 1)));
        this.M0.setCompassClickListener(new r2(new po.b(this, 2)));
        if (this.f138847g1) {
            this.M0.setToggle3DClickListener(new r2(new ph1.d(5, this, gCMMapView)));
        }
        c1 c1Var2 = this.f138853l1;
        if (c1Var2 == null || !c1Var2.d()) {
            return;
        }
        f12.l.f68084a.getClass();
        if (!f12.l.a.a().i4() || (c1Var = this.f138853l1) == null || (t1Var = c1Var.f139768e) == null) {
            return;
        }
        ((TextView) this.N0.findViewById(R.id.tool_tip_label)).setText(getString(R.string.msg_select_new_data_overlay, getString(t1Var.f140222a.f139690b)));
        this.N0.setVisibility(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qw0.a, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        try {
            this.f190658h = (xf1.d.a) context;
            this.Q0 = am.j.z(f12.l.f68084a);
        } catch (ClassCastException unused) {
            wr.g.u(context, " must implement SegmentsMapFragmentListener");
        }
    }

    @Override // xf1.d, qw0.a, com.garmin.android.library.mapsdkadapter.i.g
    public final void onCameraIdle() {
        float f50270z = this.f148294e.f144584a.getF50270z();
        Iterator it = this.f138865t1.iterator();
        while (true) {
            boolean z14 = true;
            if (!it.hasNext()) {
                break;
            }
            ie2.j jVar = (ie2.j) it.next();
            if (f50270z <= 16.0f) {
                z14 = false;
            }
            jVar.setVisible(z14);
        }
        xf1.d.a aVar = this.f190658h;
        if (aVar != null) {
            aVar.o7();
        }
        i2.a(a2.ACTIVITIES, "ActivityMapFragment", "initMapView() - onCameraIdle ----");
        if (this.f138874y1 || this.f148294e.f144584a.getF50264r() != com.garmin.android.library.mapsdkadapter.i.d.MAPBOX) {
            return;
        }
        this.f138874y1 = true;
        ie2.c cVar = this.f138872x1;
        qe2.h hVar = this.f148294e;
        if (cVar == null) {
            hVar.b(true, Boolean.FALSE);
            return;
        }
        if (hVar != null) {
            com.garmin.android.library.mapsdkadapter.f fVar = cVar.f93111a;
            double d14 = cVar.f93112b;
            double d15 = cVar.f93113c;
            double d16 = cVar.f93114d - 0.5d;
            fVar.getClass();
            ie2.c cVar2 = new ie2.c(fVar, d14, d15, d16);
            Handler handler = new Handler(Looper.getMainLooper());
            handler.post(new at0.c(hVar, cVar2, handler, cVar, 18));
        }
    }

    @Override // androidx.fragment.app.Fragment
    @SuppressLint({"InflateParams"})
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f138866u1 = (s) new androidx.lifecycle.x1(requireActivity()).a(s.class);
        this.f138847g1 = this.B1.c();
        this.R0 = false;
        View viewInflate = getLayoutInflater().inflate(R.layout.gcm_lap_popup_course, (ViewGroup) null);
        this.f138864t = viewInflate;
        this.f138869w = (TextView) viewInflate.findViewById(R.id.lap_title);
        this.f138871x = (ImageView) this.f138864t.findViewById(R.id.lap_title_image);
        this.f138873y = this.f138864t.findViewById(R.id.field1);
        this.D = (TextView) this.f138864t.findViewById(R.id.lap_field_1_label);
        this.E = (TextView) this.f138864t.findViewById(R.id.lap_field_1_value);
        this.f138875z = this.f138864t.findViewById(R.id.field2);
        this.I0 = (TextView) this.f138864t.findViewById(R.id.lap_field_2_label);
        this.H0 = (TextView) this.f138864t.findViewById(R.id.lap_field_2_value);
        this.A = this.f138864t.findViewById(R.id.field3);
        this.K0 = (TextView) this.f138864t.findViewById(R.id.lap_field_3_label);
        this.J0 = (TextView) this.f138864t.findViewById(R.id.lap_field_3_value);
        this.B = this.f138864t.findViewById(R.id.field4);
        this.L0 = (TextView) this.f138864t.findViewById(R.id.lap_field_4_label);
        this.F = (TextView) this.f138864t.findViewById(R.id.lap_field_4_value);
        this.C = this.f138864t.findViewById(R.id.field5);
        this.I = (TextView) this.f138864t.findViewById(R.id.lap_field_5_label);
        this.P = (TextView) this.f138864t.findViewById(R.id.lap_field_5_value);
        this.f138867v = this.f138864t.findViewById(R.id.diving_fields);
        ((TextView) this.f138864t.findViewById(R.id.lap_dive_number_label)).setText(getString(R.string.lbl_dive_lap));
        this.T = (TextView) this.f138864t.findViewById(R.id.lap_dive_number);
        ((TextView) this.f138864t.findViewById(R.id.lap_dive_time_label)).setText(getString(R.string.lbl_time) + ":");
        this.X = (TextView) this.f138864t.findViewById(R.id.lap_dive_time);
        ((TextView) this.f138864t.findViewById(R.id.lap_dive_max_depth_label)).setText(getString(R.string.lbl_max_depth) + ":");
        this.Y = (TextView) this.f138864t.findViewById(R.id.lap_dive_max_depth);
        ((TextView) this.f138864t.findViewById(R.id.lap_dive_surface_interval_label)).setText(getString(R.string.lbl_surface_interval_abbreviated) + ":");
        this.Z = (TextView) this.f138864t.findViewById(R.id.lap_dive_surface_interval);
        ((TextView) this.f138864t.findViewById(R.id.lap_dive_entry_location_label)).setText(getString(R.string.activity_details_apnea_lap_map_popup_entry_location) + ":");
        this.f138851k0 = (TextView) this.f138864t.findViewById(R.id.lap_dive_entry_location);
        this.O0 = true;
    }

    @Override // qw0.a, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.R0 = false;
        View viewOnCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.M0 = (MapOptionsContainer) viewOnCreateView.findViewById(R.id.map_options_container);
        this.N0 = (BubbleLayout) viewOnCreateView.findViewById(R.id.tool_tip_container);
        return viewOnCreateView;
    }

    @Override // qw0.a, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        this.R0 = false;
        if (this.f190663m) {
            return;
        }
        if (this.P0) {
            z6(this.f190664n);
        }
        p7();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        this.R0 = true;
    }

    public void p7() {
        com.garmin.android.apps.connectmobile.activities.newmodel.h hVar;
        am.x0 x0VarC;
        this.f148294e.clear();
        com.garmin.android.apps.connectmobile.activities.newmodel.h hVar2 = this.f138857p;
        if (((hVar2 == null || (x0VarC = hVar2.C()) == null) ? false : tq.k.j(x0VarC)) || ((hVar = this.f138857p) != null && hVar.G())) {
            i7();
        } else if (this.U0 != null) {
            C7();
        } else if (this.f138857p != null) {
            h7();
        }
    }

    public final boolean q7() {
        List<x1> list = this.V0;
        Object obj = null;
        if (list != null) {
            for (Object obj2 : list) {
                if (((x1) obj2).a2() == qs.x.TIMING_GATE) {
                    obj = obj2;
                    break;
                }
            }
        }
        return obj != null;
    }

    public final void r7() {
        this.f138875z.setVisibility(8);
        this.H0.setVisibility(8);
        this.I0.setVisibility(8);
        this.A.setVisibility(8);
        this.K0.setVisibility(8);
        this.J0.setVisibility(8);
        this.B.setVisibility(0);
        this.L0.setVisibility(0);
        this.F.setVisibility(0);
        this.f138873y.setVisibility(0);
        this.D.setVisibility(0);
        this.E.setVisibility(0);
        this.C.setVisibility(0);
        this.P.setVisibility(0);
        this.I.setVisibility(0);
    }

    public final boolean u7() {
        return (getActivity() == null || getActivity().isFinishing()) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0031  */
    public void v7(com.garmin.android.apps.connectmobile.activities.newmodel.h hVar, to.f fVar) {
        c1 c1Var;
        i2.a(a2.ACTIVITIES, "ActivityMapFragment", "onActivitySummaryReceived()");
        this.f138857p = hVar;
        this.Y0 = fVar;
        if (hVar != null) {
            String str = hVar.C().f4358a;
            z0 z0Var = z0.f4390a;
            if (z0.b(am.x0.O0, str) && fr.a.d(hVar.f29464q, qs.x.OBSTACLE)) {
                this.f138856o1 = true;
            } else {
                this.f138856o1 = false;
            }
        } else {
            this.f138856o1 = false;
        }
        if (getActivity() != null && u7()) {
            getActivity().invalidateOptionsMenu();
        }
        com.garmin.android.apps.connectmobile.activities.newmodel.h hVar2 = this.f138857p;
        if (hVar2 != null && (c1Var = this.f138853l1) != null) {
            String str2 = hVar2.C().f4358a;
            List<b1> list = fr.c.f73284a;
            t1 t1Var = null;
            b1.a aVar = z0.o(str2) ? b1.a.f139701m : null;
            if (aVar != null) {
                List<t1> list2 = c1Var.f139766c;
                ArrayList arrayList = new ArrayList();
                for (Object obj : list2) {
                    if (p005kotlin.jvm.internal.s.g(((t1) obj).f140222a, aVar)) {
                        arrayList.add(obj);
                    }
                }
                if (!arrayList.isEmpty()) {
                    t1Var = (t1) p13.h0.b0(arrayList);
                }
            }
            c1Var.f139768e = t1Var;
        }
        if (isResumed()) {
            p7();
        }
    }

    public final void w7() {
        this.f138862r1 = -1;
        qe2.h hVar = this.f148294e;
        if (hVar != null) {
            hVar.q();
            qe2.h hVar2 = this.f148294e;
            hVar2.getClass();
            com.garmin.android.library.mapsdkadapter.i.a.e(hVar2, true, true, 28);
        }
        c1 c1Var = this.f138853l1;
        if (c1Var != null) {
            J7(c1Var.f139768e);
        }
    }

    public void x7(qw0.v vVar, boolean z14) {
        int i14 = c.f138880b[vVar.ordinal()];
        am.e eVar = this.f138868v1;
        if (i14 == 1) {
            eVar.a(z14);
            F7(z14);
            return;
        }
        if (i14 == 2) {
            this.f138860q1 = z14;
            K7(z14);
            return;
        }
        if (i14 == 3) {
            eVar.f(z14);
            H7(z14);
            return;
        }
        if (i14 != 4) {
            i2.f(a2.ACTIVITIES, "ActivityMapFragment", "Error! Did not handle switch type" + vVar + ".");
            return;
        }
        this.f138858p1 = z14;
        if (this.f148294e == null) {
            return;
        }
        if (z14) {
            M6();
        } else {
            B7();
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0020 A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:20:0x0039  */
    /* JADX WARN: Code duplicated, block: B:22:0x003c  */
    /* JADX WARN: Code duplicated, block: B:24:0x0051  */
    /* JADX WARN: Code duplicated, block: B:27:0x0064  */
    /* JADX WARN: Code duplicated, block: B:30:0x007c  */
    /* JADX WARN: Code duplicated, block: B:33:0x0091  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:44:0x00e6 A[LOOP:0: B:42:0x00e0->B:44:0x00e6, LOOP_END] */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1095)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:419)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:31)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:399)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:31)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:21)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    public final java.util.List<ps.x0> z7() {
        /*
            Method dump skipped, instruction units count: 310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: po.h.z7():java.util.List");
    }
}
