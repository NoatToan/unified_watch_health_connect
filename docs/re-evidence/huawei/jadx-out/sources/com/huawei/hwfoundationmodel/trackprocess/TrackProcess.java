package com.huawei.hwfoundationmodel.trackprocess;

import com.huawei.health.track.post.process.callback.CloudTrackCallback;
import com.huawei.health.track.post.process.callback.TrackProcessCallback;
import com.huawei.health.trackprocess.model.GpsPoint;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.JsbMapKeyNames;
import defpackage.ilg;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes38.dex */
public class TrackProcess {
    private static final int ERROR_CODE_FAIL = -1;
    private static final String TAG = "TrackProcessClass";
    private static final String TAG_RELEASE = "BTSYNC_TrackProcessClass";
    private CloudTrackCallback mCloudTrackCallback;
    private TrackProcessCallback mTrackCallback;

    private native void nativeInitList(String str);

    private native void nativePostEnd(int i, double d);

    private native void nativePostItemGpsPoint(double d, double d2, double d3);

    public native int native_postProcessing(char[] cArr, int i, char[] cArr2, int i2);

    static {
        try {
            System.loadLibrary("TrackProcess");
            LogUtil.a(TAG, "load lib TrackProcess success");
        } catch (UnsatisfiedLinkError e) {
            LogUtil.e(TAG, "load TrackProcess error:", e.getMessage());
        }
    }

    public int getOptimizedTrack(String str, String str2, TrackProcessCallback trackProcessCallback) {
        if (trackProcessCallback == null) {
            ReleaseLogUtil.e(TAG_RELEASE, "callback is null");
            return -1;
        }
        if (str == null || str2 == null) {
            ReleaseLogUtil.e(TAG_RELEASE, "filePath is null");
            trackProcessCallback.onResponse(-1, null);
            return -1;
        }
        LogUtil.d(TAG, "getOptimizedTrack gpsFilePath:", str, ";pdrFilePath:", str2);
        this.mTrackCallback = trackProcessCallback;
        return native_postProcessing(str.toCharArray(), str.length(), str2.toCharArray(), str2.length());
    }

    public void getCloudTrack(CloudTrackCallback cloudTrackCallback) {
        if (cloudTrackCallback == null) {
            LogUtil.j(TAG, "getCloudTrack CloudTrackCallback is null");
        } else {
            this.mCloudTrackCallback = cloudTrackCallback;
        }
    }

    void getPostProcessingResult(ArrayList<TrajectoryPoint> arrayList) {
        LogUtil.d(TAG, "callback processresult：", Integer.valueOf(arrayList.size()));
        this.mTrackCallback.onResponse(0, arrayList);
    }

    void requestDownloadMotionPath(String str, double d, double d2, int i, int i2) {
        LogUtil.a(TAG, "requestDownloadMotionPath");
        HashMap map = new HashMap(16);
        map.put(JsbMapKeyNames.H5_LOC_LON, Double.valueOf(d));
        map.put(JsbMapKeyNames.H5_LOC_LAT, Double.valueOf(d2));
        map.put("pathId", str);
        map.put("searchScope", Integer.valueOf(i));
        map.put("type", Integer.valueOf(i2));
        CloudTrackCallback cloudTrackCallback = this.mCloudTrackCallback;
        if (cloudTrackCallback == null) {
            LogUtil.j(TAG, "requestDownloadMotionPath CloudTrackCallback is null");
        } else {
            cloudTrackCallback.onResponse(0, map);
        }
    }

    public void postMotionPath(List<ilg> list) {
        if (list == null) {
            LogUtil.j(TAG, "postMotionPath pathInfoList is null");
            return;
        }
        for (ilg ilgVar : list) {
            if (ilgVar == null) {
                LogUtil.j(TAG, "postMotionPath pathInfo is null");
                return;
            }
            nativeInitList(ilgVar.a());
            List<GpsPoint> listF = ilgVar.f();
            if (listF == null) {
                LogUtil.j(TAG, "postMotionPath gpsPoints is null");
                return;
            }
            LogUtil.d(TAG, "postMotionPath pointSize :", Integer.valueOf(listF.size()));
            for (GpsPoint gpsPoint : listF) {
                nativePostItemGpsPoint(gpsPoint.getLatitude(), gpsPoint.getLongitude(), gpsPoint.getAltitude());
            }
            nativePostEnd(ilgVar.d(), ilgVar.b());
        }
    }
}
