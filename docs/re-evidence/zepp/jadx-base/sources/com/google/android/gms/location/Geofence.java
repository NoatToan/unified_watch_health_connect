package com.google.android.gms.location;

import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.util.VisibleForTesting;

/* JADX INFO: loaded from: classes3.dex */
@VisibleForTesting
public interface Geofence {
    public static final int GEOFENCE_TRANSITION_DWELL = 4;
    public static final int GEOFENCE_TRANSITION_ENTER = 1;
    public static final int GEOFENCE_TRANSITION_EXIT = 2;
    public static final long NEVER_EXPIRE = -1;

    @VisibleForTesting
    public static final class Builder {
        private double e;
        private double f;
        private float g;
        private String a = null;

        @TransitionTypes
        private int b = 0;
        private long c = Long.MIN_VALUE;
        private short d = -1;
        private int h = 0;
        private int i = -1;

        @RecentlyNonNull
        public Geofence build() {
            String str = this.a;
            if (str == null) {
                throw new IllegalArgumentException("Request ID not set.");
            }
            int i = this.b;
            if (i == 0) {
                throw new IllegalArgumentException("Transitions types not set.");
            }
            if ((i & 4) != 0 && this.i < 0) {
                throw new IllegalArgumentException("Non-negative loitering delay needs to be set when transition types include GEOFENCE_TRANSITION_DWELLING.");
            }
            long j = this.c;
            if (j == Long.MIN_VALUE) {
                throw new IllegalArgumentException("Expiration not set.");
            }
            if (this.d == -1) {
                throw new IllegalArgumentException("Geofence region not set.");
            }
            int i2 = this.h;
            if (i2 >= 0) {
                return new com.google.android.gms.internal.location.zzbe(str, i, (short) 1, this.e, this.f, this.g, j, i2, this.i);
            }
            throw new IllegalArgumentException("Notification responsiveness should be nonnegative.");
        }

        @RecentlyNonNull
        public Builder setCircularRegion(@FloatRange(from = -90.0d, to = 90.0d) double d, @FloatRange(from = -180.0d, to = 180.0d) double d2, @FloatRange(from = 0.0d, fromInclusive = false) float f) {
            boolean z = d >= -90.0d && d <= 90.0d;
            StringBuilder sb = new StringBuilder(42);
            sb.append("Invalid latitude: ");
            sb.append(d);
            Preconditions.checkArgument(z, sb.toString());
            boolean z2 = d2 >= -180.0d && d2 <= 180.0d;
            StringBuilder sb2 = new StringBuilder(43);
            sb2.append("Invalid longitude: ");
            sb2.append(d2);
            Preconditions.checkArgument(z2, sb2.toString());
            boolean z3 = f > 0.0f;
            StringBuilder sb3 = new StringBuilder(31);
            sb3.append("Invalid radius: ");
            sb3.append(f);
            Preconditions.checkArgument(z3, sb3.toString());
            this.d = (short) 1;
            this.e = d;
            this.f = d2;
            this.g = f;
            return this;
        }

        @RecentlyNonNull
        public Builder setExpirationDuration(long j) {
            if (j < 0) {
                this.c = -1L;
            } else {
                this.c = DefaultClock.getInstance().elapsedRealtime() + j;
            }
            return this;
        }

        @RecentlyNonNull
        public Builder setLoiteringDelay(int i) {
            this.i = i;
            return this;
        }

        @RecentlyNonNull
        public Builder setNotificationResponsiveness(@IntRange(from = 0) int i) {
            this.h = i;
            return this;
        }

        @RecentlyNonNull
        public Builder setRequestId(@RecentlyNonNull String str) {
            this.a = (String) Preconditions.checkNotNull(str, "Request ID can't be set to null");
            return this;
        }

        @RecentlyNonNull
        public Builder setTransitionTypes(@TransitionTypes int i) {
            this.b = i;
            return this;
        }
    }

    public @interface GeofenceTransition {
    }

    public @interface TransitionTypes {
    }

    @RecentlyNonNull
    String getRequestId();
}
