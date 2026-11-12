package com.huami.hmchartui.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.IdRes;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.huami.chart.data.ChartDataList;
import com.huami.chart.util.Index;
import com.huami.hmchartui.R;
import com.huami.hmchartui.convert.DayChartDataConverter;
import com.huami.hmchartui.convert.MonthChartDataConverter;
import com.huami.hmchartui.convert.WeekChartDataConverter;
import com.huami.hmchartui.convert.YearChartDataConverter;
import com.huami.hmchartui.model.BarChartData;
import com.huami.hmchartui.model.ChartConfig;
import com.huami.hmchartui.model.ConvertChartData;
import com.huami.hmchartui.ui.CommonChartFragment;
import com.huami.hmchartui.utils.ChartHelper;
import com.huami.hmchartui.utils.CommonTimeUtils;
import com.huami.hmchartui.utils.Constant;
import com.huami.passport.Configs;
import com.huami.tools.log.HMLog;
import com.huami.view.basetitle.BaseTitleActivity;
import com.huami.widget.typeface.TypefaceTextView;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b&\u0018\u00002\u00020\u0001:\u0001+B\u0007¢\u0006\u0004\b)\u0010*J\u001e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002J\b\u0010\t\u001a\u00020\u0002H&J\b\u0010\u000b\u001a\u00020\nH&J\b\u0010\r\u001a\u00020\fH&J\u0018\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0002H&J\u0018\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0002H&J\u0010\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0005H\u0016J\b\u0010\u0019\u001a\u00020\u0002H\u0007J\u0014\u0010\u001a\u001a\u00020\u00172\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004J\u001c\u0010\u001c\u001a\u00020\u00172\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0016\u001a\u00020\u001bJ\u001a\u0010\u001d\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000f\u001a\u00020\u000eH\u0016R\u001d\u0010\"\u001a\u00020\u001e8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b \u0010!R$\u0010(\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'¨\u0006,"}, d2 = {"Lcom/huami/hmchartui/ui/CommonChartFragment;", "Landroidx/fragment/app/Fragment;", "", "timeType", "", "Lcom/huami/hmchartui/model/ConvertChartData;", "list", "Lcom/huami/hmchartui/model/BarChartData;", "a", "getTimeType", "", "getTime", "Lcom/huami/hmchartui/model/ChartConfig;", "getChartConfig", "", "isTouchValue", "size", "", "getUnitString", "value", "", "getValueString", "data", "", "touchBarDown", "getOtherFragmentContainer", "refreshChart", "Lcom/huami/chart/data/ChartDataList;", "refreshBarChart", "setViewData", "Lcom/huami/hmchartui/ui/CommonChartFragment$ViewSlideWrapper;", "Lkotlin/Lazy;", "b", "()Lcom/huami/hmchartui/ui/CommonChartFragment$ViewSlideWrapper;", "slideHelper", "Lcom/huami/hmchartui/model/ConvertChartData;", "getTotalValue", "()Lcom/huami/hmchartui/model/ConvertChartData;", "setTotalValue", "(Lcom/huami/hmchartui/model/ConvertChartData;)V", "totalValue", "<init>", "()V", "ViewSlideWrapper", "hmchartui_release"}, k = 1, mv = {1, 5, 1})
public abstract class CommonChartFragment extends Fragment {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy slideHelper;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private ConvertChartData totalValue;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/chart/util/Index;", "index", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<Index, Unit> {
        public final /* synthetic */ List<ConvertChartData> a;
        public final /* synthetic */ CommonChartFragment b;

