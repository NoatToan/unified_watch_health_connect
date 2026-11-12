package com.huawei.hwdevice.phoneprocess.mgr.exercise;

import android.content.Context;
import android.os.RemoteException;
import com.huawei.callback.TransferFileCallback;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.trackprocess.api.TrackPostProcessApi;
import com.huawei.hms.kit.awareness.AwarenessStatusCodes;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.datatypes.TransferFileInfo;
import com.huawei.hwdevice.phoneprocess.binder.ParserInterface;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwservicesmgr.ITransferSleepAndDFXFileCallback;
import defpackage.iln;
import defpackage.lng;
import defpackage.mhp;
import defpackage.mjd;
import defpackage.mkf;
import defpackage.mnn;
import defpackage.mof;
import defpackage.mrj;
import defpackage.muz;
import defpackage.xjt;
import health.compact.a.CommonUtil;
import health.compact.a.IoUtils;
import health.compact.a.Services;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.commons.io.FileUtils;

/* JADX INFO: loaded from: classes10.dex */
public class HwDeviceGpsFileWorkoutManager implements ParserInterface {
    private static final int ARRAY_INDEX_FIRST = 0;
    private static final int ARRAY_INDEX_SECOND = 1;
    private static final int ARRAY_INDEX_THIRD = 2;
    private static final int ARRAY_LENGTH = 3;
    private static final int GPS_FILE_TYPE = 17;
    private static final String GPS_SUFFIX = "_gps.bin";
    private static final int GRS_TRANS_FAILURE = 30004;
    private static final Object LOCK = new Object();
    private static final int MAX_GPS_PDR_LENGTH = 20971520;
    private static final int NO_FILE_ERROR = 144001;
    private static final int PDR_FILE_TYPE = 18;
    private static final String PDR_SUFFIX = "_pdr.bin";
    private static final int RECORDID_INDEX = 0;
    private static final String TAG = "HwDeviceGpsFileWorkoutManager";
    private static final String TAG_RELEASE = "BTSYNC_HwDeviceGpsFileWorkoutManager";
    private static final int TIMES_ARRAY_SIZE = 2;
    private static int sCurrentFileType;
    private static HwDeviceGpsFileWorkoutManager sInstance;
    private Context mContext;
    private Map<Integer, Integer> mCorrectedTrackIndexMap;
    private String mGpsFileName;
    private String mGpsOrPdrFileName;
    private String mOriginSegInfo;
    private String mPdrFileName;
    private int mRecordId;
    private List<Integer> mRecordIdList;
    private int[] mTimes = new int[2];
    private mof mGpsFileUtil = new mof();
    private TransferFileCallback mCallback = null;
    private boolean isSupportAltitude = false;
    private mjd mDetailGpsWorkoutUtil = mjd.a();
    private Map<Integer, Map<Long, double[]>> mAllMap = new HashMap(16);
    private Map<Integer, Integer> mAllMapType = new HashMap(16);
    private Map<Integer, List<Long>> mAllTrackData = new HashMap(16);
    private ITransferSleepAndDFXFileCallback.Stub mGpsFileCallback = new ITransferSleepAndDFXFileCallback.Stub() { // from class: com.huawei.hwdevice.phoneprocess.mgr.exercise.HwDeviceGpsFileWorkoutManager.1
        @Override // com.huawei.hwservicesmgr.ITransferSleepAndDFXFileCallback
        public void onProgress(int i, String str) throws RemoteException {
        }

        @Override // com.huawei.hwservicesmgr.ITransferSleepAndDFXFileCallback
        public void onSuccess(int i, String str, String str2) throws Throwable {
            ReleaseLogUtil.d(HwDeviceGpsFileWorkoutManager.TAG_RELEASE, "errorCode : ", Integer.valueOf(i));
            if (i == 30000) {
                byte[] fileByte = HwDeviceGpsFileWorkoutManager.this.getFileByte(str);
                HwDeviceGpsFileWorkoutManager.this.mGpsFileUtil.e(fileByte, HwDeviceGpsFileWorkoutManager.this.mGpsOrPdrFileName);
                muz muzVarA = HwDeviceGpsFileWorkoutManager.this.mDetailGpsWorkoutUtil.a(fileByte);
                int iE = HwDeviceGpsFileWorkoutManager.this.mDetailGpsWorkoutUtil.e(muzVarA);
                LogUtil.a(HwDeviceGpsFileWorkoutManager.TAG, "mapType = ", Integer.valueOf(iE), "mRecordId = ", Integer.valueOf(HwDeviceGpsFileWorkoutManager.this.mRecordId));
                HwDeviceGpsFileWorkoutManager.this.mAllMapType.put(Integer.valueOf(HwDeviceGpsFileWorkoutManager.this.mRecordId), Integer.valueOf(iE));
                if (!HwDeviceGpsFileWorkoutManager.this.mGpsFileUtil.c()) {
                    HwDeviceGpsFileWorkoutManager.this.dealWithGps(fileByte, iE);
                } else {
                    HwDeviceGpsFileWorkoutManager.this.dealWithGpsAndRequestPdr(fileByte, muzVarA, iE);
                }
            }
        }

        @Override // com.huawei.hwservicesmgr.ITransferSleepAndDFXFileCallback
        public void onFailure(int i, String str) throws RemoteException {
            ReleaseLogUtil.e(HwDeviceGpsFileWorkoutManager.TAG_RELEASE, "GPS failure errorCode : ", Integer.valueOf(i));
            if (CommonUtil.ap()) {
                xjt.p("GPS failure errorCode : " + i);
            }
            lng.e(i);
            HwDeviceGpsFileWorkoutManager hwDeviceGpsFileWorkoutManager = HwDeviceGpsFileWorkoutManager.this;
            hwDeviceGpsFileWorkoutManager.gpsLogStartPartHandle(i, hwDeviceGpsFileWorkoutManager.mAllMap, HwDeviceGpsFileWorkoutManager.this.mAllMapType, HwDeviceGpsFileWorkoutManager.this.mAllTrackData);
        }
    };
    private ITransferSleepAndDFXFileCallback.Stub mPdrFileCallback = new ITransferSleepAndDFXFileCallback.Stub() { // from class: com.huawei.hwdevice.phoneprocess.mgr.exercise.HwDeviceGpsFileWorkoutManager.2
        @Override // com.huawei.hwservicesmgr.ITransferSleepAndDFXFileCallback
        public void onProgress(int i, String str) throws RemoteException {
        }

        @Override // com.huawei.hwservicesmgr.ITransferSleepAndDFXFileCallback
        public void onSuccess(int i, String str, String str2) throws Throwable {
            ReleaseLogUtil.d(HwDeviceGpsFileWorkoutManager.TAG_RELEASE, "errorCode : ", Integer.valueOf(i));
            if (i == 30000) {
                HwDeviceGpsFileWorkoutManager.this.mGpsFileUtil.e(HwDeviceGpsFileWorkoutManager.this.getFileByte(str), HwDeviceGpsFileWorkoutManager.this.mGpsOrPdrFileName);
                HwDeviceGpsFileWorkoutManager hwDeviceGpsFileWorkoutManager = HwDeviceGpsFileWorkoutManager.this;
                hwDeviceGpsFileWorkoutManager.mPdrFileName = hwDeviceGpsFileWorkoutManager.mGpsOrPdrFileName;
                int postProcessingTrackResult = HwDeviceGpsFileWorkoutManager.this.getPostProcessingTrackResult();
                ReleaseLogUtil.d(HwDeviceGpsFileWorkoutManager.TAG_RELEASE, "trackProcess result :", Integer.valueOf(postProcessingTrackResult));
                if (postProcessingTrackResult != 0) {
                    ReleaseLogUtil.e(HwDeviceGpsFileWorkoutManager.TAG_RELEASE, "result is not 0 return");
                    HwDeviceGpsFileWorkoutManager hwDeviceGpsFileWorkoutManager2 = HwDeviceGpsFileWorkoutManager.this;
                    hwDeviceGpsFileWorkoutManager2.gpsLogStartPartHandle(10001, hwDeviceGpsFileWorkoutManager2.mAllMap, HwDeviceGpsFileWorkoutManager.this.mAllMapType, HwDeviceGpsFileWorkoutManager.this.mAllTrackData);
                } else {
                    ReleaseLogUtil.d(HwDeviceGpsFileWorkoutManager.TAG_RELEASE, "GpsHandle success");
                    HwDeviceGpsFileWorkoutManager hwDeviceGpsFileWorkoutManager3 = HwDeviceGpsFileWorkoutManager.this;
                    hwDeviceGpsFileWorkoutManager3.gpsLogStartPartHandle(10000, hwDeviceGpsFileWorkoutManager3.mAllMap, HwDeviceGpsFileWorkoutManager.this.mAllMapType, HwDeviceGpsFileWorkoutManager.this.mAllTrackData);
                }
            }
        }

        @Override // com.huawei.hwservicesmgr.ITransferSleepAndDFXFileCallback
        public void onFailure(int i, String str) throws RemoteException {
            lng.e(i);
            HwDeviceGpsFileWorkoutManager hwDeviceGpsFileWorkoutManager = HwDeviceGpsFileWorkoutManager.this;
            hwDeviceGpsFileWorkoutManager.gpsLogStartPartHandle(AwarenessStatusCodes.AWARENESS_LOCATION_NOCACHE_CODE, hwDeviceGpsFileWorkoutManager.mAllMap, HwDeviceGpsFileWorkoutManager.this.mAllMapType, HwDeviceGpsFileWorkoutManager.this.mAllTrackData);
            ReleaseLogUtil.d(HwDeviceGpsFileWorkoutManager.TAG_RELEASE, "PDR onFailure errorCode:", Integer.valueOf(i));
            xjt.p("PDR onFailure errorCode : " + i);
        }
    };

