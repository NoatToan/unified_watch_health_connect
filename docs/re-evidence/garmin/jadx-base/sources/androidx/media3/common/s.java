package androidx.media3.common;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class s {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f8433c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f8434d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f8436b;

    static {
        int i14 = fa.z.f70071a;
        f8433c = Integer.toString(0, 36);
        f8434d = Integer.toString(1, 36);
    }

    public s(String str, String str2) {
        this.f8435a = fa.z.P(str);
        this.f8436b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            s sVar = (s) obj;
            String str = sVar.f8435a;
            int i14 = fa.z.f70071a;
            if (Objects.equals(this.f8435a, str) && Objects.equals(this.f8436b, sVar.f8436b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f8436b.hashCode() * 31;
        String str = this.f8435a;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
