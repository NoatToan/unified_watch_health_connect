package androidx.media3.exoplayer.drm;

import android.annotation.SuppressLint;
import android.media.DeniedByServerException;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaDrm;
import android.media.NotProvisionedException;
import android.media.UnsupportedSchemeException;
import android.media.metrics.LogSessionId;
import android.text.TextUtils;
import androidx.media3.common.l;
import androidx.media3.exoplayer.drm.DefaultDrmSessionManager;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.nimbusds.jose.jwk.JWKParameterNames;
import fa.k;
import fa.r;
import fa.z;
import ja.q;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import org.apache.commons.io.IOUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class h implements g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final kg.f f8906d = new kg.f(22);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f8907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MediaDrm f8908b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f8909c;

    private h(UUID uuid) {
        uuid.getClass();
        UUID uuid2 = androidx.media3.common.h.f8297b;
        fa.a.b(!uuid2.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.f8907a = uuid;
        MediaDrm mediaDrm = new MediaDrm((z.f70071a >= 27 || !androidx.media3.common.h.f8298c.equals(uuid)) ? uuid : uuid2);
        this.f8908b = mediaDrm;
        this.f8909c = 1;
        if (androidx.media3.common.h.f8299d.equals(uuid) && "ASUS_Z00AD".equals(z.f70074d)) {
            mediaDrm.setPropertyString("securityLevel", "L3");
        }
    }

    public static g c(UUID uuid) {
        try {
            try {
                return new h(uuid);
            } catch (UnsupportedDrmException unused) {
                k.c("Failed to instantiate a FrameworkMediaDrm for uuid: " + uuid + ".");
                return new e();
            }
        } catch (UnsupportedSchemeException e4) {
            throw new UnsupportedDrmException(1, e4);
        } catch (Exception e14) {
            throw new UnsupportedDrmException(2, e14);
        }
    }

    @Override // androidx.media3.exoplayer.drm.g
    public final void a(final DefaultDrmSessionManager.c cVar) {
        this.f8908b.setOnEventListener(new MediaDrm.OnEventListener(this) { // from class: la.d
            @Override // android.media.MediaDrm.OnEventListener
            public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i14, int i15, byte[] bArr2) {
                DefaultDrmSessionManager.d dVar = DefaultDrmSessionManager.this.f8874x;
                dVar.getClass();
                dVar.obtainMessage(i14, bArr).sendToTarget();
            }
        });
    }

    @Override // androidx.media3.exoplayer.drm.g
    public final void b(byte[] bArr, q qVar) {
        if (z.f70071a >= 31) {
            try {
                MediaDrm mediaDrm = this.f8908b;
                q.a aVar = qVar.f98046b;
                aVar.getClass();
                LogSessionId logSessionId = aVar.f98049a;
                LogSessionId unused = LogSessionId.LOG_SESSION_ID_NONE;
                if (logSessionId.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                    return;
                }
                MediaDrm.PlaybackComponent playbackComponent = mediaDrm.getPlaybackComponent(bArr);
                playbackComponent.getClass();
                ka.i.g(playbackComponent).setLogSessionId(logSessionId);
            } catch (UnsupportedOperationException unused2) {
                k.g("setLogSessionId failed.");
            }
        }
    }

    @Override // androidx.media3.exoplayer.drm.g
    public final void closeSession(byte[] bArr) {
        this.f8908b.closeSession(bArr);
    }

    @Override // androidx.media3.exoplayer.drm.g
    public final la.c createCryptoConfig(byte[] bArr) {
        int i14 = z.f70071a;
        UUID uuid = this.f8907a;
        if (i14 < 27 && androidx.media3.common.h.f8298c.equals(uuid)) {
            uuid = androidx.media3.common.h.f8297b;
        }
        return new la.c(uuid, bArr);
    }

    @Override // androidx.media3.exoplayer.drm.g
    public final int getCryptoType() {
        return 2;
    }

    /* JADX WARN: Code duplicated, block: B:128:0x00b6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x0091  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:77:0x0194  */
    /* JADX WARN: Code duplicated, block: B:79:0x019a  */
    /* JADX WARN: Code duplicated, block: B:99:0x0205  */
    @Override // androidx.media3.exoplayer.drm.g
    @SuppressLint({"WrongConstant"})
    public final g.a getKeyRequest(byte[] bArr, List<l.b> list, int i14, HashMap<String, String> map) throws NotProvisionedException {
        l.b bVar;
        byte[] bArr2;
        String str;
        int i15;
        vb.l.a aVarB;
        int i16;
        int i17;
        byte[] bArrC;
        UUID uuid = this.f8907a;
        if (list != null) {
            if (!androidx.media3.common.h.f8299d.equals(uuid)) {
                bVar = list.get(0);
            } else if (z.f70071a < 28 || list.size() <= 1) {
                i15 = 0;
                while (true) {
                    if (i15 < list.size()) {
                        bVar = list.get(0);
                        break;
                    }
                    l.b bVar2 = list.get(i15);
                    byte[] bArr3 = bVar2.f8346e;
                    bArr3.getClass();
                    aVarB = vb.l.b(bArr3);
                    if (aVarB == null) {
                        i16 = -1;
                    } else {
                        i16 = aVarB.f176781b;
                    }
                    i17 = z.f70071a;
                    if ((i17 >= 23 && i16 == 0) || (i17 >= 23 && i16 == 1)) {
                        bVar = bVar2;
                        break;
                    }
                }
            } else {
                l.b bVar3 = list.get(0);
                int i18 = 0;
                int length = 0;
                while (true) {
                    if (i18 < list.size()) {
                        l.b bVar4 = list.get(i18);
                        byte[] bArr4 = bVar4.f8346e;
                        bArr4.getClass();
                        if (!Objects.equals(bVar4.f8345d, bVar3.f8345d) || !Objects.equals(bVar4.f8344c, bVar3.f8344c) || vb.l.b(bArr4) == null) {
                            i15 = 0;
                            while (true) {
                                if (i15 < list.size()) {
                                    bVar = list.get(0);
                                    break;
                                }
                                l.b bVar5 = list.get(i15);
                                byte[] bArr5 = bVar5.f8346e;
                                bArr5.getClass();
                                aVarB = vb.l.b(bArr5);
                                if (aVarB == null) {
                                    i16 = -1;
                                } else {
                                    i16 = aVarB.f176781b;
                                }
                                i17 = z.f70071a;
                                i15 = i17 >= 23 ? i15 + 1 : i15 + 1;
                                bVar = bVar5;
                                break;
                            }
                        }
                        length += bArr4.length;
                        i18++;
                    } else {
                        byte[] bArr6 = new byte[length];
                        int i19 = 0;
                        for (int i24 = 0; i24 < list.size(); i24++) {
                            byte[] bArr7 = list.get(i24).f8346e;
                            bArr7.getClass();
                            int length2 = bArr7.length;
                            System.arraycopy(bArr7, 0, bArr6, i19, length2);
                            i19 += length2;
                        }
                        bVar = new l.b(bVar3.f8343b, bVar3.f8344c, bVar3.f8345d, bArr6);
                    }
                }
            }
            byte[] bArrA = bVar.f8346e;
            bArrA.getClass();
            UUID uuid2 = androidx.media3.common.h.f8300e;
            if (uuid2.equals(uuid)) {
                byte[] bArrC2 = vb.l.c(bArrA, uuid);
                if (bArrC2 != null) {
                    bArrA = bArrC2;
                }
                r rVar = new r(bArrA);
                int i25 = rVar.i();
                short sK = rVar.k();
                short sK2 = rVar.k();
                if (sK == 1 && sK2 == 1) {
                    short sK3 = rVar.k();
                    Charset charset = StandardCharsets.UTF_16LE;
                    String strS = rVar.s(sK3, charset);
                    if (!strS.contains("<LA_URL>")) {
                        int iIndexOf = strS.indexOf("</DATA>");
                        if (iIndexOf == -1) {
                            k.g("Could not find the </DATA> tag. Skipping LA_URL workaround.");
                        }
                        String str2 = strS.substring(0, iIndexOf) + "<LA_URL>https://x</LA_URL>" + strS.substring(iIndexOf);
                        int i26 = i25 + 52;
                        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i26);
                        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
                        byteBufferAllocate.putInt(i26);
                        byteBufferAllocate.putShort(sK);
                        byteBufferAllocate.putShort(sK2);
                        byteBufferAllocate.putShort((short) (str2.length() * 2));
                        byteBufferAllocate.put(str2.getBytes(charset));
                        bArrA = byteBufferAllocate.array();
                    }
                } else {
                    k.f("Unexpected record count or type. Skipping LA_URL workaround.");
                }
                bArrA = vb.l.a(uuid2, bArrA);
            }
            int i27 = z.f70071a;
            if (i27 < 23 && androidx.media3.common.h.f8299d.equals(uuid)) {
                bArrC = vb.l.c(bArrA, uuid);
                if (bArrC != null) {
                    bArrA = bArrC;
                }
            } else if (uuid2.equals(uuid) && "Amazon".equals(z.f70073c)) {
                String str3 = z.f70074d;
                if ("AFTB".equals(str3) || "AFTS".equals(str3) || "AFTM".equals(str3) || "AFTT".equals(str3)) {
                    bArrC = vb.l.c(bArrA, uuid);
                    if (bArrC != null) {
                        bArrA = bArrC;
                    }
                }
            }
            String str4 = bVar.f8345d;
            if (i27 < 26 && androidx.media3.common.h.f8298c.equals(uuid) && (MimeTypes.VIDEO_MP4.equals(str4) || MimeTypes.AUDIO_MP4.equals(str4))) {
                str4 = C.CENC_TYPE_cenc;
            }
            str = str4;
            bArr2 = bArrA;
        } else {
            bVar = null;
            bArr2 = null;
            str = null;
        }
        MediaDrm.KeyRequest keyRequest = this.f8908b.getKeyRequest(bArr, bArr2, str, i14, map);
        byte[] data = keyRequest.getData();
        if (androidx.media3.common.h.f8298c.equals(uuid) && z.f70071a < 27) {
            data = z.n(data).replace('+', '-').replace(IOUtils.DIR_SEPARATOR_UNIX, '_').getBytes(StandardCharsets.UTF_8);
        }
        String defaultUrl = keyRequest.getDefaultUrl();
        if ("<LA_URL>https://x</LA_URL>".equals(defaultUrl)) {
            defaultUrl = "";
        } else if (z.f70071a >= 33 && "https://default.url".equals(defaultUrl)) {
            String propertyString = this.f8908b.getPropertyString("version");
            if (Objects.equals(propertyString, "1.2") || Objects.equals(propertyString, "aidl-1")) {
                defaultUrl = "";
            }
        }
        if (TextUtils.isEmpty(defaultUrl) && bVar != null) {
            String str5 = bVar.f8344c;
            if (!TextUtils.isEmpty(str5)) {
                defaultUrl = str5;
            }
        }
        return new g.a(data, defaultUrl, z.f70071a >= 23 ? keyRequest.getRequestType() : Integer.MIN_VALUE);
    }

    @Override // androidx.media3.exoplayer.drm.g
    public final g.c getProvisionRequest() {
        MediaDrm.ProvisionRequest provisionRequest = this.f8908b.getProvisionRequest();
        return new g.c(provisionRequest.getData(), provisionRequest.getDefaultUrl());
    }

    @Override // androidx.media3.exoplayer.drm.g
    public final byte[] openSession() {
        return this.f8908b.openSession();
    }

    @Override // androidx.media3.exoplayer.drm.g
    public final byte[] provideKeyResponse(byte[] bArr, byte[] bArr2) {
        if (androidx.media3.common.h.f8298c.equals(this.f8907a) && z.f70071a < 27) {
            try {
                JSONObject jSONObject = new JSONObject(z.n(bArr2));
                StringBuilder sb3 = new StringBuilder("{\"keys\":[");
                JSONArray jSONArray = jSONObject.getJSONArray(UserMetadata.KEYDATA_FILENAME);
                for (int i14 = 0; i14 < jSONArray.length(); i14++) {
                    if (i14 != 0) {
                        sb3.append(",");
                    }
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i14);
                    sb3.append("{\"k\":\"");
                    sb3.append(jSONObject2.getString(JWKParameterNames.OCT_KEY_VALUE).replace('-', '+').replace('_', IOUtils.DIR_SEPARATOR_UNIX));
                    sb3.append("\",\"kid\":\"");
                    sb3.append(jSONObject2.getString("kid").replace('-', '+').replace('_', IOUtils.DIR_SEPARATOR_UNIX));
                    sb3.append("\",\"kty\":\"");
                    sb3.append(jSONObject2.getString(JWKParameterNames.KEY_TYPE));
                    sb3.append("\"}");
                }
                sb3.append("]}");
                bArr2 = sb3.toString().getBytes(StandardCharsets.UTF_8);
            } catch (JSONException e4) {
                k.d("Failed to adjust response data: ".concat(z.n(bArr2)), e4);
            }
        }
        return this.f8908b.provideKeyResponse(bArr, bArr2);
    }

    @Override // androidx.media3.exoplayer.drm.g
    public final void provideProvisionResponse(byte[] bArr) throws DeniedByServerException {
        this.f8908b.provideProvisionResponse(bArr);
    }

    @Override // androidx.media3.exoplayer.drm.g
    public final Map<String, String> queryKeyStatus(byte[] bArr) {
        return this.f8908b.queryKeyStatus(bArr);
    }

    @Override // androidx.media3.exoplayer.drm.g
    public final synchronized void release() {
        int i14 = this.f8909c - 1;
        this.f8909c = i14;
        if (i14 == 0) {
            this.f8908b.release();
        }
    }

    @Override // androidx.media3.exoplayer.drm.g
    public final boolean requiresSecureDecoder(byte[] bArr, String str) throws Throwable {
        boolean zEquals;
        int i14 = z.f70071a;
        UUID uuid = this.f8907a;
        if (i14 >= 31) {
            boolean zEquals2 = uuid.equals(androidx.media3.common.h.f8299d);
            MediaDrm mediaDrm = this.f8908b;
            if (zEquals2) {
                String propertyString = mediaDrm.getPropertyString("version");
                zEquals = (propertyString.startsWith("v5.") || propertyString.startsWith("14.") || propertyString.startsWith("15.") || propertyString.startsWith("16.0")) ? false : true;
            } else {
                zEquals = uuid.equals(androidx.media3.common.h.f8298c);
            }
            if (zEquals) {
                return mediaDrm.requiresSecureDecoder(str, mediaDrm.getSecurityLevel(bArr));
            }
        }
        MediaCrypto mediaCrypto = null;
        try {
            MediaCrypto mediaCrypto2 = new MediaCrypto(uuid, bArr);
            try {
                boolean zRequiresSecureDecoderComponent = mediaCrypto2.requiresSecureDecoderComponent(str);
                mediaCrypto2.release();
                return zRequiresSecureDecoderComponent;
            } catch (MediaCryptoException unused) {
                mediaCrypto = mediaCrypto2;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
                return true;
            } catch (Throwable th3) {
                th = th3;
                mediaCrypto = mediaCrypto2;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
                throw th;
            }
        } catch (MediaCryptoException unused2) {
        } catch (Throwable th4) {
            th = th4;
        }
    }

    @Override // androidx.media3.exoplayer.drm.g
    public final void restoreKeys(byte[] bArr, byte[] bArr2) {
        this.f8908b.restoreKeys(bArr, bArr2);
    }
}
