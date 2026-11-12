package defpackage;

import android.os.Bundle;
import androidx.media3.common.C;
import com.huawei.health.device.api.IndoorEquipManagerApi;
import com.huawei.healthcloud.plugintrack.PluginSportTrackAdapter;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwfoundationmodel.trackmodel.HeartRateData;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.ble.BleConstants;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import health.compact.a.UnitUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes10.dex */
public class iya {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f38192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f38193b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f38194c;
    private List<Map<String, Float>> d;
    private int e;
    private boolean f;
    private boolean g;
    private boolean h;
    private boolean i;
    private boolean j;
    private boolean k;
    private boolean l;
    private String m;
    private boolean n;
    private boolean o;
    private int p;
    private int q;
    private StorageParams r;
    private int s;
    private long t;
    private int u;
    private jaq x;

    private boolean g(int i) {
        return i == 258 || i == 264;
    }

    private static boolean h(int i) {
        return i == 258 || i == 264;
    }

    private float l(int i) {
        return (i * 1.0f) / 1000.0f;
    }

    public iya(int i, int i2) {
        this.q = 258;
        this.f38192a = 0;
        this.e = 1000;
        this.t = 300000L;
        this.s = 0;
        this.n = true;
        this.u = 176;
        this.f38193b = 0L;
        this.h = true;
        this.j = true;
        this.p = -1;
        this.d = null;
        this.f = true;
        this.k = true;
        this.o = true;
        this.l = true;
        this.g = true;
        LogUtil.a("Track_TrackVoiceManager", "new TrackVoiceManager");
        this.q = i;
        this.p = i2;
        this.f38194c = false;
        this.i = false;
        this.r = new StorageParams();
        this.m = Integer.toString(20002);
        this.x = new jaq(BaseApplication.getContext(), this.r, this.m);
        PluginSportTrackAdapter pluginSportTrackAdapterA = ive.c().a();
        if (pluginSportTrackAdapterA != null) {
            this.n = pluginSportTrackAdapterA.isWarningEnable();
            int warningLimitHeartRate = pluginSportTrackAdapterA.getWarningLimitHeartRate();
            this.u = warningLimitHeartRate;
            ReleaseLogUtil.d("Track_TrackVoiceManager", "TrackVoiceManager mIsWarningEnable is ", Boolean.valueOf(this.n), ", warningLimit is  ", Integer.valueOf(warningLimitHeartRate));
        }
    }

    public iya() {
        this.q = 258;
        this.f38192a = 0;
        this.e = 1000;
        this.t = 300000L;
        this.s = 0;
        this.n = true;
        this.u = 176;
        this.f38193b = 0L;
        this.h = true;
        this.j = true;
        this.p = -1;
        this.d = null;
        this.f = true;
        this.k = true;
        this.o = true;
        this.l = true;
        this.g = true;
        LogUtil.a("Track_TrackVoiceManager", "new TrackVoiceManager");
    }

    public void a(long j, int i) {
        int i2 = this.p;
        if (i2 == 3 || i2 == 4) {
            this.f38192a = 2;
            this.e = 1000;
            this.s = i / 1000;
            ReleaseLogUtil.d("Track_TrackVoiceManager", "useDefaultInterval = 1km");
            return;
        }
        if (this.q == 258) {
            this.j = false;
            this.h = false;
            if (i >= 21097) {
                this.j = true;
            }
            if (i >= 42195) {
                this.h = true;
            }
        }
        int iJ = this.x.j();
        this.f38192a = iJ;
        if (iJ == 1) {
            long millis = TimeUnit.MINUTES.toMillis(this.x.i());
            this.t = millis;
            if (millis < 300000) {
                this.t = 300000L;
            }
            this.s = (int) (j / this.t);
        } else if (iJ == 2) {
            int iF = this.x.f();
            this.e = iF;
            if (iF < 500) {
                this.e = 500;
            }
            this.s = i / this.e;
        } else {
            this.e = 1000;
            this.s = i / 1000;
        }
        l();
        ReleaseLogUtil.d("Track_TrackVoiceManager", npt.d("type = ", Integer.valueOf(this.f38192a), " distance = ", Integer.valueOf(this.e), " time = ", Long.valueOf(this.t), " mPlayCount = ", Integer.valueOf(this.s)));
    }

    public int e() {
        return this.e;
    }

    public void e(int i) {
        this.s = i;
    }

