package defpackage;

/* JADX INFO: loaded from: classes15.dex */
public class qgt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f46200a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f46201c;
    private int d;
    private int e;

    public void e(String str) {
        this.f46200a = str;
    }

    public int c() {
        return this.f46201c;
    }

    public void c(int i) {
        this.f46201c = i;
    }

    public int d() {
        return this.d;
    }

    public void b(int i) {
        this.d = i;
    }

    public void d(int i) {
        this.e = i;
    }

    public String toString() {
        return "RecommendGoalModel{mRecommendGoalType='" + this.f46200a + ", mRecommendGoalState=" + this.f46201c + ", mEffectiveGoalValue=" + this.e + ", mRecommendGoalValue=" + this.d + '}';
    }
}
