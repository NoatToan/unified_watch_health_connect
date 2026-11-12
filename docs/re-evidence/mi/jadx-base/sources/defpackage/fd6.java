package defpackage;

import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;

/* JADX INFO: loaded from: classes8.dex */
public abstract class fd6 extends ViewDataBinding {
    public final TabLayout A;
    public final ViewPager2 B;

    public fd6(Object obj, View view, int i, TabLayout tabLayout, ViewPager2 viewPager2) {
        super(obj, view, i);
        this.A = tabLayout;
        this.B = viewPager2;
    }
}
