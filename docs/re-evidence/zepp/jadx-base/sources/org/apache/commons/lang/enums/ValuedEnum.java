package org.apache.commons.lang.enums;

import java.lang.reflect.InvocationTargetException;
import org.apache.commons.lang.ClassUtils;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;

/* JADX INFO: loaded from: classes23.dex */
public abstract class ValuedEnum extends Enum {
    private static final long serialVersionUID = -7129650521543789085L;
    private final int g;

    public ValuedEnum(String str, int i) {
        super(str);
        this.g = i;
    }

    private int g(Object obj) {
        try {
            return ((Integer) obj.getClass().getMethod("getValue", null).invoke(obj, null)).intValue();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            throw new IllegalStateException("This should not happen");
        }
    }

    public static Enum getEnum(Class cls, int i) {
        if (cls == null) {
            throw new IllegalArgumentException("The Enum Class must not be null");
        }
        for (ValuedEnum valuedEnum : Enum.getEnumList(cls)) {
            if (valuedEnum.getValue() == i) {
                return valuedEnum;
            }
        }
        return null;
    }

    @Override // org.apache.commons.lang.enums.Enum, java.lang.Comparable
    public int compareTo(Object obj) {
        int i;
        int iG;
        if (obj == this) {
            return 0;
        }
        if (obj.getClass() == getClass()) {
            i = this.g;
            iG = ((ValuedEnum) obj).g;
        } else {
            if (!obj.getClass().getName().equals(getClass().getName())) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("Different enum class '");
                stringBuffer.append(ClassUtils.getShortClassName(obj.getClass()));
                stringBuffer.append("'");
                throw new ClassCastException(stringBuffer.toString());
            }
            i = this.g;
            iG = g(obj);
        }
        return i - iG;
    }

    public final int getValue() {
        return this.g;
    }

    @Override // org.apache.commons.lang.enums.Enum
    public String toString() {
        if (this.iToString == null) {
            String shortClassName = ClassUtils.getShortClassName(getEnumClass());
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(shortClassName);
            stringBuffer.append("[");
            stringBuffer.append(getName());
            stringBuffer.append(SearchCriteria.EQ);
            stringBuffer.append(getValue());
            stringBuffer.append("]");
            this.iToString = stringBuffer.toString();
        }
        return this.iToString;
    }
}
