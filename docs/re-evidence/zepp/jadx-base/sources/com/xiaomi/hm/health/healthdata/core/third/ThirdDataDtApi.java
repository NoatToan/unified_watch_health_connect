package com.xiaomi.hm.health.healthdata.core.third;

import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bodyfat.manager.WeightInfoManager;
import com.xiaomi.hm.health.databases.model.WeightInfos;
import com.xiaomi.hm.health.healthdata.core.converter.DataTypeConverter;
import com.xiaomi.hm.health.healthdata.core.entity.UserDataEntity;
import com.xiaomi.hm.health.healthdata.dto.HealthDataType;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.text.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\b\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u000e\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0004J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u000e\u001a\u00020\rH&J\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u000fR\u001e\u0010\u0014\u001a\n \u0012*\u0004\u0018\u00010\u00060\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/hm/health/healthdata/core/third/ThirdDataDtApi;", "", "Lcom/xiaomi/hm/health/databases/model/WeightInfos;", "info", "Lcom/xiaomi/hm/health/healthdata/core/entity/UserDataEntity;", "a", "", "v", "b", "entity", "", "delete", "getItemValue", "Lcom/xiaomi/hm/health/healthdata/dto/HealthDataType;", "getDefaultType", "", "infoList", "convert", "kotlin.jvm.PlatformType", "Ljava/lang/String;", "tag", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public abstract class ThirdDataDtApi {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String tag = getClass().getSimpleName();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "delete old data id is null";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ WeightInfos a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(WeightInfos weightInfos) {
            super(0);
            this.a = weightInfos;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "delete info --> " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "";
        }
    }

    private final UserDataEntity a(WeightInfos info) {
        DataTypeConverter dataTypeConverter = DataTypeConverter.INSTANCE;
        Date dateConvertToDate = dataTypeConverter.convertToDate(info.getTimestamp());
        UserDataEntity userDataEntity = new UserDataEntity(info.getId(), String.valueOf(info.getUserId()), getDefaultType(), dateConvertToDate, dateConvertToDate, b(getItemValue(info)), null, dataTypeConverter.convertDate2str(dateConvertToDate), 64, null);
        userDataEntity.setOldData(true);
        return userDataEntity;
    }

    private final String b(String v) {
        int iHashCode = v.hashCode();
        if (iHashCode != 0) {
            if (iHashCode != 3392903) {
                if (iHashCode != 995976844 || !v.equals("null,null")) {
                    return v;
                }
            } else if (!v.equals("null")) {
                return v;
            }
        } else if (!v.equals("")) {
            return v;
        }
        return null;
    }

    @NotNull
    public final List<UserDataEntity> convert(@NotNull List<? extends WeightInfos> infoList) {
        Float floatOrNull;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(infoList, 10));
        Iterator<T> it2 = infoList.iterator();
        while (it2.hasNext()) {
            arrayList.add(a((WeightInfos) it2.next()));
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it3 = arrayList.iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            Object next = it3.next();
            if (((UserDataEntity) next).getEventValue() != null) {
                arrayList2.add(next);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : arrayList2) {
            String eventValue = ((UserDataEntity) obj).getEventValue();
            if (eventValue == null || (floatOrNull = k.toFloatOrNull(eventValue)) == null || floatOrNull.floatValue() > 0.0f) {
                arrayList3.add(obj);
            }
        }
        return CollectionsKt___CollectionsKt.toList(arrayList3);
    }

    public final boolean delete(@NotNull UserDataEntity entity) {
        WeightInfos info;
        if (entity.getId() == null) {
            HMLog.debug(this.tag, a.a);
            return true;
        }
        try {
            WeightInfoManager manager = WeightInfoManager.getManager();
            Date uploadTime = entity.getUploadTime();
            if (uploadTime == null || (info = manager.getInfo(uploadTime.getTime())) == null) {
                return true;
            }
            HMLog.debug(this.tag, new b(info));
            manager.deleteInfo(info);
            return true;
        } catch (Exception e) {
            HMLog.error$default(this.tag, null, e, c.a, 2, null);
            return false;
        }
    }

    @NotNull
    public abstract HealthDataType getDefaultType();

    @NotNull
    public abstract String getItemValue(@NotNull WeightInfos info);
}
