package n23;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import org.apache.commons.io.IOUtils;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b \u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Ln23/i3;", "Lkotlin/jvm/internal/g;", "<init>", "()V", "b", "c", "a", "kotlin-reflection"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class i3 implements p005kotlin.jvm.internal.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f122504a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Class<?> f122505b = p005kotlin.jvm.internal.j.class;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d53.k f122506c = new d53.k("<v#(\\d+)>");

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b¦\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ln23/i3$b;", "", "<init>", "(Ln23/i3;)V", "kotlin-reflection"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public abstract class b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ k23.l<Object>[] f122507b = {p005kotlin.jvm.internal.s0.f105811a.h(new p005kotlin.jvm.internal.i0(b.class, "moduleData", "getModuleData()Lorg/jetbrains/kotlin/descriptors/runtime/components/RuntimeModuleData;", 0))};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c4.a f122508a;

        public b(i3 i3Var) {
            this.f122508a = new c4.a(null, new j3(i3Var));
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B'\u0012\u0010\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ln23/i3$c;", "", "", "Ljava/lang/Class;", "parameters", "returnType", "<init>", "(Ljava/util/List;Ljava/lang/Class;)V", "kotlin-reflection"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<Class<?>> f122509a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Class<?> f122510b;

        /* JADX WARN: Multi-variable type inference failed */
        public c(List<? extends Class<?>> list, Class<?> cls) {
            list.getClass();
            this.f122509a = list;
            this.f122510b = cls;
        }
    }

    public static void E(ArrayList arrayList, List list, boolean z14) {
        Object objN0 = p13.h0.n0(list);
        Class<?> cls = f122505b;
        if (p005kotlin.jvm.internal.s.g(objN0, cls)) {
            list = list.subList(0, list.size() - 1);
        }
        arrayList.addAll(list);
        int size = (list.size() + 31) / 32;
        for (int i14 = 0; i14 < size; i14++) {
            Class cls2 = Integer.TYPE;
            cls2.getClass();
            arrayList.add(cls2);
        }
        if (!z14) {
            cls = Object.class;
        }
        cls.getClass();
        arrayList.add(cls);
    }

    public static Method M(Class cls, String str, Class[] clsArr, Class cls2, boolean z14) {
        Method methodM;
        if (z14) {
            clsArr[0] = cls;
        }
        Method methodP = P(cls, str, clsArr, cls2);
        if (methodP != null) {
            return methodP;
        }
        Class superclass = cls.getSuperclass();
        if (superclass != null && (methodM = M(superclass, str, clsArr, cls2, z14)) != null) {
            return methodM;
        }
        Class<?>[] interfaces = cls.getInterfaces();
        interfaces.getClass();
        int length = interfaces.length;
        int i14 = 0;
        while (true) {
            Class<?> cls3 = null;
            if (i14 >= length) {
                return null;
            }
            Class<?> cls4 = interfaces[i14];
            cls4.getClass();
            Method methodM2 = M(cls4, str, clsArr, cls2, z14);
            if (methodM2 != null) {
                return methodM2;
            }
            if (z14) {
                try {
                    cls3 = Class.forName(cls4.getName().concat("$DefaultImpls"), false, z23.f.d(cls4));
                } catch (ClassNotFoundException unused) {
                }
                if (cls3 != null) {
                    clsArr[0] = cls4;
                    Method methodP2 = P(cls3, str, clsArr, cls2);
                    if (methodP2 != null) {
                        return methodP2;
                    }
                } else {
                    continue;
                }
            }
            i14++;
        }
    }

    public static Method P(Class cls, String str, Class[] clsArr, Class cls2) {
        try {
            Method declaredMethod = cls.getDeclaredMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
            if (p005kotlin.jvm.internal.s.g(declaredMethod.getReturnType(), cls2)) {
                return declaredMethod;
            }
            Method[] declaredMethods = cls.getDeclaredMethods();
            declaredMethods.getClass();
            for (Method method : declaredMethods) {
                if (p005kotlin.jvm.internal.s.g(method.getName(), str) && p005kotlin.jvm.internal.s.g(method.getReturnType(), cls2) && Arrays.equals(method.getParameterTypes(), clsArr)) {
                    return method;
                }
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public final Method F(String str, String str2, boolean z14) {
        str.getClass();
        str2.getClass();
        if (str.equals("<init>")) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (z14) {
            arrayList.add(j());
        }
        c cVarN = N(str2, true);
        E(arrayList, cVarN.f122509a, false);
        Class<?> clsK = K();
        String strConcat = str.concat("$default");
        Class[] clsArr = (Class[]) arrayList.toArray(new Class[0]);
        Class<?> cls = cVarN.f122510b;
        cls.getClass();
        return M(clsK, strConcat, clsArr, cls, z14);
    }

    public final Method G(String str, String str2) {
        Method methodM;
        str.getClass();
        str2.getClass();
        if (str.equals("<init>")) {
            return null;
        }
        c cVarN = N(str2, true);
        Class[] clsArr = (Class[]) cVarN.f122509a.toArray(new Class[0]);
        Class<?> cls = cVarN.f122510b;
        cls.getClass();
        Method methodM2 = M(K(), str, clsArr, cls, false);
        if (methodM2 != null) {
            return methodM2;
        }
        if (!K().isInterface() || (methodM = M(Object.class, str, clsArr, cls, false)) == null) {
            return null;
        }
        return methodM;
    }

    public abstract Collection<t23.k> H();

    public abstract Collection<t23.v> I(x33.f fVar);

    public abstract t23.r0 J(int i14);

    public Class<?> K() {
        Class<?> clsJ = j();
        List<k23.d<? extends Object>> list = z23.f.f202041a;
        clsJ.getClass();
        Class<? extends Object> cls = z23.f.f202043c.get(clsJ);
        return cls == null ? j() : cls;
    }

    public abstract Collection<t23.r0> L(x33.f fVar);

    public final c N(String str, boolean z14) {
        int iG;
        ArrayList arrayList = new ArrayList();
        int i14 = 1;
        while (str.charAt(i14) != ')') {
            int i15 = i14;
            while (str.charAt(i15) == '[') {
                i15++;
            }
            char cCharAt = str.charAt(i15);
            if (d53.w.A("VZCBSIFJD", cCharAt)) {
                iG = i15 + 1;
            } else {
                if (cCharAt != 'L') {
                    throw new w3("Unknown type prefix in the method signature: ".concat(str));
                }
                iG = d53.w.G(';', i14, 4, str) + 1;
            }
            arrayList.add(O(i14, iG, str));
            i14 = iG;
        }
        return new c(arrayList, z14 ? O(i14 + 1, str.length(), str) : null);
    }

    public final Class O(int i14, int i15, String str) throws ClassNotFoundException {
        char cCharAt = str.charAt(i14);
        if (cCharAt == 'F') {
            return Float.TYPE;
        }
        if (cCharAt == 'L') {
            ClassLoader classLoaderD = z23.f.d(j());
            String strReplace = str.substring(i14 + 1, i15 - 1).replace(IOUtils.DIR_SEPARATOR_UNIX, '.');
            strReplace.getClass();
            Class<?> clsLoadClass = classLoaderD.loadClass(strReplace);
            clsLoadClass.getClass();
            return clsLoadClass;
        }
        if (cCharAt == 'S') {
            return Short.TYPE;
        }
        if (cCharAt == 'V') {
            Class cls = Void.TYPE;
            cls.getClass();
            return cls;
        }
        if (cCharAt == 'I') {
            return Integer.TYPE;
        }
        if (cCharAt == 'J') {
            return Long.TYPE;
        }
        if (cCharAt == 'Z') {
            return Boolean.TYPE;
        }
        if (cCharAt == '[') {
            return s4.c(O(i14 + 1, i15, str));
        }
        switch (cCharAt) {
            case 'B':
                return Byte.TYPE;
            case 'C':
                return Character.TYPE;
            case 'D':
                return Double.TYPE;
            default:
                throw new w3("Unknown type prefix in the method signature: ".concat(str));
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R$\u0010\u0006\u001a\u0012\u0012\u0002\b\u0003 \u0005*\b\u0012\u0002\b\u0003\u0018\u00010\u00040\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ln23/i3$a;", "", "<init>", "()V", "Ljava/lang/Class;", "kotlin.jvm.PlatformType", "DEFAULT_CONSTRUCTOR_MARKER", "Ljava/lang/Class;", "kotlin-reflection"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
