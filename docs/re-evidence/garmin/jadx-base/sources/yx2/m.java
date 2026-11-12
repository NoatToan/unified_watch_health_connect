package yx2;

import android.os.Parcel;
import android.os.Parcelable;
import i3.e5;
import m63.e0;
import m63.m1;
import m63.u1;
import m63.y1;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u000e2\u00020\u0001:\u0002\u000f\u0010B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bBC\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\r¨\u0006\u0011"}, d2 = {"Lyx2/m;", "Landroid/os/Parcelable;", "", "cultureCode", "longName", "shortDescription", "descriptionHtml", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lm63/u1;)V", "Companion", "a", "b", "subscriptions-purchase_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@i63.h
public final /* data */ class m implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f200122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f200123b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f200124c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f200125d;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<m> CREATOR = new c();

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/subscriptions/dto/SubscriptionTranslationDTO.$serializer", "Lm63/e0;", "Lyx2/m;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "subscriptions-purchase_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @o13.e
    public /* synthetic */ class a implements e0<m> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f200126a;
        private static final k63.e descriptor;

        static {
            a aVar = new a();
            f200126a = aVar;
            m1 m1Var = new m1("com.garmin.subscriptions.dto.SubscriptionTranslationDTO", aVar, 4);
            m1Var.j("cultureCode", true);
            m1Var.j("longName", true);
            m1Var.j("shortDescription", true);
            m1Var.j("descriptionHtml", true);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // m63.e0
        public final i63.c<?>[] childSerializers() {
            y1 y1Var = y1.f117048a;
            return new i63.c[]{j63.a.d(y1Var), j63.a.d(y1Var), j63.a.d(y1Var), j63.a.d(y1Var)};
        }

        @Override // i63.b
        public final Object deserialize(l63.e eVar) {
            eVar.getClass();
            k63.e eVar2 = descriptor;
            l63.c cVarC = eVar.c(eVar2);
            int i14 = l63.c.f110557a;
            boolean z14 = true;
            int i15 = 0;
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            while (z14) {
                int iE = cVarC.e(eVar2);
                if (iE == -1) {
                    z14 = false;
                } else if (iE == 0) {
                    str = (String) cVarC.v(eVar2, 0, y1.f117048a, str);
                    i15 |= 1;
                } else if (iE == 1) {
                    str2 = (String) cVarC.v(eVar2, 1, y1.f117048a, str2);
                    i15 |= 2;
                } else if (iE == 2) {
                    str3 = (String) cVarC.v(eVar2, 2, y1.f117048a, str3);
                    i15 |= 4;
                } else {
                    if (iE != 3) {
                        hb.a.o(iE);
                        return null;
                    }
                    str4 = (String) cVarC.v(eVar2, 3, y1.f117048a, str4);
                    i15 |= 8;
                }
            }
            cVarC.b(eVar2);
            return new m(i15, str, str2, str3, str4, (u1) null);
        }

        @Override // i63.i, i63.b
        /* JADX INFO: renamed from: getDescriptor */
        public final k63.e getF158591b() {
            return descriptor;
        }

        @Override // i63.i
        public final void serialize(l63.f fVar, Object obj) {
            m mVar = (m) obj;
            mVar.getClass();
            String str = mVar.f200125d;
            String str2 = mVar.f200124c;
            String str3 = mVar.f200123b;
            String str4 = mVar.f200122a;
            k63.e eVar = descriptor;
            l63.d dVarC = fVar.c(eVar);
            if (dVarC.C(eVar) || str4 != null) {
                dVarC.d(eVar, 0, y1.f117048a, str4);
            }
            if (dVarC.C(eVar) || str3 != null) {
                dVarC.d(eVar, 1, y1.f117048a, str3);
            }
            if (dVarC.C(eVar) || str2 != null) {
                dVarC.d(eVar, 2, y1.f117048a, str2);
            }
            if (dVarC.C(eVar) || str != null) {
                dVarC.d(eVar, 3, y1.f117048a, str);
            }
            dVarC.b(eVar);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class c implements Parcelable.Creator<m> {
        @Override // android.os.Parcelable.Creator
        public final m createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new m(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final m[] newArray(int i14) {
            return new m[i14];
        }
    }

    public /* synthetic */ m(int i14, String str, String str2, String str3, String str4, u1 u1Var) {
        if ((i14 & 1) == 0) {
            this.f200122a = null;
        } else {
            this.f200122a = str;
        }
        if ((i14 & 2) == 0) {
            this.f200123b = null;
        } else {
            this.f200123b = str2;
        }
        if ((i14 & 4) == 0) {
            this.f200124c = null;
        } else {
            this.f200124c = str3;
        }
        if ((i14 & 8) == 0) {
            this.f200125d = null;
        } else {
            this.f200125d = str4;
        }
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
        return s.g(this.f200122a, mVar.f200122a) && s.g(this.f200123b, mVar.f200123b) && s.g(this.f200124c, mVar.f200124c) && s.g(this.f200125d, mVar.f200125d);
    }

    public final int hashCode() {
        String str = this.f200122a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f200123b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f200124c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f200125d;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        return e5.h(p6.b.i("SubscriptionTranslationDTO(cultureCode=", this.f200122a, ", longName=", this.f200123b, ", shortDescription="), this.f200124c, ", descriptionHtml=", this.f200125d, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.f200122a);
        parcel.writeString(this.f200123b);
        parcel.writeString(this.f200124c);
        parcel.writeString(this.f200125d);
    }

    /* JADX INFO: renamed from: yx2.m$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lyx2/m$b;", "", "<init>", "()V", "Li63/c;", "Lyx2/m;", "serializer", "()Li63/c;", "subscriptions-purchase_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final i63.c<m> serializer() {
            return a.f200126a;
        }

        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }
    }

    public m() {
        this((String) null, (String) null, (String) null, (String) null, 15, (p005kotlin.jvm.internal.j) null);
    }

    public m(String str, String str2, String str3, String str4) {
        this.f200122a = str;
        this.f200123b = str2;
        this.f200124c = str3;
        this.f200125d = str4;
    }

    public /* synthetic */ m(String str, String str2, String str3, String str4, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : str2, (i14 & 4) != 0 ? null : str3, (i14 & 8) != 0 ? null : str4);
    }
}
