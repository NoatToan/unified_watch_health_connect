package vn1;

import android.hardware.camera2.CameraManager;
import g8.i;
import o53.b0;
import o53.m1;
import o53.s0;
import p005kotlin.Metadata;
import t13.g;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lvn1/d;", "Lo53/b0;", "Landroid/hardware/camera2/CameraManager;", "cameraManager", "<init>", "(Landroid/hardware/camera2/CameraManager;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CameraManager f178845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m1 f178846b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f178847c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f178848d;

    public d(CameraManager cameraManager) {
        cameraManager.getClass();
        this.f178845a = cameraManager;
        this.f178846b = i.c();
        this.f178847c = true;
    }

    @Override // o53.b0
    /* JADX INFO: renamed from: getCoroutineContext */
    public final g getF195311f() {
        x53.c cVar = s0.f129406a;
        return x53.b.f189152a.plus(this.f178846b);
    }
}
