package w33;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import lc.u0;
import p005kotlin.jvm.internal.j;
import p13.h0;
import p13.m0;
import p13.n0;
import p13.o0;
import p13.t0;
import p13.x;
import p13.y;

/* JADX INFO: loaded from: classes3.dex */
public class f implements u33.d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final List<String> f181897d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String[] f181898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set<Integer> f181899b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<v33.a.e.c> f181900c;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f181901a;

        static {
            int[] iArr = new int[v33.a.e.c.EnumC3274c.values().length];
            try {
                iArr[v33.a.e.c.EnumC3274c.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[v33.a.e.c.EnumC3274c.INTERNAL_TO_CLASS_ID.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[v33.a.e.c.EnumC3274c.DESC_TO_CLASS_ID.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f181901a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        new a(null);
        String strK0 = h0.k0(x.k('k', 'o', 't', 'l', 'i', 'n'), "", null, null, null, 62);
        List<String> listK = x.k(strK0.concat("/Any"), strK0.concat("/Nothing"), strK0.concat("/Unit"), strK0.concat("/Throwable"), strK0.concat("/Number"), strK0.concat("/Byte"), strK0.concat("/Double"), strK0.concat("/Float"), strK0.concat("/Int"), strK0.concat("/Long"), strK0.concat("/Short"), strK0.concat("/Boolean"), strK0.concat("/Char"), strK0.concat("/CharSequence"), strK0.concat("/String"), strK0.concat("/Comparable"), strK0.concat("/Enum"), strK0.concat("/Array"), strK0.concat("/ByteArray"), strK0.concat("/DoubleArray"), strK0.concat("/FloatArray"), strK0.concat("/IntArray"), strK0.concat("/LongArray"), strK0.concat("/ShortArray"), strK0.concat("/BooleanArray"), strK0.concat("/CharArray"), strK0.concat("/Cloneable"), strK0.concat("/Annotation"), strK0.concat("/collections/Iterable"), strK0.concat("/collections/MutableIterable"), strK0.concat("/collections/Collection"), strK0.concat("/collections/MutableCollection"), strK0.concat("/collections/List"), strK0.concat("/collections/MutableList"), strK0.concat("/collections/Set"), strK0.concat("/collections/MutableSet"), strK0.concat("/collections/Map"), strK0.concat("/collections/MutableMap"), strK0.concat("/collections/Map.Entry"), strK0.concat("/collections/MutableMap.MutableEntry"), strK0.concat("/collections/Iterator"), strK0.concat("/collections/MutableIterator"), strK0.concat("/collections/ListIterator"), strK0.concat("/collections/MutableListIterator"));
        f181897d = listK;
        n0 n0VarJ1 = h0.j1(listK);
        int iA = t0.a(y.r(n0VarJ1, 10));
        if (iA < 16) {
            iA = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
        Iterator it = n0VarJ1.iterator();
        while (true) {
            o0 o0Var = (o0) it;
            if (!o0Var.f134956a.hasNext()) {
                return;
            }
            m0 m0Var = (m0) o0Var.next();
            linkedHashMap.put((String) m0Var.f134952b, Integer.valueOf(m0Var.f134951a));
        }
    }

    public f(String[] strArr, Set<Integer> set, List<v33.a.e.c> list) {
        strArr.getClass();
        set.getClass();
        list.getClass();
        this.f181898a = strArr;
        this.f181899b = set;
        this.f181900c = list;
    }

    @Override // u33.d
    public final String a(int i14) {
        return getString(i14);
    }

    @Override // u33.d
    public final boolean b(int i14) {
        return this.f181899b.contains(Integer.valueOf(i14));
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003f  */
    @Override // u33.d
    public final String getString(int i14) {
        String strReplace;
        v33.a.e.c cVar = this.f181900c.get(i14);
        int i15 = cVar.f175487b;
        if ((i15 & 4) == 4) {
            Object obj = cVar.f175490e;
            if (obj instanceof String) {
                strReplace = (String) obj;
            } else {
                z33.c cVar2 = (z33.c) obj;
                String strO = cVar2.o();
                if (cVar2.g()) {
                    cVar.f175490e = strO;
                }
                strReplace = strO;
            }
        } else if ((i15 & 2) == 2) {
            List<String> list = f181897d;
            int size = list.size();
            int i16 = cVar.f175489d;
            if (i16 < 0 || i16 >= size) {
                strReplace = this.f181898a[i14];
            } else {
                strReplace = list.get(i16);
            }
        } else {
            strReplace = this.f181898a[i14];
        }
        if (cVar.f175492g.size() >= 2) {
            List<Integer> list2 = cVar.f175492g;
            list2.getClass();
            Integer num = list2.get(0);
            Integer num2 = list2.get(1);
            if (num.intValue() >= 0 && num.intValue() <= num2.intValue() && num2.intValue() <= strReplace.length()) {
                strReplace = strReplace.substring(num.intValue(), num2.intValue());
            }
        }
        if (cVar.f175494i.size() >= 2) {
            List<Integer> list3 = cVar.f175494i;
            list3.getClass();
            Integer num3 = list3.get(0);
            Integer num4 = list3.get(1);
            strReplace.getClass();
            strReplace = strReplace.replace((char) num3.intValue(), (char) num4.intValue());
            strReplace.getClass();
        }
        v33.a.e.c.EnumC3274c enumC3274c = cVar.f175491f;
        if (enumC3274c == null) {
            enumC3274c = v33.a.e.c.EnumC3274c.NONE;
        }
        int i17 = b.f181901a[enumC3274c.ordinal()];
        if (i17 != 1) {
            if (i17 == 2) {
                strReplace.getClass();
                strReplace = strReplace.replace('$', '.');
                strReplace.getClass();
            } else {
                if (i17 != 3) {
                    u0.r();
                    return null;
                }
                if (strReplace.length() >= 2) {
                    strReplace = fb1.c.m(1, 1, strReplace);
                }
                strReplace = strReplace.replace('$', '.');
                strReplace.getClass();
            }
        }
        strReplace.getClass();
        return strReplace;
    }

    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
