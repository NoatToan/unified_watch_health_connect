package androidx.health.platform.client.proto;

/* JADX INFO: loaded from: classes.dex */
public enum n1 implements l0.a {
    ACCESS_TYPE_UNKNOWN(0),
    ACCESS_TYPE_READ(1),
    ACCESS_TYPE_WRITE(2);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7733a;

    public class a implements l0.b<n1> {
    }

    public static final class b implements l0.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f7734a = new b();

        private b() {
        }

        @Override // androidx.health.platform.client.proto.l0.c
        public final boolean isInRange(int i14) {
            return n1.a(i14) != null;
        }
    }

    static {
        new a();
    }

    n1(int i14) {
        this.f7733a = i14;
    }

    public static n1 a(int i14) {
        if (i14 == 0) {
            return ACCESS_TYPE_UNKNOWN;
        }
        if (i14 == 1) {
            return ACCESS_TYPE_READ;
        }
        if (i14 != 2) {
            return null;
        }
        return ACCESS_TYPE_WRITE;
    }

    @Override // androidx.health.platform.client.proto.l0.a
    public final int getNumber() {
        return this.f7733a;
    }
}
