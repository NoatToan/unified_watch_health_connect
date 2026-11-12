package defpackage;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import android.content.Context;
import com.huami.bluetooth.profile.channel.module.BuiltInModule;
import com.huami.bluetooth.profile.channel.module.a;
import com.xiaomi.hm.health.bt.profile.base.ProfileUtils;
import com.xiaomi.hm.health.bt.profile.feature.Feature;
import java.nio.charset.Charset;
import java.util.Calendar;
import java.util.UUID;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"NewApi"})
public class yus extends jet implements ats, h4, i1, cq {
    public BluetoothGattCharacteristic H;
    public BluetoothGattCharacteristic I;
    public BluetoothGattCharacteristic J;
    public BluetoothGattCharacteristic K;
    public BluetoothGattCharacteristic L;
    public BluetoothGattCharacteristic M;
    public BluetoothGattCharacteristic N;
    public BluetoothGattCharacteristic O;
    public BluetoothGattCharacteristic P;
    public BluetoothGattCharacteristic Q;
    public zr R;
    public final s3 S;
    public BleChannelLink T;

    public yus(Context context, BluetoothDevice bluetoothDevice, zh.a aVar) {
        super(context, bluetoothDevice, aVar);
        this.H = null;
        this.I = null;
        this.J = null;
        this.K = null;
        this.L = null;
        this.M = null;
        this.N = null;
        this.O = null;
        this.P = null;
        this.Q = null;
        this.R = null;
        this.S = new s3(null);
        this.T = new BleChannelLink(new i2(this), m0().getAddress());
    }

    public static /* synthetic */ String h1() {
        return "创建ble channel失败";
    }

    @Override // defpackage.jet
    public boolean B0() {
        BluetoothGattService bluetoothGattServiceP = p(ats.Wb);
        if (bluetoothGattServiceP != null) {
            BluetoothGattCharacteristic characteristic = bluetoothGattServiceP.getCharacteristic(ats.Zb);
            this.K = characteristic;
            t5t.b(characteristic);
            BluetoothGattCharacteristic characteristic2 = bluetoothGattServiceP.getCharacteristic(ats.Yb);
            this.L = characteristic2;
            t5t.b(characteristic2);
            BluetoothGattCharacteristic characteristic3 = bluetoothGattServiceP.getCharacteristic(ats.dc);
            this.N = characteristic3;
            t5t.b(characteristic3);
            BluetoothGattCharacteristic characteristic4 = bluetoothGattServiceP.getCharacteristic(ats.Xb);
            this.M = characteristic4;
            t5t.b(characteristic4);
            BluetoothGattCharacteristic characteristic5 = bluetoothGattServiceP.getCharacteristic(ats.gc);
            this.O = characteristic5;
            t5t.b(characteristic5);
        }
        BluetoothGattService bluetoothGattServiceP2 = p(ats.Vb);
        if (bluetoothGattServiceP2 == null) {
            return true;
        }
        this.P = bluetoothGattServiceP2.getCharacteristic(vdt.f36785a);
        UUID uuid = ats.hc;
        BluetoothGattCharacteristic characteristic6 = bluetoothGattServiceP2.getCharacteristic(uuid);
        this.Q = characteristic6;
        if (characteristic6 != null) {
            return true;
        }
        t5t.d("BaseProfile", uuid + " is null!");
        return true;
    }

    public boolean V0() {
        if (this.O != null) {
            return true;
        }
        t5t.d("BaseProfile", "getGeneralDeviceInfo return as Characteristics pnpId wrong!!!");
        return false;
    }

    public boolean W0() {
        if (this.K != null && this.N != null && this.M != null) {
            return true;
        }
        t5t.d("BaseProfile", "getGeneralDeviceInfo return as Characteristics  software or systemId or sn wrong!!!");
        return false;
    }

    public void X0() {
        this.S.c();
    }

    @Nullable
    public g4s Y0() {
        t5t.d("BaseProfile", "getBaseDeviceInfo do nothing");
        return null;
    }

    public g4s Z0() {
        b9t b9tVarA1 = a1();
        return b9tVarA1 != null ? new g4s(b9tVarA1, g1()) : c1();
    }

    public ubt a() {
        return null;
    }

    public b9t a1() {
        t5t.m("BaseProfile", "getGeneralDeviceInfo");
        if (!W0() || !V0()) {
            return null;
        }
        b9t b9tVar = new b9t();
        u1(b9tVar);
        w1(b9tVar);
        r1(b9tVar);
        p1(b9tVar);
        k1(b9tVar);
        if (hgt.d(this)) {
            Feature featureA = hgt.a(this);
            if (featureA == null) {
                return null;
            }
            b9tVar.b(featureA);
            featureA.hasSw(19);
        } else {
            b9tVar.b(new Feature());
        }
        t5t.d("BaseProfile", "general device info:" + b9tVar);
        return b9tVar;
    }

    @Override // defpackage.i1
    public void b(@NotNull vvs vvsVar) {
    }

