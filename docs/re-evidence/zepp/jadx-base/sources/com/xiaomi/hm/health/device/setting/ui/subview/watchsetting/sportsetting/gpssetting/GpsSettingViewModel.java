package com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sportsetting.gpssetting;

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
import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.device.setting.DeviceCenter;
import com.xiaomi.hm.health.device.setting.network.WatchSettingsManager;
import com.xiaomi.hm.health.device.setting.network.bean.WatchSettings;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.SettingsExtsKt;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.WatchSettingExtsKt;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.loading.LoadingVo;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sportsetting.gpssetting.enums.GpsFrequency;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sportsetting.gpssetting.enums.GpsMode;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sportsetting.gpssetting.enums.LocationCombination;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sportsetting.gpssetting.enums.SearchStarPreference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.sequences.SequencesKt___SequencesKt;
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
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 32\u00020\u00012\u00020\u0002:\u00013B\u0007¢\u0006\u0004\b1\u00102J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0002J\u000e\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003J.\u0010\r\u001a\u00020\u00052&\u0010\f\u001a\"\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bj\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u0001`\u000bR6\u0010\f\u001a\"\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bj\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u0001`\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R1\u0010\u001b\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00180\u00170\u00108\u0006@\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u001a\u0010\u0015R\u001d\u0010!\u001a\u00020\u001c8F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R$\u0010)\u001a\u0004\u0018\u00010\"8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001d\u0010-\u001a\u00020*8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010\u001e\u001a\u0004\b\u000e\u0010,R\u0018\u00100\u001a\u0004\u0018\u00010.8B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010/¨\u00064"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/sportsetting/gpssetting/GpsSettingViewModel;", "Landroidx/lifecycle/ViewModel;", "Lorg/koin/core/component/KoinComponent;", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/sportsetting/gpssetting/enums/GpsMode;", "gpsMode", "", "c", "setGpsMode", "Ljava/util/HashMap;", "Lcom/huami/bluetooth/profile/channel/module/settings/SettingsGroupType;", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Settings;", "Lkotlin/collections/HashMap;", "watchSettings", "loadGpsSetting", "a", "Ljava/util/HashMap;", "Landroidx/lifecycle/MutableLiveData;", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/loading/LoadingVo;", "b", "Landroidx/lifecycle/MutableLiveData;", "getLoadingLiveData", "()Landroidx/lifecycle/MutableLiveData;", "loadingLiveData", "Lkotlin/Pair;", "", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/sportsetting/gpssetting/GpsSettingVo;", "getGpsModeLiveData", "gpsModeLiveData", "Lcom/xiaomi/hm/health/device/setting/DeviceCenter;", GoogleApiAvailabilityLight.a, "Lkotlin/Lazy;", "getDeviceCenter", "()Lcom/xiaomi/hm/health/device/setting/DeviceCenter;", "deviceCenter", "Lcom/huami/bluetooth/profile/channel/module/settings/SettingsModule;", "e", "Lcom/huami/bluetooth/profile/channel/module/settings/SettingsModule;", "getSettingsModule", "()Lcom/huami/bluetooth/profile/channel/module/settings/SettingsModule;", "setSettingsModule", "(Lcom/huami/bluetooth/profile/channel/module/settings/SettingsModule;)V", "settingsModule", "Lcom/huami/devicex/manager/DeviceManagerApi;", "f", "()Lcom/huami/devicex/manager/DeviceManagerApi;", "deviceManagerApi", "Lcom/huami/bluetooth/profile/channel/module/settings/entity/sport/Sport;", "()Lcom/huami/bluetooth/profile/channel/module/settings/entity/sport/Sport;", "sport", "<init>", "()V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class GpsSettingViewModel extends ViewModel implements KoinComponent {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final ArrayList<HMDeviceSource> g = CollectionsKt__CollectionsKt.arrayListOf(HMDeviceSource.MILI_MADRID_W, HMDeviceSource.MILI_ANDES_W, HMDeviceSource.MILI_VERONA_W, HMDeviceSource.MILI_ZURICH_W, HMDeviceSource.MILI_BLED_W, HMDeviceSource.MILI_BLED_PRO_W, HMDeviceSource.MILI_CANNES_W);

    @NotNull
    private static final String h = "GpsSettingViewModel";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private HashMap<SettingsGroupType, Settings> watchSettings;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<LoadingVo> loadingLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Pair<GpsMode, List<GpsSettingVo>>> gpsModeLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceCenter;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private SettingsModule settingsModule;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceManagerApi;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u0004\u0018\u00010\u0002H\u0002J\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u0004\u0018\u00010\u0002H\u0002J\u0010\u0010\b\u001a\u0004\u0018\u00010\u0007*\u0004\u0018\u00010\u0002H\u0002J\u000e\u0010\n\u001a\u00020\t*\u0004\u0018\u00010\u0002H\u0002J \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\u000e2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\r\u001a\u00020\fH\u0002J\u000e\u0010\u0011\u001a\u00020\u0010*\u0004\u0018\u00010\u0002H\u0002R\u0016\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R&\u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00020\f0\u0015j\b\u0012\u0004\u0012\u00020\f`\u00168\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/sportsetting/gpssetting/GpsSettingViewModel$Companion;", "", "Lcom/huami/bluetooth/profile/channel/module/settings/entity/sport/Sport;", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/sportsetting/gpssetting/enums/GpsFrequency;", "c", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/sportsetting/gpssetting/enums/LocationCombination;", GoogleApiAvailabilityLight.a, "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/sportsetting/gpssetting/enums/SearchStarPreference;", "e", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/sportsetting/gpssetting/GpsSettingVo;", "b", "sport", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "source", "", "a", "", "f", "", "TAG", "Ljava/lang/String;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "overSeaSources", "Ljava/util/ArrayList;", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List<GpsSettingVo> a(Sport sport, HMDeviceSource source) {
            if (sport == null) {
                return CollectionsKt__CollectionsKt.emptyList();
            }
            ArrayList<GpsSettingVo> arrayList = new ArrayList();
            GpsMode gpsMode = GpsMode.ACCURATE;
            GpsFrequency gpsFrequency = GpsFrequency.MULTI;
            LocationCombination locationCombination = LocationCombination.GPS_ALL;
            SearchStarPreference searchStarPreference = SearchStarPreference.ACCURACY_FIRST;
            arrayList.add(new GpsSettingVo(gpsMode, gpsFrequency, locationCombination, searchStarPreference, 1));
            LocationCombination locationCombination2 = GpsSettingViewModel.g.contains(source) ? LocationCombination.GPS_GLONASS : LocationCombination.GPS_BEIDOU;
            GpsMode gpsMode2 = GpsMode.BALANCE;
            GpsFrequency gpsFrequency2 = GpsFrequency.SINGLE;
            arrayList.add(new GpsSettingVo(gpsMode2, gpsFrequency2, locationCombination2, searchStarPreference, 1));
            arrayList.add(new GpsSettingVo(GpsMode.BATTERY_SAVE, gpsFrequency2, LocationCombination.GPS_LE, SearchStarPreference.SPEED_FIRST, 1));
            arrayList.add(new GpsSettingVo(GpsMode.SUPER_BATTERY_SAVE, gpsFrequency2, LocationCombination.GPS_BEIDOU, searchStarPreference, 1));
            GpsFrequency gpsFrequencyC = c(sport);
            LocationCombination locationCombinationD = d(sport);
            SearchStarPreference searchStarPreferenceE = e(sport);
            EnumData gpsDataInterval = sport.getGpsDataInterval();
            Integer numValueOf = gpsDataInterval == null ? null : Integer.valueOf(gpsDataInterval.getValue());
            for (GpsSettingVo gpsSettingVo : arrayList) {
                if (gpsFrequencyC == null) {
                    gpsSettingVo.setGpsFrequency(null);
                }
                if (locationCombinationD == null) {
                    gpsSettingVo.setLocationCombination(null);
                }
                if (searchStarPreferenceE == null) {
                    gpsSettingVo.setSearchStarPreference(null);
                }
                if (numValueOf == null) {
                    gpsSettingVo.setDataInterval(null);
                }
            }
            return arrayList;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final GpsSettingVo b(Sport sport) {
            EnumData gpsDataInterval;
            return new GpsSettingVo(GpsMode.DIY, c(sport), d(sport), e(sport), (sport == null || (gpsDataInterval = sport.getGpsDataInterval()) == null) ? null : Integer.valueOf(gpsDataInterval.getValue()));
        }

        private final GpsFrequency c(Sport sport) {
            EnumData gpsFrequencyBand;
            GpsFrequency.Companion companion = GpsFrequency.INSTANCE;
            Integer numValueOf = null;
            if (sport != null && (gpsFrequencyBand = sport.getGpsFrequencyBand()) != null) {
                numValueOf = Integer.valueOf(gpsFrequencyBand.getValue());
            }
            return companion.fromValue(numValueOf);
        }

        private final LocationCombination d(Sport sport) {
            EnumData gpsSystemChoice;
            LocationCombination.Companion companion = LocationCombination.INSTANCE;
            Integer numValueOf = null;
            if (sport != null && (gpsSystemChoice = sport.getGpsSystemChoice()) != null) {
                numValueOf = Integer.valueOf(gpsSystemChoice.getValue());
            }
            return companion.fromValue(numValueOf);
        }

        private final SearchStarPreference e(Sport sport) {
            EnumData gpsSearchingPreference;
            SearchStarPreference.Companion companion = SearchStarPreference.INSTANCE;
            Integer numValueOf = null;
            if (sport != null && (gpsSearchingPreference = sport.getGpsSearchingPreference()) != null) {
                numValueOf = Integer.valueOf(gpsSearchingPreference.getValue());
            }
            return companion.fromValue(numValueOf);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean f(Sport sport) {
            EnumData gpsDataInterval;
            if (c(sport) == null && d(sport) == null && e(sport) == null) {
                Integer numValueOf = null;
                if (sport != null && (gpsDataInterval = sport.getGpsDataInterval()) != null) {
                    numValueOf = Integer.valueOf(gpsDataInterval.getValue());
                }
                if (numValueOf == null) {
                    return false;
                }
            }
            return true;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sportsetting.gpssetting.GpsSettingViewModel$loadGpsSetting$1", f = "GpsSettingViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ HashMap<SettingsGroupType, Settings> c;

        /* JADX INFO: renamed from: com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sportsetting.gpssetting.GpsSettingViewModel$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/sportsetting/gpssetting/enums/GpsMode;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0866a extends Lambda implements Function1<Integer, GpsMode> {
            public static final C0866a a = new C0866a();

            public C0866a() {
                super(1);
            }

            @Nullable
            public final GpsMode a(int i) {
                return GpsMode.INSTANCE.fromValue(i);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ GpsMode invoke(Integer num) {
                return a(num.intValue());
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/sportsetting/gpssetting/enums/GpsMode;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function1<GpsMode, Boolean> {
            public static final b a = new b();

            public b() {
                super(1);
            }

            public final boolean a(@NotNull GpsMode gpsMode) {
                return gpsMode != GpsMode.DIY;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Boolean invoke(GpsMode gpsMode) {
                return Boolean.valueOf(a(gpsMode));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/sportsetting/gpssetting/enums/GpsMode;", "gpsMode", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/sportsetting/gpssetting/GpsSettingVo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class c extends Lambda implements Function1<GpsMode, GpsSettingVo> {
            public final /* synthetic */ List<GpsSettingVo> a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(List<GpsSettingVo> list) {
                super(1);
                this.a = list;
            }

            @Override // kotlin.jvm.functions.Function1
            @Nullable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final GpsSettingVo invoke(@NotNull GpsMode gpsMode) {
                Object next;
                Iterator<T> it2 = this.a.iterator();
                while (it2.hasNext()) {
                    next = it2.next();
                    if (((GpsSettingVo) next).getGpsMode() == gpsMode) {
                        return (GpsSettingVo) next;
                    }
                }
                next = null;
                return (GpsSettingVo) next;
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
            return GpsSettingViewModel.this.new a(this.c, continuation);
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
            EnumData gpsMode2;
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            GpsSettingViewModel.this.watchSettings = this.c;
            LoadingVo.Companion companion = LoadingVo.INSTANCE;
            LoadingVo.Companion.postStartMsg$default(companion, GpsSettingViewModel.this.getLoadingLiveData(), null, 2, null);
            Sport sportB = GpsSettingViewModel.this.b();
            Integer numBoxInt = (sportB == null || (gpsMode = sportB.getGpsMode()) == null) ? null : Boxing.boxInt(gpsMode.getValue());
            Sport sportB2 = GpsSettingViewModel.this.b();
            ArrayList<Integer> enums = (sportB2 == null || (gpsMode2 = sportB2.getGpsMode()) == null) ? null : gpsMode2.getEnums();
            if (numBoxInt != null) {
                if (!(enums == null || enums.isEmpty())) {
                    Companion companion2 = GpsSettingViewModel.INSTANCE;
                    if (companion2.f(GpsSettingViewModel.this.b())) {
                        GpsMode gpsModeFromValue = GpsMode.INSTANCE.fromValue(numBoxInt.intValue());
                        if (gpsModeFromValue == null) {
                            LoadingVo.Companion.postCancelMsg$default(companion, GpsSettingViewModel.this.getLoadingLiveData(), null, 2, null);
                            return Unit.INSTANCE;
                        }
                        List mutableList = SequencesKt___SequencesKt.toMutableList(SequencesKt___SequencesKt.mapNotNull(SequencesKt___SequencesKt.filter(SequencesKt___SequencesKt.mapNotNull(CollectionsKt___CollectionsKt.asSequence(enums), C0866a.a), b.a), new c(companion2.a(GpsSettingViewModel.this.b(), GpsSettingViewModel.this.a().getBoundDeviceSource(HMDeviceType.MILI)))));
                        mutableList.add(companion2.b(GpsSettingViewModel.this.b()));
                        GpsSettingViewModel.this.getGpsModeLiveData().postValue(new Pair<>(gpsModeFromValue, mutableList));
                        LoadingVo.Companion.postCancelMsg$default(companion, GpsSettingViewModel.this.getLoadingLiveData(), null, 2, null);
                        return Unit.INSTANCE;
                    }
                }
            }
            LoadingVo.Companion.postCancelMsg$default(companion, GpsSettingViewModel.this.getLoadingLiveData(), null, 2, null);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "gpsSettingsVoList null";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sportsetting.gpssetting.GpsSettingViewModel$setGpsMode$1", f = "GpsSettingViewModel.kt", i = {}, l = {57, 59}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public Object a;
        public int b;
        public final /* synthetic */ GpsMode d;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sportsetting.gpssetting.GpsSettingViewModel$setGpsMode$1$1", f = "GpsSettingViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ GpsSettingViewModel b;
            public final /* synthetic */ GpsMode c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(GpsSettingViewModel gpsSettingViewModel, GpsMode gpsMode, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = gpsSettingViewModel;
                this.c = gpsMode;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new a(this.b, this.c, continuation);
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
                Sport sportB = this.b.b();
                EnumData gpsMode = sportB == null ? null : sportB.getGpsMode();
                if (gpsMode != null) {
                    gpsMode.setValue(this.c.getValue());
                }
                return Unit.INSTANCE;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/network/bean/WatchSettings;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function1<WatchSettings, Unit> {
            public final /* synthetic */ GpsMode a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(GpsMode gpsMode) {
                super(1);
                this.a = gpsMode;
            }

            public final void a(@NotNull WatchSettings watchSettings) {
                com.xiaomi.hm.health.device.setting.network.bean.Sport sport = watchSettings.getSport();
                if (sport == null) {
                    return;
                }
                sport.setGpsMode(Integer.valueOf(this.a.getValue()));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(WatchSettings watchSettings) {
                a(watchSettings);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(GpsMode gpsMode, Continuation<? super c> continuation) {
            super(2, continuation);
            this.d = gpsMode;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return GpsSettingViewModel.this.new c(this.d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x007e A[PHI: r1
          0x007e: PHI (r1v8 com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sportsetting.gpssetting.enums.GpsMode) = 
          (r1v4 com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sportsetting.gpssetting.enums.GpsMode)
          (r1v9 com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sportsetting.gpssetting.enums.GpsMode)
         binds: [B:15:0x0057, B:21:0x007c] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:25:0x0086  */
        /* JADX WARN: Code duplicated, block: B:27:0x009d A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:29:0x00b8  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            GpsMode first;
            boolean zBooleanValue;
            MainCoroutineDispatcher main;
            a aVar;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i != 0) {
                if (i == 1) {
                    first = (GpsMode) this.a;
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                LoadingVo.Companion.postCancelMsg$default(LoadingVo.INSTANCE, GpsSettingViewModel.this.getLoadingLiveData(), null, 2, null);
                WatchSettingsManager.modify$default(WatchSettingExtsKt.getWatchSettingManager(), false, new b(this.d), 1, null);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            LoadingVo.Companion.postStartMsg$default(LoadingVo.INSTANCE, GpsSettingViewModel.this.getLoadingLiveData(), null, 2, null);
            Pair<GpsMode, List<GpsSettingVo>> value = GpsSettingViewModel.this.getGpsModeLiveData().getValue();
            first = value == null ? null : value.getFirst();
            GpsSettingViewModel.this.c(this.d);
            SettingsModule settingsModule = GpsSettingViewModel.this.getSettingsModule();
            if (settingsModule == null) {
                zBooleanValue = false;
            } else {
                Sport sport = new Sport();
                sport.setGpsMode(new EnumData(this.d.getValue()));
                Unit unit = Unit.INSTANCE;
                this.a = first;
                this.b = 1;
                obj = SettingsExtsKt.write(settingsModule, sport, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            if (zBooleanValue) {
                main = Dispatchers.getMain();
                aVar = new a(GpsSettingViewModel.this, this.d, null);
                this.a = null;
                this.b = 2;
                if (BuildersKt.withContext(main, aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                LoadingVo.Companion.postCancelMsg$default(LoadingVo.INSTANCE, GpsSettingViewModel.this.getLoadingLiveData(), null, 2, null);
                WatchSettingsManager.modify$default(WatchSettingExtsKt.getWatchSettingManager(), false, new b(this.d), 1, null);
            } else {
                LoadingVo.INSTANCE.postFailMsg(GpsSettingViewModel.this.getLoadingLiveData(), R.string.long_sit_set_failed);
                GpsSettingViewModel.this.c(first);
            }
            return Unit.INSTANCE;
            Boolean bool = (Boolean) obj;
            if (bool == null) {
                zBooleanValue = false;
            } else {
                zBooleanValue = bool.booleanValue();
            }
            if (zBooleanValue) {
                main = Dispatchers.getMain();
                aVar = new a(GpsSettingViewModel.this, this.d, null);
                this.a = null;
                this.b = 2;
                if (BuildersKt.withContext(main, aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                LoadingVo.Companion.postCancelMsg$default(LoadingVo.INSTANCE, GpsSettingViewModel.this.getLoadingLiveData(), null, 2, null);
                WatchSettingsManager.modify$default(WatchSettingExtsKt.getWatchSettingManager(), false, new b(this.d), 1, null);
            } else {
                LoadingVo.INSTANCE.postFailMsg(GpsSettingViewModel.this.getLoadingLiveData(), R.string.long_sit_set_failed);
                GpsSettingViewModel.this.c(first);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GpsSettingViewModel() {
        KoinPlatformTools koinPlatformTools = KoinPlatformTools.INSTANCE;
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = koinPlatformTools.defaultLazyMode();
        final Qualifier qualifier = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.deviceCenter = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<DeviceCenter>() { // from class: com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sportsetting.gpssetting.GpsSettingViewModel$special$$inlined$inject$default$1
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
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DeviceCenter.class), qualifier, objArr3);
            }
        });
        HMBaseDevice device = getDeviceCenter().getDevice();
        this.settingsModule = device == null ? null : (SettingsModule) device.getChannelModule(SettingsModule.class);
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode2 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr4 = objArr2 == true ? 1 : 0;
        final Object[] objArr5 = objArr == true ? 1 : 0;
        this.deviceManagerApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode2, (Function0) new Function0<DeviceManagerApi>() { // from class: com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sportsetting.gpssetting.GpsSettingViewModel$special$$inlined$inject$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.devicex.manager.DeviceManagerApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final DeviceManagerApi getA() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DeviceManagerApi.class), objArr4, objArr5);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DeviceManagerApi a() {
        return (DeviceManagerApi) this.deviceManagerApi.getValue();
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
    public final void c(GpsMode gpsMode) {
        if (gpsMode == null) {
            return;
        }
        Pair<GpsMode, List<GpsSettingVo>> value = this.gpsModeLiveData.getValue();
        List<GpsSettingVo> second = value == null ? null : value.getSecond();
        if (second == null) {
            HMLog.error$default(h, null, null, b.a, 6, null);
        } else {
            this.gpsModeLiveData.postValue(new Pair<>(gpsMode, second));
        }
    }

    @NotNull
    public final DeviceCenter getDeviceCenter() {
        return (DeviceCenter) this.deviceCenter.getValue();
    }

    @NotNull
    public final MutableLiveData<Pair<GpsMode, List<GpsSettingVo>>> getGpsModeLiveData() {
        return this.gpsModeLiveData;
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

    @Nullable
    public final SettingsModule getSettingsModule() {
        return this.settingsModule;
    }

    public final void loadGpsSetting(@Nullable HashMap<SettingsGroupType, Settings> watchSettings) {
        e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new a(watchSettings, null), 2, null);
    }

    public final void setGpsMode(@NotNull GpsMode gpsMode) {
        e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new c(gpsMode, null), 2, null);
    }

    public final void setSettingsModule(@Nullable SettingsModule settingsModule) {
        this.settingsModule = settingsModule;
    }
}
