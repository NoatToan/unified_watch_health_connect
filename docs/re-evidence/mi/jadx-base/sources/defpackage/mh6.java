package defpackage;

import android.view.View;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.devicesettings.huami.healthmonitor.pressure.HuamiPressureSettingViewModel;
import com.xiaomi.fitness.widget.SwitchButtonBindingTwoLineTextView;

/* JADX INFO: loaded from: classes8.dex */
public abstract class mh6 extends ViewDataBinding {
    public final SwitchButtonBindingTwoLineTextView A;
    public final SwitchButtonBindingTwoLineTextView B;
    public HuamiPressureSettingViewModel C;

    public mh6(Object obj, View view, int i, SwitchButtonBindingTwoLineTextView switchButtonBindingTwoLineTextView, SwitchButtonBindingTwoLineTextView switchButtonBindingTwoLineTextView2) {
        super(obj, view, i);
        this.A = switchButtonBindingTwoLineTextView;
        this.B = switchButtonBindingTwoLineTextView2;
    }
}
