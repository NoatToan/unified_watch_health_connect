package defpackage;

import com.nimbusds.jose.shaded.json.JSONArray;
import com.nimbusds.jose.shaded.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class bw5<T> extends wtd<T> {
    public bw5(vtd vtdVar) {
        super(vtdVar);
    }

    @Override // defpackage.wtd
    public void a(Object obj, Object obj2) {
        ((JSONArray) obj).add(obj2);
    }

    @Override // defpackage.wtd
    public Object c() {
        return new JSONArray();
    }

    @Override // defpackage.wtd
    public Object d() {
        return new JSONObject();
    }

    @Override // defpackage.wtd
    public void e(Object obj, String str, Object obj2) {
        ((JSONObject) obj).put(str, obj2);
    }

    @Override // defpackage.wtd
    public wtd<mpd> f(String str) {
        return this.f38340a.f37207b;
    }

    @Override // defpackage.wtd
    public wtd<mpd> g(String str) {
        return this.f38340a.f37207b;
    }
}
