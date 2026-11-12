package kd0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkd0/i4;", "Lcom/garmin/android/library/livetrack/b;", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i4 implements com.garmin.android.library.livetrack.b {

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"kd0/i4$a", "Lht/r;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements ht.r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.garmin.android.library.livetrack.b.a f104120a;

        public a(com.garmin.android.library.livetrack.b.a aVar) {
            this.f104120a = aVar;
        }

        @Override // ht.r
        public final zk.a a() {
            String str;
            com.garmin.android.library.livetrack.b.a aVar = this.f104120a;
            aVar.getClass();
            int i14 = com.garmin.android.library.livetrack.b.a.C0997a.f50185a[aVar.ordinal()];
            if (i14 == 1) {
                str = "LTDeclinedRequestResend";
            } else if (i14 == 2) {
                str = "LTRenewExpiringSubscription";
            } else if (i14 == 3) {
                str = "LTRenewExpiredSubscription";
            } else {
                if (i14 != 4) {
                    lc.u0.r();
                    return null;
                }
                str = "LTWithSMSRecipient";
            }
            return new zk.a(str, null, 0L, 6, null);
        }
    }

    @Override // com.garmin.android.library.livetrack.b
    public final void a(com.garmin.android.library.livetrack.b.a aVar) {
        aVar.getClass();
        ht.s sVar = ht.s.f85508a;
        a aVar2 = new a(aVar);
        sVar.getClass();
        ht.s.a(aVar2);
    }
}
