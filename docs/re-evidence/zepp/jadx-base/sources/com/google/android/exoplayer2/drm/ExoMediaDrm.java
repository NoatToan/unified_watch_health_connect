package com.google.android.exoplayer2.drm;

import android.media.DeniedByServerException;
import android.media.MediaCryptoException;
import android.media.MediaDrmException;
import android.media.NotProvisionedException;
import android.os.PersistableBundle;
import androidx.annotation.Nullable;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public interface ExoMediaDrm {
    public static final int EVENT_KEY_EXPIRED = 3;
    public static final int EVENT_KEY_REQUIRED = 2;
    public static final int EVENT_PROVISION_REQUIRED = 1;
    public static final int KEY_TYPE_OFFLINE = 2;
    public static final int KEY_TYPE_RELEASE = 3;
    public static final int KEY_TYPE_STREAMING = 1;

    public static final class AppManagedProvider implements Provider {
        private final ExoMediaDrm a;

        public AppManagedProvider(ExoMediaDrm exoMediaDrm) {
            this.a = exoMediaDrm;
        }

        @Override // com.google.android.exoplayer2.drm.ExoMediaDrm.Provider
        public ExoMediaDrm acquireExoMediaDrm(UUID uuid) {
            this.a.acquire();
            return this.a;
        }
    }

    public static final class KeyRequest {
        public static final int REQUEST_TYPE_INITIAL = 0;
        public static final int REQUEST_TYPE_NONE = 3;
        public static final int REQUEST_TYPE_RELEASE = 2;
        public static final int REQUEST_TYPE_RENEWAL = 1;
        public static final int REQUEST_TYPE_UNKNOWN = Integer.MIN_VALUE;
        public static final int REQUEST_TYPE_UPDATE = 4;
        private final byte[] a;
        private final String b;
        private final int c;

        @Documented
        @Retention(RetentionPolicy.SOURCE)
        public @interface RequestType {
        }

        public KeyRequest(byte[] data, String licenseServerUrl) {
            this(data, licenseServerUrl, Integer.MIN_VALUE);
        }

        public byte[] getData() {
            return this.a;
        }

        public String getLicenseServerUrl() {
            return this.b;
        }

        public int getRequestType() {
            return this.c;
        }

        public KeyRequest(byte[] data, String licenseServerUrl, int requestType) {
            this.a = data;
            this.b = licenseServerUrl;
            this.c = requestType;
        }
    }

    public static final class KeyStatus {
        private final int a;
        private final byte[] b;

        public KeyStatus(int statusCode, byte[] keyId) {
            this.a = statusCode;
            this.b = keyId;
        }

        public byte[] getKeyId() {
            return this.b;
        }

        public int getStatusCode() {
            return this.a;
        }
    }

    public interface OnEventListener {
        void onEvent(ExoMediaDrm mediaDrm, @Nullable byte[] sessionId, int event, int extra, @Nullable byte[] data);
    }

    public interface OnExpirationUpdateListener {
        void onExpirationUpdate(ExoMediaDrm mediaDrm, byte[] sessionId, long expirationTimeMs);
    }

    public interface OnKeyStatusChangeListener {
        void onKeyStatusChange(ExoMediaDrm mediaDrm, byte[] sessionId, List<KeyStatus> exoKeyInformation, boolean hasNewUsableKey);
    }

    public interface Provider {
        ExoMediaDrm acquireExoMediaDrm(UUID uuid);
    }

    public static final class ProvisionRequest {
        private final byte[] a;
        private final String b;

        public ProvisionRequest(byte[] data, String defaultUrl) {
            this.a = data;
            this.b = defaultUrl;
        }

        public byte[] getData() {
            return this.a;
        }

        public String getDefaultUrl() {
            return this.b;
        }
    }

    void acquire();

    void closeSession(byte[] sessionId);

    ExoMediaCrypto createMediaCrypto(byte[] sessionId) throws MediaCryptoException;

    Class<? extends ExoMediaCrypto> getExoMediaCryptoType();

    KeyRequest getKeyRequest(byte[] scope, @Nullable List<DrmInitData.SchemeData> schemeDatas, int keyType, @Nullable HashMap<String, String> optionalParameters) throws NotProvisionedException;

    @Nullable
    PersistableBundle getMetrics();

    byte[] getPropertyByteArray(String propertyName);

    String getPropertyString(String propertyName);

    ProvisionRequest getProvisionRequest();

    byte[] openSession() throws MediaDrmException;

    @Nullable
    byte[] provideKeyResponse(byte[] scope, byte[] response) throws DeniedByServerException, NotProvisionedException;

    void provideProvisionResponse(byte[] response) throws DeniedByServerException;

    Map<String, String> queryKeyStatus(byte[] sessionId);

    void release();

    void restoreKeys(byte[] sessionId, byte[] keySetId);

    void setOnEventListener(@Nullable OnEventListener listener);

    void setOnExpirationUpdateListener(@Nullable OnExpirationUpdateListener listener);

    void setOnKeyStatusChangeListener(@Nullable OnKeyStatusChangeListener listener);

    void setPropertyByteArray(String propertyName, byte[] value);

    void setPropertyString(String propertyName, String value);
}
