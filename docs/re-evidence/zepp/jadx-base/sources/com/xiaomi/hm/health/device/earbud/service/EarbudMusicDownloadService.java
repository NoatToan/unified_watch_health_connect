package com.xiaomi.hm.health.device.earbud.service;

import android.content.Context;
import android.content.Intent;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import androidx.core.app.JobIntentService;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.devicex.funapi.DeviceXFunctionsKt;
import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.sky.lib.constant.WebConstant;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.HmBaseEarbudDevice;
import com.xiaomi.hm.health.bt.device.HmEarbudDevice;
import com.xiaomi.hm.health.bt.profile.base.BatteryInfo;
import com.xiaomi.hm.health.bt.profile.dfu.HMFirmwareInfo;
import com.xiaomi.hm.health.bt.profile.dfu.HMFirmwareType;
import com.xiaomi.hm.health.bt.profile.dfu.HmVoiceType;
import com.xiaomi.hm.health.bt.profile.dfu.IHMFirmwareUpgradeCallback;
import com.xiaomi.hm.health.bt.profile.mili.model.Progress;
import com.xiaomi.hm.health.databases.HMDaoManager;
import com.xiaomi.hm.health.databases.model.EarbudMusicInfo;
import com.xiaomi.hm.health.databases.model.EarbudMusicInfoDao;
import com.xiaomi.hm.health.device.firmware.FirmwareManagerApi;
import java.io.File;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.query.QueryBuilder;
import org.greenrobot.greendao.query.WhereCondition;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \"2\u00020\u00012\u00020\u0002:\u0001\"B\u0007¢\u0006\u0004\b \u0010!J\b\u0010\u0004\u001a\u00020\u0003H\u0002J \u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\fH\u0014R\u001d\u0010\u0013\u001a\u00020\u000f8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0017\u001a\u00020\u00148B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0010\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u001b\u001a\u00020\u00188B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\u001f\u001a\u00020\u001c8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0010\u001a\u0004\b\u001d\u0010\u001e¨\u0006#"}, d2 = {"Lcom/xiaomi/hm/health/device/earbud/service/EarbudMusicDownloadService;", "Landroidx/core/app/JobIntentService;", "Lorg/koin/core/component/KoinComponent;", "", "a", "Lcom/xiaomi/hm/health/bt/device/HmEarbudDevice;", "device", "Lcom/xiaomi/hm/health/databases/model/EarbudMusicInfo;", WebConstant.QueryParam.TYPE_MUSIC, "Lcom/xiaomi/hm/health/bt/profile/dfu/HMFirmwareInfo;", "firmwareInfo", "f", "Landroid/content/Intent;", "intent", "onHandleWork", "Lcom/xiaomi/hm/health/databases/model/EarbudMusicInfoDao;", "Lkotlin/Lazy;", "b", "()Lcom/xiaomi/hm/health/databases/model/EarbudMusicInfoDao;", "dao", "Lcom/huami/devicex/manager/DeviceManagerApi;", "c", "()Lcom/huami/devicex/manager/DeviceManagerApi;", "deviceManagerApi", "Lcom/xiaomi/hm/health/device/firmware/FirmwareManagerApi;", GoogleApiAvailabilityLight.a, "()Lcom/xiaomi/hm/health/device/firmware/FirmwareManagerApi;", "firmwareManagerApi", "Landroid/os/Handler;", "e", "()Landroid/os/Handler;", "handler", "<init>", "()V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class EarbudMusicDownloadService extends JobIntentService implements KoinComponent {

    @NotNull
    private static final String e = "EarbudMusicDownloadService";
    private static final int f = 1;
    private static final long g = 10000;
    private static final long h = 300000;
    private static final int i = 20;
    private static final int j = 10001;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy dao = LazyKt__LazyJVMKt.lazy(a.a);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceManagerApi;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy firmwareManagerApi;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy handler;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final AtomicBoolean k = new AtomicBoolean(false);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\bR\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0010\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\bR\u0016\u0010\u0011\u001a\u00020\r8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR\u0016\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/hm/health/device/earbud/service/EarbudMusicDownloadService$Companion;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "startDownload", "", "DOWNLOAD_BATTERY", LogUtil.I, "Ljava/util/concurrent/atomic/AtomicBoolean;", "IS_RUNNING", "Ljava/util/concurrent/atomic/AtomicBoolean;", "JOB_ID", "", "RETRY_INTERVAL", "J", "START_DOWNLOAD_MSG", "SYNC_LOG_INTERVAL", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void startDownload(@NotNull Context context) {
            JobIntentService.enqueueWork(context, (Class<?>) EarbudMusicDownloadService.class, 10001, new Intent());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/databases/model/EarbudMusicInfoDao;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<EarbudMusicInfoDao> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final EarbudMusicInfoDao getA() {
            return HMDaoManager.getInstance().getEarbudMusicInfoDao();
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
            return "sync data is forbidden as in HMFwUpgradeFailedActivity.";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "forbidden download music when is feedback";
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
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "download file fail";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public static final e a = new e();

        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "return as low battery";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EarbudMusicDownloadService() {
        KoinPlatformTools koinPlatformTools = KoinPlatformTools.INSTANCE;
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = koinPlatformTools.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.deviceManagerApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<DeviceManagerApi>() { // from class: com.xiaomi.hm.health.device.earbud.service.EarbudMusicDownloadService$special$$inlined$inject$default$1
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
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DeviceManagerApi.class), qualifier, objArr);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode2 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.firmwareManagerApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode2, (Function0) new Function0<FirmwareManagerApi>() { // from class: com.xiaomi.hm.health.device.earbud.service.EarbudMusicDownloadService$special$$inlined$inject$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.xiaomi.hm.health.device.firmware.FirmwareManagerApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final FirmwareManagerApi getA() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(FirmwareManagerApi.class), objArr2, objArr3);
            }
        });
        this.handler = LazyKt__LazyJVMKt.lazy(new Function0<EarbudMusicDownloadService$handler$2.AnonymousClass1>() { // from class: com.xiaomi.hm.health.device.earbud.service.EarbudMusicDownloadService$handler$2
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r1v1, types: [com.xiaomi.hm.health.device.earbud.service.EarbudMusicDownloadService$handler$2$1] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final AnonymousClass1 getA() {
                HandlerThread handlerThread = new HandlerThread("EarbudMusicDownloadService");
                handlerThread.start();
                Looper looper = handlerThread.getLooper();
                final EarbudMusicDownloadService earbudMusicDownloadService = this.a;
                return new Handler(looper) { // from class: com.xiaomi.hm.health.device.earbud.service.EarbudMusicDownloadService$handler$2.1
                    @Override // android.os.Handler
                    public void dispatchMessage(@NotNull Message msg) throws Throwable {
                        if (msg.what == 1) {
                            earbudMusicDownloadService.a();
                        }
                        super.dispatchMessage(msg);
                    }
                };
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a() throws Throwable {
        BatteryInfo batteryInfo;
        try {
            AtomicBoolean atomicBoolean = k;
            if (atomicBoolean.get()) {
                return;
            }
            atomicBoolean.set(true);
            DeviceManagerApi deviceManagerApiC = c();
            HMDeviceType hMDeviceType = HMDeviceType.EARBUD;
            if (!deviceManagerApiC.hasBound(hMDeviceType)) {
                atomicBoolean.set(false);
                return;
            }
            HMBaseDevice device = c().getDevice(hMDeviceType);
            if (device == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.xiaomi.hm.health.bt.device.HmEarbudDevice");
            }
            HmEarbudDevice hmEarbudDevice = (HmEarbudDevice) device;
            if (!hmEarbudDevice.isAllConnected()) {
                atomicBoolean.set(false);
                e().removeMessages(1);
                e().sendEmptyMessageDelayed(1, 10000L);
                return;
            }
            if (hmEarbudDevice.isSyncingData()) {
                atomicBoolean.set(false);
                e().removeMessages(1);
                e().sendEmptyMessageDelayed(1, 10000L);
                return;
            }
            if (!d().allowDataSync(hMDeviceType)) {
                atomicBoolean.set(false);
                e().removeMessages(1);
                e().sendEmptyMessageDelayed(1, 10000L);
                HMLog.info(e, b.a);
                return;
            }
            if (DeviceXFunctionsKt.getAppStateApi().isFeedbackActivity()) {
                atomicBoolean.set(false);
                e().removeMessages(1);
                e().sendEmptyMessageDelayed(1, 10000L);
                HMLog.info(e, c.a);
                return;
            }
            QueryBuilder<EarbudMusicInfo> queryBuilder = b().queryBuilder();
            Property property = EarbudMusicInfoDao.Properties.LocalStatus;
            EarbudMusicInfo earbudMusicInfoUnique = queryBuilder.where(property.eq(2), new WhereCondition[0]).unique();
            if (earbudMusicInfoUnique == null) {
                List<EarbudMusicInfo> list = b().queryBuilder().where(property.eq(1), new WhereCondition[0]).orderAsc(EarbudMusicInfoDao.Properties.LocalUpdateTime).list();
                earbudMusicInfoUnique = list == null ? null : (EarbudMusicInfo) CollectionsKt.firstOrNull((List) list);
            }
            if (earbudMusicInfoUnique == null) {
                hmEarbudDevice.cancelDownloadMusic();
                atomicBoolean.set(false);
                e().removeMessages(1);
                e().sendEmptyMessageDelayed(1, 300000L);
                return;
            }
            MusicFileUtil musicFileUtil = MusicFileUtil.INSTANCE;
            File destFile = musicFileUtil.getDestFile(earbudMusicInfoUnique.getLeftChannel());
            File destFile2 = musicFileUtil.getDestFile(earbudMusicInfoUnique.getRightChannel());
            if (destFile != null && destFile2 != null) {
                Integer localStatus = earbudMusicInfoUnique.getLocalStatus();
                if (localStatus == null || localStatus.intValue() != 2) {
                    earbudMusicInfoUnique.setLocalStatus(2);
                    earbudMusicInfoUnique.setLocalUpdateTime(Long.valueOf(System.currentTimeMillis()));
                    b().insertOrReplaceInTx(earbudMusicInfoUnique);
                    EarbudMusicDownloadObserver.INSTANCE.getInstance().start(earbudMusicInfoUnique.getId().longValue());
                }
                BatteryInfo batteryInfo2 = hmEarbudDevice.getBatteryInfo();
                if ((batteryInfo2 == null ? 0 : batteryInfo2.getLevel()) > 20) {
                    HmBaseEarbudDevice rightDevice = hmEarbudDevice.getRightDevice();
                    if (((rightDevice == null || (batteryInfo = rightDevice.getBatteryInfo()) == null) ? 0 : batteryInfo.getLevel()) > 20) {
                        HMFirmwareInfo hMFirmwareInfo = new HMFirmwareInfo(destFile.getAbsolutePath(), HMFirmwareType.FIRMWARE_VOICE);
                        hMFirmwareInfo.setSyncSize(100);
                        hMFirmwareInfo.setVoiceType(HmVoiceType.NOISE.getType());
                        hMFirmwareInfo.setVoiceId((int) earbudMusicInfoUnique.getId().longValue());
                        hMFirmwareInfo.setOtherFwPath(destFile2.getAbsolutePath());
                        f(hmEarbudDevice, earbudMusicInfoUnique, hMFirmwareInfo);
                        return;
                    }
                }
                HMLog.info(e, e.a);
                atomicBoolean.set(false);
                e().removeMessages(1);
                e().sendEmptyMessageDelayed(1, 300000L);
                return;
            }
            HMLog.info(e, d.a);
            atomicBoolean.set(false);
            e().removeMessages(1);
            e().sendEmptyMessageDelayed(1, 10000L);
        } catch (Exception e2) {
            k.set(false);
            HMLog.e(e, e2.getMessage(), e2);
            e().removeMessages(1);
            e().sendEmptyMessageDelayed(1, 10000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final EarbudMusicInfoDao b() {
        return (EarbudMusicInfoDao) this.dao.getValue();
    }

    private final DeviceManagerApi c() {
        return (DeviceManagerApi) this.deviceManagerApi.getValue();
    }

    private final FirmwareManagerApi d() {
        return (FirmwareManagerApi) this.firmwareManagerApi.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Handler e() {
        return (Handler) this.handler.getValue();
    }

    private final void f(HmEarbudDevice device, final EarbudMusicInfo music, final HMFirmwareInfo firmwareInfo) {
        final ConditionVariable conditionVariable = new ConditionVariable();
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        device.updateFwUpgrade(firmwareInfo, new IHMFirmwareUpgradeCallback() { // from class: com.xiaomi.hm.health.device.earbud.service.EarbudMusicDownloadService$sendToDevice$1

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class a extends Lambda implements Function0<String> {
                public final /* synthetic */ Progress a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(Progress progress) {
                    super(0);
                    this.a = progress;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final String getA() {
                    return "download music progress : " + this.a;
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class b extends Lambda implements Function0<String> {
                public final /* synthetic */ HMFirmwareInfo a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(HMFirmwareInfo hMFirmwareInfo) {
                    super(0);
                    this.a = hMFirmwareInfo;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final String getA() {
                    return "send music to device fail,firmware:" + this.a;
                }
            }

            @Override // com.xiaomi.hm.health.bt.profile.dfu.IHMFirmwareUpgradeCallback
            public void onFwProgress(@Nullable Progress progress) {
                HMLog.debug("EarbudMusicDownloadService", new a(progress));
                if (progress == null) {
                    return;
                }
                EarbudMusicDownloadObserver.INSTANCE.getInstance().progress(music.getId().longValue(), progress);
            }

            @Override // com.xiaomi.hm.health.bt.profile.dfu.IHMFirmwareUpgradeCallback
            public void onFwStart(int none) {
            }

            @Override // com.xiaomi.hm.health.bt.profile.dfu.IHMFirmwareUpgradeCallback
            public void onFwStop(boolean result) throws InterruptedException {
                booleanRef.element = result;
                if (result) {
                    music.setLocalStatus(3);
                    music.setLocalUpdateTime(Long.valueOf(System.currentTimeMillis()));
                    this.b().insertOrReplaceInTx(music);
                    QueryBuilder<EarbudMusicInfo> queryBuilder = this.b().queryBuilder();
                    Property property = EarbudMusicInfoDao.Properties.LocalStatus;
                    EarbudMusicInfo earbudMusicInfoUnique = queryBuilder.where(property.eq(2), new WhereCondition[0]).unique();
                    if (earbudMusicInfoUnique == null) {
                        List<EarbudMusicInfo> list = this.b().queryBuilder().where(property.eq(1), new WhereCondition[0]).orderAsc(EarbudMusicInfoDao.Properties.LocalUpdateTime).list();
                        earbudMusicInfoUnique = list == null ? null : (EarbudMusicInfo) CollectionsKt.firstOrNull((List) list);
                    }
                    if (earbudMusicInfoUnique != null) {
                        Integer localStatus = earbudMusicInfoUnique.getLocalStatus();
                        EarbudMusicInfo earbudMusicInfo = localStatus != null && localStatus.intValue() == 1 ? earbudMusicInfoUnique : null;
                        if (earbudMusicInfo != null) {
                            EarbudMusicDownloadService earbudMusicDownloadService = this;
                            earbudMusicInfo.setLocalStatus(2);
                            earbudMusicDownloadService.b().insertOrReplaceInTx(earbudMusicInfo);
                        }
                    }
                    Thread.sleep(500L);
                    EarbudMusicDownloadObserver.INSTANCE.getInstance().finish(music.getId().longValue());
                    Thread.sleep(10L);
                } else {
                    HMLog.info("EarbudMusicDownloadService", new b(firmwareInfo));
                    this.e().removeMessages(1);
                }
                conditionVariable.open();
            }
        });
        conditionVariable.block();
        k.set(false);
        e().removeMessages(1);
        if (!booleanRef.element) {
            EarbudMusicInfo earbudMusicInfoUnique = b().queryBuilder().where(EarbudMusicInfoDao.Properties.LocalStatus.eq(2), new WhereCondition[0]).unique();
            if (Intrinsics.areEqual(earbudMusicInfoUnique == null ? null : earbudMusicInfoUnique.getId(), music.getId())) {
                e().sendEmptyMessageDelayed(1, 10000L);
                return;
            }
        }
        e().sendEmptyMessage(1);
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @Override // androidx.core.app.JobIntentService
    public void onHandleWork(@NotNull Intent intent) {
        if (!c().hasBound(HMDeviceType.EARBUD) || k.get()) {
            return;
        }
        e().removeMessages(1);
        e().sendEmptyMessage(1);
    }
}
