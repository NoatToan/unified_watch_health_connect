package com.google.android.gms.iid;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.os.Process;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.exoplayer2.v;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.Constants;
import java.io.IOException;
import java.security.KeyPair;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p1.a;
import vb.h;

/* JADX INFO: loaded from: classes14.dex */
@ShowFirstParty
public class zzaf {
    private PendingIntent zzaf;
    private Messenger zzaj;
    private Map<String, Object> zzcz = new a();
    private Messenger zzda;
    private MessengerCompat zzdb;
    private Context zzl;
    private static final zzaj<Boolean> zzct = zzai.zzy().zzd("gcm_iid_use_messenger_ipc", true);
    private static String zzcu = null;
    private static boolean zzcv = false;
    private static int zzcw = 0;
    private static int zzcx = 0;
    private static int zzcp = 0;
    private static BroadcastReceiver zzcy = null;

    public zzaf(Context context) {
        this.zzl = context;
    }

    private final synchronized void zzg(Intent intent) {
        try {
            if (this.zzaf == null) {
                Intent intent2 = new Intent();
                intent2.setPackage("com.google.example.invalidpackage");
                this.zzaf = PendingIntent.getBroadcast(this.zzl, 0, intent2, 0);
            }
            intent.putExtra("app", this.zzaf);
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public static String zzi(Bundle bundle) {
        if (bundle == null) {
            h.C("SERVICE_NOT_AVAILABLE");
            return null;
        }
        String string = bundle.getString("registration_id");
        if (string == null) {
            string = bundle.getString("unregistered");
        }
        if (string != null) {
            return string;
        }
        String string2 = bundle.getString(Constants.IPC_BUNDLE_KEY_SEND_ERROR);
        if (string2 != null) {
            h.C(string2);
            return null;
        }
        new StringBuilder(String.valueOf(bundle).length() + 29);
        new Throwable();
        h.C("SERVICE_NOT_AVAILABLE");
        return null;
    }

    private final Bundle zzj(Bundle bundle) throws IOException {
        Bundle bundleZzk = zzk(bundle);
        if (bundleZzk == null || !bundleZzk.containsKey("google.messenger")) {
            return bundleZzk;
        }
        Bundle bundleZzk2 = zzk(bundle);
        if (bundleZzk2 == null || !bundleZzk2.containsKey("google.messenger")) {
            return bundleZzk2;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:31:0x00c4 A[Catch: all -> 0x00e6, TryCatch #3 {all -> 0x00e6, blocks: (B:29:0x00c0, B:31:0x00c4, B:34:0x00e8), top: B:76:0x00c0 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:40:0x0103  */
    /* JADX WARN: Code duplicated, block: B:43:0x010f  */
    /* JADX WARN: Code duplicated, block: B:45:0x0115  */
    /* JADX WARN: Code duplicated, block: B:46:0x0119  */
    /* JADX WARN: Code duplicated, block: B:76:0x00c0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    private final Bundle zzk(Bundle bundle) throws IOException {
        boolean z14;
        Context context;
        Bundle bundle2;
        ConditionVariable conditionVariable = new ConditionVariable();
        String strZzx = zzx();
        synchronized (getClass()) {
            this.zzcz.put(strZzx, conditionVariable);
        }
        if (this.zzaj == null) {
            zzl(this.zzl);
            this.zzaj = new Messenger(new zzag(this, Looper.getMainLooper()));
        }
        if (zzcu == null) {
            h.C(InstanceID.ERROR_MISSING_INSTANCEID_SERVICE);
            return null;
        }
        Intent intent = new Intent(zzcv ? "com.google.iid.TOKEN_REQUEST" : "com.google.android.c2dm.intent.REGISTER");
        intent.setPackage(zzcu);
        intent.putExtras(bundle);
        zzg(intent);
        intent.putExtra("kid", v.c(v.a(5, strZzx), "|ID|", strZzx, "|"));
        intent.putExtra("X-kid", v.c(String.valueOf(strZzx).length() + 5, "|ID|", strZzx, "|"));
        boolean zEquals = GooglePlayServicesUtilLight.GOOGLE_SERVICES_FRAMEWORK_PACKAGE.equals(zzcu);
        String stringExtra = intent.getStringExtra("useGsf");
        if (stringExtra != null) {
            zEquals = IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE.equals(stringExtra);
        }
        if (Log.isLoggable("InstanceID", 3)) {
            new StringBuilder(String.valueOf(intent.getExtras()).length() + 8);
        }
        if (this.zzda != null) {
            intent.putExtra("google.messenger", this.zzaj);
            Message messageObtain = Message.obtain();
            messageObtain.obj = intent;
            try {
                this.zzda.send(messageObtain);
            } catch (RemoteException unused) {
                if (zEquals) {
                    synchronized (zzaf.class) {
                        try {
                            if (zzcy == null) {
                                zzcy = new zzah(this);
                                IntentFilter intentFilter = new IntentFilter("com.google.android.c2dm.intent.REGISTRATION");
                                intentFilter.addCategory(this.zzl.getPackageName());
                                this.zzl.registerReceiver(zzcy, intentFilter, "com.google.android.c2dm.permission.SEND", null);
                            }
                            this.zzl.sendBroadcast(intent);
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                } else {
                    intent.putExtra("google.messenger", this.zzaj);
                    intent.putExtra("messenger2", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
                    if (this.zzdb != null) {
                        Message messageObtain2 = Message.obtain();
                        messageObtain2.obj = intent;
                        try {
                            this.zzdb.send(messageObtain2);
                        } catch (RemoteException unused2) {
                            z14 = zzcv;
                            context = this.zzl;
                            if (z14) {
                                context.sendBroadcast(intent);
                            } else {
                                context.startService(intent);
                            }
                        }
                    } else {
                        z14 = zzcv;
                        context = this.zzl;
                        if (z14) {
                            context.sendBroadcast(intent);
                        } else {
                            context.startService(intent);
                        }
                    }
                }
            }
        } else if (zEquals) {
            synchronized (zzaf.class) {
                if (zzcy == null) {
                    zzcy = new zzah(this);
                    IntentFilter intentFilter2 = new IntentFilter("com.google.android.c2dm.intent.REGISTRATION");
                    intentFilter2.addCategory(this.zzl.getPackageName());
                    this.zzl.registerReceiver(zzcy, intentFilter2, "com.google.android.c2dm.permission.SEND", null);
                }
            }
            this.zzl.sendBroadcast(intent);
        } else {
            intent.putExtra("google.messenger", this.zzaj);
            intent.putExtra("messenger2", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
            if (this.zzdb != null) {
                Message messageObtain3 = Message.obtain();
                messageObtain3.obj = intent;
                this.zzdb.send(messageObtain3);
            } else {
                z14 = zzcv;
                context = this.zzl;
                if (z14) {
                    context.sendBroadcast(intent);
                } else {
                    context.startService(intent);
                }
            }
        }
        conditionVariable.block(30000L);
        synchronized (getClass()) {
            try {
                Object objRemove = this.zzcz.remove(strZzx);
                if (!(objRemove instanceof Bundle)) {
                    if (objRemove instanceof String) {
                        throw new IOException((String) objRemove);
                    }
                    new StringBuilder(String.valueOf(objRemove).length() + 12);
                    throw new IOException(InstanceID.ERROR_TIMEOUT);
                }
                bundle2 = (Bundle) objRemove;
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return bundle2;
    }

    @ShowFirstParty
    public static String zzl(Context context) {
        String str = zzcu;
        if (str != null) {
            return str;
        }
        zzcw = Process.myUid();
        PackageManager packageManager = context.getPackageManager();
        if (!PlatformVersion.isAtLeastO()) {
            Iterator<ResolveInfo> it = packageManager.queryIntentServices(new Intent("com.google.android.c2dm.intent.REGISTER"), 0).iterator();
            while (it.hasNext()) {
                if (zzd(packageManager, it.next().serviceInfo.packageName, "com.google.android.c2dm.intent.REGISTER")) {
                    zzcv = false;
                    return zzcu;
                }
            }
        }
        Iterator<ResolveInfo> it3 = packageManager.queryBroadcastReceivers(new Intent("com.google.iid.TOKEN_REQUEST"), 0).iterator();
        while (it3.hasNext()) {
            if (zzd(packageManager, it3.next().activityInfo.packageName, "com.google.iid.TOKEN_REQUEST")) {
                zzcv = true;
                return zzcu;
            }
        }
        if (zzd(packageManager, "com.google.android.gms")) {
            zzcv = PlatformVersion.isAtLeastO();
            return zzcu;
        }
        if (PlatformVersion.isAtLeastLollipop() || !zzd(packageManager, GooglePlayServicesUtilLight.GOOGLE_SERVICES_FRAMEWORK_PACKAGE)) {
            return null;
        }
        zzcv = false;
        return zzcu;
    }

    private static int zzm(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(zzl(context), 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            return -1;
        }
    }

    private static synchronized String zzx() {
        int i14;
        i14 = zzcp;
        zzcp = i14 + 1;
        return Integer.toString(i14);
    }

    public final Bundle zzd(Bundle bundle, KeyPair keyPair) {
        int iZzm = zzm(this.zzl);
        bundle.putString("gmsv", Integer.toString(iZzm));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", Integer.toString(InstanceID.zzg(this.zzl)));
        bundle.putString("app_ver_name", InstanceID.zzh(this.zzl));
        bundle.putString("cliv", "iid-12451000");
        bundle.putString("appid", InstanceID.zzd(keyPair));
        if (iZzm < 12000000 || !zzct.get().booleanValue()) {
            return zzj(bundle);
        }
        try {
            return (Bundle) Tasks.await(new zzr(this.zzl).zzd(1, bundle));
        } catch (InterruptedException | ExecutionException e4) {
            if (Log.isLoggable("InstanceID", 3)) {
                new StringBuilder(String.valueOf(e4).length() + 22);
            }
            if ((e4.getCause() instanceof zzaa) && ((zzaa) e4.getCause()).getErrorCode() == 4) {
                return zzj(bundle);
            }
            return null;
        }
    }

    public final void zze(Message message) {
        if (message == null) {
            return;
        }
        Object obj = message.obj;
        if (obj instanceof Intent) {
            Intent intent = (Intent) obj;
            intent.setExtrasClassLoader(MessengerCompat.class.getClassLoader());
            if (intent.hasExtra("google.messenger")) {
                Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                if (parcelableExtra instanceof MessengerCompat) {
                    this.zzdb = (MessengerCompat) parcelableExtra;
                }
                if (parcelableExtra instanceof Messenger) {
                    this.zzda = (Messenger) parcelableExtra;
                }
            }
            zzh((Intent) message.obj);
        }
    }

    public final void zzh(Intent intent) {
        if (intent == null) {
            return;
        }
        String action = intent.getAction();
        if (!"com.google.android.c2dm.intent.REGISTRATION".equals(action) && !"com.google.android.gms.iid.InstanceID".equals(action)) {
            if (Log.isLoggable("InstanceID", 3)) {
                String strValueOf = String.valueOf(intent.getAction());
                if (strValueOf.length() != 0) {
                    "Unexpected response ".concat(strValueOf);
                    return;
                }
                return;
            }
            return;
        }
        String stringExtra = intent.getStringExtra("registration_id");
        if (stringExtra == null) {
            stringExtra = intent.getStringExtra("unregistered");
        }
        if (stringExtra != null) {
            Matcher matcher = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)").matcher(stringExtra);
            if (!matcher.matches()) {
                if (!Log.isLoggable("InstanceID", 3) || stringExtra.length() == 0) {
                    return;
                }
                "Unexpected response string: ".concat(stringExtra);
                return;
            }
            String strGroup = matcher.group(1);
            String strGroup2 = matcher.group(2);
            Bundle extras = intent.getExtras();
            extras.putString("registration_id", strGroup2);
            zzd(strGroup, (Object) extras);
            return;
        }
        String stringExtra2 = intent.getStringExtra(Constants.IPC_BUNDLE_KEY_SEND_ERROR);
        if (stringExtra2 == null) {
            new StringBuilder(String.valueOf(intent.getExtras()).length() + 49);
            return;
        }
        if (Log.isLoggable("InstanceID", 3) && stringExtra2.length() != 0) {
            "Received InstanceID error ".concat(stringExtra2);
        }
        String str = null;
        if (stringExtra2.startsWith("|")) {
            String[] strArrSplit = stringExtra2.split("\\|");
            if (!"ID".equals(strArrSplit[1]) && stringExtra2.length() != 0) {
                "Unexpected structured response ".concat(stringExtra2);
            }
            if (strArrSplit.length > 2) {
                str = strArrSplit[2];
                stringExtra2 = strArrSplit[3];
                if (stringExtra2.startsWith(":")) {
                    stringExtra2 = stringExtra2.substring(1);
                }
            } else {
                stringExtra2 = "UNKNOWN";
            }
            intent.putExtra(Constants.IPC_BUNDLE_KEY_SEND_ERROR, stringExtra2);
        }
        if (str != null) {
            zzd(str, (Object) stringExtra2);
            return;
        }
        synchronized (getClass()) {
            try {
                for (String str2 : this.zzcz.keySet()) {
                    Object obj = this.zzcz.get(str2);
                    this.zzcz.put(str2, stringExtra2);
                    zzd(obj, stringExtra2);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    private static boolean zzd(PackageManager packageManager, String str) {
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 0);
            zzcu = applicationInfo.packageName;
            zzcx = applicationInfo.uid;
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    private final void zzd(String str, Object obj) {
        synchronized (getClass()) {
            Object obj2 = this.zzcz.get(str);
            this.zzcz.put(str, obj);
            zzd(obj2, obj);
        }
    }

    private static void zzd(Object obj, Object obj2) {
        if (obj instanceof ConditionVariable) {
            ((ConditionVariable) obj).open();
        }
        if (obj instanceof Messenger) {
            Messenger messenger = (Messenger) obj;
            Message messageObtain = Message.obtain();
            messageObtain.obj = obj2;
            try {
                messenger.send(messageObtain);
            } catch (RemoteException e4) {
                new StringBuilder(String.valueOf(e4).length() + 24);
            }
        }
    }

    private static boolean zzd(PackageManager packageManager, String str, String str2) {
        if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", str) == 0) {
            return zzd(packageManager, str);
        }
        new StringBuilder(v.a(v.a(56, str), str2));
        return false;
    }

    @ShowFirstParty
    public static boolean zzk(Context context) {
        if (zzcu != null) {
            zzl(context);
        }
        return zzcv;
    }
}
