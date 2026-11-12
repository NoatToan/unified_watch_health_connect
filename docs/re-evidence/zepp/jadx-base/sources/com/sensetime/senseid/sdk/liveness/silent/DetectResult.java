package com.sensetime.senseid.sdk.liveness.silent;

import android.util.Base64;
import com.sensetime.senseid.sdk.liveness.silent.common.type.AbstractContentType;
import com.sensetime.senseid.sdk.liveness.silent.type.FaceDistance;
import com.sensetime.senseid.sdk.liveness.silent.type.FaceOcclusion;
import com.sensetime.senseid.sdk.liveness.silent.type.FaceState;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes18.dex */
final class DetectResult extends AbstractContentType {
    private static final String PARAM_DATA = "data";
    private static final String PARAM_LIVENESS_ID = "liveness_id";
    private static final String PARAM_SILENT_MODE = "silent_mode";
    public int bottom;
    public double browScore;
    public float coveredScore;
    public double eyeScore;
    public int faceCount;

    @FaceDistance
    public int faceDistance;
    public int faceId;
    public FaceOcclusion faceOcclusion;

    @FaceState
    public int faceState;
    public float hacknessScore;
    public List<byte[]> images;
    public int left;
    public int message;
    public double mouthScore;
    public double noseScore;
    public boolean passed;
    public byte[] protobuf;
    public int right;
    public int top;

    public final JSONObject generateAntihackJson(String str, boolean z) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(PARAM_LIVENESS_ID, str);
            jSONObject.put(PARAM_SILENT_MODE, z);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    @Override // com.sensetime.senseid.sdk.liveness.silent.common.type.AbstractContentType
    public final JSONObject generateContentJson(long j, int i, String str) {
        JSONObject jSONObjectGenerateCommonContentJson = generateCommonContentJson();
        if (jSONObjectGenerateCommonContentJson == null) {
            jSONObjectGenerateCommonContentJson = new JSONObject();
        }
        try {
            jSONObjectGenerateCommonContentJson.put("duration", j);
            jSONObjectGenerateCommonContentJson.put("result", i);
            byte[] bArr = this.protobuf;
            jSONObjectGenerateCommonContentJson.put("data", (bArr == null || bArr.length <= 0) ? "" : Base64.encodeToString(bArr, 0));
            jSONObjectGenerateCommonContentJson.put(AbstractContentType.PARAM_SDK_VERSION, str);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObjectGenerateCommonContentJson;
    }

    public final String toString() {
        return "DetectResult[Passed: " + this.passed + ", Message: " + this.message + ", Score: " + this.hacknessScore + ", Count: " + this.faceCount + ", Left: " + this.left + ", Top: " + this.top + ", Right: " + this.right + ", Bottom: " + this.bottom + ", ID: " + this.faceId + ", Distance: " + this.faceDistance + ", State: " + this.faceState + ", OcclusionScore: " + this.coveredScore + ", brow occlusionScore:" + this.browScore + ", eye occlusionScore: " + this.eyeScore + ", nose occlusionScore: " + this.noseScore + "mouth occlusionScore: " + this.mouthScore + "]";
    }
}
