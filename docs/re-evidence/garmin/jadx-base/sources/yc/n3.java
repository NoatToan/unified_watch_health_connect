package yc;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001:\u0002\u0006\u0007B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lyc/n3;", "", "Key", "Value", "<init>", "()V", "a", "b", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class n3<Key, Value> {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lyc/n3$a;", "", "<init>", "(Ljava/lang/String;I)V", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum a {
        LAUNCH_INITIAL_REFRESH,
        /* JADX INFO: Fake field, exist only in values array */
        SKIP_INITIAL_REFRESH
    }

    public abstract Object a();

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lyc/n3$b;", "", "<init>", "()V", "a", "b", "Lyc/n3$b$a;", "Lyc/n3$b$b;", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class b {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lyc/n3$b$a;", "Lyc/n3$b;", "", "throwable", "<init>", "(Ljava/lang/Throwable;)V", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class a extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Throwable f196278a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Throwable th3) {
                super(null);
                th3.getClass();
                this.f196278a = th3;
            }
        }

        /* JADX INFO: renamed from: yc.n3$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lyc/n3$b$b;", "Lyc/n3$b;", "", "endOfPaginationReached", "<init>", "(Z)V", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class C3667b extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final boolean f196279a;

            public C3667b(boolean z14) {
                super(null);
                this.f196279a = z14;
            }
        }

        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }
}
