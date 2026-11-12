package com.huami.midong.webview.nativejsapi.jsshare;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.huami.midong.webview.jsbridge.JsBridgeError;
import com.huami.watch.util.Log;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class JSShareCreator {
    private static final int CAPTURE_INVALID = -1;
    private static final int CAPTURE_LONG_SCREEN = 2;
    private static final int CAPTURE_NULL = 0;
    private static final int CAPTURE_SCREEN = 1;
    public static final String ITEM_NAME_DEFAULT = "default";
    public static final String ITEM_NAME_FACEBOOK = "facebook";
    public static final String ITEM_NAME_LINE = "line";
    public static final String ITEM_NAME_MIFITZONE = "mifitZone";
    public static final String ITEM_NAME_MITALK = "miTalk";
    public static final String ITEM_NAME_MONENTS = "moments";
    public static final String ITEM_NAME_QQ = "qq";
    public static final String ITEM_NAME_QZONE = "qzone";
    public static final String ITEM_NAME_TWITTER = "twitter";
    public static final String ITEM_NAME_WECHAT = "weChat";
    public static final String ITEM_NAME_WEIBO = "weibo";
    private static final String NODE_ESPECIAL = "especial";
    private static final String NODE_GLOBAL = "global";
    public static final String SHARE_AS_CARD = "card";
    public static final String SHARE_AS_IMAGE = "image";
    public static final String SHARE_AS_MIX = "mix";
    public static final String SHARE_AS_TEXT = "text";
    private static final String TAG = "JsBridgeShareCreator";
    private static Map<String, String[]> supportTypeMap;

    public static class Content {

        @SerializedName("default")
        private JSShareItem defaultShareItem;
        public JsBridgeError error;

        @SerializedName("facebook")
        private JSShareItem facebook;

        @SerializedName("line")
        private JSShareItem line;

        @SerializedName(JSShareCreator.ITEM_NAME_MITALK)
        private JSShareItem miTalk;

        @SerializedName(JSShareCreator.ITEM_NAME_MIFITZONE)
        private JSShareItem mifitZone;

        @SerializedName("moments")
        private JSShareItem moments;

        @SerializedName("qq")
        private JSShareItem qq;

        @SerializedName("qzone")
        private JSShareItem qzone;
        public Map<String, JSShareItem> shareItems;

        @SerializedName("twitter")
        private JSShareItem twitter;

        @SerializedName(JSShareCreator.ITEM_NAME_WECHAT)
        private JSShareItem weChat;

        @SerializedName("weibo")
        private JSShareItem weibo;

        /* JADX INFO: Access modifiers changed from: private */
        public void bindShareChannels() {
            HashMap map = new HashMap();
            this.shareItems = map;
            map.put("default", this.defaultShareItem);
            this.shareItems.put("weibo", this.weibo);
            this.shareItems.put(JSShareCreator.ITEM_NAME_WECHAT, this.weChat);
            this.shareItems.put("moments", this.moments);
            this.shareItems.put("qq", this.qq);
            this.shareItems.put("qzone", this.qzone);
        }

        public JSShareItem getDefaultShareItem() {
            JSShareItem jSShareItem = this.defaultShareItem;
            if (jSShareItem != null) {
                jSShareItem.setItemName("default");
            }
            return this.defaultShareItem;
        }

        public JSShareItem getFacebook() {
            JSShareItem jSShareItem = this.facebook;
            if (jSShareItem != null) {
                jSShareItem.setItemName("facebook");
            }
            return this.facebook;
        }

        public JSShareItem getLine() {
            JSShareItem jSShareItem = this.line;
            if (jSShareItem != null) {
                jSShareItem.setItemName("line");
            }
            return this.line;
        }

        public JSShareItem getMiTalk() {
            JSShareItem jSShareItem = this.miTalk;
            if (jSShareItem != null) {
                jSShareItem.setItemName(JSShareCreator.ITEM_NAME_MITALK);
            }
            return this.miTalk;
        }

        public JSShareItem getMifitZone() {
            JSShareItem jSShareItem = this.mifitZone;
            if (jSShareItem != null) {
                jSShareItem.setItemName(JSShareCreator.ITEM_NAME_MIFITZONE);
            }
            return this.mifitZone;
        }

        public JSShareItem getMoments() {
            JSShareItem jSShareItem = this.moments;
            if (jSShareItem != null) {
                jSShareItem.setItemName("moments");
            }
            return this.moments;
        }

        public JSShareItem getQq() {
            JSShareItem jSShareItem = this.qq;
            if (jSShareItem != null) {
                jSShareItem.setItemName("qq");
            }
            return this.qq;
        }

        public JSShareItem getQzone() {
            JSShareItem jSShareItem = this.qzone;
            if (jSShareItem != null) {
                jSShareItem.setItemName("qzone");
            }
            return this.qzone;
        }

        public JSShareItem getTwitter() {
            JSShareItem jSShareItem = this.twitter;
            if (jSShareItem != null) {
                jSShareItem.setItemName("twitter");
            }
            return this.twitter;
        }

        public JSShareItem getWeChat() {
            JSShareItem jSShareItem = this.weChat;
            if (jSShareItem != null) {
                jSShareItem.setItemName(JSShareCreator.ITEM_NAME_WECHAT);
            }
            return this.weChat;
        }

        public JSShareItem getWeibo() {
            JSShareItem jSShareItem = this.weibo;
            if (jSShareItem != null) {
                jSShareItem.setItemName("weibo");
            }
            return this.weibo;
        }

        public void setDefaultShareItem(String str, String str2, String str3, String str4) {
            JSShareItem jSShareItem = new JSShareItem();
            this.defaultShareItem = jSShareItem;
            jSShareItem.setType(str);
            this.defaultShareItem.setTitle(str2);
            this.defaultShareItem.setDesc(str3);
            this.defaultShareItem.setLink(str4);
            this.defaultShareItem.capture = 1;
        }
    }

    public static class JSShareItem {

        @SerializedName("capture")
        private int capture = -1;

        @SerializedName("desc")
        private String desc;

        @SerializedName("imgUrl")
        private String imgUrl;
        private String itemName;

        @SerializedName("link")
        private String link;

        @SerializedName("title")
        private String title;

        @SerializedName("type")
        private String type;

        public boolean defaultItem() {
            return "default".equals(this.itemName);
        }

        public String getDesc() {
            return this.desc;
        }

        public String getImageUrl() {
            return this.imgUrl;
        }

        public String getItemName() {
            return this.itemName;
        }

        public String getLink() {
            return this.link;
        }

        public String getTitle() {
            return this.title;
        }

        public String getType() {
            return this.type;
        }

        public boolean isCapture() {
            return this.capture > 0;
        }

        public boolean isCaptureLongScreen() {
            return this.capture == 2;
        }

        public void setDesc(String str) {
            this.desc = str;
        }

        public void setImageUrl(String str) {
            this.imgUrl = str;
        }

        public void setItemName(String str) {
            this.itemName = str;
        }

        public void setLink(String str) {
            this.link = str;
        }

        public void setTitle(String str) {
            this.title = str;
        }

        public void setType(String str) {
            this.type = str;
        }

        public String toString() {
            return new Gson().toJson(this);
        }
    }

    static {
        HashMap map = new HashMap();
        supportTypeMap = map;
        map.put("default", new String[]{"card", "image", "text", "mix"});
        supportTypeMap.put("weibo", new String[]{"card", "image", "text", "mix"});
        supportTypeMap.put("qq", new String[]{"card", "image", "text", "mix"});
        supportTypeMap.put("moments", new String[]{"card", "image"});
        supportTypeMap.put(ITEM_NAME_WECHAT, new String[]{"card", "image"});
        supportTypeMap.put("qzone", new String[]{"card"});
    }

    public static boolean isValidUrl(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return Pattern.compile("^(http|https)\\://([a-zA-Z0-9\\.\\-]+(\\:[a-zA-Z0-9\\.&%\\$\\-]+)*@)?((25[0-5]|2[0-4][0-9]|[0-1]{1}[0-9]{2}|[1-9]{1}[0-9]{1}|[1-9])\\.(25[0-5]|2[0-4][0-9]|[0-1]{1}[0-9]{2}|[1-9]{1}[0-9]{1}|[1-9]|0)\\.(25[0-5]|2[0-4][0-9]|[0-1]{1}[0-9]{2}|[1-9]{1}[0-9]{1}|[1-9]|0)\\.(25[0-5]|2[0-4][0-9]|[0-1]{1}[0-9]{2}|[1-9]{1}[0-9]{1}|[0-9])|([a-zA-Z0-9\\-]+\\.)*[a-zA-Z0-9\\-]+\\.[a-zA-Z]{2,4})(\\:[0-9]+)?(/[^/][a-zA-Z0-9\\.\\,\\?\\'\\\\/\\+&%\\$\\=~_\\-@]*)*$").matcher(str).matches();
    }

    public static Content parseShareContent(String str) {
        boolean z;
        JSONObject jSONObjectOptJSONObject;
        try {
            JSONObject jSONObject = new JSONObject(str);
            Content content = jSONObject.has(NODE_ESPECIAL) ? (Content) new Gson().fromJson(jSONObject.optJSONObject(NODE_ESPECIAL).toString(), Content.class) : null;
            if (content == null) {
                content = new Content();
            }
            if (jSONObject.has(NODE_GLOBAL) && (jSONObjectOptJSONObject = jSONObject.optJSONObject(NODE_GLOBAL)) != null && jSONObjectOptJSONObject.has("type")) {
                content.defaultShareItem = (JSShareItem) new Gson().fromJson(jSONObjectOptJSONObject.toString(), JSShareItem.class);
            }
            if (content.defaultShareItem == null) {
                content.error = new JsBridgeError(4020501L, new String[0]);
                return content;
            }
            content.bindShareChannels();
            for (String str2 : content.shareItems.keySet()) {
                JSShareItem jSShareItem = content.shareItems.get(str2);
                if (jSShareItem == null) {
                    jSShareItem = content.shareItems.get("default");
                }
                if (!TextUtils.isEmpty(jSShareItem.type) && jSShareItem.capture != -1) {
                    if (jSShareItem.capture >= 0 && jSShareItem.capture <= 2) {
                        if (!TextUtils.isEmpty(jSShareItem.imgUrl) && !isValidUrl(jSShareItem.imgUrl)) {
                            content.error = new JsBridgeError(4010401L, jSShareItem.imgUrl);
                            return content;
                        }
                        if (jSShareItem.isCapture() && !TextUtils.isEmpty(jSShareItem.imgUrl)) {
                            content.error = new JsBridgeError(4010501L, String.valueOf(jSShareItem.capture));
                            return content;
                        }
                        String[] strArr = supportTypeMap.get(str2);
                        int length = strArr.length;
                        int i = 0;
                        while (true) {
                            if (i >= length) {
                                z = false;
                                break;
                            }
                            if (strArr[i].equals(jSShareItem.type)) {
                                z = true;
                                break;
                            }
                            i++;
                        }
                        if (!z) {
                            content.error = new JsBridgeError(4010502L, str2, jSShareItem.type);
                            return content;
                        }
                        boolean z2 = !TextUtils.isEmpty(jSShareItem.title);
                        boolean z3 = !TextUtils.isEmpty(jSShareItem.desc);
                        boolean z4 = !TextUtils.isEmpty(jSShareItem.link);
                        boolean z5 = !TextUtils.isEmpty(jSShareItem.imgUrl) || jSShareItem.isCapture();
                        String str3 = "imgUrl";
                        String str4 = "link";
                        String str5 = "";
                        if ("card".equals(jSShareItem.type)) {
                            if (!z2) {
                                str3 = "title";
                            } else if (!z3) {
                                str3 = "desc";
                            } else if (!z4) {
                                str3 = str4;
                            } else if (z5) {
                                str3 = str5;
                            }
                        } else if ("image".equals(jSShareItem.type)) {
                            if (z5) {
                                str3 = str5;
                            }
                        } else if ("text".equals(jSShareItem.type)) {
                            if (!z2 && !z3) {
                                str5 = "title or desc";
                            }
                            str3 = str5;
                        } else if ("mix".equals(jSShareItem.type)) {
                            if (!z2 && !z3) {
                                str4 = "title or desc";
                            } else if (z4) {
                                str4 = "";
                            }
                            str3 = str4;
                        } else {
                            str3 = null;
                        }
                        if (!TextUtils.isEmpty(str3)) {
                            content.error = new JsBridgeError(4010503L, jSShareItem.type, str3);
                            return content;
                        }
                    }
                    content.error = new JsBridgeError(4040502L, new String[0]);
                    return content;
                }
                content.error = new JsBridgeError(4020502L, new String[0]);
                return content;
            }
            return content;
        } catch (Exception e) {
            Content content2 = new Content();
            content2.error = JsBridgeError.jsonParseError();
            Log.e(TAG, e.getMessage(), e, new Object[0]);
            return content2;
        }
    }
}
