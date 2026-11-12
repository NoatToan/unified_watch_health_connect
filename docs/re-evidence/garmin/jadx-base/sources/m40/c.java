package m40;

import android.os.Parcel;
import android.os.Parcelable;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lm40/c;", "Landroid/os/Parcelable;", "", "showMapDetails", "Lm40/h;", "mapSettings", "Lm40/b;", "courseLineSettings", "Lm40/a;", "courseElementsSettings", "<init>", "(ZLm40/h;Lm40/b;Lm40/a;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f116580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f116581b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f116582c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m40.a f116583d;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<c> {
        @Override // android.os.Parcelable.Creator
        public final c createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new c(parcel.readInt() != 0, h.CREATOR.createFromParcel(parcel), b.CREATOR.createFromParcel(parcel), m40.a.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final c[] newArray(int i14) {
            return new c[i14];
        }
    }

    public c(boolean z14, h hVar, b bVar, m40.a aVar) {
        hVar.getClass();
        bVar.getClass();
        aVar.getClass();
        this.f116580a = z14;
        this.f116581b = hVar;
        this.f116582c = bVar;
        this.f116583d = aVar;
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
        return this.f116580a == cVar.f116580a && this.f116581b.equals(cVar.f116581b) && this.f116582c.equals(cVar.f116582c) && this.f116583d.equals(cVar.f116583d);
    }

    public final int hashCode() {
        return this.f116583d.hashCode() + ((this.f116582c.hashCode() + ((this.f116581b.hashCode() + (Boolean.hashCode(this.f116580a) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "CourseMapSettings(showMapDetails=" + this.f116580a + ", mapSettings=" + this.f116581b + ", courseLineSettings=" + this.f116582c + ", courseElementsSettings=" + this.f116583d + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeInt(this.f116580a ? 1 : 0);
        this.f116581b.writeToParcel(parcel, i14);
        this.f116582c.writeToParcel(parcel, i14);
        this.f116583d.writeToParcel(parcel, i14);
    }
}
