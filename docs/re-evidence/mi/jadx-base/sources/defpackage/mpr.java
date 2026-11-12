package defpackage;

import java.util.Enumeration;

/* JADX INFO: loaded from: classes3.dex */
public class mpr extends de implements ed {
    public static opr e = qt1.O;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f27081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f27082b;
    public opr c;
    public s6j[] d;

    public mpr(te teVar) {
        this(e, teVar);
    }

    public static mpr g(ff ffVar, boolean z) {
        return i(te.o(ffVar, true));
    }

    public static mpr h(opr oprVar, Object obj) {
        if (obj instanceof mpr) {
            return new mpr(oprVar, (mpr) obj);
        }
        if (obj != null) {
            return new mpr(oprVar, te.q(obj));
        }
        return null;
    }

    public static mpr i(Object obj) {
        if (obj instanceof mpr) {
            return (mpr) obj;
        }
        if (obj != null) {
            return new mpr(te.q(obj));
        }
        return null;
    }

    @Override // defpackage.de
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof mpr) && !(obj instanceof te)) {
            return false;
        }
        if (toASN1Primitive().equals(((hd) obj).toASN1Primitive())) {
            return true;
        }
        try {
            return this.c.c(this, new mpr(te.q(((hd) obj).toASN1Primitive())));
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // defpackage.de
    public int hashCode() {
        if (this.f27081a) {
            return this.f27082b;
        }
        this.f27081a = true;
        int iA = this.c.a(this);
        this.f27082b = iA;
        return iA;
    }

    public s6j[] j() {
        s6j[] s6jVarArr = this.d;
        int length = s6jVarArr.length;
        s6j[] s6jVarArr2 = new s6j[length];
        System.arraycopy(s6jVarArr, 0, s6jVarArr2, 0, length);
        return s6jVarArr2;
    }

    @Override // defpackage.de, defpackage.hd
    public re toASN1Primitive() {
        return new yg5(this.d);
    }

    public String toString() {
        return this.c.b(this);
    }

    public mpr(opr oprVar, te teVar) {
        this.c = oprVar;
        this.d = new s6j[teVar.size()];
        Enumeration enumerationU = teVar.u();
        int i = 0;
        while (enumerationU.hasMoreElements()) {
            this.d[i] = s6j.h(enumerationU.nextElement());
            i++;
        }
    }

    public mpr(opr oprVar, mpr mprVar) {
        this.d = mprVar.d;
        this.c = oprVar;
    }
}
