package com.huami.stress.domain.utils;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\"\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\b\u001a\u00020\u0006¨\u0006\f"}, d2 = {"Lcom/huami/stress/domain/utils/RationUtils;", "", "", "number", "a", "", "", "numbers", "desiredTotal", "largestRemainderRound", "<init>", "()V", "domain_release"}, k = 1, mv = {1, 5, 1})
public final class RationUtils {

    @NotNull
    public static final RationUtils INSTANCE = new RationUtils();

    private RationUtils() {
    }

    private final float a(float number) {
        return number - ((int) number);
    }

    @NotNull
    public final List<Integer> largestRemainderRound(@NotNull List<Integer> numbers, int desiredTotal) {
        Iterator<Integer> it2 = numbers.iterator();
        int i = 0;
        int iIntValue = 0;
        while (it2.hasNext()) {
            iIntValue += it2.next().intValue();
        }
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(numbers, 10));
        Iterator<T> it3 = numbers.iterator();
        while (it3.hasNext()) {
            arrayList.add(Float.valueOf(((desiredTotal * 1.0f) * ((Number) it3.next()).intValue()) / iIntValue));
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        int i2 = 0;
        for (Object obj : arrayList) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            float fFloatValue = ((Number) obj).floatValue();
            arrayList2.add(new NumbersWithRemainder((int) fFloatValue, INSTANCE.a(fFloatValue), i2));
            i2 = i3;
        }
        List listSortedWith = CollectionsKt___CollectionsKt.sortedWith(arrayList2, new Comparator() { // from class: com.huami.stress.domain.utils.RationUtils$largestRemainderRound$$inlined$sortedByDescending$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt__ComparisonsKt.compareValues(Float.valueOf(((NumbersWithRemainder) t2).getRemainder()), Float.valueOf(((NumbersWithRemainder) t).getRemainder()));
            }
        });
        Iterator it4 = listSortedWith.iterator();
        int floor = 0;
        while (it4.hasNext()) {
            floor += ((NumbersWithRemainder) it4.next()).getFloor();
        }
        int i4 = desiredTotal - floor;
        if (i4 > 0) {
            while (true) {
                int i5 = i + 1;
                NumbersWithRemainder numbersWithRemainder = (NumbersWithRemainder) listSortedWith.get(i);
                numbersWithRemainder.setFloor(numbersWithRemainder.getFloor() + 1);
                if (i5 >= i4) {
                    break;
                }
                i = i5;
            }
        }
        List listSortedWith2 = CollectionsKt___CollectionsKt.sortedWith(listSortedWith, new Comparator() { // from class: com.huami.stress.domain.utils.RationUtils$largestRemainderRound$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt__ComparisonsKt.compareValues(Integer.valueOf(((NumbersWithRemainder) t).getIndex()), Integer.valueOf(((NumbersWithRemainder) t2).getIndex()));
            }
        });
        ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listSortedWith2, 10));
        Iterator it5 = listSortedWith2.iterator();
        while (it5.hasNext()) {
            arrayList3.add(Integer.valueOf(((NumbersWithRemainder) it5.next()).getFloor()));
        }
        return arrayList3;
    }
}
