package s5;

import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000bB\u0013\b\u0016\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0006B\u001d\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\tB\u0013\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0004\u0010\n¨\u0006\f"}, d2 = {"Ls5/a0;", "", "", "includeFontPadding", "<init>", "(Z)V", "()V", "Ls5/l;", "emojiSupportMatch", "(IZLkotlin/jvm/internal/j;)V", "(ILkotlin/jvm/internal/j;)V", "a", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f157123c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a0 f157124d = new a0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f157125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f157126b;

    /* JADX WARN: Illegal instructions before constructor call */
    public a0(int i14, boolean z14, int i15, p005kotlin.jvm.internal.j jVar) {
        if ((i15 & 1) != 0) {
            l.f157234b.getClass();
            i14 = 0;
        }
        this(i14, (i15 & 2) != 0 ? false : z14, (p005kotlin.jvm.internal.j) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        if (this.f157125a != a0Var.f157125a) {
            return false;
        }
        int i14 = a0Var.f157126b;
        l.a aVar = l.f157234b;
        return this.f157126b == i14;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f157125a) * 31;
        l.a aVar = l.f157234b;
        return Integer.hashCode(this.f157126b) + iHashCode;
    }

    public final String toString() {
        return "PlatformParagraphStyle(includeFontPadding=" + this.f157125a + ", emojiSupportMatch=" + ((Object) l.b(this.f157126b)) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ls5/a0$a;", "", "<init>", "()V", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ a0(int i14, boolean z14, p005kotlin.jvm.internal.j jVar) {
        this(i14, z14);
    }

    public a0(boolean z14) {
        this.f157125a = z14;
        l.f157234b.getClass();
        this.f157126b = 0;
    }

    public /* synthetic */ a0(boolean z14, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? false : z14);
    }

    public /* synthetic */ a0(int i14, p005kotlin.jvm.internal.j jVar) {
        this(i14);
    }

    private a0(int i14, boolean z14) {
        this.f157125a = z14;
        this.f157126b = i14;
    }

    private a0(int i14) {
        this.f157125a = false;
        this.f157126b = i14;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public a0(int i14, int i15, p005kotlin.jvm.internal.j jVar) {
        if ((i15 & 1) != 0) {
            l.f157234b.getClass();
            i14 = 0;
        }
        this(i14, (p005kotlin.jvm.internal.j) null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public a0() {
        this(0, (boolean) (0 == true ? 1 : 0), (p005kotlin.jvm.internal.j) null);
        l.f157234b.getClass();
    }
}
