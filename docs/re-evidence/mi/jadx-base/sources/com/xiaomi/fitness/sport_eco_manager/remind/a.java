package com.xiaomi.fitness.sport_eco_manager.remind;

import android.annotation.SuppressLint;
import android.media.SoundPool;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.sport_eco_manager.utils.SportManagerPreference;
import com.xiaomi.fitness.sport_eco_manager_export.RemindExt;
import com.xiaomi.fitness.sport_eco_manager_export.data.PhoneSportData;
import com.xiaomi.fitness.sport_eco_manager_export.data.SportData;
import com.xiaomi.fitness.sport_eco_manager_export.listener.ISportDataChangedListener;
import com.xiaomi.fitness.sport_eco_manager_export.listener.ISportStateChangedListener;
import com.xiaomi.fitness.sport_eco_manager_export.utils.SportManagerExportPreference;
import defpackage.bg4;
import defpackage.den;
import defpackage.g2o;
import defpackage.j5h;
import defpackage.jz6;
import defpackage.llo;
import defpackage.mcn;
import defpackage.o4h;
import defpackage.ofl;
import defpackage.rvn;
import defpackage.tyi;
import defpackage.ua1;
import defpackage.v4h;
import defpackage.y7r;
import defpackage.z5h;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes10.dex */
public class a implements ISportStateChangedListener, ISportDataChangedListener {
    public static volatile a g0;
    public jz6 A;
    public jz6 B;
    public jz6 C;
    public jz6 D;
    public int E;
    public int G;
    public long H;
    public int I;
    public boolean J;
    public jz6 K;
    public int N;
    public SoundPool P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public int Z;
    public int a0;
    public GoalRemind b0;
    public int c0;
    public jz6 d0;
    public boolean n;
    public int t;
    public String u;
    public long v;
    public mcn w;
    public int x;
    public int y;
    public jz6 z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f13147a = 60;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f13148b = 200;
    public int c = 30;
    public int d = 12;
    public int e = 55;
    public int f = 12;
    public int g = 55;
    public int h = 5;
    public int i = 30;
    public int j = 15;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f13149k = 60;
    public int l = 15;
    public int m = 5;
    public int o = 0;
    public int p = 1;
    public int q = 2;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f13150r = 3;
    public int s = 4;
    public boolean L = !AppUtil.INSTANCE.isPlayChannel();
    public int M = -1;
    public int O = 0;
    public boolean V = true;
    public boolean W = false;
    public boolean X = false;
    public int Y = 0;
    public boolean e0 = false;
    public float f0 = 0.0f;
    public rvn F = rvn.Y(AppUtil.getApp());

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport_eco_manager.remind.a$a, reason: collision with other inner class name */
    public class C0790a implements z5h<Integer> {
        public C0790a() {
        }

        @Override // defpackage.z5h
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onNext(Integer num) {
            a.this.w = new mcn();
        }

        @Override // defpackage.z5h
        public void onComplete() {
            a.this.N();
            jz6 jz6Var = a.this.d0;
            if (jz6Var != null) {
                jz6Var.dispose();
            }
        }

        @Override // defpackage.z5h
        public void onError(Throwable th) {
            FitnessLogUtils.i("EcoSportRemind", th.toString());
        }

        @Override // defpackage.z5h
        public void onSubscribe(jz6 jz6Var) {
            a.this.d0 = jz6Var;
        }
    }

    private void E(int i, int i2, int i3) {
        if (i != 1) {
            if (i == 2) {
                this.F.i1(i2, i3);
                return;
            } else if (i != 3) {
                if (i == 6 || i == 7) {
                    this.F.Q0(i2, i3);
                    return;
                }
                return;
            }
        }
        this.F.U0(i2, i3);
    }

