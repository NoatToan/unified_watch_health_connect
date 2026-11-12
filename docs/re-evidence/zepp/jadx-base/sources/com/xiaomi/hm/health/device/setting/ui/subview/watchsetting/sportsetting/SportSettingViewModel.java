package com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sportsetting;

import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.ViewModel;
import androidx.p008lifecycle.ViewModelKt;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bluetooth.profile.channel.module.settings.SettingsGroupType;
import com.huami.bluetooth.profile.channel.module.settings.SettingsModule;
import com.huami.bluetooth.profile.channel.module.settings.entity.sport.Sport;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.EnumData;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.Settings;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.Time;
import com.huami.devicex.R;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.device.setting.network.WatchSettingsManager;
import com.xiaomi.hm.health.device.setting.network.bean.WatchSettings;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.SettingsExtsKt;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.WatchSettingExtsKt;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.loading.LoadingVo;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sportsetting.gpssetting.enums.GpsMode;
import com.xmlywind.sdk.common.mta.PointCategory;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 62\u00020\u0001:\u00016B\u0007¢\u0006\u0004\b4\u00105J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u0004\u0018\u00010\u0002H\u0002J\u000e\u0010\u0006\u001a\u00020\u0005*\u0004\u0018\u00010\u0002H\u0002J.\u0010\r\u001a\u00020\f2&\u0010\u000b\u001a\"\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007j\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u0001`\nJ%\u0010\u0011\u001a\u00020\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u001f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u00138\u0006@\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00050\u00138\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0019\u0010\u0016R$\u0010!\u001a\u0004\u0018\u00010\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00050\u00138\u0006@\u0006¢\u0006\f\n\u0004\b\"\u0010\u0014\u001a\u0004\b#\u0010\u0016R\u001f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00030\u00138\u0006@\u0006¢\u0006\f\n\u0004\b%\u0010\u0014\u001a\u0004\b&\u0010\u0016R\u001f\u0010+\u001a\b\u0012\u0004\u0012\u00020(0\u00138\u0006@\u0006¢\u0006\f\n\u0004\b)\u0010\u0014\u001a\u0004\b*\u0010\u0016R6\u0010\u000b\u001a\"\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007j\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u0001`\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0018\u00101\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0018\u00103\u001a\u0004\u0018\u00010\u00028B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u00102¨\u00067"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/sportsetting/SportSettingViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/huami/bluetooth/profile/channel/module/settings/entity/sport/Sport;", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/sportsetting/AGpsOutOfDateVo;", "a", "", "c", "Ljava/util/HashMap;", "Lcom/huami/bluetooth/profile/channel/module/settings/SettingsGroupType;", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Settings;", "Lkotlin/collections/HashMap;", "watchSettings", "", PointCategory.LOAD, "enable", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Time;", "time", "setAGpsOutOfDateAlert", "(Ljava/lang/Boolean;Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Time;)V", "Landroidx/lifecycle/MutableLiveData;", "Landroidx/lifecycle/MutableLiveData;", "getSportRecognizeVisibleLiveData", "()Landroidx/lifecycle/MutableLiveData;", "sportRecognizeVisibleLiveData", "b", "getGpsSettingVisibleLiveData", "gpsSettingVisibleLiveData", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/sportsetting/gpssetting/enums/GpsMode;", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/sportsetting/gpssetting/enums/GpsMode;", "getCurrGpsMode", "()Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/sportsetting/gpssetting/enums/GpsMode;", "setCurrGpsMode", "(Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/sportsetting/gpssetting/enums/GpsMode;)V", "currGpsMode", GoogleApiAvailabilityLight.a, "getAGpsOutOfDateVisibleLiveData", "aGpsOutOfDateVisibleLiveData", "e", "getAGpsOutOfDateLiveData", "aGpsOutOfDateLiveData", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/loading/LoadingVo;", "f", "getLoadingLiveData", "loadingLiveData", "g", "Ljava/util/HashMap;", "Lcom/huami/bluetooth/profile/channel/module/settings/SettingsModule;", "h", "Lcom/huami/bluetooth/profile/channel/module/settings/SettingsModule;", "settingsModule", "()Lcom/huami/bluetooth/profile/channel/module/settings/entity/sport/Sport;", "sport", "<init>", "()V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class SportSettingViewModel extends ViewModel {

    @NotNull
    private static final String i = "SportSettingViewModel";

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private GpsMode currGpsMode;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    private HashMap<SettingsGroupType, Settings> watchSettings;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    private SettingsModule settingsModule;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Boolean> sportRecognizeVisibleLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Boolean> gpsSettingVisibleLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Boolean> aGpsOutOfDateVisibleLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<AGpsOutOfDateVo> aGpsOutOfDateLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<LoadingVo> loadingLiveData = new MutableLiveData<>();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sportsetting.SportSettingViewModel$load$1", f = "SportSettingViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ HashMap<SettingsGroupType, Settings> c;

        /* JADX INFO: renamed from: com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sportsetting.SportSettingViewModel$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0862a extends Lambda implements Function0<String> {
            public static final C0862a a = new C0862a();

            public C0862a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "not support aGpsOutOfDate";
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(HashMap<SettingsGroupType, Settings> map, Continuation<? super a> continuation) {
            super(2, continuation);
            this.c = map;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return SportSettingViewModel.this.new a(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            EnumData gpsMode;
            Integer numBoxInt;
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            LoadingVo.Companion companion = LoadingVo.INSTANCE;
            LoadingVo.Companion.postStartMsg$default(companion, SportSettingViewModel.this.getLoadingLiveData(), null, 2, null);
            SportSettingViewModel.this.watchSettings = this.c;
            MutableLiveData<Boolean> sportRecognizeVisibleLiveData = SportSettingViewModel.this.getSportRecognizeVisibleLiveData();
            Sport sportB = SportSettingViewModel.this.b();
            sportRecognizeVisibleLiveData.postValue(Boxing.boxBoolean((sportB == null ? null : sportB.getSportRecognitionTypes()) != null));
            Sport sportB2 = SportSettingViewModel.this.b();
            if (sportB2 != null && (gpsMode = sportB2.getGpsMode()) != null && (numBoxInt = Boxing.boxInt(gpsMode.getValue())) != null) {
                SportSettingViewModel.this.setCurrGpsMode(GpsMode.INSTANCE.fromValue(numBoxInt.intValue()));
            }
            MutableLiveData<Boolean> gpsSettingVisibleLiveData = SportSettingViewModel.this.getGpsSettingVisibleLiveData();
            SportSettingViewModel sportSettingViewModel = SportSettingViewModel.this;
            gpsSettingVisibleLiveData.postValue(Boxing.boxBoolean(sportSettingViewModel.c(sportSettingViewModel.b())));
            Sport sportB3 = SportSettingViewModel.this.b();
            AGpsOutOfDateVo aGpsOutOfDateVoA = sportB3 == null ? null : SportSettingViewModel.this.a(sportB3);
            SportSettingViewModel.this.getAGpsOutOfDateVisibleLiveData().postValue(Boxing.boxBoolean(aGpsOutOfDateVoA != null));
            if (aGpsOutOfDateVoA != null) {
                SportSettingViewModel.this.getAGpsOutOfDateLiveData().postValue(aGpsOutOfDateVoA);
            } else {
                HMLog.error$default(null, null, null, C0862a.a, 7, null);
            }
            LoadingVo.Companion.postCancelMsg$default(companion, SportSettingViewModel.this.getLoadingLiveData(), null, 2, null);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z) {
            super(0);
            this.a = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "gps visibility: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sportsetting.SportSettingViewModel$setAGpsOutOfDateAlert$1", f = "SportSettingViewModel.kt", i = {}, l = {84, 91}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ Boolean c;
        public final /* synthetic */ Time d;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sportsetting.SportSettingViewModel$setAGpsOutOfDateAlert$1$1", f = "SportSettingViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ Boolean b;
            public final /* synthetic */ Time c;
            public final /* synthetic */ SportSettingViewModel d;

            /* JADX INFO: renamed from: com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sportsetting.SportSettingViewModel$c$a$a, reason: collision with other inner class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/network/bean/WatchSettings;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class C0863a extends Lambda implements Function1<WatchSettings, Unit> {
                public final /* synthetic */ boolean a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0863a(boolean z) {
                    super(1);
                    this.a = z;
                }

                public final void a(@NotNull WatchSettings watchSettings) {
                    com.xiaomi.hm.health.device.setting.network.bean.Sport sport = watchSettings.getSport();
                    if (sport == null) {
                        return;
                    }
                    sport.setAGpsOutOfDateRemindSwitch(Boolean.valueOf(this.a));
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(WatchSettings watchSettings) {
                    a(watchSettings);
                    return Unit.INSTANCE;
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/network/bean/WatchSettings;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class b extends Lambda implements Function1<WatchSettings, Unit> {
                public final /* synthetic */ Time a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(Time time) {
                    super(1);
                    this.a = time;
                }

                public final void a(@NotNull WatchSettings watchSettings) {
                    com.xiaomi.hm.health.device.setting.network.bean.Sport sport = watchSettings.getSport();
                    if (sport == null) {
                        return;
                    }
                    sport.setAGpsOutOfDateRemindTime(Integer.valueOf(WatchSettingExtsKt.toMinutes(this.a)));
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(WatchSettings watchSettings) {
                    a(watchSettings);
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Boolean bool, Time time, SportSettingViewModel sportSettingViewModel, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = bool;
                this.c = time;
                this.d = sportSettingViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new a(this.b, this.c, this.d, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Boolean bool = this.b;
                if (bool != null) {
                    SportSettingViewModel sportSettingViewModel = this.d;
                    boolean zBooleanValue = bool.booleanValue();
                    Sport sportB = sportSettingViewModel.b();
                    if (sportB != null) {
                        sportB.setAGpsOutOfDateRemindSwitch(Boxing.boxBoolean(zBooleanValue));
                    }
                    WatchSettingsManager.modify$default(WatchSettingExtsKt.getWatchSettingManager(), false, new C0863a(zBooleanValue), 1, null);
                }
                Time time = this.c;
                if (time == null) {
                    return null;
                }
                SportSettingViewModel sportSettingViewModel2 = this.d;
                Sport sportB2 = sportSettingViewModel2.b();
                Time aGpsOutOfDateRemindTime = sportB2 == null ? null : sportB2.getAGpsOutOfDateRemindTime();
                if (aGpsOutOfDateRemindTime != null) {
                    aGpsOutOfDateRemindTime.setHour(time.getHour());
                }
                Sport sportB3 = sportSettingViewModel2.b();
                Time aGpsOutOfDateRemindTime2 = sportB3 == null ? null : sportB3.getAGpsOutOfDateRemindTime();
                if (aGpsOutOfDateRemindTime2 != null) {
                    aGpsOutOfDateRemindTime2.setMinute(time.getMinute());
                }
                WatchSettingsManager.modify$default(WatchSettingExtsKt.getWatchSettingManager(), false, new b(time), 1, null);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Boolean bool, Time time, Continuation<? super c> continuation) {
            super(2, continuation);
            this.c = bool;
            this.d = time;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return SportSettingViewModel.this.new c(this.c, this.d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:21:0x005c  */
        /* JADX WARN: Code duplicated, block: B:23:0x007e A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:26:0x0099 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:27:0x009b  */
        /* JADX WARN: Code duplicated, block: B:28:0x009d  */
        /* JADX WARN: Code duplicated, block: B:30:0x00a3 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:32:0x00a6  */
        /* JADX WARN: Code duplicated, block: B:33:0x00ab  */
        /* JADX WARN: Code duplicated, block: B:35:0x00b3  */
        /* JADX WARN: Code duplicated, block: B:37:0x00c4  */
        /* JADX WARN: Code duplicated, block: B:40:0x00e6  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            MainCoroutineDispatcher main;
            a aVar;
            Boolean enable;
            Time time;
            AGpsOutOfDateVo aGpsOutOfDateVo;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            boolean zBooleanValue = false;
            Time time2 = null;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                AGpsOutOfDateVo value = SportSettingViewModel.this.getAGpsOutOfDateLiveData().getValue();
                SportSettingViewModel sportSettingViewModel = SportSettingViewModel.this;
                enable = this.c;
                time = this.d;
                aGpsOutOfDateVo = value;
                MutableLiveData<AGpsOutOfDateVo> aGpsOutOfDateLiveData = sportSettingViewModel.getAGpsOutOfDateLiveData();
                if (enable == null) {
                    if (aGpsOutOfDateVo == null) {
                        enable = null;
                    } else {
                        enable = aGpsOutOfDateVo.getEnable();
                    }
                }
                if (time != null) {
                    time2 = time;
                } else if (aGpsOutOfDateVo != null) {
                    time2 = aGpsOutOfDateVo.getTime();
                }
                aGpsOutOfDateLiveData.postValue(new AGpsOutOfDateVo(enable, time2));
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            LoadingVo.Companion.postStartMsg$default(LoadingVo.INSTANCE, SportSettingViewModel.this.getLoadingLiveData(), null, 2, null);
            SettingsModule settingsModule = SportSettingViewModel.this.settingsModule;
            if (settingsModule != null) {
                Sport sport = new Sport();
                Boolean bool = this.c;
                Time time3 = this.d;
                sport.setAGpsOutOfDateRemindSwitch(bool);
                sport.setAGpsOutOfDateRemindTime(time3);
                Unit unit = Unit.INSTANCE;
                this.a = 1;
                obj = SettingsExtsKt.write(settingsModule, sport, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (zBooleanValue) {
                LoadingVo.Companion.postCancelMsg$default(LoadingVo.INSTANCE, SportSettingViewModel.this.getLoadingLiveData(), null, 2, null);
                main = Dispatchers.getMain();
                aVar = new a(this.c, this.d, SportSettingViewModel.this, null);
                this.a = 2;
                if (BuildersKt.withContext(main, aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                AGpsOutOfDateVo value2 = SportSettingViewModel.this.getAGpsOutOfDateLiveData().getValue();
                SportSettingViewModel sportSettingViewModel2 = SportSettingViewModel.this;
                enable = this.c;
                time = this.d;
                aGpsOutOfDateVo = value2;
                MutableLiveData<AGpsOutOfDateVo> aGpsOutOfDateLiveData2 = sportSettingViewModel2.getAGpsOutOfDateLiveData();
                if (enable == null) {
                    if (aGpsOutOfDateVo == null) {
                        enable = null;
                    } else {
                        enable = aGpsOutOfDateVo.getEnable();
                    }
                }
                if (time != null) {
                    time2 = time;
                } else if (aGpsOutOfDateVo != null) {
                    time2 = aGpsOutOfDateVo.getTime();
                }
                aGpsOutOfDateLiveData2.postValue(new AGpsOutOfDateVo(enable, time2));
            } else {
                LoadingVo.INSTANCE.postFailMsg(SportSettingViewModel.this.getLoadingLiveData(), R.string.long_sit_set_failed);
                if (this.c != null) {
                    AGpsOutOfDateVo value3 = SportSettingViewModel.this.getAGpsOutOfDateLiveData().getValue();
                    SportSettingViewModel.this.getAGpsOutOfDateLiveData().postValue(new AGpsOutOfDateVo(Boxing.boxBoolean(!this.c.booleanValue()), value3 != null ? value3.getTime() : null));
                }
            }
            return Unit.INSTANCE;
            Boolean bool2 = (Boolean) obj;
            if (bool2 != null) {
                zBooleanValue = bool2.booleanValue();
            }
            if (zBooleanValue) {
                LoadingVo.Companion.postCancelMsg$default(LoadingVo.INSTANCE, SportSettingViewModel.this.getLoadingLiveData(), null, 2, null);
                main = Dispatchers.getMain();
                aVar = new a(this.c, this.d, SportSettingViewModel.this, null);
                this.a = 2;
                if (BuildersKt.withContext(main, aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                AGpsOutOfDateVo value4 = SportSettingViewModel.this.getAGpsOutOfDateLiveData().getValue();
                SportSettingViewModel sportSettingViewModel3 = SportSettingViewModel.this;
                enable = this.c;
                time = this.d;
                aGpsOutOfDateVo = value4;
                MutableLiveData<AGpsOutOfDateVo> aGpsOutOfDateLiveData3 = sportSettingViewModel3.getAGpsOutOfDateLiveData();
                if (enable == null) {
                    if (aGpsOutOfDateVo == null) {
                        enable = null;
                    } else {
                        enable = aGpsOutOfDateVo.getEnable();
                    }
                }
                if (time != null) {
                    time2 = time;
                } else if (aGpsOutOfDateVo != null) {
                    time2 = aGpsOutOfDateVo.getTime();
                }
                aGpsOutOfDateLiveData3.postValue(new AGpsOutOfDateVo(enable, time2));
            } else {
                LoadingVo.INSTANCE.postFailMsg(SportSettingViewModel.this.getLoadingLiveData(), R.string.long_sit_set_failed);
                if (this.c != null) {
                    AGpsOutOfDateVo value5 = SportSettingViewModel.this.getAGpsOutOfDateLiveData().getValue();
                    SportSettingViewModel.this.getAGpsOutOfDateLiveData().postValue(new AGpsOutOfDateVo(Boxing.boxBoolean(!this.c.booleanValue()), value5 != null ? value5.getTime() : null));
                }
            }
            return Unit.INSTANCE;
        }
    }

    public SportSettingViewModel() {
        HMBaseDevice device = HMDeviceManager.getInstance().getDevice(HMDeviceType.MILI);
        this.settingsModule = device == null ? null : (SettingsModule) device.getChannelModule(SettingsModule.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AGpsOutOfDateVo a(Sport sport) {
        Boolean aGpsOutOfDateRemindSwitch;
        if (sport == null || (aGpsOutOfDateRemindSwitch = sport.getAGpsOutOfDateRemindSwitch()) == null) {
            return null;
        }
        boolean zBooleanValue = aGpsOutOfDateRemindSwitch.booleanValue();
        Time aGpsOutOfDateRemindTime = sport.getAGpsOutOfDateRemindTime();
        if (aGpsOutOfDateRemindTime == null) {
            return null;
        }
        return new AGpsOutOfDateVo(Boolean.valueOf(zBooleanValue), aGpsOutOfDateRemindTime);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Sport b() {
        HashMap<SettingsGroupType, Settings> map = this.watchSettings;
        Settings settings = map == null ? null : map.get(SettingsGroupType.SPORT);
        if (settings instanceof Sport) {
            return (Sport) settings;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean c(Sport sport) {
        boolean z = false;
        if (sport == null) {
            return false;
        }
        EnumData gpsMode = sport.getGpsMode();
        if (gpsMode != null && gpsMode.getContainDesc() && gpsMode.checkValid()) {
            z = true;
        }
        HMLog.info(i, new b(z));
        return z;
    }

    public static /* synthetic */ void setAGpsOutOfDateAlert$default(SportSettingViewModel sportSettingViewModel, Boolean bool, Time time, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            bool = null;
        }
        if ((i2 & 2) != 0) {
            time = null;
        }
        sportSettingViewModel.setAGpsOutOfDateAlert(bool, time);
    }

    @NotNull
    public final MutableLiveData<AGpsOutOfDateVo> getAGpsOutOfDateLiveData() {
        return this.aGpsOutOfDateLiveData;
    }

    @NotNull
    public final MutableLiveData<Boolean> getAGpsOutOfDateVisibleLiveData() {
        return this.aGpsOutOfDateVisibleLiveData;
    }

    @Nullable
    public final GpsMode getCurrGpsMode() {
        return this.currGpsMode;
    }

    @NotNull
    public final MutableLiveData<Boolean> getGpsSettingVisibleLiveData() {
        return this.gpsSettingVisibleLiveData;
    }

    @NotNull
    public final MutableLiveData<LoadingVo> getLoadingLiveData() {
        return this.loadingLiveData;
    }

    @NotNull
    public final MutableLiveData<Boolean> getSportRecognizeVisibleLiveData() {
        return this.sportRecognizeVisibleLiveData;
    }

    public final void load(@Nullable HashMap<SettingsGroupType, Settings> watchSettings) {
        e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new a(watchSettings, null), 2, null);
    }

    public final void setAGpsOutOfDateAlert(@Nullable Boolean enable, @Nullable Time time) {
        e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new c(enable, time, null), 2, null);
    }

    public final void setCurrGpsMode(@Nullable GpsMode gpsMode) {
        this.currGpsMode = gpsMode;
    }
}
