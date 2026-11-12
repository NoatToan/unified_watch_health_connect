package defpackage;

import com.xiaomi.onetrack.api.b;
import java.util.Iterator;
import java.util.LinkedList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class qks implements Comparable<qks> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedList<lis> f31614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f31615b;
    public long c;
    public int d;

    public qks() {
        this(null, 0);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(qks qksVar) {
        if (qksVar == null) {
            return 1;
        }
        return qksVar.d - this.d;
    }

    public synchronized qks b(JSONObject jSONObject) {
        this.c = jSONObject.getLong("tt");
        this.d = jSONObject.getInt("wt");
        this.f31615b = jSONObject.getString(b.E);
        JSONArray jSONArray = jSONObject.getJSONArray("ah");
        for (int i = 0; i < jSONArray.length(); i++) {
            this.f31614a.add(new lis().b(jSONArray.getJSONObject(i)));
        }
        return this;
    }

    public synchronized JSONObject c() {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject();
            jSONObject.put("tt", this.c);
            jSONObject.put("wt", this.d);
            jSONObject.put(b.E, this.f31615b);
            JSONArray jSONArray = new JSONArray();
            Iterator<lis> it = this.f31614a.iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next().c());
            }
            jSONObject.put("ah", jSONArray);
        } catch (Throwable th) {
            throw th;
        }
        return jSONObject;
    }

    public synchronized void d(lis lisVar) {
        if (lisVar != null) {
            try {
                this.f31614a.add(lisVar);
                int iA = lisVar.a();
                if (iA > 0) {
                    this.d += lisVar.a();
                } else {
                    int i = 0;
                    for (int size = this.f31614a.size() - 1; size >= 0 && this.f31614a.get(size).a() < 0; size--) {
                        i++;
                    }
                    this.d += iA * i;
                }
                if (this.f31614a.size() > 30) {
                    this.d -= this.f31614a.remove().a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String toString() {
        return this.f31615b + ":" + this.d;
    }

    public qks(String str) {
        this(str, 0);
    }

    public qks(String str, int i) {
        this.f31614a = new LinkedList<>();
        this.c = 0L;
        this.f31615b = str;
        this.d = i;
    }
}
