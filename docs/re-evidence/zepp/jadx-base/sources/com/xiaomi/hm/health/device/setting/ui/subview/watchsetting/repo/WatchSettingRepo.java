package com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.repo;

import com.huami.bluetooth.profile.channel.module.settings.SettingsExtsKt;
import com.huami.bluetooth.profile.channel.module.settings.SettingsGroupType;
import com.huami.bluetooth.profile.channel.module.settings.SettingsModule;
import com.huami.bluetooth.profile.channel.module.settings.entity.displayandbrightness.DisplayAndBrightness;
import com.huami.bluetooth.profile.channel.module.settings.entity.general.General;
import com.huami.bluetooth.profile.channel.module.settings.entity.offlinevoice.OfflineVoice;
import com.huami.bluetooth.profile.channel.module.settings.entity.screenlock.ScreenLockAndPassword;
import com.huami.bluetooth.profile.channel.module.settings.entity.soundandvibrate.v1.SoundAndVibrateV1;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.Settings;
import com.huami.koinstartup.KoinComponentAdapter;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.device.setting.DeviceCenter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 !2\u00020\u00012\u00020\u0002:\u0001!B\u0007¢\u0006\u0004\b\u001f\u0010 JI\u0010\u000b\u001a\"\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t\u0018\u00010\bj\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t\u0018\u0001`\n2\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0004\u001a\u00020\u0003H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0004\u001a\u00020\u0003H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u000fJ\u001d\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0004\u001a\u00020\u0003H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u000fJ\u001d\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0004\u001a\u00020\u0003H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u000fR\u001d\u0010\u001a\u001a\u00020\u00168B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001b8B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\""}, d2 = {"Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/repo/WatchSettingRepo;", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/repo/IWatchSettingRepo;", "Lcom/huami/koinstartup/KoinComponentAdapter;", "", "needDesc", "", "Lcom/huami/bluetooth/profile/channel/module/settings/SettingsGroupType;", "groupType", "Ljava/util/HashMap;", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Settings;", "Lkotlin/collections/HashMap;", "querySettings", "(Z[Lcom/huami/bluetooth/profile/channel/module/settings/SettingsGroupType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/bluetooth/profile/channel/module/settings/entity/offlinevoice/OfflineVoice;", "queryOfflineVoiceV1", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/bluetooth/profile/channel/module/settings/entity/displayandbrightness/DisplayAndBrightness;", "queryDisplayBrightnessV1", "Lcom/huami/bluetooth/profile/channel/module/settings/entity/screenlock/ScreenLockAndPassword;", "queryScreenUnlockAndPassword", "Lcom/huami/bluetooth/profile/channel/module/settings/entity/soundandvibrate/v1/SoundAndVibrateV1;", "querySoundVibrateV1", "Lcom/xiaomi/hm/health/device/setting/DeviceCenter;", "a", "Lkotlin/Lazy;", "()Lcom/xiaomi/hm/health/device/setting/DeviceCenter;", "deviceCenter", "Lcom/huami/bluetooth/profile/channel/module/settings/SettingsModule;", "b", "()Lcom/huami/bluetooth/profile/channel/module/settings/SettingsModule;", "settingsModule", "<init>", "()V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class WatchSettingRepo implements IWatchSettingRepo, KoinComponentAdapter {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final HashMap<SettingsGroupType, ArrayList<Integer>> b;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceCenter;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rRU\u0010\b\u001a>\u0012\u0004\u0012\u00020\u0003\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u00060\u0002j\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006`\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/repo/WatchSettingRepo$Companion;", "", "Ljava/util/HashMap;", "Lcom/huami/bluetooth/profile/channel/module/settings/SettingsGroupType;", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "Lkotlin/collections/HashMap;", "queryAllParams", "Ljava/util/HashMap;", "getQueryAllParams", "()Ljava/util/HashMap;", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final HashMap<SettingsGroupType, ArrayList<Integer>> getQueryAllParams() {
            return WatchSettingRepo.b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.repo.WatchSettingRepo", f = "WatchSettingRepo.kt", i = {}, l = {124}, m = "queryDisplayBrightnessV1", n = {}, s = {})
    public static final class a extends ContinuationImpl {
        public /* synthetic */ Object a;
        public int c;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            return WatchSettingRepo.this.queryDisplayBrightnessV1(false, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.repo.WatchSettingRepo", f = "WatchSettingRepo.kt", i = {}, l = {124}, m = "queryOfflineVoiceV1", n = {}, s = {})
    public static final class b extends ContinuationImpl {
        public /* synthetic */ Object a;
        public int c;

        public b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            return WatchSettingRepo.this.queryOfflineVoiceV1(false, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.repo.WatchSettingRepo", f = "WatchSettingRepo.kt", i = {}, l = {124}, m = "queryScreenUnlockAndPassword", n = {}, s = {})
    public static final class c extends ContinuationImpl {
        public /* synthetic */ Object a;
        public int c;

        public c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            return WatchSettingRepo.this.queryScreenUnlockAndPassword(false, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.repo.WatchSettingRepo", f = "WatchSettingRepo.kt", i = {}, l = {34, 48}, m = "querySettings", n = {}, s = {})
    public static final class d extends ContinuationImpl {
        public /* synthetic */ Object a;
        public int c;

        public d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            return WatchSettingRepo.this.querySettings(false, null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.repo.WatchSettingRepo", f = "WatchSettingRepo.kt", i = {}, l = {124}, m = "querySoundVibrateV1", n = {}, s = {})
    public static final class e extends ContinuationImpl {
        public /* synthetic */ Object a;
        public int c;

        public e(Continuation<? super e> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            return WatchSettingRepo.this.querySoundVibrateV1(false, this);
        }
    }

    static {
        HashMap<SettingsGroupType, ArrayList<Integer>> map = new HashMap<>();
        map.put(SettingsGroupType.DISPLAY, new ArrayList<>());
        map.put(SettingsGroupType.SOUND_AND_VIBRATION, new ArrayList<>());
        map.put(SettingsGroupType.SPORT, new ArrayList<>());
        SettingsGroupType settingsGroupType = SettingsGroupType.GENERAL;
        General.Companion companion = General.INSTANCE;
        map.put(settingsGroupType, CollectionsKt__CollectionsKt.arrayListOf(Integer.valueOf(companion.getKEY_DND_MODE()), Integer.valueOf(companion.getKEY_DND_START_TIME()), Integer.valueOf(companion.getKEY_DND_STOP_TIME()), Integer.valueOf(companion.getKEY_LONG_PRESS_UP_APP()), Integer.valueOf(companion.getKEY_CLICK_DOWN_APP()), Integer.valueOf(companion.getKEY_LONG_PRESS_SIDE_APP()), Integer.valueOf(companion.getKEY_CLICK_SELECT_APP()), Integer.valueOf(companion.getKEY_NIGHT_MODE()), Integer.valueOf(companion.getKEY_NIGHT_MODE_START_TIME()), Integer.valueOf(companion.getKEY_NIGHT_MODE_STOP_TIME()), Integer.valueOf(companion.getKEY_SLEEP_MODE_SWITCH()), Integer.valueOf(companion.getKEY_SLEEP_MODE_FOR_DISPLAY_SWITCH()), Integer.valueOf(companion.getKEY_SLEEP_MODE_SMART_ENABLE_SWITCH())));
        map.put(SettingsGroupType.SCREEN_UNLOCK_AND_PASSWORD, new ArrayList<>());
        map.put(SettingsGroupType.OFFLINE_VOICE, new ArrayList<>());
        map.put(SettingsGroupType.WEARING, new ArrayList<>());
        map.put(SettingsGroupType.LANGUAGE, new ArrayList<>());
        b = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WatchSettingRepo() {
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.deviceCenter = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<DeviceCenter>() { // from class: com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.repo.WatchSettingRepo$special$$inlined$inject$default$1
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
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DeviceCenter.class), qualifier, objArr);
            }
        });
    }

    private final DeviceCenter a() {
        return (DeviceCenter) this.deviceCenter.getValue();
    }

    private final SettingsModule b() {
        HMBaseDevice device = a().getDevice();
        if (device == null) {
            return null;
        }
        return (SettingsModule) device.getChannelModule(SettingsModule.class);
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponentAdapter.DefaultImpls.getKoin(this);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.repo.IWatchSettingRepo
    @Nullable
    public Object queryDisplayBrightnessV1(boolean z, @NotNull Continuation<? super DisplayAndBrightness> continuation) {
        a aVar;
        SettingsModule settingsModuleB;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i = aVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.c = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object objQuery = aVar.a;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = aVar.c;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objQuery);
            SettingsModule settingsModuleB2 = b();
            if (!(settingsModuleB2 == null ? false : Intrinsics.areEqual(settingsModuleB2.getVersion(), Boxing.boxInt(1))) || (settingsModuleB = b()) == null) {
                return null;
            }
            SettingsGroupType settingsGroupType = SettingsGroupType.DISPLAY;
            aVar.c = 1;
            objQuery = SettingsExtsKt.query(settingsModuleB, settingsGroupType, z, aVar);
            if (objQuery == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objQuery);
        }
        return (DisplayAndBrightness) (objQuery instanceof DisplayAndBrightness ? objQuery : null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.repo.IWatchSettingRepo
    @Nullable
    public Object queryOfflineVoiceV1(boolean z, @NotNull Continuation<? super OfflineVoice> continuation) {
        b bVar;
        SettingsModule settingsModuleB;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i = bVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                bVar.c = i - Integer.MIN_VALUE;
            } else {
                bVar = new b(continuation);
            }
        } else {
            bVar = new b(continuation);
        }
        Object objQuery = bVar.a;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = bVar.c;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objQuery);
            SettingsModule settingsModuleB2 = b();
            if (!(settingsModuleB2 == null ? false : Intrinsics.areEqual(settingsModuleB2.getVersion(), Boxing.boxInt(1))) || (settingsModuleB = b()) == null) {
                return null;
            }
            SettingsGroupType settingsGroupType = SettingsGroupType.OFFLINE_VOICE;
            bVar.c = 1;
            objQuery = SettingsExtsKt.query(settingsModuleB, settingsGroupType, z, bVar);
            if (objQuery == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objQuery);
        }
        return (OfflineVoice) (objQuery instanceof OfflineVoice ? objQuery : null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.repo.IWatchSettingRepo
    @Nullable
    public Object queryScreenUnlockAndPassword(boolean z, @NotNull Continuation<? super ScreenLockAndPassword> continuation) {
        c cVar;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i = cVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                cVar.c = i - Integer.MIN_VALUE;
            } else {
                cVar = new c(continuation);
            }
        } else {
            cVar = new c(continuation);
        }
        Object objQuery = cVar.a;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = cVar.c;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objQuery);
            SettingsModule settingsModuleB = b();
            if (settingsModuleB == null) {
                return null;
            }
            SettingsGroupType settingsGroupType = SettingsGroupType.SCREEN_UNLOCK_AND_PASSWORD;
            cVar.c = 1;
            objQuery = SettingsExtsKt.query(settingsModuleB, settingsGroupType, z, cVar);
            if (objQuery == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objQuery);
        }
        return (ScreenLockAndPassword) (objQuery instanceof ScreenLockAndPassword ? objQuery : null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.repo.IWatchSettingRepo
    @Nullable
    public Object querySettings(boolean z, @NotNull SettingsGroupType[] settingsGroupTypeArr, @NotNull Continuation<? super HashMap<SettingsGroupType, Settings>> continuation) {
        d dVar;
        Settings settingsQueryFieldsSync;
        if (continuation instanceof d) {
            dVar = (d) continuation;
            int i = dVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                dVar.c = i - Integer.MIN_VALUE;
            } else {
                dVar = new d(continuation);
            }
        } else {
            dVar = new d(continuation);
        }
        Object objQuerySettings = dVar.a;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = dVar.c;
        if (i2 != 0) {
            if (i2 == 1) {
                ResultKt.throwOnFailure(objQuerySettings);
                return (HashMap) objQuerySettings;
            }
            if (i2 == 2) {
                ResultKt.throwOnFailure(objQuerySettings);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(objQuerySettings);
        SettingsModule settingsModuleB = b();
        Integer version = settingsModuleB == null ? null : settingsModuleB.getVersion();
        if (version == null || version.intValue() < 2) {
            SettingsModule settingsModuleB2 = b();
            if (settingsModuleB2 == null) {
                return null;
            }
            dVar.c = 1;
            objQuerySettings = settingsModuleB2.querySettings(z, settingsGroupTypeArr, dVar);
            if (objQuerySettings == coroutine_suspended) {
                return coroutine_suspended;
            }
            return (HashMap) objQuerySettings;
        }
        if (!(settingsGroupTypeArr.length == 0)) {
            SettingsModule settingsModuleB3 = b();
            if (settingsModuleB3 == null) {
                return null;
            }
            dVar.c = 2;
            objQuerySettings = settingsModuleB3.querySettings(z, settingsGroupTypeArr, dVar);
            return objQuerySettings == coroutine_suspended ? coroutine_suspended : objQuerySettings;
        }
        HashMap map = new HashMap();
        for (Map.Entry<SettingsGroupType, ArrayList<Integer>> entry : b.entrySet()) {
            SettingsModule settingsModuleB4 = b();
            if (settingsModuleB4 != null && (settingsQueryFieldsSync = settingsModuleB4.queryFieldsSync(z, entry.getKey(), entry.getValue())) != null) {
                map.put(entry.getKey(), settingsQueryFieldsSync);
            }
        }
        return map;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.repo.IWatchSettingRepo
    @Nullable
    public Object querySoundVibrateV1(boolean z, @NotNull Continuation<? super SoundAndVibrateV1> continuation) {
        e eVar;
        SettingsModule settingsModuleB;
        if (continuation instanceof e) {
            eVar = (e) continuation;
            int i = eVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                eVar.c = i - Integer.MIN_VALUE;
            } else {
                eVar = new e(continuation);
            }
        } else {
            eVar = new e(continuation);
        }
        Object objQuery = eVar.a;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = eVar.c;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objQuery);
            SettingsModule settingsModuleB2 = b();
            if (!(settingsModuleB2 == null ? false : Intrinsics.areEqual(settingsModuleB2.getVersion(), Boxing.boxInt(1))) || (settingsModuleB = b()) == null) {
                return null;
            }
            SettingsGroupType settingsGroupType = SettingsGroupType.SOUND_AND_VIBRATION;
            eVar.c = 1;
            objQuery = SettingsExtsKt.query(settingsModuleB, settingsGroupType, z, eVar);
            if (objQuery == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objQuery);
        }
        return (SoundAndVibrateV1) (objQuery instanceof SoundAndVibrateV1 ? objQuery : null);
    }
}
