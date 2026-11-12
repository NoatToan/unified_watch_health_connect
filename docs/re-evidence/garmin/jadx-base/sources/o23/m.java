package o23;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import d53.w;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import n23.i3;
import n23.s4;
import n23.w3;
import o13.p;
import o72.t;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s0;
import p13.d0;
import p13.h0;
import p13.p0;
import p13.u;
import p13.x;
import p13.y;
import p43.n0;
import p43.v0;
import p43.y1;
import t23.j1;
import t23.o0;
import t23.u0;
import t23.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u0000*\f\b\u0000\u0010\u0002 \u0001*\u0004\u0018\u00010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0002\u000b\fB%\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lo23/m;", "Ljava/lang/reflect/Member;", "M", "Lo23/h;", "Lt23/b;", "descriptor", "oldCaller", "", "isDefault", "<init>", "(Lorg/jetbrains/kotlin/descriptors/CallableMemberDescriptor;Lo23/h;Z)V", "a", "b", "kotlin-reflection"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class m<M extends Member> implements h<M> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f128729a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h<M> f128730b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final M f128731c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f128732d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final j23.l[] f128733e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f128734f;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\u0010\u0007\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lo23/m$a;", "", "Lj23/l;", "argumentRange", "", "", "Ljava/lang/reflect/Method;", "unboxParameters", "box", "<init>", "(Lj23/l;[Ljava/util/List;Ljava/lang/reflect/Method;)V", "kotlin-reflection"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final j23.l f128735a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<Method>[] f128736b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Method f128737c;

        public a(j23.l lVar, List<Method>[] listArr, Method method) {
            lVar.getClass();
            listArr.getClass();
            this.f128735a = lVar;
            this.f128736b = listArr;
            this.f128737c = method;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B-\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lo23/m$b;", "Lo23/h;", "", "Lt23/v;", "descriptor", "Ln23/i3;", TtmlNode.RUBY_CONTAINER, "", "constructorDesc", "", "Lt23/o0;", "originalParameters", "<init>", "(Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;Ln23/i3;Ljava/lang/String;Ljava/util/List;)V", "kotlin-reflection"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Method f128738a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Method f128739b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ArrayList f128740c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final ArrayList f128741d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final ArrayList f128742e;

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v15, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r0v17, types: [java.util.ArrayList] */
        public b(v vVar, i3 i3Var, String str, List<? extends o0> list) {
            ?? C;
            vVar.getClass();
            i3Var.getClass();
            str.getClass();
            list.getClass();
            Method methodG = i3Var.G("constructor-impl", str);
            methodG.getClass();
            this.f128738a = methodG;
            Method methodG2 = i3Var.G("box-impl", w.R(str, "V").concat(z23.f.b(i3Var.j())));
            methodG2.getClass();
            this.f128739b = methodG2;
            ArrayList arrayList = new ArrayList(y.r(list, 10));
            Iterator it = list.iterator();
            while (true) {
                List listC = null;
                if (!it.hasNext()) {
                    break;
                }
                n0 type = ((o0) it.next()).getType();
                type.getClass();
                v0 v0VarA = y1.a(type);
                ArrayList arrayListZ = gl.b.z(v0VarA);
                if (arrayListZ == null) {
                    Class clsQ = gl.b.Q(v0VarA);
                    if (clsQ != null) {
                        listC = p13.w.c(gl.b.x(clsQ, vVar));
                    }
                } else {
                    listC = arrayListZ;
                }
                arrayList.add(listC);
            }
            this.f128740c = arrayList;
            ArrayList arrayList2 = new ArrayList(y.r(list, 10));
            int i14 = 0;
            for (Object obj : list) {
                int i15 = i14 + 1;
                if (i14 < 0) {
                    x.q();
                    throw null;
                }
                t23.h hVarT = ((o0) obj).getType().F0().t();
                hVarT.getClass();
                t23.e eVar = (t23.e) hVarT;
                List list2 = (List) this.f128740c.get(i14);
                if (list2 != null) {
                    C = new ArrayList(y.r(list2, 10));
                    Iterator it3 = list2.iterator();
                    while (it3.hasNext()) {
                        C.add(((Method) it3.next()).getReturnType());
                    }
                } else {
                    Class<?> clsI = s4.i(eVar);
                    clsI.getClass();
                    C = p13.w.c(clsI);
                }
                arrayList2.add(C);
                i14 = i15;
            }
            this.f128741d = arrayList2;
            this.f128742e = y.s(arrayList2);
        }

        @Override // o23.h
        public final /* bridge */ boolean a() {
            return false;
        }

        @Override // o23.h
        public final List<Type> b() {
            return this.f128742e;
        }

        @Override // o23.h
        public final /* bridge */ /* synthetic */ Member c() {
            return null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r6v1, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Iterable] */
        /* JADX WARN: Type inference failed for: r6v3, types: [java.util.ArrayList] */
        @Override // o23.h
        public final Object call(Object[] objArr) throws IllegalAccessException, InvocationTargetException {
            ?? C;
            objArr.getClass();
            ArrayList arrayList = this.f128740c;
            arrayList.getClass();
            int length = objArr.length;
            ArrayList<p> arrayList2 = new ArrayList(Math.min(y.r(arrayList, 10), length));
            int i14 = 0;
            for (Object obj : arrayList) {
                if (i14 >= length) {
                    break;
                }
                arrayList2.add(new p(objArr[i14], obj));
                i14++;
            }
            ArrayList arrayList3 = new ArrayList();
            for (p pVar : arrayList2) {
                Object obj2 = pVar.f128594a;
                List list = (List) pVar.f128595b;
                if (list != null) {
                    C = new ArrayList(y.r(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        C.add(((Method) it.next()).invoke(obj2, null));
                    }
                } else {
                    C = p13.w.c(obj2);
                }
                d0.v(arrayList3, C);
            }
            Object[] array = arrayList3.toArray(new Object[0]);
            this.f128738a.invoke(null, Arrays.copyOf(array, array.length));
            return this.f128739b.invoke(null, Arrays.copyOf(array, array.length));
        }

        @Override // o23.h
        /* JADX INFO: renamed from: getReturnType */
        public final Type getF128710b() {
            Class<?> returnType = this.f128739b.getReturnType();
            returnType.getClass();
            return returnType;
        }
    }

    /* JADX WARN: Code duplicated, block: B:133:0x0279  */
    /* JADX WARN: Code duplicated, block: B:25:0x0071 A[LOOP:1: B:23:0x006b->B:25:0x0071, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:58:0x0117  */
    /* JADX WARN: Code duplicated, block: B:93:0x01b2  */
    public m(t23.b bVar, h<? extends M> hVar, boolean z14) {
        Class clsQ;
        Method declaredMethod;
        boolean z15;
        a aVar;
        List listZ;
        v0 v0VarG;
        ArrayList arrayList;
        Iterator it;
        bVar.getClass();
        hVar.getClass();
        this.f128729a = z14;
        boolean z16 = false;
        if (hVar instanceof i.h.c) {
            u0 u0VarI = bVar.I();
            u0VarI = u0VarI == null ? bVar.H() : u0VarI;
            n0 type = u0VarI != null ? u0VarI.getType() : null;
            if (type != null && b43.j.f(type)) {
                if (z14) {
                    List<j1> listF = bVar.f();
                    listF.getClass();
                    if (!listF.isEmpty()) {
                        Iterator<T> it3 = listF.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                if (((j1) it3.next()).h0()) {
                                    ArrayList arrayListZ = gl.b.z(y1.a(type));
                                    arrayListZ.getClass();
                                    arrayList = new ArrayList(y.r(arrayListZ, 10));
                                    it = arrayListZ.iterator();
                                    while (it.hasNext()) {
                                        arrayList.add(((Method) it.next()).invoke(((i.h.c) hVar).f128721h, null));
                                    }
                                    hVar = new i.h.d((Method) ((i.h) hVar).f128709a, arrayList.toArray(new Object[0]));
                                }
                            }
                        }
                    }
                } else {
                    ArrayList arrayListZ2 = gl.b.z(y1.a(type));
                    arrayListZ2.getClass();
                    arrayList = new ArrayList(y.r(arrayListZ2, 10));
                    it = arrayListZ2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((Method) it.next()).invoke(((i.h.c) hVar).f128721h, null));
                    }
                    hVar = new i.h.d((Method) ((i.h) hVar).f128709a, arrayList.toArray(new Object[0]));
                }
            }
        }
        this.f128730b = (h<M>) hVar;
        this.f128731c = (M) hVar.c();
        n0 returnType = bVar.getReturnType();
        returnType.getClass();
        boolean z17 = bVar instanceof v;
        if ((z17 && ((v) bVar).isSuspend() && (v0VarG = b43.j.g(returnType)) != null && p005kotlin.reflect.jvm.internal.impl.builtins.d.H(v0VarG)) || (clsQ = gl.b.Q(returnType)) == null) {
            declaredMethod = null;
        } else {
            try {
                declaredMethod = clsQ.getDeclaredMethod("box-impl", gl.b.x(clsQ, bVar).getReturnType());
                declaredMethod.getClass();
            } catch (NoSuchMethodException unused) {
                n23.j.u("No box method found in inline class: ", clsQ, " (calling ", bVar);
                throw null;
            }
        }
        if (b43.j.a(bVar)) {
            j23.l.f96803e.getClass();
            aVar = new a(j23.l.f96804f, new List[0], declaredMethod);
        } else {
            int i14 = -1;
            if ((!(hVar instanceof i.h.c) || hVar.f128720g) && !(hVar instanceof i.h.d)) {
                if (bVar instanceof t23.k) {
                    if (!(hVar instanceof g)) {
                        i14 = 0;
                    }
                } else if (bVar.H() == null || (hVar instanceof g)) {
                    i14 = 0;
                } else {
                    t23.l lVarD = bVar.d();
                    lVarD.getClass();
                    if (b43.j.e(lVarD)) {
                        i14 = 0;
                    } else {
                        i14 = 1;
                    }
                }
            }
            int i15 = hVar instanceof i.h.d ? -hVar.f128722g.length : i14;
            Member memberC = hVar.c();
            l lVar = l.f128728a;
            ArrayList arrayList2 = new ArrayList();
            u0 u0VarI2 = bVar.I();
            n0 type2 = u0VarI2 != null ? u0VarI2.getType() : null;
            if (type2 != null) {
                arrayList2.add(type2);
            } else if (bVar instanceof t23.k) {
                t23.e eVarE0 = ((t23.k) bVar).e0();
                eVarE0.getClass();
                if (eVarE0.l()) {
                    t23.l lVarD2 = eVarE0.d();
                    lVarD2.getClass();
                    arrayList2.add(((t23.e) lVarD2).p());
                }
            } else {
                t23.l lVarD3 = bVar.d();
                lVarD3.getClass();
                if ((lVarD3 instanceof t23.e) && ((Boolean) lVar.invoke(lVarD3)).booleanValue()) {
                    if (memberC == null) {
                        z15 = false;
                    } else {
                        Class<?> declaringClass = memberC.getDeclaringClass();
                        if (declaringClass == null ? false : !s0.f105811a.b(declaringClass).k()) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                    }
                    if (z15) {
                        v0 v0VarP = ((t23.e) lVarD3).p();
                        v0VarP.getClass();
                        arrayList2.add(t.S(v0VarP));
                    } else {
                        arrayList2.add(((t23.e) lVarD3).p());
                    }
                }
            }
            List<j1> listF2 = bVar.f();
            listF2.getClass();
            Iterator<T> it4 = listF2.iterator();
            while (it4.hasNext()) {
                arrayList2.add(((j1) it4.next()).getType());
            }
            Iterator it5 = arrayList2.iterator();
            int size = 0;
            while (it5.hasNext()) {
                ArrayList arrayListZ3 = gl.b.z(y1.a((n0) it5.next()));
                size += arrayListZ3 != null ? arrayListZ3.size() : 1;
            }
            int i16 = size + i15 + (this.f128729a ? ((size + 31) / 32) + 1 : 0) + ((z17 && ((v) bVar).isSuspend()) ? 1 : 0);
            boolean z18 = this.f128729a;
            if (b().size() != i16) {
                StringBuilder sb3 = new StringBuilder("Inconsistent number of parameters in the descriptor and Java reflection object: ");
                sb3.append(this.f128730b.b().size());
                sb3.append(" != ");
                sb3.append(i16);
                sb3.append("\nCalling: ");
                sb3.append(bVar);
                List<Type> listB = this.f128730b.b();
                sb3.append("\nParameter types: ");
                sb3.append(listB);
                sb3.append(")\nDefault: ");
                sb3.append(z18);
                throw new w3(sb3.toString());
            }
            j23.l lVarO = j23.t.o(Math.max(i14, 0), arrayList2.size() + i14);
            List[] listArr = new List[i16];
            int i17 = 0;
            while (i17 < i16) {
                if (i17 <= lVarO.f96797b && lVarO.f96796a <= i17) {
                    v0 v0VarA = y1.a((n0) arrayList2.get(i17 - i14));
                    listZ = gl.b.z(v0VarA);
                    if (listZ == null) {
                        Class clsQ2 = gl.b.Q(v0VarA);
                        if (clsQ2 != null) {
                            listZ = p13.w.c(gl.b.x(clsQ2, bVar));
                        } else {
                            listZ = null;
                        }
                    }
                } else {
                    listZ = null;
                }
                listArr[i17] = listZ;
                i17++;
            }
            aVar = new a(lVarO, listArr, declaredMethod);
        }
        this.f128732d = aVar;
        q13.b bVarB = p13.w.b();
        h<M> hVar2 = this.f128730b;
        int length = hVar2 instanceof i.h.d ? ((i.h.d) hVar2).f128722g.length : hVar2 instanceof i.h.c ? 1 : 0;
        if (length > 0) {
            bVarB.add(j23.t.o(0, length));
        }
        List<Method>[] listArr2 = aVar.f128736b;
        int length2 = listArr2.length;
        int i18 = 0;
        while (i18 < length2) {
            List<Method> list = listArr2[i18];
            int size2 = (list != null ? list.size() : 1) + length;
            bVarB.add(j23.t.o(length, size2));
            i18++;
            length = size2;
        }
        this.f128733e = (j23.l[]) p13.w.a(bVarB).toArray(new j23.l[0]);
        Iterable iterable = this.f128732d.f128735a;
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            Iterator<Integer> it6 = iterable.iterator();
            while (((j23.k) it6).f96801c) {
                List<Method> list2 = this.f128732d.f128736b[((p0) it6).nextInt()];
                if (list2 != null && list2.size() > 1) {
                    z16 = true;
                    break;
                }
            }
        }
        this.f128734f = z16;
    }

    @Override // o23.h
    public final boolean a() {
        return this.f128730b instanceof i.h.a;
    }

    @Override // o23.h
    public final List<Type> b() {
        return this.f128730b.b();
    }

    @Override // o23.h
    public final M c() {
        return this.f128731c;
    }

    @Override // o23.h
    public final Object call(Object[] objArr) throws IllegalAccessException, InvocationTargetException {
        Object objInvoke;
        Object objD;
        Object objD2;
        objArr.getClass();
        a aVar = this.f128732d;
        j23.l lVar = aVar.f128735a;
        List<Method>[] listArr = aVar.f128736b;
        Method method = aVar.f128737c;
        boolean zIsEmpty = lVar.isEmpty();
        int i14 = lVar.f96797b;
        int i15 = lVar.f96796a;
        if (!zIsEmpty) {
            if (this.f128734f) {
                q13.b bVar = new q13.b(objArr.length);
                for (int i16 = 0; i16 < i15; i16++) {
                    bVar.add(objArr[i16]);
                }
                if (i15 <= i14) {
                    while (true) {
                        List<Method> list = listArr[i15];
                        Object obj = objArr[i15];
                        if (list != null) {
                            for (Method method2 : list) {
                                if (obj != null) {
                                    objD2 = method2.invoke(obj, null);
                                } else {
                                    Class<?> returnType = method2.getReturnType();
                                    returnType.getClass();
                                    objD2 = s4.d(returnType);
                                }
                                bVar.add(objD2);
                            }
                        } else {
                            bVar.add(obj);
                        }
                        if (i15 == i14) {
                            break;
                        }
                        i15++;
                    }
                }
                int i17 = i14 + 1;
                int length = objArr.length - 1;
                if (i17 <= length) {
                    while (true) {
                        bVar.add(objArr[i17]);
                        if (i17 == length) {
                            break;
                        }
                        i17++;
                    }
                }
                objArr = p13.w.a(bVar).toArray(new Object[0]);
            } else {
                int length2 = objArr.length;
                Object[] objArr2 = new Object[length2];
                for (int i18 = 0; i18 < length2; i18++) {
                    if (i18 > i14 || i15 > i18) {
                        objD = objArr[i18];
                    } else {
                        List<Method> list2 = listArr[i18];
                        Method method3 = list2 != null ? (Method) h0.I0(list2) : null;
                        objD = objArr[i18];
                        if (method3 != null) {
                            if (objD != null) {
                                objD = method3.invoke(objD, null);
                            } else {
                                Class<?> returnType2 = method3.getReturnType();
                                returnType2.getClass();
                                objD = s4.d(returnType2);
                            }
                        }
                    }
                    objArr2[i18] = objD;
                }
                objArr = objArr2;
            }
        }
        Object objCall = this.f128730b.call(objArr);
        return (objCall == u13.a.COROUTINE_SUSPENDED || method == null || (objInvoke = method.invoke(null, objCall)) == null) ? objCall : objInvoke;
    }

    public final j23.l d(int i14) {
        j23.l[] lVarArr = this.f128733e;
        if (i14 >= 0 && i14 < lVarArr.length) {
            return lVarArr[i14];
        }
        if (lVarArr.length == 0) {
            return new j23.l(i14, i14);
        }
        int length = ((j23.l) u.Q(lVarArr)).f96797b + 1 + (i14 - lVarArr.length);
        return new j23.l(length, length);
    }

    @Override // o23.h
    /* JADX INFO: renamed from: getReturnType */
    public final Type getF128710b() {
        return this.f128730b.getF128710b();
    }
}
