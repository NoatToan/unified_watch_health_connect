package defpackage;

import android.net.Uri;
import android.os.SystemClock;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import okhttp3.CacheControl;
import okhttp3.Headers;
import okhttp3.OkHttpClient;
import okhttp3.Request;

/* JADX INFO: loaded from: classes4.dex */
public class bej extends j7h {
    public final OkHttpClient d;
    public final Executor e;

    public bej(OkHttpClient okHttpClient) {
        super(okHttpClient);
        this.d = okHttpClient;
        this.e = okHttpClient.dispatcher().executorService();
    }

    @Override // defpackage.j7h, defpackage.ekg
    /* JADX INFO: renamed from: i */
    public void e(j7h.c cVar, ekg.a aVar) {
        cVar.f = SystemClock.elapsedRealtime();
        Uri uriH = cVar.h();
        Map<String, String> mapN = cVar.b().b() instanceof aej ? n(((aej) cVar.b().b()).x()) : null;
        if (mapN == null) {
            mapN = Collections.emptyMap();
        }
        j(cVar, aVar, new Request.Builder().cacheControl(new CacheControl.Builder().noStore().build()).url(uriH.toString()).headers(Headers.of(mapN)).get().build());
    }

    public final Map<String, String> n(ReadableMap readableMap) {
        if (readableMap == null) {
            return null;
        }
        ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = readableMap.keySetIterator();
        HashMap map = new HashMap();
        while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
            String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
            map.put(strNextKey, readableMap.getString(strNextKey));
        }
        return map;
    }
}
