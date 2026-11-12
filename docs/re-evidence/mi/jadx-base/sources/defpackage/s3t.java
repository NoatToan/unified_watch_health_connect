package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.amap.api.col.p0003sl.ik;
import com.mipay.sdk.account.BuildConfig;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class s3t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public o0t f33258a;

    public s3t(String str) {
        this.f33258a = null;
        try {
            this.f33258a = new o0t.a(str, "1.0", BuildConfig.VERSION_NAME).c(new String[]{"info"}).d();
        } catch (ik unused) {
        }
    }

    public static o0t a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            String strOptString = jSONObject.optString(PluginDeviceInfo.FMODEL);
            String strOptString2 = jSONObject.optString(PluginDeviceInfo.FDESC);
            String strOptString3 = jSONObject.optString(PluginDeviceInfo.FICONON);
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(PluginDeviceInfo.FICONOFF);
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                arrayList.add(jSONArrayOptJSONArray.getString(i));
            }
            return new o0t.a(strOptString, strOptString2, strOptString).a(strOptString3).c((String[]) arrayList.toArray(new String[0])).d();
        } catch (Throwable unused) {
            return null;
        }
    }

    public final List<o0t> b(Context context) {
        o0t o0tVarA;
        try {
            JSONArray jSONArray = new JSONArray(l3t.a(context, this.f33258a, "rbck"));
            if (jSONArray.length() == 0) {
                return new ArrayList();
            }
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    o0tVarA = a(jSONArray.getJSONObject(i));
                } catch (JSONException unused) {
                    o0tVarA = null;
                }
                if (o0tVarA != null) {
                    arrayList.add(o0tVarA);
                }
            }
            return arrayList;
        } catch (JSONException unused2) {
            return new ArrayList();
        }
    }

    public final void c(Context context, o0t o0tVar) {
        JSONArray jSONArray;
        if (o0tVar == null) {
            return;
        }
        ArrayList<o0t> arrayList = new ArrayList();
        arrayList.add(o0tVar);
        if (arrayList.size() == 0) {
            jSONArray = new JSONArray();
        } else {
            jSONArray = new JSONArray();
            for (o0t o0tVar2 : arrayList) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put(PluginDeviceInfo.FMODEL, o0tVar2.a());
                    jSONObject.put(PluginDeviceInfo.FDESC, o0tVar2.e());
                    jSONObject.put(PluginDeviceInfo.FICONON, o0tVar2.f());
                    JSONArray jSONArray2 = new JSONArray();
                    for (int i = 0; o0tVar2.i() != null && i < o0tVar2.i().length; i++) {
                        jSONArray2.put(o0tVar2.i()[i]);
                    }
                    jSONObject.put(PluginDeviceInfo.FICONOFF, jSONArray2);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                jSONArray.put(jSONObject);
            }
        }
        String string = jSONArray.toString();
        if (TextUtils.isEmpty(string)) {
            return;
        }
        l3t.b(context, this.f33258a, "rbck", string);
    }
}
