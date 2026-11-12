package com.xiaomi.fit.fitness.export.data.aggregation;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\tH&¨\u0006\n"}, d2 = {"Lcom/xiaomi/fit/fitness/export/data/aggregation/IRainbowSourceData;", "", "getTimeStamp", "", "getSourceData", "", "isValidate", "", "simpleInfo", "", "fitness-data-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface IRainbowSourceData {
    int getSourceData();

    long getTimeStamp();

    boolean isValidate();

    @NotNull
    String simpleInfo();
}
