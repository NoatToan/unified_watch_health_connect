package com.huami.treadmill.ui.kings;

import android.content.Context;
import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.viewpager.widget.ViewPager;
import com.huami.treadmill.R;
import com.huami.treadmill.ui.kings.KingsTdActivity$initViewPager$1;
import com.huami.treadmill.util.DensityUtils;
import java.util.List;
import kotlin.Metadata;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.CommonNavigatorAdapter;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.IPagerIndicator;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.IPagerTitleView;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.indicators.LinePagerIndicator;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.titles.ColorTransitionPagerTitleView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016J\u0012\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u000b"}, d2 = {"com/huami/treadmill/ui/kings/KingsTdActivity$initViewPager$1", "Lnet/lucode/hackware/magicindicator/buildins/commonnavigator/abs/CommonNavigatorAdapter;", "Landroid/content/Context;", "p0", "", "index", "Lnet/lucode/hackware/magicindicator/buildins/commonnavigator/abs/IPagerTitleView;", "getTitleView", "getCount", "Lnet/lucode/hackware/magicindicator/buildins/commonnavigator/abs/IPagerIndicator;", "getIndicator", "treadmill_release"}, k = 1, mv = {1, 5, 1})
public final class KingsTdActivity$initViewPager$1 extends CommonNavigatorAdapter {
    public final /* synthetic */ KingsTdActivity b;
    public final /* synthetic */ List<String> c;

    public KingsTdActivity$initViewPager$1(KingsTdActivity kingsTdActivity, List<String> list) {
        this.b = kingsTdActivity;
        this.c = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(KingsTdActivity kingsTdActivity, int i, View view) {
        ((ViewPager) kingsTdActivity.findViewById(R.id.view_pager)).setCurrentItem(i);
    }

    @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.CommonNavigatorAdapter
    public int getCount() {
        return this.c.size();
    }

    @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.CommonNavigatorAdapter
    @NotNull
    public IPagerIndicator getIndicator(@Nullable Context p0) {
        LinePagerIndicator linePagerIndicator = new LinePagerIndicator(this.b);
        linePagerIndicator.setMode(2);
        linePagerIndicator.setColors(Integer.valueOf(ContextCompat.getColor(this.b, R.color.cl_ff5353)));
        DensityUtils densityUtils = DensityUtils.INSTANCE;
        linePagerIndicator.setLineWidth(densityUtils.dip2px(this.b, 25.0f));
        linePagerIndicator.setLineHeight(densityUtils.dip2px(this.b, 2.0f));
        return linePagerIndicator;
    }

    @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.CommonNavigatorAdapter
    @NotNull
    public IPagerTitleView getTitleView(@Nullable Context p0, final int index) {
        ColorTransitionPagerTitleView colorTransitionPagerTitleView = new ColorTransitionPagerTitleView(this.b);
        colorTransitionPagerTitleView.setNormalColor(ContextCompat.getColor(this.b, R.color.cl_8d8d8d));
        colorTransitionPagerTitleView.setSelectedColor(ContextCompat.getColor(this.b, R.color.cl_333333));
        colorTransitionPagerTitleView.setText(this.c.get(index));
        final KingsTdActivity kingsTdActivity = this.b;
        colorTransitionPagerTitleView.setOnClickListener(new View.OnClickListener() { // from class: el4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                KingsTdActivity$initViewPager$1.b(kingsTdActivity, index, view);
            }
        });
        return colorTransitionPagerTitleView;
    }
}
