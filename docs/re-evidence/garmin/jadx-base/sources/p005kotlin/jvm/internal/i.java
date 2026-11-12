package p005kotlin.jvm.internal;

import com.google.protobuf.a;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import o13.e;
import org.apache.commons.io.IOUtils;

/* JADX INFO: loaded from: classes3.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object[] f105800a = new Object[0];

    public static final void a(StringBuilder sb3, Class cls) {
        while (cls.isArray()) {
            sb3.append("[");
            cls = cls.getComponentType();
            cls.getClass();
        }
        if (cls.equals(Void.TYPE)) {
            sb3.append("V");
            return;
        }
        if (cls.equals(Integer.TYPE)) {
            sb3.append("I");
            return;
        }
        if (cls.equals(Long.TYPE)) {
            sb3.append("J");
            return;
        }
        if (cls.equals(Short.TYPE)) {
            sb3.append("S");
            return;
        }
        if (cls.equals(Byte.TYPE)) {
            sb3.append("B");
            return;
        }
        if (cls.equals(Boolean.TYPE)) {
            sb3.append("Z");
            return;
        }
        if (cls.equals(Character.TYPE)) {
            sb3.append("C");
            return;
        }
        if (cls.equals(Float.TYPE)) {
            sb3.append("F");
            return;
        }
        if (cls.equals(Double.TYPE)) {
            sb3.append("D");
            return;
        }
        sb3.append("L");
        String strReplace = cls.getName().replace('.', IOUtils.DIR_SEPARATOR_UNIX);
        strReplace.getClass();
        sb3.append((CharSequence) strReplace);
        sb3.append(";");
    }

    public static final b b(Object[] objArr) {
        objArr.getClass();
        return new b(objArr);
    }

    @e
    public static final Object[] c(Collection collection) {
        collection.getClass();
        int size = collection.size();
        Object[] objArr = f105800a;
        if (size == 0) {
            return objArr;
        }
        Iterator it = collection.iterator();
        if (!it.hasNext()) {
            return objArr;
        }
        Object[] objArrCopyOf = new Object[size];
        int i14 = 0;
        while (true) {
            int i15 = i14 + 1;
            objArrCopyOf[i14] = it.next();
            if (i15 >= objArrCopyOf.length) {
                if (!it.hasNext()) {
                    return objArrCopyOf;
                }
                int i16 = ((i15 * 3) + 1) >>> 1;
                if (i16 <= i15) {
                    i16 = 2147483645;
                    if (i15 >= 2147483645) {
                        a.b();
                        return null;
                    }
                }
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i16);
            } else if (!it.hasNext()) {
                return Arrays.copyOf(objArrCopyOf, i15);
            }
            i14 = i15;
        }
    }

    @e
    public static final Object[] d(Collection collection, Object[] objArr) {
        Object[] objArrCopyOf;
        collection.getClass();
        objArr.getClass();
        int size = collection.size();
        int i14 = 0;
        if (size != 0) {
            Iterator it = collection.iterator();
            if (it.hasNext()) {
                if (size <= objArr.length) {
                    objArrCopyOf = objArr;
                } else {
                    Object objNewInstance = Array.newInstance(objArr.getClass().getComponentType(), size);
                    objNewInstance.getClass();
                    objArrCopyOf = (Object[]) objNewInstance;
                }
                while (true) {
                    int i15 = i14 + 1;
                    objArrCopyOf[i14] = it.next();
                    if (i15 >= objArrCopyOf.length) {
                        if (!it.hasNext()) {
                            return objArrCopyOf;
                        }
                        int i16 = ((i15 * 3) + 1) >>> 1;
                        if (i16 <= i15) {
                            i16 = 2147483645;
                            if (i15 >= 2147483645) {
                                a.b();
                                return null;
                            }
                        }
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, i16);
                    } else if (!it.hasNext()) {
                        if (objArrCopyOf != objArr) {
                            return Arrays.copyOf(objArrCopyOf, i15);
                        }
                        objArr[i15] = null;
                        return objArr;
                    }
                    i14 = i15;
                }
            } else if (objArr.length > 0) {
                objArr[0] = null;
            }
        } else if (objArr.length > 0) {
            objArr[0] = null;
            return objArr;
        }
        return objArr;
    }
}
