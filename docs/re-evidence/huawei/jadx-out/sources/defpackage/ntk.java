package defpackage;

import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwsmartinteractmgr.data.SmartResponseWrapper;
import com.huawei.hwsmartinteractmgr.smarthttpmodel.smarthttpparser.SmartHttpBaseParser;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class ntk extends SmartHttpBaseParser<List<String>> {
    public ntk(int i) {
        super(i);
    }

    @Override // com.huawei.hwsmartinteractmgr.smarthttpmodel.smarthttpparser.SmartHttpBaseParser
    public SmartResponseWrapper<List<String>> parseDistinctResponse(SmartResponseWrapper<List<String>> smartResponseWrapper) {
        return e(smartResponseWrapper);
    }

    private SmartResponseWrapper<List<String>> e(SmartResponseWrapper<List<String>> smartResponseWrapper) {
        LogUtil.a("SMART_UserLabelParser", "enter parseUserLabel");
        try {
            List<String> listD = d(new JSONObject(this.mResolve).optJSONArray("labels"));
            LogUtil.d("SMART_UserLabelParser", "labels = ", listD);
            smartResponseWrapper.setResponse(listD);
            return smartResponseWrapper;
        } catch (JSONException e) {
            LogUtil.e("SMART_UserLabelParser", "parse json error ", e.getMessage());
            smartResponseWrapper.setResponseCode(101);
            smartResponseWrapper.setResponseDesc("parse json failed");
            return smartResponseWrapper;
        }
    }

    private List<String> d(JSONArray jSONArray) {
        if (jSONArray == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList(5);
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            arrayList.add(jSONArray.optString(i));
        }
        return arrayList;
    }
}
