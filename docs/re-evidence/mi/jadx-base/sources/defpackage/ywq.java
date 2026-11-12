package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes10.dex */
public abstract class ywq extends ViewDataBinding {
    public final TextView A;
    public String B;

    public ywq(Object obj, View view, int i, TextView textView) {
        super(obj, view, i);
        this.A = textView;
    }

    public abstract void A0(String str);
}
