package h5;

import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@d23.a
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Lh5/c2;", "", "a", "packedValue", "", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f81742b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f81743c = a.b(0, 0, 0, 0, true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f81744a;

    public final boolean equals(Object obj) {
        if (obj instanceof c2) {
            return this.f81744a == ((c2) obj).f81744a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f81744a);
    }

    public final String toString() {
        return "TouchBoundsExpansion(packedValue=" + this.f81744a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lh5/c2$a;", "", "<init>", "()V", "", "MASK", "I", "SHIFT", "MAX_VALUE", "", "IS_LAYOUT_DIRECTION_AWARE", "J", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static final int a(a aVar, long j8, int i14) {
            aVar.getClass();
            return ((int) (j8 >> (i14 * 15))) & 32767;
        }

        public static long b(int i14, int i15, int i16, int i17, boolean z14) {
            return (((long) (i15 & 32767)) << 15) | ((long) (i14 & 32767)) | (((long) (i16 & 32767)) << 30) | (((long) (i17 & 32767)) << 45) | (z14 ? Long.MIN_VALUE : 0L);
        }

        private a() {
        }
    }
}
