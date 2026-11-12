package n61;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.f3;
import j20.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import m63.e0;
import m63.m0;
import m63.m1;
import m63.u1;
import m63.v0;
import m63.y1;
import mz1.d0;
import o13.l;
import o13.m;
import o13.n;
import o13.p;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p13.j0;
import r1.q2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001f B¹\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0007¢\u0006\u0004\b\u0018\u0010\u0019B¯\u0001\b\u0010\u0012\u0006\u0010\u001a\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\u0006\u0010\u0010\u001a\u00020\u0007\u0012\u0006\u0010\u0011\u001a\u00020\u0007\u0012\u0006\u0010\u0012\u001a\u00020\u0007\u0012\u0006\u0010\u0013\u001a\u00020\u0007\u0012\u0006\u0010\u0014\u001a\u00020\u0007\u0012\u0006\u0010\u0015\u001a\u00020\u0007\u0012\u0006\u0010\u0016\u001a\u00020\u0007\u0012\u0006\u0010\u0017\u001a\u00020\u0007\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u0018\u0010\u001d¨\u0006!"}, d2 = {"Ln61/c;", "Landroid/os/Parcelable;", "", "userProfilePk", "deviceId", "", "calendarDate", "", "overallScore", "classification", "feedbackPhrase", "", "primaryTrainingDevice", "", "Ln61/a;", "contributors", "gaugeLowerLimit", "classificationLowerLimitIntermediate", "classificationLowerLimitTrained", "classificationLowerLimitWellTrained", "classificationLowerLimitExpert", "classificationLowerLimitSuperior", "classificationLowerLimitElite", "gaugeUpperLimit", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;ZLjava/util/List;IIIIIIII)V", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;ZLjava/util/List;IIIIIIIILm63/u1;)V", "Companion", "a", "b", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final /* data */ class c implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f123823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f123824b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f123825c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f123826d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Integer f123827e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Integer f123828f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f123829g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List<n61.a> f123830h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f123831i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f123832j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f123833k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f123834l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f123835m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f123836n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f123837o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f123838p;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<c> CREATOR = new C2331c();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final l<i63.c<Object>>[] f123822q = {null, null, null, null, null, null, null, m.a(n.PUBLICATION, new d0(26)), null, null, null, null, null, null, null, null};

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/performance/endurancescore/model/EnduranceScoreDTO.$serializer", "Lm63/e0;", "Ln61/c;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @o13.e
    public static final /* synthetic */ class a implements e0<c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f123839a;
        private static final k63.e descriptor;

        static {
            a aVar = new a();
            f123839a = aVar;
            m1 m1Var = new m1("com.garmin.android.apps.connectmobile.performance.endurancescore.model.EnduranceScoreDTO", aVar, 16);
            m1Var.j("userProfilePk", true);
            m1Var.j("deviceId", true);
            m1Var.j("calendarDate", true);
            m1Var.j("overallScore", true);
            m1Var.j("classification", true);
            m1Var.j("feedbackPhrase", true);
            m1Var.j("primaryTrainingDevice", true);
            m1Var.j("contributors", true);
            m1Var.j("gaugeLowerLimit", true);
            m1Var.j("classificationLowerLimitIntermediate", true);
            m1Var.j("classificationLowerLimitTrained", true);
            m1Var.j("classificationLowerLimitWellTrained", true);
            m1Var.j("classificationLowerLimitExpert", true);
            m1Var.j("classificationLowerLimitSuperior", true);
            m1Var.j("classificationLowerLimitElite", true);
            m1Var.j("gaugeUpperLimit", true);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // m63.e0
        public final i63.c<?>[] childSerializers() {
            l<i63.c<Object>>[] lVarArr = c.f123822q;
            v0 v0Var = v0.f117027a;
            m0 m0Var = m0.f116981a;
            return new i63.c[]{j63.a.d(v0Var), j63.a.d(v0Var), j63.a.d(y1.f117048a), j63.a.d(m0Var), j63.a.d(m0Var), j63.a.d(m0Var), m63.g.f116948a, lVarArr[7].getValue(), m0Var, m0Var, m0Var, m0Var, m0Var, m0Var, m0Var, m0Var};
        }

        @Override // i63.b
        public final Object deserialize(l63.e eVar) {
            eVar.getClass();
            k63.e eVar2 = descriptor;
            l63.c cVarC = eVar.c(eVar2);
            l<i63.c<Object>>[] lVarArr = c.f123822q;
            int i14 = l63.c.f110557a;
            Object obj = null;
            boolean z14 = true;
            List list = null;
            Long l14 = null;
            Long l15 = null;
            String str = null;
            Integer num = null;
            Integer num2 = null;
            Integer num3 = null;
            int i15 = 0;
            boolean zG = false;
            int iA = 0;
            int iA2 = 0;
            int iA3 = 0;
            int iA4 = 0;
            int iA5 = 0;
            int iA6 = 0;
            int iA7 = 0;
            int iA8 = 0;
            while (z14) {
                int iE = cVarC.e(eVar2);
                switch (iE) {
                    case -1:
                        z14 = false;
                        break;
                    case 0:
                        l14 = (Long) cVarC.v(eVar2, 0, v0.f117027a, l14);
                        i15 |= 1;
                        break;
                    case 1:
                        l15 = (Long) cVarC.v(eVar2, 1, v0.f117027a, l15);
                        i15 |= 2;
                        break;
                    case 2:
                        str = (String) cVarC.v(eVar2, 2, y1.f117048a, str);
                        i15 |= 4;
                        break;
                    case 3:
                        num = (Integer) cVarC.v(eVar2, 3, m0.f116981a, num);
                        i15 |= 8;
                        break;
                    case 4:
                        num2 = (Integer) cVarC.v(eVar2, 4, m0.f116981a, num2);
                        i15 |= 16;
                        break;
                    case 5:
                        num3 = (Integer) cVarC.v(eVar2, 5, m0.f116981a, num3);
                        i15 |= 32;
                        break;
                    case 6:
                        zG = cVarC.g(eVar2, 6);
                        i15 |= 64;
                        break;
                    case 7:
                        list = (List) cVarC.l(eVar2, 7, lVarArr[7].getValue(), list);
                        i15 |= 128;
                        break;
                    case 8:
                        iA = cVarC.A(eVar2, 8);
                        i15 |= 256;
                        break;
                    case 9:
                        iA2 = cVarC.A(eVar2, 9);
                        i15 |= 512;
                        break;
                    case 10:
                        iA3 = cVarC.A(eVar2, 10);
                        i15 |= 1024;
                        break;
                    case 11:
                        iA4 = cVarC.A(eVar2, 11);
                        i15 |= 2048;
                        break;
                    case 12:
                        iA5 = cVarC.A(eVar2, 12);
                        i15 |= 4096;
                        break;
                    case 13:
                        iA6 = cVarC.A(eVar2, 13);
                        i15 |= 8192;
                        break;
                    case 14:
                        iA7 = cVarC.A(eVar2, 14);
                        i15 |= 16384;
                        break;
                    case 15:
                        iA8 = cVarC.A(eVar2, 15);
                        i15 |= 32768;
                        break;
                    default:
                        hb.a.o(iE);
                        return obj;
                }
                obj = null;
            }
            cVarC.b(eVar2);
            return new c(i15, l14, l15, str, num, num2, num3, zG, list, iA, iA2, iA3, iA4, iA5, iA6, iA7, iA8, (u1) null);
        }

        @Override // i63.i, i63.b
        /* JADX INFO: renamed from: getDescriptor */
        public final k63.e getF158591b() {
            return descriptor;
        }

        @Override // i63.i
        public final void serialize(l63.f fVar, Object obj) {
            c cVar = (c) obj;
            cVar.getClass();
            int i14 = cVar.f123838p;
            int i15 = cVar.f123837o;
            int i16 = cVar.f123836n;
            int i17 = cVar.f123835m;
            int i18 = cVar.f123834l;
            int i19 = cVar.f123833k;
            int i24 = cVar.f123832j;
            int i25 = cVar.f123831i;
            List<n61.a> list = cVar.f123830h;
            boolean z14 = cVar.f123829g;
            Integer num = cVar.f123828f;
            Integer num2 = cVar.f123827e;
            Integer num3 = cVar.f123826d;
            String str = cVar.f123825c;
            Long l14 = cVar.f123824b;
            Long l15 = cVar.f123823a;
            k63.e eVar = descriptor;
            l63.d dVarC = fVar.c(eVar);
            l<i63.c<Object>>[] lVarArr = c.f123822q;
            if (dVarC.C(eVar) || l15 != null) {
                dVarC.d(eVar, 0, v0.f117027a, l15);
            }
            if (dVarC.C(eVar) || l14 != null) {
                dVarC.d(eVar, 1, v0.f117027a, l14);
            }
            if (dVarC.C(eVar) || str != null) {
                dVarC.d(eVar, 2, y1.f117048a, str);
            }
            if (dVarC.C(eVar) || num3 != null) {
                dVarC.d(eVar, 3, m0.f116981a, num3);
            }
            if (dVarC.C(eVar) || num2 != null) {
                dVarC.d(eVar, 4, m0.f116981a, num2);
            }
            if (dVarC.C(eVar) || num != null) {
                dVarC.d(eVar, 5, m0.f116981a, num);
            }
            if (dVarC.C(eVar) || z14) {
                dVarC.n(eVar, 6, z14);
            }
            if (dVarC.C(eVar) || !s.g(list, j0.f134944a)) {
                dVarC.e(eVar, 7, lVarArr[7].getValue(), list);
            }
            if (dVarC.C(eVar) || i25 != 0) {
                dVarC.v(8, i25, eVar);
            }
            if (dVarC.C(eVar) || i24 != 0) {
                dVarC.v(9, i24, eVar);
            }
            if (dVarC.C(eVar) || i19 != 0) {
                dVarC.v(10, i19, eVar);
            }
            if (dVarC.C(eVar) || i18 != 0) {
                dVarC.v(11, i18, eVar);
            }
            if (dVarC.C(eVar) || i17 != 0) {
                dVarC.v(12, i17, eVar);
            }
            if (dVarC.C(eVar) || i16 != 0) {
                dVarC.v(13, i16, eVar);
            }
            if (dVarC.C(eVar) || i15 != 0) {
                dVarC.v(14, i15, eVar);
            }
            if (dVarC.C(eVar) || i14 != 0) {
                dVarC.v(15, i14, eVar);
            }
            dVarC.b(eVar);
        }
    }

    /* JADX INFO: renamed from: n61.c$c, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C2331c implements Parcelable.Creator<c> {
        @Override // android.os.Parcelable.Creator
        public final c createFromParcel(Parcel parcel) {
            parcel.getClass();
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Long lValueOf2 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String string = parcel.readString();
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf3 = parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null;
            int iA = 0;
            boolean z14 = parcel.readInt() != 0;
            int i14 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i14);
            while (iA != i14) {
                iA = kg.f.a(n61.a.CREATOR, parcel, arrayList, iA, 1);
            }
            return new c(lValueOf, lValueOf2, string, numValueOf, numValueOf2, numValueOf3, z14, arrayList, parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final c[] newArray(int i14) {
            return new c[i14];
        }
    }

    public c(Long l14, Long l15, String str, Integer num, Integer num2, Integer num3, boolean z14, List list, int i14, int i15, int i16, int i17, int i18, int i19, int i24, int i25, int i26, j jVar) {
        this((i26 & 1) != 0 ? null : l14, (i26 & 2) != 0 ? null : l15, (i26 & 4) != 0 ? null : str, (i26 & 8) != 0 ? null : num, (i26 & 16) != 0 ? null : num2, (i26 & 32) == 0 ? num3 : null, (i26 & 64) != 0 ? false : z14, (i26 & 128) != 0 ? j0.f134944a : list, (i26 & 256) != 0 ? 0 : i14, (i26 & 512) != 0 ? 0 : i15, (i26 & 1024) != 0 ? 0 : i16, (i26 & 2048) != 0 ? 0 : i17, (i26 & 4096) != 0 ? 0 : i18, (i26 & 8192) != 0 ? 0 : i19, (i26 & 16384) != 0 ? 0 : i24, (i26 & 32768) != 0 ? 0 : i25);
    }

    public final d b() {
        Integer numValueOf = Integer.valueOf(this.f123831i);
        int i14 = this.f123832j;
        p pVar = new p(numValueOf, Integer.valueOf(i14 - 1));
        Integer numValueOf2 = Integer.valueOf(i14);
        int i15 = this.f123833k;
        p pVar2 = new p(numValueOf2, Integer.valueOf(i15 - 1));
        Integer numValueOf3 = Integer.valueOf(i15);
        int i16 = this.f123834l;
        p pVar3 = new p(numValueOf3, Integer.valueOf(i16 - 1));
        Integer numValueOf4 = Integer.valueOf(i16);
        int i17 = this.f123835m;
        p pVar4 = new p(numValueOf4, Integer.valueOf(i17 - 1));
        Integer numValueOf5 = Integer.valueOf(i17);
        int i18 = this.f123836n;
        p pVar5 = new p(numValueOf5, Integer.valueOf(i18 - 1));
        Integer numValueOf6 = Integer.valueOf(i18);
        int i19 = this.f123837o;
        return new d(pVar, pVar2, pVar3, pVar4, pVar5, new p(numValueOf6, Integer.valueOf(i19 - 1)), new p(Integer.valueOf(i19), Integer.valueOf(this.f123838p)));
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
        return s.g(this.f123823a, cVar.f123823a) && s.g(this.f123824b, cVar.f123824b) && s.g(this.f123825c, cVar.f123825c) && s.g(this.f123826d, cVar.f123826d) && s.g(this.f123827e, cVar.f123827e) && s.g(this.f123828f, cVar.f123828f) && this.f123829g == cVar.f123829g && s.g(this.f123830h, cVar.f123830h) && this.f123831i == cVar.f123831i && this.f123832j == cVar.f123832j && this.f123833k == cVar.f123833k && this.f123834l == cVar.f123834l && this.f123835m == cVar.f123835m && this.f123836n == cVar.f123836n && this.f123837o == cVar.f123837o && this.f123838p == cVar.f123838p;
    }

    public final int hashCode() {
        Long l14 = this.f123823a;
        int iHashCode = (l14 == null ? 0 : l14.hashCode()) * 31;
        Long l15 = this.f123824b;
        int iHashCode2 = (iHashCode + (l15 == null ? 0 : l15.hashCode())) * 31;
        String str = this.f123825c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.f123826d;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f123827e;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f123828f;
        return Integer.hashCode(this.f123838p) + q2.d(this.f123837o, q2.d(this.f123836n, q2.d(this.f123835m, q2.d(this.f123834l, q2.d(this.f123833k, q2.d(this.f123832j, q2.d(this.f123831i, u0.b(q6.f.g((iHashCode5 + (num3 != null ? num3.hashCode() : 0)) * 31, 31, this.f123829g), 31, this.f123830h), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbJ = f3.j(this.f123823a, this.f123824b, "EnduranceScoreDTO(userProfilePk=", ", deviceId=", ", calendarDate=");
        fb1.c.u(this.f123826d, this.f123825c, ", overallScore=", ", classification=", sbJ);
        x.m(sbJ, this.f123827e, ", feedbackPhrase=", this.f123828f, ", primaryTrainingDevice=");
        sbJ.append(this.f123829g);
        sbJ.append(", contributors=");
        sbJ.append(this.f123830h);
        sbJ.append(", gaugeLowerLimit=");
        ds.e0.m(this.f123831i, this.f123832j, ", classificationLowerLimitIntermediate=", ", classificationLowerLimitTrained=", sbJ);
        ds.e0.m(this.f123833k, this.f123834l, ", classificationLowerLimitWellTrained=", ", classificationLowerLimitExpert=", sbJ);
        ds.e0.m(this.f123835m, this.f123836n, ", classificationLowerLimitSuperior=", ", classificationLowerLimitElite=", sbJ);
        return androidx.core.view.j.e(this.f123837o, this.f123838p, ", gaugeUpperLimit=", ")", sbJ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        Long l14 = this.f123823a;
        if (l14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l14);
        }
        Long l15 = this.f123824b;
        if (l15 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l15);
        }
        parcel.writeString(this.f123825c);
        Integer num = this.f123826d;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
        Integer num2 = this.f123827e;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num2);
        }
        Integer num3 = this.f123828f;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num3);
        }
        parcel.writeInt(this.f123829g ? 1 : 0);
        Iterator itE = kg.f.e(this.f123830h, parcel);
        while (itE.hasNext()) {
            ((n61.a) itE.next()).writeToParcel(parcel, i14);
        }
        parcel.writeInt(this.f123831i);
        parcel.writeInt(this.f123832j);
        parcel.writeInt(this.f123833k);
        parcel.writeInt(this.f123834l);
        parcel.writeInt(this.f123835m);
        parcel.writeInt(this.f123836n);
        parcel.writeInt(this.f123837o);
        parcel.writeInt(this.f123838p);
    }

    /* JADX INFO: renamed from: n61.c$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ln61/c$b;", "", "<init>", "()V", "Li63/c;", "Ln61/c;", "serializer", "()Li63/c;", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public final i63.c<c> serializer() {
            return a.f123839a;
        }

        private Companion() {
        }
    }

    public c(int i14, Long l14, Long l15, String str, Integer num, Integer num2, Integer num3, boolean z14, List list, int i15, int i16, int i17, int i18, int i19, int i24, int i25, int i26, u1 u1Var) {
        if ((i14 & 1) == 0) {
            this.f123823a = null;
        } else {
            this.f123823a = l14;
        }
        if ((i14 & 2) == 0) {
            this.f123824b = null;
        } else {
            this.f123824b = l15;
        }
        if ((i14 & 4) == 0) {
            this.f123825c = null;
        } else {
            this.f123825c = str;
        }
        if ((i14 & 8) == 0) {
            this.f123826d = null;
        } else {
            this.f123826d = num;
        }
        if ((i14 & 16) == 0) {
            this.f123827e = null;
        } else {
            this.f123827e = num2;
        }
        if ((i14 & 32) == 0) {
            this.f123828f = null;
        } else {
            this.f123828f = num3;
        }
        if ((i14 & 64) == 0) {
            this.f123829g = false;
        } else {
            this.f123829g = z14;
        }
        if ((i14 & 128) == 0) {
            this.f123830h = j0.f134944a;
        } else {
            this.f123830h = list;
        }
        if ((i14 & 256) == 0) {
            this.f123831i = 0;
        } else {
            this.f123831i = i15;
        }
        if ((i14 & 512) == 0) {
            this.f123832j = 0;
        } else {
            this.f123832j = i16;
        }
        if ((i14 & 1024) == 0) {
            this.f123833k = 0;
        } else {
            this.f123833k = i17;
        }
        if ((i14 & 2048) == 0) {
            this.f123834l = 0;
        } else {
            this.f123834l = i18;
        }
        if ((i14 & 4096) == 0) {
            this.f123835m = 0;
        } else {
            this.f123835m = i19;
        }
        if ((i14 & 8192) == 0) {
            this.f123836n = 0;
        } else {
            this.f123836n = i24;
        }
        if ((i14 & 16384) == 0) {
            this.f123837o = 0;
        } else {
            this.f123837o = i25;
        }
        if ((i14 & 32768) == 0) {
            this.f123838p = 0;
        } else {
            this.f123838p = i26;
        }
    }

    public c(Long l14, Long l15, String str, Integer num, Integer num2, Integer num3, boolean z14, List<n61.a> list, int i14, int i15, int i16, int i17, int i18, int i19, int i24, int i25) {
        list.getClass();
        this.f123823a = l14;
        this.f123824b = l15;
        this.f123825c = str;
        this.f123826d = num;
        this.f123827e = num2;
        this.f123828f = num3;
        this.f123829g = z14;
        this.f123830h = list;
        this.f123831i = i14;
        this.f123832j = i15;
        this.f123833k = i16;
        this.f123834l = i17;
        this.f123835m = i18;
        this.f123836n = i19;
        this.f123837o = i24;
        this.f123838p = i25;
    }

    public c() {
        this((Long) null, (Long) null, (String) null, (Integer) null, (Integer) null, (Integer) null, false, (List) null, 0, 0, 0, 0, 0, 0, 0, 0, 65535, (j) null);
    }
}
