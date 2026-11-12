package un2;

import com.garmin.android.gncs.NotificationConstants;
import java.util.Collection;
import o13.p;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.u0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lun2/b;", "", "Lun2/c;", "config", "<init>", "(Lun2/c;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f172062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JSONObject f172063b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f172064c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final JSONArray f172065d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final JSONArray f172066e;

    public b(c cVar) throws JSONException {
        cVar.getClass();
        this.f172062a = cVar;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("apiVersion", 2);
        jSONObject.put("apiVersionMinor", 0);
        this.f172063b = jSONObject;
        this.f172064c = u0.e(new p("gateway", cVar.d()), new p("gatewayMerchantId", cVar.b()));
        this.f172065d = new JSONArray((Collection) cVar.e());
        this.f172066e = new JSONArray((Collection) cVar.a());
    }

    public final JSONObject a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("allowedAuthMethods", this.f172066e);
        jSONObject2.put("allowedCardNetworks", this.f172065d);
        jSONObject2.put("billingAddressRequired", true);
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("format", "FULL");
        Unit unit = Unit.INSTANCE;
        jSONObject2.put("billingAddressParameters", jSONObject3);
        jSONObject.put(NotificationConstants.KEY_DATA_MIME_TYPE, "CARD");
        jSONObject.put("parameters", jSONObject2);
        return jSONObject;
    }
}
