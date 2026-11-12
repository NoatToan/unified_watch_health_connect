package g9;

import androidx.health.platform.client.proto.c1;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lg9/a;", "Landroidx/health/platform/client/proto/c1;", "T", "", "<init>", "()V", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class a<T extends c1> {
    public abstract T b();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !getClass().equals(obj.getClass())) {
            return false;
        }
        return s.g(b(), ((a) obj).b());
    }

    public final int hashCode() {
        return b().hashCode();
    }
}
