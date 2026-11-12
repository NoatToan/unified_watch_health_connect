package defpackage;

import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager.widget.ViewPager;
import com.xiaomi.fitness.device.manager.ui.tab.DeviceTabParentViewModel;
import com.xiaomi.fitness.widget.view.HomeHeaderTabTitleView;

/* JADX INFO: loaded from: classes8.dex */
public abstract class j56 extends ViewDataBinding {
    public final HomeHeaderTabTitleView A;
    public final ViewPager B;
    public DeviceTabParentViewModel C;

    public j56(Object obj, View view, int i, HomeHeaderTabTitleView homeHeaderTabTitleView, ViewPager viewPager) {
        super(obj, view, i);
        this.A = homeHeaderTabTitleView;
        this.B = viewPager;
    }
}
