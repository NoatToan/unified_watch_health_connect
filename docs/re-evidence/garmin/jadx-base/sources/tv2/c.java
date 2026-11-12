package tv2;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001Bg\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u001c\b\u0002\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0002\u0018\u0001`\u0006\u0012\u001c\b\u0002\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0002\u0018\u0001`\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Ltv2/c;", "Landroid/os/Parcelable;", "", "hexCode", "appHandle", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "valArgHandles", "valArgs", "fallBackText", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/lang/String;)V", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f166662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f166663b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList<String> f166664c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList<String> f166665d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f166666e;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<c> {
        @Override // android.os.Parcelable.Creator
        public final c createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new c(parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.createStringArrayList(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final c[] newArray(int i14) {
            return new c[i14];
        }
    }

    public /* synthetic */ c(String str, String str2, ArrayList arrayList, ArrayList arrayList2, String str3, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : str2, (i14 & 4) != 0 ? null : arrayList, (i14 & 8) != 0 ? null : arrayList2, (i14 & 16) != 0 ? null : str3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return s.g(this.f166662a, cVar.f166662a) && s.g(this.f166663b, cVar.f166663b) && s.g(this.f166664c, cVar.f166664c) && s.g(this.f166665d, cVar.f166665d) && s.g(this.f166666e, cVar.f166666e);
    }

    public final int hashCode() {
        String str = this.f166662a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f166663b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        ArrayList<String> arrayList = this.f166664c;
        int iHashCode3 = (iHashCode2 + (arrayList == null ? 0 : arrayList.hashCode())) * 31;
        ArrayList<String> arrayList2 = this.f166665d;
        int iHashCode4 = (iHashCode3 + (arrayList2 == null ? 0 : arrayList2.hashCode())) * 31;
        String str3 = this.f166666e;
        return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbI = p6.b.i("LocalizedStringsBundle(hexCode=", this.f166662a, ", appHandle=", this.f166663b, ", valArgHandles=");
        sbI.append(this.f166664c);
        sbI.append(", valArgs=");
        sbI.append(this.f166665d);
        sbI.append(", fallBackText=");
        return am.j.o(this.f166666e, ")", sbI);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.f166662a);
        parcel.writeString(this.f166663b);
        parcel.writeStringList(this.f166664c);
        parcel.writeStringList(this.f166665d);
        parcel.writeString(this.f166666e);
    }

    public c(String str, String str2, ArrayList<String> arrayList, ArrayList<String> arrayList2, String str3) {
        this.f166662a = str;
        this.f166663b = str2;
        this.f166664c = arrayList;
        this.f166665d = arrayList2;
        this.f166666e = str3;
    }

    public c() {
        this(null, null, null, null, null, 31, null);
    }
}
