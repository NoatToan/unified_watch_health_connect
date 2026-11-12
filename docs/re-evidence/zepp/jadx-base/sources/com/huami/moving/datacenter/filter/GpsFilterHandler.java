package com.huami.moving.datacenter.filter;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.core.device.feature.gps.filter.GpsPointFilterHelper;
import com.huami.core.device.feature.gps.filter.GpsPointWrapper;
import com.huami.core.device.feature.gps.filter.PointDataTypeUtil;
import com.huami.nfc.web.Constant;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.databases.model.Trackdata;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\n\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 #2\u00020\u0001:\u0001#B\u000f\u0012\u0006\u0010 \u001a\u00020\r¢\u0006\u0004\b!\u0010\"J\\\u0010\u000e\u001a\u00020\r2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0002H\u0002J\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\u000e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\u000e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0002H\u0002J\u0010\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\tH\u0002J\u0006\u0010\u0018\u001a\u00020\rJ\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\t0\u00022\u0006\u0010\u0019\u001a\u00020\u000fJ\u0014\u0010\u001b\u001a\u00020\u000f2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0002J&\u0010\u001e\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u000fR\u0016\u0010 \u001a\u00020\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001f¨\u0006$"}, d2 = {"Lcom/huami/moving/datacenter/filter/GpsFilterHandler;", "", "", "", "altList", "", "latitudeList", Constant.KEY_LONGITUDE, "paceList", "", "timeList", "", "stateList", "Lcom/xiaomi/hm/health/databases/model/Trackdata;", "a", "", "info", "", "c", GoogleApiAvailabilityLight.a, "e", "f", "value", "b", "filter", "bulkTime", "splitTime", "reverseTime", "bulkll", "Lkotlin/Pair;", "splitLatLot", "Lcom/xiaomi/hm/health/databases/model/Trackdata;", "trackData", "<init>", "(Lcom/xiaomi/hm/health/databases/model/Trackdata;)V", "Companion", "moving_release"}, k = 1, mv = {1, 5, 1})
public final class GpsFilterHandler {

    @NotNull
    private static final String b = "GpsFilterHandler";

    @NotNull
    private static final String c = ";";

    @NotNull
    private static final String d = ",";
    private static final int e = 100;
    private static final double f = 1.0E8d;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Trackdata trackData;

    public GpsFilterHandler(@NotNull Trackdata trackdata) {
        this.trackData = trackdata;
    }

