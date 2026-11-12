package defpackage;

import com.xiaomi.ai.domain.mobileapp.adapter.ContextAdapter;
import org.json.JSONObject;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes7.dex */
public class tdb extends pdb {
    @Override // defpackage.pdb
    public boolean b(n08 n08Var) {
        if (q08.a(a())) {
            return true;
        }
        JSONObject jSONObjectA = n08Var.getContext().a();
        if (jSONObjectA != null) {
            String strOptString = jSONObjectA.optString("pkg_name", null);
            if (!q08.a(strOptString)) {
                if (a().equalsIgnoreCase(strOptString)) {
                    return true;
                }
                return a().equals(Marker.ANY_MARKER) && !ContextAdapter.MIUI_HOME_PACKAGE.equalsIgnoreCase(strOptString);
            }
        }
        return false;
    }
}
