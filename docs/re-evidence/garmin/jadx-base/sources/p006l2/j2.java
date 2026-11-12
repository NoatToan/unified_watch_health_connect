package p006l2;

import ch.qos.logback.core.CoreConstants;
import ds.e0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes.dex */
@d23.a
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0081@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Ll2/j2;", "", "a", "value", "", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class j2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f108585b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f108586a;

    private /* synthetic */ j2(int i14) {
        this.f108586a = i14;
    }

    public static final /* synthetic */ j2 a(int i14) {
        return new j2(i14);
    }

    public static int b(boolean z14, boolean z15, boolean z16, boolean z17, boolean z18) {
        return (z14 ? 1 : 0) | (z15 ? 2 : 0) | (z16 ? 4 : 0) | (z17 ? 8 : 0) | (z18 ? 16 : 0);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j2) {
            return this.f108586a == ((j2) obj).f108586a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f108586a);
    }

    public final String toString() {
        return e0.i("MenuItemsAvailability(value=", this.f108586a, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006¨\u0006\f"}, d2 = {"Ll2/j2$a;", "", "<init>", "()V", "", "COPY", "I", "PASTE", "CUT", "SELECT_ALL", "AUTO_FILL", "NONE", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
