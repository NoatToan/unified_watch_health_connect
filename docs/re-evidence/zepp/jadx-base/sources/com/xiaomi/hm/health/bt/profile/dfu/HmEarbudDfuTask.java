package com.xiaomi.hm.health.bt.profile.dfu;

import androidx.exifinterface.media.ExifInterface;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.Scopes;
import com.loc.z;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.gatt.GattPeripheral;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.bt.profile.base.HMBaseTask;
import com.xiaomi.hm.health.bt.profile.base.LEParams;
import com.xiaomi.hm.health.bt.profile.mili.model.Progress;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.zip.CRC32;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001c\u0018\u0000 @2\u00020\u0001:\u0002@AB-\b\u0016\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001d\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001d\u0012\u0006\u0010#\u001a\u00020!\u0012\u0006\u0010%\u001a\u00020\u0012¢\u0006\u0004\b=\u0010>B7\b\u0016\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001d\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001d\u0012\u0006\u0010#\u001a\u00020!\u0012\u0006\u0010%\u001a\u00020\u0012\u0012\b\u0010(\u001a\u0004\u0018\u00010&¢\u0006\u0004\b=\u0010?J \u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J0\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J2\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002J\u0018\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0018\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0017H\u0002J\b\u0010\u001b\u001a\u00020\tH\u0014J\u0006\u0010\u001c\u001a\u00020\tR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001eR\u0018\u0010 \u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001eR\u0016\u0010#\u001a\u00020!8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\"R\u0016\u0010%\u001a\u00020\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010$R\u0018\u0010(\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010'R\u0018\u0010+\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0018\u0010-\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010*R\u0016\u00100\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00102\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010/R\u0016\u00105\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00107\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00104R\u0016\u0010:\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010<\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u00109¨\u0006B"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/dfu/HmEarbudDfuTask;", "Lcom/xiaomi/hm/health/bt/profile/base/HMBaseTask;", "Lcom/xiaomi/hm/health/bt/profile/dfu/HMDfuProfile;", Scopes.PROFILE, "Ljava/io/BufferedInputStream;", "fw", "", "isLeft", "c", "", "f", "Lcom/xiaomi/hm/health/bt/profile/dfu/HMFirmwareType;", "type", "Lcom/xiaomi/hm/health/bt/profile/dfu/HMFirmwareInfo$ContinueUpgradeState;", "continueUpgradeState", GoogleApiAvailabilityLight.a, "", "syncSize", "Lcom/xiaomi/hm/health/bt/profile/dfu/IHMFirmwareUpgradeCallback;", "pcb", "e", "a", "inputStream", "", "size", "", "b", "doWork", "cancelTask", "Lcom/xiaomi/hm/health/bt/gatt/GattPeripheral;", "Lcom/xiaomi/hm/health/bt/gatt/GattPeripheral;", "leftGattPeripheral", "rightGattPeripheral", "Lcom/xiaomi/hm/health/bt/profile/dfu/HMFirmwareInfo;", "Lcom/xiaomi/hm/health/bt/profile/dfu/HMFirmwareInfo;", "mFirmwareInfo", "Lcom/xiaomi/hm/health/bt/profile/dfu/IHMFirmwareUpgradeCallback;", "mCallback", "Lcom/xiaomi/hm/health/bt/profile/dfu/HmEarbudDfuTask$MusicControlCallBack;", "Lcom/xiaomi/hm/health/bt/profile/dfu/HmEarbudDfuTask$MusicControlCallBack;", "mMusicCallback", "g", "Lcom/xiaomi/hm/health/bt/profile/dfu/HMDfuProfile;", "mLeftProfile", "h", "mRightProfile", "i", ExifInterface.LATITUDE_SOUTH, "mLeftSyncSize", z.j, "mRightSyncSize", hl.k, "Z", "mIsCanceled", "l", "mNeedPlayMusic", "m", LogUtil.I, "mTotalSize", GoogleApiAvailabilityLight.b, "mCurrentSize", "<init>", "(Lcom/xiaomi/hm/health/bt/gatt/GattPeripheral;Lcom/xiaomi/hm/health/bt/gatt/GattPeripheral;Lcom/xiaomi/hm/health/bt/profile/dfu/HMFirmwareInfo;Lcom/xiaomi/hm/health/bt/profile/dfu/IHMFirmwareUpgradeCallback;)V", "(Lcom/xiaomi/hm/health/bt/gatt/GattPeripheral;Lcom/xiaomi/hm/health/bt/gatt/GattPeripheral;Lcom/xiaomi/hm/health/bt/profile/dfu/HMFirmwareInfo;Lcom/xiaomi/hm/health/bt/profile/dfu/IHMFirmwareUpgradeCallback;Lcom/xiaomi/hm/health/bt/profile/dfu/HmEarbudDfuTask$MusicControlCallBack;)V", "Companion", "MusicControlCallBack", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class HmEarbudDfuTask extends HMBaseTask {
    private static final int o = 6;
    private static final int p = 6;
    private static final int q = 12;
    private static final int r = 0;
    private static final int s = 2000;
    private static final int t = 5000;
    private static final int u = 600000;
    private static final int v = 20000;
    private static final int w = 15000;

    @NotNull
    private static final String x = "HmEarbudDfuTask";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private final GattPeripheral leftGattPeripheral;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private final GattPeripheral rightGattPeripheral;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final HMFirmwareInfo mFirmwareInfo;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final IHMFirmwareUpgradeCallback mCallback;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    private final MusicControlCallBack mMusicCallback;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    private HMDfuProfile mLeftProfile;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    private HMDfuProfile mRightProfile;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private short mLeftSyncSize;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private short mRightSyncSize;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private boolean mIsCanceled;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private boolean mNeedPlayMusic;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private int mTotalSize;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private int mCurrentSize;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0004H&¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/dfu/HmEarbudDfuTask$MusicControlCallBack;", "", "", "stopMusic", "", "playMusic", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public interface MusicControlCallBack {
        void playMusic();

        boolean stopMusic();
    }

    public HmEarbudDfuTask(@Nullable GattPeripheral gattPeripheral, @Nullable GattPeripheral gattPeripheral2, @NotNull HMFirmwareInfo hMFirmwareInfo, @NotNull IHMFirmwareUpgradeCallback iHMFirmwareUpgradeCallback) {
        this(gattPeripheral, gattPeripheral2, hMFirmwareInfo, iHMFirmwareUpgradeCallback, null);
    }

    private final boolean a(HMDfuProfile profile, boolean isLeft) throws InterruptedException {
        Debug.fi(x, Intrinsics.stringPlus(isLeft ? "left" : "right", " stop timeout:15000"));
        if (profile.stop(15000)) {
            return true;
        }
        Debug.fi(x, "stop failed!!!");
        return false;
    }

    private final long b(BufferedInputStream inputStream, int size) throws IOException {
        Debug.i(x, Intrinsics.stringPlus("size:", Integer.valueOf(size)));
        inputStream.mark(size);
        CRC32 crc32 = new CRC32();
        byte[] bArr = new byte[4096];
        int i = 0;
        while (i + 4096 <= size) {
            int i2 = inputStream.read(bArr, 0, 4096);
            crc32.update(bArr, 0, i2);
            i += i2;
        }
        int i3 = inputStream.read(bArr, 0, size - i);
        crc32.update(bArr, 0, i3);
        Debug.i(x, Intrinsics.stringPlus("read size:", Integer.valueOf(i + i3)));
        inputStream.reset();
        long value = crc32.getValue();
        Debug.i(x, "crc:" + value + ',' + ((Object) Long.toHexString(value)));
        return value;
    }

    private final boolean c(HMDfuProfile profile, BufferedInputStream fw, boolean isLeft) throws Exception {
        f(profile);
        boolean zInit = profile.init();
        Debug.fi(x, "init : " + zInit + " , isLeft : " + isLeft);
        if (!zInit) {
            return zInit;
        }
        boolean zD = d(profile, fw, this.mFirmwareInfo.getFwType(), this.mFirmwareInfo.getContinueUpgradeState(), isLeft);
        Debug.fi(x, "prepareData : " + zD + " , isLeft : " + isLeft);
        return zD;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00cf  */
    private final boolean d(HMDfuProfile profile, BufferedInputStream fw, HMFirmwareType type, HMFirmwareInfo.ContinueUpgradeState continueUpgradeState, boolean isLeft) throws Exception {
        byte b;
        int iAvailable = fw.available();
        long jB = b(fw, fw.available());
        DfuConfig config = profile.getConfig();
        if (config != null) {
            int flushSize = config.getFlushSize();
            if (isLeft) {
                this.mLeftSyncSize = (short) flushSize;
            } else {
                this.mRightSyncSize = (short) flushSize;
            }
        }
        ArrayList arrayList = new ArrayList();
        if (continueUpgradeState != HMFirmwareInfo.ContinueUpgradeState.NONE) {
            arrayList.add(Byte.valueOf((byte) (continueUpgradeState.value & 255)));
        }
        if (type == HMFirmwareType.FIRMWARE_VOICE) {
            arrayList.add(Byte.valueOf(this.mFirmwareInfo.getVoiceType()));
            arrayList.addAll(ArraysKt___ArraysKt.toMutableList(GattUtils.intToBytes(this.mFirmwareInfo.getVoiceId())));
        }
        long[] jArrL = profile.l(type.getValue(), iAvailable, jB, isLeft ? this.mLeftSyncSize : this.mRightSyncSize, CollectionsKt___CollectionsKt.toByteArray(arrayList));
        if (jArrL == null) {
            Debug.fi(x, "get fw info failed!!!");
            return false;
        }
        int i = (int) jArrL[0];
        long j = jArrL[1];
        Debug.fi(x, "total size:" + iAvailable + ",total crc:" + jB + ",device size:" + i + ",device crc:" + j);
        if (i <= 0 || i > iAvailable) {
            b = 1;
        } else {
            long jB2 = b(fw, i);
            Debug.fi(x, Intrinsics.stringPlus("local crc:", Long.valueOf(jB2)));
            if (jB2 == j) {
                this.mCurrentSize += i;
                fw.skip(i);
                b = 0;
            } else {
                b = 1;
            }
        }
        if (fw.available() <= 0 || profile.start(b)) {
            return true;
        }
        Debug.fi(x, "start failed!!!");
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v7 */
    private final boolean e(HMDfuProfile profile, BufferedInputStream fw, HMFirmwareType type, short syncSize, IHMFirmwareUpgradeCallback pcb) throws Exception {
        int iAvailable = fw.available();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (iAvailable <= 0) {
            Debug.fi(x, "data has all transfer");
            return true;
        }
        ?? r8 = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int size = profile.getMtu().size();
            byte[] bArr = new byte[size];
            i += i2;
            if (syncSize - 1 < i) {
                if (!profile.f(i3)) {
                    Debug.fi(x, "check dfu size failed!!!");
                    return r8;
                }
                i = 0;
            }
            int i5 = fw.read(bArr, r8, size);
            if (i5 < 1) {
                Debug.fi(x, Intrinsics.stringPlus("read firmware data size:", Integer.valueOf(i5)));
                if (i > 0 && !profile.f(i3)) {
                    return r8;
                }
                Debug.fi(x, "DFU transfer rate: " + (iAvailable / (System.currentTimeMillis() - jCurrentTimeMillis)) + "f KBps");
                return true;
            }
            if (i5 < size) {
                byte[] bArr2 = new byte[i5];
                System.arraycopy(bArr, r8, bArr2, r8, i5);
                bArr = bArr2;
            }
            if (this.mIsCanceled || !profile.sendData(bArr)) {
                Debug.fi(x, "write firmware data failed!!!");
                return r8;
            }
            int i6 = this.mCurrentSize + i5;
            this.mCurrentSize = i6;
            i3 += i5;
            int i7 = i3 * 100;
            if (i4 * iAvailable < i7) {
                i4 = i7 / iAvailable;
                if (pcb != null) {
                    pcb.onFwProgress(new Progress(this.mTotalSize, i6));
                }
            }
            if (profile.h() != 1) {
                Debug.fi(x, Intrinsics.stringPlus("notify error state:", Integer.valueOf(profile.h())));
                return false;
            }
            i2 = i5;
            r8 = 0;
        }
    }

    private final void f(HMDfuProfile profile) {
        int connIntMax;
        LEParams lEParams = profile.getLEParams();
        Debug.fi(x, Intrinsics.stringPlus("leParams:", lEParams));
        if (lEParams != null && (connIntMax = lEParams.getConnIntMax()) > 12) {
            profile.setLEParams(6, 12, 0, 2000);
            try {
                Thread.sleep((long) Math.ceil(connIntMax * 1.25f * 6.0f));
            } catch (Exception unused) {
            }
        }
    }

    public final void cancelTask() {
        this.mIsCanceled = true;
        Debug.fi(x, "user cancel task");
    }

    /* JADX WARN: Code duplicated, block: B:137:0x0198  */
    /* JADX WARN: Code duplicated, block: B:138:0x0199 A[Catch: IOException -> 0x019d, TRY_LEAVE, TryCatch #5 {IOException -> 0x019d, blocks: (B:135:0x0193, B:138:0x0199), top: B:168:0x0193 }] */
    /* JADX WARN: Code duplicated, block: B:144:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:152:0x01b4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:153:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:154:0x01b7 A[Catch: IOException -> 0x01bb, TRY_LEAVE, TryCatch #7 {IOException -> 0x01bb, blocks: (B:151:0x01b1, B:154:0x01b7), top: B:172:0x01b1 }] */
    /* JADX WARN: Code duplicated, block: B:160:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:164:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:172:0x01b1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:180:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:182:? A[SYNTHETIC] */
    @Override // com.xiaomi.hm.health.bt.profile.base.HMBaseTask
    public void doWork() throws Throwable {
        BufferedInputStream bufferedInputStream;
        HMDfuProfile hMDfuProfile;
        HMDfuProfile hMDfuProfile2;
        HMDfuProfile hMDfuProfile3;
        HMDfuProfile hMDfuProfile4;
        boolean z;
        MusicControlCallBack musicControlCallBack;
        HMDfuProfile hMDfuProfile5;
        boolean z2 = false;
        this.mCallback.onFwStart(0);
        HMDfuProfile hMDfuProfile6 = this.mLeftProfile;
        if (hMDfuProfile6 != null) {
            f(hMDfuProfile6);
        }
        HMDfuProfile hMDfuProfile7 = this.mRightProfile;
        if (hMDfuProfile7 != null) {
            f(hMDfuProfile7);
        }
        Debug.fi(x, Intrinsics.stringPlus("HMFirmwareInfo:", this.mFirmwareInfo));
        BufferedInputStream bufferedInputStream2 = null;
        try {
            MusicControlCallBack musicControlCallBack2 = this.mMusicCallback;
            if (musicControlCallBack2 != null) {
                this.mNeedPlayMusic = musicControlCallBack2.stopMusic();
            }
            BufferedInputStream bufferedInputStream3 = new BufferedInputStream(new FileInputStream(this.mFirmwareInfo.getFwPath()));
            try {
                String otherFwPath = this.mFirmwareInfo.getOtherFwPath();
                if (otherFwPath == null) {
                    otherFwPath = this.mFirmwareInfo.getFwPath();
                }
                bufferedInputStream = new BufferedInputStream(new FileInputStream(otherFwPath));
                try {
                    if (this.mLeftProfile != null) {
                        this.mTotalSize += bufferedInputStream3.available();
                    }
                    if (this.mRightProfile != null) {
                        this.mTotalSize += bufferedInputStream.available();
                    }
                    HMDfuProfile hMDfuProfile8 = this.mLeftProfile;
                    if (hMDfuProfile8 != null) {
                        boolean z3 = !this.mIsCanceled && c(hMDfuProfile8, bufferedInputStream3, true);
                        if (z3) {
                            z3 = !this.mIsCanceled && e(hMDfuProfile8, bufferedInputStream3, this.mFirmwareInfo.getFwType(), this.mLeftSyncSize, this.mCallback);
                            Debug.fi(x, Intrinsics.stringPlus("send left data, ret:", Boolean.valueOf(z3)));
                        }
                        z = a(hMDfuProfile8, true) && z3;
                    }
                    if (z && (hMDfuProfile5 = this.mRightProfile) != null) {
                        boolean z4 = !this.mIsCanceled && c(hMDfuProfile5, bufferedInputStream, false);
                        if (z4) {
                            z4 = !this.mIsCanceled && e(hMDfuProfile5, bufferedInputStream, this.mFirmwareInfo.getFwType(), this.mRightSyncSize, this.mCallback);
                            Debug.fi(x, Intrinsics.stringPlus("send right data, ret:", Boolean.valueOf(z4)));
                        }
                        z = a(hMDfuProfile5, false) && z4;
                    }
                    if (z) {
                        if (this.mFirmwareInfo.getContinueUpgradeState() != HMFirmwareInfo.ContinueUpgradeState.CONTINUE) {
                            Debug.fi(x, "active update");
                            HMDfuProfile hMDfuProfile9 = this.mLeftProfile;
                            if (hMDfuProfile9 == null ? true : hMDfuProfile9.d()) {
                                HMDfuProfile hMDfuProfile10 = this.mRightProfile;
                                if (hMDfuProfile10 == null ? true : hMDfuProfile10.d()) {
                                    z2 = true;
                                }
                            }
                            z = z2;
                        }
                        if (z) {
                            HMDfuProfile hMDfuProfile11 = this.mLeftProfile;
                            if (hMDfuProfile11 != null) {
                                hMDfuProfile11.enableRefreshGatt(true);
                            }
                            HMDfuProfile hMDfuProfile12 = this.mRightProfile;
                            if (hMDfuProfile12 != null) {
                                hMDfuProfile12.enableRefreshGatt(true);
                            }
                            Thread.sleep(2000L);
                        } else {
                            Debug.fi(x, "activate failed!!!");
                        }
                    }
                    this.mCallback.onFwStop(z);
                    if (!z && this.mNeedPlayMusic && (musicControlCallBack = this.mMusicCallback) != null) {
                        musicControlCallBack.playMusic();
                    }
                    try {
                        bufferedInputStream3.close();
                        bufferedInputStream.close();
                    } catch (IOException unused) {
                        Debug.fi(x, "Fail to operate on the firmware file");
                    }
                    HMDfuProfile hMDfuProfile13 = this.mLeftProfile;
                    if (hMDfuProfile13 != null) {
                        hMDfuProfile13.deInit();
                    }
                    hMDfuProfile4 = this.mRightProfile;
                    if (hMDfuProfile4 == null) {
                        return;
                    }
                } catch (Exception e) {
                    e = e;
                    bufferedInputStream2 = bufferedInputStream3;
                    try {
                        Debug.e(x, "dfu fail", e);
                        if (bufferedInputStream2 != null) {
                            try {
                                bufferedInputStream2.close();
                                if (bufferedInputStream == null) {
                                    bufferedInputStream.close();
                                }
                            } catch (IOException unused2) {
                                Debug.fi(x, "Fail to operate on the firmware file");
                                hMDfuProfile3 = this.mLeftProfile;
                                if (hMDfuProfile3 != null) {
                                    hMDfuProfile3.deInit();
                                }
                                hMDfuProfile4 = this.mRightProfile;
                                if (hMDfuProfile4 == null) {
                                    return;
                                }
                                hMDfuProfile4.deInit();
                            }
                        } else if (bufferedInputStream == null) {
                            bufferedInputStream.close();
                        }
                        hMDfuProfile3 = this.mLeftProfile;
                        if (hMDfuProfile3 != null) {
                            hMDfuProfile3.deInit();
                        }
                        hMDfuProfile4 = this.mRightProfile;
                        if (hMDfuProfile4 == null) {
                            return;
                        }
                    } catch (Throwable th) {
                        th = th;
                        if (bufferedInputStream2 == null) {
                            try {
                                bufferedInputStream2.close();
                                if (bufferedInputStream == null) {
                                    bufferedInputStream.close();
                                }
                            } catch (IOException unused3) {
                                Debug.fi(x, "Fail to operate on the firmware file");
                                hMDfuProfile = this.mLeftProfile;
                                if (hMDfuProfile != null) {
                                    hMDfuProfile.deInit();
                                }
                                hMDfuProfile2 = this.mRightProfile;
                                if (hMDfuProfile2 == null) {
                                    throw th;
                                }
                                hMDfuProfile2.deInit();
                                throw th;
                            }
                        } else if (bufferedInputStream == null) {
                            bufferedInputStream.close();
                        }
                        hMDfuProfile = this.mLeftProfile;
                        if (hMDfuProfile != null) {
                            hMDfuProfile.deInit();
                        }
                        hMDfuProfile2 = this.mRightProfile;
                        if (hMDfuProfile2 == null) {
                            throw th;
                        }
                        hMDfuProfile2.deInit();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    bufferedInputStream2 = bufferedInputStream3;
                    if (bufferedInputStream2 == null) {
                        bufferedInputStream2.close();
                        if (bufferedInputStream == null) {
                            bufferedInputStream.close();
                        }
                    } else if (bufferedInputStream == null) {
                        bufferedInputStream.close();
                    }
                    hMDfuProfile = this.mLeftProfile;
                    if (hMDfuProfile != null) {
                        hMDfuProfile.deInit();
                    }
                    hMDfuProfile2 = this.mRightProfile;
                    if (hMDfuProfile2 == null) {
                        throw th;
                    }
                    hMDfuProfile2.deInit();
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
                bufferedInputStream = null;
            } catch (Throwable th3) {
                th = th3;
                bufferedInputStream = null;
            }
        } catch (Exception e3) {
            e = e3;
            bufferedInputStream = null;
        } catch (Throwable th4) {
            th = th4;
            bufferedInputStream = null;
        }
        hMDfuProfile4.deInit();
    }

    public HmEarbudDfuTask(@Nullable GattPeripheral gattPeripheral, @Nullable GattPeripheral gattPeripheral2, @NotNull HMFirmwareInfo hMFirmwareInfo, @NotNull IHMFirmwareUpgradeCallback iHMFirmwareUpgradeCallback, @Nullable MusicControlCallBack musicControlCallBack) {
        this.leftGattPeripheral = gattPeripheral;
        this.rightGattPeripheral = gattPeripheral2;
        this.mFirmwareInfo = hMFirmwareInfo;
        this.mCallback = iHMFirmwareUpgradeCallback;
        this.mMusicCallback = musicControlCallBack;
        if (gattPeripheral != null) {
            this.mLeftProfile = new HMDfuProfile(gattPeripheral);
        }
        if (gattPeripheral2 != null) {
            this.mRightProfile = new HMDfuProfile(gattPeripheral2);
        }
        this.mLeftSyncSize = (short) hMFirmwareInfo.getSyncSize();
        this.mRightSyncSize = (short) hMFirmwareInfo.getSyncSize();
    }
}
