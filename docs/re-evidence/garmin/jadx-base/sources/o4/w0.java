package o4;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@d23.a
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Lo4/w0;", "", "a", "value", "", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class w0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f129024b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f129025c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f129026d = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f129027e = 3;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f129028f = 4;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f129029a;

    private /* synthetic */ w0(int i14) {
        this.f129029a = i14;
    }

    public static final /* synthetic */ w0 a(int i14) {
        return new w0(i14);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof w0) {
            return this.f129029a == ((w0) obj).f129029a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f129029a);
    }

    public final String toString() {
        int i14 = this.f129029a;
        if (i14 == 0) {
            return "Argb8888";
        }
        if (i14 == f129025c) {
            return "Alpha8";
        }
        if (i14 == f129026d) {
            return "Rgb565";
        }
        if (i14 == f129027e) {
            return "F16";
        }
        return i14 == f129028f ? "Gpu" : "Unknown";
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lo4/w0$a;", "", "<init>", "()V", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
