package com.huami.heartrate.atrialfib;

import com.huami.chart.data.RangeIndex;
import com.huami.health.afppg.model.AtrialFibrillation;
import com.huami.heartrate.atrialfib.AtrialUtils;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.g;
import kotlin.ranges.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\n\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006J(\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fR\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lcom/huami/heartrate/atrialfib/AtrialUtils;", "", "Ljava/util/ArrayList;", "Lcom/huami/chart/data/RangeIndex;", "rangeList", "b", "Ljava/util/Calendar;", "date", "", "dayBegin", "dayEnd", "calendar", "", "Lcom/huami/health/afppg/model/AtrialFibrillation;", "slices", "atrialFibrillationItemToRange", "", "a", "Ljava/lang/String;", "TAG", "<init>", "()V", "heartrate_release"}, k = 1, mv = {1, 5, 1})
public final class AtrialUtils {

    @NotNull
    public static final AtrialUtils INSTANCE = new AtrialUtils();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final String TAG = "AtrialUtils";

    private AtrialUtils() {
    }

    private final ArrayList<RangeIndex> b(ArrayList<RangeIndex> rangeList) {
        if (rangeList.size() < 2) {
            return rangeList;
        }
        ArrayList<RangeIndex> arrayList = new ArrayList<>();
        g.sortWith(rangeList, new Comparator() { // from class: gj
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return AtrialUtils.c((RangeIndex) obj, (RangeIndex) obj2);
            }
        });
        arrayList.add(rangeList.get(0));
        int size = rangeList.size();
        if (1 < size) {
            int i = 1;
            while (true) {
                int i2 = i + 1;
                if (rangeList.get(i).start <= arrayList.get(arrayList.size() - 1).end) {
                    int i3 = arrayList.get(arrayList.size() - 1).start;
                    int iCoerceAtLeast = e.coerceAtLeast(arrayList.get(arrayList.size() - 1).end, rangeList.get(i).end);
                    arrayList.remove(arrayList.size() - 1);
                    arrayList.add(new RangeIndex(i3, iCoerceAtLeast));
                } else {
                    arrayList.add(rangeList.get(i));
                }
                if (i2 >= size) {
                    break;
                }
                i = i2;
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int c(RangeIndex rangeIndex, RangeIndex rangeIndex2) {
        int i = rangeIndex.start;
        int i2 = rangeIndex2.start;
        if (i > i2) {
            return 1;
        }
        return i == i2 ? 0 : -1;
    }

    @Nullable
    public final ArrayList<RangeIndex> atrialFibrillationItemToRange(@Nullable Calendar calendar, @Nullable List<AtrialFibrillation> slices) {
        if (slices == null || slices.isEmpty()) {
            return null;
        }
        ArrayList<RangeIndex> arrayList = new ArrayList<>();
        if (calendar == null) {
            return arrayList;
        }
        long jDayBegin = dayBegin(calendar);
        long jDayEnd = dayEnd(calendar);
        for (AtrialFibrillation atrialFibrillation : slices) {
            long eventTime = atrialFibrillation.getEventTime();
            long endTime = atrialFibrillation.getEndTime();
            if (eventTime < jDayEnd && jDayEnd > jDayBegin) {
                arrayList.add(new RangeIndex(eventTime <= jDayBegin ? 0 : (int) ((eventTime - jDayBegin) / 300000), endTime >= jDayEnd ? 288 : ((int) ((endTime - jDayBegin) / 300000)) + 1));
            }
        }
        return b(arrayList);
    }

    public final long dayBegin(@NotNull Calendar date) {
        date.set(11, 0);
        date.set(12, 0);
        date.set(13, 0);
        date.set(14, 0);
        return date.getTimeInMillis();
    }

    public final long dayEnd(@NotNull Calendar date) {
        date.set(11, 23);
        date.set(12, 59);
        date.set(13, 59);
        date.set(14, 999);
        return date.getTimeInMillis();
    }
}
