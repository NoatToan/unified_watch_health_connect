package com.huawei.hwdevice.phoneprocess.mgr.hwdevicestatusmgr;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.work.Data;
import androidx.work.ListenableWorker;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkerParameters;
import androidx.work.impl.utils.futures.SettableFuture;
import androidx.work.multiprocess.RemoteListenableWorker;
import androidx.work.multiprocess.RemoteWorkManager;
import androidx.work.multiprocess.RemoteWorkerService;
import com.google.common.util.concurrent.ListenableFuture;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.health.devicemgr.api.mainprocess.DownloadManagerApi;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.messagecenter.model.MessageObject;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.HiDataReadProOption;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hms.network.embedded.k;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevicemgr.R;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginhealthzone.interactors.HealthZonePushReceiver;
import defpackage.edl;
import defpackage.lsb;
import defpackage.mmx;
import defpackage.qre;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.time.LocalTime;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes11.dex */
public class HwDeviceStatusNotificationUtil {
    public static void b(DeviceInfo deviceInfo) throws Throwable {
        if (deviceInfo == null) {
            ReleaseLogUtil.e("R_HwBasicSyncReminderUtil", "deviceInfo is null");
            return;
        }
        if (deviceInfo.getDeviceConnectState() == 2) {
            d();
            return;
        }
        if (deviceInfo.getDeviceConnectState() == 3) {
            if (c(deviceInfo.getProductType()) == 1) {
                d(10800L, "IDS_device_sync_remind_title_band", "IDS_device_sync_remind_content_3hours");
                d(k.b.m, "IDS_device_sync_remind_title_band", "IDS_device_sync_remind_content_1day");
                d(k.b.l, "IDS_device_sync_remind_title_band", "IDS_device_sync_remind_content_7days");
                d(2592000L, "IDS_device_sync_remind_title_band", "IDS_device_sync_remind_content_30days");
                LogUtil.a("HwBasicSyncReminderUtil", "setupReminder band");
            } else {
                d(10800L, "IDS_device_sync_remind_title_watch", "IDS_device_sync_remind_content_3hours");
                d(k.b.m, "IDS_device_sync_remind_title_watch", "IDS_device_sync_remind_content_1day");
                d(k.b.l, "IDS_device_sync_remind_title_watch", "IDS_device_sync_remind_content_7days");
                d(2592000L, "IDS_device_sync_remind_title_watch", "IDS_device_sync_remind_content_30days");
                LogUtil.a("HwBasicSyncReminderUtil", "setupReminder watch");
            }
            SharedPreferenceManager.c(String.valueOf(10008), "last_sync_set_time_key", System.currentTimeMillis());
            a(deviceInfo);
        }
    }

    private static void d(long j, String str, String str2) throws Throwable {
        ComponentName componentName = new ComponentName(BaseApplication.getContext().getPackageName(), RemoteWorkerService.class.getName());
        try {
            RemoteWorkManager.getInstance(BaseApplication.getContext()).enqueue(new OneTimeWorkRequest.Builder(HwBasicSyncReminderWorker.class).setInitialDelay(j, TimeUnit.SECONDS).setInputData(new Data.Builder().putString(RemoteListenableWorker.ARGUMENT_PACKAGE_NAME, componentName.getPackageName()).putString(RemoteListenableWorker.ARGUMENT_CLASS_NAME, componentName.getClassName()).putString("reminder_msg_title", str).putString("reminder_msg_content", str2).build()).addTag("HwBasicSyncReminderUtil").build());
        } catch (RuntimeException e) {
            ReleaseLogUtil.a("R_HwBasicSyncReminderUtil", "work enqueue failed:", ExceptionUtils.c(e));
        }
    }

    public static void d() {
        LogUtil.a("HwBasicSyncReminderUtil", "cancelSyncRemindersWorker");
        try {
            RemoteWorkManager.getInstance(BaseApplication.getContext()).cancelAllWorkByTag("HwBasicSyncReminderUtil");
        } catch (RuntimeException e) {
            ReleaseLogUtil.a("R_HwBasicSyncReminderUtil", "work cancel failed:", ExceptionUtils.c(e));
        }
        lsb.d().e(20251107);
    }

    public static boolean e() {
        LocalTime localTimeNow = LocalTime.now();
        return !localTimeNow.isBefore(LocalTime.of(13, 0)) && localTimeNow.isBefore(LocalTime.of(14, 0));
    }

