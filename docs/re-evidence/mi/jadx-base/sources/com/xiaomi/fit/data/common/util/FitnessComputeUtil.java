package com.xiaomi.fit.data.common.util;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J.\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00060\u00050\u0005\"\u0004\b\u0000\u0010\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00060\u00052\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, d2 = {"Lcom/xiaomi/fit/data/common/util/FitnessComputeUtil;", "", "<init>", "()V", "divideListByLimitSize", "", "T", "srcList", "limit", "", "fitness-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFitnessComputeUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FitnessComputeUtil.kt\ncom/xiaomi/fit/data/common/util/FitnessComputeUtil\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,28:1\n1#2:29\n*E\n"})
public final class FitnessComputeUtil {

    @NotNull
    public static final FitnessComputeUtil INSTANCE = new FitnessComputeUtil();

    private FitnessComputeUtil() {
    }

    @NotNull
    public final <T> List<List<T>> divideListByLimitSize(@NotNull List<? extends T> srcList, int limit) {
        Intrinsics.checkNotNullParameter(srcList, "srcList");
        if (limit <= 0) {
            throw new IllegalArgumentException(("divideListByLimitSize invalid limit = " + limit).toString());
        }
        ArrayList arrayList = new ArrayList();
        int size = srcList.size();
        int i = size / limit;
        int i2 = size % limit;
        int i3 = 0;
        while (i3 < i) {
            int i4 = i3 * limit;
            i3++;
            arrayList.add(srcList.subList(i4, i3 * limit));
        }
        if (i3 == i && i2 > 0) {
            arrayList.add(srcList.subList(i3 * limit, size));
        }
        return arrayList;
    }
}
