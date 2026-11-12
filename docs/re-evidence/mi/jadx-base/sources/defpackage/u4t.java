package defpackage;

import com.xiaomi.hm.health.bt.error.HMDeviceError;
import com.xiaomi.hm.health.bt.profile.mili.model.Progress;

/* JADX INFO: loaded from: classes3.dex */
public class u4t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Progress f35384a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public HMDeviceError f35385b = new HMDeviceError(0);

    public void a(HMDeviceError hMDeviceError) {
        this.f35385b = hMDeviceError;
    }

    public void b(Progress progress) {
        this.f35384a = progress;
    }
}
