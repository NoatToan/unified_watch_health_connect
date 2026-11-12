package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public class mr {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f42232c;
    public long d = System.currentTimeMillis() + 86400000;
    public String e;

    public String toString() {
        return "ValueData{value='" + this.e + "', code=" + this.f42232c + ", expired=" + this.d + '}';
    }

    public mr(String str, int i) {
        this.e = str;
        this.f42232c = i;
    }
}
