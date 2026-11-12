package defpackage;

import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class bbc implements yz7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public cbc f4012a;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final bbc f4013a = new bbc();
    }

    public static bbc a() {
        return b.f4013a;
    }

    public List<String> b(n08 n08Var) {
        return this.f4012a.b(n08Var);
    }

    public boolean c(Object obj) {
        return this.f4012a.c(obj);
    }

    public HashMap<String, byte[]> d() {
        return this.f4012a.d();
    }

    public boolean e(Object obj) {
        return this.f4012a.f(obj);
    }

    @Override // defpackage.yz7
    public String getDomain() {
        return this.f4012a.getDomain();
    }

    @Override // defpackage.yz7
    public JSONObject parse(String str, n08 n08Var) {
        return this.f4012a.parse(str, n08Var);
    }

    @Override // defpackage.yz7
    public a08 provide(JSONObject jSONObject, JSONObject jSONObject2, n08 n08Var) {
        return this.f4012a.provide(jSONObject, jSONObject2, n08Var);
    }

    public bbc() {
        this.f4012a = new cbc();
    }
}
