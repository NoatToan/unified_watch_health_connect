package com.huami.mifit.sportlib.tts;

import com.huami.mifit.sportlib.common.Constants;
import com.huami.mifit.sportlib.utils.HeartRateConstant;
import com.huami.watch.wififtp.FileManagerFragment;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes11.dex */
class d implements a<List<String>> {
    private HashMap<String, String> I;
    private final String a = FileManagerFragment.FILE_TYPE_MUSIC;
    private final String b = "_";
    private final String c = "two";
    private final String d = "hundred";
    private final String e = "thousand";
    private final String f = "ten_thousand";
    private final String g = com.google.android.exoplayer2.text.ttml.b.x0;
    private final String h = "kilometer";
    private final String i = "mile";
    private final String j = "near_kilometer_spent";
    private final String k = "near_mile_spent";
    private final String l = "seconds";
    private final String m = "minute";
    private final String n = "hour";
    private final String o = "time_spent";
    private final String p = "already_cycled";
    private final String q = "already_run";
    private final String r = "already_walk";
    private final String s = "gps_lost";
    private final String t = "gps_regained";
    private final String u = "great";
    private final String v = "pace";
    private final String w = Constants.DATA_KEY_HR;
    private final String x = "faster";
    private final String y = "slower";
    private final String z = "run_start";
    private final String A = "run_pause";
    private final String B = "run_resume";
    private final String C = "run_stop";
    private final String D = "workout_pause";
    private final String E = "workout_resume";
    private final String F = "speed";
    private final String G = "mile_per_hour";
    private final String H = "km_per_hour";

    public d() {
        this.I = null;
        this.I = o();
    }

    private List<String> k(String str) {
        char[] charArray = str.toCharArray();
        ArrayList arrayList = new ArrayList();
        for (char c : charArray) {
            arrayList.add(this.I.get(String.valueOf(c)));
        }
        return arrayList;
    }

    private List<String> m(String str) {
        ArrayList arrayList = new ArrayList();
        int i = Integer.parseInt(str);
        if (i <= 100) {
            arrayList.add(this.I.get(str));
            return arrayList;
        }
        int i2 = i / 10000;
        if (i2 > 0) {
            arrayList.add(this.I.get(String.valueOf(i2)));
            arrayList.add(this.I.get("ten_thousand"));
        }
        int i3 = (i % 10000) / 1000;
        if (i3 > 0) {
            arrayList.add(this.I.get(String.valueOf(i3)));
            arrayList.add(this.I.get("thousand"));
        }
        int i4 = (i % 1000) / 100;
        if (i4 > 0) {
            if (i4 == 1) {
                arrayList.add(this.I.get(String.valueOf(100)));
            } else {
                arrayList.add(this.I.get(String.valueOf(i4)));
                arrayList.add(this.I.get("hundred"));
            }
        }
        int i5 = i % 100;
        if (i5 == 0) {
            return arrayList;
        }
        if (i5 < 10) {
            arrayList.add(this.I.get("_0" + i5));
        } else if (i5 < 20) {
            if (i4 == 0) {
                arrayList.add(this.I.get(String.valueOf(0)));
            }
            arrayList.add(this.I.get("_" + i5));
        } else {
            if (i4 == 0) {
                arrayList.add(this.I.get(String.valueOf(0)));
            }
            arrayList.add(this.I.get(String.valueOf(i5)));
        }
        return arrayList;
    }

    private List<String> n(String str) {
        ArrayList arrayList = new ArrayList();
        int i = Integer.parseInt(str);
        int i2 = i / 3600;
        if (i2 > 0) {
            arrayList.addAll(m(String.valueOf(i2)));
            arrayList.add(this.I.get("hour"));
        }
        int i3 = i % 3600;
        int i4 = i3 / 60;
        if (i4 > 0) {
            arrayList.addAll(m(String.valueOf(i4)));
            arrayList.add(this.I.get("minute"));
        }
        int i5 = i3 % 60;
        if (i5 > 0) {
            arrayList.addAll(m(String.valueOf(i5)));
            arrayList.add(this.I.get("seconds"));
        }
        return arrayList;
    }

    private HashMap<String, String> o() {
        HashMap<String, String> map = new HashMap<>();
        map.put("two", "voice/two.mp3");
        map.put("hundred", "voice/hundred.mp3");
        map.put("thousand", "voice/thousand.mp3");
        map.put("ten_thousand", "voice/ten_thousand.mp3");
        map.put(com.google.android.exoplayer2.text.ttml.b.x0, "voice/dot.mp3");
        map.put("kilometer", "voice/kilometer.mp3");
        map.put("mile", "voice/mile.mp3");
        map.put("near_kilometer_spent", "voice/near_kilometer_spent.mp3");
        map.put("near_mile_spent", "voice/near_mile_spent.mp3");
        map.put("seconds", "voice/seconds.mp3");
        map.put("minute", "voice/minute.mp3");
        map.put("hour", "voice/hour.mp3");
        map.put("time_spent", "voice/time_spent.mp3");
        map.put("already_run", "voice/already_run.mp3");
        map.put("already_cycled", "voice/already_cycled.mp3");
        map.put("already_walk", "voice/already_walk.mp3");
        map.put("gps_lost", "voice/gps_lost.mp3");
        map.put("gps_regained", "voice/gps_regained.mp3");
        map.put("great", "voice/great.mp3");
        map.put("pace", "voice/pace.mp3");
        map.put(Constants.DATA_KEY_HR, "voice/hr.mp3");
        map.put("faster", "voice/faster.mp3");
        map.put("slower", "voice/slower.mp3");
        map.put("run_start", "voice/run_start.mp3");
        map.put("run_pause", "voice/run_pause.mp3");
        map.put("run_resume", "voice/run_resume.mp3");
        map.put("run_stop", "voice/run_stop.mp3");
        map.put("workout_pause", "voice/workout_pause.mp3");
        map.put("workout_resume", "voice/workout_resume.mp3");
        map.put("speed", "voice/speed.mp3");
        map.put("mile_per_hour", "voice/mile_per_hour.mp3");
        map.put("km_per_hour", "voice/km_per_hour.mp3");
        for (int i = 0; i <= 100; i++) {
            map.put(String.valueOf(i), "voice/" + i + FileManagerFragment.FILE_TYPE_MUSIC);
        }
        for (int i2 = 1; i2 < 20; i2++) {
            String strValueOf = i2 < 10 ? "0" + i2 : String.valueOf(i2);
            map.put("_" + strValueOf, "voice/_" + strValueOf + FileManagerFragment.FILE_TYPE_MUSIC);
        }
        return map;
    }

