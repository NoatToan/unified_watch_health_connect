package yc;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u000fB+\u0012\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bB\u0017\b\u0016\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f¢\u0006\u0004\b\n\u0010\u000e¨\u0006\u0010"}, d2 = {"Lyc/k2;", "", "T", "Lyc/k3;", "", "Lyc/p4;", "pages", "", "placeholdersBefore", "placeholdersAfter", "<init>", "(Ljava/util/List;II)V", "Lyc/m1$b;", "insertEvent", "(Lyc/m1$b;)V", "a", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class k2<T> implements k3<T> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f196117e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final k2<Object> f196118f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f196119a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f196120b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f196121c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f196122d;

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f196123a;

        static {
            int[] iArr = new int[c1.values().length];
            try {
                iArr[c1.REFRESH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c1.PREPEND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[c1.APPEND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f196123a = iArr;
        }
    }

    static {
        m1.b.f196160g.getClass();
        f196118f = new k2<>(m1.b.f196161h);
    }

    public k2(List<p4<T>> list, int i14, int i15) {
        list.getClass();
        this.f196119a = new ArrayList(list);
        Iterator<T> it = list.iterator();
        int size = 0;
        while (it.hasNext()) {
            size += ((p4) it.next()).f196319b.size();
        }
        this.f196120b = size;
        this.f196121c = i14;
        this.f196122d = i15;
    }

    @Override // yc.k3
    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getF196121c() {
        return this.f196121c;
    }

    @Override // yc.k3
    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getF196122d() {
        return this.f196122d;
    }

    public final t4.a c(int i14) {
        ArrayList arrayList;
        int iIntValue = i14 - this.f196121c;
        int i15 = 0;
        while (true) {
            arrayList = this.f196119a;
            if (iIntValue < ((p4) arrayList.get(i15)).f196319b.size() || i15 >= p13.x.j(arrayList)) {
                break;
            }
            iIntValue -= ((p4) arrayList.get(i15)).f196319b.size();
            i15++;
        }
        p4 p4Var = (p4) arrayList.get(i15);
        int i16 = i14 - this.f196121c;
        int size = ((getSize() - i14) - this.f196122d) - 1;
        int iD = d();
        int iF = f();
        int i17 = p4Var.f196320c;
        List<Integer> list = p4Var.f196321d;
        if (list != null && p13.x.i(list).d(iIntValue)) {
            iIntValue = list.get(iIntValue).intValue();
        }
        return new t4.a(i17, iIntValue, i16, size, iD, iF);
    }

    public final int d() {
        Integer numValueOf;
        int[] iArr = ((p4) p13.h0.b0(this.f196119a)).f196318a;
        iArr.getClass();
        if (iArr.length == 0) {
            numValueOf = null;
        } else {
            int i14 = iArr[0];
            int i15 = 1;
            int length = iArr.length - 1;
            if (1 <= length) {
                while (true) {
                    int i16 = iArr[i15];
                    if (i14 > i16) {
                        i14 = i16;
                    }
                    if (i15 == length) {
                        break;
                    }
                    i15++;
                }
            }
            numValueOf = Integer.valueOf(i14);
        }
        numValueOf.getClass();
        return numValueOf.intValue();
    }

    @Override // yc.k3
    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getF196120b() {
        return this.f196120b;
    }

    public final int f() {
        Integer numValueOf;
        int[] iArr = ((p4) p13.h0.m0(this.f196119a)).f196318a;
        iArr.getClass();
        if (iArr.length == 0) {
            numValueOf = null;
        } else {
            int i14 = iArr[0];
            int i15 = 1;
            int length = iArr.length - 1;
            if (1 <= length) {
                while (true) {
                    int i16 = iArr[i15];
                    if (i14 < i16) {
                        i14 = i16;
                    }
                    if (i15 == length) {
                        break;
                    }
                    i15++;
                }
            }
            numValueOf = Integer.valueOf(i14);
        }
        numValueOf.getClass();
        return numValueOf.intValue();
    }

    public final z2<T> g(m1<T> m1Var) {
        m1Var.getClass();
        boolean z14 = m1Var instanceof m1.b;
        ArrayList arrayList = this.f196119a;
        if (!z14) {
            if (!(m1Var instanceof m1.a)) {
                vb.h.z("Paging received an event to process StaticList or LoadStateUpdate while\nprocessing Inserts and Drops. If you see this exception, it is most\nlikely a bug in the library. Please file a bug so we can fix it at:\nhttps://issuetracker.google.com/issues/new?component=413106");
                return null;
            }
            m1.a aVar = (m1.a) m1Var;
            int i14 = aVar.f196156b;
            int i15 = aVar.f196158d;
            j23.l lVar = new j23.l(i14, aVar.f196157c);
            Iterator it = arrayList.iterator();
            int size = 0;
            while (it.hasNext()) {
                p4 p4Var = (p4) it.next();
                for (int i16 : p4Var.f196318a) {
                    if (lVar.d(i16)) {
                        size += p4Var.f196319b.size();
                        it.remove();
                        break;
                    }
                }
            }
            int i17 = this.f196120b - size;
            this.f196120b = i17;
            if (aVar.f196155a == c1.PREPEND) {
                int i18 = this.f196121c;
                this.f196121c = i15;
                return new z2.c(size, i15, i18);
            }
            int i19 = this.f196122d;
            this.f196122d = i15;
            return new z2.b(this.f196121c + i17, size, i15, i19);
        }
        m1.b bVar = (m1.b) m1Var;
        List<p4<T>> list = bVar.f196163b;
        Iterator<T> it3 = list.iterator();
        int size2 = 0;
        while (it3.hasNext()) {
            size2 += ((p4) it3.next()).f196319b.size();
        }
        int i24 = b.f196123a[bVar.f196162a.ordinal()];
        if (i24 == 1) {
            vb.h.z("Paging received a refresh event in the middle of an actively loading generation\nof PagingData. If you see this exception, it is most likely a bug in the library.\nPlease file a bug so we can fix it at:\nhttps://issuetracker.google.com/issues/new?component=413106");
            return null;
        }
        if (i24 == 2) {
            int i25 = this.f196121c;
            arrayList.addAll(0, list);
            this.f196120b += size2;
            this.f196121c = bVar.f196164c;
            ArrayList arrayList2 = new ArrayList();
            Iterator<T> it4 = list.iterator();
            while (it4.hasNext()) {
                p13.d0.v(arrayList2, ((p4) it4.next()).f196319b);
            }
            return new z2.d(arrayList2, this.f196121c, i25);
        }
        if (i24 != 3) {
            lc.u0.r();
            return null;
        }
        int i26 = this.f196122d;
        int i27 = this.f196120b;
        arrayList.addAll(arrayList.size(), list);
        this.f196120b += size2;
        this.f196122d = bVar.f196165d;
        int i28 = this.f196121c + i27;
        ArrayList arrayList3 = new ArrayList();
        Iterator<T> it5 = list.iterator();
        while (it5.hasNext()) {
            p13.d0.v(arrayList3, ((p4) it5.next()).f196319b);
        }
        return new z2.a(i28, arrayList3, this.f196122d, i26);
    }

    @Override // yc.k3
    public final T getItem(int i14) {
        ArrayList arrayList = this.f196119a;
        int size = arrayList.size();
        int i15 = 0;
        while (i15 < size) {
            int size2 = ((p4) arrayList.get(i15)).f196319b.size();
            if (size2 > i14) {
                break;
            }
            i14 -= size2;
            i15++;
        }
        return ((p4) arrayList.get(i15)).f196319b.get(i14);
    }

    @Override // yc.k3
    public final int getSize() {
        return this.f196121c + this.f196120b + this.f196122d;
    }

    public final String toString() {
        int i14 = this.f196120b;
        ArrayList arrayList = new ArrayList(i14);
        for (int i15 = 0; i15 < i14; i15++) {
            arrayList.add(getItem(i15));
        }
        String strK0 = p13.h0.k0(arrayList, null, null, null, null, 63);
        StringBuilder sb3 = new StringBuilder("[(");
        wr.g.t(this.f196121c, " placeholders), ", strK0, ", (", sb3);
        return am.j.q(sb3, this.f196122d, " placeholders)]");
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lyc/k2$a;", "", "<init>", "()V", "Lyc/k2;", "INITIAL", "Lyc/k2;", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public k2(m1.b<T> bVar) {
        this(bVar.f196163b, bVar.f196164c, bVar.f196165d);
        bVar.getClass();
    }
}
