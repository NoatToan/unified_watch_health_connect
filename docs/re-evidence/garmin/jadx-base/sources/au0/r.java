package au0;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0007B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lau0/r;", "Lmf2/e;", "Lkotlin/Function0;", "Lrd2/f;", "getDeviceDAO", "<init>", "(Le23/a;)V", "a", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class r implements mf2.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e23.a<rd2.f> f12985a;

    static {
        new a(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public r(e23.a<? extends rd2.f> aVar) {
        aVar.getClass();
        this.f12985a = aVar;
    }

    @Override // mf2.e
    public final mf2.f a(long j8) {
        this.f12985a.invoke().f152045a.getClass();
        sd2.f fVarI = rd2.j.i(j8, null);
        if (fVarI != null) {
            return new mf2.f(j8, fVarI.getProductDisplayName(), fVarI.getPartNumber(), fVarI.getSoftwareVersion());
        }
        String strF = androidx.room.a0.f(j8, "Failed to get device info for ", ")");
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.f(a2Var, "LiveActivityAnalyticsDelegateImpl", strF);
        return null;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lau0/r$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
