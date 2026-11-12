package defpackage;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.database.SQLException;
import android.media.AudioManager;
import android.media.session.MediaController;
import android.media.session.MediaSessionManager;
import android.net.Uri;
import android.provider.ContactsContract;
import android.text.TextUtils;
import android.view.KeyEvent;
import com.alipay.sdk.m.s.e;
import com.hihonor.assistant.cardmgrsdk.CardMgrSdkConst;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.phoneprocess.mgr.hwvoicekitmgr.HwControlLocalAppHelper;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.profile.coordinator.ProfileRequestConstants;
import health.compact.a.WhiteBoxManager;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class nab {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f42805c = -1;
    private static int e = -1;

    public static String c(Context context) {
        Object systemService = context.getSystemService("media_session");
        List<MediaController> activeSessions = null;
        MediaSessionManager mediaSessionManager = systemService instanceof MediaSessionManager ? (MediaSessionManager) systemService : null;
        if (mediaSessionManager == null) {
            LogUtil.a("HwVoiceKitManager_VoiceKitUtils", "mediaSessionManager is null");
            return "";
        }
        StringBuilder sb = new StringBuilder(16);
        try {
            activeSessions = mediaSessionManager.getActiveSessions(new ComponentName(context.getPackageName(), "com.huawei.bone.ui.setting.NotificationPushListener"));
        } catch (SecurityException unused) {
            LogUtil.e("HwVoiceKitManager_VoiceKitUtils", "getMediaPackage SecurityException");
        }
        if (activeSessions == null || activeSessions.isEmpty()) {
            return sb.toString();
        }
        for (int i = 0; i < activeSessions.size(); i++) {
            sb.append(activeSessions.get(i).getPackageName());
            if (i != activeSessions.size() - 1) {
                sb.append(Constants.LINK);
            }
        }
        return sb.toString();
    }

    public static String a(String str) {
        StringBuilder sb = new StringBuilder(16);
        WhiteBoxManager whiteBoxManagerB = WhiteBoxManager.b();
        for (String str2 : str.split(Constants.LINK)) {
            sb.append(whiteBoxManagerB.a(1, lsk.a(str2, 10)));
        }
        return sb.toString();
    }

    public static String b(JSONArray jSONArray) {
        String strOptString = "";
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
            if (jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.optJSONObject("header") != null && jSONObjectOptJSONObject.optJSONObject(Constants.CA_PAYLOAD) != null && "NLPRecognizer".equals(jSONObjectOptJSONObject.optJSONObject("header").optString("name"))) {
                strOptString = jSONObjectOptJSONObject.optJSONObject(Constants.CA_PAYLOAD).optString("domainId");
            }
        }
        return strOptString;
    }

    public static void d(JSONObject jSONObject, mzw mzwVar) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("backUpAppPackageList");
        if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() == 0) {
            return;
        }
        ArrayList arrayList = new ArrayList(16);
        StringBuilder sb = new StringBuilder(10);
        sb.append("packageList:");
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            String strOptString = jSONArrayOptJSONArray.optString(i);
            arrayList.add(strOptString);
            sb.append(" ");
            sb.append(strOptString);
        }
        LogUtil.a("HwVoiceKitManager_VoiceKitUtils", sb.toString());
        mzwVar.d(arrayList);
    }

    public static void d(Context context, mzw mzwVar) {
        String strA;
        String strD = mzwVar.d();
        String strB = mzwVar.b();
        if (TextUtils.isEmpty(strD)) {
            LogUtil.e("HwVoiceKitManager_VoiceKitUtils", "empty url.");
            return;
        }
        if (TextUtils.isEmpty(mzwVar.a())) {
            strA = CommonConstant.ACTION.HWID_SCHEME_URL;
        } else {
            strA = mzwVar.a();
        }
        try {
            Intent intent = new Intent(strA, Uri.parse(strD));
            if (!TextUtils.isEmpty(strB)) {
                intent.setPackage(strB);
            }
            intent.addCategory("android.intent.category.DEFAULT").addFlags(268435456);
            if (intent.resolveActivity(BaseApplication.getContext().getPackageManager()) == null) {
                e(intent, mzwVar);
            }
            BaseApplication.getContext().startActivity(intent);
            e(context, strB);
        } catch (ActivityNotFoundException | SecurityException unused) {
            LogUtil.e("HwVoiceKitManager_VoiceKitUtils", "cannot found activity to handle url: ", strD);
        }
    }

    public static void e(final Context context, final String str) {
        String strC = c(context);
        if (!TextUtils.isEmpty(strC) && !strC.contains(str)) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: nab.1
                @Override // java.lang.Runnable
                public void run() {
                    int i = 0;
                    while (i <= 20) {
                        try {
                            Thread.sleep(200L);
                        } catch (InterruptedException unused) {
                            LogUtil.e("HwVoiceKitManager_VoiceKitUtils", "sendOpenMusicCommand InterruptedException");
                        }
                        i++;
                        if (nab.c(context).contains(str) || nab.c(context).contains("com.android.mediacenter")) {
                            nae.e(1);
                            return;
                        }
                    }
                    if (i > 20) {
                        nae.d(255);
                    }
                }
            });
        } else {
            nae.e(1);
        }
    }

    private static void e(Intent intent, mzw mzwVar) {
        if (intent == null || mzwVar == null) {
            return;
        }
        List<String> listE = mzwVar.e();
        if (listE == null || listE.size() == 0) {
            LogUtil.j("HwVoiceKitManager_VoiceKitUtils", "backUpAppPackageList is invalid");
            return;
        }
        for (String str : listE) {
            intent.setPackage(str);
            if (intent.resolveActivity(BaseApplication.getContext().getPackageManager()) != null) {
                LogUtil.a("HwVoiceKitManager_VoiceKitUtils", "backUpAppPackage is available: ", str);
                return;
            }
        }
    }

    private static String e(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            int length = str.getBytes("UTF-8").length;
            if (length > i) {
                return str.substring(0, (int) (((double) str.length()) * (((double) i) / ((double) length))));
            }
        } catch (UnsupportedEncodingException unused) {
            LogUtil.e("HwVoiceKitManager_VoiceKitUtils", "cutText find UnsupportedEncodingException");
        }
        return str;
    }

    public static String c(String str) {
        return e(str, 1024);
    }

    public static String e(String str) {
        return e(str, 1024);
    }

    public static boolean e(JSONArray jSONArray, String str, HwControlLocalAppHelper hwControlLocalAppHelper) {
        JSONArray jSONArrayOptJSONArray;
        boolean zD = false;
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
            if (jSONObjectOptJSONObject != null && (jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("value")) != null && jSONArrayOptJSONArray.length() != 0 && jSONArrayOptJSONArray.optJSONObject(0) != null) {
                String strOptString = jSONArrayOptJSONArray.optJSONObject(0).optString("normalValue");
                if (e("1012100200260000-1012100200270000-1012100200280000-1012100200290000".split(Constants.LINK), str)) {
                    zD = d("{\"running\":\"1\",\"cycling\":\"3\",\"walking\":\"2\"}", strOptString, hwControlLocalAppHelper);
                }
                if (e("2001100300010000-2001100300020000".split(Constants.LINK), str)) {
                    zD = d("{\"闹钟\":\"2\",\"支付宝|Alipay\":\"1\"}", strOptString, hwControlLocalAppHelper);
                }
                if (zD) {
                    return zD;
                }
            }
        }
        return zD;
    }

    public static boolean e(String[] strArr, String str) {
        for (String str2 : strArr) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    private static boolean d(String str, String str2, HwControlLocalAppHelper hwControlLocalAppHelper) {
        try {
            Iterator<String> itKeys = new JSONObject(str).keys();
            while (itKeys.hasNext()) {
                if (hwControlLocalAppHelper.b(str2, itKeys.next())) {
                    return true;
                }
            }
            return false;
        } catch (JSONException unused) {
            LogUtil.e("HwVoiceKitManager_VoiceKitUtils", "isContainKey JSONException");
            return false;
        }
    }

    public static void c(JSONObject jSONObject, String str, String str2) {
        String strOptString;
        LogUtil.a("HwVoiceKitManager_VoiceKitUtils", "processOnResult processEncyclopedia displayAsr:", str, ", displayText:", str2);
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("cardParams");
        if (jSONObjectOptJSONObject == null) {
            LogUtil.j("HwVoiceKitManager_VoiceKitUtils", "processEncyclopedia cardParams is null");
            nae.c(c(str), e(str2));
            return;
        }
        JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("items");
        JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject.optJSONArray("dataSource");
        if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0 && jSONArrayOptJSONArray2 != null) {
            strOptString = jSONArrayOptJSONArray.optJSONObject(0).optString("brief");
            LogUtil.a("HwVoiceKitManager_VoiceKitUtils", "processOnResult brief : ", strOptString);
        } else {
            strOptString = "";
        }
        JSONArray jSONArrayOptJSONArray3 = jSONObjectOptJSONObject.optJSONArray("voicePlay");
        if (jSONArrayOptJSONArray3 != null && jSONArrayOptJSONArray3.length() > 0) {
            strOptString = jSONArrayOptJSONArray3.optJSONObject(0).optString("text");
            LogUtil.a("HwVoiceKitManager_VoiceKitUtils", "processOnResult translatorText : ", strOptString);
        }
        if (!TextUtils.isEmpty(str2) && !strOptString.equals(str2)) {
            strOptString = str2 + System.lineSeparator() + strOptString;
        }
        String strC = c(str);
        if (!TextUtils.isEmpty(strOptString)) {
            str2 = strOptString;
        }
        nae.c(strC, e(str2));
    }

    public static void b(String str) {
        if (TextUtils.isEmpty(str)) {
            ReleaseLogUtil.e("R_HwVoiceKitManager_VoiceKitUtils", "processPartialResult voiceResponse isEmpty");
            return;
        }
        try {
            JSONArray jSONArrayOptJSONArray = new JSONObject(str).optJSONArray("directives");
            if (jSONArrayOptJSONArray != null) {
                String strOptString = null;
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    JSONObject jSONObject = jSONArrayOptJSONArray.getJSONObject(i);
                    if ("DisplayASR".equals(jSONObject.getJSONObject("header").optString("name"))) {
                        strOptString = jSONObject.getJSONObject(Constants.CA_PAYLOAD).optString("text");
                        LogUtil.a("HwVoiceKitManager_VoiceKitUtils", "processPartialResult DisplayASR: ", strOptString);
                    }
                }
                nae.b(strOptString, -1);
            }
        } catch (JSONException unused) {
            LogUtil.e("HwVoiceKitManager_VoiceKitUtils", "processPartialResult JSONException");
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x006a A[Catch: SQLException -> 0x0079, all -> 0x0095, TRY_LEAVE, TryCatch #0 {all -> 0x0095, blocks: (B:5:0x0020, B:7:0x0026, B:9:0x002c, B:12:0x0045, B:13:0x0049, B:15:0x0059, B:16:0x005d, B:17:0x006a, B:23:0x0079), top: B:36:0x0010 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x0084 A[PHI: r3
      0x0084: PHI (r3v3 android.database.Cursor) = (r3v2 android.database.Cursor), (r3v4 android.database.Cursor) binds: [B:24:0x0082, B:18:0x0073] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:33:0x0099  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r9v2 */
    public static mzy.a d(Context context, String str, int i) throws Throwable {
        Cursor cursorQuery;
        ArrayList arrayList = new ArrayList(16);
        ContentResolver contentResolver = context.getContentResolver();
        ?? r9 = 0;
        try {
            try {
                cursorQuery = contentResolver.query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, null, "contact_id = ?", new String[]{str}, null);
                if (cursorQuery == null) {
                    LogUtil.j("HwVoiceKitManager_VoiceKitUtils", "getPhoneNumByContactId cursor is null");
                } else {
                    try {
                        if (cursorQuery.getCount() <= 0) {
                            LogUtil.j("HwVoiceKitManager_VoiceKitUtils", "getPhoneNumByContactId cursor is null");
                        } else {
                            while (cursorQuery.moveToNext()) {
                                mzy.a aVar = new mzy.a();
                                String string = cursorQuery.getString(cursorQuery.getColumnIndex("data1"));
                                if (!TextUtils.isEmpty(string)) {
                                    string = string.replaceAll(" ", "");
                                }
                                String string2 = cursorQuery.getString(cursorQuery.getColumnIndex("display_name"));
                                if (!TextUtils.isEmpty(string2)) {
                                    string2 = string2.replaceAll(" ", "");
                                }
                                aVar.a(string);
                                aVar.c(string2);
                                aVar.b(str);
                                arrayList.add(aVar);
                            }
                        }
                    } catch (SQLException unused) {
                        LogUtil.e("HwVoiceKitManager_VoiceKitUtils", "getPhoneNumByContactId Exception");
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                    }
                }
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
            } catch (Throwable th) {
                th = th;
                r9 = contentResolver;
                if (r9 != 0) {
                    r9.close();
                }
                throw th;
            }
        } catch (SQLException unused2) {
            cursorQuery = null;
        } catch (Throwable th2) {
            th = th2;
            if (r9 != 0) {
                r9.close();
            }
            throw th;
        }
        if (arrayList.size() > i) {
            return (mzy.a) arrayList.get(i);
        }
        return null;
    }

    public static String b(JSONObject jSONObject) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("backUpAppPackageList");
        if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() == 0) {
            return "";
        }
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            String strOptString = jSONArrayOptJSONArray.optString(i);
            if (d(strOptString)) {
                LogUtil.a("HwVoiceKitManager_VoiceKitUtils", "backupPackage:", strOptString);
                return strOptString;
            }
        }
        return "";
    }

    public static boolean d(String str) {
        try {
            BaseApplication.getContext().getPackageManager().getPackageInfo(str, 1);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public static void b(Context context, String str) {
        LogUtil.a("HwVoiceKitManager_VoiceKitUtils", "startHwMusicPlay");
        if (TextUtils.isEmpty(str) || context == null) {
            LogUtil.j("HwVoiceKitManager_VoiceKitUtils", "startHwMusicPlay param isEmpty");
            return;
        }
        KeyEvent keyEvent = new KeyEvent(0, 126);
        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
        intent.setPackage(str);
        intent.putExtra("android.intent.extra.KEY_EVENT", keyEvent);
        context.sendBroadcast(intent);
        KeyEvent keyEvent2 = new KeyEvent(1, 126);
        Intent intent2 = new Intent("android.intent.action.MEDIA_BUTTON");
        intent2.setPackage(str);
        intent2.putExtra("android.intent.extra.KEY_EVENT", keyEvent2);
        context.sendBroadcast(intent2);
    }

    public static boolean d(JSONArray jSONArray, int i, HwControlLocalAppHelper hwControlLocalAppHelper) {
        boolean zE = false;
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i2);
            if (jSONObjectOptJSONObject != null) {
                JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("header");
                JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject.optJSONObject(Constants.CA_PAYLOAD);
                if (jSONObjectOptJSONObject2 != null && jSONObjectOptJSONObject3 != null && "NLPRecognizer".equals(jSONObjectOptJSONObject2.optString("name"))) {
                    String strOptString = jSONObjectOptJSONObject3.optString("domainId");
                    String strOptString2 = jSONObjectOptJSONObject3.optString("subDomainId");
                    String strOptString3 = jSONObjectOptJSONObject3.optString("intentId");
                    nae.c(strOptString, strOptString2, strOptString3);
                    if (i < 1 && !"10171012".equals(strOptString2) && !"10021001".equals(strOptString2)) {
                        if (TextUtils.isEmpty(strOptString3)) {
                            continue;
                        } else if (!e("1001101300010000-1001101300020000-1001101300090000-1001101300100000-1001101300110000-1001101300120000-1001101300140000-1001101300150000-1002100800010000-1002100800020000-1002100800030000-1002100800040000-1002100800050000".split(Constants.LINK), strOptString3)) {
                            JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject3.optJSONArray("slots");
                            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() != 0) {
                                zE = e(jSONArrayOptJSONArray, strOptString3, hwControlLocalAppHelper);
                            }
                        }
                    }
                    zE = true;
                    break;
                }
            }
        }
        LogUtil.a("HwVoiceKitManager_VoiceKitUtils", "isSupportCommand:", Boolean.valueOf(zE));
        return zE;
    }

    public static String d(Context context, String str) {
        JSONObject jSONObject = new JSONObject();
        if (context == null) {
            return jSONObject.toString();
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("name", "SupportedLanguages");
            jSONObject3.put(e.j, CardMgrSdkConst.MSGScene.SYSTEM);
            jSONObject2.put("header", jSONObject3);
            JSONObject jSONObject4 = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            for (String str2 : "en_GB-es_ES-fr_FR-de_DE-it_IT-ms_MY-pl_PL-ar_SA".split(Constants.LINK)) {
                jSONArray.put(str2.split("_")[0]);
            }
            jSONObject4.put("languageList", jSONArray);
            jSONObject2.put(Constants.CA_PAYLOAD, jSONObject4);
            String strB = b(context);
            LogUtil.a("HwVoiceKitManager_VoiceKitUtils", "get media package:", strB);
            String strC = c(context, strB);
            JSONArray jSONArray2 = new JSONArray();
            jSONArray2.put(new JSONObject(strC));
            if (!str.equals(ProfileRequestConstants.X_LANGUAGE_VALUE)) {
                jSONArray2.put(jSONObject2);
            }
            jSONObject.put("contexts", jSONArray2);
        } catch (JSONException unused) {
            LogUtil.e("HwVoiceKitManager_VoiceKitUtils", "buildVoiceContext JSONException");
        }
        LogUtil.a("HwVoiceKitManager_VoiceKitUtils", "buildVoiceContext contextObject:", jSONObject.toString());
        return jSONObject.toString();
    }

    public static String b(Context context) {
        if (context == null) {
            return "";
        }
        Object systemService = context.getSystemService("media_session");
        List<MediaController> activeSessions = null;
        MediaSessionManager mediaSessionManager = systemService instanceof MediaSessionManager ? (MediaSessionManager) systemService : null;
        if (mediaSessionManager == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder(16);
        try {
            activeSessions = mediaSessionManager.getActiveSessions(new ComponentName(context.getPackageName(), "com.huawei.bone.ui.setting.NotificationPushListener"));
        } catch (SecurityException unused) {
            LogUtil.e("HwVoiceKitManager_VoiceKitUtils", "getMediaPackage SecurityException");
        }
        if (activeSessions != null && activeSessions.size() > 0) {
            for (int i = 0; i < activeSessions.size(); i++) {
                sb.append(activeSessions.get(i).getPackageName());
                if (i != activeSessions.size() - 1) {
                    sb.append(Constants.LINK);
                }
            }
        }
        return sb.toString();
    }

    public static String c(Context context, String str) {
        String str2 = "{\"header\":{\"namespace\":\"System\",\"name\":\"ClientContext\"},\"payload\":{\"screenLockerStatus\":false}}";
        if (TextUtils.isEmpty(str)) {
            return "{\"header\":{\"namespace\":\"System\",\"name\":\"ClientContext\"},\"payload\":{\"screenLockerStatus\":false}}";
        }
        PackageManager packageManager = context.getPackageManager();
        String str3 = str.split(Constants.LINK)[0];
        try {
            str2 = String.format(Locale.ENGLISH, "{\"header\":{\"namespace\":\"System\",\"name\":\"ClientContext\"},\"payload\":{\"screenLockerStatus\":false,\"playerApp\":{\"name\":\"%s\",\"packageName\":\"%s\",\"version\":\"%s\"}}}", packageManager.getApplicationLabel(packageManager.getApplicationInfo(str3, 128)).toString(), str3, packageManager.getPackageInfo(str3, 0).versionName);
        } catch (PackageManager.NameNotFoundException unused) {
            LogUtil.e("HwVoiceKitManager_VoiceKitUtils", "updateClientContext NameNotFoundException");
        }
        LogUtil.a("HwVoiceKitManager_VoiceKitUtils", "clientContext:", str2);
        return str2;
    }

    public static void d() {
        ReleaseLogUtil.d("R_HwVoiceKitManager_VoiceKitUtils", "enter saveDownloadPluginFlag");
        nae.d(8);
        mge.c("voiceAssistant");
        ohf.e().c("PluginHiAiEngine");
    }

    public static int a() {
        return e;
    }

    public static void a(int i) {
        e = i;
    }

    public static int b() {
        return f42805c;
    }

    public static void d(int i) {
        f42805c = i;
    }

    public static int e() {
        if (e == -1) {
            return -1;
        }
        Object systemService = BaseApplication.getContext().getSystemService("audio");
        int streamVolume = systemService instanceof AudioManager ? ((AudioManager) systemService).getStreamVolume(9) : -1;
        LogUtil.a("HwVoiceKitManager_VoiceKitUtils", "getPhoneAiVolume: ", Integer.valueOf(streamVolume));
        return streamVolume;
    }

    public static void e(int i) {
        LogUtil.a("HwVoiceKitManager_VoiceKitUtils", "changePhoneAiVolume: ", Integer.valueOf(i));
        if (i < 1 || i > 15) {
            return;
        }
        Object systemService = BaseApplication.getContext().getSystemService("audio");
        if (systemService instanceof AudioManager) {
            ((AudioManager) systemService).setStreamVolume(9, i, 0);
        }
    }
}
