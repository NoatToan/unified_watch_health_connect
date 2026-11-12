package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.watch.face.view.FaceImageView;

/* JADX INFO: loaded from: classes10.dex */
public abstract class qnd extends ViewDataBinding {
    public final TextView A;
    public final FaceImageView B;
    public final TextView C;

    public qnd(Object obj, View view, int i, TextView textView, FaceImageView faceImageView, TextView textView2) {
        super(obj, view, i);
        this.A = textView;
        this.B = faceImageView;
        this.C = textView2;
    }
}
