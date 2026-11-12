package defpackage;

/* JADX INFO: loaded from: classes19.dex */
public class uwr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f50669a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f50670c;
    private String e;

    public uwr(String str, String str2, boolean z) {
        this.f50670c = str;
        this.e = str2;
        this.f50669a = z;
    }

    public String e() {
        return this.f50670c;
    }

    public String a() {
        return this.e;
    }

    public boolean d() {
        return this.f50669a;
    }

    public void c(boolean z) {
        this.f50669a = z;
    }

    public String toString() {
        return "StateIndexItem{mStateItem='" + this.f50670c + "', mStateValue='" + this.e + "', mChangeBg=" + this.f50669a + '}';
    }
}
