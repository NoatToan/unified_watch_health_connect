package ohos.ace.plugin.notificationmanager;

import android.text.TextUtils;
import android.util.Log;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes46.dex */
public class JsonUtils {
    private static final String TAG = "JsonUtils";

    public static NotificationRequest getNotificationRequest(String str) {
        NotificationRequest notificationRequest = new NotificationRequest();
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                notificationRequest.id = Integer.valueOf(jSONObject.optInt("id"));
                notificationRequest.label = jSONObject.optString("label");
                notificationRequest.deliveryTime = Long.valueOf(jSONObject.optLong("deliveryTime"));
                notificationRequest.autoDeletedTime = Long.valueOf(jSONObject.optLong("autoDeletedTime"));
                notificationRequest.isAlertOnce = jSONObject.optBoolean("isAlertOnce");
                notificationRequest.tapDismissed = jSONObject.optBoolean("tapDismissed");
                notificationRequest.isStopwatch = jSONObject.optBoolean("isStopwatch");
                notificationRequest.isCountdown = jSONObject.optBoolean("isCountdown");
                notificationRequest.isOngoing = jSONObject.optBoolean("isOngoing");
                notificationRequest.showDeliveryTime = jSONObject.optBoolean("showDeliveryTime");
                notificationRequest.smallIcon = jSONObject.optString("smallIcon");
                notificationRequest.largeIcon = jSONObject.optString("largeIcon");
                notificationRequest.badgeNumber = Integer.valueOf(jSONObject.optInt("badgeNumber"));
                notificationRequest.notificationContentType = jSONObject.optString("notificationContentType");
                notificationRequest.progressMax = Integer.valueOf(jSONObject.optInt("progressMax"));
                notificationRequest.progressValue = Integer.valueOf(jSONObject.optInt("progressValue"));
                notificationRequest.content = getContent(jSONObject.getJSONObject("content"));
                return notificationRequest;
            } catch (JSONException unused) {
                Log.e(TAG, "getNotificationRequest error");
            }
        }
        return notificationRequest;
    }

    private static NotificationRequest.NotificationContent getContent(JSONObject jSONObject) {
        NotificationRequest.NotificationContent notificationContent = new NotificationRequest.NotificationContent();
        try {
            notificationContent.contentType = jSONObject.optInt("contentType");
            notificationContent.content = getBasicContent(notificationContent.contentType, jSONObject.getJSONObject("content"));
            return notificationContent;
        } catch (JSONException unused) {
            Log.e(TAG, "getStringArray error");
            return notificationContent;
        }
    }

    private static NotificationRequest.NotificationBasicContent getBasicContent(int i, JSONObject jSONObject) {
        if (i == NotificationTools.ContentType.LONG_TEXT.getValue()) {
            NotificationRequest.NotificationLongTextContent notificationLongTextContent = new NotificationRequest.NotificationLongTextContent();
            notificationLongTextContent.title = jSONObject.optString("title");
            notificationLongTextContent.text = jSONObject.optString("text");
            notificationLongTextContent.briefText = jSONObject.optString("briefText");
            notificationLongTextContent.expandedTitle = jSONObject.optString("expandedTitle");
            notificationLongTextContent.longText = jSONObject.optString("longText");
            return notificationLongTextContent;
        }
        if (i == NotificationTools.ContentType.MULTILINE.getValue()) {
            NotificationRequest.NotificationMultiLineContent notificationMultiLineContent = new NotificationRequest.NotificationMultiLineContent();
            notificationMultiLineContent.title = jSONObject.optString("title");
            notificationMultiLineContent.text = jSONObject.optString("text");
            notificationMultiLineContent.briefText = jSONObject.optString("briefText");
            notificationMultiLineContent.expandedTitle = jSONObject.optString("expandedTitle");
            notificationMultiLineContent.allLines = getStringArray(jSONObject.optJSONArray("allLines"));
            return notificationMultiLineContent;
        }
        if (i == NotificationTools.ContentType.PICTURE.getValue()) {
            NotificationRequest.NotificationPictureContent notificationPictureContent = new NotificationRequest.NotificationPictureContent();
            notificationPictureContent.title = jSONObject.optString("title");
            notificationPictureContent.text = jSONObject.optString("text");
            notificationPictureContent.briefText = jSONObject.optString("briefText");
            notificationPictureContent.expandedTitle = jSONObject.optString("expandedTitle");
            notificationPictureContent.picture = jSONObject.optString("picture");
            return notificationPictureContent;
        }
        NotificationRequest.NotificationBasicContent notificationBasicContent = new NotificationRequest.NotificationBasicContent();
        notificationBasicContent.title = jSONObject.optString("title");
        notificationBasicContent.text = jSONObject.optString("text");
        return notificationBasicContent;
    }

    private static String[] getStringArray(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        try {
            String[] strArr = new String[jSONArray.length()];
            for (int i = 0; i < jSONArray.length(); i++) {
                strArr[i] = jSONArray.getString(i);
            }
            return strArr;
        } catch (JSONException unused) {
            Log.e(TAG, "getStringArray error");
            return null;
        }
    }
}
