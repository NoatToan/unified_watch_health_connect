package com.huawei.hms.push;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.push.utils.DateUtil;
import com.huawei.hms.push.utils.JsonUtil;
import com.huawei.hms.support.api.push.PushException;
import com.huawei.hms.support.log.HMSLog;
import java.io.Serializable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.text.ParseException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes34.dex */
public class RemoteMessage implements Parcelable {
    public static final Parcelable.Creator<RemoteMessage> CREATOR;
    public static final int PRIORITY_HIGH = 1;
    public static final int PRIORITY_NORMAL = 2;
    public static final int PRIORITY_UNKNOWN = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String[] f15847c;
    private static final int[] d;
    private static final long[] e;
    private static final HashMap<String, Object> f;
    private static final HashMap<String, Object> g;
    private static final HashMap<String, Object> h;
    private static final HashMap<String, Object> i;
    private static final HashMap<String, Object> j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Bundle f15848a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Notification f15849b;

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Bundle f15850a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Map<String, String> f15851b;

        public Builder(String str) {
            Bundle bundle = new Bundle();
            this.f15850a = bundle;
            this.f15851b = new HashMap();
            bundle.putString("to", str);
        }

        public Builder addData(String str, String str2) {
            if (str == null) {
                throw new IllegalArgumentException("add data failed, key is null.");
            }
            this.f15851b.put(str, str2);
            return this;
        }

        public RemoteMessage build() {
            Bundle bundle = new Bundle();
            JSONObject jSONObject = new JSONObject();
            try {
                for (Map.Entry<String, String> entry : this.f15851b.entrySet()) {
                    jSONObject.put(entry.getKey(), entry.getValue());
                }
                try {
                    String string = jSONObject.toString();
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put(RemoteMessageConst.COLLAPSE_KEY, this.f15850a.getString(RemoteMessageConst.COLLAPSE_KEY));
                    jSONObject2.put("ttl", this.f15850a.getInt("ttl"));
                    jSONObject2.put(RemoteMessageConst.SEND_MODE, this.f15850a.getInt(RemoteMessageConst.SEND_MODE));
                    jSONObject2.put(RemoteMessageConst.RECEIPT_MODE, this.f15850a.getInt(RemoteMessageConst.RECEIPT_MODE));
                    JSONObject jSONObject3 = new JSONObject();
                    if (jSONObject.length() != 0) {
                        jSONObject3.put("data", string);
                    }
                    jSONObject3.put("msgId", this.f15850a.getString("msgId"));
                    jSONObject2.put("msgContent", jSONObject3);
                    bundle.putByteArray(RemoteMessageConst.MSGBODY, jSONObject2.toString().getBytes(m.f15865a));
                    bundle.putString("to", this.f15850a.getString("to"));
                    bundle.putString(RemoteMessageConst.MSGTYPE, this.f15850a.getString(RemoteMessageConst.MSGTYPE));
                    return new RemoteMessage(bundle);
                } catch (JSONException unused) {
                    HMSLog.w("RemoteMessage", "JSONException: parse message body failed.");
                    throw new PushException(PushException.EXCEPTION_SEND_FAILED);
                }
            } catch (JSONException unused2) {
                HMSLog.w("RemoteMessage", "JSONException: parse data to json failed.");
                throw new PushException(PushException.EXCEPTION_SEND_FAILED);
            }
        }

        public Builder clearData() {
            this.f15851b.clear();
            return this;
        }

        public Builder setCollapseKey(String str) {
            this.f15850a.putString(RemoteMessageConst.COLLAPSE_KEY, str);
            return this;
        }

