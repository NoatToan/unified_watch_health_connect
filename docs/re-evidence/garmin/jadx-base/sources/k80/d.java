package k80;

import android.net.Uri;
import e23.p;
import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class d implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f103342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.developer.tutorials.b f103343b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Uri f103344c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.l f103345d;

    public /* synthetic */ d(com.garmin.android.apps.connectmobile.developer.tutorials.b bVar, Uri uri, e23.l lVar, int i14, int i15) {
        this.f103342a = i15;
        this.f103343b = bVar;
        this.f103344c = uri;
        this.f103345d = lVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f103342a;
        e23.l<? super Float, Unit> lVar = this.f103345d;
        Uri uri = this.f103344c;
        com.garmin.android.apps.connectmobile.developer.tutorials.b bVar = this.f103343b;
        p3.m mVar = (p3.m) obj;
        ((Integer) obj2).getClass();
        com.garmin.android.apps.connectmobile.developer.tutorials.b.a aVar = com.garmin.android.apps.connectmobile.developer.tutorials.b.f33722b;
        switch (i14) {
            case 0:
                bVar.u6(uri, lVar, mVar, p0.t(1));
                break;
            default:
                bVar.v6(uri, lVar, mVar, p0.t(1));
                break;
        }
        return Unit.INSTANCE;
    }
}
