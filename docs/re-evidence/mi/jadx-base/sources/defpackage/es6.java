package defpackage;

import android.view.View;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.device.manager.export.bean.TabContentItem;
import com.xiaomi.fitness.widget.RightArrowBindingSingleLineTextView;

/* JADX INFO: loaded from: classes8.dex */
public abstract class es6 extends ViewDataBinding {
    public final RightArrowBindingSingleLineTextView A;
    public TabContentItem B;

    public es6(Object obj, View view, int i, RightArrowBindingSingleLineTextView rightArrowBindingSingleLineTextView) {
        super(obj, view, i);
        this.A = rightArrowBindingSingleLineTextView;
    }
}
