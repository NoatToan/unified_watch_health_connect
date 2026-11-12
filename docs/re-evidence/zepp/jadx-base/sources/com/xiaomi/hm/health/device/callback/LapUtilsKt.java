package com.xiaomi.hm.health.device.callback;

import com.huami.mifit.sportlib.core.Geohash;
import com.huami.tools.log.HMLog;
import com.huami.watch.dataflow.sync.util.SyncConst;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.GolfGroupInfo;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.LapInfo;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.SportDetail;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.StrengthGroupInfo;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000\u001a\n\u0010\u0005\u001a\u00020\u0002*\u00020\u0004\u001a\f\u0010\u0006\u001a\u0004\u0018\u00010\u0004*\u00020\u0002\u001a\n\u0010\b\u001a\u00020\u0004*\u00020\u0007\u001a\n\u0010\b\u001a\u00020\u0004*\u00020\t\u001a\n\u0010\b\u001a\u00020\u0004*\u00020\u0004¨\u0006\n"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/SportDetail;", "detail", "", "toLapData", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/LapInfo;", "assembleToNetFormat", "lapStr2LapInfo", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/StrengthGroupInfo;", "toLapInfo", "Lcom/xiaomi/hm/health/bt/profile/gdsp/gps/GolfGroupInfo;", "devicex_zeppRelease"}, k = 2, mv = {1, 5, 1})
public final class LapUtilsKt {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ Throwable a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Throwable th) {
            super(0);
            this.a = th;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "Decode lap string failed：" + this.a;
        }
    }

    @NotNull
    public static final String assembleToNetFormat(@NotNull LapInfo lapInfo) {
        StringBuilder sb = new StringBuilder();
        sb.append(lapInfo.getIndex() - 1);
        sb.append(",");
        sb.append(lapInfo.getTimeUsage());
        sb.append(",");
        sb.append(lapInfo.getLapDistance());
        sb.append(",");
        sb.append(Geohash.encode(lapInfo.getLat() / 3000000.0d, lapInfo.getLng() / 3000000.0d));
        sb.append(",");
        sb.append(lapInfo.getAvgHr());
        sb.append(",");
        sb.append(lapInfo.getOffsetToStart());
        sb.append(",");
        sb.append(SyncConst.ALTITUDE_INVALID_VALUE);
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
        return sb.toString();
    }

    @Nullable
    public static final LapInfo lapStr2LapInfo(@NotNull String str) {
        Object objM3845constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            LapInfo lapInfo = new LapInfo(-1);
            int length = str.length() - 1;
            int i = 0;
            boolean z = false;
            while (i <= length) {
                char cCharAt = str.charAt(!z ? i : length);
                boolean z2 = cCharAt == ';' || cCharAt == ' ';
                if (z) {
                    if (!z2) {
                        break;
                    }
                    length--;
                } else if (z2) {
                    i++;
                } else {
                    z = true;
                }
            }
            List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) str.subSequence(i, length + 1).toString(), new String[]{","}, false, 0, 6, (Object) null);
            lapInfo.setIndex(Integer.parseInt((String) listSplit$default.get(0)) + 1);
            lapInfo.setTimeUsage(Long.parseLong((String) listSplit$default.get(1)));
            lapInfo.setLapDistance(Integer.parseInt((String) listSplit$default.get(2)));
            double[] dArrDecode = Geohash.decode((String) listSplit$default.get(3));
            lapInfo.setLat(dArrDecode[0] * 3000000.0d);
            lapInfo.setLng(dArrDecode[1] * 3000000.0d);
            lapInfo.setAvgHr(Integer.parseInt((String) listSplit$default.get(4)));
            lapInfo.setOffsetToStart(Long.parseLong((String) listSplit$default.get(5)));
            Integer.parseInt((String) listSplit$default.get(6));
            lapInfo.setLapClimbUp(Integer.parseInt((String) listSplit$default.get(7)));
            lapInfo.setLapClimbDown(Integer.parseInt((String) listSplit$default.get(8)));
            lapInfo.setAvgPace(Float.parseFloat((String) listSplit$default.get(9)));
            lapInfo.setMaxPace(Float.parseFloat((String) listSplit$default.get(10)));
            Integer.parseInt((String) listSplit$default.get(11));
            lapInfo.setStrokeSpeed(Integer.parseInt((String) listSplit$default.get(12)));
            lapInfo.setStrokes(Integer.parseInt((String) listSplit$default.get(13)));
            lapInfo.setLapSwolf(Integer.parseInt((String) listSplit$default.get(14)));
            lapInfo.setLapCalorie(Integer.parseInt((String) listSplit$default.get(15)));
            lapInfo.setCadence(Integer.parseInt((String) listSplit$default.get(16)));
            Integer.parseInt((String) listSplit$default.get(17));
            lapInfo.setLapType(Integer.parseInt((String) listSplit$default.get(18)));
            lapInfo.setSkipCount(Integer.parseInt((String) listSplit$default.get(19)));
            lapInfo.setSportMode(Integer.parseInt((String) listSplit$default.get(20)));
            lapInfo.setWeight(Integer.parseInt((String) listSplit$default.get(21)));
            lapInfo.setCount(Integer.parseInt((String) listSplit$default.get(22)));
            lapInfo.setUnit(Integer.parseInt((String) listSplit$default.get(23)));
            lapInfo.setStairFloor(Integer.parseInt((String) listSplit$default.get(24)));
            lapInfo.setFloorPerMinute(Float.parseFloat((String) listSplit$default.get(25)));
            lapInfo.setSwimStyle(Integer.parseInt((String) listSplit$default.get(26)));
            lapInfo.setTrainType(Integer.parseInt((String) listSplit$default.get(27)));
            lapInfo.setStrengthTrainType(Integer.parseInt((String) listSplit$default.get(28)));
            objM3845constructorimpl = Result.m3845constructorimpl(lapInfo);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
        if (thM3848exceptionOrNullimpl != null) {
            HMLog.info("LapUtils", new a(thM3848exceptionOrNullimpl));
        }
        if (Result.m3850isFailureimpl(objM3845constructorimpl)) {
            objM3845constructorimpl = null;
        }
        return (LapInfo) objM3845constructorimpl;
    }

    @NotNull
    public static final String toLapData(@NotNull SportDetail sportDetail) {
        StringBuilder sb = new StringBuilder();
        List listSortedWith = CollectionsKt___CollectionsKt.sortedWith(sportDetail.getLapInfos(), new Comparator() { // from class: com.xiaomi.hm.health.device.callback.LapUtilsKt$toLapData$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt__ComparisonsKt.compareValues(Integer.valueOf(((LapInfo) t).getIndex()), Integer.valueOf(((LapInfo) t2).getIndex()));
            }
        });
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listSortedWith, 10));
        Iterator it2 = listSortedWith.iterator();
        while (it2.hasNext()) {
            sb.append(assembleToNetFormat((LapInfo) it2.next()));
            arrayList.add(sb);
        }
        List<StrengthGroupInfo> strengthGroupNodes = sportDetail.getStrengthGroupNodes();
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(strengthGroupNodes, 10));
        Iterator<T> it3 = strengthGroupNodes.iterator();
        while (it3.hasNext()) {
            arrayList2.add(toLapInfo((StrengthGroupInfo) it3.next()));
        }
        List listSortedWith2 = CollectionsKt___CollectionsKt.sortedWith(arrayList2, new Comparator() { // from class: com.xiaomi.hm.health.device.callback.LapUtilsKt$toLapData$$inlined$sortedBy$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt__ComparisonsKt.compareValues(Integer.valueOf(((LapInfo) t).getIndex()), Integer.valueOf(((LapInfo) t2).getIndex()));
            }
        });
        ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listSortedWith2, 10));
        Iterator it4 = listSortedWith2.iterator();
        while (it4.hasNext()) {
            sb.append(assembleToNetFormat((LapInfo) it4.next()));
            arrayList3.add(sb);
        }
        List<GolfGroupInfo> golfGroupNodes = sportDetail.getGolfGroupNodes();
        ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(golfGroupNodes, 10));
        Iterator<T> it5 = golfGroupNodes.iterator();
        while (it5.hasNext()) {
            arrayList4.add(toLapInfo((GolfGroupInfo) it5.next()));
        }
        List listSortedWith3 = CollectionsKt___CollectionsKt.sortedWith(arrayList4, new Comparator() { // from class: com.xiaomi.hm.health.device.callback.LapUtilsKt$toLapData$$inlined$sortedBy$3
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt__ComparisonsKt.compareValues(Integer.valueOf(((LapInfo) t).getIndex()), Integer.valueOf(((LapInfo) t2).getIndex()));
            }
        });
        ArrayList arrayList5 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listSortedWith3, 10));
        Iterator it6 = listSortedWith3.iterator();
        while (it6.hasNext()) {
            sb.append(assembleToNetFormat((LapInfo) it6.next()));
            arrayList5.add(sb);
        }
        return sb.toString();
    }

    @NotNull
    public static final LapInfo toLapInfo(@NotNull LapInfo lapInfo) {
        return lapInfo;
    }

    @NotNull
    public static final LapInfo toLapInfo(@NotNull StrengthGroupInfo strengthGroupInfo) {
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
    public static final LapInfo toLapInfo(@NotNull GolfGroupInfo golfGroupInfo) {
        LapInfo lapInfo = new LapInfo(0);
        lapInfo.setIndex(golfGroupInfo.getIndex());
        lapInfo.setCount(golfGroupInfo.getCount());
        lapInfo.setTimeUsage(golfGroupInfo.getTimeUsage());
        lapInfo.setAvgHr(golfGroupInfo.getAvgHr());
        return lapInfo;
    }
}
