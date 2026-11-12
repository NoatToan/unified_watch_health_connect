package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.nfc.widget.CardSwitcherView;
import com.xiaomi.fitness.nfc.widget.DeviceImageView;
import com.xiaomi.fitness.nfc.widget.InnerCardImageView;
import com.xiaomi.fitness.nfc.widget.IssuedTransCardDetailOptionView;
import com.xiaomi.fitness.nfc.widget.MarqueeTextView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class fqg extends ViewDataBinding {
    public final InnerCardImageView A;
    public final CardSwitcherView B;
    public final TextView C;
    public final TextView D;
    public final IssuedTransCardDetailOptionView E;
    public final LinearLayout F;
    public final TextView G;
    public final LinearLayout H;
    public final MarqueeTextView I;
    public final TextView J;
    public final TextView K;
    public final TextView L;
    public final TextView M;
    public final DeviceImageView N;

    public fqg(Object obj, View view, int i, InnerCardImageView innerCardImageView, CardSwitcherView cardSwitcherView, TextView textView, TextView textView2, IssuedTransCardDetailOptionView issuedTransCardDetailOptionView, LinearLayout linearLayout, TextView textView3, LinearLayout linearLayout2, MarqueeTextView marqueeTextView, TextView textView4, TextView textView5, TextView textView6, TextView textView7, DeviceImageView deviceImageView) {
        super(obj, view, i);
        this.A = innerCardImageView;
        this.B = cardSwitcherView;
        this.C = textView;
        this.D = textView2;
        this.E = issuedTransCardDetailOptionView;
        this.F = linearLayout;
        this.G = textView3;
        this.H = linearLayout2;
        this.I = marqueeTextView;
        this.J = textView4;
        this.K = textView5;
        this.L = textView6;
        this.M = textView7;
        this.N = deviceImageView;
    }
}
