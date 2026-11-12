package com.xiaomi.hm.health.bt.profile.gdsp.bodytemperature;

import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.gatt.GattPeripheral;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.bt.gatt.IGattCallback;
import com.xiaomi.hm.health.bt.profile.base.HMBaseProfile;
import com.xiaomi.hm.health.bt.profile.base.HMNotifyResponse;
import com.xiaomi.hm.health.bt.profile.base.ProfileUtils;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.DataHeader;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.HMProSyncDataBaseProfile;
import com.xiaomi.hm.health.bt.profile.gdsp.bodytemperature.HMSyncBodyTemperatureProfile;
import java.io.ByteArrayOutputStream;
import java.util.Calendar;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Typography;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u001c\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\n2\u0006\u0010\t\u001a\u00020\bJ\u001a\u0010\u0010\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/bodytemperature/HMSyncBodyTemperatureProfile;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/activity/HMProSyncDataBaseProfile;", "Ljava/util/Calendar;", "startTime", "Lcom/xiaomi/hm/health/bt/profile/gdsp/activity/DataHeader;", "getDataHeaderAllDay", "getDataHeaderSingle", "getDataHeader80s", "", "targetSize", "Lkotlin/Pair;", "", "", "fetchData", "", "type", "getDataHeader", "Lcom/xiaomi/hm/health/bt/gatt/GattPeripheral;", "gattPeripheral", "<init>", "(Lcom/xiaomi/hm/health/bt/gatt/GattPeripheral;)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class HMSyncBodyTemperatureProfile extends HMProSyncDataBaseProfile {
    public HMSyncBodyTemperatureProfile(@NotNull GattPeripheral gattPeripheral) {
        super(gattPeripheral);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(AtomicBoolean atomicBoolean, AtomicReference atomicReference, HMSyncBodyTemperatureProfile hMSyncBodyTemperatureProfile, byte[] bArr) {
        Debug.fi(HMBaseProfile.TAG, Intrinsics.stringPlus("FetchData ControlPoint: ", GattUtils.bytesToHexString(bArr)));
        atomicBoolean.set(true);
        atomicReference.set(bArr);
        hMSyncBodyTemperatureProfile.waitingNotify();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(AtomicInteger atomicInteger, AtomicBoolean atomicBoolean, HMSyncBodyTemperatureProfile hMSyncBodyTemperatureProfile, ByteArrayOutputStream byteArrayOutputStream, int i, byte[] bArr) {
        Debug.fi(HMBaseProfile.TAG, Intrinsics.stringPlus("FetchData ReceivedPack: ", GattUtils.bytesToHexString(bArr)));
        int i2 = bArr[0] & 255;
        if (i2 != atomicInteger.get() + 1 && (i2 != 0 || atomicInteger.get() != 255)) {
            Debug.fi(HMBaseProfile.TAG, "Missing Pack!!");
            atomicBoolean.set(true);
            hMSyncBodyTemperatureProfile.waitingNotify();
        } else if (byteArrayOutputStream.size() >= i) {
            Debug.fi(HMBaseProfile.TAG, "Overflow Pack!!");
            atomicBoolean.set(true);
            hMSyncBodyTemperatureProfile.waitingNotify();
        } else {
            try {
                byteArrayOutputStream.write(bArr, 1, bArr.length - 1);
                atomicBoolean.set(false);
            } catch (Exception e) {
                Debug.fi(HMBaseProfile.TAG, Intrinsics.stringPlus("FetchData WriteOutput Err: ", e.getMessage()));
                atomicBoolean.set(true);
                hMSyncBodyTemperatureProfile.waitingNotify();
            }
        }
        atomicInteger.set(i2);
    }

    @NotNull
    public final Pair<Boolean, byte[]> fetchData(final int targetSize) {
        Pair<Boolean, byte[]> pair = new Pair<>(Boolean.FALSE, null);
        final AtomicReference atomicReference = new AtomicReference(null);
        final AtomicInteger atomicInteger = new AtomicInteger(-1);
        boolean z = false;
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        setControlCallback(new IGattCallback.INotifyCallback() { // from class: hj3
            @Override // com.xiaomi.hm.health.bt.gatt.IGattCallback.INotifyCallback
            public final void notify(byte[] bArr) {
                HMSyncBodyTemperatureProfile.q(atomicBoolean, atomicReference, this, bArr);
            }
        });
        setDataCallback(new IGattCallback.INotifyCallback() { // from class: ij3
            @Override // com.xiaomi.hm.health.bt.gatt.IGattCallback.INotifyCallback
            public final void notify(byte[] bArr) {
                HMSyncBodyTemperatureProfile.r(atomicInteger, atomicBoolean, this, byteArrayOutputStream, targetSize, bArr);
            }
        });
        if (startTransfer() && atomicReference.get() == null) {
            while (!atomicBoolean.get()) {
                atomicBoolean.set(true);
                waiting(20000);
            }
        }
        if (targetSize != byteArrayOutputStream.size()) {
            Debug.fi(HMBaseProfile.TAG, "FetchData Size not match Target Size <" + byteArrayOutputStream.size() + '/' + targetSize + Typography.greater);
            return pair;
        }
        HMNotifyResponse hMNotifyResponse = HMNotifyResponse.parse((byte[]) atomicReference.get());
        if (hMNotifyResponse != null && hMNotifyResponse.isSuccess((byte) 2)) {
            z = true;
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        Pair<Boolean, byte[]> pair2 = new Pair<>(Boolean.valueOf(z), byteArray);
        Debug.fi(HMBaseProfile.TAG, "FetchData: " + pair2 + ", Size: " + byteArray.length);
        return pair2;
    }

    @Override // com.xiaomi.hm.health.bt.profile.gdsp.activity.HMProSyncDataBaseProfile
    @Nullable
    public DataHeader getDataHeader(@NotNull Calendar startTime, byte type) {
        DataHeader dataHeader = getDataHeader(type, (short) startTime.get(1), (byte) (startTime.get(2) + 1), (byte) startTime.get(5), (byte) startTime.get(11), (byte) startTime.get(12), (byte) startTime.get(13), (byte) ProfileUtils.getTimezoneKey(startTime.getTimeZone().getOffset(startTime.getTimeInMillis())));
        if (dataHeader != null) {
            Calendar calendar = dataHeader.calendar;
            calendar.setTimeInMillis(calendar.getTimeInMillis() + ((long) ProfileUtils.getDstOffset(calendar)));
        }
        return dataHeader;
    }

    @Nullable
    public final DataHeader getDataHeader80s(@NotNull Calendar startTime) {
        return getDataHeader(startTime, (byte) 48);
    }

    @Nullable
    public final DataHeader getDataHeaderAllDay(@NotNull Calendar startTime) {
        return getDataHeader(startTime, (byte) 46);
    }

    @Nullable
    public final DataHeader getDataHeaderSingle(@NotNull Calendar startTime) {
        return getDataHeader(startTime, (byte) 47);
    }
}
