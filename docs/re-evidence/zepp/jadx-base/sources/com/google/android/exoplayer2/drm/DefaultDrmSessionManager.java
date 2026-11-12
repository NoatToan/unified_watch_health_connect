package com.google.android.exoplayer2.drm;

import android.annotation.SuppressLint;
import android.media.ResourceBusyException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.upstream.DefaultLoadErrorHandlingPolicy;
import com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.Util;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.google.common.collect.UnmodifiableIterator;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* JADX INFO: loaded from: classes2.dex */
@RequiresApi(18)
public class DefaultDrmSessionManager implements DrmSessionManager {
    public static final long DEFAULT_SESSION_KEEPALIVE_MS = 300000;
    public static final int INITIAL_DRM_REQUEST_RETRY_COUNT = 3;
    public static final int MODE_DOWNLOAD = 2;
    public static final int MODE_PLAYBACK = 0;
    public static final int MODE_QUERY = 1;
    public static final int MODE_RELEASE = 3;
    public static final String PLAYREADY_CUSTOM_DATA_KEY = "PRCustomData";
    private static final String x = "DefaultDrmSessionMgr";
    private final UUID a;
    private final ExoMediaDrm.Provider b;
    private final MediaDrmCallback c;
    private final HashMap<String, String> d;
    private final boolean e;
    private final int[] f;
    private final boolean g;
    private final e h;
    private final LoadErrorHandlingPolicy i;
    private final f j;
    private final long k;
    private final List<DefaultDrmSession> l;
    private final Set<d> m;
    private final Set<DefaultDrmSession> n;
    private int o;

    @Nullable
    private ExoMediaDrm p;

    @Nullable
    private DefaultDrmSession q;

    @Nullable
    private DefaultDrmSession r;
    private Looper s;
    private Handler t;
    private int u;

    @Nullable
    private byte[] v;

    @Nullable
    public volatile c w;

    public static final class Builder {
        private boolean d;
        private boolean f;
        private final HashMap<String, String> a = new HashMap<>();
        private UUID b = C.WIDEVINE_UUID;
        private ExoMediaDrm.Provider c = FrameworkMediaDrm.DEFAULT_PROVIDER;
        private LoadErrorHandlingPolicy g = new DefaultLoadErrorHandlingPolicy();
        private int[] e = new int[0];
        private long h = 300000;

        public DefaultDrmSessionManager build(MediaDrmCallback mediaDrmCallback) {
            return new DefaultDrmSessionManager(this.b, this.c, mediaDrmCallback, this.a, this.d, this.e, this.f, this.g, this.h);
        }

        public Builder setKeyRequestParameters(@Nullable Map<String, String> keyRequestParameters) {
            this.a.clear();
            if (keyRequestParameters != null) {
                this.a.putAll(keyRequestParameters);
            }
            return this;
        }

        public Builder setLoadErrorHandlingPolicy(LoadErrorHandlingPolicy loadErrorHandlingPolicy) {
            this.g = (LoadErrorHandlingPolicy) Assertions.checkNotNull(loadErrorHandlingPolicy);
            return this;
        }

        public Builder setMultiSession(boolean multiSession) {
            this.d = multiSession;
            return this;
        }

        public Builder setPlayClearSamplesWithoutKeys(boolean playClearSamplesWithoutKeys) {
            this.f = playClearSamplesWithoutKeys;
            return this;
        }

        public Builder setSessionKeepaliveMs(long sessionKeepaliveMs) {
            Assertions.checkArgument(sessionKeepaliveMs > 0 || sessionKeepaliveMs == C.TIME_UNSET);
            this.h = sessionKeepaliveMs;
            return this;
        }

        public Builder setUseDrmSessionsForClearContent(int... useDrmSessionsForClearContentTrackTypes) {
            for (int i : useDrmSessionsForClearContentTrackTypes) {
                boolean z = true;
                if (i != 2 && i != 1) {
                    z = false;
                }
                Assertions.checkArgument(z);
            }
            this.e = (int[]) useDrmSessionsForClearContentTrackTypes.clone();
            return this;
        }

