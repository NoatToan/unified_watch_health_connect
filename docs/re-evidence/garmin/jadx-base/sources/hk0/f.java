package hk0;

import android.app.Notification;
import android.app.PendingIntent;
import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.text.TextUtils;
import au0.z;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.ActionConst;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.devices.setup.CustomerGUIDMismatchActivity;
import com.garmin.android.apps.connectmobile.gfdi.protobuf.CalendarPermissionHandler;
import com.garmin.android.apps.connectmobile.gfdi.protobuf.DeviceMigrationProtobufHandler;
import com.garmin.android.apps.connectmobile.gfdi.protobuf.DeviceStatusDataHandler;
import com.garmin.android.apps.connectmobile.gfdi.protobuf.LimitedUiProtobufDataHandler;
import com.garmin.android.apps.connectmobile.gfdi.protobuf.ProtobufLogger;
import com.garmin.android.apps.connectmobile.gfdi.protobuf.ProtobufRequestManager;
import com.garmin.android.apps.connectmobile.gfdi.protobuf.VoiceAssistantProtobufRequestHandler;
import com.garmin.android.gfdi.DefaultAuthDelegate;
import com.garmin.android.gfdi.configuration.SupportedCapability;
import com.garmin.android.gfdi.framework.compat.GenericSendMessageManager;
import com.garmin.android.gncs.GncsGdiHelper;
import com.garmin.device.datatypes.DeviceProfile;
import com.garmin.proto.generated.GDICore;
import com.garmin.proto.generated.GDICredentials;
import de2.b0;
import g2.m1;
import iw2.i1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import ok2.a0;
import org.koin.java.KoinJavaComponent;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p13.h0;
import p13.w;
import p13.x;
import p13.y;
import rs2.t;
import yc.l2;
import zb0.u0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\tB\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lhk0/f;", "Lbt2/c;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "Lcom/garmin/android/gfdi/configuration/SupportedCapability;", "capabilities", "<init>", "(Landroid/content/Context;Ljava/util/Set;)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f implements bt2.c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f84062g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set<SupportedCapability> f84063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f84064b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Logger f84065c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final s10.b f84066d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final s10.a f84067e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ik0.a f84068f;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f84069a;

        static {
            int[] iArr = new int[du2.g.b.values().length];
            try {
                iArr[du2.g.b.PERMISSION_NOT_GRANTED_ACCESS_BACKGROUND_LOCATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[du2.g.b.PERMISSION_NOT_GRANTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[du2.g.b.NOT_ENABLED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f84069a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"hk0/f$c", "Lwt2/l$a;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c implements wt2.l.a {
        @Override // xc2.a
        public final ve2.e a() {
            return ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).h();
        }

        @Override // xc2.b
        public final Object c(t13.d<? super String> dVar) {
            return ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).e();
        }

        @Override // wt2.l.a
        public final boolean d(Context context) {
            Object systemService = context.getApplicationContext().getSystemService("connectivity");
            systemService.getClass();
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo();
            return activeNetworkInfo != null && activeNetworkInfo.isAvailable() && activeNetworkInfo.isConnected();
        }

        @Override // xc2.b
        public final Object e(t13.d<? super String> dVar) {
            return ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).g();
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"hk0/f$d", "Ldu2/g$c;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d implements du2.g.c {
        @Override // xc2.a
        public final ve2.e a() {
            return ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).h();
        }

        @Override // xc2.b
        public final Object c(t13.d<? super String> dVar) {
            return ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).s((v13.c) dVar);
        }

        @Override // xc2.b
        public final Object e(t13.d<? super String> dVar) {
            return ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).j((v13.c) dVar);
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f(Context context, Set<? extends SupportedCapability> set) {
        context.getClass();
        set.getClass();
        this.f84063a = set;
        this.f84064b = context.getApplicationContext();
        int i14 = gt2.c.f79010a;
        this.f84065c = gt2.b.f79005a.h("GCMHostConfiguration");
        this.f84066d = new s10.b();
        this.f84067e = new s10.a();
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        this.f84068f = new ik0.a(applicationContext);
    }

    public static void l(f fVar, rs2.c cVar, String str) {
        fVar.k(cVar, str, null, false);
    }

    @Override // rs2.u
    public final Set<Integer> a(rs2.c cVar) {
        cVar.getClass();
        Set<SupportedCapability> set = this.f84063a;
        ArrayList arrayList = new ArrayList(y.r(set, 10));
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((SupportedCapability) it.next()).ordinal()));
        }
        return h0.g1(arrayList);
    }

    @Override // rs2.u
    public final void b(rs2.c cVar, GDICore.FeatureCapabilitiesResponse.GuidStatus guidStatus, t tVar) {
        cVar.getClass();
        ik0.a aVar = this.f84068f;
        Logger logger = aVar.f93899b;
        Logger logger2 = aVar.f93899b;
        Context context = aVar.f93898a;
        ik0.b bVar = aVar.f93900c;
        Object objValueOf = bVar != null ? Integer.valueOf(bVar.hashCode()) : ActionConst.NULL;
        String strName = guidStatus.name();
        String f172496d = cVar.getF92742f();
        long f172494b = cVar.getF92746j();
        StringBuilder sbI = p6.b.i("customer GUID mismatch -> status ", strName, ", ", f172496d, ", unitId ");
        sbI.append(f172494b);
        sbI.append(", listener ");
        sbI.append(objValueOf);
        logger.warn(sbI.toString());
        ik0.b bVar2 = aVar.f93900c;
        boolean zA = bVar2 != null ? bVar2.a(cVar, guidStatus, tVar) : false;
        wr.g.y("handledByListener ", zA, logger);
        if (zA) {
            return;
        }
        if (guidStatus == GDICore.FeatureCapabilitiesResponse.GuidStatus.UNSET) {
            long f172494b2 = cVar.getF92746j();
            logger2.debug("overridingCustomerGUID");
            ((l80.a) KoinJavaComponent.get$default(l80.a.class, null, null, 6, null)).w(f172494b2, tVar);
            return;
        }
        if (!cVar.getConfigurationFlags().contains(89)) {
            logger.debug("ignore mismatch for non-samd device");
            long f172494b3 = cVar.getF92746j();
            logger2.debug("overridingCustomerGUID");
            ((l80.a) KoinJavaComponent.get$default(l80.a.class, null, null, 6, null)).w(f172494b3, tVar);
            return;
        }
        logger.debug("handledByNotification");
        CustomerGUIDMismatchActivity.a aVar2 = CustomerGUIDMismatchActivity.f34437b;
        long f172494b4 = cVar.getF92746j();
        String f172496d2 = cVar.getF92742f();
        aVar2.getClass();
        Intent intentA = CustomerGUIDMismatchActivity.a.a(context, f172494b4, f172496d2, "ACTION_PAIR");
        intentA.setFlags(1082130432);
        Intent intentA2 = CustomerGUIDMismatchActivity.a.a(context, cVar.getF92746j(), cVar.getF92742f(), "ACTION_REMOVE");
        intentA2.setFlags(1082130432);
        PendingIntent activity = PendingIntent.getActivity(context, 1, intentA, 1275068416);
        PendingIntent activity2 = PendingIntent.getActivity(context, 2, intentA2, 1275068416);
        String string = context.getString(R.string.msg_previously_paired_device, cVar.getF92742f());
        string.getClass();
        sz0.e eVar = sz0.e.f161377p;
        z6.q qVar = new z6.q(context, eVar.f161386a);
        qVar.N.icon = 2131232010;
        qVar.f202683e = z6.q.e(context.getString(R.string.lbl_previously_paired_device));
        qVar.f202684f = z6.q.e(string);
        qVar.f202689k = z6.q.e("");
        qVar.f202691m = 0;
        z6.o oVar = new z6.o();
        oVar.f202664e = z6.q.e(string);
        qVar.l(oVar);
        qVar.a(2131232459, context.getString(R.string.lbl_connect_device), activity);
        qVar.a(2131232593, context.getString(R.string.common_disconnect), activity2);
        qVar.i(16, true);
        Notification notificationC = qVar.c();
        notificationC.getClass();
        sz0.f.f161394a.getClass();
        sz0.f.a.f(context, notificationC, 37, eVar);
    }

    @Override // rs2.u
    public final byte[] c() {
        String str;
        ve2.d dVarK = ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).k();
        if (dVarK == null || (str = dVarK.f177691b) == null) {
            return null;
        }
        byte[] bytes = str.getBytes(d53.c.f57666b);
        bytes.getClass();
        return bytes;
    }

    @Override // bt2.c
    public final boolean d(rs2.c cVar) {
        cVar.getClass();
        return wd2.m.e(cVar.getF92746j());
    }

    @Override // rs2.u
    public final /* bridge */ String e() {
        return null;
    }

    @Override // rs2.u
    public final List<rs2.h> f(rs2.c cVar) {
        cVar.getClass();
        et2.a aVar = new et2.a();
        Context context = this.f84064b;
        context.getClass();
        ArrayList arrayListM = x.m(new GenericSendMessageManager(context), aVar);
        il2.g.f94050g.a();
        ArrayList arrayList = new ArrayList();
        if (!oi0.c.O(cVar)) {
            ch.qos.logback.classic.Logger logger = wb2.r.f184099d;
            com.garmin.gfdi.file.a aVar2 = new com.garmin.gfdi.file.a();
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(aVar2);
            vs2.i iVar = new vs2.i();
            wb2.r rVarF = wb2.r.f();
            rVarF.getClass();
            iVar.f179955f.set(rVarF);
            arrayList2.add(iVar);
            arrayList.addAll(arrayList2);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayListM.add((rs2.h) it.next());
        }
        ik0.e eVar = new ik0.e();
        du2.g.a aVar3 = du2.g.f61293g;
        d dVar = new d();
        m1 m1Var = new m1(20, eVar, this);
        du2.f fVar = new du2.f(aVar3);
        aVar3.getClass();
        arrayListM.add(new du2.a(new du2.g(context, dVar, fVar, m1Var), null, 2, null));
        c cVar2 = new c();
        int i14 = wt2.l.f187218a;
        arrayListM.add(new wt2.a(context, cVar2, cVar));
        arrayListM.add(new ia2.a(new h(this), null, 2, null));
        arrayListM.add(new ka2.a(new k(this), null, 2, null));
        arrayListM.add(new b0(new j(this), new i(cVar, this), null, 4, null));
        arrayListM.add(new ha2.a(new g(this), context, null, 4, null));
        arrayListM.add(new ga2.a());
        Collection<rs2.h> collectionCreateHandlers = GncsGdiHelper.createHandlers(cVar, context);
        collectionCreateHandlers.getClass();
        arrayListM.addAll(collectionCreateHandlers);
        return arrayListM;
    }

    @Override // rs2.u
    public final rs2.f g(String str) {
        str.getClass();
        return ProtobufLogger.INSTANCE.createLogger(str);
    }

    @Override // rs2.u
    public final int getAppVersion() {
        Context context = this.f84064b;
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            return -1;
        }
    }

    @Override // rs2.u
    public final String getFriendlyName() {
        BluetoothAdapter defaultAdapter;
        String name;
        j22.b bVar = j22.b.f96736a;
        Context context = this.f84064b;
        context.getClass();
        bVar.getClass();
        return (!j22.b.b(context) || (defaultAdapter = BluetoothAdapter.getDefaultAdapter()) == null || (name = defaultAdapter.getName()) == null) ? "" : name;
    }

    @Override // rs2.u
    public final ss2.b h(String str) {
        str.getClass();
        Context context = this.f84064b;
        context.getClass();
        return new DefaultAuthDelegate(context, str);
    }

    @Override // bt2.c
    public final boolean i(rs2.c cVar) {
        cVar.getClass();
        Context context = this.f84064b;
        context.getClass();
        return wd2.m.d(context, cVar.getF92746j());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // rs2.u
    public final List<dt2.a> j(rs2.c cVar) {
        cm2.b bVar;
        com.garmin.device.filetransfer.a aVarD;
        cVar.getClass();
        a0.a aVar = a0.f132585h;
        mk2.e eVarJ = aVar.a().getConfiguration().j();
        zj2.e eVar = new zj2.e(eVarJ != null ? eVarJ.a(cVar.getF92741e()) : null);
        Context context = this.f84064b;
        context.getClass();
        sj2.b bVar2 = new sj2.b(context, eVar, this.f84066d);
        Context context2 = this.f84064b;
        context2.getClass();
        i1 i1Var = new i1(context2);
        Context context3 = this.f84064b;
        context3.getClass();
        ak2.a aVar2 = new ak2.a(new com.garmin.android.apps.connectmobile.connectiq.requests.deeplinking.a(context3));
        bk2.b.c cVar2 = bk2.b.f18501j;
        Context context4 = this.f84064b;
        context4.getClass();
        cVar2.getClass();
        bk2.b bVarA = bk2.b.c.a(context4);
        com.garmin.android.apps.connectmobile.handalignment.a aVar3 = new com.garmin.android.apps.connectmobile.handalignment.a();
        Context context5 = this.f84064b;
        context5.getClass();
        yi2.b bVar3 = new yi2.b(context5, new CalendarPermissionHandler(), new g12.f(eVar, 27));
        ju.a aVar4 = new ju.a();
        xt2.a aVar5 = new xt2.a(null, 1, null);
        zb1.a aVar6 = new zb1.a();
        Context context6 = this.f84064b;
        context6.getClass();
        sj2.d dVar = new sj2.d(context6, this.f84067e, new tj2.a(re2.b.f152215a, w.c(GDICredentials.CredentialType.GENERIC_IT_OAUTH_2)));
        Context context7 = this.f84064b;
        context7.getClass();
        com.garmin.android.apps.connectmobile.cannedtextreply.b bVar4 = new com.garmin.android.apps.connectmobile.cannedtextreply.b(context7);
        DeviceMigrationProtobufHandler deviceMigrationProtobufHandler = new DeviceMigrationProtobufHandler();
        Context context8 = this.f84064b;
        context8.getClass();
        LimitedUiProtobufDataHandler limitedUiProtobufDataHandler = new LimitedUiProtobufDataHandler(context8);
        y92.b bVar5 = new y92.b(new h51.a(20));
        fv.a aVar7 = new fv.a();
        ov0.a aVar8 = new ov0.a();
        Context context9 = this.f84064b;
        context9.getClass();
        DeviceStatusDataHandler deviceStatusDataHandler = new DeviceStatusDataHandler(context9, (bc0.b) KoinJavaComponent.get$default(bc0.b.class, null, null, 6, null), (lc0.h) KoinJavaComponent.get$default(lc0.h.class, null, null, 6, null));
        Context context10 = this.f84064b;
        context10.getClass();
        int i14 = 5;
        ArrayList arrayListM = x.m(eVar, bVar2, aVar2, bVarA, aVar3, i1Var, bVar3, aVar4, aVar5, aVar6, dVar, bVar4, deviceMigrationProtobufHandler, limitedUiProtobufDataHandler, bVar5, aVar7, aVar8, deviceStatusDataHandler, new i90.f(context10), new i90.b());
        if (cVar.getConfigurationFlags().contains(112)) {
            arrayListM.add(new oj2.a());
        }
        px2.o oVarH = ((vf1.a) KoinJavaComponent.get$default(vf1.a.class, null, null, 6, null)).h(cVar);
        if (oVarH != null) {
            arrayListM.add(oVarH);
        }
        arrayListM.add(KoinJavaComponent.get$default(gn2.c.class, null, null, 6, null));
        cm2.b.f27972d.getClass();
        if (cVar.getF92743g()) {
            bVar = new cm2.b();
        } else {
            cm2.b.f27974f.add(cVar.getF92741e());
            bVar = null;
        }
        if (bVar != null) {
            arrayListM.add(bVar);
        }
        Context context11 = this.f84064b;
        context11.getClass();
        arrayListM.add(new hq0.b(context11));
        a0 a0VarA = aVar.a();
        synchronized (a0VarA.f132592c) {
            if (cl2.c.m(cVar)) {
                aVarD = a0VarA.g().d(cVar, a0VarA.c(cVar));
            } else {
                ok2.g gVarD = a0VarA.d(cVar.getF92741e());
                if (gVarD != null) {
                    gVarD.f132691j.getClass();
                    if (true != cl2.c.m(cVar)) {
                        gVarD.x("Sync 2 no longer supported");
                        a0VarA.f132594e.remove(cVar.getF92741e());
                    }
                }
                aVarD = null;
            }
        }
        if (aVarD != null) {
            arrayListM.add(aVarD);
        }
        arrayListM.add(new el2.a(null, 1, null == true ? 1 : 0));
        arrayListM.add(new q());
        if (l2.q(SupportedCapability.EVENT_SHARING, cVar.getConfigurationFlags())) {
            kk2.a aVar9 = new kk2.a();
            arrayListM.add(aVar9);
            us.a.b bVar6 = us.a.f172333h;
            String strValueOf = String.valueOf(cVar.getF92744h());
            bVar6.getClass();
            strValueOf.getClass();
            if (u0.n(strValueOf, u0.X5)) {
                arrayListM.add(new us.a(aVar9));
            } else {
                z zVar = (z) KoinJavaComponent.get$default(z.class, null, null, 6, null);
                zVar.getClass();
                dt2.a aVar10 = (dt2.a) new a61.d(zVar, i14).invoke(cVar, aVar9);
                if (aVar10 != null) {
                    arrayListM.add(aVar10);
                }
            }
            if (VoiceAssistantProtobufRequestHandler.INSTANCE.isVoiceAssistantSupported(String.valueOf(cVar.getF92744h()), Integer.valueOf(cVar.getF92745i()))) {
                Context context12 = this.f84064b;
                context12.getClass();
                arrayListM.add(new VoiceAssistantProtobufRequestHandler(context12, aVar9));
            }
        }
        if (cVar.getConfigurationFlags().contains(115)) {
            arrayListM.add(new b80.a());
        }
        arrayListM.add(new ui1.e());
        ProtobufRequestManager protobufRequestManager = ProtobufRequestManager.getInstance();
        protobufRequestManager.getClass();
        arrayListM.add(protobufRequestManager);
        return arrayListM;
    }

    public final void k(rs2.c cVar, String str, Bundle bundle, boolean z14) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        Context context = this.f84064b;
        DeviceProfile deviceProfileA = da2.d.c(context).a(cVar.getF92741e());
        if (deviceProfileA != null) {
            bundle.putParcelable("com.garmin.android.gdi.EXTRA_REMOTE_DEVICE_PROFILE", deviceProfileA);
        }
        String f172493a = cVar.getF92741e();
        if (!TextUtils.isEmpty(f172493a)) {
            bundle.putString("com.garmin.android.gdi.EXTRA_REMOTE_DEVICE_MAC_ADDRESS", f172493a);
        }
        long f172494b = cVar.getF92746j();
        if (f172494b >= 0) {
            bundle.putLong("com.garmin.android.gdi.EXTRA_REMOTE_DEVICE_UNIT_ID", f172494b);
        }
        if (z14) {
            oa2.b.a(context, str, "GCMHostConfiguration", bundle);
        } else {
            oa2.b.b(context, str, "GCMHostConfiguration", bundle);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lhk0/f$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "GARMIN_DEVICE_STATUS_SUPPORT_FLAG", "I", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
