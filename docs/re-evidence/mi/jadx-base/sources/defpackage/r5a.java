package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.airbnb.lottie.LottieAnimationView;
import com.xiaomi.fitness.devicesettings.widget.EmergencyCallView;
import com.xiaomi.fitness.devicesettings.widget.SosSetView;
import com.xiaomi.fitness.widget.SwitchButtonSingleLineTextView;

/* JADX INFO: loaded from: classes8.dex */
public abstract class r5a extends ViewDataBinding {
    public final LottieAnimationView A;
    public final TextView B;
    public final ConstraintLayout C;
    public final View D;
    public final SosSetView E;
    public final SosSetView F;
    public final EmergencyCallView G;
    public final EmergencyCallView H;
    public final ConstraintLayout I;
    public final SwitchButtonSingleLineTextView J;

    public r5a(Object obj, View view, int i, LottieAnimationView lottieAnimationView, TextView textView, ConstraintLayout constraintLayout, View view2, SosSetView sosSetView, SosSetView sosSetView2, EmergencyCallView emergencyCallView, EmergencyCallView emergencyCallView2, ConstraintLayout constraintLayout2, SwitchButtonSingleLineTextView switchButtonSingleLineTextView) {
        super(obj, view, i);
        this.A = lottieAnimationView;
        this.B = textView;
        this.C = constraintLayout;
        this.D = view2;
        this.E = sosSetView;
        this.F = sosSetView2;
        this.G = emergencyCallView;
        this.H = emergencyCallView2;
        this.I = constraintLayout2;
        this.J = switchButtonSingleLineTextView;
    }
}
