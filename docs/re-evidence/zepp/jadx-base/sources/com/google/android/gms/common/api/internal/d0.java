package com.google.android.gms.common.api.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.RootTelemetryConfigManager;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.internal.zao;
import com.google.android.gms.common.util.ArrayUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes3.dex */
final class d0<T> implements OnCompleteListener<T> {
    private final GoogleApiManager a;
    private final int b;
    private final ApiKey<?> c;
    private final long d;

    @VisibleForTesting
    private d0(GoogleApiManager googleApiManager, int i, ApiKey<?> apiKey, long j) {
        this.a = googleApiManager;
        this.b = i;
        this.c = apiKey;
        this.d = j;
    }

    @Nullable
    public static <T> d0<T> a(GoogleApiManager googleApiManager, int i, ApiKey<?> apiKey) {
        if (!googleApiManager.n()) {
            return null;
        }
        boolean methodTimingTelemetryEnabled = true;
        RootTelemetryConfiguration config = RootTelemetryConfigManager.getInstance().getConfig();
        if (config != null) {
            if (!config.getMethodInvocationTelemetryEnabled()) {
                return null;
            }
            methodTimingTelemetryEnabled = config.getMethodTimingTelemetryEnabled();
            GoogleApiManager.zaa zaaVarC = googleApiManager.c(apiKey);
            if (zaaVarC != null && zaaVarC.zab().isConnected() && (zaaVarC.zab() instanceof BaseGmsClient)) {
                ConnectionTelemetryConfiguration connectionTelemetryConfigurationB = b(zaaVarC, i);
                if (connectionTelemetryConfigurationB == null) {
                    return null;
                }
                zaaVarC.x();
                methodTimingTelemetryEnabled = connectionTelemetryConfigurationB.getMethodTimingTelemetryEnabled();
            }
        }
        return new d0<>(googleApiManager, i, apiKey, methodTimingTelemetryEnabled ? System.currentTimeMillis() : 0L);
    }

    @Nullable
    private static ConnectionTelemetryConfiguration b(GoogleApiManager.zaa<?> zaaVar, int i) {
        int[] methodInvocationMethodKeyAllowlist;
        ConnectionTelemetryConfiguration telemetryConfiguration = ((BaseGmsClient) zaaVar.zab()).getTelemetryConfiguration();
        if (telemetryConfiguration != null) {
            boolean z = false;
            if (telemetryConfiguration.getMethodInvocationTelemetryEnabled() && ((methodInvocationMethodKeyAllowlist = telemetryConfiguration.getMethodInvocationMethodKeyAllowlist()) == null || ArrayUtils.contains(methodInvocationMethodKeyAllowlist, i))) {
                z = true;
            }
            if (z && zaaVar.w() < telemetryConfiguration.getMaxMethodInvocationsLogged()) {
                return telemetryConfiguration;
            }
        }
        return null;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    @WorkerThread
    public final void onComplete(@NonNull Task<T> task) {
        int batchPeriodMillis;
        int i;
        int i2;
        int i3;
        int errorCode;
        long j;
        long jCurrentTimeMillis;
        if (this.a.n()) {
            boolean methodTimingTelemetryEnabled = this.d > 0;
            RootTelemetryConfiguration config = RootTelemetryConfigManager.getInstance().getConfig();
            if (config == null) {
                batchPeriodMillis = 5000;
                i = 0;
                i2 = 100;
            } else {
                if (!config.getMethodInvocationTelemetryEnabled()) {
                    return;
                }
                methodTimingTelemetryEnabled &= config.getMethodTimingTelemetryEnabled();
                batchPeriodMillis = config.getBatchPeriodMillis();
                int maxMethodInvocationsInBatch = config.getMaxMethodInvocationsInBatch();
                int version = config.getVersion();
                GoogleApiManager.zaa zaaVarC = this.a.c(this.c);
                if (zaaVarC != null && zaaVarC.zab().isConnected() && (zaaVarC.zab() instanceof BaseGmsClient)) {
                    ConnectionTelemetryConfiguration connectionTelemetryConfigurationB = b(zaaVarC, this.b);
                    if (connectionTelemetryConfigurationB == null) {
                        return;
                    }
                    boolean z = connectionTelemetryConfigurationB.getMethodTimingTelemetryEnabled() && this.d > 0;
                    maxMethodInvocationsInBatch = connectionTelemetryConfigurationB.getMaxMethodInvocationsLogged();
                    methodTimingTelemetryEnabled = z;
                }
                i = version;
                i2 = maxMethodInvocationsInBatch;
            }
            GoogleApiManager googleApiManager = this.a;
            if (task.isSuccessful()) {
                i3 = 0;
                errorCode = 0;
            } else {
                if (task.isCanceled()) {
                    i3 = 100;
                } else {
                    Exception exception = task.getException();
                    if (exception instanceof ApiException) {
                        Status status = ((ApiException) exception).getStatus();
                        int statusCode = status.getStatusCode();
                        ConnectionResult connectionResult = status.getConnectionResult();
                        errorCode = connectionResult == null ? -1 : connectionResult.getErrorCode();
                        i3 = statusCode;
                    } else {
                        i3 = 101;
                    }
                }
                errorCode = -1;
            }
            if (methodTimingTelemetryEnabled) {
                j = this.d;
                jCurrentTimeMillis = System.currentTimeMillis();
            } else {
                j = 0;
                jCurrentTimeMillis = 0;
            }
            googleApiManager.d(new zao(this.b, i3, errorCode, j, jCurrentTimeMillis), i, batchPeriodMillis, i2);
        }
    }
}
