package com.huami.mifit.sportlib.core;

import android.text.TextUtils;
import android.util.Pair;
import com.facebook.appevents.UserDataStore;
import com.huami.mifit.sportlib.common.DataTypeSource;
import com.huami.mifit.sportlib.common.Keeper;
import com.huami.mifit.sportlib.common.SyncedState;
import com.huami.mifit.sportlib.core.model.GPSActiveAverage;
import com.huami.mifit.sportlib.core.model.GPSActiveBar;
import com.huami.mifit.sportlib.core.model.GPSActiveDistance;
import com.huami.mifit.sportlib.core.model.GPSActiveHr;
import com.huami.mifit.sportlib.core.model.GPSActiveMiPlusStep;
import com.huami.mifit.sportlib.core.model.GPSActiveStatistic;
import com.huami.mifit.sportlib.core.model.GPSActiveStep;
import com.huami.mifit.sportlib.core.model.GPSActiveTrack;
import com.huami.mifit.sportlib.core.model.GPSRunPosture;
import com.huami.mifit.sportlib.dbkit.SportActiveDatasDbKit;
import com.huami.mifit.sportlib.dbkit.SportDetailDbKit;
import com.huami.mifit.sportlib.dbkit.SportRecordDbKit;
import com.huami.mifit.sportlib.dbkit.tool.DataCondition;
import com.huami.mifit.sportlib.devicekit.SportDeviceKit;
import com.huami.mifit.sportlib.locate.GPSLocationHelper;
import com.huami.mifit.sportlib.logkit.LogKit;
import com.huami.mifit.sportlib.model.RunnerData;
import com.huami.mifit.sportlib.model.SportDetailData;
import com.huami.mifit.sportlib.model.SportRecord;
import com.huami.mifit.sportlib.utils.NumberFormatter;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
class c {
    private static final String a = "GPSDataSave";
    private static final int b = 16;
    private static final int c = 17;
    private static final int d = 18;
    private static final int e = 19;
    private static final int f = 20;
    private static final int g = 45;
    private static final int h = 46;
    private static int i;

    public static void A(long j) {
        SportDetailData sportDetailData = SportDetailDbKit.getInstance().getSportDetailData(new DataCondition(j, DataTypeSource.RunSource.RUN_SOURCE_PHONE.getValue(), (int[]) null));
        if (sportDetailData != null) {
            sportDetailData.setBulkpause(Keeper.getSportBulkPause());
            SportDetailDbKit.getInstance().insertOrReplaceSportDetailData(sportDetailData);
            LogKit.i(a, "savePersistBulkPauseToDB str=" + sportDetailData.getBulkpause());
        }
        k();
    }

    private static void B(GPSRunPosture gPSRunPosture, SportRecord sportRecord) {
        if (gPSRunPosture != null) {
            int totalFlyTime = gPSRunPosture.getTotalFlyTime();
            int totalTouchTime = gPSRunPosture.getTotalTouchTime();
            if (totalFlyTime <= 0 || totalTouchTime <= 0) {
                return;
            }
            int firstTouchTime = gPSRunPosture.getFirstTouchTime();
            int lastStep = gPSRunPosture.getLastStep();
            int firstStep = gPSRunPosture.getFirstStep();
            int iRound = Math.round(((totalTouchTime - firstTouchTime) * 2) / (lastStep - firstStep));
            int iRound2 = Math.round((totalFlyTime * 100.0f) / (totalFlyTime + totalTouchTime));
            if (gPSRunPosture.getLeftRight() == 2) {
                sportRecord.setLandingTime(Integer.valueOf(iRound));
                sportRecord.setFlightRatio(Integer.valueOf(iRound2));
            } else if (gPSRunPosture.getLeftRight() == 0) {
                sportRecord.setLeftLandingTime(Integer.valueOf(iRound));
                sportRecord.setLeftFlightRatio(Integer.valueOf(iRound2));
            } else if (gPSRunPosture.getLeftRight() == 1) {
                sportRecord.setRightLandingTime(Integer.valueOf(iRound));
                sportRecord.setRightFlightRatio(Integer.valueOf(iRound2));
            }
            LogKit.w2f(a, "flyTime:" + totalFlyTime + ",touchTime:" + totalTouchTime + ",firstStep:" + firstStep + ",lastStep:" + lastStep + ",aveTouchTime:" + iRound + ",flyRatio:" + iRound2 + ", leftRight:" + gPSRunPosture.getLeftRight());
        }
    }

    public static void C(GPSActiveStatistic gPSActiveStatistic) {
        if (f((int) gPSActiveStatistic.getDistance())) {
            SportRecord sportRecordC = c(gPSActiveStatistic);
            List<SportRecord> sportRecords = SportRecordDbKit.getInstance().getSportRecords(new DataCondition(gPSActiveStatistic.getTrackId(), gPSActiveStatistic.getSource(), gPSActiveStatistic.getType()));
            if (sportRecords == null || sportRecords.isEmpty()) {
                SportRecordDbKit.getInstance().insertOrReplaceSportRecord(sportRecordC);
            } else {
                sportRecordC.setId(sportRecords.get(0).getId());
                SportRecordDbKit.getInstance().updateSportRecord(sportRecordC);
            }
        }
    }

    private static void D(SportRecord sportRecord) {
        DataCondition dataCondition = new DataCondition(sportRecord.getTrackid().longValue());
        dataCondition.setOrder(new Pair<>("Id", Boolean.TRUE));
        List<GPSActiveMiPlusStep> activeMiPlusShoeSteps = SportActiveDatasDbKit.getInstance().getActiveMiPlusShoeSteps(dataCondition);
        if (activeMiPlusShoeSteps == null || activeMiPlusShoeSteps.size() < 2) {
            return;
        }
        GPSRunPosture gPSRunPostureI = null;
        GPSRunPosture gPSRunPostureI2 = null;
        GPSRunPosture gPSRunPostureI3 = null;
        for (GPSActiveMiPlusStep gPSActiveMiPlusStep : activeMiPlusShoeSteps) {
            if (gPSActiveMiPlusStep.getLeftRight() == 2) {
                gPSRunPostureI = I(gPSRunPostureI, gPSActiveMiPlusStep);
            } else if (gPSActiveMiPlusStep.getLeftRight() == 0) {
                gPSRunPostureI2 = I(gPSRunPostureI2, gPSActiveMiPlusStep);
            } else if (gPSActiveMiPlusStep.getLeftRight() == 1) {
                gPSRunPostureI3 = I(gPSRunPostureI3, gPSActiveMiPlusStep);
            }
        }
        if (gPSRunPostureI != null) {
            B(gPSRunPostureI, sportRecord);
        }
        if (gPSRunPostureI2 != null) {
            B(gPSRunPostureI2, sportRecord);
        }
        if (gPSRunPostureI3 != null) {
            B(gPSRunPostureI3, sportRecord);
        }
    }

