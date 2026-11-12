package w12;

import com.garmin.android.apps.connectmobile.activities.PrivacyType;
import i63.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import m12.t;
import m63.e0;
import m63.k1;
import m63.m0;
import m63.m1;
import m63.u1;
import o13.l;
import o13.m;
import o13.n;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p13.y;
import u62.z;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00112\u00020\u0001:\u0002\u0012\u0013BG\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u0012\u000e\b\u0003\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\b¢\u0006\u0004\b\u000b\u0010\fBY\b\u0010\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000b\u0010\u0010¨\u0006\u0014"}, d2 = {"Lw12/a;", "", "", "headerText", "Lm12/t;", "privacyItemType", "Lcom/garmin/android/apps/connectmobile/activities/PrivacyType;", "initialPrivacyType", "", "privacyTypes", "hintsResId", "<init>", "(Ljava/lang/Integer;Lm12/t;Lcom/garmin/android/apps/connectmobile/activities/PrivacyType;Ljava/util/List;Ljava/util/List;)V", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/lang/Integer;Lm12/t;Lcom/garmin/android/apps/connectmobile/activities/PrivacyType;Ljava/util/List;Ljava/util/List;Lm63/u1;)V", "Companion", "a", "b", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@h
public final /* data */ class a {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final l<i63.c<Object>>[] f181249f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f181250a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f181251b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PrivacyType f181252c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<PrivacyType> f181253d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<Integer> f181254e;

    /* JADX INFO: renamed from: w12.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/userprofile/presentation/profile/privacy/PrivacyData.$serializer", "Lm63/e0;", "Lw12/a;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @o13.e
    public static final /* synthetic */ class C3378a implements e0<a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C3378a f181255a;
        private static final k63.e descriptor;

        static {
            C3378a c3378a = new C3378a();
            f181255a = c3378a;
            m1 m1Var = new m1("com.garmin.android.apps.connectmobile.userprofile.presentation.profile.privacy.PrivacyData", c3378a, 5);
            m1Var.j("headerText", true);
            m1Var.j("privacyItemType", false);
            m1Var.j("initialPrivacyType", true);
            m1Var.j("privacyTypes", true);
            m1Var.j("hintsResId", true);
            descriptor = m1Var;
        }

        private C3378a() {
        }

        @Override // m63.e0
        public final i63.c<?>[] childSerializers() {
            l<i63.c<Object>>[] lVarArr = a.f181249f;
            return new i63.c[]{j63.a.d(m0.f116981a), lVarArr[1].getValue(), j63.a.d(lVarArr[2].getValue()), lVarArr[3].getValue(), lVarArr[4].getValue()};
        }

        @Override // i63.b
        public final Object deserialize(l63.e eVar) {
            eVar.getClass();
            k63.e eVar2 = descriptor;
            l63.c cVarC = eVar.c(eVar2);
            l<i63.c<Object>>[] lVarArr = a.f181249f;
            int i14 = l63.c.f110557a;
            boolean z14 = true;
            int i15 = 0;
            Integer num = null;
            t tVar = null;
            PrivacyType privacyType = null;
            List list = null;
            List list2 = null;
            while (z14) {
                int iE = cVarC.e(eVar2);
                if (iE == -1) {
                    z14 = false;
                } else if (iE == 0) {
                    num = (Integer) cVarC.v(eVar2, 0, m0.f116981a, num);
                    i15 |= 1;
                } else if (iE == 1) {
                    tVar = (t) cVarC.l(eVar2, 1, lVarArr[1].getValue(), tVar);
                    i15 |= 2;
                } else if (iE == 2) {
                    privacyType = (PrivacyType) cVarC.v(eVar2, 2, lVarArr[2].getValue(), privacyType);
                    i15 |= 4;
                } else if (iE == 3) {
                    list = (List) cVarC.l(eVar2, 3, lVarArr[3].getValue(), list);
                    i15 |= 8;
                } else {
                    if (iE != 4) {
                        hb.a.o(iE);
                        return null;
                    }
                    list2 = (List) cVarC.l(eVar2, 4, lVarArr[4].getValue(), list2);
                    i15 |= 16;
                }
            }
            cVarC.b(eVar2);
            return new a(i15, num, tVar, privacyType, list, list2, (u1) null);
        }

        @Override // i63.i, i63.b
        /* JADX INFO: renamed from: getDescriptor */
        public final k63.e getF158591b() {
            return descriptor;
        }

        /* JADX WARN: Code duplicated, block: B:17:0x005d  */
        /* JADX WARN: Code duplicated, block: B:27:0x009d  */
        @Override // i63.i
        public final void serialize(l63.f fVar, Object obj) {
            a aVar = (a) obj;
            aVar.getClass();
            Integer num = aVar.f181250a;
            k63.e eVar = descriptor;
            l63.d dVarC = fVar.c(eVar);
            l<i63.c<Object>>[] lVarArr = a.f181249f;
            if (dVarC.C(eVar) || num != null) {
                dVarC.d(eVar, 0, m0.f116981a, num);
            }
            i63.c<Object> value = lVarArr[1].getValue();
            t tVar = aVar.f181251b;
            List<Integer> list = aVar.f181254e;
            PrivacyType privacyType = aVar.f181252c;
            List<PrivacyType> list2 = aVar.f181253d;
            dVarC.e(eVar, 1, value, tVar);
            if (dVarC.C(eVar) || privacyType != null) {
                dVarC.d(eVar, 2, lVarArr[2].getValue(), privacyType);
            }
            if (dVarC.C(eVar)) {
                dVarC.e(eVar, 3, lVarArr[3].getValue(), list2);
            } else {
                PrivacyType.INSTANCE.getClass();
                if (!s.g(list2, PrivacyType.Companion.d())) {
                    dVarC.e(eVar, 3, lVarArr[3].getValue(), list2);
                }
            }
            if (dVarC.C(eVar)) {
                dVarC.e(eVar, 4, lVarArr[4].getValue(), list);
            } else {
                ArrayList arrayList = new ArrayList(y.r(list2, 10));
                Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(Integer.valueOf(((PrivacyType) it.next()).getF28798b()));
                }
                if (!s.g(list, arrayList)) {
                    dVarC.e(eVar, 4, lVarArr[4].getValue(), list);
                }
            }
            dVarC.b(eVar);
        }
    }

    static {
        n nVar = n.PUBLICATION;
        f181249f = new l[]{null, m.a(nVar, new w11.b(1)), m.a(nVar, new w11.b(2)), m.a(nVar, new w11.b(3)), m.a(nVar, new w11.b(4))};
    }

    public /* synthetic */ a(int i14, Integer num, t tVar, PrivacyType privacyType, List list, List list2, u1 u1Var) {
        if (2 != (i14 & 2)) {
            k1.h(i14, 2, C3378a.f181255a.getF158591b());
            throw null;
        }
        if ((i14 & 1) == 0) {
            this.f181250a = null;
        } else {
            this.f181250a = num;
        }
        this.f181251b = tVar;
        if ((i14 & 4) == 0) {
            this.f181252c = null;
        } else {
            this.f181252c = privacyType;
        }
        if ((i14 & 8) == 0) {
            PrivacyType.INSTANCE.getClass();
            this.f181253d = PrivacyType.Companion.d();
        } else {
            this.f181253d = list;
        }
        if ((i14 & 16) != 0) {
            this.f181254e = list2;
            return;
        }
        List<PrivacyType> list3 = this.f181253d;
        ArrayList arrayList = new ArrayList(y.r(list3, 10));
        Iterator<T> it = list3.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((PrivacyType) it.next()).getF28798b()));
        }
        this.f181254e = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return s.g(this.f181250a, aVar.f181250a) && this.f181251b == aVar.f181251b && this.f181252c == aVar.f181252c && s.g(this.f181253d, aVar.f181253d) && s.g(this.f181254e, aVar.f181254e);
    }

    public final int hashCode() {
        Integer num = this.f181250a;
        int iHashCode = (this.f181251b.hashCode() + ((num == null ? 0 : num.hashCode()) * 31)) * 31;
        PrivacyType privacyType = this.f181252c;
        return this.f181254e.hashCode() + u0.b((iHashCode + (privacyType != null ? privacyType.hashCode() : 0)) * 31, 31, this.f181253d);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("PrivacyData(headerText=");
        sb3.append(this.f181250a);
        sb3.append(", privacyItemType=");
        sb3.append(this.f181251b);
        sb3.append(", initialPrivacyType=");
        sb3.append(this.f181252c);
        sb3.append(", privacyTypes=");
        sb3.append(this.f181253d);
        sb3.append(", hintsResId=");
        return z.c(sb3, this.f181254e, ")");
    }

    /* JADX INFO: renamed from: w12.a$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lw12/a$b;", "", "<init>", "()V", "Li63/c;", "Lw12/a;", "serializer", "()Li63/c;", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public final i63.c<a> serializer() {
            return C3378a.f181255a;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(Integer num, t tVar, PrivacyType privacyType, List<? extends PrivacyType> list, List<Integer> list2) {
        tVar.getClass();
        list.getClass();
        list2.getClass();
        this.f181250a = num;
        this.f181251b = tVar;
        this.f181252c = privacyType;
        this.f181253d = list;
        this.f181254e = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.List] */
    public /* synthetic */ a(Integer num, t tVar, PrivacyType privacyType, List list, List list2, int i14, j jVar) {
        num = (i14 & 1) != 0 ? null : num;
        privacyType = (i14 & 4) != 0 ? null : privacyType;
        if ((i14 & 8) != 0) {
            PrivacyType.INSTANCE.getClass();
            list = PrivacyType.Companion.d();
        }
        if ((i14 & 16) != 0) {
            list2 = new ArrayList(y.r(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                list2.add(Integer.valueOf(((PrivacyType) it.next()).getF28798b()));
            }
        }
        this(num, tVar, privacyType, list, list2);
    }
}
