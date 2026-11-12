package com.xiaomi.eco.api;

import android.os.RemoteException;
import com.xiaomi.eco.connection.EcoRealConnection;
import com.xiaomi.fitness.common.log.Logger;
import defpackage.iql;
import defpackage.rd7;
import defpackage.rq7;
import defpackage.wrc;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u001f\u0012\u0006\u0010*\u001a\u00020)\u0012\u0006\u0010+\u001a\u00020)\u0012\u0006\u0010-\u001a\u00020,¢\u0006\u0004\b.\u0010/J\u001f\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ/\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0013\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0015\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0015\u0010\u0014J\r\u0010\u0016\u001a\u00020\u000f¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH&¢\u0006\u0004\b\u001d\u0010\u001eR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010!\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010 R\u0018\u0010\"\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010 R\u0018\u0010#\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010 R\"\u0010$\u001a\u00020\u00188\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010\u001b¨\u00060"}, d2 = {"Lcom/xiaomi/eco/api/EcoCipherApiCall;", "Lcom/xiaomi/eco/connection/EcoRealConnection;", "C", "Lcom/xiaomi/eco/api/a;", "", "type", "", "encrypt", "shouldCheckCounter", "(IZ)Z", "", "deviceKey", "appKey", "deviceIV", "appIV", "", "updateKeys", "([B[B[B[B)V", "input", "encryptData", "(I[B)[B", "decryptData", "updateNativeAuthKey", "()V", "Lrq7;", "counter", "updateCounter", "(Lrq7;)V", "", "getLastConnectTime", "()J", "mDeviceKey", "[B", "mAppKey", "mDeviceIV", "mAppIV", "cryptoCounter", "Lrq7;", "getCryptoCounter", "()Lrq7;", "setCryptoCounter", "", "did", "coreId", "Lwrc;", "callback", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lwrc;)V", "eco-common-connect_release"}, k = 1, mv = {2, 0, 0})
public abstract class EcoCipherApiCall<C extends EcoRealConnection> extends a<C> {

    @NotNull
    private rq7 cryptoCounter;

    @Nullable
    private byte[] mAppIV;

    @Nullable
    private byte[] mAppKey;

    @Nullable
    private byte[] mDeviceIV;

    @Nullable
    private byte[] mDeviceKey;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EcoCipherApiCall(@NotNull String did, @NotNull String coreId, @NotNull wrc callback) {
        super(did, coreId, callback);
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(coreId, "coreId");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.cryptoCounter = new rq7();
    }

    private final boolean shouldCheckCounter(int type, boolean encrypt) {
        if (type == 101) {
            return encrypt;
        }
        return false;
    }

    @Override // com.xiaomi.eco.common.connect.a
    public abstract /* synthetic */ void bind(String str) throws RemoteException;

    @Override // com.xiaomi.eco.common.connect.a
    public abstract /* synthetic */ void connect(String str, byte[] bArr) throws RemoteException;

    @Nullable
    public final byte[] decryptData(int type, @Nullable byte[] input) {
        if (input == null || this.mDeviceKey == null || this.mDeviceIV == null) {
            return null;
        }
        boolean zShouldCheckCounter = shouldCheckCounter(type, false);
        if (zShouldCheckCounter && (input.length < 2 || !this.cryptoCounter.f((short) (((input[0] & 255) | (input[1] & 255)) << 8)))) {
            return null;
        }
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(12).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.put(this.mDeviceIV);
        byteBufferOrder.putInt(0);
        if (zShouldCheckCounter) {
            byteBufferOrder.put(this.cryptoCounter.d());
            byte[] bArr = new byte[input.length - 2];
            System.arraycopy(input, 2, bArr, 0, input.length - 2);
            input = bArr;
        } else {
            byteBufferOrder.putInt(0);
        }
        return iql.a(this.mDeviceKey, byteBufferOrder.array(), input);
    }

    @Override // com.xiaomi.eco.common.connect.a
    public abstract /* synthetic */ void disconnect() throws RemoteException;

    @Nullable
    public final byte[] encryptData(int type, @Nullable byte[] input) {
        if (input == null || this.mAppKey == null || this.mAppIV == null) {
            return null;
        }
        boolean zShouldCheckCounter = shouldCheckCounter(type, true);
        if (zShouldCheckCounter) {
            this.cryptoCounter.a();
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(12);
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        ByteBuffer byteBufferOrder = byteBufferAllocate.order(byteOrder);
        byteBufferOrder.put(this.mAppIV);
        byteBufferOrder.putInt(0);
        if (zShouldCheckCounter) {
            byteBufferOrder.put(this.cryptoCounter.c());
        } else {
            byteBufferOrder.putInt(0);
        }
        byte[] bArrD = iql.d(this.mAppKey, byteBufferOrder.array(), input);
        if (!zShouldCheckCounter) {
            return bArrD;
        }
        ByteBuffer byteBufferOrder2 = ByteBuffer.allocate(bArrD.length + 2).order(byteOrder);
        byteBufferOrder2.putShort(this.cryptoCounter.b());
        byteBufferOrder2.put(bArrD);
        return byteBufferOrder2.array();
    }

    @NotNull
    public final rq7 getCryptoCounter() {
        return this.cryptoCounter;
    }

    public abstract long getLastConnectTime();

    @Override // com.xiaomi.eco.common.connect.a
    public abstract /* synthetic */ String getName() throws RemoteException;

    @Override // com.xiaomi.eco.common.connect.a
    public abstract /* synthetic */ void removeBond() throws RemoteException;

    public final void setCryptoCounter(@NotNull rq7 rq7Var) {
        Intrinsics.checkNotNullParameter(rq7Var, "<set-?>");
        this.cryptoCounter = rq7Var;
    }

    public void updateCounter(@NotNull rq7 counter) {
        Intrinsics.checkNotNullParameter(counter, "counter");
        this.cryptoCounter = counter;
    }

    public void updateKeys(@NotNull byte[] deviceKey, @NotNull byte[] appKey, @NotNull byte[] deviceIV, @NotNull byte[] appIV) {
        Intrinsics.checkNotNullParameter(deviceKey, "deviceKey");
        Intrinsics.checkNotNullParameter(appKey, "appKey");
        Intrinsics.checkNotNullParameter(deviceIV, "deviceIV");
        Intrinsics.checkNotNullParameter(appIV, "appIV");
        this.mDeviceKey = deviceKey;
        this.mAppKey = appKey;
        this.mDeviceIV = deviceIV;
        this.mAppIV = appIV;
        updateNativeAuthKey();
    }

    public final void updateNativeAuthKey() {
        Logger.d("EcoApiCall", "updateNativeAuthKey: " + getLastConnectTime() + ", authtime = " + rd7.b());
        long lastConnectTime = getLastConnectTime();
        if (lastConnectTime == 0 || lastConnectTime <= rd7.b()) {
            return;
        }
        rd7.d(lastConnectTime, this.mDeviceKey, this.mAppKey, this.mDeviceIV, this.mAppIV, this.cryptoCounter);
    }
}
