package com.xiaomi.hm.health.device.headset;

import com.amap.api.mapcore.util.hl;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.gson.JsonObject;
import com.huami.bluetooth.device.MozartDevice;
import com.huami.bluetooth.profile.ecf.data.Equalizer;
import com.huami.bluetooth.profile.ecf.data.HeadsetKnockSetting;
import com.huami.bluetooth.profile.ecf.data.HeadsetSideListenSetting;
import com.huami.bluetooth.profile.ecf.data.HeadsetSportSetting;
import com.huami.bluetooth.utils.ByteUtilsKt;
import com.huami.devicex.injection.keeper.KeeperProxyApi;
import com.huami.network.base.handler.IHMBasicHttpResponseHandler;
import com.huami.network.base.model.HMHttpResponseData;
import com.huami.network.hmnetwork.handler.IHMSimpleHttpResponseHandler;
import com.huami.network.hmnetwork.properties.HMUserPropertiesAPI;
import com.huami.network.hmnetwork.properties.PropertyItem;
import com.huami.network.hmnetwork.webapi.WebResponse;
import com.huami.passport.Configs;
import com.huami.tools.log.HMLog;
import com.loc.z;
import com.xiaomi.hm.health.baseutil.TimeUtils;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.profile.base.DeviceInfo;
import com.xiaomi.hm.health.bt.profile.feature.Feature;
import com.xiaomi.hm.health.device.headset.MozartSchedule;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b'\u0010(J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0014\u0010\u000b\u001a\u00020\n*\u00020\u00072\u0006\u0010\t\u001a\u00020\bH\u0002J\f\u0010\r\u001a\u00020\n*\u00020\fH\u0002J\f\u0010\u000f\u001a\u00020\n*\u00020\u000eH\u0002J\u0018\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\nH\u0002J\u001e\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\n2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\u0013H\u0002R\u0016\u0010\u0018\u001a\u00020\n8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001a\u001a\u00020\n8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017R\u0016\u0010\u001c\u001a\u00020\n8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0017R\u0016\u0010\u001e\u001a\u00020\n8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0017R\u0016\u0010\u001f\u001a\u00020\n8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0017R\u0016\u0010!\u001a\u00020\n8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b \u0010\u0017R\u001d\u0010&\u001a\u00020\"8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b\u001d\u0010%¨\u0006)"}, d2 = {"Lcom/xiaomi/hm/health/device/headset/MozartSchedule;", "Lorg/koin/core/component/KoinComponent;", "Lcom/huami/bluetooth/device/MozartDevice;", "device", "", "onConnected", "m", "Lcom/huami/bluetooth/profile/ecf/data/HeadsetKnockSetting;", "", "isNewKnockSetting", "", "i", "Lcom/huami/bluetooth/profile/ecf/data/HeadsetSportSetting;", hl.k, "Lcom/huami/bluetooth/profile/ecf/data/HeadsetSideListenSetting;", z.j, "deviceId", "property", "e", "", Configs.Params.PROPERTIES, "l", "a", "Ljava/lang/String;", "TAG", "b", "PROPERTY_MOZART", "c", "PROPERTY_ACTION", GoogleApiAvailabilityLight.a, "PROPERTY_EQUALIZER", "PROPERTY_SPORT", "f", "PROPERTY_THRU_MODE", "Lcom/huami/devicex/injection/keeper/KeeperProxyApi;", "g", "Lkotlin/Lazy;", "()Lcom/huami/devicex/injection/keeper/KeeperProxyApi;", "keeperProxyApi", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class MozartSchedule implements KoinComponent {

    @NotNull
    public static final MozartSchedule INSTANCE;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final String TAG = "MozartSchedule";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private static final String PROPERTY_MOZART = "huami.mifit.user.settings.mozart";

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private static final String PROPERTY_ACTION = "huami.mifit.user.settings.mozart.action";

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private static final String PROPERTY_EQUALIZER = "huami.mifit.user.settings.mozart.equalizer";

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private static final String PROPERTY_SPORT = "huami.mifit.user.settings.mozart.sport";

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private static final String PROPERTY_THRU_MODE = "huami.mifit.user.settings.mozart.thru_mode";

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private static final Lazy keeperProxyApi;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<Unit> {
        public final /* synthetic */ MozartDevice a;
        public final /* synthetic */ Function2<String, String, Boolean> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(MozartDevice mozartDevice, Function2<? super String, ? super String, Boolean> function2) {
            super(0);
            this.a = mozartDevice;
            this.b = function2;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit getA() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            Feature deviceFeature;
            DeviceInfo deviceInfo = ((HMBaseDevice) this.a).getDeviceInfo();
            boolean zHasHeadset = false;
            if (deviceInfo != null && (deviceFeature = deviceInfo.getDeviceFeature()) != null) {
                zHasHeadset = deviceFeature.hasHeadset(0);
            }
            HeadsetKnockSetting headsetKnockSetting = this.a.getHeadsetKnockSetting();
            if (headsetKnockSetting == null) {
                return;
            }
            this.b.invoke(MozartSchedule.PROPERTY_ACTION, MozartSchedule.INSTANCE.i(headsetKnockSetting, zHasHeadset));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<Unit> {
        public final /* synthetic */ MozartDevice a;
        public final /* synthetic */ Function2<String, String, Boolean> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(MozartDevice mozartDevice, Function2<? super String, ? super String, Boolean> function2) {
            super(0);
            this.a = mozartDevice;
            this.b = function2;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit getA() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            Equalizer equalizer = this.a.getEqualizer();
            if (equalizer == null) {
                return;
            }
            this.b.invoke(MozartSchedule.PROPERTY_EQUALIZER, String.valueOf(equalizer.getEqType()));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<Unit> {
        public final /* synthetic */ MozartDevice a;
        public final /* synthetic */ Function2<String, String, Boolean> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(MozartDevice mozartDevice, Function2<? super String, ? super String, Boolean> function2) {
            super(0);
            this.a = mozartDevice;
            this.b = function2;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit getA() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            HeadsetSportSetting headsetSportSetting = this.a.getHeadsetSportSetting();
            if (headsetSportSetting == null) {
                return;
            }
            this.b.invoke(MozartSchedule.PROPERTY_SPORT, MozartSchedule.INSTANCE.k(headsetSportSetting));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<Unit> {
        public final /* synthetic */ MozartDevice a;
        public final /* synthetic */ Function2<String, String, Boolean> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(MozartDevice mozartDevice, Function2<? super String, ? super String, Boolean> function2) {
            super(0);
            this.a = mozartDevice;
            this.b = function2;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit getA() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            HeadsetSideListenSetting headsetSideListenSetting = this.a.getHeadsetSideListenSetting();
            if (headsetSideListenSetting == null) {
                return;
            }
            this.b.invoke(MozartSchedule.PROPERTY_THRU_MODE, MozartSchedule.INSTANCE.j(headsetSideListenSetting));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<String> {
        public static final f a = new f();

        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "No property to upload!";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n"}, d2 = {"", "property", "value", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function2<String, String, Boolean> {
        public final /* synthetic */ List<PropertyItem> a;
        public final /* synthetic */ List<String> b;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ String a;
            public final /* synthetic */ String b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String str, String str2) {
                super(0);
                this.a = str;
                this.b = str2;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "Add property '" + this.a + "' value: " + this.b;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(List<PropertyItem> list, List<String> list2) {
            super(2);
            this.a = list;
            this.b = list2;
        }

        public final boolean a(@NotNull String str, @NotNull String str2) {
            HMLog.info(MozartSchedule.TAG, new a(str, str2));
            this.a.add(new PropertyItem(str, str2));
            return this.b.add(str);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Boolean invoke(String str, String str2) {
            return Boolean.valueOf(a(str, str2));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"", "property", "Lkotlin/Function0;", "", "doAdd", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function2<String, Function0<? extends Unit>, Unit> {
        public final /* synthetic */ String a;
        public final /* synthetic */ boolean b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str, boolean z) {
            super(2);
            this.a = str;
            this.b = z;
        }

        public final void a(@NotNull String str, @NotNull Function0<Unit> function0) {
            if (MozartSchedule.INSTANCE.e(this.a, str) || this.b) {
                return;
            }
            function0.getA();
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(String str, Function0<? extends Unit> function0) {
            a(str, function0);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function0<String> {
        public final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(boolean z) {
            super(0);
            this.a = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "device is lockGpsSync : " + this.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        final MozartSchedule mozartSchedule = new MozartSchedule();
        INSTANCE = mozartSchedule;
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        keeperProxyApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<KeeperProxyApi>() { // from class: com.xiaomi.hm.health.device.headset.MozartSchedule$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.devicex.injection.keeper.KeeperProxyApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final KeeperProxyApi getA() {
                KoinComponent koinComponent = mozartSchedule;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(KeeperProxyApi.class), qualifier, objArr);
            }
        });
    }

    private MozartSchedule() {
    }

    private final KeeperProxyApi d() {
        return (KeeperProxyApi) keeperProxyApi.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean e(String deviceId, String property) {
        Date mozartSettingUploadDate = d().getMozartSettingUploadDate(deviceId, property);
        if (mozartSettingUploadDate == null) {
            return false;
        }
        return TimeUtils.isToday(mozartSettingUploadDate);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(MozartDevice mozartDevice) {
        INSTANCE.m(mozartDevice);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(Unit unit) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(Throwable th) {
        HMLog.warn$default(null, th, a.a, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String i(HeadsetKnockSetting headsetKnockSetting, boolean z) {
        JsonObject jsonObject = new JsonObject();
        if (z) {
            jsonObject.addProperty("left_press_1", Integer.valueOf(headsetKnockSetting.getLeftSingleDog()));
            jsonObject.addProperty("left_press_2", Integer.valueOf(headsetKnockSetting.getLeftDoubleDog()));
            jsonObject.addProperty("left_press_3", Integer.valueOf(headsetKnockSetting.getLeftTripleDog()));
            jsonObject.addProperty("right_press_1", Integer.valueOf(headsetKnockSetting.getRightSingleDog()));
            jsonObject.addProperty("right_press_2", Integer.valueOf(headsetKnockSetting.getRightDoubleDog()));
            jsonObject.addProperty("right_press_3", Integer.valueOf(headsetKnockSetting.getRightTripleDog()));
            jsonObject.addProperty("left_long_press", Integer.valueOf(headsetKnockSetting.getLeftLongPress()));
            jsonObject.addProperty("right_long_press", Integer.valueOf(headsetKnockSetting.getRightLongPress()));
        } else {
            jsonObject.addProperty("left_1", Integer.valueOf(headsetKnockSetting.getLeftSingleKnock()));
            jsonObject.addProperty("left_2", Integer.valueOf(headsetKnockSetting.getLeftDoubleKnock()));
            jsonObject.addProperty("left_3", Integer.valueOf(headsetKnockSetting.getLeftTripleKnock()));
            jsonObject.addProperty("right_1", Integer.valueOf(headsetKnockSetting.getRightSingleKnock()));
            jsonObject.addProperty("right_2", Integer.valueOf(headsetKnockSetting.getRightDoubleKnock()));
            jsonObject.addProperty("right_3", Integer.valueOf(headsetKnockSetting.getRightTripleKnock()));
        }
        return jsonObject.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String j(HeadsetSideListenSetting headsetSideListenSetting) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("volume", Integer.valueOf(headsetSideListenSetting.getVolume()));
        jsonObject.addProperty("voice_enhancement", Integer.valueOf(ByteUtilsKt.toInt(headsetSideListenSetting.getVoiceEnhancement())));
        return jsonObject.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String k(HeadsetSportSetting headsetSportSetting) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("motion_beat", Integer.valueOf(ByteUtilsKt.toInt(headsetSportSetting.getMeterEnhancement())));
        jsonObject.addProperty("thru_mode", Integer.valueOf(ByteUtilsKt.toInt(headsetSportSetting.getAutoSideListen())));
        jsonObject.addProperty("sport_hr_sharing", Integer.valueOf(headsetSportSetting.getHrBroadcast().getValue()));
        return jsonObject.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l(String deviceId, List<String> properties) {
        Date date = new Date();
        Iterator<T> it2 = properties.iterator();
        while (it2.hasNext()) {
            INSTANCE.d().saveMozartSettingUploadDate(deviceId, (String) it2.next(), date);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void m(MozartDevice device) {
        ArrayList arrayList = new ArrayList();
        final ArrayList arrayList2 = new ArrayList();
        g gVar = new g(arrayList, arrayList2);
        final String deviceID = ((HMBaseDevice) device).getDeviceInfo().getDeviceID();
        boolean zIsLockGpsSync = device.isLockGpsSync();
        HMLog.info$default(null, new i(zIsLockGpsSync), 1, null);
        h hVar = new h(deviceID, zIsLockGpsSync);
        hVar.invoke(PROPERTY_ACTION, new b(device, gVar));
        hVar.invoke(PROPERTY_EQUALIZER, new c(device, gVar));
        hVar.invoke(PROPERTY_SPORT, new d(device, gVar));
        hVar.invoke(PROPERTY_THRU_MODE, new e(device, gVar));
        if (arrayList.isEmpty()) {
            HMLog.info(TAG, f.a);
        } else {
            HMUserPropertiesAPI.postProperty((List<PropertyItem>) arrayList, true, (IHMBasicHttpResponseHandler) new IHMSimpleHttpResponseHandler() { // from class: com.xiaomi.hm.health.device.headset.MozartSchedule$uploadSettings$6

                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                public static final class a extends Lambda implements Function0<String> {
                    public final /* synthetic */ String a;
                    public final /* synthetic */ HMHttpResponseData b;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public a(String str, HMHttpResponseData hMHttpResponseData) {
                        super(0);
                        this.a = str;
                        this.b = hMHttpResponseData;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @Nullable
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final String getA() {
                        return "Upload Mozart(" + this.a + ") property failure! \n" + this.b;
                    }
                }

                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                public static final class b extends Lambda implements Function0<String> {
                    public final /* synthetic */ String a;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public b(String str) {
                        super(0);
                        this.a = str;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @Nullable
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final String getA() {
                        return "Upload Mozart(" + this.a + ") property success!";
                    }
                }

                @Override // com.huami.network.base.handler.IHMBasicHttpResponseHandler
                public void onFailure(@Nullable HMHttpResponseData item) {
                    HMLog.info("MozartSchedule", new a(deviceID, item));
                }

                @Override // com.huami.network.hmnetwork.handler.IHMSimpleHttpResponseHandler
                public void onSuccess(@Nullable WebResponse response, @Nullable HMHttpResponseData item) {
                    HMLog.info("MozartSchedule", new b(deviceID));
                    MozartSchedule.INSTANCE.l(deviceID, arrayList2);
                }
            });
        }
    }

    @JvmStatic
    public static final void onConnected(@NotNull final MozartDevice device) {
        Observable.fromCallable(new Callable() { // from class: u85
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return MozartSchedule.f(device);
            }
        }).subscribeOn(Schedulers.io()).subscribe(new Consumer() { // from class: t85
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                MozartSchedule.g((Unit) obj);
            }
        }, new Consumer() { // from class: s85
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                MozartSchedule.h((Throwable) obj);
            }
        });
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }
}
