package com.garmin.android.apps.connectmobile.golf.truswing;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.m;
import c22.l3;
import c22.q3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.golf.truswing.model.SwingDTO;
import com.garmin.android.apps.connectmobile.golf.truswing.view.SwingAnimationControlView;
import com.garmin.android.apps.connectmobile.golf.truswing.view.SwingSeekBar;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.s2;
import com.garmin.android.golfswing.GolfSwingData;
import com.garmin.android.golfswing.GolfSwingTextureView;
import com.garmin.android.golfswing.GolfSwingViewManager;
import com.garmin.android.golfswing.GolfSwingsInfo;
import f12.l;
import java.text.DecimalFormat;
import java.util.HashMap;
import org.koin.java.KoinJavaComponent;
import wl0.c0;
import yc.l2;

/* JADX INFO: loaded from: classes8.dex */
public abstract class f extends Fragment implements GolfSwingViewManager.GolfSwingViewListener, SwingAnimationControlView.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public s2 f35830b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewGroup f35831c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public GolfSwingTextureView f35832d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ScrollView f35833e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public SwingAnimationControlView f35834f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public b f35835g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public cl0.d f35836h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f35838j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f35829a = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Handler f35837i = new Handler();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final a f35839k = new a();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final cl0.b f35840l = (cl0.b) KoinJavaComponent.get(cl0.b.class);

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            f fVar = f.this;
            if (fVar.getActivity() == null || fVar.f35838j) {
                return;
            }
            SwingSeekBar swingSeekBar = fVar.f35834f.f36000a;
            if (swingSeekBar != null) {
                swingSeekBar.setProgress(0);
            }
            GolfSwingViewManager.getInstance().startPlay();
        }
    }

    public interface b {
        void c3(com.garmin.android.apps.connectmobile.golf.truswing.model.c cVar);

        void f6();
    }

    public static void F6(SwingDTO swingDTO) {
        GolfSwingsInfo golfSwingsInfoB = k.a.b(swingDTO, "WRIST");
        double dC = k.c(golfSwingsInfoB);
        HashMap<Double, GolfSwingData> map = golfSwingsInfoB.mSwings;
        if (map == null) {
            i2.f(a2.GOLF, "SwingDetailsFragment", "****** 1 ******");
            return;
        }
        if (map.isEmpty()) {
            i2.f(a2.GOLF, "SwingDetailsFragment", "****** 2 ******");
            return;
        }
        if (golfSwingsInfoB.mSwings.get(Double.valueOf(dC)) == null) {
            i2.f(a2.GOLF, "SwingDetailsFragment", "****** 3 ******");
        } else if (golfSwingsInfoB.mSwings.get(Double.valueOf(dC)).mSwingPoints == null) {
            i2.f(a2.GOLF, "SwingDetailsFragment", "****** 4 ******");
        } else {
            i2.f(a2.GOLF, "SwingDetailsFragment", "Yep");
            GolfSwingViewManager.getInstance().setWristSwingData(dC, golfSwingsInfoB);
        }
    }

    public static String v6(double d14) {
        Double dValueOf = Double.valueOf(Math.abs(d14));
        DecimalFormat decimalFormatN = l3.n();
        l3.f23124b.getClass();
        return l3.a.U(dValueOf, decimalFormatN);
    }

    public void A6() {
        this.f35832d = new GolfSwingTextureView(getActivity());
        this.f35833e.setOnTouchListener(new c0(this));
        if (this.f35831c != null) {
            s2 s2Var = this.f35830b;
            if (s2Var != null) {
                s2Var.hideProgressOverlay();
            }
            this.f35831c.addView(this.f35832d);
        }
        this.f35832d.setOnTouchListener(new b00.g(this, 10));
        z6(getActivity());
    }

    public final void C6(SwingDTO swingDTO, SwingDTO swingDTO2) {
        GolfSwingsInfo golfSwingsInfoB = k.a.b(swingDTO, "CLUB");
        double dC = k.c(golfSwingsInfoB);
        GolfSwingsInfo golfSwingsInfoB2 = k.a.b(swingDTO2, "CLUB");
        double dC2 = k.c(golfSwingsInfoB2);
        GolfSwingViewManager.getInstance().setClubSwingData(dC, golfSwingsInfoB);
        GolfSwingViewManager.getInstance().setClubSwingCompareData(dC2, golfSwingsInfoB2);
        GolfSwingsInfo golfSwingsInfoB3 = k.a.b(swingDTO, "WRIST");
        double dC3 = k.c(golfSwingsInfoB3);
        GolfSwingsInfo golfSwingsInfoB4 = k.a.b(swingDTO2, "WRIST");
        double dC4 = k.c(golfSwingsInfoB4);
        HashMap<Double, GolfSwingData> map = golfSwingsInfoB3.mSwings;
        if (map != null && !map.isEmpty() && golfSwingsInfoB3.mSwings.get(Double.valueOf(dC3)) != null && golfSwingsInfoB3.mSwings.get(Double.valueOf(dC3)).mSwingPoints != null) {
            GolfSwingViewManager.getInstance().setWristSwingData(dC3, golfSwingsInfoB3);
        }
        HashMap<Double, GolfSwingData> map2 = golfSwingsInfoB4.mSwings;
        if (map2 != null && !map2.isEmpty() && golfSwingsInfoB4.mSwings.get(Double.valueOf(dC4)) != null && golfSwingsInfoB4.mSwings.get(Double.valueOf(dC4)).mSwingPoints != null) {
            GolfSwingViewManager.getInstance().setWristSwingCompareData(dC4, golfSwingsInfoB4);
        }
        float[][] allMarkings = GolfSwingViewManager.getInstance().getAllMarkings();
        this.f35834f.c(allMarkings[0], allMarkings[1]);
    }

    public void E6(SwingDTO swingDTO) {
        GolfSwingsInfo golfSwingsInfoB = k.a.b(swingDTO, "CLUB");
        double dC = k.c(golfSwingsInfoB);
        GolfSwingViewManager.getInstance().setClubSwingData(dC, golfSwingsInfoB);
        this.f35834f.setEnabled(true);
        this.f35834f.c(GolfSwingViewManager.getInstance().getSwingMarkings(dC, false), null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        GolfSwingViewManager.getInstance().setGolfSwingViewListener(this);
        GolfSwingViewManager.getInstance().init(getActivity());
        s2 s2Var = this.f35830b;
        if (s2Var != null) {
            s2Var.showProgressOverlay(getString(R.string.txt_loading));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        try {
            this.f35835g = (b) context;
            this.f35830b = (s2) context;
        } catch (ClassCastException unused) {
            l2.k(context, " must implement OnSwingDetailsInteractionListener and ProgressOverlayListener");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2;
        View viewInflate = layoutInflater.inflate(R.layout.gcm_golf_swing_details_fragment, viewGroup, false);
        this.f35831c = (ViewGroup) viewInflate.findViewById(R.id.golf_swing_view_container);
        this.f35833e = (ScrollView) viewInflate.findViewById(R.id.golf_swing_scroll_container);
        int iX = this.f35840l.x();
        if (iX > 0 && (viewGroup2 = this.f35831c) != null) {
            ViewGroup.LayoutParams layoutParams = viewGroup2.getLayoutParams();
            layoutParams.height = iX;
            this.f35831c.setLayoutParams(layoutParams);
        }
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        GolfSwingViewManager.getInstance().close();
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDetach() {
        super.onDetach();
        this.f35835g = null;
    }

    @Override // com.garmin.android.golfswing.GolfSwingViewManager.GolfSwingViewListener
    public final void onGolfSwingViewChanged() {
        cl0.a aVarE = cl0.a.e();
        m activity = getActivity();
        aVarE.getClass();
        String str = activity.getResources().getStringArray(R.array.gcm_user_genders_values)[0];
        l.f68084a.getClass();
        boolean zEquals = l.a.a().w().equals(str);
        boolean zEquals2 = l.a.a().K().equals(activity.getResources().getStringArray(R.array.gcm_user_handedness_capable_values)[0]);
        cl0.b bVar = (cl0.b) KoinJavaComponent.get(cl0.b.class);
        boolean zG = bVar.g();
        boolean zP = bVar.p();
        com.garmin.android.apps.connectmobile.golf.truswing.model.g.a aVar = new com.garmin.android.apps.connectmobile.golf.truswing.model.g.a();
        aVar.f35930b = zEquals ? 1 : 0;
        aVar.f35929a = zP;
        aVar.f35931c = zEquals2;
        com.garmin.android.apps.connectmobile.golf.truswing.model.g gVar = new com.garmin.android.apps.connectmobile.golf.truswing.model.g(zEquals ? 1 : 0, zG, zP, zEquals2);
        GolfSwingViewManager golfSwingViewManager = GolfSwingViewManager.getInstance();
        golfSwingViewManager.setGolferModel(gVar.f35927d);
        golfSwingViewManager.setLeftHanded(gVar.f35928e);
        golfSwingViewManager.setGolfClubModel(0);
        boolean z14 = gVar.f35924a;
        golfSwingViewManager.setSlowMotion(z14);
        golfSwingViewManager.zoomOnGolfer(gVar.f35926c);
        this.f35834f.setLoopMode(gVar.f35925b);
        this.f35834f.setSlowMotionMode(z14);
        GolfSwingViewManager.getInstance().drawScene();
    }

    public void onInitComplete() {
        if (getActivity() != null) {
            A6();
            this.f35835g.f6();
            this.f35829a = true;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        if (this.f35834f != null) {
            com.garmin.android.apps.connectmobile.golf.truswing.model.g.a aVar = new com.garmin.android.apps.connectmobile.golf.truswing.model.g.a();
            aVar.f35929a = this.f35834f.f36003d.isChecked();
            com.garmin.android.apps.connectmobile.golf.truswing.model.g gVar = new com.garmin.android.apps.connectmobile.golf.truswing.model.g(aVar.f35930b, this.f35834f.f36002c.isChecked(), aVar.f35929a, aVar.f35931c);
            cl0.b bVar = (cl0.b) KoinJavaComponent.get(cl0.b.class);
            bVar.F(gVar.f35925b);
            bVar.A(gVar.f35924a);
        }
    }

    @Override // com.garmin.android.golfswing.GolfSwingViewManager.GolfSwingViewListener
    public final void onPlayProgressUpdated(float f14) {
        this.f35834f.f36000a.setProgress((int) (f14 * 100.0f));
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.f35836h = this.f35840l.h();
    }

    public final String u6(double d14) {
        return Double.isNaN(d14) ? getString(R.string.no_value) : l3.f23129g.format(d14);
    }

    public final String w6(double d14) {
        if (Double.isNaN(d14)) {
            return getString(R.string.no_value);
        }
        m activity = getActivity();
        q3 q3Var = this.f35836h.f27935b;
        DecimalFormat decimalFormatM = l3.m();
        String strValueOf = String.valueOf((int) d14);
        l3.f23124b.getClass();
        return l3.a.N0(activity, d14, q3Var, decimalFormatM, false, strValueOf);
    }

    public final String y6(Double d14, Double d15) {
        return u6(d14.doubleValue()) + " / " + u6(d15.doubleValue());
    }

    public void z6(Activity activity) {
        SwingAnimationControlView swingAnimationControlView = (SwingAnimationControlView) activity.findViewById(R.id.swing_animation_control);
        this.f35834f = swingAnimationControlView;
        swingAnimationControlView.setSwingAnimationControlListener(this);
        this.f35834f.setVisibility(0);
    }
}
