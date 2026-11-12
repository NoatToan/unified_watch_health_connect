package defpackage;

import android.view.View;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.devicesettings.bluttooth.healthmonitor.sleep.viewmodel.BleSleepSettingViewModel;
import com.xiaomi.fitness.widget.SwitchButtonBindingTwoLineTextView;
import com.xiaomi.fitness.widget.SwitchButtonTwoLineTextView;

/* JADX INFO: loaded from: classes8.dex */
public abstract class ag6 extends ViewDataBinding {
    public final SwitchButtonTwoLineTextView A;
    public final SwitchButtonTwoLineTextView B;
    public final SwitchButtonBindingTwoLineTextView C;
    public BleSleepSettingViewModel D;

    public ag6(Object obj, View view, int i, SwitchButtonTwoLineTextView switchButtonTwoLineTextView, SwitchButtonTwoLineTextView switchButtonTwoLineTextView2, SwitchButtonBindingTwoLineTextView switchButtonBindingTwoLineTextView) {
        super(obj, view, i);
        this.A = switchButtonTwoLineTextView;
        this.B = switchButtonTwoLineTextView2;
        this.C = switchButtonBindingTwoLineTextView;
    }
}
