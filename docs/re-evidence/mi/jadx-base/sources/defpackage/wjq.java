package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes10.dex */
public abstract class wjq extends ViewDataBinding {
    public final TextView A;
    public final TextView B;

    public wjq(Object obj, View view, int i, TextView textView, TextView textView2) {
        super(obj, view, i);
        this.A = textView;
        this.B = textView2;
    }
}
