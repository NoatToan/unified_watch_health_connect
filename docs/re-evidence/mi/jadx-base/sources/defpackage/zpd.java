package defpackage;

import android.net.Uri;
import java.util.Map;
import okio.ByteString;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class zpd implements ojj.c {
    public static final String c = "zpd";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ojj f41544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Map<String, nok> f41545b;

    public class a implements nrk {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f41546a;

        public a(Object obj) {
            this.f41546a = obj;
        }

        @Override // defpackage.nrk
        public void a(Object obj) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("version", 2);
                jSONObject.put("id", this.f41546a);
                jSONObject.put("error", obj);
                zpd.this.f41544a.h(jSONObject.toString());
            } catch (Exception e) {
                cm8.j(zpd.c, "Responding with error failed", e);
            }
        }

        @Override // defpackage.nrk
        public void b(Object obj) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("version", 2);
                jSONObject.put("id", this.f41546a);
                jSONObject.put("result", obj);
                zpd.this.f41544a.h(jSONObject.toString());
            } catch (Exception e) {
                cm8.j(zpd.c, "Responding failed", e);
            }
        }
    }

    public zpd(String str, lhh lhhVar, Map<String, nok> map, ojj.b bVar) {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("ws").encodedAuthority(lhhVar.a()).appendPath("message").appendQueryParameter("device", ia1.d()).appendQueryParameter("app", lhhVar.c()).appendQueryParameter("clientid", str);
        this.f41544a = new ojj(builder.build().toString(), this, bVar);
        this.f41545b = map;
    }

    @Override // ojj.c
    public void a(ByteString byteString) {
        cm8.C(c, "Websocket received message with payload of unexpected type binary");
    }

    public final void b(Object obj, String str) {
        if (obj != null) {
            new a(obj).a(str);
        }
        cm8.i(c, "Handling the message failed with reason: " + str);
    }

    public void e() {
        this.f41544a.c();
    }

    public void f() {
        this.f41544a.e();
    }

    @Override // ojj.c
    public void onMessage(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            int iOptInt = jSONObject.optInt("version");
            String strOptString = jSONObject.optString("method");
            Object objOpt = jSONObject.opt("id");
            Object objOpt2 = jSONObject.opt("params");
            if (iOptInt != 2) {
                cm8.i(c, "Message with incompatible or missing version of protocol received: " + iOptInt);
                return;
            }
            if (strOptString == null) {
                b(objOpt, "No method provided");
                return;
            }
            nok nokVar = this.f41545b.get(strOptString);
            if (nokVar == null) {
                b(objOpt, "No request handler for method: " + strOptString);
                return;
            }
            if (objOpt == null) {
                nokVar.b(objOpt2);
            } else {
                nokVar.a(objOpt2, new a(objOpt));
            }
        } catch (Exception e) {
            cm8.j(c, "Handling the message failed", e);
        }
    }
}
