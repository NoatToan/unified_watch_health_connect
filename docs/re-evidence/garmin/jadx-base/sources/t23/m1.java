package t23;

/* JADX INFO: loaded from: classes3.dex */
public abstract class m1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f162040a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f162041b;

    public m1(String str, boolean z14) {
        str.getClass();
        this.f162040a = str;
        this.f162041b = z14;
    }

    public Integer a(m1 m1Var) {
        m1Var.getClass();
        l1.f162029a.getClass();
        if (this == m1Var) {
            return 0;
        }
        q13.c cVar = l1.f162030b;
        Integer num = (Integer) cVar.get(this);
        Integer num2 = (Integer) cVar.get(m1Var);
        if (num == null || num2 == null || num.equals(num2)) {
            return null;
        }
        return Integer.valueOf(num.intValue() - num2.intValue());
    }

    public String b() {
        return this.f162040a;
    }

    public m1 c() {
        return this;
    }

    public final String toString() {
        return b();
    }
}
