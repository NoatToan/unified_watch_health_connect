package com.huami.training.ui.course;

import android.content.Context;
import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.viewpager.widget.ViewPager;
import com.huami.training.ext.ViewExKt;
import com.huami.training.ui.R;
import com.huami.training.ui.course.TrainingFilterListActivity$initMagicIndicator$1$1;
import com.huami.training.vo.FilterModeVo;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.m;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.CommonNavigator;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.CommonNavigatorAdapter;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.IPagerIndicator;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.IPagerTitleView;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.indicators.LinePagerIndicator;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.titles.SimplePagerTitleView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016J\u0014\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u000b"}, d2 = {"com/huami/training/ui/course/TrainingFilterListActivity$initMagicIndicator$1$1", "Lnet/lucode/hackware/magicindicator/buildins/commonnavigator/abs/CommonNavigatorAdapter;", "Landroid/content/Context;", "p0", "", "position", "Lnet/lucode/hackware/magicindicator/buildins/commonnavigator/abs/IPagerTitleView;", "getTitleView", "getCount", "Lnet/lucode/hackware/magicindicator/buildins/commonnavigator/abs/IPagerIndicator;", "getIndicator", "ui_release"}, k = 1, mv = {1, 5, 1})
public final class TrainingFilterListActivity$initMagicIndicator$1$1 extends CommonNavigatorAdapter {
    public final /* synthetic */ CommonNavigator b;
    public final /* synthetic */ TrainingFilterListActivity c;
    public final /* synthetic */ Ref.ObjectRef<String> d;
    public final /* synthetic */ Ref.ObjectRef<String> e;
    public final /* synthetic */ Ref.BooleanRef f;

