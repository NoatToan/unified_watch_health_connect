package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.nfc.widget.TSMSetRightArrowView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class nng extends ViewDataBinding {
    public final TSMSetRightArrowView A;
    public final LinearLayout B;
    public final LinearLayout C;
    public final FrameLayout D;
    public final ListView E;
    public final TSMSetRightArrowView F;
    public final LinearLayout G;
    public final LinearLayout H;
    public final TextView I;
    public final ImageView J;
    public final TextView K;
    public final View L;

    public nng(Object obj, View view, int i, TSMSetRightArrowView tSMSetRightArrowView, LinearLayout linearLayout, LinearLayout linearLayout2, FrameLayout frameLayout, ListView listView, TSMSetRightArrowView tSMSetRightArrowView2, LinearLayout linearLayout3, LinearLayout linearLayout4, TextView textView, ImageView imageView, TextView textView2, View view2) {
        super(obj, view, i);
        this.A = tSMSetRightArrowView;
        this.B = linearLayout;
        this.C = linearLayout2;
        this.D = frameLayout;
        this.E = listView;
        this.F = tSMSetRightArrowView2;
        this.G = linearLayout3;
        this.H = linearLayout4;
        this.I = textView;
        this.J = imageView;
        this.K = textView2;
        this.L = view2;
    }
}
