package p005kotlin.jvm.internal;

import e23.b;
import e23.c;
import e23.e;
import e23.f;
import e23.g;
import e23.i;
import e23.j;
import e23.k;
import e23.l;
import e23.m;
import e23.n;
import e23.o;
import e23.p;
import e23.q;
import e23.r;
import e23.s;
import e23.t;
import e23.u;
import e23.v;
import e23.w;
import java.lang.reflect.Constructor;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import k23.d;
import p005kotlin.Metadata;
import p13.u0;
import p13.x;
import p13.y;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004:\u0001\tB\u0013\u0012\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lkotlin/jvm/internal/h;", "Lk23/d;", "", "Lkotlin/jvm/internal/g;", "Lkotlin/jvm/internal/v;", "Ljava/lang/Class;", "jClass", "<init>", "(Ljava/lang/Class;)V", "a", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h implements d<Object>, g, v {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f105797b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Map<Class<? extends o13.h<?>>, Integer> f105798c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class<?> f105799a;

    static {
        List listK = x.k(e23.a.class, l.class, p.class, q.class, r.class, s.class, t.class, u.class, v.class, w.class, b.class, c.class, e23.d.class, e.class, f.class, g.class, e23.h.class, i.class, j.class, k.class, m.class, n.class, o.class);
        ArrayList arrayList = new ArrayList(y.r(listK, 10));
        int i14 = 0;
        for (Object obj : listK) {
            int i15 = i14 + 1;
            if (i14 < 0) {
                x.q();
                throw null;
            }
            arrayList.add(new o13.p((Class) obj, Integer.valueOf(i14)));
            i14 = i15;
        }
        f105798c = u0.l(arrayList);
    }

    public h(Class<?> cls) {
        cls.getClass();
        this.f105799a = cls;
    }

    public static void c() {
        throw new d23.b();
    }

    @Override // k23.d
    public final String D() {
        String strB;
        f105797b.getClass();
        Class<?> cls = this.f105799a;
        String strConcat = null;
        if (cls.isAnonymousClass()) {
            return null;
        }
        if (!cls.isLocalClass()) {
            if (!cls.isArray()) {
                String strB2 = a.b(cls.getName());
                return strB2 == null ? cls.getSimpleName() : strB2;
            }
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (strB = a.b(componentType.getName())) != null) {
                strConcat = strB.concat("Array");
            }
            return strConcat == null ? "Array" : strConcat;
        }
        String simpleName = cls.getSimpleName();
        Method enclosingMethod = cls.getEnclosingMethod();
        if (enclosingMethod != null) {
            return d53.w.c0(simpleName, enclosingMethod.getName() + '$', simpleName);
        }
        Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
        if (enclosingConstructor == null) {
            int iG = d53.w.G('$', 0, 6, simpleName);
            return iG == -1 ? simpleName : simpleName.substring(iG + 1, simpleName.length());
        }
        return d53.w.c0(simpleName, enclosingConstructor.getName() + '$', simpleName);
    }

    @Override // k23.d
    public final List<k23.p> b() {
        c();
        throw null;
    }

    @Override // k23.d
    public final boolean equals(Object obj) {
        return (obj instanceof h) && dh.b.v(this).equals(dh.b.v((d) obj));
    }

    @Override // p005kotlin.jvm.internal.v
    public final GenericDeclaration findJavaDeclaration() {
        return this.f105799a;
    }

    @Override // k23.d
    public final List<k23.q> getTypeParameters() {
        c();
        throw null;
    }

    @Override // k23.d
    public final int hashCode() {
        return dh.b.v(this).hashCode();
    }

    @Override // p005kotlin.jvm.internal.g
    public final Class<?> j() {
        return this.f105799a;
    }

    @Override // k23.d
    public final boolean k() {
        c();
        throw null;
    }

    @Override // k23.d
    public final boolean l() {
        c();
        throw null;
    }

    @Override // k23.d
    public final Collection<k23.g<Object>> n() {
        c();
        throw null;
    }

    @Override // k23.d
    public final Collection<d<?>> o() {
        c();
        throw null;
    }

    @Override // k23.d
    public final boolean q(Object obj) {
        f105797b.getClass();
        Map<Class<? extends o13.h<?>>, Integer> map = f105798c;
        map.getClass();
        Class<?> clsV = this.f105799a;
        Integer num = map.get(clsV);
        if (num != null) {
            return y0.f(num.intValue(), obj);
        }
        if (clsV.isPrimitive()) {
            clsV = dh.b.v(s0.f105811a.b(clsV));
        }
        return clsV.isInstance(obj);
    }

    @Override // k23.d
    public final Collection<k23.c<?>> s() {
        c();
        throw null;
    }

    public final String toString() {
        return this.f105799a.toString() + " (Kotlin reflection is not available)";
    }

    @Override // k23.d
    /* JADX INFO: renamed from: w */
    public final String getF16141b() {
        String strA;
        f105797b.getClass();
        Class<?> cls = this.f105799a;
        String strConcat = null;
        if (cls.isAnonymousClass() || cls.isLocalClass()) {
            return null;
        }
        if (!cls.isArray()) {
            String strA2 = a.a(cls.getName());
            return strA2 == null ? cls.getCanonicalName() : strA2;
        }
        Class<?> componentType = cls.getComponentType();
        if (componentType.isPrimitive() && (strA = a.a(componentType.getName())) != null) {
            strConcat = strA.concat("Array");
        }
        return strConcat == null ? "kotlin.Array" : strConcat;
    }

    @Override // k23.d
    public final boolean z() {
        c();
        throw null;
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R,\u0010\b\u001a\u001a\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005\u0012\u0004\u0012\u00020\u00070\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lkotlin/jvm/internal/h$a;", "", "<init>", "()V", "", "Ljava/lang/Class;", "Lo13/h;", "", "FUNCTION_CLASSES", "Ljava/util/Map;", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        /* JADX WARN: Failed to clean up code after switch over string restore
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 int, still in use, count: 3, list:
          (r0v0 int) from 0x0007: SWITCH (r0v0 int)
         case -1811142716: goto B:118:0x0130
         case -1811142715: goto B:113:0x0123
         case -1811142714: goto B:108:0x0116
         case -1811142713: goto B:103:0x0109
         case -1811142712: goto B:98:0x00fc
         case -1811142711: goto B:93:0x00ef
         case -1811142710: goto B:88:0x00e2
         case -1811142709: goto B:83:0x00d5
         case -1811142708: goto B:78:0x00c8
         case -1811142707: goto B:73:0x00bb
         default: goto B:5:0x000a A[RegionRef:SW:4]
          (r0v0 int) from 0x000a: SWITCH (r0v0 int)
         case -1811142685: goto B:68:0x00ae
         case -1811142684: goto B:63:0x00a1
         case -1811142683: goto B:58:0x0094
         default: goto B:6:0x000d A[RegionRef:SW:5]
          (r0v0 int) from 0x000d: SWITCH (r0v0 int)
         case 80123371: goto B:53:0x0087
         case 80123372: goto B:48:0x007a
         case 80123373: goto B:43:0x006d
         case 80123374: goto B:38:0x0060
         case 80123375: goto B:33:0x0053
         case 80123376: goto B:28:0x0046
         case 80123377: goto B:23:0x0039
         case 80123378: goto B:18:0x002c
         case 80123379: goto B:13:0x001f
         case 80123380: goto B:8:0x0012
         default: goto B:331:? A[RegionRef:SW:6]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:226)
        	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:215)
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.replaceWithMergedSwitch(SwitchOverStringVisitor.java:355)
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:111)
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:72)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:140)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:47)
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:66)
         */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public static String a(String str) {
            switch (str) {
                case "kotlin.jvm.internal.DoubleCompanionObject":
                    return "kotlin.Double.Companion";
                case "java.lang.Integer":
                    return "kotlin.Int";
                case "java.lang.Cloneable":
                    return "kotlin.Cloneable";
                case "java.lang.annotation.Annotation":
                    return "kotlin.Annotation";
                case "java.lang.Comparable":
                    return "kotlin.Comparable";
                case "java.util.Map":
                    return "kotlin.collections.Map";
                case "java.util.Set":
                    return "kotlin.collections.Set";
                case "double":
                    return "kotlin.Double";
                case "kotlin.jvm.internal.ByteCompanionObject":
                    return "kotlin.Byte.Companion";
                case "java.lang.CharSequence":
                    return "kotlin.CharSequence";
                case "java.util.Collection":
                    return "kotlin.collections.Collection";
                case "java.lang.Float":
                    return "kotlin.Float";
                case "java.lang.Short":
                    return "kotlin.Short";
                case "kotlin.jvm.internal.CharCompanionObject":
                    return "kotlin.Char.Companion";
                case "kotlin.jvm.internal.LongCompanionObject":
                    return "kotlin.Long.Companion";
                case "java.util.Map$Entry":
                    return "kotlin.collections.Map.Entry";
                case "int":
                    return "kotlin.Int";
                case "byte":
                    return "kotlin.Byte";
                case "char":
                    return "kotlin.Char";
                case "long":
                    return "kotlin.Long";
                case "boolean":
                    return "kotlin.Boolean";
                case "java.util.List":
                    return "kotlin.collections.List";
                case "kotlin.jvm.internal.ShortCompanionObject":
                    return "kotlin.Short.Companion";
                case "float":
                    return "kotlin.Float";
                case "short":
                    return "kotlin.Short";
                case "java.lang.Character":
                    return "kotlin.Char";
                case "kotlin.jvm.internal.EnumCompanionObject":
                    return "kotlin.Enum.Companion";
                case "java.lang.Boolean":
                    return "kotlin.Boolean";
                case "java.lang.Byte":
                    return "kotlin.Byte";
                case "java.lang.Enum":
                    return "kotlin.Enum";
                case "java.lang.Long":
                    return "kotlin.Long";
                case "kotlin.jvm.internal.FloatCompanionObject":
                    return "kotlin.Float.Companion";
                case "java.util.Iterator":
                    return "kotlin.collections.Iterator";
                case "java.util.ListIterator":
                    return "kotlin.collections.ListIterator";
                case "kotlin.jvm.internal.StringCompanionObject":
                    return "kotlin.String.Companion";
                case "java.lang.Double":
                    return "kotlin.Double";
                case "java.lang.Number":
                    return "kotlin.Number";
                case "java.lang.Object":
                    return "kotlin.Any";
                case "java.lang.String":
                    return "kotlin.String";
                case "java.lang.Iterable":
                    return "kotlin.collections.Iterable";
                case "kotlin.jvm.internal.BooleanCompanionObject":
                    return "kotlin.Boolean.Companion";
                case "java.lang.Throwable":
                    return "kotlin.Throwable";
                case "kotlin.jvm.internal.IntCompanionObject":
                    return "kotlin.Int.Companion";
                default:
                    switch (str) {
                        case -1811142716:
                            if (str.equals("kotlin.jvm.functions.Function10")) {
                                return "kotlin.Function10";
                            }
                            return null;
                        case -1811142715:
                            if (str.equals("kotlin.jvm.functions.Function11")) {
                                return "kotlin.Function11";
                            }
                            return null;
                        case -1811142714:
                            if (str.equals("kotlin.jvm.functions.Function12")) {
                                return "kotlin.Function12";
                            }
                            return null;
                        case -1811142713:
                            if (str.equals("kotlin.jvm.functions.Function13")) {
                                return "kotlin.Function13";
                            }
                            return null;
                        case -1811142712:
                            if (str.equals("kotlin.jvm.functions.Function14")) {
                                return "kotlin.Function14";
                            }
                            return null;
                        case -1811142711:
                            if (str.equals("kotlin.jvm.functions.Function15")) {
                                return "kotlin.Function15";
                            }
                            return null;
                        case -1811142710:
                            if (str.equals("kotlin.jvm.functions.Function16")) {
                                return "kotlin.Function16";
                            }
                            return null;
                        case -1811142709:
                            if (str.equals("kotlin.jvm.functions.Function17")) {
                                return "kotlin.Function17";
                            }
                            return null;
                        case -1811142708:
                            if (str.equals("kotlin.jvm.functions.Function18")) {
                                return "kotlin.Function18";
                            }
                            return null;
                        case -1811142707:
                            if (str.equals("kotlin.jvm.functions.Function19")) {
                                return "kotlin.Function19";
                            }
                            return null;
                        default:
                            switch (str) {
                                case -1811142685:
                                    if (str.equals("kotlin.jvm.functions.Function20")) {
                                        return "kotlin.Function20";
                                    }
                                    return null;
                                case -1811142684:
                                    if (str.equals("kotlin.jvm.functions.Function21")) {
                                        return "kotlin.Function21";
                                    }
                                    return null;
                                case -1811142683:
                                    if (str.equals("kotlin.jvm.functions.Function22")) {
                                        return "kotlin.Function22";
                                    }
                                    return null;
                                default:
                                    switch (str) {
                                        case 80123371:
                                            if (str.equals("kotlin.jvm.functions.Function0")) {
                                                return "kotlin.Function0";
                                            }
                                            return null;
                                        case 80123372:
                                            if (str.equals("kotlin.jvm.functions.Function1")) {
                                                return "kotlin.Function1";
                                            }
                                            return null;
                                        case 80123373:
                                            if (str.equals("kotlin.jvm.functions.Function2")) {
                                                return "kotlin.Function2";
                                            }
                                            return null;
                                        case 80123374:
                                            if (str.equals("kotlin.jvm.functions.Function3")) {
                                                return "kotlin.Function3";
                                            }
                                            return null;
                                        case 80123375:
                                            if (str.equals("kotlin.jvm.functions.Function4")) {
                                                return "kotlin.Function4";
                                            }
                                            return null;
                                        case 80123376:
                                            if (str.equals("kotlin.jvm.functions.Function5")) {
                                                return "kotlin.Function5";
                                            }
                                            return null;
                                        case 80123377:
                                            if (str.equals("kotlin.jvm.functions.Function6")) {
                                                return "kotlin.Function6";
                                            }
                                            return null;
                                        case 80123378:
                                            if (str.equals("kotlin.jvm.functions.Function7")) {
                                                return "kotlin.Function7";
                                            }
                                            return null;
                                        case 80123379:
                                            if (str.equals("kotlin.jvm.functions.Function8")) {
                                                return "kotlin.Function8";
                                            }
                                            return null;
                                        case 80123380:
                                            if (str.equals("kotlin.jvm.functions.Function9")) {
                                                return "kotlin.Function9";
                                            }
                                            return null;
                                        default:
                                            return null;
                                    }
                            }
                    }
            }
        }

        /* JADX WARN: Failed to clean up code after switch over string restore
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 int, still in use, count: 3, list:
          (r0v0 int) from 0x0007: SWITCH (r0v0 int)
         case -1811142716: goto B:118:0x0130
         case -1811142715: goto B:113:0x0123
         case -1811142714: goto B:108:0x0116
         case -1811142713: goto B:103:0x0109
         case -1811142712: goto B:98:0x00fc
         case -1811142711: goto B:93:0x00ef
         case -1811142710: goto B:88:0x00e2
         case -1811142709: goto B:83:0x00d5
         case -1811142708: goto B:78:0x00c8
         case -1811142707: goto B:73:0x00bb
         default: goto B:5:0x000a A[RegionRef:SW:4]
          (r0v0 int) from 0x000a: SWITCH (r0v0 int)
         case -1811142685: goto B:68:0x00ae
         case -1811142684: goto B:63:0x00a1
         case -1811142683: goto B:58:0x0094
         default: goto B:6:0x000d A[RegionRef:SW:5]
          (r0v0 int) from 0x000d: SWITCH (r0v0 int)
         case 80123371: goto B:53:0x0087
         case 80123372: goto B:48:0x007a
         case 80123373: goto B:43:0x006d
         case 80123374: goto B:38:0x0060
         case 80123375: goto B:33:0x0053
         case 80123376: goto B:28:0x0046
         case 80123377: goto B:23:0x0039
         case 80123378: goto B:18:0x002c
         case 80123379: goto B:13:0x001f
         case 80123380: goto B:8:0x0012
         default: goto B:313:? A[RegionRef:SW:6]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:226)
        	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:215)
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.replaceWithMergedSwitch(SwitchOverStringVisitor.java:355)
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:111)
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:72)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:140)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:47)
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:66)
         */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public static String b(String str) {
            switch (str) {
                case "kotlin.jvm.internal.DoubleCompanionObject":
                    return "Companion";
                case "java.lang.Integer":
                    return "Int";
                case "java.lang.Cloneable":
                    return "Cloneable";
                case "java.lang.annotation.Annotation":
                    return "Annotation";
                case "java.lang.Comparable":
                    return "Comparable";
                case "java.util.Map":
                    return "Map";
                case "java.util.Set":
                    return "Set";
                case "double":
                    return "Double";
                case "kotlin.jvm.internal.ByteCompanionObject":
                    return "Companion";
                case "java.lang.CharSequence":
                    return "CharSequence";
                case "java.util.Collection":
                    return "Collection";
                case "java.lang.Float":
                    return "Float";
                case "java.lang.Short":
                    return "Short";
                case "kotlin.jvm.internal.CharCompanionObject":
                    return "Companion";
                case "kotlin.jvm.internal.LongCompanionObject":
                    return "Companion";
                case "java.util.Map$Entry":
                    return "Entry";
                case "int":
                    return "Int";
                case "byte":
                    return "Byte";
                case "char":
                    return "Char";
                case "long":
                    return "Long";
                case "boolean":
                    return "Boolean";
                case "java.util.List":
                    return "List";
                case "kotlin.jvm.internal.ShortCompanionObject":
                    return "Companion";
                case "float":
                    return "Float";
                case "short":
                    return "Short";
                case "java.lang.Character":
                    return "Char";
                case "kotlin.jvm.internal.EnumCompanionObject":
                    return "Companion";
                case "java.lang.Boolean":
                    return "Boolean";
                case "java.lang.Byte":
                    return "Byte";
                case "java.lang.Enum":
                    return "Enum";
                case "java.lang.Long":
                    return "Long";
                case "kotlin.jvm.internal.FloatCompanionObject":
                    return "Companion";
                case "java.util.Iterator":
                    return "Iterator";
                case "java.util.ListIterator":
                    return "ListIterator";
                case "kotlin.jvm.internal.StringCompanionObject":
                    return "Companion";
                case "java.lang.Double":
                    return "Double";
                case "java.lang.Number":
                    return "Number";
                case "java.lang.Object":
                    return "Any";
                case "java.lang.String":
                    return "String";
                case "java.lang.Iterable":
                    return "Iterable";
                case "kotlin.jvm.internal.BooleanCompanionObject":
                    return "Companion";
                case "java.lang.Throwable":
                    return "Throwable";
                case "kotlin.jvm.internal.IntCompanionObject":
                    return "Companion";
                default:
                    switch (str) {
                        case -1811142716:
                            if (str.equals("kotlin.jvm.functions.Function10")) {
                                return "Function10";
                            }
                            return null;
                        case -1811142715:
                            if (str.equals("kotlin.jvm.functions.Function11")) {
                                return "Function11";
                            }
                            return null;
                        case -1811142714:
                            if (str.equals("kotlin.jvm.functions.Function12")) {
                                return "Function12";
                            }
                            return null;
                        case -1811142713:
                            if (str.equals("kotlin.jvm.functions.Function13")) {
                                return "Function13";
                            }
                            return null;
                        case -1811142712:
                            if (str.equals("kotlin.jvm.functions.Function14")) {
                                return "Function14";
                            }
                            return null;
                        case -1811142711:
                            if (str.equals("kotlin.jvm.functions.Function15")) {
                                return "Function15";
                            }
                            return null;
                        case -1811142710:
                            if (str.equals("kotlin.jvm.functions.Function16")) {
                                return "Function16";
                            }
                            return null;
                        case -1811142709:
                            if (str.equals("kotlin.jvm.functions.Function17")) {
                                return "Function17";
                            }
                            return null;
                        case -1811142708:
                            if (str.equals("kotlin.jvm.functions.Function18")) {
                                return "Function18";
                            }
                            return null;
                        case -1811142707:
                            if (str.equals("kotlin.jvm.functions.Function19")) {
                                return "Function19";
                            }
                            return null;
                        default:
                            switch (str) {
                                case -1811142685:
                                    if (str.equals("kotlin.jvm.functions.Function20")) {
                                        return "Function20";
                                    }
                                    return null;
                                case -1811142684:
                                    if (str.equals("kotlin.jvm.functions.Function21")) {
                                        return "Function21";
                                    }
                                    return null;
                                case -1811142683:
                                    if (str.equals("kotlin.jvm.functions.Function22")) {
                                        return "Function22";
                                    }
                                    return null;
                                default:
                                    switch (str) {
                                        case 80123371:
                                            if (str.equals("kotlin.jvm.functions.Function0")) {
                                                return "Function0";
                                            }
                                            return null;
                                        case 80123372:
                                            if (str.equals("kotlin.jvm.functions.Function1")) {
                                                return "Function1";
                                            }
                                            return null;
                                        case 80123373:
                                            if (str.equals("kotlin.jvm.functions.Function2")) {
                                                return "Function2";
                                            }
                                            return null;
                                        case 80123374:
                                            if (str.equals("kotlin.jvm.functions.Function3")) {
                                                return "Function3";
                                            }
                                            return null;
                                        case 80123375:
                                            if (str.equals("kotlin.jvm.functions.Function4")) {
                                                return "Function4";
                                            }
                                            return null;
                                        case 80123376:
                                            if (str.equals("kotlin.jvm.functions.Function5")) {
                                                return "Function5";
                                            }
                                            return null;
                                        case 80123377:
                                            if (str.equals("kotlin.jvm.functions.Function6")) {
                                                return "Function6";
                                            }
                                            return null;
                                        case 80123378:
                                            if (str.equals("kotlin.jvm.functions.Function7")) {
                                                return "Function7";
                                            }
                                            return null;
                                        case 80123379:
                                            if (str.equals("kotlin.jvm.functions.Function8")) {
                                                return "Function8";
                                            }
                                            return null;
                                        case 80123380:
                                            if (str.equals("kotlin.jvm.functions.Function9")) {
                                                return "Function9";
                                            }
                                            return null;
                                        default:
                                            return null;
                                    }
                            }
                    }
            }
        }

        private a() {
        }
    }
}
