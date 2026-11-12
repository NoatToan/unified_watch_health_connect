package defpackage;

import android.util.Pair;
import com.google.gson.annotations.SerializedName;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.ReleaseLogUtil;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class vhm {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private transient Pair<Integer, Integer> f51109b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("currentWindow")
    private e f51110c;
    private transient Pair<Integer, Integer> e;

    @SerializedName("endTime")
    private long f;

    @SerializedName("fastingLiteMode")
    private vhc g;

    @SerializedName("fastingLitePhases")
    private List<e> h;
    private volatile transient boolean l;
    private transient e n;

    @SerializedName("startTime")
    private long p;
    private transient e q;

    @SerializedName("note")
    private String t = "";

    @SerializedName("isRunning")
    private volatile boolean m = false;

    @SerializedName("eatingWindow")
    private long d = 0;

    @SerializedName("fastingWindow")
    private long j = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("baseTime")
    private long f51108a = 0;

    @SerializedName("lastTunnedTime")
    private long o = 0;
    private volatile transient List<e> i = new ArrayList();
    private final Object k = new Object();

    vhm() {
    }

    public vhm(vhc vhcVar) {
        this.g = vhcVar;
        q();
    }

    public boolean q() {
        if (this.l) {
            LogUtil.a("FastingLiteTask", "fasting lite task is starting");
            return false;
        }
        this.l = true;
        vhc vhcVar = this.g;
        if (vhcVar == null) {
            LogUtil.j("FastingLiteTask", "fasting lite mode is null");
            this.l = false;
            return false;
        }
        vhi vhiVarD = vhcVar.d();
        if (vhiVarD == null) {
            LogUtil.j("FastingLiteTask", "start task fail, illegal fastingLite mode");
            this.m = false;
            this.l = false;
            uxb.c().g();
            return false;
        }
        this.f51108a = vhiVarD.a() * 1000;
        this.d = vhiVarD.b() * 1000;
        this.j = (vhiVarD.c() * 1000) - this.d;
        this.f51109b = vhiVarD.e();
        this.e = vhiVarD.d();
        if (this.d == 0 || this.j == 0) {
            LogUtil.j("FastingLiteTask", "mEatingWindow or mFastingWindow = 0");
            this.m = false;
            this.l = false;
            uxb.c().g();
            return false;
        }
        aa();
        this.m = true;
        LogUtil.a("FastingLiteTask", "start task complete, update task");
        u();
        c();
        LogUtil.a("FastingLiteTask", "start task at ", DateFormatUtil.d(this.p, DateFormatUtil.DateFormatType.DEFAULT_DATE_FORMAT), ",head ", this.n, ",tail ", this.q, ",mode ", this.g);
        this.l = false;
        return true;
    }

    private void aa() {
        synchronized (this.k) {
            ab();
            if (njy.b(this.i)) {
                LogUtil.j("FastingLiteTask", "init head and tail from mFastingLiteWindows");
                ac();
            } else {
                if (this.f51110c != null) {
                    this.f51110c = null;
                }
                LogUtil.a("FastingLiteTask", "start generateNewWindow");
                z();
            }
        }
    }

    private void ab() {
        if (njy.e(this.i) && njy.b(this.h)) {
            LogUtil.a("FastingLiteTask", "mFastingLiteNewWindows merge mFastingLiteWindows");
            this.i.addAll(this.h);
        } else {
            LogUtil.a("FastingLiteTask", "has merge complete");
        }
    }

    public void t() {
        ai();
        u();
        c();
    }

    public void c(long j, long j2) {
        long j3 = j * 1000;
        this.d = j3;
        this.j = (1000 * j2) - j3;
        vhc vhcVar = this.g;
        if (vhcVar == null || vhcVar.d() == null) {
            return;
        }
        this.g.d().d(j);
        this.g.d().b(j2);
        this.f51109b = this.g.d().e();
        this.e = this.g.d().d();
    }

    public void b(long j) {
        long j2 = j / 1000;
        if (this.f51108a == j2) {
            LogUtil.j("FastingLiteTask", "baseTime is same to currentBaseTime");
            return;
        }
        LogUtil.a("FastingLiteTask", "setBaseTime ", Long.valueOf(j));
        vhc vhcVar = this.g;
        if (vhcVar == null || vhcVar.d() == null) {
            LogUtil.j("FastingLiteTask", "illegal state, can not set base time");
        } else {
            this.g.d().e(j2);
            e(j);
        }
    }

    public void c() {
        if (!this.m && this.f51110c == null) {
            LogUtil.j("FastingLiteTask", "setBaseTime fail illegal state");
            return;
        }
        ArrayList arrayList = new ArrayList();
        e eVar = this.f51110c;
        if (eVar != null && !eVar.j()) {
            arrayList.add(new vhk(this.f51110c.f / 1000, this.f51110c.f51113c / 1000));
        }
        vhl.e().b(arrayList, this.g.d());
    }

    public void r() {
        this.m = false;
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jC = vhn.c(this.g.d());
        if (jC > 0) {
            jCurrentTimeMillis = Math.min(jC, jCurrentTimeMillis);
        }
        e eVar = this.q;
        if (eVar != null) {
            eVar.e(jCurrentTimeMillis, true);
        }
        ae();
        this.f = jCurrentTimeMillis;
        LogUtil.a("FastingLiteTask", "stop task time ", Long.valueOf(jCurrentTimeMillis));
        vhl.e().c();
    }

    private void ae() {
        synchronized (this.k) {
            for (e eVar : this.i) {
                if (eVar.e) {
                    LogUtil.a("FastingLiteTask", "setSaveWindowTime current window is new window");
                } else {
                    if (this.p != eVar.c()) {
                        eVar.b(this.p, true);
                    }
                    if (eVar.a() == 0 && eVar.b() == 0) {
                        eVar.a(eVar.f());
                        eVar.e(eVar.f());
                    }
                    eVar.i();
                }
            }
        }
    }

    public boolean s() {
        return this.q != null && this.m && this.q.f51113c >= this.o;
    }

    public boolean l() {
        vhc vhcVarJ = j();
        if (vhcVarJ == null) {
            return false;
        }
        long jC = vhn.c(vhcVarJ.d());
        return jC > 0 && System.currentTimeMillis() >= jC;
    }

    public boolean p() {
        return this.m;
    }

    public void d(boolean z) {
        this.m = z;
    }

    public long b() {
        if (!this.m) {
            LogUtil.j("FastingLiteTask", "getCurrentPhaseStartTime task not running");
            return -1L;
        }
        e eVar = this.f51110c;
        if (eVar != null) {
            return eVar.f;
        }
        return -1L;
    }

    public long e() {
        if (!this.m) {
            LogUtil.j("FastingLiteTask", "getCurrentPhaseEndTime task not running");
            return -1L;
        }
        e eVar = this.f51110c;
        if (eVar == null) {
            return -1L;
        }
        return eVar.f51113c;
    }

    public long m() {
        if (!this.m) {
            LogUtil.j("FastingLiteTask", "getPrePhaseStartTime task not running");
            return -1L;
        }
        e eVar = this.q;
        if (eVar == null || eVar.o == null) {
            e eVar2 = this.q;
            if (eVar2 != null) {
                return lsl.r(eVar2.f);
            }
            return -1L;
        }
        return this.q.o.f;
    }

    public void c(long j) {
        LogUtil.j("FastingLiteTask", "resetCurrentPhaseStartTime ", Long.valueOf(j));
        if (!this.m) {
            LogUtil.j("FastingLiteTask", "resetCurrentPhase task not running");
            return;
        }
        u();
        e eVar = this.q;
        if (eVar == null || this.n == null) {
            LogUtil.j("FastingLiteTask", "resetCurrentPhaseStartTime tail or mHead is null");
            return;
        }
        eVar.c(j, true);
        if (this.q.o == null) {
            LogUtil.j("FastingLiteTask", "reset start time");
            this.p = j;
            this.n.c(j, true);
            return;
        }
        this.q.o.e(j, true);
    }

    public vhc j() {
        return this.g;
    }

    public String i() {
        return this.t;
    }

    public void e(String str) {
        this.t = str;
    }

    public long o() {
        return this.p;
    }

    public long h() {
        return this.f;
    }

    public int d() {
        return (int) ((this.d / 1000) / 3600);
    }

    public int g() {
        return (int) ((this.j / 1000) / 3600);
    }

    private void ac() {
        this.n = this.i.get(0);
        this.m = true;
        this.q = this.i.get(this.i.size() - 1);
        e eVar = this.n;
        for (int i = 1; i < this.i.size(); i++) {
            if (this.i.get(i) != null) {
                e eVar2 = this.i.get(i);
                eVar.j = eVar2;
                eVar2.o = eVar;
                eVar = eVar2;
            }
        }
        this.q = eVar;
    }

    private void z() {
        if (this.p <= 0) {
            LogUtil.a("FastingLiteTask", "start task at current time");
            this.p = System.currentTimeMillis();
        }
        if (this.f51110c == null) {
            long jA = lsl.a(this.p, ((Integer) this.f51109b.first).intValue(), ((Integer) this.f51109b.second).intValue());
            long jA2 = lsl.a(this.d + jA, ((Integer) this.e.first).intValue(), ((Integer) this.e.second).intValue());
            long j = this.p;
            boolean z = jA <= j && j < jA2;
            long jA3 = j > jA ? lsl.a(lsl.w(jA), ((Integer) this.f51109b.first).intValue(), ((Integer) this.f51109b.second).intValue()) : jA;
            if (z) {
                jA = jA2;
            } else if (this.p >= jA) {
                jA = lsl.a(lsl.w(jA), ((Integer) this.f51109b.first).intValue(), ((Integer) this.f51109b.second).intValue());
            }
            boolean z2 = z;
            long j2 = jA3;
            this.n = new e(lsl.r(this.p), this.p, z2, j2);
            e eVar = new e(this.p, jA, z2, j2);
            this.q = eVar;
            this.n.j = eVar;
            this.q.o = this.n;
        }
    }

    public boolean n() {
        e eVar = this.f51110c;
        if (eVar == null) {
            LogUtil.j("FastingLiteTask", "isEating mTail is null");
            return false;
        }
        return eVar.f51112b;
    }

    public void b(List<e> list) {
        synchronized (this.k) {
            if (njy.b(this.h)) {
                this.i.addAll(e(list));
            }
            if (njy.b(list)) {
                this.i.addAll(list);
            }
        }
    }

    private List<e> e(List<e> list) {
        if (njy.e(list) || njy.e(this.h)) {
            LogUtil.a("FastingLiteTask", "deleteDuplicatesWindow fastingLiteWindows or mFastingLiteWindows is empty");
            return this.h;
        }
        e eVar = list.get(0);
        int size = this.h.size();
        e eVar2 = null;
        for (int i = 0; i < this.h.size(); i++) {
            e eVar3 = this.h.get(i);
            if (eVar.f() < eVar3.e()) {
                size = i;
                eVar2 = eVar3;
            }
        }
        ArrayList arrayList = new ArrayList();
        if (eVar2 == null) {
            arrayList.addAll(this.h);
            return arrayList;
        }
        if (size > 0) {
            arrayList.addAll(this.h.subList(0, size));
            return arrayList;
        }
        LogUtil.a("FastingLiteTask", "deleteDuplicatesWindow duplicatesWindowPosition == 0");
        return arrayList;
    }

    public List<e> f() {
        ArrayList arrayList;
        synchronized (this.k) {
            arrayList = new ArrayList(this.i);
        }
        return arrayList;
    }

    public List<e> y() {
        LogUtil.a("FastingLiteTask", "start toRecord");
        v();
        if (this.n == null) {
            LogUtil.a("FastingLiteTask", "toRecord mHead is null");
            this.q = null;
            return this.i;
        }
        w();
        long jA = 0;
        for (e eVar = this.n; eVar != null; eVar = eVar.j) {
            this.i.add(eVar);
            this.q = eVar;
            if (eVar.a() > jA) {
                jA = this.q.a();
            }
        }
        af();
        d(jA);
        return this.i;
    }

    private void w() {
        long jF = this.n.f();
        this.p = jF;
        if (jF != this.n.a()) {
            this.n.a(this.p);
            this.n.e(this.p);
        }
    }

    private void d(long j) {
        if (njy.e(this.i)) {
            LogUtil.a("FastingLiteTask", "setSaveWindowTime mFastingLiteNewWindows is empty");
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis <= j) {
            jCurrentTimeMillis = j + 1;
        }
        e eVar = null;
        for (e eVar2 : this.i) {
            if (eVar2.h()) {
                LogUtil.a("FastingLiteTask", "setSaveWindowTime current window is old");
            } else {
                if (this.p != eVar2.c()) {
                    eVar2.b(this.p, true);
                }
                if (eVar2.a() == 0 && eVar2.b() == 0) {
                    eVar2.a(jCurrentTimeMillis);
                    eVar2.e(jCurrentTimeMillis);
                }
                if (eVar != null && eVar.e() < eVar2.f() && eVar.d() != eVar2.f()) {
                    eVar.d(eVar2.f(), true);
                }
                jCurrentTimeMillis++;
                eVar = eVar2;
            }
        }
    }

    private void af() {
        if (this.i.size() < 1) {
            LogUtil.j("FastingLiteTask", "mFastingLiteNewWindows size is less 1");
            return;
        }
        e eVar = this.i.get(this.i.size() - 1);
        if (eVar != null && eVar.h()) {
            eVar.i();
            eVar.k();
        }
        if (this.i.size() < 2) {
            LogUtil.a("FastingLiteTask", "mFastingLiteNewWindows size is less 2");
            return;
        }
        e eVar2 = this.i.get(this.i.size() - 2);
        if (eVar2 == null || !eVar2.h()) {
            return;
        }
        eVar2.i();
        eVar2.k();
    }

    private void v() {
        if (this.i == null) {
            this.i = new ArrayList();
        }
        this.i.clear();
    }

    public void u() {
        e eVar;
        synchronized (this.k) {
            e eVar2 = this.q;
            if (njy.e(this.i)) {
                e eVar3 = this.f51110c;
                if (eVar3 != null) {
                    LogUtil.a("FastingLiteTask", "updateTask old mCurrentWindow ", eVar3.toString());
                    eVar2 = this.f51110c;
                    this.n = eVar2;
                    this.q = eVar2;
                } else {
                    LogUtil.a("FastingLiteTask", "mCurrentWindow is null");
                    eVar2 = this.n;
                }
            }
            x();
            e eVar4 = this.q;
            if (eVar4 != null) {
                e eVar5 = new e(eVar4.f, this.q.f51113c, this.q.f51112b, this.q.d);
                this.f51110c = eVar5;
                LogUtil.a("FastingLiteTask", "updateTask new mCurrentWindow ", eVar5.toString());
            }
            b(eVar2);
            if (njy.e(this.i) && (eVar = this.n) != null) {
                this.n = eVar.j;
            }
            y();
        }
    }

    public void e(long j) {
        if (this.f51110c == null) {
            LogUtil.j("FastingLiteTask", "finnedTunned mCurrentWindow is null");
            return;
        }
        this.f51108a = j;
        if (this.g.d() != null) {
            this.g.d().e(this.f51108a / 1000);
            this.f51109b = this.g.d().e();
            this.e = this.g.d().d();
        }
        long jAd = ad();
        LogUtil.a("FastingLiteTask", "adjust base ", Long.valueOf(j), "next eatingWindow start", Long.valueOf(jAd));
        e eVar = this.q;
        if (eVar != null) {
            if (eVar.f51113c > jAd) {
                this.q.e(jAd, true);
            }
            this.q.d(jAd, true);
        }
        if (this.f51110c.f51113c > jAd) {
            this.f51110c.f51113c = jAd;
        }
        this.f51110c.d = jAd;
    }

    private long ad() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jA = lsl.a(jCurrentTimeMillis, ((Integer) this.f51109b.first).intValue(), ((Integer) this.f51109b.second).intValue());
        return jCurrentTimeMillis > jA ? lsl.a(lsl.w(jCurrentTimeMillis), ((Integer) this.f51109b.first).intValue(), ((Integer) this.f51109b.second).intValue()) : jA;
    }

    private void ai() {
        if (this.q == null) {
            LogUtil.a("FastingLiteTask", "finnedTunned tail is null");
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.q.e(jCurrentTimeMillis, true);
        e eVar = new e(jCurrentTimeMillis, this.q.d, !this.q.j(), this.q.d);
        this.q.j = eVar;
        eVar.o = this.q;
        this.q = eVar;
        if (this.o < eVar.d) {
            this.o = this.q.d;
        } else {
            this.o = this.q.d + 1;
        }
    }

    private e e(e eVar) {
        long jA;
        if (eVar.f51113c < eVar.d) {
            long j = eVar.f51113c + (eVar.j() ? this.j : this.d);
            if (eVar.j()) {
                jA = lsl.a(j, ((Integer) this.f51109b.first).intValue(), ((Integer) this.f51109b.second).intValue());
            } else {
                jA = lsl.a(j, ((Integer) this.e.first).intValue(), ((Integer) this.e.second).intValue());
            }
            long jMin = Math.min(jA, eVar.d);
            LogUtil.a("FastingLiteTask", "nextWindow start ", DateFormatUtil.d(eVar.f51113c, DateFormatUtil.DateFormatType.DEFAULT_DATE_FORMAT), ",end ", DateFormatUtil.d(jMin, DateFormatUtil.DateFormatType.DEFAULT_DATE_FORMAT), ",next eating window ", DateFormatUtil.d(eVar.d, DateFormatUtil.DateFormatType.DEFAULT_DATE_FORMAT));
            return new e(eVar.f51113c, jMin, !eVar.j(), eVar.d);
        }
        if (eVar.f51113c > eVar.d) {
            eVar.e(eVar.d, true);
        }
        long j2 = eVar.d;
        long jA2 = lsl.a(this.d + j2, ((Integer) this.e.first).intValue(), ((Integer) this.e.second).intValue());
        long jA3 = lsl.a(lsl.w(j2), ((Integer) this.f51109b.first).intValue(), ((Integer) this.f51109b.second).intValue());
        LogUtil.a("FastingLiteTask", "nextWindow start ", DateFormatUtil.d(j2, DateFormatUtil.DateFormatType.DEFAULT_DATE_FORMAT), ",end ", DateFormatUtil.d(jA2, DateFormatUtil.DateFormatType.DEFAULT_DATE_FORMAT), ",next eating window ", DateFormatUtil.d(jA3, DateFormatUtil.DateFormatType.DEFAULT_DATE_FORMAT));
        return new e(j2, jA2, true, jA3);
    }

    private void x() {
        if (this.q == null) {
            LogUtil.j("FastingLiteTask", "mTail is null");
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        LogUtil.a("FastingLiteTask", "completePreviousWindows before ", DateFormatUtil.d(jCurrentTimeMillis, DateFormatUtil.DateFormatType.DEFAULT_DATE_FORMAT), ",", this.q);
        if (this.q.f > jCurrentTimeMillis) {
            LogUtil.j("FastingLiteTask", "start time can not greater than current time, need look back");
            while (this.q.f > jCurrentTimeMillis && this.q.o != null) {
                e eVar = this.q.o;
                this.q = eVar;
                eVar.j = null;
            }
            LogUtil.a("FastingLiteTask", "after lock back ", this.q);
            if (this.o > this.q.d) {
                this.o = 0L;
            }
        }
        if (this.f51109b == null || this.e == null) {
            ReleaseLogUtil.c("R_FastingLiteTask", "completePreviousWindows mEatingWindowStartTime or mEatingWindowEndTime is null, return");
            return;
        }
        while (this.q.f51113c <= jCurrentTimeMillis) {
            LogUtil.a("FastingLiteTask", "Generate nextPhase");
            e eVarE = e(this.q);
            this.q.j = eVarE;
            eVarE.o = this.q;
            this.q = eVarE;
        }
        LogUtil.a("FastingLiteTask", "completePreviousWindows ret ", this.q);
    }

    private void b(e eVar) {
        LogUtil.a("FastingLiteTask", "start filter");
        if (eVar == null) {
            LogUtil.j("FastingLiteTask", "preTail is null");
            return;
        }
        ArrayList<Integer> arrayListA = vhn.a(this.g.d());
        boolean zE = njy.e(arrayListA);
        long jC = vhn.c(this.g.d());
        LogUtil.a("FastingLiteTask", "settingEndTime is : ", Long.valueOf(jC));
        while (eVar.j != null && (jC < 0 || eVar.j.f < jC)) {
            long j = eVar.j.d;
            long j2 = (j - this.j) - this.d;
            if (zE || arrayListA.contains(Integer.valueOf(lsl.e(j2)))) {
                eVar = eVar.j;
            } else if (eVar.j.c(j2, j)) {
                if (eVar.j.j == null) {
                    eVar.j = null;
                    break;
                } else {
                    eVar.j = eVar.j.j;
                    eVar.j.o = eVar;
                }
            } else {
                eVar = eVar.j;
            }
        }
        if (jC <= 0 || eVar.f51113c < jC) {
            return;
        }
        eVar.e(jC, true);
        eVar.j = null;
    }

    public boolean k() {
        if (this.q == null) {
            return true;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        return this.q.f > jCurrentTimeMillis || this.q.f51113c <= jCurrentTimeMillis;
    }

    public vhm a() {
        vhm vhmVar = new vhm();
        vhmVar.g = this.g;
        vhmVar.p = this.p;
        vhmVar.f = this.f;
        vhmVar.t = this.t;
        vhmVar.h = this.h;
        vhmVar.m = this.m;
        vhmVar.d = this.d;
        vhmVar.j = this.j;
        vhmVar.f51108a = this.f51108a;
        vhmVar.o = this.o;
        if (njy.b(this.h)) {
            vhmVar.f51110c = this.f51110c;
            return vhmVar;
        }
        LogUtil.a("FastingLiteTask", "conventToSaveTask old fastingLiteWindows is empty, clear currentWindow");
        return vhmVar;
    }

    public String toString() {
        return "FastingLiteTask{mFastingLiteMode=" + this.g + ", mStartTime=" + this.p + ", mEndTime=" + this.f + ", mTaskNote='" + this.t + "', mFastingLiteWindows=" + this.h + ", mIsRunning=" + this.m + ", mEatingWindow=" + this.d + ", mFastingWindow=" + this.j + ", mBaseTime=" + this.f51108a + ", mNextTunnableTime=" + this.o + ", mCurrentWindow=" + this.f51110c + '}';
    }

    public static class e implements Serializable {
        private static final long serialVersionUID = 10001;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @SerializedName("isEating")
        private boolean f51112b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @SerializedName("endTime")
        private long f51113c;

        @SerializedName("nextEatingWindowStart")
        private long d;

        @SerializedName("startTime")
        private long f;
        private transient long g;
        private transient long h;
        private transient long i;
        private transient e j;
        private transient e o;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private transient boolean f51111a = false;
        private transient boolean e = true;

        e(long j, long j2) {
            this.g = j;
            this.i = j2;
        }

        e(long j, long j2, boolean z, long j3) {
            this.f = j;
            this.f51113c = j2;
            this.f51112b = z;
            this.d = j3;
        }

        public long f() {
            return this.f;
        }

        public long e() {
            return this.f51113c;
        }

        public boolean j() {
            return this.f51112b;
        }

        boolean g() {
            return this.f51111a;
        }

        boolean h() {
            return !this.e;
        }

        long d() {
            return this.d;
        }

        long a() {
            return this.g;
        }

        long b() {
            return this.i;
        }

        void a(boolean z) {
            this.f51112b = z;
        }

        void c(long j, boolean z) {
            this.f = j;
            this.f51111a = z;
        }

        void e(long j, boolean z) {
            this.f51113c = j;
            this.f51111a = z;
        }

        void d(long j, boolean z) {
            this.d = j;
            this.f51111a = z;
        }

        void b(long j, boolean z) {
            this.h = j;
            this.f51111a = z;
        }

        public long c() {
            return this.h;
        }

        void a(long j) {
            this.g = j;
        }

        void e(long j) {
            this.i = j;
        }

        void k() {
            this.e = true;
        }

        void i() {
            this.f51111a = true;
        }

        public String toString() {
            return "RecordFastingLitePhase{isEating=" + this.f51112b + ", startTime=" + DateFormatUtil.d(this.f, DateFormatUtil.DateFormatType.DEFAULT_DATE_FORMAT) + ", endTime=" + DateFormatUtil.d(this.f51113c, DateFormatUtil.DateFormatType.DEFAULT_DATE_FORMAT) + ",nextEatingWindowStart=" + DateFormatUtil.d(this.d, DateFormatUtil.DateFormatType.DEFAULT_DATE_FORMAT) + ", lasting" + (this.f51113c - this.f) + '}';
        }

        boolean c(long j, long j2) {
            return this.f51113c >= j && this.f <= j2;
        }
    }
}
