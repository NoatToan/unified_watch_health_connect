package org.junit.experimental.theories.internal;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.junit.experimental.theories.ParameterSignature;
import org.junit.experimental.theories.ParameterSupplier;
import org.junit.experimental.theories.ParametersSuppliedBy;
import org.junit.experimental.theories.PotentialAssignment;
import org.junit.runners.model.TestClass;

/* JADX INFO: loaded from: classes23.dex */
public class Assignments {
    private final List<PotentialAssignment> a;
    private final List<ParameterSignature> b;
    private final TestClass c;

    private Assignments(List<PotentialAssignment> list, List<ParameterSignature> list2, TestClass testClass) {
        this.b = list2;
        this.a = list;
        this.c = testClass;
    }

    private ParameterSupplier a(Class<? extends ParameterSupplier> cls) throws Exception {
        for (Constructor<?> constructor : cls.getConstructors()) {
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            if (parameterTypes.length == 1 && parameterTypes[0].equals(TestClass.class)) {
                return (ParameterSupplier) constructor.newInstance(this.c);
            }
        }
        return cls.newInstance();
    }

    public static Assignments allUnassigned(Method method, TestClass testClass) {
        List<ParameterSignature> listSignatures = ParameterSignature.signatures(testClass.getOnlyConstructor());
        listSignatures.addAll(ParameterSignature.signatures(method));
        return new Assignments(new ArrayList(), listSignatures, testClass);
    }

    private List<PotentialAssignment> b(ParameterSignature parameterSignature) {
        Class<?> type = parameterSignature.getType();
        if (type.isEnum()) {
            return new EnumSupplier(type).getValueSources(parameterSignature);
        }
        return (type.equals(Boolean.class) || type.equals(Boolean.TYPE)) ? new BooleanSupplier().getValueSources(parameterSignature) : Collections.emptyList();
    }

    private int c() {
        return ParameterSignature.signatures(this.c.getOnlyConstructor()).size();
    }

    private ParameterSupplier d(ParameterSignature parameterSignature) throws Exception {
        ParametersSuppliedBy parametersSuppliedBy = (ParametersSuppliedBy) parameterSignature.findDeepAnnotation(ParametersSuppliedBy.class);
        return parametersSuppliedBy != null ? a(parametersSuppliedBy.value()) : new AllMembersSupplier(this.c);
    }

    public Assignments assignNext(PotentialAssignment potentialAssignment) {
        ArrayList arrayList = new ArrayList(this.a);
        arrayList.add(potentialAssignment);
        List<ParameterSignature> list = this.b;
        return new Assignments(arrayList, list.subList(1, list.size()), this.c);
    }

    public Object[] getActualValues(int i, int i2) throws PotentialAssignment.CouldNotGenerateValueException {
        Object[] objArr = new Object[i2 - i];
        for (int i3 = i; i3 < i2; i3++) {
            objArr[i3 - i] = this.a.get(i3).getValue();
        }
        return objArr;
    }

    public Object[] getAllArguments() throws PotentialAssignment.CouldNotGenerateValueException {
        return getActualValues(0, this.a.size());
    }

    public Object[] getArgumentStrings(boolean z) throws PotentialAssignment.CouldNotGenerateValueException {
        int size = this.a.size();
        Object[] objArr = new Object[size];
        for (int i = 0; i < size; i++) {
            objArr[i] = this.a.get(i).getDescription();
        }
        return objArr;
    }

    public Object[] getConstructorArguments() throws PotentialAssignment.CouldNotGenerateValueException {
        return getActualValues(0, c());
    }

    public Object[] getMethodArguments() throws PotentialAssignment.CouldNotGenerateValueException {
        return getActualValues(c(), this.a.size());
    }

    public boolean isComplete() {
        return this.b.size() == 0;
    }

    public ParameterSignature nextUnassigned() {
        return this.b.get(0);
    }

    public List<PotentialAssignment> potentialsForNextUnassigned() throws Throwable {
        ParameterSignature parameterSignatureNextUnassigned = nextUnassigned();
        List<PotentialAssignment> valueSources = d(parameterSignatureNextUnassigned).getValueSources(parameterSignatureNextUnassigned);
        return valueSources.size() == 0 ? b(parameterSignatureNextUnassigned) : valueSources;
    }
}
