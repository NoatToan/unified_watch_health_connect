package yc;

import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\bB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lyc/b1;", "", "Lyc/z0;", "refresh", "prepend", "append", "<init>", "(Lyc/z0;Lyc/z0;Lyc/z0;)V", "a", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class b1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f195767f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b1 f195768g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z0 f195769a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z0 f195770b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z0 f195771c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f195772d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f195773e;

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f195774a;

        static {
            int[] iArr = new int[c1.values().length];
            try {
                iArr[c1.APPEND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c1.PREPEND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[c1.REFRESH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f195774a = iArr;
        }
    }

    static {
        z0.c.a aVar = z0.c.f196665b;
        aVar.getClass();
        z0.c cVar = z0.c.f196667d;
        aVar.getClass();
        aVar.getClass();
        f195768g = new b1(cVar, cVar, cVar);
    }

    public b1(z0 z0Var, z0 z0Var2, z0 z0Var3) {
        z0Var.getClass();
        z0Var2.getClass();
        z0Var3.getClass();
        this.f195769a = z0Var;
        this.f195770b = z0Var2;
        this.f195771c = z0Var3;
        this.f195772d = (z0Var instanceof z0.a) || (z0Var3 instanceof z0.a) || (z0Var2 instanceof z0.a);
        this.f195773e = (z0Var instanceof z0.c) && (z0Var3 instanceof z0.c) && (z0Var2 instanceof z0.c);
    }

    public static b1 a(b1 b1Var, z0 z0Var, z0 z0Var2, z0 z0Var3, int i14) {
        if ((i14 & 1) != 0) {
            z0Var = b1Var.f195769a;
        }
        if ((i14 & 2) != 0) {
            z0Var2 = b1Var.f195770b;
        }
        if ((i14 & 4) != 0) {
            z0Var3 = b1Var.f195771c;
        }
        z0Var.getClass();
        z0Var2.getClass();
        z0Var3.getClass();
        return new b1(z0Var, z0Var2, z0Var3);
    }

    public final b1 b(c1 c1Var, z0 z0Var) {
        c1Var.getClass();
        z0Var.getClass();
        int i14 = b.f195774a[c1Var.ordinal()];
        if (i14 == 1) {
            return a(this, null, null, z0Var, 3);
        }
        if (i14 == 2) {
            return a(this, null, z0Var, null, 5);
        }
        if (i14 == 3) {
            return a(this, z0Var, null, null, 6);
        }
        lc.u0.r();
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b1)) {
            return false;
        }
        b1 b1Var = (b1) obj;
        return this.f195769a.equals(b1Var.f195769a) && this.f195770b.equals(b1Var.f195770b) && this.f195771c.equals(b1Var.f195771c);
    }

    public final int hashCode() {
        return this.f195771c.hashCode() + ((this.f195770b.hashCode() + (this.f195769a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "LoadStates(refresh=" + this.f195769a + ", prepend=" + this.f195770b + ", append=" + this.f195771c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lyc/b1$a;", "", "<init>", "()V", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
