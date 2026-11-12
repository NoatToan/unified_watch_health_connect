package qb;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.w;
import com.google.common.primitives.Floats;

/* JADX INFO: loaded from: classes.dex */
public final class c implements w.b {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f143952a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f143953b;

    public class a implements Parcelable.Creator<c> {
        @Override // android.os.Parcelable.Creator
        public final c createFromParcel(Parcel parcel) {
            return new c(parcel, (a) null);
        }

        @Override // android.os.Parcelable.Creator
        public final c[] newArray(int i14) {
            return new c[i14];
        }
    }

    private c(Parcel parcel) {
        this.f143952a = parcel.readFloat();
        this.f143953b = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (this.f143952a == cVar.f143952a && this.f143953b == cVar.f143953b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Floats.hashCode(this.f143952a) + 527) * 31) + this.f143953b;
    }

    public final String toString() {
        return "smta: captureFrameRate=" + this.f143952a + ", svcTemporalLayerCount=" + this.f143953b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.writeFloat(this.f143952a);
        parcel.writeInt(this.f143953b);
    }

    public c(float f14, int i14) {
        this.f143952a = f14;
        this.f143953b = i14;
    }

    public /* synthetic */ c(Parcel parcel, a aVar) {
        this(parcel);
    }
}
