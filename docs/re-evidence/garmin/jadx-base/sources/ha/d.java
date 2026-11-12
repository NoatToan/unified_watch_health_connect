package ha;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public interface d extends androidx.media3.common.j {

    public interface a {
        d createDataSource();
    }

    void a(n nVar);

    long b(g gVar);

    void close();

    default Map<String, List<String>> getResponseHeaders() {
        return Collections.EMPTY_MAP;
    }

    Uri getUri();
}
