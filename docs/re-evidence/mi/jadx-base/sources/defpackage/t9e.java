package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.watch.face.export.data.FaceData;
import com.xiaomi.fitness.watch.face.export.exportview.FaceInfoView;

/* JADX INFO: loaded from: classes10.dex */
public abstract class t9e extends ViewDataBinding {
    public final TextView A;
    public final FaceInfoView B;
    public final TextView C;
    public final ConstraintLayout D;
    public FaceData E;

    public t9e(Object obj, View view, int i, TextView textView, FaceInfoView faceInfoView, TextView textView2, ConstraintLayout constraintLayout) {
        super(obj, view, i);
        this.A = textView;
        this.B = faceInfoView;
        this.C = textView2;
        this.D = constraintLayout;
    }

    public static t9e A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static t9e B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (t9e) ViewDataBinding.G(layoutInflater, ovi.A0, viewGroup, z, obj);
    }
}
