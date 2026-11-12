package cq0;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import com.garmin.android.apps.connectmobile.incidentdetection.IncidentDetectionTermsActivity;
import com.garmin.proto.generated.GDIIncidentDetectionProto;
import com.garmin.proto.generated.GDISmartProto;

/* JADX INFO: loaded from: classes8.dex */
public interface j {
    void a(int i14, long j8, GDISmartProto.Smart smart);

    void c(GDISmartProto.Smart smart, long j8);

    void d(GDISmartProto.Smart smart, long j8);

    void e();

    void f();

    void g(long j8);

    void h(int i14, long j8, GDISmartProto.Smart smart);

    void i(IncidentDetectionTermsActivity incidentDetectionTermsActivity, Pair pair, Bundle bundle, hl.a aVar);

    void j(GDISmartProto.Smart smart, long j8, wm2.b bVar);

    void k();

    void l(long j8);

    void m();

    void n(long j8, GDIIncidentDetectionProto.IncidentStatusNotification.Status status);

    void o();

    void p(long j8);

    long q(com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b<l20.r> interfaceC0995b);

    void r(boolean z14);

    void s();

    boolean t(Context context, long j8);
}
