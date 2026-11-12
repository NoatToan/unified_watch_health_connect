package defpackage;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.huami.bluetooth.profile.channel.module.connect.ConnectModule;
import com.huami.bluetooth.profile.channel.module.obsolete.ObsoleteModule;
import com.huami.bluetooth.profile.channel.module.settings.SettingsGroupType;
import com.huami.bluetooth.profile.channel.module.settings.SettingsModule;
import com.huami.bluetooth.profile.channel.module.settings.entity.language.SettingsLanguage;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.EnumData;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.Settings;
import com.huami.bluetooth.profile.ecf.data.HidStatus;
import com.huami.bluetooth.profile.ecf.data.StandAlertConfig;
import com.xiaomi.hm.health.bt.device.HMDeviceFeature;
import com.xiaomi.hm.health.bt.model.HMAutoBacklightInfo;
import com.xiaomi.hm.health.bt.model.HMLanguage;
import com.xiaomi.hm.health.bt.model.HMLiftWristConfig;
import com.xiaomi.hm.health.bt.model.HMReminderInfo;
import com.xiaomi.hm.health.bt.model.HMSedentaryConfig;
import com.xiaomi.hm.health.bt.model.HMTarget;
import com.xiaomi.hm.health.bt.profile.feature.Feature;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.HMProSyncDataBaseProfile;
import com.xiaomi.hm.health.bt.profile.milipro.model.AlarmClockExt;
import java.io.ByteArrayOutputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"NewApi"})
public class x7t extends yus implements idt, t8, z8 {
    public final short A0;
    public final short B0;
    public final short C0;
    public final short D0;
    public final short E0;
    public final short F0;
    public final short G0;
    public final short H0;
    public final short I0;
    public final short J0;
    public final short K0;
    public final short L0;
    public final short M0;
    public final short N0;
    public final short O0;
    public final int P0;
    public BluetoothGattCharacteristic Q0;
    public byte[] R0;
    public b9 S0;
    public s7 T0;
    public final String U;
    public final byte V;
    public final byte W;
    public final byte X;
    public final byte Y;
    public final byte Z;
    public final byte a0;
    public final byte b0;
    public final byte c0;
    public final byte d0;
    public final byte e0;
    public final byte f0;
    public final byte g0;
    public final byte h0;
    public final byte i0;
    public final byte j0;
    public final byte k0;
    public final byte l0;
    public final byte m0;
    public final short n0;
    public final short o0;
    public final short p0;
    public final short q0;
    public final short r0;
    public final short s0;
    public final short t0;
    public final short u0;
    public final short v0;
    public final short w0;
    public final short x0;
    public final short y0;
    public final short z0;

    public static class a implements ce {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Function0<BluetoothGattCharacteristic> f38802a;

        public a(Function0<BluetoothGattCharacteristic> function0) {
            this.f38802a = function0;
        }

        @Override // defpackage.ce
        public boolean deInit() {
            return true;
        }

        @Override // defpackage.ce
        @Nullable
        /* JADX INFO: renamed from: g */
        public BluetoothGattCharacteristic getV() {
            return this.f38802a.invoke();
        }

        @Override // defpackage.ce
        public boolean init() {
            return true;
        }
    }

