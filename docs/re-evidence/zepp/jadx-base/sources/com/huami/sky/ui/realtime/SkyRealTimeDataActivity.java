package com.huami.sky.ui.realtime;

import android.content.ComponentCallbacks;
import android.content.Intent;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ImageSpan;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.ContextCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.p008lifecycle.LifecycleOwnerKt;
import androidx.p008lifecycle.ViewModelStoreOwner;
import androidx.p012savedstate.SavedStateRegistryOwner;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.RecyclerView;
import com.amap.api.mapcore.util.hl;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.chart.chart.DynamicChartData;
import com.huami.chart.chart.HMShimmerLineChart;
import com.huami.chart.helper.DynamicChartProvider;
import com.huami.chart.helper.HMChartHelperKt;
import com.huami.mifit.analytics.Analytics;
import com.huami.sky.lib.entity.MusicTags;
import com.huami.sky.lib.entity.RelaxInfo;
import com.huami.sky.service.PlayState;
import com.huami.sky.service.SkyBetaService;
import com.huami.sky.ui.R;
import com.huami.sky.ui.analytic.SkyPlayEventKt;
import com.huami.sky.ui.bean.MusicInfo;
import com.huami.sky.ui.databinding.ActivitySkyRealtimeDataBinding;
import com.huami.sky.ui.ext.SkyExtKt;
import com.huami.sky.ui.play.control.PlaybackManager;
import com.huami.sky.ui.realtime.SkyRealTimeDataActivity;
import com.huami.sky.ui.service.SkyServiceHelperKt;
import com.huami.sky.ui.utils.Constant;
import com.huami.tools.log.HMLog;
import com.huami.viewbindingx.InflateViewBinder;
import com.huami.viewbindingx.LifeViewBindingProperty;
import com.huami.viewbindingx.activity.ActivityViewBindingsKt;
import com.huami.web.service.WebItem;
import com.huami.web.service.WebViewService;
import com.loc.z;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowKt;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.androidx.viewmodel.ext.android.ComponentCallbackExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 =2\u00020\u0001:\u0001=B\u0007¢\u0006\u0004\b;\u0010<J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0002H\u0002J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002J\b\u0010\u000b\u001a\u00020\u0002H\u0002J\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002J\u0012\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011H\u0002J\u0010\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0018\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0015H\u0002J\u0016\u0010\u001b\u001a\u00020\u00022\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\r0\u0019H\u0002J\b\u0010\u001c\u001a\u00020\u0002H\u0002J\b\u0010\u001e\u001a\u00020\u001dH\u0002J\u0012\u0010!\u001a\u00020\u00022\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0014J\b\u0010\"\u001a\u00020\u0002H\u0014J\b\u0010#\u001a\u00020\u0002H\u0014R\u001d\u0010)\u001a\u00020$8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001d\u0010/\u001a\u00020*8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0018\u00103\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u001c\u00106\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00198\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0018\u0010:\u001a\u0004\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109¨\u0006>"}, d2 = {"Lcom/huami/sky/ui/realtime/SkyRealTimeDataActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "", "h", "initView", "r", "m", SOAP.XMLNS, "Lcom/huami/sky/service/PlayState;", "playState", "t", "x", "y", "Lcom/huami/sky/lib/entity/RelaxInfo;", "relaxInfo", "B", "z", "", "show", "v", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "", "startTime", "endTime", "u", "", "relaxInfos", "C", "w", "", hl.k, "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "onResume", "onPause", "Lcom/huami/sky/ui/databinding/ActivitySkyRealtimeDataBinding;", "a", "Lcom/huami/viewbindingx/LifeViewBindingProperty;", z.j, "()Lcom/huami/sky/ui/databinding/ActivitySkyRealtimeDataBinding;", "binding", "Lcom/huami/sky/ui/realtime/SkyRealTimeViewModel;", "b", "Lkotlin/Lazy;", "l", "()Lcom/huami/sky/ui/realtime/SkyRealTimeViewModel;", "realTimeViewModel", "Lcom/huami/sky/ui/realtime/SkyMusicTagAdapter;", "c", "Lcom/huami/sky/ui/realtime/SkyMusicTagAdapter;", "musicTagAdapter", GoogleApiAvailabilityLight.a, "Ljava/util/List;", "musicTagList", "Lcom/huami/chart/helper/DynamicChartProvider;", "e", "Lcom/huami/chart/helper/DynamicChartProvider;", "chartProvider", "<init>", "()V", "Companion", "sky-ui_release"}, k = 1, mv = {1, 5, 1})
public final class SkyRealTimeDataActivity extends AppCompatActivity {
    public static final /* synthetic */ KProperty<Object>[] f;

