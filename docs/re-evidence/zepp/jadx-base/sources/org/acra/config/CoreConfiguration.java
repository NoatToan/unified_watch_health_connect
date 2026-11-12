package org.acra.config;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.Serializable;
import org.acra.ReportField;
import org.acra.attachment.AttachmentUriProvider;
import org.acra.collections.ImmutableList;
import org.acra.collections.ImmutableSet;
import org.acra.data.StringFormat;
import org.acra.file.Directory;
import org.acra.plugins.PluginLoader;
import org.acra.sender.ReportSenderFactory;

/* JADX INFO: loaded from: classes23.dex */
public final class CoreConfiguration implements Serializable, Configuration {

    @Nullable
    private final String A;

    @NonNull
    private final StringFormat B;
    private final boolean C;

    @NonNull
    private final PluginLoader D;

    @NonNull
    private final ImmutableList<Configuration> E;
    private final boolean a;

    @NonNull
    private final String b;
    private final boolean c;

    @NonNull
    private final ImmutableList<String> d;
    private final int e;

    @NonNull
    private final ImmutableList<String> f;

    @NonNull
    private final ImmutableSet<ReportField> g;
    private final boolean h;

    @Deprecated
    private final boolean i;
    private final boolean j;

    @NonNull
    private final ImmutableList<String> k;
    private final boolean l;
    private final boolean m;
    private final boolean n;

    @NonNull
    private final ImmutableList<String> o;

    @NonNull
    private final ImmutableList<String> p;

    @NonNull
    private final Class<?> q;

    @NonNull
    @Deprecated
    private final ImmutableList<Class<? extends ReportSenderFactory>> r;

    @NonNull
    private final String s;
    private final int t;

    @NonNull
    private final Directory u;

    @NonNull
    private final Class<? extends RetryPolicy> v;
    private final boolean w;

    @NonNull
    private final ImmutableList<String> x;

    @NonNull
    private final Class<? extends AttachmentUriProvider> y;

    @Nullable
    private final String z;

    public CoreConfiguration(@NonNull CoreConfigurationBuilder coreConfigurationBuilder) {
        this.a = coreConfigurationBuilder.m();
        this.b = coreConfigurationBuilder.D();
        this.c = coreConfigurationBuilder.p();
        this.d = new ImmutableList<>(coreConfigurationBuilder.a());
        this.e = coreConfigurationBuilder.l();
        this.f = new ImmutableList<>(coreConfigurationBuilder.q());
        this.g = new ImmutableSet<>(coreConfigurationBuilder.w());
        this.h = coreConfigurationBuilder.k();
        this.i = coreConfigurationBuilder.j();
        this.j = coreConfigurationBuilder.c();
        this.k = new ImmutableList<>(coreConfigurationBuilder.b());
        this.l = coreConfigurationBuilder.r();
        this.m = coreConfigurationBuilder.s();
        this.n = coreConfigurationBuilder.C();
        this.o = new ImmutableList<>(coreConfigurationBuilder.o());
        this.p = new ImmutableList<>(coreConfigurationBuilder.n());
        this.q = coreConfigurationBuilder.i();
        this.r = new ImmutableList<>(coreConfigurationBuilder.A());
        this.s = coreConfigurationBuilder.d();
        this.t = coreConfigurationBuilder.f();
        this.u = coreConfigurationBuilder.e();
        this.v = coreConfigurationBuilder.B();
        this.w = coreConfigurationBuilder.E();
        this.x = new ImmutableList<>(coreConfigurationBuilder.h());
        this.y = coreConfigurationBuilder.g();
        this.z = coreConfigurationBuilder.z();
        this.A = coreConfigurationBuilder.y();
        this.B = coreConfigurationBuilder.x();
        this.C = coreConfigurationBuilder.t();
        this.D = coreConfigurationBuilder.v();
        this.E = new ImmutableList<>(coreConfigurationBuilder.u());
    }

    @NonNull
    public ImmutableList<String> additionalDropBoxTags() {
        return this.d;
    }

    @NonNull
    public ImmutableList<String> additionalSharedPreferences() {
        return this.k;
    }

    public boolean alsoReportToAndroidFramework() {
        return this.j;
    }

    @NonNull
    public String applicationLogFile() {
        return this.s;
    }

    @NonNull
    public Directory applicationLogFileDir() {
        return this.u;
    }

    public int applicationLogFileLines() {
        return this.t;
    }

    @NonNull
    public Class<? extends AttachmentUriProvider> attachmentUriProvider() {
        return this.y;
    }

    @NonNull
    public ImmutableList<String> attachmentUris() {
        return this.x;
    }

    @NonNull
    public Class<?> buildConfigClass() {
        return this.q;
    }

    @Deprecated
    public boolean deleteOldUnsentReportsOnApplicationStart() {
        return this.i;
    }

    public boolean deleteUnapprovedReportsOnApplicationStart() {
        return this.h;
    }

    public int dropboxCollectionMinutes() {
        return this.e;
    }

    @Override // org.acra.config.Configuration
    public boolean enabled() {
        return this.a;
    }

    @NonNull
    public ImmutableList<String> excludeMatchingSettingsKeys() {
        return this.p;
    }

    @NonNull
    public ImmutableList<String> excludeMatchingSharedPreferencesKeys() {
        return this.o;
    }

    public boolean includeDropBoxSystemTags() {
        return this.c;
    }

    @NonNull
    public ImmutableList<String> logcatArguments() {
        return this.f;
    }

    public boolean logcatFilterByPid() {
        return this.l;
    }

    public boolean logcatReadNonBlocking() {
        return this.m;
    }

    public boolean parallel() {
        return this.C;
    }

    @NonNull
    public ImmutableList<Configuration> pluginConfigurations() {
        return this.E;
    }

    @NonNull
    public PluginLoader pluginLoader() {
        return this.D;
    }

    @NonNull
    public ImmutableSet<ReportField> reportContent() {
        return this.g;
    }

    @NonNull
    public StringFormat reportFormat() {
        return this.B;
    }

    @Nullable
    public String reportSendFailureToast() {
        return this.A;
    }

    @Nullable
    public String reportSendSuccessToast() {
        return this.z;
    }

    @NonNull
    @Deprecated
    public ImmutableList<Class<? extends ReportSenderFactory>> reportSenderFactoryClasses() {
        return this.r;
    }

    @NonNull
    public Class<? extends RetryPolicy> retryPolicyClass() {
        return this.v;
    }

    public boolean sendReportsInDevMode() {
        return this.n;
    }

    @NonNull
    public String sharedPreferencesName() {
        return this.b;
    }

    public boolean stopServicesOnCrash() {
        return this.w;
    }
}
