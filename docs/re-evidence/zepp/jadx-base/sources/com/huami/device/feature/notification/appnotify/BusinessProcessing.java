package com.huami.device.feature.notification.appnotify;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.service.notification.StatusBarNotification;
import android.text.TextUtils;
import androidx.annotation.RequiresApi;
import androidx.core.app.NotificationCompat;
import androidx.core.app.RemoteInput;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.device.feature.notification.data.AlertDataCompat;
import com.huami.device.feature.notification.data.AppsNotificationInfo;
import com.huami.device.feature.notification.module.INotificationModule;
import com.huami.device.feature.notification.statistics.NotificationEvent;
import com.huami.device.feature.notification.statistics.NotificationStatisticsKt;
import com.huami.device.feature.notification.statistics.RefusedReason;
import com.huami.device.feature.notification.utils.AppUtil;
import com.huami.device.feature.notification.utils.AppsHelper;
import com.huami.device.feature.notification.utils.NotificationLog;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.HmEarbudDevice;
import com.xiaomi.hm.health.bt.profile.alert.HMAlertModeExt;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b0\u00101J\u0014\u0010\u0006\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u001a\u0010\t\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002J,\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002J4\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00110\u0018J,\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00162\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00110\u0018J$\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u001c\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007J\u000e\u0010 \u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u001eJ\u001e\u0010\"\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010!\u001a\u00020\u001e2\u0006\u0010\f\u001a\u00020\u0007J\u0010\u0010%\u001a\u00020\u001e2\u0006\u0010$\u001a\u00020#H\u0007R\"\u0010+\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R2\u0010/\u001a\u001e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020#0,j\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020#`-8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010.¨\u00062"}, d2 = {"Lcom/huami/device/feature/notification/appnotify/BusinessProcessing;", "", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "Lcom/huami/device/feature/notification/data/AlertDataCompat;", "alertData", "", "a", "", "key", "b", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "content", "Landroidx/core/app/RemoteInput;", "remoteInput", "Landroid/app/PendingIntent;", "pendingReply", "", "c", "pkg", "Lcom/huami/device/feature/notification/data/AppsNotificationInfo;", "info", "Lcom/huami/device/feature/notification/module/INotificationModule;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lkotlin/Function0;", "action", "processAppsNotificationInfo", "processSmsNotify", "device", "notify2Device", "", "id", "deleteFromDevice", "uniqueId", "replyToApp", "Landroid/service/notification/StatusBarNotification;", "sbn", "supportReply", "Ljava/lang/String;", "getLogTag", "()Ljava/lang/String;", "setLogTag", "(Ljava/lang/String;)V", "logTag", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "Ljava/util/HashMap;", "notificationsSupportReply", "<init>", "()V", "notification_release"}, k = 1, mv = {1, 5, 1})
public final class BusinessProcessing {

