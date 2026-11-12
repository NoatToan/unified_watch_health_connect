package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class i0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f6739b = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p0 f6740a;

    public class a implements p0 {
        @Override // androidx.datastore.preferences.protobuf.p0
        public final boolean isSupported(Class<?> cls) {
            return false;
        }

        @Override // androidx.datastore.preferences.protobuf.p0
        public final o0 messageInfoFor(Class<?> cls) {
            throw new IllegalStateException("This should never be called.");
        }
    }

    public static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6741a;

        static {
            int[] iArr = new int[b1.values().length];
            f6741a = iArr;
            try {
                iArr[b1.PROTO3.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public static class c implements p0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final p0[] f6742a;

        public c(p0... p0VarArr) {
            this.f6742a = p0VarArr;
        }

        @Override // androidx.datastore.preferences.protobuf.p0
        public final boolean isSupported(Class<?> cls) {
            for (p0 p0Var : this.f6742a) {
                if (p0Var.isSupported(cls)) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.datastore.preferences.protobuf.p0
        public final o0 messageInfoFor(Class<?> cls) {
            for (p0 p0Var : this.f6742a) {
                if (p0Var.isSupported(cls)) {
                    return p0Var.messageInfoFor(cls);
                }
            }
            org.apache.commons.lang3.e.w("No factory is available for message type: ".concat(cls.getName()));
            return null;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public i0() {
        p0 p0Var;
        c1 c1Var = c1.f6688c;
        try {
            p0Var = (p0) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            p0Var = f6739b;
        }
        this(new c(w.f6910a, p0Var));
    }

    private i0(p0 p0Var) {
        z.a(p0Var, "messageInfoFactory");
        this.f6740a = p0Var;
    }
}
