package com.huami.bodymeasurements.temperature.model.converter;

import android.util.LongSparseArray;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bodymeasurements.common.ext.NumberFormatExKt;
import com.huami.bodymeasurements.common.utils.GattUtils;
import com.huami.bodymeasurements.common.utils.TimeUtils;
import com.huami.bodymeasurements.temperature.model.device.dto.AllDayTemperatureDataDo;
import com.huami.bodymeasurements.temperature.model.device.dto.TemperatureDataDo;
import com.huami.bodymeasurements.temperature.model.local.entity.AllDayTempEntity;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bodyfat.utils.ParamKey;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\r\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b,\u0010-J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J*\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002J\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002JZ\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00062\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00062\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u000fJ \u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00060\u001b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\u0006Jd\u0010\u001f\u001a\u0004\u0018\u00010\u00192\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u000fJ\u0018\u0010 \u001a\u0004\u0018\u00010\u00192\u0006\u0010\b\u001a\u00020\u00192\u0006\u0010\t\u001a\u00020\u0019J\u0014\u0010\"\u001a\u00020!2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u001c\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010#\u001a\u00020\u00022\u0006\u0010$\u001a\u00020!R\u0016\u0010'\u001a\u00020\u000f8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010&R\u0016\u0010)\u001a\u00020\u00118\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010(R\u0016\u0010*\u001a\u00020\u00118\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0004\u0010(R\u0016\u0010+\u001a\u00020\u00118\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010(¨\u0006."}, d2 = {"Lcom/huami/bodymeasurements/temperature/model/converter/AllDayTempDataService;", "", "", "time", "c", GoogleApiAvailabilityLight.a, "", "Lcom/huami/bodymeasurements/temperature/model/device/dto/TemperatureDataDo;", "oldData", "newData", "a", "data", "b", "Lcom/huami/bodymeasurements/temperature/model/device/dto/AllDayTemperatureDataDo;", "deviceData", "", "userId", "", "deviceType", "deviceSource", "deviceId", ParamKey.deviceMac, ParamKey.deviceSn, "appName", "firmVersion", "Lcom/huami/bodymeasurements/temperature/model/local/entity/AllDayTempEntity;", "parseDeviceDataToAllDayTempList", "Landroid/util/LongSparseArray;", "groupAllDayTempDataByDay", "algData", "originalRawData", "parsePiecedDataToAllDayTemp", "combineAllDayTemp", "", "encodeAllDayTempData", "dayTime", "byteArray", "decodeAllDayTempData", "Ljava/lang/String;", "TAG", LogUtil.I, "ALL_DAY_DATA_SIZE_TOTAL", "ITEM_BYTE_LENGTH", "MILLI_SECONDS_IN_MINUTE", "<init>", "()V", "temperature_release"}, k = 1, mv = {1, 5, 1})
public final class AllDayTempDataService {

