package com.xiaomi.fitness.common;

import com.xiaomi.fitness.common.utils.TimeDateUtil;
import defpackage.c4f;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class DataManualModel implements Comparable<DataManualModel>, Serializable {
    public boolean isDayFirstData = false;
    public long recordTime;
    public int recordValue;
    public int sportDataType;
    public String valueAppend;

    public DataManualModel(ManualItem manualItem, int i) {
        this.recordTime = manualItem.time;
        int iA = c4f.a(i, manualItem);
        this.recordValue = iA;
        this.sportDataType = i;
        this.valueAppend = c4f.b(iA, i);
    }

    public static void setFirstDayFlag(List<DataManualModel> list) {
        int size = list.size();
        if (size > 0) {
            int i = 0;
            list.get(0).isDayFirstData = true;
            if (size > 1) {
                while (i < size - 1) {
                    DataManualModel dataManualModel = list.get(i);
                    i++;
                    DataManualModel dataManualModel2 = list.get(i);
                    if (!TimeDateUtil.isSameLocalDate(TimeDateUtil.timestampToLocalDate(dataManualModel.recordTime), TimeDateUtil.timestampToLocalDate(dataManualModel2.recordTime))) {
                        dataManualModel2.isDayFirstData = true;
                    }
                }
            }
        }
    }

    @Override // java.lang.Comparable
    public int compareTo(DataManualModel dataManualModel) {
        return (int) (dataManualModel.recordTime - this.recordTime);
    }
}
