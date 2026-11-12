package defpackage;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.health.curse.view.CurseSetItemView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class msb extends ViewDataBinding {
    public final Button A;
    public final CurseSetItemView B;
    public final TextView C;
    public final Button D;
    public final TextView E;
    public final CurseSetItemView F;
    public final TextView G;
    public final TextView H;

    public msb(Object obj, View view, int i, Button button, CurseSetItemView curseSetItemView, TextView textView, Button button2, TextView textView2, CurseSetItemView curseSetItemView2, TextView textView3, TextView textView4) {
        super(obj, view, i);
        this.A = button;
        this.B = curseSetItemView;
        this.C = textView;
        this.D = button2;
        this.E = textView2;
        this.F = curseSetItemView2;
        this.G = textView3;
        this.H = textView4;
    }
}
