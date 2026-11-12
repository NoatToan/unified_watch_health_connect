package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.watch.face.export.exportview.FaceInfoView;

/* JADX INFO: loaded from: classes10.dex */
public abstract class h9e extends ViewDataBinding {
    public final FaceInfoView A;
    public final FaceInfoView B;
    public final FaceInfoView C;
    public final TextView D;

    public h9e(Object obj, View view, int i, FaceInfoView faceInfoView, FaceInfoView faceInfoView2, FaceInfoView faceInfoView3, TextView textView) {
        super(obj, view, i);
        this.A = faceInfoView;
        this.B = faceInfoView2;
        this.C = faceInfoView3;
        this.D = textView;
    }

    public static h9e A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static h9e B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (h9e) ViewDataBinding.G(layoutInflater, ovi.u0, viewGroup, z, obj);
    }
}
