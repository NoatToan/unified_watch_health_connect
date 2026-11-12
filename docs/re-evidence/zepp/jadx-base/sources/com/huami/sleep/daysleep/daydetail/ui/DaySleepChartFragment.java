package com.huami.sleep.daysleep.daydetail.ui;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentTransaction;
import androidx.p008lifecycle.LifecycleOwnerKt;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelStoreOwner;
import androidx.p012savedstate.SavedStateRegistryOwner;
import com.amap.api.mapcore.util.hl;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.chart.data.ChartDataList;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.mifit.analytics.monitor.ExposureAnalyticsKt;
import com.huami.moving.ui.utils.SportAnalytics;
import com.huami.sleep.R;
import com.huami.sleep.baseui.LazyFragment;
import com.huami.sleep.daysleep.breath.BreathQualityViewForDay;
import com.huami.sleep.daysleep.breath.BreathQualityViewForDayForeign;
import com.huami.sleep.daysleep.daydetail.helper.SlpCompareChartHelper;
import com.huami.sleep.daysleep.daydetail.ui.DaySleepChartFragment;
import com.huami.sleep.daysleep.daydetail.viewmodel.DaySleepViewModel;
import com.huami.sleep.daysleep.daydetail.vo.SleepShowData;
import com.huami.sleep.daysleep.model.SleepPosInfo;
import com.huami.sleep.daysleep.model.SlpWeekSummary;
import com.huami.sleep.daysleep.quotient.view.SleepQuotientView;
import com.huami.sleep.daysleep.sleepstagechart.ui.SleepStageChartFragment;
import com.huami.sleep.daysleep.tonality.SleepTonalityFragment;
import com.huami.sleep.ext.KoinExtKt;
import com.huami.sleep.ext.ViewExKt;
import com.huami.sleep.koin.IDeviceManager;
import com.huami.sleep.koin.ISleepDataManager;
import com.huami.sleep.napsleep.ui.NapSleepDetailActivity;
import com.huami.sleep.sleephome.viewmodel.SleepHomeViewModel;
import com.huami.sleep.sleephome.vo.RightSelectShowInfo;
import com.huami.sleep.sleepstatefeel.ui.DaySleepStateFeelFragment;
import com.huami.sleep.statistic.dto.TimeMode;
import com.huami.sleep.statistic.sleepanalysis.vo.SleepAnalysisVo;
import com.huami.sleep.ui.breathquality.BreathQualityActivity;
import com.huami.sleep.util.ExteranelKt;
import com.huami.sleep.util.NumberFormatter;
import com.huami.sleep.util.SleepDataUtil;
import com.huami.sleep.util.SleepStatusAnalytics;
import com.huami.sleep.util.SleepTextSpanUtil;
import com.huami.sleep.util.SleepTimeUtil;
import com.huami.sleep.util.TimeShowUtilsKt;
import com.huami.sleep.view.SleepPosCircleView;
import com.huami.sleep.view.UnitTextView;
import com.huami.snore.core.helper.SnoreHelper;
import com.huami.snore.ui.activity.SnoreListActivity;
import com.huami.snore.ui.dialog.Builder;
import com.huami.snore.ui.dialog.SnoreNormalDialog;
import com.huami.snore.ui.viewmodel.SnoreListViewModel;
import com.huami.tools.log.HMLog;
import com.huami.widget.typeface.TypefaceTextView;
import com.loc.z;
import com.xiaomi.hm.health.baseutil.GlobalConfig;
import com.xiaomi.hm.health.dataprocess.SleepInfo;
import com.xiaomi.hm.health.dataprocess.SportDay;
import java.util.Map;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Delegates;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import kotlinx.coroutines.FlowPreview;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.androidx.viewmodel.ext.android.ComponentCallbackExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes13.dex */
@FlowPreview
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\b\u0007\u0018\u0000 S2\u00020\u0001:\u0001SB\u0007¢\u0006\u0004\bQ\u0010RJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u0012\u0010\u0006\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0004H\u0002J\b\u0010\b\u001a\u00020\u0004H\u0002J\b\u0010\t\u001a\u00020\u0004H\u0002J\b\u0010\n\u001a\u00020\u0004H\u0002J\b\u0010\u000b\u001a\u00020\u0004H\u0002J\b\u0010\f\u001a\u00020\u0004H\u0002J\u0018\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\u0010\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0010\u0010\u0016\u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014J\u0012\u0010\u0019\u001a\u00020\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016J\b\u0010\u001a\u001a\u00020\u0004H\u0016J\b\u0010\u001b\u001a\u00020\u0004H\u0016J\b\u0010\u001c\u001a\u00020\u0004H\u0016J\u001a\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016R\u0016\u0010#\u001a\u00020 8\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010&\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010)\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010-\u001a\u00020*8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010/\u001a\u00020 8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b.\u0010\"R+\u00108\u001a\u0002002\u0006\u00101\u001a\u0002008B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u0016\u0010:\u001a\u00020 8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b9\u0010\"R\u001d\u0010@\u001a\u00020;8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u001d\u0010E\u001a\u00020A8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bB\u0010=\u001a\u0004\bC\u0010DR\u001d\u0010J\u001a\u00020F8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bG\u0010=\u001a\u0004\bH\u0010IR\"\u0010M\u001a\u00020K8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bL\u0010\u0011\u001a\u0004\bM\u0010N\"\u0004\bO\u0010P¨\u0006T"}, d2 = {"Lcom/huami/sleep/daysleep/daydetail/ui/DaySleepChartFragment;", "Lcom/huami/sleep/baseui/LazyFragment;", "Lcom/xiaomi/hm/health/dataprocess/SleepInfo;", "sleepInfo", "", "R", "b0", ExifInterface.GPS_DIRECTION_TRUE, "W", "t", "X", "V", "P", "Lcom/huami/sleep/daysleep/daydetail/vo/SleepShowData;", "data", "Lcom/huami/sleep/daysleep/model/SlpWeekSummary;", "recentWeekSummery", "Z", "Q", "a0", "Landroid/graphics/Bitmap;", SportAnalytics.ParamValue.MapButtonType.MAP, "setmPosBitmap", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "onResume", "lazyInit", "visibleAfterLoaded", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "", GoogleApiAvailabilityLight.a, "Ljava/lang/String;", "mTag", "e", "Landroid/graphics/Bitmap;", "mPosBitmap", "f", "Lcom/xiaomi/hm/health/dataprocess/SleepInfo;", "mSleepInfo", "Landroid/content/Context;", "g", "Landroid/content/Context;", "mContext", "h", "mKey", "", "<set-?>", "i", "Lkotlin/properties/ReadWriteProperty;", "L", "()I", ExifInterface.LATITUDE_SOUTH, "(I)V", "mPosition", z.j, "mUserId", "Lcom/huami/snore/ui/viewmodel/SnoreListViewModel;", hl.k, "Lkotlin/Lazy;", "O", "()Lcom/huami/snore/ui/viewmodel/SnoreListViewModel;", "mSnoreViewModel", "Lcom/huami/sleep/daysleep/daydetail/viewmodel/DaySleepViewModel;", "l", "M", "()Lcom/huami/sleep/daysleep/daydetail/viewmodel/DaySleepViewModel;", "mSleepViewModel", "Lcom/huami/sleep/daysleep/daydetail/helper/SlpCompareChartHelper;", "m", "N", "()Lcom/huami/sleep/daysleep/daydetail/helper/SlpCompareChartHelper;", "mSlpCompareChartHelp", "", GoogleApiAvailabilityLight.b, "isAllMaunualSlp", "()Z", "setAllMaunualSlp", "(Z)V", "<init>", "()V", "Companion", "sleep_release"}, k = 1, mv = {1, 5, 1})
@ExperimentalCoroutinesApi
public final class DaySleepChartFragment extends LazyFragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final /* synthetic */ KProperty<Object>[] o;

    @NotNull
    private static final String p = "position";

    @NotNull
    private static final String q = "user_id";

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final String mTag;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private Bitmap mPosBitmap;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    private SleepInfo mSleepInfo;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private Context mContext;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private String mKey;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final ReadWriteProperty mPosition;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private String mUserId;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    private final Lazy mSnoreViewModel;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    private final Lazy mSleepViewModel;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    private final Lazy mSlpCompareChartHelp;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private boolean isAllMaunualSlp;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007R\u0016\u0010\b\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\n\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\t¨\u0006\r"}, d2 = {"Lcom/huami/sleep/daysleep/daydetail/ui/DaySleepChartFragment$Companion;", "", "", "userId", "", "position", "Lcom/huami/sleep/daysleep/daydetail/ui/DaySleepChartFragment;", "newInstance", "ARG_POSITION", "Ljava/lang/String;", "ARG_USER_ID", "<init>", "()V", "sleep_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final DaySleepChartFragment newInstance(@NotNull String userId, int position) {
            DaySleepChartFragment daySleepChartFragment = new DaySleepChartFragment();
            Bundle bundle = new Bundle();
            bundle.putString("user_id", userId);
            bundle.putInt("position", position);
            daySleepChartFragment.setArguments(bundle);
            return daySleepChartFragment;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/sleep/daysleep/daydetail/helper/SlpCompareChartHelper;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<SlpCompareChartHelper> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SlpCompareChartHelper invoke() {
            return new SlpCompareChartHelper(DaySleepChartFragment.this.requireContext(), DaySleepChartFragment.this.mPosBitmap);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            String str = DaySleepChartFragment.this.mKey;
            Objects.requireNonNull(str);
            return "refreshUi : " + str;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.sleep.daysleep.daydetail.ui.DaySleepChartFragment$refreshUi$3", f = "DaySleepChartFragment.kt", i = {0}, l = {116}, m = "invokeSuspend", n = {"recentWeekSummery"}, s = {"L$1"})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public Object a;
        public Object b;
        public int c;
        public final /* synthetic */ SleepInfo d;
        public final /* synthetic */ DaySleepChartFragment e;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/sleep/daysleep/model/SlpWeekSummary;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.sleep.daysleep.daydetail.ui.DaySleepChartFragment$refreshUi$3$1", f = "DaySleepChartFragment.kt", i = {}, l = {117}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super SlpWeekSummary>, Object> {
            public int a;
            public final /* synthetic */ DaySleepChartFragment b;
            public final /* synthetic */ SlpWeekSummary c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(DaySleepChartFragment daySleepChartFragment, SlpWeekSummary slpWeekSummary, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = daySleepChartFragment;
                this.c = slpWeekSummary;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new a(this.b, this.c, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super SlpWeekSummary> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    SlpWeekSummary.Companion companion = SlpWeekSummary.INSTANCE;
                    String str = this.b.mUserId;
                    Objects.requireNonNull(str);
                    SlpWeekSummary slpWeekSummary = this.c;
                    this.a = 1;
                    obj = companion.fillWeekSummary(str, slpWeekSummary, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return obj;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(SleepInfo sleepInfo, DaySleepChartFragment daySleepChartFragment, Continuation<? super c> continuation) {
            super(2, continuation);
            this.d = sleepInfo;
            this.e = daySleepChartFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new c(this.d, this.e, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            SleepShowData sleepShowData;
            SlpWeekSummary slpWeekSummary;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.c;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                sleepShowData = SleepDataUtil.INSTANCE.parse2Sleep(this.d);
                String str = this.e.mKey;
                Objects.requireNonNull(str);
                SportDay preDay = SportDay.fromString(str).getPreDay();
                SlpWeekSummary slpWeekSummary2 = new SlpWeekSummary();
                slpWeekSummary2.setWeekStartDate(preDay.addDay(-6).getKey());
                slpWeekSummary2.setWeekEndDate(preDay.getKey());
                CoroutineDispatcher io2 = Dispatchers.getIO();
                a aVar = new a(this.e, slpWeekSummary2, null);
                this.a = sleepShowData;
                this.b = slpWeekSummary2;
                this.c = 1;
                if (BuildersKt.withContext(io2, aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                slpWeekSummary = slpWeekSummary2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                slpWeekSummary = (SlpWeekSummary) this.b;
                sleepShowData = (SleepShowData) this.a;
                ResultKt.throwOnFailure(obj);
            }
            this.e.Z(sleepShowData, slpWeekSummary);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public static final d a = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "refreshUi error!";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/view/View;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function1<View, Unit> {
        public e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull View view) {
            DaySleepChartFragment.this.P();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/view/View;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function1<View, Unit> {
        public f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull View view) {
            SnoreListActivity.Companion companion = SnoreListActivity.INSTANCE;
            Context context = DaySleepChartFragment.this.mContext;
            Objects.requireNonNull(context);
            SleepTimeUtil sleepTimeUtil = SleepTimeUtil.INSTANCE;
            String str = DaySleepChartFragment.this.mKey;
            Objects.requireNonNull(str);
            companion.navigation(context, sleepTimeUtil.timeStrToDate(str));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/view/View;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function1<View, Unit> {
        public g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull View view) {
            Context context = DaySleepChartFragment.this.getContext();
            if (context == null) {
                return;
            }
            DaySleepChartFragment daySleepChartFragment = DaySleepChartFragment.this;
            BreathQualityActivity.Companion companion = BreathQualityActivity.INSTANCE;
            String str = daySleepChartFragment.mUserId;
            Objects.requireNonNull(str);
            int value = TimeMode.DAY.getValue();
            SleepTimeUtil sleepTimeUtil = SleepTimeUtil.INSTANCE;
            String str2 = daySleepChartFragment.mKey;
            Objects.requireNonNull(str2);
            companion.navigation(context, str, value, sleepTimeUtil.getDayStartTime(SportDay.fromString(str2).getTimestamp()));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/view/View;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function1<View, Unit> {
        public h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull View view) {
            Context context = DaySleepChartFragment.this.getContext();
            if (context == null) {
                return;
            }
            DaySleepChartFragment daySleepChartFragment = DaySleepChartFragment.this;
            BreathQualityActivity.Companion companion = BreathQualityActivity.INSTANCE;
            String str = daySleepChartFragment.mUserId;
            Objects.requireNonNull(str);
            int value = TimeMode.DAY.getValue();
            SleepTimeUtil sleepTimeUtil = SleepTimeUtil.INSTANCE;
            String str2 = daySleepChartFragment.mKey;
            Objects.requireNonNull(str2);
            companion.navigation(context, str, value, sleepTimeUtil.getDayStartTime(SportDay.fromString(str2).getTimestamp()));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.sleep.daysleep.daydetail.ui.DaySleepChartFragment$updateSleepPosUi$1", f = "DaySleepChartFragment.kt", i = {0}, l = {137}, m = "invokeSuspend", n = {"isEarbud"}, s = {"L$0"})
    public static final class i extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public Object a;
        public int b;
        public final /* synthetic */ SleepInfo c;
        public final /* synthetic */ DaySleepChartFragment d;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.sleep.daysleep.daydetail.ui.DaySleepChartFragment$updateSleepPosUi$1$1", f = "DaySleepChartFragment.kt", i = {}, l = {138}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public Object a;
            public int b;
            public final /* synthetic */ Ref.BooleanRef c;
            public final /* synthetic */ DaySleepChartFragment d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Ref.BooleanRef booleanRef, DaySleepChartFragment daySleepChartFragment, Continuation<? super a> continuation) {
                super(2, continuation);
                this.c = booleanRef;
                this.d = daySleepChartFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new a(this.c, this.d, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Ref.BooleanRef booleanRef;
                Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                int i = this.b;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Ref.BooleanRef booleanRef2 = this.c;
                    IDeviceManager deviceManager = KoinExtKt.getDeviceManager();
                    String str = this.d.mUserId;
                    Objects.requireNonNull(str);
                    String str2 = this.d.mKey;
                    Objects.requireNonNull(str2);
                    this.a = booleanRef2;
                    this.b = 1;
                    Object objIsEarbud = deviceManager.isEarbud(str, str2, this);
                    if (objIsEarbud == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    booleanRef = booleanRef2;
                    obj = objIsEarbud;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    booleanRef = (Ref.BooleanRef) this.a;
                    ResultKt.throwOnFailure(obj);
                }
                booleanRef.element = ((Boolean) obj).booleanValue();
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(SleepInfo sleepInfo, DaySleepChartFragment daySleepChartFragment, Continuation<? super i> continuation) {
            super(2, continuation);
            this.c = sleepInfo;
            this.d = daySleepChartFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new i(this.c, this.d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((i) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:31:0x006b  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Ref.BooleanRef booleanRef;
            boolean zIsSupportMiliSleepHr;
            boolean z;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
                CoroutineDispatcher io2 = Dispatchers.getIO();
                a aVar = new a(booleanRef2, this.d, null);
                this.a = booleanRef2;
                this.b = 1;
                if (BuildersKt.withContext(io2, aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                booleanRef = booleanRef2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                booleanRef = (Ref.BooleanRef) this.a;
                ResultKt.throwOnFailure(obj);
            }
            if (booleanRef.element) {
                SleepInfo sleepInfo = this.c;
                zIsSupportMiliSleepHr = sleepInfo != null && sleepInfo.hasSleepPos();
            } else {
                zIsSupportMiliSleepHr = KoinExtKt.getAppFunctions().isSupportMiliSleepHr();
            }
            if (booleanRef.element) {
                SleepInfo sleepInfo2 = this.c;
                if (sleepInfo2 != null && sleepInfo2.hasSleepPos()) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            View view = this.d.getView();
            ((ConstraintLayout) (view == null ? null : view.findViewById(R.id.sleep_hr_content))).setVisibility(zIsSupportMiliSleepHr ? 0 : 8);
            View view2 = this.d.getView();
            ((LinearLayout) (view2 == null ? null : view2.findViewById(R.id.sleep_pos_content))).setVisibility(z ? 0 : 8);
            if (!zIsSupportMiliSleepHr && !z) {
                return Unit.INSTANCE;
            }
            SleepInfo sleepInfo3 = this.c;
            if (sleepInfo3 != null) {
                DaySleepChartFragment daySleepChartFragment = this.d;
                SleepPosInfo.Companion companion = SleepPosInfo.INSTANCE;
                String str = daySleepChartFragment.mUserId;
                Objects.requireNonNull(str);
                boolean z2 = !booleanRef.element;
                String str2 = daySleepChartFragment.mKey;
                Objects.requireNonNull(str2);
                SleepPosInfo sleepPosInfoFrom = companion.from(str, z2, sleepInfo3, str2);
                String str3 = sleepPosInfoFrom.getAvgHr() + " " + daySleepChartFragment.getString(R.string.unit_bpm);
                View view3 = daySleepChartFragment.getView();
                ((TypefaceTextView) (view3 == null ? null : view3.findViewById(R.id.sleep_avg_hr))).setText(str3);
                if (!z) {
                    return Unit.INSTANCE;
                }
                View view4 = daySleepChartFragment.getView();
                ((TextView) (view4 == null ? null : view4.findViewById(R.id.sleep_most_pos))).setText(sleepPosInfoFrom.getMostPosName());
                View view5 = daySleepChartFragment.getView();
                ((TextView) (view5 == null ? null : view5.findViewById(R.id.turn_over_times))).setText(daySleepChartFragment.getResources().getQuantityString(R.plurals.sleep_turn_over_times, sleepInfo3.getTurnOverCount(), Boxing.boxInt(sleepInfo3.getTurnOverCount())));
                View view6 = daySleepChartFragment.getView();
                ((SleepPosCircleView) (view6 == null ? null : view6.findViewById(R.id.sleep_pos_chart))).setData(sleepPosInfoFrom.getChartItems());
                View view7 = daySleepChartFragment.getView();
                View viewFindViewById = view7 == null ? null : view7.findViewById(R.id.sleep_left_time);
                SleepTimeUtil sleepTimeUtil = SleepTimeUtil.INSTANCE;
                Context context = daySleepChartFragment.mContext;
                Objects.requireNonNull(context);
                ((TextView) viewFindViewById).setText(sleepTimeUtil.formatTime(context, sleepInfo3.getSleepPosOnLeft()));
                View view8 = daySleepChartFragment.getView();
                View viewFindViewById2 = view8 == null ? null : view8.findViewById(R.id.sleep_right_time);
                Context context2 = daySleepChartFragment.mContext;
                Objects.requireNonNull(context2);
                ((TextView) viewFindViewById2).setText(sleepTimeUtil.formatTime(context2, sleepInfo3.getSleepPosOnRight()));
                View view9 = daySleepChartFragment.getView();
                View viewFindViewById3 = view9 == null ? null : view9.findViewById(R.id.sleep_back_time);
                Context context3 = daySleepChartFragment.mContext;
                Objects.requireNonNull(context3);
                ((TextView) viewFindViewById3).setText(sleepTimeUtil.formatTime(context3, sleepInfo3.getSleepPosOnBack()));
                View view10 = daySleepChartFragment.getView();
                View viewFindViewById4 = view10 == null ? null : view10.findViewById(R.id.sleep_stomach_time);
                Context context4 = daySleepChartFragment.mContext;
                Objects.requireNonNull(context4);
                ((TextView) viewFindViewById4).setText(sleepTimeUtil.formatTime(context4, sleepInfo3.getSleepPosOnStomach()));
                View view11 = daySleepChartFragment.getView();
                ((TextView) (view11 == null ? null : view11.findViewById(R.id.sleep_most_tip_title))).setText(sleepPosInfoFrom.getMostPosTitle());
                View view12 = daySleepChartFragment.getView();
                ((TextView) (view12 == null ? null : view12.findViewById(R.id.sleep_most_tip))).setText(sleepPosInfoFrom.getMostPosTip());
                View view13 = daySleepChartFragment.getView();
                ((ImageView) (view13 == null ? null : view13.findViewById(R.id.sleep_pos_img))).setImageResource(sleepPosInfoFrom.getIcon());
                View view14 = daySleepChartFragment.getView();
                ((TextView) (view14 != null ? view14.findViewById(R.id.sleep_most_pos_percent) : null)).setText(daySleepChartFragment.getString(R.string.sleep_most_pos_percent, daySleepChartFragment.getString(R.string.sleep_pos_percent, Boxing.boxInt(sleepPosInfoFrom.getMostPosPercent()))));
            }
            return Unit.INSTANCE;
        }
    }

    static {
        KProperty<Object>[] kPropertyArr = new KProperty[4];
        kPropertyArr[0] = Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(DaySleepChartFragment.class), "mPosition", "getMPosition()I"));
        o = kPropertyArr;
        INSTANCE = new Companion(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DaySleepChartFragment() {
        super(R.layout.fragment_day_slp_chart);
        this.mTag = "DaySleepChartFragment";
        this.mPosition = Delegates.INSTANCE.notNull();
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.huami.sleep.daysleep.daydetail.ui.DaySleepChartFragment$special$$inlined$viewModel$default$1
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
        this.mSnoreViewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<SnoreListViewModel>() { // from class: com.huami.sleep.daysleep.daydetail.ui.DaySleepChartFragment$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.huami.snore.ui.viewmodel.SnoreListViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final SnoreListViewModel invoke() {
                return ComponentCallbackExtKt.getViewModel(this, qualifier, Reflection.getOrCreateKotlinClass(SnoreListViewModel.class), function0, objArr);
            }
        });
        final Function0<ViewModelOwner> function1 = new Function0<ViewModelOwner>() { // from class: com.huami.sleep.daysleep.daydetail.ui.DaySleepChartFragment$special$$inlined$viewModel$default$3
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
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.mSleepViewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<DaySleepViewModel>() { // from class: com.huami.sleep.daysleep.daydetail.ui.DaySleepChartFragment$special$$inlined$viewModel$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.huami.sleep.daysleep.daydetail.viewmodel.DaySleepViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final DaySleepViewModel invoke() {
                return ComponentCallbackExtKt.getViewModel(this, objArr2, Reflection.getOrCreateKotlinClass(DaySleepViewModel.class), function1, objArr3);
            }
        });
        this.mSlpCompareChartHelp = LazyKt__LazyJVMKt.lazy(new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A(DaySleepChartFragment daySleepChartFragment, String str) {
        View view = daySleepChartFragment.getView();
        ((TextView) (view == null ? null : view.findViewById(R.id.slp_into_compare))).setText(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B(DaySleepChartFragment daySleepChartFragment, Boolean bool) {
        View view = daySleepChartFragment.getView();
        ViewExKt.setVisible(view == null ? null : view.findViewById(R.id.slp_deep_compare), bool.booleanValue());
        View view2 = daySleepChartFragment.getView();
        ViewExKt.setVisible(view2 != null ? view2.findViewById(R.id.deep_slp_chart) : null, bool.booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C(DaySleepChartFragment daySleepChartFragment, String str) {
        View view = daySleepChartFragment.getView();
        ((TextView) (view == null ? null : view.findViewById(R.id.slp_deep_compare))).setText(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D(DaySleepChartFragment daySleepChartFragment, Boolean bool) {
        View view = daySleepChartFragment.getView();
        ViewExKt.setVisible(view == null ? null : view.findViewById(R.id.fragment_sleep_detail_part_qa_id), bool.booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E(DaySleepChartFragment daySleepChartFragment, SleepAnalysisVo sleepAnalysisVo) {
        View view = daySleepChartFragment.getView();
        ((TextView) (view == null ? null : view.findViewById(R.id.sleepAnalysisMainTv))).setText(sleepAnalysisVo.getMainTitle());
        View view2 = daySleepChartFragment.getView();
        ((TextView) (view2 != null ? view2.findViewById(R.id.sleepAnalysisSubTv) : null)).setText(sleepAnalysisVo.getSubTitle());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F(DaySleepChartFragment daySleepChartFragment, String str) {
        daySleepChartFragment.getMSleepHomeViewModel().changeSourceName(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G(DaySleepChartFragment daySleepChartFragment, boolean z) {
        View view = daySleepChartFragment.getView();
        ViewExKt.setVisible(view == null ? null : view.findViewById(R.id.snoreLayout), z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void H(DaySleepChartFragment daySleepChartFragment, Boolean bool) {
        View view = daySleepChartFragment.getView();
        ViewExKt.setVisible(view == null ? null : view.findViewById(R.id.sleep_quotient_info), bool.booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I(DaySleepChartFragment daySleepChartFragment, Pair pair) {
        View view = daySleepChartFragment.getView();
        ((SleepQuotientView) (view == null ? null : view.findViewById(R.id.sleep_quotient_info))).setValue(pair);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J(DaySleepChartFragment daySleepChartFragment, SleepInfo sleepInfo) {
        daySleepChartFragment.mSleepInfo = sleepInfo;
        daySleepChartFragment.R(sleepInfo);
        daySleepChartFragment.getMSleepHomeViewModel().updateCurrentSportData(daySleepChartFragment.L(), daySleepChartFragment.mSleepInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void K(DaySleepChartFragment daySleepChartFragment, Integer num) {
        View view = daySleepChartFragment.getView();
        View viewFindViewById = view == null ? null : view.findViewById(R.id.snore_num);
        Context context = daySleepChartFragment.mContext;
        Objects.requireNonNull(context);
        ((TypefaceTextView) viewFindViewById).setText(context.getResources().getQuantityString(R.plurals.snore_num_segment, num.intValue(), num));
    }

    private final int L() {
        return ((Number) this.mPosition.getValue(this, o[0])).intValue();
    }

    private final DaySleepViewModel M() {
        return (DaySleepViewModel) this.mSleepViewModel.getValue();
    }

    private final SlpCompareChartHelper N() {
        return (SlpCompareChartHelper) this.mSlpCompareChartHelp.getValue();
    }

    private final SnoreListViewModel O() {
        return (SnoreListViewModel) this.mSnoreViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void P() {
        Context context = getContext();
        if (context == null) {
            return;
        }
        NapSleepDetailActivity.Companion companion = NapSleepDetailActivity.INSTANCE;
        String str = this.mKey;
        Objects.requireNonNull(str);
        String str2 = this.mUserId;
        Objects.requireNonNull(str2);
        companion.launch(context, str, str2);
    }

    private final void Q(SlpWeekSummary recentWeekSummery) {
        if (this.mSleepInfo == null) {
            View view = getView();
            ((LinearLayout) (view == null ? null : view.findViewById(R.id.fragment_sleep_detail_part_law_id))).setVisibility(8);
        } else if (recentWeekSummery.getDaySleep() > 0) {
            int dayIntoSleepTime = recentWeekSummery.getDayIntoSleepTime();
            int dayWakeUpTime = recentWeekSummery.getDayWakeUpTime();
            int dayDeepSleep = recentWeekSummery.getDayDeepSleep();
            int daySleep = recentWeekSummery.getDaySleep();
            int sleepCount = this.mSleepInfo.getSleepCount();
            int nonRemCount = this.mSleepInfo.getNonRemCount();
            SleepTimeUtil sleepTimeUtil = SleepTimeUtil.INSTANCE;
            String str = this.mKey;
            Objects.requireNonNull(str);
            int timeMinNum = sleepTimeUtil.getTimeMinNum(str, this.mSleepInfo.getStartDate().getTime());
            String str2 = this.mKey;
            Objects.requireNonNull(str2);
            int timeMinNum2 = sleepTimeUtil.getTimeMinNum(str2, this.mSleepInfo.getStopDate().getTime());
            int i2 = dayIntoSleepTime - timeMinNum;
            SleepTextSpanUtil sleepTextSpanUtil = SleepTextSpanUtil.INSTANCE;
            Context context = this.mContext;
            Objects.requireNonNull(context);
            View view2 = getView();
            sleepTextSpanUtil.dataFormatDisplay(context, (TextView) (view2 == null ? null : view2.findViewById(R.id.sleep_detail_part_law_late_sleep_title)), i2, R.string.sleep_3_law_intosleep_usually, R.string.sleep_3_law_intosleep_early_min, R.string.sleep_3_law_intosleep_early_hour, R.string.sleep_3_law_intosleep_later_min, R.string.sleep_3_law_intosleep_later_hour);
            int i3 = dayWakeUpTime - timeMinNum2;
            Context context2 = this.mContext;
            Objects.requireNonNull(context2);
            View view3 = getView();
            sleepTextSpanUtil.dataFormatDisplay(context2, (TextView) (view3 == null ? null : view3.findViewById(R.id.sleep_detail_part_law_early_wake_title)), i3, R.string.sleep_3_law_wakeup_usually, R.string.sleep_3_law_wakeup_early_min, R.string.sleep_3_law_wakeup_early_hour, R.string.sleep_3_law_wakeup_later_min, R.string.sleep_3_law_wakeup_later_hour);
            int i4 = daySleep - sleepCount;
            Context context3 = this.mContext;
            Objects.requireNonNull(context3);
            View view4 = getView();
            sleepTextSpanUtil.dataFormatDisplay(context3, (TextView) (view4 == null ? null : view4.findViewById(R.id.sleep_detail_part_law_sleep_time_title)), i4, R.string.sleep_3_law_totalsleep_usually, R.string.sleep_3_law_totalsleep_less_min, R.string.sleep_3_law_totalsleep_less_hour, R.string.sleep_3_law_totalsleep_more_min, R.string.sleep_3_law_totalsleep_more_hour);
            int i5 = dayDeepSleep - nonRemCount;
            Context context4 = this.mContext;
            Objects.requireNonNull(context4);
            View view5 = getView();
            sleepTextSpanUtil.dataFormatDisplay(context4, (TextView) (view5 == null ? null : view5.findViewById(R.id.sleep_detail_part_law_deep_title)), i5, R.string.sleep_3_law_deepsleep_usually, R.string.sleep_3_law_deepsleep_less_min, R.string.sleep_3_law_deepsleep_less_hour, R.string.sleep_3_law_deepsleep_more_min, R.string.sleep_3_law_deepsleep_more_hour);
            View view6 = getView();
            ((LinearLayout) (view6 == null ? null : view6.findViewById(R.id.fragment_sleep_detail_part_law_id))).setVisibility(0);
            if (nonRemCount > 0) {
                View view7 = getView();
                ((TypefaceTextView) (view7 == null ? null : view7.findViewById(R.id.sleep_detail_part_law_deep_title))).setVisibility(0);
            } else {
                View view8 = getView();
                ((TypefaceTextView) (view8 == null ? null : view8.findViewById(R.id.sleep_detail_part_law_deep_title))).setVisibility(8);
            }
        } else {
            View view9 = getView();
            ((LinearLayout) (view9 == null ? null : view9.findViewById(R.id.fragment_sleep_detail_part_law_id))).setVisibility(8);
        }
        if (recentWeekSummery.getBestScoreDate() == null || recentWeekSummery.getWorstScoreDate() == null) {
            View view10 = getView();
            ((LinearLayout) (view10 != null ? view10.findViewById(R.id.sleep_detail_part_law_best_worst) : null)).setVisibility(8);
            return;
        }
        if (getActivity() != null) {
            SportDay sportDayFromString = SportDay.fromString(recentWeekSummery.getWorstScoreDate());
            SportDay sportDayFromString2 = SportDay.fromString(recentWeekSummery.getBestScoreDate());
            View view11 = getView();
            UnitTextView unitTextView = (UnitTextView) (view11 == null ? null : view11.findViewById(R.id.sleep_worst_date));
            String[] strArr = new String[4];
            int i6 = sportDayFromString.mon + 1;
            StringBuilder sb = new StringBuilder();
            sb.append(i6);
            strArr[0] = sb.toString();
            FragmentActivity activity = getActivity();
            strArr[1] = activity == null ? null : activity.getString(R.string.unit_mon);
            int i7 = sportDayFromString.day;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(i7);
            strArr[2] = sb2.toString();
            Context contextRequireContext = requireContext();
            int i8 = R.string.unit_date_day;
            strArr[3] = contextRequireContext.getString(i8);
            unitTextView.setValues(strArr);
            View view12 = getView();
            View viewFindViewById = view12 == null ? null : view12.findViewById(R.id.sleep_best_date);
            int i9 = sportDayFromString2.mon + 1;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(i9);
            int i10 = sportDayFromString2.day;
            StringBuilder sb4 = new StringBuilder();
            sb4.append(i10);
            ((UnitTextView) viewFindViewById).setValues(sb3.toString(), requireContext().getString(R.string.unit_mon), sb4.toString(), requireContext().getString(i8));
            View view13 = getView();
            ((LinearLayout) (view13 != null ? view13.findViewById(R.id.sleep_detail_part_law_best_worst) : null)).setVisibility(0);
        }
    }

    private final void R(SleepInfo sleepInfo) {
        HMLog.debug(this.mTag, new b());
        try {
            M().checkDpCompareShow(sleepInfo);
            b0(sleepInfo);
            kotlinx.coroutines.e.f(LifecycleOwnerKt.getLifecycleScope(this), Dispatchers.getMain(), null, new c(sleepInfo, this, null), 2, null);
        } catch (Exception e2) {
            HMLog.warn(this.mTag, e2, d.a);
        }
    }

    private final void S(int i2) {
        this.mPosition.setValue(this, o[0], Integer.valueOf(i2));
    }

    private final void T() throws Exception {
        W();
        View view = getView();
        ViewExKt.smartClick(view == null ? null : view.findViewById(R.id.nap_sleep), 800L, new e());
        View view2 = getView();
        ((ImageView) (view2 == null ? null : view2.findViewById(R.id.snore_tip))).setOnClickListener(new View.OnClickListener() { // from class: j31
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                DaySleepChartFragment.U(this.a, view3);
            }
        });
        View view3 = getView();
        ViewExKt.smartClick(view3 == null ? null : view3.findViewById(R.id.snoreLayout), 800L, new f());
        FragmentTransaction fragmentTransactionBeginTransaction = getChildFragmentManager().beginTransaction();
        int i2 = R.id.chart_container;
        SleepStageChartFragment.Companion companion = SleepStageChartFragment.INSTANCE;
        String str = this.mUserId;
        Objects.requireNonNull(str);
        String str2 = this.mKey;
        Objects.requireNonNull(str2);
        fragmentTransactionBeginTransaction.replace(i2, companion.newInstance(str, str2), "SleepStageChartFragment").commit();
        FragmentTransaction fragmentTransactionBeginTransaction2 = getChildFragmentManager().beginTransaction();
        int i3 = R.id.slp_beh_feel_layout;
        DaySleepStateFeelFragment.Companion companion2 = DaySleepStateFeelFragment.INSTANCE;
        String str3 = this.mUserId;
        Objects.requireNonNull(str3);
        String str4 = this.mKey;
        Objects.requireNonNull(str4);
        fragmentTransactionBeginTransaction2.replace(i3, companion2.newInstance(str3, str4), "DaySleepStateFeelFragment").commit();
        FragmentTransaction fragmentTransactionBeginTransaction3 = getChildFragmentManager().beginTransaction();
        int i4 = R.id.sleepTonalityViewFrame;
        SleepTonalityFragment.Companion companion3 = SleepTonalityFragment.INSTANCE;
        String str5 = this.mKey;
        Objects.requireNonNull(str5);
        fragmentTransactionBeginTransaction3.replace(i4, companion3.newInstance(str5), "SleepTonalityFragment").commit();
        View view4 = getView();
        View viewFindViewById = view4 != null ? view4.findViewById(i4) : null;
        CountEventBuilder countEventBuilder = new CountEventBuilder(SleepStatusAnalytics.EventId.SKY_SLEEP_TONALITY);
        countEventBuilder.setAnonymous(false);
        countEventBuilder.setIdentified(true);
        for (Map.Entry<String, String> entry : countEventBuilder.getExtras().entrySet()) {
            countEventBuilder.addExtra(entry.getKey(), entry.getValue());
        }
        Unit unit = Unit.INSTANCE;
        ExposureAnalyticsKt.addExposeAnalytics$default(viewFindViewById, countEventBuilder, getViewLifecycleOwner(), 0, 0.0f, 12, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void U(DaySleepChartFragment daySleepChartFragment, View view) {
        daySleepChartFragment.V();
    }

    private final void V() {
        Builder builder = new Builder();
        builder.setOkText(getResources().getString(R.string.snore_got_it));
        builder.setDescStr(getResources().getString(R.string.snore_dialog_function_intro));
        builder.setTitleStr(getResources().getString(R.string.snore_dream_talk_monitor_function));
        builder.setTitleStyle(SnoreNormalDialog.TileStyle.TITLE);
        builder.setButtonStyle(SnoreNormalDialog.ButtonStyle.ONE);
        builder.build().show(getParentFragmentManager());
    }

    private final void W() {
        View view = getView();
        ViewExKt.smartClick$default(view == null ? null : view.findViewById(R.id.sleepBreathDay), 0L, new g(), 1, null);
        View view2 = getView();
        ViewExKt.smartClick$default(view2 != null ? view2.findViewById(R.id.sleepBreathDayForeign) : null, 0L, new h(), 1, null);
    }

    private final void X() {
        M().getSleepBreathPair().observe(getViewLifecycleOwner(), new Observer() { // from class: s31
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                DaySleepChartFragment.Y(this.a, (Triple) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Y(DaySleepChartFragment daySleepChartFragment, Triple triple) {
        if (!ExteranelKt.isChineseLanguage()) {
            View view = daySleepChartFragment.getView();
            ViewExKt.setVisible(view == null ? null : view.findViewById(R.id.sleepBreathDay), false);
            View view2 = daySleepChartFragment.getView();
            ViewExKt.setVisible(view2 == null ? null : view2.findViewById(R.id.sleepBreathDayForeign), !((Boolean) triple.getFirst()).booleanValue());
            View view3 = daySleepChartFragment.getView();
            BreathQualityViewForDayForeign breathQualityViewForDayForeign = (BreathQualityViewForDayForeign) (view3 != null ? view3.findViewById(R.id.sleepBreathDayForeign) : null);
            Integer num = (Integer) triple.getThird();
            breathQualityViewForDayForeign.initData(num != null ? num.intValue() : -1);
            return;
        }
        View view4 = daySleepChartFragment.getView();
        ViewExKt.setVisible(view4 == null ? null : view4.findViewById(R.id.sleepBreathDayForeign), false);
        View view5 = daySleepChartFragment.getView();
        ViewExKt.setVisible(view5 == null ? null : view5.findViewById(R.id.sleepBreathDay), !((Boolean) triple.getFirst()).booleanValue());
        View view6 = daySleepChartFragment.getView();
        BreathQualityViewForDay breathQualityViewForDay = (BreathQualityViewForDay) (view6 != null ? view6.findViewById(R.id.sleepBreathDay) : null);
        Integer num2 = (Integer) triple.getSecond();
        int iIntValue = num2 == null ? -1 : num2.intValue();
        Integer num3 = (Integer) triple.getThird();
        breathQualityViewForDay.initData(iIntValue, num3 != null ? num3.intValue() : -1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Z(SleepShowData data, SlpWeekSummary recentWeekSummery) {
        try {
            View viewFindViewById = null;
            if (data.isEmpty()) {
                View view = getView();
                ((LinearLayout) (view == null ? null : view.findViewById(R.id.fragment_sleep_detail_part_qa_id))).setVisibility(8);
                View view2 = getView();
                ((LinearLayout) (view2 == null ? null : view2.findViewById(R.id.fragment_sleep_detail_part_law_id))).setVisibility(8);
                View view3 = getView();
                if (view3 != null) {
                    viewFindViewById = view3.findViewById(R.id.sleep_detail_part_law_best_worst);
                }
                ((LinearLayout) viewFindViewById).setVisibility(8);
                return;
            }
            if (!KoinExtKt.getAppFunctions().getSmartAnalysis("slp")) {
                View view4 = getView();
                ((LinearLayout) (view4 == null ? null : view4.findViewById(R.id.fragment_sleep_detail_part_qa_id))).setVisibility(8);
            }
            Q(recentWeekSummery);
            a0(data);
            if (GlobalConfig.get().isBuildMidong()) {
                View view5 = getView();
                if (view5 != null) {
                    viewFindViewById = view5.findViewById(R.id.divider_between_compare);
                }
                viewFindViewById.setVisibility(0);
                return;
            }
            View view6 = getView();
            if (!((LinearLayout) (view6 == null ? null : view6.findViewById(R.id.sleep_detail_part_law_best_worst))).isShown()) {
                View view7 = getView();
                if (((LinearLayout) (view7 == null ? null : view7.findViewById(R.id.fragment_sleep_detail_part_law_id))).isShown()) {
                    View view8 = getView();
                    if (((LinearLayout) (view8 == null ? null : view8.findViewById(R.id.sleep_detail_part_law_compare))).isShown()) {
                        View view9 = getView();
                        if (((LinearLayout) (view9 == null ? null : view9.findViewById(R.id.fragment_sleep_detail_part_qa_id))).isShown()) {
                            View view10 = getView();
                            if (view10 != null) {
                                viewFindViewById = view10.findViewById(R.id.divider_between_compare);
                            }
                            viewFindViewById.setVisibility(0);
                            return;
                        }
                    }
                }
            }
            View view11 = getView();
            if (view11 != null) {
                viewFindViewById = view11.findViewById(R.id.divider_between_compare);
            }
            viewFindViewById.setVisibility(8);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private final void a0(SleepShowData data) {
        int count;
        if (data.getDeepDurationHour() + data.getDeepDurationMin() + data.getLightDurationHour() + data.getLightDurationMin() == 0) {
            this.isAllMaunualSlp = true;
            return;
        }
        int sleepScore = data.getSleepScore();
        if (M().getmCompareScoreSlplist().isEmpty()) {
            return;
        }
        int categoryCount = M().getmCompareScoreSlplist().get(0).getCategoryCount();
        int size = M().getmCompareScoreSlplist().size();
        if (size > 0) {
            int i2 = 0;
            count = 0;
            while (true) {
                int i3 = i2 + 1;
                if (sleepScore >= M().getmCompareScoreSlplist().get(i2).getCategory()) {
                    count += M().getmCompareScoreSlplist().get(i2).getCount();
                }
                if (i3 >= size) {
                    break;
                } else {
                    i2 = i3;
                }
            }
        } else {
            count = 0;
        }
        int i4 = (int) NumberFormatter.INSTANCE.format((count / categoryCount) * 100, 0, 4);
        if (i4 == 100) {
            i4 = 99;
        }
        String str = this.mKey;
        Objects.requireNonNull(str);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String str2 = this.mKey;
        Objects.requireNonNull(str2);
        if (SportDay.fromString(str2).isToday()) {
            KoinExtKt.getHMKeeper().saveSleepCompareRate(i4);
        }
    }

    private final void b0(SleepInfo sleepInfo) {
        if (!this.isAllMaunualSlp) {
            kotlinx.coroutines.e.f(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), Dispatchers.getMain(), null, new i(sleepInfo, this, null), 2, null);
            return;
        }
        View view = getView();
        ((ConstraintLayout) (view == null ? null : view.findViewById(R.id.sleep_hr_content))).setVisibility(8);
        View view2 = getView();
        ((LinearLayout) (view2 != null ? view2.findViewById(R.id.sleep_pos_content) : null)).setVisibility(8);
    }

    @JvmStatic
    @NotNull
    public static final DaySleepChartFragment newInstance(@NotNull String str, int i2) {
        return INSTANCE.newInstance(str, i2);
    }

    private final void t() {
        String string;
        try {
            SnoreListViewModel snoreListViewModelO = O();
            snoreListViewModelO.getMCount().observe(getViewLifecycleOwner(), new Observer() { // from class: k31
                @Override // androidx.p008lifecycle.Observer
                public final void onChanged(Object obj) {
                    DaySleepChartFragment.K(this.a, (Integer) obj);
                }
            });
            SleepTimeUtil sleepTimeUtil = SleepTimeUtil.INSTANCE;
            String str = this.mKey;
            if (str == null) {
                throw null;
            }
            snoreListViewModelO.setDate(sleepTimeUtil.timeStrToDate(str));
            DaySleepViewModel daySleepViewModelM = M();
            Bundle arguments = getArguments();
            String str2 = "";
            if (arguments != null && (string = arguments.getString("user_id")) != null) {
                str2 = string;
            }
            daySleepViewModelM.setUserId(str2);
            daySleepViewModelM.isSnoreShow().observe(getViewLifecycleOwner(), new Observer() { // from class: w31
                @Override // androidx.p008lifecycle.Observer
                public final void onChanged(Object obj) {
                    DaySleepChartFragment.G(this.a, ((Boolean) obj).booleanValue());
                }
            });
            daySleepViewModelM.getSleepQuotientVis().observe(getViewLifecycleOwner(), new Observer() { // from class: b41
                @Override // androidx.p008lifecycle.Observer
                public final void onChanged(Object obj) {
                    DaySleepChartFragment.H(this.a, (Boolean) obj);
                }
            });
            daySleepViewModelM.getSleepQuotient().observe(getViewLifecycleOwner(), new Observer() { // from class: q31
                @Override // androidx.p008lifecycle.Observer
                public final void onChanged(Object obj) {
                    DaySleepChartFragment.I(this.a, (Pair) obj);
                }
            });
            daySleepViewModelM.getDaySportLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: v31
                @Override // androidx.p008lifecycle.Observer
                public final void onChanged(Object obj) {
                    DaySleepChartFragment.J(this.a, (SleepInfo) obj);
                }
            });
            X();
            daySleepViewModelM.getNapSleepShowLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: z31
                @Override // androidx.p008lifecycle.Observer
                public final void onChanged(Object obj) {
                    DaySleepChartFragment.u(this.a, (Boolean) obj);
                }
            });
            daySleepViewModelM.getNapSleepDuration().observe(getViewLifecycleOwner(), new Observer() { // from class: l31
                @Override // androidx.p008lifecycle.Observer
                public final void onChanged(Object obj) {
                    DaySleepChartFragment.v(this.a, (Integer) obj);
                }
            });
            daySleepViewModelM.getTitleBarRightShowInfo().observe(getViewLifecycleOwner(), new Observer() { // from class: t31
                @Override // androidx.p008lifecycle.Observer
                public final void onChanged(Object obj) {
                    DaySleepChartFragment.w(this.a, (RightSelectShowInfo) obj);
                }
            });
            daySleepViewModelM.getIntoSlpCompareInfo().observe(getViewLifecycleOwner(), new Observer() { // from class: r31
                @Override // androidx.p008lifecycle.Observer
                public final void onChanged(Object obj) {
                    DaySleepChartFragment.x(this.a, (Pair) obj);
                }
            });
            daySleepViewModelM.getDpSlpCompareInfo().observe(getViewLifecycleOwner(), new Observer() { // from class: p31
                @Override // androidx.p008lifecycle.Observer
                public final void onChanged(Object obj) {
                    DaySleepChartFragment.y(this.a, (Pair) obj);
                }
            });
            daySleepViewModelM.getSlpCompareShow().observe(getViewLifecycleOwner(), new Observer() { // from class: a41
                @Override // androidx.p008lifecycle.Observer
                public final void onChanged(Object obj) {
                    DaySleepChartFragment.z(this.a, (Boolean) obj);
                }
            });
            daySleepViewModelM.getSlpIntoCompareText().observe(getViewLifecycleOwner(), new Observer() { // from class: m31
                @Override // androidx.p008lifecycle.Observer
                public final void onChanged(Object obj) {
                    DaySleepChartFragment.A(this.a, (String) obj);
                }
            });
            daySleepViewModelM.getSlpDpCompareShow().observe(getViewLifecycleOwner(), new Observer() { // from class: y31
                @Override // androidx.p008lifecycle.Observer
                public final void onChanged(Object obj) {
                    DaySleepChartFragment.B(this.a, (Boolean) obj);
                }
            });
            daySleepViewModelM.getSlpDpCompareText().observe(getViewLifecycleOwner(), new Observer() { // from class: o31
                @Override // androidx.p008lifecycle.Observer
                public final void onChanged(Object obj) {
                    DaySleepChartFragment.C(this.a, (String) obj);
                }
            });
            daySleepViewModelM.getSleepAnalysisShowLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: x31
                @Override // androidx.p008lifecycle.Observer
                public final void onChanged(Object obj) {
                    DaySleepChartFragment.D(this.a, (Boolean) obj);
                }
            });
            daySleepViewModelM.getSleepAnalysisVoLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: u31
                @Override // androidx.p008lifecycle.Observer
                public final void onChanged(Object obj) {
                    DaySleepChartFragment.E(this.a, (SleepAnalysisVo) obj);
                }
            });
            daySleepViewModelM.getDeviceDescLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: n31
                @Override // androidx.p008lifecycle.Observer
                public final void onChanged(Object obj) {
                    DaySleepChartFragment.F(this.a, (String) obj);
                }
            });
            MutableLiveData<String> dayLiveData = daySleepViewModelM.getDayLiveData();
            String str3 = this.mKey;
            Objects.requireNonNull(str3);
            dayLiveData.setValue(str3);
        } catch (Exception unused) {
            View view = getView();
            View viewFindViewById = view != null ? view.findViewById(R.id.snore_num) : null;
            Context context = this.mContext;
            Objects.requireNonNull(context);
            ((TypefaceTextView) viewFindViewById).setText(context.getResources().getQuantityString(R.plurals.snore_num_segment, 0, 0));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(DaySleepChartFragment daySleepChartFragment, Boolean bool) {
        View view = daySleepChartFragment.getView();
        ViewExKt.setVisible(view == null ? null : view.findViewById(R.id.nap_sleep), bool.booleanValue());
        if (bool.booleanValue()) {
            SleepStatusAnalytics.recordEvent("DETAIL_NAP_V_DAY");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(DaySleepChartFragment daySleepChartFragment, Integer num) {
        if (num.intValue() > 0) {
            View view = daySleepChartFragment.getView();
            ((TypefaceTextView) (view == null ? null : view.findViewById(R.id.nap_duration))).setText(TimeShowUtilsKt.getDurationText$default(num.intValue(), daySleepChartFragment.requireContext(), false, 2, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(DaySleepChartFragment daySleepChartFragment, RightSelectShowInfo rightSelectShowInfo) {
        daySleepChartFragment.getMSleepHomeViewModel().setRightShowDetail(rightSelectShowInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x(DaySleepChartFragment daySleepChartFragment, Pair pair) {
        if (pair == null) {
            return;
        }
        SlpCompareChartHelper slpCompareChartHelperN = daySleepChartFragment.N();
        int iIntValue = ((Number) pair.getFirst()).intValue();
        View view = daySleepChartFragment.getView();
        slpCompareChartHelperN.refreshIntoSlpCompareChart(iIntValue, (ViewGroup) (view == null ? null : view.findViewById(R.id.into_slp_chart)), (ChartDataList) pair.getSecond());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y(DaySleepChartFragment daySleepChartFragment, Pair pair) {
        if (pair == null) {
            return;
        }
        SlpCompareChartHelper slpCompareChartHelperN = daySleepChartFragment.N();
        int iIntValue = ((Number) pair.getFirst()).intValue();
        View view = daySleepChartFragment.getView();
        slpCompareChartHelperN.refreshDpSlpCompareChart(iIntValue, (ViewGroup) (view == null ? null : view.findViewById(R.id.deep_slp_chart)), (ChartDataList) pair.getSecond());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z(DaySleepChartFragment daySleepChartFragment, Boolean bool) {
        View view = daySleepChartFragment.getView();
        ViewExKt.setVisible(view == null ? null : view.findViewById(R.id.sleep_detail_part_law_compare), bool.booleanValue());
    }

    @Override // com.huami.sleep.baseui.LazyFragment
    public void _$_clearFindViewByIdCache() {
    }

    /* JADX INFO: renamed from: isAllMaunualSlp, reason: from getter */
    public final boolean getIsAllMaunualSlp() {
        return this.isAllMaunualSlp;
    }

    @Override // com.huami.sleep.baseui.LazyFragment
    public void lazyInit() {
        if (this.mUserId == null || this.mKey == null) {
            return;
        }
        ISleepDataManager sleepDataManager = KoinExtKt.getSleepDataManager();
        String str = this.mUserId;
        Objects.requireNonNull(str);
        String str2 = this.mKey;
        Objects.requireNonNull(str2);
        sleepDataManager.startAnalysis(str, str2);
        M().getSnoreShowInfo();
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        String string;
        super.onCreate(savedInstanceState);
        FragmentActivity activity = getActivity();
        Objects.requireNonNull(activity, "null cannot be cast to non-null type android.content.Context");
        this.mContext = activity;
        Bundle arguments = getArguments();
        S(arguments != null ? arguments.getInt("position", 0) : 0);
        this.mKey = TimeShowUtilsKt.toDateString(SleepTimeUtil.INSTANCE.getTimeFromRegisterDay(L(), TimeMode.DAY));
        Bundle arguments2 = getArguments();
        String str = "";
        if (arguments2 != null && (string = arguments2.getString("user_id")) != null) {
            str = string;
        }
        this.mUserId = str;
    }

    @Override // com.huami.sleep.baseui.LazyFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        M().getSleepQuatient();
        M().getSleepBreath();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) throws Exception {
        super.onViewCreated(view, savedInstanceState);
        T();
        t();
        SnoreHelper snoreHelper = SnoreHelper.instance;
        Context context = this.mContext;
        Objects.requireNonNull(context);
        snoreHelper.abnormalFinishDeleteData(context);
    }

    public final void setAllMaunualSlp(boolean z) {
        this.isAllMaunualSlp = z;
    }

    public final void setmPosBitmap(@Nullable Bitmap map) {
        this.mPosBitmap = map;
    }

    @Override // com.huami.sleep.baseui.LazyFragment
    public void visibleAfterLoaded() {
        SleepHomeViewModel mSleepHomeViewModel = getMSleepHomeViewModel();
        mSleepHomeViewModel.changeSourceName(M().getDeviceDescLiveData().getValue());
        mSleepHomeViewModel.setRightShowDetail(M().getTitleBarRightShowInfo().getValue());
        mSleepHomeViewModel.updateCurrentSportData(L(), this.mSleepInfo);
    }
}
