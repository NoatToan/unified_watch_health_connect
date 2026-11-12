package i3;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@d23.a
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Li3/y5;", "", "a", "name", "", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class y5 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f90403b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f90404c = "PrimaryNotEditable";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f90405d = "PrimaryEditable";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f90406e = "SecondaryEditable";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f90407a;

    private /* synthetic */ y5(String str) {
        this.f90407a = str;
    }

    public static final /* synthetic */ y5 a(String str) {
        return new y5(str);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof y5) {
            return p005kotlin.jvm.internal.s.g(this.f90407a, ((y5) obj).f90407a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f90407a.hashCode();
    }

    /* JADX INFO: renamed from: toString, reason: from getter */
    public final String getF90407a() {
        return this.f90407a;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Li3/y5$a;", "", "<init>", "()V", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
