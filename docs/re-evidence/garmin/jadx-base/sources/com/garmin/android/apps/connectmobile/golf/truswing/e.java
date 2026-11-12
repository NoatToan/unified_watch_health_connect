package com.garmin.android.apps.connectmobile.golf.truswing;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.m;
import androidx.lifecycle.x1;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.golf.truswing.model.SwingDTO;
import com.garmin.android.apps.connectmobile.s2;
import java.util.ArrayList;
import java.util.List;
import lc.u0;
import org.koin.java.KoinJavaComponent;
import wd2.h0;
import wl0.a0;
import wl0.l;
import wl0.p;
import wl0.q;
import wl0.r;

/* JADX INFO: loaded from: classes8.dex */
public class e extends f {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public LinearLayout f35823m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public List<SwingDTO> f35824n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f35825o = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public c f35826p;

    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.garmin.android.apps.connectmobile.golf.truswing.model.c f35827a;

        public a(com.garmin.android.apps.connectmobile.golf.truswing.model.c cVar) {
            this.f35827a = cVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view2) {
            e.this.f35835g.c3(this.f35827a);
        }
    }

    public final void G6(com.garmin.android.apps.connectmobile.golf.truswing.model.c cVar, String str, String str2, String str3, String str4, boolean z14) {
        LinearLayout linearLayout = (LinearLayout) ((LayoutInflater) getActivity().getSystemService("layout_inflater")).inflate(R.layout.gcm_golf_swing_details_compare_row_item, (ViewGroup) null);
        TextView textView = (TextView) linearLayout.findViewById(R.id.swing_metric_name);
        TextView textView2 = (TextView) linearLayout.findViewById(R.id.swing_metric_value1);
        TextView textView3 = (TextView) linearLayout.findViewById(R.id.swing_metric_label1);
        TextView textView4 = (TextView) linearLayout.findViewById(R.id.swing_metric_value2);
        TextView textView5 = (TextView) linearLayout.findViewById(R.id.swing_metric_label2);
        View viewFindViewById = linearLayout.findViewById(R.id.swing_details_row_divider);
        String string = getString(cVar.f35915b);
        if (TextUtils.isEmpty(str)) {
            str = getString(R.string.no_value);
        }
        String string2 = TextUtils.isEmpty(str3) ? getString(R.string.no_value) : str3;
        textView.setText(string);
        textView2.setText(str);
        textView3.setText(str2);
        textView4.setText(string2);
        textView5.setText(str4);
        textView3.setVisibility(TextUtils.isEmpty(str2) ? 8 : 0);
        textView5.setVisibility(TextUtils.isEmpty(str4) ? 8 : 0);
        viewFindViewById.setVisibility(z14 ? 4 : 0);
        textView.setOnClickListener(new a(cVar));
        this.f35823m.addView(linearLayout);
    }

    public final void H6(SwingDTO swingDTO, SwingDTO swingDTO2) {
        if (swingDTO == null || swingDTO2 == null) {
            return;
        }
        LinearLayout linearLayout = (LinearLayout) ((LayoutInflater) getActivity().getSystemService("layout_inflater")).inflate(R.layout.gcm_golf_swing_details_compare_header_row_item, (ViewGroup) null);
        TextView textView = (TextView) linearLayout.findViewById(R.id.swing_metric_value1);
        TextView textView2 = (TextView) linearLayout.findViewById(R.id.swing_metric_value2);
        com.garmin.android.apps.connectmobile.golf.truswing.model.k kVar = swingDTO.f35875d;
        com.garmin.android.apps.connectmobile.golf.truswing.model.k kVar2 = swingDTO2.f35875d;
        String string = getString(R.string.sensor_unknown);
        if (kVar != null && !TextUtils.isEmpty(kVar.f35953b)) {
            string = kVar.f35953b;
        } else if (kVar != null && kVar.f35954c != null) {
            string = wl0.h.i().j(kVar.f35954c.f20622a);
        }
        String string2 = getString(R.string.sensor_unknown);
        if (kVar2 != null && !TextUtils.isEmpty(kVar2.f35953b)) {
            string2 = kVar2.f35953b;
        } else if (kVar2 != null && kVar2.f35954c != null) {
            string2 = wl0.h.i().j(kVar2.f35954c.f20622a);
        }
        textView.setText(string);
        textView2.setText(string2);
        this.f35823m.addView(linearLayout);
        com.garmin.android.apps.connectmobile.golf.truswing.model.i iVar = swingDTO.f35879h;
        com.garmin.android.apps.connectmobile.golf.truswing.model.i iVar2 = swingDTO2.f35879h;
        if (iVar == null || iVar2 == null) {
            return;
        }
        m activity = getActivity();
        String strW6 = w6(iVar.f35934a);
        String strW7 = w6(iVar2.f35934a);
        String string3 = getString(this.f35836h.f27935b.f23223e);
        G6(com.garmin.android.apps.connectmobile.golf.truswing.model.c.SPEED, strW6, string3, strW7, string3, false);
        double d14 = iVar.f35937d;
        l3.f23124b.getClass();
        G6(com.garmin.android.apps.connectmobile.golf.truswing.model.c.TEMPO, l3.a.D(d14), y6(Double.valueOf(iVar.f35935b), Double.valueOf(iVar.f35936c)), l3.a.D(iVar2.f35937d), y6(Double.valueOf(iVar2.f35935b), Double.valueOf(iVar2.f35936c)), false);
        String strV6 = f.v6(iVar.f35941h);
        String strV7 = f.v6(iVar2.f35941h);
        G6(com.garmin.android.apps.connectmobile.golf.truswing.model.c.CLUB_PATH_AT_IMPACT, strV6, cl0.e.a(activity, iVar.f35941h, R.string.golf_lbl_club_path_impact_in, R.string.golf_lbl_club_path_impact_out), strV7, cl0.e.a(activity, iVar2.f35941h, R.string.golf_lbl_club_path_impact_in, R.string.golf_lbl_club_path_impact_out), false);
        String strV8 = f.v6(iVar.f35943j);
        String strV9 = f.v6(iVar2.f35943j);
        G6(com.garmin.android.apps.connectmobile.golf.truswing.model.c.FACE_ANGLE_TO_TARGET, strV8, cl0.e.a(activity, iVar.f35943j, R.string.golf_lbl_face_angle_to_path_open, R.string.golf_lbl_face_angle_to_path_closed), strV9, cl0.e.a(activity, iVar2.f35943j, R.string.golf_lbl_face_angle_to_path_open, R.string.golf_lbl_face_angle_to_path_closed), false);
        String strV10 = f.v6(iVar.f35939f);
        String strV11 = f.v6(iVar2.f35939f);
        G6(com.garmin.android.apps.connectmobile.golf.truswing.model.c.SHAFT_LEAN_AT_ADDRESS, strV10, cl0.e.a(activity, iVar.f35939f, R.string.golf_lbl_shaft_lean_forward, R.string.golf_lbl_shaft_lean_backward), strV11, cl0.e.a(activity, iVar2.f35939f, R.string.golf_lbl_shaft_lean_forward, R.string.golf_lbl_shaft_lean_backward), false);
        String strV12 = f.v6(iVar.f35947n);
        String strV13 = f.v6(iVar2.f35947n);
        G6(com.garmin.android.apps.connectmobile.golf.truswing.model.c.SHAFT_LEAN_AT_IMPACT, strV12, cl0.e.a(activity, iVar.f35947n, R.string.golf_lbl_shaft_lean_forward, R.string.golf_lbl_shaft_lean_backward), strV13, cl0.e.a(activity, iVar2.f35947n, R.string.golf_lbl_shaft_lean_forward, R.string.golf_lbl_shaft_lean_backward), false);
        G6(com.garmin.android.apps.connectmobile.golf.truswing.model.c.SHAFT_ANGLE_AT_ADDRESS, f.v6(iVar.f35940g), null, f.v6(iVar2.f35940g), null, false);
        G6(com.garmin.android.apps.connectmobile.golf.truswing.model.c.SHAFT_ANGLE_AT_IMPACT, f.v6(iVar.f35948o), null, f.v6(iVar2.f35948o), null, false);
        String strV14 = f.v6(iVar.f35945l);
        String strV15 = f.v6(iVar2.f35945l);
        G6(com.garmin.android.apps.connectmobile.golf.truswing.model.c.DYNAMIC_LOFT, strV14, l3.n().format(iVar.f35946m), strV15, l3.n().format(iVar2.f35946m), true);
    }

    public final void I6() {
        this.f35825o = true;
        getActivity().findViewById(R.id.golf_swing_metric_hint_container).setVisibility(0);
        LinearLayout linearLayout = (LinearLayout) getActivity().findViewById(R.id.swing_metrics_container);
        this.f35823m = linearLayout;
        linearLayout.setMotionEventSplittingEnabled(false);
        this.f35836h = ((cl0.b) KoinJavaComponent.get(cl0.b.class)).h();
        this.f35823m.removeAllViews();
        List<SwingDTO> list = this.f35824n;
        if (list == null || list.size() <= 1) {
            SwingDTO swingDTOA = k.a();
            H6(swingDTOA, swingDTOA);
            C6(swingDTOA, swingDTOA);
        } else {
            SwingDTO swingDTO = this.f35824n.get(0);
            SwingDTO swingDTO2 = this.f35824n.get(1);
            H6(swingDTO, swingDTO2);
            C6(swingDTO, swingDTO2);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.golf.truswing.f, androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        c cVar = this.f35826p;
        cVar.getClass();
        androidx.lifecycle.m.a(null, new l(cVar, null), 3).f(getViewLifecycleOwner(), new h10.d(2));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f35826p = (c) new x1(this).a(c.class);
    }

    @Override // com.garmin.android.apps.connectmobile.golf.truswing.f, com.garmin.android.golfswing.GolfSwingViewManager.GolfSwingViewListener
    public final void onInitComplete() {
        super.onInitComplete();
        if (this.f35825o) {
            return;
        }
        I6();
    }

    @Override // com.garmin.android.apps.connectmobile.golf.truswing.f, androidx.fragment.app.Fragment
    public final void onResume() {
        a0 a0Var;
        androidx.lifecycle.j jVarA;
        super.onResume();
        if (this.f35825o) {
            return;
        }
        s2 s2Var = this.f35830b;
        if (s2Var != null) {
            s2Var.showProgressOverlay(getString(R.string.txt_loading));
        }
        c cVar = this.f35826p;
        cVar.getClass();
        cl0.a.e().getClass();
        List listF = cl0.a.f();
        List listD = cl0.a.d();
        cl0.a.e().getClass();
        List listF2 = cl0.a.f();
        List listD2 = cl0.a.d();
        if (listF2 == null || ((ArrayList) listF2).size() != 2) {
            a0Var = ((listD2 == null || ((ArrayList) listD2).size() != 2) && listD2 != null && ((ArrayList) listD2).size() == 1 && listF2 != null && ((ArrayList) listF2).size() == 1) ? a0.MIXED : a0.HISTORICAL;
        } else {
            a0Var = a0.REAL_TIME;
        }
        int i14 = c.a.f35815a[a0Var.ordinal()];
        if (i14 == 1) {
            jVarA = androidx.lifecycle.m.a(null, new p(listD, cVar, null), 3);
        } else if (i14 == 2) {
            jVarA = androidx.lifecycle.m.a(null, new r(cVar, listF, null), 3);
        } else {
            if (i14 != 3) {
                u0.r();
                return;
            }
            jVarA = androidx.lifecycle.m.a(null, new q(cVar, listF, listD, null), 3);
        }
        jVarA.f(getViewLifecycleOwner(), new h0(this, 3));
    }
}
