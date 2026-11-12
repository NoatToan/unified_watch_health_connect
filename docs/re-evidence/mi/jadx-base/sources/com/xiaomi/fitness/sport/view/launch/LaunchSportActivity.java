package com.xiaomi.fitness.sport.view.launch;

import android.annotation.SuppressLint;
import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.lifecycle.MutableLiveData;
import com.example.statistics.export.NestRecyclerViewItemEffectiveExposeBiz;
import com.mi.health.utils.AmapLocation;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import com.xiaomi.fitness.baseui.view.BaseBindingActivity;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.LocationExtKt;
import com.xiaomi.fitness.common.extensions.PermissionExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.component.StandardComponentEvent;
import com.xiaomi.fitness.device.manager.OnDeviceStatusListener;
import com.xiaomi.fitness.device.manager.export.OnAccessoryDeviceStateListener;
import com.xiaomi.fitness.sport.SportConstants;
import com.xiaomi.fitness.sport.bean.BaseSportItemBean;
import com.xiaomi.fitness.sport.bean.LaunchViewBean;
import com.xiaomi.fitness.sport.sporttab.SupportCityManager;
import com.xiaomi.fitness.sport.utils.ExtensionsKt;
import com.xiaomi.fitness.sport.utils.SportUtilsExtKt;
import com.xiaomi.fitness.sport.utils.TransitionUtil;
import com.xiaomi.fitness.sport.view.RebootSportKt;
import com.xiaomi.fitness.sport.view.config.SportRemindConfigActivity;
import com.xiaomi.fitness.sport.view.config.SportRemindConfigFragment;
import com.xiaomi.fitness.sport.view.launch.LaunchSportActivity;
import com.xiaomi.fitness.sport.view.launch.adapter.LaunchSportAdapter;
import com.xiaomi.fitness.sport.view.launch.adapter.LaunchView;
import com.xiaomi.fitness.sport.view.widget.GpsSignalView;
import com.xiaomi.fitness.sport.viewmodel.LaunchSportViewModel;
import com.xiaomi.fitness.sport_manager_export.data.SportLocationResult;
import com.xiaomi.fitness.sport_manager_export.di.SportManagerExtKt;
import com.xiaomi.fitness.sport_manager_export.launch.ISportRemoteState;
import com.xiaomi.fitness.sport_manager_export.listener.IMusicPlayer;
import com.xiaomi.fitness.sport_manager_export.listener.MusicData;
import com.xiaomi.fitness.sync.init.SyncComponent;
import com.xiaomi.fitness.training_plan_export.model.AbilityPlanRunningCourse;
import defpackage.bn0;
import defpackage.c1j;
import defpackage.dvi;
import defpackage.eoe;
import defpackage.eoi;
import defpackage.gki;
import defpackage.nuq;
import defpackage.wc0;
import defpackage.xri;
import defpackage.yyc;
import defpackage.zr3;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import miuix.recyclerview.widget.RecyclerView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\bP\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u000f\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\u0006J\u000f\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u0006J\u000f\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\u0006J\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001b\u001a\u00020\u000e2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u001d\u0010\u0006J\u000f\u0010\u001e\u001a\u00020\u0004H\u0015¢\u0006\u0004\b\u001e\u0010\u0006J\u000f\u0010\u001f\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u001f\u0010\u0006J\u000f\u0010 \u001a\u00020\u0004H\u0014¢\u0006\u0004\b \u0010\u0006J\u000f\u0010!\u001a\u00020\u0004H\u0014¢\u0006\u0004\b!\u0010\u0006J\u0017\u0010#\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u0011H\u0014¢\u0006\u0004\b#\u0010\u0014R\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010$R\u0018\u0010&\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010)\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u001b\u00100\u001a\u00020+8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0016\u00101\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00104\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00107\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u001b\u0010=\u001a\u0002098BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b:\u0010-\u001a\u0004\b;\u0010<R\u0018\u0010?\u001a\u0004\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u001b\u0010E\u001a\u00020A8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bB\u0010-\u001a\u0004\bC\u0010DR\u001b\u0010J\u001a\u00020F8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bG\u0010-\u001a\u0004\bH\u0010IR\u0014\u0010M\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bK\u0010LR\u0014\u0010O\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bN\u0010L¨\u0006Q"}, d2 = {"Lcom/xiaomi/fitness/sport/view/launch/LaunchSportActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/sport/viewmodel/LaunchSportViewModel;", "Lbn0;", "", "initSportMusic", "()V", "initData", "getRoute", "getRouteList", "initView", "setSportType", "", DailyRecordKey.sportType, "", "supportCreateRoute", "(I)Z", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/content/res/Configuration;", StandardComponentEvent.KEY_NEW_CONFIG, "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "Landroid/view/MotionEvent;", "ev", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", LifecycleConstantKt.ON_START, LifecycleConstantKt.ON_RESUME, LifecycleConstantKt.ON_PAUSE, LifecycleConstantKt.ON_STOP, LifecycleConstantKt.ON_DESTROY, "outState", "onSaveInstanceState", "I", "Lcom/xiaomi/fitness/sport/view/launch/adapter/LaunchView;", "launchView", "Lcom/xiaomi/fitness/sport/view/launch/adapter/LaunchView;", "Lcom/xiaomi/fitness/sport/view/launch/adapter/LaunchSportAdapter;", "launchAdapter", "Lcom/xiaomi/fitness/sport/view/launch/adapter/LaunchSportAdapter;", "Lcom/xiaomi/fitness/sport/view/launch/LaunchSportModel;", "launchSportModel$delegate", "Lkotlin/Lazy;", "getLaunchSportModel", "()Lcom/xiaomi/fitness/sport/view/launch/LaunchSportModel;", "launchSportModel", "hasInitHead", "Z", "Lcom/xiaomi/fitness/device/manager/export/OnAccessoryDeviceStateListener;", "onAccessoryDeviceStateListener", "Lcom/xiaomi/fitness/device/manager/export/OnAccessoryDeviceStateListener;", "Lcom/xiaomi/fitness/device/manager/OnDeviceStatusListener;", "onDeviceStatusListener", "Lcom/xiaomi/fitness/device/manager/OnDeviceStatusListener;", "Lcom/example/statistics/export/NestRecyclerViewItemEffectiveExposeBiz;", "effectiveExposeBiz$delegate", "getEffectiveExposeBiz", "()Lcom/example/statistics/export/NestRecyclerViewItemEffectiveExposeBiz;", "effectiveExposeBiz", "Lcom/mi/health/utils/AmapLocation$ILocationListener;", "locationCallback", "Lcom/mi/health/utils/AmapLocation$ILocationListener;", "Lyyc;", "iSportLocationListener$delegate", "getISportLocationListener", "()Lyyc;", "iSportLocationListener", "Leoe;", "locationSignalManager$delegate", "getLocationSignalManager", "()Leoe;", "locationSignalManager", "getLayoutId", "()I", "layoutId", "getViewModelId", "viewModelId", "<init>", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"WrongConstant"})
public final class LaunchSportActivity extends Hilt_LaunchSportActivity<LaunchSportViewModel, bn0> {
    private boolean hasInitHead;

