package n82;

import b63.o;
import java.util.Map;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ln82/g;", "", "", "Lo82/g;", "Lb63/o;", "cache", "<init>", "(Ljava/util/Map;)V", "patterns_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<o82.g, o> f124966a;

    public g(Map<o82.g, o> map) {
        map.getClass();
        this.f124966a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!g.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        return this.f124966a.equals(((g) obj).f124966a);
    }

    public final int hashCode() {
        return this.f124966a.hashCode();
    }

    public final String toString() {
        return "DatePagerStateCache(cache=" + this.f124966a + ")";
    }
}
