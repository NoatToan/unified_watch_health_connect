package org.junit.experimental.theories.internal;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.junit.Assume;
import org.junit.experimental.theories.DataPoint;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.ParameterSignature;
import org.junit.experimental.theories.ParameterSupplier;
import org.junit.experimental.theories.PotentialAssignment;
import org.junit.runners.model.FrameworkField;
import org.junit.runners.model.FrameworkMethod;
import org.junit.runners.model.TestClass;

/* JADX INFO: loaded from: classes23.dex */
public class AllMembersSupplier extends ParameterSupplier {
    private final TestClass a;

    public static class b extends PotentialAssignment {
        private final FrameworkMethod a;

        @Override // org.junit.experimental.theories.PotentialAssignment
        public String getDescription() throws PotentialAssignment.CouldNotGenerateValueException {
            return this.a.getName();
        }

        @Override // org.junit.experimental.theories.PotentialAssignment
        public Object getValue() throws PotentialAssignment.CouldNotGenerateValueException {
            try {
                return this.a.invokeExplosively(null, new Object[0]);
            } catch (IllegalAccessException unused) {
                throw new RuntimeException("unexpected: getMethods returned an inaccessible method");
            } catch (IllegalArgumentException unused2) {
                throw new RuntimeException("unexpected: argument length is checked");
            } catch (Throwable th) {
                DataPoint dataPoint = (DataPoint) this.a.getAnnotation(DataPoint.class);
                Assume.assumeTrue(dataPoint == null || !AllMembersSupplier.j(dataPoint.ignoredExceptions(), th));
                throw new PotentialAssignment.CouldNotGenerateValueException(th);
            }
        }

        private b(FrameworkMethod frameworkMethod) {
            this.a = frameworkMethod;
        }
    }

    public AllMembersSupplier(TestClass testClass) {
        this.a = testClass;
    }

    private void b(ParameterSignature parameterSignature, String str, List<PotentialAssignment> list, Object obj) {
        for (int i = 0; i < Array.getLength(obj); i++) {
            Object obj2 = Array.get(obj, i);
            if (parameterSignature.canAcceptValue(obj2)) {
                list.add(PotentialAssignment.forValue(str + "[" + i + "]", obj2));
            }
        }
    }

    private void c(Class<?> cls, ParameterSignature parameterSignature, String str, List<PotentialAssignment> list, Object obj) {
        if (cls.isArray()) {
            b(parameterSignature, str, list, obj);
        } else if (Iterable.class.isAssignableFrom(cls)) {
            d(parameterSignature, str, list, (Iterable) obj);
        }
    }

    private void d(ParameterSignature parameterSignature, String str, List<PotentialAssignment> list, Iterable<?> iterable) {
        int i = 0;
        for (Object obj : iterable) {
            if (parameterSignature.canAcceptValue(obj)) {
                list.add(PotentialAssignment.forValue(str + "[" + i + "]", obj));
            }
            i++;
        }
    }

    private void e(ParameterSignature parameterSignature, List<PotentialAssignment> list) {
        for (Field field : getDataPointsFields(parameterSignature)) {
            c(field.getType(), parameterSignature, field.getName(), list, i(field));
        }
    }

    private void f(ParameterSignature parameterSignature, List<PotentialAssignment> list) throws Throwable {
        for (FrameworkMethod frameworkMethod : getDataPointsMethods(parameterSignature)) {
            Class<?> returnType = frameworkMethod.getReturnType();
            if ((returnType.isArray() && parameterSignature.canPotentiallyAcceptType(returnType.getComponentType())) || Iterable.class.isAssignableFrom(returnType)) {
                try {
                    c(returnType, parameterSignature, frameworkMethod.getName(), list, frameworkMethod.invokeExplosively(null, new Object[0]));
                } catch (Throwable th) {
                    DataPoints dataPoints = (DataPoints) frameworkMethod.getAnnotation(DataPoints.class);
                    if (dataPoints == null || !j(dataPoints.ignoredExceptions(), th)) {
                        throw th;
                    }
                    return;
                }
            }
        }
    }

    private void g(ParameterSignature parameterSignature, List<PotentialAssignment> list) {
        for (Field field : getSingleDataPointFields(parameterSignature)) {
            Object objI = i(field);
            if (parameterSignature.canAcceptValue(objI)) {
                list.add(PotentialAssignment.forValue(field.getName(), objI));
            }
        }
    }

    private void h(ParameterSignature parameterSignature, List<PotentialAssignment> list) {
        for (FrameworkMethod frameworkMethod : getSingleDataPointMethods(parameterSignature)) {
            if (parameterSignature.canAcceptType(frameworkMethod.getType())) {
                list.add(new b(frameworkMethod));
            }
        }
    }

    private Object i(Field field) {
        try {
            return field.get(null);
        } catch (IllegalAccessException unused) {
            throw new RuntimeException("unexpected: getFields returned an inaccessible field");
        } catch (IllegalArgumentException unused2) {
            throw new RuntimeException("unexpected: field from getClass doesn't exist on object");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean j(Class<?>[] clsArr, Object obj) {
        for (Class<?> cls : clsArr) {
            if (cls.isAssignableFrom(obj.getClass())) {
                return true;
            }
        }
        return false;
    }

    public Collection<Field> getDataPointsFields(ParameterSignature parameterSignature) {
        List<FrameworkField> annotatedFields = this.a.getAnnotatedFields(DataPoints.class);
        ArrayList arrayList = new ArrayList();
        Iterator<FrameworkField> it2 = annotatedFields.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().getField());
        }
        return arrayList;
    }

    public Collection<FrameworkMethod> getDataPointsMethods(ParameterSignature parameterSignature) {
        return this.a.getAnnotatedMethods(DataPoints.class);
    }

    public Collection<Field> getSingleDataPointFields(ParameterSignature parameterSignature) {
        List<FrameworkField> annotatedFields = this.a.getAnnotatedFields(DataPoint.class);
        ArrayList arrayList = new ArrayList();
        Iterator<FrameworkField> it2 = annotatedFields.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().getField());
        }
        return arrayList;
    }

    public Collection<FrameworkMethod> getSingleDataPointMethods(ParameterSignature parameterSignature) {
        return this.a.getAnnotatedMethods(DataPoint.class);
    }

    @Override // org.junit.experimental.theories.ParameterSupplier
    public List<PotentialAssignment> getValueSources(ParameterSignature parameterSignature) throws Throwable {
        ArrayList arrayList = new ArrayList();
        g(parameterSignature, arrayList);
        e(parameterSignature, arrayList);
        h(parameterSignature, arrayList);
        f(parameterSignature, arrayList);
        return arrayList;
    }
}
