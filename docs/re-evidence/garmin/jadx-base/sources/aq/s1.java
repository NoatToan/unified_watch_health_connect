package aq;

import com.google.android.gms.tasks.OnSuccessListener;
import com.mapbox.common.location.GoogleDeviceLocationProvider;
import com.mapbox.common.module.cronet.LazyEngine;
import com.mapbox.common.movement.GoogleActivityRecognition;
import java.util.Calendar;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class s1 implements r22.a2.d, OnSuccessListener, r22.c0.b, p4.i, jt2.a.InterfaceC1941a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.l f12197b;

    public /* synthetic */ s1(e23.l lVar, int i14) {
        this.f12196a = i14;
        this.f12197b = lVar;
    }

    @Override // p4.i
    public double a(double d14) {
        int i14 = this.f12196a;
        e23.l lVar = this.f12197b;
        switch (i14) {
            case 8:
                p4.q.a aVar = p4.q.f135600r;
                break;
            case 9:
                p4.q.a aVar2 = p4.q.f135600r;
                break;
            case 10:
                p4.q.a aVar3 = p4.q.f135600r;
                break;
            default:
                p4.q.a aVar4 = p4.q.f135600r;
                break;
        }
        return ((Number) lVar.invoke(Double.valueOf(d14))).doubleValue();
    }

    @Override // jt2.a.InterfaceC1941a
    public void d(int i14) {
        switch (this.f12196a) {
            case 12:
                this.f12197b.invoke(Integer.valueOf(i14));
                break;
            case 13:
            default:
                this.f12197b.invoke(Integer.valueOf(i14));
                break;
            case 14:
                this.f12197b.invoke(Integer.valueOf(i14));
                break;
        }
    }

    @Override // r22.c0.b
    public void h(Calendar calendar) {
        switch (this.f12196a) {
            case 7:
                this.f12197b.invoke(calendar);
                break;
            default:
                LocalDate localDate = new DateTime(calendar.getTimeInMillis()).withTimeAtStartOfDay().toLocalDate();
                localDate.getClass();
                this.f12197b.invoke(localDate);
                break;
        }
    }

    @Override // r22.a2.d
    public void i(String str, int i14, int i15, String str2, String str3, int i16) {
        c22.l3.f23124b.getClass();
        this.f12197b.invoke(Integer.valueOf(c22.l3.a.y(i14, i15, i16)));
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        switch (this.f12196a) {
            case 1:
                GoogleDeviceLocationProvider.removeLocationUpdates$lambda$9(this.f12197b, obj);
                break;
            case 2:
                GoogleDeviceLocationProvider.doStop$lambda$2(this.f12197b, obj);
                break;
            case 3:
                GoogleDeviceLocationProvider.doStart$lambda$0(this.f12197b, obj);
                break;
            case 4:
                GoogleDeviceLocationProvider.requestLocationUpdates$lambda$7(this.f12197b, obj);
                break;
            case 5:
                LazyEngine.tryInstallFromGooglePlay$lambda$1(this.f12197b, obj);
                break;
            default:
                GoogleActivityRecognition.Companion.withLogs$lambda$6(this.f12197b, obj);
                break;
        }
    }
}
