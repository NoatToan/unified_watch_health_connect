package com.xiaomi.eco.api;

import android.bluetooth.BluetoothDevice;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.annotation.GuardedBy;
import com.xiaomi.EcoConnectPreference;
import com.xiaomi.android.ble.BluetoothPreference;
import com.xiaomi.eco.BleManagerFactoryKt;
import com.xiaomi.eco.api.bean.EcoConnectDeviceInfo;
import com.xiaomi.eco.api.i;
import com.xiaomi.eco.connection.ConnectionFactoryKt;
import com.xiaomi.eco.utils.DeviceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ByteUtil;
import com.xiaomi.miot.core.bluetooth.BluetoothManager;
import defpackage.aqc;
import defpackage.b23;
import defpackage.ch7;
import defpackage.dsf;
import defpackage.e7r;
import defpackage.ekb;
import defpackage.ft3;
import defpackage.ht2;
import defpackage.it3;
import defpackage.jpc;
import defpackage.l22;
import defpackage.lem;
import defpackage.mj7;
import defpackage.nj7;
import defpackage.qf4;
import defpackage.rd7;
import defpackage.tta;
import defpackage.wrc;
import defpackage.x82;
import defpackage.zpc;
import java.util.UUID;

/* JADX INFO: loaded from: classes7.dex */
public class i extends EcoCipherApiCall<EcoBleConnection> implements b23 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public jpc f11260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EcoConnectDeviceInfo.PrivateUUID f11261b;
    public tta c;
    public ekb d;
    public ekb e;
    public ekb f;
    public tta g;
    public ekb h;
    public boolean i;
    public final Object j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @GuardedBy("mRunningLock")
    public volatile com.xiaomi.eco.api.b f11262k;
    public final boolean l;
    public volatile boolean m;
    public int n;
    public lem o;

    public class a implements ch7 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f11263a;

        public a(String str) {
            this.f11263a = str;
        }

        @Override // defpackage.ch7
        public void onBindFailure(int i, String str) {
            try {
                i.this.mCallbackProxy.onBindFailure(i, str);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }

        @Override // defpackage.ch7
        public void onBindSuccess(String str, String str2, String str3, String str4) {
            try {
                i.this.mCallbackProxy.onBindSuccess(str, str2, str3, str4);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }

        @Override // defpackage.mj7
        public void onBondFailure(int i) {
            try {
                i.this.mCallbackProxy.onBondFailure(i);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }

        @Override // defpackage.mj7
        public void onBondSuccess() {
            try {
                i.this.mCallbackProxy.onBondSuccess();
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }

        @Override // defpackage.nj7
        public void onConnectFailure(int i) {
            try {
                i.this.mCallbackProxy.onConnectFailure(i);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }

        @Override // defpackage.nj7
        public void onConnectSuccess() {
            try {
                i.this.mCallbackProxy.onConnectSuccess();
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }

        @Override // defpackage.fu7
        public void onLocalBindSuccess(String str, String str2, String str3, String str4, String str5, byte[] bArr) {
            C c = i.this.mConnection;
            if (c != 0) {
                ((EcoBleConnection) c).setUserId(this.f11263a);
                ((EcoBleConnection) i.this.mConnection).setToken(bArr);
                ((EcoBleConnection) i.this.mConnection).setAppDeviceId(str5);
            }
            try {
                i.this.mCallbackProxy.onLocalBindSuccess(str, str2, str3, str4, str5, bArr);
                C c2 = i.this.mConnection;
                if (c2 != 0) {
                    ((EcoBleConnection) c2).onConnectSuccess();
                }
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
    }

    public class b implements ht2<Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ mj7 f11265a;

        public b(mj7 mj7Var) {
            this.f11265a = mj7Var;
        }

        @Override // defpackage.ht2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResponse(Void r1) {
            this.f11265a.onBondSuccess();
        }

        @Override // defpackage.ht2
        public void onFailed(int i) {
            this.f11265a.onBondFailure(i);
        }
    }

    public class c implements ht2<Void> {
        public c() {
        }

        @Override // defpackage.ht2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResponse(Void r1) {
            try {
                i.this.mCallbackProxy.onRemoveSuccess();
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }

        @Override // defpackage.ht2
        public void onFailed(int i) {
            try {
                i.this.mCallbackProxy.onRemoveFailure(i);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
    }

    public class d implements ht2<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ nj7 f11268a;

        public d(nj7 nj7Var) {
            this.f11268a = nj7Var;
        }

        @Override // defpackage.ht2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResponse(String str) {
            if (!i.this.isConnected()) {
                i.this.onConnected();
            }
            this.f11268a.onConnectSuccess();
        }

        @Override // defpackage.ht2
        public void onFailed(int i) {
            Logger.i("EcoApiCall", "onFailed() called with: status = [" + i + "]");
            if (i.this.M5(this.f11268a, i)) {
                return;
            }
            this.f11268a.onConnectFailure(i);
        }
    }

    public i(String str, String str2, boolean z, EcoConnectDeviceInfo ecoConnectDeviceInfo, wrc wrcVar) {
        super(str, str2, wrcVar);
        this.i = false;
        this.j = new Object();
        this.m = false;
        this.n = 0;
        boolean zIsSupportLargeMtu = DeviceExtKt.isSupportLargeMtu(ecoConnectDeviceInfo.getMode());
        this.l = zIsSupportLargeMtu;
        if (ecoConnectDeviceInfo.isLocalBindMode()) {
            this.n = 1;
        }
        Logger.i("isSupportLargeMtu=" + zIsSupportLargeMtu, new Object[0]);
        this.f11260a = BleManagerFactoryKt.createBleManager(zIsSupportLargeMtu, false, false);
        this.f11261b = ecoConnectDeviceInfo.getPrivateUUID();
        this.mConnection = ConnectionFactoryKt.createEcoConnection(J5(), getDid(), z, this.n, this, this.f11260a, ecoConnectDeviceInfo.getMode(), ecoConnectDeviceInfo.getType());
        Logger.i("EcoApiCall", "bindType : " + this.n + ", mConnection : " + this.mConnection);
        if ((this.f11260a instanceof e7r) && BluetoothPreference.INSTANCE.isBluetoothProxyRegistered(J5())) {
            BluetoothManager.get().unregisterConnectProxy(J5());
        }
    }

    public static /* synthetic */ void W5(com.xiaomi.eco.api.b bVar, int i) {
        if (bVar.h()) {
            return;
        }
        if (i == 0) {
            bVar.o(0);
            return;
        }
        if (i == -3) {
            bVar.o(-4);
        } else if (i == -2) {
            bVar.o(-1);
        } else {
            bVar.o(-2);
        }
    }

    public final void B5(com.xiaomi.eco.api.b bVar) {
        synchronized (this.j) {
            try {
                if (this.f11262k == bVar) {
                    a6();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void C5(mj7 mj7Var) {
        if (P5()) {
            mj7Var.onBondSuccess();
        } else {
            this.f11260a.j(new b(mj7Var));
        }
    }

    public final void D5(int i, int i2, byte[] bArr) {
        if (bArr != null && i2 == 1) {
            bArr = decryptData(i, bArr);
        }
        Logger.d("EcoApiCall", "dispatchMessage: data = " + bArr);
        if (bArr != null) {
            dispatchMessage(i, bArr);
        }
    }

    public void E5(ht2<Void> ht2Var) {
        if (this.i) {
            ht2Var.onResponse(null);
            return;
        }
        this.i = true;
        tta ttaVar = this.c;
        if (ttaVar != null) {
            ttaVar.d(new tta.a(ht2Var));
        }
        ekb ekbVar = this.d;
        if (ekbVar != null) {
            ekbVar.i0(null);
        }
        ekb ekbVar2 = this.e;
        if (ekbVar2 != null) {
            ekbVar2.i0(null);
        }
        ekb ekbVar3 = this.f;
        if (ekbVar3 != null) {
            ekbVar3.i0(null);
        }
        tta ttaVar2 = this.g;
        if (ttaVar2 != null) {
            ttaVar2.d(null);
        }
        ekb ekbVar4 = this.h;
        if (ekbVar4 != null) {
            ekbVar4.i0(null);
        }
    }

    public void F5() {
        this.m = true;
    }

    public BluetoothDevice G5() {
        return this.f11260a.h();
    }

    public final aqc H5(com.xiaomi.eco.api.b bVar) {
        int iG = bVar.g();
        if (iG == 100 || iG == 101) {
            return this.c;
        }
        if (iG == 104) {
            return this.f;
        }
        if (iG != 105) {
            return null;
        }
        return this.g;
    }

    public final byte I5(com.xiaomi.eco.api.b bVar) {
        int iG = bVar.g();
        if (iG != 100) {
            return ((iG == 101 || iG == 104 || iG == 105) && getVersion() != 0) ? (byte) 1 : (byte) 0;
        }
        return (byte) 2;
    }

    public String J5() {
        return getCoreId();
    }

    public final ft3 K5(UUID uuid) {
        tta ttaVar = this.c;
        if (ttaVar != null && ttaVar.e().j0().equals(uuid)) {
            return this.c.e();
        }
        ekb ekbVar = this.d;
        if (ekbVar != null && ekbVar.j0().equals(uuid)) {
            return this.d;
        }
        ekb ekbVar2 = this.e;
        if (ekbVar2 == null || !ekbVar2.j0().equals(uuid)) {
            return null;
        }
        return this.e;
    }

    public lem L5() {
        return this.o;
    }

    public final boolean M5(nj7 nj7Var, int i) {
        if (i != -10) {
            return false;
        }
        this.f11260a = BleManagerFactoryKt.createBleManager(this.l, false, false);
        O5(nj7Var);
        return true;
    }

    public final void N5() {
        UUID uuid;
        UUID uuidFromString;
        UUID uuid2;
        UUID uuid3;
        UUID uuidFromString2;
        UUID uuidFromString3;
        UUID uuidFromString4;
        UUID uuidFromString5;
        UUID uuidFromString6;
        if (getVersion() == 0) {
            EcoConnectDeviceInfo.PrivateUUID privateUUID = this.f11261b;
            uuid3 = null;
            if (privateUUID == null || TextUtils.isEmpty(privateUUID.getService())) {
                uuidFromString = null;
                uuidFromString6 = null;
                uuidFromString5 = null;
                uuidFromString4 = null;
                uuidFromString3 = null;
                uuidFromString2 = null;
                uuid = null;
                uuid2 = null;
            } else {
                uuidFromString = UUID.fromString(this.f11261b.getService());
                UUID uuidFromString7 = !TextUtils.isEmpty(this.f11261b.getProtoTX()) ? UUID.fromString(this.f11261b.getProtoTX()) : null;
                UUID uuidFromString8 = !TextUtils.isEmpty(this.f11261b.getProtoRX()) ? UUID.fromString(this.f11261b.getProtoRX()) : null;
                uuidFromString6 = !TextUtils.isEmpty(this.f11261b.getFitness()) ? UUID.fromString(this.f11261b.getFitness()) : null;
                uuidFromString5 = !TextUtils.isEmpty(this.f11261b.getVoice()) ? UUID.fromString(this.f11261b.getVoice()) : null;
                uuidFromString4 = !TextUtils.isEmpty(this.f11261b.getMass()) ? UUID.fromString(this.f11261b.getMass()) : null;
                uuidFromString3 = !TextUtils.isEmpty(this.f11261b.getOtaTX()) ? UUID.fromString(this.f11261b.getOtaTX()) : null;
                uuidFromString2 = !TextUtils.isEmpty(this.f11261b.getOtaRX()) ? UUID.fromString(this.f11261b.getOtaRX()) : null;
                uuid = uuidFromString7;
                uuid2 = uuidFromString8;
            }
        } else {
            UUID uuid4 = qf4.f31472a;
            UUID uuid5 = qf4.d;
            UUID uuid6 = qf4.c;
            UUID uuid7 = qf4.e;
            UUID uuid8 = qf4.f;
            UUID uuid9 = qf4.g;
            UUID uuid10 = qf4.i;
            UUID uuid11 = qf4.h;
            UUID uuid12 = qf4.l;
            F5();
            uuid = uuid5;
            uuidFromString = uuid4;
            uuid2 = uuid6;
            uuid3 = uuid12;
            uuidFromString2 = uuid11;
            uuidFromString3 = uuid10;
            uuidFromString4 = uuid9;
            uuidFromString5 = uuid8;
            uuidFromString6 = uuid7;
        }
        if (uuidFromString != null) {
            if (uuid != null && uuid2 != null && this.f11260a.a(uuidFromString, uuid) && this.f11260a.a(uuidFromString, uuid2)) {
                this.c = new tta(this.f11260a, false, uuidFromString, uuid, uuid2, new zpc() { // from class: hi7
                    @Override // defpackage.zpc
                    public final void c(byte b2, byte[] bArr) {
                        this.f20091a.R5(b2, bArr);
                    }
                });
            }
            if (uuidFromString6 != null && this.f11260a.a(uuidFromString, uuidFromString6)) {
                this.d = new ekb(this.f11260a, false, uuidFromString, uuidFromString6, new zpc() { // from class: ii7
                    @Override // defpackage.zpc
                    public final void c(byte b2, byte[] bArr) {
                        this.f21166a.S5(b2, bArr);
                    }
                });
            }
            if (uuidFromString5 != null && this.f11260a.a(uuidFromString, uuidFromString5)) {
                this.e = new ekb(this.f11260a, false, uuidFromString, uuidFromString5, new zpc() { // from class: ji7
                    @Override // defpackage.zpc
                    public final void c(byte b2, byte[] bArr) {
                        this.f22828a.T5(b2, bArr);
                    }
                });
            }
            if (uuidFromString4 != null && this.f11260a.a(uuidFromString, uuidFromString4)) {
                this.f = new ekb(this.f11260a, false, uuidFromString, uuidFromString4, null);
            }
            if (uuidFromString3 != null && uuidFromString2 != null && this.f11260a.a(uuidFromString, uuidFromString3) && this.f11260a.a(uuidFromString, uuidFromString2)) {
                this.g = new tta(this.f11260a, false, uuidFromString, uuidFromString3, uuidFromString2, new zpc() { // from class: ki7
                    @Override // defpackage.zpc
                    public final void c(byte b2, byte[] bArr) {
                        this.f23871a.U5(b2, bArr);
                    }
                });
            }
            if (uuid3 != null && this.f11260a.a(uuidFromString, uuid3)) {
                this.h = new ekb(this.f11260a, false, uuidFromString, uuid3, new zpc() { // from class: li7
                    @Override // defpackage.zpc
                    public final void c(byte b2, byte[] bArr) {
                        this.f25095a.V5(b2, bArr);
                    }
                });
            }
            e6();
            if (this.f11260a instanceof e7r) {
                getCryptoCounter().e();
            }
        }
    }

    public void O5(nj7 nj7Var) {
        if ((this.f11260a instanceof l22) && isConnected()) {
            nj7Var.onConnectSuccess();
        } else {
            this.f11260a.c(J5(), new d(nj7Var));
        }
    }

    public boolean P5() {
        return this.f11260a.e();
    }

    public boolean Q5() {
        return this.m;
    }

    public final /* synthetic */ void R5(byte b2, byte[] bArr) {
        if (b2 == 2) {
            D5(100, b2, bArr);
        } else {
            D5(101, b2, bArr);
        }
    }

    public final /* synthetic */ void S5(byte b2, byte[] bArr) {
        D5(102, b2, bArr);
    }

    public final /* synthetic */ void T5(byte b2, byte[] bArr) {
        D5(103, b2, bArr);
    }

    public final /* synthetic */ void U5(byte b2, byte[] bArr) {
        D5(105, b2, bArr);
    }

    public final /* synthetic */ void V5(byte b2, byte[] bArr) {
        D5(107, b2, bArr);
    }

    public void X5() {
        lem lemVar = this.o;
        if (lemVar == null || TextUtils.isEmpty(lemVar.e)) {
            return;
        }
        ft3 ft3VarK5 = K5(UUID.fromString(this.o.e));
        Logger.d("EcoApiCall", "onAuthConnectSuccess: channel = " + ft3VarK5);
        if (ft3VarK5 == null) {
            Logger.i("EcoApiCall", "resolveSinglePacket: error channel");
            return;
        }
        Logger.d("EcoApiCall", "onAuthConnectSuccess: " + ByteUtil.byteToString(this.o.i));
        ft3VarK5.N(this.o.i);
        this.o = null;
    }

    public final void Y5() {
        tta ttaVar = this.c;
        if (ttaVar != null && ttaVar.f()) {
            this.c.g();
        }
        ekb ekbVar = this.d;
        if (ekbVar != null && ekbVar.k0()) {
            this.d.l0();
        }
        ekb ekbVar2 = this.e;
        if (ekbVar2 != null && ekbVar2.k0()) {
            this.e.l0();
        }
        ekb ekbVar3 = this.f;
        if (ekbVar3 != null && ekbVar3.k0()) {
            this.f.l0();
        }
        tta ttaVar2 = this.g;
        if (ttaVar2 != null && ttaVar2.f()) {
            this.g.g();
        }
        ekb ekbVar4 = this.h;
        if (ekbVar4 == null || !ekbVar4.k0()) {
            return;
        }
        this.h.l0();
    }

    public final void Z5() {
        tta ttaVar = this.c;
        if (ttaVar != null) {
            ttaVar.h();
            this.c = null;
        }
        ekb ekbVar = this.d;
        if (ekbVar != null) {
            ekbVar.T();
            this.d = null;
        }
        ekb ekbVar2 = this.e;
        if (ekbVar2 != null) {
            ekbVar2.T();
            this.e = null;
        }
        ekb ekbVar3 = this.f;
        if (ekbVar3 != null) {
            ekbVar3.T();
            this.f = null;
        }
        tta ttaVar2 = this.g;
        if (ttaVar2 != null) {
            ttaVar2.h();
            this.g = null;
        }
        ekb ekbVar4 = this.h;
        if (ekbVar4 != null) {
            ekbVar4.T();
            this.h = null;
        }
    }

    public final void a6() {
        com.xiaomi.eco.api.b bVarNextApiTask = nextApiTask();
        if (bVarNextApiTask != null) {
            run(bVarNextApiTask);
        } else {
            this.f11262k = null;
        }
    }

    public void b6(lem lemVar) {
        Logger.d("EcoApiCall", "setSinglePacket() called with: singlePacket = [" + lemVar + "]");
        this.o = lemVar;
    }

    @Override // com.xiaomi.eco.api.EcoCipherApiCall, com.xiaomi.eco.common.connect.a
    public void bind(String str) {
        bindV2(str, null, null, "", "", "", false);
    }

    @Override // com.xiaomi.eco.api.a, com.xiaomi.eco.common.connect.a
    public void bindV2(String str, String str2, String str3, String str4, String str5, String str6, boolean z) {
        new h(str, str2, z, str3, str4, str5, str6, this).start(new a(str));
    }

    public final void c6() {
        tta ttaVar = this.c;
        if (ttaVar != null) {
            ttaVar.j();
        }
        ekb ekbVar = this.d;
        if (ekbVar != null) {
            ekbVar.m0();
        }
        ekb ekbVar2 = this.e;
        if (ekbVar2 != null) {
            ekbVar2.m0();
        }
        ekb ekbVar3 = this.f;
        if (ekbVar3 != null) {
            ekbVar3.m0();
        }
        tta ttaVar2 = this.g;
        if (ttaVar2 != null) {
            ttaVar2.j();
        }
        ekb ekbVar4 = this.h;
        if (ekbVar4 != null) {
            ekbVar4.m0();
        }
    }

    @Override // com.xiaomi.eco.api.a, com.xiaomi.eco.api.p
    public final void cancel(com.xiaomi.eco.api.b bVar) {
        super.cancel(bVar);
        B5(bVar);
    }

    @Override // com.xiaomi.eco.api.EcoCipherApiCall, com.xiaomi.eco.common.connect.a
    public synchronized void connect(String str, byte[] bArr) throws RemoteException {
        Logger.i("EcoApiCall", "connect: mConnection = " + this.mConnection);
        C c2 = this.mConnection;
        if (c2 == 0) {
            return;
        }
        ((EcoBleConnection) c2).setUserId(str);
        ((EcoBleConnection) this.mConnection).setToken(bArr);
        ((EcoBleConnection) this.mConnection).connect(true, true, 1);
    }

    @Override // com.xiaomi.eco.api.a, com.xiaomi.eco.common.connect.a
    public void connectV2(String str, byte[] bArr, String str2, String str3, int i) throws RemoteException {
        Logger.i("EcoApiCall", "connectV2: mConnection = " + this.mConnection);
        C c2 = this.mConnection;
        if (c2 == 0) {
            return;
        }
        ((EcoBleConnection) c2).setUserId(str);
        ((EcoBleConnection) this.mConnection).setToken(bArr);
        ((EcoBleConnection) this.mConnection).setAppDeviceId(str2);
        ((EcoBleConnection) this.mConnection).setOob(str3);
        ((EcoBleConnection) this.mConnection).connect(true, true, 1);
    }

    @Override // com.xiaomi.eco.api.a, com.xiaomi.eco.common.connect.a
    public int connectionType() {
        return this.f11260a instanceof e7r ? 1 : 2;
    }

    public void d6() {
        jpc jpcVar = this.f11260a;
        if (jpcVar == null || !(jpcVar instanceof x82)) {
            return;
        }
        long jJ1 = ((x82) jpcVar).J1();
        Logger.i("EcoApiCall", "updateLastConnectTime: " + jJ1);
        EcoConnectPreference.INSTANCE.setLAST_CONNECT_TIME(jJ1);
    }

    @Override // com.xiaomi.eco.api.a, com.xiaomi.eco.common.connect.a
    public void destroy() {
        super.destroy();
        getCryptoCounter().e();
    }

    @Override // com.xiaomi.eco.api.EcoCipherApiCall, com.xiaomi.eco.common.connect.a
    public void disconnect() throws RemoteException {
        C c2 = this.mConnection;
        if (c2 == 0) {
            return;
        }
        ((EcoBleConnection) c2).disconnect();
    }

    public final void e6() {
        int iO = this.f11260a.o();
        int version = getVersion();
        boolean z = version > 1;
        boolean z2 = version > 1;
        tta ttaVar = this.c;
        if (ttaVar != null) {
            ttaVar.i(iO, z, z2);
        }
        ekb ekbVar = this.d;
        if (ekbVar != null) {
            ekbVar.Z(iO, z, z2);
        }
        ekb ekbVar2 = this.e;
        if (ekbVar2 != null) {
            ekbVar2.Z(iO, z, z2);
        }
        ekb ekbVar3 = this.f;
        if (ekbVar3 != null) {
            ekbVar3.Z(iO, z, z2);
        }
        tta ttaVar2 = this.g;
        if (ttaVar2 != null) {
            ttaVar2.i(iO, z, z2);
        }
        ekb ekbVar4 = this.h;
        if (ekbVar4 != null) {
            ekbVar4.Z(iO, z, z2);
        }
    }

    @Override // com.xiaomi.eco.api.a
    public final void enqueue(com.xiaomi.eco.api.b bVar) {
        super.enqueue(bVar);
        synchronized (this.j) {
            try {
                if (this.f11262k == null) {
                    Logger.i("EcoApiCall", "enqueue run  " + bVar);
                    run(bVar);
                } else {
                    Logger.i("EcoApiCall", "enqueue " + bVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.xiaomi.eco.api.a
    public final byte[] getData(com.xiaomi.eco.api.b bVar) {
        int iG = bVar.g();
        if (iG == 100 || iG == 101) {
            return dsf.i(bVar.d());
        }
        if (iG == 104 || iG == 105) {
            return bVar.b();
        }
        return null;
    }

    @Override // com.xiaomi.eco.api.EcoCipherApiCall
    public long getLastConnectTime() {
        jpc jpcVar = this.f11260a;
        if (jpcVar == null || !(jpcVar instanceof x82)) {
            return 0L;
        }
        return ((x82) jpcVar).J1();
    }

    @Override // com.xiaomi.eco.api.EcoCipherApiCall, com.xiaomi.eco.common.connect.a
    public String getName() {
        BluetoothDevice bluetoothDeviceG5 = G5();
        return bluetoothDeviceG5 != null ? bluetoothDeviceG5.getName() : "";
    }

    public int getVersion() {
        return this.f11260a.getVersion();
    }

    @Override // defpackage.b23
    public void onConnectStateChanged(String str, int i) {
        if (i == 0 && isConnected()) {
            onDisconnected();
        }
    }

    @Override // com.xiaomi.eco.api.a
    public void onConnected() {
        super.onConnected();
        N5();
        Y5();
        BluetoothManager.get().addConnectStatusListener(J5(), this);
    }

    @Override // com.xiaomi.eco.api.a
    public void onDisconnected() {
        super.onDisconnected();
        synchronized (this.j) {
            this.f11262k = null;
        }
        this.i = false;
        c6();
        Z5();
        rd7.a();
        BluetoothManager.get().removeConnectStatusListener(J5(), this);
    }

    @Override // com.xiaomi.eco.api.a, com.xiaomi.eco.api.p
    public void onReceiveResponse(com.xiaomi.eco.api.b bVar) {
        super.onReceiveResponse(bVar);
        if (Q5()) {
            return;
        }
        B5(bVar);
    }

    @Override // com.xiaomi.eco.api.a, com.xiaomi.eco.api.p
    public void onResponseTimeout(com.xiaomi.eco.api.b bVar) {
        super.onResponseTimeout(bVar);
        if (Q5()) {
            return;
        }
        B5(bVar);
    }

    @Override // com.xiaomi.eco.api.a, com.xiaomi.eco.api.p
    public void onSendFailed(com.xiaomi.eco.api.b bVar, boolean z) {
        super.onSendFailed(bVar, z);
        B5(bVar);
    }

    @Override // com.xiaomi.eco.api.a, com.xiaomi.eco.api.p
    public void onSendSuccess(com.xiaomi.eco.api.b bVar) {
        super.onSendSuccess(bVar);
        if (Q5() || !bVar.i()) {
            B5(bVar);
        }
    }

    @Override // com.xiaomi.eco.api.EcoCipherApiCall, com.xiaomi.eco.common.connect.a
    public void removeBond() {
        this.f11260a.n(new c());
    }

    @Override // com.xiaomi.eco.api.a, com.xiaomi.eco.common.connect.a
    public void resetBleManager() {
        jpc jpcVar = this.f11260a;
        if (jpcVar != null) {
            jpcVar.close();
        }
        this.f11260a = BleManagerFactoryKt.createBleManager(this.l, false, false);
    }

    @Override // com.xiaomi.eco.api.a
    public final void run(final com.xiaomi.eco.api.b bVar) {
        Logger.i("EcoApiCall", "run() called with: apiTask = [" + bVar + "]");
        super.run(bVar);
        this.f11262k = bVar;
        aqc aqcVarH5 = H5(bVar);
        Logger.i("EcoApiCall", "enqueue channelSender  " + aqcVarH5);
        if (aqcVarH5 == null) {
            bVar.o(-2);
            return;
        }
        byte bI5 = I5(bVar);
        byte[] data = getData(bVar);
        Logger.i("EcoApiCall", "enqueue data  " + data + "," + ((int) bI5));
        if (data != null && bI5 == 1) {
            Logger.i("EcoApiCall", "enqueue dataType 111 ");
            data = encryptData(bVar.g(), data);
            Logger.i("EcoApiCall", "enqueue dataType 2222 ");
        }
        if (data == null) {
            Logger.i("EcoApiCall", "enqueue dataType 333 ");
            bVar.o(-2);
            return;
        }
        Logger.i("EcoApiCall", "enqueue dataType  " + ((int) bI5));
        aqcVarH5.b(bI5, data, new it3() { // from class: mi7
            @Override // defpackage.it3
            public final void onCallback(int i) {
                i.W5(bVar, i);
            }
        });
    }
}
