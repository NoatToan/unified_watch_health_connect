package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes21.dex */
public class ActivityTransition extends AbstractSafeParcelable {
    public static final int ACTIVITY_TRANSITION_ENTER = 0;
    public static final int ACTIVITY_TRANSITION_EXIT = 1;
    public static final Parcelable.Creator<ActivityTransition> CREATOR = new zzc();
    private final int zzi;
    private final int zzj;

    /* JADX INFO: loaded from: classes3.dex */
    @Retention(RetentionPolicy.SOURCE)
    public @interface SupportedActivityTransition {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, getActivityType());
        SafeParcelWriter.writeInt(parcel, 2, getTransitionType());
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public String toString() {
        int i = this.zzi;
        int i2 = this.zzj;
        StringBuilder sb = new StringBuilder(75);
        sb.append("ActivityTransition [mActivityType=");
        sb.append(i);
        sb.append(", mTransitionType=");
        sb.append(i2);
        sb.append(']');
        return sb.toString();
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zzi), Integer.valueOf(this.zzj));
    }

    public int getTransitionType() {
        return this.zzj;
    }

    public static class Builder {
        private int zzi = -1;
        private int zzj = -1;

        public Builder setActivityType(int i) {
            DetectedActivity.zzb(i);
            this.zzi = i;
            return this;
        }

        public Builder setActivityTransition(int i) {
            ActivityTransition.zza(i);
            this.zzj = i;
            return this;
        }

        public ActivityTransition build() {
            Preconditions.checkState(this.zzi != -1, "Activity type not set.");
            Preconditions.checkState(this.zzj != -1, "Activity transition type not set.");
            return new ActivityTransition(this.zzi, this.zzj);
        }
    }

    public int getActivityType() {
        return this.zzi;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivityTransition)) {
            return false;
        }
        ActivityTransition activityTransition = (ActivityTransition) obj;
        return this.zzi == activityTransition.zzi && this.zzj == activityTransition.zzj;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0006  */
    public static void zza(int i) {
        boolean z;
        if (i >= 0) {
            z = i <= 1;
        }
        StringBuilder sb = new StringBuilder(41);
        sb.append("Transition type ");
        sb.append(i);
        sb.append(" is not valid.");
        Preconditions.checkArgument(z, sb.toString());
    }

    ActivityTransition(int i, int i2) {
        this.zzi = i;
        this.zzj = i2;
    }
}
