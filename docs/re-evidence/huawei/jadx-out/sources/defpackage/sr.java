package defpackage;

import com.braintreepayments.api.ErrorWithResponse;
import com.braintreepayments.api.HttpResponseParser;
import com.huawei.hms.network.embedded.w9;
import java.net.HttpURLConnection;
import kotlin.Metadata;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0001¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0003\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/braintreepayments/api/BraintreeGraphQLResponseParser;", "Lcom/braintreepayments/api/HttpResponseParser;", "()V", "baseParser", "(Lcom/braintreepayments/api/HttpResponseParser;)V", "parse", "", "responseCode", "", w9.h, "Ljava/net/HttpURLConnection;", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class sr implements HttpResponseParser {
    private final HttpResponseParser e;

    public sr(HttpResponseParser httpResponseParser) {
        zcp.c(httpResponseParser, "");
        this.e = httpResponseParser;
    }

    public sr() {
        this(new sc());
    }

    @Override // com.braintreepayments.api.HttpResponseParser
    public String parse(int responseCode, HttpURLConnection connection) throws Exception {
        zcp.c(connection, "");
        String str = this.e.parse(responseCode, connection);
        JSONArray jSONArrayOptJSONArray = new JSONObject(str).optJSONArray("errors");
        if (jSONArrayOptJSONArray == null) {
            zcp.b((Object) str, "");
            return str;
        }
        int length = jSONArrayOptJSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject = jSONArrayOptJSONArray.getJSONObject(i);
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("extensions");
            String strE = tu.e(jSONObject, "message", "An Unexpected Exception Occurred");
            if (jSONObjectOptJSONObject == null) {
                throw new uz(strE);
            }
            String strE2 = tu.e(jSONObjectOptJSONObject, "legacyCode", "");
            String strE3 = tu.e(jSONObjectOptJSONObject, "errorType", "");
            if (zcp.b((Object) strE2, (Object) "50000")) {
                throw new sf(jSONObject.getString("message"));
            }
            if (!zcp.b((Object) strE3, (Object) "user_error")) {
                throw new uz(strE);
            }
        }
        throw ErrorWithResponse.INSTANCE.c(str);
    }
}
