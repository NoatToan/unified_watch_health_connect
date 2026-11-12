package com.huawei.hianalytics;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.media3.datasource.cache.CacheDataSink;
import com.huawei.hianalytics.core.common.EnvUtils;
import com.huawei.hianalytics.core.log.HiLog;
import com.huawei.hianalytics.core.storage.CommonHeaderEx;
import com.huawei.hianalytics.core.storage.DaoManager;
import com.huawei.hianalytics.core.storage.Event;
import com.huawei.hianalytics.core.transport.Utils;
import com.huawei.hianalytics.framework.datahandler.ReportTask;
import com.huawei.hianalytics.framework.threadpool.TaskThread;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.constant.WatchFaceConstant;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.secure.android.common.encrypt.aes.AesCbc;
import com.huawei.secure.android.common.encrypt.aes.AesGcm;
import com.huawei.secure.android.common.encrypt.utils.EncryptUtil;
import java.io.File;
import java.util.ArrayList;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class f1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f11494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f11495b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f11496c = new ArrayList();
    public final String d;

    public f1(Context context, String str) {
        this.f11494a = context;
        this.d = str;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00b3 A[EXC_TOP_SPLITTER, PHI: r4
      0x00b3: PHI (r4v1 java.lang.String) = (r4v0 java.lang.String), (r4v5 java.lang.String) binds: [B:24:0x0092, B:32:0x00b0] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    public final void a(String str) {
        Context context = this.f11494a;
        String str2 = c2.b(context, str) + WatchFaceConstant.XML_SUFFIX;
        long length = new File(context.getFilesDir(), "../shared_prefs/" + str2).length();
        if (length == -1) {
            return;
        }
        if (length > CacheDataSink.DEFAULT_FRAGMENT_SIZE) {
            HiLog.i("InitDataSupport", "sp stat file length > 5M, begin delete it");
            if (c2.a(this.f11494a, str)) {
                HiLog.i("InitDataSupport", "sp stat file delete success");
                return;
            }
            return;
        }
        SharedPreferences sharedPreferencesA = c2.a(str);
        Map<String, ?> all = sharedPreferencesA == null ? null : sharedPreferencesA.getAll();
        c2.a(this.f11494a, str);
        if (all == null || all.isEmpty()) {
            return;
        }
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            String key = entry.getKey();
            String str3 = "_default_config_tag";
            if ("_default_config_tag".equals(key)) {
                try {
                    a(str3, entry.getValue(), str);
                } catch (JSONException unused) {
                    HiLog.e("InitDataSupport", "cache data is not json format");
                }
            } else {
                String[] strArrSplit = key.split(Constants.LINK);
                if (strArrSplit.length == 2) {
                    str3 = strArrSplit[0];
                    String str4 = strArrSplit[1];
                    if (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4)) {
                        a(str3, entry.getValue(), str);
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:56:0x0176  */
    /* JADX WARN: Code duplicated, block: B:58:0x018a  */
    /* JADX WARN: Code duplicated, block: B:60:0x0190  */
    /* JADX WARN: Code duplicated, block: B:62:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:64:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:73:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:56:0x0176, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:60:0x0190, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:64:0x01c3, please report this as an issue */
    @Override // java.lang.Runnable
    public final void run() {
        String str;
        String str2;
        if (!TextUtils.isEmpty("v2_1DataHandlerFlag") && !TextUtils.isEmpty("global_v2")) {
            SharedPreferences sharedPreferencesA = c2.a("global_v2");
            if (sharedPreferencesA != null && sharedPreferencesA.getBoolean("v2_1DataHandlerFlag", false)) {
                HiLog.i("InitDataSupport", "cached data by HASDKV2 has already handled. tag: " + this.d);
            }
            str = k.b().a().j;
            str2 = k.b().a().i;
            if (TextUtils.isEmpty(str)) {
                HiLog.i("InitDataSupport", "app ver is first save. tag: " + this.d);
            } else {
                if (str.equals(str2)) {
                }
                HiLog.i("InitDataSupport", "the appVers are different. tag: " + this.d);
                if (t.b(EnvUtils.getAppContext())) {
                    TaskThread.getReportThread().addToQueue(new ReportTask("", "", str, 500, 0));
                    return;
                }
                HiLog.sw("InitDataSupport", "the network is unavailable. tag: " + this.d);
            }
        }
        HiLog.e("SharedPreUtils", "spName or spKey is empty");
        a("stat_v2_1");
        a("cached_v2_1");
        Context context = this.f11494a;
        String str3 = c2.b(context, "common_nc") + WatchFaceConstant.XML_SUFFIX;
        long length = new File(context.getFilesDir(), "../shared_prefs/" + str3).length();
        if (length != -1) {
            if (length > CacheDataSink.DEFAULT_FRAGMENT_SIZE) {
                HiLog.i("InitDataSupport", "sp stat file length > 5M, begin delete it");
                if (c2.a(this.f11494a, "common_nc")) {
                    HiLog.i("InitDataSupport", "sp stat file delete success");
                }
            } else {
                SharedPreferences sharedPreferencesA2 = c2.a("common_nc");
                Map<String, ?> all = sharedPreferencesA2 == null ? null : sharedPreferencesA2.getAll();
                c2.a(this.f11494a, "common_nc");
                if (all != null && !all.isEmpty()) {
                    for (Map.Entry<String, ?> entry : all.entrySet()) {
                        String key = entry.getKey();
                        if (!TextUtils.isEmpty(key) && !TextUtils.isEmpty((String) entry.getValue())) {
                            CommonHeaderEx commonHeaderEx = new CommonHeaderEx();
                            commonHeaderEx.setEvtExHashCode(key);
                            commonHeaderEx.setCommonHeaderEx((String) entry.getValue());
                            this.f11496c.add(commonHeaderEx);
                        }
                    }
                }
            }
        }
        c2.a(this.f11494a, "backup_event");
        if (!this.f11495b.isEmpty()) {
            i iVarA = i.a(this.f11494a);
            ArrayList arrayList = this.f11495b;
            iVarA.getClass();
            DaoManager.getInstance().insertEvents(arrayList);
        }
        if (!this.f11496c.isEmpty()) {
            i iVarA2 = i.a(this.f11494a);
            ArrayList arrayList2 = this.f11496c;
            iVarA2.getClass();
            DaoManager.getInstance().insertHeaders(arrayList2);
        }
        if (TextUtils.isEmpty("v2_1DataHandlerFlag") || TextUtils.isEmpty("global_v2")) {
            HiLog.e("SharedPreUtils", "spName or spKey is empty");
        } else {
            SharedPreferences sharedPreferencesA3 = c2.a("global_v2");
            if (sharedPreferencesA3 != null) {
                SharedPreferences.Editor editorEdit = sharedPreferencesA3.edit();
                editorEdit.putBoolean("v2_1DataHandlerFlag", true);
                editorEdit.commit();
            }
        }
        str = k.b().a().j;
        str2 = k.b().a().i;
        if (TextUtils.isEmpty(str)) {
            HiLog.i("InitDataSupport", "app ver is first save. tag: " + this.d);
        } else if (str.equals(str2)) {
            HiLog.i("InitDataSupport", "the appVers are different. tag: " + this.d);
            if (t.b(EnvUtils.getAppContext())) {
                TaskThread.getReportThread().addToQueue(new ReportTask("", "", str, 500, 0));
                return;
            }
            HiLog.sw("InitDataSupport", "the network is unavailable. tag: " + this.d);
        }
    }

    public final void a(String str, Object obj, String str2) throws JSONException {
        String strOptString;
        String str3;
        if (obj instanceof String) {
            JSONArray jSONArray = new JSONArray((String) obj);
            int length = jSONArray.length();
            if (length > 5000) {
                HiLog.w("InitDataSupport", "array size is too long");
                return;
            }
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                if (System.currentTimeMillis() - Utils.parseStringToLong(jSONObject.getString(Event.EventConstants.RECORD_TIME)) <= 604800000) {
                    if ("stat_v2_1".equals(str2)) {
                        strOptString = jSONObject.optString("content");
                    } else {
                        strOptString = jSONObject.optString(Event.EventConstants.PROPERTIES);
                    }
                    String strDecrypt = AesCbc.decrypt(strOptString, a2.a().b());
                    if (TextUtils.isEmpty(strDecrypt)) {
                        HiLog.i("InitDataSupport", "decryptCbc content is empty");
                        str3 = "";
                    } else {
                        String strGenerateSecureRandomStr = EncryptUtil.generateSecureRandomStr(12);
                        str3 = strGenerateSecureRandomStr + AesGcm.encrypt(strDecrypt, a2.a().b(), strGenerateSecureRandomStr);
                    }
                    if (TextUtils.isEmpty(str3)) {
                        HiLog.i("InitDataSupport", "content is empty");
                    } else {
                        Event event = new Event();
                        event.formJson(jSONObject);
                        event.setServicetag(str);
                        event.setContent(str3);
                        String str4 = k.b().a().q;
                        event.setProcessname(str4 != null ? str4 : "");
                        this.f11495b.add(event);
                    }
                }
            }
        }
    }
}
