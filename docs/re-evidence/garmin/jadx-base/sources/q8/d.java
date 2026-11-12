package q8;

import androidx.health.platform.client.proto.u;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class d {
    public static final u a(double d14) {
        u.a aVarZ = u.z();
        aVarZ.g();
        u.x((u) aVarZ.f7677b, d14);
        return aVarZ.e();
    }

    public static final u b(String str) {
        u.a aVarZ = u.z();
        aVarZ.g();
        u.t((u) aVarZ.f7677b, str);
        return aVarZ.e();
    }

    public static final u c(int i14, Map<Integer, String> map) {
        map.getClass();
        String str = map.get(Integer.valueOf(i14));
        if (str != null) {
            return b(str);
        }
        return null;
    }

    public static final u d(long j8) {
        u.a aVarZ = u.z();
        aVarZ.g();
        u.w((u) aVarZ.f7677b, j8);
        return aVarZ.e();
    }

    public static final u e(String str) {
        u.a aVarZ = u.z();
        aVarZ.g();
        u.s((u) aVarZ.f7677b, str);
        return aVarZ.e();
    }
}
