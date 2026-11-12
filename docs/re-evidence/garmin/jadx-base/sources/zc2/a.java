package zc2;

import i63.c;
import i63.h;
import java.util.Map;
import l63.d;
import l63.f;
import m63.e0;
import m63.k1;
import m63.m1;
import m63.u1;
import m63.v0;
import m63.y1;
import o13.e;
import o13.l;
import o13.m;
import o13.n;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import wr.g;
import z41.j;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00132\u00020\u0001:\u0002\u0014\u0015BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\u0016\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rBm\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\u0016\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012¨\u0006\u0016"}, d2 = {"Lzc2/a;", "", "", "connectUserProfilePk", "", "garminGuid", "messengerPhoneNumber", "fullName", "displayName", "profileImageType", "", "profileImageUrls", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(IJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lm63/u1;)V", "Companion", "a", "b", "networking-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@h
public final /* data */ class a {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final l<c<Object>>[] f203963h = {null, null, null, null, null, null, m.a(n.PUBLICATION, new j(29))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f203964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f203965b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f203966c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f203967d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f203968e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f203969f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Map<String, String> f203970g;

    /* JADX INFO: renamed from: zc2.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/lib/networking/diapi/model/GarminUserProfile.$serializer", "Lm63/e0;", "Lzc2/a;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "networking-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @e
    public /* synthetic */ class C3804a implements e0<a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C3804a f203971a;
        private static final k63.e descriptor;

        static {
            C3804a c3804a = new C3804a();
            f203971a = c3804a;
            m1 m1Var = new m1("com.garmin.android.lib.networking.diapi.model.GarminUserProfile", c3804a, 7);
            m1Var.j("connectUserProfilePk", false);
            m1Var.j("garminGuid", false);
            m1Var.j("messengerPhoneNumber", false);
            m1Var.j("fullName", false);
            m1Var.j("displayName", false);
            m1Var.j("profileImageType", false);
            m1Var.j("profileImageUrls", false);
            descriptor = m1Var;
        }

        private C3804a() {
        }

        @Override // m63.e0
        public final c<?>[] childSerializers() {
            l<c<Object>>[] lVarArr = a.f203963h;
            y1 y1Var = y1.f117048a;
            return new c[]{v0.f117027a, y1Var, j63.a.d(y1Var), j63.a.d(y1Var), j63.a.d(y1Var), j63.a.d(y1Var), j63.a.d(lVarArr[6].getValue())};
        }

        @Override // i63.b
        public final Object deserialize(l63.e eVar) {
            eVar.getClass();
            k63.e eVar2 = descriptor;
            l63.c cVarC = eVar.c(eVar2);
            l<c<Object>>[] lVarArr = a.f203963h;
            int i14 = l63.c.f110557a;
            Object obj = null;
            long jW = 0;
            String str = null;
            Map map = null;
            String strR = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            int i15 = 0;
            boolean z14 = true;
            while (z14) {
                int iE = cVarC.e(eVar2);
                switch (iE) {
                    case -1:
                        z14 = false;
                        continue;
                    case 0:
                        jW = cVarC.w(eVar2, 0);
                        i15 |= 1;
                        break;
                    case 1:
                        strR = cVarC.r(eVar2, 1);
                        i15 |= 2;
                        break;
                    case 2:
                        str2 = (String) cVarC.v(eVar2, 2, y1.f117048a, str2);
                        i15 |= 4;
                        break;
                    case 3:
                        str3 = (String) cVarC.v(eVar2, 3, y1.f117048a, str3);
                        i15 |= 8;
                        break;
                    case 4:
                        str4 = (String) cVarC.v(eVar2, 4, y1.f117048a, str4);
                        i15 |= 16;
                        break;
                    case 5:
                        str = (String) cVarC.v(eVar2, 5, y1.f117048a, str);
                        i15 |= 32;
                        break;
                    case 6:
                        map = (Map) cVarC.v(eVar2, 6, lVarArr[6].getValue(), map);
                        i15 |= 64;
                        break;
                    default:
                        hb.a.o(iE);
                        return obj;
                }
                obj = null;
            }
            cVarC.b(eVar2);
            return new a(i15, jW, strR, str2, str3, str4, str, map, null);
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
            l<c<Object>>[] lVarArr = a.f203963h;
            dVarC.z(eVar, 0, aVar.f203964a);
            dVarC.k(eVar, 1, aVar.f203965b);
            y1 y1Var = y1.f117048a;
            dVarC.d(eVar, 2, y1Var, aVar.f203966c);
            dVarC.d(eVar, 3, y1Var, aVar.f203967d);
            dVarC.d(eVar, 4, y1Var, aVar.f203968e);
            dVarC.d(eVar, 5, y1Var, aVar.f203969f);
            dVarC.d(eVar, 6, lVarArr[6].getValue(), aVar.f203970g);
            dVarC.b(eVar);
        }
    }

    public /* synthetic */ a(int i14, long j8, String str, String str2, String str3, String str4, String str5, Map map, u1 u1Var) {
        if (127 != (i14 & 127)) {
            k1.h(i14, 127, C3804a.f203971a.getF158591b());
            throw null;
        }
        this.f203964a = j8;
        this.f203965b = str;
        this.f203966c = str2;
        this.f203967d = str3;
        this.f203968e = str4;
        this.f203969f = str5;
        this.f203970g = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f203964a == aVar.f203964a && s.g(this.f203965b, aVar.f203965b) && s.g(this.f203966c, aVar.f203966c) && s.g(this.f203967d, aVar.f203967d) && s.g(this.f203968e, aVar.f203968e) && s.g(this.f203969f, aVar.f203969f) && s.g(this.f203970g, aVar.f203970g);
    }

    public final int hashCode() {
        int iJ = g.j(Long.hashCode(this.f203964a) * 31, 31, this.f203965b);
        String str = this.f203966c;
        int iHashCode = (iJ + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f203967d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f203968e;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f203969f;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Map<String, String> map = this.f203970g;
        return iHashCode4 + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbK = com.airbnb.lottie.animation.keyframe.a.k(this.f203964a, "GarminUserProfile(connectUserProfilePk=", ", garminGuid='", this.f203965b);
        sn.a.t(sbK, "', messengerPhoneNumber=", this.f203966c, ", fullName=", this.f203967d);
        sn.a.t(sbK, ", displayName=", this.f203968e, ", profileImageType=", this.f203969f);
        sbK.append(", profileImageUrls=");
        sbK.append(this.f203970g);
        sbK.append(")");
        return sbK.toString();
    }

    /* JADX INFO: renamed from: zc2.a$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lzc2/a$b;", "", "<init>", "()V", "Li63/c;", "Lzc2/a;", "serializer", "()Li63/c;", "networking-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final c<a> serializer() {
            return C3804a.f203971a;
        }

        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }
    }

    public a(long j8, String str, String str2, String str3, String str4, String str5, Map<String, String> map) {
        str.getClass();
        this.f203964a = j8;
        this.f203965b = str;
        this.f203966c = str2;
        this.f203967d = str3;
        this.f203968e = str4;
        this.f203969f = str5;
        this.f203970g = map;
    }
}
