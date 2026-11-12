package org.junit.experimental.theories;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.junit.Assert;
import org.junit.Assume;
import org.junit.experimental.theories.internal.Assignments;
import org.junit.experimental.theories.internal.ParameterizedAssertionError;
import org.junit.internal.AssumptionViolatedException;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.junit.runners.model.FrameworkMethod;
import org.junit.runners.model.InitializationError;
import org.junit.runners.model.Statement;
import org.junit.runners.model.TestClass;

/* JADX INFO: loaded from: classes23.dex */
public class Theories extends BlockJUnit4ClassRunner {

    public static class TheoryAnchor extends Statement {
        private final FrameworkMethod b;
        private final TestClass c;
        private int a = 0;
        private List<AssumptionViolatedException> d = new ArrayList();

        public class a extends BlockJUnit4ClassRunner {
            public final /* synthetic */ Assignments g;

            /* JADX INFO: renamed from: org.junit.experimental.theories.Theories$TheoryAnchor$a$a, reason: collision with other inner class name */
            public class C1203a extends Statement {
                public final /* synthetic */ Statement a;

                public C1203a(Statement statement) throws Throwable {
                    this.a = statement;
                }

                @Override // org.junit.runners.model.Statement
                public void evaluate() throws Throwable {
                    try {
                        this.a.evaluate();
                        TheoryAnchor.this.handleDataPointSuccess();
                    } catch (AssumptionViolatedException e) {
                        TheoryAnchor.this.handleAssumptionViolation(e);
                    } catch (Throwable th) {
                        a aVar = a.this;
                        TheoryAnchor theoryAnchor = TheoryAnchor.this;
                        theoryAnchor.reportParameterizedError(th, aVar.g.getArgumentStrings(theoryAnchor.e()));
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Class cls, Assignments assignments) throws Throwable {
                super(cls);
                this.g = assignments;
            }

            @Override // org.junit.runners.BlockJUnit4ClassRunner, org.junit.runners.ParentRunner
            public void collectInitializationErrors(List<Throwable> list) {
            }

            @Override // org.junit.runners.BlockJUnit4ClassRunner
            public Object createTest() throws Exception {
                Object[] constructorArguments = this.g.getConstructorArguments();
                if (!TheoryAnchor.this.e()) {
                    Assume.assumeNotNull(constructorArguments);
                }
                return getTestClass().getOnlyConstructor().newInstance(constructorArguments);
            }

            @Override // org.junit.runners.BlockJUnit4ClassRunner
            public Statement methodBlock(FrameworkMethod frameworkMethod) {
                return new C1203a(super.methodBlock(frameworkMethod));
            }

            @Override // org.junit.runners.BlockJUnit4ClassRunner
            public Statement methodInvoker(FrameworkMethod frameworkMethod, Object obj) {
                return TheoryAnchor.this.d(frameworkMethod, this.g, obj);
            }
        }

        public class b extends Statement {
            public final /* synthetic */ Assignments a;
            public final /* synthetic */ FrameworkMethod b;
            public final /* synthetic */ Object c;

            public b(Assignments assignments, FrameworkMethod frameworkMethod, Object obj) throws Throwable {
                this.a = assignments;
                this.b = frameworkMethod;
                this.c = obj;
            }

            @Override // org.junit.runners.model.Statement
            public void evaluate() throws Throwable {
                Object[] methodArguments = this.a.getMethodArguments();
                if (!TheoryAnchor.this.e()) {
                    Assume.assumeNotNull(methodArguments);
                }
                this.b.invokeExplosively(this.c, methodArguments);
            }
        }

        public TheoryAnchor(FrameworkMethod frameworkMethod, TestClass testClass) {
            this.b = frameworkMethod;
            this.c = testClass;
        }

