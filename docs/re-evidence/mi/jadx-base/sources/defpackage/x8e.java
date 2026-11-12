package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.baseui.widget.LevelBarView;

/* JADX INFO: loaded from: classes8.dex */
public abstract class x8e extends ViewDataBinding {
    public final TextView A;
    public final View B;
    public final LevelBarView C;
    public final TextView D;
    public final TextView E;
    public final TextView F;
    public final TextView G;
    public final TextView H;

    public x8e(Object obj, View view, int i, TextView textView, View view2, LevelBarView levelBarView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6) {
        super(obj, view, i);
        this.A = textView;
        this.B = view2;
        this.C = levelBarView;
        this.D = textView2;
        this.E = textView3;
        this.F = textView4;
        this.G = textView5;
        this.H = textView6;
    }
}
