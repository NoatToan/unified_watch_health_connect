package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes9.dex */
public abstract class u8a extends ViewDataBinding {
    public final TextView A;
    public final LinearLayout B;
    public final aae C;

    public u8a(Object obj, View view, int i, TextView textView, LinearLayout linearLayout, aae aaeVar) {
        super(obj, view, i);
        this.A = textView;
        this.B = linearLayout;
        this.C = aaeVar;
    }
}
