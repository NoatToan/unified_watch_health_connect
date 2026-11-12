package junit.framework;

import java.util.Iterator;
import java.util.List;
import org.junit.Ignore;
import org.junit.runner.Describable;
import org.junit.runner.Description;
import org.junit.runner.Request;
import org.junit.runner.Runner;
import org.junit.runner.manipulation.Filter;
import org.junit.runner.manipulation.Filterable;
import org.junit.runner.manipulation.NoTestsRemainException;
import org.junit.runner.manipulation.Sortable;
import org.junit.runner.manipulation.Sorter;

/* JADX INFO: loaded from: classes23.dex */
public class JUnit4TestAdapter implements Test, Filterable, Sortable, Describable {
    private final Class<?> a;
    private final Runner b;
    private final JUnit4TestAdapterCache c;

    public JUnit4TestAdapter(Class<?> cls) {
        this(cls, JUnit4TestAdapterCache.getDefault());
    }

    private boolean a(Description description) {
        return description.getAnnotation(Ignore.class) != null;
    }

    private Description b(Description description) {
        if (a(description)) {
            return Description.EMPTY;
        }
        Description descriptionChildlessCopy = description.childlessCopy();
        Iterator<Description> it2 = description.getChildren().iterator();
        while (it2.hasNext()) {
            Description descriptionB = b(it2.next());
            if (!descriptionB.isEmpty()) {
                descriptionChildlessCopy.addChild(descriptionB);
            }
        }
        return descriptionChildlessCopy;
    }

    @Override // junit.framework.Test
    public int countTestCases() {
        return this.b.testCount();
    }

    @Override // org.junit.runner.manipulation.Filterable
    public void filter(Filter filter) throws NoTestsRemainException {
        filter.apply(this.b);
    }

    @Override // org.junit.runner.Describable
    public Description getDescription() {
        return b(this.b.getDescription());
    }

    public Class<?> getTestClass() {
        return this.a;
    }

    public List<Test> getTests() {
        return this.c.asTestList(getDescription());
    }

    @Override // junit.framework.Test
    public void run(TestResult testResult) {
        this.b.run(this.c.getNotifier(testResult, this));
    }

    @Override // org.junit.runner.manipulation.Sortable
    public void sort(Sorter sorter) {
        sorter.apply(this.b);
    }

    public String toString() {
        return this.a.getName();
    }

    public JUnit4TestAdapter(Class<?> cls, JUnit4TestAdapterCache jUnit4TestAdapterCache) {
        this.c = jUnit4TestAdapterCache;
        this.a = cls;
        this.b = Request.classWithoutSuiteMethod(cls).getRunner();
    }
}
