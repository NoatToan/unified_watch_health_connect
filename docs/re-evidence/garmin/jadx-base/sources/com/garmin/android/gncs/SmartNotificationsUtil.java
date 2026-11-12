package com.garmin.android.gncs;

import am.j;
import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Person;
import android.app.RemoteInput;
import android.companion.CompanionDeviceManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.service.notification.StatusBarNotification;
import android.text.TextUtils;
import com.garmin.android.apps.connectmobile.u1;
import com.garmin.android.gncs.analytics.AnalyticEventType;
import com.garmin.android.gncs.analytics.AnalyticsUtilKt;
import com.garmin.android.gncs.mms.GNCSMediaRequest;
import com.garmin.android.gncs.persistence.GNCSNotificationAction;
import com.garmin.android.gncs.settings.GNCSNotificationAccessActivity;
import com.garmin.android.gncs.settings.GNCSSettings;
import com.garmin.android.gncs.settings.SmartNotificationsConfig;
import com.garmin.android.util.DoNotAskPermissionAgainReceiver;
import com.google.common.primitives.UnsignedBytes;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;
import org.apache.commons.text.lookup.StringLookupFactory;
import p13.c0;
import z6.a0;
import z6.q;

/* JADX INFO: loaded from: classes11.dex */
public final class SmartNotificationsUtil {
    private static final String JAPANESE_REGEX = "([\\u3041-\\u3096\\u30A0-\\u30FF\\u3400-\\u4DB5\\u4E00-\\u9FCB\\uF900-\\uFA6A\\u2E80-\\u2FD5\\uFF5F-\\uFF9F\\u3000-\\u303F])";
    private static final String TAG = "SmartNotifsUtil: ";
    private static final String regex = "([\\u20a0-\\u32ff\\ud83c\\udc00-\\ud83d\\udeff\\udbb9\\udce5-\\udbb9\\udcee])";

    public static final class Packages {
        public static final String AOSP_TELECOM_SERVER_PACKAGE_NAME = "com.android.server.telecom";
        public static final String ASUS_INCALL_UI_PACKAGE_NAME = "com.asus.asusincallui";
        public static final String FOSSIFY_CALLER_PACKAGE_NAME = "org.fossify.phone";
        public static final String GOOGLE_MESSAGES_APP_PACKAGE_NAME = "com.google.android.apps.messaging";
        public static final String INCOMING_PACKAGE_NAME = "com.garmin.gncs.phone.incoming";
        public static final String MISSED_PACKAGE_NAME = "com.garmin.gncs.phone.missed";
        public static final String NOTIFICATION_SETUP_INDICATOR_PACKAGE_NAME = "com.garmin.gncs.upgraded";
        public static final String ONGOING_PACKAGE_NAME = "com.garmin.gncs.phone.ongoing";
        public static final String SAMSUNG_CALENDAR_PACKAGE_NAME = "com.samsung.android.calendar";
        public static final String SAMSUNG_INCALL_UI_PACKAGE_NAME = "com.samsung.android.incallui";
        public static final String TRUE_CALLER_PACKAGE_NAME = "com.truecaller";
        public static final String VOICEMAIL_PACKAGE_NAME = "com.garmin.gncs.voicemail";
        private static final String RING_APP_PACKAGE_NAME = "com.ringapp";
        private static final String BLINK_APP_PACKAGE_NAME = "com.immediasemi.android.blink";
        public static final List<String> PACKAGES_WITH_REMOTE_VIEW_IMAGES = Arrays.asList(RING_APP_PACKAGE_NAME, BLINK_APP_PACKAGE_NAME);
    }

    private SmartNotificationsUtil() {
    }

