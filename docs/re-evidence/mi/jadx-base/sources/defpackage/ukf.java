package defpackage;

import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import com.google.android.exoplayer2.q;
import com.google.android.exoplayer2.source.p;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.wearable.sport.GoalAchieved;
import com.xiaomi.wearable.sport.SportRemindConst;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class ukf {
    public static volatile ukf h;
    public static int i;
    public static String[] j = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static String[] f35872k = {"zhanwei", "ten", "hundred", "thousand", "wan"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f35873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public d f35874b;
    public Boolean c;
    public Boolean d;
    public Handler e;
    public p.b f;
    public q.c g;

    public class a implements q.c {
        public a() {
        }

        @Override // com.google.android.exoplayer2.q.c
        public void onPlayerStateChanged(boolean z, int i) {
            StringBuilder sb = new StringBuilder();
            sb.append("onPlayerStateChanged: ");
            sb.append(ukf.this.c);
            sb.append(" , state = ");
            sb.append(i);
            sb.append(",");
            sb.append(ukf.h);
            if (i == 4 || i == 1) {
                ukf.this.c = Boolean.FALSE;
            } else if (i == 2 || i == 3) {
                ukf.this.c = Boolean.TRUE;
            }
        }
    }

    public static class b extends c {
        public b(c... cVarArr) {
            super("");
            this.f35876a.clear();
            ArrayList arrayList = new ArrayList();
            for (c cVar : cVarArr) {
                arrayList.addAll(cVar.f35876a);
            }
            this.f35876a.addAll(arrayList);
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public List<String> f35876a;

        public c(String str) {
            ArrayList arrayList = new ArrayList();
            this.f35876a = arrayList;
            arrayList.add(str);
        }
    }

    public class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public MediaPlayer f35877a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public c f35878b;
        public int c;

        public class a implements MediaPlayer.OnPreparedListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ ukf f35879a;

            public a(ukf ukfVar) {
                this.f35879a = ukfVar;
            }

            @Override // android.media.MediaPlayer.OnPreparedListener
            public void onPrepared(MediaPlayer mediaPlayer) {
                mediaPlayer.start();
            }
        }

        public class b implements MediaPlayer.OnErrorListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ ukf f35881a;

            public b(ukf ukfVar) {
                this.f35881a = ukfVar;
            }

            @Override // android.media.MediaPlayer.OnErrorListener
            public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
                return false;
            }
        }

        public class c implements MediaPlayer.OnCompletionListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ ukf f35883a;

            public c(ukf ukfVar) {
                this.f35883a = ukfVar;
            }

            @Override // android.media.MediaPlayer.OnCompletionListener
            public void onCompletion(MediaPlayer mediaPlayer) {
                d.this.d();
            }
        }

        public d() {
            MediaPlayer mediaPlayer = new MediaPlayer();
            this.f35877a = mediaPlayer;
            this.f35878b = null;
            this.c = 0;
            mediaPlayer.setOnPreparedListener(new a(ukf.this));
            this.f35877a.setOnErrorListener(new b(ukf.this));
            this.f35877a.setOnCompletionListener(new c(ukf.this));
        }

        public final Uri b(String str) {
            String strA = im9.A();
            Uri uriFromFile = Uri.fromFile(new File(strA + str + SportRemindConst.URL_TYPE_SUFFIX));
            Logger.i("MediaPlayHelper", "getUriByFileName dirPath=" + strA + " uri=" + uriFromFile);
            return uriFromFile;
        }

        public boolean c() {
            MediaPlayer mediaPlayer = this.f35877a;
            if (mediaPlayer != null) {
                return mediaPlayer.isPlaying();
            }
            return false;
        }

        public final void d() {
            c cVar = this.f35878b;
            if (cVar != null && this.c < cVar.f35876a.size()) {
                String str = this.f35878b.f35876a.get(this.c);
                this.c++;
                Uri uriB = b(str);
                try {
                    this.f35877a.reset();
                    this.f35877a.setDataSource(ukf.this.f35873a, uriB);
                    this.f35877a.prepareAsync();
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }

        public void e(c cVar) {
            this.f35878b = cVar;
            this.c = 0;
            d();
        }

        public void f() {
            this.f35877a.stop();
            this.c = 0;
        }
    }

    public ukf(Context context) {
        Boolean bool = Boolean.FALSE;
        this.c = bool;
        this.d = bool;
        this.e = new Handler(Looper.getMainLooper());
        this.g = new a();
        Logger.i("MediaPlayHelper", "SportRemindAudioHelper()");
        this.f35873a = context;
        a0();
    }

    public static int I(int i2) {
        if (i2 < 0 || i2 > 1000) {
            return 0;
        }
        return i2;
    }

    public static String[] M(int i2) {
        int I = I(i2);
        i = I;
        if (I == 0) {
            return new String[]{"zero"};
        }
        String strValueOf = String.valueOf(I);
        ArrayList arrayList = new ArrayList();
        char[] charArray = strValueOf.toCharArray();
        int length = charArray.length;
        for (int i3 = 0; i3 < length; i3++) {
            int i4 = charArray[i3] - '0';
            if (i4 != 0) {
                arrayList.add(j[i4]);
                arrayList.add(f35872k[(length - i3) - 1]);
            } else if (i3 != length - 1 && charArray[i3 + 1] != '0') {
                arrayList.add(j[i4]);
            }
        }
        int size = arrayList.size();
        String[] strArr = new String[size];
        for (int i5 = 0; i5 < size; i5++) {
            strArr[i5] = (String) arrayList.get(i5);
        }
        return strArr;
    }

    public static ukf U(Context context) {
        if (h == null) {
            synchronized (ukf.class) {
                try {
                    if (h == null) {
                        h = new ukf(context.getApplicationContext());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        Logger.i("MediaPlayHelper", "SportRemindAudioHelp ------ getInstance" + h);
        return h;
    }

    public final /* synthetic */ void A0(int i2, int i3) {
        c cVarW;
        c cVarV;
        c cVarW2 = W("you_has_walk");
        c cVarW3 = W("long_walking_record");
        if (i2 != 0) {
            cVarW = W("kilometer_unit");
            cVarV = V(Z0(i2));
        } else {
            c cVarW4 = W("common_minute_2");
            c cVarV2 = V(Z0(i3));
            cVarW = cVarW4;
            cVarV = cVarV2;
        }
        S0(new b(cVarW2, cVarV, cVarW, cVarW3));
    }

    public final /* synthetic */ void B0(int i2, int i3, int i4, int i5, int i6) {
        c cVarW = W("you_has_walk");
        c cVarW2 = W("kilometer_unit");
        c cVarW3 = W("use_time");
        c cVarW4 = W("common_minute");
        c cVarW5 = W("common_second");
        S0(new b(cVarW, V(Z0(i2)), cVarW2, cVarW3, V(Z0(i3)), cVarW4, V(Z0(i4)), cVarW5, W("last_kilometer_pace"), V(Z0(i5)), cVarW4, V(Z0(i6)), cVarW5));
    }

    public final /* synthetic */ void C0(int i2, int i3, int i4) {
        S0(new b(W("you_has_walk"), V(Z0(i2)), W("kilometer_unit"), W("use_time"), V(Z0(i3)), W("common_minute"), V(Z0(i4)), W("common_second")));
    }

    public final /* synthetic */ void D0() {
        T0(W("stop_running"), true);
    }

    public final /* synthetic */ void E0() {
        S0(W("gps_weakness"));
    }

    public void F0() {
    }

    public void G0(final GoalAchieved goalAchieved) {
        this.e.post(new Runnable() { // from class: kkf
            @Override // java.lang.Runnable
            public final void run() {
                this.f23949a.l0(goalAchieved);
            }
        });
    }

    /* JADX INFO: renamed from: H0, reason: merged with bridge method [inline-methods] */
    public final void l0(GoalAchieved goalAchieved) {
        c cVarW;
        c cVarW2;
        c cVarW3;
        b bVar;
        int i2 = goalAchieved.percent;
        if (i2 < 50 || i2 == 80) {
            return;
        }
        c cVarW4 = W("warning_tone");
        c cVarW5 = W("common_minute");
        c cVarW6 = W("common_second");
        int i3 = goalAchieved.sportType;
        if (i3 != 2) {
            cVarW = i3 != 6 ? W("you_has_run") : W("you_has_riding");
        } else {
            cVarW = W("you_has_walk");
        }
        c cVar = cVarW;
        c cVarW7 = W("kilometer_unit");
        c cVarW8 = W("use_time");
        njh<Integer, Integer> njhVarA = r2h.a(goalAchieved.distance / 1000.0f);
        c cVarW9 = W("common_point");
        b bVar2 = new b(cVarW4, cVar, V(Z0(njhVarA.f27979a.intValue())), cVarW9, V(Z0(njhVarA.f27980b.intValue())), cVarW7, cVarW8, V(Z0(goalAchieved.minute)), cVarW5, V(X(goalAchieved.second)), cVarW6);
        int i4 = goalAchieved.goalType;
        if (i4 == 2) {
            int i5 = (int) goalAchieved.achieved;
            int i6 = goalAchieved.percent;
            if (i6 == 100) {
                bVar = new b(cVarW4, W("congrats_you_complete"), V(Z0(i5)), W("kcal_unit"), W("kcal_west_goal"), W("use_time"), V(Z0(goalAchieved.minute)), cVarW5, V(X(goalAchieved.second)), cVarW6);
            } else {
                if (i6 >= 150) {
                    cVarW3 = S(i6, "cheer_achieved_calorie");
                } else {
                    cVarW3 = W("cheer_achieved_calorie_" + goalAchieved.percent);
                }
                bVar = new b(bVar2, cVarW3);
            }
            S0(bVar);
            return;
        }
        int i7 = goalAchieved.percent;
        if (i7 == 100) {
            if (i4 != 1) {
                njh<Integer, Integer> njhVarA2 = r2h.a(goalAchieved.total);
                S0(new b(cVarW4, W("congrats_you_complete"), V(Z0(njhVarA2.f27979a.intValue())), cVarW9, V(Z0(njhVarA2.f27980b.intValue())), W("kilometer_unit"), W("cheer_achieved_distance_goal"), W("use_time"), V(Z0(goalAchieved.minute)), cVarW5, V(X(goalAchieved.second)), cVarW6));
                return;
            }
            njh<Integer, Integer> njhVarA3 = r2h.a(goalAchieved.distance / 1000.0f);
            Logger.i("MediaPlayHelper", njhVarA3.f27979a + "---" + njhVarA3.f27980b);
            S0(new b(cVarW4, W("congrats_you_complete"), V(Z0(goalAchieved.minute)), cVarW5, V(X(goalAchieved.second)), cVarW6, W("cheer_achieved_distance_goal"), W("cheer_achieved_minute_distance"), V(Z0(njhVarA3.f27979a.intValue())), cVarW9, V(Z0(njhVarA3.f27980b.intValue())), W("kilometer_unit")));
            return;
        }
        if (i4 == 1) {
            if (i7 >= 150) {
                cVarW2 = S(i7, "cheer_achieved_minute");
            } else {
                cVarW2 = W("cheer_achieved_minute_" + goalAchieved.percent);
            }
        } else if (i7 >= 150) {
            cVarW2 = S(i7, "cheer_achieved_distance");
        } else {
            cVarW2 = W("cheer_achieved_distance_" + goalAchieved.percent);
        }
        S0(new b(bVar2, cVarW2));
    }

    public void I0(int i2, int i3) {
        S0(W("goal_pause"));
    }

    public void J() {
        this.e.post(new Runnable() { // from class: rkf
            @Override // java.lang.Runnable
            public final void run() {
                this.f32636a.b0();
            }
        });
    }

    public void J0() {
        this.e.post(new Runnable() { // from class: tkf
            @Override // java.lang.Runnable
            public final void run() {
                this.f34790a.m0();
            }
        });
    }

    public void K() {
        this.e.post(new Runnable() { // from class: yjf
            @Override // java.lang.Runnable
            public final void run() {
                this.f40241a.c0();
            }
        });
    }

    public void K0(final int i2, final int i3) {
        this.e.post(new Runnable() { // from class: ckf
            @Override // java.lang.Runnable
            public final void run() {
                this.f5423a.n0(i2, i3);
            }
        });
    }

    public void L(final int i2) {
        this.e.post(new Runnable() { // from class: lkf
            @Override // java.lang.Runnable
            public final void run() {
                this.f25171a.d0(i2);
            }
        });
    }

    public void L0(final int i2, final int i3, final int i4, final int i5, final int i6) {
        this.e.post(new Runnable() { // from class: dkf
            @Override // java.lang.Runnable
            public final void run() {
                this.f15617a.o0(i2, i3, i4, i5, i6);
            }
        });
    }

    public void M0(final int i2, final int i3, final int i4) {
        this.e.post(new Runnable() { // from class: qjf
            @Override // java.lang.Runnable
            public final void run() {
                this.f31567a.p0(i2, i3, i4);
            }
        });
    }

    public void N(final int i2, final int i3) {
        this.e.post(new Runnable() { // from class: xjf
            @Override // java.lang.Runnable
            public final void run() {
                this.f39184a.e0(i2, i3);
            }
        });
    }

    public void N0() {
        this.e.post(new Runnable() { // from class: wjf
            @Override // java.lang.Runnable
            public final void run() {
                this.f38028a.q0();
            }
        });
    }

    public void O(final int i2, final int i3) {
        this.e.post(new Runnable() { // from class: fkf
            @Override // java.lang.Runnable
            public final void run() {
                this.f17872a.f0(i2, i3);
            }
        });
    }

    public void O0(final int i2, final int i3) {
        this.e.post(new Runnable() { // from class: rjf
            @Override // java.lang.Runnable
            public final void run() {
                this.f32603a.r0(i2, i3);
            }
        });
    }

    public void P(int i2) {
        this.e.post(new Runnable() { // from class: mkf
            @Override // java.lang.Runnable
            public final void run() {
                this.f26958a.g0();
            }
        });
    }

    public void P0(final int i2, final int i3, final int i4, final int i5, final int i6) {
        this.e.post(new Runnable() { // from class: okf
            @Override // java.lang.Runnable
            public final void run() {
                this.f29249a.s0(i2, i3, i4, i5, i6);
            }
        });
    }

    public void Q(int i2) {
        this.e.post(new Runnable() { // from class: ikf
            @Override // java.lang.Runnable
            public final void run() {
                this.f21253a.h0();
            }
        });
    }

    public void Q0(final int i2, final int i3, final int i4) {
        this.e.post(new Runnable() { // from class: qkf
            @Override // java.lang.Runnable
            public final void run() {
                this.f31602a.t0(i2, i3, i4);
            }
        });
    }

    public void R(int i2) {
        this.e.post(new Runnable() { // from class: akf
            @Override // java.lang.Runnable
            public final void run() {
                this.f1130a.i0();
            }
        });
    }

    public void R0() {
        this.e.post(new Runnable() { // from class: zjf
            @Override // java.lang.Runnable
            public final void run() {
                this.f41346a.u0();
            }
        });
    }

    public final c S(int i2, String str) {
        return new b(W(str), V(Z0(i2)), W("cheer_achieved_reset"));
    }

    public final void S0(c cVar) {
        T0(cVar, false);
    }

    public final b T(int i2, int i3, int i4, int i5, int i6) {
        c cVarW = W("you_has_run");
        c cVarW2 = W("kilometer_unit");
        c cVarW3 = W("use_time");
        c cVarW4 = W("common_minute");
        c cVarW5 = W("common_second");
        return new b(cVarW, V(Z0(i2)), cVarW2, cVarW3, V(Z0(i3)), cVarW4, V(X(i4)), cVarW5, W("last_kilometer_pace"), V(Z0(i5)), cVarW4, V(X(i6)), cVarW5);
    }

    public final void T0(c cVar, boolean z) {
        if (this.d.booleanValue()) {
            StringBuilder sb = new StringBuilder();
            sb.append("startPlayInterrupted: ");
            sb.append(this.c);
            sb.append(",");
            sb.append(h);
            if (this.f35874b.c()) {
                if (!z) {
                    return;
                }
                this.f35874b.f();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Stop Play,");
                sb2.append(h);
            }
            if (cVar != null) {
                this.f35874b.e(cVar);
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Start Play , ");
                sb3.append(h);
            }
        }
    }

    public void U0() {
        this.e.post(new Runnable() { // from class: skf
            @Override // java.lang.Runnable
            public final void run() {
                this.f33734a.v0();
            }
        });
    }

    public final c V(String[] strArr) {
        c[] cVarArr = new c[strArr.length];
        for (int i2 = 0; i2 < strArr.length; i2++) {
            cVarArr[i2] = W("common_" + strArr[i2]);
        }
        return new b(cVarArr);
    }

    public void V0() {
        this.e.post(new Runnable() { // from class: gkf
            @Override // java.lang.Runnable
            public final void run() {
                this.f19083a.w0();
            }
        });
    }

    public final c W(String str) {
        Logger.i("MediaPlayHelper", "(fileName):" + str + ",factory:" + this.f);
        return new c(str);
    }

    public void W0() {
        this.e.post(new Runnable() { // from class: pkf
            @Override // java.lang.Runnable
            public final void run() {
                this.f30498a.x0();
            }
        });
    }

    public final String[] X(int i2) {
        int I = I(i2);
        i = I;
        String[] strArrY = Y(I);
        int i3 = i;
        return (i3 < 0 || i3 > 9) ? Z0(i2) : strArrY;
    }

    public void X0() {
        this.e.post(new Runnable() { // from class: jkf
            @Override // java.lang.Runnable
            public final void run() {
                this.f22893a.y0();
            }
        });
    }

    public final String[] Y(int i2) {
        int I = I(i2);
        i = I;
        if (I > 99) {
            i = 0;
        }
        String[] strArr = j;
        int i3 = i;
        return new String[]{strArr[i3 / 10], strArr[i3 % 10]};
    }

    public void Y0() {
        this.e.post(new Runnable() { // from class: vjf
            @Override // java.lang.Runnable
            public final void run() {
                this.f36947a.z0();
            }
        });
    }

    public void Z(final int i2, final String str) {
        this.e.post(new Runnable() { // from class: bkf
            @Override // java.lang.Runnable
            public final void run() {
                this.f4312a.j0(i2, str);
            }
        });
    }

    public final String[] Z0(int i2) {
        int I = I(i2);
        i = I;
        String[] strArrM = M(I);
        if (i % 10 != 0) {
            strArrM = (String[]) Arrays.copyOfRange(strArrM, 0, strArrM.length - 1);
        }
        int i3 = i;
        return (i3 > 19 || i3 < 10) ? strArrM : (String[]) Arrays.copyOfRange(strArrM, 1, strArrM.length);
    }

    public void a0() {
        this.e.post(new Runnable() { // from class: hkf
            @Override // java.lang.Runnable
            public final void run() {
                this.f20165a.k0();
            }
        });
    }

    public void a1(final int i2, final int i3) {
        this.e.post(new Runnable() { // from class: tjf
            @Override // java.lang.Runnable
            public final void run() {
                this.f34762a.A0(i2, i3);
            }
        });
    }

    public final /* synthetic */ void b0() {
        T0(W("common_pause"), true);
    }

    public void b1(final int i2, final int i3, final int i4, final int i5, final int i6) {
        this.e.post(new Runnable() { // from class: sjf
            @Override // java.lang.Runnable
            public final void run() {
                this.f33703a.B0(i2, i3, i4, i5, i6);
            }
        });
    }

    public final /* synthetic */ void c0() {
        T0(W("common_resume"), true);
    }

    public void c1(final int i2, final int i3, final int i4) {
        this.e.post(new Runnable() { // from class: ujf
            @Override // java.lang.Runnable
            public final void run() {
                this.f35820a.C0(i2, i3, i4);
            }
        });
    }

    public final /* synthetic */ void d0(int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append("NUM:");
        sb.append(i2);
        sb.append(",");
        sb.append(this.f35873a.getResources().getIdentifier("common_" + j[i2], "raw", this.f35873a.getPackageName()));
        sb.append(",this:");
        sb.append(this);
        Logger.i("MediaPlayHelper", sb.toString());
        T0(W("common_" + j[i2]), true);
    }

    public void d1() {
        this.e.post(new Runnable() { // from class: ekf
            @Override // java.lang.Runnable
            public final void run() {
                this.f16737a.D0();
            }
        });
    }

    public final /* synthetic */ void e0(int i2, int i3) {
        S0(new b(W("current_pace"), V(Z0(i2)), W("common_minute"), V(X(i3)), W("common_second"), W("speed_up")));
    }

    public void e1() {
        this.e.post(new Runnable() { // from class: nkf
            @Override // java.lang.Runnable
            public final void run() {
                this.f28013a.E0();
            }
        });
    }

    public final /* synthetic */ void f0(int i2, int i3) {
        S0(new b(W("current_speed"), V(Z0(i2)), W("common_point"), V(Y(i3)), W("kilometer_per_hour"), W("speed_up")));
    }

    public final /* synthetic */ void g0() {
        S0(W("heart_rate_max"));
    }

    public final /* synthetic */ void h0() {
        S0(W("heart_rate_min"));
    }

    public final /* synthetic */ void i0() {
        S0(W("heart_rate_over"));
    }

    public final /* synthetic */ void j0(int i2, String str) {
        S0(new b(W("heart_cur_rate"), V(Z0(i2)), W("heart_cur_rate_per_minute"), W("heart_cur_rate_certain"), W(str), W("heart_cur_rate_keep")));
    }

    public final /* synthetic */ void k0() {
        this.f35874b = new d();
        this.d = Boolean.TRUE;
    }

    public final /* synthetic */ void m0() {
        S0(W("gps_recovery"));
    }

    public final /* synthetic */ void n0(int i2, int i3) {
        c cVarW;
        c cVarV;
        c cVarW2 = W("you_has_riding");
        c cVarW3 = W("long_riding_record");
        if (i2 != 0) {
            cVarW = W("kilometer_unit");
            cVarV = V(Z0(i2));
        } else {
            c cVarW4 = W("common_minute_2");
            c cVarV2 = V(Z0(i3));
            cVarW = cVarW4;
            cVarV = cVarV2;
        }
        S0(new b(cVarW2, cVarV, cVarW, cVarW3));
    }

    public final /* synthetic */ void o0(int i2, int i3, int i4, int i5, int i6) {
        c cVarW = W("you_has_riding");
        c cVarW2 = W("kilometer_unit");
        c cVarW3 = W("use_time");
        c cVarW4 = W("common_minute");
        c cVarW5 = W("common_second");
        c cVarW6 = W("last_kilometer_speed");
        c cVarW7 = W("kilometer_per_hour");
        S0(new b(cVarW, V(Z0(i2)), cVarW2, cVarW3, V(Z0(i3)), cVarW4, V(Z0(i4)), cVarW5, cVarW6, V(Z0(i5)), W("common_point"), V(Y(i6)), cVarW7));
    }

    public final /* synthetic */ void p0(int i2, int i3, int i4) {
        S0(new b(W("you_has_riding"), V(Z0(i2)), W("kilometer_unit"), W("use_time"), V(Z0(i3)), W("common_minute"), V(X(i4)), W("common_second")));
    }

    public final /* synthetic */ void q0() {
        T0(W("stop_running"), true);
    }

    public final /* synthetic */ void r0(int i2, int i3) {
        c cVarW;
        c cVarV;
        c cVarW2 = W("you_has_run");
        c cVarW3 = W("long_runing_record");
        if (i2 != 0) {
            cVarW = W("kilometer_unit");
            cVarV = V(Z0(i2));
        } else {
            c cVarW4 = W("common_minute_2");
            c cVarV2 = V(Z0(i3));
            cVarW = cVarW4;
            cVarV = cVarV2;
        }
        S0(new b(cVarW2, cVarV, cVarW, cVarW3));
    }

    public final /* synthetic */ void s0(int i2, int i3, int i4, int i5, int i6) {
        S0(T(i2, i3, i4, i5, i6));
    }

    public final /* synthetic */ void t0(int i2, int i3, int i4) {
        S0(new b(W("you_has_run"), V(Z0(i2)), W("kilometer_unit"), W("use_time"), V(Z0(i3)), W("common_minute"), V(Z0(i4)), W("common_second")));
    }

    public final /* synthetic */ void u0() {
        T0(W("stop_running"), true);
    }

    public final /* synthetic */ void v0() {
        T0(W("start_running"), true);
    }

    public final /* synthetic */ void w0() {
        T0(W("start_running"), true);
    }

    public final /* synthetic */ void x0() {
        T0(W("start_running"), true);
    }

    public final /* synthetic */ void y0() {
        T0(W("start_running"), true);
    }

    public final /* synthetic */ void z0() {
        T0(W("stop_running"), true);
    }
}