    public zr b1() {
        return this.R;
    }

    public g4s c1() {
        BluetoothGattCharacteristic bluetoothGattCharacteristic = this.P;
        if (bluetoothGattCharacteristic == null) {
            return null;
        }
        byte[] bArrS0 = S0(bluetoothGattCharacteristic);
        t5t.b(bArrS0);
        if (bArrS0 == null || !(bArrS0.length == 16 || bArrS0.length == 20)) {
            return null;
        }
        t5t.m("BaseProfile", "device info ret len:" + bArrS0.length);
        int iE = tet.E(new byte[]{bArrS0[0], bArrS0[1], bArrS0[2], bArrS0[3], bArrS0[4], bArrS0[5], bArrS0[6]}) ^ (bArrS0[3] & 255);
        t5t.j(iE == (bArrS0[7] & 255));
        if (iE != (bArrS0[7] & 255)) {
            t5t.m("BaseProfile", "DeviceInfo CRC verification failed");
            return null;
        }
        byte[] bArr = new byte[8];
        System.arraycopy(bArrS0, 0, bArr, 0, 8);
        int iC = tet.c(bArrS0, 8);
        int iC2 = tet.c(bArrS0, 12);
        return bArrS0.length == 20 ? new g4s(bArr, iC, iC2, tet.c(bArrS0, 16), g1()) : new g4s(bArr, iC, iC2, g1());
    }

