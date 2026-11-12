package jk0;

import am.x0;
import android.os.Parcel;
import android.os.Parcelable;
import m63.e0;
import m63.m1;
import m63.u1;
import m63.y1;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u000e2\u00020\u0001:\u0002\u000f\u0010B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bB9\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\r¨\u0006\u0011"}, d2 = {"Ljk0/g;", "Landroid/os/Parcelable;", "", "typeKey", "", "isDefault", "isPreferred", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lm63/u1;)V", "Companion", "a", "b", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final /* data */ class g implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f99248a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Boolean f99249b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Boolean f99250c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o13.t f99251d;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<g> CREATOR = new c();

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/gear/data/model/GearActivityTypeV2DTO.$serializer", "Lm63/e0;", "Ljk0/g;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @o13.e
    public static final /* synthetic */ class a implements e0<g> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f99252a;
        private static final k63.e descriptor;

        static {
            a aVar = new a();
            f99252a = aVar;
            m1 m1Var = new m1("com.garmin.android.apps.connectmobile.gear.data.model.GearActivityTypeV2DTO", aVar, 3);
            m1Var.j("activityTypeKey", true);
            m1Var.j("defaultGear", true);
            m1Var.j("preferredGear", true);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // m63.e0
        public final i63.c<?>[] childSerializers() {
            i63.c<?> cVarD = j63.a.d(y1.f117048a);
            m63.g gVar = m63.g.f116948a;
            return new i63.c[]{cVarD, j63.a.d(gVar), j63.a.d(gVar)};
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
            Boolean bool = null;
            Boolean bool2 = null;
            while (z14) {
                int iE = cVarC.e(eVar2);
                if (iE == -1) {
                    z14 = false;
                } else if (iE == 0) {
                    str = (String) cVarC.v(eVar2, 0, y1.f117048a, str);
                    i15 |= 1;
                } else if (iE == 1) {
                    bool = (Boolean) cVarC.v(eVar2, 1, m63.g.f116948a, bool);
                    i15 |= 2;
                } else {
                    if (iE != 2) {
                        hb.a.o(iE);
                        return null;
                    }
                    bool2 = (Boolean) cVarC.v(eVar2, 2, m63.g.f116948a, bool2);
                    i15 |= 4;
                }
            }
            cVarC.b(eVar2);
            return new g(i15, str, bool, bool2, (u1) null);
        }

        @Override // i63.i, i63.b
        /* JADX INFO: renamed from: getDescriptor */
        public final k63.e getF158591b() {
            return descriptor;
        }

        @Override // i63.i
        public final void serialize(l63.f fVar, Object obj) {
            g gVar = (g) obj;
            gVar.getClass();
            Boolean bool = gVar.f99250c;
            Boolean bool2 = gVar.f99249b;
            String str = gVar.f99248a;
            k63.e eVar = descriptor;
            l63.d dVarC = fVar.c(eVar);
            if (dVarC.C(eVar) || str != null) {
                dVarC.d(eVar, 0, y1.f117048a, str);
            }
            if (dVarC.C(eVar) || bool2 != null) {
                dVarC.d(eVar, 1, m63.g.f116948a, bool2);
            }
            if (dVarC.C(eVar) || bool != null) {
                dVarC.d(eVar, 2, m63.g.f116948a, bool);
            }
            dVarC.b(eVar);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements Parcelable.Creator<g> {
        @Override // android.os.Parcelable.Creator
        public final g createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            parcel.getClass();
            String string = parcel.readString();
            Boolean boolValueOf2 = null;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() != 0) {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new g(string, boolValueOf, boolValueOf2);
        }

        @Override // android.os.Parcelable.Creator
        public final g[] newArray(int i14) {
            return new g[i14];
        }
    }

    public /* synthetic */ g(int i14, String str, Boolean bool, Boolean bool2, u1 u1Var) {
        if ((i14 & 1) == 0) {
            this.f99248a = null;
        } else {
            this.f99248a = str;
        }
        if ((i14 & 2) == 0) {
            this.f99249b = null;
        } else {
            this.f99249b = bool;
        }
        if ((i14 & 4) == 0) {
            this.f99250c = null;
        } else {
            this.f99250c = bool2;
        }
        final int i15 = 1;
        this.f99251d = o13.m.b(new e23.a(this) { // from class: jk0.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f99247b;

            {
                this.f99247b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i16 = i15;
                Object obj = null;
                g gVar = this.f99247b;
                switch (i16) {
                    case 0:
                        g.Companion companion = g.INSTANCE;
                        for (Object obj2 : x0.H3) {
                            if (p005kotlin.jvm.internal.s.g(((x0) obj2).f4358a, gVar.f99248a)) {
                                obj = obj2;
                                return (x0) obj;
                            }
                        }
                        return (x0) obj;
                    default:
                        g.Companion companion2 = g.INSTANCE;
                        for (Object obj3 : x0.H3) {
                            if (p005kotlin.jvm.internal.s.g(((x0) obj3).f4358a, gVar.f99248a)) {
                                obj = obj3;
                                return (x0) obj;
                            }
                        }
                        return (x0) obj;
                }
            }
        });
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return p005kotlin.jvm.internal.s.g(this.f99248a, gVar.f99248a) && p005kotlin.jvm.internal.s.g(this.f99249b, gVar.f99249b) && p005kotlin.jvm.internal.s.g(this.f99250c, gVar.f99250c);
    }

    public final int hashCode() {
        String str = this.f99248a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.f99249b;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f99250c;
        return iHashCode2 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("GearActivityTypeV2DTO(typeKey=");
        sb3.append(this.f99248a);
        sb3.append(", isDefault=");
        sb3.append(this.f99249b);
        sb3.append(", isPreferred=");
        return p6.b.f(sb3, this.f99250c, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.f99248a);
        Boolean bool = this.f99249b;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool);
        }
        Boolean bool2 = this.f99250c;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool2);
        }
    }

    /* JADX INFO: renamed from: jk0.g$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ljk0/g$b;", "", "<init>", "()V", "Li63/c;", "Ljk0/g;", "serializer", "()Li63/c;", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<g> serializer() {
            return a.f99252a;
        }

        private Companion() {
        }
    }

    public g() {
        this((String) null, (Boolean) null, (Boolean) null, 7, (p005kotlin.jvm.internal.j) null);
    }

    public g(String str, Boolean bool, Boolean bool2) {
        this.f99248a = str;
        this.f99249b = bool;
        this.f99250c = bool2;
        final int i14 = 0;
        this.f99251d = o13.m.b(new e23.a(this) { // from class: jk0.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f99247b;

            {
                this.f99247b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i16 = i14;
                Object obj = null;
                g gVar = this.f99247b;
                switch (i16) {
                    case 0:
                        g.Companion companion = g.INSTANCE;
                        for (Object obj2 : x0.H3) {
                            if (p005kotlin.jvm.internal.s.g(((x0) obj2).f4358a, gVar.f99248a)) {
                                obj = obj2;
                                return (x0) obj;
                            }
                        }
                        return (x0) obj;
                    default:
                        g.Companion companion2 = g.INSTANCE;
                        for (Object obj3 : x0.H3) {
                            if (p005kotlin.jvm.internal.s.g(((x0) obj3).f4358a, gVar.f99248a)) {
                                obj = obj3;
                                return (x0) obj;
                            }
                        }
                        return (x0) obj;
                }
            }
        });
    }

    public /* synthetic */ g(String str, Boolean bool, Boolean bool2, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : bool, (i14 & 4) != 0 ? null : bool2);
    }
}
