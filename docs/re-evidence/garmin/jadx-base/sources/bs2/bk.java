package bs2;

import com.garmin.fit.FitRuntimeException;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes11.dex */
public class bk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f19751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f19752b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList<rc> f19753c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList<g7> f19754d;

    public bk(bk bkVar) {
        this.f19753c = new ArrayList<>();
        this.f19754d = new ArrayList<>();
        if (bkVar == null) {
            this.f19751a = ik.f20217a;
            return;
        }
        this.f19751a = bkVar.f19751a;
        this.f19752b = bkVar.f19752b;
        for (rc rcVar : bkVar.f19753c) {
            if (rcVar.f20480a.size() > 0) {
                this.f19753c.add(new rc(rcVar));
            }
        }
        for (g7 g7Var : bkVar.f19754d) {
            if (g7Var.f20480a.size() > 0) {
                this.f19754d.add(new g7(g7Var));
            }
        }
    }

    public final void e(rc rcVar) {
        this.f19753c.add(rcVar);
    }

    public final int f(int i14) {
        ArrayList<pw> arrayList = wb.a(this.f19751a, i14).f20460i;
        for (int i15 = 0; i15 < arrayList.size(); i15++) {
            if (arrayList.get(i15).c(this)) {
                return i15;
            }
        }
        return 65535;
    }

    public final rc g(int i14) {
        int i15 = 0;
        while (true) {
            ArrayList<rc> arrayList = this.f19753c;
            if (i15 >= arrayList.size()) {
                return null;
            }
            if (arrayList.get(i15).f20454c == i14) {
                return arrayList.get(i15);
            }
            i15++;
        }
    }

    public final Float h(int i14) {
        pw pwVarH;
        Object objJ;
        rc rcVarG = g(i14);
        if (rcVarG != null && (((pwVarH = rcVarG.h(65535)) == null || pwVarH.c(this)) && (objJ = rcVarG.j(rcVarG.h(65535))) != null)) {
            return new Float(((Number) objJ).doubleValue());
        }
        return null;
    }

    public final Integer i(int i14) {
        pw pwVarH;
        Object objJ;
        rc rcVarG = g(i14);
        if (rcVarG != null && (((pwVarH = rcVarG.h(65535)) == null || pwVarH.c(this)) && (objJ = rcVarG.j(rcVarG.h(65535))) != null)) {
            return Integer.valueOf(((Number) objJ).intValue());
        }
        return null;
    }

    public final Long j(int i14, int i15) {
        rc rcVarG = g(i14);
        if (rcVarG == null) {
            return null;
        }
        if (i15 == 65534) {
            return rcVarG.d(f(i14));
        }
        pw pwVarH = rcVarG.h(i15);
        if (pwVarH == null || pwVarH.c(this)) {
            return rcVarG.d(i15);
        }
        return null;
    }

    public final Short k(int i14) {
        pw pwVarH;
        Object objJ;
        rc rcVarG = g(i14);
        if (rcVarG != null && (((pwVarH = rcVarG.h(65535)) == null || pwVarH.c(this)) && (objJ = rcVarG.j(rcVarG.h(65535))) != null)) {
            return Short.valueOf(((Number) objJ).shortValue());
        }
        return null;
    }

    public final int l() {
        return this.f19751a;
    }

    public final boolean m(int i14) {
        int i15 = 0;
        while (true) {
            ArrayList<rc> arrayList = this.f19753c;
            if (i15 >= arrayList.size()) {
                return false;
            }
            if (arrayList.get(i15).f20454c == i14) {
                return true;
            }
            i15++;
        }
    }

    public final void n(int i14, Object obj) {
        rc rcVarG = g(i14);
        if (rcVarG == null) {
            rcVarG = wb.a(this.f19751a, i14);
            e(rcVarG);
        }
        rcVarG.m(obj, null);
    }

    public final void o(int i14) {
        if (i14 >= 16) {
            throw new FitRuntimeException(v.e0.f(i14, "Invalid local message number ", ".  Local message number must be < 16."));
        }
        this.f19752b = i14;
    }

    public final l6 p(Long l14) {
        if (l14 == null) {
            return null;
        }
        l6 l6Var = new l6(l14.longValue());
        long j8 = l6Var.f20276a;
        if (j8 < 268435456) {
            l6Var.f20276a = j8;
        }
        return l6Var;
    }

    public final void q(OutputStream outputStream, fk fkVar) {
        g7 g7Var;
        try {
            new DataOutputStream(outputStream).writeByte(this.f19752b & 15);
            if (fkVar == null) {
                fkVar = new fk(this);
            }
            for (wc wcVar : fkVar.f20136d) {
                rc rcVarG = g(wcVar.f20643a);
                if (rcVarG == null) {
                    rcVarG = wb.a(this.f19751a, wcVar.f20643a);
                }
                rcVarG.n(outputStream, wcVar);
            }
            for (h7 h7Var : fkVar.f20137e) {
                short sB = h7Var.b();
                short s8 = h7Var.f20182e;
                Iterator<g7> it = this.f19754d.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        g7Var = null;
                        break;
                    }
                    g7Var = it.next();
                    if (g7Var.f20153b.b() == sB && g7Var.f20153b.f20182e == s8) {
                        break;
                    }
                }
                if (g7Var == null) {
                    g7Var = new g7(h7Var);
                }
                g7Var.n(outputStream, h7Var);
            }
        } catch (IOException e4) {
            throw new FitRuntimeException(e4);
        }
    }

    public bk(String str, int i14) {
        this.f19751a = i14;
        this.f19752b = 0;
        this.f19753c = new ArrayList<>();
        this.f19754d = new ArrayList<>();
    }
}
