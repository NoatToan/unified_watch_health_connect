package d90;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import m63.e0;
import m63.m0;
import m63.m1;
import m63.u1;
import o13.l;
import o13.m;
import o13.n;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.j0;
import u62.z;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 !2\u00020\u0001:\u0002\"#B«\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\n\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0011\u0012\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\n\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0018\u001a\u00020\b\u0012\u0010\b\u0002\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\n¢\u0006\u0004\b\u001b\u0010\u001cB±\u0001\b\u0010\u0012\u0006\u0010\u001d\u001a\u00020\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\n\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0011\u0012\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\n\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\u0006\u0010\u0018\u001a\u00020\b\u0012\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\n\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b\u001b\u0010 ¨\u0006$"}, d2 = {"Ld90/d;", "Landroid/os/Parcelable;", "", "deviceImage", "Ld90/i;", "devicePairTutorialConfig", "Ld90/a;", "devicePairConfig", "", "editUserProfileCapable", "", "Lu90/a;", "userProfileWizardSteps", "Lj90/e;", "deviceCustomizationWizardSteps", "Ld90/f;", "deviceSyncConfig", "Ld90/h;", "deviceGestureTutorialConfig", "deviceProductTutorialConfig", "Lr90/a;", "permissionsConfig", "Ld90/g;", "wifiConfig", "favoritesActivitiesConfig", "Ln90/b;", "launchpadItems", "<init>", "(Ljava/lang/Integer;Ld90/i;Ld90/a;ZLjava/util/List;Ljava/util/List;Ld90/f;Ld90/h;Ld90/h;Ljava/util/List;Ld90/g;ZLjava/util/List;)V", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/lang/Integer;Ld90/i;Ld90/a;ZLjava/util/List;Ljava/util/List;Ld90/f;Ld90/h;Ld90/h;Ljava/util/List;Ld90/g;ZLjava/util/List;Lm63/u1;)V", "Companion", "a", "b", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final /* data */ class d implements Parcelable {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final l<i63.c<Object>>[] f58434n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f58435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f58436b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d90.a f58437c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f58438d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<u90.a> f58439e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List<j90.e> f58440f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final f f58441g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final h f58442h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final h f58443i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List<r90.a> f58444j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final g f58445k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f58446l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final List<n90.b> f58447m;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<d> CREATOR = new c();

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/device/setup/domain/config/model/DeviceSetupConfig.$serializer", "Lm63/e0;", "Ld90/d;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @o13.e
    public static final /* synthetic */ class a implements e0<d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f58448a;
        private static final k63.e descriptor;

        static {
            a aVar = new a();
            f58448a = aVar;
            m1 m1Var = new m1("com.garmin.android.apps.connectmobile.device.setup.domain.config.model.DeviceSetupConfig", aVar, 13);
            m1Var.j("deviceImage", true);
            m1Var.j("devicePairTutorialConfig", true);
            m1Var.j("devicePairConfig", true);
            m1Var.j("editUserProfileCapable", true);
            m1Var.j("userProfileWizardSteps", true);
            m1Var.j("deviceCustomizationWizardSteps", true);
            m1Var.j("deviceSyncConfig", true);
            m1Var.j("deviceGestureTutorialConfig", true);
            m1Var.j("deviceProductTutorialConfig", true);
            m1Var.j("permissionsConfig", true);
            m1Var.j("wifiConfig", true);
            m1Var.j("favoritesActivitiesConfig", true);
            m1Var.j("launchpadItems", true);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // m63.e0
        public final i63.c<?>[] childSerializers() {
            l<i63.c<Object>>[] lVarArr = d.f58434n;
            m63.g gVar = m63.g.f116948a;
            h.a aVar = h.a.f58471a;
            return new i63.c[]{j63.a.d(m0.f116981a), j63.a.d(i.a.f58476a), d90.a.C1244a.f58422a, gVar, lVarArr[4].getValue(), lVarArr[5].getValue(), lVarArr[6].getValue(), j63.a.d(aVar), j63.a.d(aVar), lVarArr[9].getValue(), lVarArr[10].getValue(), gVar, j63.a.d(lVarArr[12].getValue())};
        }

        @Override // i63.b
        public final Object deserialize(l63.e eVar) {
            eVar.getClass();
            k63.e eVar2 = descriptor;
            l63.c cVarC = eVar.c(eVar2);
            l<i63.c<Object>>[] lVarArr = d.f58434n;
            int i14 = l63.c.f110557a;
            List list = null;
            g gVar = null;
            List list2 = null;
            h hVar = null;
            boolean z14 = true;
            h hVar2 = null;
            int i15 = 0;
            Integer num = null;
            i iVar = null;
            d90.a aVar = null;
            boolean zG = false;
            List list3 = null;
            List list4 = null;
            f fVar = null;
            boolean zG2 = false;
            while (z14) {
                int iE = cVarC.e(eVar2);
                switch (iE) {
                    case -1:
                        zG = zG;
                        z14 = false;
                        zG = zG;
                        break;
                    case 0:
                        num = (Integer) cVarC.v(eVar2, 0, m0.f116981a, num);
                        i15 |= 1;
                        z14 = z14;
                        zG = zG;
                        break;
                    case 1:
                        iVar = (i) cVarC.v(eVar2, 1, i.a.f58476a, iVar);
                        i15 |= 2;
                        z14 = z14;
                        zG = zG;
                        break;
                    case 2:
                        aVar = (d90.a) cVarC.l(eVar2, 2, d90.a.C1244a.f58422a, aVar);
                        i15 |= 4;
                        z14 = z14;
                        zG = zG;
                        break;
                    case 3:
                        zG = cVarC.g(eVar2, 3);
                        i15 |= 8;
                        z14 = z14;
                        break;
                    case 4:
                        list3 = (List) cVarC.l(eVar2, 4, lVarArr[4].getValue(), list3);
                        i15 |= 16;
                        z14 = z14;
                        zG = zG;
                        break;
                    case 5:
                        list4 = (List) cVarC.l(eVar2, 5, lVarArr[5].getValue(), list4);
                        i15 |= 32;
                        z14 = z14;
                        zG = zG;
                        break;
                    case 6:
                        fVar = (f) cVarC.l(eVar2, 6, lVarArr[6].getValue(), fVar);
                        i15 |= 64;
                        z14 = z14;
                        zG = zG;
                        break;
                    case 7:
                        hVar2 = (h) cVarC.v(eVar2, 7, h.a.f58471a, hVar2);
                        i15 |= 128;
                        z14 = z14;
                        zG = zG;
                        break;
                    case 8:
                        hVar = (h) cVarC.v(eVar2, 8, h.a.f58471a, hVar);
                        i15 |= 256;
                        z14 = z14;
                        zG = zG;
                        break;
                    case 9:
                        list2 = (List) cVarC.l(eVar2, 9, lVarArr[9].getValue(), list2);
                        i15 |= 512;
                        z14 = z14;
                        zG = zG;
                        break;
                    case 10:
                        gVar = (g) cVarC.l(eVar2, 10, lVarArr[10].getValue(), gVar);
                        i15 |= 1024;
                        z14 = z14;
                        zG = zG;
                        break;
                    case 11:
                        zG2 = cVarC.g(eVar2, 11);
                        i15 |= 2048;
                        z14 = z14;
                        break;
                    case 12:
                        list = (List) cVarC.v(eVar2, 12, lVarArr[12].getValue(), list);
                        i15 |= 4096;
                        z14 = z14;
                        zG = zG;
                        break;
                    default:
                        hb.a.o(iE);
                        return null;
                }
            }
            cVarC.b(eVar2);
            return new d(i15, num, iVar, aVar, zG, list3, list4, fVar, hVar2, hVar, list2, gVar, zG2, list, (u1) null);
        }

        @Override // i63.i, i63.b
        /* JADX INFO: renamed from: getDescriptor */
        public final k63.e getF158591b() {
            return descriptor;
        }

        /* JADX WARN: Code duplicated, block: B:19:0x007f  */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // i63.i
        public final void serialize(l63.f fVar, Object obj) {
            d dVar = (d) obj;
            dVar.getClass();
            List<n90.b> list = dVar.f58447m;
            boolean z14 = dVar.f58446l;
            g gVar = dVar.f58445k;
            List<r90.a> list2 = dVar.f58444j;
            h hVar = dVar.f58443i;
            h hVar2 = dVar.f58442h;
            f fVar2 = dVar.f58441g;
            List<j90.e> list3 = dVar.f58440f;
            List<u90.a> list4 = dVar.f58439e;
            boolean z15 = dVar.f58438d;
            d90.a aVar = dVar.f58437c;
            i iVar = dVar.f58436b;
            Integer num = dVar.f58435a;
            k63.e eVar = descriptor;
            l63.d dVarC = fVar.c(eVar);
            l<i63.c<Object>>[] lVarArr = d.f58434n;
            if (dVarC.C(eVar) || num != null) {
                dVarC.d(eVar, 0, m0.f116981a, num);
            }
            if (dVarC.C(eVar) || iVar != null) {
                dVarC.d(eVar, 1, i.a.f58476a, iVar);
            }
            if (dVarC.C(eVar)) {
                dVarC.e(eVar, 2, d90.a.C1244a.f58422a, aVar);
            } else {
                if (!s.g(aVar, new d90.a((Integer) null, false, false, false, (e) null, (b) null, (e) null, (e) null, (e) null, (String) null, 1023, (p005kotlin.jvm.internal.j) null))) {
                    dVarC.e(eVar, 2, d90.a.C1244a.f58422a, aVar);
                }
            }
            if (dVarC.C(eVar) || z15) {
                dVarC.n(eVar, 3, z15);
            }
            if (dVarC.C(eVar) || !s.g(list4, j0.f134944a)) {
                dVarC.e(eVar, 4, (i63.i) lVarArr[4].getValue(), list4);
            }
            if (dVarC.C(eVar) || !s.g(list3, j0.f134944a)) {
                dVarC.e(eVar, 5, (i63.i) lVarArr[5].getValue(), list3);
            }
            if (dVarC.C(eVar) || !s.g(fVar2, f.b.INSTANCE)) {
                dVarC.e(eVar, 6, (i63.i) lVarArr[6].getValue(), fVar2);
            }
            if (dVarC.C(eVar) || hVar2 != null) {
                dVarC.d(eVar, 7, h.a.f58471a, hVar2);
            }
            if (dVarC.C(eVar) || hVar != null) {
                dVarC.d(eVar, 8, h.a.f58471a, hVar);
            }
            if (dVarC.C(eVar) || !s.g(list2, j0.f134944a)) {
                dVarC.e(eVar, 9, (i63.i) lVarArr[9].getValue(), list2);
            }
            if (dVarC.C(eVar) || gVar != g.NONE) {
                dVarC.e(eVar, 10, (i63.i) lVarArr[10].getValue(), gVar);
            }
            if (dVarC.C(eVar) || z14) {
                dVarC.n(eVar, 11, z14);
            }
            if (dVarC.C(eVar) || list != 0) {
                dVarC.d(eVar, 12, lVarArr[12].getValue(), list);
            }
            dVarC.b(eVar);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements Parcelable.Creator<d> {
        @Override // android.os.Parcelable.Creator
        public final d createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Parcel parcel2 = parcel;
            parcel2.getClass();
            Integer numValueOf = parcel2.readInt() == 0 ? null : Integer.valueOf(parcel2.readInt());
            i iVarCreateFromParcel = parcel2.readInt() == 0 ? null : i.CREATOR.createFromParcel(parcel2);
            d90.a aVarCreateFromParcel = d90.a.CREATOR.createFromParcel(parcel2);
            int i14 = 0;
            boolean z14 = true;
            if (parcel2.readInt() == 0) {
                z14 = false;
            }
            int i15 = parcel2.readInt();
            ArrayList arrayList2 = new ArrayList(i15);
            for (int i16 = 0; i16 != i15; i16++) {
                arrayList2.add(u90.a.valueOf(parcel2.readString()));
            }
            int i17 = parcel2.readInt();
            ArrayList arrayList3 = new ArrayList(i17);
            for (int i18 = 0; i18 != i17; i18++) {
                arrayList3.add(j90.e.valueOf(parcel2.readString()));
            }
            f fVar = (f) parcel2.readParcelable(d.class.getClassLoader());
            h hVarCreateFromParcel = parcel2.readInt() == 0 ? null : h.CREATOR.createFromParcel(parcel2);
            h hVarCreateFromParcel2 = parcel2.readInt() == 0 ? null : h.CREATOR.createFromParcel(parcel2);
            int i19 = parcel2.readInt();
            ArrayList arrayList4 = new ArrayList(i19);
            for (int i24 = 0; i24 != i19; i24++) {
                arrayList4.add(r90.a.valueOf(parcel2.readString()));
            }
            g gVarValueOf = g.valueOf(parcel2.readString());
            boolean z15 = parcel2.readInt() != 0;
            if (parcel2.readInt() == 0) {
                arrayList = null;
            } else {
                int i25 = parcel2.readInt();
                ArrayList arrayList5 = new ArrayList(i25);
                while (i14 != i25) {
                    arrayList5.add(n90.b.valueOf(parcel2.readString()));
                    i14++;
                    parcel2 = parcel;
                }
                arrayList = arrayList5;
            }
            return new d(numValueOf, iVarCreateFromParcel, aVarCreateFromParcel, z14, arrayList2, arrayList3, fVar, hVarCreateFromParcel, hVarCreateFromParcel2, arrayList4, gVarValueOf, z15, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final d[] newArray(int i14) {
            return new d[i14];
        }
    }

    static {
        n nVar = n.PUBLICATION;
        f58434n = new l[]{null, null, null, null, m.a(nVar, new d4.h(10)), m.a(nVar, new d4.h(11)), m.a(nVar, new d4.h(12)), null, null, m.a(nVar, new d4.h(13)), m.a(nVar, new d4.h(14)), null, m.a(nVar, new d4.h(15))};
    }

    public d(int i14, Integer num, i iVar, d90.a aVar, boolean z14, List list, List list2, f fVar, h hVar, h hVar2, List list3, g gVar, boolean z15, List list4, u1 u1Var) {
        if ((i14 & 1) == 0) {
            this.f58435a = null;
        } else {
            this.f58435a = num;
        }
        if ((i14 & 2) == 0) {
            this.f58436b = null;
        } else {
            this.f58436b = iVar;
        }
        if ((i14 & 4) == 0) {
            this.f58437c = new d90.a((Integer) null, false, false, false, (e) null, (b) null, (e) null, (e) null, (e) null, (String) null, 1023, (p005kotlin.jvm.internal.j) null);
        } else {
            this.f58437c = aVar;
        }
        if ((i14 & 8) == 0) {
            this.f58438d = false;
        } else {
            this.f58438d = z14;
        }
        this.f58439e = (i14 & 16) == 0 ? j0.f134944a : list;
        this.f58440f = (i14 & 32) == 0 ? j0.f134944a : list2;
        this.f58441g = (i14 & 64) == 0 ? f.b.INSTANCE : fVar;
        if ((i14 & 128) == 0) {
            this.f58442h = null;
        } else {
            this.f58442h = hVar;
        }
        if ((i14 & 256) == 0) {
            this.f58443i = null;
        } else {
            this.f58443i = hVar2;
        }
        this.f58444j = (i14 & 512) == 0 ? j0.f134944a : list3;
        this.f58445k = (i14 & 1024) == 0 ? g.NONE : gVar;
        if ((i14 & 2048) == 0) {
            this.f58446l = false;
        } else {
            this.f58446l = z15;
        }
        if ((i14 & 4096) == 0) {
            this.f58447m = null;
        } else {
            this.f58447m = list4;
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
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return s.g(this.f58435a, dVar.f58435a) && s.g(this.f58436b, dVar.f58436b) && s.g(this.f58437c, dVar.f58437c) && this.f58438d == dVar.f58438d && s.g(this.f58439e, dVar.f58439e) && s.g(this.f58440f, dVar.f58440f) && s.g(this.f58441g, dVar.f58441g) && s.g(this.f58442h, dVar.f58442h) && s.g(this.f58443i, dVar.f58443i) && s.g(this.f58444j, dVar.f58444j) && this.f58445k == dVar.f58445k && this.f58446l == dVar.f58446l && s.g(this.f58447m, dVar.f58447m);
    }

    public final int hashCode() {
        Integer num = this.f58435a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        i iVar = this.f58436b;
        int iHashCode2 = (this.f58441g.hashCode() + u0.b(u0.b(q6.f.g((this.f58437c.hashCode() + ((iHashCode + (iVar == null ? 0 : iVar.hashCode())) * 31)) * 31, 31, this.f58438d), 31, this.f58439e), 31, this.f58440f)) * 31;
        h hVar = this.f58442h;
        int iHashCode3 = (iHashCode2 + (hVar == null ? 0 : hVar.hashCode())) * 31;
        h hVar2 = this.f58443i;
        int iG = q6.f.g((this.f58445k.hashCode() + u0.b((iHashCode3 + (hVar2 == null ? 0 : hVar2.hashCode())) * 31, 31, this.f58444j)) * 31, 31, this.f58446l);
        List<n90.b> list = this.f58447m;
        return iG + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("DeviceSetupConfig(deviceImage=");
        sb3.append(this.f58435a);
        sb3.append(", devicePairTutorialConfig=");
        sb3.append(this.f58436b);
        sb3.append(", devicePairConfig=");
        sb3.append(this.f58437c);
        sb3.append(", editUserProfileCapable=");
        sb3.append(this.f58438d);
        sb3.append(", userProfileWizardSteps=");
        n23.j.z(sb3, this.f58439e, ", deviceCustomizationWizardSteps=", this.f58440f, ", deviceSyncConfig=");
        sb3.append(this.f58441g);
        sb3.append(", deviceGestureTutorialConfig=");
        sb3.append(this.f58442h);
        sb3.append(", deviceProductTutorialConfig=");
        sb3.append(this.f58443i);
        sb3.append(", permissionsConfig=");
        sb3.append(this.f58444j);
        sb3.append(", wifiConfig=");
        sb3.append(this.f58445k);
        sb3.append(", favoritesActivitiesConfig=");
        sb3.append(this.f58446l);
        sb3.append(", launchpadItems=");
        return z.c(sb3, this.f58447m, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        Integer num = this.f58435a;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
        i iVar = this.f58436b;
        if (iVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            iVar.writeToParcel(parcel, i14);
        }
        this.f58437c.writeToParcel(parcel, i14);
        parcel.writeInt(this.f58438d ? 1 : 0);
        Iterator itE = kg.f.e(this.f58439e, parcel);
        while (itE.hasNext()) {
            parcel.writeString(((u90.a) itE.next()).name());
        }
        Iterator itE2 = kg.f.e(this.f58440f, parcel);
        while (itE2.hasNext()) {
            parcel.writeString(((j90.e) itE2.next()).name());
        }
        parcel.writeParcelable(this.f58441g, i14);
        h hVar = this.f58442h;
        if (hVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            hVar.writeToParcel(parcel, i14);
        }
        h hVar2 = this.f58443i;
        if (hVar2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            hVar2.writeToParcel(parcel, i14);
        }
        Iterator itE3 = kg.f.e(this.f58444j, parcel);
        while (itE3.hasNext()) {
            parcel.writeString(((r90.a) itE3.next()).name());
        }
        parcel.writeString(this.f58445k.name());
        parcel.writeInt(this.f58446l ? 1 : 0);
        List<n90.b> list = this.f58447m;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itO = u0.o(parcel, list, 1);
        while (itO.hasNext()) {
            parcel.writeString(((n90.b) itO.next()).name());
        }
    }

    /* JADX INFO: renamed from: d90.d$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ld90/d$b;", "", "<init>", "()V", "Li63/c;", "Ld90/d;", "serializer", "()Li63/c;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<d> serializer() {
            return a.f58448a;
        }

        private Companion() {
        }
    }

    public d() {
        this((Integer) null, (i) null, (d90.a) null, false, (List) null, (List) null, (f) null, (h) null, (h) null, (List) null, (g) null, false, (List) null, 8191, (p005kotlin.jvm.internal.j) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(Integer num, i iVar, d90.a aVar, boolean z14, List<? extends u90.a> list, List<? extends j90.e> list2, f fVar, h hVar, h hVar2, List<? extends r90.a> list3, g gVar, boolean z15, List<? extends n90.b> list4) {
        aVar.getClass();
        list.getClass();
        list2.getClass();
        fVar.getClass();
        list3.getClass();
        gVar.getClass();
        this.f58435a = num;
        this.f58436b = iVar;
        this.f58437c = aVar;
        this.f58438d = z14;
        this.f58439e = list;
        this.f58440f = list2;
        this.f58441g = fVar;
        this.f58442h = hVar;
        this.f58443i = hVar2;
        this.f58444j = list3;
        this.f58445k = gVar;
        this.f58446l = z15;
        this.f58447m = list4;
    }

    public d(Integer num, i iVar, d90.a aVar, boolean z14, List list, List list2, f fVar, h hVar, h hVar2, List list3, g gVar, boolean z15, List list4, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : num, (i14 & 2) != 0 ? null : iVar, (i14 & 4) != 0 ? new d90.a((Integer) null, false, false, false, (e) null, (b) null, (e) null, (e) null, (e) null, (String) null, 1023, (p005kotlin.jvm.internal.j) null) : aVar, (i14 & 8) != 0 ? false : z14, (i14 & 16) != 0 ? j0.f134944a : list, (i14 & 32) != 0 ? j0.f134944a : list2, (i14 & 64) != 0 ? f.b.INSTANCE : fVar, (i14 & 128) != 0 ? null : hVar, (i14 & 256) != 0 ? null : hVar2, (i14 & 512) != 0 ? j0.f134944a : list3, (i14 & 1024) != 0 ? g.NONE : gVar, (i14 & 2048) == 0 ? z15 : false, (i14 & 4096) != 0 ? null : list4);
    }
}
