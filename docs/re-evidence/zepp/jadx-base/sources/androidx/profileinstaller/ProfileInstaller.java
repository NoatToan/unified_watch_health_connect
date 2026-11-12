package androidx.profileinstaller;

import android.content.Context;
import android.content.res.AssetManager;
import android.os.Build;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.WorkerThread;
import androidx.profileinstaller.DeviceProfileWriter;
import androidx.profileinstaller.ProfileInstaller;
import defpackage.jy0;
import java.io.File;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class ProfileInstaller {
    public static final int DIAGNOSTIC_CURRENT_PROFILE_DOES_NOT_EXIST = 2;
    public static final int DIAGNOSTIC_CURRENT_PROFILE_EXISTS = 1;
    public static final int DIAGNOSTIC_REF_PROFILE_DOES_NOT_EXIST = 4;
    public static final int DIAGNOSTIC_REF_PROFILE_EXISTS = 3;
    private static final DiagnosticsCallback EMPTY_DIAGNOSTICS = new DiagnosticsCallback() { // from class: androidx.profileinstaller.ProfileInstaller.1
        @Override // androidx.profileinstaller.ProfileInstaller.DiagnosticsCallback
        public void onDiagnosticReceived(int code, @Nullable Object data) {
        }

        @Override // androidx.profileinstaller.ProfileInstaller.DiagnosticsCallback
        public void onResultReceived(int code, @Nullable Object data) {
        }
    };

    @NonNull
    public static final DiagnosticsCallback LOG_DIAGNOSTICS = new DiagnosticsCallback() { // from class: androidx.profileinstaller.ProfileInstaller.2
        public static final String TAG = "ProfileInstaller";

        @Override // androidx.profileinstaller.ProfileInstaller.DiagnosticsCallback
        public void onDiagnosticReceived(int code, @Nullable Object data) {
            String str;
            if (code == 1) {
                str = "DIAGNOSTIC_CURRENT_PROFILE_EXISTS";
            } else if (code == 2) {
                str = "DIAGNOSTIC_CURRENT_PROFILE_DOES_NOT_EXIST";
            } else if (code != 3) {
                str = code != 4 ? "" : "DIAGNOSTIC_REF_PROFILE_DOES_NOT_EXIST";
            } else {
                str = "DIAGNOSTIC_REF_PROFILE_EXISTS";
            }
            Log.d(TAG, str);
        }

        @Override // androidx.profileinstaller.ProfileInstaller.DiagnosticsCallback
        public void onResultReceived(int code, @Nullable Object data) {
            String str;
            switch (code) {
                case 1:
                    str = "RESULT_INSTALL_SUCCESS";
                    break;
                case 2:
                    str = "RESULT_ALREADY_INSTALLED";
                    break;
                case 3:
                    str = "RESULT_UNSUPPORTED_ART_VERSION";
                    break;
                case 4:
                    str = "RESULT_NOT_WRITABLE";
                    break;
                case 5:
                    str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                    break;
                case 6:
                    str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                    break;
                case 7:
                    str = "RESULT_IO_EXCEPTION";
                    break;
                case 8:
                    str = "RESULT_PARSE_EXCEPTION";
                    break;
                default:
                    str = "";
                    break;
            }
            if (code == 6 || code == 7 || code == 8) {
                Log.e(TAG, str, (Throwable) data);
            } else {
                Log.d(TAG, str);
            }
        }
    };
    private static final int MIN_MEANINGFUL_LENGTH = 10;
    private static final String PROFILE_BASE_DIR = "/data/misc/profiles/cur/0";
    private static final String PROFILE_FILE = "primary.prof";
    private static final String PROFILE_REF_BASE_DIR = "/data/misc/profiles/ref";
    private static final String PROFILE_SOURCE_LOCATION = "dexopt/baseline.prof";
    public static final int RESULT_ALREADY_INSTALLED = 2;
    public static final int RESULT_BASELINE_PROFILE_NOT_FOUND = 6;
    public static final int RESULT_DESIRED_FORMAT_UNSUPPORTED = 5;
    public static final int RESULT_INSTALL_SUCCESS = 1;
    public static final int RESULT_IO_EXCEPTION = 7;
    public static final int RESULT_NOT_WRITABLE = 4;
    public static final int RESULT_PARSE_EXCEPTION = 8;
    public static final int RESULT_UNSUPPORTED_ART_VERSION = 3;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public @interface DiagnosticCode {
    }

    public interface DiagnosticsCallback {
        void onDiagnosticReceived(int code, @Nullable Object data);

        void onResultReceived(int code, @Nullable Object data);
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public @interface ResultCode {
    }

    private ProfileInstaller() {
    }

    public static void diagnostic(@NonNull Executor executor, @NonNull final DiagnosticsCallback diagnostics, final int code, @Nullable final Object data) {
        executor.execute(new Runnable() { // from class: y36
            @Override // java.lang.Runnable
            public final void run() {
                diagnostics.onDiagnosticReceived(code, data);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$transcodeAndWrite$2(Executor executor, DiagnosticsCallback diagnosticsCallback, long j, DeviceProfileWriter.ExistingProfileState existingProfileState) {
        return shouldSkipInstall(executor, diagnosticsCallback, j, existingProfileState.hasCurFile(), existingProfileState.getCurLength(), existingProfileState.hasRefFile(), existingProfileState.getRefLength());
    }

    public static void result(@NonNull Executor executor, @NonNull final DiagnosticsCallback diagnostics, final int code, @Nullable final Object data) {
        executor.execute(new Runnable() { // from class: z36
            @Override // java.lang.Runnable
            public final void run() {
                diagnostics.onResultReceived(code, data);
            }
        });
    }

    public static boolean shouldSkipInstall(@NonNull Executor executor, @NonNull DiagnosticsCallback diagnostics, long baselineLength, boolean curExists, long curLength, boolean refExists, long refLength) {
        if (!curExists || curLength <= 10) {
            diagnostic(executor, diagnostics, 2, null);
        } else {
            diagnostic(executor, diagnostics, 1, null);
        }
        if (!refExists || refLength <= 10) {
            diagnostic(executor, diagnostics, 4, null);
        } else {
            diagnostic(executor, diagnostics, 3, null);
        }
        if (baselineLength > 0 && baselineLength == curLength) {
            result(executor, diagnostics, 2, null);
            return true;
        }
        if (baselineLength > 0 && baselineLength == refLength) {
            result(executor, diagnostics, 2, null);
            return true;
        }
        if (baselineLength <= 0) {
            return false;
        }
        if (baselineLength >= curLength && baselineLength >= refLength) {
            return false;
        }
        result(executor, diagnostics, 2, null);
        return true;
    }

    private static void transcodeAndWrite(@NonNull AssetManager assets, @NonNull String packageName, @NonNull String apkName, @NonNull final Executor executor, @NonNull final DiagnosticsCallback diagnostics) {
        if (Build.VERSION.SDK_INT < 19) {
            result(executor, diagnostics, 3, null);
            return;
        }
        DeviceProfileWriter deviceProfileWriter = new DeviceProfileWriter(assets, executor, diagnostics, apkName, PROFILE_SOURCE_LOCATION, new File(new File(PROFILE_BASE_DIR, packageName), PROFILE_FILE), new File(new File(PROFILE_REF_BASE_DIR, packageName), PROFILE_FILE));
        if (deviceProfileWriter.deviceAllowsProfileInstallerAotWrites()) {
            DeviceProfileWriter.SkipStrategy skipStrategy = new DeviceProfileWriter.SkipStrategy() { // from class: x36
                @Override // androidx.profileinstaller.DeviceProfileWriter.SkipStrategy
                public final boolean shouldSkip(long j, DeviceProfileWriter.ExistingProfileState existingProfileState) {
                    return ProfileInstaller.lambda$transcodeAndWrite$2(executor, diagnostics, j, existingProfileState);
                }
            };
            deviceProfileWriter.copyProfileOrRead(skipStrategy).transcodeIfNeeded().writeIfNeeded(skipStrategy);
        }
    }

    @WorkerThread
    public static void writeProfile(@NonNull Context context) {
        writeProfile(context, jy0.a, EMPTY_DIAGNOSTICS);
    }

    @WorkerThread
    public static void writeProfile(@NonNull Context context, @NonNull Executor executor, @NonNull DiagnosticsCallback diagnostics) {
        Context applicationContext = context.getApplicationContext();
        transcodeAndWrite(applicationContext.getAssets(), applicationContext.getPackageName(), new File(applicationContext.getApplicationInfo().sourceDir).getName(), executor, diagnostics);
    }
}
