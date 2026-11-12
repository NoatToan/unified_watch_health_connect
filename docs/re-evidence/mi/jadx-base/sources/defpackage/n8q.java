package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.airbnb.lottie.LottieAnimationView;
import com.xiaomi.fitness.ubox.export.DeviceIconView;

/* JADX INFO: loaded from: classes10.dex */
public abstract class n8q extends ViewDataBinding {
    public final TextView A;
    public final DeviceIconView B;
    public final LottieAnimationView C;
    public final TextView D;

    public n8q(Object obj, View view, int i, TextView textView, DeviceIconView deviceIconView, LottieAnimationView lottieAnimationView, TextView textView2) {
        super(obj, view, i);
        this.A = textView;
        this.B = deviceIconView;
        this.C = lottieAnimationView;
        this.D = textView2;
    }
}
