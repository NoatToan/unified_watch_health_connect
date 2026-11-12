package androidx.lifecycle;

import p005kotlin.Metadata;
import r53.p2;
import r53.q2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Landroidx/lifecycle/b0;", "", "<init>", "()V", "a", "b", "lifecycle-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.lifecycle.b<Object> f7830a = new androidx.lifecycle.b<>(null);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/lifecycle/b0$b;", "", "<init>", "(Ljava/lang/String;I)V", "lifecycle-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public enum b {
        DESTROYED,
        INITIALIZED,
        CREATED,
        STARTED,
        RESUMED;

        public final boolean a(b bVar) {
            bVar.getClass();
            return compareTo(bVar) >= 0;
        }
    }

    public abstract void a(m0 m0Var);

    /* JADX INFO: renamed from: b */
    public abstract b getF7973d();

    public r53.b2 c() {
        p2 p2VarA = q2.a(getF7973d());
        a(new a0(p2VarA, 0));
        return r53.s.d(p2VarA);
    }

    public abstract void d(m0 m0Var);

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 androidx.lifecycle.b0$a[], still in use, count: 1, list:
      (r0v1 androidx.lifecycle.b0$a[]) from 0x004e: CONSTRUCTOR (r0v1 androidx.lifecycle.b0$a[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
    	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Landroidx/lifecycle/b0$a;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "a", "ON_CREATE", "ON_START", "ON_RESUME", "ON_PAUSE", "ON_STOP", "ON_DESTROY", "ON_ANY", "lifecycle-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        ON_CREATE,
        ON_START,
        ON_RESUME,
        ON_PAUSE,
        ON_STOP,
        ON_DESTROY,
        ON_ANY;

        private static final /* synthetic */ w13.a $ENTRIES;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        public static final /* synthetic */ class b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f7832a;

            static {
                int[] iArr = new int[a.values().length];
                try {
                    iArr[a.ON_CREATE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[a.ON_STOP.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[a.ON_START.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[a.ON_PAUSE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[a.ON_RESUME.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[a.ON_DESTROY.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[a.ON_ANY.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                f7832a = iArr;
            }
        }

        static {
            $ENTRIES = new w13.c(new a[]{r0, r1, r2, r3, r4, r5, r6});
        }

        private a() {
            super(str, i);
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }

        public final b a() {
            switch (b.f7832a[ordinal()]) {
                case 1:
                case 2:
                    return b.CREATED;
                case 3:
                case 4:
                    return b.STARTED;
                case 5:
                    return b.RESUMED;
                case 6:
                    return b.DESTROYED;
                case 7:
                    c22.t.h(this, " has no target state");
                    return null;
                default:
                    lc.u0.r();
                    return null;
            }
        }

        /* JADX INFO: renamed from: androidx.lifecycle.b0$a$a, reason: collision with other inner class name and from kotlin metadata */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/lifecycle/b0$a$a;", "", "<init>", "()V", "lifecycle-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {

            /* JADX INFO: renamed from: androidx.lifecycle.b0$a$a$a, reason: collision with other inner class name */
            public static final /* synthetic */ class C0106a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f7831a;

                static {
                    int[] iArr = new int[b.values().length];
                    try {
                        iArr[b.CREATED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[b.STARTED.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[b.RESUMED.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[b.DESTROYED.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[b.INITIALIZED.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    f7831a = iArr;
                }
            }

            public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            public static a a(b bVar) {
                bVar.getClass();
                int i14 = C0106a.f7831a[bVar.ordinal()];
                if (i14 == 1) {
                    return a.ON_DESTROY;
                }
                if (i14 == 2) {
                    return a.ON_STOP;
                }
                if (i14 != 3) {
                    return null;
                }
                return a.ON_PAUSE;
            }

            public static a b(b bVar) {
                bVar.getClass();
                int i14 = C0106a.f7831a[bVar.ordinal()];
                if (i14 == 1) {
                    return a.ON_START;
                }
                if (i14 == 2) {
                    return a.ON_RESUME;
                }
                if (i14 != 5) {
                    return null;
                }
                return a.ON_CREATE;
            }

            public static a c(b bVar) {
                bVar.getClass();
                int i14 = C0106a.f7831a[bVar.ordinal()];
                if (i14 == 1) {
                    return a.ON_CREATE;
                }
                if (i14 == 2) {
                    return a.ON_START;
                }
                if (i14 != 3) {
                    return null;
                }
                return a.ON_RESUME;
            }

            private Companion() {
            }
        }
    }
}
