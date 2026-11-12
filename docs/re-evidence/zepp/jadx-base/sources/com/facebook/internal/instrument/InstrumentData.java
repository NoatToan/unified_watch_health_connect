package com.facebook.internal.instrument;

import android.os.Build;
import androidx.annotation.RestrictTo;
import com.facebook.appevents.UserDataStore;
import com.facebook.internal.Utility;
import com.facebook.share.model.ShareStoryContent;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.firebase.crashlytics.internal.settings.b;
import com.huami.network.hmnetwork.server.HMServerDef;
import com.huami.tools.analytics.internal.utils.Const;
import com.huami.widget.share.ShareAnalytics;
import com.liulishuo.filedownloader.model.FileDownloadModel;
import com.xmlywind.sdk.common.mta.PointCategory;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 32\u00020\u0001:\u0003435B\u0011\b\u0012\u0012\u0006\u0010'\u001a\u00020\u0011¢\u0006\u0004\b(\u0010)B\u001b\b\u0012\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010*\u0012\u0006\u0010+\u001a\u00020\r¢\u0006\u0004\b(\u0010,B\u001d\b\u0012\u0012\b\u0010-\u001a\u0004\u0018\u00010\b\u0012\b\u0010.\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b(\u0010/B\u0011\b\u0012\u0012\u0006\u00101\u001a\u000200¢\u0006\u0004\b(\u00102J\u0011\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0000H\u0086\u0002J\u0006\u0010\u0006\u001a\u00020\u0005J\u0006\u0010\u0007\u001a\u00020\u0005J\b\u0010\t\u001a\u00020\bH\u0016R\u0016\u0010\f\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u000bR\u0018\u0010\u0018\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u000bR\u0018\u0010\u001a\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u000bR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0018\u0010!\u001a\u0004\u0018\u00010\u001f8B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010 R\u0018\u0010\"\u001a\u0004\u0018\u00010\u001f8B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010 R\u0018\u0010#\u001a\u0004\u0018\u00010\u001f8B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010 R\u0013\u0010%\u001a\u00020$8F@\u0006¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u00066"}, d2 = {"Lcom/facebook/internal/instrument/InstrumentData;", "", "data", "", "compareTo", "", ShareAnalytics.ParamValue.SAVE, "clear", "", "toString", "a", "Ljava/lang/String;", FileDownloadModel.FILENAME, "Lcom/facebook/internal/instrument/InstrumentData$Type;", "b", "Lcom/facebook/internal/instrument/InstrumentData$Type;", "type", "Lorg/json/JSONArray;", "c", "Lorg/json/JSONArray;", "featureNames", GoogleApiAvailabilityLight.a, "appVersion", "e", "cause", "f", Const.PARAM_STACK_TRACE, "", "g", "Ljava/lang/Long;", "timestamp", "Lorg/json/JSONObject;", "()Lorg/json/JSONObject;", "parameters", "analysisReportParameters", "exceptionReportParameters", "", "isValid", "()Z", b.e, "<init>", "(Lorg/json/JSONArray;)V", "", "t", "(Ljava/lang/Throwable;Lcom/facebook/internal/instrument/InstrumentData$Type;)V", "anrCause", UserDataStore.STATE, "(Ljava/lang/String;Ljava/lang/String;)V", "Ljava/io/File;", "file", "(Ljava/io/File;)V", "Companion", ShareStoryContent.Builder.k, "Type", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class InstrumentData {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final String h = "Unknown";
    private static final String i = "timestamp";
    private static final String j = "app_version";
    private static final String k = "device_os_version";
    private static final String l = "device_model";
    private static final String m = "reason";
    private static final String n = "callstack";
    private static final String o = "type";
    private static final String p = "feature_names";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private String filename;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private Type type;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private JSONArray featureNames;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private String appVersion;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private String cause;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private String stackTrace;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private Long timestamp;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u001a\u0010\n\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\bH\u0007J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0007J\u001c\u0010\n\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\rH\u0007¨\u0006\u0012"}, d2 = {"Lcom/facebook/internal/instrument/InstrumentData$Builder;", "", "Ljava/io/File;", "file", "Lcom/facebook/internal/instrument/InstrumentData;", PointCategory.LOAD, "", "e", "Lcom/facebook/internal/instrument/InstrumentData$Type;", "t", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "Lorg/json/JSONArray;", b.e, "", "anrCause", UserDataStore.STATE, "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class Builder {

        @NotNull
        public static final Builder INSTANCE = new Builder();

        private Builder() {
        }

        @JvmStatic
        @NotNull
        public static final InstrumentData build(@Nullable Throwable e, @NotNull Type t) {
            return new InstrumentData(e, t, (DefaultConstructorMarker) null);
        }

        @JvmStatic
        @NotNull
        public static final InstrumentData load(@NotNull File file) {
            return new InstrumentData(file, (DefaultConstructorMarker) null);
        }

        @JvmStatic
        @NotNull
        public static final InstrumentData build(@NotNull JSONArray features) {
            return new InstrumentData(features, (DefaultConstructorMarker) null);
        }

        @JvmStatic
        @NotNull
        public static final InstrumentData build(@Nullable String anrCause, @Nullable String st) {
            return new InstrumentData(anrCause, st, (DefaultConstructorMarker) null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002R\u0016\u0010\u0006\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0016\u0010\b\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0016\u0010\t\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0007R\u0016\u0010\n\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0007R\u0016\u0010\u000b\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0007R\u0016\u0010\f\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0007R\u0016\u0010\r\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0007R\u0016\u0010\u000e\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0007R\u0016\u0010\u000f\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/facebook/internal/instrument/InstrumentData$Companion;", "", "", FileDownloadModel.FILENAME, "Lcom/facebook/internal/instrument/InstrumentData$Type;", "a", "PARAM_APP_VERSION", "Ljava/lang/String;", "PARAM_CALLSTACK", "PARAM_DEVICE_MODEL", "PARAM_DEVICE_OS", "PARAM_FEATURE_NAMES", "PARAM_REASON", "PARAM_TIMESTAMP", "PARAM_TYPE", "UNKNOWN", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Type a(String filename) {
            if (m.startsWith$default(filename, InstrumentUtility.CRASH_REPORT_PREFIX, false, 2, null)) {
                return Type.CrashReport;
            }
            if (m.startsWith$default(filename, InstrumentUtility.CRASH_SHIELD_PREFIX, false, 2, null)) {
                return Type.CrashShield;
            }
            if (m.startsWith$default(filename, InstrumentUtility.THREAD_CHECK_PREFIX, false, 2, null)) {
                return Type.ThreadCheck;
            }
            if (m.startsWith$default(filename, InstrumentUtility.ANALYSIS_REPORT_PREFIX, false, 2, null)) {
                return Type.Analysis;
            }
            return m.startsWith$default(filename, InstrumentUtility.ANR_REPORT_PREFIX, false, 2, null) ? Type.AnrReport : Type.Unknown;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0013\u0010\u0006\u001a\u00020\u00028F@\u0006¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/facebook/internal/instrument/InstrumentData$Type;", "", "", "toString", "getLogPrefix", "()Ljava/lang/String;", "logPrefix", "<init>", "(Ljava/lang/String;I)V", "Unknown", "Analysis", "AnrReport", "CrashReport", "CrashShield", "ThreadCheck", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public enum Type {
        Unknown,
        Analysis,
        AnrReport,
        CrashReport,
        CrashShield,
        ThreadCheck;

        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
        public final /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;
            public static final /* synthetic */ int[] $EnumSwitchMapping$1;

            static {
                int[] iArr = new int[Type.values().length];
                $EnumSwitchMapping$0 = iArr;
                Type type = Type.Analysis;
                iArr[type.ordinal()] = 1;
                Type type2 = Type.AnrReport;
                iArr[type2.ordinal()] = 2;
                Type type3 = Type.CrashReport;
                iArr[type3.ordinal()] = 3;
                Type type4 = Type.CrashShield;
                iArr[type4.ordinal()] = 4;
                Type type5 = Type.ThreadCheck;
                iArr[type5.ordinal()] = 5;
                int[] iArr2 = new int[Type.values().length];
                $EnumSwitchMapping$1 = iArr2;
                iArr2[type.ordinal()] = 1;
                iArr2[type2.ordinal()] = 2;
                iArr2[type3.ordinal()] = 3;
                iArr2[type4.ordinal()] = 4;
                iArr2[type5.ordinal()] = 5;
            }
        }

        @NotNull
        public final String getLogPrefix() {
            int i = WhenMappings.$EnumSwitchMapping$1[ordinal()];
            if (i == 1) {
                return InstrumentUtility.ANALYSIS_REPORT_PREFIX;
            }
            if (i == 2) {
                return InstrumentUtility.ANR_REPORT_PREFIX;
            }
            if (i == 3) {
                return InstrumentUtility.CRASH_REPORT_PREFIX;
            }
            if (i != 4) {
                return i != 5 ? "Unknown" : InstrumentUtility.THREAD_CHECK_PREFIX;
            }
            return InstrumentUtility.CRASH_SHIELD_PREFIX;
        }

        @Override // java.lang.Enum
        @NotNull
        public String toString() {
            int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
            if (i == 1) {
                return "Analysis";
            }
            if (i == 2) {
                return "AnrReport";
            }
            if (i == 3) {
                return "CrashReport";
            }
            if (i != 4) {
                return i != 5 ? "Unknown" : "ThreadCheck";
            }
            return "CrashShield";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[Type.values().length];
            $EnumSwitchMapping$0 = iArr;
            Type type = Type.Analysis;
            iArr[type.ordinal()] = 1;
            Type type2 = Type.AnrReport;
            iArr[type2.ordinal()] = 2;
            Type type3 = Type.CrashReport;
            iArr[type3.ordinal()] = 3;
            Type type4 = Type.CrashShield;
            iArr[type4.ordinal()] = 4;
            Type type5 = Type.ThreadCheck;
            iArr[type5.ordinal()] = 5;
            int[] iArr2 = new int[Type.values().length];
            $EnumSwitchMapping$1 = iArr2;
            iArr2[type.ordinal()] = 1;
            iArr2[type2.ordinal()] = 2;
            iArr2[type3.ordinal()] = 3;
            iArr2[type4.ordinal()] = 4;
            iArr2[type5.ordinal()] = 5;
        }
    }

    public /* synthetic */ InstrumentData(File file, DefaultConstructorMarker defaultConstructorMarker) {
        this(file);
    }

    private final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = this.featureNames;
            if (jSONArray != null) {
                jSONObject.put(p, jSONArray);
            }
            Long l2 = this.timestamp;
            if (l2 != null) {
                jSONObject.put("timestamp", l2);
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    private final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(k, Build.VERSION.RELEASE);
            jSONObject.put("device_model", Build.MODEL);
            String str = this.appVersion;
            if (str != null) {
                jSONObject.put("app_version", str);
            }
            Long l2 = this.timestamp;
            if (l2 != null) {
                jSONObject.put("timestamp", l2);
            }
            String str2 = this.cause;
            if (str2 != null) {
                jSONObject.put("reason", str2);
            }
            String str3 = this.stackTrace;
            if (str3 != null) {
                jSONObject.put(n, str3);
            }
            Type type = this.type;
            if (type != null) {
                jSONObject.put("type", type);
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    private final JSONObject c() {
        Type type = this.type;
        if (type != null) {
            int i2 = WhenMappings.$EnumSwitchMapping$1[type.ordinal()];
            if (i2 == 1) {
                return a();
            }
            if (i2 == 2 || i2 == 3 || i2 == 4 || i2 == 5) {
                return b();
            }
        }
        return null;
    }

    public final void clear() {
        InstrumentUtility.deleteFile(this.filename);
    }

    public final int compareTo(@NotNull InstrumentData data) {
        Long l2 = this.timestamp;
        if (l2 == null) {
            return -1;
        }
        long jLongValue = l2.longValue();
        Long l3 = data.timestamp;
        if (l3 != null) {
            return (l3.longValue() > jLongValue ? 1 : (l3.longValue() == jLongValue ? 0 : -1));
        }
        return 1;
    }

    public final boolean isValid() {
        Type type = this.type;
        if (type == null) {
            return false;
        }
        int i2 = WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if ((i2 != 3 && i2 != 4 && i2 != 5) || this.stackTrace == null || this.timestamp == null) {
                    return false;
                }
            } else if (this.stackTrace == null || this.cause == null || this.timestamp == null) {
                return false;
            }
        } else if (this.featureNames == null || this.timestamp == null) {
            return false;
        }
        return true;
    }

    public final void save() {
        if (isValid()) {
            InstrumentUtility.writeFile(this.filename, toString());
        }
    }

    @NotNull
    public String toString() {
        JSONObject jSONObjectC = c();
        return jSONObjectC != null ? jSONObjectC.toString() : new JSONObject().toString();
    }

    public /* synthetic */ InstrumentData(String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2);
    }

    public /* synthetic */ InstrumentData(Throwable th, Type type, DefaultConstructorMarker defaultConstructorMarker) {
        this(th, type);
    }

    public /* synthetic */ InstrumentData(JSONArray jSONArray, DefaultConstructorMarker defaultConstructorMarker) {
        this(jSONArray);
    }

    private InstrumentData(JSONArray jSONArray) {
        this.type = Type.Analysis;
        this.timestamp = Long.valueOf(System.currentTimeMillis() / ((long) 1000));
        this.featureNames = jSONArray;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(InstrumentUtility.ANALYSIS_REPORT_PREFIX);
        stringBuffer.append(String.valueOf(this.timestamp));
        stringBuffer.append(HMServerDef.RESPONSE_FORMAT);
        this.filename = stringBuffer.toString();
    }

    private InstrumentData(Throwable th, Type type) {
        this.type = type;
        this.appVersion = Utility.getAppVersion();
        this.cause = InstrumentUtility.getCause(th);
        this.stackTrace = InstrumentUtility.getStackTrace(th);
        this.timestamp = Long.valueOf(System.currentTimeMillis() / ((long) 1000));
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(type.getLogPrefix());
        stringBuffer.append(String.valueOf(this.timestamp));
        stringBuffer.append(HMServerDef.RESPONSE_FORMAT);
        this.filename = stringBuffer.toString();
    }

    private InstrumentData(String str, String str2) {
        this.type = Type.AnrReport;
        this.appVersion = Utility.getAppVersion();
        this.cause = str;
        this.stackTrace = str2;
        this.timestamp = Long.valueOf(System.currentTimeMillis() / ((long) 1000));
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(InstrumentUtility.ANR_REPORT_PREFIX);
        stringBuffer.append(String.valueOf(this.timestamp));
        stringBuffer.append(HMServerDef.RESPONSE_FORMAT);
        this.filename = stringBuffer.toString();
    }

    private InstrumentData(File file) {
        String name = file.getName();
        this.filename = name;
        this.type = INSTANCE.a(name);
        JSONObject file2 = InstrumentUtility.readFile(this.filename, true);
        if (file2 != null) {
            this.timestamp = Long.valueOf(file2.optLong("timestamp", 0L));
            this.appVersion = file2.optString("app_version", null);
            this.cause = file2.optString("reason", null);
            this.stackTrace = file2.optString(n, null);
            this.featureNames = file2.optJSONArray(p);
        }
    }
}
