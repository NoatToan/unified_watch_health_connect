package defpackage;

import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes9.dex */
public abstract class rtg extends ViewDataBinding {
    public final EditText A;
    public final EditText B;
    public final RelativeLayout C;
    public final TextView D;
    public final TextView E;
    public final TextView F;
    public final View G;
    public final View H;

    public rtg(Object obj, View view, int i, EditText editText, EditText editText2, RelativeLayout relativeLayout, TextView textView, TextView textView2, TextView textView3, View view2, View view3) {
        super(obj, view, i);
        this.A = editText;
        this.B = editText2;
        this.C = relativeLayout;
        this.D = textView;
        this.E = textView2;
        this.F = textView3;
        this.G = view2;
        this.H = view3;
    }
}
