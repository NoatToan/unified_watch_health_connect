package junit.framework;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import org.junit.internal.MethodSorter;

/* JADX INFO: loaded from: classes23.dex */
public class TestSuite implements Test {
    private String a;
    private Vector<Test> b;

    public static class a extends TestCase {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2) {
            super(str);
            this.a = str2;
        }

        @Override // junit.framework.TestCase
        public void runTest() {
            TestCase.fail(this.a);
        }
    }

    public TestSuite() {
        this.b = new Vector<>(10);
    }

    private void a(Method method, List<String> list, Class<?> cls) {
        String name = method.getName();
        if (list.contains(name)) {
            return;
        }
        if (d(method)) {
            list.add(name);
            addTest(createTest(cls, name));
        } else if (e(method)) {
            addTest(warning("Test method isn't public: " + method.getName() + "(" + cls.getCanonicalName() + ")"));
        }
    }

    private void b(Class<?> cls) {
        this.a = cls.getName();
        try {
            getTestConstructor(cls);
            if (!Modifier.isPublic(cls.getModifiers())) {
                addTest(warning("Class " + cls.getName() + " is not public"));
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (Class<?> superclass = cls; Test.class.isAssignableFrom(superclass); superclass = superclass.getSuperclass()) {
                for (Method method : MethodSorter.getDeclaredMethods(superclass)) {
                    a(method, arrayList, cls);
                }
            }
            if (this.b.size() == 0) {
                addTest(warning("No tests found in " + cls.getName()));
            }
        } catch (NoSuchMethodException unused) {
            addTest(warning("Class " + cls.getName() + " has no public constructor TestCase(String name) or TestCase()"));
        }
    }

    private static String c(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public static Test createTest(Class<?> cls, String str) {
        Object objNewInstance;
        try {
            Constructor<?> testConstructor = getTestConstructor(cls);
            try {
                if (testConstructor.getParameterTypes().length == 0) {
                    objNewInstance = testConstructor.newInstance(new Object[0]);
                    if (objNewInstance instanceof TestCase) {
                        ((TestCase) objNewInstance).setName(str);
                    }
                } else {
                    objNewInstance = testConstructor.newInstance(str);
                }
                return (Test) objNewInstance;
            } catch (IllegalAccessException e) {
                return warning("Cannot access test case: " + str + " (" + c(e) + ")");
            } catch (InstantiationException e2) {
                return warning("Cannot instantiate test case: " + str + " (" + c(e2) + ")");
            } catch (InvocationTargetException e3) {
                return warning("Exception in constructor: " + str + " (" + c(e3.getTargetException()) + ")");
            }
        } catch (NoSuchMethodException unused) {
            return warning("Class " + cls.getName() + " has no public constructor TestCase(String name) or TestCase()");
        }
    }

    private boolean d(Method method) {
        return e(method) && Modifier.isPublic(method.getModifiers());
    }

    private boolean e(Method method) {
        return method.getParameterTypes().length == 0 && method.getName().startsWith("test") && method.getReturnType().equals(Void.TYPE);
    }

    private Test f(Class<?> cls) {
        if (TestCase.class.isAssignableFrom(cls)) {
            return new TestSuite(cls.asSubclass(TestCase.class));
        }
        return warning(cls.getCanonicalName() + " does not extend TestCase");
    }

    public static Constructor<?> getTestConstructor(Class<?> cls) throws NoSuchMethodException {
        try {
            return cls.getConstructor(String.class);
        } catch (NoSuchMethodException unused) {
            return cls.getConstructor(new Class[0]);
        }
    }

    public static Test warning(String str) {
        return new a("warning", str);
    }

    public void addTest(Test test) {
        this.b.add(test);
    }

    public void addTestSuite(Class<? extends TestCase> cls) {
        addTest(new TestSuite(cls));
    }

    @Override // junit.framework.Test
    public int countTestCases() {
        Iterator<Test> it2 = this.b.iterator();
        int iCountTestCases = 0;
        while (it2.hasNext()) {
            iCountTestCases += it2.next().countTestCases();
        }
        return iCountTestCases;
    }

    public String getName() {
        return this.a;
    }

    @Override // junit.framework.Test
    public void run(TestResult testResult) {
        for (Test test : this.b) {
            if (testResult.shouldStop()) {
                return;
            } else {
                runTest(test, testResult);
            }
        }
    }

    public void runTest(Test test, TestResult testResult) {
        test.run(testResult);
    }

    public void setName(String str) {
        this.a = str;
    }

    public Test testAt(int i) {
        return this.b.get(i);
    }

    public int testCount() {
        return this.b.size();
    }

    public Enumeration<Test> tests() {
        return this.b.elements();
    }

    public String toString() {
        return getName() != null ? getName() : super.toString();
    }

    public TestSuite(Class<?> cls) {
        this.b = new Vector<>(10);
        b(cls);
    }

    public TestSuite(Class<? extends TestCase> cls, String str) {
        this(cls);
        setName(str);
    }

    public TestSuite(String str) {
        this.b = new Vector<>(10);
        setName(str);
    }

    public TestSuite(Class<?>... clsArr) {
        this.b = new Vector<>(10);
        for (Class<?> cls : clsArr) {
            addTest(f(cls));
        }
    }

    public TestSuite(Class<? extends TestCase>[] clsArr, String str) {
        this(clsArr);
        setName(str);
    }
}