    private final Trackdata a(List<Integer> altList, List<Double> latitudeList, List<Double> longitude, List<Integer> paceList, List<Long> timeList, List<Short> stateList) {
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(timeList, 10));
        int i = 0;
        for (Object obj : timeList) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            ((Number) obj).longValue();
            arrayList.add(new GpsFilterPoint(stateList.get(i).shortValue(), paceList.get(i).intValue(), (int) timeList.get(i).longValue(), altList.get(i).intValue(), latitudeList.get(i).doubleValue(), longitude.get(i).doubleValue()));
            i = i2;
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(new GpsWrapper((GpsFilterPoint) it2.next()));
        }
        List<GpsPointWrapper> listFilterPoints = GpsPointFilterHelper.INSTANCE.filterPoints(arrayList2);
        ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listFilterPoints, 10));
        Iterator<T> it3 = listFilterPoints.iterator();
        while (it3.hasNext()) {
            arrayList3.add(Long.valueOf(((GpsPointWrapper) it3.next()).time()));
        }
        String strReverseTime = reverseTime(CollectionsKt___CollectionsKt.toList(arrayList3));
        StringBuffer stringBuffer = new StringBuffer();
        StringBuffer stringBuffer2 = new StringBuffer();
        StringBuffer stringBuffer3 = new StringBuffer();
        StringBuffer stringBuffer4 = new StringBuffer();
        int size = listFilterPoints.size();
        Iterator it4 = listFilterPoints.iterator();
        long j = 0;
        long j2 = 0;
        int i3 = 0;
        while (it4.hasNext()) {
            Object next = it4.next();
            int i4 = i3 + 1;
            if (i3 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            GpsPointWrapper gpsPointWrapper = (GpsPointWrapper) next;
            stringBuffer3.append(gpsPointWrapper.altitude());
            stringBuffer.append(gpsPointWrapper.pace());
            stringBuffer2.append(Short.valueOf(gpsPointWrapper.state()));
            PointDataTypeUtil pointDataTypeUtil = PointDataTypeUtil.INSTANCE;
            Iterator it5 = it4;
            String str = strReverseTime;
            long jDecodeValue = (long) (pointDataTypeUtil.decodeValue(gpsPointWrapper.latitude()) * f);
            long jDecodeValue2 = (long) (pointDataTypeUtil.decodeValue(gpsPointWrapper.longitude()) * f);
            stringBuffer4.append((jDecodeValue - j) + "," + (jDecodeValue2 - j2));
            if (size != i4) {
                stringBuffer3.append(";");
                stringBuffer.append(";");
                stringBuffer2.append(";");
                stringBuffer4.append(";");
            }
            j = jDecodeValue;
            i3 = i4;
            j2 = jDecodeValue2;
            strReverseTime = str;
            it4 = it5;
        }
        this.trackData.setBulkll(stringBuffer4.toString());
        this.trackData.setBulkal(stringBuffer3.toString());
        this.trackData.setBulkflag(stringBuffer2.toString());
        this.trackData.setBulkpace(stringBuffer.toString());
        this.trackData.setBulktime(strReverseTime);
        return this.trackData;
    }

    private final double b(long value) {
        return value / f;
    }

    private final void c(String info) {
    }

    private final List<Integer> d() {
        c(this.trackData.getBulkal());
        try {
            List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) this.trackData.getBulkal(), new String[]{";"}, false, 0, 6, (Object) null);
            ArrayList arrayList = new ArrayList();
            for (Object obj : listSplit$default) {
                if (!(((String) obj).length() == 0)) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(Integer.valueOf(Integer.parseInt((String) it2.next())));
            }
            return arrayList2;
        } catch (Exception unused) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
    }

    private final List<Integer> e() {
        c(this.trackData.getBulkpace());
        try {
            List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) this.trackData.getBulkpace(), new String[]{";"}, false, 0, 6, (Object) null);
            ArrayList arrayList = new ArrayList();
            for (Object obj : listSplit$default) {
                if (!(((String) obj).length() == 0)) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(Integer.valueOf((int) (Float.parseFloat((String) it2.next()) * 100)));
            }
            return arrayList2;
        } catch (Exception unused) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
    }

    private final List<Short> f() {
        c(this.trackData.getBulkflag());
        try {
            List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) this.trackData.getBulkflag(), new String[]{";"}, false, 0, 6, (Object) null);
            ArrayList arrayList = new ArrayList();
            for (Object obj : listSplit$default) {
                if (!(((String) obj).length() == 0)) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(Short.valueOf(Short.parseShort((String) it2.next())));
            }
            return arrayList2;
        } catch (Exception unused) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
    }

    @NotNull
    public final Trackdata filter() {
        String bulkll = this.trackData.getBulkll();
        if (bulkll == null || bulkll.length() == 0) {
            return this.trackData;
        }
        if (!GpsFilterConfig.INSTANCE.getEnable()) {
            return this.trackData;
        }
        List<Integer> listD = d();
        List<Long> listSplitTime = splitTime(this.trackData.getBulktime());
        List<Integer> listE = e();
        List<Short> listF = f();
        Pair<List<Double>, List<Double>> pairSplitLatLot = splitLatLot(this.trackData.getBulkll());
        List<Double> first = pairSplitLatLot.getFirst();
        List<Double> second = pairSplitLatLot.getSecond();
        if (listD.size() == listSplitTime.size() && listD.size() == listE.size() && listD.size() == listF.size() && listD.size() == first.size() && listD.size() == second.size()) {
            try {
                return a(listD, first, second, listE, listSplitTime, listF);
            } catch (Exception unused) {
                return this.trackData;
            }
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("altList [" + listD.size() + "], ");
        stringBuffer.append("timeList[" + listSplitTime.size() + "], paceList[" + listE.size() + "],");
        int size = listF.size();
        StringBuilder sb = new StringBuilder();
        sb.append("stateList [");
        sb.append(size);
        sb.append("], ");
        stringBuffer.append(sb.toString());
        stringBuffer.append("latitudeList [" + first.size() + "], ");
        stringBuffer.append("longitudeList [" + second.size() + "], ");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("数组个数对不上 ");
        sb2.append((Object) stringBuffer);
        HMLog.e(b, sb2.toString(), new Object[0]);
        return this.trackData;
    }

    @NotNull
    public final String reverseTime(@NotNull List<Long> timeList) {
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(timeList, 10));
        int i = 0;
        for (Object obj : timeList) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            long jLongValue = ((Number) obj).longValue();
            if (i > 0) {
                jLongValue -= timeList.get(i - 1).longValue();
            }
            arrayList.add(Long.valueOf(jLongValue));
            i = i2;
        }
        return CollectionsKt___CollectionsKt.joinToString$default(arrayList, ";", null, null, 0, null, null, 62, null);
    }

    @NotNull
    public final Pair<List<Double>, List<Double>> splitLatLot(@NotNull String bulkll) {
        int i;
        try {
            List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) bulkll, new String[]{";"}, false, 0, 6, (Object) null);
            ArrayList arrayList = new ArrayList();
            Iterator it2 = listSplit$default.iterator();
            while (true) {
                i = 0;
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if ((((String) next).length() == 0 ? 1 : 0) == 0) {
                    arrayList.add(next);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                List listSplit$default2 = StringsKt__StringsKt.split$default((CharSequence) it3.next(), new String[]{","}, false, 0, 6, (Object) null);
                if (listSplit$default2.size() == 2) {
                    arrayList2.add(Long.valueOf(Long.parseLong((String) listSplit$default2.get(0))));
                    arrayList3.add(Long.valueOf(Long.parseLong((String) listSplit$default2.get(1))));
                }
            }
            ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, 10));
            long jLongValue = 0;
            long jLongValue2 = 0;
            int i2 = 0;
            for (Object obj : arrayList2) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                long jLongValue3 = ((Number) obj).longValue();
                if (i2 > 0) {
                    jLongValue2 += ((Number) arrayList2.get(i2 - 1)).longValue();
                    jLongValue3 += jLongValue2;
                }
                arrayList4.add(Long.valueOf(jLongValue3));
                i2 = i3;
            }
            ArrayList arrayList5 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList4, 10));
            Iterator it4 = arrayList4.iterator();
            while (it4.hasNext()) {
                arrayList5.add(Double.valueOf(b(((Number) it4.next()).longValue())));
            }
            ArrayList arrayList6 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList3, 10));
            for (Object obj2 : arrayList3) {
                int i4 = i + 1;
                if (i < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                long jLongValue4 = ((Number) obj2).longValue();
                if (i > 0) {
                    jLongValue += ((Number) arrayList3.get(i - 1)).longValue();
                    jLongValue4 += jLongValue;
                }
                arrayList6.add(Long.valueOf(jLongValue4));
                i = i4;
            }
            ArrayList arrayList7 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList6, 10));
            Iterator it5 = arrayList6.iterator();
            while (it5.hasNext()) {
                arrayList7.add(Double.valueOf(b(((Number) it5.next()).longValue())));
            }
            return new Pair<>(arrayList5, arrayList7);
        } catch (Exception unused) {
            return new Pair<>(CollectionsKt__CollectionsKt.emptyList(), CollectionsKt__CollectionsKt.emptyList());
        }
    }

    @NotNull
    public final List<Long> splitTime(@NotNull String bulkTime) {
        int i;
        c(bulkTime);
        try {
            List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) bulkTime, new String[]{";"}, false, 0, 6, (Object) null);
            ArrayList arrayList = new ArrayList();
            Iterator it2 = listSplit$default.iterator();
            while (true) {
                i = 0;
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if ((((String) next).length() == 0 ? 1 : 0) == 0) {
                    arrayList.add(next);
                }
            }
            long j = 0;
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
            for (Object obj : arrayList) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                String str = (String) obj;
                if (i != 0) {
                    j += Long.parseLong((String) arrayList.get(i - 1));
                }
                arrayList2.add(Long.valueOf(Long.parseLong(str) + j));
                i = i2;
            }
            return arrayList2;
        } catch (Exception unused) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
    }
}