    public x7t(Context context, BluetoothDevice bluetoothDevice, zh.a aVar) {
        super(context, bluetoothDevice, aVar);
        this.U = "MiLiProProfile";
        this.V = (byte) 1;
        this.W = (byte) 2;
        this.X = (byte) 3;
        this.Y = (byte) 4;
        this.Z = (byte) 5;
        this.a0 = (byte) 7;
        this.b0 = (byte) 10;
        this.c0 = (byte) 11;
        this.d0 = HMProSyncDataBaseProfile.DATA_TYPE_PAI;
        this.e0 = HMProSyncDataBaseProfile.DATA_TYPE_COACHING;
        this.f0 = (byte) 15;
        this.g0 = (byte) 16;
        this.h0 = HMProSyncDataBaseProfile.DATA_TYPE_PRESSURE_ALL_DAY;
        this.i0 = (byte) 20;
        this.j0 = (byte) 27;
        this.k0 = HMProSyncDataBaseProfile.DATA_TYPE_HEIGHT_LOW_HR;
        this.l0 = HMProSyncDataBaseProfile.DATE_TYPE_AF_ACC;
        this.m0 = (byte) 31;
        this.n0 = (short) 4;
        this.o0 = (short) 5;
        this.p0 = (short) 6;
        this.q0 = (short) 7;
        this.r0 = (short) 9;
        this.s0 = (short) 10;
        this.t0 = (short) 11;
        this.u0 = (short) 13;
        this.v0 = (short) 17;
        this.w0 = (short) 19;
        this.x0 = (short) 20;
        this.y0 = (short) 21;
        this.z0 = (short) 22;
        this.A0 = (short) 23;
        this.B0 = (short) 24;
        this.C0 = (short) 25;
        this.D0 = (short) 28;
        this.E0 = (short) 29;
        this.F0 = (short) 33;
        this.G0 = (short) 35;
        this.H0 = (short) 36;
        this.I0 = (short) 60;
        this.J0 = (short) 61;
        this.K0 = (short) 50;
        this.L0 = (short) 54;
        this.M0 = (short) 59;
        this.N0 = (short) 63;
        this.O0 = (short) 36;
        this.P0 = 57;
        this.Q0 = null;
        this.R0 = null;
        this.S0 = null;
    }

