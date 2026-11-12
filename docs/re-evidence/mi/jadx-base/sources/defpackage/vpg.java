package defpackage;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes9.dex */
public abstract class vpg extends ViewDataBinding {
    public final TextView A;
    public final RelativeLayout B;
    public final TextView C;

    public vpg(Object obj, View view, int i, TextView textView, RelativeLayout relativeLayout, TextView textView2) {
        super(obj, view, i);
        this.A = textView;
        this.B = relativeLayout;
        this.C = textView2;
    }
}
