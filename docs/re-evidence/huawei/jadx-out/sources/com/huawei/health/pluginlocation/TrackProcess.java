package com.huawei.health.pluginlocation;

import com.huawei.health.baseapi.pluginlocation.callback.HwPluginCloudTrackCallback;
import com.huawei.health.baseapi.pluginlocation.callback.PluginTrackProcessCallback;
import com.huawei.openalliance.ad.constant.JsbMapKeyNames;
import defpackage.gql;
import defpackage.gqm;
import defpackage.gra;
import defpackage.grn;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public class TrackProcess {
    private static final int DEFAULT_SIZE_VALUE = 16;
    private static final int ERROR_CODE_FAIL = -1;
    private static final String TAG = "AAR,TrackProcessClass";
    private static final int WAKELOCK_TIMEOUT = 60000;
    private static int countryCodeNum = 1;
    private static boolean isLoadSuccess = false;
    private HwPluginCloudTrackCallback mCloudTrackCallback;
    private PluginTrackProcessCallback mTrackCallback;

    private native void nativeInitList(String str);

    private native void nativePostEnd(int i, double d);

    private native void nativePostItemGpsPoint(double d, double d2, double d3);

    private native void native_parseTileData(char[] cArr, int i);

    private native int native_postProcessing(char[] cArr, int i, char[] cArr2, int i2, int i3, char[] cArr3);

    static {
        try {
            System.loadLibrary("TrackProcessNew");
            isLoadSuccess = true;
        } catch (UnsatisfiedLinkError unused) {
            grn.e(TAG, "no TrackProcessNew lib");
            isLoadSuccess = false;
        }
    }

    public int getOptimizedTrack(String str, String str2, String str3, PluginTrackProcessCallback pluginTrackProcessCallback) {
        grn.d(TAG, "getOptimizedTrack");
        if (pluginTrackProcessCallback == null) {
            grn.d(TAG, "getOptimizedTrack callback is null");
            return -1;
        }
        if (str == null || str2 == null) {
            grn.d(TAG, "getOptimizedTrack gpsFilePath or pdrFilePath is null");
            pluginTrackProcessCallback.onResponse(-1, null, null);
            return -1;
        }
        this.mTrackCallback = pluginTrackProcessCallback;
        if (!isLoadSuccess) {
            grn.d(TAG, "getOptimizedTrack lib not load");
            return -1;
        }
        gra.d(60000);
        int iNative_postProcessing = native_postProcessing(str.toCharArray(), str.length(), str2.toCharArray(), str2.length(), countryCodeNum, str3 == null ? new char[0] : str3.toCharArray());
        gra.d();
        return iNative_postProcessing;
    }

    public void getCloudTrack(HwPluginCloudTrackCallback hwPluginCloudTrackCallback) {
        if (hwPluginCloudTrackCallback == null) {
            return;
        }
        this.mCloudTrackCallback = hwPluginCloudTrackCallback;
    }

    public void getPostProcessingResult(ArrayList<TrajectoryPoint> arrayList, Map<Integer, Integer> map) {
        grn.d(TAG, "getPostProcessingResult");
        this.mTrackCallback.onResponse(0, arrayList, map);
    }

    void requestDownloadMotionPath(String str, double d, double d2, int i, int i2) {
        HashMap map = new HashMap(16);
        map.put(JsbMapKeyNames.H5_LOC_LON, Double.valueOf(d));
        map.put(JsbMapKeyNames.H5_LOC_LAT, Double.valueOf(d2));
        map.put("pathId", str);
        map.put("searchScope", Integer.valueOf(i));
        map.put("type", Integer.valueOf(i2));
        HwPluginCloudTrackCallback hwPluginCloudTrackCallback = this.mCloudTrackCallback;
        if (hwPluginCloudTrackCallback == null) {
            return;
        }
        hwPluginCloudTrackCallback.onResponse(0, map);
    }

    public void postMotionPath(List<gqm> list) {
        gqm next;
        if (list == null) {
            return;
        }
        Iterator<gqm> it = list.iterator();
        while (it.hasNext() && (next = it.next()) != null) {
            nativeInitList(next.a());
            List<gql> listE = next.e();
            if (listE == null) {
                return;
            }
            for (gql gqlVar : listE) {
                nativePostItemGpsPoint(gqlVar.b(), gqlVar.d(), gqlVar.e());
            }
            nativePostEnd(next.d(), next.c());
        }
    }

    public static void printInfo(String str) {
        grn.d("TrackProcess", str);
    }

    public static void printErr(String str) {
        grn.c("TraceProcess", str);
    }

    public void setCountryCode(String str) {
        if (str == null) {
            countryCodeNum = 1;
            grn.d(TAG, "[setCountryCode], countryCodeNum: " + countryCodeNum);
            return;
        }
        String strTrim = str.toUpperCase().trim();
        if (!"CN".equals(strTrim) && !"CHN".equals(strTrim)) {
            countryCodeNum = 0;
        }
        grn.d(TAG, "[setCountryCode] countryCodeNum: " + countryCodeNum + ", code: " + strTrim);
    }

    public void parseTileData(String str) {
        grn.d(TAG, "[parseTileData], start.");
        native_parseTileData(str.toCharArray(), str.length());
        grn.d(TAG, "[parseTileData], over.");
    }
}
