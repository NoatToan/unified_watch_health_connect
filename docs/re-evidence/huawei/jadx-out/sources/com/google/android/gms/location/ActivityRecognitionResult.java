package com.google.android.gms.location;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public class ActivityRecognitionResult extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<ActivityRecognitionResult> CREATOR = new zzb();
    private Bundle extras;
    private List<DetectedActivity> zze;
    private long zzf;
    private long zzg;
    private int zzh;

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedList(parcel, 1, this.zze, false);
        SafeParcelWriter.writeLong(parcel, 2, this.zzf);
        SafeParcelWriter.writeLong(parcel, 3, this.zzg);
        SafeParcelWriter.writeInt(parcel, 4, this.zzh);
        SafeParcelWriter.writeBundle(parcel, 5, this.extras, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public String toString() {
        String strValueOf = String.valueOf(this.zze);
        long j = this.zzf;
        long j2 = this.zzg;
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 124);
        sb.append("ActivityRecognitionResult [probableActivities=");
        sb.append(strValueOf);
        sb.append(", timeMillis=");
        sb.append(j);
        sb.append(", elapsedRealtimeMillis=");
        sb.append(j2);
        sb.append("]");
        return sb.toString();
    }

    public int hashCode() {
        long j = this.zzf;
        long j2 = this.zzg;
        int i = this.zzh;
        return Objects.hashCode(Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i), this.zze, this.extras);
    }

    public long getTime() {
        return this.zzf;
    }

    public List<DetectedActivity> getProbableActivities() {
        return this.zze;
    }

    public DetectedActivity getMostProbableActivity() {
        return this.zze.get(0);
    }

    public long getElapsedRealtimeMillis() {
        return this.zzg;
    }

    public int getActivityConfidence(int i) {
        for (DetectedActivity detectedActivity : this.zze) {
            if (detectedActivity.getType() == i) {
                return detectedActivity.getConfidence();
            }
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ActivityRecognitionResult activityRecognitionResult = (ActivityRecognitionResult) obj;
        return this.zzf == activityRecognitionResult.zzf && this.zzg == activityRecognitionResult.zzg && this.zzh == activityRecognitionResult.zzh && Objects.equal(this.zze, activityRecognitionResult.zze) && zza(this.extras, activityRecognitionResult.extras);
    }

    private static boolean zza(Bundle bundle, Bundle bundle2) {
        if (bundle == null && bundle2 == null) {
            return true;
        }
        if ((bundle == null && bundle2 != null) || ((bundle != null && bundle2 == null) || bundle.size() != bundle2.size())) {
            return false;
        }
        for (String str : bundle.keySet()) {
            if (!bundle2.containsKey(str)) {
                return false;
            }
            if (bundle.get(str) == null) {
                if (bundle2.get(str) != null) {
                    return false;
                }
            } else if (bundle.get(str) instanceof Bundle) {
                if (!zza(bundle.getBundle(str), bundle2.getBundle(str))) {
                    return false;
                }
            } else if (!bundle.get(str).equals(bundle2.get(str))) {
                return false;
            }
        }
        return true;
    }

    private static List<ActivityRecognitionResult> zza(Intent intent) {
        if (intent != null && intent.hasExtra("com.google.android.location.internal.EXTRA_ACTIVITY_RESULT_LIST")) {
            return SafeParcelableSerializer.deserializeIterableFromIntentExtra(intent, "com.google.android.location.internal.EXTRA_ACTIVITY_RESULT_LIST", CREATOR);
        }
        return null;
    }

    public static boolean hasResult(Intent intent) {
        if (intent == null) {
            return false;
        }
        if (intent != null && intent.hasExtra("com.google.android.location.internal.EXTRA_ACTIVITY_RESULT")) {
            return true;
        }
        List<ActivityRecognitionResult> listZza = zza(intent);
        return (listZza == null || listZza.isEmpty()) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    public static ActivityRecognitionResult extractResult(Intent intent) {
        ActivityRecognitionResult activityRecognitionResult;
        if (hasResult(intent)) {
            Object objDeserializeFromBytes = intent.getExtras().get("com.google.android.location.internal.EXTRA_ACTIVITY_RESULT");
            if (objDeserializeFromBytes instanceof byte[]) {
                objDeserializeFromBytes = SafeParcelableSerializer.deserializeFromBytes((byte[]) objDeserializeFromBytes, CREATOR);
            } else if (!(objDeserializeFromBytes instanceof ActivityRecognitionResult)) {
                activityRecognitionResult = null;
            }
            activityRecognitionResult = (ActivityRecognitionResult) objDeserializeFromBytes;
        } else {
            activityRecognitionResult = null;
        }
        if (activityRecognitionResult != null) {
            return activityRecognitionResult;
        }
        List<ActivityRecognitionResult> listZza = zza(intent);
        if (listZza == null || listZza.isEmpty()) {
            return null;
        }
        return listZza.get(listZza.size() - 1);
    }

    public ActivityRecognitionResult(List<DetectedActivity> list, long j, long j2, int i, Bundle bundle) {
        boolean z = false;
        Preconditions.checkArgument(list != null && list.size() > 0, "Must have at least 1 detected activity");
        if (j > 0 && j2 > 0) {
            z = true;
        }
        Preconditions.checkArgument(z, "Must set times");
        this.zze = list;
        this.zzf = j;
        this.zzg = j2;
        this.zzh = i;
        this.extras = bundle;
    }

    public ActivityRecognitionResult(List<DetectedActivity> list, long j, long j2) {
        this(list, j, j2, 0, (Bundle) null);
    }

    private ActivityRecognitionResult(DetectedActivity detectedActivity, long j, long j2, int i, Bundle bundle) {
        this((List<DetectedActivity>) Collections.singletonList(detectedActivity), j, j2, 0, (Bundle) null);
    }

    public ActivityRecognitionResult(DetectedActivity detectedActivity, long j, long j2) {
        this(detectedActivity, j, j2, 0, (Bundle) null);
    }
}
