package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.imageview.ShapeableImageView;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zu4 extends ViewDataBinding {
    public final View A;
    public final TextView B;
    public final ShapeableImageView C;
    public final TextView D;
    public final TextView E;

    public zu4(Object obj, View view, int i, View view2, TextView textView, ShapeableImageView shapeableImageView, TextView textView2, TextView textView3) {
        super(obj, view, i);
        this.A = view2;
        this.B = textView;
        this.C = shapeableImageView;
        this.D = textView2;
        this.E = textView3;
    }

    public static zu4 A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static zu4 B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (zu4) ViewDataBinding.G(layoutInflater, sti.course_me_item, viewGroup, z, obj);
    }
}
