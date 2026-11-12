package defpackage;

import android.view.TextureView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.watch.face.edit.ui.FaceEditPreviewView;
import com.xiaomi.fitness.watch.face.viewmodel.FaceEditViewModel;
import com.xiaomi.fitness.watch.face.widget.FaceEditPicker;
import com.xiaomi.fitness.watch.face.widget.FaceEditScrollLayout;

/* JADX INFO: loaded from: classes10.dex */
public abstract class jx8 extends ViewDataBinding {
    public final TextView A;
    public final ImageView B;
    public final ConstraintLayout C;
    public final ConstraintLayout D;
    public final FaceEditPicker E;
    public final FaceEditPreviewView F;
    public final TextureView G;
    public final ImageView H;
    public final ConstraintLayout I;
    public final ConstraintLayout J;
    public final FaceEditScrollLayout K;
    public final ImageView L;
    public final CardView M;
    public final ImageView N;
    public FaceEditViewModel O;

    public jx8(Object obj, View view, int i, TextView textView, ImageView imageView, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, FaceEditPicker faceEditPicker, FaceEditPreviewView faceEditPreviewView, TextureView textureView, ImageView imageView2, ConstraintLayout constraintLayout3, ConstraintLayout constraintLayout4, FaceEditScrollLayout faceEditScrollLayout, ImageView imageView3, CardView cardView, ImageView imageView4) {
        super(obj, view, i);
        this.A = textView;
        this.B = imageView;
        this.C = constraintLayout;
        this.D = constraintLayout2;
        this.E = faceEditPicker;
        this.F = faceEditPreviewView;
        this.G = textureView;
        this.H = imageView2;
        this.I = constraintLayout3;
        this.J = constraintLayout4;
        this.K = faceEditScrollLayout;
        this.L = imageView3;
        this.M = cardView;
        this.N = imageView4;
    }
}
