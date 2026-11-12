package m80;

import android.app.NotificationManager;
import android.companion.AssociationInfo;
import android.companion.CompanionDeviceManager;
import android.companion.ObservingDevicePresenceRequest;
import android.content.ComponentName;
import android.content.Context;
import android.net.MacAddress;
import android.os.Build;
import androidx.room.a0;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.gncs.GNCSListenerService;
import d53.u;
import d53.w;
import f12.l;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import ls0.v;
import o13.q;
import o13.r;
import o53.s0;
import o53.z;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p13.h0;
import p13.j0;
import p13.l0;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\fB)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lm80/b;", "Lm80/a;", "Landroid/content/Context;", "appContext", "Lrd2/f;", "deviceDAO", "Lf12/l;", "userSettings", "Lo53/z;", "ioDispatcher", "<init>", "(Landroid/content/Context;Lrd2/f;Lf12/l;Lo53/z;)V", "a", "gcm-domain-device_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b implements m80.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f117134f = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f117135b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final rd2.f f117136c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l f117137d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final z f117138e;

    static {
        new a(null);
    }

    public b(Context context, rd2.f fVar, l lVar, z zVar) {
        context.getClass();
        fVar.getClass();
        lVar.getClass();
        zVar.getClass();
        this.f117135b = context;
        this.f117136c = fVar;
        this.f117137d = lVar;
        this.f117138e = zVar;
    }

    public static boolean k(CompanionDeviceManager companionDeviceManager, String str, String str2) {
        String string;
        String deviceProfile;
        try {
            m80.a.f117132a.getClass();
            if (!m80.a.C2223a.a(str2)) {
                List<String> associations = companionDeviceManager.getAssociations();
                associations.getClass();
                i2.f36769a.getClass();
                i2.a.b(a2.DEVICES, "CompanionDeviceRepository", "isDeviceLinked() - macAddress[" + str + "] associations[" + associations + "]");
                if (associations.isEmpty()) {
                    return false;
                }
                Iterator<T> it = associations.iterator();
                while (it.hasNext()) {
                    if (u.q((String) it.next(), str, true)) {
                    }
                }
                return false;
            }
            List myAssociations = companionDeviceManager.getMyAssociations();
            myAssociations.getClass();
            i2.f36769a.getClass();
            i2.a.b(a2.DEVICES, "CompanionDeviceRepository", "isDeviceLinked() - macAddress[" + str + "] myAssociations[" + myAssociations + "]");
            if (myAssociations.isEmpty()) {
                return false;
            }
            Iterator it3 = myAssociations.iterator();
            while (it3.hasNext()) {
                AssociationInfo associationInfoB = v.b(it3.next());
                MacAddress deviceMacAddress = associationInfoB.getDeviceMacAddress();
                if (deviceMacAddress != null && (string = deviceMacAddress.toString()) != null && string.equalsIgnoreCase(str) && (deviceProfile = associationInfoB.getDeviceProfile()) != null && !w.J(deviceProfile)) {
                }
            }
            return false;
            return true;
        } catch (Exception e4) {
            a2 a2Var = a2.DEVICES;
            String strD = com.airbnb.lottie.animation.keyframe.a.d(e4, "isDeviceLinked() - Exception: ");
            i2.f36769a.getClass();
            i2.a.f(a2Var, "CompanionDeviceRepository", strD);
            return true;
        }
    }

    @Override // m80.a
    public final boolean a() {
        CompanionDeviceManager companionDeviceManager = (CompanionDeviceManager) this.f117135b.getSystemService(CompanionDeviceManager.class);
        if (companionDeviceManager == null) {
            a2 a2Var = a2.DEVICES;
            i2.f36769a.getClass();
            i2.a.b(a2Var, "CompanionDeviceRepository", "anyDeviceLinked() - CompanionDeviceManager NULL ??? - returning false so no more action will follow");
            return false;
        }
        try {
            m80.a.f117132a.getClass();
            if (m80.a.C2223a.a(null)) {
                List myAssociations = companionDeviceManager.getMyAssociations();
                myAssociations.getClass();
                if (!myAssociations.isEmpty()) {
                    return true;
                }
            } else {
                List<String> associations = companionDeviceManager.getAssociations();
                associations.getClass();
                if (!associations.isEmpty()) {
                    return true;
                }
            }
            return false;
        } catch (Exception e4) {
            a2 a2Var2 = a2.DEVICES;
            String strD = com.airbnb.lottie.animation.keyframe.a.d(e4, "anyDeviceLinked() - Exception: ");
            i2.f36769a.getClass();
            i2.a.f(a2Var2, "CompanionDeviceRepository", strD);
            return false;
        }
    }

    @Override // m80.a
    public final void b() {
        boolean zIsNotificationListenerAccessGranted;
        Object bVar;
        Context context = this.f117135b;
        CompanionDeviceManager companionDeviceManager = (CompanionDeviceManager) context.getSystemService(CompanionDeviceManager.class);
        if (companionDeviceManager == null) {
            a2 a2Var = a2.DEVICES;
            i2.f36769a.getClass();
            i2.a.b(a2Var, "CompanionDeviceRepository", "requestNotificationAccess() - CompanionDeviceManager NULL ??? - Abort operation so no more action will follow");
            return;
        }
        ComponentName componentName = new ComponentName(context.getPackageName(), GNCSListenerService.class.getName());
        if (companionDeviceManager.getAssociations().isEmpty()) {
            a2 a2Var2 = a2.DEVICES;
            i2.f36769a.getClass();
            i2.a.f(a2Var2, "CompanionDeviceRepository", "requestNotificationAccess: Associations are empty somehow? Aborting notification access request");
            return;
        }
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        if (notificationManager == null) {
            a2 a2Var3 = a2.DEVICES;
            i2.f36769a.getClass();
            i2.a.b(a2Var3, "CompanionDeviceRepository", "NotificationManager is not available.");
            zIsNotificationListenerAccessGranted = false;
        } else {
            zIsNotificationListenerAccessGranted = notificationManager.isNotificationListenerAccessGranted(componentName);
        }
        if (zIsNotificationListenerAccessGranted) {
            a2 a2Var4 = a2.DEVICES;
            i2.f36769a.getClass();
            i2.a.p(a2Var4, "CompanionDeviceRepository", "requestNotificationAccess: CDM already has notification access");
            return;
        }
        a2 a2Var5 = a2.DEVICES;
        i2.f36769a.getClass();
        i2.a.b(a2Var5, "CompanionDeviceRepository", "requestNotificationAccess: Making system notification access request");
        try {
            int i14 = q.f128596b;
            companionDeviceManager.requestNotificationAccess(componentName);
            bVar = Unit.INSTANCE;
        } catch (Throwable th3) {
            int i15 = q.f128596b;
            bVar = new q.b(th3);
        }
        if (!(bVar instanceof q.b)) {
            a2 a2Var6 = a2.DEVICES;
            i2.f36769a.getClass();
            i2.a.b(a2Var6, "CompanionDeviceRepository", "requestNotificationAccess: Successful request for notification access");
        }
        Throwable thB = q.b(bVar);
        if (thB != null) {
            a2 a2Var7 = a2.DEVICES;
            String strN = fb1.c.n("requestNotificationAccess: CDM cannot get access - ", thB.getMessage());
            i2.f36769a.getClass();
            i2.a.p(a2Var7, "CompanionDeviceRepository", strN);
        }
        q.a(bVar);
    }

    @Override // m80.a
    public final void c() {
        if (Build.VERSION.SDK_INT > 36) {
            a2 a2Var = a2.DEVICES;
            i2.f36769a.getClass();
            i2.a.b(a2Var, "CompanionDeviceRepository", "clearCompanionDeviceLinkingData()");
            CompanionDeviceManager companionDeviceManager = (CompanionDeviceManager) this.f117135b.getSystemService(CompanionDeviceManager.class);
            if (companionDeviceManager == null) {
                i2.a.b(a2Var, "CompanionDeviceRepository", "clearCompanionDeviceLinkingData() - CompanionDeviceManager NULL ??? - returning false so no more action will follow");
                return;
            }
            try {
                this.f117137d.X1("companion_device_associations_observing", l0.f134950a);
                List myAssociations = companionDeviceManager.getMyAssociations();
                myAssociations.getClass();
                i2.a.b(a2Var, "CompanionDeviceRepository", "clearCompanionDeviceLinkingData() - myAssociations[" + myAssociations + "]");
                Iterator it = myAssociations.iterator();
                while (it.hasNext()) {
                    AssociationInfo associationInfoB = v.b(it.next());
                    companionDeviceManager.disassociate(associationInfoB.getId());
                    b.b.n();
                    ObservingDevicePresenceRequest observingDevicePresenceRequestBuild = b.b.e().setAssociationId(associationInfoB.getId()).build();
                    observingDevicePresenceRequestBuild.getClass();
                    companionDeviceManager.stopObservingDevicePresence(observingDevicePresenceRequestBuild);
                    i2.f36769a.getClass();
                    i2.a.b(a2.DEVICES, "CompanionDeviceRepository", "clearCompanionDeviceLinkingData() - Stopped observing device presence for association: " + associationInfoB);
                }
            } catch (Exception e4) {
                a2 a2Var2 = a2.DEVICES;
                String strD = com.airbnb.lottie.animation.keyframe.a.d(e4, "clearCompanionDeviceLinkingData() - Exception: ");
                i2.f36769a.getClass();
                i2.a.f(a2Var2, "CompanionDeviceRepository", strD);
            }
        }
    }

    @Override // m80.a
    public final boolean d() {
        boolean z14 = Build.VERSION.SDK_INT > 36;
        Set<String> setL1 = this.f117137d.L1("companion_device_associations_observing");
        i2.f36769a.getClass();
        i2.a.b(a2.DEVICES, "CompanionDeviceRepository", "isCompanionDeviceServiceEnabled() - useCompanionDeviceService[" + z14 + "] observingAssociations[" + setL1 + "]");
        return z14 && !setL1.isEmpty();
    }

    @Override // m80.a
    public final boolean e(sd2.f fVar) {
        fVar.getClass();
        CompanionDeviceManager companionDeviceManager = (CompanionDeviceManager) this.f117135b.getSystemService(CompanionDeviceManager.class);
        if (companionDeviceManager != null) {
            return k(companionDeviceManager, fVar.d0(), fVar.getProductNumber()) || k(companionDeviceManager, fVar.Q(), fVar.getProductNumber());
        }
        a2 a2Var = a2.DEVICES;
        i2.f36769a.getClass();
        i2.a.b(a2Var, "CompanionDeviceRepository", "isDeviceLinked() - CompanionDeviceManager NULL ??? - returning true so no more action will follow");
        return true;
    }

    @Override // m80.a
    public final Object f(Context context, String str, String str2, boolean z14, p80.f.a aVar) {
        a2 a2Var = a2.DEVICES;
        String strJ = a0.j("Companion Device Link -> showDeviceLinkDialog() ", str, StringUtils.SPACE, str2);
        i2.f36769a.getClass();
        i2.a.b(a2Var, "CompanionDeviceRepository", strJ);
        return ge1.b.e0(this.f117138e, new f(z14, str, str2, context, null), aVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // m80.a
    public final Object g(v13.c cVar) throws Throwable {
        d dVar;
        if (cVar instanceof d) {
            dVar = (d) cVar;
            int i14 = dVar.f117145c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                dVar.f117145c = i14 - Integer.MIN_VALUE;
            } else {
                dVar = new d(this, cVar);
            }
        } else {
            dVar = new d(this, cVar);
        }
        Object objE0 = dVar.f117143a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = dVar.f117145c;
        if (i15 == 0) {
            r.b(objE0);
            j22.b.f96736a.getClass();
            if (!j22.b.b(this.f117135b)) {
                a2 a2Var = a2.DEVICES;
                i2.f36769a.getClass();
                i2.a.b(a2Var, "CompanionDeviceRepository", "Bluetooth permission not granted, skipping companion device check.");
                return j0.f134944a;
            }
            e eVar = new e(this, null);
            dVar.f117145c = 1;
            objE0 = ge1.b.e0(this.f117138e, eVar, dVar);
            if (objE0 == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(objE0);
        }
        List list = (List) objE0;
        i2.f36769a.getClass();
        i2.a.b(a2.DEVICES, "CompanionDeviceRepository", "Get unlinked companion devices -> " + list);
        return list;
    }

    @Override // m80.a
    public final void h(String str) {
        Object next;
        String string;
        MacAddress deviceMacAddress;
        String string2;
        l lVar = this.f117137d;
        str.getClass();
        if (Build.VERSION.SDK_INT > 36) {
            a2 a2Var = a2.DEVICES;
            String strConcat = "startObservingDevicePresence() - macAddress: ".concat(str);
            i2.f36769a.getClass();
            i2.a.b(a2Var, "CompanionDeviceRepository", strConcat);
            CompanionDeviceManager companionDeviceManager = (CompanionDeviceManager) this.f117135b.getSystemService(CompanionDeviceManager.class);
            if (companionDeviceManager == null) {
                i2.a.b(a2Var, "CompanionDeviceRepository", "startObservingDevicePresence() - CompanionDeviceManager NULL ??? - returning false so no more action will follow");
                return;
            }
            try {
                List myAssociations = companionDeviceManager.getMyAssociations();
                myAssociations.getClass();
                i2.a.b(a2Var, "CompanionDeviceRepository", "startObservingDevicePresence() - myAssociations[" + myAssociations + "]");
                Iterator it = myAssociations.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it.next();
                        deviceMacAddress = v.b(next).getDeviceMacAddress();
                    }
                } while (!((deviceMacAddress == null || (string2 = deviceMacAddress.toString()) == null) ? false : string2.equalsIgnoreCase(str)));
                AssociationInfo associationInfoB = v.b(next);
                if (associationInfoB == null) {
                    i2.f36769a.getClass();
                    i2.a.b(a2.DEVICES, "CompanionDeviceRepository", "startObservingDevicePresence() - No association found for device with MAC address " + str);
                    return;
                }
                b.b.n();
                ObservingDevicePresenceRequest observingDevicePresenceRequestBuild = b.b.e().setAssociationId(associationInfoB.getId()).build();
                observingDevicePresenceRequestBuild.getClass();
                companionDeviceManager.startObservingDevicePresence(observingDevicePresenceRequestBuild);
                i2.f36769a.getClass();
                i2.a.b(a2.DEVICES, "CompanionDeviceRepository", "startObservingDevicePresence() - Started observing device presence for association: " + associationInfoB);
                Set<String> setF1 = h0.f1(lVar.L1("companion_device_associations_observing"));
                MacAddress deviceMacAddress2 = associationInfoB.getDeviceMacAddress();
                if (deviceMacAddress2 != null && (string = deviceMacAddress2.toString()) != null) {
                    setF1.add(string);
                }
                lVar.X1("companion_device_associations_observing", setF1);
            } catch (Exception e4) {
                a2 a2Var2 = a2.DEVICES;
                String strD = com.airbnb.lottie.animation.keyframe.a.d(e4, "startObservingDevicePresence() - Exception: ");
                i2.f36769a.getClass();
                i2.a.f(a2Var2, "CompanionDeviceRepository", strD);
            }
        }
    }

    @Override // m80.a
    public final void i(String str) {
        Object next;
        String string;
        MacAddress deviceMacAddress;
        String string2;
        l lVar = this.f117137d;
        str.getClass();
        if (Build.VERSION.SDK_INT > 36) {
            a2 a2Var = a2.DEVICES;
            String strConcat = "clearDeviceLinkingData() - macAddress: ".concat(str);
            i2.f36769a.getClass();
            i2.a.b(a2Var, "CompanionDeviceRepository", strConcat);
            CompanionDeviceManager companionDeviceManager = (CompanionDeviceManager) this.f117135b.getSystemService(CompanionDeviceManager.class);
            if (companionDeviceManager == null) {
                i2.a.b(a2Var, "CompanionDeviceRepository", "clearDeviceLinkingData() - CompanionDeviceManager NULL ??? - returning false so no more action will follow");
                return;
            }
            try {
                List myAssociations = companionDeviceManager.getMyAssociations();
                myAssociations.getClass();
                i2.a.b(a2Var, "CompanionDeviceRepository", "clearDeviceLinkingData() - myAssociations[" + myAssociations + "]");
                Iterator it = myAssociations.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it.next();
                        deviceMacAddress = v.b(next).getDeviceMacAddress();
                    }
                } while (!((deviceMacAddress == null || (string2 = deviceMacAddress.toString()) == null) ? false : string2.equalsIgnoreCase(str)));
                AssociationInfo associationInfoB = v.b(next);
                if (associationInfoB == null) {
                    i2.f36769a.getClass();
                    i2.a.b(a2.DEVICES, "CompanionDeviceRepository", "clearDeviceLinkingData() - No association found for device with MAC address " + str);
                    return;
                }
                companionDeviceManager.disassociate(associationInfoB.getId());
                b.b.n();
                ObservingDevicePresenceRequest observingDevicePresenceRequestBuild = b.b.e().setAssociationId(associationInfoB.getId()).build();
                observingDevicePresenceRequestBuild.getClass();
                companionDeviceManager.stopObservingDevicePresence(observingDevicePresenceRequestBuild);
                i2.f36769a.getClass();
                i2.a.b(a2.DEVICES, "CompanionDeviceRepository", "clearDeviceLinkingData() - Stopped observing device presence for association: " + associationInfoB);
                Set<String> setF1 = h0.f1(lVar.L1("companion_device_associations_observing"));
                MacAddress deviceMacAddress2 = associationInfoB.getDeviceMacAddress();
                if (deviceMacAddress2 != null && (string = deviceMacAddress2.toString()) != null) {
                    setF1.remove(string);
                }
                lVar.X1("companion_device_associations_observing", setF1);
            } catch (Exception e4) {
                a2 a2Var2 = a2.DEVICES;
                String strD = com.airbnb.lottie.animation.keyframe.a.d(e4, "clearDeviceLinkingData() - Exception: ");
                i2.f36769a.getClass();
                i2.a.f(a2Var2, "CompanionDeviceRepository", strD);
            }
        }
    }

    @Override // m80.a
    public final Object j(boolean z14, i iVar) {
        if (Build.VERSION.SDK_INT <= 36) {
            return Unit.INSTANCE;
        }
        a2 a2Var = a2.DEVICES;
        i2.f36769a.getClass();
        i2.a.b(a2Var, "CompanionDeviceRepository", "checkObservingDevicePresence()");
        CompanionDeviceManager companionDeviceManager = (CompanionDeviceManager) this.f117135b.getSystemService(CompanionDeviceManager.class);
        if (companionDeviceManager == null) {
            i2.a.b(a2Var, "CompanionDeviceRepository", "checkObservingDevicePresence() - CompanionDeviceManager NULL ??? - returning false so no more action will follow");
            return Unit.INSTANCE;
        }
        return ge1.b.e0(this.f117138e, new c(companionDeviceManager, this, z14, null), iVar);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Lm80/b$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "SCAN_TIMEOUT", "J", "COMPANION_DEVICE_ASSOCIATIONS_OBSERVING", "gcm-domain-device_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public b(Context context, rd2.f fVar, l lVar, z zVar, int i14, j jVar) {
        if ((i14 & 8) != 0) {
            x53.c cVar = s0.f129406a;
            zVar = x53.b.f189152a;
        }
        this(context, fVar, lVar, zVar);
    }
}
