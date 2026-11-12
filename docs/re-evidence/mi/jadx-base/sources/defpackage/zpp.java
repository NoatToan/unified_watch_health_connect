package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes9.dex */
public abstract class zpp extends ViewDataBinding {
    public final TextView A;
    public final ImageView B;
    public final TextView C;

    public zpp(Object obj, View view, int i, TextView textView, ImageView imageView, TextView textView2) {
        super(obj, view, i);
        this.A = textView;
        this.B = imageView;
        this.C = textView2;
    }
}
