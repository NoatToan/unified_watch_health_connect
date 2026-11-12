package com.xiaomi.wearable.gpsalgorithm.impl;

import android.text.TextUtils;
import androidx.annotation.RestrictTo;
import com.airoha.location.SimpleLocation;
import com.airoha.location.TGCData;
import com.airoha.location.TGCParameter;
import com.airoha.location.TGnssProvider;
import com.huami.bluetooth.profile.channel.module.alarm.AlarmModule;
import com.xiaomi.fit.data.common.data.sport.Location;
import com.xiaomi.fit.data.common.data.sport.SportRecordItem;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.wearable.gpsalgorithm.data.GpsTrackData;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class FitnessSportTgcAlgo {
    private static final String TAG = "FitnessSportTgcAlgo";
    private static String mVersion;

    static {
        System.loadLibrary("tgc-pp");
    }

    public static Location fromSimpleLocation(SimpleLocation simpleLocation) {
        Location location = new Location();
        location.locationType = Location.LOCATION_TYPE_GPS;
        location.timeStamp = simpleLocation.getTimestamp() / 1000;
        location.latitude = simpleLocation.getLatitude();
        location.longitude = simpleLocation.getLongitude();
        location.altitude = simpleLocation.getAltitude();
        location.startTimeStamp = simpleLocation.getTimestamp();
        location.distance = 0.0d;
        location.total_distance = 0.0d;
        location.pace = 0;
        location.kilometer = 0;
        location.flagSegment = false;
        location.speed = 0.0f;
        location.time = simpleLocation.getTimestamp();
        location.bearing = 0.0f;
        location.horizontalAccuracy = 0.0f;
        return location;
    }

    public static String getGpsAlgoVersion() {
        if (!TextUtils.isEmpty(mVersion)) {
            return mVersion;
        }
        String strNative_get_version = TGnssProvider.native_get_version();
        if (strNative_get_version == null) {
            return null;
        }
        return strNative_get_version;
    }

    private static TGCData randomLocation() {
        TGCData tGCData = new TGCData();
        byte[] bArr = new byte[96];
        bArr[0] = 10;
        bArr[1] = 11;
        bArr[2] = AlarmModule.CMD_RETURN_CLEAR_ALARM_RESULT;
        for (int i = 3; i < 96; i++) {
            bArr[i] = (byte) Math.floor(Math.random() * 128.0d);
        }
        tGCData.setData(bArr);
        return tGCData;
    }

    public static List<Location> smoothGpsTrack(GpsTrackData gpsTrackData, List<SportRecordItem> list) {
        if (gpsTrackData == null) {
            FitnessLogUtils.w(TAG, "smoothGpsTrack: no original location list, gpsVersion = " + getGpsAlgoVersion());
            return null;
        }
        byte[] bArr = gpsTrackData.tgcBytes;
        int length = bArr.length;
        FitnessLogUtils.i(TAG, "smoothGpsTrack origin size = " + (length / 96) + ", gpsVersion = " + getGpsAlgoVersion());
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < length; i += 96) {
            int iMin = Math.min(96, length - i);
            byte[] bArr2 = new byte[iMin];
            System.arraycopy(bArr, i, bArr2, 0, iMin);
            TGCData tGCData = new TGCData();
            tGCData.setData(bArr2);
            arrayList.add(tGCData);
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        TGCParameter tGCParameter = new TGCParameter();
        TGCParameter.ExercisesMode exercisesMode = TGCParameter.ExercisesMode.WALKING;
        int i2 = gpsTrackData.sportType;
        if (i2 == 1) {
            exercisesMode = TGCParameter.ExercisesMode.RUNNING;
        } else if (i2 == 6) {
            exercisesMode = TGCParameter.ExercisesMode.BIKING;
        }
        ArrayList<Long> arrayList2 = new ArrayList<>();
        if (list != null && !list.isEmpty()) {
            for (int i3 = 0; i3 < list.size(); i3++) {
                arrayList2.add(Long.valueOf(list.get(i3).getEndTime() * 1000));
            }
        }
        tGCParameter.setPauseTimePointMs(arrayList2);
        tGCParameter.setExercisesMode(exercisesMode);
        ArrayList<SimpleLocation> arrayListNative_process_location = TGnssProvider.native_process_location(arrayList, tGCParameter);
        ArrayList arrayList3 = new ArrayList();
        int size = arrayListNative_process_location.size();
        for (int i4 = 0; i4 < size; i4++) {
            arrayList3.add(fromSimpleLocation(arrayListNative_process_location.get(i4)));
        }
        FitnessLogUtils.i(TAG, "smoothGpsTrack time = " + (System.currentTimeMillis() - jCurrentTimeMillis) + ", smooth size = " + arrayList3.size());
        return arrayList3;
    }
}
