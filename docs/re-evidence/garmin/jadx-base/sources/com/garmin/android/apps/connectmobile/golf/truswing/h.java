package com.garmin.android.apps.connectmobile.golf.truswing;

import android.app.Activity;
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
import com.garmin.android.apps.connectmobile.golf.truswing.view.SwingAnimationControlView;
import com.garmin.android.apps.connectmobile.golf.truswing.view.SwingSeekBar;
import com.garmin.android.apps.connectmobile.q1;
import com.garmin.android.apps.connectmobile.s2;
import com.garmin.android.golfswing.GolfSwingViewManager;
import org.greenrobot.eventbus.ThreadMode;
import org.koin.java.KoinJavaComponent;
import vn2.t0;
import wd2.h0;

/* JADX INFO: loaded from: classes8.dex */
public class h extends f {
    public SwingDTO A;
    public boolean B;
    public boolean C;
    public boolean D;
    public int E;
    public com.garmin.android.apps.connectmobile.golf.truswing.model.k F;
    public final a I = new a();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public c f35842m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public TextView f35843n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public LinearLayout f35844o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public TextView f35845p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public TextView f35846q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public TextView f35847r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public TextView f35848t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public TextView f35849v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public TextView f35850w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public View f35851x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public View f35852y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public View f35853z;

    public class a extends ol0.d {
        public a() {
        }

        @l73.k(threadMode = ThreadMode.MAIN)
        public void noImpactSwingDetected(ol0.c cVar) {
            h.this.getClass();
            t0 t0Var = new t0(this, 15);
            q1.f41066b.getClass();
            q1.b.a(R.string.golf_lbl_truswing_no_impact, null, R.string.lbl_close, 0, t0Var);
            throw null;
        }
    }

    public static h S6(SwingDTO swingDTO, boolean z14) {
        h hVar = new h();
        Bundle bundle = new Bundle();
        bundle.putParcelable("GCM_swing_dto", swingDTO);
        bundle.putBoolean("GCM_swing_without_paths", z14);
        hVar.setArguments(bundle);
        return hVar;
    }

