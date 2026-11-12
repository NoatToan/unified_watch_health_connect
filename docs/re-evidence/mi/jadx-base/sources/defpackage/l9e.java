package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.watch.face.export.exportview.FaceInfoView;

/* JADX INFO: loaded from: classes10.dex */
public abstract class l9e extends ViewDataBinding {
    public final TextView A;
    public final TextView B;
    public final FaceInfoView C;
    public final ConstraintLayout D;

    public l9e(Object obj, View view, int i, TextView textView, TextView textView2, FaceInfoView faceInfoView, ConstraintLayout constraintLayout) {
        super(obj, view, i);
        this.A = textView;
        this.B = textView2;
        this.C = faceInfoView;
        this.D = constraintLayout;
    }
}
