package com.huami.device.core.agps.comm;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.bluetooth.utils.ByteUtilsKt;
import com.huami.mifit.sportlib.common.DataTypeSource;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.json.internal.JsonLexerKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0018\b\u0086\u0001\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0019\b\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u0016\u0010\u0006\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0016\u0010\b\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0007j\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001b¨\u0006\u001c"}, d2 = {"Lcom/huami/device/core/agps/comm/AGPSGroup;", "", "", "intValue", "", "toString", "bitIndex", LogUtil.I, "uihValue", "<init>", "(Ljava/lang/String;III)V", "Companion", "GPS_CEP", "GPS_ALMANAC", "GPS_NEMA", "GLONASS_ALMANAC", "GPS_LLE_BEIDOU", "GPS_LLE_GPS", "GPS_LLE_GLONASS", "GPS_GALILEO", "GPS_LLE_QZSS", "GPS_LTO", "FILE_TYPE_GPS_EPO", "FILE_TYPE_GPS_EPO_GAL", "FILE_TYPE_GPS_EPO_BDS", "FILE_TYPE_GPS_EPO_QZS", "FILE_TYPE_BDS_ALMANAC", "FILE_TYPE_GAL_ALMANAC", "agps-impl_release"}, k = 1, mv = {1, 4, 0})
public enum AGPSGroup {
    GPS_CEP(0, 4),
    GPS_ALMANAC(1, 5),
    GPS_NEMA(2, 6),
    GLONASS_ALMANAC(3, 15),
    GPS_LLE_BEIDOU(4, 134),
    GPS_LLE_GPS(5, 135),
    GPS_LLE_GLONASS(6, 136),
    GPS_GALILEO(7, 137),
    GPS_LLE_QZSS(8, 138),
    GPS_LTO(9, 139),
    FILE_TYPE_GPS_EPO(10, 140),
    FILE_TYPE_GPS_EPO_GAL(11, 141),
    FILE_TYPE_GPS_EPO_BDS(12, 142),
    FILE_TYPE_GPS_EPO_QZS(13, 143),
    FILE_TYPE_BDS_ALMANAC(14, DataTypeSource.SPORT_TYPE_BRIDGE),
    FILE_TYPE_GAL_ALMANAC(15, 177);


    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final int bitIndex;
    private final int uihValue;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0002¨\u0006\u000b"}, d2 = {"Lcom/huami/device/core/agps/comm/AGPSGroup$Companion;", "", "", "bitCount", "a", "flag", "", "Lcom/huami/device/core/agps/comm/AGPSGroup;", "decode", "<init>", "()V", "agps-impl_release"}, k = 1, mv = {1, 4, 0})
    public static final class Companion {
        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int a(int bitCount) {
            return 1 << bitCount;
        }

        @NotNull
        public final Iterable<AGPSGroup> decode(int flag) {
            AGPSGroup[] aGPSGroupArrValues = AGPSGroup.values();
            ArrayList arrayList = new ArrayList();
            for (AGPSGroup aGPSGroup : aGPSGroupArrValues) {
                if ((AGPSGroup.INSTANCE.a(aGPSGroup.bitIndex) & flag) == aGPSGroup.intValue()) {
                    arrayList.add(aGPSGroup);
                }
            }
            return arrayList;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    AGPSGroup(int i, int i2) {
        this.bitIndex = i;
        this.uihValue = i2;
    }

    public final int intValue() {
        return INSTANCE.a(this.bitIndex);
    }

    @Override // java.lang.Enum
    @NotNull
    public String toString() {
        return name() + '(' + this.bitIndex + JsonLexerKt.COLON + this.uihValue + ":0x" + GattUtils.bytesToHexString(ByteUtilsKt.toByteArray(this.uihValue, 1)) + ')';
    }
}
