package defpackage;

import java.nio.charset.StandardCharsets;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class rm1 implements wz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public wz f32693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f32694b = "AudioControlChannel";
    public a c;

    public interface a {
        void a(kt3 kt3Var, String str);
    }

    public rm1(wz wzVar) {
        this.f32693a = wzVar;
        wzVar.b(this);
    }

    @Override // wz.a
    public void a(String str, byte[] bArr) {
        String str2 = new String(bArr, StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        sb.append("AudioControlChannel onReceiver!!! :");
        sb.append(str2);
        try {
            JSONObject jSONObject = new JSONObject(str2);
            String str3 = (String) b(jSONObject, "cmd", String.class);
            String str4 = (String) b(jSONObject, "requestId", String.class);
            String str5 = (String) b(jSONObject, "type", String.class);
            Integer num = (Integer) b(jSONObject, "code", Integer.class);
            String str6 = (String) b(jSONObject, "message", String.class);
            JSONObject jSONObject2 = (JSONObject) b(jSONObject, "data", JSONObject.class);
            kt3 kt3Var = new kt3();
            kt3Var.f24272a = str5;
            kt3Var.c = str3;
            kt3Var.f = jSONObject2;
            kt3Var.f24273b = str4;
            kt3Var.d = num == null ? -1 : num.intValue();
            kt3Var.e = str6;
            a aVar = this.c;
            if (aVar != null) {
                aVar.a(kt3Var, str);
            }
        } catch (JSONException e) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("onReceiver Error: ");
            sb2.append(e.getMessage());
        }
    }

    public final <T> T b(JSONObject jSONObject, String str, Class<T> cls) {
        try {
            return (T) jSONObject.get(str);
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("safeGetJsonValue Error: ");
            sb.append(e.getMessage());
            return null;
        }
    }

    public void c(wz wzVar) {
        this.f32693a = wzVar;
        wzVar.b(this);
    }

    public void d(a aVar) {
        this.c = aVar;
    }
}
