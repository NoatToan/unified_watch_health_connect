package le2;

import android.os.Parcel;
import android.os.Parcelable;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lle2/a;", "Landroid/os/Parcelable;", "Lke2/b;", "northEast", "southWest", "<init>", "(Lke2/b;Lke2/b;)V", "map-sdk-adapter-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C2151a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ke2.b f112052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ke2.b f112053b;

    /* JADX INFO: renamed from: le2.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class C2151a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            parcel.getClass();
            Parcelable.Creator<ke2.b> creator = ke2.b.CREATOR;
            return new a(creator.createFromParcel(parcel), creator.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i14) {
            return new a[i14];
        }
    }

    public /* synthetic */ a(ke2.b bVar, ke2.b bVar2, int i14, j jVar) {
        this((i14 & 1) != 0 ? new ke2.b(0.0d, 0.0d, null, 4, null) : bVar, (i14 & 2) != 0 ? new ke2.b(0.0d, 0.0d, null, 4, null) : bVar2);
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
        return s.g(this.f112052a, aVar.f112052a) && s.g(this.f112053b, aVar.f112053b);
    }

    public final int hashCode() {
        return this.f112053b.hashCode() + (this.f112052a.hashCode() * 31);
    }

    public final String toString() {
        return "BoundingBoxState(northEast=" + this.f112052a + ", southWest=" + this.f112053b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        this.f112052a.writeToParcel(parcel, i14);
        this.f112053b.writeToParcel(parcel, i14);
    }

    public a(ke2.b bVar, ke2.b bVar2) {
        bVar.getClass();
        bVar2.getClass();
        this.f112052a = bVar;
        this.f112053b = bVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
