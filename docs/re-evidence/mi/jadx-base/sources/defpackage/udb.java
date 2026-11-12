package defpackage;

import com.xiaomi.onetrack.OneTrack;
import com.xiaomi.onetrack.util.z;
import com.xiaomi.smarthome.plugin.update.PluginPackageConstant;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes7.dex */
public class udb extends pdb {
    public static int e(String str, String str2) {
        String[] strArrSplit = str.split(z.f14007a);
        String[] strArrSplit2 = str2.split(z.f14007a);
        int iMin = Math.min(strArrSplit.length, strArrSplit2.length);
        int length = 0;
        for (int i = 0; i < iMin; i++) {
            length = strArrSplit[i].length() - strArrSplit2[i].length();
            if (length != 0 || (length = strArrSplit[i].compareTo(strArrSplit2[i])) != 0) {
                break;
            }
        }
        return length != 0 ? length : strArrSplit.length - strArrSplit2.length;
    }

    @Override // defpackage.pdb
    public boolean b(n08 n08Var) {
        if (q08.a(a())) {
            return true;
        }
        try {
            JSONObject jSONObject = new JSONObject(a());
            String string = jSONObject.getString("pkg_name");
            String strOptString = jSONObject.optString("min_version", "");
            String strOptString2 = jSONObject.optString("max_version", "");
            if (PluginPackageConstant.RN_DIR_A.equalsIgnoreCase(string)) {
                return f(strOptString, strOptString2, n08Var);
            }
            return OneTrack.Param.MIUI.equalsIgnoreCase(string) ? h(strOptString, strOptString2, n08Var) : g(strOptString, strOptString2, string, n08Var);
        } catch (JSONException e) {
            e.printStackTrace();
            return false;
        }
    }

    public final boolean d(String str, String str2, String str3) {
        if (q08.a(str2) || Marker.ANY_MARKER.equals(str2) || e(str, str2) >= 0) {
            return q08.a(str3) || Marker.ANY_MARKER.equals(str3) || e(str, str3) <= 0;
        }
        return false;
    }

    public final boolean f(String str, String str2, n08 n08Var) {
        return d(u08.d(n08Var.getUserAgent()), str, str2);
    }

    public final boolean g(String str, String str2, String str3, n08 n08Var) throws JSONException {
        String strOptString;
        JSONArray jSONArrayB = n08Var.getContext().b();
        if (jSONArrayB == null) {
            strOptString = null;
            break;
        }
        int i = 0;
        while (true) {
            if (i >= jSONArrayB.length()) {
                strOptString = null;
                break;
            }
            JSONObject jSONObject = jSONArrayB.getJSONObject(i);
            if (str3.equals(jSONObject.optString("package_name"))) {
                strOptString = jSONObject.optString("version_code", "");
                break;
            }
            i++;
        }
        if (q08.a(strOptString)) {
            return false;
        }
        return d(strOptString, str, str2);
    }

    public final boolean h(String str, String str2, n08 n08Var) {
        return d(u08.j(n08Var.getUserAgent()), str, str2);
    }
}
