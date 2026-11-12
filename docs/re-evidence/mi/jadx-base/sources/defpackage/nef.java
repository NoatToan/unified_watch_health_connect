package defpackage;

import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.xiaomi.fitness.medal.MedalBannerIndicator;
import com.xiaomi.fitness.medal.medallist.FixDragLayout;
import com.xiaomi.fitness.medal.medallist.MedalViewModel;

/* JADX INFO: loaded from: classes9.dex */
public abstract class nef extends ViewDataBinding {
    public final FixDragLayout A;
    public final MedalBannerIndicator B;
    public final ViewPager2 C;
    public final RecyclerView D;
    public MedalViewModel E;

    public nef(Object obj, View view, int i, FixDragLayout fixDragLayout, MedalBannerIndicator medalBannerIndicator, ViewPager2 viewPager2, RecyclerView recyclerView) {
        super(obj, view, i);
        this.A = fixDragLayout;
        this.B = medalBannerIndicator;
        this.C = viewPager2;
        this.D = recyclerView;
    }
}
