package f5;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
public interface k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f68985a = a.f68986a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lf5/k$a;", "", "<init>", "()V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f68986a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final C1427a f68987b = new C1427a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final e f68988c = new e();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final c f68989d = new c();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final d f68990e = new d();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final f f68991f = new f();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final n f68992g = new n(1.0f);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final b f68993h = new b();

        /* JADX INFO: renamed from: f5.k$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"f5/k$a$a", "Lf5/k;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class C1427a implements k {
            @Override // f5.k
            public final long a(long j8, long j14) {
                float fMax = Math.max(Float.intBitsToFloat((int) (j14 >> 32)) / Float.intBitsToFloat((int) (j8 >> 32)), Float.intBitsToFloat((int) (j14 & 4294967295L)) / Float.intBitsToFloat((int) (j8 & 4294967295L)));
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(fMax)) & 4294967295L);
                int i14 = f2.f68942b;
                return jFloatToRawIntBits;
            }
        }

        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"f5/k$a$b", "Lf5/k;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class b implements k {
            @Override // f5.k
            public final long a(long j8, long j14) {
                float fIntBitsToFloat = Float.intBitsToFloat((int) (j14 >> 32)) / Float.intBitsToFloat((int) (j8 >> 32));
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j14 & 4294967295L)) / Float.intBitsToFloat((int) (j8 & 4294967295L));
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
                int i14 = f2.f68942b;
                return jFloatToRawIntBits;
            }
        }

        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"f5/k$a$c", "Lf5/k;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class c implements k {
            @Override // f5.k
            public final long a(long j8, long j14) {
                float fIntBitsToFloat = Float.intBitsToFloat((int) (j14 & 4294967295L)) / Float.intBitsToFloat((int) (j8 & 4294967295L));
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L);
                int i14 = f2.f68942b;
                return jFloatToRawIntBits;
            }
        }

        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"f5/k$a$d", "Lf5/k;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class d implements k {
            @Override // f5.k
            public final long a(long j8, long j14) {
                float fIntBitsToFloat = Float.intBitsToFloat((int) (j14 >> 32)) / Float.intBitsToFloat((int) (j8 >> 32));
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L);
                int i14 = f2.f68942b;
                return jFloatToRawIntBits;
            }
        }

        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"f5/k$a$e", "Lf5/k;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class e implements k {
            @Override // f5.k
            public final long a(long j8, long j14) {
                float fA = g0.a(j8, j14);
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fA)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fA)));
                int i14 = f2.f68942b;
                return jFloatToRawIntBits;
            }
        }

        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"f5/k$a$f", "Lf5/k;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class f implements k {
            @Override // f5.k
            public final long a(long j8, long j14) {
                if (Float.intBitsToFloat((int) (j8 >> 32)) <= Float.intBitsToFloat((int) (j14 >> 32)) && Float.intBitsToFloat((int) (j8 & 4294967295L)) <= Float.intBitsToFloat((int) (j14 & 4294967295L))) {
                    long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(1.0f)) << 32) | (((long) Float.floatToRawIntBits(1.0f)) & 4294967295L);
                    int i14 = f2.f68942b;
                    return jFloatToRawIntBits;
                }
                float fA = g0.a(j8, j14);
                long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fA)) << 32) | (((long) Float.floatToRawIntBits(fA)) & 4294967295L);
                int i15 = f2.f68942b;
                return jFloatToRawIntBits2;
            }
        }

        private a() {
        }
    }

    long a(long j8, long j14);
}