    public int b() {
        return this.f38192a;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0034  */
    /* JADX WARN: Code duplicated, block: B:20:0x005f  */
    public void j() {
        int i = this.q;
        if (i == 257) {
            d(new jbc(2, null));
        } else if (i == 265 || i == 259) {
            d(new jbc(0, null));
        } else if (i == 260) {
            d(new jbc(112, null));
        } else if (i != 273 && i != 274) {
            switch (i) {
                case 281:
                    d(new jbc(2, null));
                    break;
                case 282:
                    d(new jbc(111, null));
                    break;
                case 283:
                    LogUtil.a("Track_TrackVoiceManager", "start the work out");
                    d(new jbc(110, null));
                    break;
                default:
                    d(new jbc(1, null));
                    break;
            }
        } else {
            LogUtil.a("Track_TrackVoiceManager", "start the work out");
            d(new jbc(110, null));
        }
        i(this.q);
        ive.c().c(0);
    }

    public void a() {
        d(new jbc(3, null));
        ive.c().c(0);
    }

    public void f() {
        d(new jbc(5, null));
        ive.c().c(0);
    }

    public void o() {
        if (g(this.q)) {
            d(new jbc(16, null));
        } else {
            d(new jbc(15, null));
        }
        ive.c().c(0);
    }

    public void i() {
        d(new jbc(4, null));
        ive.c().c(0);
    }

    public void c() {
        d(new jbc(6, null));
    }

    public void d() {
        d(new jbc(19, null));
    }

    public void e(long j) {
        Bundle bundle = new Bundle();
        bundle.putString("voiceType", "marathon");
        bundle.putLong("duration", j);
        d(new jbc(13, bundle));
    }

    public void d(long j) {
        Bundle bundle = new Bundle();
        bundle.putString("voiceType", "marathon");
        bundle.putLong("duration", j);
        d(new jbc(12, bundle));
    }

    public static float c(long j) {
        LogUtil.a("Track_TrackVoiceManager", "pace", " mLastKiloTime speed=", Long.valueOf(j));
        if (j <= 0) {
            return 0.0f;
        }
        float fRound = Math.round(((1000.0f / (j * 1.0f)) * 3600.0f) * 10.0f) / 10.0f;
        LogUtil.a("Track_TrackVoiceManager", "pace", " getLastKilSpeed speed kmph=", Float.valueOf(fRound));
        return fRound;
    }

    public static boolean d(int i, long j) {
        float fC = c(j);
        if (i == 259 && fC > 30.0f) {
            return true;
        }
        if (!h(i) || fC <= 12.0f) {
            return i == 257 && fC > 7.0f;
        }
        return true;
    }

    public void d(int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("skippingNum", i);
        bundle.putString("voiceType", "skippingNum");
        d(new jbc(33, bundle));
    }

    public void a(long j, int i, long j2, int i2) {
        boolean z = true;
        if (this.f38192a == 1) {
            if (j / this.t > this.s) {
                LogUtil.j("Track_TrackVoiceManager", "playVoice duration = ", Long.valueOf(j), " distance ", Integer.valueOf(i), " heartRate ", Integer.valueOf(i2));
                long j3 = this.t;
                int i3 = (int) (j / j3);
                this.s = i3;
                Bundle bundleC = c(i, j3 * ((long) i3), -1L, false, i2);
                bundleC.putString("voiceType", "sportStateWithPace");
                d(new jbc(11, bundleC));
                return;
            }
            return;
        }
        if (i / this.e <= this.s) {
            return;
        }
        LogUtil.j("Track_TrackVoiceManager", "playVoice duration = ", Long.valueOf(j), " distance ", Integer.valueOf(i), " lastPace ", Long.valueOf(j2));
        int i4 = this.e;
        int i5 = i / i4;
        this.s = i5;
        if (i4 == 500 && i5 % 2 != 0) {
            z = false;
        }
        if (i < 1000 || !z) {
            Bundle bundleC2 = c(i4 * i5, j, -1L, false, i2);
            bundleC2.putString("voiceType", "sportStateWithPace");
            d(new jbc(11, bundleC2));
            return;
        }
        long j4 = j2;
        boolean zD = d(this.q, j4);
        if (i < 2000 && (!this.o || this.k)) {
            j4 = -1;
        }
        Bundle bundleC3 = c(i, j, j4, zD, i2);
        bundleC3.putString("voiceType", "sportStateWithPace");
        d(new jbc(9, bundleC3));
    }

    public void c(float f, int i, Map<Double, Double> map) {
        if (map == null) {
            ReleaseLogUtil.e("Track_TrackVoiceManager", "intelligentVoice error with pace time map is null ");
            return;
        }
        a(f, map);
        b(i);
        d(f, map);
        a((int) f);
    }

    private void i(int i) {
        if (this.g) {
            if (i == 258) {
                d(new jbc(21, null));
            } else {
                d(new jbc(22, null));
            }
        }
    }

    private void d(jbc jbcVar) {
        if (jaq.c() == 1 || ive.c().b() == 2) {
            jau.c().d(jbcVar);
        }
    }

    private void l() {
        this.f = c("voice_distance");
        this.k = c("voice_speed_time");
        this.o = c("voice_pace");
        this.l = c("voice_heart_rate");
        boolean zC = c("voice_intelligent");
        this.g = zC;
        LogUtil.a("Track_TrackVoiceManager", "mIsVoiceDistance = ", Boolean.valueOf(this.f), " mIsVoiceSpeedTime = ", Boolean.valueOf(this.k), " mIsVoicePace = ", Boolean.valueOf(this.o), "mIsVoiceHeartRate = ", Boolean.valueOf(this.l), " mIsVoiceEncourage = ", Boolean.valueOf(zC));
    }

    private boolean c(String str) {
        String strE = SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(20002), str);
        if (strE != null && !"".equals(strE)) {
            try {
                return Integer.parseInt(strE) == 1;
            } catch (NumberFormatException unused) {
            }
        }
        return true;
    }

