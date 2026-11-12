package ww1;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.f3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import m63.k1;
import m63.m1;
import m63.u1;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00102\u00020\u0001:\u0002\u0011\u0012BM\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\t\u0010\nBk\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000f¨\u0006\u0013"}, d2 = {"Lww1/h0;", "Landroid/os/Parcelable;", "", "Lww1/i0;", "aerobicBase", "lactateThreshold", "recovery", "tempo", "vo2Max", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lm63/u1;)V", "Companion", "a", "b", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final /* data */ class h0 implements Parcelable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final o13.l<i63.c<Object>>[] f187786f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<i0> f187787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<i0> f187788b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<i0> f187789c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<i0> f187790d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<i0> f187791e;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<h0> CREATOR = new c();

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/training/model/WorkoutCompatibleActivitiesDTO.$serializer", "Lm63/e0;", "Lww1/h0;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @o13.e
    public static final /* synthetic */ class a implements m63.e0<h0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f187792a;
        private static final k63.e descriptor;

        static {
            a aVar = new a();
            f187792a = aVar;
            m1 m1Var = new m1("com.garmin.android.apps.connectmobile.training.model.WorkoutCompatibleActivitiesDTO", aVar, 5);
            m1Var.j("AEROBIC_BASE", false);
            m1Var.j("LACTATE_THRESHOLD", false);
            m1Var.j("RECOVERY", false);
            m1Var.j("TEMPO", false);
            m1Var.j("VO2MAX", false);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // m63.e0
        public final i63.c<?>[] childSerializers() {
            o13.l<i63.c<Object>>[] lVarArr = h0.f187786f;
            return new i63.c[]{lVarArr[0].getValue(), lVarArr[1].getValue(), lVarArr[2].getValue(), lVarArr[3].getValue(), lVarArr[4].getValue()};
        }

        @Override // i63.b
        public final Object deserialize(l63.e eVar) {
            eVar.getClass();
            k63.e eVar2 = descriptor;
            l63.c cVarC = eVar.c(eVar2);
            o13.l<i63.c<Object>>[] lVarArr = h0.f187786f;
            int i14 = l63.c.f110557a;
            boolean z14 = true;
            int i15 = 0;
            List list = null;
            List list2 = null;
            List list3 = null;
            List list4 = null;
            List list5 = null;
            while (z14) {
                int iE = cVarC.e(eVar2);
                if (iE == -1) {
                    z14 = false;
                } else if (iE == 0) {
                    list = (List) cVarC.l(eVar2, 0, lVarArr[0].getValue(), list);
                    i15 |= 1;
                } else if (iE == 1) {
                    list2 = (List) cVarC.l(eVar2, 1, lVarArr[1].getValue(), list2);
                    i15 |= 2;
                } else if (iE == 2) {
                    list3 = (List) cVarC.l(eVar2, 2, lVarArr[2].getValue(), list3);
                    i15 |= 4;
                } else if (iE == 3) {
                    list4 = (List) cVarC.l(eVar2, 3, lVarArr[3].getValue(), list4);
                    i15 |= 8;
                } else {
                    if (iE != 4) {
                        hb.a.o(iE);
                        return null;
                    }
                    list5 = (List) cVarC.l(eVar2, 4, lVarArr[4].getValue(), list5);
                    i15 |= 16;
                }
            }
            cVarC.b(eVar2);
            return new h0(i15, list, list2, list3, list4, list5, null);
        }

        @Override // i63.i, i63.b
        /* JADX INFO: renamed from: getDescriptor */
        public final k63.e getF158591b() {
            return descriptor;
        }

        @Override // i63.i
        public final void serialize(l63.f fVar, Object obj) {
            h0 h0Var = (h0) obj;
            h0Var.getClass();
            k63.e eVar = descriptor;
            l63.d dVarC = fVar.c(eVar);
            o13.l<i63.c<Object>>[] lVarArr = h0.f187786f;
            dVarC.e(eVar, 0, lVarArr[0].getValue(), h0Var.f187787a);
            dVarC.e(eVar, 1, lVarArr[1].getValue(), h0Var.f187788b);
            dVarC.e(eVar, 2, lVarArr[2].getValue(), h0Var.f187789c);
            dVarC.e(eVar, 3, lVarArr[3].getValue(), h0Var.f187790d);
            dVarC.e(eVar, 4, lVarArr[4].getValue(), h0Var.f187791e);
            dVarC.b(eVar);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements Parcelable.Creator<h0> {
        @Override // android.os.Parcelable.Creator
        public final h0 createFromParcel(Parcel parcel) {
            parcel.getClass();
            int i14 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i14);
            int iA = 0;
            int iA2 = 0;
            while (iA2 != i14) {
                iA2 = kg.f.a(i0.CREATOR, parcel, arrayList, iA2, 1);
            }
            int i15 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i15);
            int iA3 = 0;
            while (iA3 != i15) {
                iA3 = kg.f.a(i0.CREATOR, parcel, arrayList2, iA3, 1);
            }
            int i16 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(i16);
            int iA4 = 0;
            while (iA4 != i16) {
                iA4 = kg.f.a(i0.CREATOR, parcel, arrayList3, iA4, 1);
            }
            int i17 = parcel.readInt();
            ArrayList arrayList4 = new ArrayList(i17);
            int iA5 = 0;
            while (iA5 != i17) {
                iA5 = kg.f.a(i0.CREATOR, parcel, arrayList4, iA5, 1);
            }
            int i18 = parcel.readInt();
            ArrayList arrayList5 = new ArrayList(i18);
            while (iA != i18) {
                iA = kg.f.a(i0.CREATOR, parcel, arrayList5, iA, 1);
            }
            return new h0(arrayList, arrayList2, arrayList3, arrayList4, arrayList5);
        }

        @Override // android.os.Parcelable.Creator
        public final h0[] newArray(int i14) {
            return new h0[i14];
        }
    }

    public static final /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f187793a;

        static {
            int[] iArr = new int[qs.u.values().length];
            try {
                iArr[qs.u.AEROBIC_BASE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[qs.u.LACTATE_THRESHOLD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[qs.u.RECOVERY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[qs.u.TEMPO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[qs.u.VO2MAX.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f187793a = iArr;
        }
    }

    static {
        o13.n nVar = o13.n.PUBLICATION;
        f187786f = new o13.l[]{o13.m.a(nVar, new wn1.d0(13)), o13.m.a(nVar, new wn1.d0(14)), o13.m.a(nVar, new wn1.d0(15)), o13.m.a(nVar, new wn1.d0(16)), o13.m.a(nVar, new wn1.d0(17))};
    }

    public /* synthetic */ h0(int i14, List list, List list2, List list3, List list4, List list5, u1 u1Var) {
        if (31 != (i14 & 31)) {
            k1.h(i14, 31, a.f187792a.getF158591b());
            throw null;
        }
        this.f187787a = list;
        this.f187788b = list2;
        this.f187789c = list3;
        this.f187790d = list4;
        this.f187791e = list5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        return p005kotlin.jvm.internal.s.g(this.f187787a, h0Var.f187787a) && p005kotlin.jvm.internal.s.g(this.f187788b, h0Var.f187788b) && p005kotlin.jvm.internal.s.g(this.f187789c, h0Var.f187789c) && p005kotlin.jvm.internal.s.g(this.f187790d, h0Var.f187790d) && p005kotlin.jvm.internal.s.g(this.f187791e, h0Var.f187791e);
    }

    public final int hashCode() {
        return this.f187791e.hashCode() + u0.b(u0.b(u0.b(this.f187787a.hashCode() * 31, 31, this.f187788b), 31, this.f187789c), 31, this.f187790d);
    }

    public final String toString() {
        StringBuilder sbK = f3.k("WorkoutCompatibleActivitiesDTO(aerobicBase=", ", lactateThreshold=", ", recovery=", this.f187787a, this.f187788b);
        n23.j.z(sbK, this.f187789c, ", tempo=", this.f187790d, ", vo2Max=");
        return u62.z.c(sbK, this.f187791e, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        Iterator itE = kg.f.e(this.f187787a, parcel);
        while (itE.hasNext()) {
            ((i0) itE.next()).writeToParcel(parcel, i14);
        }
        Iterator itE2 = kg.f.e(this.f187788b, parcel);
        while (itE2.hasNext()) {
            ((i0) itE2.next()).writeToParcel(parcel, i14);
        }
        Iterator itE3 = kg.f.e(this.f187789c, parcel);
        while (itE3.hasNext()) {
            ((i0) itE3.next()).writeToParcel(parcel, i14);
        }
        Iterator itE4 = kg.f.e(this.f187790d, parcel);
        while (itE4.hasNext()) {
            ((i0) itE4.next()).writeToParcel(parcel, i14);
        }
        Iterator itE5 = kg.f.e(this.f187791e, parcel);
        while (itE5.hasNext()) {
            ((i0) itE5.next()).writeToParcel(parcel, i14);
        }
    }

    /* JADX INFO: renamed from: ww1.h0$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lww1/h0$b;", "", "<init>", "()V", "Li63/c;", "Lww1/h0;", "serializer", "()Li63/c;", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<h0> serializer() {
            return a.f187792a;
        }

        private Companion() {
        }
    }

    public h0(List<i0> list, List<i0> list2, List<i0> list3, List<i0> list4, List<i0> list5) {
        list.getClass();
        list2.getClass();
        list3.getClass();
        list4.getClass();
        list5.getClass();
        this.f187787a = list;
        this.f187788b = list2;
        this.f187789c = list3;
        this.f187790d = list4;
        this.f187791e = list5;
    }
}
