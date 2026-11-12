package com.garmin.android.gncs.sms;

import a7.b;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.provider.Telephony;
import android.telephony.SmsManager;
import ch.qos.logback.core.CoreConstants;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import ih2.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p13.j0;
import p13.y;
import wx2.a;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0000\u001a\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t2\u0006\u0010\u0004\u001a\u00020\u0005H\u0001\u001a \u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0007H\u0001\u001a\f\u0010\u000f\u001a\u00020\u0003*\u00020\u0010H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"MIN_PHONE_NUMBER_LENGTH", "", "isDefaultSmsPackage", "", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME, "", "loadSmsPackages", "", "sendSms", "", "appContext", "receiverNumber", "text", "isSmsPackage", "Landroid/content/pm/PackageInfo;", "gncs-all-modules_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class SmsUtilKt {
    private static final int MIN_PHONE_NUMBER_LENGTH = 3;

    public static final boolean isDefaultSmsPackage(Context context, String str) {
        context.getClass();
        str.getClass();
        return str.equals(Telephony.Sms.getDefaultSmsPackage(context.getApplicationContext()));
    }

    private static final boolean isSmsPackage(PackageInfo packageInfo) {
        String[] strArr = packageInfo.requestedPermissions;
        if (strArr != null) {
            if (strArr.length == 0) {
                strArr = null;
            }
            if (strArr != null) {
                boolean z14 = false;
                boolean z15 = false;
                boolean z16 = false;
                for (String str : strArr) {
                    if (!z14 && "android.permission.RECEIVE_MMS".equals(str)) {
                        z14 = true;
                    }
                    if (!z15 && "android.permission.RECEIVE_SMS".equals(str)) {
                        z15 = true;
                    }
                    if (!z16 && "android.permission.READ_SMS".equals(str)) {
                        z16 = true;
                    }
                    if (z14 && z15 && z16) {
                        break;
                    }
                }
                if (z14 && z15 && z16) {
                    return true;
                }
            }
        }
        return false;
    }

    @SuppressLint({"QueryPermissionsNeeded"})
    public static final List<String> loadSmsPackages(Context context) {
        context.getClass();
        try {
            List<PackageInfo> installedPackages = context.getApplicationContext().getPackageManager().getInstalledPackages(4096);
            installedPackages.getClass();
            ArrayList arrayList = new ArrayList();
            for (Object obj : installedPackages) {
                PackageInfo packageInfo = (PackageInfo) obj;
                packageInfo.getClass();
                if (isSmsPackage(packageInfo)) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(y.r(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((PackageInfo) it.next()).packageName);
            }
            return arrayList2;
        } catch (Exception unused) {
            return j0.f134944a;
        }
    }

    @SuppressLint({"MissingPermission"})
    public static final void sendSms(Context context, String str, String str2) {
        a aVarB;
        Integer num;
        context.getClass();
        str.getClass();
        str2.getClass();
        if (b.checkSelfPermission(context, "android.permission.SEND_SMS") != 0) {
            ih2.b.b("SmsHelper: sendSms -> missing SEND_SMS permission");
            d.c(context);
            return;
        }
        if (str.length() < 3) {
            ih2.b.b("SmsHelper: sendSms -> invalid receiver number");
            return;
        }
        if (str2.length() == 0) {
            ih2.b.b("SmsHelper: sendSms -> empty text");
            return;
        }
        SmsManager smsManager = (SmsManager) context.getSystemService(SmsManager.class);
        if (smsManager == null) {
            smsManager = SmsManager.getDefault();
        }
        a aVar = null;
        if (smsManager.divideMessage(str2).size() <= 1) {
            ih2.b.b("SmsHelper: sendSms -> message is single part, sending as text");
            aVarB = new wx2.b(context).c(str, str2, null);
        } else {
            ih2.b.b("SmsHelper: sendSms -> message is multipart, sending as multipart");
            aVarB = new wx2.b(context).b(str, str2, null);
        }
        if (!aVarB.f188010a && (num = aVarB.f188011b) != null && num.intValue() == 5) {
            aVar = aVarB;
        }
        if (aVar != null) {
            ih2.b.b("SmsHelper: sendSms -> sendTextMessage failed, error: " + aVar.f188011b);
            d.c(context);
        }
    }
}
