package com.baidu.ocr.sdk.utils;

import com.baidu.ocr.sdk.exception.OCRError;
import com.baidu.ocr.sdk.model.GeneralResult;
import com.baidu.ocr.sdk.model.WordSimple;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class GeneralSimpleResultParser implements Parser<GeneralResult> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.baidu.ocr.sdk.utils.Parser
    public GeneralResult parse(String str) throws OCRError {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("error_code")) {
                OCRError oCRError = new OCRError(jSONObject.optInt("error_code"), jSONObject.optString("error_msg"));
                oCRError.setLogId(jSONObject.optLong("log_id"));
                throw oCRError;
            }
            GeneralResult generalResult = new GeneralResult();
            generalResult.setLogId(jSONObject.optLong("log_id"));
            generalResult.setJsonRes(str);
            generalResult.setDirection(jSONObject.optInt("direction", -1));
            generalResult.setWordsResultNumber(jSONObject.optInt("words_result_num"));
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("words_result");
            int length = jSONArrayOptJSONArray == null ? 0 : jSONArrayOptJSONArray.length();
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                WordSimple wordSimple = new WordSimple();
                wordSimple.setWords(jSONObjectOptJSONObject.optString("words"));
                arrayList.add(wordSimple);
            }
            generalResult.setWordList(arrayList);
            return generalResult;
        } catch (JSONException e) {
            throw new OCRError(283505, "Server illegal response " + str, e);
        }
    }
}
