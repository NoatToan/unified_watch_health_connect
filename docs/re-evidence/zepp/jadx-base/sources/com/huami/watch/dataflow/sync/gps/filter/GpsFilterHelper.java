package com.huami.watch.dataflow.sync.gps.filter;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.core.device.feature.gps.filter.GpsPointFilterHelper;
import com.huami.core.device.feature.gps.filter.GpsPointWrapper;
import com.huami.core.device.feature.gps.filter.PointDataTypeUtil;
import com.huami.nfc.web.Constant;
import com.huami.watch.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\n\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0011\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b*\u0010+J\\\u0010\u000e\u001a\u00020\r2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0002H\u0002Jh\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00010\u000f2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0002H\u0002J\u0018\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0010H\u0002J\u0018\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0010H\u0002J\u0018\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u0010H\u0002J\u0018\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u0010H\u0002J*\u0010\u001c\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0010H\u0002J\u0010\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\tH\u0002J\u0016\u0010\u001f\u001a\u00020\u00102\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0002H\u0002J&\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00010\u000f2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00010\u000fR\u0016\u0010#\u001a\u00020\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\"R\u0016\u0010$\u001a\u00020\u00108\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\"R\u0016\u0010%\u001a\u00020\u00108\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010\"R\u0016\u0010'\u001a\u00020\u00038\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010&R\u0016\u0010)\u001a\u00020\u00058\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010(¨\u0006,"}, d2 = {"Lcom/huami/watch/dataflow/sync/gps/filter/GpsFilterHelper;", "", "", "", "altList", "", "latitudeList", Constant.KEY_LONGITUDE, "paceList", "", "timeList", "", "stateList", "", "a", "", "", "i", "altitudeStr", GoogleApiAvailabilityLight.a, "timeStr", "h", "paceStr", "g", "flagStr", "e", "longitudeAndLatitudesStr", "Lkotlin/Pair;", "f", "value", "b", "c", "detailMap", "filterGpsPoint", "Ljava/lang/String;", "tag", "defaultSplit", "llSplit", LogUtil.I, "paceMulti", LogUtil.D, "enlarge", "<init>", "()V", "companionlib_release"}, k = 1, mv = {1, 4, 0})
public final class GpsFilterHelper {
    public static final GpsFilterHelper INSTANCE = new GpsFilterHelper();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private static final String tag = GpsFilterHelper.class.getSimpleName();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final String defaultSplit = ";";

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static final String llSplit = ",";

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private static final int paceMulti = 100;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private static final double enlarge = 1.0E8d;

    private GpsFilterHelper() {
    }

