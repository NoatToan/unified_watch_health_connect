package defpackage;

import android.view.View;
import android.widget.Button;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.health.curse.view.CurseSetItemView;
import com.xiaomi.fitness.widget.SwitchButtonSingleLineTextView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class gsb extends ViewDataBinding {
    public final CurseSetItemView A;
    public final CurseSetItemView B;
    public final CurseSetItemView C;
    public final SwitchButtonSingleLineTextView D;
    public final Button E;
    public final ConstraintLayout F;

    public gsb(Object obj, View view, int i, CurseSetItemView curseSetItemView, CurseSetItemView curseSetItemView2, CurseSetItemView curseSetItemView3, SwitchButtonSingleLineTextView switchButtonSingleLineTextView, Button button, ConstraintLayout constraintLayout) {
        super(obj, view, i);
        this.A = curseSetItemView;
        this.B = curseSetItemView2;
        this.C = curseSetItemView3;
        this.D = switchButtonSingleLineTextView;
        this.E = button;
        this.F = constraintLayout;
    }
}
