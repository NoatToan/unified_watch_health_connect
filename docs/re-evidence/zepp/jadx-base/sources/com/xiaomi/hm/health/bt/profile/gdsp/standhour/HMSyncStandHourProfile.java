package com.xiaomi.hm.health.bt.profile.gdsp.standhour;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.gatt.GattPeripheral;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.bt.gatt.IGattCallback;
import com.xiaomi.hm.health.bt.profile.base.HMBaseProfile;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.DataHeader;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.HMProSyncDataBaseProfile;
import com.xiaomi.hm.health.bt.profile.gdsp.standhour.HMSyncStandHourProfile;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0011\b\u0000\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\u0004J\u0016\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004R\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/standhour/HMSyncStandHourProfile;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/activity/HMProSyncDataBaseProfile;", "", "values", "Ljava/util/Calendar;", "calendar", "", "Lcom/xiaomi/hm/health/bt/profile/gdsp/standhour/StandHourData;", SOAP.XMLNS, "startTime", "Lcom/xiaomi/hm/health/bt/profile/gdsp/activity/DataHeader;", "getDataHeader", "fetchData", "", GoogleApiAvailabilityLight.b, LogUtil.I, "lastIndex", "Lcom/xiaomi/hm/health/bt/gatt/GattPeripheral;", "gattPeripheral", "<init>", "(Lcom/xiaomi/hm/health/bt/gatt/GattPeripheral;)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class HMSyncStandHourProfile extends HMProSyncDataBaseProfile {

    @NotNull
    private static final String o = "HMSyncStandHourProfile";

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private int lastIndex;

    public HMSyncStandHourProfile(@NotNull GattPeripheral gattPeripheral) {
        super(gattPeripheral);
        this.lastIndex = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(HMSyncStandHourProfile hMSyncStandHourProfile, AtomicBoolean atomicBoolean, ByteArrayOutputStream byteArrayOutputStream, byte[] bArr) {
        Debug.fi(o, Intrinsics.stringPlus("data:", GattUtils.bytesToHexString(bArr)));
        int i = bArr[0] & 255;
        if (HMProSyncDataBaseProfile.isPackageMissing(hMSyncStandHourProfile.lastIndex, i)) {
            Debug.fi(o, "missing package!!!");
            atomicBoolean.getAndSet(true);
            hMSyncStandHourProfile.waitingNotify();
        } else {
            try {
                byteArrayOutputStream.write(bArr, 1, bArr.length - 1);
            } catch (Exception e) {
                Debug.fi(o, Intrinsics.stringPlus("exception:", e.getMessage()));
                atomicBoolean.getAndSet(true);
                hMSyncStandHourProfile.waitingNotify();
            }
        }
        hMSyncStandHourProfile.lastIndex = i;
        atomicBoolean.set(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(AtomicBoolean atomicBoolean, HMSyncStandHourProfile hMSyncStandHourProfile, byte[] bArr) {
        Debug.fi(HMBaseProfile.TAG, Intrinsics.stringPlus("control:", GattUtils.bytesToHexString(bArr)));
        atomicBoolean.set(true);
        hMSyncStandHourProfile.waitingNotify();
    }

    private final List<StandHourData> s(byte[] values, Calendar calendar) {
        calendar.setTimeInMillis(calendar.getTimeInMillis() + ((long) 3600000));
        ArrayList arrayList = new ArrayList();
        int length = values.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            byte b = values[i];
            int i3 = i2 + 1;
            boolean z = true;
            boolean z2 = ((byte) (b & 1)) != 0;
            if (((byte) (b & 2)) == 0) {
                z = false;
            }
            Calendar calendar2 = Calendar.getInstance();
            calendar2.setTimeInMillis(calendar.getTimeInMillis() + ((long) (i2 * 3600000)));
            arrayList.add(new StandHourData(calendar2, z2, z));
            i++;
            i2 = i3;
        }
        return arrayList;
    }

    @Nullable
    public final List<StandHourData> fetchData(@NotNull Calendar calendar) {
        this.lastIndex = -1;
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        setDataCallback(new IGattCallback.INotifyCallback() { // from class: bk3
            @Override // com.xiaomi.hm.health.bt.gatt.IGattCallback.INotifyCallback
            public final void notify(byte[] bArr) {
                HMSyncStandHourProfile.q(this.a, atomicBoolean, byteArrayOutputStream, bArr);
            }
        });
        setControlCallback(new IGattCallback.INotifyCallback() { // from class: ck3
            @Override // com.xiaomi.hm.health.bt.gatt.IGattCallback.INotifyCallback
            public final void notify(byte[] bArr) {
                HMSyncStandHourProfile.r(atomicBoolean, this, bArr);
            }
        });
        if (startTransfer()) {
            while (!atomicBoolean.get()) {
                atomicBoolean.set(true);
                waiting(20000);
            }
        }
        try {
            return s(byteArrayOutputStream.toByteArray(), calendar);
        } catch (Exception e) {
            Debug.fi(o, Intrinsics.stringPlus("e: ", e));
            return null;
        }
    }

    @Nullable
    public final DataHeader getDataHeader(@NotNull Calendar startTime) {
        return getDataHeader(startTime, (byte) 41);
    }
}
