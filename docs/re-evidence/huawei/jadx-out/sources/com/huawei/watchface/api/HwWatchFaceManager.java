package com.huawei.watchface.api;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import androidx.appcompat.app.AppCompatDelegate;
import com.huawei.common.util.Utils;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.hms.utils.HMSPackageManager;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.constant.WatchFaceConstant;
import com.huawei.hwidauth.api.Result;
import com.huawei.hwidauth.api.ResultCallBack;
import com.huawei.operation.ble.BleConstants;
import com.huawei.secure.android.common.intent.SafeBroadcastReceiver;
import com.huawei.secure.android.common.intent.SafeIntent;
import com.huawei.secure.android.common.util.SafeString;
import com.huawei.watchface.R;
import com.huawei.watchface.c2;
import com.huawei.watchface.e4;
import com.huawei.watchface.e5;
import com.huawei.watchface.environment.Environment;
import com.huawei.watchface.f;
import com.huawei.watchface.f2;
import com.huawei.watchface.flavor.FlavorConfig;
import com.huawei.watchface.g2;
import com.huawei.watchface.g5;
import com.huawei.watchface.h;
import com.huawei.watchface.h2;
import com.huawei.watchface.i0;
import com.huawei.watchface.j0;
import com.huawei.watchface.j2;
import com.huawei.watchface.k2;
import com.huawei.watchface.k3;
import com.huawei.watchface.k4;
import com.huawei.watchface.k5;
import com.huawei.watchface.l1;
import com.huawei.watchface.m;
import com.huawei.watchface.m4;
import com.huawei.watchface.manager.HwDeviceConfigManager;
import com.huawei.watchface.manager.WatchFacePhotoAlbumManager;
import com.huawei.watchface.mvp.model.datatype.AbilityListForH5;
import com.huawei.watchface.mvp.model.datatype.CustomWatchfaceInfo;
import com.huawei.watchface.mvp.model.datatype.DeviceInfo;
import com.huawei.watchface.mvp.model.datatype.InstallWatchFaceBean;
import com.huawei.watchface.mvp.model.datatype.ScreenInfo;
import com.huawei.watchface.mvp.model.datatype.WatchFaceInfo;
import com.huawei.watchface.mvp.model.datatype.WatchFaceInfoForH5;
import com.huawei.watchface.mvp.model.datatype.WatchFaceSignBean;
import com.huawei.watchface.mvp.model.datatype.WatchFaceSupportInfo;
import com.huawei.watchface.mvp.model.datatype.WatchResourcesInfo;
import com.huawei.watchface.mvp.model.filedownload.FilePuller;
import com.huawei.watchface.mvp.model.filedownload.PullListenerInterface;
import com.huawei.watchface.mvp.model.filedownload.PullResult;
import com.huawei.watchface.mvp.model.filedownload.PullTask;
import com.huawei.watchface.mvp.model.filedownload.threadpool.ThreadPoolManager;
import com.huawei.watchface.mvp.model.helper.GsonHelper;
import com.huawei.watchface.n;
import com.huawei.watchface.q0;
import com.huawei.watchface.q2;
import com.huawei.watchface.r0;
import com.huawei.watchface.r3;
import com.huawei.watchface.s0;
import com.huawei.watchface.u2;
import com.huawei.watchface.utils.ArrayUtils;
import com.huawei.watchface.utils.BackgroundTaskUtils;
import com.huawei.watchface.utils.CommonUtils;
import com.huawei.watchface.utils.DensityUtil;
import com.huawei.watchface.utils.FileHelper;
import com.huawei.watchface.utils.HwLog;
import com.huawei.watchface.utils.IntegerUtils;
import com.huawei.watchface.utils.LanguageUtils;
import com.huawei.watchface.utils.WatchFaceHttpUtil;
import com.huawei.watchface.utils.callback.DelectUserDesignationWatchFaceCallback;
import com.huawei.watchface.utils.callback.IAppTransferFileResultAIDLCallback;
import com.huawei.watchface.utils.callback.IBaseResponseCallback;
import com.huawei.watchface.utils.callback.IFileTransferStateCallback;
import com.huawei.watchface.utils.callback.OperateWatchFaceCallback;
import com.huawei.watchface.utils.callback.OperationCallback;
import com.huawei.watchface.v2;
import com.huawei.watchface.videoedit.sysc.Consumer;
import com.huawei.watchface.videoedit.sysc.Optional;
import com.huawei.watchface.videoedit.utils.FileUtils;
import com.huawei.watchface.w4;
import com.huawei.watchface.z1;
import com.huawei.watchface.z2;
import defpackage.nmk;
import defpackage.nmm;
import defpackage.nmq;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes20.dex */
public class HwWatchFaceManager {
    public static final String CLIENT_ID = "clientID";
    public static final int DEFAULT_PERCENTAGE = -1;
    public static final String DEFAULT_WATCHFACE_ID_VERSION = "00";
    private static final String TAG = "HwWatchFaceManager";
    public static final String VERIFY_PASSWORD_URI = "hwid://com.huawei.hwid/VerifyPasswordV2";
    private static final String VERIFY_PWD_TYPE = "VERIFY_PWD_TYPE";
    private static final int VERIFY_PWD_TYPE_CHILD = 3;
    private static final int VERIFY_PWD_TYPE_DEFAULT = 0;
    private static HwWatchFaceManager sInstance;
    private String cancelHiTopId;
    private Context mContext;
    private String mCurrentDeleteHiTopId;
    private String mCurrentDeleteName;
    private String mCurrentDeleteVersion;
    private String mCurrentDeviceName;
    private String mCurrentInstallWatchFaceHiTopId;
    private String mCurrentInstallWatchFaceVersion;
    private String mCurrentTransferWatchFaceHiTopId;
    private String mCurrentTransferWatchFaceVersion;
    private DelectUserDesignationWatchFaceCallback mDeleteUserDesignationWatchFaceCallback;
    private j0 mDialogNoPermission;
    private String mDownLoadPath;
    private Handler mHandler;
    private HwDeviceConfigManager mHwDeviceConfigManager;
    private HwWatchFaceBtManager mHwWatchFaceBtManager;
    private boolean mIsCanceled;
    private boolean mIsDesignerInstall;
    private boolean mIsDoLogin;
    private long mLastCurrentInstallTime;
    private long mLastCurrentTime;
    private long mLastTransmitWatchInfoChange;
    private z2 mNoTitleDialog;
    private OperateWatchFaceCallback mOperateCallback;
    private i0.a mProgressBuilder;
    private i0 mProgressDialog;
    private OperateWatchFaceCallback pOperateCallback;
    private int mCurrentInstallState = 0;
    private boolean mIsAppSetWatchFace = false;
    private boolean mIsInstallState = false;
    public HashMap<String, WatchResourcesInfo> mVipFreeWatchFaceInfos = new HashMap<>();
    private boolean mIsBtConnect = true;
    private boolean mIsFirstGprsInstallWatchFace = true;
    private int mLastPercentage = -1;
    private int mInstallTimeoutErrorCode = 20010;
    private LinkedHashMap<String, String> mWatchScreenMap = new LinkedHashMap<>();
    private ConcurrentHashMap<String, h> mInstallEventHashMap = new ConcurrentHashMap<>(32);
    private ConcurrentHashMap<String, CustomWatchfaceInfo> mInstallEventInfo = new ConcurrentHashMap<>();
    private boolean isStopServices = false;
    private LinkedHashMap<String, Boolean> mUpdateMap = new LinkedHashMap<>();
    private IBaseResponseCallback mBtResponseCallback = new IBaseResponseCallback() { // from class: com.huawei.watchface.api.HwWatchFaceManager.1
        private void transmitInstallResult(String str, String str2) {
            int i;
            int i2;
            if (j2.g().m(str, str2)) {
                HwLog.i(HwWatchFaceManager.TAG, "mBtResponseCallback -- call back h5 try out install success");
                i = 2;
                i2 = 2;
            } else {
                i = 1;
                i2 = 10;
            }
            HwWatchFaceManager.this.transmitInstallResultForH5(str, str2, i);
            HwWatchFaceManager.this.transmitInstallResultForH5New(str, str2, i2);
        }

        @Override // com.huawei.watchface.utils.callback.IBaseResponseCallback
        public void onResponse(int i, Object obj) {
            boolean zEquals;
            String watchInfoVersion;
            String currentInstallWatchFaceHiTopId;
            String str = HwWatchFaceManager.TAG;
            HwLog.i(str, "mBtResponseCallback() onResponse:" + i);
            if (i == 101) {
                HwLog.i(str, "mBtResponseCallback() onResponse CALLBACK_TYPE_SUCCESS");
                return;
            }
            if (i == 115) {
                HwLog.i(str, "mBtResponseCallback() onResponse CALLBACK_PHOTO_TRANSFER_SUCCESS");
                WatchFacePhotoAlbumManager.getInstance(HwWatchFaceManager.this.mContext).refreshData();
                return;
            }
            switch (i) {
                case 106:
                    HwLog.i(str, "mBtResponseCallback() onResponse CALLBACK_CURRENT_CHANGE");
                    HwWatchFaceManager hwWatchFaceManager = HwWatchFaceManager.this;
                    if (hwWatchFaceManager.mCurrentInstallState == 2 || hwWatchFaceManager.mIsAppSetWatchFace) {
                        HwLog.i(str, "mBtResponseCallback() skip this pace");
                    } else {
                        hwWatchFaceManager.getDeviceAndWatchFaceInfoByBt();
                    }
                    j2.g().a(i, obj);
                    break;
                case 107:
                    HwLog.i(str, "mBtResponseCallback() onResponse CALLBACK_TRANSFER_SUCCESS");
                    WatchResourcesInfo watchResourcesInfo = (obj == null || !(obj instanceof WatchResourcesInfo)) ? null : (WatchResourcesInfo) obj;
                    if (watchResourcesInfo == null) {
                        currentInstallWatchFaceHiTopId = HwWatchFaceManager.this.getCurrentInstallWatchFaceHiTopId();
                        watchInfoVersion = HwWatchFaceManager.this.getCurrentInstallWatchFaceVersion();
                        zEquals = true;
                    } else {
                        String currentInstallWatchFaceHiTopId2 = HwWatchFaceManager.this.getCurrentInstallWatchFaceHiTopId();
                        zEquals = !TextUtils.isEmpty(currentInstallWatchFaceHiTopId2) ? TextUtils.equals(watchResourcesInfo.getWatchInfoId(), currentInstallWatchFaceHiTopId2) : false;
                        String watchInfoId = watchResourcesInfo.getWatchInfoId();
                        watchInfoVersion = watchResourcesInfo.getWatchInfoVersion();
                        currentInstallWatchFaceHiTopId = watchInfoId;
                    }
                    HwLog.i(str, "mBtResponseCallback() isInstallId: " + zEquals + " ,hitopid:" + currentInstallWatchFaceHiTopId + " ,version:" + watchInfoVersion);
                    HwWatchFaceManager.this.closeDesignerTranslateDialog(currentInstallWatchFaceHiTopId, zEquals);
                    transmitInstallResult(currentInstallWatchFaceHiTopId, watchInfoVersion);
                    if (watchResourcesInfo == null) {
                        HwLog.i(str, "mBtResponseCallback() onResponse CALLBACK_TRANSFER_SUCCESS watchResourcesInfo is null.");
                        if (zEquals) {
                            HwWatchFaceManager.this.applyWatchFace(currentInstallWatchFaceHiTopId, watchInfoVersion, 2, "", false);
                        }
                    } else if (HwWatchFaceManager.this.mUpdateMap.containsKey(watchResourcesInfo.getWatchInfoId())) {
                        HwLog.i(str, "mBtResponseCallback() onResponse CALLBACK_TRANSFER_SUCCESS remove.");
                        HwWatchFaceManager.this.mUpdateMap.remove(watchResourcesInfo.getWatchInfoId());
                        HwWatchFaceManager.this.continueInstallNext(103, watchResourcesInfo.getWatchInfoId() + "_" + watchResourcesInfo.getWatchInfoVersion(), true);
                    } else if (zEquals) {
                        HwWatchFaceManager.this.applyWatchFace(currentInstallWatchFaceHiTopId, watchInfoVersion, 2, "", false);
                    }
                    break;
                case 108:
                    HwLog.w(str, "mBtResponseCallback() onResponse CALLBACK_WATCH_FACE_DELETE.");
                    HwWatchFaceManager.this.handleWatchFaceDelete(obj);
                    break;
                case AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY /* 109 */:
                case 110:
                    HwWatchFaceManager.this.getDeviceAndWatchFaceInfoByBt();
                    j2.g().a(i, obj);
                    break;
                default:
                    HwLog.w(str, "mBtResponseCallback() onResponse:" + i);
                    break;
            }
        }
    };
    private IFileTransferStateCallback mFileTransferStateCallback = new IFileTransferStateCallback() { // from class: com.huawei.watchface.api.HwWatchFaceManager.2
        @Override // com.huawei.watchface.utils.callback.IFileTransferStateCallback
        public void onFileRespond(int i) {
            HwWatchFaceManager.this.handleOnFileRespond(i);
        }

        @Override // com.huawei.watchface.utils.callback.IFileTransferStateCallback
        public void onFileTransferState(int i) {
            HwWatchFaceManager.this.handleOnFileTransferState(i);
        }

        @Override // com.huawei.watchface.utils.callback.IFileTransferStateCallback
        public void onUpgradeFailed(int i, String str) {
            HwWatchFaceManager.this.handleOnUpgradeFailed(i, str);
        }
    };
    private IAppTransferFileResultAIDLCallback mAppTransferFileResultAIDLCallback = new IAppTransferFileResultAIDLCallback() { // from class: com.huawei.watchface.api.HwWatchFaceManager.3
        @Override // com.huawei.watchface.utils.callback.IAppTransferFileResultAIDLCallback
        public void onFileRespond(int i, String str) {
            HwWatchFaceManager.this.handleOnFileRespond(i);
        }

        @Override // com.huawei.watchface.utils.callback.IAppTransferFileResultAIDLCallback
        public void onFileTransferState(int i, String str) {
            HwWatchFaceManager.this.handleOnFileTransferState(i);
        }

        @Override // com.huawei.watchface.utils.callback.IAppTransferFileResultAIDLCallback
        public void onUpgradeFailed(int i, String str) {
            HwWatchFaceManager.this.handleOnUpgradeFailed(i, str);
        }
    };
    private IBaseResponseCallback mInstallWatchFaceCallback = new IBaseResponseCallback() { // from class: com.huawei.watchface.api.HwWatchFaceManager.4
        private void transmitInstallResult(String str, String str2) {
            int i;
            HwWatchFaceManager.this.transmitInstallResultForH5(str, str2, 1);
            if (j2.g().l(str, str2)) {
                HwLog.i(HwWatchFaceManager.TAG, "mBtResponseCallback -- call back h5 try out install success");
                i = 13;
            } else {
                i = 12;
            }
            HwWatchFaceManager.this.transmitInstallResultForH5New(str, str2, i);
        }

        private void transmitInstallResultForMemberSignature(String str, String str2) {
            int i;
            int i2;
            String str3 = HwWatchFaceManager.TAG;
            HwLog.i(str3, "transmitInstallResultForMemberSignature enter");
            if (!HwWatchFaceBtManager.getInstance(Environment.getApplicationContext()).isSupportMemberSignature()) {
                HwLog.i(str3, "transmitInstallResultForMemberSignature isSupportMemberSignature false");
                return;
            }
            if (!HwWatchFaceManager.this.isFindInMemberExpirationWatchFaces(str)) {
                HwLog.i(str3, "transmitInstallResultForMemberSignature isFindInMemberExpirationWatchFaces false");
                return;
            }
            if (j2.g().m(str, str2)) {
                HwLog.i(str3, "transmitInstallResultForMemberSignature isWaitTryOutWatchFaceId");
                i = 2;
                i2 = 2;
            } else {
                i = 1;
                i2 = 10;
            }
            HwWatchFaceManager.this.transmitInstallResultForH5(str, str2, i);
            HwWatchFaceManager.this.transmitInstallResultForH5New(str, str2, i2);
        }

        @Override // com.huawei.watchface.utils.callback.IBaseResponseCallback
        public void onResponse(int i, Object obj) {
            String str = HwWatchFaceManager.TAG;
            HwLog.i(str, "mInstallWatchFaceCallback() errorCode: " + i);
            String currentInstallWatchFaceHiTopId = HwWatchFaceManager.this.getCurrentInstallWatchFaceHiTopId();
            String currentInstallWatchFaceVersion = HwWatchFaceManager.this.getCurrentInstallWatchFaceVersion();
            if (obj instanceof String) {
                String[] strArrSplit = ((String) obj).split("_");
                if (strArrSplit.length >= 2) {
                    currentInstallWatchFaceHiTopId = strArrSplit[0];
                    currentInstallWatchFaceVersion = strArrSplit[1];
                    HwLog.i(str, "mInstallWatchFaceCallback() setCurrentInstallWatchFaceHiTopId : " + currentInstallWatchFaceHiTopId + ", version: " + currentInstallWatchFaceVersion);
                    HwWatchFaceManager.this.setCurrentInstallWatchFaceHiTopId(currentInstallWatchFaceHiTopId);
                    HwWatchFaceManager.this.setCurrentInstallWatchFaceVersion(currentInstallWatchFaceVersion);
                }
            }
            HwLog.i(str, "mInstallWatchFaceCallback() hiTopId: " + currentInstallWatchFaceHiTopId + ", version: " + currentInstallWatchFaceVersion);
            switch (i) {
                case 103:
                    transmitInstallResultForMemberSignature(currentInstallWatchFaceHiTopId, currentInstallWatchFaceVersion);
                    HwLog.i(str, "mInstallWatchFaceCallback() Apply watchFace success.");
                    HwWatchFaceManager.this.getDeviceAndWatchFaceInfoByBt();
                    HwWatchFaceManager.this.changeInstallState(0);
                    HwWatchFaceManager.this.setCurrentTransferWatchFaceHiTopId(null);
                    HwWatchFaceManager.this.setCurrentTransferWatchFaceVersion(null);
                    z1.c().a(currentInstallWatchFaceHiTopId, currentInstallWatchFaceVersion);
                    HwWatchFaceManager.this.continueInstallNext(i, obj, false);
                    transmitInstallResult(currentInstallWatchFaceHiTopId, currentInstallWatchFaceVersion);
                    k2.a().b(currentInstallWatchFaceHiTopId, currentInstallWatchFaceVersion);
                    break;
                case 104:
                case WatchFaceConstant.WATCH_FACE_SIGN_FAILED_ERROR_100007 /* 100007 */:
                case WatchFaceConstant.WATCH_FACE_SIGN_FAILED_ERROR_100014 /* 100014 */:
                case 100015:
                    HwWatchFaceManager.this.getDeviceAndWatchFaceInfoByBt();
                    HwWatchFaceManager hwWatchFaceManager = HwWatchFaceManager.this;
                    hwWatchFaceManager.mIsInstallState = false;
                    hwWatchFaceManager.setCurrentTransferWatchFaceHiTopId(null);
                    HwWatchFaceManager.this.setCurrentTransferWatchFaceVersion(null);
                    if (i != 104) {
                        HwWatchFaceManager.this.initAnalyticsInstallEvent(currentInstallWatchFaceHiTopId, currentInstallWatchFaceVersion, null);
                        m.a(HwWatchFaceManager.this.getInstallEvent(currentInstallWatchFaceHiTopId), String.valueOf(i));
                    }
                    j2.g().a(currentInstallWatchFaceHiTopId, currentInstallWatchFaceVersion, i);
                    HwWatchFaceManager.this.processInstallFailed(currentInstallWatchFaceHiTopId, currentInstallWatchFaceVersion, i != 104 ? i : -4);
                    HwWatchFaceManager.this.installWaitInstallWatchFace(currentInstallWatchFaceHiTopId, currentInstallWatchFaceVersion, i);
                    FilePuller.getInstance(HwWatchFaceManager.this.mContext).installSuccessRemoveTask(currentInstallWatchFaceHiTopId, currentInstallWatchFaceVersion);
                    break;
                case 105:
                    HwLog.i(str, "mInstallWatchFaceCallback() Apply watchFace need receive.");
                    if (!TextUtils.equals(currentInstallWatchFaceHiTopId, "000000001")) {
                        String strBuildTaskId = (HwWatchFaceManager.this.mVipFreeWatchFaceInfos.get(currentInstallWatchFaceHiTopId) == null || !HwWatchFaceManager.this.mVipFreeWatchFaceInfos.get(currentInstallWatchFaceHiTopId).isVipFreeWatchFace()) ? FilePuller.getInstance(HwWatchFaceManager.this.mContext).buildTaskId(currentInstallWatchFaceHiTopId, currentInstallWatchFaceVersion) : FilePuller.getInstance(HwWatchFaceManager.this.mContext).buildTaskId(WatchResourcesInfo.markUpHiTopId(currentInstallWatchFaceHiTopId), currentInstallWatchFaceVersion);
                        if (!TextUtils.isEmpty(strBuildTaskId)) {
                            HwLog.d(str, "mInstallWatchFaceCallback() taskId =" + strBuildTaskId);
                            if (!currentInstallWatchFaceHiTopId.equalsIgnoreCase(HwWatchFaceManager.this.getCancelHiTopId())) {
                                HwWatchFaceManager.this.setCurrentTransferWatchFaceHiTopId(currentInstallWatchFaceHiTopId);
                                HwWatchFaceManager.this.setCurrentTransferWatchFaceVersion(currentInstallWatchFaceVersion);
                                String watchFacePath = HwWatchFaceManager.this.getWatchFacePath(strBuildTaskId);
                                FlavorConfig.safeHwLog(str, "mInstallWatchFaceCallback() WatchFacePath = " + watchFacePath + "，taskId =" + strBuildTaskId);
                                HwWatchFaceManager.this.initAnalyticsInstallEvent(currentInstallWatchFaceHiTopId, currentInstallWatchFaceVersion, strBuildTaskId);
                                HwWatchFaceManager.this.transferFile(watchFacePath, strBuildTaskId, 1);
                            } else {
                                HwLog.i(str, "mInstallWatchFaceCallback() cancelHiTopId：" + currentInstallWatchFaceHiTopId);
                                HwWatchFaceManager.this.setCancelHiTopId(null);
                                HwWatchFaceManager.this.dealCancel(currentInstallWatchFaceHiTopId, currentInstallWatchFaceVersion);
                            }
                        }
                    } else {
                        HwLog.i(str, "mInstallWatchFaceCallback hiTopId is PREFIX_HI_TOP_ID");
                        HwWatchFaceManager hwWatchFaceManager2 = HwWatchFaceManager.this;
                        hwWatchFaceManager2.mIsInstallState = false;
                        hwWatchFaceManager2.changeInstallState(0);
                    }
                    break;
                default:
                    j2.g().a(currentInstallWatchFaceHiTopId, currentInstallWatchFaceVersion, i);
                    HwWatchFaceManager.this.installWaitInstallWatchFace(currentInstallWatchFaceHiTopId, currentInstallWatchFaceVersion, i);
                    break;
            }
        }
    };
    private Runnable mResetInstallStateRunnable = new Runnable() { // from class: com.huawei.watchface.api.HwWatchFaceManager$$ExternalSyntheticLambda0
        @Override // java.lang.Runnable
        public final void run() {
            this.f$0.lambda$new$0();
        }
    };
    private Runnable mResetInstallState = new Runnable() { // from class: com.huawei.watchface.api.HwWatchFaceManager$$ExternalSyntheticLambda6
        @Override // java.lang.Runnable
        public final void run() {
            this.f$0.lambda$new$1();
        }
    };
    private BroadcastReceiver mBroadcastReceiver = new AnonymousClass5();
    private IBaseResponseCallback mDeleteMyWatchFaceCallback = new IBaseResponseCallback() { // from class: com.huawei.watchface.api.HwWatchFaceManager.6
        @Override // com.huawei.watchface.utils.callback.IBaseResponseCallback
        public void onResponse(int i, Object obj) {
            String str = HwWatchFaceManager.this.mCurrentDeleteHiTopId;
            if (obj instanceof String) {
                String[] strArrSplit = ((String) obj).split("_");
                if (strArrSplit.length >= 2) {
                    str = strArrSplit[0];
                }
            }
            if (i != 103) {
                if (i == 104) {
                    DelectUserDesignationWatchFaceCallback delectUserDesignationWatchFaceCallback = HwWatchFaceManager.this.mDeleteUserDesignationWatchFaceCallback;
                    if (delectUserDesignationWatchFaceCallback != null) {
                        delectUserDesignationWatchFaceCallback.onDelectWatchFaceState("0", str);
                    }
                    HwWatchFaceManager hwWatchFaceManager = HwWatchFaceManager.this;
                    hwWatchFaceManager.processDeleteFailed(hwWatchFaceManager.mCurrentDeleteHiTopId, hwWatchFaceManager.mCurrentDeleteVersion);
                    return;
                }
                return;
            }
            String str2 = HwWatchFaceManager.TAG;
            HwLog.i(str2, "mDeleteMyWatchFaceCallback success objectData: " + obj);
            HwLog.i(str2, "mUpdateMap info :" + GsonHelper.toJson(HwWatchFaceManager.this.mUpdateMap));
            if (q2.a((Map) HwWatchFaceManager.this.mUpdateMap, (Object) str)) {
                HwLog.i(str2, "mUpdateMap remove :" + str);
                HwWatchFaceManager.this.mUpdateMap.remove(str);
            } else {
                String strF = n.e().f(str);
                if (q2.a((Map) HwWatchFaceManager.this.mUpdateMap, (Object) strF)) {
                    HwWatchFaceManager.this.mUpdateMap.remove(strF);
                    HwLog.i(str2, "mUpdateMap remove hiTopId2 :" + strF);
                }
            }
            DelectUserDesignationWatchFaceCallback delectUserDesignationWatchFaceCallback2 = HwWatchFaceManager.this.mDeleteUserDesignationWatchFaceCallback;
            if (delectUserDesignationWatchFaceCallback2 != null) {
                delectUserDesignationWatchFaceCallback2.onDelectWatchFaceState("1", str);
            }
            HwWatchFaceManager hwWatchFaceManager2 = HwWatchFaceManager.this;
            hwWatchFaceManager2.mCurrentDeleteHiTopId = null;
            hwWatchFaceManager2.mCurrentDeleteVersion = null;
        }
    };
    private IBaseResponseCallback memberSignatureCallback = new IBaseResponseCallback() { // from class: com.huawei.watchface.api.HwWatchFaceManager.15
        @Override // com.huawei.watchface.utils.callback.IBaseResponseCallback
        public void onResponse(int i, Object obj) {
            String str = obj instanceof String ? (String) obj : "";
            HwLog.i(HwWatchFaceManager.TAG, "sendMemberSignature responseCode:" + i + ",objData:" + GsonHelper.toJson(obj));
            if (i == 103) {
                i = 1;
            }
            OperateWatchFaceCallback operateWatchFaceCallback = HwWatchFaceManager.this.mOperateCallback;
            if (operateWatchFaceCallback != null) {
                operateWatchFaceCallback.transmitSendMemberSignatureResult(i, str);
            }
            OperateWatchFaceCallback operateWatchFaceCallback2 = HwWatchFaceManager.this.pOperateCallback;
            if (operateWatchFaceCallback2 != null) {
                operateWatchFaceCallback2.transmitSendMemberSignatureResult(i, str);
            }
        }
    };
    private BroadcastReceiver mConnectStateChangedReceiver = new WatchFaceBroadCastReceiver();

