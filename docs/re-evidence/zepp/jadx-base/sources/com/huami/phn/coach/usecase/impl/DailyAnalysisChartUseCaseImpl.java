package com.huami.phn.coach.usecase.impl;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.phn.coach.usecase.DailyAnalysisUseCase;
import com.huami.phn.coach.usecase.PhnDailyAnalysis;
import com.huami.tools.log.HMLog;
import com.xmlywind.sdk.common.mta.PointCategory;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u0000 \f2\u00020\u0001:\u0001\u000eB\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0082\bJ\u0017\u0010\u0007\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0082\bJ\r\u0010\t\u001a\u00020\b*\u00020\bH\u0082\bJ\u0011\u0010\f\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\nH\u0082\bJ\u0011\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\bH\u0082\bJ\r\u0010\u0010\u001a\u00020\u000f*\u00020\bH\u0082\bJ\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u00112\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u0016\u0010\u0014\u001a\u00020\u00018\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0013R\"\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00050\u00158\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0017R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0019R\u0016\u0010\u001d\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u001c¨\u0006 "}, d2 = {"Lcom/huami/phn/coach/usecase/impl/DailyAnalysisChartUseCaseImpl;", "Lcom/huami/phn/coach/usecase/DailyAnalysisUseCase;", "Lkotlin/Function0;", "", "loadToCache", "Lcom/huami/phn/coach/usecase/PhnDailyAnalysis;", "c", GoogleApiAvailabilityLight.a, "Ljava/util/Calendar;", "f", "", "size", "e", "cal", "a", "", "b", "", PointCategory.LOAD, "Lcom/huami/phn/coach/usecase/DailyAnalysisUseCase;", "origin", "", "", "Ljava/util/Map;", "cache", "Ljava/util/Calendar;", "lastCalendar", "", "Z", "noMoreData", "<init>", "(Lcom/huami/phn/coach/usecase/DailyAnalysisUseCase;)V", "phn_coach_release"}, k = 1, mv = {1, 5, 1})
public final class DailyAnalysisChartUseCaseImpl implements DailyAnalysisUseCase {

    @Deprecated
    public static final float DEFAULT_VALUE = -10000.0f;

    @Deprecated
    @NotNull
    public static final String TAG = "DailyAnalysisChartUseCaseImpl";

