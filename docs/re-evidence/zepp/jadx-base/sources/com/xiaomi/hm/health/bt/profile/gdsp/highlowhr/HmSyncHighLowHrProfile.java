package com.xiaomi.hm.health.bt.profile.gdsp.highlowhr;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.gatt.GattPeripheral;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.bt.gatt.IGattCallback;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.DataHeader;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.HMProSyncDataBaseProfile;
import com.xiaomi.hm.health.bt.profile.gdsp.highlowhr.HmSyncHighLowHrProfile;
import io.netty.util.internal.StringUtil;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u0010\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004R\u0016\u0010\u000f\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/highlowhr/HmSyncHighLowHrProfile;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/activity/HMProSyncDataBaseProfile;", "", "data", "", "Lcom/xiaomi/hm/health/bt/profile/gdsp/highlowhr/HmHighLowHrData;", "parseData", "Ljava/util/Calendar;", "cal", "Lcom/xiaomi/hm/health/bt/profile/gdsp/activity/DataHeader;", "getDataHeader", "fetchData", "", GoogleApiAvailabilityLight.b, LogUtil.I, "mLastIndex", "Lcom/xiaomi/hm/health/bt/gatt/GattPeripheral;", "gattPeripheral", "<init>", "(Lcom/xiaomi/hm/health/bt/gatt/GattPeripheral;)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class HmSyncHighLowHrProfile extends HMProSyncDataBaseProfile {
    private static final int o = 9;

    @NotNull
    private static final String p = "HMBaseProfile-SyncHighLowHrData";

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private int mLastIndex;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0001\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0 {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke() {
            Debug.fi(HmSyncHighLowHrProfile.p, "empty highLowHr data");
            return null;
        }
    }

    public HmSyncHighLowHrProfile(@NotNull GattPeripheral gattPeripheral) {
        super(gattPeripheral);
        this.mLastIndex = -1;
    }

    private final List<HmHighLowHrData> parseData(byte[] data) {
        ArrayList arrayList = null;
        if (data != null) {
            int i = 1;
            if (!(!(data.length == 0))) {
                data = null;
            }
            if (data != null) {
                if (data.length % 9 != 1) {
                    Debug.fi(p, Intrinsics.stringPlus("parse highLowHr data fail by data length:", Integer.valueOf(data.length)));
                } else {
                    arrayList = new ArrayList();
                    byte b = data[0];
                    while (i < data.length) {
                        long jBytesToLong = GattUtils.bytesToLong(data, i, 4);
                        int i2 = i + 4;
                        int i3 = i2 + 1;
                        int i4 = data[i2] & 255;
                        int iBytesToInt = GattUtils.bytesToInt(data, i3, 2);
                        int i5 = i3 + 2;
                        int i6 = i5 + 1;
                        arrayList.add(new HmHighLowHrData(b, jBytesToLong, i4, iBytesToInt, data[i5] & 255, data[i6] & 255));
                        i = i6 + 1;
                    }
                }
            }
        }
        return arrayList == null ? (List) a.a.invoke() : arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(HmSyncHighLowHrProfile hmSyncHighLowHrProfile, AtomicBoolean atomicBoolean, ByteArrayOutputStream byteArrayOutputStream, byte[] bArr) {
        Debug.fi(p, Intrinsics.stringPlus("data:", GattUtils.bytesToHexString(bArr)));
        int i = bArr[0] & 255;
        int i2 = hmSyncHighLowHrProfile.mLastIndex;
        if (i2 + 1 == i || (i2 == 255 && i == 0)) {
            try {
                byteArrayOutputStream.write(bArr, 1, bArr.length - 1);
            } catch (Exception e) {
                Debug.fi(p, Intrinsics.stringPlus("exception:", e.getMessage()));
                atomicBoolean.getAndSet(true);
                hmSyncHighLowHrProfile.waitingNotify();
            }
        } else {
            Debug.fi(p, "missing package!!!");
            atomicBoolean.getAndSet(true);
            hmSyncHighLowHrProfile.waitingNotify();
        }
        hmSyncHighLowHrProfile.mLastIndex = i;
        atomicBoolean.set(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(AtomicBoolean atomicBoolean, HmSyncHighLowHrProfile hmSyncHighLowHrProfile, byte[] bArr) {
        Debug.fi(p, Intrinsics.stringPlus("control:", GattUtils.bytesToHexString(bArr)));
        atomicBoolean.set(true);
        hmSyncHighLowHrProfile.waitingNotify();
    }

    @Nullable
    public final List<HmHighLowHrData> fetchData() {
        this.mLastIndex = -1;
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        setDataCallback(new IGattCallback.INotifyCallback() { // from class: p74
            @Override // com.xiaomi.hm.health.bt.gatt.IGattCallback.INotifyCallback
            public final void notify(byte[] bArr) {
                HmSyncHighLowHrProfile.q(this.a, atomicBoolean, byteArrayOutputStream, bArr);
            }
        });
        setControlCallback(new IGattCallback.INotifyCallback() { // from class: q74
            @Override // com.xiaomi.hm.health.bt.gatt.IGattCallback.INotifyCallback
            public final void notify(byte[] bArr) {
                HmSyncHighLowHrProfile.r(atomicBoolean, this, bArr);
            }
        });
        if (startTransfer()) {
            while (!atomicBoolean.get()) {
                atomicBoolean.set(true);
                waiting(20000);
            }
        }
        try {
            return parseData(byteArrayOutputStream.toByteArray());
        } catch (Exception e) {
            Debug.fi(p, "parse highLowHr data fail " + ((Object) e.getMessage()) + StringUtil.SPACE);
            return null;
        }
    }

    @Nullable
    public final DataHeader getDataHeader(@NotNull Calendar cal) {
        return super.getDataHeader(cal, (byte) 50);
    }
}
