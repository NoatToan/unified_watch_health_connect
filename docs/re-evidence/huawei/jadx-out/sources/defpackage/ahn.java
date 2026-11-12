package defpackage;

import com.fasterxml.jackson.databind.JavaType;
import com.huawei.hihealth.HiDataFilter;
import com.huawei.operation.utils.Constants;
import java.io.Serializable;
import java.lang.reflect.TypeVariable;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes21.dex */
public class ahn implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String[] f413b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final JavaType[] f414c;
    private static final ahn e;
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f415a;
    private final String[] d;
    private final JavaType[] g;
    private final String[] h;

    static {
        String[] strArr = new String[0];
        f413b = strArr;
        JavaType[] javaTypeArr = new JavaType[0];
        f414c = javaTypeArr;
        e = new ahn(strArr, javaTypeArr, null);
    }

    private ahn(String[] strArr, JavaType[] javaTypeArr, String[] strArr2) {
        strArr = strArr == null ? f413b : strArr;
        this.d = strArr;
        javaTypeArr = javaTypeArr == null ? f414c : javaTypeArr;
        this.g = javaTypeArr;
        if (strArr.length != javaTypeArr.length) {
            throw new IllegalArgumentException("Mismatching names (" + strArr.length + "), types (" + javaTypeArr.length + Constants.RIGHT_BRACKET_ONLY);
        }
        int length = javaTypeArr.length;
        int iHashCode = 1;
        for (int i = 0; i < length; i++) {
            iHashCode += this.g[i].hashCode();
        }
        this.h = strArr2;
        this.f415a = iHashCode;
    }

    public static ahn e() {
        return e;
    }

    protected Object readResolve() {
        String[] strArr = this.d;
        return (strArr == null || strArr.length == 0) ? e : this;
    }

    public static ahn c(Class<?> cls, List<JavaType> list) {
        return a(cls, (list == null || list.isEmpty()) ? f414c : (JavaType[]) list.toArray(f414c));
    }

    public static ahn a(Class<?> cls, JavaType[] javaTypeArr) {
        String[] strArr;
        if (javaTypeArr == null) {
            javaTypeArr = f414c;
        } else {
            int length = javaTypeArr.length;
            if (length == 1) {
                return a(cls, javaTypeArr[0]);
            }
            if (length == 2) {
                return b(cls, javaTypeArr[0], javaTypeArr[1]);
            }
        }
        TypeVariable<Class<?>>[] typeParameters = cls.getTypeParameters();
        if (typeParameters == null || typeParameters.length == 0) {
            strArr = f413b;
        } else {
            int length2 = typeParameters.length;
            strArr = new String[length2];
            for (int i = 0; i < length2; i++) {
                strArr[i] = typeParameters[i].getName();
            }
        }
        if (strArr.length != javaTypeArr.length) {
            StringBuilder sb = new StringBuilder("Cannot create TypeBindings for class ");
            sb.append(cls.getName());
            sb.append(" with ");
            sb.append(javaTypeArr.length);
            sb.append(" type parameter");
            sb.append(javaTypeArr.length == 1 ? "" : "s");
            sb.append(": class expects ");
            sb.append(strArr.length);
            throw new IllegalArgumentException(sb.toString());
        }
        return new ahn(strArr, javaTypeArr, null);
    }

    public static ahn a(Class<?> cls, JavaType javaType) {
        TypeVariable<?>[] typeVariableArrA = d.a(cls);
        int length = typeVariableArrA == null ? 0 : typeVariableArrA.length;
        if (length != 1) {
            throw new IllegalArgumentException("Cannot create TypeBindings for class " + cls.getName() + " with 1 type parameter: class expects " + length);
        }
        return new ahn(new String[]{typeVariableArrA[0].getName()}, new JavaType[]{javaType}, null);
    }

    public static ahn b(Class<?> cls, JavaType javaType, JavaType javaType2) {
        TypeVariable<?>[] typeVariableArrE = d.e(cls);
        int length = typeVariableArrE == null ? 0 : typeVariableArrE.length;
        if (length != 2) {
            throw new IllegalArgumentException("Cannot create TypeBindings for class " + cls.getName() + " with 2 type parameters: class expects " + length);
        }
        return new ahn(new String[]{typeVariableArrE[0].getName(), typeVariableArrE[1].getName()}, new JavaType[]{javaType, javaType2}, null);
    }

    public static ahn b(List<String> list, List<JavaType> list2) {
        if (list == null || list.isEmpty() || list2 == null || list2.isEmpty()) {
            return e;
        }
        return new ahn((String[]) list.toArray(f413b), (JavaType[]) list2.toArray(f414c), null);
    }

    public static ahn d(Class<?> cls, JavaType javaType) {
        TypeVariable<Class<?>>[] typeParameters = cls.getTypeParameters();
        int length = typeParameters == null ? 0 : typeParameters.length;
        if (length == 0) {
            return e;
        }
        if (length != 1) {
            throw new IllegalArgumentException("Cannot create TypeBindings for class " + cls.getName() + " with 1 type parameter: class expects " + length);
        }
        return new ahn(new String[]{typeParameters[0].getName()}, new JavaType[]{javaType}, null);
    }

    public static ahn b(Class<?> cls, JavaType[] javaTypeArr) {
        TypeVariable<Class<?>>[] typeParameters = cls.getTypeParameters();
        if (typeParameters == null || typeParameters.length == 0) {
            return e;
        }
        if (javaTypeArr == null) {
            javaTypeArr = f414c;
        }
        int length = typeParameters.length;
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            strArr[i] = typeParameters[i].getName();
        }
        if (length != javaTypeArr.length) {
            StringBuilder sb = new StringBuilder("Cannot create TypeBindings for class ");
            sb.append(cls.getName());
            sb.append(" with ");
            sb.append(javaTypeArr.length);
            sb.append(" type parameter");
            sb.append(javaTypeArr.length == 1 ? "" : "s");
            sb.append(": class expects ");
            sb.append(length);
            throw new IllegalArgumentException(sb.toString());
        }
        return new ahn(strArr, javaTypeArr, null);
    }

    public ahn b(String str) {
        String[] strArr = this.h;
        int length = strArr == null ? 0 : strArr.length;
        String[] strArr2 = length == 0 ? new String[1] : (String[]) Arrays.copyOf(strArr, length + 1);
        strArr2[length] = str;
        return new ahn(this.d, this.g, strArr2);
    }

    public JavaType d(String str) {
        JavaType javaTypeA;
        int length = this.d.length;
        for (int i = 0; i < length; i++) {
            if (str.equals(this.d[i])) {
                JavaType javaType = this.g[i];
                return (!(javaType instanceof aho) || (javaTypeA = ((aho) javaType).a()) == null) ? javaType : javaTypeA;
            }
        }
        return null;
    }

    public boolean a() {
        return this.g.length == 0;
    }

    public int c() {
        return this.g.length;
    }

    public String c(int i) {
        if (i < 0) {
            return null;
        }
        String[] strArr = this.d;
        if (i >= strArr.length) {
            return null;
        }
        return strArr[i];
    }

    public JavaType e(int i) {
        if (i < 0) {
            return null;
        }
        JavaType[] javaTypeArr = this.g;
        if (i >= javaTypeArr.length) {
            return null;
        }
        return javaTypeArr[i];
    }

    public List<JavaType> b() {
        JavaType[] javaTypeArr = this.g;
        if (javaTypeArr.length == 0) {
            return Collections.EMPTY_LIST;
        }
        return Arrays.asList(javaTypeArr);
    }

    public boolean e(String str) {
        String[] strArr = this.h;
        if (strArr == null) {
            return false;
        }
        int length = strArr.length;
        do {
            length--;
            if (length < 0) {
                return false;
            }
        } while (!str.equals(this.h[length]));
        return true;
    }

    public Object e(Class<?> cls) {
        return new a(cls, this.g, this.f415a);
    }

    public String toString() {
        if (this.g.length == 0) {
            return "<>";
        }
        StringBuilder sb = new StringBuilder(HiDataFilter.DataFilterExpression.LESS_THAN);
        int length = this.g.length;
        for (int i = 0; i < length; i++) {
            if (i > 0) {
                sb.append(',');
            }
            sb.append(this.g[i].getGenericSignature());
        }
        sb.append('>');
        return sb.toString();
    }

    public int hashCode() {
        return this.f415a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!ahw.e(obj, getClass())) {
            return false;
        }
        ahn ahnVar = (ahn) obj;
        int length = this.g.length;
        if (length != ahnVar.c()) {
            return false;
        }
        JavaType[] javaTypeArr = ahnVar.g;
        for (int i = 0; i < length; i++) {
            if (!javaTypeArr[i].equals(this.g[i])) {
                return false;
            }
        }
        return true;
    }

    public JavaType[] d() {
        return this.g;
    }

    static class d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final TypeVariable<?>[] f420c = AbstractList.class.getTypeParameters();
        private static final TypeVariable<?>[] d = Collection.class.getTypeParameters();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final TypeVariable<?>[] f418a = Iterable.class.getTypeParameters();
        private static final TypeVariable<?>[] h = List.class.getTypeParameters();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final TypeVariable<?>[] f419b = ArrayList.class.getTypeParameters();
        private static final TypeVariable<?>[] f = Map.class.getTypeParameters();
        private static final TypeVariable<?>[] e = HashMap.class.getTypeParameters();
        private static final TypeVariable<?>[] g = LinkedHashMap.class.getTypeParameters();

        d() {
        }

        public static TypeVariable<?>[] a(Class<?> cls) {
            if (cls == Collection.class) {
                return d;
            }
            if (cls == List.class) {
                return h;
            }
            if (cls == ArrayList.class) {
                return f419b;
            }
            if (cls == AbstractList.class) {
                return f420c;
            }
            if (cls == Iterable.class) {
                return f418a;
            }
            return cls.getTypeParameters();
        }

        public static TypeVariable<?>[] e(Class<?> cls) {
            if (cls == Map.class) {
                return f;
            }
            if (cls == HashMap.class) {
                return e;
            }
            if (cls == LinkedHashMap.class) {
                return g;
            }
            return cls.getTypeParameters();
        }
    }

    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Class<?> f416a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f417b;
        private final JavaType[] e;

        public a(Class<?> cls, JavaType[] javaTypeArr, int i) {
            this.f416a = cls;
            this.e = javaTypeArr;
            this.f417b = i;
        }

        public int hashCode() {
            return this.f417b;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj == null || obj.getClass() != getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f417b == aVar.f417b && this.f416a == aVar.f416a) {
                JavaType[] javaTypeArr = aVar.e;
                int length = this.e.length;
                if (length == javaTypeArr.length) {
                    for (int i = 0; i < length; i++) {
                        if (!this.e[i].equals(javaTypeArr[i])) {
                            return false;
                        }
                    }
                    return true;
                }
            }
            return false;
        }

        public String toString() {
            return this.f416a.getName() + "<>";
        }
    }
}
