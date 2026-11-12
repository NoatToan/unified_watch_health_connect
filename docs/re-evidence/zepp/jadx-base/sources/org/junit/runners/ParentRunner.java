package org.junit.runners;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.ClassRule;
import org.junit.internal.AssumptionViolatedException;
import org.junit.internal.runners.model.EachTestNotifier;
import org.junit.internal.runners.rules.RuleMemberValidator;
import org.junit.internal.runners.statements.RunAfters;
import org.junit.internal.runners.statements.RunBefores;
import org.junit.rules.RunRules;
import org.junit.rules.TestRule;
import org.junit.runner.Description;
import org.junit.runner.Runner;
import org.junit.runner.manipulation.Filter;
import org.junit.runner.manipulation.Filterable;
import org.junit.runner.manipulation.NoTestsRemainException;
import org.junit.runner.manipulation.Sortable;
import org.junit.runner.manipulation.Sorter;
import org.junit.runner.notification.RunNotifier;
import org.junit.runner.notification.StoppedByUserException;
import org.junit.runners.model.FrameworkMethod;
import org.junit.runners.model.InitializationError;
import org.junit.runners.model.RunnerScheduler;
import org.junit.runners.model.Statement;
import org.junit.runners.model.TestClass;
import org.junit.validator.AnnotationsValidator;
import org.junit.validator.PublicClassValidator;
import org.junit.validator.TestClassValidator;

/* JADX INFO: loaded from: classes23.dex */
public abstract class ParentRunner<T> extends Runner implements Filterable, Sortable {
    private static final List<TestClassValidator> e = Arrays.asList(new AnnotationsValidator(), new PublicClassValidator());
    private final TestClass b;
    private final Object a = new Object();
    private volatile Collection<T> c = null;
    private volatile RunnerScheduler d = new a();

    public class a implements RunnerScheduler {
        public a() {
        }

        @Override // org.junit.runners.model.RunnerScheduler
        public void finished() {
        }

        @Override // org.junit.runners.model.RunnerScheduler
        public void schedule(Runnable runnable) {
            runnable.run();
        }
    }

    public class b extends Statement {
        public final /* synthetic */ RunNotifier a;

        public b(RunNotifier runNotifier) {
            this.a = runNotifier;
        }

        @Override // org.junit.runners.model.Statement
        public void evaluate() {
            ParentRunner.this.f(this.a);
        }
    }

    public class c implements Runnable {
        public final /* synthetic */ Object a;
        public final /* synthetic */ RunNotifier b;

        public c(Object obj, RunNotifier runNotifier) {
            this.a = obj;
            this.b = runNotifier;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            ParentRunner.this.runChild(this.a, this.b);
        }
    }

    public class d implements Comparator<T> {
        public final /* synthetic */ Sorter a;

        public d(Sorter sorter) {
            this.a = sorter;
        }

        @Override // java.util.Comparator
        public int compare(T t, T t2) {
            return this.a.compare(ParentRunner.this.describeChild(t), ParentRunner.this.describeChild(t2));
        }
    }

    public ParentRunner(Class<?> cls) throws InitializationError {
        this.b = createTestClass(cls);
        validate();
    }

    private void b(List<Throwable> list) {
        if (getTestClass().getJavaClass() != null) {
            Iterator<TestClassValidator> it2 = e.iterator();
            while (it2.hasNext()) {
                list.addAll(it2.next().validateTestClass(getTestClass()));
            }
        }
    }

    private boolean c() {
        Iterator<T> it2 = e().iterator();
        while (it2.hasNext()) {
            if (!isIgnored(it2.next())) {
                return false;
            }
        }
        return true;
    }

    private Comparator<? super T> d(Sorter sorter) {
        return new d(sorter);
    }

