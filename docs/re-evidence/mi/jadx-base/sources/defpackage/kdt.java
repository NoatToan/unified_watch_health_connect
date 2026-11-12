package defpackage;

import android.text.TextUtils;
import com.huami.bluetooth.profile.channel.module.voice.content.c;
import com.huami.bluetooth.profile.channel.module.voice.content.d;
import com.xiaomi.fit.fitness.parser.sport.base.SportReportBaseParser;
import com.xiaomi.fitness.aivs.base.BaseAivsService;
import com.xiaomi.hm.health.bt.model.HMReminderInfo;
import com.xiaomi.hm.health.bt.sdk.HuamiDevice;
import com.xiaomi.hm.health.bt.sdk.data.DeviceBatteryInfo;
import com.xiaomi.hm.health.bt.sdk.voice.Image;
import com.xiaomi.hm.health.bt.sdk.voice.WeatherItem;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes3.dex */
public class kdt {
    public static int a(String str, int i) {
        if (i == -1 || i == 0) {
            return 0;
        }
        if (i == 1) {
            return 127;
        }
        if (i == 2 || i == 3) {
            return 31;
        }
        if (i == 5) {
            return 96;
        }
        if (i != 6) {
            return -1;
        }
        return k(str);
    }

    public static long b(long j) {
        return ((long) Calendar.getInstance().get(15)) + j;
    }

    public static long c(String str) {
        try {
            Date date = new SimpleDateFormat("yyyyMMdd", Locale.getDefault()).parse(str);
            if (date == null) {
                return 0L;
            }
            return date.getTime();
        } catch (ParseException e) {
            t5t.m("VoiceHelper", e.getMessage());
            return 0L;
        }
    }

    public static d.c d(WeatherItem weatherItem) {
        Image image = weatherItem.getImage();
        return image == null ? new d.c("", "") : new d.c(image.getContentDescription(), image.getSources().get(0).getUrl());
    }

    public static pw e(String str, HuamiDevice huamiDevice) {
        DeviceBatteryInfo batteryLevel;
        pw pwVarD = pj.d(str);
        if (pwVarD != null) {
            return pwVarD;
        }
        pw pwVarA = pj.a(str);
        if (pwVarA != null) {
            return pwVarA;
        }
        pw pwVarC = pj.c(str);
        if (pwVarC != null) {
            return pwVarC;
        }
        str.hashCode();
        if (str.equals("base_device_brightness")) {
            return new om(new c(15, new c.b(0, null, null)));
        }
        return (str.equals("base_device_battery") && (batteryLevel = huamiDevice.getBatteryLevel()) != null) ? new lu(String.valueOf(batteryLevel.getLevel())) : pwVarC;
    }

    public static int f(String str) {
        String strA;
        int i;
        if (!TextUtils.isEmpty(str) && (strA = new p5(str).a()) != null) {
            String[] strArrSplit = strA.split(",");
            if (strArrSplit.length != 0) {
                short s = 0;
                for (String str2 : strArrSplit) {
                    str2.hashCode();
                    switch (str2) {
                        case "1":
                            i = s | 32;
                            break;
                        case "2":
                            i = s | 64;
                            break;
                        case "3":
                            i = s | HMReminderInfo.FLAG_WEDNESDAY;
                            break;
                        case "4":
                            i = s | HMReminderInfo.FLAG_THURSDAY;
                            break;
                        case "5":
                            i = s | HMReminderInfo.FLAG_FRIDAY;
                            break;
                        case "6":
                            i = s | HMReminderInfo.FLAG_SATURDAY;
                            break;
                        case "7":
                            i = s | HMReminderInfo.FLAG_SUNDAY;
                            break;
                        default:
                            continue;
                            break;
                    }
                    s = (short) i;
                }
                return s;
            }
        }
        return 0;
    }

    public static int g(String str, int i) {
        switch (i) {
            case -1:
            case 0:
                return 0;
            case 1:
                return 4064;
            case 2:
            case 3:
                return 992;
            case 4:
            default:
                return -1;
            case 5:
                return BaseAivsService.MAX_PACKAGE_LENGTH;
            case 6:
                return f(str);
            case 7:
                return 4096;
            case 8:
                return 8192;
        }
    }

    public static jdt h(long j) {
        long j2 = j / 3600000;
        long j3 = j - (3600000 * j2);
        long j4 = j3 / 60000;
        return new jdt(j2, j4, (j3 - (60000 * j4)) / 1000);
    }

    public static int i(String str, int i) {
        if (i == 0) {
            return 0;
        }
        if (i == 768) {
            return 96;
        }
        if (i == 992) {
            return 31;
        }
        if (i == 4064) {
            return 127;
        }
        if (i == 4096) {
            return 512;
        }
        if (i == 8192) {
            return 1024;
        }
        if (4096 <= i || TextUtils.isEmpty(str)) {
            return -1;
        }
        return i >>> 5;
    }

    public static Calendar j(String str) {
        return xi.a(str);
    }

    public static int k(String str) {
        String strA = new p5(str).a();
        if (strA == null) {
            return -1;
        }
        String[] strArrSplit = strA.split(",");
        if (strArrSplit.length == 0) {
            return -1;
        }
        float fPow = 0.0f;
        for (String str2 : strArrSplit) {
            fPow = (float) (((double) fPow) + Math.pow(2.0d, Integer.parseInt(str2) - 1));
        }
        return (int) fPow;
    }

    public static long l(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("+HH:mm:ss", Locale.getDefault());
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        try {
            return simpleDateFormat.parse(str).getTime();
        } catch (Exception e) {
            t5t.m("VoiceHelper", "parseTimerOffset:" + e.getMessage());
            return -1L;
        }
    }

    public static String m(String str) {
        if (str.length() < 200) {
            return str;
        }
        return str.substring(0, SportReportBaseParser.ReportType.noFlyDuration) + "...";
    }
}
