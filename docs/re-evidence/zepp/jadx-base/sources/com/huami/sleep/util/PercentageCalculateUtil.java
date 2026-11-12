package com.huami.sleep.util;

import androidx.exifinterface.media.ExifInterface;
import com.baidu.ocr.sdk.utils.LogUtil;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u000eB\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ&\u0010\b\u001a\u00020\u00072\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u00042\u0006\u0010\u0006\u001a\u00020\u0003R\u0016\u0010\t\u001a\u00020\u00038\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\u000b\u001a\u00020\u00038\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/huami/sleep/util/PercentageCalculateUtil;", "", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "dataSet", "hex", "", "calculatePercentages", "THOUSAND", LogUtil.I, "HANDRED", "<init>", "()V", "a", "sleep_release"}, k = 1, mv = {1, 5, 1})
public final class PercentageCalculateUtil {
    public static final int HANDRED = 100;

    @NotNull
    public static final PercentageCalculateUtil INSTANCE = new PercentageCalculateUtil();
    public static final int THOUSAND = 1000;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0004\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u000f\u0012\u0006\u0010\u0007\u001a\u00028\u0000¢\u0006\u0004\b\b\u0010\tR\u0019\u0010\u0007\u001a\u00028\u00008\u0006@\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0004\u0010\u0006¨\u0006\n"}, d2 = {"com/huami/sleep/util/PercentageCalculateUtil$a", "", ExifInterface.GPS_DIRECTION_TRUE, "", "a", "Ljava/lang/Number;", "()Ljava/lang/Number;", "value", "<init>", "(Ljava/lang/Number;)V", "sleep_release"}, k = 1, mv = {1, 5, 1})
    public static final class a<T extends Number> {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final T value;

        public a(@NotNull T t) {
            this.value = t;
        }

        @NotNull
        public final T a() {
            return this.value;
        }
    }

    private PercentageCalculateUtil() {
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00e0  */
    @NotNull
    public final int[] calculatePercentages(@NotNull ArrayList<Integer> dataSet, int hex) {
        int[] iArr = new int[dataSet.size()];
        int iSumOfInt = CollectionsKt___CollectionsKt.sumOfInt(dataSet);
        if (iSumOfInt <= 0) {
            return iArr;
        }
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(dataSet, 10));
        Iterator<T> it2 = dataSet.iterator();
        while (it2.hasNext()) {
            float fIntValue = ((Number) it2.next()).intValue() / iSumOfInt;
            arrayList.add(Float.isNaN(fIntValue) ? new a(Float.valueOf(0.0f)) : new a(Float.valueOf(fIntValue * hex)));
        }
        float f = hex;
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            arrayList2.add(Float.valueOf((float) Math.floor(((a) it3.next()).a().floatValue())));
        }
        float fSumOfFloat = f - CollectionsKt___CollectionsKt.sumOfFloat(arrayList2);
        List listSortedWith = CollectionsKt___CollectionsKt.sortedWith(arrayList, new Comparator() { // from class: com.huami.sleep.util.PercentageCalculateUtil$calculatePercentages$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                PercentageCalculateUtil.a aVar = (PercentageCalculateUtil.a) t;
                PercentageCalculateUtil.a aVar2 = (PercentageCalculateUtil.a) t2;
                return ComparisonsKt__ComparisonsKt.compareValues(Float.valueOf(((float) Math.floor(aVar.a().floatValue())) - aVar.a().floatValue()), Float.valueOf(((float) Math.floor(aVar2.a().floatValue())) - aVar2.a().floatValue()));
            }
        });
        ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listSortedWith, 10));
        int i = 0;
        for (Object obj : listSortedWith) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            a aVar = (a) obj;
            if (i >= fSumOfFloat) {
                iArr[arrayList.indexOf(aVar)] = (int) Math.floor(aVar.a().floatValue());
            } else if (aVar.a().floatValue() == 0.0f) {
                iArr[arrayList.indexOf(aVar)] = (int) Math.floor(aVar.a().floatValue());
            } else {
                iArr[arrayList.indexOf(aVar)] = (int) (((float) Math.floor(aVar.a().floatValue())) + 1);
            }
            arrayList3.add(Unit.INSTANCE);
            i = i2;
        }
        return iArr;
    }
}
