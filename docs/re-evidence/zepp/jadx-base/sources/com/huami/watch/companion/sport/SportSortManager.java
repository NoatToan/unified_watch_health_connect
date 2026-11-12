package com.huami.watch.companion.sport;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.huami.watch.companion.R;
import com.huami.watch.companion.device.Device;
import com.huami.watch.companion.device.DeviceManager;
import com.huami.watch.companion.device.DeviceSource;
import com.huami.watch.companion.device.DeviceUtil;
import com.huami.watch.companion.ui.activity.SportItemSortActivity;
import com.huami.watch.companion.ui.activity.SportSortV2Activity;
import com.huami.watch.companion.usersettings.UserSettings;
import com.huami.watch.companion.usersettings.UserSettingsKeys;
import com.huami.watch.companion.usersettings.UserSettingsManager;
import com.huami.watch.companion.util.AnalyticsEvents;
import com.huami.watch.transport.DataBundle;
import com.huami.watch.transport.DataTransportResult;
import com.huami.watch.transport.Transporter;
import com.huami.watch.util.Log;
import com.xiaomi.hm.health.thirdbind.tencent.QQLogin;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes16.dex */
public final class SportSortManager {
    private static final String a = "SportSortManager";
    private static final String b = "v";
    private static final int c = 1;
    private static SportSortManager d;

    public class a implements Transporter.DataSendResultCallback {
        public a() {
        }

        @Override // com.huami.watch.transport.Transporter.DataSendResultCallback
        public void onResultBack(DataTransportResult dataTransportResult) {
        }
    }

    private SportSortManager() {
    }

