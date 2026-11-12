package c22;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@d23.a
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0004"}, d2 = {"Lc22/j;", "Lc22/c3;", "stringID", "", "gcm-common-strings_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class j implements c3 {
    public static final Parcelable.Creator<j> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23098a;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<j> {
        @Override // android.os.Parcelable.Creator
        public final j createFromParcel(Parcel parcel) {
            parcel.getClass();
            String string = parcel.readString();
            Parcelable.Creator<j> creator = j.CREATOR;
            string.getClass();
            return j.b(string);
        }

        @Override // android.os.Parcelable.Creator
        public final j[] newArray(int i14) {
            return new j[i14];
        }
    }

    private /* synthetic */ j(String str) {
        this.f23098a = str;
    }

    public static final /* synthetic */ j b(String str) {
        return new j(str);
    }

    public static final Integer d(Context context, String str) {
        int identifier = context.getResources().getIdentifier(str, "string", context.getPackageName());
        Integer numValueOf = Integer.valueOf(identifier);
        if (identifier != 0) {
            return numValueOf;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            return p005kotlin.jvm.internal.s.g(this.f23098a, ((j) obj).f23098a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f23098a.hashCode();
    }

    public final String toString() {
        return am.j.m("AndroidStringID(stringID=", this.f23098a, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.f23098a);
    }
}
