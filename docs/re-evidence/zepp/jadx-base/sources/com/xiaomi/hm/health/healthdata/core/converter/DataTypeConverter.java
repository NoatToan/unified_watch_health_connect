package com.xiaomi.hm.health.healthdata.core.converter;

import androidx.exifinterface.media.ExifInterface;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.healthdata.api.pojo.HealthDataItem;
import com.xiaomi.hm.health.healthdata.api.request.UploadHealthDataRequest;
import com.xiaomi.hm.health.healthdata.core.dto.DataItemDto;
import com.xiaomi.hm.health.healthdata.core.entity.UserDataEntity;
import com.xiaomi.hm.health.healthdata.dto.HealthDataType;
import com.xiaomi.hm.health.healthdata.dto.TemperatureDataType;
import com.xiaomi.hm.health.healthdata.utils.HealthDataTimeUtils;
import com.xiaomi.hm.health.temperature.model.Temperature;
import com.xiaomi.hm.health.utils.SerialzationKtxKt;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.i;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b2\u00103J1\u0010\u0007\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0002*\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\n\u001a\u00020\u0005\"\b\b\u0000\u0010\u0002*\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\t\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fJ\u000e\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u000fJ\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\f2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\fJ\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u00052\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017J\u0017\u0010\u001c\u001a\u00020\u00052\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u00172\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001e\u0010\u001fJ=\u0010$\u001a\b\u0012\u0004\u0012\u00020\u000f0\f2\b\b\u0002\u0010!\u001a\u00020 2\u001e\u0010#\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\u000f0\f0\"\"\b\u0012\u0004\u0012\u00020\u000f0\f¢\u0006\u0004\b$\u0010%R\u0016\u0010(\u001a\u00020&8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010'R\u0016\u0010+\u001a\u00020)8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010*R\u0016\u0010-\u001a\u00020)8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b,\u0010*R\u001e\u00101\u001a\n .*\u0004\u0018\u00010\u00050\u00058\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100¨\u00064"}, d2 = {"Lcom/xiaomi/hm/health/healthdata/core/converter/DataTypeConverter;", "", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/serialization/KSerializer;", "kSerializer", "", "jsonString", "a", "(Lkotlinx/serialization/KSerializer;Ljava/lang/String;)Ljava/lang/Object;", "t", "b", "(Lkotlinx/serialization/KSerializer;Ljava/lang/Object;)Ljava/lang/String;", "", "Lcom/xiaomi/hm/health/healthdata/api/pojo/HealthDataItem;", "data", "Lcom/xiaomi/hm/health/healthdata/core/entity/UserDataEntity;", "convert", "Lcom/xiaomi/hm/health/healthdata/api/request/UploadHealthDataRequest;", "convert2Request", "Lcom/xiaomi/hm/health/temperature/model/Temperature;", "dataList", "Lcom/xiaomi/hm/health/healthdata/core/dto/DataItemDto;", "convertTempToDataItemList", "Ljava/util/Date;", "date", "convertDate2str", "", "timestamp", "convertTime2str", "(Ljava/lang/Long;)Ljava/lang/String;", "convertToDate", "(Ljava/lang/Long;)Ljava/util/Date;", "", "reverse", "", "lists", "concatTwoListAndSort", "(Z[Ljava/util/List;)Ljava/util/List;", "Ljava/text/SimpleDateFormat;", "Ljava/text/SimpleDateFormat;", "sdf", "", LogUtil.I, "timeMod", "c", "minLength", "kotlin.jvm.PlatformType", GoogleApiAvailabilityLight.a, "Ljava/lang/String;", "tag", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class DataTypeConverter {

    @NotNull
    public static final DataTypeConverter INSTANCE;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final SimpleDateFormat sdf;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final int timeMod = 1;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static final int minLength = 10;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private static final String tag;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TemperatureDataType.values().length];
            iArr[TemperatureDataType.ALL_DAY.ordinal()] = 1;
            iArr[TemperatureDataType.SINGLE.ordinal()] = 2;
            iArr[TemperatureDataType.MANUAL.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n"}, d2 = {"", ExifInterface.GPS_DIRECTION_TRUE, "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
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
            return "解析json失败" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n"}, d2 = {"", ExifInterface.GPS_DIRECTION_TRUE, "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ Throwable a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Throwable th) {
            super(0);
            this.a = th;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "转json失败" + this.a;
        }
    }

    static {
        DataTypeConverter dataTypeConverter = new DataTypeConverter();
        INSTANCE = dataTypeConverter;
        sdf = new SimpleDateFormat("yyyy-MM-dd", Locale.CHINA);
        tag = dataTypeConverter.getClass().getSimpleName();
    }

    private DataTypeConverter() {
    }

    private final <T> T a(KSerializer<T> kSerializer, String jsonString) {
        try {
            return (T) SerialzationKtxKt.getNonStrictInstance(Json.INSTANCE).decodeFromString(kSerializer, jsonString);
        } catch (Throwable th) {
            HMLog.warn$default(tag, null, new a(th), 2, null);
            return null;
        }
    }

    private final <T> String b(KSerializer<T> kSerializer, T t) {
        try {
            return SerialzationKtxKt.getNonStrictInstance(Json.INSTANCE).encodeToString(kSerializer, t);
        } catch (Throwable th) {
            HMLog.warn$default(tag, null, new b(th), 2, null);
            return "";
        }
    }

    public static /* synthetic */ List concatTwoListAndSort$default(DataTypeConverter dataTypeConverter, boolean z, List[] listArr, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return dataTypeConverter.concatTwoListAndSort(z, listArr);
    }

    @NotNull
    public final List<UserDataEntity> concatTwoListAndSort(boolean reverse, @NotNull List<UserDataEntity>... lists) {
        ArrayList arrayList = new ArrayList();
        int length = lists.length;
        int i = 0;
        while (i < length) {
            List<UserDataEntity> list = lists[i];
            i++;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : list) {
                if (!(((UserDataEntity) obj).getEventValue() == null)) {
                    arrayList2.add(obj);
                }
            }
            arrayList.addAll(arrayList2);
        }
        List<UserDataEntity> listSortedWith = CollectionsKt___CollectionsKt.sortedWith(arrayList, new Comparator() { // from class: com.xiaomi.hm.health.healthdata.core.converter.DataTypeConverter$concatTwoListAndSort$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                Date uploadTime = ((UserDataEntity) t).getUploadTime();
                Long lValueOf = uploadTime == null ? null : Long.valueOf(uploadTime.getTime());
                Date uploadTime2 = ((UserDataEntity) t2).getUploadTime();
                return ComparisonsKt__ComparisonsKt.compareValues(lValueOf, uploadTime2 != null ? Long.valueOf(uploadTime2.getTime()) : null);
            }
        });
        return reverse ? i.asReversed(listSortedWith) : listSortedWith;
    }

    @NotNull
    public final List<UserDataEntity> convert(@NotNull List<HealthDataItem> data) {
        ArrayList arrayList = new ArrayList();
        for (HealthDataItem healthDataItem : data) {
            if (healthDataItem.getValue() != null && (!Intrinsics.areEqual(healthDataItem.getSubType(), HealthDataType.BLOOD_PRESSURE.getType()) || StringsKt__StringsKt.contains$default((CharSequence) healthDataItem.getValue(), (CharSequence) ",", false, 2, (Object) null))) {
                Calendar calendar = Calendar.getInstance(Locale.getDefault());
                calendar.setTimeInMillis(healthDataItem.getUploadTime());
                Date time = calendar.getTime();
                arrayList.add(new UserDataEntity(null, healthDataItem.getUserId(), HealthDataType.INSTANCE.find(healthDataItem.getSubType()), time, null, healthDataItem.getValue(), null, INSTANCE.convertDate2str(time), 80, null));
            }
        }
        return arrayList;
    }

    @NotNull
    public final UploadHealthDataRequest convert2Request(@NotNull UserDataEntity data) {
        String type;
        Date lastUpdateTime = data.getLastUpdateTime();
        Long lValueOf = lastUpdateTime == null ? null : Long.valueOf(lastUpdateTime.getTime());
        long timeInMillis = lValueOf == null ? Calendar.getInstance().getTimeInMillis() : lValueOf.longValue();
        Date uploadTime = data.getUploadTime();
        Long lValueOf2 = uploadTime != null ? Long.valueOf(uploadTime.getTime()) : null;
        long timeInMillis2 = lValueOf2 == null ? Calendar.getInstance().getTimeInMillis() : lValueOf2.longValue();
        HealthDataType type2 = data.getType();
        String str = (type2 == null || (type = type2.getType()) == null) ? "" : type;
        String userId = data.getUserId();
        String eventValue = data.getEventValue();
        UploadHealthDataRequest uploadHealthDataRequest = new UploadHealthDataRequest((String) null, timeInMillis, str, timeInMillis2, userId, eventValue == null ? "" : eventValue, 1, (DefaultConstructorMarker) null);
        return uploadHealthDataRequest.copy((53 & 1) != 0 ? uploadHealthDataRequest.eventType : null, (53 & 2) != 0 ? uploadHealthDataRequest.lastUpdateTime : uploadHealthDataRequest.getLastUpdateTime() / 1, (53 & 4) != 0 ? uploadHealthDataRequest.subType : null, (53 & 8) != 0 ? uploadHealthDataRequest.uploadTime : uploadHealthDataRequest.getUploadTime() / 1, (53 & 16) != 0 ? uploadHealthDataRequest.userId : null, (53 & 32) != 0 ? uploadHealthDataRequest.value : null);
    }

    @Nullable
    public final String convertDate2str(@Nullable Date date) {
        if (date == null) {
            return null;
        }
        return sdf.format(date);
    }

    @NotNull
    public final List<DataItemDto> convertTempToDataItemList(@NotNull List<Temperature> dataList) {
        ArrayList arrayList = new ArrayList();
        for (Temperature temperature : dataList) {
            int i = WhenMappings.$EnumSwitchMapping$0[temperature.getType().ordinal()];
            if (i == 1) {
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(temperature.getTimestamp());
                Unit unit = Unit.INSTANCE;
                arrayList.add(new DataItemDto("", calendar.getTime(), String.valueOf(temperature.getTemp()), TemperatureDataType.ALL_DAY, false, HealthDataTimeUtils.INSTANCE.formatTimeYMDHHmm(temperature.getTimestamp())));
            } else if (i == 2) {
                Calendar calendar2 = Calendar.getInstance();
                calendar2.setTimeInMillis(temperature.getTimestamp());
                Unit unit2 = Unit.INSTANCE;
                arrayList.add(new DataItemDto("", calendar2.getTime(), String.valueOf(temperature.getTemp()), TemperatureDataType.SINGLE, false, HealthDataTimeUtils.INSTANCE.formatTimeYMDHHmm(temperature.getTimestamp())));
            } else if (i == 3) {
                Calendar calendar3 = Calendar.getInstance();
                calendar3.setTimeInMillis(temperature.getTimestamp());
                Unit unit3 = Unit.INSTANCE;
                arrayList.add(new DataItemDto("", calendar3.getTime(), String.valueOf(temperature.getTemp()), TemperatureDataType.MANUAL, false, HealthDataTimeUtils.INSTANCE.formatTimeYMDHHmm(temperature.getTimestamp())));
            }
        }
        return arrayList;
    }

    @NotNull
    public final String convertTime2str(@Nullable Long timestamp) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(timestamp == null ? 0L : timestamp.longValue());
        String str = sdf.format(calendar.getTime());
        return str == null ? "" : str;
    }

    @Nullable
    public final Date convertToDate(@Nullable Long timestamp) {
        if (timestamp == null) {
            return null;
        }
        long jLongValue = timestamp.longValue();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(jLongValue);
        return calendar.getTime();
    }
}
