package kd0;

import com.garmin.android.gfdi.configuration.SupportedCapability;
import com.garmin.device.datatypes.DeviceProfile;
import com.garmin.proto.generated.GDILiveTrackExtension;
import com.garmin.proto.generated.GDILiveTrackProto;
import com.garmin.proto.generated.GDISmartProto;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lkd0/t2;", "", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class t2 implements wd2.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f104373b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public kk1.h f104374c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f104372a = new ConcurrentHashMap(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f104375d = new b();

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"kd0/t2$b", "Lla2/a;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b implements la2.a {
        public b() {
        }

        @Override // la2.a
        public final void onDeviceConnected(la2.b bVar) {
            com.garmin.android.apps.connectmobile.i2.a aVar = com.garmin.android.apps.connectmobile.i2.f36769a;
            com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.GENERAL;
            aVar.getClass();
            com.garmin.android.apps.connectmobile.i2.a.b(a2Var, "LivetrackGcmDelegate", "onDeviceConnected");
            kk1.h hVar = t2.this.f104374c;
            if (hVar != null) {
                hVar.invoke(uu0.d.a.f172804a, Long.valueOf(bVar.f111632a.getF92746j()));
            }
        }

        @Override // la2.a
        public final void onDeviceConnectingFailure(la2.c cVar) {
        }

        @Override // la2.a
        public final void onDeviceDisconnected(la2.h hVar) {
            kk1.h hVar2;
            com.garmin.android.apps.connectmobile.i2.a aVar = com.garmin.android.apps.connectmobile.i2.f36769a;
            com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.GENERAL;
            aVar.getClass();
            com.garmin.android.apps.connectmobile.i2.a.b(a2Var, "LivetrackGcmDelegate", "onDeviceDisconnected");
            DeviceProfile deviceProfile = hVar.f111673a;
            if (hk0.p.k(deviceProfile.getF92746j()) || (hVar2 = t2.this.f104374c) == null) {
                return;
            }
            hVar2.invoke(uu0.d.b.f172805a, Long.valueOf(deviceProfile.getF92746j()));
        }
    }

    static {
        new a(null);
    }

    @Override // wd2.e
    public final void a() {
        hk0.p pVar = hk0.p.f84079d;
        if (pVar != null) {
            pVar.f84082c = null;
        }
    }

    @Override // wd2.e
    public final boolean b(long j8) {
        return nu0.c.b(j8, SupportedCapability.LIVE_TRACK_COURSE_SHARING, zb0.n0.f203578b);
    }

    @Override // wd2.e
    public final boolean c(long j8) {
        return nu0.c.c(j8);
    }

    @Override // wd2.e
    public final Object d(long j8, v13.c cVar) {
        wd2.h hVar = (wd2.h) this.f104372a.get(new Long(j8));
        if (hVar != null) {
            return hVar;
        }
        x53.c cVar2 = o53.s0.f129406a;
        return ge1.b.e0(x53.b.f189152a, new u2(j8, this, null), cVar);
    }

    @Override // wd2.e
    public final boolean e(long j8) {
        return nu0.c.b(j8, SupportedCapability.DEVICE_DRIVEN_LIVETRACK_SUPPORT, zb0.n0.f203578b);
    }

    @Override // wd2.e
    public final void f(de2.a aVar) {
        hk0.p pVar = hk0.p.f84079d;
        if (pVar != null) {
            pVar.f84082c = aVar;
        }
    }

    @Override // wd2.e
    public final boolean g(String str) {
        return yr1.e.d(str);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x009f  */
    public final ArrayList h() {
        ou0.c cVarA;
        rd2.f.a().f152045a.getClass();
        ArrayList<sd2.f> arrayListD = rd2.j.d();
        if (arrayListD == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (sd2.f fVar : arrayListD) {
            if (fVar.isPaired()) {
                long unitID = fVar.getUnitID();
                SupportedCapability supportedCapability = SupportedCapability.LIVETRACK;
                ImmutableList<String> immutableList = zb0.n0.f203578b;
                if (nu0.c.b(unitID, supportedCapability, immutableList) || nu0.c.b(unitID, SupportedCapability.DEVICE_DRIVEN_LIVETRACK_SUPPORT, immutableList)) {
                    long unitID2 = fVar.getUnitID();
                    String productNumber = fVar.getProductNumber();
                    productNumber.getClass();
                    String imageURL = fVar.getImageURL();
                    String displayName = fVar.getDisplayName();
                    if (displayName == null) {
                        displayName = "";
                    }
                    cVarA = ou0.c.a(new ou0.c(unitID2, productNumber, imageURL, displayName, Boolean.valueOf(hk0.p.k(fVar.getUnitID())), false, false, false, false, false, 992, null), null, nu0.c.c(fVar.getUnitID()), nu0.c.b(fVar.getUnitID(), SupportedCapability.LIVE_TRACK_COURSE_SHARING, immutableList), fVar.S3(), nu0.c.b(fVar.getUnitID(), SupportedCapability.LTE_SUPPORT, null), 287);
                } else {
                    cVarA = null;
                }
            } else {
                cVarA = null;
            }
            if (cVarA != null) {
                arrayList.add(cVarA);
            }
        }
        return arrayList;
    }

    public final boolean i(long j8) {
        return nu0.c.b(j8, SupportedCapability.LIVETRACK_MESSAGING, null);
    }

    public final void j(long j8) {
        hk0.q qVar;
        if (j8 == -1 || (qVar = (hk0.q) zb0.k.b(hk0.q.class, j8)) == null) {
            return;
        }
        GDISmartProto.Smart smartBuild = GDISmartProto.Smart.newBuilder().setExtension(GDILiveTrackExtension.liveTrackService, GDILiveTrackProto.LiveTrackService.newBuilder().setConsentNotification(GDILiveTrackProto.ConsentNotification.newBuilder().setConsentPageAction(GDILiveTrackProto.ConsentNotification.ConsentPageAction.REJECTED).build()).build()).build();
        smartBuild.getClass();
        u53.d dVar = qVar.f84086d;
        if (dVar != null) {
            ge1.b.T(dVar, null, null, new hk0.r(qVar, smartBuild, null), 3);
        } else {
            p005kotlin.jvm.internal.s.m("coroutineScope");
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkd0/t2$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
