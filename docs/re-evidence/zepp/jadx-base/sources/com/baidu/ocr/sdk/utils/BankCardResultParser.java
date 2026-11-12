package com.baidu.ocr.sdk.utils;

import com.baidu.ocr.sdk.exception.OCRError;
import com.baidu.ocr.sdk.model.BankCardResult;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class BankCardResultParser implements Parser<BankCardResult> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.baidu.ocr.sdk.utils.Parser
    public BankCardResult parse(String str) throws OCRError {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("error_code")) {
                OCRError oCRError = new OCRError(jSONObject.optInt("error_code"), jSONObject.optString("error_msg"));
                oCRError.setLogId(jSONObject.optLong("log_id"));
                throw oCRError;
            }
            BankCardResult bankCardResult = new BankCardResult();
            bankCardResult.setLogId(jSONObject.optLong("log_id"));
            bankCardResult.setJsonRes(str);
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("result");
            if (jSONObjectOptJSONObject != null) {
                bankCardResult.setBankCardNumber(jSONObjectOptJSONObject.optString("bank_card_number"));
                bankCardResult.setBankCardType(jSONObjectOptJSONObject.optInt("bank_card_type"));
                bankCardResult.setBankName(jSONObjectOptJSONObject.optString("bank_name"));
            }
            return bankCardResult;
        } catch (JSONException e) {
            throw new OCRError(283505, "Server illegal response " + str, e);
        }
    }
}
