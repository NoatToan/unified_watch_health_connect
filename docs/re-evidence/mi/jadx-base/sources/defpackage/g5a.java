package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.sport_eco.baseui.TitleBar;
import com.xiaomi.fitness.sport_eco.view.widget.JumpCountCustomGoalView;

/* JADX INFO: loaded from: classes10.dex */
public abstract class g5a extends ViewDataBinding {
    public final JumpCountCustomGoalView A;
    public final TextView B;
    public final TitleBar C;

    public g5a(Object obj, View view, int i, JumpCountCustomGoalView jumpCountCustomGoalView, TextView textView, TitleBar titleBar) {
        super(obj, view, i);
        this.A = jumpCountCustomGoalView;
        this.B = textView;
        this.C = titleBar;
    }
}
