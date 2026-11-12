package defpackage;

import android.view.View;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.device.manager.export.bean.TabContentSwitchItem;
import com.xiaomi.fitness.widget.SwitchButtonBindingTwoLineTextView;

/* JADX INFO: loaded from: classes8.dex */
public abstract class f86 extends ViewDataBinding {
    public final SwitchButtonBindingTwoLineTextView A;
    public TabContentSwitchItem B;

    public f86(Object obj, View view, int i, SwitchButtonBindingTwoLineTextView switchButtonBindingTwoLineTextView) {
        super(obj, view, i);
        this.A = switchButtonBindingTwoLineTextView;
    }
}
