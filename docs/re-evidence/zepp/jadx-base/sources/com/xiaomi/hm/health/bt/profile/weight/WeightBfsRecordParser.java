package com.xiaomi.hm.health.bt.profile.weight;

import com.xiaomi.hm.health.bt.model.WeightAdvData;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\n"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/weight/WeightBfsRecordParser;", "Lcom/xiaomi/hm/health/bt/profile/weight/IWeightRecordParser;", "", "byteArray", "", "Lcom/xiaomi/hm/health/bt/model/WeightAdvData;", "parse", "<init>", "()V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class WeightBfsRecordParser implements IWeightRecordParser {
    private static final int a = 13;

    @Override // com.xiaomi.hm.health.bt.profile.weight.IWeightRecordParser
    @NotNull
    public List<WeightAdvData> parse(@NotNull byte[] byteArray) {
        ArrayList arrayList = new ArrayList();
        int length = byteArray.length / 13;
        if (length > 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                byte[] bArr = new byte[13];
                System.arraycopy(byteArray, i * 13, bArr, 0, 13);
                WeightAdvData weightData = WeightBfsProfile.parseWeightData(bArr, false, true);
                if (weightData != null) {
                    arrayList.add(weightData);
                }
                if (i2 >= length) {
                    break;
                }
                i = i2;
            }
        }
        return arrayList;
    }
}
