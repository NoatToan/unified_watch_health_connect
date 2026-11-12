package defpackage;

import androidx.annotation.RestrictTo;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class vz9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<y2m> f37389a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final char f37390b;
    public final double c;
    public final double d;
    public final String e;
    public final String f;

    public vz9(List<y2m> list, char c, double d, double d2, String str, String str2) {
        this.f37389a = list;
        this.f37390b = c;
        this.c = d;
        this.d = d2;
        this.e = str;
        this.f = str2;
    }

    public static int c(char c, String str, String str2) {
        return (((c * 31) + str.hashCode()) * 31) + str2.hashCode();
    }

    public List<y2m> a() {
        return this.f37389a;
    }

    public double b() {
        return this.d;
    }

    public int hashCode() {
        return c(this.f37390b, this.f, this.e);
    }
}
