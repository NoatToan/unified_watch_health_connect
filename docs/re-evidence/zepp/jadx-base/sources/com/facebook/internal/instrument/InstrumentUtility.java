package com.facebook.internal.instrument;

import androidx.annotation.RestrictTo;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.internal.Utility;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.liulishuo.filedownloader.model.FileDownloadModel;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import kotlin.text.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b0\u00101J\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007J\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0007J\u0012\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007J\u0012\u0010\u000b\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0007J\u0015\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0007¢\u0006\u0004\b\u0010\u0010\u000fJ\u0015\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0007¢\u0006\u0004\b\u0011\u0010\u000fJ\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0012\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0013\u001a\u00020\tH\u0007J\u001c\u0010\u0018\u001a\u00020\u00172\b\u0010\u0012\u001a\u0004\u0018\u00010\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u0004H\u0007J\u0012\u0010\u0019\u001a\u00020\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004H\u0007J$\u0010\u001f\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0007J\n\u0010 \u001a\u0004\u0018\u00010\rH\u0007R\u0016\u0010!\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010#\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b#\u0010\"R\u0016\u0010$\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b$\u0010\"R\u0016\u0010%\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b%\u0010\"R\u0016\u0010&\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b&\u0010\"R\u0016\u0010'\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b'\u0010\"R\u0016\u0010)\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b(\u0010\"R\u0016\u0010+\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b*\u0010\"R\u0016\u0010-\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b,\u0010\"R\u0016\u0010/\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b.\u0010\"¨\u00062"}, d2 = {"Lcom/facebook/internal/instrument/InstrumentUtility;", "", "", "e", "", "getCause", "getStackTrace", "Ljava/lang/Thread;", "thread", "", "isSDKRelatedException", "isSDKRelatedThread", "", "Ljava/io/File;", "listAnrReportFiles", "()[Ljava/io/File;", "listExceptionAnalysisReportFiles", "listExceptionReportFiles", FileDownloadModel.FILENAME, "deleteOnException", "Lorg/json/JSONObject;", "readFile", "content", "", "writeFile", "deleteFile", "key", "Lorg/json/JSONArray;", "reports", "Lcom/facebook/GraphRequest$Callback;", "callback", "sendReports", "getInstrumentReportDir", "ANALYSIS_REPORT_PREFIX", "Ljava/lang/String;", "ANR_REPORT_PREFIX", "CRASH_REPORT_PREFIX", "CRASH_SHIELD_PREFIX", "THREAD_CHECK_PREFIX", "ERROR_REPORT_PREFIX", "a", "FBSDK_PREFIX", "b", "CODELESS_PREFIX", "c", "SUGGESTED_EVENTS_PREFIX", GoogleApiAvailabilityLight.a, "INSTRUMENT_DIR", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class InstrumentUtility {

    @NotNull
    public static final String ANALYSIS_REPORT_PREFIX = "analysis_log_";

    @NotNull
    public static final String ANR_REPORT_PREFIX = "anr_log_";

    @NotNull
    public static final String CRASH_REPORT_PREFIX = "crash_log_";

    @NotNull
    public static final String CRASH_SHIELD_PREFIX = "shield_log_";

    @NotNull
    public static final String ERROR_REPORT_PREFIX = "error_log_";

    @NotNull
    public static final InstrumentUtility INSTANCE = new InstrumentUtility();

    @NotNull
    public static final String THREAD_CHECK_PREFIX = "thread_check_log_";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private static final String FBSDK_PREFIX = "com.facebook";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final String CODELESS_PREFIX = "com.facebook.appevents.codeless";

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static final String SUGGESTED_EVENTS_PREFIX = "com.facebook.appevents.suggestedevents";

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private static final String INSTRUMENT_DIR = "instrument";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002\u000e\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ljava/io/File;", "kotlin.jvm.PlatformType", "<anonymous parameter 0>", "", "name", "", "accept", "(Ljava/io/File;Ljava/lang/String;)Z", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a implements FilenameFilter {
        public static final a a = new a();

        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            return new Regex(String.format("^%s[0-9]+.json$", Arrays.copyOf(new Object[]{InstrumentUtility.ANR_REPORT_PREFIX}, 1))).matches(str);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002\u000e\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ljava/io/File;", "kotlin.jvm.PlatformType", "<anonymous parameter 0>", "", "name", "", "accept", "(Ljava/io/File;Ljava/lang/String;)Z", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b implements FilenameFilter {
        public static final b a = new b();

        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            return new Regex(String.format("^%s[0-9]+.json$", Arrays.copyOf(new Object[]{InstrumentUtility.ANALYSIS_REPORT_PREFIX}, 1))).matches(str);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002\u000e\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ljava/io/File;", "kotlin.jvm.PlatformType", "<anonymous parameter 0>", "", "name", "", "accept", "(Ljava/io/File;Ljava/lang/String;)Z", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c implements FilenameFilter {
        public static final c a = new c();

        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            return new Regex(String.format("^(%s|%s|%s)[0-9]+.json$", Arrays.copyOf(new Object[]{InstrumentUtility.CRASH_REPORT_PREFIX, InstrumentUtility.CRASH_SHIELD_PREFIX, InstrumentUtility.THREAD_CHECK_PREFIX}, 3))).matches(str);
        }
    }

    private InstrumentUtility() {
    }

    @JvmStatic
    public static final boolean deleteFile(@Nullable String filename) {
        File instrumentReportDir = getInstrumentReportDir();
        if (instrumentReportDir == null || filename == null) {
            return false;
        }
        return new File(instrumentReportDir, filename).delete();
    }

    @JvmStatic
    @Nullable
    public static final String getCause(@Nullable Throwable e) {
        if (e == null) {
            return null;
        }
        return e.getCause() == null ? e.toString() : String.valueOf(e.getCause());
    }

    @JvmStatic
    @Nullable
    public static final File getInstrumentReportDir() {
        File file = new File(FacebookSdk.getApplicationContext().getCacheDir(), "instrument");
        if (file.exists() || file.mkdirs()) {
            return file;
        }
        return null;
    }

    @JvmStatic
    @Nullable
    public static final String getStackTrace(@Nullable Throwable e) {
        Throwable th = null;
        if (e == null) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        while (e != null && e != th) {
            for (StackTraceElement stackTraceElement : e.getStackTrace()) {
                jSONArray.put(stackTraceElement.toString());
            }
            th = e;
            e = e.getCause();
        }
        return jSONArray.toString();
    }

    @JvmStatic
    public static final boolean isSDKRelatedException(@Nullable Throwable e) {
        if (e == null) {
            return false;
        }
        Throwable th = null;
        while (e != null && e != th) {
            for (StackTraceElement stackTraceElement : e.getStackTrace()) {
                if (m.startsWith$default(stackTraceElement.getClassName(), "com.facebook", false, 2, null)) {
                    return true;
                }
            }
            th = e;
            e = e.getCause();
        }
        return false;
    }

    @JvmStatic
    public static final boolean isSDKRelatedThread(@Nullable Thread thread) {
        StackTraceElement[] stackTrace;
        if (thread != null && (stackTrace = thread.getStackTrace()) != null) {
            for (StackTraceElement stackTraceElement : stackTrace) {
                if (m.startsWith$default(stackTraceElement.getClassName(), "com.facebook", false, 2, null)) {
                    if (!m.startsWith$default(stackTraceElement.getClassName(), CODELESS_PREFIX, false, 2, null) && !m.startsWith$default(stackTraceElement.getClassName(), SUGGESTED_EVENTS_PREFIX, false, 2, null)) {
                        return true;
                    }
                    if (!m.startsWith$default(stackTraceElement.getMethodName(), "onClick", false, 2, null) && !m.startsWith$default(stackTraceElement.getMethodName(), "onItemClick", false, 2, null) && !m.startsWith$default(stackTraceElement.getMethodName(), "onTouch", false, 2, null)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @JvmStatic
    @NotNull
    public static final File[] listAnrReportFiles() {
        File instrumentReportDir = getInstrumentReportDir();
        if (instrumentReportDir == null) {
            return new File[0];
        }
        File[] fileArrListFiles = instrumentReportDir.listFiles(a.a);
        return fileArrListFiles != null ? fileArrListFiles : new File[0];
    }

    @JvmStatic
    @NotNull
    public static final File[] listExceptionAnalysisReportFiles() {
        File instrumentReportDir = getInstrumentReportDir();
        if (instrumentReportDir == null) {
            return new File[0];
        }
        File[] fileArrListFiles = instrumentReportDir.listFiles(b.a);
        return fileArrListFiles != null ? fileArrListFiles : new File[0];
    }

    @JvmStatic
    @NotNull
    public static final File[] listExceptionReportFiles() {
        File instrumentReportDir = getInstrumentReportDir();
        if (instrumentReportDir == null) {
            return new File[0];
        }
        File[] fileArrListFiles = instrumentReportDir.listFiles(c.a);
        return fileArrListFiles != null ? fileArrListFiles : new File[0];
    }

    @JvmStatic
    @Nullable
    public static final JSONObject readFile(@Nullable String filename, boolean deleteOnException) {
        File instrumentReportDir = getInstrumentReportDir();
        if (instrumentReportDir != null && filename != null) {
            try {
                return new JSONObject(Utility.readStreamToString(new FileInputStream(new File(instrumentReportDir, filename))));
            } catch (Exception unused) {
                if (deleteOnException) {
                    deleteFile(filename);
                }
            }
        }
        return null;
    }

    @JvmStatic
    public static final void sendReports(@Nullable String key, @NotNull JSONArray reports, @Nullable GraphRequest.Callback callback) {
        if (reports.length() == 0) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(key, reports.toString());
            JSONObject dataProcessingOptions = Utility.getDataProcessingOptions();
            if (dataProcessingOptions != null) {
                Iterator<String> itKeys = dataProcessingOptions.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    jSONObject.put(next, dataProcessingOptions.get(next));
                }
            }
            GraphRequest.Companion companion = GraphRequest.INSTANCE;
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            companion.newPostRequest(null, String.format("%s/instruments", Arrays.copyOf(new Object[]{FacebookSdk.getApplicationId()}, 1)), jSONObject, callback).executeAsync();
        } catch (JSONException unused) {
        }
    }

    @JvmStatic
    public static final void writeFile(@Nullable String filename, @Nullable String content) {
        File instrumentReportDir = getInstrumentReportDir();
        if (instrumentReportDir == null || filename == null || content == null) {
            return;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(instrumentReportDir, filename));
            fileOutputStream.write(content.getBytes(Charsets.UTF_8));
            fileOutputStream.close();
        } catch (Exception unused) {
        }
    }

    @JvmStatic
    @Nullable
    public static final String getStackTrace(@NotNull Thread thread) {
        StackTraceElement[] stackTrace = thread.getStackTrace();
        JSONArray jSONArray = new JSONArray();
        for (StackTraceElement stackTraceElement : stackTrace) {
            jSONArray.put(stackTraceElement.toString());
        }
        return jSONArray.toString();
    }
}
