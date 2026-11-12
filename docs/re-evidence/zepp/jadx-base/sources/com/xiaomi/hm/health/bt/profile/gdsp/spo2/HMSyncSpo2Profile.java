package com.xiaomi.hm.health.bt.profile.gdsp.spo2;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.exoplayer2.text.ttml.b;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.gatt.GattPeripheral;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.bt.gatt.IGattCallback;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.DataHeader;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.HMProSyncDataBaseProfile;
import com.xiaomi.hm.health.bt.profile.gdsp.spo2.HMSyncSpo2Profile;
import com.xiaomi.hm.health.bt.profile.gdsp.spo2.p005extends.Spo2OsaDataExtends;
import com.xiaomi.hm.health.bt.profile.gdsp.spo2.p005extends.Spo2PointDataExtends;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
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
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 (2\u00020\u0001:\u0001(B!\b\u0000\u0012\u0006\u0010%\u001a\u00020$\u0012\u0006\u0010\u0019\u001a\u00020\u0016\u0012\u0006\u0010\u001d\u001a\u00020\u001a¢\u0006\u0004\b&\u0010'J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0010\u001a\u00020\u000fJ\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002J\u0018\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010#\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010 ¨\u0006)"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/spo2/HMSyncSpo2Profile;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/activity/HMProSyncDataBaseProfile;", "", "values", "", "Lcom/xiaomi/hm/health/bt/profile/gdsp/spo2/Spo2OdiData;", "w", "Lcom/xiaomi/hm/health/bt/profile/gdsp/spo2/Spo2OsaEventYorkData;", "v", "Lcom/xiaomi/hm/health/bt/profile/gdsp/spo2/Spo2Data;", "u", "Lcom/xiaomi/hm/health/bt/profile/gdsp/spo2/Spo2OsaData;", SOAP.XMLNS, "Lcom/xiaomi/hm/health/bt/profile/gdsp/spo2/Spo2PointData;", "t", "Ljava/util/Calendar;", "startTime", "Lcom/xiaomi/hm/health/bt/profile/gdsp/activity/DataHeader;", "getDataHeader", "fetchData", "data", "parseData", "", GoogleApiAvailabilityLight.b, "B", "type", "", "o", "Z", "supportVersion", "", b.r, LogUtil.I, "version", DTransferConstants.SEARCH_KEY, "lastIndex", "Lcom/xiaomi/hm/health/bt/gatt/GattPeripheral;", "gattPeripheral", "<init>", "(Lcom/xiaomi/hm/health/bt/gatt/GattPeripheral;BZ)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class HMSyncSpo2Profile extends HMProSyncDataBaseProfile {

    @NotNull
    private static final String r = "HMSyncSpo2Profile";

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final byte type;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final boolean supportVersion;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private int version;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private int lastIndex;

    public HMSyncSpo2Profile(@NotNull GattPeripheral gattPeripheral, byte b, boolean z) {
        super(gattPeripheral);
        this.type = b;
        this.supportVersion = z;
        this.lastIndex = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(HMSyncSpo2Profile hMSyncSpo2Profile, AtomicBoolean atomicBoolean, ByteArrayOutputStream byteArrayOutputStream, byte[] bArr) {
        Debug.fi(r, Intrinsics.stringPlus("data:", GattUtils.bytesToHexString(bArr)));
        int i = bArr[0] & 255;
        if (HMProSyncDataBaseProfile.isPackageMissing(hMSyncSpo2Profile.lastIndex, i)) {
            Debug.fi(r, "missing package!!!");
            atomicBoolean.getAndSet(true);
            hMSyncSpo2Profile.waitingNotify();
        } else {
            try {
                if (hMSyncSpo2Profile.supportVersion && hMSyncSpo2Profile.lastIndex == -1) {
                    hMSyncSpo2Profile.version = bArr[1] & 255;
                    byteArrayOutputStream.write(bArr, 2, bArr.length - 2);
                } else {
                    byteArrayOutputStream.write(bArr, 1, bArr.length - 1);
                }
            } catch (Exception e) {
                Debug.fi(r, Intrinsics.stringPlus("exception:", e.getMessage()));
                atomicBoolean.getAndSet(true);
                hMSyncSpo2Profile.waitingNotify();
            }
        }
        hMSyncSpo2Profile.lastIndex = i;
        atomicBoolean.set(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(AtomicBoolean atomicBoolean, HMSyncSpo2Profile hMSyncSpo2Profile, byte[] bArr) {
        Debug.fi(r, Intrinsics.stringPlus("control:", GattUtils.bytesToHexString(bArr)));
        atomicBoolean.set(true);
        hMSyncSpo2Profile.waitingNotify();
    }

    private final List<Spo2OsaData> s(byte[] values) {
        if (!this.supportVersion) {
            return Spo2OsaData.INSTANCE.parse(values);
        }
        int i = this.version;
        if (i == 1) {
            return Spo2OsaData.INSTANCE.parse(values);
        }
        if (i == 2) {
            return Spo2OsaDataExtends.INSTANCE.parse(values);
        }
        Debug.fi(r, "type: " + ((int) this.type) + ", version: " + this.version + " not support!");
        return null;
    }

    private final List<Spo2PointData> t(byte[] values) {
        if (!this.supportVersion) {
            return Spo2PointData.INSTANCE.parse(values);
        }
        int i = this.version;
        if (i == 1) {
            return Spo2PointData.INSTANCE.parse(values);
        }
        if (i == 2) {
            return Spo2PointDataExtends.INSTANCE.parse(values);
        }
        Debug.fi(r, "type: " + ((int) this.type) + ", version: " + this.version + " not support!");
        return null;
    }

    private final List<Spo2Data> u(byte[] values) {
        if (!this.supportVersion) {
            return Spo2OsaEventData.INSTANCE.parse(values);
        }
        int i = this.version;
        if (i == 1) {
            return Spo2OsaEventYorkData.INSTANCE.parse(values);
        }
        if (i == 2) {
            return Spo2OsaEventData.INSTANCE.parse(values);
        }
        Debug.fi(r, "type: " + ((int) this.type) + ", version: " + this.version + " not support!");
        return null;
    }

    private final List<Spo2OsaEventYorkData> v(byte[] values) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < values.length; i += 5) {
            arrayList.add(new Spo2OsaEventYorkData(GattUtils.bytesToLong(values, i, 4), values[i + 4]));
        }
        return arrayList;
    }

    private final List<Spo2OdiData> w(byte[] values) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < values.length; i += 12) {
            arrayList.add(new Spo2OdiData(GattUtils.bytesToLong(values, i, 4), GattUtils.bytesToLong(values, i + 4, 4), GattUtils.bytesToLong(values, i + 8, 4)));
        }
        return arrayList;
    }

    @Nullable
    public final byte[] fetchData() {
        this.lastIndex = -1;
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        setDataCallback(new IGattCallback.INotifyCallback() { // from class: zj3
            @Override // com.xiaomi.hm.health.bt.gatt.IGattCallback.INotifyCallback
            public final void notify(byte[] bArr) {
                HMSyncSpo2Profile.q(this.a, atomicBoolean, byteArrayOutputStream, bArr);
            }
        });
        setControlCallback(new IGattCallback.INotifyCallback() { // from class: ak3
            @Override // com.xiaomi.hm.health.bt.gatt.IGattCallback.INotifyCallback
            public final void notify(byte[] bArr) {
                HMSyncSpo2Profile.r(atomicBoolean, this, bArr);
            }
        });
        if (startTransfer()) {
            while (!atomicBoolean.get()) {
                atomicBoolean.set(true);
                waiting(20000);
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    @Nullable
    public final DataHeader getDataHeader(@NotNull Calendar startTime) {
        return getDataHeader(startTime, this.type);
    }

    @Nullable
    public final List<Spo2Data> parseData(@Nullable byte[] data) {
        if (data == null) {
            return null;
        }
        try {
            byte b = this.type;
            if (b == 37) {
                return t(data);
            }
            if (b == 38) {
                return s(data);
            }
            if (b == 39) {
                return u(data);
            }
            if (b == 43) {
                return Spo2OsaEventYorkData.INSTANCE.parse(data);
            }
            if (b == 40) {
                return w(data);
            }
            return null;
        } catch (Exception e) {
            Debug.fi(r, Intrinsics.stringPlus("parseSpo2Data exception:", e.getMessage()));
            return null;
        }
    }
}
