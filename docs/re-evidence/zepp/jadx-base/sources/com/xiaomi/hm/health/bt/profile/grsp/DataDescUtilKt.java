package com.xiaomi.hm.health.bt.profile.grsp;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\u001c\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000\u001a\u0010\u0010\b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0007\u001a\u00020\u0006\"\u0016\u0010\u000b\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\n\"\u0016\u0010\u000f\u001a\u00020\f8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"", "dataDesc", "Ljava/util/HashMap;", "Lcom/xiaomi/hm/health/bt/profile/grsp/SensorType;", "Lcom/xiaomi/hm/health/bt/profile/grsp/ChannelDescription;", "parseDataDescription", "", "type", "from", "a", LogUtil.I, "CURR_SENSOR_COUNT", "", "b", "Ljava/lang/String;", "TAG", "bluetooth_release"}, k = 2, mv = {1, 5, 1})
public final class DataDescUtilKt {
    private static final int a = 32;

    @NotNull
    private static final String b = "DataDescUtil";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ Throwable a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Throwable th) {
            super(0);
            this.a = th;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("parseDataDescription e: ", this.a);
        }
    }

    @Nullable
    public static final SensorType from(int i) {
        if (i == 14) {
            return SensorType.PP;
        }
        if (i == 16) {
            return SensorType.BODY_TEMPERATURE;
        }
        switch (i) {
            case 0:
                return SensorType.GSENSOR;
            case 1:
                return SensorType.PPG;
            case 2:
                return SensorType.ECG;
            case 3:
                return SensorType.NMEA;
            case 4:
                return SensorType.GYRO;
            case 5:
                return SensorType.ADATA;
            case 6:
                return SensorType.GEO;
            case 7:
                return SensorType.TIME;
            case 8:
                return SensorType.SPO2;
            case 9:
                return SensorType.HR;
            case 10:
                return SensorType.PRESSURE;
            default:
                return null;
        }
    }

    @Nullable
    public static final HashMap<SensorType, ChannelDescription> parseDataDescription(@NotNull byte[] bArr) {
        Object objM3845constructorimpl;
        int i;
        SensorType sensorTypeFrom;
        try {
            Result.Companion companion = Result.Companion;
            HashMap map = new HashMap(16);
            int i2 = 4;
            int i3 = 0;
            int iBytesToInt = GattUtils.bytesToInt(bArr, 0, 4);
            ArrayList arrayList = new ArrayList();
            int i4 = 0;
            while (true) {
                int i5 = i4 + 1;
                if (((1 << i4) & iBytesToInt) != 0 && (sensorTypeFrom = from(i4)) != null) {
                    arrayList.add(sensorTypeFrom);
                }
                if (i5 >= 32) {
                    break;
                }
                i4 = i5;
            }
            ArrayList arrayList2 = new ArrayList();
            int size = arrayList.size();
            if (size > 0) {
                int i6 = 0;
                do {
                    i6++;
                    int i7 = i2 + 1;
                    byte b2 = bArr[i2];
                    ChannelDescription channelDescription = new ChannelDescription();
                    if (b2 > 0) {
                        int i8 = 0;
                        while (true) {
                            i8++;
                            i = i7 + 1;
                            ChannelDataType channelDataTypeFromValue = ChannelDataType.INSTANCE.fromValue(bArr[i7]);
                            if (channelDataTypeFromValue != null) {
                                channelDescription.getChannelDescriptions().add(channelDataTypeFromValue);
                            }
                            if (i8 >= b2) {
                                break;
                            }
                            i7 = i;
                        }
                        i2 = i;
                    } else {
                        i2 = i7;
                    }
                    arrayList2.add(channelDescription);
                } while (i6 < size);
            }
            for (Object obj : arrayList) {
                int i9 = i3 + 1;
                if (i3 < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                map.put((SensorType) obj, arrayList2.get(i3));
                i3 = i9;
            }
            objM3845constructorimpl = Result.m3845constructorimpl(map);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
        if (thM3848exceptionOrNullimpl != null) {
            HMLog.error$default(b, null, null, new a(thM3848exceptionOrNullimpl), 6, null);
        }
        if (Result.m3850isFailureimpl(objM3845constructorimpl)) {
            objM3845constructorimpl = null;
        }
        return (HashMap) objM3845constructorimpl;
    }
}
