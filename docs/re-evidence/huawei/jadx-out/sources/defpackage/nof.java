package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.framework.network.restclient.Response;
import com.huawei.hms.framework.network.restclient.hwhttp.ResponseBody;
import com.huawei.hwidauth.g.f;
import com.huawei.secure.android.common.intent.SafeBundle;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class nof extends f<nnf> {
    public nof(nnf nnfVar, Context context, String str, f.a aVar) {
        this.f17584a = nnfVar;
        this.f17585b = context;
        this.f17586c = str;
        this.d = aVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.hwidauth.g.f
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void a(nnf nnfVar, Response<ResponseBody> response) {
        int code = response.getCode();
        nox.b("GetResourceCase", "code:" + code, true);
        if (code == 200) {
            try {
                String str = new String(response.getBody().bytes(), "UTF-8");
                nox.b("GetResourceCase", "handleRequestNet data:".concat(str), false);
                nnfVar.e(str);
                if (nnfVar.j() == 0) {
                    String strI = nnfVar.i();
                    SafeBundle safeBundle = new SafeBundle();
                    ArrayList<String> arrayList = new ArrayList<>();
                    if (!TextUtils.isEmpty(strI)) {
                        JSONObject jSONObject = new JSONObject(strI);
                        safeBundle.putString("publicKey", jSONObject.getString("public-key"));
                        JSONArray jSONArray = jSONObject.getJSONArray("domain-whitelist");
                        int length = jSONArray.length();
                        for (int i = 0; i < length; i++) {
                            arrayList.add((String) jSONArray.get(i));
                        }
                        safeBundle.putStringArrayList("domainAllowList", arrayList);
                        nox.b("GetResourceCase", "allow list" + arrayList.toString(), false);
                        nox.b("GetResourceCase", "allow-length---" + length, true);
                        a(safeBundle);
                        return;
                    }
                    nox.b("GetResourceCase", "getErrorCode ==" + nnfVar.g(), true);
                    nox.b("GetResourceCase", "getErrorDesc ==" + nnfVar.h(), false);
                    a(nnfVar.g(), nnfVar.h());
                    return;
                }
                a(6, "Request Error:casLoginJson is empty.");
                return;
            } catch (Exception e) {
                nox.b("GetResourceCase", "Exception:" + e.getClass().getSimpleName(), true);
                a(2015, "Request Error:" + e.getClass().getSimpleName());
                return;
            }
        }
        a(2005, "Request Error:code is " + code);
    }
}
