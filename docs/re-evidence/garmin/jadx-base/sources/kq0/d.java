package kq0;

import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import c22.o;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.incidentdetection.IncidentDetectedActivity;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import z6.h0;
import z6.q;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lkq0/d;", "", "Landroid/app/Service;", "service", "<init>", "(Landroid/app/Service;)V", "a", "gcm-incident-detection_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Service f106155a;

    static {
        new a(null);
    }

    public d(Service service) {
        service.getClass();
        this.f106155a = service;
    }

    public final void a(boolean z14) {
        Context contextC = ((o) KoinJavaComponent.get$default(o.class, null, null, 6, null)).c();
        h0 h0VarE = h0.e(contextC);
        h0VarE.d(IncidentDetectedActivity.class);
        Intent intent = new Intent(contextC, (Class<?>) IncidentDetectedActivity.class);
        intent.setFlags(536870912);
        h0VarE.a(intent);
        PendingIntent pendingIntentF = h0VarE.f();
        sz0.e eVar = sz0.e.f161370j;
        q qVar = new q(contextC, eVar.f161386a);
        qVar.N.icon = 2131232011;
        qVar.f202683e = q.e(contextC.getString(z14 ? R.string.lbl_fall_detected : R.string.incident_detected_title));
        qVar.f202684f = q.e(contextC.getString(R.string.incident_detection_assistance_notification_message));
        qVar.i(2, true);
        qVar.B = "service";
        qVar.f202691m = 2;
        qVar.E = 1;
        qVar.f202686h = pendingIntentF;
        z6.o oVar = new z6.o();
        oVar.f202664e = q.e(contextC.getString(R.string.incident_detection_assistance_notification_message));
        qVar.l(oVar);
        sz0.f.f161394a.getClass();
        Service service = this.f106155a;
        sz0.f.a.c(service, eVar);
        if (Build.VERSION.SDK_INT >= 29) {
            service.startForeground(5, qVar.c(), 16);
        } else {
            service.startForeground(5, qVar.c());
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkq0/d$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-incident-detection_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
