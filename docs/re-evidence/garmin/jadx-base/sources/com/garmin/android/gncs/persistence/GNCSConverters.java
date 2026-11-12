package com.garmin.android.gncs.persistence;

import android.net.Uri;
import com.garmin.android.gncs.GNCSNotificationInfo;
import com.garmin.android.gncs.NotificationConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import ih2.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import p005kotlin.Metadata;
import p13.j0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0004H\u0007J\u0012\u0010\u000b\u001a\u00020\f2\b\u0010\n\u001a\u0004\u0018\u00010\u0004H\u0007J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\u0016\u0010\u0011\u001a\u00020\u00042\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0006H\u0007J\u0010\u0010\u0014\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u000eH\u0007J\u0018\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u0004H\u0007J\u0018\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00130\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u0004H\u0007J\u0010\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\tH\u0007J\u0010\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\fH\u0007¨\u0006\u001d"}, d2 = {"Lcom/garmin/android/gncs/persistence/GNCSConverters;", "", "()V", "actionsToString", "", "actions", "", "Lcom/garmin/android/gncs/persistence/GNCSNotificationAction;", "fromNotificationStatusValue", "Lcom/garmin/android/gncs/GNCSNotificationInfo$NotificationStatus;", "value", "fromNotificationTypeValue", "Lcom/garmin/android/gncs/GNCSNotificationInfo$NotificationType;", "hasLargeIconToInt", "", "hasLargeIcon", "", "imagesToString", "images", "Landroid/net/Uri;", "intToHasLargeIcon", "stringToActions", "actionString", "stringToImages", "imageString", "toNotificationStatus", "status", "toNotificationType", NotificationConstants.KEY_DATA_MIME_TYPE, "gncs-all-modules_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class GNCSConverters {
    public final String actionsToString(List<GNCSNotificationAction> actions) {
        actions.getClass();
        if (actions.isEmpty()) {
            return "";
        }
        try {
            JSONArray jSONArray = new JSONArray();
            for (GNCSNotificationAction gNCSNotificationAction : actions) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(TtmlNode.ATTR_ID, gNCSNotificationAction.id);
                jSONObject.put("title", gNCSNotificationAction.title);
                jSONObject.put("requiresInput", gNCSNotificationAction.requiresInput);
                jSONObject.put("dismissAction", gNCSNotificationAction.dismissAction);
                jSONObject.put("actionType", gNCSNotificationAction.actionType.name());
                jSONArray.put(jSONObject);
            }
            String string = jSONArray.toString();
            string.getClass();
            return string;
        } catch (Exception e4) {
            b.a(e4, "GNCSConverters.actionsToString");
            return "";
        }
    }

    public final GNCSNotificationInfo.NotificationStatus fromNotificationStatusValue(String value) {
        if (value != null) {
            try {
                GNCSNotificationInfo.NotificationStatus notificationStatusValueOf = GNCSNotificationInfo.NotificationStatus.valueOf(value);
                if (notificationStatusValueOf != null) {
                    return notificationStatusValueOf;
                }
            } catch (Exception e4) {
                b.a(e4, "GNCSConverters.fromNotificationStatusValue");
                return GNCSNotificationInfo.NotificationStatus.DNS;
            }
        }
        return GNCSNotificationInfo.NotificationStatus.DNS;
    }

    public final GNCSNotificationInfo.NotificationType fromNotificationTypeValue(String value) {
        if (value != null) {
            try {
                GNCSNotificationInfo.NotificationType notificationTypeValueOf = GNCSNotificationInfo.NotificationType.valueOf(value);
                if (notificationTypeValueOf != null) {
                    return notificationTypeValueOf;
                }
            } catch (Exception e4) {
                b.a(e4, "GNCSConverters.fromNotificationTypeValue");
                return GNCSNotificationInfo.NotificationType.OTHER;
            }
        }
        return GNCSNotificationInfo.NotificationType.OTHER;
    }

    public final int hasLargeIconToInt(boolean hasLargeIcon) {
        return hasLargeIcon ? 1 : 0;
    }

    public final String imagesToString(List<? extends Uri> images) {
        images.getClass();
        if (images.isEmpty()) {
            return "";
        }
        try {
            JSONArray jSONArray = new JSONArray();
            Iterator<T> it = images.iterator();
            while (it.hasNext()) {
                jSONArray.put(((Uri) it.next()).toString());
            }
            String string = jSONArray.toString();
            string.getClass();
            return string;
        } catch (Exception e4) {
            b.a(e4, "GNCSConverters.imagesToString");
            return "";
        }
    }

    public final boolean intToHasLargeIcon(int value) {
        return value == 1;
    }

    public final List<GNCSNotificationAction> stringToActions(String actionString) {
        if (actionString == null || actionString.length() == 0) {
            return j0.f134944a;
        }
        try {
            JSONArray jSONArray = new JSONArray(actionString);
            ArrayList arrayList = new ArrayList(jSONArray.length());
            int length = jSONArray.length();
            for (int i14 = 0; i14 < length; i14++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i14);
                int i15 = jSONObject.getInt(TtmlNode.ATTR_ID);
                String string = jSONObject.getString("title");
                string.getClass();
                boolean zOptBoolean = jSONObject.optBoolean("requiresInput", false);
                String string2 = jSONObject.getString("actionType");
                string2.getClass();
                arrayList.add(new GNCSNotificationAction(i15, string, zOptBoolean, GNCSNotificationAction.ActionType.valueOf(string2), jSONObject.optBoolean("dismissAction", false)));
            }
            return arrayList;
        } catch (Exception e4) {
            b.a(e4, "GNCSConverters.stringToActions");
            return j0.f134944a;
        }
    }

    public final List<Uri> stringToImages(String imageString) {
        if (imageString == null || imageString.length() == 0) {
            return j0.f134944a;
        }
        try {
            JSONArray jSONArray = new JSONArray(imageString);
            ArrayList arrayList = new ArrayList(jSONArray.length());
            int length = jSONArray.length();
            for (int i14 = 0; i14 < length; i14++) {
                String string = jSONArray.getString(i14);
                if (string != null) {
                    arrayList.add(Uri.parse(string));
                }
            }
            return arrayList;
        } catch (Exception e4) {
            b.a(e4, "GNCSConverters.stringToImages");
            return j0.f134944a;
        }
    }

    public final String toNotificationStatus(GNCSNotificationInfo.NotificationStatus status) {
        status.getClass();
        return status.name();
    }

    public final String toNotificationType(GNCSNotificationInfo.NotificationType type) {
        type.getClass();
        return type.name();
    }
}
