package ji2;

import ch.qos.logback.classic.Logger;
import com.google.gson.JsonObject;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lji2/x;", "Lc83/f;", "Lcom/google/gson/JsonObject;", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class x implements c83.f<JsonObject> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ni2.a<String> f98900a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w f98901b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f98902c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f98903d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f98904e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f98905f;

    public x(ni2.a<String> aVar, w wVar, String str, String str2, String str3, String str4) {
        this.f98900a = aVar;
        this.f98901b = wVar;
        this.f98902c = str;
        this.f98903d = str2;
        this.f98904e = str3;
        this.f98905f = str4;
    }

    @Override // c83.f
    public final void a(c83.d<JsonObject> dVar, Throwable th3) {
        dVar.getClass();
        th3.getClass();
        hi2.d dVar2 = w.f98897c;
        th3.toString();
        dVar2.getClass();
        this.f98900a.b("Something went wrong", th3);
    }

    @Override // c83.f
    public final void c(c83.d<JsonObject> dVar, c83.a0<JsonObject> a0Var) throws JSONException {
        Integer numValueOf;
        int length;
        dVar.getClass();
        w.f98897c.getClass();
        JsonObject jsonObject = a0Var.f25746b;
        Unit unit = null;
        if (jsonObject != null) {
            JSONArray jSONArray = new JSONObject(jsonObject.toString()).getJSONArray("versions");
            w wVar = this.f98901b;
            wVar.getClass();
            if (jSONArray == null || (length = jSONArray.length()) == 0) {
                numValueOf = null;
            } else {
                int i14 = 0;
                if (length != 1) {
                    String str = this.f98902c;
                    try {
                        if (str != null) {
                            int i15 = Integer.parseInt(str);
                            int length2 = jSONArray.length() - 1;
                            while (true) {
                                if (i14 >= length2) {
                                    numValueOf = Integer.valueOf(Integer.parseInt(jSONArray.get(jSONArray.length() - 1).toString()));
                                    break;
                                } else {
                                    if (i15 >= Integer.parseInt(jSONArray.get(i14).toString()) && i15 < Integer.parseInt(jSONArray.get(i14 + 1).toString())) {
                                        numValueOf = Integer.valueOf(Integer.parseInt(jSONArray.get(i14).toString()));
                                        break;
                                    }
                                    i14++;
                                }
                            }
                        } else {
                            Integer.parseInt(jSONArray.get(0).toString());
                            numValueOf = null;
                        }
                    } catch (NumberFormatException unused) {
                        jSONArray.toString();
                        Logger logger = hi2.d.f83889c;
                    }
                } else {
                    try {
                        numValueOf = Integer.valueOf(Integer.parseInt(jSONArray.get(0).toString()));
                    } catch (NumberFormatException unused2) {
                        Objects.toString(jSONArray.get(0));
                        Logger logger2 = hi2.d.f83889c;
                        numValueOf = null;
                    }
                }
            }
            h.a aVar = h.f98854a;
            String strValueOf = String.valueOf(numValueOf);
            aVar.getClass();
            h.a.f98858d = strValueOf;
            ni2.a<String> aVar2 = this.f98900a;
            if (numValueOf != null) {
                wVar.a(numValueOf.toString(), this.f98903d, this.f98904e, this.f98905f, aVar2);
                unit = Unit.INSTANCE;
            }
            if (unit == null) {
                aVar2.b("Could not find config version", new NullPointerException());
            }
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            this.f98900a.b("Empty response body", new NullPointerException());
        }
    }
}
