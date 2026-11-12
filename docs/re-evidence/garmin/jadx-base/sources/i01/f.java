package i01;

import b63.v;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import g01.u;
import m63.e0;
import m63.k1;
import m63.m1;
import m63.u1;
import m63.v0;
import m63.x;
import m63.y1;
import o13.n;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u001f2\u00020\u0001:\u0002 !B\u0091\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0018\u0010\u0019B§\u0001\b\u0010\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u0018\u0010\u001e¨\u0006\""}, d2 = {"Li01/f;", "", "", TtmlNode.ATTR_ID, "Lb63/l;", "timestamp", "logSource", "Li01/i;", "logCategory", "Lb63/v;", "mealTime", "Li01/e;", "action", "", "mealId", "foodId", "servingId", "Lg01/u;", "source", "regionCode", RemoteConfigConstants.RequestFieldKey.LANGUAGE_CODE, "", "servingQty", "customMealId", "<init>", "(Ljava/lang/String;Lb63/l;Ljava/lang/String;Li01/i;Lb63/v;Li01/e;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Lg01/u;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Long;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/lang/String;Lb63/l;Ljava/lang/String;Li01/i;Lb63/v;Li01/e;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Lg01/u;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Long;Lm63/u1;)V", "Companion", "a", "b", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final /* data */ class f {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final o13.l<i63.c<Object>>[] f86745o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f86746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b63.l f86747b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f86748c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i f86749d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final v f86750e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final e f86751f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Long f86752g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f86753h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f86754i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final u f86755j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f86756k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f86757l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Double f86758m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Long f86759n;

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/nutrition/data/model/log/FoodLogItemDTO.$serializer", "Lm63/e0;", "Li01/f;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @o13.e
    public static final /* synthetic */ class a implements e0<f> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f86760a;
        private static final k63.e descriptor;

        static {
            a aVar = new a();
            f86760a = aVar;
            m1 m1Var = new m1("com.garmin.android.apps.connectmobile.nutrition.data.model.log.FoodLogItemDTO", aVar, 14);
            m1Var.j("logId", false);
            m1Var.j("logTimestamp", false);
            m1Var.j("logSource", true);
            m1Var.j("logCategory", false);
            m1Var.j("mealTime", false);
            m1Var.j("action", false);
            m1Var.j("mealId", false);
            m1Var.j("foodId", false);
            m1Var.j("servingId", false);
            m1Var.j("source", false);
            m1Var.j("regionCode", false);
            m1Var.j(RemoteConfigConstants.RequestFieldKey.LANGUAGE_CODE, false);
            m1Var.j("servingQty", false);
            m1Var.j("customMealId", true);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // m63.e0
        public final i63.c<?>[] childSerializers() {
            o13.l<i63.c<Object>>[] lVarArr = f.f86745o;
            y1 y1Var = y1.f117048a;
            v0 v0Var = v0.f117027a;
            return new i63.c[]{j63.a.d(y1Var), j63.a.d(h63.j.f82302a), y1Var, lVarArr[3].getValue(), j63.a.d(lVarArr[4].getValue()), lVarArr[5].getValue(), j63.a.d(v0Var), j63.a.d(y1Var), j63.a.d(y1Var), j63.a.d(lVarArr[9].getValue()), j63.a.d(y1Var), j63.a.d(y1Var), j63.a.d(x.f117036a), j63.a.d(v0Var)};
        }

        @Override // i63.b
        public final Object deserialize(l63.e eVar) {
            eVar.getClass();
            k63.e eVar2 = descriptor;
            l63.c cVarC = eVar.c(eVar2);
            o13.l<i63.c<Object>>[] lVarArr = f.f86745o;
            int i14 = l63.c.f110557a;
            String str = null;
            String str2 = null;
            u uVar = null;
            String str3 = null;
            Double d14 = null;
            String str4 = null;
            int i15 = 0;
            String str5 = null;
            b63.l lVar = null;
            Long l14 = null;
            i iVar = null;
            v vVar = null;
            e eVar3 = null;
            Long l15 = null;
            boolean z14 = true;
            String strR = null;
            while (z14) {
                int iE = cVarC.e(eVar2);
                switch (iE) {
                    case -1:
                        z14 = false;
                        str2 = str2;
                        str = str;
                        break;
                    case 0:
                        str5 = (String) cVarC.v(eVar2, 0, y1.f117048a, str5);
                        i15 |= 1;
                        str2 = str2;
                        str = str;
                        break;
                    case 1:
                        lVar = (b63.l) cVarC.v(eVar2, 1, h63.j.f82302a, lVar);
                        i15 |= 2;
                        str = str;
                        str5 = str5;
                        break;
                    case 2:
                        strR = cVarC.r(eVar2, 2);
                        i15 |= 4;
                        str5 = str5;
                        break;
                    case 3:
                        iVar = (i) cVarC.l(eVar2, 3, lVarArr[3].getValue(), iVar);
                        i15 |= 8;
                        str5 = str5;
                        lVar = lVar;
                        break;
                    case 4:
                        vVar = (v) cVarC.v(eVar2, 4, lVarArr[4].getValue(), vVar);
                        i15 |= 16;
                        str5 = str5;
                        lVar = lVar;
                        break;
                    case 5:
                        eVar3 = (e) cVarC.l(eVar2, 5, lVarArr[5].getValue(), eVar3);
                        i15 |= 32;
                        str5 = str5;
                        lVar = lVar;
                        break;
                    case 6:
                        l15 = (Long) cVarC.v(eVar2, 6, v0.f117027a, l15);
                        i15 |= 64;
                        str5 = str5;
                        lVar = lVar;
                        break;
                    case 7:
                        str4 = (String) cVarC.v(eVar2, 7, y1.f117048a, str4);
                        i15 |= 128;
                        str5 = str5;
                        lVar = lVar;
                        break;
                    case 8:
                        str3 = (String) cVarC.v(eVar2, 8, y1.f117048a, str3);
                        i15 |= 256;
                        str5 = str5;
                        lVar = lVar;
                        break;
                    case 9:
                        uVar = (u) cVarC.v(eVar2, 9, lVarArr[9].getValue(), uVar);
                        i15 |= 512;
                        str5 = str5;
                        lVar = lVar;
                        break;
                    case 10:
                        str2 = (String) cVarC.v(eVar2, 10, y1.f117048a, str2);
                        i15 |= 1024;
                        str5 = str5;
                        lVar = lVar;
                        break;
                    case 11:
                        str = (String) cVarC.v(eVar2, 11, y1.f117048a, str);
                        i15 |= 2048;
                        str5 = str5;
                        lVar = lVar;
                        break;
                    case 12:
                        d14 = (Double) cVarC.v(eVar2, 12, x.f117036a, d14);
                        i15 |= 4096;
                        str5 = str5;
                        lVar = lVar;
                        break;
                    case 13:
                        l14 = (Long) cVarC.v(eVar2, 13, v0.f117027a, l14);
                        i15 |= 8192;
                        str5 = str5;
                        lVar = lVar;
                        break;
                    default:
                        hb.a.o(iE);
                        return null;
                }
            }
            String str6 = str2;
            cVarC.b(eVar2);
            return new f(i15, str5, lVar, strR, iVar, vVar, eVar3, l15, str4, str3, uVar, str6, str, d14, l14, (u1) null);
        }

        @Override // i63.i, i63.b
        /* JADX INFO: renamed from: getDescriptor */
        public final k63.e getF158591b() {
            return descriptor;
        }

        @Override // i63.i
        public final void serialize(l63.f fVar, Object obj) {
            f fVar2 = (f) obj;
            fVar2.getClass();
            k63.e eVar = descriptor;
            l63.d dVarC = fVar.c(eVar);
            o13.l<i63.c<Object>>[] lVarArr = f.f86745o;
            y1 y1Var = y1.f117048a;
            String str = fVar2.f86746a;
            Long l14 = fVar2.f86759n;
            String str2 = fVar2.f86748c;
            dVarC.d(eVar, 0, y1Var, str);
            dVarC.d(eVar, 1, h63.j.f82302a, fVar2.f86747b);
            if (dVarC.C(eVar) || !s.g(str2, "GCM")) {
                dVarC.k(eVar, 2, str2);
            }
            dVarC.e(eVar, 3, lVarArr[3].getValue(), fVar2.f86749d);
            dVarC.d(eVar, 4, lVarArr[4].getValue(), fVar2.f86750e);
            dVarC.e(eVar, 5, lVarArr[5].getValue(), fVar2.f86751f);
            v0 v0Var = v0.f117027a;
            dVarC.d(eVar, 6, v0Var, fVar2.f86752g);
            dVarC.d(eVar, 7, y1Var, fVar2.f86753h);
            dVarC.d(eVar, 8, y1Var, fVar2.f86754i);
            dVarC.d(eVar, 9, lVarArr[9].getValue(), fVar2.f86755j);
            dVarC.d(eVar, 10, y1Var, fVar2.f86756k);
            dVarC.d(eVar, 11, y1Var, fVar2.f86757l);
            dVarC.d(eVar, 12, x.f117036a, fVar2.f86758m);
            if (dVarC.C(eVar) || l14 != null) {
                dVarC.d(eVar, 13, v0Var, l14);
            }
            dVarC.b(eVar);
        }
    }

    static {
        n nVar = n.PUBLICATION;
        f86745o = new o13.l[]{null, null, null, o13.m.a(nVar, new ht1.v(23)), o13.m.a(nVar, new ht1.v(24)), o13.m.a(nVar, new ht1.v(25)), null, null, null, o13.m.a(nVar, new ht1.v(26)), null, null, null, null};
    }

    public /* synthetic */ f(int i14, String str, b63.l lVar, String str2, i iVar, v vVar, e eVar, Long l14, String str3, String str4, u uVar, String str5, String str6, Double d14, Long l15, u1 u1Var) {
        if (8187 != (i14 & 8187)) {
            k1.h(i14, 8187, a.f86760a.getF158591b());
            throw null;
        }
        this.f86746a = str;
        this.f86747b = lVar;
        if ((i14 & 4) == 0) {
            this.f86748c = "GCM";
        } else {
            this.f86748c = str2;
        }
        this.f86749d = iVar;
        this.f86750e = vVar;
        this.f86751f = eVar;
        this.f86752g = l14;
        this.f86753h = str3;
        this.f86754i = str4;
        this.f86755j = uVar;
        this.f86756k = str5;
        this.f86757l = str6;
        this.f86758m = d14;
        if ((i14 & 8192) == 0) {
            this.f86759n = null;
        } else {
            this.f86759n = l15;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return s.g(this.f86746a, fVar.f86746a) && s.g(this.f86747b, fVar.f86747b) && s.g(this.f86748c, fVar.f86748c) && this.f86749d == fVar.f86749d && s.g(this.f86750e, fVar.f86750e) && this.f86751f == fVar.f86751f && s.g(this.f86752g, fVar.f86752g) && s.g(this.f86753h, fVar.f86753h) && s.g(this.f86754i, fVar.f86754i) && this.f86755j == fVar.f86755j && s.g(this.f86756k, fVar.f86756k) && s.g(this.f86757l, fVar.f86757l) && s.g(this.f86758m, fVar.f86758m) && s.g(this.f86759n, fVar.f86759n);
    }

    public final int hashCode() {
        String str = this.f86746a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        b63.l lVar = this.f86747b;
        int iHashCode2 = (this.f86749d.hashCode() + wr.g.j((iHashCode + (lVar == null ? 0 : lVar.f16204a.hashCode())) * 31, 31, this.f86748c)) * 31;
        v vVar = this.f86750e;
        int iHashCode3 = (this.f86751f.hashCode() + ((iHashCode2 + (vVar == null ? 0 : vVar.f16219a.hashCode())) * 31)) * 31;
        Long l14 = this.f86752g;
        int iHashCode4 = (iHashCode3 + (l14 == null ? 0 : l14.hashCode())) * 31;
        String str2 = this.f86753h;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f86754i;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        u uVar = this.f86755j;
        int iHashCode7 = (iHashCode6 + (uVar == null ? 0 : uVar.hashCode())) * 31;
        String str4 = this.f86756k;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f86757l;
        int iHashCode9 = (iHashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Double d14 = this.f86758m;
        int iHashCode10 = (iHashCode9 + (d14 == null ? 0 : d14.hashCode())) * 31;
        Long l15 = this.f86759n;
        return iHashCode10 + (l15 != null ? l15.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("FoodLogItemDTO(id=");
        sb3.append(this.f86746a);
        sb3.append(", timestamp=");
        sb3.append(this.f86747b);
        sb3.append(", logSource=");
        sb3.append(this.f86748c);
        sb3.append(", logCategory=");
        sb3.append(this.f86749d);
        sb3.append(", mealTime=");
        sb3.append(this.f86750e);
        sb3.append(", action=");
        sb3.append(this.f86751f);
        sb3.append(", mealId=");
        b71.i.q(this.f86752g, ", foodId=", this.f86753h, ", servingId=", sb3);
        sb3.append(this.f86754i);
        sb3.append(", source=");
        sb3.append(this.f86755j);
        sb3.append(", regionCode=");
        sn.a.t(sb3, this.f86756k, ", languageCode=", this.f86757l, ", servingQty=");
        sb3.append(this.f86758m);
        sb3.append(", customMealId=");
        sb3.append(this.f86759n);
        sb3.append(")");
        return sb3.toString();
    }

    /* JADX INFO: renamed from: i01.f$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Li01/f$b;", "", "<init>", "()V", "Li63/c;", "Li01/f;", "serializer", "()Li63/c;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<f> serializer() {
            return a.f86760a;
        }

        private Companion() {
        }
    }

    public f(String str, b63.l lVar, String str2, i iVar, v vVar, e eVar, Long l14, String str3, String str4, u uVar, String str5, String str6, Double d14, Long l15) {
        str2.getClass();
        iVar.getClass();
        eVar.getClass();
        this.f86746a = str;
        this.f86747b = lVar;
        this.f86748c = str2;
        this.f86749d = iVar;
        this.f86750e = vVar;
        this.f86751f = eVar;
        this.f86752g = l14;
        this.f86753h = str3;
        this.f86754i = str4;
        this.f86755j = uVar;
        this.f86756k = str5;
        this.f86757l = str6;
        this.f86758m = d14;
        this.f86759n = l15;
    }

    public /* synthetic */ f(String str, b63.l lVar, String str2, i iVar, v vVar, e eVar, Long l14, String str3, String str4, u uVar, String str5, String str6, Double d14, Long l15, int i14, p005kotlin.jvm.internal.j jVar) {
        this(str, lVar, (i14 & 4) != 0 ? "GCM" : str2, iVar, vVar, eVar, l14, str3, str4, uVar, str5, str6, d14, (i14 & 8192) != 0 ? null : l15);
    }
}
