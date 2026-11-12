package com.google.android.exoplayer2.drm;

import android.annotation.SuppressLint;
import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.drm.DrmSessionEventListener;
import com.google.android.exoplayer2.source.LoadEventInfo;
import com.google.android.exoplayer2.source.MediaLoadData;
import com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Consumer;
import com.google.android.exoplayer2.util.CopyOnWriteMultiset;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes2.dex */
@RequiresApi(18)
class DefaultDrmSession implements DrmSession {
    private static final int A = 60;
    private static final String x = "DefaultDrmSession";
    private static final int y = 0;
    private static final int z = 1;

    @Nullable
    public final List<DrmInitData.SchemeData> a;
    private final ExoMediaDrm b;
    private final ProvisioningManager c;
    private final ReferenceCountListener d;
    private final int e;
    private final boolean f;
    private final boolean g;
    private final HashMap<String, String> h;
    private final CopyOnWriteMultiset<DrmSessionEventListener.EventDispatcher> i;
    private final LoadErrorHandlingPolicy j;
    public final MediaDrmCallback k;
    public final UUID l;
    public final c m;
    private int n;
    private int o;

    @Nullable
    private HandlerThread p;

    @Nullable
    private a q;

    @Nullable
    private ExoMediaCrypto r;

    @Nullable
    private DrmSession.DrmSessionException s;

    @Nullable
    private byte[] t;
    private byte[] u;

    @Nullable
    private ExoMediaDrm.KeyRequest v;

    @Nullable
    private ExoMediaDrm.ProvisionRequest w;

    public interface ProvisioningManager {
        void onProvisionCompleted();

        void onProvisionError(Exception error, boolean thrownByExoMediaDrm);

        void provisionRequired(DefaultDrmSession session);
    }

    public interface ReferenceCountListener {
        void onReferenceCountDecremented(DefaultDrmSession session, int newReferenceCount);

        void onReferenceCountIncremented(DefaultDrmSession session, int newReferenceCount);
    }

    public static final class UnexpectedDrmSessionException extends IOException {
        public UnexpectedDrmSessionException(@Nullable Throwable cause) {
            super(cause);
        }
    }

    @SuppressLint({"HandlerLeak"})
    public class a extends Handler {

        @GuardedBy("this")
        private boolean a;

        public a(Looper backgroundLooper) {
            super(backgroundLooper);
        }

        private boolean a(Message originalMsg, MediaDrmCallbackException exception) {
            b bVar = (b) originalMsg.obj;
            if (!bVar.b) {
                return false;
            }
            int i = bVar.e + 1;
            bVar.e = i;
            if (i > DefaultDrmSession.this.j.getMinimumLoadableRetryCount(3)) {
                return false;
            }
            long retryDelayMsFor = DefaultDrmSession.this.j.getRetryDelayMsFor(new LoadErrorHandlingPolicy.LoadErrorInfo(new LoadEventInfo(bVar.a, exception.dataSpec, exception.uriAfterRedirects, exception.responseHeaders, SystemClock.elapsedRealtime(), SystemClock.elapsedRealtime() - bVar.c, exception.bytesLoaded), new MediaLoadData(3), exception.getCause() instanceof IOException ? (IOException) exception.getCause() : new UnexpectedDrmSessionException(exception.getCause()), bVar.e));
            if (retryDelayMsFor == C.TIME_UNSET) {
                return false;
            }
            synchronized (this) {
                if (this.a) {
                    return false;
                }
                sendMessageDelayed(Message.obtain(originalMsg), retryDelayMsFor);
                return true;
            }
        }

        public void b(int what, Object request, boolean allowRetry) {
            obtainMessage(what, new b(LoadEventInfo.getNewId(), allowRetry, SystemClock.elapsedRealtime(), request)).sendToTarget();
        }

