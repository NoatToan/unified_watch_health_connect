package org.acra.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.acra.ACRA;
import org.acra.ACRAConstants;
import org.acra.ReportField;
import org.acra.collections.ImmutableSet;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes23.dex */
public final class CrashReportData {
    private final JSONObject a;

    public CrashReportData() {
        this.a = new JSONObject();
    }

    private void a(@NonNull String str) {
        try {
            this.a.put(str, ACRAConstants.NOT_AVAILABLE);
        } catch (JSONException unused) {
        }
    }

    public boolean containsKey(@NonNull String str) {
        return this.a.has(str);
    }

    public Object get(@NonNull String str) {
        return this.a.opt(str);
    }

    public String getString(@NonNull ReportField reportField) {
        return this.a.optString(reportField.toString());
    }

    public synchronized void put(@NonNull String str, boolean z) {
        try {
            this.a.put(str, z);
        } catch (JSONException unused) {
            ACRA.log.w(ACRA.LOG_TAG, "Failed to put value into CrashReportData: " + String.valueOf(z));
        }
    }

    @NonNull
    public String toJSON() throws JSONException {
        try {
            return StringFormat.JSON.toFormattedString(this, ImmutableSet.empty(), "", "", false);
        } catch (JSONException e) {
            throw e;
        } catch (Exception e2) {
            throw new JSONException(e2.getMessage());
        }
    }

    @NonNull
    public Map<String, Object> toMap() {
        HashMap map = new HashMap(this.a.length());
        Iterator<String> itKeys = this.a.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            map.put(next, get(next));
        }
        return map;
    }

    public boolean containsKey(@NonNull ReportField reportField) {
        return containsKey(reportField.toString());
    }

    public CrashReportData(String str) throws JSONException {
        this.a = new JSONObject(str);
    }

    public synchronized void put(@NonNull String str, double d) {
        try {
            this.a.put(str, d);
        } catch (JSONException unused) {
            ACRA.log.w(ACRA.LOG_TAG, "Failed to put value into CrashReportData: " + String.valueOf(d));
        }
    }

    public synchronized void put(@NonNull String str, int i) {
        try {
            this.a.put(str, i);
        } catch (JSONException unused) {
            ACRA.log.w(ACRA.LOG_TAG, "Failed to put value into CrashReportData: " + String.valueOf(i));
        }
    }

    public synchronized void put(@NonNull String str, long j) {
        try {
            this.a.put(str, j);
        } catch (JSONException unused) {
            ACRA.log.w(ACRA.LOG_TAG, "Failed to put value into CrashReportData: " + String.valueOf(j));
        }
    }

    public synchronized void put(@NonNull String str, @Nullable String str2) {
        if (str2 == null) {
            a(str);
            return;
        }
        try {
            this.a.put(str, str2);
        } catch (JSONException unused) {
            ACRA.log.w(ACRA.LOG_TAG, "Failed to put value into CrashReportData: " + str2);
        }
    }

    public synchronized void put(@NonNull String str, @Nullable JSONObject jSONObject) {
        if (jSONObject == null) {
            a(str);
            return;
        }
        try {
            this.a.put(str, jSONObject);
        } catch (JSONException unused) {
            ACRA.log.w(ACRA.LOG_TAG, "Failed to put value into CrashReportData: " + String.valueOf(jSONObject));
        }
    }

    public synchronized void put(@NonNull String str, @Nullable JSONArray jSONArray) {
        if (jSONArray == null) {
            a(str);
            return;
        }
        try {
            this.a.put(str, jSONArray);
        } catch (JSONException unused) {
            ACRA.log.w(ACRA.LOG_TAG, "Failed to put value into CrashReportData: " + String.valueOf(jSONArray));
        }
    }

    public synchronized void put(@NonNull ReportField reportField, boolean z) {
        put(reportField.toString(), z);
    }

    public synchronized void put(@NonNull ReportField reportField, double d) {
        put(reportField.toString(), d);
    }

    public synchronized void put(@NonNull ReportField reportField, int i) {
        put(reportField.toString(), i);
    }

    public synchronized void put(@NonNull ReportField reportField, long j) {
        put(reportField.toString(), j);
    }

    public synchronized void put(@NonNull ReportField reportField, @Nullable String str) {
        put(reportField.toString(), str);
    }

    public synchronized void put(@NonNull ReportField reportField, @Nullable JSONObject jSONObject) {
        put(reportField.toString(), jSONObject);
    }

    public synchronized void put(@NonNull ReportField reportField, @Nullable JSONArray jSONArray) {
        put(reportField.toString(), jSONArray);
    }
}
