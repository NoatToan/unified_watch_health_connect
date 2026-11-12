package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.watch.face.view.FaceImageView;

/* JADX INFO: loaded from: classes10.dex */
public abstract class b9e extends ViewDataBinding {
    public final View A;
    public final View B;
    public final TextView C;
    public final FaceImageView D;
    public final TextView E;
    public final TextView F;
    public final FaceImageView G;
    public final TextView H;

    public b9e(Object obj, View view, int i, View view2, View view3, TextView textView, FaceImageView faceImageView, TextView textView2, TextView textView3, FaceImageView faceImageView2, TextView textView4) {
        super(obj, view, i);
        this.A = view2;
        this.B = view3;
        this.C = textView;
        this.D = faceImageView;
        this.E = textView2;
        this.F = textView3;
        this.G = faceImageView2;
        this.H = textView4;
    }

    public static b9e A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static b9e B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (b9e) ViewDataBinding.G(layoutInflater, ovi.r0, viewGroup, z, obj);
    }
}
