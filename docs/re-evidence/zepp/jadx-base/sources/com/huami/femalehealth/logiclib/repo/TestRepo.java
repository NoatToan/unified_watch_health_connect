package com.huami.femalehealth.logiclib.repo;

import com.huami.android.vo.ApiResponse;
import com.huami.android.vo.ApiSuccessResponse;
import com.huami.femalehealth.logiclib.api.FemaleHealthWebApi;
import com.huami.femalehealth.logiclib.api.pojo.Items;
import com.huami.femalehealth.logiclib.api.pojo.TestData;
import com.huami.femalehealth.logiclib.db.dao.MenstruationSearchRepo;
import com.huami.femalehealth.logiclib.db.po.MenstruationRecord;
import com.huami.femalehealth.logiclib.helper.AppExecutors;
import com.huami.femalehealth.logiclib.repo.TestRepo;
import com.huami.tools.log.HMLog;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0017\u0010\u0018J\u0006\u0010\u0003\u001a\u00020\u0002J\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004J\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007R\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Lcom/huami/femalehealth/logiclib/repo/TestRepo;", "", "", "apiGet", "", "Lcom/huami/femalehealth/logiclib/db/po/MenstruationRecord;", "findAllMenstruation", "Ljava/util/Date;", "start", "end", "queryCompleteMenstruation", "Lcom/huami/femalehealth/logiclib/helper/AppExecutors;", "a", "Lcom/huami/femalehealth/logiclib/helper/AppExecutors;", "appExecutors", "Lcom/huami/femalehealth/logiclib/api/FemaleHealthWebApi;", "b", "Lcom/huami/femalehealth/logiclib/api/FemaleHealthWebApi;", "webApi", "", "c", "Ljava/lang/String;", "tag", "<init>", "(Lcom/huami/femalehealth/logiclib/helper/AppExecutors;Lcom/huami/femalehealth/logiclib/api/FemaleHealthWebApi;)V", "logiclib_release"}, k = 1, mv = {1, 5, 1})
public final class TestRepo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final AppExecutors appExecutors;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final FemaleHealthWebApi webApi;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final String tag = "TestRepo";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ Items<TestData> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Items<TestData> items) {
            super(0);
            this.a = items;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("resp=", this.a.getItems());
        }
    }

    public TestRepo(@NotNull AppExecutors appExecutors, @NotNull FemaleHealthWebApi femaleHealthWebApi) {
        this.appExecutors = appExecutors;
        this.webApi = femaleHealthWebApi;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(TestRepo testRepo) {
        ApiResponse<Items<TestData>> apiResponseLoadTestData = testRepo.webApi.loadTestData();
        if (apiResponseLoadTestData instanceof ApiSuccessResponse) {
            HMLog.debug("TestRepo", new a((Items) ((ApiSuccessResponse) apiResponseLoadTestData).getBody()));
        }
    }

    public final void apiGet() {
        this.appExecutors.getNetworkIO().execute(new Runnable() { // from class: ln7
            @Override // java.lang.Runnable
            public final void run() {
                TestRepo.b(this.a);
            }
        });
    }

    @NotNull
    public final List<MenstruationRecord> findAllMenstruation() {
        return MenstruationSearchRepo.INSTANCE.findAll();
    }

    @NotNull
    public final List<MenstruationRecord> queryCompleteMenstruation(@NotNull Date start, @NotNull Date end) {
        return MenstruationSearchRepo.INSTANCE.findByDateRangeKeepComplete(start, end);
    }
}
