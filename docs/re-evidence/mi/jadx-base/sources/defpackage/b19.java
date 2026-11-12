package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.watch.face.edit.ui.FaceEditPreviewView;
import com.xiaomi.fitness.watch.face.viewmodel.FaceDetailViewModel;

/* JADX INFO: loaded from: classes10.dex */
public abstract class b19 extends ViewDataBinding {
    public final ImageView A;
    public final ConstraintLayout B;
    public final RecyclerView C;
    public final FaceEditPreviewView D;
    public final ImageView E;
    public final FaceEditPreviewView F;
    public final TextView G;
    public final ImageView H;
    public FaceDetailViewModel I;

    public b19(Object obj, View view, int i, ImageView imageView, ConstraintLayout constraintLayout, RecyclerView recyclerView, FaceEditPreviewView faceEditPreviewView, ImageView imageView2, FaceEditPreviewView faceEditPreviewView2, TextView textView, ImageView imageView3) {
        super(obj, view, i);
        this.A = imageView;
        this.B = constraintLayout;
        this.C = recyclerView;
        this.D = faceEditPreviewView;
        this.E = imageView2;
        this.F = faceEditPreviewView2;
        this.G = textView;
        this.H = imageView3;
    }
}
