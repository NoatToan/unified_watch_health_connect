package com.xiaomi.fitness.detail.inner;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.mibi.sdk.component.params.SdkContants;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fit.data.common.data.sport.SportRecordItem;
import com.xiaomi.fit.data.common.data.sport.SportRecordKey;
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import com.xiaomi.fitness.baseui.widget.SportDetailItemView;
import com.xiaomi.fitness.chart.entrys.SportRecordEntry;
import com.xiaomi.fitness.chart.mpchart.linechart.CustomLineChart;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.LocaleUtil;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.detail.BaseSportDetailFragment;
import com.xiaomi.fitness.detail.data.StepDownUpData;
import com.xiaomi.fitness.detail.inner.SportDetailStepDownUpFragment;
import com.xiaomi.fitness.detail.model.SportRecordListModel;
import com.xiaomi.fitness.detail.recycler.SportStepDownUpAdapter;
import com.xiaomi.fitness.detail.util.SportComputeUtil;
import com.xiaomi.fitness.detail.util.SportRecordConstants;
import com.xiaomi.fitness.detail.util.StatisticData;
import com.xiaomi.fitness.detail.viewmodel.SportRecordDetailViewModel;
import com.xiaomi.fitness.util.SportRecordBundleKey;
import com.xiaomi.fitness.util.SportRecordDataUtil;
import com.xiaomi.fitness.webview.WebViewUtilKt;
import com.xiaomi.fitness.widget.view.DataTitleSimpleView;
import defpackage.bsi;
import defpackage.hoi;
import defpackage.iga;
import defpackage.j1j;
import defpackage.rz5;
import defpackage.xr5;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.annotation.AnnotationTarget;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000Æ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 z2\u00020\u0001:\u0003{|zB\u0007¢\u0006\u0004\by\u0010\u0004J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0004J)\u0010\u000b\u001a\u00020\u00022\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J(\u0010\u001e\u001a\u00020\u00022\u0017\u0010\u001d\u001a\u0013\u0012\t\u0012\u00070\u001a¢\u0006\u0002\b\u001b\u0012\u0004\u0012\u00020\u001c0\u0006H\u0002¢\u0006\u0004\b\u001e\u0010\fJ\u0017\u0010!\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020\u001aH\u0002¢\u0006\u0004\b!\u0010\"J\u0019\u0010$\u001a\u00020 2\b\u0010#\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b$\u0010%J<\u0010)\u001a\u0013\u0012\t\u0012\u00070\u001a¢\u0006\u0002\b\u001b\u0012\u0004\u0012\u00020\u001c0\u00062\f\u0010'\u001a\b\u0012\u0004\u0012\u00020&0\b2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020&0\bH\u0002¢\u0006\u0004\b)\u0010*J3\u0010/\u001a\u00020\u00022\u0012\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001c0+2\u0006\u0010-\u001a\u00020\u001a2\u0006\u0010.\u001a\u00020\u0015H\u0002¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020 H\u0016¢\u0006\u0004\b1\u00102J\u000f\u00104\u001a\u000203H\u0016¢\u0006\u0004\b4\u00105J-\u0010<\u001a\u00020;2\b\u00107\u001a\u0004\u0018\u0001062\b\u00109\u001a\u0004\u0018\u0001082\b\u0010:\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b<\u0010=J\u000f\u0010>\u001a\u00020\u0002H\u0004¢\u0006\u0004\b>\u0010\u0004J\u0019\u0010?\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b?\u0010\u0010R$\u0010A\u001a\u0004\u0018\u00010@8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR$\u0010H\u001a\u0004\u0018\u00010G8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR$\u0010N\u001a\u0004\u0018\u00010G8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bN\u0010I\u001a\u0004\bO\u0010K\"\u0004\bP\u0010MR$\u0010R\u001a\u0004\u0018\u00010Q8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR*\u0010Y\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010X8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R$\u0010`\u001a\u0004\u0018\u00010_8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b`\u0010a\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR\u001d\u0010h\u001a\b\u0012\u0004\u0012\u00020g0f8\u0006¢\u0006\f\n\u0004\bh\u0010i\u001a\u0004\bj\u0010kR$\u0010m\u001a\u0004\u0018\u00010l8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bm\u0010n\u001a\u0004\bo\u0010p\"\u0004\bq\u0010rR\u0018\u0010t\u001a\u0004\u0018\u00010s8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bt\u0010uR\u0011\u0010x\u001a\u00020s8F¢\u0006\u0006\u001a\u0004\bv\u0010w¨\u0006}"}, d2 = {"Lcom/xiaomi/fitness/detail/inner/SportDetailStepDownUpFragment;", "Lcom/xiaomi/fitness/detail/BaseSportDetailFragment;", "", "initRecycleView", "()V", "initChartData", "", "Lcom/xiaomi/fit/data/common/data/sport/SportRecordKey;", "", "", "map", "bindStepDownUpData", "(Ljava/util/Map;)V", "Landroid/os/Bundle;", SdkContants.KEY_BUNDLE, "initParamsFromBundle", "(Landroid/os/Bundle;)V", "Lcom/xiaomi/fitness/detail/util/StatisticData;", "statisticData", "bindData", "(Lcom/xiaomi/fitness/detail/util/StatisticData;)V", "", "avgTouchAirRatio", "minTouchAirRatio", "createDetailModelList", "(FF)V", "", "Lcom/xiaomi/fitness/detail/inner/SportDetailStepDownUpFragment$TouchAirPaceStage;", "Lcom/xiaomi/fitness/detail/inner/SportDetailStepDownUpFragment$TouchAirInfo;", "ratioDistMap", "stepUpDownAdapterData", "type", "", "getSpeedType", "(I)Ljava/lang/String;", "downUpPercentage", "getLevelType", "(Ljava/lang/Float;)Ljava/lang/String;", "Lcom/xiaomi/fit/data/common/data/sport/SportRecordItem;", "paceList", "ratioList", "computeTouchAirInfoByPace", "(Ljava/util/List;Ljava/util/List;)Ljava/util/Map;", "", "sumInfoMap", "pace", "touchAirRatio", "setTouchAirInfoInThePace", "(Ljava/util/Map;IF)V", "getCardName", "()Ljava/lang/String;", "", "hasMaxMinAverage", "()Z", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "savedInstanceState", "Landroid/view/View;", "onInflateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "initView", "onNewIntent", "Landroid/widget/LinearLayout;", "itemViewContainer", "Landroid/widget/LinearLayout;", "getItemViewContainer", "()Landroid/widget/LinearLayout;", "setItemViewContainer", "(Landroid/widget/LinearLayout;)V", "Lcom/xiaomi/fitness/baseui/widget/SportDetailItemView;", "itemView1", "Lcom/xiaomi/fitness/baseui/widget/SportDetailItemView;", "getItemView1", "()Lcom/xiaomi/fitness/baseui/widget/SportDetailItemView;", "setItemView1", "(Lcom/xiaomi/fitness/baseui/widget/SportDetailItemView;)V", "itemView2", "getItemView2", "setItemView2", "Lcom/xiaomi/fitness/widget/view/DataTitleSimpleView;", "titleView", "Lcom/xiaomi/fitness/widget/view/DataTitleSimpleView;", "getTitleView", "()Lcom/xiaomi/fitness/widget/view/DataTitleSimpleView;", "setTitleView", "(Lcom/xiaomi/fitness/widget/view/DataTitleSimpleView;)V", "Ljava/util/ArrayList;", "valueList", "Ljava/util/ArrayList;", "getValueList", "()Ljava/util/ArrayList;", "setValueList", "(Ljava/util/ArrayList;)V", "Landroidx/recyclerview/widget/RecyclerView;", "mRecycleView", "Landroidx/recyclerview/widget/RecyclerView;", "getMRecycleView", "()Landroidx/recyclerview/widget/RecyclerView;", "setMRecycleView", "(Landroidx/recyclerview/widget/RecyclerView;)V", "", "Lcom/xiaomi/fitness/detail/data/StepDownUpData;", "mDistributeList", "Ljava/util/List;", "getMDistributeList", "()Ljava/util/List;", "Lcom/xiaomi/fitness/detail/recycler/SportStepDownUpAdapter;", "adapter", "Lcom/xiaomi/fitness/detail/recycler/SportStepDownUpAdapter;", "getAdapter", "()Lcom/xiaomi/fitness/detail/recycler/SportStepDownUpAdapter;", "setAdapter", "(Lcom/xiaomi/fitness/detail/recycler/SportStepDownUpAdapter;)V", "Liga;", "_binding", "Liga;", "getBinding", "()Liga;", "binding", "<init>", "Companion", "TouchAirPaceStage", "TouchAirInfo", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nSportDetailStepDownUpFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportDetailStepDownUpFragment.kt\ncom/xiaomi/fitness/detail/inner/SportDetailStepDownUpFragment\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,384:1\n216#2,2:385\n216#2,2:387\n*S KotlinDebug\n*F\n+ 1 SportDetailStepDownUpFragment.kt\ncom/xiaomi/fitness/detail/inner/SportDetailStepDownUpFragment\n*L\n221#1:385,2\n297#1:387,2\n*E\n"})
public final class SportDetailStepDownUpFragment extends BaseSportDetailFragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String TAG = "SportDetailStepDownUpFragment";

    @Nullable
    private iga _binding;

    @Nullable
    private SportStepDownUpAdapter adapter;

    @Nullable
    private SportDetailItemView itemView1;

    @Nullable
    private SportDetailItemView itemView2;

    @Nullable
    private LinearLayout itemViewContainer;

    @NotNull
    private final List<StepDownUpData> mDistributeList = new ArrayList();

    @Nullable
    private RecyclerView mRecycleView;

    @Nullable
    private DataTitleSimpleView titleView;

    @Nullable
    private ArrayList<SportRecordItem> valueList;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J0\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/detail/inner/SportDetailStepDownUpFragment$Companion;", "", "<init>", "()V", "TAG", "", "switchDetailFragment", "", "sportValues", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", DailyRecordKey.sportType, "", "triathlonNum", "sportDetailType", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void switchDetailFragment(@NotNull SportBasicReport sportValues, int sportType, int triathlonNum, int sportDetailType, @Nullable FragmentManager fragmentManager) {
            Intrinsics.checkNotNullParameter(sportValues, "sportValues");
            Bundle bundle = new Bundle();
            bundle.putSerializable(SportRecordBundleKey.BUNDLE_PARAMS_SPORT_VALUES, sportValues);
            bundle.putInt("sport_type", sportType);
            bundle.putInt(SportRecordBundleKey.BUNDLE_PARAMS_SPORT_DETAIL_TYPE, sportDetailType);
            BaseSportDetailFragment.Companion companion = BaseSportDetailFragment.INSTANCE;
            String strCreateFragmentTag = BaseSportDetailFragment.createFragmentTag(SportDetailStepDownUpFragment.TAG, triathlonNum, sportType);
            int i = bsi.w0;
            Intrinsics.checkNotNull(fragmentManager);
            BaseSportDetailFragment.switchFragment(i, SportDetailStepDownUpFragment.class, strCreateFragmentTag, bundle, fragmentManager);
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J'\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\fR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, d2 = {"Lcom/xiaomi/fitness/detail/inner/SportDetailStepDownUpFragment$TouchAirInfo;", "", "duration", "", "validRatioCount", "touchAirRatio", "", "<init>", "(IIF)V", "getDuration", "()I", "setDuration", "(I)V", "getValidRatioCount", "setValidRatioCount", "getTouchAirRatio", "()F", "setTouchAirRatio", "(F)V", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TouchAirInfo {
        private int duration;
        private float touchAirRatio;
        private int validRatioCount;

        public TouchAirInfo() {
            this(0, 0, 0.0f, 7, null);
        }

        public static /* synthetic */ TouchAirInfo copy$default(TouchAirInfo touchAirInfo, int i, int i2, float f, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = touchAirInfo.duration;
            }
            if ((i3 & 2) != 0) {
                i2 = touchAirInfo.validRatioCount;
            }
            if ((i3 & 4) != 0) {
                f = touchAirInfo.touchAirRatio;
            }
            return touchAirInfo.copy(i, i2, f);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getDuration() {
            return this.duration;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getValidRatioCount() {
            return this.validRatioCount;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final float getTouchAirRatio() {
            return this.touchAirRatio;
        }

        @NotNull
        public final TouchAirInfo copy(int duration, int validRatioCount, float touchAirRatio) {
            return new TouchAirInfo(duration, validRatioCount, touchAirRatio);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TouchAirInfo)) {
                return false;
            }
            TouchAirInfo touchAirInfo = (TouchAirInfo) other;
            return this.duration == touchAirInfo.duration && this.validRatioCount == touchAirInfo.validRatioCount && Float.compare(this.touchAirRatio, touchAirInfo.touchAirRatio) == 0;
        }

        public final int getDuration() {
            return this.duration;
        }

        public final float getTouchAirRatio() {
            return this.touchAirRatio;
        }

        public final int getValidRatioCount() {
            return this.validRatioCount;
        }

        public int hashCode() {
            return (((Integer.hashCode(this.duration) * 31) + Integer.hashCode(this.validRatioCount)) * 31) + Float.hashCode(this.touchAirRatio);
        }

        public final void setDuration(int i) {
            this.duration = i;
        }

        public final void setTouchAirRatio(float f) {
            this.touchAirRatio = f;
        }

        public final void setValidRatioCount(int i) {
            this.validRatioCount = i;
        }

        @NotNull
        public String toString() {
            return "TouchAirInfo(duration=" + this.duration + ", validRatioCount=" + this.validRatioCount + ", touchAirRatio=" + this.touchAirRatio + ")";
        }

        public TouchAirInfo(int i, int i2, float f) {
            this.duration = i;
            this.validRatioCount = i2;
            this.touchAirRatio = f;
        }

        public /* synthetic */ TouchAirInfo(int i, int i2, float f, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2, (i3 & 4) != 0 ? 0.0f : f);
        }
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0087\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/xiaomi/fitness/detail/inner/SportDetailStepDownUpFragment$TouchAirPaceStage;", "", "Companion", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @kotlin.annotation.Target(allowedTargets = {AnnotationTarget.FIELD, AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER, AnnotationTarget.VALUE_PARAMETER, AnnotationTarget.LOCAL_VARIABLE, AnnotationTarget.TYPE})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface TouchAirPaceStage {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = Companion.$$INSTANCE;
        public static final int Stage4Less = 5;
        public static final int Stage4To5 = 4;
        public static final int Stage5To6 = 3;
        public static final int Stage6To7 = 2;
        public static final int Stage7To8 = 1;
        public static final int Stage8Greater = 0;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fitness/detail/inner/SportDetailStepDownUpFragment$TouchAirPaceStage$Companion;", "", "<init>", "()V", "Stage8Greater", "", "Stage7To8", "Stage6To7", "Stage5To6", "Stage4To5", "Stage4Less", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();
            public static final int Stage4Less = 5;
            public static final int Stage4To5 = 4;
            public static final int Stage5To6 = 3;
            public static final int Stage6To7 = 2;
            public static final int Stage7To8 = 1;
            public static final int Stage8Greater = 0;

            private Companion() {
            }
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.detail.inner.SportDetailStepDownUpFragment$bindStepDownUpData$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.detail.inner.SportDetailStepDownUpFragment$bindStepDownUpData$1", f = "SportDetailStepDownUpFragment.kt", i = {0}, l = {137, 146}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Map<SportRecordKey, List<Object>> $map;
        final /* synthetic */ List<SportRecordItem> $ratioList;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ SportDetailStepDownUpFragment this$0;

        /* JADX INFO: renamed from: com.xiaomi.fitness.detail.inner.SportDetailStepDownUpFragment$bindStepDownUpData$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.detail.inner.SportDetailStepDownUpFragment$bindStepDownUpData$1$1", f = "SportDetailStepDownUpFragment.kt", i = {}, l = {148}, m = "invokeSuspend", n = {}, s = {})
        public static final class C04011 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Map<Integer, TouchAirInfo> $ratioDistByPace;
            final /* synthetic */ StatisticData $statisticData;
            final /* synthetic */ Deferred<ArrayList<SportRecordItem>> $valueListTask;
            Object L$0;
            int label;
            final /* synthetic */ SportDetailStepDownUpFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C04011(SportDetailStepDownUpFragment sportDetailStepDownUpFragment, Deferred<? extends ArrayList<SportRecordItem>> deferred, StatisticData statisticData, Map<Integer, TouchAirInfo> map, Continuation<? super C04011> continuation) {
                super(2, continuation);
                this.this$0 = sportDetailStepDownUpFragment;
                this.$valueListTask = deferred;
                this.$statisticData = statisticData;
                this.$ratioDistByPace = map;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C04011(this.this$0, this.$valueListTask, this.$statisticData, this.$ratioDistByPace, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                SportDetailStepDownUpFragment sportDetailStepDownUpFragment;
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    SportDetailStepDownUpFragment sportDetailStepDownUpFragment2 = this.this$0;
                    Deferred<ArrayList<SportRecordItem>> deferred = this.$valueListTask;
                    this.L$0 = sportDetailStepDownUpFragment2;
                    this.label = 1;
                    Object objAwait = deferred.await(this);
                    if (objAwait == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    sportDetailStepDownUpFragment = sportDetailStepDownUpFragment2;
                    obj = objAwait;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sportDetailStepDownUpFragment = (SportDetailStepDownUpFragment) this.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                sportDetailStepDownUpFragment.setValueList((ArrayList) obj);
                SportDetailStepDownUpFragment sportDetailStepDownUpFragment3 = this.this$0;
                sportDetailStepDownUpFragment3.printChartInt(SportDetailStepDownUpFragment.TAG, sportDetailStepDownUpFragment3.getValueList());
                this.this$0.bindData(this.$statisticData);
                this.this$0.stepUpDownAdapterData(this.$ratioDistByPace);
                SportStepDownUpAdapter adapter = this.this$0.getAdapter();
                Intrinsics.checkNotNull(adapter);
                adapter.updateAllDataList(this.this$0.getMDistributeList());
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C04011) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(List<SportRecordItem> list, Map<SportRecordKey, ? extends List<? extends Object>> map, SportDetailStepDownUpFragment sportDetailStepDownUpFragment, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$ratioList = list;
            this.$map = map;
            this.this$0 = sportDetailStepDownUpFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$ratioList, this.$map, this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineScope coroutineScope;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    coroutineScope = (CoroutineScope) this.L$0;
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            coroutineScope = (CoroutineScope) this.L$0;
            List<SportRecordItem> list = this.$ratioList;
            this.L$0 = coroutineScope;
            this.label = 1;
            obj = SportComputeUtil.computeMinMaxValue$default(list, null, this, 2, null);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            StatisticData statisticData = (StatisticData) obj;
            Deferred deferredAsync$default = BuildersKt__Builders_commonKt.async$default(coroutineScope, Dispatchers.getIO(), null, new SportDetailStepDownUpFragment$bindStepDownUpData$1$valueListTask$1(this.$ratioList, this.this$0, null), 2, null);
            List<Object> listEmptyList = this.$map.get(SportRecordKey.Pace);
            if (listEmptyList == null) {
                listEmptyList = CollectionsKt__CollectionsKt.emptyList();
            }
            Map mapComputeTouchAirInfoByPace = this.this$0.computeTouchAirInfoByPace(listEmptyList, this.$ratioList);
            MainCoroutineDispatcher main = Dispatchers.getMain();
            C04011 c04011 = new C04011(this.this$0, deferredAsync$default, statisticData, mapComputeTouchAirInfoByPace, null);
            this.L$0 = null;
            this.label = 2;
            if (BuildersKt.withContext(main, c04011, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindData(StatisticData statisticData) {
        Float minTouchDownAirRatio;
        Float avgTouchDownAirRatio;
        if (isInvalid() || statisticData == null) {
            return;
        }
        SportBasicReport mSportValues = getMSportValues();
        float avgValue = (mSportValues == null || (avgTouchDownAirRatio = mSportValues.getAvgTouchDownAirRatio()) == null) ? statisticData.getAvgValue() : avgTouchDownAirRatio.floatValue();
        SportBasicReport mSportValues2 = getMSportValues();
        float fFloatValue = (mSportValues2 == null || (minTouchDownAirRatio = mSportValues2.getMinTouchDownAirRatio()) == null) ? statisticData.getMinItem().getValue().floatValue() : minTouchDownAirRatio.floatValue();
        float fE = xr5.e(1, avgValue);
        float fE2 = xr5.e(1, fFloatValue);
        SportRecordListModel sportRecordListModelCreateEntryListInner = SportRecordDataUtil.createEntryListInner(this.valueList);
        List<SportRecordEntry> sportRecordList = sportRecordListModelCreateEntryListInner.getSportRecordList();
        String string = getString(j1j.O2, String.valueOf(fE));
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        CustomLineChart customLineChart = this.mLineChart;
        Intrinsics.checkNotNull(customLineChart);
        CustomLineChart.setLimitLine$default(customLineChart, fE, string, sportRecordListModelCreateEntryListInner.getValueRange(), 0.0f, 8, null);
        CustomLineChart customLineChart2 = this.mLineChart;
        Intrinsics.checkNotNull(customLineChart2);
        customLineChart2.setChartKey(SportRecordKey.TouchAirRatio);
        Logger.d(TAG, "Sport Detail DownUp bind Data " + sportRecordList);
        CustomLineChart customLineChart3 = this.mLineChart;
        Intrinsics.checkNotNull(customLineChart3);
        customLineChart3.bindStepDownUpData(sportRecordList);
        createDetailModelList(fE, fE2);
    }

    private final void bindStepDownUpData(Map<SportRecordKey, ? extends List<? extends Object>> map) {
        SportRecordKey sportRecordKey = SportRecordKey.TouchAirRatio;
        if (map.containsKey(sportRecordKey)) {
            List<? extends Object> list = map.get(sportRecordKey);
            Intrinsics.checkNotNull(list, "null cannot be cast to non-null type kotlin.collections.List<com.xiaomi.fit.data.common.data.sport.SportRecordItem>");
            List<? extends Object> list2 = list;
            if (this.valueList == null) {
                LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
                Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), Dispatchers.getIO(), null, new AnonymousClass1(list2, map, this, null), 2, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<Integer, TouchAirInfo> computeTouchAirInfoByPace(List<SportRecordItem> paceList, List<SportRecordItem> ratioList) {
        int size = paceList.size();
        int size2 = ratioList.size();
        if (size == 0 || size2 == 0) {
            Logger.i(TAG, "computeTouchAirInfo pace size(" + size + ", ratio size(" + size2 + ")");
            return MapsKt__MapsKt.emptyMap();
        }
        if (size > size2) {
            size = size2;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (int i = 0; i < size; i++) {
            setTouchAirInfoInThePace(linkedHashMap, paceList.get(i).getValue().intValue(), ratioList.get(i).getValue().floatValue());
        }
        for (Map.Entry<Integer, TouchAirInfo> entry : linkedHashMap.entrySet()) {
            int validRatioCount = entry.getValue().getValidRatioCount();
            entry.getValue().setTouchAirRatio(validRatioCount > 0 ? xr5.e(1, entry.getValue().getTouchAirRatio() / validRatioCount) : 0.0f);
        }
        return linkedHashMap;
    }

    private final void createDetailModelList(float avgTouchAirRatio, float minTouchAirRatio) {
        rz5 rz5Var = new rz5(getString(j1j.v3), String.valueOf(avgTouchAirRatio));
        SportDetailItemView sportDetailItemView = this.itemView1;
        if (sportDetailItemView != null) {
            SportDetailItemView.bindData$default(sportDetailItemView, rz5Var, false, 2, null);
        }
        rz5 rz5Var2 = new rz5(getString(j1j.F3), String.valueOf(minTouchAirRatio));
        SportDetailItemView sportDetailItemView2 = this.itemView2;
        if (sportDetailItemView2 != null) {
            SportDetailItemView.bindData$default(sportDetailItemView2, rz5Var2, false, 2, null);
        }
        BaseSportDetailFragment.reportCardInfo$default(this, Float.valueOf(avgTouchAirRatio), null, Float.valueOf(minTouchAirRatio), 2, null);
    }

    private final String getLevelType(Float downUpPercentage) {
        if (downUpPercentage == null || Intrinsics.areEqual(downUpPercentage, 0.0f)) {
            String string = getString(j1j.O6);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            return string;
        }
        if (downUpPercentage.floatValue() < 1.0d) {
            String string2 = getString(j1j.l8);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            return string2;
        }
        String string3 = ((double) downUpPercentage.floatValue()) < 1.6d ? getString(j1j.m8) : getString(j1j.n8);
        Intrinsics.checkNotNull(string3);
        return string3;
    }

    private final String getSpeedType(int type) {
        if (type == 0) {
            String string = getString(j1j.J6);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            return string;
        }
        if (type == 1) {
            String string2 = getString(j1j.L6);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            return string2;
        }
        if (type == 2) {
            String string3 = getString(j1j.N6);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            return string3;
        }
        if (type == 3) {
            String string4 = getString(j1j.K6);
            Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
            return string4;
        }
        if (type == 4) {
            String string5 = getString(j1j.I6);
            Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
            return string5;
        }
        if (type != 5) {
            String string6 = getString(j1j.O6);
            Intrinsics.checkNotNull(string6);
            return string6;
        }
        String string7 = getString(j1j.M6);
        Intrinsics.checkNotNullExpressionValue(string7, "getString(...)");
        return string7;
    }

    private final void initChartData() {
        SportRecordDetailViewModel detailViewModel;
        MutableLiveData<Map<SportRecordKey, List<Object>>> triathlonRunMaps;
        MutableLiveData<Map<SportRecordKey, List<Object>>> recordDetailMaps;
        initDetailViewModel();
        if (getMSportValues() == null || isInvalid()) {
            return;
        }
        if (getMDetailSportType() == -1) {
            SportRecordDetailViewModel detailViewModel2 = getDetailViewModel();
            if (detailViewModel2 == null || (recordDetailMaps = detailViewModel2.getRecordDetailMaps()) == null) {
                return;
            }
            recordDetailMaps.observe(requireActivity(), new SportDetailStepDownUpFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: djn
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return SportDetailStepDownUpFragment.initChartData$lambda$1(this.f15597a, (Map) obj);
                }
            }));
            return;
        }
        if (getMDetailSportType() != 2 || (detailViewModel = getDetailViewModel()) == null || (triathlonRunMaps = detailViewModel.getTriathlonRunMaps()) == null) {
            return;
        }
        triathlonRunMaps.observe(requireActivity(), new SportDetailStepDownUpFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: ejn
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SportDetailStepDownUpFragment.initChartData$lambda$2(this.f16714a, (Map) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initChartData$lambda$1(SportDetailStepDownUpFragment this$0, Map map) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNull(map);
        this$0.bindStepDownUpData(map);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initChartData$lambda$2(SportDetailStepDownUpFragment this$0, Map map) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNull(map);
        this$0.bindStepDownUpData(map);
        return Unit.INSTANCE;
    }

    private final void initParamsFromBundle(Bundle bundle) {
        if (bundle != null) {
            setMSportValues((SportBasicReport) bundle.getSerializable(SportRecordBundleKey.BUNDLE_PARAMS_SPORT_VALUES));
            setMDetailSportType(bundle.getInt(SportRecordBundleKey.BUNDLE_PARAMS_SPORT_DETAIL_TYPE, -1));
        }
    }

    private final void initRecycleView() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getMActivity());
        this.adapter = new SportStepDownUpAdapter();
        RecyclerView recyclerView = this.mRecycleView;
        if (recyclerView != null) {
            recyclerView.setVisibility(0);
        }
        RecyclerView recyclerView2 = this.mRecycleView;
        if (recyclerView2 != null) {
            recyclerView2.setLayoutManager(linearLayoutManager);
        }
        RecyclerView recyclerView3 = this.mRecycleView;
        if (recyclerView3 != null) {
            recyclerView3.setAdapter(this.adapter);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$0(SportDetailStepDownUpFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onTraceBtmIntroduction("touchdown_soaring");
        WebViewUtilKt.startWebView$default(SportRecordConstants.INSTANCE.getUnderstandSportTypeUrl(LocaleUtil.getCurrentLocale$default(LocaleUtil.INSTANCE, false, false, 3, null), "flight_ratio"), this$0.getString(j1j.f8), false, false, null, false, null, false, 252, null);
    }

    private final void setTouchAirInfoInThePace(Map<Integer, TouchAirInfo> sumInfoMap, int pace, float touchAirRatio) {
        int i;
        if (pace <= 0) {
            return;
        }
        if (pace > 480) {
            i = 0;
        } else if (pace > 420) {
            i = 1;
        } else if (pace > 360) {
            i = 2;
        } else if (pace > 300) {
            i = 3;
        } else {
            i = pace > 240 ? 4 : 5;
        }
        TouchAirInfo touchAirInfo = sumInfoMap.get(Integer.valueOf(i));
        if (touchAirInfo == null) {
            touchAirInfo = new TouchAirInfo(0, 0, 0.0f, 7, null);
            sumInfoMap.put(Integer.valueOf(i), touchAirInfo);
        }
        touchAirInfo.setDuration(touchAirInfo.getDuration() + 1);
        if (touchAirRatio > 0.0f) {
            touchAirInfo.setValidRatioCount(touchAirInfo.getValidRatioCount() + 1);
            touchAirInfo.setTouchAirRatio(touchAirInfo.getTouchAirRatio() + touchAirRatio);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:29:0x009c  */
    public final void stepUpDownAdapterData(Map<Integer, TouchAirInfo> ratioDistMap) {
        String str;
        String str2;
        float touchAirRatio;
        this.mDistributeList.add(new StepDownUpData("--", "--", "--", "--", 0));
        Iterator<Map.Entry<Integer, TouchAirInfo>> it = ratioDistMap.entrySet().iterator();
        float fMax = 0.0f;
        while (it.hasNext()) {
            fMax = Math.max(it.next().getValue().getTouchAirRatio(), fMax);
        }
        int i = -1;
        for (int i2 = 0; i2 < 6; i2++) {
            TouchAirInfo touchAirInfo = ratioDistMap.get(Integer.valueOf(i2));
            String timeStrWithSecDef = TimeDateUtil.getTimeStrWithSecDef(touchAirInfo != null ? touchAirInfo.getDuration() : 0);
            if (fMax == 0.0f || touchAirInfo == null || touchAirInfo.getTouchAirRatio() == 0.0f) {
                str = "--";
                str2 = timeStrWithSecDef;
                touchAirRatio = 0.0f;
            } else {
                touchAirRatio = (touchAirInfo.getTouchAirRatio() / fMax) * 100;
                String timeStrWithSecDef2 = TimeDateUtil.getTimeStrWithSecDef(touchAirInfo.getDuration());
                String strValueOf = String.valueOf(touchAirInfo.getTouchAirRatio());
                if (i != -1) {
                    TouchAirInfo touchAirInfo2 = ratioDistMap.get(Integer.valueOf(i));
                    if ((touchAirInfo2 != null ? touchAirInfo2.getTouchAirRatio() : 0.0f) > touchAirInfo.getTouchAirRatio()) {
                        i = i2;
                    }
                } else {
                    i = i2;
                }
                str = strValueOf;
                str2 = timeStrWithSecDef2;
            }
            this.mDistributeList.add(new StepDownUpData(getSpeedType(i2), str2, str, getLevelType(touchAirInfo != null ? Float.valueOf(touchAirInfo.getTouchAirRatio()) : null), (int) touchAirRatio));
        }
        if (i != -1) {
            int size = this.mDistributeList.size();
            int i3 = i + 1;
            if (i3 < 0 || i3 >= size) {
                return;
            }
            this.mDistributeList.get(i3).setFastType(true);
        }
    }

    @Nullable
    public final SportStepDownUpAdapter getAdapter() {
        return this.adapter;
    }

    @NotNull
    public final iga getBinding() {
        iga igaVar = this._binding;
        Intrinsics.checkNotNull(igaVar);
        return igaVar;
    }

    @Override // com.xiaomi.fitness.detail.BaseSportDetailFragment
    @NotNull
    public String getCardName() {
        return "bottom_to_air_ratio";
    }

    @Nullable
    public final SportDetailItemView getItemView1() {
        return this.itemView1;
    }

    @Nullable
    public final SportDetailItemView getItemView2() {
        return this.itemView2;
    }

    @Nullable
    public final LinearLayout getItemViewContainer() {
        return this.itemViewContainer;
    }

    @NotNull
    public final List<StepDownUpData> getMDistributeList() {
        return this.mDistributeList;
    }

    @Nullable
    public final RecyclerView getMRecycleView() {
        return this.mRecycleView;
    }

    @Nullable
    public final DataTitleSimpleView getTitleView() {
        return this.titleView;
    }

    @Nullable
    public final ArrayList<SportRecordItem> getValueList() {
        return this.valueList;
    }

    @Override // com.xiaomi.fitness.detail.BaseSportDetailFragment
    public boolean hasMaxMinAverage() {
        return true;
    }

    public final void initView() {
        initParamsFromBundle(getArguments());
        DataTitleSimpleView dataTitleSimpleView = this.titleView;
        Intrinsics.checkNotNull(dataTitleSimpleView);
        dataTitleSimpleView.bindData(hoi.p0, getString(j1j.f8));
        setAbnormalGuideListener(new View.OnClickListener() { // from class: fjn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SportDetailStepDownUpFragment.initView$lambda$0(this.f17855a, view);
            }
        });
        DataTitleSimpleView dataTitleSimpleView2 = this.titleView;
        Intrinsics.checkNotNull(dataTitleSimpleView2);
        dataTitleSimpleView2.setGuideIcon(hoi.K0, getAbnormalGuideListener());
        initIvExpandViewClick(SportRecordKey.TouchAirRatio);
        initBaseChart();
        initChartData();
        initRecycleView();
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, defpackage.osc
    @NotNull
    public View onInflateView(@Nullable LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNull(inflater);
        this._binding = iga.A0(inflater, container, false);
        this.itemViewContainer = getBinding().E;
        this.itemView2 = getBinding().D;
        this.itemView1 = getBinding().C;
        this.titleView = getBinding().B;
        this.mLineChart = getBinding().A;
        this.mRecycleView = getBinding().G;
        setIvExpandView(getBinding().F);
        initView();
        View root = getBinding().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment
    public void onNewIntent(@Nullable Bundle bundle) {
        super.onNewIntent(bundle);
        initParamsFromBundle(bundle);
    }

    public final void setAdapter(@Nullable SportStepDownUpAdapter sportStepDownUpAdapter) {
        this.adapter = sportStepDownUpAdapter;
    }

    public final void setItemView1(@Nullable SportDetailItemView sportDetailItemView) {
        this.itemView1 = sportDetailItemView;
    }

    public final void setItemView2(@Nullable SportDetailItemView sportDetailItemView) {
        this.itemView2 = sportDetailItemView;
    }

    public final void setItemViewContainer(@Nullable LinearLayout linearLayout) {
        this.itemViewContainer = linearLayout;
    }

    public final void setMRecycleView(@Nullable RecyclerView recyclerView) {
        this.mRecycleView = recyclerView;
    }

    public final void setTitleView(@Nullable DataTitleSimpleView dataTitleSimpleView) {
        this.titleView = dataTitleSimpleView;
    }

    public final void setValueList(@Nullable ArrayList<SportRecordItem> arrayList) {
        this.valueList = arrayList;
    }
}
