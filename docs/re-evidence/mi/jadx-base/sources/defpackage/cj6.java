package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.devicesettings.huami.vibratemode.DeviceImageView;
import com.xiaomi.fitness.widget.RightArrowTwoLineTextView;
import miuix.core.widget.NestedScrollView;

/* JADX INFO: loaded from: classes8.dex */
public abstract class cj6 extends ViewDataBinding {
    public final DeviceImageView A;
    public final RightArrowTwoLineTextView B;
    public final LinearLayout C;
    public final NestedScrollView D;
    public final RightArrowTwoLineTextView E;
    public final LinearLayout F;
    public final RightArrowTwoLineTextView G;

    public cj6(Object obj, View view, int i, DeviceImageView deviceImageView, RightArrowTwoLineTextView rightArrowTwoLineTextView, LinearLayout linearLayout, NestedScrollView nestedScrollView, RightArrowTwoLineTextView rightArrowTwoLineTextView2, LinearLayout linearLayout2, RightArrowTwoLineTextView rightArrowTwoLineTextView3) {
        super(obj, view, i);
        this.A = deviceImageView;
        this.B = rightArrowTwoLineTextView;
        this.C = linearLayout;
        this.D = nestedScrollView;
        this.E = rightArrowTwoLineTextView2;
        this.F = linearLayout2;
        this.G = rightArrowTwoLineTextView3;
    }
}
