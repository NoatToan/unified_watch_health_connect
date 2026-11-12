package z0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.apache.commons.text.StringSubstitutor;

/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<u> f200721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f200722b;

    public x(List<u> list, n nVar) {
        k7.h.b((list.isEmpty() && nVar == n.f200695a) ? false : true, "No preferred quality and fallback strategy.");
        this.f200721a = Collections.unmodifiableList(new ArrayList(list));
        this.f200722b = nVar;
    }

    public final String toString() {
        return "QualitySelector{preferredQualities=" + this.f200721a + ", fallbackStrategy=" + this.f200722b + StringSubstitutor.DEFAULT_VAR_END;
    }
}
