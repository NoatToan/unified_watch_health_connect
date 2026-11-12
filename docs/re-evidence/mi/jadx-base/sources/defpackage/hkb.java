package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public final class hkb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h2e f20160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h2e f20161b;
    public final h2e c;
    public final int d;
    public final String e;
    public hkb f;

    public hkb(h2e h2eVar, h2e h2eVar2, h2e h2eVar3, int i, String str) {
        this.f20160a = h2eVar;
        this.f20161b = h2eVar2;
        this.c = h2eVar3;
        this.d = i;
        this.e = str;
    }

    public static int a(hkb hkbVar) {
        int i = 0;
        while (hkbVar != null) {
            i++;
            hkbVar = hkbVar.f;
        }
        return i;
    }

    public static int b(hkb hkbVar) {
        return (a(hkbVar) * 8) + 2;
    }

    public static void c(hkb hkbVar, z73 z73Var) {
        z73Var.k(a(hkbVar));
        while (hkbVar != null) {
            z73Var.k(hkbVar.f20160a.d).k(hkbVar.f20161b.d).k(hkbVar.c.d).k(hkbVar.d);
            hkbVar = hkbVar.f;
        }
    }

    public static hkb d(hkb hkbVar, h2e h2eVar, h2e h2eVar2) {
        if (hkbVar == null) {
            return null;
        }
        hkb hkbVarD = d(hkbVar.f, h2eVar, h2eVar2);
        hkbVar.f = hkbVarD;
        h2e h2eVar3 = hkbVar.f20160a;
        int i = h2eVar3.d;
        h2e h2eVar4 = hkbVar.f20161b;
        int i2 = h2eVar4.d;
        int i3 = h2eVar.d;
        int i4 = h2eVar2 == null ? Integer.MAX_VALUE : h2eVar2.d;
        if (i3 >= i2 || i4 <= i) {
            return hkbVar;
        }
        if (i3 <= i) {
            return i4 >= i2 ? hkbVarD : new hkb(hkbVar, h2eVar2, h2eVar4);
        }
        if (i4 >= i2) {
            return new hkb(hkbVar, h2eVar3, h2eVar);
        }
        hkbVar.f = new hkb(hkbVar, h2eVar2, h2eVar4);
        return new hkb(hkbVar, hkbVar.f20160a, h2eVar);
    }

    public hkb(hkb hkbVar, h2e h2eVar, h2e h2eVar2) {
        this(h2eVar, h2eVar2, hkbVar.c, hkbVar.d, hkbVar.e);
        this.f = hkbVar.f;
    }
}
