package defpackage;

import android.view.View;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.devicesettings.huami.goalremind.GoalRemindViewModel;
import com.xiaomi.fitness.widget.SwitchButtonBindingTwoLineTextView;
import miuix.core.widget.NestedScrollView;

/* JADX INFO: loaded from: classes8.dex */
public abstract class sg6 extends ViewDataBinding {
    public final SwitchButtonBindingTwoLineTextView A;
    public final NestedScrollView B;
    public GoalRemindViewModel C;

    public sg6(Object obj, View view, int i, SwitchButtonBindingTwoLineTextView switchButtonBindingTwoLineTextView, NestedScrollView nestedScrollView) {
        super(obj, view, i);
        this.A = switchButtonBindingTwoLineTextView;
        this.B = nestedScrollView;
    }
}
