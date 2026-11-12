package defpackage;

import android.os.Bundle;
import com.huawei.health.device.api.IndoorEquipManagerApi;
import com.huawei.health.sport.model.WorkoutRecord;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.ble.BleConstants;
import java.io.Serializable;

/* JADX INFO: loaded from: classes10.dex */
public class jbc implements Serializable {
    private static final long serialVersionUID = 8138097492060215279L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f38333a;
    private float aa;
    private int ab;
    private int ac;
    private float ad;
    private int ae;
    private int af;
    private float ag;
    private int ah;
    private int ai;
    private int aj;
    private int ak;
    private int al;
    private long am;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f38334b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f38335c;
    private int d;
    private String[] e;
    private int f;
    private int g;
    private boolean h;
    private boolean i;
    private boolean j;
    private boolean k;
    private boolean l;
    private boolean m;
    private boolean n;
    private boolean o;
    private boolean p;
    private boolean q;
    private boolean r;
    private boolean s;
    private boolean t;
    private boolean u;
    private float v;
    private long w;
    private boolean x;
    private boolean y;
    private int z;

    public jbc(int i, Bundle bundle) {
        this.ah = i;
        if (bundle == null) {
            LogUtil.j("Track_SportStateVoiceParameter", "playContent is null");
            return;
        }
        String string = bundle.getString("voiceType", "invalid");
        if ("invalid".equals(string)) {
            LogUtil.a("Track_SportStateVoiceParameter", "there is no bundle param");
        } else {
            b(bundle, string);
        }
    }

