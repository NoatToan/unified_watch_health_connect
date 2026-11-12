package com.huami.bloodoxygen.core.usecase.odi;

import com.huami.bigdata.statistics.core.resource.Resource;
import com.huami.bloodoxygen.core.local.database.entity.Odi;
import com.huami.bloodoxygen.core.repository.IBloodOxygenRepo;
import com.huami.bloodoxygen.core.repository.delegate.interfaces.IDataCacheDelegate;
import com.huami.bloodoxygen.core.utils.ExtensionKt;
import com.huami.bloodoxygen.core.utils.PackagefunctionKt;
import com.huami.bloodoxygen.service.odi.SleepBreathScore;
import com.tekartik.sqflite.Constant;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.language.CommonLanguageSettingFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Deprecated(message = "请使用GetSleepBreathScoreListFlowUseCase")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u000f\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000eJ\"\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002R\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/huami/bloodoxygen/core/usecase/odi/GetRemoteSleepBreathScoreListUseCase;", "", "", "from", "to", "Lcom/huami/bigdata/statistics/core/resource/Resource;", "", "Lcom/huami/bloodoxygen/service/odi/SleepBreathScore;", Constant.METHOD_EXECUTE, "Lcom/huami/bloodoxygen/core/repository/IBloodOxygenRepo;", "a", "Lcom/huami/bloodoxygen/core/repository/IBloodOxygenRepo;", CommonLanguageSettingFragment.KEY_REPO, "<init>", "(Lcom/huami/bloodoxygen/core/repository/IBloodOxygenRepo;)V", "Companion", "core_release"}, k = 1, mv = {1, 5, 1})
public final class GetRemoteSleepBreathScoreListUseCase {

    @NotNull
    private static final String b = "GetRemoteSleepBreathScoreListUseCase";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final IBloodOxygenRepo repo;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ long a;
        public final /* synthetic */ long b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j, long j2) {
            super(0);
            this.a = j;
            this.b = j2;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "GetRemoteSleepBreathScoreListUseCase execute " + this.a + " " + this.b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"", "Lcom/huami/bloodoxygen/service/odi/SleepBreathScore;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<List<? extends SleepBreathScore>> {
        public final /* synthetic */ long b;
        public final /* synthetic */ long c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long j, long j2) {
            super(0);
            this.b = j;
            this.c = j2;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final List<? extends SleepBreathScore> invoke() {
            List listFetchOdi$default = IDataCacheDelegate.DefaultImpls.fetchOdi$default(GetRemoteSleepBreathScoreListUseCase.this.repo, this.b, this.c, 0, false, false, true, false, 92, null);
            GetRemoteSleepBreathScoreListUseCase getRemoteSleepBreathScoreListUseCase = GetRemoteSleepBreathScoreListUseCase.this;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listFetchOdi$default, 10));
            Iterator it2 = listFetchOdi$default.iterator();
            while (it2.hasNext()) {
                arrayList.add(ExtensionKt.getSleepBreathScore((Odi) it2.next(), getRemoteSleepBreathScoreListUseCase.repo));
            }
            return arrayList;
        }
    }

    public GetRemoteSleepBreathScoreListUseCase(@NotNull IBloodOxygenRepo iBloodOxygenRepo) {
        this.repo = iBloodOxygenRepo;
    }

    @NotNull
    public final Resource<List<SleepBreathScore>> execute(long from, long to) {
        PackagefunctionKt.bloodOxygenDebugLog$default(null, new a(from, to), 1, null);
        return GetLocalSleepBreathScoreListUseCaseKt.mapToResourceNoSuspend(new b(from, to));
    }
}
