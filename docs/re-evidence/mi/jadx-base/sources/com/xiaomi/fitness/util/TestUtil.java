package com.xiaomi.fitness.util;

import com.xiaomi.fit.data.common.data.sport.Location;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005R\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/util/TestUtil;", "", "<init>", "()V", "gpsValues", "", "Lcom/xiaomi/fit/data/common/data/sport/Location;", "getGpsValues", "()Ljava/util/List;", "setGpsValues", "(Ljava/util/List;)V", "putGpsValues", "", "value", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TestUtil {

    @NotNull
    public static final TestUtil INSTANCE = new TestUtil();

    @Nullable
    private static List<? extends Location> gpsValues;

    private TestUtil() {
    }

    @Nullable
    public final List<Location> getGpsValues() {
        return gpsValues;
    }

    public final void putGpsValues(@NotNull List<? extends Location> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        gpsValues = value;
    }

    public final void setGpsValues(@Nullable List<? extends Location> list) {
        gpsValues = list;
    }
}
