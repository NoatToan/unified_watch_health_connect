package com.garmin.android.gncs.datamappers;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.telephony.PhoneNumberUtils;
import android.text.TextUtils;
import com.garmin.android.gncs.GNCSNotificationInfo;
import com.garmin.android.gncs.GNCSParsedNotification;
import com.garmin.android.gncs.R;
import com.garmin.android.gncs.persistence.GNCSNotificationAction;
import com.garmin.android.gncs.telephony.TelephonyUtilKt;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import ih2.b;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import tn.k;
import vb.h;

/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractDataMapper {
    private static final String TAG = "AbstractDataMapper";
    private static final Map<String, Class<? extends AbstractDataMapper>> mPackageMappers = new Hashtable();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.CharSequence, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v9 */
    private static void cleanUpNotificationFields(Context context, GNCSNotificationInfo gNCSNotificationInfo) {
        String strReplaceAll;
        String str;
        ?? r14;
        ?? r15;
        String strReplaceAll2;
        String strReplaceAll3;
        String strReplaceAll4;
        if (TextUtils.isEmpty(gNCSNotificationInfo.title)) {
            strReplaceAll = "";
        } else {
            strReplaceAll = gNCSNotificationInfo.title.replaceAll("[^\\x20-\\x7E]", "");
            if (TextUtils.isEmpty(strReplaceAll)) {
                strReplaceAll = gNCSNotificationInfo.title;
            }
        }
        if (TextUtils.isEmpty(gNCSNotificationInfo.subTitle)) {
            str = "";
        } else {
            strReplaceAll4 = gNCSNotificationInfo.subTitle.replaceAll("[^\\x20-\\x7E]", "");
            if (TextUtils.isEmpty(strReplaceAll4)) {
                str = strReplaceAll4;
                str = gNCSNotificationInfo.subTitle;
            }
        }
        str = strReplaceAll4;
        if (TextUtils.isEmpty(gNCSNotificationInfo.message)) {
            r14 = "";
        } else {
            strReplaceAll3 = gNCSNotificationInfo.message.replaceAll("[^\\x20-\\x7E]", "");
            if (TextUtils.isEmpty(strReplaceAll3)) {
                r14 = strReplaceAll3;
                r14 = gNCSNotificationInfo.message;
            }
        }
        r14 = strReplaceAll3;
        ?? r16 = str;
        if (!TextUtils.isEmpty(strReplaceAll) && !TextUtils.isEmpty(str) && str.startsWith(strReplaceAll)) {
            String str2 = gNCSNotificationInfo.subTitle;
            String strStripSpecialCharacters = stripSpecialCharacters(str2.substring(strReplaceAll.length() + str2.indexOf(strReplaceAll)));
            gNCSNotificationInfo.subTitle = strStripSpecialCharacters;
            strReplaceAll2 = strStripSpecialCharacters.replaceAll("[^\\x20-\\x7E]", "");
            if (TextUtils.isEmpty(strReplaceAll2)) {
                r16 = str;
                r16 = str;
                r16 = strReplaceAll2;
                r16 = gNCSNotificationInfo.subTitle;
            }
        }
        r16 = str;
        r16 = str;
        r16 = strReplaceAll2;
        r16 = str;
        r16 = str;
        r16 = str;
        if (TextUtils.isEmpty(r16) || TextUtils.isEmpty(r14) || !r16.equals(r14)) {
            boolean zIsEmpty = TextUtils.isEmpty(r16);
            r15 = r16;
            if (!zIsEmpty && !TextUtils.isEmpty(r14) && r14.startsWith(r16)) {
                r15 = r16;
                r15 = r16;
                ?? r17 = gNCSNotificationInfo.message;
                gNCSNotificationInfo.message = stripSpecialCharacters(r17.substring(r16.length() + r17.indexOf(r16)));
                r15 = r16;
            }
        } else {
            gNCSNotificationInfo.subTitle = "";
            r15 = "";
        }
        r15 = r16;
        r15 = r16;
        r15 = r16;
        if (TextUtils.isEmpty(strReplaceAll) && !TextUtils.isEmpty(r15)) {
            gNCSNotificationInfo.title = gNCSNotificationInfo.subTitle;
            gNCSNotificationInfo.subTitle = "";
        }
        if (TextUtils.isEmpty(strReplaceAll)) {
            try {
                PackageManager packageManager = context.getPackageManager();
                gNCSNotificationInfo.title = packageManager.getApplicationLabel(packageManager.getApplicationInfo(gNCSNotificationInfo.packageName, 0)).toString();
            } catch (Exception e4) {
                b bVar = b.f93516a;
                b.a(e4, e4.getClass().getName());
            }
        }
    }

    public static AbstractDataMapper getDataMapper(Context context, GNCSParsedNotification gNCSParsedNotification, int i14) {
        Class<? extends AbstractDataMapper> cls;
        String str = gNCSParsedNotification.notificationInfo.packageName;
        String strH = h.h(i14, str, ":");
        String strG = k.g(str, ":0");
        Map<String, Class<? extends AbstractDataMapper>> map = mPackageMappers;
        if (map.containsKey(strH)) {
            cls = map.get(strH);
        } else {
            cls = map.containsKey(strG) ? map.get(strG) : null;
        }
        if (cls != null) {
            try {
                return cls.getConstructor(null).newInstance(null);
            } catch (Exception e4) {
                b bVar = b.f93516a;
                b.a(e4, e4.getClass().getName());
            }
        }
        return (TelephonyUtilKt.isDialerPackage(context, gNCSParsedNotification.notificationInfo.packageName) || gNCSParsedNotification.notificationInfo.type == GNCSNotificationInfo.NotificationType.INCOMING_CALL) ? new DialerDataMapper() : new GenericDataMapper();
    }

    public static void loadDynamicDataMappers(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i14 = 0; i14 < jSONArray.length(); i14++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i14);
                try {
                    registerDataMapper(jSONObject.getString(RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME), jSONObject.optInt(RemoteConfigConstants.RequestFieldKey.APP_VERSION, 0), Class.forName(jSONObject.getString("className")));
                } catch (Throwable unused) {
                }
            }
        } catch (Throwable th3) {
            b.c("AbstractDataMapperloadDynamicDataMappers, check remote config", th3);
        }
    }

    public static void registerDataMapper(String str, int i14, Class<? extends AbstractDataMapper> cls) {
        mPackageMappers.put(str + ":" + i14, cls);
    }

    private static String stripSpecialCharacters(String str) {
        int i14 = 0;
        for (int i15 = 0; i15 < str.length(); i15++) {
            if (!"\n,-:; ".contains(str.charAt(i15) + "")) {
                break;
            }
            i14++;
        }
        return i14 > 0 ? str.substring(i14) : str;
    }

    public abstract void addImagesToMMSNotification(Context context, GNCSNotificationInfo gNCSNotificationInfo, Uri uri);

    public abstract void mapAdvancedActions(GNCSParsedNotification gNCSParsedNotification, GNCSNotificationInfo gNCSNotificationInfo, Context context);

    public final void mapData(Context context, GNCSParsedNotification gNCSParsedNotification) {
        boolean z14;
        mapExtras(context, gNCSParsedNotification);
        GNCSNotificationInfo gNCSNotificationInfo = gNCSParsedNotification.notificationInfo;
        GNCSNotificationInfo.NotificationType notificationType = gNCSNotificationInfo.type;
        GNCSNotificationInfo.NotificationType notificationType2 = GNCSNotificationInfo.NotificationType.SMS;
        if (notificationType == notificationType2 && TextUtils.isEmpty(gNCSNotificationInfo.phoneNumber)) {
            if (!TextUtils.isEmpty(gNCSNotificationInfo.title) && PhoneNumberUtils.isGlobalPhoneNumber(gNCSNotificationInfo.title)) {
                gNCSNotificationInfo.phoneNumber = gNCSNotificationInfo.title;
            } else if (!TextUtils.isEmpty(gNCSNotificationInfo.subTitle) && PhoneNumberUtils.isGlobalPhoneNumber(gNCSNotificationInfo.subTitle)) {
                gNCSNotificationInfo.phoneNumber = gNCSNotificationInfo.subTitle;
            }
        }
        mapAdvancedActions(gNCSParsedNotification, gNCSNotificationInfo, context);
        mapSimpleActions(context, gNCSNotificationInfo);
        if (gNCSParsedNotification.actions.isEmpty() && gNCSNotificationInfo.type == notificationType2 && PhoneNumberUtils.isGlobalPhoneNumber(gNCSNotificationInfo.phoneNumber)) {
            Iterator<GNCSNotificationAction> it = gNCSNotificationInfo.actions.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z14 = false;
                    break;
                } else if (it.next().actionType == GNCSNotificationAction.ActionType.POSITIVE) {
                    z14 = true;
                    break;
                }
            }
            if (gNCSNotificationInfo.positiveActionIndex < 0 && !z14) {
                String string = context.getString(R.string.reply_sms);
                gNCSNotificationInfo.actions.add(new GNCSNotificationAction(94, string, true, GNCSNotificationAction.ActionType.POSITIVE, true));
                gNCSNotificationInfo.positiveAction = string;
                gNCSNotificationInfo.positiveActionIndex = gNCSNotificationInfo.actions.size() - 1;
            }
        }
        mapStatus(gNCSNotificationInfo, gNCSParsedNotification.extras, gNCSParsedNotification.existingInfo);
        cleanUpNotificationFields(context, gNCSNotificationInfo);
    }

    public abstract void mapExtras(Context context, GNCSParsedNotification gNCSParsedNotification);

    public abstract void mapSimpleActions(Context context, GNCSNotificationInfo gNCSNotificationInfo);

    public abstract void mapStatus(GNCSNotificationInfo gNCSNotificationInfo, Bundle bundle, GNCSNotificationInfo gNCSNotificationInfo2);

    public abstract void populateMedia(Context context, GNCSNotificationInfo gNCSNotificationInfo, Bundle bundle, boolean z14);
}