    @Override // com.huami.mifit.sportlib.tts.a
    public void destroy() {
        HashMap<String, String> map = this.I;
        if (map != null) {
            map.clear();
        }
    }

    @Override // com.huami.mifit.sportlib.tts.a
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public List<String> j(DistanceVoiceInfo distanceVoiceInfo) {
        ArrayList arrayList = new ArrayList();
        int sportType = distanceVoiceInfo.getSportType();
        float convertDistance = distanceVoiceInfo.getConvertDistance();
        if (distanceVoiceInfo.getDistance() > 0.0f) {
            if (sportType == 6) {
                arrayList.add(this.I.get("already_walk"));
            } else if (sportType != 9) {
                arrayList.add(this.I.get("already_run"));
            } else {
                arrayList.add(this.I.get("already_cycled"));
            }
            String[] strArrSplit = String.valueOf(convertDistance).split("\\.");
            String str = strArrSplit[0];
            String str2 = strArrSplit[1];
            arrayList.addAll(m(str));
            if (!str2.equals("0")) {
                arrayList.add(this.I.get(com.google.android.exoplayer2.text.ttml.b.x0));
                arrayList.addAll(k(str2));
            }
            arrayList.add(this.I.get(distanceVoiceInfo.isMetric() ? "kilometer" : "mile"));
        }
        if (distanceVoiceInfo.getUsedTime() > 0) {
            String strValueOf = String.valueOf(distanceVoiceInfo.getUsedTime());
            arrayList.add(this.I.get("time_spent"));
            arrayList.addAll(n(strValueOf));
        }
        int paceCost = distanceVoiceInfo.getPaceCost();
        if (distanceVoiceInfo.isAuto() && convertDistance > 1.0f) {
            arrayList.add(this.I.get(distanceVoiceInfo.isMetric() ? "near_kilometer_spent" : "near_mile_spent"));
            arrayList.addAll(n(String.valueOf(paceCost)));
        }
        int hr = distanceVoiceInfo.getHr();
        if (HeartRateConstant.isHRValueValid(hr)) {
            arrayList.add(this.I.get(Constants.DATA_KEY_HR));
            arrayList.addAll(m(String.valueOf(hr)));
        }
        return arrayList;
    }

    @Override // com.huami.mifit.sportlib.tts.a
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public List<String> a() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.I.get("gps_lost"));
        return arrayList;
    }

    @Override // com.huami.mifit.sportlib.tts.a
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public List<String> c() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.I.get("gps_regained"));
        return arrayList;
    }

    @Override // com.huami.mifit.sportlib.tts.a
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public List<String> h(int i) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.I.get(Constants.DATA_KEY_HR));
        arrayList.addAll(m(String.valueOf(i)));
        return arrayList;
    }

    @Override // com.huami.mifit.sportlib.tts.a
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public List<String> e(int i) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.I.get("pace"));
        arrayList.addAll(n(String.valueOf(i)));
        return arrayList;
    }

    @Override // com.huami.mifit.sportlib.tts.a
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public List<String> b(int i) {
        ArrayList arrayList = new ArrayList();
        if (i != 1) {
            arrayList.add(this.I.get("workout_pause"));
        } else {
            arrayList.add(this.I.get("run_pause"));
        }
        return arrayList;
    }

    @Override // com.huami.mifit.sportlib.tts.a
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public List<String> f(int i) {
        ArrayList arrayList = new ArrayList();
        if (i != 1) {
            arrayList.add(this.I.get("workout_resume"));
        } else {
            arrayList.add(this.I.get("run_resume"));
        }
        return arrayList;
    }

    @Override // com.huami.mifit.sportlib.tts.a
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public List<String> i(SpeedVoiceInfo speedVoiceInfo) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.I.get("speed"));
        String[] strArrSplit = String.format(Locale.ENGLISH, "%.1f", Float.valueOf(speedVoiceInfo.speed)).split("\\.");
        if (strArrSplit.length == 2) {
            String str = strArrSplit[0];
            String str2 = strArrSplit[1];
            arrayList.addAll(m(str));
            if (Integer.parseInt(str2) > 0) {
                arrayList.add(this.I.get(com.google.android.exoplayer2.text.ttml.b.x0));
                arrayList.addAll(k(str2));
            }
        }
        if (speedVoiceInfo.isMetric) {
            arrayList.add(this.I.get("km_per_hour"));
        } else {
            arrayList.add(this.I.get("mile_per_hour"));
        }
        return arrayList;
    }

    @Override // com.huami.mifit.sportlib.tts.a
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public List<String> d() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.I.get("run_start"));
        return arrayList;
    }

    @Override // com.huami.mifit.sportlib.tts.a
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public List<String> g() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.I.get("run_stop"));
        return arrayList;
    }
}
