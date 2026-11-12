package com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sportsetting.gpsdiy;

import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.ViewModel;
import androidx.p008lifecycle.ViewModelKt;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bluetooth.profile.channel.module.settings.SettingsGroupType;
import com.huami.bluetooth.profile.channel.module.settings.SettingsModule;
import com.huami.bluetooth.profile.channel.module.settings.entity.sport.Sport;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.EnumData;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.Settings;
import com.huami.devicex.R;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.device.introduce.IntroduceShuffleFactoryKt;
import com.xiaomi.hm.health.device.setting.DeviceCenter;
import com.xiaomi.hm.health.device.setting.network.WatchSettingsManager;
import com.xiaomi.hm.health.device.setting.network.bean.WatchSettings;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.SettingsExtsKt;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.WatchSettingExtsKt;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.loading.LoadingVo;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sportsetting.gpssetting.enums.GpsDataInterval;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sportsetting.gpssetting.enums.GpsFrequency;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sportsetting.gpssetting.enums.GpsSetting;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sportsetting.gpssetting.enums.LocationCombination;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sportsetting.gpssetting.enums.SearchStarPreference;
import com.xmlywind.sdk.common.mta.PointCategory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 32\u00020\u00012\u00020\u0002:\u00013B\u0007¢\u0006\u0004\b1\u00102J\u0014\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004*\u00020\u0003H\u0002J\u0014\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004*\u00020\u0003H\u0002J\u0014\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0004*\u00020\u0003H\u0002J\u0014\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0004*\u00020\u0003H\u0002J\u001e\u0010\u0012\u001a\u00020\u00112\u000e\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\r0\u00042\u0006\u0010\u0010\u001a\u00020\u000fJ.\u0010\u0018\u001a\u00020\u00112&\u0010\u0017\u001a\"\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0013j\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0018\u0001`\u0016R\u001d\u0010\u001d\u001a\u00020\u00198B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR6\u0010\u0017\u001a\"\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0013j\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0018\u0001`\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u001eR\u001f\u0010$\u001a\b\u0012\u0004\u0012\u00020 0\u001f8\u0006@\u0006¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010#R-\u0010(\u001a\u0016\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\r0\u00040%0\u001f8\u0006@\u0006¢\u0006\f\n\u0004\b&\u0010!\u001a\u0004\b'\u0010#R\u0018\u0010,\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u001e\u0010.\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010-R\u0018\u00100\u001a\u0004\u0018\u00010\u00038B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b*\u0010/¨\u00064"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/sportsetting/gpsdiy/GpsDiyViewModel;", "Landroidx/lifecycle/ViewModel;", "Lorg/koin/core/component/KoinComponent;", "Lcom/huami/bluetooth/profile/channel/module/settings/entity/sport/Sport;", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/sportsetting/gpsdiy/GpsDiyVo;", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/sportsetting/gpssetting/enums/LocationCombination;", "c", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/sportsetting/gpssetting/enums/GpsDataInterval;", "a", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/sportsetting/gpssetting/enums/SearchStarPreference;", "f", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/sportsetting/gpssetting/enums/GpsFrequency;", "b", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/sportsetting/gpssetting/enums/GpsSetting;", "gpsDiyVo", "", "index", "", "writeSetting", "Ljava/util/HashMap;", "Lcom/huami/bluetooth/profile/channel/module/settings/SettingsGroupType;", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Settings;", "Lkotlin/collections/HashMap;", "watchSettings", PointCategory.LOAD, "Lcom/xiaomi/hm/health/device/setting/DeviceCenter;", "Lkotlin/Lazy;", "getDeviceCenter", "()Lcom/xiaomi/hm/health/device/setting/DeviceCenter;", "deviceCenter", "Ljava/util/HashMap;", "Landroidx/lifecycle/MutableLiveData;", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/loading/LoadingVo;", "Landroidx/lifecycle/MutableLiveData;", "getLoadingLiveData", "()Landroidx/lifecycle/MutableLiveData;", "loadingLiveData", "", GoogleApiAvailabilityLight.a, "getGpsDiySettingLiveData", "gpsDiySettingLiveData", "Lcom/huami/bluetooth/profile/channel/module/settings/SettingsModule;", "e", "Lcom/huami/bluetooth/profile/channel/module/settings/SettingsModule;", "settingsModule", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/sportsetting/gpsdiy/GpsDiyVo;", "locationCombination", "()Lcom/huami/bluetooth/profile/channel/module/settings/entity/sport/Sport;", "sport", "<init>", "()V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class GpsDiyViewModel extends ViewModel implements KoinComponent {

    @NotNull
    private static final String g = "GpsDiyViewModel";
    private static final int h = 5;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceCenter;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private HashMap<SettingsGroupType, Settings> watchSettings;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<LoadingVo> loadingLiveData;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<List<GpsDiyVo<? extends GpsSetting>>> gpsDiySettingLiveData;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private final SettingsModule settingsModule;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    private GpsDiyVo<LocationCombination> locationCombination;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sportsetting.gpsdiy.GpsDiyViewModel$load$1", f = "GpsDiyViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return GpsDiyViewModel.this.new a(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            GpsDiyVo gpsDiyVoA;
            GpsDiyVo gpsDiyVoF;
            GpsDiyVo gpsDiyVoC;
            GpsDiyVo gpsDiyVoB;
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            LoadingVo.Companion companion = LoadingVo.INSTANCE;
            LoadingVo.Companion.postStartMsg$default(companion, GpsDiyViewModel.this.getLoadingLiveData(), null, 2, null);
            ArrayList arrayList = new ArrayList();
            Sport sportE = GpsDiyViewModel.this.e();
            boolean z = false;
            if (sportE != null && (gpsDiyVoB = GpsDiyViewModel.this.b(sportE)) != null) {
                z = gpsDiyVoB.getSelectItem() == GpsFrequency.MULTI;
                Boxing.boxBoolean(arrayList.add(gpsDiyVoB));
            }
            Sport sportE2 = GpsDiyViewModel.this.e();
            if (sportE2 != null && (gpsDiyVoC = GpsDiyViewModel.this.c(sportE2)) != null) {
                GpsDiyViewModel gpsDiyViewModel = GpsDiyViewModel.this;
                gpsDiyVoC.setEnable(true ^ z);
                gpsDiyViewModel.locationCombination = gpsDiyVoC;
                Boxing.boxBoolean(arrayList.add(gpsDiyVoC));
            }
            Sport sportE3 = GpsDiyViewModel.this.e();
            if (sportE3 != null && (gpsDiyVoF = GpsDiyViewModel.this.f(sportE3)) != null) {
                Boxing.boxBoolean(arrayList.add(gpsDiyVoF));
            }
            Sport sportE4 = GpsDiyViewModel.this.e();
            if (sportE4 != null && (gpsDiyVoA = GpsDiyViewModel.this.a(sportE4)) != null) {
                Boxing.boxBoolean(arrayList.add(gpsDiyVoA));
            }
            LoadingVo.Companion.postCancelMsg$default(companion, GpsDiyViewModel.this.getLoadingLiveData(), null, 2, null);
            GpsDiyViewModel.this.getGpsDiySettingLiveData().postValue(CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList));
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sportsetting.gpsdiy.GpsDiyViewModel$writeSetting$1", f = "GpsDiyViewModel.kt", i = {0}, l = {99, 108}, m = "invokeSuspend", n = {"successAction"}, s = {"L$1"})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public Object a;
        public Object b;
        public int c;
        public final /* synthetic */ GpsDiyVo<? extends GpsSetting> e;
        public final /* synthetic */ int f;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ GpsDiyVo<? extends GpsSetting> a;
            public final /* synthetic */ int b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(GpsDiyVo<? extends GpsSetting> gpsDiyVo, int i) {
                super(0);
                this.a = gpsDiyVo;
                this.b = i;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "value: " + this.a.getList().get(this.b);
            }
        }

        /* JADX INFO: renamed from: com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sportsetting.gpsdiy.GpsDiyViewModel$b$b, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sportsetting.gpsdiy.GpsDiyViewModel$writeSetting$1$2", f = "GpsDiyViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C0865b extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ GpsDiyViewModel b;
            public final /* synthetic */ GpsSetting c;

            /* JADX INFO: renamed from: com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sportsetting.gpsdiy.GpsDiyViewModel$b$b$a */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/network/bean/WatchSettings;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class a extends Lambda implements Function1<WatchSettings, Unit> {
                public final /* synthetic */ GpsSetting a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(GpsSetting gpsSetting) {
                    super(1);
                    this.a = gpsSetting;
                }

                public final void a(@NotNull WatchSettings watchSettings) {
                    com.xiaomi.hm.health.device.setting.network.bean.Sport sport = watchSettings.getSport();
                    if (sport == null) {
                        return;
                    }
                    sport.setGpsSearchingPreference(Integer.valueOf(((SearchStarPreference) this.a).getValue()));
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(WatchSettings watchSettings) {
                    a(watchSettings);
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0865b(GpsDiyViewModel gpsDiyViewModel, GpsSetting gpsSetting, Continuation<? super C0865b> continuation) {
                super(1, continuation);
                this.b = gpsDiyViewModel;
                this.c = gpsSetting;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
                return new C0865b(this.b, this.c, continuation);
            }

            @Override // kotlin.jvm.functions.Function1
            @Nullable
            public final Object invoke(@Nullable Continuation<? super Unit> continuation) {
                return ((C0865b) create(continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                WatchSettingsManager.modify$default(WatchSettingExtsKt.getWatchSettingManager(), false, new a(this.c), 1, null);
                Sport sportE = this.b.e();
                EnumData gpsSearchingPreference = sportE != null ? sportE.getGpsSearchingPreference() : null;
                if (gpsSearchingPreference != null) {
                    gpsSearchingPreference.setValue(((SearchStarPreference) this.c).getValue());
                }
                return Unit.INSTANCE;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sportsetting.gpsdiy.GpsDiyViewModel$writeSetting$1$3", f = "GpsDiyViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class c extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ GpsDiyViewModel b;
            public final /* synthetic */ GpsSetting c;

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/network/bean/WatchSettings;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class a extends Lambda implements Function1<WatchSettings, Unit> {
                public final /* synthetic */ GpsSetting a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(GpsSetting gpsSetting) {
                    super(1);
                    this.a = gpsSetting;
                }

                public final void a(@NotNull WatchSettings watchSettings) {
                    com.xiaomi.hm.health.device.setting.network.bean.Sport sport;
                    com.xiaomi.hm.health.device.setting.network.bean.Sport sport2 = watchSettings.getSport();
                    if (sport2 != null) {
                        sport2.setGpsFrequencyBand(Integer.valueOf(((GpsFrequency) this.a).getValue()));
                    }
                    if (this.a != GpsFrequency.MULTI || (sport = watchSettings.getSport()) == null) {
                        return;
                    }
                    sport.setGpsSystemChoice(5);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(WatchSettings watchSettings) {
                    a(watchSettings);
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(GpsDiyViewModel gpsDiyViewModel, GpsSetting gpsSetting, Continuation<? super c> continuation) {
                super(1, continuation);
                this.b = gpsDiyViewModel;
                this.c = gpsSetting;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
                return new c(this.b, this.c, continuation);
            }

            @Override // kotlin.jvm.functions.Function1
            @Nullable
            public final Object invoke(@Nullable Continuation<? super Unit> continuation) {
                return ((c) create(continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                WatchSettingsManager.modify$default(WatchSettingExtsKt.getWatchSettingManager(), false, new a(this.c), 1, null);
                Sport sportE = this.b.e();
                EnumData gpsFrequencyBand = sportE == null ? null : sportE.getGpsFrequencyBand();
                if (gpsFrequencyBand != null) {
                    gpsFrequencyBand.setValue(((GpsFrequency) this.c).getValue());
                }
                if (this.c == GpsFrequency.MULTI) {
                    Sport sportE2 = this.b.e();
                    EnumData gpsSystemChoice = sportE2 != null ? sportE2.getGpsSystemChoice() : null;
                    if (gpsSystemChoice != null) {
                        gpsSystemChoice.setValue(5);
                    }
                }
                return Unit.INSTANCE;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sportsetting.gpsdiy.GpsDiyViewModel$writeSetting$1$4", f = "GpsDiyViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class d extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ GpsDiyViewModel b;
            public final /* synthetic */ GpsSetting c;

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/network/bean/WatchSettings;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class a extends Lambda implements Function1<WatchSettings, Unit> {
                public final /* synthetic */ GpsSetting a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(GpsSetting gpsSetting) {
                    super(1);
                    this.a = gpsSetting;
                }

                public final void a(@NotNull WatchSettings watchSettings) {
                    com.xiaomi.hm.health.device.setting.network.bean.Sport sport = watchSettings.getSport();
                    if (sport == null) {
                        return;
                    }
                    sport.setGpsSystemChoice(Integer.valueOf(((LocationCombination) this.a).getValue()));
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(WatchSettings watchSettings) {
                    a(watchSettings);
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(GpsDiyViewModel gpsDiyViewModel, GpsSetting gpsSetting, Continuation<? super d> continuation) {
                super(1, continuation);
                this.b = gpsDiyViewModel;
                this.c = gpsSetting;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
                return new d(this.b, this.c, continuation);
            }

            @Override // kotlin.jvm.functions.Function1
            @Nullable
            public final Object invoke(@Nullable Continuation<? super Unit> continuation) {
                return ((d) create(continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                WatchSettingsManager.modify$default(WatchSettingExtsKt.getWatchSettingManager(), false, new a(this.c), 1, null);
                Sport sportE = this.b.e();
                EnumData gpsSystemChoice = sportE != null ? sportE.getGpsSystemChoice() : null;
                if (gpsSystemChoice != null) {
                    gpsSystemChoice.setValue(((LocationCombination) this.c).getValue());
                }
                return Unit.INSTANCE;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sportsetting.gpsdiy.GpsDiyViewModel$writeSetting$1$5", f = "GpsDiyViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class e extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ GpsDiyViewModel b;
            public final /* synthetic */ GpsSetting c;

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/network/bean/WatchSettings;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class a extends Lambda implements Function1<WatchSettings, Unit> {
                public final /* synthetic */ GpsSetting a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(GpsSetting gpsSetting) {
                    super(1);
                    this.a = gpsSetting;
                }

                public final void a(@NotNull WatchSettings watchSettings) {
                    com.xiaomi.hm.health.device.setting.network.bean.Sport sport = watchSettings.getSport();
                    if (sport == null) {
                        return;
                    }
                    sport.setGpsDataInterval(Integer.valueOf(((GpsDataInterval) this.a).getInterval()));
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(WatchSettings watchSettings) {
                    a(watchSettings);
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(GpsDiyViewModel gpsDiyViewModel, GpsSetting gpsSetting, Continuation<? super e> continuation) {
                super(1, continuation);
                this.b = gpsDiyViewModel;
                this.c = gpsSetting;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
                return new e(this.b, this.c, continuation);
            }

            @Override // kotlin.jvm.functions.Function1
            @Nullable
            public final Object invoke(@Nullable Continuation<? super Unit> continuation) {
                return ((e) create(continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                WatchSettingsManager.modify$default(WatchSettingExtsKt.getWatchSettingManager(), false, new a(this.c), 1, null);
                Sport sportE = this.b.e();
                EnumData gpsDataInterval = sportE != null ? sportE.getGpsDataInterval() : null;
                if (gpsDataInterval != null) {
                    gpsDataInterval.setValue(((GpsDataInterval) this.c).getInterval());
                }
                return Unit.INSTANCE;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sportsetting.gpsdiy.GpsDiyViewModel$writeSetting$1$7", f = "GpsDiyViewModel.kt", i = {}, l = {108}, m = "invokeSuspend", n = {}, s = {})
        public static final class f extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ Ref.ObjectRef<Function1<Continuation<? super Unit>, Object>> b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public f(Ref.ObjectRef<Function1<Continuation<? super Unit>, Object>> objectRef, Continuation<? super f> continuation) {
                super(2, continuation);
                this.b = objectRef;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new f(this.b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Function1<Continuation<? super Unit>, Object> function1 = this.b.element;
                    if (function1 == null) {
                        return null;
                    }
                    this.a = 1;
                    if (function1.invoke(this) == coroutine_suspended) {
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
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(GpsDiyVo<? extends GpsSetting> gpsDiyVo, int i, Continuation<? super b> continuation) {
            super(2, continuation);
            this.e = gpsDiyVo;
            this.f = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return GpsDiyViewModel.this.new b(this.e, this.f, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:33:0x00f3  */
        /* JADX WARN: Code duplicated, block: B:35:0x00ff A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:36:0x0100  */
        /* JADX WARN: Code duplicated, block: B:42:0x010b A[DONT_INVERT, PHI: r1 r2 r7
          0x010b: PHI (r1v5 kotlin.jvm.internal.Ref$ObjectRef) = (r1v4 kotlin.jvm.internal.Ref$ObjectRef), (r1v7 kotlin.jvm.internal.Ref$ObjectRef) binds: [B:31:0x00f0, B:41:0x010a] A[DONT_GENERATE, DONT_INLINE]
          0x010b: PHI (r2v1 boolean) = (r2v0 boolean), (r2v6 boolean) binds: [B:31:0x00f0, B:41:0x010a] A[DONT_GENERATE, DONT_INLINE]
          0x010b: PHI (r7v22 java.lang.Boolean) = (r7v18 java.lang.Boolean), (r7v23 java.lang.Boolean) binds: [B:31:0x00f0, B:41:0x010a] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:43:0x010d  */
        /* JADX WARN: Code duplicated, block: B:46:0x0117  */
        /* JADX WARN: Code duplicated, block: B:49:0x0124  */
        /* JADX WARN: Code duplicated, block: B:51:0x0129  */
        /* JADX WARN: Code duplicated, block: B:57:0x014a A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:59:0x016a  */
        /* JADX WARN: Type inference failed for: r7v21, types: [T, com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sportsetting.gpsdiy.GpsDiyViewModel$b$b] */
        /* JADX WARN: Type inference failed for: r7v7, types: [T, com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sportsetting.gpsdiy.GpsDiyViewModel$b$e] */
        /* JADX WARN: Type inference failed for: r7v9, types: [T, com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sportsetting.gpsdiy.GpsDiyViewModel$b$d] */
        /* JADX WARN: Type inference failed for: r8v11, types: [T, com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sportsetting.gpsdiy.GpsDiyViewModel$b$c] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Ref.ObjectRef objectRef;
            Boolean boolBoxBoolean;
            SettingsModule settingsModule;
            Boolean bool;
            MainCoroutineDispatcher main;
            f fVar;
            boolean zBooleanValue;
            GpsDiyVo gpsDiyVo;
            GpsDiyVo gpsDiyVo2;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.c;
            boolean zBooleanValue2 = false;
            if (i != 0) {
                if (i == 1) {
                    objectRef = (Ref.ObjectRef) this.b;
                    bool = (Boolean) this.a;
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                GpsDiyViewModel.this.getGpsDiySettingLiveData().postValue(GpsDiyViewModel.this.getGpsDiySettingLiveData().getValue());
                LoadingVo.Companion.postCancelMsg$default(LoadingVo.INSTANCE, GpsDiyViewModel.this.getLoadingLiveData(), null, 2, null);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            LoadingVo.Companion.postStartMsg$default(LoadingVo.INSTANCE, GpsDiyViewModel.this.getLoadingLiveData(), null, 2, null);
            Sport sport = new Sport();
            HMLog.info(GpsDiyViewModel.g, new a(this.e, this.f));
            objectRef = new Ref.ObjectRef();
            GpsSetting gpsSetting = (GpsSetting) this.e.getList().get(this.f);
            if (!(gpsSetting instanceof SearchStarPreference)) {
                if (gpsSetting instanceof GpsFrequency) {
                    sport.setGpsFrequencyBand(new EnumData(((GpsFrequency) gpsSetting).getValue()));
                    if (gpsSetting == GpsFrequency.MULTI) {
                        sport.setGpsSystemChoice(new EnumData(5));
                    }
                    boolBoxBoolean = Boxing.boxBoolean(GpsFrequency.SINGLE == gpsSetting);
                    objectRef.element = new c(GpsDiyViewModel.this, gpsSetting, null);
                } else if (gpsSetting instanceof LocationCombination) {
                    sport.setGpsSystemChoice(new EnumData(((LocationCombination) gpsSetting).getValue()));
                    objectRef.element = new d(GpsDiyViewModel.this, gpsSetting, null);
                } else if (gpsSetting instanceof GpsDataInterval) {
                    sport.setGpsDataInterval(new EnumData(((GpsDataInterval) gpsSetting).getInterval()));
                    objectRef.element = new e(GpsDiyViewModel.this, gpsSetting, null);
                }
                settingsModule = GpsDiyViewModel.this.settingsModule;
                if (settingsModule == null) {
                    this.a = boolBoxBoolean;
                    this.b = objectRef;
                    this.c = 1;
                    obj = SettingsExtsKt.write(settingsModule, sport, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    bool = boolBoxBoolean;
                } else if (zBooleanValue2) {
                    this.e.setSelectIndex(this.f);
                    if (boolBoxBoolean != null) {
                        GpsDiyViewModel gpsDiyViewModel = GpsDiyViewModel.this;
                        zBooleanValue = boolBoxBoolean.booleanValue();
                        gpsDiyVo = gpsDiyViewModel.locationCombination;
                        if (gpsDiyVo != null) {
                            gpsDiyVo.setEnable(zBooleanValue);
                        }
                        if (!zBooleanValue && (gpsDiyVo2 = gpsDiyViewModel.locationCombination) != null) {
                            gpsDiyVo2.switchSelection(LocationCombination.GPS_ALL);
                        }
                    }
                    main = Dispatchers.getMain();
                    fVar = new f(objectRef, null);
                    this.a = null;
                    this.b = null;
                    this.c = 2;
                    if (BuildersKt.withContext(main, fVar, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    GpsDiyViewModel.this.getGpsDiySettingLiveData().postValue(GpsDiyViewModel.this.getGpsDiySettingLiveData().getValue());
                    LoadingVo.Companion.postCancelMsg$default(LoadingVo.INSTANCE, GpsDiyViewModel.this.getLoadingLiveData(), null, 2, null);
                } else {
                    LoadingVo.INSTANCE.postFailMsg(GpsDiyViewModel.this.getLoadingLiveData(), R.string.long_sit_set_failed);
                }
                return Unit.INSTANCE;
            }
            sport.setGpsSearchingPreference(new EnumData(((SearchStarPreference) gpsSetting).getValue()));
            objectRef.element = new C0865b(GpsDiyViewModel.this, gpsSetting, null);
            boolBoxBoolean = null;
            settingsModule = GpsDiyViewModel.this.settingsModule;
            if (settingsModule == null) {
                this.a = boolBoxBoolean;
                this.b = objectRef;
                this.c = 1;
                obj = SettingsExtsKt.write(settingsModule, sport, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                bool = boolBoxBoolean;
            } else if (zBooleanValue2) {
                this.e.setSelectIndex(this.f);
                if (boolBoxBoolean != null) {
                    GpsDiyViewModel gpsDiyViewModel2 = GpsDiyViewModel.this;
                    zBooleanValue = boolBoxBoolean.booleanValue();
                    gpsDiyVo = gpsDiyViewModel2.locationCombination;
                    if (gpsDiyVo != null) {
                        gpsDiyVo.setEnable(zBooleanValue);
                    }
                    if (!zBooleanValue) {
                        gpsDiyVo2.switchSelection(LocationCombination.GPS_ALL);
                    }
                }
                main = Dispatchers.getMain();
                fVar = new f(objectRef, null);
                this.a = null;
                this.b = null;
                this.c = 2;
                if (BuildersKt.withContext(main, fVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                GpsDiyViewModel.this.getGpsDiySettingLiveData().postValue(GpsDiyViewModel.this.getGpsDiySettingLiveData().getValue());
                LoadingVo.Companion.postCancelMsg$default(LoadingVo.INSTANCE, GpsDiyViewModel.this.getLoadingLiveData(), null, 2, null);
            } else {
                LoadingVo.INSTANCE.postFailMsg(GpsDiyViewModel.this.getLoadingLiveData(), R.string.long_sit_set_failed);
            }
            return Unit.INSTANCE;
            Boolean bool2 = (Boolean) obj;
            zBooleanValue2 = bool2 != null ? bool2.booleanValue() : false;
            boolBoxBoolean = bool;
            if (zBooleanValue2) {
                this.e.setSelectIndex(this.f);
                if (boolBoxBoolean != null) {
                    GpsDiyViewModel gpsDiyViewModel3 = GpsDiyViewModel.this;
                    zBooleanValue = boolBoxBoolean.booleanValue();
                    gpsDiyVo = gpsDiyViewModel3.locationCombination;
                    if (gpsDiyVo != null) {
                        gpsDiyVo.setEnable(zBooleanValue);
                    }
                    if (!zBooleanValue) {
                        gpsDiyVo2.switchSelection(LocationCombination.GPS_ALL);
                    }
                }
                main = Dispatchers.getMain();
                fVar = new f(objectRef, null);
                this.a = null;
                this.b = null;
                this.c = 2;
                if (BuildersKt.withContext(main, fVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                GpsDiyViewModel.this.getGpsDiySettingLiveData().postValue(GpsDiyViewModel.this.getGpsDiySettingLiveData().getValue());
                LoadingVo.Companion.postCancelMsg$default(LoadingVo.INSTANCE, GpsDiyViewModel.this.getLoadingLiveData(), null, 2, null);
            } else {
                LoadingVo.INSTANCE.postFailMsg(GpsDiyViewModel.this.getLoadingLiveData(), R.string.long_sit_set_failed);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GpsDiyViewModel() {
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Object[] objArr = 0 == true ? 1 : 0;
        final Object[] objArr2 = 0 == true ? 1 : 0;
        this.deviceCenter = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<DeviceCenter>() { // from class: com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sportsetting.gpsdiy.GpsDiyViewModel$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.xiaomi.hm.health.device.setting.DeviceCenter, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final DeviceCenter getA() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DeviceCenter.class), objArr, objArr2);
            }
        });
        this.loadingLiveData = new MutableLiveData<>();
        this.gpsDiySettingLiveData = new MutableLiveData<>();
        HMBaseDevice device = getDeviceCenter().getDevice();
        this.settingsModule = device != null ? (SettingsModule) device.getChannelModule(SettingsModule.class) : null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final GpsDiyVo<GpsDataInterval> a(Sport sport) {
        EnumData gpsDataInterval = sport.getGpsDataInterval();
        Integer numValueOf = gpsDataInterval == null ? null : Integer.valueOf(gpsDataInterval.index());
        if (numValueOf == null) {
            return null;
        }
        int iIntValue = numValueOf.intValue();
        EnumData gpsDataInterval2 = sport.getGpsDataInterval();
        ArrayList<Integer> enums = gpsDataInterval2 == null ? null : gpsDataInterval2.getEnums();
        if (enums == null) {
            return null;
        }
        String string = IntroduceShuffleFactoryKt.getString(R.string.ds_gps_diy_data_interval);
        String string2 = IntroduceShuffleFactoryKt.getString(R.string.ds_gps_diy_data_interval_tips);
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(enums, 10));
        Iterator<T> it2 = enums.iterator();
        while (it2.hasNext()) {
            arrayList.add(new GpsDataInterval(((Number) it2.next()).intValue()));
        }
        return new GpsDiyVo<>(iIntValue, string, string2, arrayList, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final GpsDiyVo<GpsFrequency> b(Sport sport) {
        EnumData gpsFrequencyBand = sport.getGpsFrequencyBand();
        Integer numValueOf = gpsFrequencyBand == null ? null : Integer.valueOf(gpsFrequencyBand.index());
        if (numValueOf == null) {
            return null;
        }
        int iIntValue = numValueOf.intValue();
        EnumData gpsFrequencyBand2 = sport.getGpsFrequencyBand();
        ArrayList<Integer> enums = gpsFrequencyBand2 == null ? null : gpsFrequencyBand2.getEnums();
        if (enums == null) {
            return null;
        }
        String string = IntroduceShuffleFactoryKt.getString(R.string.ds_gps_diy_frequencies);
        String string2 = IntroduceShuffleFactoryKt.getString(R.string.ds_gps_diy_frequencies_tips);
        ArrayList arrayList = new ArrayList();
        Iterator<T> it2 = enums.iterator();
        while (it2.hasNext()) {
            GpsFrequency gpsFrequencyFromValue = GpsFrequency.INSTANCE.fromValue(Integer.valueOf(((Number) it2.next()).intValue()));
            if (gpsFrequencyFromValue != null) {
                arrayList.add(gpsFrequencyFromValue);
            }
        }
        return new GpsDiyVo<>(iIntValue, string, string2, arrayList, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final GpsDiyVo<LocationCombination> c(Sport sport) {
        EnumData gpsSystemChoice = sport.getGpsSystemChoice();
        Integer numValueOf = gpsSystemChoice == null ? null : Integer.valueOf(gpsSystemChoice.index());
        if (numValueOf == null) {
            return null;
        }
        int iIntValue = numValueOf.intValue();
        EnumData gpsSystemChoice2 = sport.getGpsSystemChoice();
        ArrayList<Integer> enums = gpsSystemChoice2 == null ? null : gpsSystemChoice2.getEnums();
        if (enums == null) {
            return null;
        }
        String string = IntroduceShuffleFactoryKt.getString(R.string.ds_gps_diy_mode);
        String string2 = IntroduceShuffleFactoryKt.getString(R.string.ds_gps_diy_mode_tips);
        ArrayList arrayList = new ArrayList();
        Iterator<T> it2 = enums.iterator();
        while (it2.hasNext()) {
            LocationCombination locationCombinationFromValue = LocationCombination.INSTANCE.fromValue(Integer.valueOf(((Number) it2.next()).intValue()));
            if (locationCombinationFromValue != null) {
                arrayList.add(locationCombinationFromValue);
            }
        }
        return new GpsDiyVo<>(iIntValue, string, string2, arrayList, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Sport e() {
        HashMap<SettingsGroupType, Settings> map = this.watchSettings;
        Settings settings = map == null ? null : map.get(SettingsGroupType.SPORT);
        if (settings instanceof Sport) {
            return (Sport) settings;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final GpsDiyVo<SearchStarPreference> f(Sport sport) {
        EnumData gpsSearchingPreference = sport.getGpsSearchingPreference();
        Integer numValueOf = gpsSearchingPreference == null ? null : Integer.valueOf(gpsSearchingPreference.index());
        if (numValueOf == null) {
            return null;
        }
        int iIntValue = numValueOf.intValue();
        EnumData gpsSystemChoice = sport.getGpsSystemChoice();
        ArrayList<Integer> enums = gpsSystemChoice == null ? null : gpsSystemChoice.getEnums();
        if (enums == null) {
            return null;
        }
        String string = IntroduceShuffleFactoryKt.getString(R.string.ds_search_star_preference);
        String string2 = IntroduceShuffleFactoryKt.getString(R.string.ds_gps_diy_search_star_tips);
        ArrayList arrayList = new ArrayList();
        Iterator<T> it2 = enums.iterator();
        while (it2.hasNext()) {
            SearchStarPreference searchStarPreferenceFromValue = SearchStarPreference.INSTANCE.fromValue(Integer.valueOf(((Number) it2.next()).intValue()));
            if (searchStarPreferenceFromValue != null) {
                arrayList.add(searchStarPreferenceFromValue);
            }
        }
        return new GpsDiyVo<>(iIntValue, string, string2, arrayList, true);
    }

    private final DeviceCenter getDeviceCenter() {
        return (DeviceCenter) this.deviceCenter.getValue();
    }

    @NotNull
    public final MutableLiveData<List<GpsDiyVo<? extends GpsSetting>>> getGpsDiySettingLiveData() {
        return this.gpsDiySettingLiveData;
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @NotNull
    public final MutableLiveData<LoadingVo> getLoadingLiveData() {
        return this.loadingLiveData;
    }

    public final void load(@Nullable HashMap<SettingsGroupType, Settings> watchSettings) {
        this.watchSettings = watchSettings;
        e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new a(null), 2, null);
    }

    public final void writeSetting(@NotNull GpsDiyVo<? extends GpsSetting> gpsDiyVo, int index) {
        e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new b(gpsDiyVo, index, null), 2, null);
    }
}
