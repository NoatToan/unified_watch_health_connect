package com.huami.devicex.injection.data;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H&¨\u0006\u0007"}, d2 = {"Lcom/huami/devicex/injection/data/DateFormatApi;", "", "", "getCreateTime", "time", "", "formatDateSimple", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public interface DateFormatApi {
    @NotNull
    String formatDateSimple(long time);

    long getCreateTime();
}
