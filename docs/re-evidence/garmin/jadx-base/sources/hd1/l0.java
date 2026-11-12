package hd1;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lhd1/l0;", "Lhd1/r;", "Lhd1/l;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(Lhd1/l;)V", "gcm-domain-device_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class l0 extends r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f83390a;

    public l0(l lVar) {
        lVar.getClass();
        this.f83390a = lVar;
    }

    @Override // ym2.b
    public final void j(String str, xm2.t tVar) {
        tVar.getClass();
        k0 k0Var = new k0(tVar.f191582a, tVar.f191583b, tVar.f191584c, tVar.f191585d);
        com.garmin.android.library.backgroundtaskmanagement.b.e eVar = com.garmin.android.library.backgroundtaskmanagement.b.e.CACHED;
        k0Var.f83396a = tVar.f191586e;
        this.f83390a.a(k0Var);
    }
}