    private final boolean a(List<Integer> altList, List<Double> latitudeList, List<Double> longitude, List<Integer> paceList, List<Long> timeList, List<Short> stateList) {
        if (altList.size() == timeList.size() && altList.size() == paceList.size() && altList.size() == stateList.size() && altList.size() == latitudeList.size() && altList.size() == longitude.size()) {
            return true;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("altList [" + altList.size() + "], ");
        stringBuffer.append("timeList[" + timeList.size() + "], paceList[" + paceList.size() + "],");
        StringBuilder sb = new StringBuilder();
        sb.append("stateList [");
        sb.append(stateList.size());
        sb.append("], ");
        stringBuffer.append(sb.toString());
        stringBuffer.append("latitudeList [" + latitudeList.size() + "], ");
        stringBuffer.append("longitudeList [" + longitude.size() + "], ");
        Log.e(tag, "数组个数对不上 " + stringBuffer, new Object[0]);
        return false;
    }

    private final double b(long value) {
        return value / enlarge;
    }

    private final String c(List<Long> timeList) {
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

    private final List<Integer> d(String altitudeStr) {
        if (altitudeStr == null || altitudeStr.length() == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        try {
            List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) altitudeStr, new String[]{";"}, false, 0, 6, (Object) null);
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

    private final List<Short> e(String flagStr) {
        if (flagStr == null || flagStr.length() == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        try {
            List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) flagStr, new String[]{";"}, false, 0, 6, (Object) null);
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

    private final Pair<List<Double>, List<Double>> f(String longitudeAndLatitudesStr) {
        int i = 0;
        if (longitudeAndLatitudesStr == null || longitudeAndLatitudesStr.length() == 0) {
            return new Pair<>(CollectionsKt__CollectionsKt.emptyList(), CollectionsKt__CollectionsKt.emptyList());
        }
        try {
            List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) longitudeAndLatitudesStr, new String[]{";"}, false, 0, 6, (Object) null);
            ArrayList arrayList = new ArrayList();
            for (Object obj : listSplit$default) {
                if (!(((String) obj).length() == 0)) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                List listSplit$default2 = StringsKt__StringsKt.split$default((CharSequence) it2.next(), new String[]{","}, false, 0, 6, (Object) null);
                if (listSplit$default2.size() == 2) {
                    arrayList2.add(Long.valueOf(Long.parseLong((String) listSplit$default2.get(0))));
                    arrayList3.add(Long.valueOf(Long.parseLong((String) listSplit$default2.get(1))));
                }
            }
            ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, 10));
            long jLongValue = 0;
            long jLongValue2 = 0;
            int i2 = 0;
            for (Object obj2 : arrayList2) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                long jLongValue3 = ((Number) obj2).longValue();
                if (i2 > 0) {
                    jLongValue2 += ((Number) arrayList2.get(i2 - 1)).longValue();
                    jLongValue3 += jLongValue2;
                }
                arrayList4.add(Long.valueOf(jLongValue3));
                i2 = i3;
            }
            ArrayList arrayList5 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList4, 10));
            Iterator it3 = arrayList4.iterator();
            while (it3.hasNext()) {
                arrayList5.add(Double.valueOf(b(((Number) it3.next()).longValue())));
            }
            ArrayList arrayList6 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList3, 10));
            for (Object obj3 : arrayList3) {
                int i4 = i + 1;
                if (i < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                long jLongValue4 = ((Number) obj3).longValue();
                if (i > 0) {
                    jLongValue += ((Number) arrayList3.get(i - 1)).longValue();
                    jLongValue4 += jLongValue;
                }
                arrayList6.add(Long.valueOf(jLongValue4));
                i = i4;
            }
            ArrayList arrayList7 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList6, 10));
            Iterator it4 = arrayList6.iterator();
            while (it4.hasNext()) {
                arrayList7.add(Double.valueOf(b(((Number) it4.next()).longValue())));
            }
            return new Pair<>(arrayList5, arrayList7);
        } catch (Exception unused) {
            return new Pair<>(CollectionsKt__CollectionsKt.emptyList(), CollectionsKt__CollectionsKt.emptyList());
        }
    }

    private final List<Integer> g(String paceStr) {
        if (paceStr == null || paceStr.length() == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        try {
            List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) paceStr, new String[]{";"}, false, 0, 6, (Object) null);
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

    private final List<Long> h(String timeStr) {
        int i = 0;
        if (timeStr == null || timeStr.length() == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        try {
            List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) timeStr, new String[]{";"}, false, 0, 6, (Object) null);
            ArrayList arrayList = new ArrayList();
            for (Object obj : listSplit$default) {
                if (!(((String) obj).length() == 0)) {
                    arrayList.add(obj);
                }
            }
            long j = 0;
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
            for (Object obj2 : arrayList) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                String str = (String) obj2;
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

    private final Map<String, Object> i(List<Integer> altList, List<Double> latitudeList, List<Double> longitude, List<Integer> paceList, List<Long> timeList, List<Short> stateList) {
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
        String strC = c(CollectionsKt___CollectionsKt.toList(arrayList3));
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
            String str = strC;
            long jDecodeValue = (long) (pointDataTypeUtil.decodeValue(gpsPointWrapper.latitude()) * enlarge);
            long jDecodeValue2 = (long) (pointDataTypeUtil.decodeValue(gpsPointWrapper.longitude()) * enlarge);
            StringBuilder sb = new StringBuilder();
            sb.append(jDecodeValue - j);
            sb.append(',');
            sb.append(jDecodeValue2 - j2);
            stringBuffer4.append(sb.toString());
            if (size != i4) {
                stringBuffer.append(";");
                stringBuffer2.append(";");
                stringBuffer3.append(";");
                stringBuffer4.append(";");
            }
            j = jDecodeValue;
            i3 = i4;
            j2 = jDecodeValue2;
            strC = str;
            it4 = it5;
        }
        HashMap map = new HashMap();
        map.put("longitude_latitude", stringBuffer4.toString());
        map.put("flag", stringBuffer2.toString());
        map.put("time", strC);
        map.put("altitude", stringBuffer3.toString());
        map.put("pace", stringBuffer.toString());
        return map;
    }

    @NotNull
    public final Map<String, Object> filterGpsPoint(@NotNull Map<String, ? extends Object> detailMap) {
        Object obj = detailMap.get("longitude_latitude");
        String string = obj != null ? obj.toString() : null;
        if ((string == null || string.length() == 0) || !Config.INSTANCE.getEnable()) {
            return detailMap;
        }
        Object obj2 = detailMap.get("time");
        String string2 = obj2 != null ? obj2.toString() : null;
        Object obj3 = detailMap.get("altitude");
        String string3 = obj3 != null ? obj3.toString() : null;
        String strValueOf = String.valueOf(detailMap.get("pace"));
        String strValueOf2 = String.valueOf(detailMap.get("flag"));
        Pair<List<Double>, List<Double>> pairF = f(string);
        List<Double> first = pairF.getFirst();
        List<Double> second = pairF.getSecond();
        List<Long> listH = h(string2);
        List<Integer> listD = d(string3);
        List<Integer> listG = g(strValueOf);
        List<Short> listE = e(strValueOf2);
        if (!a(listD, first, second, listG, listH, listE)) {
            return detailMap;
        }
        try {
            return i(listD, first, second, listG, listH, listE);
        } catch (Exception unused) {
            return detailMap;
        }
    }
}
