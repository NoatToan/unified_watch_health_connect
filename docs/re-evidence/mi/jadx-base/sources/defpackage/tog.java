package defpackage;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.nfc.widget.MarqueeTextView;
import com.xiaomi.fitness.nfc.widget.PhoneNumVerifyView;
import com.xiaomi.fitness.nfc.widget.RechargeItemView;
import com.xiaomi.fitness.nfc.widget.ScrollEmbeddedGridView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class tog extends ViewDataBinding {
    public final CheckBox A;
    public final ImageView B;
    public final RechargeItemView C;
    public final RechargeItemView D;
    public final LinearLayout E;
    public final LinearLayout F;
    public final RechargeItemView G;
    public final ScrollEmbeddedGridView H;
    public final View I;
    public final View J;
    public final LinearLayout K;
    public final LinearLayout L;
    public final TextView M;
    public final RelativeLayout N;
    public final TextView O;
    public final PhoneNumVerifyView P;
    public final TextView Q;
    public final RechargeItemView R;
    public final MarqueeTextView S;

    public tog(Object obj, View view, int i, CheckBox checkBox, ImageView imageView, RechargeItemView rechargeItemView, RechargeItemView rechargeItemView2, LinearLayout linearLayout, LinearLayout linearLayout2, RechargeItemView rechargeItemView3, ScrollEmbeddedGridView scrollEmbeddedGridView, View view2, View view3, LinearLayout linearLayout3, LinearLayout linearLayout4, TextView textView, RelativeLayout relativeLayout, TextView textView2, PhoneNumVerifyView phoneNumVerifyView, TextView textView3, RechargeItemView rechargeItemView4, MarqueeTextView marqueeTextView) {
        super(obj, view, i);
        this.A = checkBox;
        this.B = imageView;
        this.C = rechargeItemView;
        this.D = rechargeItemView2;
        this.E = linearLayout;
        this.F = linearLayout2;
        this.G = rechargeItemView3;
        this.H = scrollEmbeddedGridView;
        this.I = view2;
        this.J = view3;
        this.K = linearLayout3;
        this.L = linearLayout4;
        this.M = textView;
        this.N = relativeLayout;
        this.O = textView2;
        this.P = phoneNumVerifyView;
        this.Q = textView3;
        this.R = rechargeItemView4;
        this.S = marqueeTextView;
    }
}
