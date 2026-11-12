package defpackage;

/* JADX INFO: loaded from: classes16.dex */
public class rbw extends rbx {
    private static final long serialVersionUID = -4823894855853644001L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f47106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f47107b;

    public String b() {
        return this.f47107b;
    }

    public void d(String str) {
        this.f47107b = str;
    }

    public void c(int i) {
        this.f47106a = i;
    }

    public String toString() {
        return "Paragraph{mValue='" + this.f47107b + "', mPlaceholderCount=" + this.f47106a + ", mPartType=" + this.d + '}';
    }
}
