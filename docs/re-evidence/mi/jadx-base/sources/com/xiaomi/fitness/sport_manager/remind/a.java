package com.xiaomi.fitness.sport_manager.remind;

import android.annotation.SuppressLint;
import android.media.SoundPool;
import android.os.Handler;
import android.os.Looper;
import com.xiaomi.fit.data.common.data.sport.util.FitnessSportTypeUtils;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.StringUtil;
import com.xiaomi.fitness.sport_manager.utils.SportManagerPreference;
import com.xiaomi.fitness.sport_manager_export.RemindExt;
import com.xiaomi.fitness.sport_manager_export.data.FinishSportData;
import com.xiaomi.fitness.sport_manager_export.data.PhoneSportData;
import com.xiaomi.fitness.sport_manager_export.data.SportData;
import com.xiaomi.fitness.sport_manager_export.data.SportLocationResult;
import com.xiaomi.fitness.sport_manager_export.listener.ISportDataChangedListener;
import com.xiaomi.fitness.sport_manager_export.listener.ISportStateChangedListener;
import defpackage.bg4;
import defpackage.cen;
import defpackage.f2o;
import defpackage.j5h;
import defpackage.jz6;
import defpackage.lcn;
import defpackage.o4h;
import defpackage.ofl;
import defpackage.ua1;
import defpackage.ukf;
import defpackage.uyi;
import defpackage.v4h;
import defpackage.x7r;
import defpackage.z5h;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes10.dex */
public class a implements ISportStateChangedListener, ISportDataChangedListener {
    public static volatile a j0;
    public jz6 A;
    public jz6 B;
    public jz6 C;
    public jz6 D;
    public int E;
    public ukf F;
    public int G;
    public long H;
    public int I;
    public boolean J;
    public jz6 K;
    public int N;
    public SoundPool P;
    public SoundPool Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public int Y;
    public int Z;
    public GoalRemind a0;
    public int b0;
    public jz6 c0;
    public boolean n;
    public int t;
    public String u;
    public long v;
    public lcn w;
    public int x;
    public int y;
    public jz6 z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f13191a = 60;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f13192b = 200;
    public int c = 30;
    public int d = 12;
    public int e = 55;
    public int f = 12;
    public int g = 55;
    public int h = 5;
    public int i = 30;
    public int j = 15;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f13193k = 60;
    public int l = 15;
    public int m = 5;
    public int o = 0;
    public int p = 1;
    public int q = 2;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f13194r = 3;
    public int s = 4;
    public boolean L = true ^ AppUtil.INSTANCE.isPlayChannel();
    public int M = -1;
    public int O = 0;
    public boolean V = false;
    public boolean W = false;
    public int X = 0;
    public boolean d0 = false;
    public Handler e0 = new Handler(Looper.getMainLooper());
    public long f0 = 0;
    public int g0 = 0;
    public Runnable h0 = new b();
    public float i0 = 0.0f;

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport_manager.remind.a$a, reason: collision with other inner class name */
    public class C0791a implements z5h<Integer> {
        public C0791a() {
        }

        @Override // defpackage.z5h
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onNext(Integer num) {
            a.this.w = new lcn();
        }

        @Override // defpackage.z5h
        public void onComplete() {
            a.this.V();
            jz6 jz6Var = a.this.c0;
            if (jz6Var != null) {
                jz6Var.dispose();
            }
        }

        @Override // defpackage.z5h
        public void onError(Throwable th) {
            FitnessLogUtils.i("SportRemind", th.toString());
        }

        @Override // defpackage.z5h
        public void onSubscribe(jz6 jz6Var) {
            a.this.c0 = jz6Var;
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (a.this.w.i && a.this.J) {
                System.currentTimeMillis();
                long unused = a.this.f0;
                if (a.this.g0 % 2 == 0) {
                    if (a.this.P != null) {
                        a.this.P.play(a.this.R, 0.5f, 0.5f, 0, 0, 1.0f);
                    }
                } else if (a.this.Q != null) {
                    a.this.Q.play(a.this.S, 0.5f, 0.5f, 0, 0, 1.0f);
                }
                a.this.f0 = System.currentTimeMillis();
                a.this.e0.postDelayed(a.this.h0, (60000 / a.this.w.j) - 57);
                a.this.g0++;
            }
        }
    }

