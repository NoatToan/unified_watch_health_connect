package com.huawei.healthcloud.plugintrack.manager.voice.constructor;

import android.text.TextUtils;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.media3.extractor.metadata.dvbsi.AppInfoTableDecoder;
import com.huawei.health.userprofilemgr.api.UserProfileMgrApi;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.CreativeType;
import com.huawei.up.model.UserInfomation;
import defpackage.ive;
import defpackage.iwy;
import defpackage.jaa;
import defpackage.jbc;
import defpackage.jcp;
import defpackage.jef;
import defpackage.jeh;
import defpackage.jem;
import defpackage.jeo;
import defpackage.njy;
import health.compact.a.CommonUtil;
import health.compact.a.Services;
import java.math.BigDecimal;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class ChineseVoiceConstructor implements IVoiceContentConstructor, ISoundResourceConstructor {

    enum SoundData {
        GIRL_START_RIDE(R.raw.track_e081f, 1),
        GIRL_START_RUN(R.raw.track_e082f, 2),
        GIRL_START_WALK(R.raw.track_e083f, 3),
        GIRL_SPORT_RESTART(R.raw.track_e080f, 4),
        GIRL_YOU_HAVE_SPORT(R.raw.track_e102f, 5),
        DINGDONG(R.raw.girl_dingdong, 8),
        SPEND_TIME(R.raw.track_e036f, 9),
        COME_ON(R.raw.track_e071f, 10),
        SECOND(R.raw.track_c003f, 11),
        MINUTE(R.raw.track_c004f, 12),
        HOUR(R.raw.track_c009f, 13),
        KILOMETER(R.raw.track_c007f, 14),
        NEAR_BY_ONE_MILE(R.raw.track_e035f, 15),
        NUMBER_ONE(R.raw.track_b001f, 16),
        NUMBER_TWO(R.raw.track_b002f, 17),
        NUMBER_THREE(R.raw.track_b003f, 18),
        NUMBER_FOUR(R.raw.track_b004f, 19),
        NUMBER_FIVE(R.raw.track_b005f, 20),
        NUMBER_SIX(R.raw.track_b006f, 21),
        NUMBER_SEVEN(R.raw.track_b007f, 22),
        NUMBER_EIGHT(R.raw.track_b008f, 23),
        NUMBER_NINE(R.raw.track_b009f, 24),
        NUMBER_TEN(R.raw.track_b010f, 25),
        GREAT(R.raw.track_e077f, 26),
        GIRL_SPORT_PAUSE(R.raw.track_e079f, 27),
        GIRL_SPORT_OVER(R.raw.track_e078f, 28),
        COMPLETED_GOALS(R.raw.track_e072f, 29),
        HUNDRED(R.raw.track_b169f, 30),
        THOUSAND(R.raw.track_b170f, 31),
        EXERCISE_TO_RELAX(R.raw.track_e076f, 34),
        TEN_THOUSAND(R.raw.track_b171f, 35),
        AVERAGE_SPEED(R.raw.track_e032f, 37),
        ZERO(R.raw.track_b173f, 38),
        GIRL_POINT(R.raw.track_c010f, 39),
        GIRL_HEART_RATE(R.raw.track_e029f, 40),
        GIRL_HEART_RATE_UNIT(R.raw.track_c034f, 41),
        GIRL_NICE(R.raw.nice, 42),
        GIRL_FANTASTIC(R.raw.fantastic, 43),
        GIRL_FINISH_HALF_MARATHON(R.raw.finish_half_marathon, 44),
        GIRL_FINISH_MARATHON(R.raw.finish_marathon, 45),
        HEART_RATE_WARNING(R.raw.heart_rate_warning, 46),
        HEART_RATE_UNIT_CHINESE(R.raw.heart_rate_unit_chinese, 47),
        CURRENT_HEART_RATE(R.raw.current_heart_rate, 48),
        YOU_HAVE(R.raw.you_have, 49),
        STRETCH(R.raw.stretch, 50),
        HALF_GOAL_FINISH(R.raw.half_goal_finish, 51),
        COUNT_DOWN_DISTANCE(R.raw.count_down_distance, 52),
        COME_ON_COME_ON(R.raw.come_on_come_on, 53),
        VERY_NICE(R.raw.very_nice, 54),
        PERSEVERE_SUCCESS(R.raw.persevere_success, 55),
        PERSEVERE_YOU_CAN_DO_IT(R.raw.persevere_you_can_do_it, 56),
        GOAL_FINISH(R.raw.goal_finish, 57),
        MORE_PERSEVERE(R.raw.more_persevere, 58),
        VERY_GOOD(R.raw.very_good, 59),
        END_POINT(R.raw.end_point, 60),
        METER(R.raw.meter, 61),
        EMPTY(R.raw.empty, 62),
        INTELLIGENT_RUNNING(R.raw.intellrunning0, 63),
        INTELLIGENT_VOICE_7(R.raw.intell7, 64),
        INTELLIGENT_VOICE_4(R.raw.intell4, 65),
        INTELLIGENT_VOICE_5(R.raw.intell5, 66),
        INTELLIGENT_VOICE_6(R.raw.intell6, 67),
        INTELLIGENT_VOICE_1(R.raw.intell1, 68),
        INTELLIGENT_VOICE_0(R.raw.intell0, 69),
        INTELLIGENT_RUNNING_1(R.raw.intellrunning1, 70),
        INTELLIGENT_VOICE_2(R.raw.intell2, 71),
        INTELLIGENT_VOICE_3(R.raw.intell3, 72),
        COUNT_DOWN_ONE(R.raw.count_down_one, 73),
        COUNT_DOWN_TWO(R.raw.count_down_two, 74),
        COUNT_DOWN_THREE(R.raw.count_down_three, 75),
        FIVE_HUNDRED_END_POINT(R.raw.five_hundred_end_point, 76),
        CURRENT_PACE(R.raw.track_f002f, 77),
        CURRENT_SPEED(R.raw.track_f004f, 78),
        PER_HOUR(R.raw.track_f007f, 79),
        CURRENT_PACE_TESTING(R.raw.track_f003f, 80),
        HEART_RATE_DEVICE_NOT_BIND(R.raw.track_f012f, 81),
        MEASURING(R.raw.track_f013f, 82),
        LAST_PACE_TESTING(R.raw.track_f014f, 83),
        CONSUME(R.raw.consume, 84),
        KILO_CALORIE(R.raw.kilocalorie, 85),
        CURRENT_NOT_ENOUGH(R.raw.current_not_enough, 86),
        CANNOT_GET_DATA(R.raw.cannot_get_data, 87),
        CONNECT_SUCCESS(R.raw.connect_success, 88),
        START_RUN(R.raw.press_start, 89),
        START_RUN_1(R.raw.start_equip_according_guide, CreativeType.WINDOW_IMAGE_WITH_DOWNLOAD_BUTTON),
        POSTURE_ABNORMAL(R.raw.common_tips_when_abnormal, 90),
        IMPACT_ALWAYS_OK(R.raw.impact_always_ok, 91),
        IMPACT_DOWN_A_LITTLE(R.raw.impact_down_a_little, 92),
        IMPACT_DOWN_TO_OK(R.raw.impact_down_to_ok, 93),
        IMPACT_TOO_LARGE(R.raw.impact_too_large, 94),
        IMPACT_TOO_LARGE_B(R.raw.impact_too_large_b, 95),
        NEED_WARM_UP_1(R.raw.need_warmup_1, 96),
        NEED_WARM_UP_2(R.raw.need_warmup_2, 97),
        NEED_WARM_UP_3(R.raw.need_warmup_3, 98),
        STEP_RATE_OK(R.raw.steprate_ok, 99),
        STEP_RATE_TOO_FAST(R.raw.steprate_too_fast, 100),
        STEP_RATE_TOO_SLOW(R.raw.steprate_too_slow, 101),
        WARM_UP_NOT_ENOUGH(R.raw.warmup_not_enough, 102),
        COMMON_NORMAL_ENCOURAGE_A(R.raw.common_normal_encourage_a, 103),
        COMMON_NORMAL_ENCOURAGE_B(R.raw.common_normal_encourage_b, 104),
        RETRY_LATER(R.raw.retry_later, 105),
        DISTANCE_TOO_SHORT(R.raw.distance_too_short, 106),
        PRIVACY_SWITCH_OFF(R.raw.privacy_swith_off, 107),
        SENSOR_DISTANCE(R.raw.sensor_distance, 108),
        MANUAL_CALIBRATION(R.raw.manual_calibration, AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY),
        START_WORKOUT(R.raw.start_the_workout, 110),
        COUNT_DOWN_FOUR(R.raw.count_down_four, 111),
        COUNT_DOWN_FIVE(R.raw.count_down_five, 112),
        COUNT_DOWN_GO(R.raw.count_down_go, 114),
        START_HIKE(R.raw.start_the_hike, 115),
        START_CLIMB_HILL(R.raw.start_the_climb_hill, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID);

        private int mIndex;
        private int mNameId;

        SoundData(int i, int i2) {
            this.mNameId = i;
            this.mIndex = i2;
        }

        public int getIndex() {
            return this.mIndex;
        }

        public int getNameId() {
            return this.mNameId;
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.manager.voice.constructor.IVoiceContentConstructor
    public Object constructContent(int i, Object obj) {
        List<Object> listD;
        LogUtil.d("Track_ChineseVoiceConstructor", "constructContent() type : ", Integer.valueOf(i));
        if (i == 9) {
            listD = d(obj, 9);
        } else if (i == 11) {
            listD = d(obj, 11);
        } else {
            if (i == 35) {
                return obj;
            }
            switch (i) {
                case 0:
                    listD = new ArrayList<>(1);
                    listD.add(Integer.valueOf(SoundData.GIRL_START_RIDE.getIndex()));
                    break;
                case 1:
                    listD = new ArrayList<>(1);
                    listD.add(Integer.valueOf(SoundData.GIRL_START_RUN.getIndex()));
                    break;
                case 2:
                    listD = new ArrayList<>(1);
                    listD.add(Integer.valueOf(SoundData.GIRL_START_WALK.getIndex()));
                    break;
                case 3:
                    listD = new ArrayList<>(1);
                    listD.add(Integer.valueOf(SoundData.GIRL_SPORT_PAUSE.getIndex()));
                    break;
                case 4:
                    listD = new ArrayList<>(1);
                    listD.add(Integer.valueOf(SoundData.GIRL_SPORT_OVER.getIndex()));
                    break;
                case 5:
                    listD = new ArrayList<>(1);
                    listD.add(Integer.valueOf(SoundData.GIRL_SPORT_RESTART.getIndex()));
                    break;
                case 6:
                    listD = new ArrayList<>(1);
                    listD.add(Integer.valueOf(SoundData.COMPLETED_GOALS.getIndex()));
                    break;
                default:
                    listD = a(i, obj);
                    break;
            }
        }
        if (listD.size() == 0) {
            listD.add(Integer.valueOf(SoundData.EMPTY.getIndex()));
        }
        return listD;
    }

    private List<Object> a(int i, Object obj) {
        switch (i) {
            case 12:
                ArrayList arrayList = new ArrayList(2);
                arrayList.add(Integer.valueOf(SoundData.GIRL_FANTASTIC.getIndex()));
                arrayList.add(Integer.valueOf(SoundData.GIRL_FINISH_MARATHON.getIndex()));
                if (obj != null) {
                    a(arrayList, obj);
                }
                return arrayList;
            case 13:
                ArrayList arrayList2 = new ArrayList(2);
                arrayList2.add(Integer.valueOf(SoundData.GIRL_NICE.getIndex()));
                arrayList2.add(Integer.valueOf(SoundData.GIRL_FINISH_HALF_MARATHON.getIndex()));
                if (obj != null) {
                    a(arrayList2, obj);
                }
                return arrayList2;
            case 14:
                ArrayList arrayList3 = new ArrayList(1);
                arrayList3.add(Integer.valueOf(SoundData.HEART_RATE_WARNING.getIndex()));
                return arrayList3;
            case 15:
                ArrayList arrayList4 = new ArrayList(2);
                arrayList4.add(Integer.valueOf(SoundData.GIRL_SPORT_OVER.getIndex()));
                arrayList4.add(Integer.valueOf(SoundData.EXERCISE_TO_RELAX.getIndex()));
                return arrayList4;
            case 16:
                ArrayList arrayList5 = new ArrayList(2);
                arrayList5.add(Integer.valueOf(SoundData.GIRL_SPORT_OVER.getIndex()));
                arrayList5.add(Integer.valueOf(SoundData.STRETCH.getIndex()));
                return arrayList5;
            case 17:
                ArrayList arrayList6 = new ArrayList(1);
                if (obj != null) {
                    c(arrayList6, obj);
                }
                return arrayList6;
            case 18:
            default:
                return e(i, obj);
            case 19:
                ArrayList arrayList7 = new ArrayList(1);
                arrayList7.add(Integer.valueOf(SoundData.GIRL_NICE.getIndex()));
                arrayList7.add(Integer.valueOf(SoundData.HALF_GOAL_FINISH.getIndex()));
                return arrayList7;
        }
    }

    private List<Object> e(int i, Object obj) {
        switch (i) {
            case 18:
                ArrayList arrayList = new ArrayList(1);
                if (obj != null) {
                    a((List<Object>) arrayList);
                }
                return arrayList;
            case 19:
            default:
                return d(i, obj);
            case 20:
                return c(obj);
            case 21:
                ArrayList arrayList2 = new ArrayList(1);
                d((List<Object>) arrayList2);
                return arrayList2;
            case 22:
                ArrayList arrayList3 = new ArrayList(1);
                h(arrayList3);
                return arrayList3;
            case 23:
                return b(obj);
            case 24:
                ArrayList arrayList4 = new ArrayList(1);
                arrayList4.add(Integer.valueOf(SoundData.GIRL_SPORT_OVER.getIndex()));
                arrayList4.add(Integer.valueOf(SoundData.DISTANCE_TOO_SHORT.getIndex()));
                return arrayList4;
            case 25:
                ArrayList arrayList5 = new ArrayList(1);
                arrayList5.add(Integer.valueOf(SoundData.PRIVACY_SWITCH_OFF.getIndex()));
                return arrayList5;
            case 26:
                return c(obj, 26);
            case 27:
                return c(obj, 27);
            case 28:
                return b(obj, 28);
        }
    }

    private List<Object> d(int i, Object obj) {
        switch (i) {
            case 29:
                return b(obj, 29);
            case 30:
                return e(obj);
            case 31:
                return d(obj);
            case 32:
                return a(obj);
            default:
                switch (i) {
                    case 110:
                        ArrayList arrayList = new ArrayList(1);
                        arrayList.add(Integer.valueOf(SoundData.START_WORKOUT.getIndex()));
                        return arrayList;
                    case 111:
                        ArrayList arrayList2 = new ArrayList(1);
                        arrayList2.add(Integer.valueOf(SoundData.START_HIKE.getIndex()));
                        return arrayList2;
                    case 112:
                        ArrayList arrayList3 = new ArrayList(1);
                        arrayList3.add(Integer.valueOf(SoundData.START_CLIMB_HILL.getIndex()));
                        return arrayList3;
                    default:
                        ArrayList arrayList4 = new ArrayList(1);
                        arrayList4.add(Integer.valueOf(SoundData.EMPTY.getIndex()));
                        return arrayList4;
                }
        }
    }

    private static String e(int i) {
        StringBuilder sb = new StringBuilder("N");
        if (i / 100 > 0) {
            sb.append(i);
        } else if (i / 10 > 0) {
            sb.append(0);
            sb.append(i);
        } else {
            sb.append("00");
            sb.append(i);
        }
        return sb.toString();
    }

    private void d(List<Object> list, int i, boolean z) {
        String str;
        if (z) {
            str = "C007";
        } else {
            str = "C006";
        }
        int i2 = i / 3600;
        if (i2 > 0) {
            list.add(jeo.d().d(e(i2)));
            list.add(jeo.d().d("C011"));
        }
        int i3 = (i % 3600) / 60;
        if (i3 > 0) {
            list.add(jeo.d().d(e(i3)));
            list.add(jeo.d().d(str));
        }
        int i4 = i % 60;
        if (i4 > 0) {
            list.add(jeo.d().d(e(i4)));
            list.add(jeo.d().d("C008"));
        }
    }

    private void e(List<Object> list, float f, String str) {
        int i;
        float fRound = (Math.round(f * 100.0f) * 1.0f) / 100.0f;
        int iFloor = (int) Math.floor(fRound);
        String string = Float.toString(fRound);
        int iIndexOf = string.indexOf(46);
        if (iIndexOf >= 0) {
            string = string.substring(iIndexOf + 1);
            try {
                i = Integer.parseInt(string);
            } catch (NumberFormatException e) {
                LogUtil.e("Track_ChineseVoiceConstructor", "configDistanceKilometerVoice ", e.getMessage());
                i = 0;
            }
        } else {
            i = 0;
        }
        if (iIndexOf >= 0 && i > 0) {
            if (f > 0.0f && f < 1.0f) {
                list.add(jeo.d().d(e(0)));
            } else {
                a(list, iFloor);
            }
            list.add(jeo.d().d("C010"));
            if (string.length() != 0) {
                int length = string.length();
                for (int i2 = 0; i2 < length; i2++) {
                    try {
                        list.add(jeo.d().d(e(Integer.parseInt(String.valueOf(string.charAt(i2))))));
                    } catch (NumberFormatException e2) {
                        LogUtil.e("Track_ChineseVoiceConstructor", "configDistanceKilometerVoice ", e2.getMessage());
                    }
                }
            }
        } else if (iFloor == 0) {
            list.add(jeo.d().d(e(0)));
        } else {
            a(list, iFloor);
        }
        list.add(jeo.d().d(str));
    }

    private void a(List<Object> list, int i) {
        if (i >= 100000) {
            return;
        }
        int[] iArr = new int[5];
        int i2 = 0;
        while (i >= 10) {
            iArr[i2] = i % 10;
            i /= 10;
            i2++;
        }
        iArr[i2] = i;
        String[] strArr = {"C013", "C014", "C015", "C016"};
        if (i2 == 1 && iArr[1] == 1) {
            list.add(jeo.d().d(strArr[i2 - 1]));
            i2--;
        }
        while (i2 > 0) {
            if (iArr[i2] > 0) {
                list.add(jeo.d().d(e(iArr[i2])));
                list.add(jeo.d().d(strArr[i2 - 1]));
                i2--;
            } else if (i2 == 1 && iArr[1] == 0 && iArr[0] != 0) {
                list.add(jeo.d().d(e(0)));
                i2--;
            } else {
                LogUtil.e("Track_ChineseVoiceConstructor", "wrong branch");
                i2--;
            }
        }
        if (iArr[i2] > 0) {
            list.add(jeo.d().d(e(iArr[i2])));
        }
    }

    private List<Object> c(Object obj, int i) {
        ArrayList arrayList = new ArrayList(16);
        if (!(obj instanceof jbc)) {
            LogUtil.a("Track_ChineseVoiceConstructor", "constructSmartCoachBeforeSportVoice parameter is invalid.");
            return arrayList;
        }
        jbc jbcVar = (jbc) obj;
        String[] strArrD = jbcVar.d();
        if (strArrD != null && strArrD.length > 0) {
            for (String str : strArrD) {
                arrayList.add(jeo.d().d(str));
            }
        }
        b(i, arrayList, jbcVar);
        arrayList.add(jeo.d().d("empty_500"));
        arrayList.add(jeo.d().d("E208"));
        arrayList.add(jeo.d().d(e(jbcVar.n())));
        arrayList.add(jeo.d().d("C006"));
        b((List<Object>) arrayList);
        return arrayList;
    }

    private void b(int i, List<Object> list, jbc jbcVar) {
        if (i == 26) {
            list.add(jeo.d().d(e((int) jbcVar.h())));
        } else if (i == 27) {
            if (jem.a() == 264) {
                e(list, jbcVar.h(), "C009");
            } else {
                d(list, (int) (jbcVar.h() * 60.0f), true);
            }
        } else {
            LogUtil.j("Track_ChineseVoiceConstructor", "constructSmartCoachBeforeSportVoice wrong branch.");
        }
        list.add(jeo.d().d("E246"));
        if (i == 26) {
            list.add(jeo.d().d(e((int) jbcVar.m())));
        } else {
            if (i == 27) {
                if (jem.a() == 264) {
                    e(list, jbcVar.m(), "C009");
                    return;
                } else {
                    d(list, (int) (jbcVar.m() * 60.0f), true);
                    return;
                }
            }
            LogUtil.j("Track_ChineseVoiceConstructor", "constructSmartCoachBeforeSportVoice wrong branch.");
        }
    }

    private List<Object> b(Object obj, int i) {
        ArrayList arrayList = new ArrayList(16);
        if (!(obj instanceof jbc)) {
            LogUtil.a("Track_ChineseVoiceConstructor", "constructSmartCoachHeartRateVoice parameter is invalid.");
            return arrayList;
        }
        jbc jbcVar = (jbc) obj;
        int iN = jbcVar.n();
        if (jem.d()) {
            if (iN > 0) {
                arrayList.add(jeo.d().d("K101"));
                arrayList.add(jeo.d().d(e(iN)));
            }
        } else if (iN > 0) {
            arrayList.add(jeo.d().d("L232"));
            d(arrayList, iN, true);
        }
        return c(i, arrayList, jbcVar);
    }

    private List<Object> c(int i, List<Object> list, jbc jbcVar) {
        if (i == 29) {
            list.add(jeo.d().d("L174"));
            list.add(jeo.d().d("L175"));
            return list;
        }
        String[] strArrD = jbcVar.d();
        if (strArrD != null && strArrD.length > 0) {
            for (String str : strArrD) {
                list.add(jeo.d().d(str));
            }
        }
        if (jem.d()) {
            int iH = (int) jbcVar.h();
            int iM = (int) jbcVar.m();
            if (iH <= 0 || iM <= 0 || iH >= iM) {
                return new ArrayList(16);
            }
            list.add(jeo.d().d(e(iH)));
            list.add(jeo.d().d("E246"));
            list.add(jeo.d().d(e(iM)));
            return list;
        }
        int iH2 = (int) (jbcVar.h() * 60.0f);
        int iM2 = (int) (jbcVar.m() * 60.0f);
        if (iH2 <= 0 || iM2 <= 0) {
            return new ArrayList(16);
        }
        d(list, iH2, true);
        list.add(jeo.d().d("E246"));
        d(list, iM2, true);
        return list;
    }

    private List<Object> d(Object obj) {
        ArrayList arrayList = new ArrayList(16);
        if (!(obj instanceof jbc)) {
            LogUtil.a("Track_ChineseVoiceConstructor", "constructSmartCoachSpeedVoice parameter is invalid.");
            return arrayList;
        }
        jbc jbcVar = (jbc) obj;
        String[] strArrD = jbcVar.d();
        if (strArrD != null && strArrD.length > 0) {
            for (String str : strArrD) {
                arrayList.add(jeo.d().d(str));
            }
        }
        arrayList.add(jeo.d().d("L148"));
        int iH = (int) jbcVar.h();
        arrayList.add(jeo.d().d(e(iH)));
        arrayList.add(jeo.d().d("C009"));
        arrayList.add(jeo.d().d("E246"));
        int iM = (int) jbcVar.m();
        arrayList.add(jeo.d().d(e(iM)));
        arrayList.add(jeo.d().d("C009"));
        return (iH <= 0 || iM <= 0 || iH >= iM) ? new ArrayList(16) : arrayList;
    }

    private List<Object> e(Object obj) {
        int iE;
        ArrayList arrayList = new ArrayList(16);
        if (!(obj instanceof jbc)) {
            LogUtil.a("Track_ChineseVoiceConstructor", "constructSmartCoachGoalCompletedVoice parameter is invalid.");
            return arrayList;
        }
        jbc jbcVar = (jbc) obj;
        String[] strArrD = jbcVar.d();
        if (strArrD != null && strArrD.length > 0) {
            arrayList.add(jeo.d().d(strArrD[0]));
        }
        arrayList.add(jeo.d().d("L163"));
        e(arrayList, jbcVar.b(), "C012");
        arrayList.add(jeo.d().d("L231"));
        d(arrayList, ((int) jbcVar.r()) / 1000, false);
        arrayList.add(jeo.d().d("L230"));
        e(arrayList, jbcVar.y(), "L229");
        if (jem.d() && (iE = jbcVar.e()) > 0) {
            arrayList.add(jeo.d().d("K101"));
            arrayList.add(jeo.d().d(e(iE)));
        }
        if (strArrD != null && strArrD.length > 1) {
            arrayList.add(jeo.d().d(strArrD[1]));
        }
        return arrayList;
    }

    private List<Object> a(Object obj) {
        ArrayList arrayList = new ArrayList(16);
        if (!(obj instanceof jbc)) {
            LogUtil.a("Track_ChineseVoiceConstructor", "constructSmartCoachAfterSportVoice parameter is invalid.");
            return arrayList;
        }
        jbc jbcVar = (jbc) obj;
        arrayList.add(jeo.d().d("L151"));
        d(arrayList, ((int) jbcVar.h()) / 1000, false);
        arrayList.add(jeo.d().d("L150"));
        e(arrayList, jbcVar.m(), "C012");
        String[] strArrD = jbcVar.d();
        if (strArrD != null && strArrD.length > 0) {
            for (String str : strArrD) {
                arrayList.add(jeo.d().d(str));
            }
        }
        o(arrayList, jbcVar);
        arrayList.add(jeo.d().d("L161"));
        return arrayList;
    }

    private void o(List<Object> list, jbc jbcVar) {
        int iN = jbcVar.n();
        if (iN > 0) {
            list.add(jeo.d().d("L157"));
            list.add(jeo.d().d(e(iN)));
            list.add(jeo.d().d("C011"));
            if (iN >= 36 && iN <= 53) {
                list.add(jeo.d().d("L158"));
                return;
            }
            if (iN >= 54 && iN <= 96) {
                list.add(jeo.d().d("L159"));
                list.add(jeo.d().d(e(iN)));
                list.add(jeo.d().d("C011"));
                list.add(jeo.d().d("E210"));
                list.add(jeo.d().d("L160"));
                return;
            }
            LogUtil.j("Track_ChineseVoiceConstructor", "constructSmartCoachAfterSportVoice wrong branch.");
        }
    }

    private List<Object> d(Object obj, int i) {
        if (!(obj instanceof jbc)) {
            LogUtil.a("Track_ChineseVoiceConstructor", "constructDistanceTimeContent parameter is invalid.");
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(Integer.valueOf(SoundData.EMPTY.getIndex()));
            return arrayList;
        }
        jbc jbcVar = (jbc) obj;
        ArrayList arrayList2 = new ArrayList(1);
        a((List<Object>) arrayList2, jbcVar);
        a((List<Object>) arrayList2, jbcVar, i);
        j(arrayList2, jbcVar);
        c((List<Object>) arrayList2, jbcVar);
        f(arrayList2, jbcVar);
        b((List<Object>) arrayList2, jbcVar);
        k(arrayList2, jbcVar);
        g(arrayList2, jbcVar);
        i(arrayList2, jbcVar);
        h(arrayList2, jbcVar);
        m(arrayList2, jbcVar);
        n(arrayList2, jbcVar);
        d(arrayList2, jbcVar);
        arrayList2.add(Integer.valueOf(SoundData.EMPTY.getIndex()));
        LogUtil.a("Track_ChineseVoiceConstructor", arrayList2);
        return arrayList2;
    }

    private void d(List<Object> list, jbc jbcVar) {
        if (jbcVar.ah()) {
            int iU = jbcVar.u();
            if (iU == 25) {
                list.add(Integer.valueOf(SoundData.COMMON_NORMAL_ENCOURAGE_A.getIndex()));
            } else {
                if (iU != 26) {
                    return;
                }
                list.add(Integer.valueOf(SoundData.COMMON_NORMAL_ENCOURAGE_B.getIndex()));
            }
        }
    }

    private void b(List<Object> list, jbc jbcVar) {
        if (jbcVar.ag()) {
            list.add(Integer.valueOf(SoundData.CONNECT_SUCCESS.getIndex()));
        }
    }

    private void k(List<Object> list, jbc jbcVar) {
        if (jbcVar.ak()) {
            list.add(Integer.valueOf(SoundData.START_RUN.getIndex()));
        }
    }

    private void g(List<Object> list, jbc jbcVar) {
        if (jbcVar.am()) {
            list.add(Integer.valueOf(SoundData.START_RUN_1.getIndex()));
        }
    }

    private void i(List<Object> list, jbc jbcVar) {
        if (jbcVar.af()) {
            list.add(Integer.valueOf(SoundData.POSTURE_ABNORMAL.getIndex()));
        }
    }

    private void h(List<Object> list, jbc jbcVar) {
        if (jbcVar.ai()) {
            switch (jbcVar.w()) {
                case 12:
                    list.add(Integer.valueOf(SoundData.IMPACT_ALWAYS_OK.getIndex()));
                    break;
                case 13:
                    list.add(Integer.valueOf(SoundData.IMPACT_TOO_LARGE.getIndex()));
                    break;
                case 14:
                    list.add(Integer.valueOf(SoundData.IMPACT_TOO_LARGE_B.getIndex()));
                    break;
                case 15:
                    list.add(Integer.valueOf(SoundData.IMPACT_DOWN_A_LITTLE.getIndex()));
                    break;
                case 16:
                    list.add(Integer.valueOf(SoundData.IMPACT_DOWN_TO_OK.getIndex()));
                    break;
            }
        }
    }

    private void m(List<Object> list, jbc jbcVar) {
        if (jbcVar.aj()) {
            switch (jbcVar.ac()) {
                case 18:
                    list.add(Integer.valueOf(SoundData.STEP_RATE_OK.getIndex()));
                    break;
                case 19:
                    list.add(Integer.valueOf(SoundData.STEP_RATE_TOO_SLOW.getIndex()));
                    break;
                case 20:
                    list.add(Integer.valueOf(SoundData.STEP_RATE_TOO_FAST.getIndex()));
                    break;
            }
        }
    }

    private void n(List<Object> list, jbc jbcVar) {
        if (jbcVar.an()) {
            int iZ = jbcVar.z();
            if (iZ == 22) {
                e(list, jbcVar);
            } else {
                if (iZ != 23) {
                    return;
                }
                list.add(Integer.valueOf(SoundData.WARM_UP_NOT_ENOUGH.getIndex()));
            }
        }
    }

    private void e(List<Object> list, jbc jbcVar) {
        list.add(Integer.valueOf(SoundData.NEED_WARM_UP_1.getIndex()));
        e(list, jbcVar.ae());
        list.add(Integer.valueOf(SoundData.NEED_WARM_UP_2.getIndex()));
        e(list, jbcVar.ad());
        list.add(Integer.valueOf(SoundData.NEED_WARM_UP_3.getIndex()));
    }

    private List<Object> c(Object obj) {
        if (!(obj instanceof jbc)) {
            LogUtil.a("Track_ChineseVoiceConstructor", "constructCountDownVoiceContent parameter is invalid");
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(Integer.valueOf(SoundData.EMPTY.getIndex()));
            return arrayList;
        }
        int iA = ((jbc) obj).a();
        ArrayList arrayList2 = new ArrayList(1);
        if (iA == 0) {
            arrayList2.add(Integer.valueOf(SoundData.COUNT_DOWN_GO.getIndex()));
            return arrayList2;
        }
        if (iA == 1) {
            arrayList2.add(Integer.valueOf(SoundData.COUNT_DOWN_ONE.getIndex()));
            return arrayList2;
        }
        if (iA == 2) {
            arrayList2.add(Integer.valueOf(SoundData.COUNT_DOWN_TWO.getIndex()));
            return arrayList2;
        }
        if (iA == 3) {
            arrayList2.add(Integer.valueOf(SoundData.COUNT_DOWN_THREE.getIndex()));
            return arrayList2;
        }
        if (iA == 4) {
            arrayList2.add(Integer.valueOf(SoundData.COUNT_DOWN_FOUR.getIndex()));
            return arrayList2;
        }
        if (iA != 5) {
            return arrayList2;
        }
        arrayList2.add(Integer.valueOf(SoundData.COUNT_DOWN_FIVE.getIndex()));
        return arrayList2;
    }

    private List<Object> b(Object obj) {
        if (!(obj instanceof jbc)) {
            LogUtil.a("Track_ChineseVoiceConstructor", "constructIndoorCalibrationVoiceContent parameter is invalid");
            ArrayList arrayList = new ArrayList(16);
            arrayList.add(Integer.valueOf(SoundData.EMPTY.getIndex()));
            return arrayList;
        }
        float fB = ((jbc) obj).b();
        ArrayList arrayList2 = new ArrayList(16);
        arrayList2.add(Integer.valueOf(SoundData.SENSOR_DISTANCE.getIndex()));
        b(arrayList2, fB);
        arrayList2.add(Integer.valueOf(SoundData.MANUAL_CALIBRATION.getIndex()));
        return arrayList2;
    }

    private List<Object> a(List<Object> list, Object obj) {
        if (!(obj instanceof jbc)) {
            LogUtil.a("Track_ChineseVoiceConstructor", "constructDurationVoiceContent parameter is invalid");
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(Integer.valueOf(SoundData.EMPTY.getIndex()));
            return arrayList;
        }
        long jR = ((jbc) obj).r();
        if (jR <= 0) {
            LogUtil.a("Track_ChineseVoiceConstructor", "constructDurationVoiceContent duration is less than 0");
            return list;
        }
        list.add(Integer.valueOf(SoundData.SPEND_TIME.getIndex()));
        d(list, jR);
        return list;
    }

    private List<Object> c(List<Object> list, Object obj) {
        if (!(obj instanceof jbc)) {
            LogUtil.a("Track_ChineseVoiceConstructor", "constructCountDownDistanceVoiceContent parameter is invalid");
            return list;
        }
        list.add(Integer.valueOf(SoundData.COUNT_DOWN_DISTANCE.getIndex()));
        jbc jbcVar = (jbc) obj;
        float f = jbcVar.f();
        if (f <= 0.0f) {
            LogUtil.a("Track_ChineseVoiceConstructor", "constructCountDownDistanceVoiceContent duration is less than 0");
            return list;
        }
        e(list, (int) f);
        list.add(Integer.valueOf(SoundData.KILOMETER.getIndex()));
        b(list, jbcVar.a());
        return list;
    }

    private List<Object> a(List<Object> list) {
        list.add(Integer.valueOf(SoundData.FIVE_HUNDRED_END_POINT.getIndex()));
        list.add(Integer.valueOf(SoundData.END_POINT.getIndex()));
        return list;
    }

    private void b(List<Object> list, int i) {
        if (i == 1) {
            list.add(Integer.valueOf(SoundData.VERY_GOOD.getIndex()));
            return;
        }
        if (i == 2) {
            list.add(Integer.valueOf(SoundData.PERSEVERE_SUCCESS.getIndex()));
            return;
        }
        if (i == 3) {
            list.add(Integer.valueOf(SoundData.VERY_NICE.getIndex()));
            return;
        }
        if (i == 60) {
            list.add(Integer.valueOf(SoundData.COME_ON_COME_ON.getIndex()));
            return;
        }
        if (i == 70) {
            list.add(Integer.valueOf(SoundData.PERSEVERE_YOU_CAN_DO_IT.getIndex()));
        } else if (i == 80) {
            list.add(Integer.valueOf(SoundData.GREAT.getIndex()));
        } else {
            if (i != 90) {
                return;
            }
            list.add(Integer.valueOf(SoundData.MORE_PERSEVERE.getIndex()));
        }
    }

    private int a(int i) {
        return SoundData.GIRL_YOU_HAVE_SPORT.getIndex();
    }

    private void d(List<Object> list, long j) {
        LogUtil.d("Track_ChineseVoiceConstructor", "addTimeResource time:", String.valueOf(j));
        long j2 = j / 1000;
        if (a(list, j2)) {
            list.add(Integer.valueOf(SoundData.HOUR.getIndex()));
        }
        if (e(list, j2)) {
            list.add(Integer.valueOf(SoundData.MINUTE.getIndex()));
        }
        if (b(list, j2)) {
            list.add(Integer.valueOf(SoundData.SECOND.getIndex()));
        }
    }

    private void c(List<Object> list, int i) {
        if (i > 50) {
            list.add(Integer.valueOf(SoundData.PERSEVERE_SUCCESS.getIndex()));
        } else {
            list.add(Integer.valueOf(SoundData.COME_ON.getIndex()));
        }
    }

    private boolean a(List<Object> list, long j) {
        boolean z;
        int i = (int) (j / 3600);
        int i2 = (i / 1000) % 10;
        int i3 = (i / 100) % 10;
        int i4 = i / 10;
        if (i2 > 0) {
            g(list, i2);
            list.add(Integer.valueOf(SoundData.THOUSAND.getIndex()));
            z = true;
        } else {
            z = false;
        }
        if (i3 > 0) {
            g(list, i3);
            list.add(Integer.valueOf(SoundData.HUNDRED.getIndex()));
            z = true;
        }
        if (i4 > 0) {
            if (!z && i4 > 1) {
                g(list, i4);
            }
            list.add(Integer.valueOf(SoundData.NUMBER_TEN.getIndex()));
            z = true;
        }
        int i5 = i % 10;
        if (i5 <= 0) {
            return z;
        }
        g(list, i5);
        return true;
    }

    private boolean e(List<Object> list, long j) {
        boolean z;
        int i = (int) ((j / 60) % 60);
        int i2 = i / 10;
        int i3 = i % 10;
        if (i2 > 0) {
            if (i2 > 1) {
                g(list, i2);
            }
            list.add(Integer.valueOf(SoundData.NUMBER_TEN.getIndex()));
            z = true;
        } else {
            z = false;
        }
        if (i3 <= 0) {
            return z;
        }
        g(list, i3);
        return true;
    }

    private boolean b(List<Object> list, long j) {
        boolean z;
        int i = (int) (j % 60);
        int i2 = i / 10;
        int i3 = i % 10;
        if (i2 > 0) {
            if (i2 > 1) {
                g(list, i2);
            }
            list.add(Integer.valueOf(SoundData.NUMBER_TEN.getIndex()));
            z = true;
        } else {
            z = false;
        }
        if (i3 <= 0) {
            return z;
        }
        g(list, i3);
        return true;
    }

    private void e(List<Object> list, int i) {
        if (i >= 100000) {
            return;
        }
        int[] iArr = new int[5];
        int i2 = 0;
        while (i >= 10) {
            iArr[i2] = i % 10;
            i /= 10;
            i2++;
        }
        iArr[i2] = i;
        int[] iArr2 = {SoundData.NUMBER_TEN.getIndex(), SoundData.HUNDRED.getIndex(), SoundData.THOUSAND.getIndex(), SoundData.TEN_THOUSAND.getIndex()};
        if (i2 == 1 && iArr[1] == 1) {
            list.add(Integer.valueOf(iArr2[i2 - 1]));
            i2--;
        }
        while (i2 > 0) {
            int i3 = iArr[i2];
            if (i3 > 0) {
                g(list, i3);
                list.add(Integer.valueOf(iArr2[i2 - 1]));
                i2--;
            } else if (i2 == 1 && iArr[1] == 0 && iArr[0] != 0) {
                g(list, 0);
                i2--;
            } else {
                LogUtil.e("Track_ChineseVoiceConstructor", "wrong branch");
                i2--;
            }
        }
        int i4 = iArr[i2];
        if (i4 > 0) {
            g(list, i4);
        }
    }

    private void g(List<Object> list, int i) {
        switch (i) {
            case 0:
                list.add(Integer.valueOf(SoundData.ZERO.getIndex()));
                break;
            case 1:
                list.add(Integer.valueOf(SoundData.NUMBER_ONE.getIndex()));
                break;
            case 2:
                list.add(Integer.valueOf(SoundData.NUMBER_TWO.getIndex()));
                break;
            case 3:
                list.add(Integer.valueOf(SoundData.NUMBER_THREE.getIndex()));
                break;
            case 4:
                list.add(Integer.valueOf(SoundData.NUMBER_FOUR.getIndex()));
                break;
            case 5:
                list.add(Integer.valueOf(SoundData.NUMBER_FIVE.getIndex()));
                break;
            case 6:
                list.add(Integer.valueOf(SoundData.NUMBER_SIX.getIndex()));
                break;
            case 7:
                list.add(Integer.valueOf(SoundData.NUMBER_SEVEN.getIndex()));
                break;
            case 8:
                list.add(Integer.valueOf(SoundData.NUMBER_EIGHT.getIndex()));
                break;
            case 9:
                list.add(Integer.valueOf(SoundData.NUMBER_NINE.getIndex()));
                break;
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.manager.voice.constructor.ISoundResourceConstructor
    public Map<Integer, Integer> getSoundResource() {
        HashMap map = new HashMap(10);
        for (SoundData soundData : SoundData.values()) {
            map.put(Integer.valueOf(soundData.getIndex()), Integer.valueOf(soundData.getNameId()));
        }
        LogUtil.d("Track_ChineseVoiceConstructor", "getSoundResource() map size", Integer.valueOf(map.size()));
        return map;
    }

    private int d(int i) {
        return new SecureRandom().nextInt(i);
    }

    private void h(List<Object> list) {
        if (c()) {
            list.add(Integer.valueOf(SoundData.INTELLIGENT_VOICE_7.getIndex()));
            return;
        }
        switch (d(7)) {
            case 0:
                list.add(Integer.valueOf(SoundData.INTELLIGENT_VOICE_0.getIndex()));
                break;
            case 1:
                list.add(Integer.valueOf(SoundData.INTELLIGENT_VOICE_1.getIndex()));
                break;
            case 2:
                list.add(Integer.valueOf(SoundData.INTELLIGENT_VOICE_2.getIndex()));
                break;
            case 3:
                list.add(Integer.valueOf(SoundData.INTELLIGENT_VOICE_3.getIndex()));
                break;
            case 4:
                list.add(Integer.valueOf(SoundData.INTELLIGENT_VOICE_4.getIndex()));
                break;
            case 5:
                list.add(Integer.valueOf(SoundData.INTELLIGENT_VOICE_5.getIndex()));
                break;
            case 6:
                list.add(Integer.valueOf(SoundData.INTELLIGENT_VOICE_6.getIndex()));
                break;
            default:
                list.add(Integer.valueOf(SoundData.INTELLIGENT_VOICE_0.getIndex()));
                break;
        }
        jem.d(jeo.d().b(list, getSoundResource()));
    }

    private void d(List<Object> list) {
        if (c()) {
            list.add(Integer.valueOf(SoundData.INTELLIGENT_VOICE_7.getIndex()));
            return;
        }
        switch (d(10)) {
            case 0:
                list.add(Integer.valueOf(SoundData.INTELLIGENT_VOICE_0.getIndex()));
                break;
            case 1:
                list.add(Integer.valueOf(SoundData.INTELLIGENT_VOICE_1.getIndex()));
                break;
            case 2:
                list.add(Integer.valueOf(SoundData.INTELLIGENT_VOICE_2.getIndex()));
                break;
            case 3:
                list.add(Integer.valueOf(SoundData.INTELLIGENT_VOICE_3.getIndex()));
                break;
            case 4:
                list.add(Integer.valueOf(SoundData.INTELLIGENT_VOICE_4.getIndex()));
                break;
            case 5:
                list.add(Integer.valueOf(SoundData.INTELLIGENT_VOICE_5.getIndex()));
                break;
            case 6:
                list.add(Integer.valueOf(SoundData.INTELLIGENT_VOICE_6.getIndex()));
                break;
            case 7:
                list.add(Integer.valueOf(SoundData.INTELLIGENT_RUNNING.getIndex()));
                break;
            default:
                if (a()) {
                    list.add(Integer.valueOf(SoundData.INTELLIGENT_RUNNING_1.getIndex()));
                } else {
                    list.add(Integer.valueOf(SoundData.INTELLIGENT_VOICE_0.getIndex()));
                }
                break;
        }
        jem.d(jeo.d().b(list, getSoundResource()));
    }

    private boolean c() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        return jCurrentTimeMillis > 1538236800000L && jCurrentTimeMillis < 1538928000000L;
    }

    private boolean a() {
        UserInfomation userInfo = ((UserProfileMgrApi) Services.b("HWUserProfileMgr", UserProfileMgrApi.class)).getUserInfo();
        if (userInfo == null) {
            return false;
        }
        int ageOrDefaultValue = userInfo.getAgeOrDefaultValue();
        return ageOrDefaultValue > 0 && ageOrDefaultValue <= 25 && userInfo.getGenderOrDefaultValue() == 0;
    }

    private void a(List<Object> list, jbc jbcVar) {
        if (jbcVar.s() || jbcVar.p() || ((jbcVar.v() && jbcVar.g() > 0) || ((jbcVar.t() && jbcVar.e() > 0) || jbcVar.x()))) {
            list.add(Integer.valueOf(SoundData.DINGDONG.getIndex()));
        }
    }

    private void a(List<Object> list, jbc jbcVar, int i) {
        boolean zS = jbcVar.s();
        boolean zP = jbcVar.p();
        int iK = jbcVar.k();
        float fB = jbcVar.b();
        long jR = jbcVar.r();
        int iY = jbcVar.y();
        if (zS || zP) {
            list.add(Integer.valueOf(a(iK)));
        }
        if (zS) {
            if (i == 9) {
                h(list, (int) fB);
            } else {
                b(list, fB);
            }
        }
        if (zS && zP) {
            list.add(Integer.valueOf(SoundData.SPEND_TIME.getIndex()));
        }
        if (zP) {
            d(list, jR);
        }
        boolean zQ = jbcVar.q();
        if ((zS && zQ) || (zP && zQ)) {
            d(list, iY);
        }
        if (jbcVar.o() && zP && jbcVar.f() > 0.0f) {
            list.add(Integer.valueOf(SoundData.COUNT_DOWN_DISTANCE.getIndex()));
            d(list, (long) jbcVar.f());
            c(list, jbcVar.l());
        } else {
            if (jbcVar.o() && zS && jbcVar.f() > 0.0f) {
                float f = jbcVar.f() / 1000.0f;
                list.add(Integer.valueOf(SoundData.COUNT_DOWN_DISTANCE.getIndex()));
                b(list, f);
                c(list, jbcVar.l());
                return;
            }
            LogUtil.d("Track_ChineseVoiceConstructor", "wrong branch");
        }
    }

    private void d(List<Object> list, int i) {
        if (i > 0) {
            list.add(Integer.valueOf(SoundData.CONSUME.getIndex()));
            e(list, i);
            list.add(Integer.valueOf(SoundData.KILO_CALORIE.getIndex()));
        }
    }

    private void h(List<Object> list, int i) {
        if (i > 0) {
            e(list, i);
            list.add(Integer.valueOf(SoundData.KILOMETER.getIndex()));
        }
    }

    private void b(List<Object> list, float f) {
        int iFloor = (int) Math.floor(f);
        String string = Double.toString(new BigDecimal(f - iFloor).setScale(2, 4).doubleValue());
        int iIndexOf = string.indexOf(46);
        int i = 0;
        if (iIndexOf >= 0) {
            string = string.substring(iIndexOf + 1);
            try {
                i = Integer.parseInt(string);
            } catch (NumberFormatException e) {
                LogUtil.a("Track_ChineseVoiceConstructor", "broadcastDecimalDistance NumberFormatException", e.getMessage());
            }
        }
        if (iIndexOf >= 0 && i > 0) {
            if (f > 0.0f && f < 1.0f) {
                list.add(Integer.valueOf(SoundData.ZERO.getIndex()));
            } else {
                e(list, iFloor);
            }
            list.add(Integer.valueOf(SoundData.GIRL_POINT.getIndex()));
            e(list, string);
        } else if (iFloor == 0) {
            list.add(Integer.valueOf(SoundData.ZERO.getIndex()));
        } else {
            e(list, iFloor);
        }
        list.add(Integer.valueOf(SoundData.KILOMETER.getIndex()));
    }

    private void e(List<Object> list, String str) {
        if (str.length() != 0) {
            int length = str.length();
            for (int i = 0; i < length; i++) {
                try {
                    g(list, Integer.parseInt(String.valueOf(str.charAt(i))));
                } catch (NumberFormatException e) {
                    LogUtil.a("Track_ChineseVoiceConstructor", "handlePointString NumberFormatException", e.getMessage());
                }
            }
        }
    }

    private void j(List<Object> list, jbc jbcVar) {
        if (jbcVar.v()) {
            long jG = jbcVar.g();
            LogUtil.a("Track_ChineseVoiceConstructor", "broadcastPace lastPace");
            if (jG > 0) {
                a(list, jbcVar, jG);
            }
        }
    }

    private void a(List<Object> list, jbc jbcVar, long j) {
        if (j <= 1000) {
            if (jbcVar.s() && jbcVar.p() && jbcVar.v() && jbcVar.t()) {
                return;
            }
            j(list);
            return;
        }
        list.add(Integer.valueOf(SoundData.NEAR_BY_ONE_MILE.getIndex()));
        d(list, j);
        if (jbcVar.j()) {
            list.add(Integer.valueOf(SoundData.GREAT.getIndex()));
        } else {
            list.add(Integer.valueOf(SoundData.COME_ON.getIndex()));
        }
    }

    private void j(List<Object> list) {
        list.add(Integer.valueOf(SoundData.CURRENT_NOT_ENOUGH.getIndex()));
        list.add(Integer.valueOf(SoundData.CANNOT_GET_DATA.getIndex()));
    }

    private void f(List<Object> list, jbc jbcVar) {
        if (jbcVar.x()) {
            float fC = jbcVar.c();
            int iK = jbcVar.k();
            if (fC > 0.0f) {
                d(list, jbcVar, fC, iK);
            } else {
                c(list, jbcVar, iK);
            }
        }
    }

    private void c(List<Object> list, jbc jbcVar, int i) {
        LogUtil.a("Track_ChineseVoiceConstructor", "broadcastSpeed : announceCurrentSpeedEqualZero, mSpeed = 0");
        if (jbcVar.s() && jbcVar.p() && jbcVar.x() && jbcVar.t()) {
            return;
        }
        if (i == 264 || i == 257 || i == 258) {
            list.add(Integer.valueOf(SoundData.CURRENT_PACE_TESTING.getIndex()));
            list.add(Integer.valueOf(SoundData.RETRY_LATER.getIndex()));
        } else if (i == 259 || i == 265) {
            list.add(Integer.valueOf(SoundData.CURRENT_SPEED.getIndex()));
            list.add(Integer.valueOf(SoundData.MEASURING.getIndex()));
            list.add(Integer.valueOf(SoundData.RETRY_LATER.getIndex()));
        }
    }

    private void d(List<Object> list, jbc jbcVar, float f, int i) {
        double dDoubleValue;
        LogUtil.a("Track_ChineseVoiceConstructor", "broadcastSpeed : announceCurrentSpeedEqualZero, Speed > 0.0f ");
        if (i == 264 || i == 257 || i == 258) {
            list.add(Integer.valueOf(SoundData.CURRENT_PACE.getIndex()));
            d(list, ((long) (3600.0f / f)) * 1000);
        } else if (i == 259 || i == 265) {
            try {
                dDoubleValue = Double.valueOf(jaa.d(f, 1)).doubleValue();
            } catch (NumberFormatException unused) {
                LogUtil.j("Track_ChineseVoiceConstructor", "numberFormatException");
                dDoubleValue = 0.0d;
            }
            list.add(Integer.valueOf(SoundData.CURRENT_SPEED.getIndex()));
            b(list, (float) dDoubleValue);
            list.add(Integer.valueOf(SoundData.PER_HOUR.getIndex()));
        }
        if (jbcVar.j()) {
            list.add(Integer.valueOf(SoundData.GREAT.getIndex()));
        } else {
            list.add(Integer.valueOf(SoundData.COME_ON.getIndex()));
        }
    }

    private void c(List<Object> list, jbc jbcVar) {
        if (jbcVar.t()) {
            LogUtil.a("Track_ChineseVoiceConstructor", "broadcastHeartRate");
            int iE = jbcVar.e();
            if (iE > 0) {
                list.add(Integer.valueOf(SoundData.CURRENT_HEART_RATE.getIndex()));
                e(list, iE);
                return;
            }
            if (!(jbcVar.s() && jbcVar.p() && ((jbcVar.x() || jbcVar.v()) && jbcVar.t())) && jbcVar.ab() <= 1) {
                boolean zI = ive.c().i();
                boolean zL = ive.c().l();
                if (!zI) {
                    list.add(Integer.valueOf(SoundData.HEART_RATE_DEVICE_NOT_BIND.getIndex()));
                } else {
                    if (!zL) {
                        list.add(Integer.valueOf(SoundData.HEART_RATE_DEVICE_NOT_BIND.getIndex()));
                        return;
                    }
                    list.add(Integer.valueOf(SoundData.CURRENT_HEART_RATE.getIndex()));
                    list.add(Integer.valueOf(SoundData.MEASURING.getIndex()));
                    list.add(Integer.valueOf(SoundData.RETRY_LATER.getIndex()));
                }
            }
        }
    }

    private void b(List<Object> list) {
        if (!njy.e(list) && jef.e() && jeh.e().j() && iwy.a(BaseApplication.getContext()).am()) {
            for (int i = 0; i < 15; i++) {
                list.add(jeo.d().d("empty_500"));
            }
            list.add(jeo.d().d("L233"));
        }
    }

    private static void e(List<String> list, int i, int i2) {
        int i3 = i / 10000;
        if (i3 > 0) {
            list.add(e(i3));
            list.add("C016");
            int i4 = i % 10000;
            if (i4 == 0) {
                return;
            }
            int length = String.valueOf(i4).length();
            if (length < i2 - 1) {
                list.add(e(0));
            }
            e(list, i4, length);
            return;
        }
        int i5 = i / 1000;
        if (i5 > 0) {
            list.add(b(i5));
            list.add("C015");
            int i6 = i % 1000;
            if (i6 == 0) {
                return;
            }
            int length2 = String.valueOf(i6).length();
            if (length2 < i2 - 1) {
                list.add(e(0));
            }
            e(list, i6, length2);
            return;
        }
        int i7 = i / 100;
        if (i7 > 0) {
            list.add(b(i7));
            list.add("C014");
            int i8 = i % 100;
            if (i8 == 0) {
                return;
            }
            int length3 = String.valueOf(i8).length();
            if (length3 < i2 - 1) {
                list.add(e(0));
            }
            e(list, i8, length3);
            return;
        }
        int i9 = i / 10;
        if (i9 > 0) {
            list.add(b(i9));
            list.add("C013");
            int i10 = i % 10;
            if (i10 == 0) {
                return;
            }
            e(list, i10, 1);
            return;
        }
        list.add(b(i));
    }

    private static void e(List<String> list, float f) {
        if (njy.e(list)) {
            return;
        }
        String[] strArrSplit = String.valueOf(f).split("\\.");
        if (strArrSplit.length != 2) {
            LogUtil.j("Track_ChineseVoiceConstructor", "numberArray.length error");
            return;
        }
        e(list, CommonUtil.j(strArrSplit[0]), strArrSplit[0].length());
        if (CommonUtil.j(strArrSplit[1]) > 0) {
            list.add("C010");
            a(list, strArrSplit[1]);
        }
    }

    private static void a(List<String> list, String str) {
        if (njy.e(list) || TextUtils.isEmpty(str)) {
            return;
        }
        int length = str.length();
        if (length > 2) {
            length = 2;
        }
        for (int i = 0; i < length; i++) {
            list.add(b(str.charAt(i) - '0'));
        }
    }

    private static String b(int i) {
        return "N00" + i;
    }

    public static void b(List<String> list, Object obj) {
        if (obj instanceof Integer) {
            if (String.valueOf(obj).length() == 2) {
                j(list, ((Integer) obj).intValue());
                return;
            } else {
                e(list, ((Integer) obj).intValue(), String.valueOf(obj).length());
                return;
            }
        }
        if (obj instanceof Float) {
            e(list, ((Float) obj).floatValue());
        } else {
            LogUtil.a("Track_ChineseVoiceConstructor", "AssembleCommonNumberVoice no match number type");
        }
    }

    private static void j(List<String> list, int i) {
        int i2 = i / 10;
        if (i2 > 1) {
            list.add(b(i2));
            list.add("C013");
            int i3 = i % 10;
            if (i3 != 0) {
                list.add(b(i3));
                return;
            }
            return;
        }
        list.add("C013");
        int i4 = i % 10;
        if (i4 != 0) {
            list.add(b(i4));
        }
    }

    public static String[] c(List<String> list) {
        if (njy.e(list)) {
            return null;
        }
        String[] strArr = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            strArr[i] = jeo.d().d(list.get(i));
        }
        return strArr;
    }

    public static String[] e(List<String> list) {
        if (njy.e(list)) {
            return null;
        }
        String[] strArr = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            strArr[i] = "assert" + jcp.d().b(list.get(i), "mp3");
        }
        return strArr;
    }
}
