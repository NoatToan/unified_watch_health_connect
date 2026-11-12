package com.google.android.gms.location;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.DefaultClock;
import vb.h;

/* JADX INFO: loaded from: classes14.dex */
public interface Geofence {
    public static final int GEOFENCE_TRANSITION_DWELL = 4;
    public static final int GEOFENCE_TRANSITION_ENTER = 1;
    public static final int GEOFENCE_TRANSITION_EXIT = 2;
    public static final long NEVER_EXPIRE = -1;

    public static final class Builder {
        private double zze;
        private double zzf;
        private float zzg;
        private String zza = null;

        @TransitionTypes
        private int zzb = 0;
        private long zzc = Long.MIN_VALUE;
        private short zzd = -1;
        private int zzh = 0;
        private int zzi = -1;

        public Geofence build() {
            if (this.zza == null) {
                h.s("Request ID not set.");
                return null;
            }
            int i14 = this.zzb;
            if (i14 == 0) {
                h.s("Transitions types not set.");
                return null;
            }
            if ((i14 & 4) != 0 && this.zzi < 0) {
                h.s("Non-negative loitering delay needs to be set when transition types include GEOFENCE_TRANSITION_DWELL.");
                return null;
            }
            if (this.zzc == Long.MIN_VALUE) {
                h.s("Expiration not set.");
                return null;
            }
            if (this.zzd == -1) {
                h.s("Geofence region not set.");
                return null;
            }
            if (this.zzh >= 0) {
                return new com.google.android.gms.internal.location.zzbj(this.zza, this.zzb, (short) 1, this.zze, this.zzf, this.zzg, this.zzc, this.zzh, this.zzi);
            }
            h.s("Notification responsiveness should be nonnegative.");
            return null;
        }

        public Builder setCircularRegion(double d14, double d15, float f14) {
            boolean z14 = d14 >= -90.0d && d14 <= 90.0d;
            StringBuilder sb3 = new StringBuilder(42);
            sb3.append("Invalid latitude: ");
            sb3.append(d14);
            Preconditions.checkArgument(z14, sb3.toString());
            boolean z15 = d15 >= -180.0d && d15 <= 180.0d;
            StringBuilder sb4 = new StringBuilder(43);
            sb4.append("Invalid longitude: ");
            sb4.append(d15);
            Preconditions.checkArgument(z15, sb4.toString());
            boolean z16 = f14 > 0.0f;
            StringBuilder sb5 = new StringBuilder(31);
            sb5.append("Invalid radius: ");
            sb5.append(f14);
            Preconditions.checkArgument(z16, sb5.toString());
            this.zzd = (short) 1;
            this.zze = d14;
            this.zzf = d15;
            this.zzg = f14;
            return this;
        }

        public Builder setExpirationDuration(long j8) {
            if (j8 < 0) {
                this.zzc = -1L;
                return this;
            }
            this.zzc = DefaultClock.getInstance().elapsedRealtime() + j8;
            return this;
        }

        public Builder setLoiteringDelay(int i14) {
            this.zzi = i14;
            return this;
        }

        public Builder setNotificationResponsiveness(int i14) {
            this.zzh = i14;
            return this;
        }

        public Builder setRequestId(String str) {
            this.zza = (String) Preconditions.checkNotNull(str, "Request ID can't be set to null");
            return this;
        }

        public Builder setTransitionTypes(@TransitionTypes int i14) {
            this.zzb = i14;
            return this;
        }
    }

    public @interface GeofenceTransition {
    }

    public @interface TransitionTypes {
    }

    long getExpirationTime();

    double getLatitude();

    int getLoiteringDelay();

    double getLongitude();

    int getNotificationResponsiveness();

    float getRadius();

    String getRequestId();

    @TransitionTypes
    int getTransitionTypes();
}
