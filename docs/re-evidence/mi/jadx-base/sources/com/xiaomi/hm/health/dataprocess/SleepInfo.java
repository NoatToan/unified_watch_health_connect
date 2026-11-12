package com.xiaomi.hm.health.dataprocess;

import com.xiaomi.fitness.statistics.StatConstants;
import com.xiaomi.smarthome.library.common.util.DateTimeHelper;
import com.xiaomi.wearable.hm.BroadcastsKt;
import defpackage.le;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class SleepInfo implements Serializable {
    public static final int ALGOLIB_FLASH_ERROR = 3;
    public static final int ALGOLIB_SLEEP_MALLOC_FAILURE = 2;
    public static final int ALGOLIB_STEP_MALLOC_FAILURE = 1;
    public static final int ALGOLIB_SUCCESS = 0;
    private static final String KEY_AWAKE_COUNT = "wc";
    private static final String KEY_AWAKE_MINUTES = "wk";
    private static final String KEY_DEEP_MINUTES = "dp";
    private static final String KEY_DREAM_TIME = "dt";
    private static final String KEY_END_DATE = "ed";
    private static final String KEY_INTO_SLEEP_COUNT = "is";
    private static final String KEY_LAZY_BED_COUNT = "lb";
    private static final String KEY_LIGHT_MINUTES = "lt";
    private static final String KEY_REST_HEART_RATE = "rhr";
    public static final String KEY_SLEEP_FEELING = "sf";
    public static final String KEY_SLEEP_INFO = "slp";
    private static final String KEY_SLEEP_ODD_STAGE = "odd_stage";
    private static final String KEY_SLEEP_POS_ON_BACK = "spob";
    private static final String KEY_SLEEP_POS_ON_LEFT = "spol";
    private static final String KEY_SLEEP_POS_ON_RIGHT = "spor";
    private static final String KEY_SLEEP_POS_ON_STOMACH = "spos";
    private static final String KEY_SLEEP_SCORE = "ss";
    private static final String KEY_SLEEP_STAGE = "stage";
    private static final String KEY_START_DATE = "st";
    private static final String KEY_TURN_OVER_COUNT = "to";
    private static final String KEY_USER_SLEEP_END = "usrEd";
    private static final String KEY_USER_SLEEP_START = "usrSt";
    public static final int NOSLEEP_DATALOST = 2;
    public static final int NOSLEEP_NONE = 0;
    public static final int NOSLEEP_NONWEAR = 1;
    public static final int NOSLEEP_UNKNOWN = 255;
    private static final String TAG = "SleepInfo";
    private SportDay day;
    private boolean isRemSupport;
    private int noWear;
    private Date oStartDate;
    private boolean shortSleepSupported;
    private int sleepPosOnBack;
    private int sleepPosOnLeft;
    private int sleepPosOnRight;
    private int sleepPosOnStomach;
    private Date startDate;
    private int startIdx;
    private Date startOnBedDate;
    private Date stopDate;
    private int stopIdx;
    private Date stopOnBedDate;
    private int uDp;
    private int uDt;
    private int uLt;
    private int uStartIdx;
    private int uStopIdx;
    private int uWc;
    private int uWk;
    private int us;
    private int minutesOfRem = 0;
    private int minutesOfNonRem = 0;
    private int sleepCount = 0;
    private int awakeCount = 0;
    private int awakeNum = 0;
    private int userSleepStart = Integer.MIN_VALUE;
    private int userSleepEnd = Integer.MIN_VALUE;
    private int nosleepReason = 0;
    private boolean hasSleep = false;
    private boolean hasSleepPosResult = false;
    private ArrayList<StageSleep> stageSleep = new ArrayList<>();
    private ArrayList<StageSleep> uStageSleep = null;
    private ArrayList<StageSleep> stageSleep_all = new ArrayList<>();
    private ArrayList<StageSleep> odd_stageSleep = new ArrayList<>();
    private double restHeartRate = -1.0d;
    private int noRestHeartRateMap = -1;
    private int dreamTime = 0;
    private int sleepScore = 0;
    private int intoSleepCount = 0;
    private int lazyBedCount = 0;
    private int turnOverCount = 0;
    private boolean usrEditSlp = false;
    private boolean usrEditSlpStart = false;
    private boolean usrEditSlpEnd = false;
    private int sleepFeeling = 0;
    private int statusCode = 0;
    private boolean is24Sleep = false;
    private int offset = 0;

    public SleepInfo() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        this.startDate = new Date(calendar.getTimeInMillis());
        this.startOnBedDate = new Date(calendar.getTimeInMillis());
        this.stopDate = new Date(calendar.getTimeInMillis());
        this.stopOnBedDate = new Date(calendar.getTimeInMillis());
        this.oStartDate = new Date(calendar.getTimeInMillis());
    }

    private ArrayList<StageSleep> calculateOddStageSleep(ArrayList<StageSleep> arrayList, ArrayList<StageSleep> arrayList2) {
        boolean z;
        ArrayList<StageSleep> arrayList3 = new ArrayList<>();
        if (arrayList2 != null && arrayList2.size() > 0) {
            for (int i = 0; i < arrayList2.size(); i++) {
                if (arrayList2.get(i).mode != 128) {
                    if (arrayList == null || arrayList.size() <= 0) {
                        z = true;
                        break;
                    }
                    int i2 = 0;
                    while (true) {
                        if (i2 >= arrayList.size()) {
                            z = true;
                            break;
                        }
                        if (arrayList.get(i2).start == arrayList2.get(i).start && arrayList.get(i2).stop == arrayList2.get(i).stop) {
                            z = false;
                            break;
                        }
                        i2++;
                    }
                    if (this.is24Sleep) {
                        if (z && arrayList2.get(i).start >= DateTimeHelper.sDayInMinutes) {
                            arrayList3.add(arrayList2.get(i));
                        }
                    } else if (z && arrayList2.get(i).stop % 1440 <= 1080) {
                        arrayList3.add(arrayList2.get(i));
                    }
                }
            }
        }
        return arrayList3;
    }

    private String listToString(List<?> list) {
        if (list == null) {
            return AbstractJsonLexerKt.NULL;
        }
        return Arrays.toString(list.toArray()) + ", Size : " + list.size();
    }

    private Date updateDateAsIndex(Date date, int i) {
        Calendar calendar = Calendar.getInstance();
        calendar.clear();
        calendar.setTime(date);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.add(12, i);
        return calendar.getTime();
    }

    public void clear() {
        this.stageSleep.clear();
        this.stageSleep = null;
        this.stageSleep_all.clear();
        this.stageSleep_all = null;
        this.odd_stageSleep.clear();
        this.odd_stageSleep = null;
        ArrayList<StageSleep> arrayList = this.uStageSleep;
        if (arrayList != null) {
            arrayList.clear();
            this.uStageSleep = null;
        }
        this.day = null;
        this.startDate = null;
        this.startOnBedDate = null;
        this.stopDate = null;
        this.stopOnBedDate = null;
    }

    public int getAwakeCount() {
        return this.awakeCount;
    }

    public int getAwakeNum() {
        return this.awakeNum;
    }

    public int getDreamTime() {
        return this.dreamTime;
    }

    public boolean getHasSleep() {
        return this.hasSleep;
    }

    public int getIntoSleepCount() {
        return this.intoSleepCount;
    }

    public int getLazyBedCount() {
        return this.lazyBedCount;
    }

    public int getNoRestHeartRateMap() {
        return this.noRestHeartRateMap;
    }

    public int getNonRemCount() {
        return this.minutesOfNonRem;
    }

    public int getNosleepReason() {
        return this.nosleepReason;
    }

    public ArrayList<StageSleep> getOddStageSleep() {
        return this.odd_stageSleep;
    }

    public int getOffset() {
        return this.offset;
    }

    public int getRemCount() {
        return this.minutesOfRem;
    }

    public int getRestHeartRate() {
        return (int) Math.round(this.restHeartRate);
    }

    public int getSleepCount() {
        return this.sleepCount;
    }

    public int getSleepFeeling() {
        return this.sleepFeeling;
    }

    public int getSleepPosOnBack() {
        return this.sleepPosOnBack;
    }

    public int getSleepPosOnLeft() {
        return this.sleepPosOnLeft;
    }

    public int getSleepPosOnRight() {
        return this.sleepPosOnRight;
    }

    public int getSleepPosOnStomach() {
        return this.sleepPosOnStomach;
    }

    public int getSleepScore() {
        return this.sleepScore;
    }

    public SportDay getSportDay() {
        return this.day;
    }

    public ArrayList<StageSleep> getStageSleep() {
        return this.stageSleep;
    }

    public Date getStartDate() {
        return this.startDate;
    }

    public int getStartDateMin() {
        return (this.startDate.getHours() * 60) + this.startDate.getMinutes();
    }

    public String getStartDateStr() {
        Object objValueOf;
        Object objValueOf2;
        int hours = this.startDate.getHours();
        int minutes = this.startDate.getMinutes();
        StringBuilder sb = new StringBuilder();
        if (hours < 10) {
            objValueOf = "0" + hours;
        } else {
            objValueOf = Integer.valueOf(hours);
        }
        sb.append(objValueOf);
        sb.append(":");
        if (minutes < 10) {
            objValueOf2 = "0" + minutes;
        } else {
            objValueOf2 = Integer.valueOf(minutes);
        }
        sb.append(objValueOf2);
        return sb.toString();
    }

    public int getStartIdx() {
        return this.startIdx;
    }

    public Date getStartOnBedDate() {
        return this.startOnBedDate;
    }

    public Date getStopDate() {
        return this.stopDate;
    }

    public int getStopDateMin() {
        return (this.stopDate.getHours() * 60) + this.stopDate.getMinutes();
    }

    public String getStopDateStr() {
        Object objValueOf;
        Object objValueOf2;
        int hours = this.stopDate.getHours();
        int minutes = this.stopDate.getMinutes();
        StringBuilder sb = new StringBuilder();
        if (hours < 10) {
            objValueOf = "0" + hours;
        } else {
            objValueOf = Integer.valueOf(hours);
        }
        sb.append(objValueOf);
        sb.append(":");
        if (minutes < 10) {
            objValueOf2 = "0" + minutes;
        } else {
            objValueOf2 = Integer.valueOf(minutes);
        }
        sb.append(objValueOf2);
        return sb.toString();
    }

    public int getStopIdx() {
        return this.stopIdx;
    }

    public Date getStopOnBedDate() {
        return this.stopOnBedDate;
    }

    public JSONObject getSummaryJson() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("st", this.startDate.getTime() / 1000);
            jSONObject.put(KEY_END_DATE, this.stopDate.getTime() / 1000);
            jSONObject.put(KEY_DEEP_MINUTES, this.minutesOfNonRem);
            jSONObject.put(KEY_LIGHT_MINUTES, this.minutesOfRem);
            jSONObject.put("wk", this.awakeCount);
            int i = this.userSleepStart;
            if (i > Integer.MIN_VALUE) {
                jSONObject.put(KEY_USER_SLEEP_START, i);
            }
            int i2 = this.userSleepEnd;
            if (i2 > Integer.MIN_VALUE) {
                jSONObject.put(KEY_USER_SLEEP_END, i2);
            }
            jSONObject.put(KEY_AWAKE_COUNT, this.awakeNum);
            jSONObject.put(KEY_INTO_SLEEP_COUNT, this.intoSleepCount);
            jSONObject.put(KEY_LAZY_BED_COUNT, this.lazyBedCount);
            jSONObject.put("to", this.turnOverCount);
            jSONObject.put("dt", this.dreamTime);
            jSONObject.put(KEY_REST_HEART_RATE, this.restHeartRate);
            jSONObject.put(KEY_SLEEP_SCORE, this.sleepScore);
            if (this.hasSleepPosResult) {
                jSONObject.put(KEY_SLEEP_POS_ON_STOMACH, this.sleepPosOnStomach);
                jSONObject.put(KEY_SLEEP_POS_ON_LEFT, this.sleepPosOnLeft);
                jSONObject.put(KEY_SLEEP_POS_ON_RIGHT, this.sleepPosOnRight);
                jSONObject.put(KEY_SLEEP_POS_ON_BACK, this.sleepPosOnBack);
            }
            if (!this.stageSleep.isEmpty()) {
                JSONArray jSONArray = new JSONArray();
                for (StageSleep stageSleep : this.stageSleep) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put(StatConstants.PARAM_START, stageSleep.start);
                    jSONObject2.put(BroadcastsKt.SILENT_PUSHING_STOP, stageSleep.stop);
                    jSONObject2.put("mode", stageSleep.mode);
                    jSONArray.put(jSONObject2);
                }
                jSONObject.put("stage", jSONArray);
            }
            ArrayList<StageSleep> oddStageSleep = getOddStageSleep();
            if (!oddStageSleep.isEmpty()) {
                JSONArray jSONArray2 = new JSONArray();
                for (StageSleep stageSleep2 : oddStageSleep) {
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put(StatConstants.PARAM_START, stageSleep2.start);
                    jSONObject3.put(BroadcastsKt.SILENT_PUSHING_STOP, stageSleep2.stop);
                    jSONObject3.put("mode", stageSleep2.mode);
                    jSONArray2.put(jSONObject3);
                }
                jSONObject.put(KEY_SLEEP_ODD_STAGE, jSONArray2);
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public int getTurnOverCount() {
        return this.turnOverCount;
    }

    public JSONObject getUsrSummaryJson() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("st", this.startDate.getTime() / 1000);
            jSONObject.put(KEY_END_DATE, this.stopDate.getTime() / 1000);
            jSONObject.put(KEY_DEEP_MINUTES, this.uDp);
            jSONObject.put(KEY_LIGHT_MINUTES, this.uLt);
            jSONObject.put("wk", this.uWk);
            jSONObject.put(KEY_AWAKE_COUNT, this.uWc);
            jSONObject.put(KEY_SLEEP_FEELING, this.sleepFeeling);
            jSONObject.put(KEY_INTO_SLEEP_COUNT, this.intoSleepCount);
            jSONObject.put(KEY_LAZY_BED_COUNT, this.lazyBedCount);
            jSONObject.put("to", this.turnOverCount);
            jSONObject.put("dt", this.dreamTime);
            jSONObject.put(KEY_SLEEP_SCORE, this.sleepScore);
            jSONObject.put(KEY_REST_HEART_RATE, this.restHeartRate);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    public int getuStartIdx() {
        return this.uStartIdx;
    }

    public int getuStopIdx() {
        return this.uStopIdx;
    }

    public boolean hasNormalSleep() {
        return this.minutesOfNonRem + this.minutesOfRem > 0;
    }

    public boolean hasSleepPos() {
        return this.hasSleepPosResult;
    }

    public boolean isRemSupport() {
        return this.isRemSupport;
    }

    public boolean isShortSleepSupported() {
        return this.shortSleepSupported;
    }

    public boolean isUsrEditSlp() {
        return this.usrEditSlp;
    }

    public boolean isUsrEditSlpEnd() {
        return this.usrEditSlpEnd;
    }

    public boolean isUsrEditSlpStart() {
        return this.usrEditSlpStart;
    }

    public void setAwakeCount(int i) {
        this.awakeCount = i;
    }

    public void setAwakeNum(int i) {
        this.awakeNum = i;
    }

    public void setDreamTime(int i) {
        this.dreamTime = i;
    }

    public void setHasSleep(boolean z) {
        this.hasSleep = z;
    }

    public void setHasSleepPosResult(int i) {
        this.hasSleepPosResult = i == 1;
    }

    public void setInfos(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, ArrayList<StageSleep> arrayList, ArrayList<StageSleep> arrayList2, int i14) {
        this.startDate = updateDateAsIndex(this.startDate, i);
        this.startOnBedDate = updateDateAsIndex(this.startOnBedDate, i2);
        this.stopDate = updateDateAsIndex(this.stopDate, i3);
        this.stopOnBedDate = updateDateAsIndex(this.stopOnBedDate, i4);
        this.minutesOfRem = i5;
        this.minutesOfNonRem = i6;
        this.sleepCount = i7;
        this.awakeCount = i8;
        this.awakeNum = i9;
        this.userSleepStart = i10;
        this.userSleepEnd = i11;
        this.nosleepReason = i12;
        this.hasSleep = i13 == 1;
        this.stageSleep = arrayList;
        this.stageSleep_all = arrayList2;
        this.odd_stageSleep = calculateOddStageSleep(arrayList, arrayList2);
        this.statusCode = i14;
        this.startIdx = i + 1440;
        this.stopIdx = i3 + 1440;
        Calendar calendar = Calendar.getInstance();
        calendar.clear();
        calendar.setTime(this.stopDate);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        this.oStartDate = calendar.getTime();
    }

    public void setIntoSleepCount(int i) {
        this.intoSleepCount = i;
    }

    public void setIs24Sleep(Boolean bool) {
        this.is24Sleep = bool.booleanValue();
    }

    public void setLazyBedCount(int i) {
        this.lazyBedCount = i;
    }

    public void setNoRestHeartRateMap(int i) {
        this.noRestHeartRateMap = i;
    }

    public void setNonRemCount(int i) {
        this.minutesOfNonRem = i;
    }

    public void setNosleepReason(int i) {
        this.nosleepReason = i;
    }

    public void setOddStageSleep(ArrayList<StageSleep> arrayList) {
        this.odd_stageSleep = arrayList;
    }

    public void setOffset(int i) {
        this.offset = i;
    }

    public void setRemCount(int i) {
        this.minutesOfRem = i;
    }

    public void setRemSupport(int i) {
        this.isRemSupport = i == 1;
    }

    public void setRestHeartRate(double d) {
        this.restHeartRate = d;
    }

    public void setShortSleepSupported(int i) {
        this.shortSleepSupported = i == 1;
    }

    public void setSleepCount(int i) {
        this.sleepCount = i;
    }

    public void setSleepFeeling(int i) {
        this.sleepFeeling = i;
    }

    public void setSleepPosTime(int i, int i2, int i3, int i4) {
        this.sleepPosOnStomach = i;
        this.sleepPosOnLeft = i2;
        this.sleepPosOnRight = i3;
        this.sleepPosOnBack = i4;
    }

    public void setSleepScore(int i) {
        this.sleepScore = i;
    }

    public void setSportDay(SportDay sportDay) {
        this.day = sportDay;
    }

    public void setStageSleep(ArrayList<StageSleep> arrayList) {
        this.stageSleep = arrayList;
    }

    public void setStartDate(Date date) {
        this.startDate = date;
    }

    public void setStartOnBedDate(Date date) {
        this.startOnBedDate = date;
    }

    public void setStopDate(Date date) {
        this.stopDate = date;
    }

    public void setStopOnBedDate(Date date) {
        this.stopOnBedDate = date;
    }

    public void setTurnOverCount(int i) {
        this.turnOverCount = i;
    }

    public void setUserEditIdx(long j, long j2, SportDay sportDay) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        Calendar calendar = Calendar.getInstance();
        calendar.clear();
        calendar.setTime(new Date(j));
        Calendar calendar2 = Calendar.getInstance();
        calendar2.clear();
        calendar2.setTime(new Date(j2));
        int i6 = (calendar.get(11) * 60) + calendar.get(12);
        int i7 = (calendar2.get(11) * 60) + calendar2.get(12);
        if (sportDay.offsetDay(new SportDay(calendar)) == 0) {
            i6 += 1440;
        }
        if (sportDay.offsetDay(new SportDay(calendar2)) == 0) {
            i7 += 1440;
        }
        le.d(TAG, "theDay :====================  " + sportDay.getKey() + ";new SportDay(mSleepTime) = " + new SportDay(calendar).getKey(), new Object[0]);
        le.d(TAG, "start:" + i6 + ",stop:" + i7, new Object[0]);
        le.c(TAG, "old start:" + this.startDate.toString() + ",stop:" + this.stopDate.toString(), new Object[0]);
        if (i7 <= i6) {
            le.d(TAG, "error idx = " + i6 + ";" + i7, new Object[0]);
            return;
        }
        if (i6 == this.uStartIdx && i7 == this.uStopIdx) {
            le.d(TAG, "no data change = " + i6 + ";" + i7, new Object[0]);
            return;
        }
        if (this.usrEditSlp) {
            le.c(TAG, "copy origin uStageSleep to stageSleep when not first edit slp", new Object[0]);
            this.stageSleep.clear();
            if (!this.uStageSleep.isEmpty()) {
                for (StageSleep stageSleep : this.uStageSleep) {
                    StageSleep stageSleep2 = new StageSleep();
                    stageSleep2.setInfos(stageSleep.start, stageSleep.stop, stageSleep.mode);
                    this.stageSleep.add(stageSleep2);
                }
            }
        } else {
            le.c(TAG, "first set slp,copy origin stageSleep", new Object[0]);
            this.uStageSleep = new ArrayList<>();
            if (!this.stageSleep.isEmpty()) {
                for (StageSleep stageSleep3 : this.stageSleep) {
                    StageSleep stageSleep4 = new StageSleep();
                    stageSleep4.setInfos(stageSleep3.start, stageSleep3.stop, stageSleep3.mode);
                    this.uStageSleep.add(stageSleep4);
                }
            }
        }
        this.uStartIdx = i6;
        this.uStopIdx = i7;
        this.usrEditSlp = true;
        this.hasSleep = true;
        ArrayList<StageSleep> arrayList = this.stageSleep;
        if (arrayList == null || arrayList.isEmpty()) {
            le.c(TAG, "stageSleep is empty or null " + i6 + ";" + i7, new Object[0]);
            StageSleep stageSleep5 = new StageSleep();
            stageSleep5.setInfos(this.uStartIdx, this.uStopIdx, 9);
            this.stageSleep.add(stageSleep5);
            this.usrEditSlpStart = true;
            this.usrEditSlpEnd = true;
        } else {
            int i8 = this.stageSleep.get(0).start;
            ArrayList<StageSleep> arrayList2 = this.stageSleep;
            int i9 = arrayList2.get(arrayList2.size() - 1).stop + 1;
            this.usrEditSlpStart = this.uStartIdx != i8;
            this.usrEditSlpEnd = this.uStopIdx != i9;
            le.c(TAG, "old start:" + i8 + ",stop:" + i9 + "," + this.uStartIdx + "," + this.uStopIdx, new Object[0]);
            int i10 = this.uStartIdx;
            if (i10 >= i9 || (i = this.uStopIdx) <= i8) {
                le.c(TAG, "clear all ,and create new one " + this.uStartIdx + ";" + this.uStopIdx, new Object[0]);
                this.stageSleep.clear();
                StageSleep stageSleep6 = new StageSleep();
                stageSleep6.setInfos(this.uStartIdx, this.uStopIdx, 9);
                this.stageSleep.add(stageSleep6);
            } else if (i10 <= i8 && i >= i9) {
                le.c(TAG, "create new head and tail " + this.uStartIdx + ";" + this.uStopIdx, new Object[0]);
                if (i8 > this.uStartIdx) {
                    StageSleep stageSleep7 = new StageSleep();
                    stageSleep7.setInfos(this.uStartIdx, i8 - 1, 9);
                    this.stageSleep.add(0, stageSleep7);
                }
                if (this.uStopIdx > i9) {
                    StageSleep stageSleep8 = new StageSleep();
                    stageSleep8.setInfos(i9, this.uStopIdx, 9);
                    this.stageSleep.add(stageSleep8);
                }
            } else if (i10 <= i8 && i < i9) {
                le.c(TAG, "create new head,update tail : " + this.uStartIdx + ";" + this.uStopIdx, new Object[0]);
                if (i8 > this.uStartIdx) {
                    StageSleep stageSleep9 = new StageSleep();
                    stageSleep9.setInfos(this.uStartIdx, i8 - 1, 9);
                    this.stageSleep.add(0, stageSleep9);
                }
                Iterator<StageSleep> it = this.stageSleep.iterator();
                while (it.hasNext()) {
                    StageSleep next = it.next();
                    le.c(TAG, "stg = " + next.toString(), new Object[0]);
                    int i11 = this.uStopIdx;
                    int i12 = next.stop;
                    if (i11 <= i12 && i11 >= (i5 = next.start)) {
                        if (i11 == i5) {
                            le.c(TAG, "stop remove : " + next.toString(), new Object[0]);
                            it.remove();
                        } else if (i11 == i12) {
                            le.c(TAG, "do nothing ", new Object[0]);
                            next.stop = this.uStopIdx - 1;
                        } else {
                            le.c(TAG, "update : stg = " + next.toString(), new Object[0]);
                            next.stop = this.uStopIdx - 1;
                        }
                        int i13 = next.mode;
                        if (i13 != 5 && i13 != 4) {
                            next.mode = 9;
                        }
                    } else if (next.start > i11) {
                        le.c(TAG, "remove : " + next.toString(), new Object[0]);
                        it.remove();
                    }
                }
            } else if (i10 >= i8 && i <= i9) {
                le.c(TAG, "update head,update tail : " + this.uStartIdx + ";" + this.uStopIdx, new Object[0]);
                Iterator<StageSleep> it2 = this.stageSleep.iterator();
                while (it2.hasNext()) {
                    StageSleep next2 = it2.next();
                    le.c(TAG, " ;stg = " + next2.toString(), new Object[0]);
                    int i14 = next2.stop;
                    int i15 = this.uStartIdx;
                    if (i14 < i15 || (i3 = next2.start) > (i4 = this.uStopIdx)) {
                        le.c(TAG, "remove : " + next2.toString(), new Object[0]);
                        it2.remove();
                    } else if (i15 <= i14 && i15 >= i3) {
                        if (i15 == i3) {
                            le.c(TAG, "do nothing  ", new Object[0]);
                        } else if (i15 == i14) {
                            le.c(TAG, "start remove " + next2.toString(), new Object[0]);
                            it2.remove();
                        } else {
                            le.c(TAG, "update : stg = " + next2.toString(), new Object[0]);
                            next2.start = this.uStartIdx;
                        }
                        int i16 = next2.mode;
                        if (i16 != 5 && i16 != 4) {
                            next2.mode = 9;
                        }
                    } else if (i4 <= i14 && i4 >= i3) {
                        if (i4 == i3) {
                            le.c(TAG, "stop remove : " + next2.toString(), new Object[0]);
                            it2.remove();
                        } else if (i4 == i14) {
                            le.c(TAG, "do nothing ", new Object[0]);
                            next2.stop = this.uStopIdx - 1;
                        } else {
                            le.c(TAG, "update : stg = " + next2.toString(), new Object[0]);
                            next2.stop = this.uStopIdx - 1;
                        }
                        int i17 = next2.mode;
                        if (i17 != 5 && i17 != 4) {
                            next2.mode = 9;
                        }
                    }
                }
            } else if (i10 > i8 && i > i9) {
                le.c(TAG, "update head,new tail : " + this.uStartIdx + ";" + this.uStopIdx, new Object[0]);
                Iterator<StageSleep> it3 = this.stageSleep.iterator();
                while (it3.hasNext()) {
                    StageSleep next3 = it3.next();
                    le.c(TAG, "stg = " + next3.toString(), new Object[0]);
                    int i18 = this.uStartIdx;
                    int i19 = next3.stop;
                    if (i18 <= i19 && i18 >= (i2 = next3.start)) {
                        if (i18 == i2) {
                            le.c(TAG, "do nothing ", new Object[0]);
                        } else if (i18 == i19) {
                            le.c(TAG, "uStartIdx remove : " + next3.toString(), new Object[0]);
                            it3.remove();
                        } else {
                            le.c(TAG, "update stg = " + next3.toString(), new Object[0]);
                            next3.start = this.uStartIdx;
                        }
                        int i20 = next3.mode;
                        if (i20 != 5 && i20 != 4) {
                            next3.mode = 9;
                        }
                    } else if (i19 < i18) {
                        le.c(TAG, "remove : " + next3.toString(), new Object[0]);
                        it3.remove();
                    }
                }
                StageSleep stageSleep10 = new StageSleep();
                stageSleep10.setInfos(i9, this.uStopIdx, 9);
                this.stageSleep.add(stageSleep10);
            }
        }
        this.uDp = 0;
        this.uLt = 0;
        this.uWk = 0;
        this.us = 0;
        this.uWc = 0;
        this.uDt = 0;
        this.noWear = 0;
        String str = "\nStageSleepInfo:\n";
        for (StageSleep stageSleep11 : this.stageSleep) {
            str = str + stageSleep11.toString() + "\n";
            int i21 = stageSleep11.mode;
            if (i21 == 5) {
                this.uDp = this.uDp + (stageSleep11.stop - stageSleep11.start) + 1;
            } else if (i21 == 4) {
                this.uLt = this.uLt + (stageSleep11.stop - stageSleep11.start) + 1;
            } else if (i21 == 9) {
                this.us = this.us + (stageSleep11.stop - stageSleep11.start) + 1;
            } else if (i21 == 8) {
                this.uDt = this.uDt + (stageSleep11.stop - stageSleep11.start) + 1;
            } else if (i21 == 3) {
                this.noWear = this.noWear + (stageSleep11.stop - stageSleep11.start) + 1;
            } else {
                this.uWk = this.uWk + (stageSleep11.stop - stageSleep11.start) + 1;
                this.uWc++;
            }
        }
        this.minutesOfRem = this.uLt;
        this.minutesOfNonRem = this.uDp;
        this.dreamTime = this.uDt;
        this.startDate = updateDateAsIndex(this.oStartDate, this.uStartIdx - 1440);
        Date dateUpdateDateAsIndex = updateDateAsIndex(this.oStartDate, this.uStopIdx - 1440);
        this.stopDate = dateUpdateDateAsIndex;
        this.awakeCount = this.uWk;
        this.sleepCount = (((int) (((dateUpdateDateAsIndex.getTime() - this.startDate.getTime()) / 1000) / 60)) - this.awakeCount) - this.noWear;
        le.c(TAG, str + "\nuDp = " + this.uDp + ";uLt = " + this.uLt + ";uWk = " + this.uWk + ";us = " + this.us + " sleepCount = " + this.sleepCount + "; uWc = " + this.uWc + " ; " + this.uDt + " ;  noWear = " + this.noWear + this.startDate.toString() + ";stopDate = " + this.stopDate.toString() + ";oStartDate = " + this.oStartDate.toString(), new Object[0]);
    }

    public void setUserSleepEnd(int i) {
        this.userSleepEnd = i;
    }

    public void setUserSleepStart(int i) {
        this.userSleepStart = i;
    }

    public String toString() {
        return "\nBaseSleepInfo:startDate:" + this.startDate + ",startOnBedDate:" + this.startOnBedDate + ",stopDate:" + this.stopDate + ",stopOnBedDate:" + this.stopOnBedDate + ",minutesOfLight:" + this.minutesOfRem + ",minutesOfDeep:" + this.minutesOfNonRem + ",sleepCount:" + this.sleepCount + ",awakeCount:" + this.awakeCount + ",awakeNum:" + this.awakeNum + ",nosleepReason:" + this.nosleepReason + ",hasSleep:" + this.hasSleep + ",restHeartRate:" + this.restHeartRate + ",stageSleep:" + this.stageSleep.size() + ",uStartIdx:" + this.uStartIdx + ",uStopIdx:" + this.uStopIdx + ",startIdx:" + this.startIdx + ",stopIdx:" + this.stopIdx + ",dreamTime:" + this.dreamTime + ",sleepScore:" + this.sleepScore + ",intoSleepCount:" + this.intoSleepCount + ",lazyBedCount:" + this.lazyBedCount + ",turnOverCount:" + this.turnOverCount + ",statusCode:" + this.statusCode + ",isRemSupport:" + this.isRemSupport + ",shortSleepSupported:" + this.shortSleepSupported + ",StageSleepInfo:" + listToString(this.stageSleep) + ",OddStageSleepInfo:" + listToString(this.odd_stageSleep) + '\n';
    }

    public SleepInfo(long j) {
        le.d(TAG, "SleepInfo date:" + new Date(j) + ",timestamp:" + j, new Object[0]);
        this.startDate = new Date(j);
        this.startOnBedDate = new Date(j);
        this.stopDate = new Date(j);
        this.stopOnBedDate = new Date(j);
        Date date = new Date(j);
        this.oStartDate = date;
        date.setHours(0);
        this.oStartDate.setMinutes(0);
        this.oStartDate.setSeconds(0);
    }
}
