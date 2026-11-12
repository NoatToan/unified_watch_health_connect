package g2;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.location.Address;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Base64;
import android.view.View;
import android.widget.Toast;
import com.garmin.android.apps.connectmobile.GarminConnectMobileApp;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.consent.DataStorageConsentActivity;
import com.garmin.android.apps.connectmobile.contacts.details.ContactDetailsActivity;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.RangeCalendar;
import com.garmin.android.apps.connectmobile.permissions.PermissionRequestNotificationReceiver;
import com.garmin.android.apps.connectmobile.permissions.RequestLocationServicesActivity;
import com.garmin.android.apps.connectmobile.permissions.RequestPermissionsActivity;
import com.garmin.android.apps.connectmobile.settings.thirdparty.google.GoogleHealthConnectActivity;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.stats.CodePackage;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.koin.java.KoinJavaComponent;
import org.slf4j.Logger;
import p005kotlin.Unit;
import p005kotlin.math.MathKt;
import r53.p2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m1 implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f75174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f75175b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f75176c;

    public /* synthetic */ m1(int i14, Object obj, Object obj2) {
        this.f75174a = i14;
        this.f75175b = obj;
        this.f75176c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // e23.l
    public final Object invoke(Object obj) {
        Integer num;
        Integer num2;
        ww0.c cVar;
        int i14 = this.f75174a;
        String str = "";
        int i15 = 9;
        int i16 = 26;
        int i17 = 2;
        int i18 = 11;
        int i19 = 3;
        boolean z14 = false;
        int i24 = 0;
        z14 = false;
        int i25 = 1;
        ww0.b log = null;
        Object obj2 = this.f75176c;
        Object obj3 = this.f75175b;
        switch (i14) {
            case 0:
                return new n1((d4.f) obj3, (Map) obj, (d4.c) obj2);
            case 1:
                ContactDetailsActivity contactDetailsActivity = (ContactDetailsActivity) obj3;
                l20.a aVar = (l20.a) obj2;
                String str2 = (String) obj;
                ContactDetailsActivity.a aVar2 = ContactDetailsActivity.f32429g;
                if (str2 != null) {
                    int iHashCode = str2.hashCode();
                    if (iHashCode != -1667476846) {
                        if (iHashCode != -339378302) {
                            if (iHashCode == 799153475 && str2.equals("EmergencyContactDetailsFragment")) {
                                k20.d.f102434j.getClass();
                                contactDetailsActivity.da(new k20.d(), str2);
                            }
                        } else if (str2.equals("LiveTrackLiveEventShareContactDetailsFragment")) {
                            com.garmin.android.apps.connectmobile.contacts.details.c.f32482m.getClass();
                            com.garmin.android.apps.connectmobile.contacts.details.c cVar2 = new com.garmin.android.apps.connectmobile.contacts.details.c();
                            Bundle bundle = new Bundle();
                            bundle.putParcelable("extra_contact_key", aVar);
                            cVar2.setArguments(bundle);
                            contactDetailsActivity.da(cVar2, str2);
                        }
                    } else if (str2.equals("ContactDetailsFragment")) {
                        com.garmin.android.apps.connectmobile.contacts.details.b.f32471d.getClass();
                        contactDetailsActivity.da(new com.garmin.android.apps.connectmobile.contacts.details.b(), str2);
                    }
                }
                return Unit.INSTANCE;
            case 2:
                com.garmin.android.apps.connectmobile.weather.defaultlocation.c cVar3 = (com.garmin.android.apps.connectmobile.weather.defaultlocation.c) obj3;
                com.garmin.android.library.mapsdkadapter.f fVar = (com.garmin.android.library.mapsdkadapter.f) obj2;
                LatLng latLng = fVar.f50283a;
                Address address = (Address) obj;
                com.garmin.android.apps.connectmobile.weather.defaultlocation.c.a aVar3 = com.garmin.android.apps.connectmobile.weather.defaultlocation.c.f47939y;
                if (address != null) {
                    cVar3.u6(address, latLng);
                    cVar3.v6(false);
                    cVar3.A6(false);
                    cVar3.F6(true);
                    cVar3.C6(address, true);
                    cVar3.f47956q = address.getCountryName();
                    qe2.h hVar = cVar3.f47952m;
                    if (hVar == null) {
                        p005kotlin.jvm.internal.s.m("map");
                        throw null;
                    }
                    cVar3.G6(fVar, hVar.f144584a.getF50270z());
                    g42.q qVar = cVar3.f47941b;
                    if (qVar != null) {
                        qVar.C4(address, fVar);
                        return Unit.INSTANCE;
                    }
                    p005kotlin.jvm.internal.s.m("viewModel");
                    throw null;
                }
                Logger loggerW6 = cVar3.w6();
                c22.z1.f23762a.getClass();
                loggerW6.error("mapClicked: Cannot get address from coordinates ".concat(c22.z1.c(fVar)));
                cVar3.u6(null, latLng);
                cVar3.A6(false);
                cVar3.E6(fVar);
                cVar3.f47956q = null;
                qe2.h hVar2 = cVar3.f47952m;
                if (hVar2 == null) {
                    p005kotlin.jvm.internal.s.m("map");
                    throw null;
                }
                cVar3.G6(fVar, hVar2.f144584a.getF50270z());
                g42.q qVar2 = cVar3.f47941b;
                if (qVar2 == null) {
                    p005kotlin.jvm.internal.s.m("viewModel");
                    throw null;
                }
                Address addressD = c22.z1.d(fVar);
                Logger logger = g42.q.f75816h;
                qVar2.C4(addressD, null);
                return Unit.INSTANCE;
            case 3:
                com.garmin.android.apps.connectmobile.weather.defaultlocation.c cVar4 = (com.garmin.android.apps.connectmobile.weather.defaultlocation.c) obj3;
                StringBuilder sb3 = (StringBuilder) obj2;
                Address address2 = (Address) obj;
                com.garmin.android.apps.connectmobile.weather.defaultlocation.c.a aVar4 = com.garmin.android.apps.connectmobile.weather.defaultlocation.c.f47939y;
                if (address2 != null && address2.getPostalCode() != null) {
                    cVar4.v6(false);
                    cVar4.F6(true);
                    return Unit.INSTANCE;
                }
                cVar4.v6(true);
                Unit unit = Unit.INSTANCE;
                cVar4.w6().debug("postalCodeEditTextListener: Could not find address from criteria {}", sb3);
                return Unit.INSTANCE;
            case 4:
                gc0.i iVar = (gc0.i) obj3;
                androidx.fragment.app.m mVar = iVar.f76870c;
                mVar.runOnUiThread(new gc0.g(iVar, z14 ? 1 : 0));
                mVar.runOnUiThread(new gc0.h(iVar, mVar.getString(R.string.device_action_msg_remove_device_failure, (String) obj2), z14 ? 1 : 0));
                return Unit.INSTANCE;
            case 5:
                gc0.l lVar = (gc0.l) obj3;
                androidx.lifecycle.y0 y0Var = (androidx.lifecycle.y0) obj2;
                vm2.h hVar3 = (vm2.h) obj;
                int i26 = gc0.l.f76879m;
                if (hVar3 != null && hVar3.f178831a) {
                    z14 = true;
                }
                o53.c2 c2Var = lVar.f76880d;
                if (c2Var != null) {
                    c2Var.c(null);
                }
                lVar.f76880d = ed0.a.m("DevicesDashboardViewModel", new gc0.n(lVar));
                y0Var.j(Boolean.valueOf(z14));
                return Unit.INSTANCE;
            case 6:
                GoogleHealthConnectActivity googleHealthConnectActivity = (GoogleHealthConnectActivity) obj3;
                lc.k0 k0Var = (lc.k0) obj;
                GoogleHealthConnectActivity.a aVar5 = GoogleHealthConnectActivity.f43979c;
                k0Var.getClass();
                l82.a.a(k0Var, lk1.e.a.f113146b.f113145a, new z3.e(-1862059373, true, new ao1.f(10, googleHealthConnectActivity, (lc.m0) obj2)));
                String str3 = lk1.e.b.f113147b.f113145a;
                str3.getClass();
                lc.a.b bVar = new lc.a.b(k0Var.f111792h);
                GoogleHealthConnectActivity.a aVar6 = GoogleHealthConnectActivity.f43979c;
                bVar.f111717g = ((com.garmin.android.apps.connectmobile.googlehealthconnect.a) googleHealthConnectActivity.f43980a.getValue()).l();
                bVar.l(str3);
                k0Var.f111797m.add(bVar);
                return Unit.INSTANCE;
            case 7:
                sd2.f fVar2 = (sd2.f) obj;
                fVar2.getClass();
                ((ws.a) obj3).h((Context) obj2, fVar2);
                return Unit.INSTANCE;
            case 8:
                b63.u uVar = (b63.u) obj;
                uVar.getClass();
                String str4 = DateTimeFormatter.ofPattern((String) obj3, (Locale) obj2).format(uVar.f16216a);
                str4.getClass();
                return str4;
            case 9:
                in.c cVar5 = (in.c) obj3;
                Context context = (Context) obj2;
                in.e eVar = (in.e) obj;
                eVar.getClass();
                if (cVar5 == null) {
                    return null;
                }
                o70.c cVar6 = cVar5.f94394b;
                gp.l.e(context, eVar, cVar6 == o70.c.ALL_ACTIVITIES ? null : in.d.a(cVar6));
                return Unit.INSTANCE;
            case 10:
                gv0.d dVar = (gv0.d) obj3;
                wd2.m1 m1Var = (wd2.m1) obj;
                int i27 = gv0.d.O0;
                m1Var.getClass();
                m1Var.i(dVar.f79184b.getF104144a().f(), new ci0.b(dVar, i16, m1Var, (e23.l) obj2));
                return Unit.INSTANCE;
            case 11:
                e23.p pVar = (e23.p) obj3;
                pv0.y yVar = (pv0.y) obj2;
                Integer num3 = (Integer) obj;
                num3.getClass();
                pVar.invoke(pv0.s.YES, new pv0.o(yVar != null ? Integer.valueOf(yVar.getF141473a()) : null, (String) null, num3, 2, (p005kotlin.jvm.internal.j) null));
                return Unit.INSTANCE;
            case 12:
                float fFloatValue = ((Float) obj).floatValue();
                h2.j0 j0Var = ((h2.p0) obj3).f80990b;
                j0Var.f80944t.t(j0Var.k(j0Var.l() + MathKt.c(j0Var.q() != 0 ? fFloatValue / j0Var.q() : 0.0f)));
                return Unit.INSTANCE;
            case 13:
                o82.g gVar = (o82.g) obj;
                gVar.getClass();
                ((n82.f) obj3).f(((i21.d) obj2).H4(gVar));
                return Unit.INSTANCE;
            case 14:
                ((e23.p) obj3).invoke((m52.k) obj2, Boolean.valueOf(!((Boolean) obj).booleanValue()));
                return Unit.INSTANCE;
            case 15:
                p5.k0 k0Var2 = (p5.k0) obj;
                h82.r rVar = h82.r.f82497a;
                k0Var2.getClass();
                p5.h0.n(k0Var2, d53.u.v(d53.u.v((String) obj3, "<link>", "", false), "</link>", "", false));
                p5.h0.p(k0Var2, (ArrayList) obj2);
                return Unit.INSTANCE;
            case 16:
                s5.c cVar7 = (s5.c) obj3;
                i53.c cVar8 = (i53.c) obj2;
                int iIntValue = ((Integer) obj).intValue();
                h82.r rVar2 = h82.r.f82497a;
                s5.c.d dVar2 = (s5.c.d) p13.h0.d0(cVar7.b(iIntValue, iIntValue, "link"));
                if (dVar2 != null) {
                    String str5 = (String) dVar2.f157149a;
                    Iterator it = cVar7.b(0, cVar7.f157138b.length(), "link").iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            i24 = -1;
                        } else if (!p005kotlin.jvm.internal.s.g(((s5.c.d) it.next()).f157149a, str5)) {
                            i24++;
                        }
                    }
                    e23.l lVar2 = (e23.l) p13.h0.e0(i24, cVar8);
                    if (lVar2 != null) {
                        lVar2.invoke(str5);
                    }
                }
                return Unit.INSTANCE;
            case 17:
                ha0.k kVar = (ha0.k) obj3;
                Context context2 = (Context) obj2;
                String str6 = (String) obj;
                str6.getClass();
                kVar.getClass();
                context2.getClass();
                boolean zJ = d53.w.J(str6);
                p2 p2Var = kVar.f82655i;
                if (zJ) {
                    p2Var.k(null, ha0.g.a((ha0.g) p2Var.getValue(), null, p13.j0.f134944a, null, 11));
                } else {
                    p2Var.k(null, ha0.g.a((ha0.g) p2Var.getValue(), null, c53.c0.s(new c53.a0(c53.c0.o(new c53.c(c53.c0.h(new p13.g0(p13.y.s(((ha0.g) p2Var.getValue()).f82640d.values())), new a42.b(context2, str6, i19)), new ha0.b(i18)), new ha0.b(12)), new ha0.i())), null, 11));
                }
                return Unit.INSTANCE;
            case 18:
                Context context3 = (Context) obj;
                context3.getClass();
                int iB = ((ha0.k) obj3).f82648b.b((il1.a) obj2);
                Parcelable.Creator<c22.i> creator = c22.i.CREATOR;
                String string = context3.getString(iB);
                string.getClass();
                return string;
            case 19:
                hc0.k kVar2 = (hc0.k) obj3;
                sd2.f fVar3 = (sd2.f) obj2;
                if (((Boolean) obj).booleanValue()) {
                    androidx.fragment.app.m activity = kVar2.getActivity();
                    fVar3.getClass();
                    zb0.k.e(activity, fVar3, new z41.j(27));
                }
                return null;
            case 20:
                ik0.e eVar2 = (ik0.e) obj3;
                Logger logger2 = eVar2.f93907a;
                Context context4 = ((hk0.f) obj2).f84064b;
                List list = (List) obj;
                int i28 = hk0.f.f84062g;
                list.getClass();
                com.garmin.android.apps.connectmobile.l.g().getClass();
                gh2.i iVar2 = gh2.i.f77458c;
                boolean zC = iVar2.a().f77477b.c("weather_show_notifications");
                com.garmin.android.apps.connectmobile.l.g().getClass();
                long j8 = 60;
                long jG = iVar2.a().f77477b.g("weather_notification_delay_hours") * j8 * j8 * ((long) 1000);
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    int i29 = hk0.f.b.f84069a[((du2.g.b) it3.next()).ordinal()];
                    str = str;
                    if (i29 == i25 || i29 == i17) {
                        GarminConnectMobileApp.f28685g.getClass();
                        Context contextA = GarminConnectMobileApp.a.a();
                        logger2.debug("getLastLocationPermissionNotification:");
                        long j14 = contextA.getSharedPreferences("weatherprefs", 0).getLong("lastPermissionNotification", 0L);
                        String str7 = com.garmin.android.apps.connectmobile.d1.f33127i;
                        if (str7 == null) {
                            str7 = str;
                        }
                        if (zC && System.currentTimeMillis() - j14 > jG && !d53.w.z(str7, "RequestPermissionsActivity", false) && !d53.w.z(str7, "DeviceSetupActivity", false)) {
                            context4.getClass();
                            logger2.debug("isLocationPermissionNotificationSent:");
                            if (context4.getSharedPreferences("weatherprefs", 0).getLong("lastPermissionNotification", 0L) == 0) {
                                ik0.e eVar3 = eVar2;
                                Context contextA2 = GarminConnectMobileApp.a.a();
                                String string2 = contextA2.getString(R.string.permission_required);
                                String strD = p6.b.d(contextA2, R.string.notification_text_location_permissions_weather, string2);
                                String string3 = contextA2.getString(R.string.notification_bigtext_location_permissions_weather);
                                string3.getClass();
                                logger2.debug("postLocationPermissionDisabledNotification:");
                                Intent intent = new Intent(contextA2, (Class<?>) RequestPermissionsActivity.class);
                                j22.a aVar7 = j22.a.f96718g;
                                int i30 = i25;
                                Intent intentPutExtra = intent.putExtra(aVar7.f96735b, contextA2.getString(R.string.notification_bigtext_location_permissions_weather));
                                ArrayList<String> arrayListD = p13.x.d(aVar7.f96735b, j22.a.f96719h.f96735b);
                                j22.b.f96736a.getClass();
                                if (j22.b.t()) {
                                    arrayListD.add(j22.a.f96720i.f96735b);
                                }
                                Unit unit2 = Unit.INSTANCE;
                                Intent intentPutStringArrayListExtra = intentPutExtra.putStringArrayListExtra("GCM_permissionType", arrayListD);
                                intentPutStringArrayListExtra.getClass();
                                PendingIntent activity2 = PendingIntent.getActivity(contextA2, 9, intentPutStringArrayListExtra, 201326592);
                                Intent intent2 = new Intent(contextA2, (Class<?>) PermissionRequestNotificationReceiver.class);
                                intent2.setAction(CodePackage.LOCATION);
                                PendingIntent broadcast = PendingIntent.getBroadcast(contextA2, 0, intent2, 67108864);
                                activity2.getClass();
                                eVar3.a(contextA2, string2, strD, string3, activity2, broadcast, 9);
                                Context contextA3 = GarminConnectMobileApp.a.a();
                                logger2.debug("setLastLocationPermissionNotification:");
                                contextA3.getSharedPreferences("weatherprefs", 0).edit().putLong("lastPermissionNotification", System.currentTimeMillis()).apply();
                                eVar2 = eVar3;
                                i25 = i30;
                            }
                        }
                        i17 = 2;
                    } else {
                        if (i29 != 3) {
                            lc.u0.r();
                            return null;
                        }
                        GarminConnectMobileApp.f28685g.getClass();
                        Context contextA4 = GarminConnectMobileApp.a.a();
                        logger2.debug("getLastLocationServicesNotification:");
                        long j15 = contextA4.getSharedPreferences("weatherprefs", 0).getLong("lastServicesNotification", 0L);
                        String str8 = com.garmin.android.apps.connectmobile.d1.f33127i;
                        if (str8 == null) {
                            str8 = str;
                        }
                        if (zC && System.currentTimeMillis() - j15 > jG && !d53.w.z(str8, "RequestPermissionsActivity", false) && !d53.w.z(str8, "DeviceSetupActivity", false)) {
                            context4.getClass();
                            logger2.debug("isLastLocationServicesNotificationSent:");
                            if (context4.getSharedPreferences("weatherprefs", 0).getLong("lastServicesNotification", 0L) == 0) {
                                ik0.e eVar4 = eVar2;
                                Context contextA5 = GarminConnectMobileApp.a.a();
                                String string4 = contextA5.getString(R.string.notification_title_location_services_disabled);
                                String strD2 = p6.b.d(contextA5, R.string.notification_text_location_services_weather, string4);
                                String string5 = contextA5.getString(R.string.notification_bigtext_location_services_weather);
                                string5.getClass();
                                logger2.debug("postLocationServicesDisabledNotification:");
                                Intent intent3 = new Intent(contextA5, (Class<?>) RequestLocationServicesActivity.class);
                                intent3.setFlags(1082130432);
                                PendingIntent activity3 = PendingIntent.getActivity(contextA5, 10, intent3, 201326592);
                                activity3.getClass();
                                eVar4.a(contextA5, string4, strD2, string5, activity3, null, 10);
                                eVar2 = eVar4;
                                Context contextA6 = GarminConnectMobileApp.a.a();
                                logger2.debug("setLastLocationServicesNotification:");
                                contextA6.getSharedPreferences("weatherprefs", 0).edit().putLong("lastServicesNotification", System.currentTimeMillis()).apply();
                            }
                        }
                    }
                    i17 = 2;
                }
                return Unit.INSTANCE;
            case 21:
                ((am.x0) obj).getClass();
                ((e23.l) obj3).invoke((ho.b) obj2);
                return Unit.INSTANCE;
            case 22:
                hq2.g gVar2 = (hq2.g) obj3;
                String str9 = (String) obj2;
                ul2.c cVar9 = (ul2.c) obj;
                int i34 = hq2.g.f85248g;
                cVar9.getClass();
                hq2.a aVar8 = hq2.a.f85231a;
                sl2.f f99649c = gVar2.f85271a.getF99649c();
                aVar8.getClass();
                f99649c.getClass();
                z03.j jVarN = as2.h.n(cVar9, hq2.a.C1691a.f85237a[f99649c.ordinal()] == 1 ? hq2.a.f85233c : hq2.a.f85232b);
                e13.o oVarM = as2.h.m(cVar9, gVar2.w(), "Failed to getBalanceAndLastTopUpRecord");
                gw.j jVar = new gw.j(new gw1.d(gVar2, i15, cVar9, str9), i18);
                int i35 = w03.b.f181178a;
                return new e13.h(jVarN.c(new e13.j(oVarM, jVar)), new hq2.c(cVar9, z14 ? 1 : 0));
            case 23:
                hq2.r rVar3 = (hq2.r) obj3;
                hq2.q qVar3 = (hq2.q) obj;
                es2.a aVar9 = rVar3.f85274d;
                String strName = rVar3.getF205815a().name();
                hs2.d dVar3 = rVar3.f85271a;
                List<fs2.a> listJ = aVar9.j(dVar3.getF99647a(), strName);
                String strEncodeToString = Base64.encodeToString((byte[]) obj2, 0);
                for (fs2.a aVar10 : listJ) {
                    if (!p005kotlin.jvm.internal.s.g(aVar10.f73426a, qVar3.getPurseId()) || !p005kotlin.jvm.internal.s.g(aVar10.f73434i, strEncodeToString)) {
                        aVar9.o(dVar3.getF99647a(), aVar10.f73426a);
                    }
                }
                fs2.a aVar11 = new fs2.a();
                aVar11.h(qVar3.getPurseId());
                aVar11.f73427b = rVar3.getF205815a();
                aVar11.f73428c = rVar3.o();
                String string6 = ((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null)).c().getString(rVar3.p());
                string6.getClass();
                aVar11.f73429d = string6;
                aVar11.f73431f = dVar3.getF99647a();
                aVar11.f73433h = qs2.f.ACTIVE;
                strEncodeToString.getClass();
                aVar11.f73434i = strEncodeToString;
                aVar11.f73436k = qVar3.a().getLastBalanceSyncTimeStamp();
                fs2.a.k(aVar11, qVar3);
                w13.b.l(aVar9, aVar11);
                return Unit.INSTANCE;
            case 24:
                byte[] bArr = (byte[]) obj;
                Logger logger3 = hq2.r.f85270f;
                bArr.getClass();
                e13.o oVarM2 = as2.h.m((ul2.c) obj2, ((hq2.r) obj3).q(), "Failed to getTransactionRecords2");
                gw.j jVar2 = new gw.j(new ct2.d(bArr, i25), i16);
                int i36 = w03.b.f181178a;
                return new e13.j(oVarM2, jVar2);
            case 25:
                ((ht2.q) obj3).f85682a.a((o53.j0) obj2, null);
                return Unit.INSTANCE;
            case 26:
                gv0.d dVar4 = (gv0.d) obj2;
                e2.f0 f0Var = (e2.f0) obj;
                f0Var.getClass();
                List list2 = (List) ((g3) ((p3.p1) obj3).getF182175a()).f35301b;
                if (list2 == null) {
                    list2 = p13.j0.f134944a;
                }
                f0Var.a(list2.size(), null, new hv0.e.f(hv0.e.C1705e.f85806a, list2), new z3.e(802480018, true, new hv0.e.g(list2, dVar4)));
                return Unit.INSTANCE;
            case 27:
                com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.a aVar12 = (com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.a) obj3;
                LocalDate localDate = (LocalDate) obj2;
                cx0.a aVar13 = (cx0.a) obj;
                com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.a.C0689a c0689a = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.a.f38856n;
                if ((aVar13 == null || (num2 = aVar13.f56601c) == null || num2.intValue() != 200) && (aVar13 == null || (num = aVar13.f56601c) == null || num.intValue() != 204)) {
                    aVar12.P1();
                    if (aVar13 != null) {
                        Integer num4 = aVar13.f56601c;
                        if (!aVar13.f56602d) {
                            if (num4 != null && num4.intValue() == 412) {
                                DataStorageConsentActivity.a aVar14 = DataStorageConsentActivity.f32194t;
                                androidx.fragment.app.m mVarRequireActivity = aVar12.requireActivity();
                                mVarRequireActivity.getClass();
                                DataStorageConsentActivity.a.d(aVar14, mVarRequireActivity, 101);
                            } else if (num4 != null && num4.intValue() == 409) {
                                new androidx.appcompat.app.e.a(aVar12.requireContext()).setMessage(R.string.pregnancy_date_overlap_message).setTitle(R.string.pregnancy_date_conflict).setCancelable(false).setPositiveButton(aVar12.getString(R.string.lbl_ok), new f20.i(18)).create().show();
                            } else {
                                Toast.makeText(aVar12.getContext(), R.string.txt_error_occurred, 0).show();
                                i2.a aVar15 = i2.f36769a;
                                com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.GENERAL;
                                aVar15.getClass();
                                i2.a.b(a2Var, "MenstrualCycleCalendarFragment", "Error Code: " + num4);
                            }
                            aVar13.f56602d = true;
                        }
                    }
                } else {
                    ax0.a aVar16 = (ax0.a) KoinJavaComponent.get$default(ax0.a.class, null, null, 6, null);
                    Context contextRequireContext = aVar12.requireContext();
                    contextRequireContext.getClass();
                    aVar16.u(contextRequireContext);
                    f12.l.f68084a.getClass();
                    f12.l.a.a().T3(true);
                    aVar12.P1();
                    Iterator it4 = aVar12.u6().f38883b.entrySet().iterator();
                    while (it4.hasNext()) {
                        ((androidx.lifecycle.y0) ((Map.Entry) it4.next()).getValue()).l(aVar12);
                    }
                    com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.b bVarU6 = aVar12.u6();
                    LinkedHashMap linkedHashMap = bVarU6.f38883b;
                    localDate.getClass();
                    ReentrantLock reentrantLock = bVarU6.f38889h;
                    reentrantLock.lock();
                    try {
                        Iterator it5 = linkedHashMap.entrySet().iterator();
                        while (it5.hasNext()) {
                            o53.l1 l1Var = (o53.l1) bVarU6.f38890i.remove(((Map.Entry) it5.next()).getKey());
                            if (l1Var != null) {
                                l1Var.c(null);
                            }
                        }
                        linkedHashMap.clear();
                        bVarU6.f38887f.clear();
                        bVarU6.f38888g = null;
                        bVarU6.f38885d = localDate;
                        bVarU6.f38886e = localDate;
                        Unit unit3 = Unit.INSTANCE;
                        reentrantLock.unlock();
                        RangeCalendar rangeCalendar = aVar12.f38867k;
                        if (rangeCalendar == null) {
                            p005kotlin.jvm.internal.s.m("cycleRangeCalendar");
                            throw null;
                        }
                        rangeCalendar.k();
                        aVar12.f38862f = true;
                        aVar12.A6(com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.i.a.NORMAL);
                        if (aVar12.f38865i) {
                            aVar12.y6();
                        } else {
                            LocalDate localDateMinusMonths = localDate.minusMonths(1);
                            localDateMinusMonths.getClass();
                            LocalDate localDateP = jg.b.P(localDateMinusMonths);
                            LocalDate localDatePlusMonths = localDate.plusMonths(1);
                            localDatePlusMonths.getClass();
                            aVar12.v6(localDateP, jg.b.t(localDatePlusMonths), localDate, true);
                        }
                    } catch (Throwable th3) {
                        reentrantLock.unlock();
                        throw th3;
                    }
                }
                return Unit.INSTANCE;
            case 28:
                com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.d dVar5 = (com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.d) obj3;
                ww0.l lVar3 = (ww0.l) obj2;
                com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.d.a aVar17 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.d.Q0;
                ((View) obj).getClass();
                hx0.s sVarT6 = dVar5.T6();
                sVarT6.getClass();
                ReentrantLock reentrantLock2 = sVarT6.f86138b;
                reentrantLock2.lock();
                try {
                    Long lValueOf = Long.valueOf(((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserProfilePk());
                    String string7 = lVar3.z().f23061a.toString("yyyy-MM-dd");
                    Integer periodLength = lVar3.getPeriodLength();
                    Long lValueOf2 = periodLength != null ? Long.valueOf(periodLength.intValue()) : null;
                    Integer predictedCycleLength = lVar3.getPredictedCycleLength();
                    sVarT6.f86142f = ge1.b.T(sVarT6, null, null, new hx0.u(sVarT6.f86142f, sVarT6, lVar3, new xw0.b(lValueOf, string7, lValueOf2, predictedCycleLength != null ? Long.valueOf(predictedCycleLength.intValue()) : null, LocalDateTime.now().toString(c22.j0.f23101c)), null), 3);
                    androidx.lifecycle.y0<cx0.a<Unit>> y0Var2 = sVarT6.f86149m;
                    reentrantLock2.unlock();
                    dh.b.L(y0Var2, dVar5, new com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.d.C0690d(new hx0.l(dVar5, i17)));
                    dVar5.f38913n = true;
                    return Unit.INSTANCE;
                } catch (Throwable th4) {
                    reentrantLock2.unlock();
                    throw th4;
                }
            default:
                com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h hVar4 = (com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h) obj3;
                View view2 = (View) obj2;
                cx0.a aVar18 = (cx0.a) obj;
                com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.a aVar19 = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.P;
                g22.e.f(hVar4);
                if ((aVar18 != null ? aVar18.f56600b : null) != null) {
                    androidx.appcompat.app.e.a aVar20 = new androidx.appcompat.app.e.a(hVar4.requireContext());
                    aVar20.setMessage(R.string.txt_error_occurred);
                    aVar20.setPositiveButton(R.string.common_retry, new hg1.g(5, hVar4, view2));
                    aVar20.setNegativeButton(R.string.lbl_cancel, new ew1.h1(hVar4, 17));
                    androidx.appcompat.app.e eVarCreate = aVar20.create();
                    eVarCreate.getClass();
                    eVarCreate.show();
                } else {
                    if (aVar18 != null && (cVar = (ww0.c) aVar18.f56599a) != null) {
                        log = cVar.getLog();
                    }
                    hVar4.A6(view2, log);
                }
                return Unit.INSTANCE;
        }
    }
}
