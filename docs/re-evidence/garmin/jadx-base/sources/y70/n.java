package y70;

import n70.n2;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Ly70/n;", "Lr70/s;", "Ln70/n2;", "getIncorrectPasscodeDevicesUseCase", "Lv80/a;", "resetPasscodeOnDeviceUseCase", "Ls80/c;", "deviceIncorrectPasscodeStatus", "<init>", "(Ln70/n2;Lv80/a;Ls80/c;)V", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class n implements r70.s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v80.a f194672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s80.c f194673b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o13.t f194674c;

    public n(n2 n2Var, v80.a aVar, s80.c cVar) {
        n2Var.getClass();
        aVar.getClass();
        cVar.getClass();
        this.f194672a = aVar;
        this.f194673b = cVar;
        this.f194674c = o13.m.b(new xn.r(n2Var, 12));
    }

    @Override // r70.s
    public final String a() {
        return o70.f.INCORRECT_PASSCODE.a();
    }
}
