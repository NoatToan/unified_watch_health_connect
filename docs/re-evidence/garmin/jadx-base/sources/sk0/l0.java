package sk0;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m63.u1;
import m63.y1;
import p005kotlin.Metadata;
import yc.l2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00182\u00020\u0001:\u0002\u0019\u001aB_\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0005\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0005¢\u0006\u0004\b\u0011\u0010\u0012B{\b\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0005\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0005\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0011\u0010\u0017¨\u0006\u001b"}, d2 = {"Lsk0/l0;", "Landroid/os/Parcelable;", "", TtmlNode.ATTR_ID, "name", "Li53/c;", "Luk0/a;", "gear", "Lb63/o;", "firstUseDate", "Lam/x0;", "defaultActivities", "", "addToExistingActivities", "notes", "Ly22/x;", "photos", "<init>", "(Ljava/lang/String;Ljava/lang/String;Li53/c;Lb63/o;Li53/c;ZLjava/lang/String;Li53/c;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Li53/c;Lb63/o;Li53/c;ZLjava/lang/String;Li53/c;Lm63/u1;)V", "Companion", "a", "b", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final /* data */ class l0 implements Parcelable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final o13.l<i63.c<Object>>[] f159719i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f159720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f159721b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i53.c<uk0.a> f159722c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b63.o f159723d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i53.c<am.x0> f159724e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f159725f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f159726g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final i53.c<y22.x> f159727h;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<l0> CREATOR = new c();

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/gear/presentation/menu/CreateCollectionData.$serializer", "Lm63/e0;", "Lsk0/l0;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @o13.e
    public static final /* synthetic */ class a implements m63.e0<l0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f159728a;
        private static final k63.e descriptor;

        static {
            a aVar = new a();
            f159728a = aVar;
            m63.m1 m1Var = new m63.m1("com.garmin.android.apps.connectmobile.gear.presentation.menu.CreateCollectionData", aVar, 8);
            m1Var.j(TtmlNode.ATTR_ID, false);
            m1Var.j("name", false);
            m1Var.j("gear", false);
            m1Var.j("firstUseDate", false);
            m1Var.j("defaultActivities", false);
            m1Var.j("addToExistingActivities", false);
            m1Var.j("notes", false);
            m1Var.j("photos", false);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // m63.e0
        public final i63.c<?>[] childSerializers() {
            o13.l<i63.c<Object>>[] lVarArr = l0.f159719i;
            y1 y1Var = y1.f117048a;
            return new i63.c[]{j63.a.d(y1Var), j63.a.d(y1Var), lVarArr[2].getValue(), h63.k.f82304a, lVarArr[4].getValue(), m63.g.f116948a, j63.a.d(y1Var), lVarArr[7].getValue()};
        }

        @Override // i63.b
        public final Object deserialize(l63.e eVar) {
            eVar.getClass();
            k63.e eVar2 = descriptor;
            l63.c cVarC = eVar.c(eVar2);
            o13.l<i63.c<Object>>[] lVarArr = l0.f159719i;
            int i14 = l63.c.f110557a;
            Object obj = null;
            boolean z14 = true;
            i53.c cVar = null;
            String str = null;
            String str2 = null;
            i53.c cVar2 = null;
            b63.o oVar = null;
            i53.c cVar3 = null;
            String str3 = null;
            int i15 = 0;
            boolean zG = false;
            while (z14) {
                int iE = cVarC.e(eVar2);
                switch (iE) {
                    case -1:
                        z14 = false;
                        break;
                    case 0:
                        str = (String) cVarC.v(eVar2, 0, y1.f117048a, str);
                        i15 |= 1;
                        break;
                    case 1:
                        str2 = (String) cVarC.v(eVar2, 1, y1.f117048a, str2);
                        i15 |= 2;
                        break;
                    case 2:
                        cVar2 = (i53.c) cVarC.l(eVar2, 2, lVarArr[2].getValue(), cVar2);
                        i15 |= 4;
                        break;
                    case 3:
                        oVar = (b63.o) cVarC.l(eVar2, 3, h63.k.f82304a, oVar);
                        i15 |= 8;
                        break;
                    case 4:
                        cVar3 = (i53.c) cVarC.l(eVar2, 4, lVarArr[4].getValue(), cVar3);
                        i15 |= 16;
                        break;
                    case 5:
                        zG = cVarC.g(eVar2, 5);
                        i15 |= 32;
                        break;
                    case 6:
                        str3 = (String) cVarC.v(eVar2, 6, y1.f117048a, str3);
                        i15 |= 64;
                        break;
                    case 7:
                        cVar = (i53.c) cVarC.l(eVar2, 7, lVarArr[7].getValue(), cVar);
                        i15 |= 128;
                        break;
                    default:
                        hb.a.o(iE);
                        return obj;
                }
                obj = null;
            }
            cVarC.b(eVar2);
            return new l0(i15, str, str2, cVar2, oVar, cVar3, zG, str3, cVar, null);
        }

        @Override // i63.i, i63.b
        /* JADX INFO: renamed from: getDescriptor */
        public final k63.e getF158591b() {
            return descriptor;
        }

        @Override // i63.i
        public final void serialize(l63.f fVar, Object obj) {
            l0 l0Var = (l0) obj;
            l0Var.getClass();
            k63.e eVar = descriptor;
            l63.d dVarC = fVar.c(eVar);
            o13.l<i63.c<Object>>[] lVarArr = l0.f159719i;
            y1 y1Var = y1.f117048a;
            dVarC.d(eVar, 0, y1Var, l0Var.f159720a);
            dVarC.d(eVar, 1, y1Var, l0Var.f159721b);
            dVarC.e(eVar, 2, lVarArr[2].getValue(), l0Var.f159722c);
            dVarC.e(eVar, 3, h63.k.f82304a, l0Var.f159723d);
            dVarC.e(eVar, 4, lVarArr[4].getValue(), l0Var.f159724e);
            dVarC.n(eVar, 5, l0Var.f159725f);
            dVarC.d(eVar, 6, y1Var, l0Var.f159726g);
            dVarC.e(eVar, 7, lVarArr[7].getValue(), l0Var.f159727h);
            dVarC.b(eVar);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements Parcelable.Creator<l0> {
        @Override // android.os.Parcelable.Creator
        public final l0 createFromParcel(Parcel parcel) {
            boolean z14;
            parcel.getClass();
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i14 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i14);
            int iD = 0;
            int iA = 0;
            while (true) {
                z14 = true;
                if (iA == i14) {
                    break;
                }
                iA = kg.f.a(uk0.a.CREATOR, parcel, arrayList, iA, 1);
            }
            i53.f fVarJ = i53.a.j(arrayList);
            b63.o oVarA = vk0.g.f178573a.a(parcel);
            int i15 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i15);
            int iD2 = 0;
            while (iD2 != i15) {
                iD2 = lc.u0.d(l0.class, parcel, arrayList2, iD2, 1);
            }
            i53.f fVarJ2 = i53.a.j(arrayList2);
            if (parcel.readInt() == 0) {
                z14 = false;
            }
            String string3 = parcel.readString();
            int i16 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(i16);
            while (iD != i16) {
                iD = lc.u0.d(l0.class, parcel, arrayList3, iD, 1);
            }
            return new l0(string, string2, fVarJ, oVarA, fVarJ2, z14, string3, i53.a.j(arrayList3));
        }

        @Override // android.os.Parcelable.Creator
        public final l0[] newArray(int i14) {
            return new l0[i14];
        }
    }

    static {
        o13.n nVar = o13.n.PUBLICATION;
        f159719i = new o13.l[]{null, null, o13.m.a(nVar, new i0(3)), null, o13.m.a(nVar, new i0(4)), null, null, o13.m.a(nVar, new i0(5))};
    }

    public /* synthetic */ l0(int i14, String str, String str2, i53.c cVar, b63.o oVar, i53.c cVar2, boolean z14, String str3, i53.c cVar3, u1 u1Var) {
        if (255 != (i14 & 255)) {
            m63.k1.h(i14, 255, a.f159728a.getF158591b());
            throw null;
        }
        this.f159720a = str;
        this.f159721b = str2;
        this.f159722c = cVar;
        this.f159723d = oVar;
        this.f159724e = cVar2;
        this.f159725f = z14;
        this.f159726g = str3;
        this.f159727h = cVar3;
    }

    public static l0 b(l0 l0Var, String str, i53.c cVar, b63.o oVar, i53.c cVar2, boolean z14, String str2, i53.c cVar3, int i14) {
        String str3 = str;
        String str4 = l0Var.f159720a;
        if ((i14 & 2) != 0) {
            str3 = l0Var.f159721b;
        }
        if ((i14 & 4) != 0) {
            cVar = l0Var.f159722c;
        }
        if ((i14 & 8) != 0) {
            oVar = l0Var.f159723d;
        }
        if ((i14 & 16) != 0) {
            cVar2 = l0Var.f159724e;
        }
        if ((i14 & 32) != 0) {
            z14 = l0Var.f159725f;
        }
        if ((i14 & 64) != 0) {
            str2 = l0Var.f159726g;
        }
        if ((i14 & 128) != 0) {
            cVar3 = l0Var.f159727h;
        }
        i53.c cVar4 = cVar3;
        l0Var.getClass();
        cVar.getClass();
        oVar.getClass();
        cVar2.getClass();
        cVar4.getClass();
        String str5 = str2;
        boolean z15 = z14;
        i53.c cVar5 = cVar2;
        b63.o oVar2 = oVar;
        return new l0(str4, str3, cVar, oVar2, cVar5, z15, str5, cVar4);
    }

    public final jk0.j d() {
        String string;
        String str = this.f159721b;
        if (str == null || (string = d53.w.i0(str).toString()) == null) {
            string = "";
        }
        String str2 = string;
        i53.c<am.x0> cVar = this.f159724e;
        ArrayList arrayList = new ArrayList(p13.y.r(cVar, 10));
        Iterator<am.x0> it = cVar.iterator();
        while (it.hasNext()) {
            arrayList.add(new jk0.g(it.next().f4358a, Boolean.TRUE, (Boolean) null, 4, (p005kotlin.jvm.internal.j) null));
        }
        return new jk0.j(str2, this.f159723d, this.f159720a, (Long) null, (b63.o) null, this.f159726g, (List) null, arrayList, (List) null, 344, (p005kotlin.jvm.internal.j) null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        return p005kotlin.jvm.internal.s.g(this.f159720a, l0Var.f159720a) && p005kotlin.jvm.internal.s.g(this.f159721b, l0Var.f159721b) && p005kotlin.jvm.internal.s.g(this.f159722c, l0Var.f159722c) && p005kotlin.jvm.internal.s.g(this.f159723d, l0Var.f159723d) && p005kotlin.jvm.internal.s.g(this.f159724e, l0Var.f159724e) && this.f159725f == l0Var.f159725f && p005kotlin.jvm.internal.s.g(this.f159726g, l0Var.f159726g) && p005kotlin.jvm.internal.s.g(this.f159727h, l0Var.f159727h);
    }

    public final int hashCode() {
        String str = this.f159720a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f159721b;
        int iG = q6.f.g(l2.a(this.f159724e, n23.j.a(this.f159723d.f16206a, l2.a(this.f159722c, (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31), 31), 31), 31, this.f159725f);
        String str3 = this.f159726g;
        return this.f159727h.hashCode() + ((iG + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbI = p6.b.i("CreateCollectionData(id=", this.f159720a, ", name=", this.f159721b, ", gear=");
        sbI.append(this.f159722c);
        sbI.append(", firstUseDate=");
        sbI.append(this.f159723d);
        sbI.append(", defaultActivities=");
        sbI.append(this.f159724e);
        sbI.append(", addToExistingActivities=");
        sbI.append(this.f159725f);
        sbI.append(", notes=");
        sbI.append(this.f159726g);
        sbI.append(", photos=");
        sbI.append(this.f159727h);
        sbI.append(")");
        return sbI.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.f159720a);
        parcel.writeString(this.f159721b);
        Iterator itG = j20.x.g(this.f159722c, parcel);
        while (itG.hasNext()) {
            ((uk0.a) itG.next()).writeToParcel(parcel, i14);
        }
        vk0.g.f178573a.b(this.f159723d, parcel);
        Iterator itG2 = j20.x.g(this.f159724e, parcel);
        while (itG2.hasNext()) {
            parcel.writeParcelable((Parcelable) itG2.next(), i14);
        }
        parcel.writeInt(this.f159725f ? 1 : 0);
        parcel.writeString(this.f159726g);
        Iterator itG3 = j20.x.g(this.f159727h, parcel);
        while (itG3.hasNext()) {
            parcel.writeParcelable((Parcelable) itG3.next(), i14);
        }
    }

    /* JADX INFO: renamed from: sk0.l0$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lsk0/l0$b;", "", "<init>", "()V", "Li63/c;", "Lsk0/l0;", "serializer", "()Li63/c;", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<l0> serializer() {
            return a.f159728a;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public l0(String str, String str2, i53.c<uk0.a> cVar, b63.o oVar, i53.c<? extends am.x0> cVar2, boolean z14, String str3, i53.c<y22.x> cVar3) {
        cVar.getClass();
        oVar.getClass();
        cVar2.getClass();
        cVar3.getClass();
        this.f159720a = str;
        this.f159721b = str2;
        this.f159722c = cVar;
        this.f159723d = oVar;
        this.f159724e = cVar2;
        this.f159725f = z14;
        this.f159726g = str3;
        this.f159727h = cVar3;
    }
}
