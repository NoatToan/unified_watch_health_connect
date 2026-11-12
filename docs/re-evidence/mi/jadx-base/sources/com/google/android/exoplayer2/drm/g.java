package com.google.android.exoplayer2.drm;

import android.annotation.SuppressLint;
import android.media.DeniedByServerException;
import android.media.MediaCryptoException;
import android.media.MediaDrm;
import android.media.MediaDrmException;
import android.media.NotProvisionedException;
import android.media.UnsupportedSchemeException;
import android.os.Handler;
import android.text.TextUtils;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.drm.f;
import com.google.android.exoplayer2.drm.g;
import defpackage.bu3;
import defpackage.g83;
import defpackage.loa;
import defpackage.nei;
import defpackage.okh;
import defpackage.p04;
import defpackage.rk1;
import defpackage.toe;
import defpackage.wlq;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes4.dex */
@RequiresApi(18)
public final class g implements f {
    public static final f.InterfaceC0185f d = new f.InterfaceC0185f() { // from class: noa
        @Override // com.google.android.exoplayer2.drm.f.InterfaceC0185f
        public final f a(UUID uuid) {
            return g.A(uuid);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f7906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MediaDrm f7907b;
    public int c;

    public g(UUID uuid) throws UnsupportedSchemeException {
        rk1.e(uuid);
        rk1.b(!g83.f18709b.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.f7906a = uuid;
        MediaDrm mediaDrm = new MediaDrm(s(uuid));
        this.f7907b = mediaDrm;
        this.c = 1;
        if (g83.d.equals(uuid) && B()) {
            u(mediaDrm);
        }
    }

    public static /* synthetic */ f A(UUID uuid) {
        try {
            return C(uuid);
        } catch (UnsupportedDrmException unused) {
            String strValueOf = String.valueOf(uuid);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 53);
            sb.append("Failed to instantiate a FrameworkMediaDrm for uuid: ");
            sb.append(strValueOf);
            sb.append(".");
            toe.c("FrameworkMediaDrm", sb.toString());
            return new d();
        }
    }

    public static boolean B() {
        return "ASUS_Z00AD".equals(wlq.d);
    }

    public static g C(UUID uuid) throws UnsupportedDrmException {
        try {
            return new g(uuid);
        } catch (UnsupportedSchemeException e) {
            throw new UnsupportedDrmException(1, e);
        } catch (Exception e2) {
            throw new UnsupportedDrmException(2, e2);
        }
    }

    public static byte[] o(byte[] bArr) {
        okh okhVar = new okh(bArr);
        int iQ = okhVar.q();
        short s = okhVar.s();
        short s2 = okhVar.s();
        if (s != 1 || s2 != 1) {
            toe.f("FrameworkMediaDrm", "Unexpected record count or type. Skipping LA_URL workaround.");
            return bArr;
        }
        short s3 = okhVar.s();
        Charset charset = bu3.e;
        String strB = okhVar.B(s3, charset);
        if (strB.contains("<LA_URL>")) {
            return bArr;
        }
        int iIndexOf = strB.indexOf("</DATA>");
        if (iIndexOf == -1) {
            toe.h("FrameworkMediaDrm", "Could not find the </DATA> tag. Skipping LA_URL workaround.");
        }
        String strSubstring = strB.substring(0, iIndexOf);
        String strSubstring2 = strB.substring(iIndexOf);
        StringBuilder sb = new StringBuilder(String.valueOf(strSubstring).length() + 26 + String.valueOf(strSubstring2).length());
        sb.append(strSubstring);
        sb.append("<LA_URL>https://x</LA_URL>");
        sb.append(strSubstring2);
        String string = sb.toString();
        int i = iQ + 52;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        byteBufferAllocate.putInt(i);
        byteBufferAllocate.putShort(s);
        byteBufferAllocate.putShort(s2);
        byteBufferAllocate.putShort((short) (string.length() * 2));
        byteBufferAllocate.put(string.getBytes(charset));
        return byteBufferAllocate.array();
    }

    public static byte[] p(UUID uuid, byte[] bArr) {
        return g83.c.equals(uuid) ? p04.a(bArr) : bArr;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0058  */
    /* JADX WARN: Code duplicated, block: B:27:0x005e A[RETURN] */
    public static byte[] q(UUID uuid, byte[] bArr) {
        byte[] bArrE;
        UUID uuid2 = g83.e;
        if (uuid2.equals(uuid)) {
            byte[] bArrE2 = nei.e(bArr, uuid);
            if (bArrE2 != null) {
                bArr = bArrE2;
            }
            bArr = nei.a(uuid2, o(bArr));
        }
        if (wlq.f38110a < 23 && g83.d.equals(uuid)) {
            bArrE = nei.e(bArr, uuid);
            if (bArrE != null) {
                return bArrE;
            }
        } else if (uuid2.equals(uuid) && "Amazon".equals(wlq.c)) {
            String str = wlq.d;
            if ("AFTB".equals(str) || "AFTS".equals(str) || "AFTM".equals(str) || "AFTT".equals(str)) {
                bArrE = nei.e(bArr, uuid);
                if (bArrE != null) {
                    return bArrE;
                }
            }
        }
        return bArr;
    }

    public static String r(UUID uuid, String str) {
        return (wlq.f38110a < 26 && g83.c.equals(uuid) && ("video/mp4".equals(str) || "audio/mp4".equals(str))) ? "cenc" : str;
    }

    public static UUID s(UUID uuid) {
        return (wlq.f38110a >= 27 || !g83.c.equals(uuid)) ? uuid : g83.f18709b;
    }

    @SuppressLint({"WrongConstant"})
    public static void u(MediaDrm mediaDrm) {
        mediaDrm.setPropertyString("securityLevel", "L3");
    }

    public static DrmInitData.SchemeData w(UUID uuid, List<DrmInitData.SchemeData> list) {
        if (!g83.d.equals(uuid)) {
            return list.get(0);
        }
        if (wlq.f38110a >= 28 && list.size() > 1) {
            DrmInitData.SchemeData schemeData = list.get(0);
            int i = 0;
            int length = 0;
            while (true) {
                if (i >= list.size()) {
                    byte[] bArr = new byte[length];
                    int i2 = 0;
                    for (int i3 = 0; i3 < list.size(); i3++) {
                        byte[] bArr2 = (byte[]) rk1.e(list.get(i3).e);
                        int length2 = bArr2.length;
                        System.arraycopy(bArr2, 0, bArr, i2, length2);
                        i2 += length2;
                    }
                    return schemeData.c(bArr);
                }
                DrmInitData.SchemeData schemeData2 = list.get(i);
                byte[] bArr3 = (byte[]) rk1.e(schemeData2.e);
                if (!wlq.c(schemeData2.d, schemeData.d) || !wlq.c(schemeData2.c, schemeData.c) || !nei.c(bArr3)) {
                    break;
                }
                length += bArr3.length;
                i++;
            }
        }
        for (int i4 = 0; i4 < list.size(); i4++) {
            DrmInitData.SchemeData schemeData3 = list.get(i4);
            int iG = nei.g((byte[]) rk1.e(schemeData3.e));
            int i5 = wlq.f38110a;
            if (i5 < 23 && iG == 0) {
                return schemeData3;
            }
            if (i5 >= 23 && iG == 1) {
                return schemeData3;
            }
        }
        return list.get(0);
    }

    @Override // com.google.android.exoplayer2.drm.f
    public Class<loa> a() {
        return loa.class;
    }

    @Override // com.google.android.exoplayer2.drm.f
    public Map<String, String> b(byte[] bArr) {
        return this.f7907b.queryKeyStatus(bArr);
    }

    @Override // com.google.android.exoplayer2.drm.f
    public f.g c() {
        MediaDrm.ProvisionRequest provisionRequest = this.f7907b.getProvisionRequest();
        return new f.g(provisionRequest.getData(), provisionRequest.getDefaultUrl());
    }

    @Override // com.google.android.exoplayer2.drm.f
    public byte[] d() throws MediaDrmException {
        return this.f7907b.openSession();
    }

    @Override // com.google.android.exoplayer2.drm.f
    public void e(byte[] bArr, byte[] bArr2) {
        this.f7907b.restoreKeys(bArr, bArr2);
    }

    @Override // com.google.android.exoplayer2.drm.f
    public byte[] f(byte[] bArr, byte[] bArr2) throws DeniedByServerException, NotProvisionedException {
        if (g83.c.equals(this.f7906a)) {
            bArr2 = p04.b(bArr2);
        }
        return this.f7907b.provideKeyResponse(bArr, bArr2);
    }

    @Override // com.google.android.exoplayer2.drm.f
    public void h(byte[] bArr) throws DeniedByServerException {
        this.f7907b.provideProvisionResponse(bArr);
    }

    @Override // com.google.android.exoplayer2.drm.f
    public void i(byte[] bArr) {
        this.f7907b.closeSession(bArr);
    }

    @Override // com.google.android.exoplayer2.drm.f
    public f.a j(byte[] bArr, List<DrmInitData.SchemeData> list, int i, HashMap<String, String> map) throws NotProvisionedException {
        DrmInitData.SchemeData schemeDataW;
        byte[] bArrQ;
        String strR;
        if (list != null) {
            schemeDataW = w(this.f7906a, list);
            bArrQ = q(this.f7906a, (byte[]) rk1.e(schemeDataW.e));
            strR = r(this.f7906a, schemeDataW.d);
        } else {
            schemeDataW = null;
            bArrQ = null;
            strR = null;
        }
        MediaDrm.KeyRequest keyRequest = this.f7907b.getKeyRequest(bArr, bArrQ, strR, i, map);
        byte[] bArrP = p(this.f7906a, keyRequest.getData());
        String defaultUrl = keyRequest.getDefaultUrl();
        if ("https://x".equals(defaultUrl)) {
            defaultUrl = "";
        }
        if (TextUtils.isEmpty(defaultUrl) && schemeDataW != null && !TextUtils.isEmpty(schemeDataW.c)) {
            defaultUrl = schemeDataW.c;
        }
        return new f.a(bArrP, defaultUrl, wlq.f38110a >= 23 ? keyRequest.getRequestType() : Integer.MIN_VALUE);
    }

    @Override // com.google.android.exoplayer2.drm.f
    public synchronized void release() {
        int i = this.c - 1;
        this.c = i;
        if (i == 0) {
            this.f7907b.release();
        }
    }

    @Override // com.google.android.exoplayer2.drm.f
    public void setOnEventListener(final f.c cVar) {
        this.f7907b.setOnEventListener(cVar == null ? null : new MediaDrm.OnEventListener() { // from class: poa
            @Override // android.media.MediaDrm.OnEventListener
            public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i, int i2, byte[] bArr2) {
                this.f30584a.x(cVar, mediaDrm, bArr, i, i2, bArr2);
            }
        });
    }

    @Override // com.google.android.exoplayer2.drm.f
    @RequiresApi(23)
    public void setOnExpirationUpdateListener(final f.d dVar) {
        if (wlq.f38110a < 23) {
            throw new UnsupportedOperationException();
        }
        this.f7907b.setOnExpirationUpdateListener(dVar == null ? null : new MediaDrm.OnExpirationUpdateListener(dVar) { // from class: ooa
            @Override // android.media.MediaDrm.OnExpirationUpdateListener
            public final void onExpirationUpdate(MediaDrm mediaDrm, byte[] bArr, long j) {
                this.f29336a.y(null, mediaDrm, bArr, j);
            }
        }, (Handler) null);
    }

    @Override // com.google.android.exoplayer2.drm.f
    @RequiresApi(23)
    public void setOnKeyStatusChangeListener(final f.e eVar) {
        if (wlq.f38110a < 23) {
            throw new UnsupportedOperationException();
        }
        this.f7907b.setOnKeyStatusChangeListener(eVar == null ? null : new MediaDrm.OnKeyStatusChangeListener(eVar) { // from class: moa
            @Override // android.media.MediaDrm.OnKeyStatusChangeListener
            public final void onKeyStatusChange(MediaDrm mediaDrm, byte[] bArr, List list, boolean z) {
                this.f27047a.z(null, mediaDrm, bArr, list, z);
            }
        }, (Handler) null);
    }

    @Override // com.google.android.exoplayer2.drm.f
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public loa g(byte[] bArr) throws MediaCryptoException {
        return new loa(s(this.f7906a), bArr, wlq.f38110a < 21 && g83.d.equals(this.f7906a) && "L3".equals(v("securityLevel")));
    }

    public String v(String str) {
        return this.f7907b.getPropertyString(str);
    }

    public final /* synthetic */ void x(f.c cVar, MediaDrm mediaDrm, byte[] bArr, int i, int i2, byte[] bArr2) {
        cVar.a(this, bArr, i, i2, bArr2);
    }

    public final /* synthetic */ void y(f.d dVar, MediaDrm mediaDrm, byte[] bArr, long j) {
        dVar.a(this, bArr, j);
    }

    public final /* synthetic */ void z(f.e eVar, MediaDrm mediaDrm, byte[] bArr, List list, boolean z) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MediaDrm.KeyStatus keyStatus = (MediaDrm.KeyStatus) it.next();
            arrayList.add(new f.b(keyStatus.getStatusCode(), keyStatus.getKeyId()));
        }
        eVar.a(this, bArr, arrayList, z);
    }
}
