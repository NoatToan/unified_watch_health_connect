package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.watch.face.view.FaceColorPickView;
import com.xiaomi.fitness.watch.face.widget.VideoBgPicker;
import com.xiaomi.fitness.widget.view.DividerView;

/* JADX INFO: loaded from: classes10.dex */
public abstract class n6a extends ViewDataBinding {
    public final TextView A;
    public final TextView B;
    public final View C;
    public final FaceColorPickView D;
    public final LinearLayout E;
    public final DividerView F;
    public final View G;
    public final ImageView H;
    public final TextView I;
    public final ConstraintLayout J;
    public final TextView K;
    public final ConstraintLayout L;
    public final VideoBgPicker M;
    public final TextView N;
    public final RecyclerView O;
    public final TextView P;

    public n6a(Object obj, View view, int i, TextView textView, TextView textView2, View view2, FaceColorPickView faceColorPickView, LinearLayout linearLayout, DividerView dividerView, View view3, ImageView imageView, TextView textView3, ConstraintLayout constraintLayout, TextView textView4, ConstraintLayout constraintLayout2, VideoBgPicker videoBgPicker, TextView textView5, RecyclerView recyclerView, TextView textView6) {
        super(obj, view, i);
        this.A = textView;
        this.B = textView2;
        this.C = view2;
        this.D = faceColorPickView;
        this.E = linearLayout;
        this.F = dividerView;
        this.G = view3;
        this.H = imageView;
        this.I = textView3;
        this.J = constraintLayout;
        this.K = textView4;
        this.L = constraintLayout2;
        this.M = videoBgPicker;
        this.N = textView5;
        this.O = recyclerView;
        this.P = textView6;
    }
}
