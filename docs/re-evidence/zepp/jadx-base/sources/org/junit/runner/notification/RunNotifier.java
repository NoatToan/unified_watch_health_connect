package org.junit.runner.notification;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import org.junit.runner.Description;
import org.junit.runner.Result;

/* JADX INFO: loaded from: classes23.dex */
public class RunNotifier {
    private final List<RunListener> a = new CopyOnWriteArrayList();
    private volatile boolean b = false;

    public class a extends h {
        public final /* synthetic */ Description c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Description description) throws Exception {
            super(RunNotifier.this);
            this.c = description;
        }

        @Override // org.junit.runner.notification.RunNotifier.h
        public void a(RunListener runListener) throws Exception {
            runListener.testRunStarted(this.c);
        }
    }

    public class b extends h {
        public final /* synthetic */ Result c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Result result) throws Exception {
            super(RunNotifier.this);
            this.c = result;
        }

        @Override // org.junit.runner.notification.RunNotifier.h
        public void a(RunListener runListener) throws Exception {
            runListener.testRunFinished(this.c);
        }
    }

    public class c extends h {
        public final /* synthetic */ Description c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Description description) throws Exception {
            super(RunNotifier.this);
            this.c = description;
        }

        @Override // org.junit.runner.notification.RunNotifier.h
        public void a(RunListener runListener) throws Exception {
            runListener.testStarted(this.c);
        }
    }

    public class d extends h {
        public final /* synthetic */ List c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(List list, List list2) throws Exception {
            super(list);
            this.c = list2;
        }

        @Override // org.junit.runner.notification.RunNotifier.h
        public void a(RunListener runListener) throws Exception {
            Iterator it2 = this.c.iterator();
            while (it2.hasNext()) {
                runListener.testFailure((Failure) it2.next());
            }
        }
    }

    public class e extends h {
        public final /* synthetic */ Failure c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Failure failure) {
            super(RunNotifier.this);
            this.c = failure;
        }

        @Override // org.junit.runner.notification.RunNotifier.h
        public void a(RunListener runListener) throws Exception {
            runListener.testAssumptionFailure(this.c);
        }
    }

    public class f extends h {
        public final /* synthetic */ Description c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Description description) throws Exception {
            super(RunNotifier.this);
            this.c = description;
        }

        @Override // org.junit.runner.notification.RunNotifier.h
        public void a(RunListener runListener) throws Exception {
            runListener.testIgnored(this.c);
        }
    }

    public class g extends h {
        public final /* synthetic */ Description c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Description description) throws Exception {
            super(RunNotifier.this);
            this.c = description;
        }

        @Override // org.junit.runner.notification.RunNotifier.h
        public void a(RunListener runListener) throws Exception {
            runListener.testFinished(this.c);
        }
    }

    public abstract class h {
        private final List<RunListener> a;

        public h(RunNotifier runNotifier) {
            this(runNotifier.a);
        }

        public abstract void a(RunListener runListener) throws Exception;

        public void b() {
            int size = this.a.size();
            ArrayList arrayList = new ArrayList(size);
            ArrayList arrayList2 = new ArrayList(size);
            for (RunListener runListener : this.a) {
                try {
                    a(runListener);
                    arrayList.add(runListener);
                } catch (Exception e) {
                    arrayList2.add(new Failure(Description.TEST_MECHANISM, e));
                }
            }
            RunNotifier.this.c(arrayList, arrayList2);
        }

        public h(List<RunListener> list) {
            this.a = list;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(List<RunListener> list, List<Failure> list2) {
        if (list2.isEmpty()) {
            return;
        }
        new d(list, list2).b();
    }

    public void addFirstListener(RunListener runListener) {
        Objects.requireNonNull(runListener, "Cannot add a null listener");
        this.a.add(0, d(runListener));
    }

    public void addListener(RunListener runListener) {
        Objects.requireNonNull(runListener, "Cannot add a null listener");
        this.a.add(d(runListener));
    }

    public RunListener d(RunListener runListener) {
        return runListener.getClass().isAnnotationPresent(RunListener.ThreadSafe.class) ? runListener : new org.junit.runner.notification.a(runListener, this);
    }

    public void fireTestAssumptionFailed(Failure failure) {
        new e(failure).b();
    }

    public void fireTestFailure(Failure failure) {
        c(this.a, Arrays.asList(failure));
    }

    public void fireTestFinished(Description description) {
        new g(description).b();
    }

    public void fireTestIgnored(Description description) {
        new f(description).b();
    }

    public void fireTestRunFinished(Result result) {
        new b(result).b();
    }

    public void fireTestRunStarted(Description description) {
        new a(description).b();
    }

    public void fireTestStarted(Description description) throws StoppedByUserException {
        if (this.b) {
            throw new StoppedByUserException();
        }
        new c(description).b();
    }

    public void pleaseStop() {
        this.b = true;
    }

    public void removeListener(RunListener runListener) {
        Objects.requireNonNull(runListener, "Cannot remove a null listener");
        this.a.remove(d(runListener));
    }
}
