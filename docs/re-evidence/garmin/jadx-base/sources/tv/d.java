package tv;

import androidx.lifecycle.y0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Ltv/d;", "Lla2/a;", "", "deviceId", "<init>", "(J)V", "a", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d implements la2.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f166500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y0 f166501b = new y0();

    static {
        new a(null);
    }

    public d(long j8) {
        this.f166500a = j8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // la2.a
    public final void onDeviceConnected(la2.b bVar) {
        if (bVar.f111632a.getF172494b() != this.f166500a) {
            return;
        }
        y0 y0Var = this.f166501b;
        fw.m mVar = (fw.m) y0Var.d();
        if (mVar != null ? p005kotlin.jvm.internal.s.g(mVar.f73770c, Boolean.TRUE) : false) {
            return;
        }
        y0Var.j(fw.m.a.g(fw.m.f73767e, Boolean.TRUE, 1));
    }

    @Override // la2.a
    public final void onDeviceConnectingFailure(la2.c cVar) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // la2.a
    public final void onDeviceDisconnected(la2.h hVar) {
        if (hVar.f111673a.getF172494b() != this.f166500a) {
            return;
        }
        y0 y0Var = this.f166501b;
        fw.m mVar = (fw.m) y0Var.d();
        if (mVar != null ? p005kotlin.jvm.internal.s.g(mVar.f73770c, Boolean.FALSE) : false) {
            return;
        }
        y0Var.j(fw.m.a.g(fw.m.f73767e, Boolean.FALSE, 1));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ltv/d$a;", "", "<init>", "()V", "", "VECTOR_3_SETTINGS_DEBUG", "Z", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