        private TestClass c() {
            return this.c;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Statement d(FrameworkMethod frameworkMethod, Assignments assignments, Object obj) {
            return new b(assignments, frameworkMethod, obj);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean e() {
            Theory theory = (Theory) this.b.getMethod().getAnnotation(Theory.class);
            if (theory == null) {
                return false;
            }
            return theory.nullsAccepted();
        }

        @Override // org.junit.runners.model.Statement
        public void evaluate() throws Throwable {
            runWithAssignment(Assignments.allUnassigned(this.b.getMethod(), c()));
            boolean z = this.b.getAnnotation(Theory.class) != null;
            if (this.a == 0 && z) {
                Assert.fail("Never found parameters that satisfied method assumptions.  Violated assumptions: " + this.d);
            }
        }

        public void handleAssumptionViolation(AssumptionViolatedException assumptionViolatedException) {
            this.d.add(assumptionViolatedException);
        }

        public void handleDataPointSuccess() {
            this.a++;
        }

        public void reportParameterizedError(Throwable th, Object... objArr) throws Throwable {
            if (objArr.length != 0) {
                throw new ParameterizedAssertionError(th, this.b.getName(), objArr);
            }
            throw th;
        }

        public void runWithAssignment(Assignments assignments) throws Throwable {
            if (assignments.isComplete()) {
                runWithCompleteAssignment(assignments);
            } else {
                runWithIncompleteAssignment(assignments);
            }
        }

        public void runWithCompleteAssignment(Assignments assignments) throws Throwable {
            new a(c().getJavaClass(), assignments).methodBlock(this.b).evaluate();
        }

        public void runWithIncompleteAssignment(Assignments assignments) throws Throwable {
            Iterator<PotentialAssignment> it2 = assignments.potentialsForNextUnassigned().iterator();
            while (it2.hasNext()) {
                runWithAssignment(assignments.assignNext(it2.next()));
            }
        }
    }

    public Theories(Class<?> cls) throws InitializationError {
        super(cls);
    }

    private void s(List<Throwable> list) {
        for (Field field : getTestClass().getJavaClass().getDeclaredFields()) {
            if (field.getAnnotation(DataPoint.class) != null || field.getAnnotation(DataPoints.class) != null) {
                if (!Modifier.isStatic(field.getModifiers())) {
                    list.add(new Error("DataPoint field " + field.getName() + " must be static"));
                }
                if (!Modifier.isPublic(field.getModifiers())) {
                    list.add(new Error("DataPoint field " + field.getName() + " must be public"));
                }
            }
        }
    }

    private void t(List<Throwable> list) {
        for (Method method : getTestClass().getJavaClass().getDeclaredMethods()) {
            if (method.getAnnotation(DataPoint.class) != null || method.getAnnotation(DataPoints.class) != null) {
                if (!Modifier.isStatic(method.getModifiers())) {
                    list.add(new Error("DataPoint method " + method.getName() + " must be static"));
                }
                if (!Modifier.isPublic(method.getModifiers())) {
                    list.add(new Error("DataPoint method " + method.getName() + " must be public"));
                }
            }
        }
    }

    private void u(Class<? extends ParameterSupplier> cls, List<Throwable> list) {
        Constructor<?>[] constructors = cls.getConstructors();
        if (constructors.length != 1) {
            list.add(new Error("ParameterSupplier " + cls.getName() + " must have only one constructor (either empty or taking only a TestClass)"));
            return;
        }
        Class<?>[] parameterTypes = constructors[0].getParameterTypes();
        if (parameterTypes.length == 0 || parameterTypes[0].equals(TestClass.class)) {
            return;
        }
        list.add(new Error("ParameterSupplier " + cls.getName() + " constructor must take either nothing or a single TestClass instance"));
    }

    @Override // org.junit.runners.BlockJUnit4ClassRunner, org.junit.runners.ParentRunner
    public void collectInitializationErrors(List<Throwable> list) {
        super.collectInitializationErrors(list);
        s(list);
        t(list);
    }

    @Override // org.junit.runners.BlockJUnit4ClassRunner
    public List<FrameworkMethod> computeTestMethods() {
        ArrayList arrayList = new ArrayList(super.computeTestMethods());
        List<FrameworkMethod> annotatedMethods = getTestClass().getAnnotatedMethods(Theory.class);
        arrayList.removeAll(annotatedMethods);
        arrayList.addAll(annotatedMethods);
        return arrayList;
    }

    @Override // org.junit.runners.BlockJUnit4ClassRunner
    public Statement methodBlock(FrameworkMethod frameworkMethod) {
        return new TheoryAnchor(frameworkMethod, getTestClass());
    }

    @Override // org.junit.runners.BlockJUnit4ClassRunner
    public void validateConstructor(List<Throwable> list) {
        validateOnlyOneConstructor(list);
    }

    @Override // org.junit.runners.BlockJUnit4ClassRunner
    public void validateTestMethods(List<Throwable> list) {
        for (FrameworkMethod frameworkMethod : computeTestMethods()) {
            if (frameworkMethod.getAnnotation(Theory.class) != null) {
                frameworkMethod.validatePublicVoid(false, list);
                frameworkMethod.validateNoTypeParametersOnArgs(list);
            } else {
                frameworkMethod.validatePublicVoidNoArg(false, list);
            }
            Iterator<ParameterSignature> it2 = ParameterSignature.signatures(frameworkMethod.getMethod()).iterator();
            while (it2.hasNext()) {
                ParametersSuppliedBy parametersSuppliedBy = (ParametersSuppliedBy) it2.next().findDeepAnnotation(ParametersSuppliedBy.class);
                if (parametersSuppliedBy != null) {
                    u(parametersSuppliedBy.value(), list);
                }
            }
        }
    }
}
