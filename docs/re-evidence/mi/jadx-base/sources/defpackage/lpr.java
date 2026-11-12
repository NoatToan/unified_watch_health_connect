package defpackage;

import java.util.Enumeration;

/* JADX INFO: loaded from: classes3.dex */
public class lpr extends be implements dd {
    public static npr e = pt1.N;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f25306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f25307b;
    public npr c;
    public r6j[] d;

    public lpr(npr nprVar, lpr lprVar) {
        this.d = lprVar.d;
        this.c = nprVar;
    }

    public static lpr g(ef efVar, boolean z) {
        return i(se.o(efVar, true));
    }

    public static lpr h(npr nprVar, Object obj) {
        if (obj instanceof lpr) {
            return new lpr(nprVar, (lpr) obj);
        }
        if (obj != null) {
            return new lpr(nprVar, se.q(obj));
        }
        return null;
    }

    public static lpr i(Object obj) {
        if (obj instanceof lpr) {
            return (lpr) obj;
        }
        if (obj != null) {
            return new lpr(se.q(obj));
        }
        return null;
    }

    @Override // defpackage.be
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof lpr) && !(obj instanceof se)) {
            return false;
        }
        if (toASN1Primitive().equals(((gd) obj).toASN1Primitive())) {
            return true;
        }
        try {
            return this.c.b(this, new lpr(se.q(((gd) obj).toASN1Primitive())));
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // defpackage.be
    public int hashCode() {
        if (this.f25306a) {
            return this.f25307b;
        }
        this.f25306a = true;
        int iC = this.c.c(this);
        this.f25307b = iC;
        return iC;
    }

    public r6j[] j() {
        r6j[] r6jVarArr = this.d;
        int length = r6jVarArr.length;
        r6j[] r6jVarArr2 = new r6j[length];
        System.arraycopy(r6jVarArr, 0, r6jVarArr2, 0, length);
        return r6jVarArr2;
    }

    @Override // defpackage.be, defpackage.gd
    public pe toASN1Primitive() {
        return new xg5(this.d);
    }

    public String toString() {
        return this.c.a(this);
    }

    public lpr(se seVar) {
        this(e, seVar);
    }

    public lpr(npr nprVar, se seVar) {
        this.c = nprVar;
        this.d = new r6j[seVar.size()];
        Enumeration enumerationU = seVar.u();
        int i = 0;
        while (enumerationU.hasMoreElements()) {
            this.d[i] = r6j.h(enumerationU.nextElement());
            i++;
        }
    }
}
