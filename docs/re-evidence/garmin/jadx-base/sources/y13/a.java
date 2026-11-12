package y13;

import java.util.Arrays;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Ly13/a;", "Lx13/a;", "<init>", "()V", "a", "kotlin-stdlib-jdk7"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class a extends x13.a {

    /* JADX INFO: renamed from: y13.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ly13/a$a;", "", "<init>", "()V", "kotlin-stdlib-jdk7"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C3620a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Integer f194039a;

        static {
            Integer num;
            new C3620a();
            Integer num2 = null;
            try {
                Object obj = Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
                num = obj instanceof Integer ? (Integer) obj : null;
            } catch (Throwable unused) {
            }
            if (num != null && num.intValue() > 0) {
                num2 = num;
            }
            f194039a = num2;
        }

        private C3620a() {
        }
    }

    @Override // x13.a
    public final void a(Throwable th3, Throwable th4) {
        th3.getClass();
        th4.getClass();
        Integer num = C3620a.f194039a;
        if (num == null || num.intValue() >= 19) {
            th3.addSuppressed(th4);
        } else {
            super.a(th3, th4);
        }
    }

    @Override // x13.a
    public final List<Throwable> b(Throwable th3) {
        th3.getClass();
        Integer num = C3620a.f194039a;
        if (num != null && num.intValue() < 19) {
            return super.b(th3);
        }
        Throwable[] suppressed = th3.getSuppressed();
        suppressed.getClass();
        List<Throwable> listAsList = Arrays.asList(suppressed);
        listAsList.getClass();
        return listAsList;
    }
}
