package org.acra.data;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.alipay.sdk.m.n.a;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.acra.ReportField;
import org.acra.collections.ImmutableSet;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONStringer;

/* JADX INFO: loaded from: classes23.dex */
public enum StringFormat {
    JSON("application/json") { // from class: org.acra.data.StringFormat.1
        @Override // org.acra.data.StringFormat
        @NonNull
        public String toFormattedString(@NonNull CrashReportData crashReportData, @NonNull ImmutableSet<ReportField> immutableSet, @NonNull String str, @NonNull String str2, boolean z) throws JSONException {
            Map<String, Object> map = crashReportData.toMap();
            JSONStringer jSONStringerObject = new JSONStringer().object();
            for (ReportField reportField : immutableSet) {
                jSONStringerObject.key(reportField.toString()).value(map.remove(reportField.toString()));
            }
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                jSONStringerObject.key(entry.getKey()).value(entry.getValue());
            }
            return jSONStringerObject.endObject().toString();
        }
    },
    KEY_VALUE_LIST("application/x-www-form-urlencoded") { // from class: org.acra.data.StringFormat.2
        private void append(@NonNull StringBuilder sb, @Nullable String str, @Nullable String str2, @Nullable String str3, boolean z) throws UnsupportedEncodingException {
            if (sb.length() > 0) {
                sb.append(str3);
            }
            if (z) {
                str = str != null ? URLEncoder.encode(str, "UTF-8") : null;
                str2 = str2 != null ? URLEncoder.encode(str2, "UTF-8") : null;
            }
            sb.append(str);
            sb.append(a.h);
            sb.append(str2);
        }

        @NonNull
        private List<String> flatten(@NonNull JSONObject jSONObject) {
            Object obj;
            ArrayList arrayList = new ArrayList();
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                try {
                    obj = jSONObject.get(next);
                } catch (JSONException unused) {
                    obj = null;
                }
                if (obj instanceof JSONObject) {
                    Iterator<String> it2 = flatten((JSONObject) obj).iterator();
                    while (it2.hasNext()) {
                        arrayList.add(next + "." + it2.next());
                    }
                } else {
                    arrayList.add(next + SearchCriteria.EQ + obj);
                }
            }
            return arrayList;
        }

        @NonNull
        private Map<String, String> toStringMap(@NonNull Map<String, Object> map, @NonNull String str) {
            HashMap map2 = new HashMap(map.size());
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                map2.put(entry.getKey(), valueToString(str, entry.getValue()));
            }
            return map2;
        }

        private String valueToString(@NonNull String str, @Nullable Object obj) {
            return obj instanceof JSONObject ? TextUtils.join(str, flatten((JSONObject) obj)) : String.valueOf(obj);
        }

        @Override // org.acra.data.StringFormat
        @NonNull
        public String toFormattedString(@NonNull CrashReportData crashReportData, @NonNull ImmutableSet<ReportField> immutableSet, @NonNull String str, @NonNull String str2, boolean z) throws UnsupportedEncodingException {
            Map<String, String> stringMap = toStringMap(crashReportData.toMap(), str2);
            StringBuilder sb = new StringBuilder();
            for (ReportField reportField : immutableSet) {
                append(sb, reportField.toString(), stringMap.remove(reportField.toString()), str, z);
            }
            for (Map.Entry<String, String> entry : stringMap.entrySet()) {
                append(sb, entry.getKey(), entry.getValue(), str, z);
            }
            return sb.toString();
        }
    };

    private final String contentType;

    @NonNull
    public String getMatchingHttpContentType() {
        return this.contentType;
    }

    @NonNull
    public abstract String toFormattedString(@NonNull CrashReportData crashReportData, @NonNull ImmutableSet<ReportField> immutableSet, @NonNull String str, @NonNull String str2, boolean z) throws Exception;

    StringFormat(String str) {
        this.contentType = str;
    }
}
