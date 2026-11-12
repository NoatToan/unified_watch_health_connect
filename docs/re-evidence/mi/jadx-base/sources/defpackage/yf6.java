package defpackage;

import android.view.View;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.devicesettings.bluttooth.healthmonitor.pressure.BlePressureSettingViewModel;
import com.xiaomi.fitness.widget.SwitchButtonBindingTwoLineTextView;

/* JADX INFO: loaded from: classes8.dex */
public abstract class yf6 extends ViewDataBinding {
    public final SwitchButtonBindingTwoLineTextView A;
    public final SwitchButtonBindingTwoLineTextView B;
    public BlePressureSettingViewModel C;

    public yf6(Object obj, View view, int i, SwitchButtonBindingTwoLineTextView switchButtonBindingTwoLineTextView, SwitchButtonBindingTwoLineTextView switchButtonBindingTwoLineTextView2) {
        super(obj, view, i);
        this.A = switchButtonBindingTwoLineTextView;
        this.B = switchButtonBindingTwoLineTextView2;
    }
}