    public static /* synthetic */ String C1(ol olVar) {
        return "Query connect param failed:" + olVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void F1(AtomicBoolean atomicBoolean, CountDownLatch countDownLatch, byte[] bArr) {
        t5t.d("MiLiProProfile", "PPCP notify:" + tet.x(bArr));
        atomicBoolean.getAndSet(true);
        countDownLatch.countDown();
    }

    public static /* synthetic */ String F2() {
        return "Connect channel module is null";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i2(byte[] bArr) {
        t5t.d("MiLiProProfile", "ecf notify:" + tet.x(bArr));
        this.R0 = bArr;
        H0(this.Q0);
    }

    public final Pair<Boolean, ArrayList<HMLanguage>> A1(Feature feature) {
        SettingsModule settingsModule;
        Settings settings;
        Pair<Boolean, ArrayList<HMLanguage>> pair = new Pair<>(Boolean.FALSE, new ArrayList());
        if (feature != null) {
            boolean zHasSw = feature.hasSw(19);
            boolean zF = ((kd) this.C).F(SettingsModule.class);
            Object obj = this.C;
            if (!(obj instanceof kd) || (!(zHasSw || zF) || (settingsModule = (SettingsModule) ((kd) obj).y(SettingsModule.class)) == null)) {
                return pair;
            }
            SettingsGroupType settingsGroupType = SettingsGroupType.LANGUAGE;
            HashMap<SettingsGroupType, Settings> mapQuerySettingsSync = settingsModule.querySettingsSync(true, new SettingsGroupType[]{settingsGroupType});
            if (mapQuerySettingsSync == null || (settings = mapQuerySettingsSync.get(settingsGroupType)) == null) {
                return pair;
            }
            EnumData languageEnum = SettingsLanguage.getLanguageEnum(settings);
            ArrayList<Integer> enums = languageEnum != null ? languageEnum.getEnums() : null;
            if (enums == null) {
                return new Pair<>(Boolean.TRUE, new ArrayList());
            }
            ArrayList arrayList = new ArrayList(enums.size());
            Iterator<Integer> it = enums.iterator();
            while (it.hasNext()) {
                arrayList.add(new HMLanguage(it.next().intValue()));
            }
            return new Pair<>(Boolean.TRUE, arrayList);
        }
        return pair;
    }

    public Boolean A2() {
        if (b2()) {
            return this.R.a();
        }
        throw new IllegalStateException();
    }

    @Override // defpackage.yus, defpackage.jet
    public boolean B0() {
        super.B0();
        UUID uuid = ats.Vb;
        BluetoothGattService bluetoothGattServiceP = p(uuid);
        if (bluetoothGattServiceP == null) {
            t5t.d("MiLiProProfile", uuid + " is null!");
            return false;
        }
        UUID uuid2 = idt.qc;
        BluetoothGattCharacteristic characteristic = bluetoothGattServiceP.getCharacteristic(uuid2);
        this.I = characteristic;
        if (characteristic == null) {
            t5t.d("MiLiProProfile", uuid2 + " is null!");
            return false;
        }
        UUID uuid3 = idt.rc;
        BluetoothGattCharacteristic characteristic2 = bluetoothGattServiceP.getCharacteristic(uuid3);
        this.H = characteristic2;
        if (characteristic2 == null) {
            t5t.d("MiLiProProfile", uuid3 + " is null!");
            return false;
        }
        UUID uuid4 = idt.nc;
        BluetoothGattCharacteristic characteristic3 = bluetoothGattServiceP.getCharacteristic(uuid4);
        this.Q0 = characteristic3;
        if (characteristic3 != null) {
            return true;
        }
        t5t.d("MiLiProProfile", uuid4 + " is null!");
        return false;
    }

    public com.xiaomi.hm.health.bt.profile.base.a B1(qd qdVar) {
        if (b2()) {
            return this.R.a(qdVar);
        }
        return null;
    }

    public ArrayList<HMReminderInfo> B2() {
        tss tssVarA = a(new gks(2));
        if (tssVarA == null || !tssVarA.d()) {
            return null;
        }
        return HMReminderInfo.fromBytes(tssVarA.b());
    }

    public tss C2() {
        return a(new gks(17));
    }

    public final qe D1(byte[] bArr, int i, int i2) {
        if (a(bArr)) {
            return b(bArr, i);
        }
        synchronized (b9.f3931a.a()) {
            try {
                BluetoothGattCharacteristic bluetoothGattCharacteristic = this.Q0;
                if (bluetoothGattCharacteristic == null) {
                    return null;
                }
                if (!E(bluetoothGattCharacteristic, new zh.b() { // from class: s7t
                    @Override // zh.b
                    public final void e(byte[] bArr2) {
                        this.f33386a.i2(bArr2);
                    }
                })) {
                    return null;
                }
                this.R0 = null;
                t5t.d("MiLiProProfile", "ecf cmd: " + tet.x(bArr));
                if (!R0(this.Q0, bArr)) {
                    t5t.d("MiLiProProfile", "ecf cmd failed!");
                    return null;
                }
                if (this.R0 == null) {
                    I0(this.Q0, i2);
                }
                a0(this.Q0);
                return qe.h(this.R0, i);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public List<Integer> D2() {
        s7 s7VarH2 = h2();
        List<Integer> arrayList = s7VarH2 == null ? new ArrayList<>() : s7VarH2.b();
        t5t.d("MiLiProProfile", "getWatchFacesAll Ids: " + g9s.a(arrayList));
        return arrayList;
    }

    @Override // defpackage.jet
    public boolean E0() {
        return false;
    }

    public final void E1(g4s g4sVar) {
        if (g4sVar == null || g4sVar.A() == null) {
            return;
        }
        Feature featureA = g4sVar.A();
        qd qdVarI = g4sVar.I();
        Pair<Boolean, ArrayList<HMLanguage>> pairA1 = A1(featureA);
        boolean zHasSw = featureA.hasSw(0);
        g4sVar.k0().b(((Boolean) pairA1.first).booleanValue());
        g4sVar.k0().a(zHasSw);
        if (g4sVar.k0().d()) {
            ArrayList<HMLanguage> arrayListP2 = ((Boolean) pairA1.first).booleanValue() ? (ArrayList) pairA1.second : p2();
            LanguageComBination languageComBinationK0 = g4sVar.k0();
            if (arrayListP2 == null) {
                arrayListP2 = new ArrayList<>();
            }
            languageComBinationK0.a(arrayListP2);
        }
        if (g4sVar.k0().d() || HMDeviceFeature.SET_LANGUAGE_S.contains(qdVarI)) {
            return;
        }
        U1(HMLanguage.getLanguageStr(Locale.getDefault()));
    }

    public final /* synthetic */ BluetoothGattCharacteristic E2() {
        return this.Q0;
    }

    public boolean G1(byte b2) {
        qe qeVarA = a(new byte[]{6, 20, 0, b2}, 3);
        return qeVarA != null && qeVarA.d((byte) 6);
    }

    public boolean H1(long j, long j2) {
        s7 s7VarH2 = h2();
        boolean zA = s7VarH2 == null ? false : s7VarH2.a((int) j2, j);
        t5t.d("MiLiProProfile", "getStorageState:result:" + zA);
        return zA;
    }

    public boolean I1(HidStatus hidStatus) {
        if (hidStatus != null && b2()) {
            return this.R.a(hidStatus);
        }
        return false;
    }

    public boolean J1(StandAlertConfig standAlertConfig) {
        if (b2()) {
            return this.R.a(standAlertConfig);
        }
        return false;
    }

    @Override // defpackage.jet
    public boolean K0(int i, int i2, int i3, int i4, int i5) {
        BluetoothGattCharacteristic characteristic;
        BluetoothGattService bluetoothGattServiceP = p(ats.Vb);
        if (bluetoothGattServiceP == null || (characteristic = bluetoothGattServiceP.getCharacteristic(ats.ic)) == null) {
            return false;
        }
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        if (!E(characteristic, new zh.b() { // from class: w7t
            @Override // zh.b
            public final void e(byte[] bArr) {
                this.f37704a.F1(atomicBoolean, countDownLatch, bArr);
            }
        })) {
            return false;
        }
        if (R0(characteristic, new byte[]{(byte) (i & 255), (byte) ((i >> 8) & 255), (byte) (i2 & 255), (byte) ((i2 >> 8) & 255), (byte) (i3 & 255), (byte) ((i3 >> 8) & 255), (byte) (i4 & 255), (byte) ((i4 >> 8) & 255)})) {
            try {
                countDownLatch.await(5000L, TimeUnit.MILLISECONDS);
            } catch (Exception unused) {
            }
        }
        a0(characteristic);
        return atomicBoolean.get();
    }

    public boolean K1(HMAutoBacklightInfo hMAutoBacklightInfo) {
        if (hMAutoBacklightInfo != null && b2()) {
            return this.R.a(hMAutoBacklightInfo);
        }
        return false;
    }

    public boolean L1(HMLanguage hMLanguage) {
        qe qeVarA = a(new byte[]{6, 59, 0, (byte) hMLanguage.getLanguage()}, 3);
        return qeVarA != null && qeVarA.d((byte) 6);
    }

    public boolean M1(HMLiftWristConfig hMLiftWristConfig) {
        byte[] bArr = new byte[8];
        bArr[0] = 6;
        bArr[1] = 5;
        bArr[2] = 0;
        bArr[3] = hMLiftWristConfig.isEnable() ? (byte) 1 : (byte) 0;
        if (hMLiftWristConfig.isAllDay()) {
            bArr[4] = 0;
            bArr[5] = 0;
            bArr[6] = 0;
            bArr[7] = 0;
        } else {
            bArr[4] = (byte) hMLiftWristConfig.getStartHour();
            bArr[5] = (byte) hMLiftWristConfig.getStartMinutes();
            bArr[6] = (byte) hMLiftWristConfig.getStopHour();
            bArr[7] = (byte) hMLiftWristConfig.getStopMinutes();
        }
        qe qeVarA = a(bArr, 3);
        return qeVarA != null && qeVarA.d((byte) 6);
    }

    public boolean N1(HMReminderInfo hMReminderInfo, int i) {
        if (hMReminderInfo == null) {
            return false;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(11);
            byteArrayOutputStream.write(hMReminderInfo.toBleBytes(i));
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (C0()) {
                return O0(byteArray, 2);
            }
        } catch (Exception unused) {
        }
        return false;
    }

    @Override // defpackage.jet
    public boolean O0(byte[] bArr, int i) {
        return k2(bArr, i) ? g2(bArr, i) : super.O0(bArr, i);
    }

    public boolean O1(HMSedentaryConfig hMSedentaryConfig) {
        if (hMSedentaryConfig == null) {
            return false;
        }
        byte[] bArr = {8, hMSedentaryConfig.isEnable(), (byte) (hMSedentaryConfig.getInterval() & 255), (byte) ((hMSedentaryConfig.getInterval() >> 8) & 255), hMSedentaryConfig.getStartHour(), hMSedentaryConfig.getStartMinutes(), hMSedentaryConfig.getStopHour(), hMSedentaryConfig.getStopMinutes(), hMSedentaryConfig.getStartHour2(), hMSedentaryConfig.getStartMinutes2(), hMSedentaryConfig.getStopHour2(), hMSedentaryConfig.getStopMinutes2()};
        qe qeVarB = b(bArr);
        boolean z = qeVarB != null && qeVarB.d((byte) 8);
        t5t.d("MiLiProProfile", "setSedentaryRemind cmd = " + tet.x(bArr) + "; result = " + z);
        return z;
    }

    public boolean P1(HMTarget hMTarget) {
        t5t.d("MiLiProProfile", "setTargets: " + hMTarget);
        if (!b2()) {
            return false;
        }
        SettingsModule settingsModule = (SettingsModule) i1(SettingsModule.class);
        return this.R.a(hMTarget, settingsModule != null ? settingsModule.getVersion() : null);
    }

    public final boolean Q1(Feature feature, ews ewsVar) {
        if (ewsVar.a() == 26) {
            return feature != null && feature.hasSw(1);
        }
        return true;
    }

    public boolean R1(Feature feature, List<ews> list) {
        if (list == null || list.size() == 0) {
            return false;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(30);
        for (ews ewsVar : list) {
            if (Q1(feature, ewsVar)) {
                byteArrayOutputStream.write(ewsVar.c());
                byteArrayOutputStream.write(ewsVar.b());
                byteArrayOutputStream.write(ewsVar.d());
                byteArrayOutputStream.write(ewsVar.a());
            }
        }
        return O0(byteArrayOutputStream.toByteArray(), 2);
    }

    public boolean S1(AlarmClockExt alarmClockExt) {
        byte[] bytes = alarmClockExt.getBytes();
        byte[] bArr = {2, bytes[0], bytes[1], bytes[2], bytes[3]};
        t5t.m("MiLiProProfile", "cmd:" + tet.x(bArr));
        qe qeVarB = b(bArr);
        return qeVarB != null && qeVarB.d((byte) 2);
    }

    public boolean T1(fd fdVar, boolean z) {
        if (b2()) {
            return this.R.a(fdVar, z);
        }
        return false;
    }

    public boolean U1(String str) {
        t5t.d("MiLiProProfile", "setLanguageNew:" + str);
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        int length = str.getBytes().length;
        byte[] bArr = new byte[length + 3];
        bArr[0] = 6;
        bArr[1] = 23;
        bArr[2] = 0;
        System.arraycopy(str.getBytes(), 0, bArr, 3, length);
        qe qeVarA = a(bArr, 3);
        return qeVarA != null && qeVarA.d((byte) 6);
    }

    public boolean V1(List<Integer> list) {
        s7 s7VarH2 = h2();
        boolean zA = s7VarH2 == null ? false : s7VarH2.a(list);
        t5t.d("MiLiProProfile", "deleteDials [" + g9s.a(list) + "], Success: " + zA);
        return zA;
    }

    public boolean W1(boolean z, String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(6);
        byteArrayOutputStream.write(33);
        byteArrayOutputStream.write(0);
        byteArrayOutputStream.write(z ? 1 : 0);
        if (!TextUtils.isEmpty(str)) {
            byteArrayOutputStream.write(str.getBytes(), 0, str.getBytes().length);
        }
        byteArrayOutputStream.write(0);
        qe qeVarA = a(byteArrayOutputStream.toByteArray(), 3);
        return qeVarA != null && qeVarA.d((byte) 6);
    }

    @Nullable
    public tss X1(@NotNull gks gksVar) {
        ObsoleteModule obsoleteModule = (ObsoleteModule) i1(ObsoleteModule.class);
        if (obsoleteModule == null) {
            return null;
        }
        return obsoleteModule.getObsoleteApi().a(gksVar);
    }

    @Override // defpackage.yus
    public g4s Y0() {
        b9t b9tVarA1 = a1();
        if (b9tVarA1 == null) {
            return null;
        }
        return new g4s(b9tVarA1);
    }

    public final qe Y1(jq.a aVar, byte[] bArr) {
        jq jqVar = new jq(aVar, bArr);
        return a(jqVar.getF23009a(), jqVar.getF23010b());
    }

    @Override // defpackage.yus
    public g4s Z0() {
        g4s g4sVarY0 = Y0();
        if (g4sVarY0 == null) {
            return null;
        }
        Z1(g4sVarY0);
        return g4sVarY0;
    }

    public void Z1(g4s g4sVar) {
        if (g4sVar == null) {
            return;
        }
        qd qdVarI = g4sVar.I();
        E1(g4sVar);
        com.xiaomi.hm.health.bt.profile.base.a aVarB1 = B1(g4sVar.I());
        g4sVar.D(aVarB1);
        if (op.a().a(qdVarI)) {
            if (aVarB1 == null || !(this.R instanceof cs)) {
                g4sVar.E(n2());
            } else {
                g4sVar.E(aVarB1.f());
            }
        }
        if (wbt.c) {
            int iW2 = w2();
            t5t.d("MiLiProProfile", "ATT MTU size:" + iW2);
            y0().b(iW2);
        }
        new defpackage.a().a(this, g4sVar);
        if (HMDeviceFeature.hasFeatureJHS(qdVarI)) {
            try {
                g4sVar.C(u2());
            } catch (Exception unused) {
                t5t.d("MiLiProProfile", "Get medical version failed");
            }
        }
    }

    @Override // defpackage.yus, defpackage.i1
    public ubt a() {
        BluetoothGattCharacteristic bluetoothGattCharacteristic = this.I;
        if (bluetoothGattCharacteristic == null) {
            return null;
        }
        return t1(S0(bluetoothGattCharacteristic));
    }

    public boolean a2(byte b2) {
        qe qeVarA = a(new byte[]{6, 25, 0, b2}, 3);
        return qeVarA != null && qeVarA.d((byte) 6);
    }

    @Override // defpackage.z8
    public qe b(byte[] bArr) {
        return a(bArr, 1);
    }

    public final boolean b2() {
        if (this.R != null) {
            return true;
        }
        t5t.d("MiLiProProfile", "settingsApi null");
        return false;
    }

    @Override // defpackage.z8
    public boolean c(byte[] bArr, int i) {
        return O0(bArr, i);
    }

    public boolean c2(@NotNull gks gksVar) {
        return a(144);
    }

    public ArrayList<AlarmClockExt> d2() {
        tss tssVarA = a(new gks(1));
        if (tssVarA == null || !tssVarA.d()) {
            return null;
        }
        return AlarmClockExt.fromBytes(tssVarA.b());
    }

    public ket e2() {
        byte[] bArrI;
        qe qeVarB = b(new byte[]{HMProSyncDataBaseProfile.DATA_TYPE_PAI});
        ket ketVar = null;
        if (qeVarB != null && qeVarB.d(HMProSyncDataBaseProfile.DATA_TYPE_PAI) && (bArrI = qeVarB.i()) != null) {
            int i = 5;
            if (bArrI.length >= 5) {
                t5t.m("MiLiProProfile", "settings:" + tet.x(bArrI));
                ketVar = new ket();
                int i2 = bArrI[0] & 255;
                t5t.m("MiLiProProfile", "version:" + i2);
                short s = (short) ((bArrI[1] & 255) | ((bArrI[2] & 255) << 8));
                ketVar.o((s & 1) == 1);
                ketVar.m(((s >> 1) & 1) == 1);
                ketVar.g(((s >> 2) & 1) == 1);
                ketVar.j((s >> 3) & 15);
                ketVar.f((s >> 7) & 3);
                if (i2 >= 2) {
                    ketVar.d(((s >> 9) & 1) == 1);
                    ketVar.k(((s >> 10) & 1) == 1);
                    ketVar.n(((s >> 11) & 1) == 1);
                    ketVar.i(((s >> 12) & 1) == 1);
                    ketVar.b((s >> 13) & 7);
                }
                ketVar.l(bArrI[3] & 255);
                if (i2 >= 3) {
                    ketVar.h(bArrI[4] & 255);
                } else {
                    i = 4;
                }
                int i3 = i + 1;
                int i4 = bArrI[i] & 255;
                if (i4 > 0) {
                    ArrayList<ket.a> arrayList = new ArrayList<>(i4);
                    for (int i5 = 0; i5 < i4; i5++) {
                        byte b2 = bArrI[i3 + i5];
                        arrayList.add(new ket.a(b2 & 15, ((b2 >> 4) & 1) == 1));
                    }
                    ketVar.c(arrayList);
                }
                t5t.m("MiLiProProfile", "settings:" + ketVar);
            }
        }
        return ketVar;
    }

    @Override // defpackage.z8
    public b9 f() {
        if (this.S0 == null) {
            this.S0 = new c9(new nd(new a(new Function0() { // from class: t7t
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return this.f34437a.E2();
                }
            }), this), this);
        }
        return this.S0;
    }

    public boolean f2(boolean z) {
        if (b2()) {
            return this.R.i(z);
        }
        return false;
    }

    public boolean g2(@NotNull byte[] bArr, int i) {
        ObsoleteModule obsoleteModule = (ObsoleteModule) i1(ObsoleteModule.class);
        if (obsoleteModule == null) {
            return false;
        }
        return obsoleteModule.getObsoleteApi().b(bArr, i);
    }

    public final s7 h2() {
        if (this.T0 == null) {
            this.T0 = t7.f34399a.a(this);
        }
        return this.T0;
    }

    public boolean j2(boolean z) {
        if (b2()) {
            return this.R.g(z);
        }
        return false;
    }

    public boolean k2(@NotNull byte[] bArr, int i) {
        return a(144);
    }

    public DialVersion l2() {
        return h2().a();
    }

    public boolean m2(boolean z) {
        qe qeVarA = a(new byte[]{6, 6, 0, z ? (byte) 1 : (byte) 0}, 3);
        return qeVarA != null && qeVarA.d((byte) 6);
    }

    public String n2() {
        byte[] bArrI;
        qe qeVarB = b(new byte[]{HMProSyncDataBaseProfile.DATA_TYPE_COACHING});
        t5t.d("MiLiProProfile", "getGpsVersion:" + qeVarB);
        if (qeVarB == null || !qeVarB.d(HMProSyncDataBaseProfile.DATA_TYPE_COACHING) || (bArrI = qeVarB.i()) == null || bArrI.length == 0) {
            return null;
        }
        if (bArrI.length != 1) {
            return new String(bArrI, Charset.forName("UTF-8"));
        }
        if ((bArrI[0] & 255) == 255) {
            return "-1";
        }
        return null;
    }

    public boolean o2(boolean z) {
        if (b2()) {
            return this.R.f(z);
        }
        return false;
    }

    public final ArrayList<HMLanguage> p2() {
        byte[] bArrB;
        tss tssVarA = a(new gks(14));
        if (tssVarA == null || !tssVarA.d() || (bArrB = tssVarA.b()) == null || bArrB.length == 0) {
            return null;
        }
        ArrayList<HMLanguage> arrayList = new ArrayList<>(bArrB.length);
        for (byte b2 : bArrB) {
            arrayList.add(new HMLanguage(b2 & 255));
        }
        return arrayList;
    }

    public boolean q2(int i) {
        return this.R.a(i);
    }

    public boolean r2(boolean z) {
        if (b2()) {
            return this.R.m(z);
        }
        return false;
    }

    public Boolean s2() {
        return this.R.e();
    }

    @Override // defpackage.yus
    public ubt t1(byte[] bArr) {
        t5t.d("MiLiProProfile", "parseBatteryInfo:" + tet.x(bArr));
        return ubt.b(bArr);
    }

    public boolean t2(boolean z) {
        if (b2()) {
            return this.R.c(z);
        }
        return false;
    }

    public MedicalRegisterVersion u2() {
        tss tssVarA = a(new gks(22));
        if (tssVarA != null && tssVarA.d()) {
            byte[] bArrB = tssVarA.b();
            t5t.d("MiLiProProfile", "medical register version info data = " + tet.x(bArrB));
            if (bArrB != null && bArrB.length != 0) {
                return MedicalRegisterVersion.d.a(bArrB);
            }
        }
        return null;
    }

    @Override // defpackage.yus
    public ycs v1(byte[] bArr) {
        if (bArr != null && bArr.length >= 5) {
            return ycs.b(bArr);
        }
        t5t.d("MiLiProProfile", "parseRealtimeStep failed as wrong value : " + tet.x(bArr));
        return null;
    }

    public boolean v2(boolean z) {
        qe qeVarA = a(new byte[]{6, 5, 0, z ? (byte) 1 : (byte) 0}, 3);
        return qeVarA != null && qeVarA.d((byte) 6);
    }

    public final int w2() {
        if (!q1(ConnectModule.class)) {
            return y2();
        }
        ConnectModule connectModule = (ConnectModule) i1(ConnectModule.class);
        if (connectModule == null) {
            le.c("MiLiProProfile", new Function0() { // from class: u7t
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return x7t.F2();
                }
            });
            return -1;
        }
        final ol<ConnectParam> olVarQueryConnectParam = connectModule.queryConnectParam();
        if (olVarQueryConnectParam instanceof fu) {
            return ((ConnectParam) ((fu) olVarQueryConnectParam).a()).getMtu();
        }
        le.c("MiLiProProfile", new Function0() { // from class: v7t
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return x7t.C1(olVarQueryConnectParam);
            }
        });
        return -1;
    }

    @Override // defpackage.jet
    public yet x0() {
        BluetoothGattCharacteristic characteristic;
        byte[] bArrS0;
        BluetoothGattService bluetoothGattServiceP = p(ats.Vb);
        if (bluetoothGattServiceP == null || (characteristic = bluetoothGattServiceP.getCharacteristic(ats.ic)) == null || (bArrS0 = S0(characteristic)) == null || bArrS0.length != 8) {
            return null;
        }
        return new yet((bArrS0[0] & 255) | ((bArrS0[1] & 255) << 8), (bArrS0[2] & 255) | ((bArrS0[3] & 255) << 8), (bArrS0[4] & 255) | ((bArrS0[5] & 255) << 8), ((bArrS0[7] & 255) << 8) | (bArrS0[6] & 255));
    }

    public boolean x2(boolean z) {
        if (b2()) {
            return this.R.b(z);
        }
        return false;
    }

    public final int y2() {
        byte[] bArrI;
        qe qeVarB = b(new byte[]{HMProSyncDataBaseProfile.DATA_TYPE_PRESSURE_ALL_DAY});
        if (qeVarB == null || !qeVarB.d(HMProSyncDataBaseProfile.DATA_TYPE_PRESSURE_ALL_DAY) || (bArrI = qeVarB.i()) == null || bArrI.length != 2) {
            return -1;
        }
        return ((bArrI[1] & 255) << 8) | (bArrI[0] & 255);
    }

    public boolean z2(boolean z) {
        if (b2()) {
            return this.R.k(z);
        }
        return false;
    }

    @Override // defpackage.t8
    @Nullable
    public qe b(@NotNull byte[] bArr, int i) {
        ObsoleteModule obsoleteModule = (ObsoleteModule) i1(ObsoleteModule.class);
        if (obsoleteModule == null) {
            return null;
        }
        return obsoleteModule.getObsoleteApi().a(bArr, i);
    }

    @Override // defpackage.z8
    public boolean a(jq.a aVar, byte[] bArr) {
        qe qeVarY1 = Y1(aVar, bArr);
        return qeVarY1 != null && qeVarY1.k();
    }

    @Override // defpackage.z8
    public tss a(gks gksVar) {
        synchronized (b9.f3931a.a()) {
            try {
                if (c2(gksVar)) {
                    return X1(gksVar);
                }
                return mos.a(this, this.Q0, gksVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.z8
    public qe a(byte[] bArr, int i) {
        return D1(bArr, i, 5000);
    }

    @Override // defpackage.t8
    public boolean a(@NotNull byte[] bArr) {
        byte b2 = bArr[0];
        if (b2 == 4 || b2 == 17 || b2 == 12 || b2 == 31 || b2 == 33) {
            return false;
        }
        return a(144);
    }
}
