package com.xiaomi.hm.health.device.service.residentnoti;

import android.content.Context;
import android.content.Intent;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.facebook.share.internal.ShareConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.account.HMLoginManager;
import com.huami.devicex.DeviceXBuilder;
import com.huami.devicex.injection.basic.DeviceUtilsApi;
import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.device.service.residentnoti.notify.DfuNotify;
import com.xiaomi.hm.health.device.service.residentnoti.notify.GpsSportNotify;
import com.xiaomi.hm.health.device.service.residentnoti.notify.NotificationMode;
import com.xiaomi.hm.health.device.service.residentnoti.notify.ResidentNotify;
import com.xiaomi.hm.health.device.sport.DeviceSportManager;
import java.util.ArrayList;
import java.util.HashSet;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b*\u0010+J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u001a\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0007J\n\u0010\t\u001a\u0004\u0018\u00010\u0007H\u0007J\b\u0010\u000b\u001a\u00020\nH\u0002J\u0012\u0010\r\u001a\u0004\u0018\u00010\u00072\u0006\u0010\f\u001a\u00020\u0004H\u0007J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0007H\u0007J\u0010\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0007H\u0007J\b\u0010\u0012\u001a\u00020\u000fH\u0007J\b\u0010\u0013\u001a\u00020\u000fH\u0002J\u0006\u0010\u0014\u001a\u00020\u0004R\u0016\u0010\u0017\u001a\u00020\u00158\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016R\u0016\u0010\u0018\u001a\u00020\u00158\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016R&\u0010\u001d\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0019j\b\u0012\u0004\u0012\u00020\u0007`\u001a8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001d\u0010\"\u001a\u00020\u001e8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001b\u0010!R\u001d\u0010%\u001a\u00020#8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010 \u001a\u0004\b\u001f\u0010$R&\u0010)\u001a\u0012\u0012\u0004\u0012\u00020\u00070&j\b\u0012\u0004\u0012\u00020\u0007`'8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010(¨\u0006,"}, d2 = {"Lcom/xiaomi/hm/health/device/service/residentnoti/ResidentNotificationManager;", "Lorg/koin/core/component/KoinComponent;", "Landroid/content/Context;", "a", "", "notificationOn", "gpsSport", "Lcom/xiaomi/hm/health/device/service/residentnoti/notify/NotificationMode;", "initNotify", "getHighestNotifyMode", "", GoogleApiAvailabilityLight.a, "refresh", "updateNotification", "mode", "", "showNotification", "cancelNotification", "cancelAllNotification", "e", "isKeepAlive", "", "Ljava/lang/String;", "TAG", ShareConstants.ACTION, "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "b", "Ljava/util/HashSet;", "notifications", "Lcom/huami/devicex/manager/DeviceManagerApi;", "c", "Lkotlin/Lazy;", "()Lcom/huami/devicex/manager/DeviceManagerApi;", "deviceManagerApi", "Lcom/huami/devicex/injection/basic/DeviceUtilsApi;", "()Lcom/huami/devicex/injection/basic/DeviceUtilsApi;", "deviceUtilsApi", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "Ljava/util/ArrayList;", "allNotifies", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class ResidentNotificationManager implements KoinComponent {

    @NotNull
    public static final String ACTION = "android.intent.action.HMCoreService.UPDATE_RESIDENT_NOTIFY";

    @NotNull
    public static final ResidentNotificationManager INSTANCE;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final String TAG = "ResidentNotificationManager";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private static final HashSet<NotificationMode> notifications;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private static final Lazy deviceManagerApi;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private static final Lazy deviceUtilsApi;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private static final ArrayList<NotificationMode> allNotifies;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "get context is null ..";
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
        public final String invoke() {
            return "load app context error.";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ int a;
        public final /* synthetic */ NotificationMode b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i, NotificationMode notificationMode) {
            super(0);
            this.a = i;
            this.b = notificationMode;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "high: " + this.a + ", mode: " + this.b.getPriority();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ NotificationMode a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(NotificationMode notificationMode) {
            super(0);
            this.a = notificationMode;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return this.a.toString();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        final ResidentNotificationManager residentNotificationManager = new ResidentNotificationManager();
        INSTANCE = residentNotificationManager;
        notifications = new HashSet<>();
        KoinPlatformTools koinPlatformTools = KoinPlatformTools.INSTANCE;
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = koinPlatformTools.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        deviceManagerApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<DeviceManagerApi>() { // from class: com.xiaomi.hm.health.device.service.residentnoti.ResidentNotificationManager$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.devicex.manager.DeviceManagerApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final DeviceManagerApi invoke() {
                KoinComponent koinComponent = residentNotificationManager;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DeviceManagerApi.class), qualifier, objArr);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode2 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        deviceUtilsApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode2, (Function0) new Function0<DeviceUtilsApi>() { // from class: com.xiaomi.hm.health.device.service.residentnoti.ResidentNotificationManager$special$$inlined$inject$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.devicex.injection.basic.DeviceUtilsApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final DeviceUtilsApi invoke() {
                KoinComponent koinComponent = residentNotificationManager;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DeviceUtilsApi.class), objArr2, objArr3);
            }
        });
        ArrayList<NotificationMode> arrayList = new ArrayList<>();
        arrayList.add(ResidentNotify.INSTANCE);
        arrayList.add(GpsSportNotify.INSTANCE);
        arrayList.add(DfuNotify.INSTANCE);
        allNotifies = arrayList;
    }

    private ResidentNotificationManager() {
    }

    private final Context a() {
        try {
            return DeviceXBuilder.INSTANCE.getContext();
        } catch (Exception unused) {
            HMLog.warn$default(TAG, null, a.a, 2, null);
            return null;
        }
    }

    private final DeviceManagerApi b() {
        return (DeviceManagerApi) deviceManagerApi.getValue();
    }

    private final DeviceUtilsApi c() {
        return (DeviceUtilsApi) deviceUtilsApi.getValue();
    }

    @JvmStatic
    public static final void cancelAllNotification() {
        notifications.clear();
        INSTANCE.e();
    }

    @JvmStatic
    public static final void cancelNotification(@NotNull NotificationMode mode) {
        notifications.remove(mode);
        INSTANCE.e();
    }

    private final int d() {
        NotificationMode highestNotifyMode = getHighestNotifyMode();
        return highestNotifyMode == null ? ResidentNotify.INSTANCE.getPriority() : highestNotifyMode.getPriority();
    }

    private final void e() {
        try {
            Context contextA = a();
            if (contextA == null) {
                return;
            }
            LocalBroadcastManager.getInstance(contextA).sendBroadcast(new Intent(ACTION));
        } catch (Exception e) {
            HMLog.warn(TAG, e, b.a);
        }
    }

    @JvmStatic
    @Nullable
    public static final NotificationMode getHighestNotifyMode() {
        HashSet<NotificationMode> hashSet = notifications;
        if (hashSet.isEmpty()) {
            return null;
        }
        NotificationMode notificationMode = ResidentNotify.INSTANCE;
        for (NotificationMode notificationMode2 : hashSet) {
            if (notificationMode2.getPriority() > notificationMode.getPriority()) {
                notificationMode = notificationMode2;
            }
        }
        return notificationMode;
    }

    @JvmStatic
    @Nullable
    public static final NotificationMode initNotify(boolean notificationOn, boolean gpsSport) {
        if (!notificationOn && !gpsSport) {
            return null;
        }
        if (notificationOn) {
            notifications.add(ResidentNotify.INSTANCE);
        }
        if (gpsSport) {
            notifications.add(GpsSportNotify.INSTANCE);
        }
        return getHighestNotifyMode();
    }

    @JvmStatic
    public static final void showNotification(@NotNull NotificationMode mode) {
        ResidentNotificationManager residentNotificationManager = INSTANCE;
        int iD = residentNotificationManager.d();
        HMLog.info(TAG, new c(iD, mode));
        notifications.add(mode);
        if (iD > mode.getPriority()) {
            return;
        }
        residentNotificationManager.e();
    }

    @JvmStatic
    @Nullable
    public static final NotificationMode updateNotification(boolean refresh) {
        if (!HMLoginManager.isExistingUser()) {
            return null;
        }
        for (NotificationMode notificationMode : allNotifies) {
            HMLog.info(TAG, new d(notificationMode));
            if (notificationMode.getShow()) {
                notifications.add(notificationMode);
            }
        }
        if (refresh) {
            INSTANCE.e();
        }
        return getHighestNotifyMode();
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    public final boolean isKeepAlive() {
        if (!HMLoginManager.isOldUser()) {
            return false;
        }
        DeviceManagerApi deviceManagerApiB = b();
        HMDeviceType hMDeviceType = HMDeviceType.MILI;
        if ((!deviceManagerApiB.hasBound(hMDeviceType) && !c().isUseClassicWatch()) || !HMLoginManager.isOldUser()) {
            return false;
        }
        if (c().isNotificationOn() || DeviceSportManager.get().isDeviceGpsSport()) {
            return b().getBoundDeviceSource(hMDeviceType) != HMDeviceSource.VDEVICE || c().isUseClassicWatch();
        }
        return false;
    }
}
