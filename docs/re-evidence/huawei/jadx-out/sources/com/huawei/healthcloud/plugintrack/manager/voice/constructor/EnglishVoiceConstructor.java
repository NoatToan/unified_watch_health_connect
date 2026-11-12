package com.huawei.healthcloud.plugintrack.manager.voice.constructor;

import android.util.ArrayMap;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.jbc;
import health.compact.a.LogAnonymous;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class EnglishVoiceConstructor implements IVoiceContentConstructor, ISoundResourceConstructor {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map<Integer, Integer> f10490c;

    public EnglishVoiceConstructor() {
        ArrayMap arrayMap = new ArrayMap();
        this.f10490c = arrayMap;
        arrayMap.put(0, Integer.valueOf(SoundData.NUM_0.getIndex()));
        this.f10490c.put(1, Integer.valueOf(SoundData.NUM_01.getIndex()));
        this.f10490c.put(2, Integer.valueOf(SoundData.NUM_02.getIndex()));
        this.f10490c.put(3, Integer.valueOf(SoundData.NUM_03.getIndex()));
        this.f10490c.put(4, Integer.valueOf(SoundData.NUM_04.getIndex()));
        this.f10490c.put(5, Integer.valueOf(SoundData.NUM_05.getIndex()));
        this.f10490c.put(6, Integer.valueOf(SoundData.NUM_06.getIndex()));
        this.f10490c.put(7, Integer.valueOf(SoundData.NUM_07.getIndex()));
        this.f10490c.put(8, Integer.valueOf(SoundData.NUM_08.getIndex()));
        this.f10490c.put(9, Integer.valueOf(SoundData.NUM_09.getIndex()));
        this.f10490c.put(10, Integer.valueOf(SoundData.NUM_10.getIndex()));
        this.f10490c.put(11, Integer.valueOf(SoundData.NUM_11.getIndex()));
        this.f10490c.put(12, Integer.valueOf(SoundData.NUM_12.getIndex()));
        this.f10490c.put(13, Integer.valueOf(SoundData.NUM_13.getIndex()));
        this.f10490c.put(14, Integer.valueOf(SoundData.NUM_14.getIndex()));
        this.f10490c.put(15, Integer.valueOf(SoundData.NUM_15.getIndex()));
        this.f10490c.put(16, Integer.valueOf(SoundData.NUM_16.getIndex()));
        this.f10490c.put(17, Integer.valueOf(SoundData.NUM_17.getIndex()));
        this.f10490c.put(18, Integer.valueOf(SoundData.NUM_18.getIndex()));
        this.f10490c.put(19, Integer.valueOf(SoundData.NUM_19.getIndex()));
        this.f10490c.put(20, Integer.valueOf(SoundData.NUM_20.getIndex()));
        this.f10490c.put(30, Integer.valueOf(SoundData.NUM_30.getIndex()));
        this.f10490c.put(40, Integer.valueOf(SoundData.NUM_40.getIndex()));
        this.f10490c.put(50, Integer.valueOf(SoundData.NUM_50.getIndex()));
        this.f10490c.put(60, Integer.valueOf(SoundData.NUM_60.getIndex()));
        this.f10490c.put(70, Integer.valueOf(SoundData.NUM_70.getIndex()));
        this.f10490c.put(80, Integer.valueOf(SoundData.NUM_80.getIndex()));
        this.f10490c.put(90, Integer.valueOf(SoundData.NUM_90.getIndex()));
        this.f10490c.put(100, Integer.valueOf(SoundData.NUM_100.getIndex()));
        this.f10490c.put(1000, Integer.valueOf(SoundData.NUM_1000.getIndex()));
    }

    enum SoundData {
        DINGDONG(R.raw.girl_dingdong, 1),
        SPORT_RESTART(R.raw.boy_sport_restart, 2),
        SPORT_START(R.raw.boy_start, 3),
        DISTANCE(R.raw.boy_ditance, 4),
        FAST(R.raw.boy_fast, 5),
        MINUTE(R.raw.boy_minute, 6),
        MINUTES(R.raw.boy_minutes, 7),
        SECOND(R.raw.boy_second, 8),
        SECONDS(R.raw.boy_seconds, 9),
        KILOMETER(R.raw.boy_kilometer, 10),
        KILOMETERS(R.raw.boy_kilometers, 11),
        KILOMETERS_PER_HOUR(R.raw.boy_kilometers_per_hour, 12),
        LAST_KILOMETER_PACE(R.raw.boy_last_kilometer_pace, 13),
        PACE(R.raw.boy_pace, 14),
        NUM_01(R.raw.boy_num_01, 15),
        NUM_02(R.raw.boy_num_02, 16),
        NUM_03(R.raw.boy_num_03, 17),
        NUM_04(R.raw.boy_num_04, 18),
        NUM_05(R.raw.boy_num_05, 19),
        NUM_06(R.raw.boy_num_06, 20),
        NUM_07(R.raw.boy_num_07, 21),
        NUM_08(R.raw.boy_num_08, 22),
        NUM_09(R.raw.boy_num_09, 23),
        NUM_10(R.raw.boy_num_10, 24),
        NUM_11(R.raw.boy_num_11, 25),
        NUM_12(R.raw.boy_num_12, 26),
        NUM_13(R.raw.boy_num_13, 27),
        NUM_14(R.raw.boy_num_14, 28),
        NUM_15(R.raw.boy_num_15, 29),
        NUM_16(R.raw.boy_num_16, 30),
        NUM_17(R.raw.boy_num_17, 31),
        NUM_18(R.raw.boy_num_18, 32),
        NUM_19(R.raw.boy_num_19, 33),
        NUM_20(R.raw.boy_num_20, 34),
        NUM_30(R.raw.boy_num_30, 35),
        NUM_40(R.raw.boy_num_40, 36),
        NUM_50(R.raw.boy_num_50, 37),
        NUM_60(R.raw.boy_num_60, 38),
        NUM_70(R.raw.boy_num_70, 39),
        NUM_80(R.raw.boy_num_80, 40),
        NUM_90(R.raw.boy_num_90, 41),
        NUM_100(R.raw.boy_num_100, 42),
        TOTAL_DISTANCE(R.raw.boy_total_distance, 43),
        TOTAL_TIME(R.raw.boy_total_time, 44),
        TIME(R.raw.boy_time, 45),
        POINT(R.raw.boy_point, 46),
        COME_ON(R.raw.boy_come_on, 47),
        LET_RELAX(R.raw.boy_let_relax, 48),
        HOUR(R.raw.boy_hour, 49),
        HOURS(R.raw.boy_hours, 50),
        SPORT_OVER(R.raw.boy_sport_over, 53),
        SPORT_PAUSE(R.raw.boy_sport_pause, 54),
        SPORT_STOPPED(R.raw.boy_activity_stopped, 55),
        FINISHED(R.raw.boy_finished, 56),
        YOUR_TARGET(R.raw.boy_your_target, 57),
        NUM_0(R.raw.boy_zero, 58),
        BOY_HEART_RATE(R.raw.boy_heartrate, 59),
        BOY_HEART_RATE_UNIT(R.raw.boy_bpm, 60),
        BOY_AND(R.raw.boy_and, 61),
        EMPTY(R.raw.empty, 62),
        NUM_1000(R.raw.boy_num_1000, 63);

        private int mIndex;
        private int mNameId;

        SoundData(int i, int i2) {
            this.mNameId = i;
            this.mIndex = i2;
        }

        public int getNameId() {
            return this.mNameId;
        }

        public int getIndex() {
            return this.mIndex;
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.manager.voice.constructor.IVoiceContentConstructor
    public Object constructContent(int i, Object obj) {
        LogUtil.d("Track_EnglishVoiceConstructor", "constructContent() type : ", Integer.valueOf(i));
        if (i == 9) {
            return b(obj);
        }
        if (i == 11) {
            return e(obj);
        }
        if (i == 33) {
            return a(obj);
        }
        if (i == 35) {
            return obj;
        }
        switch (i) {
            case 0:
            case 1:
            case 2:
                break;
            case 3:
                ArrayList arrayList = new ArrayList(1);
                arrayList.add(Integer.valueOf(SoundData.SPORT_PAUSE.getIndex()));
                return arrayList;
            case 4:
                ArrayList arrayList2 = new ArrayList(1);
                arrayList2.add(Integer.valueOf(SoundData.SPORT_STOPPED.getIndex()));
                return arrayList2;
            case 5:
                ArrayList arrayList3 = new ArrayList(1);
                arrayList3.add(Integer.valueOf(SoundData.SPORT_RESTART.getIndex()));
                return arrayList3;
            case 6:
                ArrayList arrayList4 = new ArrayList(2);
                arrayList4.add(Integer.valueOf(SoundData.YOUR_TARGET.getIndex()));
                arrayList4.add(Integer.valueOf(SoundData.FINISHED.getIndex()));
                return arrayList4;
            default:
                switch (i) {
                    case 110:
                    case 111:
                    case 112:
                        break;
                    default:
                        ArrayList arrayList5 = new ArrayList(1);
                        arrayList5.add(Integer.valueOf(SoundData.EMPTY.getIndex()));
                        return arrayList5;
                }
                break;
        }
        ArrayList arrayList6 = new ArrayList(1);
        arrayList6.add(Integer.valueOf(SoundData.SPORT_START.getIndex()));
        return arrayList6;
    }

    @Override // com.huawei.healthcloud.plugintrack.manager.voice.constructor.ISoundResourceConstructor
    public Map<Integer, Integer> getSoundResource() {
        HashMap map = new HashMap(SoundData.values().length);
        for (SoundData soundData : SoundData.values()) {
            map.put(Integer.valueOf(soundData.getIndex()), Integer.valueOf(soundData.getNameId()));
        }
        LogUtil.d("Track_EnglishVoiceConstructor", "getSoundResource() map size", Integer.valueOf(map.size()));
        return map;
    }

    private List<Integer> a(Object obj) {
        if (!(obj instanceof jbc)) {
            LogUtil.a("Track_EnglishVoiceConstructor", "constructDistanceTimeContent parameter is invalid");
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(Integer.valueOf(SoundData.EMPTY.getIndex()));
            return arrayList;
        }
        int i = ((jbc) obj).i();
        ArrayList arrayList2 = new ArrayList(10);
        if (i > 0) {
            LogUtil.a("Track_EnglishVoiceConstructor", "construct skip times:", Integer.valueOf(i));
            e(arrayList2, i);
        }
        return arrayList2;
    }

    private List<Integer> b(Object obj) {
        if (!(obj instanceof jbc)) {
            LogUtil.a("Track_EnglishVoiceConstructor", "constructDistanceTimeContent parameter is invalid");
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(Integer.valueOf(SoundData.EMPTY.getIndex()));
            return arrayList;
        }
        jbc jbcVar = (jbc) obj;
        int iRound = Math.round(jbcVar.b());
        ArrayList arrayList2 = new ArrayList(10);
        arrayList2.add(Integer.valueOf(SoundData.DINGDONG.getIndex()));
        arrayList2.add(Integer.valueOf(SoundData.TOTAL_DISTANCE.getIndex()));
        if (iRound > 0) {
            LogUtil.a("Track_EnglishVoiceConstructor", "constructDistanceTimeContent total distance:", LogAnonymous.d(iRound));
            e(arrayList2, iRound);
        }
        if (iRound > 1) {
            arrayList2.add(Integer.valueOf(SoundData.KILOMETERS.getIndex()));
        } else if (iRound > 0) {
            arrayList2.add(Integer.valueOf(SoundData.KILOMETER.getIndex()));
        } else {
            LogUtil.j("Track_EnglishVoiceConstructor", "currentKilometer <= 0");
        }
        arrayList2.add(Integer.valueOf(SoundData.TOTAL_TIME.getIndex()));
        long jR = jbcVar.r();
        LogUtil.a("Track_EnglishVoiceConstructor", "constructDistanceTimeContent total TIME:", LogAnonymous.a(jR), ", count kilo:", LogAnonymous.d(iRound));
        a((List<Integer>) arrayList2, jR);
        long jG = jbcVar.g();
        if (jG > 0) {
            arrayList2.add(Integer.valueOf(SoundData.LAST_KILOMETER_PACE.getIndex()));
            LogUtil.a("Track_EnglishVoiceConstructor", "constructDistanceTimeContent last kilo TIME:", String.valueOf(LogAnonymous.a(jG)));
            a((List<Integer>) arrayList2, jG);
        }
        int iE = jbcVar.e();
        if (iE > 0) {
            arrayList2.add(Integer.valueOf(SoundData.BOY_HEART_RATE.getIndex()));
            e(arrayList2, iE);
            arrayList2.add(Integer.valueOf(SoundData.BOY_HEART_RATE_UNIT.getIndex()));
        }
        return arrayList2;
    }

    private List<Integer> e(Object obj) {
        if (!(obj instanceof jbc)) {
            LogUtil.a("Track_EnglishVoiceConstructor", "constructSportStateVoiceContent parameter is invalid");
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(Integer.valueOf(SoundData.EMPTY.getIndex()));
            return arrayList;
        }
        jbc jbcVar = (jbc) obj;
        float fB = jbcVar.b();
        ArrayList arrayList2 = new ArrayList(10);
        arrayList2.add(Integer.valueOf(SoundData.DINGDONG.getIndex()));
        arrayList2.add(Integer.valueOf(SoundData.TOTAL_DISTANCE.getIndex()));
        int iFloor = (int) Math.floor(fB);
        e(jbcVar, fB, arrayList2, iFloor, new BigDecimal(fB - iFloor).setScale(2, 4).doubleValue());
        return arrayList2;
    }

    private void e(jbc jbcVar, float f, List<Integer> list, int i, double d) {
        c(f, list, i, d);
        if (f > 1.0f) {
            list.add(Integer.valueOf(SoundData.KILOMETERS.getIndex()));
        } else if (f < 0.0f) {
            LogUtil.j("Track_EnglishVoiceConstructor", "currentKilometer < 0");
        } else {
            list.add(Integer.valueOf(SoundData.KILOMETER.getIndex()));
        }
        list.add(Integer.valueOf(SoundData.TOTAL_TIME.getIndex()));
        a(list, jbcVar.r());
        b(jbcVar.g(), list);
        int iE = jbcVar.e();
        if (iE > 0) {
            list.add(Integer.valueOf(SoundData.BOY_HEART_RATE.getIndex()));
            e(list, iE);
            list.add(Integer.valueOf(SoundData.BOY_HEART_RATE_UNIT.getIndex()));
        }
        LogUtil.a("Track_EnglishVoiceConstructor", list);
    }

    private void c(float f, List<Integer> list, int i, double d) {
        String string = Double.toString(d);
        int iIndexOf = string.indexOf(46);
        int i2 = 0;
        if (iIndexOf >= 0) {
            string = string.substring(iIndexOf + 1);
            try {
                i2 = Integer.parseInt(string);
            } catch (NumberFormatException e) {
                LogUtil.a("Track_EnglishVoiceConstructor", "handleDistanceVoice NumberFormatException", e.getMessage());
            }
        }
        if (iIndexOf < 0 || i2 <= 0) {
            if (i == 0) {
                list.add(Integer.valueOf(SoundData.NUM_0.getIndex()));
                return;
            } else {
                e(list, i);
                return;
            }
        }
        if (f > 0.0f && f < 1.0f) {
            list.add(Integer.valueOf(SoundData.NUM_0.getIndex()));
        } else {
            e(list, i);
        }
        list.add(Integer.valueOf(SoundData.POINT.getIndex()));
        c(list, string);
    }

    private void c(List<Integer> list, String str) {
        if (str.length() != 0) {
            int length = str.length();
            for (int i = 0; i < length; i++) {
                try {
                    d(list, Integer.parseInt(String.valueOf(str.charAt(i))));
                } catch (NumberFormatException e) {
                    LogUtil.a("Track_EnglishVoiceConstructor", "handlePointString NumberFormatException", e.getMessage());
                }
            }
        }
    }

    private void b(long j, List<Integer> list) {
        if (j > 0) {
            list.add(Integer.valueOf(SoundData.LAST_KILOMETER_PACE.getIndex()));
            a(list, j);
        }
    }

    private void a(List<Integer> list, long j) {
        long j2 = j / 1000;
        LogUtil.d("Track_EnglishVoiceConstructor", "addTimeResource TIME:", String.valueOf(j2));
        float f = j2;
        c(list, f);
        a(list, f);
        d(list, f);
    }

    private void c(List<Integer> list, float f) {
        int i = (int) ((f / 3600.0f) % 100.0f);
        int i2 = (i / 100) % 10;
        int i3 = i / 10;
        int i4 = i % 10;
        if (i2 > 0) {
            d(list, i2);
            list.add(Integer.valueOf(SoundData.NUM_100.getIndex()));
        }
        if (i3 > 1) {
            d(list, i3 * 10);
        } else if (i3 <= 0) {
            LogUtil.j("Track_EnglishVoiceConstructor", "hourDecadeValue <= 0");
        } else {
            d(list, (i3 * 10) + i4);
        }
        if (i3 != 1 && i4 > 0) {
            d(list, i4);
        }
        if (i > 1) {
            list.add(Integer.valueOf(SoundData.HOURS.getIndex()));
        } else if (i <= 0) {
            LogUtil.j("Track_EnglishVoiceConstructor", "hour <= 0");
        } else {
            list.add(Integer.valueOf(SoundData.HOUR.getIndex()));
        }
    }

    private void a(List<Integer> list, float f) {
        int i = (int) ((f / 60.0f) % 60.0f);
        int i2 = i / 10;
        int i3 = i % 10;
        LogUtil.a("Track_EnglishVoiceConstructor", "convertTimeToSpeakListEng ", " minuteDecadeValue:", Integer.valueOf(i2), " minuteUnitValue:", Integer.valueOf(i3));
        if (i2 > 1) {
            d(list, i2 * 10);
        } else if (i2 <= 0) {
            LogUtil.j("Track_EnglishVoiceConstructor", "minuteDecadeValue <= 0");
        } else {
            d(list, (i2 * 10) + i3);
        }
        if (i2 != 1 && i3 > 0) {
            d(list, i3);
        }
        if (i > 1) {
            list.add(Integer.valueOf(SoundData.MINUTES.getIndex()));
        } else if (i <= 0) {
            LogUtil.j("Track_EnglishVoiceConstructor", "minute <= 0");
        } else {
            list.add(Integer.valueOf(SoundData.MINUTE.getIndex()));
        }
    }

    private void d(List<Integer> list, float f) {
        int i = (int) (f % 60.0f);
        int i2 = i / 10;
        int i3 = i % 10;
        LogUtil.a("Track_EnglishVoiceConstructor", "convertTimeToSpeakListEng ", " secondDecadeValue:", Integer.valueOf(i2), " secondUnitValue:", Integer.valueOf(i3));
        if (i2 > 1) {
            d(list, i2 * 10);
        } else if (i2 <= 0) {
            LogUtil.j("Track_EnglishVoiceConstructor", "secondDecadeValue <= 0");
        } else {
            d(list, (i2 * 10) + i3);
        }
        if (i2 != 1 && i3 > 0) {
            d(list, i3);
        }
        if (i > 1) {
            list.add(Integer.valueOf(SoundData.SECONDS.getIndex()));
        } else if (i <= 0) {
            LogUtil.j("Track_EnglishVoiceConstructor", "second <= 0");
        } else {
            list.add(Integer.valueOf(SoundData.SECOND.getIndex()));
        }
    }

    private void e(List<Integer> list, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int[] iArr = new int[5];
        int i8 = i;
        int i9 = 0;
        while (i8 >= 10) {
            iArr[i9] = i8 % 10;
            i8 /= 10;
            i9++;
        }
        if (i9 >= 5) {
            LogUtil.j("Track_EnglishVoiceConstructor", "numValue is out of ", Integer.valueOf(i));
            return;
        }
        iArr[i9] = i8;
        while (i9 >= 0) {
            if (i9 != 4 || (i7 = iArr[i9]) <= 0) {
                if (i9 != 3 || (i6 = iArr[i9]) <= 0) {
                    if (i9 == 2 && (i5 = iArr[i9]) > 0) {
                        d(list, i5);
                        d(list, 100);
                        if (iArr[1] == 0 && iArr[0] == 0) {
                            return;
                        } else {
                            list.add(Integer.valueOf(SoundData.BOY_AND.getIndex()));
                        }
                    } else if (i9 == 1 && (i4 = iArr[1]) == 1) {
                        d(list, (i4 * 10) + iArr[0]);
                    } else if (i9 == 1 && (i3 = iArr[i9]) > 1) {
                        d(list, i3 * 10);
                    } else if (iArr[1] != 1 && (i2 = iArr[i9]) > 0) {
                        d(list, i2);
                    }
                } else if (d(list, iArr, i6)) {
                    return;
                }
                i9--;
            } else if (d(list, iArr, (i7 * 10) + iArr[i9 - 1])) {
                return;
            } else {
                i9 = 2;
            }
        }
    }

    private boolean d(List<Integer> list, int[] iArr, int i) {
        d(list, i);
        d(list, 1000);
        if (iArr[2] == 0 && iArr[1] == 0 && iArr[0] == 0) {
            return true;
        }
        list.add(Integer.valueOf(SoundData.BOY_AND.getIndex()));
        return false;
    }

    private void d(List<Integer> list, int i) {
        list.add(this.f10490c.get(Integer.valueOf(i)));
    }
}
