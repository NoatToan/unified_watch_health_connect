package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes8.dex */
public abstract class zk0 extends ViewDataBinding {
    public final TextView A;
    public final TextView B;
    public final ImageView C;
    public final RelativeLayout D;
    public final ImageView E;

    public zk0(Object obj, View view, int i, TextView textView, TextView textView2, ImageView imageView, RelativeLayout relativeLayout, ImageView imageView2) {
        super(obj, view, i);
        this.A = textView;
        this.B = textView2;
        this.C = imageView;
        this.D = relativeLayout;
        this.E = imageView2;
    }
}
