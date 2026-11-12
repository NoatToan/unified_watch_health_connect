package lq0;

import kq0.i;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Llq0/h;", "Lkq0/b;", "<init>", "()V", "a", "gcm-incident-detection_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h implements kq0.b {
    static {
        new a(null);
    }

    @Override // kq0.b
    public final void a(com.garmin.android.apps.connectmobile.incidentdetection.service.a aVar, kq0.g gVar, kq0.h hVar) {
        aVar.getClass();
        String str = aVar.f36880b;
        gVar.getClass();
        if (aVar instanceof com.garmin.android.apps.connectmobile.incidentdetection.service.a.f) {
            i.f106173a.getClass();
            i.a();
            kq0.a.a("UiMiddleware", str + " Show the UI/Notification");
            return;
        }
        if (aVar instanceof com.garmin.android.apps.connectmobile.incidentdetection.service.a.m) {
            kq0.f.f106156a.getClass();
            kq0.f.b();
            kq0.a.a("UiMiddleware", str + " Turn On Stimulation");
            return;
        }
        if ((aVar instanceof com.garmin.android.apps.connectmobile.incidentdetection.service.a.p) || (aVar instanceof com.garmin.android.apps.connectmobile.incidentdetection.service.a.b) || (aVar instanceof com.garmin.android.apps.connectmobile.incidentdetection.service.a.l) || (aVar instanceof com.garmin.android.apps.connectmobile.incidentdetection.service.a.e) || (aVar instanceof com.garmin.android.apps.connectmobile.incidentdetection.service.a.h) || (aVar instanceof com.garmin.android.apps.connectmobile.incidentdetection.service.a.C0659a)) {
            kq0.f.f106156a.getClass();
            kq0.f.a();
            kq0.a.a("UiMiddleware", str + " Turn Off Stimulation");
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Llq0/h$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-incident-detection_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
