package com.huawei.healthcloud.plugintrack.golf.cloud;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.featureuserprofile.route.navigationparser.NavigationFileParser;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.utils.CollectionUtils;
import com.huawei.healthcloud.plugintrack.golf.Utils;
import com.huawei.healthcloud.plugintrack.golf.bean.GolfCourseMapInfo;
import com.huawei.healthcloud.plugintrack.golf.cloud.beans.CourseMapData;
import com.huawei.healthcloud.plugintrack.golf.cloud.beans.HandshakeInfo;
import com.huawei.healthcloud.plugintrack.golf.cloud.requests.GetGolfCourseMapDataReq;
import com.huawei.healthcloud.plugintrack.golf.device.GolfDeviceProxy;
import com.huawei.healthcloud.plugintrack.golf.h5.GolfH5DownloadInterface;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.networkclient.ProgressListener;
import com.huawei.openalliance.ad.constant.ParamConstants;
import defpackage.oer;
import defpackage.oet;
import health.compact.a.util.LogUtil;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class GolfDownloadTaskUtils {
    private static final int AES_HEADER = 9;
    private static final int AES_IV_LENGTH = 12;
    private static final float DOWNLOAD_WEIGHT = 0.5f;
    private static final int SUFFIX_LENGTH = 3;
    private static final String TAG = "Track_GolfDownloadTaskUtils";
    private static GolfEncryptionUtils encryptionUtils;
    private static volatile GolfDownloadTaskUtils instance;
    public static HashMap<Long, GolfDownloadTask> taskMap = new HashMap<>();
    private static final Object LOCK = new Object();
    private static final Map<Long, GolfH5DownloadInterface.InvokerBundle> sDownloadInvokers = new HashMap();
    private static final List<Long> sBgUpdateCourseIds = new ArrayList();

    public enum DeviceType {
        LITE_WEARABLE(0, "lite_wearable"),
        WEARABLE(1, "wearable");

        private final int index;
        private final String type;

        DeviceType(int i, String str) {
            this.index = i;
            this.type = str;
        }

        public static String getType(int i) {
            for (DeviceType deviceType : values()) {
                if (deviceType.getIndex() == i) {
                    return deviceType.type;
                }
            }
            return null;
        }

        public static DeviceType getDeviceType(int i) {
            for (DeviceType deviceType : values()) {
                if (deviceType.getIndex() == i) {
                    return deviceType;
                }
            }
            return null;
        }

        public int getIndex() {
            return this.index;
        }
    }

    public void downloadHandler(long j, int i, int i2, GolfH5DownloadInterface.InvokerBundle invokerBundle, boolean z) {
        download(j, i, i2, invokerBundle, z);
    }

    public void sendGolfManualDownloadMsg() {
        if (taskMap.isEmpty() || !GolfDeviceProxy.getInstance().isSupportGolfAutoDownload()) {
            return;
        }
        GolfDeviceProxy.getInstance().sendGolfManualDownloadMsg();
    }

    private void download(long j, int i, int i2, GolfH5DownloadInterface.InvokerBundle invokerBundle, boolean z) {
        DeviceType deviceType = DeviceType.getDeviceType(i);
        if (deviceType == null) {
            LogUtil.d(TAG, "downloadHandler deviceType is null");
            return;
        }
        String golfMapDeviceLevel = Utils.getGolfMapDeviceLevel(TAG);
        boolean zContains = golfMapDeviceLevel.contains(GetGolfCourseMapDataReq.MapLevel.VECTOR_LEVEL);
        GetGolfCourseMapDataReq.Builder builderMapLevel = new GetGolfCourseMapDataReq.Builder().addCourseId(Long.valueOf(j)).language(Utils.getLanguage()).type(DeviceType.getType(i)).isAnon(z).mapLevel(golfMapDeviceLevel);
        if (isNotVectorWearable(deviceType, zContains ? 1 : 0)) {
            GolfEncryptionUtils golfEncryptionUtils = GolfEncryptionUtils.getInstance();
            encryptionUtils = golfEncryptionUtils;
            builderMapLevel.publicKey(golfEncryptionUtils.getPublicKey());
        }
        List<CourseMapData> courseMapDataList = CloudManager.getInstance().getGolfCourseMapData(builderMapLevel.build()).getCourseMapDataList();
        if (CollectionUtils.a(courseMapDataList)) {
            LogUtil.d(TAG, "downloadHandler list ", courseMapDataList);
            return;
        }
        CourseMapData courseMapData = courseMapDataList.get(0);
        if (courseMapData == null) {
            LogUtil.d(TAG, "downloadHandler data is null");
            return;
        }
        Context contextB = BaseApplication.b();
        String str = contextB.getFilesDir() + File.separator + LoginInit.getInstance(contextB).getAccountInfo(1011) + File.separator + j + ".zip";
        LogUtil.a(TAG, "downloadHandler courseId ", Long.valueOf(j), " deviceTypeIndex ", Integer.valueOf(i), " msgId ", Integer.valueOf(i2), " isAnon ", Boolean.valueOf(z), " localPath ", str);
        taskMap.put(Long.valueOf(j), new GolfDownloadTask(courseMapData.getUrl(), str, i2, z));
        GolfDownloadTask golfDownloadTask = taskMap.get(Long.valueOf(j));
        if (golfDownloadTask == null || golfDownloadTask.isNeedCancel()) {
            StringBuilder sb = new StringBuilder("downloadHandler Task == null is ");
            sb.append(golfDownloadTask == null);
            sb.append(", Download Stopped");
            LogUtil.d(TAG, sb.toString());
            return;
        }
        putDownloadInvoker(invokerBundle, j);
        downloadHelper(golfDownloadTask, getGolfCourseMapInfo(courseMapData, deviceType, j, zContains ? 1 : 0, zContains), deviceType);
    }

    private GolfCourseMapInfo getGolfCourseMapInfo(CourseMapData courseMapData, DeviceType deviceType, long j, int i, boolean z) {
        String rqrDeviceLevel = courseMapData.getRqrDeviceLevel();
        boolean z2 = !TextUtils.isEmpty(rqrDeviceLevel) && rqrDeviceLevel.contains(GetGolfCourseMapDataReq.MapLevel.VECTOR_LEVEL);
        LogUtil.a(TAG, "getGolfCourseMapInfo rqrDeviceLevel ", rqrDeviceLevel, " mapStyle ", Integer.valueOf(i), " deviceType.type ", deviceType.type, " isSupportVectorByWatch ", Boolean.valueOf(z), " isSupportVectorByCloud ", Boolean.valueOf(z2));
        GolfCourseMapInfo golfCourseMapInfo = new GolfCourseMapInfo();
        if (z && z2) {
            golfCourseMapInfo.setMapStyle(1);
        }
        if (isNotVectorWearable(deviceType, i)) {
            golfCourseMapInfo.setIvLength(12);
            golfCourseMapInfo.setAesHeaderLength(9);
            golfCourseMapInfo.setKey(encryptionUtils.decryption(courseMapData.getSecretKey()));
            golfCourseMapInfo.setAlgorithm(courseMapData.getCryptoAlg());
        }
        golfCourseMapInfo.setCourseId((int) j);
        return golfCourseMapInfo;
    }

    public boolean isNotVectorWearable(DeviceType deviceType, int i) {
        return deviceType == DeviceType.WEARABLE && i != 1;
    }

    public void bgUpdateDownloadHandler(long j, int i, int i2) {
        sBgUpdateCourseIds.add(Long.valueOf(j));
        sendGolfManualDownloadMsg();
        downloadHandler(j, i, i2, null, false);
    }

    private void downloadHelper(final GolfDownloadTask golfDownloadTask, final GolfCourseMapInfo golfCourseMapInfo, final DeviceType deviceType) {
        ProgressListener<File> progressListener = new ProgressListener<File>() { // from class: com.huawei.healthcloud.plugintrack.golf.cloud.GolfDownloadTaskUtils.1
            @Override // com.huawei.networkclient.ProgressListener
            public void onFinish(File file) {
                int courseId = golfCourseMapInfo.getCourseId();
                long j = courseId;
                if (GolfDownloadTaskUtils.this.isCourseNeedCancel(j)) {
                    GolfDownloadTaskUtils.this.removeCourseId(j);
                    LogUtil.a(GolfDownloadTaskUtils.TAG, "Course is cancel with ", Integer.valueOf(courseId), file.delete() ? "success" : ParamConstants.CallbackMethod.ON_FAIL);
                } else if (GolfDownloadTaskUtils.this.isNotVectorWearable(deviceType, golfCourseMapInfo.getMapStyle())) {
                    GolfDownloadTaskUtils.this.handleWearableFile(file, golfCourseMapInfo, golfDownloadTask.getMsgId(), golfDownloadTask.isAnon());
                } else {
                    GolfDownloadTaskUtils.this.handleLiteWearableFile(file, golfCourseMapInfo, golfDownloadTask.getMsgId(), golfDownloadTask.isAnon());
                }
            }

            @Override // com.huawei.networkclient.ProgressListener
            public void onProgress(long j, long j2, boolean z) {
                int i = (int) (((j * 1.0d) / j2) * 100.0d);
                int courseId = golfCourseMapInfo.getCourseId();
                GolfH5DownloadInterface.InvokerBundle invoker = GolfDownloadTaskUtils.this.getInvoker(courseId);
                if (invoker == null || i % 2 != 0) {
                    return;
                }
                invoker.onSuccess((i * 0.5f) + "", courseId, 1);
            }

            @Override // com.huawei.networkclient.ProgressListener
            public void onFail(Throwable th) {
                LogUtil.e(GolfDownloadTaskUtils.TAG, "Download Failed: " + th.getMessage());
                GolfH5DownloadInterface.InvokerBundle invoker = GolfDownloadTaskUtils.this.getInvoker((long) golfCourseMapInfo.getCourseId());
                if (invoker != null) {
                    invoker.onFailure(1, th.getMessage(), golfCourseMapInfo.getCourseId());
                }
            }
        };
        File file = new File(golfDownloadTask.getFilePath());
        if (file.exists()) {
            LogUtil.a(TAG, "DeleteFile : ", file.delete() ? "Success" : "Failed");
        }
        LogUtil.a(TAG, "CreateFile : ", file.mkdirs() ? "Success" : "Failed");
        oet.d().a(new oer(golfDownloadTask.getUrl(), null, file, progressListener));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleLiteWearableFile(File file, GolfCourseMapInfo golfCourseMapInfo, int i, boolean z) {
        String str = file.getAbsolutePath().substring(0, file.getAbsolutePath().length() - 3) + NavigationFileParser.BIN;
        LogUtil.a(TAG, "UnZipping...");
        GolfZipUtils.unZipBinFile(file, str);
        LogUtil.a(TAG, "unZipBinFile: Zip File Deleted: " + file.delete());
        golfCourseMapInfo.setMapFile(new File(str));
        notifyTransmission(golfCourseMapInfo, i, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleWearableFile(File file, GolfCourseMapInfo golfCourseMapInfo, int i, boolean z) {
        golfCourseMapInfo.setMapFile(file);
        notifyTransmission(golfCourseMapInfo, i, z);
    }

    private void notifyTransmission(GolfCourseMapInfo golfCourseMapInfo, int i, boolean z) {
        HandshakeInfo handshakeInfo = new HandshakeInfo();
        handshakeInfo.setCourseMapInfo(golfCourseMapInfo);
        handshakeInfo.setMessageId(i);
        GolfDownloadObservable golfDownloadObservable = new GolfDownloadObservable();
        golfDownloadObservable.addObserver(new GolfDownloadObserver(z));
        golfDownloadObservable.setData(handshakeInfo);
    }

    public static GolfDownloadTaskUtils getInstance() {
        if (instance == null) {
            synchronized (LOCK) {
                if (instance == null) {
                    instance = new GolfDownloadTaskUtils();
                }
            }
        }
        return instance;
    }

    public void cancelDownloadTask(long j) {
        GolfDownloadTask golfDownloadTask = taskMap.get(Long.valueOf(j));
        if (golfDownloadTask == null) {
            LogUtil.a(TAG, "Download Task for CourseId: " + j + " is not available");
            return;
        }
        golfDownloadTask.setNeedCancel(true);
        String url = golfDownloadTask.getUrl();
        if (url == null) {
            LogUtil.a(TAG, "Download Task haven't Start");
            return;
        }
        if (!oet.d().b(url)) {
            LogUtil.a(TAG, "Download Task is finished");
            return;
        }
        File file = new File(golfDownloadTask.filePath);
        if (file.exists()) {
            LogUtil.a(TAG, "Task Canceled, DeleteFile : ", file.delete() ? "Success" : "Failed");
        }
        removeCourseId(j);
        LogUtil.a(TAG, "Download Task cancel success");
    }

    public boolean isBgUpdate(long j) {
        return sBgUpdateCourseIds.contains(Long.valueOf(j));
    }

    public void removeBgUpdate(long j) {
        sBgUpdateCourseIds.remove(Long.valueOf(j));
        sDownloadInvokers.remove(Long.valueOf(j));
    }

    public void clearBgUpdate() {
        for (Map.Entry<Long, GolfH5DownloadInterface.InvokerBundle> entry : sDownloadInvokers.entrySet()) {
            if (entry.getValue() != null && getInstance().isBgUpdate(entry.getKey().longValue())) {
                sDownloadInvokers.remove(entry.getKey());
            }
        }
        sBgUpdateCourseIds.clear();
    }

    public long[] getBgUpdateCourseIds() {
        long[] jArr = new long[sBgUpdateCourseIds.size()];
        int i = 0;
        while (true) {
            List<Long> list = sBgUpdateCourseIds;
            if (i >= list.size()) {
                return jArr;
            }
            jArr[i] = list.get(i).longValue();
            i++;
        }
    }

    public void putDownloadInvoker(GolfH5DownloadInterface.InvokerBundle invokerBundle, long... jArr) {
        for (long j : jArr) {
            sDownloadInvokers.put(Long.valueOf(j), invokerBundle);
        }
    }

    public GolfH5DownloadInterface.InvokerBundle getInvoker(long j) {
        return sDownloadInvokers.get(Long.valueOf(j));
    }

    public GolfH5DownloadInterface.InvokerBundle getBgUpdateInvoker() {
        for (Map.Entry<Long, GolfH5DownloadInterface.InvokerBundle> entry : sDownloadInvokers.entrySet()) {
            GolfH5DownloadInterface.InvokerBundle value = entry.getValue();
            if (value != null && getInstance().isBgUpdate(entry.getKey().longValue())) {
                return value;
            }
        }
        return null;
    }

    public boolean isCourseDownloading(long j) {
        return (taskMap.isEmpty() || taskMap.get(Long.valueOf(j)) == null) ? false : true;
    }

    public boolean isCourseNeedCancel(long j) {
        GolfDownloadTask golfDownloadTask = taskMap.get(Long.valueOf(j));
        return golfDownloadTask == null || golfDownloadTask.isNeedCancel();
    }

    public boolean isCourseNeedCancel(GolfDownloadTask golfDownloadTask) {
        return golfDownloadTask == null || golfDownloadTask.isNeedCancel();
    }

    public void removeCourseId(long j) {
        taskMap.remove(Long.valueOf(j));
    }

    public boolean isRetry(long j) {
        GolfDownloadTask golfDownloadTask = taskMap.get(Long.valueOf(j));
        return !isCourseNeedCancel(golfDownloadTask) && golfDownloadTask.getRetryCount() < 1;
    }

    public void retry(long j) {
        GolfDownloadTask golfDownloadTask = taskMap.get(Long.valueOf(j));
        if (isCourseNeedCancel(golfDownloadTask)) {
            return;
        }
        golfDownloadTask.setRetryCount(golfDownloadTask.getRetryCount() + 1);
    }

    public boolean isAnon(long j) {
        GolfDownloadTask golfDownloadTask = taskMap.get(Long.valueOf(j));
        if (isCourseNeedCancel(golfDownloadTask)) {
            return false;
        }
        return golfDownloadTask.isAnon();
    }

    static class GolfDownloadTask {
        private String filePath;
        private boolean isAnon;
        private int msgId;
        private boolean needCancel = false;
        private int retryCount;
        private final String url;

        GolfDownloadTask(String str, String str2, int i, boolean z) {
            this.url = str;
            this.filePath = str2;
            this.msgId = i;
            this.isAnon = z;
        }

        public boolean isAnon() {
            return this.isAnon;
        }

        public void setAnon(boolean z) {
            this.isAnon = z;
        }

        public int getMsgId() {
            return this.msgId;
        }

        public void setMsgId(int i) {
            this.msgId = i;
        }

        public int getRetryCount() {
            return this.retryCount;
        }

        public void setRetryCount(int i) {
            this.retryCount = i;
        }

        public void setNeedCancel(boolean z) {
            this.needCancel = z;
        }

        public String getFilePath() {
            return this.filePath;
        }

        public void setFilePath(String str) {
            this.filePath = str;
        }

        public String getUrl() {
            return this.url;
        }

        public boolean isNeedCancel() {
            return this.needCancel;
        }
    }
}
