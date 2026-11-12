package n61;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m63.e0;
import m63.k1;
import m63.m0;
import m63.m1;
import m63.u1;
import mz1.d0;
import o13.l;
import o13.m;
import o13.n;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p13.j0;
import u62.z;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u0000 \u00172\u00020\u0001:\u0002\u000e\u0012B+\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tB?\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\b\u0010\rR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0016¨\u0006\u0018"}, d2 = {"Ln61/g;", "Landroid/os/Parcelable;", "", "groupAverage", "groupMax", "", "Ln61/a;", "enduranceContributorDTOList", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;)V", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Lm63/u1;)V", "a", "Ljava/lang/Integer;", "d", "()Ljava/lang/Integer;", "b", "getGroupMax", "c", "Ljava/util/List;", "()Ljava/util/List;", "Companion", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final /* data */ class g implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("groupAverage")
    private final Integer groupAverage;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("groupMax")
    private final Integer groupMax;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("enduranceContributorDTOList")
    private final List<n61.a> enduranceContributorDTOList;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<g> CREATOR = new c();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final l<i63.c<Object>>[] f123859d = {null, null, m.a(n.PUBLICATION, new d0(28))};

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/performance/endurancescore/model/EnduranceScoreReportGroupDTO.$serializer", "Lm63/e0;", "Ln61/g;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @o13.e
    public static final /* synthetic */ class a implements e0<g> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f123863a;
        private static final k63.e descriptor;

        static {
            a aVar = new a();
            f123863a = aVar;
            m1 m1Var = new m1("com.garmin.android.apps.connectmobile.performance.endurancescore.model.EnduranceScoreReportGroupDTO", aVar, 3);
            m1Var.j("groupAverage", false);
            m1Var.j("groupMax", false);
            m1Var.j("enduranceContributorDTOList", true);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // m63.e0
        public final i63.c<?>[] childSerializers() {
            l<i63.c<Object>>[] lVarArr = g.f123859d;
            m0 m0Var = m0.f116981a;
            return new i63.c[]{j63.a.d(m0Var), j63.a.d(m0Var), lVarArr[2].getValue()};
        }

        @Override // i63.b
        public final Object deserialize(l63.e eVar) {
            eVar.getClass();
            k63.e eVar2 = descriptor;
            l63.c cVarC = eVar.c(eVar2);
            l<i63.c<Object>>[] lVarArr = g.f123859d;
            int i14 = l63.c.f110557a;
            boolean z14 = true;
            int i15 = 0;
            Integer num = null;
            Integer num2 = null;
            List list = null;
            while (z14) {
                int iE = cVarC.e(eVar2);
                if (iE == -1) {
                    z14 = false;
                } else if (iE == 0) {
                    num = (Integer) cVarC.v(eVar2, 0, m0.f116981a, num);
                    i15 |= 1;
                } else if (iE == 1) {
                    num2 = (Integer) cVarC.v(eVar2, 1, m0.f116981a, num2);
                    i15 |= 2;
                } else {
                    if (iE != 2) {
                        hb.a.o(iE);
                        return null;
                    }
                    list = (List) cVarC.l(eVar2, 2, lVarArr[2].getValue(), list);
                    i15 |= 4;
                }
            }
            cVarC.b(eVar2);
            return new g(i15, num, num2, list, (u1) null);
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
            k63.e eVar = descriptor;
            l63.d dVarC = fVar.c(eVar);
            g.f(gVar, dVarC, eVar);
            dVarC.b(eVar);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements Parcelable.Creator<g> {
        @Override // android.os.Parcelable.Creator
        public final g createFromParcel(Parcel parcel) {
            parcel.getClass();
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf2 = parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null;
            int i14 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i14);
            int iA = 0;
            while (iA != i14) {
                iA = kg.f.a(n61.a.CREATOR, parcel, arrayList, iA, 1);
            }
            return new g(numValueOf, numValueOf2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final g[] newArray(int i14) {
            return new g[i14];
        }
    }

    public g(int i14, Integer num, Integer num2, List list, u1 u1Var) {
        if (3 != (i14 & 3)) {
            k1.h(i14, 3, a.f123863a.getF158591b());
            throw null;
        }
        this.groupAverage = num;
        this.groupMax = num2;
        if ((i14 & 4) == 0) {
            this.enduranceContributorDTOList = j0.f134944a;
        } else {
            this.enduranceContributorDTOList = list;
        }
    }

    public static final void f(g gVar, l63.d dVar, k63.e eVar) {
        m0 m0Var = m0.f116981a;
        dVar.d(eVar, 0, m0Var, gVar.groupAverage);
        dVar.d(eVar, 1, m0Var, gVar.groupMax);
        if (!dVar.C(eVar) && s.g(gVar.enduranceContributorDTOList, j0.f134944a)) {
            return;
        }
        dVar.e(eVar, 2, f123859d[2].getValue(), gVar.enduranceContributorDTOList);
    }

    public final List<n61.a> b() {
        return this.enduranceContributorDTOList;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Integer getGroupAverage() {
        return this.groupAverage;
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
        return s.g(this.groupAverage, gVar.groupAverage) && s.g(this.groupMax, gVar.groupMax) && s.g(this.enduranceContributorDTOList, gVar.enduranceContributorDTOList);
    }

    public final int hashCode() {
        Integer num = this.groupAverage;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.groupMax;
        return this.enduranceContributorDTOList.hashCode() + ((iHashCode + (num2 != null ? num2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        Integer num = this.groupAverage;
        Integer num2 = this.groupMax;
        return z.c(com.airbnb.lottie.animation.keyframe.a.l(num, "EnduranceScoreReportGroupDTO(groupAverage=", ", groupMax=", ", enduranceContributorDTOList=", num2), this.enduranceContributorDTOList, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        Integer num = this.groupAverage;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
        Integer num2 = this.groupMax;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num2);
        }
        Iterator itE = kg.f.e(this.enduranceContributorDTOList, parcel);
        while (itE.hasNext()) {
            ((n61.a) itE.next()).writeToParcel(parcel, i14);
        }
    }

    /* JADX INFO: renamed from: n61.g$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ln61/g$b;", "", "<init>", "()V", "Li63/c;", "Ln61/g;", "serializer", "()Li63/c;", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public final i63.c<g> serializer() {
            return a.f123863a;
        }

        private Companion() {
        }
    }

    public g(Integer num, Integer num2, List<n61.a> list) {
        list.getClass();
        this.groupAverage = num;
        this.groupMax = num2;
        this.enduranceContributorDTOList = list;
    }

    public g(Integer num, Integer num2, List list, int i14, j jVar) {
        this(num, num2, (i14 & 4) != 0 ? j0.f134944a : list);
    }
}
