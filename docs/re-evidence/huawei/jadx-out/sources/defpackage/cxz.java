package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.preference.PreferenceManager;
import android.provider.Settings;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.huawei.featureuserprofile.R;
import com.huawei.featureuserprofile.sos.manager.EmergencyInfoManager;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import com.huawei.login.ui.login.LoginInit;
import health.compact.a.HwEncryptUtil;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.util.LogUtil;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes6.dex */
public class cxz {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f31482c = Pattern.quote("|");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Map<String, Integer> f31481b = null;
    private static Map<String, Integer> d = null;

    public static String b(Context context) {
        if (context == null) {
            LogUtil.d("EmergencyInfoUtils", "getEmergencyContactsString context is null");
            return "";
        }
        try {
            return HwEncryptUtil.b(context).c(2, e(context));
        } catch (ClassCastException | GeneralSecurityException unused) {
            LogUtil.c("EmergencyInfoUtils", "getEmergencyContactsString catch exception");
            return "";
        }
    }

    public static List<iod> e(String str, Context context, String str2) {
        return c(str, context, str2, true);
    }

    public static List<iod> c(String str, Context context, String str2, boolean z) {
        if (context == null || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str)) {
            ReleaseLogUtil.d("R_EmergencyInfoUtils", "deserializeAndFilter context is null or key is empty or emergencyContact is empty");
            return new ArrayList(0);
        }
        ReleaseLogUtil.c("R_EmergencyInfoUtils", "enter deserializeAndFilter isContactInfoJson:", Boolean.valueOf(z));
        String[] strArrSplit = str2.split(f31482c);
        ArrayList arrayList = new ArrayList(strArrSplit.length);
        e(context, strArrSplit, arrayList, z);
        if (PermissionUtil.b(context, new String[]{"android.permission.READ_CONTACTS"})) {
            ReleaseLogUtil.c("R_EmergencyInfoUtils", "deserializeAndFilter  filteredEmergencyContacts");
            if (arrayList.size() != strArrSplit.length) {
                String strA = a(arrayList, context);
                if (!TextUtils.isEmpty(strA)) {
                    lua.c(String.valueOf(1030), str, strA, null);
                    ReleaseLogUtil.c("R_EmergencyInfoUtils", "save emergency contact to sp");
                }
            }
        }
        return arrayList;
    }

    private static void e(Context context, String[] strArr, List<iod> list, boolean z) {
        iod iodVar;
        ReleaseLogUtil.c("R_EmergencyInfoUtils", "enter setEmergencyContact isContactInfoJson:", Boolean.valueOf(z));
        for (String str : strArr) {
            if (z) {
                try {
                    iodVar = (iod) new Gson().fromJson(str, iod.class);
                } catch (JsonSyntaxException unused) {
                    LogUtil.c("EmergencyInfoUtils", "deserializeAndFilter catch JsonSyntaxException");
                    iodVar = null;
                }
                if (iodVar == null) {
                    LogUtil.d("EmergencyInfoUtils", "fromJson info is null");
                } else if (!iodVar.c()) {
                    list.add(iodVar);
                } else if (PermissionUtil.b(context, new String[]{"android.permission.READ_CONTACTS"})) {
                    b(iodVar.a(), context, list);
                }
            } else if (PermissionUtil.b(context, new String[]{"android.permission.READ_CONTACTS"})) {
                b(str, context, list);
            }
        }
    }

    private static boolean b(String str, Context context, List<iod> list) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        ReleaseLogUtil.c("R_EmergencyInfoUtils", "enter addFilteredEmergencyContacts");
        Uri uri = Uri.parse(str);
        if (!EmergencyInfoManager.a().d(context, uri) || list.size() >= 3) {
            return false;
        }
        list.add(EmergencyInfoManager.a().b(uri));
        return true;
    }

    public static String a(List<iod> list, Context context) {
        if (list == null || context == null) {
            ReleaseLogUtil.d("EmergencyInfoUtils", "serialize emergencyContacts or context is null");
            return null;
        }
        StringBuilder sb = new StringBuilder(16);
        try {
            for (iod iodVar : list) {
                if (iodVar == null) {
                    ReleaseLogUtil.d("EmergencyInfoUtils", "serialize contactInfo is null");
                } else {
                    sb.append(new Gson().toJson(iodVar));
                    sb.append("|");
                }
            }
        } catch (JsonIOException unused) {
            ReleaseLogUtil.b("EmergencyInfoUtils", "serialize catch JsonIOException");
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        try {
            return HwEncryptUtil.b(context).e(2, sb.toString());
        } catch (GeneralSecurityException unused2) {
            ReleaseLogUtil.b("EmergencyInfoUtils", "serialize catch GeneralSecurityException");
            return "";
        }
    }

    public static boolean c(Context context) {
        if (context == null) {
            LogUtil.d("EmergencyInfoUtils", "hasAtLeastOneEmergencyContact context is null");
            return false;
        }
        return e("emergency_contacts", context, b(context)).isEmpty();
    }

    public static boolean a(Context context) {
        int i;
        int i2;
        if (context == null) {
            LogUtil.d("EmergencyInfoUtils", "isInStartUpGuide context is null");
            return false;
        }
        try {
            ContentResolver contentResolver = context.getContentResolver();
            if (contentResolver != null) {
                i2 = Settings.Secure.getInt(contentResolver, "user_setup_complete");
                i = Settings.Secure.getInt(contentResolver, "device_provisioned");
            } else {
                i = 0;
                i2 = 0;
            }
            return (i2 == 1 && i == 1) ? false : true;
        } catch (Settings.SettingNotFoundException unused) {
            LogUtil.c("EmergencyInfoUtils", "SettingNotFoundException");
        }
    }

    private static void d(Context context) {
        String[] stringArray = context.getResources().getStringArray(R.array.IDS_blood_type_entries);
        int i = 0;
        f31481b.put(stringArray[stringArray.length - 1], 0);
        while (i < stringArray.length - 1) {
            Map<String, Integer> map = f31481b;
            String str = stringArray[i];
            i++;
            map.put(str, Integer.valueOf(i));
        }
    }

    public static int e(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            LogUtil.d("EmergencyInfoUtils", "context is null 0r convertBloodTypeToIntValue value is empty ");
            return 0;
        }
        if (f31481b == null) {
            f31481b = new HashMap(16);
            d(context);
        }
        Integer num = f31481b.get(str);
        if (num == null) {
            LogUtil.d("EmergencyInfoUtils", "convertBloodTypeToIntValue value is empty ");
            return 0;
        }
        return num.intValue();
    }

    private static void i(Context context) {
        String[] stringArray = context.getResources().getStringArray(R.array.IDS_organ_donor_entries);
        int i = 0;
        d.put(stringArray[stringArray.length - 1], 0);
        while (i < stringArray.length - 1) {
            Map<String, Integer> map = d;
            String str = stringArray[i];
            i++;
            map.put(str, Integer.valueOf(i));
        }
    }

    public static int c(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            LogUtil.d("EmergencyInfoUtils", "context is null or convertOrganDonor value is empty ");
            return 0;
        }
        if (d == null) {
            d = new HashMap(16);
            i(context);
        }
        Integer num = d.get(str);
        if (num == null) {
            LogUtil.d("EmergencyInfoUtils", "convertOrganDonor morganDonorMap not contains:");
            return 0;
        }
        return num.intValue();
    }

    public static String a() {
        String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011);
        return accountInfo == null ? "" : accountInfo;
    }

    public static String e(Context context) {
        ReleaseLogUtil.c("R_EmergencyInfoUtils", "enter getEmergencyContactStringFromMMKV");
        if (lua.c(String.valueOf(1030), "emergency_contacts")) {
            String strH = lua.h(String.valueOf(1030), "emergency_contacts");
            ReleaseLogUtil.c("R_EmergencyInfoUtils", "getEmergencyContactString From MMKV emergencyContactString is isEmpty?", Boolean.valueOf(TextUtils.isEmpty(strH)));
            return strH;
        }
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        String string = defaultSharedPreferences.getString(a() + "emergency_contacts", "");
        ReleaseLogUtil.c("R_EmergencyInfoUtils", "getEmergencyContactString From sp value isEmpty?", Boolean.valueOf(TextUtils.isEmpty(string)));
        if (!TextUtils.isEmpty(string)) {
            lua.c(String.valueOf(1030), "emergency_contacts", string, null);
            ReleaseLogUtil.c("R_EmergencyInfoUtils", "getEmergencyContactStringFromMMKV save value to mmkv");
            defaultSharedPreferences.edit().remove(a() + "emergency_contacts").apply();
        }
        return string;
    }
}
