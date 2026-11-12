package xj2;

import am.j;
import android.os.Parcel;
import android.os.Parcelable;
import i3.e5;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lxj2/a;", "Landroid/os/Parcelable;", "", "url", "", "params", "appName", "", "dateReceived", "<init>", "(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;J)V", "ciq-http_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C3559a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f191179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<String, String> f191180b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f191181c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f191182d;

    /* JADX INFO: renamed from: xj2.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C3559a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            parcel.getClass();
            String string = parcel.readString();
            int i14 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i14);
            for (int i15 = 0; i15 != i14; i15++) {
                linkedHashMap.put(parcel.readString(), parcel.readString());
            }
            return new a(string, linkedHashMap, parcel.readString(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i14) {
            return new a[i14];
        }
    }

    public a(String str, Map<String, String> map, String str2, long j8) {
        str.getClass();
        map.getClass();
        this.f191179a = str;
        this.f191180b = map;
        this.f191181c = str2;
        this.f191182d = j8;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f191179a.equals(aVar.f191179a) && this.f191180b.equals(aVar.f191180b) && s.g(this.f191181c, aVar.f191181c) && this.f191182d == aVar.f191182d;
    }

    public final int hashCode() {
        int iB = j.b(this.f191180b, this.f191179a.hashCode() * 31, 31);
        String str = this.f191181c;
        return Long.hashCode(this.f191182d) + ((iB + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("OpenWebPageRequest(url=");
        sb3.append(this.f191179a);
        sb3.append(", params=");
        sb3.append(this.f191180b);
        sb3.append(", appName=");
        e5.s(this.f191182d, this.f191181c, ", dateReceived=", sb3);
        sb3.append(")");
        return sb3.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.f191179a);
        Iterator itU = j.u(this.f191180b, parcel);
        while (itU.hasNext()) {
            Map.Entry entry = (Map.Entry) itU.next();
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
        parcel.writeString(this.f191181c);
        parcel.writeLong(this.f191182d);
    }
}
