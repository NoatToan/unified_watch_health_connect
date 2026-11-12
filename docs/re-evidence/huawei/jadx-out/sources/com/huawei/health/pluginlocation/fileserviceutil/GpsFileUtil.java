package com.huawei.health.pluginlocation.fileserviceutil;

import android.content.Context;
import android.location.Location;
import android.text.TextUtils;
import android.util.Log;
import com.huawei.health.baseapi.pluginlocation.callback.HwPluginTrackMapCallback;
import com.huawei.health.baseapi.pluginlocation.callback.PluginTrackProcessCallback;
import com.huawei.health.pluginlocation.GpsData;
import com.huawei.health.pluginlocation.TrackProcess;
import com.huawei.health.pluginlocation.TrajectoryPoint;
import defpackage.gqr;
import defpackage.gqt;
import defpackage.gqw;
import defpackage.gqz;
import defpackage.grc;
import defpackage.grn;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
public class GpsFileUtil {
    private static final int DEFAULT_SIZE_VALUE = 16;
    private static final int MIN_GPSBIN_LENGTH = 21;
    private static final String TAG = "AAR,GpsFileUtil";
    private static final int TRACK_POINT_MESSAGE_ALTITUDE = 2;
    private static final int TRACK_POINT_MESSAGE_LATITUDE = 0;
    private static final int TRACK_POINT_MESSAGE_LENGTH = 4;
    private static final int TRACK_POINT_MESSAGE_LONGITUDE = 1;
    private static final int TRACK_POINT_MESSAGE_UTC_TIME = 3;
    private static Context context;
    private static String url;
    private boolean isBetaVersion;
    private boolean isDebugVersion;
    private PluginTrackProcessCallback mPluginTrackProcessCallback;
    private static gqt downloadUtil = new gqt();
    private static TrackProcess trackProcess = new TrackProcess();
    private static GpsData gpsPoint = null;
    private static String countryCode = null;
    private static String GRS_SERVICENAME = "com.huawei.higeo.vdm";
    private static String GRS_KEY = "ROOT";
    private static int TILENUM_LEVEL = 9;
    private static double RADIUS_KM = 5.0d;

    /* JADX INFO: loaded from: classes30.dex */
    public enum UserStatus {
        UNKNOWN,
        AGREE,
        DISAGREE
    }

