package com.garmin.android.gncs.settings;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import cd0.h0;
import com.garmin.android.apps.connectmobile.f3;
import com.garmin.android.gncs.AppManager;
import com.garmin.android.gncs.GNCSApplicationInfo;
import com.garmin.android.gncs.GNCSNotificationInfo;
import com.garmin.android.gncs.SmartNotificationsUtil;
import com.garmin.android.gncs.handlers.AbstractAppHandler;
import com.garmin.android.gncs.handlers.DefaultGlobalHandler;
import com.garmin.android.gncs.sms.SmsUtilKt;
import com.garmin.android.gncs.telephony.PhoneCallListener;
import com.garmin.android.gncs.telephony.TelephonyUtilKt;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class GNCSSettings {
    private static final String PREF_FOLLOW_DND = "followDnd";
    private static final String PREF_LAST_NOTIFIED = "lastNotified";
    private static final String PREF_SETTINGS_FILE = "gncs";
    private static final String VOICE_MAIL_GROUP_NAME = "VisualVoicemailGroup";
    private static volatile GNCSSettings instance;
    private final Map<String, GNCSNotificationInfo.NotificationType> defaultPackageMap;
    private final Set<String> dialerPackageList;
    private final Set<String> installedPackages;
    private final Set<String> smsPackageList;
    private final Set<Callback> callbacks = new CopyOnWriteArraySet();
    private final Set<GNCSOptOutSettingsChangedListener> optOutSettingsChangedListeners = new CopyOnWriteArraySet();
    private boolean hasOptOutSettingsChanged = false;

    /* JADX INFO: renamed from: com.garmin.android.gncs.settings.GNCSSettings$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$garmin$android$gncs$telephony$PhoneCallListener$CallState;

        static {
            int[] iArr = new int[PhoneCallListener.CallState.values().length];
            $SwitchMap$com$garmin$android$gncs$telephony$PhoneCallListener$CallState = iArr;
            try {
                iArr[PhoneCallListener.CallState.INCOMING_STARTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$garmin$android$gncs$telephony$PhoneCallListener$CallState[PhoneCallListener.CallState.INCOMING_MISSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$garmin$android$gncs$telephony$PhoneCallListener$CallState[PhoneCallListener.CallState.IDLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$garmin$android$gncs$telephony$PhoneCallListener$CallState[PhoneCallListener.CallState.INCOMING_ANSWERED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$garmin$android$gncs$telephony$PhoneCallListener$CallState[PhoneCallListener.CallState.OUTGOING_STARTED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public interface Callback {
        void onPackageDisabled(String str);

        void onPackageEnabled(String str);
    }

    private GNCSSettings() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.defaultPackageMap = concurrentHashMap;
        CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
        this.dialerPackageList = copyOnWriteArraySet;
        this.smsPackageList = new CopyOnWriteArraySet();
        this.installedPackages = new CopyOnWriteArraySet();
        GNCSNotificationInfo.NotificationType notificationType = GNCSNotificationInfo.NotificationType.INCOMING_CALL;
        concurrentHashMap.put(SmartNotificationsUtil.Packages.INCOMING_PACKAGE_NAME, notificationType);
        concurrentHashMap.put(SmartNotificationsUtil.Packages.MISSED_PACKAGE_NAME, GNCSNotificationInfo.NotificationType.MISSED_CALL);
        GNCSNotificationInfo.NotificationType notificationType2 = GNCSNotificationInfo.NotificationType.VOICEMAIL;
        concurrentHashMap.put(SmartNotificationsUtil.Packages.VOICEMAIL_PACKAGE_NAME, notificationType2);
        GNCSNotificationInfo.NotificationType notificationType3 = GNCSNotificationInfo.NotificationType.EMAIL;
        concurrentHashMap.put("com.google.android.email", notificationType3);
        concurrentHashMap.put("com.google.android.gm", notificationType3);
        concurrentHashMap.put("com.yahoo.mobile.client.android.mail", notificationType3);
        concurrentHashMap.put("com.fsck.k9", notificationType3);
        concurrentHashMap.put("com.outlook.Z7", notificationType3);
        concurrentHashMap.put("org.kman.AquaMail", notificationType3);
        concurrentHashMap.put("com.maildroid", notificationType3);
        concurrentHashMap.put("com.android.email", notificationType3);
        concurrentHashMap.put("com.samsung.android.email.provider", notificationType3);
        concurrentHashMap.put("com.microsoft.office.outlook", notificationType3);
        GNCSNotificationInfo.NotificationType notificationType4 = GNCSNotificationInfo.NotificationType.SCHEDULE;
        concurrentHashMap.put("com.google.android.calendar", notificationType4);
        concurrentHashMap.put("com.android.calendar", notificationType4);
        concurrentHashMap.put(SmartNotificationsUtil.Packages.SAMSUNG_CALENDAR_PACKAGE_NAME, notificationType4);
        concurrentHashMap.put("com.htc.calendar", notificationType4);
        concurrentHashMap.put("com.asus.calendar", notificationType4);
        GNCSNotificationInfo.NotificationType notificationType5 = GNCSNotificationInfo.NotificationType.SOCIAL;
        concurrentHashMap.put("com.google.android.apps.plus", notificationType5);
        concurrentHashMap.put("com.google.android.apps.fireball", notificationType5);
        concurrentHashMap.put("com.facebook.katana", notificationType5);
        concurrentHashMap.put("com.facebook.orca", notificationType5);
        concurrentHashMap.put("com.twitter.android", notificationType5);
        concurrentHashMap.put("com.whatsapp", notificationType5);
        concurrentHashMap.put("com.linkedin.android", notificationType5);
        concurrentHashMap.put("jp.naver.line.android", notificationType5);
        concurrentHashMap.put("com.tencent.mm", notificationType5);
        concurrentHashMap.put("com.tencent.mobileqq", notificationType5);
        concurrentHashMap.put("com.immomo.momo", notificationType5);
        concurrentHashMap.put("com.xiaomi.channel", notificationType5);
        GNCSNotificationInfo.NotificationType notificationType6 = GNCSNotificationInfo.NotificationType.SMS;
        concurrentHashMap.put("com.jb.gosms", notificationType6);
        concurrentHashMap.put("de.shapeservices.impluslite", notificationType6);
        concurrentHashMap.put("de.shapeservices.implus", notificationType6);
        concurrentHashMap.put("com.google.android.talk", notificationType6);
        concurrentHashMap.put("com.google.android.apps.babel", notificationType6);
        concurrentHashMap.put("com.samsung.android.messaging", notificationType6);
        concurrentHashMap.put(SmartNotificationsUtil.Packages.GOOGLE_MESSAGES_APP_PACKAGE_NAME, notificationType6);
        concurrentHashMap.put("com.p1.chompsms", notificationType6);
        concurrentHashMap.put("com.android.mms.service", notificationType6);
        concurrentHashMap.put("com.android.mms", notificationType6);
        GNCSNotificationInfo.NotificationType notificationType7 = GNCSNotificationInfo.NotificationType.HEALTH_AND_FITNESS;
        concurrentHashMap.put("com.garmin.android.apps.connectmobile", notificationType7);
        concurrentHashMap.put("com.garmin.android.apps.vivokid", notificationType7);
        concurrentHashMap.put("com.garmin.android.apps.vivokid.beta", notificationType7);
        concurrentHashMap.put("com.google.android.apps.magazines", GNCSNotificationInfo.NotificationType.NEWS);
        GNCSNotificationInfo.NotificationType notificationType8 = GNCSNotificationInfo.NotificationType.OTHER;
        concurrentHashMap.put("com.ubercab", notificationType8);
        concurrentHashMap.put("me.lyft.android", notificationType8);
        concurrentHashMap.put("com.google.android.googlequicksearchbox", notificationType8);
        concurrentHashMap.put(SmartNotificationsUtil.Packages.SAMSUNG_INCALL_UI_PACKAGE_NAME, notificationType);
        concurrentHashMap.put(SmartNotificationsUtil.Packages.ASUS_INCALL_UI_PACKAGE_NAME, notificationType);
        concurrentHashMap.put("com.android.incallui", notificationType);
        concurrentHashMap.put("com.samsung.vvm", notificationType2);
        AbstractAppHandler.registerGlobalHandler(new DefaultGlobalHandler(copyOnWriteArraySet));
    }

    public static GNCSSettings getInstance() {
        if (instance == null) {
            synchronized (GNCSSettings.class) {
                try {
                    if (instance == null) {
                        instance = new GNCSSettings();
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
        return instance;
    }

    private static SharedPreferences getPrefs(Context context) {
        return context.getApplicationContext().getSharedPreferences(PREF_SETTINGS_FILE, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$completeOptOutSettings$0(GNCSOptOutSettingsChangedListener gNCSOptOutSettingsChangedListener) {
        try {
            gNCSOptOutSettingsChangedListener.onSettingsChanged();
        } catch (Exception unused) {
        }
    }

    private void saveInternal(GNCSApplicationInfo gNCSApplicationInfo) {
        AppManager.INSTANCE.save(gNCSApplicationInfo);
        this.hasOptOutSettingsChanged = true;
        for (Callback callback : this.callbacks) {
            try {
                boolean z14 = gNCSApplicationInfo.enabled;
                String str = gNCSApplicationInfo.packageName;
                if (z14) {
                    callback.onPackageEnabled(str);
                } else {
                    callback.onPackageDisabled(str);
                }
            } catch (Exception unused) {
            }
        }
    }

    private SharedPreferences.Editor setFollowDNDPreference(Context context, boolean z14) {
        return getPrefs(context).edit().putBoolean(PREF_FOLLOW_DND, z14);
    }

    private SharedPreferences.Editor setTimestampUserNotified(Context context, long j8) {
        return getPrefs(context).edit().putLong(PREF_LAST_NOTIFIED, j8);
    }

    public void addCallback(Callback callback) {
        this.callbacks.add(callback);
    }

    public void addOptOutSettingsChangedListener(GNCSOptOutSettingsChangedListener gNCSOptOutSettingsChangedListener) {
        this.optOutSettingsChangedListeners.add(gNCSOptOutSettingsChangedListener);
    }

    public void addToDefaultPackageMap(String str, GNCSNotificationInfo.NotificationType notificationType) {
        this.defaultPackageMap.put(str, notificationType);
    }

    public void applyNotificationTypes(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i14 = 0; i14 < jSONArray.length(); i14++) {
                try {
                    JSONObject jSONObject = jSONArray.getJSONObject(i14);
                    String string = jSONObject.getString(RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME);
                    String string2 = jSONObject.getString("notificationType");
                    addToDefaultPackageMap(string, GNCSNotificationInfo.NotificationType.valueOf(string2));
                    ih2.b.b("GNCSSettings.applyNotificationTypes -> adding package [" + string + "] with type [" + string2 + "]");
                } catch (Exception e4) {
                    ih2.b.a(e4, "GNCSSettings.applyNotificationTypes");
                }
            }
        } catch (Throwable th3) {
            ih2.b.c("GNCSSettings.applyNotificationTypes", th3);
        }
    }

    public void applyPackageOverrides(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i14 = 0; i14 < jSONArray.length(); i14++) {
                try {
                    JSONObject jSONObject = jSONArray.getJSONObject(i14);
                    String string = jSONObject.getString(RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME);
                    boolean z14 = jSONObject.getBoolean("enabled");
                    if (z14) {
                        AppManager.INSTANCE.enable(string);
                        this.installedPackages.add(string);
                    } else {
                        AppManager.INSTANCE.save(new GNCSApplicationInfo(string, false));
                        this.installedPackages.remove(string);
                    }
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("GNCSSettings.applyPackageOverrides -> ");
                    sb3.append(z14 ? "enable" : "disable");
                    sb3.append(" package [");
                    sb3.append(string);
                    sb3.append("]");
                    ih2.b.b(sb3.toString());
                } catch (Exception e4) {
                    ih2.b.a(e4, "GNCSSettings.applyPackageOverrides");
                }
            }
        } catch (Throwable th3) {
            ih2.b.c("GNCSSettings.applyPackageOverrides", th3);
        }
    }

    public void completeOptOutSettings() {
        if (this.hasOptOutSettingsChanged) {
            Iterator<GNCSOptOutSettingsChangedListener> it = this.optOutSettingsChangedListeners.iterator();
            while (it.hasNext()) {
                new Thread(new h0(it.next(), 11)).start();
            }
            this.hasOptOutSettingsChanged = false;
        }
    }

    public List<String> getDefaultPackageNames(GNCSNotificationInfo.NotificationType notificationType) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, GNCSNotificationInfo.NotificationType> entry : this.defaultPackageMap.entrySet()) {
            String key = entry.getKey();
            if (!key.startsWith("com.garmin") && entry.getValue() == notificationType) {
                arrayList.add(key);
            }
        }
        return arrayList;
    }

    public long getLastUserNotified(Context context) {
        return getPrefs(context).getLong(PREF_LAST_NOTIFIED, 0L);
    }

    public GNCSNotificationInfo.NotificationType getNotificationTypeForPackage(Context context, String str, String str2, String str3) {
        GNCSNotificationInfo.NotificationType notificationType = this.defaultPackageMap.get(str);
        if (notificationType != null) {
            ih2.b.b("GNCSSettings.getNotificationTypeForPackage -> Found  type [" + notificationType + "] for package [" + str + "] in defaultPackageMap");
            return notificationType;
        }
        if (str2 != null && !str2.isEmpty()) {
            switch (str2) {
                case "social":
                    return GNCSNotificationInfo.NotificationType.SOCIAL;
                case "msg":
                    return GNCSNotificationInfo.NotificationType.SMS;
                case "email":
                    return GNCSNotificationInfo.NotificationType.EMAIL;
                case "event":
                    return GNCSNotificationInfo.NotificationType.SCHEDULE;
            }
        }
        if (this.dialerPackageList.contains(str)) {
            int i14 = AnonymousClass1.$SwitchMap$com$garmin$android$gncs$telephony$PhoneCallListener$CallState[PhoneCallListener.INSTANCE.getCallState().ordinal()];
            if (i14 == 1) {
                return GNCSNotificationInfo.NotificationType.INCOMING_CALL;
            }
            if (i14 == 2) {
                return ("missed_call".equals(str2) && VOICE_MAIL_GROUP_NAME.equals(str3)) ? GNCSNotificationInfo.NotificationType.VOICEMAIL : GNCSNotificationInfo.NotificationType.MISSED_CALL;
            }
            if (i14 == 3 || i14 == 4 || i14 == 5) {
                return GNCSNotificationInfo.NotificationType.OTHER;
            }
        } else if ("call".equals(str2)) {
            com.airbnb.lottie.animation.keyframe.a.s("GNCSSettings.getNotificationTypeForPackage -> Received notification of CATEGORY_CALL from non dialer package [", str, "]");
            if (PhoneCallListener.CallState.INCOMING_STARTED == PhoneCallListener.INSTANCE.getCallState()) {
                if (!SmartNotificationsUtil.Packages.AOSP_TELECOM_SERVER_PACKAGE_NAME.equals(str)) {
                    com.airbnb.lottie.animation.keyframe.a.s("GNCSSettings.getNotificationTypeForPackage -> Treating as INCOMING_CALL for package [", str, "]");
                    return GNCSNotificationInfo.NotificationType.INCOMING_CALL;
                }
                com.airbnb.lottie.animation.keyframe.a.s("GNCSSettings.getNotificationTypeForPackage -> Not Treating as INCOMING_CALL for package [", str, "]");
            }
        } else if ("missed_call".equals(str2)) {
            com.airbnb.lottie.animation.keyframe.a.s("GNCSSettings.getNotificationTypeForPackage: Received notification of CATEGORY_MISSED_CALL from non dialer package [", str, "]");
            if (PhoneCallListener.CallState.INCOMING_MISSED == PhoneCallListener.INSTANCE.getCallState()) {
                com.airbnb.lottie.animation.keyframe.a.s("GNCSSettings.getNotificationTypeForPackage -> Treating as MISSED_CALL for package [", str, "]");
                return GNCSNotificationInfo.NotificationType.MISSED_CALL;
            }
        } else if (PhoneCallListener.CallState.INCOMING_MISSED == PhoneCallListener.INSTANCE.getCallState() && SmartNotificationsUtil.Packages.AOSP_TELECOM_SERVER_PACKAGE_NAME.equals(str)) {
            return GNCSNotificationInfo.NotificationType.MISSED_CALL;
        }
        return (this.smsPackageList.contains(str) || SmsUtilKt.isDefaultSmsPackage(context, str)) ? GNCSNotificationInfo.NotificationType.SMS : GNCSNotificationInfo.NotificationType.OTHER;
    }

    public boolean isFollowingDND(Context context) {
        return getPrefs(context).getBoolean(PREF_FOLLOW_DND, false);
    }

    public boolean isPackageEnabled(String str) {
        return AppManager.INSTANCE.isPackageEnabled(str);
    }

    public void overrideDefaultPackageMap(Map<String, GNCSNotificationInfo.NotificationType> map) {
        this.defaultPackageMap.clear();
        this.defaultPackageMap.putAll(map);
    }

    public void performUpgrade() {
        AppManager.INSTANCE.upgrade();
    }

    @SuppressLint({"QueryPermissionsNeeded"})
    public void reloadPackages(Context context) {
        ih2.b.b("GNCSSettings.reloadPackages");
        HashSet hashSet = new HashSet();
        try {
            Intent intent = new Intent("android.intent.action.MAIN", (Uri) null);
            intent.addCategory("android.intent.category.LAUNCHER");
            Iterator<ResolveInfo> it = context.getPackageManager().queryIntentActivities(intent, 0).iterator();
            while (it.hasNext()) {
                hashSet.add(it.next().activityInfo.packageName);
            }
        } catch (Exception e4) {
            ih2.b.a(e4, "GNCSSettingsOptOut.reloadPackages -> loading apps displayable in launcher");
        }
        f3.m(hashSet, SmartNotificationsUtil.Packages.INCOMING_PACKAGE_NAME, SmartNotificationsUtil.Packages.MISSED_PACKAGE_NAME, SmartNotificationsUtil.Packages.VOICEMAIL_PACKAGE_NAME, SmartNotificationsUtil.Packages.AOSP_TELECOM_SERVER_PACKAGE_NAME);
        hashSet.add("com.android.mms.service");
        hashSet.add("com.samsung.android.app.telephonyui");
        hashSet.add("com.android.phone");
        this.installedPackages.clear();
        this.installedPackages.addAll(hashSet);
        this.dialerPackageList.clear();
        this.dialerPackageList.addAll(TelephonyUtilKt.loadDialerPackages(context));
        this.smsPackageList.clear();
        this.smsPackageList.addAll(SmsUtilKt.loadSmsPackages(context));
        SmartNotificationsConfig.getInstance().applyRemoteConfiguration();
        ih2.b.b("GNCSSettings.reloadPackages -> " + this.dialerPackageList.size() + " dialer app(s): " + this.dialerPackageList);
    }

    public void removeCallback(Callback callback) {
        this.callbacks.remove(callback);
    }

    public void removeOptOutSettingsChangedListener(GNCSOptOutSettingsChangedListener gNCSOptOutSettingsChangedListener) {
        this.optOutSettingsChangedListeners.remove(gNCSOptOutSettingsChangedListener);
    }

    public void save(GNCSApplicationInfo gNCSApplicationInfo) {
        saveInternal(gNCSApplicationInfo);
        if ("com.android.mms".equals(gNCSApplicationInfo.packageName)) {
            saveInternal(new GNCSApplicationInfo("com.android.mms.service", gNCSApplicationInfo.enabled));
        }
    }

    public void setFollowDND(Context context, boolean z14) {
        setFollowDNDPreference(context, z14).commit();
    }

    public void setLastUserNotified(Context context, long j8) {
        setTimestampUserNotified(context, j8).apply();
    }

    public void setLastUserNotifiedImmediate(Context context, long j8) {
        setTimestampUserNotified(context, j8).commit();
    }

    public boolean shouldSendToDevice(GNCSNotificationInfo gNCSNotificationInfo) {
        GNCSNotificationInfo.NotificationType notificationType;
        if (this.installedPackages.contains(gNCSNotificationInfo.packageName) || Objects.equals(gNCSNotificationInfo.packageName, SmartNotificationsUtil.Packages.ONGOING_PACKAGE_NAME) || (notificationType = gNCSNotificationInfo.type) == GNCSNotificationInfo.NotificationType.INCOMING_CALL || notificationType == GNCSNotificationInfo.NotificationType.MISSED_CALL || notificationType == GNCSNotificationInfo.NotificationType.VOICEMAIL || this.dialerPackageList.contains(gNCSNotificationInfo.packageName)) {
            Iterator<AbstractAppHandler> it = AbstractAppHandler.getGlobalHandlers().iterator();
            boolean zShouldSendToDevice = true;
            while (it.hasNext()) {
                zShouldSendToDevice = it.next().shouldSendToDevice(gNCSNotificationInfo, zShouldSendToDevice);
            }
            return AbstractAppHandler.getApplicationHandler(gNCSNotificationInfo.packageName, 0).shouldSendToDevice(gNCSNotificationInfo, zShouldSendToDevice);
        }
        ih2.b.b("GNCSSettings.shouldSendToDevice -> no, [" + gNCSNotificationInfo.packageName + "] is not one of our identified installed packages");
        return false;
    }

    public void save(List<GNCSApplicationInfo> list) {
        Iterator<GNCSApplicationInfo> it = list.iterator();
        while (it.hasNext()) {
            save(it.next());
        }
    }
}
