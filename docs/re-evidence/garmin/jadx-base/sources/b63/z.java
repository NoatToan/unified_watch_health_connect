package b63;

import java.time.DateTimeException;
import java.time.ZoneId;
import java.time.ZoneOffset;
import kotlinx.datetime.IllegalTimeZoneException;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0017\u0018\u0000 \u00062\u00020\u0001:\u0001\u0007B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lb63/z;", "", "Ljava/time/ZoneId;", "zoneId", "<init>", "(Ljava/time/ZoneId;)V", "Companion", "a", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
@i63.h(with = h63.p.class)
public class z {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final k f16226b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ZoneId f16227a;

    static {
        a0.INSTANCE.getClass();
        a0 a0Var = a0.f16172b;
        ZoneId zoneIdOf = ZoneId.of("UTC");
        zoneIdOf.getClass();
        f16226b = new k(a0Var, zoneIdOf);
    }

    public z(ZoneId zoneId) {
        zoneId.getClass();
        this.f16227a = zoneId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof z) {
            return this.f16227a.equals(((z) obj).f16227a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f16227a.hashCode();
    }

    public final String toString() {
        String string = this.f16227a.toString();
        string.getClass();
        return string;
    }

    /* JADX INFO: renamed from: b63.z$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lb63/z$a;", "", "<init>", "()V", "Li63/c;", "Lb63/z;", "serializer", "()Li63/c;", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static z a() {
            ZoneId zoneIdSystemDefault = ZoneId.systemDefault();
            zoneIdSystemDefault.getClass();
            return c(zoneIdSystemDefault);
        }

        public static z b(String str) throws Exception {
            str.getClass();
            try {
                if (str.equals("z")) {
                    str = "Z";
                }
                ZoneId zoneIdOf = ZoneId.of(str);
                zoneIdOf.getClass();
                return c(zoneIdOf);
            } catch (Exception e4) {
                if (e4 instanceof DateTimeException) {
                    throw new IllegalTimeZoneException(e4);
                }
                throw e4;
            }
        }

        public static z c(ZoneId zoneId) {
            boolean zIsFixedOffset;
            if (zoneId instanceof ZoneOffset) {
                return new k(new a0((ZoneOffset) zoneId));
            }
            try {
                zIsFixedOffset = zoneId.getRules().isFixedOffset();
            } catch (ArrayIndexOutOfBoundsException unused) {
                zIsFixedOffset = false;
            }
            if (!zIsFixedOffset) {
                return new z(zoneId);
            }
            ZoneId zoneIdNormalized = zoneId.normalized();
            zoneIdNormalized.getClass();
            return new k(new a0((ZoneOffset) zoneIdNormalized), zoneId);
        }

        public final i63.c<z> serializer() {
            return h63.p.f82314a;
        }

        private Companion() {
        }
    }
}
