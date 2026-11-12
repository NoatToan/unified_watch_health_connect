package os;

import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public interface a extends Parcelable {
    boolean V2();

    default b a4() {
        return b.ACTIVITY_LAPS_MAP;
    }

    default int getMapType() {
        return 1;
    }
}
