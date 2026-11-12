package s5;

import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@d23.a
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Ls5/l;", "", "a", "value", "", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f157234b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f157235c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f157236d = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f157237a;

    private /* synthetic */ l(int i14) {
        this.f157237a = i14;
    }

    public static final /* synthetic */ l a(int i14) {
        return new l(i14);
    }

    public static String b(int i14) {
        if (i14 == 0) {
            return "EmojiSupportMatch.Default";
        }
        if (i14 == f157235c) {
            return "EmojiSupportMatch.None";
        }
        return i14 == f157236d ? "EmojiSupportMatch.All" : ds.e0.i("Invalid(value=", i14, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l) {
            return this.f157237a == ((l) obj).f157237a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f157237a);
    }

    public final String toString() {
        return b(this.f157237a);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ls5/l$a;", "", "<init>", "()V", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
