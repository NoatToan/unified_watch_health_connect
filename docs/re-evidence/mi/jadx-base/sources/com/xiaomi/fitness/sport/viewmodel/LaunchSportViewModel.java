package com.xiaomi.fitness.sport.viewmodel;

import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.CoroutineLiveDataKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.LiveDataScope;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.facebook.react.bridge.BaseJavaModule;
import com.fitness.banner.export.BannerExtKt;
import com.fitness.banner.export.BannerRequestParamV2;
import com.fitness.banner.export.IBanner;
import com.fitness.banner.export.v2.BannerItemV2;
import com.miui.tsmclient.entity.CardInfo;
import com.xiaomi.fit.data.common.data.sport.Location;
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import com.xiaomi.fit.fitness.parser.sport.base.SportReportBaseParser;
import com.xiaomi.fitness.baseui.BaseViewModel;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.manager.OnDeviceStatusListener;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.OnAccessoryDeviceStateListener;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeProgressBar;
import com.xiaomi.fitness.login.export.RegionExtKt;
import com.xiaomi.fitness.login.export.RegionManager;
import com.xiaomi.fitness.net.response.ApiException;
import com.xiaomi.fitness.sport.bean.BaseSportItemBean;
import com.xiaomi.fitness.sport.bean.WeatherRequestData;
import com.xiaomi.fitness.sport.interfaces.ISportDataListener;
import com.xiaomi.fitness.sport.model.LaunchSportModel;
import com.xiaomi.fitness.sport.model.weather.WeatherRequest;
import com.xiaomi.fitness.sport.model.weather.WeatherResponse;
import com.xiaomi.fitness.sport.route.detail.server.RouteRepository;
import com.xiaomi.fitness.sport.utils.WrapperSportDistanceModel;
import com.xiaomi.fitness.sport.view.launch.adapter.ConnectedDeviceBadgeModel;
import com.xiaomi.fitness.sport.view.route.RunningRouteListBean;
import com.xiaomi.fitness.sport.viewmodel.LaunchSportViewModel;
import com.xiaomi.fitness.sport_manager_export.di.SportManagerExtKt;
import com.xiaomi.fitness.sport_manager_export.listener.IMusicCallback;
import com.xiaomi.fitness.sport_manager_export.listener.IMusicPlayer;
import com.xiaomi.fitness.sport_manager_export.listener.MusicData;
import com.xiaomi.fitness.sport_manager_export.listener.Result;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000Æ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003B\t\b\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010<\u001a\u00020=J\u0012\u0010>\u001a\u00020=2\b\u0010?\u001a\u0004\u0018\u00010@H\u0016J\u0016\u0010A\u001a\u00020=2\f\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016J\u0010\u0010C\u001a\u00020=2\u0006\u0010D\u001a\u00020\u0010H\u0016J\u0006\u0010E\u001a\u00020=J\u0006\u0010F\u001a\u00020=J\u0010\u0010G\u001a\u00020=2\u0006\u0010H\u001a\u00020IH\u0016J\u0010\u0010J\u001a\u00020=2\u0006\u0010H\u001a\u00020IH\u0016J\u0010\u0010K\u001a\u00020=2\u0006\u0010H\u001a\u00020IH\u0016J\u0010\u0010L\u001a\u00020=2\u0006\u0010H\u001a\u00020IH\u0016J\u000e\u0010M\u001a\u00020=2\u0006\u0010N\u001a\u00020OJ\u000e\u0010P\u001a\u00020=2\u0006\u0010N\u001a\u00020OJ\u000e\u0010Q\u001a\u00020=2\u0006\u0010R\u001a\u00020SJ\u000e\u0010T\u001a\u00020=2\u0006\u0010R\u001a\u00020SJ\u0006\u0010X\u001a\u00020=J\u0010\u0010Y\u001a\u0004\u0018\u00010V2\u0006\u0010Z\u001a\u00020\u0010J\u0016\u0010[\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010]0\\2\u0006\u0010^\u001a\u00020_J\u0006\u0010`\u001a\u00020=J*\u0010a\u001a\b\u0012\u0004\u0012\u00020\u001a0\n2\f\u0010b\u001a\b\u0012\u0004\u0012\u00020\u001d0\n2\f\u0010c\u001a\b\u0012\u0004\u0012\u00020\u001a0\nH\u0002J\u0016\u0010d\u001a\u00020=2\u0006\u0010e\u001a\u00020\u00102\u0006\u0010f\u001a\u00020gJ\u0006\u0010q\u001a\u00020=J\u0006\u0010r\u001a\u00020=J\u000e\u0010s\u001a\u00020=2\u0006\u0010t\u001a\u00020uR(\u0010\b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\n\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000eR\u001a\u0010\u0013\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\fR\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\t¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\fR\u001e\u0010\u001f\u001a\u00020 8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001e\u0010%\u001a\u00020&8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R$\u0010,\u001a\u00020\u001d2\u0006\u0010+\u001a\u00020\u001d@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R(\u00101\u001a\u0004\u0018\u00010\u00102\b\u0010+\u001a\u0004\u0018\u00010\u0010@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u001e\u00106\u001a\u0002078\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u001d\u0010U\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020V0\n0\t¢\u0006\b\n\u0000\u001a\u0004\bW\u0010\fR\u0017\u0010h\u001a\b\u0012\u0004\u0012\u00020i0\t¢\u0006\b\n\u0000\u001a\u0004\bj\u0010\fR\u0019\u0010k\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010l0\t¢\u0006\b\n\u0000\u001a\u0004\bm\u0010\fR\u0017\u0010n\u001a\b\u0012\u0004\u0012\u00020o0\t¢\u0006\b\n\u0000\u001a\u0004\bp\u0010\f¨\u0006v"}, d2 = {"Lcom/xiaomi/fitness/sport/viewmodel/LaunchSportViewModel;", "Lcom/xiaomi/fitness/baseui/BaseViewModel;", "Lcom/xiaomi/fitness/sport/model/LaunchSportModel;", "Lcom/xiaomi/fitness/sport/interfaces/ISportDataListener;", "", "Lcom/xiaomi/fitness/sport/bean/BaseSportItemBean;", "<init>", "()V", "list", "Landroidx/lifecycle/MutableLiveData;", "", "getList", "()Landroidx/lifecycle/MutableLiveData;", "setList", "(Landroidx/lifecycle/MutableLiveData;)V", "hrData", "", "getHrData", "setHrData", "mWearableDeviceManager", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceManager;", "getMWearableDeviceManager", "()Lcom/xiaomi/fitness/device/manager/export/WearableDeviceManager;", "setMWearableDeviceManager", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceManager;)V", "bannerItemListLiveData", "Lcom/fitness/banner/export/v2/BannerItemV2;", "getBannerItemListLiveData", "heartRateLiveData", "", "getHeartRateLiveData", BaseJavaModule.METHOD_TYPE_SYNC, "Lcom/xiaomi/fitness/device/contact/export/DeviceContact;", "getSync", "()Lcom/xiaomi/fitness/device/contact/export/DeviceContact;", "setSync", "(Lcom/xiaomi/fitness/device/contact/export/DeviceContact;)V", "weatherRequest", "Lcom/xiaomi/fitness/sport/model/weather/WeatherRequest;", "getWeatherRequest", "()Lcom/xiaomi/fitness/sport/model/weather/WeatherRequest;", "setWeatherRequest", "(Lcom/xiaomi/fitness/sport/model/weather/WeatherRequest;)V", "value", DailyRecordKey.sportType, "getSportType", "()I", "setSportType", "(I)V", "sportName", "getSportName", "()Ljava/lang/String;", "setSportName", "(Ljava/lang/String;)V", "routeRepository", "Lcom/xiaomi/fitness/sport/route/detail/server/RouteRepository;", "getRouteRepository", "()Lcom/xiaomi/fitness/sport/route/detail/server/RouteRepository;", "setRouteRepository", "(Lcom/xiaomi/fitness/sport/route/detail/server/RouteRepository;)V", "initViewModel", "", "attach", "savedInstanceState", "Landroid/os/Bundle;", "onSuccess", "data", "onFail", "message", "refresh", "loadBanner", LifecycleConstantKt.ON_RESUME, CardInfo.KEY_OWNER, "Landroidx/lifecycle/LifecycleOwner;", LifecycleConstantKt.ON_STOP, "onCreate", LifecycleConstantKt.ON_DESTROY, "addAccessoryDeviceStateListener", "accessoryDeviceStateListener", "Lcom/xiaomi/fitness/device/manager/export/OnAccessoryDeviceStateListener;", "removeAccessoryDeviceStateListener", "addOnDeviceStatusListener", "deviceStatusListener", "Lcom/xiaomi/fitness/device/manager/OnDeviceStatusListener;", "removeDeviceStatusListener", "connectedDeviceBadgeModelListLiveData", "Lcom/xiaomi/fitness/sport/view/launch/adapter/ConnectedDeviceBadgeModel;", "getConnectedDeviceBadgeModelListLiveData", "loadPrimaryAndAccessoryConnectedDevice", "getBadgeModeFromDid", "did", "getRouteList", "Landroidx/lifecycle/LiveData;", "Lcom/xiaomi/fitness/sport/view/route/RunningRouteListBean;", "location", "Lcom/xiaomi/fit/data/common/data/sport/Location;", "requestOperationalBanners", "getFilteredBannerItemList", "requestIdList", "bannerItemList", "requestWeather", "locale", "requestParam", "Lcom/xiaomi/fitness/sport/bean/WeatherRequestData;", "totalDistanceLiveData", "Lcom/xiaomi/fitness/sport/utils/WrapperSportDistanceModel;", "getTotalDistanceLiveData", "weatherLiveData", "Lcom/xiaomi/fitness/sport/model/weather/WeatherResponse$Weather;", "getWeatherLiveData", "sportMusicData", "Lcom/xiaomi/fitness/sport_manager_export/listener/MusicData;", "getSportMusicData", "getPlayList", "getSportPlaylist", "toMusicZone", "context", "Landroid/content/Context;", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLaunchSportViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LaunchSportViewModel.kt\ncom/xiaomi/fitness/sport/viewmodel/LaunchSportViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,291:1\n1557#2:292\n1628#2,3:293\n1863#2,2:296\n1863#2:298\n1864#2:300\n1#3:299\n*S KotlinDebug\n*F\n+ 1 LaunchSportViewModel.kt\ncom/xiaomi/fitness/sport/viewmodel/LaunchSportViewModel\n*L\n161#1:292\n161#1:293,3\n175#1:296,2\n217#1:298\n217#1:300\n*E\n"})
public final class LaunchSportViewModel extends BaseViewModel<LaunchSportModel> implements ISportDataListener<List<BaseSportItemBean>> {

    @Nullable
    private MutableLiveData<String> hrData;
    public RouteRepository routeRepository;

    @Nullable
    private String sportName;
    private int sportType;
    public DeviceContact sync;
    public WeatherRequest weatherRequest;

    @Nullable
    private MutableLiveData<List<BaseSportItemBean>> list = new MutableLiveData<>();

    @NotNull
    private WearableDeviceManager mWearableDeviceManager = DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE);

    @NotNull
    private final MutableLiveData<List<BannerItemV2>> bannerItemListLiveData = new MutableLiveData<>();

    @NotNull
    private final MutableLiveData<Integer> heartRateLiveData = new MutableLiveData<>();

    @NotNull
    private final MutableLiveData<List<ConnectedDeviceBadgeModel>> connectedDeviceBadgeModelListLiveData = new MutableLiveData<>();

    @NotNull
    private final MutableLiveData<WrapperSportDistanceModel> totalDistanceLiveData = new MutableLiveData<>();

    @NotNull
    private final MutableLiveData<WeatherResponse.Weather> weatherLiveData = new MutableLiveData<>();

    @NotNull
    private final MutableLiveData<MusicData> sportMusicData = new MutableLiveData<>(null);

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport.viewmodel.LaunchSportViewModel$getPlayList$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sport.viewmodel.LaunchSportViewModel$getPlayList$1", f = "LaunchSportViewModel.kt", i = {}, l = {248}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return LaunchSportViewModel.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (DelayKt.delay(VibrateModeProgressBar.sLongToLong, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            Bundle bundle = new Bundle();
            bundle.putInt("mode", LaunchSportViewModel.this.getSportType() == 6 ? 2 : 1);
            IMusicPlayer launchInstance = SportManagerExtKt.getLaunchInstance(IMusicPlayer.INSTANCE);
            final LaunchSportViewModel launchSportViewModel = LaunchSportViewModel.this;
            launchInstance.executeAsync("set_sports_mode", bundle, false, new IMusicCallback() { // from class: com.xiaomi.fitness.sport.viewmodel.LaunchSportViewModel.getPlayList.1.1
                @Override // com.xiaomi.fitness.sport_manager_export.listener.IMusicCallback
                public void onMusiceCallback(Result result, MusicData musicData) {
                    Intrinsics.checkNotNullParameter(result, "result");
                    Intrinsics.checkNotNullParameter(musicData, "musicData");
                    if (result.getCode() == 0) {
                        launchSportViewModel.getSportPlaylist();
                    }
                }
            });
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport.viewmodel.LaunchSportViewModel$getRouteList$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/lifecycle/LiveDataScope;", "Lcom/xiaomi/fitness/sport/view/route/RunningRouteListBean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sport.viewmodel.LaunchSportViewModel$getRouteList$1", f = "LaunchSportViewModel.kt", i = {}, l = {185, SportReportBaseParser.ReportType.exitTime}, m = "invokeSuspend", n = {}, s = {})
    public static final class C30791 extends SuspendLambda implements Function2<LiveDataScope<RunningRouteListBean>, Continuation<? super Unit>, Object> {
        final /* synthetic */ Location $location;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C30791(Location location, Continuation<? super C30791> continuation) {
            super(2, continuation);
            this.$location = location;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C30791 c30791 = LaunchSportViewModel.this.new C30791(this.$location, continuation);
            c30791.L$0 = obj;
            return c30791;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<RunningRouteListBean> liveDataScope, Continuation<? super Unit> continuation) {
            return ((C30791) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.L$0;
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
            liveDataScope = (LiveDataScope) this.L$0;
            RouteRepository routeRepository = LaunchSportViewModel.this.getRouteRepository();
            Location location = this.$location;
            float f = (float) location.longitude;
            float f2 = (float) location.latitude;
            this.L$0 = liveDataScope;
            this.label = 1;
            obj = RouteRepository.getRouteRecommend$default(routeRepository, f, f2, 0, this, 4, null);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.L$0 = null;
            this.label = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport.viewmodel.LaunchSportViewModel$requestOperationalBanners$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sport.viewmodel.LaunchSportViewModel$requestOperationalBanners$1", f = "LaunchSportViewModel.kt", i = {0}, l = {201}, m = "invokeSuspend", n = {"requestIdList"}, s = {"L$0"})
    public static final class C30811 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;

        public C30811(Continuation<? super C30811> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return LaunchSportViewModel.this.new C30811(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            List list;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                List listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{Boxing.boxInt(7), Boxing.boxInt(8), Boxing.boxInt(9)});
                IBanner instance = BannerExtKt.getINSTANCE(IBanner.INSTANCE);
                String lowerCase = RegionExtKt.getInstance(RegionManager.INSTANCE).getLocalCountry().toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                BannerRequestParamV2 bannerRequestParamV2 = new BannerRequestParamV2(listListOf, lowerCase, null, null, 8, null);
                this.L$0 = listListOf;
                this.label = 1;
                Object bannerListV2 = instance.getBannerListV2(bannerRequestParamV2, this);
                if (bannerListV2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                list = listListOf;
                obj = bannerListV2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list = (List) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            LaunchSportViewModel.this.getBannerItemListLiveData().postValue(LaunchSportViewModel.this.getFilteredBannerItemList(list, (List) obj));
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C30811) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport.viewmodel.LaunchSportViewModel$toMusicZone$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.sport.viewmodel.LaunchSportViewModel$toMusicZone$1", f = "LaunchSportViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C30821 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Context $context;
        int label;
        final /* synthetic */ LaunchSportViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C30821(Context context, LaunchSportViewModel launchSportViewModel, Continuation<? super C30821> continuation) {
            super(2, continuation);
            this.$context = context;
            this.this$0 = launchSportViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C30821(this.$context, this.this$0, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            SportManagerExtKt.getInstance(IMusicPlayer.INSTANCE).goQQPlayer(this.$context, this.this$0.getSportType() == 6 ? 2 : 1);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C30821) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<BannerItemV2> getFilteredBannerItemList(List<Integer> requestIdList, List<BannerItemV2> bannerItemList) {
        Object next;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = requestIdList.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            Iterator<T> it2 = bannerItemList.iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
            } while (((BannerItemV2) next).getResourceId() != iIntValue);
            BannerItemV2 bannerItemV2 = (BannerItemV2) next;
            if (bannerItemV2 != null) {
                arrayList.add(bannerItemV2);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestWeather$lambda$4(LaunchSportViewModel this$0, WeatherResponse.Weather it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.weatherLiveData.setValue(it);
        Logger.i(this$0.getTAG(), "requestWeather succeeded. weather=" + it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestWeather$lambda$5(LaunchSportViewModel this$0, ApiException it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.i(this$0.getTAG(), "requestWeather failed. error=" + it);
        this$0.weatherLiveData.setValue(null);
        return Unit.INSTANCE;
    }

    public final void addAccessoryDeviceStateListener(@NotNull OnAccessoryDeviceStateListener accessoryDeviceStateListener) {
        Intrinsics.checkNotNullParameter(accessoryDeviceStateListener, "accessoryDeviceStateListener");
        this.mWearableDeviceManager.addAccessoryDeviceStateListener(accessoryDeviceStateListener);
    }

    public final void addOnDeviceStatusListener(@NotNull OnDeviceStatusListener deviceStatusListener) {
        Intrinsics.checkNotNullParameter(deviceStatusListener, "deviceStatusListener");
        this.mWearableDeviceManager.addDeviceStatusListener(deviceStatusListener);
    }

    @Override // com.xiaomi.fitness.baseui.BaseViewModel, com.xiaomi.fitness.baseui.AbsViewModel
    public void attach(@Nullable Bundle savedInstanceState) {
    }

    @Nullable
    public final ConnectedDeviceBadgeModel getBadgeModeFromDid(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        WearableDeviceManager.Companion companion = WearableDeviceManager.INSTANCE;
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(companion).getCurrentDeviceModel();
        List<WearableDeviceModel> accessoryDeviceModels = DeviceManagerExtKt.getInstance(companion).getAccessoryDeviceModels();
        if (Intrinsics.areEqual(wearableDeviceModel != null ? wearableDeviceModel.getDid() : null, did)) {
            return new ConnectedDeviceBadgeModel(wearableDeviceModel, true);
        }
        for (WearableDeviceModel wearableDeviceModel2 : accessoryDeviceModels) {
            if (Intrinsics.areEqual(wearableDeviceModel2.getDid(), did)) {
                return new ConnectedDeviceBadgeModel(wearableDeviceModel2, false);
            }
        }
        return null;
    }

    @NotNull
    public final MutableLiveData<List<BannerItemV2>> getBannerItemListLiveData() {
        return this.bannerItemListLiveData;
    }

    @NotNull
    public final MutableLiveData<List<ConnectedDeviceBadgeModel>> getConnectedDeviceBadgeModelListLiveData() {
        return this.connectedDeviceBadgeModelListLiveData;
    }

    @NotNull
    public final MutableLiveData<Integer> getHeartRateLiveData() {
        return this.heartRateLiveData;
    }

    @Nullable
    public final MutableLiveData<String> getHrData() {
        return this.hrData;
    }

    @Nullable
    public final MutableLiveData<List<BaseSportItemBean>> getList() {
        return this.list;
    }

    @NotNull
    public final WearableDeviceManager getMWearableDeviceManager() {
        return this.mWearableDeviceManager;
    }

    public final void getPlayList() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(null), 3, null);
    }

    @NotNull
    public final LiveData<RunningRouteListBean> getRouteList(@NotNull Location location) {
        Intrinsics.checkNotNullParameter(location, "location");
        return CoroutineLiveDataKt.liveData$default((CoroutineContext) null, 0L, new C30791(location, null), 3, (Object) null);
    }

    @NotNull
    public final RouteRepository getRouteRepository() {
        RouteRepository routeRepository = this.routeRepository;
        if (routeRepository != null) {
            return routeRepository;
        }
        Intrinsics.throwUninitializedPropertyAccessException("routeRepository");
        return null;
    }

    @NotNull
    public final MutableLiveData<MusicData> getSportMusicData() {
        return this.sportMusicData;
    }

    @Nullable
    public final String getSportName() {
        return this.sportName;
    }

    public final void getSportPlaylist() {
        SportManagerExtKt.getLaunchInstance(IMusicPlayer.INSTANCE).executeAsync("get_sports_playlist_info", null, false, new IMusicCallback() { // from class: com.xiaomi.fitness.sport.viewmodel.LaunchSportViewModel.getSportPlaylist.1
            @Override // com.xiaomi.fitness.sport_manager_export.listener.IMusicCallback
            public void onMusiceCallback(Result result, MusicData musicData) {
                Intrinsics.checkNotNullParameter(result, "result");
                Intrinsics.checkNotNullParameter(musicData, "musicData");
                if (result.getCode() == 0) {
                    LaunchSportViewModel.this.getSportMusicData().setValue(musicData);
                } else {
                    LaunchSportViewModel.this.getSportMusicData().setValue(new MusicData("", "", 0L, 4, null));
                }
            }
        });
    }

    public final int getSportType() {
        return this.sportType;
    }

    @NotNull
    public final DeviceContact getSync() {
        DeviceContact deviceContact = this.sync;
        if (deviceContact != null) {
            return deviceContact;
        }
        Intrinsics.throwUninitializedPropertyAccessException(BaseJavaModule.METHOD_TYPE_SYNC);
        return null;
    }

    @NotNull
    public final MutableLiveData<WrapperSportDistanceModel> getTotalDistanceLiveData() {
        return this.totalDistanceLiveData;
    }

    @NotNull
    public final MutableLiveData<WeatherResponse.Weather> getWeatherLiveData() {
        return this.weatherLiveData;
    }

    @NotNull
    public final WeatherRequest getWeatherRequest() {
        WeatherRequest weatherRequest = this.weatherRequest;
        if (weatherRequest != null) {
            return weatherRequest;
        }
        Intrinsics.throwUninitializedPropertyAccessException("weatherRequest");
        return null;
    }

    public final void initViewModel() {
        getMModel().register(this);
        this.hrData = getMModel().getHrData();
    }

    public final void loadBanner() {
        getMModel().loadBanner();
    }

    public final void loadPrimaryAndAccessoryConnectedDevice() {
        ArrayList arrayList = new ArrayList();
        WearableDeviceManager.Companion companion = WearableDeviceManager.INSTANCE;
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(companion).getCurrentDeviceModel();
        if (wearableDeviceModel != null && wearableDeviceModel.getIsDeviceConnected()) {
            arrayList.add(new ConnectedDeviceBadgeModel(wearableDeviceModel, true));
        }
        List<WearableDeviceModel> accessoryDeviceModels = DeviceManagerExtKt.getInstance(companion).getAccessoryDeviceModels();
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(accessoryDeviceModels, 10));
        for (WearableDeviceModel wearableDeviceModel2 : accessoryDeviceModels) {
            if (wearableDeviceModel2.getIsDeviceConnected()) {
                arrayList.add(new ConnectedDeviceBadgeModel(wearableDeviceModel2, false));
            }
            arrayList2.add(Unit.INSTANCE);
        }
        Logger.d(getTAG(), "loadPrimaryAndAccessoryConnectedDevice result=" + arrayList);
        this.connectedDeviceBadgeModelListLiveData.setValue(arrayList);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onCreate(@NotNull LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onCreate(owner);
        getMModel().init();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(@NotNull LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onDestroy(owner);
        getMModel().destroy();
    }

    @Override // com.xiaomi.fitness.sport.interfaces.ISportDataListener
    public void onFail(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onResume(@NotNull LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onResume(owner);
        getMModel().registerDeviceHr();
        getMModel().getWeather();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStop(@NotNull LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onStop(owner);
        getMModel().unRegisterDeviceHr();
    }

    public final void refresh() {
        getMModel().refresh();
    }

    public final void removeAccessoryDeviceStateListener(@NotNull OnAccessoryDeviceStateListener accessoryDeviceStateListener) {
        Intrinsics.checkNotNullParameter(accessoryDeviceStateListener, "accessoryDeviceStateListener");
        this.mWearableDeviceManager.removeAccessoryDeviceStateListener(accessoryDeviceStateListener);
    }

    public final void removeDeviceStatusListener(@NotNull OnDeviceStatusListener deviceStatusListener) {
        Intrinsics.checkNotNullParameter(deviceStatusListener, "deviceStatusListener");
        this.mWearableDeviceManager.removeDeviceStatusListener(deviceStatusListener);
    }

    public final void requestOperationalBanners() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C30811(null), 2, null);
    }

    public final void requestWeather(@NotNull String locale, @NotNull WeatherRequestData requestParam) {
        Intrinsics.checkNotNullParameter(locale, "locale");
        Intrinsics.checkNotNullParameter(requestParam, "requestParam");
        getWeatherRequest().getWeather(locale, requestParam, new Function1() { // from class: t5e
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return LaunchSportViewModel.requestWeather$lambda$4(this.f34335a, (WeatherResponse.Weather) obj);
            }
        }, new Function1() { // from class: u5e
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return LaunchSportViewModel.requestWeather$lambda$5(this.f35413a, (ApiException) obj);
            }
        });
    }

    public final void setHrData(@Nullable MutableLiveData<String> mutableLiveData) {
        this.hrData = mutableLiveData;
    }

    public final void setList(@Nullable MutableLiveData<List<BaseSportItemBean>> mutableLiveData) {
        this.list = mutableLiveData;
    }

    public final void setMWearableDeviceManager(@NotNull WearableDeviceManager wearableDeviceManager) {
        Intrinsics.checkNotNullParameter(wearableDeviceManager, "<set-?>");
        this.mWearableDeviceManager = wearableDeviceManager;
    }

    public final void setRouteRepository(@NotNull RouteRepository routeRepository) {
        Intrinsics.checkNotNullParameter(routeRepository, "<set-?>");
        this.routeRepository = routeRepository;
    }

    public final void setSportName(@Nullable String str) {
        this.sportName = str;
        getMModel().setSportTitle(str);
    }

    public final void setSportType(int i) {
        this.sportType = i;
        getMModel().setSportType(i);
    }

    public final void setSync(@NotNull DeviceContact deviceContact) {
        Intrinsics.checkNotNullParameter(deviceContact, "<set-?>");
        this.sync = deviceContact;
    }

    public final void setWeatherRequest(@NotNull WeatherRequest weatherRequest) {
        Intrinsics.checkNotNullParameter(weatherRequest, "<set-?>");
        this.weatherRequest = weatherRequest;
    }

    public final void toMusicZone(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C30821(context, this, null), 3, null);
    }

    @Override // com.xiaomi.fitness.sport.interfaces.ISportDataListener
    public void onSuccess(@NotNull List<BaseSportItemBean> data) {
        Intrinsics.checkNotNullParameter(data, "data");
        MutableLiveData<List<BaseSportItemBean>> mutableLiveData = this.list;
        if (mutableLiveData != null) {
            mutableLiveData.postValue(data);
        }
    }
}
