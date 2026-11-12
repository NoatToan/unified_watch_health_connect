package bg2;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.f3;
import com.google.gson.annotations.SerializedName;
import m63.e0;
import m63.m0;
import m63.m1;
import m63.u1;
import m63.y1;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import yc.l2;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0087\b\u0018\u0000 \u001b2\u00020\u0001:\u0002\r\u0011B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bB9\b\u0010\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0007\u0010\fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u000e\u001a\u0004\b\u0018\u0010\u0010\"\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lbg2/n;", "Landroid/os/Parcelable;", "", "sportTypeId", "", "sportTypeKey", "displayOrder", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;)V", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Lm63/u1;)V", "a", "Ljava/lang/Integer;", "getSportTypeId", "()Ljava/lang/Integer;", "b", "Ljava/lang/String;", "getSportTypeKey", "()Ljava/lang/String;", "setSportTypeKey", "(Ljava/lang/String;)V", "c", "getDisplayOrder", "setDisplayOrder", "(Ljava/lang/Integer;)V", "Companion", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final /* data */ class n implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("sportTypeId")
    private final Integer sportTypeId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("sportTypeKey")
    private String sportTypeKey;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("displayOrder")
    private Integer displayOrder;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<n> CREATOR = new c();

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/livesessionview/msnworkouts/SportTypeDTO.$serializer", "Lm63/e0;", "Lbg2/n;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @o13.e
    public static final /* synthetic */ class a implements e0<n> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f17904a;
        private static final k63.e descriptor;

        static {
            a aVar = new a();
            f17904a = aVar;
            m1 m1Var = new m1("com.garmin.android.livesessionview.msnworkouts.SportTypeDTO", aVar, 3);
            m1Var.j("sportTypeId", true);
            m1Var.j("sportTypeKey", true);
            m1Var.j("displayOrder", true);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // m63.e0
        public final i63.c<?>[] childSerializers() {
            m0 m0Var = m0.f116981a;
            return new i63.c[]{j63.a.d(m0Var), j63.a.d(y1.f117048a), j63.a.d(m0Var)};
        }

        @Override // i63.b
        public final Object deserialize(l63.e eVar) {
            eVar.getClass();
            k63.e eVar2 = descriptor;
            l63.c cVarC = eVar.c(eVar2);
            int i14 = l63.c.f110557a;
            boolean z14 = true;
            int i15 = 0;
            Integer num = null;
            String str = null;
            Integer num2 = null;
            while (z14) {
                int iE = cVarC.e(eVar2);
                if (iE == -1) {
                    z14 = false;
                } else if (iE == 0) {
                    num = (Integer) cVarC.v(eVar2, 0, m0.f116981a, num);
                    i15 |= 1;
                } else if (iE == 1) {
                    str = (String) cVarC.v(eVar2, 1, y1.f117048a, str);
                    i15 |= 2;
                } else {
                    if (iE != 2) {
                        hb.a.o(iE);
                        return null;
                    }
                    num2 = (Integer) cVarC.v(eVar2, 2, m0.f116981a, num2);
                    i15 |= 4;
                }
            }
            cVarC.b(eVar2);
            return new n(i15, num, str, num2, (u1) null);
        }

        @Override // i63.i, i63.b
        /* JADX INFO: renamed from: getDescriptor */
        public final k63.e getF158591b() {
            return descriptor;
        }

        @Override // i63.i
        public final void serialize(l63.f fVar, Object obj) {
            n nVar = (n) obj;
            nVar.getClass();
            k63.e eVar = descriptor;
            l63.d dVarC = fVar.c(eVar);
            n.b(nVar, dVarC, eVar);
            dVarC.b(eVar);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements Parcelable.Creator<n> {
        @Override // android.os.Parcelable.Creator
        public final n createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new n(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final n[] newArray(int i14) {
            return new n[i14];
        }
    }

    public /* synthetic */ n(int i14, Integer num, String str, Integer num2, u1 u1Var) {
        if ((i14 & 1) == 0) {
            this.sportTypeId = null;
        } else {
            this.sportTypeId = num;
        }
        if ((i14 & 2) == 0) {
            this.sportTypeKey = null;
        } else {
            this.sportTypeKey = str;
        }
        if ((i14 & 4) == 0) {
            this.displayOrder = null;
        } else {
            this.displayOrder = num2;
        }
    }

    public static final /* synthetic */ void b(n nVar, l63.d dVar, k63.e eVar) {
        if (dVar.C(eVar) || nVar.sportTypeId != null) {
            dVar.d(eVar, 0, m0.f116981a, nVar.sportTypeId);
        }
        if (dVar.C(eVar) || nVar.sportTypeKey != null) {
            dVar.d(eVar, 1, y1.f117048a, nVar.sportTypeKey);
        }
        if (!dVar.C(eVar) && nVar.displayOrder == null) {
            return;
        }
        dVar.d(eVar, 2, m0.f116981a, nVar.displayOrder);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return s.g(this.sportTypeId, nVar.sportTypeId) && s.g(this.sportTypeKey, nVar.sportTypeKey) && s.g(this.displayOrder, nVar.displayOrder);
    }

    public final int hashCode() {
        Integer num = this.sportTypeId;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.sportTypeKey;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.displayOrder;
        return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        Integer num = this.sportTypeId;
        String str = this.sportTypeKey;
        return f3.i(l2.f("SportTypeDTO(sportTypeId=", num, ", sportTypeKey=", str, ", displayOrder="), this.displayOrder, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        Integer num = this.sportTypeId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
        parcel.writeString(this.sportTypeKey);
        Integer num2 = this.displayOrder;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num2);
        }
    }

    /* JADX INFO: renamed from: bg2.n$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lbg2/n$b;", "", "<init>", "()V", "Li63/c;", "Lbg2/n;", "serializer", "()Li63/c;", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<n> serializer() {
            return a.f17904a;
        }

        private Companion() {
        }
    }

    public n() {
        this((Integer) null, (String) null, (Integer) null, 7, (p005kotlin.jvm.internal.j) null);
    }

    public n(Integer num, String str, Integer num2) {
        this.sportTypeId = num;
        this.sportTypeKey = str;
        this.displayOrder = num2;
    }

    public /* synthetic */ n(Integer num, String str, Integer num2, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : num, (i14 & 2) != 0 ? null : str, (i14 & 4) != 0 ? null : num2);
    }
}
