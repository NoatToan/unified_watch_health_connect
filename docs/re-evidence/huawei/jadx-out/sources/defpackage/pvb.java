package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.text.TextUtils;
import com.alipay.sdk.m.s.e;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.router.AppRouter;
import com.huawei.health.facardagds.FaCardAgdsApi;
import com.huawei.health.knit.ui.KnitFragment;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.ui.commonui.R;
import com.huawei.ui.commonui.utils.versioncontrol.VersionControlUtil;
import health.compact.a.AuthorizationUtils;
import health.compact.a.LocalBroadcast;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import health.compact.a.util.LogUtil;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes15.dex */
public class pvb {
    private static final Set<String> e = new HashSet<String>() { // from class: pvb.2
        private static final long serialVersionUID = -7011827657848604585L;

        {
            add("SC_EXERCISE");
            add("SC_DEVICE");
            add("SC_MALL");
            add("SC_KAKA");
            add("diet_photography");
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Set<String> f45893c = new HashSet<String>() { // from class: pvb.5
        private static final long serialVersionUID = -3061612464579099923L;

        {
            add("SC_EXERCISE");
            add("SC_DEVICE");
            add("SC_MALL");
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Set<String> f45892b = new HashSet<String>() { // from class: pvb.3
        private static final long serialVersionUID = 4788811629270512122L;

        {
            add("SC_EXERCISE");
            add("SC_DEVICE");
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<String, qoz> f45891a = new HashMap<String, qoz>() { // from class: pvb.4
        private static final long serialVersionUID = -3061612464579099923L;

        {
            put("SC_EXERCISE", new qoz("SC_EXERCISE", R.drawable.ic_btn_run, R.string.IDS_hw_shortcuts_start_exercise, 0, "com.huawei.health.ShortcutsActivity"));
            put("SC_DEVICE", new qoz("SC_DEVICE", R.drawable.ic_btn_device, R.string.IDS_hw_shortcuts_my_device, 0, "com.huawei.health.ShortcutsActivity"));
            put("SC_MALL", new qoz("SC_MALL", R.drawable.ic_btn_shop, R.string.IDS_hw_shortcuts_recommended_mall, 0, "com.huawei.health.ShortcutsActivity"));
            put("SC_KAKA", new qoz("SC_KAKA", R.drawable.ic_btn_kk, R.string.IDS_hw_shortcuts_my_points, 0, "com.huawei.health.ShortcutsActivity"));
            put("diet_photography", new qoz("diet_photography", R.drawable.ic_btn_scan_food, R.string.IDS_food_identification, 0, "com.huawei.health.ShortcutsActivity"));
        }
    };

    private static boolean b() {
        return true;
    }

    public static boolean a(Context context) {
        return AuthorizationUtils.c(context) && LoginInit.getInstance(context).getIsLogined();
    }

    public static String b(Intent intent) {
        if (intent == null) {
            LogUtil.d("ShortcutsUtil", "parseShortcutId intent null");
            return "";
        }
        String stringExtra = intent.getStringExtra("SHORTCUT");
        if (!TextUtils.isEmpty(stringExtra)) {
            return stringExtra;
        }
        if (intent.hasExtra(e.n)) {
            Map<String, String> mapB = peh.b(intent.getStringExtra(e.n));
            if (mapB.containsKey("shortcutId")) {
                String str = mapB.get("shortcutId");
                com.huawei.hwlogsmodel.LogUtil.d("ShortcutsUtil", "facard shortcutId :", str);
                return str;
            }
        }
        return "";
    }

    public static void c(Context context, String str) {
        LogUtil.d("ShortcutsUtil", "no logIn");
        try {
            Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
            if (launchIntentForPackage == null) {
                LogUtil.d("ShortcutsUtil", "launchIntentForPackage is null");
                return;
            }
            launchIntentForPackage.putExtra("SHORTCUT", str);
            if ((str.equals("SC_FA_CARD_EXERCISE") || str.equals("SC_FA_CARD_MAIN")) && BaseApplication.d("com.huawei.health.MainActivity") == -1) {
                launchIntentForPackage.addFlags(335577088);
            } else {
                launchIntentForPackage.addFlags(335544320);
            }
            context.startActivity(launchIntentForPackage);
        } catch (ActivityNotFoundException e2) {
            LogUtil.c("ShortcutsUtil", "jumpToLoginAndAuth:", e2.getMessage());
        }
    }

    public static void e(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            LogUtil.d("ShortcutsUtil", "jumpToStartSport param invalid.");
            return;
        }
        iov.d(context, new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse("huaweischeme://healthapp/router/track?sportType=" + ipd.c(str) + "&targetType=1&targetValue=2")));
    }

    public static void d(Context context) {
        if (context == null) {
            LogUtil.d("ShortcutsUtil", "jumpToSportDetail param invalid.");
        } else {
            iov.d(context, new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse("huaweischeme://healthapp/basicHealth?healthType=20&sportType=0")));
        }
    }

    public static void b(Context context) {
        if (context == null) {
            LogUtil.d("ShortcutsUtil", "jumpToStepDetail param invalid.");
        } else {
            AppRouter.c("/Main/FitnessStepDetailActivity").b(context);
        }
    }

    public static void c(Context context, String str, String str2, String str3) {
        Intent intent = new Intent();
        intent.setPackage(com.huawei.hwcommonmodel.application.BaseApplication.getAppPackage());
        intent.setAction("com.huawei.health.action.ACTION_FA_CLICK");
        intent.putExtra("scene_id", str);
        intent.putExtra("view_code", str2);
        intent.putExtra(KnitFragment.KEY_EXTRA, str3);
        context.sendBroadcast(intent, LocalBroadcast.f36595c);
    }

    public static void a(Context context, int i, String str) {
        if (b()) {
            if (context == null) {
                LogUtil.d("ShortcutsUtil", "context is null");
                SharedPreferenceManager.e(com.huawei.hwcommonmodel.application.BaseApplication.getContext(), String.valueOf(10000), "shortcuts", "0", new StorageParams());
                return;
            }
            if (i != 0) {
                SharedPreferenceManager.e(context, String.valueOf(10000), "shortcuts", "0", new StorageParams());
                return;
            }
            String strE = e(str);
            if (!TextUtils.isEmpty(strE)) {
                d(context, strE);
            } else {
                LogUtil.d("ShortcutsUtil", "resp is null ");
            }
        }
    }

    private static void d(Context context, String str) {
        qoz qozVar;
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        try {
            JSONArray jSONArray = new JSONArray(new JSONObject(str).getString("shortCutList"));
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                String string = jSONObject.getString("shortcutId");
                LogUtil.a("ShortcutsUtil", "shortcutid= ", string);
                if (!TextUtils.isEmpty(string) && !"SC_MALL".equals(string)) {
                    hashSet.add(string);
                    if (c(string) && !f45892b.contains(string) && (qozVar = f45891a.get(string)) != null) {
                        qozVar.a(jSONObject.getInt("rank"));
                        arrayList.add(qozVar);
                    }
                }
            }
            e(context, arrayList, hashSet);
            SharedPreferenceManager.e(context, String.valueOf(10000), "shortcuts", "1", null);
        } catch (JSONException e2) {
            SharedPreferenceManager.e(context, String.valueOf(10000), "shortcuts", "0", null);
            LogUtil.c("ShortcutsUtil", "JSONException ", e2.getMessage());
        }
    }

    private static void e(Context context, List<qoz> list, Set<String> set) {
        LogUtil.d("ShortcutsUtil", "setDynamicShortcuts");
        if (!b()) {
            LogUtil.d("ShortcutsUtil", "is not support");
            return;
        }
        ShortcutManager shortcutManager = (ShortcutManager) context.getSystemService(ShortcutManager.class);
        if (shortcutManager == null) {
            LogUtil.d("ShortcutsUtil", "setDynamicShortcuts shortcutManager = null");
            return;
        }
        boolean zIsSupportOperationAccount = VersionControlUtil.isSupportOperationAccount();
        a(context, shortcutManager, set);
        ArrayList arrayList = new ArrayList();
        for (qoz qozVar : list) {
            String strC = qozVar.c();
            if (zIsSupportOperationAccount || (!"SC_MALL".equals(strC) && !"SC_KAKA".equals(strC) && !"diet_photography".equals(strC))) {
                arrayList.add(b(context, qozVar));
            }
        }
        try {
            boolean dynamicShortcuts = shortcutManager.setDynamicShortcuts(arrayList);
            LogUtil.a("ShortcutsUtil", "setDynamicShortcuts is", Boolean.valueOf(dynamicShortcuts));
            if (dynamicShortcuts) {
                String strE = e(Locale.getDefault());
                if (TextUtils.isEmpty(strE)) {
                    return;
                }
                SharedPreferenceManager.e(context, String.valueOf(10000), "store_last_language", strE, null);
            }
        } catch (IllegalArgumentException | IllegalStateException e2) {
            LogUtil.c("ShortcutsUtil", "setDynamicShortcuts IllegalArgumentException or IllegalStateException", e2.getMessage());
        }
    }

    private static void a(Context context, ShortcutManager shortcutManager, Set<String> set) {
        if (!b()) {
            LogUtil.d("ShortcutsUtil", "is not support");
            return;
        }
        try {
            List<ShortcutInfo> pinnedShortcuts = shortcutManager.getPinnedShortcuts();
            ArrayList arrayList = new ArrayList(pinnedShortcuts.size());
            for (ShortcutInfo shortcutInfo : pinnedShortcuts) {
                LogUtil.a("ShortcutsUtil", "removeItem: ", shortcutInfo.getId());
                if (!set.contains(shortcutInfo.getId())) {
                    arrayList.add(shortcutInfo.getId());
                }
            }
            shortcutManager.disableShortcuts(arrayList, context.getResources().getString(R.string.IDS_hw_shortcuts_disable));
            shortcutManager.removeDynamicShortcuts(arrayList);
        } catch (IllegalArgumentException | IllegalStateException e2) {
            LogUtil.c("ShortcutsUtil", "IllegalArgumentException or IllegalStateException", e2.getMessage());
        }
    }

    private static ShortcutInfo b(Context context, qoz qozVar) {
        Intent intent = new Intent();
        intent.setAction(CommonConstant.ACTION.HWID_SCHEME_URL);
        intent.setPackage(com.huawei.hwcommonmodel.application.BaseApplication.getAppPackage());
        intent.setClassName(com.huawei.hwcommonmodel.application.BaseApplication.getAppPackage(), qozVar.d());
        intent.setFlags(268468224);
        intent.setData(Uri.parse(qozVar.c()));
        String string = context.getApplicationContext().getString(qozVar.b());
        LogUtil.a("ShortcutsUtil", "getResources shortcuts name", string);
        return new ShortcutInfo.Builder(context, qozVar.c()).setShortLabel(string).setLongLabel(string).setDisabledMessage(context.getResources().getString(R.string.IDS_hw_shortcuts_disable)).setIcon(Icon.createWithResource(context, qozVar.e())).setRank(qozVar.a()).setIntent(intent).build();
    }

    private static boolean c(String str) {
        if (LoginInit.getInstance(com.huawei.hwcommonmodel.application.BaseApplication.getContext()).isBrowseMode()) {
            return f45893c.contains(str);
        }
        return e.contains(str);
    }

    private static String e(String str) {
        LogUtil.a("ShortcutsUtil", "enter getStringFile");
        if (TextUtils.isEmpty(str)) {
            LogUtil.a("ShortcutsUtil", "filePath is empty");
            return "";
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(str);
            try {
                byte[] bArr = new byte[fileInputStream.available()];
                String str2 = fileInputStream.read(bArr) > 0 ? new String(bArr, "UTF-8") : "";
                fileInputStream.close();
                return str2;
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException unused) {
            LogUtil.c("ShortcutsUtil", "getStringFile IOException");
            return "";
        }
    }

    public static void b(Context context, String str) {
        HashMap map = new HashMap();
        map.put("click", 1);
        map.put("type", str);
        lmf.d().c(context, AnalyticsValue.HEALTH_SHORTCUTS_CLICK_2190003.value(), map, 0);
    }

    public static void b(Context context, String str, int i) {
        HashMap map = new HashMap();
        map.put("click_enter_health_app", 1);
        map.put("card_id", 1);
        if (i > -1) {
            map.put("card_type", Integer.valueOf(i));
        }
        lmf.d().c(context, AnalyticsValue.FA_ENTER_APP.value(), map, 0);
        if (str.equals("SC_FA_CARD_EXERCISE")) {
            HashMap map2 = new HashMap();
            map2.put("click_start_sports", 1);
            lmf.d().c(context, AnalyticsValue.FA_START_SPORT.value(), map2, 0);
        }
        d();
    }

    private static void d() {
        LogUtil.a("ShortcutsUtil", "doBiFromFaStartApp");
        HashMap map = new HashMap(16);
        map.put("from", 1);
        map.put("click", 1);
        map.put("FAPackageName", FaCardAgdsApi.STEP_FA_CARD_PACKAGE_NAME);
        lmf.d().c(com.huawei.hwcommonmodel.application.BaseApplication.getContext(), AnalyticsValue.HEALTH_LOGIN_APP_WHITE_2050007.value(), map, 0);
    }

    public static void c(Context context) {
        if (!b()) {
            LogUtil.d("ShortcutsUtil", "is not support");
            return;
        }
        if (context == null) {
            LogUtil.d("ShortcutsUtil", "context is null");
            return;
        }
        ShortcutManager shortcutManager = (ShortcutManager) context.getSystemService(ShortcutManager.class);
        if (shortcutManager == null) {
            LogUtil.d("ShortcutsUtil", "get ShortcutManager failed");
            return;
        }
        try {
            List<ShortcutInfo> pinnedShortcuts = shortcutManager.getPinnedShortcuts();
            ArrayList arrayList = new ArrayList(pinnedShortcuts.size());
            for (ShortcutInfo shortcutInfo : pinnedShortcuts) {
                if (!"watchface_supermarket".equals(shortcutInfo.getId())) {
                    arrayList.add(shortcutInfo.getId());
                }
            }
            shortcutManager.disableShortcuts(arrayList, context.getResources().getString(R.string.IDS_hw_shortcuts_disable));
            shortcutManager.removeAllDynamicShortcuts();
        } catch (IllegalArgumentException | IllegalStateException e2) {
            LogUtil.c("ShortcutsUtil", "IllegalArgumentException or IllegalStateException", e2.getMessage());
        }
        SharedPreferenceManager.e(context, String.valueOf(10000), "shortcuts", "0", null);
        fdy.c(0L, "com.huawei.health_common_config_coldStart");
    }

    private static String e(Locale locale) {
        if (locale == null) {
            LogUtil.d("ShortcutsUtil", "locale is null");
            return "";
        }
        return locale.toString();
    }

    private static boolean f(Context context) {
        if (context == null) {
            LogUtil.d("ShortcutsUtil", "context is null");
            return false;
        }
        return !e(Locale.getDefault()).equals(SharedPreferenceManager.e(context, String.valueOf(10000), "store_last_language"));
    }

    public static void e(Context context) {
        if (!b()) {
            LogUtil.d("ShortcutsUtil", "is not support");
            return;
        }
        if (context == null) {
            LogUtil.d("ShortcutsUtil", "context is null");
        } else if (f(context)) {
            LogUtil.d("ShortcutsUtil", "change language or coldStart with completely new version first");
            if ("1".equals(SharedPreferenceManager.e(context, String.valueOf(10000), "shortcuts"))) {
                a(context, 0, fdy.d("com.huawei.health_common_config", "shortcuts", "json"));
            }
        }
    }
}
