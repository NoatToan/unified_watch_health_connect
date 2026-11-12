package com.huami.stress.domain.service;

import android.util.LongSparseArray;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.huami.stress.domain.data.converter.StressExKt;
import com.huami.stress.domain.data.device.bean.StressDeviceBean;
import com.huami.stress.domain.data.local.bean.AllDayStressDaoBean;
import com.huami.stress.domain.data.local.bean.SingleStressDaoBean;
import com.huami.stress.domain.model.Stress;
import com.huami.stress.domain.utils.LogTagUtilsKt;
import com.huami.stress.domain.utils.RationUtils;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bodyfat.utils.ParamKey;
import com.xiaomi.hm.health.device.event.StatEvent;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.g;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.math.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b&\u0010'J,\u0010\b\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00030\u0006j\b\u0012\u0004\u0012\u00020\u0003`\u00070\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J@\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\tH\u0002J*\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u00022\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00022\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00130\u0002H\u0002J.\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\f0\u00022\u0006\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\fH\u0002J\u0010\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002JJ\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u00022\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\tJF\u0010\"\u001a\u0004\u0018\u00010 2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\tJ\u000e\u0010#\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001cJJ\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00110\u00022\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\tJ\u0018\u0010%\u001a\u0004\u0018\u00010 2\u0006\u0010\u0014\u001a\u00020 2\u0006\u0010\u0015\u001a\u00020 ¨\u0006("}, d2 = {"Lcom/huami/stress/domain/service/StressService;", "", "", "Lcom/huami/stress/domain/data/device/bean/StressDeviceBean;", "data", "Landroid/util/LongSparseArray;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "e", "", "userId", "deviceId", "", "deviceSource", "deviceType", ParamKey.deviceMac, ParamKey.deviceSn, "Lcom/huami/stress/domain/data/local/bean/SingleStressDaoBean;", GoogleApiAvailabilityLight.a, "Lcom/huami/stress/domain/model/Stress;", StatEvent.TP_FIRST, "second", "b", "relax", "normal", FirebaseAnalytics.Param.MEDIUM, "high", "a", "", "time", "c", "deviceData", "Lcom/huami/stress/domain/data/local/bean/AllDayStressDaoBean;", "parseDeviceDataToAllDayStressList", "parseDeviceDataToAllDayStress", "getAllDayStressTimestamp", "parseDeviceDataToSingleStressList", "combineAllDayStress", "<init>", "()V", "domain_release"}, k = 1, mv = {1, 5, 1})
public final class StressService {

    @NotNull
    public static final StressService INSTANCE = new StressService();

    private StressService() {
    }

