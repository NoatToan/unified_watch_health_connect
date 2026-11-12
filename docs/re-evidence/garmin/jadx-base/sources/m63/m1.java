package m63;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0011\u0018\u00002\u00020\u00012\u00020\u0002B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lm63/m1;", "Lk63/e;", "Lm63/k;", "", "serialName", "Lm63/e0;", "generatedSerializer", "", "elementsCount", "<init>", "(Ljava/lang/String;Lm63/e0;I)V", "kotlinx-serialization-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class m1 implements k63.e, k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f116983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e0<?> f116984b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f116985c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f116986d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String[] f116987e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List<Annotation>[] f116988f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ArrayList f116989g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean[] f116990h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Object f116991i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object f116992j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Object f116993k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Object f116994l;

    public m1(String str, e0<?> e0Var, int i14) {
        str.getClass();
        this.f116983a = str;
        this.f116984b = e0Var;
        this.f116985c = i14;
        this.f116986d = -1;
        String[] strArr = new String[i14];
        for (int i15 = 0; i15 < i14; i15++) {
            strArr[i15] = "[UNINITIALIZED]";
        }
        this.f116987e = strArr;
        int i16 = this.f116985c;
        this.f116988f = new List[i16];
        this.f116990h = new boolean[i16];
        p13.k0 k0Var = p13.k0.f134949a;
        k0Var.getClass();
        this.f116991i = k0Var;
        o13.n nVar = o13.n.PUBLICATION;
        final int i17 = 0;
        this.f116992j = o13.m.a(nVar, new e23.a(this) { // from class: m63.l1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ m1 f116978b;

            {
                this.f116978b = this;
            }

            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, o13.l] */
            @Override // e23.a
            public final Object invoke() {
                i63.c<?>[] cVarArrChildSerializers;
                ArrayList arrayList;
                i63.c<?>[] cVarArrTypeParametersSerializers;
                switch (i17) {
                    case 0:
                        e0<?> e0Var2 = this.f116978b.f116984b;
                        return (e0Var2 == null || (cVarArrChildSerializers = e0Var2.childSerializers()) == null) ? k1.f116970b : cVarArrChildSerializers;
                    case 1:
                        e0<?> e0Var3 = this.f116978b.f116984b;
                        if (e0Var3 == null || (cVarArrTypeParametersSerializers = e0Var3.typeParametersSerializers()) == null) {
                            arrayList = null;
                        } else {
                            arrayList = new ArrayList(cVarArrTypeParametersSerializers.length);
                            for (i63.c<?> cVar : cVarArrTypeParametersSerializers) {
                                arrayList.add(cVar.getF116202c());
                            }
                        }
                        return k1.c(arrayList);
                    default:
                        m1 m1Var = this.f116978b;
                        return Integer.valueOf(k1.e(m1Var, (k63.e[]) m1Var.f116993k.getValue()));
                }
            }
        });
        final int i18 = 1;
        this.f116993k = o13.m.a(nVar, new e23.a(this) { // from class: m63.l1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ m1 f116978b;

            {
                this.f116978b = this;
            }

            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, o13.l] */
            @Override // e23.a
            public final Object invoke() {
                i63.c<?>[] cVarArrChildSerializers;
                ArrayList arrayList;
                i63.c<?>[] cVarArrTypeParametersSerializers;
                switch (i18) {
                    case 0:
                        e0<?> e0Var2 = this.f116978b.f116984b;
                        return (e0Var2 == null || (cVarArrChildSerializers = e0Var2.childSerializers()) == null) ? k1.f116970b : cVarArrChildSerializers;
                    case 1:
                        e0<?> e0Var3 = this.f116978b.f116984b;
                        if (e0Var3 == null || (cVarArrTypeParametersSerializers = e0Var3.typeParametersSerializers()) == null) {
                            arrayList = null;
                        } else {
                            arrayList = new ArrayList(cVarArrTypeParametersSerializers.length);
                            for (i63.c<?> cVar : cVarArrTypeParametersSerializers) {
                                arrayList.add(cVar.getF116202c());
                            }
                        }
                        return k1.c(arrayList);
                    default:
                        m1 m1Var = this.f116978b;
                        return Integer.valueOf(k1.e(m1Var, (k63.e[]) m1Var.f116993k.getValue()));
                }
            }
        });
        final int i19 = 2;
        this.f116994l = o13.m.a(nVar, new e23.a(this) { // from class: m63.l1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ m1 f116978b;

            {
                this.f116978b = this;
            }

            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, o13.l] */
            @Override // e23.a
            public final Object invoke() {
                i63.c<?>[] cVarArrChildSerializers;
                ArrayList arrayList;
                i63.c<?>[] cVarArrTypeParametersSerializers;
                switch (i19) {
                    case 0:
                        e0<?> e0Var2 = this.f116978b.f116984b;
                        return (e0Var2 == null || (cVarArrChildSerializers = e0Var2.childSerializers()) == null) ? k1.f116970b : cVarArrChildSerializers;
                    case 1:
                        e0<?> e0Var3 = this.f116978b.f116984b;
                        if (e0Var3 == null || (cVarArrTypeParametersSerializers = e0Var3.typeParametersSerializers()) == null) {
                            arrayList = null;
                        } else {
                            arrayList = new ArrayList(cVarArrTypeParametersSerializers.length);
                            for (i63.c<?> cVar : cVarArrTypeParametersSerializers) {
                                arrayList.add(cVar.getF116202c());
                            }
                        }
                        return k1.c(arrayList);
                    default:
                        m1 m1Var = this.f116978b;
                        return Integer.valueOf(k1.e(m1Var, (k63.e[]) m1Var.f116993k.getValue()));
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    @Override // m63.k
    public final Set<String> a() {
        return this.f116991i.keySet();
    }

    @Override // k63.e
    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getF116985c() {
        return this.f116985c;
    }

    @Override // k63.e
    public final String d(int i14) {
        return this.f116987e[i14];
    }

    @Override // k63.e
    public final List<Annotation> e(int i14) {
        List<Annotation> list = this.f116988f[i14];
        return list == null ? p13.j0.f134944a : list;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, o13.l] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, o13.l] */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof m1) {
            k63.e eVar = (k63.e) obj;
            if (p005kotlin.jvm.internal.s.g(this.f116983a, eVar.getF117019b()) && Arrays.equals((k63.e[]) this.f116993k.getValue(), (k63.e[]) ((m1) obj).f116993k.getValue())) {
                int f116985c = eVar.getF116985c();
                int i14 = this.f116985c;
                if (i14 == f116985c) {
                    for (int i15 = 0; i15 < i14; i15++) {
                        if (p005kotlin.jvm.internal.s.g(h(i15).getF117019b(), eVar.h(i15).getF117019b()) && p005kotlin.jvm.internal.s.g(h(i15).getF103234b(), eVar.h(i15).getF103234b())) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // k63.e
    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getF117019b() {
        return this.f116983a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    @Override // k63.e
    public final int g(String str) {
        str.getClass();
        Integer num = (Integer) this.f116991i.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // k63.e
    public final List<Annotation> getAnnotations() {
        ArrayList arrayList = this.f116989g;
        return arrayList == null ? p13.j0.f134944a : arrayList;
    }

    @Override // k63.e
    /* JADX INFO: renamed from: getKind */
    public k63.l getF103234b() {
        return k63.m.a.f103253a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
    @Override // k63.e
    public k63.e h(int i14) {
        return ((i63.c[]) this.f116992j.getValue())[i14].getF116202c();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
    public int hashCode() {
        return ((Number) this.f116994l.getValue()).intValue();
    }

    @Override // k63.e
    public final boolean i(int i14) {
        return this.f116990h[i14];
    }

    public final void j(String str, boolean z14) {
        str.getClass();
        int i14 = this.f116986d + 1;
        this.f116986d = i14;
        String[] strArr = this.f116987e;
        strArr[i14] = str;
        this.f116990h[i14] = z14;
        this.f116988f[i14] = null;
        if (i14 == this.f116985c - 1) {
            HashMap map = new HashMap();
            int length = strArr.length;
            for (int i15 = 0; i15 < length; i15++) {
                map.put(strArr[i15], Integer.valueOf(i15));
            }
            this.f116991i = map;
        }
    }

    public final void k(Annotation annotation) {
        annotation.getClass();
        if (this.f116989g == null) {
            this.f116989g = new ArrayList(1);
        }
        ArrayList arrayList = this.f116989g;
        arrayList.getClass();
        arrayList.add(annotation);
    }

    public String toString() {
        return k1.j(this);
    }

    public /* synthetic */ m1(String str, e0 e0Var, int i14, int i15, p005kotlin.jvm.internal.j jVar) {
        this(str, (i15 & 2) != 0 ? null : e0Var, i14);
    }
}
