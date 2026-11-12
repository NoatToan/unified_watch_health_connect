package c42;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import m63.m1;
import m63.u1;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \f2\u00020\u0001:\u0002\r\u000eB\u0019\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B+\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000b¨\u0006\u000f"}, d2 = {"Lc42/b;", "Landroid/os/Parcelable;", "", "Lsd2/f;", "screenlessDevices", "<init>", "(Ljava/util/List;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/util/List;Lm63/u1;)V", "Companion", "a", "b", "gcm-vo2_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final /* data */ class b implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<sd2.f> f24352a;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<b> CREATOR = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final o13.l<i63.c<Object>>[] f24351b = {o13.m.a(o13.n.PUBLICATION, new bv0.b(19))};

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/vo2/reports/presentation/onboarding/VO2MaxExtraDataWrapper.$serializer", "Lm63/e0;", "Lc42/b;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-vo2_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @o13.e
    public static final /* synthetic */ class a implements m63.e0<b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f24353a;
        private static final k63.e descriptor;

        static {
            a aVar = new a();
            f24353a = aVar;
            m1 m1Var = new m1("com.garmin.android.apps.connectmobile.vo2.reports.presentation.onboarding.VO2MaxExtraDataWrapper", aVar, 1);
            m1Var.j("screenlessDevices", true);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // m63.e0
        public final i63.c<?>[] childSerializers() {
            return new i63.c[]{j63.a.d(b.f24351b[0].getValue())};
        }

        @Override // i63.b
        public final Object deserialize(l63.e eVar) {
            eVar.getClass();
            k63.e eVar2 = descriptor;
            l63.c cVarC = eVar.c(eVar2);
            o13.l<i63.c<Object>>[] lVarArr = b.f24351b;
            int i14 = l63.c.f110557a;
            u1 u1Var = null;
            boolean z14 = true;
            int i15 = 0;
            List list = null;
            while (z14) {
                int iE = cVarC.e(eVar2);
                if (iE == -1) {
                    z14 = false;
                } else {
                    if (iE != 0) {
                        hb.a.o(iE);
                        return null;
                    }
                    list = (List) cVarC.v(eVar2, 0, lVarArr[0].getValue(), list);
                    i15 = 1;
                }
            }
            cVarC.b(eVar2);
            return new b(i15, list, u1Var);
        }

        @Override // i63.i, i63.b
        /* JADX INFO: renamed from: getDescriptor */
        public final k63.e getF158591b() {
            return descriptor;
        }

        @Override // i63.i
        public final void serialize(l63.f fVar, Object obj) {
            b bVar = (b) obj;
            bVar.getClass();
            List<sd2.f> list = bVar.f24352a;
            k63.e eVar = descriptor;
            l63.d dVarC = fVar.c(eVar);
            o13.l<i63.c<Object>>[] lVarArr = b.f24351b;
            if (dVarC.C(eVar) || list != null) {
                dVarC.d(eVar, 0, lVarArr[0].getValue(), list);
            }
            dVarC.b(eVar);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        public final b createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            parcel.getClass();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i14 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i14);
                int iD = 0;
                while (iD != i14) {
                    iD = u0.d(b.class, parcel, arrayList2, iD, 1);
                }
                arrayList = arrayList2;
            }
            return new b(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final b[] newArray(int i14) {
            return new b[i14];
        }
    }

    public /* synthetic */ b(int i14, List list, u1 u1Var) {
        if ((i14 & 1) == 0) {
            this.f24352a = null;
        } else {
            this.f24352a = list;
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
        return (obj instanceof b) && p005kotlin.jvm.internal.s.g(this.f24352a, ((b) obj).f24352a);
    }

    public final int hashCode() {
        List<sd2.f> list = this.f24352a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return tn.k.h("VO2MaxExtraDataWrapper(screenlessDevices=", ")", this.f24352a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        List<sd2.f> list = this.f24352a;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itO = u0.o(parcel, list, 1);
        while (itO.hasNext()) {
            parcel.writeParcelable((Parcelable) itO.next(), i14);
        }
    }

    /* JADX INFO: renamed from: c42.b$b, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lc42/b$b;", "", "<init>", "()V", "Li63/c;", "Lc42/b;", "serializer", "()Li63/c;", "gcm-vo2_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<b> serializer() {
            return a.f24353a;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b() {
        this((List) null, 1, (p005kotlin.jvm.internal.j) (0 == true ? 1 : 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(List<? extends sd2.f> list) {
        this.f24352a = list;
    }

    public /* synthetic */ b(List list, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : list);
    }
}
