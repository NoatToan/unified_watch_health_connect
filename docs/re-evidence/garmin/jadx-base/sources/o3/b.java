package o3;

import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lo3/b;", "", "Lo3/c;", "widthSizeClass", "Lo3/a;", "heightSizeClass", "<init>", "(II)V", "a", "material3-window-size-class"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f128750c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f128751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f128752b;

    private b(int i14, int i15) {
        this.f128751a = i14;
        this.f128752b = i15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            int i14 = bVar.f128751a;
            c.a aVar = c.f128753b;
            if (this.f128751a == i14) {
                int i15 = bVar.f128752b;
                o3.a.C2468a c2468a = o3.a.f128743b;
                if (this.f128752b == i15) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        c.a aVar = c.f128753b;
        int iHashCode = Integer.hashCode(this.f128751a) * 31;
        o3.a.C2468a c2468a = o3.a.f128743b;
        return Integer.hashCode(this.f128752b) + iHashCode;
    }

    public final String toString() {
        return "WindowSizeClass(" + ((Object) c.b(this.f128751a)) + ", " + ((Object) o3.a.b(this.f128752b)) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lo3/b$a;", "", "<init>", "()V", "material3-window-size-class"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ b(int i14, int i15, j jVar) {
        this(i14, i15);
    }
}
