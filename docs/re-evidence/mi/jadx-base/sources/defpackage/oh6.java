package defpackage;

import android.view.View;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.devicesettings.huami.healthmonitor.sleep.HuamiSleepSettingViewModel;
import com.xiaomi.fitness.widget.SwitchButtonTwoLineTextView;

/* JADX INFO: loaded from: classes8.dex */
public abstract class oh6 extends ViewDataBinding {
    public final SwitchButtonTwoLineTextView A;
    public final SwitchButtonTwoLineTextView B;
    public HuamiSleepSettingViewModel C;

    public oh6(Object obj, View view, int i, SwitchButtonTwoLineTextView switchButtonTwoLineTextView, SwitchButtonTwoLineTextView switchButtonTwoLineTextView2) {
        super(obj, view, i);
        this.A = switchButtonTwoLineTextView;
        this.B = switchButtonTwoLineTextView2;
    }
}
