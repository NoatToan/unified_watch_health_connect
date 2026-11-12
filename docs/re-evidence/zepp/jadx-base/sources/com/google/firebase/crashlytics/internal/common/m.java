package com.google.firebase.crashlytics.internal.common;

import androidx.annotation.NonNull;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
class m {
    private static final Charset b = Charset.forName("UTF-8");
    private static final String c = "user-data";
    private static final String d = "keys";
    private static final String e = "internal-keys";
    private static final String f = "userId";
    private final FileStore a;

    public class a extends JSONObject {
        public final /* synthetic */ UserMetadata a;

        public a(UserMetadata userMetadata) throws JSONException {
            this.a = userMetadata;
            put("userId", userMetadata.getUserId());
        }
    }

    public m(FileStore fileStore) {
        this.a = fileStore;
    }

    private static Map<String, String> d(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            map.put(next, k(jSONObject, next));
        }
        return map;
    }

    private static UserMetadata e(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        UserMetadata userMetadata = new UserMetadata();
        userMetadata.setUserId(k(jSONObject, "userId"));
        return userMetadata;
    }

    private static String f(Map<String, String> map) throws JSONException {
        return new JSONObject(map).toString();
    }

    private static String j(UserMetadata userMetadata) throws JSONException {
        return new a(userMetadata).toString();
    }

    private static String k(JSONObject jSONObject, String str) {
        if (jSONObject.isNull(str)) {
            return null;
        }
        return jSONObject.optString(str, null);
    }

    @NonNull
    public File a(String str) {
        return this.a.getSessionFile(str, e);
    }

    @NonNull
    public File b(String str) {
        return this.a.getSessionFile(str, d);
    }

    @NonNull
    public File c(String str) {
        return this.a.getSessionFile(str, c);
    }

    public Map<String, String> g(String str) {
        return h(str, false);
    }

    public Map<String, String> h(String str, boolean z) throws Throwable {
        File fileA = z ? a(str) : b(str);
        if (!fileA.exists()) {
            return Collections.emptyMap();
        }
        FileInputStream fileInputStream = null;
        try {
            try {
                FileInputStream fileInputStream2 = new FileInputStream(fileA);
                try {
                    Map<String, String> mapD = d(CommonUtils.streamToString(fileInputStream2));
                    CommonUtils.closeOrLog(fileInputStream2, "Failed to close user metadata file.");
                    return mapD;
                } catch (Exception e2) {
                    e = e2;
                    fileInputStream = fileInputStream2;
                    Logger.getLogger().e("Error deserializing user metadata.", e);
                    CommonUtils.closeOrLog(fileInputStream, "Failed to close user metadata file.");
                    return Collections.emptyMap();
                } catch (Throwable th) {
                    th = th;
                    fileInputStream = fileInputStream2;
                    CommonUtils.closeOrLog(fileInputStream, "Failed to close user metadata file.");
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e3) {
            e = e3;
        }
    }

    public UserMetadata i(String str) throws Throwable {
        File fileC = c(str);
        if (!fileC.exists()) {
            return new UserMetadata();
        }
        FileInputStream fileInputStream = null;
        try {
            try {
                FileInputStream fileInputStream2 = new FileInputStream(fileC);
                try {
                    UserMetadata userMetadataE = e(CommonUtils.streamToString(fileInputStream2));
                    CommonUtils.closeOrLog(fileInputStream2, "Failed to close user metadata file.");
                    return userMetadataE;
                } catch (Exception e2) {
                    e = e2;
                    fileInputStream = fileInputStream2;
                    Logger.getLogger().e("Error deserializing user metadata.", e);
                    CommonUtils.closeOrLog(fileInputStream, "Failed to close user metadata file.");
                    return new UserMetadata();
                } catch (Throwable th) {
                    th = th;
                    fileInputStream = fileInputStream2;
                    CommonUtils.closeOrLog(fileInputStream, "Failed to close user metadata file.");
                    throw th;
                }
            } catch (Exception e3) {
                e = e3;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public void l(String str, Map<String, String> map) throws Throwable {
        m(str, map, false);
    }

    public void m(String str, Map<String, String> map, boolean z) throws Throwable {
        File fileA = z ? a(str) : b(str);
        BufferedWriter bufferedWriter = null;
        try {
            try {
                String strF = f(map);
                BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileA), b));
                try {
                    bufferedWriter2.write(strF);
                    bufferedWriter2.flush();
                    CommonUtils.closeOrLog(bufferedWriter2, "Failed to close key/value metadata file.");
                } catch (Exception e2) {
                    e = e2;
                    bufferedWriter = bufferedWriter2;
                    Logger.getLogger().e("Error serializing key/value metadata.", e);
                    CommonUtils.closeOrLog(bufferedWriter, "Failed to close key/value metadata file.");
                } catch (Throwable th) {
                    th = th;
                    bufferedWriter = bufferedWriter2;
                    CommonUtils.closeOrLog(bufferedWriter, "Failed to close key/value metadata file.");
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e3) {
            e = e3;
        }
    }

    public void n(String str, UserMetadata userMetadata) throws Throwable {
        File fileC = c(str);
        BufferedWriter bufferedWriter = null;
        try {
            try {
                String strJ = j(userMetadata);
                BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileC), b));
                try {
                    bufferedWriter2.write(strJ);
                    bufferedWriter2.flush();
                    CommonUtils.closeOrLog(bufferedWriter2, "Failed to close user metadata file.");
                } catch (Exception e2) {
                    e = e2;
                    bufferedWriter = bufferedWriter2;
                    Logger.getLogger().e("Error serializing user metadata.", e);
                    CommonUtils.closeOrLog(bufferedWriter, "Failed to close user metadata file.");
                } catch (Throwable th) {
                    th = th;
                    bufferedWriter = bufferedWriter2;
                    CommonUtils.closeOrLog(bufferedWriter, "Failed to close user metadata file.");
                    throw th;
                }
            } catch (Exception e3) {
                e = e3;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
