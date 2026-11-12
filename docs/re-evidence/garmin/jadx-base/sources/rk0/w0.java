package rk0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import m63.k1;
import m63.m1;
import m63.u1;
import m63.y1;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u000e2\u00020\u0001:\u0002\u000f\u0010B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tB;\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\b\u0010\r¨\u0006\u0011"}, d2 = {"Lrk0/w0;", "Landroid/os/Parcelable;", "", "gearName", "", "Lam/x0;", "", "countByActivityType", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/Map;Lm63/u1;)V", "Companion", "a", "b", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final /* data */ class w0 implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f153290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<am.x0, Integer> f153291b;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<w0> CREATOR = new c();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final o13.l<i63.c<Object>>[] f153289c = {null, o13.m.a(o13.n.PUBLICATION, new ri1.b(28))};

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/gear/presentation/details/TrackedActivitiesData.$serializer", "Lm63/e0;", "Lrk0/w0;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @o13.e
    public static final /* synthetic */ class a implements m63.e0<w0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f153292a;
        private static final k63.e descriptor;

        static {
            a aVar = new a();
            f153292a = aVar;
            m1 m1Var = new m1("com.garmin.android.apps.connectmobile.gear.presentation.details.TrackedActivitiesData", aVar, 2);
            m1Var.j("gearName", false);
            m1Var.j("countByActivityType", false);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // m63.e0
        public final i63.c<?>[] childSerializers() {
            return new i63.c[]{y1.f117048a, w0.f153289c[1].getValue()};
        }

        @Override // i63.b
        public final Object deserialize(l63.e eVar) {
            eVar.getClass();
            k63.e eVar2 = descriptor;
            l63.c cVarC = eVar.c(eVar2);
            o13.l<i63.c<Object>>[] lVarArr = w0.f153289c;
            int i14 = l63.c.f110557a;
            u1 u1Var = null;
            boolean z14 = true;
            int i15 = 0;
            String strR = null;
            Map map = null;
            while (z14) {
                int iE = cVarC.e(eVar2);
                if (iE == -1) {
                    z14 = false;
                } else if (iE == 0) {
                    strR = cVarC.r(eVar2, 0);
                    i15 |= 1;
                } else {
                    if (iE != 1) {
                        hb.a.o(iE);
                        return null;
                    }
                    map = (Map) cVarC.l(eVar2, 1, lVarArr[1].getValue(), map);
                    i15 |= 2;
                }
            }
            cVarC.b(eVar2);
            return new w0(i15, strR, map, u1Var);
        }

        @Override // i63.i, i63.b
        /* JADX INFO: renamed from: getDescriptor */
        public final k63.e getF158591b() {
            return descriptor;
        }

        @Override // i63.i
        public final void serialize(l63.f fVar, Object obj) {
            w0 w0Var = (w0) obj;
            w0Var.getClass();
            k63.e eVar = descriptor;
            l63.d dVarC = fVar.c(eVar);
            o13.l<i63.c<Object>>[] lVarArr = w0.f153289c;
            dVarC.k(eVar, 0, w0Var.f153290a);
            dVarC.e(eVar, 1, lVarArr[1].getValue(), w0Var.f153291b);
            dVarC.b(eVar);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements Parcelable.Creator<w0> {
        @Override // android.os.Parcelable.Creator
        public final w0 createFromParcel(Parcel parcel) {
            parcel.getClass();
            String string = parcel.readString();
            int i14 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i14);
            for (int i15 = 0; i15 != i14; i15++) {
                linkedHashMap.put(parcel.readParcelable(w0.class.getClassLoader()), Integer.valueOf(parcel.readInt()));
            }
            return new w0(string, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final w0[] newArray(int i14) {
            return new w0[i14];
        }
    }

    public /* synthetic */ w0(int i14, String str, Map map, u1 u1Var) {
        if (3 != (i14 & 3)) {
            k1.h(i14, 3, a.f153292a.getF158591b());
            throw null;
        }
        this.f153290a = str;
        this.f153291b = map;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj;
        return p005kotlin.jvm.internal.s.g(this.f153290a, w0Var.f153290a) && p005kotlin.jvm.internal.s.g(this.f153291b, w0Var.f153291b);
    }

    public final int hashCode() {
        return this.f153291b.hashCode() + (this.f153290a.hashCode() * 31);
    }

    public final String toString() {
        return "TrackedActivitiesData(gearName=" + this.f153290a + ", countByActivityType=" + this.f153291b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.f153290a);
        Iterator itU = am.j.u(this.f153291b, parcel);
        while (itU.hasNext()) {
            Map.Entry entry = (Map.Entry) itU.next();
            parcel.writeParcelable((Parcelable) entry.getKey(), i14);
            parcel.writeInt(((Number) entry.getValue()).intValue());
        }
    }

    /* JADX INFO: renamed from: rk0.w0$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lrk0/w0$b;", "", "<init>", "()V", "Li63/c;", "Lrk0/w0;", "serializer", "()Li63/c;", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<w0> serializer() {
            return a.f153292a;
        }

        private Companion() {
        }
    }

    public w0(String str, Map<am.x0, Integer> map) {
        str.getClass();
        map.getClass();
        this.f153290a = str;
        this.f153291b = map;
    }
}
