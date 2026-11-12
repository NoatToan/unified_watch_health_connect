package org.acra.annotation;

import androidx.annotation.NonNull;
import androidx.annotation.StringRes;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.acra.ReportField;
import org.acra.attachment.AttachmentUriProvider;
import org.acra.attachment.DefaultAttachmentProvider;
import org.acra.config.DefaultRetryPolicy;
import org.acra.config.RetryPolicy;
import org.acra.data.StringFormat;
import org.acra.file.Directory;
import org.acra.sender.ReportSenderFactory;

/* JADX INFO: loaded from: classes23.dex */
@Target({ElementType.TYPE})
@Inherited
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface AcraCore {
    @NonNull
    String[] additionalDropBoxTags() default {};

    @NonNull
    String[] additionalSharedPreferences() default {};

    boolean alsoReportToAndroidFramework() default false;

    @NonNull
    String applicationLogFile() default "";

    @NonNull
    Directory applicationLogFileDir() default Directory.FILES_LEGACY;

    int applicationLogFileLines() default 100;

    @NonNull
    Class<? extends AttachmentUriProvider> attachmentUriProvider() default DefaultAttachmentProvider.class;

    @NonNull
    String[] attachmentUris() default {};

    @NonNull
    Class<?> buildConfigClass() default Object.class;

    @Deprecated
    boolean deleteOldUnsentReportsOnApplicationStart() default true;

    boolean deleteUnapprovedReportsOnApplicationStart() default true;

    int dropboxCollectionMinutes() default 5;

    @NonNull
    String[] excludeMatchingSettingsKeys() default {};

    @NonNull
    String[] excludeMatchingSharedPreferencesKeys() default {};

    boolean includeDropBoxSystemTags() default false;

    @NonNull
    String[] logcatArguments() default {"-t", "100", "-v", "time"};

    boolean logcatFilterByPid() default true;

    boolean logcatReadNonBlocking() default false;

    boolean parallel() default true;

    @NonNull
    ReportField[] reportContent() default {};

    @NonNull
    StringFormat reportFormat() default StringFormat.JSON;

    @NonNull
    @Deprecated
    Class<? extends ReportSenderFactory>[] reportSenderFactoryClasses() default {};

    @StringRes
    int resReportSendFailureToast() default 0;

    @StringRes
    int resReportSendSuccessToast() default 0;

    @NonNull
    Class<? extends RetryPolicy> retryPolicyClass() default DefaultRetryPolicy.class;

    boolean sendReportsInDevMode() default true;

    @NonNull
    String sharedPreferencesName() default "";

    boolean stopServicesOnCrash() default false;
}