    public boolean d1() {
        this.T = new BleChannelLink(new i2(this), m0().getAddress());
        if (!f1()) {
            return false;
        }
        q3 q3VarA = v1.f36362a.a(this.T);
        if (q3VarA == null) {
            le.b("BaseProfile", new Function0() { // from class: nus
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return yus.h1();
                }
            });
            return false;
        }
        this.S.a(c4.f4904a.a(q3VarA, new w3(), wbt.h));
        b().a(this.S);
        return true;
    }

    public boolean e1() {
        return this.T.d();
    }

    public boolean f1() {
        return this.T.e();
    }

    public boolean g1() {
        return false;
    }

    @Override // defpackage.cq
    public ycs getRealtimeStep() {
        return v1(S0(this.H));
    }

    @Override // defpackage.jet, defpackage.iss
    public void h0() {
        super.h0();
        X0();
    }

    @Override // defpackage.h4
    @Nullable
    public e4 i() {
        if (this.S == null) {
            return null;
        }
        return new e4(this.S);
    }

    @Nullable
    public <T extends a> T i1(Class<T> cls) {
        return (T) f4.c.a(this).a(cls);
    }

    public final /* synthetic */ void j1(vvs vvsVar, byte[] bArr) {
        vvsVar.k(t1(bArr));
    }

    public void k1(b9t b9tVar) {
        byte[] bArrS1;
        BluetoothGattCharacteristic bluetoothGattCharacteristic = this.L;
        if (bluetoothGattCharacteristic == null || (bArrS1 = s1(S0(bluetoothGattCharacteristic))) == null || bArrS1.length <= 0) {
            return;
        }
        b9tVar.d = new String(bArrS1, Charset.forName("UTF-8"));
    }

    public final /* synthetic */ void l1(rft rftVar, byte[] bArr) {
        ycs ycsVarV1 = v1(bArr);
        if (ycsVarV1 != null) {
            rftVar.l(ycsVarV1);
            return;
        }
        t5t.d("BaseProfile", "m_CharRealtimeSteps notify wrong value:" + tet.x(bArr));
    }

    public void m1(zr zrVar) {
        this.R = zrVar;
    }

    public boolean n1(Calendar calendar) {
        if (this.Q == null) {
            t5t.d("BaseProfile", "setDateTime m_CharDateTime is null!!!");
            return false;
        }
        byte[] bArrBytesOfTime = ProfileUtils.bytesOfTime(calendar);
        t5t.m("BaseProfile", "cmd:" + tet.x(bArrBytesOfTime));
        return R0(this.Q, bArrBytesOfTime);
    }

    public boolean o1() {
        boolean zA0;
        BluetoothGattCharacteristic bluetoothGattCharacteristic = this.H;
        if (bluetoothGattCharacteristic == null) {
            return false;
        }
        synchronized (bluetoothGattCharacteristic) {
            zA0 = a0(this.H);
        }
        return zA0;
    }

    public void p1(b9t b9tVar) {
        byte[] bArrS0;
        BluetoothGattCharacteristic bluetoothGattCharacteristic = this.O;
        if (bluetoothGattCharacteristic == null || (bArrS0 = S0(bluetoothGattCharacteristic)) == null || bArrS0.length != 7) {
            return;
        }
        t5t.m("BaseProfile", "pnp id:" + tet.x(bArrS0));
        hws hwsVar = new hws();
        hwsVar.f20556b = bArrS0[0] & 255;
        hwsVar.f20555a = ((bArrS0[2] & 255) << 8) | (bArrS0[1] & 255);
        hwsVar.c = ((bArrS0[4] & 255) << 8) | (bArrS0[3] & 255);
        hwsVar.d = (bArrS0[5] & 255) | ((bArrS0[6] & 255) << 8);
        b9tVar.e = hwsVar;
    }

    public <T extends a> boolean q1(@NotNull Class<T> cls) {
        try {
            d4 d4Var = (d4) cls.getAnnotation(d4.class);
            if (d4Var != null) {
                return a(d4Var.id());
            }
            t5t.d("BaseProfile", cls.getCanonicalName() + " has no ChannelModule annotation");
            return false;
        } catch (Exception e) {
            t5t.d("BaseProfile", "Check if support module exception:" + e.toString());
            return false;
        }
    }

    public void r1(b9t b9tVar) {
        BluetoothGattCharacteristic bluetoothGattCharacteristic = this.M;
        if (bluetoothGattCharacteristic != null) {
            byte[] bArrS1 = s1(S0(bluetoothGattCharacteristic));
            t5t.m("BaseProfile", "serialNumber:" + tet.x(bArrS1));
            if (bArrS1 == null || bArrS1.length <= 0) {
                return;
            }
            b9tVar.f3966b = new String(bArrS1, Charset.forName("UTF-8"));
        }
    }

    @Override // defpackage.cq
    public boolean registerRealtimeStepCallback(final rft rftVar) {
        boolean zE;
        ycs realtimeStep = getRealtimeStep();
        if (realtimeStep != null) {
            rftVar.l(realtimeStep);
        } else {
            t5t.d("BaseProfile", "getRealtimeStep return null!!!");
        }
        synchronized (this.H) {
            zE = E(this.H, new zh.b() { // from class: lus
                @Override // zh.b
                public final void e(byte[] bArr) {
                    this.f25451a.l1(rftVar, bArr);
                }
            });
        }
        return zE;
    }

    public byte[] s1(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        int length = bArr.length;
        for (int length2 = bArr.length - 1; length2 >= 0 && bArr[length2] == 0; length2--) {
            length--;
        }
        if (length < 1) {
            return bArr;
        }
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    public ubt t1(byte[] bArr) {
        return null;
    }

    public void u1(b9t b9tVar) {
        BluetoothGattCharacteristic bluetoothGattCharacteristic = this.K;
        if (bluetoothGattCharacteristic != null) {
            byte[] bArrS1 = s1(S0(bluetoothGattCharacteristic));
            t5t.m("BaseProfile", "revision:" + tet.x(bArrS1));
            if (bArrS1 == null || bArrS1.length <= 0) {
                return;
            }
            b9tVar.c = new String(bArrS1, Charset.forName("UTF-8"));
        }
    }

    @Override // defpackage.cq
    public void unregisterRealtimeStepCallback(rft rftVar) {
        o1();
    }

    public ycs v1(byte[] bArr) {
        return null;
    }

    public void w1(b9t b9tVar) {
        byte[] bArrS0;
        BluetoothGattCharacteristic bluetoothGattCharacteristic = this.N;
        if (bluetoothGattCharacteristic == null || (bArrS0 = S0(bluetoothGattCharacteristic)) == null || bArrS0.length != 8) {
            return;
        }
        b9tVar.f3965a = String.format("%02X%02X%02X%02X%02X%02X%02X%02X", Byte.valueOf(bArrS0[0]), Byte.valueOf(bArrS0[1]), Byte.valueOf(bArrS0[2]), Byte.valueOf(bArrS0[3]), Byte.valueOf(bArrS0[4]), Byte.valueOf(bArrS0[5]), Byte.valueOf(bArrS0[6]), Byte.valueOf(bArrS0[7]));
        b9tVar.f = bArrS0;
    }

    @Override // defpackage.i1
    public boolean a(@NotNull final vvs vvsVar) {
        BluetoothGattCharacteristic bluetoothGattCharacteristic = this.I;
        return bluetoothGattCharacteristic != null && E(bluetoothGattCharacteristic, new zh.b() { // from class: mus
            @Override // zh.b
            public final void e(byte[] bArr) {
                this.f27237a.j1(vvsVar, bArr);
            }
        });
    }

    @Override // defpackage.h4
    @NotNull
    public g4 b() {
        return g4.f18570b.a(m0().getAddress());
    }

    @Override // defpackage.h4
    public boolean a(int i) {
        s3 s3Var = this.S;
        if (s3Var == null || s3Var.getE().getVersionCode() != 2) {
            return false;
        }
        BuiltInModule builtInModule = (BuiltInModule) i1(BuiltInModule.class);
        if (builtInModule == null) {
            t5t.d("BuiltInModule", "BuiltInModule is null while check " + i + " if supported by device");
            return false;
        }
        boolean zSupportModule = builtInModule.supportModule(i);
        t5t.d("BuiltInModule", "Is " + i + " support? " + zSupportModule);
        return zSupportModule;
    }
}