    @NotNull
    private static final a e = new a(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final DailyAnalysisUseCase origin;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Map<Long, PhnDailyAnalysis> cache = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private Calendar lastCalendar;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private boolean noMoreData;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"com/huami/phn/coach/usecase/impl/DailyAnalysisChartUseCaseImpl$a", "", "", "DEFAULT_VALUE", "F", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "phn_coach_release"}, k = 1, mv = {1, 5, 1})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public DailyAnalysisChartUseCaseImpl(@NotNull DailyAnalysisUseCase dailyAnalysisUseCase) {
        this.origin = dailyAnalysisUseCase;
    }

    private final PhnDailyAnalysis a(Calendar cal) {
        HMLog.info(TAG, new DailyAnalysisChartUseCaseImpl$createDefault$1$1(this, cal));
        return new PhnDailyAnalysis(cal, -10000.0f, -10000.0f, -10000.0f);
    }

    private final String b(Calendar calendar) {
        return String.format("%d-%02d-%02d", Arrays.copyOf(new Object[]{Integer.valueOf(calendar.get(1)), Integer.valueOf(calendar.get(2) + 1), Integer.valueOf(calendar.get(5))}, 3));
    }

    private final PhnDailyAnalysis c(Function0<Unit> loadToCache) {
        loadToCache.invoke();
        PhnDailyAnalysis phnDailyAnalysis = (PhnDailyAnalysis) CollectionsKt.firstOrNull(this.cache.values());
        if (phnDailyAnalysis != null) {
            this.cache.remove(Long.valueOf(phnDailyAnalysis.getDate().getTimeInMillis()));
            this.lastCalendar = phnDailyAnalysis.getDate();
            return phnDailyAnalysis;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        calendar.add(6, -1);
        Unit unit = Unit.INSTANCE;
        this.lastCalendar = calendar;
        Calendar calendar2 = this.lastCalendar;
        HMLog.info(TAG, new DailyAnalysisChartUseCaseImpl$createDefault$1$1(this, calendar2));
        return new PhnDailyAnalysis(calendar2, -10000.0f, -10000.0f, -10000.0f);
    }

    private final PhnDailyAnalysis d(Function0<Unit> loadToCache) {
        Calendar calendar = this.lastCalendar;
        if (calendar == null) {
            throw new IllegalStateException("Last is null!");
        }
        Calendar calendar2 = Calendar.getInstance(calendar.getTimeZone());
        calendar2.setTimeInMillis(calendar.getTimeInMillis());
        calendar2.add(6, -1);
        long timeInMillis = calendar2.getTimeInMillis();
        if (this.cache.isEmpty()) {
            loadToCache.invoke();
        }
        this.lastCalendar = calendar2;
        if (this.cache.containsKey(Long.valueOf(timeInMillis))) {
            return (PhnDailyAnalysis) this.cache.remove(Long.valueOf(timeInMillis));
        }
        HMLog.info(TAG, new DailyAnalysisChartUseCaseImpl$createDefault$1$1(this, calendar2));
        return new PhnDailyAnalysis(calendar2, -10000.0f, -10000.0f, -10000.0f);
    }

    private final void e(int size) {
        List<PhnDailyAnalysis> listLoad = this.origin.load(size);
        if (listLoad.isEmpty()) {
            this.noMoreData = true;
            return;
        }
        for (PhnDailyAnalysis phnDailyAnalysis : listLoad) {
            this.cache.put(Long.valueOf(phnDailyAnalysis.getDate().getTimeInMillis()), phnDailyAnalysis);
        }
    }

    private final Calendar f(Calendar calendar) {
        Calendar calendar2 = Calendar.getInstance(calendar.getTimeZone());
        calendar2.setTimeInMillis(calendar.getTimeInMillis());
        calendar2.add(6, -1);
        return calendar2;
    }

    @Override // com.huami.phn.coach.usecase.DailyAnalysisUseCase
    @NotNull
    public List<PhnDailyAnalysis> load(int size) {
        PhnDailyAnalysis phnDailyAnalysis;
        if (!(size > 0)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < size; i++) {
            Calendar calendar = this.lastCalendar;
            if (calendar == null) {
                List<PhnDailyAnalysis> listLoad = this.origin.load(size);
                if (listLoad.isEmpty()) {
                    this.noMoreData = true;
                } else {
                    for (PhnDailyAnalysis phnDailyAnalysis2 : listLoad) {
                        this.cache.put(Long.valueOf(phnDailyAnalysis2.getDate().getTimeInMillis()), phnDailyAnalysis2);
                    }
                }
                Unit unit = Unit.INSTANCE;
                PhnDailyAnalysis phnDailyAnalysis3 = (PhnDailyAnalysis) CollectionsKt.firstOrNull(this.cache.values());
                if (phnDailyAnalysis3 != null) {
                    this.cache.remove(Long.valueOf(phnDailyAnalysis3.getDate().getTimeInMillis()));
                    this.lastCalendar = phnDailyAnalysis3.getDate();
                } else {
                    Calendar calendar2 = Calendar.getInstance();
                    calendar2.set(11, 0);
                    calendar2.set(12, 0);
                    calendar2.set(13, 0);
                    calendar2.set(14, 0);
                    calendar2.add(6, -1);
                    this.lastCalendar = calendar2;
                    Calendar calendar3 = this.lastCalendar;
                    HMLog.info(TAG, new DailyAnalysisChartUseCaseImpl$createDefault$1$1(this, calendar3));
                    phnDailyAnalysis3 = new PhnDailyAnalysis(calendar3, -10000.0f, -10000.0f, -10000.0f);
                }
                arrayList.add(phnDailyAnalysis3);
            } else if (this.noMoreData) {
                Calendar calendar4 = Calendar.getInstance(calendar.getTimeZone());
                calendar4.setTimeInMillis(calendar.getTimeInMillis());
                calendar4.add(6, -1);
                this.lastCalendar = calendar4;
                HMLog.info(TAG, new DailyAnalysisChartUseCaseImpl$createDefault$1$1(this, calendar4));
                arrayList.add(new PhnDailyAnalysis(calendar4, -10000.0f, -10000.0f, -10000.0f));
            } else {
                Calendar calendar5 = this.lastCalendar;
                if (calendar5 == null) {
                    throw new IllegalStateException("Last is null!");
                }
                Calendar calendar6 = Calendar.getInstance(calendar5.getTimeZone());
                calendar6.setTimeInMillis(calendar5.getTimeInMillis());
                calendar6.add(6, -1);
                long timeInMillis = calendar6.getTimeInMillis();
                if (this.cache.isEmpty()) {
                    List<PhnDailyAnalysis> listLoad2 = this.origin.load(size);
                    if (listLoad2.isEmpty()) {
                        this.noMoreData = true;
                    } else {
                        for (PhnDailyAnalysis phnDailyAnalysis4 : listLoad2) {
                            this.cache.put(Long.valueOf(phnDailyAnalysis4.getDate().getTimeInMillis()), phnDailyAnalysis4);
                        }
                    }
                    Unit unit2 = Unit.INSTANCE;
                }
                this.lastCalendar = calendar6;
                if (this.cache.containsKey(Long.valueOf(timeInMillis))) {
                    phnDailyAnalysis = (PhnDailyAnalysis) this.cache.remove(Long.valueOf(timeInMillis));
                } else {
                    HMLog.info(TAG, new DailyAnalysisChartUseCaseImpl$createDefault$1$1(this, calendar6));
                    phnDailyAnalysis = new PhnDailyAnalysis(calendar6, -10000.0f, -10000.0f, -10000.0f);
                }
                arrayList.add(phnDailyAnalysis);
            }
        }
        return arrayList;
    }
}
