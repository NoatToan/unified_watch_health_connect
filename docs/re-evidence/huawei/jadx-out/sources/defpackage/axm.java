package defpackage;

import android.text.TextUtils;
import com.huawei.ads.adsrec.db.table.SlotRecord;
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
public class axm implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private SlotRecord f753b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f754c;
    private String d;
    private List<axh> e;
    private String h;
    private JSONObject i;

    public String toString() {
        return "AdSlot{slotId='" + this.d + "', pkgName=" + this.f754c + ", retcode30=" + this.f752a + ", contents=" + this.e + '}';
    }

    public boolean h() {
        List<axh> list = this.e;
        return list == null || list.isEmpty();
    }

    public SlotRecord i() {
        return this.f753b;
    }

    public String j() {
        return this.d;
    }

    public String d() {
        return this.f754c;
    }

    public List<axh> b() {
        return this.e;
    }

    public String c() {
        JSONObject jSONObjectD;
        if (this.h == null && (jSONObjectD = axt.d(this.f753b.a())) != null) {
            this.h = jSONObjectD.optString("adtype");
        }
        return this.h;
    }

    public JSONObject e() {
        if (this.i == null) {
            JSONObject jSONObjectC = c(this.f753b);
            this.i = jSONObjectC;
            axt.c(jSONObjectC, "retcode30", this.f752a);
        }
        if (!ListUtil.isEmpty(this.e)) {
            JSONArray jSONArray = new JSONArray();
            Iterator<axh> it = this.e.iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next().m());
            }
            axt.e(this.i, "content", jSONArray);
        }
        return this.i;
    }

    public void b(List<axh> list) {
        this.e = list;
    }

    public void c(axm axmVar) {
        this.d = axmVar.d;
        this.f753b = axmVar.f753b;
        this.e = axmVar.e;
        this.i = axmVar.i;
        this.f752a = axmVar.f752a;
    }

    public void a(int i) {
        this.f752a = i;
    }

    public Set<String> d(Integer num, Integer num2, Integer num3) {
        if (this.e == null) {
            return new HashSet();
        }
        if (axq.e(num3) && axq.e(num) && axq.e(num2)) {
            return g();
        }
        if (axq.e(num3)) {
            return !axq.e(num) ? e(num.intValue()) : c(num2.intValue());
        }
        return e(num3.intValue());
    }

    public axm a() {
        try {
            axm axmVar = (axm) super.clone();
            if (this.e != null) {
                ArrayList arrayList = new ArrayList(this.e.size());
                Iterator<axh> it = this.e.iterator();
                while (it.hasNext()) {
                    axh axhVarA = it.next().a();
                    if (axhVarA != null) {
                        arrayList.add(axhVarA);
                    }
                }
                axmVar.e = arrayList;
            }
            SlotRecord slotRecord = this.f753b;
            if (slotRecord != null) {
                axmVar.f753b = (SlotRecord) slotRecord.copy();
            }
            return axmVar;
        } catch (CloneNotSupportedException unused) {
            HiAdLog.w("AdSlot", "copy failed");
            return null;
        }
    }

    private Set<String> g() {
        return new HashSet();
    }

    private Set<String> e(int i) {
        ArrayList arrayList = new ArrayList(i);
        HashSet hashSet = new HashSet();
        int i2 = 0;
        for (axh axhVar : this.e) {
            if (axhVar != null) {
                axhVar.i();
                axhVar.r();
                if (i2 < i) {
                    arrayList.add(axhVar);
                    i2++;
                } else {
                    hashSet.add(axhVar.i());
                }
            }
        }
        this.e = arrayList;
        return hashSet;
    }

    private Set<String> c(int i) {
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        int i2 = 0;
        for (axh axhVar : this.e) {
            if (axhVar != null) {
                axhVar.i();
                axhVar.r();
                if (axhVar.r() == 0) {
                    arrayList.add(axhVar);
                } else if (i2 < i) {
                    arrayList.add(axhVar);
                    i2++;
                } else {
                    hashSet.add(axhVar.i());
                }
            }
        }
        this.e = arrayList;
        return hashSet;
    }

    private void a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        this.h = jSONObject.optString("adtype");
        this.d = jSONObject.optString("slotid");
        this.f752a = jSONObject.optInt("retcode30");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("content");
        if (jSONArrayOptJSONArray != null) {
            int length = jSONArrayOptJSONArray.length();
            this.e = new ArrayList(length);
            for (int i = 0; i < length; i++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject != null) {
                    this.e.add(new axh(this.f754c, this.h, this.d, jSONObjectOptJSONObject));
                }
            }
        }
        jSONObject.remove("content");
        this.f753b = new SlotRecord(this.f754c, jSONObject);
    }

    private JSONObject c(SlotRecord slotRecord) {
        if (slotRecord == null || TextUtils.isEmpty(slotRecord.a())) {
            return new JSONObject();
        }
        try {
            return new JSONObject(slotRecord.a());
        } catch (JSONException unused) {
            HiAdLog.w("AdSlot", "create valued json obj err");
            return new JSONObject();
        }
    }

    public axm(String str, JSONObject jSONObject) {
        this.f754c = str;
        this.i = jSONObject;
        a(jSONObject);
    }

    public axm(String str, String str2) {
        this.f754c = str;
        this.d = str2;
    }

    public axm(SlotRecord slotRecord) {
        if (slotRecord != null) {
            this.d = slotRecord.d();
            this.f754c = slotRecord.c();
        }
        this.f753b = slotRecord;
    }
}