    private void G() {
        int i;
        int i2;
        int i3;
        if (u()) {
            mcn mcnVar = this.w;
            if (mcnVar.n && this.J) {
                String str = mcnVar.l;
                if (llo.a(str)) {
                    return;
                }
                String[] strArrSplit = str.split(",");
                int i4 = Integer.parseInt(strArrSplit[1]);
                int i5 = Integer.parseInt(strArrSplit[0]);
                int i6 = Integer.parseInt(strArrSplit[2]);
                int i7 = this.y;
                if ((i7 < i5 || i7 > i4) && (i = this.j) >= 0) {
                    this.j = i - 1;
                    this.W = false;
                    this.X = true;
                    this.l = 0;
                }
                if (i7 > i5 && i7 < i4) {
                    this.j = 15;
                    this.f13149k = 60;
                    if (this.l <= 0) {
                        this.l = 15;
                    }
                    this.W = true;
                }
                int i8 = this.j;
                if (i8 <= 0) {
                    if (i8 == 0) {
                        J("15s 心率超标");
                        den denVarC = g2o.s().C();
                        if (denVarC != null && (i3 = this.y) > i4) {
                            denVarC.sportNotifyHr(i3);
                        }
                        j(this.y, i4, i5);
                    }
                    this.f13149k--;
                }
                if (this.f13149k <= 0) {
                    J("60s 心率超标");
                    j(this.y, i4, i5);
                    den denVarC2 = g2o.s().C();
                    if (denVarC2 != null && (i2 = this.y) > i4) {
                        denVarC2.sportNotifyHr(i2);
                    }
                    this.f13149k = 60;
                }
                i(i6);
            }
        }
    }

