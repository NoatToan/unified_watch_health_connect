package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public class vxs implements hys {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f37348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f37349b;
    public String[] c;
    public String[] d;
    public String e;
    public List<vxs> f;

    public vxs(String str, String str2, String[] strArr, String[] strArr2) {
        this.f = null;
        this.f37348a = str;
        this.f37349b = str2;
        this.c = strArr;
        this.d = strArr2;
    }

    public static vxs c(Bundle bundle) {
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
                arrayList2.add(c((Bundle) parcelable));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        return new vxs(string, string2, strArr, strArr2, string3, arrayList);
    }

    public static Parcelable[] h(List<vxs> list) {
        return i((vxs[]) list.toArray(new vxs[list.size()]));
    }

    public static Parcelable[] i(vxs[] vxsVarArr) {
        if (vxsVarArr == null) {
            return null;
        }
        Parcelable[] parcelableArr = new Parcelable[vxsVarArr.length];
        for (int i = 0; i < vxsVarArr.length; i++) {
            parcelableArr[i] = vxsVarArr[i].b();
        }
        return parcelableArr;
    }

    public Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putString("ext_ele_name", this.f37348a);
        bundle.putString("ext_ns", this.f37349b);
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
        List<vxs> list = this.f;
        if (list != null && list.size() > 0) {
            bundle.putParcelableArray("children", h(this.f));
        }
        return bundle;
    }

    public Parcelable b() {
        return a();
    }

    @Override // defpackage.hys
    public String d() {
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        sb.append(this.f37348a);
        if (!TextUtils.isEmpty(this.f37349b)) {
            sb.append(" ");
            sb.append("xmlns=");
            sb.append("\"");
            sb.append(this.f37349b);
            sb.append("\"");
        }
        String[] strArr = this.c;
        if (strArr != null && strArr.length > 0) {
            for (int i = 0; i < this.c.length; i++) {
                if (!TextUtils.isEmpty(this.d[i])) {
                    sb.append(" ");
                    sb.append(this.c[i]);
                    sb.append("=\"");
                    sb.append(uys.b(this.d[i]));
                    sb.append("\"");
                }
            }
        }
        if (TextUtils.isEmpty(this.e)) {
            List<vxs> list = this.f;
            if (list == null || list.size() <= 0) {
                sb.append("/>");
            } else {
                sb.append(">");
                Iterator<vxs> it = this.f.iterator();
                while (it.hasNext()) {
                    sb.append(it.next().d());
                }
                sb.append("</");
                sb.append(this.f37348a);
                sb.append(">");
            }
        } else {
            sb.append(">");
            sb.append(this.e);
            sb.append("</");
            sb.append(this.f37348a);
            sb.append(">");
        }
        return sb.toString();
    }

    public String e() {
        return this.f37348a;
    }

    public String f(String str) {
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

    public void g(String str) {
        if (TextUtils.isEmpty(str)) {
            this.e = str;
        } else {
            this.e = uys.b(str);
        }
    }

    public String j() {
        return this.f37349b;
    }

    public String k() {
        return !TextUtils.isEmpty(this.e) ? uys.e(this.e) : this.e;
    }

    public String toString() {
        return d();
    }

    public vxs(String str, String str2, String[] strArr, String[] strArr2, String str3, List<vxs> list) {
        this.f37348a = str;
        this.f37349b = str2;
        this.c = strArr;
        this.d = strArr2;
        this.e = str3;
        this.f = list;
    }
}
