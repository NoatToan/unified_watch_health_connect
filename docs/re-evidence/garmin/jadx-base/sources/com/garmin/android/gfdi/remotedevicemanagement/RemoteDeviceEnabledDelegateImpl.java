package com.garmin.android.gfdi.remotedevicemanagement;

import ca0.d4;
import com.garmin.device.datatypes.DeviceProfile;
import e23.p;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import la2.e;
import o13.l;
import o13.m;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import t13.d;
import u13.a;
import v13.c;
import vb.h;
import zy2.k;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B;\b\u0000\u0012(\b\u0002\u0010\u0006\u001a\"\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB3\b\u0016\u0012(\b\u0002\u0010\u0006\u001a\"\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\u000bJ\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0003H\u0096@¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0010\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0003H\u0096@¢\u0006\u0004\b\u0010\u0010\u000fR4\u0010\u0006\u001a\"\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0011R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/garmin/android/gfdi/remotedevicemanagement/RemoteDeviceEnabledDelegateImpl;", "", "Lkotlin/Function2;", "", "Lt13/d;", "", "macAddressLookup", "Lla2/e;", "connectionManager", "<init>", "(Le23/p;Lla2/e;)V", "(Le23/p;)V", "unitId", "", "disconnectRemoteDevice", "(JLt13/d;)Ljava/lang/Object;", "allowRemoteDeviceConnection", "Le23/p;", "Lla2/e;", "Companion", "garmin-fitness-device-interface_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RemoteDeviceEnabledDelegateImpl {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final l<RemoteDeviceEnabledDelegateImpl> DEFAULT$delegate = m.b(new d4(27));
    private static final ConcurrentHashMap<Long, String> KNOWN_DEVICES = new ConcurrentHashMap<>();
    private static final l<k> LOGGER$delegate = m.b(new d4(28));
    private final e connectionManager;
    private final p<Long, d<? super String>, Object> macAddressLookup;

    /* JADX INFO: renamed from: com.garmin.android.gfdi.remotedevicemanagement.RemoteDeviceEnabledDelegateImpl$allowRemoteDeviceConnection$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @v13.e(c = "com.garmin.android.gfdi.remotedevicemanagement.RemoteDeviceEnabledDelegateImpl", f = "RemoteDeviceEnabledDelegateImpl.kt", l = {76}, m = "allowRemoteDeviceConnection")
    public static final class AnonymousClass1 extends c {
        long J$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(d<? super AnonymousClass1> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RemoteDeviceEnabledDelegateImpl.this.allowRemoteDeviceConnection(0L, this);
        }
    }

    /* JADX INFO: renamed from: com.garmin.android.gfdi.remotedevicemanagement.RemoteDeviceEnabledDelegateImpl$disconnectRemoteDevice$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @v13.e(c = "com.garmin.android.gfdi.remotedevicemanagement.RemoteDeviceEnabledDelegateImpl", f = "RemoteDeviceEnabledDelegateImpl.kt", l = {63}, m = "disconnectRemoteDevice")
    public static final class C39011 extends c {
        long J$0;
        int label;
        /* synthetic */ Object result;

        public C39011(d<? super C39011> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RemoteDeviceEnabledDelegateImpl.this.disconnectRemoteDevice(0L, this);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public RemoteDeviceEnabledDelegateImpl(p<? super Long, ? super d<? super String>, ? extends Object> pVar) {
        e eVar = da2.d.b().f58886a;
        eVar.getClass();
        this(pVar, eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final RemoteDeviceEnabledDelegateImpl DEFAULT_delegate$lambda$1() {
        return new RemoteDeviceEnabledDelegateImpl(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final k LOGGER_delegate$lambda$2() {
        return zy2.c.f207527a.a("RemoteDeviceEnabledDelegateImpl");
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004b A[PHI: r5
      0x004b: PHI (r5v5 long) = (r5v0 long), (r5v6 long) binds: [B:15:0x0035, B:20:0x0049] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:23:0x005a  */
    /* JADX WARN: Code duplicated, block: B:24:0x0065  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Instruction removed from duplicated block: B:24:0x0065, please report this as an issue */
    public Object allowRemoteDeviceConnection(long j8, d<? super Unit> dVar) {
        AnonymousClass1 anonymousClass1;
        String str;
        if (dVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) dVar;
            int i14 = anonymousClass1.label;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i14 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(dVar);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(dVar);
        }
        Object objInvoke = anonymousClass1.result;
        a aVar = a.COROUTINE_SUSPENDED;
        int i15 = anonymousClass1.label;
        if (i15 == 0) {
            r.b(objInvoke);
            p<Long, d<? super String>, Object> pVar = this.macAddressLookup;
            if (pVar != null) {
                Long l14 = new Long(j8);
                anonymousClass1.J$0 = j8;
                anonymousClass1.label = 1;
                objInvoke = pVar.invoke(l14, anonymousClass1);
                if (objInvoke == aVar) {
                    return aVar;
                }
            } else {
                str = KNOWN_DEVICES.get(new Long(j8));
            }
            if (str != null) {
                this.connectionManager.m(new da2.a(str));
            } else {
                INSTANCE.getLOGGER().a(null, "allowRemoteDeviceConnection: Unable to find mac address for unitId " + j8);
            }
            return Unit.INSTANCE;
        }
        if (i15 != 1) {
            h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        j8 = anonymousClass1.J$0;
        r.b(objInvoke);
        str = (String) objInvoke;
        if (str == null) {
            str = KNOWN_DEVICES.get(new Long(j8));
        }
        if (str != null) {
            this.connectionManager.m(new da2.a(str));
        } else {
            INSTANCE.getLOGGER().a(null, "allowRemoteDeviceConnection: Unable to find mac address for unitId " + j8);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004c A[PHI: r6
      0x004c: PHI (r6v6 long) = (r6v0 long), (r6v7 long) binds: [B:15:0x0036, B:20:0x004a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:24:0x005e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0073  */
    /* JADX WARN: Code duplicated, block: B:31:0x0078  */
    /* JADX WARN: Code duplicated, block: B:33:0x007b  */
    /* JADX WARN: Code duplicated, block: B:34:0x008b  */
    /* JADX WARN: Code duplicated, block: B:37:0x006e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Instruction removed from duplicated block: B:34:0x008b, please report this as an issue */
    public Object disconnectRemoteDevice(long j8, d<? super Unit> dVar) {
        C39011 c39011;
        String macAddress;
        Iterator it;
        Object next;
        DeviceProfile deviceProfile;
        if (dVar instanceof C39011) {
            c39011 = (C39011) dVar;
            int i14 = c39011.label;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                c39011.label = i14 - Integer.MIN_VALUE;
            } else {
                c39011 = new C39011(dVar);
            }
        } else {
            c39011 = new C39011(dVar);
        }
        Object objInvoke = c39011.result;
        a aVar = a.COROUTINE_SUSPENDED;
        int i15 = c39011.label;
        if (i15 == 0) {
            r.b(objInvoke);
            p<Long, d<? super String>, Object> pVar = this.macAddressLookup;
            if (pVar != null) {
                Long l14 = new Long(j8);
                c39011.J$0 = j8;
                c39011.label = 1;
                objInvoke = pVar.invoke(l14, c39011);
                if (objInvoke == aVar) {
                    return aVar;
                }
            } else {
                it = this.connectionManager.f111646e.e().iterator();
                do {
                    if (it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (((DeviceProfile) next).getF92746j() != j8);
                deviceProfile = (DeviceProfile) next;
                if (deviceProfile != null) {
                    macAddress = deviceProfile.getMacAddress();
                } else {
                    macAddress = null;
                }
            }
            if (macAddress != null) {
                KNOWN_DEVICES.put(new Long(j8), macAddress);
                this.connectionManager.e(macAddress);
            } else {
                INSTANCE.getLOGGER().a(null, "disconnectRemoteDevice: Unable to find mac address for unitId " + j8);
            }
            return Unit.INSTANCE;
        }
        if (i15 != 1) {
            h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        j8 = c39011.J$0;
        r.b(objInvoke);
        macAddress = (String) objInvoke;
        if (macAddress == null) {
            it = this.connectionManager.f111646e.e().iterator();
            do {
                if (it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((DeviceProfile) next).getF92746j() != j8);
            deviceProfile = (DeviceProfile) next;
            if (deviceProfile != null) {
                macAddress = deviceProfile.getMacAddress();
            } else {
                macAddress = null;
            }
        }
        if (macAddress != null) {
            KNOWN_DEVICES.put(new Long(j8), macAddress);
            this.connectionManager.e(macAddress);
        } else {
            INSTANCE.getLOGGER().a(null, "disconnectRemoteDevice: Unable to find mac address for unitId " + j8);
        }
        return Unit.INSTANCE;
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\t\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000e\u001a\u00020\n8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\rR&\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/garmin/android/gfdi/remotedevicemanagement/RemoteDeviceEnabledDelegateImpl$Companion;", "", "<init>", "()V", "Lzy2/k;", "LOGGER$delegate", "Lo13/l;", "getLOGGER", "()Lzy2/k;", "LOGGER", "Lcom/garmin/android/gfdi/remotedevicemanagement/RemoteDeviceEnabledDelegateImpl;", "DEFAULT$delegate", "getDEFAULT", "()Lcom/garmin/android/gfdi/remotedevicemanagement/RemoteDeviceEnabledDelegateImpl;", "DEFAULT", "Ljava/util/concurrent/ConcurrentHashMap;", "", "", "KNOWN_DEVICES", "Ljava/util/concurrent/ConcurrentHashMap;", "getKNOWN_DEVICES$garmin_fitness_device_interface_release", "()Ljava/util/concurrent/ConcurrentHashMap;", "garmin-fitness-device-interface_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j jVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final k getLOGGER() {
            return (k) RemoteDeviceEnabledDelegateImpl.LOGGER$delegate.getValue();
        }

        public final RemoteDeviceEnabledDelegateImpl getDEFAULT() {
            return (RemoteDeviceEnabledDelegateImpl) RemoteDeviceEnabledDelegateImpl.DEFAULT$delegate.getValue();
        }

        public final ConcurrentHashMap<Long, String> getKNOWN_DEVICES$garmin_fitness_device_interface_release() {
            return RemoteDeviceEnabledDelegateImpl.KNOWN_DEVICES;
        }

        private Companion() {
        }
    }

    public /* synthetic */ RemoteDeviceEnabledDelegateImpl(p pVar, e eVar, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : pVar, eVar);
    }

    public /* synthetic */ RemoteDeviceEnabledDelegateImpl(p pVar, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : pVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RemoteDeviceEnabledDelegateImpl(p<? super Long, ? super d<? super String>, ? extends Object> pVar, e eVar) {
        eVar.getClass();
        this.macAddressLookup = pVar;
        this.connectionManager = eVar;
    }
}
