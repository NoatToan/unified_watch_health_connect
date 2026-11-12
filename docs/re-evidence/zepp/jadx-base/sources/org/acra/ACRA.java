package org.acra;

import android.app.Application;
import android.content.SharedPreferences;
import android.os.Build;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.io.IOException;
import java.util.Objects;
import org.acra.config.ACRAConfigurationException;
import org.acra.config.CoreConfiguration;
import org.acra.config.CoreConfigurationBuilder;
import org.acra.legacy.LegacyFileHandler;
import org.acra.log.ACRALog;
import org.acra.log.AndroidLogDelegate;
import org.acra.prefs.SharedPreferencesFactory;
import org.acra.reporter.ErrorReporterImpl;
import org.acra.util.StreamReader;
import org.acra.util.StubCreator;

/* JADX INFO: loaded from: classes23.dex */
@Keep
public final class ACRA {
    private static final String ACRA_PRIVATE_PROCESS_NAME = ":acra";
    public static boolean DEV_LOGGING = false;
    public static final String LOG_TAG = "ACRA";
    public static final String PREF_ALWAYS_ACCEPT = "acra.alwaysaccept";
    public static final String PREF_DISABLE_ACRA = "acra.disable";
    public static final String PREF_ENABLE_ACRA = "acra.enable";
    public static final String PREF_ENABLE_DEVICE_ID = "acra.deviceid.enable";
    public static final String PREF_ENABLE_SYSTEM_LOGS = "acra.syslog.enable";
    public static final String PREF_LAST_VERSION_NR = "acra.lastVersionNr";
    public static final String PREF_USER_EMAIL_ADDRESS = "acra.user.email";

    @NonNull
    public static ACRALog log = new AndroidLogDelegate();

    @NonNull
    private static ErrorReporter errorReporterSingleton = StubCreator.createErrorReporterStub();

    private ACRA() {
    }

    @Nullable
    private static String getCurrentProcessName() {
        try {
            return new StreamReader("/proc/self/cmdline").read().trim();
        } catch (IOException unused) {
            return null;
        }
    }

    @NonNull
    public static ErrorReporter getErrorReporter() {
        return errorReporterSingleton;
    }

    public static void init(@NonNull Application application) {
        init(application, new CoreConfigurationBuilder(application));
    }

    public static boolean isACRASenderServiceProcess() {
        String currentProcessName = getCurrentProcessName();
        if (DEV_LOGGING) {
            log.d(LOG_TAG, "ACRA processName='" + currentProcessName + '\'');
        }
        return currentProcessName != null && currentProcessName.endsWith(ACRA_PRIVATE_PROCESS_NAME);
    }

    public static boolean isInitialised() {
        return errorReporterSingleton instanceof ErrorReporterImpl;
    }

    public static void setLog(@NonNull ACRALog aCRALog) {
        Objects.requireNonNull(aCRALog, "ACRALog cannot be null");
        log = aCRALog;
    }

    public static void init(@NonNull Application application, @NonNull CoreConfigurationBuilder coreConfigurationBuilder) {
        init(application, coreConfigurationBuilder, true);
    }

    public static void init(@NonNull Application application, @NonNull CoreConfigurationBuilder coreConfigurationBuilder, boolean z) {
        try {
            init(application, coreConfigurationBuilder.build(), z);
        } catch (ACRAConfigurationException e) {
            log.w(LOG_TAG, "Configuration Error - ACRA not started : " + e.getMessage());
        }
    }

    public static void init(@NonNull Application application, @NonNull CoreConfiguration coreConfiguration) {
        init(application, coreConfiguration, true);
    }

    public static void init(@NonNull Application application, @NonNull CoreConfiguration coreConfiguration, boolean z) {
        boolean zIsACRASenderServiceProcess = isACRASenderServiceProcess();
        if (zIsACRASenderServiceProcess && DEV_LOGGING) {
            log.d(LOG_TAG, "Not initialising ACRA to listen for uncaught Exceptions as this is the SendWorker process and we only send reports, we don't capture them to avoid infinite loops");
        }
        boolean z2 = Build.VERSION.SDK_INT >= 14;
        if (!z2) {
            log.w(LOG_TAG, "ACRA 5.1.0+ requires ICS or greater. ACRA is disabled and will NOT catch crashes or send messages.");
        }
        if (isInitialised()) {
            ACRALog aCRALog = log;
            String str = LOG_TAG;
            aCRALog.w(str, "ACRA#init called more than once. This might have unexpected side effects. Doing this outside of tests is discouraged.");
            if (DEV_LOGGING) {
                log.d(str, "Removing old ACRA config...");
            }
            ((ErrorReporterImpl) errorReporterSingleton).unregister();
            errorReporterSingleton = StubCreator.createErrorReporterStub();
        }
        if (coreConfiguration == null) {
            log.e(LOG_TAG, "ACRA#init called but no CoreConfiguration provided");
            return;
        }
        SharedPreferences sharedPreferencesCreate = new SharedPreferencesFactory(application, coreConfiguration).create();
        new LegacyFileHandler(application, sharedPreferencesCreate).updateToCurrentVersionIfNecessary();
        if (zIsACRASenderServiceProcess) {
            return;
        }
        boolean z3 = z2 && SharedPreferencesFactory.shouldEnableACRA(sharedPreferencesCreate);
        ACRALog aCRALog2 = log;
        String str2 = LOG_TAG;
        StringBuilder sb = new StringBuilder();
        sb.append("ACRA is ");
        sb.append(z3 ? Constants.ENABLED : "disabled");
        sb.append(" for ");
        sb.append(application.getPackageName());
        sb.append(", initializing...");
        aCRALog2.i(str2, sb.toString());
        ErrorReporterImpl errorReporterImpl = new ErrorReporterImpl(application, coreConfiguration, z3, z2, z);
        errorReporterSingleton = errorReporterImpl;
        sharedPreferencesCreate.registerOnSharedPreferenceChangeListener(errorReporterImpl);
    }
}
