package defpackage;

import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.devicesettings.huami.vibratemode.BubbleAnimationView;
import com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateCustomTouchView;
import com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeProgressBar;

/* JADX INFO: loaded from: classes8.dex */
public abstract class ef6 extends ViewDataBinding {
    public final LinearLayout A;
    public final BubbleAnimationView B;
    public final VibrateModeProgressBar C;
    public final Button D;
    public final VibrateCustomTouchView E;
    public final Button F;

    public ef6(Object obj, View view, int i, LinearLayout linearLayout, BubbleAnimationView bubbleAnimationView, VibrateModeProgressBar vibrateModeProgressBar, Button button, VibrateCustomTouchView vibrateCustomTouchView, Button button2) {
        super(obj, view, i);
        this.A = linearLayout;
        this.B = bubbleAnimationView;
        this.C = vibrateModeProgressBar;
        this.D = button;
        this.E = vibrateCustomTouchView;
        this.F = button2;
    }
}
