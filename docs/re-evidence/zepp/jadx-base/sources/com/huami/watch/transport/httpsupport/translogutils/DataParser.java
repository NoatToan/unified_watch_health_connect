package com.huami.watch.transport.httpsupport.translogutils;

import com.baidu.ocr.sdk.model.GeneralParams;
import com.huami.watch.companion.mediac.Command;
import com.huami.watch.transport.httpsupport.model.DataItem;
import com.xiaomi.hm.health.bodyfat.utils.ParamKey;
import com.xiaomi.hm.health.dataprocess.StepsInfo;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class DataParser {
    public static final int FLAG_RECEIVE = 2;
    public static final int FLAG_SEND = 1;
    private DataItem a;
    private int b;

    public DataParser(DataItem dataItem, int i) {
        this.a = dataItem;
        this.b = i;
    }

    private String a(String str) {
        return (str == null || str.length() <= 0) ? "null data" : "";
    }

    private String b(String str) {
        JSONObject jSONObjectOptJSONObject;
        if (str == null || str.length() <= 0) {
            return "null data";
        }
        StringBuffer stringBuffer = new StringBuffer();
        try {
            JSONArray jSONArrayOptJSONArray = new JSONObject(str).optJSONArray("metadata");
            stringBuffer.append("--metadata");
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i);
                stringBuffer.append(jSONObjectOptJSONObject2.optString("-date--"));
                JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject2.optJSONArray("values");
                String strOptString = jSONObjectOptJSONObject2.optString("summary");
                if (jSONArrayOptJSONArray2 != null) {
                    for (int i2 = 0; i2 < jSONArrayOptJSONArray2.length(); i2++) {
                        JSONObject jSONObjectOptJSONObject3 = jSONArrayOptJSONArray2.optJSONObject(i);
                        stringBuffer.append("start:" + jSONObjectOptJSONObject3.optString("start"));
                        stringBuffer.append("~stop:" + jSONObjectOptJSONObject3.optString(Command.STOP) + " | ");
                    }
                }
                if (strOptString != null && (jSONObjectOptJSONObject = new JSONObject(strOptString.replaceAll("''", "")).optJSONObject(StepsInfo.KEY_STEP_INFO)) != null) {
                    stringBuffer.append("--step_summary:" + jSONObjectOptJSONObject.optString("ttl"));
                }
            }
            return stringBuffer.toString();
        } catch (JSONException e) {
            e.printStackTrace();
            return "";
        }
    }

    private String c(String str) {
        if (str == null || str.length() <= 0) {
            return "null data";
        }
        StringBuffer stringBuffer = new StringBuffer();
        try {
            JSONArray jSONArray = new JSONArray(str);
            stringBuffer.append("--rate--");
            for (int i = 0; i < jSONArray.length(); i++) {
                stringBuffer.append("heartRateData:" + jSONArray.optJSONObject(i).optString(ParamKey.heartRateData) + " | ");
            }
            return stringBuffer.toString();
        } catch (JSONException e) {
            e.printStackTrace();
            return "";
        }
    }

    private String d(String str) {
        return (str == null || str.length() <= 0) ? "null data" : "";
    }

    private String e(String str) {
        return null;
    }

    private String f(String str) {
        return null;
    }

    private String g(String str) {
        return null;
    }

    private String h(String str) {
        return null;
    }

    private String i(String str, String str2) {
        if (str == null || str.length() <= 0) {
            return "null action";
        }
        if (Util.ACTION_HEALTH.equals(str)) {
            return b(str2);
        }
        if (Util.ACTION_HEALTH_RATE.equals(str)) {
            return c(str2);
        }
        if (Util.ACTION_SPORT_DOWNLOAD_SUMMARY.equals(str)) {
            return f(str2);
        }
        if (Util.ACTION_SPORT_DOWNLOAD_DETAIL.equals(str)) {
            return e(str2);
        }
        if (Util.ACTION_SPORT_UPLOAD_SUMMARY.equals(str)) {
            return h(str2);
        }
        if (Util.ACTION_SPORT_UPLOAD_DETAIL.equals(str)) {
            return g(str2);
        }
        return null;
    }

    public String bleReceiveResText() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("-receive-blt_sucess");
        stringBuffer.append("-id:" + this.a.getIdentifier());
        stringBuffer.append("-action" + this.a.getAction());
        return stringBuffer.toString();
    }

    public String bleSendResText(DataItem dataItem, int i) {
        StringBuilder sb;
        String str;
        StringBuffer stringBuffer = new StringBuffer();
        if (i == 0) {
            stringBuffer.append("-send-blt_sucess-");
            stringBuffer.append("-id:" + dataItem.getIdentifier());
            sb = new StringBuilder();
            str = "-action-";
        } else {
            stringBuffer.append("-send-blt_failed");
            stringBuffer.append("-id:" + dataItem.getIdentifier());
            sb = new StringBuilder();
            str = "-action";
        }
        sb.append(str);
        sb.append(dataItem.getAction());
        stringBuffer.append(sb.toString());
        return stringBuffer.toString();
    }

    public String getCachaThisText() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("-cache this to local-");
        stringBuffer.append("-id:" + this.a.getIdentifier());
        stringBuffer.append("-action:" + this.a.getAction());
        return stringBuffer.toString();
    }

    public String getCacheDeleteStateText(boolean z) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(z ? "--delete cache data sucess:" : "--delete cache data failed:");
        stringBuffer.append("-id:" + this.a.getIdentifier());
        stringBuffer.append("-action:" + this.a.getAction());
        return stringBuffer.toString();
    }

    public String getImportanceInfo() {
        String str;
        DataItem dataItem = this.a;
        if (dataItem == null || dataItem.getData() == null || this.a.getData().length() <= 0) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        int i = this.b;
        if (2 == i) {
            str = "-receice";
        } else {
            str = 1 == i ? "-send" : "error";
        }
        stringBuffer.append(str);
        stringBuffer.append("-id:" + this.a.getIdentifier());
        stringBuffer.append("-action:" + this.a.getAction());
        stringBuffer.append("-owner:" + this.a.getOwner());
        StringBuilder sb = new StringBuilder();
        sb.append("-isBigData:");
        sb.append(this.a.hasFlag(32768) ? GeneralParams.GRANULARITY_BIG : GeneralParams.GRANULARITY_SMALL);
        stringBuffer.append(sb.toString());
        return stringBuffer.toString();
    }

    public String getSendBleStateText(boolean z) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(z ? "--BLE send data sucess:" : "--BLE send data failed and cache it:");
        stringBuffer.append("-id:" + this.a.getIdentifier());
        stringBuffer.append("-action:" + this.a.getAction());
        return stringBuffer.toString();
    }
}
