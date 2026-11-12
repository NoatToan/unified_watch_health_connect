package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.detail.view.SportDetailBehaviorView;
import com.xiaomi.fitness.detail.view.SportEnvironmentalView;
import com.xiaomi.fitness.detail.view.SportFeedbackView;
import com.xiaomi.fitness.detail.view.SportRecordExtraBasicInfoView;
import com.xiaomi.fitness.detail.view.SportTargetView;

/* JADX INFO: loaded from: classes10.dex */
public abstract class mea extends ViewDataBinding {
    public final TextView A;
    public final FrameLayout A0;
    public final SportDetailBehaviorView B;
    public final RecyclerView B0;
    public final FrameLayout C;
    public final View C0;
    public final FrameLayout D;
    public final SportEnvironmentalView D0;
    public final FrameLayout E;
    public final SportTargetView E0;
    public final FrameLayout F;
    public final FrameLayout F0;
    public final FrameLayout G;
    public final TextView G0;
    public final FrameLayout H;
    public final FrameLayout I;
    public final FrameLayout J;
    public final FrameLayout K;
    public final FrameLayout L;
    public final FrameLayout M;
    public final FrameLayout N;
    public final FrameLayout O;
    public final FrameLayout P;
    public final FrameLayout Q;
    public final FrameLayout R;
    public final FrameLayout S;
    public final FrameLayout T;
    public final FrameLayout U;
    public final FrameLayout V;
    public final FrameLayout W;
    public final FrameLayout X;
    public final FrameLayout Y;
    public final FrameLayout Z;
    public final FrameLayout a0;
    public final FrameLayout b0;
    public final FrameLayout c0;
    public final FrameLayout d0;
    public final FrameLayout e0;
    public final FrameLayout f0;
    public final FrameLayout g0;
    public final FrameLayout h0;
    public final FrameLayout i0;
    public final FrameLayout j0;
    public final FrameLayout k0;
    public final FrameLayout l0;
    public final FrameLayout m0;
    public final FrameLayout n0;
    public final FrameLayout o0;
    public final FrameLayout p0;
    public final FrameLayout q0;
    public final FrameLayout r0;
    public final FrameLayout s0;
    public final FrameLayout t0;
    public final FrameLayout u0;
    public final SportRecordExtraBasicInfoView v0;
    public final SportFeedbackView w0;
    public final RecyclerView x0;
    public final FrameLayout y0;
    public final LinearLayout z0;

    public mea(Object obj, View view, int i, TextView textView, SportDetailBehaviorView sportDetailBehaviorView, FrameLayout frameLayout, FrameLayout frameLayout2, FrameLayout frameLayout3, FrameLayout frameLayout4, FrameLayout frameLayout5, FrameLayout frameLayout6, FrameLayout frameLayout7, FrameLayout frameLayout8, FrameLayout frameLayout9, FrameLayout frameLayout10, FrameLayout frameLayout11, FrameLayout frameLayout12, FrameLayout frameLayout13, FrameLayout frameLayout14, FrameLayout frameLayout15, FrameLayout frameLayout16, FrameLayout frameLayout17, FrameLayout frameLayout18, FrameLayout frameLayout19, FrameLayout frameLayout20, FrameLayout frameLayout21, FrameLayout frameLayout22, FrameLayout frameLayout23, FrameLayout frameLayout24, FrameLayout frameLayout25, FrameLayout frameLayout26, FrameLayout frameLayout27, FrameLayout frameLayout28, FrameLayout frameLayout29, FrameLayout frameLayout30, FrameLayout frameLayout31, FrameLayout frameLayout32, FrameLayout frameLayout33, FrameLayout frameLayout34, FrameLayout frameLayout35, FrameLayout frameLayout36, FrameLayout frameLayout37, FrameLayout frameLayout38, FrameLayout frameLayout39, FrameLayout frameLayout40, FrameLayout frameLayout41, FrameLayout frameLayout42, FrameLayout frameLayout43, FrameLayout frameLayout44, FrameLayout frameLayout45, SportRecordExtraBasicInfoView sportRecordExtraBasicInfoView, SportFeedbackView sportFeedbackView, RecyclerView recyclerView, FrameLayout frameLayout46, LinearLayout linearLayout, FrameLayout frameLayout47, RecyclerView recyclerView2, View view2, SportEnvironmentalView sportEnvironmentalView, SportTargetView sportTargetView, FrameLayout frameLayout48, TextView textView2) {
        super(obj, view, i);
        this.A = textView;
        this.B = sportDetailBehaviorView;
        this.C = frameLayout;
        this.D = frameLayout2;
        this.E = frameLayout3;
        this.F = frameLayout4;
        this.G = frameLayout5;
        this.H = frameLayout6;
        this.I = frameLayout7;
        this.J = frameLayout8;
        this.K = frameLayout9;
        this.L = frameLayout10;
        this.M = frameLayout11;
        this.N = frameLayout12;
        this.O = frameLayout13;
        this.P = frameLayout14;
        this.Q = frameLayout15;
        this.R = frameLayout16;
        this.S = frameLayout17;
        this.T = frameLayout18;
        this.U = frameLayout19;
        this.V = frameLayout20;
        this.W = frameLayout21;
        this.X = frameLayout22;
        this.Y = frameLayout23;
        this.Z = frameLayout24;
        this.a0 = frameLayout25;
        this.b0 = frameLayout26;
        this.c0 = frameLayout27;
        this.d0 = frameLayout28;
        this.e0 = frameLayout29;
        this.f0 = frameLayout30;
        this.g0 = frameLayout31;
        this.h0 = frameLayout32;
        this.i0 = frameLayout33;
        this.j0 = frameLayout34;
        this.k0 = frameLayout35;
        this.l0 = frameLayout36;
        this.m0 = frameLayout37;
        this.n0 = frameLayout38;
        this.o0 = frameLayout39;
        this.p0 = frameLayout40;
        this.q0 = frameLayout41;
        this.r0 = frameLayout42;
        this.s0 = frameLayout43;
        this.t0 = frameLayout44;
        this.u0 = frameLayout45;
        this.v0 = sportRecordExtraBasicInfoView;
        this.w0 = sportFeedbackView;
        this.x0 = recyclerView;
        this.y0 = frameLayout46;
        this.z0 = linearLayout;
        this.A0 = frameLayout47;
        this.B0 = recyclerView2;
        this.C0 = view2;
        this.D0 = sportEnvironmentalView;
        this.E0 = sportTargetView;
        this.F0 = frameLayout48;
        this.G0 = textView2;
    }

    public static mea A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static mea B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (mea) ViewDataBinding.G(layoutInflater, ivi.C, viewGroup, z, obj);
    }
}
