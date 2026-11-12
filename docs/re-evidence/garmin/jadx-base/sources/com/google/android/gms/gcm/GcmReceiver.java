package com.google.android.gms.gcm;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.util.Base64;
import android.util.Log;
import com.garmin.proto.generated.GDIConnectIQHTTPProto;
import com.google.android.exoplayer2.v;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.wallet.WalletConstants;
import com.google.firebase.messaging.Constants;
import r9.a;

/* JADX INFO: loaded from: classes14.dex */
@Deprecated
public class GcmReceiver extends a {
    private static boolean zzr = false;
    private static com.google.android.gms.iid.zzk zzs;
    private static com.google.android.gms.iid.zzk zzt;

    private final synchronized com.google.android.gms.iid.zzk zzd(Context context, String str) {
        try {
            if ("com.google.android.c2dm.intent.RECEIVE".equals(str)) {
                if (zzt == null) {
                    zzt = new com.google.android.gms.iid.zzk(context, str);
                }
                return zzt;
            }
            if (zzs == null) {
                zzs = new com.google.android.gms.iid.zzk(context, str);
            }
            return zzs;
        } catch (Throwable th3) {
            throw th3;
        }
    }

    private static int zze(Context context, Intent intent) {
        ServiceInfo serviceInfo;
        String strConcat;
        ResolveInfo resolveInfoResolveService = context.getPackageManager().resolveService(intent, 0);
        if (resolveInfoResolveService != null && (serviceInfo = resolveInfoResolveService.serviceInfo) != null) {
            if (!context.getPackageName().equals(serviceInfo.packageName) || (strConcat = serviceInfo.name) == null) {
                new StringBuilder(v.a(v.a(94, serviceInfo.packageName), serviceInfo.name));
            } else {
                if (strConcat.startsWith(".")) {
                    String strValueOf = String.valueOf(context.getPackageName());
                    strConcat = strConcat.length() != 0 ? strValueOf.concat(strConcat) : new String(strValueOf);
                }
                if (Log.isLoggable("GcmReceiver", 3) && strConcat.length() != 0) {
                    "Restricting intent to a specific service: ".concat(strConcat);
                }
                intent.setClassName(context.getPackageName(), strConcat);
            }
        }
        try {
            if ((context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0 ? a.startWakefulService(context, intent) : context.startService(intent)) == null) {
                return WalletConstants.ERROR_CODE_INVALID_PARAMETERS;
            }
            return -1;
        } catch (IllegalStateException e4) {
            new StringBuilder(String.valueOf(e4).length() + 45);
            return 402;
        } catch (SecurityException unused) {
            return GDIConnectIQHTTPProto.ConnectIQHTTPResponse.ResponseStatus.INVALID_HTTP_HEADER_FIELDS_IN_NETWORK_RESPONSE_VALUE;
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        int iZzd;
        intent.setComponent(null);
        intent.setPackage(context.getPackageName());
        if ("google.com/iid".equals(intent.getStringExtra(Constants.MessagePayloadKeys.FROM))) {
            intent.setAction("com.google.android.gms.iid.InstanceID");
        }
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra(Constants.MessagePayloadKeys.RAW_DATA, Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        if (isOrderedBroadcast()) {
            setResultCode(500);
        }
        boolean z14 = PlatformVersion.isAtLeastO() && context.getApplicationInfo().targetSdkVersion >= 26;
        boolean z15 = (intent.getFlags() & 268435456) != 0;
        if (!z14 || z15) {
            int iZze = "com.google.android.c2dm.intent.RECEIVE".equals(intent.getAction()) ? zze(context, intent) : zze(context, intent);
            if (PlatformVersion.isAtLeastO() && iZze == 402) {
                zzd(context, intent);
                iZzd = 403;
            } else {
                iZzd = iZze;
            }
        } else {
            iZzd = zzd(context, intent);
        }
        if (isOrderedBroadcast()) {
            setResultCode(iZzd);
        }
    }

    private final int zzd(Context context, Intent intent) {
        if (isOrderedBroadcast()) {
            setResultCode(-1);
        }
        zzd(context, intent.getAction()).zzd(intent, goAsync());
        return -1;
    }
}
