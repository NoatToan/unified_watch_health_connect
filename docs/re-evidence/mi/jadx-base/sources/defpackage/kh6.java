package defpackage;

import android.view.View;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.devicesettings.huami.healthmonitor.hr.HuamiHrSettingViewModel;
import com.xiaomi.fitness.widget.RightArrowTwoLineTextView;
import com.xiaomi.fitness.widget.SwitchButtonTwoLineTextView;

/* JADX INFO: loaded from: classes8.dex */
public abstract class kh6 extends ViewDataBinding {
    public final SwitchButtonTwoLineTextView A;
    public final SwitchButtonTwoLineTextView B;
    public final RightArrowTwoLineTextView C;
    public final RightArrowTwoLineTextView D;
    public final RightArrowTwoLineTextView E;
    public HuamiHrSettingViewModel F;

    public kh6(Object obj, View view, int i, SwitchButtonTwoLineTextView switchButtonTwoLineTextView, SwitchButtonTwoLineTextView switchButtonTwoLineTextView2, RightArrowTwoLineTextView rightArrowTwoLineTextView, RightArrowTwoLineTextView rightArrowTwoLineTextView2, RightArrowTwoLineTextView rightArrowTwoLineTextView3) {
        super(obj, view, i);
        this.A = switchButtonTwoLineTextView;
        this.B = switchButtonTwoLineTextView2;
        this.C = rightArrowTwoLineTextView;
        this.D = rightArrowTwoLineTextView2;
        this.E = rightArrowTwoLineTextView3;
    }
}