        /* JADX INFO: renamed from: com.huami.hmchartui.ui.CommonChartFragment$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0448a extends Lambda implements Function0<String> {
            public final /* synthetic */ Index a;
            public final /* synthetic */ ConvertChartData b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0448a(Index index, ConvertChartData convertChartData) {
                super(0);
                this.a = index;
                this.b = convertChartData;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "index=" + this.a + " " + this.b;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(List<ConvertChartData> list, CommonChartFragment commonChartFragment) {
            super(1);
            this.a = list;
            this.b = commonChartFragment;
        }

        public final void a(@NotNull Index index) {
            ConvertChartData convertChartData = (ConvertChartData) CollectionsKt.getOrNull(this.a, index.getDataIndex());
            if (convertChartData == null) {
                return;
            }
            CommonChartFragment commonChartFragment = this.b;
            commonChartFragment.setViewData(convertChartData, true);
            commonChartFragment.touchBarDown(convertChartData);
            HMLog.info("CommonChartFragment", new C0448a(index, convertChartData));
            commonChartFragment.b().slide(index.getCenterX());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Index index) {
            a(index);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<Unit> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            CommonChartFragment commonChartFragment = CommonChartFragment.this;
            commonChartFragment.setViewData(commonChartFragment.getTotalValue(), false);
            CommonChartFragment.this.b().reset();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<Unit> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/chart/util/Index;", "index", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function1<Index, Unit> {
        public final /* synthetic */ List<ConvertChartData> a;
        public final /* synthetic */ CommonChartFragment b;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ Index a;
            public final /* synthetic */ ConvertChartData b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Index index, ConvertChartData convertChartData) {
                super(0);
                this.a = index;
                this.b = convertChartData;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "index=" + this.a + " " + this.b;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(List<ConvertChartData> list, CommonChartFragment commonChartFragment) {
            super(1);
            this.a = list;
            this.b = commonChartFragment;
        }

        public final void a(@NotNull Index index) {
            ConvertChartData convertChartData = (ConvertChartData) CollectionsKt.getOrNull(this.a, index.getDataIndex());
            if (convertChartData == null) {
                return;
            }
            CommonChartFragment commonChartFragment = this.b;
            commonChartFragment.setViewData(convertChartData, true);
            commonChartFragment.touchBarDown(convertChartData);
            HMLog.info("CommonChartFragment", new a(index, convertChartData));
            commonChartFragment.b().slide(index.getCenterX());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Index index) {
            a(index);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<Unit> {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            CommonChartFragment commonChartFragment = CommonChartFragment.this;
            commonChartFragment.setViewData(commonChartFragment.getTotalValue(), false);
            CommonChartFragment.this.b().reset();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<Unit> {
        public static final f a = new f();

        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/hmchartui/ui/CommonChartFragment$ViewSlideWrapper;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<ViewSlideWrapper> {
        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ViewSlideWrapper invoke() {
            float fDp2px = BaseTitleActivity.dp2px(CommonChartFragment.this.requireContext(), 5.0f);
            View view = CommonChartFragment.this.getView();
            float left = ((ConstraintLayout) (view == null ? null : view.findViewById(R.id.layout_chart_root))).getLeft() + fDp2px;
            View view2 = CommonChartFragment.this.getView();
            float right = ((ConstraintLayout) (view2 == null ? null : view2.findViewById(R.id.layout_chart_root))).getRight() - fDp2px;
            View view3 = CommonChartFragment.this.getView();
            return new ViewSlideWrapper(view3 != null ? view3.findViewById(R.id.layout_chart_data) : null, left, right);
        }
    }

    public CommonChartFragment() {
        super(R.layout.fragment_common_chart);
        this.slideHelper = LazyKt__LazyJVMKt.lazy(new g());
    }

    private final BarChartData a(int timeType, List<ConvertChartData> list) {
        switch (timeType) {
            case 17:
                return new WeekChartDataConverter().convertChartData(list);
            case 18:
                return new MonthChartDataConverter(requireContext()).convertChartData(list);
            case 19:
                return new YearChartDataConverter().convertChartData(list);
            default:
                return new DayChartDataConverter(requireContext()).convertChartData(list);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ViewSlideWrapper b() {
        return (ViewSlideWrapper) this.slideHelper.getValue();
    }

    public void _$_clearFindViewByIdCache() {
    }

    @NotNull
    public abstract ChartConfig getChartConfig();

    @IdRes
    public final int getOtherFragmentContainer() {
        return R.id.chart_other;
    }

    public abstract long getTime();

    public abstract int getTimeType();

    @Nullable
    public final ConvertChartData getTotalValue() {
        return this.totalValue;
    }

    @NotNull
    public abstract CharSequence getUnitString(boolean isTouchValue, int size);

    @NotNull
    public abstract String getValueString(boolean isTouchValue, int value);

    public final void refreshBarChart(@NotNull List<ConvertChartData> list, @NotNull ChartDataList data) {
        View view = getView();
        new ChartHelper(requireContext()).refreshBarChart((FrameLayout) (view == null ? null : view.findViewById(R.id.chart_container)), data, getChartConfig(), new a(list, this), new b(), c.a);
        setViewData(this.totalValue, false);
    }

    public final void refreshChart(@NotNull List<ConvertChartData> list) {
        View view = getView();
        new ChartHelper(requireContext()).refreshBarChart((FrameLayout) (view == null ? null : view.findViewById(R.id.chart_container)), a(getTimeType(), list), getChartConfig(), new d(list, this), new e(), f.a);
        setViewData(this.totalValue, false);
    }

    public final void setTotalValue(@Nullable ConvertChartData convertChartData) {
        this.totalValue = convertChartData;
    }

    public void setViewData(@Nullable ConvertChartData data, boolean isTouchValue) {
        if (data == null) {
            return;
        }
        View view = getView();
        ((ConstraintLayout) (view == null ? null : view.findViewById(R.id.layout_chart_data))).setBackgroundResource(isTouchValue ? R.drawable.commom_bg_chart_data : 0);
        Bundle arguments = getArguments();
        Integer numValueOf = arguments == null ? null : Integer.valueOf(arguments.getInt(Constant.KEY_TIME_TYPE));
        if (numValueOf != null && numValueOf.intValue() == 16) {
            View view2 = getView();
            ((TypefaceTextView) (view2 == null ? null : view2.findViewById(R.id.label_average))).setText(getString(R.string.common_total));
            int i = isTouchValue ? 20 : 16;
            View view3 = getView();
            ((TypefaceTextView) (view3 == null ? null : view3.findViewById(R.id.text_time))).setText(CommonTimeUtils.INSTANCE.getTimeToUi(requireContext(), data.getTime(), i));
        } else if (numValueOf != null && numValueOf.intValue() == 17) {
            if (isTouchValue) {
                View view4 = getView();
                ((TypefaceTextView) (view4 == null ? null : view4.findViewById(R.id.label_average))).setText(getString(R.string.common_total));
                View view5 = getView();
                ((TypefaceTextView) (view5 == null ? null : view5.findViewById(R.id.text_time))).setText(CommonTimeUtils.INSTANCE.getTimeToUi(requireContext(), data.getTime(), 16));
            } else {
                View view6 = getView();
                ((TypefaceTextView) (view6 == null ? null : view6.findViewById(R.id.label_average))).setText(getString(R.string.common_average));
                View view7 = getView();
                ((TypefaceTextView) (view7 == null ? null : view7.findViewById(R.id.text_time))).setText(CommonTimeUtils.INSTANCE.getTimeToUi(requireContext(), data.getTime(), 17));
            }
        } else if (numValueOf != null && numValueOf.intValue() == 18) {
            if (isTouchValue) {
                View view8 = getView();
                ((TypefaceTextView) (view8 == null ? null : view8.findViewById(R.id.label_average))).setText(getString(R.string.common_total));
                View view9 = getView();
                ((TypefaceTextView) (view9 == null ? null : view9.findViewById(R.id.text_time))).setText(CommonTimeUtils.INSTANCE.getTimeToUi(requireContext(), data.getTime(), 16));
            } else {
                View view10 = getView();
                ((TypefaceTextView) (view10 == null ? null : view10.findViewById(R.id.label_average))).setText(getString(R.string.common_average));
                View view11 = getView();
                ((TypefaceTextView) (view11 == null ? null : view11.findViewById(R.id.text_time))).setText(CommonTimeUtils.INSTANCE.getTimeToUi(requireContext(), data.getTime(), 18));
            }
        } else if (numValueOf != null && numValueOf.intValue() == 19) {
            if (isTouchValue) {
                View view12 = getView();
                ((TypefaceTextView) (view12 == null ? null : view12.findViewById(R.id.label_average))).setText(getString(R.string.common_total));
                View view13 = getView();
                ((TypefaceTextView) (view13 == null ? null : view13.findViewById(R.id.text_time))).setText(CommonTimeUtils.INSTANCE.getTimeToUi(requireContext(), data.getTime(), 18));
            } else {
                View view14 = getView();
                ((TypefaceTextView) (view14 == null ? null : view14.findViewById(R.id.label_average))).setText(getString(R.string.common_average));
                View view15 = getView();
                ((TypefaceTextView) (view15 == null ? null : view15.findViewById(R.id.text_time))).setText(CommonTimeUtils.INSTANCE.getTimeToUi(requireContext(), data.getTime(), 19));
            }
        }
        if (data.getValue() == 0) {
            View view16 = getView();
            ((TypefaceTextView) (view16 == null ? null : view16.findViewById(R.id.text_value))).setText(getString(R.string.common_empty_data));
            View view17 = getView();
            ((TypefaceTextView) (view17 == null ? null : view17.findViewById(R.id.text_unit))).setVisibility(4);
            View view18 = getView();
            ((TypefaceTextView) (view18 != null ? view18.findViewById(R.id.label_average) : null)).setVisibility(4);
            return;
        }
        View view19 = getView();
        ((TypefaceTextView) (view19 == null ? null : view19.findViewById(R.id.text_unit))).setVisibility(0);
        View view20 = getView();
        ((TypefaceTextView) (view20 == null ? null : view20.findViewById(R.id.label_average))).setVisibility(0);
        View view21 = getView();
        ((TypefaceTextView) (view21 == null ? null : view21.findViewById(R.id.text_value))).setText(getValueString(isTouchValue, data.getValue()));
        View view22 = getView();
        ((TypefaceTextView) (view22 != null ? view22.findViewById(R.id.text_unit) : null)).setText(getUnitString(isTouchValue, data.getValue()));
    }

    public void touchBarDown(@NotNull ConvertChartData data) {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0004R\u0016\u0010\n\u001a\u00020\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\r\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u000f\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u0012"}, d2 = {"Lcom/huami/hmchartui/ui/CommonChartFragment$ViewSlideWrapper;", "", "", "centerX", "", "slide", Configs.Params.RESET, "Landroid/view/View;", "a", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "b", "F", "leftBoundaryX", "c", "rightBoundaryX", "<init>", "(Landroid/view/View;FF)V", "hmchartui_release"}, k = 1, mv = {1, 5, 1})
    public static final class ViewSlideWrapper {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final View view;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final float leftBoundaryX;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final float rightBoundaryX;

        public ViewSlideWrapper(@NotNull View view, float f, float f2) {
            this.view = view;
            this.leftBoundaryX = f;
            this.rightBoundaryX = f2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(ViewSlideWrapper viewSlideWrapper) {
            viewSlideWrapper.view.setTranslationX(0.0f);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void d(ViewSlideWrapper viewSlideWrapper, float f) {
            float left = f - ((viewSlideWrapper.view.getLeft() + viewSlideWrapper.view.getRight()) / 2.0f);
            if (viewSlideWrapper.view.getLeft() + left < viewSlideWrapper.leftBoundaryX) {
                left -= (viewSlideWrapper.view.getLeft() + left) - viewSlideWrapper.leftBoundaryX;
            }
            if (viewSlideWrapper.view.getRight() + left > viewSlideWrapper.rightBoundaryX) {
                left -= (viewSlideWrapper.view.getRight() + left) - viewSlideWrapper.rightBoundaryX;
            }
            viewSlideWrapper.view.setTranslationX(left);
        }

        public final void reset() {
            this.view.post(new Runnable() { // from class: cx0
                @Override // java.lang.Runnable
                public final void run() {
                    CommonChartFragment.ViewSlideWrapper.c(this.a);
                }
            });
        }

        public final void slide(final float centerX) {
            this.view.post(new Runnable() { // from class: dx0
                @Override // java.lang.Runnable
                public final void run() {
                    CommonChartFragment.ViewSlideWrapper.d(this.a, centerX);
                }
            });
        }

        public /* synthetic */ ViewSlideWrapper(View view, float f, float f2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(view, (i & 2) != 0 ? 0.0f : f, (i & 4) != 0 ? view.getResources().getDisplayMetrics().widthPixels : f2);
        }
    }
}
