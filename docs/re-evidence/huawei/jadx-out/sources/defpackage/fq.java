package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public class fq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final double f34393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f34394b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f34395c;
    private final List<go> d;
    private final char e;
    private final double i;

    public static int b(char c2, String str, String str2) {
        return (((c2 * 31) + str.hashCode()) * 31) + str2.hashCode();
    }

    public fq(List<go> list, char c2, double d, double d2, String str, String str2) {
        this.d = list;
        this.e = c2;
        this.f34393a = d;
        this.i = d2;
        this.f34395c = str;
        this.f34394b = str2;
    }

    public List<go> a() {
        return this.d;
    }

    public double d() {
        return this.i;
    }

    public int hashCode() {
        return b(this.e, this.f34394b, this.f34395c);
    }
}
