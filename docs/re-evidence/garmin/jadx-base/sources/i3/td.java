package i3;

import ch.qos.logback.classic.pattern.CallerDataConverter;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@d23.a
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0081@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Li3/td;", "", "a", "packedValue", "", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class td {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f89800b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f89801c = kd.h(Float.NaN, Float.NaN);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f89802a;

    private /* synthetic */ td(long j8) {
        this.f89802a = j8;
    }

    public static final /* synthetic */ td a(long j8) {
        return new td(j8);
    }

    public static final float b(long j8) {
        if (j8 != f89801c) {
            return Float.intBitsToFloat((int) (j8 & 4294967295L));
        }
        vb.h.z("SliderRange is unspecified");
        return 0.0f;
    }

    public static final float c(long j8) {
        if (j8 != f89801c) {
            return Float.intBitsToFloat((int) (j8 >> 32));
        }
        vb.h.z("SliderRange is unspecified");
        return 0.0f;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof td) {
            return this.f89802a == ((td) obj).f89802a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f89802a);
    }

    public final String toString() {
        float f14 = kd.f88704a;
        f89800b.getClass();
        long j8 = f89801c;
        long j14 = this.f89802a;
        if (j14 == j8) {
            return "FloatRange.Unspecified";
        }
        return c(j14) + CallerDataConverter.DEFAULT_RANGE_DELIMITER + b(j14);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Li3/td$a;", "", "<init>", "()V", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
