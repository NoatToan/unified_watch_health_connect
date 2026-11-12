package d4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p005kotlin.Metadata;
import p1.g1;
import p1.t0;
import p13.k0;
import p13.x;
import p3.y3;
import v.e0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B9\u0012\u001c\u0010\u0006\u001a\u0018\u0012\u0004\u0012\u00020\u0003\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0018\u00010\u0002\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Ld4/g;", "Ld4/f;", "", "", "", "", "restored", "Lkotlin/Function1;", "", "canBeSaved", "<init>", "(Ljava/util/Map;Le23/l;)V", "runtime-saveable"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class g implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e23.l<Object, Boolean> f57442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t0<String, List<Object>> f57443b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public t0<String, List<e23.a<Object>>> f57444c;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"d4/g$a", "Ld4/f$a;", "runtime-saveable"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements f.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ t0<String, List<e23.a<Object>>> f57445a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f57446b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a<Object> f57447c;

        public a(t0<String, List<e23.a<Object>>> t0Var, String str, e23.a<? extends Object> aVar) {
            this.f57445a = t0Var;
            this.f57446b = str;
            this.f57447c = aVar;
        }

        @Override // d4.f.a
        public final void unregister() {
            t0<String, List<e23.a<Object>>> t0Var = this.f57445a;
            String str = this.f57446b;
            List<e23.a<Object>> listK = t0Var.k(str);
            if (listK != null) {
                listK.remove(this.f57447c);
            }
            if (listK == null || listK.isEmpty()) {
                return;
            }
            t0Var.m(str, listK);
        }
    }

    public g(Map<String, ? extends List<? extends Object>> map, e23.l<Object, Boolean> lVar) {
        t0<String, List<Object>> t0Var;
        this.f57442a = lVar;
        if (map == null || map.isEmpty()) {
            t0Var = null;
        } else {
            y3 y3Var = i.f57449a;
            t0Var = new t0<>(map.size());
            for (Map.Entry<String, ? extends List<? extends Object>> entry : map.entrySet()) {
                t0Var.m(entry.getKey(), entry.getValue());
            }
        }
        this.f57443b = t0Var;
    }

    @Override // d4.f
    public final boolean a(Object obj) {
        return this.f57442a.invoke(obj).booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0091  */
    @Override // d4.f
    public final Map<String, List<Object>> b() {
        char c14;
        long j8;
        long j14;
        long j15;
        long[] jArr;
        int i14;
        long[] jArr2;
        int i15;
        t0<String, List<Object>> t0Var = this.f57443b;
        if (t0Var == null && this.f57444c == null) {
            k0 k0Var = k0.f134949a;
            k0Var.getClass();
            return k0Var;
        }
        int i16 = 0;
        int i17 = t0Var != null ? t0Var.f134724e : 0;
        t0<String, List<e23.a<Object>>> t0Var2 = this.f57444c;
        HashMap map = new HashMap(i17 + (t0Var2 != null ? t0Var2.f134724e : 0));
        char c15 = 7;
        long j16 = -9187201950435737472L;
        int i18 = 8;
        if (t0Var != null) {
            Object[] objArr = t0Var.f134721b;
            Object[] objArr2 = t0Var.f134722c;
            long[] jArr3 = t0Var.f134720a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i19 = 0;
                j14 = 128;
                while (true) {
                    long j17 = jArr3[i19];
                    j15 = 255;
                    if ((((~j17) << c15) & j17 & j16) != j16) {
                        int i24 = 8 - ((~(i19 - length)) >>> 31);
                        int i25 = 0;
                        while (i25 < i24) {
                            if ((j17 & 255) < 128) {
                                int i26 = (i19 << 3) + i25;
                                map.put((String) objArr[i26], (List) objArr2[i26]);
                            }
                            j17 >>= 8;
                            i25++;
                            c15 = c15;
                            j16 = j16;
                        }
                        c14 = c15;
                        j8 = j16;
                        if (i24 != 8) {
                            break;
                        }
                    } else {
                        c14 = c15;
                        j8 = j16;
                    }
                    if (i19 == length) {
                        break;
                    }
                    i19++;
                    c15 = c14;
                    j16 = j8;
                }
            } else {
                c14 = 7;
                j8 = -9187201950435737472L;
                j14 = 128;
                j15 = 255;
            }
        } else {
            c14 = 7;
            j8 = -9187201950435737472L;
            j14 = 128;
            j15 = 255;
        }
        t0<String, List<e23.a<Object>>> t0Var3 = this.f57444c;
        if (t0Var3 != null) {
            Object[] objArr3 = t0Var3.f134721b;
            Object[] objArr4 = t0Var3.f134722c;
            long[] jArr4 = t0Var3.f134720a;
            int length2 = jArr4.length - 2;
            if (length2 >= 0) {
                int i27 = 0;
                while (true) {
                    long j18 = jArr4[i27];
                    if ((((~j18) << c14) & j18 & j8) != j8) {
                        int i28 = 8 - ((~(i27 - length2)) >>> 31);
                        int i29 = i16;
                        while (i29 < i28) {
                            if ((j18 & j15) < j14) {
                                int i30 = (i27 << 3) + i29;
                                Object obj = objArr3[i30];
                                List list = (List) objArr4[i30];
                                String str = (String) obj;
                                i15 = i18;
                                if (list.size() == 1) {
                                    Object objInvoke = ((e23.a) list.get(i16)).invoke();
                                    if (objInvoke != null) {
                                        if (!a(objInvoke)) {
                                            e0.n(d4.a.a(objInvoke));
                                            return null;
                                        }
                                        map.put(str, x.d(objInvoke));
                                    }
                                    jArr2 = jArr4;
                                } else {
                                    int size = list.size();
                                    ArrayList arrayList = new ArrayList(size);
                                    while (i16 < size) {
                                        long[] jArr5 = jArr4;
                                        Object objInvoke2 = ((e23.a) list.get(i16)).invoke();
                                        if (objInvoke2 != null && !a(objInvoke2)) {
                                            e0.n(d4.a.a(objInvoke2));
                                            return null;
                                        }
                                        arrayList.add(objInvoke2);
                                        i16++;
                                        jArr4 = jArr5;
                                    }
                                    jArr2 = jArr4;
                                    map.put(str, arrayList);
                                }
                            } else {
                                jArr2 = jArr4;
                                i15 = i18;
                            }
                            j18 >>= i15;
                            i29++;
                            i18 = i15;
                            jArr4 = jArr2;
                            i16 = 0;
                        }
                        jArr = jArr4;
                        i14 = i18;
                        if (i28 != i14) {
                            break;
                        }
                    } else {
                        jArr = jArr4;
                        i14 = i18;
                    }
                    if (i27 == length2) {
                        break;
                    }
                    i27++;
                    i18 = i14;
                    jArr4 = jArr;
                    i16 = 0;
                }
            }
        }
        return map;
    }

    @Override // d4.f
    public final Object e(String str) {
        t0<String, List<Object>> t0Var = this.f57443b;
        List<Object> listK = t0Var != null ? t0Var.k(str) : null;
        if (listK == null || listK.isEmpty()) {
            return null;
        }
        if (listK.size() > 1 && t0Var != null) {
            List<Object> listSubList = listK.subList(1, listK.size());
            int i14 = t0Var.i(str);
            if (i14 < 0) {
                i14 = ~i14;
            }
            Object[] objArr = t0Var.f134722c;
            Object obj = objArr[i14];
            t0Var.f134721b[i14] = str;
            objArr[i14] = listSubList;
        }
        return listK.get(0);
    }

    @Override // d4.f
    public final f.a f(String str, e23.a<? extends Object> aVar) {
        y3 y3Var = i.f57449a;
        int length = str.length();
        for (int i14 = 0; i14 < length; i14++) {
            if (!d53.a.b(str.charAt(i14))) {
                t0<String, List<e23.a<Object>>> t0VarB = this.f57444c;
                if (t0VarB == null) {
                    t0VarB = g1.b();
                    this.f57444c = t0VarB;
                }
                List<e23.a<Object>> listD = t0VarB.d(str);
                if (listD == null) {
                    listD = new ArrayList<>();
                    t0VarB.m(str, listD);
                }
                listD.add(aVar);
                return new a(t0VarB, str, aVar);
            }
        }
        vb.h.s("Registered key is empty or blank");
        return null;
    }
}
