package defpackage;

import com.xiaomi.fitness.watch.face.edit.entity.DialWidgetType;
import java.util.ArrayList;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class ket {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f23788a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f23789b = false;
    public int c = 0;
    public boolean d = false;
    public int e = 0;
    public int f = 0;
    public ArrayList<a> g = new ArrayList<>();
    public boolean h = false;
    public boolean i = false;
    public boolean j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f23790k = false;
    public int l = 3;
    public int m = 0;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f23791a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f23792b;

        public a(int i, boolean z) {
            this.f23791a = i;
            this.f23792b = z;
        }

        public int a() {
            return this.f23791a;
        }

        public boolean b() {
            return this.f23792b;
        }

        public String toString() {
            return "{index=" + this.f23791a + ", enable=" + this.f23792b + AbstractJsonLexerKt.END_OBJ;
        }
    }

    public ArrayList<a> a() {
        return this.g;
    }

    public void b(int i) {
        this.l = i;
    }

    public void c(ArrayList<a> arrayList) {
        this.g = arrayList;
    }

    public void d(boolean z) {
        this.h = z;
    }

    public JSONObject e() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("isRtHrOn", this.f23788a);
            jSONObject.put("isLiftScreenOn", this.f23789b);
            jSONObject.put("watchFaceType", this.c);
            jSONObject.put("isConnectedAdvOn", this.d);
            jSONObject.put("longPressDef", this.e);
            jSONObject.put("disturbMode", this.f);
            jSONObject.put("autoPause", this.h);
            jSONObject.put("hrAlert", this.i);
            jSONObject.put("paceAlert", this.j);
            jSONObject.put("disAlert", this.f23790k);
            jSONObject.put("brightness", this.l);
            jSONObject.put("language", this.m);
            ArrayList<a> arrayList = this.g;
            if (arrayList != null && arrayList.size() > 0) {
                JSONArray jSONArray = new JSONArray();
                for (a aVar : this.g) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("index", aVar.a());
                    jSONObject2.put("enable", aVar.b());
                    jSONArray.put(jSONObject2);
                }
                jSONObject.put(DialWidgetType.ALARM, jSONArray);
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public void f(int i) {
        this.f = i;
    }

    public void g(boolean z) {
        this.d = z;
    }

    public void h(int i) {
        this.m = i;
    }

    public void i(boolean z) {
        this.f23790k = z;
    }

    public void j(int i) {
        this.e = i;
    }

    public void k(boolean z) {
        this.i = z;
    }

    public void l(int i) {
        this.c = i;
    }

    public void m(boolean z) {
        this.f23789b = z;
    }

    public void n(boolean z) {
        this.j = z;
    }

    public void o(boolean z) {
        this.f23788a = z;
    }

    public String toString() {
        return e().toString();
    }
}