    @NotNull
    public static final AllDayTempDataService INSTANCE = new AllDayTempDataService();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final String TAG = "AllDayTempDataService";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final int ALL_DAY_DATA_SIZE_TOTAL = 1440;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static final int ITEM_BYTE_LENGTH = 4;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private static final int MILLI_SECONDS_IN_MINUTE = 60000;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "is not the same day";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ AllDayTempEntity a;
        public final /* synthetic */ AllDayTempEntity b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(AllDayTempEntity allDayTempEntity, AllDayTempEntity allDayTempEntity2) {
            super(0);
            this.a = allDayTempEntity;
            this.b = allDayTempEntity2;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "combineAllDayTemp start:\noldData:" + this.a + "\nnewData:" + this.b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ AllDayTempEntity a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(AllDayTempEntity allDayTempEntity) {
            super(0);
            this.a = allDayTempEntity;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("combineAllDayTemp end:", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ List<TemperatureDataDo> a;
        public final /* synthetic */ List<TemperatureDataDo> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(List<TemperatureDataDo> list, List<TemperatureDataDo> list2) {
            super(0);
            this.a = list;
            this.b = list2;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "oldData size:" + this.a.size() + ",newData size:" + this.b.size();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public final /* synthetic */ ArrayList<TemperatureDataDo> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ArrayList<TemperatureDataDo> arrayList) {
            super(0);
            this.a = arrayList;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            ArrayList<TemperatureDataDo> arrayList = this.a;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (((TemperatureDataDo) obj).isValid()) {
                    arrayList2.add(obj);
                }
            }
            return Intrinsics.stringPlus("decodeAllDayTempData validResult size:", Integer.valueOf(arrayList2.size()));
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
            return "data is null or empty";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<String> {
        public static final g a = new g();

        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "data is null or empty";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function0<String> {
        public static final h a = new h();

        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "data is invalid all";
        }
    }

    private AllDayTempDataService() {
    }

    private final List<TemperatureDataDo> a(List<TemperatureDataDo> oldData, List<TemperatureDataDo> newData) {
        ArrayList<TemperatureDataDo> arrayList = new ArrayList();
        for (Object obj : oldData) {
            if (((TemperatureDataDo) obj).isValid()) {
                arrayList.add(obj);
            }
        }
        ArrayList<TemperatureDataDo> arrayList2 = new ArrayList();
        for (Object obj2 : newData) {
            if (((TemperatureDataDo) obj2).isValid()) {
                arrayList2.add(obj2);
            }
        }
        HMLog.info(TAG, new d(arrayList, arrayList2));
        LongSparseArray longSparseArray = new LongSparseArray();
        for (TemperatureDataDo temperatureDataDo : arrayList) {
            longSparseArray.put(temperatureDataDo.getTimestamp(), temperatureDataDo);
        }
        for (TemperatureDataDo temperatureDataDo2 : arrayList2) {
            longSparseArray.put(temperatureDataDo2.getTimestamp(), temperatureDataDo2);
        }
        ArrayList arrayList3 = new ArrayList(longSparseArray.size());
        int size = longSparseArray.size();
        for (int i = 0; i < size; i++) {
            longSparseArray.keyAt(i);
            arrayList3.add((TemperatureDataDo) longSparseArray.valueAt(i));
        }
        return arrayList3;
    }

    private final List<TemperatureDataDo> b(List<TemperatureDataDo> data) {
        ArrayList arrayList = new ArrayList();
        if (data == null || data.isEmpty()) {
            return arrayList;
        }
        LongSparseArray longSparseArray = new LongSparseArray(1440);
        long jD = d(((TemperatureDataDo) CollectionsKt.first((List) data)).getTimestamp());
        int i = 0;
        while (true) {
            int i2 = i + 1;
            long j = ((long) (i * 60000)) + jD;
            longSparseArray.put(j, new TemperatureDataDo(TimeUtils.INSTANCE.getTimeExactToMinute(j), (short) 0, (short) 0, 6, null));
            if (i2 >= 1440) {
                break;
            }
            i = i2;
        }
        for (TemperatureDataDo temperatureDataDo : data) {
            longSparseArray.put(TimeUtils.INSTANCE.getTimeExactToMinute(temperatureDataDo.getTimestamp()), temperatureDataDo);
        }
        int size = longSparseArray.size();
        for (int i3 = 0; i3 < size; i3++) {
            longSparseArray.keyAt(i3);
            arrayList.add((TemperatureDataDo) longSparseArray.valueAt(i3));
        }
        if (arrayList.size() > 1) {
            kotlin.collections.g.sortWith(arrayList, new Comparator() { // from class: com.huami.bodymeasurements.temperature.model.converter.AllDayTempDataService$completeAllDayTempData$lambda-23$$inlined$sortBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt__ComparisonsKt.compareValues(Long.valueOf(((TemperatureDataDo) t).getTimestamp()), Long.valueOf(((TemperatureDataDo) t2).getTimestamp()));
                }
            });
        }
        return arrayList;
    }

    private final long c(long time) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(time);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }

    private final long d(long time) {
        return TimeUtils.INSTANCE.getTimeRangeByDateMode(time, "day").getFirst().longValue();
    }

    @Nullable
    public final AllDayTempEntity combineAllDayTemp(@NotNull AllDayTempEntity oldData, @NotNull AllDayTempEntity newData) {
        if (oldData.getTimestamp() != newData.getTimestamp()) {
            HMLog.info(TAG, a.a);
            return null;
        }
        HMLog.info(TAG, new b(oldData, newData));
        long timestamp = oldData.getTimestamp();
        Base64Utils base64Utils = Base64Utils.INSTANCE;
        AllDayTempEntity piecedDataToAllDayTemp = parsePiecedDataToAllDayTemp(a(decodeAllDayTempData(timestamp, base64Utils.decode(oldData.getData())), decodeAllDayTempData(newData.getTimestamp(), base64Utils.decode(newData.getData()))), a(decodeAllDayTempData(oldData.getTimestamp(), base64Utils.decode(oldData.getOriginalRawData())), decodeAllDayTempData(newData.getTimestamp(), base64Utils.decode(newData.getOriginalRawData()))), oldData.getUserId(), oldData.getDeviceType(), oldData.getDeviceSource(), oldData.getDeviceId(), oldData.getDeviceMac(), oldData.getDeviceSn(), oldData.getAppName(), oldData.getFirmVersion());
        if (piecedDataToAllDayTemp == null) {
            return null;
        }
        HMLog.info(TAG, new c(piecedDataToAllDayTemp));
        return piecedDataToAllDayTemp;
    }

    @NotNull
    public final List<TemperatureDataDo> decodeAllDayTempData(long dayTime, @NotNull byte[] byteArray) {
        int length = byteArray.length / 4;
        ArrayList arrayList = new ArrayList();
        long jD = d(dayTime);
        if (length > 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                long j = ((long) (60000 * i)) + jD;
                int i3 = i * 4;
                arrayList.add(new TemperatureDataDo(TimeUtils.INSTANCE.getTimeExactToMinute(j), (short) GattUtils.bytesToInt(byteArray, i3, 2), (short) GattUtils.bytesToInt(byteArray, i3 + 2, 2)));
                if (i2 >= length) {
                    break;
                }
                i = i2;
            }
        }
        HMLog.info(TAG, new e(arrayList));
        return arrayList;
    }

