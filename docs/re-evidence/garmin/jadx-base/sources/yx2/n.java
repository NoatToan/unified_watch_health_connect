package yx2;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import m63.e0;
import m63.k1;
import m63.m1;
import m63.u1;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u000e2\u00020\u0001:\u0002\u000f\u0010B!\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\r¨\u0006\u0011"}, d2 = {"Lyx2/n;", "Landroid/os/Parcelable;", "", "Lyx2/c;", "activeSubscriptions", "Lyx2/j;", "purchasableSubscriptions", "<init>", "(Ljava/util/List;Lyx2/j;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/util/List;Lyx2/j;Lm63/u1;)V", "Companion", "a", "b", "subscriptions-purchase_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@i63.h
public final /* data */ class n implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<yx2.c> f200128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f200129b;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<n> CREATOR = new c();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final o13.l<i63.c<Object>>[] f200127c = {o13.m.a(o13.n.PUBLICATION, new b(7)), null};

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/subscriptions/dto/SubscriptionsDTO.$serializer", "Lm63/e0;", "Lyx2/n;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "subscriptions-purchase_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @o13.e
    public /* synthetic */ class a implements e0<n> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f200130a;
        private static final k63.e descriptor;

        static {
            a aVar = new a();
            f200130a = aVar;
            m1 m1Var = new m1("com.garmin.subscriptions.dto.SubscriptionsDTO", aVar, 2);
            m1Var.j("activeSubscriptions", false);
            m1Var.j("purchasableSubscriptions", false);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // m63.e0
        public final i63.c<?>[] childSerializers() {
            return new i63.c[]{j63.a.d(n.f200127c[0].getValue()), j63.a.d(j.a.f200109a)};
        }

        @Override // i63.b
        public final Object deserialize(l63.e eVar) {
            eVar.getClass();
            k63.e eVar2 = descriptor;
            l63.c cVarC = eVar.c(eVar2);
            o13.l<i63.c<Object>>[] lVarArr = n.f200127c;
            int i14 = l63.c.f110557a;
            u1 u1Var = null;
            boolean z14 = true;
            int i15 = 0;
            List list = null;
            j jVar = null;
            while (z14) {
                int iE = cVarC.e(eVar2);
                if (iE == -1) {
                    z14 = false;
                } else if (iE == 0) {
                    list = (List) cVarC.v(eVar2, 0, lVarArr[0].getValue(), list);
                    i15 |= 1;
                } else {
                    if (iE != 1) {
                        hb.a.o(iE);
                        return null;
                    }
                    jVar = (j) cVarC.v(eVar2, 1, j.a.f200109a, jVar);
                    i15 |= 2;
                }
            }
            cVarC.b(eVar2);
            return new n(i15, list, jVar, u1Var);
        }

        @Override // i63.i, i63.b
        /* JADX INFO: renamed from: getDescriptor */
        public final k63.e getF158591b() {
            return descriptor;
        }

        @Override // i63.i
        public final void serialize(l63.f fVar, Object obj) {
            n nVar = (n) obj;
            nVar.getClass();
            k63.e eVar = descriptor;
            l63.d dVarC = fVar.c(eVar);
            dVarC.d(eVar, 0, n.f200127c[0].getValue(), nVar.f200128a);
            dVarC.d(eVar, 1, j.a.f200109a, nVar.f200129b);
            dVarC.b(eVar);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class c implements Parcelable.Creator<n> {
        @Override // android.os.Parcelable.Creator
        public final n createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            parcel.getClass();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i14 = parcel.readInt();
                arrayList = new ArrayList(i14);
                int iA = 0;
                while (iA != i14) {
                    iA = kg.f.a(yx2.c.CREATOR, parcel, arrayList, iA, 1);
                }
            }
            return new n(arrayList, parcel.readInt() != 0 ? j.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final n[] newArray(int i14) {
            return new n[i14];
        }
    }

    public /* synthetic */ n(int i14, List list, j jVar, u1 u1Var) {
        if (3 != (i14 & 3)) {
            k1.h(i14, 3, a.f200130a.getF158591b());
            throw null;
        }
        this.f200128a = list;
        this.f200129b = jVar;
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
        return s.g(this.f200128a, nVar.f200128a) && s.g(this.f200129b, nVar.f200129b);
    }

    public final int hashCode() {
        List<yx2.c> list = this.f200128a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        j jVar = this.f200129b;
        return iHashCode + (jVar != null ? jVar.hashCode() : 0);
    }

    public final String toString() {
        return "SubscriptionsDTO(activeSubscriptions=" + this.f200128a + ", purchasableSubscriptions=" + this.f200129b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        List<yx2.c> list = this.f200128a;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO = u0.o(parcel, list, 1);
            while (itO.hasNext()) {
                ((yx2.c) itO.next()).writeToParcel(parcel, i14);
            }
        }
        j jVar = this.f200129b;
        if (jVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            jVar.writeToParcel(parcel, i14);
        }
    }

    /* JADX INFO: renamed from: yx2.n$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lyx2/n$b;", "", "<init>", "()V", "Li63/c;", "Lyx2/n;", "serializer", "()Li63/c;", "subscriptions-purchase_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final i63.c<n> serializer() {
            return a.f200130a;
        }

        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }
    }

    public n(List<yx2.c> list, j jVar) {
        this.f200128a = list;
        this.f200129b = jVar;
    }
}
