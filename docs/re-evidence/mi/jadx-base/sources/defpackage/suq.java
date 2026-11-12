package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.imageview.ShapeableImageView;

/* JADX INFO: loaded from: classes10.dex */
public abstract class suq extends ViewDataBinding {
    public final ConstraintLayout A;
    public final TextView B;
    public final ShapeableImageView C;
    public View.OnClickListener D;

    public suq(Object obj, View view, int i, ConstraintLayout constraintLayout, TextView textView, ShapeableImageView shapeableImageView) {
        super(obj, view, i);
        this.A = constraintLayout;
        this.B = textView;
        this.C = shapeableImageView;
    }

    public abstract void setClick(View.OnClickListener onClickListener);
}
