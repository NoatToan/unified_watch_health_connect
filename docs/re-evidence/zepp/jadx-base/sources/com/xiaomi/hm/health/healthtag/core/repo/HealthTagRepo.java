package com.xiaomi.hm.health.healthtag.core.repo;

import androidx.p008lifecycle.MutableLiveData;
import com.huami.android.vo.ApiResponse;
import com.huami.android.vo.ApiSuccessResponse;
import com.xiaomi.hm.health.healthdata.api.HealthDataWebApi;
import com.xiaomi.hm.health.healthdata.api.pojo.UserEventsItem;
import com.xiaomi.hm.health.healthdata.api.pojo.UserEventsResponse;
import com.xiaomi.hm.health.healthtag.api.convert.DataTypeConvert;
import com.xiaomi.hm.health.healthtag.core.datasource.IHealthTagDataSource;
import com.xiaomi.hm.health.healthtag.core.dto.TagInfoDto;
import com.xiaomi.hm.health.healthtag.core.dto.UserMakeTagDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u001f\u001a\u00020\u001c\u0012\u0006\u0010#\u001a\u00020 ¢\u0006\u0004\b$\u0010%J*\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002J6\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nJ1\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0012\u0010\u0010\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u000f\"\u00020\b¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\bJ9\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\n2\u0012\u0010\u0019\u001a\n\u0012\u0006\b\u0001\u0012\u00020\r0\u000f\"\u00020\r¢\u0006\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001f\u001a\u00020\u001c8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010#\u001a\u00020 8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006&"}, d2 = {"Lcom/xiaomi/hm/health/healthtag/core/repo/HealthTagRepo;", "", "", "uid", "type", "subType", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/xiaomi/hm/health/healthtag/core/dto/TagInfoDto;", "loadAllTagData", "", "start", "end", "Lcom/xiaomi/hm/health/healthtag/core/dto/UserMakeTagDto;", "loadUserMakeTagByDate", "", "entry", "", "uploadTagEvent", "(Ljava/lang/String;Ljava/lang/String;[Lcom/xiaomi/hm/health/healthtag/core/dto/TagInfoDto;)Z", "tagInfo", "", "addTagInfo", "eventType", "timeStamp", "info", "uploadMakeTagEvent", "(Ljava/lang/String;Ljava/lang/String;J[Lcom/xiaomi/hm/health/healthtag/core/dto/UserMakeTagDto;)Z", "Lcom/xiaomi/hm/health/healthdata/api/HealthDataWebApi;", "a", "Lcom/xiaomi/hm/health/healthdata/api/HealthDataWebApi;", "webApi", "Lcom/xiaomi/hm/health/healthtag/core/datasource/IHealthTagDataSource;", "b", "Lcom/xiaomi/hm/health/healthtag/core/datasource/IHealthTagDataSource;", "tagDataSource", "<init>", "(Lcom/xiaomi/hm/health/healthdata/api/HealthDataWebApi;Lcom/xiaomi/hm/health/healthtag/core/datasource/IHealthTagDataSource;)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class HealthTagRepo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final HealthDataWebApi webApi;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final IHealthTagDataSource tagDataSource;

    public HealthTagRepo(@NotNull HealthDataWebApi healthDataWebApi, @NotNull IHealthTagDataSource iHealthTagDataSource) {
        this.webApi = healthDataWebApi;
        this.tagDataSource = iHealthTagDataSource;
    }

    public final void addTagInfo(@Nullable TagInfoDto tagInfo) {
        if (tagInfo == null) {
            return;
        }
        IHealthTagDataSource iHealthTagDataSource = this.tagDataSource;
        ArrayList arrayList = new ArrayList();
        arrayList.add(tagInfo);
        Unit unit = Unit.INSTANCE;
        iHealthTagDataSource.addTagInfos(arrayList);
    }

    @NotNull
    public final MutableLiveData<List<TagInfoDto>> loadAllTagData(@NotNull String uid, @NotNull String type, @NotNull String subType) {
        return this.tagDataSource.loadAllTagData(uid, type, subType);
    }

    @Nullable
    public final List<UserMakeTagDto> loadUserMakeTagByDate(@NotNull String uid, @NotNull String type, @NotNull String subType, long start, long end) {
        ApiResponse apiResponseFetchUserEventsData$default = HealthDataWebApi.DefaultImpls.fetchUserEventsData$default(this.webApi, uid, type, subType, Long.valueOf(start), Long.valueOf(end), null, 10, null, 128, null);
        if (!(apiResponseFetchUserEventsData$default instanceof ApiSuccessResponse)) {
            return null;
        }
        List<UserEventsItem> items = ((UserEventsResponse) ((ApiSuccessResponse) apiResponseFetchUserEventsData$default).getBody()).getItems();
        DataTypeConvert dataTypeConvert = DataTypeConvert.INSTANCE;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(items, 10));
        Iterator<T> it2 = items.iterator();
        while (it2.hasNext()) {
            arrayList.add(dataTypeConvert.convert2UserMakeTagDto((UserEventsItem) it2.next()));
        }
        return CollectionsKt___CollectionsKt.toList(arrayList);
    }

    public final boolean uploadMakeTagEvent(@NotNull String uid, @NotNull String eventType, long timeStamp, @NotNull UserMakeTagDto... info) {
        HealthDataWebApi healthDataWebApi = this.webApi;
        ArrayList arrayList = new ArrayList(info.length);
        int length = info.length;
        int i = 0;
        while (i < length) {
            UserMakeTagDto userMakeTagDto = info[i];
            i++;
            arrayList.add(DataTypeConvert.INSTANCE.convert2Request(uid, eventType, timeStamp, userMakeTagDto));
        }
        return healthDataWebApi.uploadUserEvents(uid, arrayList, false) instanceof ApiSuccessResponse;
    }

    public final boolean uploadTagEvent(@NotNull String uid, @NotNull String subType, @NotNull TagInfoDto... entry) {
        HealthDataWebApi healthDataWebApi = this.webApi;
        ArrayList arrayList = new ArrayList(entry.length);
        int length = entry.length;
        int i = 0;
        while (i < length) {
            TagInfoDto tagInfoDto = entry[i];
            i++;
            arrayList.add(DataTypeConvert.INSTANCE.convert2Request(uid, subType, tagInfoDto));
        }
        return healthDataWebApi.uploadUserEvents(uid, CollectionsKt___CollectionsKt.toList(arrayList), false) instanceof ApiSuccessResponse;
    }
}
