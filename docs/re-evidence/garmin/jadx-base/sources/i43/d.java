package i43;

import ch.qos.logback.core.CoreConstants;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p13.h0;
import p13.j0;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f91028c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f91029d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f91030e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f91031f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f91032g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f91033h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f91034i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f91035j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f91036k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final d f91037l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final d f91038m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final d f91039n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final d f91040o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final d f91041p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final ArrayList f91042q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final ArrayList f91043r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<c> f91044a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f91045b;

    static {
        a.C1747a c1747a;
        a.C1747a c1747a2;
        int i14 = 1 << 1;
        int i15 = i14 << 1;
        f91030e = i14;
        int i16 = i14 << 2;
        f91031f = i15;
        int i17 = i14 << 3;
        f91032g = i16;
        int i18 = i14 << 4;
        f91033h = i17;
        f91034i = i18;
        int i19 = (i14 << 5) - 1;
        f91035j = i19;
        int i24 = 1 | i14 | i15;
        f91036k = i24;
        f91037l = new d(i19, null, 2, null);
        f91038m = new d(i17 | i18, null, 2, null);
        new d(1, null, 2, null);
        new d(i14, null, 2, null);
        new d(i15, null, 2, null);
        f91039n = new d(i24, null, 2, null);
        new d(i16, null, 2, null);
        f91040o = new d(i17, null, 2, null);
        f91041p = new d(i18, null, 2, null);
        new d(i14 | i17 | i18, null, 2, null);
        Field[] fields = d.class.getFields();
        fields.getClass();
        ArrayList<Field> arrayList = new ArrayList();
        for (Field field : fields) {
            if (Modifier.isStatic(field.getModifiers())) {
                arrayList.add(field);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Field field2 : arrayList) {
            Object obj = field2.get(null);
            d dVar = obj instanceof d ? (d) obj : null;
            if (dVar != null) {
                int i25 = dVar.f91045b;
                String name = field2.getName();
                name.getClass();
                c1747a2 = new a.C1747a(i25, name);
            } else {
                c1747a2 = null;
            }
            if (c1747a2 != null) {
                arrayList2.add(c1747a2);
            }
        }
        f91042q = arrayList2;
        Field[] fields2 = d.class.getFields();
        fields2.getClass();
        ArrayList arrayList3 = new ArrayList();
        for (Field field3 : fields2) {
            if (Modifier.isStatic(field3.getModifiers())) {
                arrayList3.add(field3);
            }
        }
        ArrayList<Field> arrayList4 = new ArrayList();
        for (Object obj2 : arrayList3) {
            if (p005kotlin.jvm.internal.s.g(((Field) obj2).getType(), Integer.TYPE)) {
                arrayList4.add(obj2);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        for (Field field4 : arrayList4) {
            Object obj3 = field4.get(null);
            obj3.getClass();
            int iIntValue = ((Integer) obj3).intValue();
            if (iIntValue == ((-iIntValue) & iIntValue)) {
                String name2 = field4.getName();
                name2.getClass();
                c1747a = new a.C1747a(iIntValue, name2);
            } else {
                c1747a = null;
            }
            if (c1747a != null) {
                arrayList5.add(c1747a);
            }
        }
        f91043r = arrayList5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(int i14, List<? extends c> list) {
        list.getClass();
        this.f91044a = list;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            i14 &= ~((c) it.next()).a();
        }
        this.f91045b = i14;
    }

    public final boolean a(int i14) {
        return (i14 & this.f91045b) != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!d.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        d dVar = (d) obj;
        return p005kotlin.jvm.internal.s.g(this.f91044a, dVar.f91044a) && this.f91045b == dVar.f91045b;
    }

    public final int hashCode() {
        return (this.f91044a.hashCode() * 31) + this.f91045b;
    }

    public final String toString() {
        Object next;
        Iterator it = f91042q.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((a.C1747a) next).f91046a != this.f91045b);
        a.C1747a c1747a = (a.C1747a) next;
        String strK0 = c1747a != null ? c1747a.f91047b : null;
        if (strK0 == null) {
            ArrayList arrayList = new ArrayList();
            for (a.C1747a c1747a2 : f91043r) {
                String str = a(c1747a2.f91046a) ? c1747a2.f91047b : null;
                if (str != null) {
                    arrayList.add(str);
                }
            }
            strK0 = h0.k0(arrayList, " | ", null, null, null, 62);
        }
        return o2.c.d(CoreConstants.RIGHT_PARENTHESIS_CHAR, this.f91044a, hb.a.l("DescriptorKindFilter(", strK0, ", "));
    }

    public static final class a {

        /* JADX INFO: renamed from: i43.d$a$a, reason: collision with other inner class name */
        public static final class C1747a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f91046a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f91047b;

            public C1747a(int i14, String str) {
                str.getClass();
                this.f91046a = i14;
                this.f91047b = str;
            }
        }

        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public d(int i14, List list, int i15, p005kotlin.jvm.internal.j jVar) {
        this(i14, (i15 & 2) != 0 ? j0.f134944a : list);
    }
}
