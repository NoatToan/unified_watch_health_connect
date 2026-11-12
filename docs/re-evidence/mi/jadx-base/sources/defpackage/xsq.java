package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes10.dex */
public abstract class xsq extends ViewDataBinding {
    public final ConstraintLayout A;
    public final TextView B;
    public final ImageView C;
    public View.OnClickListener D;

    public xsq(Object obj, View view, int i, ConstraintLayout constraintLayout, TextView textView, ImageView imageView) {
        super(obj, view, i);
        this.A = constraintLayout;
        this.B = textView;
        this.C = imageView;
    }

    public abstract void setClick(View.OnClickListener onClickListener);
}
