package com.huami.tools.crashreport;

import android.app.Application;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.sleepassistant.apilib.utils.WebConst;
import com.xmlywind.sdk.common.mta.PointCategory;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.acra.ACRA;
import org.acra.ReportField;
import org.acra.config.CoreConfigurationBuilder;
import org.acra.config.HttpSenderConfigurationBuilder;
import org.acra.data.StringFormat;
import org.acra.sender.HttpSender;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0013B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tJ\u000e\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fJ\u000e\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\f¨\u0006\u0014"}, d2 = {"Lcom/huami/tools/crashreport/HuamiCrashReport;", "", "Lcom/huami/tools/crashreport/HuamiCrashReport$Config;", "config", "", PointCategory.INIT, "", Constants.ENABLED, "setEnable", "", "error", "reportANRError", "", "huamiId", "setHuamiId", "id", WebConst.QueryParam.SET_ID, "<init>", "()V", "Config", "crash-report_release"}, k = 1, mv = {1, 4, 0})
public final class HuamiCrashReport {
    public static final HuamiCrashReport INSTANCE = new HuamiCrashReport();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B`\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\b\u0012\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u000e\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0014\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\b\u0012%\b\u0002\u0010%\u001a\u001f\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b( \u0012\u0004\u0012\u00020\b\u0018\u00010\u001d¢\u0006\u0004\b&\u0010'R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\r\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u000e8\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0019\u001a\u00020\u00148\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001c\u001a\u0004\u0018\u00010\b8\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u0010\n\u001a\u0004\b\u001b\u0010\fR6\u0010%\u001a\u001f\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b( \u0012\u0004\u0012\u00020\b\u0018\u00010\u001d8\u0006@\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006("}, d2 = {"Lcom/huami/tools/crashreport/HuamiCrashReport$Config;", "", "Landroid/app/Application;", "a", "Landroid/app/Application;", "getApplication", "()Landroid/app/Application;", MimeTypes.BASE_TYPE_APPLICATION, "", "b", "Ljava/lang/String;", "getAppId", "()Ljava/lang/String;", "appId", "Ljava/lang/Class;", "c", "Ljava/lang/Class;", "getAppBuildConfigClass", "()Ljava/lang/Class;", "appBuildConfigClass", "", GoogleApiAvailabilityLight.a, "Z", "getDebug", "()Z", "debug", "e", "getInstallationId", "installationId", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "host", "f", "Lkotlin/jvm/functions/Function1;", "getHostMapper", "()Lkotlin/jvm/functions/Function1;", "hostMapper", "<init>", "(Landroid/app/Application;Ljava/lang/String;Ljava/lang/Class;ZLjava/lang/String;Lkotlin/jvm/functions/Function1;)V", "crash-report_release"}, k = 1, mv = {1, 4, 0})
    public static final class Config {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final Application application;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        private final String appId;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        private final Class<?> appBuildConfigClass;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final boolean debug;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @Nullable
        private final String installationId;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @Nullable
        private final Function1<String, String> hostMapper;

        /* JADX WARN: Multi-variable type inference failed */
        public Config(@NotNull Application application, @NotNull String str, @NotNull Class<?> cls, boolean z, @Nullable String str2, @Nullable Function1<? super String, String> function1) {
            this.application = application;
            this.appId = str;
            this.appBuildConfigClass = cls;
            this.debug = z;
            this.installationId = str2;
            this.hostMapper = function1;
        }

        @NotNull
        public final Class<?> getAppBuildConfigClass() {
            return this.appBuildConfigClass;
        }

        @NotNull
        public final String getAppId() {
            return this.appId;
        }

        @NotNull
        public final Application getApplication() {
            return this.application;
        }

        public final boolean getDebug() {
            return this.debug;
        }

        @Nullable
        public final Function1<String, String> getHostMapper() {
            return this.hostMapper;
        }

        @Nullable
        public final String getInstallationId() {
            return this.installationId;
        }

        public /* synthetic */ Config(Application application, String str, Class cls, boolean z, String str2, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(application, str, cls, (i & 8) != 0 ? false : z, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : function1);
        }
    }

    private HuamiCrashReport() {
    }

    public final void init(@NotNull Config config) {
        String strInvoke;
        boolean z = true;
        CoreConfigurationBuilder buildConfigClass = new CoreConfigurationBuilder(config.getApplication()).setSendReportsInDevMode(true).setBuildConfigClass(config.getAppBuildConfigClass());
        ReportField[] report_fields = HuamiReportFields.INSTANCE.getREPORT_FIELDS();
        CoreConfigurationBuilder reportSenderFactoryClasses = buildConfigClass.setReportContent((ReportField[]) Arrays.copyOf(report_fields, report_fields.length)).setReportFormat(StringFormat.JSON).setSharedPreferencesName("ACRA").setReportSenderFactoryClasses(HuamiHttpSenderFactory.class);
        String str = "https://app-analytics.huami.com/";
        if (config.getDebug()) {
            str = "https://api-analytics-test.huami.com/";
        } else {
            Function1<String, String> hostMapper = config.getHostMapper();
            if (hostMapper != null && (strInvoke = hostMapper.invoke("https://app-analytics.huami.com/")) != null) {
                str = strInvoke;
            }
        }
        HttpSenderConfigurationBuilder httpSenderConfigurationBuilder = (HttpSenderConfigurationBuilder) reportSenderFactoryClasses.getPluginConfigurationBuilder(HttpSenderConfigurationBuilder.class);
        HuamiHttpSender.Companion companion = HuamiHttpSender.INSTANCE;
        httpSenderConfigurationBuilder.setUri(companion.getReportUrl(str)).setHttpHeaders(companion.getConstantHeaders(config.getAppId())).setHttpMethod(HttpSender.Method.POST).setConnectionTimeout((int) TimeUnit.SECONDS.toMillis(10L)).setSocketTimeout((int) TimeUnit.MINUTES.toMillis(1L)).setEnabled(false);
        ACRA.DEV_LOGGING = config.getDebug();
        ACRA.init(config.getApplication(), reportSenderFactoryClasses, true);
        String installationId = config.getInstallationId();
        if (installationId != null && installationId.length() != 0) {
            z = false;
        }
        if (!z) {
            ACRA.getErrorReporter().putCustomData(HuamiReportFields.ANONYMOUS_ID, config.getInstallationId());
        }
        ACRA.getErrorReporter().putCustomData(HuamiReportFields.CRASH_SDK_VERSION_NAME, BuildConfig.VERSION_NAME);
    }

    public final void reportANRError(@NotNull Throwable error) {
        if (ACRA.isInitialised()) {
            ACRA.getErrorReporter().putCustomData(HuamiReportFields.IS_ANR, "true");
            ACRA.getErrorReporter().handleSilentException(error);
            ACRA.getErrorReporter().removeCustomData(HuamiReportFields.IS_ANR);
        }
    }

    public final void setEnable(boolean enabled) {
        if (ACRA.isInitialised()) {
            ACRA.getErrorReporter().setEnabled(enabled);
        }
    }

    public final void setHuamiId(@NotNull String huamiId) {
        ACRA.getErrorReporter().removeCustomData(HuamiReportFields.ANONYMOUS_ID);
        ACRA.getErrorReporter().putCustomData(HuamiReportFields.HUAMI_ID, huamiId);
    }

    public final void setId(@NotNull String id) {
        ACRA.getErrorReporter().removeCustomData(HuamiReportFields.HUAMI_ID);
        ACRA.getErrorReporter().putCustomData(HuamiReportFields.ANONYMOUS_ID, id);
    }
}
