package jk0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import m63.u1;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \r2\u00020\u0001:\u0002\u000e\u000fB+\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007B;\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\f¨\u0006\u0010"}, d2 = {"Ljk0/u;", "Landroid/os/Parcelable;", "", "", "_activeTypesList", "_retiredTypesList", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/util/List;Lm63/u1;)V", "Companion", "a", "b", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final /* data */ class u implements Parcelable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final o13.l<i63.c<Object>>[] f99342e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<String> f99343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<String> f99344b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o13.t f99345c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o13.t f99346d;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<u> CREATOR = new c();

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements Parcelable.Creator<u> {
        @Override // android.os.Parcelable.Creator
        public final u createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new u(parcel.createStringArrayList(), parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final u[] newArray(int i14) {
            return new u[i14];
        }
    }

    static {
        o13.n nVar = o13.n.PUBLICATION;
        f99342e = new o13.l[]{o13.m.a(nVar, new je0.o(26)), o13.m.a(nVar, new je0.o(27))};
    }

    public /* synthetic */ u(int i14, List list, List list2, u1 u1Var) {
        if ((i14 & 1) == 0) {
            this.f99343a = null;
        } else {
            this.f99343a = list;
        }
        if ((i14 & 2) == 0) {
            this.f99344b = null;
        } else {
            this.f99344b = list2;
        }
        final int i15 = 0;
        this.f99345c = o13.m.b(new e23.a(this) { // from class: jk0.t

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ u f99341b;

            {
                this.f99341b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                switch (i15) {
                    case 0:
                        List<String> list3 = this.f99341b.f99343a;
                        if (list3 == null) {
                            return null;
                        }
                        ArrayList arrayList = new ArrayList();
                        for (String str : list3) {
                            c80.u uVar = (c80.u) n63.b.f123892d.c(new c80.v(), "\"" + str + "\"");
                            if (uVar != null) {
                                arrayList.add(uVar);
                            }
                        }
                        return arrayList;
                    case 1:
                        List<String> list4 = this.f99341b.f99344b;
                        if (list4 == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        for (String str2 : list4) {
                            c80.u uVar2 = (c80.u) n63.b.f123892d.c(new c80.v(), "\"" + str2 + "\"");
                            if (uVar2 != null) {
                                arrayList2.add(uVar2);
                            }
                        }
                        return arrayList2;
                    case 2:
                        List<String> list5 = this.f99341b.f99343a;
                        if (list5 == null) {
                            return null;
                        }
                        ArrayList arrayList3 = new ArrayList();
                        for (String str3 : list5) {
                            c80.u uVar3 = (c80.u) n63.b.f123892d.c(new c80.v(), "\"" + str3 + "\"");
                            if (uVar3 != null) {
                                arrayList3.add(uVar3);
                            }
                        }
                        return arrayList3;
                    default:
                        List<String> list6 = this.f99341b.f99344b;
                        if (list6 == null) {
                            return null;
                        }
                        ArrayList arrayList4 = new ArrayList();
                        for (String str4 : list6) {
                            c80.u uVar4 = (c80.u) n63.b.f123892d.c(new c80.v(), "\"" + str4 + "\"");
                            if (uVar4 != null) {
                                arrayList4.add(uVar4);
                            }
                        }
                        return arrayList4;
                }
            }
        });
        final int i16 = 1;
        this.f99346d = o13.m.b(new e23.a(this) { // from class: jk0.t

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ u f99341b;

            {
                this.f99341b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                switch (i16) {
                    case 0:
                        List<String> list3 = this.f99341b.f99343a;
                        if (list3 == null) {
                            return null;
                        }
                        ArrayList arrayList = new ArrayList();
                        for (String str : list3) {
                            c80.u uVar = (c80.u) n63.b.f123892d.c(new c80.v(), "\"" + str + "\"");
                            if (uVar != null) {
                                arrayList.add(uVar);
                            }
                        }
                        return arrayList;
                    case 1:
                        List<String> list4 = this.f99341b.f99344b;
                        if (list4 == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        for (String str2 : list4) {
                            c80.u uVar2 = (c80.u) n63.b.f123892d.c(new c80.v(), "\"" + str2 + "\"");
                            if (uVar2 != null) {
                                arrayList2.add(uVar2);
                            }
                        }
                        return arrayList2;
                    case 2:
                        List<String> list5 = this.f99341b.f99343a;
                        if (list5 == null) {
                            return null;
                        }
                        ArrayList arrayList3 = new ArrayList();
                        for (String str3 : list5) {
                            c80.u uVar3 = (c80.u) n63.b.f123892d.c(new c80.v(), "\"" + str3 + "\"");
                            if (uVar3 != null) {
                                arrayList3.add(uVar3);
                            }
                        }
                        return arrayList3;
                    default:
                        List<String> list6 = this.f99341b.f99344b;
                        if (list6 == null) {
                            return null;
                        }
                        ArrayList arrayList4 = new ArrayList();
                        for (String str4 : list6) {
                            c80.u uVar4 = (c80.u) n63.b.f123892d.c(new c80.v(), "\"" + str4 + "\"");
                            if (uVar4 != null) {
                                arrayList4.add(uVar4);
                            }
                        }
                        return arrayList4;
                }
            }
        });
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return p005kotlin.jvm.internal.s.g(this.f99343a, uVar.f99343a) && p005kotlin.jvm.internal.s.g(this.f99344b, uVar.f99344b);
    }

    public final int hashCode() {
        List<String> list = this.f99343a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<String> list2 = this.f99344b;
        return iHashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        return c22.t.f("GearTabFilterValuesDTO(_activeTypesList=", ", _retiredTypesList=", ")", this.f99343a, this.f99344b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeStringList(this.f99343a);
        parcel.writeStringList(this.f99344b);
    }

    /* JADX INFO: renamed from: jk0.u$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ljk0/u$b;", "", "<init>", "()V", "Li63/c;", "Ljk0/u;", "serializer", "()Li63/c;", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<u> serializer() {
            return a.f99347a;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public u() {
        this((List) null, (List) (0 == true ? 1 : 0), 3, (p005kotlin.jvm.internal.j) (0 == true ? 1 : 0));
    }

    public u(List<String> list, List<String> list2) {
        this.f99343a = list;
        this.f99344b = list2;
        final int i14 = 2;
        this.f99345c = o13.m.b(new e23.a(this) { // from class: jk0.t

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ u f99341b;

            {
                this.f99341b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                switch (i14) {
                    case 0:
                        List<String> list3 = this.f99341b.f99343a;
                        if (list3 == null) {
                            return null;
                        }
                        ArrayList arrayList = new ArrayList();
                        for (String str : list3) {
                            c80.u uVar = (c80.u) n63.b.f123892d.c(new c80.v(), "\"" + str + "\"");
                            if (uVar != null) {
                                arrayList.add(uVar);
                            }
                        }
                        return arrayList;
                    case 1:
                        List<String> list4 = this.f99341b.f99344b;
                        if (list4 == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        for (String str2 : list4) {
                            c80.u uVar2 = (c80.u) n63.b.f123892d.c(new c80.v(), "\"" + str2 + "\"");
                            if (uVar2 != null) {
                                arrayList2.add(uVar2);
                            }
                        }
                        return arrayList2;
                    case 2:
                        List<String> list5 = this.f99341b.f99343a;
                        if (list5 == null) {
                            return null;
                        }
                        ArrayList arrayList3 = new ArrayList();
                        for (String str3 : list5) {
                            c80.u uVar3 = (c80.u) n63.b.f123892d.c(new c80.v(), "\"" + str3 + "\"");
                            if (uVar3 != null) {
                                arrayList3.add(uVar3);
                            }
                        }
                        return arrayList3;
                    default:
                        List<String> list6 = this.f99341b.f99344b;
                        if (list6 == null) {
                            return null;
                        }
                        ArrayList arrayList4 = new ArrayList();
                        for (String str4 : list6) {
                            c80.u uVar4 = (c80.u) n63.b.f123892d.c(new c80.v(), "\"" + str4 + "\"");
                            if (uVar4 != null) {
                                arrayList4.add(uVar4);
                            }
                        }
                        return arrayList4;
                }
            }
        });
        final int i15 = 3;
        this.f99346d = o13.m.b(new e23.a(this) { // from class: jk0.t

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ u f99341b;

            {
                this.f99341b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                switch (i15) {
                    case 0:
                        List<String> list3 = this.f99341b.f99343a;
                        if (list3 == null) {
                            return null;
                        }
                        ArrayList arrayList = new ArrayList();
                        for (String str : list3) {
                            c80.u uVar = (c80.u) n63.b.f123892d.c(new c80.v(), "\"" + str + "\"");
                            if (uVar != null) {
                                arrayList.add(uVar);
                            }
                        }
                        return arrayList;
                    case 1:
                        List<String> list4 = this.f99341b.f99344b;
                        if (list4 == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        for (String str2 : list4) {
                            c80.u uVar2 = (c80.u) n63.b.f123892d.c(new c80.v(), "\"" + str2 + "\"");
                            if (uVar2 != null) {
                                arrayList2.add(uVar2);
                            }
                        }
                        return arrayList2;
                    case 2:
                        List<String> list5 = this.f99341b.f99343a;
                        if (list5 == null) {
                            return null;
                        }
                        ArrayList arrayList3 = new ArrayList();
                        for (String str3 : list5) {
                            c80.u uVar3 = (c80.u) n63.b.f123892d.c(new c80.v(), "\"" + str3 + "\"");
                            if (uVar3 != null) {
                                arrayList3.add(uVar3);
                            }
                        }
                        return arrayList3;
                    default:
                        List<String> list6 = this.f99341b.f99344b;
                        if (list6 == null) {
                            return null;
                        }
                        ArrayList arrayList4 = new ArrayList();
                        for (String str4 : list6) {
                            c80.u uVar4 = (c80.u) n63.b.f123892d.c(new c80.v(), "\"" + str4 + "\"");
                            if (uVar4 != null) {
                                arrayList4.add(uVar4);
                            }
                        }
                        return arrayList4;
                }
            }
        });
    }

    public /* synthetic */ u(List list, List list2, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : list, (i14 & 2) != 0 ? null : list2);
    }
}
