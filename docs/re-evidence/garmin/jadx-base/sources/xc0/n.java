package xc0;

import org.koin.java.KoinJavaComponent;
import org.slf4j.Logger;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class n implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f189946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.devices.settings.realtime.c f189947b;

    public /* synthetic */ n(com.garmin.android.apps.connectmobile.devices.settings.realtime.c cVar, int i14) {
        this.f189946a = i14;
        this.f189947b = cVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f189946a;
        com.garmin.android.apps.connectmobile.devices.settings.realtime.c cVar = this.f189947b;
        switch (i14) {
            case 0:
                al2.c cVar2 = (al2.c) obj;
                Logger logger = com.garmin.android.apps.connectmobile.devices.settings.realtime.c.f34371f;
                cVar2.getClass();
                if (cVar2.f3777c == al2.b.STARTED) {
                    gb2.a.b().a(cVar);
                }
                return Unit.INSTANCE;
            default:
                Logger logger2 = com.garmin.android.apps.connectmobile.devices.settings.realtime.c.f34371f;
                ((String) obj).getClass();
                return Boolean.valueOf(((m80.a) KoinJavaComponent.get$default(m80.a.class, null, null, 6, null)).e(cVar.f34373b));
        }
    }
}
