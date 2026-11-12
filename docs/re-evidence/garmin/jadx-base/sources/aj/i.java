package aj;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public interface i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k f3356a;

    public class a implements i {
        @Override // aj.i
        public final Map<String, String> getHeaders() {
            return Collections.EMPTY_MAP;
        }
    }

    static {
        new a();
        f3356a = new k(new k.a().f3360a);
    }

    Map<String, String> getHeaders();
}
