package com.xiaomi.push;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;

/* JADX INFO: loaded from: classes22.dex */
public class cg implements ck {
    private String a;
    private String b;
    private String[] c;
    private String[] d;
    private String e;
    private List<cg> f;

    public cg(String str, String str2, String[] strArr, String[] strArr2) {
        this.c = null;
        this.d = null;
        this.f = null;
        this.a = str;
        this.b = str2;
        this.c = strArr;
        this.d = strArr2;
    }

    public cg(String str, String str2, String[] strArr, String[] strArr2, String str3, List<cg> list) {
        this.c = null;
        this.d = null;
        this.f = null;
        this.a = str;
        this.b = str2;
        this.c = strArr;
        this.d = strArr2;
        this.e = str3;
        this.f = list;
    }

    public static cg a(Bundle bundle) {
        ArrayList arrayList;
        String string = bundle.getString("ext_ele_name");
        String string2 = bundle.getString("ext_ns");
        String string3 = bundle.getString("ext_text");
        Bundle bundle2 = bundle.getBundle("attributes");
        Set<String> setKeySet = bundle2.keySet();
        String[] strArr = new String[setKeySet.size()];
        String[] strArr2 = new String[setKeySet.size()];
        int i = 0;
        for (String str : setKeySet) {
            strArr[i] = str;
            strArr2[i] = bundle2.getString(str);
            i++;
        }
        if (bundle.containsKey("children")) {
            Parcelable[] parcelableArray = bundle.getParcelableArray("children");
            ArrayList arrayList2 = new ArrayList(parcelableArray.length);
            for (Parcelable parcelable : parcelableArray) {
                arrayList2.add(a((Bundle) parcelable));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        return new cg(string, string2, strArr, strArr2, string3, arrayList);
    }

    public static Parcelable[] a(List<cg> list) {
        return a((cg[]) list.toArray(new cg[list.size()]));
    }

    public static Parcelable[] a(cg[] cgVarArr) {
        if (cgVarArr == null) {
            return null;
        }
        Parcelable[] parcelableArr = new Parcelable[cgVarArr.length];
        for (int i = 0; i < cgVarArr.length; i++) {
            parcelableArr[i] = cgVarArr[i].m3635a();
        }
        return parcelableArr;
    }

    public Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putString("ext_ele_name", this.a);
        bundle.putString("ext_ns", this.b);
        bundle.putString("ext_text", this.e);
        Bundle bundle2 = new Bundle();
        String[] strArr = this.c;
        if (strArr != null && strArr.length > 0) {
            int i = 0;
            while (true) {
                String[] strArr2 = this.c;
                if (i >= strArr2.length) {
                    break;
                }
                bundle2.putString(strArr2[i], this.d[i]);
                i++;
            }
        }
        bundle.putBundle("attributes", bundle2);
        List<cg> list = this.f;
        if (list != null && list.size() > 0) {
            bundle.putParcelableArray("children", a(this.f));
        }
        return bundle;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public Parcelable m3635a() {
        return a();
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public String m3636a() {
        return this.a;
    }

    public String a(String str) {
        if (str == null) {
            throw new IllegalArgumentException();
        }
        if (this.c == null) {
            return null;
        }
        int i = 0;
        while (true) {
            String[] strArr = this.c;
            if (i >= strArr.length) {
                return null;
            }
            if (str.equals(strArr[i])) {
                return this.d[i];
            }
            i++;
        }
    }

    public void a(cg cgVar) {
        if (this.f == null) {
            this.f = new ArrayList();
        }
        if (this.f.contains(cgVar)) {
            return;
        }
        this.f.add(cgVar);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public void m3637a(String str) {
        if (!TextUtils.isEmpty(str)) {
            str = cu.a(str);
        }
        this.e = str;
    }

    public String b() {
        return this.b;
    }

    public String c() {
        return !TextUtils.isEmpty(this.e) ? cu.b(this.e) : this.e;
    }

    @Override // com.xiaomi.push.ck
    public String d() {
        StringBuilder sb = new StringBuilder();
        sb.append(SearchCriteria.LT);
        sb.append(this.a);
        if (!TextUtils.isEmpty(this.b)) {
            sb.append(" ");
            sb.append("xmlns=");
            sb.append("\"");
            sb.append(this.b);
            sb.append("\"");
        }
        String[] strArr = this.c;
        if (strArr != null && strArr.length > 0) {
            for (int i = 0; i < this.c.length; i++) {
                if (!TextUtils.isEmpty(this.d[i])) {
                    sb.append(" ");
                    sb.append(this.c[i]);
                    sb.append("=\"");
                    sb.append(cu.a(this.d[i]));
                    sb.append("\"");
                }
            }
        }
        if (TextUtils.isEmpty(this.e)) {
            List<cg> list = this.f;
            if (list == null || list.size() <= 0) {
                sb.append("/>");
            } else {
                sb.append(SearchCriteria.GT);
                Iterator<cg> it2 = this.f.iterator();
                while (it2.hasNext()) {
                    sb.append(it2.next().d());
                }
            }
            return sb.toString();
        }
        sb.append(SearchCriteria.GT);
        sb.append(this.e);
        sb.append("</");
        sb.append(this.a);
        sb.append(SearchCriteria.GT);
        return sb.toString();
    }

    public String toString() {
        return d();
    }
}
