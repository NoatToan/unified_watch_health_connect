package com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.text.TextUtils;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.common.os.FileUtils;
import com.huawei.haf.common.utils.CollectionUtils;
import com.huawei.health.devicemgr.business.constant.TransferFileReqType;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.constant.WatchFaceConstant;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.deviceside.VideoWatchFaceDeviceService;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.VideoChoosePicUtil;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.VideoEditActivity;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.utils.Constant;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.type.h5pro.DiyThrowable;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.type.h5pro.TransferProgressResp;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.type.h5pro.TransmitWatchFace;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.type.weardevice.PresetVideoWatchFace;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.type.weardevice.VideoStruct;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.type.weardevice.WatchFaceVideoInfo;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.util.DiyWatchFaceBitmapUtils;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.util.WatchFaceUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.networkclient.ProgressListener;
import com.huawei.networkclient.ResultCallback;
import com.huawei.openalliance.ad.db.bean.ContentResource;
import com.huawei.secure.android.common.util.SafeString;
import com.huawei.watchface.environment.Environment;
import defpackage.oer;
import defpackage.oet;
import health.compact.a.CommonUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class VideoWatchFaceManager extends DiyWatchFace<WatchFaceVideoInfo> {
    private static final int SIZE_DEN = 1024;
    private static final String TAG = "VideoWatchFaceManager";
    private static final String TAG_RELEASE = "R_VideoWatchFaceManager";
    private ResponseCallback<String> downloadPresetVideoCallback;
    private VideoChoosePicUtil mChoosePicUtil;
    private ResponseCallback<String> mClipVideoCallback;
    private List<Integer> mFileTypeVideos;
    private boolean mIsDownload;
    private volatile boolean mIsSyncing;
    private ArrayList<String> mLocalNoContainsVideos;
    private int mPresetVideoSize;
    private ResultCallback<TransferProgressResp> mSetWatchFaceCallback;
    private final Object mSyncLock;
    private ResultCallback<TransmitWatchFace<WatchFaceVideoInfo>> mTransmitWatchFaceCallback;
    private VideoWatchFaceDeviceService mVideoWatchFaceDeviceService;
    private WatchFaceVideoInfo mWatchFaceVideoInfo;
    private ArrayList<String> sendDeviceVideoList;

    private VideoWatchFaceManager() {
        super(WatchFaceConstant.ROOT_PATH_VIDEO, false);
        this.mFileTypeVideos = new ArrayList(16);
        this.sendDeviceVideoList = new ArrayList<>(16);
        this.mLocalNoContainsVideos = new ArrayList<>(16);
        this.mIsSyncing = false;
        this.mIsDownload = false;
        this.mPresetVideoSize = 0;
        this.mSyncLock = new Object();
        LogUtil.a(TAG, "create VideoWatchFaceManager.");
        this.mVideoWatchFaceDeviceService = VideoWatchFaceDeviceService.getInstance();
    }

    public static VideoWatchFaceManager getInstance() {
        return SingletonHolder.INSTANCE;
    }

    /* JADX INFO: loaded from: classes10.dex */
    static class SingletonHolder {
        static final VideoWatchFaceManager INSTANCE = new VideoWatchFaceManager();

        private SingletonHolder() {
        }
    }

    @Override // com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.DiyWatchFace
    protected void getNextFileByBt(int i) {
        getWatchFaceBgFileFromDevice(i, this.mLocalNoContainsVideos.size(), 19, this.mLocalNoContainsVideos.get(i));
    }

    @Override // com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.DiyWatchFace
    protected void saveFileFromDevice(String str, int i) throws Throwable {
        String strC = CommonUtil.c(str);
        if (TextUtils.isEmpty(strC)) {
            ReleaseLogUtil.e(TAG_RELEASE, "saveFileFromDevice() safePath is empty");
            return;
        }
        File file = new File(strC);
        String name = file.getName();
        if (name.contains(".")) {
            name = name.substring(0, name.lastIndexOf("."));
        }
        String str2 = getDeviceBgFilePath() + name + ".mp4";
        if (this.mWatchFaceVideoInfo == null) {
            ReleaseLogUtil.e(TAG_RELEASE, "saveFileFromDevice() mKaleidoscopeWatchFaceInfo is null");
            return;
        }
        LogUtil.a(TAG, "saveFileFromDevice support background type is video, so copy");
        try {
            FileUtils.e(file, new File(str2));
            getVideoPreviewPicPath(getDeviceBgFilePath(), str2);
        } catch (IOException e) {
            ReleaseLogUtil.a(TAG_RELEASE, "saveFileFromDevice copy file IOException:", ExceptionUtils.c(e));
        }
    }

    @Override // com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.DiyWatchFace
    protected void notifyWatchFaceReady() {
        resetIsSync();
        WatchFaceVideoInfo watchFaceVideoInfo = this.mWatchFaceVideoInfo;
        if (watchFaceVideoInfo == null) {
            ReleaseLogUtil.e(TAG_RELEASE, "notifyWatchFaceReady mWatchFaceVideoInfo is null");
        } else {
            successCallback(watchFaceVideoInfo);
        }
    }

    @Override // com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.DiyWatchFace
    protected void notifyWatchFaceError(int i, String str) {
        ResultCallback<TransmitWatchFace<WatchFaceVideoInfo>> resultCallback = this.mTransmitWatchFaceCallback;
        if (resultCallback != null) {
            resultCallback.onFailure(new DiyThrowable(i, str));
        }
    }

    @Override // com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.DiyWatchFace
    protected void resetIsSync() {
        this.mIsSyncing = false;
    }

    @Override // com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.DiyWatchFace
    protected void sendWatchFaceInfoToDevice(String str, ResultCallback<TransferProgressResp> resultCallback) {
        LogUtil.a(TAG, "sendWatchFaceInfoToDevice entry");
        WatchFaceVideoInfo watchFaceVideoInfo = (WatchFaceVideoInfo) HiJsonUtil.d(str, WatchFaceVideoInfo.class);
        ArrayList<VideoStruct> videoList = watchFaceVideoInfo.getVideoList();
        if (CollectionUtils.a(videoList)) {
            onSaveFailed(new DiyThrowable(-1, "sendWatchFaceInfoToDevice videoStructList is empty"));
            return;
        }
        this.sendDeviceVideoList.clear();
        Iterator<VideoStruct> it = videoList.iterator();
        while (it.hasNext()) {
            this.sendDeviceVideoList.add(it.next().getVideoName());
        }
        Iterator<String> it2 = this.sendDeviceVideoList.iterator();
        while (it2.hasNext()) {
            copyWatchFaceToTransferDir(it2.next());
        }
        LogUtil.a(TAG, "sendWatchFaceInfoToDevice video size is ", Integer.valueOf(this.sendDeviceVideoList.size()));
        registerTransferFileCallback(this.mIAppTransferFileResultAIDLCallback, getFileType(), TransferFileReqType.DEVICE_REGISTRATION);
        this.mSetWatchFaceCallback = resultCallback;
        this.mTransferTotalCount = 0;
        this.mTransferCompleteCount = 0;
        this.mCurrentTransferPercent = 0;
        this.mVideoWatchFaceDeviceService.sendWatchVideoInfoToDevice(watchFaceVideoInfo, new IBaseResponseCallback() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.VideoWatchFaceManager$$ExternalSyntheticLambda1
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                this.f$0.m1413xdf3df702(i, obj);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$sendWatchFaceInfoToDevice$0$com-huawei-hwdevice-mainprocess-mgr-hwmywatchfacemgr-VideoWatchFaceManager, reason: not valid java name */
    /* synthetic */ void m1413xdf3df702(int i, Object obj) {
        LogUtil.a(TAG, "sendWatchFaceInfoToDevice errorCode：", Integer.valueOf(i));
        if (i == 101) {
            onSaveSuccess();
            return;
        }
        if (i == 111) {
            if (obj instanceof Integer) {
                Integer num = (Integer) obj;
                int iIntValue = num.intValue();
                LogUtil.a(TAG, "sendWatchFaceInfoToDevice transferNum is ", num);
                onSaveToTransferBackgrounds(iIntValue, 1);
                return;
            }
            return;
        }
        onSaveFailed(new DiyThrowable(-1, "sendWatchFaceInfoToDevice fail"));
    }

    @Override // com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.DiyWatchFace
    protected List<Integer> getFileType() {
        if (!CollectionUtils.a(this.mFileTypeVideos)) {
            return this.mFileTypeVideos;
        }
        this.mFileTypeVideos.add(10);
        return this.mFileTypeVideos;
    }

    @Override // com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.DiyWatchFace
    protected boolean devicesCallbackFileInfoCheckFail(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString(ContentResource.FILE_NAME);
            int iOptInt = jSONObject.optInt("fileType");
            if (TextUtils.isEmpty(strOptString)) {
                ReleaseLogUtil.e(TAG_RELEASE, "devicesCallbackFileInfoCheckFail fileName is empty");
                return true;
            }
            if (iOptInt != 10) {
                ReleaseLogUtil.e(TAG_RELEASE, "devicesCallbackFileInfoCheckFail fileType: ", Integer.valueOf(iOptInt));
                return true;
            }
            if (CollectionUtils.a(this.sendDeviceVideoList)) {
                ReleaseLogUtil.e(TAG_RELEASE, "devicesCallbackFileInfoCheckFail sendDeviceVideoList is empty");
                return true;
            }
            return !this.sendDeviceVideoList.contains(strOptString);
        } catch (JSONException e) {
            ReleaseLogUtil.a(TAG_RELEASE, "devicesCallbackFileInfoCheckFail JSONException :", ExceptionUtils.c(e));
            return true;
        }
    }

    @Override // com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.DiyWatchFace
    protected ResultCallback<TransferProgressResp> getTransferCallback() {
        return this.mSetWatchFaceCallback;
    }

    @Override // com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.DiyWatchFace
    protected ResultCallback<TransmitWatchFace<WatchFaceVideoInfo>> getTransmitWatchFaceCallback() {
        return this.mTransmitWatchFaceCallback;
    }

    @Override // com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.DiyWatchFace
    protected void deleteSaveWatchFace() {
        deleteSaveBgFile(this.sendDeviceVideoList);
    }

    public void getVideoWatchFacePath(ResponseCallback<String> responseCallback) {
        responseCallback.onResponse(0, getDeviceBgFilePath());
    }

    public void getVideoWatchFaceInfo(final ResultCallback<TransmitWatchFace<WatchFaceVideoInfo>> resultCallback) {
        LogUtil.a(TAG, "getVideoWatchFaceInfo entry");
        this.mVideoWatchFaceDeviceService.getWatchFaceVideoInfo(new IBaseResponseCallback() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.VideoWatchFaceManager$$ExternalSyntheticLambda0
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                this.f$0.m1412x263eab0f(resultCallback, i, obj);
            }
        }, this.mPresetVideoSize);
    }

    /* JADX INFO: renamed from: lambda$getVideoWatchFaceInfo$1$com-huawei-hwdevice-mainprocess-mgr-hwmywatchfacemgr-VideoWatchFaceManager, reason: not valid java name */
    /* synthetic */ void m1412x263eab0f(ResultCallback resultCallback, int i, Object obj) {
        ReleaseLogUtil.d(TAG_RELEASE, "getVideoWatchFaceInfo errorCode：", Integer.valueOf(i));
        if (i == 101) {
            if (obj instanceof WatchFaceVideoInfo) {
                this.mTransmitWatchFaceCallback = resultCallback;
                handleDeviceWatchFace((WatchFaceVideoInfo) obj);
                return;
            } else {
                resetIsSync();
                resultCallback.onFailure(new DiyThrowable(-1, "objectData is not getVideoWatchFaceInfo"));
                return;
            }
        }
        resetIsSync();
        resultCallback.onFailure(new DiyThrowable(-1, "getVideoWatchFaceInfo error"));
    }

    private void handleDeviceWatchFace(WatchFaceVideoInfo watchFaceVideoInfo) {
        ArrayList<VideoStruct> videoList = watchFaceVideoInfo.getVideoList();
        if (CollectionUtils.a(videoList)) {
            ReleaseLogUtil.e(TAG_RELEASE, "handleDeviceWatchFace backgroundList is empty");
            this.mWatchFaceVideoInfo = watchFaceVideoInfo;
            successCallback(watchFaceVideoInfo);
            resetIsSync();
            deleteDeviceBgFile(null);
            return;
        }
        synchronized (this.mSyncLock) {
            ReleaseLogUtil.d(TAG_RELEASE, "handleDeviceWatchFace mIsSyncing:", Boolean.valueOf(this.mIsSyncing));
            if (this.mIsSyncing) {
                notifyWatchFaceLoadingProgress();
                return;
            }
            this.mIsSyncing = true;
            this.mWatchFaceVideoInfo = watchFaceVideoInfo;
            this.mLocalNoContainsVideos.clear();
            ArrayList<String> noContainsVideos = getNoContainsVideos(videoList);
            this.mLocalNoContainsVideos = noContainsVideos;
            LogUtil.a(TAG, "handleDeviceWatchFace mLocalNoContainsVideos size is ", Integer.valueOf(noContainsVideos.size()));
            if (!CollectionUtils.a(this.mLocalNoContainsVideos)) {
                ReleaseLogUtil.d(TAG_RELEASE, "handleDeviceWatchFace set mIsSyncing:", Boolean.valueOf(this.mIsSyncing));
                this.mTransferCompleteCount = 0;
                this.mCurrentTransferPercent = 0;
                this.mTransferTotalCount = this.mLocalNoContainsVideos.size();
                getWatchFaceBgFileFromDevice(0, this.mLocalNoContainsVideos.size(), 19, this.mLocalNoContainsVideos.get(0));
            } else {
                notifyWatchFaceReady();
            }
        }
    }

    public void setVideoWatchFaceInfo(String str, ResultCallback<TransferProgressResp> resultCallback) {
        LogUtil.a(TAG, "setVideoWatchFaceInfo entry");
        sendWatchFaceInfoToDevice(str, resultCallback);
    }

    public String getClipVideoSavePath() {
        return getDeviceBgFilePath();
    }

    public void saveVideoListToFile(ArrayList<PresetVideoWatchFace> arrayList, ResponseCallback<String> responseCallback) {
        LogUtil.a(TAG, "saveVideoListToFile entry");
        this.downloadPresetVideoCallback = responseCallback;
        if (this.mIsDownload) {
            LogUtil.a(TAG, "saveVideoListToFile mIsDownload is true");
            return;
        }
        this.mPresetVideoSize = arrayList.size();
        ArrayList<PresetVideoWatchFace> arrayList2 = new ArrayList<>();
        for (PresetVideoWatchFace presetVideoWatchFace : arrayList) {
            String videoFileName = presetVideoWatchFace.getVideoFileName();
            if (isPresetVideoMp4Exists(videoFileName)) {
                LogUtil.a(TAG, "presetVideoMp4 is exists, fileName is ", videoFileName);
                createPreviewImage(videoFileName);
            } else {
                arrayList2.add(presetVideoWatchFace);
            }
        }
        File file = new File(getDeviceBgFilePath());
        if (!file.exists()) {
            LogUtil.a(TAG, "saveVideoListToFile isTag is ", Boolean.valueOf(file.mkdirs()));
        }
        this.mIsDownload = true;
        downloadPresetVideo(arrayList2, 0);
    }

    public void clipVideo(Intent intent) {
        String clipVideoPath = getClipVideoPath(intent);
        LogUtil.a(TAG, "clipVideo path is", clipVideoPath);
        String strC = CommonUtil.c(clipVideoPath);
        if (TextUtils.isEmpty(strC)) {
            ReleaseLogUtil.e(TAG_RELEASE, "clipVideo safePath is empty");
            return;
        }
        File file = new File(strC);
        if (!file.exists()) {
            ReleaseLogUtil.e(TAG_RELEASE, "clipVideo file is not exists");
            return;
        }
        String name = file.getName();
        if (name.contains(".")) {
            name = name.substring(0, name.lastIndexOf("."));
        }
        getVideoPreviewPicPath(getDeviceBgFilePath(), clipVideoPath);
        LogUtil.a(TAG, "clipVideo fileName is ", name);
        ResponseCallback<String> responseCallback = this.mClipVideoCallback;
        if (responseCallback != null) {
            responseCallback.onResponse(0, name + ".mp4");
            unRegisterClipVideoCallbackId();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void downloadPresetVideo(final ArrayList<PresetVideoWatchFace> arrayList, final int i) {
        LogUtil.a(TAG, "downloadPresetVideo downloadIndex is ", Integer.valueOf(i));
        if (i >= arrayList.size()) {
            LogUtil.a(TAG, "downloadPresetVideo presetVideo success");
            this.downloadPresetVideoCallback.onResponse(0, null);
            this.mIsDownload = false;
            return;
        }
        String videoUrl = arrayList.get(i).getVideoUrl();
        String videoFileName = arrayList.get(i).getVideoFileName();
        oet.d().a(new oer(videoUrl, null, new File(getDeviceBgFilePath() + videoFileName), new ProgressListener<File>() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.VideoWatchFaceManager.1
            @Override // com.huawei.networkclient.ProgressListener
            public void onFinish(File file) throws Throwable {
                LogUtil.a(VideoWatchFaceManager.TAG, "downloadPresetVideo onFinish data name :", file.getName(), ", path:", file.getPath());
                VideoWatchFaceManager.this.createPreviewImage(file.getName());
                VideoWatchFaceManager.this.downloadPresetVideo(arrayList, i + 1);
            }

            @Override // com.huawei.networkclient.ProgressListener
            public void onProgress(long j, long j2, boolean z) {
                LogUtil.a(VideoWatchFaceManager.TAG, "downloadPresetVideo onProgress, handleBytes: ", Long.valueOf(j), ", contentLength: ", Long.valueOf(j2), ", isDone: ", Boolean.valueOf(z));
            }

            @Override // com.huawei.networkclient.ProgressListener
            public void onFail(Throwable th) {
                LogUtil.a(VideoWatchFaceManager.TAG, "downloadPresetVideo onFail ,throwable is ", th.toString());
                VideoWatchFaceManager.this.downloadPresetVideoCallback.onResponse(-1, null);
                VideoWatchFaceManager.this.mIsDownload = false;
            }
        }));
    }

    private void successCallback(WatchFaceVideoInfo watchFaceVideoInfo) {
        if (this.mTransmitWatchFaceCallback != null) {
            TransmitWatchFace<WatchFaceVideoInfo> transmitWatchFace = new TransmitWatchFace<>();
            transmitWatchFace.setResultCode(0);
            transmitWatchFace.setWatchFaceInfo(watchFaceVideoInfo);
            transmitWatchFace.setCurrentProgress(100);
            this.mTransmitWatchFaceCallback.onSuccess(transmitWatchFace);
        }
    }

    private ArrayList<String> getNoContainsVideos(List<VideoStruct> list) {
        ArrayList<String> arrayList = new ArrayList<>(16);
        String strC = CommonUtil.c(getDeviceBgFilePath());
        if (TextUtils.isEmpty(strC)) {
            ReleaseLogUtil.e(TAG_RELEASE, "getNoContainsVideos safePath is empty");
            return arrayList;
        }
        File file = new File(strC);
        String[] list2 = file.list();
        if (!file.exists() || CollectionUtils.d(list2)) {
            Iterator<VideoStruct> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getVideoName());
            }
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(Arrays.asList(list2));
        ArrayList arrayList3 = new ArrayList(16);
        Iterator<VideoStruct> it2 = list.iterator();
        while (it2.hasNext()) {
            String videoName = it2.next().getVideoName();
            if (!arrayList2.contains(videoName)) {
                arrayList.add(videoName);
            } else {
                arrayList3.add(videoName);
            }
        }
        ReleaseLogUtil.e(TAG_RELEASE, "getNoContainsVideos noContainsVideo size:", Integer.valueOf(arrayList.size()), ", containsVideos:", Integer.valueOf(arrayList3.size()));
        deleteDeviceBgFile(arrayList3);
        return arrayList;
    }

    private String getVideoPreviewPicPath(String str, String str2) throws Throwable {
        String str3;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            LogUtil.j(TAG, "getVideoPreviewPicPath videoBackgroundDir or videoPath is empty");
            return "";
        }
        File file = WatchFaceUtil.getFile(str2);
        if (file == null || !file.exists()) {
            LogUtil.j(TAG, "getVideoPreviewPicPath video not exists, videoPath is ", str2);
            return "";
        }
        String name = file.getName();
        if (TextUtils.isEmpty(name) || !name.contains(".")) {
            str3 = "";
        } else {
            String strSubstring = SafeString.substring(name, 0, name.indexOf("."));
            if (TextUtils.isEmpty(strSubstring)) {
                LogUtil.j(TAG, "getVideoPreviewPicPath video name split failed");
                return "";
            }
            str3 = strSubstring + ".png";
            LogUtil.a(TAG, "getVideoPreviewPicPath videoFileName: ", name, ",  previewPicName: ", str3);
        }
        String str4 = str + str3;
        File file2 = WatchFaceUtil.getFile(str4);
        if (file2 == null || !file2.exists()) {
            Bitmap previewBitmap = getPreviewBitmap(str2, 0);
            if (previewBitmap == null) {
                LogUtil.j(TAG, "getVideoPreviewPicPath get video frame at time one.Failed!");
                return "";
            }
            DiyWatchFaceBitmapUtils.saveBitmapToFile(previewBitmap, Bitmap.CompressFormat.PNG, str, str3);
            previewBitmap.recycle();
            File file3 = WatchFaceUtil.getFile(str4);
            if (file3 == null || !file3.exists()) {
                LogUtil.j(TAG, "getVideoPreviewPicPath preview pic save failed");
                return "";
            }
        }
        return str4;
    }

    private Bitmap getPreviewBitmap(String str, int i) {
        LogUtil.a(TAG, "getVideoPreviewPicPath retryCount is ", Integer.valueOf(i));
        if (i > 2) {
            LogUtil.j(TAG, "getVideoPreviewPicPath failed,return null");
            return null;
        }
        Bitmap videoFrameAtTimeOne = DiyWatchFaceBitmapUtils.getVideoFrameAtTimeOne(str);
        if (videoFrameAtTimeOne != null) {
            LogUtil.j(TAG, "getPreviewBitmap getVideoFrameAtTimeOne previewBitmap is null");
            return videoFrameAtTimeOne;
        }
        LogUtil.a(TAG, "getVideoPreviewPicPath previewBitmap is null ,count");
        return getPreviewBitmap(str, i + 1);
    }

    private boolean isPresetVideoMp4Exists(String str) {
        return new File(getDeviceBgFilePath() + str).exists();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void createPreviewImage(String str) throws Throwable {
        if (new File(getDeviceBgFilePath() + (str.contains(".") ? str.substring(0, str.lastIndexOf(".")) : str) + ".png").exists()) {
            return;
        }
        LogUtil.a(TAG, "presetVideoMp4 is not exists, fileName is ", str);
        getVideoPreviewPicPath(getDeviceBgFilePath(), getDeviceBgFilePath() + str);
    }

    public void registerClipVideoCallbackId(ResponseCallback<String> responseCallback) {
        this.mClipVideoCallback = responseCallback;
    }

    public void unRegisterClipVideoCallbackId() {
        if (this.mClipVideoCallback != null) {
            this.mClipVideoCallback = null;
        }
    }

    public void handleVideoEditEvent(Activity activity) {
        LogUtil.e(TAG, "handleVideoEditEvent -- video");
        String fileSavedPath = new VideoChoosePicUtil(Environment.getApplicationContext()).getFileSavedPath();
        if (!TextUtils.isEmpty(fileSavedPath) && fileSavedPath.length() > 0) {
            LogUtil.e(TAG, "startVideoEditActivity -- video");
            VideoEditActivity.startVideoEditActivity(activity, fileSavedPath);
        } else {
            LogUtil.e(TAG, "onActivityResult -- video file path is empty");
        }
    }

    private String getClipVideoPath(Intent intent) {
        String stringExtra;
        LogUtil.a(TAG, "clipVideo");
        if (this.mChoosePicUtil == null) {
            LogUtil.a(TAG, "clipVideo mChoosePicUtil is null");
            this.mChoosePicUtil = new VideoChoosePicUtil(BaseApplication.b());
        }
        if (intent == null) {
            stringExtra = "";
        } else {
            LogUtil.a(TAG, "getClipVideoPath  data is not null");
            stringExtra = intent.getStringExtra(Constant.VIDEO_EDIT_RESULT_FILE);
        }
        if (stringExtra != null) {
            return stringExtra;
        }
        LogUtil.a(TAG, "getClipVideoPath  filePath is null");
        return this.mChoosePicUtil.getFileSavedPath();
    }
}