    @Nullable
    private LaunchSportAdapter launchAdapter;

    @Nullable
    private LaunchView launchView;
    private int sportType;

    /* JADX INFO: renamed from: launchSportModel$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy launchSportModel = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: h3e
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return LaunchSportActivity.launchSportModel_delegate$lambda$0();
        }
    });

    @NotNull
    private final OnAccessoryDeviceStateListener onAccessoryDeviceStateListener = new OnAccessoryDeviceStateListener() { // from class: com.xiaomi.fitness.sport.view.launch.LaunchSportActivity$onAccessoryDeviceStateListener$1
        @Override // com.xiaomi.fitness.device.manager.export.OnAccessoryDeviceStateListener
        public void onAccessoryDeviceModeChange(String did, int mode, boolean fromApp) {
            if (did == null) {
                return;
            }
            LaunchSportActivity.access$getMViewModel(this.this$0).loadPrimaryAndAccessoryConnectedDevice();
            Logger.d(BaseBindingActivity.TAG, "onAccessoryDeviceStateListener onAccessoryDeviceModeChange did=" + did + " mode=" + mode + " fromApp=" + fromApp);
        }

        @Override // com.xiaomi.fitness.device.manager.export.OnAccessoryDeviceStateListener
        public void onAccessoryDeviceModeDuplicate(String did, int mode, boolean fromApp) {
            if (did == null) {
                return;
            }
            LaunchSportActivity.access$getMViewModel(this.this$0).loadPrimaryAndAccessoryConnectedDevice();
            Logger.d(BaseBindingActivity.TAG, "onAccessoryDeviceStateListener onAccessoryDeviceModeDuplicate did=" + did + " mode=" + mode + " fromApp=" + fromApp);
        }
    };

    @NotNull
    private final OnDeviceStatusListener onDeviceStatusListener = new OnDeviceStatusListener() { // from class: com.xiaomi.fitness.sport.view.launch.LaunchSportActivity$onDeviceStatusListener$1
        @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
        public void onConnectFailure(String did, int errorCode, int retryTimes) {
            Logger.d(BaseBindingActivity.TAG, "onDeviceStatusListener onConnectFailure running");
        }

        @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
        public void onConnectStart(String did) {
            Logger.d(BaseBindingActivity.TAG, "onDeviceStatusListener onConnectStart running");
        }

        @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
        public void onConnectSuccess(String did) {
            Logger.d(BaseBindingActivity.TAG, "onDeviceStatusListener onConnectSuccess running");
            if (did == null) {
                return;
            }
            LaunchSportActivity.access$getMViewModel(this.this$0).loadPrimaryAndAccessoryConnectedDevice();
        }

        @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
        public void onDisconnect(String did) {
            Logger.d(BaseBindingActivity.TAG, "onDeviceStatusListener onDisconnect running");
            if (did == null) {
                return;
            }
            LaunchSportActivity.access$getMViewModel(this.this$0).loadPrimaryAndAccessoryConnectedDevice();
        }
    };

    /* JADX INFO: renamed from: effectiveExposeBiz$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy effectiveExposeBiz = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: i3e
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return LaunchSportActivity.effectiveExposeBiz_delegate$lambda$1();
        }
    });

    @Nullable
    private AmapLocation.ILocationListener locationCallback = new LaunchSportActivity$locationCallback$1(this);

    /* JADX INFO: renamed from: iSportLocationListener$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy iSportLocationListener = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: j3e
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return LaunchSportActivity.iSportLocationListener_delegate$lambda$12(this.f22377a);
        }
    });

    /* JADX INFO: renamed from: locationSignalManager$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy locationSignalManager = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: k3e
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return LaunchSportActivity.locationSignalManager_delegate$lambda$13(this.f23390a);
        }
    });

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ LaunchSportViewModel access$getMViewModel(LaunchSportActivity launchSportActivity) {
        return (LaunchSportViewModel) launchSportActivity.getMViewModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NestRecyclerViewItemEffectiveExposeBiz effectiveExposeBiz_delegate$lambda$1() {
        return new NestRecyclerViewItemEffectiveExposeBiz();
    }

    private final NestRecyclerViewItemEffectiveExposeBiz getEffectiveExposeBiz() {
        return (NestRecyclerViewItemEffectiveExposeBiz) this.effectiveExposeBiz.getValue();
    }

    private final yyc getISportLocationListener() {
        return (yyc) this.iSportLocationListener.getValue();
    }

    private final LaunchSportModel getLaunchSportModel() {
        return (LaunchSportModel) this.launchSportModel.getValue();
    }

    private final eoe getLocationSignalManager() {
        return (eoe) this.locationSignalManager.getValue();
    }

    private final void getRoute() {
        nuq binding;
        GpsSignalView gpsSignalView;
        if (this.sportType == 1) {
            if (getRoute$isReadyForGetRouteList(this)) {
                getRouteList();
            }
            LaunchView launchView = this.launchView;
            if (launchView == null || (binding = launchView.getBinding()) == null || (gpsSignalView = binding.K) == null) {
                return;
            }
            gpsSignalView.setPermissionChanged(new Function1() { // from class: l3e
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return LaunchSportActivity.getRoute$lambda$5(this.f24602a, (GpsSignalView.SignalEnum) obj);
                }
            });
        }
    }

    private static final boolean getRoute$isReadyForGetRouteList(LaunchSportActivity launchSportActivity) {
        return LocationExtKt.isGpsEnable(launchSportActivity) && PermissionExtKt.isPermissionGranted(launchSportActivity, "android.permission.ACCESS_FINE_LOCATION");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getRoute$lambda$5(LaunchSportActivity this$0, GpsSignalView.SignalEnum it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        if (getRoute$isReadyForGetRouteList(this$0)) {
            this$0.getRouteList();
        }
        return Unit.INSTANCE;
    }

    private final void getRouteList() {
        AmapLocation amapLocation = new AmapLocation();
        AmapLocation.ILocationListener iLocationListener = this.locationCallback;
        Intrinsics.checkNotNull(iLocationListener);
        amapLocation.startLocation(iLocationListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final yyc iSportLocationListener_delegate$lambda$12(final LaunchSportActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return new yyc() { // from class: b3e
            @Override // defpackage.yyc
            public final void onLocationChanged(SportLocationResult sportLocationResult) {
                LaunchSportActivity.iSportLocationListener_delegate$lambda$12$lambda$11(this.f3746a, sportLocationResult);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void iSportLocationListener_delegate$lambda$12$lambda$11(LaunchSportActivity this$0, SportLocationResult it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        FitnessLogUtils.i(BaseBindingActivity.TAG, "gpsAccuracyStatus:" + it.getGpsAccuracyStatus());
        LaunchView launchView = this$0.launchView;
        if (launchView != null) {
            launchView.setGpsSignal(it.getGpsAccuracyStatus());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initData() {
        MutableLiveData<List<BaseSportItemBean>> list = ((LaunchSportViewModel) getMViewModel()).getList();
        if (list != null) {
            list.observe(this, new LaunchSportActivityKt$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: f3e
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return LaunchSportActivity.initData$lambda$3(this.f17363a, (List) obj);
                }
            }));
        }
        MutableLiveData<String> hrData = ((LaunchSportViewModel) getMViewModel()).getHrData();
        if (hrData != null) {
            hrData.observe(this, new LaunchSportActivityKt$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: g3e
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return LaunchSportActivity.initData$lambda$4(this.f18548a, (String) obj);
                }
            }));
        }
        getRoute();
        ((LaunchSportViewModel) getMViewModel()).refresh();
        ((LaunchSportViewModel) getMViewModel()).loadBanner();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initData$lambda$3(LaunchSportActivity this$0, List list) {
        LaunchSportAdapter launchSportAdapter;
        LaunchView launchView;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNull(list);
        if (!list.isEmpty()) {
            if (list.size() == 1 && !this$0.hasInitHead) {
                LaunchSportAdapter launchSportAdapter2 = this$0.launchAdapter;
                if (launchSportAdapter2 != null) {
                    launchSportAdapter2.setHeadData(list);
                }
                this$0.hasInitHead = true;
            } else if (list.size() > 1 && (launchSportAdapter = this$0.launchAdapter) != null) {
                launchSportAdapter.setData(list);
            }
            Object obj = list.get(0);
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.xiaomi.fitness.sport.bean.LaunchViewBean");
            LaunchViewBean launchViewBean = (LaunchViewBean) obj;
            if (launchViewBean.getWeatherRefresh() && (launchView = this$0.launchView) != null) {
                launchView.setWeather(launchViewBean);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initData$lambda$4(LaunchSportActivity this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        LaunchView launchView = this$0.launchView;
        if (launchView != null) {
            Intrinsics.checkNotNull(str);
            launchView.setHr(str);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initSportMusic() {
        if (Intrinsics.areEqual(SportManagerExtKt.getInstance(IMusicPlayer.INSTANCE).isShowMusicPlyer(), Boolean.TRUE)) {
            ((LaunchSportViewModel) getMViewModel()).getSportMusicData().observe(this, new LaunchSportActivityKt$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: c3e
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return LaunchSportActivity.initSportMusic$lambda$2(this.f4888a, (MusicData) obj);
                }
            }));
            return;
        }
        LaunchView launchView = this.launchView;
        if (launchView != null) {
            launchView.hideSportMusic();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initSportMusic$lambda$2(LaunchSportActivity this$0, MusicData musicData) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        LaunchView launchView = this$0.launchView;
        if (launchView != null) {
            launchView.setMusicData(musicData);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initView() {
        String str;
        final LaunchSportActivity launchSportActivity = (LaunchSportActivity) new WeakReference(this).get();
        this.launchView = launchSportActivity != null ? new LaunchView(launchSportActivity, this.sportType, (LaunchSportViewModel) getMViewModel(), new Function3() { // from class: e3e
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return LaunchSportActivity.initView$lambda$8$lambda$7(this.f16219a, launchSportActivity, (View) obj, ((Integer) obj2).intValue(), (AbilityPlanRunningCourse) obj3);
            }
        }) : null;
        LaunchView launchView = this.launchView;
        Intrinsics.checkNotNull(launchView);
        int i = this.sportType;
        if (i == 1) {
            str = "workout_start_outdoor_run_page";
        } else if (i != 3) {
            str = i != 6 ? "workout_start_outdoor_walk_page" : "workout_start_outdoor_biking_page";
        } else {
            str = "workout_start_indoor_run_page";
        }
        this.launchAdapter = new LaunchSportAdapter(launchView, str);
        ((bn0) getMBinding()).A.setAdapter(this.launchAdapter);
        NestRecyclerViewItemEffectiveExposeBiz effectiveExposeBiz = getEffectiveExposeBiz();
        RecyclerView recyclerView = ((bn0) getMBinding()).A;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
        NestRecyclerViewItemEffectiveExposeBiz.startTrackItemExpose$default(effectiveExposeBiz, recyclerView, ExtUtilsKt.getDp(60), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initView$lambda$8$lambda$7(LaunchSportActivity this$0, LaunchSportActivity it, View view, int i, AbilityPlanRunningCourse abilityPlanRunningCourse) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "$it");
        Bundle bundle = new Bundle();
        bundle.putInt("KEY_SPORT_TYPE", this$0.sportType);
        bundle.putInt("WEAR_MODE", i);
        Logger.d(BaseBindingActivity.TAG, "ability day plan " + abilityPlanRunningCourse);
        if (abilityPlanRunningCourse != null) {
            bundle.putSerializable(SportConstants.KEY_ABILITY_TRAINING_INFO, abilityPlanRunningCourse);
        }
        this$0.getLaunchSportModel().launchSport(it, bundle, view, new Function0() { // from class: d3e
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LaunchSportActivity.initView$lambda$8$lambda$7$lambda$6();
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initView$lambda$8$lambda$7$lambda$6() {
        FitnessLogUtils.i(BaseBindingActivity.TAG, "click launch sport button");
        SportManagerExtKt.getInstance(ISportRemoteState.INSTANCE).removeRecoverSport();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LaunchSportModel launchSportModel_delegate$lambda$0() {
        return new LaunchSportModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final eoe locationSignalManager_delegate$lambda$13(LaunchSportActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return new eoe(this$0.getApplication(), 1000L, (yyc) new WeakReference(this$0.getISportLocationListener()).get(), SyncComponent.SYNC_WIFI_TIME);
    }

    private final void setSportType() {
        wc0 miuiActionBar;
        int intExtra = getIntent().getIntExtra("KEY_SPORT_TYPE", 0);
        this.sportType = intExtra;
        int sportTypeStr = SportUtilsExtKt.getSportTypeStr(intExtra);
        setTitle(sportTypeStr);
        if (supportCreateRoute(this.sportType)) {
            ImageView imageView = new ImageView(this);
            imageView.setId(xri.M6);
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -2);
            imageView.setForegroundGravity(16);
            imageView.setPaddingRelative(ExtUtilsKt.getDp(5), 0, ExtUtilsKt.getDp(7), 0);
            imageView.setLayoutParams(layoutParams);
            imageView.setContentDescription(imageView.getContext().getString(c1j.H5));
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageResource(eoi.K1);
            setEndView(imageView);
            new zr3(imageView, this, imageView.getContext()) { // from class: com.xiaomi.fitness.sport.view.launch.LaunchSportActivity.setSportType.1
                final /* synthetic */ ImageView $sportSetting;
                final /* synthetic */ LaunchSportActivity this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(context, imageView, null);
                    this.$sportSetting = imageView;
                    this.this$0 = this;
                }

                @Override // defpackage.zr3
                public void onCardZoomTriggered(ActivityOptions activityOptions) {
                    Bundle bundle = new Bundle();
                    bundle.putInt("KEY_SPORT_TYPE", this.this$0.sportType);
                    if (UIUtils.INSTANCE.isTablet()) {
                        Intent intent = new Intent(this.this$0, (Class<?>) SportRemindConfigActivity.class);
                        intent.putExtras(bundle);
                        this.this$0.startActivity(intent);
                    } else {
                        TransitionUtil transitionUtil = TransitionUtil.INSTANCE;
                        Context context = this.$sportSetting.getContext();
                        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                        transitionUtil.gotoPage(context, SportRemindConfigFragment.class, bundle, true, activityOptions);
                    }
                }
            }.setRadius((int) ExtensionsKt.getPx(15));
        }
        if (UIUtils.isNightMode(this) && (miuiActionBar = getMiuiActionBar()) != null) {
            miuiActionBar.setBackgroundDrawable(new ColorDrawable(ResourceExtKt.getResourceColor(this, gki.f19084a)));
        }
        ((LaunchSportViewModel) getMViewModel()).setSportType(this.sportType);
        ((LaunchSportViewModel) getMViewModel()).setSportName(getString(sportTypeStr));
    }

    private final boolean supportCreateRoute(int sportType) {
        return (sportType == 1 || sportType == 2) && SupportCityManager.INSTANCE.isAIOpen();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(@Nullable MotionEvent ev) {
        LaunchView launchView = this.launchView;
        if (launchView != null) {
            launchView.touch();
        }
        return super.dispatchTouchEvent(ev);
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return dvi.f;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return 0;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.p004activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        LaunchView launchView = this.launchView;
        if (launchView != null) {
            launchView.switchMode();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.sport.view.launch.Hilt_LaunchSportActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setActionBarNormalTitleMode();
        setSportType();
        ((LaunchSportViewModel) getMViewModel()).initViewModel();
        initView();
        initData();
        LaunchView launchView = this.launchView;
        if (launchView != null) {
            launchView.onCreate(savedInstanceState);
        }
        LaunchView launchView2 = this.launchView;
        if (launchView2 != null) {
            launchView2.switchMode();
        }
        RebootSportKt.rebootSport(this.sportType);
        ((LaunchSportViewModel) getMViewModel()).addOnDeviceStatusListener(this.onDeviceStatusListener);
        ((LaunchSportViewModel) getMViewModel()).addAccessoryDeviceStateListener(this.onAccessoryDeviceStateListener);
        initSportMusic();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.sport.view.launch.Hilt_LaunchSportActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.locationCallback = null;
        if (this.sportType != 3) {
            getLocationSignalManager().k();
        }
        getLocationSignalManager().e();
        getLaunchSportModel().stopRefreshGpsStatus();
        LaunchView launchView = this.launchView;
        if (launchView != null) {
            launchView.onDestroy();
        }
        ((LaunchSportViewModel) getMViewModel()).removeDeviceStatusListener(this.onDeviceStatusListener);
        ((LaunchSportViewModel) getMViewModel()).removeAccessoryDeviceStateListener(this.onAccessoryDeviceStateListener);
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        LaunchView launchView = this.launchView;
        if (launchView != null) {
            launchView.onPause();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    @SuppressLint({"WrongConstant"})
    public void onResume() {
        super.onResume();
        SportManagerExtKt.getInstance(ISportRemoteState.INSTANCE).refreshSportRemind(this.sportType, null);
        LaunchView launchView = this.launchView;
        if (launchView != null) {
            launchView.onResume();
        }
        if (this.sportType != 3 && LocationExtKt.supportsOutdoorSportPositionService(this) && PermissionExtKt.isPermissionGranted(this, "android.permission.ACCESS_FINE_LOCATION")) {
            getLocationSignalManager().j();
            getLaunchSportModel().refreshGpsStatus();
            FitnessLogUtils.i(BaseBindingActivity.TAG, "onResume , startLocation");
            LaunchView launchView2 = this.launchView;
            if (launchView2 != null) {
                launchView2.startLocation();
            }
        }
        LaunchView launchView3 = this.launchView;
        if (launchView3 != null) {
            launchView3.setLocationPermission();
        }
        ((LaunchSportViewModel) getMViewModel()).getPlayList();
    }

    @Override // miuix.appcompat.app.AppCompatActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(@NotNull Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.onSaveInstanceState(outState);
        LaunchView launchView = this.launchView;
        if (launchView != null) {
            launchView.onSaveInstanceState(outState);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        LaunchView launchView = this.launchView;
        if (launchView != null) {
            launchView.onStart();
        }
    }

    @Override // miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        LaunchView launchView = this.launchView;
        if (launchView != null) {
            launchView.onStop();
        }
        if (this.sportType != 3) {
            getLocationSignalManager().k();
        }
    }
}
