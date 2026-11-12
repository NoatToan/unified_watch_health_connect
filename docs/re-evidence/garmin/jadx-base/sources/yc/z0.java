package yc;

import ch.qos.logback.core.CoreConstants;
import com.google.firebase.messaging.Constants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0006\u0007\bB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0003\t\n\u000b¨\u0006\f"}, d2 = {"Lyc/z0;", "", "", "endOfPaginationReached", "<init>", "(Z)V", "a", "b", "c", "Lyc/z0$a;", "Lyc/z0$b;", "Lyc/z0$c;", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f196662a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lyc/z0$a;", "Lyc/z0;", "", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "<init>", "(Ljava/lang/Throwable;)V", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a extends z0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Throwable f196663b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Throwable th3) {
            super(false, null);
            th3.getClass();
            this.f196663b = th3;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f196662a == aVar.f196662a && p005kotlin.jvm.internal.s.g(this.f196663b, aVar.f196663b);
        }

        public final int hashCode() {
            return this.f196663b.hashCode() + Boolean.hashCode(this.f196662a);
        }

        public final String toString() {
            return "Error(endOfPaginationReached=" + this.f196662a + ", error=" + this.f196663b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lyc/z0$b;", "Lyc/z0;", "<init>", "()V", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b extends z0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f196664b = new b();

        private b() {
            super(false, null);
        }

        public final boolean equals(Object obj) {
            if (obj instanceof b) {
                return this.f196662a == ((b) obj).f196662a;
            }
            return false;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f196662a);
        }

        public final String toString() {
            return am.j.t(new StringBuilder("Loading(endOfPaginationReached="), this.f196662a, CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
    }

    private z0(boolean z14) {
        this.f196662a = z14;
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lyc/z0$c;", "Lyc/z0;", "", "endOfPaginationReached", "<init>", "(Z)V", "a", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class c extends z0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f196665b = new a(null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f196666c = new c(true);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final c f196667d = new c(false);

        public c(boolean z14) {
            super(z14, null);
        }

        public final boolean equals(Object obj) {
            if (obj instanceof c) {
                return this.f196662a == ((c) obj).f196662a;
            }
            return false;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f196662a);
        }

        public final String toString() {
            return am.j.t(new StringBuilder("NotLoading(endOfPaginationReached="), this.f196662a, CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lyc/z0$c$a;", "", "<init>", "()V", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class a {
            public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            private a() {
            }
        }
    }

    public /* synthetic */ z0(boolean z14, p005kotlin.jvm.internal.j jVar) {
        this(z14);
    }
}