    @Override // com.garmin.android.apps.connectmobile.golf.truswing.f
    public final void A6() {
        super.A6();
        SwingDTO swingDTO = this.A;
        if (swingDTO != null) {
            super.E6(swingDTO);
            SwingDTO swingDTO2 = this.A;
            double[][] dArr = swingDTO2.f35877f;
            if (dArr != null && dArr.length > 0) {
                f.F6(swingDTO2);
            }
        }
        m activity = getActivity();
        this.f35852y = activity.findViewById(R.id.golf_swing_metric_hint_container);
        this.f35851x = activity.findViewById(R.id.swing_speed_tempo_container);
        this.f35845p = (TextView) activity.findViewById(R.id.details_swing_speed);
        this.f35846q = (TextView) activity.findViewById(R.id.details_swing_speed_unit);
        this.f35847r = (TextView) activity.findViewById(R.id.details_swing_speed_label);
        this.f35848t = (TextView) activity.findViewById(R.id.details_swing_tempo);
        this.f35849v = (TextView) activity.findViewById(R.id.details_backswing_downswing);
        this.f35850w = (TextView) activity.findViewById(R.id.details_swing_tempo_label);
        LinearLayout linearLayout = (LinearLayout) activity.findViewById(R.id.swing_metrics_container);
        this.f35844o = linearLayout;
        linearLayout.setMotionEventSplittingEnabled(false);
        this.f35836h = ((cl0.b) KoinJavaComponent.get(cl0.b.class)).h();
        View viewFindViewById = activity.findViewById(R.id.unable_download_swing);
        this.f35853z = viewFindViewById;
        if (this.D) {
            if (viewFindViewById != null) {
                viewFindViewById.setVisibility(0);
                this.f35853z.bringToFront();
            }
            SwingAnimationControlView swingAnimationControlView = this.f35834f;
            if (swingAnimationControlView != null) {
                swingAnimationControlView.setEnabled(false);
                SwingSeekBar swingSeekBar = this.f35834f.f36000a;
                swingSeekBar.f36009a = null;
                swingSeekBar.f36010b = null;
                swingSeekBar.invalidate();
            }
        }
        I6();
        J6();
        cl0.b bVar = (cl0.b) KoinJavaComponent.get(cl0.b.class);
        if (this.f35851x != null && bVar.x() < 0) {
            this.f35851x.getViewTreeObserver().addOnGlobalLayoutListener(new com.google.firebase.perf.util.a(1, this, bVar));
        }
        if (!this.B || this.C) {
            s2 s2Var = this.f35830b;
            if (s2Var != null) {
                s2Var.hideProgressOverlay();
            }
        } else {
            s2 s2Var2 = this.f35830b;
            if (s2Var2 != null) {
                s2Var2.showProgressOverlay(getString(R.string.txt_loading));
            }
        }
        if (this.A == null) {
            this.f35834f.setEnabled(false);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.golf.truswing.f
    public final void E6(SwingDTO swingDTO) {
        H6();
        this.A = swingDTO;
        super.E6(swingDTO);
        I6();
        J6();
    }

    public final void G6(com.garmin.android.apps.connectmobile.golf.truswing.model.c cVar, String str, String str2, boolean z14) {
        LinearLayout linearLayout = (LinearLayout) ((LayoutInflater) getActivity().getSystemService("layout_inflater")).inflate(R.layout.gcm_golf_swing_details_row_item, (ViewGroup) null);
        TextView textView = (TextView) linearLayout.findViewById(R.id.swing_metric_name);
        TextView textView2 = (TextView) linearLayout.findViewById(R.id.swing_metric_value);
        TextView textView3 = (TextView) linearLayout.findViewById(R.id.swing_metric_label);
        View viewFindViewById = linearLayout.findViewById(R.id.swing_details_row_divider);
        String string = getString(cVar.f35915b);
        if (TextUtils.isEmpty(str)) {
            str = getString(R.string.no_value);
        }
        textView.setText(string);
        textView2.setText(str);
        textView3.setText(str2);
        textView3.setVisibility(TextUtils.isEmpty(str2) ? 8 : 0);
        viewFindViewById.setVisibility(z14 ? 4 : 0);
        textView.setOnClickListener(new u12.e(27, this, cVar));
        this.f35844o.addView(linearLayout);
    }

    public final void H6() {
        GolfSwingViewManager.getInstance().clearSwingData();
        SwingAnimationControlView swingAnimationControlView = this.f35834f;
        if (swingAnimationControlView != null) {
            swingAnimationControlView.c(null, null);
            SwingSeekBar swingSeekBar = this.f35834f.f36000a;
            if (swingSeekBar != null) {
                swingSeekBar.setProgress(0);
            }
            this.f35834f.setEnabled(false);
        }
        this.A = k.a();
        I6();
        J6();
    }

    public final void I6() {
        String string;
        String strD;
        String strU6;
        String strU7;
        View view2 = this.f35851x;
        if (view2 == null) {
            return;
        }
        SwingDTO swingDTO = this.A;
        com.garmin.android.apps.connectmobile.golf.truswing.model.i iVar = swingDTO != null ? swingDTO.f35879h : null;
        view2.setVisibility(swingDTO == null ? 8 : 0);
        if (iVar != null) {
            string = w6(iVar.f35934a);
            double d14 = iVar.f35937d;
            l3.f23124b.getClass();
            strD = l3.a.D(d14);
            strU7 = u6(iVar.f35935b);
            strU6 = u6(iVar.f35936c);
        } else {
            string = getString(R.string.no_value);
            strD = string;
            strU6 = strD;
            strU7 = strU6;
        }
        this.f35845p.setText(string);
        this.f35846q.setText(getString(this.f35836h.f27935b.f23223e));
        this.f35848t.setText(strD);
        this.f35849v.setText(String.format(getString(R.string.string_slash_string_pattern), strU7, strU6));
        final int i14 = 0;
        this.f35847r.setOnClickListener(new View.OnClickListener(this) { // from class: wl0.f0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.golf.truswing.h f185920b;

            {
                this.f185920b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i14) {
                    case 0:
                        this.f185920b.f35835g.c3(com.garmin.android.apps.connectmobile.golf.truswing.model.c.SPEED);
                        break;
                    default:
                        this.f185920b.f35835g.c3(com.garmin.android.apps.connectmobile.golf.truswing.model.c.TEMPO);
                        break;
                }
            }
        });
        final int i15 = 1;
        this.f35850w.setOnClickListener(new View.OnClickListener(this) { // from class: wl0.f0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.garmin.android.apps.connectmobile.golf.truswing.h f185920b;

            {
                this.f185920b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i15) {
                    case 0:
                        this.f185920b.f35835g.c3(com.garmin.android.apps.connectmobile.golf.truswing.model.c.SPEED);
                        break;
                    default:
                        this.f185920b.f35835g.c3(com.garmin.android.apps.connectmobile.golf.truswing.model.c.TEMPO);
                        break;
                }
            }
        });
    }