    private void I() {
        int i;
        if (u()) {
            mcn mcnVar = this.w;
            if (mcnVar.c && this.J) {
                int i2 = mcnVar.d;
                if (i2 == 0) {
                    i2 = this.E;
                }
                float f = i2;
                int i3 = this.y;
                if (i3 > f && (i = this.h) >= 0) {
                    this.h = i - 1;
                }
                if (i3 <= f) {
                    this.h = 5;
                    this.i = 30;
                }
                int i4 = this.h;
                if (i4 <= 0) {
                    if (i4 == 0) {
                        FitnessLogUtils.i("EcoSportRemind", "5S , max hr remind:" + this.y);
                        this.F.U((int) f);
                        den denVarC = g2o.s().C();
                        if (denVarC != null) {
                            denVarC.sportNotifyHr(this.y);
                        }
                    }
                    this.i--;
                }
                if (this.i <= 0) {
                    FitnessLogUtils.i("EcoSportRemind", "30S , max hr remind:" + this.y);
                    this.F.U((int) f);
                    den denVarC2 = g2o.s().C();
                    if (denVarC2 != null) {
                        denVarC2.sportNotifyHr(this.y);
                    }
                    this.i = 30;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N() {
        if (SportManagerExportPreference.INSTANCE.getKEY_GYM_IS_SUPPORT_REMIND()) {
            Q();
            if (this.w == null) {
                return;
            }
            SportRequest.INSTANCE.requestBasetRecordFromService(this.I, new SportRequest.OnSportMaxRecord() { // from class: lun
                @Override // com.xiaomi.fitness.sport_eco_manager.remind.SportRequest.OnSportMaxRecord
                public final void onRecord(int i, int i2) {
                    this.f25448a.y(i, i2);
                }
            });
            int i = this.I;
            boolean z = true;
            if (i != 1 && i != 3 && i != 14) {
                z = false;
            }
            mcn mcnVar = this.w;
            if (!mcnVar.i || mcnVar.j == 0 || !z) {
                jz6 jz6Var = this.K;
                if (jz6Var != null) {
                    jz6Var.dispose();
                    this.K = null;
                    return;
                }
                return;
            }
            SoundPool soundPool = this.P;
            if (soundPool == null) {
                SoundPool soundPool2 = new SoundPool(10, 3, 0);
                this.P = soundPool2;
                this.Q = soundPool2.load(AppUtil.getApp(), tyi.f35187a, 0);
            } else {
                soundPool.stop(this.Q);
                this.Q = this.P.load(AppUtil.getApp(), tyi.f35187a, 0);
            }
            if (this.K == null) {
                this.K = o4h.B(60000 / this.w.j, TimeUnit.MILLISECONDS, ua1.c()).N(new bg4() { // from class: mun
                    @Override // defpackage.bg4
                    public final void accept(Object obj) throws Exception {
                        this.f27226a.z((Long) obj);
                    }
                });
            }
        }
    }

    private void Q() {
        jz6 jz6Var = this.K;
        if (jz6Var != null && !jz6Var.isDisposed()) {
            this.K.dispose();
            this.K = null;
        }
        if (this.P != null) {
            this.P = null;
        }
    }

    private boolean h(int i) {
        FitnessLogUtils.i("EcoSportRemind", "have remind total km:" + this.x + ", curTotalKm:" + i);
        int i2 = this.x;
        if (i <= i2) {
            return true;
        }
        if (i - i2 <= 1) {
            return false;
        }
        this.x = i;
        return true;
    }

    private void i(int i) {
        if (this.X && this.W) {
            int i2 = this.l;
            if (i2 > 0) {
                this.l = i2 - 1;
            }
            if (this.l <= 0) {
                this.X = false;
                this.F.e0(this.y, m(i));
            }
        }
    }

    private void j(int i, int i2, int i3) {
        if (i > i2) {
            this.F.S(i2);
        } else if (i < i3) {
            this.F.T(i3);
        }
    }

    private String m(int i) {
        if (i == 1) {
            this.u = "warm_up";
        } else if (i == 2) {
            this.t = this.p;
            this.u = "at_burn";
        } else if (i == 3) {
            this.t = this.q;
            this.u = "aerobic";
        } else if (i == 4) {
            this.t = this.f13150r;
            this.u = "anaerobic";
        } else if (i != 5) {
            this.t = this.q;
            this.u = "aerobic";
        } else {
            this.t = this.s;
            this.u = "limit";
        }
        return this.u;
    }

    public static a n() {
        if (g0 == null) {
            synchronized (a.class) {
                try {
                    if (g0 == null) {
                        g0 = new a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return g0;
    }

    private void o(final int i) {
        o4h.f(new j5h() { // from class: jun
            @Override // defpackage.j5h
            public final void subscribe(v4h v4hVar) throws Exception {
                this.f23154a.x(i, v4hVar);
            }
        }).S(ofl.c()).H(ua1.c()).a(new C0790a());
    }

    private boolean q() {
        long jCurrentTimeMillis = System.currentTimeMillis() - this.v;
        this.v = System.currentTimeMillis();
        return jCurrentTimeMillis > 600;
    }

    private boolean r() {
        mcn mcnVar = this.w;
        return mcnVar != null && mcnVar.h;
    }

    private boolean s() {
        int i = this.I;
        if (i == 1 || i == 2 || i == 3 || i == 6 || i == 7) {
            return true;
        }
        if (i != 14) {
            return false;
        }
        return SportManagerExportPreference.INSTANCE.getKEY_GYM_IS_JUMPING();
    }

    private boolean t() {
        return true;
    }

    private boolean u() {
        mcn mcnVar = this.w;
        return mcnVar != null && mcnVar.m && this.L && RemindExt.INSTANCE.isSupportRemind() && s() && !v() && SportManagerExportPreference.INSTANCE.getKEY_GYM_IS_SUPPORT_REMIND();
    }

    private boolean v() {
        int iN = g2o.s().n();
        return iN == 4 || iN == 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w(boolean z, Long l) throws Exception {
        if (this.G <= 0) {
            if (z) {
                this.F.c1();
                this.D.dispose();
                return;
            }
            return;
        }
        FitnessLogUtils.i("EcoSportRemind", "count:" + this.G);
        rvn rvnVarY = rvn.Y(AppUtil.getApp());
        int i = this.G;
        this.G = i + (-1);
        rvnVarY.L(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void x(int i, v4h v4hVar) throws Exception {
        mcn mcnVarP = p(i);
        FitnessLogUtils.d("EcoSportRemind", "sport remind db : " + mcnVarP);
        if (mcnVarP == null) {
            v4hVar.onNext(1);
        } else {
            this.w = mcnVarP;
        }
        if (AppUtil.INSTANCE.isPlayChannel()) {
            mcn mcnVar = new mcn();
            mcnVar.i = i == 14 ? false : this.w.i;
            mcn mcnVar2 = this.w;
            mcnVar.j = mcnVar2.j;
            mcnVar.h = false;
            mcnVar.f26019b = mcnVar2.f26019b;
            this.w = mcnVar;
        }
        v4hVar.onComplete();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void y(int i, int i2) {
        FitnessLogUtils.i("EcoSportRemind", "mMaxDuration:" + this.Z + ", maxDistance:" + i);
        this.Z = i2;
        this.a0 = i;
    }

    public void A(int i, int i2, int i3) {
        this.M = i;
        this.N = i2;
        this.O = i3;
    }

    public void B(int i) {
        if (this.w != null && this.J) {
            this.y = i;
            if (i > 0) {
                I();
                G();
            }
        }
    }

    public final void C(PhoneSportData phoneSportData) {
        int i;
        int i2 = this.w.q;
        FitnessLogUtils.i("EcoSportRemind", "countingInterval : " + i2 + "; jumpCount : " + phoneSportData.jumpCount + "; lastJumpCount : " + this.T);
        if (i2 <= 0 || (i = phoneSportData.jumpCount) >= 10000 || i - this.T < i2) {
            return;
        }
        int i3 = (i / 10) * 10;
        if (i3 % i2 == 0) {
            this.T = i3;
            this.F.P0(i, 0);
        }
    }

    public final void D(PhoneSportData phoneSportData) {
        int i = this.w.f26021r;
        FitnessLogUtils.i("EcoSportRemind", "reportingInterval : " + i + "; jumpDuration : " + phoneSportData.jumpDuration + "; lastJumpDuration : " + this.U);
        if (i > 0) {
            int i2 = phoneSportData.jumpDuration;
            int i3 = i2 / 60;
            if (i3 - this.U < i || i2 % 60 != 0) {
                return;
            }
            this.U = i3;
            this.F.P0(0, i2);
        }
    }

    public void F(SportData sportData) {
        this.x = sportData.distance / 1000;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:41:0x00df  */
    public final void H(PhoneSportData phoneSportData) {
        int i;
        int i2;
        int i3;
        if (u() && r() && this.J && (i = phoneSportData.distance / 1000) > this.x) {
            long j = phoneSportData.duration;
            if (h(i)) {
                return;
            }
            this.x = i;
            SportManagerPreference sportManagerPreference = SportManagerPreference.INSTANCE;
            long pre_sport_duration_insec = j - sportManagerPreference.getPRE_SPORT_DURATION_INSEC();
            int i4 = this.I;
            if (i4 == 1) {
                i2 = this.x;
                if (i2 == 1) {
                    this.F.W0(i2, (int) (j / 60), (int) (j % 60));
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("播报 : ");
                    int i5 = (int) (j / 60);
                    sb.append(i5);
                    sb.append(", ");
                    int i6 = (int) (j % 60);
                    sb.append(i6);
                    sb.append(",");
                    int i7 = (int) (pre_sport_duration_insec / 60);
                    sb.append(i7);
                    sb.append(",");
                    int i8 = (int) (pre_sport_duration_insec % 60);
                    sb.append(i8);
                    FitnessLogUtils.i("EcoSportRemind", sb.toString());
                    this.F.V0(this.x, i5, i6, i7, i8);
                }
            } else if (i4 == 2) {
                int i9 = this.x;
                if (i9 == 1) {
                    this.F.k1(i9, (int) (j / 60), (int) (j % 60));
                } else {
                    this.F.j1(i9, (int) (j / 60), (int) (j % 60), (int) (pre_sport_duration_insec / 60), (int) (pre_sport_duration_insec % 60));
                }
            } else if (i4 == 3) {
                i2 = this.x;
                if (i2 == 1) {
                    this.F.W0(i2, (int) (j / 60), (int) (j % 60));
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("播报 : ");
                    int i10 = (int) (j / 60);
                    sb2.append(i10);
                    sb2.append(", ");
                    int i11 = (int) (j % 60);
                    sb2.append(i11);
                    sb2.append(",");
                    int i12 = (int) (pre_sport_duration_insec / 60);
                    sb2.append(i12);
                    sb2.append(",");
                    int i13 = (int) (pre_sport_duration_insec % 60);
                    sb2.append(i13);
                    FitnessLogUtils.i("EcoSportRemind", sb2.toString());
                    this.F.V0(this.x, i10, i11, i12, i13);
                }
            } else if (i4 == 6 || i4 == 7) {
                int i14 = this.x;
                if (i14 == 1) {
                    this.F.S0(i14, (int) (j / 60), (int) (j % 60));
                } else {
                    float f = pre_sport_duration_insec / 3600.0f;
                    float f2 = 0.0f;
                    if (f != 0.0f) {
                        f2 = 1.0f / f;
                        i3 = (int) ((f2 - ((int) f2)) * 100.0f);
                    } else {
                        i3 = 0;
                    }
                    this.F.R0(i14, (int) (j / 60), (int) (j % 60), (int) f2, i3);
                    FitnessLogUtils.i("EcoSportRemind", f2 + "--" + i3 + "--" + pre_sport_duration_insec + "---" + f);
                }
            }
            den denVarC = g2o.s().C();
            if (denVarC != null) {
                denVarC.b(this.x * 1000, (int) j, (int) pre_sport_duration_insec);
            }
            FitnessLogUtils.d("EcoSportRemind", "preTime:" + this.H + ",curTime:" + j);
            sportManagerPreference.setPRE_SPORT_DURATION_INSEC(j);
        }
    }

    public void J(String str) {
        FitnessLogUtils.d("EcoSportRemind", str);
    }

    @SuppressLint({"StringFormatMatches"})
    public final void K(PhoneSportData phoneSportData) {
        int i;
        if (u()) {
            mcn mcnVar = this.w;
            if (mcnVar.e && this.J) {
                int i2 = phoneSportData.pace;
                float f = mcnVar.f;
                if ((i2 == 0 || i2 > f) && (i = this.f) >= 0) {
                    this.f = i - 1;
                }
                if (i2 != 0 && i2 <= f) {
                    this.f = 12;
                    this.g = 55;
                }
                int i3 = this.f;
                if (i3 <= 0) {
                    if (i3 == 0) {
                        FitnessLogUtils.i("EcoSportRemind", "12s pace remind , cur pace : " + phoneSportData.pace);
                        this.F.Q(i2 / 60, i2 % 60);
                        den denVarC = g2o.s().C();
                        if (denVarC != null) {
                            denVarC.sportNotifyPace(phoneSportData.pace);
                        }
                    }
                    this.g--;
                }
                if (this.g <= 0) {
                    FitnessLogUtils.i("EcoSportRemind", "55s pace remind , cur pace : " + phoneSportData.pace);
                    this.F.Q(i2 / 60, i2 % 60);
                    den denVarC2 = g2o.s().C();
                    if (denVarC2 != null) {
                        denVarC2.sportNotifyPace(phoneSportData.pace);
                    }
                    this.g = 55;
                }
            }
        }
    }

    public final void L(PhoneSportData phoneSportData) {
        if (u() && this.J) {
            GoalRemind goalRemind = this.b0;
            if (goalRemind == null) {
                C(phoneSportData);
                D(phoneSportData);
            } else if (goalRemind.getTrainingMode() != 2) {
                this.b0.checkJumpSportGoal(phoneSportData);
            } else if (this.b0.getGoalType() == 1) {
                C(phoneSportData);
            } else if (this.b0.getGoalType() == 6) {
                D(phoneSportData);
            }
        }
    }

    @SuppressLint({"StringFormatMatches"})
    public final void M(PhoneSportData phoneSportData) {
        int i;
        if (u()) {
            mcn mcnVar = this.w;
            if (mcnVar.e && this.J) {
                int i2 = phoneSportData.pace;
                float f = 3600.0f / i2;
                float f2 = mcnVar.g;
                float f3 = i2;
                if (f3 > f2 && (i = this.d) >= 0) {
                    this.d = i - 1;
                }
                if (f3 <= f2) {
                    this.d = 12;
                    this.e = 55;
                }
                int i3 = this.d;
                if (i3 <= 0) {
                    if (i3 == 0) {
                        J("当前速度 " + i2);
                        den denVarC = g2o.s().C();
                        if (denVarC != null) {
                            denVarC.c(phoneSportData.pace);
                        }
                        this.F.R((int) f, ((int) (f * 100.0f)) % 100);
                    }
                    this.e--;
                }
                if (this.e <= 0) {
                    J("当前速度 60" + i2);
                    den denVarC2 = g2o.s().C();
                    if (denVarC2 != null) {
                        denVarC2.c(phoneSportData.pace);
                    }
                    this.F.R((int) f, ((int) (f * 100.0f)) % 100);
                    this.e = 55;
                }
            }
        }
    }

    public void O(int i) {
        o(i);
    }

    public void P(int i, GoalRemind goalRemind) {
        this.I = i;
        if (goalRemind != null) {
            GoalRemind goalRemind2 = this.b0;
            if (goalRemind2 == null) {
                this.b0 = goalRemind;
            } else {
                goalRemind2.setGoalType(goalRemind.getGoalType());
                this.b0.setSportGoalValue(goalRemind.getSportGoalValue());
                this.b0.setSportType(goalRemind.getSportType());
                this.b0.setTrainingMode(goalRemind.getTrainingMode());
            }
            FitnessLogUtils.i("EcoSportRemind", "goalRemindValue :" + goalRemind.getSportGoalValue());
        }
        o(i);
        FitnessLogUtils.i("EcoSportRemind", "startSportRemind");
    }

    public final boolean g(PhoneSportData phoneSportData) {
        int i;
        int i2;
        if (u() && this.J && (i = this.Z) > 0 && (i2 = this.a0) > 0) {
            if (this.S == 0) {
                int i3 = phoneSportData.distance;
                if (i3 - i2 > 100) {
                    E(phoneSportData.sportType, i3 / 1000, phoneSportData.duration / 60);
                    this.S++;
                    return true;
                }
            }
            if (this.R == 0) {
                int i4 = phoneSportData.duration;
                if (i4 - i > 120) {
                    E(phoneSportData.sportType, 0, i4 / 60);
                    this.R++;
                    return true;
                }
            }
        }
        return false;
    }

    public void k(Boolean bool) {
        this.V = bool.booleanValue();
    }

    public void l(int i, int i2, final boolean z) {
        if (SportManagerExportPreference.INSTANCE.getKEY_GYM_IS_JUMPING() && this.w == null) {
            mcn mcnVarP = p(this.I);
            this.w = mcnVarP;
            if (mcnVarP == null) {
                this.w = new mcn();
            }
        }
        if (u()) {
            this.e0 = z;
            this.G = i;
            this.D = o4h.y(0L, i2, TimeUnit.MILLISECONDS).U(this.G + (z ? 1 : 0)).N(new bg4() { // from class: hun
                @Override // defpackage.bg4
                public final void accept(Object obj) throws Exception {
                    this.f20480a.w(z, (Long) obj);
                }
            });
        }
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.ISportDataChangedListener
    public void onPhoneDataChanged(PhoneSportData phoneSportData) {
        if (u()) {
            if (g2o.s().L() == 14) {
                L(phoneSportData);
                return;
            }
            g(phoneSportData);
            GoalRemind goalRemind = this.b0;
            if (goalRemind != null) {
                goalRemind.checkSportGoal(phoneSportData);
            }
            H(phoneSportData);
            if (g2o.s().L() == 6) {
                M(phoneSportData);
            } else {
                K(phoneSportData);
            }
            B(phoneSportData.heart_rate);
        }
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.ISportDataChangedListener
    public void onReceiveWearData(y7r y7rVar) {
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.ISportStateChangedListener
    public void onSportFinished(boolean z, byte[] bArr) {
        FitnessLogUtils.i("EcoSportRemind", "onSportFinished , validSport:" + z + ", isSupportRemindFromLaunchSource: " + t() + ",isVoiceRemind:" + u());
        if (t() && q()) {
            this.J = false;
            Q();
            SportManagerPreference.INSTANCE.setPRE_SPORT_DURATION_INSEC(0L);
            SoundPool soundPool = this.P;
            if (soundPool != null) {
                soundPool.release();
                this.P = null;
            }
            this.j = 15;
            this.f13149k = 60;
            jz6 jz6Var = this.z;
            if (jz6Var != null && !jz6Var.isDisposed()) {
                this.z.dispose();
                this.z = null;
            }
            jz6 jz6Var2 = this.A;
            if (jz6Var2 != null && !jz6Var2.isDisposed()) {
                this.A.dispose();
                this.A = null;
            }
            jz6 jz6Var3 = this.B;
            if (jz6Var3 != null && !jz6Var3.isDisposed()) {
                this.B.dispose();
                this.B = null;
            }
            jz6 jz6Var4 = this.C;
            if (jz6Var4 != null && !jz6Var4.isDisposed()) {
                this.C.dispose();
                this.C = null;
            }
            SportRequest.INSTANCE.clear();
            this.x = 0;
            this.M = 0;
            this.N = 0;
            this.O = 0;
            this.S = 0;
            this.R = 0;
            this.T = 0;
            this.U = 0;
            this.n = false;
            GoalRemind goalRemind = this.b0;
            if (goalRemind != null) {
                goalRemind.onFinishSport();
            }
            this.b0 = null;
            if (u()) {
                int iL = g2o.s().L();
                if (iL != 1) {
                    if (iL == 2) {
                        J("健走结束，快休息一下吧");
                        FitnessLogUtils.i("EcoSportRemind", "walkingStop");
                        this.F.l1();
                        return;
                    } else if (iL != 3) {
                        if (iL == 6 || iL == 7) {
                            FitnessLogUtils.i("EcoSportRemind", "ridingStop");
                            J("骑行结束，快休息一下吧");
                            this.F.T0();
                            return;
                        } else {
                            J("运动结束");
                            FitnessLogUtils.i("EcoSportRemind", "trainingStop");
                            this.F.f1();
                            return;
                        }
                    }
                }
                J("跑步结束，请适当拉伸放松");
                FitnessLogUtils.i("EcoSportRemind", "runningStop");
                this.F.X0();
            }
        }
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.ISportStateChangedListener
    public void onSportPaused() {
        int i;
        this.J = false;
        FitnessLogUtils.i("EcoSportRemind", "onSportPaused , isSupportRemindFromLaunchSource:" + t() + ", isVoiceReminwed:" + u());
        if (t() && q()) {
            Q();
            J("运动暂停");
            if (u()) {
                int i2 = this.M;
                if (i2 == -1 || (i = this.N) < 80 || i >= 100) {
                    this.F.I();
                } else {
                    this.F.M0(i2, this.O);
                }
                SoundPool soundPool = this.P;
                if (soundPool != null) {
                    soundPool.release();
                    this.P = null;
                }
            }
        }
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.ISportStateChangedListener
    public void onSportRestarted() {
        FitnessLogUtils.i("EcoSportRemind", "onSportRestarted, isSupportRemindFromLaunchSource:" + t() + ", isVoiceRemind" + u());
        if (t() && q()) {
            N();
            this.J = true;
            if (u()) {
                this.F.K();
                J("运动继续");
            }
        }
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.ISportStateChangedListener
    public void onSportRested() {
        this.J = false;
        FitnessLogUtils.i("EcoSportRemind", "onSportRested , isVoiceReminwed:" + u());
        Q();
        J("运动休息");
        if (u()) {
            this.F.J();
            SoundPool soundPool = this.P;
            if (soundPool != null) {
                soundPool.release();
                this.P = null;
            }
        }
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.ISportStateChangedListener
    public void onSportShutdown() {
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.ISportStateChangedListener
    public void onSportStarted(int i, int i2, int i3, int i4) {
        this.c0 = i4;
        this.I = i3;
        FitnessLogUtils.i("EcoSportRemind", "onSportStarted , sportType : " + i3 + ",isSupportRemindFromLaunchSource:" + t() + ",isVoiceRemind:" + u());
        if (t() && q()) {
            N();
            this.J = true;
            if (u()) {
                this.S = 0;
                this.R = 0;
                this.T = 0;
                this.U = 0;
                if (this.e0) {
                    return;
                }
                if (i3 != 1) {
                    if (i3 == 2) {
                        J("开始健走");
                        this.F.e1();
                        return;
                    } else if (i3 != 3) {
                        if (i3 == 6 || i3 == 7) {
                            FitnessLogUtils.d("EcoSportRemind", "开始骑行");
                            this.F.b1();
                            return;
                        } else {
                            J("开始运动");
                            this.F.d1();
                            return;
                        }
                    }
                }
                this.F.c1();
                FitnessLogUtils.d("EcoSportRemind", "开始跑步");
            }
        }
    }

    public final mcn p(int i) {
        return SportRemindDabaBase.INSTANCE.getSportRemindTable(i);
    }

    @Override // com.xiaomi.fitness.sport_eco_manager_export.listener.ISportStateChangedListener
    public void preSport() {
    }

    public final /* synthetic */ void z(Long l) throws Exception {
        if (this.I == 14 && !SportManagerExportPreference.INSTANCE.getKEY_GYM_IS_JUMPING()) {
            FitnessLogUtils.d("EcoSportRemind", "no jumping");
        } else if (this.w.i && this.J && this.V) {
            FitnessLogUtils.d("EcoSportRemind", "metronome");
            this.P.play(this.Q, 0.0f, 0.5f, 0, 0, 1.0f);
        }
    }
}
