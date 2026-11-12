package p71;

import android.os.Parcelable;
import n71.g;

/* JADX INFO: loaded from: classes9.dex */
public interface f extends Parcelable {
    boolean B0(com.garmin.android.apps.connectmobile.performance.dto.c cVar);

    g I0();

    default boolean W1(com.garmin.android.apps.connectmobile.performance.dto.d dVar) {
        dVar.getClass();
        return B0(dVar.b());
    }

    default g Z1() {
        return I0();
    }
}
