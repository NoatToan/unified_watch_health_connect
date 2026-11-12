package com.huawei.secure.android.common.intent;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.ActivityNotFoundException;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.secure.android.common.activity.a;
import java.io.Serializable;
import java.net.URISyntaxException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public class IntentUtils {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f22841a = "IntentUtils";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f22842b = 750000;

    public static void filterIntent(Intent intent) {
        filterIntentComAndSel(intent);
        filterIntentClipData(intent);
        filterIntentRWPermission(intent);
    }

    public static void filterIntentComAndSel(Intent intent) {
        if (intent == null) {
            return;
        }
        intent.addCategory("android.intent.category.BROWSABLE").setComponent(null);
        intent.setSelector(null);
    }

    public static void filterIntentRWPermission(Intent intent) {
        if (intent == null) {
            return;
        }
        intent.setFlags(intent.getFlags() & (-196));
    }

    public static String getCallerPackage(Activity activity) {
        a.b(f22841a, "getCallerPackage");
        if (activity == null) {
            a.a(f22841a, "getCallerPackage, activity is null");
            return "";
        }
        try {
            Object objInvoke = ActivityManager.class.getMethod("getService", null).invoke(null, null);
            String[] packagesForUid = activity.getPackageManager().getPackagesForUid(((Integer) objInvoke.getClass().getMethod("getLaunchedFromUid", IBinder.class).invoke(objInvoke, (IBinder) Activity.class.getMethod("getActivityToken", null).invoke(activity, null))).intValue());
            if (packagesForUid != null && packagesForUid.length >= 1) {
                String str = packagesForUid[0];
                a.b(f22841a, "getCallerPackage, package is: " + str);
                return str;
            }
            a.a(f22841a, "getCallerPackage, packages is null or empty");
            return "";
        } catch (Exception e) {
            a.a(f22841a, "getCallerPackage exception: " + e.getMessage(), true);
            return "";
        }
    }

    public static <T extends Parcelable> ArrayList<T> getParcelableArrayListExtra(Intent intent, String str) {
        try {
            return intent.getParcelableArrayListExtra(str);
        } catch (Throwable th) {
            a.a(f22841a, "getParcelableArrayListExtra failed on intent " + th.getMessage(), true);
            return null;
        }
    }

    public static int getParceledIntentSize(Intent intent) {
        if (intent == null) {
            a.a(f22841a, "getParceledIntentSize: intent is null");
            return 0;
        }
        Parcel parcelObtain = Parcel.obtain();
        intent.writeToParcel(parcelObtain, 0);
        int iDataSize = parcelObtain.dataSize();
        parcelObtain.recycle();
        return iDataSize;
    }

    public static Uri getReferrer(Activity activity) {
        try {
            return activity.getReferrer();
        } catch (Throwable th) {
            a.a(f22841a, "getReferrer: " + th.getMessage(), true);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0025  */
    public static boolean hasIntentBomb(Intent intent) {
        boolean zHasIntentBomb;
        if (intent != null) {
            if (intent instanceof SafeIntent) {
                a.b(f22841a, "safe intent");
                zHasIntentBomb = ((SafeIntent) intent).hasIntentBomb();
            } else {
                try {
                    intent.getStringExtra("ANYTHING");
                    zHasIntentBomb = false;
                } catch (Throwable unused) {
                    zHasIntentBomb = true;
                }
            }
            if (zHasIntentBomb) {
                a.a(f22841a, "hasIntentBomb");
            }
            return zHasIntentBomb;
        }
        a.a(f22841a, "intent is null");
        zHasIntentBomb = true;
        if (zHasIntentBomb) {
            a.a(f22841a, "hasIntentBomb");
        }
        return zHasIntentBomb;
    }

    public static boolean isIntentTooLarge(Intent intent) {
        if (intent != null) {
            return getParceledIntentSize(intent) > f22842b;
        }
        a.a(f22841a, "isIntentTooLarge: intent is null");
        return true;
    }

    public static boolean safeGetBoolean(Bundle bundle, String str) {
        return safeGetBoolean(bundle, str, false);
    }

    public static boolean safeGetBooleanExtra(Intent intent, String str, boolean z) {
        try {
            return intent.getBooleanExtra(str, z);
        } catch (Throwable th) {
            a.a(f22841a, "getBooleanExtra failed on intent " + th.getMessage(), true);
            return z;
        }
    }

    public static Bundle safeGetBundle(Bundle bundle, String str) {
        try {
            return bundle.getBundle(str);
        } catch (Throwable th) {
            a.a(f22841a, "getBundle failed on bundle " + th.getMessage(), true);
            return new Bundle();
        }
    }

    public static Bundle safeGetBundleExtra(Intent intent, String str) {
        try {
            return intent.getBundleExtra(str);
        } catch (Throwable th) {
            a.a(f22841a, "getBundleExtra failed on intent " + th.getMessage(), true);
            return new Bundle();
        }
    }

    public static byte[] safeGetByteArrayExtra(Intent intent, String str) {
        try {
            return intent.getByteArrayExtra(str);
        } catch (Throwable th) {
            a.a(f22841a, "getByteArrayExtra failed on intent " + th.getMessage(), true);
            return new byte[0];
        }
    }

    public static int safeGetInt(Bundle bundle, String str, int i) {
        try {
            return bundle.getInt(str, i);
        } catch (Throwable th) {
            a.a(f22841a, "getInt failed on bundle " + th.getMessage(), true);
            return i;
        }
    }

    public static int[] safeGetIntArray(Bundle bundle, String str) {
        try {
            return bundle.getIntArray(str);
        } catch (Throwable th) {
            a.a(f22841a, "getIntArray failed on bundle " + th.getMessage(), true);
            return new int[0];
        }
    }

    public static int[] safeGetIntArrayExtra(Intent intent, String str) {
        try {
            return intent.getIntArrayExtra(str);
        } catch (Throwable th) {
            a.a(f22841a, "getIntArrayExtra failed on intent " + th.getMessage(), true);
            return new int[0];
        }
    }

    public static int safeGetIntExtra(Intent intent, String str, int i) {
        try {
            return intent.getIntExtra(str, i);
        } catch (Throwable th) {
            a.a(f22841a, "getIntExtra failed on intent " + th.getMessage(), true);
            return i;
        }
    }

    public static long safeGetLongExtra(Intent intent, String str, long j) {
        try {
            return intent.getLongExtra(str, j);
        } catch (Throwable th) {
            a.a(f22841a, "getLongExtra failed on intent " + th.getMessage(), true);
            return j;
        }
    }

    @Deprecated
    public static <T extends Parcelable> T safeGetParcelable(Bundle bundle, String str) {
        try {
            return (T) bundle.getParcelable(str);
        } catch (Throwable th) {
            a.a(f22841a, "getParcelable failed on bundle " + th.getMessage(), true);
            return null;
        }
    }

    public static Parcelable[] safeGetParcelableArrayExtra(Intent intent, String str) {
        try {
            return intent.getParcelableArrayExtra(str);
        } catch (Throwable th) {
            a.a(f22841a, "getParcelableArrayExtra failed on intent " + th.getMessage(), true);
            return new Parcelable[0];
        }
    }

    @Deprecated
    public static <T extends Parcelable> T safeGetParcelableExtra(Intent intent, String str) {
        try {
            return (T) intent.getParcelableExtra(str);
        } catch (Throwable th) {
            a.a(f22841a, "getParcelableExtra failed on intent " + th.getMessage(), true);
            return null;
        }
    }

    public static <T extends Serializable> T safeGetSerializable(Bundle bundle, String str, Class<T> cls) {
        try {
            Serializable serializable = bundle.getSerializable(str);
            if (cls.isInstance(serializable)) {
                return cls.cast(serializable);
            }
            return null;
        } catch (Throwable th) {
            a.a(f22841a, "getSerializable exception: " + th.getMessage(), true);
            return null;
        }
    }

    @Deprecated
    public static <T extends Serializable> T safeGetSerializableExtra(Intent intent, String str) {
        try {
            return (T) intent.getSerializableExtra(str);
        } catch (ClassCastException e) {
            a.a(f22841a, "Invalide class for Serializable: " + e.getMessage(), true);
            return null;
        } catch (Throwable th) {
            a.a(f22841a, "getSerializableExtra failed on intent " + th.getMessage(), true);
            return null;
        }
    }

    public static String safeGetString(Bundle bundle, String str) {
        try {
            return bundle.getString(str);
        } catch (Throwable th) {
            a.a(f22841a, "getString failed on bundle " + th.getMessage(), true);
            return "";
        }
    }

    public static ArrayList<String> safeGetStringArrayListExtra(Intent intent, String str) {
        try {
            return intent.getStringArrayListExtra(str);
        } catch (Throwable th) {
            a.a(f22841a, "getStringArrayListExtra failed on intent " + th.getMessage(), true);
            return new ArrayList<>();
        }
    }

    public static String safeGetStringExtra(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Throwable th) {
            a.a(f22841a, "getStringExtra failed on intent " + th.getMessage(), true);
            return "";
        }
    }

    public static boolean safeHasExtra(Intent intent, String str) {
        try {
            return intent.hasExtra(str);
        } catch (Throwable unused) {
            return false;
        }
    }

    public static Intent safeParseUri(String str, int i) throws URISyntaxException {
        if (str == null) {
            return null;
        }
        Intent uri = Intent.parseUri(str, i);
        filterIntent(uri);
        return uri;
    }

    public static void safeRemoveExtra(Intent intent, String str) {
        try {
            intent.removeExtra(str);
        } catch (Throwable th) {
            a.a(f22841a, "removeExtra failed on intent " + th.getMessage(), true);
        }
    }

    public static boolean safeStartActivity(Context context, Intent intent) {
        return safeStartActivity(context, intent, null);
    }

    public static boolean safeStartActivityForResultStatic(Activity activity, Intent intent, int i) {
        try {
            activity.startActivityForResult(intent, i);
            return true;
        } catch (ActivityNotFoundException e) {
            a.a(f22841a, "safeStartActivityForResult: ActivityNotFoundException ", e);
            return false;
        } catch (Exception e2) {
            a.a(f22841a, "safeStartActivityForResult: Exception ", e2);
            return false;
        } catch (Throwable th) {
            a.a(f22841a, "safeStartActivityForResult: throwable ", th);
            return false;
        }
    }

    @Deprecated
    public boolean safeStartActivityForResult(Activity activity, Intent intent, int i) {
        try {
            activity.startActivityForResult(intent, i);
            return true;
        } catch (ActivityNotFoundException e) {
            a.a(f22841a, "safeStartActivityForResult: ActivityNotFoundException ", e);
            return false;
        } catch (Exception e2) {
            a.a(f22841a, "safeStartActivityForResult: Exception ", e2);
            return false;
        } catch (Throwable th) {
            a.a(f22841a, "safeStartActivityForResult: throwable ", th);
            return false;
        }
    }

    public static void filterIntentClipData(Intent intent) {
        if (intent != null && intent.getClipData() == null) {
            intent.setClipData(ClipData.newPlainText("avoid intent migrateExtraStreamToClipData add flags", "anything"));
        }
    }

    public static boolean safeGetBoolean(Bundle bundle, String str, boolean z) {
        try {
            return bundle.getBoolean(str, z);
        } catch (Throwable th) {
            a.a(f22841a, "getBoolean failed with throwable: " + th.getMessage());
            return z;
        }
    }

    public static boolean safeStartActivity(Context context, Intent intent, Bundle bundle) {
        try {
            context.startActivity(intent, bundle);
            return true;
        } catch (ActivityNotFoundException e) {
            a.a(f22841a, "safeStartActivity: ActivityNotFoundException ", e);
            return false;
        } catch (Exception unused) {
            a.a(f22841a, "safeStartActivityForResult: Exception");
            return false;
        } catch (Throwable unused2) {
            a.a(f22841a, "safeStartActivityForResult: throwable");
            return false;
        }
    }

    public static <T extends Parcelable> T safeGetParcelable(Bundle bundle, String str, Class<T> cls) {
        try {
            Parcelable parcelable = bundle.getParcelable(str);
            if (cls.isInstance(parcelable)) {
                return cls.cast(parcelable);
            }
            return null;
        } catch (Throwable th) {
            a.a(f22841a, "getParcelable exception: " + th.getMessage(), true);
            return null;
        }
    }

    public static <T extends Parcelable> T safeGetParcelableExtra(Intent intent, String str, Class<T> cls) {
        try {
            Parcelable parcelableExtra = intent.getParcelableExtra(str);
            if (cls.isInstance(parcelableExtra)) {
                return cls.cast(parcelableExtra);
            }
            return null;
        } catch (Throwable th) {
            a.a(f22841a, "getParcelable exception: " + th.getMessage(), true);
            return null;
        }
    }

    public static <T extends Serializable> T safeGetSerializableExtra(Intent intent, String str, Class<T> cls) {
        try {
            Serializable serializableExtra = intent.getSerializableExtra(str);
            if (cls.isInstance(serializableExtra)) {
                return cls.cast(serializableExtra);
            }
            return null;
        } catch (Throwable th) {
            a.a(f22841a, "getSerializable exception: " + th.getMessage(), true);
            return null;
        }
    }

    public static boolean safeStartActivityForResultStatic(Activity activity, Intent intent, int i, Bundle bundle) {
        try {
            activity.startActivityForResult(intent, i, bundle);
            return true;
        } catch (ActivityNotFoundException e) {
            a.a(f22841a, "safeStartActivityForResult: ActivityNotFoundException ", e);
            return false;
        } catch (Exception unused) {
            a.a(f22841a, "safeStartActivityForResult: Exception");
            return false;
        } catch (Throwable unused2) {
            a.a(f22841a, "safeStartActivityForResult: throwable");
            return false;
        }
    }

    @Deprecated
    public boolean safeStartActivityForResult(Activity activity, Intent intent, int i, Bundle bundle) {
        try {
            activity.startActivityForResult(intent, i, bundle);
            return true;
        } catch (ActivityNotFoundException e) {
            a.a(f22841a, "safeStartActivityForResult: ActivityNotFoundException ", e);
            return false;
        } catch (Exception unused) {
            a.a(f22841a, "safeStartActivityForResult: Exception");
            return false;
        } catch (Throwable unused2) {
            a.a(f22841a, "safeStartActivityForResult: throwable");
            return false;
        }
    }
}
