package c22;

import android.os.Parcel;
import android.os.Parcelable;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@d23.a
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0004"}, d2 = {"Lc22/h2;", "Lc22/c3;", "stringID", "", "gcm-common-strings_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h2 implements c3 {
    public static final Parcelable.Creator<h2> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23081a;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<h2> {
        @Override // android.os.Parcelable.Creator
        public final h2 createFromParcel(Parcel parcel) {
            parcel.getClass();
            String string = parcel.readString();
            Parcelable.Creator<h2> creator = h2.CREATOR;
            string.getClass();
            return h2.b(string);
        }

        @Override // android.os.Parcelable.Creator
        public final h2[] newArray(int i14) {
            return new h2[i14];
        }
    }

    private /* synthetic */ h2(String str) {
        this.f23081a = str;
    }

    public static final /* synthetic */ h2 b(String str) {
        return new h2(str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h2) {
            return p005kotlin.jvm.internal.s.g(this.f23081a, ((h2) obj).f23081a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f23081a.hashCode();
    }

    public final String toString() {
        return am.j.m("OnDemandStringID(stringID=", this.f23081a, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.f23081a);
    }
}
