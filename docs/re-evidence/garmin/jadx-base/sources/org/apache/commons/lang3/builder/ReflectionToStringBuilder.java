package org.apache.commons.lang3.builder;

import com.google.android.material.color.utilities.f;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import org.apache.commons.lang3.ArraySorter;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.Validate;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
public class ReflectionToStringBuilder extends ToStringBuilder {
    private boolean appendStatics;
    private boolean appendTransients;
    protected String[] excludeFieldNames;
    private boolean excludeNullValues;
    private Class<?> upToClass;

    public <T> ReflectionToStringBuilder(T t7, ToStringStyle toStringStyle, StringBuffer stringBuffer, Class<? super T> cls, boolean z14, boolean z15, boolean z16) {
        super(checkNotNull(t7), toStringStyle, stringBuffer);
        setUpToClass(cls);
        setAppendTransients(z14);
        setAppendStatics(z15);
        setExcludeNullValues(z16);
    }

    private static Object checkNotNull(Object obj) {
        return Validate.notNull(obj, "obj", new Object[0]);
    }

    public static String[] toNoNullStringArray(Object[] objArr) {
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj.toString());
            }
        }
        return (String[]) arrayList.toArray(ArrayUtils.EMPTY_STRING_ARRAY);
    }

    public static String toStringExclude(Object obj, String... strArr) {
        return new ReflectionToStringBuilder(obj).setExcludeFieldNames(strArr).toString();
    }

    public boolean accept(Field field) {
        if (field.getName().indexOf(36) != -1) {
            return false;
        }
        if (Modifier.isTransient(field.getModifiers()) && !isAppendTransients()) {
            return false;
        }
        if (Modifier.isStatic(field.getModifiers()) && !isAppendStatics()) {
            return false;
        }
        String[] strArr = this.excludeFieldNames;
        if (strArr == null || Arrays.binarySearch(strArr, field.getName()) < 0) {
            return !field.isAnnotationPresent(ToStringExclude.class);
        }
        return false;
    }

    public void appendFieldsIn(Class<?> cls) {
        if (cls.isArray()) {
            reflectionAppendArray(getObject());
            return;
        }
        Field[] fieldArr = (Field[]) ArraySorter.sort(cls.getDeclaredFields(), Comparator.comparing(new f(6)));
        AccessibleObject.setAccessible(fieldArr, true);
        for (Field field : fieldArr) {
            String name = field.getName();
            if (accept(field)) {
                try {
                    Object value = getValue(field);
                    if (!this.excludeNullValues || value != null) {
                        append(name, value, !field.isAnnotationPresent(ToStringSummary.class));
                    }
                } catch (IllegalAccessException e4) {
                    throw new InternalError("Unexpected IllegalAccessException: " + e4.getMessage());
                }
            }
        }
    }

    public String[] getExcludeFieldNames() {
        return (String[]) this.excludeFieldNames.clone();
    }

    public Class<?> getUpToClass() {
        return this.upToClass;
    }

    public Object getValue(Field field) {
        return field.get(getObject());
    }

    public boolean isAppendStatics() {
        return this.appendStatics;
    }

    public boolean isAppendTransients() {
        return this.appendTransients;
    }

    public boolean isExcludeNullValues() {
        return this.excludeNullValues;
    }

    public ReflectionToStringBuilder reflectionAppendArray(Object obj) {
        getStyle().reflectionAppendArrayDetail(getStringBuffer(), null, obj);
        return this;
    }

    public void setAppendStatics(boolean z14) {
        this.appendStatics = z14;
    }

    public void setAppendTransients(boolean z14) {
        this.appendTransients = z14;
    }

    public ReflectionToStringBuilder setExcludeFieldNames(String... strArr) {
        if (strArr == null) {
            this.excludeFieldNames = null;
            return this;
        }
        this.excludeFieldNames = (String[]) ArraySorter.sort(toNoNullStringArray(strArr));
        return this;
    }

    public void setExcludeNullValues(boolean z14) {
        this.excludeNullValues = z14;
    }

    public void setUpToClass(Class<?> cls) {
        Object object;
        if (cls == null || (object = getObject()) == null || cls.isInstance(object)) {
            this.upToClass = cls;
        } else {
            h.s("Specified class is not a superclass of the object");
        }
    }

    @Override // org.apache.commons.lang3.builder.ToStringBuilder
    public String toString() {
        if (getObject() == null) {
            return getStyle().getNullText();
        }
        Class<?> superclass = getObject().getClass();
        appendFieldsIn(superclass);
        while (superclass.getSuperclass() != null && superclass != getUpToClass()) {
            superclass = superclass.getSuperclass();
            appendFieldsIn(superclass);
        }
        return super.toString();
    }

    public static String toStringExclude(Object obj, Collection<String> collection) {
        return toStringExclude(obj, toNoNullStringArray(collection));
    }

    public ReflectionToStringBuilder(Object obj, ToStringStyle toStringStyle) {
        super(checkNotNull(obj), toStringStyle);
    }

    public ReflectionToStringBuilder(Object obj, ToStringStyle toStringStyle, StringBuffer stringBuffer) {
        super(checkNotNull(obj), toStringStyle, stringBuffer);
    }

    public <T> ReflectionToStringBuilder(T t7, ToStringStyle toStringStyle, StringBuffer stringBuffer, Class<? super T> cls, boolean z14, boolean z15) {
        super(checkNotNull(t7), toStringStyle, stringBuffer);
        setUpToClass(cls);
        setAppendTransients(z14);
        setAppendStatics(z15);
    }

    public ReflectionToStringBuilder(Object obj) {
        super(checkNotNull(obj));
    }

    public static String[] toNoNullStringArray(Collection<String> collection) {
        if (collection == null) {
            return ArrayUtils.EMPTY_STRING_ARRAY;
        }
        return toNoNullStringArray(collection.toArray());
    }

    public static String toString(Object obj, ToStringStyle toStringStyle) {
        return toString(obj, toStringStyle, false, false, null);
    }

    public static String toString(Object obj, ToStringStyle toStringStyle, boolean z14) {
        return toString(obj, toStringStyle, z14, false, null);
    }

    public static String toString(Object obj, ToStringStyle toStringStyle, boolean z14, boolean z15) {
        return toString(obj, toStringStyle, z14, z15, null);
    }

    public static <T> String toString(T t7, ToStringStyle toStringStyle, boolean z14, boolean z15, Class<? super T> cls) {
        return new ReflectionToStringBuilder(t7, toStringStyle, null, cls, z14, z15).toString();
    }

    public static <T> String toString(T t7, ToStringStyle toStringStyle, boolean z14, boolean z15, boolean z16, Class<? super T> cls) {
        return new ReflectionToStringBuilder(t7, toStringStyle, null, cls, z14, z15, z16).toString();
    }

    public static String toString(Object obj) {
        return toString(obj, null, false, false, null);
    }
}
