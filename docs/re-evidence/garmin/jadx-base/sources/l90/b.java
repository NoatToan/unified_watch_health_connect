package l90;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import l72.o2;
import m63.e0;
import m63.m1;
import m63.u1;
import m63.y1;
import o13.l;
import o13.m;
import o13.n;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 !2\u00020\u0001:\u0002\"#B¹\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bB»\u0001\b\u0010\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0004\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b\u001a\u0010 ¨\u0006$"}, d2 = {"Ll90/b;", "Landroid/os/Parcelable;", "", "applicationKey", "", "bluetoothClassicDevice", "bluetoothLowEnergyDevice", "", "deviceCategories", "deviceTags", "productDisplayName", "productNumber", "productSku", "partNumber", "serialNumber", "Lo90/a;", "image", "primary", "Ll90/j;", "primaryApplication", "Ll90/i;", "externalDeviceSetup", "Lyl2/b;", "deviceType", "Ld90/d;", "deviceSetupConfig", "<init>", "(Ljava/lang/String;ZZLjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo90/a;ZLl90/j;Ll90/i;Lyl2/b;Ld90/d;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/lang/String;ZZLjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo90/a;ZLl90/j;Ll90/i;Lyl2/b;Ld90/d;Lm63/u1;)V", "Companion", "a", "b", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final /* data */ class b implements Parcelable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final l<i63.c<Object>>[] f111515q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f111516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f111517b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f111518c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<String> f111519d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f111520e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f111521f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f111522g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f111523h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f111524i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f111525j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final o90.a f111526k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f111527l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final j f111528m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final i f111529n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final yl2.b f111530o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final d90.d f111531p;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<b> CREATOR = new c();

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/device/setup/domain/discovery/model/CompatibleDevice.$serializer", "Lm63/e0;", "Ll90/b;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @o13.e
    public static final /* synthetic */ class a implements e0<b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f111532a;
        private static final k63.e descriptor;

        static {
            a aVar = new a();
            f111532a = aVar;
            m1 m1Var = new m1("com.garmin.android.apps.connectmobile.device.setup.domain.discovery.model.CompatibleDevice", aVar, 16);
            m1Var.j("applicationKey", true);
            m1Var.j("bluetoothClassicDevice", true);
            m1Var.j("bluetoothLowEnergyDevice", true);
            m1Var.j("deviceCategories", true);
            m1Var.j("deviceTags", true);
            m1Var.j("productDisplayName", true);
            m1Var.j("productNumber", true);
            m1Var.j("productSku", true);
            m1Var.j("partNumber", true);
            m1Var.j("serialNumber", true);
            m1Var.j("image", true);
            m1Var.j("primary", true);
            m1Var.j("primaryApplication", true);
            m1Var.j("externalDeviceSetup", true);
            m1Var.j("deviceType", true);
            m1Var.j("deviceSetupConfig", true);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // m63.e0
        public final i63.c<?>[] childSerializers() {
            l<i63.c<Object>>[] lVarArr = b.f111515q;
            y1 y1Var = y1.f117048a;
            m63.g gVar = m63.g.f116948a;
            return new i63.c[]{y1Var, gVar, gVar, j63.a.d(lVarArr[3].getValue()), j63.a.d(y1Var), y1Var, y1Var, j63.a.d(y1Var), y1Var, j63.a.d(y1Var), o90.a.C2487a.f130970a, gVar, j63.a.d(lVarArr[12].getValue()), j63.a.d(lVarArr[13].getValue()), lVarArr[14].getValue(), d90.d.a.f58448a};
        }

        @Override // i63.b
        public final Object deserialize(l63.e eVar) {
            eVar.getClass();
            k63.e eVar2 = descriptor;
            l63.c cVarC = eVar.c(eVar2);
            l<i63.c<Object>>[] lVarArr = b.f111515q;
            int i14 = l63.c.f110557a;
            i iVar = null;
            j jVar = null;
            o90.a aVar = null;
            String str = null;
            yl2.b bVar = null;
            String str2 = null;
            int i15 = 0;
            d90.d dVar = null;
            boolean zG = false;
            boolean zG2 = false;
            List list = null;
            String str3 = null;
            String strR = null;
            String strR2 = null;
            String strR3 = null;
            boolean zG3 = false;
            boolean z14 = true;
            String strR4 = null;
            while (z14) {
                int iE = cVarC.e(eVar2);
                switch (iE) {
                    case -1:
                        zG2 = zG2;
                        z14 = false;
                        zG2 = zG2;
                        break;
                    case 0:
                        strR4 = cVarC.r(eVar2, 0);
                        i15 |= 1;
                        zG = zG;
                        zG2 = zG2;
                        break;
                    case 1:
                        zG2 = zG2;
                        i15 |= 2;
                        zG = cVarC.g(eVar2, 1);
                        zG2 = zG2;
                        break;
                    case 2:
                        zG2 = cVarC.g(eVar2, 2);
                        i15 |= 4;
                        zG = zG;
                        break;
                    case 3:
                        list = (List) cVarC.v(eVar2, 3, lVarArr[3].getValue(), list);
                        i15 |= 8;
                        zG = zG;
                        zG2 = zG2;
                        break;
                    case 4:
                        str3 = (String) cVarC.v(eVar2, 4, y1.f117048a, str3);
                        i15 |= 16;
                        zG = zG;
                        zG2 = zG2;
                        break;
                    case 5:
                        strR = cVarC.r(eVar2, 5);
                        i15 |= 32;
                        zG = zG;
                        break;
                    case 6:
                        strR2 = cVarC.r(eVar2, 6);
                        i15 |= 64;
                        zG = zG;
                        break;
                    case 7:
                        str2 = (String) cVarC.v(eVar2, 7, y1.f117048a, str2);
                        i15 |= 128;
                        zG = zG;
                        zG2 = zG2;
                        break;
                    case 8:
                        strR3 = cVarC.r(eVar2, 8);
                        i15 |= 256;
                        zG = zG;
                        break;
                    case 9:
                        str = (String) cVarC.v(eVar2, 9, y1.f117048a, str);
                        i15 |= 512;
                        zG = zG;
                        zG2 = zG2;
                        break;
                    case 10:
                        aVar = (o90.a) cVarC.l(eVar2, 10, o90.a.C2487a.f130970a, aVar);
                        i15 |= 1024;
                        zG = zG;
                        zG2 = zG2;
                        break;
                    case 11:
                        zG3 = cVarC.g(eVar2, 11);
                        i15 |= 2048;
                        zG = zG;
                        break;
                    case 12:
                        jVar = (j) cVarC.v(eVar2, 12, lVarArr[12].getValue(), jVar);
                        i15 |= 4096;
                        zG = zG;
                        zG2 = zG2;
                        break;
                    case 13:
                        iVar = (i) cVarC.v(eVar2, 13, lVarArr[13].getValue(), iVar);
                        i15 |= 8192;
                        zG = zG;
                        zG2 = zG2;
                        break;
                    case 14:
                        bVar = (yl2.b) cVarC.l(eVar2, 14, lVarArr[14].getValue(), bVar);
                        i15 |= 16384;
                        zG = zG;
                        zG2 = zG2;
                        break;
                    case 15:
                        dVar = (d90.d) cVarC.l(eVar2, 15, d90.d.a.f58448a, dVar);
                        i15 |= 32768;
                        zG = zG;
                        zG2 = zG2;
                        break;
                    default:
                        hb.a.o(iE);
                        return null;
                }
            }
            cVarC.b(eVar2);
            return new b(i15, strR4, zG, zG2, list, str3, strR, strR2, str2, strR3, str, aVar, zG3, jVar, iVar, bVar, dVar, (u1) null);
        }

        @Override // i63.i, i63.b
        /* JADX INFO: renamed from: getDescriptor */
        public final k63.e getF116202c() {
            return descriptor;
        }

        /* JADX WARN: Code duplicated, block: B:64:0x010d  */
        /* JADX WARN: Code duplicated, block: B:88:0x0174  */
        /* JADX WARN: Code duplicated, block: B:89:0x0177  */
        @Override // i63.i
        public final void serialize(l63.f fVar, Object obj) {
            yl2.b bVar;
            d90.d dVar;
            b bVar2 = (b) obj;
            bVar2.getClass();
            d90.d dVar2 = bVar2.f111531p;
            yl2.b bVar3 = bVar2.f111530o;
            i iVar = bVar2.f111529n;
            j jVar = bVar2.f111528m;
            boolean z14 = bVar2.f111527l;
            o90.a aVar = bVar2.f111526k;
            String str = bVar2.f111525j;
            String str2 = bVar2.f111524i;
            String str3 = bVar2.f111523h;
            String str4 = bVar2.f111522g;
            String str5 = bVar2.f111521f;
            String str6 = bVar2.f111520e;
            List<String> list = bVar2.f111519d;
            boolean z15 = bVar2.f111518c;
            boolean z16 = bVar2.f111517b;
            String str7 = bVar2.f111516a;
            k63.e eVar = descriptor;
            l63.d dVarC = fVar.c(eVar);
            l<i63.c<Object>>[] lVarArr = b.f111515q;
            if (dVarC.C(eVar) || !s.g(str7, "")) {
                dVarC.k(eVar, 0, str7);
            }
            if (dVarC.C(eVar) || z16) {
                dVarC.n(eVar, 1, z16);
            }
            if (dVarC.C(eVar) || !z15) {
                dVarC.n(eVar, 2, z15);
            }
            if (dVarC.C(eVar) || list != null) {
                dVarC.d(eVar, 3, lVarArr[3].getValue(), list);
            }
            if (dVarC.C(eVar) || str6 != null) {
                dVarC.d(eVar, 4, y1.f117048a, str6);
            }
            if (dVarC.C(eVar) || !s.g(str5, "")) {
                dVarC.k(eVar, 5, str5);
            }
            if (dVarC.C(eVar) || !s.g(str4, "")) {
                dVarC.k(eVar, 6, str4);
            }
            if (dVarC.C(eVar) || str3 != null) {
                dVarC.d(eVar, 7, y1.f117048a, str3);
            }
            if (dVarC.C(eVar) || !s.g(str2, "")) {
                dVarC.k(eVar, 8, str2);
            }
            if (dVarC.C(eVar) || !s.g(str, "")) {
                dVarC.d(eVar, 9, y1.f117048a, str);
            }
            if (dVarC.C(eVar)) {
                dVarC.e(eVar, 10, o90.a.C2487a.f130970a, aVar);
            } else {
                if (!s.g(aVar, new o90.a((String) null, (Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 255, (p005kotlin.jvm.internal.j) null))) {
                    dVarC.e(eVar, 10, o90.a.C2487a.f130970a, aVar);
                }
            }
            if (dVarC.C(eVar) || !z14) {
                dVarC.n(eVar, 11, z14);
            }
            if (dVarC.C(eVar) || jVar != 0) {
                dVarC.d(eVar, 12, lVarArr[12].getValue(), jVar);
            }
            if (dVarC.C(eVar) || iVar != null) {
                dVarC.d(eVar, 13, lVarArr[13].getValue(), iVar);
            }
            if (!dVarC.C(eVar)) {
                bVar = bVar3;
                if (bVar != yl2.b.f197686f) {
                }
                if (dVarC.C(eVar)) {
                    dVar = dVar2;
                    if (!s.g(dVar, new d90.d((Integer) null, (d90.i) null, (d90.a) null, false, (List) null, (List) null, (d90.f) null, (d90.h) null, (d90.h) null, (List) null, (d90.g) null, false, (List) null, 8191, (p005kotlin.jvm.internal.j) null))) {
                    }
                    dVarC.b(eVar);
                }
                dVar = dVar2;
                dVarC.e(eVar, 15, d90.d.a.f58448a, dVar);
                dVarC.b(eVar);
            }
            bVar = bVar3;
            dVarC.e(eVar, 14, lVarArr[14].getValue(), bVar);
            if (dVarC.C(eVar)) {
                dVar = dVar2;
                if (!s.g(dVar, new d90.d((Integer) null, (d90.i) null, (d90.a) null, false, (List) null, (List) null, (d90.f) null, (d90.h) null, (d90.h) null, (List) null, (d90.g) null, false, (List) null, 8191, (p005kotlin.jvm.internal.j) null))) {
                }
                dVarC.b(eVar);
            }
            dVar = dVar2;
            dVarC.e(eVar, 15, d90.d.a.f58448a, dVar);
            dVarC.b(eVar);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        public final b createFromParcel(Parcel parcel) {
            boolean z14;
            boolean z15;
            parcel.getClass();
            String string = parcel.readString();
            boolean z16 = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                z15 = false;
                z14 = true;
            } else {
                z14 = false;
                z15 = false;
            }
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            boolean z17 = z15;
            String string4 = parcel.readString();
            boolean z18 = true;
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            o90.a aVarCreateFromParcel = o90.a.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                z18 = z17;
            }
            return new b(string, z16, z14, arrayListCreateStringArrayList, string2, string3, string4, string5, string6, string7, aVarCreateFromParcel, z18, parcel.readInt() == 0 ? null : j.valueOf(parcel.readString()), parcel.readInt() != 0 ? i.valueOf(parcel.readString()) : null, yl2.b.valueOf(parcel.readString()), d90.d.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final b[] newArray(int i14) {
            return new b[i14];
        }
    }

    static {
        n nVar = n.PUBLICATION;
        f111515q = new l[]{null, null, null, m.a(nVar, new o2(3)), null, null, null, null, null, null, null, null, m.a(nVar, new o2(4)), m.a(nVar, new o2(5)), m.a(nVar, new o2(6)), null};
    }

    public /* synthetic */ b(String str, boolean z14, boolean z15, List list, String str2, String str3, String str4, String str5, String str6, String str7, o90.a aVar, boolean z16, j jVar, i iVar, yl2.b bVar, d90.d dVar, int i14, p005kotlin.jvm.internal.j jVar2) {
        this((i14 & 1) != 0 ? "" : str, (i14 & 2) != 0 ? false : z14, (i14 & 4) != 0 ? true : z15, (i14 & 8) != 0 ? null : list, (i14 & 16) != 0 ? null : str2, (i14 & 32) != 0 ? "" : str3, (i14 & 64) != 0 ? "" : str4, (i14 & 128) != 0 ? null : str5, (i14 & 256) != 0 ? "" : str6, (i14 & 512) == 0 ? str7 : "", (i14 & 1024) != 0 ? new o90.a((String) null, (Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 255, (p005kotlin.jvm.internal.j) null) : aVar, (i14 & 2048) == 0 ? z16 : true, (i14 & 4096) != 0 ? null : jVar, (i14 & 8192) == 0 ? iVar : null, (i14 & 16384) != 0 ? yl2.b.f197686f : bVar, (i14 & 32768) != 0 ? new d90.d((Integer) null, (d90.i) null, (d90.a) null, false, (List) null, (List) null, (d90.f) null, (d90.h) null, (d90.h) null, (List) null, (d90.g) null, false, (List) null, 8191, (p005kotlin.jvm.internal.j) null) : dVar);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return s.g(this.f111516a, bVar.f111516a) && this.f111517b == bVar.f111517b && this.f111518c == bVar.f111518c && s.g(this.f111519d, bVar.f111519d) && s.g(this.f111520e, bVar.f111520e) && s.g(this.f111521f, bVar.f111521f) && s.g(this.f111522g, bVar.f111522g) && s.g(this.f111523h, bVar.f111523h) && s.g(this.f111524i, bVar.f111524i) && s.g(this.f111525j, bVar.f111525j) && s.g(this.f111526k, bVar.f111526k) && this.f111527l == bVar.f111527l && this.f111528m == bVar.f111528m && this.f111529n == bVar.f111529n && this.f111530o == bVar.f111530o && s.g(this.f111531p, bVar.f111531p);
    }

    public final int hashCode() {
        int iG = q6.f.g(q6.f.g(this.f111516a.hashCode() * 31, 31, this.f111517b), 31, this.f111518c);
        List<String> list = this.f111519d;
        int iHashCode = (iG + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.f111520e;
        int iJ = wr.g.j(wr.g.j((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f111521f), 31, this.f111522g);
        String str2 = this.f111523h;
        int iJ2 = wr.g.j((iJ + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f111524i);
        String str3 = this.f111525j;
        int iG2 = q6.f.g((this.f111526k.hashCode() + ((iJ2 + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31, 31, this.f111527l);
        j jVar = this.f111528m;
        int iHashCode2 = (iG2 + (jVar == null ? 0 : jVar.hashCode())) * 31;
        i iVar = this.f111529n;
        return this.f111531p.hashCode() + ((this.f111530o.hashCode() + ((iHashCode2 + (iVar != null ? iVar.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbD = zl.a.d("CompatibleDevice(applicationKey=", this.f111516a, ", bluetoothClassicDevice=", this.f111517b, ", bluetoothLowEnergyDevice=");
        sbD.append(this.f111518c);
        sbD.append(", deviceCategories=");
        sbD.append(this.f111519d);
        sbD.append(", deviceTags=");
        sn.a.t(sbD, this.f111520e, ", productDisplayName=", this.f111521f, ", productNumber=");
        sn.a.t(sbD, this.f111522g, ", productSku=", this.f111523h, ", partNumber=");
        sn.a.t(sbD, this.f111524i, ", serialNumber=", this.f111525j, ", image=");
        sbD.append(this.f111526k);
        sbD.append(", primary=");
        sbD.append(this.f111527l);
        sbD.append(", primaryApplication=");
        sbD.append(this.f111528m);
        sbD.append(", externalDeviceSetup=");
        sbD.append(this.f111529n);
        sbD.append(", deviceType=");
        sbD.append(this.f111530o);
        sbD.append(", deviceSetupConfig=");
        sbD.append(this.f111531p);
        sbD.append(")");
        return sbD.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.f111516a);
        parcel.writeInt(this.f111517b ? 1 : 0);
        parcel.writeInt(this.f111518c ? 1 : 0);
        parcel.writeStringList(this.f111519d);
        parcel.writeString(this.f111520e);
        parcel.writeString(this.f111521f);
        parcel.writeString(this.f111522g);
        parcel.writeString(this.f111523h);
        parcel.writeString(this.f111524i);
        parcel.writeString(this.f111525j);
        this.f111526k.writeToParcel(parcel, i14);
        parcel.writeInt(this.f111527l ? 1 : 0);
        j jVar = this.f111528m;
        if (jVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(jVar.name());
        }
        i iVar = this.f111529n;
        if (iVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(iVar.name());
        }
        parcel.writeString(this.f111530o.name());
        this.f111531p.writeToParcel(parcel, i14);
    }

    /* JADX INFO: renamed from: l90.b$b, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ll90/b$b;", "", "<init>", "()V", "Li63/c;", "Ll90/b;", "serializer", "()Li63/c;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<b> serializer() {
            return a.f111532a;
        }

        private Companion() {
        }
    }

    public /* synthetic */ b(int i14, String str, boolean z14, boolean z15, List list, String str2, String str3, String str4, String str5, String str6, String str7, o90.a aVar, boolean z16, j jVar, i iVar, yl2.b bVar, d90.d dVar, u1 u1Var) {
        if ((i14 & 1) == 0) {
            this.f111516a = "";
        } else {
            this.f111516a = str;
        }
        this.f111517b = (i14 & 2) == 0 ? false : z14;
        if ((i14 & 4) == 0) {
            this.f111518c = true;
        } else {
            this.f111518c = z15;
        }
        if ((i14 & 8) == 0) {
            this.f111519d = null;
        } else {
            this.f111519d = list;
        }
        if ((i14 & 16) == 0) {
            this.f111520e = null;
        } else {
            this.f111520e = str2;
        }
        if ((i14 & 32) == 0) {
            this.f111521f = "";
        } else {
            this.f111521f = str3;
        }
        if ((i14 & 64) == 0) {
            this.f111522g = "";
        } else {
            this.f111522g = str4;
        }
        if ((i14 & 128) == 0) {
            this.f111523h = null;
        } else {
            this.f111523h = str5;
        }
        if ((i14 & 256) == 0) {
            this.f111524i = "";
        } else {
            this.f111524i = str6;
        }
        if ((i14 & 512) == 0) {
            this.f111525j = "";
        } else {
            this.f111525j = str7;
        }
        this.f111526k = (i14 & 1024) == 0 ? new o90.a((String) null, (Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 255, (p005kotlin.jvm.internal.j) null) : aVar;
        if ((i14 & 2048) == 0) {
            this.f111527l = true;
        } else {
            this.f111527l = z16;
        }
        if ((i14 & 4096) == 0) {
            this.f111528m = null;
        } else {
            this.f111528m = jVar;
        }
        if ((i14 & 8192) == 0) {
            this.f111529n = null;
        } else {
            this.f111529n = iVar;
        }
        this.f111530o = (i14 & 16384) == 0 ? yl2.b.f197686f : bVar;
        this.f111531p = (i14 & 32768) == 0 ? new d90.d((Integer) null, (d90.i) null, (d90.a) null, false, (List) null, (List) null, (d90.f) null, (d90.h) null, (d90.h) null, (List) null, (d90.g) null, false, (List) null, 8191, (p005kotlin.jvm.internal.j) null) : dVar;
    }

    public b(String str, boolean z14, boolean z15, List<String> list, String str2, String str3, String str4, String str5, String str6, String str7, o90.a aVar, boolean z16, j jVar, i iVar, yl2.b bVar, d90.d dVar) {
        str.getClass();
        str3.getClass();
        str4.getClass();
        str6.getClass();
        aVar.getClass();
        bVar.getClass();
        dVar.getClass();
        this.f111516a = str;
        this.f111517b = z14;
        this.f111518c = z15;
        this.f111519d = list;
        this.f111520e = str2;
        this.f111521f = str3;
        this.f111522g = str4;
        this.f111523h = str5;
        this.f111524i = str6;
        this.f111525j = str7;
        this.f111526k = aVar;
        this.f111527l = z16;
        this.f111528m = jVar;
        this.f111529n = iVar;
        this.f111530o = bVar;
        this.f111531p = dVar;
    }

    public b() {
        this((String) null, false, false, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (o90.a) null, false, (j) null, (i) null, (yl2.b) null, (d90.d) null, 65535, (p005kotlin.jvm.internal.j) null);
    }
}
