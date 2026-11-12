package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.sport_eco.view.launch.gym.setting.LocalDeviceInfoViewModel;
import com.xiaomi.fitness.widget.RightArrowBindingTwoLineTextView;
import miuix.core.widget.NestedScrollView;

/* JADX INFO: loaded from: classes10.dex */
public abstract class sh6 extends ViewDataBinding {
    public final ImageView A;
    public final RightArrowBindingTwoLineTextView B;
    public final RightArrowBindingTwoLineTextView C;
    public final TextView D;
    public final RightArrowBindingTwoLineTextView E;
    public final RightArrowBindingTwoLineTextView F;
    public final LinearLayout G;
    public final NestedScrollView H;
    public LocalDeviceInfoViewModel I;

    public sh6(Object obj, View view, int i, ImageView imageView, RightArrowBindingTwoLineTextView rightArrowBindingTwoLineTextView, RightArrowBindingTwoLineTextView rightArrowBindingTwoLineTextView2, TextView textView, RightArrowBindingTwoLineTextView rightArrowBindingTwoLineTextView3, RightArrowBindingTwoLineTextView rightArrowBindingTwoLineTextView4, LinearLayout linearLayout, NestedScrollView nestedScrollView) {
        super(obj, view, i);
        this.A = imageView;
        this.B = rightArrowBindingTwoLineTextView;
        this.C = rightArrowBindingTwoLineTextView2;
        this.D = textView;
        this.E = rightArrowBindingTwoLineTextView3;
        this.F = rightArrowBindingTwoLineTextView4;
        this.G = linearLayout;
        this.H = nestedScrollView;
    }
}
