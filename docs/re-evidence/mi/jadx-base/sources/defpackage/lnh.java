package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.pay.result.PayResultViewModel;

/* JADX INFO: loaded from: classes9.dex */
public abstract class lnh extends ViewDataBinding {
    public final View A;
    public final TextView B;
    public final TextView C;
    public final TextView D;
    public final ImageView E;
    public final TextView F;
    public final RecyclerView G;
    public final TextView H;
    public final TextView I;
    public final TextView J;
    public final TextView K;
    public final ImageView L;
    public final TextView M;
    public PayResultViewModel N;
    public String O;
    public String P;
    public String Q;
    public String R;
    public String S;

    public lnh(Object obj, View view, int i, View view2, TextView textView, TextView textView2, TextView textView3, ImageView imageView, TextView textView4, RecyclerView recyclerView, TextView textView5, TextView textView6, TextView textView7, TextView textView8, ImageView imageView2, TextView textView9) {
        super(obj, view, i);
        this.A = view2;
        this.B = textView;
        this.C = textView2;
        this.D = textView3;
        this.E = imageView;
        this.F = textView4;
        this.G = recyclerView;
        this.H = textView5;
        this.I = textView6;
        this.J = textView7;
        this.K = textView8;
        this.L = imageView2;
        this.M = textView9;
    }

    public abstract void A0(String str);

    public abstract void B0(String str);

    public abstract void C0(String str);

    public abstract void D0(String str);

    public abstract void E0(String str);
}
