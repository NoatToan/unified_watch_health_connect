package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.imageview.ShapeableImageView;

/* JADX INFO: loaded from: classes5.dex */
public abstract class lu4 extends ViewDataBinding {
    public final ShapeableImageView A;
    public final TextView B;
    public final TextView C;

    public lu4(Object obj, View view, int i, ShapeableImageView shapeableImageView, TextView textView, TextView textView2) {
        super(obj, view, i);
        this.A = shapeableImageView;
        this.B = textView;
        this.C = textView2;
    }

    public static lu4 A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static lu4 B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (lu4) ViewDataBinding.G(layoutInflater, sti.course_layout_video_content, viewGroup, z, obj);
    }
}
