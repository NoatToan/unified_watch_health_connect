package kd0;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.garmin.android.apps.connectmobile.jet_lag.presentation.JetLagActivity;
import com.garmin.android.apps.connectmobile.navigation.more.MoreActivity;
import com.garmin.android.apps.connectmobile.settings.devices.common.DeviceSettingsActivityTrackerSetupDefault;
import com.garmin.android.apps.connectmobile.sleep.presentation.SleepReportsActivity;
import com.garmin.android.gfdi.configuration.SupportedCapability;
import com.garmin.proto.generated.GDIRealtimeSettingsProto;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lkd0/p5;", "Lpm1/f;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class p5 implements pm1.f {
    static {
        new a(null);
    }

    @Override // pm1.f
    public final void a(Context context) {
        if (context != null) {
            Bundle bundle = new Bundle();
            bundle.putSerializable("MORE_START_DESTINATION_EXTRA", ty0.b.J2);
            Intent intent = new Intent(context, (Class<?>) MoreActivity.class);
            intent.putExtras(bundle);
            context.startActivity(intent);
        }
    }

    @Override // pm1.f
    public final void b(Context context, long j8, String str, String str2) {
        if (context == null || g8.i.w(context) == null || j8 <= -1 || str == null || str2 == null) {
            return;
        }
        if (km2.a.i(j8, null, SupportedCapability.REALTIME_SETTINGS.ordinal())) {
            rd2.f.a().f152045a.getClass();
            sd2.f fVarI = rd2.j.i(j8, null);
            ni1.a.f126196a.getClass();
            ni1.a.C2424a.b(context, fVarI, GDIRealtimeSettingsProto.WellKnownCompositionId.PULSE_OX_SETTINGS);
            return;
        }
        Activity activityW = g8.i.w(context);
        if (activityW != null) {
            ni1.a.C2424a c2424a = ni1.a.f126196a;
            DeviceSettingsActivityTrackerSetupDefault.a aVar = DeviceSettingsActivityTrackerSetupDefault.a.PULSE_OX_SETTINGS;
            c2424a.getClass();
            aVar.getClass();
            activityW.startActivityForResult(ni1.a.C2424a.a(activityW, aVar, j8, str, str2), 999);
        }
    }

    @Override // pm1.f
    public final nm1.m c() {
        return new nm1.m((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null));
    }

    @Override // pm1.f
    public final void d(Context context) {
        context.getClass();
        JetLagActivity.f36950d.getClass();
        context.startActivity(JetLagActivity.a.a(context, true));
    }

    @Override // pm1.f
    public final void e(bc1.b bVar) {
        zb0.n0.g(new zb0.j1(bVar));
    }

    @Override // pm1.f
    public final Object f(sm1.s.j jVar) {
        t13.i iVar = new t13.i(u13.f.b(jVar));
        ed0.a.d(new q5(iVar));
        Object objA = iVar.a();
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        return objA;
    }

    @Override // pm1.f
    public final Object g(b63.o oVar, b63.o oVar2, sm1.s.f fVar) {
        return m41.b.a.a(m41.b.f116598c).a(oVar, oVar2, fVar);
    }

    @Override // pm1.f
    public final Object h(DateTime dateTime, DateTime dateTime2, sm1.s.i iVar) {
        return ((jr0.a) KoinJavaComponent.get$default(jr0.a.class, null, null, 6, null)).c(dateTime, dateTime2, iVar);
    }

    @Override // pm1.f
    public final void i(Context context, LocalDate localDate, e32.o oVar) {
        context.getClass();
        oVar.getClass();
        context.startActivity(SleepReportsActivity.a.b(SleepReportsActivity.f44239b, context, localDate != null ? localDate.toDateTimeAtStartOfDay() : null, en1.c.SCORE, oVar == e32.o.f62807j, null, null, 48));
    }

    @Override // pm1.f
    public final Object j(b63.o oVar, b63.o oVar2, sm1.s.c cVar) {
        s61.a aVarA = s61.a.C2979a.a(s61.a.f157622b);
        return com.garmin.android.apps.connectmobile.f0.J(aVarA, new s61.f(aVarA, fz0.d.a(oVar).toString(), fz0.d.a(oVar2).toString(), null), cVar);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkd0/p5$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
