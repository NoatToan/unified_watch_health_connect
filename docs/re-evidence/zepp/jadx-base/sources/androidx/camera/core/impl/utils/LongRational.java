package androidx.camera.core.impl.utils;

import androidx.annotation.NonNull;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;

/* JADX INFO: loaded from: classes.dex */
final class LongRational {
    private final long mDenominator;
    private final long mNumerator;

    public LongRational(long nominator, long denominator) {
        this.mNumerator = nominator;
        this.mDenominator = denominator;
    }

    public long getDenominator() {
        return this.mDenominator;
    }

    public long getNumerator() {
        return this.mNumerator;
    }

    public double toDouble() {
        return this.mNumerator / this.mDenominator;
    }

    @NonNull
    public String toString() {
        return this.mNumerator + FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE + this.mDenominator;
    }

    public LongRational(double value) {
        this((long) (value * 10000.0d), 10000L);
    }
}