    private Bundle c(int i, long j, long j2, boolean z, int i2) {
        Bundle bundle = new Bundle();
        bundle.putInt(BleConstants.SPORT_TYPE, this.q);
        if (UnitUtil.f()) {
            bundle.putFloat("distance", n(i));
        } else {
            bundle.putFloat("distance", l(i));
        }
        bundle.putLong("duration", j);
        bundle.putLong("pace", j2);
        if (z) {
            bundle.putBoolean("paceTip", d(this.q, j2));
        }
        bundle.putInt(IndoorEquipManagerApi.KEY_HEART_RATE, i2);
        bundle.putBoolean("voice_distance", this.f);
        bundle.putBoolean("voice_speed_time", this.k);
        bundle.putBoolean("voice_pace", this.o);
        bundle.putBoolean("voice_heart_rate", this.l);
        bundle.putInt("voice_play_count", this.s);
        return bundle;
    }

    private float n(int i) {
        return (float) UnitUtil.e((((double) i) * 1.0d) / 1000.0d, 3);
    }

    public void b(HeartRateData heartRateData) {
        if (!this.n || heartRateData == null || jem.f() || heartRateData.acquireTime() - this.f38193b <= C.DEFAULT_SEEK_FORWARD_INCREMENT_MS || heartRateData.acquireHeartRate() <= this.u || e(heartRateData)) {
            return;
        }
        this.f38193b = System.currentTimeMillis();
        d(new jbc(14, null));
    }

    private boolean e(HeartRateData heartRateData) {
        return System.currentTimeMillis() - heartRateData.acquireTime() > 300000;
    }

