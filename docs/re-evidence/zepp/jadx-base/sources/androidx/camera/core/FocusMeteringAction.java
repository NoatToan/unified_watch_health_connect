package androidx.camera.core;

import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.core.util.Preconditions;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class FocusMeteringAction {
    public static final long DEFAULT_AUTOCANCEL_DURATION = 5000;
    public static final int DEFAULT_METERING_MODE = 7;
    public static final int FLAG_AE = 2;
    public static final int FLAG_AF = 1;
    public static final int FLAG_AWB = 4;
    private final long mAutoCancelDurationInMillis;
    private final List<MeteringPoint> mMeteringPointsAe;
    private final List<MeteringPoint> mMeteringPointsAf;
    private final List<MeteringPoint> mMeteringPointsAwb;

    public static class Builder {
        public long mAutoCancelDurationInMillis;
        public final List<MeteringPoint> mMeteringPointsAe;
        public final List<MeteringPoint> mMeteringPointsAf;
        public final List<MeteringPoint> mMeteringPointsAwb;

        public Builder(@NonNull MeteringPoint point) {
            this(point, 7);
        }

        @NonNull
        public Builder addPoint(@NonNull MeteringPoint point) {
            return addPoint(point, 7);
        }

        @NonNull
        public FocusMeteringAction build() {
            return new FocusMeteringAction(this);
        }

        @NonNull
        public Builder disableAutoCancel() {
            this.mAutoCancelDurationInMillis = 0L;
            return this;
        }

        @NonNull
        public Builder setAutoCancelDuration(@IntRange(from = 1) long duration, @NonNull TimeUnit timeUnit) {
            Preconditions.checkArgument(duration >= 1, "autoCancelDuration must be at least 1");
            this.mAutoCancelDurationInMillis = timeUnit.toMillis(duration);
            return this;
        }

        public Builder(@NonNull MeteringPoint point, int meteringMode) {
            this.mMeteringPointsAf = new ArrayList();
            this.mMeteringPointsAe = new ArrayList();
            this.mMeteringPointsAwb = new ArrayList();
            this.mAutoCancelDurationInMillis = 5000L;
            addPoint(point, meteringMode);
        }

        @NonNull
        public Builder addPoint(@NonNull MeteringPoint point, int meteringMode) {
            boolean z = false;
            Preconditions.checkArgument(point != null, "Point cannot be null.");
            if (meteringMode >= 1 && meteringMode <= 7) {
                z = true;
            }
            Preconditions.checkArgument(z, "Invalid metering mode " + meteringMode);
            if ((meteringMode & 1) != 0) {
                this.mMeteringPointsAf.add(point);
            }
            if ((meteringMode & 2) != 0) {
                this.mMeteringPointsAe.add(point);
            }
            if ((meteringMode & 4) != 0) {
                this.mMeteringPointsAwb.add(point);
            }
            return this;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface MeteringMode {
    }

    public FocusMeteringAction(Builder builder) {
        this.mMeteringPointsAf = Collections.unmodifiableList(builder.mMeteringPointsAf);
        this.mMeteringPointsAe = Collections.unmodifiableList(builder.mMeteringPointsAe);
        this.mMeteringPointsAwb = Collections.unmodifiableList(builder.mMeteringPointsAwb);
        this.mAutoCancelDurationInMillis = builder.mAutoCancelDurationInMillis;
    }

    public long getAutoCancelDurationInMillis() {
        return this.mAutoCancelDurationInMillis;
    }

    @NonNull
    public List<MeteringPoint> getMeteringPointsAe() {
        return this.mMeteringPointsAe;
    }

    @NonNull
    public List<MeteringPoint> getMeteringPointsAf() {
        return this.mMeteringPointsAf;
    }

    @NonNull
    public List<MeteringPoint> getMeteringPointsAwb() {
        return this.mMeteringPointsAwb;
    }

    public boolean isAutoCancelEnabled() {
        return this.mAutoCancelDurationInMillis > 0;
    }
}
