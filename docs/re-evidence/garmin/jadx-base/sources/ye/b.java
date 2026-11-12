package ye;

import ch.qos.logback.core.CoreConstants;
import ds.e0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lye/b;", "", "<init>", "()V", "a", "b", "Lye/b$a;", "Lye/b$b;", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class b {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lye/b$a;", "Lye/b;", "<init>", "()V", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f196778a = new a();

        private a() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: ye.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lye/b$b;", "Lye/b;", "", "reason", "<init>", "(I)V", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class C3684b extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f196779a;

        public C3684b(int i14) {
            super(null);
            this.f196779a = i14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C3684b) && this.f196779a == ((C3684b) obj).f196779a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f196779a);
        }

        public final String toString() {
            return e0.j(new StringBuilder("ConstraintsNotMet(reason="), this.f196779a, CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
    }

    public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
        this();
    }

    private b() {
    }
}
