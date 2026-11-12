package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.watch.face.export.exportview.RectView;
import com.xiaomi.fitness.watch.face.view.FaceStyleView;
import com.xiaomi.fitness.watch.face.view.ScaleView;

/* JADX INFO: loaded from: classes10.dex */
public abstract class d6a extends ViewDataBinding {
    public final TextView A;
    public final ScaleView B;
    public final TextView C;
    public final RecyclerView D;
    public final RectView E;
    public final FaceStyleView F;

    public d6a(Object obj, View view, int i, TextView textView, ScaleView scaleView, TextView textView2, RecyclerView recyclerView, RectView rectView, FaceStyleView faceStyleView) {
        super(obj, view, i);
        this.A = textView;
        this.B = scaleView;
        this.C = textView2;
        this.D = recyclerView;
        this.E = rectView;
        this.F = faceStyleView;
    }

    public static d6a A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static d6a B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (d6a) ViewDataBinding.G(layoutInflater, ovi.a0, viewGroup, z, obj);
    }
}
