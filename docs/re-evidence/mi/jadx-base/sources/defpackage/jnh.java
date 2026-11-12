package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.pay.channel.PayChannelViewModel;

/* JADX INFO: loaded from: classes9.dex */
public abstract class jnh extends ViewDataBinding {
    public final RecyclerView A;
    public final TextView B;
    public final TextView C;
    public final TextView D;
    public final TextView E;
    public final TextView F;
    public PayChannelViewModel G;

    public jnh(Object obj, View view, int i, RecyclerView recyclerView, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5) {
        super(obj, view, i);
        this.A = recyclerView;
        this.B = textView;
        this.C = textView2;
        this.D = textView3;
        this.E = textView4;
        this.F = textView5;
    }
}
