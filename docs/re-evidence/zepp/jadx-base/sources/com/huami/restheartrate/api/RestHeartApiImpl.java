package com.huami.restheartrate.api;

import com.app.restheartrate.service.api.RestHeartApi;
import com.app.restheartrate.service.entity.RestHeartRate;
import com.huami.account.service.AccountService;
import com.huami.account.service.AccountServiceExtKt;
import com.huami.restheartrate.entity.RestHeartEntity;
import com.huami.restheartrate.room.RestHeartDao;
import com.huami.restheartrate.utils.ExtensionUtilKt;
import com.huami.tools.log.HMLog;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\b2\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006H\u0016R\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0014\u001a\u00020\u00028\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Lcom/huami/restheartrate/api/RestHeartApiImpl;", "Lcom/app/restheartrate/service/api/RestHeartApi;", "", "date", "Lcom/app/restheartrate/service/entity/RestHeartRate;", "getHeartRateByDate", "", "list", "", "saveHeartRateData", "Lcom/huami/restheartrate/room/RestHeartDao;", "a", "Lcom/huami/restheartrate/room/RestHeartDao;", "restHeartDao", "Lcom/huami/account/service/AccountService;", "b", "Lcom/huami/account/service/AccountService;", "accountService", "c", "Ljava/lang/String;", "tag", "<init>", "(Lcom/huami/restheartrate/room/RestHeartDao;Lcom/huami/account/service/AccountService;)V", "restheartrate_release"}, k = 1, mv = {1, 5, 1})
public final class RestHeartApiImpl implements RestHeartApi {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final RestHeartDao restHeartDao;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final AccountService accountService;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final String tag = "RestHeartApiImpl";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ List<RestHeartEntity> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(List<RestHeartEntity> list) {
            super(0);
            this.a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "insert " + this.a;
        }
    }

    public RestHeartApiImpl(@NotNull RestHeartDao restHeartDao, @NotNull AccountService accountService) {
        this.restHeartDao = restHeartDao;
        this.accountService = accountService;
    }

    @Override // com.app.restheartrate.service.api.RestHeartApi
    @Nullable
    public RestHeartRate getHeartRateByDate(@NotNull String date) {
        RestHeartEntity restHeartByDate;
        String strUserId = AccountServiceExtKt.userId(this.accountService);
        if (strUserId == null || (restHeartByDate = this.restHeartDao.getRestHeartByDate(strUserId, date)) == null) {
            return null;
        }
        return new RestHeartRate(restHeartByDate.getTimestamp(), restHeartByDate.getHeartRate());
    }

    @Override // com.app.restheartrate.service.api.RestHeartApi
    public void saveHeartRateData(@Nullable List<RestHeartRate> list) {
        String strUserId;
        if (list == null || !(!list.isEmpty()) || (strUserId = AccountServiceExtKt.userId(this.accountService)) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (RestHeartRate restHeartRate : list) {
            arrayList.add(new RestHeartEntity(strUserId, ExtensionUtilKt.getDate(restHeartRate.getTime()), restHeartRate.getValue(), restHeartRate.getTime()));
        }
        List listSortedWith = CollectionsKt___CollectionsKt.sortedWith(arrayList, new Comparator() { // from class: com.huami.restheartrate.api.RestHeartApiImpl$saveHeartRateData$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt__ComparisonsKt.compareValues(Long.valueOf(((RestHeartEntity) t).getTimestamp()), Long.valueOf(((RestHeartEntity) t2).getTimestamp()));
            }
        });
        HMLog.info(this.tag, new a(listSortedWith));
        RestHeartDao restHeartDao = this.restHeartDao;
        Object[] array = listSortedWith.toArray(new RestHeartEntity[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        RestHeartEntity[] restHeartEntityArr = (RestHeartEntity[]) array;
        restHeartDao.insertRestHeart((RestHeartEntity[]) Arrays.copyOf(restHeartEntityArr, restHeartEntityArr.length));
    }
}
