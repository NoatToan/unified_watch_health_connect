package com.huami.pai.ui.detail;

import com.huami.pai.ext.DateExKt;
import com.huami.pai.vo.ChartDataVo;
import com.huami.pai.vo.ChartPointVo;
import com.huami.pai.vo.FitnessAgeVo;
import com.huami.pai.vo.RangeIndexVo;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.x;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002\u001a \u0010\u0006\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0005*\b\u0012\u0004\u0012\u00020\u00040\u0003\u001a\u0010\u0010\b\u001a\u00020\u0007*\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\t"}, d2 = {"", "", "a", "", "Lcom/huami/pai/vo/FitnessAgeVo;", "Lkotlin/Pair;", "latestTwoAges", "Lcom/huami/pai/vo/ChartDataVo;", "toChartPoints", "lib_release"}, k = 2, mv = {1, 5, 1})
public final class FitnessAgeViewModelKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean a(int i) {
        return 20 <= i && i <= 90;
    }

    @NotNull
    public static final Pair<FitnessAgeVo, FitnessAgeVo> latestTwoAges(@NotNull List<FitnessAgeVo> list) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(6, -79);
        final Date time = calendar.getTime();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            int iDayDiffs = DateExKt.dayDiffs(time, new Date(((FitnessAgeVo) next).getDate()));
            if (iDayDiffs >= 0 && iDayDiffs < 90) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (!((FitnessAgeVo) obj).isPredicted()) {
                arrayList2.add(obj);
            }
        }
        List listTakeLast = CollectionsKt___CollectionsKt.takeLast(CollectionsKt___CollectionsKt.sortedWith(arrayList2, new Comparator() { // from class: com.huami.pai.ui.detail.FitnessAgeViewModelKt$latestTwoAges$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt__ComparisonsKt.compareValues(Integer.valueOf(DateExKt.dayDiffs(time, new Date(((FitnessAgeVo) t).getDate()))), Integer.valueOf(DateExKt.dayDiffs(time, new Date(((FitnessAgeVo) t2).getDate()))));
            }
        }), 2);
        int size = listTakeLast.size();
        if (size != 0) {
            return size != 1 ? new Pair<>(CollectionsKt.first(listTakeLast), CollectionsKt.last(listTakeLast)) : new Pair<>(null, CollectionsKt.last(listTakeLast));
        }
        return new Pair<>(null, null);
    }

    @NotNull
    public static final ChartDataVo toChartPoints(@NotNull List<FitnessAgeVo> list) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(6, -79);
        Date time = calendar.getTime();
        List listSortedWith = CollectionsKt___CollectionsKt.sortedWith(list, new Comparator() { // from class: com.huami.pai.ui.detail.FitnessAgeViewModelKt$toChartPoints$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt__ComparisonsKt.compareValues(Long.valueOf(((FitnessAgeVo) t).getDate()), Long.valueOf(((FitnessAgeVo) t2).getDate()));
            }
        });
        ArrayList<FitnessAgeVo> arrayList = new ArrayList();
        Iterator it2 = listSortedWith.iterator();
        while (true) {
            boolean z = false;
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            int iDayDiffs = DateExKt.dayDiffs(time, new Date(((FitnessAgeVo) next).getDate()));
            if (iDayDiffs >= 0 && iDayDiffs <= 89) {
                z = true;
            }
            if (z) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (!((FitnessAgeVo) obj).isPredicted()) {
                arrayList2.add(obj);
            }
        }
        if (arrayList2.isEmpty()) {
            return new ChartDataVo(CollectionsKt__CollectionsKt.emptyList(), null, null, 6, null);
        }
        if (arrayList2.size() == 1) {
            float age = ((FitnessAgeVo) CollectionsKt.last((List) arrayList2)).getAge();
            ArrayList arrayList3 = new ArrayList();
            int i = 0;
            while (true) {
                int i2 = i + 1;
                arrayList3.add(new ChartPointVo(i, age));
                if (i == 89) {
                    ArrayList arrayList4 = new ArrayList();
                    arrayList4.add(new RangeIndexVo(0, 43));
                    arrayList4.add(new RangeIndexVo(45, 89));
                    return new ChartDataVo(arrayList3, arrayList4, x.setOf(44));
                }
                i = i2;
            }
        } else {
            int iDayDiffs2 = DateExKt.dayDiffs(time, new Date(((FitnessAgeVo) CollectionsKt.last((List) arrayList2)).getDate()));
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (FitnessAgeVo fitnessAgeVo : arrayList) {
                int iDayDiffs3 = DateExKt.dayDiffs(time, new Date(fitnessAgeVo.getDate()));
                if (!fitnessAgeVo.isPredicted() || iDayDiffs3 > iDayDiffs2) {
                    linkedHashMap.put(Integer.valueOf(iDayDiffs3), new ChartPointVo(iDayDiffs3, fitnessAgeVo.getAge()));
                }
            }
            ArrayList arrayList5 = new ArrayList();
            arrayList5.add(new RangeIndexVo(iDayDiffs2 + 1, 89));
            int i3 = -1;
            int i4 = 0;
            int i5 = -1;
            while (true) {
                int i6 = i4 + 1;
                if (linkedHashMap.containsKey(Integer.valueOf(i4)) || i4 == 89) {
                    int i7 = i4 - i5;
                    if (i7 > 1) {
                        if (i4 <= iDayDiffs2) {
                            arrayList5.add(new RangeIndexVo(Math.max(0, i5), i4));
                        } else if (i5 <= iDayDiffs2 && iDayDiffs2 <= i4) {
                            arrayList5.add(new RangeIndexVo(Math.max(0, i5), iDayDiffs2));
                        }
                        if (i5 == i3) {
                            if (i4 > 0) {
                                int i8 = 0;
                                while (true) {
                                    int i9 = i8 + 1;
                                    linkedHashMap.put(Integer.valueOf(i8), new ChartPointVo(i8, ((ChartPointVo) linkedHashMap.get(Integer.valueOf(i4))).getValue()));
                                    if (i9 >= i4) {
                                        break;
                                    }
                                    i8 = i9;
                                }
                            }
                        } else if (i4 != 89) {
                            float value = ((ChartPointVo) linkedHashMap.get(Integer.valueOf(i5))).getValue();
                            float value2 = (((ChartPointVo) linkedHashMap.get(Integer.valueOf(i4))).getValue() - value) / (i7 - 1);
                            int i10 = i5 + 1;
                            if (i10 < i4) {
                                while (true) {
                                    int i11 = i10 + 1;
                                    linkedHashMap.put(Integer.valueOf(i10), new ChartPointVo(i10, ((i10 - i5) * value2) + value));
                                    if (i11 >= i4) {
                                        break;
                                    }
                                    i10 = i11;
                                }
                            }
                        } else if (i5 <= i4) {
                            int i12 = i5;
                            while (true) {
                                int i13 = i12 + 1;
                                linkedHashMap.put(Integer.valueOf(i12), new ChartPointVo(i12, ((ChartPointVo) linkedHashMap.get(Integer.valueOf(i5))).getValue()));
                                if (i12 == i4) {
                                    break;
                                }
                                i12 = i13;
                            }
                        }
                    }
                    i5 = i4;
                }
                if (i4 == 89) {
                    return new ChartDataVo(CollectionsKt___CollectionsKt.toList(linkedHashMap.values()), arrayList5, x.setOf(Integer.valueOf(iDayDiffs2)));
                }
                i4 = i6;
                i3 = -1;
            }
        }
    }
}
