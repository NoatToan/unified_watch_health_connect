package com.google.android.exoplayer2.drm;

import android.media.MediaDrmException;
import androidx.annotation.RequiresApi;
import defpackage.obq;
import defpackage.oh8;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
@RequiresApi(18)
public final class d implements f {
    @Override // com.google.android.exoplayer2.drm.f
    public Class<obq> a() {
        return obq.class;
    }

    @Override // com.google.android.exoplayer2.drm.f
    public Map<String, String> b(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.drm.f
    public f.g c() {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.drm.f
    public byte[] d() throws MediaDrmException {
        throw new MediaDrmException("Attempting to open a session using a dummy ExoMediaDrm.");
    }

    @Override // com.google.android.exoplayer2.drm.f
    public void e(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.drm.f
    public byte[] f(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.drm.f
    public oh8 g(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.drm.f
    public void h(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.drm.f
    public void i(byte[] bArr) {
    }

    @Override // com.google.android.exoplayer2.drm.f
    public f.a j(byte[] bArr, List<DrmInitData.SchemeData> list, int i, HashMap<String, String> map) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.drm.f
    public void release() {
    }

    @Override // com.google.android.exoplayer2.drm.f
    public void setOnEventListener(f.c cVar) {
    }

    @Override // com.google.android.exoplayer2.drm.f
    public void setOnExpirationUpdateListener(f.d dVar) {
    }

    @Override // com.google.android.exoplayer2.drm.f
    public void setOnKeyStatusChangeListener(f.e eVar) {
    }
}
