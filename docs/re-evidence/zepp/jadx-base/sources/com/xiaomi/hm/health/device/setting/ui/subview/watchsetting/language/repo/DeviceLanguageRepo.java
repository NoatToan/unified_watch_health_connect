package com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.language.repo;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.bluetooth.profile.channel.module.settings.ChangeListener;
import com.huami.bluetooth.profile.channel.module.settings.SettingsGroupType;
import com.huami.bluetooth.profile.channel.module.settings.SettingsModule;
import com.huami.bluetooth.profile.channel.module.settings.entity.language.v2.SettingsLanguageV2;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.EnumData;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.Settings;
import com.huami.devicex.R;
import com.huami.devicex.funapi.DeviceXFunctionsKt;
import com.huami.devicex.injection.basic.DeviceUtilsApi;
import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.bt.model.HMLanguage;
import com.xiaomi.hm.health.bt.model.HmLocale;
import com.xiaomi.hm.health.bt.profile.base.DeviceInfo;
import com.xiaomi.hm.health.bt.profile.base.HMOtherVersion;
import com.xiaomi.hm.health.device.introduce.IntroduceShuffleFactoryKt;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.WatchSettingExtsKt;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.language.vo.CommonLanguageConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 42\u00020\u00012\u00020\u0002:\u00014B\u0007¢\u0006\u0004\b2\u00103J.\u0010\t\u001a\u00020\b2&\u0010\u0007\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003j\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u0001`\u0006J\u0015\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\nH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0010\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001d\u0010\u001d\u001a\u00020\u00198B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u001d\u0010!\u001a\u00020\u001e8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u001b\u001a\u0004\b\u0016\u0010 R\u001c\u0010'\u001a\u00020\"8\u0016@\u0016X\u0096D¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R6\u0010\u0007\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003j\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u0001`\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0018\u0010,\u001a\u0004\u0018\u00010*8B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010+R\"\u00101\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\"0-8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u00100\u0082\u0002\u0004\n\u0002\b\u0019¨\u00065"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/language/repo/DeviceLanguageRepo;", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/language/repo/ICommonLanguageRepo;", "Lorg/koin/core/component/KoinComponent;", "Ljava/util/HashMap;", "Lcom/huami/bluetooth/profile/channel/module/settings/SettingsGroupType;", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Settings;", "Lkotlin/collections/HashMap;", "watchSettings", "", "setSettings", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/language/vo/CommonLanguageConfig;", "queryLanguageConfig", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "languageConfig", "", "setLanguageConfig", "(Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/language/vo/CommonLanguageConfig;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/bluetooth/profile/channel/module/settings/ChangeListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "addListener", "removeListener", "Lcom/huami/bluetooth/profile/channel/module/settings/SettingsModule;", "a", "Lcom/huami/bluetooth/profile/channel/module/settings/SettingsModule;", "settingsModule", "Lcom/huami/devicex/injection/basic/DeviceUtilsApi;", "b", "Lkotlin/Lazy;", "()Lcom/huami/devicex/injection/basic/DeviceUtilsApi;", "deviceUtilsApi", "Lcom/huami/devicex/manager/DeviceManagerApi;", "c", "()Lcom/huami/devicex/manager/DeviceManagerApi;", "deviceManagerApi", "", GoogleApiAvailabilityLight.a, "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "e", "Ljava/util/HashMap;", "Lcom/huami/bluetooth/profile/channel/module/settings/entity/language/v2/SettingsLanguageV2;", "()Lcom/huami/bluetooth/profile/channel/module/settings/entity/language/v2/SettingsLanguageV2;", "settingsLanguageV2", "Lkotlin/Function1;", "", "getToDesc", "()Lkotlin/jvm/functions/Function1;", "toDesc", "<init>", "()V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class DeviceLanguageRepo implements ICommonLanguageRepo, KoinComponent {
    public static final int KEY_FOLLOW_PHONE = -1;

    @NotNull
    private static final String f = "DeviceLanguageRepo";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private SettingsModule settingsModule;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceUtilsApi;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceManagerApi;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final String name;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private HashMap<SettingsGroupType, Settings> watchSettings;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "language: " + DeviceLanguageRepo.this.c();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.language.repo.DeviceLanguageRepo", f = "DeviceLanguageRepo.kt", i = {0}, l = {103}, m = "setLanguageConfig", n = {"settingsLanguage"}, s = {"L$1"})
    public static final class b extends ContinuationImpl {
        public Object a;
        public Object b;
        public int c;
        public /* synthetic */ Object d;
        public int f;

        public b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.d = obj;
            this.f |= Integer.MIN_VALUE;
            return DeviceLanguageRepo.this.setLanguageConfig(null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ SettingsLanguageV2 a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(SettingsLanguageV2 settingsLanguageV2) {
            super(0);
            this.a = settingsLanguageV2;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "language: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "languageKey", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function1<Integer, String> {
        public d() {
            super(1);
        }

        @NotNull
        public final String a(int i) {
            return i == -1 ? IntroduceShuffleFactoryKt.getString(R.string.ds_language_follow_phone) : IntroduceShuffleFactoryKt.getString(DeviceLanguageRepo.this.b().getLanguageStringResId(DeviceXFunctionsKt.getContext(), HmLocale.getLocale(i)));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ String invoke(Integer num) {
            return a(num.intValue());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DeviceLanguageRepo() {
        KoinPlatformTools koinPlatformTools = KoinPlatformTools.INSTANCE;
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = koinPlatformTools.defaultLazyMode();
        final Object[] objArr = 0 == true ? 1 : 0;
        final Object[] objArr2 = 0 == true ? 1 : 0;
        this.deviceUtilsApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<DeviceUtilsApi>() { // from class: com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.language.repo.DeviceLanguageRepo$special$$inlined$inject$default$1
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
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DeviceUtilsApi.class), objArr, objArr2);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode2 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr3 = 0 == true ? 1 : 0;
        final Object[] objArr4 = 0 == true ? 1 : 0;
        this.deviceManagerApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode2, (Function0) new Function0<DeviceManagerApi>() { // from class: com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.language.repo.DeviceLanguageRepo$special$$inlined$inject$default$2
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
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DeviceManagerApi.class), objArr3, objArr4);
            }
        });
        HMBaseDevice device = a().getDevice(HMDeviceType.MILI);
        this.settingsModule = device != null ? (SettingsModule) device.getChannelModule(SettingsModule.class) : null;
        this.name = f;
    }

    private final DeviceManagerApi a() {
        return (DeviceManagerApi) this.deviceManagerApi.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DeviceUtilsApi b() {
        return (DeviceUtilsApi) this.deviceUtilsApi.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SettingsLanguageV2 c() {
        HashMap<SettingsGroupType, Settings> map = this.watchSettings;
        Settings settings = map == null ? null : map.get(SettingsGroupType.LANGUAGE);
        if (settings instanceof SettingsLanguageV2) {
            return (SettingsLanguageV2) settings;
        }
        return null;
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.language.repo.ICommonLanguageRepo
    public void addListener(@NotNull ChangeListener listener) {
        SettingsModule settingsModule = this.settingsModule;
        if (settingsModule == null) {
            return;
        }
        settingsModule.addListener(listener);
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.language.repo.ICommonLanguageRepo
    @NotNull
    public String getName() {
        return this.name;
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.language.repo.ICommonLanguageRepo
    @NotNull
    public Function1<Integer, String> getToDesc() {
        return new d();
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.language.repo.ICommonLanguageRepo
    @Nullable
    public Object queryLanguageConfig(@NotNull Continuation<? super CommonLanguageConfig> continuation) {
        EnumData language;
        EnumData language2;
        HMLog.info(f, new a());
        SettingsLanguageV2 settingsLanguageV2C = c();
        ArrayList<Integer> enums = (settingsLanguageV2C == null || (language = settingsLanguageV2C.getLanguage()) == null) ? null : language.getEnums();
        if (enums == null) {
            return null;
        }
        SettingsLanguageV2 settingsLanguageV2C2 = c();
        Integer numBoxInt = (settingsLanguageV2C2 == null || (language2 = settingsLanguageV2C2.getLanguage()) == null) ? null : Boxing.boxInt(language2.getValue());
        if (numBoxInt == null) {
            return null;
        }
        int iIntValue = numBoxInt.intValue();
        ArrayList arrayList = new ArrayList();
        arrayList.add(Boxing.boxInt(-1));
        arrayList.addAll(enums);
        SettingsLanguageV2 settingsLanguageV2C3 = c();
        if (settingsLanguageV2C3 == null ? false : Intrinsics.areEqual(settingsLanguageV2C3.getLanguageFollowMobilePhoneSwitch(), Boxing.boxBoolean(true))) {
            iIntValue = -1;
        }
        return new CommonLanguageConfig(arrayList, arrayList.indexOf(Boxing.boxInt(iIntValue)), getToDesc());
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.language.repo.ICommonLanguageRepo
    public void removeListener(@NotNull ChangeListener listener) {
        SettingsModule settingsModule = this.settingsModule;
        if (settingsModule == null) {
            return;
        }
        settingsModule.removeListener(listener);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:50:0x0103  */
    /* JADX WARN: Code duplicated, block: B:51:0x0106  */
    /* JADX WARN: Code duplicated, block: B:53:0x0109  */
    /* JADX WARN: Code duplicated, block: B:63:0x0120  */
    /* JADX WARN: Code duplicated, block: B:65:0x0125  */
    /* JADX WARN: Code duplicated, block: B:68:0x012c  */
    /* JADX WARN: Code duplicated, block: B:69:0x0134  */
    /* JADX WARN: Code duplicated, block: B:72:0x013b  */
    /* JADX WARN: Code duplicated, block: B:76:0x0149  */
    /* JADX WARN: Code duplicated, block: B:79:0x0150  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.language.repo.ICommonLanguageRepo
    @Nullable
    public Object setLanguageConfig(@NotNull CommonLanguageConfig commonLanguageConfig, @NotNull Continuation<? super Boolean> continuation) {
        b bVar;
        SettingsLanguageV2 settingsLanguageV2;
        DeviceLanguageRepo deviceLanguageRepo;
        SettingsLanguageV2 settingsLanguageV3;
        int i;
        boolean zBooleanValue;
        EnumData language;
        SettingsLanguageV2 settingsLanguageV2C;
        EnumData language2;
        SettingsLanguageV2 settingsLanguageV2C2;
        Integer numBoxInt;
        int iIntValue;
        HMBaseDevice miliDevice;
        HMMiLiProDevice hMMiLiProDevice;
        DeviceInfo deviceInfo;
        HMOtherVersion otherVersion;
        HMLanguage language3;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i2 = bVar.f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.f = i2 - Integer.MIN_VALUE;
            } else {
                bVar = new b(continuation);
            }
        } else {
            bVar = new b(continuation);
        }
        Object obj = bVar.d;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = bVar.f;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            int currLanguageKey = commonLanguageConfig.getCurrLanguageKey();
            settingsLanguageV2 = new SettingsLanguageV2();
            if (currLanguageKey == -1) {
                settingsLanguageV2.setLanguageFollowMobilePhoneSwitch(Boxing.boxBoolean(true));
                Integer hMLanguage = b().getHMLanguage(Locale.getDefault());
                List mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) commonLanguageConfig.getLanguageKeys());
                mutableList.remove(Boxing.boxInt(-1));
                int iIntValue2 = mutableList.isEmpty() ? 2 : ((Number) CollectionsKt.first(mutableList)).intValue();
                if (hMLanguage != null) {
                    iIntValue2 = hMLanguage.intValue();
                }
                settingsLanguageV2.setLanguage(mutableList.contains(Boxing.boxInt(iIntValue2)) ? new EnumData(iIntValue2) : null);
            } else {
                settingsLanguageV2.setLanguageFollowMobilePhoneSwitch(Boxing.boxBoolean(false));
                settingsLanguageV2.setLanguage(new EnumData(currLanguageKey));
            }
            HMLog.info(f, new c(settingsLanguageV2));
            SettingsModule settingsModule = this.settingsModule;
            if (settingsModule == null) {
                deviceLanguageRepo = this;
                i = currLanguageKey;
            } else {
                SettingsGroupType settingsGroupType = SettingsGroupType.LANGUAGE;
                bVar.a = this;
                bVar.b = settingsLanguageV2;
                bVar.c = currLanguageKey;
                bVar.f = 1;
                Object objWrite = WatchSettingExtsKt.write(settingsModule, settingsGroupType, settingsLanguageV2, bVar);
                if (objWrite == coroutine_suspended) {
                    return coroutine_suspended;
                }
                deviceLanguageRepo = this;
                settingsLanguageV3 = settingsLanguageV2;
                obj = objWrite;
                i = currLanguageKey;
            }
            zBooleanValue = false;
            if (zBooleanValue) {
                language = settingsLanguageV2.getLanguage();
                if (language != null && (numBoxInt = Boxing.boxInt(language.getValue())) != null) {
                    iIntValue = numBoxInt.intValue();
                    miliDevice = deviceLanguageRepo.a().getMiliDevice();
                    if (miliDevice instanceof HMMiLiProDevice) {
                        hMMiLiProDevice = (HMMiLiProDevice) miliDevice;
                    } else {
                        hMMiLiProDevice = null;
                    }
                    if (hMMiLiProDevice != null || (deviceInfo = hMMiLiProDevice.getDeviceInfo()) == null || (otherVersion = deviceInfo.getOtherVersion()) == null) {
                        language3 = null;
                    } else {
                        language3 = otherVersion.getLanguage();
                    }
                    if (language3 != null) {
                        language3.setLanguage(iIntValue);
                    }
                }
                if (i == -1) {
                    settingsLanguageV2C2 = deviceLanguageRepo.c();
                    if (settingsLanguageV2C2 != null) {
                        settingsLanguageV2C2.setLanguageFollowMobilePhoneSwitch(Boxing.boxBoolean(true));
                    }
                } else {
                    settingsLanguageV2C = deviceLanguageRepo.c();
                    if (settingsLanguageV2C != null) {
                        settingsLanguageV2C.setLanguageFollowMobilePhoneSwitch(Boxing.boxBoolean(false));
                    }
                    SettingsLanguageV2 settingsLanguageV2C3 = deviceLanguageRepo.c();
                    language2 = settingsLanguageV2C3 != null ? settingsLanguageV2C3.getLanguage() : null;
                    if (language2 != null) {
                        language2.setValue(i);
                    }
                }
            }
            return Boxing.boxBoolean(zBooleanValue);
        }
        if (i3 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        i = bVar.c;
        settingsLanguageV3 = (SettingsLanguageV2) bVar.b;
        deviceLanguageRepo = (DeviceLanguageRepo) bVar.a;
        ResultKt.throwOnFailure(obj);
        Boolean bool = (Boolean) obj;
        if (bool == null) {
            settingsLanguageV2 = settingsLanguageV3;
            zBooleanValue = false;
        } else {
            zBooleanValue = bool.booleanValue();
            settingsLanguageV2 = settingsLanguageV3;
        }
        if (zBooleanValue) {
            language = settingsLanguageV2.getLanguage();
            if (language != null) {
                iIntValue = numBoxInt.intValue();
                miliDevice = deviceLanguageRepo.a().getMiliDevice();
                if (miliDevice instanceof HMMiLiProDevice) {
                    hMMiLiProDevice = (HMMiLiProDevice) miliDevice;
                } else {
                    hMMiLiProDevice = null;
                }
                if (hMMiLiProDevice != null) {
                    language3 = null;
                } else {
                    language3 = otherVersion.getLanguage();
                }
                if (language3 != null) {
                    language3.setLanguage(iIntValue);
                }
            }
            if (i == -1) {
                settingsLanguageV2C2 = deviceLanguageRepo.c();
                if (settingsLanguageV2C2 != null) {
                    settingsLanguageV2C2.setLanguageFollowMobilePhoneSwitch(Boxing.boxBoolean(true));
                }
            } else {
                settingsLanguageV2C = deviceLanguageRepo.c();
                if (settingsLanguageV2C != null) {
                    settingsLanguageV2C.setLanguageFollowMobilePhoneSwitch(Boxing.boxBoolean(false));
                }
                SettingsLanguageV2 settingsLanguageV2C4 = deviceLanguageRepo.c();
                if (settingsLanguageV2C4 != null) {
                }
                if (language2 != null) {
                    language2.setValue(i);
                }
            }
        }
        return Boxing.boxBoolean(zBooleanValue);
    }

    public final void setSettings(@Nullable HashMap<SettingsGroupType, Settings> watchSettings) {
        this.watchSettings = watchSettings;
    }
}
