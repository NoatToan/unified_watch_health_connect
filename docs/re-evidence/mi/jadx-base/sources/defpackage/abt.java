package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public class abt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f868a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f869b = 0;
    public long c = 0;
    public double d = 0.0d;
    public double e = 0.0d;
    public double f = 0.0d;
    public float g = 0.0f;
    public float h = 0.0f;
    public float i = 0.0f;
    public boolean j = false;

    public abt(String str) {
        this.f868a = str;
    }

    public final double a(abt abtVar) {
        if (abtVar != null) {
            return lbt.a(this.e, this.d, abtVar.e, abtVar.d);
        }
        return 0.0d;
    }
}
