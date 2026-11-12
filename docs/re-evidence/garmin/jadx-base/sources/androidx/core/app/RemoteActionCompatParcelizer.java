package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcelable;
import androidx.core.graphics.drawable.IconCompat;
import androidx.versionedparcelable.VersionedParcel;
import de.c;

/* JADX INFO: loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(VersionedParcel versionedParcel) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        c cVarM = remoteActionCompat.f6376a;
        if (versionedParcel.h(1)) {
            cVarM = versionedParcel.m();
        }
        remoteActionCompat.f6376a = (IconCompat) cVarM;
        CharSequence charSequenceG = remoteActionCompat.f6377b;
        if (versionedParcel.h(2)) {
            charSequenceG = versionedParcel.g();
        }
        remoteActionCompat.f6377b = charSequenceG;
        CharSequence charSequenceG2 = remoteActionCompat.f6378c;
        if (versionedParcel.h(3)) {
            charSequenceG2 = versionedParcel.g();
        }
        remoteActionCompat.f6378c = charSequenceG2;
        Parcelable parcelableK = remoteActionCompat.f6379d;
        if (versionedParcel.h(4)) {
            parcelableK = versionedParcel.k();
        }
        remoteActionCompat.f6379d = (PendingIntent) parcelableK;
        boolean zE = remoteActionCompat.f6380e;
        if (versionedParcel.h(5)) {
            zE = versionedParcel.e();
        }
        remoteActionCompat.f6380e = zE;
        boolean zE2 = remoteActionCompat.f6381f;
        if (versionedParcel.h(6)) {
            zE2 = versionedParcel.e();
        }
        remoteActionCompat.f6381f = zE2;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, VersionedParcel versionedParcel) {
        versionedParcel.getClass();
        IconCompat iconCompat = remoteActionCompat.f6376a;
        versionedParcel.n(1);
        versionedParcel.v(iconCompat);
        CharSequence charSequence = remoteActionCompat.f6377b;
        versionedParcel.n(2);
        versionedParcel.q(charSequence);
        CharSequence charSequence2 = remoteActionCompat.f6378c;
        versionedParcel.n(3);
        versionedParcel.q(charSequence2);
        PendingIntent pendingIntent = remoteActionCompat.f6379d;
        versionedParcel.n(4);
        versionedParcel.t(pendingIntent);
        boolean z14 = remoteActionCompat.f6380e;
        versionedParcel.n(5);
        versionedParcel.o(z14);
        boolean z15 = remoteActionCompat.f6381f;
        versionedParcel.n(6);
        versionedParcel.o(z15);
    }
}
