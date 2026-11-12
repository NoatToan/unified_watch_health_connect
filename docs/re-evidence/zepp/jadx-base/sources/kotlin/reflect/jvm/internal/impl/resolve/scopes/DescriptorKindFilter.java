package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes23.dex */
public final class DescriptorKindFilter {

    @JvmField
    @NotNull
    public static final DescriptorKindFilter ALL;

    @JvmField
    @NotNull
    public static final DescriptorKindFilter CALLABLES;

    @JvmField
    @NotNull
    public static final DescriptorKindFilter CLASSIFIERS;

    @NotNull
    public static final Companion Companion;

    @JvmField
    @NotNull
    public static final DescriptorKindFilter FUNCTIONS;

    @JvmField
    @NotNull
    public static final DescriptorKindFilter NON_SINGLETON_CLASSIFIERS;

    @JvmField
    @NotNull
    public static final DescriptorKindFilter PACKAGES;

    @JvmField
    @NotNull
    public static final DescriptorKindFilter SINGLETON_CLASSIFIERS;

    @JvmField
    @NotNull
    public static final DescriptorKindFilter TYPE_ALIASES;

    @JvmField
    @NotNull
    public static final DescriptorKindFilter VALUES;

    @JvmField
    @NotNull
    public static final DescriptorKindFilter VARIABLES;
    private static int c;
    private static final int d;
    private static final int e;
    private static final int f;
    private static final int g;
    private static final int h;
    private static final int i;
    private static final int j;
    private static final int k;
    private static final int l;
    private static final int m;

    @NotNull
    private static final List<Companion.a> n;

    @NotNull
    private static final List<Companion.a> o;

    @NotNull
    private final List<DescriptorKindExclude> a;
    private final int b;

    public static final class Companion {

        public static final class a {
            private final int a;

            @NotNull
            private final String b;

            public a(int i, @NotNull String str) {
                this.a = i;
                this.b = str;
            }

            public final int a() {
                return this.a;
            }

