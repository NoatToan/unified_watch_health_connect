package tq0;

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
import m63.y1;
import o13.n;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import yc.l2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u000f2\u00020\u0001:\u0002\u0010\u0011B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tB?\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000e¨\u0006\u0012"}, d2 = {"Ltq0/a;", "Landroid/os/Parcelable;", "", "activity", "", "Ltq0/b;", "fields", "localizedActivity", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Ljava/lang/String;Lm63/u1;)V", "Companion", "a", "b", "gcm-insights_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final /* data */ class a implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f166036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<b> f166037b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f166038c;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<a> CREATOR = new c();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final o13.l<i63.c<Object>>[] f166035d = {null, o13.m.a(n.PUBLICATION, new tk0.a(19)), null};

    /* JADX INFO: renamed from: tq0.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/insights/model/ActivityDTO.$serializer", "Lm63/e0;", "Ltq0/a;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-insights_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @o13.e
    public static final /* synthetic */ class C3122a implements e0<a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C3122a f166039a;
        private static final k63.e descriptor;

        static {
            C3122a c3122a = new C3122a();
            f166039a = c3122a;
            m1 m1Var = new m1("com.garmin.android.apps.connectmobile.insights.model.ActivityDTO", c3122a, 3);
            m1Var.j("activity", false);
            m1Var.j("fields", true);
            m1Var.j("localizedActivity", true);
            descriptor = m1Var;
        }

        private C3122a() {
        }

        @Override // m63.e0
        public final i63.c<?>[] childSerializers() {
            o13.l<i63.c<Object>>[] lVarArr = a.f166035d;
            y1 y1Var = y1.f117048a;
            return new i63.c[]{y1Var, lVarArr[1].getValue(), j63.a.d(y1Var)};
        }

        @Override // i63.b
        public final Object deserialize(l63.e eVar) {
            eVar.getClass();
            k63.e eVar2 = descriptor;
            l63.c cVarC = eVar.c(eVar2);
            o13.l<i63.c<Object>>[] lVarArr = a.f166035d;
            int i14 = l63.c.f110557a;
            boolean z14 = true;
            int i15 = 0;
            String strR = null;
            List list = null;
            String str = null;
            while (z14) {
                int iE = cVarC.e(eVar2);
                if (iE == -1) {
                    z14 = false;
                } else if (iE == 0) {
                    strR = cVarC.r(eVar2, 0);
                    i15 |= 1;
                } else if (iE == 1) {
                    list = (List) cVarC.l(eVar2, 1, lVarArr[1].getValue(), list);
                    i15 |= 2;
                } else {
                    if (iE != 2) {
                        hb.a.o(iE);
                        return null;
                    }
                    str = (String) cVarC.v(eVar2, 2, y1.f117048a, str);
                    i15 |= 4;
                }
            }
            cVarC.b(eVar2);
            return new a(i15, strR, list, str, (u1) null);
        }

        @Override // i63.i, i63.b
        /* JADX INFO: renamed from: getDescriptor */
        public final k63.e getF158591b() {
            return descriptor;
        }

        @Override // i63.i
        public final void serialize(l63.f fVar, Object obj) {
            a aVar = (a) obj;
            aVar.getClass();
            k63.e eVar = descriptor;
            l63.d dVarC = fVar.c(eVar);
            o13.l<i63.c<Object>>[] lVarArr = a.f166035d;
            String str = aVar.f166036a;
            String str2 = aVar.f166038c;
            List<b> list = aVar.f166037b;
            dVarC.k(eVar, 0, str);
            if (dVarC.C(eVar) || !s.g(list, new ArrayList())) {
                dVarC.e(eVar, 1, lVarArr[1].getValue(), list);
            }
            if (dVarC.C(eVar) || str2 != null) {
                dVarC.d(eVar, 2, y1.f117048a, str2);
            }
            dVarC.b(eVar);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            parcel.getClass();
            String string = parcel.readString();
            int i14 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i14);
            int iA = 0;
            while (iA != i14) {
                iA = kg.f.a(b.CREATOR, parcel, arrayList, iA, 1);
            }
            return new a(string, arrayList, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i14) {
            return new a[i14];
        }
    }

    public /* synthetic */ a(int i14, String str, List list, String str2, u1 u1Var) {
        if (1 != (i14 & 1)) {
            k1.h(i14, 1, C3122a.f166039a.getF158591b());
            throw null;
        }
        this.f166036a = str;
        if ((i14 & 2) == 0) {
            this.f166037b = new ArrayList();
        } else {
            this.f166037b = list;
        }
        if ((i14 & 4) == 0) {
            this.f166038c = null;
        } else {
            this.f166038c = str2;
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
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return s.g(this.f166036a, aVar.f166036a) && s.g(this.f166037b, aVar.f166037b) && s.g(this.f166038c, aVar.f166038c);
    }

    public final int hashCode() {
        int iB = u0.b(this.f166036a.hashCode() * 31, 31, this.f166037b);
        String str = this.f166038c;
        return iB + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return am.j.o(this.f166038c, ")", l2.g("ActivityDTO(activity=", this.f166036a, ", fields=", this.f166037b, ", localizedActivity="));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.f166036a);
        Iterator itE = kg.f.e(this.f166037b, parcel);
        while (itE.hasNext()) {
            ((b) itE.next()).writeToParcel(parcel, i14);
        }
        parcel.writeString(this.f166038c);
    }

    /* JADX INFO: renamed from: tq0.a$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ltq0/a$b;", "", "<init>", "()V", "Li63/c;", "Ltq0/a;", "serializer", "()Li63/c;", "gcm-insights_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<a> serializer() {
            return C3122a.f166039a;
        }

        private Companion() {
        }
    }

    public a(String str, List<b> list, String str2) {
        str.getClass();
        list.getClass();
        this.f166036a = str;
        this.f166037b = list;
        this.f166038c = str2;
    }

    public /* synthetic */ a(String str, List list, String str2, int i14, p005kotlin.jvm.internal.j jVar) {
        this(str, (i14 & 2) != 0 ? new ArrayList() : list, (i14 & 4) != 0 ? null : str2);
    }
}