        public synchronized void c() {
            removeCallbacksAndMessages(null);
            this.a = true;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Object objExecuteProvisionRequest;
            b bVar = (b) message.obj;
            try {
                int i = message.what;
                if (i == 0) {
                    DefaultDrmSession defaultDrmSession = DefaultDrmSession.this;
                    objExecuteProvisionRequest = defaultDrmSession.k.executeProvisionRequest(defaultDrmSession.l, (ExoMediaDrm.ProvisionRequest) bVar.d);
                } else {
                    if (i != 1) {
                        throw new RuntimeException();
                    }
                    DefaultDrmSession defaultDrmSession2 = DefaultDrmSession.this;
                    objExecuteProvisionRequest = defaultDrmSession2.k.executeKeyRequest(defaultDrmSession2.l, (ExoMediaDrm.KeyRequest) bVar.d);
                }
            } catch (MediaDrmCallbackException e) {
                boolean zA = a(message, e);
                objExecuteProvisionRequest = e;
                if (zA) {
                    return;
                }
            } catch (Exception e2) {
                Log.w(DefaultDrmSession.x, "Key/provisioning request produced an unexpected exception. Not retrying.", e2);
                objExecuteProvisionRequest = e2;
            }
            DefaultDrmSession.this.j.onLoadTaskConcluded(bVar.a);
            synchronized (this) {
                if (!this.a) {
                    DefaultDrmSession.this.m.obtainMessage(message.what, Pair.create(bVar.d, objExecuteProvisionRequest)).sendToTarget();
                }
            }
        }
    }

    public static final class b {
        public final long a;
        public final boolean b;
        public final long c;
        public final Object d;
        public int e;

        public b(long taskId, boolean allowRetry, long startTimeMs, Object request) {
            this.a = taskId;
            this.b = allowRetry;
            this.c = startTimeMs;
            this.d = request;
        }
    }

    @SuppressLint({"HandlerLeak"})
    public class c extends Handler {
        public c(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message msg) {
            Pair pair = (Pair) msg.obj;
            Object obj = pair.first;
            Object obj2 = pair.second;
            int i = msg.what;
            if (i == 0) {
                DefaultDrmSession.this.t(obj, obj2);
            } else {
                if (i != 1) {
                    return;
                }
                DefaultDrmSession.this.n(obj, obj2);
            }
        }
    }

    public DefaultDrmSession(UUID uuid, ExoMediaDrm mediaDrm, ProvisioningManager provisioningManager, ReferenceCountListener referenceCountListener, @Nullable List<DrmInitData.SchemeData> schemeDatas, int mode, boolean playClearSamplesWithoutKeys, boolean isPlaceholderSession, @Nullable byte[] offlineLicenseKeySetId, HashMap<String, String> keyRequestParameters, MediaDrmCallback callback, Looper playbackLooper, LoadErrorHandlingPolicy loadErrorHandlingPolicy) {
        if (mode == 1 || mode == 3) {
            Assertions.checkNotNull(offlineLicenseKeySetId);
        }
        this.l = uuid;
        this.c = provisioningManager;
        this.d = referenceCountListener;
        this.b = mediaDrm;
        this.e = mode;
        this.f = playClearSamplesWithoutKeys;
        this.g = isPlaceholderSession;
        if (offlineLicenseKeySetId != null) {
            this.u = offlineLicenseKeySetId;
            this.a = null;
        } else {
            this.a = Collections.unmodifiableList((List) Assertions.checkNotNull(schemeDatas));
        }
        this.h = keyRequestParameters;
        this.k = callback;
        this.i = new CopyOnWriteMultiset<>();
        this.j = loadErrorHandlingPolicy;
        this.n = 2;
        this.m = new c(playbackLooper);
    }

    private void f(Consumer<DrmSessionEventListener.EventDispatcher> event) {
        Iterator<DrmSessionEventListener.EventDispatcher> it2 = this.i.elementSet().iterator();
        while (it2.hasNext()) {
            event.accept(it2.next());
        }
    }