    private void b(Bundle bundle, String str) {
        byte b2;
        str.hashCode();
        switch (str) {
            case "duration":
                b2 = 0;
                break;
            case "pace":
                b2 = 1;
                break;
            case "speed":
                b2 = 2;
                break;
            case "heartRate":
                b2 = 3;
                break;
            case "distance":
                b2 = 4;
                break;
            default:
                b2 = -1;
                break;
        }
        if (b2 == 0) {
            this.ai = bundle.getInt(BleConstants.SPORT_TYPE);
            this.am = bundle.getLong(str);
            if (bundle.getInt(WorkoutRecord.Extend.COURSE_TARGET_TYPE, -1) == 0) {
                c(bundle);
            }
            this.q = true;
            return;
        }
        if (b2 == 1) {
            this.ai = bundle.getInt(BleConstants.SPORT_TYPE);
            this.w = bundle.getLong(str);
            this.k = bundle.getBoolean("paceTip");
            this.u = true;
            return;
        }
        if (b2 == 2) {
            this.ai = bundle.getInt(BleConstants.SPORT_TYPE);
            this.ag = bundle.getFloat(str);
            this.k = bundle.getBoolean("paceTip");
            this.x = true;
            return;
        }
        if (b2 == 3) {
            this.ai = bundle.getInt(BleConstants.SPORT_TYPE);
            this.f38333a = bundle.getInt(str);
            this.s = true;
        } else {
            if (b2 != 4) {
                c(bundle, str);
                return;
            }
            this.ai = bundle.getInt(BleConstants.SPORT_TYPE);
            this.f38335c = bundle.getFloat(str);
            if (bundle.getInt(WorkoutRecord.Extend.COURSE_TARGET_TYPE, -1) == 1) {
                c(bundle);
            }
            this.t = true;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:41:0x0079  */
    private void c(Bundle bundle, String str) {
        str.hashCode();
        switch (str) {
            case "impactTips":
                this.h = true;
                this.f = bundle.getInt("treadmillEvent");
                break;
            case "connectSuccess":
                this.i = true;
                break;
            case "sportState":
                this.ai = bundle.getInt(BleConstants.SPORT_TYPE);
                e(bundle);
                this.f38334b = bundle.getInt("calorie");
                this.p = true;
                if (jem.f()) {
                    try {
                        this.e = bundle.getStringArray("beforeSportFirstVoicePath");
                    } catch (ArrayIndexOutOfBoundsException e) {
                        LogUtil.e("Track_SportStateVoiceParameter", "SportStateVoiceParameter ", e.getMessage());
                        return;
                    }
                    break;
                }
                break;
            case "startRun_others":
                this.l = true;
                break;
            case "warmUpTips":
                this.y = true;
                this.aj = bundle.getInt("treadmillEvent");
                this.ak = bundle.getInt("warmUpHeartRateLow");
                this.al = bundle.getInt("warmUpHeartRateHeight");
                break;
            case "stepRateTips":
                this.n = true;
                this.af = bundle.getInt("treadmillEvent");
                break;
            case "startRun":
                this.o = true;
                break;
            case "sportStateWithoutCalorie":
                e(bundle);
                break;
            case "commonAbnormal":
                this.m = true;
                break;
            default:
                e(bundle, str);
                break;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:33:0x005d  */
    private void e(Bundle bundle, String str) {
        str.hashCode();
        switch (str) {
            case "sportSmartCoach":
                this.ad = bundle.getFloat("sectionLower");
                this.aa = bundle.getFloat("sectionUpper");
                this.ab = bundle.getInt("sportDuration");
                try {
                    this.e = bundle.getStringArray("beforeSportFirstVoicePath");
                    break;
                } catch (ArrayIndexOutOfBoundsException e) {
                    LogUtil.e("Track_SportStateVoiceParameter", "SportStateVoiceParameter ", e.getMessage());
                    return;
                }
                break;
            case "sportStateWithPace":
                a(bundle);
                break;
            case "intelligentVoice":
                this.g = bundle.getInt("intelligentVoice");
                break;
            case "commonNormal":
                this.j = true;
                this.d = bundle.getInt("treadmillEvent");
                break;
            case "marathon":
                this.am = bundle.getLong("duration");
                break;
            case "skippingNum":
                this.z = bundle.getInt("skippingNum");
                break;
            case "countdown":
                this.v = bundle.getFloat("lastValue");
                this.f38335c = bundle.getFloat("distance");
                this.g = bundle.getInt("intelligentVoice");
                break;
        }
    }

    private void e(Bundle bundle) {
        if (bundle != null) {
            this.f38335c = bundle.getFloat("distance");
            this.am = bundle.getLong("duration");
            this.ag = bundle.getFloat("speed");
            this.f38333a = bundle.getInt(IndoorEquipManagerApi.KEY_HEART_RATE);
            this.t = true;
            this.q = true;
            this.x = true;
            this.s = true;
        }
    }

    public int aa() {
        return this.ah;
    }

    public int ae() {
        return this.ak;
    }

    public int ad() {
        return this.al;
    }

    public int w() {
        return this.f;
    }

    public int u() {
        return this.d;
    }

    public int ac() {
        return this.af;
    }

    public int z() {
        return this.aj;
    }

    public boolean ag() {
        return this.i;
    }

    public boolean ak() {
        return this.o;
    }

    public boolean am() {
        return this.l;
    }

    public boolean af() {
        return this.m;
    }

    public boolean ah() {
        return this.j;
    }

    public boolean ai() {
        return this.h;
    }

    public boolean aj() {
        return this.n;
    }

    public boolean an() {
        return this.y;
    }

    public boolean s() {
        return this.t;
    }

    public boolean p() {
        return this.q;
    }

    public boolean v() {
        return this.u;
    }

    public boolean t() {
        return this.s;
    }

    public boolean x() {
        return this.x;
    }

    public int k() {
        return this.ai;
    }

    public float b() {
        return this.f38335c;
    }

    public long r() {
        return this.am;
    }

    public int e() {
        return this.f38333a;
    }

    public long g() {
        return this.w;
    }

    public float c() {
        return this.ag;
    }

    public boolean j() {
        return this.k;
    }

    public int y() {
        return this.f38334b;
    }

    public int i() {
        return this.z;
    }

    public boolean q() {
        return this.p;
    }

    public float f() {
        return this.v;
    }

    public boolean o() {
        return this.r;
    }

    public int l() {
        return this.ae;
    }

    public int a() {
        return this.g;
    }

    public String[] d() {
        String[] strArr = this.e;
        if (strArr != null) {
            return (String[]) strArr.clone();
        }
        return null;
    }

    public float h() {
        return this.ad;
    }

    public float m() {
        return this.aa;
    }

    public int n() {
        return this.ab;
    }

    public int ab() {
        return this.ac;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(16);
        sb.append("SportStateVoiceParameter [mSportType=");
        sb.append(this.ai);
        sb.append(", mCurrentDistance=");
        sb.append(this.f38335c);
        sb.append(", mTotalDuration=");
        sb.append(this.am);
        sb.append(", mLastPace=");
        sb.append(this.w);
        sb.append(", mSpeed=");
        sb.append(this.ag);
        sb.append(", mIsPaceTip=");
        sb.append(this.k);
        sb.append(", mIsVoiceDistance=");
        sb.append(this.t);
        sb.append(", mIsVoiceDuration=");
        sb.append(this.q);
        sb.append(", mIsVoicePace=");
        sb.append(this.u);
        sb.append(", mVoiceHR=");
        sb.append(this.s);
        sb.append(", mIsVoiceSpeed=");
        sb.append(this.x);
        sb.append("]");
        return sb.toString();
    }

    private void c(Bundle bundle) {
        if (bundle != null) {
            this.v = bundle.getFloat("lastValue");
            this.r = bundle.getBoolean("targetTip");
            this.ae = bundle.getInt("targetProgress");
        }
    }

    private void a(Bundle bundle) {
        if (bundle != null) {
            this.ai = bundle.getInt(BleConstants.SPORT_TYPE, 0);
            this.f38335c = bundle.getFloat("distance", 0.0f);
            this.am = bundle.getLong("duration", 0L);
            this.f38333a = bundle.getInt(IndoorEquipManagerApi.KEY_HEART_RATE, -1);
            this.f38334b = bundle.getInt("calorie", 0);
            this.w = bundle.getLong("pace", 0L);
            this.k = bundle.getBoolean("paceTip", false);
            this.t = bundle.getBoolean("voice_distance", true);
            this.q = bundle.getBoolean("voice_speed_time", true);
            this.u = bundle.getBoolean("voice_pace", true);
            this.s = bundle.getBoolean("voice_heart_rate", true);
            this.ac = bundle.getInt("voice_play_count");
        }
    }
}
