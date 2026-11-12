package com.google.android.gms.gcm;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.v;
import vb.h;

/* JADX INFO: loaded from: classes14.dex */
public class OneoffTask extends Task {
    public static final Parcelable.Creator<OneoffTask> CREATOR = new zzi();
    private final long zzal;
    private final long zzam;

    private OneoffTask(Builder builder) {
        super(builder);
        this.zzal = builder.zzal;
        this.zzam = builder.zzam;
    }

    public long getWindowEnd() {
        return this.zzam;
    }

    public long getWindowStart() {
        return this.zzal;
    }

    @Override // com.google.android.gms.gcm.Task
    public void toBundle(Bundle bundle) {
        super.toBundle(bundle);
        bundle.putLong("window_start", this.zzal);
        bundle.putLong("window_end", this.zzam);
    }

    public String toString() {
        String string = super.toString();
        long windowStart = getWindowStart();
        long windowEnd = getWindowEnd();
        StringBuilder sb3 = new StringBuilder(v.a(64, string));
        sb3.append(string);
        sb3.append(" windowStart=");
        sb3.append(windowStart);
        sb3.append(" windowEnd=");
        sb3.append(windowEnd);
        return sb3.toString();
    }

    @Override // com.google.android.gms.gcm.Task, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i14) {
        super.writeToParcel(parcel, i14);
        parcel.writeLong(this.zzal);
        parcel.writeLong(this.zzam);
    }

    public static class Builder extends Task.Builder {
        private long zzal = -1;
        private long zzam = -1;

        public Builder() {
            this.isPersisted = false;
        }

        @Override // com.google.android.gms.gcm.Task.Builder
        public OneoffTask build() {
            checkConditions();
            return new OneoffTask(this, (zzi) null);
        }

        @Override // com.google.android.gms.gcm.Task.Builder
        public void checkConditions() {
            super.checkConditions();
            long j8 = this.zzal;
            if (j8 != -1) {
                long j14 = this.zzam;
                if (j14 != -1) {
                    if (j8 < j14) {
                        return;
                    }
                    h.s("Window start must be shorter than window end.");
                    return;
                }
            }
            h.s("Must specify an execution window using setExecutionWindow.");
        }

        public Builder setExecutionWindow(long j8, long j14) {
            this.zzal = j8;
            this.zzam = j14;
            return this;
        }

        @Override // com.google.android.gms.gcm.Task.Builder
        public Builder setService(Class<? extends GcmTaskService> cls) {
            this.gcmTaskService = cls.getName();
            return this;
        }

        @Override // com.google.android.gms.gcm.Task.Builder
        public Builder setExtras(Bundle bundle) {
            this.extras = bundle;
            return this;
        }

        @Override // com.google.android.gms.gcm.Task.Builder
        public Builder setPersisted(boolean z14) {
            this.isPersisted = z14;
            return this;
        }

        @Override // com.google.android.gms.gcm.Task.Builder
        public Builder setRequiredNetwork(int i14) {
            this.requiredNetworkState = i14;
            return this;
        }

        @Override // com.google.android.gms.gcm.Task.Builder
        public Builder setRequiresCharging(boolean z14) {
            this.requiresCharging = z14;
            return this;
        }

        @Override // com.google.android.gms.gcm.Task.Builder
        public Builder setTag(String str) {
            this.tag = str;
            return this;
        }

        @Override // com.google.android.gms.gcm.Task.Builder
        public Builder setUpdateCurrent(boolean z14) {
            this.updateCurrent = z14;
            return this;
        }

        @Override // com.google.android.gms.gcm.Task.Builder
        public /* bridge */ /* synthetic */ Task.Builder setService(Class cls) {
            return setService((Class<? extends GcmTaskService>) cls);
        }
    }

    @Deprecated
    private OneoffTask(Parcel parcel) {
        super(parcel);
        this.zzal = parcel.readLong();
        this.zzam = parcel.readLong();
    }

    public /* synthetic */ OneoffTask(Parcel parcel, zzi zziVar) {
        this(parcel);
    }

    public /* synthetic */ OneoffTask(Builder builder, zzi zziVar) {
        this(builder);
    }
}
