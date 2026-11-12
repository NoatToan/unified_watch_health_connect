package com.huawei.health.service;

import android.app.IntentService;
import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.text.TextUtils;
import android.widget.RemoteViews;
import com.huawei.health.baseapi.hiaiengine.HiAiSmartClipApi;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.AlbumWatchFaceManger;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.type.h5pro.TransferProgressResp;
import com.huawei.hwdevice.mainprocess.mgr.hwwatchfacemgr.SmartClipManager;
import com.huawei.hwdevicemgr.R;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.profile.profile.ProfileExtendConstants;
import defpackage.ddr;
import defpackage.lsb;
import defpackage.mbx;
import defpackage.mdy;
import defpackage.mgg;
import health.compact.a.EnvironmentInfo;
import health.compact.a.NotificationUtil;
import health.compact.a.UnitUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes8.dex */
public class HandoffService extends IntentService {
    private static final int CLIPING_PHOTO_MESSAGE_ID = 10005;
    private static final int CLIP_MESSAGE_ID = 10002;
    private static final int FOREGROUND_SERVICE_ID = 100;
    private static final int NOTIFICATION_CANCEL_DELAYED_TIME = 5000;
    private static final int NOTIFICATION_CANCEL_MESSAGE_ID = 10004;
    private static final int NOTIFICATION_TRANSFER_MESSAGE_TIME = 1500;
    private static final int PROGRESS_MAX_VALUE = 100;
    private static final int PROGRESS_OFFSET = 1;
    private static final int QUANTITY_UNIT_LEVEL = 1;
    private static final String TAG = "HandoffService";
    private static final String TAG_RELEASE = "R_HandoffService";
    private static final int TRANFERING_MESSAGE_ID = 10001;
    private static final int TRANSFER_NOTIFICATION_ID = 100000;
    private static final int TRANSFRED_MESSAGE_ID = 10003;
    private static final String WATCH_FACE_HAND_OFF_FILE_PATH = "watchFaceHandoffFilePath";
    private static boolean sIsCancelNotification;
    private static long sTransferMillTime;
    private SmartClipManager.SmartClipCallback mClipCallback;
    private Handler mHandler;
    private Notification mNotification;
    private RemoteViews mRemoteViews;
    private SmartClipManager.ClipTransferCallback mTransferCallback;
    private int mTransferFailedCount;
    private int mTransferProgressPaddingValue;
    private int mTransferProgressValue;
    private int mTransferTotalCount;

    public static int getTransferNotificationId() {
        return 100000;
    }

