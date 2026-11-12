package o62;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Point;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.p1;
import androidx.lifecycle.y0;
import b0.g1;
import ch.qos.logback.classic.Logger;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.courses.presentation.search.CourseSearchActivity;
import com.garmin.android.apps.connectmobile.ecg.presentation.onboarding.steps.BirthDateFragment;
import com.garmin.android.apps.connectmobile.golf.truswing.model.SwingDTO;
import com.garmin.android.apps.connectmobile.q1;
import com.garmin.android.apps.connectmobile.traininginitiative.viewmodels.AddTIEventViewModel;
import com.garmin.android.apps.connectmobile.view.audiorecording.AudioRecordingView;
import com.garmin.android.apps.connectmobile.workouts.presentation.common.list.SpinnerDialogView;
import com.garmin.feature.garminpay.providers.felica.exception.ServerInMaintenanceAlertException;
import com.garmin.feature.garminpay.providers.felica.exception.ServerInMaintenanceException;
import com.garmin.feature.garminpay.ui.devicesettings.DeviceSettingsActivity;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Ordering;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.gson.Gson;
import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.TimeZone;
import java.util.concurrent.ScheduledExecutorService;
import o53.e1;
import org.apache.commons.lang3.Functions;
import org.apache.commons.lang3.function.FailableBooleanSupplier;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.Duration;
import org.joda.time.LocalTime;
import org.joda.time.Period;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import r53.l1;
import v.c1;
import v.e2;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class b0 implements com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.a.InterfaceC0979a, r22.c0.b, FailableBooleanSupplier, Functions.FailableSupplier, Functions.FailableRunnable, SpinnerDialogView.d, q03.u, g1.h, bb.r, fa.g, u03.a, u20.d.a, l0.a, AudioRecordingView.d, AudioRecordingView.e, q03.n, wa.e.i.a, q1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f129646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f129647b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f129648c;

    public /* synthetic */ b0(int i14, Object obj, Object obj2) {
        this.f129646a = i14;
        this.f129647b = obj;
        this.f129648c = obj2;
    }

    @Override // fa.g
    public void accept(Object obj) {
        androidx.media3.exoplayer.source.k.a aVar = (androidx.media3.exoplayer.source.k.a) this.f129647b;
        ((androidx.media3.exoplayer.source.k) obj).e(aVar.f9524a, aVar.f9525b, (sa.j) this.f129648c);
    }

    @Override // l0.a
    public ListenableFuture apply(Object obj) {
        int i14 = this.f129646a;
        Object obj2 = this.f129648c;
        Object obj3 = this.f129647b;
        switch (i14) {
            case 19:
                c1 c1Var = (c1) obj3;
                c1Var.close();
                ((p1) obj2).a();
                return c1Var.release();
            case 20:
                ScheduledExecutorService scheduledExecutorService = ((v.a0.g) obj3).f173658c;
                l0.j.a aVar = l0.j.f107810a;
                return androidx.concurrent.futures.b.a(new com.google.android.datatransport.runtime.scheduling.jobscheduling.a((androidx.concurrent.futures.b.d) obj2, scheduledExecutorService, 3000L, 6));
            case 21:
                ArrayList arrayList = (ArrayList) obj2;
                List list = (List) obj;
                ((e2) obj3).toString();
                Objects.toString(list);
                if (list.isEmpty()) {
                    IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Unable to open capture session without surfaces");
                    l0.j.a aVar2 = l0.j.f107810a;
                    return new l0.m.a(illegalArgumentException);
                }
                if (!list.contains(null)) {
                    return l0.j.e(list);
                }
                DeferrableSurface.SurfaceClosedException surfaceClosedException = new DeferrableSurface.SurfaceClosedException("Surface closed", (DeferrableSurface) arrayList.get(list.indexOf(null)));
                l0.j.a aVar3 = l0.j.f107810a;
                return new l0.m.a(surfaceClosedException);
            default:
                List list2 = (List) obj2;
                v0.d.a aVar4 = ((v0.k) obj3).f174195c;
                Integer num = (Integer) ((androidx.camera.core.impl.v0) list2.get(0)).f5814b.f(androidx.camera.core.impl.v0.f5811j, 100);
                Objects.requireNonNull(num);
                int iIntValue = num.intValue();
                Integer num2 = (Integer) ((androidx.camera.core.impl.v0) list2.get(0)).f5814b.f(androidx.camera.core.impl.v0.f5810i, 0);
                Objects.requireNonNull(num2);
                int iIntValue2 = num2.intValue();
                r0.r rVar = ((v0.d) ((tr2.b) aVar4).f166132b).f174167w;
                if (rVar != null) {
                    return rVar.f148774a.c(iIntValue, iIntValue2);
                }
                Exception exc = new Exception("Failed to take picture: pipeline is not ready.");
                l0.j.a aVar5 = l0.j.f107810a;
                return new l0.m.a(exc);
        }
    }

    @Override // q03.u
    public void c(final e13.a.C1312a c1312a) {
        final ms2.d dVarC;
        final ps2.n nVar = (ps2.n) this.f129647b;
        final is2.b bVar = (is2.b) this.f129648c;
        hs2.a aVar = nVar.f140498a;
        long j8 = nVar.f140511n;
        Logger logger = nVar.f140504g;
        if (!aVar.i().contains(bVar)) {
            logger.error("createDeviceServiceProvider: can not create device service provider for type " + bVar.name() + ", not supported");
            c1312a.a(new Throwable(am.j.m("can not create device service provider for type ", bVar.name(), ", not supported")));
        }
        ms2.g gVarA = nVar.f140502e.a(bVar);
        if (gVarA != null) {
            dVarC = gVarA.c(nVar.f140499b, nVar.f140498a);
        } else {
            dVarC = null;
        }
        if (dVarC != null) {
            dVarC.c(nVar.f140507j, new cs2.a() { // from class: ps2.j
                @Override // cs2.a
                public final void accept(Object obj) {
                    n nVar2 = nVar;
                    long j14 = nVar2.f140511n;
                    Logger logger2 = nVar2.f140504g;
                    boolean zBooleanValue = ((Boolean) obj).booleanValue();
                    is2.b bVar2 = bVar;
                    e13.a.C1312a c1312a2 = c1312a;
                    if (!zBooleanValue) {
                        logger2.error(v.h.u(j14, "createDeviceServiceProvider: failed to initialize device service provider for device ", " type: ", bVar2.name()));
                        c1312a2.a(new Throwable(v.h.u(j14, "failed to initialize device service provider for device ", " type: ", bVar2.name())));
                        return;
                    }
                    HashMap map = nVar2.f140508k;
                    ms2.d dVar = dVarC;
                    map.put(bVar2, dVar);
                    logger2.debug(v.h.u(j14, "createDeviceServiceProvider: device service provider created for device ", " type: ", bVar2.name()));
                    c1312a2.c(dVar);
                }
            });
        } else {
            logger.error(v.h.u(j8, "createDeviceServiceProvider: failed to create device service provider for device ", " type: ", bVar.name()));
            c1312a.a(new Throwable(v.h.u(j8, "failed to create device service provider for device ", " type: ", bVar.name())));
        }
    }

    @Override // bb.r
    public bb.n[] createExtractors() {
        androidx.media3.exoplayer.source.e eVar = (androidx.media3.exoplayer.source.e) this.f129647b;
        androidx.media3.common.q qVar = (androidx.media3.common.q) this.f129648c;
        return new bb.n[]{eVar.f9479d.a(qVar) ? new yb.k(eVar.f9479d.c(qVar), qVar) : new androidx.media3.exoplayer.source.e.b(qVar)};
    }

    @Override // com.garmin.android.apps.connectmobile.view.audiorecording.AudioRecordingView.e
    public void d(e23.a aVar) {
        new androidx.appcompat.app.e.a((Context) this.f129647b).setTitle(R.string.audio_note_delete_alert_message).setPositiveButton(R.string.lbl_delete, new pk1.t(29, (e23.p) this.f129648c, aVar)).setNegativeButton(R.string.lbl_cancel, (DialogInterface.OnClickListener) null).show();
    }

    /* JADX WARN: Code duplicated, block: B:29:0x006a  */
    @Override // wa.e.i.a
    public ImmutableList e(androidx.media3.common.e0 e0Var, int[] iArr, int i14) {
        int i15;
        int i16;
        int i17;
        int i18;
        androidx.media3.common.e0 e0Var2 = e0Var;
        int i19 = this.f129646a;
        Object obj = this.f129648c;
        wa.e.C3405e c3405e = (wa.e.C3405e) this.f129647b;
        switch (i19) {
            case 27:
                Ordering<Integer> ordering = wa.e.f183652k;
                int i24 = ((int[]) obj)[i14];
                int i25 = c3405e.f8242i;
                int i26 = c3405e.f8243j;
                boolean z14 = c3405e.f8244k;
                if (i25 == Integer.MAX_VALUE || i26 == Integer.MAX_VALUE) {
                    i15 = Integer.MAX_VALUE;
                } else {
                    int i27 = Integer.MAX_VALUE;
                    for (int i28 = 0; i28 < e0Var2.f8214a; i28++) {
                        androidx.media3.common.q qVar = e0Var2.f8217d[i28];
                        int i29 = qVar.f8393u;
                        int i30 = qVar.f8394v;
                        if (i29 > 0 && i30 > 0) {
                            if (!z14) {
                                i17 = i25;
                                i18 = i26;
                            } else if ((i29 > i30) != (i25 > i26)) {
                                i18 = i25;
                                i17 = i26;
                            } else {
                                i17 = i25;
                                i18 = i26;
                            }
                            int i34 = i29 * i18;
                            int i35 = i30 * i17;
                            Point point = i34 >= i35 ? new Point(i17, fa.z.f(i35, i29)) : new Point(fa.z.f(i34, i30), i18);
                            int i36 = qVar.f8393u;
                            int i37 = i36 * i30;
                            if (i36 >= ((int) (point.x * 0.98f)) && i30 >= ((int) (point.y * 0.98f)) && i37 < i27) {
                                i27 = i37;
                            }
                        }
                    }
                    i15 = i27;
                }
                ImmutableList.Builder builder = ImmutableList.builder();
                int i38 = 0;
                while (i38 < e0Var2.f8214a) {
                    androidx.media3.common.q qVar2 = e0Var2.f8217d[i38];
                    int i39 = qVar2.f8393u;
                    int i44 = (i39 == -1 || (i16 = qVar2.f8394v) == -1) ? -1 : i39 * i16;
                    builder.add(new wa.e.j(i14, e0Var2, i38, c3405e, iArr[i38], i24, i15 == Integer.MAX_VALUE || (i44 != -1 && i44 <= i15)));
                    i38++;
                    e0Var2 = e0Var;
                }
                return builder.build();
            default:
                String str = (String) obj;
                Ordering<Integer> ordering2 = wa.e.f183652k;
                ImmutableList.Builder builder2 = ImmutableList.builder();
                for (int i45 = 0; i45 < e0Var2.f8214a; i45++) {
                    builder2.add(new wa.e.h(i14, e0Var2, i45, c3405e, iArr[i45], str));
                }
                return builder2.build();
        }
    }

    @Override // com.garmin.android.apps.connectmobile.view.audiorecording.AudioRecordingView.d
    public void f(String str) {
        e23.p pVar = (e23.p) this.f129647b;
        com.garmin.android.apps.connectmobile.workouts.data.model.a aVar = (com.garmin.android.apps.connectmobile.workouts.data.model.a) this.f129648c;
        str.getClass();
        if (pVar != null) {
            pVar.invoke(aVar, new File(str));
        }
    }

    @Override // com.garmin.android.apps.connectmobile.q1.a
    public void g(boolean z14) {
        com.garmin.android.apps.connectmobile.golf.truswing.a aVar = (com.garmin.android.apps.connectmobile.golf.truswing.a) this.f129647b;
        SwingDTO swingDTO = (SwingDTO) this.f129648c;
        aVar.getClass();
        if (!z14 || swingDTO == null) {
            return;
        }
        aVar.S6();
        cl0.a.e().getClass();
        boolean zC = cl0.a.c(swingDTO);
        com.garmin.android.apps.connectmobile.golf.truswing.c cVar = aVar.F;
        long j8 = swingDTO.f35872a;
        cVar.getClass();
        androidx.lifecycle.m.a(null, new wl0.k(cVar, j8, null), 3).f(aVar, new wl0.c(aVar, zC, 0));
    }

    @Override // org.apache.commons.lang3.Functions.FailableSupplier
    public Object get() {
        return ((Functions.FailableFunction) this.f129647b).apply(this.f129648c);
    }

    @Override // org.apache.commons.lang3.function.FailableBooleanSupplier
    public boolean getAsBoolean() {
        return ((Functions.FailablePredicate) this.f129647b).test(this.f129648c);
    }

    @Override // r22.c0.b
    public void h(Calendar calendar) {
        int i14 = this.f129646a;
        int i15 = 2;
        int i16 = 1;
        Object obj = this.f129648c;
        Calendar calendar2 = (Calendar) this.f129647b;
        switch (i14) {
            case 1:
                BirthDateFragment birthDateFragment = (BirthDateFragment) obj;
                int i17 = BirthDateFragment.f34780k;
                int i18 = calendar2.get(11);
                int i19 = calendar2.get(12);
                calendar2.setTimeInMillis(calendar.getTimeInMillis());
                calendar2.set(11, i18);
                calendar2.set(12, i19);
                DateTime dateTime = new DateTime(calendar2);
                if (new Period(dateTime, DateTime.now()).getYears() >= 22) {
                    birthDateFragment.w6().setEnabled(true);
                    BirthDateFragment.a aVar = birthDateFragment.f34781i;
                    if (aVar != null) {
                        aVar.f34783a.setText(dateTime.toString("MMMM dd, YYYY"));
                        return;
                    } else {
                        p005kotlin.jvm.internal.s.m("birthDateViewHolder");
                        throw null;
                    }
                }
                birthDateFragment.w6().setEnabled(false);
                r22.o0.a aVar2 = r22.o0.f149771c;
                String string = birthDateFragment.getString(R.string.lbl_cannot_complete_ecg_app_setup);
                String string2 = birthDateFragment.getString(R.string.msg_ecg_age_restriction);
                of0.b bVar = new of0.b(birthDateFragment, i16);
                of0.b bVar2 = new of0.b(birthDateFragment, i15);
                aVar2.getClass();
                o53.f0.w(birthDateFragment).b(new of0.d(r22.o0.a.a(string, string2, R.string.lbl_edit_date, bVar, R.string.lbl_exit_setup_capitalized, bVar2), birthDateFragment, null));
                BirthDateFragment.a aVar3 = birthDateFragment.f34781i;
                if (aVar3 != null) {
                    aVar3.f34783a.setText(R.string.activities_value_not_set);
                    return;
                } else {
                    p005kotlin.jvm.internal.s.m("birthDateViewHolder");
                    throw null;
                }
            case 10:
                com.garmin.android.apps.connectmobile.blood_pressure.presentation.add_blood_pressure.a aVar4 = (com.garmin.android.apps.connectmobile.blood_pressure.presentation.add_blood_pressure.a) obj;
                com.garmin.android.apps.connectmobile.blood_pressure.presentation.add_blood_pressure.a.C0493a c0493a = com.garmin.android.apps.connectmobile.blood_pressure.presentation.add_blood_pressure.a.f30916d;
                calendar2.set(1, calendar.get(1));
                calendar2.set(2, calendar.get(2));
                calendar2.set(5, calendar.get(5));
                rw.g gVar = aVar4.f30919c;
                if (gVar == null) {
                    p005kotlin.jvm.internal.s.m("viewBinder");
                    throw null;
                }
                gVar.a(calendar2);
                if (new DateTime(calendar2).isAfterNow()) {
                    Calendar calendar3 = Calendar.getInstance();
                    calendar2.set(11, calendar3.get(11));
                    calendar2.set(12, calendar3.get(12));
                    rw.g gVar2 = aVar4.f30919c;
                    if (gVar2 == null) {
                        p005kotlin.jvm.internal.s.m("viewBinder");
                        throw null;
                    }
                    gVar2.b(calendar2);
                }
                aVar4.v6().f154818d = calendar2;
                return;
            default:
                com.garmin.android.apps.connectmobile.traininginitiative.ui.a0.a aVar5 = com.garmin.android.apps.connectmobile.traininginitiative.ui.a0.I1;
                calendar2.setTimeInMillis(calendar.getTimeInMillis());
                AddTIEventViewModel addTIEventViewModelF6 = ((com.garmin.android.apps.connectmobile.traininginitiative.ui.a0) obj).F6();
                ((y0) addTIEventViewModelF6.K0.getValue()).m(new DateTime(calendar2).toLocalDate());
                return;
        }
    }

    @Override // q03.n
    public void i(d13.c.a aVar) {
        v03.c.e(aVar, new v03.a(new w53.c(ge1.b.S(e1.f129333a, o53.s0.f129407b.plus((t13.g) this.f129647b), o53.d0.ATOMIC, new w53.e((l1) this.f129648c, aVar, null)))));
    }

    @Override // com.garmin.android.apps.connectmobile.workouts.presentation.common.list.SpinnerDialogView.d
    public void j(SpinnerDialogView spinnerDialogView, int[] iArr) {
        int i14 = this.f129646a;
        Object obj = this.f129648c;
        Object obj2 = this.f129647b;
        switch (i14) {
            case 5:
                p62.p pVar = (p62.p) obj2;
                com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var = (com.garmin.android.apps.connectmobile.workouts.data.model.j0) obj;
                int i15 = p62.p.f136238b;
                iArr.getClass();
                pVar.i(j0Var, iArr);
                spinnerDialogView.setTitle(pVar.a(j0Var));
                break;
            default:
                p62.q qVar = (p62.q) obj2;
                com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var2 = (com.garmin.android.apps.connectmobile.workouts.data.model.j0) obj;
                int i16 = p62.q.f136240b;
                iArr.getClass();
                qVar.i(j0Var2, iArr);
                spinnerDialogView.setTitle(qVar.a(j0Var2));
                break;
        }
    }

    @Override // u20.d.a
    public void k(boolean z14) {
        CourseSearchActivity courseSearchActivity = (CourseSearchActivity) this.f129647b;
        x50.c cVar = (x50.c) this.f129648c;
        CourseSearchActivity.a aVar = CourseSearchActivity.f33091e;
        if (z14) {
            courseSearchActivity.ca().z4(new x50.b.C3513b(((x50.c.f) cVar).f188992a));
        }
    }

    @Override // b0.g1.h
    public void l(g1.g gVar) {
        r0.e eVar = (r0.e) this.f129647b;
        g1 g1Var = (g1) this.f129648c;
        t0.d.e eVar2 = t0.d.e.DEFAULT;
        if (g1Var.f13907c.a() && gVar.e()) {
            eVar2 = t0.d.e.YUV;
        }
        r0.j jVar = eVar.f148707a;
        t0.d.d(true, jVar.f148726a);
        t0.d.c(jVar.f148728c);
        if (jVar.f148737l != eVar2) {
            jVar.f148737l = eVar2;
            jVar.k(jVar.f148738m);
        }
    }

    public void m(com.garmin.device.nfc.i iVar) {
        com.garmin.device.nfc.g gVar = (com.garmin.device.nfc.g) this.f129647b;
        iVar.e(((com.garmin.device.nfc.i) this.f129648c).c(), com.garmin.device.nfc.i.a.GARMIN_DEVICE);
        gVar.f50876m.offer(iVar);
    }

    /* JADX WARN: Code duplicated, block: B:43:0x01a9  */
    @Override // org.apache.commons.lang3.Functions.FailableRunnable, u03.a
    public void run() throws ServerInMaintenanceException, ServerInMaintenanceAlertException {
        pn2.h provision;
        switch (this.f129646a) {
            case 4:
                ((Functions.FailableConsumer) this.f129647b).accept(this.f129648c);
                return;
            case 13:
                tn2.f0 f0Var = (tn2.f0) this.f129647b;
                tn2.f0.a aVar = (tn2.f0.a) this.f129648c;
                f0Var.getClass();
                zf.b.r();
                pn2.i iVar = (pn2.i) new Gson().fromJson(gh2.i.f77458c.a().f77477b.h("garminpay_feature_felica_maintenance_time"), pn2.i.class);
                int i14 = tn2.f0.b.f165558a[aVar.ordinal()];
                if (i14 == 1) {
                    provision = iVar.getProvision();
                } else if (i14 == 2) {
                    provision = iVar.getTopUp();
                } else if (i14 == 3) {
                    provision = iVar.getCom.google.firebase.analytics.FirebaseAnalytics.Event.REFUND java.lang.String();
                } else if (i14 == 4) {
                    provision = iVar.getUserHistory();
                } else {
                    if (i14 != 5) {
                        lc.u0.r();
                        return;
                    }
                    provision = iVar.getUpdateUserInfo();
                }
                DateTimeZone dateTimeZoneForTimeZone = DateTimeZone.forTimeZone(TimeZone.getTimeZone("GMT+9:00"));
                dateTimeZoneForTimeZone.getClass();
                DateTime dateTimeNow = DateTime.now(dateTimeZoneForTimeZone);
                dateTimeNow.getClass();
                if (tn2.f0.b(dateTimeNow)) {
                    pn2.s monthly = provision.getMonthly();
                    LocalTime localTime = dateTimeNow.toLocalTime();
                    LocalTime localTimeA = tn2.f0.a(monthly);
                    LocalTime localTimePlusSeconds = localTimeA.plusSeconds(monthly.getDuration());
                    localTime.getClass();
                    localTimePlusSeconds.getClass();
                    if (tn2.f0.c(localTime, localTimeA, localTimePlusSeconds)) {
                        LocalTime localTimeA2 = tn2.f0.a(provision.getMonthly());
                        pn2.s monthly2 = provision.getMonthly();
                        LocalTime localTimePlusSeconds2 = tn2.f0.a(monthly2).plusSeconds(monthly2.getDuration());
                        localTimePlusSeconds2.getClass();
                        throw new ServerInMaintenanceException(localTimeA2, localTimePlusSeconds2);
                    }
                }
                pn2.s daily = provision.getDaily();
                LocalTime localTime2 = dateTimeNow.toLocalTime();
                LocalTime localTimeA3 = tn2.f0.a(daily);
                LocalTime localTimePlusSeconds3 = localTimeA3.plusSeconds(daily.getDuration());
                localTime2.getClass();
                localTimePlusSeconds3.getClass();
                if (tn2.f0.c(localTime2, localTimeA3, localTimePlusSeconds3)) {
                    LocalTime localTimeA4 = tn2.f0.a(provision.getDaily());
                    pn2.s daily2 = provision.getDaily();
                    LocalTime localTimePlusSeconds4 = tn2.f0.a(daily2).plusSeconds(daily2.getDuration());
                    localTimePlusSeconds4.getClass();
                    throw new ServerInMaintenanceException(localTimeA4, localTimePlusSeconds4);
                }
                if (p13.x.k(tn2.f0.a.PROVISION, tn2.f0.a.REFUND, tn2.f0.a.TOPUP).contains(aVar)) {
                    if (tn2.f0.b(dateTimeNow)) {
                        pn2.s monthly3 = provision.getMonthly();
                        LocalTime localTime3 = dateTimeNow.toLocalTime();
                        LocalTime localTimeA5 = tn2.f0.a(monthly3);
                        LocalTime localTimeMinusMinutes = localTimeA5.minusMinutes(10);
                        localTime3.getClass();
                        localTimeMinusMinutes.getClass();
                        if (tn2.f0.c(localTime3, localTimeMinusMinutes, localTimeA5)) {
                            throw new ServerInMaintenanceAlertException(new Duration(dateTimeNow, tn2.f0.a(provision.getMonthly()).toDateTime(dateTimeNow)));
                        }
                    }
                    pn2.s daily3 = provision.getDaily();
                    LocalTime localTime4 = dateTimeNow.toLocalTime();
                    LocalTime localTimeA6 = tn2.f0.a(daily3);
                    LocalTime localTimeMinusMinutes2 = localTimeA6.minusMinutes(10);
                    localTime4.getClass();
                    localTimeMinusMinutes2.getClass();
                    if (tn2.f0.c(localTime4, localTimeMinusMinutes2, localTimeA6)) {
                        throw new ServerInMaintenanceAlertException(new Duration(dateTimeNow, tn2.f0.a(provision.getDaily()).toDateTime(dateTimeNow)));
                    }
                    return;
                }
                return;
            case 14:
                tn2.r0.d dVar = (tn2.r0.d) this.f129647b;
                ul2.c cVar = (ul2.c) this.f129648c;
                dVar.f165655h = null;
                dVar.f165656i = null;
                cVar.e();
                return;
            case 15:
                tn2.y0.d dVar2 = (tn2.y0.d) this.f129647b;
                tn2.y0 y0Var = (tn2.y0) this.f129648c;
                org.slf4j.Logger logger = tn2.y0.f165733f;
                if (dVar2 instanceof tn2.y0.d.b) {
                    tn2.y0.c cVar2 = ((tn2.y0.d.b) dVar2).f165750a;
                    if (cVar2.f165747b && cVar2.f165746a != null && y0Var.f165739e) {
                        tn2.r0 r0Var = y0Var.f165735a;
                        long j8 = r0Var.f165640i;
                        String str = r0Var.f165641j;
                        Context contextC = ((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null)).c();
                        sz0.e eVar = sz0.e.f161375n;
                        z6.q qVar = new z6.q(contextC, eVar.f161386a);
                        qVar.N.icon = 2131232010;
                        qVar.f202683e = z6.q.e(w5.r.u(R.string.wallet_suica_card_recovery_notification));
                        qVar.f202684f = z6.q.e(w5.r.v(R.string.wallet_suica_message_card_recovery_notification, str));
                        qVar.f202689k = z6.q.e("");
                        qVar.B = "err";
                        qVar.N.vibrate = new long[]{0, 75, 75, 75, 75, 75, 75, 75};
                        qVar.f202691m = 2;
                        qVar.i(2, true);
                        Context contextC2 = ((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null)).c();
                        DeviceSettingsActivity.a aVar2 = DeviceSettingsActivity.f51993w;
                        Context contextC3 = ((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null)).c();
                        Long lValueOf = Long.valueOf(j8);
                        String strT = w52.u0.t(r0Var.f165636e);
                        aVar2.getClass();
                        qVar.f202686h = PendingIntent.getActivity(contextC2, 0, DeviceSettingsActivity.a.a(contextC3, lValueOf, strT, str), 67108864);
                        Notification notificationC = qVar.c();
                        notificationC.getClass();
                        sz0.f.a aVar3 = sz0.f.f161394a;
                        Context contextC4 = ((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null)).c();
                        aVar3.getClass();
                        sz0.f.a.f(contextC4, notificationC, 29, eVar);
                    } else {
                        sz0.f.a aVar4 = sz0.f.f161394a;
                        Context contextC5 = ((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null)).c();
                        aVar4.getClass();
                        sz0.f.a.a(29, contextC5);
                    }
                } else {
                    sz0.f.a aVar5 = sz0.f.f161394a;
                    Context contextC6 = ((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null)).c();
                    aVar5.getClass();
                    sz0.f.a.a(29, contextC6);
                }
                synchronized (y0Var.f165738d) {
                    y0Var.f165737c = false;
                    Unit unit = Unit.INSTANCE;
                }
                y0Var.f165736b.c(dVar2);
                return;
            case 16:
                tn2.y0.c cVar3 = (tn2.y0.c) this.f129647b;
                tn2.y0 y0Var2 = (tn2.y0) this.f129648c;
                org.slf4j.Logger logger2 = tn2.y0.f165733f;
                rn2.i iVar2 = cVar3.f165746a;
                tn2.r0 r0Var2 = y0Var2.f165735a;
                if (iVar2 == null) {
                    long j14 = r0Var2.f165640i;
                    logger2.trace("Update cache: Clean cache from device[" + j14 + "]");
                    r0Var2.f165642k.f165578a.c(j14, "FELICA");
                    return;
                }
                tn2.j jVar = r0Var2.f165642k;
                List listJ = jVar.f165578a.j(jVar.f165579b, "FELICA");
                if (listJ == null || !listJ.isEmpty()) {
                    Iterator it = listJ.iterator();
                    while (it.hasNext()) {
                        if (!p005kotlin.jvm.internal.s.g(((fs2.a) it.next()).f73426a, iVar2.getCid())) {
                            long j15 = r0Var2.f165640i;
                            logger2.trace("Update cache: Clean cache from device[" + j15 + "]");
                            jVar.f165578a.c(j15, "FELICA");
                        }
                    }
                }
                logger2.trace("Update cache: Add " + iVar2.getCid() + " into cache");
                jVar.a(iVar2, (cVar3.f165748c != null || cVar3.f165747b) ? qs2.f.ERROR : qs2.f.ACTIVE, null);
                return;
            default:
                p005kotlin.jvm.internal.r0 r0Var3 = (p005kotlin.jvm.internal.r0) this.f129647b;
                vr2.c cVar4 = (vr2.c) this.f129648c;
                org.slf4j.Logger logger3 = vr2.c.f179562o;
                for (fs2.a aVar6 : (Iterable) r0Var3.f105810a) {
                    is2.b bVar = aVar6.f73427b;
                    if (bVar != null) {
                        cVar4.f179567e.add(yr2.m.a(bVar).a(aVar6));
                    }
                }
                return;
        }
    }
}