    private final List<Integer> a(int relax, int normal, int medium, int high) {
        return RationUtils.INSTANCE.largestRemainderRound(CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(relax), Integer.valueOf(normal), Integer.valueOf(medium), Integer.valueOf(high)}), 100);
    }

    private final List<Stress> b(List<Stress> first, List<Stress> second) {
        LongSparseArray longSparseArray = new LongSparseArray();
        for (Stress stress : first) {
            longSparseArray.put(stress.getTime(), Integer.valueOf(stress.getValue()));
        }
        for (Stress stress2 : second) {
            longSparseArray.put(stress2.getTime(), Integer.valueOf(stress2.getValue()));
        }
        ArrayList arrayList = new ArrayList(longSparseArray.size());
        int i = 0;
        int size = longSparseArray.size();
        if (size > 0) {
            while (true) {
                int i2 = i + 1;
                arrayList.add(new Stress(((Number) longSparseArray.valueAt(i)).intValue(), longSparseArray.keyAt(i)));
                if (i2 >= size) {
                    break;
                }
                i = i2;
            }
        }
        if (arrayList.size() > 1) {
            g.sortWith(arrayList, new Comparator() { // from class: com.huami.stress.domain.service.StressService$combinePointList$$inlined$sortBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt__ComparisonsKt.compareValues(Long.valueOf(((Stress) t).getTime()), Long.valueOf(((Stress) t2).getTime()));
                }
            });
        }
        return arrayList;
    }

    private final long c(long time) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(time);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }

    private final SingleStressDaoBean d(StressDeviceBean data, String userId, String deviceId, int deviceSource, int deviceType, String deviceMac, String deviceSn) {
        return new SingleStressDaoBean(data.getTime(), userId, data.getValue(), deviceSource, deviceType, deviceId, deviceMac, deviceSn, false);
    }

    private final LongSparseArray<ArrayList<StressDeviceBean>> e(List<StressDeviceBean> data) {
        LongSparseArray<ArrayList<StressDeviceBean>> longSparseArray = new LongSparseArray<>();
        int size = data.size() - 1;
        if (size >= 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                long allDayStressTimestamp = getAllDayStressTimestamp(data.get(i).getTime());
                ArrayList<StressDeviceBean> arrayList = longSparseArray.get(allDayStressTimestamp);
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(data.get(i));
                longSparseArray.put(allDayStressTimestamp, arrayList);
                if (i2 > size) {
                    break;
                }
                i = i2;
            }
        }
        return longSparseArray;
    }

    @Nullable
    public final AllDayStressDaoBean combineAllDayStress(@NotNull AllDayStressDaoBean first, @NotNull AllDayStressDaoBean second) {
        Gson gson = new Gson();
        Type type = new TypeToken<ArrayList<Stress>>() { // from class: com.huami.stress.domain.service.StressService$combineAllDayStress$stressListType$1
        }.getType();
        List<Stress> list = (List) gson.fromJson(second.getData(), type);
        List<Stress> list2 = (List) gson.fromJson(first.getData(), type);
        if (list == null || list2 == null) {
            return null;
        }
        List<Stress> listB = b(list, list2);
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listB, 10));
        Iterator<T> it2 = listB.iterator();
        while (it2.hasNext()) {
            arrayList.add(StressExKt.toStressDeviceBean((Stress) it2.next()));
        }
        return parseDeviceDataToAllDayStress(arrayList, first.getUserId(), first.getDeviceType(), first.getDeviceSource(), first.getDeviceId(), first.getDeviceMac(), first.getDeviceSn());
    }

    public final long getAllDayStressTimestamp(long time) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(time);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 1);
        return calendar.getTimeInMillis();
    }

    @Nullable
    public final AllDayStressDaoBean parseDeviceDataToAllDayStress(@NotNull List<StressDeviceBean> data, @NotNull String userId, int deviceType, int deviceSource, @NotNull String deviceId, @NotNull String deviceMac, @NotNull String deviceSn) {
        int i;
        int i2;
        int value;
        if (data.isEmpty()) {
            return null;
        }
        HMLog.i(LogTagUtilsKt.getTAG(this), "筛选前size=" + data.size() + ",data=" + ((Object) new Gson().toJson(data)), new Object[0]);
        LongSparseArray longSparseArray = new LongSparseArray();
        for (StressDeviceBean stressDeviceBean : data) {
            longSparseArray.put(INSTANCE.c(stressDeviceBean.getTime()), stressDeviceBean);
        }
        ArrayList arrayList = new ArrayList();
        int size = longSparseArray.size();
        for (int i3 = 0; i3 < size; i3++) {
            longSparseArray.keyAt(i3);
            arrayList.add((StressDeviceBean) longSparseArray.valueAt(i3));
        }
        HMLog.i(LogTagUtilsKt.getTAG(this), "筛选后size=" + arrayList.size() + ",data=" + ((Object) new Gson().toJson(arrayList)), new Object[0]);
        int value2 = ((StressDeviceBean) arrayList.get(0)).getValue();
        int value3 = ((StressDeviceBean) arrayList.get(0)).getValue();
        int size2 = arrayList.size() + (-1);
        if (size2 >= 0) {
            int i4 = 0;
            value = 0;
            while (true) {
                int i5 = i4 + 1;
                if (value2 < ((StressDeviceBean) arrayList.get(i4)).getValue()) {
                    value2 = ((StressDeviceBean) arrayList.get(i4)).getValue();
                }
                if (value3 > ((StressDeviceBean) arrayList.get(i4)).getValue()) {
                    value3 = ((StressDeviceBean) arrayList.get(i4)).getValue();
                }
                value += ((StressDeviceBean) arrayList.get(i4)).getValue();
                if (i5 > size2) {
                    break;
                }
                i4 = i5;
            }
            i = value2;
            i2 = value3;
        } else {
            i = value2;
            i2 = value3;
            value = 0;
        }
        StressLevelService stressLevelService = StressLevelService.INSTANCE;
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Integer.valueOf(((StressDeviceBean) it2.next()).getValue()));
        }
        List<Integer> listCalculateStressRation = stressLevelService.calculateStressRation(arrayList2);
        int iRoundToInt = c.roundToInt((value * 1.0f) / arrayList.size());
        String json = new Gson().toJson(arrayList);
        long allDayStressTimestamp = getAllDayStressTimestamp(((StressDeviceBean) arrayList.get(0)).getTime());
        Integer num = (Integer) CollectionsKt.getOrNull(listCalculateStressRation, 0);
        int iIntValue = num == null ? 0 : num.intValue();
        Integer num2 = (Integer) CollectionsKt.getOrNull(listCalculateStressRation, 1);
        int iIntValue2 = num2 == null ? 0 : num2.intValue();
        Integer num3 = (Integer) CollectionsKt.getOrNull(listCalculateStressRation, 2);
        int iIntValue3 = num3 == null ? 0 : num3.intValue();
        Integer num4 = (Integer) CollectionsKt.getOrNull(listCalculateStressRation, 3);
        return new AllDayStressDaoBean(allDayStressTimestamp, userId, deviceSource, deviceType, deviceId, deviceMac, deviceSn, i, i2, iRoundToInt, iIntValue, iIntValue2, iIntValue3, num4 == null ? 0 : num4.intValue(), json, false);
    }

    @NotNull
    public final List<AllDayStressDaoBean> parseDeviceDataToAllDayStressList(@NotNull List<StressDeviceBean> deviceData, @NotNull String userId, int deviceType, int deviceSource, @NotNull String deviceId, @NotNull String deviceMac, @NotNull String deviceSn) {
        LongSparseArray<ArrayList<StressDeviceBean>> longSparseArrayE = e(deviceData);
        ArrayList arrayList = new ArrayList();
        int size = longSparseArrayE.size();
        if (size > 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                AllDayStressDaoBean deviceDataToAllDayStress = parseDeviceDataToAllDayStress(longSparseArrayE.valueAt(i), userId, deviceType, deviceSource, deviceId, deviceMac, deviceSn);
                if (deviceDataToAllDayStress != null) {
                    arrayList.add(deviceDataToAllDayStress);
                }
                if (i2 >= size) {
                    break;
                }
                i = i2;
            }
        }
        return arrayList;
    }

    @NotNull
    public final List<SingleStressDaoBean> parseDeviceDataToSingleStressList(@NotNull List<StressDeviceBean> deviceData, @NotNull String userId, @NotNull String deviceId, int deviceSource, int deviceType, @NotNull String deviceMac, @NotNull String deviceSn) {
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(deviceData, 10));
        Iterator<T> it2 = deviceData.iterator();
        while (it2.hasNext()) {
            arrayList.add(INSTANCE.d((StressDeviceBean) it2.next(), userId, deviceId, deviceSource, deviceType, deviceMac, deviceSn));
        }
        return arrayList;
    }
}