    public a() {
        FitnessLogUtils.i("SportRemind", "SportRemind() Constructor");
        this.F = ukf.U(AppUtil.getApp());
    }

    public static a v() {
        if (j0 == null) {
            synchronized (a.class) {
                try {
                    if (j0 == null) {
                        j0 = new a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return j0;
    }

    public final boolean A() {
        int i = this.I;
        return i == 1 || i == 2 || i == 3 || i == 6;
    }

    public final boolean B() {
        return f2o.x().t() != 4;
    }

    public final boolean C() {
        lcn lcnVar = this.w;
        return lcnVar != null && lcnVar.m && this.L && RemindExt.INSTANCE.isSupportRemind() && A() && !D();
    }

    public final boolean D() {
        int iT = f2o.x().t();
        return iT == 4 || iT == 5;
    }

    public final /* synthetic */ void E(boolean z, Long l) throws Exception {
        if (this.G <= 0) {
            if (z) {
                ukf ukfVar = this.F;
                if (ukfVar != null) {
                    ukfVar.V0();
                }
                this.D.dispose();
                return;
            }
            return;
        }
        FitnessLogUtils.i("SportRemind", "count:" + this.G);
        ukf ukfVar2 = this.F;
        if (ukfVar2 != null) {
            int i = this.G;
            this.G = i - 1;
            ukfVar2.L(i);
        }
    }

    public final /* synthetic */ void F(int i, v4h v4hVar) throws Exception {
        lcn lcnVarX = x(i);
        FitnessLogUtils.d("SportRemind", "sport remind db : " + lcnVarX);
        if (lcnVarX == null) {
            v4hVar.onNext(1);
        } else {
            this.w = lcnVarX;
        }
        if (AppUtil.INSTANCE.isPlayChannel()) {
            lcn lcnVar = new lcn();
            lcn lcnVar2 = this.w;
            lcnVar.i = lcnVar2.i;
            lcnVar.j = lcnVar2.j;
            lcnVar.f24909b = lcnVar2.f24909b;
            lcnVar.h = false;
            this.w = lcnVar;
        }
        v4hVar.onComplete();
    }

    public final /* synthetic */ void G(int i, int i2) {
        FitnessLogUtils.i("SportRemind", "mMaxDuration:" + this.Y + ", maxDistance:" + i);
        this.Y = i2;
        this.Z = i;
    }

    public final void H(PhoneSportData phoneSportData) {
        onLocationChanged(new SportLocationResult.a(phoneSportData.timestamp).i(phoneSportData.gpsAccuracyStatus).j(phoneSportData.location).g());
    }

    public void I(int i, int i2, int i3) {
        this.M = i;
        this.N = i2;
        this.O = i3;
    }

    public void J(int i) {
        if (this.w != null && this.J) {
            this.y = i;
            if (i > 0) {
                R();
                P();
            }
        }
    }

    public final void K(int i, int i2, int i3) {
        if (i != 1) {
            if (i == 2) {
                this.F.a1(i2, i3);
                return;
            } else if (i != 3) {
                if (i == 6 || i == 7) {
                    this.F.K0(i2, i3);
                    return;
                }
                return;
            }
        }
        this.F.O0(i2, i3);
    }

    public void L(SportData sportData) {
        this.x = sportData.distance / 1000;
    }

    public final void M() {
        this.f13192b = 200;
        this.f13191a = 60;
        if (this.n) {
            int i = this.c;
            if (i >= 0) {
                this.c = i - 1;
            }
            if (this.c <= 0) {
                this.F.J0();
                this.c = 30;
                this.n = false;
            }
        }
    }

    public void N(int i) {
        if (C()) {
            O(i);
        }
    }

    public final void O(int i) {
        if (this.J) {
            if (i == 0) {
                Z();
            } else {
                M();
            }
        }
    }

    public final void P() {
        int i;
        int i2;
        int i3;
        if (C()) {
            lcn lcnVar = this.w;
            if (lcnVar.n && this.J) {
                String str = lcnVar.l;
                if (StringUtil.isBlank(str)) {
                    return;
                }
                String[] strArrSplit = str.split(",");
                int i4 = Integer.parseInt(strArrSplit[1]);
                int i5 = Integer.parseInt(strArrSplit[0]);
                int i6 = Integer.parseInt(strArrSplit[2]);
                int i7 = this.y;
                if ((i7 < i5 || i7 > i4) && (i = this.j) >= 0) {
                    this.j = i - 1;
                    this.V = false;
                    this.W = true;
                    this.l = 0;
                }
                if (i7 > i5 && i7 < i4) {
                    this.j = 15;
                    this.f13193k = 60;
                    if (this.l <= 0) {
                        this.l = 15;
                    }
                    this.V = true;
                }
                int i8 = this.j;
                if (i8 <= 0) {
                    if (i8 == 0) {
                        S("15s 心率超标");
                        cen cenVarH = f2o.x().H();
                        if (cenVarH != null && (i3 = this.y) > i4) {
                            cenVarH.sportNotifyHr(i3);
                        }
                        s(this.y, i4, i5);
                    }
                    this.f13193k--;
                }
                if (this.f13193k <= 0) {
                    S("60s 心率超标");
                    s(this.y, i4, i5);
                    cen cenVarH2 = f2o.x().H();
                    if (cenVarH2 != null && (i2 = this.y) > i4) {
                        cenVarH2.sportNotifyHr(i2);
                    }
                    this.f13193k = 60;
                }
                r(i6);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:41:0x00df  */
    public final void Q(PhoneSportData phoneSportData) {
        int i;
        int i2;
        int i3;
        if (C() && z() && this.J && (i = phoneSportData.distance / 1000) > this.x) {
            long j = phoneSportData.duration;
            if (q(i)) {
                return;
            }
            this.x = i;
            SportManagerPreference sportManagerPreference = SportManagerPreference.INSTANCE;
            long pre_sport_duration_insec = j - sportManagerPreference.getPRE_SPORT_DURATION_INSEC();
            int i4 = this.I;
            if (i4 == 1) {
                i2 = this.x;
                if (i2 == 1) {
                    this.F.Q0(i2, (int) (j / 60), (int) (j % 60));
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
                    FitnessLogUtils.i("SportRemind", sb.toString());
                    this.F.P0(this.x, i5, i6, i7, i8);
                }
            } else if (i4 == 2) {
                int i9 = this.x;
                if (i9 == 1) {
                    this.F.c1(i9, (int) (j / 60), (int) (j % 60));
                } else {
                    this.F.b1(i9, (int) (j / 60), (int) (j % 60), (int) (pre_sport_duration_insec / 60), (int) (pre_sport_duration_insec % 60));
                }
            } else if (i4 == 3) {
                i2 = this.x;
                if (i2 == 1) {
                    this.F.Q0(i2, (int) (j / 60), (int) (j % 60));
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
                    FitnessLogUtils.i("SportRemind", sb2.toString());
                    this.F.P0(this.x, i10, i11, i12, i13);
                }
            } else if (i4 == 6 || i4 == 7) {
                int i14 = this.x;
                if (i14 == 1) {
                    this.F.M0(i14, (int) (j / 60), (int) (j % 60));
                } else {
                    float f = pre_sport_duration_insec / 3600.0f;
                    float f2 = 0.0f;
                    if (f != 0.0f) {
                        f2 = 1.0f / f;
                        i3 = (int) ((f2 - ((int) f2)) * 100.0f);
                    } else {
                        i3 = 0;
                    }
                    this.F.L0(i14, (int) (j / 60), (int) (j % 60), (int) f2, i3);
                    FitnessLogUtils.i("SportRemind", f2 + "--" + i3 + "--" + pre_sport_duration_insec + "---" + f);
                }
            }
            cen cenVarH = f2o.x().H();
            if (cenVarH != null) {
                cenVarH.b(this.x * 1000, (int) j, (int) pre_sport_duration_insec);
            }
            FitnessLogUtils.d("SportRemind", "preTime:" + this.H + ",curTime:" + j);
            sportManagerPreference.setPRE_SPORT_DURATION_INSEC(j);
        }
    }

    public final void R() {
        int i;
        if (C()) {
            lcn lcnVar = this.w;
            if (lcnVar.c && this.J) {
                int i2 = lcnVar.d;
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
                        FitnessLogUtils.i("SportRemind", "5S , max hr remind:" + this.y);
                        this.F.R((int) f);
                        cen cenVarH = f2o.x().H();
                        if (cenVarH != null) {
                            cenVarH.sportNotifyHr(this.y);
                        }
                    }
                    this.i--;
                }
                if (this.i <= 0) {
                    FitnessLogUtils.i("SportRemind", "30S , max hr remind:" + this.y);
                    this.F.R((int) f);
                    cen cenVarH2 = f2o.x().H();
                    if (cenVarH2 != null) {
                        cenVarH2.sportNotifyHr(this.y);
                    }
                    this.i = 30;
                }
            }
        }
    }

    public void S(String str) {
        FitnessLogUtils.d("SportRemind", str);
    }

    @SuppressLint({"StringFormatMatches"})
    public final void T(PhoneSportData phoneSportData) {
        int i;
        if (C()) {
            lcn lcnVar = this.w;
            if (lcnVar.e && this.J) {
                int i2 = phoneSportData.pace;
                float f = lcnVar.f;
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
                        FitnessLogUtils.i("SportRemind", "12s pace remind , cur pace : " + phoneSportData.pace);
                        if (phoneSportData.pace != 0) {
                            this.F.N(i2 / 60, i2 % 60);
                            cen cenVarH = f2o.x().H();
                            if (cenVarH != null) {
                                cenVarH.sportNotifyPace(phoneSportData.pace);
                            }
                        }
                    }
                    this.g--;
                }
                if (this.g <= 0) {
                    FitnessLogUtils.i("SportRemind", "55s pace remind , cur pace : " + phoneSportData.pace);
                    if (phoneSportData.pace != 0) {
                        this.F.N(i2 / 60, i2 % 60);
                        cen cenVarH2 = f2o.x().H();
                        if (cenVarH2 != null) {
                            cenVarH2.sportNotifyPace(phoneSportData.pace);
                        }
                    }
                    this.g = 55;
                }
            }
        }
    }

    @SuppressLint({"StringFormatMatches"})
    public final void U(PhoneSportData phoneSportData) {
        int i;
        if (C()) {
            lcn lcnVar = this.w;
            if (lcnVar.e && this.J) {
                int i2 = phoneSportData.pace;
                float f = 3600.0f / i2;
                float f2 = lcnVar.g;
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
                        S("当前速度 " + i2);
                        cen cenVarH = f2o.x().H();
                        if (cenVarH != null) {
                            cenVarH.c(phoneSportData.pace);
                        }
                        this.F.O((int) f, ((int) (f * 100.0f)) % 100);
                    }
                    this.e--;
                }
                if (this.e <= 0) {
                    S("当前速度 60" + i2);
                    cen cenVarH2 = f2o.x().H();
                    if (cenVarH2 != null) {
                        cenVarH2.c(phoneSportData.pace);
                    }
                    this.F.O((int) f, ((int) (f * 100.0f)) % 100);
                    this.e = 55;
                }
            }
        }
    }

    public final void V() {
        Y();
        if (this.w == null) {
            return;
        }
        SportRequest.INSTANCE.requestBasetRecordFromService(this.I, new SportRequest.OnSportMaxRecord() { // from class: gun
            @Override // com.xiaomi.fitness.sport_manager.remind.SportRequest.OnSportMaxRecord
            public final void onRecord(int i, int i2) {
                this.f19348a.G(i, i2);
            }
        });
        int i = this.I;
        boolean z = true;
        if (i != 1 && i != 3) {
            z = false;
        }
        lcn lcnVar = this.w;
        if (!lcnVar.i || lcnVar.j == 0 || !z) {
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
            this.R = soundPool2.load(AppUtil.getApp(), uyi.f36282a, 0);
        } else {
            soundPool.stop(this.R);
            this.R = this.P.load(AppUtil.getApp(), uyi.f36282a, 0);
        }
        SoundPool soundPool3 = this.Q;
        if (soundPool3 == null) {
            SoundPool soundPool4 = new SoundPool(10, 3, 0);
            this.Q = soundPool4;
            this.S = soundPool4.load(AppUtil.getApp(), uyi.f36282a, 0);
        } else {
            soundPool3.stop(this.S);
            this.S = this.Q.load(AppUtil.getApp(), uyi.f36282a, 0);
        }
        this.e0.post(this.h0);
    }

    public void W(int i) {
        this.F = ukf.U(AppUtil.getApp());
        w(i);
    }

    public void X(int i, GoalRemind goalRemind) {
        this.F = ukf.U(AppUtil.getApp());
        this.I = i;
        if (goalRemind != null) {
            GoalRemind goalRemind2 = this.a0;
            if (goalRemind2 == null) {
                this.a0 = goalRemind;
            } else {
                goalRemind2.setGoalType(goalRemind.getGoalType());
                this.a0.setSportGoalValue(goalRemind.getSportGoalValue());
                this.a0.setSportType(goalRemind.getSportType());
            }
            FitnessLogUtils.i("SportRemind", "goalRemindValue :" + goalRemind.getSportGoalValue());
        }
        w(i);
        FitnessLogUtils.i("SportRemind", "startSportRemind");
    }

    public final void Y() {
        jz6 jz6Var = this.K;
        if (jz6Var != null && !jz6Var.isDisposed()) {
            this.K.dispose();
            this.K = null;
        }
        if (this.P != null) {
            this.P = null;
        }
        if (this.Q != null) {
            this.Q = null;
        }
        this.e0.removeCallbacksAndMessages(null);
    }

    public final void Z() {
        this.c = 30;
        int i = this.f13191a;
        if (i >= 0) {
            this.f13191a = i - 1;
        }
        int i2 = this.f13191a;
        if (i2 <= 0) {
            if (i2 == 0) {
                this.F.e1();
            }
            this.f13192b--;
            this.n = true;
        }
        FitnessLogUtils.i("SportRemind", "weakGpsRemindStartTime :" + this.f13191a + ", weakGpsRemindDurationTime : " + this.f13192b);
        if (this.f13192b <= 0) {
            this.F.e1();
            this.f13192b = 200;
        }
    }

    @Override // com.xiaomi.fitness.sport_manager_export.listener.ISportDataChangedListener
    public void onLocationChanged(SportLocationResult sportLocationResult) {
        if (C() && this.J && FitnessSportTypeUtils.INSTANCE.supportGpsSport(this.I)) {
            N(sportLocationResult.getGpsAccuracyStatus());
        }
    }

    @Override // com.xiaomi.fitness.sport_manager_export.listener.ISportDataChangedListener
    public void onPhoneDataChanged(PhoneSportData phoneSportData) {
        if (C()) {
            p(phoneSportData);
            GoalRemind goalRemind = this.a0;
            if (goalRemind != null) {
                goalRemind.checkSportGoal(phoneSportData);
            }
            Q(phoneSportData);
            if (f2o.x().T() == 6) {
                U(phoneSportData);
            } else {
                T(phoneSportData);
            }
            J(phoneSportData.heart_rate);
            H(phoneSportData);
        }
    }

    @Override // com.xiaomi.fitness.sport_manager_export.listener.ISportDataChangedListener
    public void onReceiveWearData(x7r x7rVar) {
    }

    /* JADX WARN: Code duplicated, block: B:51:0x0100  */
    @Override // com.xiaomi.fitness.sport_manager_export.listener.ISportStateChangedListener
    public void onSportFinished(boolean z, byte[] bArr, FinishSportData finishSportData) {
        FitnessLogUtils.i("SportRemind", "onSportFinished , validSport:" + z + ", isSupportRemindFromLaunchSource: " + B() + ",isVoiceRemind:" + C());
        if (B() && y()) {
            this.J = false;
            Y();
            SportManagerPreference.INSTANCE.setPRE_SPORT_DURATION_INSEC(0L);
            SoundPool soundPool = this.P;
            if (soundPool != null) {
                soundPool.release();
                this.P = null;
            }
            SoundPool soundPool2 = this.Q;
            if (soundPool2 != null) {
                soundPool2.release();
                this.Q = null;
            }
            this.j = 15;
            this.f13193k = 60;
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
            this.U = 0;
            this.T = 0;
            this.n = false;
            GoalRemind goalRemind = this.a0;
            if (goalRemind != null) {
                goalRemind.onFinishSport();
            }
            this.a0 = null;
            if (C()) {
                int iT = f2o.x().T();
                if (iT == 1) {
                    S("跑步结束，请适当拉伸放松");
                    this.F.R0();
                } else if (iT == 2) {
                    S("健走结束，快休息一下吧");
                    this.F.d1();
                } else if (iT == 3) {
                    S("跑步结束，请适当拉伸放松");
                    this.F.R0();
                } else if (iT != 6) {
                    S("运动结束");
                    this.F.Y0();
                } else {
                    S("骑行结束，快休息一下吧");
                    this.F.N0();
                }
                this.F.F0();
            }
        }
    }

    @Override // com.xiaomi.fitness.sport_manager_export.listener.ISportStateChangedListener
    public void onSportPaused() {
        int i;
        this.J = false;
        FitnessLogUtils.i("SportRemind", "onSportPaused , isSupportRemindFromLaunchSource:" + B() + ", isVoiceReminwed:" + C());
        if (B() && y()) {
            Y();
            S("运动暂停");
            if (C()) {
                int i2 = this.M;
                if (i2 == -1 || (i = this.N) < 80 || i >= 100) {
                    this.F.J();
                } else {
                    this.F.I0(i2, this.O);
                }
                SoundPool soundPool = this.P;
                if (soundPool != null) {
                    soundPool.release();
                    this.P = null;
                }
                SoundPool soundPool2 = this.Q;
                if (soundPool2 != null) {
                    soundPool2.release();
                    this.Q = null;
                }
            }
        }
    }

    @Override // com.xiaomi.fitness.sport_manager_export.listener.ISportStateChangedListener
    public void onSportRestarted() {
        FitnessLogUtils.i("SportRemind", "onSportRestarted, isSupportRemindFromLaunchSource:" + B() + ", isVoiceRemind" + C());
        if (B() && y()) {
            V();
            this.J = true;
            if (C()) {
                this.F.K();
                S("运动继续");
            }
        }
    }

    @Override // com.xiaomi.fitness.sport_manager_export.listener.ISportStateChangedListener
    public void onSportSegment(int i, int i2) {
    }

    @Override // com.xiaomi.fitness.sport_manager_export.listener.ISportStateChangedListener
    public void onSportStarted(int i, int i2, int i3, int i4, int i5) {
        this.b0 = i5;
        this.I = i4;
        FitnessLogUtils.i("SportRemind", "onSportStarted , sportType : " + i4 + ",isSupportRemindFromLaunchSource:" + B() + ",isVoiceRemind:" + C());
        if (B() && y()) {
            this.J = true;
            V();
            if (C()) {
                this.U = 0;
                this.T = 0;
                if (this.d0) {
                    return;
                }
                if (i4 != 1) {
                    if (i4 == 2) {
                        S("开始健走");
                        this.F.X0();
                        return;
                    } else if (i4 != 3) {
                        if (i4 == 6 || i4 == 7) {
                            FitnessLogUtils.d("SportRemind", "开始骑行");
                            this.F.U0();
                            return;
                        } else {
                            S("开始运动");
                            this.F.W0();
                            return;
                        }
                    }
                }
                this.F.V0();
                FitnessLogUtils.d("SportRemind", "开始跑步");
            }
        }
    }

    public final boolean p(PhoneSportData phoneSportData) {
        int i;
        int i2;
        if (C() && this.J && (i = this.Y) > 0 && (i2 = this.Z) > 0) {
            if (this.U == 0) {
                int i3 = phoneSportData.distance;
                if (i3 - i2 > 100) {
                    K(phoneSportData.sportType, i3 / 1000, phoneSportData.duration / 60);
                    this.U++;
                    return true;
                }
            }
            if (this.T == 0) {
                int i4 = phoneSportData.duration;
                if (i4 - i > 120) {
                    K(phoneSportData.sportType, 0, i4 / 60);
                    this.T++;
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.xiaomi.fitness.sport_manager_export.listener.ISportStateChangedListener
    public void preSport() {
    }

    public final boolean q(int i) {
        FitnessLogUtils.i("SportRemind", "have remind total km:" + this.x + ", curTotalKm:" + i);
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

    public final void r(int i) {
        if (this.W && this.V) {
            int i2 = this.l;
            if (i2 > 0) {
                this.l = i2 - 1;
            }
            if (this.l <= 0) {
                this.W = false;
                this.F.Z(this.y, u(i));
            }
        }
    }

    public final void s(int i, int i2, int i3) {
        FitnessLogUtils.i("SportRemind", "min:" + i3 + ",max:" + i2 + ",curHr:" + i);
        if (i > i2) {
            this.F.P(i2);
        } else if (i < i3) {
            this.F.Q(i3);
        }
    }

    public void t(int i, int i2, final boolean z) {
        if (C()) {
            this.d0 = z;
            this.G = i;
            this.D = o4h.y(0L, i2, TimeUnit.MILLISECONDS).U(this.G + (z ? 1 : 0)).N(new bg4() { // from class: kun
                @Override // defpackage.bg4
                public final void accept(Object obj) throws Exception {
                    this.f24313a.E(z, (Long) obj);
                }
            });
        }
    }

    public final String u(int i) {
        if (i == 1) {
            this.u = "warm_up";
        } else if (i == 2) {
            this.t = this.p;
            this.u = "at_burn";
        } else if (i == 3) {
            this.t = this.q;
            this.u = "aerobic";
        } else if (i == 4) {
            this.t = this.f13194r;
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

    public final void w(final int i) {
        o4h.f(new j5h() { // from class: iun
            @Override // defpackage.j5h
            public final void subscribe(v4h v4hVar) throws Exception {
                this.f22110a.F(i, v4hVar);
            }
        }).S(ofl.c()).H(ua1.c()).a(new C0791a());
    }

    public final lcn x(int i) {
        return SportRemindDabaBase.INSTANCE.getSportRemindTable(i);
    }

    public final boolean y() {
        long jCurrentTimeMillis = System.currentTimeMillis() - this.v;
        this.v = System.currentTimeMillis();
        return jCurrentTimeMillis > 600;
    }

    public final boolean z() {
        lcn lcnVar = this.w;
        return lcnVar != null && lcnVar.h;
    }
}
