package com.huami.watch.companion.sport.pb;

import android.content.Context;
import android.text.TextUtils;
import com.huami.watch.companion.R;
import com.huami.watch.companion.manager.UnitManager;
import com.huami.watch.companion.ui.fragment.PBFragment;
import com.huami.watch.companion.util.ChartTimeUtil;
import com.huami.watch.companion.util.NumberFormatter;
import com.huami.watch.util.UnitUtil;

/* JADX INFO: loaded from: classes16.dex */
public class PBUtil {

    /* JADX INFO: renamed from: com.huami.watch.companion.sport.pb.PBUtil$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$huami$watch$companion$sport$pb$PBType;

        static {
            int[] iArr = new int[PBType.values().length];
            $SwitchMap$com$huami$watch$companion$sport$pb$PBType = iArr;
            try {
                iArr[PBType.RUN_FURTHEST_KM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$huami$watch$companion$sport$pb$PBType[PBType.RIDE_FURTHEST_KM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$huami$watch$companion$sport$pb$PBType[PBType.RUN_LONGEST_TIME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$huami$watch$companion$sport$pb$PBType[PBType.RIDE_LONGEST_TIME.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$huami$watch$companion$sport$pb$PBType[PBType.RUN_3_KM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$huami$watch$companion$sport$pb$PBType[PBType.RUN_3_MI.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$huami$watch$companion$sport$pb$PBType[PBType.RUN_5_KM.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$huami$watch$companion$sport$pb$PBType[PBType.RUN_5_MI.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$huami$watch$companion$sport$pb$PBType[PBType.RUN_10_KM.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$huami$watch$companion$sport$pb$PBType[PBType.RUN_10_MI.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$huami$watch$companion$sport$pb$PBType[PBType.HALF_MARATHON_SHORTEST_TIME.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$huami$watch$companion$sport$pb$PBType[PBType.FULL_MARATHON_SHORTEST_TIME.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$huami$watch$companion$sport$pb$PBType[PBType.RIDE_MOST_UP_M.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$huami$watch$companion$sport$pb$PBType[PBType.RIDE_5_KM.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$huami$watch$companion$sport$pb$PBType[PBType.RIDE_10_KM.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$huami$watch$companion$sport$pb$PBType[PBType.RIDE_20_KM.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$com$huami$watch$companion$sport$pb$PBType[PBType.RIDE_40_KM.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                $SwitchMap$com$huami$watch$companion$sport$pb$PBType[PBType.RIDE_5_MI.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                $SwitchMap$com$huami$watch$companion$sport$pb$PBType[PBType.RIDE_10_MI.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                $SwitchMap$com$huami$watch$companion$sport$pb$PBType[PBType.RIDE_20_MI.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                $SwitchMap$com$huami$watch$companion$sport$pb$PBType[PBType.RIDE_40_MI.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                $SwitchMap$com$huami$watch$companion$sport$pb$PBType[PBType.CLIMB_HIGHEST_ALTITUDE_M.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                $SwitchMap$com$huami$watch$companion$sport$pb$PBType[PBType.CLIMB_MOST_UP_M.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                $SwitchMap$com$huami$watch$companion$sport$pb$PBType[PBType.CLIMB_MOST_DOWN_M.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                $SwitchMap$com$huami$watch$companion$sport$pb$PBType[PBType.CLIMB_LONGEST_CLIMBING_M.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
        }
    }

    public static int convertToBleWatchValue(String str, double d) {
        PBType pBTypeFind = PBType.find(str);
        if (pBTypeFind == null) {
            return (int) d;
        }
        if (pBTypeFind == PBType.RUN_FURTHEST_KM || pBTypeFind == PBType.RIDE_FURTHEST_KM) {
            d *= 1000.0d;
        }
        return (int) d;
    }

    public static String formatPBValue(Context context, String str, double d) {
        PBType pBTypeFind = PBType.find(str);
        if (pBTypeFind == null) {
            return "";
        }
        String double2String = NumberFormatter.formatDouble2String(d, 2, new int[0]);
        boolean zIsDistanceKM = UnitManager.isDistanceKM(context);
        switch (AnonymousClass1.$SwitchMap$com$huami$watch$companion$sport$pb$PBType[pBTypeFind.ordinal()]) {
            case 1:
            case 2:
                if (!zIsDistanceKM) {
                    d = UnitUtil.kmToMi(d);
                }
                return NumberFormatter.formatDouble2String(d, 2, new int[0]);
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
                return ChartTimeUtil.getFormatDurationTime((long) d);
            case 13:
            case 22:
            case 23:
            case 24:
            case 25:
                if (!zIsDistanceKM) {
                    d = UnitUtil.mToFt((float) d);
                }
                return NumberFormatter.formatDouble2String(d, 2, new int[0]);
            default:
                return double2String;
        }
    }

    public static String formatPBValuePos(Context context, String str, double d) {
        PBType pBTypeFind = PBType.find(str);
        if (pBTypeFind == null) {
            return "";
        }
        String double2String = NumberFormatter.formatDouble2String(d, 2, new int[0]);
        boolean zIsDistanceKM = UnitManager.isDistanceKM(context);
        switch (AnonymousClass1.$SwitchMap$com$huami$watch$companion$sport$pb$PBType[pBTypeFind.ordinal()]) {
            case 1:
            case 2:
                StringBuilder sb = new StringBuilder();
                if (!zIsDistanceKM) {
                    d = UnitUtil.kmToMi(d);
                }
                sb.append(NumberFormatter.formatDouble2String(d, 2, new int[0]));
                sb.append(zIsDistanceKM ? "千米" : "英里");
                return sb.toString();
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
                return d + "秒";
            case 13:
            case 22:
            case 23:
            case 24:
            case 25:
                StringBuilder sb2 = new StringBuilder();
                if (!zIsDistanceKM) {
                    d = UnitUtil.mToFt((float) d);
                }
                sb2.append(NumberFormatter.formatDouble2String(d, 2, new int[0]));
                sb2.append(zIsDistanceKM ? "米" : "英尺");
                return sb2.toString();
            default:
                return double2String;
        }
    }

    public static int getItemBgRes(String str) {
        int i = R.drawable.bg_pb_seg_time;
        PBType pBTypeFind = PBType.find(str);
        if (pBTypeFind == null) {
            return i;
        }
        int i2 = AnonymousClass1.$SwitchMap$com$huami$watch$companion$sport$pb$PBType[pBTypeFind.ordinal()];
        if (i2 == 1 || i2 == 2) {
            return R.drawable.bg_pb_distance;
        }
        if (i2 == 3 || i2 == 4) {
            return R.drawable.bg_pb_max_time;
        }
        if (i2 != 13) {
            switch (i2) {
                case 22:
                case 23:
                case 24:
                case 25:
                    break;
                default:
                    return i;
            }
        }
        return R.drawable.bg_pb_clime;
    }

    public static String getPBEventKey(String str) {
        PBType pBTypeFind = PBType.find(str);
        if (pBTypeFind == null) {
            return "";
        }
        switch (AnonymousClass1.$SwitchMap$com$huami$watch$companion$sport$pb$PBType[pBTypeFind.ordinal()]) {
            case 1:
            case 2:
                return PBFragment.RecordEvent.FARTHEST_DISTANCE;
            case 3:
            case 4:
                return PBFragment.RecordEvent.LONGEST_TIME;
            case 5:
                return PBFragment.RecordEvent.KM_FAS_EST_3;
            case 6:
                return PBFragment.RecordEvent.MI_FASTEST_3;
            case 7:
            case 14:
                return PBFragment.RecordEvent.KM_FASTEST5;
            case 8:
            case 18:
                return PBFragment.RecordEvent.MI_FASTEST_5;
            case 9:
            case 15:
                return PBFragment.RecordEvent.KM_FASTEST10;
            case 10:
            case 19:
                return PBFragment.RecordEvent.MI_FASTEST_10;
            case 11:
                return PBFragment.RecordEvent.HALF_MARATHON_FASTEST;
            case 12:
                return PBFragment.RecordEvent.MALAYSIA_FASTEST;
            case 13:
                return PBFragment.RecordEvent.MAXCRAWL;
            case 16:
                return PBFragment.RecordEvent.KM_FASTEST_20;
            case 17:
                return PBFragment.RecordEvent.KM_FASTEST_40;
            case 20:
            case 21:
                return "20mifastest";
            case 22:
                return PBFragment.RecordEvent.HIGHEST_ALTITUDE;
            case 23:
                return PBFragment.RecordEvent.MAXTOTALRISE;
            case 24:
                return PBFragment.RecordEvent.MAXTOTALDECLINE;
            case 25:
                return PBFragment.RecordEvent.MAXTOTALCLIMB;
            default:
                return "";
        }
    }

    public static int getPBNameIndexToWatch(String str) {
        PBType pBTypeFind = PBType.find(str);
        if (pBTypeFind == null) {
            return -1;
        }
        switch (AnonymousClass1.$SwitchMap$com$huami$watch$companion$sport$pb$PBType[pBTypeFind.ordinal()]) {
            case 1:
                return 6;
            case 2:
                return 22;
            case 3:
                return 7;
            case 4:
                return 23;
            case 5:
                return 0;
            case 6:
                return 3;
            case 7:
                return 1;
            case 8:
                return 4;
            case 9:
                return 2;
            case 10:
                return 5;
            case 11:
                return 8;
            case 12:
                return 9;
            case 13:
                return 24;
            case 14:
                return 14;
            case 15:
                return 15;
            case 16:
                return 16;
            case 17:
                return 17;
            case 18:
                return 18;
            case 19:
                return 19;
            case 20:
                return 20;
            case 21:
                return 21;
            case 22:
                return 10;
            case 23:
                return 11;
            case 24:
                return 12;
            case 25:
                return 13;
            default:
                return -1;
        }
    }

    public static String getPBTitle(Context context, String str) {
        PBType pBTypeFind = PBType.find(str);
        if (pBTypeFind == null) {
            return "";
        }
        switch (AnonymousClass1.$SwitchMap$com$huami$watch$companion$sport$pb$PBType[pBTypeFind.ordinal()]) {
            case 1:
            case 2:
                return context.getString(R.string.pb_maximum_distance);
            case 3:
            case 4:
                return context.getString(R.string.pb_maximum_time);
            case 5:
                return context.getString(R.string.pb_fastest_time, 3 + context.getString(R.string.unit_km));
            case 6:
                return context.getString(R.string.pb_fastest_time, 3 + context.getString(R.string.unit_mile_space));
            case 7:
                return context.getString(R.string.pb_fastest_time, 5 + context.getString(R.string.unit_km));
            case 8:
                return context.getString(R.string.pb_fastest_time, 5 + context.getString(R.string.unit_mile_space));
            case 9:
                return context.getString(R.string.pb_fastest_time, 10 + context.getString(R.string.unit_km));
            case 10:
                return context.getString(R.string.pb_fastest_time, 10 + context.getString(R.string.unit_mile_space));
            case 11:
                return context.getString(R.string.pb_fastest_time, context.getString(R.string.pb_half_marathon));
            case 12:
                return context.getString(R.string.pb_fastest_time, context.getString(R.string.pb_full_marathon));
            case 13:
                return context.getString(R.string.pb_maximum_climb);
            case 14:
                return context.getString(R.string.pb_fastest_time, 5 + context.getString(R.string.unit_km));
            case 15:
                return context.getString(R.string.pb_fastest_time, 10 + context.getString(R.string.unit_km));
            case 16:
                return context.getString(R.string.pb_fastest_time, 20 + context.getString(R.string.unit_km));
            case 17:
                return context.getString(R.string.pb_fastest_time, 40 + context.getString(R.string.unit_km));
            case 18:
                return context.getString(R.string.pb_fastest_time, 5 + context.getString(R.string.unit_mile_space));
            case 19:
                return context.getString(R.string.pb_fastest_time, 10 + context.getString(R.string.unit_mile_space));
            case 20:
                return context.getString(R.string.pb_fastest_time, 20 + context.getString(R.string.unit_mile_space));
            case 21:
                return context.getString(R.string.pb_fastest_time, 40 + context.getString(R.string.unit_mile_space));
            case 22:
                return context.getString(R.string.pb_maximum_altitude);
            case 23:
                return context.getString(R.string.pb_maximum_elevation_gain);
            case 24:
                return context.getString(R.string.pb_maximum_elevation_loss);
            case 25:
                return context.getString(R.string.pb_maximum_elevation_climb);
            default:
                return "";
        }
    }

    public static String getPBUnit(Context context, String str) {
        boolean zIsDistanceKM = UnitManager.isDistanceKM(context);
        PBType pBTypeFind = PBType.find(str);
        if (pBTypeFind == null) {
            return "";
        }
        int i = AnonymousClass1.$SwitchMap$com$huami$watch$companion$sport$pb$PBType[pBTypeFind.ordinal()];
        if (i == 1 || i == 2) {
            return context.getString(zIsDistanceKM ? R.string.unit_km : R.string.unit_mile_space);
        }
        if (i != 13) {
            switch (i) {
                case 22:
                case 23:
                case 24:
                case 25:
                    break;
                default:
                    return "";
            }
        }
        return context.getString(zIsDistanceKM ? R.string.unit_meter_short : R.string.unit_ft);
    }

    public static String getSportDetailPBName(Context context, String str) {
        PBType pBTypeFind = PBType.find(str);
        String string = "";
        if (pBTypeFind == null) {
            return "";
        }
        switch (AnonymousClass1.$SwitchMap$com$huami$watch$companion$sport$pb$PBType[pBTypeFind.ordinal()]) {
            case 1:
            case 2:
                string = context.getString(R.string.pb_maximum_distance);
                break;
            case 3:
            case 4:
                string = context.getString(R.string.pb_maximum_time);
                break;
            case 5:
                string = context.getString(R.string.pb_fastest, 3 + context.getString(R.string.unit_km));
                break;
            case 6:
                string = context.getString(R.string.pb_fastest, 3 + context.getString(R.string.unit_mile_space));
                break;
            case 7:
                string = context.getString(R.string.pb_fastest, 5 + context.getString(R.string.unit_km));
                break;
            case 8:
                string = context.getString(R.string.pb_fastest, 5 + context.getString(R.string.unit_mile_space));
                break;
            case 9:
                string = context.getString(R.string.pb_fastest, 10 + context.getString(R.string.unit_km));
                break;
            case 10:
                string = context.getString(R.string.pb_fastest, 10 + context.getString(R.string.unit_mile_space));
                break;
            case 11:
                string = context.getString(R.string.pb_fastest, context.getString(R.string.pb_half_marathon));
                break;
            case 12:
                string = context.getString(R.string.pb_fastest, context.getString(R.string.pb_full_marathon));
                break;
            case 13:
                string = context.getString(R.string.pb_maximum_climb);
                break;
            case 14:
                string = context.getString(R.string.pb_fastest, 5 + context.getString(R.string.unit_km));
                break;
            case 15:
                string = context.getString(R.string.pb_fastest, 10 + context.getString(R.string.unit_km));
                break;
            case 16:
                string = context.getString(R.string.pb_fastest, 20 + context.getString(R.string.unit_km));
                break;
            case 17:
                string = context.getString(R.string.pb_fastest, 40 + context.getString(R.string.unit_km));
                break;
            case 18:
                string = context.getString(R.string.pb_fastest, 5 + context.getString(R.string.unit_mile_space));
                break;
            case 19:
                string = context.getString(R.string.pb_fastest, 10 + context.getString(R.string.unit_mile_space));
                break;
            case 20:
                string = context.getString(R.string.pb_fastest, 20 + context.getString(R.string.unit_mile_space));
                break;
            case 21:
                string = context.getString(R.string.pb_fastest, 40 + context.getString(R.string.unit_mile_space));
                break;
            case 22:
                string = context.getString(R.string.pb_maximum_altitude);
                break;
            case 23:
                string = context.getString(R.string.pb_maximum_elevation_gain);
                break;
            case 24:
                string = context.getString(R.string.pb_maximum_elevation_loss);
                break;
            case 25:
                string = context.getString(R.string.pb_maximum_elevation_climb);
                break;
        }
        String pBUnit = getPBUnit(context, str);
        if (TextUtils.isEmpty(pBUnit)) {
            return string;
        }
        return string + "(" + pBUnit + ")";
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001d A[ORIG_RETURN, RETURN] */
    public static boolean isValueValid(String str, double d, double d2) {
        PBType pBTypeFind = PBType.find(str);
        if (pBTypeFind == null) {
            return false;
        }
        switch (AnonymousClass1.$SwitchMap$com$huami$watch$companion$sport$pb$PBType[pBTypeFind.ordinal()]) {
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
                if (d < d2) {
                    return true;
                }
                return false;
            case 13:
            default:
                if (d > d2) {
                    return true;
                }
                return false;
        }
    }
}
