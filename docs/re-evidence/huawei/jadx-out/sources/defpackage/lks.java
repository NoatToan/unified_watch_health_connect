package defpackage;

/* JADX INFO: loaded from: classes10.dex */
public class lks extends Exception {
    private static final long serialVersionUID = 1726426141039183018L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f40374a;

    public lks(String str) {
        super(str);
    }

    public lks(String str, boolean z) {
        super(str);
        this.f40374a = z;
    }

    public boolean e() {
        return this.f40374a;
    }
}
