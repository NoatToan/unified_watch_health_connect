package c2;

import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@d23.a
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Lc2/p3;", "", "a", "value", "", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class p3 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f22824k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f22825l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f22826m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f22828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f22815b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f22816c = 8;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f22817d = 4;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f22818e = 2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f22819f = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f22820g = 8 | 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f22821h = 4 | 2;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f22822i = 16;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f22823j = 32;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f22827n = 16 | 32;

    static {
        int i14 = 8 | 2;
        f22824k = i14;
        int i15 = 4 | 1;
        f22825l = i15;
        f22826m = i14 | i15;
    }

    public static String a(int i14) {
        StringBuilder sb3 = new StringBuilder("WindowInsetsSides(");
        StringBuilder sb4 = new StringBuilder();
        int i15 = f22820g;
        if ((i14 & i15) == i15) {
            b("Start", sb4);
        }
        int i16 = f22824k;
        if ((i14 & i16) == i16) {
            b("Left", sb4);
        }
        int i17 = f22822i;
        if ((i14 & i17) == i17) {
            b("Top", sb4);
        }
        int i18 = f22821h;
        if ((i14 & i18) == i18) {
            b("End", sb4);
        }
        int i19 = f22825l;
        if ((i14 & i19) == i19) {
            b("Right", sb4);
        }
        int i24 = f22823j;
        if ((i14 & i24) == i24) {
            b("Bottom", sb4);
        }
        sb3.append(sb4.toString());
        sb3.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return sb3.toString();
    }

    public static final void b(String str, StringBuilder sb3) {
        if (sb3.length() > 0) {
            sb3.append('+');
        }
        sb3.append(str);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof p3) {
            return this.f22828a == ((p3) obj).f22828a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f22828a);
    }

    public final String toString() {
        return a(this.f22828a);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lc2/p3$a;", "", "<init>", "()V", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
