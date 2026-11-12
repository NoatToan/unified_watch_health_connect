package defpackage;

import android.view.View;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.devicesettings.huami.healthmonitor.HrHuaMiSettingViewModel;
import com.xiaomi.fitness.widget.RightArrowTwoLineTextView;
import com.xiaomi.fitness.widget.SwitchButtonTwoLineTextView;
import miuix.core.widget.NestedScrollView;

/* JADX INFO: loaded from: classes8.dex */
public abstract class eh6 extends ViewDataBinding {
    public final SwitchButtonTwoLineTextView A;
    public final RightArrowTwoLineTextView B;
    public final RightArrowTwoLineTextView C;
    public final SwitchButtonTwoLineTextView D;
    public final NestedScrollView E;
    public final SwitchButtonTwoLineTextView F;
    public final RightArrowTwoLineTextView G;
    public HrHuaMiSettingViewModel H;

    public eh6(Object obj, View view, int i, SwitchButtonTwoLineTextView switchButtonTwoLineTextView, RightArrowTwoLineTextView rightArrowTwoLineTextView, RightArrowTwoLineTextView rightArrowTwoLineTextView2, SwitchButtonTwoLineTextView switchButtonTwoLineTextView2, NestedScrollView nestedScrollView, SwitchButtonTwoLineTextView switchButtonTwoLineTextView3, RightArrowTwoLineTextView rightArrowTwoLineTextView3) {
        super(obj, view, i);
        this.A = switchButtonTwoLineTextView;
        this.B = rightArrowTwoLineTextView;
        this.C = rightArrowTwoLineTextView2;
        this.D = switchButtonTwoLineTextView2;
        this.E = nestedScrollView;
        this.F = switchButtonTwoLineTextView3;
        this.G = rightArrowTwoLineTextView3;
    }
}
