package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.watch.face.view.FaceImageView;

/* JADX INFO: loaded from: classes10.dex */
public abstract class f39 extends ViewDataBinding {
    public final View A;
    public final FaceImageView B;
    public final TextView C;
    public final TextView D;

    public f39(Object obj, View view, int i, View view2, FaceImageView faceImageView, TextView textView, TextView textView2) {
        super(obj, view, i);
        this.A = view2;
        this.B = faceImageView;
        this.C = textView;
        this.D = textView2;
    }

    public static f39 A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static f39 B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (f39) ViewDataBinding.G(layoutInflater, ovi.T, viewGroup, z, obj);
    }
}
