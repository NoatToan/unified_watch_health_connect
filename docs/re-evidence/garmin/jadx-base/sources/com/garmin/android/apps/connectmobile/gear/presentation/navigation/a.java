package com.garmin.android.apps.connectmobile.gear.presentation.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import b63.u;
import i63.h;
import l63.d;
import l63.f;
import m63.e0;
import m63.k1;
import m63.m1;
import m63.u1;
import m63.y1;
import o13.e;
import o13.l;
import o13.m;
import o13.n;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import ta0.g;
import vk0.j;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00112\u00020\u0001:\u0002\u0012\u0013B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bBW\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/garmin/android/apps/connectmobile/gear/presentation/navigation/a;", "Landroid/os/Parcelable;", "", "mediaUUID", "url", "smallUrl", "mediumUrl", "Lb63/u;", "createdDateUTC", "urlExpirationUTC", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lb63/u;Lb63/u;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lb63/u;Lb63/u;Lm63/u1;)V", "Companion", "a", "b", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@h
public final /* data */ class a implements Parcelable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final l<i63.c<Object>>[] f35686g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f35687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f35688b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f35689c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f35690d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final u f35691e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final u f35692f;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<a> CREATOR = new c();

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.gear.presentation.navigation.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/gear/presentation/navigation/GearImageNavigationDTO.$serializer", "Lm63/e0;", "Lcom/garmin/android/apps/connectmobile/gear/presentation/navigation/a;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @e
    public static final /* synthetic */ class C0620a implements e0<a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0620a f35693a;
        private static final k63.e descriptor;

        static {
            C0620a c0620a = new C0620a();
            f35693a = c0620a;
            m1 m1Var = new m1("com.garmin.android.apps.connectmobile.gear.presentation.navigation.GearImageNavigationDTO", c0620a, 6);
            m1Var.j("mediaUUID", false);
            m1Var.j("url", false);
            m1Var.j("smallUrl", false);
            m1Var.j("mediumUrl", false);
            m1Var.j("createdDate", false);
            m1Var.j("urlExpiration", false);
            descriptor = m1Var;
        }

        private C0620a() {
        }

        @Override // m63.e0
        public final i63.c<?>[] childSerializers() {
            l<i63.c<Object>>[] lVarArr = a.f35686g;
            return new i63.c[]{y1.f117048a, lVarArr[1].getValue(), lVarArr[2].getValue(), lVarArr[3].getValue(), lVarArr[4].getValue(), j63.a.d(lVarArr[5].getValue())};
        }

        @Override // i63.b
        public final Object deserialize(l63.e eVar) {
            eVar.getClass();
            k63.e eVar2 = descriptor;
            l63.c cVarC = eVar.c(eVar2);
            l<i63.c<Object>>[] lVarArr = a.f35686g;
            int i14 = l63.c.f110557a;
            boolean z14 = true;
            int i15 = 0;
            String strR = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            u uVar = null;
            u uVar2 = null;
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
                        str = (String) cVarC.l(eVar2, 1, lVarArr[1].getValue(), str);
                        i15 |= 2;
                        break;
                    case 2:
                        str2 = (String) cVarC.l(eVar2, 2, lVarArr[2].getValue(), str2);
                        i15 |= 4;
                        break;
                    case 3:
                        str3 = (String) cVarC.l(eVar2, 3, lVarArr[3].getValue(), str3);
                        i15 |= 8;
                        break;
                    case 4:
                        uVar = (u) cVarC.l(eVar2, 4, lVarArr[4].getValue(), uVar);
                        i15 |= 16;
                        break;
                    case 5:
                        uVar2 = (u) cVarC.v(eVar2, 5, lVarArr[5].getValue(), uVar2);
                        i15 |= 32;
                        break;
                    default:
                        hb.a.o(iE);
                        return null;
                }
            }
            cVarC.b(eVar2);
            return new a(i15, strR, str, str2, str3, uVar, uVar2, null);
        }

        @Override // i63.i, i63.b
        /* JADX INFO: renamed from: getDescriptor */
        public final k63.e getF158591b() {
            return descriptor;
        }

        @Override // i63.i
        public final void serialize(f fVar, Object obj) {
            a aVar = (a) obj;
            aVar.getClass();
            k63.e eVar = descriptor;
            d dVarC = fVar.c(eVar);
            l<i63.c<Object>>[] lVarArr = a.f35686g;
            dVarC.k(eVar, 0, aVar.f35687a);
            dVarC.e(eVar, 1, lVarArr[1].getValue(), aVar.f35688b);
            dVarC.e(eVar, 2, lVarArr[2].getValue(), aVar.f35689c);
            dVarC.e(eVar, 3, lVarArr[3].getValue(), aVar.f35690d);
            dVarC.e(eVar, 4, lVarArr[4].getValue(), aVar.f35691e);
            dVarC.d(eVar, 5, lVarArr[5].getValue(), aVar.f35692f);
            dVarC.b(eVar);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            parcel.getClass();
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            vk0.h.f178574a.getClass();
            u.Companion companion = u.INSTANCE;
            String string5 = parcel.readString();
            if (string5 == null) {
                vb.h.z("LocalDateTime string not written");
                return null;
            }
            u uVarA = u.Companion.a(companion, string5);
            j.f178576a.getClass();
            String string6 = parcel.readString();
            return new a(string, string2, string3, string4, uVarA, string6 != null ? u.Companion.a(companion, string6) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i14) {
            return new a[i14];
        }
    }

    static {
        n nVar = n.PUBLICATION;
        f35686g = new l[]{null, m.a(nVar, new g(21)), m.a(nVar, new g(22)), m.a(nVar, new g(23)), m.a(nVar, new g(24)), m.a(nVar, new g(25))};
    }

    public /* synthetic */ a(int i14, String str, String str2, String str3, String str4, u uVar, u uVar2, u1 u1Var) {
        if (63 != (i14 & 63)) {
            k1.h(i14, 63, C0620a.f35693a.getF158591b());
            throw null;
        }
        this.f35687a = str;
        this.f35688b = str2;
        this.f35689c = str3;
        this.f35690d = str4;
        this.f35691e = uVar;
        this.f35692f = uVar2;
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
        return s.g(this.f35687a, aVar.f35687a) && s.g(this.f35688b, aVar.f35688b) && s.g(this.f35689c, aVar.f35689c) && s.g(this.f35690d, aVar.f35690d) && s.g(this.f35691e, aVar.f35691e) && s.g(this.f35692f, aVar.f35692f);
    }

    public final int hashCode() {
        int iHashCode = (this.f35691e.f16216a.hashCode() + wr.g.j(wr.g.j(wr.g.j(this.f35687a.hashCode() * 31, 31, this.f35688b), 31, this.f35689c), 31, this.f35690d)) * 31;
        u uVar = this.f35692f;
        return iHashCode + (uVar == null ? 0 : uVar.f16216a.hashCode());
    }

    public final String toString() {
        StringBuilder sbI = p6.b.i("GearImageNavigationDTO(mediaUUID=", this.f35687a, ", url=", this.f35688b, ", smallUrl=");
        sn.a.t(sbI, this.f35689c, ", mediumUrl=", this.f35690d, ", createdDateUTC=");
        sbI.append(this.f35691e);
        sbI.append(", urlExpirationUTC=");
        sbI.append(this.f35692f);
        sbI.append(")");
        return sbI.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.f35687a);
        parcel.writeString(this.f35688b);
        parcel.writeString(this.f35689c);
        parcel.writeString(this.f35690d);
        vk0.h.f178574a.getClass();
        u uVar = this.f35691e;
        uVar.getClass();
        parcel.writeString(uVar.toString());
        j.f178576a.getClass();
        u uVar2 = this.f35692f;
        parcel.writeString(uVar2 != null ? uVar2.toString() : null);
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.gear.presentation.navigation.a$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/gear/presentation/navigation/a$b;", "", "<init>", "()V", "Li63/c;", "Lcom/garmin/android/apps/connectmobile/gear/presentation/navigation/a;", "serializer", "()Li63/c;", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<a> serializer() {
            return C0620a.f35693a;
        }

        private Companion() {
        }
    }

    public a(String str, String str2, String str3, String str4, u uVar, u uVar2) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        uVar.getClass();
        this.f35687a = str;
        this.f35688b = str2;
        this.f35689c = str3;
        this.f35690d = str4;
        this.f35691e = uVar;
        this.f35692f = uVar2;
    }
}
