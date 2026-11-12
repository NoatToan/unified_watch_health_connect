package com.xiaomi.fitness.detail;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fit.data.common.data.sport.SportRecordItem;
import com.xiaomi.fit.data.common.data.sport.SportRecordKey;
import com.xiaomi.fit.data.common.data.sport.util.SportReportComputeUtil;
import com.xiaomi.fitness.baseui.view.BaseBindingActivity;
import com.xiaomi.fitness.chart.barchart.SpeedRatioLayoutManager;
import com.xiaomi.fitness.chart.barchart.itemdecoration.SportLineChartItemDecoration;
import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;
import com.xiaomi.fitness.chart.entrys.SportRecordLandEntry;
import com.xiaomi.fitness.chart.entrys.model.SportItemModel;
import com.xiaomi.fitness.chart.entrys.model.SportRecordYModel;
import com.xiaomi.fitness.chart.util.SportRecordChatUtil;
import com.xiaomi.fitness.chart.view.SportRecordChartRecyclerView;
import com.xiaomi.fitness.common.extensions.ListExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.SettingsPropertiesUtil;
import com.xiaomi.fitness.detail.SportDetailLandActivity;
import com.xiaomi.fitness.detail.model.SportDetailViewModel;
import com.xiaomi.fitness.detail.recycler.SportRecordLandTitleAdapter;
import com.xiaomi.fitness.detail.util.SportComputeUtil;
import com.xiaomi.fitness.detail.util.SportLandHighLightMarkValueFormatter;
import com.xiaomi.fitness.detail.util.StatisticData;
import com.xiaomi.fitness.detail.viewmodel.SportRecordDetailViewModel;
import com.xiaomi.fitness.util.SportRecordBundleKey;
import com.xiaomi.fitness.util.SportRecordDataUtil;
import com.xiaomi.smarthome.framework.plugin.rn.utils.MediaStoreUtil;
import defpackage.grr;
import defpackage.iak;
import defpackage.ivi;
import defpackage.mt5;
import defpackage.onq;
import defpackage.ro0;
import defpackage.rtr;
import defpackage.sf2;
import defpackage.vfe;
import defpackage.vqr;
import defpackage.xcm;
import defpackage.zon;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000Ø\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0012\u0018\u0000 r2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001rB\u0007¢\u0006\u0004\bq\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J)\u0010\f\u001a\u00020\u00042\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0007H\u0002¢\u0006\u0004\b\f\u0010\rJ)\u0010\u000f\u001a\u00020\u00042\u0018\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0007H\u0002¢\u0006\u0004\b\u000f\u0010\rJ3\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00110\t2\u0006\u0010\u0010\u001a\u00020\b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\t2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J)\u0010\u0017\u001a\u00020\u00042\u0018\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0007H\u0002¢\u0006\u0004\b\u0017\u0010\rJ)\u0010\u0018\u001a\u00020\u00042\u0018\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0007H\u0002¢\u0006\u0004\b\u0018\u0010\rJ\u0017\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0004H\u0002¢\u0006\u0004\b#\u0010\u0006J\u0019\u0010&\u001a\u00020\u00042\b\u0010%\u001a\u0004\u0018\u00010$H\u0014¢\u0006\u0004\b&\u0010'J\u000f\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b)\u0010*R\u0016\u0010,\u001a\u00020+8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u0010/\u001a\u00020.8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b/\u00100R\u001c\u00103\u001a\b\u0012\u0004\u0012\u000202018\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b3\u00104R\u001c\u00107\u001a\b\u0012\u0004\u0012\u000206058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u0010:\u001a\u0002098\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b:\u0010;R\u0016\u0010=\u001a\u00020<8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010@\u001a\u00020?8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b@\u0010AR\u0016\u0010C\u001a\u00020B8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bC\u0010DR\u0016\u0010E\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0016\u0010\u001c\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010FR\u0014\u0010G\u001a\u00020\u00138\u0002X\u0082D¢\u0006\u0006\n\u0004\bG\u0010FR\u001c\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u00108R\u0016\u0010H\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010FR\u0018\u0010J\u001a\u0004\u0018\u00010I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0018\u0010L\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u0018\u0010O\u001a\u0004\u0018\u00010N8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010PR\u0016\u0010R\u001a\u00020Q8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bR\u0010SR\u0016\u0010U\u001a\u00020T8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bU\u0010VR\u0018\u0010X\u001a\u0004\u0018\u00010W8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010YR\u001c\u0010Z\u001a\b\u0012\u0004\u0012\u00020\b058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u00108R\u001c\u0010[\u001a\b\u0012\u0004\u0012\u00020\b058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u00108R\u001a\u0010]\u001a\b\u0012\u0004\u0012\u00020\\058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u00108R\u0016\u0010_\u001a\u00020^8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b_\u0010`R\"\u0010b\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u001f0a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010cR\u0014\u0010d\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010eR\u0016\u0010f\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u0010FR\u0018\u0010g\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010hR\u0016\u0010i\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010jR\u0016\u0010k\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bk\u0010jR\u0014\u0010n\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bl\u0010mR\u0014\u0010p\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bo\u0010m¨\u0006s"}, d2 = {"Lcom/xiaomi/fitness/detail/SportDetailLandActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/detail/viewmodel/SportRecordDetailViewModel;", "Lro0;", "", "initLineRecyclerView", "()V", "", "Lcom/xiaomi/fit/data/common/data/sport/SportRecordKey;", "", "", "recordMap", "refreshChartRecycleView", "(Ljava/util/Map;)V", "SportRecordMap", "refreshFirstChartView", "key", "Lcom/xiaomi/fit/data/common/data/sport/SportRecordItem;", "list", "", "duration", "getChartListByType", "(Lcom/xiaomi/fit/data/common/data/sport/SportRecordKey;Ljava/util/List;I)Ljava/util/List;", "refreshChartTitleView", "refreshOtherChartView", MediaStoreUtil.MediaInfo.SIZE, "computeDisplayNumber", "(I)I", "displayNumber", "setXAxis", "(I)V", "Lcom/xiaomi/fitness/chart/entrys/model/SportRecordYModel;", "mYModel", "reSizeYAxis", "(Lcom/xiaomi/fitness/chart/entrys/model/SportRecordYModel;)V", "initTitleRecycleView", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "", "enablePadOrientationRotate", "()Z", "Lcom/xiaomi/fitness/chart/view/SportRecordChartRecyclerView;", "lineRecyclerView", "Lcom/xiaomi/fitness/chart/view/SportRecordChartRecyclerView;", "Lvfe;", "mBarChartAttrs", "Lvfe;", "Lzon;", "Lsf2;", "mBarChartAdapter", "Lzon;", "", "Lcom/xiaomi/fitness/chart/entrys/SportRecordLandEntry;", "mEntries", "Ljava/util/List;", "Lcom/xiaomi/fitness/chart/barchart/itemdecoration/SportLineChartItemDecoration;", "mItemDecoration", "Lcom/xiaomi/fitness/chart/barchart/itemdecoration/SportLineChartItemDecoration;", "Lrtr;", "mYAxis", "Lrtr;", "Lvqr;", "mXAxis", "Lvqr;", "Lonq;", "valueFormatter", "Lonq;", "chartListSize", "I", "maxDisplayNumber", "distance", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "mSportReport", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "mSportRecordKey", "Lcom/xiaomi/fit/data/common/data/sport/SportRecordKey;", "Lcom/xiaomi/fitness/detail/util/SportLandHighLightMarkValueFormatter;", "highLightMarkValueFormatter", "Lcom/xiaomi/fitness/detail/util/SportLandHighLightMarkValueFormatter;", "Landroid/widget/FrameLayout;", "allChartView", "Landroid/widget/FrameLayout;", "Landroidx/recyclerview/widget/RecyclerView;", "chartTitleView", "Landroidx/recyclerview/widget/RecyclerView;", "Lcom/xiaomi/fitness/detail/recycler/SportRecordLandTitleAdapter;", "chartTitleAdapter", "Lcom/xiaomi/fitness/detail/recycler/SportRecordLandTitleAdapter;", "chartDataKeyList", "chartShowAllKeyList", "Lcom/xiaomi/fitness/detail/model/SportDetailViewModel;", "mSportViewList", "Lcom/xiaomi/fitness/chart/barchart/SpeedRatioLayoutManager;", "layoutManager", "Lcom/xiaomi/fitness/chart/barchart/SpeedRatioLayoutManager;", "", "mYAxisValueList", "Ljava/util/Map;", "mContext", "Lcom/xiaomi/fitness/detail/SportDetailLandActivity;", "mDetailSportType", "mSportType", "Ljava/lang/Integer;", "addFirstChartFlag", "Z", "addOtherChartFlag", "getViewModelId", "()I", "viewModelId", "getLayoutId", "layoutId", "<init>", "Companion", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class SportDetailLandActivity extends BaseBindingActivity<SportRecordDetailViewModel, ro0> {

    @NotNull
    public static final String TAG = "SportRecordLandScapeActivity";
    private boolean addFirstChartFlag;
    private boolean addOtherChartFlag;
    private FrameLayout allChartView;
    private int chartListSize;

    @Nullable
    private SportRecordLandTitleAdapter chartTitleAdapter;
    private RecyclerView chartTitleView;
    private int displayNumber;

    @Nullable
    private SportLandHighLightMarkValueFormatter highLightMarkValueFormatter;
    private SpeedRatioLayoutManager layoutManager;
    private SportRecordChartRecyclerView lineRecyclerView;
    private zon<sf2> mBarChartAdapter;
    private vfe mBarChartAttrs;
    private SportLineChartItemDecoration mItemDecoration;

    @Nullable
    private SportRecordKey mSportRecordKey;

    @Nullable
    private SportBasicReport mSportReport;

    @Nullable
    private Integer mSportType;
    private vqr mXAxis;
    private rtr mYAxis;
    private onq valueFormatter;

    @NotNull
    private List<SportRecordLandEntry> mEntries = new ArrayList();
    private final int maxDisplayNumber = 100;

    @NotNull
    private List<SportRecordItem> list = new ArrayList();
    private int distance = 1;

    @NotNull
    private List<SportRecordKey> chartDataKeyList = new ArrayList();

    @NotNull
    private List<SportRecordKey> chartShowAllKeyList = new ArrayList();

    @NotNull
    private final List<SportDetailViewModel> mSportViewList = new ArrayList();

    @NotNull
    private Map<SportRecordKey, SportRecordYModel> mYAxisValueList = new LinkedHashMap();

    @NotNull
    private final SportDetailLandActivity mContext = this;
    private int mDetailSportType = -1;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SportRecordKey.values().length];
            try {
                iArr[SportRecordKey.FrogBreathAngle.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SportRecordKey.FrogSkiDuration.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SportRecordKey.FreePitchAngle.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SportRecordKey.FreeBreathAngle.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[SportRecordKey.SwimPace.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[SportRecordKey.SwimStrokeFreq.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[SportRecordKey.SwimSwolf.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[SportRecordKey.Hr.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[SportRecordKey.Speed.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[SportRecordKey.Resistance.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[SportRecordKey.Frequency.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[SportRecordKey.Power.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.detail.SportDetailLandActivity$refreshFirstChartView$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.detail.SportDetailLandActivity$refreshFirstChartView$1", f = "SportDetailLandActivity.kt", i = {}, l = {228}, m = "invokeSuspend", n = {}, s = {})
    public static final class C18651 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.detail.SportDetailLandActivity$refreshFirstChartView$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.detail.SportDetailLandActivity$refreshFirstChartView$1$1", f = "SportDetailLandActivity.kt", i = {}, l = {229}, m = "invokeSuspend", n = {}, s = {})
        public static final class C03881 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ SportDetailLandActivity this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C03881(SportDetailLandActivity sportDetailLandActivity, Continuation<? super C03881> continuation) {
                super(2, continuation);
                this.this$0 = sportDetailLandActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C03881(this.this$0, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                SportRecordItem minItem;
                Number value;
                SportRecordItem maxItem;
                Number value2;
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    List list = this.this$0.list;
                    SportRecordKey sportRecordKey = this.this$0.mSportRecordKey;
                    this.label = 1;
                    obj = SportComputeUtil.computeMinMaxValue(list, sportRecordKey, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                StatisticData statisticData = (StatisticData) obj;
                SportRecordChatUtil sportRecordChatUtil = SportRecordChatUtil.INSTANCE;
                SportRecordKey sportRecordKey2 = this.this$0.mSportRecordKey;
                Intrinsics.checkNotNull(sportRecordKey2);
                float fFloatValue = 0.0f;
                float fFloatValue2 = (statisticData == null || (maxItem = statisticData.getMaxItem()) == null || (value2 = maxItem.getValue()) == null) ? 0.0f : value2.floatValue();
                if (statisticData != null && (minItem = statisticData.getMinItem()) != null && (value = minItem.getValue()) != null) {
                    fFloatValue = value.floatValue();
                }
                Pair<Integer, Integer> yMaxValueByKey = sportRecordChatUtil.getYMaxValueByKey(sportRecordKey2, fFloatValue2, fFloatValue);
                SportRecordDataUtil sportRecordDataUtil = SportRecordDataUtil.INSTANCE;
                SportDetailLandActivity sportDetailLandActivity = this.this$0.mContext;
                SportRecordKey sportRecordKey3 = this.this$0.mSportRecordKey;
                Intrinsics.checkNotNull(sportRecordKey3);
                SportBasicReport sportBasicReport = this.this$0.mSportReport;
                zon zonVar = null;
                SportRecordYModel sportRecordYModel = new SportRecordYModel(sportRecordDataUtil.getTitleStrByType(sportDetailLandActivity, sportRecordKey3, sportBasicReport != null ? Boxing.boxInt(sportBasicReport.getSportType()) : null), yMaxValueByKey.getFirst().intValue(), yMaxValueByKey.getSecond().intValue());
                this.this$0.reSizeYAxis(sportRecordYModel);
                Map map = this.this$0.mYAxisValueList;
                SportRecordKey sportRecordKey4 = this.this$0.mSportRecordKey;
                Intrinsics.checkNotNull(sportRecordKey4);
                map.put(sportRecordKey4, sportRecordYModel);
                SportLineChartItemDecoration sportLineChartItemDecoration = this.this$0.mItemDecoration;
                if (sportLineChartItemDecoration == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mItemDecoration");
                    sportLineChartItemDecoration = null;
                }
                sportLineChartItemDecoration.setYAxisValueList(this.this$0.mYAxisValueList);
                List list2 = this.this$0.chartDataKeyList;
                SportRecordKey sportRecordKey5 = this.this$0.mSportRecordKey;
                Intrinsics.checkNotNull(sportRecordKey5);
                list2.add(sportRecordKey5);
                zon zonVar2 = this.this$0.mBarChartAdapter;
                if (zonVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBarChartAdapter");
                } else {
                    zonVar = zonVar2;
                }
                zonVar.notifyDataSetChanged();
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C03881) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        public C18651(Continuation<? super C18651> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SportDetailLandActivity.this.new C18651(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MainCoroutineDispatcher main = Dispatchers.getMain();
                C03881 c03881 = new C03881(SportDetailLandActivity.this, null);
                this.label = 1;
                if (BuildersKt.withContext(main, c03881, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C18651) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.detail.SportDetailLandActivity$refreshOtherChartView$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.detail.SportDetailLandActivity$refreshOtherChartView$1", f = "SportDetailLandActivity.kt", i = {}, l = {346}, m = "invokeSuspend", n = {}, s = {})
    public static final class C18661 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Map<SportRecordKey, List<Object>> $SportRecordMap;
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.detail.SportDetailLandActivity$refreshOtherChartView$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.detail.SportDetailLandActivity$refreshOtherChartView$1$1", f = "SportDetailLandActivity.kt", i = {0, 0}, l = {355}, m = "invokeSuspend", n = {"key", "itemList"}, s = {"L$1", "L$2"})
        public static final class C03891 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Map<SportRecordKey, List<Object>> $SportRecordMap;
            int I$0;
            int I$1;
            Object L$0;
            Object L$1;
            Object L$2;
            int label;
            final /* synthetic */ SportDetailLandActivity this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C03891(SportDetailLandActivity sportDetailLandActivity, Map<SportRecordKey, ? extends List<? extends Object>> map, Continuation<? super C03891> continuation) {
                super(2, continuation);
                this.this$0 = sportDetailLandActivity;
                this.$SportRecordMap = map;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C03891(this.this$0, this.$SportRecordMap, continuation);
            }

            /* JADX WARN: Code duplicated, block: B:11:0x0038  */
            /* JADX WARN: Code duplicated, block: B:13:0x004d  */
            /* JADX WARN: Code duplicated, block: B:15:0x0053  */
            /* JADX WARN: Code duplicated, block: B:26:0x00a3 A[RETURN] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0051 -> B:55:0x0169). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0059 -> B:55:0x0169). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0061 -> B:55:0x0169). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x006f -> B:55:0x0169). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00a1 -> B:6:0x001f). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final java.lang.Object invokeSuspend(java.lang.Object r15) {
                /*
                    Method dump skipped, instruction units count: 429
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.fitness.detail.SportDetailLandActivity.C18661.C03891.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C03891) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C18661(Map<SportRecordKey, ? extends List<? extends Object>> map, Continuation<? super C18661> continuation) {
            super(2, continuation);
            this.$SportRecordMap = map;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SportDetailLandActivity.this.new C18661(this.$SportRecordMap, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MainCoroutineDispatcher main = Dispatchers.getMain();
                C03891 c03891 = new C03891(SportDetailLandActivity.this, this.$SportRecordMap, null);
                this.label = 1;
                if (BuildersKt.withContext(main, c03891, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C18661) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    private final int computeDisplayNumber(int size) {
        SportRecordChartRecyclerView sportRecordChartRecyclerView = this.lineRecyclerView;
        if (sportRecordChartRecyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("lineRecyclerView");
            sportRecordChartRecyclerView = null;
        }
        int iA = (int) (sportRecordChartRecyclerView.a() / 20);
        return size > iA ? iA : size;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<SportRecordItem> getChartListByType(SportRecordKey key, List<SportRecordItem> list, int duration) {
        switch (WhenMappings.$EnumSwitchMapping$0[key.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                ArrayList arrayList = new ArrayList();
                long j = 0;
                for (SportRecordItem sportRecordItem : list) {
                    long startTime = sportRecordItem.getStartTime();
                    long endTime = sportRecordItem.getEndTime();
                    for (long j2 = startTime; j2 < endTime; j2++) {
                        ListExtKt.add(arrayList, new SportRecordItem(startTime, endTime, sportRecordItem.getValue(), 0, 0, 24, null));
                    }
                    j = endTime;
                }
                int size = arrayList.size();
                if (size <= duration && this.mDetailSportType == -1 && size <= duration) {
                    while (true) {
                        long j3 = j + ((long) size);
                        long j4 = j;
                        ListExtKt.add(arrayList, new SportRecordItem(j3, j3 + 1, 0, 0, 0, 24, null));
                        if (size != duration) {
                            size++;
                            j = j4;
                        }
                    }
                }
                return arrayList;
            default:
                return list;
        }
    }

    private final void initLineRecyclerView() {
        SportRecordChartRecyclerView sportRecordChartRecyclerView = this.lineRecyclerView;
        if (sportRecordChartRecyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("lineRecyclerView");
            sportRecordChartRecyclerView = null;
        }
        sportRecordChartRecyclerView.post(new Runnable() { // from class: khn
            @Override // java.lang.Runnable
            public final void run() {
                SportDetailLandActivity.initLineRecyclerView$lambda$6(this.f23856a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void initLineRecyclerView$lambda$6(final SportDetailLandActivity this$0) {
        SportRecordChartRecyclerView sportRecordChartRecyclerView;
        vqr vqrVar;
        vfe vfeVar;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.valueFormatter = new grr();
        SportRecordChartRecyclerView sportRecordChartRecyclerView2 = this$0.lineRecyclerView;
        SpeedRatioLayoutManager speedRatioLayoutManager = null;
        if (sportRecordChartRecyclerView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("lineRecyclerView");
            sportRecordChartRecyclerView2 = null;
        }
        vfe vfeVar2 = (vfe) sportRecordChartRecyclerView2.mAttrs;
        this$0.mBarChartAttrs = vfeVar2;
        if (vfeVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBarChartAttrs");
            vfeVar2 = null;
        }
        this$0.layoutManager = new SpeedRatioLayoutManager(this$0, vfeVar2);
        vfe vfeVar3 = this$0.mBarChartAttrs;
        if (vfeVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBarChartAttrs");
            vfeVar3 = null;
        }
        this$0.mYAxis = new rtr(vfeVar3);
        vfe vfeVar4 = this$0.mBarChartAttrs;
        if (vfeVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBarChartAttrs");
            vfeVar4 = null;
        }
        int i = this$0.displayNumber;
        onq onqVar = this$0.valueFormatter;
        if (onqVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("valueFormatter");
            onqVar = null;
        }
        this$0.mXAxis = new vqr(vfeVar4, i, onqVar);
        rtr rtrVar = this$0.mYAxis;
        if (rtrVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mYAxis");
            rtrVar = null;
        }
        vqr vqrVar2 = this$0.mXAxis;
        if (vqrVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mXAxis");
            vqrVar2 = null;
        }
        vfe vfeVar5 = this$0.mBarChartAttrs;
        if (vfeVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBarChartAttrs");
            vfeVar5 = null;
        }
        this$0.mItemDecoration = new SportLineChartItemDecoration(rtrVar, vqrVar2, vfeVar5);
        SportLandHighLightMarkValueFormatter sportLandHighLightMarkValueFormatter = new SportLandHighLightMarkValueFormatter(0);
        this$0.highLightMarkValueFormatter = sportLandHighLightMarkValueFormatter;
        SportBasicReport sportBasicReport = this$0.mSportReport;
        sportLandHighLightMarkValueFormatter.setSportType(sportBasicReport != null ? Integer.valueOf(sportBasicReport.getSportType()) : null);
        SportLineChartItemDecoration sportLineChartItemDecoration = this$0.mItemDecoration;
        if (sportLineChartItemDecoration == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mItemDecoration");
            sportLineChartItemDecoration = null;
        }
        sportLineChartItemDecoration.setHighLightValueFormatter(this$0.highLightMarkValueFormatter);
        SportRecordChartRecyclerView sportRecordChartRecyclerView3 = this$0.lineRecyclerView;
        if (sportRecordChartRecyclerView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("lineRecyclerView");
            sportRecordChartRecyclerView3 = null;
        }
        SportLineChartItemDecoration sportLineChartItemDecoration2 = this$0.mItemDecoration;
        if (sportLineChartItemDecoration2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mItemDecoration");
            sportLineChartItemDecoration2 = null;
        }
        sportRecordChartRecyclerView3.addItemDecoration(sportLineChartItemDecoration2);
        mt5 mt5Var = new mt5(0);
        List<SportRecordLandEntry> list = this$0.mEntries;
        SportRecordChartRecyclerView sportRecordChartRecyclerView4 = this$0.lineRecyclerView;
        if (sportRecordChartRecyclerView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("lineRecyclerView");
            sportRecordChartRecyclerView = null;
        } else {
            sportRecordChartRecyclerView = sportRecordChartRecyclerView4;
        }
        vqr vqrVar3 = this$0.mXAxis;
        if (vqrVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mXAxis");
            vqrVar = null;
        } else {
            vqrVar = vqrVar3;
        }
        vfe vfeVar6 = this$0.mBarChartAttrs;
        if (vfeVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBarChartAttrs");
            vfeVar = null;
        } else {
            vfeVar = vfeVar6;
        }
        this$0.mBarChartAdapter = new zon<>(this$0, list, sportRecordChartRecyclerView, vqrVar, vfeVar, mt5Var);
        SportRecordChartRecyclerView sportRecordChartRecyclerView5 = this$0.lineRecyclerView;
        if (sportRecordChartRecyclerView5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("lineRecyclerView");
            sportRecordChartRecyclerView5 = null;
        }
        zon<sf2> zonVar = this$0.mBarChartAdapter;
        if (zonVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBarChartAdapter");
            zonVar = null;
        }
        sportRecordChartRecyclerView5.setAdapter(zonVar);
        SportRecordChartRecyclerView sportRecordChartRecyclerView6 = this$0.lineRecyclerView;
        if (sportRecordChartRecyclerView6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("lineRecyclerView");
            sportRecordChartRecyclerView6 = null;
        }
        SpeedRatioLayoutManager speedRatioLayoutManager2 = this$0.layoutManager;
        if (speedRatioLayoutManager2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("layoutManager");
            speedRatioLayoutManager2 = null;
        }
        sportRecordChartRecyclerView6.setLayoutManager(speedRatioLayoutManager2);
        Logger.d("SportRecordLandScapeActivity", "displayNumber: " + this$0.displayNumber);
        SportRecordChartRecyclerView sportRecordChartRecyclerView7 = this$0.lineRecyclerView;
        if (sportRecordChartRecyclerView7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("lineRecyclerView");
            sportRecordChartRecyclerView7 = null;
        }
        iak iakVar = new iak(this$0, sportRecordChartRecyclerView7, new xcm() { // from class: com.xiaomi.fitness.detail.SportDetailLandActivity$initLineRecyclerView$1$itemGestureListener$1
            @Override // defpackage.xcm, defpackage.u8h
            public void onItemSelected(RecyclerBarEntry barEntry, int position) {
                SportRecordLandTitleAdapter sportRecordLandTitleAdapter;
                RecyclerView recyclerView = null;
                if (barEntry != null && barEntry.isSelected()) {
                    RecyclerView recyclerView2 = this.this$0.chartTitleView;
                    if (recyclerView2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("chartTitleView");
                    } else {
                        recyclerView = recyclerView2;
                    }
                    recyclerView.setVisibility(4);
                    return;
                }
                RecyclerView recyclerView3 = this.this$0.chartTitleView;
                if (recyclerView3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("chartTitleView");
                    recyclerView3 = null;
                }
                if (recyclerView3.getVisibility() == 4 && (sportRecordLandTitleAdapter = this.this$0.chartTitleAdapter) != null) {
                    sportRecordLandTitleAdapter.setChartTitleClickValid(false);
                }
                RecyclerView recyclerView4 = this.this$0.chartTitleView;
                if (recyclerView4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("chartTitleView");
                } else {
                    recyclerView = recyclerView4;
                }
                recyclerView.setVisibility(0);
            }
        });
        SportRecordChartRecyclerView sportRecordChartRecyclerView8 = this$0.lineRecyclerView;
        if (sportRecordChartRecyclerView8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("lineRecyclerView");
            sportRecordChartRecyclerView8 = null;
        }
        sportRecordChartRecyclerView8.addOnItemTouchListener(iakVar);
        SportRecordChartRecyclerView sportRecordChartRecyclerView9 = this$0.lineRecyclerView;
        if (sportRecordChartRecyclerView9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("lineRecyclerView");
            sportRecordChartRecyclerView9 = null;
        }
        sportRecordChartRecyclerView9.setOnChartClickListener(new SportRecordChartRecyclerView.b() { // from class: fhn
            @Override // com.xiaomi.fitness.chart.view.SportRecordChartRecyclerView.b
            public final void a(float f, float f2) {
                SportDetailLandActivity.initLineRecyclerView$lambda$6$lambda$1(this.f17793a, f, f2);
            }
        });
        SpeedRatioLayoutManager speedRatioLayoutManager3 = this$0.layoutManager;
        if (speedRatioLayoutManager3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("layoutManager");
            speedRatioLayoutManager3 = null;
        }
        speedRatioLayoutManager3.l(0.0d);
        SpeedRatioLayoutManager speedRatioLayoutManager4 = this$0.layoutManager;
        if (speedRatioLayoutManager4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("layoutManager");
        } else {
            speedRatioLayoutManager = speedRatioLayoutManager4;
        }
        speedRatioLayoutManager.c = 0.0d;
        ((SportRecordDetailViewModel) this$0.getMViewModel()).getGPSAndRecordData(this$0.mSportReport);
        int i2 = this$0.mDetailSportType;
        if (i2 == -1) {
            ((SportRecordDetailViewModel) this$0.getMViewModel()).getRecordDetailMaps().observe(this$0, new SportDetailLandActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: ghn
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return SportDetailLandActivity.initLineRecyclerView$lambda$6$lambda$2(this.f19009a, (Map) obj);
                }
            }));
            return;
        }
        if (i2 == 0) {
            ((SportRecordDetailViewModel) this$0.getMViewModel()).getRecordTriathlonDetailMaps().observe(this$0, new SportDetailLandActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: hhn
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return SportDetailLandActivity.initLineRecyclerView$lambda$6$lambda$3(this.f20077a, (Map) obj);
                }
            }));
        } else if (i2 == 1) {
            ((SportRecordDetailViewModel) this$0.getMViewModel()).getRecordTriathlonDetailMaps().observe(this$0, new SportDetailLandActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: ihn
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return SportDetailLandActivity.initLineRecyclerView$lambda$6$lambda$4(this.f21154a, (Map) obj);
                }
            }));
        } else {
            if (i2 != 2) {
                return;
            }
            ((SportRecordDetailViewModel) this$0.getMViewModel()).getRecordTriathlonDetailMaps().observe(this$0, new SportDetailLandActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: jhn
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return SportDetailLandActivity.initLineRecyclerView$lambda$6$lambda$5(this.f22814a, (Map) obj);
                }
            }));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initLineRecyclerView$lambda$6$lambda$1(SportDetailLandActivity this$0, float f, float f2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        int i = (int) (this$0.displayNumber / f);
        this$0.setXAxis(i);
        zon<sf2> zonVar = null;
        if (i != this$0.displayNumber) {
            SpeedRatioLayoutManager speedRatioLayoutManager = this$0.layoutManager;
            if (speedRatioLayoutManager == null) {
                Intrinsics.throwUninitializedPropertyAccessException("layoutManager");
                speedRatioLayoutManager = null;
            }
            speedRatioLayoutManager.l(1.0d);
            SpeedRatioLayoutManager speedRatioLayoutManager2 = this$0.layoutManager;
            if (speedRatioLayoutManager2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("layoutManager");
                speedRatioLayoutManager2 = null;
            }
            speedRatioLayoutManager2.c = 1.0d;
        } else {
            SpeedRatioLayoutManager speedRatioLayoutManager3 = this$0.layoutManager;
            if (speedRatioLayoutManager3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("layoutManager");
                speedRatioLayoutManager3 = null;
            }
            speedRatioLayoutManager3.l(0.0d);
            SpeedRatioLayoutManager speedRatioLayoutManager4 = this$0.layoutManager;
            if (speedRatioLayoutManager4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("layoutManager");
                speedRatioLayoutManager4 = null;
            }
            speedRatioLayoutManager4.c = 0.0d;
        }
        zon<sf2> zonVar2 = this$0.mBarChartAdapter;
        if (zonVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBarChartAdapter");
        } else {
            zonVar = zonVar2;
        }
        zonVar.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initLineRecyclerView$lambda$6$lambda$2(SportDetailLandActivity this$0, Map map) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNull(map);
        this$0.refreshChartRecycleView(map);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initLineRecyclerView$lambda$6$lambda$3(SportDetailLandActivity this$0, Map map) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (map.get(10) != null) {
            this$0.mSportType = 10;
            Object obj = map.get(10);
            Intrinsics.checkNotNull(obj);
            this$0.refreshChartRecycleView((Map) obj);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initLineRecyclerView$lambda$6$lambda$4(SportDetailLandActivity this$0, Map map) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (map.get(6) != null) {
            this$0.mSportType = 6;
            Object obj = map.get(6);
            Intrinsics.checkNotNull(obj);
            this$0.refreshChartRecycleView((Map) obj);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initLineRecyclerView$lambda$6$lambda$5(SportDetailLandActivity this$0, Map map) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (map.get(1) != null) {
            this$0.mSportType = 1;
            Object obj = map.get(1);
            Intrinsics.checkNotNull(obj);
            this$0.refreshChartRecycleView((Map) obj);
        }
        return Unit.INSTANCE;
    }

    private final void initTitleRecycleView() {
        SportBasicReport sportBasicReport = this.mSportReport;
        RecyclerView recyclerView = null;
        Integer numValueOf = sportBasicReport != null ? Integer.valueOf(sportBasicReport.getSportType()) : null;
        Intrinsics.checkNotNull(numValueOf);
        this.chartTitleAdapter = new SportRecordLandTitleAdapter(this, numValueOf.intValue());
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 5);
        RecyclerView recyclerView2 = this.chartTitleView;
        if (recyclerView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("chartTitleView");
            recyclerView2 = null;
        }
        recyclerView2.setLayoutManager(gridLayoutManager);
        SportRecordLandTitleAdapter sportRecordLandTitleAdapter = this.chartTitleAdapter;
        if (sportRecordLandTitleAdapter != null) {
            sportRecordLandTitleAdapter.setOnTitleItemClickListener(new SportRecordLandTitleAdapter.OnTitleItemClickListener() { // from class: com.xiaomi.fitness.detail.SportDetailLandActivity.initTitleRecycleView.1
                @Override // com.xiaomi.fitness.detail.recycler.SportRecordLandTitleAdapter.OnTitleItemClickListener
                public void onClick(int position, boolean changeStatus) {
                    SportRecordKey sportRecordKey = (SportRecordKey) SportDetailLandActivity.this.chartShowAllKeyList.get(position);
                    if (SportDetailLandActivity.this.chartDataKeyList.contains(sportRecordKey) && !changeStatus) {
                        SportDetailLandActivity.this.chartDataKeyList.remove(sportRecordKey);
                    } else if (!SportDetailLandActivity.this.chartDataKeyList.contains(sportRecordKey) && changeStatus) {
                        SportDetailLandActivity.this.chartDataKeyList.add(sportRecordKey);
                    }
                    SportLineChartItemDecoration sportLineChartItemDecoration = SportDetailLandActivity.this.mItemDecoration;
                    zon zonVar = null;
                    if (sportLineChartItemDecoration == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mItemDecoration");
                        sportLineChartItemDecoration = null;
                    }
                    sportLineChartItemDecoration.setShowRecordKeyList(SportDetailLandActivity.this.chartDataKeyList);
                    SportLandHighLightMarkValueFormatter sportLandHighLightMarkValueFormatter = SportDetailLandActivity.this.highLightMarkValueFormatter;
                    if (sportLandHighLightMarkValueFormatter != null) {
                        sportLandHighLightMarkValueFormatter.setShowRecordKeyList(SportDetailLandActivity.this.chartDataKeyList);
                    }
                    zon zonVar2 = SportDetailLandActivity.this.mBarChartAdapter;
                    if (zonVar2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBarChartAdapter");
                    } else {
                        zonVar = zonVar2;
                    }
                    zonVar.notifyDataSetChanged();
                }
            });
        }
        RecyclerView recyclerView3 = this.chartTitleView;
        if (recyclerView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("chartTitleView");
        } else {
            recyclerView = recyclerView3;
        }
        recyclerView.setAdapter(this.chartTitleAdapter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$0(SportDetailLandActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void reSizeYAxis(SportRecordYModel mYModel) {
        SportRecordChartRecyclerView sportRecordChartRecyclerView = this.lineRecyclerView;
        zon<sf2> zonVar = null;
        if (sportRecordChartRecyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("lineRecyclerView");
            sportRecordChartRecyclerView = null;
        }
        sportRecordChartRecyclerView.scrollToPosition(0);
        rtr rtrVar = this.mYAxis;
        if (rtrVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mYAxis");
            rtrVar = null;
        }
        rtrVar.f = 3;
        rtr rtrVar2 = this.mYAxis;
        if (rtrVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mYAxis");
            rtrVar2 = null;
        }
        rtrVar2.mAxisMaximum = mYModel.getMaxValue();
        rtr rtrVar3 = this.mYAxis;
        if (rtrVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mYAxis");
            rtrVar3 = null;
        }
        rtrVar3.mAxisMinimum = mYModel.getMinValue();
        int maxValue = (int) ((mYModel.getMaxValue() - mYModel.getMinValue()) / 3);
        rtr rtrVar4 = this.mYAxis;
        if (rtrVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mYAxis");
            rtrVar4 = null;
        }
        rtrVar4.c(3, maxValue);
        SportLineChartItemDecoration sportLineChartItemDecoration = this.mItemDecoration;
        if (sportLineChartItemDecoration == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mItemDecoration");
            sportLineChartItemDecoration = null;
        }
        rtr rtrVar5 = this.mYAxis;
        if (rtrVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mYAxis");
            rtrVar5 = null;
        }
        sportLineChartItemDecoration.setYAxis(rtrVar5);
        zon<sf2> zonVar2 = this.mBarChartAdapter;
        if (zonVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBarChartAdapter");
            zonVar2 = null;
        }
        rtr rtrVar6 = this.mYAxis;
        if (rtrVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mYAxis");
            rtrVar6 = null;
        }
        zonVar2.setYAxis(rtrVar6);
        zon<sf2> zonVar3 = this.mBarChartAdapter;
        if (zonVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBarChartAdapter");
        } else {
            zonVar = zonVar3;
        }
        zonVar.notifyDataSetChanged();
    }

    private final void refreshChartRecycleView(Map<SportRecordKey, ? extends List<? extends Object>> recordMap) {
        refreshFirstChartView(recordMap);
        refreshChartTitleView(recordMap);
        refreshOtherChartView(recordMap);
    }

    private final void refreshChartTitleView(Map<SportRecordKey, ? extends List<? extends Object>> SportRecordMap) {
        Integer avgResistance;
        Integer avgCycleCadence;
        Integer avgPower;
        this.chartShowAllKeyList.clear();
        for (SportRecordKey sportRecordKey : SportRecordKey.values()) {
            if (SportRecordMap.containsKey(sportRecordKey)) {
                SportRecordChatUtil sportRecordChatUtil = SportRecordChatUtil.INSTANCE;
                if (sportRecordChatUtil.chartSportLineKey(sportRecordKey, this.mSportType, this.mSportReport) || sportRecordChatUtil.chartSportPointKey(sportRecordKey)) {
                    Integer num = this.mSportType;
                    if (num != null && num.intValue() == 7 && this.mSportReport != null) {
                        switch (WhenMappings.$EnumSwitchMapping$0[sportRecordKey.ordinal()]) {
                            case 8:
                                this.chartShowAllKeyList.add(sportRecordKey);
                                break;
                            case 9:
                                SportReportComputeUtil sportReportComputeUtil = SportReportComputeUtil.INSTANCE;
                                SportBasicReport sportBasicReport = this.mSportReport;
                                Intrinsics.checkNotNull(sportBasicReport);
                                Float avgSpeed = sportReportComputeUtil.getAvgSpeed(sportBasicReport);
                                if ((avgSpeed != null ? avgSpeed.floatValue() : 0.0f) > 0.0f) {
                                    this.chartShowAllKeyList.add(sportRecordKey);
                                }
                                break;
                            case 10:
                                SportBasicReport sportBasicReport2 = this.mSportReport;
                                if (sportBasicReport2 != null && (avgResistance = sportBasicReport2.getAvgResistance()) != null && avgResistance.intValue() > 0) {
                                    this.chartShowAllKeyList.add(sportRecordKey);
                                }
                                break;
                            case 11:
                                SportBasicReport sportBasicReport3 = this.mSportReport;
                                if (sportBasicReport3 != null && (avgCycleCadence = sportBasicReport3.getAvgCycleCadence()) != null && avgCycleCadence.intValue() > 0) {
                                    this.chartShowAllKeyList.add(sportRecordKey);
                                }
                                break;
                            case 12:
                                SportBasicReport sportBasicReport4 = this.mSportReport;
                                if (sportBasicReport4 != null && (avgPower = sportBasicReport4.getAvgPower()) != null && avgPower.intValue() > 0) {
                                    this.chartShowAllKeyList.add(sportRecordKey);
                                }
                                break;
                            default:
                                Logger.i("refreshChartTitleView", "BIKING_INDOOR NOT SUPPORT KEY " + sportRecordKey);
                                break;
                        }
                    } else {
                        this.chartShowAllKeyList.add(sportRecordKey);
                    }
                }
            }
        }
        SportRecordLandTitleAdapter sportRecordLandTitleAdapter = this.chartTitleAdapter;
        if (sportRecordLandTitleAdapter != null) {
            SportRecordKey sportRecordKey2 = this.mSportRecordKey;
            Intrinsics.checkNotNull(sportRecordKey2);
            sportRecordLandTitleAdapter.setFirstChartRecordKey(sportRecordKey2);
        }
        SportRecordLandTitleAdapter sportRecordLandTitleAdapter2 = this.chartTitleAdapter;
        if (sportRecordLandTitleAdapter2 != null) {
            sportRecordLandTitleAdapter2.setEnableClickList(this.chartShowAllKeyList);
        }
        SportRecordLandTitleAdapter sportRecordLandTitleAdapter3 = this.chartTitleAdapter;
        if (sportRecordLandTitleAdapter3 != null) {
            sportRecordLandTitleAdapter3.notifyDataSetChanged();
        }
    }

    private final void refreshFirstChartView(Map<SportRecordKey, ? extends List<? extends Object>> SportRecordMap) {
        vfe vfeVar;
        SportBasicReport sportBasicReport = this.mSportReport;
        zon<sf2> zonVar = null;
        Long lValueOf = sportBasicReport != null ? Long.valueOf(sportBasicReport.getTimeStamp()) : null;
        Intrinsics.checkNotNull(lValueOf);
        long jLongValue = lValueOf.longValue();
        Intrinsics.checkNotNull(SportRecordMap, "null cannot be cast to non-null type kotlin.collections.MutableMap<com.xiaomi.fit.data.common.data.sport.SportRecordKey, kotlin.collections.List<kotlin.Any>>");
        Map mapAsMutableMap = TypeIntrinsics.asMutableMap(SportRecordMap);
        SportBasicReport sportBasicReport2 = this.mSportReport;
        Intrinsics.checkNotNull(sportBasicReport2);
        SportDetailGpsFragmentKt.processRecordData(mapAsMutableMap, sportBasicReport2);
        SportRecordKey sportRecordKey = this.mSportRecordKey;
        if (sportRecordKey == null || !SportRecordMap.containsKey(sportRecordKey)) {
            return;
        }
        Collection collection = SportRecordMap.get(this.mSportRecordKey);
        Intrinsics.checkNotNull(collection, "null cannot be cast to non-null type kotlin.collections.List<com.xiaomi.fit.data.common.data.sport.SportRecordItem>");
        SportRecordKey sportRecordKey2 = this.mSportRecordKey;
        Intrinsics.checkNotNull(sportRecordKey2);
        SportBasicReport sportBasicReport3 = this.mSportReport;
        Intrinsics.checkNotNull(sportBasicReport3);
        this.list = getChartListByType(sportRecordKey2, (List) collection, sportBasicReport3.getDuration());
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), Dispatchers.getIO(), null, new C18651(null), 2, null);
        int iCoerceAtMost = RangesKt___RangesKt.coerceAtMost(this.list.size(), this.maxDisplayNumber);
        this.displayNumber = iCoerceAtMost;
        setXAxis(iCoerceAtMost);
        if (this.displayNumber == 0) {
            return;
        }
        this.chartListSize = this.list.size();
        int size = this.list.size() / this.displayNumber;
        this.distance = size;
        float f = 60.0f / ((float) size) >= 1.0f ? 60.0f / size : 1.0f;
        SportRecordChartRecyclerView sportRecordChartRecyclerView = this.lineRecyclerView;
        if (sportRecordChartRecyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("lineRecyclerView");
            sportRecordChartRecyclerView = null;
        }
        sportRecordChartRecyclerView.i = this.displayNumber / f;
        this.mEntries.clear();
        SportRecordDataUtil sportRecordDataUtil = SportRecordDataUtil.INSTANCE;
        vfe vfeVar2 = this.mBarChartAttrs;
        if (vfeVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBarChartAttrs");
            vfeVar = null;
        } else {
            vfeVar = vfeVar2;
        }
        List<SportRecordItem> list = this.list;
        int size2 = this.mEntries.size();
        int i = this.displayNumber;
        int i2 = this.distance;
        SportRecordKey sportRecordKey3 = this.mSportRecordKey;
        Intrinsics.checkNotNull(sportRecordKey3);
        List<SportRecordLandEntry> listCreateDataLineEntries = sportRecordDataUtil.createDataLineEntries(vfeVar, list, jLongValue, size2, i, i2, sportRecordKey3);
        SportBasicReport sportBasicReport4 = this.mSportReport;
        if ((sportBasicReport4 != null ? sportBasicReport4.getDuration() : 0) > this.list.size() - 1) {
            SportRecordLandEntry sportRecordLandEntry = (SportRecordLandEntry) CollectionsKt___CollectionsKt.last((List) listCreateDataLineEntries);
            SportItemModel sportItemModel = (SportItemModel) CollectionsKt___CollectionsKt.last((List) sportRecordLandEntry.getDataItem().getListValue());
            SportItemModel sportItemModel2 = new SportItemModel(sportItemModel.getItemChartValue(), sportItemModel.getItemValue(), sportItemModel.getItemTime() + 1);
            sportRecordLandEntry.timestamp++;
            ListExtKt.add(sportRecordLandEntry.getDataItem().getListValue(), sportItemModel2);
        }
        SportLandHighLightMarkValueFormatter sportLandHighLightMarkValueFormatter = this.highLightMarkValueFormatter;
        if (sportLandHighLightMarkValueFormatter != null) {
            sportLandHighLightMarkValueFormatter.setShowRecordKeyList(this.chartDataKeyList);
        }
        this.mEntries.addAll(listCreateDataLineEntries);
        zon<sf2> zonVar2 = this.mBarChartAdapter;
        if (zonVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBarChartAdapter");
        } else {
            zonVar = zonVar2;
        }
        zonVar.notifyDataSetChanged();
    }

    private final void refreshOtherChartView(Map<SportRecordKey, ? extends List<? extends Object>> SportRecordMap) {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), Dispatchers.getIO(), null, new C18661(SportRecordMap, null), 2, null);
    }

    private final void setXAxis(int displayNumber) {
        vfe vfeVar = this.mBarChartAttrs;
        vqr vqrVar = null;
        if (vfeVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBarChartAttrs");
            vfeVar = null;
        }
        this.mXAxis = new vqr(vfeVar, displayNumber);
        zon<sf2> zonVar = this.mBarChartAdapter;
        if (zonVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBarChartAdapter");
            zonVar = null;
        }
        vqr vqrVar2 = this.mXAxis;
        if (vqrVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mXAxis");
        } else {
            vqrVar = vqrVar2;
        }
        zonVar.setXAxis(vqrVar);
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseActivity
    public boolean enablePadOrientationRotate() {
        return false;
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return ivi.d;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return -1;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("");
        setActionBarDisplayable(false);
        getWindow().getDecorView().setSystemUiVisibility(4);
        if (SettingsPropertiesUtil.INSTANCE.isFoldDisplayAndFolded()) {
            setRequestedOrientation(0);
        }
        this.mSportReport = (SportBasicReport) getIntent().getSerializableExtra("sport_report");
        this.mSportRecordKey = (SportRecordKey) getIntent().getSerializableExtra(SportRecordBundleKey.BUNDLE_PARAMS_SPORT_RECORD_KEY);
        this.mDetailSportType = getIntent().getIntExtra(SportRecordBundleKey.BUNDLE_PARAMS_SPORT_DETAIL_TYPE, -1);
        SportBasicReport sportBasicReport = this.mSportReport;
        this.mSportType = sportBasicReport != null ? Integer.valueOf(sportBasicReport.getSportType()) : null;
        this.lineRecyclerView = getMBinding().C;
        this.allChartView = getMBinding().A;
        this.chartTitleView = getMBinding().D;
        getMBinding().B.setOnClickListener(new View.OnClickListener() { // from class: lhn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SportDetailLandActivity.onCreate$lambda$0(this.f25084a, view);
            }
        });
        initTitleRecycleView();
        initLineRecyclerView();
    }
}