    @Override // com.huawei.hwdevice.phoneprocess.binder.ParserInterface
    public void getResult(DeviceInfo deviceInfo, byte[] bArr) {
    }

    private HwDeviceGpsFileWorkoutManager(Context context) {
        this.mContext = null;
        this.mContext = context;
        LogUtil.a(TAG, "HwDeviceGpsFileWorkoutManager() context :", context);
    }

    public static HwDeviceGpsFileWorkoutManager getInstance() {
        HwDeviceGpsFileWorkoutManager hwDeviceGpsFileWorkoutManager;
        synchronized (LOCK) {
            if (sInstance == null) {
                sInstance = new HwDeviceGpsFileWorkoutManager(BaseApplication.getContext());
            }
            hwDeviceGpsFileWorkoutManager = sInstance;
        }
        return hwDeviceGpsFileWorkoutManager;
    }

    public void getWorkoutDetailFromDevice(int i, List<Integer> list, TransferFileCallback transferFileCallback) {
        ReleaseLogUtil.d(TAG_RELEASE, "getWorkoutDetailFromDevice");
        if (transferFileCallback == null) {
            ReleaseLogUtil.e(TAG_RELEASE, "transferFileCallback is null");
            xjt.p("transferFileCallback is null");
            return;
        }
        this.mCallback = transferFileCallback;
        if (list == null) {
            ReleaseLogUtil.e(TAG_RELEASE, "getWorkoutDetailFromDevice workoutRecordIds is null");
            xjt.p("getWorkoutDetailFromDevice workoutRecordIds is null");
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(list);
        TransferFileInfo transferFileInfo = new TransferFileInfo();
        transferFileInfo.setType(1);
        transferFileInfo.setGpsType(i);
        transferFileInfo.setPriority(3);
        transferFileInfo.setSuspend(0);
        transferFileInfo.setTaskType(0);
        transferFileInfo.setRecordId(arrayList);
        DeviceCapability capability = getCapability();
        if (capability != null) {
            ReleaseLogUtil.d(TAG_RELEASE, "deviceCapability.isSupportUploadGpsAndPdrFile():", Boolean.valueOf(capability.isSupportUploadGpsAndPdrFile()));
            if (!capability.isSupportUploadGpsAndPdrFile()) {
                ReleaseLogUtil.d(TAG_RELEASE, "goto old sync file aisle");
                mnn.a().e(transferFileInfo, this.mCallback);
                return;
            } else {
                ReleaseLogUtil.d(TAG_RELEASE, "goto new sync file aisle");
                goToCommonFileTransfer(transferFileInfo);
                return;
            }
        }
        ReleaseLogUtil.e(TAG_RELEASE, "deviceCapability is null");
        xjt.p("deviceCapability is null");
        this.mCallback.onResponse(10002, "deviceCapability is null");
    }

    private DeviceCapability getCapability() {
        Map<String, DeviceCapability> mapQueryDeviceCapability = mkf.e(BaseApplication.getContext()).queryDeviceCapability(4, "", TAG);
        DeviceCapability value = null;
        if (mapQueryDeviceCapability != null && !mapQueryDeviceCapability.isEmpty()) {
            Iterator<Map.Entry<String, DeviceCapability>> it = mapQueryDeviceCapability.entrySet().iterator();
            while (it.hasNext() && (value = it.next().getValue()) == null) {
            }
        }
        return value;
    }

    private void goToCommonFileTransfer(TransferFileInfo transferFileInfo) {
        ReleaseLogUtil.d(TAG_RELEASE, "transferFileInfo:", transferFileInfo.getRecordId());
        this.mRecordIdList = transferFileInfo.getRecordId();
        this.mTimes[0] = transferFileInfo.getStartTime();
        this.mTimes[1] = transferFileInfo.getEndTime();
        sCurrentFileType = 17;
        startRequest(17);
    }

    private void startRequest(int i) {
        ReleaseLogUtil.d(TAG_RELEASE, "enter goToCommonFileTransfer fileType:", Integer.valueOf(i));
        List<Integer> list = this.mRecordIdList;
        if (list != null && !list.isEmpty()) {
            this.mRecordId = this.mRecordIdList.get(0).intValue();
            mhp mhpVar = new mhp();
            mhpVar.c(i);
            mhpVar.e(false);
            mhpVar.c(this.mTimes);
            mhpVar.d(null);
            if (i == 17) {
                this.mGpsOrPdrFileName = this.mRecordId + GPS_SUFFIX;
                this.mAllMap.clear();
                this.mAllMapType.clear();
                this.mAllTrackData.clear();
                mhpVar.a(this.mGpsOrPdrFileName);
                mrj.e().a(mhpVar, this.mGpsFileCallback);
                return;
            }
            String str = this.mRecordId + PDR_SUFFIX;
            this.mGpsOrPdrFileName = str;
            mhpVar.a(str);
            mrj.e().a(mhpVar, this.mPdrFileCallback);
            return;
        }
        ReleaseLogUtil.e(TAG_RELEASE, "recordId is empty");
        xjt.p("recordId is empty");
        this.mCallback.onResponse(10002, "recordId is empty");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getPostProcessingTrackResult() {
        return ((TrackPostProcessApi) Services.b("Module_Track_Post_Process_Service", TrackPostProcessApi.class)).getPostProcessingTrack(this.mGpsFileName, this.mPdrFileName, this.isSupportAltitude, new IBaseResponseCallback() { // from class: com.huawei.hwdevice.phoneprocess.mgr.exercise.HwDeviceGpsFileWorkoutManager$$ExternalSyntheticLambda0
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                this.f$0.m1456xfc916a93(i, obj);
            }
        }, this.mOriginSegInfo);
    }

    /* JADX INFO: renamed from: lambda$getPostProcessingTrackResult$0$com-huawei-hwdevice-phoneprocess-mgr-exercise-HwDeviceGpsFileWorkoutManager, reason: not valid java name */
    /* synthetic */ void m1456xfc916a93(int i, Object obj) {
        if (obj instanceof iln) {
            iln ilnVar = (iln) obj;
            this.mAllMap.put(Integer.valueOf(this.mRecordId), ilnVar.d());
            this.mCorrectedTrackIndexMap = ilnVar.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void gpsLogStartPartHandle(int i, Map<Integer, Map<Long, double[]>> map, Map<Integer, Integer> map2, Map<Integer, List<Long>> map3) {
        HashMap map4 = new HashMap(16);
        HashMap map5 = new HashMap(16);
        HashMap map6 = new HashMap(16);
        if (this.mCallback != null && map != null && map2 != null) {
            for (Map.Entry<Integer, Map<Long, double[]>> entry : map.entrySet()) {
                map4.put(entry.getKey(), entry.getValue());
            }
            for (Map.Entry<Integer, Integer> entry2 : map2.entrySet()) {
                map5.put(entry2.getKey(), entry2.getValue());
            }
            if (map3 != null) {
                for (Map.Entry<Integer, List<Long>> entry3 : map3.entrySet()) {
                    map6.put(entry3.getKey(), entry3.getValue());
                }
            } else {
                map6.put(Integer.valueOf(this.mRecordId), null);
            }
            if (i != 10000) {
                ReleaseLogUtil.e(TAG_RELEASE, "no gps data");
                map4.put(Integer.valueOf(this.mRecordId), null);
                map5.put(Integer.valueOf(this.mRecordId), null);
                map6.put(Integer.valueOf(this.mRecordId), null);
            }
            Object[] objArr = {map4, map5, map6};
            LogUtil.a(TAG, "go to callback", objArr);
            if (i == 30004) {
                this.mCallback.onResponse(10001, objArr);
                return;
            } else {
                this.mCallback.onResponse(10000, objArr);
                return;
            }
        }
        ReleaseLogUtil.e(TAG_RELEASE, "GpsHandle callback is null");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public byte[] getFileByte(String str) throws Throwable {
        FileInputStream fileInputStreamOpenInputStream;
        FileInputStream fileInputStream = null;
        try {
            try {
                File file = FileUtils.getFile(str);
                fileInputStreamOpenInputStream = FileUtils.openInputStream(file);
                try {
                    long length = file.length();
                    if (length > 20971520) {
                        ReleaseLogUtil.e(TAG_RELEASE, "wrong file. file.length is too large.");
                        IoUtils.c(fileInputStreamOpenInputStream);
                        return null;
                    }
                    byte[] bArr = new byte[(int) length];
                    if (fileInputStreamOpenInputStream.read(bArr) == length) {
                        ReleaseLogUtil.d(TAG_RELEASE, "read inputStream success.");
                    }
                    IoUtils.c(fileInputStreamOpenInputStream);
                    return bArr;
                } catch (IOException e) {
                    e = e;
                    fileInputStream = fileInputStreamOpenInputStream;
                    ReleaseLogUtil.a(TAG_RELEASE, "getFileByte : IOException,", ExceptionUtils.c(e));
                    xjt.p("getFileByte : IOException," + ExceptionUtils.c(e));
                    IoUtils.c(fileInputStream);
                    return 0;
                } catch (Throwable th) {
                    th = th;
                    IoUtils.c(fileInputStreamOpenInputStream);
                    throw th;
                }
            } catch (IOException e2) {
                e = e2;
            }
        } catch (Throwable th2) {
            th = th2;
            fileInputStreamOpenInputStream = fileInputStream;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dealWithGps(byte[] bArr, int i) {
        ReleaseLogUtil.d(TAG_RELEASE, "unSupportTrackPostProcessing");
        this.mAllMap.put(Integer.valueOf(this.mRecordId), this.mDetailGpsWorkoutUtil.d(bArr, i));
        gpsLogStartPartHandle(10000, this.mAllMap, this.mAllMapType, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dealWithGpsAndRequestPdr(byte[] bArr, muz muzVar, int i) {
        boolean zD = this.mDetailGpsWorkoutUtil.d(muzVar);
        this.isSupportAltitude = zD;
        ReleaseLogUtil.d(TAG_RELEASE, "mapType :", Integer.valueOf(i), " ,isSupportAltitude :", Boolean.valueOf(zD));
        sCurrentFileType = 18;
        this.mGpsFileName = this.mGpsOrPdrFileName;
        this.mAllTrackData.put(Integer.valueOf(this.mRecordId), this.mGpsFileUtil.d(bArr));
        startRequest(sCurrentFileType);
    }

    public void setOriginSegInfo(String str) {
        this.mOriginSegInfo = str;
    }

    public Map<Integer, Integer> getmCorrectedTrackIndexMap() {
        return this.mCorrectedTrackIndexMap;
    }
}