    private Byte[] a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] strArrSplit = str.split(",");
        if (strArrSplit.length == 0) {
            return null;
        }
        Byte[] bArr = new Byte[strArrSplit.length];
        for (int i = 0; i < strArrSplit.length; i++) {
            try {
                bArr[i] = Byte.valueOf(Byte.parseByte(strArrSplit[i]));
            } catch (Exception e) {
                Log.d(a, "parserSportOrder :" + e.toString(), new Object[0]);
            }
        }
        return bArr;
    }

    private String b(List<Byte> list) {
        if (list == null) {
            return null;
        }
        Iterator<Byte> it2 = list.iterator();
        StringBuilder sb = new StringBuilder();
        boolean z = false;
        while (it2.hasNext()) {
            sb.append(it2.next());
            sb.append(",");
            z = true;
        }
        if (z) {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }

    private SportSortConfig c(Context context) {
        boolean zIsRomSupportLapPace = DeviceUtil.isRomSupportLapPace(context);
        SportSortConfig sportSortConfig = new SportSortConfig(context);
        LinkedHashMap<String, SportSortConfig.SportSortInfo> linkedHashMap = new LinkedHashMap<>();
        sportSortConfig.setSportSortInfoMap(linkedHashMap);
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int i2 = 0;
        while (true) {
            int[] iArr = SportSortConfig.mRunningInfoOrder;
            if (i2 >= iArr.length) {
                break;
            }
            int i3 = iArr[i2];
            if (!p(zIsRomSupportLapPace, i3) && !q(context, i3)) {
                arrayList.add(new SportItemSortActivity.SportItemData(context.getString(sportSortConfig.mOrderNameResMap.get(Integer.valueOf(i3)).intValue()), i3));
            }
            i2++;
        }
        linkedHashMap.put("running", new SportSortConfig.SportSortInfo(1, context.getString(R.string.companion_running_sports_type_running), 14, arrayList, AnalyticsEvents.EVENT_RESORT_RUNNING_ICON));
        arrayList.clear();
        int i4 = 0;
        while (true) {
            int[] iArr2 = SportSortConfig.mWalkingInfoOrder;
            if (i4 >= iArr2.length) {
                break;
            }
            int i5 = iArr2[i4];
            if (!p(zIsRomSupportLapPace, i5) && !q(context, i5)) {
                arrayList.add(new SportItemSortActivity.SportItemData(context.getString(sportSortConfig.mOrderNameResMap.get(Integer.valueOf(i5)).intValue()), i5));
            }
            i4++;
        }
        linkedHashMap.put("walking", new SportSortConfig.SportSortInfo(6, context.getString(R.string.companion_running_sports_type_walking), 10, arrayList, AnalyticsEvents.EVENT_RESORT_WALKING_ICON));
        arrayList.clear();
        int i6 = 0;
        while (true) {
            int[] iArr3 = SportSortConfig.mOutdoorRidingInfoOrder;
            if (i6 >= iArr3.length) {
                break;
            }
            int i7 = iArr3[i6];
            if (!p(zIsRomSupportLapPace, i7) && !q(context, i7)) {
                arrayList.add(new SportItemSortActivity.SportItemData(context.getString(sportSortConfig.mOrderNameResMap.get(Integer.valueOf(i7)).intValue()), i7));
            }
            i6++;
        }
        linkedHashMap.put(SportSortConfig.KEY_OUTDOOR_RIDING_ORDER, new SportSortConfig.SportSortInfo(9, context.getString(R.string.companion_sports_type_bike_ride), 10, arrayList, AnalyticsEvents.EVENT_RESORT_OUTDOOR_RIDING_ICON));
        arrayList.clear();
        int i8 = 0;
        while (true) {
            int[] iArr4 = SportSortConfig.mSwimmingInfoOrder;
            if (i8 >= iArr4.length) {
                break;
            }
            int i9 = iArr4[i8];
            if (!p(zIsRomSupportLapPace, i9)) {
                arrayList.add(new SportItemSortActivity.SportItemData(context.getString(sportSortConfig.mOrderNameResMap.get(Integer.valueOf(i9)).intValue()), i9));
            }
            i8++;
        }
        linkedHashMap.put(SportSortConfig.KEY_INDOOR_SWIM_ORDER, new SportSortConfig.SportSortInfo(14, context.getString(R.string.companion_sport_type_swim_indoor), 9, arrayList, AnalyticsEvents.EVENT_RESORT_INDOOR_SWIM_ICON));
        arrayList.clear();
        int i10 = 0;
        while (true) {
            int[] iArr5 = SportSortConfig.mOpenWaterSwimmingInfoOrder;
            if (i10 >= iArr5.length) {
                break;
            }
            int i11 = iArr5[i10];
            if (!p(zIsRomSupportLapPace, i11)) {
                arrayList.add(new SportItemSortActivity.SportItemData(context.getString(sportSortConfig.mOrderNameResMap.get(Integer.valueOf(i11)).intValue()), i11));
            }
            i10++;
        }
        linkedHashMap.put(SportSortConfig.KEY_OPEN_WATER_SWIM_ORDER, new SportSortConfig.SportSortInfo(15, context.getString(R.string.companion_sport_type_swim_open), 7, arrayList, AnalyticsEvents.EVENT_RESORT_OUTDOOR_SWIM_ICON));
        arrayList.clear();
        int i12 = 0;
        while (true) {
            int[] iArr6 = SportSortConfig.mIndoorRunningInfoOrder;
            if (i12 >= iArr6.length) {
                break;
            }
            int i13 = iArr6[i12];
            if (!p(zIsRomSupportLapPace, i13) && !q(context, i13)) {
                arrayList.add(new SportItemSortActivity.SportItemData(context.getString(sportSortConfig.mOrderNameResMap.get(Integer.valueOf(i13)).intValue()), i13));
            }
            i12++;
        }
        linkedHashMap.put(SportSortConfig.KEY_INDOOR_RUN_ORDER, new SportSortConfig.SportSortInfo(8, context.getString(R.string.companion_running_sports_type_indoor_running), 9, arrayList, AnalyticsEvents.EVENT_RESORT_INDOOR_RUN_ICON));
        arrayList.clear();
        int i14 = 0;
        while (true) {
            int[] iArr7 = SportSortConfig.mIndoorRidingInfoOrder;
            if (i14 >= iArr7.length) {
                break;
            }
            int i15 = iArr7[i14];
            if (!p(zIsRomSupportLapPace, i15)) {
                arrayList.add(new SportItemSortActivity.SportItemData(context.getString(sportSortConfig.mOrderNameResMap.get(Integer.valueOf(i15)).intValue()), i15, false, false));
            }
            i14++;
        }
        linkedHashMap.put(SportSortConfig.KEY_INDOOR_RIDING_ORDER, new SportSortConfig.SportSortInfo(10, context.getString(R.string.companion_sports_type_bike_indoor_ride), 3, arrayList, AnalyticsEvents.EVENT_RESORT_INDOOR_RUN_ICON));
        arrayList.clear();
        int i16 = 0;
        while (true) {
            int[] iArr8 = SportSortConfig.mEllipticalInfoOrder;
            if (i16 >= iArr8.length) {
                break;
            }
            int i17 = iArr8[i16];
            if (!p(zIsRomSupportLapPace, i17)) {
                arrayList.add(new SportItemSortActivity.SportItemData(context.getString(sportSortConfig.mOrderNameResMap.get(Integer.valueOf(i17)).intValue()), i17, false, false));
            }
            i16++;
        }
        linkedHashMap.put("elliptical", new SportSortConfig.SportSortInfo(12, context.getString(R.string.companion_sports_type_elliptical_trainer), 3, arrayList, AnalyticsEvents.EVENT_RESORT_ELLIPTICAL_ICON));
        arrayList.clear();
        int i18 = 0;
        while (true) {
            int[] iArr9 = SportSortConfig.mHikingInfoOrder;
            if (i18 >= iArr9.length) {
                break;
            }
            int i19 = iArr9[i18];
            if (!p(zIsRomSupportLapPace, i19) && !q(context, i19)) {
                arrayList.add(new SportItemSortActivity.SportItemData(context.getString(sportSortConfig.mOrderNameResMap.get(Integer.valueOf(i19)).intValue()), i19));
                linkedHashMap.put("hiking", new SportSortConfig.SportSortInfo(22, context.getString(R.string.running_sports_type_hiking), 12, arrayList, AnalyticsEvents.EVENT_RESORT_HIKING_ICON));
            }
            i18++;
        }
        arrayList.clear();
        int i20 = 0;
        while (true) {
            int[] iArr10 = SportSortConfig.mMountaineerInfoOrder;
            if (i20 >= iArr10.length) {
                break;
            }
            int i21 = iArr10[i20];
            if (!p(zIsRomSupportLapPace, i21)) {
                arrayList.add(new SportItemSortActivity.SportItemData(context.getString(sportSortConfig.mOrderNameResMap.get(Integer.valueOf(i21)).intValue()), i21));
            }
            i20++;
        }
        linkedHashMap.put(SportSortConfig.KEY_CLIMB_MOUNTAINS_ORDER, new SportSortConfig.SportSortInfo(13, context.getString(R.string.companion_sports_type_mountaineering), 11, arrayList, AnalyticsEvents.EVENT_RESORT_CLIMB_MOUNTAINS_ICON));
        arrayList.clear();
        int i22 = 0;
        while (true) {
            int[] iArr11 = SportSortConfig.mCrossingInfoOrder;
            if (i22 >= iArr11.length) {
                break;
            }
            int i23 = iArr11[i22];
            if (!p(zIsRomSupportLapPace, i23) && !q(context, i23)) {
                arrayList.add(new SportItemSortActivity.SportItemData(context.getString(sportSortConfig.mOrderNameResMap.get(Integer.valueOf(i23)).intValue()), i23));
            }
            i22++;
        }
        linkedHashMap.put(SportSortConfig.KEY_CROSS_COUNTRY_ORDER, new SportSortConfig.SportSortInfo(7, context.getString(R.string.companion_running_sports_type_crosscountry), 12, arrayList, AnalyticsEvents.EVENT_RESORT_CROSSING_COUNTRY_ICON));
        arrayList.clear();
        int i24 = 0;
        while (true) {
            int[] iArr12 = SportSortConfig.mSkiingInfoOrder;
            if (i24 >= iArr12.length) {
                break;
            }
            int i25 = iArr12[i24];
            arrayList.add(new SportItemSortActivity.SportItemData(context.getString(sportSortConfig.mOrderNameResMap.get(Integer.valueOf(i25)).intValue()), i25));
            i24++;
        }
        linkedHashMap.put("skiing", new SportSortConfig.SportSortInfo(11, context.getString(R.string.running_sports_type_skiing), 11, arrayList, AnalyticsEvents.EVENT_RESORT_SKIING_ICON));
        arrayList.clear();
        int i26 = 0;
        while (true) {
            int[] iArr13 = SportSortConfig.mTennisInfoOrder;
            if (i26 >= iArr13.length) {
                break;
            }
            int i27 = iArr13[i26];
            arrayList.add(new SportItemSortActivity.SportItemData(context.getString(sportSortConfig.mOrderNameResMap.get(Integer.valueOf(i27)).intValue()), i27));
            i26++;
        }
        linkedHashMap.put("tennis", new SportSortConfig.SportSortInfo(17, context.getString(R.string.running_sports_type_tennis), 4, arrayList, AnalyticsEvents.EVENT_RESORT_TENNIS_ICON));
        arrayList.clear();
        int i28 = 0;
        while (true) {
            int[] iArr14 = SportSortConfig.mSoccerInfoOrder;
            if (i28 >= iArr14.length) {
                break;
            }
            int i29 = iArr14[i28];
            arrayList.add(new SportItemSortActivity.SportItemData(context.getString(sportSortConfig.mOrderNameResMap.get(Integer.valueOf(i29)).intValue()), i29));
            i28++;
        }
        linkedHashMap.put(SportSortConfig.KEY_SOCCER_ORDER, new SportSortConfig.SportSortInfo(18, context.getString(R.string.running_sports_type_soccer), 4, arrayList, AnalyticsEvents.EVENT_RESORT_SOCCER_ICON));
        arrayList.clear();
        int i30 = 0;
        while (true) {
            int[] iArr15 = SportSortConfig.mRopeSkippingInfoOrder;
            if (i30 >= iArr15.length) {
                break;
            }
            int i31 = iArr15[i30];
            arrayList.add(new SportItemSortActivity.SportItemData(context.getString(sportSortConfig.mOrderNameResMap.get(Integer.valueOf(i31)).intValue()), i31));
            i30++;
        }
        linkedHashMap.put(SportSortConfig.KEY_ROPE_SKIPPING_ORDER, new SportSortConfig.SportSortInfo(21, context.getString(R.string.companion_sport_type_rope_skipping), 10, arrayList, AnalyticsEvents.EVENT_RESORT_ROPE_SKIPPING_ICON));
        arrayList.clear();
        int i32 = 0;
        while (true) {
            int[] iArr16 = SportSortConfig.mRowingMachineInfoOrder;
            if (i32 >= iArr16.length) {
                break;
            }
            int i33 = iArr16[i32];
            arrayList.add(new SportItemSortActivity.SportItemData(context.getString(sportSortConfig.mOrderNameResMap.get(Integer.valueOf(i33)).intValue()), i33));
            i32++;
        }
        linkedHashMap.put(SportSortConfig.KEY_ROWING_MACHINE_ORDER, new SportSortConfig.SportSortInfo(23, context.getString(R.string.companion_sport_type_rowing_machine), 12, arrayList, AnalyticsEvents.EVENT_RESORT_ROWING_MACHINE_ICON));
        arrayList.clear();
        while (true) {
            int[] iArr17 = SportSortConfig.mIndoorFitnessOrder;
            if (i >= iArr17.length) {
                linkedHashMap.put(SportSortConfig.KEY_INDOOR_FITNESS, new SportSortConfig.SportSortInfo(24, context.getString(R.string.companion_sport_type_indoor_fitness), 7, arrayList, AnalyticsEvents.EVENT_RESORT_INDOOR_FITNESS_ICON));
                return sportSortConfig;
            }
            int i34 = iArr17[i];
            arrayList.add(new SportItemSortActivity.SportItemData(context.getString(sportSortConfig.mOrderNameResMap.get(Integer.valueOf(i34)).intValue()), i34));
            i++;
        }
    }

    private SportSortConfig d(Context context) {
        boolean zIsRomSupportLapPace = DeviceUtil.isRomSupportLapPace(context);
        SportSortConfig sportSortConfig = new SportSortConfig(context);
        LinkedHashMap<String, SportSortConfig.SportSortInfo> linkedHashMap = new LinkedHashMap<>();
        sportSortConfig.setSportSortInfoMap(linkedHashMap);
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int i2 = 0;
        while (true) {
            int[] iArr = SportSortConfig.mRunningInfoOrder;
            if (i2 >= iArr.length) {
                break;
            }
            int i3 = iArr[i2];
            if (!p(zIsRomSupportLapPace, i3) && !q(context, i3)) {
                arrayList.add(new SportItemSortActivity.SportItemData(context.getString(sportSortConfig.mOrderNameResMap.get(Integer.valueOf(i3)).intValue()), i3));
            }
            i2++;
        }
        linkedHashMap.put("running", new SportSortConfig.SportSortInfo(1, context.getString(R.string.companion_running_sports_type_running), 14, arrayList, AnalyticsEvents.EVENT_RESORT_RUNNING_ICON));
        arrayList.clear();
        int i4 = 0;
        while (true) {
            int[] iArr2 = SportSortConfig.mWalkingInfoOrder;
            if (i4 >= iArr2.length) {
                break;
            }
            int i5 = iArr2[i4];
            if (!p(zIsRomSupportLapPace, i5) && !q(context, i5)) {
                arrayList.add(new SportItemSortActivity.SportItemData(context.getString(sportSortConfig.mOrderNameResMap.get(Integer.valueOf(i5)).intValue()), i5));
            }
            i4++;
        }
        linkedHashMap.put("walking", new SportSortConfig.SportSortInfo(6, context.getString(R.string.companion_running_sports_type_walking), 10, arrayList, AnalyticsEvents.EVENT_RESORT_WALKING_ICON));
        arrayList.clear();
        int i6 = 0;
        while (true) {
            int[] iArr3 = SportSortConfig.mOutdoorRidingInfoOrder;
            if (i6 >= iArr3.length) {
                break;
            }
            int i7 = iArr3[i6];
            if (!p(zIsRomSupportLapPace, i7) && !q(context, i7)) {
                arrayList.add(new SportItemSortActivity.SportItemData(context.getString(sportSortConfig.mOrderNameResMap.get(Integer.valueOf(i7)).intValue()), i7));
            }
            i6++;
        }
        linkedHashMap.put(SportSortConfig.KEY_OUTDOOR_RIDING_ORDER, new SportSortConfig.SportSortInfo(9, context.getString(R.string.companion_sports_type_bike_ride), 10, arrayList, AnalyticsEvents.EVENT_RESORT_OUTDOOR_RIDING_ICON));
        arrayList.clear();
        int i8 = 0;
        while (true) {
            int[] iArr4 = SportSortConfig.mSwimmingInfoOrder;
            if (i8 >= iArr4.length) {
                break;
            }
            int i9 = iArr4[i8];
            if (!p(zIsRomSupportLapPace, i9)) {
                arrayList.add(new SportItemSortActivity.SportItemData(context.getString(sportSortConfig.mOrderNameResMap.get(Integer.valueOf(i9)).intValue()), i9));
            }
            i8++;
        }
        linkedHashMap.put(SportSortConfig.KEY_INDOOR_SWIM_ORDER, new SportSortConfig.SportSortInfo(14, context.getString(R.string.companion_sport_type_swim_indoor), 9, arrayList, AnalyticsEvents.EVENT_RESORT_INDOOR_SWIM_ICON));
        arrayList.clear();
        int i10 = 0;
        while (true) {
            int[] iArr5 = SportSortConfig.mOpenWaterSwimmingInfoOrder;
            if (i10 >= iArr5.length) {
                break;
            }
            int i11 = iArr5[i10];
            if (!p(zIsRomSupportLapPace, i11)) {
                arrayList.add(new SportItemSortActivity.SportItemData(context.getString(sportSortConfig.mOrderNameResMap.get(Integer.valueOf(i11)).intValue()), i11));
            }
            i10++;
        }
        linkedHashMap.put(SportSortConfig.KEY_OPEN_WATER_SWIM_ORDER, new SportSortConfig.SportSortInfo(15, context.getString(R.string.companion_sport_type_swim_open), 7, arrayList, AnalyticsEvents.EVENT_RESORT_OUTDOOR_SWIM_ICON));
        arrayList.clear();
        int i12 = 0;
        while (true) {
            int[] iArr6 = SportSortConfig.mIndoorRunningInfoOrder;
            if (i12 >= iArr6.length) {
                break;
            }
            int i13 = iArr6[i12];
            if (!p(zIsRomSupportLapPace, i13) && !q(context, i13)) {
                arrayList.add(new SportItemSortActivity.SportItemData(context.getString(sportSortConfig.mOrderNameResMap.get(Integer.valueOf(i13)).intValue()), i13));
            }
            i12++;
        }
        linkedHashMap.put(SportSortConfig.KEY_INDOOR_RUN_ORDER, new SportSortConfig.SportSortInfo(8, context.getString(R.string.companion_running_sports_type_indoor_running), 9, arrayList, AnalyticsEvents.EVENT_RESORT_INDOOR_RUN_ICON));
        arrayList.clear();
        int i14 = 0;
        while (true) {
            int[] iArr7 = SportSortConfig.mIndoorRidingInfoOrder;
            if (i14 >= iArr7.length) {
                break;
            }
            int i15 = iArr7[i14];
            if (!p(zIsRomSupportLapPace, i15)) {
                arrayList.add(new SportItemSortActivity.SportItemData(context.getString(sportSortConfig.mOrderNameResMap.get(Integer.valueOf(i15)).intValue()), i15, false, false));
            }
            i14++;
        }
        linkedHashMap.put(SportSortConfig.KEY_INDOOR_RIDING_ORDER, new SportSortConfig.SportSortInfo(10, context.getString(R.string.companion_sports_type_bike_indoor_ride), 3, arrayList, AnalyticsEvents.EVENT_RESORT_INDOOR_RUN_ICON));
        arrayList.clear();
        int i16 = 0;
        while (true) {
            int[] iArr8 = SportSortConfig.mEllipticalInfoOrder;
            if (i16 >= iArr8.length) {
                break;
            }
            int i17 = iArr8[i16];
            if (!p(zIsRomSupportLapPace, i17)) {
                arrayList.add(new SportItemSortActivity.SportItemData(context.getString(sportSortConfig.mOrderNameResMap.get(Integer.valueOf(i17)).intValue()), i17, false, false));
            }
            i16++;
        }
        linkedHashMap.put("elliptical", new SportSortConfig.SportSortInfo(12, context.getString(R.string.companion_sports_type_elliptical_trainer), 3, arrayList, AnalyticsEvents.EVENT_RESORT_ELLIPTICAL_ICON));
        if (DeviceUtil.isSupportHiking(context)) {
            arrayList.clear();
            int i18 = 0;
            while (true) {
                int[] iArr9 = SportSortConfig.mHikingInfoOrder;
                if (i18 >= iArr9.length) {
                    break;
                }
                int i19 = iArr9[i18];
                if (!p(zIsRomSupportLapPace, i19) && !q(context, i19)) {
                    arrayList.add(new SportItemSortActivity.SportItemData(context.getString(sportSortConfig.mOrderNameResMap.get(Integer.valueOf(i19)).intValue()), i19));
                }
                i18++;
            }
            linkedHashMap.put("hiking", new SportSortConfig.SportSortInfo(22, context.getString(R.string.running_sports_type_hiking), 12, arrayList, AnalyticsEvents.EVENT_RESORT_HIKING_ICON));
        }
        arrayList.clear();
        int i20 = 0;
        while (true) {
            int[] iArr10 = SportSortConfig.mMountaineerInfoOrder;
            if (i20 >= iArr10.length) {
                break;
            }
            int i21 = iArr10[i20];
            if (!p(zIsRomSupportLapPace, i21)) {
                arrayList.add(new SportItemSortActivity.SportItemData(context.getString(sportSortConfig.mOrderNameResMap.get(Integer.valueOf(i21)).intValue()), i21));
            }
            i20++;
        }
        linkedHashMap.put(SportSortConfig.KEY_CLIMB_MOUNTAINS_ORDER, new SportSortConfig.SportSortInfo(13, context.getString(R.string.companion_sports_type_mountaineering), 11, arrayList, AnalyticsEvents.EVENT_RESORT_CLIMB_MOUNTAINS_ICON));
        arrayList.clear();
        int i22 = 0;
        while (true) {
            int[] iArr11 = SportSortConfig.mCrossingInfoOrder;
            if (i22 >= iArr11.length) {
                break;
            }
            int i23 = iArr11[i22];
            if (!p(zIsRomSupportLapPace, i23) && !q(context, i23)) {
                arrayList.add(new SportItemSortActivity.SportItemData(context.getString(sportSortConfig.mOrderNameResMap.get(Integer.valueOf(i23)).intValue()), i23));
            }
            i22++;
        }
        linkedHashMap.put(SportSortConfig.KEY_CROSS_COUNTRY_ORDER, new SportSortConfig.SportSortInfo(7, context.getString(R.string.companion_running_sports_type_crosscountry), 12, arrayList, AnalyticsEvents.EVENT_RESORT_CROSSING_COUNTRY_ICON));
        arrayList.clear();
        int i24 = 0;
        while (true) {
            int[] iArr12 = SportSortConfig.mSkiingInfoOrder;
            if (i24 >= iArr12.length) {
                break;
            }
            int i25 = iArr12[i24];
            arrayList.add(new SportItemSortActivity.SportItemData(context.getString(sportSortConfig.mOrderNameResMap.get(Integer.valueOf(i25)).intValue()), i25));
            i24++;
        }
        linkedHashMap.put("skiing", new SportSortConfig.SportSortInfo(11, context.getString(R.string.running_sports_type_skiing), 11, arrayList, AnalyticsEvents.EVENT_RESORT_SKIING_ICON));
        arrayList.clear();
        int i26 = 0;
        while (true) {
            int[] iArr13 = SportSortConfig.mTennisInfoOrder;
            if (i26 >= iArr13.length) {
                break;
            }
            int i27 = iArr13[i26];
            arrayList.add(new SportItemSortActivity.SportItemData(context.getString(sportSortConfig.mOrderNameResMap.get(Integer.valueOf(i27)).intValue()), i27));
            i26++;
        }
        linkedHashMap.put("tennis", new SportSortConfig.SportSortInfo(17, context.getString(R.string.running_sports_type_tennis), 4, arrayList, AnalyticsEvents.EVENT_RESORT_TENNIS_ICON));
        arrayList.clear();
        int i28 = 0;
        while (true) {
            int[] iArr14 = SportSortConfig.mSoccerInfoOrder;
            if (i28 >= iArr14.length) {
                break;
            }
            int i29 = iArr14[i28];
            arrayList.add(new SportItemSortActivity.SportItemData(context.getString(sportSortConfig.mOrderNameResMap.get(Integer.valueOf(i29)).intValue()), i29));
            i28++;
        }
        linkedHashMap.put(SportSortConfig.KEY_SOCCER_ORDER, new SportSortConfig.SportSortInfo(18, context.getString(R.string.running_sports_type_soccer), 4, arrayList, AnalyticsEvents.EVENT_RESORT_SOCCER_ICON));
        arrayList.clear();
        while (true) {
            int[] iArr15 = SportSortConfig.mRopeSkippingInfoOrder;
            if (i >= iArr15.length) {
                linkedHashMap.put(SportSortConfig.KEY_ROPE_SKIPPING_ORDER, new SportSortConfig.SportSortInfo(21, context.getString(R.string.companion_sport_type_rope_skipping), 10, arrayList, AnalyticsEvents.EVENT_RESORT_ROPE_SKIPPING_ICON));
                return sportSortConfig;
            }
            int i30 = iArr15[i];
            arrayList.add(new SportItemSortActivity.SportItemData(context.getString(sportSortConfig.mOrderNameResMap.get(Integer.valueOf(i30)).intValue()), i30));
            i++;
        }
    }

    private SportSortConfig e(Context context) {
        Log.d(a, "Generate huanghe config.", new Object[0]);
        SportSortConfig sportSortConfig = new SportSortConfig(context);
        LinkedHashMap<String, SportSortConfig.SportSortInfo> linkedHashMap = new LinkedHashMap<>();
        ArrayList arrayList = new ArrayList();
        int[] iArr = {R.string.data_item_distance, R.string.data_item_time_cost, R.string.data_item_pace, R.string.data_item_heartrate, R.string.data_item_calarie, R.string.data_item_speed, R.string.data_item_step_freq, R.string.data_item_average_moving_pace, R.string.data_item_average_moving_speed};
        int[] iArr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i = 0; i < 9; i++) {
            arrayList.add(new SportItemSortActivity.SportItemData(context.getString(iArr[i]), iArr2[i]));
        }
        linkedHashMap.put("running", new SportSortConfig.SportSortInfo(1, context.getString(R.string.companion_running_sports_type_running), 9, arrayList, AnalyticsEvents.EVENT_RESORT_RUNNING_ICON));
        arrayList.clear();
        int[] iArr3 = {R.string.data_item_step_count, R.string.data_item_distance, R.string.data_item_time_cost, R.string.data_item_heartrate, R.string.data_item_calarie, R.string.data_item_speed, R.string.data_item_average_moving_speed};
        int[] iArr4 = {7, 1, 2, 4, 3, 5, 6};
        for (int i2 = 0; i2 < 7; i2++) {
            if (DeviceUtil.isRomSupportWalkingStep(context) || iArr4[i2] != 7) {
                arrayList.add(new SportItemSortActivity.SportItemData(context.getString(iArr3[i2]), iArr4[i2]));
            }
        }
        linkedHashMap.put("walking", new SportSortConfig.SportSortInfo(2, context.getString(R.string.companion_running_sports_type_walking), DeviceUtil.isRomSupportWalkingStep(context) ? 7 : 6, arrayList, AnalyticsEvents.EVENT_RESORT_WALKING_ICON));
        arrayList.clear();
        int[] iArr5 = {R.string.data_item_distance, R.string.data_item_time_cost, R.string.data_item_pace, R.string.data_item_average_moving_pace, R.string.data_item_heartrate, R.string.data_item_calarie, R.string.data_item_altitude, R.string.data_item_elevation_gain, R.string.data_item_elevation_loss, R.string.data_item_vertical_speed, R.string.data_item_speed, R.string.data_item_average_moving_speed, R.string.data_item_step_freq, R.string.data_item_step_avg_freq};
        int[] iArr6 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
        int i3 = 0;
        for (int i4 = 14; i3 < i4; i4 = 14) {
            arrayList.add(new SportItemSortActivity.SportItemData(context.getString(iArr5[i3]), iArr6[i3]));
            i3++;
        }
        linkedHashMap.put(SportSortConfig.KEY_CROSS_COUNTRY_ORDER, new SportSortConfig.SportSortInfo(3, context.getString(R.string.companion_running_sports_type_crosscountry), 14, arrayList, AnalyticsEvents.EVENT_RESORT_CROSSING_COUNTRY_ICON));
        arrayList.clear();
        int[] iArr7 = {R.string.data_item_distance, R.string.data_item_time_cost, R.string.data_item_pace, R.string.data_item_heartrate, R.string.data_item_calarie, R.string.data_item_speed, R.string.data_item_step_freq, R.string.data_item_average_moving_pace, R.string.data_item_average_moving_speed};
        int[] iArr8 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int i5 = 0;
        for (int i6 = 9; i5 < i6; i6 = 9) {
            arrayList.add(new SportItemSortActivity.SportItemData(context.getString(iArr7[i5]), iArr8[i5]));
            i5++;
        }
        linkedHashMap.put(SportSortConfig.KEY_INDOOR_RUN_ORDER, new SportSortConfig.SportSortInfo(4, context.getString(R.string.companion_running_sports_type_indoor_running), 9, arrayList, AnalyticsEvents.EVENT_RESORT_INDOOR_RUN_ICON));
        arrayList.clear();
        int[] iArr9 = {R.string.data_item_distance, R.string.data_item_time_cost, R.string.data_item_speed, R.string.data_item_average_moving_speed, R.string.data_item_cadence, R.string.data_item_altitude, R.string.data_item_elevation_gain_altitude, R.string.data_item_group_speed_distance, R.string.data_item_elevation_loss_altitude, R.string.data_item_heartrate, R.string.data_item_calarie};
        int[] iArr10 = {1, 2, 3, 4, 5, 6, 7, 8, 11, 9, 10};
        for (int i7 = 0; i7 < 11; i7++) {
            if (DeviceUtil.isRomSupportOutRidingCEL(context) || iArr10[i7] != 11) {
                arrayList.add(new SportItemSortActivity.SportItemData(context.getString(iArr9[i7]), iArr10[i7]));
            }
        }
        linkedHashMap.put(SportSortConfig.KEY_OUTDOOR_RIDING_ORDER, new SportSortConfig.SportSortInfo(5, context.getString(R.string.companion_sports_type_bike_ride), DeviceUtil.isRomSupportOutRidingCEL(context) ? 11 : 10, arrayList, AnalyticsEvents.EVENT_RESORT_OUTDOOR_RIDING_ICON));
        arrayList.clear();
        int[] iArr11 = {R.string.data_item_distance, R.string.data_item_time_cost, R.string.data_item_altitude, R.string.data_item_elevation_gain, R.string.data_item_elevation_loss, R.string.data_item_group_speed_distance, R.string.data_item_vertical_speed, R.string.data_item_heartrate, R.string.data_item_speed, R.string.data_item_average_moving_speed, R.string.data_item_calarie};
        int[] iArr12 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        for (int i8 = 0; i8 < 11; i8++) {
            arrayList.add(new SportItemSortActivity.SportItemData(context.getString(iArr11[i8]), iArr12[i8]));
        }
        linkedHashMap.put(SportSortConfig.KEY_CLIMB_MOUNTAINS_ORDER, new SportSortConfig.SportSortInfo(8, context.getString(R.string.companion_sports_type_mountaineering), 11, arrayList, AnalyticsEvents.EVENT_RESORT_CLIMB_MOUNTAINS_ICON));
        sportSortConfig.setSportSortInfoMap(linkedHashMap);
        return sportSortConfig;
    }

    private SportSortConfig f(Context context) {
        SportSortConfig sportSortConfig = new SportSortConfig(context);
        LinkedHashMap<String, SportSortConfig.SportSortInfo> linkedHashMap = new LinkedHashMap<>();
        sportSortConfig.setSportSortInfoMap(linkedHashMap);
        linkedHashMap.put("running", new SportSortConfig.SportSortInfo(1, context.getString(R.string.companion_running_sports_type_running), 13, g(context, new int[]{1, 2, 3, 5, 4, 13, 12, 6}, new int[]{10, 11, 7, 8, 9}, sportSortConfig), AnalyticsEvents.EVENT_RESORT_RUNNING_ICON));
        linkedHashMap.put("walking", new SportSortConfig.SportSortInfo(6, context.getString(R.string.companion_running_sports_type_walking), 10, g(context, new int[]{1, 14, 2, 5, 10, 11, 12, 6}, new int[]{3, 4}, sportSortConfig), AnalyticsEvents.EVENT_RESORT_WALKING_ICON));
        linkedHashMap.put(SportSortConfig.KEY_OUTDOOR_RIDING_ORDER, new SportSortConfig.SportSortInfo(9, context.getString(R.string.companion_sports_type_bike_ride), 10, g(context, new int[]{1, 2, 10, 5, 11, 7, 13, 6}, new int[]{8, 9}, sportSortConfig), AnalyticsEvents.EVENT_RESORT_OUTDOOR_RIDING_ICON));
        linkedHashMap.put(SportSortConfig.KEY_INDOOR_RUN_ORDER, new SportSortConfig.SportSortInfo(8, context.getString(R.string.companion_running_sports_type_indoor_running), 9, g(context, new int[]{1, 2, 3, 5, 4, 12, 10, 6}, new int[]{11}, sportSortConfig), AnalyticsEvents.EVENT_RESORT_INDOOR_RUN_ICON));
        linkedHashMap.put(SportSortConfig.KEY_INDOOR_RIDING_ORDER, new SportSortConfig.SportSortInfo(10, context.getString(R.string.companion_sports_type_bike_indoor_ride), 3, g(context, new int[]{1, 5, 6}, null, sportSortConfig), AnalyticsEvents.EVENT_RESORT_INDOOR_RUN_ICON));
        linkedHashMap.put("elliptical", new SportSortConfig.SportSortInfo(12, context.getString(R.string.companion_sports_type_elliptical_trainer), 3, g(context, new int[]{1, 5, 6}, null, sportSortConfig), AnalyticsEvents.EVENT_RESORT_ELLIPTICAL_ICON));
        linkedHashMap.put(SportSortConfig.KEY_CROSS_COUNTRY_ORDER, new SportSortConfig.SportSortInfo(7, context.getString(R.string.companion_running_sports_type_crosscountry), 12, g(context, new int[]{1, 4, 7, 8, 5, 2, 3, 13}, new int[]{10, 6, 11, 9}, sportSortConfig), AnalyticsEvents.EVENT_RESORT_CROSSING_COUNTRY_ICON));
        linkedHashMap.put(SportSortConfig.KEY_CLIMB_MOUNTAINS_ORDER, new SportSortConfig.SportSortInfo(13, context.getString(R.string.companion_sports_type_mountaineering), 11, g(context, new int[]{1, 7, 8, 5, 2, 6, 10, 11}, new int[]{24, 13, 9}, sportSortConfig), AnalyticsEvents.EVENT_RESORT_CLIMB_MOUNTAINS_ICON));
        linkedHashMap.put("hiking", new SportSortConfig.SportSortInfo(22, context.getString(R.string.running_sports_type_hiking), 12, g(context, new int[]{1, 4, 7, 8, 5, 2, 3, 13}, new int[]{10, 6, 11, 9}, sportSortConfig), AnalyticsEvents.EVENT_RESORT_HIKING_ICON));
        linkedHashMap.put("skiing", new SportSortConfig.SportSortInfo(11, context.getString(R.string.running_sports_type_skiing), 11, g(context, new int[]{1, 26, 29, 28, 10, 5, 27, 30}, new int[]{6, 11, 7}, sportSortConfig), AnalyticsEvents.EVENT_RESORT_SKIING_ICON));
        linkedHashMap.put("tennis", new SportSortConfig.SportSortInfo(17, context.getString(R.string.running_sports_type_tennis), 4, g(context, new int[]{1, 31, 6}, new int[]{5}, sportSortConfig), AnalyticsEvents.EVENT_RESORT_TENNIS_ICON));
        linkedHashMap.put(SportSortConfig.KEY_SOCCER_ORDER, new SportSortConfig.SportSortInfo(18, context.getString(R.string.running_sports_type_soccer), 4, g(context, new int[]{1, 2, 6}, new int[]{5}, sportSortConfig), AnalyticsEvents.EVENT_RESORT_SOCCER_ICON));
        linkedHashMap.put(SportSortConfig.KEY_ROPE_SKIPPING_ORDER, new SportSortConfig.SportSortInfo(21, context.getString(R.string.companion_sport_type_rope_skipping), 6, g(context, new int[]{40, 5, 6, 38, 39}, new int[]{1}, sportSortConfig), AnalyticsEvents.EVENT_RESORT_ROPE_SKIPPING_ICON));
        if (DeviceUtil.isSupportWorkout(context)) {
            linkedHashMap.put("workout", new SportSortConfig.SportSortInfo(16, context.getString(R.string.sport_type_work_out), 3, g(context, new int[]{1, 5, 6}, null, sportSortConfig), AnalyticsEvents.EVENT_RESORT_WORK_OUT_ICON));
        }
        return sportSortConfig;
    }

    private List<SportItemSortActivity.SportItemData> g(Context context, int[] iArr, int[] iArr2, SportSortConfig sportSortConfig) {
        ArrayList arrayList = new ArrayList();
        if (iArr != null) {
            for (int i : iArr) {
                arrayList.add(new SportItemSortActivity.SportItemData(context.getString(sportSortConfig.mOrderNameResMap.get(Integer.valueOf(i)).intValue()), i));
            }
        }
        if (iArr2 != null) {
            for (int i2 : iArr2) {
                arrayList.add(new SportItemSortActivity.SportItemData(context.getString(sportSortConfig.mOrderNameResMap.get(Integer.valueOf(i2)).intValue()), i2, true, true));
            }
        }
        return arrayList;
    }

    public static SportSortManager getManager() {
        if (d == null) {
            d = new SportSortManager();
        }
        return d;
    }

    private SportSortConfig h(Context context) {
        boolean zIsRomSupportLapPace = DeviceUtil.isRomSupportLapPace(context);
        SportSortConfig sportSortConfig = new SportSortConfig(context);
        LinkedHashMap<String, SportSortConfig.SportSortInfo> linkedHashMap = new LinkedHashMap<>();
        sportSortConfig.setSportSortInfoMap(linkedHashMap);
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            int[] iArr = SportSortConfig.mRunningInfoOrder;
            if (i >= iArr.length) {
                break;
            }
            int i2 = iArr[i];
            if (!p(zIsRomSupportLapPace, i2) && !q(context, i2) && i2 != 23) {
                arrayList.add(new SportItemSortActivity.SportItemData(context.getString(sportSortConfig.mOrderNameResMap.get(Integer.valueOf(i2)).intValue()), i2));
            }
            i++;
        }
        linkedHashMap.put("running", new SportSortConfig.SportSortInfo(1, context.getString(R.string.companion_running_sports_type_running), 14, arrayList, AnalyticsEvents.EVENT_RESORT_RUNNING_ICON));
        arrayList.clear();
        int i3 = 0;
        while (true) {
            int[] iArr2 = SportSortConfig.mWalkingInfoOrder;
            if (i3 >= iArr2.length) {
                break;
            }
            int i4 = iArr2[i3];
            if (!p(zIsRomSupportLapPace, i4) && !q(context, i4)) {
                arrayList.add(new SportItemSortActivity.SportItemData(context.getString(sportSortConfig.mOrderNameResMap.get(Integer.valueOf(i4)).intValue()), i4));
            }
            i3++;
        }
        linkedHashMap.put("walking", new SportSortConfig.SportSortInfo(6, context.getString(R.string.companion_running_sports_type_walking), 10, arrayList, AnalyticsEvents.EVENT_RESORT_WALKING_ICON));
        arrayList.clear();
        int i5 = 0;
        while (true) {
            int[] iArr3 = SportSortConfig.mOutdoorRidingInfoOrder;
            if (i5 >= iArr3.length) {
                break;
            }
            int i6 = iArr3[i5];
            if (!p(zIsRomSupportLapPace, i6) && !q(context, i6)) {
                arrayList.add(new SportItemSortActivity.SportItemData(context.getString(sportSortConfig.mOrderNameResMap.get(Integer.valueOf(i6)).intValue()), i6));
            }
            i5++;
        }
        linkedHashMap.put(SportSortConfig.KEY_OUTDOOR_RIDING_ORDER, new SportSortConfig.SportSortInfo(9, context.getString(R.string.companion_sports_type_bike_ride), 10, arrayList, AnalyticsEvents.EVENT_RESORT_OUTDOOR_RIDING_ICON));
        arrayList.clear();
        int i7 = 0;
        while (true) {
            int[] iArr4 = SportSortConfig.mIndoorRunningInfoOrder;
            if (i7 >= iArr4.length) {
                break;
            }
            int i8 = iArr4[i7];
            if (!p(zIsRomSupportLapPace, i8) && !q(context, i8)) {
                arrayList.add(new SportItemSortActivity.SportItemData(context.getString(sportSortConfig.mOrderNameResMap.get(Integer.valueOf(i8)).intValue()), i8));
            }
            i7++;
        }
        linkedHashMap.put(SportSortConfig.KEY_INDOOR_RUN_ORDER, new SportSortConfig.SportSortInfo(8, context.getString(R.string.companion_running_sports_type_indoor_running), 9, arrayList, AnalyticsEvents.EVENT_RESORT_INDOOR_RUN_ICON));
        arrayList.clear();
        int i9 = 0;
        while (true) {
            int[] iArr5 = SportSortConfig.mIndoorRidingInfoOrder;
            if (i9 >= iArr5.length) {
                break;
            }
            int i10 = iArr5[i9];
            if (!p(zIsRomSupportLapPace, i10)) {
                arrayList.add(new SportItemSortActivity.SportItemData(context.getString(sportSortConfig.mOrderNameResMap.get(Integer.valueOf(i10)).intValue()), i10, false, false));
            }
            i9++;
        }
        linkedHashMap.put(SportSortConfig.KEY_INDOOR_RIDING_ORDER, new SportSortConfig.SportSortInfo(10, context.getString(R.string.companion_sports_type_bike_indoor_ride), 3, arrayList, AnalyticsEvents.EVENT_RESORT_INDOOR_RUN_ICON));
        arrayList.clear();
        int i11 = 0;
        while (true) {
            int[] iArr6 = SportSortConfig.mEllipticalInfoOrder;
            if (i11 >= iArr6.length) {
                break;
            }
            int i12 = iArr6[i11];
            if (!p(zIsRomSupportLapPace, i12)) {
                arrayList.add(new SportItemSortActivity.SportItemData(context.getString(sportSortConfig.mOrderNameResMap.get(Integer.valueOf(i12)).intValue()), i12, false, false));
            }
            i11++;
        }
        linkedHashMap.put("elliptical", new SportSortConfig.SportSortInfo(12, context.getString(R.string.companion_sports_type_elliptical_trainer), 3, arrayList, AnalyticsEvents.EVENT_RESORT_ELLIPTICAL_ICON));
        arrayList.clear();
        int i13 = 0;
        while (true) {
            int[] iArr7 = SportSortConfig.mMountaineerInfoOrder;
            if (i13 >= iArr7.length) {
                break;
            }
            int i14 = iArr7[i13];
            if (!p(zIsRomSupportLapPace, i14)) {
                arrayList.add(new SportItemSortActivity.SportItemData(context.getString(sportSortConfig.mOrderNameResMap.get(Integer.valueOf(i14)).intValue()), i14));
            }
            i13++;
        }
        linkedHashMap.put(SportSortConfig.KEY_CLIMB_MOUNTAINS_ORDER, new SportSortConfig.SportSortInfo(13, context.getString(R.string.companion_sports_type_mountaineering), 11, arrayList, AnalyticsEvents.EVENT_RESORT_CLIMB_MOUNTAINS_ICON));
        arrayList.clear();
        int i15 = 0;
        while (true) {
            int[] iArr8 = SportSortConfig.mCrossingInfoOrder;
            if (i15 >= iArr8.length) {
                break;
            }
            int i16 = iArr8[i15];
            if (!p(zIsRomSupportLapPace, i16) && !q(context, i16)) {
                arrayList.add(new SportItemSortActivity.SportItemData(context.getString(sportSortConfig.mOrderNameResMap.get(Integer.valueOf(i16)).intValue()), i16));
            }
            i15++;
        }
        linkedHashMap.put(SportSortConfig.KEY_CROSS_COUNTRY_ORDER, new SportSortConfig.SportSortInfo(7, context.getString(R.string.companion_running_sports_type_crosscountry), 12, arrayList, AnalyticsEvents.EVENT_RESORT_CROSSING_COUNTRY_ICON));
        arrayList.clear();
        int i17 = 0;
        while (true) {
            int[] iArr9 = SportSortConfig.mSkiingInfoOrder;
            if (i17 >= iArr9.length) {
                break;
            }
            int i18 = iArr9[i17];
            arrayList.add(new SportItemSortActivity.SportItemData(context.getString(sportSortConfig.mOrderNameResMap.get(Integer.valueOf(i18)).intValue()), i18));
            i17++;
        }
        linkedHashMap.put("skiing", new SportSortConfig.SportSortInfo(11, context.getString(R.string.running_sports_type_skiing), 11, arrayList, AnalyticsEvents.EVENT_RESORT_SKIING_ICON));
        arrayList.clear();
        int i19 = 0;
        while (true) {
            int[] iArr10 = SportSortConfig.mTennisInfoOrder;
            if (i19 >= iArr10.length) {
                break;
            }
            int i20 = iArr10[i19];
            arrayList.add(new SportItemSortActivity.SportItemData(context.getString(sportSortConfig.mOrderNameResMap.get(Integer.valueOf(i20)).intValue()), i20));
            i19++;
        }
        linkedHashMap.put("tennis", new SportSortConfig.SportSortInfo(17, context.getString(R.string.running_sports_type_tennis), 4, arrayList, AnalyticsEvents.EVENT_RESORT_TENNIS_ICON));
        arrayList.clear();
        int i21 = 0;
        while (true) {
            int[] iArr11 = SportSortConfig.mSoccerInfoOrder;
            if (i21 >= iArr11.length) {
                break;
            }
            int i22 = iArr11[i21];
            arrayList.add(new SportItemSortActivity.SportItemData(context.getString(sportSortConfig.mOrderNameResMap.get(Integer.valueOf(i22)).intValue()), i22));
            i21++;
        }
        linkedHashMap.put(SportSortConfig.KEY_SOCCER_ORDER, new SportSortConfig.SportSortInfo(18, context.getString(R.string.running_sports_type_soccer), 4, arrayList, AnalyticsEvents.EVENT_RESORT_SOCCER_ICON));
        arrayList.clear();
        int[] iArr12 = {1, 40, 5, 6, 38, 39};
        for (int i23 = 0; i23 < 6; i23++) {
            int i24 = iArr12[i23];
            arrayList.add(new SportItemSortActivity.SportItemData(context.getString(sportSortConfig.mOrderNameResMap.get(Integer.valueOf(i24)).intValue()), i24));
        }
        linkedHashMap.put(SportSortConfig.KEY_ROPE_SKIPPING_ORDER, new SportSortConfig.SportSortInfo(21, context.getString(R.string.companion_sport_type_rope_skipping), 6, arrayList, AnalyticsEvents.EVENT_RESORT_ROPE_SKIPPING_ICON));
        return sportSortConfig;
    }

    private SportSortConfig i(Context context) {
        SportSortConfig sportSortConfig = new SportSortConfig(context);
        LinkedHashMap<String, SportSortConfig.SportSortInfo> linkedHashMap = new LinkedHashMap<>();
        sportSortConfig.setSportSortInfoMap(linkedHashMap);
        linkedHashMap.put("running", new SportSortConfig.SportSortInfo(1, context.getString(R.string.companion_running_sports_type_running), 9, g(context, new int[]{1, 2, 3, 5, 4, 12, 6}, new int[]{10, 11}, sportSortConfig), AnalyticsEvents.EVENT_RESORT_RUNNING_ICON));
        linkedHashMap.put("walking", new SportSortConfig.SportSortInfo(6, context.getString(R.string.companion_running_sports_type_walking), 10, g(context, new int[]{1, 14, 2, 5, 10, 11, 12, 6}, new int[]{3, 4}, sportSortConfig), AnalyticsEvents.EVENT_RESORT_WALKING_ICON));
        linkedHashMap.put(SportSortConfig.KEY_OUTDOOR_RIDING_ORDER, new SportSortConfig.SportSortInfo(9, context.getString(R.string.companion_sports_type_bike_ride), 6, g(context, new int[]{1, 2, 10, 5, 11, 6}, new int[0], sportSortConfig), AnalyticsEvents.EVENT_RESORT_OUTDOOR_RIDING_ICON));
        linkedHashMap.put(SportSortConfig.KEY_INDOOR_RUN_ORDER, new SportSortConfig.SportSortInfo(8, context.getString(R.string.companion_running_sports_type_indoor_running), 9, g(context, new int[]{1, 2, 3, 5, 4, 12, 10, 6}, new int[]{11}, sportSortConfig), AnalyticsEvents.EVENT_RESORT_INDOOR_RUN_ICON));
        linkedHashMap.put(SportSortConfig.KEY_INDOOR_RIDING_ORDER, new SportSortConfig.SportSortInfo(10, context.getString(R.string.companion_sports_type_bike_indoor_ride), 3, g(context, new int[]{1, 5, 6}, null, sportSortConfig), AnalyticsEvents.EVENT_RESORT_INDOOR_RUN_ICON));
        linkedHashMap.put("elliptical", new SportSortConfig.SportSortInfo(12, context.getString(R.string.companion_sports_type_elliptical_trainer), 3, g(context, new int[]{1, 5, 6}, null, sportSortConfig), AnalyticsEvents.EVENT_RESORT_ELLIPTICAL_ICON));
        linkedHashMap.put(SportSortConfig.KEY_CLIMB_MOUNTAINS_ORDER, new SportSortConfig.SportSortInfo(13, context.getString(R.string.companion_sports_type_mountaineering), 6, g(context, new int[]{1, 5, 2, 6, 10, 11}, new int[0], sportSortConfig), AnalyticsEvents.EVENT_RESORT_CLIMB_MOUNTAINS_ICON));
        linkedHashMap.put(SportSortConfig.KEY_CROSS_COUNTRY_ORDER, new SportSortConfig.SportSortInfo(7, context.getString(R.string.companion_running_sports_type_crosscountry), 8, g(context, new int[]{1, 4, 5, 2, 3}, new int[]{10, 6, 11}, sportSortConfig), AnalyticsEvents.EVENT_RESORT_CROSSING_COUNTRY_ICON));
        linkedHashMap.put(SportSortConfig.KEY_SOCCER_ORDER, new SportSortConfig.SportSortInfo(18, context.getString(R.string.running_sports_type_soccer), 4, g(context, new int[]{1, 2, 6}, new int[]{5}, sportSortConfig), AnalyticsEvents.EVENT_RESORT_SOCCER_ICON));
        linkedHashMap.put(SportSortConfig.KEY_ROPE_SKIPPING_ORDER, new SportSortConfig.SportSortInfo(21, context.getString(R.string.companion_sport_type_rope_skipping), 6, g(context, new int[]{40, 5, 6, 38, 39}, new int[]{1}, sportSortConfig), AnalyticsEvents.EVENT_RESORT_ROPE_SKIPPING_ICON));
        if (DeviceUtil.isSupportWorkout(context)) {
            linkedHashMap.put("workout", new SportSortConfig.SportSortInfo(16, context.getString(R.string.sport_type_work_out), 3, g(context, new int[]{1, 5, 6}, null, sportSortConfig), AnalyticsEvents.EVENT_RESORT_WORK_OUT_ICON));
        }
        return sportSortConfig;
    }

    private int j(Context context, String str, String str2) {
        SportSortConfig.SportSortInfo sportSortInfo = n(context, str2).getSportSortInfoMap().get(str);
        if (sportSortInfo != null) {
            return sportSortInfo.getItemCount();
        }
        return 0;
    }

    private String k(String str) {
        if (DeviceSource.isSeriesEverest2(str)) {
            return UserSettingsKeys.KEY_SPORT_EVEREST2_ORDER;
        }
        if (DeviceSource.isSeriesXihu(str)) {
            return UserSettingsKeys.KEY_SPORT_XIHU_ORDER;
        }
        if (DeviceSource.isModelEverest(str)) {
            return UserSettingsKeys.KEY_SPORT_EVEREST_ORDER;
        }
        return DeviceSource.isModelQogir(str) ? UserSettingsKeys.KEY_SPORT_QOGIR_ORDER : UserSettingsKeys.KEY_SPORT_ORDER;
    }

    private SportSortConfig l(Context context, @NonNull Device device) {
        return m(context, device, device.info().getHuamiModel());
    }

    private SportSortConfig m(Context context, Device device, String str) {
        if (DeviceSource.isSeriesXihu(str)) {
            return i(context);
        }
        if (DeviceSource.isModelEverest(str)) {
            return d(context);
        }
        if (DeviceSource.isSeriesEverest2(str)) {
            return c(context);
        }
        if (DeviceSource.isModelQogir(str)) {
            return f(context);
        }
        return (device == null || !DeviceUtil.isRomWOS2(device)) ? e(context) : h(context);
    }

    private SportSortConfig n(Context context, String str) {
        return m(context, DeviceManager.getManager(context).getCurrentDevice(), str);
    }

    private static String o(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        if (bArr != null && bArr.length != 0) {
            sb.append((int) bArr[0]);
            for (int i = 1; i < bArr.length; i++) {
                sb.append(",");
                sb.append((int) bArr[i]);
            }
        }
        return sb.toString();
    }

    private boolean p(boolean z, int i) {
        if (i < 32 || i > 37) {
            return false;
        }
        return !z;
    }

    private boolean q(Context context, int i) {
        return !DeviceUtil.isSupportNewLap(context) && i >= 45 && i <= 50;
    }

    private boolean r(int i, String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Byte[] bArrA = a(str);
        if (bArrA != null && bArrA.length == i) {
            return true;
        }
        Log.v(a, "Item count not match, reset to default order!", new Object[0]);
        return false;
    }

    public List<SportSortV2Activity.SportData> generateSportData(Context context, String str) {
        SportSortConfig sportSortConfigN = n(context, str);
        ArrayList arrayList = new ArrayList();
        for (String str2 : sportSortConfigN.getSportSortInfoMap().keySet()) {
            SportSortConfig.SportSortInfo sportSortInfo = sportSortConfigN.getSportSortInfoMap().get(str2);
            arrayList.add(new SportSortV2Activity.SportData(sportSortInfo.getSportName(), sportSortInfo.getSportIndex(), str2, sportSortInfo.getEvent()));
        }
        return arrayList;
    }

    public List<SportItemSortActivity.SportItemData> generateSportItemData(Context context, String str, String str2) {
        return n(context, str2).getSportSortInfoMap().get(str).getItemDataList();
    }

    public byte[] getSportOrder(Context context, String str, String str2) {
        String str3 = UserSettings.get(context.getContentResolver(), k(str2), "");
        if (TextUtils.isEmpty(str3)) {
            return null;
        }
        try {
            String strOptString = new JSONObject(str3).optString(str);
            if (!TextUtils.isEmpty(strOptString)) {
                return toPrimitive(a(strOptString));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public void restoreSportOrder(Context context, String str) {
        String strK = k(str);
        if (strK.equals(UserSettingsKeys.KEY_SPORT_ORDER) && TextUtils.isEmpty(UserSettings.get(context.getContentResolver(), strK, ""))) {
            String str2 = UserSettings.get(context.getContentResolver(), UserSettingsKeys.KEY_SPORT_RUNNING_ORDER, "");
            String str3 = UserSettings.get(context.getContentResolver(), UserSettingsKeys.KEY_SPORT_WALKING_ORDER, "");
            String str4 = UserSettings.get(context.getContentResolver(), UserSettingsKeys.KEY_SPORT_INDOOR_RUN_ORDER, "");
            String str5 = UserSettings.get(context.getContentResolver(), UserSettingsKeys.KEY_SPORT_CROSS_COUNTRY_ORDER, "");
            String str6 = UserSettings.get(context.getContentResolver(), UserSettingsKeys.KEY_SPORT_OUTDOOR_RIDING_ORDER, "");
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("running", str2);
                jSONObject.put("walking", str3);
                jSONObject.put(SportSortConfig.KEY_CROSS_COUNTRY_ORDER, str5);
                jSONObject.put(SportSortConfig.KEY_INDOOR_RUN_ORDER, str4);
                jSONObject.put(SportSortConfig.KEY_OUTDOOR_RIDING_ORDER, str6);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            Log.d(a, "Restore Sport Order :" + jSONObject.toString(), new Object[0]);
            UserSettings.putString(context.getContentResolver(), strK, jSONObject.toString());
            UserSettingsManager.getManager(context).syncAllToCloudAsync();
        }
    }

    public void saveItemOrder(Context context, String str, List<SportItemSortActivity.SportItemData> list, List<SportItemSortActivity.SportItemData> list2, String str2) {
        String strK = k(str2);
        String str3 = UserSettings.get(context.getContentResolver(), strK, "");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator<SportItemSortActivity.SportItemData> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(Byte.valueOf((byte) it2.next().getIndex()));
        }
        if (list2 != null && !list2.isEmpty()) {
            Iterator<SportItemSortActivity.SportItemData> it3 = list2.iterator();
            while (it3.hasNext()) {
                arrayList2.add(Byte.valueOf((byte) it3.next().getIndex()));
            }
        }
        try {
            JSONObject jSONObject = !TextUtils.isEmpty(str3) ? new JSONObject(str3) : new JSONObject();
            jSONObject.put(str, b(arrayList));
            jSONObject.put(str + ".closed", b(arrayList2));
            UserSettings.putString(context.getContentResolver(), strK, jSONObject.toString());
        } catch (JSONException e) {
            e.printStackTrace();
            UserSettings.putString(context.getContentResolver(), strK, "");
        }
        Log.d(a, "Save Sport Order :" + str + "--" + b(arrayList), new Object[0]);
        UserSettingsManager.getManager(context).syncAllToCloudAsync();
    }

    public void syncDataToWatch(int i, byte[] bArr, Transporter transporter) {
        Log.d(a, "sport_type:" + i + " arr:" + Arrays.toString(bArr), new Object[0]);
        DataBundle dataBundle = new DataBundle();
        dataBundle.putInt("sport_type", i);
        dataBundle.putInt("v", 1);
        dataBundle.putByteArray(QQLogin.KEY_RESULT, bArr);
        transporter.send(SportSortConfig.SPORT_ACTION, dataBundle, new a());
    }

    public String toBindRestoreJson(Context context, @NonNull Device device) {
        String huamiModel = device.info().getHuamiModel();
        LinkedHashMap<String, SportSortConfig.SportSortInfo> sportSortInfoMap = l(context, device).getSportSortInfoMap();
        JSONObject jSONObject = new JSONObject();
        for (String str : sportSortInfoMap.keySet()) {
            try {
                jSONObject.put(String.valueOf(sportSortInfoMap.get(str).getSportIndex()), o(getSportOrder(context, str, huamiModel)));
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        Log.d(a, "Bind Restore Sport Order :" + jSONObject.toString(), new Object[0]);
        return jSONObject.toString();
    }

    public byte[] toPrimitive(Byte[] bArr) {
        byte[] bArr2 = new byte[bArr.length];
        int i = 0;
        for (Byte b2 : bArr) {
            bArr2[i] = b2.byteValue();
            i++;
        }
        return bArr2;
    }
}
