package defpackage;

import android.text.TextUtils;
import com.huawei.ads.adsrec.db.table.AdContentRspRecord;
import com.huawei.ads.fund.util.ListUtil;
import com.huawei.openplatform.abl.log.HiAdLog;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class axi implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f745b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private JSONArray f746c;
    private List<axm> d;
    private String e;
    private int f;
    private AdContentRspRecord h;
    private JSONObject j;

    public String toString() {
        return "AdContentRsp{retCode='" + this.f744a + "', pkgName=" + this.e + ", adContentRspRecord=" + this.h + ", slots=" + this.d + '}';
    }

    public boolean h() {
        List<axm> list = this.d;
        if (list == null) {
            return true;
        }
        Iterator<axm> it = list.iterator();
        while (it.hasNext()) {
            if (!it.next().h()) {
                return false;
            }
        }
        return true;
    }

    public List<axm> i() {
        return this.d;
    }

    public String c() {
        return this.e;
    }

    public JSONArray a() {
        return this.f746c;
    }

    public JSONObject d() {
        if (this.j == null) {
            try {
                JSONObject jSONObjectD = d(this.h);
                this.j = jSONObjectD;
                jSONObjectD.put("retcode", this.f744a);
                this.j.put("clientAdRequestId", this.f745b);
                this.j.remove("cost");
                this.j.remove("ppsStore");
            } catch (Throwable th) {
                HiAdLog.w("AdContentRsp", "gen json fail " + th.getClass().getSimpleName());
            }
        }
        if (!ListUtil.isEmpty(this.d)) {
            JSONArray jSONArray = new JSONArray();
            Iterator<axm> it = this.d.iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next().e());
            }
            axt.e(this.j, "multiad", jSONArray);
        }
        return this.j;
    }

    public void a(int i) {
        this.f = i;
    }

    public AdContentRspRecord b() {
        return this.h;
    }

    public void e(List<axm> list) {
        this.d = list;
    }

    public void c(String str) {
        this.f745b = str;
    }

    public void b(int i) {
        this.f744a = i;
    }

    public Set<String> b(Integer num, Integer num2, ayc aycVar) {
        HashSet hashSet = new HashSet();
        List<axm> list = this.d;
        if (list != null) {
            Iterator<axm> it = list.iterator();
            while (it.hasNext()) {
                axm next = it.next();
                hashSet.addAll(next.d(num, num2, (next == null || aycVar == null) ? null : aycVar.a(next.j())));
            }
        }
        return hashSet;
    }

    public axi e() {
        try {
            axi axiVar = (axi) super.clone();
            if (this.d != null) {
                ArrayList arrayList = new ArrayList(this.d.size());
                Iterator<axm> it = this.d.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().a());
                }
                axiVar.d = arrayList;
            }
            axiVar.h = (AdContentRspRecord) this.h.copy();
            return axiVar;
        } catch (CloneNotSupportedException unused) {
            HiAdLog.e("AdContentRsp", "copy failed");
            return null;
        }
    }

    private void a(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.f744a = jSONObject.optInt("retcode", -1);
            this.f746c = jSONObject.optJSONArray("invalidcontentid");
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("multiad");
            if (jSONArrayOptJSONArray != null) {
                int length = jSONArrayOptJSONArray.length();
                this.d = new ArrayList(length);
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                    if (jSONObjectOptJSONObject != null) {
                        this.d.add(new axm(this.e, jSONObjectOptJSONObject));
                    }
                }
            }
            jSONObject.remove("multiad");
            this.h = new AdContentRspRecord(this.e, jSONObject);
        }
    }

    private static JSONObject d(AdContentRspRecord adContentRspRecord) {
        if (adContentRspRecord == null || TextUtils.isEmpty(adContentRspRecord.e())) {
            return new JSONObject();
        }
        try {
            return new JSONObject(adContentRspRecord.e());
        } catch (JSONException unused) {
            HiAdLog.w("AdContentRsp", "create valued json obj err");
            return new JSONObject();
        }
    }

    public axi(String str, JSONObject jSONObject) {
        this.e = str;
        this.j = jSONObject;
        a(jSONObject);
    }

    public axi(String str, AdContentRspRecord adContentRspRecord) {
        this.e = str;
        this.f744a = 200;
        this.h = adContentRspRecord;
    }
}
