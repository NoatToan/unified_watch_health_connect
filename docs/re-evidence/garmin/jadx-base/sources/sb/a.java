package sb;

import android.os.Parcel;
import android.os.Parcelable;
import nb.b;

/* JADX INFO: loaded from: classes.dex */
public final class a extends b {
    public static final Parcelable.Creator<a> CREATOR = new C2991a();

    /* JADX INFO: renamed from: sb.a$a, reason: collision with other inner class name */
    public class C2991a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i14) {
            return new a[i14];
        }
    }

    public a(String str, String str2) {
        super(str, str2);
    }

    public a(Parcel parcel) {
        super(parcel);
    }
}
