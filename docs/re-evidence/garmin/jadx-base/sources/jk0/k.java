package jk0;

import android.os.Parcel;
import android.os.Parcelable;
import m63.e0;
import m63.k1;
import m63.m1;
import m63.u1;
import m63.v0;
import m63.y1;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00122\u00020\u0001:\u0002\u0013\u0014BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u000b\u0010\fBW\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011¨\u0006\u0015"}, d2 = {"Ljk0/k;", "Landroid/os/Parcelable;", "", "name", "Lb63/o;", "firstUseDate", "uuid", "", "userProfilePk", "modifiedDate", "gearCount", "<init>", "(Ljava/lang/String;Lb63/o;Ljava/lang/String;Ljava/lang/Long;Lb63/o;Ljava/lang/Long;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/lang/String;Lb63/o;Ljava/lang/String;Ljava/lang/Long;Lb63/o;Ljava/lang/Long;Lm63/u1;)V", "Companion", "a", "b", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final /* data */ class k implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f99272a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b63.o f99273b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f99274c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Long f99275d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b63.o f99276e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Long f99277f;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<k> CREATOR = new c();

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/gear/data/model/GearCollectionSummaryBaseDTO.$serializer", "Lm63/e0;", "Ljk0/k;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @o13.e
    public static final /* synthetic */ class a implements e0<k> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f99278a;
        private static final k63.e descriptor;

        static {
            a aVar = new a();
            f99278a = aVar;
            m1 m1Var = new m1("com.garmin.android.apps.connectmobile.gear.data.model.GearCollectionSummaryBaseDTO", aVar, 6);
            m1Var.j("name", false);
            m1Var.j("firstUseDate", false);
            m1Var.j("uuid", true);
            m1Var.j("userProfilePk", true);
            m1Var.j("modifiedDate", true);
            m1Var.j("numItemsInCollection", true);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // m63.e0
        public final i63.c<?>[] childSerializers() {
            y1 y1Var = y1.f117048a;
            h63.k kVar = h63.k.f82304a;
            i63.c<?> cVarD = j63.a.d(y1Var);
            v0 v0Var = v0.f117027a;
            return new i63.c[]{y1Var, kVar, cVarD, j63.a.d(v0Var), j63.a.d(kVar), j63.a.d(v0Var)};
        }

        @Override // i63.b
        public final Object deserialize(l63.e eVar) {
            eVar.getClass();
            k63.e eVar2 = descriptor;
            l63.c cVarC = eVar.c(eVar2);
            int i14 = l63.c.f110557a;
            boolean z14 = true;
            int i15 = 0;
            String strR = null;
            b63.o oVar = null;
            String str = null;
            Long l14 = null;
            b63.o oVar2 = null;
            Long l15 = null;
            while (z14) {
                int iE = cVarC.e(eVar2);
                switch (iE) {
                    case -1:
                        z14 = false;
                        break;
                    case 0:
                        strR = cVarC.r(eVar2, 0);
                        i15 |= 1;
                        break;
                    case 1:
                        oVar = (b63.o) cVarC.l(eVar2, 1, h63.k.f82304a, oVar);
                        i15 |= 2;
                        break;
                    case 2:
                        str = (String) cVarC.v(eVar2, 2, y1.f117048a, str);
                        i15 |= 4;
                        break;
                    case 3:
                        l14 = (Long) cVarC.v(eVar2, 3, v0.f117027a, l14);
                        i15 |= 8;
                        break;
                    case 4:
                        oVar2 = (b63.o) cVarC.v(eVar2, 4, h63.k.f82304a, oVar2);
                        i15 |= 16;
                        break;
                    case 5:
                        l15 = (Long) cVarC.v(eVar2, 5, v0.f117027a, l15);
                        i15 |= 32;
                        break;
                    default:
                        hb.a.o(iE);
                        return null;
                }
            }
            cVarC.b(eVar2);
            return new k(i15, strR, oVar, str, l14, oVar2, l15, (u1) null);
        }

        @Override // i63.i, i63.b
        /* JADX INFO: renamed from: getDescriptor */
        public final k63.e getF158591b() {
            return descriptor;
        }

        @Override // i63.i
        public final void serialize(l63.f fVar, Object obj) {
            k kVar = (k) obj;
            kVar.getClass();
            k63.e eVar = descriptor;
            l63.d dVarC = fVar.c(eVar);
            String str = kVar.f99272a;
            Long l14 = kVar.f99277f;
            b63.o oVar = kVar.f99276e;
            Long l15 = kVar.f99275d;
            String str2 = kVar.f99274c;
            dVarC.k(eVar, 0, str);
            h63.k kVar2 = h63.k.f82304a;
            dVarC.e(eVar, 1, kVar2, kVar.f99273b);
            if (dVarC.C(eVar) || str2 != null) {
                dVarC.d(eVar, 2, y1.f117048a, str2);
            }
            if (dVarC.C(eVar) || l15 != null) {
                dVarC.d(eVar, 3, v0.f117027a, l15);
            }
            if (dVarC.C(eVar) || oVar != null) {
                dVarC.d(eVar, 4, kVar2, oVar);
            }
            if (dVarC.C(eVar) || l14 != null) {
                dVarC.d(eVar, 5, v0.f117027a, l14);
            }
            dVarC.b(eVar);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements Parcelable.Creator<k> {
        @Override // android.os.Parcelable.Creator
        public final k createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new k(parcel.readString(), vk0.g.f178573a.a(parcel), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), vk0.i.f178575a.a(parcel), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final k[] newArray(int i14) {
            return new k[i14];
        }
    }

    public /* synthetic */ k(int i14, String str, b63.o oVar, String str2, Long l14, b63.o oVar2, Long l15, u1 u1Var) {
        if (3 != (i14 & 3)) {
            k1.h(i14, 3, a.f99278a.getF158591b());
            throw null;
        }
        this.f99272a = str;
        this.f99273b = oVar;
        if ((i14 & 4) == 0) {
            this.f99274c = null;
        } else {
            this.f99274c = str2;
        }
        if ((i14 & 8) == 0) {
            this.f99275d = null;
        } else {
            this.f99275d = l14;
        }
        if ((i14 & 16) == 0) {
            this.f99276e = null;
        } else {
            this.f99276e = oVar2;
        }
        if ((i14 & 32) == 0) {
            this.f99277f = null;
        } else {
            this.f99277f = l15;
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
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return p005kotlin.jvm.internal.s.g(this.f99272a, kVar.f99272a) && p005kotlin.jvm.internal.s.g(this.f99273b, kVar.f99273b) && p005kotlin.jvm.internal.s.g(this.f99274c, kVar.f99274c) && p005kotlin.jvm.internal.s.g(this.f99275d, kVar.f99275d) && p005kotlin.jvm.internal.s.g(this.f99276e, kVar.f99276e) && p005kotlin.jvm.internal.s.g(this.f99277f, kVar.f99277f);
    }

    public final int hashCode() {
        int iA = n23.j.a(this.f99273b.f16206a, this.f99272a.hashCode() * 31, 31);
        String str = this.f99274c;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        Long l14 = this.f99275d;
        int iHashCode2 = (iHashCode + (l14 == null ? 0 : l14.hashCode())) * 31;
        b63.o oVar = this.f99276e;
        int iHashCode3 = (iHashCode2 + (oVar == null ? 0 : oVar.f16206a.hashCode())) * 31;
        Long l15 = this.f99277f;
        return iHashCode3 + (l15 != null ? l15.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("GearCollectionSummaryBaseDTO(name=");
        sb3.append(this.f99272a);
        sb3.append(", firstUseDate=");
        sb3.append(this.f99273b);
        sb3.append(", uuid=");
        n23.j.q(this.f99275d, this.f99274c, ", userProfilePk=", ", modifiedDate=", sb3);
        sb3.append(this.f99276e);
        sb3.append(", gearCount=");
        sb3.append(this.f99277f);
        sb3.append(")");
        return sb3.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.f99272a);
        vk0.g.f178573a.b(this.f99273b, parcel);
        parcel.writeString(this.f99274c);
        Long l14 = this.f99275d;
        if (l14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l14);
        }
        vk0.i.f178575a.b(this.f99276e, parcel);
        Long l15 = this.f99277f;
        if (l15 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l15);
        }
    }

    /* JADX INFO: renamed from: jk0.k$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ljk0/k$b;", "", "<init>", "()V", "Li63/c;", "Ljk0/k;", "serializer", "()Li63/c;", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<k> serializer() {
            return a.f99278a;
        }

        private Companion() {
        }
    }

    public k(String str, b63.o oVar, String str2, Long l14, b63.o oVar2, Long l15) {
        str.getClass();
        oVar.getClass();
        this.f99272a = str;
        this.f99273b = oVar;
        this.f99274c = str2;
        this.f99275d = l14;
        this.f99276e = oVar2;
        this.f99277f = l15;
    }

    public /* synthetic */ k(String str, b63.o oVar, String str2, Long l14, b63.o oVar2, Long l15, int i14, p005kotlin.jvm.internal.j jVar) {
        this(str, oVar, (i14 & 4) != 0 ? null : str2, (i14 & 8) != 0 ? null : l14, (i14 & 16) != 0 ? null : oVar2, (i14 & 32) != 0 ? null : l15);
    }
}
