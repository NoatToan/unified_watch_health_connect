package defpackage;

import android.text.TextUtils;
import com.huawei.haf.common.utils.AbiUtil;
import com.huawei.hms.network.embedded.g4;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes22.dex */
public class baj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f888a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<String> f889b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f890c;
    private boolean d;
    private int e;
    private String f;
    private int g;
    private String h;
    private a i;
    private final String j;
    private int k;
    private long l;
    private List<String> m;
    private String n;
    private long o;

    private baj(String str, String str2) {
        this.j = str;
        this.f890c = str2;
    }

    public String f() {
        return this.j;
    }

    public String j() {
        return this.n;
    }

    public String i() {
        return this.f;
    }

    public String h() {
        return this.h;
    }

    public long g() {
        return this.o;
    }

    public long l() {
        return this.l;
    }

    public int e() {
        return this.k;
    }

    public boolean n() {
        return this.f888a;
    }

    public boolean p() {
        return this.d;
    }

    public a b() {
        return this.i;
    }

    public List<String> d() {
        return this.f889b;
    }

    public boolean m() {
        return this.e > 0;
    }

    public boolean o() {
        a aVar = this.i;
        return (aVar == null || aVar.c().isEmpty()) ? false : true;
    }

    public List<String> k() {
        return this.m;
    }

    public int c() {
        return this.g;
    }

    boolean r() {
        return (TextUtils.isEmpty(this.j) || TextUtils.isEmpty(this.n) || TextUtils.isEmpty(this.f) || this.o <= 0) ? false : true;
    }

    public String a() {
        return this.f890c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(256);
        sb.append("{");
        sb.append(this.j);
        sb.append('_');
        sb.append(this.h);
        sb.append(", builtIn:");
        sb.append(this.f888a);
        sb.append(", isolated:");
        sb.append(this.d);
        sb.append(", size:");
        sb.append(this.o);
        if (!this.f888a) {
            sb.append(", zip(");
            sb.append(this.k);
            sb.append(", ");
            sb.append(this.l);
            sb.append(g4.l);
        }
        if (!this.f889b.isEmpty()) {
            sb.append(", dependencies:");
            sb.append(this.f889b);
        }
        if (!this.m.isEmpty()) {
            sb.append(", workProcesses:");
            sb.append(this.m);
        }
        a aVar = this.i;
        if (aVar != null) {
            aVar.d(sb);
        }
        sb.append('}');
        return sb.toString();
    }

    public static class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List<C0012a> f891b;
        private final String d;

        private a(String str, List<C0012a> list) {
            this.d = str;
            this.f891b = list;
        }

        public String a() {
            return this.d;
        }

        public List<C0012a> c() {
            return this.f891b;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public StringBuilder d(StringBuilder sb) {
            sb.append(", lib(");
            sb.append(this.d);
            sb.append(", ");
            sb.append(this.f891b.size());
            sb.append(g4.l);
            return sb;
        }

        /* JADX INFO: renamed from: baj$a$a, reason: collision with other inner class name */
        public static class C0012a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final String f892b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final long f893c;
            private final String d;

            private C0012a(String str, String str2, long j) {
                this.f892b = str;
                this.d = str2;
                this.f893c = j;
            }

            public String c() {
                return this.f892b;
            }

            public String b() {
                return this.d;
            }

            public long d() {
                return this.f893c;
            }
        }
    }

    static baj b(String str, String str2, List<String> list, JSONObject jSONObject) {
        baj bajVar = new baj(str2, str);
        bajVar.f888a = jSONObject.optBoolean("builtIn");
        bajVar.d = jSONObject.optBoolean("isolated");
        bajVar.h = jSONObject.optString("version");
        bajVar.n = jSONObject.optString("url");
        bajVar.f = jSONObject.optString("sha256");
        bajVar.l = jSONObject.optLong("zipSize");
        bajVar.k = jSONObject.optInt("zipFileNum");
        bajVar.o = jSONObject.optLong("size");
        bajVar.g = jSONObject.optInt("minSdkVersion");
        bajVar.e = jSONObject.optInt("dexNumber");
        bajVar.m = d(jSONObject);
        bajVar.f889b = a(jSONObject);
        bajVar.i = e(jSONObject).get(AbiUtil.e(list));
        return bajVar;
    }

    private static List<String> d(JSONObject jSONObject) {
        List<String> list = Collections.EMPTY_LIST;
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("workProcesses");
        if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0) {
            return list;
        }
        ArrayList arrayList = new ArrayList(jSONArrayOptJSONArray.length());
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            String strOptString = jSONArrayOptJSONArray.optString(i);
            if (strOptString != null) {
                arrayList.add(strOptString);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    private static List<String> a(JSONObject jSONObject) {
        List<String> list = Collections.EMPTY_LIST;
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("dependencies");
        if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0) {
            return list;
        }
        ArrayList arrayList = new ArrayList(jSONArrayOptJSONArray.length());
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            String strOptString = jSONArrayOptJSONArray.optString(i);
            if (!TextUtils.isEmpty(strOptString)) {
                arrayList.add(strOptString);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    private static Map<String, a> e(JSONObject jSONObject) {
        Map<String, a> map = Collections.EMPTY_MAP;
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("nativeLibraries");
        if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
            map = new HashMap<>(jSONArrayOptJSONArray.length());
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject != null) {
                    String strOptString = jSONObjectOptJSONObject.optString("abi");
                    if (!TextUtils.isEmpty(strOptString)) {
                        map.put(strOptString, e(strOptString, jSONObjectOptJSONObject));
                    }
                }
            }
        }
        return map;
    }

    private static a e(String str, JSONObject jSONObject) {
        List listUnmodifiableList = Collections.EMPTY_LIST;
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("jniLibs");
        if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
            ArrayList arrayList = new ArrayList(jSONArrayOptJSONArray.length());
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                String strOptString = jSONObjectOptJSONObject.optString("name");
                String strOptString2 = jSONObjectOptJSONObject.optString("sha256");
                long jOptLong = jSONObjectOptJSONObject.optLong("size");
                if (!TextUtils.isEmpty(strOptString) && !TextUtils.isEmpty(strOptString2) && jOptLong != 0 && (strOptString.startsWith("lib") || strOptString.endsWith(".so"))) {
                    arrayList.add(new a.C0012a(strOptString, strOptString2, jOptLong));
                }
            }
            listUnmodifiableList = Collections.unmodifiableList(arrayList);
        }
        return new a(str, listUnmodifiableList);
    }
}
