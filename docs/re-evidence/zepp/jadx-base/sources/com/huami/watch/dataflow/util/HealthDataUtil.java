package com.huami.watch.dataflow.util;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.huami.watch.dataflow.model.health.HealthDataManager;
import com.huami.watch.dataflow.model.health.bean.HealthDataItem;
import com.huami.watch.dataflow.model.health.bean.HealthRawDataItem;
import com.huami.watch.util.BytesUtil;
import com.huami.watch.util.Log;
import java.util.ArrayList;
import java.util.List;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;

/* JADX INFO: loaded from: classes16.dex */
public final class HealthDataUtil {
    private static final String a = "DataFlow-HealthDataUtil";

    private HealthDataUtil() {
    }

    @NonNull
    public static List<HealthDataItem> mergeWithLocalByDate(@NonNull HealthRawDataItem healthRawDataItem) {
        ArrayList arrayList;
        HealthRawDataItem.MetaData[] metaDataArr;
        HealthDataManager healthDataManager;
        int i;
        ArrayList arrayList2 = new ArrayList();
        HealthRawDataItem.MetaData[] metadata = healthRawDataItem.getMetadata();
        if (metadata != null && metadata.length > 0) {
            arrayList2 = new ArrayList(metadata.length);
            HealthDataManager manager = HealthDataManager.getManager();
            int length = metadata.length;
            int i2 = 0;
            while (i2 < length) {
                HealthRawDataItem.MetaData metaData = metadata[i2];
                String date = metaData.getDate();
                if (TextUtils.isEmpty(date)) {
                    arrayList = arrayList2;
                    metaDataArr = metadata;
                    healthDataManager = manager;
                    i = length;
                } else {
                    HealthDataItem healthDataItem = manager.get(date);
                    if (healthDataItem == null) {
                        healthDataItem = new HealthDataItem(date);
                    }
                    arrayList2.add(healthDataItem);
                    byte[] data = healthDataItem.getData();
                    byte[] heartRateData = healthDataItem.getHeartRateData();
                    HealthRawDataItem.MetaDataValue[] values = metaData.getValues();
                    int length2 = values.length;
                    int i3 = 0;
                    while (i3 < length2) {
                        HealthRawDataItem.MetaDataValue metaDataValue = values[i3];
                        int start = metaDataValue.getStart();
                        int stop = metaDataValue.getStop();
                        if (start > stop) {
                            Log.w(a, start + SearchCriteria.GT + stop, new Object[0]);
                            return arrayList2;
                        }
                        ArrayList arrayList3 = arrayList2;
                        byte[] bytes = HealthDataParser.toBytes(metaDataValue.getValue());
                        HealthRawDataItem.MetaData[] metaDataArr2 = metadata;
                        StringBuilder sb = new StringBuilder();
                        HealthDataManager healthDataManager2 = manager;
                        sb.append("RawData : ");
                        sb.append(BytesUtil.log(bytes));
                        int i4 = length;
                        Log.d(a, sb.toString(), new Object[0]);
                        byte[] bytes2 = HealthDataParser.toBytes(metaDataValue.getHeartRateData());
                        Log.d(a, "RawDataHeartRate : " + BytesUtil.log(bytes2), new Object[0]);
                        if (bytes != null && bytes.length > 0) {
                            byte[] bArrMergeRawData = HealthDataParser.mergeRawData(bytes, data, start, stop);
                            Log.d(a, "MergedRawData : " + BytesUtil.log(bArrMergeRawData), new Object[0]);
                            data = bArrMergeRawData;
                        }
                        if (bytes2 != null && bytes2.length > 0) {
                            byte[] bArrMergeRawDataHeartRate = HealthDataParser.mergeRawDataHeartRate(bytes2, heartRateData, start, stop);
                            Log.d(a, "MergedHeartRateData : " + BytesUtil.log(bArrMergeRawDataHeartRate), new Object[0]);
                            heartRateData = bArrMergeRawDataHeartRate;
                        }
                        i3++;
                        metadata = metaDataArr2;
                        arrayList2 = arrayList3;
                        manager = healthDataManager2;
                        length = i4;
                    }
                    arrayList = arrayList2;
                    metaDataArr = metadata;
                    healthDataManager = manager;
                    i = length;
                    healthDataItem.setData(data);
                    healthDataItem.setHeartRateData(heartRateData);
                    healthDataItem.setSummary(metaData.getSummary());
                    healthDataItem.setDID(healthRawDataItem.getDId());
                }
                i2++;
                metadata = metaDataArr;
                arrayList2 = arrayList;
                manager = healthDataManager;
                length = i;
            }
        }
        return arrayList2;
    }
}
