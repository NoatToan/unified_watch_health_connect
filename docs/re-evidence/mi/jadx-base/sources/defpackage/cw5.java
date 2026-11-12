package defpackage;

import com.nimbusds.jose.shaded.json.JSONArray;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class cw5 extends wtd<mpd> {
    public cw5(vtd vtdVar) {
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
        return new LinkedHashMap();
    }

    @Override // defpackage.wtd
    public void e(Object obj, String str, Object obj2) {
        ((Map) obj).put(str, obj2);
    }

    @Override // defpackage.wtd
    public wtd<mpd> f(String str) {
        return this.f38340a.c;
    }

    @Override // defpackage.wtd
    public wtd<mpd> g(String str) {
        return this.f38340a.c;
    }
}
