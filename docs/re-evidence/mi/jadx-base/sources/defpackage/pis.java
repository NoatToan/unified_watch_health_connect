package defpackage;

import android.text.TextUtils;
import com.xiaomi.onetrack.api.b;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class pis {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f30450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList<mis> f30451b = new ArrayList<>();

    public pis(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("the host is empty");
        }
        this.f30450a = str;
    }

    public synchronized mis a() {
        for (int size = this.f30451b.size() - 1; size >= 0; size--) {
            mis misVar = this.f30451b.get(size);
            if (misVar.p()) {
                wjs.c().l(misVar.b());
                return misVar;
            }
        }
        return null;
    }

    public synchronized pis b(JSONObject jSONObject) {
        this.f30450a = jSONObject.getString(b.E);
        JSONArray jSONArray = jSONObject.getJSONArray("fbs");
        for (int i = 0; i < jSONArray.length(); i++) {
            this.f30451b.add(new mis(this.f30450a).a(jSONArray.getJSONObject(i)));
        }
        return this;
    }

    public String c() {
        return this.f30450a;
    }

    public ArrayList<mis> d() {
        return this.f30451b;
    }

    public synchronized JSONObject e() {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject();
            jSONObject.put(b.E, this.f30450a);
            JSONArray jSONArray = new JSONArray();
            Iterator<mis> it = this.f30451b.iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next().f());
            }
            jSONObject.put("fbs", jSONArray);
        } catch (Throwable th) {
            throw th;
        }
        return jSONObject;
    }

    public synchronized void f(mis misVar) {
        int i = 0;
        while (i < this.f30451b.size()) {
            try {
                if (this.f30451b.get(i).q(misVar)) {
                    this.f30451b.set(i, misVar);
                    break;
                }
                i++;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (i >= this.f30451b.size()) {
            this.f30451b.add(misVar);
        }
    }

    public synchronized void g(boolean z) {
        try {
            for (int size = this.f30451b.size() - 1; size >= 0; size--) {
                mis misVar = this.f30451b.get(size);
                if (z) {
                    if (misVar.w()) {
                        this.f30451b.remove(size);
                    }
                } else if (!misVar.u()) {
                    this.f30451b.remove(size);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f30450a);
        sb.append("\n");
        Iterator<mis> it = this.f30451b.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
        }
        return sb.toString();
    }

    public pis() {
    }
}
