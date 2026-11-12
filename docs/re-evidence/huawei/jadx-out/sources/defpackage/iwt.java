package defpackage;

import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes10.dex */
public class iwt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static iwt f38149a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f38150c = new Object();
    private CopyOnWriteArrayList<njf> i = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private CopyOnWriteArrayList<njf> f38151b = new CopyOnWriteArrayList<>();
    private int d = 0;
    private int g = 0;
    private int e = 20;

    public static iwt d() {
        iwt iwtVar;
        synchronized (f38150c) {
            if (f38149a == null) {
                f38149a = new iwt();
            }
            iwtVar = f38149a;
        }
        return iwtVar;
    }

    public void a() {
        this.i.clear();
        this.f38151b.clear();
        if (e()) {
            LogUtil.a("Track_LinkageStepManager", "cleanStepArray");
            ive.c().a().stopStepPoint();
        }
    }

    public void d(njf njfVar) {
        e(njfVar, 20);
    }

    public void e(njf njfVar, int i) {
        d(njfVar, i == 20 ? this.i : this.f38151b);
    }

    public void d(njf njfVar, CopyOnWriteArrayList<njf> copyOnWriteArrayList) {
        if (copyOnWriteArrayList == null) {
            ReleaseLogUtil.e("Track_LinkageStepManager", "constructStepArray stepArray null");
            return;
        }
        if (e(copyOnWriteArrayList)) {
            copyOnWriteArrayList.remove(0);
        }
        copyOnWriteArrayList.add(njfVar);
        LogUtil.a("Track_LinkageStepManager", "new stepArray = ", Integer.valueOf(copyOnWriteArrayList.get(copyOnWriteArrayList.size() - 1).d()), " reportTime = ", Long.valueOf(copyOnWriteArrayList.get(copyOnWriteArrayList.size() - 1).b()), "mCutStepSource = ", Integer.valueOf(this.e));
    }

    public boolean e(CopyOnWriteArrayList<njf> copyOnWriteArrayList) {
        return copyOnWriteArrayList.size() >= 11;
    }

    public boolean g(int i) {
        if (this.i.size() < i) {
            return this.f38151b.size() != 0 && this.f38151b.size() >= i / 5;
        }
        return true;
    }

    public void c(int i) {
        e(i, e() ? this.f38151b : this.i);
        if (e()) {
            LogUtil.a("Track_LinkageStepManager", "initLinkageStep");
            ive.c().a().startStepPoint();
        }
    }

    private boolean e() {
        return this.e == 10;
    }

    public void e(int i, CopyOnWriteArrayList<njf> copyOnWriteArrayList) {
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.size() <= 0) {
            return;
        }
        this.d = i;
        int iD = copyOnWriteArrayList.get(copyOnWriteArrayList.size() - 1).d();
        this.g = iD;
        LogUtil.a("Track_LinkageStepManager", "initLinkageStep mLastNormalSteps:", Integer.valueOf(this.d), " mStartLinkageSteps:", Integer.valueOf(iD));
    }

    public int c(int i, int i2) {
        return d(i, i2 == 10 ? this.f38151b : this.i);
    }

    public int d(int i, CopyOnWriteArrayList<njf> copyOnWriteArrayList) {
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.size() <= 0) {
            return 0;
        }
        if (copyOnWriteArrayList.size() < i + 1) {
            LogUtil.j("Track_LinkageStepManager", "getNewSteps mWearStepArray size ", Integer.valueOf(copyOnWriteArrayList.size()), "interval ", Integer.valueOf(i));
            return 0;
        }
        return copyOnWriteArrayList.get(copyOnWriteArrayList.size() - 1).d() - copyOnWriteArrayList.get((copyOnWriteArrayList.size() - i) - 1).d();
    }

    public int b() {
        int iA = a(this.e == 10 ? this.f38151b : this.i);
        LogUtil.a("Track_LinkageStepManager", "linkageSteps is ", Integer.valueOf(iA), "time is ", Long.valueOf(System.currentTimeMillis()));
        return iA;
    }

    public int a(int i) {
        CopyOnWriteArrayList<njf> copyOnWriteArrayListE = e(i);
        if (copyOnWriteArrayListE == null || copyOnWriteArrayListE.size() <= 0) {
            return 0;
        }
        return copyOnWriteArrayListE.get(copyOnWriteArrayListE.size() - 1).d();
    }

    public int b(int i, int i2) {
        CopyOnWriteArrayList<njf> copyOnWriteArrayListE = e(i);
        if (njy.e(copyOnWriteArrayListE, i2)) {
            return 0;
        }
        return (copyOnWriteArrayListE.get(i2).d() - this.g) + this.d;
    }

    public CopyOnWriteArrayList<njf> e(int i) {
        return i == 10 ? this.f38151b : this.i;
    }

    public int b(int i) {
        CopyOnWriteArrayList<njf> copyOnWriteArrayListE = e(i);
        if (copyOnWriteArrayListE == null || copyOnWriteArrayListE.size() <= 0) {
            return 0;
        }
        return copyOnWriteArrayListE.size();
    }

    public int a(CopyOnWriteArrayList<njf> copyOnWriteArrayList) {
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.size() <= 0) {
            return 0;
        }
        return (copyOnWriteArrayList.get(copyOnWriteArrayList.size() - 1).d() - this.g) + this.d;
    }

    public long d(int i) {
        return b(i == 10 ? this.f38151b : this.i);
    }

    public long b(CopyOnWriteArrayList<njf> copyOnWriteArrayList) {
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.size() <= 0) {
            return 0L;
        }
        return copyOnWriteArrayList.get(copyOnWriteArrayList.size() - 1).b();
    }

    public void j(int i) {
        this.e = i;
    }
}
