package com.garmin.android.apps.connectmobile.activities.charts;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.g1;
import androidx.core.view.j;
import androidx.core.view.s0;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.v;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.charts.FullscreenChartActivity;
import com.garmin.android.apps.connectmobile.activities.newmodel.o;
import com.garmin.android.apps.connectmobile.activities.newmodel.q0;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.l2;
import i3.e5;
import im.b0;
import im.e;
import im.f;
import im.n;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.WeakHashMap;
import java.util.function.IntPredicate;
import ms.y;
import ns.x0;
import org.koin.java.KoinJavaComponent;
import qm.i0;
import qm.k;
import qm.l;
import qm.l0;
import qm.m0;
import tr.d;
import tr.g;
import zm.p;
import zm.q;

/* JADX INFO: loaded from: classes7.dex */
public class FullscreenChartActivity extends com.garmin.android.apps.connectmobile.c implements bo1.c, a.InterfaceC0444a, lz.b {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f28936o = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e f28937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f28938b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayList f28939c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public p f28940d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList f28941e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public LinearLayout f28942f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public LinearLayout f28943g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public LinearLayout f28944h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public FrameLayout f28945i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public q f28946j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f28947k = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f28948l = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f28949m = true;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public fz.c f28950n = fz.c.TIME;

    public static ViewGroup.LayoutParams ha() {
        return new ViewGroup.LayoutParams(-1, -1);
    }

    public static void pa(Activity activity, ArrayList<im.b> arrayList, e eVar, Boolean bool, fz.c cVar) {
        if (activity != null) {
            Intent intent = new Intent(activity, (Class<?>) FullscreenChartActivity.class);
            Bundle bundle = new Bundle();
            bundle.putParcelableArrayList("extra_chart_data_list", arrayList);
            bundle.putParcelable("extra_activity_chart_type", eVar);
            bundle.putBoolean("extra_allow_overlay_toggle", bool.booleanValue());
            bundle.putParcelable("extra_x_axis_type", cVar);
            l2.f37135b.getClass();
            l2.a.b().a(intent, bundle);
            activity.startActivity(intent);
        }
    }

    @Override // lz.b
    public void J7() {
        this.f28948l = true;
        this.f28938b.f28957c = false;
        invalidateOptionsMenu();
    }

    @Override // com.garmin.android.apps.connectmobile.z1
    public final void applyBottomContentInsets() {
    }

    @Override // com.garmin.android.apps.connectmobile.activities.charts.a.InterfaceC0444a
    public void c6(p pVar) {
        String strIa;
        this.f28940d = pVar;
        p pVarGa = ga();
        if (pVarGa != null && this.f28937a != null) {
            boolean z14 = this.f28947k;
            p pVar2 = this.f28940d;
            if (z14) {
                strIa = ia(pVar2, pVarGa);
                ma(pVarGa);
            } else {
                strIa = ia(pVarGa, pVar2);
                la(pVarGa);
            }
            oa(this.f28946j, this);
            setTitle(strIa);
        }
        invalidateOptionsMenu();
    }

