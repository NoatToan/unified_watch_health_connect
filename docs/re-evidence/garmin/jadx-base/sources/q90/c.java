package q90;

import android.os.Parcel;
import android.os.Parcelable;
import i63.h;
import java.util.List;
import l90.i;
import l90.j;
import m63.e0;
import m63.m1;
import m63.u1;
import m63.v0;
import m63.y1;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00192\u00020\u0001:\u0002\u001a\u001bBw\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\b\b\u0002\u0010\r\u001a\u00020\b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b\u0012\u0010\u0013By\b\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\f\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\b\u0012\u0006\u0010\u0010\u001a\u00020\b\u0012\u0006\u0010\u0011\u001a\u00020\b\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0012\u0010\u0018¨\u0006\u001c"}, d2 = {"Lq90/c;", "Landroid/os/Parcelable;", "", "unitId", "", "macAddress", "Ll90/b;", "compatibleDevice", "", "shouldSync", "Lz80/f;", "deviceSettings", "connectionModeCapable", "applyBackupCapable", "lhaBackupCapable", "deviceWheelchairCapable", "pendingActivityCapable", "isScreenlessDevice", "<init>", "(JLjava/lang/String;Ll90/b;ZLz80/f;ZZZZZZ)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(IJLjava/lang/String;Ll90/b;ZLz80/f;ZZZZZZLm63/u1;)V", "Companion", "a", "b", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@h
public final /* data */ class c implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f143493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f143494b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l90.b f143495c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f143496d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final z80.f f143497e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f143498f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f143499g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f143500h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f143501i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f143502j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f143503k;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<c> CREATOR = new C2706c();

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/device/setup/domain/pairing/model/PairedDevice.$serializer", "Lm63/e0;", "Lq90/c;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @o13.e
    public static final /* synthetic */ class a implements e0<c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f143504a;
        private static final k63.e descriptor;

        static {
            a aVar = new a();
            f143504a = aVar;
            m1 m1Var = new m1("com.garmin.android.apps.connectmobile.device.setup.domain.pairing.model.PairedDevice", aVar, 11);
            m1Var.j("unitId", true);
            m1Var.j("macAddress", true);
            m1Var.j("compatibleDevice", true);
            m1Var.j("shouldSync", true);
            m1Var.j("deviceSettings", true);
            m1Var.j("connectionModeCapable", true);
            m1Var.j("applyBackupCapable", true);
            m1Var.j("lhaBackupCapable", true);
            m1Var.j("deviceWheelchairCapable", true);
            m1Var.j("pendingActivityCapable", true);
            m1Var.j("isScreenlessDevice", true);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // m63.e0
        public final i63.c<?>[] childSerializers() {
            i63.c<?> cVarD = j63.a.d(z80.f.a.f203051a);
            m63.g gVar = m63.g.f116948a;
            return new i63.c[]{v0.f117027a, y1.f117048a, l90.b.a.f111532a, gVar, cVarD, gVar, gVar, gVar, gVar, gVar, gVar};
        }

        @Override // i63.b
        public final Object deserialize(l63.e eVar) {
            eVar.getClass();
            k63.e eVar2 = descriptor;
            l63.c cVarC = eVar.c(eVar2);
            int i14 = l63.c.f110557a;
            int i15 = 0;
            boolean zG = false;
            boolean zG2 = false;
            boolean zG3 = false;
            boolean zG4 = false;
            boolean zG5 = false;
            boolean zG6 = false;
            boolean zG7 = false;
            long jW = 0;
            String strR = null;
            l90.b bVar = null;
            z80.f fVar = null;
            boolean z14 = true;
            while (z14) {
                int iE = cVarC.e(eVar2);
                switch (iE) {
                    case -1:
                        z14 = false;
                        break;
                    case 0:
                        jW = cVarC.w(eVar2, 0);
                        i15 |= 1;
                        break;
                    case 1:
                        strR = cVarC.r(eVar2, 1);
                        i15 |= 2;
                        break;
                    case 2:
                        bVar = (l90.b) cVarC.l(eVar2, 2, l90.b.a.f111532a, bVar);
                        i15 |= 4;
                        break;
                    case 3:
                        zG = cVarC.g(eVar2, 3);
                        i15 |= 8;
                        break;
                    case 4:
                        fVar = (z80.f) cVarC.v(eVar2, 4, z80.f.a.f203051a, fVar);
                        i15 |= 16;
                        break;
                    case 5:
                        zG2 = cVarC.g(eVar2, 5);
                        i15 |= 32;
                        break;
                    case 6:
                        zG3 = cVarC.g(eVar2, 6);
                        i15 |= 64;
                        break;
                    case 7:
                        zG4 = cVarC.g(eVar2, 7);
                        i15 |= 128;
                        break;
                    case 8:
                        zG5 = cVarC.g(eVar2, 8);
                        i15 |= 256;
                        break;
                    case 9:
                        zG6 = cVarC.g(eVar2, 9);
                        i15 |= 512;
                        break;
                    case 10:
                        zG7 = cVarC.g(eVar2, 10);
                        i15 |= 1024;
                        break;
                    default:
                        hb.a.o(iE);
                        return null;
                }
            }
            cVarC.b(eVar2);
            return new c(i15, jW, strR, bVar, zG, fVar, zG2, zG3, zG4, zG5, zG6, zG7, (u1) null);
        }

        @Override // i63.i, i63.b
        /* JADX INFO: renamed from: getDescriptor */
        public final k63.e getF116202c() {
            return descriptor;
        }

        /* JADX WARN: Code duplicated, block: B:19:0x007f  */
        @Override // i63.i
        public final void serialize(l63.f fVar, Object obj) {
            c cVar = (c) obj;
            cVar.getClass();
            boolean z14 = cVar.f143503k;
            boolean z15 = cVar.f143502j;
            boolean z16 = cVar.f143501i;
            boolean z17 = cVar.f143500h;
            boolean z18 = cVar.f143499g;
            boolean z19 = cVar.f143498f;
            z80.f fVar2 = cVar.f143497e;
            boolean z24 = cVar.f143496d;
            l90.b bVar = cVar.f143495c;
            String str = cVar.f143494b;
            long j8 = cVar.f143493a;
            k63.e eVar = descriptor;
            l63.d dVarC = fVar.c(eVar);
            if (dVarC.C(eVar) || j8 != -1) {
                dVarC.z(eVar, 0, j8);
            }
            if (dVarC.C(eVar) || !s.g(str, "")) {
                dVarC.k(eVar, 1, str);
            }
            if (dVarC.C(eVar)) {
                dVarC.e(eVar, 2, l90.b.a.f111532a, bVar);
            } else {
                if (!s.g(bVar, new l90.b((String) null, false, false, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (o90.a) null, false, (j) null, (i) null, (yl2.b) null, (d90.d) null, 65535, (p005kotlin.jvm.internal.j) null))) {
                    dVarC.e(eVar, 2, l90.b.a.f111532a, bVar);
                }
            }
            if (dVarC.C(eVar) || z24) {
                dVarC.n(eVar, 3, z24);
            }
            if (dVarC.C(eVar) || fVar2 != null) {
                dVarC.d(eVar, 4, z80.f.a.f203051a, fVar2);
            }
            if (dVarC.C(eVar) || z19) {
                dVarC.n(eVar, 5, z19);
            }
            if (dVarC.C(eVar) || z18) {
                dVarC.n(eVar, 6, z18);
            }
            if (dVarC.C(eVar) || z17) {
                dVarC.n(eVar, 7, z17);
            }
            if (dVarC.C(eVar) || z16) {
                dVarC.n(eVar, 8, z16);
            }
            if (dVarC.C(eVar) || z15) {
                dVarC.n(eVar, 9, z15);
            }
            if (dVarC.C(eVar) || z14) {
                dVarC.n(eVar, 10, z14);
            }
            dVarC.b(eVar);
        }
    }

    /* JADX INFO: renamed from: q90.c$c, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C2706c implements Parcelable.Creator<c> {
        @Override // android.os.Parcelable.Creator
        public final c createFromParcel(Parcel parcel) {
            boolean z14;
            boolean z15;
            parcel.getClass();
            long j8 = parcel.readLong();
            String string = parcel.readString();
            l90.b bVarCreateFromParcel = l90.b.CREATOR.createFromParcel(parcel);
            boolean z16 = true;
            boolean z17 = parcel.readInt() != 0;
            z80.f fVarCreateFromParcel = parcel.readInt() == 0 ? null : z80.f.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                z16 = false;
            }
            if (parcel.readInt() != 0) {
                z14 = false;
                z15 = z16;
            } else {
                z14 = false;
                z15 = false;
            }
            if (parcel.readInt() == 0) {
                z16 = z14;
            }
            if (parcel.readInt() != 0) {
                z14 = z16;
            }
            if (parcel.readInt() == 0) {
                z16 = z14;
            }
            if (parcel.readInt() != 0) {
                z14 = true;
            }
            return new c(j8, string, bVarCreateFromParcel, z17, fVarCreateFromParcel, z16, z15, z16, z14, z16, z14);
        }

        @Override // android.os.Parcelable.Creator
        public final c[] newArray(int i14) {
            return new c[i14];
        }
    }

    public /* synthetic */ c(int i14, long j8, String str, l90.b bVar, boolean z14, z80.f fVar, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z24, u1 u1Var) {
        this.f143493a = (i14 & 1) == 0 ? -1L : j8;
        this.f143494b = (i14 & 2) == 0 ? "" : str;
        if ((i14 & 4) == 0) {
            this.f143495c = new l90.b((String) null, false, false, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (o90.a) null, false, (j) null, (i) null, (yl2.b) null, (d90.d) null, 65535, (p005kotlin.jvm.internal.j) null);
        } else {
            this.f143495c = bVar;
        }
        if ((i14 & 8) == 0) {
            this.f143496d = false;
        } else {
            this.f143496d = z14;
        }
        this.f143497e = (i14 & 16) == 0 ? null : fVar;
        if ((i14 & 32) == 0) {
            this.f143498f = false;
        } else {
            this.f143498f = z15;
        }
        if ((i14 & 64) == 0) {
            this.f143499g = false;
        } else {
            this.f143499g = z16;
        }
        if ((i14 & 128) == 0) {
            this.f143500h = false;
        } else {
            this.f143500h = z17;
        }
        if ((i14 & 256) == 0) {
            this.f143501i = false;
        } else {
            this.f143501i = z18;
        }
        if ((i14 & 512) == 0) {
            this.f143502j = false;
        } else {
            this.f143502j = z19;
        }
        if ((i14 & 1024) == 0) {
            this.f143503k = false;
        } else {
            this.f143503k = z24;
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
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f143493a == cVar.f143493a && s.g(this.f143494b, cVar.f143494b) && s.g(this.f143495c, cVar.f143495c) && this.f143496d == cVar.f143496d && s.g(this.f143497e, cVar.f143497e) && this.f143498f == cVar.f143498f && this.f143499g == cVar.f143499g && this.f143500h == cVar.f143500h && this.f143501i == cVar.f143501i && this.f143502j == cVar.f143502j && this.f143503k == cVar.f143503k;
    }

    public final int hashCode() {
        int iG = q6.f.g((this.f143495c.hashCode() + wr.g.j(Long.hashCode(this.f143493a) * 31, 31, this.f143494b)) * 31, 31, this.f143496d);
        z80.f fVar = this.f143497e;
        return Boolean.hashCode(this.f143503k) + q6.f.g(q6.f.g(q6.f.g(q6.f.g(q6.f.g((iG + (fVar == null ? 0 : fVar.hashCode())) * 31, 31, this.f143498f), 31, this.f143499g), 31, this.f143500h), 31, this.f143501i), 31, this.f143502j);
    }

    public final String toString() {
        StringBuilder sbK = com.airbnb.lottie.animation.keyframe.a.k(this.f143493a, "PairedDevice(unitId=", ", macAddress=", this.f143494b);
        sbK.append(", compatibleDevice=");
        sbK.append(this.f143495c);
        sbK.append(", shouldSync=");
        sbK.append(this.f143496d);
        sbK.append(", deviceSettings=");
        sbK.append(this.f143497e);
        sbK.append(", connectionModeCapable=");
        sbK.append(this.f143498f);
        com.airbnb.lottie.animation.keyframe.a.v(", applyBackupCapable=", ", lhaBackupCapable=", sbK, this.f143499g, this.f143500h);
        com.airbnb.lottie.animation.keyframe.a.v(", deviceWheelchairCapable=", ", pendingActivityCapable=", sbK, this.f143501i, this.f143502j);
        return com.airbnb.lottie.animation.keyframe.a.i(sbK, ", isScreenlessDevice=", this.f143503k, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeLong(this.f143493a);
        parcel.writeString(this.f143494b);
        this.f143495c.writeToParcel(parcel, i14);
        parcel.writeInt(this.f143496d ? 1 : 0);
        z80.f fVar = this.f143497e;
        if (fVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            fVar.writeToParcel(parcel, i14);
        }
        parcel.writeInt(this.f143498f ? 1 : 0);
        parcel.writeInt(this.f143499g ? 1 : 0);
        parcel.writeInt(this.f143500h ? 1 : 0);
        parcel.writeInt(this.f143501i ? 1 : 0);
        parcel.writeInt(this.f143502j ? 1 : 0);
        parcel.writeInt(this.f143503k ? 1 : 0);
    }

    /* JADX INFO: renamed from: q90.c$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lq90/c$b;", "", "<init>", "()V", "Li63/c;", "Lq90/c;", "serializer", "()Li63/c;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<c> serializer() {
            return a.f143504a;
        }

        private Companion() {
        }
    }

    public c() {
        this(0L, (String) null, (l90.b) null, false, (z80.f) null, false, false, false, false, false, false, 2047, (p005kotlin.jvm.internal.j) null);
    }

    public c(long j8, String str, l90.b bVar, boolean z14, z80.f fVar, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z24) {
        str.getClass();
        bVar.getClass();
        this.f143493a = j8;
        this.f143494b = str;
        this.f143495c = bVar;
        this.f143496d = z14;
        this.f143497e = fVar;
        this.f143498f = z15;
        this.f143499g = z16;
        this.f143500h = z17;
        this.f143501i = z18;
        this.f143502j = z19;
        this.f143503k = z24;
    }

    public /* synthetic */ c(long j8, String str, l90.b bVar, boolean z14, z80.f fVar, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z24, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? -1L : j8, (i14 & 2) != 0 ? "" : str, (i14 & 4) != 0 ? new l90.b((String) null, false, false, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (o90.a) null, false, (j) null, (i) null, (yl2.b) null, (d90.d) null, 65535, (p005kotlin.jvm.internal.j) null) : bVar, (i14 & 8) != 0 ? false : z14, (i14 & 16) != 0 ? null : fVar, (i14 & 32) != 0 ? false : z15, (i14 & 64) != 0 ? false : z16, (i14 & 128) != 0 ? false : z17, (i14 & 256) != 0 ? false : z18, (i14 & 512) != 0 ? false : z19, (i14 & 1024) != 0 ? false : z24);
    }
}
