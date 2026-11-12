package com.garmin.android.apps.connectmobile.group.details.invite;

import com.garmin.android.apps.connectmobile.d0;
import java.util.ArrayList;
import p005kotlin.Metadata;
import vb.h;
import vm0.e;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/group/details/invite/a;", "Lcom/garmin/android/apps/connectmobile/d0$a;", "Lcom/garmin/android/apps/connectmobile/group/details/invite/d$a;", "callback", "<init>", "(Lcom/garmin/android/apps/connectmobile/group/details/invite/d$a;)V", "gcm-group_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends d0.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f36367c;

    public a(d.a aVar) {
        aVar.getClass();
        this.f36367c = new c(aVar);
    }

    @Override // com.garmin.android.apps.connectmobile.d0.a
    public final void B() {
        z(this.f36367c);
    }

    public final void C(int i14, e eVar) {
        eVar.getClass();
        c cVar = this.f36367c;
        cVar.getClass();
        ArrayList arrayList = cVar.f36382d;
        if (i14 < 0 || i14 >= arrayList.size()) {
            h.s("Failed requirement.");
        } else {
            arrayList.set(i14, eVar);
            cVar.f().r(cVar, i14);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.d0.a
    public final void clear() {
        c cVar = this.f36367c;
        cVar.f36382d.clear();
        cVar.g();
    }
}
