package g6;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@d23.a
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Lg6/h;", "", "a", "packedValue", "", "ui-unit"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f76000b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f76001c = 9205357640488583168L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f76002a;

    private /* synthetic */ h(long j8) {
        this.f76002a = j8;
    }

    public static final /* synthetic */ h a(long j8) {
        return new h(j8);
    }

    public static final float b(long j8) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j8 & 4294967295L));
        f.a aVar = f.f75994b;
        return fIntBitsToFloat;
    }

    public static final float c(long j8) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j8 >> 32));
        f.a aVar = f.f75994b;
        return fIntBitsToFloat;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            return this.f76002a == ((h) obj).f76002a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f76002a);
    }

    public final String toString() {
        long j8 = this.f76002a;
        if (j8 == 9205357640488583168L) {
            return "DpSize.Unspecified";
        }
        return ((Object) f.d(c(j8))) + " x " + ((Object) f.d(b(j8)));
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lg6/h$a;", "", "<init>", "()V", "ui-unit"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
