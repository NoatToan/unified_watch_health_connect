package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.watch.face.edit.photo.crop.FaceForegroundScaleView;
import com.xiaomi.fitness.watch.face.export.exportview.RectView;
import com.xiaomi.fitness.watch.face.view.FaceStyleView;
import com.xiaomi.fitness.watch.face.view.XmsTextureView;
import miuix.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes10.dex */
public abstract class fx8 extends ViewDataBinding {
    public final FaceStyleView A;
    public final FaceForegroundScaleView B;
    public final TextView C;
    public final RecyclerView D;
    public final RecyclerView E;
    public final ImageView F;
    public final RectView G;
    public final TextView H;
    public final XmsTextureView I;

    public fx8(Object obj, View view, int i, FaceStyleView faceStyleView, FaceForegroundScaleView faceForegroundScaleView, TextView textView, RecyclerView recyclerView, RecyclerView recyclerView2, ImageView imageView, RectView rectView, TextView textView2, XmsTextureView xmsTextureView) {
        super(obj, view, i);
        this.A = faceStyleView;
        this.B = faceForegroundScaleView;
        this.C = textView;
        this.D = recyclerView;
        this.E = recyclerView2;
        this.F = imageView;
        this.G = rectView;
        this.H = textView2;
        this.I = xmsTextureView;
    }
}
