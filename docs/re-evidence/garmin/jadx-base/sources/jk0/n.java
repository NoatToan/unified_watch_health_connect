package jk0;

import android.os.Parcel;
import android.os.Parcelable;
import m63.e0;
import m63.k1;
import m63.m1;
import m63.u1;
import m63.y1;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00112\u00020\u0001:\u0002\u0012\u0013B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bBW\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010¨\u0006\u0014"}, d2 = {"Ljk0/n;", "Landroid/os/Parcelable;", "", "mediaUUID", "url", "smallUrl", "mediumUrl", "Lb63/u;", "createdDateUTC", "urlExpirationUTC", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lb63/u;Lb63/u;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lb63/u;Lb63/u;Lm63/u1;)V", "Companion", "a", "b", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final /* data */ class n implements Parcelable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final o13.l<i63.c<Object>>[] f99294g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f99295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f99296b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f99297c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f99298d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b63.u f99299e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b63.u f99300f;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<n> CREATOR = new c();

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/gear/data/model/GearImageDTO.$serializer", "Lm63/e0;", "Ljk0/n;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @o13.e
    public static final /* synthetic */ class a implements e0<n> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f99301a;
        private static final k63.e descriptor;

        static {
            a aVar = new a();
            f99301a = aVar;
            m1 m1Var = new m1("com.garmin.android.apps.connectmobile.gear.data.model.GearImageDTO", aVar, 6);
            m1Var.j("mediaUUID", false);
            m1Var.j("url", false);
            m1Var.j("smallUrl", false);
            m1Var.j("mediumUrl", false);
            m1Var.j("createdDate", true);
            m1Var.j("urlExpiration", true);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // m63.e0
        public final i63.c<?>[] childSerializers() {
            o13.l<i63.c<Object>>[] lVarArr = n.f99294g;
            y1 y1Var = y1.f117048a;
            return new i63.c[]{y1Var, y1Var, y1Var, y1Var, lVarArr[4].getValue(), j63.a.d(lVarArr[5].getValue())};
        }

        @Override // i63.b
        public final Object deserialize(l63.e eVar) {
            eVar.getClass();
            k63.e eVar2 = descriptor;
            l63.c cVarC = eVar.c(eVar2);
            o13.l<i63.c<Object>>[] lVarArr = n.f99294g;
            int i14 = l63.c.f110557a;
            boolean z14 = true;
            int i15 = 0;
            String strR = null;
            String strR2 = null;
            String strR3 = null;
            String strR4 = null;
            b63.u uVar = null;
            b63.u uVar2 = null;
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
                        strR2 = cVarC.r(eVar2, 1);
                        i15 |= 2;
                        break;
                    case 2:
                        strR3 = cVarC.r(eVar2, 2);
                        i15 |= 4;
                        break;
                    case 3:
                        strR4 = cVarC.r(eVar2, 3);
                        i15 |= 8;
                        break;
                    case 4:
                        uVar = (b63.u) cVarC.l(eVar2, 4, lVarArr[4].getValue(), uVar);
                        i15 |= 16;
                        break;
                    case 5:
                        uVar2 = (b63.u) cVarC.v(eVar2, 5, lVarArr[5].getValue(), uVar2);
                        i15 |= 32;
                        break;
                    default:
                        hb.a.o(iE);
                        return null;
                }
            }
            cVarC.b(eVar2);
            return new n(i15, strR, strR2, strR3, strR4, uVar, uVar2, (u1) null);
        }

        @Override // i63.i, i63.b
        /* JADX INFO: renamed from: getDescriptor */
        public final k63.e getF94809a() {
            return descriptor;
        }

        @Override // i63.i
        public final void serialize(l63.f fVar, Object obj) {
            n nVar = (n) obj;
            nVar.getClass();
            k63.e eVar = descriptor;
            l63.d dVarC = fVar.c(eVar);
            o13.l<i63.c<Object>>[] lVarArr = n.f99294g;
            String str = nVar.f99295a;
            b63.u uVar = nVar.f99300f;
            b63.u uVar2 = nVar.f99299e;
            dVarC.k(eVar, 0, str);
            dVarC.k(eVar, 1, nVar.f99296b);
            dVarC.k(eVar, 2, nVar.f99297c);
            dVarC.k(eVar, 3, nVar.f99298d);
            if (dVarC.C(eVar) || !p005kotlin.jvm.internal.s.g(uVar2, g22.l.e(b63.u.INSTANCE))) {
                dVarC.e(eVar, 4, lVarArr[4].getValue(), uVar2);
            }
            if (dVarC.C(eVar) || uVar != null) {
                dVarC.d(eVar, 5, lVarArr[5].getValue(), uVar);
            }
            dVarC.b(eVar);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements Parcelable.Creator<n> {
        @Override // android.os.Parcelable.Creator
        public final n createFromParcel(Parcel parcel) {
            parcel.getClass();
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            vk0.h.f178574a.getClass();
            b63.u.Companion companion = b63.u.INSTANCE;
            String string5 = parcel.readString();
            if (string5 == null) {
                vb.h.z("LocalDateTime string not written");
                return null;
            }
            b63.u uVarA = b63.u.Companion.a(companion, string5);
            vk0.j.f178576a.getClass();
            String string6 = parcel.readString();
            return new n(string, string2, string3, string4, uVarA, string6 != null ? b63.u.Companion.a(companion, string6) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final n[] newArray(int i14) {
            return new n[i14];
        }
    }

    static {
        o13.n nVar = o13.n.PUBLICATION;
        f99294g = new o13.l[]{null, null, null, null, o13.m.a(nVar, new je0.o(18)), o13.m.a(nVar, new je0.o(19))};
    }

    public /* synthetic */ n(int i14, String str, String str2, String str3, String str4, b63.u uVar, b63.u uVar2, u1 u1Var) {
        if (15 != (i14 & 15)) {
            k1.h(i14, 15, a.f99301a.getF94809a());
            throw null;
        }
        this.f99295a = str;
        this.f99296b = str2;
        this.f99297c = str3;
        this.f99298d = str4;
        if ((i14 & 16) == 0) {
            this.f99299e = g22.l.e(b63.u.INSTANCE);
        } else {
            this.f99299e = uVar;
        }
        if ((i14 & 32) == 0) {
            this.f99300f = null;
        } else {
            this.f99300f = uVar2;
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
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return p005kotlin.jvm.internal.s.g(this.f99295a, nVar.f99295a) && p005kotlin.jvm.internal.s.g(this.f99296b, nVar.f99296b) && p005kotlin.jvm.internal.s.g(this.f99297c, nVar.f99297c) && p005kotlin.jvm.internal.s.g(this.f99298d, nVar.f99298d) && p005kotlin.jvm.internal.s.g(this.f99299e, nVar.f99299e) && p005kotlin.jvm.internal.s.g(this.f99300f, nVar.f99300f);
    }

    public final int hashCode() {
        int iHashCode = (this.f99299e.f16216a.hashCode() + wr.g.j(wr.g.j(wr.g.j(this.f99295a.hashCode() * 31, 31, this.f99296b), 31, this.f99297c), 31, this.f99298d)) * 31;
        b63.u uVar = this.f99300f;
        return iHashCode + (uVar == null ? 0 : uVar.f16216a.hashCode());
    }

    public final String toString() {
        StringBuilder sbI = p6.b.i("GearImageDTO(mediaUUID=", this.f99295a, ", url=", this.f99296b, ", smallUrl=");
        sn.a.t(sbI, this.f99297c, ", mediumUrl=", this.f99298d, ", createdDateUTC=");
        sbI.append(this.f99299e);
        sbI.append(", urlExpirationUTC=");
        sbI.append(this.f99300f);
        sbI.append(")");
        return sbI.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.f99295a);
        parcel.writeString(this.f99296b);
        parcel.writeString(this.f99297c);
        parcel.writeString(this.f99298d);
        vk0.h.f178574a.getClass();
        b63.u uVar = this.f99299e;
        uVar.getClass();
        parcel.writeString(uVar.toString());
        vk0.j.f178576a.getClass();
        b63.u uVar2 = this.f99300f;
        parcel.writeString(uVar2 != null ? uVar2.toString() : null);
    }

    /* JADX INFO: renamed from: jk0.n$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ljk0/n$b;", "", "<init>", "()V", "Li63/c;", "Ljk0/n;", "serializer", "()Li63/c;", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<n> serializer() {
            return a.f99301a;
        }

        private Companion() {
        }
    }

    public n(String str, String str2, String str3, String str4, b63.u uVar, b63.u uVar2) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        uVar.getClass();
        this.f99295a = str;
        this.f99296b = str2;
        this.f99297c = str3;
        this.f99298d = str4;
        this.f99299e = uVar;
        this.f99300f = uVar2;
    }

    public /* synthetic */ n(String str, String str2, String str3, String str4, b63.u uVar, b63.u uVar2, int i14, p005kotlin.jvm.internal.j jVar) {
        this(str, str2, str3, str4, (i14 & 16) != 0 ? g22.l.e(b63.u.INSTANCE) : uVar, (i14 & 32) != 0 ? null : uVar2);
    }
}
