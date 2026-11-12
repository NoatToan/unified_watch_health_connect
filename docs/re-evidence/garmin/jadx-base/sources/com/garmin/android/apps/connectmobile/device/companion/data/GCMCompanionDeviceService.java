package com.garmin.android.apps.connectmobile.device.companion.data;

import android.companion.AssociationInfo;
import android.companion.CompanionDeviceManager;
import android.companion.CompanionDeviceService;
import android.companion.DevicePresenceEvent;
import android.net.MacAddress;
import android.os.Build;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import e23.p;
import java.util.List;
import ls0.v;
import o13.m;
import o13.r;
import o13.t;
import o53.b0;
import o53.c0;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p006l2.v0;
import rd2.f;
import sd2.j;
import t13.d;
import v13.e;
import v13.i;
import vb.h;
import x53.c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/device/companion/data/GCMCompanionDeviceService;", "Landroid/companion/CompanionDeviceService;", "<init>", "()V", "a", "gcm-domain-device_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class GCMCompanionDeviceService extends CompanionDeviceService {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f33735b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f33736a = m.b(new v0(this, 24));

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @e(c = "com.garmin.android.apps.connectmobile.device.companion.data.GCMCompanionDeviceService$onDevicePresenceEvent$1", f = "GCMCompanionDeviceService.kt", l = {67}, m = "invokeSuspend", v = 2)
    public static final class b extends i implements p<b0, d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f33737a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f33738b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ AssociationInfo f33739c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(AssociationInfo associationInfo, d<? super b> dVar) {
            super(2, dVar);
            this.f33739c = associationInfo;
        }

        @Override // v13.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            b bVar = new b(this.f33739c, dVar);
            bVar.f33738b = obj;
            return bVar;
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            MacAddress deviceMacAddress;
            String string;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f33737a;
            if (i14 == 0) {
                r.b(obj);
                AssociationInfo associationInfo = this.f33739c;
                if (associationInfo != null && (deviceMacAddress = associationInfo.getDeviceMacAddress()) != null && (string = deviceMacAddress.toString()) != null) {
                    f.a().f152045a.getClass();
                    j jVarF = rd2.j.f(string);
                    if (jVarF != null) {
                        String str = "Device with macAddress " + string + " appeared, device info: " + jVarF;
                        i2.a aVar2 = i2.f36769a;
                        a2 a2Var = a2.GENERAL;
                        aVar2.getClass();
                        i2.a.b(a2Var, "GCMCompanionDeviceService", str);
                        ed0.a aVar3 = ed0.a.f63825a;
                        this.f33738b = null;
                        this.f33737a = 1;
                        aVar3.getClass();
                        if (ed0.a.j("GCMCompanionDeviceService", this) == aVar) {
                            return aVar;
                        }
                    }
                }
            } else {
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    static {
        new a(null);
    }

    public final void onDeviceAppeared(AssociationInfo associationInfo) {
        associationInfo.getClass();
        if (Build.VERSION.SDK_INT >= 36) {
            return;
        }
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.b(a2Var, "GCMCompanionDeviceService", "onDeviceAppeared -> " + associationInfo);
    }

    public final void onDeviceDisappeared(AssociationInfo associationInfo) {
        associationInfo.getClass();
        if (Build.VERSION.SDK_INT >= 36) {
            return;
        }
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.b(a2Var, "GCMCompanionDeviceService", "onDeviceDisappeared -> " + associationInfo);
    }

    public final void onDevicePresenceEvent(DevicePresenceEvent devicePresenceEvent) {
        devicePresenceEvent.getClass();
        int event = devicePresenceEvent.getEvent();
        t tVar = this.f33736a;
        Object obj = null;
        if (event == 0) {
            List myAssociations = ((CompanionDeviceManager) tVar.getValue()).getMyAssociations();
            myAssociations.getClass();
            for (Object obj2 : myAssociations) {
                if (v.b(obj2).getId() == devicePresenceEvent.getAssociationId()) {
                    AssociationInfo associationInfoB = v.b(obj2);
                    i2.a aVar = i2.f36769a;
                    a2 a2Var = a2.GENERAL;
                    aVar.getClass();
                    i2.a.b(a2Var, "GCMCompanionDeviceService", "EVENT_BLE_APPEARED -> " + associationInfoB);
                    c cVar = s0.f129406a;
                    ge1.b.T(c0.a(x53.b.f189152a), null, null, new b(associationInfoB, null), 3);
                    return;
                }
            }
            obj2 = null;
            AssociationInfo associationInfoB2 = v.b(obj2);
            i2.a aVar2 = i2.f36769a;
            a2 a2Var2 = a2.GENERAL;
            aVar2.getClass();
            i2.a.b(a2Var2, "GCMCompanionDeviceService", "EVENT_BLE_APPEARED -> " + associationInfoB2);
            c cVar2 = s0.f129406a;
            ge1.b.T(c0.a(x53.b.f189152a), null, null, new b(associationInfoB2, null), 3);
            return;
        }
        if (event == 1) {
            List myAssociations2 = ((CompanionDeviceManager) tVar.getValue()).getMyAssociations();
            myAssociations2.getClass();
            for (Object obj3 : myAssociations2) {
                if (v.b(obj3).getId() == devicePresenceEvent.getAssociationId()) {
                    obj = obj3;
                    break;
                }
            }
            String str = "EVENT_BLE_DISAPPEARED -> " + v.b(obj);
            i2.a aVar3 = i2.f36769a;
            a2 a2Var3 = a2.GENERAL;
            aVar3.getClass();
            i2.a.b(a2Var3, "GCMCompanionDeviceService", str);
            return;
        }
        if (event == 2) {
            List myAssociations3 = ((CompanionDeviceManager) tVar.getValue()).getMyAssociations();
            myAssociations3.getClass();
            for (Object obj4 : myAssociations3) {
                if (v.b(obj4).getId() == devicePresenceEvent.getAssociationId()) {
                    obj = obj4;
                    break;
                }
            }
            String str2 = "EVENT_BT_CONNECTED -> " + v.b(obj);
            i2.a aVar4 = i2.f36769a;
            a2 a2Var4 = a2.GENERAL;
            aVar4.getClass();
            i2.a.b(a2Var4, "GCMCompanionDeviceService", str2);
            return;
        }
        if (event != 3) {
            i2.a aVar5 = i2.f36769a;
            a2 a2Var5 = a2.GENERAL;
            aVar5.getClass();
            i2.a.b(a2Var5, "GCMCompanionDeviceService", "onDevicePresenceEvent -> " + devicePresenceEvent);
            return;
        }
        List myAssociations4 = ((CompanionDeviceManager) tVar.getValue()).getMyAssociations();
        myAssociations4.getClass();
        for (Object obj5 : myAssociations4) {
            if (v.b(obj5).getId() == devicePresenceEvent.getAssociationId()) {
                obj = obj5;
                break;
            }
        }
        String str3 = "EVENT_BT_DISCONNECTED -> " + v.b(obj);
        i2.a aVar6 = i2.f36769a;
        a2 a2Var6 = a2.GENERAL;
        aVar6.getClass();
        i2.a.b(a2Var6, "GCMCompanionDeviceService", str3);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/device/companion/data/GCMCompanionDeviceService$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-domain-device_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public final void onDeviceAppeared(String str) {
        str.getClass();
        if (Build.VERSION.SDK_INT >= 33) {
            return;
        }
        String strConcat = "onDeviceAppeared -> ".concat(str);
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.b(a2Var, "GCMCompanionDeviceService", strConcat);
    }

    public final void onDeviceDisappeared(String str) {
        str.getClass();
        if (Build.VERSION.SDK_INT >= 33) {
            return;
        }
        String strConcat = "onDeviceDisappeared -> ".concat(str);
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.b(a2Var, "GCMCompanionDeviceService", strConcat);
    }
}
