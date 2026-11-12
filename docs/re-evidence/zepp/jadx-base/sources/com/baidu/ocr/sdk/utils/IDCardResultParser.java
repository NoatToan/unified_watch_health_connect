package com.baidu.ocr.sdk.utils;

import android.text.TextUtils;
import com.baidu.ocr.sdk.exception.OCRError;
import com.baidu.ocr.sdk.model.IDCardResult;
import com.baidu.ocr.sdk.model.Word;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class IDCardResultParser implements Parser<IDCardResult> {
    private String idCardSide;

    public IDCardResultParser(String str) {
        this.idCardSide = str;
    }

    private Word map(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        Word word = new Word();
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("location");
        word.getLocation().setLeft(jSONObjectOptJSONObject.optInt("left"));
        word.getLocation().setTop(jSONObjectOptJSONObject.optInt("top"));
        word.getLocation().setWidth(jSONObjectOptJSONObject.optInt(ViewHierarchyConstants.DIMENSION_WIDTH_KEY));
        word.getLocation().setHeight(jSONObjectOptJSONObject.optInt("height"));
        word.setWords(jSONObject.optString("words"));
        return word;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.baidu.ocr.sdk.utils.Parser
    public IDCardResult parse(String str) throws OCRError {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("error_code")) {
                OCRError oCRError = new OCRError(jSONObject.optInt("error_code"), jSONObject.optString("error_msg"));
                oCRError.setLogId(jSONObject.optLong("log_id"));
                throw oCRError;
            }
            IDCardResult iDCardResult = new IDCardResult();
            iDCardResult.setLogId(jSONObject.optLong("log_id"));
            iDCardResult.setJsonRes(str);
            iDCardResult.setDirection(jSONObject.optInt("direction", -1));
            iDCardResult.setWordsResultNumber(jSONObject.optInt("words_result_num"));
            iDCardResult.setRiskType(jSONObject.optString("risk_type"));
            iDCardResult.setImageStatus(jSONObject.optString("image_status"));
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("words_result");
            if (TextUtils.isEmpty(this.idCardSide)) {
                this.idCardSide = "front";
            }
            iDCardResult.setIdCardSide(this.idCardSide);
            if (jSONObjectOptJSONObject != null) {
                if ("front".equals(this.idCardSide)) {
                    iDCardResult.setAddress(map(jSONObjectOptJSONObject.optJSONObject("住址")));
                    iDCardResult.setIdNumber(map(jSONObjectOptJSONObject.optJSONObject("公民身份号码")));
                    iDCardResult.setBirthday(map(jSONObjectOptJSONObject.optJSONObject("出生")));
                    iDCardResult.setGender(map(jSONObjectOptJSONObject.optJSONObject("性别")));
                    iDCardResult.setName(map(jSONObjectOptJSONObject.optJSONObject("姓名")));
                    iDCardResult.setEthnic(map(jSONObjectOptJSONObject.optJSONObject("民族")));
                } else if ("back".equals(this.idCardSide)) {
                    iDCardResult.setSignDate(map(jSONObjectOptJSONObject.optJSONObject("签发日期")));
                    iDCardResult.setExpiryDate(map(jSONObjectOptJSONObject.optJSONObject("失效日期")));
                    iDCardResult.setIssueAuthority(map(jSONObjectOptJSONObject.optJSONObject("签发机关")));
                }
            }
            return iDCardResult;
        } catch (JSONException e) {
            throw new OCRError(283505, "Server illegal response " + str, e);
        }
    }
}
