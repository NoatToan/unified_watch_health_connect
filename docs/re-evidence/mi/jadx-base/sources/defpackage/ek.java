package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.GolfGroupInfo;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.LapInfo;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.SportDetail;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.StrengthGroupInfo;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000\u001a\n\u0010\u0003\u001a\u00020\u0002*\u00020\u0004\u001a\n\u0010\u0003\u001a\u00020\u0004*\u00020\u0005\u001a\n\u0010\u0003\u001a\u00020\u0004*\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/SportDetail;", "detail", "", PluginDeviceInfo.FMODEL, "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/LapInfo;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/StrengthGroupInfo;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/GolfGroupInfo;", "btData_wearRelease"}, k = 2, mv = {1, 7, 1})
public final class ek {

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "T", PluginDeviceInfo.FMODEL, "kotlin.jvm.PlatformType", PluginDeviceInfo.FDESC, "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return ComparisonsKt__ComparisonsKt.compareValues(Integer.valueOf(((LapInfo) t).getIndex()), Integer.valueOf(((LapInfo) t2).getIndex()));
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "T", PluginDeviceInfo.FMODEL, "kotlin.jvm.PlatformType", PluginDeviceInfo.FDESC, "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return ComparisonsKt__ComparisonsKt.compareValues(Integer.valueOf(((LapInfo) t).getIndex()), Integer.valueOf(((LapInfo) t2).getIndex()));
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "T", PluginDeviceInfo.FMODEL, "kotlin.jvm.PlatformType", PluginDeviceInfo.FDESC, "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class c<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return ComparisonsKt__ComparisonsKt.compareValues(Integer.valueOf(((LapInfo) t).getIndex()), Integer.valueOf(((LapInfo) t2).getIndex()));
        }
    }

    @NotNull
    public static final String a(@NotNull SportDetail detail) {
        Intrinsics.checkNotNullParameter(detail, "detail");
        StringBuilder sb = new StringBuilder();
        ArrayList<LapInfo> lapInfos = detail.getLapInfos();
        Intrinsics.checkNotNullExpressionValue(lapInfos, "detail.lapInfos");
        List<LapInfo> listSortedWith = CollectionsKt___CollectionsKt.sortedWith(lapInfos, new a());
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listSortedWith, 10));
        for (LapInfo it : listSortedWith) {
            Intrinsics.checkNotNullExpressionValue(it, "it");
            sb.append(a(it));
            arrayList.add(sb);
        }
        List<StrengthGroupInfo> strengthGroupNodes = detail.getStrengthGroupNodes();
        Intrinsics.checkNotNullExpressionValue(strengthGroupNodes, "detail.strengthGroupNodes");
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(strengthGroupNodes, 10));
        for (StrengthGroupInfo it2 : strengthGroupNodes) {
            Intrinsics.checkNotNullExpressionValue(it2, "it");
            arrayList2.add(a(it2));
        }
        List listSortedWith2 = CollectionsKt___CollectionsKt.sortedWith(arrayList2, new b());
        ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listSortedWith2, 10));
        Iterator it3 = listSortedWith2.iterator();
        while (it3.hasNext()) {
            sb.append(a((LapInfo) it3.next()));
            arrayList3.add(sb);
        }
        List<GolfGroupInfo> golfGroupNodes = detail.getGolfGroupNodes();
        Intrinsics.checkNotNullExpressionValue(golfGroupNodes, "detail.golfGroupNodes");
        ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(golfGroupNodes, 10));
        for (GolfGroupInfo it4 : golfGroupNodes) {
            Intrinsics.checkNotNullExpressionValue(it4, "it");
            arrayList4.add(a(it4));
        }
        List listSortedWith3 = CollectionsKt___CollectionsKt.sortedWith(arrayList4, new c());
        ArrayList arrayList5 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listSortedWith3, 10));
        Iterator it5 = listSortedWith3.iterator();
        while (it5.hasNext()) {
            sb.append(a((LapInfo) it5.next()));
            arrayList5.add(sb);
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "sb.toString()");
        return string;
    }

    @NotNull
    public static final String a(@NotNull LapInfo lapInfo) {
        Intrinsics.checkNotNullParameter(lapInfo, "<this>");
        StringBuilder sb = new StringBuilder();
        sb.append(lapInfo.getIndex() - 1);
        sb.append(",");
        sb.append(lapInfo.getTimeUsage());
        sb.append(",");
        sb.append(lapInfo.getLapDistance());
        sb.append(",");
        sb.append(aht.a(lapInfo.getLat() / 3000000.0d, lapInfo.getLng() / 3000000.0d));
        sb.append(",");
        sb.append(lapInfo.getAvgHr());
        sb.append(",");
        sb.append(lapInfo.getOffsetToStart());
        sb.append(",");
        sb.append(-20000);
        sb.append(",");
        sb.append(lapInfo.getLapClimbUp());
        sb.append(",");
        sb.append(lapInfo.getLapClimbDown());
        sb.append(",");
        sb.append(lapInfo.getAvgPace());
        sb.append(",");
        sb.append(lapInfo.getMaxPace());
        sb.append(",");
        sb.append(-1);
        sb.append(",");
        sb.append(lapInfo.getStrokeSpeed());
        sb.append(",");
        sb.append(lapInfo.getStrokes());
        sb.append(",");
        sb.append(lapInfo.getLapSwolf());
        sb.append(",");
        sb.append(lapInfo.getLapCalorie());
        sb.append(",");
        sb.append(lapInfo.getCadence());
        sb.append(",");
        sb.append(-1);
        sb.append(",");
        sb.append(lapInfo.getLapType());
        sb.append(",");
        sb.append(lapInfo.getSkipCount());
        sb.append(",");
        sb.append(lapInfo.getSportMode());
        sb.append(",");
        sb.append(lapInfo.getWeight());
        sb.append(",");
        sb.append(lapInfo.getCount());
        sb.append(",");
        sb.append(lapInfo.getUnit());
        sb.append(",");
        sb.append(lapInfo.getStairFloor());
        sb.append(",");
        sb.append(lapInfo.getFloorPerMinute());
        sb.append(",");
        sb.append(lapInfo.getSwimStyle());
        sb.append(",");
        sb.append(lapInfo.getTrainType());
        sb.append(",");
        sb.append(lapInfo.getStrengthTrainType());
        sb.append(";");
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "sb.toString()");
        return string;
    }

    @NotNull
    public static final LapInfo a(@NotNull StrengthGroupInfo strengthGroupInfo) {
        Intrinsics.checkNotNullParameter(strengthGroupInfo, "<this>");
        LapInfo lapInfo = new LapInfo(0);
        lapInfo.setAvgHr(strengthGroupInfo.getAvgHr());
        lapInfo.setIndex(strengthGroupInfo.getIndex());
        lapInfo.setLapCalorie(strengthGroupInfo.getCal());
        lapInfo.setTimeUsage(strengthGroupInfo.getTimeUsage());
        lapInfo.setWeight(strengthGroupInfo.getWeight() == 65535 ? -1 : strengthGroupInfo.getWeight());
        lapInfo.setUnit(strengthGroupInfo.getUnit());
        lapInfo.setCount(strengthGroupInfo.getTimes());
        lapInfo.setStrengthTrainType(strengthGroupInfo.getType());
        return lapInfo;
    }

    @NotNull
    public static final LapInfo a(@NotNull GolfGroupInfo golfGroupInfo) {
        Intrinsics.checkNotNullParameter(golfGroupInfo, "<this>");
        LapInfo lapInfo = new LapInfo(0);
        lapInfo.setIndex(golfGroupInfo.getIndex());
        lapInfo.setCount(golfGroupInfo.getCount());
        lapInfo.setTimeUsage(golfGroupInfo.getTimeUsage());
        lapInfo.setAvgHr(golfGroupInfo.getAvgHr());
        return lapInfo;
    }
}
