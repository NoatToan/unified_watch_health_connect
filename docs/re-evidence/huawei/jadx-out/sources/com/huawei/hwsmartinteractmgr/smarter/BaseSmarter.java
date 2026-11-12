package com.huawei.hwsmartinteractmgr.smarter;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwsmartinteractmgr.data.ContentMeasure;
import com.huawei.hwsmartinteractmgr.data.SmartMsgConstant;
import com.huawei.hwsmartinteractmgr.data.SmartMsgDbObject;
import defpackage.ntl;
import health.compact.a.SharedPreferenceManager;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class BaseSmarter {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f17713c;

    public void b() {
    }

    public BaseSmarter(Context context) {
        this.f17713c = context;
    }

    public boolean a(String str, int i, String str2) {
        String strE = SharedPreferenceManager.e(this.f17713c, Integer.toString(10021), str);
        boolean zA = ntl.a(i, str2);
        LogUtil.a("SMART_BaseSmarter", "userType = ", str, ", isNoLongerRecommend = ", strE, ", isEnable = ", Boolean.valueOf(zA));
        return !"1".equals(strE) || zA;
    }

    protected static void a(SmartMsgDbObject smartMsgDbObject, String str, int i, String str2) {
        if (smartMsgDbObject == null) {
            return;
        }
        smartMsgDbObject.setMsgContentType(2);
        smartMsgDbObject.setMsgContent(HiJsonUtil.e(new ContentMeasure(i), ContentMeasure.class));
        smartMsgDbObject.setShowMethod(str2);
        if (!TextUtils.isEmpty(str)) {
            smartMsgDbObject.setShowTime(str);
        } else {
            smartMsgDbObject.setShowTime(SmartMsgConstant.DEFAULT_SHOW_TIME);
        }
        smartMsgDbObject.setStatus(1);
    }

    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        StringBuilder sb = new StringBuilder(10);
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                String string = jSONObject.getString("start_time");
                String string2 = jSONObject.getString("end_time");
                sb.append(string);
                sb.append(string2);
            }
        } catch (JSONException e) {
            LogUtil.e("SMART_BaseSmarter", "getShowTime JSONException = ", e.getMessage());
        }
        return sb.toString();
    }
}
