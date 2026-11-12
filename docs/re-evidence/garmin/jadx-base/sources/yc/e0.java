package yc;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0001\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lyc/e0;", "", "T", "<init>", "()V", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class e0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f195872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f195873b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p13.k<p4<T>> f195874c = new p13.k<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k1 f195875d = new k1();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public b1 f195876e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f195877f;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f195878a;

        static {
            int[] iArr = new int[c1.values().length];
            try {
                iArr[c1.PREPEND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c1.APPEND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[c1.REFRESH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f195878a = iArr;
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final void a(m1<T> m1Var) {
        m1Var.getClass();
        this.f195877f = true;
        boolean z14 = m1Var instanceof m1.b;
        int i14 = 0;
        p13.k<p4<T>> kVar = this.f195874c;
        k1 k1Var = this.f195875d;
        if (z14) {
            m1.b bVar = (m1.b) m1Var;
            b1 b1Var = bVar.f196166e;
            int i15 = bVar.f196164c;
            int i16 = bVar.f196165d;
            List<p4<T>> list = bVar.f196163b;
            k1Var.b(b1Var);
            this.f195876e = bVar.f196167f;
            int i17 = a.f195878a[bVar.f196162a.ordinal()];
            if (i17 == 1) {
                this.f195872a = i15;
                Iterator<Integer> it = j23.t.l(list.size() - 1, 0).iterator();
                while (it.hasNext()) {
                    kVar.addFirst(list.get(((p13.p0) it).nextInt()));
                }
                return;
            }
            if (i17 == 2) {
                this.f195873b = i16;
                kVar.addAll(list);
                return;
            } else {
                if (i17 != 3) {
                    return;
                }
                kVar.clear();
                this.f195873b = i16;
                this.f195872a = i15;
                kVar.addAll(list);
                return;
            }
        }
        if (!(m1Var instanceof m1.a)) {
            if (m1Var instanceof m1.c) {
                m1.c cVar = (m1.c) m1Var;
                k1Var.b(cVar.f196198a);
                this.f195876e = cVar.f196199b;
                return;
            } else {
                if (m1Var instanceof m1.d) {
                    m1.d dVar = (m1.d) m1Var;
                    b1 b1Var2 = dVar.f196201b;
                    if (b1Var2 != null) {
                        k1Var.b(b1Var2);
                    }
                    b1 b1Var3 = dVar.f196202c;
                    if (b1Var3 != null) {
                        this.f195876e = b1Var3;
                    }
                    kVar.clear();
                    this.f195873b = 0;
                    this.f195872a = 0;
                    kVar.addLast(new p4<>(0, dVar.f196200a));
                    return;
                }
                return;
            }
        }
        m1.a aVar = (m1.a) m1Var;
        c1 c1Var = aVar.f196155a;
        int i18 = aVar.f196158d;
        z0.c.f196665b.getClass();
        k1Var.c(c1Var, z0.c.f196667d);
        int i19 = a.f195878a[c1Var.ordinal()];
        if (i19 == 1) {
            this.f195872a = i18;
            int iC = aVar.c();
            while (i14 < iC) {
                kVar.removeFirst();
                i14++;
            }
            return;
        }
        if (i19 != 2) {
            vb.h.s("Page drop type must be prepend or append");
            return;
        }
        this.f195873b = i18;
        int iC2 = aVar.c();
        while (i14 < iC2) {
            kVar.removeLast();
            i14++;
        }
    }

    public final List<m1<T>> b() {
        if (!this.f195877f) {
            return p13.j0.f134944a;
        }
        ArrayList arrayList = new ArrayList();
        b1 b1VarD = this.f195875d.d();
        p13.k<p4<T>> kVar = this.f195874c;
        if (kVar.isEmpty()) {
            arrayList.add(new m1.c(b1VarD, this.f195876e));
            return arrayList;
        }
        m1.b.a aVar = m1.b.f196160g;
        List listB1 = p13.h0.b1(kVar);
        int i14 = this.f195872a;
        int i15 = this.f195873b;
        b1 b1Var = this.f195876e;
        aVar.getClass();
        arrayList.add(m1.b.a.a(listB1, i14, i15, b1VarD, b1Var));
        return arrayList;
    }
}
