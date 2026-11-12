package defpackage;

import android.view.View;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.device.manager.export.bean.TabContentItem;
import com.xiaomi.fitness.widget.RightArrowBindingTwoLineTextView;

/* JADX INFO: loaded from: classes8.dex */
public abstract class p76 extends ViewDataBinding {
    public final RightArrowBindingTwoLineTextView A;
    public TabContentItem B;

    public p76(Object obj, View view, int i, RightArrowBindingTwoLineTextView rightArrowBindingTwoLineTextView) {
        super(obj, view, i);
        this.A = rightArrowBindingTwoLineTextView;
    }
}
