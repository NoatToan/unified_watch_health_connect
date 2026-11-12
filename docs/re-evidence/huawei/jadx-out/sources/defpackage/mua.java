package defpackage;

import com.huawei.hwdevice.phoneprocess.mgr.hwcontactsyncmgr.contacts.sync.utils.Bean;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class mua {
    public static JSONArray b() {
        List<String> listC = msm.c(msm.b(true, 0L), true);
        if (listC.isEmpty()) {
            LogUtil.j("ProfileContactUtils", "queryProfile: raw contact id list is empty");
            return new JSONArray();
        }
        return b(listC);
    }

    private static JSONArray b(List<String> list) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(16);
        JSONArray jSONArray = new JSONArray();
        if (list != null && list.size() != 0) {
            String[] strArr = (String[]) list.toArray(new String[0]);
            msm.e(strArr, (Map<String, mtc>) concurrentHashMap, true);
            List<Bean> listC = msm.c(concurrentHashMap, strArr);
            try {
                JSONArray jSONArray2 = new JSONArray();
                try {
                    for (Bean bean : listC) {
                        if (bean instanceof mtc) {
                            JSONObject jSONObject = new JSONObject();
                            String strE = mte.e((mtc) bean);
                            if (mtj.d().equals(((mtc) bean).d())) {
                                jSONObject.put("hicall", strE);
                            } else {
                                jSONObject.put("local", strE);
                            }
                            jSONArray2.put(jSONObject);
                        }
                    }
                    return jSONArray2;
                } catch (JSONException unused) {
                    jSONArray = jSONArray2;
                    LogUtil.e("ProfileContactUtils", "queryAndUpdateProfile: occurred JSONException.");
                    return jSONArray;
                }
            } catch (JSONException unused2) {
            }
        }
        return jSONArray;
    }
}
