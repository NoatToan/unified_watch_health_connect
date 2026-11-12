package ve2;

import android.os.Parcel;
import android.os.Parcelable;
import org.apache.commons.text.lookup.StringLookupFactory;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lve2/m;", "Landroid/os/Parcelable;", "Lve2/e;", StringLookupFactory.KEY_ENV, "Lve2/n;", "flow", "Lve2/b;", "createAccountPrefillData", "", "signInLockToEmailAddress", "<init>", "(Lve2/e;Lve2/n;Lve2/b;Ljava/lang/String;)V", "mobile-auth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class m implements Parcelable {
    public static final Parcelable.Creator<m> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f177786a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f177787b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f177788c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f177789d;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<m> {
        @Override // android.os.Parcelable.Creator
        public final m createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new m(e.valueOf(parcel.readString()), n.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : b.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final m[] newArray(int i14) {
            return new m[i14];
        }
    }

    public m(e eVar, n nVar, b bVar, String str) {
        eVar.getClass();
        nVar.getClass();
        this.f177786a = eVar;
        this.f177787b = nVar;
        this.f177788c = bVar;
        this.f177789d = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f177786a == mVar.f177786a && this.f177787b == mVar.f177787b && p005kotlin.jvm.internal.s.g(this.f177788c, mVar.f177788c) && p005kotlin.jvm.internal.s.g(this.f177789d, mVar.f177789d);
    }

    public final int hashCode() {
        int iHashCode = (this.f177787b.hashCode() + (this.f177786a.hashCode() * 31)) * 31;
        b bVar = this.f177788c;
        int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        String str = this.f177789d;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "MultiUserMode(env=" + this.f177786a + ", flow=" + this.f177787b + ", createAccountPrefillData=" + this.f177788c + ", signInLockToEmailAddress=" + this.f177789d + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.f177786a.name());
        parcel.writeString(this.f177787b.name());
        b bVar = this.f177788c;
        if (bVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            bVar.writeToParcel(parcel, i14);
        }
        parcel.writeString(this.f177789d);
    }

    public /* synthetic */ m(e eVar, n nVar, b bVar, String str, int i14, p005kotlin.jvm.internal.j jVar) {
        this(eVar, nVar, (i14 & 4) != 0 ? null : bVar, (i14 & 8) != 0 ? null : str);
    }
}
