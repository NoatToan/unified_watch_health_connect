package org.acra.config;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import java.util.List;
import java.util.Set;
import org.acra.ReportField;
import org.acra.annotation.AcraCore;
import org.acra.attachment.AttachmentUriProvider;
import org.acra.attachment.DefaultAttachmentProvider;
import org.acra.data.StringFormat;
import org.acra.file.Directory;
import org.acra.plugins.PluginLoader;
import org.acra.sender.ReportSenderFactory;

/* JADX INFO: loaded from: classes23.dex */
public final class CoreConfigurationBuilder implements ConfigurationBuilder {

    @Nullable
    private String A;

    @Nullable
    private String B;

    @NonNull
    private StringFormat C;
    private boolean D;

    @NonNull
    private final BaseCoreConfigurationBuilder E;

    @NonNull
    private final Context a;
    private boolean b;

    @NonNull
    private String c;
    private boolean d;

    @NonNull
    private String[] e;
    private int f;

    @NonNull
    private String[] g;

    @NonNull
    private ReportField[] h;
    private boolean i;

    @Deprecated
    private boolean j;
    private boolean k;

    @NonNull
    private String[] l;
    private boolean m;
    private boolean n;
    private boolean o;

    @NonNull
    private String[] p;

    @NonNull
    private String[] q;

    @NonNull
    private Class<?> r;

    @NonNull
    @Deprecated
    private Class<? extends ReportSenderFactory>[] s;

    @NonNull
    private String t;
    private int u;

    @NonNull
    private Directory v;

    @NonNull
    private Class<? extends RetryPolicy> w;
    private boolean x;

    @NonNull
    private String[] y;

    @NonNull
    private Class<? extends AttachmentUriProvider> z;

    public CoreConfigurationBuilder(@NonNull Context context) {
        AcraCore acraCore = (AcraCore) context.getClass().getAnnotation(AcraCore.class);
        this.a = context;
        this.b = acraCore != null;
        this.E = new BaseCoreConfigurationBuilder(context);
        if (!this.b) {
            this.c = "";
            this.d = false;
            this.e = new String[0];
            this.f = 5;
            this.g = new String[]{"-t", "100", "-v", "time"};
            this.h = new ReportField[0];
            this.i = true;
            this.j = true;
            this.k = false;
            this.l = new String[0];
            this.m = true;
            this.n = false;
            this.o = true;
            this.p = new String[0];
            this.q = new String[0];
            this.r = Object.class;
            this.s = new Class[0];
            this.t = "";
            this.u = 100;
            this.v = Directory.FILES_LEGACY;
            this.w = DefaultRetryPolicy.class;
            this.x = false;
            this.y = new String[0];
            this.z = DefaultAttachmentProvider.class;
            this.C = StringFormat.JSON;
            this.D = true;
            return;
        }
        this.c = acraCore.sharedPreferencesName();
        this.d = acraCore.includeDropBoxSystemTags();
        this.e = acraCore.additionalDropBoxTags();
        this.f = acraCore.dropboxCollectionMinutes();
        this.g = acraCore.logcatArguments();
        this.h = acraCore.reportContent();
        this.i = acraCore.deleteUnapprovedReportsOnApplicationStart();
        this.j = acraCore.deleteOldUnsentReportsOnApplicationStart();
        this.k = acraCore.alsoReportToAndroidFramework();
        this.l = acraCore.additionalSharedPreferences();
        this.m = acraCore.logcatFilterByPid();
        this.n = acraCore.logcatReadNonBlocking();
        this.o = acraCore.sendReportsInDevMode();
        this.p = acraCore.excludeMatchingSharedPreferencesKeys();
        this.q = acraCore.excludeMatchingSettingsKeys();
        this.r = acraCore.buildConfigClass();
        this.s = acraCore.reportSenderFactoryClasses();
        this.t = acraCore.applicationLogFile();
        this.u = acraCore.applicationLogFileLines();
        this.v = acraCore.applicationLogFileDir();
        this.w = acraCore.retryPolicyClass();
        this.x = acraCore.stopServicesOnCrash();
        this.y = acraCore.attachmentUris();
        this.z = acraCore.attachmentUriProvider();
        if (acraCore.resReportSendSuccessToast() != 0) {
            this.A = context.getString(acraCore.resReportSendSuccessToast());
        }
        if (acraCore.resReportSendFailureToast() != 0) {
            this.B = context.getString(acraCore.resReportSendFailureToast());
        }
        this.C = acraCore.reportFormat();
        this.D = acraCore.parallel();
    }

