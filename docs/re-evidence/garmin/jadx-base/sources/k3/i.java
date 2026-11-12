package k3;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes.dex */
@d23.a
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Lk3/i;", "", "a", "description", "", "material3-adaptive-navigation-suite"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f102517b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f102518c = "ShortNavigationBarCompact";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f102519d = "ShortNavigationBarMedium";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f102520e = "NavigationBar";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f102521a;

    private /* synthetic */ i(String str) {
        this.f102521a = str;
    }

    public static final /* synthetic */ i a(String str) {
        return new i(str);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            return s.g(this.f102521a, ((i) obj).f102521a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f102521a.hashCode();
    }

    /* JADX INFO: renamed from: toString, reason: from getter */
    public final String getF102521a() {
        return this.f102521a;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lk3/i$a;", "", "<init>", "()V", "material3-adaptive-navigation-suite"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
