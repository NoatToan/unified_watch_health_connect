package defpackage;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.nfc.widget.SafeEditText;

/* JADX INFO: loaded from: classes9.dex */
public abstract class rmg extends ViewDataBinding {
    public final TextView A;
    public final View B;
    public final RelativeLayout C;
    public final SafeEditText D;
    public final TextView E;
    public final View F;
    public final TextView G;
    public final TextView H;
    public final TextView I;

    public rmg(Object obj, View view, int i, TextView textView, View view2, RelativeLayout relativeLayout, SafeEditText safeEditText, TextView textView2, View view3, TextView textView3, TextView textView4, TextView textView5) {
        super(obj, view, i);
        this.A = textView;
        this.B = view2;
        this.C = relativeLayout;
        this.D = safeEditText;
        this.E = textView2;
        this.F = view3;
        this.G = textView3;
        this.H = textView4;
        this.I = textView5;
    }
}
