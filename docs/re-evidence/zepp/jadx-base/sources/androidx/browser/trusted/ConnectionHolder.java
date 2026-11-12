package androidx.browser.trusted;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.support.customtabs.trusted.ITrustedWebActivityService;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
class ConnectionHolder implements ServiceConnection {
    private static final int STATE_AWAITING_CONNECTION = 0;
    private static final int STATE_CANCELLED = 3;
    private static final int STATE_CONNECTED = 1;
    private static final int STATE_DISCONNECTED = 2;

    @Nullable
    private Exception mCancellationException;

    @NonNull
    private final Runnable mCloseRunnable;

    @NonNull
    private List<CallbackToFutureAdapter.Completer<TrustedWebActivityServiceConnection>> mCompleters;

    @Nullable
    private TrustedWebActivityServiceConnection mService;
    private int mState;

    @NonNull
    private final WrapperFactory mWrapperFactory;

    public static class WrapperFactory {
        @NonNull
        public TrustedWebActivityServiceConnection create(ComponentName name, IBinder iBinder) {
            return new TrustedWebActivityServiceConnection(ITrustedWebActivityService.Stub.asInterface(iBinder), name);
        }
    }

    @MainThread
    public ConnectionHolder(@NonNull Runnable closeRunnable) {
        this(closeRunnable, new WrapperFactory());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$getServiceWrapper$0(CallbackToFutureAdapter.Completer completer) throws Exception {
        int i = this.mState;
        if (i == 0) {
            this.mCompleters.add(completer);
        } else {
            if (i != 1) {
                if (i == 2) {
                    throw new IllegalStateException("Service has been disconnected.");
                }
                if (i != 3) {
                    throw new IllegalStateException("Connection state is invalid");
                }
                throw this.mCancellationException;
            }
            TrustedWebActivityServiceConnection trustedWebActivityServiceConnection = this.mService;
            if (trustedWebActivityServiceConnection == null) {
                throw new IllegalStateException("ConnectionHolder state is incorrect.");
            }
            completer.set(trustedWebActivityServiceConnection);
        }
        return "ConnectionHolder, state = " + this.mState;
    }

    @MainThread
    public void cancel(@NonNull Exception exception) {
        Iterator<CallbackToFutureAdapter.Completer<TrustedWebActivityServiceConnection>> it2 = this.mCompleters.iterator();
        while (it2.hasNext()) {
            it2.next().setException(exception);
        }
        this.mCompleters.clear();
        this.mCloseRunnable.run();
        this.mState = 3;
        this.mCancellationException = exception;
    }

    @NonNull
    @MainThread
    public ListenableFuture<TrustedWebActivityServiceConnection> getServiceWrapper() {
        return CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.browser.trusted.a
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                return this.a.lambda$getServiceWrapper$0(completer);
            }
        });
    }

    @Override // android.content.ServiceConnection
    @MainThread
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.mService = this.mWrapperFactory.create(componentName, iBinder);
        Iterator<CallbackToFutureAdapter.Completer<TrustedWebActivityServiceConnection>> it2 = this.mCompleters.iterator();
        while (it2.hasNext()) {
            it2.next().set(this.mService);
        }
        this.mCompleters.clear();
        this.mState = 1;
    }

    @Override // android.content.ServiceConnection
    @MainThread
    public void onServiceDisconnected(ComponentName componentName) {
        this.mService = null;
        this.mCloseRunnable.run();
        this.mState = 2;
    }

    @MainThread
    public ConnectionHolder(@NonNull Runnable closeRunnable, @NonNull WrapperFactory factory) {
        this.mState = 0;
        this.mCompleters = new ArrayList();
        this.mCloseRunnable = closeRunnable;
        this.mWrapperFactory = factory;
    }
}