    public static class WatchFaceBroadCastReceiver extends SafeBroadcastReceiver {
        private WatchFaceBroadCastReceiver() {
        }

        @Override // com.huawei.secure.android.common.intent.SafeBroadcastReceiver
        public void onReceiveMsg(Context context, Intent intent) {
            if (context == null) {
                return;
            }
            if (intent == null || intent.getExtras() == null || TextUtils.isEmpty(intent.getAction())) {
                HwLog.w(HwWatchFaceManager.TAG, "WatchFaceBroadCastReceiver() intent is null.");
                return;
            }
            if ("com.huawei.watchface.action.CONNECTION_STATE_CHANGED".equals(intent.getAction())) {
                HwLog.i(HwWatchFaceManager.TAG, "WatchFaceBroadCastReceiver() ACTION_CONNECTION_STATE_CHANGED.");
                HwWatchFaceManager hwWatchFaceManager = HwWatchFaceManager.sInstance;
                if (hwWatchFaceManager == null) {
                    return;
                }
                hwWatchFaceManager.onBtConnectionStateChange(intent);
            }
        }
    }

    private HwWatchFaceManager(Context context) {
        this.mContext = context;
        CommonUtils.a(this.mConnectStateChangedReceiver, new IntentFilter("com.huawei.watchface.action.CONNECTION_STATE_CHANGED"));
        this.mHwWatchFaceBtManager = HwWatchFaceBtManager.getInstance(this.mContext);
        StringBuilder sb = new StringBuilder();
        sb.append(this.mContext.getFilesDir().getAbsolutePath());
        String str = File.separator;
        sb.append(str);
        sb.append("watchface");
        sb.append(str);
        this.mDownLoadPath = sb.toString();
        this.mHwDeviceConfigManager = HwDeviceConfigManager.getInstance(this.mContext);
        IntentFilter intentFilter = new IntentFilter("com.huawei.plugin.account.login");
        BroadcastReceiver broadcastReceiver = this.mBroadcastReceiver;
        if (broadcastReceiver != null) {
            CommonUtils.a(broadcastReceiver, intentFilter);
        }
        HwWatchFaceBtManager.setCallBackForH5(this.mBtResponseCallback);
    }

