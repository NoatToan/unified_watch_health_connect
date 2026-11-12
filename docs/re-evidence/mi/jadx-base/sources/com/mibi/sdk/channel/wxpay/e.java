package com.mibi.sdk.channel.wxpay;

import com.mibi.sdk.component.Constants;
import com.mibi.sdk.component.recharge.BaseRechargeMethodParser;
import com.mibi.sdk.component.recharge.RechargeMethod;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class e extends BaseRechargeMethodParser {
    @Override // com.mibi.sdk.component.recharge.BaseRechargeMethodParser
    public RechargeMethod newRechargeMethod() {
        return new c();
    }

    @Override // com.mibi.sdk.component.recharge.BaseRechargeMethodParser, com.mibi.sdk.component.recharge.RechargeMethodParser
    public RechargeMethod parse(String str, JSONObject jSONObject) throws JSONException {
        c cVar = (c) super.parse(str, jSONObject);
        JSONObject jSONObject2 = jSONObject.getJSONObject("data");
        cVar.mMinMoneyValue = jSONObject2.getLong(Constants.KEY_RECHARGE_MINVALUE);
        cVar.mMaxMoneyValue = jSONObject2.getLong(Constants.KEY_RECHARGE_MAXVALUE);
        cVar.mWarnValue = jSONObject2.optLong(Constants.KEY_RECHARGE_WARN_VALUE);
        JSONArray jSONArray = jSONObject2.getJSONArray(Constants.KEY_RECHARGE_VALUES);
        for (int i = 0; i < jSONArray.length(); i++) {
            cVar.mMoneyValues.add(Long.valueOf(jSONArray.getLong(i)));
        }
        cVar.mMinMibiValue = cVar.mMinMoneyValue;
        cVar.mMaxMibiValue = cVar.mMaxMoneyValue;
        cVar.mWarnMibiValue = cVar.mWarnValue;
        cVar.mMibiValues = cVar.mMoneyValues;
        return cVar;
    }
}
