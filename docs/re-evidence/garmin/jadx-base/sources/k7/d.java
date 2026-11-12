package k7;

import java.util.Objects;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.text.StringSubstitutor;

/* JADX INFO: loaded from: classes.dex */
public class d<F, S> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final F f103262a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final S f103263b;

    public d(F f14, S s8) {
        this.f103262a = f14;
        this.f103263b = s8;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Objects.equals(dVar.f103262a, this.f103262a) && Objects.equals(dVar.f103263b, this.f103263b);
    }

    public final int hashCode() {
        F f14 = this.f103262a;
        int iHashCode = f14 == null ? 0 : f14.hashCode();
        S s8 = this.f103263b;
        return (s8 != null ? s8.hashCode() : 0) ^ iHashCode;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Pair{");
        sb3.append(this.f103262a);
        sb3.append(StringUtils.SPACE);
        return am.j.k(this.f103263b, StringSubstitutor.DEFAULT_VAR_END, sb3);
    }
}