            @NotNull
            public final String b() {
                return this.b;
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int a() {
            int i = DescriptorKindFilter.c;
            Companion companion = DescriptorKindFilter.Companion;
            DescriptorKindFilter.c <<= 1;
            return i;
        }

        public final int getALL_KINDS_MASK() {
            return DescriptorKindFilter.j;
        }

        public final int getCLASSIFIERS_MASK() {
            return DescriptorKindFilter.k;
        }

        public final int getFUNCTIONS_MASK() {
            return DescriptorKindFilter.h;
        }

        public final int getNON_SINGLETON_CLASSIFIERS_MASK() {
            return DescriptorKindFilter.d;
        }

        public final int getPACKAGES_MASK() {
            return DescriptorKindFilter.g;
        }

        public final int getSINGLETON_CLASSIFIERS_MASK() {
            return DescriptorKindFilter.e;
        }

        public final int getTYPE_ALIASES_MASK() {
            return DescriptorKindFilter.f;
        }

        public final int getVARIABLES_MASK() {
            return DescriptorKindFilter.i;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Companion companion = new Companion(null);
        Companion = companion;
        c = 1;
        int iA = companion.a();
        d = iA;
        int iA2 = companion.a();
        e = iA2;
        int iA3 = companion.a();
        f = iA3;
        int iA4 = companion.a();
        g = iA4;
        int iA5 = companion.a();
        h = iA5;
        int iA6 = companion.a();
        i = iA6;
        int iA7 = companion.a() - 1;
        j = iA7;
        int i2 = iA | iA2 | iA3;
        k = i2;
        int i3 = iA2 | iA5 | iA6;
        l = i3;
        int i4 = iA5 | iA6;
        m = i4;
        int i5 = 2;
        ALL = new DescriptorKindFilter(iA7, 0 == true ? 1 : 0, i5, 0 == true ? 1 : 0);
        CALLABLES = new DescriptorKindFilter(i4, 0 == true ? 1 : 0, i5, 0 == true ? 1 : 0);
        NON_SINGLETON_CLASSIFIERS = new DescriptorKindFilter(iA, 0 == true ? 1 : 0, i5, 0 == true ? 1 : 0);
        SINGLETON_CLASSIFIERS = new DescriptorKindFilter(iA2, 0 == true ? 1 : 0, i5, 0 == true ? 1 : 0);
        TYPE_ALIASES = new DescriptorKindFilter(iA3, 0 == true ? 1 : 0, i5, 0 == true ? 1 : 0);
        CLASSIFIERS = new DescriptorKindFilter(i2, 0 == true ? 1 : 0, i5, 0 == true ? 1 : 0);
        PACKAGES = new DescriptorKindFilter(iA4, 0 == true ? 1 : 0, i5, 0 == true ? 1 : 0);
        FUNCTIONS = new DescriptorKindFilter(iA5, 0 == true ? 1 : 0, i5, 0 == true ? 1 : 0);
        VARIABLES = new DescriptorKindFilter(iA6, 0 == true ? 1 : 0, i5, 0 == true ? 1 : 0);
        VALUES = new DescriptorKindFilter(i3, 0 == true ? 1 : 0, i5, 0 == true ? 1 : 0);
        Field[] fields = DescriptorKindFilter.class.getFields();
        ArrayList<Field> arrayList = new ArrayList();
        for (Field field : fields) {
            if (Modifier.isStatic(field.getModifiers())) {
                arrayList.add(field);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Field field2 : arrayList) {
            Object obj = field2.get(null);
            DescriptorKindFilter descriptorKindFilter = obj instanceof DescriptorKindFilter ? (DescriptorKindFilter) obj : null;
            Companion.a aVar = descriptorKindFilter != null ? new Companion.a(descriptorKindFilter.getKindMask(), field2.getName()) : null;
            if (aVar != null) {
                arrayList2.add(aVar);
            }
        }
        n = arrayList2;
        Field[] fields2 = DescriptorKindFilter.class.getFields();
        ArrayList arrayList3 = new ArrayList();
        for (Field field3 : fields2) {
            if (Modifier.isStatic(field3.getModifiers())) {
                arrayList3.add(field3);
            }
        }
        ArrayList<Field> arrayList4 = new ArrayList();
        for (Object obj2 : arrayList3) {
            if (Intrinsics.areEqual(((Field) obj2).getType(), Integer.TYPE)) {
                arrayList4.add(obj2);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        for (Field field4 : arrayList4) {
            Object obj3 = field4.get(null);
            Objects.requireNonNull(obj3, "null cannot be cast to non-null type kotlin.Int");
            int iIntValue = ((Integer) obj3).intValue();
            Companion.a aVar2 = iIntValue == ((-iIntValue) & iIntValue) ? new Companion.a(iIntValue, field4.getName()) : null;
            if (aVar2 != null) {
                arrayList5.add(aVar2);
            }
        }
        o = arrayList5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DescriptorKindFilter(int i2, @NotNull List<? extends DescriptorKindExclude> list) {
        this.a = list;
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            i2 &= ~((DescriptorKindExclude) it2.next()).getFullyExcludedDescriptorKinds();
        }
        this.b = i2;
    }

    public final boolean acceptsKinds(int i2) {
        return (i2 & this.b) != 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(DescriptorKindFilter.class, obj == null ? null : obj.getClass())) {
            return false;
        }
        Objects.requireNonNull(obj, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter");
        DescriptorKindFilter descriptorKindFilter = (DescriptorKindFilter) obj;
        return Intrinsics.areEqual(this.a, descriptorKindFilter.a) && this.b == descriptorKindFilter.b;
    }

    @NotNull
    public final List<DescriptorKindExclude> getExcludes() {
        return this.a;
    }

    public final int getKindMask() {
        return this.b;
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    @Nullable
    public final DescriptorKindFilter restrictedToKindsOrNull(int i2) {
        int i3 = i2 & this.b;
        if (i3 == 0) {
            return null;
        }
        return new DescriptorKindFilter(i3, this.a);
    }

    @NotNull
    public String toString() {
        Object next;
        Iterator<T> it2 = n.iterator();
        do {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
        } while (!(((Companion.a) next).a() == getKindMask()));
        Companion.a aVar = (Companion.a) next;
        String strB = aVar == null ? null : aVar.b();
        if (strB == null) {
            List<Companion.a> list = o;
            ArrayList arrayList = new ArrayList();
            for (Companion.a aVar2 : list) {
                String strB2 = acceptsKinds(aVar2.a()) ? aVar2.b() : null;
                if (strB2 != null) {
                    arrayList.add(strB2);
                }
            }
            strB = CollectionsKt___CollectionsKt.joinToString$default(arrayList, " | ", null, null, 0, null, null, 62, null);
        }
        return "DescriptorKindFilter(" + strB + ", " + this.a + ')';
    }

    public /* synthetic */ DescriptorKindFilter(int i2, List list, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, (i3 & 2) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list);
    }
}
