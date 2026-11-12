package f2;

import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001:\u0003\u0006\u0007\bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Lf2/n0;", "", "Lf2/l;", "gridContent", "<init>", "(Lf2/l;)V", "c", "a", "b", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f68235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList<a> f68236b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f68237c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f68238d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f68239e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f68240f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f68241g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f68242h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f68243i;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lf2/n0$b;", "Lf2/t;", "<init>", "()V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b implements t {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f68246a = new b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f68247b;

        private b() {
        }

        @Override // f2.t
        public final int a() {
            return f68247b;
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lf2/n0$c;", "", "", "firstItemIndex", "", "Lf2/c;", "spans", "<init>", "(ILjava/util/List;)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f68248a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<f2.c> f68249b;

        public c(int i14, List<f2.c> list) {
            this.f68248a = i14;
            this.f68249b = list;
        }
    }

    public n0(l lVar) {
        this.f68235a = lVar;
        ArrayList<a> arrayList = new ArrayList<>();
        int i14 = 0;
        arrayList.add(new a(i14, i14, 2, null));
        this.f68236b = arrayList;
        this.f68240f = -1;
        this.f68241g = new ArrayList();
        this.f68242h = p13.j0.f134944a;
    }

    public final int a() {
        return ((int) Math.sqrt((((double) d()) * 1.0d) / ((double) this.f68243i))) + 1;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x009f  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r4v15, types: [java.lang.Object, java.util.List] */
    public final c b(int i14) {
        int i15;
        boolean z14;
        int i16;
        int i17;
        ?? r14;
        if (!this.f68235a.f68232c) {
            int i18 = this.f68243i;
            int i19 = i14 * i18;
            int iD = d() - i19;
            if (i18 > iD) {
                i18 = iD;
            }
            if (i18 < 0) {
                i18 = 0;
            }
            if (i18 == this.f68242h.size()) {
                r14 = this.f68242h;
            } else {
                ArrayList arrayList = new ArrayList(i18);
                for (int i24 = 0; i24 < i18; i24++) {
                    arrayList.add(f2.c.a(dh.b.f(1)));
                }
                this.f68242h = arrayList;
                r14 = arrayList;
            }
            return new c(i19, r14);
        }
        int iA = i14 / a();
        ArrayList<a> arrayList2 = this.f68236b;
        int iMin = Math.min(iA, arrayList2.size() - 1);
        int iA2 = a() * iMin;
        int iIntValue = arrayList2.get(iMin).f68244a;
        int iE = arrayList2.get(iMin).f68245b;
        int i25 = this.f68237c;
        ArrayList arrayList3 = this.f68241g;
        if (iA2 <= i25 && i25 <= i14) {
            iIntValue = this.f68238d;
            iE = this.f68239e;
            iA2 = i25;
        } else if (iMin == this.f68240f && (i15 = i14 - iA2) < arrayList3.size()) {
            iIntValue = ((Number) arrayList3.get(i15)).intValue();
            iA2 = i14;
            iE = 0;
        }
        if (iA2 % a() == 0) {
            int i26 = i14 - iA2;
            z14 = 2 <= i26 && i26 < a();
        }
        if (z14) {
            this.f68240f = iMin;
            arrayList3.clear();
        }
        if (iA2 > i14) {
            b2.e.c("currentLine (" + iA2 + ") > lineIndex (" + i14 + CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
        while (iA2 < i14 && iIntValue < d()) {
            if (z14) {
                arrayList3.add(Integer.valueOf(iIntValue));
            }
            int i27 = 0;
            while (i27 < this.f68243i && iIntValue < d()) {
                if (iE == 0) {
                    i17 = iE;
                    iE = e(iIntValue);
                } else {
                    i17 = 0;
                }
                i27 += iE;
                if (i27 > this.f68243i) {
                    break;
                }
                iIntValue++;
                iE = i17;
            }
            iA2++;
            if (iA2 % a() == 0 && iIntValue < d()) {
                if (arrayList2.size() != iA2 / a()) {
                    b2.e.c("invalid starting point");
                }
                arrayList2.add(new a(iIntValue, iE));
            }
        }
        this.f68237c = i14;
        this.f68238d = iIntValue;
        this.f68239e = iE;
        ArrayList arrayList4 = new ArrayList();
        int i28 = 0;
        int i29 = iIntValue;
        while (i28 < this.f68243i && i29 < d()) {
            if (iE == 0) {
                int i30 = iE;
                iE = e(i29);
                i16 = i30;
            } else {
                i16 = 0;
            }
            i28 += iE;
            if (i28 > this.f68243i) {
                break;
            }
            i29++;
            arrayList4.add(f2.c.a(dh.b.f(iE)));
            iE = i16;
        }
        return new c(iIntValue, arrayList4);
    }

    public final int c(int i14) {
        int i15 = 0;
        if (d() <= 0) {
            return 0;
        }
        if (i14 >= d()) {
            b2.e.a("ItemIndex > total count");
        }
        if (!this.f68235a.f68232c) {
            return i14 / this.f68243i;
        }
        cf.a0 a0Var = new cf.a0(i14, 1);
        ArrayList<a> arrayList = this.f68236b;
        int iE = p13.x.e(a0Var, arrayList, arrayList.size());
        int i16 = 2;
        if (iE < 0) {
            iE = (-iE) - 2;
        }
        int iA = a() * iE;
        int i17 = arrayList.get(iE).f68244a;
        if (i17 > i14) {
            b2.e.a("currentItemIndex > itemIndex");
        }
        int i18 = 0;
        while (true) {
            if (i17 >= i14) {
                break;
            }
            int i19 = i17 + 1;
            int iE2 = e(i17);
            i18 += iE2;
            int i24 = this.f68243i;
            if (i18 >= i24) {
                if (i18 == i24) {
                    iA++;
                    i18 = 0;
                } else {
                    iA++;
                    i18 = iE2;
                }
            }
            if (iA % a() == 0 && iA / a() >= arrayList.size()) {
                arrayList.add(new a(i19 - (i18 <= 0 ? 0 : 1), i15, i16, null));
            }
            i17 = i19;
        }
        return e(i14) + i18 > this.f68243i ? iA + 1 : iA;
    }

    public final int d() {
        return this.f68235a.f68231b.f75198b;
    }

    public final int e(int i14) {
        b bVar = b.f68246a;
        bVar.getClass();
        b.f68247b = this.f68243i;
        g2.j<k> jVarB = this.f68235a.f68231b.b(i14);
        return (int) jVarB.f75140c.f68221b.invoke(bVar, Integer.valueOf(i14 - jVarB.f75138a)).f68178a;
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lf2/n0$a;", "", "", "firstItemIndex", "firstItemKnownSpan", "<init>", "(II)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f68244a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f68245b;

        public /* synthetic */ a(int i14, int i15, int i16, p005kotlin.jvm.internal.j jVar) {
            this(i14, (i16 & 2) != 0 ? 0 : i15);
        }

        public a(int i14, int i15) {
            this.f68244a = i14;
            this.f68245b = i15;
        }
    }
}
