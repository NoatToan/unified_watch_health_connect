package com.xiaomi.hm.health.bt.profile.gdsp.raw;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0016\u0018\u0000 \r2\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001:\u0001\rB\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002*\u00020\u0004H\u0016R\u001c\u0010\u0007\u001a\u00020\u00068\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/raw/HmAfCallback;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/raw/HmRawDataCallback;", "", "Lcom/xiaomi/hm/health/bt/profile/gdsp/raw/HmAfData;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/raw/HmGdspRawData;", "parse", "", "dataType", LogUtil.I, "getDataType", "()I", "<init>", "(I)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public class HmAfCallback extends HmRawDataCallback<List<? extends HmAfData>> {
    private static final int BYTES_PER_AF_RESULT = 5;
    private final int dataType;

    public HmAfCallback(int i) {
        super(false);
        this.dataType = i;
    }

    @Override // com.xiaomi.hm.health.bt.profile.gdsp.raw.HmRawDataCallback
    public int getDataType() {
        return this.dataType;
    }

    @Override // com.xiaomi.hm.health.bt.profile.gdsp.raw.HmRawDataCallback
    @NotNull
    public List<? extends HmAfData> parse(@NotNull HmGdspRawData hmGdspRawData) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            int i2 = i + 5;
            if (i2 > hmGdspRawData.getRawData().length) {
                return arrayList;
            }
            arrayList.add(new HmAfData(GattUtils.bytesToLong(hmGdspRawData.getRawData(), i, 4) * ((long) 1000), hmGdspRawData.getRawData()[i + 4] & 255));
            i = i2;
        }
    }
}
