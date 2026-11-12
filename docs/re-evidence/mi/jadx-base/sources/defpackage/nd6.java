package defpackage;

import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes8.dex */
public abstract class nd6 extends ViewDataBinding {
    public final Button A;
    public final FrameLayout B;
    public final LinearLayout C;
    public final ImageView D;
    public final RecyclerView E;
    public final Button F;
    public final TextView G;

    public nd6(Object obj, View view, int i, Button button, FrameLayout frameLayout, LinearLayout linearLayout, ImageView imageView, RecyclerView recyclerView, Button button2, TextView textView) {
        super(obj, view, i);
        this.A = button;
        this.B = frameLayout;
        this.C = linearLayout;
        this.D = imageView;
        this.E = recyclerView;
        this.F = button2;
        this.G = textView;
    }
}