    private Collection<T> e() {
        if (this.c == null) {
            synchronized (this.a) {
                if (this.c == null) {
                    this.c = Collections.unmodifiableCollection(getChildren());
                }
            }
        }
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(RunNotifier runNotifier) {
        RunnerScheduler runnerScheduler = this.d;
        try {
            Iterator<T> it2 = e().iterator();
            while (it2.hasNext()) {
                runnerScheduler.schedule(new c(it2.next(), runNotifier));
            }
            runnerScheduler.finished();
        } catch (Throwable th) {
            runnerScheduler.finished();
            throw th;
        }
    }

    private boolean g(Filter filter, T t) {
        return filter.shouldRun(describeChild(t));
    }

    private void h(List<Throwable> list) {
        RuleMemberValidator.CLASS_RULE_VALIDATOR.validate(getTestClass(), list);
        RuleMemberValidator.CLASS_RULE_METHOD_VALIDATOR.validate(getTestClass(), list);
    }

    private Statement i(Statement statement) {
        List<TestRule> listClassRules = classRules();
        return listClassRules.isEmpty() ? statement : new RunRules(statement, listClassRules, getDescription());
    }

    private void validate() throws InitializationError {
        ArrayList arrayList = new ArrayList();
        collectInitializationErrors(arrayList);
        if (!arrayList.isEmpty()) {
            throw new InitializationError(arrayList);
        }
    }

    public Statement childrenInvoker(RunNotifier runNotifier) {
        return new b(runNotifier);
    }

    public Statement classBlock(RunNotifier runNotifier) {
        Statement statementChildrenInvoker = childrenInvoker(runNotifier);
        return !c() ? i(withAfterClasses(withBeforeClasses(statementChildrenInvoker))) : statementChildrenInvoker;
    }

    public List<TestRule> classRules() {
        List<TestRule> annotatedMethodValues = this.b.getAnnotatedMethodValues(null, ClassRule.class, TestRule.class);
        annotatedMethodValues.addAll(this.b.getAnnotatedFieldValues(null, ClassRule.class, TestRule.class));
        return annotatedMethodValues;
    }

    public void collectInitializationErrors(List<Throwable> list) {
        validatePublicVoidNoArgMethods(BeforeClass.class, true, list);
        validatePublicVoidNoArgMethods(AfterClass.class, true, list);
        h(list);
        b(list);
    }

    public TestClass createTestClass(Class<?> cls) {
        return new TestClass(cls);
    }

    public abstract Description describeChild(T t);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.junit.runner.manipulation.Filterable
    public void filter(Filter filter) throws NoTestsRemainException {
        synchronized (this.a) {
            ArrayList arrayList = new ArrayList(e());
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Object next = it2.next();
                if (g(filter, next)) {
                    try {
                        filter.apply(next);
                    } catch (NoTestsRemainException unused) {
                        it2.remove();
                    }
                } else {
                    it2.remove();
                }
            }
            this.c = Collections.unmodifiableCollection(arrayList);
            if (this.c.isEmpty()) {
                throw new NoTestsRemainException();
            }
        }
    }

    public abstract List<T> getChildren();

    @Override // org.junit.runner.Runner, org.junit.runner.Describable
    public Description getDescription() {
        Description descriptionCreateSuiteDescription = Description.createSuiteDescription(getName(), getRunnerAnnotations());
        Iterator<T> it2 = e().iterator();
        while (it2.hasNext()) {
            descriptionCreateSuiteDescription.addChild(describeChild(it2.next()));
        }
        return descriptionCreateSuiteDescription;
    }

    public String getName() {
        return this.b.getName();
    }

    public Annotation[] getRunnerAnnotations() {
        return this.b.getAnnotations();
    }

    public final TestClass getTestClass() {
        return this.b;
    }

    public boolean isIgnored(T t) {
        return false;
    }

    @Override // org.junit.runner.Runner
    public void run(RunNotifier runNotifier) {
        EachTestNotifier eachTestNotifier = new EachTestNotifier(runNotifier, getDescription());
        try {
            classBlock(runNotifier).evaluate();
        } catch (AssumptionViolatedException e2) {
            eachTestNotifier.addFailedAssumption(e2);
        } catch (StoppedByUserException e3) {
            throw e3;
        } catch (Throwable th) {
            eachTestNotifier.addFailure(th);
        }
    }

    public abstract void runChild(T t, RunNotifier runNotifier);

    public final void runLeaf(Statement statement, Description description, RunNotifier runNotifier) {
        EachTestNotifier eachTestNotifier = new EachTestNotifier(runNotifier, description);
        eachTestNotifier.fireTestStarted();
        try {
            try {
                statement.evaluate();
            } catch (Throwable th) {
                eachTestNotifier.fireTestFinished();
                throw th;
            }
        } catch (AssumptionViolatedException e2) {
            eachTestNotifier.addFailedAssumption(e2);
        } catch (Throwable th2) {
            eachTestNotifier.addFailure(th2);
        }
        eachTestNotifier.fireTestFinished();
    }

    public void setScheduler(RunnerScheduler runnerScheduler) {
        this.d = runnerScheduler;
    }

    @Override // org.junit.runner.manipulation.Sortable
    public void sort(Sorter sorter) {
        synchronized (this.a) {
            Iterator<T> it2 = e().iterator();
            while (it2.hasNext()) {
                sorter.apply(it2.next());
            }
            ArrayList arrayList = new ArrayList(e());
            Collections.sort(arrayList, d(sorter));
            this.c = Collections.unmodifiableCollection(arrayList);
        }
    }

    public void validatePublicVoidNoArgMethods(Class<? extends Annotation> cls, boolean z, List<Throwable> list) {
        Iterator<FrameworkMethod> it2 = getTestClass().getAnnotatedMethods(cls).iterator();
        while (it2.hasNext()) {
            it2.next().validatePublicVoidNoArg(z, list);
        }
    }

    public Statement withAfterClasses(Statement statement) {
        List<FrameworkMethod> annotatedMethods = this.b.getAnnotatedMethods(AfterClass.class);
        return annotatedMethods.isEmpty() ? statement : new RunAfters(statement, annotatedMethods, null);
    }

    public Statement withBeforeClasses(Statement statement) {
        List<FrameworkMethod> annotatedMethods = this.b.getAnnotatedMethods(BeforeClass.class);
        return annotatedMethods.isEmpty() ? statement : new RunBefores(statement, annotatedMethods, null);
    }
}
