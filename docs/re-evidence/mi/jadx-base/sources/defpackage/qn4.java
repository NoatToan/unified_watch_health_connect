package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.imageview.ShapeableImageView;

/* JADX INFO: loaded from: classes5.dex */
public abstract class qn4 extends ViewDataBinding {
    public final ShapeableImageView A;
    public final TextView B;
    public final TextView C;
    public final TextView D;
    public final TextView E;
    public final View F;

    public qn4(Object obj, View view, int i, ShapeableImageView shapeableImageView, TextView textView, TextView textView2, TextView textView3, TextView textView4, View view2) {
        super(obj, view, i);
        this.A = shapeableImageView;
        this.B = textView;
        this.C = textView2;
        this.D = textView3;
        this.E = textView4;
        this.F = view2;
    }

    public static qn4 A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static qn4 B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (qn4) ViewDataBinding.G(layoutInflater, sti.course_all_catlog_item, viewGroup, z, obj);
    }
}
