package com.google.android.exoplayer2.drm;

import android.os.ConditionVariable;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.upstream.HttpDataSource;
import com.google.android.exoplayer2.util.Assertions;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
@RequiresApi(18)
public final class OfflineLicenseHelper {
    private static final Format e = new Format.Builder().setDrmInitData(new DrmInitData(new DrmInitData.SchemeData[0])).build();
    private final ConditionVariable a;
    private final DefaultDrmSessionManager b;
    private final HandlerThread c;
    private final DrmSessionEventListener.EventDispatcher d;

    public class a implements DrmSessionEventListener {
        public a() {
        }

        @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
        public void onDrmKeysLoaded(int windowIndex, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
            OfflineLicenseHelper.this.a.open();
        }

        @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
        public void onDrmKeysRemoved(int windowIndex, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
            OfflineLicenseHelper.this.a.open();
        }

        @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
        public void onDrmKeysRestored(int windowIndex, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
            OfflineLicenseHelper.this.a.open();
        }

        @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
        public /* synthetic */ void onDrmSessionAcquired(int i, MediaSource.MediaPeriodId mediaPeriodId) {
            h.d(this, i, mediaPeriodId);
        }

        @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
        public /* synthetic */ void onDrmSessionAcquired(int i, MediaSource.MediaPeriodId mediaPeriodId, int i2) {
            h.e(this, i, mediaPeriodId, i2);
        }

        @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
        public void onDrmSessionManagerError(int windowIndex, @Nullable MediaSource.MediaPeriodId mediaPeriodId, Exception e) {
            OfflineLicenseHelper.this.a.open();
        }

        @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
        public /* synthetic */ void onDrmSessionReleased(int i, MediaSource.MediaPeriodId mediaPeriodId) {
            h.g(this, i, mediaPeriodId);
        }
    }

    @Deprecated
    public OfflineLicenseHelper(UUID uuid, ExoMediaDrm.Provider mediaDrmProvider, MediaDrmCallback callback, @Nullable Map<String, String> optionalKeyRequestParameters, DrmSessionEventListener.EventDispatcher eventDispatcher) {
        this(new DefaultDrmSessionManager.Builder().setUuidAndExoMediaDrmProvider(uuid, mediaDrmProvider).setKeyRequestParameters(optionalKeyRequestParameters).build(callback), eventDispatcher);
    }

    private byte[] b(int licenseMode, @Nullable byte[] offlineLicenseKeySetId, Format format) throws DrmSession.DrmSessionException {
        this.b.prepare();
        DrmSession drmSessionC = c(licenseMode, offlineLicenseKeySetId, format);
        DrmSession.DrmSessionException error = drmSessionC.getError();
        byte[] offlineLicenseKeySetId2 = drmSessionC.getOfflineLicenseKeySetId();
        drmSessionC.release(this.d);
        this.b.release();
        if (error == null) {
            return (byte[]) Assertions.checkNotNull(offlineLicenseKeySetId2);
        }
        throw error;
    }

    private DrmSession c(int licenseMode, @Nullable byte[] offlineLicenseKeySetId, Format format) {
        Assertions.checkNotNull(format.drmInitData);
        this.b.setMode(licenseMode, offlineLicenseKeySetId);
        this.a.close();
        DrmSession drmSessionAcquireSession = this.b.acquireSession(this.c.getLooper(), this.d, format);
        this.a.block();
        return (DrmSession) Assertions.checkNotNull(drmSessionAcquireSession);
    }

    public static OfflineLicenseHelper newWidevineInstance(String defaultLicenseUrl, HttpDataSource.Factory httpDataSourceFactory, DrmSessionEventListener.EventDispatcher eventDispatcher) {
        return newWidevineInstance(defaultLicenseUrl, false, httpDataSourceFactory, eventDispatcher);
    }

    public synchronized byte[] downloadLicense(Format format) throws DrmSession.DrmSessionException {
        Assertions.checkArgument(format.drmInitData != null);
        return b(2, null, format);
    }

    public synchronized Pair<Long, Long> getLicenseDurationRemainingSec(byte[] offlineLicenseKeySetId) throws DrmSession.DrmSessionException {
        Assertions.checkNotNull(offlineLicenseKeySetId);
        this.b.prepare();
        DrmSession drmSessionC = c(1, offlineLicenseKeySetId, e);
        DrmSession.DrmSessionException error = drmSessionC.getError();
        Pair<Long, Long> licenseDurationRemainingSec = WidevineUtil.getLicenseDurationRemainingSec(drmSessionC);
        drmSessionC.release(this.d);
        this.b.release();
        if (error == null) {
            return (Pair) Assertions.checkNotNull(licenseDurationRemainingSec);
        }
        if (!(error.getCause() instanceof KeysExpiredException)) {
            throw error;
        }
        return Pair.create(0L, 0L);
    }

    public void release() {
        this.c.quit();
    }

    public synchronized void releaseLicense(byte[] offlineLicenseKeySetId) throws DrmSession.DrmSessionException {
        Assertions.checkNotNull(offlineLicenseKeySetId);
        b(3, offlineLicenseKeySetId, e);
    }

    public synchronized byte[] renewLicense(byte[] offlineLicenseKeySetId) throws DrmSession.DrmSessionException {
        Assertions.checkNotNull(offlineLicenseKeySetId);
        return b(2, offlineLicenseKeySetId, e);
    }

    public static OfflineLicenseHelper newWidevineInstance(String defaultLicenseUrl, boolean forceDefaultLicenseUrl, HttpDataSource.Factory httpDataSourceFactory, DrmSessionEventListener.EventDispatcher eventDispatcher) {
        return newWidevineInstance(defaultLicenseUrl, forceDefaultLicenseUrl, httpDataSourceFactory, null, eventDispatcher);
    }

    public static OfflineLicenseHelper newWidevineInstance(String defaultLicenseUrl, boolean forceDefaultLicenseUrl, HttpDataSource.Factory httpDataSourceFactory, @Nullable Map<String, String> optionalKeyRequestParameters, DrmSessionEventListener.EventDispatcher eventDispatcher) {
        return new OfflineLicenseHelper(new DefaultDrmSessionManager.Builder().setKeyRequestParameters(optionalKeyRequestParameters).build(new HttpMediaDrmCallback(defaultLicenseUrl, forceDefaultLicenseUrl, httpDataSourceFactory)), eventDispatcher);
    }

    public OfflineLicenseHelper(DefaultDrmSessionManager defaultDrmSessionManager, DrmSessionEventListener.EventDispatcher eventDispatcher) {
        this.b = defaultDrmSessionManager;
        this.d = eventDispatcher;
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:OfflineLicenseHelper");
        this.c = handlerThread;
        handlerThread.start();
        this.a = new ConditionVariable();
        eventDispatcher.addEventListener(new Handler(handlerThread.getLooper()), new a());
    }
}
