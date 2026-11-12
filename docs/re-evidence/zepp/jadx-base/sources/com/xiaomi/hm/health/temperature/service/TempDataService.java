package com.xiaomi.hm.health.temperature.service;

import android.util.Base64;
import android.util.LongSparseArray;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bodyfat.utils.ParamKey;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.healthdata.ext.DataExKt;
import com.xiaomi.hm.health.healthdata.utils.HealthDataTimeUtils;
import com.xiaomi.hm.health.temperature.TempExtKt;
import com.xiaomi.hm.health.temperature.local.entity.AllDayTempEntity;
import com.xiaomi.hm.health.temperature.model.TemperaturePair;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.g;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0015\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b(\u0010)J,\u0010\b\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00030\u0006j\b\u0012\u0004\u0012\u00020\u0003`\u00070\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\u0010\u0010\u000b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0002J\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0002JH\u0010\u0016\u001a\u0004\u0018\u00010\u00152\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\rH\u0002J\u0016\u0010\u0018\u001a\u00020\r2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\u001c\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002JJ\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00150\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\rJ\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u0015J\u001c\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\rR\u0016\u0010\"\u001a\u00020\r8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010!R\u0016\u0010$\u001a\u00020\u000f8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010#R\u0016\u0010%\u001a\u00020\u000f8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010#R\u0016\u0010&\u001a\u00020\u000f8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010#R\u0016\u0010'\u001a\u00020\u000f8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010#¨\u0006*"}, d2 = {"Lcom/xiaomi/hm/health/temperature/service/TempDataService;", "", "", "Lcom/xiaomi/hm/health/temperature/model/TemperaturePair;", "data", "Landroid/util/LongSparseArray;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "f", "", "time", "c", GoogleApiAvailabilityLight.a, "", "userId", "", "deviceType", "deviceSource", "deviceId", ParamKey.deviceMac, ParamKey.deviceSn, "Lcom/xiaomi/hm/health/temperature/local/entity/AllDayTempEntity;", "e", "tempPairList", "b", "a", "parseDeviceDataToAllDayTempList", "localData", "newData", "combineAllDayTemp", "dayTime", "dataStr", "decodeAllDayTempData", "Ljava/lang/String;", "TAG", LogUtil.I, "ALL_DAY_DATA_SIZE_FULL", "ITEM_DATA_LENGTH", "MILLI_SECONDS_IN_MINUTE", "INVALID_TEMP", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class TempDataService {

    @NotNull
    public static final TempDataService INSTANCE = new TempDataService();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final String TAG = "TempDataService";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final int ALL_DAY_DATA_SIZE_FULL = 1440;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static final int ITEM_DATA_LENGTH = 4;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private static final int MILLI_SECONDS_IN_MINUTE = 60000;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private static final int INVALID_TEMP = 255;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ List<TemperaturePair> a;
        public final /* synthetic */ List<TemperaturePair> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(List<TemperaturePair> list, List<TemperaturePair> list2) {
            super(0);
            this.a = list;
            this.b = list2;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "combineAllDayTemp localData size:" + this.a.size() + "\nlocalData:" + this.a + "\nnewData size:" + this.b.size() + "\nnewData:" + this.b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ List<TemperaturePair> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(List<TemperaturePair> list) {
            super(0);
            this.a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "completeAllDayTempData result size:" + this.a.size() + "\nresult:" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ ArrayList<TemperaturePair> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ArrayList<TemperaturePair> arrayList) {
            super(0);
            this.a = arrayList;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "decodeAllDayTempData result size:" + this.a.size();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public static final d a = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "parseDeviceDataToAllDayTempList data is null or empty";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public static final e a = new e();

        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "parseDeviceDataToAllDayTemp data is null or empty";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<String> {
        public static final f a = new f();

        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "parseDeviceDataToAllDayTemp data is invalid all";
        }
    }

    private TempDataService() {
    }

    private final List<TemperaturePair> a(List<TemperaturePair> data) {
        ArrayList arrayList = new ArrayList();
        LongSparseArray longSparseArray = new LongSparseArray(1440);
        long jD = d(((TemperaturePair) CollectionsKt.first((List) data)).getTimestamp());
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = i2 + 1;
            long j = ((long) (i2 * 60000)) + jD;
            longSparseArray.put(j, new TemperaturePair(HealthDataTimeUtils.INSTANCE.getTimeToMinute(j), (short) 255, (short) 255));
            if (i3 >= 1440) {
                break;
            }
            i2 = i3;
        }
        for (TemperaturePair temperaturePair : data) {
            longSparseArray.put(HealthDataTimeUtils.INSTANCE.getTimeToMinute(temperaturePair.getTimestamp()), temperaturePair);
        }
        int size = longSparseArray.size();
        if (size > 0) {
            while (true) {
                int i4 = i + 1;
                longSparseArray.keyAt(i);
                arrayList.add((TemperaturePair) longSparseArray.valueAt(i));
                if (i4 >= size) {
                    break;
                }
                i = i4;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (TempExtKt.isValidValue((TemperaturePair) obj)) {
                arrayList2.add(obj);
            }
        }
        HMLog.info(TAG, new b(arrayList2));
        if (arrayList.size() > 1) {
            g.sortWith(arrayList, new Comparator() { // from class: com.xiaomi.hm.health.temperature.service.TempDataService$completeAllDayTempData$lambda-16$$inlined$sortBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt__ComparisonsKt.compareValues(Long.valueOf(((TemperaturePair) t).getTimestamp()), Long.valueOf(((TemperaturePair) t2).getTimestamp()));
                }
            });
        }
        return arrayList;
    }

    private final String b(List<TemperaturePair> tempPairList) {
        List<TemperaturePair> listA = a(tempPairList);
        byte[] bArr = new byte[listA.size() * 4];
        int i = 0;
        for (Object obj : listA) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            TemperaturePair temperaturePair = (TemperaturePair) obj;
            int i3 = i * 4;
            byte[] bArrShortToBytes = GattUtils.shortToBytes(temperaturePair.getEnvTempe());
            bArr[i3] = ArraysKt___ArraysKt.first(bArrShortToBytes);
            bArr[i3 + 1] = ArraysKt___ArraysKt.last(bArrShortToBytes);
            byte[] bArrShortToBytes2 = GattUtils.shortToBytes(temperaturePair.getBodyTempe());
            bArr[i3 + 2] = ArraysKt___ArraysKt.first(bArrShortToBytes2);
            bArr[i3 + 3] = ArraysKt___ArraysKt.last(bArrShortToBytes2);
            i = i2;
        }
        return Base64.encodeToString(bArr, 2);
    }

    private final long c(long time) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(time);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 1);
        return calendar.getTimeInMillis();
    }

    private final long d(long time) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(time);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }

    private final AllDayTempEntity e(List<TemperaturePair> data, String userId, int deviceType, int deviceSource, String deviceId, String deviceMac, String deviceSn) {
        float f2;
        float size;
        Object next;
        int bodyTempe = 0;
        Object next2 = null;
        if (data == null || data.isEmpty()) {
            HMLog.info(TAG, e.a);
            return null;
        }
        long jC = c(((TemperaturePair) CollectionsKt.first((List) data)).getTimestamp());
        ArrayList arrayList = new ArrayList();
        for (Object obj : data) {
            if (TempExtKt.isValidRange((TemperaturePair) obj)) {
                arrayList.add(obj);
            }
        }
        float f3 = 0.0f;
        if (!arrayList.isEmpty()) {
            Iterator it2 = arrayList.iterator();
            if (it2.hasNext()) {
                next = it2.next();
                if (it2.hasNext()) {
                    short bodyTempe2 = ((TemperaturePair) next).getBodyTempe();
                    do {
                        Object next3 = it2.next();
                        short bodyTempe3 = ((TemperaturePair) next3).getBodyTempe();
                        if (bodyTempe2 < bodyTempe3) {
                            next = next3;
                            bodyTempe2 = bodyTempe3;
                        }
                    } while (it2.hasNext());
                }
            } else {
                next = null;
            }
            float bodyTempe4 = ((TemperaturePair) next).getBodyTempe() / 100.0f;
            Iterator it3 = arrayList.iterator();
            if (it3.hasNext()) {
                next2 = it3.next();
                if (it3.hasNext()) {
                    short bodyTempe5 = ((TemperaturePair) next2).getBodyTempe();
                    do {
                        Object next4 = it3.next();
                        short bodyTempe6 = ((TemperaturePair) next4).getBodyTempe();
                        if (bodyTempe5 > bodyTempe6) {
                            next2 = next4;
                            bodyTempe5 = bodyTempe6;
                        }
                    } while (it3.hasNext());
                }
            }
            float bodyTempe7 = ((TemperaturePair) next2).getBodyTempe() / 100.0f;
            Iterator it4 = arrayList.iterator();
            while (it4.hasNext()) {
                bodyTempe += ((TemperaturePair) it4.next()).getBodyTempe();
            }
            size = (bodyTempe / arrayList.size()) / 100.0f;
            f2 = bodyTempe7;
            f3 = bodyTempe4;
        } else {
            HMLog.info(TAG, f.a);
            f2 = 0.0f;
            size = 0.0f;
        }
        return new AllDayTempEntity(jC, DataExKt.formatWithDecimalFloat(Float.valueOf(f3), 1), DataExKt.formatWithDecimalFloat(Float.valueOf(f2), 1), DataExKt.formatWithDecimalFloat(Float.valueOf(size), 1), b(data), userId, deviceSource, deviceId, deviceMac, deviceSn, deviceType);
    }

    private final LongSparseArray<ArrayList<TemperaturePair>> f(List<TemperaturePair> data) {
        LongSparseArray<ArrayList<TemperaturePair>> longSparseArray = new LongSparseArray<>();
        int size = data.size() - 1;
        if (size >= 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                long jC = c(data.get(i).getTimestamp());
                ArrayList<TemperaturePair> arrayList = longSparseArray.get(jC);
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(data.get(i));
                longSparseArray.put(jC, arrayList);
                if (i2 > size) {
                    break;
                }
                i = i2;
            }
        }
        return longSparseArray;
    }

    @Nullable
    public final AllDayTempEntity combineAllDayTemp(@NotNull AllDayTempEntity localData, @NotNull AllDayTempEntity newData) {
        List<TemperaturePair> listDecodeAllDayTempData = decodeAllDayTempData(localData.getTimestamp(), localData.getData());
        ArrayList<TemperaturePair> arrayList = new ArrayList();
        for (Object obj : listDecodeAllDayTempData) {
            if (TempExtKt.isValidValue((TemperaturePair) obj)) {
                arrayList.add(obj);
            }
        }
        List<TemperaturePair> listDecodeAllDayTempData2 = decodeAllDayTempData(newData.getTimestamp(), newData.getData());
        ArrayList<TemperaturePair> arrayList2 = new ArrayList();
        for (Object obj2 : listDecodeAllDayTempData2) {
            if (TempExtKt.isValidValue((TemperaturePair) obj2)) {
                arrayList2.add(obj2);
            }
        }
        HMLog.info(TAG, new a(arrayList, arrayList2));
        LongSparseArray longSparseArray = new LongSparseArray();
        for (TemperaturePair temperaturePair : arrayList) {
            longSparseArray.put(temperaturePair.getTimestamp(), temperaturePair);
        }
        for (TemperaturePair temperaturePair2 : arrayList2) {
            longSparseArray.put(temperaturePair2.getTimestamp(), temperaturePair2);
        }
        ArrayList arrayList3 = new ArrayList(longSparseArray.size());
        int i = 0;
        int size = longSparseArray.size();
        if (size > 0) {
            while (true) {
                int i2 = i + 1;
                longSparseArray.keyAt(i);
                arrayList3.add((TemperaturePair) longSparseArray.valueAt(i));
                if (i2 >= size) {
                    break;
                }
                i = i2;
            }
        }
        return e(arrayList3, localData.getUserId(), localData.getDeviceType(), localData.getDeviceSource(), localData.getDeviceId(), localData.getDeviceMac(), localData.getDeviceSn());
    }

    @NotNull
    public final List<TemperaturePair> decodeAllDayTempData(long dayTime, @NotNull String dataStr) {
        byte[] bArrDecode = Base64.decode(dataStr, 2);
        int length = bArrDecode.length / 4;
        ArrayList arrayList = new ArrayList();
        long jD = d(dayTime);
        if (length > 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                long j = ((long) (60000 * i)) + jD;
                int i3 = i * 4;
                arrayList.add(new TemperaturePair(HealthDataTimeUtils.INSTANCE.getTimeToMinute(j), (short) GattUtils.bytesToInt(bArrDecode, i3, 2), (short) GattUtils.bytesToInt(bArrDecode, i3 + 2, 2)));
                if (i2 >= length) {
                    break;
                }
                i = i2;
            }
        }
        HMLog.info(TAG, new c(arrayList));
        return arrayList;
    }

    @NotNull
    public final List<AllDayTempEntity> parseDeviceDataToAllDayTempList(@NotNull List<TemperaturePair> data, @NotNull String userId, int deviceType, int deviceSource, @NotNull String deviceId, @NotNull String deviceMac, @NotNull String deviceSn) {
        if (data.isEmpty()) {
            HMLog.info(TAG, d.a);
            return CollectionsKt__CollectionsKt.emptyList();
        }
        LongSparseArray<ArrayList<TemperaturePair>> longSparseArrayF = f(data);
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int size = longSparseArrayF.size();
        if (size > 0) {
            while (true) {
                int i2 = i + 1;
                longSparseArrayF.keyAt(i);
                AllDayTempEntity allDayTempEntityE = INSTANCE.e(longSparseArrayF.valueAt(i), userId, deviceType, deviceSource, deviceId, deviceMac, deviceSn);
                if (allDayTempEntityE != null) {
                    arrayList.add(allDayTempEntityE);
                }
                if (i2 >= size) {
                    break;
                }
                i = i2;
            }
        }
        return arrayList;
    }
}
