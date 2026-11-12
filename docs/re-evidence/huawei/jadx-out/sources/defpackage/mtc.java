package defpackage;

import android.text.TextUtils;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.hwdevice.phoneprocess.mgr.hwcontactsyncmgr.contacts.sync.utils.Bean;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class mtc implements Bean {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f42389a;
    private String aa;
    private String ab;
    private String ac;
    private String ad;
    private String ag;
    private String ai;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f42391c;
    private String e;
    private String k;
    private String q;
    private String r;
    private String s;
    private byte[] u;
    private String y;
    private HashMap<String, String> z = new HashMap<>();
    private HashMap<Integer, List<String>> x = new HashMap<>(16);
    private HashMap<String, List<String>> g = new HashMap<>(16);
    private HashMap<Integer, List<String>> m = new HashMap<>(16);
    private HashMap<String, List<String>> i = new HashMap<>(16);
    private HashMap<String, String> w = new HashMap<>(16);
    private HashMap<Integer, List<String[]>> d = new HashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HashMap<String, List<String[]>> f42390b = new HashMap<>(16);
    private HashMap<Integer, List<String>> ah = new HashMap<>(16);
    private HashMap<Integer, List<String>> t = new HashMap<>(16);
    private HashMap<String, List<String>> h = new HashMap<>(16);
    private HashMap<Integer, List<String>> n = new HashMap<>(16);
    private HashMap<String, List<String>> j = new HashMap<>(16);
    private Map<String, HashMap<Integer, List<String>>> p = new HashMap(6);
    private Map<String, HashMap<String, List<String>>> f = new HashMap(6);
    private HashMap<Integer, List<String>> v = new HashMap<>(16);
    private HashMap<String, List<String>> l = new HashMap<>(16);
    private ArrayList<mtu> o = new ArrayList<>(10);

    public mtc() {
        l();
    }

    @Override // com.huawei.hwdevice.phoneprocess.mgr.hwcontactsyncmgr.contacts.sync.utils.Bean
    public String getId() {
        return this.k;
    }

    @Override // com.huawei.hwdevice.phoneprocess.mgr.hwcontactsyncmgr.contacts.sync.utils.Bean
    public void setId(String str) {
        if (mtz.b(str)) {
            return;
        }
        this.k = str;
    }

    @Override // com.huawei.hwdevice.phoneprocess.mgr.hwcontactsyncmgr.contacts.sync.utils.Bean
    public String getUid() {
        return this.ai;
    }

    @Override // com.huawei.hwdevice.phoneprocess.mgr.hwcontactsyncmgr.contacts.sync.utils.Bean
    public void setUid(String str) {
        if (mtz.b(str)) {
            return;
        }
        this.ai = str;
    }

    public void c(String str, int i, String str2) {
        HashMap<Integer, List<String>> mapK = k(str);
        if (mapK == null) {
            LogUtil.j("ContactSync", 1, "RawContactBean", "setKindByType: kind map is null or empty.");
        } else {
            c(mapK, i, str2);
        }
    }

    public List<String> e(String str, int i) {
        HashMap<Integer, List<String>> mapK = k(str);
        if (mapK == null || mapK.isEmpty()) {
            return new ArrayList(0);
        }
        return c(mapK, i);
    }

    public void a(String str, String str2, String str3) {
        HashMap<String, List<String>> mapM = m(str);
        if (mapM == null) {
            LogUtil.j("ContactSync", 1, "RawContactBean", "setCustomEntry: unknown type");
        } else {
            c(mapM, str2, str3);
        }
    }

    public HashMap<String, List<String>> a(String str) {
        HashMap<String, List<String>> mapM = m(str);
        return (mapM == null || mapM.isEmpty()) ? new HashMap<>(0) : mapM;
    }

    public String g() {
        return this.q;
    }

    public void g(String str) {
        if (mtz.b(str)) {
            return;
        }
        this.q = str;
    }

    public String j() {
        return this.r;
    }

    public void i(String str) {
        if (mtz.b(str)) {
            return;
        }
        this.r = str;
    }

    public byte[] i() {
        byte[] bArr = this.u;
        if (bArr == null || bArr.length == 0) {
            LogUtil.j("ContactSync", 1, "RawContactBean", "getPhoto: photo bytes is null or empty.");
            return new byte[0];
        }
        return Arrays.copyOf(bArr, bArr.length);
    }

    public void a(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            LogUtil.j("ContactSync", 1, "RawContactBean", "setPhoto: photo bytes is null or empty.");
        } else {
            this.u = Arrays.copyOf(bArr, bArr.length);
        }
    }

    public String b() {
        return this.f42389a;
    }

    public String f() {
        return this.y;
    }

    public void h(String str) {
        if (mtz.b(str)) {
            return;
        }
        this.y = str;
    }

    public String o() {
        return this.aa;
    }

    public void n(String str) {
        if (mtz.b(str)) {
            return;
        }
        this.aa = str;
    }

    public String m() {
        return this.ac;
    }

    public void o(String str) {
        if (mtz.b(str)) {
            return;
        }
        this.ac = str;
    }

    public String k() {
        return this.ab;
    }

    public void l(String str) {
        if (mtz.b(str)) {
            return;
        }
        this.ab = str;
    }

    public String h() {
        return this.s;
    }

    public void j(String str) {
        if (mtz.b(str)) {
            return;
        }
        this.s = str;
    }

    public void a(mtu mtuVar) {
        if (mtuVar != null) {
            this.o.add(mtuVar);
        }
    }

    public String e() {
        try {
            JSONObject jSONObject = new JSONObject();
            ArrayList<mtu> arrayList = this.o;
            if (arrayList != null) {
                mtw.d(jSONObject, arrayList);
            }
            return jSONObject.toString();
        } catch (JSONException e) {
            LogUtil.e("ContactSync", 1, "RawContactBean", "[getHiCallDeviceField] JSONException:", ExceptionUtils.c(e));
            return "";
        }
    }

    public List<String[]> d(int i) {
        return d(this.d, i);
    }

    public HashMap<String, List<String[]>> c() {
        return this.f42390b;
    }

    public String e(String str) {
        return b(this.w, str);
    }

    public String d(String str) {
        return b(this.z, str);
    }

    public void e(String str, String str2) {
        d(this.w, str, str2);
    }

    public void d(String str, String str2) {
        d(this.z, str, str2);
    }

    @Override // com.huawei.hwdevice.phoneprocess.mgr.hwcontactsyncmgr.contacts.sync.utils.Bean
    public String getVersion() {
        return this.ag;
    }

    @Override // com.huawei.hwdevice.phoneprocess.mgr.hwcontactsyncmgr.contacts.sync.utils.Bean
    public void setVersion(String str) {
        if (mtz.b(str)) {
            return;
        }
        this.ag = str;
    }

    public String d() {
        return this.f42391c;
    }

    public void c(String str) {
        if (mtz.b(str)) {
            return;
        }
        this.f42391c = str;
    }

    public void b(String str) {
        if (mtz.b(str)) {
            return;
        }
        this.e = str;
    }

    public void f(String str) {
        if (mtz.b(str)) {
            return;
        }
        this.ad = str;
    }

    public String a() {
        return this.e;
    }

    public String n() {
        return this.ad;
    }

    public void e(int i, String[] strArr) {
        b(this.d, i, strArr);
    }

    public void d(String str, String[] strArr) {
        a(this.f42390b, str, strArr);
    }

    private void c(HashMap<String, List<String>> map, String str, String str2) {
        b(map, str, str2);
    }

    private String b(HashMap<String, String> map, String str) {
        return a(map, str);
    }

    private void d(HashMap<String, String> map, String str, String str2) {
        if (map == null || mtz.b(str2)) {
            return;
        }
        map.put(str, str2);
    }

    private List<String[]> d(HashMap<Integer, List<String[]>> map, int i) {
        return d((HashMap<Integer, List<V>>) map, Integer.valueOf(i));
    }

    private void b(HashMap<Integer, List<String[]>> map, int i, String[] strArr) {
        b(map, Integer.valueOf(i), strArr);
    }

    private void c(HashMap<Integer, List<String>> map, int i, String str) {
        b(map, Integer.valueOf(i), str);
    }

    private List<String> c(HashMap<Integer, List<String>> map, int i) {
        return d((HashMap<Integer, List<V>>) map, Integer.valueOf(i));
    }

    private void a(HashMap<String, List<String[]>> map, String str, String[] strArr) {
        b(map, str, strArr);
    }

    private <K, V> void b(HashMap<K, List<V>> map, K k, V v) {
        if (map == null) {
            LogUtil.j("ContactSync", 1, "RawContactBean", "setKindFields hashMap is null.");
            return;
        }
        List<V> arrayList = map.get(k);
        if (arrayList == null) {
            arrayList = new ArrayList<>(0);
        }
        if (v != null) {
            if ((v instanceof String) && TextUtils.isEmpty((CharSequence) v)) {
                return;
            }
            arrayList.add(v);
            map.put(k, arrayList);
        }
    }

    private <K, V> List<V> d(HashMap<K, List<V>> map, K k) {
        if (map == null || !map.containsKey(k)) {
            return new ArrayList(0);
        }
        return map.get(k);
    }

    private <K> String a(HashMap<K, String> map, K k) {
        if (map == null || !map.containsKey(k)) {
            return "";
        }
        return map.get(k);
    }

    private void l() {
        this.p.put("vnd.android.cursor.item/phone_v2", this.x);
        this.p.put("vnd.android.cursor.item/email_v2", this.m);
        this.p.put("vnd.android.cursor.item/website", this.ah);
        this.p.put("vnd.android.cursor.item/im", this.t);
        this.p.put("vnd.android.cursor.item/contact_event", this.n);
        this.p.put("vnd.android.cursor.item/relation", this.v);
        this.f.put("vnd.android.cursor.item/phone_v2", this.g);
        this.f.put("vnd.android.cursor.item/email_v2", this.i);
        this.f.put("vnd.android.cursor.item/im", this.h);
        this.f.put("vnd.android.cursor.item/contact_event", this.j);
        this.f.put("vnd.android.cursor.item/relation", this.l);
    }

    private HashMap<Integer, List<String>> k(String str) {
        return this.p.get(str);
    }

    private HashMap<String, List<String>> m(String str) {
        return this.f.get(str);
    }

    public String toString() {
        return "RawContactBean{mId='" + this.k + "', mUid='" + this.ai + "', mVersion='" + this.ag + "', mStructuredName=" + this.z + ", mNickName='" + this.q + "', mPhone=" + this.x + ", mCustomPhone=" + this.g + ", mEmail=" + this.m + ", mCustomEmail=" + this.i + ", mOrganization=" + this.w + ", mAddress=" + this.d + ", mCustomAddress=" + this.f42390b + ", mNotes='" + this.r + "', mWebSite=" + this.ah + ", mIm=" + this.t + ", mCustomIm=" + this.h + ", mEvent=" + this.n + ", mCustomEvent=" + this.j + ", mPhoto=" + Arrays.toString(this.u) + ", mCardHash='" + this.f42389a + "', mPhotoFileName='" + this.y + "', mRelation=" + this.v + ", mCustomRelation=" + this.l + ", mTimesContacted='" + this.aa + "', mStarredOrder='" + this.ac + "', mStarred='" + this.ab + "', mIsPrivate='" + this.s + "', mAccountType='" + this.f42391c + "', mAccountName='" + this.e + "', mHiCallDeviceModelList=" + this.o + '}';
    }
}
