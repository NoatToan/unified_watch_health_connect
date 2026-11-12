package org.apache.commons.lang.p007enum;

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

    @Override // org.apache.commons.lang.p007enum.Enum, java.lang.Comparable
    public int compareTo(Object obj) {
        return this.g - ((ValuedEnum) obj).g;
    }

    public final int getValue() {
        return this.g;
    }

    @Override // org.apache.commons.lang.p007enum.Enum
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
