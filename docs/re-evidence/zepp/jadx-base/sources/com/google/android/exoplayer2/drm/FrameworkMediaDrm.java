package com.google.android.exoplayer2.drm;

import android.annotation.SuppressLint;
import android.media.DeniedByServerException;
import android.media.MediaCryptoException;
import android.media.MediaDrm;
import android.media.MediaDrmException;
import android.media.NotProvisionedException;
import android.media.UnsupportedSchemeException;
import android.os.Handler;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.drm.ExoMediaDrm;
import com.google.android.exoplayer2.drm.FrameworkMediaDrm;
import com.google.android.exoplayer2.extractor.mp4.PsshAtomUtil;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import com.google.common.base.Charsets;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
@RequiresApi(18)
public final class FrameworkMediaDrm implements ExoMediaDrm {
    public static final ExoMediaDrm.Provider DEFAULT_PROVIDER = new ExoMediaDrm.Provider() { // from class: ea2
        @Override // com.google.android.exoplayer2.drm.ExoMediaDrm.Provider
        public final ExoMediaDrm acquireExoMediaDrm(UUID uuid) {
            return FrameworkMediaDrm.o(uuid);
        }
    };
    private static final String d = "FrameworkMediaDrm";
    private static final String e = "cenc";
    private static final String f = "https://x";
    private static final String g = "<LA_URL>https://x</LA_URL>";
    private static final int h = 2;
    private final UUID a;
    private final MediaDrm b;
    private int c;

