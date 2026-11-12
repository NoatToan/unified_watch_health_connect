package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.watch.face.export.exportview.FaceInfoView;

/* JADX INFO: loaded from: classes10.dex */
public abstract class n19 extends ViewDataBinding {
    public final FaceInfoView A;

    public n19(Object obj, View view, int i, FaceInfoView faceInfoView) {
        super(obj, view, i);
        this.A = faceInfoView;
    }

    public static n19 A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static n19 B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (n19) ViewDataBinding.G(layoutInflater, ovi.s, viewGroup, z, obj);
    }
}
