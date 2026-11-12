package defpackage;

import android.content.Context;
import android.os.SystemClock;
import com.huawei.hwfoundationmodel.trackmodel.HeartRateData;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes40.dex */
public class nzd {
    private long j = 0;
    private long m = 0;
    private long n = 0;
    private long o = 0;
    private long l = 0;
    private long k = 0;
    private long t = 0;
    private long r = 0;
    private boolean d = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f43995c = false;
    private boolean h = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f43994b = false;
    private boolean f = false;
    private int i = 0;
    private int g = 0;
    private int q = 0;
    private int s = 0;
    private int e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f43993a = 0;
    private int w = 96;
    private int p = 114;

    private boolean a(int i, int i2, int i3) {
        return i == 0 && i2 == 0 && i3 == 0;
    }

    private boolean c(int i, int i2, int i3, int i4) {
        return i == 0 && i2 == 0 && i3 == 0 && i4 == 0;
    }

    public void e(int i, int i2) {
        this.j = 0L;
        this.m = 0L;
        this.n = 0L;
        this.o = 0L;
        this.l = 0L;
        this.k = 0L;
        this.t = 0L;
        this.i = 0;
        this.g = 0;
        this.q = 0;
        this.s = 0;
        this.e = 0;
        this.f43993a = 0;
        this.d = false;
        this.f43995c = false;
        this.h = false;
        this.f43994b = false;
        this.f = false;
        this.w = i;
        this.p = i2;
        LogUtil.a("IDEQ_ScienceGuideVoiceHelper", "init success");
    }

    public void b(float f, int i, gzv gzvVar, Context context) {
        if (c(context)) {
            float f2 = f / 100.0f;
            int iD = d(i, f2);
            if (iD != -1) {
                LogUtil.a("IDEQ_ScienceGuideVoiceHelper", "speakSteprateTips ", Integer.valueOf(iD));
                ive.c().b(17, iD);
            }
            a(gzvVar, i, f2);
        }
    }

    public void a(float f, int i, gzv gzvVar, ArrayList<HeartRateData> arrayList, Context context) {
        if (arrayList == null) {
            LogUtil.a("IDEQ_ScienceGuideVoiceHelper", "speakGuideVoice input null");
            return;
        }
        if (c(context)) {
            float f2 = f / 100.0f;
            int iE = e(arrayList);
            if (iE != -1) {
                LogUtil.a("IDEQ_ScienceGuideVoiceHelper", "speakWarmupTips ", Integer.valueOf(iE));
                ive.c().c(21, iE, this.w, this.p);
            }
            int iD = d(i, f2);
            if (iD != -1) {
                LogUtil.a("IDEQ_ScienceGuideVoiceHelper", "speakSteprateTips ", Integer.valueOf(iD));
                ive.c().b(17, iD);
            }
            a(gzvVar, i, f2);
        }
    }

    private boolean c(Context context) {
        if (!nzc.e(context)) {
            LogUtil.a("IDEQ_ScienceGuideVoiceHelper", "speakGuideVoice is not real chinese mainland");
            return false;
        }
        if (jaq.a()) {
            return true;
        }
        LogUtil.a("IDEQ_ScienceGuideVoiceHelper", "speakGuideVoice voice switch off");
        return false;
    }

    private void a(gzv gzvVar, int i, float f) {
        if (gzvVar == null) {
            LogUtil.a("IDEQ_ScienceGuideVoiceHelper", "runningPosture is null");
            return;
        }
        int iD = d(gzvVar, f, i);
        if (iD != -1) {
            LogUtil.a("IDEQ_ScienceGuideVoiceHelper", "speakImpactTips ", Integer.valueOf(iD));
            ive.c().b(11, iD);
        }
        int iB = b(gzvVar, f);
        if (iB != -1) {
            if (iB == 10) {
                LogUtil.a("IDEQ_ScienceGuideVoiceHelper", "speakCommonAbnormal");
                ive.c().b(iB, 0);
            } else {
                LogUtil.a("IDEQ_ScienceGuideVoiceHelper", "speakCommonNormal");
                ive.c().b(24, iB);
            }
        }
    }

    private int d(gzv gzvVar, float f, int i) {
        if (gzvVar == null) {
            return -1;
        }
        int iA = a(gzvVar, f);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (iA == 0) {
            int i2 = this.i + 1;
            this.i = i2;
            this.g = 0;
            if (this.d) {
                if (i2 == 15 && jElapsedRealtime - this.o >= 60000) {
                    this.o = jElapsedRealtime;
                    return 16;
                }
            } else if (i2 == 30) {
                return 12;
            }
        } else if (iA == 2) {
            this.i = 0;
            this.f43993a = 0;
            int i3 = this.g + 1;
            this.g = i3;
            if (i3 >= 10) {
                this.d = true;
                if (jElapsedRealtime - this.n >= 60000) {
                    this.n = jElapsedRealtime;
                    return i > 170 ? 14 : 13;
                }
            }
        } else {
            LogUtil.d("IDEQ_ScienceGuideVoiceHelper", "detectVoiceForImpact, result:", Integer.valueOf(iA));
        }
        return -1;
    }

    private int a(gzv gzvVar, float f) {
        return nzc.b("ground impact", gzvVar.d(), f);
    }

