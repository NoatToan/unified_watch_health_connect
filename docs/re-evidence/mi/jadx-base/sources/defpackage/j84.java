package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes9.dex */
public abstract class j84 extends ViewDataBinding {
    public final ImageView A;
    public final ImageView B;
    public final RelativeLayout C;
    public final TextView D;

    public j84(Object obj, View view, int i, ImageView imageView, ImageView imageView2, RelativeLayout relativeLayout, TextView textView) {
        super(obj, view, i);
        this.A = imageView;
        this.B = imageView2;
        this.C = relativeLayout;
        this.D = textView;
    }
}