    public void ca() {
        im.b bVar;
        Intent intent = getIntent();
        l2.f37135b.getClass();
        Bundle bundleA = l2.a.a(intent);
        if (bundleA != null) {
            this.f28937a = (e) bundleA.getParcelable("extra_activity_chart_type");
            bVar = (im.b) bundleA.getParcelable("extra_activity_chart_data");
            this.f28949m = bundleA.getBoolean("extra_allow_overlay_toggle", true);
            this.f28941e = bundleA.getParcelableArrayList("extra_chart_data_list");
            this.f28950n = (fz.c) bundleA.getParcelable("extra_x_axis_type");
        } else {
            bVar = null;
        }
        setContentView(ja());
        View viewFindViewById = findViewById(R.id.content_frame);
        if (viewFindViewById != null) {
            e5 e5Var = new e5(16);
            WeakHashMap<View, g1> weakHashMap = s0.f6563a;
            s0.d.c(viewFindViewById, e5Var);
        }
        initActionBar(true);
        this.f28942f = (LinearLayout) findViewById(R.id.fullscreen_chart_container);
        this.f28943g = (LinearLayout) findViewById(R.id.fullscreen_chart_legend_container);
        this.f28944h = (LinearLayout) findViewById(R.id.fullscreen_chart_top_legend_container);
        this.f28945i = (FrameLayout) findViewById(R.id.fullscreen_content_overlay);
        this.f28938b = new a((LinearLayout) findViewById(R.id.gcm_sleep_chart_options_container), this);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.gcm_sleep_chart_options_container);
        if (linearLayout != null) {
            e5 e5Var2 = new e5(17);
            WeakHashMap<View, g1> weakHashMap2 = s0.f6563a;
            s0.d.c(linearLayout, e5Var2);
        }
        if (bVar != null) {
            ArrayList arrayList = new ArrayList(1);
            this.f28941e = arrayList;
            arrayList.add(bVar);
            ea();
            return;
        }
        if (this.f28941e != null) {
            ea();
        } else {
            finish();
        }
    }

    @SuppressLint({"SwitchIntDef"})
    public final boolean da() {
        int i14;
        e eVar = this.f28937a;
        return (eVar == null || (i14 = eVar.f94141a) == 27 || i14 == 29 || i14 == 32 || i14 == 35) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:78:0x02a7  */
    @SuppressLint({"SwitchIntDef"})
    public final void ea() {
        l0 l0VarA;
        g gVarB;
        p pVarGa = ga();
        e eVar = this.f28937a;
        if (pVarGa != null && eVar != null) {
            int i14 = eVar.f94141a;
            if (i14 != 2) {
                if (i14 == 27) {
                    View viewFindViewById = findViewById(R.id.left_container);
                    TextView textView = (TextView) viewFindViewById.findViewById(R.id.stats_label);
                    TextView textView2 = (TextView) viewFindViewById.findViewById(R.id.stats_value);
                    TextView textView3 = (TextView) viewFindViewById.findViewById(R.id.stats_unit);
                    View viewFindViewById2 = findViewById(R.id.right_container);
                    TextView textView4 = (TextView) viewFindViewById2.findViewById(R.id.stats_label);
                    TextView textView5 = (TextView) viewFindViewById2.findViewById(R.id.stats_value);
                    TextView textView6 = (TextView) viewFindViewById2.findViewById(R.id.stats_unit);
                    o oVarQ1 = pVarGa.Q1();
                    if (oVarQ1 instanceof o.c) {
                        o.c cVar = (o.c) oVarQ1;
                        double d14 = cVar.f29617m;
                        x0 x0Var = new x0(new l22.a(this), new y());
                        String string = x0Var.f127800c.getString(R.string.percent_sign);
                        textView2.setText(x0Var.b(16, Double.valueOf(d14), false));
                        textView3.setVisibility(0);
                        textView3.setText(string);
                        textView.setText(getString(R.string.lbl_left_balance));
                        textView5.setText(x0Var.b(16, Double.valueOf(cVar.f29618n), false));
                        textView6.setVisibility(0);
                        textView6.setText(string);
                        textView4.setText(getString(R.string.lbl_right_balance));
                    } else {
                        viewFindViewById.setVisibility(8);
                        viewFindViewById2.setVisibility(8);
                    }
                    ka(pVarGa);
                } else if (i14 == 42) {
                    q qVarF = ar.e.f(this, this.f28942f, this.f28943g, this.f28944h, pVarGa, -1, this.f28940d, eVar.f94143c, true, null, null, this.f28950n);
                    this.f28946j = qVarF;
                    oa(qVarF, this);
                } else if (i14 == 87) {
                    q qVarG = ar.e.g(this, this.f28942f, this.f28943g, this.f28944h, pVarGa, this.f28940d, eVar.f94143c, this.f28950n);
                    this.f28946j = qVarG;
                    oa(qVarG, this);
                } else if (i14 == 95) {
                    k kVar = k.f145395a;
                    int iG1 = pVarGa.getB1();
                    kVar.getClass();
                    l0 l0VarA2 = k.a(iG1);
                    g gVarB2 = k.b(pVarGa.getB1(), this);
                    o oVarQ2 = pVarGa.Q1();
                    o.d dVar = oVarQ2 instanceof o.d ? (o.d) oVarQ2 : null;
                    if (gVarB2 != null && l0VarA2 != null && dVar != null) {
                        im.b bVar = pVarGa instanceof im.b ? (im.b) pVarGa : null;
                        n nVar = bVar != null ? bVar.X : n.SEATED_STANDING;
                        if (gVarB2 instanceof tr.a) {
                            nVar.getClass();
                            ((tr.a) gVarB2).f166116b = nVar;
                        }
                        if (l0VarA2 instanceof l) {
                            nVar.getClass();
                            ((l) l0VarA2).f145396a = nVar;
                        }
                        m0 m0Var = new m0(this, l0VarA2, gVarB2);
                        m0Var.c(dVar, nVar);
                        NestedScrollView nestedScrollView = new NestedScrollView(this);
                        nestedScrollView.setLayoutParams(ha());
                        nestedScrollView.addView(m0Var, ha());
                        this.f28942f.addView(nestedScrollView);
                    }
                } else if (i14 == 17) {
                    k kVar2 = k.f145395a;
                    int iG2 = pVarGa.getB1();
                    kVar2.getClass();
                    l0 l0VarA3 = k.a(iG2);
                    g gVarB3 = k.b(pVarGa.getB1(), this);
                    if (gVarB3 != null && l0VarA3 != null) {
                        m0 m0Var2 = new m0(this, l0VarA3, gVarB3);
                        m0Var2.a(pVarGa.K(), pVarGa.getF94136a1(), false);
                        this.f28942f.addView(m0Var2, ha());
                    }
                } else if (i14 == 18) {
                    k kVar3 = k.f145395a;
                    int iG3 = pVarGa.getB1();
                    kVar3.getClass();
                    l0VarA = k.a(iG3);
                    gVarB = k.b(pVarGa.getB1(), this);
                    if (gVarB != null && l0VarA != null) {
                        m0 m0Var3 = new m0(this, l0VarA, gVarB);
                        m0Var3.a(pVarGa.M3(), pVarGa.getF94136a1(), false);
                        NestedScrollView nestedScrollView2 = new NestedScrollView(this);
                        nestedScrollView2.setLayoutParams(ha());
                        nestedScrollView2.addView(m0Var3, ha());
                        this.f28942f.addView(nestedScrollView2);
                    }
                } else if (i14 == 39 || i14 == 40) {
                    this.f28946j = ar.e.f(this, this.f28942f, this.f28943g, this.f28944h, pVarGa, -1, this.f28940d, null, true, null, null, this.f28950n);
                } else if (i14 == 78) {
                    m0 m0Var4 = new m0(this, new i0(), new d(new l22.a(this)));
                    if (pVarGa instanceof b0) {
                        b0 b0Var = (b0) pVarGa;
                        m0Var4.b(b0Var.X0, b0Var.getF113504n1());
                        NestedScrollView nestedScrollView3 = new NestedScrollView(this);
                        nestedScrollView3.setLayoutParams(ha());
                        nestedScrollView3.addView(m0Var4, ha());
                        this.f28942f.addView(nestedScrollView3);
                    }
                } else if (i14 == 79) {
                    k kVar4 = k.f145395a;
                    int iG4 = pVarGa.getB1();
                    kVar4.getClass();
                    l0VarA = k.a(iG4);
                    gVarB = k.b(pVarGa.getB1(), this);
                    if (gVarB != null) {
                        m0 m0Var5 = new m0(this, l0VarA, gVarB);
                        m0Var5.a(pVarGa.M3(), pVarGa.getF94136a1(), false);
                        NestedScrollView nestedScrollView4 = new NestedScrollView(this);
                        nestedScrollView4.setLayoutParams(ha());
                        nestedScrollView4.addView(m0Var5, ha());
                        this.f28942f.addView(nestedScrollView4);
                    }
                } else if (i14 != 90 && i14 != 91) {
                    switch (i14) {
                        case 46:
                        case 48:
                            findViewById(R.id.sleep_chart_options_scroll_view).setVisibility(8);
                            ka(pVarGa);
                            break;
                        case 47:
                            q qVarG2 = ar.e.g(this, this.f28942f, this.f28943g, this.f28944h, pVarGa, this.f28940d, eVar.f94143c, this.f28950n);
                            this.f28946j = qVarG2;
                            oa(qVarG2, this);
                            break;
                        default:
                            i2.d("FullscreenChartActivity", "calling default case in chart init switch");
                            ka(pVarGa);
                            break;
                    }
                } else {
                    boolean z14 = i14 == 90;
                    k kVar5 = k.f145395a;
                    int iG5 = pVarGa.getB1();
                    kVar5.getClass();
                    l0 l0VarA4 = k.a(iG5);
                    g gVarB4 = k.b(pVarGa.getB1(), this);
                    if (l0VarA4 != null && gVarB4 != null) {
                        m0 m0Var6 = new m0(this, l0VarA4, gVarB4);
                        m0Var6.a(pVarGa.K(), pVarGa.getF94136a1(), z14);
                        NestedScrollView nestedScrollView5 = new NestedScrollView(this);
                        nestedScrollView5.setLayoutParams(ha());
                        nestedScrollView5.addView(m0Var6, ha());
                        this.f28942f.addView(nestedScrollView5);
                    }
                }
            } else {
                q qVarG3 = ar.e.g(this, this.f28942f, this.f28943g, this.f28944h, pVarGa, this.f28940d, eVar.f94143c, this.f28950n);
                this.f28946j = qVarG3;
                oa(qVarG3, this);
            }
        }
        if (pVarGa != null) {
            initActionBar(true, pVarGa.getF113511u1());
            ArrayList arrayListE = im.d.e(pVarGa, this.f28941e);
            this.f28939c = arrayListE;
            this.f28938b.a(arrayListE);
            invalidateOptionsMenu();
            if (da()) {
                fa();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0040  */
    /* JADX WARN: Code duplicated, block: B:14:0x004e  */
    /* JADX WARN: Code duplicated, block: B:17:0x0055  */
    /* JADX WARN: Code duplicated, block: B:18:0x0058  */
    /* JADX WARN: Code duplicated, block: B:20:0x005b  */
    /* JADX WARN: Code duplicated, block: B:23:0x0064  */
    /* JADX WARN: Code duplicated, block: B:24:0x0067 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:25:0x0069  */
    /* JADX WARN: Code duplicated, block: B:28:0x0070  */
    /* JADX WARN: Code duplicated, block: B:33:0x007c  */
    public final void fa() {
        int iI2;
        e eVar;
        FrameLayout frameLayout;
        am.d dVar = (am.d) KoinJavaComponent.get(am.d.class);
        int iI3 = dVar.Y().f3932a.i2(1, "key_activity_chart_tip_flags");
        e eVar2 = this.f28937a;
        int i14 = 22;
        int i15 = -1;
        if (eVar2 != null) {
            final int i16 = eVar2.f94141a;
            int[] iArr = {17, 18, 78, 79, 95, 90, 91};
            int i17 = f.f94145a;
            if (((iI3 & 2) != 2 || (iI3 & 22) != 22) && !Arrays.stream(iArr).anyMatch(new IntPredicate() { // from class: im.r
                @Override // java.util.function.IntPredicate
                public final boolean test(int i18) {
                    int i19 = FullscreenChartActivity.f28936o;
                    return i18 == i16;
                }
            })) {
                iI2 = dVar.Y().f3932a.i2(1, "key_activity_chart_count");
                if (iI2 >= 1) {
                    int i18 = f.f94145a;
                    if ((iI3 & 2) == 2) {
                        i15 = 1;
                        i14 = 2;
                    } else if (iI2 >= 3) {
                        int i19 = f.f94145a;
                        if ((iI3 & 8) == 8) {
                            i15 = 3;
                            i14 = 8;
                        } else if (iI2 >= 7) {
                            int i24 = f.f94145a;
                            if ((iI3 & 22) != 22 || (eVar = this.f28937a) == null || eVar.f94141a == 42) {
                                i14 = 1;
                            } else {
                                i15 = 4;
                            }
                        } else {
                            i14 = 1;
                        }
                    } else if (iI2 >= 7) {
                        int i25 = f.f94145a;
                        if ((iI3 & 22) != 22) {
                            i14 = 1;
                        } else {
                            i15 = 4;
                        }
                    } else {
                        i14 = 1;
                    }
                } else if (iI2 >= 3) {
                    int i110 = f.f94145a;
                    if ((iI3 & 8) == 8) {
                        i15 = 3;
                        i14 = 8;
                    } else if (iI2 >= 7) {
                        int i26 = f.f94145a;
                        if ((iI3 & 22) != 22) {
                            i14 = 1;
                        } else {
                            i15 = 4;
                        }
                    } else {
                        i14 = 1;
                    }
                } else if (iI2 >= 7) {
                    int i27 = f.f94145a;
                    if ((iI3 & 22) != 22) {
                        i14 = 1;
                    } else {
                        i15 = 4;
                    }
                } else {
                    i14 = 1;
                }
                dVar.Y().f3932a.u2(iI3 | i14, "key_activity_chart_tip_flags");
            }
        } else {
            iI2 = dVar.Y().f3932a.i2(1, "key_activity_chart_count");
            if (iI2 >= 1) {
                int i111 = f.f94145a;
                if ((iI3 & 2) == 2) {
                    i15 = 1;
                    i14 = 2;
                } else if (iI2 >= 3) {
                    int i112 = f.f94145a;
                    if ((iI3 & 8) == 8) {
                        i15 = 3;
                        i14 = 8;
                    } else if (iI2 >= 7) {
                        int i28 = f.f94145a;
                        if ((iI3 & 22) != 22) {
                            i14 = 1;
                        } else {
                            i15 = 4;
                        }
                    } else {
                        i14 = 1;
                    }
                } else if (iI2 >= 7) {
                    int i29 = f.f94145a;
                    if ((iI3 & 22) != 22) {
                        i14 = 1;
                    } else {
                        i15 = 4;
                    }
                } else {
                    i14 = 1;
                }
            } else if (iI2 >= 3) {
                int i113 = f.f94145a;
                if ((iI3 & 8) == 8) {
                    i15 = 3;
                    i14 = 8;
                } else if (iI2 >= 7) {
                    int i210 = f.f94145a;
                    if ((iI3 & 22) != 22) {
                        i14 = 1;
                    } else {
                        i15 = 4;
                    }
                } else {
                    i14 = 1;
                }
            } else if (iI2 >= 7) {
                int i211 = f.f94145a;
                if ((iI3 & 22) != 22) {
                    i14 = 1;
                } else {
                    i15 = 4;
                }
            } else {
                i14 = 1;
            }
            dVar.Y().f3932a.u2(iI3 | i14, "key_activity_chart_tip_flags");
        }
        if (i15 <= 0 || (frameLayout = this.f28945i) == null) {
            return;
        }
        frameLayout.setVisibility(0);
        Bundle bundle = new Bundle();
        bo1.b bVar = new bo1.b();
        bundle.putInt("extra_tip", i15);
        bVar.setArguments(bundle);
        v supportFragmentManager = getSupportFragmentManager();
        androidx.fragment.app.a aVarB = j.b(supportFragmentManager, supportFragmentManager);
        aVarB.j(R.id.fullscreen_content_overlay, bVar, null, 1);
        aVarB.e();
    }

    public final p ga() {
        ArrayList arrayList = this.f28941e;
        if (arrayList == null || arrayList.isEmpty() || this.f28937a == null) {
            return null;
        }
        int size = this.f28941e.size();
        for (int i14 = 0; i14 < size; i14++) {
            p pVar = (p) this.f28941e.get(i14);
            e eVar = this.f28937a;
            int iG1 = pVar.getB1();
            int iK0 = pVar.K0();
            int i15 = eVar.f94142b;
            int i16 = eVar.f94141a;
            if (i15 > 0) {
                if (i16 == iG1 && i15 == iK0) {
                    return pVar;
                }
            } else {
                if (i16 == iG1) {
                    return pVar;
                }
            }
        }
        return null;
    }

    public String ia(p pVar, p pVar2) {
        String strW0 = pVar.getF113511u1();
        return (pVar2 == null || pVar2.P(0).isEmpty()) ? strW0 : e5.g(strW0, " & ", pVar2.getF113511u1());
    }

    public int ja() {
        e eVar = this.f28937a;
        return (eVar == null || eVar.f94141a != 27) ? R.layout.gcm3_fullscreen_chart : R.layout.gcm3_fullscreen_gauges_chart;
    }

    public void ka(p pVar) {
        i2.d("FullscreenChartActivity", "initChart called");
        e eVar = this.f28937a;
        SparseArray<q0> sparseArray = eVar != null ? eVar.f94143c : null;
        boolean z14 = pVar instanceof lm.c;
        LinearLayout linearLayout = this.f28942f;
        LinearLayout linearLayout2 = this.f28943g;
        if (z14) {
            this.f28946j = ar.f.a(this, linearLayout, linearLayout2, this.f28944h, pVar, this.f28940d, this.f28950n);
        } else {
            this.f28946j = ar.e.g(this, linearLayout, linearLayout2, this.f28944h, pVar, this.f28940d, sparseArray, this.f28950n);
        }
        StringBuilder sb3 = new StringBuilder("chart configurator is valid? ");
        sb3.append(this.f28946j != null);
        i2.d("FullscreenChartActivity", sb3.toString());
        oa(this.f28946j, this);
    }

    public final void la(p pVar) {
        e eVar = this.f28937a;
        SparseArray<q0> sparseArray = eVar != null ? eVar.f94143c : null;
        if (!(pVar instanceof lm.c)) {
            p pVar2 = this.f28940d;
            if (!(pVar2 instanceof lm.c)) {
                this.f28946j = ar.e.g(this, this.f28942f, this.f28943g, this.f28944h, pVar, pVar2, sparseArray, this.f28950n);
                return;
            }
        }
        this.f28946j = ar.f.a(this, this.f28942f, this.f28943g, this.f28944h, pVar, this.f28940d, this.f28950n);
    }

    public final void ma(p pVar) {
        e eVar = this.f28937a;
        SparseArray<q0> sparseArray = eVar != null ? eVar.f94143c : null;
        if (!(pVar instanceof lm.c)) {
            p pVar2 = this.f28940d;
            if (!(pVar2 instanceof lm.c)) {
                this.f28946j = ar.e.g(this, this.f28942f, this.f28943g, this.f28944h, pVar2, pVar, sparseArray, this.f28950n);
                return;
            }
        }
        this.f28946j = ar.f.a(this, this.f28942f, this.f28943g, this.f28944h, this.f28940d, pVar, this.f28950n);
    }

    @Override // lz.b
    public void n1() {
        this.f28948l = false;
        this.f28938b.f28957c = true;
        invalidateOptionsMenu();
    }

    public void na() {
        p pVarGa;
        String strIa;
        if (this.f28940d != null && (pVarGa = ga()) != null && this.f28937a != null) {
            boolean z14 = this.f28947k;
            p pVar = this.f28940d;
            if (z14) {
                strIa = ia(pVarGa, pVar);
                la(pVarGa);
                this.f28947k = false;
            } else {
                strIa = ia(pVar, pVarGa);
                ma(pVarGa);
                this.f28947k = true;
            }
            oa(this.f28946j, this);
            setTitle(strIa);
        }
        invalidateOptionsMenu();
    }

    public void oa(q qVar, FullscreenChartActivity fullscreenChartActivity) {
        if (qVar instanceof qm.c) {
            ((qm.c) qVar).f145287y = fullscreenChartActivity;
        }
    }

    @Override // com.garmin.android.apps.connectmobile.z1, androidx.fragment.app.m, b.g, android.app.Activity
    public final void onActivityResult(int i14, int i15, Intent intent) {
        super.onActivityResult(i14, i15, intent);
        if (i14 == 12 && i15 == -1) {
            this.f28940d = (p) intent.getParcelableExtra("activity_chart_data");
            p pVarGa = ga();
            if (pVarGa != null && this.f28937a != null) {
                setTitle(ia(pVarGa, this.f28940d));
                q qVarG = ar.e.g(this, this.f28942f, this.f28943g, this.f28944h, pVarGa, this.f28940d, this.f28937a.f94143c, this.f28950n);
                this.f28946j = qVarG;
                oa(qVarG, this);
            }
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ca();
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        ArrayList arrayList;
        getMenuInflater().inflate(R.menu.overlay_chart_menu, menu);
        menu.findItem(R.id.menu_item_overlay).setVisible((!this.f28949m || (arrayList = this.f28939c) == null || arrayList.isEmpty() || this.f28940d == null) ? false : true);
        return super.onCreateOptionsMenu(menu);
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.menu_item_overlay) {
            return super.onOptionsItemSelected(menuItem);
        }
        na();
        return true;
    }

    @Override // com.garmin.android.apps.connectmobile.c, androidx.fragment.app.m, android.app.Activity
    public final void onPause() {
        super.onPause();
        if (isFinishing() && da()) {
            f12.l lVar = ((am.d) KoinJavaComponent.get(am.d.class)).Y().f3932a;
            lVar.u2(lVar.i2(1, "key_activity_chart_count") + 1, "key_activity_chart_count");
        }
    }

    @Override // android.app.Activity
    public final boolean onPrepareOptionsMenu(Menu menu) {
        if (menu.size() > 0) {
            menu.getItem(0).setIcon(a7.b.getDrawable(this, this.f28947k ? R.drawable.icn_chart_invert1 : R.drawable.icn_chart_invert2));
        }
        FrameLayout frameLayout = this.f28945i;
        return (frameLayout == null || frameLayout.getVisibility() != 0) && !this.f28948l;
    }

    @Override // com.garmin.android.apps.connectmobile.c, i.c, androidx.fragment.app.m, android.app.Activity
    public final void onStop() {
        super.onStop();
        q qVar = this.f28946j;
        if (qVar != null) {
            qVar.b();
        }
    }

    @Override // com.garmin.android.apps.connectmobile.z1
    public final boolean shouldConsumeInsets() {
        return false;
    }

    @Override // com.garmin.android.apps.connectmobile.activities.charts.a.InterfaceC0444a
    public void v6() {
        FullscreenChartActivity fullscreenChartActivity;
        this.f28940d = null;
        p pVarGa = ga();
        if (pVarGa == null || this.f28937a == null) {
            fullscreenChartActivity = this;
        } else {
            setTitle(ia(pVarGa, this.f28940d));
            e eVar = this.f28937a;
            SparseArray<q0> sparseArray = eVar != null ? eVar.f94143c : null;
            boolean z14 = pVarGa instanceof lm.c;
            LinearLayout linearLayout = this.f28942f;
            LinearLayout linearLayout2 = this.f28943g;
            if (z14) {
                fullscreenChartActivity = this;
                fullscreenChartActivity.f28946j = ar.f.a(fullscreenChartActivity, linearLayout, linearLayout2, this.f28944h, pVarGa, this.f28940d, this.f28950n);
            } else {
                fullscreenChartActivity = this;
                fullscreenChartActivity.f28946j = ar.e.g(fullscreenChartActivity, linearLayout, linearLayout2, fullscreenChartActivity.f28944h, pVarGa, fullscreenChartActivity.f28940d, sparseArray, fullscreenChartActivity.f28950n);
            }
            oa(fullscreenChartActivity.f28946j, this);
        }
        fullscreenChartActivity.f28947k = false;
        invalidateOptionsMenu();
    }

    @Override // bo1.c
    public final void w4(String str) {
        if ("TIP_OVERLAY".equals(str)) {
            FrameLayout frameLayout = this.f28945i;
            if (frameLayout != null) {
                frameLayout.setVisibility(8);
            }
            invalidateOptionsMenu();
        }
    }
}