    private int b(gzv gzvVar, float f) {
        if (gzvVar == null) {
            return -1;
        }
        int iD = d(gzvVar, f);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean z = false;
        if (iD == 0) {
            this.e = 0;
            int i = this.f43993a + 1;
            this.f43993a = i;
            if (i >= 30 && jElapsedRealtime - this.m >= 60000) {
                this.m = jElapsedRealtime;
                boolean z2 = this.f;
                this.f = !z2;
                return !z2 ? 25 : 26;
            }
        } else if (iD == 2) {
            int i2 = this.e + 1;
            this.e = i2;
            this.f43993a = 0;
            if (jElapsedRealtime - this.k >= 10000 && jElapsedRealtime - this.l >= 10000 && jElapsedRealtime - this.n >= 10000) {
                z = true;
            }
            if (i2 >= 10 && z && jElapsedRealtime - this.j >= 60000) {
                this.j = jElapsedRealtime;
                return 10;
            }
        } else if (iD == 3) {
            this.e = 0;
        } else {
            LogUtil.d("IDEQ_ScienceGuideVoiceHelper", "detectVoiceForOtherPosture, result:", Integer.valueOf(iD));
        }
        return -1;
    }

    private int d(gzv gzvVar, float f) {
        int iB = nzc.b("eversion angle", gzvVar.b(), f);
        int iB2 = nzc.b("swing angle", gzvVar.j(), f);
        int iB3 = nzc.b("touch time", gzvVar.a(), f);
        int iB4 = nzc.b("ground impact", gzvVar.d(), f);
        boolean z = true;
        boolean z2 = iB == 2 || iB == 1;
        boolean z3 = iB2 == 2 || iB2 == 1;
        if (iB3 != 2 && iB3 != 1) {
            z = false;
        }
        if (c(iB, iB2, iB3, iB4)) {
            return 0;
        }
        if (a(iB, iB2, iB3)) {
            return 3;
        }
        return (z2 || z3 || z) ? 2 : -1;
    }

    private int e(ArrayList<HeartRateData> arrayList) {
        if (arrayList == null) {
            return -1;
        }
        if (!this.f43995c && a(arrayList)) {
            this.f43995c = true;
            this.r = SystemClock.elapsedRealtime();
            return 22;
        }
        if (!this.h && this.f43995c && SystemClock.elapsedRealtime() - this.r < 300000 && d(arrayList)) {
            this.h = true;
            return 23;
        }
        if (this.h || !this.f43995c || SystemClock.elapsedRealtime() - this.r < 300000) {
            return -1;
        }
        this.h = true;
        return -1;
    }

    private boolean a(ArrayList<HeartRateData> arrayList) {
        if (arrayList.size() >= 3 && d(arrayList.get(0), arrayList.get(1), arrayList.get(2))) {
            return true;
        }
        LogUtil.a("IDEQ_ScienceGuideVoiceHelper", "needToSpeakWarmUp, false");
        return false;
    }

    private boolean d(HeartRateData heartRateData, HeartRateData heartRateData2, HeartRateData heartRateData3) {
        if (heartRateData != null && heartRateData2 != null && heartRateData3 != null) {
            boolean z = heartRateData.acquireHeartRate() > 0 && heartRateData.acquireHeartRate() < 220;
            boolean z2 = heartRateData2.acquireHeartRate() > 0 && heartRateData2.acquireHeartRate() < 220;
            boolean z3 = heartRateData3.acquireHeartRate() > 0 && heartRateData3.acquireHeartRate() < 220;
            if (z && z2 && z3 && ((heartRateData.acquireHeartRate() + heartRateData2.acquireHeartRate()) + heartRateData3.acquireHeartRate()) / 3.0f < this.w) {
                LogUtil.a("IDEQ_ScienceGuideVoiceHelper", "needToSpeakWarmUp, true");
                return true;
            }
        }
        return false;
    }

    private boolean d(ArrayList<HeartRateData> arrayList) {
        int size = arrayList.size();
        if (size >= 3) {
            HeartRateData heartRateData = arrayList.get(size - 1);
            HeartRateData heartRateData2 = arrayList.get(size - 2);
            HeartRateData heartRateData3 = arrayList.get(size - 3);
            if (heartRateData != null && heartRateData2 != null && heartRateData3 != null) {
                boolean z = heartRateData.acquireHeartRate() > this.p && heartRateData.acquireHeartRate() < 220;
                boolean z2 = heartRateData2.acquireHeartRate() > this.p && heartRateData2.acquireHeartRate() < 220;
                boolean z3 = heartRateData3.acquireHeartRate() > this.p && heartRateData3.acquireHeartRate() < 220;
                if (z && z2 && z3) {
                    LogUtil.a("IDEQ_ScienceGuideVoiceHelper", "exceedWarmUpRange, true");
                    return true;
                }
            }
        }
        LogUtil.a("IDEQ_ScienceGuideVoiceHelper", "exceedWarmUpRange, false");
        return false;
    }

    private int d(int i, float f) {
        int iB = b(i, f);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (iB == 0) {
            int i2 = this.q + 1;
            this.q = i2;
            this.s = 0;
            if (!this.f43994b) {
                return i2 == 30 ? 18 : -1;
            }
            if (i2 != 10 || jElapsedRealtime - this.t < 60000) {
                return -1;
            }
            this.t = jElapsedRealtime;
            return 18;
        }
        if (iB != 1) {
            if (iB == 2) {
                this.q = 0;
                this.s = 0;
                this.f43994b = true;
                if (jElapsedRealtime - this.l < 60000) {
                    return -1;
                }
                this.l = jElapsedRealtime;
                return 20;
            }
            LogUtil.d("IDEQ_ScienceGuideVoiceHelper", "detectVoiceForStepRate, result:", Integer.valueOf(iB));
            return -1;
        }
        this.q = 0;
        int i3 = this.s + 1;
        this.s = i3;
        if (i3 < 10) {
            return -1;
        }
        this.f43994b = true;
        if (jElapsedRealtime - this.k < 60000) {
            return -1;
        }
        this.k = jElapsedRealtime;
        return 19;
    }

    private int b(int i, float f) {
        return nzc.b("step frequency", i, f);
    }
}
