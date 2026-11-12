package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.watch.face.data.FaceAllTabInfo;
import com.xiaomi.fitness.watch.face.export.exportview.FaceInfoView;

/* JADX INFO: loaded from: classes10.dex */
public abstract class d9e extends ViewDataBinding {
    public final ImageView A;
    public final TextView B;
    public final FaceInfoView C;
    public final FaceInfoView D;
    public final FaceInfoView E;
    public FaceAllTabInfo F;

    public d9e(Object obj, View view, int i, ImageView imageView, TextView textView, FaceInfoView faceInfoView, FaceInfoView faceInfoView2, FaceInfoView faceInfoView3) {
        super(obj, view, i);
        this.A = imageView;
        this.B = textView;
        this.C = faceInfoView;
        this.D = faceInfoView2;
        this.E = faceInfoView3;
    }
}
