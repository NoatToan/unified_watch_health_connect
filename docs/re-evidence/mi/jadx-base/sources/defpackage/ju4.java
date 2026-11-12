package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.imageview.ShapeableImageView;

/* JADX INFO: loaded from: classes5.dex */
public abstract class ju4 extends ViewDataBinding {
    public final View A;
    public final TextView B;
    public final TextView C;
    public final ShapeableImageView D;
    public final TextView E;

    public ju4(Object obj, View view, int i, View view2, TextView textView, TextView textView2, ShapeableImageView shapeableImageView, TextView textView3) {
        super(obj, view, i);
        this.A = view2;
        this.B = textView;
        this.C = textView2;
        this.D = shapeableImageView;
        this.E = textView3;
    }

    public static ju4 A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static ju4 B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (ju4) ViewDataBinding.G(layoutInflater, sti.course_layout_list_item, viewGroup, z, obj);
    }
}
