package defpackage;

import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.sport_capture.widgets.AutoFitTextureView;

/* JADX INFO: loaded from: classes10.dex */
public abstract class mma extends ViewDataBinding {
    public final ImageView A;
    public final ConstraintLayout B;
    public final ImageView C;
    public final ImageView D;
    public final AutoFitTextureView E;

    public mma(Object obj, View view, int i, ImageView imageView, ConstraintLayout constraintLayout, ImageView imageView2, ImageView imageView3, AutoFitTextureView autoFitTextureView) {
        super(obj, view, i);
        this.A = imageView;
        this.B = constraintLayout;
        this.C = imageView2;
        this.D = imageView3;
        this.E = autoFitTextureView;
    }
}
