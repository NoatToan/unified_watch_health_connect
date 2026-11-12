package com.huami.phn.coach.usecase.impl;

import com.huami.phn.coach.usecase.LoadDailyAnalysisUseCase;
import com.huami.phn.coach.usecase.PhnDailyAnalysis;
import com.huami.phn.core.model.PHNDailyAnalysisResult;
import com.huami.phn.core.source.LocalDataSource;
import com.huami.tools.log.HMLog;
import com.xiaomi.mipush.sdk.Constants;
import com.xmlywind.sdk.common.mta.PointCategory;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.q;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00122\u00020\u0001:\u0001\u0004B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0082\bJ.\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H\u0016R\u0016\u0010\u000f\u001a\u00020\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000e¨\u0006\u0013"}, d2 = {"Lcom/huami/phn/coach/usecase/impl/LoadDailyAnalysisUseCaseImpl;", "Lcom/huami/phn/coach/usecase/LoadDailyAnalysisUseCase;", "Ljava/util/Calendar;", "", "a", "", "year", "month", "day", "count", "", "Lcom/huami/phn/coach/usecase/PhnDailyAnalysis;", PointCategory.LOAD, "Lcom/huami/phn/core/source/LocalDataSource;", "Lcom/huami/phn/core/source/LocalDataSource;", "local", "<init>", "(Lcom/huami/phn/core/source/LocalDataSource;)V", "b", "phn_coach_release"}, k = 1, mv = {1, 5, 1})
public final class LoadDailyAnalysisUseCaseImpl implements LoadDailyAnalysisUseCase {

    @Deprecated
    public static final float DEFAULT_VALUE = -10000.0f;

    @Deprecated
    @NotNull
    public static final String TAG = "LoadDailyAnalysisUseCaseImpl";

    @NotNull
    private static final a b = new a(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final LocalDataSource local;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"com/huami/phn/coach/usecase/impl/LoadDailyAnalysisUseCaseImpl$a", "", "", "DEFAULT_VALUE", "F", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "phn_coach_release"}, k = 1, mv = {1, 5, 1})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ Calendar b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Calendar calendar) {
            super(0);
            this.b = calendar;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            Calendar calendar = this.b;
            return "Insert default: " + String.format("%d-%02d-%02d", Arrays.copyOf(new Object[]{Integer.valueOf(calendar.get(1)), Integer.valueOf(calendar.get(2) + 1), Integer.valueOf(calendar.get(5))}, 3));
        }
    }

    public LoadDailyAnalysisUseCaseImpl(@NotNull LocalDataSource localDataSource) {
        this.local = localDataSource;
    }

    private final String a(Calendar calendar) {
        return String.format("%d-%02d-%02d", Arrays.copyOf(new Object[]{Integer.valueOf(calendar.get(1)), Integer.valueOf(calendar.get(2) + 1), Integer.valueOf(calendar.get(5))}, 3));
    }

    @Override // com.huami.phn.coach.usecase.LoadDailyAnalysisUseCase
    @NotNull
    public List<PhnDailyAnalysis> load(int year, int month, int day, int count) {
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("GMT+00:00"));
        calendar.set(year, month - 1, day, 0, 0, 0);
        int i = 0;
        calendar.set(14, 0);
        Unit unit = Unit.INSTANCE;
        List<PHNDailyAnalysisResult> listQueryDailyResult = this.local.queryDailyResult(count, Long.valueOf(calendar.getTimeInMillis()));
        LinkedHashMap linkedHashMap = new LinkedHashMap(e.coerceAtLeast(q.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(listQueryDailyResult, 10)), 16));
        for (PHNDailyAnalysisResult pHNDailyAnalysisResult : listQueryDailyResult) {
            Long lValueOf = Long.valueOf(pHNDailyAnalysisResult.getTimestamp());
            long timestamp = pHNDailyAnalysisResult.getTimestamp();
            int timezoneOffset = pHNDailyAnalysisResult.getTimezoneOffset();
            String str = timezoneOffset > 0 ? Constants.ACCEPT_TIME_SEPARATOR_SERVER : "+";
            int iAbs = Math.abs(timezoneOffset);
            Calendar calendar2 = Calendar.getInstance(TimeZone.getTimeZone(String.format("GMT%s%02d:%02d", Arrays.copyOf(new Object[]{str, Integer.valueOf(iAbs / 60), Integer.valueOf(iAbs % 60)}, 3))));
            calendar2.setTimeInMillis(timestamp);
            linkedHashMap.put(lValueOf, new PhnDailyAnalysis(calendar2, pHNDailyAnalysisResult.getResult().getAtl(), pHNDailyAnalysisResult.getResult().getCtl(), pHNDailyAnalysisResult.getResult().getTsb()));
        }
        ArrayList arrayList = new ArrayList();
        while (i < count) {
            PhnDailyAnalysis phnDailyAnalysis = (PhnDailyAnalysis) linkedHashMap.get(Long.valueOf(calendar.getTimeInMillis()));
            if (phnDailyAnalysis == null) {
                HMLog.info(TAG, new b(calendar));
                phnDailyAnalysis = new PhnDailyAnalysis(calendar, -10000.0f, -10000.0f, -10000.0f);
            }
            arrayList.add(phnDailyAnalysis);
            Calendar calendar3 = Calendar.getInstance(calendar.getTimeZone());
            calendar3.setTimeInMillis(calendar.getTimeInMillis());
            calendar3.add(6, -1);
            i++;
            calendar = calendar3;
        }
        return arrayList;
    }
}
