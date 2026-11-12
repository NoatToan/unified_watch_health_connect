package o53;

/* JADX INFO: loaded from: classes3.dex */
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k0 f129344a;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        String property;
        k0 k0Var;
        int i14 = u53.y.f168775a;
        try {
            property = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property != null ? Boolean.parseBoolean(property) : false) {
            x53.c cVar = s0.f129406a;
            t1 t1Var = u53.o.f168762a;
            k0Var = ((t1Var.H() instanceof u53.p) || !(t1Var instanceof k0)) ? g0.f129339h : (k0) t1Var;
        } else {
            k0Var = g0.f129339h;
        }
        f129344a = k0Var;
    }
}
