package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.devicesettings.base.about.DeviceInfoViewModel;
import com.xiaomi.fitness.widget.RightArrowBindingSingleLineTextView;
import com.xiaomi.fitness.widget.RightArrowBindingTwoLineTextView;
import com.xiaomi.fitness.widget.RightArrowTwoLineTextView;
import miuix.core.widget.NestedScrollView;

/* JADX INFO: loaded from: classes8.dex */
public abstract class kj6 extends ViewDataBinding {
    public final AppCompatImageButton A;
    public final ImageView B;
    public final RightArrowBindingSingleLineTextView C;
    public final RightArrowBindingTwoLineTextView D;
    public final RightArrowBindingTwoLineTextView E;
    public final TextView F;
    public final RightArrowTwoLineTextView G;
    public final RightArrowBindingTwoLineTextView H;
    public final RightArrowTwoLineTextView I;
    public final RightArrowBindingTwoLineTextView J;
    public final RightArrowTwoLineTextView K;
    public final LinearLayout L;
    public final RightArrowTwoLineTextView M;
    public final NestedScrollView N;
    public DeviceInfoViewModel O;

    public kj6(Object obj, View view, int i, AppCompatImageButton appCompatImageButton, ImageView imageView, RightArrowBindingSingleLineTextView rightArrowBindingSingleLineTextView, RightArrowBindingTwoLineTextView rightArrowBindingTwoLineTextView, RightArrowBindingTwoLineTextView rightArrowBindingTwoLineTextView2, TextView textView, RightArrowTwoLineTextView rightArrowTwoLineTextView, RightArrowBindingTwoLineTextView rightArrowBindingTwoLineTextView3, RightArrowTwoLineTextView rightArrowTwoLineTextView2, RightArrowBindingTwoLineTextView rightArrowBindingTwoLineTextView4, RightArrowTwoLineTextView rightArrowTwoLineTextView3, LinearLayout linearLayout, RightArrowTwoLineTextView rightArrowTwoLineTextView4, NestedScrollView nestedScrollView) {
        super(obj, view, i);
        this.A = appCompatImageButton;
        this.B = imageView;
        this.C = rightArrowBindingSingleLineTextView;
        this.D = rightArrowBindingTwoLineTextView;
        this.E = rightArrowBindingTwoLineTextView2;
        this.F = textView;
        this.G = rightArrowTwoLineTextView;
        this.H = rightArrowBindingTwoLineTextView3;
        this.I = rightArrowTwoLineTextView2;
        this.J = rightArrowBindingTwoLineTextView4;
        this.K = rightArrowTwoLineTextView3;
        this.L = linearLayout;
        this.M = rightArrowTwoLineTextView4;
        this.N = nestedScrollView;
    }
}
