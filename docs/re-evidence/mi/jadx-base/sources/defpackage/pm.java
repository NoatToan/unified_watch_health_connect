package defpackage;

import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import androidx.health.connect.client.records.CervicalMucusRecord;
import com.miui.circulate.device.api.Constant;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.onetrack.b.e;
import java.io.ByteArrayOutputStream;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001/B\u000f\u0012\u0006\u0010C\u001a\u00020B¢\u0006\u0004\bD\u0010EJ\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\b\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u000e\u001a\u0004\u0018\u00010\t2\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u000e\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0018\u0010\u0015J\u0017\u0010\u001a\u001a\u00020\u00132\b\u0010\u0019\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001c\u0010\u0015J\u000f\u0010\u001d\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001d\u0010\u0015J\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\u001d\u001a\u00020\"2\u0006\u0010!\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001d\u0010#JA\u0010/\u001a\u00020.2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\f2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020\f2\u0006\u0010+\u001a\u00020*2\b\u0010-\u001a\u0004\u0018\u00010,H\u0016¢\u0006\u0004\b/\u00100J\u0017\u0010/\u001a\u0002022\u0006\u00101\u001a\u00020\u0013H\u0016¢\u0006\u0004\b/\u00103J\u0017\u00105\u001a\u00020\u00132\u0006\u00104\u001a\u00020\u0003H\u0016¢\u0006\u0004\b5\u0010\u001bJ\u000f\u00107\u001a\u000206H\u0016¢\u0006\u0004\b7\u00108J\u000f\u0010\u001a\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001a\u0010\u0015J\u0011\u0010\u0006\u001a\u0004\u0018\u000109H\u0016¢\u0006\u0004\b\u0006\u0010:J\u000f\u0010/\u001a\u00020\u0013H\u0016¢\u0006\u0004\b/\u0010\u0015J\u0019\u0010\u001d\u001a\u0004\u0018\u00010;2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001d\u0010<J\u000f\u0010=\u001a\u00020\fH\u0016¢\u0006\u0004\b=\u0010>J\u0011\u0010@\u001a\u0004\u0018\u00010?H\u0016¢\u0006\u0004\b@\u0010AJ\u000f\u0010\u000e\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010>¨\u0006F"}, d2 = {"Lpm;", "La6t;", "Lk7;", "", "value", "", PluginDeviceInfo.FBLUETOOTHPAIR, "([B)V", "cmd", "Lqe;", PluginDeviceInfo.FLOCALIZATIONS, "([B)Lqe;", "", "timeout", PluginDeviceInfo.FICONON, "([BI)Lqe;", e.f13808a, "()V", CervicalMucusRecord.Appearance.CLEAR, "", "m", "()Z", "running", "(Z)V", "init", "data", "h", "([B)Z", "deInit", PluginDeviceInfo.FDESC, "Lo7;", "j", "()Lo7;", "inDfu", "Lpv;", "(Z)Lpv;", "Lyd;", "firmwareType", "firmwareSize", "", "firmwareCRC32", "chunkSize", "Lnv;", "mode", "Lo5;", "continueModeExtraInfo", "Lhp;", PluginDeviceInfo.FMODEL, "(Lyd;IJILnv;Lo5;)Lhp;", "fromBreakpoint", "Lvt;", "(Z)Lvt;", "byteArray", PluginDeviceInfo.FICONOFF, "Ldv;", Constant.KeyValue.KEY_COLUMN, "()Ldv;", "Lwv;", "()Lwv;", "Lov;", "(I)Lov;", PluginDeviceInfo.FICONOFFLINE, "()I", "Lyet;", "getLEParams", "()Lyet;", "Ljet;", "gattPeripheral", "<init>", "(Ljet;)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class pm extends a6t implements k7 {

    @NotNull
    public static final a I = new a(null);

    @Nullable
    public BluetoothGattCharacteristic A;
    public int B;

    @NotNull
    public final Object C;

    @NotNull
    public final Object D;

    @Nullable
    public volatile zh.b E;

    @NotNull
    public final AtomicReference<TransferContinueResponse> F;

    @Nullable
    public volatile ValidateResponse G;

    @Nullable
    public volatile UpgradeResponse H;

    @NotNull
    public final jet t;

    @NotNull
    public final AtomicInteger u;
    public volatile boolean v;
    public final UUID w;
    public final UUID x;
    public final UUID y;

    @Nullable
    public BluetoothGattCharacteristic z;

    @Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0004R\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004¨\u0006\u0011"}, d2 = {"Lpm$a;", "", "", "CONTINUE_TRANSFER", "I", "PREPARE_TRANSFER", "PROTOCOL_INFO_QUERY", "QUERY_STATUS", "START_TRANSFER", "", "TAG", "Ljava/lang/String;", "UPGRADE", "VALIDATE", "VALIDATE_TIMEOUT", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pm(@NotNull jet gattPeripheral) {
        super(gattPeripheral);
        Intrinsics.checkNotNullParameter(gattPeripheral, "gattPeripheral");
        this.t = gattPeripheral;
        this.u = new AtomicInteger(0);
        this.w = tet.C(5424);
        this.x = tet.C(5425);
        this.y = tet.C(5426);
        this.B = 1;
        this.C = new Object();
        this.D = new Object();
        this.F = new AtomicReference<>(null);
    }

    public static final void a(pm this$0, byte[] bArr) {
        zh.b bVar;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        t5t.d("NewDfuProfile", "cpt response: " + tet.x(bArr));
        if (bArr != null && bArr[0] == 16 && bArr[1] == -44) {
            this$0.f(y2.b(bArr));
            this$0.watingNotify(this$0.A);
            return;
        }
        if (bArr != null && bArr.length == 3 && bArr[0] == 16 && bArr[1] == -43) {
            this$0.G = new ValidateResponse(bArr[2] & 255);
            ValidateResponse validateResponse = this$0.G;
            if (validateResponse != null) {
                this$0.B = validateResponse.getCode();
            }
            this$0.watingNotify(this$0.C);
            return;
        }
        if (bArr != null && bArr.length == 3 && bArr[0] == 16 && bArr[1] == -42) {
            this$0.H = new UpgradeResponse(bArr[2] & 255);
            this$0.watingNotify(this$0.D);
            return;
        }
        if (bArr != null && bArr.length == 3 && bArr[0] == 16 && bArr[1] == -45) {
            this$0.B = bArr[2] & 255;
        }
        if (this$0.E == null || (bVar = this$0.E) == null) {
            return;
        }
        bVar.e(bArr);
    }

    @Override // defpackage.k7
    public boolean b() {
        return init();
    }

    @Override // defpackage.k7
    public void c(boolean running) {
        this.v = running;
    }

    @Override // defpackage.k7
    public synchronized void clear() {
        this.B = 1;
        this.u.set(0);
        deInit();
    }

    @Override // defpackage.k7
    public boolean d(@NotNull byte[] byteArray) {
        Intrinsics.checkNotNullParameter(byteArray, "byteArray");
        return h(byteArray);
    }

    @Override // defpackage.a6t
    public synchronized boolean deInit() {
        try {
            t5t.d("NewDfuProfile", "deInit, referenceCount: " + this.u);
            if (this.u.get() > 0) {
                this.u.decrementAndGet();
            }
            if (this.u.get() > 0) {
                return false;
            }
            t5t.d("NewDfuProfile", "deInit");
            BluetoothGattCharacteristic bluetoothGattCharacteristic = this.z;
            if (bluetoothGattCharacteristic != null) {
                unregisterNotification(bluetoothGattCharacteristic);
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.k7
    public int e() {
        return getMtu().d();
    }

    public final void f(byte[] value) {
        d3 d3Var = new d3(value);
        this.F.set(new TransferContinueResponse(d3.a(d3Var, 0, 1, (Object) null), d3Var.d(-1), d3Var.a(-1)));
    }

    public final qe g(byte[] cmd) {
        return c(cmd, 15000);
    }

    @Override // defpackage.a6t
    @Nullable
    public yet getLEParams() {
        return this.t.x0();
    }

    public final boolean h(@Nullable byte[] data) {
        return write(this.A, data);
    }

    @Override // defpackage.a6t
    public synchronized boolean init() {
        t5t.d("NewDfuProfile", "init, referenceCount: " + this.u);
        if (this.u.get() >= 1) {
            this.u.incrementAndGet();
            return true;
        }
        this.B = 1;
        BluetoothGattService it = getService(this.w);
        Intrinsics.checkNotNullExpressionValue(it, "it");
        if (it == null) {
            t5t.d("NewDfuProfile", "service dfu is null!!!");
            return false;
        }
        BluetoothGattCharacteristic characteristic = it.getCharacteristic(this.x);
        this.z = characteristic;
        if (characteristic == null) {
            t5t.d("NewDfuProfile", "BluetoothGattCharacteristic cpt is null!!!");
            return false;
        }
        if (!registerNotification(characteristic, new zh.b() { // from class: sct
            @Override // zh.b
            public final void e(byte[] bArr) {
                pm.a(this.f33519a, bArr);
            }
        })) {
            t5t.d("NewDfuProfile", "registerNotification for cpt failed!!!");
            return false;
        }
        BluetoothGattCharacteristic characteristic2 = it.getCharacteristic(this.y);
        this.A = characteristic2;
        if (characteristic2 == null) {
            t5t.d("NewDfuProfile", "BluetoothGattCharacteristic pkt is null!!!");
            return false;
        }
        this.F.set(null);
        this.u.incrementAndGet();
        return true;
    }

    @Override // defpackage.k7
    @NotNull
    public DfuProtocolInfo j() throws Exception {
        qe qeVarG = g(new byte[]{-48});
        if (qeVarG == null) {
            throw new Exception("Query protocol failed");
        }
        t5t.d("NewDfuProfile", "response:" + qeVarG);
        byte[] bArrI = qeVarG.i();
        if (bArrI == null) {
            bArrI = new byte[0];
        }
        d3 d3Var = new d3(bArrI);
        return new DfuProtocolInfo(qeVarG.f() & 255, d3.d(d3Var, 0, 1, null), d3.c(d3Var, 0, 1, null), d3.d(d3Var, 0, 1, null));
    }

    @Override // defpackage.k7
    @NotNull
    public TransferContinueResponse k() {
        if (this.F.get() == null) {
            waiting(this.A, 15000);
        }
        TransferContinueResponse transferContinueResponse = this.F.get();
        t5t.d("NewDfuProfile", "notifySize:" + transferContinueResponse);
        this.F.set(null);
        return transferContinueResponse == null ? new TransferContinueResponse(-1, -1, -1) : transferContinueResponse;
    }

    public final void l() {
        this.H = null;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public boolean getV() {
        return this.v;
    }

    @Override // defpackage.k7
    @NotNull
    public UpgradeStatueResponse b(boolean inDfu) throws Exception {
        t5t.d("NewDfuProfile", "inDfu: " + inDfu + ", isRunning: " + getV());
        if (!inDfu && getV()) {
            return new UpgradeStatueResponse(1, UpgradeStatus.DFU_RUNNING, 0, 0, 0);
        }
        qe qeVarG = g(new byte[]{-47});
        if (qeVarG == null) {
            throw new Exception("Query status failed");
        }
        t5t.d("NewDfuProfile", "response:" + qeVarG);
        byte[] bArrI = qeVarG.i();
        if (bArrI == null) {
            bArrI = new byte[0];
        }
        d3 d3Var = new d3(bArrI);
        return new UpgradeStatueResponse(qeVarG.f() & 255, UpgradeStatus.v.a(d3.d(d3Var, 0, 1, null)), d3.d(d3Var, 0, 1, null), d3.a(d3Var, 0, 1, (Object) null), d3.a(d3Var, 0, 1, (Object) null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final qe c(byte[] cmd, int timeout) {
        t5t.m("NewDfuProfile", "sendCommand:" + tet.x(cmd));
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        this.E = new zh.b() { // from class: rct
            @Override // zh.b
            public final void e(byte[] bArr) {
                pm.a(objectRef, countDownLatch, bArr);
            }
        };
        try {
            if (write(this.z, cmd)) {
                countDownLatch.await(timeout, TimeUnit.MILLISECONDS);
            }
        } catch (Exception e) {
            t5t.d("NewDfuProfile", "sendCommand exception:" + e.getMessage());
        }
        this.E = null;
        return (qe) objectRef.element;
    }

    @Override // defpackage.k7
    public boolean h() {
        return write(this.z, new byte[]{-43});
    }

    @Override // defpackage.k7
    @Nullable
    public ValidateResponse f() {
        if (this.G == null) {
            waiting(this.C, 15000);
        }
        ValidateResponse validateResponse = this.G;
        this.G = null;
        t5t.d("NewDfuProfile", String.valueOf(validateResponse));
        return validateResponse;
    }

    @Override // defpackage.k7
    @Nullable
    public UpgradeResponse b(int timeout) {
        if (this.H == null) {
            waiting(this.D, timeout);
        }
        UpgradeResponse upgradeResponse = this.H;
        this.H = null;
        t5t.d("NewDfuProfile", String.valueOf(upgradeResponse));
        return upgradeResponse;
    }

    @Override // defpackage.k7
    /* JADX INFO: renamed from: c, reason: from getter */
    public int getB() {
        return this.B;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [T, qe] */
    public static final void a(Ref.ObjectRef response, CountDownLatch latch, byte[] bArr) {
        Intrinsics.checkNotNullParameter(response, "$response");
        Intrinsics.checkNotNullParameter(latch, "$latch");
        ?? qeVar = new qe();
        qeVar.b(bArr);
        response.element = qeVar;
        latch.countDown();
    }

    @Override // defpackage.k7
    @NotNull
    public PrepareResponse a(@NotNull yd firmwareType, int firmwareSize, long firmwareCRC32, int chunkSize, @NotNull nv mode, @Nullable o5 continueModeExtraInfo) throws Exception {
        Intrinsics.checkNotNullParameter(firmwareType, "firmwareType");
        Intrinsics.checkNotNullParameter(mode, "mode");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = {-46, firmwareType.a()};
        byte[] bArrP = tet.p(firmwareSize);
        Intrinsics.checkNotNullExpressionValue(bArrP, "intToBytes(firmwareSize)");
        byte[] bArrPlus = ArraysKt___ArraysJvmKt.plus(bArr, bArrP);
        byte[] bArrR = tet.r(firmwareCRC32, 4);
        Intrinsics.checkNotNullExpressionValue(bArrR, "numberToBytes(firmwareCRC32, 4)");
        byte[] bArrPlus2 = ArraysKt___ArraysJvmKt.plus(bArrPlus, bArrR);
        byte[] bArrS = tet.s((short) chunkSize);
        Intrinsics.checkNotNullExpressionValue(bArrS, "shortToBytes(chunkSize.toShort())");
        byteArrayOutputStream.write(ArraysKt___ArraysJvmKt.plus(ArraysKt___ArraysJvmKt.plus(bArrPlus2, bArrS), new byte[]{(byte) mode.getT()}));
        if (continueModeExtraInfo != null) {
            byteArrayOutputStream.write(continueModeExtraInfo.getF28739a());
            if (continueModeExtraInfo.d()) {
                byteArrayOutputStream.write(continueModeExtraInfo.getF28740b());
                byteArrayOutputStream.write(tet.r(continueModeExtraInfo.getC(), 4));
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "bos.toByteArray()");
        qe qeVarG = g(byteArray);
        if (qeVarG != null) {
            t5t.d("NewDfuProfile", "response:" + qeVarG);
            byte[] bArrI = qeVarG.i();
            if (bArrI == null) {
                bArrI = new byte[0];
            }
            d3 d3Var = new d3(bArrI);
            return new PrepareResponse(qeVarG.f() & 255, d3.a(d3Var, 0, 1, (Object) null), d3.a(d3Var, 0L, 1, (Object) null));
        }
        throw new Exception("Prepare transfer failed");
    }

    @Override // defpackage.k7
    @NotNull
    public StartTransferResponse a(boolean fromBreakpoint) throws Exception {
        qe qeVarG = g(new byte[]{-45, !fromBreakpoint ? 1 : 0});
        if (qeVarG != null) {
            t5t.d("NewDfuProfile", "response:" + qeVarG);
            return new StartTransferResponse(qeVarG.f() & 255);
        }
        throw new Exception("Start transfer failed");
    }

    @Override // defpackage.k7
    public boolean a() {
        l();
        return write(this.z, new byte[]{-42});
    }
}
