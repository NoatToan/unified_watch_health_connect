package hd1;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lhd1/n;", "Lhd1/r;", "Lhd1/d;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(Lhd1/d;)V", "gcm-domain-device_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class n extends r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f83392a;

    public n(d dVar) {
        dVar.getClass();
        this.f83392a = dVar;
    }

    @Override // ym2.b
    public final void c(String str, xm2.e eVar) {
        eVar.getClass();
        int i14 = eVar.f191522a;
        if (i14 <= 100) {
            m mVar = new m(i14);
            mVar.f83396a = eVar.f191523b;
            com.garmin.android.library.backgroundtaskmanagement.b.e eVar2 = com.garmin.android.library.backgroundtaskmanagement.b.e.CACHED;
            this.f83392a.a(mVar);
        }
    }
}
