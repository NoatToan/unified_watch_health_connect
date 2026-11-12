package bb;

import android.net.Uri;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public interface r {
    default void a(yb.n.a aVar) {
    }

    @CanIgnoreReturnValue
    @Deprecated
    default void b(boolean z14) {
    }

    n[] createExtractors();

    default n[] createExtractors(Uri uri, Map<String, List<String>> map) {
        return createExtractors();
    }
}
