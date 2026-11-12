package u33;

import java.util.LinkedList;
import java.util.List;
import lc.u0;
import o13.u;
import org.apache.commons.io.IOUtils;
import p13.h0;
import s33.p;
import s33.r;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f168327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f168328b;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f168329a;

        static {
            int[] iArr = new int[p.c.EnumC2958c.values().length];
            try {
                iArr[p.c.EnumC2958c.CLASS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p.c.EnumC2958c.PACKAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[p.c.EnumC2958c.LOCAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f168329a = iArr;
        }
    }

    public e(r rVar, p pVar) {
        rVar.getClass();
        pVar.getClass();
        this.f168327a = rVar;
        this.f168328b = pVar;
    }

    @Override // u33.d
    public final String a(int i14) {
        u<List<String>, List<String>, Boolean> uVarC = c(i14);
        List<String> list = uVarC.f128605a;
        String strK0 = h0.k0(uVarC.f128606b, ".", null, null, null, 62);
        if (list.isEmpty()) {
            return strK0;
        }
        return h0.k0(list, "/", null, null, null, 62) + IOUtils.DIR_SEPARATOR_UNIX + strK0;
    }

    @Override // u33.d
    public final boolean b(int i14) {
        return c(i14).f128607c.booleanValue();
    }

    public final u<List<String>, List<String>, Boolean> c(int i14) {
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        boolean z14 = false;
        while (i14 != -1) {
            p.c cVar = this.f168328b.f156814b.get(i14);
            String str = (String) this.f168327a.f156845b.get(cVar.f156824d);
            p.c.EnumC2958c enumC2958c = cVar.f156825e;
            enumC2958c.getClass();
            int i15 = a.f168329a[enumC2958c.ordinal()];
            if (i15 == 1) {
                linkedList2.addFirst(str);
            } else if (i15 == 2) {
                linkedList.addFirst(str);
            } else {
                if (i15 != 3) {
                    u0.r();
                    return null;
                }
                linkedList2.addFirst(str);
                z14 = true;
            }
            i14 = cVar.f156823c;
        }
        return new u<>(linkedList, linkedList2, Boolean.valueOf(z14));
    }

    @Override // u33.d
    public final String getString(int i14) {
        String str = (String) this.f168327a.f156845b.get(i14);
        str.getClass();
        return str;
    }
}
