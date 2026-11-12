package ia;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f92372a;

    public final void a(int i14) {
        this.f92372a = i14 | this.f92372a;
    }

    public final boolean b(int i14) {
        return (this.f92372a & i14) == i14;
    }
}
