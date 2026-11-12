package defpackage;

import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager.widget.ViewPager;
import com.xiaomi.fitness.nfc.widget.ScrollingTabContainer;

/* JADX INFO: loaded from: classes9.dex */
public abstract class zpg extends ViewDataBinding {
    public final ScrollingTabContainer A;
    public final ViewPager B;

    public zpg(Object obj, View view, int i, ScrollingTabContainer scrollingTabContainer, ViewPager viewPager) {
        super(obj, view, i);
        this.A = scrollingTabContainer;
        this.B = viewPager;
    }
}
