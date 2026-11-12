package com.huawei.operation.h5pro.prerequest;

import com.google.gson.JsonArray;
import com.huawei.health.h5pro.load.expression.ExpressionFunction;
import com.huawei.health.h5pro.utils.LogUtil;
import com.huawei.hwcommonmodel.application.BaseApplication;
import defpackage.fxl;
import defpackage.qdh;
import health.compact.a.CommonUtil;
import health.compact.a.GRSManager;
import health.compact.a.LanguageUtil;
import health.compact.a.Utils;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class CloudFunctions {
    private static final String TAG = "H5PRO_CloudFunctions";

    @ExpressionFunction(alias = "getWeekStartDay")
    public int getWeekStartDay() {
        LogUtil.i(TAG, "getWeekStartDay");
        return Utils.o() ? 7 : 1;
    }

    @ExpressionFunction(alias = "getLanguage")
    public String getLanguage() {
        LogUtil.i(TAG, "getLanguage");
        return LanguageUtil.a();
    }

    @ExpressionFunction(alias = "getCountryCode")
    public String getCountryCode() {
        LogUtil.i(TAG, "getCountryCode");
        return GRSManager.c(BaseApplication.getContext()).getCommonCountryCode();
    }

    @ExpressionFunction(alias = "getClientType")
    public String getClientType() {
        LogUtil.i(TAG, "getClientType");
        return fxl.d();
    }

    @ExpressionFunction(alias = "getClientVersion")
    public String getClientVersion() {
        LogUtil.i(TAG, "getClientVersion");
        return CommonUtil.c(BaseApplication.getContext());
    }

    @ExpressionFunction(alias = "getAppVersion")
    public String getAppVersion() {
        LogUtil.i(TAG, "getAppVersion");
        return fxl.d(BaseApplication.getContext());
    }

    @ExpressionFunction(alias = "getHighLightDomainScopes")
    public JsonArray getHighLightDomainScopes() {
        LogUtil.i(TAG, "getHighLightDomainScopes");
        List<String> listE = qdh.e();
        JsonArray jsonArray = new JsonArray(listE.size());
        Iterator<String> it = listE.iterator();
        while (it.hasNext()) {
            jsonArray.add(it.next());
        }
        return jsonArray;
    }
}
