package o13;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@d23.a
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\b\u0002\n\u0002\u0010\n\n\u0000\b\u0087@\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Lo13/c0;", "", "a", "data", "", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c0 implements Comparable<c0> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f128567b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final short f128568a;

    private /* synthetic */ c0(short s8) {
        this.f128568a = s8;
    }

    public static final /* synthetic */ c0 a(short s8) {
        return new c0(s8);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(c0 c0Var) {
        return p005kotlin.jvm.internal.s.h(this.f128568a & 65535, c0Var.f128568a & 65535);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c0) {
            return this.f128568a == ((c0) obj).f128568a;
        }
        return false;
    }

    public final int hashCode() {
        return Short.hashCode(this.f128568a);
    }

    public final String toString() {
        return String.valueOf(this.f128568a & 65535);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\n¨\u0006\f"}, d2 = {"Lo13/c0$a;", "", "<init>", "()V", "Lo13/c0;", "MIN_VALUE", "S", "MAX_VALUE", "", "SIZE_BYTES", "I", "SIZE_BITS", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
