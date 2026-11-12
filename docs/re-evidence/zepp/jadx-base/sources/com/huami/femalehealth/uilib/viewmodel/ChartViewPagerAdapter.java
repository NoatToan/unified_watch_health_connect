package com.huami.femalehealth.uilib.viewmodel;

import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.github.mikephil.charting.charts.BarChart;
import com.huami.femalehealth.logiclib.dto.SymptomType;
import com.huami.femalehealth.logiclib.vo.SymptomVo;
import com.huami.femalehealth.uilib.helper.ChartHelper;
import com.huami.femalehealth.uilib.widget.chart.FHBarChart;
import com.huami.moving.ui.utils.SportAnalytics;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001f\u0010 J \u0010\b\u001a\u00020\u00072\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0002J\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\u0018\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u000fH\u0016J \u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0010\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000bH\u0016R*\u0010\u0019\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\"\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u001b0\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006!"}, d2 = {"Lcom/huami/femalehealth/uilib/viewmodel/ChartViewPagerAdapter;", "Landroidx/viewpager/widget/PagerAdapter;", "", "Lcom/huami/femalehealth/logiclib/dto/SymptomType;", "", "Lcom/huami/femalehealth/logiclib/vo/SymptomVo;", SportAnalytics.ParamValue.MapButtonType.MAP, "", "setData", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "", "object", "", "isViewFromObject", "", "getCount", "Landroid/view/ViewGroup;", "container", "position", "instantiateItem", "destroyItem", "getItemPosition", "a", "Ljava/util/Map;", "symptomsMap", "Ljava/util/HashMap;", "Lcom/github/mikephil/charting/charts/BarChart;", "b", "Ljava/util/HashMap;", "holder", "<init>", "()V", "uilib_release"}, k = 1, mv = {1, 5, 1})
public final class ChartViewPagerAdapter extends PagerAdapter {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private Map<SymptomType, ? extends List<SymptomVo>> symptomsMap = new EnumMap(SymptomType.class);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private HashMap<Integer, BarChart> holder = new HashMap<>();

    @Override // androidx.viewpager.widget.PagerAdapter
    public void destroyItem(@NotNull ViewGroup container, int position, @NotNull Object object) {
        this.holder.remove(Integer.valueOf(position));
        container.removeView((View) object);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    /* JADX INFO: renamed from: getCount */
    public int getPagerCount() {
        return SymptomType.values().length;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getItemPosition(@NotNull Object object) {
        return -2;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    @NotNull
    public Object instantiateItem(@NotNull ViewGroup container, int position) {
        FHBarChart fHBarChart = new FHBarChart(container.getContext(), null, 0, 6, null);
        this.holder.put(Integer.valueOf(position), fHBarChart);
        SymptomType symptomTypeOf = SymptomType.INSTANCE.of(position);
        Map<SymptomType, ? extends List<SymptomVo>> map = this.symptomsMap;
        if (map != null && map.get(symptomTypeOf) != null) {
            ChartHelper chartHelper = ChartHelper.INSTANCE;
            chartHelper.scaleHorizontally(fHBarChart, ChartHelper.initFemaleHealthSymptomChart$default(chartHelper, fHBarChart, symptomTypeOf, (List) MapsKt.getValue(this.symptomsMap, symptomTypeOf), false, 8, null), true);
            fHBarChart.animateY(500);
        }
        container.addView(fHBarChart, new ViewGroup.LayoutParams(-1, -1));
        return fHBarChart;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public boolean isViewFromObject(@NotNull View view, @NotNull Object object) {
        return Intrinsics.areEqual(view, object);
    }

    public final void setData(@NotNull Map<SymptomType, ? extends List<SymptomVo>> map) {
        this.symptomsMap = map;
        Iterator<T> it2 = this.holder.entrySet().iterator();
        while (it2.hasNext()) {
            ChartHelper.INSTANCE.resetChart((BarChart) ((Map.Entry) it2.next()).getValue());
        }
        notifyDataSetChanged();
    }
}
