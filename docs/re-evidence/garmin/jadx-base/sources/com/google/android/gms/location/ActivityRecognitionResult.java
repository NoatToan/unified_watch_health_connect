package com.google.android.gms.location;

import am.j;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import com.google.android.gms.common.util.VisibleForTesting;
import com.nimbusds.jose.shaded.gson.internal.a;
import java.lang.reflect.Array;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
@SafeParcelable.Class(creator = "ActivityRecognitionResultCreator")
@SafeParcelable.Reserved({1000})
public class ActivityRecognitionResult extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<ActivityRecognitionResult> CREATOR = new zzn();

    @SafeParcelable.Field(id = 1)
    List zza;

    @SafeParcelable.Field(id = 2)
    long zzb;

    @SafeParcelable.Field(id = 3)
    long zzc;

    @SafeParcelable.Field(id = 4)
    int zzd;

    @SafeParcelable.Field(id = 5)
    Bundle zze;

    @ShowFirstParty
    @SafeParcelable.Constructor
    public ActivityRecognitionResult(@SafeParcelable.Param(id = 1) List list, @SafeParcelable.Param(id = 2) long j8, @SafeParcelable.Param(id = 3) long j14, @SafeParcelable.Param(id = 4) int i14, @SafeParcelable.Param(id = 5) Bundle bundle) {
        Preconditions.checkArgument(list != null && list.size() > 0, "Must have at least 1 detected activity");
        Preconditions.checkArgument(j8 > 0 && j14 > 0, "Must set times");
        this.zza = list;
        this.zzb = j8;
        this.zzc = j14;
        this.zzd = i14;
        this.zze = bundle;
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0007  */
    public static ActivityRecognitionResult extractResult(Intent intent) {
        Bundle extras;
        ActivityRecognitionResult activityRecognitionResult;
        if (hasResult(intent) && (extras = intent.getExtras()) != null) {
            Object obj = extras.get("com.google.android.location.internal.EXTRA_ACTIVITY_RESULT");
            if (obj instanceof byte[]) {
                activityRecognitionResult = (ActivityRecognitionResult) SafeParcelableSerializer.deserializeFromBytes((byte[]) obj, CREATOR);
            } else if (obj instanceof ActivityRecognitionResult) {
                activityRecognitionResult = (ActivityRecognitionResult) obj;
            } else {
                activityRecognitionResult = null;
            }
        } else {
            activityRecognitionResult = null;
        }
        if (activityRecognitionResult != null) {
            return activityRecognitionResult;
        }
        List listZza = zza(intent);
        if (listZza == null || listZza.isEmpty()) {
            return null;
        }
        return (ActivityRecognitionResult) listZza.get(listZza.size() - 1);
    }

    public static boolean hasResult(Intent intent) {
        if (intent == null) {
            return false;
        }
        if (intent.hasExtra("com.google.android.location.internal.EXTRA_ACTIVITY_RESULT")) {
            return true;
        }
        List listZza = zza(intent);
        return (listZza == null || listZza.isEmpty()) ? false : true;
    }

    public static List zza(Intent intent) {
        if (intent != null && intent.hasExtra("com.google.android.location.internal.EXTRA_ACTIVITY_RESULT_LIST")) {
            return SafeParcelableSerializer.deserializeIterableFromIntentExtra(intent, "com.google.android.location.internal.EXTRA_ACTIVITY_RESULT_LIST", CREATOR);
        }
        return null;
    }

    private static boolean zzb(Bundle bundle, Bundle bundle2) {
        int length;
        if (bundle == null) {
            return bundle2 == null;
        }
        if (bundle2 == null || bundle.size() != bundle2.size()) {
            return false;
        }
        for (String str : bundle.keySet()) {
            if (!bundle2.containsKey(str)) {
                return false;
            }
            Object obj = bundle.get(str);
            Object obj2 = bundle2.get(str);
            if (obj == null) {
                if (obj2 != null) {
                    return false;
                }
            } else if (obj instanceof Bundle) {
                if (!zzb(bundle.getBundle(str), bundle2.getBundle(str))) {
                    return false;
                }
            } else {
                if (obj.getClass().isArray()) {
                    if (obj2 != null && obj2.getClass().isArray() && (length = Array.getLength(obj)) == Array.getLength(obj2)) {
                        for (int i14 = 0; i14 < length; i14++) {
                            if (Objects.equal(Array.get(obj, i14), Array.get(obj2, i14))) {
                            }
                        }
                    }
                    return false;
                }
                if (!obj.equals(obj2)) {
                    return false;
                }
            }
        }
        return true;
    }

    @ShowFirstParty
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ActivityRecognitionResult activityRecognitionResult = (ActivityRecognitionResult) obj;
            if (this.zzb == activityRecognitionResult.zzb && this.zzc == activityRecognitionResult.zzc && this.zzd == activityRecognitionResult.zzd && Objects.equal(this.zza, activityRecognitionResult.zza) && zzb(this.zze, activityRecognitionResult.zze)) {
                return true;
            }
        }
        return false;
    }

    public int getActivityConfidence(int i14) {
        for (DetectedActivity detectedActivity : this.zza) {
            if (detectedActivity.getType() == i14) {
                return detectedActivity.getConfidence();
            }
        }
        return 0;
    }

    public long getElapsedRealtimeMillis() {
        return this.zzc;
    }

    public DetectedActivity getMostProbableActivity() {
        return (DetectedActivity) this.zza.get(0);
    }

    public List<DetectedActivity> getProbableActivities() {
        return this.zza;
    }

    public long getTime() {
        return this.zzb;
    }

    @ShowFirstParty
    public final int hashCode() {
        return Objects.hashCode(Long.valueOf(this.zzb), Long.valueOf(this.zzc), Integer.valueOf(this.zzd), this.zza, this.zze);
    }

    public String toString() {
        String strValueOf = String.valueOf(this.zza);
        long j8 = this.zzb;
        long j14 = this.zzc;
        StringBuilder sb3 = new StringBuilder(strValueOf.length() + 124);
        j.y(sb3, "ActivityRecognitionResult [probableActivities=", strValueOf, ", timeMillis=");
        sb3.append(j8);
        return a.g(j14, ", elapsedRealtimeMillis=", "]", sb3);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i14) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedList(parcel, 1, this.zza, false);
        SafeParcelWriter.writeLong(parcel, 2, this.zzb);
        SafeParcelWriter.writeLong(parcel, 3, this.zzc);
        SafeParcelWriter.writeInt(parcel, 4, this.zzd);
        SafeParcelWriter.writeBundle(parcel, 5, this.zze, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public ActivityRecognitionResult(List<DetectedActivity> list, long j8, long j14) {
        this(list, j8, j14, 0, null);
    }

    @VisibleForTesting
    public ActivityRecognitionResult(DetectedActivity detectedActivity, long j8, long j14) {
        this(Collections.singletonList(detectedActivity), j8, j14, 0, null);
    }
}
