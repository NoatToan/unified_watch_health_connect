package hk0;

import android.os.Bundle;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lhk0/h;", "Lia2/a$a;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h implements ia2.a.InterfaceC1767a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f84071a;

    public h(f fVar) {
        this.f84071a = fVar;
    }

    @Override // ia2.a.InterfaceC1767a
    public final void a(rs2.c cVar, int i14) {
        Bundle bundleE = am.j.e(i14, "com.garmin.android.gdi.EXTRA_FIND_MY_PHONE_AUDIBLE_DURATION");
        int i15 = f.f84062g;
        this.f84071a.k(cVar, "com.garmin.android.gdi.ACTION_ON_FIND_MY_PHONE_MESSAGE_RECEIVED", bundleE, true);
    }

    @Override // ia2.a.InterfaceC1767a
    public final void b(rs2.c cVar) {
        int i14 = f.f84062g;
        this.f84071a.k(cVar, "com.garmin.android.gdi.ACTION_ON_CANCEL_FIND_MY_PHONE_MESSAGE_RECEIVED", null, true);
    }
}
