package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.widget.button.SwitchButton;

/* JADX INFO: loaded from: classes8.dex */
public abstract class ydb extends ViewDataBinding {
    public final RelativeLayout A;
    public final TextView B;
    public final TextView C;
    public final SwitchButton D;
    public final RecyclerView E;
    public final ImageView F;
    public final ImageView G;
    public final ImageView H;
    public final TextView I;
    public final RelativeLayout J;
    public final ScrollView K;
    public final RecyclerView L;
    public final RelativeLayout M;
    public final TextView N;

    public ydb(Object obj, View view, int i, RelativeLayout relativeLayout, TextView textView, TextView textView2, SwitchButton switchButton, RecyclerView recyclerView, ImageView imageView, ImageView imageView2, ImageView imageView3, TextView textView3, RelativeLayout relativeLayout2, ScrollView scrollView, RecyclerView recyclerView2, RelativeLayout relativeLayout3, TextView textView4) {
        super(obj, view, i);
        this.A = relativeLayout;
        this.B = textView;
        this.C = textView2;
        this.D = switchButton;
        this.E = recyclerView;
        this.F = imageView;
        this.G = imageView2;
        this.H = imageView3;
        this.I = textView3;
        this.J = relativeLayout2;
        this.K = scrollView;
        this.L = recyclerView2;
        this.M = relativeLayout3;
        this.N = textView4;
    }
}
