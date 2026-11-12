package com.garmin.android.gncs;

import android.content.Context;
import android.provider.Telephony;
import android.telecom.TelecomManager;
import ch.qos.logback.core.CoreConstants;
import d53.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p13.y;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0001\u001a \u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0000\u001a\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\bH\u0000\u001a\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\bH\u0000\u001a\n\u0010\u000e\u001a\u0004\u0018\u00010\u0003H\u0000¨\u0006\u000f"}, d2 = {"fromSemanticVersion", "", "semanticVersion", "", "getApplicationStatus", "", "Lcom/garmin/android/gncs/AppNotificationStateInfo;", "appContext", "Landroid/content/Context;", "isBlocked", "", "getDefaultDialerApp", CoreConstants.CONTEXT_SCOPE_VALUE, "getDefaultSMSApp", "getHashForDisabledApps", "gncs-gdi_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class SmartNotificationsDataHandlerKt {
    public static final int fromSemanticVersion(String str) {
        str.getClass();
        if (w.J(str) || str.equals("0.0.0")) {
            return Integer.MAX_VALUE;
        }
        List listX = w.X(w.f0(str, '-'), new char[]{'.'});
        ArrayList arrayList = new ArrayList(y.r(listX, 10));
        Iterator it = listX.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(Integer.parseInt((String) it.next())));
        }
        return (((Number) arrayList.get(0)).intValue() << 16) | (((Number) arrayList.get(1)).intValue() << 8) | ((Number) arrayList.get(2)).intValue();
    }

    public static final List<AppNotificationStateInfo> getApplicationStatus(Context context, boolean z14) {
        context.getClass();
        try {
            return SmartNotificationsUtil.getAllApplications(context, Boolean.valueOf(z14));
        } catch (Throwable th3) {
            ih2.b.c("getApplicationStatus", th3);
            return null;
        }
    }

    public static final String getDefaultDialerApp(Context context) {
        context.getClass();
        try {
            TelecomManager telecomManager = (TelecomManager) a7.b.getSystemService(context, TelecomManager.class);
            String defaultDialerPackage = telecomManager != null ? telecomManager.getDefaultDialerPackage() : null;
            return defaultDialerPackage == null ? "" : defaultDialerPackage;
        } catch (Throwable unused) {
            return "";
        }
    }

    public static final String getDefaultSMSApp(Context context) {
        context.getClass();
        try {
            String defaultSmsPackage = Telephony.Sms.getDefaultSmsPackage(context.getApplicationContext());
            return defaultSmsPackage == null ? "" : defaultSmsPackage;
        } catch (Throwable unused) {
            return "";
        }
    }

    public static final String getHashForDisabledApps() {
        try {
            return SmartNotificationsUtil.getHashForDisableApps();
        } catch (Throwable th3) {
            ih2.b.c("getHashForDisabledApps", th3);
            return null;
        }
    }
}
