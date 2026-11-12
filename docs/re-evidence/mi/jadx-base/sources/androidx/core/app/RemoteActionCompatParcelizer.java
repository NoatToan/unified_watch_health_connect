package androidx.core.app;

import android.app.PendingIntent;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.drawable.IconCompat;
import androidx.versionedparcelable.VersionedParcel;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(VersionedParcel versionedParcel) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.f2062a = (IconCompat) versionedParcel.v(remoteActionCompat.f2062a, 1);
        remoteActionCompat.f2063b = versionedParcel.l(remoteActionCompat.f2063b, 2);
        remoteActionCompat.c = versionedParcel.l(remoteActionCompat.c, 3);
        remoteActionCompat.d = (PendingIntent) versionedParcel.r(remoteActionCompat.d, 4);
        remoteActionCompat.e = versionedParcel.h(remoteActionCompat.e, 5);
        remoteActionCompat.f = versionedParcel.h(remoteActionCompat.f, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, VersionedParcel versionedParcel) {
        versionedParcel.x(false, false);
        versionedParcel.M(remoteActionCompat.f2062a, 1);
        versionedParcel.D(remoteActionCompat.f2063b, 2);
        versionedParcel.D(remoteActionCompat.c, 3);
        versionedParcel.H(remoteActionCompat.d, 4);
        versionedParcel.z(remoteActionCompat.e, 5);
        versionedParcel.z(remoteActionCompat.f, 6);
    }
}
