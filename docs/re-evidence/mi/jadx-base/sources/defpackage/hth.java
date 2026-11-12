package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public class hth {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public n08 f20437a;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final hth f20438a = new hth();
    }

    public static hth b() {
        return a.f20438a;
    }

    public n08 a(String str, String str2) {
        if (this.f20437a == null) {
            vpe.d("PhoneContext", "getEdgeRequestContext: mEdgeRequestEnv is null");
            gth.b(str, str2);
        }
        return this.f20437a;
    }

    public void c(n08 n08Var) {
        this.f20437a = n08Var;
    }

    public hth() {
    }
}
