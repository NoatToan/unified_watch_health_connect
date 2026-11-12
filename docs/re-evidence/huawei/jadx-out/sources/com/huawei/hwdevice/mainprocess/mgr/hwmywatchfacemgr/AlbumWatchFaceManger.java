package com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.text.TextUtils;
import com.google.gson.reflect.TypeToken;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.common.os.FileUtils;
import com.huawei.haf.common.utils.CollectionUtils;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.devicemgr.business.constant.TransferFileReqType;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwdevice.api.AlbumWatchFaceApi;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.commonservice.WatchFaceWearService;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.constant.WatchFaceConstant;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.deviceside.DiyWatchFaceDeviceService;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.type.h5pro.DiyThrowable;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.type.h5pro.SmartColorPick;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.type.h5pro.TransferProgressResp;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.type.h5pro.TransmitWatchFace;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.type.h5pro.WatchFaceColorFilter;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.type.weardevice.AlbumWatchFaceInfo;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.util.DiyWatchFaceBitmapUtils;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.util.WatchFaceUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.networkclient.ResultCallback;
import com.huawei.openalliance.ad.db.bean.ContentResource;
import defpackage.qqf;
import defpackage.xhd;
import health.compact.a.CommonUtil;
import health.compact.a.CommonUtils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class AlbumWatchFaceManger extends DiyWatchFace<AlbumWatchFaceInfo> implements AlbumWatchFaceApi {
    private static final String CLIP_CONFIG = "clipConfig";
    private static final String CLIP_PHOTO = "clipPhoto";
    private static final String IMAGE_CACHE = "watchFaceImgCache";
    private static final String TAG = "AlbumWatchFaceManger";
    private static final String TAG_RELEASE = "DEVMGR_AlbumWatchFaceManger";
    private AlbumWatchFaceInfo mAlbumWatchFaceInfo;
    private ArrayList<String> mBackgrounds;
    private DiyWatchFaceDeviceService mDiyWatchFaceDeviceService;
    private List<Integer> mFileTypePhotos;
    private boolean mIsSyncing;
    private ArrayList<String> mLocalNoContainsPhotos;
    private final Map<String, ResultCallback<TransferProgressResp>> mOneHopProgressCallbackMap;
    private ResultCallback<TransferProgressResp> mSetWatchFaceCallback;
    private final Object mSyncLock;
    private ResultCallback<TransmitWatchFace<AlbumWatchFaceInfo>> mTransmitWatchFaceCallback;

    private AlbumWatchFaceManger() {
        super(WatchFaceConstant.ROOT_PATH_PHOTO, false);
        this.mOneHopProgressCallbackMap = new ConcurrentHashMap();
        this.mLocalNoContainsPhotos = new ArrayList<>(16);
        this.mBackgrounds = new ArrayList<>(16);
        this.mFileTypePhotos = new ArrayList(16);
        this.mIsSyncing = false;
        this.mSyncLock = new Object();
        this.mDiyWatchFaceDeviceService = DiyWatchFaceDeviceService.getInstance();
        LogUtil.a(TAG, "create AlbumWatchFaceManger.");
    }

    private String getImageCacheDir() {
        return getDeviceBgFilePath() + IMAGE_CACHE + File.separator;
    }

    public static AlbumWatchFaceManger getInstance() {
        return SingletonHolder.INSTANCE;
    }

    public void registerOneHopCallback(String str, ResultCallback<TransferProgressResp> resultCallback) {
        LogUtil.a(TAG, "registerOneHopCallback:", str);
        if (resultCallback == null || str == null) {
            LogUtil.j(TAG, "registerOneHopCallback key or callback is null");
        } else {
            this.mOneHopProgressCallbackMap.put(str, resultCallback);
        }
    }

    public void unregisterOneHopCallback(String str) {
        LogUtil.a(TAG, "unregisterOneHopCallback:", str);
        if (str != null) {
            this.mOneHopProgressCallbackMap.remove(str);
        }
    }

    public void onOneHopProgress(TransferProgressResp transferProgressResp, Throwable th) {
        if (th == null) {
            Iterator<ResultCallback<TransferProgressResp>> it = this.mOneHopProgressCallbackMap.values().iterator();
            while (it.hasNext()) {
                try {
                    it.next().onSuccess(transferProgressResp);
                } catch (Exception e) {
                    ReleaseLogUtil.e(TAG_RELEASE, "oneHop callback error:", ExceptionUtils.c(e));
                }
            }
            return;
        }
        Iterator<ResultCallback<TransferProgressResp>> it2 = this.mOneHopProgressCallbackMap.values().iterator();
        while (it2.hasNext()) {
            try {
                it2.next().onFailure(th);
            } catch (Exception e2) {
                ReleaseLogUtil.e(TAG_RELEASE, "oneHop callback error:", ExceptionUtils.c(e2));
            }
        }
    }

    @Override // com.huawei.hwdevice.api.AlbumWatchFaceApi
    public void getDeviceWatchFaceInfo(final ResultCallback<TransmitWatchFace<AlbumWatchFaceInfo>> resultCallback) {
        initWatchFaceSize(new ResponseCallback() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.AlbumWatchFaceManger$$ExternalSyntheticLambda0
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public final void onResponse(int i, Object obj) {
                this.f$0.m1410x7c783fd6(resultCallback, i, (String) obj);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$getDeviceWatchFaceInfo$0$com-huawei-hwdevice-mainprocess-mgr-hwmywatchfacemgr-AlbumWatchFaceManger, reason: not valid java name */
    /* synthetic */ void m1410x7c783fd6(final ResultCallback resultCallback, int i, String str) {
        this.mDiyWatchFaceDeviceService.getWatchFacePhotoInfo(new IBaseResponseCallback() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.AlbumWatchFaceManger.1
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i2, Object obj) {
                ReleaseLogUtil.d(AlbumWatchFaceManger.TAG_RELEASE, "getDeviceWatchFaceInfo errorCode：", Integer.valueOf(i2));
                if (i2 == 101) {
                    if (obj instanceof AlbumWatchFaceInfo) {
                        AlbumWatchFaceManger.this.mTransmitWatchFaceCallback = resultCallback;
                        AlbumWatchFaceManger.this.handleDeviceWatchFace((AlbumWatchFaceInfo) obj);
                        return;
                    } else {
                        AlbumWatchFaceManger.this.resetIsSync();
                        resultCallback.onFailure(new DiyThrowable(-1, "objectData is not AlbumWatchFaceInfo"));
                        return;
                    }
                }
                AlbumWatchFaceManger.this.resetIsSync();
                resultCallback.onFailure(new DiyThrowable(-1, "getWatchFacePhotoInfo error"));
            }
        });
    }

    @Override // com.huawei.hwdevice.api.AlbumWatchFaceApi
    public void setAlbumWatchFaceInfo(String str, ResultCallback<TransferProgressResp> resultCallback) {
        sendWatchFaceInfoToDevice(str, resultCallback);
    }

    @Override // com.huawei.hwdevice.api.AlbumWatchFaceApi
    public void getAlbumWatchFacePath(int i, ResponseCallback<String> responseCallback) {
        String deviceBgFilePath;
        if (i == 1) {
            deviceBgFilePath = getDeviceBgFilePath();
        } else if (i == 2 || i == 3) {
            deviceBgFilePath = getClipPhotoFilePath(i);
        } else {
            LogUtil.a(TAG, "getAlbumWatchFacePath type:", Integer.valueOf(i));
            deviceBgFilePath = "";
        }
        responseCallback.onResponse(0, deviceBgFilePath);
    }

    @Override // com.huawei.hwdevice.api.AlbumWatchFaceApi
    public void getColorPictures(String str, ResultCallback<String> resultCallback) {
        String colorPicture;
        LogUtil.a(TAG, "getColorPictures enter");
        WatchFaceColorFilter watchFaceColorFilter = (WatchFaceColorFilter) HiJsonUtil.d(str, WatchFaceColorFilter.class);
        if (watchFaceColorFilter == null) {
            ReleaseLogUtil.e(TAG_RELEASE, "colorFilterBean is null");
            resultCallback.onFailure(new Throwable("colorFilterBean is null"));
            return;
        }
        int type = watchFaceColorFilter.getType();
        LogUtil.a(TAG, "colorFilterBean type:", Integer.valueOf(type));
        List<WatchFaceColorFilter.WatchFaceBackgroundBean> watchFaceBgArr = watchFaceColorFilter.getWatchFaceBgArr();
        if (CollectionUtils.a(watchFaceBgArr)) {
            ReleaseLogUtil.e(TAG_RELEASE, "watchFaceBgArr is null");
            resultCallback.onFailure(new Throwable("watchFaceBgArr is null"));
            return;
        }
        for (WatchFaceColorFilter.WatchFaceBackgroundBean watchFaceBackgroundBean : watchFaceBgArr) {
            if (type == 2) {
                String imagePathFromUrl = !TextUtils.isEmpty(watchFaceBackgroundBean.getSourceUrl()) ? getImagePathFromUrl(watchFaceBackgroundBean.getSourceUrl(), watchFaceBackgroundBean.getFileName(), getImageCacheDir()) : null;
                if (!TextUtils.isEmpty(imagePathFromUrl)) {
                    colorPicture = getColorPicture(imagePathFromUrl, watchFaceBackgroundBean.getColorStr(), watchFaceBackgroundBean.getFileName(), type);
                    LogUtil.a(TAG, "getColorPictures resultPath:", colorPicture);
                    watchFaceBackgroundBean.setResultPath(colorPicture);
                }
            } else {
                if (type == 1) {
                    String filePath = watchFaceBackgroundBean.getFilePath();
                    if (!TextUtils.isEmpty(filePath)) {
                        colorPicture = getColorPicture(filePath, watchFaceBackgroundBean.getColorStr(), watchFaceBackgroundBean.getFileName(), type);
                    }
                } else {
                    LogUtil.j(TAG, "getColorPictures other type");
                    colorPicture = "";
                }
                LogUtil.a(TAG, "getColorPictures resultPath:", colorPicture);
                watchFaceBackgroundBean.setResultPath(colorPicture);
            }
        }
        String strD = HiJsonUtil.d(watchFaceColorFilter);
        LogUtil.a(TAG, "getColorPictures resultJson:", strD);
        resultCallback.onSuccess(strD);
    }

    @Override // com.huawei.hwdevice.api.AlbumWatchFaceApi
    public void getSmartPictureList(String str, ResultCallback<String> resultCallback) {
        if (TextUtils.isEmpty(str)) {
            ReleaseLogUtil.e(TAG_RELEASE, "getSmartPictureList needPickerList is empty");
            resultCallback.onFailure(new Throwable("needPickerList is empty"));
            return;
        }
        List<SmartColorPick> list = (List) HiJsonUtil.d(str, new TypeToken<List<SmartColorPick>>() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.AlbumWatchFaceManger.2
        }.getType());
        if (CollectionUtils.a(list)) {
            ReleaseLogUtil.e(TAG_RELEASE, "getSmartPictureList smartColorPickList is empty");
            resultCallback.onFailure(new Throwable("smartColorPickList is empty"));
            return;
        }
        ArrayList arrayList = new ArrayList(16);
        for (SmartColorPick smartColorPick : list) {
            SmartColorPick smartColorPick2 = new SmartColorPick();
            smartColorPick2.setWatchFaceBgPath(smartColorPick.getWatchFaceBgPath());
            smartColorPick2.setPositionRect(smartColorPick.getPositionRect());
            smartColorPick2.setColorString(getSmartPicture(smartColorPick.getWatchFaceBgPath(), smartColorPick.getPositionRect()));
            arrayList.add(smartColorPick2);
        }
        String strD = HiJsonUtil.d(arrayList);
        LogUtil.a(TAG, "getSmartPictureList success resultJson:", strD);
        resultCallback.onSuccess(strD);
    }

    @Override // com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.DiyWatchFace
    protected void resetIsSync() {
        this.mIsSyncing = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleDeviceWatchFace(AlbumWatchFaceInfo albumWatchFaceInfo) {
        ArrayList<AlbumWatchFaceInfo.BackgroundBean> backgroundList = albumWatchFaceInfo.getBackgroundList();
        if (CollectionUtils.a(backgroundList)) {
            ReleaseLogUtil.e(TAG_RELEASE, "handleDeviceWatchFace backgroundList is empty");
            this.mAlbumWatchFaceInfo = albumWatchFaceInfo;
            successCallback(albumWatchFaceInfo);
            resetIsSync();
            deleteDeviceBgFile(null);
            deleteImageCache(null);
            return;
        }
        synchronized (this.mSyncLock) {
            ReleaseLogUtil.d(TAG_RELEASE, "handleDeviceWatchFace mIsSyncing:", Boolean.valueOf(this.mIsSyncing));
            if (this.mIsSyncing) {
                notifyWatchFaceLoadingProgress();
                return;
            }
            this.mAlbumWatchFaceInfo = albumWatchFaceInfo;
            this.mLocalNoContainsPhotos.clear();
            ArrayList<String> noContainsPhotos = getNoContainsPhotos(backgroundList);
            this.mLocalNoContainsPhotos = noContainsPhotos;
            if (!CollectionUtils.a(noContainsPhotos)) {
                this.mIsSyncing = true;
                ReleaseLogUtil.d(TAG_RELEASE, "handleDeviceWatchFace set mIsSyncing:", true);
                this.mTransferCompleteCount = 0;
                this.mCurrentTransferPercent = 0;
                this.mTransferTotalCount = this.mLocalNoContainsPhotos.size();
                getWatchFaceBgFileFromDevice(0, this.mLocalNoContainsPhotos.size(), 1, this.mLocalNoContainsPhotos.get(0));
            } else {
                notifyWatchFaceReady();
            }
        }
    }

    private void successCallback(AlbumWatchFaceInfo albumWatchFaceInfo) {
        if (this.mTransmitWatchFaceCallback != null) {
            TransmitWatchFace<AlbumWatchFaceInfo> transmitWatchFace = new TransmitWatchFace<>();
            transmitWatchFace.setResultCode(0);
            transmitWatchFace.setWatchFaceInfo(albumWatchFaceInfo);
            this.mTransmitWatchFaceCallback.onSuccess(transmitWatchFace);
        }
    }

    private ArrayList<String> getNoContainsPhotos(List<AlbumWatchFaceInfo.BackgroundBean> list) {
        ArrayList<String> arrayList = new ArrayList<>(16);
        String strC = CommonUtil.c(getDeviceBgFilePath());
        if (TextUtils.isEmpty(strC)) {
            ReleaseLogUtil.e(TAG_RELEASE, "getNoContainsPhotos safePath is empty");
            return arrayList;
        }
        File file = new File(strC);
        String[] list2 = file.list();
        if (!file.exists() || CollectionUtils.d(list2)) {
            Iterator<AlbumWatchFaceInfo.BackgroundBean> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getBackgroundName());
            }
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(Arrays.asList(list2));
        ArrayList arrayList3 = new ArrayList(16);
        Iterator<AlbumWatchFaceInfo.BackgroundBean> it2 = list.iterator();
        while (it2.hasNext()) {
            String backgroundName = it2.next().getBackgroundName();
            if (!arrayList2.contains(backgroundName)) {
                arrayList.add(backgroundName);
            } else {
                arrayList3.add(backgroundName);
            }
        }
        ReleaseLogUtil.e(TAG_RELEASE, "getNoContainsPhotos noContainsPhotos size:", Integer.valueOf(arrayList.size()), ", containsPhotos:", Integer.valueOf(arrayList3.size()));
        arrayList3.add(CLIP_PHOTO);
        arrayList3.add(CLIP_CONFIG);
        arrayList3.add(IMAGE_CACHE);
        deleteDeviceBgFile(arrayList3);
        deleteImageCache(arrayList3);
        return arrayList;
    }

    private void deleteImageCache(List<String> list) {
        deleteClipBgFile(WatchFaceUtil.getFile(getImageCacheDir()), list);
        deleteClipBgFile(WatchFaceUtil.getFile(getClipPhotoFilePath(3)), list);
        deleteClipBgFile(WatchFaceUtil.getFile(getClipPhotoFilePath(2)), list);
    }

    private void deleteClipBgFile(File file, List<String> list) {
        WatchFaceUtil.deleteOrRetainBgFile(file, list, true);
    }

    private String getClipPhotoFilePath(int i) {
        String str;
        if (i == 2) {
            str = getDeviceBgFilePath() + CLIP_PHOTO + File.separator;
        } else if (i == 3) {
            str = getDeviceBgFilePath() + CLIP_CONFIG + File.separator;
        } else {
            LogUtil.a(TAG, "getClipPhotoFilePath other path");
            str = "";
        }
        return WatchFaceUtil.getFileDirPath(str);
    }

    @Override // com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.DiyWatchFace
    protected void getNextFileByBt(int i) {
        getWatchFaceBgFileFromDevice(i, this.mLocalNoContainsPhotos.size(), 1, this.mLocalNoContainsPhotos.get(i));
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
        LogUtil.a(TAG, "saveFileFromDevice() fileName :", name, ",length:", Long.valueOf(file.length()));
        if (name.contains(".")) {
            name = name.substring(0, name.lastIndexOf("."));
        }
        String str2 = getDeviceBgFilePath() + name + ".png";
        AlbumWatchFaceInfo albumWatchFaceInfo = this.mAlbumWatchFaceInfo;
        if (albumWatchFaceInfo == null) {
            ReleaseLogUtil.e(TAG_RELEASE, "saveFileFromDevice() mAlbumWatchFaceInfo is null");
            return;
        }
        if (albumWatchFaceInfo.getBackgroundImageType() == 2) {
            xhd.b().b(strC, str2);
            return;
        }
        LogUtil.a(TAG, "support background type is png, so copy");
        try {
            FileUtils.e(file, new File(str2));
        } catch (IOException e) {
            ReleaseLogUtil.a(TAG_RELEASE, "saveFileFromDevice copy file IOException:", ExceptionUtils.c(e));
        }
    }

    @Override // com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.DiyWatchFace
    protected void sendWatchFaceInfoToDevice(String str, ResultCallback<TransferProgressResp> resultCallback) {
        LogUtil.a(TAG, "sendWatchFaceInfoToDevice enter");
        WatchFaceWearService.getInstance().refreshMyWatchFaceApplyTime();
        AlbumWatchFaceInfo albumWatchFaceInfo = (AlbumWatchFaceInfo) HiJsonUtil.d(str, AlbumWatchFaceInfo.class);
        ArrayList<AlbumWatchFaceInfo.BackgroundBean> backgroundList = albumWatchFaceInfo.getBackgroundList();
        ReleaseLogUtil.d(TAG_RELEASE, "sendWatchFaceInfoToDevice albumWatchFaceInfo backgroundBeans size:", Integer.valueOf(backgroundList.size()));
        ArrayList<String> arrayList = new ArrayList<>(16);
        Iterator<AlbumWatchFaceInfo.BackgroundBean> it = backgroundList.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getBackgroundName());
        }
        this.mBackgrounds.clear();
        this.mBackgrounds.addAll(arrayList);
        AlbumWatchFaceInfo albumWatchFaceInfo2 = this.mAlbumWatchFaceInfo;
        if (albumWatchFaceInfo2 != null && albumWatchFaceInfo2.getBackgroundImageType() == 2) {
            LogUtil.a(TAG, "sendWatchFaceInfoToDevice getBackgroundImageType:", Integer.valueOf(this.mAlbumWatchFaceInfo.getBackgroundImageType()));
            createBinBackground(arrayList);
        } else {
            Iterator<String> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                copyWatchFaceToTransferDir(it2.next());
            }
        }
        registerTransferFileCallback(this.mIAppTransferFileResultAIDLCallback, getFileType(), TransferFileReqType.DEVICE_REGISTRATION);
        this.mSetWatchFaceCallback = resultCallback;
        this.mTransferTotalCount = 0;
        this.mTransferCompleteCount = 0;
        this.mCurrentTransferPercent = 0;
        this.mDiyWatchFaceDeviceService.saveNewPhotoInfoToDevice(albumWatchFaceInfo, new IBaseResponseCallback() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.AlbumWatchFaceManger.3
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                ReleaseLogUtil.d(AlbumWatchFaceManger.TAG_RELEASE, "saveNewPhotoInfoToDevice errorCode：", Integer.valueOf(i));
                if (i == 101) {
                    AlbumWatchFaceManger.this.onSaveSuccess();
                    return;
                }
                if (i == 111) {
                    if (obj instanceof Integer) {
                        AlbumWatchFaceManger.this.onSaveToTransferBackgrounds(((Integer) obj).intValue(), 1);
                        return;
                    }
                    return;
                }
                AlbumWatchFaceManger.this.onSaveFailed(new DiyThrowable(-1, "saveNewPhotoInfoToDevice fail"));
            }
        });
    }

    @Override // com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.DiyWatchFace
    protected List<Integer> getFileType() {
        if (!CollectionUtils.a(this.mFileTypePhotos)) {
            return this.mFileTypePhotos;
        }
        this.mFileTypePhotos.add(3);
        return this.mFileTypePhotos;
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
            if (iOptInt != 3) {
                ReleaseLogUtil.e(TAG_RELEASE, "devicesCallbackFileInfoCheckFail fileType: ", Integer.valueOf(iOptInt));
                return true;
            }
            String[] list = new File(getBackgroundFilePath()).list();
            if (CollectionUtils.d(list)) {
                ReleaseLogUtil.e(TAG_RELEASE, "devicesCallbackFileInfoCheckFail childFileNames is empty");
                return true;
            }
            ArrayList arrayList = new ArrayList(Arrays.asList(list));
            if (CollectionUtils.a(arrayList)) {
                ReleaseLogUtil.e(TAG_RELEASE, "devicesCallbackFileInfoCheckFail file is not exist");
                return true;
            }
            return !arrayList.contains(strOptString);
        } catch (JSONException e) {
            ReleaseLogUtil.a(TAG_RELEASE, "devicesCallbackFileInfoCheckFailJSONException :", ExceptionUtils.c(e));
            return true;
        }
    }

    @Override // com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.DiyWatchFace
    protected ResultCallback<TransferProgressResp> getTransferCallback() {
        return this.mSetWatchFaceCallback;
    }

    @Override // com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.DiyWatchFace
    protected ResultCallback<TransmitWatchFace<AlbumWatchFaceInfo>> getTransmitWatchFaceCallback() {
        return this.mTransmitWatchFaceCallback;
    }

    @Override // com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.DiyWatchFace
    protected void deleteSaveWatchFace() {
        deleteSaveBgFile(this.mBackgrounds);
    }

    @Override // com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.DiyWatchFace
    protected void notifyWatchFaceReady() {
        resetIsSync();
        AlbumWatchFaceInfo albumWatchFaceInfo = this.mAlbumWatchFaceInfo;
        if (albumWatchFaceInfo == null) {
            ReleaseLogUtil.e(TAG_RELEASE, "notifyWatchFaceReady albumWatchFaceInfo is null");
        } else {
            successCallback(albumWatchFaceInfo);
        }
    }

    @Override // com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.DiyWatchFace
    protected void notifyWatchFaceError(int i, String str) {
        ResultCallback<TransmitWatchFace<AlbumWatchFaceInfo>> resultCallback = this.mTransmitWatchFaceCallback;
        if (resultCallback != null) {
            resultCallback.onFailure(new DiyThrowable(i, str));
        }
    }

    private void createBinBackground(ArrayList<String> arrayList) {
        int binFileType = getBinFileType();
        for (String str : arrayList) {
            LogUtil.a(TAG, "createBinBackground bgName : ", str);
            if (!str.endsWith(".png")) {
                copyWatchFaceToTransferDir(str);
            } else {
                String str2 = getDeviceBgFilePath() + str;
                LogUtil.a(TAG, "createBinBackground pngPath :", str2);
                String strReplace = str.replace(".png", WatchFaceConstant.BIN_SUFFIX);
                String str3 = getDeviceBgFilePath() + strReplace;
                LogUtil.a(TAG, "createBinBackground binPath :", str3);
                DiyWatchFaceBitmapUtils.createSizeBinFile(str2, str3, binFileType, this.mDeviceWidth, this.mDeviceHeight);
                LogUtil.a(TAG, "createBinBackground createBinFile success");
                copyWatchFaceToTransferDir(str);
                copyWatchFaceToTransferDir(strReplace);
            }
        }
    }

    private int getBinFileType() {
        AlbumWatchFaceInfo albumWatchFaceInfo = this.mAlbumWatchFaceInfo;
        if (albumWatchFaceInfo != null) {
            return albumWatchFaceInfo.getBackgroundImageOption();
        }
        return 0;
    }

    private String getImagePathFromUrl(final String str, final String str2, final String str3) {
        LogUtil.j(TAG, "getImagePathFromUrl fileName:", str2);
        final long jCurrentTimeMillis = System.currentTimeMillis();
        final String[] strArr = new String[1];
        String str4 = str3 + str2;
        final String strC = CommonUtil.c(str4);
        if (TextUtils.isEmpty(strC)) {
            ReleaseLogUtil.e(TAG_RELEASE, "getTimePath safePath is empty.");
            return str4;
        }
        if (new File(strC).exists()) {
            ReleaseLogUtil.d(TAG_RELEASE, "getTimePath Exists.");
            return str3 + str2;
        }
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        try {
            ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.AlbumWatchFaceManger.4
                @Override // java.lang.Runnable
                public void run() throws Throwable {
                    Bitmap bitmapC = qqf.c(BaseApplication.b(), str);
                    if (bitmapC == null) {
                        ReleaseLogUtil.e(AlbumWatchFaceManger.TAG_RELEASE, "getImagePathFromUrl resource is null");
                        strArr[0] = "";
                    } else {
                        DiyWatchFaceBitmapUtils.saveBitmapToFile(bitmapC, Bitmap.CompressFormat.PNG, str3, str2);
                        strArr[0] = strC;
                    }
                    countDownLatch.countDown();
                    LogUtil.a(AlbumWatchFaceManger.TAG, "get bitmap by url time:", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
                }
            });
            if (!countDownLatch.await(5000L, TimeUnit.MILLISECONDS)) {
                ReleaseLogUtil.e(TAG_RELEASE, "getImagePathFromUrl time out!");
                strArr[0] = "";
            }
        } catch (InterruptedException e) {
            ReleaseLogUtil.a(TAG_RELEASE, "getImagePathFromUrl InterruptedException:", ExceptionUtils.c(e));
        } catch (Exception e2) {
            ReleaseLogUtil.a(TAG_RELEASE, "getImagePathFromUrl Exception:", ExceptionUtils.c(e2));
        }
        return strArr[0];
    }

    private String getColorPicture(String str, String str2, String str3, int i) {
        LogUtil.a(TAG, "getColorPicture enter colorStr:", str2);
        try {
            int color = Color.parseColor(str2);
            String colorPickPicName = getColorPickPicName(color, str3);
            if (TextUtils.isEmpty(colorPickPicName)) {
                ReleaseLogUtil.e(TAG_RELEASE, "getColorPicture newColorPreviewPicName is empty");
                return str;
            }
            String str4 = getImageCacheDir() + colorPickPicName;
            LogUtil.a(TAG, "getColorPicture newColorPreviewPicName:", colorPickPicName);
            String strC = CommonUtil.c(str4);
            if (TextUtils.isEmpty(strC)) {
                ReleaseLogUtil.e(TAG_RELEASE, "getColorPicture safePath is empty.");
                return str;
            }
            File file = new File(strC);
            if (file.exists()) {
                ReleaseLogUtil.d(TAG_RELEASE, "getColorPicture image exists");
                return str4;
            }
            if (!isTintWatchFaceBitmapSuccess(str, color, colorPickPicName, i)) {
                return str;
            }
            if (file.exists()) {
                ReleaseLogUtil.d(TAG_RELEASE, "getColorPicture save success");
                return str4;
            }
            ReleaseLogUtil.d(TAG_RELEASE, "getColorPicture new pic save failed");
            return str;
        } catch (IllegalArgumentException e) {
            ReleaseLogUtil.a(TAG_RELEASE, "getColorPicture parseColor IllegalArgumentException :", ExceptionUtils.c(e));
            return str;
        }
    }

    private boolean isTintWatchFaceBitmapSuccess(String str, int i, String str2, int i2) throws Throwable {
        Bitmap bitmapE;
        Bitmap bitmapTintBitmap;
        if (i2 == 1) {
            bitmapE = qqf.e(str);
            bitmapTintBitmap = DiyWatchFaceBitmapUtils.tintColorBitmap(bitmapE, i);
        } else if (i2 == 2) {
            bitmapE = qqf.e(str);
            bitmapTintBitmap = DiyWatchFaceBitmapUtils.tintBitmap(bitmapE, i);
        } else {
            bitmapE = null;
            bitmapTintBitmap = null;
        }
        if (bitmapTintBitmap == null) {
            ReleaseLogUtil.d(TAG_RELEASE, "getColorPicture newColorPreviewBitmap is null");
            return false;
        }
        DiyWatchFaceBitmapUtils.saveBitmapToFile(bitmapTintBitmap, Bitmap.CompressFormat.PNG, getImageCacheDir(), str2);
        if (bitmapE != null) {
            bitmapE.recycle();
        }
        bitmapTintBitmap.recycle();
        return true;
    }

    private String getColorPickPicName(int i, String str) {
        if (TextUtils.isEmpty(str)) {
            ReleaseLogUtil.e(TAG_RELEASE, "getColorPickPicName fileName is empty");
            return "";
        }
        String[] strArrSplit = str.split("[.]");
        if (CollectionUtils.d(strArrSplit)) {
            ReleaseLogUtil.e(TAG_RELEASE, "getColorPickPicName endStringArray is empty");
            return "";
        }
        return strArrSplit[0] + "_" + Math.abs(i) + ".png";
    }

    private String getSmartPicture(String str, String str2) {
        Bitmap bitmapE = qqf.e(str);
        if (bitmapE == null) {
            ReleaseLogUtil.e(TAG_RELEASE, "getSmartPicture watchFaceBgBitmap is null");
            return "";
        }
        String str3 = "#" + Integer.toHexString(DiyWatchFaceBitmapUtils.obtainWidgetColor(bitmapE, getRect(str2)));
        ReleaseLogUtil.d(TAG_RELEASE, "getSmartPicture color :", str3);
        return str3;
    }

    private Rect getRect(String str) {
        Rect rect = new Rect();
        if (TextUtils.isEmpty(str)) {
            ReleaseLogUtil.e(TAG_RELEASE, "getRect positionRect is empty");
            return rect;
        }
        if (!str.contains(",")) {
            ReleaseLogUtil.e(TAG_RELEASE, "getRect positionRect not contains ,");
            return rect;
        }
        String[] strArrSplit = str.split(",");
        if (CollectionUtils.d(strArrSplit) || strArrSplit.length != 4) {
            ReleaseLogUtil.e(TAG_RELEASE, "getRect -- positionRectArray length not 4");
            return rect;
        }
        rect.left = CommonUtils.e(strArrSplit[0], 0);
        rect.top = CommonUtils.e(strArrSplit[1], 0);
        rect.right = CommonUtils.e(strArrSplit[2], 0);
        rect.bottom = CommonUtils.e(strArrSplit[3], 0);
        return rect;
    }

    /* JADX INFO: loaded from: classes10.dex */
    static class SingletonHolder {
        static final AlbumWatchFaceManger INSTANCE = new AlbumWatchFaceManger();

        private SingletonHolder() {
        }
    }
}
