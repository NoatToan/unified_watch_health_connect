package com.xiaomi.fitness.data.valueformatter;

import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import defpackage.onq;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/xiaomi/fitness/data/valueformatter/XAxisTargetFormatter;", "Lonq;", "Lcom/xiaomi/fitness/chart/entrys/RecyclerBarEntry;", "barEntry", "", "getBarLabel", "(Lcom/xiaomi/fitness/chart/entrys/RecyclerBarEntry;)Ljava/lang/String;", "<init>", "()V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nXAxisTargetFormatter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 XAxisTargetFormatter.kt\ncom/xiaomi/fitness/data/valueformatter/XAxisTargetFormatter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,12:1\n1#2:13\n*E\n"})
public final class XAxisTargetFormatter extends onq {
    @Override // defpackage.onq
    @NotNull
    public String getBarLabel(@NotNull RecyclerBarEntry barEntry) {
        String weekSimpleStr;
        Intrinsics.checkNotNullParameter(barEntry, "barEntry");
        LocalDate localDate = barEntry.localDate;
        return (localDate == null || (weekSimpleStr = TimeDateUtil.getWeekSimpleStr(localDate)) == null) ? "" : weekSimpleStr;
    }
}
