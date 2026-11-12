package com.huawei.ui.homehealth.quickentrycard;

import android.text.TextUtils;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import com.huawei.hihealth.HiSampleConfig;
import com.huawei.hihealth.data.listener.HiDataOperateListener;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.homehealth.quickentrycard.QuickEntryDictionaryManager;
import defpackage.njy;
import defpackage.qhq;
import health.compact.a.LogAnonymous;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public class QuickEntryDictionaryManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static QuickEntryDictionaryManager f25738a;

    public interface OnDictionaryCallback {
        void onDictionaryResult(List<String> list);
    }

    private QuickEntryDictionaryManager() {
    }

    public static QuickEntryDictionaryManager a() {
        QuickEntryDictionaryManager quickEntryDictionaryManager;
        synchronized (QuickEntryDictionaryManager.class) {
            if (f25738a == null) {
                f25738a = new QuickEntryDictionaryManager();
            }
            quickEntryDictionaryManager = f25738a;
        }
        return quickEntryDictionaryManager;
    }

    public void a(final OnDictionaryCallback onDictionaryCallback) {
        LogUtil.a("QuickEntryDictionaryManager", "getDictionaryEntries start");
        DictionaryQueryManager.b().e(new DictionaryQueryManager.OnQueryResultCallback() { // from class: swa
            @Override // com.huawei.ui.homehealth.quickentrycard.QuickEntryDictionaryManager.DictionaryQueryManager.OnQueryResultCallback
            public final void onResult(List list) {
                QuickEntryDictionaryManager.e(onDictionaryCallback, list);
            }
        });
    }

    public static /* synthetic */ void e(OnDictionaryCallback onDictionaryCallback, List list) {
        StringBuilder sb = new StringBuilder("getDictionaryEntries result size: ");
        sb.append(list != null ? list.size() : 0);
        LogUtil.a("QuickEntryDictionaryManager", sb.toString());
        if (onDictionaryCallback != null) {
            onDictionaryCallback.onDictionaryResult(list);
        }
    }

    public static class DictionaryQueryManager {
        private static DictionaryQueryManager d;

        public interface OnQueryResultCallback {
            void onResult(List<String> list);
        }

        public interface OnSaveResultCallback {
            void onResult(boolean z);
        }

        private DictionaryQueryManager() {
        }

        public static DictionaryQueryManager b() {
            DictionaryQueryManager dictionaryQueryManager;
            synchronized (DictionaryQueryManager.class) {
                if (d == null) {
                    d = new DictionaryQueryManager();
                }
                dictionaryQueryManager = d;
            }
            return dictionaryQueryManager;
        }

        public void e(final OnQueryResultCallback onQueryResultCallback) {
            LogUtil.a("QuickEntryDictionaryManager", "DictionaryQueryManager queryDictionary start");
            ArrayList arrayList = new ArrayList();
            arrayList.add("900100021");
            qhq.b("9001", arrayList, new HiDataReadResultListener() { // from class: com.huawei.ui.homehealth.quickentrycard.QuickEntryDictionaryManager.DictionaryQueryManager.4
                @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
                public void onResult(Object obj, int i, int i2) {
                    LogUtil.a("QuickEntryDictionaryManager", "queryDictionary onResult errorCode=" + i + ", data=" + obj);
                    List<String> listB = DictionaryQueryManager.this.b(obj);
                    OnQueryResultCallback onQueryResultCallback2 = onQueryResultCallback;
                    if (onQueryResultCallback2 != null) {
                        onQueryResultCallback2.onResult(listB);
                    }
                }

                @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
                public void onResultIntent(int i, Object obj, int i2, int i3) {
                    LogUtil.a("QuickEntryDictionaryManager", "queryDictionary onResultIntent intentType=" + i + ", errorCode=" + i2);
                }
            });
        }

        public void d(List<String> list, final OnSaveResultCallback onSaveResultCallback) {
            LogUtil.a("QuickEntryDictionaryManager", "DictionaryQueryManager saveDictionary start, entryIds=" + list);
            if (list == null) {
                if (onSaveResultCallback != null) {
                    onSaveResultCallback.onResult(false);
                    return;
                }
                return;
            }
            JsonObject jsonObject = new JsonObject();
            JsonArray jsonArray = new JsonArray();
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                jsonArray.add(it.next());
            }
            jsonObject.add("uniqueIds", jsonArray);
            qhq.d("9001", "900100021", jsonObject.toString(), new HiDataOperateListener() { // from class: swc
                @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
                public final void onResult(int i, Object obj) {
                    QuickEntryDictionaryManager.DictionaryQueryManager.b(onSaveResultCallback, i, obj);
                }
            }, System.currentTimeMillis());
        }

        public static /* synthetic */ void b(OnSaveResultCallback onSaveResultCallback, int i, Object obj) {
            boolean z = i == 0;
            LogUtil.a("QuickEntryDictionaryManager", "saveDictionary result, errorCode=" + i + ", success=" + z);
            if (onSaveResultCallback != null) {
                onSaveResultCallback.onResult(z);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public List<String> b(Object obj) {
            String strOptString;
            Exception e;
            List<String> list;
            ArrayList arrayList = new ArrayList();
            if (!njy.b(obj, HiSampleConfig.class)) {
                LogUtil.j("QuickEntryDictionaryManager", "parseDictionaryData isListTypeMatch false");
                return arrayList;
            }
            List list2 = (List) obj;
            if (njy.e(list2)) {
                LogUtil.j("QuickEntryDictionaryManager", "parseDictionaryData list is empty");
                return arrayList;
            }
            HiSampleConfig hiSampleConfig = (HiSampleConfig) list2.get(0);
            if (hiSampleConfig == null) {
                LogUtil.j("QuickEntryDictionaryManager", "parseDictionaryData config is null");
                return arrayList;
            }
            String configData = hiSampleConfig.getConfigData();
            LogUtil.a("QuickEntryDictionaryManager", "parseDictionaryData configData=" + configData);
            if (configData == null || configData.isEmpty()) {
                LogUtil.j("QuickEntryDictionaryManager", "parseDictionaryData configData is empty");
                return arrayList;
            }
            try {
                strOptString = new JSONObject(configData).optString("uniqueIds");
            } catch (JSONException e2) {
                LogUtil.e("QuickEntryDictionaryManager", "parseDictionaryData", LogAnonymous.b(e2));
                strOptString = "";
            }
            if (TextUtils.isEmpty(strOptString)) {
                LogUtil.j("QuickEntryDictionaryManager", "parseDictionaryData uniqueIds is empty");
                return arrayList;
            }
            try {
                list = (List) HiJsonUtil.d(strOptString, new TypeToken<List<String>>() { // from class: com.huawei.ui.homehealth.quickentrycard.QuickEntryDictionaryManager.DictionaryQueryManager.2
                }.getType());
                try {
                    if (njy.e(list)) {
                        LogUtil.j("QuickEntryDictionaryManager", "parseDictionaryData parsed entryIds is empty");
                    }
                    return list;
                } catch (Exception e3) {
                    e = e3;
                    LogUtil.e("QuickEntryDictionaryManager", "parseDictionaryData parse error: " + e.getMessage());
                    return list;
                }
            } catch (Exception e4) {
                e = e4;
                list = arrayList;
            }
        }
    }
}
