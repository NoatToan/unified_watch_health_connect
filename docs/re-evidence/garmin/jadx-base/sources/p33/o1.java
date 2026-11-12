package p33;

import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
public final class o1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f135488a = new LinkedHashMap();

    public final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f135489a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ o1 f135490b;

        /* JADX INFO: renamed from: p33.o1$a$a, reason: collision with other inner class name */
        public final class C2568a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f135491a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f135492b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final ArrayList f135493c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public o13.p<String, r1> f135494d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public b43.z f135495e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final /* synthetic */ a f135496f;

            public C2568a(a aVar, String str, String str2) {
                str.getClass();
                this.f135496f = aVar;
                this.f135491a = str;
                this.f135492b = str2;
                this.f135493c = new ArrayList();
                this.f135494d = new o13.p<>("V", null);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public final void a(String str, j... jVarArr) {
                r1 r1Var;
                str.getClass();
                if (jVarArr.length == 0) {
                    r1Var = null;
                } else {
                    p13.n0 n0Var = new p13.n0(new o02.a(jVarArr, 1));
                    int iA = p13.t0.a(p13.y.r(n0Var, 10));
                    if (iA < 16) {
                        iA = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
                    Iterator it = n0Var.iterator();
                    while (true) {
                        p13.o0 o0Var = (p13.o0) it;
                        if (!o0Var.f134956a.hasNext()) {
                            break;
                        }
                        p13.m0 m0Var = (p13.m0) o0Var.next();
                        linkedHashMap.put(Integer.valueOf(m0Var.f134951a), (j) m0Var.f134952b);
                    }
                    r1Var = new r1(linkedHashMap);
                }
                this.f135493c.add(new o13.p(str, r1Var));
            }

            public final void b(g43.d dVar) {
                dVar.getClass();
                String strC = dVar.c();
                strC.getClass();
                this.f135494d = new o13.p<>(strC, null);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public final void c(String str, j... jVarArr) {
                str.getClass();
                p13.n0 n0Var = new p13.n0(new o02.a(jVarArr, 1));
                int iA = p13.t0.a(p13.y.r(n0Var, 10));
                if (iA < 16) {
                    iA = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
                Iterator it = n0Var.iterator();
                while (true) {
                    p13.o0 o0Var = (p13.o0) it;
                    if (!o0Var.f134956a.hasNext()) {
                        this.f135494d = new o13.p<>(str, new r1(linkedHashMap));
                        return;
                    } else {
                        p13.m0 m0Var = (p13.m0) o0Var.next();
                        linkedHashMap.put(Integer.valueOf(m0Var.f134951a), (j) m0Var.f134952b);
                    }
                }
            }
        }

        public a(o1 o1Var, String str) {
            str.getClass();
            this.f135490b = o1Var;
            this.f135489a = str;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void a(String str, String str2, e23.l<? super C2568a, Unit> lVar) {
            LinkedHashMap linkedHashMap = this.f135490b.f135488a;
            C2568a c2568a = new C2568a(this, str, str2);
            lVar.invoke(c2568a);
            q33.e0 e0Var = q33.e0.f142457a;
            String str3 = c2568a.f135496f.f135489a;
            ArrayList arrayList = c2568a.f135493c;
            ArrayList arrayList2 = new ArrayList(p13.y.r(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add((String) ((o13.p) it.next()).f128594a);
            }
            String strC = c2568a.f135494d.f128594a;
            e0Var.getClass();
            strC.getClass();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(c2568a.f135491a);
            sb3.append(CoreConstants.LEFT_PARENTHESIS_CHAR);
            sb3.append(p13.h0.k0(arrayList2, "", null, null, q33.d0.f142454a, 30));
            sb3.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
            if (strC.length() > 1) {
                strC = o2.c.c(';', "L", strC);
            }
            sb3.append(strC);
            String strE = q33.e0.e(str3, sb3.toString());
            r1 r1Var = c2568a.f135494d.f128595b;
            ArrayList arrayList3 = new ArrayList(p13.y.r(arrayList, 10));
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                arrayList3.add((r1) ((o13.p) it3.next()).f128595b);
            }
            o13.p pVar = new o13.p(strE, new h1(r1Var, arrayList3, c2568a.f135492b, c2568a.f135495e));
            linkedHashMap.put(pVar.f128594a, pVar.f128595b);
        }
    }
}
