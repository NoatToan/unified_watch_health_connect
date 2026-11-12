package defpackage;

import com.xiaomi.hm.health.bt.sdk.ILFEventCallback;

/* JADX INFO: loaded from: classes8.dex */
public class chs implements ap {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ILFEventCallback f5356a;

    public chs(ILFEventCallback iLFEventCallback) {
        this.f5356a = iLFEventCallback;
    }

    @Override // defpackage.ap
    public void a(boolean z) {
        if (z) {
            this.f5356a.phoneMuteMode();
        } else {
            this.f5356a.phoneNormalMode();
        }
    }

    @Override // defpackage.ap
    public Boolean a() {
        return this.f5356a.phoneMuteState();
    }
}