    public static boolean c() {
        LocalTime localTimeNow = LocalTime.now();
        LocalTime localTimeOf = LocalTime.of(22, 0);
        LocalTime localTimeOf2 = LocalTime.of(8, 0);
        if (localTimeOf.isAfter(localTimeOf2)) {
            return !localTimeNow.isBefore(localTimeOf) || localTimeNow.isBefore(localTimeOf2);
        }
        return !localTimeNow.isBefore(localTimeOf) && localTimeNow.isBefore(localTimeOf2);
    }

    public static int c(int i) {
        String strA = mmx.a(i);
        DownloadManagerApi downloadManagerApi = (DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class);
        if (downloadManagerApi == null || !downloadManagerApi.isResourcesAvailable(strA)) {
            return 0;
        }
        edl pluginInfoByUuid = downloadManagerApi.getPluginInfoByUuid(strA);
        if (pluginInfoByUuid == null || pluginInfoByUuid.i() == null) {
            LogUtil.j("HwBasicSyncReminderUtil", "getDeviceCategory info or WearDeviceInfo is null");
            return 0;
        }
        return pluginInfoByUuid.i().af();
    }

    private static void a(DeviceInfo deviceInfo) {
        String str = deviceInfo.getSecurityUuid() + "#ANDROID21";
        if (b().equals(str)) {
            return;
        }
        ReleaseLogUtil.d("R_HwBasicSyncReminderUtil", "set sp ");
        SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10008), "last_sync_set_device_key", str, new StorageParams(1));
    }

    private static String b() {
        return SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10008), "last_sync_set_device_key");
    }

    public static boolean a() {
        String strB = b();
        if (TextUtils.isEmpty(strB)) {
            ReleaseLogUtil.e("R_HwBasicSyncReminderUtil", "lastSyncSetDeviceUdid is empty ");
            return false;
        }
        HiDataReadProOption hiDataReadProOptionD = d(SharedPreferenceManager.d(String.valueOf(10008), "last_sync_set_time_key", System.currentTimeMillis()), System.currentTimeMillis(), strB);
        final boolean[] zArr = {false};
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        HiHealthNativeApi.a(BaseApplication.getContext()).readHiHealthDataPro(hiDataReadProOptionD, new HiDataReadResultListener() { // from class: com.huawei.hwdevice.phoneprocess.mgr.hwdevicestatusmgr.HwDeviceStatusNotificationUtil.1
            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResultIntent(int i, Object obj, int i2, int i3) {
            }

            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResult(Object obj, int i, int i2) {
                if (!(obj instanceof SparseArray)) {
                    LogUtil.j("HwBasicSyncReminderUtil", "requestStressHistoryData data instanceof SparseArray is false");
                    countDownLatch.countDown();
                } else {
                    zArr[0] = ((SparseArray) obj).size() > 0;
                    countDownLatch.countDown();
                }
            }
        });
        try {
            countDownLatch.await(2000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            ReleaseLogUtil.a("R_HwBasicSyncReminderUtil", "await err:", e.getMessage());
        }
        return zArr[0];
    }

    private static HiDataReadProOption d(long j, long j2, String str) {
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setSortOrder(1);
        hiDataReadOption.setType(new int[]{2, 2002, 22100, 22000});
        hiDataReadOption.setStartTime(j);
        hiDataReadOption.setEndTime(j2);
        hiDataReadOption.setReadType(2);
        hiDataReadOption.setDeviceUuid(str);
        hiDataReadOption.setCount(1);
        return HiDataReadProOption.builder().e(hiDataReadOption).b();
    }

    public static void e(MessageObject messageObject, int i) {
        Notification.Builder builderC = lsb.d().c();
        builderC.setContentTitle(messageObject.getMsgTitle()).setStyle(new Notification.BigTextStyle()).setContentText(messageObject.getMsgContent()).setContentIntent(a(Uri.parse(messageObject.getDetailUri()), messageObject.getMsgId())).setTicker(messageObject.getMsgTitle()).setNumber(messageObject.getWeight()).setWhen(messageObject.getCreateTime()).setShowWhen(true).setPriority(0).setAutoCancel(true).setOngoing(false).setDefaults(2);
        builderC.setSmallIcon(R.drawable.healthlogo_ic_notification);
        try {
            lsb.d().c(i, builderC.build());
        } catch (SecurityException unused) {
            LogUtil.e("HwBasicSyncReminderUtil", "showMessageNotification, notify is error");
        }
    }

    private static PendingIntent a(Uri uri, String str) {
        int i;
        Intent intent = new Intent();
        intent.setData(uri);
        intent.setFlags(335544320);
        try {
            i = Integer.parseInt(str.substring(1));
        } catch (NumberFormatException e) {
            ReleaseLogUtil.a("HwBasicSyncReminderUtil", "NumberFormatException", e.getMessage());
            i = 0;
        } catch (StringIndexOutOfBoundsException e2) {
            ReleaseLogUtil.a("HwBasicSyncReminderUtil", "StringIndexOutOfBoundsException", e2.getMessage());
            i = 0;
        }
        return PendingIntent.getActivity(BaseApplication.getContext(), i, intent, 201326592);
    }

    public static class HwBasicSyncReminderWorker extends RemoteListenableWorker {
        public HwBasicSyncReminderWorker(Context context, WorkerParameters workerParameters) {
            super(context, workerParameters);
        }

        @Override // androidx.work.multiprocess.RemoteListenableWorker
        public ListenableFuture<ListenableWorker.Result> startRemoteWork() {
            SettableFuture settableFutureCreate = SettableFuture.create();
            if (HwDeviceStatusNotificationUtil.e() || HwDeviceStatusNotificationUtil.c()) {
                settableFutureCreate.set(ListenableWorker.Result.success());
                ReleaseLogUtil.e("R_HwBasicSyncReminderUtil", "now isNoonBreak or isNightBreak ", Long.valueOf(System.currentTimeMillis()));
                return settableFutureCreate;
            }
            if (HwDeviceStatusNotificationUtil.a()) {
                settableFutureCreate.set(ListenableWorker.Result.success());
                ReleaseLogUtil.e("R_HwBasicSyncReminderUtil", "startRemoteWork DeviceDataExists");
                HwDeviceStatusNotificationUtil.d();
                return settableFutureCreate;
            }
            try {
                String string = getInputData().getString("reminder_msg_title");
                if (!TextUtils.isEmpty(string)) {
                    string = c(string);
                }
                String string2 = getInputData().getString("reminder_msg_content");
                if (!TextUtils.isEmpty(string2)) {
                    string2 = c(string2);
                }
                if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2)) {
                    HwDeviceStatusNotificationUtil.e(b(string, string2), 20251107);
                    ReleaseLogUtil.d("R_HwBasicSyncReminderUtil", "start notification: ", string2);
                    settableFutureCreate.set(ListenableWorker.Result.success());
                    return settableFutureCreate;
                }
                settableFutureCreate.set(ListenableWorker.Result.success());
                ReleaseLogUtil.e("R_HwBasicSyncReminderUtil", "notification title or content is empty");
                return settableFutureCreate;
            } catch (Exception e) {
                ReleaseLogUtil.a("R_HwBasicSyncReminderUtil", "Sync reminder failed", e);
                settableFutureCreate.set(ListenableWorker.Result.failure());
                return settableFutureCreate;
            }
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code duplicated, block: B:29:0x0052  */
        private String c(String str) {
            byte b2;
            str.hashCode();
            switch (str) {
                case "IDS_device_sync_remind_content_1day":
                    b2 = 0;
                    break;
                case "IDS_device_sync_remind_content_30days":
                    b2 = 1;
                    break;
                case "IDS_device_sync_remind_content_3hours":
                    b2 = 2;
                    break;
                case "IDS_device_sync_remind_title_watch":
                    b2 = 3;
                    break;
                case "IDS_device_sync_remind_title_band":
                    b2 = 4;
                    break;
                case "IDS_device_sync_remind_content_7days":
                    b2 = 5;
                    break;
                default:
                    b2 = -1;
                    break;
            }
            if (b2 == 0) {
                return qre.a(R.string.IDS_device_sync_remind_content_1day, "1");
            }
            if (b2 == 1) {
                return qre.a(R.string.IDS_device_sync_remind_content_30days, HealthZonePushReceiver.SLEEP_SCORE_NOTIFY);
            }
            if (b2 == 2) {
                return qre.a(R.string.IDS_device_sync_remind_content_3hours, "3");
            }
            if (b2 == 3) {
                return qre.f(R.string.IDS_device_sync_remind_title_watch);
            }
            if (b2 == 4) {
                return qre.f(R.string.IDS_device_sync_remind_title_band);
            }
            if (b2 == 5) {
                return qre.a(R.string.IDS_device_sync_remind_content_7days, "7");
            }
            LogUtil.j("HwBasicSyncReminderUtil", "other content: ", str);
            return str;
        }

        private MessageObject b(String str, String str2) {
            MessageObject messageObject = new MessageObject();
            messageObject.setMsgId("M20251107");
            messageObject.setCreateTime(System.currentTimeMillis());
            messageObject.setWeight(1);
            messageObject.setDetailUri("huaweischeme://healthapp/home/device");
            messageObject.setMsgTitle(str);
            messageObject.setMsgContent(str2);
            return messageObject;
        }
    }
}