    @NonNull
    @Deprecated
    public Class<? extends ReportSenderFactory>[] A() {
        return this.s;
    }

    @NonNull
    public Class<? extends RetryPolicy> B() {
        return this.w;
    }

    public boolean C() {
        return this.o;
    }

    @NonNull
    public String D() {
        return this.c;
    }

    public boolean E() {
        return this.x;
    }

    @NonNull
    public String[] a() {
        return this.e;
    }

    @NonNull
    public String[] b() {
        return this.l;
    }

    public boolean c() {
        return this.k;
    }

    @NonNull
    public String d() {
        return this.t;
    }

    @NonNull
    public Directory e() {
        return this.v;
    }

    public int f() {
        return this.u;
    }

    @NonNull
    public Class<? extends AttachmentUriProvider> g() {
        return this.z;
    }

    @NonNull
    public <R extends ConfigurationBuilder> R getPluginConfigurationBuilder(Class<R> cls) {
        return (R) this.E.getPluginConfigurationBuilder(cls);
    }

    @NonNull
    public String[] h() {
        return this.y;
    }

    @NonNull
    public Class<?> i() {
        return this.r;
    }

    @Deprecated
    public boolean j() {
        return this.j;
    }

    public boolean k() {
        return this.i;
    }

    public int l() {
        return this.f;
    }

    public boolean m() {
        return this.b;
    }

    @NonNull
    public String[] n() {
        return this.q;
    }

    @NonNull
    public String[] o() {
        return this.p;
    }

    public boolean p() {
        return this.d;
    }

    @NonNull
    public String[] q() {
        return this.g;
    }

    public boolean r() {
        return this.m;
    }

    public boolean s() {
        return this.n;
    }

    @NonNull
    public CoreConfigurationBuilder setAdditionalDropBoxTags(@NonNull String... strArr) {
        this.e = strArr;
        return this;
    }

    @NonNull
    public CoreConfigurationBuilder setAdditionalSharedPreferences(@NonNull String... strArr) {
        this.l = strArr;
        return this;
    }

    @NonNull
    public CoreConfigurationBuilder setAlsoReportToAndroidFramework(boolean z) {
        this.k = z;
        return this;
    }

    @NonNull
    public CoreConfigurationBuilder setApplicationLogFile(@NonNull String str) {
        this.t = str;
        return this;
    }

    @NonNull
    public CoreConfigurationBuilder setApplicationLogFileDir(@NonNull Directory directory) {
        this.v = directory;
        return this;
    }

    @NonNull
    public CoreConfigurationBuilder setApplicationLogFileLines(int i) {
        this.u = i;
        return this;
    }

    @NonNull
    public CoreConfigurationBuilder setAttachmentUriProvider(@NonNull Class<? extends AttachmentUriProvider> cls) {
        this.z = cls;
        return this;
    }

    @NonNull
    public CoreConfigurationBuilder setAttachmentUris(@NonNull String... strArr) {
        this.y = strArr;
        return this;
    }

    @NonNull
    public CoreConfigurationBuilder setBuildConfigClass(@NonNull Class<?> cls) {
        this.r = cls;
        return this;
    }

    @NonNull
    @Deprecated
    public CoreConfigurationBuilder setDeleteOldUnsentReportsOnApplicationStart(boolean z) {
        this.j = z;
        return this;
    }

    @NonNull
    public CoreConfigurationBuilder setDeleteUnapprovedReportsOnApplicationStart(boolean z) {
        this.i = z;
        return this;
    }

    @NonNull
    public CoreConfigurationBuilder setDropboxCollectionMinutes(int i) {
        this.f = i;
        return this;
    }

    @NonNull
    public CoreConfigurationBuilder setEnabled(boolean z) {
        this.b = z;
        return this;
    }

