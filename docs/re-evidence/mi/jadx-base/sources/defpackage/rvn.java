package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import com.google.android.exoplayer2.m;
import com.google.android.exoplayer2.q;
import com.google.android.exoplayer2.source.k;
import com.google.android.exoplayer2.source.p;
import com.google.android.exoplayer2.t;
import com.google.android.exoplayer2.upstream.RawResourceDataSource;
import com.google.android.exoplayer2.upstream.d;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.wearable.sport.GoalAchieved;
import com.xiaomi.wearable.sport.SportRemindConst;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class rvn {
    public static volatile rvn g;
    public static int h;
    public static String[] i = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    public static String[] j = {"zhanwei", "ten", "hundred", "thousand", "wan"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f32949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public t f32950b;
    public Boolean c;
    public Boolean d;
    public Handler e;
    public p.b f;

    public class a implements q.c {
        public a() {
        }

        @Override // com.google.android.exoplayer2.q.c
        public void onPlayerStateChanged(boolean z, int i) {
            StringBuilder sb = new StringBuilder();
            sb.append("onPlayerStateChanged: ");
            sb.append(rvn.this.c);
            sb.append(" , state = ");
            sb.append(i);
            if (i == 4 || i == 1) {
                rvn.this.c = Boolean.FALSE;
            } else if (i == 2 || i == 3) {
                rvn.this.c = Boolean.TRUE;
            }
        }
    }

    public rvn(Context context) {
        Boolean bool = Boolean.FALSE;
        this.c = bool;
        this.d = bool;
        this.e = new Handler(Looper.getMainLooper());
        this.f32949a = context;
        f0();
        Context context2 = this.f32949a;
        this.f = new p.b(new d(context2, wlq.h0(context2, context2.getPackageName())));
    }

    public static int G(int i2) {
        if (i2 < 0 || i2 > 1000) {
            return 0;
        }
        return i2;
    }

    public static int H(int i2) {
        if (i2 < 0 || i2 > 10000) {
            return 0;
        }
        return i2;
    }

    public static String[] M(int i2) {
        int iG = G(i2);
        h = iG;
        if (iG == 0) {
            return new String[]{"zero"};
        }
        String strValueOf = String.valueOf(iG);
        ArrayList arrayList = new ArrayList();
        char[] charArray = strValueOf.toCharArray();
        int length = charArray.length;
        for (int i3 = 0; i3 < length; i3++) {
            int i4 = charArray[i3] - '0';
            if (i4 != 0) {
                arrayList.add(i[i4]);
                arrayList.add(j[(length - i3) - 1]);
            } else if (i3 != length - 1 && charArray[i3 + 1] != '0') {
                arrayList.add(i[i4]);
            }
        }
        int size = arrayList.size();
        String[] strArr = new String[size];
        for (int i5 = 0; i5 < size; i5++) {
            strArr[i5] = (String) arrayList.get(i5);
        }
        return strArr;
    }

    public static String[] N(int i2) {
        int iH = H(i2);
        h = iH;
        if (iH == 0) {
            return new String[]{"zero"};
        }
        String strValueOf = String.valueOf(iH);
        ArrayList arrayList = new ArrayList();
        char[] charArray = strValueOf.toCharArray();
        int length = charArray.length;
        for (int i3 = 0; i3 < length; i3++) {
            int i4 = charArray[i3] - '0';
            if (i4 != 0) {
                arrayList.add(i[i4]);
                arrayList.add(j[(length - i3) - 1]);
            } else if (i3 != length - 1 && charArray[i3 + 1] != '0') {
                arrayList.add(i[i4]);
            }
        }
        int size = arrayList.size();
        String[] strArr = new String[size];
        for (int i5 = 0; i5 < size; i5++) {
            strArr[i5] = (String) arrayList.get(i5);
        }
        return strArr;
    }

    public static rvn Y(Context context) {
        if (g == null) {
            synchronized (rvn.class) {
                try {
                    if (g == null) {
                        g = new rvn(context.getApplicationContext());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return g;
    }

    public final /* synthetic */ void A0() {
        a1(a0("stop_running"), true);
    }

    public final /* synthetic */ void B0() {
        a1(a0("start_running"), true);
    }

    public final /* synthetic */ void C0() {
        a1(a0("start_running"), true);
    }

    public final /* synthetic */ void D0() {
        a1(a0("start_running"), true);
    }

    public final /* synthetic */ void E0() {
        a1(a0("start_running"), true);
    }

    public final /* synthetic */ void F0() {
        a1(a0("stop_running"), true);
    }

    public final /* synthetic */ void G0(int i2, int i3) {
        k kVarA0;
        k kVarZ;
        k kVarA1 = a0("you_has_walk");
        k kVarA2 = a0("long_walking_record");
        if (i2 != 0) {
            kVarA0 = a0("kilometer_unit");
            kVarZ = Z(g1(i2));
        } else {
            k kVarA3 = a0("common_minute_2");
            k kVarZ2 = Z(g1(i3));
            kVarA0 = kVarA3;
            kVarZ = kVarZ2;
        }
        Y0(new com.google.android.exoplayer2.source.d(kVarA1, kVarZ, kVarA0, kVarA2));
    }

    public final /* synthetic */ void H0(int i2, int i3, int i4, int i5, int i6) {
        k kVarA0 = a0("you_has_walk");
        k kVarA1 = a0("kilometer_unit");
        k kVarA2 = a0("use_time");
        k kVarA3 = a0("common_minute");
        k kVarA4 = a0("common_second");
        Y0(new com.google.android.exoplayer2.source.d(kVarA0, Z(g1(i2)), kVarA1, kVarA2, Z(g1(i3)), kVarA3, Z(g1(i4)), kVarA4, a0("last_kilometer_pace"), Z(g1(i5)), kVarA3, Z(g1(i6)), kVarA4));
    }

    public void I() {
        this.e.post(new Runnable() { // from class: vun
            @Override // java.lang.Runnable
            public final void run() {
                this.f37240a.g0();
            }
        });
    }

    public final /* synthetic */ void I0(int i2, int i3, int i4) {
        Y0(new com.google.android.exoplayer2.source.d(a0("you_has_walk"), Z(g1(i2)), a0("kilometer_unit"), a0("use_time"), Z(g1(i3)), a0("common_minute"), Z(g1(i4)), a0("common_second")));
    }

    public void J() {
        this.e.post(new Runnable() { // from class: kvn
            @Override // java.lang.Runnable
            public final void run() {
                this.f24345a.h0();
            }
        });
    }

    public final /* synthetic */ void J0() {
        a1(a0("stop_running"), true);
    }

    public void K() {
        this.e.post(new Runnable() { // from class: qun
            @Override // java.lang.Runnable
            public final void run() {
                this.f31865a.i0();
            }
        });
    }

    public void K0(final GoalAchieved goalAchieved) {
        this.e.post(new Runnable() { // from class: hvn
            @Override // java.lang.Runnable
            public final void run() {
                this.f20522a.r0(goalAchieved);
            }
        });
    }

    public void L(final int i2) {
        this.e.post(new Runnable() { // from class: qvn
            @Override // java.lang.Runnable
            public final void run() {
                this.f31892a.j0(i2);
            }
        });
    }

    /* JADX INFO: renamed from: L0, reason: merged with bridge method [inline-methods] */
    public final void r0(GoalAchieved goalAchieved) {
        k kVarA0;
        k kVarA1;
        k kVarA2;
        com.google.android.exoplayer2.source.d dVar;
        int i2 = goalAchieved.percent;
        if (i2 < 50 || i2 == 80) {
            return;
        }
        k kVarA3 = a0("warning_tone");
        k kVarA4 = a0("common_minute");
        k kVarA5 = a0("common_second");
        int i3 = goalAchieved.sportType;
        if (i3 != 2) {
            kVarA0 = i3 != 6 ? a0("you_has_run") : a0("you_has_riding");
        } else {
            kVarA0 = a0("you_has_walk");
        }
        k kVarA6 = a0("kilometer_unit");
        k kVarA7 = a0("use_time");
        njh<Integer, Integer> njhVarA = r2h.a(goalAchieved.distance / 1000.0f);
        k kVarA8 = a0("common_point");
        com.google.android.exoplayer2.source.d dVar2 = new com.google.android.exoplayer2.source.d(kVarA3, kVarA0, Z(g1(njhVarA.f27979a.intValue())), kVarA8, Z(g1(njhVarA.f27980b.intValue())), kVarA6, kVarA7, Z(g1(goalAchieved.minute)), kVarA4, Z(c0(goalAchieved.second)), kVarA5);
        int i4 = goalAchieved.goalType;
        if (i4 == 2) {
            int i5 = (int) goalAchieved.achieved;
            int i6 = goalAchieved.percent;
            if (i6 == 100) {
                dVar = new com.google.android.exoplayer2.source.d(kVarA3, a0("congrats_you_complete"), Z(g1(i5)), a0("kcal_unit"), a0("kcal_west_goal"), a0("use_time"), Z(g1(goalAchieved.minute)), kVarA4, Z(c0(goalAchieved.second)), kVarA5);
            } else {
                if (i6 >= 150) {
                    kVarA2 = V(i6, "cheer_achieved_calorie");
                } else {
                    kVarA2 = a0("cheer_achieved_calorie_" + goalAchieved.percent);
                }
                dVar = new com.google.android.exoplayer2.source.d(dVar2, kVarA2);
            }
            Y0(dVar);
            return;
        }
        int i7 = goalAchieved.percent;
        if (i7 == 100) {
            if (i4 != 1) {
                njh<Integer, Integer> njhVarA2 = r2h.a(goalAchieved.total);
                Y0(new com.google.android.exoplayer2.source.d(kVarA3, a0("congrats_you_complete"), Z(g1(njhVarA2.f27979a.intValue())), kVarA8, Z(g1(njhVarA2.f27980b.intValue())), a0("kilometer_unit"), a0("cheer_achieved_distance_goal"), a0("use_time"), Z(g1(goalAchieved.minute)), kVarA4, Z(c0(goalAchieved.second)), kVarA5));
                return;
            }
            njh<Integer, Integer> njhVarA3 = r2h.a(goalAchieved.distance / 1000.0f);
            Logger.i("SportRemindAudioHelper", njhVarA3.f27979a + "---" + njhVarA3.f27980b);
            Y0(new com.google.android.exoplayer2.source.d(kVarA3, a0("congrats_you_complete"), Z(g1(goalAchieved.minute)), kVarA4, Z(c0(goalAchieved.second)), kVarA5, a0("cheer_achieved_distance_goal"), a0("cheer_achieved_minute_distance"), Z(g1(njhVarA3.f27979a.intValue())), kVarA8, Z(g1(njhVarA3.f27980b.intValue())), a0("kilometer_unit")));
            return;
        }
        if (i4 == 1) {
            if (i7 >= 150) {
                kVarA1 = V(i7, "cheer_achieved_minute");
            } else {
                kVarA1 = a0("cheer_achieved_minute_" + goalAchieved.percent);
            }
        } else if (i7 >= 150) {
            kVarA1 = V(i7, "cheer_achieved_distance");
        } else {
            kVarA1 = a0("cheer_achieved_distance_" + goalAchieved.percent);
        }
        Y0(new com.google.android.exoplayer2.source.d(dVar2, kVarA1));
    }

    public void M0(int i2, int i3) {
        Y0(a0("goal_pause"));
    }

    public void N0(final GoalAchieved goalAchieved) {
        this.e.post(new Runnable() { // from class: ivn
            @Override // java.lang.Runnable
            public final void run() {
                this.f22146a.s0(goalAchieved);
            }
        });
    }

    public void O(int i2, boolean z) {
        Z0(b0(i2), z);
    }

    /* JADX INFO: renamed from: O0, reason: merged with bridge method [inline-methods] */
    public final void s0(GoalAchieved goalAchieved) {
        k kVarA0;
        com.google.android.exoplayer2.source.d dVar;
        int i2 = goalAchieved.percent;
        if (i2 < 50 || i2 == 80) {
            return;
        }
        k kVarA1 = a0("warning_tone");
        k kVarA2 = a0("common_minute");
        k kVarA3 = a0("common_second");
        com.google.android.exoplayer2.source.d dVar2 = new com.google.android.exoplayer2.source.d(kVarA1, goalAchieved.sportType != 14 ? a0("you_has_run") : a0("you_have_completed"), Z(g1(goalAchieved.jumpCount)), a0("number_unit"), a0("use_time"), Z(g1(goalAchieved.minute)), kVarA2, Z(c0(goalAchieved.second)), kVarA3);
        int i3 = goalAchieved.goalType;
        if (i3 == 2) {
            int i4 = (int) goalAchieved.achieved;
            if (goalAchieved.percent == 100) {
                dVar = new com.google.android.exoplayer2.source.d(kVarA1, a0("congrats_you_complete"), Z(g1(i4)), a0("kcal_unit"), a0("kcal_west_goal"), a0("use_time"), Z(g1(goalAchieved.minute)), kVarA2, Z(c0(goalAchieved.second)), kVarA3);
            } else {
                dVar = new com.google.android.exoplayer2.source.d(dVar2, a0("cheer_achieved_calorie_" + goalAchieved.percent));
            }
            Y0(dVar);
            return;
        }
        if (goalAchieved.percent == 100) {
            if (i3 == 1) {
                Y0(new com.google.android.exoplayer2.source.d(kVarA1, a0("congrats_you_complete"), Z(g1(goalAchieved.minute)), kVarA2, Z(c0(goalAchieved.second)), kVarA3, a0("cheer_achieved_distance_goal"), a0("cheer_achieved_minute_count"), Z(g1(goalAchieved.jumpCount)), a0("number_unit")));
                return;
            } else {
                if (i3 == 6) {
                    Y0(new com.google.android.exoplayer2.source.d(kVarA1, a0("congrats_you_complete"), Z(g1((int) goalAchieved.total)), a0("number_unit"), a0("cheer_achieved_distance_goal"), a0("use_time"), Z(g1(goalAchieved.minute)), kVarA2, Z(c0(goalAchieved.second)), kVarA3));
                    return;
                }
                return;
            }
        }
        if (i3 == 1) {
            kVarA0 = a0("cheer_achieved_minute_" + goalAchieved.percent);
        } else if (i3 == 6) {
            kVarA0 = a0("cheer_achieved_count_" + goalAchieved.percent);
        } else {
            kVarA0 = null;
        }
        Y0(new com.google.android.exoplayer2.source.d(dVar2, kVarA0));
    }

    public void P(int i2, int i3, int i4, int i5) {
        String str;
        if (i2 == 1) {
            str = "course_warmup";
        } else if (i2 != 2) {
            str = i2 != 3 ? "" : "course_relax";
        } else {
            str = "course_training";
        }
        Y0(new com.google.android.exoplayer2.source.d(a0(str), X(g1(i3)), a0("course_minute"), a0("course_target_bpm"), X(g1(i4)), a0("course_to"), X(g1(i5))));
    }

    public void P0(int i2, int i3) {
        k kVarA0 = a0("warning_tone");
        k kVarA1 = a0("you_have_completed");
        if (i2 != 0) {
            Y0(new com.google.android.exoplayer2.source.d(new com.google.android.exoplayer2.source.d(kVarA0, kVarA1, Z(h1((i2 / 10) * 10)), a0("number_unit"))));
            return;
        }
        if (i3 != 0) {
            k kVarA2 = a0("common_hour");
            k kVarA3 = a0("common_minute_2");
            int i4 = i3 / 3600;
            int i5 = (i3 % 3600) / 60;
            com.google.android.exoplayer2.source.d dVar = new com.google.android.exoplayer2.source.d(kVarA0, kVarA1);
            ArrayList arrayList = new ArrayList();
            arrayList.add(dVar);
            if (i4 > 0) {
                arrayList.add(new com.google.android.exoplayer2.source.d(Z(g1(i4)), kVarA2));
            }
            if (i5 > 0) {
                arrayList.add(new com.google.android.exoplayer2.source.d(Z(g1(i5)), kVarA3));
            }
            Y0(new com.google.android.exoplayer2.source.d((k[]) arrayList.toArray(new k[0])));
        }
    }

    public void Q(final int i2, final int i3) {
        this.e.post(new Runnable() { // from class: fvn
            @Override // java.lang.Runnable
            public final void run() {
                this.f18300a.k0(i2, i3);
            }
        });
    }

    public void Q0(final int i2, final int i3) {
        this.e.post(new Runnable() { // from class: yun
            @Override // java.lang.Runnable
            public final void run() {
                this.f40592a.t0(i2, i3);
            }
        });
    }

    public void R(final int i2, final int i3) {
        this.e.post(new Runnable() { // from class: tun
            @Override // java.lang.Runnable
            public final void run() {
                this.f35061a.l0(i2, i3);
            }
        });
    }

    public void R0(final int i2, final int i3, final int i4, final int i5, final int i6) {
        this.e.post(new Runnable() { // from class: lvn
            @Override // java.lang.Runnable
            public final void run() {
                this.f25477a.u0(i2, i3, i4, i5, i6);
            }
        });
    }

    public void S(int i2) {
        this.e.post(new Runnable() { // from class: gvn
            @Override // java.lang.Runnable
            public final void run() {
                this.f19377a.m0();
            }
        });
    }

    public void S0(final int i2, final int i3, final int i4) {
        this.e.post(new Runnable() { // from class: uun
            @Override // java.lang.Runnable
            public final void run() {
                this.f36161a.v0(i2, i3, i4);
            }
        });
    }

    public void T(int i2) {
        this.e.post(new Runnable() { // from class: pun
            @Override // java.lang.Runnable
            public final void run() {
                this.f30805a.n0();
            }
        });
    }

    public void T0() {
        this.e.post(new Runnable() { // from class: nun
            @Override // java.lang.Runnable
            public final void run() {
                this.f28385a.w0();
            }
        });
    }

    public void U(int i2) {
        this.e.post(new Runnable() { // from class: sun
            @Override // java.lang.Runnable
            public final void run() {
                this.f34006a.o0();
            }
        });
    }

    public void U0(final int i2, final int i3) {
        this.e.post(new Runnable() { // from class: xun
            @Override // java.lang.Runnable
            public final void run() {
                this.f39488a.x0(i2, i3);
            }
        });
    }

    public final k V(int i2, String str) {
        return new com.google.android.exoplayer2.source.d(a0(str), Z(g1(i2)), a0("cheer_achieved_reset"));
    }

    public void V0(final int i2, final int i3, final int i4, final int i5, final int i6) {
        this.e.post(new Runnable() { // from class: mvn
            @Override // java.lang.Runnable
            public final void run() {
                this.f27266a.y0(i2, i3, i4, i5, i6);
            }
        });
    }

    public final com.google.android.exoplayer2.source.d W(int i2, int i3, int i4, int i5, int i6) {
        k kVarA0 = a0("you_has_run");
        k kVarA1 = a0("kilometer_unit");
        k kVarA2 = a0("use_time");
        k kVarA3 = a0("common_minute");
        k kVarA4 = a0("common_second");
        return new com.google.android.exoplayer2.source.d(kVarA0, Z(g1(i2)), kVarA1, kVarA2, Z(g1(i3)), kVarA3, Z(c0(i4)), kVarA4, a0("last_kilometer_pace"), Z(g1(i5)), kVarA3, Z(c0(i6)), kVarA4);
    }

    public void W0(final int i2, final int i3, final int i4) {
        this.e.post(new Runnable() { // from class: zun
            @Override // java.lang.Runnable
            public final void run() {
                this.f41698a.z0(i2, i3, i4);
            }
        });
    }

    public final k X(String[] strArr) {
        k[] kVarArr = new k[strArr.length];
        for (int i2 = 0; i2 < strArr.length; i2++) {
            kVarArr[i2] = b0(this.f32949a.getResources().getIdentifier("course_" + strArr[i2], "raw", this.f32949a.getPackageName()));
        }
        return new com.google.android.exoplayer2.source.d(kVarArr);
    }

    public void X0() {
        this.e.post(new Runnable() { // from class: bvn
            @Override // java.lang.Runnable
            public final void run() {
                this.f4649a.A0();
            }
        });
    }

    public final void Y0(k kVar) {
        a1(kVar, false);
    }

    public final k Z(String[] strArr) {
        k[] kVarArr = new k[strArr.length];
        for (int i2 = 0; i2 < strArr.length; i2++) {
            kVarArr[i2] = a0("common_" + strArr[i2]);
        }
        return new com.google.android.exoplayer2.source.d(kVarArr);
    }

    public final void Z0(k kVar, boolean z) {
        a1(kVar, z);
    }

    public final k a0(String str) {
        String str2 = im9.A() + str + SportRemindConst.URL_TYPE_SUFFIX;
        Logger.i("SportRemindAudioHelper", "getMediaSourceByFileName wholePath=" + str2);
        Uri uriFromFile = Uri.fromFile(new File(str2));
        Logger.i("SportRemindAudioHelper", "getMediaSourceByFileName uri=" + uriFromFile);
        return this.f.a(m.b(uriFromFile));
    }

    public final void a1(k kVar, boolean z) {
        if (this.d.booleanValue()) {
            StringBuilder sb = new StringBuilder();
            sb.append("startPlayInterrupted: ");
            sb.append(this.c);
            if (this.c.booleanValue()) {
                if (!z) {
                    return;
                } else {
                    this.f32950b.stop();
                }
            }
            if (kVar != null) {
                this.f32950b.R0(kVar);
            }
        }
    }

    public final k b0(int i2) {
        return this.f.a(m.b(RawResourceDataSource.buildRawResourceUri(i2)));
    }

    public void b1() {
        this.e.post(new Runnable() { // from class: ovn
            @Override // java.lang.Runnable
            public final void run() {
                this.f29742a.B0();
            }
        });
    }

    public final String[] c0(int i2) {
        int iG = G(i2);
        h = iG;
        String[] strArrD0 = d0(iG);
        int i3 = h;
        return (i3 < 0 || i3 > 9) ? g1(i2) : strArrD0;
    }

    public void c1() {
        this.e.post(new Runnable() { // from class: oun
            @Override // java.lang.Runnable
            public final void run() {
                this.f29703a.C0();
            }
        });
    }

    public final String[] d0(int i2) {
        int iG = G(i2);
        h = iG;
        if (iG > 99) {
            h = 0;
        }
        String[] strArr = i;
        int i3 = h;
        return new String[]{strArr[i3 / 10], strArr[i3 % 10]};
    }

    public void d1() {
        this.e.post(new Runnable() { // from class: dvn
            @Override // java.lang.Runnable
            public final void run() {
                this.f15977a.D0();
            }
        });
    }

    public void e0(final int i2, final String str) {
        this.e.post(new Runnable() { // from class: nvn
            @Override // java.lang.Runnable
            public final void run() {
                this.f28486a.p0(i2, str);
            }
        });
    }

    public void e1() {
        this.e.post(new Runnable() { // from class: pvn
            @Override // java.lang.Runnable
            public final void run() {
                this.f30832a.E0();
            }
        });
    }

    public void f0() {
        this.e.post(new Runnable() { // from class: run
            @Override // java.lang.Runnable
            public final void run() {
                this.f32922a.q0();
            }
        });
    }

    public void f1() {
        this.e.post(new Runnable() { // from class: jvn
            @Override // java.lang.Runnable
            public final void run() {
                this.f23190a.F0();
            }
        });
    }

    public final /* synthetic */ void g0() {
        a1(a0("common_pause"), true);
    }

    public final String[] g1(int i2) {
        int iG = G(i2);
        h = iG;
        String[] strArrM = M(iG);
        if (h % 10 != 0) {
            strArrM = (String[]) Arrays.copyOfRange(strArrM, 0, strArrM.length - 1);
        }
        int i3 = h;
        return (i3 > 19 || i3 < 10) ? strArrM : (String[]) Arrays.copyOfRange(strArrM, 1, strArrM.length);
    }

    public final /* synthetic */ void h0() {
        a1(a0("common_rest"), true);
    }

    public final String[] h1(int i2) {
        int iH = H(i2);
        h = iH;
        String[] strArrN = N(iH);
        if (h % 10 != 0) {
            strArrN = (String[]) Arrays.copyOfRange(strArrN, 0, strArrN.length - 1);
        }
        int i3 = h;
        return (i3 > 19 || i3 < 10) ? strArrN : (String[]) Arrays.copyOfRange(strArrN, 1, strArrN.length);
    }

    public final /* synthetic */ void i0() {
        a1(a0("common_resume"), true);
    }

    public void i1(final int i2, final int i3) {
        this.e.post(new Runnable() { // from class: avn
            @Override // java.lang.Runnable
            public final void run() {
                this.f3494a.G0(i2, i3);
            }
        });
    }

    public final /* synthetic */ void j0(int i2) {
        a1(a0("common_" + i[i2]), true);
    }

    public void j1(final int i2, final int i3, final int i4, final int i5, final int i6) {
        this.e.post(new Runnable() { // from class: wun
            @Override // java.lang.Runnable
            public final void run() {
                this.f38385a.H0(i2, i3, i4, i5, i6);
            }
        });
    }

    public final /* synthetic */ void k0(int i2, int i3) {
        Y0(new com.google.android.exoplayer2.source.d(a0("current_pace"), Z(g1(i2)), a0("common_minute"), Z(c0(i3)), a0("common_second"), a0("speed_up")));
    }

    public void k1(final int i2, final int i3, final int i4) {
        this.e.post(new Runnable() { // from class: evn
            @Override // java.lang.Runnable
            public final void run() {
                this.f17114a.I0(i2, i3, i4);
            }
        });
    }

    public final /* synthetic */ void l0(int i2, int i3) {
        Y0(new com.google.android.exoplayer2.source.d(a0("current_speed"), Z(g1(i2)), a0("common_point"), Z(d0(i3)), a0("kilometer_per_hour"), a0("speed_up")));
    }

    public void l1() {
        this.e.post(new Runnable() { // from class: cvn
            @Override // java.lang.Runnable
            public final void run() {
                this.f14777a.J0();
            }
        });
    }

    public final /* synthetic */ void m0() {
        Y0(a0("heart_rate_max"));
    }

    public final /* synthetic */ void n0() {
        Y0(a0("heart_rate_min"));
    }

    public final /* synthetic */ void o0() {
        Y0(a0("heart_rate_over"));
    }

    public final /* synthetic */ void p0(int i2, String str) {
        Y0(new com.google.android.exoplayer2.source.d(a0("heart_cur_rate"), Z(g1(i2)), a0("heart_cur_rate_per_minute"), a0("heart_cur_rate_certain"), a0(str), a0("heart_cur_rate_keep")));
    }

    public final /* synthetic */ void q0() {
        t tVarX = new t.b(this.f32949a).x();
        this.f32950b = tVarX;
        tVarX.z(true);
        this.f32950b.t(new a());
        this.d = Boolean.TRUE;
    }

    public final /* synthetic */ void t0(int i2, int i3) {
        k kVarA0;
        k kVarZ;
        k kVarA1 = a0("you_has_riding");
        k kVarA2 = a0("long_riding_record");
        if (i2 != 0) {
            kVarA0 = a0("kilometer_unit");
            kVarZ = Z(g1(i2));
        } else {
            k kVarA3 = a0("common_minute_2");
            k kVarZ2 = Z(g1(i3));
            kVarA0 = kVarA3;
            kVarZ = kVarZ2;
        }
        Y0(new com.google.android.exoplayer2.source.d(kVarA1, kVarZ, kVarA0, kVarA2));
    }

    public final /* synthetic */ void u0(int i2, int i3, int i4, int i5, int i6) {
        k kVarA0 = a0("you_has_riding");
        k kVarA1 = a0("kilometer_unit");
        k kVarA2 = a0("use_time");
        k kVarA3 = a0("common_minute");
        k kVarA4 = a0("common_second");
        k kVarA5 = a0("last_kilometer_speed");
        k kVarA6 = a0("kilometer_per_hour");
        Y0(new com.google.android.exoplayer2.source.d(kVarA0, Z(g1(i2)), kVarA1, kVarA2, Z(g1(i3)), kVarA3, Z(g1(i4)), kVarA4, kVarA5, Z(g1(i5)), a0("common_point"), Z(d0(i6)), kVarA6));
    }

    public final /* synthetic */ void v0(int i2, int i3, int i4) {
        Y0(new com.google.android.exoplayer2.source.d(a0("you_has_riding"), Z(g1(i2)), a0("kilometer_unit"), a0("use_time"), Z(g1(i3)), a0("common_minute"), Z(c0(i4)), a0("common_second")));
    }

    public final /* synthetic */ void w0() {
        a1(a0("stop_running"), true);
    }

    public final /* synthetic */ void x0(int i2, int i3) {
        k kVarA0;
        k kVarZ;
        k kVarA1 = a0("you_has_run");
        k kVarA2 = a0("long_runing_record");
        if (i2 != 0) {
            kVarA0 = a0("kilometer_unit");
            kVarZ = Z(g1(i2));
        } else {
            k kVarA3 = a0("common_minute_2");
            k kVarZ2 = Z(g1(i3));
            kVarA0 = kVarA3;
            kVarZ = kVarZ2;
        }
        Y0(new com.google.android.exoplayer2.source.d(kVarA1, kVarZ, kVarA0, kVarA2));
    }

    public final /* synthetic */ void y0(int i2, int i3, int i4, int i5, int i6) {
        Y0(W(i2, i3, i4, i5, i6));
    }

    public final /* synthetic */ void z0(int i2, int i3, int i4) {
        Y0(new com.google.android.exoplayer2.source.d(a0("you_has_run"), Z(g1(i2)), a0("kilometer_unit"), a0("use_time"), Z(g1(i3)), a0("common_minute"), Z(g1(i4)), a0("common_second")));
    }
}
