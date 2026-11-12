package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.watch.face.export.exportview.RectView;
import com.xiaomi.fitness.watch.face.view.FaceStyleView;
import com.xiaomi.fitness.watch.face.view.XmsTextureView;

/* JADX INFO: loaded from: classes10.dex */
public abstract class f6a extends ViewDataBinding {
    public final TextView A;
    public final TextView B;
    public final RecyclerView C;
    public final RectView D;
    public final FaceStyleView E;
    public final XmsTextureView F;

    public f6a(Object obj, View view, int i, TextView textView, TextView textView2, RecyclerView recyclerView, RectView rectView, FaceStyleView faceStyleView, XmsTextureView xmsTextureView) {
        super(obj, view, i);
        this.A = textView;
        this.B = textView2;
        this.C = recyclerView;
        this.D = rectView;
        this.E = faceStyleView;
        this.F = xmsTextureView;
    }
}
