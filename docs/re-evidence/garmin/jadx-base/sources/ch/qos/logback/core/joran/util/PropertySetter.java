package ch.qos.logback.core.joran.util;

import androidx.core.view.j;
import ch.qos.logback.core.joran.spi.DefaultClass;
import ch.qos.logback.core.joran.spi.DefaultNestedComponentRegistry;
import ch.qos.logback.core.spi.ContextAwareBase;
import ch.qos.logback.core.util.AggregationType;
import ch.qos.logback.core.util.PropertySetterException;
import hb.a;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;
import v.e0;

/* JADX INFO: loaded from: classes7.dex */
public class PropertySetter extends ContextAwareBase {
    protected MethodDescriptor[] methodDescriptors;
    protected Object obj;
    protected Class<?> objClass;
    protected PropertyDescriptor[] propertyDescriptors;

    /* JADX INFO: renamed from: ch.qos.logback.core.joran.util.PropertySetter$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$ch$qos$logback$core$util$AggregationType;

        static {
            int[] iArr = new int[AggregationType.values().length];
            $SwitchMap$ch$qos$logback$core$util$AggregationType = iArr;
            try {
                iArr[AggregationType.NOT_FOUND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$ch$qos$logback$core$util$AggregationType[AggregationType.AS_BASIC_PROPERTY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$ch$qos$logback$core$util$AggregationType[AggregationType.AS_COMPLEX_PROPERTY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$ch$qos$logback$core$util$AggregationType[AggregationType.AS_BASIC_PROPERTY_COLLECTION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$ch$qos$logback$core$util$AggregationType[AggregationType.AS_COMPLEX_PROPERTY_COLLECTION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public PropertySetter(Object obj) {
        this.obj = obj;
        this.objClass = obj.getClass();
    }

    private String capitalizeFirstLetter(String str) {
        return str.substring(0, 1).toUpperCase(Locale.US) + str.substring(1);
    }

    private AggregationType computeRawAggregationType(Method method) {
        Class<?> parameterClassForMethod = getParameterClassForMethod(method);
        if (parameterClassForMethod == null) {
            return AggregationType.NOT_FOUND;
        }
        return StringToObjectConverter.canBeBuiltFromSimpleString(parameterClassForMethod) ? AggregationType.AS_BASIC_PROPERTY : AggregationType.AS_COMPLEX_PROPERTY;
    }

    private Method findAdderMethod(String str) {
        return getMethod("add" + capitalizeFirstLetter(str));
    }

    private Method findSetterMethod(String str) {
        PropertyDescriptor propertyDescriptor = getPropertyDescriptor(Introspector.decapitalize(str));
        if (propertyDescriptor != null) {
            return propertyDescriptor.getWriteMethod();
        }
        return null;
    }

    private Class<?> getParameterClassForMethod(Method method) {
        if (method == null) {
            return null;
        }
        Class<?>[] parameterTypes = method.getParameterTypes();
        if (parameterTypes.length != 1) {
            return null;
        }
        return parameterTypes[0];
    }

    private boolean isSanityCheckSuccessful(String str, Method method, Class<?>[] clsArr, Object obj) {
        StringBuilder sb3;
        String name;
        Class<?> cls = obj.getClass();
        if (clsArr.length != 1) {
            sb3 = a.l("Wrong number of parameters in setter method for property [", str, "] in ");
            name = this.obj.getClass().getName();
        } else {
            if (clsArr[0].isAssignableFrom(obj.getClass())) {
                return true;
            }
            StringBuilder sb4 = new StringBuilder("A \"");
            j.o(cls, sb4, "\" object is not assignable to a \"");
            sb4.append(clsArr[0].getName());
            sb4.append("\" variable.");
            addError(sb4.toString());
            addError("The class \"" + clsArr[0].getName() + "\" was loaded by ");
            addError("[" + clsArr[0].getClassLoader() + "] whereas object of type ");
            sb3 = new StringBuilder("\"");
            sb3.append(cls.getName());
            sb3.append("\" was loaded by [");
            sb3.append(cls.getClassLoader());
            name = "].";
        }
        sb3.append(name);
        addError(sb3.toString());
        return false;
    }

    private boolean isUnequivocallyInstantiable(Class<?> cls) {
        if (cls.isInterface()) {
            return false;
        }
        try {
            return cls.getDeclaredConstructor(null).newInstance(null) != null;
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException unused) {
        }
    }

    public void addBasicProperty(String str, String str2) {
        if (str2 == null) {
            return;
        }
        String strCapitalizeFirstLetter = capitalizeFirstLetter(str);
        Method methodFindAdderMethod = findAdderMethod(strCapitalizeFirstLetter);
        if (methodFindAdderMethod == null) {
            addError("No adder for property [" + strCapitalizeFirstLetter + "].");
            return;
        }
        Class<?>[] parameterTypes = methodFindAdderMethod.getParameterTypes();
        isSanityCheckSuccessful(strCapitalizeFirstLetter, methodFindAdderMethod, parameterTypes, str2);
        try {
            if (StringToObjectConverter.convertArg(this, str2, parameterTypes[0]) != null) {
                invokeMethodWithSingleParameterOnThisObject(methodFindAdderMethod, str2);
            }
        } catch (Throwable th3) {
            addError("Conversion to type [" + parameterTypes[0] + "] failed. ", th3);
        }
    }

    public void addComplexProperty(String str, Object obj) {
        Method methodFindAdderMethod = findAdderMethod(str);
        if (methodFindAdderMethod != null) {
            if (isSanityCheckSuccessful(str, methodFindAdderMethod, methodFindAdderMethod.getParameterTypes(), obj)) {
                invokeMethodWithSingleParameterOnThisObject(methodFindAdderMethod, obj);
            }
        } else {
            StringBuilder sbL = a.l("Could not find method [add", str, "] in class [");
            sbL.append(this.objClass.getName());
            sbL.append("].");
            addError(sbL.toString());
        }
    }

    public AggregationType computeAggregationType(String str) {
        Method methodFindAdderMethod = findAdderMethod(str);
        if (methodFindAdderMethod != null) {
            AggregationType aggregationTypeComputeRawAggregationType = computeRawAggregationType(methodFindAdderMethod);
            int i14 = AnonymousClass1.$SwitchMap$ch$qos$logback$core$util$AggregationType[aggregationTypeComputeRawAggregationType.ordinal()];
            if (i14 == 1) {
                return AggregationType.NOT_FOUND;
            }
            if (i14 == 2) {
                return AggregationType.AS_BASIC_PROPERTY_COLLECTION;
            }
            if (i14 == 3) {
                return AggregationType.AS_COMPLEX_PROPERTY_COLLECTION;
            }
            if (i14 == 4 || i14 == 5) {
                addError("Unexpected AggregationType " + aggregationTypeComputeRawAggregationType);
            }
        }
        Method methodFindSetterMethod = findSetterMethod(str);
        return methodFindSetterMethod != null ? computeRawAggregationType(methodFindSetterMethod) : AggregationType.NOT_FOUND;
    }

    public <T extends Annotation> T getAnnotation(String str, Class<T> cls, Method method) {
        if (method != null) {
            return (T) method.getAnnotation(cls);
        }
        return null;
    }

    public Class<?> getByConcreteType(String str, Method method) {
        Class<?> parameterClassForMethod = getParameterClassForMethod(method);
        if (parameterClassForMethod != null && isUnequivocallyInstantiable(parameterClassForMethod)) {
            return parameterClassForMethod;
        }
        return null;
    }

    public Class<?> getClassNameViaImplicitRules(String str, AggregationType aggregationType, DefaultNestedComponentRegistry defaultNestedComponentRegistry) {
        Class<?> clsFindDefaultComponentType = defaultNestedComponentRegistry.findDefaultComponentType(this.obj.getClass(), str);
        if (clsFindDefaultComponentType != null) {
            return clsFindDefaultComponentType;
        }
        Method relevantMethod = getRelevantMethod(str, aggregationType);
        if (relevantMethod == null) {
            return null;
        }
        Class<?> defaultClassNameByAnnonation = getDefaultClassNameByAnnonation(str, relevantMethod);
        return defaultClassNameByAnnonation != null ? defaultClassNameByAnnonation : getByConcreteType(str, relevantMethod);
    }

    public Class<?> getDefaultClassNameByAnnonation(String str, Method method) {
        DefaultClass defaultClass = (DefaultClass) getAnnotation(str, DefaultClass.class, method);
        if (defaultClass != null) {
            return defaultClass.value();
        }
        return null;
    }

    public Method getMethod(String str) {
        if (this.methodDescriptors == null) {
            introspect();
        }
        int i14 = 0;
        while (true) {
            MethodDescriptor[] methodDescriptorArr = this.methodDescriptors;
            if (i14 >= methodDescriptorArr.length) {
                return null;
            }
            if (str.equals(methodDescriptorArr[i14].getName())) {
                return this.methodDescriptors[i14].getMethod();
            }
            i14++;
        }
    }

    public Object getObj() {
        return this.obj;
    }

    public Class<?> getObjClass() {
        return this.objClass;
    }

    public PropertyDescriptor getPropertyDescriptor(String str) {
        if (this.propertyDescriptors == null) {
            introspect();
        }
        int i14 = 0;
        while (true) {
            PropertyDescriptor[] propertyDescriptorArr = this.propertyDescriptors;
            if (i14 >= propertyDescriptorArr.length) {
                return null;
            }
            if (str.equals(propertyDescriptorArr[i14].getName())) {
                return this.propertyDescriptors[i14];
            }
            i14++;
        }
    }

    public Method getRelevantMethod(String str, AggregationType aggregationType) {
        String strCapitalizeFirstLetter = capitalizeFirstLetter(str);
        if (aggregationType == AggregationType.AS_COMPLEX_PROPERTY_COLLECTION) {
            return findAdderMethod(strCapitalizeFirstLetter);
        }
        if (aggregationType == AggregationType.AS_COMPLEX_PROPERTY) {
            return findSetterMethod(strCapitalizeFirstLetter);
        }
        throw new IllegalStateException(aggregationType + " not allowed here");
    }

    public void introspect() {
        try {
            this.propertyDescriptors = Introspector.getPropertyDescriptors(this.objClass);
            this.methodDescriptors = Introspector.getMethodDescriptors(this.objClass);
        } catch (IntrospectionException e4) {
            addError("Failed to introspect " + this.obj + ": " + e4.getMessage());
            this.propertyDescriptors = new PropertyDescriptor[0];
            this.methodDescriptors = new MethodDescriptor[0];
        }
    }

    public void invokeMethodWithSingleParameterOnThisObject(Method method, Object obj) {
        Class<?> cls = obj.getClass();
        try {
            method.invoke(this.obj, obj);
        } catch (Exception e4) {
            addError("Could not invoke method " + method.getName() + " in class " + this.obj.getClass().getName() + " with parameter of type " + cls.getName(), e4);
        }
    }

    public void setComplexProperty(String str, Object obj) {
        PropertyDescriptor propertyDescriptor = getPropertyDescriptor(Introspector.decapitalize(str));
        if (propertyDescriptor == null) {
            StringBuilder sbL = a.l("Could not find PropertyDescriptor for [", str, "] in ");
            sbL.append(this.objClass.getName());
            addWarn(sbL.toString());
            return;
        }
        Method writeMethod = propertyDescriptor.getWriteMethod();
        if (writeMethod == null) {
            StringBuilder sbL2 = a.l("Not setter method for property [", str, "] in ");
            sbL2.append(this.obj.getClass().getName());
            addWarn(sbL2.toString());
        } else if (isSanityCheckSuccessful(str, writeMethod, writeMethod.getParameterTypes(), obj)) {
            try {
                invokeMethodWithSingleParameterOnThisObject(writeMethod, obj);
            } catch (Exception e4) {
                addError("Could not set component " + this.obj + " for parent component " + this.obj, e4);
            }
        }
    }

    public void setProperty(PropertyDescriptor propertyDescriptor, String str, String str2) throws PropertySetterException {
        Method writeMethod = propertyDescriptor.getWriteMethod();
        if (writeMethod == null) {
            throw new PropertySetterException(am.j.m("No setter for property [", str, "]."));
        }
        Class<?>[] parameterTypes = writeMethod.getParameterTypes();
        if (parameterTypes.length != 1) {
            throw new PropertySetterException("#params for setter != 1");
        }
        try {
            Object objConvertArg = StringToObjectConverter.convertArg(this, str2, parameterTypes[0]);
            if (objConvertArg != null) {
                try {
                    writeMethod.invoke(this.obj, objConvertArg);
                } catch (Exception e4) {
                    throw new PropertySetterException(e4);
                }
            } else {
                throw new PropertySetterException("Conversion to type [" + parameterTypes[0] + "] failed.");
            }
        } catch (Throwable th3) {
            throw new PropertySetterException("Conversion to type [" + parameterTypes[0] + "] failed. ", th3);
        }
    }

    public void setProperty(String str, String str2) {
        if (str2 == null) {
            return;
        }
        String strDecapitalize = Introspector.decapitalize(str);
        PropertyDescriptor propertyDescriptor = getPropertyDescriptor(strDecapitalize);
        if (propertyDescriptor == null) {
            StringBuilder sbL = a.l("No such property [", strDecapitalize, "] in ");
            sbL.append(this.objClass.getName());
            sbL.append(".");
            addWarn(sbL.toString());
            return;
        }
        try {
            setProperty(propertyDescriptor, strDecapitalize, str2);
        } catch (PropertySetterException e4) {
            addWarn(e0.g("Failed to set property [", strDecapitalize, "] to value \"", str2, "\". "), e4);
        }
    }
}
