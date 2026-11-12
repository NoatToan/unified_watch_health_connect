package qk0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import m63.e0;
import m63.k1;
import m63.m1;
import m63.u1;
import p005kotlin.Metadata;
import p13.h0;
import p13.l0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u000f2\u00020\u0001:\u0002\u0010\u0011B5\b\u0002\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\u0004\b\b\u0010\tBK\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000e¨\u0006\u0012"}, d2 = {"Lqk0/c;", "Landroid/os/Parcelable;", "", "Lc80/u;", "gearTypesToCheck", "", "allowedGearUUIDs", "allowedCollectionUUIDs", "<init>", "(Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/util/Set;Ljava/util/Set;Ljava/util/Set;Lm63/u1;)V", "Companion", "b", "a", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final /* data */ class c implements Parcelable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final o13.l<i63.c<Object>>[] f145081d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set<c80.u> f145082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set<String> f145083b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set<String> f145084c;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<c> CREATOR = new C2736c();

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/gear/presentation/defaultactivities/DefaultActivitySelectionConfig.$serializer", "Lm63/e0;", "Lqk0/c;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @o13.e
    public static final /* synthetic */ class a implements e0<c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f145085a;
        private static final k63.e descriptor;

        static {
            a aVar = new a();
            f145085a = aVar;
            m1 m1Var = new m1("com.garmin.android.apps.connectmobile.gear.presentation.defaultactivities.DefaultActivitySelectionConfig", aVar, 3);
            m1Var.j("gearTypesToCheck", false);
            m1Var.j("allowedGearUUIDs", false);
            m1Var.j("allowedCollectionUUIDs", true);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // m63.e0
        public final i63.c<?>[] childSerializers() {
            o13.l<i63.c<Object>>[] lVarArr = c.f145081d;
            return new i63.c[]{lVarArr[0].getValue(), lVarArr[1].getValue(), lVarArr[2].getValue()};
        }

        @Override // i63.b
        public final Object deserialize(l63.e eVar) {
            eVar.getClass();
            k63.e eVar2 = descriptor;
            l63.c cVarC = eVar.c(eVar2);
            o13.l<i63.c<Object>>[] lVarArr = c.f145081d;
            int i14 = l63.c.f110557a;
            boolean z14 = true;
            int i15 = 0;
            Set set = null;
            Set set2 = null;
            Set set3 = null;
            while (z14) {
                int iE = cVarC.e(eVar2);
                if (iE == -1) {
                    z14 = false;
                } else if (iE == 0) {
                    set = (Set) cVarC.l(eVar2, 0, lVarArr[0].getValue(), set);
                    i15 |= 1;
                } else if (iE == 1) {
                    set2 = (Set) cVarC.l(eVar2, 1, lVarArr[1].getValue(), set2);
                    i15 |= 2;
                } else {
                    if (iE != 2) {
                        hb.a.o(iE);
                        return null;
                    }
                    set3 = (Set) cVarC.l(eVar2, 2, lVarArr[2].getValue(), set3);
                    i15 |= 4;
                }
            }
            cVarC.b(eVar2);
            return new c(i15, set, set2, set3, (u1) null);
        }

        @Override // i63.i, i63.b
        /* JADX INFO: renamed from: getDescriptor */
        public final k63.e getF116202c() {
            return descriptor;
        }

        @Override // i63.i
        public final void serialize(l63.f fVar, Object obj) {
            c cVar = (c) obj;
            cVar.getClass();
            k63.e eVar = descriptor;
            l63.d dVarC = fVar.c(eVar);
            o13.l<i63.c<Object>>[] lVarArr = c.f145081d;
            i63.c<Object> value = lVarArr[0].getValue();
            Set<c80.u> set = cVar.f145082a;
            Set<String> set2 = cVar.f145084c;
            dVarC.e(eVar, 0, value, set);
            dVarC.e(eVar, 1, lVarArr[1].getValue(), cVar.f145083b);
            if (dVarC.C(eVar) || !p005kotlin.jvm.internal.s.g(set2, l0.f134950a)) {
                dVarC.e(eVar, 2, lVarArr[2].getValue(), set2);
            }
            dVarC.b(eVar);
        }
    }

    /* JADX INFO: renamed from: qk0.c$c, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C2736c implements Parcelable.Creator<c> {
        @Override // android.os.Parcelable.Creator
        public final c createFromParcel(Parcel parcel) {
            parcel.getClass();
            int i14 = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(i14);
            for (int i15 = 0; i15 != i14; i15++) {
                linkedHashSet.add(c80.u.valueOf(parcel.readString()));
            }
            int i16 = parcel.readInt();
            LinkedHashSet linkedHashSet2 = new LinkedHashSet(i16);
            for (int i17 = 0; i17 != i16; i17++) {
                linkedHashSet2.add(parcel.readString());
            }
            int i18 = parcel.readInt();
            LinkedHashSet linkedHashSet3 = new LinkedHashSet(i18);
            for (int i19 = 0; i19 != i18; i19++) {
                linkedHashSet3.add(parcel.readString());
            }
            return new c(linkedHashSet, linkedHashSet2, linkedHashSet3, null);
        }

        @Override // android.os.Parcelable.Creator
        public final c[] newArray(int i14) {
            return new c[i14];
        }
    }

    static {
        o13.n nVar = o13.n.PUBLICATION;
        f145081d = new o13.l[]{o13.m.a(nVar, new q53.q(21)), o13.m.a(nVar, new q53.q(22)), o13.m.a(nVar, new q53.q(23))};
    }

    public c(int i14, Set set, Set set2, Set set3, u1 u1Var) {
        if (3 != (i14 & 3)) {
            k1.h(i14, 3, a.f145085a.getF116202c());
            throw null;
        }
        this.f145082a = set;
        this.f145083b = set2;
        if ((i14 & 4) == 0) {
            this.f145084c = l0.f134950a;
        } else {
            this.f145084c = set3;
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
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return p005kotlin.jvm.internal.s.g(this.f145082a, cVar.f145082a) && p005kotlin.jvm.internal.s.g(this.f145083b, cVar.f145083b) && p005kotlin.jvm.internal.s.g(this.f145084c, cVar.f145084c);
    }

    public final int hashCode() {
        return this.f145084c.hashCode() + ((this.f145083b.hashCode() + (this.f145082a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "DefaultActivitySelectionConfig(gearTypesToCheck=" + this.f145082a + ", allowedGearUUIDs=" + this.f145083b + ", allowedCollectionUUIDs=" + this.f145084c + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        Set<c80.u> set = this.f145082a;
        parcel.writeInt(set.size());
        Iterator<c80.u> it = set.iterator();
        while (it.hasNext()) {
            parcel.writeString(it.next().name());
        }
        Set<String> set2 = this.f145083b;
        parcel.writeInt(set2.size());
        Iterator<String> it3 = set2.iterator();
        while (it3.hasNext()) {
            parcel.writeString(it3.next());
        }
        Set<String> set3 = this.f145084c;
        parcel.writeInt(set3.size());
        Iterator<String> it4 = set3.iterator();
        while (it4.hasNext()) {
            parcel.writeString(it4.next());
        }
    }

    /* JADX INFO: renamed from: qk0.c$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lqk0/c$b;", "", "<init>", "()V", "Li63/c;", "Lqk0/c;", "serializer", "()Li63/c;", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static c a(Set set, Set set2, Set set3) {
            set.getClass();
            set2.getClass();
            set3.getClass();
            ArrayList arrayList = new ArrayList();
            for (Object obj : set) {
                if (((c80.u) obj).f25616d == c80.h.Single) {
                    arrayList.add(obj);
                }
            }
            return new c(h0.g1(arrayList), set2, set3, null);
        }

        public final i63.c<c> serializer() {
            return a.f145085a;
        }

        private Companion() {
        }
    }

    public /* synthetic */ c(Set set, Set set2, Set set3, p005kotlin.jvm.internal.j jVar) {
        this(set, set2, set3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private c(Set<? extends c80.u> set, Set<String> set2, Set<String> set3) {
        this.f145082a = set;
        this.f145083b = set2;
        this.f145084c = set3;
    }

    public c(Set set, Set set2, Set set3, int i14, p005kotlin.jvm.internal.j jVar) {
        this(set, set2, (i14 & 4) != 0 ? l0.f134950a : set3);
    }
}
