package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.watch.face.view.FaceWaterMarkView;
import com.xiaomi.fitness.watch.face.viewmodel.FaceDetailViewModel;
import com.xiaomi.fitness.watch.face.widget.FaceDetailScrollView;

/* JADX INFO: loaded from: classes10.dex */
public abstract class hx8 extends ViewDataBinding {
    public final TextView A;
    public final ConstraintLayout B;
    public final ConstraintLayout C;
    public final ConstraintLayout D;
    public final ImageView E;
    public final TextView F;
    public final View G;
    public final b19 H;
    public final TextView I;
    public final RecyclerView J;
    public final TextView K;
    public final TextView L;
    public final TextView M;
    public final ImageView N;
    public final ConstraintLayout O;
    public final TextView P;
    public final RecyclerView Q;
    public final TextView R;
    public final ConstraintLayout S;
    public final FaceDetailScrollView T;
    public final TextView U;
    public final FaceWaterMarkView V;
    public FaceDetailViewModel W;

    public hx8(Object obj, View view, int i, TextView textView, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, ImageView imageView, TextView textView2, View view2, b19 b19Var, TextView textView3, RecyclerView recyclerView, TextView textView4, TextView textView5, TextView textView6, ImageView imageView2, ConstraintLayout constraintLayout4, TextView textView7, RecyclerView recyclerView2, TextView textView8, ConstraintLayout constraintLayout5, FaceDetailScrollView faceDetailScrollView, TextView textView9, FaceWaterMarkView faceWaterMarkView) {
        super(obj, view, i);
        this.A = textView;
        this.B = constraintLayout;
        this.C = constraintLayout2;
        this.D = constraintLayout3;
        this.E = imageView;
        this.F = textView2;
        this.G = view2;
        this.H = b19Var;
        this.I = textView3;
        this.J = recyclerView;
        this.K = textView4;
        this.L = textView5;
        this.M = textView6;
        this.N = imageView2;
        this.O = constraintLayout4;
        this.P = textView7;
        this.Q = recyclerView2;
        this.R = textView8;
        this.S = constraintLayout5;
        this.T = faceDetailScrollView;
        this.U = textView9;
        this.V = faceWaterMarkView;
    }
}
