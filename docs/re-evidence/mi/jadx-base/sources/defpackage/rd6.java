package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes8.dex */
public abstract class rd6 extends ViewDataBinding {
    public final TextView A;
    public final FrameLayout B;
    public final TextView C;
    public final LinearLayout D;

    public rd6(Object obj, View view, int i, TextView textView, FrameLayout frameLayout, TextView textView2, LinearLayout linearLayout) {
        super(obj, view, i);
        this.A = textView;
        this.B = frameLayout;
        this.C = textView2;
        this.D = linearLayout;
    }
}
