package com.garmin.android.gncs.telephony;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.media.session.MediaController;
import android.media.session.MediaSessionManager;
import android.net.Uri;
import android.os.Build;
import android.service.notification.StatusBarNotification;
import android.telecom.TelecomManager;
import android.telephony.PhoneNumberUtils;
import android.telephony.TelephonyManager;
import android.view.KeyEvent;
import ch.qos.logback.core.CoreConstants;
import com.android.internal.telephony.ITelephony;
import com.garmin.android.gncs.GNCSListenerService;
import com.garmin.android.gncs.SmartNotificationsUtil;
import com.garmin.android.gncs.datamappers.DialerDataMapper;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.j0;
import p13.y;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000\u001a \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0000\u001a\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\u0003H\u0000\u001a\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u0003H\u0000\u001a\u0018\u0010\f\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0007H\u0000\u001a\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u000f2\u0006\u0010\u0002\u001a\u00020\u0003H\u0001\u001a\u001a\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0000\u001a\f\u0010\u0013\u001a\u00020\u0005*\u00020\u0003H\u0002\u001a\f\u0010\u0014\u001a\u00020\u0005*\u00020\u0003H\u0003\u001a\f\u0010\u0015\u001a\u00020\u0005*\u00020\u0003H\u0002\u001a\u0014\u0010\u0016\u001a\u00020\u0001*\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0012H\u0002\u001a\u0016\u0010\u0017\u001a\u00020\u0001*\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0002\u001a\f\u0010\u0018\u001a\u00020\u0005*\u00020\u0003H\u0003\u001a\f\u0010\u0019\u001a\u00020\u0005*\u00020\u0003H\u0002¨\u0006\u001a"}, d2 = {"answerCall", "", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "areSamePhoneNumber", "", "phoneNumber1", "", "phoneNumber2", "countOfMissedCalls", "", "getDefaultDialerPackage", "isDialerPackage", RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME, "loadDialerPackages", "", "rejectCall", "sbn", "Landroid/service/notification/StatusBarNotification;", "answerCallLollipop", "answerCallOreo", "answerCallPreQ", "rejectCallByNotification", "rejectCallLollipop", "rejectCallPie", "rejectCallPreQ", "gncs-all-modules_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class TelephonyUtilKt {
    public static final void answerCall(Context context) {
        context.getClass();
        Context applicationContext = context.getApplicationContext();
        GNCSInCallService companion = GNCSInCallService.INSTANCE.getInstance();
        if (companion != null) {
            try {
                companion.answerCall();
                ih2.b.b("TelephonyUtil.answerCall -> current call answered via InCallService");
                return;
            } catch (Throwable th3) {
                ih2.b.c("TelephonyUtil.answerCall -> failed to answer call via InCallService", th3);
            }
        }
        applicationContext.getClass();
        if (answerCallOreo(applicationContext) || answerCallPreQ(applicationContext)) {
            return;
        }
        answerCallLollipop(applicationContext);
    }

    private static final boolean answerCallLollipop(Context context) {
        try {
            Object systemService = context.getSystemService("media_session");
            MediaSessionManager mediaSessionManager = systemService instanceof MediaSessionManager ? (MediaSessionManager) systemService : null;
            if (mediaSessionManager == null) {
                return false;
            }
            List<MediaController> activeSessions = mediaSessionManager.getActiveSessions(new ComponentName(context, (Class<?>) GNCSListenerService.class));
            activeSessions.getClass();
            for (MediaController mediaController : activeSessions) {
                if (SmartNotificationsUtil.Packages.AOSP_TELECOM_SERVER_PACKAGE_NAME.equals(mediaController.getPackageName())) {
                    mediaController.dispatchMediaButtonEvent(new KeyEvent(1, 79));
                    ih2.b.b("TelephonyUtil.answerCallLollipop -> KEYCODE_HEADSETHOOK sent");
                    return true;
                }
            }
        } catch (Throwable th3) {
            ih2.b.c("TelephonyUtil.answerCallLollipop", th3);
        }
        return false;
    }

    @SuppressLint({"MissingPermission"})
    private static final boolean answerCallOreo(Context context) {
        try {
            Object systemService = context.getSystemService("telecom");
            Unit unit = null;
            TelecomManager telecomManager = systemService instanceof TelecomManager ? (TelecomManager) systemService : null;
            if (telecomManager != null) {
                telecomManager.acceptRingingCall();
                unit = Unit.INSTANCE;
            }
            if (unit == null) {
                return false;
            }
            ih2.b.b("TelephonyUtil.answerCallOreo -> ringing call accepted");
            return true;
        } catch (Throwable th3) {
            ih2.b.c("TelephonyUtil.answerCallOreo", th3);
            return false;
        }
    }

    private static final boolean answerCallPreQ(Context context) {
        if (Build.VERSION.SDK_INT > 28) {
            return false;
        }
        try {
            Object systemService = context.getSystemService("phone");
            TelephonyManager telephonyManager = systemService instanceof TelephonyManager ? (TelephonyManager) systemService : null;
            if (telephonyManager == null) {
                return false;
            }
            Method declaredMethod = Class.forName(telephonyManager.getClass().getName()).getDeclaredMethod("getITelephony", null);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(telephonyManager, null);
            objInvoke.getClass();
            ITelephony iTelephony = (ITelephony) objInvoke;
            iTelephony.silenceRinger();
            iTelephony.answerRingingCall();
            ih2.b.b("TelephonyUtil.answerCallPreQ -> ringing call accepted");
            return true;
        } catch (Throwable th3) {
            ih2.b.c("TelephonyUtil.answerCallPreQ", th3);
            return false;
        }
    }

    public static final boolean areSamePhoneNumber(Context context, String str, String str2) {
        context.getClass();
        str.getClass();
        str2.getClass();
        if (str.length() == 0 || str2.length() == 0) {
            return false;
        }
        Object systemService = context.getSystemService("phone");
        systemService.getClass();
        String networkCountryIso = ((TelephonyManager) systemService).getNetworkCountryIso();
        networkCountryIso.getClass();
        Locale locale = Locale.ROOT;
        locale.getClass();
        String upperCase = networkCountryIso.toUpperCase(locale);
        upperCase.getClass();
        return Build.VERSION.SDK_INT >= 31 ? PhoneNumberUtils.areSamePhoneNumber(str, str2, upperCase) : PhoneNumberUtils.compare(context, str, str2);
    }

    public static final int countOfMissedCalls(Context context) {
        context.getClass();
        try {
            if (context.checkSelfPermission("android.permission.READ_CALL_LOG") != 0) {
                ih2.b.d("TelephonyUtil.countOfMissedCalls -> 'android.permission.READ_CALL_LOG' not granted");
                return -1;
            }
            ContentResolver contentResolver = context.getApplicationContext().getContentResolver();
            Uri uri = Uri.parse("content://call_log/calls");
            uri.getClass();
            Cursor cursorQuery = contentResolver.query(uri, null, "type = 3 AND new = 1", null, "date DESC");
            if (cursorQuery == null) {
                return -1;
            }
            Cursor cursor = cursorQuery;
            try {
                int count = cursor.getCount();
                cursor.close();
                return count;
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    jg.b.l(cursor, th3);
                    throw th4;
                }
            }
        } catch (Throwable th5) {
            ih2.b.c("TelephonyUtil.countOfMissedCalls", th5);
            return -1;
        }
    }

    public static final String getDefaultDialerPackage(Context context) {
        context.getClass();
        try {
            Object systemService = context.getSystemService("telecom");
            TelecomManager telecomManager = systemService instanceof TelecomManager ? (TelecomManager) systemService : null;
            String defaultDialerPackage = telecomManager != null ? telecomManager.getDefaultDialerPackage() : null;
            return defaultDialerPackage == null ? "" : defaultDialerPackage;
        } catch (Throwable th3) {
            ih2.b.c("TelephonyUtil.getDefaultDialerPackage", th3);
            return "";
        }
    }

    public static final boolean isDialerPackage(Context context, String str) {
        context.getClass();
        str.getClass();
        return loadDialerPackages(context).contains(str);
    }

    @SuppressLint({"QueryPermissionsNeeded"})
    public static final List<String> loadDialerPackages(Context context) {
        context.getClass();
        try {
            List<ResolveInfo> listQueryIntentActivities = context.getApplicationContext().getPackageManager().queryIntentActivities(new Intent("android.intent.action.DIAL"), 0);
            listQueryIntentActivities.getClass();
            ArrayList arrayList = new ArrayList();
            for (Object obj : listQueryIntentActivities) {
                if (!"com.zing.zalo".equals(((ResolveInfo) obj).activityInfo.packageName)) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(y.r(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((ResolveInfo) it.next()).activityInfo.packageName);
            }
            return arrayList2;
        } catch (Throwable unused) {
            return j0.f134944a;
        }
    }

    public static final void rejectCall(Context context, StatusBarNotification statusBarNotification) {
        context.getClass();
        GNCSInCallService companion = GNCSInCallService.INSTANCE.getInstance();
        if (companion != null) {
            try {
                GNCSInCallService.rejectCall$default(companion, null, 1, null);
                ih2.b.b("TelephonyUtil.rejectCall -> current call rejected via InCallService");
                return;
            } catch (Throwable th3) {
                ih2.b.c("TelephonyUtil.rejectCall -> failed to reject call via InCallService", th3);
            }
        }
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        if (rejectCallPie(applicationContext) || rejectCallPreQ(applicationContext)) {
            return;
        }
        rejectCallLollipop(applicationContext, statusBarNotification);
    }

    private static final void rejectCallByNotification(Context context, StatusBarNotification statusBarNotification) {
        PendingIntent pendingIntent;
        String packageName = statusBarNotification.getPackageName();
        if (packageName == null || packageName.length() == 0) {
            ih2.b.b("TelephonyUtil.rejectCallByNotification -> failed to get package name from the notification");
            return;
        }
        packageName.getClass();
        if (!isDialerPackage(context, packageName)) {
            com.airbnb.lottie.animation.keyframe.a.s("TelephonyUtil.rejectCallByNotification -> notification '", packageName, "' does not belong to dialer package");
            return;
        }
        Notification notification = statusBarNotification.getNotification();
        Notification.Action[] actionArr = notification != null ? notification.actions : null;
        if (actionArr == null || actionArr.length == 0) {
            ih2.b.b("TelephonyUtil.rejectCallByNotification -> failed to get actions from the notification");
            return;
        }
        int incomingCallNotificationActionIndex = DialerDataMapper.getIncomingCallNotificationActionIndex(false, actionArr.length);
        if (incomingCallNotificationActionIndex < 0 || incomingCallNotificationActionIndex >= actionArr.length) {
            ih2.b.b("TelephonyUtil.rejectCallByNotification -> failed to get reject action index from the notification");
            return;
        }
        try {
            Notification.Action action = actionArr[incomingCallNotificationActionIndex];
            if (action == null || (pendingIntent = action.actionIntent) == null) {
                return;
            }
            pendingIntent.send(context, 0, (Intent) null);
        } catch (Throwable th3) {
            ih2.b.c("TelephonyUtil.rejectCallByNotification -> failed to send reject action", th3);
        }
    }

    private static final void rejectCallLollipop(Context context, StatusBarNotification statusBarNotification) {
        List<MediaController> activeSessions;
        try {
            Object systemService = context.getSystemService("media_session");
            MediaSessionManager mediaSessionManager = systemService instanceof MediaSessionManager ? (MediaSessionManager) systemService : null;
            if (mediaSessionManager != null && (activeSessions = mediaSessionManager.getActiveSessions(new ComponentName(context, (Class<?>) GNCSListenerService.class))) != null) {
                for (MediaController mediaController : activeSessions) {
                    if (SmartNotificationsUtil.Packages.AOSP_TELECOM_SERVER_PACKAGE_NAME.equals(mediaController.getPackageName())) {
                        mediaController.dispatchMediaButtonEvent(new KeyEvent(0, 6));
                        mediaController.dispatchMediaButtonEvent(new KeyEvent(1, 6));
                        ih2.b.b("TelephonyUtil.rejectCallLollipop -> KEYCODE_HEADSETHOOK sent");
                        break;
                    }
                }
            }
        } catch (Throwable th3) {
            ih2.b.c("TelephonyUtil.rejectCallLollipop", th3);
        }
        if (statusBarNotification != null) {
            rejectCallByNotification(context, statusBarNotification);
        }
    }

    @SuppressLint({"MissingPermission"})
    private static final boolean rejectCallPie(Context context) {
        try {
            Object systemService = context.getSystemService("telecom");
            TelecomManager telecomManager = systemService instanceof TelecomManager ? (TelecomManager) systemService : null;
            if (telecomManager == null) {
                return false;
            }
            telecomManager.endCall();
            ih2.b.b("TelephonyUtil.rejectCallPie -> ringing call rejected");
            return true;
        } catch (Throwable th3) {
            ih2.b.c("TelephonyUtil.rejectCallPie", th3);
            return false;
        }
    }

    private static final boolean rejectCallPreQ(Context context) {
        if (Build.VERSION.SDK_INT > 28) {
            return false;
        }
        try {
            Object systemService = context.getSystemService("phone");
            TelephonyManager telephonyManager = systemService instanceof TelephonyManager ? (TelephonyManager) systemService : null;
            if (telephonyManager == null) {
                return false;
            }
            Method declaredMethod = Class.forName(telephonyManager.getClass().getName()).getDeclaredMethod("getITelephony", null);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(telephonyManager, null);
            objInvoke.getClass();
            ITelephony iTelephony = (ITelephony) objInvoke;
            try {
                iTelephony.silenceRinger();
            } catch (Throwable th3) {
                ih2.b.c("TelephonyUtil.rejectCallPreQ -> silence ringer failed", th3);
            }
            boolean zEndCall = iTelephony.endCall();
            ih2.b.b("TelephonyUtil.rejectCallPreQ -> ".concat(zEndCall ? "ringing call rejected" : "failed to reject ringing call"));
            return zEndCall;
        } catch (Throwable th4) {
            ih2.b.c("TelephonyUtil.rejectCallPreQ", th4);
            return false;
        }
    }
}