    public HandoffService() {
        super(TAG);
        this.mHandler = new Handler() { // from class: com.huawei.health.service.HandoffService.4
            @Override // android.os.Handler
            public void handleMessage(Message message) throws Throwable {
                if (message == null) {
                    LogUtil.j(HandoffService.TAG, "mHandler handleMessage: message is null");
                }
                super.handleMessage(message);
                LogUtil.a(HandoffService.TAG_RELEASE, "message.what:", Integer.valueOf(message.what));
                switch (message.what) {
                    case 10001:
                        HandoffService.this.transferingNotificationView();
                        break;
                    case 10002:
                        if (!mbx.a(BaseApplication.getContext()).e()) {
                            ReleaseLogUtil.e(HandoffService.TAG_RELEASE, "HwHandoffManager getBluetoothOpenState false");
                        } else {
                            ArrayList<String> arrayList = message.obj instanceof ArrayList ? (ArrayList) message.obj : null;
                            LogUtil.a(HandoffService.TAG, "CLIP_MESSAGE_ID pathsList: ", arrayList);
                            SmartClipManager.e(BaseApplication.getContext()).c(arrayList, HandoffService.this.mTransferCallback);
                        }
                        break;
                    case 10003:
                        HandoffService.this.displayTransferedNotificationView();
                        break;
                    case 10004:
                        if (HandoffService.sIsCancelNotification) {
                            boolean unused = HandoffService.sIsCancelNotification = false;
                            try {
                                lsb.a().e(100000);
                            } catch (IllegalStateException unused2) {
                                LogUtil.e(HandoffService.TAG, "cancel transfer notification exception");
                                return;
                            }
                        }
                        break;
                    case 10005:
                        HandoffService.this.clipingNotificationView();
                        break;
                    default:
                        LogUtil.j(HandoffService.TAG, "Handler default");
                        break;
                }
            }
        };
        this.mClipCallback = new SmartClipManager.SmartClipCallback() { // from class: com.huawei.health.service.HandoffService.2
            @Override // com.huawei.hwdevice.mainprocess.mgr.hwwatchfacemgr.SmartClipManager.SmartClipCallback
            public void onClipResult(int i, List<String> list) {
                LogUtil.a(HandoffService.TAG, "onClipResult clipPaths: ", list);
                ReleaseLogUtil.d(HandoffService.TAG_RELEASE, "onClipResult resultCode = ", Integer.valueOf(i));
                if (i == 0) {
                    HandoffService.this.mHandler.removeMessages(10004);
                    Message messageObtainMessage = HandoffService.this.mHandler.obtainMessage();
                    messageObtainMessage.what = 10004;
                    HandoffService.this.mHandler.sendMessage(messageObtainMessage);
                    if (list != null) {
                        Message messageObtainMessage2 = HandoffService.this.mHandler.obtainMessage();
                        messageObtainMessage2.what = 10002;
                        messageObtainMessage2.obj = list;
                        HandoffService.this.mHandler.sendMessage(messageObtainMessage2);
                        return;
                    }
                    return;
                }
                if (i == -2) {
                    LogUtil.a(HandoffService.TAG, "Clip result disconnect");
                    Message messageObtainMessage3 = HandoffService.this.mHandler.obtainMessage();
                    messageObtainMessage3.what = 10003;
                    HandoffService.this.mHandler.sendMessage(messageObtainMessage3);
                    return;
                }
                if (i == -3) {
                    LogUtil.a(HandoffService.TAG, "Clip result timeout");
                    try {
                        lsb.a().e(100000);
                        return;
                    } catch (IllegalStateException unused) {
                        LogUtil.e(HandoffService.TAG, "delete transfer notification exception");
                        return;
                    }
                }
                LogUtil.j(HandoffService.TAG, "Clip Not Success");
            }

            @Override // com.huawei.hwdevice.mainprocess.mgr.hwwatchfacemgr.SmartClipManager.SmartClipCallback
            public void onOneImageClipped(int i, int i2) {
                LogUtil.a(HandoffService.TAG, "onOneImageClipped: ", Integer.valueOf(i), " - ", Integer.valueOf(i2), " - ");
                Message messageObtainMessage = HandoffService.this.mHandler.obtainMessage();
                messageObtainMessage.what = 10005;
                HandoffService.this.mHandler.sendMessage(messageObtainMessage);
            }
        };
        this.mTransferCallback = new SmartClipManager.ClipTransferCallback() { // from class: com.huawei.health.service.HandoffService.3
            @Override // com.huawei.hwdevice.mainprocess.mgr.hwwatchfacemgr.SmartClipManager.ClipTransferCallback
            public void onTransferProgress(int i, int i2, int i3) {
                LogUtil.a(HandoffService.TAG, "transfer progress: ", Integer.valueOf(i3));
                HandoffService.this.mTransferProgressValue = i3;
                HandoffService.this.mTransferTotalCount = i;
                if (HandoffService.this.mTransferProgressValue == 99) {
                    Message messageObtainMessage = HandoffService.this.mHandler.obtainMessage();
                    messageObtainMessage.what = 10001;
                    HandoffService.this.mHandler.sendMessage(messageObtainMessage);
                } else if (HandoffService.this.mTransferProgressValue < 99) {
                    SmartClipManager.b(true);
                    int iMin = Math.min(i2 + 1, HandoffService.this.mTransferTotalCount);
                    TransferProgressResp transferProgressResp = new TransferProgressResp();
                    transferProgressResp.setResultCode(2);
                    transferProgressResp.setTotalNum(HandoffService.this.mTransferTotalCount);
                    transferProgressResp.setCurrentNum(iMin);
                    transferProgressResp.setCurrentProgress(i3);
                    AlbumWatchFaceManger.getInstance().onOneHopProgress(transferProgressResp, null);
                    HandoffService.this.processTransferingMessage();
                } else {
                    SmartClipManager.b(false);
                    boolean unused = HandoffService.sIsCancelNotification = true;
                    Message messageObtainMessage2 = HandoffService.this.mHandler.obtainMessage();
                    messageObtainMessage2.what = 10004;
                    HandoffService.this.mHandler.sendMessageDelayed(messageObtainMessage2, 5000L);
                    LogUtil.j(HandoffService.TAG, "transfer complete");
                }
                LogUtil.a(HandoffService.TAG, "transfer mTransferTotalCount: ", Integer.valueOf(HandoffService.this.mTransferTotalCount));
            }

            @Override // com.huawei.hwdevice.mainprocess.mgr.hwwatchfacemgr.SmartClipManager.ClipTransferCallback
            public void onTransferResult(int i, int i2) {
                SmartClipManager.b(false);
                HandoffService.this.mTransferFailedCount = i2;
                LogUtil.a(HandoffService.TAG_RELEASE, "onTransferResultCode: ", Integer.valueOf(i));
                Message messageObtainMessage = HandoffService.this.mHandler.obtainMessage();
                messageObtainMessage.what = 10003;
                HandoffService.this.mHandler.sendMessage(messageObtainMessage);
                HiAiSmartClipApi hiAiSmartClip = ddr.e().getHiAiSmartClip();
                if (hiAiSmartClip != null) {
                    hiAiSmartClip.unbindHiAiService();
                }
                if (i == 0 && HandoffService.this.mTransferFailedCount == 0) {
                    boolean unused = HandoffService.sIsCancelNotification = true;
                    Message messageObtainMessage2 = HandoffService.this.mHandler.obtainMessage();
                    messageObtainMessage2.what = 10004;
                    HandoffService.this.mHandler.sendMessageDelayed(messageObtainMessage2, 5000L);
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processTransferingMessage() {
        if (this.mTransferProgressValue - this.mTransferProgressPaddingValue > 1) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - sTransferMillTime > ProfileExtendConstants.TIME_OUT) {
                sTransferMillTime = jCurrentTimeMillis;
                LogUtil.a(TAG, "sTransferMillTime: ", Long.valueOf(jCurrentTimeMillis));
                this.mTransferProgressPaddingValue = this.mTransferProgressValue;
                Message messageObtainMessage = this.mHandler.obtainMessage();
                messageObtainMessage.what = 10001;
                this.mHandler.sendMessage(messageObtainMessage);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clipingNotificationView() {
        refreshNotificationCancelMessage();
        if (EnvironmentInfo.g()) {
            String string = BaseApplication.getContext().getResources().getString(R.string.IDS_device_touch_transfer_enter_title);
            String string2 = BaseApplication.getContext().getResources().getString(R.string.IDS_device_touch_transfer_cliping);
            Notification.Builder builderC = lsb.a().c();
            builderC.setProgress(100, this.mTransferProgressValue, false);
            builderC.setContentTitle(string);
            builderC.setContentText(string2);
            builderC.setSmallIcon(R.drawable.healthlogo_ic_notification);
            builderC.setOngoing(true);
            this.mNotification = builderC.build();
            lsb.a().c(100000, this.mNotification);
            return;
        }
        this.mRemoteViews = new RemoteViews(BaseApplication.getContext().getPackageName(), R.layout.notification_transfering_view);
        if (Build.VERSION.SDK_INT >= 31) {
            this.mRemoteViews = new RemoteViews(BaseApplication.getContext().getPackageName(), R.layout.notification_transfering_view_large_android13);
        }
        this.mRemoteViews.setTextViewText(R.id.touch_transfer_percent, UnitUtil.e(this.mTransferProgressValue, 2, 0));
        this.mRemoteViews.setTextViewText(R.id.touch_transfer_title, BaseApplication.getContext().getResources().getString(R.string.IDS_device_touch_transfer_cliping));
        this.mRemoteViews.setProgressBar(R.id.touch_transfer_progress, 0, this.mTransferProgressValue, false);
        this.mNotification.contentView = this.mRemoteViews;
        this.mNotification.bigContentView = this.mRemoteViews;
        lsb.a().c(100000, this.mNotification);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void transferingNotificationView() {
        String strJ = mdy.j();
        if (strJ == null) {
            strJ = "";
        }
        if (EnvironmentInfo.g()) {
            String quantityString = BaseApplication.getContext().getResources().getQuantityString(R.plurals.IDS_device_touch_transfer_transfering_photos_to_device, 1, Integer.valueOf(this.mTransferTotalCount), strJ);
            Notification.Builder builderC = lsb.a().c();
            builderC.setProgress(100, this.mTransferProgressValue, false);
            builderC.setContentTitle(quantityString);
            builderC.setOngoing(true);
            builderC.setContentText(getString(R.string.IDS_settings_firmware_upgrade_band_transfer_finish) + UnitUtil.e(this.mTransferProgressValue, 2, 0));
            builderC.setSmallIcon(R.drawable.healthlogo_ic_notification);
            this.mNotification = builderC.build();
            lsb.a().c(100000, this.mNotification);
            return;
        }
        this.mRemoteViews = new RemoteViews(BaseApplication.getContext().getPackageName(), R.layout.notification_transfering_view);
        if (Build.VERSION.SDK_INT >= 31) {
            this.mRemoteViews = new RemoteViews(BaseApplication.getContext().getPackageName(), R.layout.notification_transfering_view_large_android13);
        }
        this.mRemoteViews.setTextViewText(R.id.touch_transfer_percent, UnitUtil.e(this.mTransferProgressValue, 2, 0));
        int i = R.plurals.IDS_device_touch_transfer_transfering_photos_to_device;
        Resources resources = BaseApplication.getContext().getResources();
        int i2 = this.mTransferTotalCount;
        this.mRemoteViews.setTextViewText(R.id.touch_transfer_title, resources.getQuantityString(i, i2, Integer.valueOf(i2), strJ));
        LogUtil.a(TAG, "transferingNotificationView mTransferProgressValue: ", Integer.valueOf(this.mTransferProgressValue));
        this.mRemoteViews.setProgressBar(R.id.touch_transfer_progress, 100, this.mTransferProgressValue, false);
        this.mNotification.contentView = this.mRemoteViews;
        this.mNotification.bigContentView = this.mRemoteViews;
        lsb.a().c(100000, this.mNotification);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void displayTransferedNotificationView() {
        String string;
        String strJ = mdy.j();
        if (strJ == null) {
            strJ = "";
        }
        Context context = BaseApplication.getContext();
        Resources resources = context.getResources();
        DeviceInfo deviceInfoC = mgg.c(TAG);
        if (!mbx.a(context).c() || deviceInfoC == null || deviceInfoC.getDeviceConnectState() != 2) {
            string = resources.getString(R.string.IDS_hw_health_wear_connect_device_disconnect);
        } else {
            string = resources.getString(R.string.IDS_device_touch_transfer_have_create_album_dial, strJ);
        }
        int iD = SmartClipManager.e(BaseApplication.getContext()).d();
        if (iD < 0) {
            iD = 0;
        }
        int iA = SmartClipManager.e(BaseApplication.getContext()).a();
        String quantityString = resources.getQuantityString(R.plurals.IDS_device_touch_transfer_file_unit_string, iD, Integer.valueOf(iD));
        String quantityString2 = resources.getQuantityString(R.plurals.IDS_device_touch_transfer_file_unit_string, iD, Integer.valueOf(iA));
        String str = String.format(Locale.ENGLISH, resources.getString(R.string.IDS_device_touch_transfer_transferred_photos_result_content), quantityString, quantityString2);
        if (EnvironmentInfo.g()) {
            Notification.Builder builderC = lsb.a().c();
            builderC.setContentTitle(string);
            builderC.setSmallIcon(R.drawable.healthlogo_ic_notification);
            this.mNotification = builderC.build();
            builderC.setContentText(str);
            builderC.setOngoing(true);
            lsb.a().c(100000, this.mNotification);
            return;
        }
        this.mRemoteViews = new RemoteViews(context.getPackageName(), R.layout.notification_transfer_end_view);
        if (Build.VERSION.SDK_INT >= 31) {
            this.mRemoteViews = new RemoteViews(BaseApplication.getContext().getPackageName(), R.layout.notification_transfer_end_view_large_android13);
        }
        this.mRemoteViews.setTextViewText(R.id.touch_transfer_end_title, string);
        this.mRemoteViews.setTextViewText(R.id.touch_transfer_content, str);
        this.mNotification.contentView = this.mRemoteViews;
        this.mNotification.bigContentView = this.mRemoteViews;
        LogUtil.a(TAG, "displayTransferedNotificationView mNotification: ", this.mNotification);
        lsb.a().c(100000, this.mNotification);
    }

    public static void startWatchFaceTransferService(Context context, String str) {
        if (context == null) {
            LogUtil.j(TAG, "startWatchFaceTransferService context is null");
            return;
        }
        LogUtil.a(TAG, "startWatchFaceTransferService onStartCommand: ", str);
        Intent intent = new Intent(context, (Class<?>) HandoffService.class);
        intent.putExtra(WATCH_FACE_HAND_OFF_FILE_PATH, str);
        context.startForegroundService(intent);
    }

    @Override // android.app.IntentService, android.app.Service
    public void onCreate() {
        super.onCreate();
        LogUtil.a(TAG, "onCreate");
        buildTransferNotification();
        try {
            startForeground(100, this.mNotification);
        } catch (Exception unused) {
            LogUtil.e(TAG, "startForeground Exception");
        }
    }

    @Override // android.app.IntentService, android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        Context context;
        ReleaseLogUtil.d(TAG_RELEASE, "onStartCommand");
        bindHiaiService();
        if (!mbx.a(BaseApplication.getContext()).b() && (context = (Context) new WeakReference(this).get()) != null) {
            mbx.a(context).a();
        }
        return super.onStartCommand(intent, i, i2);
    }

    @Override // android.app.IntentService, android.app.Service
    public IBinder onBind(Intent intent) {
        LogUtil.a(TAG, "onBind");
        return null;
    }

    @Override // android.app.Service
    public void onTaskRemoved(Intent intent) {
        lsb.a().e(100000);
        super.onTaskRemoved(intent);
    }

    @Override // android.app.IntentService
    protected void onHandleIntent(Intent intent) {
        JSONArray jSONArray;
        if (intent == null) {
            LogUtil.j(TAG, "intent is null");
            return;
        }
        bindHiaiService();
        if (!mbx.a(BaseApplication.getContext()).b()) {
            Context context = (Context) new WeakReference(this).get();
            if (context == null) {
                LogUtil.j(TAG, "context is null.");
            } else {
                mbx.a(context).a();
            }
        }
        try {
            String stringExtra = intent.getStringExtra(WATCH_FACE_HAND_OFF_FILE_PATH);
            if (!TextUtils.isEmpty(stringExtra)) {
                try {
                    jSONArray = new JSONArray(stringExtra);
                } catch (JSONException unused) {
                    ReleaseLogUtil.a(TAG_RELEASE, "onHandleIntent JSONException");
                    jSONArray = null;
                }
                if (jSONArray == null || jSONArray.length() <= 0) {
                    return;
                }
                transferWatchFaceToWatch(jSONArray);
                return;
            }
            ReleaseLogUtil.e(TAG_RELEASE, "onHandleIntent pathString is null");
        } catch (Exception unused2) {
            LogUtil.e(TAG, "onHandleIntent Exception");
        }
    }

    private void bindHiaiService() {
        HiAiSmartClipApi hiAiSmartClip;
        boolean zI = SmartClipManager.e(BaseApplication.getContext()).i();
        ReleaseLogUtil.d(TAG_RELEASE, "isSupportSmartClip:", Boolean.valueOf(zI));
        if (!zI || (hiAiSmartClip = ddr.e().getHiAiSmartClip()) == null) {
            return;
        }
        hiAiSmartClip.init(BaseApplication.getContext());
    }

    private void refreshNotificationCancelMessage() {
        sIsCancelNotification = true;
        this.mHandler.removeMessages(10004);
        Message messageObtainMessage = this.mHandler.obtainMessage();
        messageObtainMessage.what = 10004;
        this.mHandler.sendMessageDelayed(messageObtainMessage, 5000L);
    }

    private void transferWatchFaceToWatch(JSONArray jSONArray) {
        LogUtil.a(TAG, "transferWatchFaceToWatch");
        this.mTransferProgressValue = 0;
        this.mTransferTotalCount = 0;
        this.mTransferFailedCount = 0;
        this.mTransferProgressPaddingValue = 0;
        sTransferMillTime = 0L;
        ArrayList arrayList = new ArrayList(16);
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                String string = jSONArray.getString(i);
                LogUtil.a(TAG, "fileName: ", string);
                arrayList.add(string);
            } catch (JSONException unused) {
                LogUtil.e(TAG, "transferWatchFaceToWatch JSONException");
            }
        }
        if (arrayList.size() > 0) {
            LogUtil.a(TAG, "pathsList: ", arrayList.toString());
            Message messageObtainMessage = this.mHandler.obtainMessage();
            messageObtainMessage.what = 10005;
            this.mHandler.sendMessage(messageObtainMessage);
            SmartClipManager.e(BaseApplication.getContext()).c(arrayList, false, true, this.mClipCallback);
            return;
        }
        LogUtil.j(TAG, "pathsList.size is 0");
    }

    @Override // android.app.IntentService, android.app.Service
    public void onDestroy() {
        stopForeground(false);
        super.onDestroy();
    }

    private void buildTransferNotification() {
        Notification.Builder builderC = lsb.a().c();
        builderC.setAutoCancel(true);
        builderC.setPriority(0);
        builderC.setSmallIcon(R.drawable.healthlogo_ic_notification);
        builderC.setContentTitle(BaseApplication.getContext().getString(R.string.IDS_device_touch_transfer_enter_title));
        builderC.setGroup(TAG);
        builderC.setShowWhen(true);
        builderC.setContentIntent(NotificationUtil.d(BaseApplication.getContext()));
        builderC.setOngoing(true);
        builderC.setWhen(System.currentTimeMillis());
        this.mNotification = builderC.build();
    }
}
