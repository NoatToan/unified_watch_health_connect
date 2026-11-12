package com.huami.core.device.feature.gps.filter;

import androidx.annotation.Keep;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¨\u0006\b"}, d2 = {"Lcom/huami/core/device/feature/gps/filter/DataItemOutCallback;", "", "Lcom/huami/core/device/feature/gps/filter/GpsPointWrapper;", "point", "", "hasNext", "", "onItemBack", "gps-filter_release"}, k = 1, mv = {1, 4, 0})
public interface DataItemOutCallback {
    void onItemBack(@Nullable GpsPointWrapper point, boolean hasNext);
}
