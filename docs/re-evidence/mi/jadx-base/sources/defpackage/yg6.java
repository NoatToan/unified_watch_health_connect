package defpackage;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import androidx.databinding.ViewDataBinding;
import miuix.core.widget.NestedScrollView;

/* JADX INFO: loaded from: classes8.dex */
public abstract class yg6 extends ViewDataBinding {
    public final Button A;
    public final ImageView B;
    public final NestedScrollView C;

    public yg6(Object obj, View view, int i, Button button, ImageView imageView, NestedScrollView nestedScrollView) {
        super(obj, view, i);
        this.A = button;
        this.B = imageView;
        this.C = nestedScrollView;
    }
}
