package com.baidu.ocr.sdk.utils;

import com.baidu.ocr.sdk.exception.OCRError;
import com.baidu.ocr.sdk.model.OcrResponseResult;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class OcrResultParser implements Parser<OcrResponseResult> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.baidu.ocr.sdk.utils.Parser
    public OcrResponseResult parse(String str) throws OCRError {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("error_code") && jSONObject.getInt("error_code") != 0) {
                OCRError oCRError = new OCRError(jSONObject.optInt("error_code"), jSONObject.optString("error_msg"));
                oCRError.setLogId(jSONObject.optLong("log_id"));
                throw oCRError;
            }
            OcrResponseResult ocrResponseResult = new OcrResponseResult();
            ocrResponseResult.setLogId(jSONObject.optLong("log_id"));
            ocrResponseResult.setJsonRes(str);
            return ocrResponseResult;
        } catch (JSONException e) {
            throw new OCRError(283505, "Server illegal response " + str, e);
        }
    }
}
