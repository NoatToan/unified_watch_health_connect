package az0;

import am.j;
import android.content.Context;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.google.gson.Gson;
import d53.w;
import java.util.Arrays;
import o53.z;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.x0;
import tn.k;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Laz0/f;", "", "Lokhttp3/OkHttpClient;", "okHttpClient", "Lo53/z;", "ioDispatcher", "<init>", "(Lokhttp3/OkHttpClient;Lo53/z;)V", "a", "gcm-network_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f13695c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OkHttpClient f13696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z f13697b;

    public f(OkHttpClient okHttpClient, z zVar) {
        okHttpClient.getClass();
        zVar.getClass();
        this.f13696a = okHttpClient;
        this.f13697b = zVar;
    }

    public static final String a(f fVar, String str, String str2) {
        fVar.getClass();
        x0 x0Var = x0.f105818a;
        return k.g(str, String.format("_%1$s.json", Arrays.copyOf(new Object[]{str2}, 1)));
    }

    public static final h b(f fVar, String str) {
        fVar.getClass();
        try {
            Response responseExecute = fVar.f13696a.newCall(new Request.Builder().url(str).build()).execute();
            String str2 = "getServerMessage(" + str + ") response success=[" + responseExecute.isSuccessful() + "]";
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.b(a2Var, "ServerStatusRepo", str2);
            if (!responseExecute.isSuccessful()) {
                i2.a.f(a2Var, "ServerStatusRepo", "getServerMessage(" + str + ") FAILED response code " + responseExecute.code());
                return null;
            }
            ResponseBody responseBodyBody = responseExecute.body();
            String strString = responseBodyBody != null ? responseBodyBody.string() : null;
            if (strString != null) {
                return (h) new Gson().fromJson(strString, h.class);
            }
            i2.a.f(a2Var, "ServerStatusRepo", "getServerMessage(" + str + ") NULL response body");
            return null;
        } catch (Exception e4) {
            String str3 = "getServerMessage(" + str + ") FAILED with exception: " + e4;
            i2.a aVar2 = i2.f36769a;
            a2 a2Var2 = a2.GENERAL;
            aVar2.getClass();
            i2.a.f(a2Var2, "ServerStatusRepo", str3);
            return null;
        }
    }

    public final Object c(Context context, String str, az0.a aVar) {
        String strM = j.m("fetchLocalizedMessage(", str, ")");
        i2.a aVar2 = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar2.getClass();
        i2.a.b(a2Var, "ServerStatusRepo", strM);
        if (str == null || w.J(str)) {
            return null;
        }
        return ge1.b.e0(this.f13697b, new g(this, str, context, null), aVar);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Laz0/f$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "SERVER_STATUS_FILE_SUFFIX", "SERVER_STATUS_FILE_DEFAULT_LANG", "gcm-network_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
