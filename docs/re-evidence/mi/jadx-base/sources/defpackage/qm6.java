package defpackage;

import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import miuix.core.widget.NestedScrollView;

/* JADX INFO: loaded from: classes8.dex */
public abstract class qm6 extends ViewDataBinding {
    public final Button A;
    public final FrameLayout B;
    public final TextView C;
    public final LinearLayout D;
    public final ImageView E;
    public final RecyclerView F;
    public final LinearLayout G;
    public final NestedScrollView H;

    public qm6(Object obj, View view, int i, Button button, FrameLayout frameLayout, TextView textView, LinearLayout linearLayout, ImageView imageView, RecyclerView recyclerView, LinearLayout linearLayout2, NestedScrollView nestedScrollView) {
        super(obj, view, i);
        this.A = button;
        this.B = frameLayout;
        this.C = textView;
        this.D = linearLayout;
        this.E = imageView;
        this.F = recyclerView;
        this.G = linearLayout2;
        this.H = nestedScrollView;
    }
}
