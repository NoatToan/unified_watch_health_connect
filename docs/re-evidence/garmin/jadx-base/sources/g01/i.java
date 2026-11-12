package g01;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m63.k1;
import m63.m1;
import m63.u1;
import p005kotlin.Metadata;
import p13.j0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00122\u00020\u0001:\u0002\u0013\u0014B;\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fBM\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011¨\u0006\u0015"}, d2 = {"Lg01/i;", "", "Lg01/o;", TtmlNode.TAG_METADATA, "", "Lg01/c0;", "nutritionContents", "Lg01/j;", "images", "", "isFavorite", "<init>", "(Lg01/o;Ljava/util/List;Ljava/util/List;Z)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILg01/o;Ljava/util/List;Ljava/util/List;ZLm63/u1;)V", "Companion", "a", "b", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final /* data */ class i {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final o13.l<i63.c<Object>>[] f74194e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f74195a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<c0> f74196b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<j> f74197c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f74198d;

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/nutrition/data/model/consumable/FoodDTO.$serializer", "Lm63/e0;", "Lg01/i;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @o13.e
    public static final /* synthetic */ class a implements m63.e0<i> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f74199a;
        private static final k63.e descriptor;

        static {
            a aVar = new a();
            f74199a = aVar;
            m1 m1Var = new m1("com.garmin.android.apps.connectmobile.nutrition.data.model.consumable.FoodDTO", aVar, 4);
            m1Var.j("foodMetaData", false);
            m1Var.j("nutritionContents", false);
            m1Var.j("foodImages", false);
            m1Var.j("isFavorite", true);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // m63.e0
        public final i63.c<?>[] childSerializers() {
            o13.l<i63.c<Object>>[] lVarArr = i.f74194e;
            return new i63.c[]{j63.a.d(o.a.f74236a), j63.a.d(lVarArr[1].getValue()), j63.a.d(lVarArr[2].getValue()), m63.g.f116948a};
        }

        @Override // i63.b
        public final Object deserialize(l63.e eVar) {
            eVar.getClass();
            k63.e eVar2 = descriptor;
            l63.c cVarC = eVar.c(eVar2);
            o13.l<i63.c<Object>>[] lVarArr = i.f74194e;
            int i14 = l63.c.f110557a;
            boolean z14 = true;
            int i15 = 0;
            boolean zG = false;
            o oVar = null;
            List list = null;
            List list2 = null;
            while (z14) {
                int iE = cVarC.e(eVar2);
                if (iE == -1) {
                    z14 = false;
                } else if (iE == 0) {
                    oVar = (o) cVarC.v(eVar2, 0, o.a.f74236a, oVar);
                    i15 |= 1;
                } else if (iE == 1) {
                    list = (List) cVarC.v(eVar2, 1, lVarArr[1].getValue(), list);
                    i15 |= 2;
                } else if (iE == 2) {
                    list2 = (List) cVarC.v(eVar2, 2, lVarArr[2].getValue(), list2);
                    i15 |= 4;
                } else {
                    if (iE != 3) {
                        hb.a.o(iE);
                        return null;
                    }
                    zG = cVarC.g(eVar2, 3);
                    i15 |= 8;
                }
            }
            cVarC.b(eVar2);
            return new i(i15, oVar, list, list2, zG, (u1) null);
        }

        @Override // i63.i, i63.b
        /* JADX INFO: renamed from: getDescriptor */
        public final k63.e getF158591b() {
            return descriptor;
        }

        @Override // i63.i
        public final void serialize(l63.f fVar, Object obj) {
            i iVar = (i) obj;
            iVar.getClass();
            k63.e eVar = descriptor;
            l63.d dVarC = fVar.c(eVar);
            o13.l<i63.c<Object>>[] lVarArr = i.f74194e;
            o.a aVar = o.a.f74236a;
            o oVar = iVar.f74195a;
            boolean z14 = iVar.f74198d;
            dVarC.d(eVar, 0, aVar, oVar);
            dVarC.d(eVar, 1, lVarArr[1].getValue(), iVar.f74196b);
            dVarC.d(eVar, 2, lVarArr[2].getValue(), iVar.f74197c);
            if (dVarC.C(eVar) || z14) {
                dVarC.n(eVar, 3, z14);
            }
            dVarC.b(eVar);
        }
    }

    static {
        o13.n nVar = o13.n.PUBLICATION;
        f74194e = new o13.l[]{null, o13.m.a(nVar, new fy1.h(23)), o13.m.a(nVar, new fy1.h(24)), null};
    }

    public /* synthetic */ i(int i14, o oVar, List list, List list2, boolean z14, u1 u1Var) {
        if (7 != (i14 & 7)) {
            k1.h(i14, 7, a.f74199a.getF158591b());
            throw null;
        }
        this.f74195a = oVar;
        this.f74196b = list;
        this.f74197c = list2;
        if ((i14 & 8) == 0) {
            this.f74198d = false;
        } else {
            this.f74198d = z14;
        }
    }

    public final b11.e a() {
        i53.f fVarJ;
        o oVar = this.f74195a;
        b11.d dVarA = oVar != null ? oVar.a() : null;
        List<c0> list = this.f74196b;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                b11.s sVarB = ((c0) it.next()).b();
                if (sVarB != null) {
                    arrayList.add(sVarB);
                }
            }
            fVarJ = i53.a.j(arrayList);
        } else {
            fVarJ = null;
        }
        if (dVarA == null || fVarJ == null) {
            return null;
        }
        b11.t.a aVar = b11.t.f14377d;
        List list2 = this.f74197c;
        if (list2 == null) {
            list2 = j0.f134944a;
        }
        u uVar = dVarA.f14257e;
        aVar.getClass();
        return new b11.e(dVarA, fVarJ, b11.t.a.a(list2, uVar), this.f74198d, null, 16, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return p005kotlin.jvm.internal.s.g(this.f74195a, iVar.f74195a) && p005kotlin.jvm.internal.s.g(this.f74196b, iVar.f74196b) && p005kotlin.jvm.internal.s.g(this.f74197c, iVar.f74197c) && this.f74198d == iVar.f74198d;
    }

    public final int hashCode() {
        o oVar = this.f74195a;
        int iHashCode = (oVar == null ? 0 : oVar.hashCode()) * 31;
        List<c0> list = this.f74196b;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<j> list2 = this.f74197c;
        return Boolean.hashCode(this.f74198d) + ((iHashCode2 + (list2 != null ? list2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "FoodDTO(metadata=" + this.f74195a + ", nutritionContents=" + this.f74196b + ", images=" + this.f74197c + ", isFavorite=" + this.f74198d + ")";
    }

    /* JADX INFO: renamed from: g01.i$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lg01/i$b;", "", "<init>", "()V", "Li63/c;", "Lg01/i;", "serializer", "()Li63/c;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<i> serializer() {
            return a.f74199a;
        }

        private Companion() {
        }
    }

    public i(o oVar, List<c0> list, List<j> list2, boolean z14) {
        this.f74195a = oVar;
        this.f74196b = list;
        this.f74197c = list2;
        this.f74198d = z14;
    }

    public /* synthetic */ i(o oVar, List list, List list2, boolean z14, int i14, p005kotlin.jvm.internal.j jVar) {
        this(oVar, list, list2, (i14 & 8) != 0 ? false : z14);
    }
}
