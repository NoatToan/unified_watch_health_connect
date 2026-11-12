package com.garmin.android.gncs.telephony;

import android.annotation.SuppressLint;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.provider.ContactsContract;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import com.garmin.android.ancs.ANCSMessageBase;
import com.garmin.android.apps.connectmobile.u1;
import com.garmin.android.gncs.GNCSNotificationInfo;
import com.garmin.android.gncs.GNCSNotificationManager;
import com.garmin.android.gncs.R;
import com.garmin.android.gncs.SmartNotificationsUtil;
import com.garmin.android.gncs.persistence.CacheManager;
import com.garmin.android.gncs.persistence.GNCSNotificationAction;
import com.garmin.android.gncs.settings.GNCSSettings;
import com.google.common.net.HttpHeaders;
import d53.u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import o13.e;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p13.w;
import p13.x;
import vb.h;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u000e\bÀ\u0002\u0018\u00002\u00020\u0001:\u00010B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\u001aH\u0002J\u0012\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0012H\u0002J\u0006\u0010\u001f\u001a\u00020 J\u0016\u0010!\u001a\u00020 2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001d0#H\u0002J\u000e\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001d0#H\u0002J\u0012\u0010%\u001a\u00020 2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0012H\u0002J\u0012\u0010&\u001a\u00020 2\b\u0010'\u001a\u0004\u0018\u00010\u0012H\u0002J\b\u0010(\u001a\u00020 H\u0002J\u0012\u0010)\u001a\u00020 2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0012H\u0002J\b\u0010*\u001a\u00020 H\u0002J\b\u0010+\u001a\u00020 H\u0002J\u0010\u0010,\u001a\u00020 2\u0006\u0010-\u001a\u00020\rH\u0002J\u0012\u0010.\u001a\u00020 2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0012H\u0002J\u0016\u0010/\u001a\u00020\u0012*\u00020\u00042\b\u0010'\u001a\u0004\u0018\u00010\u0012H\u0003R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006@BX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000¨\u00061"}, d2 = {"Lcom/garmin/android/gncs/telephony/PhoneCallListener;", "", "()V", "appContext", "Landroid/content/Context;", "value", "Lcom/garmin/android/gncs/telephony/PhoneCallListener$CallState;", "callState", "getCallState", "()Lcom/garmin/android/gncs/telephony/PhoneCallListener$CallState;", "setCallState", "(Lcom/garmin/android/gncs/telephony/PhoneCallListener$CallState;)V", "enabled", "", "handler", "Landroid/os/Handler;", "isIncomingCall", "missedCallPhoneNumber", "", "getMissedCallPhoneNumber", "()Ljava/lang/String;", "setMissedCallPhoneNumber", "(Ljava/lang/String;)V", "phoneStateListener", "Landroid/telephony/PhoneStateListener;", "previousCallState", "", "callStateToString", "createOnGoingCallNotificationInfo", "Lcom/garmin/android/gncs/GNCSNotificationInfo;", "incomingNumber", "disable", "", "enable", "getActiveNotificationsOfCallCategory", "", "getBlockedNotificationsOfCallCategory", "onIncomingCallAnswered", "onIncomingCallEnded", "phoneNumber", "onIncomingCallMissed", "onIncomingCallStarted", "onOutgoingCallEnded", "onOutgoingCallStarted", "onVoiceMailIndicatorChanged", "showing", "postOngoingCallNotificationIfNeeded", "findContactName", "CallState", "gncs-all-modules_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class PhoneCallListener {
    private static Context appContext;
    private static volatile boolean enabled;
    private static Handler handler;
    private static boolean isIncomingCall;
    private static String missedCallPhoneNumber;
    private static PhoneStateListener phoneStateListener;
    private static int previousCallState;
    public static final PhoneCallListener INSTANCE = new PhoneCallListener();
    private static CallState callState = CallState.IDLE;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/garmin/android/gncs/telephony/PhoneCallListener$CallState;", "", "(Ljava/lang/String;I)V", "IDLE", "INCOMING_STARTED", "INCOMING_MISSED", "INCOMING_ANSWERED", "OUTGOING_STARTED", "gncs-all-modules_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public enum CallState {
        IDLE,
        INCOMING_STARTED,
        INCOMING_MISSED,
        INCOMING_ANSWERED,
        OUTGOING_STARTED;

        private static final /* synthetic */ w13.a $ENTRIES = w13.b.g(values());

        public static w13.a<CallState> getEntries() {
            return $ENTRIES;
        }
    }

    private PhoneCallListener() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String callStateToString(int callState2) {
        if (callState2 == 0) {
            return "IDLE";
        }
        if (callState2 != 1) {
            return callState2 != 2 ? "UNKNOWN" : "OFFHOOK";
        }
        return "RINGING";
    }

    private final GNCSNotificationInfo createOnGoingCallNotificationInfo(String incomingNumber) {
        Context context = appContext;
        if (context == null) {
            h.z("Context is null");
            return null;
        }
        GNCSNotificationInfo gNCSNotificationInfo = new GNCSNotificationInfo();
        gNCSNotificationInfo.type = GNCSNotificationInfo.NotificationType.OTHER;
        gNCSNotificationInfo.packageName = SmartNotificationsUtil.Packages.ONGOING_PACKAGE_NAME;
        gNCSNotificationInfo.title = INSTANCE.findContactName(context, incomingNumber);
        gNCSNotificationInfo.subTitle = "";
        gNCSNotificationInfo.message = context.getString(R.string.ongoing_call);
        gNCSNotificationInfo.postTime = System.currentTimeMillis();
        gNCSNotificationInfo.when = 0L;
        gNCSNotificationInfo.callType = 2;
        gNCSNotificationInfo.phoneNumber = incomingNumber;
        if (incomingNumber != null && incomingNumber.length() != 0) {
            gNCSNotificationInfo.extraFlags = ANCSMessageBase.FeatureFlag.PHONE_NUMBER_AVAILABLE.flag;
        }
        int i14 = R.string.hang_up_call;
        gNCSNotificationInfo.positiveAction = context.getString(i14);
        gNCSNotificationInfo.positiveActionIndex = 0;
        String string = context.getString(i14);
        string.getClass();
        gNCSNotificationInfo.actions = w.c(new GNCSNotificationAction(97, string, false, GNCSNotificationAction.ActionType.POSITIVE, false, 16, null));
        gNCSNotificationInfo.extraFlags |= ANCSMessageBase.FeatureFlag.HAS_ANDROID_ACTIONS.flag;
        return gNCSNotificationInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void enable$lambda$0(Context context) {
        context.getClass();
        try {
            if (phoneStateListener == null) {
                phoneStateListener = new PhoneStateListener() { // from class: com.garmin.android.gncs.telephony.PhoneCallListener$enable$1$1
                    @Override // android.telephony.PhoneStateListener
                    @e
                    public void onCallStateChanged(int state, String phoneNumber) {
                        PhoneCallListener phoneCallListener = PhoneCallListener.INSTANCE;
                        ih2.b.b("PhoneCallListener.onCallStateChanged -> from [" + phoneCallListener.callStateToString(PhoneCallListener.previousCallState) + "] to [" + phoneCallListener.callStateToString(state) + "]");
                        if (PhoneCallListener.previousCallState == state) {
                            return;
                        }
                        phoneCallListener.setMissedCallPhoneNumber(null);
                        if (state != 0) {
                            if (state == 1) {
                                PhoneCallListener.isIncomingCall = true;
                                phoneCallListener.onIncomingCallStarted(phoneNumber);
                            } else if (state == 2) {
                                if (PhoneCallListener.previousCallState == 0) {
                                    PhoneCallListener.isIncomingCall = false;
                                    phoneCallListener.onOutgoingCallStarted();
                                } else {
                                    phoneCallListener.onIncomingCallAnswered(phoneNumber);
                                }
                            }
                        } else if (PhoneCallListener.previousCallState == 1) {
                            phoneCallListener.setMissedCallPhoneNumber(phoneNumber);
                            phoneCallListener.onIncomingCallMissed();
                        } else if (PhoneCallListener.isIncomingCall) {
                            phoneCallListener.onIncomingCallEnded(phoneNumber);
                        } else {
                            phoneCallListener.onOutgoingCallEnded();
                        }
                        PhoneCallListener.previousCallState = state;
                    }

                    @Override // android.telephony.PhoneStateListener
                    @e
                    public void onMessageWaitingIndicatorChanged(boolean showing) {
                        PhoneCallListener.INSTANCE.onVoiceMailIndicatorChanged(showing);
                    }
                };
                Object systemService = context.getSystemService("phone");
                TelephonyManager telephonyManager = systemService instanceof TelephonyManager ? (TelephonyManager) systemService : null;
                if (telephonyManager == null) {
                    ih2.b.b("PhoneCallListener.enable -> TelephonyManager is null.");
                    return;
                }
                telephonyManager.listen(phoneStateListener, 36);
            }
            ih2.b.b("PhoneCallListener.enable -> success");
            enabled = true;
        } catch (Throwable th3) {
            ih2.b.c("PhoneCallListener.enable", th3);
            enabled = false;
        }
    }

    @SuppressLint({HttpHeaders.RANGE})
    private final String findContactName(Context context, String str) {
        if (str == null || d53.w.J(str)) {
            ih2.b.b("PhoneCallListener.findContactName -> incoming number is empty, returning empty string");
            return "";
        }
        if (a7.b.checkSelfPermission(context, "android.permission.READ_CONTACTS") != 0) {
            ih2.b.b("PhoneCallListener.findContactName -> READ_CONTACTS permission not granted, returning phone number");
            return str;
        }
        try {
            Cursor cursorQuery = context.getContentResolver().query(Uri.withAppendedPath(ContactsContract.PhoneLookup.CONTENT_FILTER_URI, Uri.encode(str)), new String[]{"display_name"}, null, null, null);
            if (cursorQuery != null) {
                Cursor cursor = cursorQuery;
                try {
                    Cursor cursor2 = cursor;
                    String string = cursor2.moveToFirst() ? cursor2.getString(cursor2.getColumnIndex("display_name")) : null;
                    cursor.close();
                    if (string != null) {
                        ih2.b.b("PhoneCallListener.findContactName -> contact name found using phone number");
                        return string;
                    }
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        jg.b.l(cursor, th3);
                        throw th4;
                    }
                }
            }
            ih2.b.b("PhoneCallListener.findContactName -> no contact matches phone number, returning phone number");
            return str;
        } catch (Throwable th5) {
            ih2.b.c("PhoneCallListener.findContactName -> error occurred, returning phone number", th5);
            return str;
        }
    }

    private final List<GNCSNotificationInfo> getActiveNotificationsOfCallCategory() {
        List<GNCSNotificationInfo> activeNotificationsOfCategory = CacheManager.INSTANCE.getActiveNotificationsOfCategory("call");
        ArrayList<GNCSNotificationInfo> arrayList = new ArrayList();
        for (Object obj : activeNotificationsOfCategory) {
            GNCSNotificationInfo.NotificationType notificationType = ((GNCSNotificationInfo) obj).type;
            if (notificationType != GNCSNotificationInfo.NotificationType.MISSED_CALL && notificationType != GNCSNotificationInfo.NotificationType.OTHER) {
                arrayList.add(obj);
            }
        }
        StringBuffer stringBuffer = new StringBuffer("PhoneCallListener.getActiveNotificationsOfCallCategory => \n");
        stringBuffer.append("There are " + arrayList.size() + " active notifications of category call  \n");
        for (GNCSNotificationInfo gNCSNotificationInfo : arrayList) {
            long j8 = gNCSNotificationInfo.cacheId;
            String str = gNCSNotificationInfo.packageName;
            String str2 = gNCSNotificationInfo.category;
            String strName = gNCSNotificationInfo.type.name();
            StringBuilder sbK = com.airbnb.lottie.animation.keyframe.a.k(j8, "Id: [", "]  Package: [", str);
            sn.a.t(sbK, "]  Category: [", str2, "]  Type: [", strName);
            sbK.append("] \n");
            stringBuffer.append(sbK.toString());
        }
        stringBuffer.append("End of active notifications category call \n");
        ih2.b.b(stringBuffer.toString());
        return arrayList;
    }

    private final List<GNCSNotificationInfo> getBlockedNotificationsOfCallCategory() {
        StringBuffer stringBuffer = new StringBuffer("PhoneCallListener.getBlockedNotificationsOfCallCategory => \n");
        List<GNCSNotificationInfo> blockedNotificationsOfCategory = CacheManager.INSTANCE.getBlockedNotificationsOfCategory("call");
        ArrayList<GNCSNotificationInfo> arrayList = new ArrayList();
        for (Object obj : blockedNotificationsOfCategory) {
            GNCSNotificationInfo gNCSNotificationInfo = (GNCSNotificationInfo) obj;
            if (gNCSNotificationInfo.type != GNCSNotificationInfo.NotificationType.MISSED_CALL && !GNCSSettings.getInstance().isPackageEnabled(gNCSNotificationInfo.packageName)) {
                arrayList.add(obj);
            }
        }
        stringBuffer.append(" There are total " + arrayList.size() + " blocked notifications ");
        stringBuffer.append(" of category call \n");
        for (GNCSNotificationInfo gNCSNotificationInfo2 : arrayList) {
            long j8 = gNCSNotificationInfo2.cacheId;
            String str = gNCSNotificationInfo2.packageName;
            String str2 = gNCSNotificationInfo2.category;
            String strName = gNCSNotificationInfo2.type.name();
            StringBuilder sbK = com.airbnb.lottie.animation.keyframe.a.k(j8, "Id: [", "]  Package: [", str);
            sn.a.t(sbK, "]  Category: [", str2, "]  Type: [", strName);
            sbK.append("] \n");
            stringBuffer.append(sbK.toString());
        }
        stringBuffer.append("End of blocked notifications category call \n");
        ih2.b.b(stringBuffer.toString());
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onIncomingCallAnswered(String incomingNumber) {
        ih2.b.b("PhoneCallListener.onIncomingCallAnswered");
        setCallState(CallState.INCOMING_ANSWERED);
        Handler handler2 = handler;
        if (handler2 != null) {
            handler2.postDelayed(new a(incomingNumber, 2), 1000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onIncomingCallAnswered$lambda$14(String str) {
        Object next;
        CacheManager cacheManager = CacheManager.INSTANCE;
        GNCSNotificationInfo.NotificationType notificationType = GNCSNotificationInfo.NotificationType.INCOMING_CALL;
        GNCSNotificationInfo gNCSNotificationInfo = (GNCSNotificationInfo) h0.d0(cacheManager.getActiveNotifications(notificationType));
        if (gNCSNotificationInfo != null) {
            ih2.b.b("PhoneCallListener.onIncomingCallAnswered -> removing incoming call notification [" + gNCSNotificationInfo.cacheKey + "]");
            GNCSNotificationInfo gNCSNotificationInfo2 = new GNCSNotificationInfo();
            gNCSNotificationInfo2.cacheId = gNCSNotificationInfo.cacheId;
            gNCSNotificationInfo2.cacheKey = gNCSNotificationInfo.cacheKey;
            gNCSNotificationInfo2.type = notificationType;
            gNCSNotificationInfo2.packageName = gNCSNotificationInfo.packageName;
            gNCSNotificationInfo2.postTime = System.currentTimeMillis();
            gNCSNotificationInfo2.when = 0L;
            ((GNCSNotificationManager) jb2.b.a(GNCSNotificationManager.class)).removeNotification(gNCSNotificationInfo2);
            INSTANCE.postOngoingCallNotificationIfNeeded(str);
            return;
        }
        ih2.b.b("PhoneCallListener.onIncomingCallAnswered -> no active INCOMING_CALL notification found");
        if (u.q(Build.MANUFACTURER, "OnePlus", true)) {
            Iterator<T> it = cacheManager.getActiveNotifications(GNCSNotificationInfo.NotificationType.OTHER).iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!s.g(((GNCSNotificationInfo) next).packageName, "com.android.dialer"));
            GNCSNotificationInfo gNCSNotificationInfo3 = (GNCSNotificationInfo) next;
            if (gNCSNotificationInfo3 != null) {
                ih2.b.b("PhoneCallListener.onIncomingCallAnswered-> special handling for OnePlus");
                gNCSNotificationInfo3.type = GNCSNotificationInfo.NotificationType.INCOMING_CALL;
                gNCSNotificationInfo3.postTime = System.currentTimeMillis();
                gNCSNotificationInfo3.when = 0L;
                ((GNCSNotificationManager) jb2.b.a(GNCSNotificationManager.class)).removeNotification(gNCSNotificationInfo3);
            }
        }
        INSTANCE.postOngoingCallNotificationIfNeeded(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onIncomingCallEnded(String phoneNumber) {
        ih2.b.b("PhoneCallListener.onIncomingCallEnded");
        setCallState(CallState.IDLE);
        Handler handler2 = handler;
        if (handler2 != null) {
            handler2.postDelayed(new a(phoneNumber, 0), 1000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onIncomingCallEnded$lambda$20(String str) {
        GNCSNotificationInfo gNCSNotificationInfo = new GNCSNotificationInfo();
        gNCSNotificationInfo.cacheKey = GNCSNotificationInfo.createKey("", SmartNotificationsUtil.Packages.ONGOING_PACKAGE_NAME);
        gNCSNotificationInfo.type = GNCSNotificationInfo.NotificationType.OTHER;
        gNCSNotificationInfo.callType = 2;
        gNCSNotificationInfo.phoneNumber = str;
        gNCSNotificationInfo.packageName = SmartNotificationsUtil.Packages.ONGOING_PACKAGE_NAME;
        gNCSNotificationInfo.postTime = System.currentTimeMillis();
        gNCSNotificationInfo.when = 0L;
        CacheManager cacheManager = CacheManager.INSTANCE;
        String str2 = gNCSNotificationInfo.cacheKey;
        str2.getClass();
        GNCSNotificationInfo notification = cacheManager.getNotification(str2);
        if (notification != null) {
            gNCSNotificationInfo.cacheId = notification.cacheId;
            ((GNCSNotificationManager) jb2.b.a(GNCSNotificationManager.class)).removeNotification(gNCSNotificationInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onIncomingCallMissed() {
        ih2.b.b("PhoneCallListener.onIncomingCallMissed");
        setCallState(CallState.INCOMING_MISSED);
        Handler handler2 = handler;
        if (handler2 != null) {
            handler2.postDelayed(new ab2.a(1), 1000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onIncomingCallMissed$lambda$17() {
        String string;
        GNCSNotificationInfo gNCSNotificationInfo = new GNCSNotificationInfo();
        String str = "";
        gNCSNotificationInfo.cacheKey = GNCSNotificationInfo.createKey("", SmartNotificationsUtil.Packages.INCOMING_PACKAGE_NAME);
        gNCSNotificationInfo.type = GNCSNotificationInfo.NotificationType.INCOMING_CALL;
        gNCSNotificationInfo.packageName = SmartNotificationsUtil.Packages.INCOMING_PACKAGE_NAME;
        gNCSNotificationInfo.postTime = System.currentTimeMillis();
        gNCSNotificationInfo.when = 0L;
        Context context = appContext;
        if (context != null && (string = context.getString(R.string.clear_missed_call)) != null) {
            str = string;
        }
        gNCSNotificationInfo.negativeAction = str;
        CacheManager cacheManager = CacheManager.INSTANCE;
        String str2 = gNCSNotificationInfo.cacheKey;
        str2.getClass();
        GNCSNotificationInfo notification = cacheManager.getNotification(str2);
        if (notification != null) {
            gNCSNotificationInfo.cacheId = notification.cacheId;
            ((GNCSNotificationManager) jb2.b.a(GNCSNotificationManager.class)).removeNotification(gNCSNotificationInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onIncomingCallStarted(String incomingNumber) {
        String string;
        ih2.b.b("PhoneCallListener.onIncomingCallStarted -> incomingNumber length [" + ((incomingNumber == null || (string = d53.w.i0(incomingNumber).toString()) == null) ? 0 : string.length()) + "] digits");
        setCallState(CallState.INCOMING_STARTED);
        Handler handler2 = handler;
        if (handler2 != null) {
            handler2.postDelayed(new a(incomingNumber, 1), 1000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onIncomingCallStarted$lambda$5(String str) {
        Handler handler2;
        int i14;
        Context context = appContext;
        if (context == null || (handler2 = handler) == null) {
            return;
        }
        CacheManager cacheManager = CacheManager.INSTANCE;
        GNCSNotificationInfo.NotificationType notificationType = GNCSNotificationInfo.NotificationType.INCOMING_CALL;
        List<GNCSNotificationInfo> activeNotifications = cacheManager.getActiveNotifications(notificationType);
        if (!activeNotifications.isEmpty()) {
            ih2.b.b("PhoneCallListener.onIncomingCallStarted -> already have [" + activeNotifications.size() + "] incoming call notification from Packages: [" + h0.k0(activeNotifications, ",", null, null, PhoneCallListener$onIncomingCallStarted$1$1.INSTANCE, 30) + "] , only update phone number. ");
            for (GNCSNotificationInfo gNCSNotificationInfo : activeNotifications) {
                gNCSNotificationInfo.phoneNumber = str;
                if (str == null || str.length() == 0) {
                    com.airbnb.lottie.animation.keyframe.a.s("PhoneCallListener.onIncomingCallStarted -> No Phone Number. Clearing Flag [", gNCSNotificationInfo.packageName, "]");
                    i14 = gNCSNotificationInfo.extraFlags & (~ANCSMessageBase.FeatureFlag.PHONE_NUMBER_AVAILABLE.flag);
                } else {
                    com.airbnb.lottie.animation.keyframe.a.s("PhoneCallListener.onIncomingCallStarted -> Phone Number Available. Setting Flag [", gNCSNotificationInfo.packageName, "]");
                    i14 = gNCSNotificationInfo.extraFlags | ANCSMessageBase.FeatureFlag.PHONE_NUMBER_AVAILABLE.flag;
                }
                gNCSNotificationInfo.extraFlags = i14;
                CacheManager.INSTANCE.saveNotification(gNCSNotificationInfo);
            }
            return;
        }
        PhoneCallListener phoneCallListener = INSTANCE;
        if (!phoneCallListener.getActiveNotificationsOfCallCategory().isEmpty()) {
            ih2.b.b("PhoneCallListener.onIncomingCallStarted -> already have  notification of type call  . So not posting one.");
            return;
        }
        if (!phoneCallListener.getBlockedNotificationsOfCallCategory().isEmpty()) {
            ih2.b.b("PhoneCallListener.onIncomingCallStarted -> already have notification with status DNS of type incoming call . So not posting one.");
            return;
        }
        ih2.b.b("PhoneCallListener.onIncomingCallStarted -> no incoming call notification available, posting new notification");
        GNCSNotificationInfo gNCSNotificationInfo2 = new GNCSNotificationInfo();
        gNCSNotificationInfo2.type = notificationType;
        gNCSNotificationInfo2.packageName = SmartNotificationsUtil.Packages.INCOMING_PACKAGE_NAME;
        gNCSNotificationInfo2.title = phoneCallListener.findContactName(context, str);
        gNCSNotificationInfo2.subTitle = "";
        gNCSNotificationInfo2.message = context.getString(R.string.incoming_call);
        gNCSNotificationInfo2.postTime = System.currentTimeMillis();
        gNCSNotificationInfo2.when = 0L;
        gNCSNotificationInfo2.phoneNumber = str;
        if (str != null && str.length() != 0) {
            gNCSNotificationInfo2.extraFlags = ANCSMessageBase.FeatureFlag.PHONE_NUMBER_AVAILABLE.flag;
        }
        int i15 = R.string.decline_call;
        gNCSNotificationInfo2.negativeAction = context.getString(i15);
        gNCSNotificationInfo2.negativeActionIndex = 1;
        int i16 = R.string.accept_call;
        gNCSNotificationInfo2.positiveAction = context.getString(i16);
        gNCSNotificationInfo2.positiveActionIndex = 0;
        String string = context.getString(i16);
        string.getClass();
        GNCSNotificationAction gNCSNotificationAction = new GNCSNotificationAction(96, string, false, GNCSNotificationAction.ActionType.POSITIVE, false, 16, null);
        String string2 = context.getString(i15);
        string2.getClass();
        GNCSNotificationAction gNCSNotificationAction2 = new GNCSNotificationAction(97, string2, false, GNCSNotificationAction.ActionType.NEGATIVE, false, 16, null);
        String string3 = context.getString(R.string.reply_call);
        string3.getClass();
        gNCSNotificationInfo2.actions = x.k(gNCSNotificationAction, gNCSNotificationAction2, new GNCSNotificationAction(95, string3, true, GNCSNotificationAction.ActionType.NEUTRAL, false, 16, null));
        gNCSNotificationInfo2.extraFlags |= ANCSMessageBase.FeatureFlag.HAS_ANDROID_ACTIONS.flag;
        ((GNCSNotificationManager) jb2.b.a(GNCSNotificationManager.class)).postNotification(gNCSNotificationInfo2, null, handler2, context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onOutgoingCallEnded() {
        setCallState(CallState.IDLE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onOutgoingCallStarted() {
        setCallState(CallState.OUTGOING_STARTED);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onVoiceMailIndicatorChanged(boolean showing) {
        String string;
        ih2.b.b("PhoneCallListener.onVoiceMailIndicatorChanged -> changed to ".concat(showing ? "showing" : "not showing"));
        GNCSNotificationInfo gNCSNotificationInfo = new GNCSNotificationInfo();
        String str = "";
        gNCSNotificationInfo.cacheKey = GNCSNotificationInfo.createKey("", SmartNotificationsUtil.Packages.INCOMING_PACKAGE_NAME);
        gNCSNotificationInfo.type = GNCSNotificationInfo.NotificationType.INCOMING_CALL;
        gNCSNotificationInfo.packageName = SmartNotificationsUtil.Packages.VOICEMAIL_PACKAGE_NAME;
        gNCSNotificationInfo.postTime = System.currentTimeMillis();
        gNCSNotificationInfo.when = 0L;
        Context context = appContext;
        if (context != null && (string = context.getString(R.string.clear_missed_call)) != null) {
            str = string;
        }
        gNCSNotificationInfo.negativeAction = str;
        CacheManager cacheManager = CacheManager.INSTANCE;
        String str2 = gNCSNotificationInfo.cacheKey;
        str2.getClass();
        GNCSNotificationInfo notification = cacheManager.getNotification(str2);
        if (notification != null) {
            gNCSNotificationInfo.cacheId = notification.cacheId;
            ((GNCSNotificationManager) jb2.b.a(GNCSNotificationManager.class)).removeNotification(gNCSNotificationInfo);
        }
    }

    private final void postOngoingCallNotificationIfNeeded(String incomingNumber) {
        List listK = x.k("SAMSUNG", "LGE");
        String str = Build.MANUFACTURER;
        str.getClass();
        Locale locale = Locale.ROOT;
        String upperCase = str.toUpperCase(locale);
        upperCase.getClass();
        ih2.b.b("PhoneCallListener.postOngoingCallNotificationIfNeeded -> device manufacturer is [" + upperCase + "]");
        str.getClass();
        String upperCase2 = str.toUpperCase(locale);
        upperCase2.getClass();
        if (!listK.contains(upperCase2)) {
            str.getClass();
            String upperCase3 = str.toUpperCase(locale);
            upperCase3.getClass();
            com.airbnb.lottie.animation.keyframe.a.s("PhoneCallListener.postOngoingCallNotificationIfNeeded -> no need to post ongoing call notification for ", upperCase3, " device.");
            return;
        }
        str.getClass();
        String upperCase4 = str.toUpperCase(locale);
        upperCase4.getClass();
        com.airbnb.lottie.animation.keyframe.a.s("PhoneCallListener.postOngoingCallNotificationIfNeeded -> checking if need to post ongoing call notification for  [", upperCase4, "] device.");
        Handler handler2 = handler;
        if (handler2 == null) {
            return;
        }
        List<GNCSNotificationInfo> activeNotificationsOfCallCategory = getActiveNotificationsOfCallCategory();
        if (activeNotificationsOfCallCategory == null || !activeNotificationsOfCallCategory.isEmpty()) {
            Iterator<T> it = activeNotificationsOfCallCategory.iterator();
            while (it.hasNext()) {
                if (((GNCSNotificationInfo) it.next()).callType == 2) {
                    ih2.b.b("PhoneCallListener.postOngoingCallNotificationIfNeeded -> ongoing call notification already exists , no need to post.");
                    return;
                }
            }
        }
        ih2.b.b("PhoneCallListener.postOngoingCallNotificationIfNeeded -> no ongoing call notification exists, posting new one to update the status on the watch.");
        GNCSNotificationInfo gNCSNotificationInfoCreateOnGoingCallNotificationInfo = createOnGoingCallNotificationInfo(incomingNumber);
        Context context = appContext;
        Unit unit = null;
        if (context != null) {
            ((GNCSNotificationManager) jb2.b.a(GNCSNotificationManager.class)).postNotification(gNCSNotificationInfoCreateOnGoingCallNotificationInfo, null, handler2, context);
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            ih2.b.b("PhoneCallListener.postOngoingCallNotificationIfNeeded -> appContext is null, cannot post ongoing call notification.");
        }
    }

    private final void setCallState(CallState callState2) {
        ih2.b.b("PhoneCallListener.setCallState -> updating state from [" + callState + "] to [" + callState2 + "]");
        callState = callState2;
    }

    public final synchronized void disable() {
        if (enabled) {
            Context context = appContext;
            context.getClass();
            if (a7.b.checkSelfPermission(context, "android.permission.READ_PHONE_STATE") != 0) {
                ih2.b.d("PhoneCallListener.disable -> android.permission.READ_PHONE_STATE not granted");
                return;
            }
            try {
                PhoneStateListener phoneStateListener2 = phoneStateListener;
                if (phoneStateListener2 != null) {
                    Context context2 = appContext;
                    Object systemService = context2 != null ? context2.getSystemService("phone") : null;
                    TelephonyManager telephonyManager = systemService instanceof TelephonyManager ? (TelephonyManager) systemService : null;
                    if (telephonyManager != null) {
                        telephonyManager.listen(phoneStateListener2, 0);
                    }
                }
                phoneStateListener = null;
                enabled = false;
                appContext = null;
                handler = null;
                ih2.b.b("PhoneCallListener.disable -> success");
            } catch (Throwable th3) {
                ih2.b.c("PhoneCallListener.disable", th3);
            }
        }
    }

    public final synchronized void enable(Context appContext2, Handler handler2) {
        appContext2.getClass();
        handler2.getClass();
        if (enabled) {
            ih2.b.d("PhoneCallListener.enable -> already enabled .");
            return;
        }
        appContext = appContext2;
        handler = handler2;
        if (a7.b.checkSelfPermission(appContext2, "android.permission.READ_PHONE_STATE") != 0) {
            ih2.b.d("PhoneCallListener.enable -> 'android.permission.READ_PHONE_STATE' not granted");
        } else {
            handler2.post(new u1(appContext2, 2));
        }
    }

    public final CallState getCallState() {
        return callState;
    }

    public final String getMissedCallPhoneNumber() {
        return missedCallPhoneNumber;
    }

    public final void setMissedCallPhoneNumber(String str) {
        missedCallPhoneNumber = str;
    }
}
