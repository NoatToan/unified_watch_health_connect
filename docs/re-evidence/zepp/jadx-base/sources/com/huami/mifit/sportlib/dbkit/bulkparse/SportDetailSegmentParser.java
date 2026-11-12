package com.huami.mifit.sportlib.dbkit.bulkparse;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/huami/mifit/sportlib/dbkit/bulkparse/SportDetailSegmentParser;", "", "<init>", "()V", "Companion", "sportlib_release"}, k = 1, mv = {1, 5, 1})
public final class SportDetailSegmentParser {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\t"}, d2 = {"Lcom/huami/mifit/sportlib/dbkit/bulkparse/SportDetailSegmentParser$Companion;", "", "", "segmentStr", "", "Lcom/huami/mifit/sportlib/dbkit/bulkparse/SportSegmentData;", "initSegmentData", "<init>", "()V", "sportlib_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final List<List<SportSegmentData>> initSegmentData(@NotNull String segmentStr) {
            List listEmptyList;
            ArrayList arrayList;
            List listEmptyList2;
            String str;
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            ArrayList arrayList5 = new ArrayList();
            ArrayList arrayList6 = new ArrayList();
            ArrayList arrayList7 = new ArrayList();
            ArrayList arrayList8 = new ArrayList();
            ArrayList arrayList9 = new ArrayList();
            List<String> listSplit = new Regex(";").split(segmentStr, 0);
            if (!listSplit.isEmpty()) {
                ListIterator<String> listIterator = listSplit.listIterator(listSplit.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        listEmptyList = CollectionsKt__CollectionsKt.emptyList();
                        break;
                    }
                    if (!(listIterator.previous().length() == 0)) {
                        listEmptyList = CollectionsKt___CollectionsKt.take(listSplit, listIterator.nextIndex() + 1);
                        break;
                    }
                }
            } else {
                listEmptyList = CollectionsKt__CollectionsKt.emptyList();
                break;
            }
            Object[] array = listEmptyList.toArray(new String[0]);
            String str2 = "null cannot be cast to non-null type kotlin.Array<T>";
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            String[] strArr = (String[]) array;
            int length = strArr.length - 1;
            if (length >= 0) {
                int i = 0;
                int distance = 0;
                int distance2 = 0;
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    int i4 = i + 1;
                    String[] strArr2 = strArr;
                    List<String> listSplit2 = new Regex(",").split(strArr[i], 0);
                    if (listSplit2.isEmpty()) {
                        listEmptyList2 = CollectionsKt__CollectionsKt.emptyList();
                    } else {
                        ListIterator<String> listIterator2 = listSplit2.listIterator(listSplit2.size());
                        while (true) {
                            if (listIterator2.hasPrevious()) {
                                if (!(listIterator2.previous().length() == 0)) {
                                    listEmptyList2 = CollectionsKt___CollectionsKt.take(listSplit2, listIterator2.nextIndex() + 1);
                                }
                            } else {
                                listEmptyList2 = CollectionsKt__CollectionsKt.emptyList();
                            }
                        }
                    }
                    Object[] array2 = listEmptyList2.toArray(new String[0]);
                    Objects.requireNonNull(array2, str2);
                    String[] strArr3 = (String[]) array2;
                    if (strArr3.length >= 19) {
                        SportSegmentData sportSegmentData = new SportSegmentData();
                        int i5 = Integer.parseInt(strArr3[18]);
                        str = str2;
                        sportSegmentData.setIndex(Integer.parseInt(strArr3[0]) + 1);
                        sportSegmentData.setCostTime(Integer.parseInt(strArr3[1]));
                        sportSegmentData.setDistance(Integer.parseInt(strArr3[2]));
                        sportSegmentData.setGeohash(strArr3[3]);
                        sportSegmentData.setOffsetTime(Integer.parseInt(strArr3[5]));
                        sportSegmentData.setAvgPace(Float.parseFloat(strArr3[9]));
                        sportSegmentData.setMaxPace(Float.parseFloat(strArr3[10]));
                        sportSegmentData.setStrokeSpeed(Float.parseFloat(strArr3[12]));
                        sportSegmentData.setStrokes(Integer.parseInt(strArr3[13]));
                        sportSegmentData.setSwolf(Integer.parseInt(strArr3[14]));
                        sportSegmentData.setType(i5);
                        sportSegmentData.setAvgHR(Integer.parseInt(strArr3[4]));
                        arrayList = arrayList2;
                        if (strArr3.length > 21) {
                            sportSegmentData.setWeight(Integer.parseInt(strArr3[21]));
                            sportSegmentData.setCount(Integer.parseInt(strArr3[22]));
                            sportSegmentData.setUnit(Integer.parseInt(strArr3[23]));
                            sportSegmentData.setFloor(Integer.parseInt(strArr3[24]));
                            sportSegmentData.setFloorPerMin(Float.parseFloat(strArr3[25]));
                            sportSegmentData.setSwimStyle(Integer.parseInt(strArr3[26]));
                        }
                        if (strArr3.length > 28) {
                            sportSegmentData.setStrengthTrainType(Integer.parseInt(strArr3[28]));
                        }
                        switch (i5) {
                            case 0:
                                distance += sportSegmentData.getDistance();
                                sportSegmentData.setTotalDistance(distance);
                                int size = arrayList4.size();
                                if (size > 0) {
                                    sportSegmentData.setTimeDifference(sportSegmentData.getCostTime() - ((SportSegmentData) arrayList4.get(size - 1)).getCostTime());
                                }
                                sportSegmentData.setAvgStepFreq(Integer.parseInt(strArr3[16]));
                                sportSegmentData.setCal(Integer.parseInt(strArr3[15]));
                                sportSegmentData.setAvgHR(Integer.parseInt(strArr3[4]));
                                arrayList4.add(sportSegmentData);
                                break;
                            case 1:
                                distance2 += sportSegmentData.getDistance();
                                sportSegmentData.setTotalDistance(distance2);
                                int size2 = arrayList3.size();
                                if (size2 > 0) {
                                    sportSegmentData.setTimeDifference(sportSegmentData.getCostTime() - ((SportSegmentData) arrayList3.get(size2 - 1)).getCostTime());
                                }
                                arrayList3.add(sportSegmentData);
                                break;
                            case 2:
                                int distance3 = i2 + sportSegmentData.getDistance();
                                sportSegmentData.setTotalDistance(distance3);
                                if (strArr3.length > 20) {
                                    sportSegmentData.setChildType(Integer.parseInt(strArr3[20]));
                                }
                                arrayList5.add(sportSegmentData);
                                i2 = distance3;
                                break;
                            case 3:
                                int size3 = arrayList6.size();
                                if (size3 > 0) {
                                    sportSegmentData.setTimeDifference(sportSegmentData.getCostTime() - ((SportSegmentData) arrayList6.get(size3 - 1)).getCostTime());
                                }
                                arrayList6.add(sportSegmentData);
                                break;
                            case 4:
                                sportSegmentData.setRopeSkippingCount(Integer.parseInt(strArr3[19]));
                                sportSegmentData.setAvgStepFreq(Integer.parseInt(strArr3[16]));
                                sportSegmentData.setCal(Integer.parseInt(strArr3[15]));
                                arrayList7.add(sportSegmentData);
                                break;
                            case 5:
                                int distance4 = i3 + sportSegmentData.getDistance();
                                sportSegmentData.setTotalDistance(distance4);
                                int size4 = arrayList8.size();
                                if (size4 > 0) {
                                    sportSegmentData.setTimeDifference(sportSegmentData.getCostTime() - ((SportSegmentData) arrayList8.get(size4 - 1)).getCostTime());
                                }
                                sportSegmentData.setAvgStepFreq(Integer.parseInt(strArr3[16]));
                                sportSegmentData.setCal(Integer.parseInt(strArr3[15]));
                                sportSegmentData.setAvgHR(Integer.parseInt(strArr3[4]));
                                arrayList8.add(sportSegmentData);
                                i3 = distance4;
                                break;
                            case 6:
                                int size5 = arrayList9.size();
                                if (size5 > 0) {
                                    sportSegmentData.setTimeDifference(sportSegmentData.getCostTime() - ((SportSegmentData) arrayList9.get(size5 - 1)).getCostTime());
                                }
                                sportSegmentData.setRopeSkippingCount(Integer.parseInt(strArr3[19]));
                                sportSegmentData.setAvgStepFreq(Integer.parseInt(strArr3[16]));
                                sportSegmentData.setCal(Integer.parseInt(strArr3[15]));
                                sportSegmentData.setTrainGroupType(Integer.parseInt(strArr3[27]));
                                arrayList9.add(sportSegmentData);
                                break;
                        }
                    } else {
                        arrayList = arrayList2;
                        str = str2;
                    }
                    if (i4 <= length) {
                        i = i4;
                        strArr = strArr2;
                        arrayList2 = arrayList;
                        str2 = str;
                    }
                }
            } else {
                arrayList = arrayList2;
            }
            int size6 = arrayList3.size();
            if (size6 > 0) {
                ((SportSegmentData) arrayList3.get(size6 - 1)).setTimeDifference(0);
            }
            ArrayList arrayList10 = arrayList;
            arrayList10.add(arrayList3);
            arrayList10.add(arrayList4);
            arrayList10.add(arrayList5);
            arrayList10.add(arrayList6);
            arrayList10.add(arrayList7);
            arrayList10.add(arrayList8);
            arrayList10.add(arrayList9);
            return arrayList10;
        }
    }
}