    public static void E(SportRecord sportRecord, int i2, String str, boolean z) {
        String strG;
        String strG2 = "";
        long jLongValue = sportRecord.getTrackid().longValue();
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONArray jSONArray = jSONObject.getJSONArray("KM");
            JSONArray jSONArray2 = jSONObject.getJSONArray("MILE");
            strG = g(jSONArray);
            try {
                strG2 = g(jSONArray2);
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
            strG = "";
        }
        SportDetailData sportDetailData = new SportDetailData();
        sportDetailData.setSource(Integer.valueOf(DataTypeSource.RunSource.RUN_SOURCE_PHONE.getValue()));
        sportDetailData.setType(sportRecord.getType());
        sportDetailData.setTrackid(Long.valueOf(jLongValue));
        sportDetailData.setSegment(1);
        sportDetailData.setV(Integer.valueOf(i2));
        sportDetailData.setProvider(Integer.valueOf(RunnerData.getRunner().getLocationProviderType()));
        sportDetailData.setKilomarked(strG);
        sportDetailData.setMilemarked(strG2);
        y(sportRecord, sportDetailData);
        s(sportRecord, sportDetailData);
        x(sportRecord, sportDetailData);
        G(sportRecord, sportDetailData);
        z(sportRecord, sportDetailData, z);
        D(sportRecord);
        SportDetailDbKit.getInstance().insertOrReplaceSportDetailData(sportDetailData);
        LogKit.w2f(a, "processTrackdata_" + jLongValue);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:24:0x00db  */
    /* JADX WARN: Code duplicated, block: B:27:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:29:0x0168  */
    /* JADX WARN: Code duplicated, block: B:30:0x018c  */
    /* JADX WARN: Code duplicated, block: B:31:0x0199  */
    /* JADX WARN: Code duplicated, block: B:33:0x0286  */
    /* JADX WARN: Code duplicated, block: B:35:0x02af  */
    /* JADX WARN: Code duplicated, block: B:43:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:47:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:50:0x02df  */
    /* JADX WARN: Code duplicated, block: B:54:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:58:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:60:0x0301  */
    /* JADX WARN: Code duplicated, block: B:62:0x0307  */
    /* JADX WARN: Code duplicated, block: B:63:0x030d  */
    /* JADX WARN: Code duplicated, block: B:66:0x0319  */
    /* JADX WARN: Code duplicated, block: B:67:0x0341  */
    /* JADX WARN: Code duplicated, block: B:68:0x034d  */
    /* JADX WARN: Code duplicated, block: B:71:0x0359 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:77:0x0456  */
    /* JADX WARN: Code duplicated, block: B:78:0x045c  */
    /* JADX WARN: Code duplicated, block: B:94:0x03af A[EDGE_INSN: B:94:0x03af->B:75:0x03af BREAK  A[LOOP:0: B:20:0x00c2->B:74:0x039c], SYNTHETIC] */
    public static int[] F(long j, int i2, String str) {
        StringBuilder sb;
        StringBuilder sb2;
        String strG;
        String strG2;
        int i3;
        int i4;
        int altitude;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        GPSActiveTrack gPSActiveTrack;
        int stepl;
        boolean z;
        StringBuilder sb3;
        StringBuilder sb4;
        int i10;
        long timestamp;
        int i11;
        String str2;
        StringBuilder sb5;
        StringBuilder sb6;
        StringBuilder sb7;
        int altitude2;
        int i12;
        int i13;
        StringBuilder sb8;
        int i14;
        StringBuilder sb9;
        long timestamp2;
        long j2 = j;
        DataCondition dataCondition = new DataCondition(j2);
        dataCondition.setOrder(new Pair<>("Time", Boolean.TRUE));
        List<GPSActiveTrack> activeTracks = SportActiveDatasDbKit.getInstance().getActiveTracks(dataCondition);
        int[] iArr = {0, 0, 0, 0};
        if (activeTracks == null || activeTracks.size() == 0) {
            LogKit.i(a, "processTrackdata_" + j2 + ":null");
            return iArr;
        }
        boolean zHasBaroMeter = SportDeviceKit.getInstance().hasBaroMeter();
        int steps = activeTracks.get(activeTracks.size() - 1).getSteps();
        StringBuilder sb10 = new StringBuilder("");
        StringBuilder sb11 = new StringBuilder("");
        StringBuilder sb12 = new StringBuilder("");
        StringBuilder sb13 = new StringBuilder("");
        StringBuilder sb14 = new StringBuilder("");
        StringBuilder sb15 = new StringBuilder("");
        StringBuilder sb16 = new StringBuilder("");
        StringBuilder sb17 = new StringBuilder("");
        StringBuilder sb18 = new StringBuilder("");
        StringBuilder sb19 = new StringBuilder("");
        StringBuilder sb20 = new StringBuilder("");
        try {
            sb = sb17;
            try {
                JSONObject jSONObject = new JSONObject(str);
                JSONArray jSONArray = jSONObject.getJSONArray("KM");
                sb2 = sb13;
                try {
                    JSONArray jSONArray2 = jSONObject.getJSONArray("MILE");
                    strG = g(jSONArray);
                    try {
                        strG2 = g(jSONArray2);
                        while (true) {
                            i9 = i3;
                            if (i4 >= activeTracks.size()) {
                                break;
                            }
                            gPSActiveTrack = activeTracks.get(i4);
                            stepl = (int) (gPSActiveTrack.getStepl() * 100.0f);
                            if (stepl > 0) {
                                i6 += stepl;
                                i5++;
                            }
                            if (i4 == 0) {
                                z = zHasBaroMeter;
                                sb9 = sb20;
                                timestamp2 = (gPSActiveTrack.getTimestamp() / 1000) - j2;
                                sb10.append((long) (gPSActiveTrack.getLatitude() * 1.0E8f));
                                sb10.append(",");
                                sb10.append((long) (gPSActiveTrack.getLongitude() * 1.0E8f));
                                sb11.append(timestamp2);
                                sb11.append(",");
                                sb11.append(gPSActiveTrack.getSteps());
                                sb11.append(",");
                                sb11.append((int) (gPSActiveTrack.getStepl() * 100.0f));
                                sb12.append((int) (gPSActiveTrack.getAltitude() * 100.0f));
                                sb14.append(timestamp2);
                                sb15.append(gPSActiveTrack.getState());
                                sb3 = sb15;
                                sb16.append(NumberFormatter.formatFloat2String(gPSActiveTrack.getPace(), 2, new int[0]));
                                sb18.append(gPSActiveTrack.getAccuracy());
                                sb19.append((int) gPSActiveTrack.getDistance());
                                sb9.append(gPSActiveTrack.getHr());
                                if (z) {
                                    StringBuilder sb21 = sb2;
                                    sb21.append(timestamp2);
                                    sb21.append(",");
                                    sb21.append((int) gPSActiveTrack.getBarometerAltitude());
                                    altitude = (int) gPSActiveTrack.getAltitude();
                                    i11 = i4;
                                    sb5 = sb14;
                                    str2 = ";";
                                    sb7 = sb21;
                                    sb6 = sb9;
                                } else {
                                    sb6 = sb9;
                                    sb5 = sb14;
                                    sb7 = sb2;
                                    i11 = i4;
                                    str2 = ";";
                                    altitude = altitude;
                                }
                            } else {
                                z = zHasBaroMeter;
                                sb3 = sb15;
                                sb4 = sb2;
                                i10 = i4 - 1;
                                timestamp = (gPSActiveTrack.getTimestamp() / 1000) - (activeTracks.get(i10).getTimestamp() / 1000);
                                i11 = i4;
                                str2 = ";";
                                sb10.append(str2);
                                sb10.append((long) ((gPSActiveTrack.getLatitude() - activeTracks.get(i10).getLatitude()) * 1.0E8f));
                                sb10.append(",");
                                sb10.append((long) ((gPSActiveTrack.getLongitude() - activeTracks.get(i10).getLongitude()) * 1.0E8f));
                                sb11.append(str2);
                                sb11.append(timestamp);
                                sb11.append(",");
                                sb11.append(gPSActiveTrack.getSteps() - activeTracks.get(i10).getSteps());
                                sb11.append(",");
                                sb11.append((int) (gPSActiveTrack.getStepl() * 100.0f));
                                sb12.append(str2);
                                sb12.append((int) (gPSActiveTrack.getAltitude() * 100.0f));
                                sb14.append(str2);
                                sb14.append(timestamp);
                                sb3.append(str2);
                                sb3.append(gPSActiveTrack.getState());
                                sb16.append(str2);
                                sb5 = sb14;
                                sb16.append(NumberFormatter.formatFloat2String(gPSActiveTrack.getPace(), 2, new int[0]));
                                sb18.append(str2);
                                sb18.append(gPSActiveTrack.getAccuracy());
                                sb19.append(str2);
                                sb19.append((int) (gPSActiveTrack.getDistance() - activeTracks.get(i10).getDistance()));
                                sb6 = sb20;
                                sb6.append(str2);
                                sb6.append(gPSActiveTrack.getHr() - activeTracks.get(i10).getHr());
                                if (z) {
                                    sb7 = sb4;
                                    sb7.append(str2);
                                    sb7.append(timestamp);
                                    sb7.append(",");
                                    sb7.append((int) (gPSActiveTrack.getBarometerAltitude() - activeTracks.get(i10).getBarometerAltitude()));
                                    altitude2 = (int) gPSActiveTrack.getAltitude();
                                    if (d(altitude) || !d(altitude2)) {
                                        i12 = altitude;
                                    } else {
                                        i12 = altitude;
                                        int i15 = i12 - altitude2;
                                        if (Math.abs(i15) > 1) {
                                            if (altitude2 > i12) {
                                                i7 += altitude2 - i12;
                                            } else {
                                                i8 += i15;
                                            }
                                            altitude = altitude2;
                                        }
                                        if (d(altitude2) && !d(altitude)) {
                                            altitude = altitude2;
                                        }
                                    }
                                    altitude = i12;
                                    if (d(altitude2)) {
                                        altitude = altitude2;
                                    }
                                } else {
                                    sb7 = sb4;
                                    altitude = altitude;
                                }
                            }
                            if (gPSActiveTrack.getState() != 2 || gPSActiveTrack.getState() == 3) {
                                i13 = i9;
                                if (i13 == -1) {
                                    if (TextUtils.isEmpty(sb)) {
                                        sb8 = sb;
                                    } else {
                                        sb8 = sb;
                                        sb8.append(str2);
                                    }
                                    i14 = i11;
                                    if (i14 == activeTracks.size() - 1) {
                                        sb16 = sb16;
                                        sb8.append(gPSActiveTrack.getTimestamp() / 1000);
                                        sb8.append(",");
                                        sb8.append(0);
                                        sb8.append(",");
                                        sb8.append(i14);
                                        sb8.append(",");
                                        sb8.append(i14);
                                        sb8.append(",");
                                        sb8.append(gPSActiveTrack.getState());
                                    } else {
                                        sb8.append(gPSActiveTrack.getTimestamp() / 1000);
                                        i13 = i14;
                                    }
                                    i3 = i13;
                                    int i16 = i14 + 1;
                                    sb20 = sb6;
                                    sb2 = sb7;
                                    sb16 = sb16;
                                    sb = sb8;
                                    sb14 = sb5;
                                    sb15 = sb3;
                                    zHasBaroMeter = z;
                                    j2 = j;
                                    i4 = i16;
                                } else {
                                    sb8 = sb;
                                    i14 = i11;
                                }
                            } else {
                                sb8 = sb;
                                i14 = i11;
                                i13 = i9;
                            }
                            if (gPSActiveTrack.getState() == 1 || i13 <= 0) {
                                i3 = i13;
                            } else {
                                sb8.append(",");
                                int i17 = i14 - 1;
                                sb8.append((activeTracks.get(i17).getTimestamp() / 1000) - (activeTracks.get(i13).getTimestamp() / 1000));
                                sb8.append(",");
                                sb8.append(i13);
                                sb8.append(",");
                                sb8.append(i17);
                                sb8.append(",");
                                sb8.append(activeTracks.get(i13).getState());
                                i3 = -1;
                            }
                            int i18 = i14 + 1;
                            sb20 = sb6;
                            sb2 = sb7;
                            sb16 = sb16;
                            sb = sb8;
                            sb14 = sb5;
                            sb15 = sb3;
                            zHasBaroMeter = z;
                            j2 = j;
                            i4 = i18;
                        }
                    } catch (Exception unused) {
                        strG2 = "";
                    }
                } catch (Exception unused2) {
                    strG = "";
                    strG2 = "";
                    String str3 = strG;
                    String str4 = strG2;
                    i3 = -1;
                    i4 = 0;
                    altitude = 0;
                    i5 = 0;
                    i6 = 0;
                    i7 = 0;
                    i8 = 0;
                    while (true) {
                        i9 = i3;
                        if (i4 >= activeTracks.size()) {
                            break;
                            break;
                        }
                        gPSActiveTrack = activeTracks.get(i4);
                        stepl = (int) (gPSActiveTrack.getStepl() * 100.0f);
                        if (stepl > 0) {
                            i6 += stepl;
                            i5++;
                        }
                        if (i4 == 0) {
                            z = zHasBaroMeter;
                            sb9 = sb20;
                            timestamp2 = (gPSActiveTrack.getTimestamp() / 1000) - j2;
                            sb10.append((long) (gPSActiveTrack.getLatitude() * 1.0E8f));
                            sb10.append(",");
                            sb10.append((long) (gPSActiveTrack.getLongitude() * 1.0E8f));
                            sb11.append(timestamp2);
                            sb11.append(",");
                            sb11.append(gPSActiveTrack.getSteps());
                            sb11.append(",");
                            sb11.append((int) (gPSActiveTrack.getStepl() * 100.0f));
                            sb12.append((int) (gPSActiveTrack.getAltitude() * 100.0f));
                            sb14.append(timestamp2);
                            sb15.append(gPSActiveTrack.getState());
                            sb3 = sb15;
                            sb16.append(NumberFormatter.formatFloat2String(gPSActiveTrack.getPace(), 2, new int[0]));
                            sb18.append(gPSActiveTrack.getAccuracy());
                            sb19.append((int) gPSActiveTrack.getDistance());
                            sb9.append(gPSActiveTrack.getHr());
                            if (z) {
                                StringBuilder sb22 = sb2;
                                sb22.append(timestamp2);
                                sb22.append(",");
                                sb22.append((int) gPSActiveTrack.getBarometerAltitude());
                                altitude = (int) gPSActiveTrack.getAltitude();
                                i11 = i4;
                                sb5 = sb14;
                                str2 = ";";
                                sb7 = sb22;
                                sb6 = sb9;
                            } else {
                                sb6 = sb9;
                                sb5 = sb14;
                                sb7 = sb2;
                                i11 = i4;
                                str2 = ";";
                                altitude = altitude;
                            }
                        } else {
                            z = zHasBaroMeter;
                            sb3 = sb15;
                            sb4 = sb2;
                            i10 = i4 - 1;
                            timestamp = (gPSActiveTrack.getTimestamp() / 1000) - (activeTracks.get(i10).getTimestamp() / 1000);
                            i11 = i4;
                            str2 = ";";
                            sb10.append(str2);
                            sb10.append((long) ((gPSActiveTrack.getLatitude() - activeTracks.get(i10).getLatitude()) * 1.0E8f));
                            sb10.append(",");
                            sb10.append((long) ((gPSActiveTrack.getLongitude() - activeTracks.get(i10).getLongitude()) * 1.0E8f));
                            sb11.append(str2);
                            sb11.append(timestamp);
                            sb11.append(",");
                            sb11.append(gPSActiveTrack.getSteps() - activeTracks.get(i10).getSteps());
                            sb11.append(",");
                            sb11.append((int) (gPSActiveTrack.getStepl() * 100.0f));
                            sb12.append(str2);
                            sb12.append((int) (gPSActiveTrack.getAltitude() * 100.0f));
                            sb14.append(str2);
                            sb14.append(timestamp);
                            sb3.append(str2);
                            sb3.append(gPSActiveTrack.getState());
                            sb16.append(str2);
                            sb5 = sb14;
                            sb16.append(NumberFormatter.formatFloat2String(gPSActiveTrack.getPace(), 2, new int[0]));
                            sb18.append(str2);
                            sb18.append(gPSActiveTrack.getAccuracy());
                            sb19.append(str2);
                            sb19.append((int) (gPSActiveTrack.getDistance() - activeTracks.get(i10).getDistance()));
                            sb6 = sb20;
                            sb6.append(str2);
                            sb6.append(gPSActiveTrack.getHr() - activeTracks.get(i10).getHr());
                            if (z) {
                                sb7 = sb4;
                                sb7.append(str2);
                                sb7.append(timestamp);
                                sb7.append(",");
                                sb7.append((int) (gPSActiveTrack.getBarometerAltitude() - activeTracks.get(i10).getBarometerAltitude()));
                                altitude2 = (int) gPSActiveTrack.getAltitude();
                                if (d(altitude)) {
                                    i12 = altitude;
                                    altitude = i12;
                                } else {
                                    i12 = altitude;
                                    altitude = i12;
                                }
                                if (d(altitude2)) {
                                    altitude = altitude2;
                                }
                            } else {
                                sb7 = sb4;
                                altitude = altitude;
                            }
                        }
                        if (gPSActiveTrack.getState() != 2) {
                            i13 = i9;
                            if (i13 == -1) {
                                if (TextUtils.isEmpty(sb)) {
                                    sb8 = sb;
                                    sb8.append(str2);
                                } else {
                                    sb8 = sb;
                                }
                                i14 = i11;
                                if (i14 == activeTracks.size() - 1) {
                                    sb16 = sb16;
                                    sb8.append(gPSActiveTrack.getTimestamp() / 1000);
                                    sb8.append(",");
                                    sb8.append(0);
                                    sb8.append(",");
                                    sb8.append(i14);
                                    sb8.append(",");
                                    sb8.append(i14);
                                    sb8.append(",");
                                    sb8.append(gPSActiveTrack.getState());
                                } else {
                                    sb8.append(gPSActiveTrack.getTimestamp() / 1000);
                                    i13 = i14;
                                }
                            } else {
                                sb8 = sb;
                                i14 = i11;
                            }
                            if (gPSActiveTrack.getState() == 1) {
                            }
                            int i19 = i14 + 1;
                            sb20 = sb6;
                            sb2 = sb7;
                            sb16 = sb16;
                            sb = sb8;
                            sb14 = sb5;
                            sb15 = sb3;
                            zHasBaroMeter = z;
                            j2 = j;
                            i4 = i19;
                        } else {
                            i13 = i9;
                            if (i13 == -1) {
                                if (TextUtils.isEmpty(sb)) {
                                    sb8 = sb;
                                    sb8.append(str2);
                                } else {
                                    sb8 = sb;
                                }
                                i14 = i11;
                                if (i14 == activeTracks.size() - 1) {
                                    sb16 = sb16;
                                    sb8.append(gPSActiveTrack.getTimestamp() / 1000);
                                    sb8.append(",");
                                    sb8.append(0);
                                    sb8.append(",");
                                    sb8.append(i14);
                                    sb8.append(",");
                                    sb8.append(i14);
                                    sb8.append(",");
                                    sb8.append(gPSActiveTrack.getState());
                                } else {
                                    sb8.append(gPSActiveTrack.getTimestamp() / 1000);
                                    i13 = i14;
                                }
                            } else {
                                sb8 = sb;
                                i14 = i11;
                            }
                            if (gPSActiveTrack.getState() == 1) {
                            }
                            int i110 = i14 + 1;
                            sb20 = sb6;
                            sb2 = sb7;
                            sb16 = sb16;
                            sb = sb8;
                            sb14 = sb5;
                            sb15 = sb3;
                            zHasBaroMeter = z;
                            j2 = j;
                            i4 = i110;
                        }
                        i3 = i13;
                        int i111 = i14 + 1;
                        sb20 = sb6;
                        sb2 = sb7;
                        sb16 = sb16;
                        sb = sb8;
                        sb14 = sb5;
                        sb15 = sb3;
                        zHasBaroMeter = z;
                        j2 = j;
                        i4 = i111;
                    }
                    SportDetailData sportDetailData = new SportDetailData();
                    sportDetailData.setSource(Integer.valueOf(DataTypeSource.RunSource.RUN_SOURCE_PHONE.getValue()));
                    sportDetailData.setType(1);
                    sportDetailData.setTrackid(Long.valueOf(j));
                    sportDetailData.setSegment(1);
                    sportDetailData.setSize(Integer.valueOf(activeTracks.size()));
                    sportDetailData.setBulkll(sb10.toString());
                    sportDetailData.setBulkgait(sb11.toString());
                    sportDetailData.setBulkal(sb12.toString());
                    sportDetailData.setBulkbarometerAltitude(sb2.toString());
                    sportDetailData.setBulktime(sb14.toString());
                    sportDetailData.setBulkflag(sb15.toString());
                    sportDetailData.setBulkpace(sb16.toString());
                    sportDetailData.setBulkpause(sb.toString());
                    sportDetailData.setBulkacc(sb18.toString());
                    sportDetailData.setKilomarked(str3);
                    sportDetailData.setMilemarked(str4);
                    sportDetailData.setBulkdistance(sb19.toString());
                    sportDetailData.setBulkhr(sb20.toString());
                    sportDetailData.setV(Integer.valueOf(i2));
                    SportDetailDbKit.getInstance().insertOrReplaceSportDetailData(sportDetailData);
                    iArr[0] = steps;
                    if (i5 != 0) {
                        iArr[1] = i6 / i5;
                    } else {
                        iArr[1] = 0;
                    }
                    iArr[2] = i7;
                    iArr[3] = i8;
                    LogKit.w2f(a, "processTrackdata_" + j);
                    return iArr;
                }
            } catch (Exception unused3) {
                sb2 = sb13;
                strG = "";
                strG2 = "";
                String str5 = strG;
                String str6 = strG2;
                i3 = -1;
                i4 = 0;
                altitude = 0;
                i5 = 0;
                i6 = 0;
                i7 = 0;
                i8 = 0;
                while (true) {
                    i9 = i3;
                    if (i4 >= activeTracks.size()) {
                        break;
                        break;
                    }
                    gPSActiveTrack = activeTracks.get(i4);
                    stepl = (int) (gPSActiveTrack.getStepl() * 100.0f);
                    if (stepl > 0) {
                        i6 += stepl;
                        i5++;
                    }
                    if (i4 == 0) {
                        z = zHasBaroMeter;
                        sb9 = sb20;
                        timestamp2 = (gPSActiveTrack.getTimestamp() / 1000) - j2;
                        sb10.append((long) (gPSActiveTrack.getLatitude() * 1.0E8f));
                        sb10.append(",");
                        sb10.append((long) (gPSActiveTrack.getLongitude() * 1.0E8f));
                        sb11.append(timestamp2);
                        sb11.append(",");
                        sb11.append(gPSActiveTrack.getSteps());
                        sb11.append(",");
                        sb11.append((int) (gPSActiveTrack.getStepl() * 100.0f));
                        sb12.append((int) (gPSActiveTrack.getAltitude() * 100.0f));
                        sb14.append(timestamp2);
                        sb15.append(gPSActiveTrack.getState());
                        sb3 = sb15;
                        sb16.append(NumberFormatter.formatFloat2String(gPSActiveTrack.getPace(), 2, new int[0]));
                        sb18.append(gPSActiveTrack.getAccuracy());
                        sb19.append((int) gPSActiveTrack.getDistance());
                        sb9.append(gPSActiveTrack.getHr());
                        if (z) {
                            StringBuilder sb23 = sb2;
                            sb23.append(timestamp2);
                            sb23.append(",");
                            sb23.append((int) gPSActiveTrack.getBarometerAltitude());
                            altitude = (int) gPSActiveTrack.getAltitude();
                            i11 = i4;
                            sb5 = sb14;
                            str2 = ";";
                            sb7 = sb23;
                            sb6 = sb9;
                        } else {
                            sb6 = sb9;
                            sb5 = sb14;
                            sb7 = sb2;
                            i11 = i4;
                            str2 = ";";
                            altitude = altitude;
                        }
                    } else {
                        z = zHasBaroMeter;
                        sb3 = sb15;
                        sb4 = sb2;
                        i10 = i4 - 1;
                        timestamp = (gPSActiveTrack.getTimestamp() / 1000) - (activeTracks.get(i10).getTimestamp() / 1000);
                        i11 = i4;
                        str2 = ";";
                        sb10.append(str2);
                        sb10.append((long) ((gPSActiveTrack.getLatitude() - activeTracks.get(i10).getLatitude()) * 1.0E8f));
                        sb10.append(",");
                        sb10.append((long) ((gPSActiveTrack.getLongitude() - activeTracks.get(i10).getLongitude()) * 1.0E8f));
                        sb11.append(str2);
                        sb11.append(timestamp);
                        sb11.append(",");
                        sb11.append(gPSActiveTrack.getSteps() - activeTracks.get(i10).getSteps());
                        sb11.append(",");
                        sb11.append((int) (gPSActiveTrack.getStepl() * 100.0f));
                        sb12.append(str2);
                        sb12.append((int) (gPSActiveTrack.getAltitude() * 100.0f));
                        sb14.append(str2);
                        sb14.append(timestamp);
                        sb3.append(str2);
                        sb3.append(gPSActiveTrack.getState());
                        sb16.append(str2);
                        sb5 = sb14;
                        sb16.append(NumberFormatter.formatFloat2String(gPSActiveTrack.getPace(), 2, new int[0]));
                        sb18.append(str2);
                        sb18.append(gPSActiveTrack.getAccuracy());
                        sb19.append(str2);
                        sb19.append((int) (gPSActiveTrack.getDistance() - activeTracks.get(i10).getDistance()));
                        sb6 = sb20;
                        sb6.append(str2);
                        sb6.append(gPSActiveTrack.getHr() - activeTracks.get(i10).getHr());
                        if (z) {
                            sb7 = sb4;
                            sb7.append(str2);
                            sb7.append(timestamp);
                            sb7.append(",");
                            sb7.append((int) (gPSActiveTrack.getBarometerAltitude() - activeTracks.get(i10).getBarometerAltitude()));
                            altitude2 = (int) gPSActiveTrack.getAltitude();
                            if (d(altitude)) {
                                i12 = altitude;
                                altitude = i12;
                            } else {
                                i12 = altitude;
                                altitude = i12;
                            }
                            if (d(altitude2)) {
                                altitude = altitude2;
                            }
                        } else {
                            sb7 = sb4;
                            altitude = altitude;
                        }
                    }
                    if (gPSActiveTrack.getState() != 2) {
                        i13 = i9;
                        if (i13 == -1) {
                            if (TextUtils.isEmpty(sb)) {
                                sb8 = sb;
                                sb8.append(str2);
                            } else {
                                sb8 = sb;
                            }
                            i14 = i11;
                            if (i14 == activeTracks.size() - 1) {
                                sb16 = sb16;
                                sb8.append(gPSActiveTrack.getTimestamp() / 1000);
                                sb8.append(",");
                                sb8.append(0);
                                sb8.append(",");
                                sb8.append(i14);
                                sb8.append(",");
                                sb8.append(i14);
                                sb8.append(",");
                                sb8.append(gPSActiveTrack.getState());
                            } else {
                                sb8.append(gPSActiveTrack.getTimestamp() / 1000);
                                i13 = i14;
                            }
                        } else {
                            sb8 = sb;
                            i14 = i11;
                        }
                        if (gPSActiveTrack.getState() == 1) {
                        }
                        int i112 = i14 + 1;
                        sb20 = sb6;
                        sb2 = sb7;
                        sb16 = sb16;
                        sb = sb8;
                        sb14 = sb5;
                        sb15 = sb3;
                        zHasBaroMeter = z;
                        j2 = j;
                        i4 = i112;
                    } else {
                        i13 = i9;
                        if (i13 == -1) {
                            if (TextUtils.isEmpty(sb)) {
                                sb8 = sb;
                                sb8.append(str2);
                            } else {
                                sb8 = sb;
                            }
                            i14 = i11;
                            if (i14 == activeTracks.size() - 1) {
                                sb16 = sb16;
                                sb8.append(gPSActiveTrack.getTimestamp() / 1000);
                                sb8.append(",");
                                sb8.append(0);
                                sb8.append(",");
                                sb8.append(i14);
                                sb8.append(",");
                                sb8.append(i14);
                                sb8.append(",");
                                sb8.append(gPSActiveTrack.getState());
                            } else {
                                sb8.append(gPSActiveTrack.getTimestamp() / 1000);
                                i13 = i14;
                            }
                        } else {
                            sb8 = sb;
                            i14 = i11;
                        }
                        if (gPSActiveTrack.getState() == 1) {
                        }
                        int i113 = i14 + 1;
                        sb20 = sb6;
                        sb2 = sb7;
                        sb16 = sb16;
                        sb = sb8;
                        sb14 = sb5;
                        sb15 = sb3;
                        zHasBaroMeter = z;
                        j2 = j;
                        i4 = i113;
                    }
                    i3 = i13;
                    int i114 = i14 + 1;
                    sb20 = sb6;
                    sb2 = sb7;
                    sb16 = sb16;
                    sb = sb8;
                    sb14 = sb5;
                    sb15 = sb3;
                    zHasBaroMeter = z;
                    j2 = j;
                    i4 = i114;
                }
                SportDetailData sportDetailData2 = new SportDetailData();
                sportDetailData2.setSource(Integer.valueOf(DataTypeSource.RunSource.RUN_SOURCE_PHONE.getValue()));
                sportDetailData2.setType(1);
                sportDetailData2.setTrackid(Long.valueOf(j));
                sportDetailData2.setSegment(1);
                sportDetailData2.setSize(Integer.valueOf(activeTracks.size()));
                sportDetailData2.setBulkll(sb10.toString());
                sportDetailData2.setBulkgait(sb11.toString());
                sportDetailData2.setBulkal(sb12.toString());
                sportDetailData2.setBulkbarometerAltitude(sb2.toString());
                sportDetailData2.setBulktime(sb14.toString());
                sportDetailData2.setBulkflag(sb15.toString());
                sportDetailData2.setBulkpace(sb16.toString());
                sportDetailData2.setBulkpause(sb.toString());
                sportDetailData2.setBulkacc(sb18.toString());
                sportDetailData2.setKilomarked(str5);
                sportDetailData2.setMilemarked(str6);
                sportDetailData2.setBulkdistance(sb19.toString());
                sportDetailData2.setBulkhr(sb20.toString());
                sportDetailData2.setV(Integer.valueOf(i2));
                SportDetailDbKit.getInstance().insertOrReplaceSportDetailData(sportDetailData2);
                iArr[0] = steps;
                if (i5 != 0) {
                    iArr[1] = i6 / i5;
                } else {
                    iArr[1] = 0;
                }
                iArr[2] = i7;
                iArr[3] = i8;
                LogKit.w2f(a, "processTrackdata_" + j);
                return iArr;
            }
        } catch (Exception unused4) {
            sb = sb17;
        }
        String str7 = strG;
        String str8 = strG2;
        i3 = -1;
        i4 = 0;
        altitude = 0;
        i5 = 0;
        i6 = 0;
        i7 = 0;
        i8 = 0;
        SportDetailData sportDetailData3 = new SportDetailData();
        sportDetailData3.setSource(Integer.valueOf(DataTypeSource.RunSource.RUN_SOURCE_PHONE.getValue()));
        sportDetailData3.setType(1);
        sportDetailData3.setTrackid(Long.valueOf(j));
        sportDetailData3.setSegment(1);
        sportDetailData3.setSize(Integer.valueOf(activeTracks.size()));
        sportDetailData3.setBulkll(sb10.toString());
        sportDetailData3.setBulkgait(sb11.toString());
        sportDetailData3.setBulkal(sb12.toString());
        sportDetailData3.setBulkbarometerAltitude(sb2.toString());
        sportDetailData3.setBulktime(sb14.toString());
        sportDetailData3.setBulkflag(sb15.toString());
        sportDetailData3.setBulkpace(sb16.toString());
        sportDetailData3.setBulkpause(sb.toString());
        sportDetailData3.setBulkacc(sb18.toString());
        sportDetailData3.setKilomarked(str7);
        sportDetailData3.setMilemarked(str8);
        sportDetailData3.setBulkdistance(sb19.toString());
        sportDetailData3.setBulkhr(sb20.toString());
        sportDetailData3.setV(Integer.valueOf(i2));
        SportDetailDbKit.getInstance().insertOrReplaceSportDetailData(sportDetailData3);
        iArr[0] = steps;
        if (i5 != 0) {
            iArr[1] = i6 / i5;
        } else {
            iArr[1] = 0;
        }
        iArr[2] = i7;
        iArr[3] = i8;
        LogKit.w2f(a, "processTrackdata_" + j);
        return iArr;
    }

    private static void G(SportRecord sportRecord, SportDetailData sportDetailData) {
        DataCondition dataCondition = new DataCondition(sportRecord.getTrackid().longValue());
        dataCondition.setOrder(new Pair<>("Time", Boolean.TRUE));
        List<GPSActiveHr> activeHrs = SportActiveDatasDbKit.getInstance().getActiveHrs(dataCondition);
        if (activeHrs == null) {
            activeHrs = new ArrayList<>();
        }
        StringBuilder sb = new StringBuilder("");
        int i2 = 0;
        int hr = 0;
        for (int i3 = 0; i3 < activeHrs.size(); i3++) {
            GPSActiveHr gPSActiveHr = activeHrs.get(i3);
            if (i3 == 0) {
                sb.append((gPSActiveHr.getTimestamp() / 1000) - sportRecord.getTrackid().longValue());
                sb.append(",");
                sb.append(activeHrs.get(i3).getHr());
            } else {
                int i4 = i3 - 1;
                long timestamp = (gPSActiveHr.getTimestamp() / 1000) - (activeHrs.get(i4).getTimestamp() / 1000);
                sb.append(";");
                sb.append(timestamp == 1 ? "" : Long.valueOf(timestamp));
                sb.append(",");
                sb.append(activeHrs.get(i3).getHr() - activeHrs.get(i4).getHr());
            }
            hr += gPSActiveHr.getHr();
            i2++;
        }
        sportRecord.setAvghr(Integer.valueOf(i2 == 0 ? -1 : hr / i2));
        sportDetailData.setBulkhr(sb.toString());
    }

    public static void H(boolean z) {
        i = z ? 45 : 46;
    }

    private static GPSRunPosture I(GPSRunPosture gPSRunPosture, GPSActiveMiPlusStep gPSActiveMiPlusStep) {
        if (gPSRunPosture == null) {
            gPSRunPosture = new GPSRunPosture();
            gPSRunPosture.setLeftRight(gPSActiveMiPlusStep.getLeftRight());
            gPSRunPosture.setFirstStep(gPSActiveMiPlusStep.getStep());
            gPSRunPosture.setFirstTouchTime(gPSActiveMiPlusStep.getTouchTime());
        }
        gPSRunPosture.setLastStep(gPSActiveMiPlusStep.getStep());
        gPSRunPosture.setTotalFlyTime(gPSRunPosture.getTotalFlyTime() + gPSActiveMiPlusStep.getFlyTime());
        gPSRunPosture.setTotalTouchTime(gPSRunPosture.getTotalTouchTime() + gPSActiveMiPlusStep.getTouchTime());
        return gPSRunPosture;
    }

    public static void J(GPSActiveTrack gPSActiveTrack) {
        SportActiveDatasDbKit.getInstance().updateActiveTrack(gPSActiveTrack);
    }

    public static void K(long j, int i2) {
        DataCondition dataCondition = new DataCondition(j);
        dataCondition.setOrder(new Pair<>("Time", Boolean.FALSE));
        dataCondition.setLimit(1);
        List<GPSActiveTrack> activeTracks = SportActiveDatasDbKit.getInstance().getActiveTracks(dataCondition);
        if (activeTracks == null || activeTracks.size() == 0 || activeTracks.size() > 1) {
            return;
        }
        GPSActiveTrack gPSActiveTrack = activeTracks.get(0);
        gPSActiveTrack.setState(i2);
        J(gPSActiveTrack);
    }

    public static GPSActiveTrack L(long j, float f2, float f3, float f4) {
        DataCondition dataCondition = new DataCondition(j);
        dataCondition.setOrder(new Pair<>("Time", Boolean.FALSE));
        dataCondition.setLimit(1);
        List<GPSActiveTrack> activeTracks = SportActiveDatasDbKit.getInstance().getActiveTracks(dataCondition);
        if (activeTracks != null && activeTracks.size() != 0 && activeTracks.size() <= 1) {
            GPSActiveTrack gPSActiveTrack = activeTracks.get(0);
            if (gPSActiveTrack.getPace() <= 0.0f) {
                gPSActiveTrack.setPace(f2);
                gPSActiveTrack.setAltitude(f3);
                gPSActiveTrack.setSpeed(f4);
                J(gPSActiveTrack);
                return gPSActiveTrack;
            }
        }
        return null;
    }

    public static void a(long j) {
        DataCondition dataCondition = new DataCondition(j);
        SportActiveDatasDbKit.getInstance().deleteActiveTracks(dataCondition);
        SportActiveDatasDbKit.getInstance().deleteActiveHrs(dataCondition);
        SportActiveDatasDbKit.getInstance().deleteActiveDistances(dataCondition);
        SportActiveDatasDbKit.getInstance().deleteActiveSteps(dataCondition);
        SportActiveDatasDbKit.getInstance().deleteActiveBaros(dataCondition);
        SportActiveDatasDbKit.getInstance().deleteActiveMiPlusShoeSteps(dataCondition);
    }

    public static GPSActiveTrack b(long j, float f2, float f3) {
        DataCondition dataCondition = new DataCondition(-1L);
        dataCondition.setBetween(new Pair<>("Time", new Pair(Long.valueOf(j - 2000), Long.valueOf(2000 + j))));
        List<GPSActiveTrack> activeTracks = SportActiveDatasDbKit.getInstance().getActiveTracks(dataCondition);
        GPSActiveTrack gPSActiveTrack = null;
        if (activeTracks != null && !activeTracks.isEmpty()) {
            int i2 = Integer.MAX_VALUE;
            for (GPSActiveTrack gPSActiveTrack2 : activeTracks) {
                int iAbs = (int) Math.abs(gPSActiveTrack2.getTimestamp() - j);
                if (i2 > iAbs) {
                    gPSActiveTrack = gPSActiveTrack2;
                    i2 = iAbs;
                }
            }
            if (gPSActiveTrack != null) {
                gPSActiveTrack.setPace(f2);
                gPSActiveTrack.setAltitude(f3);
                J(gPSActiveTrack);
            }
        }
        return gPSActiveTrack;
    }

    private static SportRecord c(GPSActiveStatistic gPSActiveStatistic) {
        SportRecord sportRecord = new SportRecord();
        sportRecord.setTrackid(Long.valueOf(gPSActiveStatistic.getTrackId()));
        sportRecord.setSource(Integer.valueOf(gPSActiveStatistic.getSource()));
        sportRecord.setType(Integer.valueOf(gPSActiveStatistic.getType()));
        sportRecord.setPace(Float.valueOf(gPSActiveStatistic.getAvePace()));
        sportRecord.setCal(Integer.valueOf((int) gPSActiveStatistic.getCostCal()));
        sportRecord.setDistance(Integer.valueOf((int) gPSActiveStatistic.getDistance()));
        sportRecord.setCosttime(Integer.valueOf(gPSActiveStatistic.getCostTime()));
        sportRecord.setAvghr(Integer.valueOf(gPSActiveStatistic.getAveHr()));
        sportRecord.setSfreq(Integer.valueOf(gPSActiveStatistic.getAveStepFreq()));
        sportRecord.setAvgStrideLength(Integer.valueOf(gPSActiveStatistic.getAveStepLength()));
        sportRecord.setFfpercent(Integer.valueOf(gPSActiveStatistic.getPercentOffrontStep()));
        sportRecord.setStatisticed(Integer.valueOf(gPSActiveStatistic.getStatisticed()));
        sportRecord.setMaxrtp(Float.valueOf(gPSActiveStatistic.getMaxRtPace()));
        sportRecord.setMinrtp(Float.valueOf(gPSActiveStatistic.getMinRtPace()));
        sportRecord.setStatistics(gPSActiveStatistic.getStatistic());
        sportRecord.setEndtime(Long.valueOf(gPSActiveStatistic.getEndTime()));
        sportRecord.setDate(gPSActiveStatistic.getDate());
        sportRecord.setState(Integer.valueOf(gPSActiveStatistic.getState()));
        sportRecord.setV(Integer.valueOf(gPSActiveStatistic.getVersion()));
        sportRecord.setDevice(gPSActiveStatistic.getDevice());
        sportRecord.setSize(Integer.valueOf(gPSActiveStatistic.getSize()));
        sportRecord.setSynced(Integer.valueOf(SyncedState.STATE_UNSYNCED.getValue()));
        sportRecord.setClimbDisascend(Integer.valueOf((int) gPSActiveStatistic.getClimbDisAscend()));
        sportRecord.setClimbDisAscendTime(Integer.valueOf(gPSActiveStatistic.getClimbDisAscendTime()));
        sportRecord.setClimbDisDescend(Integer.valueOf((int) gPSActiveStatistic.getClimbDisDescend()));
        sportRecord.setClimbDisDescendTime(Integer.valueOf(gPSActiveStatistic.getClimbDisDescendTime()));
        sportRecord.setAltitudeAscend(Integer.valueOf(gPSActiveStatistic.getAltitudeAscend()));
        sportRecord.setAltitudeDescend(Integer.valueOf(gPSActiveStatistic.getAltitudeDescend()));
        sportRecord.setTotalStep(Integer.valueOf(gPSActiveStatistic.getStepCount()));
        return sportRecord;
    }

    private static boolean d(int i2) {
        return i2 > -20000 && i2 < 10000;
    }

    public static boolean e() {
        return i == 45;
    }

    private static boolean f(int i2) {
        return i2 >= 50;
    }

    private static String g(JSONArray jSONArray) throws JSONException {
        StringBuilder sb = new StringBuilder("");
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i2);
            int i3 = jSONObject.getInt("dis");
            int i4 = jSONObject.getInt(UserDataStore.CITY);
            int i5 = jSONObject.getInt("gpsIndex");
            String string = jSONObject.getString("geoHash");
            int i6 = jSONObject.getInt("aveHr");
            int i7 = jSONObject.getInt("trackInterpolation");
            if (i2 != 0) {
                sb.append(";");
            }
            sb.append(i3 - 1);
            sb.append(",");
            sb.append(i4);
            sb.append(",");
            sb.append(string);
            sb.append(",");
            sb.append(i5);
            sb.append(",");
            sb.append(i6);
            sb.append(",");
            sb.append(i7);
        }
        return sb.toString();
    }

    private static void h(String str, int i2, long j) {
        long j2;
        StringBuilder sb = new StringBuilder();
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        long j3 = 0;
        if (!TextUtils.isEmpty(str)) {
            String[] strArrSplit = str.split(";");
            String str2 = strArrSplit[strArrSplit.length - 1];
            sb.append(str);
            if (!str2.contains(",")) {
                j2 = jCurrentTimeMillis - Long.parseLong(str2);
            } else if (20 == i2) {
                sb.append(";");
                sb.append(j);
                j2 = jCurrentTimeMillis - j;
            } else {
                LogKit.w2f(a, "STATE_SAVE_WHEN_RESUME error");
            }
            j3 = j2;
        } else if (20 == i2) {
            sb.append(j);
            j3 = jCurrentTimeMillis - j;
        } else {
            LogKit.w2f(a, "STATE_SAVE_WHEN_RESUME exception");
        }
        sb.append(",");
        sb.append(j3);
        sb.append(",");
        sb.append(-1);
        sb.append(",");
        sb.append(-1);
        sb.append(",");
        sb.append(e() ? 3 : 2);
        Keeper.setSportBulkPause(sb.toString());
        j();
    }

    private static void i(int i2, long... jArr) {
        StringBuilder sb = new StringBuilder("");
        String sportBulkPause = Keeper.getSportBulkPause();
        if (i2 == 16) {
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            if (!TextUtils.isEmpty(sportBulkPause)) {
                sb.append(sportBulkPause);
                sb.append(";");
            }
            sb.append(jCurrentTimeMillis);
            Keeper.setSportBulkPause(sb.toString());
        } else if (i2 == 17) {
            h(sportBulkPause, i2, -1L);
        } else {
            if (i2 == 20) {
                if (jArr != null && jArr.length == 1) {
                    h(sportBulkPause, i2, jArr[0]);
                }
            } else if (i2 == 18 || i2 == 19) {
                if (!TextUtils.isEmpty(sportBulkPause)) {
                    for (String str : sportBulkPause.split(";")) {
                        if (str.contains(",")) {
                            sb.append(str);
                            sb.append(";");
                        }
                    }
                }
                Keeper.setSportBulkPause(sb.toString());
            }
        }
        LogKit.i(a, "persistBulkPause :" + Keeper.getSportBulkPause());
    }

    private static void j() {
        i = 0;
    }

    public static void k() {
        Keeper.setSportBulkPause("");
    }

    public static void l(GPSActiveBar gPSActiveBar) {
        SportActiveDatasDbKit.getInstance().insertActiveBaro(gPSActiveBar);
    }

    public static void m(GPSActiveDistance gPSActiveDistance) {
        SportActiveDatasDbKit.getInstance().insertActiveDistance(gPSActiveDistance);
    }

    public static void n(GPSActiveHr gPSActiveHr) {
        SportActiveDatasDbKit.getInstance().insertActiveHr(gPSActiveHr);
    }

    public static void o(GPSActiveMiPlusStep gPSActiveMiPlusStep) {
        SportActiveDatasDbKit.getInstance().insertActiveMiPlusShoeStep(gPSActiveMiPlusStep);
    }

    public static void p(GPSActiveStep gPSActiveStep) {
        SportActiveDatasDbKit.getInstance().insertActiveStep(gPSActiveStep);
    }

    public static void q(GPSActiveTrack gPSActiveTrack) {
        SportActiveDatasDbKit.getInstance().insertActiveTrack(gPSActiveTrack);
    }

    public static void r(ArrayList<GPSActiveTrack> arrayList) {
        SportActiveDatasDbKit.getInstance().insertActiveTrackList(arrayList);
    }

    private static void s(SportRecord sportRecord, SportDetailData sportDetailData) {
        if (!SportDeviceKit.getInstance().hasBaroMeter()) {
            sportDetailData.setBulkbarometerAltitude("");
            return;
        }
        DataCondition dataCondition = new DataCondition(sportRecord.getTrackid().longValue());
        dataCondition.setOrder(new Pair<>("Time", Boolean.TRUE));
        List<GPSActiveBar> activeBaros = SportActiveDatasDbKit.getInstance().getActiveBaros(dataCondition);
        if (activeBaros == null) {
            activeBaros = new ArrayList<>();
        }
        StringBuilder sb = new StringBuilder("");
        for (int i2 = 0; i2 < activeBaros.size(); i2++) {
            GPSActiveBar gPSActiveBar = activeBaros.get(i2);
            if (i2 == 0) {
                sb.append((gPSActiveBar.getTimestamp() / 1000) - sportRecord.getTrackid().longValue());
                sb.append(",");
                sb.append((int) gPSActiveBar.getBar());
            } else {
                int i3 = i2 - 1;
                long timestamp = (gPSActiveBar.getTimestamp() / 1000) - (activeBaros.get(i3).getTimestamp() / 1000);
                sb.append(";");
                sb.append(timestamp);
                sb.append(",");
                sb.append((int) (gPSActiveBar.getBar() - activeBaros.get(i3).getBar()));
            }
        }
        sportDetailData.setBulkbarometerAltitude(sb.toString());
    }

    public static void t(long j) {
        i(20, j);
    }

    public static void u(GPSActiveStatistic gPSActiveStatistic) {
        if (!f((int) gPSActiveStatistic.getDistance())) {
            i(16, new long[0]);
            return;
        }
        if (b.n0()) {
            SportRecord sportRecordC = c(gPSActiveStatistic);
            E(sportRecordC, 12, gPSActiveStatistic.getStatistic(), false);
            List<SportRecord> sportRecords = SportRecordDbKit.getInstance().getSportRecords(new DataCondition(gPSActiveStatistic.getTrackId(), gPSActiveStatistic.getSource(), gPSActiveStatistic.getType()));
            if (sportRecords == null || sportRecords.isEmpty()) {
                SportRecordDbKit.getInstance().insertOrReplaceSportRecord(sportRecordC);
                return;
            } else {
                sportRecordC.setId(sportRecords.get(0).getId());
                SportRecordDbKit.getInstance().updateSportRecord(sportRecordC);
                return;
            }
        }
        C(gPSActiveStatistic);
        int[] iArrF = F(gPSActiveStatistic.getTrackId(), 12, gPSActiveStatistic.getStatistic());
        List<SportRecord> sportRecords2 = SportRecordDbKit.getInstance().getSportRecords(new DataCondition(gPSActiveStatistic.getTrackId()));
        if (sportRecords2 == null || sportRecords2.size() < 0) {
            return;
        }
        SportRecord sportRecord = sportRecords2.get(sportRecords2.size() - 1);
        sportRecord.setTotalStep(Integer.valueOf(iArrF[0]));
        sportRecord.setAvgStrideLength(Integer.valueOf(iArrF[1]));
        sportRecord.setAltitudeAscend(Integer.valueOf(iArrF[2]));
        sportRecord.setAltitudeDescend(Integer.valueOf(iArrF[3]));
        SportRecordDbKit.getInstance().updateSportRecord(sportRecord);
    }

    public static void v() {
        i(17, new long[0]);
    }

    public static boolean w(GPSActiveStatistic gPSActiveStatistic) {
        if (!f((int) gPSActiveStatistic.getDistance())) {
            k();
            return false;
        }
        List<SportRecord> sportRecords = SportRecordDbKit.getInstance().getSportRecords(new DataCondition(gPSActiveStatistic.getTrackId(), gPSActiveStatistic.getSource(), (int[]) null));
        if (sportRecords == null || sportRecords.size() == 0) {
            return false;
        }
        SportRecord sportRecord = sportRecords.get(sportRecords.size() - 1);
        sportRecord.setState(Integer.valueOf(SyncedState.STATE_UNSYNCED.getValue()));
        SportRecordDbKit.getInstance().updateSportRecord(sportRecord);
        a(gPSActiveStatistic.getTrackId());
        i(18, new long[0]);
        A(gPSActiveStatistic.getTrackId());
        return true;
    }

    private static void x(SportRecord sportRecord, SportDetailData sportDetailData) {
        DataCondition dataCondition = new DataCondition(sportRecord.getTrackid().longValue());
        dataCondition.setOrder(new Pair<>("Time", Boolean.TRUE));
        List<GPSActiveDistance> activeDistances = SportActiveDatasDbKit.getInstance().getActiveDistances(dataCondition);
        if (activeDistances == null) {
            activeDistances = new ArrayList<>();
        }
        StringBuilder sb = new StringBuilder("");
        for (int i2 = 0; i2 < activeDistances.size(); i2++) {
            GPSActiveDistance gPSActiveDistance = activeDistances.get(i2);
            if (i2 == 0) {
                sb.append((gPSActiveDistance.getTimestamp() / 1000) - sportRecord.getTrackid().longValue());
                sb.append(",");
                sb.append((int) gPSActiveDistance.getDistance());
            } else {
                int i3 = i2 - 1;
                long timestamp = (gPSActiveDistance.getTimestamp() / 1000) - (activeDistances.get(i3).getTimestamp() / 1000);
                sb.append(";");
                sb.append(timestamp);
                sb.append(",");
                sb.append((int) (gPSActiveDistance.getDistance() - activeDistances.get(i3).getDistance()));
            }
        }
        sportDetailData.setBulkdistance(sb.toString());
    }

    private static void y(SportRecord sportRecord, SportDetailData sportDetailData) {
        DataCondition dataCondition = new DataCondition(sportRecord.getTrackid().longValue());
        dataCondition.setOrder(new Pair<>("Time", Boolean.TRUE));
        List<GPSActiveStep> activeSteps = SportActiveDatasDbKit.getInstance().getActiveSteps(dataCondition);
        if (activeSteps == null) {
            activeSteps = new ArrayList<>();
        }
        GPSActiveAverage gPSActiveAverage = new GPSActiveAverage();
        GPSActiveAverage gPSActiveAverage2 = new GPSActiveAverage();
        StringBuilder sb = new StringBuilder("");
        for (int i2 = 0; i2 < activeSteps.size(); i2++) {
            GPSActiveStep gPSActiveStep = activeSteps.get(i2);
            int stepLength = (int) (gPSActiveStep.getStepLength() * 100.0f);
            if (stepLength > 0) {
                gPSActiveAverage.add(stepLength);
            }
            int stepFreq = (int) (gPSActiveStep.getStepFreq() * 60.0f);
            if (stepFreq > 0) {
                gPSActiveAverage2.add(stepFreq);
            }
            if (i2 == 0) {
                sb.append((gPSActiveStep.getTimestamp() / 1000) - sportRecord.getTrackid().longValue());
                sb.append(",");
                sb.append(gPSActiveStep.getStep());
            } else {
                int i3 = i2 - 1;
                long timestamp = (gPSActiveStep.getTimestamp() / 1000) - (activeSteps.get(i3).getTimestamp() / 1000);
                sb.append(";");
                sb.append(timestamp);
                sb.append(",");
                sb.append(gPSActiveStep.getStep() - activeSteps.get(i3).getStep());
            }
            sb.append(",");
            sb.append(stepLength);
            sb.append(",");
            sb.append(stepFreq);
        }
        sportRecord.setAvgStrideLength(Integer.valueOf(gPSActiveAverage.avg()));
        sportRecord.setSfreq(Integer.valueOf(gPSActiveAverage2.avg()));
        sportRecord.setTotalStep(Integer.valueOf(activeSteps.size() != 0 ? activeSteps.get(activeSteps.size() - 1).getStep() : 0));
        sportDetailData.setBulkgait(sb.toString());
    }

    private static void z(SportRecord sportRecord, SportDetailData sportDetailData, boolean z) {
        int i2;
        StringBuilder sb;
        StringBuilder sb2;
        int i3;
        boolean z2;
        List<GPSActiveTrack> list;
        int i4;
        int i5;
        DataCondition dataCondition = new DataCondition(sportRecord.getTrackid().longValue());
        dataCondition.setOrder(new Pair<>("Time", Boolean.TRUE));
        List<GPSActiveTrack> activeTracks = SportActiveDatasDbKit.getInstance().getActiveTracks(dataCondition);
        if (activeTracks == null) {
            activeTracks = new ArrayList<>();
        }
        boolean zHasBaroMeter = SportDeviceKit.getInstance().hasBaroMeter();
        StringBuilder sb3 = new StringBuilder("");
        StringBuilder sb4 = new StringBuilder("");
        StringBuilder sb5 = new StringBuilder("");
        StringBuilder sb6 = new StringBuilder("");
        StringBuilder sb7 = new StringBuilder("");
        StringBuilder sb8 = new StringBuilder("");
        StringBuilder sb9 = new StringBuilder("");
        StringBuilder sb10 = new StringBuilder("");
        i(z ? 19 : 16, new long[0]);
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (i7 < activeTracks.size()) {
            GPSActiveTrack gPSActiveTrack = activeTracks.get(i7);
            StringBuilder sb11 = sb8;
            if (i7 == 0) {
                int i10 = i8;
                i2 = i9;
                long timestamp = ((gPSActiveTrack.getTimestamp() / 1000) - sportDetailData.getTrackid().longValue()) - (GPSLocationHelper.getInstance().getLocationTimeStampOffset() / 1000);
                list = activeTracks;
                sb3.append((long) (gPSActiveTrack.getLatitude() * 1.0E8f));
                sb3.append(",");
                sb3.append((long) (gPSActiveTrack.getLongitude() * 1.0E8f));
                sb4.append((int) (gPSActiveTrack.getAltitude() * 100.0f));
                sb5.append(timestamp);
                sb6.append(gPSActiveTrack.getState());
                StringBuilder sb12 = sb6;
                sb7.append(NumberFormatter.formatFloat2String(gPSActiveTrack.getPace(), 2, new int[0]));
                sb9.append(gPSActiveTrack.getAccuracy());
                int altitude = zHasBaroMeter ? (int) gPSActiveTrack.getAltitude() : i6;
                sportRecord.setLocation(Geohash.encode(gPSActiveTrack.getLatitude(), gPSActiveTrack.getLongitude()));
                sb10.append(timestamp);
                sb10.append(",");
                sb10.append(gPSActiveTrack.getSpeed());
                i3 = altitude;
                z2 = zHasBaroMeter;
                sb2 = sb9;
                sb6 = sb12;
                sb = sb7;
                i8 = i10;
            } else {
                List<GPSActiveTrack> list2 = activeTracks;
                StringBuilder sb13 = sb6;
                int i11 = i8;
                i2 = i9;
                int i12 = i7 - 1;
                long timestamp2 = (gPSActiveTrack.getTimestamp() / 1000) - (list2.get(i12).getTimestamp() / 1000);
                sb3.append(";");
                StringBuilder sb14 = sb9;
                sb3.append((long) ((gPSActiveTrack.getLatitude() - list2.get(i12).getLatitude()) * 1.0E8f));
                sb3.append(",");
                sb3.append((long) ((gPSActiveTrack.getLongitude() - list2.get(i12).getLongitude()) * 1.0E8f));
                sb4.append(";");
                sb4.append((int) (gPSActiveTrack.getAltitude() * 100.0f));
                sb5.append(";");
                sb5.append(timestamp2);
                sb6 = sb13;
                sb6.append(";");
                sb6.append(gPSActiveTrack.getState());
                sb = sb7;
                sb.append(";");
                sb.append(NumberFormatter.formatFloat2String(gPSActiveTrack.getPace(), 2, new int[0]));
                sb2 = sb14;
                sb2.append(";");
                sb2.append(gPSActiveTrack.getAccuracy());
                if (zHasBaroMeter) {
                    int altitude2 = (int) gPSActiveTrack.getAltitude();
                    if (d(i6) && d(altitude2)) {
                        i3 = i6;
                        int i13 = i3 - altitude2;
                        z2 = zHasBaroMeter;
                        if (Math.abs(i13) > 1) {
                            if (altitude2 > i3) {
                                i4 = i11 + (altitude2 - i3);
                                i5 = i2;
                            } else {
                                i5 = i2 + i13;
                                i4 = i11;
                            }
                            i2 = i5;
                            i3 = altitude2;
                        }
                        if (d(altitude2) && !d(i3)) {
                            i3 = altitude2;
                        }
                    } else {
                        i3 = i6;
                        z2 = zHasBaroMeter;
                        list = list2;
                    }
                    list = list2;
                    i4 = i11;
                    if (d(altitude2)) {
                        i3 = altitude2;
                    }
                } else {
                    i3 = i6;
                    z2 = zHasBaroMeter;
                    list = list2;
                    i4 = i11;
                }
                r21.append(";");
                r21.append(timestamp2);
                r21.append(",");
                r21.append(gPSActiveTrack.getSpeed());
                i8 = i4;
            }
            i7++;
            sb10 = sb10;
            sb7 = sb;
            i6 = i3;
            sb8 = sb11;
            zHasBaroMeter = z2;
            activeTracks = list;
            i9 = i2;
            sb9 = sb2;
        }
        sportDetailData.setBulkll(sb3.toString());
        sportDetailData.setBulkal(sb4.toString());
        sportDetailData.setBulktime(sb5.toString());
        sportDetailData.setBulkflag(sb6.toString());
        sportDetailData.setBulkpace(sb7.toString());
        sportDetailData.setBulkpause(sb8.toString());
        sportDetailData.setBulkacc(sb9.toString());
        sportDetailData.setBulkspeed(sb10.toString());
        sportDetailData.setSize(Integer.valueOf(activeTracks.size()));
        sportRecord.setAltitudeAscend(Integer.valueOf(i8));
        sportRecord.setAltitudeDescend(Integer.valueOf(i9));
    }
}
