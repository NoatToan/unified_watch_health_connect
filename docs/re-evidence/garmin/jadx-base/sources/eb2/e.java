package eb2;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f63688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f63689b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f63690c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f63691d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f63692e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f63693f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f63694g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f63695h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f63696i;

    public class a implements Parcelable.Creator<e> {
        @Override // android.os.Parcelable.Creator
        public final e createFromParcel(Parcel parcel) {
            e eVar = new e();
            eVar.f63688a = parcel.readString();
            eVar.f63690c = parcel.readString();
            eVar.f63691d = parcel.readString();
            eVar.f63692e = parcel.readString();
            eVar.f63689b = parcel.readInt();
            eVar.f63693f = parcel.readString();
            eVar.f63694g = parcel.readLong();
            eVar.f63695h = parcel.readString();
            eVar.f63696i = parcel.readString();
            return eVar;
        }

        @Override // android.os.Parcelable.Creator
        public final e[] newArray(int i14) {
            return new e[i14];
        }
    }

    static {
        new a();
    }

    public e(e eVar) {
        this.f63693f = null;
        this.f63694g = -1L;
        this.f63695h = null;
        this.f63696i = null;
        this.f63688a = eVar.f63688a;
        this.f63690c = eVar.f63690c;
        this.f63691d = eVar.f63691d;
        this.f63692e = eVar.f63692e;
        this.f63689b = eVar.f63689b;
        this.f63693f = eVar.f63693f;
        this.f63694g = eVar.f63694g;
        this.f63695h = eVar.f63695h;
        this.f63696i = eVar.f63696i;
    }

    public e() {
        this.f63693f = null;
        this.f63694g = -1L;
        this.f63695h = null;
        this.f63696i = null;
    }
}
