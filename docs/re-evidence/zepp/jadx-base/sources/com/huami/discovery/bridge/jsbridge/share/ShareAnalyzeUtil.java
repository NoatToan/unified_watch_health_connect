package com.huami.discovery.bridge.jsbridge.share;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.huami.discovery.bridge.jsbridge.JsBridgeError;
import com.huami.discovery.bridge.jsbridge.util.IOUtil;
import com.huami.tools.log.HMLog;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public class ShareAnalyzeUtil {
    public static final String SHARE_AS_CARD = "card";
    private static final String a = "JsBridgeNativeAPI";
    private static final String b = "global";
    private static final String c = "especial";
    private static final String d = "shareChannel";
    private static final int e = -1;
    private static final int f = 0;
    private static final int g = 1;
    private static final int h = 2;
    private static final String i = "default";
    private static final String j = "weibo";
    private static final String k = "moments";
    private static final String l = "weChat";
    private static final String m = "qq";
    private static final String n = "qzone";
    private static final String o = "miTalk";
    private static final String p = "facebook";
    private static final String q = "twitter";
    private static final String r = "line";
    private static final String s = "mifitZone";
    private static final String t = "save";
    private static final String u = "image";
    private static final String v = "text";
    private static final String w = "mix";
    private static Map<String, String[]> x;

    public static class JSShareItem {

        @SerializedName("type")
        private String a;

        @SerializedName("title")
        private String b;

        @SerializedName("link")
        private String c;

        @SerializedName("imgUrl")
        private String d;

        @SerializedName("desc")
        private String e;
        private String f;

        @SerializedName("capture")
        private int g = -1;

        public String getDesc() {
            return this.e;
        }

        public String getImageUrl() {
            return this.d;
        }

        public String getItemName() {
            return this.f;
        }

        public String getLink() {
            return this.c;
        }

        public String getTitle() {
            return this.b;
        }

        public String getType() {
            return this.a;
        }

        public boolean isCapture() {
            return this.g > 0;
        }

        public boolean isCaptureLongScreen() {
            return false;
        }

        public void setDesc(String str) {
            this.e = str;
        }

        public void setImageUrl(String str) {
            this.d = str;
        }

        public void setItemName(String str) {
            this.f = str;
        }

        public void setLink(String str) {
            this.c = str;
        }

        public void setTitle(String str) {
            this.b = str;
        }

        public void setType(String str) {
            this.a = str;
        }

        public String toString() {
            return "JSShareItem{ type:" + this.a + ", title:" + this.b + ", link:" + this.c + ", imgUrl:" + this.d + ", desc:" + this.e + ", capture:" + this.g + " }";
        }
    }

    public static class JSShareStruct {
        public Map<String, JSShareItem> a;

        @SerializedName("default")
        private JSShareItem b;

        @SerializedName("weibo")
        private JSShareItem c;

        @SerializedName("moments")
        private JSShareItem d;

        @SerializedName("weChat")
        private JSShareItem e;

        @SerializedName("qq")
        private JSShareItem f;

        @SerializedName("qzone")
        private JSShareItem g;

        @SerializedName("miTalk")
        private JSShareItem h;

        @SerializedName("facebook")
        private JSShareItem i;

        @SerializedName("twitter")
        private JSShareItem j;
        public JsBridgeError jsBridgeError;

        @SerializedName("line")
        private JSShareItem k;

        @SerializedName("mifitZone")
        private JSShareItem l;

        @SerializedName("save")
        private JSShareItem m;
        private int[] n;

        /* JADX INFO: Access modifiers changed from: private */
        public void h() {
            HashMap map = new HashMap();
            this.a = map;
            map.put("default", this.b);
            this.a.put("weibo", this.c);
            this.a.put("weChat", this.e);
            this.a.put("moments", this.d);
            this.a.put("qq", this.f);
            this.a.put("qzone", this.g);
            this.a.put("mifitZone", this.l);
            this.a.put("save", this.m);
        }

        private JSShareItem i() {
            JSShareItem jSShareItem = this.i;
            if (jSShareItem != null) {
                jSShareItem.setItemName("facebook");
            }
            return this.i;
        }

        private JSShareItem j() {
            JSShareItem jSShareItem = this.k;
            if (jSShareItem != null) {
                jSShareItem.setItemName("line");
            }
            return this.k;
        }

        private JSShareItem k() {
            JSShareItem defaultShareItem = getDefaultShareItem();
            defaultShareItem.g = 1;
            return defaultShareItem;
        }

        private JSShareItem l() {
            JSShareItem jSShareItem = this.h;
            if (jSShareItem != null) {
                jSShareItem.setItemName("miTalk");
            }
            return this.h;
        }

        private JSShareItem m() {
            JSShareItem jSShareItem = this.l;
            if (jSShareItem != null) {
                jSShareItem.setItemName("mifitZone");
            }
            return this.l;
        }

        private JSShareItem n() {
            JSShareItem jSShareItem = this.d;
            if (jSShareItem != null) {
                jSShareItem.setItemName("moments");
            }
            return this.d;
        }

        private JSShareItem o() {
            JSShareItem jSShareItem = this.f;
            if (jSShareItem != null) {
                jSShareItem.setItemName("qq");
            }
            return this.f;
        }

        private JSShareItem p() {
            JSShareItem jSShareItem = this.m;
            if (jSShareItem != null) {
                jSShareItem.setItemName("save");
            }
            return this.m;
        }

        private JSShareItem q() {
            JSShareItem jSShareItem = this.j;
            if (jSShareItem != null) {
                jSShareItem.setItemName("twitter");
            }
            return this.j;
        }

        private JSShareItem r() {
            JSShareItem jSShareItem = this.e;
            if (jSShareItem != null) {
                jSShareItem.setItemName("weChat");
            }
            return this.e;
        }

        private JSShareItem s() {
            JSShareItem jSShareItem = this.c;
            if (jSShareItem != null) {
                jSShareItem.setItemName("weibo");
            }
            return this.c;
        }

        public JSShareItem getDefaultShareItem() {
            JSShareItem jSShareItem = this.b;
            if (jSShareItem != null) {
                jSShareItem.setItemName("default");
            }
            return this.b;
        }

        public JSShareItem getJsShareItemByShareTo(int i) {
            JSShareItem jSShareItemR;
            switch (i) {
                case 1:
                    jSShareItemR = r();
                    break;
                case 2:
                    jSShareItemR = n();
                    break;
                case 3:
                case 10:
                case 11:
                case 12:
                    jSShareItemR = l();
                    break;
                case 4:
                    jSShareItemR = s();
                    break;
                case 5:
                    jSShareItemR = getQzoneShareItem();
                    break;
                case 6:
                    jSShareItemR = o();
                    break;
                case 7:
                    jSShareItemR = j();
                    break;
                case 8:
                    jSShareItemR = i();
                    break;
                case 9:
                    jSShareItemR = q();
                    break;
                case 13:
                    jSShareItemR = p();
                    break;
                case 14:
                    jSShareItemR = m();
                    break;
                default:
                    jSShareItemR = getDefaultShareItem();
                    break;
            }
            return jSShareItemR == null ? getDefaultShareItem() : jSShareItemR;
        }

        public JSShareItem getQzoneShareItem() {
            JSShareItem jSShareItem = this.g;
            if (jSShareItem != null) {
                jSShareItem.setItemName("qzone");
            }
            return this.g;
        }

        public int[] getShareTypeItems() {
            return this.n;
        }

        public void setDefaultShareItem(String str, String str2, String str3, String str4) {
            JSShareItem jSShareItem = new JSShareItem();
            this.b = jSShareItem;
            jSShareItem.setType(str);
            this.b.setTitle(str2);
            this.b.setDesc(str3);
            this.b.setLink(str4);
            this.b.g = 1;
        }
    }

    static {
        HashMap map = new HashMap();
        x = map;
        map.put("default", new String[]{"card", "image", "text", "mix"});
        x.put("weibo", new String[]{"card", "image", "text", "mix"});
        x.put("qq", new String[]{"card", "image", "text", "mix"});
        x.put("moments", new String[]{"card", "image"});
        x.put("weChat", new String[]{"card", "image"});
        x.put("qzone", new String[]{"card"});
        x.put("mifitZone", new String[]{"image"});
        x.put("save", new String[]{"image"});
    }

    private static int[] a(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        int length = jSONArray.length();
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = b(jSONArray.optString(i2));
        }
        return iArr;
    }

    public static JSShareStruct analyzeShareCode(String str) {
        JSShareStruct jSShareStruct;
        boolean z;
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has(c)) {
                HMLog.i(a, "has especial", new Object[0]);
                jSShareStruct = (JSShareStruct) new Gson().fromJson(jSONObject.optJSONObject(c).toString(), JSShareStruct.class);
            } else {
                jSShareStruct = null;
            }
            if (jSShareStruct == null) {
                jSShareStruct = new JSShareStruct();
            }
            if (jSONObject.has(b)) {
                HMLog.i(a, "has global", new Object[0]);
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(b);
                if (jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.has("type")) {
                    jSShareStruct.b = (JSShareItem) new Gson().fromJson(jSONObjectOptJSONObject.toString(), JSShareItem.class);
                    HMLog.i(a, "defaultShareItem =" + jSShareStruct.b, new Object[0]);
                }
            }
            if (jSONObject.has(d)) {
                jSShareStruct.n = a(jSONObject.optJSONArray(d));
            }
            jSShareStruct.h();
            HMLog.i(a, "weiboShareItem =" + jSShareStruct.c, new Object[0]);
            HMLog.i(a, "wechatShareItem =" + jSShareStruct.e, new Object[0]);
            HMLog.i(a, "qzoneShareItem =" + jSShareStruct.g, new Object[0]);
            if (jSShareStruct.b == null) {
                jSShareStruct.jsBridgeError = new JsBridgeError(4020501L, new String[0]);
                return jSShareStruct;
            }
            for (String str2 : jSShareStruct.a.keySet()) {
                JSShareItem jSShareItem = jSShareStruct.a.get(str2);
                String[] strArr = x.get(str2);
                if (jSShareItem == null) {
                    jSShareItem = jSShareStruct.a.get("default");
                    strArr = x.get("default");
                    HMLog.i(a, "key =" + str2 + ",shareItem =" + jSShareItem + ",def =" + jSShareStruct.b, new Object[0]);
                }
                if (!TextUtils.isEmpty(jSShareItem.a) && jSShareItem.g != -1) {
                    if (jSShareItem.g >= 0 && jSShareItem.g <= 2) {
                        if (!TextUtils.isEmpty(jSShareItem.d) && !IOUtil.isValidUrl(jSShareItem.d)) {
                            jSShareStruct.jsBridgeError = new JsBridgeError(4010401L, jSShareItem.d);
                            return jSShareStruct;
                        }
                        if (jSShareItem.isCapture() && !TextUtils.isEmpty(jSShareItem.d)) {
                            jSShareStruct.jsBridgeError = new JsBridgeError(4010501L, String.valueOf(jSShareItem.g));
                            return jSShareStruct;
                        }
                        int length = strArr.length;
                        int i2 = 0;
                        while (true) {
                            if (i2 >= length) {
                                z = false;
                                break;
                            }
                            if (strArr[i2].equals(jSShareItem.a)) {
                                z = true;
                                break;
                            }
                            i2++;
                        }
                        if (!z) {
                            jSShareStruct.jsBridgeError = new JsBridgeError(4010502L, str2, jSShareItem.a);
                            return jSShareStruct;
                        }
                        boolean z2 = !TextUtils.isEmpty(jSShareItem.b);
                        boolean z3 = !TextUtils.isEmpty(jSShareItem.c);
                        boolean z4 = !TextUtils.isEmpty(jSShareItem.d) || jSShareItem.isCapture();
                        String str3 = "imgUrl";
                        String str4 = "link";
                        String str5 = "title";
                        if ("card".equals(jSShareItem.a)) {
                            if (!z2) {
                                str3 = str5;
                            } else if (!z3) {
                                str3 = str4;
                            } else if (z4) {
                                str3 = "";
                            }
                        } else if ("image".equals(jSShareItem.a)) {
                            if (z4) {
                                str3 = "";
                            }
                        } else if ("text".equals(jSShareItem.a)) {
                            if (z2) {
                                str5 = "";
                            }
                            str3 = str5;
                        } else if ("mix".equals(jSShareItem.a)) {
                            if (!z2) {
                                str4 = "title";
                            } else if (z3) {
                                str4 = "";
                            }
                            str3 = str4;
                        } else {
                            str3 = null;
                        }
                        if (!TextUtils.isEmpty(str3)) {
                            jSShareStruct.jsBridgeError = new JsBridgeError(4010503L, jSShareItem.a, str3);
                            return jSShareStruct;
                        }
                    }
                    jSShareStruct.jsBridgeError = new JsBridgeError(4040502L, new String[0]);
                    return jSShareStruct;
                }
                jSShareStruct.jsBridgeError = new JsBridgeError(4020502L, new String[0]);
                return jSShareStruct;
            }
            return jSShareStruct;
        } catch (Exception e2) {
            e2.printStackTrace();
            JSShareStruct jSShareStruct2 = new JSShareStruct();
            jSShareStruct2.jsBridgeError = JsBridgeError.jsonParseError();
            return jSShareStruct2;
        }
    }

    private static int b(String str) {
        str.hashCode();
        switch (str) {
            case "mifitZone":
                return 14;
            case "miTalk":
                return 3;
            case "twitter":
                return 9;
            case "weChat":
                return 1;
            case "qq":
                return 6;
            case "line":
                return 7;
            case "save":
                return 13;
            case "qzone":
                return 5;
            case "weibo":
                return 4;
            case "facebook":
                return 8;
            case "moments":
                return 2;
            default:
                return 0;
        }
    }
}
