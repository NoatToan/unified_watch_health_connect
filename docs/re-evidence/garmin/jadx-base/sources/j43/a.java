package j43;

import p43.n0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n0 f97039a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f97040b;

    public a(n0 n0Var, g gVar) {
        if (n0Var == null) {
            c(0);
            throw null;
        }
        this.f97039a = n0Var;
        this.f97040b = gVar == null ? this : gVar;
    }

    public static /* synthetic */ void c(int i14) {
        String str = (i14 == 1 || i14 == 2) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i14 == 1 || i14 == 2) ? 2 : 3];
        if (i14 == 1 || i14 == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/AbstractReceiverValue";
        } else {
            objArr[0] = "receiverType";
        }
        if (i14 == 1) {
            objArr[1] = "getType";
        } else if (i14 != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/AbstractReceiverValue";
        } else {
            objArr[1] = "getOriginal";
        }
        if (i14 != 1 && i14 != 2) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i14 != 1 && i14 != 2) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // j43.g
    public final n0 getType() {
        n0 n0Var = this.f97039a;
        if (n0Var != null) {
            return n0Var;
        }
        c(1);
        throw null;
    }
}
