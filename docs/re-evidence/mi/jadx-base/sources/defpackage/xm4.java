package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.imageview.ShapeableImageView;

/* JADX INFO: loaded from: classes5.dex */
public abstract class xm4 extends ViewDataBinding {
    public final TextView A;
    public final ShapeableImageView B;
    public final TextView C;
    public final TextView D;

    public xm4(Object obj, View view, int i, TextView textView, ShapeableImageView shapeableImageView, TextView textView2, TextView textView3) {
        super(obj, view, i);
        this.A = textView;
        this.B = shapeableImageView;
        this.C = textView2;
        this.D = textView3;
    }

    public static xm4 A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static xm4 B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (xm4) ViewDataBinding.G(layoutInflater, sti.course_ad_vip_list_item, viewGroup, z, obj);
    }
}
