package com.xiaomi.hm.health.healthdata.core.dao;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.account.ui.areas.SelectAreaActivity;
import com.xiaomi.hm.health.healthdata.core.entity.UserDataEntity;
import com.xiaomi.hm.health.healthdata.dto.HealthDataType;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0015\u0018\u0000 #2\u00020\u0001:\u0001#B\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b!\u0010\"J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u0016\u0010\b\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006J\b\u0010\t\u001a\u0004\u0018\u00010\u0007J\u0006\u0010\n\u001a\u00020\u0004J\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007J\u0006\u0010\f\u001a\u00020\u0004J\u0016\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0007R\u0019\u0010\u0014\u001a\u00020\u000f8\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R&\u0010\u0017\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001d\u0010\u001c\u001a\u00020\u00048F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010 \u001a\u00020\u00078F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u001e\u0010\u001f¨\u0006$"}, d2 = {"Lcom/xiaomi/hm/health/healthdata/core/dao/BloodPressureDecoration;", "", "Ljava/util/Date;", "date", "", "a", "Lkotlin/Pair;", "", "getValuePair", "getLow", "getLowOrZero", "getHeight", "getHeightOrZero", "low", "height", "Lcom/xiaomi/hm/health/healthdata/core/entity/UserDataEntity;", "setLowAndHeight", "Lcom/xiaomi/hm/health/healthdata/core/entity/UserDataEntity;", "getData", "()Lcom/xiaomi/hm/health/healthdata/core/entity/UserDataEntity;", "data", "b", "Lkotlin/Pair;", "bloodPressureValue", "c", "Lkotlin/Lazy;", "getHour", "()I", "hour", GoogleApiAvailabilityLight.a, "getDateStr", "()Ljava/lang/String;", "dateStr", "<init>", "(Lcom/xiaomi/hm/health/healthdata/core/entity/UserDataEntity;)V", "Companion", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class BloodPressureDecoration {
    public static final int targetArrSize = 2;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final UserDataEntity data;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private Pair<String, String> bloodPressureValue;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy hour;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy dateStr;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            String dateStr = BloodPressureDecoration.this.getData().getDateStr();
            return dateStr == null ? "" : dateStr;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<Integer> {
        public b() {
            super(0);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final int invoke2() {
            BloodPressureDecoration bloodPressureDecoration = BloodPressureDecoration.this;
            return bloodPressureDecoration.a(bloodPressureDecoration.getData().getUploadTime());
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Integer invoke() {
            return Integer.valueOf(invoke2());
        }
    }

    public BloodPressureDecoration(@NotNull UserDataEntity userDataEntity) {
        String eventValue;
        List listSplit$default;
        this.data = userDataEntity;
        this.bloodPressureValue = new Pair<>(null, null);
        if (userDataEntity.getType() == HealthDataType.BLOOD_PRESSURE && (eventValue = userDataEntity.getEventValue()) != null && (listSplit$default = StringsKt__StringsKt.split$default((CharSequence) eventValue, new String[]{","}, false, 0, 6, (Object) null)) != null && listSplit$default.size() == 2) {
            this.bloodPressureValue = new Pair<>(CollectionsKt.first(listSplit$default), CollectionsKt.last(listSplit$default));
        }
        this.hour = LazyKt__LazyJVMKt.lazy(new b());
        this.dateStr = LazyKt__LazyJVMKt.lazy(new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int a(Date date) {
        if (date == null) {
            return 0;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.get(11);
    }

    @NotNull
    public final UserDataEntity getData() {
        return this.data;
    }

    @NotNull
    public final String getDateStr() {
        return (String) this.dateStr.getValue();
    }

    @Nullable
    public final String getHeight() {
        return this.bloodPressureValue.getSecond();
    }

    public final int getHeightOrZero() {
        Integer intOrNull;
        String height = getHeight();
        if (height == null || (intOrNull = l.toIntOrNull(height)) == null) {
            return 0;
        }
        return intOrNull.intValue();
    }

    public final int getHour() {
        return ((Number) this.hour.getValue()).intValue();
    }

    @Nullable
    public final String getLow() {
        return this.bloodPressureValue.getFirst();
    }

    public final int getLowOrZero() {
        Integer intOrNull;
        String low = getLow();
        if (low == null || (intOrNull = l.toIntOrNull(low)) == null) {
            return 0;
        }
        return intOrNull.intValue();
    }

    @NotNull
    public final Pair<String, String> getValuePair() {
        return this.bloodPressureValue;
    }

    @NotNull
    public final UserDataEntity setLowAndHeight(@NotNull String low, @NotNull String height) {
        UserDataEntity userDataEntity = this.data;
        return userDataEntity.copy((SelectAreaActivity.REQUEST_SELECT_AREA_ONLY & 1) != 0 ? userDataEntity.id : null, (SelectAreaActivity.REQUEST_SELECT_AREA_ONLY & 2) != 0 ? userDataEntity.userId : null, (SelectAreaActivity.REQUEST_SELECT_AREA_ONLY & 4) != 0 ? userDataEntity.type : null, (SelectAreaActivity.REQUEST_SELECT_AREA_ONLY & 8) != 0 ? userDataEntity.uploadTime : null, (SelectAreaActivity.REQUEST_SELECT_AREA_ONLY & 16) != 0 ? userDataEntity.lastUpdateTime : null, (SelectAreaActivity.REQUEST_SELECT_AREA_ONLY & 32) != 0 ? userDataEntity.eventValue : low + "," + height, (SelectAreaActivity.REQUEST_SELECT_AREA_ONLY & 64) != 0 ? userDataEntity.extValue : null, (SelectAreaActivity.REQUEST_SELECT_AREA_ONLY & 128) != 0 ? userDataEntity.dateStr : null);
    }
}
