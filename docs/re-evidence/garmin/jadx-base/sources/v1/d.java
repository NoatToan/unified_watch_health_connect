package v1;

import ch.qos.logback.core.CoreConstants;
import ds.e0;
import kotlin.m1;
import kotlin.n1;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\fB-\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lv1/d;", "", "Li5/m1;", "clipEntry", "Li5/n1;", "clipMetadata", "Lv1/d$a;", "source", "Lv1/b;", "platformTransferableContent", "<init>", "(Li5/m1;Li5/n1;ILv1/b;Lkotlin/jvm/internal/j;)V", "a", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class d {
    public /* synthetic */ d(m1 m1Var, n1 n1Var, int i14, b bVar, int i15, j jVar) {
        this(m1Var, n1Var, i14, (i15 & 8) != 0 ? null : bVar, null);
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Lv1/d$a;", "", "a", "value", "", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @d23.a
    public static final class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final C3246a f174661b = new C3246a(null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f174662c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f174663d = 2;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f174664a;

        public final boolean equals(Object obj) {
            if (obj instanceof a) {
                return this.f174664a == ((a) obj).f174664a;
            }
            return false;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f174664a);
        }

        public final String toString() {
            int i14 = this.f174664a;
            if (i14 == 0) {
                return "Source.Keyboard";
            }
            if (i14 == f174662c) {
                return "Source.DragAndDrop";
            }
            return i14 == f174663d ? "Source.Clipboard" : e0.i("Invalid (", i14, CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }

        /* JADX INFO: renamed from: v1.d$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lv1/d$a$a;", "", "<init>", "()V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class C3246a {
            public /* synthetic */ C3246a(j jVar) {
                this();
            }

            private C3246a() {
            }
        }
    }

    private d(m1 m1Var, n1 n1Var, int i14, b bVar) {
    }

    public /* synthetic */ d(m1 m1Var, n1 n1Var, int i14, b bVar, j jVar) {
        this(m1Var, n1Var, i14, bVar);
    }
}
