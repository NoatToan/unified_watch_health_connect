package com.huami.bluetooth.profile.generic;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bluetooth.profile.Request;
import com.huami.bluetooth.profile.ecf.data.Equalizer;
import com.huami.bluetooth.profile.ecf.data.EqualizerKt;
import com.huami.bluetooth.profile.ecf.data.HeadsetKnockSetting;
import com.huami.bluetooth.profile.ecf.data.HeadsetKnockSettingKt;
import com.huami.bluetooth.profile.ecf.data.Sn;
import com.huami.bluetooth.profile.ecf.data.SnKt;
import com.huami.bluetooth.utils.ByteUtilsKt;
import com.tekartik.sqflite.Constant;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.profile.base.BatteryInfo;
import com.xiaomi.hm.health.bt.profile.feature.Feature;
import com.xiaomi.hm.health.bt.profile.feature.HMFeatureProfile;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 !2\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u001e\u001a\u00020\u001c¢\u0006\u0004\b\u001f\u0010 J\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\u001e\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\u0012\u0010\r\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u0010\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eH\u0016J\n\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016J\u000e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u000eH\u0016J\n\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016J\n\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u001a\u001a\u00020\u0019H\u0016R\u0016\u0010\u001e\u001a\u00020\u001c8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001d¨\u0006\""}, d2 = {"Lcom/huami/bluetooth/profile/generic/GenericControllerImpl;", "Lcom/huami/bluetooth/profile/generic/GenericController;", "Lcom/huami/bluetooth/profile/generic/GenericCommand;", Constant.h, "", "data", "a", "Lcom/huami/bluetooth/profile/Request$Command;", "command", "Lcom/huami/bluetooth/profile/generic/GenericResponse;", "c", "Lcom/huami/bluetooth/profile/Request;", "request", GoogleApiAvailabilityLight.a, "", "Lcom/xiaomi/hm/health/bt/profile/base/BatteryInfo;", "getBatteryInfoList", "Lcom/huami/bluetooth/profile/ecf/data/Equalizer;", "getEqualizer", "Lcom/huami/bluetooth/profile/ecf/data/Sn;", "getSnList", "Lcom/huami/bluetooth/profile/ecf/data/HeadsetKnockSetting;", "getHeadsetKnockSetting", "Lcom/xiaomi/hm/health/bt/profile/feature/Feature;", "getDeviceFeature", "", "type", "getSensorDesc", "Lcom/huami/bluetooth/profile/generic/GenericNotifyCharacteristic;", "Lcom/huami/bluetooth/profile/generic/GenericNotifyCharacteristic;", "characteristic", "<init>", "(Lcom/huami/bluetooth/profile/generic/GenericNotifyCharacteristic;)V", "b", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class GenericControllerImpl implements GenericController {

    @Deprecated
    @NotNull
    public static final String TAG = "GenericControllerImpl";

    @NotNull
    private static final a b = new a(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final GenericNotifyCharacteristic characteristic;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"com/huami/bluetooth/profile/generic/GenericControllerImpl$a", "", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public GenericControllerImpl(@NotNull GenericNotifyCharacteristic genericNotifyCharacteristic) {
        this.characteristic = genericNotifyCharacteristic;
    }

    private final byte[] a(GenericCommand cmd, byte[] data) {
        GenericResponse genericResponseC = c(cmd, data);
        if (genericResponseC != null && genericResponseC.isSuccess(cmd.getValue())) {
            return genericResponseC.getData();
        }
        return null;
    }

    public static /* synthetic */ byte[] b(GenericControllerImpl genericControllerImpl, GenericCommand genericCommand, byte[] bArr, int i, Object obj) {
        if ((i & 2) != 0) {
            bArr = null;
        }
        return genericControllerImpl.a(genericCommand, bArr);
    }

    private final GenericResponse c(Request.Command command, byte[] data) {
        return d(new Request(command, data));
    }

    private final GenericResponse d(Request request) {
        return this.characteristic.send(request.getOrg.cybergarage.http.HTTP.CONTENT_RANGE_BYTES java.lang.String());
    }

    public static /* synthetic */ GenericResponse e(GenericControllerImpl genericControllerImpl, Request.Command command, byte[] bArr, int i, Object obj) {
        if ((i & 2) != 0) {
            bArr = null;
        }
        return genericControllerImpl.c(command, bArr);
    }

    @Override // com.huami.bluetooth.profile.generic.GenericController
    @Nullable
    public List<BatteryInfo> getBatteryInfoList() {
        byte[] bArrB = b(this, GenericCommand.GetBatteryInfo.INSTANCE, null, 2, null);
        if (bArrB == null) {
            return null;
        }
        return BatteryInfo.parseBatteryInfoList(bArrB);
    }

    @Override // com.huami.bluetooth.profile.generic.GenericController
    @Nullable
    public Feature getDeviceFeature() {
        byte[] bArrB = b(this, GenericCommand.DeviceFeature.INSTANCE, null, 2, null);
        if (bArrB != null && bArrB.length >= 2) {
            return HMFeatureProfile.fromByteArray(bArrB);
        }
        return null;
    }

    @Override // com.huami.bluetooth.profile.generic.GenericController
    @Nullable
    public Equalizer getEqualizer() {
        byte[] bArrB = b(this, GenericCommand.GetEq.INSTANCE, null, 2, null);
        if (bArrB == null) {
            return null;
        }
        return EqualizerKt.toEqualizer(bArrB);
    }

    @Override // com.huami.bluetooth.profile.generic.GenericController
    @Nullable
    public HeadsetKnockSetting getHeadsetKnockSetting() {
        byte[] bArrB = b(this, GenericCommand.HeadsetKnockingNew.INSTANCE, null, 2, null);
        if (bArrB == null) {
            return null;
        }
        return HeadsetKnockSettingKt.toHeadsetKnockSettingNew(bArrB);
    }

    @Override // com.huami.bluetooth.profile.generic.GenericController
    @Nullable
    public byte[] getSensorDesc(int type) {
        return a(GenericCommand.GetSensorDesc.INSTANCE, ByteUtilsKt.toByteArray$default(type, 0, 1, null));
    }

    @Override // com.huami.bluetooth.profile.generic.GenericController
    @NotNull
    public List<Sn> getSnList() {
        List<Sn> listEmptyList;
        List<Sn> list = null;
        byte[] bArrB = b(this, GenericCommand.GetSnInfo.INSTANCE, null, 2, null);
        if (bArrB != null) {
            if (bArrB.length > 1) {
                Debug.fi(TAG, Intrinsics.stringPlus("SN count: ", Byte.valueOf(bArrB[0])));
                listEmptyList = SnKt.toSnList(ArraysKt___ArraysJvmKt.copyOfRange(bArrB, 1, bArrB.length));
                Debug.fi(TAG, Intrinsics.stringPlus("Parsed SN: ", listEmptyList));
            } else {
                listEmptyList = CollectionsKt__CollectionsKt.emptyList();
            }
            list = listEmptyList;
        }
        return list == null ? CollectionsKt__CollectionsKt.emptyList() : list;
    }
}
