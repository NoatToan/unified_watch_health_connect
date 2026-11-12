package com.facebook.appevents.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.work.PeriodicWorkRequest;
import com.facebook.FacebookSdk;
import com.facebook.LoggingBehavior;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.appevents.InternalAppEventsLogger;
import com.facebook.internal.Logger;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.facebook.internal.security.CertificateUtil;
import com.huami.bloodoxygen.ui.utils.ConstantKt;
import com.huami.device.feature.health.ui.bloodpressure.viewmodel.BloodPressureCorrectViewModel;
import com.huami.tools.analytics.DbUtils;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0016\n\u0002\b\u0006\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ,\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0007J$\u0010\r\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0007J\b\u0010\u000e\u001a\u00020\tH\u0002J\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0007J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\u0007R\u0016\u0010\u0015\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0014R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, d2 = {"Lcom/facebook/appevents/internal/SessionLogger;", "", "", "activityName", "Lcom/facebook/appevents/internal/SourceApplicationInfo;", "sourceApplicationInfo", "appId", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "logActivateApp", "Lcom/facebook/appevents/internal/SessionInfo;", "sessionInfo", "logDeactivateApp", "a", "", "timeBetweenSessions", "", "getQuantaIndex", "computePackageChecksum", "Ljava/lang/String;", "PACKAGE_CHECKSUM", "b", "TAG", "", "c", "[J", "INACTIVE_SECONDS_QUANTA", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class SessionLogger {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private static final String PACKAGE_CHECKSUM = "PCKGCHKSUM";

    @NotNull
    public static final SessionLogger INSTANCE = new SessionLogger();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final String TAG = SessionLogger.class.getCanonicalName();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static final long[] INACTIVE_SECONDS_QUANTA = {300000, PeriodicWorkRequest.MIN_PERIODIC_INTERVAL_MILLIS, BloodPressureCorrectViewModel.NEED_RETURN_TIME, 3600000, ConstantKt.MILLI_SECONDS_6_HOUR, 43200000, 86400000, 172800000, 259200000, 604800000, 1209600000, 1814400000, 2419200000L, 5184000000L, 7776000000L, 10368000000L, 12960000000L, 15552000000L, 31536000000L};

    private SessionLogger() {
    }

    private final void a() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            Logger.INSTANCE.log(LoggingBehavior.APP_EVENTS, TAG, "Clock skew detected");
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    @JvmStatic
    public static final int getQuantaIndex(long timeBetweenSessions) {
        if (CrashShieldHandler.isObjectCrashing(SessionLogger.class)) {
            return 0;
        }
        int i = 0;
        while (true) {
            try {
                long[] jArr = INACTIVE_SECONDS_QUANTA;
                if (i >= jArr.length || jArr[i] >= timeBetweenSessions) {
                    break;
                }
                i++;
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, SessionLogger.class);
                return 0;
            }
        }
        return i;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0012  */
    @JvmStatic
    public static final void logActivateApp(@NotNull String activityName, @Nullable SourceApplicationInfo sourceApplicationInfo, @Nullable String appId, @NotNull Context context) {
        String string;
        if (CrashShieldHandler.isObjectCrashing(SessionLogger.class)) {
            return;
        }
        if (sourceApplicationInfo != null) {
            try {
                string = sourceApplicationInfo.toString();
                if (string == null) {
                    string = "Unclassified";
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, SessionLogger.class);
                return;
            }
        } else {
            string = "Unclassified";
        }
        Bundle bundle = new Bundle();
        bundle.putString(AppEventsConstants.EVENT_PARAM_SOURCE_APPLICATION, string);
        bundle.putString(AppEventsConstants.EVENT_PARAM_PACKAGE_FP, INSTANCE.computePackageChecksum(context));
        bundle.putString(AppEventsConstants.EVENT_PARAM_APP_CERT_HASH, CertificateUtil.getCertificateHash(context));
        InternalAppEventsLogger internalAppEventsLogger = new InternalAppEventsLogger(activityName, appId, null);
        internalAppEventsLogger.logEvent(AppEventsConstants.EVENT_NAME_ACTIVATED_APP, bundle);
        if (InternalAppEventsLogger.INSTANCE.getFlushBehavior() != AppEventsLogger.FlushBehavior.EXPLICIT_ONLY) {
            internalAppEventsLogger.flush();
        }
    }

    @JvmStatic
    public static final void logDeactivateApp(@NotNull String activityName, @Nullable SessionInfo sessionInfo, @Nullable String appId) {
        long jLongValue;
        String string;
        if (CrashShieldHandler.isObjectCrashing(SessionLogger.class) || sessionInfo == null) {
            return;
        }
        try {
            Long diskRestoreTime = sessionInfo.getDiskRestoreTime();
            if (diskRestoreTime != null) {
                jLongValue = diskRestoreTime.longValue();
            } else {
                Long sessionLastEventTime = sessionInfo.getSessionLastEventTime();
                jLongValue = 0 - (sessionLastEventTime != null ? sessionLastEventTime.longValue() : 0L);
            }
            if (jLongValue < 0) {
                INSTANCE.a();
                jLongValue = 0;
            }
            long sessionLength = sessionInfo.getSessionLength();
            if (sessionLength < 0) {
                INSTANCE.a();
                sessionLength = 0;
            }
            Bundle bundle = new Bundle();
            bundle.putInt(AppEventsConstants.EVENT_NAME_SESSION_INTERRUPTIONS, sessionInfo.getInterruptionCount());
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            bundle.putString(AppEventsConstants.EVENT_NAME_TIME_BETWEEN_SESSIONS, String.format(Locale.ROOT, "session_quanta_%d", Arrays.copyOf(new Object[]{Integer.valueOf(getQuantaIndex(jLongValue))}, 1)));
            SourceApplicationInfo sourceApplicationInfo = sessionInfo.getSourceApplicationInfo();
            if (sourceApplicationInfo == null || (string = sourceApplicationInfo.toString()) == null) {
                string = "Unclassified";
            }
            bundle.putString(AppEventsConstants.EVENT_PARAM_SOURCE_APPLICATION, string);
            Long sessionLastEventTime2 = sessionInfo.getSessionLastEventTime();
            bundle.putLong(Constants.LOG_TIME_APP_EVENT_KEY, (sessionLastEventTime2 != null ? sessionLastEventTime2.longValue() : 0L) / ((long) 1000));
            new InternalAppEventsLogger(activityName, appId, null).logEvent(AppEventsConstants.EVENT_NAME_DEACTIVATED_APP, sessionLength / 1000, bundle);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, SessionLogger.class);
        }
    }

    @Nullable
    public final String computePackageChecksum(@NotNull Context context) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            String str = "PCKGCHKSUM;" + packageManager.getPackageInfo(context.getPackageName(), 0).versionName;
            SharedPreferences sharedPreferences = context.getSharedPreferences(FacebookSdk.APP_EVENT_PREFERENCES, 0);
            String string = sharedPreferences.getString(str, null);
            if (string != null && string.length() == 32) {
                return string;
            }
            String strComputeChecksumWithPackageManager = HashUtils.computeChecksumWithPackageManager(context, null);
            if (strComputeChecksumWithPackageManager == null) {
                strComputeChecksumWithPackageManager = HashUtils.computeChecksum(packageManager.getApplicationInfo(context.getPackageName(), 0).sourceDir);
            }
            sharedPreferences.edit().putString(str, strComputeChecksumWithPackageManager).apply();
            return strComputeChecksumWithPackageManager;
        } catch (Exception unused) {
            return null;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }
}