    @RequiresNonNull({"sessionId"})
    private void g(boolean allowRetry) {
        if (this.g) {
            return;
        }
        byte[] bArr = (byte[]) Util.castNonNull(this.t);
        int i = this.e;
        if (i != 0 && i != 1) {
            if (i == 2) {
                if (this.u == null || x()) {
                    v(bArr, 2, allowRetry);
                    return;
                }
                return;
            }
            if (i != 3) {
                return;
            }
            Assertions.checkNotNull(this.u);
            Assertions.checkNotNull(this.t);
            v(this.u, 3, allowRetry);
            return;
        }
        if (this.u == null) {
            v(bArr, 1, allowRetry);
            return;
        }
        if (this.n == 4 || x()) {
            long jH = h();
            if (this.e != 0 || jH > 60) {
                if (jH <= 0) {
                    m(new KeysExpiredException(), 2);
                    return;
                } else {
                    this.n = 4;
                    f(new Consumer() { // from class: n51
                        @Override // com.google.android.exoplayer2.util.Consumer
                        public final void accept(Object obj) {
                            ((DrmSessionEventListener.EventDispatcher) obj).drmKeysRestored();
                        }
                    });
                    return;
                }
            }
            StringBuilder sb = new StringBuilder(88);
            sb.append("Offline license has expired or will expire soon. Remaining seconds: ");
            sb.append(jH);
            Log.d(x, sb.toString());
            v(bArr, 2, allowRetry);
        }
    }

    private long h() {
        if (!C.WIDEVINE_UUID.equals(this.l)) {
            return Long.MAX_VALUE;
        }
        Pair pair = (Pair) Assertions.checkNotNull(WidevineUtil.getLicenseDurationRemainingSec(this));
        return Math.min(((Long) pair.first).longValue(), ((Long) pair.second).longValue());
    }

    @EnsuresNonNullIf(expression = {"sessionId"}, result = true)
    private boolean j() {
        int i = this.n;
        return i == 3 || i == 4;
    }