    @NotNull
    public final byte[] encodeAllDayTempData(@NotNull List<TemperatureDataDo> data) {
        List<TemperatureDataDo> listB = b(data);
        byte[] bArr = new byte[listB.size() * 4];
        int i = 0;
        for (Object obj : listB) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            TemperatureDataDo temperatureDataDo = (TemperatureDataDo) obj;
            int i3 = i * 4;
            byte[] bArrShortToBytes = GattUtils.shortToBytes(temperatureDataDo.getEnvTemp());
            bArr[i3] = ArraysKt___ArraysKt.first(bArrShortToBytes);
            bArr[i3 + 1] = ArraysKt___ArraysKt.last(bArrShortToBytes);
            byte[] bArrShortToBytes2 = GattUtils.shortToBytes(temperatureDataDo.getBodyTemp());
            bArr[i3 + 2] = ArraysKt___ArraysKt.first(bArrShortToBytes2);
            bArr[i3 + 3] = ArraysKt___ArraysKt.last(bArrShortToBytes2);
            i = i2;
        }
        return bArr;
    }

    @NotNull
    public final LongSparseArray<List<AllDayTemperatureDataDo>> groupAllDayTempDataByDay(@NotNull List<AllDayTemperatureDataDo> data) {
        LongSparseArray<List<AllDayTemperatureDataDo>> longSparseArray = new LongSparseArray<>();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : data) {
            String dayStr = ((AllDayTemperatureDataDo) obj).getDayStr();
            Object arrayList = linkedHashMap.get(dayStr);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(dayStr, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        Iterator it2 = linkedHashMap.entrySet().iterator();
        while (it2.hasNext()) {
            List<AllDayTemperatureDataDo> list = (List) ((Map.Entry) it2.next()).getValue();
            longSparseArray.put(INSTANCE.c(((AllDayTemperatureDataDo) CollectionsKt.first((List) list)).getTimestamp()), list);
        }
        return longSparseArray;
    }

    @NotNull
    public final List<AllDayTempEntity> parseDeviceDataToAllDayTempList(@NotNull List<AllDayTemperatureDataDo> deviceData, @NotNull String userId, int deviceType, int deviceSource, @NotNull String deviceId, @NotNull String deviceMac, @NotNull String deviceSn, @NotNull String appName, @NotNull String firmVersion) {
        ArrayList arrayList = new ArrayList();
        if (deviceData.isEmpty()) {
            HMLog.info(TAG, f.a);
            return arrayList;
        }
        LongSparseArray<List<AllDayTemperatureDataDo>> longSparseArrayGroupAllDayTempDataByDay = groupAllDayTempDataByDay(deviceData);
        int size = longSparseArrayGroupAllDayTempDataByDay.size();
        for (int i = 0; i < size; i++) {
            longSparseArrayGroupAllDayTempDataByDay.keyAt(i);
            List<AllDayTemperatureDataDo> listValueAt = longSparseArrayGroupAllDayTempDataByDay.valueAt(i);
            AllDayTempDataService allDayTempDataService = INSTANCE;
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listValueAt, 10));
            Iterator<T> it2 = listValueAt.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((AllDayTemperatureDataDo) it2.next()).getAlgTemperatureDataDo());
            }
            ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listValueAt, 10));
            Iterator<T> it3 = listValueAt.iterator();
            while (it3.hasNext()) {
                arrayList3.add(((AllDayTemperatureDataDo) it3.next()).getOriginalRawTemperatureDataDo());
            }
            AllDayTempEntity piecedDataToAllDayTemp = allDayTempDataService.parsePiecedDataToAllDayTemp(arrayList2, arrayList3, userId, deviceType, deviceSource, deviceId, deviceMac, deviceSn, appName, firmVersion);
            if (piecedDataToAllDayTemp != null) {
                arrayList.add(piecedDataToAllDayTemp);
            }
        }
        return arrayList;
    }

    @Nullable
    public final AllDayTempEntity parsePiecedDataToAllDayTemp(@NotNull List<TemperatureDataDo> algData, @NotNull List<TemperatureDataDo> originalRawData, @NotNull String userId, int deviceType, int deviceSource, @NotNull String deviceId, @NotNull String deviceMac, @NotNull String deviceSn, @NotNull String appName, @NotNull String firmVersion) {
        float temp;
        float f2;
        float fFloatValue;
        Object next;
        Object next2 = null;
        if (algData.isEmpty() || originalRawData.isEmpty()) {
            HMLog.info(TAG, g.a);
            return null;
        }
        long jC = c(((TemperatureDataDo) CollectionsKt.first((List) algData)).getTimestamp());
        ArrayList arrayList = new ArrayList();
        for (Object obj : algData) {
            if (((TemperatureDataDo) obj).isValidRange()) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            Iterator it2 = arrayList.iterator();
            if (it2.hasNext()) {
                next = it2.next();
                if (it2.hasNext()) {
                    float temp2 = ((TemperatureDataDo) next).getTemp();
                    do {
                        Object next3 = it2.next();
                        float temp3 = ((TemperatureDataDo) next3).getTemp();
                        if (Float.compare(temp2, temp3) < 0) {
                            next = next3;
                            temp2 = temp3;
                        }
                    } while (it2.hasNext());
                }
            } else {
                next = null;
            }
            TemperatureDataDo temperatureDataDo = (TemperatureDataDo) next;
            temp = temperatureDataDo == null ? 0.0f : temperatureDataDo.getTemp();
            Iterator it3 = arrayList.iterator();
            if (it3.hasNext()) {
                next2 = it3.next();
                if (it3.hasNext()) {
                    float temp4 = ((TemperatureDataDo) next2).getTemp();
                    do {
                        Object next4 = it3.next();
                        float temp5 = ((TemperatureDataDo) next4).getTemp();
                        if (Float.compare(temp4, temp5) > 0) {
                            next2 = next4;
                            temp4 = temp5;
                        }
                    } while (it3.hasNext());
                }
            }
            TemperatureDataDo temperatureDataDo2 = (TemperatureDataDo) next2;
            float temp6 = temperatureDataDo2 == null ? 0.0f : temperatureDataDo2.getTemp();
            double temp7 = 0.0d;
            Iterator it4 = arrayList.iterator();
            while (it4.hasNext()) {
                temp7 += (double) ((TemperatureDataDo) it4.next()).getTemp();
            }
            Float withDecimalFloat = NumberFormatExKt.formatWithDecimalFloat(Float.valueOf((float) (temp7 / ((double) arrayList.size()))), 1);
            fFloatValue = withDecimalFloat == null ? 0.0f : withDecimalFloat.floatValue();
            f2 = temp6;
        } else {
            HMLog.info(TAG, h.a);
            temp = 0.0f;
            f2 = 0.0f;
            fFloatValue = 0.0f;
        }
        Base64Utils base64Utils = Base64Utils.INSTANCE;
        return new AllDayTempEntity(jC, temp, f2, fFloatValue, base64Utils.encodeToString(encodeAllDayTempData(algData)), base64Utils.encodeToString(encodeAllDayTempData(originalRawData)), userId, deviceSource, deviceId, deviceMac, deviceSn, deviceType, appName, firmVersion, "Android");
    }
}
