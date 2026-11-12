package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.watch.face.view.FaceImageView;
import com.xiaomi.fitness.widget.view.RatioImageView;

/* JADX INFO: loaded from: classes10.dex */
public abstract class f9e extends ViewDataBinding {
    public final ImageView A;
    public final View B;
    public final RatioImageView C;
    public final View D;
    public final TextView E;
    public final FrameLayout F;
    public final FaceImageView G;
    public final ImageView H;
    public final FaceImageView I;
    public final Group J;
    public final TextView K;

    public f9e(Object obj, View view, int i, ImageView imageView, View view2, RatioImageView ratioImageView, View view3, TextView textView, FrameLayout frameLayout, FaceImageView faceImageView, ImageView imageView2, FaceImageView faceImageView2, Group group, TextView textView2) {
        super(obj, view, i);
        this.A = imageView;
        this.B = view2;
        this.C = ratioImageView;
        this.D = view3;
        this.E = textView;
        this.F = frameLayout;
        this.G = faceImageView;
        this.H = imageView2;
        this.I = faceImageView2;
        this.J = group;
        this.K = textView2;
    }
}
