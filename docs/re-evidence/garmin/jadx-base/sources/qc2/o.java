package qc2;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.lib.networking.authentication.ratelimit.RateLimitException;
import com.google.firebase.perf.FirebasePerformance;
import com.google.maps.android.BuildConfig;
import d53.w;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import org.apache.commons.lang3.StringUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p13.h0;
import p13.l0;
import p13.p0;
import p13.y;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lqc2/o;", "Lqc2/k;", "Lsc2/b;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lve2/e;", "environment", "", "di2AccessToken", "Ldd2/c;", "gc1Credential", "<init>", "(Landroid/content/Context;Lve2/e;Ljava/lang/String;Ldd2/c;)V", "networking-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class o extends k<sc2.b> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f144431j = 0;

    /* JADX WARN: Illegal instructions before constructor call */
    public o(Context context, ve2.e eVar, String str, dd2.c cVar) {
        context.getClass();
        eVar.getClass();
        Logger loggerB = nd2.c.b("GCSocialProfileRequest");
        loggerB.getClass();
        super(context, loggerB, eVar, FirebasePerformance.HttpMethod.GET, "/userprofile-service/socialProfile", str, cVar, null, 128, null);
    }

    @Override // qc2.k
    public final Object b(k.b bVar) {
        return new nc2.e(null, null);
    }

    @Override // qc2.k
    public final wc2.a<sc2.b> c() {
        Logger logger = this.f144415a;
        try {
            HttpURLConnection httpURLConnection = this.f144421g;
            if (httpURLConnection == null) {
                throw new Exception("connection is null");
            }
            int iG = oc.b.g(httpURLConnection);
            Integer numValueOf = Integer.valueOf(iG);
            if (200 != iG) {
                URL url = httpURLConnection.getURL();
                url.getClass();
                return nd2.c.a(logger, url, httpURLConnection, numValueOf);
            }
            String strH = nd2.c.h(this.f144421g);
            if (strH == null || w.J(strH)) {
                throw new Exception("empty response body");
            }
            return d(strH);
        } catch (RateLimitException e4) {
            return new wc2.a.C3415a(e4, Integer.valueOf(e4.getServerResponseCode()), e4.getError(), null, 8, null);
        } catch (Exception e14) {
            logger.error(((Object) (0 == 0 ? "" : null)) + StringUtils.SPACE + this.f144420f, (Throwable) e14);
            return new wc2.a.C3415a(e14, null, null, null, 12, null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00e4  */
    public final wc2.a.b d(String str) throws JSONException {
        Set setG1;
        sc2.b.f158481g.getClass();
        str.getClass();
        JSONObject jSONObject = new JSONObject(str);
        String string = jSONObject.getString("garminGUID");
        string.getClass();
        String strOptString = jSONObject.optString("userProfileFullName", "");
        strOptString.getClass();
        String strOptString2 = jSONObject.optString("profileId", "0");
        strOptString2.getClass();
        long j8 = Long.parseLong(strOptString2);
        String strOptString3 = jSONObject.optString("displayName", "");
        strOptString3.getClass();
        String strOptString4 = jSONObject.optString("profileImageUrlMedium", BuildConfig.TRAVIS);
        if (p005kotlin.jvm.internal.s.g(strOptString4, "") || p005kotlin.jvm.internal.s.g(strOptString4, BuildConfig.TRAVIS)) {
            strOptString4 = null;
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("userRoles");
        if (jSONArrayOptJSONArray == null) {
            setG1 = l0.f134950a;
        } else {
            JSONArray jSONArray = jSONArrayOptJSONArray.length() > 0 ? jSONArrayOptJSONArray : null;
            if (jSONArray != null) {
                j23.l lVarO = j23.t.o(0, jSONArray.length());
                ArrayList arrayList = new ArrayList(y.r(lVarO, 10));
                Iterator<Integer> it = lVarO.iterator();
                while (((j23.k) it).f96801c) {
                    arrayList.add(jSONArray.optString(((p0) it).nextInt(), ""));
                }
                ArrayList<String> arrayList2 = new ArrayList();
                for (Object obj : arrayList) {
                    String str2 = (String) obj;
                    str2.getClass();
                    if (!w.J(str2)) {
                        arrayList2.add(obj);
                    }
                }
                ArrayList arrayList3 = new ArrayList(y.r(arrayList2, 10));
                for (String str3 : arrayList2) {
                    str3.getClass();
                    arrayList3.add(w.i0(str3).toString());
                }
                setG1 = h0.g1(arrayList3);
                if (setG1 == null) {
                    setG1 = l0.f134950a;
                }
            } else {
                setG1 = l0.f134950a;
            }
        }
        sc2.b bVar = new sc2.b(string, strOptString, j8, strOptString3, strOptString4, setG1);
        String str4 = "200 GET " + this.f144420f;
        if (nd2.c.f125412a) {
            str4 = str4 + "\n" + bVar;
        }
        this.f144415a.debug(str4);
        return new wc2.a.b(bVar, 200);
    }

    public /* synthetic */ o(Context context, ve2.e eVar, String str, dd2.c cVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(context, eVar, (i14 & 4) != 0 ? null : str, (i14 & 8) != 0 ? null : cVar);
    }
}
