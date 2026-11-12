package com.xiaomi.hm.health.ui.language.ruler;

import android.annotation.SuppressLint;
import android.os.Build;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bluetooth.profile.channel.module.settings.ChangeListener;
import com.huami.bluetooth.profile.channel.module.settings.SettingsGroupType;
import com.huami.bluetooth.profile.channel.module.settings.SettingsModule;
import com.huami.bluetooth.profile.channel.module.settings.entity.language.v2.SettingsLanguageV2;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.EnumData;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.Settings;
import com.huami.devicex.funapi.DeviceXFunctionsKt;
import com.huami.devicex.injection.basic.DeviceUtilsApi;
import com.huami.tools.log.HMLog;
import com.huami.watch.companion.watchface.cloud.WatchFaceApi;
import com.loc.z;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.model.HMLanguage;
import com.xiaomi.hm.health.bt.model.LanguageComBination;
import com.xiaomi.hm.health.bt.profile.base.DeviceInfo;
import com.xiaomi.hm.health.bt.profile.base.HMOtherVersion;
import com.xiaomi.hm.health.databases.model.Device;
import com.xiaomi.hm.health.device.deviceconfig.Feature;
import com.xiaomi.hm.health.device.deviceconfig.configs.ConfigHelperKt;
import com.xiaomi.hm.health.device.firmware.HMFwOnlineUpgradeManager;
import com.xiaomi.hm.health.device.fw_upgrade.HMFwOnlineManager;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.WatchSettingExtsKt;
import com.xiaomi.hm.health.locweather.LocWeatherManager;
import com.xiaomi.hm.health.ui.language.DeviceLanguage;
import com.xiaomi.hm.health.ui.language.DeviceLanguageConfig;
import com.xiaomi.hm.health.ui.language.HmLanguageUtil;
import it.sauronsoftware.ftp4j.FTPCodes;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 @2\u00020\u00012\u00020\u0002:\u0001@B\u0007¢\u0006\u0004\b>\u0010?J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u001a\u0010\u000b\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\f\u001a\u00020\u0005H\u0002J\u001a\u0010\r\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0018\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\u0011\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003H\u0016J\u0010\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0012H\u0016J\b\u0010\u001a\u001a\u00020\u0012H\u0016J\u0010\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010 \u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u001eH\u0016J\u001a\u0010#\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010!2\u0006\u0010\"\u001a\u00020\u0012H\u0016J\u0010\u0010$\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010%\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016R\u001d\u0010*\u001a\u00020&8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010'\u001a\u0004\b(\u0010)R \u0010.\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u00101\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\"\u00106\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u000203028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b,\u00107R\u0018\u0010:\u001a\u0004\u0018\u0001088B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b/\u00109R\u0016\u0010=\u001a\u00020;8B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b4\u0010<¨\u0006A"}, d2 = {"Lcom/xiaomi/hm/health/ui/language/ruler/BilateralFollowPhoneLanguageRuler;", "Lcom/xiaomi/hm/health/ui/language/ruler/BilateralLangRuler;", "Lorg/koin/core/component/KoinComponent;", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "device", "", "h", z.j, "m", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Settings;", "setting", "i", "g", "a", "l", "Lcom/xiaomi/hm/health/bt/model/HMLanguage;", "hmLanguage", hl.k, "", "f", "()Ljava/lang/Integer;", "hmBaseDevice", "", "isFitCurrentDeviceRuler", "priority", "setPriority", "getPriority", "onDeviceBind", "onDeviceUnBind", "onBoundedDeviceConnected", "", "deviceId", "onBoundedDeviceDisconnect", "Lcom/xiaomi/hm/health/databases/model/Device;", "status", "onDeviceStatusChange", "enable", WatchFaceApi.CUSTOMIZABLE_DISABLE, "Lcom/huami/devicex/injection/basic/DeviceUtilsApi;", "Lkotlin/Lazy;", "e", "()Lcom/huami/devicex/injection/basic/DeviceUtilsApi;", "deviceUtilsApiLazy", "Lkotlin/Function0;", "b", "Lkotlin/jvm/functions/Function0;", "functionDec", "c", LogUtil.I, "priorityCache", "", "Lcom/huami/bluetooth/profile/channel/module/settings/ChangeListener;", GoogleApiAvailabilityLight.a, "Ljava/util/Map;", "changeListeners", "()Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "Lcom/xiaomi/hm/health/bt/profile/base/DeviceInfo;", "()Lcom/xiaomi/hm/health/bt/profile/base/DeviceInfo;", "deviceInfo", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "()Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "deviceSource", "<init>", "()V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class BilateralFollowPhoneLanguageRuler extends BilateralLangRuler implements KoinComponent {

    @NotNull
    private static final String e = "BilateralFollowPhoneLanguageRuler";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceUtilsApiLazy;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private Function0<? extends HMBaseDevice> functionDec;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private int priorityCache;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Map<String, ChangeListener> changeListeners;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ Locale a;
        public final /* synthetic */ Integer b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Locale locale, Integer num) {
            super(0);
            this.a = locale;
            this.b = num;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            if (Build.VERSION.SDK_INT >= 21) {
                String languageTag = this.a.toLanguageTag();
                Integer num = this.b;
                return "locale:" + languageTag + ",\nlanguageCode:" + (num != null ? num : "null");
            }
            Locale locale = this.a;
            Integer num2 = this.b;
            return "locale:" + locale + ",\nlanguageCode:" + (num2 != null ? num2 : "null");
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
            return "build is low";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.ui.language.ruler.BilateralFollowPhoneLanguageRuler$initiativeQueryDeviceLanguage$1", f = "BilateralFollowPhoneLanguageRuler.kt", i = {}, l = {163}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ Settings a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Settings settings) {
                super(0);
                this.a = settings;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "language: " + this.a;
            }
        }

        public c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return BilateralFollowPhoneLanguageRuler.this.new c(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                HMBaseDevice hMBaseDeviceB = BilateralFollowPhoneLanguageRuler.this.b();
                SettingsModule settingsModule = hMBaseDeviceB == null ? null : (SettingsModule) hMBaseDeviceB.getChannelModule(SettingsModule.class);
                if (settingsModule == null) {
                    return Unit.INSTANCE;
                }
                SettingsGroupType settingsGroupType = SettingsGroupType.LANGUAGE;
                this.a = 1;
                obj = WatchSettingExtsKt.query$default(settingsModule, settingsGroupType, false, this, 2, null);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            Settings settings = (Settings) obj;
            HMLog.info(BilateralFollowPhoneLanguageRuler.e, new a(settings));
            BilateralFollowPhoneLanguageRuler bilateralFollowPhoneLanguageRuler = BilateralFollowPhoneLanguageRuler.this;
            bilateralFollowPhoneLanguageRuler.a(settings, bilateralFollowPhoneLanguageRuler.b());
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.ui.language.ruler.BilateralFollowPhoneLanguageRuler$languageOnBind$1", f = "BilateralFollowPhoneLanguageRuler.kt", i = {}, l = {117}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ HMBaseDevice b;
        public final /* synthetic */ BilateralFollowPhoneLanguageRuler c;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ Settings a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Settings settings) {
                super(0);
                this.a = settings;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "language: " + this.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(HMBaseDevice hMBaseDevice, BilateralFollowPhoneLanguageRuler bilateralFollowPhoneLanguageRuler, Continuation<? super d> continuation) {
            super(2, continuation);
            this.b = hMBaseDevice;
            this.c = bilateralFollowPhoneLanguageRuler;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new d(this.b, this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SettingsModule settingsModule = (SettingsModule) this.b.getChannelModule(SettingsModule.class);
                if (settingsModule == null) {
                    return Unit.INSTANCE;
                }
                SettingsGroupType settingsGroupType = SettingsGroupType.LANGUAGE;
                this.a = 1;
                obj = WatchSettingExtsKt.query$default(settingsModule, settingsGroupType, false, this, 2, null);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            Settings settings = (Settings) obj;
            HMLog.info(BilateralFollowPhoneLanguageRuler.e, new a(settings));
            if (!(settings instanceof SettingsLanguageV2)) {
                return Unit.INSTANCE;
            }
            if (Intrinsics.areEqual(((SettingsLanguageV2) settings).getLanguageFollowMobilePhoneSwitch(), Boxing.boxBoolean(true))) {
                this.c.l(this.b);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.ui.language.ruler.BilateralFollowPhoneLanguageRuler$setFollowPhoneLanguage$1", f = "BilateralFollowPhoneLanguageRuler.kt", i = {0}, l = {FTPCodes.NAME_SYSTEM_TIME}, m = "invokeSuspend", n = {"settingsLanguageV2"}, s = {"L$0"})
    public static final class e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public Object a;
        public int b;
        public final /* synthetic */ HMBaseDevice c;
        public final /* synthetic */ BilateralFollowPhoneLanguageRuler d;

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
                return "There is no need to set the phone language to follow, because the current local configuration is to follow the phone language and the current phone language is consistent with the device language";
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function0<String> {
            public final /* synthetic */ boolean a;
            public final /* synthetic */ SettingsLanguageV2 b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(boolean z, SettingsLanguageV2 settingsLanguageV2) {
                super(0);
                this.a = z;
                this.b = settingsLanguageV2;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                boolean z = this.a;
                EnumData language = this.b.getLanguage();
                return "Set follow phone language results:" + z + ", the current set language is" + (language == null ? null : Integer.valueOf(language.getValue()));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class c extends Lambda implements Function0<String> {
            public final /* synthetic */ Exception a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(Exception exc) {
                super(0);
                this.a = exc;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return this.a.toString();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(HMBaseDevice hMBaseDevice, BilateralFollowPhoneLanguageRuler bilateralFollowPhoneLanguageRuler, Continuation<? super e> continuation) {
            super(2, continuation);
            this.c = hMBaseDevice;
            this.d = bilateralFollowPhoneLanguageRuler;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new e(this.c, this.d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LanguageComBination languageComBination;
            List<HMLanguage> languageList;
            List mutableList;
            HMOtherVersion otherVersion;
            HMLanguage language;
            SettingsLanguageV2 settingsLanguageV2;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.b;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    SettingsModule settingsModule = (SettingsModule) this.c.getChannelModule(SettingsModule.class);
                    if (settingsModule == null) {
                        return Unit.INSTANCE;
                    }
                    HMDeviceSource mDeviceSource = this.c.getMDeviceSource();
                    DeviceInfo deviceInfo = this.c.getDeviceInfo();
                    if (deviceInfo == null || (languageComBination = deviceInfo.getLanguageComBination()) == null || (languageList = languageComBination.getLanguageList()) == null) {
                        mutableList = null;
                    } else {
                        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(languageList, 10));
                        Iterator<T> it2 = languageList.iterator();
                        while (it2.hasNext()) {
                            arrayList.add(Boxing.boxInt(((HMLanguage) it2.next()).getLanguage()));
                        }
                        mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList);
                    }
                    if (mutableList == null) {
                        mutableList = new ArrayList();
                    }
                    Integer numF = this.d.f();
                    DeviceInfo deviceInfo2 = this.c.getDeviceInfo();
                    if (Intrinsics.areEqual(numF, (deviceInfo2 == null || (otherVersion = deviceInfo2.getOtherVersion()) == null || (language = otherVersion.getLanguage()) == null) ? null : Boxing.boxInt(language.getLanguage()))) {
                        DeviceLanguage deviceLanguage = DeviceLanguageConfig.INSTANCE.getDeviceLanguage(mDeviceSource.getValue());
                        if (deviceLanguage != null && deviceLanguage.isFollowSystem()) {
                            HMLog.info(BilateralFollowPhoneLanguageRuler.e, a.a);
                            return Unit.INSTANCE;
                        }
                    }
                    SettingsLanguageV2 settingsLanguageV3 = new SettingsLanguageV2();
                    mutableList.remove(Boxing.boxInt(-1));
                    int iIntValue = mutableList.isEmpty() ? 2 : ((Number) CollectionsKt.first(mutableList)).intValue();
                    if (numF != null) {
                        iIntValue = numF.intValue();
                    }
                    settingsLanguageV3.setLanguage(mutableList.contains(Boxing.boxInt(iIntValue)) ? new EnumData(iIntValue) : null);
                    settingsLanguageV3.setLanguageFollowMobilePhoneSwitch(Boxing.boxBoolean(true));
                    SettingsGroupType settingsGroupType = SettingsGroupType.LANGUAGE;
                    this.a = settingsLanguageV3;
                    this.b = 1;
                    obj = WatchSettingExtsKt.write(settingsModule, settingsGroupType, settingsLanguageV3, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    settingsLanguageV2 = settingsLanguageV3;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    settingsLanguageV2 = (SettingsLanguageV2) this.a;
                    ResultKt.throwOnFailure(obj);
                }
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                if (zBooleanValue) {
                    this.d.k(this.c, new HMLanguage(-1));
                }
                HMLog.info(BilateralFollowPhoneLanguageRuler.e, new b(zBooleanValue, settingsLanguageV2));
            } catch (Exception e) {
                HMLog.info(BilateralFollowPhoneLanguageRuler.e, new c(e));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BilateralFollowPhoneLanguageRuler() {
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.deviceUtilsApiLazy = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<DeviceUtilsApi>() { // from class: com.xiaomi.hm.health.ui.language.ruler.BilateralFollowPhoneLanguageRuler$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.devicex.injection.basic.DeviceUtilsApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final DeviceUtilsApi getA() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DeviceUtilsApi.class), qualifier, objArr);
            }
        });
        this.changeListeners = new LinkedHashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(Settings setting, HMBaseDevice device) {
        HMOtherVersion otherVersion;
        HMLanguage language;
        if (setting instanceof SettingsLanguageV2) {
            SettingsLanguageV2 settingsLanguageV2 = (SettingsLanguageV2) setting;
            if (Intrinsics.areEqual(settingsLanguageV2.getLanguageFollowMobilePhoneSwitch(), Boolean.TRUE)) {
                l(device);
                return;
            }
            EnumData language2 = settingsLanguageV2.getLanguage();
            Integer numValueOf = language2 == null ? null : Integer.valueOf(language2.getValue());
            if (numValueOf == null) {
                return;
            }
            int iIntValue = numValueOf.intValue();
            DeviceInfo deviceInfo = device.getDeviceInfo();
            if (deviceInfo != null && (otherVersion = deviceInfo.getOtherVersion()) != null && (language = otherVersion.getLanguage()) != null) {
                HMLanguage hMLanguage = iIntValue != language.getLanguage() ? language : null;
                if (hMLanguage != null) {
                    hMLanguage.setLanguage(iIntValue);
                }
            }
            k(device, new HMLanguage(iIntValue));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HMBaseDevice b() {
        Function0<? extends HMBaseDevice> function0 = this.functionDec;
        if (function0 == null) {
            return null;
        }
        return function0.getA();
    }

    private final DeviceInfo c() {
        HMBaseDevice hMBaseDeviceB = b();
        if (hMBaseDeviceB == null) {
            return null;
        }
        return hMBaseDeviceB.getDeviceInfo();
    }

    private final HMDeviceSource d() {
        DeviceInfo deviceInfoC = c();
        HMDeviceSource deviceSource = deviceInfoC == null ? null : deviceInfoC.getDeviceSource();
        return deviceSource == null ? HMDeviceSource.VDEVICE : deviceSource;
    }

    private final DeviceUtilsApi e() {
        return (DeviceUtilsApi) this.deviceUtilsApiLazy.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"ObsoleteSdkInt"})
    public final Integer f() {
        int localeToHmLanguageCode;
        Locale locale = Locale.getDefault();
        if (Build.VERSION.SDK_INT >= 21) {
            localeToHmLanguageCode = HmLanguageUtil.INSTANCE.parseLocaleToHmLanguageCode(locale);
        } else {
            HMLog.info(e, b.a);
            localeToHmLanguageCode = 2;
        }
        HMLog.info(e, new a(locale, localeToHmLanguageCode));
        return localeToHmLanguageCode;
    }

    private final void g() {
        kotlinx.coroutines.e.f(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new c(null), 2, null);
    }

    private final void h(HMBaseDevice device) {
        kotlinx.coroutines.e.f(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new d(device, this, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i(Settings setting, HMBaseDevice device) {
        a(setting, device);
    }

    private final void j(final HMBaseDevice device) {
        String address = device.getBluetoothDevice().getAddress();
        DeviceInfo deviceInfo = device.getDeviceInfo();
        String str = address + (deviceInfo == null ? null : deviceInfo.getSerialNumber());
        SettingsModule settingsModule = (SettingsModule) device.getChannelModule(SettingsModule.class);
        if (this.changeListeners.containsKey(str)) {
            m(device);
        }
        this.changeListeners.put(str, new ChangeListener() { // from class: com.xiaomi.hm.health.ui.language.ruler.BilateralFollowPhoneLanguageRuler$registerLanguageChangeListener$1
            @Override // com.huami.bluetooth.profile.channel.module.settings.ChangeListener
            public void onChange(@NotNull HashMap<SettingsGroupType, Settings> settings) {
                SettingsGroupType settingsGroupType = SettingsGroupType.LANGUAGE;
                if (settings.containsKey(settingsGroupType)) {
                    this.a.i(settings.get(settingsGroupType), device);
                }
            }
        });
        ChangeListener changeListener = this.changeListeners.get(str);
        if (changeListener == null || settingsModule == null) {
            return;
        }
        settingsModule.addListener(changeListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k(HMBaseDevice device, HMLanguage hmLanguage) {
        HMDeviceSource mDeviceSource = device.getMDeviceSource();
        if (mDeviceSource == null) {
            return;
        }
        DeviceLanguageConfig.INSTANCE.saveDeviceLanguageProperty(hmLanguage, mDeviceSource);
        e().updateAboutLanguageConfig(mDeviceSource);
        LocWeatherManager.getInstance().requestLocation();
        if (DeviceXFunctionsKt.getBuildConfigApi().isSupportCloudFwUpgrade() && HMFwOnlineUpgradeManager.getInstance().useOnline(mDeviceSource.getType())) {
            HMFwOnlineUpgradeManager.getInstance().enableFwUpgrade(true);
            HMFwOnlineManager.getInstance().checkFw(mDeviceSource.getType(), true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l(HMBaseDevice device) {
        kotlinx.coroutines.e.f(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new e(device, this, null), 3, null);
    }

    private final void m(HMBaseDevice device) {
        SettingsModule settingsModule = (SettingsModule) device.getChannelModule(SettingsModule.class);
        String address = device.getBluetoothDevice().getAddress();
        DeviceInfo deviceInfo = device.getDeviceInfo();
        ChangeListener changeListener = this.changeListeners.get(address + (deviceInfo == null ? null : deviceInfo.getSerialNumber()));
        if (changeListener == null || settingsModule == null) {
            return;
        }
        settingsModule.removeListener(changeListener);
    }

    @Override // com.xiaomi.hm.health.device.setting.life.DeviceVisibility
    public void disable(@NotNull HMBaseDevice device) {
        m(device);
    }

    @Override // com.xiaomi.hm.health.device.setting.life.DeviceVisibility
    public void enable(@NotNull HMBaseDevice device) {
        j(device);
        if (device.isConnected()) {
            g();
        }
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @Override // com.xiaomi.hm.health.ui.language.ruler.BaseLangRuler
    /* JADX INFO: renamed from: getPriority, reason: from getter */
    public int getPriorityCache() {
        return this.priorityCache;
    }

    @Override // com.xiaomi.hm.health.ui.language.ruler.BaseLangRuler
    public boolean isFitCurrentDeviceRuler(@Nullable final HMBaseDevice hmBaseDevice) {
        this.functionDec = new Function0<HMBaseDevice>() { // from class: com.xiaomi.hm.health.ui.language.ruler.BilateralFollowPhoneLanguageRuler.isFitCurrentDeviceRuler.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: from getter */
            public HMBaseDevice getA() {
                return hmBaseDevice;
            }
        };
        return ConfigHelperKt.hasFeature(Feature.SUPPORT_LANGUAGE_CHANGE_BY_APP_DEVICE, d());
    }

    @Override // com.xiaomi.hm.health.device.setting.life.DeviceLifeCycle
    public void onBoundedDeviceConnected(@NotNull HMBaseDevice device) {
        j(device);
    }

    @Override // com.xiaomi.hm.health.device.setting.life.DeviceLifeCycle
    public void onBoundedDeviceDisconnect(@NotNull String deviceId) {
    }

    @Override // com.xiaomi.hm.health.device.setting.life.DeviceLifeCycle
    public void onDeviceBind(@NotNull HMBaseDevice device) {
        j(device);
        h(device);
    }

    @Override // com.xiaomi.hm.health.device.setting.life.DeviceLifeCycle
    public void onDeviceStatusChange(@Nullable Device device, int status) {
        if (status == 1) {
            g();
        }
    }

    @Override // com.xiaomi.hm.health.device.setting.life.DeviceLifeCycle
    public void onDeviceUnBind(@NotNull HMBaseDevice device) {
        m(device);
    }

    @Override // com.xiaomi.hm.health.ui.language.ruler.BaseLangRuler
    public void setPriority(int priority) {
        this.priorityCache = priority;
    }
}
