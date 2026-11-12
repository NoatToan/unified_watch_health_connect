package s21;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m63.m1;
import m63.u1;
import p005kotlin.Metadata;
import p13.j0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u000e2\u00020\u0001:\u0002\u000f\u0010B!\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bB3\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\r¨\u0006\u0011"}, d2 = {"Ls21/o;", "Landroid/os/Parcelable;", "", "isTrackingEnabled", "", "Ls21/n;", "micronutrients", "<init>", "(ZLjava/util/List;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(IZLjava/util/List;Lm63/u1;)V", "Companion", "a", "b", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final /* data */ class o implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f156159a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<n> f156160b;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<o> CREATOR = new c();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final o13.l<i63.c<Object>>[] f156158c = {null, o13.m.a(o13.n.PUBLICATION, new ro0.h(16))};

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/nutrition/presentation/setup/model/MicronutrientsSettings.$serializer", "Lm63/e0;", "Ls21/o;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @o13.e
    public static final /* synthetic */ class a implements m63.e0<o> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f156161a;
        private static final k63.e descriptor;

        static {
            a aVar = new a();
            f156161a = aVar;
            m1 m1Var = new m1("com.garmin.android.apps.connectmobile.nutrition.presentation.setup.model.MicronutrientsSettings", aVar, 2);
            m1Var.j("isTrackingEnabled", true);
            m1Var.j("micronutrients", true);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // m63.e0
        public final i63.c<?>[] childSerializers() {
            return new i63.c[]{m63.g.f116948a, o.f156158c[1].getValue()};
        }

        @Override // i63.b
        public final Object deserialize(l63.e eVar) {
            eVar.getClass();
            k63.e eVar2 = descriptor;
            l63.c cVarC = eVar.c(eVar2);
            o13.l<i63.c<Object>>[] lVarArr = o.f156158c;
            int i14 = l63.c.f110557a;
            boolean z14 = true;
            int i15 = 0;
            boolean zG = false;
            List list = null;
            while (z14) {
                int iE = cVarC.e(eVar2);
                if (iE == -1) {
                    z14 = false;
                } else if (iE == 0) {
                    zG = cVarC.g(eVar2, 0);
                    i15 |= 1;
                } else {
                    if (iE != 1) {
                        hb.a.o(iE);
                        return null;
                    }
                    list = (List) cVarC.l(eVar2, 1, lVarArr[1].getValue(), list);
                    i15 |= 2;
                }
            }
            cVarC.b(eVar2);
            return new o(i15, zG, list, (u1) null);
        }

        @Override // i63.i, i63.b
        /* JADX INFO: renamed from: getDescriptor */
        public final k63.e getF94809a() {
            return descriptor;
        }

        @Override // i63.i
        public final void serialize(l63.f fVar, Object obj) {
            o oVar = (o) obj;
            oVar.getClass();
            List<n> list = oVar.f156160b;
            boolean z14 = oVar.f156159a;
            k63.e eVar = descriptor;
            l63.d dVarC = fVar.c(eVar);
            o13.l<i63.c<Object>>[] lVarArr = o.f156158c;
            if (dVarC.C(eVar) || z14) {
                dVarC.n(eVar, 0, z14);
            }
            if (dVarC.C(eVar) || !p005kotlin.jvm.internal.s.g(list, j0.f134944a)) {
                dVarC.e(eVar, 1, lVarArr[1].getValue(), list);
            }
            dVarC.b(eVar);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements Parcelable.Creator<o> {
        @Override // android.os.Parcelable.Creator
        public final o createFromParcel(Parcel parcel) {
            parcel.getClass();
            int iA = 0;
            boolean z14 = parcel.readInt() != 0;
            int i14 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i14);
            while (iA != i14) {
                iA = kg.f.a(n.CREATOR, parcel, arrayList, iA, 1);
            }
            return new o(z14, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final o[] newArray(int i14) {
            return new o[i14];
        }
    }

    public o(int i14, boolean z14, List list, u1 u1Var) {
        this.f156159a = (i14 & 1) == 0 ? false : z14;
        if ((i14 & 2) == 0) {
            this.f156160b = j0.f134944a;
        } else {
            this.f156160b = list;
        }
    }

    public static o b(o oVar, ArrayList arrayList) {
        boolean z14 = oVar.f156159a;
        oVar.getClass();
        return new o(z14, arrayList);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f156159a == oVar.f156159a && p005kotlin.jvm.internal.s.g(this.f156160b, oVar.f156160b);
    }

    public final int hashCode() {
        return this.f156160b.hashCode() + (Boolean.hashCode(this.f156159a) * 31);
    }

    public final String toString() {
        return "MicronutrientsSettings(isTrackingEnabled=" + this.f156159a + ", micronutrients=" + this.f156160b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeInt(this.f156159a ? 1 : 0);
        Iterator itE = kg.f.e(this.f156160b, parcel);
        while (itE.hasNext()) {
            ((n) itE.next()).writeToParcel(parcel, i14);
        }
    }

    /* JADX INFO: renamed from: s21.o$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ls21/o$b;", "", "<init>", "()V", "Li63/c;", "Ls21/o;", "serializer", "()Li63/c;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<o> serializer() {
            return a.f156161a;
        }

        private Companion() {
        }
    }

    public o() {
        this(false, (List) null, 3, (p005kotlin.jvm.internal.j) null);
    }

    public o(boolean z14, List<n> list) {
        list.getClass();
        this.f156159a = z14;
        this.f156160b = list;
    }

    public o(boolean z14, List list, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? false : z14, (i14 & 2) != 0 ? j0.f134944a : list);
    }
}