    private void cancelInstallWatchFace2(String str, String str2) {
        String str3 = TAG;
        HwLog.i(str3, "cancelInstallWatchFace2 enter: " + str);
        stopTransfer(str, str2, true);
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.removeCallbacks(this.mResetInstallState);
        }
        if (!obtainJsonAbility().optBoolean("isSupportedDownloadManager")) {
            if (this.mCurrentInstallState != 3) {
                HwLog.i(str3, "cancelInstallWatchFace2 entry mCurrentInstallState != WatchFaceConstant.INSTALL_STATE_TRANSFER");
                OperateWatchFaceCallback operateWatchFaceCallback = this.mOperateCallback;
                if (operateWatchFaceCallback != null) {
                    operateWatchFaceCallback.transmitCancelInstallWatchFaceResult(str, str2, 1);
                }
                OperateWatchFaceCallback operateWatchFaceCallback2 = this.pOperateCallback;
                if (operateWatchFaceCallback2 != null) {
                    operateWatchFaceCallback2.transmitCancelInstallWatchFaceResult(str, str2, 1);
                }
                if (str.equals(getCurrentInstallWatchFaceHiTopId())) {
                    this.mIsInstallState = false;
                    HwLog.i(str3, "mOperateCallback() cancelTask, init mInstallState");
                }
                cancelTask(str, str2);
                return;
            }
            return;
        }
        if (FilePuller.getInstance(this.mContext).getCurrentTaskStatus(FilePuller.getInstance(this.mContext).buildTaskId(str, str2)) == 6) {
            if (str.equals(getCurrentInstallWatchFaceHiTopId())) {
                return;
            }
            HwLog.i(str3, "cancelInstallWatchFace2 entry !hiTopId.equals(getCurrentInstallWatchFaceHiTopId()");
            OperateWatchFaceCallback operateWatchFaceCallback3 = this.mOperateCallback;
            if (operateWatchFaceCallback3 != null) {
                operateWatchFaceCallback3.transmitCancelInstallWatchFaceResult(str, str2, 1);
            }
            OperateWatchFaceCallback operateWatchFaceCallback4 = this.pOperateCallback;
            if (operateWatchFaceCallback4 != null) {
                operateWatchFaceCallback4.transmitCancelInstallWatchFaceResult(str, str2, 1);
                return;
            }
            return;
        }
        HwLog.i(str3, "cancelInstallWatchFace2 entry != PullResult.PULL_INSTALLING");
        OperateWatchFaceCallback operateWatchFaceCallback5 = this.mOperateCallback;
        if (operateWatchFaceCallback5 != null) {
            operateWatchFaceCallback5.transmitCancelInstallWatchFaceResult(str, str2, 1);
        }
        OperateWatchFaceCallback operateWatchFaceCallback6 = this.pOperateCallback;
        if (operateWatchFaceCallback6 != null) {
            operateWatchFaceCallback6.transmitCancelInstallWatchFaceResult(str, str2, 1);
        }
        if (str.equals(getCurrentInstallWatchFaceHiTopId())) {
            this.mIsInstallState = false;
            HwLog.i(str3, "mOperateCallback() cancelTask, init mInstallState");
        }
        cancelTask(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cancelTask(String str, String str2) {
        FilePuller.getInstance(this.mContext).cancelTask(str, str2);
        if (str.equals(getCurrentInstallWatchFaceHiTopId()) && str2.equals(getCurrentInstallWatchFaceVersion())) {
            setCurrentInstallWatchFaceHiTopId(null);
            setCurrentInstallWatchFaceVersion(null);
            setCurrentTransferWatchFaceVersion(null);
            setCurrentTransferWatchFaceVersion(null);
            HwLog.i(TAG, "cancelTask() reset current hiTopId and version");
        }
        LinkedHashMap linkedHashMapN = f2.a(this.mContext).n();
        if (linkedHashMapN.containsKey(str)) {
            HwLog.i(TAG, "cancelTask() cancel task in map" + str);
            linkedHashMapN.remove(str);
            FilePuller.getInstance(this.mContext).removeTask(str, str2);
        }
        ConcurrentHashMap concurrentHashMapK = f2.a(this.mContext).k();
        if (concurrentHashMapK.containsKey(str)) {
            HwLog.i(TAG, "cancelTask() cancel task in pauseMap" + str);
            concurrentHashMapK.remove(str);
            FilePuller.getInstance(this.mContext).removeTask(str, str2);
        }
        installWaitInstallWatchFace(str, str2, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void changeInstallState(int i) {
        this.mCurrentInstallState = i;
        if (this.mHandler == null) {
            this.mHandler = new Handler();
        }
        this.mHandler.removeCallbacks(this.mResetInstallStateRunnable);
        if (this.mCurrentInstallState == 0) {
            return;
        }
        this.mHandler.postDelayed(this.mResetInstallStateRunnable, 60000L);
    }

    private void checkDeviceMode(boolean z) {
        WatchFaceSupportInfo watchFaceSupportInfo = HwWatchFaceBtManager.getInstance(this.mContext).getWatchFaceSupportInfo();
        int watchfaceMode = watchFaceSupportInfo != null ? watchFaceSupportInfo.getWatchfaceMode() : -1;
        int iA = e4.a("device_connect_mode", -1);
        String str = TAG;
        HwLog.i(str, "checkDeviceMode() watchfaceMode=" + watchfaceMode + ", cacheMode=" + iA);
        boolean z2 = iA != watchfaceMode;
        e4.b("device_connect_mode", watchfaceMode);
        e4.b("mode_change", z2);
        HwLog.i(str, "checkDeviceMode modeChange ==" + z2);
        if (!z && z2) {
            e4.b("mode_change_not_refresh", true);
            j2.g().a(true);
            HwLog.i(str, "checkDeviceMode CHANGE_NOT_REFRESH true");
        }
        if (obtainJsonAbility().optBoolean("isSupportedDownloadManager")) {
            f2.a(this.mContext).a(z2);
            f2.a(this.mContext).h();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void closeDesignerTranslateDialog(String str, boolean z) {
        if (TextUtils.equals("000000001", str) && k3.a(this.mContext).a()) {
            if (!z) {
                changeInstallState(0);
            }
            hideDesignerInstallDialog(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void continueInstallNext(int i, Object obj, boolean z) {
        HwLog.i(TAG, "continueInstallNext enter errorCode:" + i);
        FilePuller.getInstance(this.mContext).installSuccessRemoveTask(n.e().f(getCurrentInstallWatchFaceHiTopId()), getCurrentInstallWatchFaceVersion());
        j2.g().a(getCurrentInstallWatchFaceHiTopId(), getCurrentInstallWatchFaceVersion(), i);
        if (obtainJsonAbility().optBoolean("isSupportedDownloadManager")) {
            dealSetDefaultWatchFaceResponse(i, true, obj, z);
        }
    }

    private StringBuffer createDesignerWatchFaceUrl(StringBuffer stringBuffer, String str) {
        if (getCurrentInstallWatchFaceVersion() == null) {
            setCurrentInstallWatchFaceVersion(getRandomVersion());
        }
        StringBuilder sb = new StringBuilder(this.mDownLoadPath);
        sb.append("000000001_" + getCurrentInstallWatchFaceVersion());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(sb.toString());
        String str2 = File.separator;
        sb2.append(str2);
        sb2.append(WatchFaceConstant.PREVIEW_RES);
        sb2.append(str2);
        sb2.append("cover.jpg");
        stringBuffer.append("000000001").append("_").append(str).append("_").append(sb2.toString()).append(",");
        HwLog.i(TAG, "createDesignerWatchFaceUrl, transmitWatchFaceNames:" + stringBuffer.toString());
        return stringBuffer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dealCancel(String str, String str2) {
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.removeCallbacks(this.mResetInstallState);
        }
        this.mLastPercentage = -1;
        OperateWatchFaceCallback operateWatchFaceCallback = this.mOperateCallback;
        if (operateWatchFaceCallback != null) {
            operateWatchFaceCallback.transmitCancelInstallWatchFaceResult(str, str2, 1);
        }
        OperateWatchFaceCallback operateWatchFaceCallback2 = this.pOperateCallback;
        if (operateWatchFaceCallback2 != null) {
            operateWatchFaceCallback2.transmitCancelInstallWatchFaceResult(str, str2, 1);
        }
        changeInstallState(0);
        dealTaskTransferredOrCanceled(str, str2);
        if (str.equals(getCurrentInstallWatchFaceHiTopId())) {
            this.mIsInstallState = false;
            HwLog.i(TAG, "dealCancel, init mInstallState");
        }
        cancelTask(str, str2);
    }

    private void dealDownloadProgressResult(final String str, final String str2, int i, PullResult pullResult, f fVar) {
        if (i != -6) {
            if (i != 0) {
                switch (i) {
                    case -13:
                    case -12:
                    case -11:
                        break;
                    default:
                        processInstallFailed(str, str2, -1);
                        FilePuller.getInstance(this.mContext).operationDownloadTask(str, str2, 1, new OperationCallback() { // from class: com.huawei.watchface.api.HwWatchFaceManager.10
                            @Override // com.huawei.watchface.utils.callback.OperationCallback
                            public void operationResult(int i2) {
                                if (i2 != 0 || HwWatchFaceManager.this.mOperateCallback == null) {
                                    return;
                                }
                                HwLog.i(HwWatchFaceManager.TAG, "dealDownloadProgressResult, operationResult");
                                HwWatchFaceManager.this.mOperateCallback.transmitDownloadWatchFaceResult(str, str2, 3);
                                OperateWatchFaceCallback operateWatchFaceCallback = HwWatchFaceManager.this.pOperateCallback;
                                if (operateWatchFaceCallback != null) {
                                    operateWatchFaceCallback.transmitDownloadWatchFaceResult(str, str2, 3);
                                }
                            }
                        });
                        f2.a(this.mContext).e(str);
                        m.a(fVar, String.valueOf(i));
                        break;
                }
                return;
            }
            changeInstallState(1);
            float fRound = Math.round(pullResult.fetchPulledSize() / 1024.0f);
            int iFetchTotalSize = pullResult.fetchTotalSize();
            if (iFetchTotalSize == 0) {
                return;
            }
            int i2 = (int) ((fRound / iFetchTotalSize) * 100.0f);
            if (i2 > 100) {
                i2 = 100;
            }
            dealTransmitProgress(i2, str);
            return;
        }
        HwLog.i(TAG, "dealDownloadProgressResult, PULL_DECOMPRESS_FAIL");
        cancelInstallWatchFace(str, str2);
        f2.a(this.mContext).e(str);
        decryptResult(i, str);
        m.a(fVar, String.valueOf(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dealDownloadResult(int i, PullResult pullResult, String str, String str2, String str3, f fVar, boolean z) {
        if (i != 0) {
            HwLog.i(TAG, "dealDownloadResult, responseCode:" + i);
        }
        if (i == -10) {
            HwLog.i(TAG, "download cancel");
            changeInstallState(0);
            OperateWatchFaceCallback operateWatchFaceCallback = this.mOperateCallback;
            if (operateWatchFaceCallback != null) {
                operateWatchFaceCallback.transmitDownloadWatchFaceResult(str, str2, 2);
            }
            OperateWatchFaceCallback operateWatchFaceCallback2 = this.pOperateCallback;
            if (operateWatchFaceCallback2 != null) {
                operateWatchFaceCallback2.transmitDownloadWatchFaceResult(str, str2, 2);
            }
            f2.a(this.mContext).e(str);
            m.a(fVar, String.valueOf(i));
            return;
        }
        if (i == -8) {
            OperateWatchFaceCallback operateWatchFaceCallback3 = this.mOperateCallback;
            if (operateWatchFaceCallback3 != null) {
                operateWatchFaceCallback3.transmitDownloadWatchFaceResult(str, str2, -8);
            }
            OperateWatchFaceCallback operateWatchFaceCallback4 = this.pOperateCallback;
            if (operateWatchFaceCallback4 != null) {
                operateWatchFaceCallback4.transmitDownloadWatchFaceResult(str, str2, -8);
                return;
            }
            return;
        }
        if (i != 1) {
            if (i != 7) {
                if (i == 3 || i == 4) {
                    HwLog.i(TAG, "dealDownloadResult, download pause or restart");
                    return;
                } else {
                    fVar.f(pullResult.getDescInfo());
                    dealDownloadProgressResult(str, str2, i, pullResult, fVar);
                    return;
                }
            }
            OperateWatchFaceCallback operateWatchFaceCallback5 = this.mOperateCallback;
            if (operateWatchFaceCallback5 != null) {
                operateWatchFaceCallback5.transmitDownloadWatchFaceResult(str, str2, 7);
            }
            OperateWatchFaceCallback operateWatchFaceCallback6 = this.pOperateCallback;
            if (operateWatchFaceCallback6 != null) {
                operateWatchFaceCallback6.transmitDownloadWatchFaceResult(str, str2, 7);
                return;
            }
            return;
        }
        String str4 = TAG;
        HwLog.i(str4, "dealDownloadResult() download success");
        FilePuller.getInstance(this.mContext).downloadSuccessRemoveTask(str, str2);
        q2.a(this.mInstallEventInfo, str, new CustomWatchfaceInfo(fVar.s(), fVar.k(), fVar.o(), fVar.t()));
        if (!f2.a(this.mContext).r()) {
            HwLog.w(str4, "dealDownloadResult() device diff");
            OperateWatchFaceCallback operateWatchFaceCallback7 = this.mOperateCallback;
            if (operateWatchFaceCallback7 != null) {
                operateWatchFaceCallback7.transmitDownloadWatchFaceResult(str, str2, 2);
            }
            OperateWatchFaceCallback operateWatchFaceCallback8 = this.pOperateCallback;
            if (operateWatchFaceCallback8 != null) {
                operateWatchFaceCallback8.transmitDownloadWatchFaceResult(str, str2, 2);
                return;
            }
            return;
        }
        OperateWatchFaceCallback operateWatchFaceCallback9 = this.mOperateCallback;
        if (operateWatchFaceCallback9 != null) {
            operateWatchFaceCallback9.transmitDownloadWatchFaceResult(str, str2, 1);
        }
        OperateWatchFaceCallback operateWatchFaceCallback10 = this.pOperateCallback;
        if (operateWatchFaceCallback10 != null) {
            operateWatchFaceCallback10.transmitDownloadWatchFaceResult(str, str2, 1);
        }
        if (HwWatchFaceBtManager.getInstance(this.mContext).getConnectWatchDeviceInfo() != null) {
            HwLog.i(str4, "dealDownloadResult() has connected devices");
            if (z) {
                HwLog.i(str4, "dealDownloadResult() rename result" + FileUtils.renameTo(this.mDownLoadPath + pullResult.fetchUuid(), this.mDownLoadPath + WatchResourcesInfo.markUpHiTopId(pullResult.fetchUuid())) + ",new hiTopId:" + str + ",version:" + str2);
            } else if (n.e().g()) {
                String strTrim = n.e().b(str).trim();
                if (!TextUtils.equals(str, strTrim)) {
                    HwLog.i(str4, "dealDownloadResult() AodManager :" + FileUtils.renameTo(this.mDownLoadPath + pullResult.fetchUuid(), this.mDownLoadPath + strTrim + "_" + str2) + ",hiTopId:" + strTrim + ", version:" + str2);
                }
            }
            applyWatchFace(str, str2, 1, str3, z, pullResult.getInstallationType(), true);
        } else {
            HwLog.i(str4, "dealDownloadResult() hiTopId:" + str + ", version:" + str2);
            f2.a(this.mContext).a(str, str2);
            processInstallFailed(str, str2, -5);
        }
        fVar.f(pullResult.getDescInfo());
        m.a(fVar, String.valueOf(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dealTaskTransferredOrCanceled(String str, String str2) {
        String str3 = TAG;
        HwLog.i(str3, "enter dealTaskTransferredOrCanceled hitopid =" + str + ",version =" + str2);
        ConcurrentHashMap concurrentHashMapJ = f2.a(this.mContext).j();
        String currentInstallWatchFaceHiTopId = getCurrentInstallWatchFaceHiTopId();
        if (currentInstallWatchFaceHiTopId != null && concurrentHashMapJ.containsKey(currentInstallWatchFaceHiTopId)) {
            concurrentHashMapJ.clear();
            HwLog.i(str3, "dealTaskTransferredOrCanceled, remove installed hang task");
        }
        if (this.mVipFreeWatchFaceInfos.get(str) != null && this.mVipFreeWatchFaceInfos.get(str).isVipFreeWatchFace()) {
            str = WatchResourcesInfo.markUpHiTopId(str);
        }
        if (n.e().j(str)) {
            str = n.e().i(str);
        }
        String str4 = str + "_" + str2;
        String str5 = this.mDownLoadPath + str4;
        v2.a().a(str4);
        s0.a().d(str4);
        HwLog.i(str3, "dealTaskTransferredOrCanceled isDeleteSuccess: " + CommonUtils.b(new File(str5)) + ", hitopId: " + str);
        setCurrentTransferWatchFaceHiTopId(null);
        setCurrentTransferWatchFaceVersion(null);
    }

    private void dealTransmitProgress(int i, String str) {
        String str2 = this.mCurrentDeleteHiTopId;
        if (str2 != null && str2.equals(str)) {
            HwLog.w(TAG, "dealTransmitProgress, hiTopId is delete task id.");
            return;
        }
        if (this.mOperateCallback != null) {
            if (((this.mLastCurrentTime > System.currentTimeMillis() || System.currentTimeMillis() - this.mLastCurrentTime < 200) && i != 100) || i < 0 || i % 20 != 0 || i <= f2.a(this.mContext).b(str)) {
                return;
            }
            HwLog.i(TAG, "dealTransmitProgress, download progress to h5:" + i);
            f2.a(this.mContext).a(str, i);
            String strA = CommonUtils.a((double) i, 2, 0);
            this.mLastCurrentTime = System.currentTimeMillis();
            this.mOperateCallback.transmitDownloadProgressWatchFace(str, i, strA);
            OperateWatchFaceCallback operateWatchFaceCallback = this.pOperateCallback;
            if (operateWatchFaceCallback != null) {
                operateWatchFaceCallback.transmitDownloadProgressWatchFace(str, i, strA);
            }
        }
    }

    private void dealWatchFaceInfoTransmit(HashMap<String, WatchResourcesInfo> map) {
        String str = this.mContext.getFilesDir().getAbsolutePath() + File.separator + "watchfaceAsset";
        StringBuffer stringBuffer = new StringBuffer(1);
        for (String str2 : map.keySet()) {
            String watchInfoName = map.get(str2).getWatchInfoName();
            String watchInfoBrief = map.get(str2).getWatchInfoBrief();
            int watchInfoSize = map.get(str2).getWatchInfoSize();
            HwLog.d(TAG, "dealWatchFaceInfoTransmit, name:" + watchInfoName + " brief: " + watchInfoBrief + " size: " + watchInfoSize);
            if ("000000001".equals(str2)) {
                stringBuffer = createDesignerWatchFaceUrl(stringBuffer, watchInfoName);
            } else {
                stringBuffer.append(str2).append("_").append(watchInfoName).append("_").append(watchInfoBrief).append("_").append(watchInfoSize).append("_").append(str + File.separator + str2 + ".png").append(",");
            }
        }
        String string = stringBuffer.toString();
        if (!TextUtils.isEmpty(string) && string.endsWith("_")) {
            string = SafeString.substring(string, 0, string.length() - 1);
        }
        String str3 = TAG;
        HwLog.i(str3, "transmitWatchFaceNames:" + string);
        if (TextUtils.isEmpty(string)) {
            return;
        }
        OperateWatchFaceCallback operateWatchFaceCallback = this.pOperateCallback;
        if (operateWatchFaceCallback != null) {
            operateWatchFaceCallback.transmitWatchFaceNames(string);
        }
        OperateWatchFaceCallback operateWatchFaceCallback2 = this.mOperateCallback;
        if (operateWatchFaceCallback2 != null) {
            operateWatchFaceCallback2.transmitWatchFaceNames(string);
        } else {
            HwLog.w(str3, "transmitWatchFaceNames error");
        }
    }

    private static void destroyInstance() {
        synchronized (HwWatchFaceManager.class) {
            if (sInstance != null) {
                HwLog.i(TAG, "destroyInstance() enter.");
                sInstance = null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dismissNoTitleDialog() {
        z2 z2Var = this.mNoTitleDialog;
        if (z2Var != null) {
            z2Var.dismiss();
            this.mNoTitleDialog = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void downloadWatchFace(final InstallWatchFaceBean installWatchFaceBean) {
        if (installWatchFaceBean == null) {
            HwLog.e(TAG, "downloadWatchFace() installWatchFaceBean is null.");
            return;
        }
        HwLog.i(TAG, "downloadWatchFace() enter.");
        changeInstallState(1);
        WatchFaceInfo watchFaceInfo = new WatchFaceInfo();
        String fileSize = installWatchFaceBean.getFileSize();
        if (!TextUtils.isEmpty(fileSize)) {
            try {
                watchFaceInfo.configFileSize(Integer.parseInt(SafeString.substring(fileSize, 0, fileSize.length() - 2)));
            } catch (NumberFormatException unused) {
                HwLog.e(TAG, "downloadWatchFace() NumberFormatException.");
            }
        }
        StringBuffer stringBuffer = new StringBuffer(installWatchFaceBean.getWatchFaceHiTopId());
        stringBuffer.append("_");
        stringBuffer.append(installWatchFaceBean.getVersion());
        String string = stringBuffer.toString();
        watchFaceInfo.configFileType(String.valueOf(4));
        watchFaceInfo.configDigest(installWatchFaceBean.getHashCode());
        watchFaceInfo.setInstallationType(installWatchFaceBean.getInstallationType());
        final f analyticsDownloadEvent = getAnalyticsDownloadEvent(installWatchFaceBean);
        if (installWatchFaceBean.isVipFreeWatchFace()) {
            w4.c().a(installWatchFaceBean.getWatchFaceHiTopId(), installWatchFaceBean.getVersion());
        }
        pullWatchFaceFile(string, installWatchFaceBean.getFileUrl(), f2.a(this.mContext).c(string), watchFaceInfo, installWatchFaceBean.isZip(), installWatchFaceBean.isOneClick(), new IBaseResponseCallback() { // from class: com.huawei.watchface.api.HwWatchFaceManager.9
            /* JADX WARN: Code duplicated, block: B:11:0x002d  */
            @Override // com.huawei.watchface.utils.callback.IBaseResponseCallback
            public void onResponse(int i, Object obj) {
                String str;
                String str2;
                if (!(obj instanceof PullResult)) {
                    HwLog.w(HwWatchFaceManager.TAG, "downloadWatchFace() objectData isn't PullResult");
                    return;
                }
                PullResult pullResult = (PullResult) obj;
                String strFetchUuid = pullResult.fetchUuid();
                if (TextUtils.isEmpty(strFetchUuid)) {
                    str = "";
                    str2 = str;
                } else {
                    String[] strArrSplit = strFetchUuid.split("_");
                    if (strArrSplit.length > 1) {
                        String str3 = strArrSplit[0];
                        str2 = strArrSplit[1];
                        str = str3;
                    } else {
                        str = "";
                        str2 = str;
                    }
                }
                HwWatchFaceManager.this.dealDownloadResult(i, pullResult, str, str2, installWatchFaceBean.getWatchScreen(), analyticsDownloadEvent, installWatchFaceBean.isVipFreeWatchFace());
            }
        });
    }

    private void firstInstallRemind(final InstallWatchFaceBean installWatchFaceBean) {
        String str;
        String str2;
        String stringById = DensityUtil.getStringById(R.string.IDS_watchface_install_prompt_new);
        String fileSize = installWatchFaceBean.getFileSize();
        if (fileSize == null || !fileSize.endsWith("KB")) {
            str = String.format(Locale.ENGLISH, stringById, fileSize);
        } else {
            int iIndexOf = fileSize.indexOf("KB");
            try {
                int i = Integer.parseInt(SafeString.substring(fileSize, 0, iIndexOf));
                if (i >= 1024) {
                    str2 = CommonUtils.a(i / 1024.0f, 1, 2) + "MB";
                } else {
                    str2 = CommonUtils.a(i, 1, 0) + SafeString.substring(fileSize, iIndexOf, fileSize.length());
                }
            } catch (NumberFormatException unused) {
                HwLog.e(TAG, "firstInstallRemind, NumberFormatException");
                str2 = "";
            }
            str = String.format(Locale.ENGLISH, stringById, str2);
        }
        showFirstInstallRemindDialogNoTitle(str, new View.OnClickListener() { // from class: com.huawei.watchface.api.HwWatchFaceManager.8
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                HwWatchFaceManager.this.downloadWatchFace(installWatchFaceBean);
                HwWatchFaceManager.this.dismissNoTitleDialog();
                HwWatchFaceManager.this.mIsFirstGprsInstallWatchFace = false;
            }
        }, installWatchFaceBean);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public h getInstallEvent(String str) {
        if (TextUtils.isEmpty(str)) {
            return (h) new h().b(System.currentTimeMillis());
        }
        if (this.mInstallEventHashMap.containsKey(str)) {
            h hVar = this.mInstallEventHashMap.get(str);
            this.mInstallEventHashMap.remove(str);
            return hVar;
        }
        HwLog.i(TAG, "getInstallEvent mInstallEventHashMap is not containsKey hitopId:" + str);
        return null;
    }

    public static HwWatchFaceManager getInstance(Context context) {
        if (sInstance == null) {
            synchronized (HwWatchFaceManager.class) {
                if (sInstance == null) {
                    sInstance = new HwWatchFaceManager(context.getApplicationContext());
                }
            }
        }
        return sInstance;
    }

    private int getPowerLevel() {
        WatchFaceSupportInfo watchFaceSupportInfo = HwWatchFaceBtManager.getInstance(this.mContext).getWatchFaceSupportInfo();
        if (watchFaceSupportInfo != null) {
            return watchFaceSupportInfo.getPowerLevel();
        }
        HwLog.e(TAG, "getPowerLevel() watchFaceSupportInfo is null.");
        return 0;
    }

    private List<ScreenInfo> getPurchasedInfo() {
        WatchFaceSupportInfo watchFaceSupportInfo = HwWatchFaceBtManager.getInstance(this.mContext).getWatchFaceSupportInfo();
        if (watchFaceSupportInfo == null) {
            HwLog.e(TAG, "getPurchasedInfo() watchFaceSupportInfo is null.");
            return null;
        }
        List<ScreenInfo> purchasedList = watchFaceSupportInfo.getPurchasedList();
        if (ArrayUtils.isEmpty(purchasedList)) {
            HwLog.e(TAG, "getPurchasedInfo() purchasedList is null.");
        }
        return purchasedList;
    }

    public static AbilityListForH5 getWatchAbility() {
        AbilityListForH5 abilityListForH5 = new AbilityListForH5();
        abilityListForH5.setSupportedAlbumWatchFace(true);
        abilityListForH5.setSupportedVideoWatchFace(true);
        abilityListForH5.setSupportedDownloadManager(true);
        abilityListForH5.setSupportedDownloadTotalSizeIsKB(true);
        abilityListForH5.setSupportedGetPhoneInfo(true);
        abilityListForH5.setSupportedTryOut(HwWatchFaceBtManager.getInstance(Environment.getApplicationContext()).isSupportTryOut());
        abilityListForH5.setSupportedCoupon(true);
        abilityListForH5.setSupportArrEncrypt(true);
        abilityListForH5.setSupportedThreePay(true);
        abilityListForH5.setSupportedDialUnite(HwWatchFaceBtManager.getInstance(Environment.getApplicationContext()).isSupportDialUnite());
        abilityListForH5.setSupportedKaleidoscopeWatchFace(true);
        abilityListForH5.setSupportExchange(true);
        abilityListForH5.setSupportSharing(true);
        abilityListForH5.setSupportedMemberShip(CommonUtils.A());
        abilityListForH5.setSupportPrivacyUrl(true);
        abilityListForH5.setSupportedSportKaleidoscopeWatchFace(true);
        abilityListForH5.setSupportedWearWatchFace(getInstance(Environment.getApplicationContext()).getIsWearSupport() != 0);
        abilityListForH5.setSupportedHumanPortrait(false);
        abilityListForH5.setSupportedGalleryPlugin(true);
        abilityListForH5.setSupportedVideoPlugin(true);
        abilityListForH5.setSupportedWearPlugin(true);
        abilityListForH5.setSupportedMemberExclusive(true);
        abilityListForH5.setSupportedKaleidoscopePlugin(true);
        abilityListForH5.setSupportShortcutseCreate(true);
        abilityListForH5.setSupportNewAlbum(HwWatchFaceBtManager.getInstance(Environment.getApplicationContext()).isSupportNewAlbum());
        abilityListForH5.setSupportPictureSearch(true);
        abilityListForH5.setSupportWatchFaceSignature(true);
        abilityListForH5.setPreInstalledVersion(false);
        abilityListForH5.setPreInstalledVersionType("1");
        abilityListForH5.setVipPayType("1");
        abilityListForH5.setSupportMyWatch(TextUtils.equals(HwWatchFaceApi.getInstance(Environment.getApplicationContext()).getIsSupportMyWatchface(), "1"));
        abilityListForH5.setAarVersion("10005151");
        abilityListForH5.setGalleryType("1");
        abilityListForH5.setWearType(abilityListForH5.isSupportedWearWatchFace() ? "2" : "0");
        abilityListForH5.setLocalFileType("1");
        abilityListForH5.setSupportedOverseaMemberShip(true);
        abilityListForH5.setSupportedTryOptimize(true);
        abilityListForH5.setSupportedRecyclingOptimization(true);
        abilityListForH5.setSupportedMemberIap4(true);
        abilityListForH5.setSupportNewSharing(true);
        abilityListForH5.setSupportNewShortCut(true);
        abilityListForH5.setSupportUcsSign(true);
        abilityListForH5.setSupportComboPurchase(true);
        return abilityListForH5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleOnFileRespond(int i) {
        String currentInstallWatchFaceVersion;
        HwLog.i(TAG, "handleOnFileRespond() checkResult: " + i);
        try {
            String currentInstallWatchFaceHiTopId = getCurrentInstallWatchFaceHiTopId();
            String currentTransferWatchFaceHiTopId = getCurrentTransferWatchFaceHiTopId();
            if (TextUtils.isEmpty(currentTransferWatchFaceHiTopId) || TextUtils.equals(currentTransferWatchFaceHiTopId, currentInstallWatchFaceHiTopId)) {
                currentInstallWatchFaceVersion = getCurrentInstallWatchFaceVersion();
            } else {
                currentInstallWatchFaceVersion = getCurrentTransferWatchFaceVersion();
                currentInstallWatchFaceHiTopId = currentTransferWatchFaceHiTopId;
            }
            m.a(getInstallEvent(currentInstallWatchFaceHiTopId), i == 0 ? String.valueOf(142001) : String.valueOf(i));
            this.mIsCanceled = false;
            this.mLastPercentage = -1;
            dealTaskTransferredOrCanceled(currentInstallWatchFaceHiTopId, currentInstallWatchFaceVersion);
            if (i == 0) {
                String currentInstallWatchFaceHiTopId2 = getCurrentInstallWatchFaceHiTopId();
                String currentInstallWatchFaceVersion2 = getCurrentInstallWatchFaceVersion();
                processInstallFailed(getCurrentInstallWatchFaceHiTopId(), getCurrentInstallWatchFaceVersion(), -2);
                f2.a(this.mContext).a(currentInstallWatchFaceHiTopId2, currentInstallWatchFaceVersion2, 1, new InstallWatchFaceBean(currentInstallWatchFaceHiTopId2, currentInstallWatchFaceVersion2, "", "", "", "", false));
                installWaitInstallWatchFace(currentInstallWatchFaceHiTopId2, currentInstallWatchFaceVersion2, i);
            }
        } catch (Exception e) {
            HwLog.e(TAG, "handleOnFileRespond error =" + HwLog.printException(e));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleOnFileTransferState(int i) {
        try {
            if (i == 142000) {
                HwLog.i(TAG, "handleOnFileTransferState() ERROR_CODE_WATCH_FACE_TASK_HANG");
                return;
            }
            String str = TAG;
            HwLog.i(str, "handleOnFileTransferState percentage:" + i);
            if (i < this.mLastPercentage) {
                Handler handler = this.mHandler;
                if (handler != null) {
                    handler.removeCallbacks(this.mResetInstallState);
                    this.mInstallTimeoutErrorCode = 20020;
                    this.mHandler.postDelayed(this.mResetInstallState, 60000L);
                    return;
                }
                return;
            }
            changeInstallState(3);
            this.mHandler.removeCallbacks(this.mResetInstallState);
            this.mHandler.postDelayed(this.mResetInstallState, 60000L);
            if ((Math.abs(System.currentTimeMillis() - this.mLastCurrentInstallTime) < 1000 || i == this.mLastPercentage) && i < 95) {
                return;
            }
            this.mLastCurrentInstallTime = System.currentTimeMillis();
            this.mLastPercentage = i;
            if (getCurrentInstallWatchFaceHiTopId() == null) {
                HwLog.w(str, "handleOnFileTransferState() getCurrentInstallWatchFaceHiTopId is null.");
                return;
            }
            String strA = CommonUtils.a(i, 2, 0);
            OperateWatchFaceCallback operateWatchFaceCallback = this.mOperateCallback;
            if (operateWatchFaceCallback != null) {
                operateWatchFaceCallback.callTransmitProgressJsFunction(getCurrentInstallWatchFaceHiTopId(), i, strA);
            }
            OperateWatchFaceCallback operateWatchFaceCallback2 = this.pOperateCallback;
            if (operateWatchFaceCallback2 != null) {
                operateWatchFaceCallback2.callTransmitProgressJsFunction(getCurrentInstallWatchFaceHiTopId(), i, strA);
            }
        } catch (Exception e) {
            HwLog.e(TAG, "handleOnFileTransferState error = " + HwLog.printException(e));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleOnUpgradeFailed(int i, String str) {
        HwLog.i(TAG, "handleOnUpgradeFailed() onUpgradeFailed: " + i + ", errorMessage: " + str);
        try {
            m.a(getInstallEvent(getCurrentInstallWatchFaceHiTopId()), String.valueOf(i));
            this.mIsCanceled = false;
            this.mIsInstallState = false;
            String currentInstallWatchFaceHiTopId = getCurrentInstallWatchFaceHiTopId();
            String currentInstallWatchFaceVersion = getCurrentInstallWatchFaceVersion();
            hideDesignerInstallDialog(1);
            if (i == 140004) {
                processInstallFailed(getCurrentInstallWatchFaceHiTopId(), getCurrentInstallWatchFaceVersion(), -3);
                pauseAllTask();
                return;
            }
            if (i == 140009) {
                processInstallFailed(getCurrentInstallWatchFaceHiTopId(), getCurrentInstallWatchFaceVersion(), -6);
                pauseAllTask();
                return;
            }
            if (i == 141001) {
                processInstallFailed(getCurrentInstallWatchFaceHiTopId(), getCurrentInstallWatchFaceVersion(), -5);
                f2.a(this.mContext).a(currentInstallWatchFaceHiTopId, currentInstallWatchFaceVersion, 1, new InstallWatchFaceBean(currentInstallWatchFaceHiTopId, currentInstallWatchFaceVersion, "", "", "", "", false));
                installWaitInstallWatchFace(currentInstallWatchFaceHiTopId, currentInstallWatchFaceVersion, i);
                return;
            }
            if (i == 141000) {
                Handler handler = this.mHandler;
                if (handler != null) {
                    handler.removeCallbacks(this.mResetInstallState);
                    this.mInstallTimeoutErrorCode = 141000;
                    this.mHandler.post(this.mResetInstallState);
                    return;
                }
                return;
            }
            if (i == 20000) {
                processInstallFailed(getCurrentInstallWatchFaceHiTopId(), getCurrentInstallWatchFaceVersion(), 20000);
                f2.a(this.mContext).a(currentInstallWatchFaceHiTopId, currentInstallWatchFaceVersion, 1, new InstallWatchFaceBean(currentInstallWatchFaceHiTopId, currentInstallWatchFaceVersion, "", "", "", "", false));
                installWaitInstallWatchFace(currentInstallWatchFaceHiTopId, currentInstallWatchFaceVersion, i);
                return;
            }
            processInstallFailed(getCurrentInstallWatchFaceHiTopId(), getCurrentInstallWatchFaceVersion(), -2);
            f2.a(this.mContext).a(currentInstallWatchFaceHiTopId, currentInstallWatchFaceVersion, 1, new InstallWatchFaceBean(currentInstallWatchFaceHiTopId, currentInstallWatchFaceVersion, "", "", "", "", false));
            installWaitInstallWatchFace(currentInstallWatchFaceHiTopId, currentInstallWatchFaceVersion, i);
        } catch (Exception e) {
            HwLog.e(TAG, "handleOnUpgradeFailed error =" + HwLog.printException(e));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleWatchFaceDelete(Object obj) {
        if (this.mOperateCallback == null) {
            HwLog.w(TAG, "handleWatchFaceDelete() mOperateCallback is null.");
            return;
        }
        if (obj == null) {
            HwLog.w(TAG, "handleWatchFaceDelete() objectData is null.");
            return;
        }
        if (!(obj instanceof WatchResourcesInfo)) {
            HwLog.w(TAG, "handleWatchFaceDelete() objectData not instanceof WatchResourcesInfo.");
            return;
        }
        WatchResourcesInfo watchResourcesInfo = (WatchResourcesInfo) obj;
        if (watchResourcesInfo != null) {
            g5.c().e(watchResourcesInfo.getWatchInfoId(), watchResourcesInfo.getWatchInfoVersion());
        }
        this.mOperateCallback.transmitDeleteWatchFaceResult(watchResourcesInfo.getWatchInfoId(), watchResourcesInfo.getWatchInfoVersion(), 1);
        OperateWatchFaceCallback operateWatchFaceCallback = this.pOperateCallback;
        if (operateWatchFaceCallback != null) {
            operateWatchFaceCallback.transmitDeleteWatchFaceResult(watchResourcesInfo.getWatchInfoId(), watchResourcesInfo.getWatchInfoVersion(), 1);
        }
        getDeviceAndWatchFaceInfoByBt();
    }

    private boolean hasInstallingTask(String str, int i) {
        String str2 = TAG;
        HwLog.i(str2, "hasInstallingTask enter");
        if (!obtainJsonAbility().optBoolean("isSupportedDownloadManager")) {
            HwLog.i(str2, "hasInstallingTask Not supported download");
            return false;
        }
        if (i != 1) {
            HwLog.i(str2, "hasInstallingTask, installState isn't WATCH_FACE_INSTALLING");
            return false;
        }
        if (!this.mIsInstallState) {
            HwLog.i(str2, "hasInstallingTask, No task is being installed.");
            return false;
        }
        if (FilePuller.getInstance(this.mContext).getDownloadTaskStatus(str) != 3) {
            return true;
        }
        HwLog.i(str2, "hasInstallingTask, PULL_IN_PAUSE");
        return false;
    }

    private void hideDesignerInstallDialog(int i) {
        i0 i0Var;
        String str = TAG;
        HwLog.i(str, "hideDesignerInstallDialog() mIsDesignerInstall: " + this.mIsDesignerInstall);
        if (!this.mIsDesignerInstall || (i0Var = this.mProgressDialog) == null || !i0Var.isShowing() || this.mProgressBuilder == null) {
            return;
        }
        HwLog.i(str, "hideDesignerInstallDialog() enter.");
        this.mProgressDialog.dismiss();
        this.mProgressDialog = null;
        if (1 == i) {
            k4.a(R.string.photo_album_dialog_loading_install_failed);
        } else if (i == 0) {
            this.mIsDesignerInstall = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void initAnalyticsInstallEvent(String str, String str2, String str3) {
        final h hVar = new h();
        r0 r0VarA = s0.a().a(str3, FlavorConfig.SERVICE_WATCH_FACE);
        if (r0VarA != null && r0VarA.a() != null) {
            hVar.g(String.valueOf(r0VarA.a().length / 1024));
        }
        hVar.b(System.currentTimeMillis());
        hVar.b(str);
        hVar.c(str2);
        Optional.ofNullable((CustomWatchfaceInfo) q2.getMapValue(this.mInstallEventInfo, str)).ifPresent(new Consumer() { // from class: com.huawei.watchface.api.HwWatchFaceManager$$ExternalSyntheticLambda9
            @Override // com.huawei.watchface.videoedit.sysc.Consumer
            public final void accept(Object obj) {
                HwWatchFaceManager.lambda$initAnalyticsInstallEvent$13(hVar, (CustomWatchfaceInfo) obj);
            }
        });
        this.mInstallEventHashMap.put(str, hVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void installWaitInstallWatchFace(String str, String str2, int i) {
        String str3 = TAG;
        HwLog.i(str3, "installWaitInstallWatchFace, install waitInstallWatchFace hiTopId:" + str + ",version:" + str2 + ",errorCode:" + i);
        if (i != 0) {
            f2.a(this.mContext).e(str, str2);
            String strBuildTaskId = FilePuller.getInstance(this.mContext).buildTaskId(str, str2);
            HwLog.i(str3, "installWaitInstallWatchFace, taskId:" + strBuildTaskId);
            FilePuller.getInstance(this.mContext).notifyDownloadStatus(strBuildTaskId, 3);
        }
        if (i == 141001) {
            HwLog.w(str3, "installWaitInstallWatchFace, ERROR_CODE_CONNECT_LOST");
            return;
        }
        LinkedHashMap linkedHashMapN = f2.a(this.mContext).n();
        HwLog.i(str3, "installWaitInstallWatchFace map：" + GsonHelper.toJson(linkedHashMapN));
        if (linkedHashMapN.containsKey(str)) {
            linkedHashMapN.remove(str);
            HwLog.i(str3, "installWaitInstallWatchFace, remove installed task");
        }
        try {
            if (linkedHashMapN.isEmpty()) {
                HwLog.w(str3, "installWaitInstallWatchFace, Wait map is empty");
                return;
            }
            Iterator it = linkedHashMapN.entrySet().iterator();
            String str4 = (it == null || !it.hasNext()) ? null : (String) ((Map.Entry) it.next()).getKey();
            if (linkedHashMapN.containsKey(str4)) {
                applyWatchFace(str4, (String) linkedHashMapN.get(str4), 1, "", true);
            } else {
                HwLog.w(str3, "installWaitInstallWatchFace, mWaitInstallMap not contain hiTopId");
            }
        } catch (Exception e) {
            HwLog.w(TAG, "installWaitInstallWatchFace Exception" + HwLog.printException(e));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$applyWatchFace$2(WatchResourcesInfo watchResourcesInfo, int i, boolean z) {
        this.mHwWatchFaceBtManager.operateDevice(watchResourcesInfo, i, this.mInstallWatchFaceCallback, true, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$checkUserPasswordH5$14(nmk nmkVar) {
        if (nmkVar == null || nmkVar.getStatus() == null) {
            HwLog.i(TAG, "checkUserPassword result is null");
            transmitVerityPwsRes("1", "checkUserPassword result is null");
            return;
        }
        if (nmkVar.getStatus().d()) {
            HwLog.i(TAG, "checkUserPassword check success code：" + nmkVar.getStatus().e());
            transmitVerityPwsRes("0", "checkUserPassword check success");
            return;
        }
        int iE = nmkVar.getStatus().e();
        HwLog.w(TAG, "checkUserPassword check errorCode:" + iE + "StatusMessage:" + nmkVar.getStatus().a());
        transmitVerityPwsRes(String.valueOf(iE), nmkVar.getStatus().a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$deleteWatchFace$9(View view) {
        HwLog.i(TAG, "deleteWatchFace() onClick.");
        doDeleteWatchFace();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getDeviceInfoByBt$3(boolean z, int i, Object obj) {
        HwLog.i(TAG, "getDeviceInfoByBt() Response: " + i);
        checkDeviceMode(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getWatchFaceInfo$4(int i, Object obj) {
        if (i == 101) {
            this.mOperateCallback.transmitGetResult();
            OperateWatchFaceCallback operateWatchFaceCallback = this.pOperateCallback;
            if (operateWatchFaceCallback != null) {
                operateWatchFaceCallback.transmitGetResult();
            }
            HwLog.i(TAG, "getWatchFaceInfo() transmitGetResult.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getWatchFaceInfo$5(int i, Object obj) {
        if (i == 101) {
            this.mOperateCallback.transmitGetResult();
            OperateWatchFaceCallback operateWatchFaceCallback = this.pOperateCallback;
            if (operateWatchFaceCallback != null) {
                operateWatchFaceCallback.transmitGetResult();
            }
            HwLog.i(TAG, "getWatchFaceInfo() transmitGetResult.");
        }
    }

    static /* synthetic */ void lambda$initAnalyticsInstallEvent$13(h hVar, CustomWatchfaceInfo customWatchfaceInfo) {
        hVar.f(customWatchfaceInfo.getTitle());
        hVar.d(customWatchfaceInfo.getCnTitle());
        hVar.h(customWatchfaceInfo.getUseType());
        hVar.e(customWatchfaceInfo.getFileSize());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0() {
        this.mCurrentInstallState = 0;
        HwLog.i(TAG, "mResetInstallStateRunnable() mCurrentInstallState: " + this.mCurrentInstallState);
        transmitWatchInfoChange(60000);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$1() {
        HwLog.i(TAG, "mResetInstallState() reset");
        this.mLastPercentage = -1;
        String currentInstallWatchFaceHiTopId = getCurrentInstallWatchFaceHiTopId();
        String currentInstallWatchFaceVersion = getCurrentInstallWatchFaceVersion();
        f2.a(this.mContext).a(currentInstallWatchFaceHiTopId, currentInstallWatchFaceVersion);
        processInstallFailed(currentInstallWatchFaceHiTopId, currentInstallWatchFaceVersion, -2);
        stopTransfer(currentInstallWatchFaceHiTopId, currentInstallWatchFaceVersion, false);
        m.a(getInstallEvent(currentInstallWatchFaceHiTopId), String.valueOf(this.mInstallTimeoutErrorCode));
        this.mIsInstallState = false;
        this.mInstallTimeoutErrorCode = 20010;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$notifyDeviceTryOutOperate$12(int i, String str, String str2, IBaseResponseCallback iBaseResponseCallback) {
        boolean z = 7 == i;
        if (z) {
            k2.a().a(str, str2, 0, false);
        }
        WatchResourcesInfo watchResourcesInfo = new WatchResourcesInfo();
        watchResourcesInfo.setWatchInfoId(str);
        watchResourcesInfo.setWatchInfoVersion(str2);
        this.mHwWatchFaceBtManager.operateDevice(watchResourcesInfo, i, iBaseResponseCallback, false, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$processInstallFailed$10(View view) {
        j0 j0Var = this.mDialogNoPermission;
        if (j0Var != null) {
            j0Var.dismiss();
            this.mDialogNoPermission = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setDefaultWatchFace$7(boolean z, int i, Object obj) {
        HwLog.i(TAG, "setDefaultWatchFace() operateDevice response: " + i);
        dealSetDefaultWatchFaceResponse(i, z, obj, false);
    }

    private void notifyDeviceTryOutOperate(final String str, final String str2, final int i, final IBaseResponseCallback iBaseResponseCallback) {
        String str3 = TAG;
        HwLog.i(str3, "notifyDeviceTryOutOperate() enter.");
        if (!this.mIsBtConnect) {
            transmitDeviceConnectState(false, DensityUtil.getStringById(R.string.wearable_device_is_not_connected_notice));
            if (iBaseResponseCallback != null) {
                iBaseResponseCallback.onError(1);
            }
            HwLog.i(str3, "notifyDeviceTryOutOperate() bluetooth not connected");
            return;
        }
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            BackgroundTaskUtils.submit(new Runnable() { // from class: com.huawei.watchface.api.HwWatchFaceManager$$ExternalSyntheticLambda14
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.lambda$notifyDeviceTryOutOperate$12(i, str, str2, iBaseResponseCallback);
                }
            });
            return;
        }
        if (iBaseResponseCallback != null) {
            iBaseResponseCallback.onError(2);
        }
        HwLog.w(str3, "notifyDeviceTryOutOperate() failed: current id or version is null");
    }

    private JSONObject obtainJsonAbility() {
        HwLog.i(TAG, "obtainJsonAbility");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("isSupportedAlbumWatchFace", true);
            jSONObject.put("isSupportedVideoWatchFace", true);
            jSONObject.put("isSupportedDownloadManager", true);
            jSONObject.put("isSupportedDownloadTotalSizeIsKB", true);
            jSONObject.put("isSupportedGetPhoneInfo", true);
            jSONObject.put("isSupportedTryOut", HwWatchFaceBtManager.getInstance(this.mContext).isSupportTryOut());
            jSONObject.put("isSupportedCoupon", true);
            jSONObject.put("isSupportedThreePay", true);
            return jSONObject;
        } catch (JSONException e) {
            HwLog.e(TAG, "obtainJsonAbility, JSONException." + HwLog.printException((Exception) e));
            return jSONObject;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onBtConnectionStateChange(Intent intent) {
        Handler handler;
        DeviceInfo deviceInfo = (DeviceInfo) intent.getParcelableExtra("deviceinfo");
        if (deviceInfo == null) {
            HwLog.w(TAG, "mConnectStateChangedReceiver() deviceInfo is null");
            return;
        }
        int deviceConnectState = deviceInfo.getDeviceConnectState();
        String str = TAG;
        HwLog.i(str, "mConnectStateChangedReceiver() deviceConnectState: " + deviceConnectState);
        HwWatchFaceApi.getInstance(Environment.getApplicationContext()).setDisableWearInfoList(null);
        if (deviceConnectState != 2) {
            if (deviceConnectState != 3) {
                HwLog.w(str, "mConnectStateChangedReceiver() default");
                return;
            }
            this.mIsBtConnect = false;
            transmitDeviceConnectState(false, DensityUtil.getStringById(R.string.wearable_device_is_not_connected_notice));
            this.mIsCanceled = false;
            dismissStartSaveDialog();
            f2.a(this.mContext).a(getCurrentInstallWatchFaceHiTopId(), getCurrentInstallWatchFaceVersion());
            this.mIsInstallState = false;
            return;
        }
        this.mIsBtConnect = true;
        String strA = l1.a(HwWatchFaceApi.getInstance(Environment.getApplicationContext()).getDeviceName());
        HwLog.i(str, "mConnectStateChangedReceiver() deviceName is empty:" + TextUtils.isEmpty(strA));
        boolean zA = e4.a(strA);
        HwLog.i(str, "mConnectStateChangedReceiver() isDeviceChange: " + zA);
        j2.g().a(zA);
        transmitDeviceConnectState(true, String.valueOf(zA));
        if (zA && (handler = this.mHandler) != null) {
            handler.removeCallbacks(this.mResetInstallState);
            setCurrentInstallWatchFaceHiTopId(null);
            setCurrentInstallWatchFaceVersion(null);
            setCurrentTransferWatchFaceHiTopId(null);
            setCurrentTransferWatchFaceVersion(null);
            resetLeftSpaceAndIsWatchfaceFull();
            e4.f("cache_device_id", l1.a(HwWatchFaceApi.getInstance(this.mContext).getDeviceIdentify()));
        }
        this.mIsCanceled = false;
        if (getCancelHiTopId() != null) {
            setCancelHiTopId(null);
        }
        getDeviceInfoByBt(zA);
        n.e().a(zA);
        doRefreshUi();
    }

    private void passwordVerification(Activity activity) {
        if (HwWatchFaceApi.getInstance(this.mContext).isHmsLiteEnable()) {
            thirdVerifyAccount(activity);
        } else {
            verifyAccountAndPws(activity);
        }
    }

    private void pauseAllTask() {
        f2.a(this.mContext).d();
        FilePuller.getInstance(this.mContext).notifyAllTaskPause();
        OperateWatchFaceCallback operateWatchFaceCallback = this.mOperateCallback;
        if (operateWatchFaceCallback != null) {
            operateWatchFaceCallback.transmitRefreshPullData();
        }
        OperateWatchFaceCallback operateWatchFaceCallback2 = this.pOperateCallback;
        if (operateWatchFaceCallback2 != null) {
            operateWatchFaceCallback2.transmitRefreshPullData();
        }
    }

    private void processApplyFailed(String str, String str2) {
        String str3 = TAG;
        HwLog.i(str3, "processApplyFailed() enter.");
        showToast(DensityUtil.getStringById(R.string.watch_face_apply_failed));
        if (str == null || str2 == null) {
            HwLog.w(str3, "processApplyFailed() error: id or version is null");
            return;
        }
        OperateWatchFaceCallback operateWatchFaceCallback = this.mOperateCallback;
        if (operateWatchFaceCallback != null) {
            operateWatchFaceCallback.transmitSetDefaultWatchFaceResult(str, str2, 0);
        }
        OperateWatchFaceCallback operateWatchFaceCallback2 = this.pOperateCallback;
        if (operateWatchFaceCallback2 != null) {
            operateWatchFaceCallback2.transmitSetDefaultWatchFaceResult(str, str2, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:22:0x006c  */
    public void processInstallFailed(String str, String str2, int i) {
        String stringById;
        String str3 = TAG;
        HwLog.i(str3, "processInstallFailed() errorCode: " + i + ", hiTopId: " + str + ", version: " + str2);
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.removeCallbacks(this.mResetInstallState);
        }
        changeInstallState(0);
        if (i == -6) {
            stringById = DensityUtil.getStringById(R.string.IDS_watchface_device_insufficient_space_new);
        } else if (i == -5) {
            stringById = DensityUtil.getStringById(R.string.wearable_device_is_not_connected_notice);
        } else if (i == -3) {
            stringById = DensityUtil.getStringById(R.string.number_of_dials_has_reached_maximum_notice);
        } else if (i == -2) {
            stringById = DensityUtil.getStringById(R.string.IDS_watchface_install_retry);
            if (HwWatchFaceApi.getInstance(this.mContext).getIsTaskExecuting()) {
                stringById = "";
            }
        } else if (i == -1) {
            stringById = DensityUtil.getStringById(R.string.network_unstable_notice2);
        } else if (i != 20000 && i != 100007) {
            switch (i) {
                case WatchFaceConstant.WATCH_FACE_SIGN_FAILED_ERROR_100014 /* 100014 */:
                case 100015:
                    stringById = "";
                    break;
                default:
                    stringById = DensityUtil.getStringById(R.string.photo_album_dialog_loading_install_failed);
                    break;
            }
        } else {
            stringById = "";
        }
        if (!TextUtils.isEmpty(stringById)) {
            if (!CommonUtils.D() || i == -6) {
                showDialogNoPermission(stringById, new View.OnClickListener() { // from class: com.huawei.watchface.api.HwWatchFaceManager$$ExternalSyntheticLambda8
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f$0.lambda$processInstallFailed$10(view);
                    }
                });
            } else {
                showToast(stringById);
            }
        }
        if (str == null) {
            HwLog.w(str3, "processInstallFailed, hiTopId is null");
            return;
        }
        if (str2 == null) {
            HwLog.w(str3, "processInstallFailed, version is null");
            return;
        }
        if (i == 20000) {
            OperateWatchFaceCallback operateWatchFaceCallback = this.mOperateCallback;
            if (operateWatchFaceCallback != null) {
                operateWatchFaceCallback.transmitInstallWatchFaceResult(str, str2, 0);
            }
            OperateWatchFaceCallback operateWatchFaceCallback2 = this.pOperateCallback;
            if (operateWatchFaceCallback2 != null) {
                operateWatchFaceCallback2.transmitInstallWatchFaceResult(str, str2, 0);
                return;
            }
            return;
        }
        if (i != 100014 && i != 100007 && i != 100015) {
            i = 3;
        }
        OperateWatchFaceCallback operateWatchFaceCallback3 = this.mOperateCallback;
        if (operateWatchFaceCallback3 != null) {
            operateWatchFaceCallback3.transmitInstallWatchFaceResult(str, str2, i);
        }
        OperateWatchFaceCallback operateWatchFaceCallback4 = this.pOperateCallback;
        if (operateWatchFaceCallback4 != null) {
            operateWatchFaceCallback4.transmitInstallWatchFaceResult(str, str2, i);
        }
    }

    private void pullWatchFaceFile(String str, String str2, String str3, WatchFaceInfo watchFaceInfo, boolean z, boolean z2, final IBaseResponseCallback iBaseResponseCallback) {
        f2.a(this.mContext).a(str, str2, str3, watchFaceInfo, z, z2, new PullListenerInterface() { // from class: com.huawei.watchface.api.HwWatchFaceManager$$ExternalSyntheticLambda7
            @Override // com.huawei.watchface.mvp.model.filedownload.PullListenerInterface
            public final void onPullingChange(PullTask pullTask, PullResult pullResult) {
                iBaseResponseCallback.onResponse(pullResult.fetchStatus(), pullResult);
            }
        });
    }

    private void resetLeftSpaceAndIsWatchfaceFull() {
        if (this.mHwWatchFaceBtManager == null) {
            this.mHwWatchFaceBtManager = HwWatchFaceBtManager.getInstance(this.mContext);
        }
        this.mHwWatchFaceBtManager.setLeftSpace(-1);
        this.mHwWatchFaceBtManager.setIsWatchfaceFull(-1);
    }

    private void showDialogNoPermission(final String str, final View.OnClickListener onClickListener) {
        if (TextUtils.isEmpty(str) || this.mOperateCallback == null) {
            HwLog.w(TAG, "showDialogNoPermission() contentInfo is null or mOperateWatchFaceCallback is null.");
            return;
        }
        if (str.equals(DensityUtil.getStringById(R.string.wearable_device_is_not_connected_notice)) || str.equals(DensityUtil.getStringById(R.string.IDS_watchface_device_no_connect))) {
            this.mOperateCallback.transmitDeviceConnectState(false, str);
            OperateWatchFaceCallback operateWatchFaceCallback = this.pOperateCallback;
            if (operateWatchFaceCallback != null) {
                operateWatchFaceCallback.transmitDeviceConnectState(false, str);
                return;
            }
            return;
        }
        final Context customWebViewContext = this.mOperateCallback.getCustomWebViewContext();
        if (customWebViewContext instanceof Activity) {
            ((Activity) customWebViewContext).runOnUiThread(new Runnable() { // from class: com.huawei.watchface.api.HwWatchFaceManager.17
                @Override // java.lang.Runnable
                public void run() {
                    HwWatchFaceManager.this.mDialogNoPermission = new j0.a(customWebViewContext).b("").a(str).b(R.string.IDS_user_permission_know, onClickListener).a();
                    if (!HwWatchFaceManager.this.mDialogNoPermission.isShowing()) {
                        HwLog.i(HwWatchFaceManager.TAG, "showDialogNoPermission() dialogNoPermission is Showing.");
                        HwWatchFaceManager.this.mDialogNoPermission.setCancelable(false);
                        HwWatchFaceManager.this.mDialogNoPermission.show();
                    }
                    HwLog.i(HwWatchFaceManager.TAG, "showDialogNoPermission() dialogNoPermission has showed.");
                }
            });
        } else {
            HwLog.w(TAG, "showDialogNoPermission() customWebViewContext is not Activity.");
        }
    }

    private void showDialogNoTitle(final String str, final View.OnClickListener onClickListener) {
        OperateWatchFaceCallback operateWatchFaceCallback = this.mOperateCallback;
        if (operateWatchFaceCallback == null) {
            return;
        }
        final Context customWebViewContext = operateWatchFaceCallback.getCustomWebViewContext();
        if (customWebViewContext instanceof Activity) {
            ((Activity) customWebViewContext).runOnUiThread(new Runnable() { // from class: com.huawei.watchface.api.HwWatchFaceManager.18
                @Override // java.lang.Runnable
                public void run() {
                    HwWatchFaceManager.this.mNoTitleDialog = new z2.a(customWebViewContext).a(str).a(R.string.cancel, new View.OnClickListener() { // from class: com.huawei.watchface.api.HwWatchFaceManager.18.1
                        @Override // android.view.View.OnClickListener
                        public void onClick(View view) {
                            HwWatchFaceManager.this.dismissNoTitleDialog();
                        }
                    }).b(R.string.confirm, onClickListener).a();
                    if (!HwWatchFaceManager.this.mNoTitleDialog.isShowing() && !((Activity) customWebViewContext).isFinishing()) {
                        HwLog.i(HwWatchFaceManager.TAG, "showDialogNoTitle() mNoTitleDialog is showing");
                        HwWatchFaceManager.this.mNoTitleDialog.setCancelable(false);
                        HwWatchFaceManager.this.mNoTitleDialog.show();
                    }
                    HwLog.i(HwWatchFaceManager.TAG, "showDialogNoTitle() dialog has showed");
                }
            });
        } else {
            HwLog.w(TAG, "showDialogNoTitle() customWebViewContext is not Activity");
        }
    }

    private void showFirstInstallRemindDialogNoTitle(final String str, final View.OnClickListener onClickListener, final InstallWatchFaceBean installWatchFaceBean) {
        OperateWatchFaceCallback operateWatchFaceCallback = this.mOperateCallback;
        if (operateWatchFaceCallback == null) {
            return;
        }
        final Context customWebViewContext = operateWatchFaceCallback.getCustomWebViewContext();
        if (customWebViewContext instanceof Activity) {
            ((Activity) customWebViewContext).runOnUiThread(new Runnable() { // from class: com.huawei.watchface.api.HwWatchFaceManager.19
                @Override // java.lang.Runnable
                public void run() {
                    HwWatchFaceManager.this.mNoTitleDialog = new z2.a(customWebViewContext).a(str).a(R.string.cancel, new View.OnClickListener() { // from class: com.huawei.watchface.api.HwWatchFaceManager.19.1
                        @Override // android.view.View.OnClickListener
                        public void onClick(View view) {
                            HwWatchFaceManager.this.dismissNoTitleDialog();
                            AnonymousClass19 anonymousClass19 = AnonymousClass19.this;
                            OperateWatchFaceCallback operateWatchFaceCallback2 = HwWatchFaceManager.this.mOperateCallback;
                            if (operateWatchFaceCallback2 != null) {
                                operateWatchFaceCallback2.transmitDownloadWatchFaceResult(installWatchFaceBean.getWatchFaceHiTopId(), installWatchFaceBean.getVersion(), 2);
                            }
                            AnonymousClass19 anonymousClass110 = AnonymousClass19.this;
                            OperateWatchFaceCallback operateWatchFaceCallback3 = HwWatchFaceManager.this.pOperateCallback;
                            if (operateWatchFaceCallback3 != null) {
                                operateWatchFaceCallback3.transmitDownloadWatchFaceResult(installWatchFaceBean.getWatchFaceHiTopId(), installWatchFaceBean.getVersion(), 2);
                            }
                        }
                    }).b(R.string.confirm, onClickListener).a();
                    if (!HwWatchFaceManager.this.mNoTitleDialog.isShowing() && !((Activity) customWebViewContext).isFinishing()) {
                        HwLog.i(HwWatchFaceManager.TAG, "showFirstInstallRemindDialogNoTitle() mNoTitleDialog is showing");
                        HwWatchFaceManager.this.mNoTitleDialog.setCancelable(false);
                        HwWatchFaceManager.this.mNoTitleDialog.show();
                    }
                    HwLog.i(HwWatchFaceManager.TAG, "showFirstInstallRemindDialogNoTitle() dialog has showed");
                }
            });
        } else {
            HwLog.w(TAG, "showFirstInstallRemindDialogNoTitle() customWebViewContext is not Activity");
        }
    }

    private void stopTransfer(final String str, final String str2, final boolean z) {
        String strBuildTaskId;
        String str3 = TAG;
        HwLog.i(str3, "stopTransfer() hiTopId: " + str + ", version: " + str2 + ",tCurrentInstallWatchFaceHiTopId:" + getCurrentInstallWatchFaceHiTopId());
        if (TextUtils.isEmpty(str)) {
            HwLog.w(str3, "stopTransfer, hiTopId is empty.");
            return;
        }
        if (!str.equals(getCurrentInstallWatchFaceHiTopId()) && !n.e().j(str)) {
            dealTaskTransferredOrCanceled(str, str2);
            HwLog.w(str3, "stopTransfer, not current install task");
            return;
        }
        if (getInstance(this.mContext).mVipFreeWatchFaceInfos.containsKey(str)) {
            strBuildTaskId = FilePuller.getInstance(this.mContext).buildTaskId(WatchResourcesInfo.markUpHiTopId(str), str2);
        } else {
            strBuildTaskId = n.e().j(str) ? FilePuller.getInstance(this.mContext).buildTaskId(n.e().i(str), str2) : FilePuller.getInstance(this.mContext).buildTaskId(str, str2);
        }
        HwLog.i(str3, "stopTransfer() taskId: " + strBuildTaskId + ", version: " + str2 + "tCurrentInstallWatchFaceHiTopId:" + getCurrentInstallWatchFaceHiTopId());
        HwDeviceConfigManager.getInstance(this.mContext).a(strBuildTaskId, 1, new IBaseResponseCallback() { // from class: com.huawei.watchface.api.HwWatchFaceManager.14
            @Override // com.huawei.watchface.utils.callback.IBaseResponseCallback
            public void onResponse(int i, Object obj) {
                String str4 = HwWatchFaceManager.TAG;
                HwLog.i(str4, "stopTransfer() response code: " + i + ", cancelTime: " + System.currentTimeMillis());
                if (!(obj instanceof String)) {
                    HwLog.i(str4, "stopTransfer() response objData is not string");
                    return;
                }
                String str5 = (String) obj;
                HwLog.i(str4, "stopTransfer() result: " + str5);
                if (!z) {
                    HwLog.i(str4, "stopTransfer() is not reset");
                    return;
                }
                String[] strArrSplit = str5.split("_");
                HwLog.i(str4, "stopTransfer() result hiTopIdMarkDown: " + strArrSplit[0]);
                String strL = n.e().l(WatchResourcesInfo.markDownHiTopId(strArrSplit[0]));
                HwWatchFaceManager hwWatchFaceManager = HwWatchFaceManager.this;
                hwWatchFaceManager.mIsCanceled = false;
                if (i != 20003) {
                    OperateWatchFaceCallback operateWatchFaceCallback = hwWatchFaceManager.mOperateCallback;
                    if (operateWatchFaceCallback != null && strArrSplit.length >= 2) {
                        operateWatchFaceCallback.transmitCancelInstallWatchFaceResult(strL, strArrSplit[1], 0);
                    }
                    OperateWatchFaceCallback operateWatchFaceCallback2 = HwWatchFaceManager.this.pOperateCallback;
                    if (operateWatchFaceCallback2 == null || strArrSplit.length < 2) {
                        return;
                    }
                    operateWatchFaceCallback2.transmitCancelInstallWatchFaceResult(strL, strArrSplit[1], 0);
                    return;
                }
                Handler handler = hwWatchFaceManager.mHandler;
                if (handler != null) {
                    handler.removeCallbacks(hwWatchFaceManager.mResetInstallState);
                }
                HwWatchFaceManager hwWatchFaceManager2 = HwWatchFaceManager.this;
                hwWatchFaceManager2.mLastPercentage = -1;
                OperateWatchFaceCallback operateWatchFaceCallback3 = hwWatchFaceManager2.mOperateCallback;
                if (operateWatchFaceCallback3 != null && strArrSplit.length >= 2) {
                    operateWatchFaceCallback3.transmitCancelInstallWatchFaceResult(strL, strArrSplit[1], 1);
                }
                OperateWatchFaceCallback operateWatchFaceCallback4 = HwWatchFaceManager.this.pOperateCallback;
                if (operateWatchFaceCallback4 != null && strArrSplit.length >= 2) {
                    operateWatchFaceCallback4.transmitCancelInstallWatchFaceResult(strL, strArrSplit[1], 1);
                }
                HwWatchFaceManager.this.changeInstallState(0);
                HwWatchFaceManager.this.dealTaskTransferredOrCanceled(str, str2);
                if (str.equals(HwWatchFaceManager.this.getCurrentInstallWatchFaceHiTopId())) {
                    HwWatchFaceManager.this.mIsInstallState = false;
                    HwLog.i(str4, "cancelTask, init mInstallState");
                }
                HwWatchFaceManager.this.cancelTask(str, str2);
            }
        });
    }

    private void transmitDeviceConnectState(boolean z, String str) {
        OperateWatchFaceCallback operateWatchFaceCallback = this.mOperateCallback;
        if (operateWatchFaceCallback != null) {
            operateWatchFaceCallback.transmitDeviceConnectState(z, str);
        }
        OperateWatchFaceCallback operateWatchFaceCallback2 = this.pOperateCallback;
        if (operateWatchFaceCallback2 != null) {
            operateWatchFaceCallback2.transmitDeviceConnectState(z, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void transmitInstallResultForH5(String str, String str2, int i) {
        OperateWatchFaceCallback operateWatchFaceCallback = this.mOperateCallback;
        if (operateWatchFaceCallback != null) {
            operateWatchFaceCallback.transmitInstallWatchFaceResult(str, str2, i);
        }
        OperateWatchFaceCallback operateWatchFaceCallback2 = this.pOperateCallback;
        if (operateWatchFaceCallback2 != null) {
            operateWatchFaceCallback2.transmitInstallWatchFaceResult(str, str2, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void transmitInstallResultForH5New(String str, String str2, int i) {
        OperateWatchFaceCallback operateWatchFaceCallback = this.mOperateCallback;
        if (operateWatchFaceCallback != null) {
            operateWatchFaceCallback.transmitInstallWatchFaceResultNew(str, str2, i);
        }
        OperateWatchFaceCallback operateWatchFaceCallback2 = this.pOperateCallback;
        if (operateWatchFaceCallback2 != null) {
            operateWatchFaceCallback2.transmitInstallWatchFaceResultNew(str, str2, i);
        }
    }

    private void transmitSetDefaultWatchFaceResult(IBaseResponseCallback iBaseResponseCallback, int i) {
        if (iBaseResponseCallback != null) {
            iBaseResponseCallback.onResponse(i, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void transmitWatchFaceNames(ArrayList<String> arrayList, HashMap<String, WatchResourcesInfo> map) {
        if (this.mOperateCallback == null) {
            HwLog.w(TAG, "transmitWatchFaceNames, error call is null");
            return;
        }
        if (arrayList == null || map == null) {
            HwLog.w(TAG, "transmitWatchFaceNames, error params is null");
            return;
        }
        HwLog.i(TAG, "transmitWatchFaceNames, watchFaceIdList size:" + arrayList.size() + "watchFaceMap size:" + map.size());
        dealWatchFaceInfoTransmit(map);
    }

    public static void verifyAccountAndPws(Activity activity) {
        HwLog.i(TAG, "verifyAccountAndPws");
        try {
            SafeIntent safeIntent = new SafeIntent(new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse(VERIFY_PASSWORD_URI)));
            safeIntent.setPackage(HMSPackageManager.getInstance(activity).getHMSPackageName());
            if (c2.a(Environment.getApplicationContext()).t()) {
                safeIntent.putExtra(VERIFY_PWD_TYPE, 3);
            } else {
                safeIntent.putExtra(VERIFY_PWD_TYPE, 0);
            }
            safeIntent.putExtra(CLIENT_ID, Environment.a());
            CommonUtils.startActivityForResult(activity, safeIntent, 10011);
        } catch (Exception e) {
            HwLog.e(TAG, "exception verifyAccountAndPws: " + HwLog.printException(e));
        }
    }

    public void addVipFreeWatchFace(String str, WatchResourcesInfo watchResourcesInfo) {
        HashMap<String, WatchResourcesInfo> map = this.mVipFreeWatchFaceInfos;
        if (map == null || watchResourcesInfo == null) {
            return;
        }
        map.put(str, watchResourcesInfo);
    }

    public void applyWatchFace(String str, String str2, int i, String str3, boolean z) {
        applyWatchFace(str, str2, i, str3, 0, z);
    }

    public void cancelInstallWatchFace(String str, String str2) {
        String str3 = TAG;
        HwLog.i(str3, "cancelInstallWatchFace() enter. hiTopId" + str);
        String strD = n.e().d(str);
        setCancelHiTopId(strD);
        if (TextUtils.isEmpty(strD) || TextUtils.isEmpty(str2)) {
            return;
        }
        if (this.mHwDeviceConfigManager != null) {
            cancelInstallWatchFace2(strD, str2);
            z1.c().a(strD, str2);
            return;
        }
        HwLog.w(str3, "cancelInstallWatchFace() error: hwDeviceConfigManager is null");
        OperateWatchFaceCallback operateWatchFaceCallback = this.mOperateCallback;
        if (operateWatchFaceCallback != null) {
            operateWatchFaceCallback.transmitCancelInstallWatchFaceResult(strD, str2, 0);
        }
        OperateWatchFaceCallback operateWatchFaceCallback2 = this.pOperateCallback;
        if (operateWatchFaceCallback2 != null) {
            operateWatchFaceCallback2.transmitCancelInstallWatchFaceResult(strD, str2, 0);
        }
    }

    public void cancelInstallWatchFaceByH5(String str, String str2) {
        String str3 = TAG;
        HwLog.i(str3, "cancelInstallWatchFaceByH5() enter. hiTopId" + str);
        if (this.mHwDeviceConfigManager != null && HwWatchFaceApi.getInstance(Environment.getApplicationContext()).getDeviceConnectState() == 1) {
            cancelInstallWatchFace(str, str2);
            return;
        }
        HwLog.w(str3, "cancelInstallWatchFace() error: hwDeviceConfigManager is null or device is disconnect!");
        OperateWatchFaceCallback operateWatchFaceCallback = this.mOperateCallback;
        if (operateWatchFaceCallback != null) {
            operateWatchFaceCallback.transmitCancelInstallWatchFaceResult(str, str2, 0);
        }
        OperateWatchFaceCallback operateWatchFaceCallback2 = this.pOperateCallback;
        if (operateWatchFaceCallback2 != null) {
            operateWatchFaceCallback2.transmitCancelInstallWatchFaceResult(str, str2, 0);
        }
    }

    public void checkUserPasswordH5(Activity activity, String str) {
        if (activity == null) {
            HwLog.w(TAG, "chkUserPassword activity is null");
            transmitVerityPwsRes("1", "chkUserPassword activity is null");
            return;
        }
        String str2 = TAG;
        HwLog.i(str2, "enter checkUserPassword");
        String accessToken = HwWatchFaceApi.getInstance(this.mContext).getAccessToken();
        String deviceIdForH5 = HwWatchFaceApi.getInstance(this.mContext).getDeviceIdForH5(true);
        if (!TextUtils.isEmpty(accessToken) && !TextUtils.isEmpty(deviceIdForH5)) {
            nmq.c(activity, Utils.SERVICE_HEALTH_CLOUD.concat(HwWatchFaceApi.getInstance(this.mContext).isTestVersion() ? BleConstants.WEIGHT_KEY : ""), accessToken, str, nmm.c("", deviceIdForH5, "", ""), new ResultCallBack() { // from class: com.huawei.watchface.api.HwWatchFaceManager$$ExternalSyntheticLambda2
                @Override // com.huawei.hwidauth.api.ResultCallBack
                public final void onResult(Result result) {
                    this.f$0.lambda$checkUserPasswordH5$14((nmk) result);
                }
            });
        } else {
            HwLog.w(str2, "chkUserPassword accessToken is null");
            transmitVerityPwsRes("1", "chkUserPassword accessToken is null");
        }
    }

    public void clear() {
        HwLog.i(TAG, "clear isStopServices:" + this.isStopServices);
        if (this.isStopServices) {
            FileHelper.a();
            e4.a();
            this.isStopServices = false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x003c  */
    public void dealSetDefaultWatchFaceResponse(int i, boolean z, Object obj, boolean z2) {
        String str;
        String str2;
        String str3 = TAG;
        HwLog.i(str3, "dealSetDefaultWatchFaceResponse() errorCode: " + i + ", isOperationType: " + z);
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.removeCallbacks(this.mResetInstallState);
        }
        if (obj instanceof String) {
            String[] strArrSplit = ((String) obj).split("_");
            if (strArrSplit.length >= 2) {
                str2 = strArrSplit[0];
                str = strArrSplit[1];
            } else {
                str = null;
                str2 = null;
            }
        } else {
            str = null;
            str2 = null;
        }
        if (!TextUtils.isEmpty(this.mCurrentInstallWatchFaceHiTopId) && this.mCurrentInstallWatchFaceHiTopId.equals(str2)) {
            this.mIsInstallState = false;
        }
        if (i != 103) {
            if (i != 104) {
                j2.g().a(str2, str, i);
                if (z) {
                    setCurrentInstallWatchFaceHiTopId(null);
                    setCurrentInstallWatchFaceVersion(null);
                    installWaitInstallWatchFace(str2, str, 0);
                    return;
                }
                return;
            }
            j2.g().a(str2, str, i);
            processApplyFailed(str2, str);
            if (z) {
                setCurrentInstallWatchFaceHiTopId(null);
                setCurrentInstallWatchFaceVersion(null);
                installWaitInstallWatchFace(str2, str, 0);
                return;
            }
            return;
        }
        HwLog.i(str3, "dealSetDefaultWatchFaceResponse success");
        getDeviceAndWatchFaceInfoByBt();
        OperateWatchFaceCallback operateWatchFaceCallback = this.mOperateCallback;
        if (operateWatchFaceCallback != null) {
            if (!z2) {
                operateWatchFaceCallback.transmitSetDefaultWatchFaceResult(str2, str, 1);
            }
            if (!j2.g().l(str2, str)) {
                m4.a(true);
            }
        }
        OperateWatchFaceCallback operateWatchFaceCallback2 = this.pOperateCallback;
        if (operateWatchFaceCallback2 != null && !z2) {
            operateWatchFaceCallback2.transmitSetDefaultWatchFaceResult(str2, str, 1);
        }
        j2.g().a(str2, str, i);
        if (z) {
            setCurrentInstallWatchFaceHiTopId(null);
            setCurrentInstallWatchFaceVersion(null);
            installWaitInstallWatchFace(str2, str, 0);
        }
    }

    public void decryptResult(int i, String str) {
        OperateWatchFaceCallback operateWatchFaceCallback = this.mOperateCallback;
        if (operateWatchFaceCallback == null) {
            return;
        }
        operateWatchFaceCallback.transmitDecryptResult(i, str);
        OperateWatchFaceCallback operateWatchFaceCallback2 = this.pOperateCallback;
        if (operateWatchFaceCallback2 != null) {
            operateWatchFaceCallback2.transmitDecryptResult(i, str);
        }
    }

    public void deleteDesignationWatchFace(String str, String str2, DelectUserDesignationWatchFaceCallback delectUserDesignationWatchFaceCallback) {
        this.mCurrentDeleteHiTopId = str;
        this.mCurrentDeleteVersion = str2;
        this.mDeleteUserDesignationWatchFaceCallback = delectUserDesignationWatchFaceCallback;
        boolean zIsPreWatchFace = isPreWatchFace(str);
        HwLog.i(TAG, "Design isPreWatchFace:" + zIsPreWatchFace);
        deleteWatchFace(zIsPreWatchFace);
    }

    public void deleteWatchFace(String str, String str2) {
        HwLog.i(TAG, "deleteWatchFace has parms");
        this.mCurrentDeleteHiTopId = str;
        this.mCurrentDeleteVersion = str2;
        showDialogNoTitle(DensityUtil.getStringById(R.string.IDS_watchface_delete_prompt), new View.OnClickListener() { // from class: com.huawei.watchface.api.HwWatchFaceManager$$ExternalSyntheticLambda13
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HwLog.i(HwWatchFaceManager.TAG, "deleteWatchFace");
            }
        });
    }

    public void destroy() {
        cancelInstallWatchFace(getCurrentInstallWatchFaceHiTopId(), getCurrentInstallWatchFaceVersion());
        BroadcastReceiver broadcastReceiver = this.mConnectStateChangedReceiver;
        if (broadcastReceiver != null) {
            CommonUtils.a(broadcastReceiver);
        }
        BroadcastReceiver broadcastReceiver2 = this.mBroadcastReceiver;
        if (broadcastReceiver2 != null) {
            CommonUtils.a(broadcastReceiver2);
        }
        if (this.mFileTransferStateCallback != null) {
            this.mFileTransferStateCallback = null;
        }
        if (this.mAppTransferFileResultAIDLCallback != null) {
            this.mAppTransferFileResultAIDLCallback = null;
        }
        if (this.mDeleteUserDesignationWatchFaceCallback != null) {
            this.mDeleteUserDesignationWatchFaceCallback = null;
        }
        z1.c().a();
        destroyInstance();
        HwWatchFaceBtManager.getInstance(this.mContext).destroy();
        f2.a(this.mContext).f();
    }

    public void dismissStartSaveDialog() {
        OperateWatchFaceCallback operateWatchFaceCallback = this.mOperateCallback;
        if (operateWatchFaceCallback != null) {
            operateWatchFaceCallback.hideLoadingDialog();
        }
        OperateWatchFaceCallback operateWatchFaceCallback2 = this.pOperateCallback;
        if (operateWatchFaceCallback2 != null) {
            operateWatchFaceCallback2.hideLoadingDialog();
        }
    }

    public void doDeleteWatchFace() {
        doDeleteWatchFace(this.mCurrentDeleteHiTopId, this.mCurrentDeleteVersion, this.mDeleteMyWatchFaceCallback);
    }

    public void doRefreshUi() {
        if (this.mHwWatchFaceBtManager == null) {
            this.mHwWatchFaceBtManager = HwWatchFaceBtManager.getInstance(this.mContext);
        }
        this.mHwWatchFaceBtManager.getWatchInfoForUi(new IBaseResponseCallback() { // from class: com.huawei.watchface.api.HwWatchFaceManager.7
            @Override // com.huawei.watchface.utils.callback.IBaseResponseCallback
            public void onResponse(int i, Object obj) {
                if (i != 101) {
                    HwLog.w(HwWatchFaceManager.TAG, "doRefreshUi() not CALLBACK_TYPE_SUCCESS");
                } else {
                    HwLog.i(HwWatchFaceManager.TAG, "doRefreshUi() CALLBACK_TYPE_SUCCESS");
                    HwWatchFaceManager.this.transmitWatchInfoChange(1);
                }
            }
        });
    }

    public f getAnalyticsDownloadEvent(InstallWatchFaceBean installWatchFaceBean) {
        f fVar = new f();
        fVar.b(System.currentTimeMillis());
        fVar.j(installWatchFaceBean.getHashCode());
        fVar.g(installWatchFaceBean.getFileUrl());
        fVar.b(installWatchFaceBean.getWatchFaceHiTopId());
        fVar.c(installWatchFaceBean.getVersion());
        fVar.l("2");
        fVar.m(installWatchFaceBean.getTitle());
        fVar.e(installWatchFaceBean.getCnTitle());
        fVar.i(installWatchFaceBean.getFileSize());
        fVar.n(String.valueOf(installWatchFaceBean.getInstallationType()));
        fVar.h(String.valueOf(installWatchFaceBean.getResourceType()));
        fVar.k(String.valueOf(installWatchFaceBean.getProductId()));
        return fVar;
    }

    public String getCancelHiTopId() {
        return this.cancelHiTopId;
    }

    public List<ScreenInfo> getCompatibleInfo() {
        WatchFaceSupportInfo watchFaceSupportInfo = HwWatchFaceBtManager.getInstance(this.mContext).getWatchFaceSupportInfo();
        if (watchFaceSupportInfo == null) {
            HwLog.e(TAG, "getCompatibleInfo() watchFaceSupportInfo is null.");
            return null;
        }
        List<ScreenInfo> compatibleList = watchFaceSupportInfo.getCompatibleList();
        if (ArrayUtils.isEmpty(compatibleList)) {
            HwLog.e(TAG, "getCompatibleInfo() compatibleList is null.");
        }
        return compatibleList;
    }

    public String getCurrentInstallWatchFaceHiTopId() {
        HwLog.i(TAG, "getCurrentInstallWatchFaceHiTopId  =" + this.mCurrentInstallWatchFaceHiTopId);
        return this.mCurrentInstallWatchFaceHiTopId;
    }

    public String getCurrentInstallWatchFaceVersion() {
        return this.mCurrentInstallWatchFaceVersion;
    }

    public String getCurrentTransferWatchFaceHiTopId() {
        return this.mCurrentTransferWatchFaceHiTopId;
    }

    public String getCurrentTransferWatchFaceVersion() {
        return this.mCurrentTransferWatchFaceVersion;
    }

    public void getDeviceAndWatchFaceInfoByBt() {
        String str = TAG;
        HwLog.i(str, "getDeviceAndWatchFaceInfoByBt() enter");
        this.mIsAppSetWatchFace = false;
        if (this.mHwWatchFaceBtManager == null) {
            this.mHwWatchFaceBtManager = HwWatchFaceBtManager.getInstance(this.mContext);
        }
        if (this.mHwWatchFaceBtManager.getConnectWatchDeviceInfo() == null) {
            HwLog.w(str, "getDeviceAndWatchFaceInfoByBt() current Device info is null");
        } else {
            this.mHwWatchFaceBtManager.getWatchInfoForUi(new IBaseResponseCallback() { // from class: com.huawei.watchface.api.HwWatchFaceManager.13
                @Override // com.huawei.watchface.utils.callback.IBaseResponseCallback
                public void onResponse(int i, Object obj) {
                    if (i == 101) {
                        HwWatchFaceManager.this.transmitWatchInfoChange(1);
                        return;
                    }
                    HwLog.w(HwWatchFaceManager.TAG, "getDeviceAndWatchFaceInfoByBt() getWatchInfoForUI error:" + i);
                }
            });
        }
    }

    public void getDeviceInfoByBt(final boolean z) {
        String str = TAG;
        HwLog.i(str, "getDeviceInfoByBt() enter. isDeviceChange：" + z);
        if (this.mHwWatchFaceBtManager == null) {
            this.mHwWatchFaceBtManager = HwWatchFaceBtManager.getInstance(this.mContext);
        }
        if (z) {
            this.mHwWatchFaceBtManager.resetWatchFaceSupportInfoAndWatchFaces();
        }
        if (this.mHwWatchFaceBtManager.getConnectWatchDeviceInfo() != null) {
            this.mHwWatchFaceBtManager.getDeviceInfoForUi(new IBaseResponseCallback() { // from class: com.huawei.watchface.api.HwWatchFaceManager$$ExternalSyntheticLambda11
                @Override // com.huawei.watchface.utils.callback.IBaseResponseCallback
                public final void onResponse(int i, Object obj) {
                    this.f$0.lambda$getDeviceInfoByBt$3(z, i, obj);
                }
            });
        } else {
            HwLog.w(str, "getDeviceInfoByBt() current Device info is null");
        }
    }

    public OperateWatchFaceCallback getOperateCallback() {
        return this.mOperateCallback;
    }

    public String getRandomVersion() {
        StringBuffer stringBuffer = new StringBuffer(1);
        for (int i = 0; i < 3; i++) {
            int iA = r3.a(10) + 1;
            if (i == 2) {
                stringBuffer.append(iA);
                return stringBuffer.toString();
            }
            stringBuffer.append(iA).append(".");
        }
        return stringBuffer.toString();
    }

    public WatchResourcesInfo getVipFreeWatchFace(String str) {
        if (this.mVipFreeWatchFaceInfos == null || TextUtils.isEmpty(str)) {
            return null;
        }
        return this.mVipFreeWatchFaceInfos.get(str);
    }

    public String getWatchFaceIdStore() {
        ArrayList<WatchResourcesInfo> noPresetWatchInfo = HwWatchFaceBtManager.getInstance(this.mContext).getNoPresetWatchInfo();
        StringBuilder sb = new StringBuilder("");
        for (WatchResourcesInfo watchResourcesInfo : noPresetWatchInfo) {
            String watchInfoId = watchResourcesInfo.getWatchInfoId();
            String watchInfoVersion = watchResourcesInfo.getWatchInfoVersion();
            if (watchInfoId != null && watchInfoVersion != null) {
                StringBuffer stringBuffer = new StringBuffer(",");
                stringBuffer.append(watchInfoId);
                stringBuffer.append("_");
                stringBuffer.append(watchInfoVersion);
                sb.append(stringBuffer.toString());
            }
        }
        String string = sb.toString();
        HwLog.i(TAG, "getWatchFaceIdStore result: " + string);
        return string;
    }

    public String getWatchFaceInfo() {
        HwWatchFaceApi hwWatchFaceApi = HwWatchFaceApi.getInstance(this.mContext);
        if (hwWatchFaceApi == null || hwWatchFaceApi.getDeviceConnectState() != 1) {
            return "1";
        }
        String watchFaceScreen = HwWatchFaceBtManager.getInstance(this.mContext).getWatchFaceScreen(true, false);
        String watchFaceMaxVersion = HwWatchFaceBtManager.getInstance(this.mContext).getWatchFaceMaxVersion(true, false);
        if (TextUtils.isEmpty(watchFaceMaxVersion) || TextUtils.isEmpty(watchFaceScreen)) {
            HwLog.w(TAG, "getWatchFaceInfo() themeVersion or screen is empty.");
            HwWatchFaceBtManager.getInstance(this.mContext).getDeviceInfoForUi(new IBaseResponseCallback() { // from class: com.huawei.watchface.api.HwWatchFaceManager$$ExternalSyntheticLambda5
                @Override // com.huawei.watchface.utils.callback.IBaseResponseCallback
                public final void onResponse(int i, Object obj) {
                    this.f$0.lambda$getWatchFaceInfo$4(i, obj);
                }
            });
            return "0";
        }
        if (HwWatchFaceBtManager.getInstance(this.mContext).getWatchFaceSupportInfo() == null) {
            HwLog.w(TAG, "getWatchFaceInfo() getWatchFaceSupportInfo is null");
            HwWatchFaceBtManager.getInstance(this.mContext).getDeviceInfoForUi(new IBaseResponseCallback() { // from class: com.huawei.watchface.api.HwWatchFaceManager$$ExternalSyntheticLambda3
                @Override // com.huawei.watchface.utils.callback.IBaseResponseCallback
                public final void onResponse(int i, Object obj) {
                    this.f$0.lambda$getWatchFaceInfo$5(i, obj);
                }
            });
        }
        int watchfaceMode = HwWatchFaceBtManager.getInstance(this.mContext).getWatchfaceMode();
        String strA = LanguageUtils.a(true);
        String deviceModel = hwWatchFaceApi.getDeviceModel();
        String commonCountryCode = hwWatchFaceApi.getCommonCountryCode();
        String softVersion = hwWatchFaceApi.getSoftVersion();
        String currentWatchFaceId = getCurrentWatchFaceId();
        String preWatchFaceIdStore = getPreWatchFaceIdStore();
        String watchFaceIdStore = getWatchFaceIdStore();
        String strD = n.e().d();
        String deviceName = hwWatchFaceApi.getDeviceName();
        String strK = q0.k();
        boolean zU = CommonUtils.u();
        List<ScreenInfo> compatibleInfo = getCompatibleInfo();
        List<ScreenInfo> purchasedInfo = getPurchasedInfo();
        WatchFaceInfoForH5 watchFaceInfoForH5 = new WatchFaceInfoForH5();
        watchFaceInfoForH5.setFirmware("6.0.1");
        watchFaceInfoForH5.setLocale(strA);
        watchFaceInfoForH5.setScreen(watchFaceScreen);
        watchFaceInfoForH5.setPhoneType(deviceModel);
        watchFaceInfoForH5.setIsoCode(commonCountryCode);
        watchFaceInfoForH5.setBuildNumber(softVersion);
        watchFaceInfoForH5.setFiletype("hwt");
        watchFaceInfoForH5.setThemeVersion(watchFaceMaxVersion);
        watchFaceInfoForH5.setCurrentWatchFaceId(currentWatchFaceId);
        watchFaceInfoForH5.setPreWatchFaceIdStore(preWatchFaceIdStore);
        watchFaceInfoForH5.setWatchFaceIdStore(watchFaceIdStore);
        watchFaceInfoForH5.setHideWatchFaceIdStore(strD);
        watchFaceInfoForH5.setDeviceName(deviceName);
        watchFaceInfoForH5.setAppVersion(strK);
        watchFaceInfoForH5.setHuaweiPhone(zU);
        watchFaceInfoForH5.setCompatibleInfo(compatibleInfo);
        watchFaceInfoForH5.setPurchasedInfo(purchasedInfo);
        watchFaceInfoForH5.setAbilityList(getWatchAbility());
        watchFaceInfoForH5.setPowerLevel(getPowerLevel());
        watchFaceInfoForH5.setDeviceMode(watchfaceMode);
        watchFaceInfoForH5.setAarVersion("10005151");
        final String json = GsonHelper.toJson(watchFaceInfoForH5);
        BackgroundTaskUtils.submit(new Runnable() { // from class: com.huawei.watchface.api.HwWatchFaceManager$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                e4.f("watchface_info_key", k5.c(json, "storagePw"));
            }
        });
        return json;
    }

    public int getWatchFaceInstallState() {
        HwLog.i(TAG, "curInstallState:" + this.mCurrentInstallState);
        return this.mCurrentInstallState;
    }

    public void getWatchFaceNames(String str) {
        String str2 = TAG;
        HwLog.i(str2, "getWatchFaceNames" + str);
        if (str == null) {
            HwLog.w(str2, "watchFaceIds is null");
        } else {
            final ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(SafeString.replace(str, " ", "").split(",")));
            HwWatchFaceBtManager.getInstance(this.mContext).getWatchFaceName(arrayList, this.mContext.getResources().getConfiguration().locale.getLanguage().equals(Locale.CHINA.getLanguage()) ? 2 : 1, new IBaseResponseCallback() { // from class: com.huawei.watchface.api.HwWatchFaceManager.16
                @Override // com.huawei.watchface.utils.callback.IBaseResponseCallback
                public void onResponse(int i, Object obj) {
                    String str3 = HwWatchFaceManager.TAG;
                    HwLog.i(str3, "getWatchFaceName, onResponse:" + i);
                    if (i != 101) {
                        HwLog.w(str3, "getWatchFaceName, onResponse failed");
                        return;
                    }
                    try {
                        HwWatchFaceManager.this.transmitWatchFaceNames(arrayList, CommonUtils.a(obj));
                    } catch (IllegalArgumentException unused) {
                        HwLog.e(HwWatchFaceManager.TAG, "getWatchFaceNames, IllegalArgumentException");
                    }
                }
            });
        }
    }

    public String getWatchFacePath(String str) {
        StringBuffer stringBuffer = new StringBuffer(this.mDownLoadPath);
        stringBuffer.append(str);
        stringBuffer.append(File.separator);
        stringBuffer.append(FlavorConfig.SERVICE_WATCH_FACE);
        return stringBuffer.toString();
    }

    public List<WatchResourcesInfo> getWatchFaceResourcesInfo() {
        return HwWatchFaceBtManager.getInstance(this.mContext).getNoPresetWatchInfo();
    }

    public String getWatchOtherThemeVersion() {
        String watchFaceOtherVersion = HwWatchFaceBtManager.getInstance(this.mContext).getWatchFaceOtherVersion();
        if (TextUtils.isEmpty(watchFaceOtherVersion)) {
            HwLog.e(TAG, "getWatchOtherThemeVersion otherThemeVersion is empty.");
            return "";
        }
        HwLog.i(TAG, "getWatchOtherThemeVersion otherThemeVersion:" + watchFaceOtherVersion);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("otherThemeVersion", watchFaceOtherVersion);
        } catch (JSONException unused) {
            HwLog.e(TAG, "Create WatchFaceInfo Json error");
        }
        return jSONObject.toString();
    }

    public void h5deleteWatchFace(String str, String str2) {
        this.mCurrentDeleteHiTopId = str;
        this.mCurrentDeleteVersion = str2;
        boolean zIsPreWatchFace = isPreWatchFace(str);
        String str3 = TAG;
        HwLog.i(str3, "deleteWatchFace isPreWatchFace:" + zIsPreWatchFace);
        if (!this.mIsBtConnect) {
            HwLog.d(str3, "bluetooth not connected");
            return;
        }
        if (zIsPreWatchFace) {
            HwLog.d(str3, "preWatchFace is not delete");
            return;
        }
        if (str == null || str2 == null) {
            HwLog.w(str3, "doDeleteWatchFace() failed: current id or version is null");
            return;
        }
        WatchResourcesInfo watchResourcesInfo = new WatchResourcesInfo();
        watchResourcesInfo.setWatchInfoId(str);
        watchResourcesInfo.setVipFreeWatchFace(HwWatchFaceBtManager.getInstance(Environment.getApplicationContext()).getVipFreeFromCache(str));
        watchResourcesInfo.setWatchInfoVersion(str2);
        this.mHwWatchFaceBtManager.operateDevice(watchResourcesInfo, 2, this.mDeleteMyWatchFaceCallback);
    }

    public void init() {
        HwLog.i(TAG, "init enter.");
        f2.a(this.mContext).a(false);
        g2.b().e();
    }

    public void installWatchFace(InstallWatchFaceBean installWatchFaceBean) {
        if (installWatchFaceBean == null) {
            HwLog.i(TAG, "installWatchFace installWatchFaceBean is null.");
            return;
        }
        String str = TAG;
        HwLog.i(str, "installWatchFace enter.");
        if (getCancelHiTopId() != null) {
            setCancelHiTopId(null);
        }
        f2.a(this.mContext).s();
        if (!isBtConnect()) {
            transmitDeviceConnectState(false, DensityUtil.getStringById(R.string.wearable_device_is_not_connected_notice));
            OperateWatchFaceCallback operateWatchFaceCallback = this.mOperateCallback;
            if (operateWatchFaceCallback != null) {
                operateWatchFaceCallback.transmitDownloadWatchFaceResult(installWatchFaceBean.getWatchFaceHiTopId(), installWatchFaceBean.getVersion(), 2);
            }
            OperateWatchFaceCallback operateWatchFaceCallback2 = this.pOperateCallback;
            if (operateWatchFaceCallback2 != null) {
                operateWatchFaceCallback2.transmitDownloadWatchFaceResult(installWatchFaceBean.getWatchFaceHiTopId(), installWatchFaceBean.getVersion(), 2);
            }
            HwLog.w(str, "installWatchFace, failed: Bluetooth not connected");
            return;
        }
        if (this.mOperateCallback == null) {
            HwLog.e(str, "installWatchFace mOperateCallback is null");
            return;
        }
        if (!CommonUtils.C()) {
            showToast(DensityUtil.getStringById(R.string.IDS_confirm_network_whether_connected));
            OperateWatchFaceCallback operateWatchFaceCallback3 = this.mOperateCallback;
            if (operateWatchFaceCallback3 != null) {
                operateWatchFaceCallback3.transmitDownloadWatchFaceResult(installWatchFaceBean.getWatchFaceHiTopId(), installWatchFaceBean.getVersion(), 2);
            }
            OperateWatchFaceCallback operateWatchFaceCallback4 = this.pOperateCallback;
            if (operateWatchFaceCallback4 != null) {
                operateWatchFaceCallback4.transmitDownloadWatchFaceResult(installWatchFaceBean.getWatchFaceHiTopId(), installWatchFaceBean.getVersion(), 2);
            }
            HwLog.w(str, "installWatchFace, failed: Network not connected");
            return;
        }
        if (!HwWatchFaceApi.getInstance(this.mContext).isLogin() || !HwWatchFaceApi.getInstance(this.mContext).isLoginParamSuitable()) {
            HwLog.i(str, "installWatchFace, not login");
            OperateWatchFaceCallback operateWatchFaceCallback5 = this.mOperateCallback;
            if (operateWatchFaceCallback5 != null) {
                h2.a(operateWatchFaceCallback5.getCustomWebViewContext()).a(1, installWatchFaceBean);
            }
            OperateWatchFaceCallback operateWatchFaceCallback6 = this.pOperateCallback;
            if (operateWatchFaceCallback6 != null) {
                h2.a(operateWatchFaceCallback6.getCustomWebViewContext()).a(1, installWatchFaceBean);
                return;
            }
            return;
        }
        if (!this.mUpdateMap.containsKey(installWatchFaceBean.getWatchFaceHiTopId()) && installWatchFaceBean.isUpdate()) {
            this.mUpdateMap.put(installWatchFaceBean.getWatchFaceHiTopId(), Boolean.TRUE);
        }
        if (!this.mIsFirstGprsInstallWatchFace || CommonUtils.d(this.mContext) == 1 || installWatchFaceBean.isOneClick()) {
            downloadWatchFace(installWatchFaceBean);
        } else {
            firstInstallRemind(installWatchFaceBean);
        }
    }

    public boolean isBtConnect() {
        return this.mIsBtConnect;
    }

    public boolean isCanceled() {
        return this.mIsCanceled;
    }

    public boolean isFindInMemberExpirationWatchFaces(String str) {
        if (this.mHwWatchFaceBtManager == null) {
            Context context = this.mContext;
            if (context == null) {
                HwLog.i(TAG, "transmitInstallResultForMemberSignature mContext is null");
                return false;
            }
            this.mHwWatchFaceBtManager = HwWatchFaceBtManager.getInstance(context);
        }
        for (WatchResourcesInfo watchResourcesInfo : this.mHwWatchFaceBtManager.getMemberExpirationWatchFaces()) {
            if (watchResourcesInfo != null && TextUtils.equals(watchResourcesInfo.getWatchInfoId(), str)) {
                return true;
            }
        }
        return false;
    }

    public boolean isPreWatchFace(String str) {
        String preWatchFaceIdStore = getPreWatchFaceIdStore();
        if (!TextUtils.isEmpty(preWatchFaceIdStore) && !TextUtils.isEmpty(str)) {
            return preWatchFaceIdStore.contains(str);
        }
        HwLog.i(TAG, "isPreWatchFace() preWatchFace or hiTopId is null");
        return false;
    }

    public boolean isVipFreeWatchFaceContain(String str) {
        if (this.mVipFreeWatchFaceInfos == null || TextUtils.isEmpty(str)) {
            return false;
        }
        return this.mVipFreeWatchFaceInfos.containsKey(str);
    }

    public void notifyBackgroundChange(boolean z) {
        OperateWatchFaceCallback operateWatchFaceCallback = this.mOperateCallback;
        if (operateWatchFaceCallback != null) {
            operateWatchFaceCallback.notifyBackgroundChange(z);
        }
        OperateWatchFaceCallback operateWatchFaceCallback2 = this.pOperateCallback;
        if (operateWatchFaceCallback2 != null) {
            operateWatchFaceCallback2.notifyBackgroundChange(z);
        }
    }

    public void notifyCurrentWatchfaceIsVipFree(String str, String str2) {
        if (!TextUtils.equals(e5.c().e(), "2")) {
            HwLog.i(TAG, "notifyCurrentWatchfaceIsVipFree memberStatus is not 2");
            return;
        }
        OperateWatchFaceCallback operateWatchFaceCallback = this.mOperateCallback;
        if (operateWatchFaceCallback != null) {
            operateWatchFaceCallback.notifyCurrentWatchfaceIsVipFree(str, str2);
        }
        OperateWatchFaceCallback operateWatchFaceCallback2 = this.pOperateCallback;
        if (operateWatchFaceCallback2 != null) {
            operateWatchFaceCallback2.notifyCurrentWatchfaceIsVipFree(str, str2);
        }
    }

    public void notifyGetShortCutIsCreate() {
        OperateWatchFaceCallback operateWatchFaceCallback = this.mOperateCallback;
        if (operateWatchFaceCallback != null) {
            operateWatchFaceCallback.notifyGetShortCutIsCreate();
        }
        OperateWatchFaceCallback operateWatchFaceCallback2 = this.pOperateCallback;
        if (operateWatchFaceCallback2 != null) {
            operateWatchFaceCallback2.notifyGetShortCutIsCreate();
        }
    }

    public void notifyGetWatchfaceStore() {
        OperateWatchFaceCallback operateWatchFaceCallback = this.mOperateCallback;
        if (operateWatchFaceCallback != null) {
            operateWatchFaceCallback.notifyGetWatchfaceStore();
        }
        OperateWatchFaceCallback operateWatchFaceCallback2 = this.pOperateCallback;
        if (operateWatchFaceCallback2 != null) {
            operateWatchFaceCallback2.notifyGetWatchfaceStore();
        }
    }

    public void notifyH5DeviceIsBreak() {
        transmitDeviceConnectState(false, DensityUtil.getStringById(R.string.wearable_device_is_not_connected_notice));
    }

    public void notifyKaleidoscopePackageName(String str) {
        OperateWatchFaceCallback operateWatchFaceCallback = this.mOperateCallback;
        if (operateWatchFaceCallback != null) {
            operateWatchFaceCallback.notifyKaleidoscopePackageName(str);
        }
        OperateWatchFaceCallback operateWatchFaceCallback2 = this.pOperateCallback;
        if (operateWatchFaceCallback2 != null) {
            operateWatchFaceCallback2.notifyKaleidoscopePackageName(str);
        }
    }

    public void notifyPhotoPackageName(String str) {
        OperateWatchFaceCallback operateWatchFaceCallback = this.mOperateCallback;
        if (operateWatchFaceCallback != null) {
            operateWatchFaceCallback.notifyPhotoPackageName(str);
        }
        OperateWatchFaceCallback operateWatchFaceCallback2 = this.pOperateCallback;
        if (operateWatchFaceCallback2 != null) {
            operateWatchFaceCallback2.notifyPhotoPackageName(str);
        }
    }

    public void notifyTryOutWatchFacePaid(String str, String str2, IBaseResponseCallback iBaseResponseCallback) {
        HwLog.i(TAG, "notifyTryOutWatchFacePaid() enter.");
        notifyDeviceTryOutOperate(str, str2, 7, iBaseResponseCallback);
    }

    public void notifyTryoutWatchFaceFinish(String str, String str2, IBaseResponseCallback iBaseResponseCallback) {
        HwLog.i(TAG, "notifyTryoutWatchFaceFinish() enter.");
        notifyDeviceTryOutOperate(str, str2, 6, iBaseResponseCallback);
    }

    public void notifyVideoAlbumPackageName(String str) {
        OperateWatchFaceCallback operateWatchFaceCallback = this.mOperateCallback;
        if (operateWatchFaceCallback != null) {
            operateWatchFaceCallback.notifyVideoAlbumPackageName(str);
        }
        OperateWatchFaceCallback operateWatchFaceCallback2 = this.pOperateCallback;
        if (operateWatchFaceCallback2 != null) {
            operateWatchFaceCallback2.notifyVideoAlbumPackageName(str);
        }
    }

    public void notifyWearAlbumPackageName(String str) {
        OperateWatchFaceCallback operateWatchFaceCallback = this.mOperateCallback;
        if (operateWatchFaceCallback != null) {
            operateWatchFaceCallback.notifyWearAlbumPackageName(str);
        }
        OperateWatchFaceCallback operateWatchFaceCallback2 = this.pOperateCallback;
        if (operateWatchFaceCallback2 != null) {
            operateWatchFaceCallback2.notifyWearAlbumPackageName(str);
        }
    }

    public void operateMemberSignature(int i, String str, IBaseResponseCallback iBaseResponseCallback) {
        String str2 = TAG;
        HwLog.i(str2, "operateMemberSignature() enter ");
        if (!this.mIsBtConnect) {
            transmitDeviceConnectState(false, DensityUtil.getStringById(R.string.wearable_device_is_not_connected_notice));
            HwLog.i(str2, "operateMemberSignature() bluetooth not connected");
            return;
        }
        WatchResourcesInfo watchResourcesInfo = new WatchResourcesInfo();
        watchResourcesInfo.setWatchInfoId("00");
        watchResourcesInfo.setWatchInfoVersion("00");
        if (!TextUtils.isEmpty(str)) {
            watchResourcesInfo.setMemberSignature(str);
        }
        HwWatchFaceBtManager hwWatchFaceBtManager = this.mHwWatchFaceBtManager;
        if (iBaseResponseCallback == null) {
            iBaseResponseCallback = this.memberSignatureCallback;
        }
        hwWatchFaceBtManager.operateDevice(watchResourcesInfo, i, iBaseResponseCallback);
    }

    public void processDeleteFailed(String str, String str2) {
        String str3 = TAG;
        HwLog.i(str3, "processDeleteFailed() enter. id: " + str + ", version: " + str2);
        showToast(DensityUtil.getStringById(R.string.delete_fail));
        if (str == null || str2 == null) {
            HwLog.w(str3, "processDeleteFailed() error: id or version is null");
            return;
        }
        OperateWatchFaceCallback operateWatchFaceCallback = this.mOperateCallback;
        if (operateWatchFaceCallback != null) {
            operateWatchFaceCallback.transmitDeleteWatchFaceResult(str, str2, 0);
        }
        OperateWatchFaceCallback operateWatchFaceCallback2 = this.pOperateCallback;
        if (operateWatchFaceCallback2 != null) {
            operateWatchFaceCallback2.transmitDeleteWatchFaceResult(str, str2, 0);
        }
    }

    public void removeVipFreeWatchFace(String str) {
        HashMap<String, WatchResourcesInfo> map;
        HwLog.i(TAG, "removeVipFreeWatchFace -- key is " + str);
        if (TextUtils.isEmpty(str) || (map = this.mVipFreeWatchFaceInfos) == null) {
            return;
        }
        map.remove(str);
    }

    public void saveSuccess() {
        OperateWatchFaceCallback operateWatchFaceCallback = this.mOperateCallback;
        if (operateWatchFaceCallback != null) {
            operateWatchFaceCallback.saveSuccessComeback();
        }
        OperateWatchFaceCallback operateWatchFaceCallback2 = this.pOperateCallback;
        if (operateWatchFaceCallback2 != null) {
            operateWatchFaceCallback2.saveSuccessComeback();
        }
    }

    public void setCancelHiTopId(String str) {
        this.cancelHiTopId = str;
    }

    public void setCurrentDeviceName(String str) {
        this.mCurrentDeviceName = str;
    }

    public void setCurrentInstallWatchFaceHiTopId(String str) {
        String str2 = TAG;
        HwLog.i(str2, "setCurrentInstallWatchFaceHiTopId currentInstallWatchFaceHiTopId =" + str);
        this.mCurrentInstallWatchFaceHiTopId = WatchResourcesInfo.markDownHiTopId(str);
        HwLog.i(str2, "setCurrentInstallWatchFaceHiTopId hitopid =" + this.mCurrentInstallWatchFaceHiTopId);
    }

    public void setCurrentInstallWatchFaceVersion(String str) {
        this.mCurrentInstallWatchFaceVersion = str;
    }

    public void setCurrentTransferWatchFaceHiTopId(String str) {
        this.mCurrentTransferWatchFaceHiTopId = WatchResourcesInfo.markDownHiTopId(str);
        HwLog.i(TAG, "setCurrentTransferWatchFaceHiTopId hitopid =" + this.mCurrentInstallWatchFaceHiTopId);
    }

    public void setCurrentTransferWatchFaceVersion(String str) {
        this.mCurrentTransferWatchFaceVersion = str;
    }

    public void setDefaultWatchFace(String str, String str2, String str3, IBaseResponseCallback iBaseResponseCallback) {
        if (TextUtils.equals(str, j2.g().j())) {
            HwLog.i(TAG, "setDefaultWatchFace -- current id is try out id.Not apply");
            transmitSetDefaultWatchFaceResult(iBaseResponseCallback, 104);
            return;
        }
        j2.g().c(str, str2);
        if (n.e().a(str, str2, str3)) {
            transmitSetDefaultWatchFaceResult(iBaseResponseCallback, 104);
        } else {
            setDefaultWatchFace(str, str2, str3, false, iBaseResponseCallback);
        }
    }

    public void setIsBtConnect(boolean z) {
        this.mIsBtConnect = z;
    }

    public void setIsCanceled(boolean z) {
        this.mIsCanceled = z;
    }

    public void setLastPercentage(int i) {
        this.mLastPercentage = i;
    }

    public void setWatchFaceCallback(OperateWatchFaceCallback operateWatchFaceCallback, boolean z) {
        if (z) {
            this.mOperateCallback = operateWatchFaceCallback;
            this.pOperateCallback = null;
        } else {
            this.pOperateCallback = operateWatchFaceCallback;
        }
        f2.a(this.mContext).a(operateWatchFaceCallback, z);
        if (operateWatchFaceCallback != null) {
            h2.a(operateWatchFaceCallback.getCustomWebViewContext()).a(operateWatchFaceCallback);
        }
    }

    public void setWatchFaceDeleteId(String str, String str2) {
        this.mCurrentDeleteVersion = str2;
        String str3 = TAG;
        HwLog.i(str3, "setWatchFaceDeleteId, delete hiTopId:" + str);
        if (TextUtils.isEmpty(str) || !str.contains("_")) {
            this.mCurrentDeleteHiTopId = str;
            this.mCurrentDeleteName = "";
        } else {
            String[] strArrSplit = str.split("_");
            if (strArrSplit.length >= 2) {
                this.mCurrentDeleteName = strArrSplit[1];
            } else {
                this.mCurrentDeleteName = "";
            }
            this.mCurrentDeleteHiTopId = strArrSplit[0];
            HwLog.i(str3, "setWatchFaceDeleteId, delete hiTopId and name:" + this.mCurrentDeleteHiTopId + this.mCurrentDeleteName);
        }
        HwLog.i(str3, "setWatchFaceDeleteId, hiTopId:" + str + "currentInstallHiTopId:" + this.mCurrentInstallWatchFaceHiTopId);
    }

    public void showInstallProgress(int i, Activity activity) {
        if (activity == null) {
            HwLog.w(TAG, "showInstallProgress() activity is null");
            return;
        }
        String str = TAG;
        HwLog.i(str, "showInstallProgress() is canceled: " + this.mIsCanceled);
        if (this.mIsCanceled) {
            return;
        }
        if (i == 0) {
            this.mIsDesignerInstall = true;
        }
        i0 i0Var = this.mProgressDialog;
        if (i0Var != null && i0Var.isShowing() && this.mProgressBuilder != null) {
            HwLog.i(str, "showInstallProgress() setProgress: " + i);
            this.mProgressBuilder.a(i);
            this.mProgressBuilder.b(CommonUtils.a((double) i, 2, 0));
            return;
        }
        HwLog.i(str, "showInstallProgress() startShowDialog Time: " + System.currentTimeMillis());
        this.mProgressDialog = new i0(activity);
        i0.a aVar = new i0.a(activity);
        this.mProgressBuilder = aVar;
        aVar.a(DensityUtil.getStringById(R.string.watch_face_installing)).a(new View.OnClickListener() { // from class: com.huawei.watchface.api.HwWatchFaceManager.12
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                HwWatchFaceManager hwWatchFaceManager = HwWatchFaceManager.this;
                hwWatchFaceManager.mIsCanceled = true;
                hwWatchFaceManager.mIsDesignerInstall = false;
                i0 i0Var2 = hwWatchFaceManager.mProgressDialog;
                if (i0Var2 != null) {
                    i0Var2.dismiss();
                    HwWatchFaceManager.this.mProgressDialog = null;
                }
                HwWatchFaceManager hwWatchFaceManager2 = HwWatchFaceManager.this;
                hwWatchFaceManager2.cancelInstallWatchFace(hwWatchFaceManager2.getCurrentInstallWatchFaceHiTopId(), HwWatchFaceManager.this.getCurrentInstallWatchFaceVersion());
            }
        });
        this.mProgressDialog = this.mProgressBuilder.a();
        HwLog.i(str, "showInstallProgress() create dialog");
        this.mProgressDialog.setCancelable(false);
        this.mProgressDialog.setCanceledOnTouchOutside(false);
        this.mProgressBuilder.a(0);
        this.mProgressBuilder.b(CommonUtils.a(0.0d, 2, 0));
        this.mProgressDialog.show();
        HwLog.i(str, "showInstallProgress() mProgressDialog is show");
    }

    public void showToast(String str) {
        if (TextUtils.isEmpty(str)) {
            HwLog.w(TAG, "content is null");
            return;
        }
        if (str.equals(DensityUtil.getStringById(R.string.wearable_device_is_not_connected_notice)) || str.equals(DensityUtil.getStringById(R.string.IDS_watchface_device_no_connect))) {
            OperateWatchFaceCallback operateWatchFaceCallback = this.mOperateCallback;
            if (operateWatchFaceCallback != null) {
                operateWatchFaceCallback.transmitDeviceConnectState(false, str);
            }
            OperateWatchFaceCallback operateWatchFaceCallback2 = this.pOperateCallback;
            if (operateWatchFaceCallback2 != null) {
                operateWatchFaceCallback2.transmitDeviceConnectState(false, str);
                return;
            }
            return;
        }
        OperateWatchFaceCallback operateWatchFaceCallback3 = this.mOperateCallback;
        if (operateWatchFaceCallback3 == null) {
            HwLog.w(TAG, "showToast, operateWatchFaceCallback is null");
            return;
        }
        operateWatchFaceCallback3.showToast(str);
        OperateWatchFaceCallback operateWatchFaceCallback4 = this.pOperateCallback;
        if (operateWatchFaceCallback4 != null) {
            operateWatchFaceCallback4.showToast(str);
        }
    }

    public void startSaveDialog() {
        this.mOperateCallback.showLoadingDialog(DensityUtil.getStringById(R.string.saving));
        OperateWatchFaceCallback operateWatchFaceCallback = this.pOperateCallback;
        if (operateWatchFaceCallback != null) {
            operateWatchFaceCallback.showLoadingDialog(DensityUtil.getStringById(R.string.saving));
        }
    }

    public void stopService(String str, Activity activity) {
        String str2 = TAG;
        HwLog.i(str2, "stopService type:" + str);
        if (TextUtils.equals(str, "1")) {
            passwordVerification(activity);
            return;
        }
        if (!TextUtils.equals(str, "2")) {
            HwLog.i(str2, "stopService type is unkwon");
            return;
        }
        this.isStopServices = true;
        if (activity != null) {
            activity.finish();
        }
    }

    public void toNotifyWatchfaceModeChange() {
        int iA = e4.a("device_connect_mode", -1);
        OperateWatchFaceCallback operateWatchFaceCallback = this.mOperateCallback;
        if (operateWatchFaceCallback != null) {
            operateWatchFaceCallback.notifyWatchfaceModeChange(iA);
        }
        OperateWatchFaceCallback operateWatchFaceCallback2 = this.pOperateCallback;
        if (operateWatchFaceCallback2 != null) {
            operateWatchFaceCallback2.notifyWatchfaceModeChange(iA);
        }
    }

    public void transferFile(final String str, final String str2, final int i) {
        changeInstallState(3);
        if (this.mHwDeviceConfigManager != null) {
            ThreadPoolManager.getInstance().tagExecute(TAG, new Runnable() { // from class: com.huawei.watchface.api.HwWatchFaceManager.11
                @Override // java.lang.Runnable
                public void run() {
                    HwDeviceConfigManager hwDeviceConfigManager = HwDeviceConfigManager.getInstance(HwWatchFaceManager.this.mContext);
                    String str3 = str;
                    String str4 = str2;
                    int i2 = i;
                    HwWatchFaceManager hwWatchFaceManager = HwWatchFaceManager.this;
                    hwDeviceConfigManager.a(str3, str4, i2, hwWatchFaceManager.mFileTransferStateCallback, hwWatchFaceManager.mAppTransferFileResultAIDLCallback);
                }
            });
        } else {
            HwLog.w(TAG, "transferFile() mHwDeviceConfigManager is null.");
        }
    }

    public void transmitDialRecycleResult(String str, String str2, String str3) {
        String str4 = TAG;
        HwLog.i(str4, "transmitDialRecycleResult() enter. id: " + str + ", version: " + str2);
        if (str == null || str2 == null) {
            HwLog.w(str4, "transmitDialRecycleResult() error: id or version is null");
            return;
        }
        OperateWatchFaceCallback operateWatchFaceCallback = this.mOperateCallback;
        if (operateWatchFaceCallback != null) {
            operateWatchFaceCallback.transmitDialRecycleResult(str, str2, str3);
        }
        OperateWatchFaceCallback operateWatchFaceCallback2 = this.pOperateCallback;
        if (operateWatchFaceCallback2 != null) {
            operateWatchFaceCallback2.transmitDialRecycleResult(str, str2, str3);
        }
    }

    public void transmitLocalWatchInfoChange(int i) {
        String str = TAG;
        HwLog.i(str, "transmitWatchInfoChange() installState: " + i);
        if (HwWatchFaceApi.getInstance(Environment.getApplicationContext()).getDeviceConnectState() != 1) {
            HwLog.e(str, "transmitWatchInfoChange() current connect is error ");
            return;
        }
        OperateWatchFaceCallback operateWatchFaceCallback = this.mOperateCallback;
        if (operateWatchFaceCallback != null) {
            operateWatchFaceCallback.transmitLocalWatchInfoChange(i);
        }
        OperateWatchFaceCallback operateWatchFaceCallback2 = this.pOperateCallback;
        if (operateWatchFaceCallback2 != null) {
            operateWatchFaceCallback2.transmitLocalWatchInfoChange(i);
        }
    }

    public void transmitMembershipDialogStatus() {
        HwLog.i(TAG, "transmitMembershipDialogStatus()");
        OperateWatchFaceCallback operateWatchFaceCallback = this.mOperateCallback;
        if (operateWatchFaceCallback != null) {
            operateWatchFaceCallback.transmitMembershipDialogStatus();
        }
        OperateWatchFaceCallback operateWatchFaceCallback2 = this.pOperateCallback;
        if (operateWatchFaceCallback2 != null) {
            operateWatchFaceCallback2.transmitMembershipDialogStatus();
        }
    }

    public void transmitRefreshPullData() {
        OperateWatchFaceCallback operateWatchFaceCallback = this.pOperateCallback;
        if (operateWatchFaceCallback != null) {
            operateWatchFaceCallback.transmitRefreshPullData();
        }
        OperateWatchFaceCallback operateWatchFaceCallback2 = this.mOperateCallback;
        if (operateWatchFaceCallback2 != null) {
            operateWatchFaceCallback2.transmitRefreshPullData();
        } else {
            HwLog.i(TAG, "transmitRefreshPullData -- mOperateCallback is null");
        }
    }

    public void transmitVerityPwsRes(String str, String str2) {
        OperateWatchFaceCallback operateWatchFaceCallback = this.mOperateCallback;
        if (operateWatchFaceCallback != null) {
            operateWatchFaceCallback.transmitVerityPwsRes(str, str2);
        }
        OperateWatchFaceCallback operateWatchFaceCallback2 = this.pOperateCallback;
        if (operateWatchFaceCallback2 != null) {
            operateWatchFaceCallback2.transmitVerityPwsRes(str, str2);
        }
    }

    public void transmitWatchInfoChange(int i) {
        String str = TAG;
        HwLog.i(str, "transmitWatchInfoChange() installState: " + i);
        if (HwWatchFaceApi.getInstance(Environment.getApplicationContext()).getDeviceConnectState() != 1) {
            HwLog.e(str, "transmitWatchInfoChange() current connect is error ");
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (Math.abs(jCurrentTimeMillis - this.mLastTransmitWatchInfoChange) < 500) {
            HwLog.w(str, "transmitWatchInfoChange() error:Short time interval");
            return;
        }
        OperateWatchFaceCallback operateWatchFaceCallback = this.mOperateCallback;
        if (operateWatchFaceCallback != null) {
            operateWatchFaceCallback.transmitWatchInfoChange(i);
            this.mLastTransmitWatchInfoChange = jCurrentTimeMillis;
        }
        OperateWatchFaceCallback operateWatchFaceCallback2 = this.pOperateCallback;
        if (operateWatchFaceCallback2 != null) {
            operateWatchFaceCallback2.transmitWatchInfoChange(i);
        }
    }

    public void applyWatchFace(String str, String str2, int i, String str3, int i2, boolean z) {
        applyWatchFace(str, str2, i, str3, HwWatchFaceBtManager.getInstance(Environment.getApplicationContext()).getVipFreeFromCache(str), i2, z);
    }

    public void doDeleteWatchFace(String str, String str2, IBaseResponseCallback iBaseResponseCallback) {
        String str3 = TAG;
        HwLog.i(str3, "doDeleteWatchFace() enter hitopid=" + str + ",version=" + str2);
        if (!this.mIsBtConnect) {
            transmitDeviceConnectState(false, DensityUtil.getStringById(R.string.wearable_device_is_not_connected_notice));
            HwLog.i(str3, "doDeleteWatchFace() bluetooth not connected");
            iBaseResponseCallback.onResponse(IntegerUtils.a("2"), null);
        } else {
            if (str == null || str2 == null) {
                HwLog.w(str3, "doDeleteWatchFace() failed: current id or version is null");
                iBaseResponseCallback.onResponse(104, null);
                return;
            }
            WatchResourcesInfo watchResourcesInfo = new WatchResourcesInfo();
            watchResourcesInfo.setWatchInfoId(str);
            watchResourcesInfo.setVipFreeWatchFace(HwWatchFaceBtManager.getInstance(Environment.getApplicationContext()).getVipFreeFromCache(str));
            watchResourcesInfo.setWatchInfoVersion(str2);
            this.mHwWatchFaceBtManager.operateDevice(watchResourcesInfo, 2, iBaseResponseCallback);
        }
    }

    public String getCurrentWatchFaceId() {
        String string;
        WatchResourcesInfo currentWatchFace = HwWatchFaceBtManager.getInstance(this.mContext).getCurrentWatchFace();
        String watchInfoId = currentWatchFace.getWatchInfoId();
        String watchInfoVersion = currentWatchFace.getWatchInfoVersion();
        if (watchInfoId == null || watchInfoVersion == null) {
            string = "";
        } else {
            StringBuffer stringBuffer = new StringBuffer(watchInfoId);
            stringBuffer.append("_");
            stringBuffer.append(watchInfoVersion);
            string = stringBuffer.toString();
        }
        HwLog.i(TAG, "getCurrentWatchFaceId() result: " + string);
        return string;
    }

    public String getMemberExpiredWatchFaceIdStore() {
        if (this.mHwWatchFaceBtManager == null) {
            this.mHwWatchFaceBtManager = HwWatchFaceBtManager.getInstance(this.mContext);
        }
        ArrayList<WatchResourcesInfo> memberExpirationWatchFaces = this.mHwWatchFaceBtManager.getMemberExpirationWatchFaces();
        if (ArrayUtils.isEmpty(memberExpirationWatchFaces)) {
            HwLog.i(TAG, "getMemberExpiredWatchFaceIdStore watchResourcesInfoList is empty");
            return "";
        }
        StringBuilder sb = new StringBuilder("");
        for (WatchResourcesInfo watchResourcesInfo : memberExpirationWatchFaces) {
            String watchInfoId = watchResourcesInfo.getWatchInfoId();
            String watchInfoVersion = watchResourcesInfo.getWatchInfoVersion();
            if (watchInfoId != null && watchInfoVersion != null) {
                StringBuffer stringBuffer = new StringBuffer(",");
                stringBuffer.append(watchInfoId);
                stringBuffer.append("_");
                stringBuffer.append(watchInfoVersion);
                sb.append(stringBuffer);
            }
        }
        return sb.toString();
    }

    public String getPreWatchFaceIdStore() {
        if (this.mHwWatchFaceBtManager == null) {
            this.mHwWatchFaceBtManager = HwWatchFaceBtManager.getInstance(this.mContext);
        }
        ArrayList<WatchResourcesInfo> presetWatchInfo = this.mHwWatchFaceBtManager.getPresetWatchInfo();
        StringBuilder sb = new StringBuilder("");
        for (WatchResourcesInfo watchResourcesInfo : presetWatchInfo) {
            String watchInfoId = watchResourcesInfo.getWatchInfoId();
            String watchInfoVersion = watchResourcesInfo.getWatchInfoVersion();
            if (watchInfoId != null && watchInfoVersion != null) {
                StringBuffer stringBuffer = new StringBuffer(",");
                stringBuffer.append(watchInfoId);
                stringBuffer.append("_");
                stringBuffer.append(watchInfoVersion);
                sb.append(stringBuffer.toString());
            }
        }
        String string = sb.toString();
        HwLog.i(TAG, "getPreWatchFaceIdStore return:" + string);
        return string;
    }

    public String getWatchThemeVersion() {
        if (this.mHwWatchFaceBtManager == null) {
            this.mHwWatchFaceBtManager = HwWatchFaceBtManager.getInstance(this.mContext);
        }
        String watchFaceMaxVersion = "";
        if (this.mHwWatchFaceBtManager.getConnectWatchDeviceInfo() == null) {
            HwLog.w(TAG, "getWatchThemeVersion, current Device info is null");
            return "";
        }
        WatchFaceSupportInfo watchFaceSupportInfo = this.mHwWatchFaceBtManager.getWatchFaceSupportInfo();
        if (watchFaceSupportInfo != null && watchFaceSupportInfo.getWatchFaceMaxVersion() != null) {
            watchFaceMaxVersion = watchFaceSupportInfo.getWatchFaceMaxVersion();
        }
        HwLog.i(TAG, "getWatchThemeVersion, return:" + watchFaceMaxVersion);
        return watchFaceMaxVersion;
    }

    private void thirdVerifyAccount(Activity activity) {
        String str;
        if (!c2.a(Environment.getApplicationContext()).t()) {
            str = "0";
        } else {
            str = "1";
        }
        checkUserPasswordH5(activity, str);
    }

    public void applyWatchFace(String str, String str2, int i, String str3, boolean z, int i2, final boolean z2) {
        String str4 = TAG;
        HwLog.i(str4, "applyWatchFace() hiTopId: " + str + ", version: " + str2 + ", installState: " + i + ", mIsInstallState: " + this.mIsInstallState + ", watchScreen: " + str3 + ", isVipFreeWatchFace: " + z + ", installationType: " + i2 + ", isSendWatchfaceSignature: " + z2);
        if (getCancelHiTopId() != null) {
            setCancelHiTopId(null);
        }
        String strB = n.e().b(str);
        if (!TextUtils.isEmpty(str3)) {
            this.mWatchScreenMap.put(strB, str3);
        }
        String strBuildTaskId = FilePuller.getInstance(this.mContext).buildTaskId(str, str2);
        final int i3 = 5;
        if (hasInstallingTask(strBuildTaskId, i) || !(f2.a(this.mContext).j().isEmpty() || f2.a(this.mContext).j().containsKey(str))) {
            f2.a(this.mContext).e(strB, str2);
            FilePuller.getInstance(this.mContext).notifyDownloadStatus(strBuildTaskId, 5);
            OperateWatchFaceCallback operateWatchFaceCallback = this.mOperateCallback;
            if (operateWatchFaceCallback != null) {
                operateWatchFaceCallback.transmitInstallWatchFaceResult(strB, str2, 5);
            }
            OperateWatchFaceCallback operateWatchFaceCallback2 = this.pOperateCallback;
            if (operateWatchFaceCallback2 != null) {
                operateWatchFaceCallback2.transmitInstallWatchFaceResult(strB, str2, 5);
            }
            HwLog.i(str4, "applyWatchFace, add wait queue");
            return;
        }
        if (strB != null && str2 != null) {
            changeInstallState(2);
            FilePuller.getInstance(this.mContext).notifyDownloadStatus(strBuildTaskId, 6);
            OperateWatchFaceCallback operateWatchFaceCallback3 = this.mOperateCallback;
            if (operateWatchFaceCallback3 != null && i == 1) {
                operateWatchFaceCallback3.transmitInstallWatchFaceResult(strB, str2, 6);
            }
            OperateWatchFaceCallback operateWatchFaceCallback4 = this.pOperateCallback;
            if (operateWatchFaceCallback4 != null && i == 1) {
                operateWatchFaceCallback4.transmitInstallWatchFaceResult(strB, str2, 6);
            }
            if (this.mHandler == null) {
                this.mHandler = new Handler();
            }
            this.mHandler.removeCallbacks(this.mResetInstallState);
            this.mIsInstallState = true;
            HwLog.w(str4, "applyWatchFace() apply immediately.");
            this.mHandler.postDelayed(this.mResetInstallState, 60000L);
            setCurrentInstallWatchFaceHiTopId(strB);
            setCurrentInstallWatchFaceVersion(str2);
            final WatchResourcesInfo watchResourcesInfo = new WatchResourcesInfo();
            watchResourcesInfo.setWatchInfoId(strB);
            watchResourcesInfo.setWatchInfoVersion(str2);
            watchResourcesInfo.setWatchScreen(this.mWatchScreenMap.get(strB));
            watchResourcesInfo.setVipFreeWatchFace(z);
            boolean zM = j2.g().m(strB, str2);
            if (i2 != 0) {
                if (i2 == 1) {
                    if (zM) {
                        HwLog.i(str4, "applyWatchFace INSTALLATION_TYPE_TRYOUT-- is try out watch face.Send OPERATE_TYPE_TRY_OUT_START");
                    }
                } else if (i2 == 2 && !zM) {
                    HwLog.i(str4, "applyWatchFace INSTALLATION_TYPE_APPLY-- not is try out watch face.Send OPERATE_TYPE_APPLY");
                    i3 = 1;
                }
                i3 = 0;
            } else if (zM) {
                HwLog.i(str4, "applyWatchFace INSTALLATION_TYPE_NORMAL-- is try out watch face.Send OPERATE_TYPE_TRY_OUT_START");
            } else {
                i3 = 1;
            }
            if (i3 == 0) {
                HwLog.e(str4, "applyWatchFace operateType error ");
                return;
            }
            j2.g().q();
            if (isFindInMemberExpirationWatchFaces(str)) {
                HwLog.i(str4, "applyWatchFace isFindInMemberExpirationWatchFaces");
                BackgroundTaskUtils.a(new Runnable() { // from class: com.huawei.watchface.api.HwWatchFaceManager$$ExternalSyntheticLambda10
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.lambda$applyWatchFace$2(watchResourcesInfo, i3, z2);
                    }
                }, 500);
                return;
            } else {
                this.mHwWatchFaceBtManager.operateDevice(watchResourcesInfo, i3, this.mInstallWatchFaceCallback, true, z2);
                return;
            }
        }
        HwLog.w(str4, "applyWatchFace() hiTopId or version is null");
    }

    private int getIsWearSupport() {
        if (!CommonUtils.t()) {
            HwLog.e(TAG, "getIsWearSupport() isCloudConfigSupportedWear result: is not supported.");
            return 0;
        }
        WatchFaceSupportInfo watchFaceSupportInfo = HwWatchFaceBtManager.getInstance(this.mContext).getWatchFaceSupportInfo();
        if (watchFaceSupportInfo == null) {
            HwLog.e(TAG, "getIsWearSupport() watchFaceSupportInfo is null.");
            return 0;
        }
        return watchFaceSupportInfo.getIsWearSupport();
    }

    public void deleteWatchFace(boolean z) {
        HwLog.i(TAG, "deleteWatchFace() start to show dialog");
        if (z) {
            showToast(DensityUtil.getStringById(R.string.watch_face_preset_not_delete));
        } else {
            showDialogNoTitle(DensityUtil.getStringById(R.string.IDS_watchface_delete_prompt), new View.OnClickListener() { // from class: com.huawei.watchface.api.HwWatchFaceManager$$ExternalSyntheticLambda1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f$0.lambda$deleteWatchFace$9(view);
                }
            });
        }
    }

    private void setDefaultWatchFace(String str, String str2, String str3, final boolean z, IBaseResponseCallback iBaseResponseCallback) {
        String str4 = TAG;
        HwLog.i(str4, "setDefaultWatchFace() enter.");
        if (!this.mIsBtConnect) {
            transmitDeviceConnectState(false, DensityUtil.getStringById(R.string.wearable_device_is_not_connected_notice));
            HwLog.i(str4, "setDefaultWatchFace() failed: Bluetooth not connected");
            transmitSetDefaultWatchFaceResult(iBaseResponseCallback, IntegerUtils.a("2"));
            return;
        }
        if (str != null && str2 != null) {
            WatchResourcesInfo watchResourcesInfo = new WatchResourcesInfo();
            watchResourcesInfo.setWatchInfoId(str);
            watchResourcesInfo.setVipFreeWatchFace(HwWatchFaceBtManager.getInstance(Environment.getApplicationContext()).getVipFreeFromCache(str));
            watchResourcesInfo.setWatchInfoVersion(str2);
            watchResourcesInfo.setWatchScreen(str3);
            int i = 1;
            this.mIsAppSetWatchFace = true;
            if (j2.g().m(str, str2)) {
                HwLog.i(str4, "setDefaultWatchFace -- is try out watch face.Send OPERATE_TYPE_TRY_OUT_START");
                i = 5;
            }
            if (iBaseResponseCallback == null) {
                iBaseResponseCallback = new IBaseResponseCallback() { // from class: com.huawei.watchface.api.HwWatchFaceManager$$ExternalSyntheticLambda12
                    @Override // com.huawei.watchface.utils.callback.IBaseResponseCallback
                    public final void onResponse(int i2, Object obj) {
                        this.f$0.lambda$setDefaultWatchFace$7(z, i2, obj);
                    }
                };
            }
            this.mHwWatchFaceBtManager.operateDevice(watchResourcesInfo, i, iBaseResponseCallback);
            return;
        }
        HwLog.w(str4, "setDefaultWatchFace() Error:hiTopId or version is null");
        transmitSetDefaultWatchFaceResult(iBaseResponseCallback, 104);
    }

    public void showToast() {
        OperateWatchFaceCallback operateWatchFaceCallback = this.mOperateCallback;
        if (operateWatchFaceCallback != null) {
            operateWatchFaceCallback.showToast(DensityUtil.getStringById(R.string.IDS_hwh_show_save_failed));
        }
        OperateWatchFaceCallback operateWatchFaceCallback2 = this.pOperateCallback;
        if (operateWatchFaceCallback2 != null) {
            operateWatchFaceCallback2.showToast(DensityUtil.getStringById(R.string.IDS_hwh_show_save_failed));
        }
    }

    /* JADX INFO: renamed from: com.huawei.watchface.api.HwWatchFaceManager$5, reason: invalid class name */
    public class AnonymousClass5 extends BroadcastReceiver {
        public AnonymousClass5() {
        }

        private void doLoginBroadcast() {
            HwWatchFaceManager hwWatchFaceManager = HwWatchFaceManager.this;
            if (hwWatchFaceManager.mIsDoLogin) {
                HwLog.i(HwWatchFaceManager.TAG, "doLoginBroadcast() mIsDoLogin true.");
                return;
            }
            hwWatchFaceManager.mIsDoLogin = true;
            String str = HwWatchFaceManager.TAG;
            HwLog.i(str, "doLoginBroadcast() enter.");
            BackgroundTaskUtils.a(new Runnable() { // from class: com.huawei.watchface.api.HwWatchFaceManager$5$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.lambda$doLoginBroadcast$0();
                }
            }, 5000);
            f2.a(HwWatchFaceManager.this.mContext).e();
            u2.a();
            c2.a(HwWatchFaceManager.this.mContext).D();
            e4.k(HwWatchFaceManager.this.mContext, "");
            e4.i(HwWatchFaceManager.this.mContext, "");
            WatchFaceHttpUtil.b((WatchFaceSignBean) null);
            if (HwWatchFaceBtManager.getInstance(HwWatchFaceManager.this.mContext).getConnectWatchDeviceInfo() == null) {
                HwLog.w(str, "doLoginBroadcast() deviceInfo null.");
            } else {
                HwWatchFaceManager.this.mHwWatchFaceBtManager.getWatchInfoForUi(new IBaseResponseCallback(this) { // from class: com.huawei.watchface.api.HwWatchFaceManager.5.1
                    @Override // com.huawei.watchface.utils.callback.IBaseResponseCallback
                    public void onResponse(int i, Object obj) {
                        HwLog.i(HwWatchFaceManager.TAG, "doLoginBroadcast() errorCode: " + i);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$doLoginBroadcast$0() {
            HwLog.i(HwWatchFaceManager.TAG, "doLoginBroadcast() reset mIsDoLogin.");
            HwWatchFaceManager.this.mIsDoLogin = false;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String str = HwWatchFaceManager.TAG;
            HwLog.i(str, "mBroadcastReceiver() onReceive enter ");
            if (intent == null) {
                HwLog.w(str, "mBroadcastReceiver() onReceive intent is null.");
                return;
            }
            String action = intent.getAction();
            if (action == null) {
                HwLog.w(str, "mBroadcastReceiver() onReceive broadcast action is null.");
            } else if (action.equals("com.huawei.plugin.account.login")) {
                HwLog.i(str, "mBroadcastReceiver() ACTION_LOGIN_SUCCESSFUL.");
                doLoginBroadcast();
            }
        }
    }
}
