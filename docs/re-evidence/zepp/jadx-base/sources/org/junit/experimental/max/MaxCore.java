package org.junit.experimental.max;

import java.io.File;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import junit.framework.TestSuite;
import org.junit.internal.requests.SortingRequest;
import org.junit.internal.runners.ErrorReportingRunner;
import org.junit.internal.runners.JUnit38ClassRunner;
import org.junit.runner.Description;
import org.junit.runner.JUnitCore;
import org.junit.runner.Request;
import org.junit.runner.Result;
import org.junit.runner.Runner;
import org.junit.runners.Suite;
import org.junit.runners.model.InitializationError;

/* JADX INFO: loaded from: classes23.dex */
public class MaxCore {
    private static final String b = "malformed JUnit 3 test class: ";
    private final MaxHistory a;

    public class a extends Request {
        public final /* synthetic */ List a;

        /* JADX INFO: renamed from: org.junit.experimental.max.MaxCore$a$a, reason: collision with other inner class name */
        public class C1202a extends Suite {
            public C1202a(Class cls, List list) throws InitializationError {
                super((Class<?>) cls, (List<Runner>) list);
            }
        }

        public a(List list) {
            this.a = list;
        }

        @Override // org.junit.runner.Request
        public Runner getRunner() {
            try {
                return new C1202a(null, this.a);
            } catch (InitializationError e) {
                return new ErrorReportingRunner(null, e);
            }
        }
    }

    private MaxCore(File file) {
        this.a = MaxHistory.forFolder(file);
    }

    private Runner a(Description description) {
        if (description.toString().equals("TestSuite with 0 tests")) {
            return Suite.emptySuite();
        }
        if (description.toString().startsWith(b)) {
            return new JUnit38ClassRunner(new TestSuite(e(description)));
        }
        Class<?> testClass = description.getTestClass();
        if (testClass != null) {
            String methodName = description.getMethodName();
            return methodName == null ? Request.aClass(testClass).getRunner() : Request.method(testClass, methodName).getRunner();
        }
        throw new RuntimeException("Can't build a runner from description [" + description + "]");
    }

    private Request b(List<Description> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<Description> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(a(it2.next()));
        }
        return new a(arrayList);
    }

    private List<Description> c(Request request) {
        ArrayList arrayList = new ArrayList();
        d(null, request.getRunner().getDescription(), arrayList);
        return arrayList;
    }

    private void d(Description description, Description description2, List<Description> list) {
        if (!description2.getChildren().isEmpty()) {
            Iterator<Description> it2 = description2.getChildren().iterator();
            while (it2.hasNext()) {
                d(description2, it2.next(), list);
            }
        } else {
            if (!description2.toString().equals("warning(junit.framework.TestSuite$1)")) {
                list.add(description2);
                return;
            }
            list.add(Description.createSuiteDescription(b + description, new Annotation[0]));
        }
    }

    private Class<?> e(Description description) {
        try {
            return Class.forName(description.toString().replace(b, ""));
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    @Deprecated
    public static MaxCore forFolder(String str) {
        return storedLocally(new File(str));
    }

    public static MaxCore storedLocally(File file) {
        return new MaxCore(file);
    }

    public Result run(Class<?> cls) {
        return run(Request.aClass(cls));
    }

    public Request sortRequest(Request request) {
        if (request instanceof SortingRequest) {
            return request;
        }
        List<Description> listC = c(request);
        Collections.sort(listC, this.a.testComparator());
        return b(listC);
    }

    public List<Description> sortedLeavesForTest(Request request) {
        return c(sortRequest(request));
    }

    public Result run(Request request) {
        return run(request, new JUnitCore());
    }

    public Result run(Request request, JUnitCore jUnitCore) {
        jUnitCore.addListener(this.a.listener());
        return jUnitCore.run(sortRequest(request).getRunner());
    }
}
