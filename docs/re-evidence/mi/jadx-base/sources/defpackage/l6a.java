package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.watch.face.view.FaceColorPickView;
import com.xiaomi.fitness.watch.face.view.FaceFunView;
import com.xiaomi.fitness.watch.face.widget.PhotoBgPicker;
import com.xiaomi.fitness.widget.view.DividerView;

/* JADX INFO: loaded from: classes10.dex */
public abstract class l6a extends ViewDataBinding {
    public final TextView A;
    public final TextView B;
    public final View C;
    public final FaceColorPickView D;
    public final LinearLayout E;
    public final DividerView F;
    public final View G;
    public final FaceFunView H;
    public final ImageView I;
    public final TextView J;
    public final ConstraintLayout K;
    public final TextView L;
    public final ConstraintLayout M;
    public final PhotoBgPicker N;
    public final TextView O;
    public final RecyclerView P;
    public final TextView Q;

    public l6a(Object obj, View view, int i, TextView textView, TextView textView2, View view2, FaceColorPickView faceColorPickView, LinearLayout linearLayout, DividerView dividerView, View view3, FaceFunView faceFunView, ImageView imageView, TextView textView3, ConstraintLayout constraintLayout, TextView textView4, ConstraintLayout constraintLayout2, PhotoBgPicker photoBgPicker, TextView textView5, RecyclerView recyclerView, TextView textView6) {
        super(obj, view, i);
        this.A = textView;
        this.B = textView2;
        this.C = view2;
        this.D = faceColorPickView;
        this.E = linearLayout;
        this.F = dividerView;
        this.G = view3;
        this.H = faceFunView;
        this.I = imageView;
        this.J = textView3;
        this.K = constraintLayout;
        this.L = textView4;
        this.M = constraintLayout2;
        this.N = photoBgPicker;
        this.O = textView5;
        this.P = recyclerView;
        this.Q = textView6;
    }
}
