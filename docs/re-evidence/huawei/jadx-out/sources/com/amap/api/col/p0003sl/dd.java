package com.amap.api.col.p0003sl;

import android.graphics.Color;
import android.text.TextUtils;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.autonavi.base.ae.gmap.style.StyleElement;
import com.autonavi.base.ae.gmap.style.StyleItem;
import com.autonavi.base.amap.mapcore.Convert;
import com.autonavi.base.amap.mapcore.FileUtil;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.watchface.mvp.model.latona.provider.WatchFaceProvider;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class dd {
    private static final int[] d = {1};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f2362b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f2363c = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    List<cz> f2361a = null;

    public final de a(String str, boolean z) {
        if (str == null || "".equals(str)) {
            return null;
        }
        return b(str, z);
    }

    public final de a(byte[] bArr, boolean z) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        return b(bArr, z);
    }

    private de b(byte[] bArr, boolean z) {
        de deVar = new de();
        try {
            if (!a(deVar.a(), bArr)) {
                a(deVar, bArr, z);
            }
            a(deVar);
            deVar.b();
            return deVar;
        } catch (Throwable th) {
            th.printStackTrace();
            return deVar;
        }
    }

    private void a(de deVar) {
        if (this.f2363c != -1) {
            Map<Integer, StyleItem> mapA = deVar.a();
            for (cz czVar : a("roads", "trafficRoadBackgroundColor")) {
                a(mapA, czVar.d, db.a("fillColor"), czVar).value = this.f2363c;
                a(mapA, czVar.d, db.a("strokeColor"), czVar).value = this.f2363c;
            }
        }
    }

    private de b(String str, boolean z) {
        try {
            return b(FileUtil.readFileContents(str), z);
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    private void a(de deVar, byte[] bArr, boolean z) {
        da daVarA = a(bArr);
        if (daVarA == null || daVarA.a() == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(daVarA.a());
            JSONArray jSONArrayNames = jSONObject.names();
            for (int i = 0; i < jSONArrayNames.length(); i++) {
                String string = jSONArrayNames.getString(i);
                if (string == null || !string.trim().equals("sdkTextures")) {
                    if (string != null && string.trim().equals(WatchFaceProvider.BACKGROUND_LABEL)) {
                        this.f2362b = a("#".concat(String.valueOf(jSONObject.optString(WatchFaceProvider.BACKGROUND_LABEL))));
                    } else {
                        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(string);
                        if (jSONObjectOptJSONObject != null) {
                            a(string, deVar.a(), jSONObjectOptJSONObject, z);
                        }
                    }
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private void a(String str, Map<Integer, StyleItem> map, JSONObject jSONObject, boolean z) throws JSONException {
        if (jSONObject == null) {
            return;
        }
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("subType");
        if (jSONObjectOptJSONObject == null) {
            a(str, str, map, jSONObject, z);
            return;
        }
        JSONArray jSONArrayNames = jSONObjectOptJSONObject.names();
        for (int i = 0; i < jSONArrayNames.length(); i++) {
            String strOptString = jSONArrayNames.optString(i);
            JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject(strOptString);
            if (jSONObjectOptJSONObject2.has("detailedType")) {
                JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject2.optJSONObject("detailedType");
                if (jSONObjectOptJSONObject3 != null) {
                    JSONArray jSONArrayNames2 = jSONObjectOptJSONObject3.names();
                    for (int i2 = 0; i2 < jSONArrayNames2.length(); i2++) {
                        String strOptString2 = jSONArrayNames2.optString(i2);
                        JSONObject jSONObjectOptJSONObject4 = jSONObjectOptJSONObject3.optJSONObject(strOptString2);
                        if (jSONObjectOptJSONObject4 != null) {
                            a(str, strOptString2, map, jSONObjectOptJSONObject4, z);
                        }
                    }
                }
            } else {
                a(str, strOptString, map, jSONObjectOptJSONObject2, z);
            }
        }
    }

    public final void a(int i) {
        this.f2363c = i;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x016e  */
    private List<cz> b() {
        String str;
        String str2;
        JSONObject jSONObject;
        JSONArray jSONArray;
        int i;
        JSONObject jSONObject2;
        JSONArray jSONArray2;
        int i2;
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObject3;
        String str3 = "styleMap";
        String str4 = "subType";
        this.f2361a = new ArrayList();
        try {
            JSONArray jSONArray3 = new JSONArray("[{\n\t\"regions\": {\n\t\t\"name\": \"区域面\",\n\t\t\"subType\": {\n\t\t\t\"land\": {\n\t\t\t\t\"name\": \"陆地\",\n\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\"mainkey\": 30001,\n\t\t\t\t\t\"subkey\": [1, 4, 5]\n\t\t\t\t}]\n\t\t\t},\n\t\t\t\"green\": {\n\t\t\t\t\"name\": \"绿地\",\n\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\"mainkey\": 30001,\n\t\t\t\t\t\"subkey\": [3, 7, 8, 9, 10, 12]\n\t\t\t\t}]\n\t\t\t},\n\t\t\t\"edu\": {\n\t\t\t\t\"name\": \"教育体育\",\n\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\"mainkey\": 30002,\n\t\t\t\t\t\"subkey\": [3, 31]\n\t\t\t\t}]\n\t\t\t},\n\t\t\t\"public\": {\n\t\t\t\t\"name\": \"公共设施\",\n\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\"mainkey\": 30002,\n\t\t\t\t\t\"subkey\": [4, 12, 22, 32]\n\t\t\t\t}]\n\t\t\t},\n\t\t\t\"traffic\": {\n\t\t\t\t\"name\": \"交通枢纽\",\n\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\"mainkey\": 30002,\n\t\t\t\t\t\"subkey\": [6, 14, 40]\n\t\t\t\t}, {\n\t\t\t\t\t\"mainkey\": 30004\n\t\t\t\t}]\n\t\t\t},\n\t\t\t\"scenicSpot\": {\n\t\t\t\t\"name\": \"景区\",\n\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\"mainkey\": 30002,\n\t\t\t\t\t\"subkey\": [5, 33]\n\t\t\t\t}]\n\t\t\t},\n\t\t\t\"culture\": {\n\t\t\t\t\"name\": \"文化\",\n\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\"mainkey\": 30002,\n\t\t\t\t\t\"subkey\": [7, 35]\n\t\t\t\t}]\n\t\t\t},\n\t\t\t\"health\": {\n\t\t\t\t\"name\": \"医疗卫生\",\n\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\"mainkey\": 30002,\n\t\t\t\t\t\"subkey\": [8, 36]\n\t\t\t\t}]\n\t\t\t},\n\t\t\t\"sports\": {\n\t\t\t\t\"name\": \"运动场所\",\n\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\"mainkey\": 30002,\n\t\t\t\t\t\"subkey\": [9, 10, 13, 19, 20, 21, 34, 37, 39]\n\t\t\t\t}]\n\t\t\t},\n\t\t\t\"business\": {\n\t\t\t\t\"name\": \"商业场所\",\n\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\"mainkey\": 30002,\n\t\t\t\t\t\"subkey\": [11, 23, 24, 25, 26, 27, 28, 29, 30, 38]\n\t\t\t\t}]\n\t\t\t},\n\t\t\t\"parkingLot\": {\n\t\t\t\t\"name\": \"停车场\",\n\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\"mainkey\": 30002,\n\t\t\t\t\t\"subkey\": [1]\n\t\t\t\t}]\n\t\t\t},\n\t\t\t\"subway\": {\n\t\t\t\t\"name\": \"地铁设施\",\n\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\"mainkey\": 30003\n\t\t\t\t}]\n\t\t\t}\n\t\t}\n\t},\n\t\"water\": {\n\t\t\"name\": \"水系\",\n\t\t\"styleMap\": [{\n\t\t\t\"mainkey\": 30001,\n\t\t\t\"subkey\": [2, 6, 11, 13]\n\t\t}, {\n\t\t\t\"mainkey\": 20014\n\t\t}, {\n\t\t\t\"mainkey\": 10002,\n\t\t\t\"subkey\": [13]\n\t\t}]\n\t},\n\t\"buildings\": {\n\t\t\"name\": \"建筑物\",\n\t\t\"styleMap\": [{\n\t\t\t\"mainkey\": 50001\n\t\t}, {\n\t\t\t\"mainkey\": 50002\n\t\t}, {\n\t\t\t\"mainkey\": 50003\n\t\t}, {\n\t\t\t\"mainkey\": 50004\n\t\t}, {\n\t\t\t\"mainkey\": 30002,\n\t\t\t\"subkey\": [2, 15, 16, 17, 18]\n\t\t}]\n\t},\n\t\"roads\": {\n\t\t\"name\": \"道路\",\n\t\t\"subType\": {\n\t\t\t\"highWay\": {\n\t\t\t\t\"name\": \"高速公路\",\n\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\"mainkey\": 20001\n\t\t\t\t}]\n\t\t\t},\n\t\t\t\"ringRoad\": {\n\t\t\t\t\"name\": \"城市环线\",\n\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\"mainkey\": 20002\n\t\t\t\t}]\n\t\t\t},\n\t\t\t\"nationalRoad\": {\n\t\t\t\t\"name\": \"国道\",\n\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\"mainkey\": 20003\n\t\t\t\t}]\n\t\t\t},\n\t\t\t\"provincialRoad\": {\n\t\t\t\t\"name\": \"省道\",\n\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\"mainkey\": 20004\n\t\t\t\t}]\n\t\t\t},\n\t\t\t\"secondaryRoad\": {\n\t\t\t\t\"name\": \"二级公路\",\n\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\"mainkey\": 20007\n\t\t\t\t}]\n\t\t\t},\n\t\t\t\"levelThreeRoad\": {\n\t\t\t\t\"name\": \"三级公路\",\n\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\"mainkey\": 20008\n\t\t\t\t}]\n\t\t\t},\n\t\t\t\"levelFourRoad\": {\n\t\t\t\t\"name\": \"四级道路\",\n\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\"mainkey\": 20009\n\t\t\t\t}]\n\t\t\t},\n\t\t\t\"roadsBeingBuilt\": {\n\t\t\t\t\"name\": \"在建道路\",\n\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\"mainkey\": 20018\n\t\t\t\t}]\n\t\t\t},\n\t\t\t\"railway\": {\n\t\t\t\t\"name\": \"铁路\",\n\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\"mainkey\": 20010,\n\t\t\t\t\t\"subkey\": [1]\n\t\t\t\t}]\n\t\t\t},\n\t\t\t\"highSpeedRailway\": {\n\t\t\t\t\"name\": \"高铁\",\n\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\"mainkey\": 20010,\n\t\t\t\t\t\"subkey\": [2]\n\t\t\t\t}]\n\t\t\t},\n\t\t\t\"subway\": {\n\t\t\t\t\"name\": \"地铁\",\n\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\"mainkey\": 20015\n\t\t\t\t}]\n\t\t\t},\n\t\t\t\"subwayBeingBuilt\": {\n\t\t\t\t\"name\": \"在建地铁\",\n\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\"mainkey\": 20015,\n\t\t\t\t\t\"subkey\": [1, 2]\n\t\t\t\t}, {\n\t\t\t\t\t\"mainkey\": 20019\n\t\t\t\t}]\n\t\t\t},\n\t\t\t\"overPass\": {\n\t\t\t\t\"name\": \"天桥\",\n\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\"mainkey\": 20012\n\t\t\t\t}]\n\t\t\t},\n\t\t\t\"underPass\": {\n\t\t\t\t\"name\": \"地道\",\n\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\"mainkey\": 20013\n\t\t\t\t}]\n\t\t\t},\n\t\t\t\"other\": {\n\t\t\t\t\"name\": \"其他线条\",\n\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\"mainkey\": 20011\n\t\t\t\t}, {\n\t\t\t\t\t\"mainkey\": 20017\n\t\t\t\t}, {\n\t\t\t\t\t\"mainkey\": 20020\n\t\t\t\t}, {\n\t\t\t\t\t\"mainkey\": 20024\n\t\t\t\t}, {\n\t\t\t\t\t\"mainkey\": 20028\n\t\t\t\t}]\n\t\t\t},\n\t\t\t\"guideBoards\": {\n\t\t\t\t\"name\": \"道路路牌\",\n\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\"mainkey\": 40001\n\t\t\t\t}]\n\t\t\t}\n\t\t}\n\t},\n\t\"labels\": {\n\t\t\"name\": \"标注\",\n\t\t\"subType\": {\n\t\t\t\"pois\": {\n\t\t\t\t\"name\": \"兴趣点\",\n\t\t\t\t\"subType\": {\n\t\t\t\t\t\"hotel\": {\n\t\t\t\t\t\t\"name\": \"住宿\",\n\t\t\t\t\t\t\"isDetailedType\": true,\n\t\t\t\t\t\t\"detailedCode\": 0,\n\t\t\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\t\t\"mainkey\": 10001,\n\t\t\t\t\t\t\t\"subkey\": [9, 133, 134, 135, 136, 155, 156, 157, 158, 159, 160, 161, 162, 186]\n\t\t\t\t\t\t}, {\n\t\t\t\t\t\t\t\"mainkey\": 10007,\n\t\t\t\t\t\t\t\"subkey\": [31, 32, 33, 34, 35, 36, 37, 38, 39, 164, 165]\n\t\t\t\t\t\t}]\n\t\t\t\t\t},\n\t\t\t\t\t\"restaurant\": {\n\t\t\t\t\t\t\"name\": \"餐饮\",\n\t\t\t\t\t\t\"isDetailedType\": true,\n\t\t\t\t\t\t\"detailedCode\": 1,\n\t\t\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\t\t\"mainkey\": 10001,\n\t\t\t\t\t\t\t\"subkey\": [19, 20, 21, 22, 114, 115, 116, 117, 118, 119, 183, 187]\n\t\t\t\t\t\t}, {\n\t\t\t\t\t\t\t\"mainkey\": 10007,\n\t\t\t\t\t\t\t\"subkey\": [1, 2, 3, 4, 166, 167, 168, 179, 180, 181, 203, 205, 206, 215]\n\t\t\t\t\t\t}]\n\t\t\t\t\t},\n\t\t\t\t\t\"shop\": {\n\t\t\t\t\t\t\"name\": \"购物\",\n\t\t\t\t\t\t\"isDetailedType\": true,\n\t\t\t\t\t\t\"detailedCode\": 2,\n\t\t\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\t\t\"mainkey\": 10001,\n\t\t\t\t\t\t\t\"subkey\": [7, 8, 68, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99]\n\t\t\t\t\t\t}, {\n\t\t\t\t\t\t\t\"mainkey\": 10007,\n\t\t\t\t\t\t\t\"subkey\": [5, 6, 7, 8, 9, 10, 11, 12, 13, 175, 200, 201, 202, 204]\n\t\t\t\t\t\t}]\n\t\t\t\t\t},\n\t\t\t\t\t\"scenicSpot\": {\n\t\t\t\t\t\t\"name\": \"风景名胜\",\n\t\t\t\t\t\t\"isDetailedType\": true,\n\t\t\t\t\t\t\"detailedCode\": 3,\n\t\t\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\t\t\"mainkey\": 10001,\n\t\t\t\t\t\t\t\"subkey\": [4, 12, 14, 38, 69, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 120, 167, 171, 188, 189, 190, 191, 192]\n\t\t\t\t\t\t}, {\n\t\t\t\t\t\t\t\"mainkey\": 10008\n\t\t\t\t\t\t}, {\n\t\t\t\t\t\t\t\"mainkey\": 10007,\n\t\t\t\t\t\t\t\"subkey\": [48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 123, 124, 125, 126, 127, 128, 129, 130, 131, 132, 133, 134, 135, 136, 137, 138, 139, 140, 141, 142, 143, 144, 145, 146, 147, 148, 149, 150, 151, 152, 153, 154, 155, 156, 157, 158, 159, 160, 161, 162, 163, 187, 188, 190, 192, 193, 194, 195, 196, 198, 216, 217, 218, 219, 220, 221, 223, 224, 225]\n\t\t\t\t\t\t}]\n\t\t\t\t\t},\n\t\t\t\t\t\"traffic\": {\n\t\t\t\t\t\t\"name\": \"交通设施\",\n\t\t\t\t\t\t\"isDetailedType\": true,\n\t\t\t\t\t\t\"detailedCode\": 4,\n\t\t\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\t\t\"mainkey\": 10001,\n\t\t\t\t\t\t\t\"subkey\": [23, 24, 25, 26, 31, 36, 148, 154, 168, 172, 175, 176, 177, 178]\n\t\t\t\t\t\t}, {\n\t\t\t\t\t\t\t\"mainkey\": 10002,\n\t\t\t\t\t\t\t\"subkey\": [11, 16]\n\t\t\t\t\t\t}, {\n\t\t\t\t\t\t\t\"mainkey\": 10009\n\t\t\t\t\t\t}]\n\t\t\t\t\t},\n\t\t\t\t\t\"bank\": {\n\t\t\t\t\t\t\"name\": \"金融保险\",\n\t\t\t\t\t\t\"isDetailedType\": true,\n\t\t\t\t\t\t\"detailedCode\": 5,\n\t\t\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\t\t\"mainkey\": 10001,\n\t\t\t\t\t\t\t\"subkey\": [42, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 144, 145, 146, 147]\n\t\t\t\t\t\t}, {\n\t\t\t\t\t\t\t\"mainkey\": 10007,\n\t\t\t\t\t\t\t\"subkey\": [14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27]\n\t\t\t\t\t\t}]\n\t\t\t\t\t},\n\t\t\t\t\t\"edu\": {\n\t\t\t\t\t\t\"name\": \"科教文化\",\n\t\t\t\t\t\t\"isDetailedType\": true,\n\t\t\t\t\t\t\"detailedCode\": 6,\n\t\t\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\t\t\"mainkey\": 10001,\n\t\t\t\t\t\t\t\"subkey\": [10, 11, 13, 35, 138, 139, 140, 141, 142, 143, 163, 164, 165, 166, 170]\n\t\t\t\t\t\t}, {\n\t\t\t\t\t\t\t\"mainkey\": 10007,\n\t\t\t\t\t\t\t\"subkey\": [43, 44, 45, 46, 47, 176, 177]\n\t\t\t\t\t\t}]\n\t\t\t\t\t},\n\t\t\t\t\t\"live\": {\n\t\t\t\t\t\t\"name\": \"生活服务\",\n\t\t\t\t\t\t\"isDetailedType\": true,\n\t\t\t\t\t\t\"detailedCode\": 7,\n\t\t\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\t\t\"mainkey\": 10001,\n\t\t\t\t\t\t\t\"subkey\": [58, 63, 64, 65, 66, 67, 121, 122, 123]\n\t\t\t\t\t\t}, {\n\t\t\t\t\t\t\t\"mainkey\": 10007,\n\t\t\t\t\t\t\t\"subkey\": [28, 29, 30]\n\t\t\t\t\t\t}]\n\t\t\t\t\t},\n\t\t\t\t\t\"hospital\": {\n\t\t\t\t\t\t\"name\": \"医疗保健\",\n\t\t\t\t\t\t\"isDetailedType\": true,\n\t\t\t\t\t\t\"detailedCode\": 8,\n\t\t\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\t\t\"mainkey\": 10001,\n\t\t\t\t\t\t\t\"subkey\": [32, 33, 57, 70, 131, 132, 169, 193, 206, 207, 208, 209, 210]\n\t\t\t\t\t\t}, {\n\t\t\t\t\t\t\t\"mainkey\": 10007,\n\t\t\t\t\t\t\t\"subkey\": [170, 209]\n\t\t\t\t\t\t}]\n\t\t\t\t\t},\n\t\t\t\t\t\"pe\": {\n\t\t\t\t\t\t\"name\": \"休闲体育\",\n\t\t\t\t\t\t\"isDetailedType\": true,\n\t\t\t\t\t\t\"detailedCode\": 9,\n\t\t\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\t\t\"mainkey\": 10001,\n\t\t\t\t\t\t\t\"subkey\": [15, 16, 17, 37, 60, 61, 62, 73, 124, 125, 126, 127, 128, 129, 130, 180, 181, 182, 184, 185, 194, 195, 196, 197, 198, 199, 200, 201, 202, 203, 204, 205, 213, 214]\n\t\t\t\t\t\t}, {\n\t\t\t\t\t\t\t\"mainkey\": 10007,\n\t\t\t\t\t\t\t\"subkey\": [169, 171, 172, 173, 174, 178, 197, 207]\n\t\t\t\t\t\t}]\n\t\t\t\t\t},\n\t\t\t\t\t\"public\": {\n\t\t\t\t\t\t\"name\": \"公共设施\",\n\t\t\t\t\t\t\"isDetailedType\": true,\n\t\t\t\t\t\t\"detailedCode\": 10,\n\t\t\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\t\t\"mainkey\": 10001,\n\t\t\t\t\t\t\t\"subkey\": [59, 173, 215]\n\t\t\t\t\t\t}]\n\t\t\t\t\t},\n\t\t\t\t\t\"buidling\": {\n\t\t\t\t\t\t\"name\": \"商务住宅\",\n\t\t\t\t\t\t\"isDetailedType\": true,\n\t\t\t\t\t\t\"detailedCode\": 11,\n\t\t\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\t\t\"mainkey\": 10001,\n\t\t\t\t\t\t\t\"subkey\": [5, 6, 74, 75, 76, 77, 78, 79, 80, 81, 179]\n\t\t\t\t\t\t}, {\n\t\t\t\t\t\t\t\"mainkey\": 10007,\n\t\t\t\t\t\t\t\"subkey\": [189, 191]\n\t\t\t\t\t\t}]\n\t\t\t\t\t},\n\t\t\t\t\t\"gov\": {\n\t\t\t\t\t\t\"name\": \"政府机构及社会团体\",\n\t\t\t\t\t\t\"isDetailedType\": true,\n\t\t\t\t\t\t\"detailedCode\": 12,\n\t\t\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\t\t\"mainkey\": 10001,\n\t\t\t\t\t\t\t\"subkey\": [3, 34, 43, 137]\n\t\t\t\t\t\t}]\n\t\t\t\t\t},\n\t\t\t\t\t\"moto\": {\n\t\t\t\t\t\t\"name\": \"摩托车服务\",\n\t\t\t\t\t\t\"isDetailedType\": true,\n\t\t\t\t\t\t\"detailedCode\": 13,\n\t\t\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\t\t\"mainkey\": 10001,\n\t\t\t\t\t\t\t\"subkey\": [113]\n\t\t\t\t\t\t}]\n\t\t\t\t\t},\n\t\t\t\t\t\"vehicle\": {\n\t\t\t\t\t\t\"name\": \"汽车服务\",\n\t\t\t\t\t\t\"isDetailedType\": true,\n\t\t\t\t\t\t\"detailedCode\": 14,\n\t\t\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\t\t\"mainkey\": 10001,\n\t\t\t\t\t\t\t\"subkey\": [39, 40, 41, 71, 72, 151, 152, 153]\n\t\t\t\t\t\t}, {\n\t\t\t\t\t\t\t\"mainkey\": 10007,\n\t\t\t\t\t\t\t\"subkey\": [40, 41, 42, 182, 183, 184, 185, 186]\n\t\t\t\t\t\t}]\n\t\t\t\t\t},\n\t\t\t\t\t\"pass\": {\n\t\t\t\t\t\t\"name\": \"通行设施\",\n\t\t\t\t\t\t\"isDetailedType\": true,\n\t\t\t\t\t\t\"detailedCode\": 15,\n\t\t\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\t\t\"mainkey\": 10001,\n\t\t\t\t\t\t\t\"subkey\": [27, 28, 149, 150, 174]\n\t\t\t\t\t\t}, {\n\t\t\t\t\t\t\t\"mainkey\": 10002,\n\t\t\t\t\t\t\t\"subkey\": [21]\n\t\t\t\t\t\t}]\n\t\t\t\t\t},\n\t\t\t\t\t\"subway\": {\n\t\t\t\t\t\t\"name\": \"地铁站\",\n\t\t\t\t\t\t\"isDetailedType\": true,\n\t\t\t\t\t\t\"detailedCode\": 16,\n\t\t\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\t\t\"mainkey\": 10005\n\t\t\t\t\t\t}, {\n\t\t\t\t\t\t\t\"mainkey\": 10006\n\t\t\t\t\t\t}]\n\t\t\t\t\t},\n\t\t\t\t\t\"roadFacilities\": {\n\t\t\t\t\t\t\"name\": \"道路附属设施\",\n\t\t\t\t\t\t\"isDetailedType\": true,\n\t\t\t\t\t\t\"detailedCode\": 17,\n\t\t\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\t\t\"mainkey\": 10001,\n\t\t\t\t\t\t\t\"subkey\": [2, 29, 30]\n\t\t\t\t\t\t}, {\n\t\t\t\t\t\t\t\"mainkey\": 10017\n\t\t\t\t\t\t}]\n\t\t\t\t\t},\n\t\t\t\t\t\"address\": {\n\t\t\t\t\t\t\"name\": \"地名\",\n\t\t\t\t\t\t\"isDetailedType\": true,\n\t\t\t\t\t\t\"detailedCode\": 18,\n\t\t\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\t\t\"mainkey\": 10001,\n\t\t\t\t\t\t\t\"subkey\": [18]\n\t\t\t\t\t\t}, {\n\t\t\t\t\t\t\t\"mainkey\": 10002,\n\t\t\t\t\t\t\t\"subkey\": [10, 12, 14, 15, 23, 36]\n\t\t\t\t\t\t}]\n\t\t\t\t\t},\n\t\t\t\t\t\"other\": {\n\t\t\t\t\t\t\"name\": \"其他\",\n\t\t\t\t\t\t\"isDetailedType\": true,\n\t\t\t\t\t\t\"detailedCode\": 19,\n\t\t\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\t\t\"mainkey\": 10001,\n\t\t\t\t\t\t\t\"subkey\": [1, 211, 212]\n\t\t\t\t\t\t}, {\n\t\t\t\t\t\t\t\"mainkey\": 10002,\n\t\t\t\t\t\t\t\"subkey\": [28]\n\t\t\t\t\t\t}, {\n\t\t\t\t\t\t\t\"mainkey\": 10007,\n\t\t\t\t\t\t\t\"subkey\": [208, 210, 211, 212, 213, 214]\n\t\t\t\t\t\t}, {\n\t\t\t\t\t\t\t\"mainkey\": 10010\n\t\t\t\t\t\t}, {\n\t\t\t\t\t\t\t\"mainkey\": 10011\n\t\t\t\t\t\t}, {\n\t\t\t\t\t\t\t\"mainkey\": 10012\n\t\t\t\t\t\t}, {\n\t\t\t\t\t\t\t\"mainkey\": 10013\n\t\t\t\t\t\t}, {\n\t\t\t\t\t\t\t\"mainkey\": 10014\n\t\t\t\t\t\t}, {\n\t\t\t\t\t\t\t\"mainkey\": 10015\n\t\t\t\t\t\t}, {\n\t\t\t\t\t\t\t\"mainkey\": 10016\n\t\t\t\t\t\t}]\n\t\t\t\t\t}\n\t\t\t\t}\n\t\t\t},\n\t\t\t\"aois\": {\n\t\t\t\t\"name\": \"区域标注\",\n\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\"mainkey\": 10004\n\t\t\t\t}]\n\t\t\t},\n\t\t\t\"continent\": {\n\t\t\t\t\"name\": \"大洲\",\n\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\"mainkey\": 10002,\n\t\t\t\t\t\"subkey\": [20]\n\t\t\t\t}]\n\t\t\t},\n\t\t\t\"country\": {\n\t\t\t\t\"name\": \"国家\",\n\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\"mainkey\": 10002,\n\t\t\t\t\t\"subkey\": [18, 19, 29]\n\t\t\t\t}]\n\t\t\t},\n\t\t\t\"province\": {\n\t\t\t\t\"name\": \"省/直辖市/自治区/特别行政区\",\n\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\"mainkey\": 10002,\n\t\t\t\t\t\"subkey\": [22, 26, 33]\n\t\t\t\t}]\n\t\t\t},\n\t\t\t\"city\": {\n\t\t\t\t\"name\": \"城市\",\n\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\"mainkey\": 10002,\n\t\t\t\t\t\"subkey\": [1, 2, 3, 4, 5, 7, 24, 25, 27, 30, 31, 32, 34, 35]\n\t\t\t\t}]\n\t\t\t},\n\t\t\t\"district\": {\n\t\t\t\t\"name\": \"区县\",\n\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\"mainkey\": 10002,\n\t\t\t\t\t\"subkey\": [6, 8, 37]\n\t\t\t\t}]\n\t\t\t},\n\t\t\t\"town\": {\n\t\t\t\t\"name\": \"乡镇\",\n\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\"mainkey\": 10002,\n\t\t\t\t\t\"subkey\": [9]\n\t\t\t\t}]\n\t\t\t},\n\t\t\t\"village\": {\n\t\t\t\t\"name\": \"村庄\",\n\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\"mainkey\": 10002,\n\t\t\t\t\t\"subkey\": [17]\n\t\t\t\t}]\n\t\t\t}\n\t\t}\n\t},\n\t\"borders\": {\n\t\t\"name\": \"行政区边界\",\n\t\t\"subType\": {\n\t\t\t\"China\": {\n\t\t\t\t\"name\": \"中国国界\",\n\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\"mainkey\": 20016,\n\t\t\t\t\t\"subkey\": [1, 2, 9]\n\t\t\t\t}]\n\t\t\t},\n\t\t\t\"foreign\": {\n\t\t\t\t\"name\": \"外国国界/停火线/主张线\",\n\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\"mainkey\": 20016,\n\t\t\t\t\t\"subkey\": [3, 4, 8, 10, 11]\n\t\t\t\t}]\n\t\t\t},\n\t\t\t\"provincial\": {\n\t\t\t\t\"name\": \"省界线\",\n\t\t\t\t\"styleMap\": [{\n\t\t\t\t\t\"mainkey\": 20016,\n\t\t\t\t\t\"subkey\": [5, 6, 7, 12]\n\t\t\t\t}]\n\t\t\t}\n\t\t}\n\t}\n}]");
            if (jSONArray3.length() == 0) {
                return this.f2361a;
            }
            int i3 = 0;
            JSONObject jSONObjectOptJSONObject2 = jSONArray3.optJSONObject(0);
            if (jSONObjectOptJSONObject2 == null) {
                return this.f2361a;
            }
            JSONArray jSONArrayNames = jSONObjectOptJSONObject2.names();
            int length = jSONArrayNames.length();
            int i4 = 0;
            while (i4 < length) {
                String strOptString = jSONArrayNames.optString(i4);
                JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject2.optJSONObject(strOptString);
                if (jSONObjectOptJSONObject3 != null) {
                    String strOptString2 = jSONObjectOptJSONObject3.optString("name");
                    if (jSONObjectOptJSONObject3.has(str3)) {
                        a(jSONObjectOptJSONObject3.optJSONArray(str3), strOptString, (String) null, strOptString2, this.f2361a);
                    } else if (jSONObjectOptJSONObject3.has(str4)) {
                        JSONObject jSONObjectOptJSONObject4 = jSONObjectOptJSONObject3.optJSONObject(str4);
                        if (jSONObjectOptJSONObject4 != null) {
                            JSONArray jSONArrayNames2 = jSONObjectOptJSONObject4.names();
                            int length2 = jSONArrayNames2.length();
                            int i5 = i3;
                            while (i5 < length2) {
                                String strOptString3 = jSONArrayNames2.optString(i5);
                                JSONObject jSONObjectOptJSONObject5 = jSONObjectOptJSONObject4.optJSONObject(strOptString3);
                                if (jSONObjectOptJSONObject5 != null) {
                                    jSONObject2 = jSONObjectOptJSONObject2;
                                    String strOptString4 = jSONObjectOptJSONObject5.optString("name");
                                    jSONArray2 = jSONArrayNames;
                                    if (jSONObjectOptJSONObject5.has(str3)) {
                                        i2 = length;
                                        a(jSONObjectOptJSONObject5.optJSONArray(str3), strOptString, strOptString3, strOptString2 + Constants.LINK + strOptString4, this.f2361a);
                                    } else {
                                        i2 = length;
                                        if (jSONObjectOptJSONObject5.has(str4) && (jSONObjectOptJSONObject = jSONObjectOptJSONObject5.optJSONObject(str4)) != null) {
                                            JSONArray jSONArrayNames3 = jSONObjectOptJSONObject.names();
                                            str4 = str4;
                                            int length3 = jSONArrayNames3.length();
                                            int i6 = 0;
                                            while (i6 < length3) {
                                                int i7 = length3;
                                                String strOptString5 = jSONArrayNames3.optString(i6);
                                                JSONArray jSONArray4 = jSONArrayNames3;
                                                JSONObject jSONObjectOptJSONObject6 = jSONObjectOptJSONObject.optJSONObject(strOptString5);
                                                if (jSONObjectOptJSONObject6 != null) {
                                                    jSONObject3 = jSONObjectOptJSONObject;
                                                    String strOptString6 = jSONObjectOptJSONObject6.optString("name");
                                                    if (jSONObjectOptJSONObject6.has(str3)) {
                                                        a(jSONObjectOptJSONObject6.optJSONArray(str3), strOptString, strOptString3 + Constants.LINK + strOptString5, strOptString2 + Constants.LINK + strOptString4 + Constants.LINK + strOptString6, this.f2361a);
                                                    }
                                                } else {
                                                    jSONObject3 = jSONObjectOptJSONObject;
                                                }
                                                i6++;
                                                length3 = i7;
                                                jSONArrayNames3 = jSONArray4;
                                                jSONObjectOptJSONObject = jSONObject3;
                                                str3 = str3;
                                            }
                                            str3 = str3;
                                        }
                                        i5++;
                                        jSONObjectOptJSONObject2 = jSONObject2;
                                        length = i2;
                                        jSONArrayNames = jSONArray2;
                                        str4 = str4;
                                        jSONObjectOptJSONObject4 = jSONObjectOptJSONObject4;
                                        str3 = str3;
                                    }
                                } else {
                                    jSONObject2 = jSONObjectOptJSONObject2;
                                    jSONArray2 = jSONArrayNames;
                                    i2 = length;
                                }
                                i5++;
                                jSONObjectOptJSONObject2 = jSONObject2;
                                length = i2;
                                jSONArrayNames = jSONArray2;
                                str4 = str4;
                                jSONObjectOptJSONObject4 = jSONObjectOptJSONObject4;
                                str3 = str3;
                            }
                        } else {
                            str = str3;
                            str2 = str4;
                            jSONObject = jSONObjectOptJSONObject2;
                            jSONArray = jSONArrayNames;
                            i = length;
                        }
                    }
                    str = str3;
                    str2 = str4;
                    jSONObject = jSONObjectOptJSONObject2;
                    jSONArray = jSONArrayNames;
                    i = length;
                    this.f2361a.add(new cz(com.huawei.operation.utils.Constants.UPDATE_CUSTOM_TITLE_BAR_VISIBILITY, d, "roads", "trafficRoadBackgroundColor", null));
                } else {
                    str = str3;
                    str2 = str4;
                    jSONObject = jSONObjectOptJSONObject2;
                    jSONArray = jSONArrayNames;
                    i = length;
                }
                i4++;
                jSONObjectOptJSONObject2 = jSONObject;
                length = i;
                jSONArrayNames = jSONArray;
                str4 = str2;
                str3 = str;
                i3 = 0;
            }
            return this.f2361a;
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    private static void a(JSONArray jSONArray, String str, String str2, String str3, List<cz> list) {
        int[] iArr;
        if (jSONArray == null) {
            return;
        }
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
            if (jSONObjectOptJSONObject != null) {
                int iOptInt = jSONObjectOptJSONObject.optInt("mainkey");
                int[] iArr2 = new int[0];
                JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("subkey");
                if (jSONArrayOptJSONArray != null) {
                    int length2 = jSONArrayOptJSONArray.length();
                    int[] iArr3 = new int[length2];
                    for (int i2 = 0; i2 < length2; i2++) {
                        iArr3[i2] = jSONArrayOptJSONArray.optInt(i2);
                    }
                    iArr = iArr3;
                } else {
                    iArr = iArr2;
                }
                list.add(new cz(iOptInt, iArr, str, str2, str3));
            }
        }
    }

    private List<cz> a(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        for (cz czVar : this.f2361a) {
            if (czVar != null) {
                if (czVar.e != null && czVar.e.equals(str2)) {
                    arrayList.add(czVar);
                } else if (czVar.e != null && czVar.e.equals(str) && czVar.f != null && czVar.f.contains(str2)) {
                    arrayList.add(czVar);
                }
            }
        }
        return arrayList;
    }

    private void a(String str, String str2, Map<Integer, StyleItem> map, JSONObject jSONObject, boolean z) throws JSONException {
        if (jSONObject == null) {
            return;
        }
        if (this.f2361a == null) {
            this.f2361a = b();
        }
        List<cz> listA = a(str, str2);
        for (cz czVar : listA) {
            if (czVar == null || czVar.f2342c == -1000) {
                return;
            }
            int i = czVar.d;
            if (!jSONObject.optBoolean("visible", true)) {
                StyleElement styleElementA = a(map, i, db.a("visible"), czVar);
                styleElementA.textureId = -1;
                styleElementA.visible = 0;
            } else {
                if (!jSONObject.optBoolean("showIcon", true)) {
                    a(map, i, db.a("textFillColor"), czVar).textureId = -1;
                }
                if (!jSONObject.optBoolean("showLabel", true)) {
                    a(map, i, db.a("textFillColor"), czVar).opacity = 0.0f;
                    StyleElement styleElementA2 = a(map, i, db.a("textStrokeColor"), czVar);
                    styleElementA2.opacity = 0.0f;
                    styleElementA2.visible = 0;
                    styleElementA2.textureId = -1;
                }
                a(map, jSONObject, "color", "opacity", i, czVar);
                a(map, jSONObject, "fillColor", "fillOpacity", i, czVar);
                a(map, jSONObject, "strokeColor", "strokeOpacity", i, czVar);
                a(map, jSONObject, "textFillColor", "textFillOpacity", i, czVar);
                a(map, jSONObject, "textStrokeColor", "textStrokeOpacity", i, czVar);
                a(map, jSONObject, TtmlNode.ATTR_TTS_BACKGROUND_COLOR, "backgroundOpacity", i, czVar);
                if (z) {
                    a(map, jSONObject, "textureName", i, czVar);
                }
            }
        }
        listA.clear();
    }

    private static void a(Map<Integer, StyleItem> map, JSONObject jSONObject, String str, String str2, int i, cz czVar) {
        int iA;
        float fOptDouble;
        try {
            String strOptString = jSONObject.optString(str, null);
            if (TextUtils.isEmpty(strOptString)) {
                fOptDouble = (float) jSONObject.optDouble(str2, 1.0d);
                iA = 0;
            } else {
                iA = a("#".concat(String.valueOf(strOptString)));
                fOptDouble = 1.0f;
            }
            if (iA == 0 && fOptDouble == 1.0d) {
                return;
            }
            int iA2 = db.a(str);
            StyleElement styleElementA = a(map, i, iA2, czVar);
            styleElementA.value = iA;
            styleElementA.opacity = fOptDouble;
            if (czVar.f != null && czVar.f.equals("China")) {
                a(map, i, iA2, czVar).opacity = 0.0f;
                return;
            }
            if (czVar.e != null && czVar.e.equals("water") && iA2 == 3) {
                StyleElement styleElementA2 = a(map, i, 2, czVar);
                styleElementA2.value = iA;
                styleElementA2.opacity = fOptDouble;
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private static void a(Map<Integer, StyleItem> map, JSONObject jSONObject, String str, int i, cz czVar) {
        try {
            int iOptInt = jSONObject.optInt(str, 0);
            if (iOptInt == 0) {
                return;
            }
            a(map, i, db.a(str), czVar).textureId = iOptInt;
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static da a(byte[] bArr) {
        da daVar;
        try {
            daVar = new da();
            try {
                byte[] bytes = CmcdData.Factory.STREAM_TYPE_LIVE.getBytes("utf-8");
                int length = bArr.length;
                int length2 = bytes.length;
                for (int i = 0; i < length; i++) {
                    bArr[i] = (byte) (bArr[i] ^ bytes[i % length2]);
                }
                daVar.a(Convert.getString(bArr, 0, 4));
                daVar.b(Convert.getString(bArr, 4, 32));
                daVar.c(Convert.getString(bArr, 36, 10));
                daVar.d(a(Convert.getSubBytes(bArr, 78, length - 78), Convert.getSubBytes(bArr, 46, 16), Convert.getSubBytes(bArr, 62, 16)));
                return daVar;
            } catch (Throwable th) {
                th = th;
                th.printStackTrace();
                return daVar;
            }
        } catch (Throwable th2) {
            th = th2;
            daVar = null;
        }
    }

    private static String a(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        try {
            IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr3);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, "AES");
            Cipher cipher = Cipher.getInstance("AES/CBC/NoPadding");
            cipher.init(2, secretKeySpec, ivParameterSpec);
            return new String(cipher.doFinal(bArr), "utf-8");
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    private boolean a(Map<Integer, StyleItem> map, byte[] bArr) {
        String[] strArrA;
        int iA;
        int iA2;
        try {
            JSONArray jSONArray = new JSONArray(new String(bArr, "UTF-8"));
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                String strOptString = jSONObjectOptJSONObject.optString("featureType");
                if (!TextUtils.isEmpty(strOptString)) {
                    if (WatchFaceProvider.BACKGROUND_LABEL.equals(strOptString)) {
                        JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("stylers");
                        if (jSONObjectOptJSONObject2 != null && (iA2 = a(jSONObjectOptJSONObject2.optString("color"))) != 0) {
                            this.f2362b = iA2;
                        }
                    } else {
                        String strB = dc.b(strOptString);
                        if (strB != null && (strArrA = dc.a(strOptString)) != null && strArrA.length != 0) {
                            String strOptString2 = jSONObjectOptJSONObject.optString("elementType");
                            if (!TextUtils.isEmpty(strOptString2) && (iA = db.a(strOptString2)) != -1) {
                                a(map, jSONObjectOptJSONObject, strB, strArrA, iA);
                            }
                        }
                    }
                }
            }
            return true;
        } catch (JSONException unused) {
            return false;
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    private void a(Map<Integer, StyleItem> map, JSONObject jSONObject, String str, String[] strArr, int i) throws JSONException {
        for (String str2 : strArr) {
            if (this.f2361a == null) {
                this.f2361a = b();
            }
            for (cz czVar : a(str, str2)) {
                a(map, jSONObject, czVar.d, i, czVar);
            }
        }
    }

    private static void a(Map<Integer, StyleItem> map, JSONObject jSONObject, int i, int i2, cz czVar) throws JSONException {
        int iA;
        StyleElement styleElementA = a(map, i, i2, czVar);
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("stylers");
        if (jSONObjectOptJSONObject == null || (iA = a(jSONObjectOptJSONObject.optString("color"))) == 0) {
            return;
        }
        styleElementA.value = iA;
        styleElementA.textureId = jSONObjectOptJSONObject.optInt("textureName", 0);
        styleElementA.lineWidth = jSONObjectOptJSONObject.optInt("lineWidth", 0);
        if (i >= 30 && i <= 38) {
            a(map, i, 4, czVar).opacity = 0.1f;
        } else if (czVar.e != null && czVar.e.equals("water") && i2 == 3) {
            a(map, i, 2, czVar).value = iA;
        }
    }

    private static StyleElement a(Map<Integer, StyleItem> map, int i, int i2, cz czVar) {
        StyleItem styleItem = map.get(Integer.valueOf(i));
        if (styleItem == null) {
            styleItem = new StyleItem(czVar.f2342c);
            styleItem.mainKey = czVar.f2340a;
            styleItem.subKey = czVar.f2341b;
            map.put(Integer.valueOf(i), styleItem);
        }
        StyleElement styleElement = styleItem.get(i2);
        if (styleElement != null) {
            return styleElement;
        }
        StyleElement styleElement2 = new StyleElement();
        styleElement2.styleElementType = i2;
        styleItem.put(i2, styleElement2);
        return styleElement2;
    }

    public static int a(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        try {
            if (!str.startsWith("#")) {
                str = "#".concat(String.valueOf(str));
            }
            return Color.parseColor(str);
        } catch (Throwable th) {
            th.printStackTrace();
            return 0;
        }
    }

    public final int a() {
        return this.f2362b;
    }
}
