package en0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Len0/a;", "", "<init>", "()V", "b", "a", "Len0/a$a;", "Len0/a$b;", "gcm-hand-alignment_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class a {

    /* JADX INFO: renamed from: en0.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Len0/a$a;", "Len0/a;", "<init>", "()V", "gcm-hand-alignment_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C1375a extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C1375a f64683a = new C1375a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final double f64684b = Math.toRadians(1.0d);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final double f64685c = 1.0d;

        private C1375a() {
            super(null);
        }

        @Override // en0.a
        public final double a() {
            return f64685c;
        }

        @Override // en0.a
        public final double b() {
            return f64684b;
        }

        public final String toString() {
            return "Degrees";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Len0/a$b;", "Len0/a;", "<init>", "()V", "gcm-hand-alignment_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f64686a = new b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final double f64687b = 1.0d;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final double f64688c = Math.toDegrees(1.0d);

        private b() {
            super(null);
        }

        @Override // en0.a
        public final double a() {
            return f64688c;
        }

        @Override // en0.a
        public final double b() {
            return f64687b;
        }

        public final String toString() {
            return "Radians";
        }
    }

    public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
        this();
    }

    public abstract double a();

    public abstract double b();

    private a() {
    }
}
