package com.huawei.openalliance.ad;

import com.huawei.hms.ads.uiengine.common.MediaStateApi;

/* JADX INFO: loaded from: classes41.dex */
public class ju implements MediaStateApi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private jz f19402a;

    @Override // com.huawei.hms.ads.uiengine.common.MediaStateApi
    public void onMediaPause(int i) {
    }

    @Override // com.huawei.hms.ads.uiengine.common.MediaStateApi
    public void onMediaStop(int i) {
    }

    @Override // com.huawei.hms.ads.uiengine.common.MediaStateApi
    public void onProgress(int i, int i2) {
        hw.a("MediaStateImpl", "onProgress, percentage is %s, playTime is %s", Integer.valueOf(i), Integer.valueOf(i2));
        jz jzVar = this.f19402a;
        if (jzVar != null) {
            jzVar.a(i, i2);
        }
    }

    @Override // com.huawei.hms.ads.uiengine.common.MediaStateApi
    public void onMediaStart(int i) {
        hw.b("MediaStateImpl", "onVideoStart");
        jz jzVar = this.f19402a;
        if (jzVar != null) {
            jzVar.d();
        }
    }

    @Override // com.huawei.hms.ads.uiengine.common.MediaStateApi
    public void onMediaCompletion(int i) {
        hw.a("MediaStateImpl", "onVideoEnd, playTime is %s", Integer.valueOf(i));
    }

    public ju(jz jzVar) {
        this.f19402a = jzVar;
    }
}
