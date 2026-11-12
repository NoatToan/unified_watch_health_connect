package hy2;

import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.exoplayer2.offline.DownloadService;
import com.google.common.net.HttpHeaders;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import org.apache.commons.lang3.BooleanUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.x0;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhy2/b;", "", "<init>", "()V", "util_sync_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f86373a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Logger f86374b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AtomicBoolean f86375c;

    static {
        Logger logger = LoggerFactory.getLogger("GcResponseUtil");
        logger.getClass();
        f86374b = logger;
        f86375c = new AtomicBoolean(true);
    }

    private b() {
    }

    public static final boolean a(zi2.a aVar) {
        boolean z14;
        boolean z15;
        AtomicBoolean atomicBoolean = f86375c;
        aVar.getClass();
        Logger logger = f86374b;
        logger.info("Checking Sync service Status");
        try {
            f86373a.getClass();
            x0 x0Var = x0.f105818a;
            URLConnection uRLConnectionOpenConnection = new URL(String.format("https://%s/status/sync", Arrays.copyOf(new Object[]{aVar.f204881b}, 1))).openConnection();
            uRLConnectionOpenConnection.getClass();
            HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
            String headerField = httpURLConnection.getHeaderField("enabled");
            httpURLConnection.disconnect();
            z15 = headerField != null && headerField.equals(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
            try {
                atomicBoolean.set(true);
            } catch (Exception e4) {
                z14 = z15;
                e = e4;
                atomicBoolean.set(false);
                logger.error("Exception in checking SyncServiceStatus ", (Throwable) e);
                z15 = z14;
            }
        } catch (Exception e14) {
            e = e14;
            z14 = false;
        }
        logger.info("Sync service is enabled :" + z15);
        return z15;
    }

    public static final String b(String str) {
        str.getClass();
        if (str.length() <= 0) {
            return null;
        }
        try {
            JSONArray jSONArray = new JSONObject(str).getJSONObject("detailedImportResult").getJSONArray("failures");
            int length = jSONArray.length();
            for (int i14 = 0; i14 < length; i14++) {
                JSONArray jSONArray2 = jSONArray.getJSONObject(i14).getJSONArray("messages");
                int length2 = jSONArray2.length();
                for (int i15 = 0; i15 < length2; i15++) {
                    JSONObject jSONObject = jSONArray2.getJSONObject(i15);
                    int iOptInt = jSONObject.optInt("code");
                    if (iOptInt == 408) {
                        return jSONObject.optString(FirebaseAnalytics.Param.CONTENT, String.valueOf(iOptInt));
                    }
                }
            }
            return null;
        } catch (JSONException unused) {
            return null;
        }
    }

    public static final long c(c cVar) {
        cVar.getClass();
        String strD = cVar.d("location-in-milliseconds");
        if (strD == null) {
            return 1000L;
        }
        try {
            Long lValueOf = Long.valueOf(strD);
            lValueOf.getClass();
            return Math.max(lValueOf.longValue(), 1000L);
        } catch (NumberFormatException unused) {
            return 1000L;
        }
    }

    public static final ArrayList d(boolean z14, boolean z15) {
        ArrayList arrayList = new ArrayList();
        com.nimbusds.jose.shaded.gson.internal.a.u("Sync-Type", z14 ? "background" : DownloadService.KEY_FOREGROUND, arrayList);
        if (z15) {
            com.nimbusds.jose.shaded.gson.internal.a.u("lastFile", BooleanUtils.TRUE, arrayList);
        }
        com.nimbusds.jose.shaded.gson.internal.a.u(HttpHeaders.ACCEPT, "application/json", arrayList);
        return arrayList;
    }
}
