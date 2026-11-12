package com.amazon.identity.auth.device.thread;

import android.os.Bundle;
import com.amazon.identity.auth.device.AuthError;
import com.amazon.identity.auth.device.authorization.api.AuthorizationListener;
import com.amazon.identity.auth.device.authorization.api.AuthzConstants;
import com.amazon.identity.auth.device.shared.APIListener;
import com.amazon.identity.auth.map.device.utils.MAPLog;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes2.dex */
public class MAPCallbackFuture implements Future<Bundle>, APIListener {
    private static final String LOG_TAG = MAPCallbackFuture.class.getName();
    private static final String MAIN_THREAD_ERROR_MSG = "Cannot call get on the main thread, unless you want ANRs";
    public AuthError mError;
    public final CountDownLatch mLatch;
    public final AuthorizationListener mListener;
    public Bundle mSuccessResult;

    public MAPCallbackFuture() {
        this(null);
    }

    private void throwOnMainThread() {
        if (ThreadUtils.isRunningOnMainThread()) {
            MAPLog.e(LOG_TAG, MAIN_THREAD_ERROR_MSG);
            throw new IllegalStateException(MAIN_THREAD_ERROR_MSG);
        }
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        return false;
    }

    public Bundle getResultHelper() {
        AuthError authError = this.mError;
        if (authError == null) {
            return this.mSuccessResult;
        }
        Bundle errorBundle = AuthError.getErrorBundle(authError);
        errorBundle.putSerializable(AuthzConstants.BUNDLE_KEY.FUTURE.val, AuthzConstants.FUTURE_TYPE.ERROR);
        return errorBundle;
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.mLatch.getCount() == 0;
    }

    public MAPCallbackFuture(AuthorizationListener authorizationListener) {
        this.mListener = authorizationListener == null ? new DefaultAuthorizationListener() : authorizationListener;
        this.mLatch = new CountDownLatch(1);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.amazon.identity.auth.device.api.Listener
    public void onError(AuthError authError) {
        this.mError = authError;
        this.mLatch.countDown();
        this.mListener.onError(authError);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.amazon.identity.auth.device.api.Listener
    public void onSuccess(Bundle bundle) {
        this.mSuccessResult = bundle;
        if (bundle == null) {
            MAPLog.w(LOG_TAG, "Null Response");
            this.mSuccessResult = new Bundle();
        }
        this.mSuccessResult.putSerializable(AuthzConstants.BUNDLE_KEY.FUTURE.val, AuthzConstants.FUTURE_TYPE.SUCCESS);
        this.mLatch.countDown();
        this.mListener.onSuccess(bundle);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.concurrent.Future
    public Bundle get() throws ExecutionException, InterruptedException {
        throwOnMainThread();
        MAPLog.i(LOG_TAG, "Running get on Future");
        this.mLatch.await();
        return getResultHelper();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.concurrent.Future
    public Bundle get(long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        throwOnMainThread();
        MAPLog.i(LOG_TAG, "Running get on Future with timeout=" + j + "unit=" + timeUnit.name());
        this.mLatch.await(j, timeUnit);
        return getResultHelper();
    }
}
