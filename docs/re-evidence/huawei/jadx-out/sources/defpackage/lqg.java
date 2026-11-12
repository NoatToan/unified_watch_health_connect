package defpackage;

import android.text.TextUtils;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.hwcloudmodel.hwwear.hag.model.tide.HagTide;
import com.huawei.hwcloudmodel.hwwear.hag.model.tide.HagTideStationBean;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class lqg {
    public static List<HagTideStationBean> c(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("HagTideParseUtils", "weather info is empty");
            return null;
        }
        try {
            JsonObject jsonObjectD = lqn.d(str);
            if (jsonObjectD == null) {
                LogUtil.j("HagTideParseUtils", "getTideInfo() templateContent is null");
                return null;
            }
            return c(jsonObjectD);
        } catch (JsonParseException unused) {
            LogUtil.e("HagTideParseUtils", "getTideInfo() JsonParseException");
            return null;
        } catch (IllegalStateException unused2) {
            LogUtil.e("HagTideParseUtils", "getTideInfo() IllegalStateException");
            return null;
        }
    }

    private static List<HagTideStationBean> c(JsonObject jsonObject) {
        JsonArray asJsonArray;
        ArrayList arrayList = new ArrayList(16);
        JsonArray asJsonArray2 = jsonObject.getAsJsonArray("hourTides");
        if (asJsonArray2 == null || asJsonArray2.isJsonNull() || asJsonArray2.size() <= 0) {
            LogUtil.j("HagTideParseUtils", "parseTideListJson() forecasts is null or is isJsonNull or size less 0");
            return arrayList;
        }
        for (int i = 0; i < asJsonArray2.size(); i++) {
            if (arrayList.size() >= 5) {
                LogUtil.j("HagTideParseUtils", "parseTideListJson() tideStationBeans size >= 5");
                return arrayList;
            }
            HagTideStationBean hagTideStationBean = new HagTideStationBean();
            JsonElement jsonElement = asJsonArray2.get(i);
            if (jsonElement == null || jsonElement.isJsonNull()) {
                LogUtil.j("HagTideParseUtils", "parseTideListJson() jsonElement is null or jsonElement value is null");
            } else {
                JsonObject asJsonObject = jsonElement.getAsJsonObject();
                if (asJsonObject != null && !asJsonObject.isJsonNull() && asJsonObject.isJsonObject()) {
                    JsonElement jsonElement2 = asJsonObject.get("stationName");
                    if (jsonElement2 != null) {
                        hagTideStationBean.setName(jsonElement2.getAsString());
                    }
                    JsonElement jsonElement3 = asJsonObject.get("tides");
                    if (jsonElement3 != null && (asJsonArray = jsonElement3.getAsJsonArray()) != null && !asJsonArray.isJsonNull() && asJsonArray.size() > 0) {
                        hagTideStationBean.setHagTides(a(asJsonArray));
                    }
                    arrayList.add(hagTideStationBean);
                }
            }
        }
        return arrayList;
    }

    private static List<HagTide> a(JsonArray jsonArray) {
        ArrayList arrayList = new ArrayList(16);
        for (int i = 0; i < jsonArray.size(); i++) {
            HagTide hagTide = new HagTide();
            JsonElement jsonElement = jsonArray.get(i);
            if (jsonElement == null) {
                LogUtil.j("HagTideParseUtils", "parseHagTide() tideRoots is null");
            } else {
                JsonObject asJsonObject = jsonElement.getAsJsonObject();
                if (asJsonObject == null || !asJsonObject.isJsonObject()) {
                    LogUtil.j("HagTideParseUtils", "parseHagTide() tideRoot is null or tideRoot is not json object");
                } else {
                    JsonElement jsonElement2 = asJsonObject.get("type");
                    if (jsonElement2 == null) {
                        LogUtil.j("HagTideParseUtils", "parseHagTide tideType is null");
                    } else {
                        String asString = jsonElement2.getAsString();
                        if (TextUtils.isEmpty(asString)) {
                            LogUtil.j("HagTideParseUtils", "parseHagTide type is empty");
                        } else {
                            if ("Low".equalsIgnoreCase(asString)) {
                                hagTide.setTideType(1);
                            } else if ("High".equalsIgnoreCase(asString)) {
                                hagTide.setTideType(2);
                            } else {
                                hagTide.setTideType(0);
                            }
                            JsonElement jsonElement3 = asJsonObject.get("dateTime");
                            if (jsonElement3 != null) {
                                hagTide.setTideTime(jsonElement3.getAsLong() / 1000);
                            }
                            JsonElement jsonElement4 = asJsonObject.get("height");
                            int i2 = -32768;
                            if (jsonElement4 != null) {
                                try {
                                    i2 = Integer.parseInt(jsonElement4.getAsString());
                                } catch (NumberFormatException e) {
                                    LogUtil.j("HagTideParseUtils", "parseHagTide NumberFormatException, ", ExceptionUtils.c(e));
                                }
                                hagTide.setTideHeight(i2);
                            } else {
                                hagTide.setTideHeight(-32768);
                            }
                            arrayList.add(hagTide);
                        }
                    }
                }
            }
        }
        return arrayList;
    }
}