    private static void appendActions(List<Notification.Action> list, StringBuilder sb3) {
        int i14 = 0;
        for (Notification.Action action : list) {
            boolean z14 = true;
            i14++;
            if (action != null) {
                sb3.append("    Action ");
                sb3.append(i14);
                sb3.append(" -> Title: ");
                sb3.append(action.title);
                sb3.append('\n');
                sb3.append("        ActionIntent: ");
                sb3.append(action.actionIntent != null ? "Yes" : "No");
                sb3.append('\n');
                Bundle extras = action.getExtras();
                if (extras != null) {
                    sb3.append("        Extras >>>");
                    sb3.append('\n');
                    for (String str : extras.keySet()) {
                        Object obj = extras.get(str);
                        if (obj != null) {
                            sb3.append("            ");
                            sb3.append(str);
                            sb3.append(": ");
                            sb3.append(obj.toString());
                            sb3.append('\n');
                        } else {
                            sb3.append("            ");
                            sb3.append(str);
                            sb3.append(": null");
                            sb3.append('\n');
                        }
                    }
                }
                RemoteInput[] remoteInputs = action.getRemoteInputs();
                if (remoteInputs != null && remoteInputs.length > 0) {
                    sb3.append("        Action allows remote inputs");
                    sb3.append('\n');
                    int length = remoteInputs.length;
                    int i15 = 0;
                    while (true) {
                        if (i15 >= length) {
                            z14 = false;
                            break;
                        } else if (remoteInputs[i15].getAllowFreeFormInput()) {
                            break;
                        } else {
                            i15++;
                        }
                    }
                    sb3.append("        Action allows free form input: ");
                    sb3.append(z14 ? "Yes" : "No");
                    sb3.append('\n');
                }
                sb3.append("        Allow Generated Replies: ");
                sb3.append(action.getAllowGeneratedReplies() ? "Yes" : "No");
                sb3.append('\n');
                RemoteInput[] dataOnlyRemoteInputs = action.getDataOnlyRemoteInputs();
                if (dataOnlyRemoteInputs != null && dataOnlyRemoteInputs.length > 0) {
                    sb3.append("        Action requires remote inputs that only accept data");
                    sb3.append('\n');
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:109:0x032f A[Catch: all -> 0x072c, Exception -> 0x0743, TryCatch #2 {Exception -> 0x0743, all -> 0x072c, blocks: (B:7:0x001a, B:10:0x0068, B:12:0x00a6, B:14:0x00ac, B:15:0x00b2, B:17:0x00b8, B:21:0x00d0, B:22:0x00d4, B:24:0x00dc, B:26:0x011b, B:27:0x012e, B:31:0x014f, B:35:0x0198, B:39:0x01ac, B:41:0x01b4, B:43:0x01b8, B:45:0x01bb, B:47:0x01d2, B:49:0x01dd, B:51:0x01e3, B:53:0x01f4, B:57:0x0200, B:60:0x020e, B:62:0x0227, B:64:0x023a, B:65:0x024b, B:67:0x024f, B:69:0x0268, B:71:0x027b, B:72:0x028c, B:74:0x0291, B:75:0x02a3, B:77:0x02a9, B:81:0x02be, B:132:0x03c6, B:84:0x02c8, B:87:0x02d2, B:90:0x02dc, B:93:0x02e6, B:95:0x02ee, B:99:0x0302, B:100:0x0309, B:105:0x031a, B:107:0x0322, B:109:0x032f, B:111:0x0362, B:113:0x0369, B:103:0x0312, B:114:0x0372, B:117:0x037b, B:120:0x0384, B:123:0x038d, B:125:0x0395, B:127:0x039d, B:129:0x03aa, B:130:0x03be, B:133:0x03e1, B:135:0x03f2, B:137:0x03f8, B:138:0x0404, B:143:0x0429, B:147:0x043e, B:151:0x0453, B:155:0x0468, B:159:0x047d, B:163:0x0491, B:167:0x04a7, B:171:0x04bd, B:175:0x04d2, B:179:0x04e8, B:182:0x04f9, B:186:0x053c, B:190:0x0551, B:187:0x0540, B:188:0x0546, B:189:0x054c, B:52:0x01ef, B:46:0x01cd, B:191:0x0561, B:193:0x061f, B:195:0x0625, B:196:0x062b, B:198:0x0631, B:202:0x0661, B:203:0x0668, B:207:0x0678, B:211:0x068c), top: B:218:0x001a }] */
    /* JADX WARN: Code duplicated, block: B:111:0x0362 A[Catch: all -> 0x072c, Exception -> 0x0743, TryCatch #2 {Exception -> 0x0743, all -> 0x072c, blocks: (B:7:0x001a, B:10:0x0068, B:12:0x00a6, B:14:0x00ac, B:15:0x00b2, B:17:0x00b8, B:21:0x00d0, B:22:0x00d4, B:24:0x00dc, B:26:0x011b, B:27:0x012e, B:31:0x014f, B:35:0x0198, B:39:0x01ac, B:41:0x01b4, B:43:0x01b8, B:45:0x01bb, B:47:0x01d2, B:49:0x01dd, B:51:0x01e3, B:53:0x01f4, B:57:0x0200, B:60:0x020e, B:62:0x0227, B:64:0x023a, B:65:0x024b, B:67:0x024f, B:69:0x0268, B:71:0x027b, B:72:0x028c, B:74:0x0291, B:75:0x02a3, B:77:0x02a9, B:81:0x02be, B:132:0x03c6, B:84:0x02c8, B:87:0x02d2, B:90:0x02dc, B:93:0x02e6, B:95:0x02ee, B:99:0x0302, B:100:0x0309, B:105:0x031a, B:107:0x0322, B:109:0x032f, B:111:0x0362, B:113:0x0369, B:103:0x0312, B:114:0x0372, B:117:0x037b, B:120:0x0384, B:123:0x038d, B:125:0x0395, B:127:0x039d, B:129:0x03aa, B:130:0x03be, B:133:0x03e1, B:135:0x03f2, B:137:0x03f8, B:138:0x0404, B:143:0x0429, B:147:0x043e, B:151:0x0453, B:155:0x0468, B:159:0x047d, B:163:0x0491, B:167:0x04a7, B:171:0x04bd, B:175:0x04d2, B:179:0x04e8, B:182:0x04f9, B:186:0x053c, B:190:0x0551, B:187:0x0540, B:188:0x0546, B:189:0x054c, B:52:0x01ef, B:46:0x01cd, B:191:0x0561, B:193:0x061f, B:195:0x0625, B:196:0x062b, B:198:0x0631, B:202:0x0661, B:203:0x0668, B:207:0x0678, B:211:0x068c), top: B:218:0x001a }] */
    /* JADX WARN: Code duplicated, block: B:112:0x0367  */
    /* JADX WARN: Code duplicated, block: B:135:0x03f2 A[Catch: all -> 0x072c, Exception -> 0x0743, TryCatch #2 {Exception -> 0x0743, all -> 0x072c, blocks: (B:7:0x001a, B:10:0x0068, B:12:0x00a6, B:14:0x00ac, B:15:0x00b2, B:17:0x00b8, B:21:0x00d0, B:22:0x00d4, B:24:0x00dc, B:26:0x011b, B:27:0x012e, B:31:0x014f, B:35:0x0198, B:39:0x01ac, B:41:0x01b4, B:43:0x01b8, B:45:0x01bb, B:47:0x01d2, B:49:0x01dd, B:51:0x01e3, B:53:0x01f4, B:57:0x0200, B:60:0x020e, B:62:0x0227, B:64:0x023a, B:65:0x024b, B:67:0x024f, B:69:0x0268, B:71:0x027b, B:72:0x028c, B:74:0x0291, B:75:0x02a3, B:77:0x02a9, B:81:0x02be, B:132:0x03c6, B:84:0x02c8, B:87:0x02d2, B:90:0x02dc, B:93:0x02e6, B:95:0x02ee, B:99:0x0302, B:100:0x0309, B:105:0x031a, B:107:0x0322, B:109:0x032f, B:111:0x0362, B:113:0x0369, B:103:0x0312, B:114:0x0372, B:117:0x037b, B:120:0x0384, B:123:0x038d, B:125:0x0395, B:127:0x039d, B:129:0x03aa, B:130:0x03be, B:133:0x03e1, B:135:0x03f2, B:137:0x03f8, B:138:0x0404, B:143:0x0429, B:147:0x043e, B:151:0x0453, B:155:0x0468, B:159:0x047d, B:163:0x0491, B:167:0x04a7, B:171:0x04bd, B:175:0x04d2, B:179:0x04e8, B:182:0x04f9, B:186:0x053c, B:190:0x0551, B:187:0x0540, B:188:0x0546, B:189:0x054c, B:52:0x01ef, B:46:0x01cd, B:191:0x0561, B:193:0x061f, B:195:0x0625, B:196:0x062b, B:198:0x0631, B:202:0x0661, B:203:0x0668, B:207:0x0678, B:211:0x068c), top: B:218:0x001a }] */
    /* JADX WARN: Code duplicated, block: B:136:0x03f7  */
    /* JADX WARN: Code duplicated, block: B:259:0x0322 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:265:0x02a3 A[SYNTHETIC] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static void dumpNotificationInfo(StatusBarNotification statusBarNotification, GNCSNotificationInfo gNCSNotificationInfo) {
        Parcelable[] parcelableArray;
        int i14;
        Uri imageUri;
        String string;
        Object obj;
        String string2;
        if (statusBarNotification.getNotification() == null || !StringLookupFactory.KEY_SYS.equals(statusBarNotification.getNotification().category)) {
            try {
                StringBuilder sb3 = new StringBuilder(TAG);
                sb3.append("StatusBar Package: ");
                sb3.append(statusBarNotification.getPackageName());
                sb3.append('\n');
                sb3.append("StatusBar ID: ");
                sb3.append(statusBarNotification.getId());
                sb3.append('\n');
                sb3.append("StatusBar Key: ");
                sb3.append(obfuscateIfNeeded(statusBarNotification.getKey()));
                sb3.append('\n');
                if (!SmartNotificationsConfig.getInstance().isVerboseLoggingEnabled()) {
                    sb3.append("dumpNotificationInfo: PackageName [");
                    sb3.append(statusBarNotification.getPackageName());
                    sb3.append("]");
                    sb3.append(", ID [");
                    sb3.append(statusBarNotification.getId());
                    sb3.append("]");
                    sb3.append(", Key [");
                    sb3.append(obfuscateIfNeeded(statusBarNotification.getKey()));
                    sb3.append("]");
                    sb3.append('\n');
                    sb3.append("    Actions: ");
                    sb3.append('\n');
                    List<GNCSNotificationAction> list = gNCSNotificationInfo.actions;
                    if (list != null && !list.isEmpty()) {
                        for (GNCSNotificationAction gNCSNotificationAction : gNCSNotificationInfo.actions) {
                            sb3.append("        ");
                            sb3.append(gNCSNotificationAction.title);
                            sb3.append(" -> requires input: ");
                            sb3.append(gNCSNotificationAction.requiresInput ? "Yes" : "No");
                        }
                    }
                    ih2.b.b(sb3.toString());
                    return;
                }
                sb3.append("dumpNotificationInfo");
                sb3.append('\n');
                sb3.append("PackageName: ");
                sb3.append(statusBarNotification.getPackageName());
                sb3.append('\n');
                sb3.append("Id: ");
                sb3.append(statusBarNotification.getId());
                sb3.append('\n');
                sb3.append("Key: ");
                sb3.append(obfuscateIfNeeded(statusBarNotification.getKey()));
                sb3.append('\n');
                Notification notification = statusBarNotification.getNotification();
                if (notification != null) {
                    sb3.append("Group: ");
                    sb3.append(obfuscateIfNeeded(notification.getGroup()));
                    sb3.append('\n');
                }
                sb3.append("GroupKey: ");
                sb3.append(obfuscateIfNeeded(statusBarNotification.getGroupKey()));
                sb3.append('\n');
                sb3.append("IsGroup: ");
                sb3.append(statusBarNotification.isGroup() ? "Yes" : "No");
                sb3.append('\n');
                sb3.append("OverrideGroupKey: ");
                sb3.append(obfuscateIfNeeded(statusBarNotification.getOverrideGroupKey()));
                sb3.append('\n');
                sb3.append("PostTime: ");
                sb3.append(statusBarNotification.getPostTime());
                sb3.append('\n');
                sb3.append("Tag: ");
                sb3.append(obfuscateIfNeeded(statusBarNotification.getTag()));
                sb3.append('\n');
                sb3.append("IsClearable: ");
                sb3.append(statusBarNotification.isClearable() ? "Yes" : "No");
                sb3.append('\n');
                sb3.append("IsOngoing: ");
                sb3.append(statusBarNotification.isOngoing() ? "Yes" : "No");
                sb3.append('\n');
                if (notification != null) {
                    Notification.Action[] actionArr = notification.actions;
                    if (actionArr == null || actionArr.length <= 0) {
                        sb3.append("Actions: NONE\n");
                    } else {
                        sb3.append("Actions >>>");
                        sb3.append('\n');
                        appendActions(Arrays.asList(notification.actions), sb3);
                    }
                    List<Notification.Action> actions = new Notification.WearableExtender(notification).getActions();
                    if (actions == null || actions.isEmpty()) {
                        sb3.append("Wearable Actions: NONE\n");
                    } else {
                        sb3.append("Wearable Actions >>>");
                        sb3.append('\n');
                        appendActions(actions, sb3);
                    }
                    sb3.append("Category: ");
                    String str = notification.category;
                    if (str == null) {
                        str = "UNKNOWN";
                    }
                    sb3.append(str);
                    sb3.append('\n');
                    if (notification.contentIntent != null) {
                        sb3.append("ContentIntent: ");
                        sb3.append(notification.contentIntent.getCreatorPackage());
                        sb3.append('\n');
                        Intent intent = getIntent(notification.contentIntent);
                        if (intent != null) {
                            sb3.append("    Action: ");
                            sb3.append(intent.getAction());
                            sb3.append('\n');
                            if (intent.getComponent() != null) {
                                sb3.append("    Component: ");
                                sb3.append(intent.getComponent().flattenToShortString());
                                sb3.append('\n');
                            }
                        }
                    }
                    if (notification.deleteIntent != null) {
                        sb3.append("DeleteIntent: ");
                        sb3.append(notification.deleteIntent.getCreatorPackage());
                        sb3.append('\n');
                        Intent intent2 = getIntent(notification.deleteIntent);
                        if (intent2 != null) {
                            sb3.append("    Action: ");
                            sb3.append(intent2.getAction());
                            sb3.append('\n');
                            if (intent2.getComponent() != null) {
                                sb3.append("    Component: ");
                                sb3.append(intent2.getComponent().flattenToShortString());
                                sb3.append('\n');
                            }
                        }
                    }
                    if (notification.extras != null) {
                        sb3.append("Extras >>>");
                        sb3.append('\n');
                        for (String str2 : notification.extras.keySet()) {
                            switch (str2.hashCode()) {
                                case -2079427047:
                                    if (str2.equals("android.title")) {
                                        sb3.append("    ");
                                        sb3.append(str2);
                                        sb3.append(": ");
                                        sb3.append(obfuscateIfNeeded(notification.extras.getCharSequence(str2)));
                                        sb3.append('\n');
                                    } else {
                                        obj = notification.extras.get(str2);
                                        sb3.append("    ");
                                        sb3.append(str2);
                                        sb3.append(": ");
                                        if (obj != null) {
                                            string2 = obj.toString();
                                        } else {
                                            string2 = null;
                                        }
                                        sb3.append(obfuscateIfNeeded(string2));
                                        sb3.append('\n');
                                    }
                                    break;
                                case -1915758317:
                                    if (str2.equals("android.textLines")) {
                                        CharSequence[] charSequenceArray = notification.extras.getCharSequenceArray(str2);
                                        if (charSequenceArray != null) {
                                            sb3.append("    ");
                                            sb3.append(str2);
                                            sb3.append(":\n");
                                            for (CharSequence charSequence : charSequenceArray) {
                                                sb3.append("      ");
                                                sb3.append(obfuscateIfNeeded(charSequence));
                                                sb3.append('\n');
                                            }
                                        }
                                    } else {
                                        obj = notification.extras.get(str2);
                                        sb3.append("    ");
                                        sb3.append(str2);
                                        sb3.append(": ");
                                        if (obj != null) {
                                            string2 = obj.toString();
                                        } else {
                                            string2 = null;
                                        }
                                        sb3.append(obfuscateIfNeeded(string2));
                                        sb3.append('\n');
                                    }
                                    break;
                                case -1897567786:
                                    if (str2.equals("android.conversationTitle")) {
                                        sb3.append("    ");
                                        sb3.append(str2);
                                        sb3.append(": ");
                                        sb3.append(obfuscateIfNeeded(notification.extras.getCharSequence(str2)));
                                        sb3.append('\n');
                                    } else {
                                        obj = notification.extras.get(str2);
                                        sb3.append("    ");
                                        sb3.append(str2);
                                        sb3.append(": ");
                                        if (obj != null) {
                                            string2 = obj.toString();
                                        } else {
                                            string2 = null;
                                        }
                                        sb3.append(obfuscateIfNeeded(string2));
                                        sb3.append('\n');
                                    }
                                    break;
                                case -1730887922:
                                    if (str2.equals("android.subText")) {
                                        sb3.append("    ");
                                        sb3.append(str2);
                                        sb3.append(": ");
                                        sb3.append(obfuscateIfNeeded(notification.extras.getCharSequence(str2)));
                                        sb3.append('\n');
                                    } else {
                                        obj = notification.extras.get(str2);
                                        sb3.append("    ");
                                        sb3.append(str2);
                                        sb3.append(": ");
                                        if (obj != null) {
                                            string2 = obj.toString();
                                        } else {
                                            string2 = null;
                                        }
                                        sb3.append(obfuscateIfNeeded(string2));
                                        sb3.append('\n');
                                    }
                                    break;
                                case -1036913332:
                                    if (str2.equals("android.text")) {
                                        sb3.append("    ");
                                        sb3.append(str2);
                                        sb3.append(": ");
                                        sb3.append(obfuscateIfNeeded(notification.extras.getCharSequence(str2)));
                                        sb3.append('\n');
                                    } else {
                                        obj = notification.extras.get(str2);
                                        sb3.append("    ");
                                        sb3.append(str2);
                                        sb3.append(": ");
                                        if (obj != null) {
                                            string2 = obj.toString();
                                        } else {
                                            string2 = null;
                                        }
                                        sb3.append(obfuscateIfNeeded(string2));
                                        sb3.append('\n');
                                    }
                                    break;
                                case -707785470:
                                    if (str2.equals("android.messages.historic")) {
                                        parcelableArray = notification.extras.getParcelableArray(str2);
                                        if (parcelableArray != null) {
                                            sb3.append("    ");
                                            sb3.append(str2);
                                            sb3.append(":\n");
                                            for (Parcelable parcelable : parcelableArray) {
                                                sb3.append("        Sender: ");
                                                sb3.append(obfuscateIfNeeded(getMessageSender(parcelable)));
                                                sb3.append('\n');
                                                sb3.append("        Text: ");
                                                sb3.append(obfuscateIfNeeded(getMessageText(parcelable)));
                                                sb3.append('\n');
                                                imageUri = getImageUri(parcelable);
                                                sb3.append("        URI: ");
                                                if (imageUri != null) {
                                                    string = imageUri.toString();
                                                } else {
                                                    string = "";
                                                }
                                                sb3.append(string);
                                                sb3.append('\n');
                                            }
                                        }
                                    } else {
                                        obj = notification.extras.get(str2);
                                        sb3.append("    ");
                                        sb3.append(str2);
                                        sb3.append(": ");
                                        if (obj != null) {
                                            string2 = obj.toString();
                                        } else {
                                            string2 = null;
                                        }
                                        sb3.append(obfuscateIfNeeded(string2));
                                        sb3.append('\n');
                                    }
                                    break;
                                case -489846293:
                                    if (str2.equals("android.messages")) {
                                        parcelableArray = notification.extras.getParcelableArray(str2);
                                        if (parcelableArray != null) {
                                            sb3.append("    ");
                                            sb3.append(str2);
                                            sb3.append(":\n");
                                            while (i14 < r11) {
                                                sb3.append("        Sender: ");
                                                sb3.append(obfuscateIfNeeded(getMessageSender(parcelable)));
                                                sb3.append('\n');
                                                sb3.append("        Text: ");
                                                sb3.append(obfuscateIfNeeded(getMessageText(parcelable)));
                                                sb3.append('\n');
                                                imageUri = getImageUri(parcelable);
                                                sb3.append("        URI: ");
                                                if (imageUri != null) {
                                                    string = imageUri.toString();
                                                } else {
                                                    string = "";
                                                }
                                                sb3.append(string);
                                                sb3.append('\n');
                                            }
                                        }
                                    } else {
                                        obj = notification.extras.get(str2);
                                        sb3.append("    ");
                                        sb3.append(str2);
                                        sb3.append(": ");
                                        if (obj != null) {
                                            string2 = obj.toString();
                                        } else {
                                            string2 = null;
                                        }
                                        sb3.append(obfuscateIfNeeded(string2));
                                        sb3.append('\n');
                                    }
                                    break;
                                case -102440555:
                                    if (str2.equals("android.largeIcon")) {
                                        sb3.append("    ");
                                        sb3.append("hasLargeIcon");
                                        sb3.append(": ");
                                        sb3.append(notification.getLargeIcon() != null);
                                        sb3.append('\n');
                                    } else {
                                        obj = notification.extras.get(str2);
                                        sb3.append("    ");
                                        sb3.append(str2);
                                        sb3.append(": ");
                                        if (obj != null) {
                                            string2 = obj.toString();
                                        } else {
                                            string2 = null;
                                        }
                                        sb3.append(obfuscateIfNeeded(string2));
                                        sb3.append('\n');
                                    }
                                    break;
                                case 22486478:
                                    if (str2.equals("android.bigText")) {
                                        sb3.append("    ");
                                        sb3.append(str2);
                                        sb3.append(": ");
                                        sb3.append(obfuscateIfNeeded(notification.extras.getCharSequence(str2)));
                                        sb3.append('\n');
                                    } else {
                                        obj = notification.extras.get(str2);
                                        sb3.append("    ");
                                        sb3.append(str2);
                                        sb3.append(": ");
                                        if (obj != null) {
                                            string2 = obj.toString();
                                        } else {
                                            string2 = null;
                                        }
                                        sb3.append(obfuscateIfNeeded(string2));
                                        sb3.append('\n');
                                    }
                                    break;
                                case 150183834:
                                    if (str2.equals("android.infoText")) {
                                        sb3.append("    ");
                                        sb3.append(str2);
                                        sb3.append(": ");
                                        sb3.append(obfuscateIfNeeded(notification.extras.getCharSequence(str2)));
                                        sb3.append('\n');
                                    } else {
                                        obj = notification.extras.get(str2);
                                        sb3.append("    ");
                                        sb3.append(str2);
                                        sb3.append(": ");
                                        if (obj != null) {
                                            string2 = obj.toString();
                                        } else {
                                            string2 = null;
                                        }
                                        sb3.append(obfuscateIfNeeded(string2));
                                        sb3.append('\n');
                                    }
                                    break;
                                case 967367924:
                                    if (str2.equals("android.summaryText")) {
                                        sb3.append("    ");
                                        sb3.append(str2);
                                        sb3.append(": ");
                                        sb3.append(obfuscateIfNeeded(notification.extras.getCharSequence(str2)));
                                        sb3.append('\n');
                                    } else {
                                        obj = notification.extras.get(str2);
                                        sb3.append("    ");
                                        sb3.append(str2);
                                        sb3.append(": ");
                                        if (obj != null) {
                                            string2 = obj.toString();
                                        } else {
                                            string2 = null;
                                        }
                                        sb3.append(obfuscateIfNeeded(string2));
                                        sb3.append('\n');
                                    }
                                    break;
                                case 1297754027:
                                    if (str2.equals("android.title.big")) {
                                        sb3.append("    ");
                                        sb3.append(str2);
                                        sb3.append(": ");
                                        sb3.append(obfuscateIfNeeded(notification.extras.getCharSequence(str2)));
                                        sb3.append('\n');
                                    } else {
                                        obj = notification.extras.get(str2);
                                        sb3.append("    ");
                                        sb3.append(str2);
                                        sb3.append(": ");
                                        if (obj != null) {
                                            string2 = obj.toString();
                                        } else {
                                            string2 = null;
                                        }
                                        sb3.append(obfuscateIfNeeded(string2));
                                        sb3.append('\n');
                                    }
                                    break;
                                default:
                                    obj = notification.extras.get(str2);
                                    sb3.append("    ");
                                    sb3.append(str2);
                                    sb3.append(": ");
                                    if (obj != null) {
                                        string2 = obj.toString();
                                    } else {
                                        string2 = null;
                                    }
                                    sb3.append(obfuscateIfNeeded(string2));
                                    sb3.append('\n');
                                    break;
                            }
                        }
                    }
                    sb3.append("Flags (");
                    sb3.append(notification.flags);
                    sb3.append(") >>>");
                    sb3.append('\n');
                    sb3.append("    AUTO_CANCEL: ");
                    sb3.append((notification.flags & 16) == 16 ? "Y" : "N");
                    sb3.append('\n');
                    sb3.append("    BUBBLE: ");
                    sb3.append((notification.flags & 4096) == 4096 ? "Y" : "N");
                    sb3.append('\n');
                    sb3.append("    FOREGROUND_SERVICE: ");
                    sb3.append((notification.flags & 64) == 64 ? "Y" : "N");
                    sb3.append('\n');
                    sb3.append("    GROUP_SUMMARY: ");
                    sb3.append((notification.flags & 512) == 512 ? "Y" : "N");
                    sb3.append('\n');
                    sb3.append("    HIGH_PRIORITY: ");
                    sb3.append((notification.flags & 128) == 128 ? "Y" : "N");
                    sb3.append('\n');
                    sb3.append("    INSISTENT: ");
                    sb3.append((notification.flags & 4) == 4 ? "Y" : "N");
                    sb3.append('\n');
                    sb3.append("    LOCAL_ONLY: ");
                    sb3.append((notification.flags & 256) == 256 ? "Y" : "N");
                    sb3.append('\n');
                    sb3.append("    NO_CLEAR: ");
                    sb3.append((notification.flags & 32) == 32 ? "Y" : "N");
                    sb3.append('\n');
                    sb3.append("    ONGOING_EVENT: ");
                    sb3.append((notification.flags & 2) == 2 ? "Y" : "N");
                    sb3.append('\n');
                    sb3.append("    ONLY_ALERT_ONCE: ");
                    sb3.append((notification.flags & 8) == 8 ? "Y" : "N");
                    sb3.append('\n');
                    sb3.append("    SHOW_LIGHTS: ");
                    sb3.append((notification.flags & 1) == 1 ? "Y" : "N");
                    sb3.append('\n');
                    sb3.append("NumberEvents: ");
                    sb3.append(notification.number);
                    sb3.append('\n');
                    sb3.append("Priority: ");
                    sb3.append(getPriority(notification.priority));
                    sb3.append('\n');
                    sb3.append("TickerText: ");
                    sb3.append(obfuscateIfNeeded(notification.tickerText));
                    sb3.append('\n');
                    sb3.append("Visibility: ");
                    int i15 = notification.visibility;
                    if (i15 == -1) {
                        sb3.append("SECRET");
                    } else if (i15 == 0) {
                        sb3.append("PRIVATE");
                    } else if (i15 != 1) {
                        sb3.append(i15);
                    } else {
                        sb3.append("PUBLIC");
                    }
                    sb3.append('\n');
                    sb3.append("When: ");
                    sb3.append(notification.when);
                    sb3.append('\n');
                }
                sb3.append('\n');
                sb3.append("==== GNCSParsedNotification ====");
                sb3.append('\n');
                sb3.append("    Title: ");
                sb3.append(obfuscateIfNeeded(gNCSNotificationInfo.title));
                sb3.append('\n');
                sb3.append("    SubTitle: ");
                sb3.append(obfuscateIfNeeded(gNCSNotificationInfo.subTitle));
                sb3.append('\n');
                sb3.append("    Message: ");
                sb3.append(obfuscateIfNeeded(gNCSNotificationInfo.message));
                sb3.append('\n');
                sb3.append("    PositiveAction: ");
                sb3.append(gNCSNotificationInfo.positiveAction);
                sb3.append('\n');
                sb3.append("    NegativeAction: ");
                sb3.append(gNCSNotificationInfo.negativeAction);
                sb3.append('\n');
                sb3.append("    Status: ");
                sb3.append(gNCSNotificationInfo.status.name());
                sb3.append('\n');
                sb3.append("    CacheId: ");
                sb3.append(gNCSNotificationInfo.cacheId);
                sb3.append('\n');
                sb3.append("    CacheKey: ");
                sb3.append(obfuscateIfNeeded(gNCSNotificationInfo.cacheKey));
                sb3.append('\n');
                sb3.append("    ConversationId: ");
                sb3.append(gNCSNotificationInfo.conversationId);
                sb3.append("\n");
                sb3.append("    NotificationKey: ");
                sb3.append(obfuscateIfNeeded(gNCSNotificationInfo.notificationKey));
                sb3.append('\n');
                sb3.append("    PackageName: ");
                sb3.append(gNCSNotificationInfo.packageName);
                sb3.append('\n');
                sb3.append("    Actions: ");
                sb3.append('\n');
                List<GNCSNotificationAction> list2 = gNCSNotificationInfo.actions;
                if (list2 != null && !list2.isEmpty()) {
                    for (GNCSNotificationAction gNCSNotificationAction2 : gNCSNotificationInfo.actions) {
                        sb3.append("        ");
                        sb3.append(gNCSNotificationAction2.title);
                        sb3.append(", id: ");
                        sb3.append(gNCSNotificationAction2.id);
                        sb3.append(", type: ");
                        sb3.append(gNCSNotificationAction2.actionType.name());
                        sb3.append(" -> requires input: ");
                        sb3.append(gNCSNotificationAction2.requiresInput ? "Yes" : "No");
                        sb3.append('\n');
                    }
                }
                sb3.append("    IsGroup: ");
                sb3.append(gNCSNotificationInfo.isGroup() ? "YES" : "NO/UNKNOWN");
                sb3.append('\n');
                sb3.append("    IsSuppressed: ");
                sb3.append(gNCSNotificationInfo.isSuppressed ? "YES" : "NO");
                sb3.append('\n');
                sb3.append("    NumEvents: ");
                sb3.append(gNCSNotificationInfo.numEvents);
                sb3.append('\n');
                sb3.append("    Priority: ");
                sb3.append(getPriority(gNCSNotificationInfo.priority));
                sb3.append('\n');
                sb3.append("    PostTime: ");
                sb3.append(gNCSNotificationInfo.postTime);
                sb3.append('\n');
                sb3.append("    When: ");
                sb3.append(gNCSNotificationInfo.when);
                sb3.append('\n');
                sb3.append("    NotificationType: ");
                sb3.append(gNCSNotificationInfo.type);
                sb3.append('\n');
                sb3.append("    ExtraFlags: ");
                sb3.append(gNCSNotificationInfo.extraFlags);
                sb3.append('\n');
                sb3.append("    NotificationFlags: ");
                sb3.append(gNCSNotificationInfo.notificationFlags);
                sb3.append('\n');
                sb3.append("    GroupKey: ");
                sb3.append(obfuscateIfNeeded(gNCSNotificationInfo.groupKey));
                sb3.append('\n');
                sb3.append("    PhoneNumber: ");
                sb3.append(obfuscateIfNeeded(gNCSNotificationInfo.phoneNumber));
                sb3.append('\n');
                sb3.append("    CallType: ");
                sb3.append(getCallType(gNCSNotificationInfo.callType));
                sb3.append('\n');
                ih2.b.b(sb3.toString());
            } catch (Exception e4) {
                ih2.b.a(e4, "SmartNotifsUtil: dumpNotificationInfo ");
            } catch (Throwable th3) {
                ih2.b.b("SmartNotifsUtil: dumpNotificationInfo -> " + th3.getLocalizedMessage());
            }
        }
    }

    public static List<GNCSNotificationAction> filterEmojiActions(List<GNCSNotificationAction> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (GNCSNotificationAction gNCSNotificationAction : list) {
            if (!isEmoji(gNCSNotificationAction.title)) {
                arrayList.add(gNCSNotificationAction);
            } else if (Locale.getDefault().getCountry().equalsIgnoreCase("JP") && isJapanese(gNCSNotificationAction.title)) {
                arrayList.add(gNCSNotificationAction);
            }
        }
        return arrayList;
    }

    private static List<String> filterGNCSPackagesFromList(List<String> list) {
        StringBuilder sb3 = new StringBuilder("SmartNotifsUtil: filterGNCSPackagesFromList -> Filtering out GNCS packages from list of packages [");
        sb3.append(list.size());
        sb3.append("]: ");
        sb3.append(list);
        List<String> list2 = (List) list.stream().filter(new g(0)).collect(Collectors.toList());
        sb3.append("\nFiltered packages [");
        sb3.append(list2.size());
        sb3.append("]: ");
        sb3.append(list2);
        ih2.b.b(sb3.toString());
        return list2;
    }

    public static List<AppNotificationStateInfo> getAllApplications(Context context, Boolean bool) {
        AppManager appManager = AppManager.INSTANCE;
        List<String> listFilterGNCSPackagesFromList = filterGNCSPackagesFromList(appManager.disabledPackages());
        ArrayList arrayList = new ArrayList();
        if (!bool.booleanValue()) {
            for (GNCSApplicationInfo gNCSApplicationInfo : (List) appManager.getAllApplications().stream().filter(new g(1)).collect(Collectors.toList())) {
                String str = gNCSApplicationInfo.packageName;
                arrayList.add(new AppNotificationStateInfo(str, getPackageDisplayName(context, str), !listFilterGNCSPackagesFromList.contains(gNCSApplicationInfo.packageName)));
            }
        } else {
            if (listFilterGNCSPackagesFromList.isEmpty()) {
                return Collections.EMPTY_LIST;
            }
            for (String str2 : listFilterGNCSPackagesFromList) {
                arrayList.add(new AppNotificationStateInfo(str2, getPackageDisplayName(context, str2), false));
            }
        }
        return arrayList;
    }

    public static byte[] getBytesFromInputStream(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            try {
                int i14 = inputStream.read(bArr);
                if (i14 == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, i14);
            } catch (Throwable th3) {
                try {
                    byteArrayOutputStream.close();
                } catch (IOException unused) {
                }
                throw th3;
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        try {
            byteArrayOutputStream.close();
        } catch (IOException unused2) {
        }
        return byteArray;
    }

    private static String getCallType(int i14) {
        if (i14 == 0) {
            return "CALL_TYPE_UNKNOWN";
        }
        if (i14 == 1) {
            return "CALL_TYPE_INCOMING";
        }
        if (i14 != 2) {
            return i14 != 3 ? String.valueOf(i14) : "CALL_TYPE_SCREENING";
        }
        return "CALL_TYPE_ONGOING";
    }

    public static String getHashForDisableApps() throws NoSuchAlgorithmException {
        List<String> listFilterGNCSPackagesFromList = filterGNCSPackagesFromList(AppManager.INSTANCE.disabledPackages());
        if (listFilterGNCSPackagesFromList.isEmpty()) {
            return null;
        }
        int i14 = ih2.d.f93519a;
        ArrayList<String> arrayList = new ArrayList(listFilterGNCSPackagesFromList);
        c0.t(arrayList);
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(MessageDigestAlgorithms.SHA_256);
            for (String str : arrayList) {
                messageDigest.update(ByteBuffer.allocate(4).putInt(str.length()).array());
                Charset charset = StandardCharsets.UTF_8;
                charset.getClass();
                byte[] bytes = str.getBytes(charset);
                bytes.getClass();
                messageDigest.update(bytes);
            }
            byte[] bArrDigest = messageDigest.digest();
            bArrDigest.getClass();
            StringBuilder sb3 = new StringBuilder();
            for (byte b14 : bArrDigest) {
                String hexString = Integer.toHexString(b14 & UnsignedBytes.MAX_VALUE);
                if (hexString.length() == 1) {
                    sb3.append('0');
                }
                sb3.append(hexString);
            }
            return sb3.toString();
        } catch (NoSuchAlgorithmException e4) {
            ih2.b.d("SHA-256 algorithm not found " + e4.getMessage());
            throw e4;
        }
    }

    public static byte[] getImageFromIcon(Bitmap bitmap, GNCSMediaRequest gNCSMediaRequest) {
        StringBuffer stringBuffer = new StringBuffer("MMS# SmartNotifsUtil: getImageFromIcon ->");
        double dCurrentTimeMillis = System.currentTimeMillis();
        byte[] byteArray = null;
        try {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            Bitmap bitmapResize = resize(bitmap, gNCSMediaRequest.getWidth(), gNCSMediaRequest.getHeight());
            stringBuffer.append("Original width and height is : ");
            stringBuffer.append(width);
            stringBuffer.append(" X ");
            stringBuffer.append(height);
            stringBuffer.append("\n New width and height is : ");
            stringBuffer.append(bitmapResize.getWidth());
            stringBuffer.append(" X ");
            stringBuffer.append(bitmapResize.getHeight());
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            stringBuffer.append("\n Compressing to ");
            stringBuffer.append(gNCSMediaRequest.getType().name());
            if (bitmapResize.compress(gNCSMediaRequest.getType().getFormat(), gNCSMediaRequest.getQuality(), byteArrayOutputStream)) {
                byteArray = byteArrayOutputStream.toByteArray();
            } else {
                ih2.b.d("MMS# SmartNotifsUtil: getImageFromIcon ->Compressing to " + gNCSMediaRequest.getType().name() + " failed");
            }
        } catch (Exception e4) {
            ih2.b.a(e4, "MMS# SmartNotifsUtil: getImageFromIcon ->Error creating image ");
        }
        stringBuffer.append("\n Size is ");
        stringBuffer.append(byteArray != null ? byteArray.length : 0);
        stringBuffer.append("\n completed in ");
        stringBuffer.append((System.currentTimeMillis() - dCurrentTimeMillis) / 1000.0d);
        stringBuffer.append(" sec");
        ih2.b.b(stringBuffer.toString());
        return byteArray;
    }

    public static byte[] getImageFromUri(Context context, Uri uri, GNCSMediaRequest gNCSMediaRequest) {
        byte[] bytesFromInputStream;
        double dCurrentTimeMillis = System.currentTimeMillis();
        byte[] byteArray = null;
        try {
            bytesFromInputStream = getBytesFromInputStream(context.getContentResolver().openInputStream(uri));
        } catch (Exception e4) {
            ih2.b.a(e4, "MMS# SmartNotifsUtil:  getImageFromUri -> Error reading data from uri [" + uri + "]");
            bytesFromInputStream = null;
        }
        if (bytesFromInputStream != null && bytesFromInputStream.length > 0) {
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeByteArray(bytesFromInputStream, 0, bytesFromInputStream.length, options);
                int iCeil = (int) Math.ceil(options.outHeight / gNCSMediaRequest.getHeight());
                int iCeil2 = (int) Math.ceil(options.outWidth / gNCSMediaRequest.getWidth());
                if (iCeil > 1 || iCeil2 > 1) {
                    if (iCeil > iCeil2) {
                        options.inSampleSize = iCeil;
                    } else {
                        options.inSampleSize = iCeil2;
                    }
                }
                options.inJustDecodeBounds = false;
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bytesFromInputStream, 0, bytesFromInputStream.length, options);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                if (bitmapDecodeByteArray.compress(gNCSMediaRequest.getType().getFormat(), gNCSMediaRequest.getQuality(), byteArrayOutputStream)) {
                    byteArray = byteArrayOutputStream.toByteArray();
                } else {
                    ih2.b.b("MMS# SmartNotifsUtil:  getImageFromUri -> Compressing to " + gNCSMediaRequest.getType().name() + " failed");
                }
            } catch (Exception e14) {
                ih2.b.a(e14, "MMS# SmartNotifsUtil:  getImageFromUri -> Error creating image ");
            }
        }
        StringBuilder sb3 = new StringBuilder("MMS# SmartNotifsUtil:  getImageFromUri -> Size is ");
        sb3.append(byteArray != null ? byteArray.length : 0);
        sb3.append(" , completed in ");
        sb3.append((System.currentTimeMillis() - dCurrentTimeMillis) / 1000.0d);
        sb3.append(" sec");
        ih2.b.b(sb3.toString());
        return byteArray;
    }

    private static Uri getImageUri(Parcelable parcelable) {
        Bundle bundle;
        String string;
        if ((parcelable instanceof Bundle) && (string = (bundle = (Bundle) parcelable).getString(NotificationConstants.KEY_DATA_MIME_TYPE)) != null && string.startsWith("image/")) {
            return (Uri) bundle.get("uri");
        }
        return null;
    }

    private static Intent getIntent(PendingIntent pendingIntent) {
        return null;
    }

    private static CharSequence getMessageSender(Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            return null;
        }
        Bundle bundle = (Bundle) parcelable;
        Parcelable parcelable2 = bundle.getParcelable(NotificationConstants.KEY_MESSAGE_SENDER_PERSON);
        return parcelable2 instanceof Person ? ((Person) parcelable2).getName() : bundle.getCharSequence(NotificationConstants.KEY_MESSAGE_SENDER);
    }

    private static CharSequence getMessageText(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            return ((Bundle) parcelable).getCharSequence("text");
        }
        return null;
    }

    public static String getPackageDisplayName(Context context, String str) {
        if (str.equals(Packages.INCOMING_PACKAGE_NAME)) {
            return context.getString(R.string.incoming_call_type);
        }
        if (str.equals(Packages.MISSED_PACKAGE_NAME)) {
            return context.getString(R.string.missed_call_type);
        }
        if (str.equals(Packages.VOICEMAIL_PACKAGE_NAME)) {
            return context.getString(R.string.voicemail_type);
        }
        if (str.equals("com.google.android.googlequicksearchbox")) {
            return "Google Now";
        }
        if (context != null) {
            try {
                PackageManager packageManager = context.getPackageManager();
                return packageManager.getApplicationLabel(packageManager.getApplicationInfo(str, 0)).toString();
            } catch (Exception unused) {
            }
        }
        return str;
    }

    private static String getPriority(int i14) {
        if (i14 == -2) {
            return "MIN";
        }
        if (i14 == -1) {
            return "LOW";
        }
        if (i14 == 0) {
            return "DEFAULT";
        }
        if (i14 != 1) {
            return i14 != 2 ? String.valueOf(i14) : "MAX";
        }
        return "HIGH";
    }

    private static boolean isEmoji(String str) {
        try {
            return Pattern.compile(regex).matcher(str).find();
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean isImageAccessible(Context context, Uri uri) {
        boolean z14 = false;
        try {
            InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
            if (inputStreamOpenInputStream == null) {
                return false;
            }
            z14 = true;
            inputStreamOpenInputStream.close();
            return true;
        } catch (Exception e4) {
            ih2.b.a(e4, "MMS# SmartNotifsUtil:  isImageAccessible -> Error reading data from uri [" + uri + "]");
            return z14;
        }
    }

    private static boolean isJapanese(String str) {
        try {
            return Pattern.compile(JAPANESE_REGEX).matcher(str).find();
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean isNotEmptyNotification(GNCSNotificationInfo gNCSNotificationInfo) {
        if (gNCSNotificationInfo != null) {
            return (TextUtils.isEmpty(gNCSNotificationInfo.title) && TextUtils.isEmpty(gNCSNotificationInfo.subTitle) && TextUtils.isEmpty(gNCSNotificationInfo.message)) ? false : true;
        }
        return false;
    }

    public static boolean isNotifPermissionGrantedAndServiceConnected(String str) {
        GNCSListenerServiceConfig config = GNCSListenerService.getConfig();
        Context appContext = config.getAppContext();
        IGNCSAppCallback appCallback = config.getAppCallback();
        boolean zIsServiceConnected = GNCSListenerService.isServiceConnected();
        boolean zIsNotificationAccessEnabled = isNotificationAccessEnabled(appContext);
        if (zIsNotificationAccessEnabled && !zIsServiceConnected) {
            str = str + "\n* notification access enabled but service not connected, attempting rebind";
            GNCSListenerService.attemptRebind();
            zIsServiceConnected = GNCSListenerService.isServiceConnected();
        }
        if (!zIsNotificationAccessEnabled) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str);
            sb3.append("\n* notification access is disabled");
        } else {
            if (zIsServiceConnected) {
                return true;
            }
            StringBuilder sb4 = new StringBuilder();
            sb4.append(str);
            sb4.append("\n* notification service not connected");
        }
        if (!appCallback.allowLibraryAskForNotificationAccess()) {
            return false;
        }
        notifyNotificationAccessRequired(appContext);
        return false;
    }

    public static boolean isNotificationAccessEnabled(Context context) {
        if (((HashSet) a0.b(context)).contains(context.getPackageName())) {
            ih2.b.b("SmartNotifsUtil: isNotificationAccessEnabled -> Yes, App is in enabled listener packages");
            return true;
        }
        ih2.b.b("SmartNotifsUtil: isNotificationAccessEnabled -> App not in enabled listener packages");
        if (!GNCSListenerService.isServiceConnected()) {
            return false;
        }
        ih2.b.b("SmartNotifsUtil: isNotificationAccessEnabled -> Yes, service is connected but app not in enabled listener packages");
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$filterGNCSPackagesFromList$2(String str) {
        return !str.equals(Packages.NOTIFICATION_SETUP_INDICATOR_PACKAGE_NAME);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$getAllApplications$1(GNCSApplicationInfo gNCSApplicationInfo) {
        return !gNCSApplicationInfo.packageName.equals(Packages.NOTIFICATION_SETUP_INDICATOR_PACKAGE_NAME);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lambda$showNotification$0(Context context) {
        Intent intent;
        List<String> associations;
        boolean zIsNotificationAccessEnabled = isNotificationAccessEnabled(context);
        boolean zIsServiceConnected = GNCSListenerService.isServiceConnected();
        if (zIsNotificationAccessEnabled) {
            if (zIsServiceConnected) {
                ih2.b.b("SmartNotifsUtil: showNotification -> service is connected after attemptRebind");
                return;
            }
            AnalyticsUtilKt.logEvent(AnalyticEventType.GNCS_SERVICE_NOT_BINDING);
        }
        ih2.b.b("SmartNotifsUtil: showNotification -> posting notification, access enabled: " + zIsNotificationAccessEnabled);
        Context applicationContext = context.getApplicationContext();
        int i14 = ih2.d.f93519a;
        applicationContext.getClass();
        String string = applicationContext.getString(zIsNotificationAccessEnabled ? R.string.notification_access_terminated_message : R.string.notification_access_required_message);
        string.getClass();
        String string2 = applicationContext.getString(R.string.notification_access_required);
        string2.getClass();
        q qVarA = ih2.d.a(applicationContext, string2, string);
        if (zIsNotificationAccessEnabled) {
            ih2.b.b("SystemNotificationUtil.showServiceNotEnabledNotification -> using device settings because notification access is enabled but service is not bound");
            intent = new Intent("android.settings.ACTION_NOTIFICATION_LISTENER_SETTINGS");
        } else {
            try {
                Object systemService = applicationContext.getSystemService("companiondevice");
                CompanionDeviceManager companionDeviceManager = systemService instanceof CompanionDeviceManager ? (CompanionDeviceManager) systemService : null;
                if (companionDeviceManager == null || (associations = companionDeviceManager.getAssociations()) == null || !(!associations.isEmpty())) {
                    ih2.b.b("SystemNotificationUtil.showServiceNotEnabledNotification -> using device settings because there are no linked devices");
                    intent = new Intent("android.settings.ACTION_NOTIFICATION_LISTENER_SETTINGS");
                } else {
                    ih2.b.b("SystemNotificationUtil.showServiceNotEnabledNotification -> using smart notification dialog because there are linked devices");
                    intent = new Intent(applicationContext, (Class<?>) GNCSNotificationAccessActivity.class);
                }
            } catch (Exception e4) {
                ih2.b.a(e4, "SystemNotificationUtil.Context.hasLinkedDevice ->");
            }
        }
        qVarA.f202686h = PendingIntent.getActivity(applicationContext, 0, intent, 201326592);
        qVarA.a(0, applicationContext.getString(R.string.button_dont_ask_again), PendingIntent.getBroadcast(applicationContext, 0, new Intent(applicationContext, (Class<?>) DoNotAskPermissionAgainReceiver.class), 67108864));
        String string3 = applicationContext.getString(R.string.notification_access_required);
        string3.getClass();
        a0 a0VarA = a0.a(applicationContext);
        a0VarA.f202582b.createNotificationChannel(new NotificationChannel("access_required", string3, 4));
        a0VarA.c(98, qVarA.c());
        GNCSSettings.getInstance().setLastUserNotified(context, System.currentTimeMillis());
    }

    public static void notifyNotificationAccessRequired(Context context, boolean z14, boolean z15) {
        if (isNotificationAccessEnabled(context) && GNCSListenerService.isServiceConnected()) {
            ih2.b.b("SmartNotifsUtil: notifyNotificationAccessRequired -> service is bound, nothing to do");
            return;
        }
        if (!GNCSListenerService.isNotificationAccessAllowed(context)) {
            ih2.b.b("SmartNotifsUtil: notifyNotificationAccessRequired -> notification access not allowed due to system limitation.");
            return;
        }
        if (!z15) {
            showNotification(context, z14);
            return;
        }
        CompanionDeviceManager companionDeviceManager = (CompanionDeviceManager) context.getSystemService(CompanionDeviceManager.class);
        int i14 = Build.VERSION.SDK_INT;
        if (i14 >= 33) {
            if (companionDeviceManager == null || companionDeviceManager.getMyAssociations().isEmpty()) {
                showNotification(context, z14);
                return;
            }
        } else if (companionDeviceManager == null || companionDeviceManager.getAssociations().isEmpty()) {
            showNotification(context, z14);
            return;
        }
        ComponentName componentName = new ComponentName(context.getApplicationContext().getPackageName(), GNCSListenerService.class.getName());
        try {
            if (i14 < 33) {
                if (companionDeviceManager.hasNotificationAccess(componentName)) {
                    showNotification(context, z14);
                    return;
                } else {
                    companionDeviceManager.requestNotificationAccess(componentName);
                    return;
                }
            }
            NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
            if (notificationManager == null || notificationManager.isNotificationListenerAccessGranted(componentName)) {
                return;
            }
            companionDeviceManager.requestNotificationAccess(componentName);
        } catch (Throwable th3) {
            ih2.b.c("SmartNotificationsUtil.notifyNotificationAccessRequired", th3);
        }
    }

    public static CharSequence obfuscateIfNeeded(CharSequence charSequence) {
        if (SmartNotificationsConfig.getInstance().isObfuscateLoggingEnabled()) {
            return j.q(new StringBuilder("<"), charSequence != null ? charSequence.hashCode() : 0, ">");
        }
        return charSequence;
    }

    public static String obfuscatePayloadIfNeeded(byte[] bArr) {
        String string = Arrays.toString(bArr);
        if (!SmartNotificationsConfig.getInstance().isObfuscateLoggingEnabled()) {
            return string;
        }
        return "<" + string.hashCode() + ">";
    }

    private static Bitmap resize(Bitmap bitmap, int i14, int i15) {
        if (i15 <= 0 || i14 <= 0) {
            return bitmap;
        }
        float width = bitmap.getWidth() / bitmap.getHeight();
        float f14 = i14;
        float f15 = i15;
        if (f14 / f15 > width) {
            i14 = (int) (f15 * width);
        } else {
            i15 = (int) (f14 / width);
        }
        return Bitmap.createScaledBitmap(bitmap, i14, i15, true);
    }

    @SuppressLint({"MissingPermission"})
    private static void showNotification(Context context, boolean z14) {
        if (isNotificationAccessEnabled(context) && !GNCSListenerService.isServiceConnected()) {
            GNCSListenerService.attemptRebind();
        }
        if (!z14) {
            if (GNCSSettings.getInstance().getLastUserNotified(context) > System.currentTimeMillis() - 86400000) {
                ih2.b.b("SmartNotifsUtil: showNotification -> not notifying user about notification service not running since it has not been 24 hours since the last");
                return;
            }
        }
        new Handler(Looper.getMainLooper()).postDelayed(new u1(context, 1), 5000L);
    }

    private static void writeBitmapToStorageForTesting(byte[] bArr, GNCSMediaRequest gNCSMediaRequest) {
        try {
            ih2.b.b("MMS# Writing file to external storage");
            File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES).getAbsolutePath() + "/MMS_saved_images");
            if (!file.exists() && !file.mkdirs()) {
                ih2.b.b("MMS# Failed to create folder " + file.getAbsolutePath());
                return;
            }
            File file2 = new File(file, "Image_" + gNCSMediaRequest.getNotificationId() + "." + gNCSMediaRequest.getType().name());
            if (file2.exists() && file2.delete()) {
                ih2.b.b("MMS# Deleted existing file " + file2.getAbsolutePath());
            }
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            fileOutputStream.write(bArr, 0, bArr.length);
            fileOutputStream.flush();
            fileOutputStream.close();
            ih2.b.b("MMS# Written file " + file2.getAbsolutePath() + " successfully");
        } catch (Exception e4) {
            ih2.b.a(e4, "MMS# Error in Writing file to storage");
        }
    }

    public static void notifyNotificationAccessRequired(Context context) {
        notifyNotificationAccessRequired(context, false, false);
    }
}
