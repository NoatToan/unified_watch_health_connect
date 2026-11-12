package jk0;

import android.content.Context;
import com.garmin.android.apps.connectmobile.GarminConnectMobileApp;
import com.garmin.android.apps.connectmobile.incidentdetection.model.GcsDateTimeAdapter;
import com.garmin.android.apps.connectmobile.liveeventsharing.database.LiveEventDatabase;
import com.garmin.feature.garminpay.providers.gpay.ui.cardverification.FitPayCardVerificationActivity;
import com.garmin.feature.garminpay.ui.developer.DeveloperSettingsActivity;
import g01.y;
import m20.z;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.ISODateTimeFormat;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class w implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f99350a;

    public /* synthetic */ w(int i14) {
        this.f99350a = i14;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f99350a) {
            case 0:
                x.Companion companion = x.INSTANCE;
                return new m63.e(g.a.f99252a);
            case 1:
                x.Companion companion2 = x.INSTANCE;
                return new q();
            case 2:
                x.Companion companion3 = x.INSTANCE;
                return new m63.e(e.a.f99245a);
            case 3:
                x.Companion companion4 = x.INSTANCE;
                return new m63.e(n.a.f99301a);
            case 4:
                x.Companion companion5 = x.INSTANCE;
                return new m63.e(k.a.f99278a);
            case 5:
                jl1.b bVar = jl1.b.f99470a;
                return Unit.INSTANCE;
            case 6:
                int i14 = gt2.c.f79010a;
                return gt2.b.f79005a.h("PAY#DeviceActionQueue");
            case 7:
                FitPayCardVerificationActivity.b bVar2 = FitPayCardVerificationActivity.f51449m;
                int i15 = gt2.c.f79010a;
                return gt2.b.f79005a.h("PAY#NEW_FITPAY#FitPayCardVerificationActivity");
            case 8:
                int i16 = GcsDateTimeAdapter.f36861d;
                return DateTimeFormat.forPattern("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'").withZoneUTC();
            case 9:
                int i17 = GcsDateTimeAdapter.f36861d;
                return ISODateTimeFormat.dateTimeParser().withZoneUTC();
            case 10:
                jq1.a.b bVar3 = jq1.a.Companion;
                return new m63.e(jq1.e.a.f99997a);
            case 11:
                String str = DeveloperSettingsActivity.f51946n;
                return new DeveloperSettingsActivity.b(ve2.e.f177707g, pn2.a.i.SonyLab, pn2.a.f.SonyLab, pn2.a.b.SonyLab);
            case 12:
                String str2 = DeveloperSettingsActivity.f51946n;
                pn2.a.f138690a.getClass();
                return pn2.a.d();
            case 13:
                String str3 = DeveloperSettingsActivity.f51946n;
                pn2.a.f138690a.getClass();
                return pn2.a.c();
            case 14:
                String str4 = DeveloperSettingsActivity.f51946n;
                pn2.a.f138690a.getClass();
                return pn2.a.a();
            case 15:
                String str5 = DeveloperSettingsActivity.f51946n;
                pn2.a.f138690a.getClass();
                return pn2.a.e();
            case 16:
                String str6 = DeveloperSettingsActivity.f51946n;
                pn2.a.f138690a.getClass();
                return pn2.a.b();
            case 17:
                return p0.n(null);
            case 18:
                return p0.n("");
            case 19:
                return Unit.INSTANCE;
            case 20:
                ju0.e.a aVar = ju0.e.f100881g;
                LiveEventDatabase.a aVar2 = LiveEventDatabase.f38500a;
                GarminConnectMobileApp.f28685g.getClass();
                Context contextA = GarminConnectMobileApp.a.a();
                aVar2.getClass();
                LiveEventDatabase liveEventDatabase = LiveEventDatabase.f38501b;
                if (liveEventDatabase == null) {
                    synchronized (aVar2) {
                        Context applicationContext = contextA.getApplicationContext();
                        applicationContext.getClass();
                        liveEventDatabase = (LiveEventDatabase) androidx.room.x.a(applicationContext, LiveEventDatabase.class, "live_event_database").b();
                        LiveEventDatabase.f38501b = liveEventDatabase;
                    }
                }
                return liveEventDatabase;
            case 21:
                ju0.e.a aVar3 = ju0.e.f100881g;
                return (z) KoinJavaComponent.get$default(z.class, null, null, 6, null);
            case 22:
                jy0.e eVar = jy0.e.f101684a;
                return Unit.INSTANCE;
            case 23:
                jy0.e eVar2 = jy0.e.f101684a;
                return Unit.INSTANCE;
            case 24:
                jy0.f fVar = jy0.f.f101690a;
                return Unit.INSTANCE;
            case 25:
                jy0.f fVar2 = jy0.f.f101690a;
                return Unit.INSTANCE;
            case 26:
                k01.b.C1958b c1958b = k01.b.Companion;
                return new u01.a();
            case 27:
                k01.b.C1958b c1958b2 = k01.b.Companion;
                return new u01.a();
            case 28:
                k01.b.C1958b c1958b3 = k01.b.Companion;
                return l01.e.INSTANCE.serializer();
            default:
                k01.b.C1958b c1958b4 = k01.b.Companion;
                return new m63.e(y.a.f74292a);
        }
    }
}
