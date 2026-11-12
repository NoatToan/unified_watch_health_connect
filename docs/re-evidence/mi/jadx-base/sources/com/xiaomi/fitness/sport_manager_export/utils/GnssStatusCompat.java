package com.xiaomi.fitness.sport_manager_export.utils;

import android.annotation.SuppressLint;
import android.location.GnssStatus;
import android.location.LocationManager;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.RequiresApi;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import defpackage.e3b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000*\u0001\u0012\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0010\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0016H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0014\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0002X\u0083\u0004¢\u0006\u0004\n\u0002\u0010\u0013¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/fitness/sport_manager_export/utils/GnssStatusCompat;", "", "<init>", "()V", "TAG", "", "accuracyStatus", "", "getAccuracyStatus", "()I", "setAccuracyStatus", "(I)V", "registerGnssStatusCallback", "", "lm", "Landroid/location/LocationManager;", "unregisterGnssStatusCallback", "gnssStatusCallback", "com/xiaomi/fitness/sport_manager_export/utils/GnssStatusCompat$gnssStatusCallback$1", "Lcom/xiaomi/fitness/sport_manager_export/utils/GnssStatusCompat$gnssStatusCallback$1;", "getGnssAccuracyStatus", "status", "Landroid/location/GnssStatus;", "sport-manager-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GnssStatusCompat {

    @NotNull
    private static final String TAG = "GnssStatusUtils";
    private static int accuracyStatus;

    @NotNull
    public static final GnssStatusCompat INSTANCE = new GnssStatusCompat();

    @SuppressLint({"NewApi"})
    @Nullable
    private static final GnssStatusCompat$gnssStatusCallback$1 gnssStatusCallback = new GnssStatus.Callback() { // from class: com.xiaomi.fitness.sport_manager_export.utils.GnssStatusCompat$gnssStatusCallback$1
        @Override // android.location.GnssStatus.Callback
        public void onFirstFix(int ttffMillis) {
            super.onFirstFix(ttffMillis);
            FitnessLogUtils.i("GnssStatusUtils", "ttffMillis:" + ttffMillis);
        }

        @Override // android.location.GnssStatus.Callback
        public void onSatelliteStatusChanged(GnssStatus status) {
            Intrinsics.checkNotNullParameter(status, "status");
            super.onSatelliteStatusChanged(status);
            FitnessLogUtils.d("GnssStatusUtils", "satelliteCount:" + status.getSatelliteCount());
            GnssStatusCompat gnssStatusCompat = GnssStatusCompat.INSTANCE;
            gnssStatusCompat.setAccuracyStatus(gnssStatusCompat.getGnssAccuracyStatus(status));
        }

        @Override // android.location.GnssStatus.Callback
        public void onStarted() {
            super.onStarted();
            FitnessLogUtils.i("GnssStatusUtils", "onStarted");
        }

        @Override // android.location.GnssStatus.Callback
        public void onStopped() {
            super.onStopped();
            FitnessLogUtils.i("GnssStatusUtils", "onStopped");
        }
    };

    private GnssStatusCompat() {
    }

    public final int getAccuracyStatus() {
        return accuracyStatus;
    }

    @RequiresApi(api = 24)
    public final int getGnssAccuracyStatus(@NotNull GnssStatus status) {
        Intrinsics.checkNotNullParameter(status, "status");
        int satelliteCount = status.getSatelliteCount();
        int i = 0;
        for (int i2 = 0; i2 < satelliteCount; i2++) {
            if (status.usedInFix(i2)) {
                i++;
            }
        }
        return e3b.c(i);
    }

    @RequiresApi(api = 24)
    @SuppressLint({"MissingPermission"})
    public final void registerGnssStatusCallback(@NotNull LocationManager lm) {
        Intrinsics.checkNotNullParameter(lm, "lm");
        GnssStatusCompat$gnssStatusCallback$1 gnssStatusCompat$gnssStatusCallback$1 = gnssStatusCallback;
        if (gnssStatusCompat$gnssStatusCallback$1 != null) {
            lm.registerGnssStatusCallback(gnssStatusCompat$gnssStatusCallback$1, new Handler(Looper.getMainLooper()));
        }
    }

    public final void setAccuracyStatus(int i) {
        accuracyStatus = i;
    }

    @RequiresApi(api = 24)
    @SuppressLint({"MissingPermission"})
    public final void unregisterGnssStatusCallback(@NotNull LocationManager lm) {
        Intrinsics.checkNotNullParameter(lm, "lm");
        GnssStatusCompat$gnssStatusCallback$1 gnssStatusCompat$gnssStatusCallback$1 = gnssStatusCallback;
        if (gnssStatusCompat$gnssStatusCallback$1 != null) {
            lm.unregisterGnssStatusCallback(gnssStatusCompat$gnssStatusCallback$1);
        }
    }
}
