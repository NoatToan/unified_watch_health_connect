package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.xiaomi.fitness.device.manager.ui.scan.ScanDeviceViewModel;
import com.xiaomi.fitness.device.manager.ui.scan.ScanningView;

/* JADX INFO: loaded from: classes8.dex */
public abstract class q16 extends ViewDataBinding {
    public final ConstraintLayout A;
    public final FrameLayout B;
    public final LottieAnimationView C;
    public final RecyclerView D;
    public final ScanningView E;
    public final TextView F;
    public final TextView G;
    public final TextView H;
    public final ixq I;
    public final ixq J;
    public ScanDeviceViewModel K;

    public q16(Object obj, View view, int i, ConstraintLayout constraintLayout, FrameLayout frameLayout, LottieAnimationView lottieAnimationView, RecyclerView recyclerView, ScanningView scanningView, TextView textView, TextView textView2, TextView textView3, ixq ixqVar, ixq ixqVar2) {
        super(obj, view, i);
        this.A = constraintLayout;
        this.B = frameLayout;
        this.C = lottieAnimationView;
        this.D = recyclerView;
        this.E = scanningView;
        this.F = textView;
        this.G = textView2;
        this.H = textView3;
        this.I = ixqVar;
        this.J = ixqVar2;
    }

    public ScanDeviceViewModel A0() {
        return this.K;
    }
}