    private void m(final Exception e, int errorSource) {
        this.s = new DrmSession.DrmSessionException(e, DrmUtil.getErrorCodeForMediaDrmException(e, errorSource));
        Log.e(x, "DRM session error", e);
        f(new Consumer() { // from class: com.google.android.exoplayer2.drm.c
            @Override // com.google.android.exoplayer2.util.Consumer
            public final void accept(Object obj) {
                ((DrmSessionEventListener.EventDispatcher) obj).drmSessionManagerError(e);
            }
        });
        if (this.n != 4) {
            this.n = 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n(Object request, Object response) {
        if (request == this.v && j()) {
            this.v = null;
            if (response instanceof Exception) {
                o((Exception) response, false);
                return;
            }
            try {
                byte[] bArr = (byte[]) response;
                if (this.e == 3) {
                    this.b.provideKeyResponse((byte[]) Util.castNonNull(this.u), bArr);
                    f(new Consumer() { // from class: m51
                        @Override // com.google.android.exoplayer2.util.Consumer
                        public final void accept(Object obj) {
                            ((DrmSessionEventListener.EventDispatcher) obj).drmKeysRemoved();
                        }
                    });
                    return;
                }
                byte[] bArrProvideKeyResponse = this.b.provideKeyResponse(this.t, bArr);
                int i = this.e;
                if ((i == 2 || (i == 0 && this.u != null)) && bArrProvideKeyResponse != null && bArrProvideKeyResponse.length != 0) {
                    this.u = bArrProvideKeyResponse;
                }
                this.n = 4;
                f(new Consumer() { // from class: l51
                    @Override // com.google.android.exoplayer2.util.Consumer
                    public final void accept(Object obj) {
                        ((DrmSessionEventListener.EventDispatcher) obj).drmKeysLoaded();
                    }
                });
            } catch (Exception e) {
                o(e, true);
            }
        }
    }

    private void o(Exception e, boolean thrownByExoMediaDrm) {
        if (e instanceof NotProvisionedException) {
            this.c.provisionRequired(this);
        } else {
            m(e, thrownByExoMediaDrm ? 1 : 2);
        }
    }

    private void p() {
        if (this.e == 0 && this.n == 4) {
            Util.castNonNull(this.t);
            g(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t(Object request, Object response) {
        if (request == this.w) {
            if (this.n == 2 || j()) {
                this.w = null;
                if (response instanceof Exception) {
                    this.c.onProvisionError((Exception) response, false);
                    return;
                }
                try {
                    this.b.provideProvisionResponse((byte[]) response);
                    this.c.onProvisionCompleted();
                } catch (Exception e) {
                    this.c.onProvisionError(e, true);
                }
            }
        }
    }

    @EnsuresNonNullIf(expression = {"sessionId"}, result = true)
    private boolean u() {
        if (j()) {
            return true;
        }
        try {
            byte[] bArrOpenSession = this.b.openSession();
            this.t = bArrOpenSession;
            this.r = this.b.createMediaCrypto(bArrOpenSession);
            final int i = 3;
            this.n = 3;
            f(new Consumer() { // from class: com.google.android.exoplayer2.drm.b
                @Override // com.google.android.exoplayer2.util.Consumer
                public final void accept(Object obj) {
                    ((DrmSessionEventListener.EventDispatcher) obj).drmSessionAcquired(i);
                }
            });
            Assertions.checkNotNull(this.t);
            return true;
        } catch (NotProvisionedException unused) {
            this.c.provisionRequired(this);
            return false;
        } catch (Exception e) {
            m(e, 1);
            return false;
        }
    }

    private void v(byte[] scope, int type, boolean allowRetry) {
        try {
            this.v = this.b.getKeyRequest(scope, this.a, type, this.h);
            ((a) Util.castNonNull(this.q)).b(1, Assertions.checkNotNull(this.v), allowRetry);
        } catch (Exception e) {
            o(e, true);
        }
    }

    @RequiresNonNull({"sessionId", "offlineLicenseKeySetId"})
    private boolean x() {
        try {
            this.b.restoreKeys(this.t, this.u);
            return true;
        } catch (Exception e) {
            m(e, 1);
            return false;
        }
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public void acquire(@Nullable DrmSessionEventListener.EventDispatcher eventDispatcher) {
        Assertions.checkState(this.o >= 0);
        if (eventDispatcher != null) {
            this.i.add(eventDispatcher);
        }
        int i = this.o + 1;
        this.o = i;
        if (i == 1) {
            Assertions.checkState(this.n == 2);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.p = handlerThread;
            handlerThread.start();
            this.q = new a(this.p.getLooper());
            if (u()) {
                g(true);
            }
        } else if (eventDispatcher != null && j() && this.i.count(eventDispatcher) == 1) {
            eventDispatcher.drmSessionAcquired(this.n);
        }
        this.d.onReferenceCountIncremented(this, this.o);
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    @Nullable
    public final DrmSession.DrmSessionException getError() {
        if (this.n == 1) {
            return this.s;
        }
        return null;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    @Nullable
    public final ExoMediaCrypto getMediaCrypto() {
        return this.r;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    @Nullable
    public byte[] getOfflineLicenseKeySetId() {
        return this.u;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public final UUID getSchemeUuid() {
        return this.l;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public final int getState() {
        return this.n;
    }

    public boolean i(byte[] sessionId) {
        return Arrays.equals(this.t, sessionId);
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public boolean playClearSamplesWithoutKeys() {
        return this.f;
    }

    public void q(int what) {
        if (what != 2) {
            return;
        }
        p();
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    @Nullable
    public Map<String, String> queryKeyStatus() {
        byte[] bArr = this.t;
        if (bArr == null) {
            return null;
        }
        return this.b.queryKeyStatus(bArr);
    }

    public void r() {
        if (u()) {
            g(true);
        }
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public void release(@Nullable DrmSessionEventListener.EventDispatcher eventDispatcher) {
        Assertions.checkState(this.o > 0);
        int i = this.o - 1;
        this.o = i;
        if (i == 0) {
            this.n = 0;
            ((c) Util.castNonNull(this.m)).removeCallbacksAndMessages(null);
            ((a) Util.castNonNull(this.q)).c();
            this.q = null;
            ((HandlerThread) Util.castNonNull(this.p)).quit();
            this.p = null;
            this.r = null;
            this.s = null;
            this.v = null;
            this.w = null;
            byte[] bArr = this.t;
            if (bArr != null) {
                this.b.closeSession(bArr);
                this.t = null;
            }
        }
        if (eventDispatcher != null) {
            this.i.remove(eventDispatcher);
            if (this.i.count(eventDispatcher) == 0) {
                eventDispatcher.drmSessionReleased();
            }
        }
        this.d.onReferenceCountDecremented(this, this.o);
    }

    public void s(Exception error, boolean thrownByExoMediaDrm) {
        m(error, thrownByExoMediaDrm ? 1 : 3);
    }

    public void w() {
        this.w = this.b.getProvisionRequest();
        ((a) Util.castNonNull(this.q)).b(0, Assertions.checkNotNull(this.w), true);
    }
}
