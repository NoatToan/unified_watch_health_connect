package com.xiaomi.hm.health.bt.profile.dfu;

import androidx.exifinterface.media.ExifInterface;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.Scopes;
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
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u0000 22\u00020\u0001:\u00012B!\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001c\u0012\u0006\u0010!\u001a\u00020\u001f\u0012\u0006\u0010#\u001a\u00020\u0012¢\u0006\u0004\b0\u00101J \u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J0\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J2\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002J\u0018\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0018\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0017H\u0002J\b\u0010\u001b\u001a\u00020\tH\u0014R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001dR\u0016\u0010!\u001a\u00020\u001f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010 R\u0016\u0010#\u001a\u00020\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\"R\u0018\u0010%\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010$R\u0016\u0010'\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010&R\u0016\u0010*\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010-\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010/\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010,¨\u00063"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/dfu/HearingAidDfuTask;", "Lcom/xiaomi/hm/health/bt/profile/base/HMBaseTask;", "Lcom/xiaomi/hm/health/bt/profile/dfu/HMDfuProfile;", Scopes.PROFILE, "Ljava/io/BufferedInputStream;", "fw", "", "isLeft", "c", "", "f", "Lcom/xiaomi/hm/health/bt/profile/dfu/HMFirmwareType;", "type", "Lcom/xiaomi/hm/health/bt/profile/dfu/HMFirmwareInfo$ContinueUpgradeState;", "continueUpgradeState", GoogleApiAvailabilityLight.a, "", "syncSize", "Lcom/xiaomi/hm/health/bt/profile/dfu/IHMFirmwareUpgradeCallback;", "pcb", "e", "a", "inputStream", "", "size", "", "b", "doWork", "Lcom/xiaomi/hm/health/bt/gatt/GattPeripheral;", "Lcom/xiaomi/hm/health/bt/gatt/GattPeripheral;", "leftGattPeripheral", "Lcom/xiaomi/hm/health/bt/profile/dfu/HMFirmwareInfo;", "Lcom/xiaomi/hm/health/bt/profile/dfu/HMFirmwareInfo;", "mFirmwareInfo", "Lcom/xiaomi/hm/health/bt/profile/dfu/IHMFirmwareUpgradeCallback;", "mCallback", "Lcom/xiaomi/hm/health/bt/profile/dfu/HMDfuProfile;", "mLeftProfile", ExifInterface.LATITUDE_SOUTH, "mLeftSyncSize", "g", "Z", "mIsCanceled", "h", LogUtil.I, "mTotalSize", "i", "mCurrentSize", "<init>", "(Lcom/xiaomi/hm/health/bt/gatt/GattPeripheral;Lcom/xiaomi/hm/health/bt/profile/dfu/HMFirmwareInfo;Lcom/xiaomi/hm/health/bt/profile/dfu/IHMFirmwareUpgradeCallback;)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class HearingAidDfuTask extends HMBaseTask {
    private static final int j = 6;
    private static final int k = 6;
    private static final int l = 12;
    private static final int m = 0;
    private static final int n = 2000;
    private static final int o = 5000;
    private static final int p = 600000;
    private static final int q = 20000;
    private static final int r = 15000;

    @NotNull
    private static final String s = "HearingAidDfuTask";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private final GattPeripheral leftGattPeripheral;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final HMFirmwareInfo mFirmwareInfo;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final IHMFirmwareUpgradeCallback mCallback;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private HMDfuProfile mLeftProfile;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private short mLeftSyncSize;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private boolean mIsCanceled;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private int mTotalSize;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private int mCurrentSize;

    public HearingAidDfuTask(@Nullable GattPeripheral gattPeripheral, @NotNull HMFirmwareInfo hMFirmwareInfo, @NotNull IHMFirmwareUpgradeCallback iHMFirmwareUpgradeCallback) {
        this.leftGattPeripheral = gattPeripheral;
        this.mFirmwareInfo = hMFirmwareInfo;
        this.mCallback = iHMFirmwareUpgradeCallback;
        if (gattPeripheral != null) {
            this.mLeftProfile = new HMDfuProfile(gattPeripheral);
        }
        this.mLeftSyncSize = (short) hMFirmwareInfo.getSyncSize();
        if (gattPeripheral != null) {
            this.mLeftProfile = new HMDfuProfile(gattPeripheral);
        }
        this.mLeftSyncSize = (short) hMFirmwareInfo.getSyncSize();
    }

    private final boolean a(HMDfuProfile profile, boolean isLeft) throws InterruptedException {
        Debug.fi(s, Intrinsics.stringPlus(isLeft ? "left" : "right", " stop timeout:15000"));
        if (profile.stop(15000)) {
            return true;
        }
        Debug.fi(s, "stop failed!!!");
        return false;
    }

    private final long b(BufferedInputStream inputStream, int size) throws IOException {
        Debug.i(s, Intrinsics.stringPlus("size:", Integer.valueOf(size)));
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
        Debug.i(s, Intrinsics.stringPlus("read size:", Integer.valueOf(i + i3)));
        inputStream.reset();
        long value = crc32.getValue();
        Debug.i(s, "crc:" + value + ',' + ((Object) Long.toHexString(value)));
        return value;
    }

    private final boolean c(HMDfuProfile profile, BufferedInputStream fw, boolean isLeft) throws Exception {
        f(profile);
        boolean zInit = profile.init();
        Debug.fi(s, "init : " + zInit + " , isLeft : " + isLeft);
        if (!zInit) {
            return zInit;
        }
        boolean zD = d(profile, fw, this.mFirmwareInfo.getFwType(), this.mFirmwareInfo.getContinueUpgradeState(), isLeft);
        Debug.fi(s, "prepareData : " + zD + " , isLeft : " + isLeft);
        return zD;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00ca  */
    private final boolean d(HMDfuProfile profile, BufferedInputStream fw, HMFirmwareType type, HMFirmwareInfo.ContinueUpgradeState continueUpgradeState, boolean isLeft) throws Exception {
        byte b;
        int iAvailable = fw.available();
        long jB = b(fw, fw.available());
        DfuConfig config = profile.getConfig();
        if (config != null) {
            int flushSize = config.getFlushSize();
            if (isLeft) {
                this.mLeftSyncSize = (short) flushSize;
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
        long[] jArrL = profile.l(type.getValue(), iAvailable, jB, this.mLeftSyncSize, CollectionsKt___CollectionsKt.toByteArray(arrayList));
        if (jArrL == null) {
            Debug.fi(s, "get fw info failed!!!");
            return false;
        }
        int i = (int) jArrL[0];
        long j2 = jArrL[1];
        Debug.fi(s, "total size:" + iAvailable + ",total crc:" + jB + ",device size:" + i + ",device crc:" + j2);
        if (1 <= i && i <= iAvailable) {
            long jB2 = b(fw, i);
            Debug.fi(s, Intrinsics.stringPlus("local crc:", Long.valueOf(jB2)));
            if (jB2 == j2) {
                this.mCurrentSize += i;
                fw.skip(i);
                b = 0;
            } else {
                b = 1;
            }
        } else {
            b = 1;
        }
        if (fw.available() <= 0 || profile.start(b)) {
            return true;
        }
        Debug.fi(s, "start failed!!!");
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [boolean, int] */
    private final boolean e(HMDfuProfile profile, BufferedInputStream fw, HMFirmwareType type, short syncSize, IHMFirmwareUpgradeCallback pcb) throws Exception {
        int iAvailable = fw.available();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (iAvailable <= 0) {
            Debug.fi(s, "data has all transfer");
            return true;
        }
        Debug.fi(s, Intrinsics.stringPlus("mtu: ", Integer.valueOf(profile.getMtu().size())));
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
                    Debug.fi(s, "check dfu size failed!!!");
                    return r8;
                }
                i = 0;
            }
            int i5 = fw.read(bArr, r8, size);
            if (i5 < 1) {
                Debug.fi(s, Intrinsics.stringPlus("read firmware data size:", Integer.valueOf(i5)));
                if (i > 0 && !profile.f(i3)) {
                    return r8;
                }
                Debug.fi(s, "DFU transfer rate: " + (iAvailable / (System.currentTimeMillis() - jCurrentTimeMillis)) + "f KBps");
                return true;
            }
            if (i5 < size) {
                byte[] bArr2 = new byte[i5];
                System.arraycopy(bArr, r8, bArr2, r8, i5);
                bArr = bArr2;
            }
            if (this.mIsCanceled || !profile.sendData(bArr)) {
                Debug.fi(s, "write firmware data failed!!!");
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
                Debug.fi(s, Intrinsics.stringPlus("notify error state:", Integer.valueOf(profile.h())));
                return false;
            }
            i2 = i5;
            r8 = 0;
        }
    }

    private final void f(HMDfuProfile profile) {
        int connIntMax;
        LEParams lEParams = profile.getLEParams();
        Debug.fi(s, Intrinsics.stringPlus("leParams:", lEParams));
        if (lEParams != null && (connIntMax = lEParams.getConnIntMax()) > 12) {
            profile.setLEParams(6, 12, 0, 2000);
            try {
                Thread.sleep((long) Math.ceil(connIntMax * 1.25f * 6.0f));
            } catch (Exception unused) {
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:80:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:85:0x00e9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:? A[SYNTHETIC] */
    @Override // com.xiaomi.hm.health.bt.profile.base.HMBaseTask
    public void doWork() throws Throwable {
        Throwable th;
        BufferedInputStream bufferedInputStream;
        Exception e;
        HMDfuProfile hMDfuProfile;
        HMDfuProfile hMDfuProfile2;
        boolean zD = false;
        this.mCallback.onFwStart(0);
        HMDfuProfile hMDfuProfile3 = this.mLeftProfile;
        if (hMDfuProfile3 != null) {
            f(hMDfuProfile3);
        }
        Debug.fi(s, Intrinsics.stringPlus("HMFirmwareInfo:", this.mFirmwareInfo));
        BufferedInputStream bufferedInputStream2 = null;
        try {
            try {
                bufferedInputStream = new BufferedInputStream(new FileInputStream(this.mFirmwareInfo.getFwPath()));
                try {
                    if (this.mLeftProfile != null) {
                        this.mTotalSize += bufferedInputStream.available();
                    }
                    HMDfuProfile hMDfuProfile4 = this.mLeftProfile;
                    if (hMDfuProfile4 != null) {
                        boolean z = !this.mIsCanceled && c(hMDfuProfile4, bufferedInputStream, true);
                        if (z) {
                            z = !this.mIsCanceled && e(hMDfuProfile4, bufferedInputStream, this.mFirmwareInfo.getFwType(), this.mLeftSyncSize, this.mCallback);
                            Debug.fi(s, Intrinsics.stringPlus("send left data, ret:", Boolean.valueOf(z)));
                        }
                        if (a(hMDfuProfile4, true) && z) {
                            zD = true;
                        }
                    } else {
                        zD = true;
                    }
                    if (zD) {
                        if (this.mFirmwareInfo.getContinueUpgradeState() != HMFirmwareInfo.ContinueUpgradeState.CONTINUE) {
                            Debug.fi(s, "active update");
                            HMDfuProfile hMDfuProfile5 = this.mLeftProfile;
                            zD = hMDfuProfile5 == null ? true : hMDfuProfile5.d();
                        }
                        if (zD) {
                            HMDfuProfile hMDfuProfile6 = this.mLeftProfile;
                            if (hMDfuProfile6 != null) {
                                hMDfuProfile6.enableRefreshGatt(true);
                            }
                            Thread.sleep(2000L);
                        } else {
                            Debug.fi(s, "activate failed!!!");
                        }
                    }
                    this.mCallback.onFwStop(zD);
                    try {
                        bufferedInputStream.close();
                    } catch (IOException unused) {
                        Debug.fi(s, "Fail to operate on the firmware file");
                    }
                    hMDfuProfile2 = this.mLeftProfile;
                    if (hMDfuProfile2 == null) {
                        return;
                    }
                } catch (Exception e2) {
                    e = e2;
                    Debug.e(s, "dfu fail", e);
                    if (bufferedInputStream != null) {
                        try {
                            bufferedInputStream.close();
                        } catch (IOException unused2) {
                            Debug.fi(s, "Fail to operate on the firmware file");
                        }
                    }
                    hMDfuProfile2 = this.mLeftProfile;
                    if (hMDfuProfile2 == null) {
                        return;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (0 != 0) {
                    try {
                        bufferedInputStream2.close();
                    } catch (IOException unused3) {
                        Debug.fi(s, "Fail to operate on the firmware file");
                    }
                }
                hMDfuProfile = this.mLeftProfile;
                if (hMDfuProfile == null) {
                    throw th;
                }
                hMDfuProfile.deInit();
                throw th;
            }
        } catch (Exception e3) {
            bufferedInputStream = null;
            e = e3;
        } catch (Throwable th3) {
            th = th3;
            if (0 != 0) {
                bufferedInputStream2.close();
            }
            hMDfuProfile = this.mLeftProfile;
            if (hMDfuProfile == null) {
                throw th;
            }
            hMDfuProfile.deInit();
            throw th;
        }
        hMDfuProfile2.deInit();
    }
}