    private FrameworkMediaDrm(UUID uuid) throws UnsupportedSchemeException {
        Assertions.checkNotNull(uuid);
        Assertions.checkArgument(!C.COMMON_PSSH_UUID.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.a = uuid;
        MediaDrm mediaDrm = new MediaDrm(i(uuid));
        this.b = mediaDrm;
        this.c = 1;
        if (C.WIDEVINE_UUID.equals(uuid) && p()) {
            j(mediaDrm);
        }
    }

    private static byte[] e(byte[] data) {
        ParsableByteArray parsableByteArray = new ParsableByteArray(data);
        int littleEndianInt = parsableByteArray.readLittleEndianInt();
        short littleEndianShort = parsableByteArray.readLittleEndianShort();
        short littleEndianShort2 = parsableByteArray.readLittleEndianShort();
        if (littleEndianShort != 1 || littleEndianShort2 != 1) {
            Log.i(d, "Unexpected record count or type. Skipping LA_URL workaround.");
            return data;
        }
        short littleEndianShort3 = parsableByteArray.readLittleEndianShort();
        Charset charset = Charsets.UTF_16LE;
        String string = parsableByteArray.readString(littleEndianShort3, charset);
        if (string.contains("<LA_URL>")) {
            return data;
        }
        int iIndexOf = string.indexOf("</DATA>");
        if (iIndexOf == -1) {
            Log.w(d, "Could not find the </DATA> tag. Skipping LA_URL workaround.");
        }
        String strSubstring = string.substring(0, iIndexOf);
        String strSubstring2 = string.substring(iIndexOf);
        StringBuilder sb = new StringBuilder(String.valueOf(strSubstring).length() + 26 + String.valueOf(strSubstring2).length());
        sb.append(strSubstring);
        sb.append(g);
        sb.append(strSubstring2);
        String string2 = sb.toString();
        int i = littleEndianInt + 52;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        byteBufferAllocate.putInt(i);
        byteBufferAllocate.putShort(littleEndianShort);
        byteBufferAllocate.putShort(littleEndianShort2);
        byteBufferAllocate.putShort((short) (string2.length() * 2));
        byteBufferAllocate.put(string2.getBytes(charset));
        return byteBufferAllocate.array();
    }

    private static byte[] f(UUID uuid, byte[] requestData) {
        return C.CLEARKEY_UUID.equals(uuid) ? a.a(requestData) : requestData;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0058  */
    /* JADX WARN: Code duplicated, block: B:27:0x005e A[RETURN] */
    private static byte[] g(UUID uuid, byte[] initData) {
        byte[] schemeSpecificData;
        UUID uuid2 = C.PLAYREADY_UUID;
        if (uuid2.equals(uuid)) {
            byte[] schemeSpecificData2 = PsshAtomUtil.parseSchemeSpecificData(initData, uuid);
            if (schemeSpecificData2 != null) {
                initData = schemeSpecificData2;
            }
            initData = PsshAtomUtil.buildPsshAtom(uuid2, e(initData));
        }
        if (Util.SDK_INT < 23 && C.WIDEVINE_UUID.equals(uuid)) {
            schemeSpecificData = PsshAtomUtil.parseSchemeSpecificData(initData, uuid);
            if (schemeSpecificData != null) {
                return schemeSpecificData;
            }
        } else if (uuid2.equals(uuid) && "Amazon".equals(Util.MANUFACTURER)) {
            String str = Util.MODEL;
            if ("AFTB".equals(str) || "AFTS".equals(str) || "AFTM".equals(str) || "AFTT".equals(str)) {
                schemeSpecificData = PsshAtomUtil.parseSchemeSpecificData(initData, uuid);
                if (schemeSpecificData != null) {
                    return schemeSpecificData;
                }
            }
        }
        return initData;
    }

    private static String h(UUID uuid, String mimeType) {
        return (Util.SDK_INT < 26 && C.CLEARKEY_UUID.equals(uuid) && (MimeTypes.VIDEO_MP4.equals(mimeType) || MimeTypes.AUDIO_MP4.equals(mimeType))) ? "cenc" : mimeType;
    }

    private static UUID i(UUID uuid) {
        return (Util.SDK_INT >= 27 || !C.CLEARKEY_UUID.equals(uuid)) ? uuid : C.COMMON_PSSH_UUID;
    }

    public static boolean isCryptoSchemeSupported(UUID uuid) {
        return MediaDrm.isCryptoSchemeSupported(i(uuid));
    }

    @SuppressLint({"WrongConstant"})
    private static void j(MediaDrm mediaDrm) {
        mediaDrm.setPropertyString("securityLevel", "L3");
    }

    private static DrmInitData.SchemeData k(UUID uuid, List<DrmInitData.SchemeData> schemeDatas) {
        boolean z;
        if (!C.WIDEVINE_UUID.equals(uuid)) {
            return schemeDatas.get(0);
        }
        if (Util.SDK_INT >= 28 && schemeDatas.size() > 1) {
            DrmInitData.SchemeData schemeData = schemeDatas.get(0);
            int i = 0;
            int length = 0;
            while (true) {
                if (i >= schemeDatas.size()) {
                    z = true;
                    break;
                }
                DrmInitData.SchemeData schemeData2 = schemeDatas.get(i);
                byte[] bArr = (byte[]) Assertions.checkNotNull(schemeData2.data);
                if (!Util.areEqual(schemeData2.mimeType, schemeData.mimeType) || !Util.areEqual(schemeData2.licenseServerUrl, schemeData.licenseServerUrl) || !PsshAtomUtil.isPsshAtom(bArr)) {
                    z = false;
                    break;
                }
                length += bArr.length;
                i++;
            }
            if (z) {
                byte[] bArr2 = new byte[length];
                int i2 = 0;
                for (int i3 = 0; i3 < schemeDatas.size(); i3++) {
                    byte[] bArr3 = (byte[]) Assertions.checkNotNull(schemeDatas.get(i3).data);
                    int length2 = bArr3.length;
                    System.arraycopy(bArr3, 0, bArr2, i2, length2);
                    i2 += length2;
                }
                return schemeData.copyWithData(bArr2);
            }
        }
        for (int i4 = 0; i4 < schemeDatas.size(); i4++) {
            DrmInitData.SchemeData schemeData3 = schemeDatas.get(i4);
            int version = PsshAtomUtil.parseVersion((byte[]) Assertions.checkNotNull(schemeData3.data));
            int i5 = Util.SDK_INT;
            if (i5 < 23 && version == 0) {
                return schemeData3;
            }
            if (i5 >= 23 && version == 1) {
                return schemeData3;
            }
        }
        return schemeDatas.get(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l(ExoMediaDrm.OnEventListener onEventListener, MediaDrm mediaDrm, byte[] bArr, int i, int i2, byte[] bArr2) {
        onEventListener.onEvent(this, bArr, i, i2, bArr2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m(ExoMediaDrm.OnExpirationUpdateListener onExpirationUpdateListener, MediaDrm mediaDrm, byte[] bArr, long j) {
        onExpirationUpdateListener.onExpirationUpdate(this, bArr, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n(ExoMediaDrm.OnKeyStatusChangeListener onKeyStatusChangeListener, MediaDrm mediaDrm, byte[] bArr, List list, boolean z) {
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            MediaDrm.KeyStatus keyStatus = (MediaDrm.KeyStatus) it2.next();
            arrayList.add(new ExoMediaDrm.KeyStatus(keyStatus.getStatusCode(), keyStatus.getKeyId()));
        }
        onKeyStatusChangeListener.onKeyStatusChange(this, bArr, arrayList, z);
    }

    public static FrameworkMediaDrm newInstance(UUID uuid) throws UnsupportedDrmException {
        try {
            return new FrameworkMediaDrm(uuid);
        } catch (UnsupportedSchemeException e2) {
            throw new UnsupportedDrmException(1, e2);
        } catch (Exception e3) {
            throw new UnsupportedDrmException(2, e3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ExoMediaDrm o(UUID uuid) {
        try {
            return newInstance(uuid);
        } catch (UnsupportedDrmException unused) {
            String strValueOf = String.valueOf(uuid);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 53);
            sb.append("Failed to instantiate a FrameworkMediaDrm for uuid: ");
            sb.append(strValueOf);
            sb.append(".");
            Log.e(d, sb.toString());
            return new DummyExoMediaDrm();
        }
    }

    private static boolean p() {
        return "ASUS_Z00AD".equals(Util.MODEL);
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    public synchronized void acquire() {
        Assertions.checkState(this.c > 0);
        this.c++;
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    public void closeSession(byte[] sessionId) {
        this.b.closeSession(sessionId);
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    public Class<FrameworkMediaCrypto> getExoMediaCryptoType() {
        return FrameworkMediaCrypto.class;
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    public ExoMediaDrm.KeyRequest getKeyRequest(byte[] scope, @Nullable List<DrmInitData.SchemeData> schemeDatas, int keyType, @Nullable HashMap<String, String> optionalParameters) throws NotProvisionedException {
        byte[] bArrG;
        String strH;
        DrmInitData.SchemeData schemeDataK = null;
        if (schemeDatas != null) {
            schemeDataK = k(this.a, schemeDatas);
            bArrG = g(this.a, (byte[]) Assertions.checkNotNull(schemeDataK.data));
            strH = h(this.a, schemeDataK.mimeType);
        } else {
            bArrG = null;
            strH = null;
        }
        MediaDrm.KeyRequest keyRequest = this.b.getKeyRequest(scope, bArrG, strH, keyType, optionalParameters);
        byte[] bArrF = f(this.a, keyRequest.getData());
        String defaultUrl = keyRequest.getDefaultUrl();
        if (f.equals(defaultUrl)) {
            defaultUrl = "";
        }
        if (TextUtils.isEmpty(defaultUrl) && schemeDataK != null && !TextUtils.isEmpty(schemeDataK.licenseServerUrl)) {
            defaultUrl = schemeDataK.licenseServerUrl;
        }
        return new ExoMediaDrm.KeyRequest(bArrF, defaultUrl, Util.SDK_INT >= 23 ? keyRequest.getRequestType() : Integer.MIN_VALUE);
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    @Nullable
    public PersistableBundle getMetrics() {
        if (Util.SDK_INT < 28) {
            return null;
        }
        return this.b.getMetrics();
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    public byte[] getPropertyByteArray(String propertyName) {
        return this.b.getPropertyByteArray(propertyName);
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    public String getPropertyString(String propertyName) {
        return this.b.getPropertyString(propertyName);
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    public ExoMediaDrm.ProvisionRequest getProvisionRequest() {
        MediaDrm.ProvisionRequest provisionRequest = this.b.getProvisionRequest();
        return new ExoMediaDrm.ProvisionRequest(provisionRequest.getData(), provisionRequest.getDefaultUrl());
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    public byte[] openSession() throws MediaDrmException {
        return this.b.openSession();
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    @Nullable
    public byte[] provideKeyResponse(byte[] scope, byte[] response) throws DeniedByServerException, NotProvisionedException {
        if (C.CLEARKEY_UUID.equals(this.a)) {
            response = a.b(response);
        }
        return this.b.provideKeyResponse(scope, response);
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    public void provideProvisionResponse(byte[] response) throws DeniedByServerException {
        this.b.provideProvisionResponse(response);
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    public Map<String, String> queryKeyStatus(byte[] sessionId) {
        return this.b.queryKeyStatus(sessionId);
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    public synchronized void release() {
        int i = this.c - 1;
        this.c = i;
        if (i == 0) {
            this.b.release();
        }
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    public void restoreKeys(byte[] sessionId, byte[] keySetId) {
        this.b.restoreKeys(sessionId, keySetId);
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    public void setOnEventListener(@Nullable final ExoMediaDrm.OnEventListener listener) {
        this.b.setOnEventListener(listener == null ? null : new MediaDrm.OnEventListener() { // from class: ba2
            @Override // android.media.MediaDrm.OnEventListener
            public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i, int i2, byte[] bArr2) {
                this.a.l(listener, mediaDrm, bArr, i, i2, bArr2);
            }
        });
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    @RequiresApi(23)
    public void setOnExpirationUpdateListener(@Nullable final ExoMediaDrm.OnExpirationUpdateListener listener) {
        if (Util.SDK_INT < 23) {
            throw new UnsupportedOperationException();
        }
        this.b.setOnExpirationUpdateListener(listener == null ? null : new MediaDrm.OnExpirationUpdateListener() { // from class: ca2
            @Override // android.media.MediaDrm.OnExpirationUpdateListener
            public final void onExpirationUpdate(MediaDrm mediaDrm, byte[] bArr, long j) {
                this.a.m(listener, mediaDrm, bArr, j);
            }
        }, (Handler) null);
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    @RequiresApi(23)
    public void setOnKeyStatusChangeListener(@Nullable final ExoMediaDrm.OnKeyStatusChangeListener listener) {
        if (Util.SDK_INT < 23) {
            throw new UnsupportedOperationException();
        }
        this.b.setOnKeyStatusChangeListener(listener == null ? null : new MediaDrm.OnKeyStatusChangeListener() { // from class: da2
            @Override // android.media.MediaDrm.OnKeyStatusChangeListener
            public final void onKeyStatusChange(MediaDrm mediaDrm, byte[] bArr, List list, boolean z) {
                this.a.n(listener, mediaDrm, bArr, list, z);
            }
        }, (Handler) null);
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    public void setPropertyByteArray(String propertyName, byte[] value) {
        this.b.setPropertyByteArray(propertyName, value);
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    public void setPropertyString(String propertyName, String value) {
        this.b.setPropertyString(propertyName, value);
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    public FrameworkMediaCrypto createMediaCrypto(byte[] sessionId) throws MediaCryptoException {
        return new FrameworkMediaCrypto(i(this.a), sessionId, Util.SDK_INT < 21 && C.WIDEVINE_UUID.equals(this.a) && "L3".equals(getPropertyString("securityLevel")));
    }
}
