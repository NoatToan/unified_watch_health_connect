package health.compact.a;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public class AsyncInvocationHandler implements InvocationHandler {
    private static Executor d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object f36505b;

    static {
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        d = executorServiceNewSingleThreadExecutor;
        executorServiceNewSingleThreadExecutor.execute(new Runnable() { // from class: health.compact.a.AsyncInvocationHandler.5
            @Override // java.lang.Runnable
            public void run() {
                Thread.currentThread().setName("Daemon_UIWorkThread");
            }
        });
    }

    public AsyncInvocationHandler(Object obj) {
        this.f36505b = null;
        if (obj == null) {
            com.huawei.hwlogsmodel.LogUtil.e("Step_AsyncInvocationHandler", "target is null");
        } else {
            this.f36505b = obj;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object a(Method method, Object[] objArr) {
        Object[] objArr2 = new Object[1];
        try {
            objArr2[0] = method.invoke(this.f36505b, objArr);
        } catch (IllegalAccessException e) {
            com.huawei.hwlogsmodel.LogUtil.e("Step_AsyncInvocationHandler", e.getMessage());
        } catch (InvocationTargetException e2) {
            com.huawei.hwlogsmodel.LogUtil.e("Step_AsyncInvocationHandler", e2.getMessage());
        }
        return objArr2[0];
    }

    private Object d(final Method method, final Object[] objArr) {
        com.huawei.hwlogsmodel.LogUtil.d("Step_AsyncInvocationHandler", "async method");
        d.execute(new Runnable() { // from class: health.compact.a.AsyncInvocationHandler.4
            @Override // java.lang.Runnable
            public void run() {
                AsyncInvocationHandler.this.a(method, objArr);
            }
        });
        return null;
    }

    private Object c(final Method method, final Object[] objArr) {
        com.huawei.hwlogsmodel.LogUtil.d("Step_AsyncInvocationHandler", "sync method");
        final Object[] objArr2 = new Object[1];
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        d.execute(new Runnable() { // from class: health.compact.a.AsyncInvocationHandler.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    try {
                        objArr2[0] = method.invoke(AsyncInvocationHandler.this.f36505b, objArr);
                    } catch (IllegalAccessException e) {
                        com.huawei.hwlogsmodel.LogUtil.e("Step_AsyncInvocationHandler", e.getMessage());
                        countDownLatch.countDown();
                    } catch (InvocationTargetException e2) {
                        com.huawei.hwlogsmodel.LogUtil.e("Step_AsyncInvocationHandler", e2.getMessage());
                        countDownLatch.countDown();
                    }
                } finally {
                    countDownLatch.countDown();
                }
            }
        });
        try {
            if (!countDownLatch.await(5000L, TimeUnit.MILLISECONDS)) {
                com.huawei.hwlogsmodel.LogUtil.j("Step_AsyncInvocationHandler", "execute latch timeout class:", method.getClass().getName(), " method:", method.getName());
            }
        } catch (InterruptedException e) {
            com.huawei.hwlogsmodel.LogUtil.e("Step_AsyncInvocationHandler", e.getMessage());
        }
        return objArr2[0];
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) {
        if (method == null || obj == null) {
            com.huawei.hwlogsmodel.LogUtil.e("Step_AsyncInvocationHandler", "method or proxy is null");
            return null;
        }
        if ("Daemon_UIWorkThread".equals(Thread.currentThread().getName())) {
            com.huawei.hwlogsmodel.LogUtil.d("Step_AsyncInvocationHandler", "same method invoke");
            return a(method, objArr);
        }
        if (method.getReturnType() == Void.TYPE) {
            return d(method, objArr);
        }
        return c(method, objArr);
    }
}