        public Builder setUuidAndExoMediaDrmProvider(UUID uuid, ExoMediaDrm.Provider exoMediaDrmProvider) {
            this.b = (UUID) Assertions.checkNotNull(uuid);
            this.c = (ExoMediaDrm.Provider) Assertions.checkNotNull(exoMediaDrmProvider);
            return this;
        }
    }

    public static final class MissingSchemeDataException extends Exception {
        private MissingSchemeDataException(UUID uuid) {
            String strValueOf = String.valueOf(uuid);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 29);
            sb.append("Media does not support uuid: ");
            sb.append(strValueOf);
            super(sb.toString());
        }
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Mode {
    }

    public class b implements ExoMediaDrm.OnEventListener {
        private b() {
        }

        @Override // com.google.android.exoplayer2.drm.ExoMediaDrm.OnEventListener
        public void onEvent(ExoMediaDrm md, @Nullable byte[] sessionId, int event, int extra, @Nullable byte[] data) {
            ((c) Assertions.checkNotNull(DefaultDrmSessionManager.this.w)).obtainMessage(event, sessionId).sendToTarget();
        }
    }

    @SuppressLint({"HandlerLeak"})
    public class c extends Handler {
        public c(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message msg) {
            byte[] bArr = (byte[]) msg.obj;
            if (bArr == null) {
                return;
            }
            for (DefaultDrmSession defaultDrmSession : DefaultDrmSessionManager.this.l) {
                if (defaultDrmSession.i(bArr)) {
                    defaultDrmSession.q(msg.what);
                    return;
                }
            }
        }
    }

    public class d implements DrmSessionManager.DrmSessionReference {

        @Nullable
        private final DrmSessionEventListener.EventDispatcher a;

        @Nullable
        private DrmSession b;
        private boolean c;

        public d(DrmSessionEventListener.EventDispatcher eventDispatcher) {
            this.a = eventDispatcher;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void d(Format format) {
            if (DefaultDrmSessionManager.this.o == 0 || this.c) {
                return;
            }
            DefaultDrmSessionManager defaultDrmSessionManager = DefaultDrmSessionManager.this;
            this.b = defaultDrmSessionManager.o((Looper) Assertions.checkNotNull(defaultDrmSessionManager.s), this.a, format, false);
            DefaultDrmSessionManager.this.m.add(this);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void e() {
            if (this.c) {
                return;
            }
            DrmSession drmSession = this.b;
            if (drmSession != null) {
                drmSession.release(this.a);
            }
            DefaultDrmSessionManager.this.m.remove(this);
            this.c = true;
        }

        public void c(final Format format) {
            ((Handler) Assertions.checkNotNull(DefaultDrmSessionManager.this.t)).post(new Runnable() { // from class: com.google.android.exoplayer2.drm.e
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.d(format);
                }
            });
        }

        @Override // com.google.android.exoplayer2.drm.DrmSessionManager.DrmSessionReference
        public void release() {
            Util.postOrRun((Handler) Assertions.checkNotNull(DefaultDrmSessionManager.this.t), new Runnable() { // from class: com.google.android.exoplayer2.drm.d
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.e();
                }
            });
        }
    }

    public class e implements DefaultDrmSession.ProvisioningManager {
        private final Set<DefaultDrmSession> a = new HashSet();

        @Nullable
        private DefaultDrmSession b;

        public e(final DefaultDrmSessionManager this$0) {
        }

