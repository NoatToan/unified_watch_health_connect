package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.watch.face.edit.photo.crop.FaceForegroundScaleView;
import com.xiaomi.fitness.watch.face.export.exportview.RectView;
import com.xiaomi.fitness.watch.face.view.FaceStyleView;
import com.xiaomi.fitness.watch.face.view.ScaleView;
import miuix.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes10.dex */
public abstract class bx8 extends ViewDataBinding {
    public final FaceStyleView A;
    public final FaceForegroundScaleView B;
    public final TextView C;
    public final ScaleView D;
    public final RecyclerView E;
    public final RecyclerView F;
    public final RectView G;
    public final TextView H;

    public bx8(Object obj, View view, int i, FaceStyleView faceStyleView, FaceForegroundScaleView faceForegroundScaleView, TextView textView, ScaleView scaleView, RecyclerView recyclerView, RecyclerView recyclerView2, RectView rectView, TextView textView2) {
        super(obj, view, i);
        this.A = faceStyleView;
        this.B = faceForegroundScaleView;
        this.C = textView;
        this.D = scaleView;
        this.E = recyclerView;
        this.F = recyclerView2;
        this.G = rectView;
        this.H = textView2;
    }
}