    public int pluginGetOptimizedTrack(final String str, final String str2, final boolean z, final HwPluginTrackMapCallback hwPluginTrackMapCallback, final boolean z2, String str3) {
        Context context2 = context;
        if (context2 == null || context2.getExternalCacheDir() == null || context.getExternalCacheDir().getParentFile() == null || context.getExternalCacheDir().getParentFile().getPath() == null) {
            grn.c(TAG, "context get external cache dir failed");
            if (hwPluginTrackMapCallback != null) {
                hwPluginTrackMapCallback.onResponse(1, null, null);
            } else {
                grn.c(TAG, "mHwPluginTrackMapCallback is null");
            }
            return -1;
        }
        getGpsPoint(str);
        GpsData gpsData = gpsPoint;
        if (gpsData == null) {
            grn.c(TAG, "[pluginGetOptimizedTrack], gpsPoint is null");
            return -1;
        }
        countryCode = gqw.d(context, gpsPoint.getLatitude(), gpsData.getLongitude());
        grn.d(TAG, "[pluginGetOptimizedTrack], countryCode = " + countryCode);
        trackProcess.setCountryCode(countryCode);
        startDownload();
        PluginTrackProcessCallback pluginTrackProcessCallback = new PluginTrackProcessCallback() { // from class: com.huawei.health.pluginlocation.fileserviceutil.GpsFileUtil.2
            @Override // com.huawei.health.baseapi.pluginlocation.callback.PluginTrackProcessCallback
            public void onResponse(int i, ArrayList<TrajectoryPoint> arrayList, Map<Integer, Integer> map) {
                if (!GpsFileUtil.this.isDebugVersion && (!GpsFileUtil.this.isBetaVersion || !z)) {
                    try {
                        File file = new File(str);
                        if (file.exists()) {
                            file.delete();
                        }
                        File file2 = new File(str2);
                        if (file2.exists()) {
                            file2.delete();
                        }
                    } catch (Exception unused) {
                        grn.e(GpsFileUtil.TAG, "pluginGetOptimizedTrack Exception");
                    }
                }
                if (i == 0) {
                    Map<Long, double[]> trackMessage = GpsFileUtil.this.getTrackMessage(arrayList, z2);
                    HwPluginTrackMapCallback hwPluginTrackMapCallback2 = hwPluginTrackMapCallback;
                    if (hwPluginTrackMapCallback2 != null) {
                        hwPluginTrackMapCallback2.onResponse(0, trackMessage, map);
                        return;
                    }
                    return;
                }
                HwPluginTrackMapCallback hwPluginTrackMapCallback3 = hwPluginTrackMapCallback;
                if (hwPluginTrackMapCallback3 != null) {
                    hwPluginTrackMapCallback3.onResponse(1, null, null);
                }
            }
        };
        this.mPluginTrackProcessCallback = pluginTrackProcessCallback;
        return trackProcess.getOptimizedTrack(str, str2, str3, pluginTrackProcessCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<Long, double[]> getTrackMessage(ArrayList<TrajectoryPoint> arrayList, boolean z) {
        grn.d(TAG, "getTrackMessage");
        HashMap map = new HashMap(16);
        for (int i = 0; i < arrayList.size(); i++) {
            double[] dArr = new double[4];
            dArr[0] = arrayList.get(i).getLatitude();
            dArr[1] = arrayList.get(i).getLongitude();
            if (z) {
                dArr[2] = arrayList.get(i).getAltitude();
            } else {
                dArr[2] = 0.0d;
            }
            dArr[3] = arrayList.get(i).getUtc_time();
            map.put(Long.valueOf(i), dArr);
        }
        return map;
    }

    public void setExtraData(boolean z, boolean z2, Context context2, String str) {
        this.isBetaVersion = z2;
        this.isDebugVersion = z;
        context = context2;
        url = str;
    }

    public static void getGpsPoint(String str) {
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(str, "r");
            long length = randomAccessFile.length();
            if (length >= 21) {
                byte[] bArr = new byte[(int) length];
                randomAccessFile.readFully(bArr);
                ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
                byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
                byteBufferWrap.position(1);
                int i = byteBufferWrap.getInt();
                double d = byteBufferWrap.getDouble();
                double d2 = byteBufferWrap.getDouble();
                if (isValidGpsCoordinate(d2, d)) {
                    gpsPoint = new GpsData(i, d2, d);
                }
            } else {
                grn.c(TAG, "[getGpsPoint], file too small: " + length);
            }
            randomAccessFile.close();
        } catch (IOException e) {
            grn.c(TAG, "[getGpsPoint], error parsing GPS file: " + e.getMessage());
        }
    }

    public static boolean isValidGpsCoordinate(double d, double d2) {
        if (d < -90.0d || d > 90.0d || Double.isNaN(d)) {
            grn.c(TAG, "[isValidGpsCoordinate] Latitude out range: -90° to +90°.");
            return false;
        }
        if (d2 >= -180.0d && d2 <= 180.0d && !Double.isNaN(d2)) {
            return true;
        }
        grn.c(TAG, "[isValidGpsCoordinate] Longitude out range: -180° to +180°.");
        return false;
    }

    public static void startDownload() {
        if (TextUtils.isEmpty(countryCode)) {
            grn.c(TAG, "[startDownload], countryCode is null");
            return;
        }
        grn.d(TAG, "[startDownload], countryCode is " + countryCode);
        new Thread(new Runnable() { // from class: com.huawei.health.pluginlocation.fileserviceutil.GpsFileUtil.5
            @Override // java.lang.Runnable
            public void run() {
                String str = ((File) Objects.requireNonNull(((File) Objects.requireNonNull(GpsFileUtil.context.getExternalCacheDir())).getParentFile())).getPath() + "/files/RunwayRoutes/roadData/";
                String strA = grc.a("UserStatus", "UNKNOWN", GpsFileUtil.context);
                grn.d(GpsFileUtil.TAG, "[startDownload] contextDir = " + GpsFileUtil.context.getFilesDir());
                grn.d(GpsFileUtil.TAG, "[startDownload] UserStatus = " + strA);
                if ("CN".equalsIgnoreCase(GpsFileUtil.countryCode)) {
                    if (GpsFileUtil.url.isEmpty()) {
                        grn.c(GpsFileUtil.TAG, "[startDownload] url is empty.");
                        return;
                    }
                    grn.d(GpsFileUtil.TAG, "[startDownload] download start url = " + GpsFileUtil.url + " savePath = " + str);
                    GpsFileUtil.downloadUtil.a(GpsFileUtil.context, GpsFileUtil.url, str);
                    return;
                }
                if (!"AGREE".equalsIgnoreCase(strA) && gqz.a(GpsFileUtil.context)) {
                    grn.e(GpsFileUtil.TAG, "[startDownload], user not agree download. UserStatus = " + strA);
                }
                if (!GpsFileUtil.url.isEmpty()) {
                    GpsFileUtil.downloadUtil.c(GpsFileUtil.context, GpsFileUtil.url, str);
                }
                String strB = gqw.b(GpsFileUtil.context, GpsFileUtil.countryCode).b(GpsFileUtil.GRS_SERVICENAME, GpsFileUtil.GRS_KEY);
                if (TextUtils.isEmpty(strB)) {
                    grn.c(GpsFileUtil.TAG, "[startDownload], url is null, stop download.");
                    return;
                }
                String unused = GpsFileUtil.url = strB + "/higeo/v2/geoFile";
                long jE = grc.e("download_time", 0L, GpsFileUtil.context);
                grn.d(GpsFileUtil.TAG, "[startDownload] download start url = " + GpsFileUtil.url + " savePath = " + str);
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append("tile9/");
                String string = sb.toString();
                List<String> listB = gqr.b(GpsFileUtil.gpsPoint.getLatitude(), GpsFileUtil.gpsPoint.getLongitude(), GpsFileUtil.TILENUM_LEVEL, GpsFileUtil.RADIUS_KM);
                grn.d(GpsFileUtil.TAG, "[startDownload], tileIDs = ", listB.toString());
                GpsFileUtil.downloadUtil.b(GpsFileUtil.context, GpsFileUtil.url, string, listB, GpsFileUtil.countryCode);
                grn.d(GpsFileUtil.TAG, "[startDownload], download over.");
                if (grc.e("download_time", 0L, GpsFileUtil.context) > jE) {
                    GpsFileUtil.trackProcess.parseTileData(str);
                }
            }
        }).start();
    }

    public static void setCountryCode(String str) {
        countryCode = str;
    }

    public static void setGpsPoint(Location location) {
        gpsPoint = new GpsData(location.getTime(), location.getLatitude(), location.getLongitude());
    }

    public static void setContext(Context context2) {
        context = context2;
    }

    public static boolean setUserStates(UserStatus userStatus, Context context2) {
        Log.i(TAG, "[setUserStates] UserStatus = " + userStatus.name());
        Log.i(TAG, "[setUserStates] contextDir = " + context2.getFilesDir());
        grn.d(TAG, "[setUserStates] UserStatus = " + userStatus.name());
        grn.d(TAG, "[setUserStates] contextDir = " + context2.getFilesDir());
        try {
            grc.d("UserStatus", userStatus.name(), context2);
            Log.i(TAG, "[setUserStates] UserStatus set over.");
            grn.d(TAG, "[setUserStates] UserStatus set over.");
            return true;
        } catch (Exception e) {
            Log.i(TAG, "[setUserStates] SharedPreferencesUtil putString fail: " + e.getMessage());
            grn.d("[setUserStates] SharedPreferencesUtil putString fail: " + e.getMessage(), new Object[0]);
            return false;
        }
    }
}
