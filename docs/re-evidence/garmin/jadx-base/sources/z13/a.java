package z13;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lz13/a;", "Ly13/a;", "<init>", "()V", "a", "kotlin-stdlib-jdk8"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class a extends y13.a {

    /* JADX INFO: renamed from: z13.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lz13/a$a;", "", "<init>", "()V", "kotlin-stdlib-jdk8"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C3761a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Integer f201505a;

        static {
            Integer num;
            new C3761a();
            Integer num2 = null;
            try {
                Object obj = Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
                num = obj instanceof Integer ? (Integer) obj : null;
            } catch (Throwable unused) {
            }
            if (num != null && num.intValue() > 0) {
                num2 = num;
            }
            f201505a = num2;
        }

        private C3761a() {
        }
    }
}
