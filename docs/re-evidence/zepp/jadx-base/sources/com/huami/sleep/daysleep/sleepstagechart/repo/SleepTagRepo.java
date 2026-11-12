package com.huami.sleep.daysleep.sleepstagechart.repo;

import androidx.p008lifecycle.LiveData;
import com.huami.android.vo.ApiResponse;
import com.huami.android.vo.ApiSuccessResponse;
import com.huami.sleep.api.EventType;
import com.huami.sleep.api.SleepDataWebApi;
import com.huami.sleep.api.SubType;
import com.huami.sleep.api.converter.DataTypeConverter;
import com.huami.sleep.api.pojo.UserEventsItem;
import com.huami.sleep.api.pojo.UserEventsResponse;
import com.huami.sleep.daysleep.sleepstagechart.provider.SleepTagProvider;
import com.huami.sleep.daysleep.sleepstagechart.vo.SleepTagInfo;
import com.huami.sleep.daysleep.sleepstagechart.vo.SleepUserTagInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0019\u001a\u00020\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ/\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\"\u00020\u0005H\u0086@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ3\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ/\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00100\u0004\"\u00020\u0010H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\r0\u00142\u0006\u0010\u0013\u001a\u00020\u0002R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c"}, d2 = {"Lcom/huami/sleep/daysleep/sleepstagechart/repo/SleepTagRepo;", "", "", "uid", "", "Lcom/huami/sleep/daysleep/sleepstagechart/vo/SleepUserTagInfo;", "entry", "", "uploadTagEvent", "(Ljava/lang/String;[Lcom/huami/sleep/daysleep/sleepstagechart/vo/SleepUserTagInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "start", "end", "", "loadSleepMakeTagInfo", "(Ljava/lang/String;JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/sleep/daysleep/sleepstagechart/vo/SleepTagInfo;", "uploadSelfDefTagEvent", "(Ljava/lang/String;[Lcom/huami/sleep/daysleep/sleepstagechart/vo/SleepTagInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "userid", "Landroidx/lifecycle/LiveData;", "getAllTag", "Lcom/huami/sleep/api/SleepDataWebApi;", "a", "Lcom/huami/sleep/api/SleepDataWebApi;", "webApi", "<init>", "(Lcom/huami/sleep/api/SleepDataWebApi;)V", "sleep_release"}, k = 1, mv = {1, 5, 1})
public final class SleepTagRepo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final SleepDataWebApi webApi;

    public SleepTagRepo(@NotNull SleepDataWebApi sleepDataWebApi) {
        this.webApi = sleepDataWebApi;
    }

    @NotNull
    public final LiveData<List<SleepTagInfo>> getAllTag(@NotNull String userid) {
        return SleepTagProvider.INSTANCE.getSleepTags(userid);
    }

    @Nullable
    public final Object loadSleepMakeTagInfo(@NotNull String str, long j, long j2, @NotNull Continuation<? super List<SleepUserTagInfo>> continuation) {
        ApiResponse apiResponseFetchUserEventsData$default = SleepDataWebApi.DefaultImpls.fetchUserEventsData$default(this.webApi, str, EventType.HEALTH_TAG_RECORD.getValue(), SubType.SLEEP_SIGN.getValue(), Boxing.boxLong(j), Boxing.boxLong(j2), null, 10, null, 128, null);
        if (!(apiResponseFetchUserEventsData$default instanceof ApiSuccessResponse)) {
            return null;
        }
        List<UserEventsItem> items = ((UserEventsResponse) ((ApiSuccessResponse) apiResponseFetchUserEventsData$default).getBody()).getItems();
        DataTypeConverter dataTypeConverter = DataTypeConverter.INSTANCE;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(items, 10));
        Iterator<T> it2 = items.iterator();
        while (it2.hasNext()) {
            arrayList.add(dataTypeConverter.convertToSleepUserTagInfo((UserEventsItem) it2.next()));
        }
        return arrayList;
    }

    @Nullable
    public final Object uploadSelfDefTagEvent(@NotNull String str, @NotNull SleepTagInfo[] sleepTagInfoArr, @NotNull Continuation<? super Boolean> continuation) {
        SleepDataWebApi sleepDataWebApi = this.webApi;
        ArrayList arrayList = new ArrayList(sleepTagInfoArr.length);
        boolean z = false;
        for (SleepTagInfo sleepTagInfo : sleepTagInfoArr) {
            arrayList.add(DataTypeConverter.INSTANCE.convertToSleepSelfDefTagRequest(str, sleepTagInfo));
        }
        if (sleepDataWebApi.uploadUserEvents(str, arrayList, false) instanceof ApiSuccessResponse) {
            SleepTagProvider.INSTANCE.addTag(ArraysKt___ArraysKt.toList(sleepTagInfoArr));
            z = true;
        }
        return Boxing.boxBoolean(z);
    }

    @Nullable
    public final Object uploadTagEvent(@NotNull String str, @NotNull SleepUserTagInfo[] sleepUserTagInfoArr, @NotNull Continuation<? super Boolean> continuation) {
        SleepDataWebApi sleepDataWebApi = this.webApi;
        ArrayList arrayList = new ArrayList(sleepUserTagInfoArr.length);
        for (SleepUserTagInfo sleepUserTagInfo : sleepUserTagInfoArr) {
            arrayList.add(DataTypeConverter.INSTANCE.convertToSleepTagRequest(str, sleepUserTagInfo));
        }
        return Boxing.boxBoolean(sleepDataWebApi.uploadUserEvents(str, CollectionsKt___CollectionsKt.toList(arrayList), false) instanceof ApiSuccessResponse);
    }
}