    public TrainingFilterListActivity$initMagicIndicator$1$1(CommonNavigator commonNavigator, TrainingFilterListActivity trainingFilterListActivity, Ref.ObjectRef<String> objectRef, Ref.ObjectRef<String> objectRef2, Ref.BooleanRef booleanRef) {
        this.b = commonNavigator;
        this.c = trainingFilterListActivity;
        this.d = objectRef;
        this.e = objectRef2;
        this.f = booleanRef;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:27:0x007e  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(FilterModeVo filterModeVo, Ref.BooleanRef booleanRef, Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2, SimplePagerTitleView simplePagerTitleView, Ref.IntRef intRef, Ref.ObjectRef objectRef3, Ref.ObjectRef objectRef4, TrainingFilterListActivity trainingFilterListActivity, int i, Ref.IntRef intRef2, View view) {
        String defaultOrder = filterModeVo.getDefaultOrder();
        if (defaultOrder == null || m.isBlank(defaultOrder)) {
            booleanRef.element = false;
            objectRef.element = objectRef3.element;
            trainingFilterListActivity.refreshSelectedPage(i, (String) objectRef2.element);
        } else {
            List<String> supportOrders = filterModeVo.getSupportOrders();
            if (supportOrders == null || supportOrders.isEmpty()) {
                booleanRef.element = false;
                objectRef.element = objectRef3.element;
                trainingFilterListActivity.refreshSelectedPage(i, (String) objectRef2.element);
            } else {
                booleanRef.element = true;
                if (Intrinsics.areEqual(objectRef.element, objectRef2.element) && booleanRef.element) {
                    simplePagerTitleView.setCompoundDrawablesWithIntrinsicBounds(0, 0, intRef.element, 0);
                    simplePagerTitleView.setCompoundDrawablePadding((int) ViewExKt.dpToPx(simplePagerTitleView, 3.0f));
                    objectRef3.element = objectRef2.element;
                    objectRef.element = objectRef4.element;
                    trainingFilterListActivity.refreshSelectedPage(i, (String) objectRef2.element);
                } else if (booleanRef.element) {
                    simplePagerTitleView.setCompoundDrawablesWithIntrinsicBounds(0, 0, intRef2.element, 0);
                    simplePagerTitleView.setCompoundDrawablePadding((int) ViewExKt.dpToPx(simplePagerTitleView, 3.0f));
                    objectRef3.element = objectRef4.element;
                    objectRef.element = objectRef2.element;
                    trainingFilterListActivity.refreshSelectedPage(i, (String) objectRef4.element);
                } else {
                    trainingFilterListActivity.refreshSelectedPage(i, (String) objectRef3.element);
                }
            }
        }
        ((ViewPager) trainingFilterListActivity.findViewById(R.id.filter_viewpager)).setCurrentItem(i);
    }

    @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.CommonNavigatorAdapter
    public int getCount() {
        return this.c.filterModeData.size();
    }

    @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.CommonNavigatorAdapter
    @Nullable
    public IPagerIndicator getIndicator(@Nullable Context p0) {
        LinePagerIndicator linePagerIndicator = new LinePagerIndicator(this.b.getContext());
        TrainingFilterListActivity trainingFilterListActivity = this.c;
        linePagerIndicator.setLineWidth(ViewExKt.dpToPx(linePagerIndicator, 24.0f));
        linePagerIndicator.setLineHeight(ViewExKt.dpToPx(linePagerIndicator, 2.0f));
        linePagerIndicator.setRoundRadius(ViewExKt.dpToPx(linePagerIndicator, 1.4f));
        linePagerIndicator.setColors(Integer.valueOf(ContextCompat.getColor(linePagerIndicator.getContext(), trainingFilterListActivity.o().getTabSelectedIndicatorColor())));
        linePagerIndicator.setMode(2);
        return linePagerIndicator;
    }

    @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.CommonNavigatorAdapter
    @NotNull
    public IPagerTitleView getTitleView(@Nullable Context p0, final int position) {
        final SimplePagerTitleView simplePagerTitleView = new SimplePagerTitleView(this.b.getContext());
        final TrainingFilterListActivity trainingFilterListActivity = this.c;
        final Ref.ObjectRef<String> objectRef = this.d;
        final Ref.ObjectRef<String> objectRef2 = this.e;
        final Ref.BooleanRef booleanRef = this.f;
        final FilterModeVo filterModeVo = (FilterModeVo) trainingFilterListActivity.filterModeData.get(position);
        final Ref.IntRef intRef = new Ref.IntRef();
        int i = R.drawable.tr_icon_order_default;
        intRef.element = i;
        final Ref.IntRef intRef2 = new Ref.IntRef();
        intRef2.element = -1;
        final Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
        objectRef3.element = TrainingFilterListActivity.FILTER_MODE_ORDER_DESC;
        final Ref.ObjectRef objectRef4 = new Ref.ObjectRef();
        objectRef4.element = "";
        simplePagerTitleView.setNormalColor(ContextCompat.getColor(simplePagerTitleView.getContext(), R.color.s2));
        simplePagerTitleView.setSelectedColor(trainingFilterListActivity.o().getTabSelectedTextColor());
        simplePagerTitleView.setText(((FilterModeVo) trainingFilterListActivity.filterModeData.get(position)).getText());
        simplePagerTitleView.setTextSize(13.3f);
        String defaultOrder = filterModeVo.getDefaultOrder();
        if (defaultOrder == null || m.isBlank(defaultOrder)) {
            simplePagerTitleView.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        } else {
            simplePagerTitleView.setCompoundDrawablesWithIntrinsicBounds(0, 0, intRef.element, 0);
            simplePagerTitleView.setCompoundDrawablePadding((int) ViewExKt.dpToPx(simplePagerTitleView, 3.0f));
            String defaultOrder2 = filterModeVo.getDefaultOrder();
            if (Intrinsics.areEqual(defaultOrder2, TrainingFilterListActivity.FILTER_MODE_ORDER_DESC)) {
                intRef.element = R.drawable.tr_icon_order_descend;
                intRef2.element = R.drawable.tr_icon_order_ascend;
                objectRef3.element = TrainingFilterListActivity.FILTER_MODE_ORDER_DESC;
                objectRef4.element = TrainingFilterListActivity.FILTER_MODE_ORDER_ASC;
            } else if (Intrinsics.areEqual(defaultOrder2, TrainingFilterListActivity.FILTER_MODE_ORDER_ASC)) {
                intRef.element = R.drawable.tr_icon_order_ascend;
                intRef2.element = i;
                objectRef3.element = TrainingFilterListActivity.FILTER_MODE_ORDER_ASC;
                objectRef4.element = TrainingFilterListActivity.FILTER_MODE_ORDER_DESC;
            }
            objectRef.element = objectRef3.element;
            objectRef2.element = objectRef3.element;
        }
        simplePagerTitleView.setOnClickListener(new View.OnClickListener() { // from class: ev7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TrainingFilterListActivity$initMagicIndicator$1$1.b(filterModeVo, booleanRef, objectRef, objectRef3, simplePagerTitleView, intRef, objectRef2, objectRef4, trainingFilterListActivity, position, intRef2, view);
            }
        });
        return simplePagerTitleView;
    }
}
