package defpackage;

import android.view.View;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.watch.face.export.exportview.FaceInfoView;

/* JADX INFO: loaded from: classes10.dex */
public abstract class r8e extends ViewDataBinding {
    public final FaceInfoView A;
    public final FaceInfoView B;

    public r8e(Object obj, View view, int i, FaceInfoView faceInfoView, FaceInfoView faceInfoView2) {
        super(obj, view, i);
        this.A = faceInfoView;
        this.B = faceInfoView2;
    }
}
