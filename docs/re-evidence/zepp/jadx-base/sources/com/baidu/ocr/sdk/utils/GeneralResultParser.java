package com.baidu.ocr.sdk.utils;

import com.baidu.ocr.sdk.exception.OCRError;
import com.baidu.ocr.sdk.model.GeneralResult;
import com.baidu.ocr.sdk.model.VertexesLocation;
import com.baidu.ocr.sdk.model.Word;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class GeneralResultParser implements Parser<GeneralResult> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.baidu.ocr.sdk.utils.Parser
    public GeneralResult parse(String str) throws OCRError {
        int i;
        String str2;
        String str3 = "location";
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("error_code") && jSONObject.getInt("error_code") != 0) {
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
            int i2 = 0;
            while (i2 < length) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i2);
                JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject(str3);
                Word word = new Word();
                word.getLocation().setLeft(jSONObjectOptJSONObject2.optInt("left"));
                word.getLocation().setTop(jSONObjectOptJSONObject2.optInt("top"));
                word.getLocation().setWidth(jSONObjectOptJSONObject2.optInt(ViewHierarchyConstants.DIMENSION_WIDTH_KEY));
                word.getLocation().setHeight(jSONObjectOptJSONObject2.optInt("height"));
                word.setWords(jSONObjectOptJSONObject.optString("words"));
                arrayList.add(word);
                JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject.optJSONArray("vertexes_location");
                if (jSONArrayOptJSONArray2 != null) {
                    ArrayList arrayList2 = new ArrayList();
                    int i3 = 0;
                    while (i3 < jSONArrayOptJSONArray2.length()) {
                        JSONObject jSONObjectOptJSONObject3 = jSONArrayOptJSONArray2.optJSONObject(i3);
                        JSONArray jSONArray = jSONArrayOptJSONArray2;
                        VertexesLocation vertexesLocation = new VertexesLocation();
                        vertexesLocation.setX(jSONObjectOptJSONObject3.optInt("x"));
                        vertexesLocation.setY(jSONObjectOptJSONObject3.optInt("y"));
                        arrayList2.add(vertexesLocation);
                        i3++;
                        jSONArrayOptJSONArray2 = jSONArray;
                        length = length;
                    }
                    i = length;
                    word.setVertexesLocations(arrayList2);
                } else {
                    i = length;
                }
                JSONArray jSONArrayOptJSONArray3 = jSONObjectOptJSONObject.optJSONArray("chars");
                if (jSONArrayOptJSONArray3 != null) {
                    ArrayList arrayList3 = new ArrayList();
                    int i4 = 0;
                    while (i4 < jSONArrayOptJSONArray3.length()) {
                        JSONObject jSONObjectOptJSONObject4 = jSONArrayOptJSONArray3.optJSONObject(i4);
                        JSONObject jSONObjectOptJSONObject5 = jSONObjectOptJSONObject4.optJSONObject(str3);
                        Word.Char r15 = new Word.Char();
                        r15.getLocation().setLeft(jSONObjectOptJSONObject5.optInt("left"));
                        r15.getLocation().setTop(jSONObjectOptJSONObject5.optInt("top"));
                        r15.getLocation().setWidth(jSONObjectOptJSONObject5.optInt(ViewHierarchyConstants.DIMENSION_WIDTH_KEY));
                        r15.getLocation().setHeight(jSONObjectOptJSONObject5.optInt("height"));
                        r15.setCharacter(jSONObjectOptJSONObject4.optString("char"));
                        arrayList3.add(r15);
                        i4++;
                        str3 = str3;
                        jSONArrayOptJSONArray3 = jSONArrayOptJSONArray3;
                    }
                    str2 = str3;
                    word.setCharacterResults(arrayList3);
                } else {
                    str2 = str3;
                }
                i2++;
                jSONArrayOptJSONArray = jSONArrayOptJSONArray;
                str3 = str2;
                length = i;
            }
            generalResult.setWordList(arrayList);
            return generalResult;
        } catch (JSONException e) {
            throw new OCRError(283505, "Server illegal response " + str, e);
        }
    }
}
