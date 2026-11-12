package com.google.android.exoplayer2.drm;

import defpackage.g83;
import defpackage.oh8;
import defpackage.rk1;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements DrmSession {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DrmSession.DrmSessionException f7899a;

    public e(DrmSession.DrmSessionException drmSessionException) {
        this.f7899a = (DrmSession.DrmSessionException) rk1.e(drmSessionException);
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public void a(b.a aVar) {
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public boolean b() {
        return false;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public DrmSession.DrmSessionException c() {
        return this.f7899a;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public Map<String, String> e() {
        return null;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public void f(b.a aVar) {
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public final UUID g() {
        return g83.f18708a;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public int getState() {
        return 1;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public oh8 h() {
        return null;
    }
}
