package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.widget.view.RoundImageView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class mub extends ViewDataBinding {
    public final RoundImageView A;
    public final TextView B;
    public final TextView C;
    public final TextView D;
    public final TextView E;

    public mub(Object obj, View view, int i, RoundImageView roundImageView, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        super(obj, view, i);
        this.A = roundImageView;
        this.B = textView;
        this.C = textView2;
        this.D = textView3;
        this.E = textView4;
    }
}
