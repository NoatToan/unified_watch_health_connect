package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.nfc.widget.CardSwitcherView;
import com.xiaomi.fitness.nfc.widget.DeviceImageView;
import com.xiaomi.fitness.nfc.widget.InnerCardImageView;
import com.xiaomi.fitness.widget.RightArrowSingleLineTextView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class rog extends ViewDataBinding {
    public final CardSwitcherView A;
    public final InnerCardImageView B;
    public final TextView C;
    public final DeviceImageView D;
    public final ConstraintLayout E;
    public final RelativeLayout F;
    public final TextView G;
    public final LinearLayout H;
    public final TextView I;
    public final TextView J;
    public final LinearLayout K;
    public final TextView L;
    public final TextView M;
    public final RightArrowSingleLineTextView N;
    public final TextView O;

    public rog(Object obj, View view, int i, CardSwitcherView cardSwitcherView, InnerCardImageView innerCardImageView, TextView textView, DeviceImageView deviceImageView, ConstraintLayout constraintLayout, RelativeLayout relativeLayout, TextView textView2, LinearLayout linearLayout, TextView textView3, TextView textView4, LinearLayout linearLayout2, TextView textView5, TextView textView6, RightArrowSingleLineTextView rightArrowSingleLineTextView, TextView textView7) {
        super(obj, view, i);
        this.A = cardSwitcherView;
        this.B = innerCardImageView;
        this.C = textView;
        this.D = deviceImageView;
        this.E = constraintLayout;
        this.F = relativeLayout;
        this.G = textView2;
        this.H = linearLayout;
        this.I = textView3;
        this.J = textView4;
        this.K = linearLayout2;
        this.L = textView5;
        this.M = textView6;
        this.N = rightArrowSingleLineTextView;
        this.O = textView7;
    }
}
