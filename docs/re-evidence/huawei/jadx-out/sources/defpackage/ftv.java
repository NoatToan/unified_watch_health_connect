package defpackage;

import android.text.TextUtils;
import com.huawei.health.knit.data.KnitDataProvider;
import com.huawei.health.marketing.datatype.ResourceBriefInfo;
import com.huawei.health.marketing.datatype.ResourceContentBase;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.ReflectionUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class ftv {
    private static JSONObject a(ResourceBriefInfo resourceBriefInfo) {
        ResourceContentBase content;
        JSONObject jSONObject = null;
        if (resourceBriefInfo != null && (content = resourceBriefInfo.getContent()) != null) {
            String content2 = content.getContent();
            if (!TextUtils.isEmpty(content2)) {
                try {
                    jSONObject = new JSONObject(content2);
                } catch (JSONException e) {
                    LogUtil.e("SectionBeanUtils", "exception happened when parseOnlineData, cause = " + e.getCause());
                }
                if (jSONObject == null) {
                    LogUtil.e("SectionBeanUtils", "onlineDataJson is null!");
                }
                return jSONObject;
            }
        }
        return null;
    }

    public static List<String> b(ResourceBriefInfo resourceBriefInfo) {
        ArrayList arrayList = new ArrayList();
        JSONObject jSONObjectA = a(resourceBriefInfo);
        if (jSONObjectA == null) {
            return arrayList;
        }
        String strOptString = jSONObjectA.optString("picture");
        String strOptString2 = jSONObjectA.optString("tahitiPicture");
        arrayList.add(strOptString);
        arrayList.add(strOptString2);
        return arrayList;
    }

    public static KnitDataProvider d(ResourceBriefInfo resourceBriefInfo) {
        JSONObject jSONObjectA = a(resourceBriefInfo);
        if (jSONObjectA == null) {
            return null;
        }
        String strD = fom.d(jSONObjectA.optString("dataUrl"));
        if (!TextUtils.isEmpty(strD)) {
            Object objA = ReflectionUtils.a(strD);
            if (objA instanceof KnitDataProvider) {
                return (KnitDataProvider) objA;
            }
        }
        return null;
    }
}