        public Builder setData(Map<String, String> map) {
            this.f15851b.clear();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                this.f15851b.put(entry.getKey(), entry.getValue());
            }
            return this;
        }

        public Builder setMessageId(String str) {
            this.f15850a.putString("msgId", str);
            return this;
        }

        public Builder setMessageType(String str) {
            this.f15850a.putString(RemoteMessageConst.MSGTYPE, str);
            return this;
        }

        public Builder setReceiptMode(int i) {
            if (i != 1 && i != 0) {
                throw new IllegalArgumentException("receipt mode can only be 0 or 1.");
            }
            this.f15850a.putInt(RemoteMessageConst.RECEIPT_MODE, i);
            return this;
        }

        public Builder setSendMode(int i) {
            if (i != 0 && i != 1) {
                throw new IllegalArgumentException("send mode can only be 0 or 1.");
            }
            this.f15850a.putInt(RemoteMessageConst.SEND_MODE, i);
            return this;
        }

        public Builder setTtl(int i) {
            if (i < 1 || i > 1296000) {
                throw new IllegalArgumentException("ttl must be greater than or equal to 1 and less than or equal to 1296000");
            }
            this.f15850a.putInt("ttl", i);
            return this;
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    @Retention(RetentionPolicy.SOURCE)
    public @interface MessagePriority {
    }

    public static class Notification implements Serializable {
        private final long[] A;
        private final String B;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f15852a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f15853b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String[] f15854c;
        private final String d;
        private final String e;
        private final String[] f;
        private final String g;
        private final String h;
        private final String i;
        private final String j;
        private final String k;
        private final String l;
        private final String m;
        private final Uri n;
        private final int o;
        private final String p;
        private final int q;
        private final int r;
        private final int s;
        private final int[] t;
        private final String u;
        private final int v;
        private final String w;
        private final int x;
        private final String y;
        private final String z;

        /* synthetic */ Notification(Bundle bundle, a aVar) {
            this(bundle);
        }

        private Integer a(String str) {
            if (str == null) {
                return null;
            }
            try {
                return Integer.valueOf(str);
            } catch (NumberFormatException unused) {
                HMSLog.w("RemoteMessage", "NumberFormatException: get " + str + " failed.");
                return null;
            }
        }

        public Integer getBadgeNumber() {
            return a(this.w);
        }

        public String getBody() {
            return this.d;
        }

        public String[] getBodyLocalizationArgs() {
            String[] strArr = this.f;
            return strArr == null ? new String[0] : (String[]) strArr.clone();
        }

        public String getBodyLocalizationKey() {
            return this.e;
        }

        public String getChannelId() {
            return this.m;
        }

        public String getClickAction() {
            return this.k;
        }

        public String getColor() {
            return this.j;
        }

        public String getIcon() {
            return this.g;
        }

        public Uri getImageUrl() {
            String str = this.p;
            if (str == null) {
                return null;
            }
            return Uri.parse(str);
        }

        public Integer getImportance() {
            return a(this.y);
        }

        public String getIntentUri() {
            return this.l;
        }

        public int[] getLightSettings() {
            int[] iArr = this.t;
            return iArr == null ? new int[0] : (int[]) iArr.clone();
        }

        public Uri getLink() {
            return this.n;
        }

        public int getNotifyId() {
            return this.o;
        }

        public String getSound() {
            return this.h;
        }

        public String getTag() {
            return this.i;
        }

        public String getTicker() {
            return this.z;
        }

        public String getTitle() {
            return this.f15852a;
        }

        public String[] getTitleLocalizationArgs() {
            String[] strArr = this.f15854c;
            return strArr == null ? new String[0] : (String[]) strArr.clone();
        }

        public String getTitleLocalizationKey() {
            return this.f15853b;
        }

        public long[] getVibrateConfig() {
            long[] jArr = this.A;
            return jArr == null ? new long[0] : (long[]) jArr.clone();
        }

        public Integer getVisibility() {
            return a(this.B);
        }

        public Long getWhen() {
            if (TextUtils.isEmpty(this.u)) {
                return null;
            }
            try {
                return Long.valueOf(DateUtil.parseUtcToMillisecond(this.u));
            } catch (StringIndexOutOfBoundsException unused) {
                HMSLog.w("RemoteMessage", "StringIndexOutOfBoundsException: parse when failed.");
                return null;
            } catch (ParseException unused2) {
                HMSLog.w("RemoteMessage", "ParseException: parse when failed.");
                return null;
            }
        }

        public boolean isAutoCancel() {
            return this.x == 1;
        }

        public boolean isDefaultLight() {
            return this.q == 1;
        }

        public boolean isDefaultSound() {
            return this.r == 1;
        }

        public boolean isDefaultVibrate() {
            return this.s == 1;
        }

        public boolean isLocalOnly() {
            return this.v == 1;
        }

        private Notification(Bundle bundle) {
            this.f15852a = bundle.getString(RemoteMessageConst.Notification.NOTIFY_TITLE);
            this.d = bundle.getString("content");
            this.f15853b = bundle.getString(RemoteMessageConst.Notification.TITLE_LOC_KEY);
            this.e = bundle.getString(RemoteMessageConst.Notification.BODY_LOC_KEY);
            this.f15854c = bundle.getStringArray(RemoteMessageConst.Notification.TITLE_LOC_ARGS);
            this.f = bundle.getStringArray(RemoteMessageConst.Notification.BODY_LOC_ARGS);
            this.g = bundle.getString("icon");
            this.j = bundle.getString("color");
            this.h = bundle.getString(RemoteMessageConst.Notification.SOUND);
            this.i = bundle.getString(RemoteMessageConst.Notification.TAG);
            this.m = bundle.getString("channelId");
            this.k = bundle.getString(RemoteMessageConst.Notification.CLICK_ACTION);
            this.l = bundle.getString(RemoteMessageConst.Notification.INTENT_URI);
            this.o = bundle.getInt(RemoteMessageConst.Notification.NOTIFY_ID);
            String string = bundle.getString("url");
            this.n = !TextUtils.isEmpty(string) ? Uri.parse(string) : null;
            this.p = bundle.getString(RemoteMessageConst.Notification.NOTIFY_ICON);
            this.q = bundle.getInt(RemoteMessageConst.Notification.DEFAULT_LIGHT_SETTINGS);
            this.r = bundle.getInt(RemoteMessageConst.Notification.DEFAULT_SOUND);
            this.s = bundle.getInt(RemoteMessageConst.Notification.DEFAULT_VIBRATE_TIMINGS);
            this.t = bundle.getIntArray(RemoteMessageConst.Notification.LIGHT_SETTINGS);
            this.u = bundle.getString(RemoteMessageConst.Notification.WHEN);
            this.v = bundle.getInt(RemoteMessageConst.Notification.LOCAL_ONLY);
            this.w = bundle.getString(RemoteMessageConst.Notification.BADGE_SET_NUM, null);
            this.x = bundle.getInt(RemoteMessageConst.Notification.AUTO_CANCEL);
            this.y = bundle.getString("priority", null);
            this.z = bundle.getString(RemoteMessageConst.Notification.TICKER);
            this.A = bundle.getLongArray(RemoteMessageConst.Notification.VIBRATE_TIMINGS);
            this.B = bundle.getString("visibility", null);
        }
    }

    class a implements Parcelable.Creator<RemoteMessage> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public RemoteMessage createFromParcel(Parcel parcel) {
            return new RemoteMessage(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public RemoteMessage[] newArray(int i) {
            return new RemoteMessage[i];
        }

        a() {
        }
    }

    public RemoteMessage(Bundle bundle) {
        this.f15848a = a(bundle);
    }

    private Bundle a(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        JSONObject jSONObjectB = b(bundle);
        JSONObject jSONObjectA = a(jSONObjectB);
        String string = JsonUtil.getString(jSONObjectA, "data", null);
        bundle2.putString(RemoteMessageConst.ANALYTIC_INFO, JsonUtil.getString(jSONObjectA, RemoteMessageConst.ANALYTIC_INFO, null));
        bundle2.putString(RemoteMessageConst.DEVICE_TOKEN, bundle.getString(RemoteMessageConst.DEVICE_TOKEN));
        JSONObject jSONObjectD = d(jSONObjectA);
        JSONObject jSONObjectB2 = b(jSONObjectD);
        JSONObject jSONObjectC = c(jSONObjectD);
        if (bundle.getInt(RemoteMessageConst.INPUT_TYPE) == 1 && d.a(jSONObjectA, jSONObjectD, string)) {
            bundle2.putString("data", com.huawei.hms.push.a.a(bundle.getByteArray(RemoteMessageConst.MSGBODY)));
            return bundle2;
        }
        String string2 = bundle.getString("to");
        String string3 = bundle.getString(RemoteMessageConst.MSGTYPE);
        String string4 = JsonUtil.getString(jSONObjectA, "msgId", null);
        bundle2.putString("to", string2);
        bundle2.putString("data", string);
        bundle2.putString("msgId", string4);
        bundle2.putString(RemoteMessageConst.MSGTYPE, string3);
        JsonUtil.transferJsonObjectToBundle(jSONObjectB, bundle2, f);
        bundle2.putBundle(RemoteMessageConst.NOTIFICATION, a(jSONObjectB, jSONObjectA, jSONObjectD, jSONObjectB2, jSONObjectC));
        return bundle2;
    }

    private static JSONObject b(Bundle bundle) {
        try {
            return new JSONObject(com.huawei.hms.push.a.a(bundle.getByteArray(RemoteMessageConst.MSGBODY)));
        } catch (JSONException unused) {
            HMSLog.w("RemoteMessage", "JSONException:parse message body failed.");
            return null;
        }
    }

    private static JSONObject c(JSONObject jSONObject) {
        if (jSONObject != null) {
            return jSONObject.optJSONObject(RemoteMessageConst.MessageBody.PARAM);
        }
        return null;
    }

    private static JSONObject d(JSONObject jSONObject) {
        if (jSONObject != null) {
            return jSONObject.optJSONObject(RemoteMessageConst.MessageBody.PS_CONTENT);
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public String getAnalyticInfo() {
        return this.f15848a.getString(RemoteMessageConst.ANALYTIC_INFO);
    }

    public Map<String, String> getAnalyticInfoMap() {
        HashMap map = new HashMap();
        String string = this.f15848a.getString(RemoteMessageConst.ANALYTIC_INFO);
        if (string != null && !string.trim().isEmpty()) {
            try {
                JSONObject jSONObject = new JSONObject(string);
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String strValueOf = String.valueOf(itKeys.next());
                    map.put(strValueOf, String.valueOf(jSONObject.get(strValueOf)));
                }
            } catch (JSONException unused) {
                HMSLog.w("RemoteMessage", "JSONException: get analyticInfo from map failed.");
            }
        }
        return map;
    }

    public String getCollapseKey() {
        return this.f15848a.getString(RemoteMessageConst.COLLAPSE_KEY);
    }

    public String getData() {
        return this.f15848a.getString("data");
    }

    public Map<String, String> getDataOfMap() {
        HashMap map = new HashMap();
        String string = this.f15848a.getString("data");
        if (string != null && !string.trim().isEmpty()) {
            try {
                JSONObject jSONObject = new JSONObject(string);
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String strValueOf = String.valueOf(itKeys.next());
                    map.put(strValueOf, String.valueOf(jSONObject.get(strValueOf)));
                }
            } catch (JSONException unused) {
                HMSLog.w("RemoteMessage", "JSONException: get data from map failed");
            }
        }
        return map;
    }

    public String getFrom() {
        return this.f15848a.getString("from");
    }

    public String getMessageId() {
        return this.f15848a.getString("msgId");
    }

    public String getMessageType() {
        return this.f15848a.getString(RemoteMessageConst.MSGTYPE);
    }

    public Notification getNotification() {
        Bundle bundle = this.f15848a.getBundle(RemoteMessageConst.NOTIFICATION);
        a aVar = null;
        if (this.f15849b == null && bundle != null) {
            this.f15849b = new Notification(bundle, aVar);
        }
        if (this.f15849b == null) {
            this.f15849b = new Notification(new Bundle(), aVar);
        }
        return this.f15849b;
    }

    public int getOriginalUrgency() {
        int i2 = this.f15848a.getInt(RemoteMessageConst.ORI_URGENCY);
        if (i2 == 1 || i2 == 2) {
            return i2;
        }
        return 0;
    }

    public int getReceiptMode() {
        return this.f15848a.getInt(RemoteMessageConst.RECEIPT_MODE);
    }

    public int getSendMode() {
        return this.f15848a.getInt(RemoteMessageConst.SEND_MODE);
    }

    public long getSentTime() {
        try {
            String string = this.f15848a.getString(RemoteMessageConst.SEND_TIME);
            if (TextUtils.isEmpty(string)) {
                return 0L;
            }
            return Long.parseLong(string);
        } catch (NumberFormatException unused) {
            HMSLog.w("RemoteMessage", "NumberFormatException: get sendTime error.");
            return 0L;
        }
    }

    public String getTo() {
        return this.f15848a.getString("to");
    }

    public String getToken() {
        return this.f15848a.getString(RemoteMessageConst.DEVICE_TOKEN);
    }

    public int getTtl() {
        return this.f15848a.getInt("ttl");
    }

    public int getUrgency() {
        int i2 = this.f15848a.getInt(RemoteMessageConst.URGENCY);
        if (i2 == 1 || i2 == 2) {
            return i2;
        }
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeBundle(this.f15848a);
        parcel.writeSerializable(this.f15849b);
    }

    public RemoteMessage(Parcel parcel) {
        this.f15848a = parcel.readBundle();
        this.f15849b = (Notification) parcel.readSerializable();
    }

    private static JSONObject b(JSONObject jSONObject) {
        if (jSONObject != null) {
            return jSONObject.optJSONObject(RemoteMessageConst.MessageBody.NOTIFY_DETAIL);
        }
        return null;
    }

    static {
        String[] strArr = new String[0];
        f15847c = strArr;
        int[] iArr = new int[0];
        d = iArr;
        long[] jArr = new long[0];
        e = jArr;
        HashMap<String, Object> map = new HashMap<>(8);
        f = map;
        map.put("from", "");
        map.put(RemoteMessageConst.COLLAPSE_KEY, "");
        map.put(RemoteMessageConst.SEND_TIME, "");
        map.put("ttl", 86400);
        map.put(RemoteMessageConst.URGENCY, 2);
        map.put(RemoteMessageConst.ORI_URGENCY, 2);
        map.put(RemoteMessageConst.SEND_MODE, 0);
        map.put(RemoteMessageConst.RECEIPT_MODE, 0);
        HashMap<String, Object> map2 = new HashMap<>(8);
        g = map2;
        map2.put(RemoteMessageConst.Notification.TITLE_LOC_KEY, "");
        map2.put(RemoteMessageConst.Notification.BODY_LOC_KEY, "");
        map2.put(RemoteMessageConst.Notification.NOTIFY_ICON, "");
        map2.put(RemoteMessageConst.Notification.TITLE_LOC_ARGS, strArr);
        map2.put(RemoteMessageConst.Notification.BODY_LOC_ARGS, strArr);
        map2.put(RemoteMessageConst.Notification.TICKER, "");
        map2.put(RemoteMessageConst.Notification.NOTIFY_TITLE, "");
        map2.put("content", "");
        HashMap<String, Object> map3 = new HashMap<>(8);
        h = map3;
        map3.put("icon", "");
        map3.put("color", "");
        map3.put(RemoteMessageConst.Notification.SOUND, "");
        map3.put(RemoteMessageConst.Notification.DEFAULT_LIGHT_SETTINGS, 1);
        map3.put(RemoteMessageConst.Notification.LIGHT_SETTINGS, iArr);
        map3.put(RemoteMessageConst.Notification.DEFAULT_SOUND, 1);
        map3.put(RemoteMessageConst.Notification.DEFAULT_VIBRATE_TIMINGS, 1);
        map3.put(RemoteMessageConst.Notification.VIBRATE_TIMINGS, jArr);
        HashMap<String, Object> map4 = new HashMap<>(8);
        i = map4;
        map4.put(RemoteMessageConst.Notification.TAG, "");
        map4.put(RemoteMessageConst.Notification.WHEN, "");
        map4.put(RemoteMessageConst.Notification.LOCAL_ONLY, 1);
        map4.put(RemoteMessageConst.Notification.BADGE_SET_NUM, "");
        map4.put("priority", "");
        map4.put(RemoteMessageConst.Notification.AUTO_CANCEL, 1);
        map4.put("visibility", "");
        map4.put("channelId", "");
        HashMap<String, Object> map5 = new HashMap<>(3);
        j = map5;
        map5.put(RemoteMessageConst.Notification.CLICK_ACTION, "");
        map5.put(RemoteMessageConst.Notification.INTENT_URI, "");
        map5.put("url", "");
        CREATOR = new a();
    }

    private Bundle a(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, JSONObject jSONObject5) {
        Bundle bundle = new Bundle();
        JsonUtil.transferJsonObjectToBundle(jSONObject3, bundle, g);
        JsonUtil.transferJsonObjectToBundle(jSONObject4, bundle, h);
        JsonUtil.transferJsonObjectToBundle(jSONObject, bundle, i);
        JsonUtil.transferJsonObjectToBundle(jSONObject5, bundle, j);
        bundle.putInt(RemoteMessageConst.Notification.NOTIFY_ID, JsonUtil.getInt(jSONObject2, RemoteMessageConst.Notification.NOTIFY_ID, 0));
        return bundle;
    }

    private static JSONObject a(JSONObject jSONObject) {
        if (jSONObject != null) {
            return jSONObject.optJSONObject("msgContent");
        }
        return null;
    }
}
