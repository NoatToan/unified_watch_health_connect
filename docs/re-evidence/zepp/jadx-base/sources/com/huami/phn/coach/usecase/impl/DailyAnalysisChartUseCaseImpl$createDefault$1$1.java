package com.huami.phn.coach.usecase.impl;

import java.util.Arrays;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
public final class DailyAnalysisChartUseCaseImpl$createDefault$1$1 extends Lambda implements Function0<String> {
    public final /* synthetic */ DailyAnalysisChartUseCaseImpl a;
    public final /* synthetic */ Calendar b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DailyAnalysisChartUseCaseImpl$createDefault$1$1(DailyAnalysisChartUseCaseImpl dailyAnalysisChartUseCaseImpl, Calendar calendar) {
        super(0);
        this.a = dailyAnalysisChartUseCaseImpl;
        this.b = calendar;
    }

    @Override // kotlin.jvm.functions.Function0
    @Nullable
    public final String invoke() {
        Calendar calendar = this.b;
        return "Insert default: " + String.format("%d-%02d-%02d", Arrays.copyOf(new Object[]{Integer.valueOf(calendar.get(1)), Integer.valueOf(calendar.get(2) + 1), Integer.valueOf(calendar.get(5))}, 3));
    }
}