    public final void J6() {
        LinearLayout linearLayout = this.f35844o;
        if (linearLayout == null) {
            return;
        }
        linearLayout.removeAllViews();
        SwingDTO swingDTO = this.A;
        com.garmin.android.apps.connectmobile.golf.truswing.model.i iVar = swingDTO != null ? swingDTO.f35879h : null;
        this.f35852y.setVisibility(iVar == null ? 8 : 0);
        if (iVar != null) {
            m activity = getActivity();
            G6(com.garmin.android.apps.connectmobile.golf.truswing.model.c.CLUB_PATH_AT_IMPACT, f.v6(iVar.f35941h), cl0.e.a(activity, iVar.f35941h, R.string.golf_lbl_club_path_impact_in, R.string.golf_lbl_club_path_impact_out), false);
            G6(com.garmin.android.apps.connectmobile.golf.truswing.model.c.FACE_ANGLE_TO_TARGET, f.v6(iVar.f35943j), cl0.e.a(activity, iVar.f35943j, R.string.golf_lbl_face_angle_to_path_open, R.string.golf_lbl_face_angle_to_path_closed), false);
            G6(com.garmin.android.apps.connectmobile.golf.truswing.model.c.SHAFT_LEAN_AT_ADDRESS, f.v6(iVar.f35939f), cl0.e.a(activity, iVar.f35939f, R.string.golf_lbl_shaft_lean_forward, R.string.golf_lbl_shaft_lean_backward), false);
            G6(com.garmin.android.apps.connectmobile.golf.truswing.model.c.SHAFT_LEAN_AT_IMPACT, f.v6(iVar.f35947n), cl0.e.a(activity, iVar.f35947n, R.string.golf_lbl_shaft_lean_forward, R.string.golf_lbl_shaft_lean_backward), false);
            G6(com.garmin.android.apps.connectmobile.golf.truswing.model.c.SHAFT_ANGLE_AT_ADDRESS, f.v6(iVar.f35940g), null, false);
            G6(com.garmin.android.apps.connectmobile.golf.truswing.model.c.SHAFT_ANGLE_AT_IMPACT, f.v6(iVar.f35948o), null, false);
            G6(com.garmin.android.apps.connectmobile.golf.truswing.model.c.DYNAMIC_LOFT, f.v6(iVar.f35945l), l3.n().format(iVar.f35946m), true);
        }
    }

    public final String K6() {
        int i14;
        String string = getString(R.string.sensor_unknown);
        SwingDTO swingDTO = this.A;
        if (swingDTO != null) {
            com.garmin.android.apps.connectmobile.golf.truswing.model.k kVar = swingDTO.f35875d;
            if (kVar != null) {
                boolean zIsEmpty = TextUtils.isEmpty(kVar.f35953b);
                SwingDTO swingDTO2 = this.A;
                if (!zIsEmpty) {
                    string = swingDTO2.f35875d.f35953b;
                } else if (swingDTO2.f35875d.f35954c != null) {
                    string = wl0.h.i().j(this.A.f35875d.f35954c.f20622a);
                }
            }
            i14 = this.A.f35881j;
        } else {
            i14 = 0;
        }
        return M6(i14, string);
    }

    public final String M6(int i14, String str) {
        StringBuilder sb3 = new StringBuilder();
        if (TextUtils.isEmpty(str)) {
            str = getString(R.string.sensor_unknown);
        }
        sb3.append(str);
        if (i14 > 0) {
            sb3.append(getString(R.string.bullet_point));
            sb3.append(getString(R.string.golf_lbl_swing_sequence, Integer.valueOf(i14)));
        }
        return sb3.toString();
    }

    public final void T6(com.garmin.android.apps.connectmobile.golf.truswing.model.a aVar) {
        if (aVar != null) {
            cl0.a aVarE = cl0.a.e();
            long j8 = aVar.f35890b;
            aVarE.getClass();
            ((cl0.b) KoinJavaComponent.get(cl0.b.class)).t(j8);
            GolfSwingViewManager.getInstance().drawScene();
        }
        if (this.f35843n == null && getActivity() != null) {
            this.f35843n = (TextView) getActivity().findViewById(R.id.golf_swing_label);
        }
        TextView textView = this.f35843n;
        if (textView != null) {
            if (aVar != null) {
                textView.setText(M6(0, aVar.a()));
            } else {
                textView.setText(getString(R.string.sensor_unknown));
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            SwingDTO swingDTO = (SwingDTO) getArguments().getParcelable("GCM_swing_dto");
            this.A = swingDTO;
            this.E = swingDTO != null ? swingDTO.f35881j : 0;
            this.F = swingDTO != null ? swingDTO.f35875d : null;
            this.B = getArguments().getBoolean("GCM_swing_without_paths", false);
        }
        this.f35842m = (c) new x1(requireActivity()).a(c.class);
    }

    @Override // com.garmin.android.apps.connectmobile.golf.truswing.f, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        oi2.a.b(this.I);
    }

    @Override // com.garmin.android.apps.connectmobile.golf.truswing.f, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (this.B && !this.C) {
            c cVar = this.f35842m;
            long j8 = this.A.f35872a;
            cVar.getClass();
            androidx.lifecycle.m.a(null, new wl0.m(cVar, j8, null), 3).f(this, new h0(this, 6));
        }
        oi2.a.a(this.I);
    }

    @Override // com.garmin.android.apps.connectmobile.golf.truswing.f
    public final void z6(Activity activity) {
        super.z6(activity);
        TextView textView = (TextView) activity.findViewById(R.id.golf_swing_label);
        this.f35843n = textView;
        textView.setText(K6());
    }
}
