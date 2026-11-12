package com.xiaomi.hm.health.healthdata.ui.detail.stress;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelStoreOwner;
import androidx.p012savedstate.SavedStateRegistryOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.android.design.dialog.loading.LoadingDialog;
import com.huami.chart.util.Index;
import com.huami.hmdateformat.date.HMDataFormatKt;
import com.huami.hmdateformat.date.HMPattern;
import com.huami.sleep.daysleep.sleepstagechart.vo.Resource;
import com.huami.sleep.daysleep.sleepstagechart.vo.Status;
import com.huami.sleepassistant.lib.ui.base.Navigator;
import com.huami.stress.domain.model.SingleStress;
import com.huami.watch.companion.config.Config;
import com.huami.watch.hmwatchmanager.R;
import com.huami.widget.piechart.PieChart;
import com.huami.widget.toast.CustomToast;
import com.huami.widget.typeface.TypefaceTextView;
import com.xiaomi.hm.health.adapter.BaseRecyclerAdapter;
import com.xiaomi.hm.health.adapter.MyViewHolder;
import com.xiaomi.hm.health.baseutil.TimeUtils;
import com.xiaomi.hm.health.healthdata.ext.DataExKt;
import com.xiaomi.hm.health.healthdata.ext.ViewExKt;
import com.xiaomi.hm.health.healthdata.ui.detail.stress.StressDailyFragment;
import com.xiaomi.hm.health.healthdata.ui.view.BarChartBuilder;
import com.xiaomi.hm.health.healthdata.ui.viewmodel.stress.StressDailyDetailViewModel;
import com.xiaomi.hm.health.healthdata.ui.vo.BarChartVo;
import com.xiaomi.hm.health.healthdata.ui.vo.converter.DataConverterKt;
import com.xiaomi.hm.health.healthdata.ui.vo.stress.DayStressDetailData;
import com.xiaomi.hm.health.healthdata.ui.vo.stress.StressLevelRatio;
import com.xiaomi.hm.health.healthdata.ui.vo.stress.StressStatisticsInfo;
import com.xiaomi.hm.health.healthdata.utils.ChartHelper;
import com.xiaomi.hm.health.healthdata.utils.stress.StressDataHelper;
import com.xiaomi.hm.health.healthdata.utils.stress.StressPieChartDataUtil;
import com.xiaomi.hm.health.healthtag.ui.view.DragIntervalView;
import com.xiaomi.hm.health.healthtag.ui.view.HealthTagEditCard;
import com.xiaomi.hm.health.healthtag.ui.view.SleepTagChart;
import com.xiaomi.hm.health.healthtag.ui.vo.TagInfoVo;
import com.xiaomi.hm.health.training.ui.widget.UpDownTextItem;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.androidx.viewmodel.ext.android.ComponentCallbackExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0004\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 B2\u00020\u0001:\u0002BCB\u0007¢\u0006\u0004\b@\u0010AJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0018\u0010\b\u001a\u00020\u00022\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\u0002J\"\u0010\u000e\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\tH\u0002J\u0010\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\u0010\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012H\u0002J\u0016\u0010\u0018\u001a\u00020\u00022\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0002J\b\u0010\u0019\u001a\u00020\u000bH\u0002J&\u0010!\u001a\u0004\u0018\u00010 2\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0016J\u001a\u0010#\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0016R\u001d\u0010)\u001a\u00020$8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001d\u0010.\u001a\u00020*8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010&\u001a\u0004\b,\u0010-R\u001d\u00103\u001a\u00020/8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u0010&\u001a\u0004\b1\u00102R\u0016\u00106\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0018\u0010:\u001a\u0004\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u001d\u0010?\u001a\u00020;8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b<\u0010&\u001a\u0004\b=\u0010>¨\u0006D"}, d2 = {"Lcom/xiaomi/hm/health/healthdata/ui/detail/stress/StressDailyFragment;", "Landroidx/fragment/app/Fragment;", "", "initView", "t", "Lcom/xiaomi/hm/health/healthdata/ui/view/BarChartBuilder;", "", "barChartBuilder", LogUtil.D, "", "valueStr", "", "selected", "timeStr", "l", "Lcom/xiaomi/hm/health/healthdata/ui/vo/stress/StressLevelRatio;", "levelRatio", "E", "Lcom/xiaomi/hm/health/healthdata/ui/vo/stress/StressStatisticsInfo;", "stressStatisticsInfo", "G", "", "Lcom/huami/stress/domain/model/SingleStress;", "stressList", "F", SOAP.XMLNS, "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "Lcom/xiaomi/hm/health/healthdata/ui/viewmodel/stress/StressDailyDetailViewModel;", "a", "Lkotlin/Lazy;", com.google.android.exoplayer2.text.ttml.b.r, "()Lcom/xiaomi/hm/health/healthdata/ui/viewmodel/stress/StressDailyDetailViewModel;", "viewModel", "Lcom/xiaomi/hm/health/healthdata/utils/ChartHelper;", "b", "m", "()Lcom/xiaomi/hm/health/healthdata/utils/ChartHelper;", "chartHelper", "Lcom/xiaomi/hm/health/healthdata/ui/detail/stress/StressDailyFragment$ManualStressAdapter;", "c", "o", "()Lcom/xiaomi/hm/health/healthdata/ui/detail/stress/StressDailyFragment$ManualStressAdapter;", "manualStressAdapter", GoogleApiAvailabilityLight.a, "Ljava/lang/String;", "defaultTimeStr", "", "e", "Ljava/lang/Long;", "timeStamp", "Lcom/huami/android/design/dialog/loading/LoadingDialog;", "f", GoogleApiAvailabilityLight.b, "()Lcom/huami/android/design/dialog/loading/LoadingDialog;", "mDialog", "<init>", "()V", "Companion", "ManualStressAdapter", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class StressDailyFragment extends Fragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    @NotNull
    private static final String g = "time";

    @NotNull
    private static final String h;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewModel;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy chartHelper;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy manualStressAdapter;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private String defaultTimeStr;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private Long timeStamp;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final Lazy mDialog;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0019\u0010\u0007\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0016\u0010\u000b\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\b¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/hm/health/healthdata/ui/detail/stress/StressDailyFragment$Companion;", "", "", "time", "Lcom/xiaomi/hm/health/healthdata/ui/detail/stress/StressDailyFragment;", "getInstance", "", "tag", "Ljava/lang/String;", "getTag", "()Ljava/lang/String;", "ARGS_TIME", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final StressDailyFragment getInstance(long time) {
            StressDailyFragment stressDailyFragment = new StressDailyFragment();
            Bundle bundle = new Bundle();
            bundle.putLong("time", time);
            Unit unit = Unit.INSTANCE;
            stressDailyFragment.setArguments(bundle);
            return stressDailyFragment;
        }

        @NotNull
        public final String getTag() {
            return StressDailyFragment.h;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ \u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0014J \u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0014¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/hm/health/healthdata/ui/detail/stress/StressDailyFragment$ManualStressAdapter;", "Lcom/xiaomi/hm/health/adapter/BaseRecyclerAdapter;", "Lcom/huami/stress/domain/model/SingleStress;", "Lcom/xiaomi/hm/health/adapter/MyViewHolder;", "holder", "item", "", "position", "", "onBindViewHolder", "Landroid/view/View;", "itemView", "onItemClicked", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
    public static final class ManualStressAdapter extends BaseRecyclerAdapter<SingleStress> {
        public ManualStressAdapter() {
            super(R.layout.item_manual_stress);
        }

        @Override // com.xiaomi.hm.health.adapter.BaseRecyclerAdapter
        public void onBindViewHolder(@NotNull MyViewHolder holder, @NotNull SingleStress item, int position) {
            TextView textView = (TextView) holder.getView(R.id.time);
            textView.setText(TimeUtils.formatTime(textView.getContext(), item.getTimestamp()));
            TextView textView2 = (TextView) holder.getView(R.id.value);
            textView2.setText(textView2.getContext().getString(R.string.stress_with_value, String.valueOf(item.getValue())));
        }

        @Override // com.xiaomi.hm.health.adapter.BaseRecyclerAdapter
        public void onItemClicked(@NotNull View itemView, int position, @NotNull SingleStress item) {
            SingleStressDetailActivity.INSTANCE.navigate(itemView.getContext(), item);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Status.values().length];
            iArr[Status.SUCCESS.ordinal()] = 1;
            iArr[Status.LOADING.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/healthdata/utils/ChartHelper;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<ChartHelper> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ChartHelper invoke() {
            return new ChartHelper(StressDailyFragment.this.requireContext());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n"}, d2 = {"", "fl", "fl2", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function2<Float, Float, Unit> {
        public b() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Float f, Float f2) {
            invoke(f.floatValue(), f2.floatValue());
            return Unit.INSTANCE;
        }

        public final void invoke(float f, float f2) {
            StressDailyFragment.this.p().getMDragInterval().setValue(new Pair<>(Float.valueOf(f), Float.valueOf(f2)));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/android/design/dialog/loading/LoadingDialog;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<LoadingDialog> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LoadingDialog invoke() {
            return new LoadingDialog(StressDailyFragment.this.requireContext());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/healthdata/ui/detail/stress/StressDailyFragment$ManualStressAdapter;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<ManualStressAdapter> {
        public static final d a = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ManualStressAdapter invoke() {
            return new ManualStressAdapter();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\n"}, d2 = {"Lcom/huami/chart/util/Index;", "<anonymous parameter 0>", "Lkotlin/Pair;", "", "high", "<anonymous parameter 2>", "", "date", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function4<Index, Pair<? extends Float, ? extends Float>, Pair<? extends Float, ? extends Float>, String, Unit> {
        public e() {
            super(4);
        }

        public final void a(@NotNull Index index, @Nullable Pair<Float, Float> pair, @Nullable Pair<Float, Float> pair2, @Nullable String str) {
            if (pair == null) {
                return;
            }
            StressDailyFragment.this.l(String.valueOf((int) pair.getSecond().floatValue()), true, str);
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(Index index, Pair<? extends Float, ? extends Float> pair, Pair<? extends Float, ? extends Float> pair2, String str) {
            a(index, pair, pair2, str);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<Unit> {
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
            BarChartVo<Number> value = StressDailyFragment.this.p().getLatestValueLiveData().getValue();
            if (value == null) {
                return;
            }
            StressDailyFragment stressDailyFragment = StressDailyFragment.this;
            Pair<Float, Float> highValue = DataConverterKt.toRawBarChartVo(value).getHighValue();
            Float second = highValue == null ? null : highValue.getSecond();
            stressDailyFragment.l(second == null ? stressDailyFragment.getString(R.string.value_invalid) : String.valueOf(second), false, value.getExtra());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<Unit> {
        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            StressDailyFragment stressDailyFragment = StressDailyFragment.this;
            stressDailyFragment.l(stressDailyFragment.getString(R.string.value_invalid), false, null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        h = companion.getClass().getSimpleName();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StressDailyFragment() {
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.xiaomi.hm.health.healthdata.ui.detail.stress.StressDailyFragment$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelOwner invoke() {
                ViewModelOwner.Companion companion = ViewModelOwner.INSTANCE;
                ComponentCallbacks componentCallbacks = this;
                return companion.from((ViewModelStoreOwner) componentCallbacks, componentCallbacks instanceof SavedStateRegistryOwner ? (SavedStateRegistryOwner) componentCallbacks : null);
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.viewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<StressDailyDetailViewModel>() { // from class: com.xiaomi.hm.health.healthdata.ui.detail.stress.StressDailyFragment$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.xiaomi.hm.health.healthdata.ui.viewmodel.stress.StressDailyDetailViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final StressDailyDetailViewModel invoke() {
                return ComponentCallbackExtKt.getViewModel(this, qualifier, Reflection.getOrCreateKotlinClass(StressDailyDetailViewModel.class), function0, objArr);
            }
        });
        this.chartHelper = LazyKt__LazyJVMKt.lazy(new a());
        this.manualStressAdapter = LazyKt__LazyJVMKt.lazy(d.a);
        this.defaultTimeStr = "";
        this.mDialog = LazyKt__LazyJVMKt.lazy(new c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A(StressDailyFragment stressDailyFragment, Resource resource) {
        int i = WhenMappings.$EnumSwitchMapping$0[resource.getStatus().ordinal()];
        if (i == 1) {
            stressDailyFragment.n().dismiss();
        } else if (i != 2) {
            stressDailyFragment.n().setFailed(stressDailyFragment.getString(R.string.earbud_net_error_toast));
        } else {
            stressDailyFragment.n().setMessage(stressDailyFragment.getString(R.string.loading));
            stressDailyFragment.n().show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B(StressDailyFragment stressDailyFragment, Boolean bool) {
        View view = stressDailyFragment.getView();
        ViewExKt.setVisible(view == null ? null : view.findViewById(com.xiaomi.hm.health.R.id.makeTagTv), bool.booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C(StressDailyFragment stressDailyFragment, DayStressDetailData dayStressDetailData) {
        stressDailyFragment.D(dayStressDetailData.getBarChartBuilder());
        stressDailyFragment.E(dayStressDetailData.getLevelRatio());
        stressDailyFragment.G(dayStressDetailData.getStatisticsInfo());
        stressDailyFragment.F(dayStressDetailData.getManualStressData());
    }

    private final void D(BarChartBuilder<Number> barChartBuilder) {
        if (barChartBuilder == null) {
            return;
        }
        ChartHelper chartHelperM = m();
        View view = getView();
        chartHelperM.refreshAnimationBarChart((ViewGroup) (view == null ? null : view.findViewById(com.xiaomi.hm.health.R.id.day_chart)), barChartBuilder, new e(), new f(), new g());
    }

    private final void E(StressLevelRatio levelRatio) {
        Context context = getContext();
        if (context == null) {
            return;
        }
        boolean z = levelRatio.getTotalRatio() == 0;
        View view = getView();
        ViewExKt.setVisible(view == null ? null : view.findViewById(com.xiaomi.hm.health.R.id.empty_pie), z);
        View view2 = getView();
        ViewExKt.setVisible(view2 == null ? null : view2.findViewById(com.xiaomi.hm.health.R.id.pieChart), !z);
        if (!z) {
            View view3 = getView();
            ((PieChart) (view3 == null ? null : view3.findViewById(com.xiaomi.hm.health.R.id.pieChart))).updateData(StressPieChartDataUtil.INSTANCE.getPieChartData(context, levelRatio));
        }
        View view4 = getView();
        View viewFindViewById = view4 == null ? null : view4.findViewById(com.xiaomi.hm.health.R.id.tv_stress_level_value_relax);
        StressDataHelper stressDataHelper = StressDataHelper.INSTANCE;
        ((TypefaceTextView) viewFindViewById).setText(context.getString(R.string.stress_relax_value, stressDataHelper.getDisplayValue(context, levelRatio.getRelaxRatio())));
        View view5 = getView();
        ((TypefaceTextView) (view5 == null ? null : view5.findViewById(com.xiaomi.hm.health.R.id.tv_stress_level_value_normal))).setText(context.getString(R.string.stress_normal_value, stressDataHelper.getDisplayValue(context, levelRatio.getNormalRatio())));
        View view6 = getView();
        ((TypefaceTextView) (view6 == null ? null : view6.findViewById(com.xiaomi.hm.health.R.id.tv_stress_level_value_medium))).setText(context.getString(R.string.stress_medium_value, stressDataHelper.getDisplayValue(context, levelRatio.getMediumRatio())));
        View view7 = getView();
        ((TypefaceTextView) (view7 != null ? view7.findViewById(com.xiaomi.hm.health.R.id.tv_stress_level_value_high) : null)).setText(context.getString(R.string.stress_high_value, stressDataHelper.getDisplayValue(context, levelRatio.getHighRatio())));
    }

    private final void F(List<SingleStress> stressList) {
        boolean z = !stressList.isEmpty();
        View view = getView();
        ViewExKt.setVisible(view == null ? null : view.findViewById(com.xiaomi.hm.health.R.id.card_manual_result), z);
        if (z) {
            long timestamp = ((SingleStress) CollectionsKt.first((List) stressList)).getTimestamp();
            String formatTime$default = HMDataFormatKt.getFormatTime$default(timestamp, HMDataFormatKt.adaptHMPattern(HMPattern.YEAR_ABBR_MONTH_DAY, timestamp), (Locale) null, 2, (Object) null);
            View view2 = getView();
            ((TypefaceTextView) (view2 != null ? view2.findViewById(com.xiaomi.hm.health.R.id.manual_result_date) : null)).setText(formatTime$default);
            o().update(stressList);
        }
    }

    private final void G(StressStatisticsInfo stressStatisticsInfo) {
        View view = getView();
        UpDownTextItem upDownTextItem = (UpDownTextItem) (view == null ? null : view.findViewById(com.xiaomi.hm.health.R.id.day_max));
        StressDataHelper stressDataHelper = StressDataHelper.INSTANCE;
        upDownTextItem.setUpText(stressDataHelper.getDisplayValue(upDownTextItem.getContext(), stressStatisticsInfo.getMax()));
        View view2 = getView();
        UpDownTextItem upDownTextItem2 = (UpDownTextItem) (view2 == null ? null : view2.findViewById(com.xiaomi.hm.health.R.id.day_min));
        upDownTextItem2.setUpText(stressDataHelper.getDisplayValue(upDownTextItem2.getContext(), stressStatisticsInfo.getMin()));
        View view3 = getView();
        UpDownTextItem upDownTextItem3 = (UpDownTextItem) (view3 != null ? view3.findViewById(com.xiaomi.hm.health.R.id.day_avg) : null);
        upDownTextItem3.setUpText(stressDataHelper.getDisplayValue(upDownTextItem3.getContext(), stressStatisticsInfo.getAvg()));
    }

    private final void initView() {
        View view = getView();
        RecyclerView recyclerView = (RecyclerView) (view == null ? null : view.findViewById(com.xiaomi.hm.health.R.id.rcv_manual_result));
        recyclerView.setClipToPadding(false);
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity(), 1, false));
        recyclerView.setAdapter(o());
        Context context = getContext();
        if (context != null && !Config.isUserOversea(context) && !Config.isLocaleOversea(context)) {
            View view2 = getView();
            ((ConstraintLayout) (view2 == null ? null : view2.findViewById(com.xiaomi.hm.health.R.id.stress_breathe_training_layout))).setVisibility(0);
        }
        View view3 = getView();
        ((ConstraintLayout) (view3 == null ? null : view3.findViewById(com.xiaomi.hm.health.R.id.stress_breathe_training_layout))).setOnClickListener(new View.OnClickListener() { // from class: xg7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                StressDailyFragment.q(this.a, view4);
            }
        });
        View view4 = getView();
        DragIntervalView dragIntervalView = (DragIntervalView) (view4 == null ? null : view4.findViewById(com.xiaomi.hm.health.R.id.tagDragV));
        if (dragIntervalView != null) {
            dragIntervalView.setDragCallback(new b());
        }
        View view5 = getView();
        ((SleepTagChart) (view5 == null ? null : view5.findViewById(com.xiaomi.hm.health.R.id.tagResultLayout))).setXMaxMinValue(0.0f, 1439.0f);
        View view6 = getView();
        ((TextView) (view6 == null ? null : view6.findViewById(com.xiaomi.hm.health.R.id.makeTagTv))).setOnClickListener(new View.OnClickListener() { // from class: vg7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view7) {
                StressDailyFragment.r(this.a, view7);
            }
        });
        View view7 = getView();
        HealthTagEditCard healthTagEditCard = (HealthTagEditCard) (view7 == null ? null : view7.findViewById(com.xiaomi.hm.health.R.id.tagEditCard));
        healthTagEditCard.setSelectListener(new HealthTagEditCard.EditListener() { // from class: com.xiaomi.hm.health.healthdata.ui.detail.stress.StressDailyFragment$initView$6$1
            @Override // com.xiaomi.hm.health.healthtag.ui.view.HealthTagEditCard.EditListener
            public void addNewTag(@Nullable TagInfoVo info) {
                this.a.p().addNewTag(info, this.a.timeStamp);
            }

            @Override // com.xiaomi.hm.health.healthtag.ui.view.HealthTagEditCard.EditListener
            public void closeMakeTag() {
                this.a.p().getLaggingLiveDate().setValue(Boolean.FALSE);
            }

            @Override // com.xiaomi.hm.health.healthtag.ui.view.HealthTagEditCard.EditListener
            public void manualEditTag(@Nullable TagInfoVo info) {
                this.a.p().uploadManualTag(info);
            }
        });
        healthTagEditCard.setTitle(healthTagEditCard.getResources().getString(R.string.stress_tag));
        View view8 = getView();
        ViewExKt.setVisible(view8 != null ? view8.findViewById(com.xiaomi.hm.health.R.id.jp_hint_text) : null, s());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l(String valueStr, boolean selected, String timeStr) {
        View view = getView();
        ((TypefaceTextView) (view == null ? null : view.findViewById(com.xiaomi.hm.health.R.id.value))).setText(valueStr);
        View view2 = getView();
        TypefaceTextView typefaceTextView = (TypefaceTextView) (view2 != null ? view2.findViewById(com.xiaomi.hm.health.R.id.time) : null);
        if (timeStr == null) {
            timeStr = this.defaultTimeStr;
        }
        typefaceTextView.setText(timeStr);
    }

    private final ChartHelper m() {
        return (ChartHelper) this.chartHelper.getValue();
    }

    private final LoadingDialog n() {
        return (LoadingDialog) this.mDialog.getValue();
    }

    private final ManualStressAdapter o() {
        return (ManualStressAdapter) this.manualStressAdapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final StressDailyDetailViewModel p() {
        return (StressDailyDetailViewModel) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(StressDailyFragment stressDailyFragment, View view) {
        FragmentActivity activity = stressDailyFragment.getActivity();
        if (activity == null) {
            return;
        }
        Navigator.INSTANCE.startBreatheTraining(activity, 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(StressDailyFragment stressDailyFragment, View view) {
        stressDailyFragment.p().getLaggingLiveDate().setValue(Boolean.TRUE);
    }

    private final boolean s() {
        return Intrinsics.areEqual(Locale.getDefault(), Locale.JAPAN) || Intrinsics.areEqual(Locale.getDefault(), Locale.JAPANESE) || Intrinsics.areEqual(Locale.getDefault().getLanguage(), Locale.JAPANESE.getLanguage());
    }

    private final void t() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            long jLongValue = Long.valueOf(arguments.getLong("time")).longValue();
            this.timeStamp = Long.valueOf(jLongValue);
            this.defaultTimeStr = HMDataFormatKt.getFormatTime$default(jLongValue, HMDataFormatKt.adaptHMPattern(HMPattern.YEAR_ABBR_MONTH_DAY, jLongValue), (Locale) null, 2, (Object) null);
            View view = getView();
            ((TypefaceTextView) (view == null ? null : view.findViewById(com.xiaomi.hm.health.R.id.time))).setText(this.defaultTimeStr);
        }
        StressDailyDetailViewModel stressDailyDetailViewModelP = p();
        Long l = this.timeStamp;
        if (l != null) {
            p().loadDailyStress(l.longValue());
        }
        stressDailyDetailViewModelP.getStressDataLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: ah7
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                StressDailyFragment.C(this.a, (DayStressDetailData) obj);
            }
        });
        stressDailyDetailViewModelP.getLatestValueLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: zg7
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                StressDailyFragment.u(this.a, (BarChartVo) obj);
            }
        });
        stressDailyDetailViewModelP.getMTagList().observe(getViewLifecycleOwner(), new Observer() { // from class: wg7
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                StressDailyFragment.v(this.a, (List) obj);
            }
        });
        stressDailyDetailViewModelP.getLaggingLiveDate().observe(getViewLifecycleOwner(), new Observer() { // from class: ch7
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                StressDailyFragment.w(this.a, (Boolean) obj);
            }
        });
        stressDailyDetailViewModelP.getMDragIntervalStr().observe(getViewLifecycleOwner(), new Observer() { // from class: dh7
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                StressDailyFragment.x(this.a, (String) obj);
            }
        });
        stressDailyDetailViewModelP.getMUserMakeTagListLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: fh7
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                StressDailyFragment.y(this.a, (ArrayList) obj);
            }
        });
        stressDailyDetailViewModelP.getMToast().observe(getViewLifecycleOwner(), new Observer() { // from class: eh7
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                StressDailyFragment.z(this.a, (String) obj);
            }
        });
        stressDailyDetailViewModelP.getWebResultLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: yg7
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                StressDailyFragment.A(this.a, (Resource) obj);
            }
        });
        stressDailyDetailViewModelP.getMakeTagEnableLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: bh7
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                StressDailyFragment.B(this.a, (Boolean) obj);
            }
        });
        stressDailyDetailViewModelP.loadUserMakeTagByDate(this.timeStamp);
        stressDailyDetailViewModelP.checkMakeTagEnable();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(StressDailyFragment stressDailyFragment, BarChartVo barChartVo) {
        if (barChartVo == null) {
            return;
        }
        Pair<Float, Float> highValue = DataConverterKt.toRawBarChartVo(barChartVo).getHighValue();
        Float second = highValue == null ? null : highValue.getSecond();
        String withDecimal = second != null ? DataExKt.formatWithDecimal(second, 0) : null;
        if (withDecimal == null) {
            withDecimal = stressDailyFragment.getString(R.string.value_invalid);
        }
        stressDailyFragment.l(withDecimal, false, barChartVo.getExtra());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(StressDailyFragment stressDailyFragment, List list) {
        View view = stressDailyFragment.getView();
        ((HealthTagEditCard) (view == null ? null : view.findViewById(com.xiaomi.hm.health.R.id.tagEditCard))).setData(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(StressDailyFragment stressDailyFragment, Boolean bool) {
        View view = stressDailyFragment.getView();
        ViewExKt.setVisible(view == null ? null : view.findViewById(com.xiaomi.hm.health.R.id.tagEditCardLayout), bool.booleanValue());
        View view2 = stressDailyFragment.getView();
        ViewExKt.setVisible(view2 == null ? null : view2.findViewById(com.xiaomi.hm.health.R.id.tagDragV), bool.booleanValue());
        View view3 = stressDailyFragment.getView();
        ViewExKt.setVisible(view3 == null ? null : view3.findViewById(com.xiaomi.hm.health.R.id.dragtime_container), bool.booleanValue());
        View view4 = stressDailyFragment.getView();
        ((ConstraintLayout) (view4 == null ? null : view4.findViewById(com.xiaomi.hm.health.R.id.value_container))).setVisibility(bool.booleanValue() ? 4 : 0);
        if (bool.booleanValue()) {
            View view5 = stressDailyFragment.getView();
            ((HealthTagEditCard) (view5 == null ? null : view5.findViewById(com.xiaomi.hm.health.R.id.tagEditCard))).init();
            View view6 = stressDailyFragment.getView();
            ((DragIntervalView) (view6 != null ? view6.findViewById(com.xiaomi.hm.health.R.id.tagDragV) : null)).showDefault();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x(StressDailyFragment stressDailyFragment, String str) {
        View view = stressDailyFragment.getView();
        ((TypefaceTextView) (view == null ? null : view.findViewById(com.xiaomi.hm.health.R.id.tag_time))).setText(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y(StressDailyFragment stressDailyFragment, ArrayList arrayList) {
        View view = stressDailyFragment.getView();
        ((SleepTagChart) (view == null ? null : view.findViewById(com.xiaomi.hm.health.R.id.tagResultLayout))).updateData(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z(StressDailyFragment stressDailyFragment, String str) {
        CustomToast.showShort(stressDailyFragment.getContext(), str);
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_stress_daily_detail, container, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView();
        t();
    }
}
