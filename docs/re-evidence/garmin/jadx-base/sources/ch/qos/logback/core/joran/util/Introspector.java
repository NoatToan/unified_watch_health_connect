package ch.qos.logback.core.joran.util;

import i3.e5;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: loaded from: classes7.dex */
public class Introspector {
    public static String decapitalize(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }
        String lowerCase = str.substring(0, 1).toLowerCase(Locale.US);
        if (str.length() <= 1) {
            return lowerCase;
        }
        StringBuilder sbK = e5.k(lowerCase);
        sbK.append(str.substring(1));
        return sbK.toString();
    }

    public static MethodDescriptor[] getMethodDescriptors(Class<?> cls) {
        ArrayList arrayList = new ArrayList();
        for (Method method : cls.getMethods()) {
            arrayList.add(new MethodDescriptor(method.getName(), method));
        }
        return (MethodDescriptor[]) arrayList.toArray(new MethodDescriptor[0]);
    }

    public static PropertyDescriptor[] getPropertyDescriptors(Class<?> cls) {
        Class<?> returnType;
        HashMap map = new HashMap();
        for (Method method : cls.getMethods()) {
            String name = method.getName();
            boolean z14 = name.startsWith("get") && name.length() > 3;
            boolean z15 = name.startsWith("set") && name.length() > 3;
            if (z14 || z15) {
                String strDecapitalize = decapitalize(name.substring(3));
                PropertyDescriptor propertyDescriptor = (PropertyDescriptor) map.get(strDecapitalize);
                if (propertyDescriptor == null) {
                    propertyDescriptor = new PropertyDescriptor(strDecapitalize);
                    map.put(strDecapitalize, propertyDescriptor);
                }
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (z15) {
                    if (parameterTypes.length == 1) {
                        propertyDescriptor.setWriteMethod(method);
                        returnType = parameterTypes[0];
                        propertyDescriptor.setPropertyType(returnType);
                    }
                } else if (z14 && parameterTypes.length == 0) {
                    propertyDescriptor.setReadMethod(method);
                    if (propertyDescriptor.getPropertyType() == null) {
                        returnType = method.getReturnType();
                        propertyDescriptor.setPropertyType(returnType);
                    }
                }
            }
        }
        return (PropertyDescriptor[]) map.values().toArray(new PropertyDescriptor[0]);
    }
}