    @NotNull
    public static final BusinessProcessing INSTANCE = new BusinessProcessing();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static String logTag;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private static final HashMap<String, StatusBarNotification> notificationsSupportReply;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HMDeviceType.values().length];
            iArr[HMDeviceType.EARBUD.ordinal()] = 1;
            iArr[HMDeviceType.MILI.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

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
            return "deleteFromDevice, listener is null";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ HMBaseDevice a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(HMBaseDevice hMBaseDevice) {
            super(0);
            this.a = hMBaseDevice;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return this.a.getDeviceType() + " is not supported";
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
            return "device is null or disconnected";
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
            return "notify2MiliDevice, listener is null";
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
            return "The switch of notification is off.";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "The app " + this.a + " is not added into remind list.";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<String> {
        public static final g a = new g();

        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "Only remind when phone screen is off, but now the screen is on.";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function0<String> {
        public static final h a = new h();

        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "The default sms package is added into remind list and also the switch of sms is enabled.";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function0<String> {
        public static final i a = new i();

        public i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "The switch of SMS is off.";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class j extends Lambda implements Function0<String> {
        public static final j a = new j();

        public j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "the notification didn't support reply.";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class k extends Lambda implements Function0<String> {
        public final /* synthetic */ PendingIntent.CanceledException a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(PendingIntent.CanceledException canceledException) {
            super(0);
            this.a = canceledException;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return Intrinsics.stringPlus("reply exception: ", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class l extends Lambda implements Function0<String> {
        public final /* synthetic */ RemoteInput[] a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(RemoteInput[] remoteInputArr) {
            super(0);
            this.a = remoteInputArr;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return Intrinsics.stringPlus("has remoteInputs: ", Integer.valueOf(this.a.length));
        }
    }

    static {
        Intrinsics.stringPlus(NotificationLog.defaultTag, "_BusinessProcessing");
        logTag = NotificationLog.defaultTag;
        notificationsSupportReply = new HashMap<>(2);
    }

    private BusinessProcessing() {
    }

    private final void a(HMBaseDevice hMBaseDevice, AlertDataCompat alertDataCompat) {
        ((HmEarbudDevice) hMBaseDevice).alert(alertDataCompat.getCom.xmlywind.sdk.common.Constants.EXT java.lang.String(), new HMCallback<Boolean>() { // from class: com.huami.device.feature.notification.appnotify.BusinessProcessing$notify2EarbudDevice$1

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class a extends Lambda implements Function0<String> {
                public final /* synthetic */ Boolean a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(Boolean bool) {
                    super(0);
                    this.a = bool;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final String getA() {
                    return Intrinsics.stringPlus("alert ", this.a);
                }
            }

            @Override // com.xiaomi.hm.health.bt.device.HMCallback
            public void onFinish(@Nullable Boolean result) {
                HMLog.info(BusinessProcessing.INSTANCE.getLogTag(), new a(result));
            }
        });
    }

    private final void b(AlertDataCompat alertData, String key) {
        Unit unit;
        if ((!TextUtils.isEmpty(key)) & LinkageNotificationCenter.supportLinkageNotification()) {
            alertData.getCom.xmlywind.sdk.common.Constants.EXT java.lang.String().setId(LinkageNotificationCenter.INSTANCE.getAvailableId());
        }
        INotificationModule listener = NotificationManager.getInstance().getListener();
        if (listener == null) {
            unit = null;
        } else {
            HMDeviceType hMDeviceType = HMDeviceType.MILI;
            if (key == null) {
                key = "";
            }
            listener.syncToDevice(hMDeviceType, key, alertData);
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            HMLog.info(logTag, d.a);
        }
    }

    private final boolean c(Context context, String content, RemoteInput remoteInput, PendingIntent pendingReply) {
        if (remoteInput == null || pendingReply == null) {
            HMLog.info(logTag, j.a);
            return false;
        }
        Intent intent = new Intent();
        Bundle bundle = new Bundle();
        bundle.putString(remoteInput.getResultKey(), content);
        RemoteInput.addResultsToIntent(new RemoteInput[]{new RemoteInput.Builder(remoteInput.getResultKey()).build()}, intent, bundle);
        try {
            pendingReply.send(context, 0, intent);
            return true;
        } catch (PendingIntent.CanceledException e2) {
            HMLog.error$default(logTag, null, null, new k(e2), 6, null);
            return false;
        }
    }

    public static /* synthetic */ void notify2Device$default(BusinessProcessing businessProcessing, AlertDataCompat alertDataCompat, HMBaseDevice hMBaseDevice, String str, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            str = null;
        }
        businessProcessing.notify2Device(alertDataCompat, hMBaseDevice, str);
    }

    public final void deleteFromDevice(int id) {
        AlertDataCompat alertDataCompat = new AlertDataCompat(new HMAlertModeExt(id, (byte) 2), null, 2, 0, 10, null);
        INotificationModule listener = NotificationManager.getInstance().getListener();
        if (listener == null) {
            listener = null;
        } else {
            notify2Device$default(INSTANCE, alertDataCompat, listener.currentDevice(), null, 4, null);
        }
        if (listener == null) {
            HMLog.info(logTag, a.a);
        }
        String notificationKey = LinkageNotificationCenter.INSTANCE.getNotificationKey(id);
        if (notificationKey == null) {
            return;
        }
        notificationsSupportReply.remove(notificationKey);
    }

    @NotNull
    public final String getLogTag() {
        return logTag;
    }

    public final void notify2Device(@NotNull AlertDataCompat alertData, @Nullable HMBaseDevice device, @Nullable String key) {
        HMBaseDevice hMBaseDevice = null;
        if (device != null) {
            if (!device.isConnected()) {
                device = null;
            }
            if (device != null) {
                HMDeviceType deviceType = device.getDeviceType();
                int i2 = deviceType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[deviceType.ordinal()];
                if (i2 == 1) {
                    INSTANCE.a(device, alertData);
                } else if (i2 != 2) {
                    HMLog.info(INSTANCE.getLogTag(), new b(device));
                } else {
                    INSTANCE.b(alertData, key);
                }
                hMBaseDevice = device;
            }
        }
        if (hMBaseDevice == null) {
            HMLog.info(logTag, c.a);
        }
    }

    public final void processAppsNotificationInfo(@NotNull Context context, @NotNull String pkg, @NotNull AppsNotificationInfo info, @NotNull INotificationModule listener, @NotNull Function0<Boolean> action) {
        if (!info.getNotificationOn()) {
            HMLog.info(logTag, e.a);
            NotificationStatisticsKt.recordEvent(NotificationEvent.SYNC_REFUSED, pkg, RefusedReason.NOTI_OFF);
            return;
        }
        if (info.notContains(pkg)) {
            HMLog.info(logTag, new f(pkg));
            NotificationStatisticsKt.recordEvent(NotificationEvent.SYNC_REFUSED, pkg, RefusedReason.NOT_SUPPORTED);
        } else {
            if (info.getDisplayOff() && AppUtil.INSTANCE.isScreenOn(context)) {
                HMLog.info(logTag, g.a);
                NotificationStatisticsKt.recordEvent(NotificationEvent.SYNC_REFUSED, pkg, RefusedReason.ONLY_SCREEN_OFF);
                return;
            }
            if (AppsHelper.INSTANCE.isSmsApp(context, pkg) && listener.isSmsNotifyEnabled()) {
                HMLog.info(logTag, h.a);
            } else {
                action.getA();
            }
        }
    }

    public final void processSmsNotify(@NotNull Context context, @NotNull String pkg, @NotNull INotificationModule listener, @NotNull Function0<Boolean> action) {
        if (AppsHelper.INSTANCE.isSmsApp(context, pkg)) {
            if (listener.isSmsNotifyEnabled()) {
                action.getA();
            } else {
                HMLog.info(logTag, i.a);
                NotificationStatisticsKt.recordEvent(NotificationEvent.SYNC_REFUSED, pkg, RefusedReason.MSG_OFF);
            }
        }
    }

    public final boolean replyToApp(@NotNull Context context, int uniqueId, @NotNull String content) {
        StatusBarNotification statusBarNotification;
        Unit unit;
        String notificationKey = LinkageNotificationCenter.INSTANCE.getNotificationKey(uniqueId);
        if (notificationKey == null || (statusBarNotification = notificationsSupportReply.get(notificationKey)) == null) {
            return false;
        }
        for (NotificationCompat.Action action : new NotificationCompat.WearableExtender(statusBarNotification.getNotification()).getActions()) {
            RemoteInput[] remoteInputs = action.getRemoteInputs();
            if (remoteInputs == null) {
                unit = null;
            } else {
                if (remoteInputs.length > 0) {
                    return INSTANCE.c(context, content, remoteInputs[0], action.actionIntent);
                }
                unit = Unit.INSTANCE;
            }
            if (unit == null) {
                break;
            }
        }
        return false;
    }

    public final void setLogTag(@NotNull String str) {
        logTag = str;
    }

    @RequiresApi(20)
    public final int supportReply(@NotNull StatusBarNotification sbn) {
        Iterator<T> it2 = new NotificationCompat.WearableExtender(sbn.getNotification()).getActions().iterator();
        int i2 = 0;
        while (it2.hasNext()) {
            RemoteInput[] remoteInputs = ((NotificationCompat.Action) it2.next()).getRemoteInputs();
            if (remoteInputs != null && remoteInputs.length > 0) {
                HMLog.info(INSTANCE.getLogTag(), new l(remoteInputs));
                i2 = 1;
                notificationsSupportReply.put(sbn.getKey(), sbn);
            }
        }
        return i2;
    }
}
