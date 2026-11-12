package mt1;

import p005kotlin.Metadata;
import p3.h0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lmt1/f;", "Lp3/h0;", "runtime"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f implements h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.c f120978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k7.b f120979b;

    public f(com.garmin.android.apps.connectmobile.c cVar, k7.b bVar) {
        this.f120978a = cVar;
        this.f120979b = bVar;
    }

    @Override // p3.h0
    public final void dispose() {
        this.f120978a.removeOnNewIntentListener(this.f120979b);
    }
}
