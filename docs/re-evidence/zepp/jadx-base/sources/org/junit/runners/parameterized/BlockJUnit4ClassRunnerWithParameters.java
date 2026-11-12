package org.junit.runners.parameterized;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.List;
import org.junit.runner.notification.RunNotifier;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.junit.runners.Parameterized;
import org.junit.runners.model.FrameworkField;
import org.junit.runners.model.FrameworkMethod;
import org.junit.runners.model.InitializationError;
import org.junit.runners.model.Statement;

/* JADX INFO: loaded from: classes23.dex */
public class BlockJUnit4ClassRunnerWithParameters extends BlockJUnit4ClassRunner {
    private final Object[] g;
    private final String h;

    public BlockJUnit4ClassRunnerWithParameters(TestWithParameters testWithParameters) throws InitializationError {
        super(testWithParameters.getTestClass().getJavaClass());
        this.g = testWithParameters.getParameters().toArray(new Object[testWithParameters.getParameters().size()]);
        this.h = testWithParameters.getName();
    }

    private Object s() throws Exception {
        return getTestClass().getOnlyConstructor().newInstance(this.g);
    }

    private Object t() throws Exception {
        List<FrameworkField> listV = v();
        if (listV.size() != this.g.length) {
            throw new Exception("Wrong number of parameters and @Parameter fields. @Parameter fields counted: " + listV.size() + ", available parameters: " + this.g.length + ".");
        }
        Object objNewInstance = getTestClass().getJavaClass().newInstance();
        Iterator<FrameworkField> it2 = listV.iterator();
        while (it2.hasNext()) {
            Field field = it2.next().getField();
            int iValue = ((Parameterized.Parameter) field.getAnnotation(Parameterized.Parameter.class)).value();
            try {
                field.set(objNewInstance, this.g[iValue]);
            } catch (IllegalArgumentException e) {
                throw new Exception(getTestClass().getName() + ": Trying to set " + field.getName() + " with the value " + this.g[iValue] + " that is not the right type (" + this.g[iValue].getClass().getSimpleName() + " instead of " + field.getType().getSimpleName() + ").", e);
            }
        }
        return objNewInstance;
    }

    private boolean u() {
        return !v().isEmpty();
    }

    private List<FrameworkField> v() {
        return getTestClass().getAnnotatedFields(Parameterized.Parameter.class);
    }

    @Override // org.junit.runners.ParentRunner
    public Statement classBlock(RunNotifier runNotifier) {
        return childrenInvoker(runNotifier);
    }

    @Override // org.junit.runners.BlockJUnit4ClassRunner
    public Object createTest() throws Exception {
        return u() ? t() : s();
    }

    @Override // org.junit.runners.ParentRunner
    public String getName() {
        return this.h;
    }

    @Override // org.junit.runners.ParentRunner
    public Annotation[] getRunnerAnnotations() {
        return new Annotation[0];
    }

    @Override // org.junit.runners.BlockJUnit4ClassRunner
    public String testName(FrameworkMethod frameworkMethod) {
        return frameworkMethod.getName() + getName();
    }

    @Override // org.junit.runners.BlockJUnit4ClassRunner
    public void validateConstructor(List<Throwable> list) {
        validateOnlyOneConstructor(list);
        if (u()) {
            validateZeroArgConstructor(list);
        }
    }

    @Override // org.junit.runners.BlockJUnit4ClassRunner
    public void validateFields(List<Throwable> list) {
        super.validateFields(list);
        if (u()) {
            List<FrameworkField> listV = v();
            int size = listV.size();
            int[] iArr = new int[size];
            Iterator<FrameworkField> it2 = listV.iterator();
            while (it2.hasNext()) {
                int iValue = ((Parameterized.Parameter) it2.next().getField().getAnnotation(Parameterized.Parameter.class)).value();
                if (iValue < 0 || iValue > listV.size() - 1) {
                    list.add(new Exception("Invalid @Parameter value: " + iValue + ". @Parameter fields counted: " + listV.size() + ". Please use an index between 0 and " + (listV.size() - 1) + "."));
                } else {
                    iArr[iValue] = iArr[iValue] + 1;
                }
            }
            for (int i = 0; i < size; i++) {
                int i2 = iArr[i];
                if (i2 == 0) {
                    list.add(new Exception("@Parameter(" + i + ") is never used."));
                } else if (i2 > 1) {
                    list.add(new Exception("@Parameter(" + i + ") is used more than once (" + i2 + ")."));
                }
            }
        }
    }
}
