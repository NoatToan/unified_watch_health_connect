package rb;

import androidx.media3.common.w;

/* JADX INFO: loaded from: classes.dex */
public abstract class b implements w.b {
    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public String toString() {
        return "SCTE-35 splice command: type=".concat(getClass().getSimpleName());
    }
}
