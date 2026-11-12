package org.greenrobot.greendao.async;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import org.greenrobot.greendao.DaoException;
import org.greenrobot.greendao.DaoLog;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.query.Query;

/* JADX INFO: loaded from: classes23.dex */
class a implements Runnable, Handler.Callback {
    private static ExecutorService k = Executors.newCachedThreadPool();
    private volatile boolean b;
    private volatile AsyncOperationListener d;
    private volatile AsyncOperationListener e;
    private int g;
    private int h;
    private Handler i;
    private int j;
    private final BlockingQueue<AsyncOperation> a = new LinkedBlockingQueue();
    private volatile int c = 50;
    private volatile int f = 50;

    /* JADX INFO: renamed from: org.greenrobot.greendao.async.a$a, reason: collision with other inner class name */
    public static /* synthetic */ class C1201a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[AsyncOperation.OperationType.values().length];
            a = iArr;
            try {
                iArr[AsyncOperation.OperationType.Delete.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[AsyncOperation.OperationType.DeleteInTxIterable.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[AsyncOperation.OperationType.DeleteInTxArray.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[AsyncOperation.OperationType.Insert.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[AsyncOperation.OperationType.InsertInTxIterable.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[AsyncOperation.OperationType.InsertInTxArray.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[AsyncOperation.OperationType.InsertOrReplace.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[AsyncOperation.OperationType.InsertOrReplaceInTxIterable.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[AsyncOperation.OperationType.InsertOrReplaceInTxArray.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[AsyncOperation.OperationType.Update.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[AsyncOperation.OperationType.UpdateInTxIterable.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[AsyncOperation.OperationType.UpdateInTxArray.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                a[AsyncOperation.OperationType.TransactionRunnable.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                a[AsyncOperation.OperationType.TransactionCallable.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                a[AsyncOperation.OperationType.QueryList.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                a[AsyncOperation.OperationType.QueryUnique.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                a[AsyncOperation.OperationType.DeleteByKey.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                a[AsyncOperation.OperationType.DeleteAll.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                a[AsyncOperation.OperationType.Load.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                a[AsyncOperation.OperationType.LoadAll.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                a[AsyncOperation.OperationType.Count.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                a[AsyncOperation.OperationType.Refresh.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
        }
    }

    private void b(AsyncOperation asyncOperation) {
        asyncOperation.f = System.currentTimeMillis();
        try {
            switch (C1201a.a[asyncOperation.a.ordinal()]) {
                case 1:
                    asyncOperation.b.delete(asyncOperation.d);
                    break;
                case 2:
                    asyncOperation.b.deleteInTx((Iterable<Object>) asyncOperation.d);
                    break;
                case 3:
                    asyncOperation.b.deleteInTx((Object[]) asyncOperation.d);
                    break;
                case 4:
                    asyncOperation.b.insert(asyncOperation.d);
                    break;
                case 5:
                    asyncOperation.b.insertInTx((Iterable<Object>) asyncOperation.d);
                    break;
                case 6:
                    asyncOperation.b.insertInTx((Object[]) asyncOperation.d);
                    break;
                case 7:
                    asyncOperation.b.insertOrReplace(asyncOperation.d);
                    break;
                case 8:
                    asyncOperation.b.insertOrReplaceInTx((Iterable<Object>) asyncOperation.d);
                    break;
                case 9:
                    asyncOperation.b.insertOrReplaceInTx((Object[]) asyncOperation.d);
                    break;
                case 10:
                    asyncOperation.b.update(asyncOperation.d);
                    break;
                case 11:
                    asyncOperation.b.updateInTx((Iterable<Object>) asyncOperation.d);
                    break;
                case 12:
                    asyncOperation.b.updateInTx((Object[]) asyncOperation.d);
                    break;
                case 13:
                    e(asyncOperation);
                    break;
                case 14:
                    d(asyncOperation);
                    break;
                case 15:
                    asyncOperation.k = ((Query) asyncOperation.d).forCurrentThread().list();
                    break;
                case 16:
                    asyncOperation.k = ((Query) asyncOperation.d).forCurrentThread().unique();
                    break;
                case 17:
                    asyncOperation.b.deleteByKey(asyncOperation.d);
                    break;
                case 18:
                    asyncOperation.b.deleteAll();
                    break;
                case 19:
                    asyncOperation.k = asyncOperation.b.load(asyncOperation.d);
                    break;
                case 20:
                    asyncOperation.k = asyncOperation.b.loadAll();
                    break;
                case 21:
                    asyncOperation.k = Long.valueOf(asyncOperation.b.count());
                    break;
                case 22:
                    asyncOperation.b.refresh(asyncOperation.d);
                    break;
                default:
                    throw new DaoException("Unsupported operation: " + asyncOperation.a);
            }
        } catch (Throwable th) {
            asyncOperation.i = th;
        }
        asyncOperation.g = System.currentTimeMillis();
    }

    private void c(AsyncOperation asyncOperation) {
        b(asyncOperation);
        j(asyncOperation);
    }

    private void d(AsyncOperation asyncOperation) throws Exception {
        Database databaseA = asyncOperation.a();
        databaseA.beginTransaction();
        try {
            asyncOperation.k = ((Callable) asyncOperation.d).call();
            databaseA.setTransactionSuccessful();
        } finally {
            databaseA.endTransaction();
        }
    }

    private void e(AsyncOperation asyncOperation) {
        Database databaseA = asyncOperation.a();
        databaseA.beginTransaction();
        try {
            ((Runnable) asyncOperation.d).run();
            databaseA.setTransactionSuccessful();
        } finally {
            databaseA.endTransaction();
        }
    }

    private void j(AsyncOperation asyncOperation) {
        asyncOperation.d();
        AsyncOperationListener asyncOperationListener = this.d;
        if (asyncOperationListener != null) {
            asyncOperationListener.onAsyncOperationCompleted(asyncOperation);
        }
        if (this.e != null) {
            if (this.i == null) {
                this.i = new Handler(Looper.getMainLooper(), this);
            }
            this.i.sendMessage(this.i.obtainMessage(1, asyncOperation));
        }
        synchronized (this) {
            int i = this.h + 1;
            this.h = i;
            if (i == this.g) {
                notifyAll();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x007e  */
    /* JADX WARN: Code duplicated, block: B:31:0x008c A[LOOP:1: B:29:0x0086->B:31:0x008c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:32:0x0098  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a7 A[LOOP:2: B:33:0x00a1->B:35:0x00a7, LOOP_END] */
    private void l(AsyncOperation asyncOperation, AsyncOperation asyncOperation2) {
        int size;
        ArrayList<AsyncOperation> arrayList = new ArrayList();
        arrayList.add(asyncOperation);
        arrayList.add(asyncOperation2);
        Database databaseA = asyncOperation.a();
        databaseA.beginTransaction();
        boolean z = false;
        int i = 0;
        while (true) {
            try {
                boolean z2 = true;
                try {
                    if (i < arrayList.size()) {
                        AsyncOperation asyncOperation3 = (AsyncOperation) arrayList.get(i);
                        b(asyncOperation3);
                        if (!asyncOperation3.isFailed()) {
                            if (i == arrayList.size() - 1) {
                                AsyncOperation asyncOperationPeek = this.a.peek();
                                if (i >= this.c || !asyncOperation3.b(asyncOperationPeek)) {
                                    databaseA.setTransactionSuccessful();
                                } else {
                                    AsyncOperation asyncOperationRemove = this.a.remove();
                                    if (asyncOperationRemove != asyncOperationPeek) {
                                        throw new DaoException("Internal error: peeked op did not match removed op");
                                    }
                                    arrayList.add(asyncOperationRemove);
                                }
                            }
                            i++;
                        }
                        databaseA.endTransaction();
                        z = z2;
                        if (z) {
                            size = arrayList.size();
                            for (AsyncOperation asyncOperation4 : arrayList) {
                                asyncOperation4.l = size;
                                j(asyncOperation4);
                            }
                            return;
                        }
                        DaoLog.i("Reverted merged transaction because one of the operations failed. Executing operations one by one instead...");
                        for (AsyncOperation asyncOperation5 : arrayList) {
                            asyncOperation5.c();
                            c(asyncOperation5);
                        }
                        return;
                    }
                    databaseA.endTransaction();
                    z = z2;
                } catch (RuntimeException e) {
                    DaoLog.i("Async transaction could not be ended, success so far was: " + z2, e);
                }
                z2 = false;
                if (z) {
                    size = arrayList.size();
                    while (r9.hasNext()) {
                        asyncOperation4.l = size;
                        j(asyncOperation4);
                    }
                    return;
                }
                DaoLog.i("Reverted merged transaction because one of the operations failed. Executing operations one by one instead...");
                while (r8.hasNext()) {
                    asyncOperation5.c();
                    c(asyncOperation5);
                }
                return;
            } catch (Throwable th) {
                try {
                    databaseA.endTransaction();
                } catch (RuntimeException e2) {
                    DaoLog.i("Async transaction could not be ended, success so far was: false", e2);
                }
                throw th;
            }
        }
    }

    public void a(AsyncOperation asyncOperation) {
        synchronized (this) {
            int i = this.j + 1;
            this.j = i;
            asyncOperation.m = i;
            this.a.add(asyncOperation);
            this.g++;
            if (!this.b) {
                this.b = true;
                k.execute(this);
            }
        }
    }

    public AsyncOperationListener f() {
        return this.d;
    }

    public AsyncOperationListener g() {
        return this.e;
    }

    public int h() {
        return this.c;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        AsyncOperationListener asyncOperationListener = this.e;
        if (asyncOperationListener == null) {
            return false;
        }
        asyncOperationListener.onAsyncOperationCompleted((AsyncOperation) message.obj);
        return false;
    }

    public int i() {
        return this.f;
    }

    public synchronized boolean k() {
        return this.g == this.h;
    }

    public void m(AsyncOperationListener asyncOperationListener) {
        this.d = asyncOperationListener;
    }

    public void n(AsyncOperationListener asyncOperationListener) {
        this.e = asyncOperationListener;
    }

    public void o(int i) {
        this.c = i;
    }

    public void p(int i) {
        this.f = i;
    }

    public synchronized void q() {
        while (!k()) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new DaoException("Interrupted while waiting for all operations to complete", e);
            }
        }
    }

    public synchronized boolean r(int i) {
        if (!k()) {
            try {
                wait(i);
            } catch (InterruptedException e) {
                throw new DaoException("Interrupted while waiting for all operations to complete", e);
            }
        }
        return k();
    }

    @Override // java.lang.Runnable
    public void run() {
        AsyncOperation asyncOperationPoll;
        while (true) {
            try {
                try {
                    AsyncOperation asyncOperationPoll2 = this.a.poll(1L, TimeUnit.SECONDS);
                    if (asyncOperationPoll2 == null) {
                        synchronized (this) {
                            asyncOperationPoll2 = this.a.poll();
                            if (asyncOperationPoll2 == null) {
                                this.b = false;
                                this.b = false;
                                return;
                            }
                        }
                    }
                    if (!asyncOperationPoll2.isMergeTx() || (asyncOperationPoll = this.a.poll(this.f, TimeUnit.MILLISECONDS)) == null) {
                        c(asyncOperationPoll2);
                    } else if (asyncOperationPoll2.b(asyncOperationPoll)) {
                        l(asyncOperationPoll2, asyncOperationPoll);
                    } else {
                        c(asyncOperationPoll2);
                        c(asyncOperationPoll);
                    }
                } catch (InterruptedException e) {
                    DaoLog.w(Thread.currentThread().getName() + " was interruppted", e);
                    this.b = false;
                    return;
                }
            } catch (Throwable th) {
                this.b = false;
                throw th;
            }
        }
    }
}
