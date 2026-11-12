package kd0;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.garmin.android.apps.connectmobile.GarminAppGateway;
import com.garmin.android.apps.connectmobile.GarminConnectMobileApp;
import com.garmin.android.apps.connectmobile.activities.history.presentation.ActivitiesListActivity;
import com.garmin.android.apps.connectmobile.bic.PairedDevicesSettingsWorker;
import com.garmin.android.apps.connectmobile.bic.device.TellUsMoreActivity;
import com.garmin.android.apps.connectmobile.connectiq.ConnectIQAppStoreActivity;
import com.garmin.android.apps.connectmobile.connectiq.ConnectIQDeviceRedirectActivity;
import com.garmin.android.apps.connectmobile.courses.presentation.list.CoursesActivity;
import com.garmin.android.apps.connectmobile.dashboard.presentation.DashboardActivity;
import com.garmin.android.apps.connectmobile.device.setup.DeviceSetupActivity;
import com.garmin.android.apps.connectmobile.devices.DeviceDetailsActivity;
import com.garmin.android.apps.connectmobile.devices.setup.BLEScanningActivity;
import com.garmin.android.apps.connectmobile.devices.setup.wizard.PersonalInfoWizardActivity;
import com.garmin.android.apps.connectmobile.garminpayfeature.GarminPayLaunchScreenActivity;
import com.garmin.android.apps.connectmobile.gfdi.protobuf.DeviceMigrationProtobufHandler;
import com.garmin.android.apps.connectmobile.gfdi.protobuf.InitialSetupResponseStatus;
import com.garmin.android.apps.connectmobile.gfdi.protobuf.ProtobufRequestManager;
import com.garmin.android.apps.connectmobile.incidentdetection.IncidentDetectionTermsActivity;
import com.garmin.android.apps.connectmobile.livetracking.SetupSafetyFeaturesActivity;
import com.garmin.android.apps.connectmobile.livetrackui.presentation.LiveTrackActivity;
import com.garmin.android.apps.connectmobile.lteconnect.LteConnectionActivity;
import com.garmin.android.apps.connectmobile.settings.GCMSettingManager;
import com.garmin.android.apps.connectmobile.settings.devices.music.MusicSetupActivity;
import com.garmin.android.apps.connectmobile.settings.devices.wifi.GCMWiFiNetworksActivity;
import com.garmin.android.apps.connectmobile.workouts.presentation.list.WorkoutListActivity;
import com.garmin.android.gfdi.configuration.SupportedCapability;
import com.garmin.proto.generated.GDIDeviceStatus;
import com.garmin.proto.generated.GDILTEExtension;
import com.garmin.proto.generated.GDILTEProto;
import com.garmin.proto.generated.GDISmartProto;
import com.google.gson.Gson;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.apache.commons.io.IOUtils;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0002\b\tB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lkd0/q1;", "Lx80/b;", "Landroid/content/Context;", "applicationContext", "Lf12/b;", "userAccount", "<init>", "(Landroid/content/Context;Lf12/b;)V", "a", "b", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class q1 implements x80.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f104302c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f104303a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f12.b f104304b;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkd0/q1$b;", "", "<init>", "(Ljava/lang/String;I)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum b {
        IS_SUPPORTED,
        NOT_SUPPORTED,
        MISSING_CAPABILITY
    }

    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f104309a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f104310b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f104311c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f104312d;

        static {
            int[] iArr = new int[l90.i.values().length];
            try {
                iArr[l90.i.LEGACY_DEVICE_SETUP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[l90.i.LEGACY_DEVICE_WIZARD_SETUP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[l90.i.GOLF_APP_DEVICE_SETUP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[l90.i.DIVE_APP_DEVICE_SETUP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f104309a = iArr;
            int[] iArr2 = new int[n90.b.values().length];
            try {
                iArr2[n90.b.f125012g.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[n90.b.f125013h.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[n90.b.f125014i.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[n90.b.f125015j.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[n90.b.f125016k.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[n90.b.f125018m.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[n90.b.f125017l.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[n90.b.f125022q.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[n90.b.f125026w.ordinal()] = 9;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[n90.b.f125019n.ordinal()] = 10;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[n90.b.f125020o.ordinal()] = 11;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[n90.b.f125023r.ordinal()] = 12;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr2[n90.b.f125024t.ordinal()] = 13;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr2[n90.b.f125025v.ordinal()] = 14;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr2[n90.b.f125021p.ordinal()] = 15;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr2[n90.b.f125028y.ordinal()] = 16;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr2[n90.b.f125027x.ordinal()] = 17;
            } catch (NoSuchFieldError unused21) {
            }
            f104310b = iArr2;
            int[] iArr3 = new int[InitialSetupResponseStatus.values().length];
            try {
                iArr3[InitialSetupResponseStatus.IN_INITIAL_SETUP.ordinal()] = 1;
            } catch (NoSuchFieldError unused22) {
            }
            f104311c = iArr3;
            int[] iArr4 = new int[b.values().length];
            try {
                iArr4[b.IS_SUPPORTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr4[b.NOT_SUPPORTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr4[b.MISSING_CAPABILITY.ordinal()] = 3;
            } catch (NoSuchFieldError unused25) {
            }
            f104312d = iArr4;
        }
    }

    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001¨\u0006\u0004"}, d2 = {"kd0/q1$d", "Lzy/f;", "", "Lsd2/c;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d implements zy.f<Set<? extends sd2.c>> {
        @Override // zy.f
        public final void o(int i14) {
            com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.DEVICE_SETUP;
            com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
            com.garmin.android.apps.connectmobile.i2.a.f(a2Var, "DeviceSetupDelegate", "Initialization of default canned text replies failed.");
        }

        @Override // zy.f
        public final void onSuccess(Set<? extends sd2.c> set) {
            com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
            com.garmin.android.apps.connectmobile.i2.a.b(com.garmin.android.apps.connectmobile.a2.DEVICE_SETUP, "DeviceSetupDelegate", "Initialization of default canned text replies successful: " + set);
        }
    }

    static {
        new a(null);
    }

    public q1(Context context, f12.b bVar) {
        context.getClass();
        bVar.getClass();
        this.f104303a = context;
        this.f104304b = bVar;
    }

    public static com.garmin.android.apps.connectmobile.devices.model.l u(l90.b bVar) {
        String str = bVar.f111521f;
        String str2 = bVar.f111523h;
        String str3 = bVar.f111526k.f130962a;
        String str4 = bVar.f111516a;
        boolean z14 = bVar.f111517b;
        boolean z15 = bVar.f111518c;
        List<String> list = bVar.f111519d;
        return new com.garmin.android.apps.connectmobile.devices.model.l(0L, str, null, str2, str3, str4, z14, z15, list != null ? (String[]) list.toArray(new String[0]) : null, null, 0, bVar.f111524i, bVar.f111521f, null, null, false, null, null, false, false, false, null, null, null, false, false, 66093056, null);
    }

    @Override // x80.b
    public final void a(long j8, String str) {
        ((vf1.a) KoinJavaComponent.get$default(vf1.a.class, null, null, 6, null)).a(j8, str);
    }

    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1095)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:419)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:31)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:399)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:31)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:21)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    @Override // x80.b
    public final void b(long r9, java.lang.String r11) {
        /*
            r8 = this;
            r11.getClass()
            java.util.Map<zb0.u0, vg1.t> r0 = zb0.n0.f203577a
            boolean r0 = android.text.TextUtils.isEmpty(r11)
            if (r0 != 0) goto L49
            java.util.HashMap r0 = zb0.u0.f203782n6
            java.lang.Object r0 = r0.get(r11)
            zb0.u0 r0 = (zb0.u0) r0
            if (r0 == 0) goto L49
            int[] r1 = zb0.n0.a.f203583a
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 29
            if (r0 == r1) goto L28
            switch(r0) {
                case 3: goto L28;
                case 4: goto L28;
                case 5: goto L28;
                case 6: goto L28;
                case 7: goto L28;
                case 8: goto L28;
                default: goto L24;
            }
        L24:
            switch(r0) {
                case 31: goto L28;
                case 32: goto L28;
                case 33: goto L28;
                case 34: goto L28;
                case 35: goto L28;
                case 36: goto L28;
                case 37: goto L28;
                case 38: goto L28;
                case 39: goto L28;
                case 40: goto L28;
                case 41: goto L28;
                case 42: goto L28;
                case 43: goto L28;
                case 44: goto L28;
                case 45: goto L28;
                case 46: goto L28;
                case 47: goto L28;
                case 48: goto L28;
                case 49: goto L28;
                case 50: goto L28;
                case 51: goto L28;
                case 52: goto L28;
                case 53: goto L28;
                case 54: goto L28;
                default: goto L27;
            }
        L27:
            goto L49
        L28:
            com.garmin.android.apps.connectmobile.cannedtextreply.a$a r0 = com.garmin.android.apps.connectmobile.cannedtextreply.a.f31282d
            r0.getClass()
            com.garmin.android.apps.connectmobile.cannedtextreply.a r1 = com.garmin.android.apps.connectmobile.cannedtextreply.a.C0505a.a()
            k22.b r2 = new k22.b
            android.content.Context r0 = r8.f104303a
            r2.<init>(r0)
            kd0.q1$d r6 = new kd0.q1$d
            r6.<init>()
            r0 = 1
            r3 = 3
            r4 = 0
            int[] r7 = new int[]{r4, r0, r3}
            r3 = r9
            r5 = r11
            r1.c(r2, r3, r5, r6, r7)
        L49:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kd0.q1.b(long, java.lang.String):void");
    }

    @Override // x80.b
    public final Object c(ArrayList arrayList, x80.k.a aVar) {
        k12.d dVarA = k12.d.a.a(k12.d.f102315g);
        Object objJ = com.garmin.android.apps.connectmobile.f0.J(dVarA, new k12.b0(dVarA, arrayList, null), aVar);
        return objJ == u13.a.COROUTINE_SUSPENDED ? objJ : Unit.INSTANCE;
    }

    @Override // x80.b
    public final void d() {
        PairedDevicesSettingsWorker.f30713g.getClass();
        ve.t0 t0VarO = com.airbnb.lottie.animation.keyframe.a.o(ue.i0.f170088a, this.f104303a);
        ue.l lVar = ue.l.REPLACE;
        ue.x.a aVar = new ue.x.a((Class<? extends androidx.work.d>) PairedDevicesSettingsWorker.class);
        ue.f.a aVar2 = new ue.f.a();
        aVar2.b(ue.v.CONNECTED);
        aVar.f170098c.f26950j = aVar2.a();
        t0VarO.a("PairedDevicesSettingsWorker", lVar, aVar.a()).a();
    }

    @Override // x80.b
    public final Object e(long j8, long j14, pa0.j jVar) {
        ui1.o0.f171346d.getClass();
        return v(new ui1.g0(new ui1.f0(null, String.valueOf(j8), 1, null), new ui1.f0(null, String.valueOf(j14), 1, null), null, null, null, null, 60, null), ui1.o0.a.a(), jVar);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x00f7  */
    @Override // x80.b
    public final void f(Context context, n90.b bVar, q90.c cVar) {
        Intent intent;
        context.getClass();
        bVar.getClass();
        cVar.getClass();
        Bundle bundle = new Bundle();
        long j8 = cVar.f143493a;
        bundle.putLong("GCM_deviceUnitID", j8);
        l90.b bVar2 = cVar.f143495c;
        bundle.putString("GCM_deviceName", bVar2.f111521f);
        switch (c.f104310b[bVar.ordinal()]) {
            case 1:
                intent = new Intent(context, (Class<?>) CoursesActivity.class);
                break;
            case 2:
                intent = new Intent(context, (Class<?>) WorkoutListActivity.class);
                break;
            case 3:
                intent = new Intent(context, (Class<?>) DeviceDetailsActivity.class);
                break;
            case 4:
                intent = new Intent(context, (Class<?>) IncidentDetectionTermsActivity.class);
                break;
            case 5:
                intent = new Intent(context, (Class<?>) SetupSafetyFeaturesActivity.class);
                break;
            case 6:
                bundle = new Bundle();
                bundle.putLong("GCM_deviceUnitID", j8);
                bundle.putSerializable("APP_TYPE", com.garmin.android.apps.connectmobile.connectiq.l.APPS);
                bundle.putInt("deepLinkType", ConnectIQDeviceRedirectActivity.a.SEARCH.ordinal());
                com.garmin.android.apps.connectmobile.l.g().getClass();
                if (!com.garmin.android.apps.connectmobile.l.i()) {
                    intent = new Intent(context, (Class<?>) ConnectIQAppStoreActivity.class);
                } else {
                    com.garmin.android.apps.connectmobile.l.g().getClass();
                    if (!TextUtils.isEmpty(com.garmin.android.apps.connectmobile.l.f())) {
                        intent = new Intent(context, (Class<?>) ConnectIQDeviceRedirectActivity.class);
                    } else {
                        intent = new Intent(context, (Class<?>) ConnectIQAppStoreActivity.class);
                    }
                }
                break;
            case 7:
                intent = new Intent(context, (Class<?>) ConnectIQAppStoreActivity.class);
                break;
            case 8:
            case 9:
                intent = new Intent(context, (Class<?>) MusicSetupActivity.class);
                break;
            case 10:
            case 11:
                GarminPayLaunchScreenActivity.a aVar = GarminPayLaunchScreenActivity.f35305d;
                kj0.a.c.f104933d.getClass();
                kj0.a.c cVarA = kj0.a.c.C2015a.a(j8);
                aVar.getClass();
                intent = new Intent(GarminPayLaunchScreenActivity.a.a(context, cVarA));
                break;
            case 12:
                GCMWiFiNetworksActivity.f43245f.i(context, cVar.f143493a, bVar2.f111521f, 2131232088);
                return;
            case 13:
                GCMWiFiNetworksActivity.f43245f.i(context, cVar.f143493a, bVar2.f111521f, 2131231956);
                return;
            case 14:
                intent = new Intent(context, (Class<?>) LteConnectionActivity.class);
                break;
            case 15:
                intent = new Intent(context, (Class<?>) LiveTrackActivity.class);
                break;
            case 16:
                intent = null;
                break;
            case 17:
                intent = new Intent(context, (Class<?>) ActivitiesListActivity.class);
                am.g gVar = am.g.f3946j;
                gVar.getClass();
                intent.putExtras(h7.c.a((o13.p[]) Arrays.copyOf(new o13.p[]{new o13.p("activity_list_mode", gVar)}, 1))).getClass();
                break;
            default:
                lc.u0.r();
                return;
        }
        if (intent == null) {
            com.garmin.android.apps.connectmobile.navigation.b.f39357a.getClass();
            com.garmin.android.apps.connectmobile.navigation.b.a.c(context, null, 268468224);
            return;
        }
        com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
        com.garmin.android.apps.connectmobile.i2.a.b(com.garmin.android.apps.connectmobile.a2.DEVICE_SETUP, "DeviceSetupDelegate", "redirectToLaunchpadItem() - Redirecting to screen = [" + intent + "]");
        Intent intent2 = new Intent(context, (Class<?>) DashboardActivity.class);
        intent2.addFlags(268468224);
        intent.putExtras(bundle);
        z6.h0 h0VarE = z6.h0.e(context);
        h0VarE.a(intent2);
        h0VarE.a(intent);
        h0VarE.g();
    }

    @Override // x80.b
    public final boolean g() {
        GarminConnectMobileApp.f28685g.getClass();
        return GarminConnectMobileApp.a.b().f28691c;
    }

    @Override // x80.b
    public final LinkedHashMap h(String str, boolean z14) {
        kl1.c.f105264a.getClass();
        return kl1.c.a(str, z14);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // x80.b
    public final Object i(String str, v13.c cVar) {
        s1 s1Var;
        if (cVar instanceof s1) {
            s1Var = (s1) cVar;
            int i14 = s1Var.f104358c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                s1Var.f104358c = i14 - Integer.MIN_VALUE;
            } else {
                s1Var = new s1(this, cVar);
            }
        } else {
            s1Var = new s1(this, cVar);
        }
        Object objB = s1Var.f104356a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = s1Var.f104358c;
        if (i15 == 0) {
            o13.r.b(objB);
            ui1.o0.f171346d.getClass();
            ui1.o0 o0VarA = ui1.o0.a.a();
            s1Var.f104358c = 1;
            objB = o0VarA.b(str, s1Var);
            if (objB == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objB);
        }
        com.garmin.android.apps.connectmobile.v2 v2Var = (com.garmin.android.apps.connectmobile.v2) objB;
        if (v2Var instanceof com.garmin.android.apps.connectmobile.v2.b) {
            return j90.i.a.f97823a;
        }
        if (v2Var instanceof com.garmin.android.apps.connectmobile.v2.a) {
            Integer num = ((com.garmin.android.apps.connectmobile.v2.a) v2Var).f47384b;
            return (num != null && num.intValue() == 6) ? j90.i.c.f97825a : new j90.i.b(false);
        }
        lc.u0.r();
        return null;
    }

    @Override // x80.b
    public final void j(long j8, long j14) {
        ((vi1.a) KoinJavaComponent.get$default(vi1.a.class, null, null, 6, null)).a().f(String.valueOf(j8), String.valueOf(j14));
    }

    /* JADX WARN: Code duplicated, block: B:34:0x007a  */
    /* JADX WARN: Code duplicated, block: B:42:0x008f  */
    /* JADX WARN: Code duplicated, block: B:43:0x0091  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // x80.b
    public final Object k(long j8, v13.c cVar) {
        u1 u1Var;
        InitialSetupResponseStatus initialSetupResponseStatus;
        b bVar;
        GDIDeviceStatus.CapabilitiesResponse capabilities;
        int i14;
        if (cVar instanceof u1) {
            u1Var = (u1) cVar;
            int i15 = u1Var.f104383c;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                u1Var.f104383c = i15 - Integer.MIN_VALUE;
            } else {
                u1Var = new u1(this, cVar);
            }
        } else {
            u1Var = new u1(this, cVar);
        }
        Object objSendDeviceSetupStatusRequest = u1Var.f104381a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i16 = u1Var.f104383c;
        boolean z14 = false;
        if (i16 == 0) {
            o13.r.b(objSendDeviceSetupStatusRequest);
            rd2.f.a().f152045a.getClass();
            initialSetupResponseStatus = null;
            sd2.f fVarI = rd2.j.i(j8, null);
            DeviceMigrationProtobufHandler deviceMigrationProtobufHandler = (DeviceMigrationProtobufHandler) da2.d.b().getCapability(fVarI != null ? fVarI.d0() : null, DeviceMigrationProtobufHandler.class);
            if (deviceMigrationProtobufHandler == null || (capabilities = deviceMigrationProtobufHandler.getCapabilities()) == null) {
                bVar = b.MISSING_CAPABILITY;
            } else {
                bVar = capabilities.getInitialSetupStatusSupport() ? b.IS_SUPPORTED : b.NOT_SUPPORTED;
            }
            int i17 = c.f104312d[bVar.ordinal()];
            if (i17 != 1) {
                if (i17 != 2) {
                    if (i17 != 3) {
                        lc.u0.r();
                        return null;
                    }
                    z14 = true;
                }
            } else if (deviceMigrationProtobufHandler != null) {
                u1Var.f104383c = 1;
                objSendDeviceSetupStatusRequest = deviceMigrationProtobufHandler.sendDeviceSetupStatusRequest(u1Var);
                if (objSendDeviceSetupStatusRequest == aVar) {
                    return aVar;
                }
            } else {
                if (initialSetupResponseStatus == null) {
                    i14 = -1;
                } else {
                    i14 = c.f104311c[initialSetupResponseStatus.ordinal()];
                }
                if (i14 == 1) {
                    z14 = true;
                }
            }
            return Boolean.valueOf(z14);
        }
        if (i16 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(objSendDeviceSetupStatusRequest);
        initialSetupResponseStatus = (InitialSetupResponseStatus) objSendDeviceSetupStatusRequest;
        if (initialSetupResponseStatus == null) {
            i14 = -1;
        } else {
            i14 = c.f104311c[initialSetupResponseStatus.ordinal()];
        }
        if (i14 == 1) {
            z14 = true;
        }
        return Boolean.valueOf(z14);
    }

    /* JADX WARN: Code duplicated, block: B:54:0x0178  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0114, code lost:
    
        if (r2 == r3) goto L50;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // x80.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(long j8, String str, v13.c cVar) {
        t1 t1Var;
        q1 q1Var;
        ui1.o0 o0VarA;
        String str2;
        Object objA;
        long j14;
        long j15 = j8;
        if (cVar instanceof t1) {
            t1Var = (t1) cVar;
            int i14 = t1Var.f104371f;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                t1Var.f104371f = i14 - Integer.MIN_VALUE;
                q1Var = this;
            } else {
                q1Var = this;
                t1Var = new t1(q1Var, cVar);
            }
        } else {
            q1Var = this;
            t1Var = new t1(q1Var, cVar);
        }
        t1 t1Var2 = t1Var;
        Object objF = t1Var2.f104369d;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = t1Var2.f104371f;
        if (i15 == 0) {
            o13.r.b(objF);
            ui1.o0.f171346d.getClass();
            o0VarA = ui1.o0.a.a();
            Long l14 = new Long(j15);
            t1Var2.f104367b = str;
            t1Var2.f104368c = o0VarA;
            t1Var2.f104366a = j15;
            t1Var2.f104371f = 1;
            objF = o0VarA.f(l14, t1Var2);
            if (objF != aVar) {
                str2 = str;
            }
            return aVar;
        }
        if (i15 != 1) {
            if (i15 == 2) {
                o13.r.b(objF);
                List list = (List) objF;
                com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.DEVICE_SETUP;
                String strF = v.e0.f(list.size(), "initializeLteTransferState: ", " candidate transfer device(s) found");
                com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
                com.garmin.android.apps.connectmobile.i2.a.b(a2Var, "DeviceSetupDelegate", strF);
                return list.isEmpty() ? j90.h.a.f97818a : new j90.h.b(list);
            }
            if (i15 != 3) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j14 = t1Var2.f104366a;
            o13.r.b(objF);
            objA = ((o13.q) objF).f128597a;
            if (o13.q.b(objA) != null) {
                com.garmin.android.apps.connectmobile.a2 a2Var2 = com.garmin.android.apps.connectmobile.a2.BIC;
                com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
                com.garmin.android.apps.connectmobile.i2.a.f(a2Var2, "SetupWizardRepo", "Error occurred while updating LTE onboarding item");
            }
            com.garmin.android.apps.connectmobile.a2 a2Var3 = com.garmin.android.apps.connectmobile.a2.DEVICE_SETUP;
            String strF2 = androidx.room.a0.f(j14, "initializeLteTransferState: transfer to ", " complete, cleaned prefs");
            com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
            com.garmin.android.apps.connectmobile.i2.a.b(a2Var3, "DeviceSetupDelegate", strF2);
            return j90.h.c.f97820a;
        }
        j15 = t1Var2.f104366a;
        o0VarA = t1Var2.f104368c;
        str2 = t1Var2.f104367b;
        o13.r.b(objF);
        com.garmin.android.apps.connectmobile.v2 v2Var = (com.garmin.android.apps.connectmobile.v2) objF;
        if (!(v2Var instanceof com.garmin.android.apps.connectmobile.v2.b)) {
            com.garmin.android.apps.connectmobile.a2 a2Var4 = com.garmin.android.apps.connectmobile.a2.DEVICE_SETUP;
            String strE = org.apache.commons.lang3.e.e(j15, "initializeLteTransferState: failed to fetch subscriptions for device ");
            com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
            com.garmin.android.apps.connectmobile.i2.a.b(a2Var4, "DeviceSetupDelegate", strE);
            return j90.h.a.f97818a;
        }
        ui1.z0 z0VarA = ui1.y0.a((ui1.x0) ((com.garmin.android.apps.connectmobile.v2.b) v2Var).f47386a);
        vi1.c cVarA = ((vi1.a) KoinJavaComponent.get$default(vi1.a.class, null, null, 6, null)).a();
        LinkedHashMap linkedHashMapH = cVarA.h();
        if (z0VarA == null) {
            if (linkedHashMapH.keySet().contains(new Long(j15))) {
                com.garmin.android.apps.connectmobile.a2 a2Var5 = com.garmin.android.apps.connectmobile.a2.DEVICE_SETUP;
                String strF3 = androidx.room.a0.f(j15, "initializeLteTransferState: previous transfer to ", " timed out");
                com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
                com.garmin.android.apps.connectmobile.i2.a.b(a2Var5, "DeviceSetupDelegate", strF3);
                return j90.h.e.f97822a;
            }
            if (linkedHashMapH.values().contains(new Long(j15))) {
                com.garmin.android.apps.connectmobile.a2 a2Var6 = com.garmin.android.apps.connectmobile.a2.DEVICE_SETUP;
                String strF4 = androidx.room.a0.f(j15, "initializeLteTransferState: device ", " is a source in another transfer, no action");
                com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
                com.garmin.android.apps.connectmobile.i2.a.b(a2Var6, "DeviceSetupDelegate", strF4);
                return j90.h.a.f97818a;
            }
            List listB1 = p13.h0.b1(linkedHashMapH.values());
            t1Var2.f104367b = null;
            t1Var2.f104368c = null;
            t1Var2.f104366a = j15;
            t1Var2.f104371f = 2;
            objF = q1Var.t(j15, str2, o0VarA, listB1, t1Var2);
        } else {
            if (!linkedHashMapH.keySet().contains(new Long(j15))) {
                long j16 = j15;
                if (linkedHashMapH.values().contains(new Long(j16))) {
                    com.garmin.android.apps.connectmobile.a2 a2Var7 = com.garmin.android.apps.connectmobile.a2.DEVICE_SETUP;
                    String strF5 = androidx.room.a0.f(j16, "initializeLteTransferState: device ", " is old device, transfer still in progress");
                    com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
                    com.garmin.android.apps.connectmobile.i2.a.b(a2Var7, "DeviceSetupDelegate", strF5);
                    return j90.h.d.f97821a;
                }
                com.garmin.android.apps.connectmobile.a2 a2Var8 = com.garmin.android.apps.connectmobile.a2.DEVICE_SETUP;
                String strF6 = androidx.room.a0.f(j16, "initializeLteTransferState: device ", " already has active subscription, no transfer needed");
                com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
                com.garmin.android.apps.connectmobile.i2.a.b(a2Var8, "DeviceSetupDelegate", strF6);
                return j90.h.a.f97818a;
            }
            cVarA.q(String.valueOf(j15));
            i31.e0 e0Var = (i31.e0) KoinJavaComponent.get$default(i31.e0.class, null, null, 6, null);
            d31.d dVar = d31.d.LTE_GENERIC;
            d31.c cVar2 = d31.c.COMPLETED;
            t1Var2.f104367b = null;
            t1Var2.f104368c = null;
            t1Var2.f104366a = j15;
            t1Var2.f104371f = 3;
            long j17 = j15;
            objA = e0Var.a(j17, dVar, cVar2, t1Var2);
            if (objA != aVar) {
                j14 = j17;
                if (o13.q.b(objA) != null) {
                    com.garmin.android.apps.connectmobile.a2 a2Var9 = com.garmin.android.apps.connectmobile.a2.BIC;
                    com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
                    com.garmin.android.apps.connectmobile.i2.a.f(a2Var9, "SetupWizardRepo", "Error occurred while updating LTE onboarding item");
                }
                com.garmin.android.apps.connectmobile.a2 a2Var10 = com.garmin.android.apps.connectmobile.a2.DEVICE_SETUP;
                String strF7 = androidx.room.a0.f(j14, "initializeLteTransferState: transfer to ", " complete, cleaned prefs");
                com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
                com.garmin.android.apps.connectmobile.i2.a.b(a2Var10, "DeviceSetupDelegate", strF7);
                return j90.h.c.f97820a;
            }
        }
        return aVar;
    }

    @Override // x80.b
    public final boolean m() {
        return com.garmin.android.apps.connectmobile.k1.f37122a.r();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // x80.b
    public final Object n(long j8, v13.c cVar) {
        v1 v1Var;
        if (cVar instanceof v1) {
            v1Var = (v1) cVar;
            int i14 = v1Var.f104394d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                v1Var.f104394d = i14 - Integer.MIN_VALUE;
            } else {
                v1Var = new v1(this, cVar);
            }
        } else {
            v1Var = new v1(this, cVar);
        }
        Object objF = v1Var.f104392b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = v1Var.f104394d;
        if (i15 == 0) {
            o13.r.b(objF);
            ui1.o0.f171346d.getClass();
            ui1.o0 o0VarA = ui1.o0.a.a();
            Long l14 = new Long(j8);
            v1Var.f104391a = j8;
            v1Var.f104394d = 1;
            objF = o0VarA.f(l14, v1Var);
            if (objF == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j8 = v1Var.f104391a;
            o13.r.b(objF);
        }
        com.garmin.android.apps.connectmobile.v2 v2Var = (com.garmin.android.apps.connectmobile.v2) objF;
        if (v2Var instanceof com.garmin.android.apps.connectmobile.v2.b) {
            T t7 = ((com.garmin.android.apps.connectmobile.v2.b) v2Var).f47386a;
            if (!((Collection) t7).isEmpty()) {
                ui1.z0 z0VarA = ui1.y0.a((ui1.x0) t7);
                if (z0VarA == null) {
                    com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.DEVICE_SETUP;
                    String strE = org.apache.commons.lang3.e.e(j8, "notifyDeviceOfLteTransfer: no active subscription found for device ");
                    com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
                    com.garmin.android.apps.connectmobile.i2.a.f(a2Var, "DeviceSetupDelegate", strE);
                    return Unit.INSTANCE;
                }
                GDILTEProto.LTEService.Builder lteSubscriptionInfoNotification = GDILTEProto.LTEService.newBuilder().setLteSubscriptionInfoNotification(GDILTEProto.LTESubscriptionInfoNotification.newBuilder().setInfo(ui1.y0.c(z0VarA, j8)));
                GDISmartProto.Smart.Builder builderNewBuilder = GDISmartProto.Smart.newBuilder();
                builderNewBuilder.getClass();
                lteSubscriptionInfoNotification.getClass();
                builderNewBuilder.setExtension(GDILTEExtension.lteService, lteSubscriptionInfoNotification.build());
                GDISmartProto.Smart smartBuild = builderNewBuilder.build();
                ProtobufRequestManager protobufRequestManager = ProtobufRequestManager.getInstance();
                smartBuild.getClass();
                protobufRequestManager.initiateNotification(smartBuild, j8);
            }
        }
        return Unit.INSTANCE;
    }

    @Override // x80.b
    public final void o(DeviceSetupActivity deviceSetupActivity) {
        deviceSetupActivity.getClass();
        Intent intent = new Intent(deviceSetupActivity, (Class<?>) GarminAppGateway.class);
        intent.addFlags(603979776);
        deviceSetupActivity.startActivity(intent);
    }

    @Override // x80.b
    public final void p(long j8, String str) {
        str.getClass();
        if (!km2.a.e(new int[]{SupportedCapability.REALTIME_SETTINGS.ordinal()}, j8)) {
            com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.DEVICE_SETUP;
            com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
            com.garmin.android.apps.connectmobile.i2.a.a(a2Var, "initializeRealTimeDeviceSettings: This is not a realtime settings device, ignoring");
        } else {
            com.garmin.android.apps.connectmobile.a2 a2Var2 = com.garmin.android.apps.connectmobile.a2.DEVICE_SETUP;
            com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
            com.garmin.android.apps.connectmobile.i2.a.a(a2Var2, "initializeRealTimeDeviceSettings: This is a realtime settings device, initialize...");
            com.garmin.realtimesettings.app.initialization.b.e(com.garmin.realtimesettings.app.initialization.b.f52589a, this.f104303a, str, new fx2.a(j8, GCMSettingManager.k().b(), d53.w.l0(GCMSettingManager.k().e(), IOUtils.DIR_SEPARATOR_UNIX)), c22.b0.b(null));
            com.garmin.android.apps.connectmobile.i2.a.a(a2Var2, v.h.u(j8, "initializeRealTimeDeviceSettings: Starting realtime settings work request with unitId ", " and macAddress ", str));
        }
    }

    @Override // x80.b
    public final void q(long j8, yl2.b bVar) {
        Object next;
        bVar.getClass();
        ap0.a.f11648c.getClass();
        w13.c cVar = ap0.a.f11650e;
        p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
        do {
            if (!bVarN.hasNext()) {
                next = null;
                break;
            }
            next = bVarN.next();
        } while (((ap0.a) next).f11651a != bVar);
        if (((ap0.a) next) != null) {
            ((n31.a) KoinJavaComponent.get$default(n31.a.class, null, null, 6, null)).a(j8);
        }
    }

    @Override // x80.b
    public final void r(String str) {
        str.getClass();
        ((vi1.a) KoinJavaComponent.get$default(vi1.a.class, null, null, 6, null)).a().q(str);
    }

    @Override // x80.b
    public final void s(Activity activity, l90.i iVar, l90.b bVar) {
        activity.getClass();
        iVar.getClass();
        bVar.getClass();
        String str = bVar.f111521f;
        String str2 = bVar.f111522g;
        int i14 = c.f104309a[iVar.ordinal()];
        if (i14 == 1) {
            com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.DEVICE_SETUP;
            String strJ = androidx.room.a0.j("redirectToExternalDeviceSetup: Redirecting to legacy device setup for device ", str, " with product number ", str2);
            com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
            com.garmin.android.apps.connectmobile.i2.a.a(a2Var, strJ);
            com.garmin.android.apps.connectmobile.devices.model.l lVarU = u(bVar);
            Map<zb0.u0, vg1.t> map = zb0.n0.f203577a;
            if ((!Arrays.asList(lVarU.getDeviceCategories()).contains(bm2.b.WELLNESS.name()) || zb0.u0.r(str2)) && !zb0.u0.n(str2, zb0.u0.E5)) {
                Intent intent = new Intent(activity, (Class<?>) BLEScanningActivity.class);
                intent.putExtra("extra_device_dto", lVarU);
                activity.startActivityForResult(intent, 12345);
                return;
            }
            TellUsMoreActivity.f30729i.getClass();
            if (z10.d1.f()) {
                z10.d1.o(activity, new xk1.v(12));
                return;
            }
            Intent intent2 = new Intent(activity, (Class<?>) TellUsMoreActivity.class);
            com.airbnb.lottie.animation.keyframe.a.q(com.garmin.android.apps.connectmobile.l2.f37135b, intent2, h7.c.a(new o13.p("extra_device_dto", lVarU)));
            activity.startActivityForResult(intent2, 12345);
            return;
        }
        if (i14 == 2) {
            com.garmin.android.apps.connectmobile.a2 a2Var2 = com.garmin.android.apps.connectmobile.a2.DEVICE_SETUP;
            String strJ2 = androidx.room.a0.j("redirectToExternalDeviceSetup: Redirecting to legacy device wizard setup for device ", str, " with product number ", str2);
            com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
            com.garmin.android.apps.connectmobile.i2.a.a(a2Var2, strJ2);
            PersonalInfoWizardActivity.a aVar = PersonalInfoWizardActivity.f34487g;
            Parcelable parcelableU = u(bVar);
            aVar.getClass();
            if (z10.d1.f()) {
                z10.d1.o(activity, new xk1.v(12));
                return;
            }
            Intent intent3 = new Intent(activity, (Class<?>) PersonalInfoWizardActivity.class);
            intent3.putExtra("GCM_deviceDTO", parcelableU);
            activity.startActivityForResult(intent3, 12345);
            return;
        }
        if (i14 != 3) {
            if (i14 != 4) {
                lc.u0.r();
                return;
            }
            com.garmin.android.apps.connectmobile.a2 a2Var3 = com.garmin.android.apps.connectmobile.a2.DEVICE_SETUP;
            com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
            com.garmin.android.apps.connectmobile.i2.a.a(a2Var3, "redirectToApp: Redirecting to Dive app");
            new en.j(activity, bVar.f111522g, bVar.f111521f, null, ve2.f.b(this.f104304b.h())).execute();
            return;
        }
        com.garmin.android.apps.connectmobile.a2 a2Var4 = com.garmin.android.apps.connectmobile.a2.DEVICE_SETUP;
        com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
        com.garmin.android.apps.connectmobile.i2.a.a(a2Var4, "redirectToApp: Redirecting to Golf app");
        String str3 = bVar.f111523h;
        if (str3 == null) {
            str3 = "";
        }
        new nl0.b(activity, false, "golf.app.pairing.screen", str2, str, str3).a().execute();
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0090 A[LOOP:0: B:31:0x008a->B:33:0x0090, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:37:0x00af A[LOOP:1: B:35:0x00a9->B:37:0x00af, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable t(long j8, String str, ui1.o0 o0Var, List list, v13.c cVar) {
        r1 r1Var;
        List list2;
        LinkedHashMap linkedHashMapN;
        Iterator it;
        ArrayList arrayList;
        if (cVar instanceof r1) {
            r1Var = (r1) cVar;
            int i14 = r1Var.f104330g;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                r1Var.f104330g = i14 - Integer.MIN_VALUE;
            } else {
                r1Var = new r1(this, cVar);
            }
        } else {
            r1Var = new r1(this, cVar);
        }
        Object objD = r1Var.f104328e;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = r1Var.f104330g;
        if (i15 == 0) {
            o13.r.b(objD);
            Long l14 = new Long(j8);
            r1Var.f104325b = str;
            r1Var.f104326c = o0Var;
            r1Var.f104327d = list;
            r1Var.f104324a = j8;
            r1Var.f104330g = 1;
            objD = o0Var.d(l14, r1Var);
            if (objD != aVar) {
            }
            return aVar;
        }
        if (i15 == 1) {
            j8 = r1Var.f104324a;
            list = r1Var.f104327d;
            o0Var = r1Var.f104326c;
            str = r1Var.f104325b;
            o13.r.b(objD);
        } else {
            if (i15 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            list2 = r1Var.f104327d;
            o13.r.b(objD);
        }
        linkedHashMapN = p13.u0.n((Map) objD);
        it = list2.iterator();
        while (it.hasNext()) {
            linkedHashMapN.remove(it.next());
        }
        arrayList = new ArrayList(linkedHashMapN.size());
        for (Map.Entry entry : linkedHashMapN.entrySet()) {
            Object key = entry.getKey();
            String str2 = (String) entry.getValue();
            key.getClass();
            arrayList.add(new j90.g(((Long) key).longValue(), str2, null));
        }
        return arrayList;
        com.garmin.android.apps.connectmobile.v2 v2Var = (com.garmin.android.apps.connectmobile.v2) objD;
        if (!(v2Var instanceof com.garmin.android.apps.connectmobile.v2.b)) {
            if (v2Var instanceof com.garmin.android.apps.connectmobile.v2.a) {
                return p13.j0.f134944a;
            }
            lc.u0.r();
            return null;
        }
        List list3 = (List) ((com.garmin.android.apps.connectmobile.v2.b) v2Var).f47386a;
        if (list3.isEmpty()) {
            return p13.j0.f134944a;
        }
        r1Var.f104325b = null;
        r1Var.f104326c = null;
        r1Var.f104327d = list;
        r1Var.f104324a = j8;
        r1Var.f104330g = 2;
        objD = o0Var.c(str, list3, r1Var);
        if (objD != aVar) {
            list2 = list;
            linkedHashMapN = p13.u0.n((Map) objD);
            it = list2.iterator();
            while (it.hasNext()) {
                linkedHashMapN.remove(it.next());
            }
            arrayList = new ArrayList(linkedHashMapN.size());
            while (r8.hasNext()) {
                Object key2 = entry.getKey();
                String str3 = (String) entry.getValue();
                key2.getClass();
                arrayList.add(new j90.g(((Long) key2).longValue(), str3, null));
            }
            return arrayList;
        }
        return aVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object v(ui1.g0 g0Var, ui1.o0 o0Var, v13.c cVar) {
        w1 w1Var;
        if (cVar instanceof w1) {
            w1Var = (w1) cVar;
            int i14 = w1Var.f104410e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                w1Var.f104410e = i14 - Integer.MIN_VALUE;
            } else {
                w1Var = new w1(this, cVar);
            }
        } else {
            w1Var = new w1(this, cVar);
        }
        Object objJ = w1Var.f104408c;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = w1Var.f104410e;
        if (i15 == 0) {
            o13.r.b(objJ);
            w1Var.f104406a = g0Var;
            w1Var.f104407b = o0Var;
            w1Var.f104410e = 1;
            o0Var.getClass();
            objJ = com.garmin.android.apps.connectmobile.f0.J(o0Var, new ui1.w0(o0Var, g0Var, null), w1Var);
            if (objJ != obj) {
            }
        }
        if (i15 != 1) {
            if (i15 == 2) {
                o13.r.b(objJ);
                return objJ;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o0Var = w1Var.f104407b;
        g0Var = w1Var.f104406a;
        o13.r.b(objJ);
        com.garmin.android.apps.connectmobile.v2 v2Var = (com.garmin.android.apps.connectmobile.v2) objJ;
        if (!(v2Var instanceof com.garmin.android.apps.connectmobile.v2.b)) {
            if (!(v2Var instanceof com.garmin.android.apps.connectmobile.v2.a)) {
                lc.u0.r();
                return null;
            }
            Integer num = ((com.garmin.android.apps.connectmobile.v2.a) v2Var).f47384b;
            boolean z14 = (num != null ? num.intValue() : 0) >= 500;
            com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
            com.garmin.android.apps.connectmobile.i2.a.f(com.garmin.android.apps.connectmobile.a2.DEVICE_SETUP, "DeviceSetupDelegate", "requestLteSubscriptionTransfer: error " + num + ", canRetry=" + z14);
            return new j90.j.a(z14);
        }
        com.garmin.android.apps.connectmobile.v2.b bVar = (com.garmin.android.apps.connectmobile.v2.b) v2Var;
        int i16 = bVar.f47387b;
        if (i16 == 200) {
            g0Var.c();
            w1Var.f104406a = null;
            w1Var.f104407b = null;
            w1Var.f104410e = 2;
            Object objV = v(g0Var, o0Var, w1Var);
            return objV == obj ? obj : objV;
        }
        if (i16 != 202) {
            com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.DEVICE_SETUP;
            String strH = am.j.h(i16, "requestLteSubscriptionTransfer: unexpected response code ");
            com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
            com.garmin.android.apps.connectmobile.i2.a.f(a2Var, "DeviceSetupDelegate", strH);
            return new j90.j.a(false);
        }
        ui1.h0 h0Var = (ui1.h0) new Gson().fromJson((String) bVar.f47386a, ui1.h0.class);
        String jobId = h0Var != null ? h0Var.getJobId() : null;
        if (jobId != null) {
            return new j90.j.b(jobId);
        }
        com.garmin.android.apps.connectmobile.a2 a2Var2 = com.garmin.android.apps.connectmobile.a2.DEVICE_SETUP;
        com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
        com.garmin.android.apps.connectmobile.i2.a.f(a2Var2, "DeviceSetupDelegate", "requestLteSubscriptionTransfer: missing jobId in 202 response");
        return new j90.j.a(false);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkd0/q1$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