    @NonNull
    public CoreConfigurationBuilder setExcludeMatchingSettingsKeys(@NonNull String... strArr) {
        this.q = strArr;
        return this;
    }

    @NonNull
    public CoreConfigurationBuilder setExcludeMatchingSharedPreferencesKeys(@NonNull String... strArr) {
        this.p = strArr;
        return this;
    }

    @NonNull
    public CoreConfigurationBuilder setIncludeDropBoxSystemTags(boolean z) {
        this.d = z;
        return this;
    }

    @NonNull
    public CoreConfigurationBuilder setLogcatArguments(@NonNull String... strArr) {
        this.g = strArr;
        return this;
    }

    @NonNull
    public CoreConfigurationBuilder setLogcatFilterByPid(boolean z) {
        this.m = z;
        return this;
    }

    @NonNull
    public CoreConfigurationBuilder setLogcatReadNonBlocking(boolean z) {
        this.n = z;
        return this;
    }

    @NonNull
    public CoreConfigurationBuilder setParallel(boolean z) {
        this.D = z;
        return this;
    }

    @NonNull
    public CoreConfigurationBuilder setPluginLoader(PluginLoader pluginLoader) {
        this.E.setPluginLoader(pluginLoader);
        return this;
    }

    @NonNull
    public CoreConfigurationBuilder setReportContent(@NonNull ReportField... reportFieldArr) {
        this.h = reportFieldArr;
        return this;
    }

    @NonNull
    public CoreConfigurationBuilder setReportField(ReportField reportField, boolean z) {
        this.E.setReportField(reportField, z);
        return this;
    }

    @NonNull
    public CoreConfigurationBuilder setReportFormat(@NonNull StringFormat stringFormat) {
        this.C = stringFormat;
        return this;
    }

    @NonNull
    public CoreConfigurationBuilder setReportSendFailureToast(@Nullable String str) {
        this.B = str;
        return this;
    }

    @NonNull
    public CoreConfigurationBuilder setReportSendSuccessToast(@Nullable String str) {
        this.A = str;
        return this;
    }

    @NonNull
    @Deprecated
    public CoreConfigurationBuilder setReportSenderFactoryClasses(@NonNull Class<? extends ReportSenderFactory>... clsArr) {
        this.s = clsArr;
        return this;
    }

    @NonNull
    public CoreConfigurationBuilder setResReportSendFailureToast(@StringRes int i) {
        this.B = this.a.getString(i);
        return this;
    }

    @NonNull
    public CoreConfigurationBuilder setResReportSendSuccessToast(@StringRes int i) {
        this.A = this.a.getString(i);
        return this;
    }

    @NonNull
    public CoreConfigurationBuilder setRetryPolicyClass(@NonNull Class<? extends RetryPolicy> cls) {
        this.w = cls;
        return this;
    }

    @NonNull
    public CoreConfigurationBuilder setSendReportsInDevMode(boolean z) {
        this.o = z;
        return this;
    }

    @NonNull
    public CoreConfigurationBuilder setSharedPreferencesName(@NonNull String str) {
        this.c = str;
        return this;
    }

    @NonNull
    public CoreConfigurationBuilder setStopServicesOnCrash(boolean z) {
        this.x = z;
        return this;
    }

    public boolean t() {
        return this.D;
    }

    @NonNull
    public List<Configuration> u() {
        return this.E.d();
    }

    @NonNull
    public PluginLoader v() {
        return this.E.e();
    }

    @NonNull
    public Set<ReportField> w() {
        return this.E.g(this.h);
    }

    @NonNull
    public StringFormat x() {
        return this.C;
    }

    @Nullable
    public String y() {
        return this.B;
    }

    @Nullable
    public String z() {
        return this.A;
    }

    @Override // org.acra.config.ConfigurationBuilder
    @NonNull
    public CoreConfiguration build() throws ACRAConfigurationException {
        if (this.b) {
            ClassValidator.check(this.s);
            ClassValidator.check(this.w);
            ClassValidator.check(this.z);
        }
        this.E.f();
        return new CoreConfiguration(this);
    }
}
