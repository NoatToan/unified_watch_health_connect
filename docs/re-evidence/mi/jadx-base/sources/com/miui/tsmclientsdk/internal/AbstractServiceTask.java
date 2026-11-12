package com.miui.tsmclientsdk.internal;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import com.miui.tsmclientsdk.MiTsmConstants;
import com.miui.tsmclientsdk.MiTsmFuture;
import com.miui.tsmclientsdk.OnProgressUpdateListener;
import com.miui.tsmclientsdk.OperationCanceledException;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractServiceTask<T extends IInterface, R> extends FutureTask<Bundle> implements ServiceConnection, MiTsmFuture<Bundle> {
    private static final String TASK = "serviceTask:";
    private static final AtomicLong sTaskId = new AtomicLong();
    protected final String TAG;
    private Context mContext;
    protected String mId;
    private boolean mIsBound;
    private boolean mIsLaunchActivity;
    private CountDownLatch mLatch;
    private OnProgressUpdateListener mProgressListener;
    protected R mResponse;
    protected T mService;
    private List<? super AbstractServiceTask> mTaskList;

    public class SimpleResponse {
        private final String mTaskId;

        public SimpleResponse(AbstractServiceTask abstractServiceTask) {
            this(null);
        }

        public String getId() throws RemoteException {
            return this.mTaskId;
        }

        public void onError(int i, String str) throws RemoteException {
            String str2 = AbstractServiceTask.this.TAG;
            StringBuilder sb = new StringBuilder();
            sb.append("on Error: code=");
            sb.append(i);
            sb.append(" msg=");
            sb.append(str);
            Bundle bundle = new Bundle();
            bundle.putInt(MiTsmConstants.KEY_RESULT_CODE, i);
            bundle.putString(MiTsmConstants.KEY_RESULT_MSG, str);
            AbstractServiceTask.this.set(bundle);
        }

        public void onProgress(int i) throws RemoteException {
            String str = AbstractServiceTask.this.TAG;
            StringBuilder sb = new StringBuilder();
            sb.append("on progress: ");
            sb.append(i);
            if (AbstractServiceTask.this.mProgressListener != null) {
                AbstractServiceTask.this.mProgressListener.onProgress(i);
            }
        }

        public void onResult(Bundle bundle) throws RemoteException {
            bundle.setClassLoader(AbstractServiceTask.class.getClassLoader());
            bundle.putInt(MiTsmConstants.KEY_RESULT_CODE, 0);
            Intent intent = (Intent) bundle.getParcelable("key_intent");
            if (intent == null || !AbstractServiceTask.this.mIsLaunchActivity) {
                AbstractServiceTask.this.set(bundle);
                return;
            }
            if (!(AbstractServiceTask.this.mContext instanceof Activity)) {
                intent.addFlags(268435456);
            }
            AbstractServiceTask.this.mContext.startActivity(intent);
        }

        public SimpleResponse(String str) {
            this.mTaskId = str;
        }
    }

    public AbstractServiceTask(Context context) {
        this(context, false);
    }

    private void bind() {
        if (this.mIsBound) {
            return;
        }
        if (!bindService()) {
            StringBuilder sb = new StringBuilder();
            sb.append(TASK);
            sb.append(this.mId);
            sb.append(" bind service failed");
            throw new IllegalStateException("no service is bond");
        }
        this.mIsBound = true;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(TASK);
        sb2.append(this.mId);
        sb2.append(" bind service success");
    }

    private boolean bindService() {
        return this.mContext.bindService(getServiceIntent(), this, 1);
    }

    private void ensureNotOnMainThread() {
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper == null || looperMyLooper != this.mContext.getMainLooper()) {
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException("calling this from your main thread can lead to deadlock");
        illegalStateException.getMessage();
        throw illegalStateException;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0047 A[PHI: r3
      0x0047: PHI (r3v4 java.util.List<? super com.miui.tsmclientsdk.internal.AbstractServiceTask>) = 
      (r3v1 java.util.List<? super com.miui.tsmclientsdk.internal.AbstractServiceTask>)
      (r3v3 java.util.List<? super com.miui.tsmclientsdk.internal.AbstractServiceTask>)
      (r3v6 java.util.List<? super com.miui.tsmclientsdk.internal.AbstractServiceTask>)
     binds: [B:33:0x004d, B:30:0x0045, B:36:0x0052] A[DONT_GENERATE, DONT_INLINE]] */
    private Bundle internalGetResult(Long l, TimeUnit timeUnit) throws ExecutionException, OperationCanceledException, IOException {
        List<? super AbstractServiceTask> list;
        if (!isDone()) {
            ensureNotOnMainThread();
        }
        try {
            try {
                if (timeUnit == null) {
                    Bundle bundle = get();
                    List<? super AbstractServiceTask> list2 = this.mTaskList;
                    if (list2 != null) {
                        list2.remove(this);
                    }
                    return bundle;
                }
                Bundle bundle2 = get(l.longValue(), timeUnit);
                List<? super AbstractServiceTask> list3 = this.mTaskList;
                if (list3 != null) {
                    list3.remove(this);
                }
                return bundle2;
            } catch (InterruptedException unused) {
                list = this.mTaskList;
                if (list != null) {
                    list.remove(this);
                }
                throw new OperationCanceledException();
            } catch (CancellationException unused2) {
                list = this.mTaskList;
                if (list != null) {
                    list.remove(this);
                }
                throw new OperationCanceledException();
            } catch (ExecutionException e) {
                Throwable cause = e.getCause();
                if (cause instanceof IOException) {
                    throw ((IOException) cause);
                }
                throw e;
            } catch (TimeoutException unused3) {
                list = this.mTaskList;
                if (list != null) {
                    list.remove(this);
                }
                throw new OperationCanceledException();
            }
        } catch (Throwable th) {
            List<? super AbstractServiceTask> list4 = this.mTaskList;
            if (list4 != null) {
                list4.remove(this);
            }
            throw th;
        }
    }

    private synchronized void unbind() {
        try {
            if (this.mIsBound) {
                StringBuilder sb = new StringBuilder();
                sb.append(TASK);
                sb.append(this.mId);
                sb.append(" unbind service with synchronized");
                this.mIsBound = false;
                try {
                    this.mContext.unbindService(this);
                } catch (Exception unused) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(TASK);
                    sb2.append(this.mId);
                    sb2.append(" unbind service failed");
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public abstract T asInterface(IBinder iBinder);

    @Override // java.util.concurrent.FutureTask, java.util.concurrent.Future, com.miui.tsmclientsdk.MiTsmFuture
    public boolean cancel(boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append(TASK);
        sb.append(this.mId);
        sb.append(" is canceling");
        T t = this.mService;
        if (t != null && !TextUtils.isEmpty(this.mId)) {
            try {
                Method method = t.getClass().getMethod("cancelTask", String.class);
                method.setAccessible(true);
                method.invoke(t, this.mId);
            } catch (NoSuchMethodException | Exception unused) {
            }
        }
        List<? super AbstractServiceTask> list = this.mTaskList;
        if (list != null) {
            list.remove(this);
        }
        return super.cancel(true);
    }

    public abstract void doWork() throws RemoteException;

    public abstract R getResponse();

    public abstract Intent getServiceIntent();

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        StringBuilder sb = new StringBuilder();
        sb.append(TASK);
        sb.append(this.mId);
        sb.append(" onServiceConnected, component:");
        sb.append(componentName);
        this.mService = (T) asInterface(iBinder);
        this.mLatch.countDown();
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        StringBuilder sb = new StringBuilder();
        sb.append(TASK);
        sb.append(this.mId);
        sb.append(" onServiceDisconnected");
        isDone();
        this.mService = null;
    }

    @Override // java.util.concurrent.FutureTask
    public void setException(Throwable th) {
        super.setException(th);
        unbind();
    }

    public final MiTsmFuture<Bundle> start() {
        StringBuilder sb = new StringBuilder();
        sb.append(TASK);
        sb.append(this.mId);
        sb.append(" start");
        List<? super AbstractServiceTask> list = this.mTaskList;
        if (list != null) {
            list.add(this);
        }
        try {
            bind();
            this.mLatch.await();
            doWork();
        } catch (InterruptedException unused) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(TASK);
            sb2.append(this.mId);
            sb2.append(" start is interrupted");
            Bundle bundle = new Bundle();
            bundle.putInt(MiTsmConstants.KEY_RESULT_CODE, 3);
            bundle.putString(MiTsmConstants.KEY_RESULT_MSG, "start serviceTask is interrupted");
            set(bundle);
        } catch (Exception e) {
            setException(e);
        }
        return this;
    }

    public AbstractServiceTask(Context context, boolean z) {
        this(context, z, null);
    }

    @Override // java.util.concurrent.FutureTask
    public void set(Bundle bundle) {
        super.set(bundle);
        unbind();
    }

    public AbstractServiceTask(Context context, boolean z, OnProgressUpdateListener onProgressUpdateListener) {
        this(context, null, z, onProgressUpdateListener, null);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.miui.tsmclientsdk.MiTsmFuture
    public Bundle getResult() throws ExecutionException, OperationCanceledException, IOException {
        return internalGetResult(null, null);
    }

    public AbstractServiceTask(Context context, String str, boolean z, OnProgressUpdateListener onProgressUpdateListener, List<? super AbstractServiceTask> list) {
        String str2;
        super(new Callable<Bundle>() { // from class: com.miui.tsmclientsdk.internal.AbstractServiceTask.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Bundle call() throws Exception {
                throw new IllegalStateException("this should never be called");
            }
        });
        this.TAG = getClass().getSimpleName();
        this.mIsBound = false;
        this.mIsLaunchActivity = false;
        this.mLatch = new CountDownLatch(1);
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getName());
        if (str == null) {
            str2 = "";
        } else {
            str2 = "-" + str;
        }
        sb.append(str2);
        sb.append("-");
        sb.append(sTaskId.getAndIncrement());
        sb.append("-");
        sb.append(System.currentTimeMillis());
        this.mId = sb.toString();
        this.mContext = context;
        this.mResponse = getResponse();
        this.mIsLaunchActivity = z;
        this.mProgressListener = onProgressUpdateListener;
        this.mTaskList = list;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.miui.tsmclientsdk.MiTsmFuture
    public Bundle getResult(long j, TimeUnit timeUnit) throws ExecutionException, OperationCanceledException, IOException {
        return internalGetResult(Long.valueOf(j), timeUnit);
    }
}
