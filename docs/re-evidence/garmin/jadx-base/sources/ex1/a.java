package ex1;

import android.os.Parcel;
import android.os.Parcelable;
import fx1.b;
import fx1.e;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lex1/a;", "Landroid/os/Parcelable;", "Lfx1/a;", "difficultyLevel", "Lfx1/b;", "planType", "Lfx1/e;", "workoutsPerWeek", "<init>", "(Lfx1/a;Lfx1/b;Lfx1/e;)V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C1396a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public fx1.a f66927a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b f66928b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public e f66929c;

    /* JADX INFO: renamed from: ex1.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C1396a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new a(fx1.a.CREATOR.createFromParcel(parcel), b.CREATOR.createFromParcel(parcel), e.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i14) {
            return new a[i14];
        }
    }

    public /* synthetic */ a(fx1.a aVar, b bVar, e eVar, int i14, j jVar) {
        this((i14 & 1) != 0 ? fx1.a.ALL : aVar, (i14 & 2) != 0 ? b.ALL : bVar, (i14 & 4) != 0 ? e.ALL : eVar);
    }

    public static a b(a aVar, fx1.a aVar2, b bVar, e eVar, int i14) {
        if ((i14 & 1) != 0) {
            aVar2 = aVar.f66927a;
        }
        if ((i14 & 2) != 0) {
            bVar = aVar.f66928b;
        }
        if ((i14 & 4) != 0) {
            eVar = aVar.f66929c;
        }
        aVar2.getClass();
        bVar.getClass();
        eVar.getClass();
        return new a(aVar2, bVar, eVar);
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
        return this.f66927a == aVar.f66927a && this.f66928b == aVar.f66928b && this.f66929c == aVar.f66929c;
    }

    public final int hashCode() {
        return this.f66929c.hashCode() + ((this.f66928b.hashCode() + (this.f66927a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "StpFilterDTO(difficultyLevel=" + this.f66927a + ", planType=" + this.f66928b + ", workoutsPerWeek=" + this.f66929c + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        this.f66927a.writeToParcel(parcel, i14);
        this.f66928b.writeToParcel(parcel, i14);
        this.f66929c.writeToParcel(parcel, i14);
    }

    public a(fx1.a aVar, b bVar, e eVar) {
        aVar.getClass();
        bVar.getClass();
        eVar.getClass();
        this.f66927a = aVar;
        this.f66928b = bVar;
        this.f66929c = eVar;
    }

    public a() {
        this(null, null, null, 7, null);
    }
}
