package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.watch.face.export.exportview.FaceInfoView;

/* JADX INFO: loaded from: classes10.dex */
public abstract class und extends ViewDataBinding {
    public final FaceInfoView A;
    public final ImageView B;

    public und(Object obj, View view, int i, FaceInfoView faceInfoView, ImageView imageView) {
        super(obj, view, i);
        this.A = faceInfoView;
        this.B = imageView;
    }

    public static und A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static und B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (und) ViewDataBinding.G(layoutInflater, ovi.n0, viewGroup, z, obj);
    }
}
