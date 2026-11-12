package com.huami.femalehealth.uilib.adapter;

import android.content.Context;
import android.view.View;
import com.huami.femalehealth.logiclib.dto.SymptomType;
import com.huami.femalehealth.uilib.R;
import com.huami.femalehealth.uilib.adapter.HistoryCardNavAdapter;
import com.huami.femalehealth.uilib.helper.ChartHelper;
import com.huami.femalehealth.uilib.helper.ResourceHelper;
import com.huami.femalehealth.uilib.widget.ExtKt;
import com.huami.tools.analytics.DbUtils;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.CommonNavigatorAdapter;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.IPagerIndicator;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.IPagerTitleView;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.indicators.LinePagerIndicator;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.titles.ClipPagerTitleView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001BA\u00128\u0010\u0015\u001a4\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u0012\u0018\u00010\r¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016J\u0012\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016RH\u0010\u0015\u001a4\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u0012\u0018\u00010\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Lcom/huami/femalehealth/uilib/adapter/HistoryCardNavAdapter;", "Lnet/lucode/hackware/magicindicator/buildins/commonnavigator/abs/CommonNavigatorAdapter;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "index", "Lnet/lucode/hackware/magicindicator/buildins/commonnavigator/abs/IPagerTitleView;", "getTitleView", "getCount", "Lnet/lucode/hackware/magicindicator/buildins/commonnavigator/abs/IPagerIndicator;", "getIndicator", "", "getTitleWeight", "Lkotlin/Function2;", "Landroid/view/View;", "Lkotlin/ParameterName;", "name", "v", "", "b", "Lkotlin/jvm/functions/Function2;", "titleClickListener", "<init>", "(Lkotlin/jvm/functions/Function2;)V", "uilib_release"}, k = 1, mv = {1, 5, 1})
public final class HistoryCardNavAdapter extends CommonNavigatorAdapter {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private final Function2<View, Integer, Unit> titleClickListener;

    /* JADX WARN: Multi-variable type inference failed */
    public HistoryCardNavAdapter(@Nullable Function2<? super View, ? super Integer, Unit> function2) {
        this.titleClickListener = function2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(HistoryCardNavAdapter historyCardNavAdapter, int i, View view) {
        Function2<View, Integer, Unit> function2 = historyCardNavAdapter.titleClickListener;
        if (function2 == null) {
            return;
        }
        function2.invoke(view, Integer.valueOf(i));
    }

    @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.CommonNavigatorAdapter
    public int getCount() {
        return SymptomType.values().length;
    }

    @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.CommonNavigatorAdapter
    @NotNull
    public IPagerIndicator getIndicator(@Nullable Context context) {
        LinePagerIndicator linePagerIndicator = new LinePagerIndicator(context);
        float f = 2;
        float dimen = ResourceHelper.INSTANCE.getDimen(R.dimen.fh_chart_title_height) - (f * 0.0f);
        linePagerIndicator.setLineHeight(dimen);
        linePagerIndicator.setRoundRadius(dimen / f);
        linePagerIndicator.setYOffset(0.0f);
        linePagerIndicator.setMode(0);
        Integer[] numArr = new Integer[1];
        numArr[0] = context == null ? null : Integer.valueOf(ExtKt.getResColor(context, R.color.fh_history_tab_color));
        linePagerIndicator.setColors(numArr);
        return linePagerIndicator;
    }

    @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.CommonNavigatorAdapter
    @NotNull
    public IPagerTitleView getTitleView(@Nullable Context context, final int index) {
        ClipPagerTitleView clipPagerTitleView = new ClipPagerTitleView(context);
        clipPagerTitleView.setText(ChartHelper.INSTANCE.getSymptomName(SymptomType.INSTANCE.of(index)));
        clipPagerTitleView.setTextSize(ResourceHelper.INSTANCE.dp2px(12.0f));
        clipPagerTitleView.setTextColor(ExtKt.getResColor(context, R.color.s2));
        clipPagerTitleView.setClipColor(-1);
        clipPagerTitleView.setOnClickListener(new View.OnClickListener() { // from class: r04
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HistoryCardNavAdapter.b(this.a, index, view);
            }
        });
        return clipPagerTitleView;
    }

    @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.CommonNavigatorAdapter
    public float getTitleWeight(@Nullable Context context, int index) {
        return 1.0f;
    }
}
