package androidx.health.platform.client.proto;

/* JADX INFO: loaded from: classes.dex */
public final class u0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f7790b = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b1 f7791a;

    public class a implements b1 {
        @Override // androidx.health.platform.client.proto.b1
        public final boolean isSupported(Class<?> cls) {
            return false;
        }

        @Override // androidx.health.platform.client.proto.b1
        public final a1 messageInfoFor(Class<?> cls) {
            throw new IllegalStateException("This should never be called.");
        }
    }

    public static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7792a;

        static {
            int[] iArr = new int[q1.values().length];
            f7792a = iArr;
            try {
                iArr[q1.PROTO3.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public static class c implements b1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b1[] f7793a;

        public c(b1... b1VarArr) {
            this.f7793a = b1VarArr;
        }

        @Override // androidx.health.platform.client.proto.b1
        public final boolean isSupported(Class<?> cls) {
            for (b1 b1Var : this.f7793a) {
                if (b1Var.isSupported(cls)) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.health.platform.client.proto.b1
        public final a1 messageInfoFor(Class<?> cls) {
            for (b1 b1Var : this.f7793a) {
                if (b1Var.isSupported(cls)) {
                    return b1Var.messageInfoFor(cls);
                }
            }
            org.apache.commons.lang3.e.w("No factory is available for message type: ".concat(cls.getName()));
            return null;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public u0() {
        b1 b1Var;
        r1 r1Var = r1.f7767c;
        try {
            b1Var = (b1) Class.forName("androidx.health.platform.client.proto.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            b1Var = f7790b;
        }
        this(new c(i0.f7665a, b1Var));
    }

    private u0(b1 b1Var) {
        l0.a(b1Var, "messageInfoFactory");
        this.f7791a = b1Var;
    }
}
