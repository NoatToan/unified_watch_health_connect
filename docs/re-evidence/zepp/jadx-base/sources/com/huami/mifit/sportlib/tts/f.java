package com.huami.mifit.sportlib.tts;

import com.huami.mifit.sportlib.utils.HeartRateConstant;
import com.huami.sleepassistant.lib.utils.TimeUtils;
import java.util.Locale;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;

/* JADX INFO: loaded from: classes11.dex */
class f implements a<String> {
    private static final String A = "GPS signal lost";
    private static final String B = "GPS signal restored";
    private static final String C = "Have a rest! See you next time!";
    private static final String D = "Current speed is %s";
    private static final String b = " ";
    private static final String c = "kilometer";
    private static final String d = "kilometers";
    private static final String e = "mile";
    private static final String f = "miles";
    private static final String g = "hour";
    private static final String h = "hours";
    private static final String i = "minute";
    private static final String j = "minutes";
    private static final String k = "second";
    private static final String l = "seconds";
    private static final String m = "Three. Two. One. Go!";
    private static final String n = "You %s %s within %s.";
    private static final String o = "ran";
    private static final String p = "cycled";
    private static final String q = "walked";
    private static final String r = "Last %s took you %s.";
    private static final String s = "heart rate is %s.";
    private static final String t = "Way to go!";
    private static final String u = "Current pace is %s";
    private static final String v = "Current heart rate is %s";
    private static final String w = "%s paused";
    private static final String x = "%s restored";
    private static final String y = "Running";
    private static final String z = "Workout";
    public boolean a = false;

    private String l(SpeedVoiceInfo speedVoiceInfo) {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format(Locale.ENGLISH, "%.1f", Float.valueOf(speedVoiceInfo.speed)));
        if (speedVoiceInfo.isMetric) {
            sb.append(" kilometers per hour");
        } else {
            sb.append(" miles per hour");
        }
        return sb.toString();
    }

    private String s(long j2) {
        StringBuilder sb;
        String str;
        StringBuilder sb2;
        String str2;
        StringBuilder sb3;
        String str3;
        StringBuilder sb4 = new StringBuilder();
        long j3 = j2 / TimeUtils.TIME_1_HOURS;
        long j4 = j2 % TimeUtils.TIME_1_HOURS;
        long j5 = j4 / 60;
        long j6 = j4 % 60;
        if (j3 > 0) {
            if (j3 == 1) {
                sb3 = new StringBuilder();
                sb3.append(j3);
                sb3.append(" ");
                str3 = g;
            } else {
                sb3 = new StringBuilder();
                sb3.append(j3);
                sb3.append(" ");
                str3 = h;
            }
            sb3.append(str3);
            sb4.append(sb3.toString());
        }
        if (j5 > 0) {
            if (j3 > 0 && j6 == 0) {
                sb4.append(" ");
                sb4.append(SearchCriteria.AND);
            }
            sb4.append(" ");
            if (j5 == 1) {
                sb2 = new StringBuilder();
                sb2.append(j5);
                sb2.append(" ");
                str2 = i;
            } else {
                sb2 = new StringBuilder();
                sb2.append(j5);
                sb2.append(" ");
                str2 = j;
            }
            sb2.append(str2);
            sb4.append(sb2.toString());
        }
        if (j6 > 0) {
            if (j3 > 0 || j5 > 0) {
                sb4.append(" ");
                sb4.append(SearchCriteria.AND);
            }
            sb4.append(" ");
            if (j6 == 1) {
                sb = new StringBuilder();
                sb.append(j6);
                sb.append(" ");
                str = k;
            } else {
                sb = new StringBuilder();
                sb.append(j6);
                sb.append(" ");
                str = l;
            }
            sb.append(str);
            sb4.append(sb.toString());
        }
        return sb4.toString();
    }

    @Override // com.huami.mifit.sportlib.tts.a
    public void destroy() {
    }

    @Override // com.huami.mifit.sportlib.tts.a
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public String j(DistanceVoiceInfo distanceVoiceInfo) {
        String string;
        StringBuilder sb = new StringBuilder();
        int sportType = distanceVoiceInfo.getSportType();
        float convertDistance = distanceVoiceInfo.getConvertDistance();
        boolean zIsMetric = distanceVoiceInfo.isMetric();
        String str = c;
        if (zIsMetric) {
            boolean zIsAuto = distanceVoiceInfo.isAuto();
            String str2 = d;
            if (zIsAuto) {
                StringBuilder sb2 = new StringBuilder();
                int i2 = (int) convertDistance;
                sb2.append(i2);
                sb2.append(" ");
                if (i2 == 1) {
                    str2 = c;
                }
                sb2.append(str2);
                string = sb2.toString();
            } else {
                string = convertDistance + " " + d;
            }
        } else {
            boolean zIsAuto2 = distanceVoiceInfo.isAuto();
            String str3 = f;
            if (zIsAuto2) {
                StringBuilder sb3 = new StringBuilder();
                int i3 = (int) convertDistance;
                sb3.append(i3);
                sb3.append(" ");
                if (i3 == 1) {
                    str3 = e;
                }
                sb3.append(str3);
                string = sb3.toString();
            } else {
                string = convertDistance + " " + f;
            }
        }
        String strS = s(distanceVoiceInfo.getUsedTime());
        if (sportType == 6) {
            sb.append(String.format(Locale.getDefault(), n, q, string, strS));
        } else if (sportType != 9) {
            sb.append(String.format(Locale.getDefault(), n, o, string, strS));
        } else {
            sb.append(String.format(Locale.getDefault(), n, p, string, strS));
        }
        if (distanceVoiceInfo.isAuto() && convertDistance > 1.0f) {
            String strS2 = s(distanceVoiceInfo.getPaceCost());
            if (!distanceVoiceInfo.isMetric()) {
                str = e;
            }
            sb.append(String.format(Locale.getDefault(), r, str, strS2));
        }
        int hr = distanceVoiceInfo.getHr();
        if (HeartRateConstant.isHRValueValid(hr)) {
            sb.append(String.format(Locale.getDefault(), s, String.valueOf(hr)));
        }
        return sb.toString();
    }

    @Override // com.huami.mifit.sportlib.tts.a
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public String a() {
        return A;
    }

    @Override // com.huami.mifit.sportlib.tts.a
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public String c() {
        return B;
    }

    @Override // com.huami.mifit.sportlib.tts.a
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public String h(int i2) {
        return String.format(Locale.getDefault(), v, String.valueOf(i2));
    }

    @Override // com.huami.mifit.sportlib.tts.a
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public String e(int i2) {
        return String.format(Locale.getDefault(), u, s(i2));
    }

    @Override // com.huami.mifit.sportlib.tts.a
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public String b(int i2) {
        return i2 != 1 ? String.format(Locale.getDefault(), w, z) : String.format(Locale.getDefault(), w, y);
    }

    @Override // com.huami.mifit.sportlib.tts.a
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public String f(int i2) {
        return i2 != 1 ? String.format(Locale.getDefault(), x, z) : String.format(Locale.getDefault(), x, y);
    }

    @Override // com.huami.mifit.sportlib.tts.a
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public String i(SpeedVoiceInfo speedVoiceInfo) {
        return String.format(Locale.getDefault(), D, l(speedVoiceInfo));
    }

    @Override // com.huami.mifit.sportlib.tts.a
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public String d() {
        return this.a ? m : "";
    }

    @Override // com.huami.mifit.sportlib.tts.a
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public String g() {
        return C;
    }

    public void w(boolean z2) {
        this.a = z2;
    }
}