    @NotNull
    private static final String g = "SkyRealTimeDataActivity";
    private static final long h = 60000;
    private static final int i = 2;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final LifeViewBindingProperty binding = ActivityViewBindingsKt.viewBinding(new SkyRealTimeDataActivity$special$$inlined$viewBinding$1(new InflateViewBinder(ActivitySkyRealtimeDataBinding.class)));

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy realTimeViewModel;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private SkyMusicTagAdapter musicTagAdapter;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final List<String> musicTagList;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private DynamicChartProvider chartProvider;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lcom/huami/chart/chart/HMShimmerLineChart;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<HMShimmerLineChart, Unit> {
        public static final a a = new a();

        public a() {
            super(1);
        }

        public final void a(@NotNull HMShimmerLineChart hMShimmerLineChart) {
            HMChartHelperKt.defaultConfig(hMShimmerLineChart, R.drawable.sky_chart_blue_line, SkyExtKt.getDp(44.0f), SkyExtKt.getDp(180.0f));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(HMShimmerLineChart hMShimmerLineChart) {
            a(hMShimmerLineChart);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ PlayState a;
        public final /* synthetic */ boolean b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(PlayState playState, boolean z) {
            super(0);
            this.a = playState;
            this.b = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "助眠指导页曝光埋点参数: " + this.a + ", " + this.b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.sky.ui.realtime.SkyRealTimeDataActivity$initObserve$6", f = "SkyRealTimeDataActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
        public int a;

        public c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Nullable
        public final Object a(boolean z, @Nullable Continuation<? super Unit> continuation) {
            return ((c) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return SkyRealTimeDataActivity.this.new c(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
            return a(bool.booleanValue(), continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            PlayState playState = SkyServiceHelperKt.getSkyService().getPlayState();
            if (playState != PlayState.IDLE) {
                SkyRealTimeDataActivity.this.z(playState);
            }
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
            return "放松指数图表更新值-重置当前页面";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public final /* synthetic */ MusicInfo a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(MusicInfo musicInfo) {
            super(0);
            this.a = musicInfo;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "更新音乐标签列表：" + this.a.getTags();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<String> {
        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "播放状态改变时，设备是否成功连接过：" + SkyRealTimeDataActivity.this.l().getDeviceConnectedFlow().getValue();
        }
    }

    static {
        KProperty<Object>[] kPropertyArr = new KProperty[2];
        kPropertyArr[0] = Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(SkyRealTimeDataActivity.class), "binding", "getBinding()Lcom/huami/sky/ui/databinding/ActivitySkyRealtimeDataBinding;"));
        f = kPropertyArr;
        INSTANCE = new Companion(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SkyRealTimeDataActivity() {
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.huami.sky.ui.realtime.SkyRealTimeDataActivity$special$$inlined$viewModel$default$1
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
        this.realTimeViewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<SkyRealTimeViewModel>() { // from class: com.huami.sky.ui.realtime.SkyRealTimeDataActivity$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.huami.sky.ui.realtime.SkyRealTimeViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final SkyRealTimeViewModel invoke() {
                return ComponentCallbackExtKt.getViewModel(this, qualifier, Reflection.getOrCreateKotlinClass(SkyRealTimeViewModel.class), function0, objArr);
            }
        });
        this.musicTagList = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void A(RelaxInfo relaxInfo) {
        long jCurrentTimeMillis = (System.currentTimeMillis() - relaxInfo.getCreatedAt()) / 60000;
        if (jCurrentTimeMillis < 2) {
            j().skyRealtimeTime.setText(getResources().getString(R.string.sky_realtimeData_now));
            return;
        }
        AppCompatTextView appCompatTextView = j().skyRealtimeTime;
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        appCompatTextView.setText(String.format(getResources().getString(R.string.sky_realtimeData_nMinAgo), Arrays.copyOf(new Object[]{Long.valueOf(jCurrentTimeMillis - 1)}, 1)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B(RelaxInfo relaxInfo) {
        if (relaxInfo == null) {
            j().skyRealtimeRelax.setText(getResources().getString(R.string.sky_realtimeData_empty));
            j().skyRealtimeTime.setVisibility(8);
        } else {
            j().skyRealtimeTime.setVisibility(0);
            j().skyRealtimeRelax.setText(String.valueOf(relaxInfo.getValue()));
            A(relaxInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C(List<RelaxInfo> relaxInfos) {
        HMShimmerLineChart hmShimmerLineChart;
        Iterator<T> it2 = relaxInfos.iterator();
        while (it2.hasNext()) {
            DynamicChartData dynamicChartDataBuildChartData = SkyRelaxChartBuilder.INSTANCE.buildChartData((RelaxInfo) it2.next(), l().relaxChartXStartTime());
            DynamicChartProvider dynamicChartProvider = this.chartProvider;
            if (dynamicChartProvider != null && (hmShimmerLineChart = dynamicChartProvider.getHmShimmerLineChart()) != null) {
                hmShimmerLineChart.addData(dynamicChartDataBuildChartData);
            }
        }
    }

    private final void h() {
        long jRelaxChartXStartTime = l().relaxChartXStartTime();
        long jRelaxChartXEndTime = l().relaxChartXEndTime();
        ActivitySkyRealtimeDataBinding activitySkyRealtimeDataBindingJ = j();
        DynamicChartProvider dynamicChartProvider = new DynamicChartProvider(this);
        this.chartProvider = dynamicChartProvider;
        FrameLayout frameLayout = activitySkyRealtimeDataBindingJ.skyRelaxChartLayout;
        SkyRelaxChartBuilder skyRelaxChartBuilder = SkyRelaxChartBuilder.INSTANCE;
        dynamicChartProvider.createDynamicChart(this, frameLayout, skyRelaxChartBuilder.createRelaxChartList(), skyRelaxChartBuilder.buildXAxisData(jRelaxChartXStartTime, jRelaxChartXEndTime), skyRelaxChartBuilder.buildYAxisData(), a.a);
        activitySkyRealtimeDataBindingJ.skyRelaxChartLayout.post(new Runnable() { // from class: vy6
            @Override // java.lang.Runnable
            public final void run() {
                SkyRealTimeDataActivity.i(this.a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(SkyRealTimeDataActivity skyRealTimeDataActivity) {
        skyRealTimeDataActivity.l().firstObserveRelaxScore();
        if (SkyServiceHelperKt.getSkyService().isPlaying()) {
            skyRealTimeDataActivity.w();
        }
    }

    private final void initView() {
        r();
        y(SkyServiceHelperKt.getSkyService().getPlayState());
        z(SkyServiceHelperKt.getSkyService().getPlayState());
        SkyExtKt.setTextColorRes(j().skyRealtimeTips, R.color.s46, Double.valueOf(0.6d));
        Drawable drawable = ContextCompat.getDrawable(this, R.drawable.ic_arrow_forward_16);
        if (drawable != null) {
            drawable.setBounds(new Rect(0, 0, SkyExtKt.getDp(12), SkyExtKt.getDp(12)));
        }
        j().skyRealtimeIllustrate.setCompoundDrawablesRelative(null, null, drawable, null);
        Drawable drawable2 = ContextCompat.getDrawable(this, R.drawable.ic_tips_16_s46);
        if (drawable2 == null) {
            return;
        }
        drawable2.setBounds(0, 0, drawable2.getIntrinsicWidth(), drawable2.getIntrinsicHeight());
        SpannableString spannableString = new SpannableString(getResources().getString(R.string.sky_realtimeData_relaxIndex) + "  ");
        spannableString.setSpan(new ImageSpan(drawable2, 1), spannableString.length() - 1, spannableString.length(), 17);
        j().skyRealtimeRelaxTitle.setText(spannableString);
    }

    private final ActivitySkyRealtimeDataBinding j() {
        return (ActivitySkyRealtimeDataBinding) this.binding.getValue(this, f[0]);
    }

    private final String k() {
        PlayState playState = SkyServiceHelperKt.getSkyService().getPlayState();
        boolean zBooleanValue = l().getDeviceConnectedFlow().getValue().booleanValue();
        HMLog.info(g, new b(playState, zBooleanValue));
        if (playState == PlayState.IDLE) {
            return "0";
        }
        return zBooleanValue ? "1" : "2";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SkyRealTimeViewModel l() {
        return (SkyRealTimeViewModel) this.realTimeViewModel.getValue();
    }

    private final void m() {
        j().titleBar.setNavigationOnClickListener(new View.OnClickListener() { // from class: ry6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SkyRealTimeDataActivity.q(this.a, view);
            }
        });
        if (((SkyBetaService) org.koin.android.ext.android.ComponentCallbackExtKt.getKoin(this).getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(SkyBetaService.class), null, null)).isShowMusicList()) {
            j().titleBar.setOnLongClickListener(new View.OnLongClickListener() { // from class: uy6
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    return SkyRealTimeDataActivity.n(this.a, view);
                }
            });
        }
        j().skyRealtimeRelaxTitle.setOnClickListener(new View.OnClickListener() { // from class: ty6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SkyRealTimeDataActivity.o(view);
            }
        });
        j().skyRealtimeIllustrate.setOnClickListener(new View.OnClickListener() { // from class: sy6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SkyRealTimeDataActivity.p(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean n(SkyRealTimeDataActivity skyRealTimeDataActivity, View view) {
        skyRealTimeDataActivity.startActivity(new Intent(skyRealTimeDataActivity, (Class<?>) SkyMusicListActivity.class));
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(View view) {
        WebViewService webViewService = SkyServiceHelperKt.getWebViewService();
        WebItem webItem = new WebItem(Constant.REALTIME_WEB_URL);
        webItem.webTheme = "THEME_DARK";
        Unit unit = Unit.INSTANCE;
        webViewService.launch(webItem);
        SkyPlayEventKt.recordEvent(SkyPlayEventKt.AIMUSIC_RTDATA_MOREINFO_C);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(View view) {
        WebViewService webViewService = SkyServiceHelperKt.getWebViewService();
        WebItem webItem = new WebItem(Constant.ILLUSTRATE_WEB_URL);
        webItem.webTheme = "THEME_DARK";
        Unit unit = Unit.INSTANCE;
        webViewService.launch(webItem);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(SkyRealTimeDataActivity skyRealTimeDataActivity, View view) {
        skyRealTimeDataActivity.finish();
    }

    private final void r() {
        this.musicTagAdapter = new SkyMusicTagAdapter(this, this.musicTagList);
        j().skyRealtimeTagRecycler.setAdapter(this.musicTagAdapter);
        FlexboxLayoutManager flexboxLayoutManager = new FlexboxLayoutManager() { // from class: com.huami.sky.ui.realtime.SkyRealTimeDataActivity$initMusicTagAdapter$flexLayoutManager$1
            {
                super(this.E);
            }

            @Override // com.google.android.flexbox.FlexboxLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public boolean canScrollVertically() {
                return false;
            }
        };
        flexboxLayoutManager.setFlexDirection(0);
        flexboxLayoutManager.setFlexWrap(1);
        j().skyRealtimeTagRecycler.setLayoutManager(flexboxLayoutManager);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setSize(SkyExtKt.getDp(10), SkyExtKt.getDp(10));
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setSize(SkyExtKt.getDp(7), SkyExtKt.getDp(7));
        RecyclerView recyclerView = j().skyRealtimeTagRecycler;
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(this, 0);
        dividerItemDecoration.setDrawable(gradientDrawable2);
        Unit unit = Unit.INSTANCE;
        recyclerView.addItemDecoration(dividerItemDecoration);
        RecyclerView recyclerView2 = j().skyRealtimeTagRecycler;
        DividerItemDecoration dividerItemDecoration2 = new DividerItemDecoration(this, 1);
        dividerItemDecoration2.setDrawable(gradientDrawable);
        recyclerView2.addItemDecoration(dividerItemDecoration2);
        x();
    }

    private final void s() {
        kotlinx.coroutines.e.f(LifecycleOwnerKt.getLifecycleScope(this), Dispatchers.getMain(), null, new SkyRealTimeDataActivity$initObserve$1(this, null), 2, null);
        kotlinx.coroutines.e.f(LifecycleOwnerKt.getLifecycleScope(this), Dispatchers.getMain(), null, new SkyRealTimeDataActivity$initObserve$2(this, null), 2, null);
        kotlinx.coroutines.e.f(LifecycleOwnerKt.getLifecycleScope(this), Dispatchers.getMain(), null, new SkyRealTimeDataActivity$initObserve$3(this, null), 2, null);
        kotlinx.coroutines.e.f(LifecycleOwnerKt.getLifecycleScope(this), null, null, new SkyRealTimeDataActivity$initObserve$4(this, null), 3, null);
        kotlinx.coroutines.e.f(LifecycleOwnerKt.getLifecycleScope(this), null, null, new SkyRealTimeDataActivity$initObserve$5(this, null), 3, null);
        FlowKt.launchIn(FlowKt.onEach(l().getDeviceConnectedFlow(), new c(null)), LifecycleOwnerKt.getLifecycleScope(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t(PlayState playState) {
        HMShimmerLineChart hmShimmerLineChart;
        y(playState);
        z(playState);
        if (playState != PlayState.IDLE) {
            if (playState == PlayState.PLAYING) {
                w();
                x();
                return;
            }
            return;
        }
        u(-1L, -1L);
        B(null);
        DynamicChartProvider dynamicChartProvider = this.chartProvider;
        if (dynamicChartProvider == null || (hmShimmerLineChart = dynamicChartProvider.getHmShimmerLineChart()) == null) {
            return;
        }
        hmShimmerLineChart.stopShimmer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u(long startTime, long endTime) {
        HMShimmerLineChart hmShimmerLineChart;
        HMLog.info(g, d.a);
        DynamicChartProvider dynamicChartProvider = this.chartProvider;
        if (dynamicChartProvider == null || (hmShimmerLineChart = dynamicChartProvider.getHmShimmerLineChart()) == null) {
            return;
        }
        SkyRelaxChartBuilder skyRelaxChartBuilder = SkyRelaxChartBuilder.INSTANCE;
        hmShimmerLineChart.reset(skyRelaxChartBuilder.createRelaxChartList(), skyRelaxChartBuilder.buildXAxisData(startTime, endTime));
    }

    private final void v(boolean show) {
        ActivitySkyRealtimeDataBinding activitySkyRealtimeDataBindingJ = j();
        if (show) {
            activitySkyRealtimeDataBindingJ.skyRealtimeTime.setVisibility(8);
            activitySkyRealtimeDataBindingJ.skyRealtimeRelax.setVisibility(8);
            activitySkyRealtimeDataBindingJ.relaxChartNoDataLayout.noDataLayout.setVisibility(0);
            activitySkyRealtimeDataBindingJ.skyRelaxChartLayout.setVisibility(8);
            return;
        }
        activitySkyRealtimeDataBindingJ.skyRealtimeTime.setVisibility(0);
        activitySkyRealtimeDataBindingJ.skyRealtimeRelax.setVisibility(0);
        activitySkyRealtimeDataBindingJ.relaxChartNoDataLayout.noDataLayout.setVisibility(8);
        activitySkyRealtimeDataBindingJ.skyRelaxChartLayout.setVisibility(0);
        this.chartProvider = null;
        h();
    }

    private final void w() {
        HMShimmerLineChart hmShimmerLineChart;
        DynamicChartProvider dynamicChartProvider;
        HMShimmerLineChart hmShimmerLineChart2;
        DynamicChartProvider dynamicChartProvider2 = this.chartProvider;
        if (((dynamicChartProvider2 == null || (hmShimmerLineChart = dynamicChartProvider2.getHmShimmerLineChart()) == null || !hmShimmerLineChart.isShimmerStarted()) ? false : true) || (dynamicChartProvider = this.chartProvider) == null || (hmShimmerLineChart2 = dynamicChartProvider.getHmShimmerLineChart()) == null) {
            return;
        }
        hmShimmerLineChart2.startShimmer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x() {
        MusicInfo firstPlayingMusic = PlaybackManager.INSTANCE.getInstance().getFirstPlayingMusic();
        if (firstPlayingMusic == null) {
            return;
        }
        HMLog.info(g, new e(firstPlayingMusic));
        List<MusicTags> tags = firstPlayingMusic.getTags();
        if (tags == null || tags.isEmpty()) {
            return;
        }
        this.musicTagList.clear();
        List<String> list = this.musicTagList;
        List<MusicTags> tags2 = firstPlayingMusic.getTags();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(tags2, 10));
        Iterator<T> it2 = tags2.iterator();
        while (it2.hasNext()) {
            arrayList.add(((MusicTags) it2.next()).getName());
        }
        list.addAll(arrayList);
        SkyMusicTagAdapter skyMusicTagAdapter = this.musicTagAdapter;
        if (skyMusicTagAdapter == null) {
            return;
        }
        skyMusicTagAdapter.setNewData(this.musicTagList);
    }

    private final void y(PlayState playState) {
        if (playState == PlayState.IDLE) {
            j().skyRealtimeTag.setVisibility(8);
            j().skyRealtimeTagRecycler.setVisibility(8);
        } else {
            j().skyRealtimeTag.setVisibility(0);
            j().skyRealtimeTagRecycler.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z(PlayState playState) {
        HMLog.info(g, new f());
        if (playState == PlayState.IDLE) {
            j().skyRealtimeTips.setText(getResources().getString(R.string.sky_realtimeData_notplaying_detail));
            v(true);
        } else {
            if (!l().getDeviceConnectedFlow().getValue().booleanValue()) {
                j().skyRealtimeTips.setText(getResources().getString(R.string.sky_realtime_not_connected));
                v(true);
                return;
            }
            j().skyRealtimeTips.setText(getResources().getString(R.string.sky_realtime_tips));
            v(false);
            if (Intrinsics.areEqual(j().skyRealtimeRelax.getText().toString(), getResources().getString(R.string.sky_realtimeData_empty))) {
                j().skyRealtimeTime.setText(getResources().getString(R.string.sky_realtimeData_calculating));
            }
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(j().getRoot());
        initView();
        m();
        s();
        l().firstLoadRelaxScore();
        h();
        SkyPlayEventKt.recordEvent$default(SkyPlayEventKt.AIMUSIC_DATA_C, null, null, k(), null, 22, null);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        Analytics.recordPageEnd(SkyPlayEventKt.AIMUSIC_DATA_T);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        Analytics.recordPageStart(SkyPlayEventKt.AIMUSIC_DATA_T);
    }
}