        public void a(DefaultDrmSession session) {
            this.a.remove(session);
            if (this.b == session) {
                this.b = null;
                if (this.a.isEmpty()) {
                    return;
                }
                DefaultDrmSession next = this.a.iterator().next();
                this.b = next;
                next.w();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.exoplayer2.drm.DefaultDrmSession.ProvisioningManager
        public void onProvisionCompleted() {
            this.b = null;
            ImmutableList immutableListCopyOf = ImmutableList.copyOf((Collection) this.a);
            this.a.clear();
            UnmodifiableIterator it2 = immutableListCopyOf.iterator();
            while (it2.hasNext()) {
                ((DefaultDrmSession) it2.next()).r();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.exoplayer2.drm.DefaultDrmSession.ProvisioningManager
        public void onProvisionError(Exception error, boolean thrownByExoMediaDrm) {
            this.b = null;
            ImmutableList immutableListCopyOf = ImmutableList.copyOf((Collection) this.a);
            this.a.clear();
            UnmodifiableIterator it2 = immutableListCopyOf.iterator();
            while (it2.hasNext()) {
                ((DefaultDrmSession) it2.next()).s(error, thrownByExoMediaDrm);
            }
        }

        @Override // com.google.android.exoplayer2.drm.DefaultDrmSession.ProvisioningManager
        public void provisionRequired(DefaultDrmSession session) {
            this.a.add(session);
            if (this.b != null) {
                return;
            }
            this.b = session;
            session.w();
        }
    }

    public class f implements DefaultDrmSession.ReferenceCountListener {
        private f() {
        }

        @Override // com.google.android.exoplayer2.drm.DefaultDrmSession.ReferenceCountListener
        public void onReferenceCountDecremented(final DefaultDrmSession session, int newReferenceCount) {
            if (newReferenceCount == 1 && DefaultDrmSessionManager.this.o > 0 && DefaultDrmSessionManager.this.k != C.TIME_UNSET) {
                DefaultDrmSessionManager.this.n.add(session);
                ((Handler) Assertions.checkNotNull(DefaultDrmSessionManager.this.t)).postAtTime(new Runnable() { // from class: com.google.android.exoplayer2.drm.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        session.release(null);
                    }
                }, session, SystemClock.uptimeMillis() + DefaultDrmSessionManager.this.k);
            } else if (newReferenceCount == 0) {
                DefaultDrmSessionManager.this.l.remove(session);
                if (DefaultDrmSessionManager.this.q == session) {
                    DefaultDrmSessionManager.this.q = null;
                }
                if (DefaultDrmSessionManager.this.r == session) {
                    DefaultDrmSessionManager.this.r = null;
                }
                DefaultDrmSessionManager.this.h.a(session);
                if (DefaultDrmSessionManager.this.k != C.TIME_UNSET) {
                    ((Handler) Assertions.checkNotNull(DefaultDrmSessionManager.this.t)).removeCallbacksAndMessages(session);
                    DefaultDrmSessionManager.this.n.remove(session);
                }
            }
            DefaultDrmSessionManager.this.x();
        }

        @Override // com.google.android.exoplayer2.drm.DefaultDrmSession.ReferenceCountListener
        public void onReferenceCountIncremented(DefaultDrmSession session, int newReferenceCount) {
            if (DefaultDrmSessionManager.this.k != C.TIME_UNSET) {
                DefaultDrmSessionManager.this.n.remove(session);
                ((Handler) Assertions.checkNotNull(DefaultDrmSessionManager.this.t)).removeCallbacksAndMessages(session);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Nullable
    public DrmSession o(Looper looper, @Nullable DrmSessionEventListener.EventDispatcher eventDispatcher, Format format, boolean z) {
        List<DrmInitData.SchemeData> listT;
        w(looper);
        DrmInitData drmInitData = format.drmInitData;
        if (drmInitData == null) {
            return v(MimeTypes.getTrackType(format.sampleMimeType), z);
        }
        DefaultDrmSession defaultDrmSessionS = null;
        Object[] objArr = 0;
        if (this.v == null) {
            listT = t((DrmInitData) Assertions.checkNotNull(drmInitData), this.a, false);
            if (listT.isEmpty()) {
                MissingSchemeDataException missingSchemeDataException = new MissingSchemeDataException(this.a);
                Log.e(x, "DRM error", missingSchemeDataException);
                if (eventDispatcher != null) {
                    eventDispatcher.drmSessionManagerError(missingSchemeDataException);
                }
                return new ErrorStateDrmSession(new DrmSession.DrmSessionException(missingSchemeDataException, PlaybackException.ERROR_CODE_DRM_CONTENT_ERROR));
            }
        } else {
            listT = null;
        }
        if (this.e) {
            for (DefaultDrmSession defaultDrmSession : this.l) {
                if (Util.areEqual(defaultDrmSession.a, listT)) {
                    defaultDrmSessionS = defaultDrmSession;
                    break;
                }
            }
        } else {
            defaultDrmSessionS = this.r;
        }
        if (defaultDrmSessionS == null) {
            defaultDrmSessionS = s(listT, false, eventDispatcher, z);
            if (!this.e) {
                this.r = defaultDrmSessionS;
            }
            this.l.add(defaultDrmSessionS);
        } else {
            defaultDrmSessionS.acquire(eventDispatcher);
        }
        return defaultDrmSessionS;
    }

    private static boolean p(DrmSession session) {
        return session.getState() == 1 && (Util.SDK_INT < 19 || (((DrmSession.DrmSessionException) Assertions.checkNotNull(session.getError())).getCause() instanceof ResourceBusyException));
    }

    private boolean q(DrmInitData drmInitData) {
        if (this.v != null) {
            return true;
        }
        if (t(drmInitData, this.a, true).isEmpty()) {
            if (drmInitData.schemeDataCount != 1 || !drmInitData.get(0).matches(C.COMMON_PSSH_UUID)) {
                return false;
            }
            String strValueOf = String.valueOf(this.a);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 72);
            sb.append("DrmInitData only contains common PSSH SchemeData. Assuming support for: ");
            sb.append(strValueOf);
            Log.w(x, sb.toString());
        }
        String str = drmInitData.schemeType;
        if (str == null || C.CENC_TYPE_cenc.equals(str)) {
            return true;
        }
        if (C.CENC_TYPE_cbcs.equals(str)) {
            return Util.SDK_INT >= 25;
        }
        return (C.CENC_TYPE_cbc1.equals(str) || C.CENC_TYPE_cens.equals(str)) ? false : true;
    }

    private DefaultDrmSession r(@Nullable List<DrmInitData.SchemeData> schemeDatas, boolean isPlaceholderSession, @Nullable DrmSessionEventListener.EventDispatcher eventDispatcher) {
        Assertions.checkNotNull(this.p);
        DefaultDrmSession defaultDrmSession = new DefaultDrmSession(this.a, this.p, this.h, this.j, schemeDatas, this.u, this.g | isPlaceholderSession, isPlaceholderSession, this.v, this.d, this.c, (Looper) Assertions.checkNotNull(this.s), this.i);
        defaultDrmSession.acquire(eventDispatcher);
        if (this.k != C.TIME_UNSET) {
            defaultDrmSession.acquire(null);
        }
        return defaultDrmSession;
    }

    private DefaultDrmSession s(@Nullable List<DrmInitData.SchemeData> schemeDatas, boolean isPlaceholderSession, @Nullable DrmSessionEventListener.EventDispatcher eventDispatcher, boolean shouldReleasePreacquiredSessionsBeforeRetrying) {
        DefaultDrmSession defaultDrmSessionR = r(schemeDatas, isPlaceholderSession, eventDispatcher);
        if (p(defaultDrmSessionR) && !this.n.isEmpty()) {
            UnmodifiableIterator it2 = ImmutableSet.copyOf((Collection) this.n).iterator();
            while (it2.hasNext()) {
                ((DrmSession) it2.next()).release(null);
            }
            z(defaultDrmSessionR, eventDispatcher);
            defaultDrmSessionR = r(schemeDatas, isPlaceholderSession, eventDispatcher);
        }
        if (!p(defaultDrmSessionR) || !shouldReleasePreacquiredSessionsBeforeRetrying || this.m.isEmpty()) {
            return defaultDrmSessionR;
        }
        y();
        z(defaultDrmSessionR, eventDispatcher);
        return r(schemeDatas, isPlaceholderSession, eventDispatcher);
    }

    private static List<DrmInitData.SchemeData> t(DrmInitData drmInitData, UUID uuid, boolean allowMissingData) {
        ArrayList arrayList = new ArrayList(drmInitData.schemeDataCount);
        for (int i = 0; i < drmInitData.schemeDataCount; i++) {
            DrmInitData.SchemeData schemeData = drmInitData.get(i);
            if ((schemeData.matches(uuid) || (C.CLEARKEY_UUID.equals(uuid) && schemeData.matches(C.COMMON_PSSH_UUID))) && (schemeData.data != null || allowMissingData)) {
                arrayList.add(schemeData);
            }
        }
        return arrayList;
    }

    @EnsuresNonNull({"this.playbackLooper", "this.playbackHandler"})
    private synchronized void u(Looper playbackLooper) {
        Looper looper = this.s;
        if (looper == null) {
            this.s = playbackLooper;
            this.t = new Handler(playbackLooper);
        } else {
            Assertions.checkState(looper == playbackLooper);
            Assertions.checkNotNull(this.t);
        }
    }

    @Nullable
    private DrmSession v(int trackType, boolean shouldReleasePreacquiredSessionsBeforeRetrying) {
        ExoMediaDrm exoMediaDrm = (ExoMediaDrm) Assertions.checkNotNull(this.p);
        if ((FrameworkMediaCrypto.class.equals(exoMediaDrm.getExoMediaCryptoType()) && FrameworkMediaCrypto.WORKAROUND_DEVICE_NEEDS_KEYS_TO_CONFIGURE_CODEC) || Util.linearSearch(this.f, trackType) == -1 || UnsupportedMediaCrypto.class.equals(exoMediaDrm.getExoMediaCryptoType())) {
            return null;
        }
        DefaultDrmSession defaultDrmSession = this.q;
        if (defaultDrmSession == null) {
            DefaultDrmSession defaultDrmSessionS = s(ImmutableList.of(), true, null, shouldReleasePreacquiredSessionsBeforeRetrying);
            this.l.add(defaultDrmSessionS);
            this.q = defaultDrmSessionS;
        } else {
            defaultDrmSession.acquire(null);
        }
        return this.q;
    }

    private void w(Looper playbackLooper) {
        if (this.w == null) {
            this.w = new c(playbackLooper);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x() {
        if (this.p != null && this.o == 0 && this.l.isEmpty() && this.m.isEmpty()) {
            ((ExoMediaDrm) Assertions.checkNotNull(this.p)).release();
            this.p = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void y() {
        UnmodifiableIterator it2 = ImmutableSet.copyOf((Collection) this.m).iterator();
        while (it2.hasNext()) {
            ((d) it2.next()).release();
        }
    }

    private void z(DrmSession session, @Nullable DrmSessionEventListener.EventDispatcher eventDispatcher) {
        session.release(eventDispatcher);
        if (this.k != C.TIME_UNSET) {
            session.release(null);
        }
    }

    @Override // com.google.android.exoplayer2.drm.DrmSessionManager
    @Nullable
    public DrmSession acquireSession(Looper playbackLooper, @Nullable DrmSessionEventListener.EventDispatcher eventDispatcher, Format format) {
        Assertions.checkState(this.o > 0);
        u(playbackLooper);
        return o(playbackLooper, eventDispatcher, format, true);
    }

    @Override // com.google.android.exoplayer2.drm.DrmSessionManager
    @Nullable
    public Class<? extends ExoMediaCrypto> getExoMediaCryptoType(Format format) {
        Class<? extends ExoMediaCrypto> exoMediaCryptoType = ((ExoMediaDrm) Assertions.checkNotNull(this.p)).getExoMediaCryptoType();
        DrmInitData drmInitData = format.drmInitData;
        if (drmInitData != null) {
            return q(drmInitData) ? exoMediaCryptoType : UnsupportedMediaCrypto.class;
        }
        if (Util.linearSearch(this.f, MimeTypes.getTrackType(format.sampleMimeType)) != -1) {
            return exoMediaCryptoType;
        }
        return null;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSessionManager
    public DrmSessionManager.DrmSessionReference preacquireSession(Looper playbackLooper, @Nullable DrmSessionEventListener.EventDispatcher eventDispatcher, Format format) {
        Assertions.checkState(this.o > 0);
        u(playbackLooper);
        d dVar = new d(eventDispatcher);
        dVar.c(format);
        return dVar;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSessionManager
    public final void prepare() {
        int i = this.o;
        this.o = i + 1;
        if (i != 0) {
            return;
        }
        if (this.p == null) {
            ExoMediaDrm exoMediaDrmAcquireExoMediaDrm = this.b.acquireExoMediaDrm(this.a);
            this.p = exoMediaDrmAcquireExoMediaDrm;
            exoMediaDrmAcquireExoMediaDrm.setOnEventListener(new b());
        } else if (this.k != C.TIME_UNSET) {
            for (int i2 = 0; i2 < this.l.size(); i2++) {
                this.l.get(i2).acquire(null);
            }
        }
    }

    @Override // com.google.android.exoplayer2.drm.DrmSessionManager
    public final void release() {
        int i = this.o - 1;
        this.o = i;
        if (i != 0) {
            return;
        }
        if (this.k != C.TIME_UNSET) {
            ArrayList arrayList = new ArrayList(this.l);
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                ((DefaultDrmSession) arrayList.get(i2)).release(null);
            }
        }
        y();
        x();
    }

    public void setMode(int mode, @Nullable byte[] offlineLicenseKeySetId) {
        Assertions.checkState(this.l.isEmpty());
        if (mode == 1 || mode == 3) {
            Assertions.checkNotNull(offlineLicenseKeySetId);
        }
        this.u = mode;
        this.v = offlineLicenseKeySetId;
    }

    @Deprecated
    public DefaultDrmSessionManager(UUID uuid, ExoMediaDrm exoMediaDrm, MediaDrmCallback callback, @Nullable HashMap<String, String> keyRequestParameters) {
        this(uuid, exoMediaDrm, callback, keyRequestParameters == null ? new HashMap<>() : keyRequestParameters, false, 3);
    }

    @Deprecated
    public DefaultDrmSessionManager(UUID uuid, ExoMediaDrm exoMediaDrm, MediaDrmCallback callback, @Nullable HashMap<String, String> keyRequestParameters, boolean multiSession) {
        this(uuid, exoMediaDrm, callback, keyRequestParameters == null ? new HashMap<>() : keyRequestParameters, multiSession, 3);
    }

    @Deprecated
    public DefaultDrmSessionManager(UUID uuid, ExoMediaDrm exoMediaDrm, MediaDrmCallback callback, @Nullable HashMap<String, String> keyRequestParameters, boolean multiSession, int initialDrmRequestRetryCount) {
        this(uuid, new ExoMediaDrm.AppManagedProvider(exoMediaDrm), callback, keyRequestParameters == null ? new HashMap<>() : keyRequestParameters, multiSession, new int[0], false, new DefaultLoadErrorHandlingPolicy(initialDrmRequestRetryCount), 300000L);
    }

    private DefaultDrmSessionManager(UUID uuid, ExoMediaDrm.Provider exoMediaDrmProvider, MediaDrmCallback callback, HashMap<String, String> keyRequestParameters, boolean multiSession, int[] useDrmSessionsForClearContentTrackTypes, boolean playClearSamplesWithoutKeys, LoadErrorHandlingPolicy loadErrorHandlingPolicy, long sessionKeepaliveMs) {
        Assertions.checkNotNull(uuid);
        Assertions.checkArgument(!C.COMMON_PSSH_UUID.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.a = uuid;
        this.b = exoMediaDrmProvider;
        this.c = callback;
        this.d = keyRequestParameters;
        this.e = multiSession;
        this.f = useDrmSessionsForClearContentTrackTypes;
        this.g = playClearSamplesWithoutKeys;
        this.i = loadErrorHandlingPolicy;
        this.h = new e(this);
        this.j = new f();
        this.u = 0;
        this.l = new ArrayList();
        this.m = Sets.newIdentityHashSet();
        this.n = Sets.newIdentityHashSet();
        this.k = sessionKeepaliveMs;
    }
}
