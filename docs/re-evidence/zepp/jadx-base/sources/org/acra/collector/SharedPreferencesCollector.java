package org.acra.collector;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import androidx.annotation.NonNull;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import org.acra.ACRA;
import org.acra.ReportField;
import org.acra.builder.ReportBuilder;
import org.acra.config.CoreConfiguration;
import org.acra.data.CrashReportData;
import org.acra.prefs.SharedPreferencesFactory;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes23.dex */
public final class SharedPreferencesCollector extends BaseReportFieldCollector {

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ReportField.values().length];
            a = iArr;
            try {
                iArr[ReportField.USER_EMAIL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[ReportField.SHARED_PREFERENCES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public SharedPreferencesCollector() {
        super(ReportField.USER_EMAIL, ReportField.SHARED_PREFERENCES);
    }

    private boolean filteredKey(@NonNull CoreConfiguration coreConfiguration, @NonNull String str) {
        Iterator<String> it2 = coreConfiguration.excludeMatchingSharedPreferencesKeys().iterator();
        while (it2.hasNext()) {
            if (str.matches(it2.next())) {
                return true;
            }
        }
        return false;
    }

    @Override // org.acra.collector.BaseReportFieldCollector
    public void collect(@NonNull ReportField reportField, @NonNull Context context, @NonNull CoreConfiguration coreConfiguration, @NonNull ReportBuilder reportBuilder, @NonNull CrashReportData crashReportData) throws Exception {
        int i = a.a[reportField.ordinal()];
        if (i == 1) {
            crashReportData.put(ReportField.USER_EMAIL, new SharedPreferencesFactory(context, coreConfiguration).create().getString(ACRA.PREF_USER_EMAIL_ADDRESS, null));
        } else {
            if (i != 2) {
                throw new IllegalArgumentException();
            }
            crashReportData.put(ReportField.SHARED_PREFERENCES, collect(context, coreConfiguration));
        }
    }

    @NonNull
    private JSONObject collect(@NonNull Context context, @NonNull CoreConfiguration coreConfiguration) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        TreeMap treeMap = new TreeMap();
        treeMap.put("default", PreferenceManager.getDefaultSharedPreferences(context));
        for (String str : coreConfiguration.additionalSharedPreferences()) {
            treeMap.put(str, context.getSharedPreferences(str, 0));
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String str2 = (String) entry.getKey();
            Map<String, ?> all = ((SharedPreferences) entry.getValue()).getAll();
            if (all.isEmpty()) {
                jSONObject.put(str2, "empty");
            } else {
                Iterator<String> it2 = all.keySet().iterator();
                while (it2.hasNext()) {
                    if (filteredKey(coreConfiguration, it2.next())) {
                        it2.remove();
                    }
                }
                jSONObject.put(str2, new JSONObject(all));
            }
        }
        return jSONObject;
    }
}
