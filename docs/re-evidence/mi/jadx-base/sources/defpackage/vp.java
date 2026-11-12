package defpackage;

import androidx.health.connect.client.records.CervicalMucusRecord;
import androidx.health.connect.client.records.OvulationTestRecord;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.fitness.nfc.ui.realname.RealNameWebViewActivity;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ,\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002J\"\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\u0006\u0010\n\u001a\u00020\u0002J\u0010\u0010\b\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¨\u0006\u000f"}, d2 = {"Lvp;", "", "", "relax", "normal", CervicalMucusRecord.Sensation.MEDIUM, OvulationTestRecord.Result.HIGH, "", PluginDeviceInfo.FMODEL, "numbers", "desiredTotal", "", RealNameWebViewActivity.NUMBER, "<init>", "()V", "btData_wearRelease"}, k = 1, mv = {1, 7, 1})
public final class vp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final vp f37095a = new vp();

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "T", PluginDeviceInfo.FMODEL, "kotlin.jvm.PlatformType", PluginDeviceInfo.FDESC, "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return ComparisonsKt__ComparisonsKt.compareValues(Integer.valueOf(((NumbersWithRemainder) t).getIndex()), Integer.valueOf(((NumbersWithRemainder) t2).getIndex()));
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "T", PluginDeviceInfo.FMODEL, "kotlin.jvm.PlatformType", PluginDeviceInfo.FDESC, "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return ComparisonsKt__ComparisonsKt.compareValues(Float.valueOf(((NumbersWithRemainder) t2).getRemainder()), Float.valueOf(((NumbersWithRemainder) t).getRemainder()));
        }
    }

    public final float a(float number) {
        return number - ((int) number);
    }

    @NotNull
    public final List<Integer> a(int relax, int normal, int medium, int high) {
        return a(CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(relax), Integer.valueOf(normal), Integer.valueOf(medium), Integer.valueOf(high)}), 100);
    }

    @NotNull
    public final List<Integer> a(@NotNull List<Integer> numbers, int desiredTotal) {
        Intrinsics.checkNotNullParameter(numbers, "numbers");
        Iterator<Integer> it = numbers.iterator();
        int iIntValue = 0;
        while (it.hasNext()) {
            iIntValue += it.next().intValue();
        }
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(numbers, 10));
        Iterator<T> it2 = numbers.iterator();
        while (it2.hasNext()) {
            arrayList.add(Float.valueOf(((desiredTotal * 1.0f) * ((Number) it2.next()).intValue()) / iIntValue));
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        int i = 0;
        for (Object obj : arrayList) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            float fFloatValue = ((Number) obj).floatValue();
            arrayList2.add(new NumbersWithRemainder((int) fFloatValue, f37095a.a(fFloatValue), i));
            i = i2;
        }
        List listSortedWith = CollectionsKt___CollectionsKt.sortedWith(arrayList2, new b());
        Iterator it3 = listSortedWith.iterator();
        int floor = 0;
        while (it3.hasNext()) {
            floor += ((NumbersWithRemainder) it3.next()).getFloor();
        }
        int i3 = desiredTotal - floor;
        for (int i4 = 0; i4 < i3; i4++) {
            NumbersWithRemainder numbersWithRemainder = (NumbersWithRemainder) listSortedWith.get(i4);
            numbersWithRemainder.a(numbersWithRemainder.getFloor() + 1);
        }
        List listSortedWith2 = CollectionsKt___CollectionsKt.sortedWith(listSortedWith, new a());
        ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listSortedWith2, 10));
        Iterator it4 = listSortedWith2.iterator();
        while (it4.hasNext()) {
            arrayList3.add(Integer.valueOf(((NumbersWithRemainder) it4.next()).getFloor()));
        }
        return arrayList3;
    }
}