    public void a(int i) {
        if (!njy.e(this.d) && g(this.q)) {
            float fJ = j(i);
            if (fJ <= 0.0f || i < fJ) {
                return;
            }
            int size = this.d.size() - 1;
            Map<String, Float> map = this.d.get(size);
            if (map == null) {
                ReleaseLogUtil.e("Track_TrackVoiceManager", "playCountdownVoice map is null");
                return;
            }
            if (map.get("countDownDistance") == null) {
                ReleaseLogUtil.e("Track_TrackVoiceManager", "playCountdownVoice map.get(COUNTDOWN_DISTANCE) is null");
                return;
            }
            if (map.get("distance") == null) {
                ReleaseLogUtil.e("Track_TrackVoiceManager", "playCountdownVoice map.get(DISTANCE) is null");
                return;
            }
            if (map.get("intelligent") == null) {
                ReleaseLogUtil.e("Track_TrackVoiceManager", "playCountdownVoice map.get(INTELLIGENT) is null");
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("voiceType", "countdown");
            bundle.putFloat("lastValue", map.get("countDownDistance").floatValue());
            bundle.putFloat("distance", map.get("distance").floatValue());
            bundle.putInt("intelligentVoice", Math.round(map.get("intelligent").floatValue()));
            if (this.d.size() == 1) {
                jbc jbcVar = new jbc(18, bundle);
                this.d.remove(size);
                d(jbcVar);
            } else {
                jbc jbcVar2 = new jbc(17, bundle);
                this.d.remove(size);
                d(jbcVar2);
            }
        }
    }

    private boolean a(float f, Map<Double, Double> map) {
        if (this.j || f < 21097.5f) {
            return false;
        }
        this.j = true;
        if (f >= 22152.373f) {
            return false;
        }
        long jDoubleValue = map.containsKey(Double.valueOf(21.0975d)) ? (long) (map.get(Double.valueOf(21.0975d)).doubleValue() * 1000.0d) : -1L;
        ReleaseLogUtil.d("Track_TrackVoiceManager", "playMarathonFinish marathonDuration is ", Long.valueOf(jDoubleValue));
        e(jDoubleValue);
        return true;
    }

    private void d(float f, Map<Double, Double> map) {
        if (this.h || f < 42195.0f) {
            return;
        }
        this.h = true;
        if (f < 44304.746f) {
            long jDoubleValue = map.containsKey(Double.valueOf(42.195d)) ? (long) (map.get(Double.valueOf(42.195d)).doubleValue() * TimeUnit.SECONDS.toMillis(1L)) : -1L;
            ReleaseLogUtil.d("Track_TrackVoiceManager", "playMarathonFinish marathonDuration is ", Long.valueOf(jDoubleValue));
            d(jDoubleValue);
        }
    }

    public void a(int i, float f, float f2, long j, float f3) {
        if (i == 0) {
            float f4 = j;
            if (f4 >= f3) {
                this.f38194c = true;
            }
            if (f4 >= f3 / 2.0f) {
                this.i = true;
            }
        } else if (i == 1) {
            if (f >= f3) {
                this.f38194c = true;
            }
            if (f >= f3 / 2.0f) {
                this.i = true;
            }
        } else if (i == 2) {
            if (f2 >= f3) {
                this.f38194c = true;
            }
            if (f2 >= f3 / 2.0f) {
                this.i = true;
            }
        }
        LogUtil.a("Track_TrackVoiceManager", "checkGoalStatus mIsGoalFinish is ", Boolean.valueOf(this.f38194c), " ,mIsHalfGoalFinish is ", Boolean.valueOf(this.i));
    }

    public boolean c(int i) {
        return i >= 100 && !this.f38194c;
    }

    public void a(boolean z) {
        this.f38194c = z;
    }

    public void b(int i) {
        if (i < 50 || this.i) {
            return;
        }
        this.i = true;
        if (i < 55) {
            d();
        }
    }

    public void b(float f, float f2) {
        ArrayList arrayList = new ArrayList(10);
        float f3 = f / 1000.0f;
        if (f3 < 3.0f) {
            LogUtil.a("Track_TrackVoiceManager", "targetCountdownList target is less than 3km");
            return;
        }
        if (g(this.q)) {
            arrayList.add(e(0.5f, f3 - 0.5f, 0));
            for (int i = 1; i <= 3; i++) {
                float f4 = i;
                if (f4 < f3 / 2.0f) {
                    arrayList.add(e(f4, f3 - f4, i));
                }
            }
            if (f3 > 10.0f) {
                for (int i2 = 90; i2 > 50; i2 -= 10) {
                    float fRound = Math.round((1.0f - (i2 / 100.0f)) * f3);
                    if (b(fRound, arrayList)) {
                        arrayList.add(e(fRound, f3 - fRound, i2));
                    }
                }
            }
            this.d = new ArrayList(10);
            for (Map<String, Float> map : arrayList) {
                if (map != null && map.get("distance") != null && f2 / 1000.0f < map.get("distance").floatValue()) {
                    this.d.add(map);
                }
            }
            LogUtil.a("Track_TrackVoiceManager", "targetCountdownList");
        }
    }

    private Map<String, Float> e(float f, float f2, int i) {
        HashMap map = new HashMap(3);
        map.put("countDownDistance", Float.valueOf(f));
        map.put("distance", Float.valueOf(f2));
        map.put("intelligent", Float.valueOf(i));
        return map;
    }

    private boolean b(float f, List<Map<String, Float>> list) {
        if (list.size() == 0) {
            return true;
        }
        return list.get(list.size() - 1).get("countDownDistance") != null && f > list.get(list.size() - 1).get("countDownDistance").floatValue();
    }

    private float j(int i) {
        f(i);
        if (!njy.b(this.d)) {
            return -1.0f;
        }
        List<Map<String, Float>> list = this.d;
        return list.get(list.size() - 1).get("distance").floatValue() * 1000.0f;
    }

    private void f(int i) {
        if (njy.e(this.d)) {
            return;
        }
        for (int size = this.d.size() - 1; size >= 0; size--) {
            if (i > (this.d.get(size).get("distance").floatValue() * 1000.0f) + 100.0f) {
                this.d.remove(size);
            }
        }
    }

    public void e(jbc jbcVar) {
        ive.c().c(2);
        jau.c().d(jbcVar);
        ive.c().c(0);
    }

    public void h() {
        ive.c().c(2);
        jau.c().d(new jbc(24, null));
        ive.c().c(0);
    }

    public void g() {
        ive.c().c(2);
        jau.c().d(new jbc(25, null));
        ive.c().c(0);
    }
}
