package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.view.Surface;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.AsyncFunction;
import androidx.camera.core.impl.utils.futures.FutureChain;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
class SynchronizedCaptureSessionImpl extends SynchronizedCaptureSessionBaseImpl {
    private static final String TAG = "SyncCaptureSessionImpl";
    private final CameraCaptureSession.CaptureCallback mCaptureCallback;

    @Nullable
    @GuardedBy("mObjectLock")
    private List<DeferrableSurface> mDeferrableSurfaces;

    @NonNull
    private final Set<String> mEnabledFeature;

    @GuardedBy("mObjectLock")
    private boolean mHasSubmittedRepeating;
    private final Object mObjectLock;

    @Nullable
    @GuardedBy("mObjectLock")
    public ListenableFuture<Void> mOpeningCaptureSession;
    public CallbackToFutureAdapter.Completer<Void> mStartStreamingCompleter;

    @NonNull
    private final ListenableFuture<Void> mStartStreamingFuture;

    @Nullable
    @GuardedBy("mObjectLock")
    public ListenableFuture<List<Surface>> mStartingSurface;

    public SynchronizedCaptureSessionImpl(@NonNull Set<String> enabledFeature, @NonNull CaptureSessionRepository repository, @NonNull Executor executor, @NonNull ScheduledExecutorService scheduledExecutorService, @NonNull Handler compatHandler) {
        super(repository, executor, scheduledExecutorService, compatHandler);
        this.mObjectLock = new Object();
        this.mCaptureCallback = new CameraCaptureSession.CaptureCallback() { // from class: androidx.camera.camera2.internal.SynchronizedCaptureSessionImpl.1
            @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
            public void onCaptureSequenceAborted(@NonNull CameraCaptureSession session, int sequenceId) {
                CallbackToFutureAdapter.Completer<Void> completer = SynchronizedCaptureSessionImpl.this.mStartStreamingCompleter;
                if (completer != null) {
                    completer.setCancelled();
                    SynchronizedCaptureSessionImpl.this.mStartStreamingCompleter = null;
                }
            }

            @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
            public void onCaptureStarted(@NonNull CameraCaptureSession session, @NonNull CaptureRequest request, long timestamp, long frameNumber) {
                CallbackToFutureAdapter.Completer<Void> completer = SynchronizedCaptureSessionImpl.this.mStartStreamingCompleter;
                if (completer != null) {
                    completer.set(null);
                    SynchronizedCaptureSessionImpl.this.mStartStreamingCompleter = null;
                }
            }
        };
        this.mEnabledFeature = enabledFeature;
        if (enabledFeature.contains(SynchronizedCaptureSessionOpener.FEATURE_WAIT_FOR_REQUEST)) {
            this.mStartStreamingFuture = CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.camera2.internal.q0
                @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
                public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                    return this.a.lambda$new$0(completer);
                }
            });
        } else {
            this.mStartStreamingFuture = Futures.immediateFuture(null);
        }
    }

    public static void forceOnClosed(@NonNull Set<SynchronizedCaptureSession> sessions) {
        for (SynchronizedCaptureSession synchronizedCaptureSession : sessions) {
            synchronizedCaptureSession.getStateCallback().onClosed(synchronizedCaptureSession);
        }
    }

    private void forceOnConfigureFailed(@NonNull Set<SynchronizedCaptureSession> sessions) {
        for (SynchronizedCaptureSession synchronizedCaptureSession : sessions) {
            synchronizedCaptureSession.getStateCallback().onConfigureFailed(synchronizedCaptureSession);
        }
    }

    private List<ListenableFuture<Void>> getBlockerFuture(@NonNull String feature, List<SynchronizedCaptureSession> sessions) {
        ArrayList arrayList = new ArrayList();
        Iterator<SynchronizedCaptureSession> it2 = sessions.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().getSynchronizedBlocker(feature));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$close$2() {
        debugLog("Session call super.close()");
        super.close();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$new$0(CallbackToFutureAdapter.Completer completer) throws Exception {
        this.mStartStreamingCompleter = completer;
        return "StartStreamingFuture[session=" + this + "]";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ListenableFuture lambda$openCaptureSession$1(CameraDevice cameraDevice, SessionConfigurationCompat sessionConfigurationCompat, List list, List list2) throws Exception {
        return super.openCaptureSession(cameraDevice, sessionConfigurationCompat, list);
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSessionBaseImpl, androidx.camera.camera2.internal.SynchronizedCaptureSession
    public void close() {
        debugLog("Session call close()");
        if (this.mEnabledFeature.contains(SynchronizedCaptureSessionOpener.FEATURE_WAIT_FOR_REQUEST)) {
            synchronized (this.mObjectLock) {
                if (!this.mHasSubmittedRepeating) {
                    this.mStartStreamingFuture.cancel(true);
                }
            }
        }
        this.mStartStreamingFuture.addListener(new Runnable() { // from class: androidx.camera.camera2.internal.r0
            @Override // java.lang.Runnable
            public final void run() {
                this.a.lambda$close$2();
            }
        }, getExecutor());
    }

    public void closeConfiguredDeferrableSurfaces() {
        synchronized (this.mObjectLock) {
            if (this.mDeferrableSurfaces == null) {
                debugLog("deferrableSurface == null, maybe forceClose, skip close");
                return;
            }
            if (this.mEnabledFeature.contains(SynchronizedCaptureSessionOpener.FEATURE_DEFERRABLE_SURFACE_CLOSE)) {
                Iterator<DeferrableSurface> it2 = this.mDeferrableSurfaces.iterator();
                while (it2.hasNext()) {
                    it2.next().close();
                }
                debugLog("deferrableSurface closed");
            }
        }
    }

    public void debugLog(String message) {
        Logger.d(TAG, "[" + this + "] " + message);
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSessionBaseImpl, androidx.camera.camera2.internal.SynchronizedCaptureSession
    @NonNull
    public ListenableFuture<Void> getSynchronizedBlocker(@NonNull String feature) {
        feature.hashCode();
        return !feature.equals(SynchronizedCaptureSessionOpener.FEATURE_WAIT_FOR_REQUEST) ? super.getSynchronizedBlocker(feature) : Futures.nonCancellationPropagating(this.mStartStreamingFuture);
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSessionBaseImpl, androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
    public void onClosed(@NonNull SynchronizedCaptureSession session) {
        closeConfiguredDeferrableSurfaces();
        debugLog("onClosed()");
        super.onClosed(session);
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSessionBaseImpl, androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
    public void onConfigured(@NonNull SynchronizedCaptureSession session) {
        SynchronizedCaptureSession next;
        SynchronizedCaptureSession next2;
        debugLog("Session onConfigured()");
        if (this.mEnabledFeature.contains(SynchronizedCaptureSessionOpener.FEATURE_FORCE_CLOSE)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator<SynchronizedCaptureSession> it2 = this.mCaptureSessionRepository.getCreatingCaptureSessions().iterator();
            while (it2.hasNext() && (next2 = it2.next()) != session) {
                linkedHashSet.add(next2);
            }
            forceOnConfigureFailed(linkedHashSet);
        }
        super.onConfigured(session);
        if (this.mEnabledFeature.contains(SynchronizedCaptureSessionOpener.FEATURE_FORCE_CLOSE)) {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            Iterator<SynchronizedCaptureSession> it3 = this.mCaptureSessionRepository.getCaptureSessions().iterator();
            while (it3.hasNext() && (next = it3.next()) != session) {
                linkedHashSet2.add(next);
            }
            forceOnClosed(linkedHashSet2);
        }
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSessionBaseImpl, androidx.camera.camera2.internal.SynchronizedCaptureSessionOpener.OpenerImpl
    @NonNull
    public ListenableFuture<Void> openCaptureSession(@NonNull final CameraDevice cameraDevice, @NonNull final SessionConfigurationCompat sessionConfigurationCompat, @NonNull final List<DeferrableSurface> deferrableSurfaces) {
        ListenableFuture<Void> listenableFutureNonCancellationPropagating;
        synchronized (this.mObjectLock) {
            FutureChain futureChainTransformAsync = FutureChain.from(Futures.successfulAsList(getBlockerFuture(SynchronizedCaptureSessionOpener.FEATURE_WAIT_FOR_REQUEST, this.mCaptureSessionRepository.getClosingCaptureSession()))).transformAsync(new AsyncFunction() { // from class: androidx.camera.camera2.internal.p0
                @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
                public final ListenableFuture apply(Object obj) {
                    return this.a.lambda$openCaptureSession$1(cameraDevice, sessionConfigurationCompat, deferrableSurfaces, (List) obj);
                }
            }, CameraXExecutors.directExecutor());
            this.mOpeningCaptureSession = futureChainTransformAsync;
            listenableFutureNonCancellationPropagating = Futures.nonCancellationPropagating(futureChainTransformAsync);
        }
        return listenableFutureNonCancellationPropagating;
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSessionBaseImpl, androidx.camera.camera2.internal.SynchronizedCaptureSession
    public int setSingleRepeatingRequest(@NonNull CaptureRequest request, @NonNull CameraCaptureSession.CaptureCallback listener) throws CameraAccessException {
        int singleRepeatingRequest;
        if (!this.mEnabledFeature.contains(SynchronizedCaptureSessionOpener.FEATURE_WAIT_FOR_REQUEST)) {
            return super.setSingleRepeatingRequest(request, listener);
        }
        synchronized (this.mObjectLock) {
            this.mHasSubmittedRepeating = true;
            singleRepeatingRequest = super.setSingleRepeatingRequest(request, Camera2CaptureCallbacks.createComboCallback(this.mCaptureCallback, listener));
        }
        return singleRepeatingRequest;
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSessionBaseImpl, androidx.camera.camera2.internal.SynchronizedCaptureSessionOpener.OpenerImpl
    @NonNull
    public ListenableFuture<List<Surface>> startWithDeferrableSurface(@NonNull List<DeferrableSurface> deferrableSurfaces, long timeout) {
        ListenableFuture<List<Surface>> listenableFutureNonCancellationPropagating;
        synchronized (this.mObjectLock) {
            this.mDeferrableSurfaces = deferrableSurfaces;
            listenableFutureNonCancellationPropagating = Futures.nonCancellationPropagating(super.startWithDeferrableSurface(deferrableSurfaces, timeout));
        }
        return listenableFutureNonCancellationPropagating;
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSessionBaseImpl, androidx.camera.camera2.internal.SynchronizedCaptureSessionOpener.OpenerImpl
    public boolean stop() {
        boolean zStop;
        synchronized (this.mObjectLock) {
            if (isCameraCaptureSessionOpen()) {
                closeConfiguredDeferrableSurfaces();
            } else {
                ListenableFuture<Void> listenableFuture = this.mOpeningCaptureSession;
                if (listenableFuture != null) {
                    listenableFuture.cancel(true);
                }
                ListenableFuture<List<Surface>> listenableFuture2 = this.mStartingSurface;
                if (listenableFuture2 != null) {
                    listenableFuture2.cancel(true);
                }
            }
            zStop = super.stop();
        }
        return zStop;
    }
}
