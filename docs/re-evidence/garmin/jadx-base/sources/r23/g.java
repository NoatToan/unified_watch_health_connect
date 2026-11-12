package r23;

import ch.qos.logback.core.CoreConstants;
import d53.u;
import ds.e0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import p005kotlin.jvm.internal.j;
import p13.x;

/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f149963c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final g f149964d = new g(x.k(f.a.f149959c, f.d.f149962c, f.b.f149960c, f.c.f149961c));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<f> f149965a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f149966b;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f f149967a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f149968b;

        public b(f fVar, int i14) {
            fVar.getClass();
            this.f149967a = fVar;
            this.f149968b = i14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f149967a.equals(bVar.f149967a) && this.f149968b == bVar.f149968b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f149968b) + (this.f149967a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("KindWithArity(kind=");
            sb3.append(this.f149967a);
            sb3.append(", arity=");
            return e0.j(sb3, this.f149968b, CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g(List<? extends f> list) {
        list.getClass();
        this.f149965a = list;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            x33.c cVar = ((f) obj).f149957a;
            Object arrayList = linkedHashMap.get(cVar);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(cVar, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        this.f149966b = linkedHashMap;
    }

    public final b a(String str, x33.c cVar) {
        Integer numValueOf;
        cVar.getClass();
        str.getClass();
        List<f> list = (List) this.f149966b.get(cVar);
        if (list != null) {
            for (f fVar : list) {
                int i14 = 0;
                if (u.y(str, fVar.f149958b, false)) {
                    String strSubstring = str.substring(fVar.f149958b.length());
                    if (strSubstring.length() == 0) {
                        numValueOf = null;
                        break;
                    }
                    int length = strSubstring.length();
                    int i15 = 0;
                    while (true) {
                        if (i14 >= length) {
                            numValueOf = Integer.valueOf(i15);
                            break;
                        }
                        int iCharAt = strSubstring.charAt(i14) - '0';
                        if (iCharAt < 0 || iCharAt >= 10) {
                            numValueOf = null;
                            break;
                        }
                        i15 = (i15 * 10) + iCharAt;
                        i14++;
                    }
                    if (numValueOf != null) {
                        return new b(fVar, numValueOf.intValue());
                    }
                }
            }
        }
        return null;
    }

    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
