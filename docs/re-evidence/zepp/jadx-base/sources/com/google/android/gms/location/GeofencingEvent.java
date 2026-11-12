package com.google.android.gms.location;

import android.content.Intent;
import android.location.Location;
import android.os.Parcel;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.Constants;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class GeofencingEvent {
    private final int a;

    @Geofence.GeofenceTransition
    private final int b;
    private final List<Geofence> c;
    private final Location d;

    private GeofencingEvent(int i, @Geofence.GeofenceTransition int i2, List<Geofence> list, Location location) {
        this.a = i;
        this.b = i2;
        this.c = list;
        this.d = location;
    }

    @RecentlyNonNull
    public static GeofencingEvent fromIntent(@RecentlyNonNull Intent intent) {
        ArrayList arrayList = null;
        if (intent == null) {
            return null;
        }
        int i = -1;
        int intExtra = intent.getIntExtra(Constants.KEY_GMS_ERROR_CODE, -1);
        int intExtra2 = intent.getIntExtra("com.google.android.location.intent.extra.transition", -1);
        if (intExtra2 != -1) {
            if (intExtra2 == 1 || intExtra2 == 2) {
                i = intExtra2;
            } else if (intExtra2 == 4) {
                i = 4;
            }
        }
        ArrayList arrayList2 = (ArrayList) intent.getSerializableExtra("com.google.android.location.intent.extra.geofence_list");
        if (arrayList2 != null) {
            arrayList = new ArrayList(arrayList2.size());
            int size = arrayList2.size();
            for (int i2 = 0; i2 < size; i2++) {
                byte[] bArr = (byte[]) arrayList2.get(i2);
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.unmarshall(bArr, 0, bArr.length);
                parcelObtain.setDataPosition(0);
                com.google.android.gms.internal.location.zzbe zzbeVarCreateFromParcel = com.google.android.gms.internal.location.zzbe.CREATOR.createFromParcel(parcelObtain);
                parcelObtain.recycle();
                arrayList.add(zzbeVarCreateFromParcel);
            }
        }
        return new GeofencingEvent(intExtra, i, arrayList, (Location) intent.getParcelableExtra("com.google.android.location.intent.extra.triggering_location"));
    }

    public int getErrorCode() {
        return this.a;
    }

    @Geofence.GeofenceTransition
    public int getGeofenceTransition() {
        return this.b;
    }

    @RecentlyNonNull
    public List<Geofence> getTriggeringGeofences() {
        return this.c;
    }

    @RecentlyNonNull
    public Location getTriggeringLocation() {
        return this.d;
    }

    public boolean hasError() {
        return this.a != -1;
    }
}
