package com.xiaomi.hm.health.bt.profile.gdsp.raw;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.internal.ProgressionUtilKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0016\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002*\u00020\u0004H\u0016R\u001c\u0010\u000b\u001a\u00020\u00068\u0016@\u0016X\u0096D¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/raw/HmEcgLostDataCallback;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/raw/HmRawDataCallback;", "", "Lcom/xiaomi/hm/health/bt/profile/gdsp/raw/HmEcgLostData;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/raw/HmGdspRawData;", "parse", "", "a", LogUtil.I, "getDataType", "()I", "dataType", "", "uiThread", "<init>", "(Z)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public class HmEcgLostDataCallback extends HmRawDataCallback<List<? extends HmEcgLostData>> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int dataType;

    public HmEcgLostDataCallback() {
        this(false, 1, null);
    }

    public HmEcgLostDataCallback(boolean z) {
        super(z);
        this.dataType = 45;
    }

    @Override // com.xiaomi.hm.health.bt.profile.gdsp.raw.HmRawDataCallback
    public int getDataType() {
        return this.dataType;
    }

    @Override // com.xiaomi.hm.health.bt.profile.gdsp.raw.HmRawDataCallback
    @NotNull
    public List<? extends HmEcgLostData> parse(@NotNull HmGdspRawData hmGdspRawData) {
        int progressionLastElement;
        ArrayList arrayList = new ArrayList();
        byte[] rawData = hmGdspRawData.getRawData();
        int i = 0;
        if (!(((rawData.length == 0) ^ true) && rawData.length % 8 == 0)) {
            rawData = null;
        }
        if (rawData != null && (progressionLastElement = ProgressionUtilKt.getProgressionLastElement(0, rawData.length - 1, 8)) >= 0) {
            while (true) {
                int i2 = i + 8;
                arrayList.add(new HmEcgLostData(GattUtils.bytesToInt(rawData, i, 4), GattUtils.bytesToInt(rawData, i + 4, 4)));
                if (i == progressionLastElement) {
                    break;
                }
                i = i2;
            }
        }
        return arrayList;
    }

    public /* synthetic */ HmEcgLostDataCallback(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }
}
