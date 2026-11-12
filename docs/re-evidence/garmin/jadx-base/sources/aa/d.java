package aa;

import android.text.TextUtils;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2178b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f2179c;

    public d(String str, int i14, int i15) {
        this.f2177a = str;
        this.f2178b = i14;
        this.f2179c = i15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        int i14 = dVar.f2179c;
        String str = dVar.f2177a;
        int i15 = dVar.f2178b;
        int i16 = this.f2179c;
        String str2 = this.f2177a;
        int i17 = this.f2178b;
        if (i17 < 0 || i15 < 0) {
            return TextUtils.equals(str2, str) && i16 == i14;
        }
        return TextUtils.equals(str2, str) && i17 == i15 && i16 == i14;
    }

    public final int hashCode() {
        return Objects.hash(this.f2177a, Integer.valueOf(this.f2179c));
    }
}
