package am;

import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes7.dex */
public class a implements d80.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d80.b f3846a;

    public a(b bVar, d80.b bVar2) {
        this.f3846a = bVar2;
    }

    @Override // d80.b
    public final void a(lj0.b bVar) {
        this.f3846a.a(bVar);
    }

    @Override // d80.b
    public final void b(Object obj, d80.b.a aVar) {
        this.f3846a.b(obj, aVar);
        f12.l lVar = (f12.l) KoinJavaComponent.get(f12.l.class);
        lVar.T3(true);
        lVar.J(true);
        ((com.garmin.android.apps.connectmobile.googlehealthconnect.a) KoinJavaComponent.get(com.garmin.android.apps.connectmobile.googlehealthconnect.a.class)).k(com.garmin.android.apps.connectmobile.googlehealthconnect.b.c.ON_MANUAL_ACTIVITY_ENTRY, true);
    }
}
