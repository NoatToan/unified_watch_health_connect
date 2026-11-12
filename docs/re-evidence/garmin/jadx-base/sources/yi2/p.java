package yi2;

import java.util.List;
import u62.z;

/* JADX INFO: loaded from: classes11.dex */
public class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<i> f197435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f197436b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f197437c;

    private p(List<i> list, String str, String str2) {
        this.f197435a = list;
        this.f197436b = str;
        this.f197437c = str2;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("RequestResult:\nmError='");
        sb3.append(this.f197436b);
        sb3.append("'\nmErrorMsg='");
        sb3.append(this.f197437c);
        sb3.append("'\nmEvents='");
        return z.c(sb3, this.f197435a, "'");
    }

    public p(String str) {
        this(null, str, null);
    }

    public p(String str, String str2) {
        this(null, str, str2);
    }

    public p(List<i> list) {
        this(list, null, null);
    }
}
