package com.huami.bloodoxygen.core.usecase.osaevent;

import com.huami.bigdata.statistics.core.resource.Resource;
import com.huami.bloodoxygen.core.local.database.entity.OsaEvent;
import com.huami.bloodoxygen.core.repository.IBloodOxygenRepo;
import com.huami.bloodoxygen.core.repository.delegate.interfaces.IDataCacheDelegate;
import com.huami.bloodoxygen.core.usecase.odi.GetLocalSleepBreathScoreListUseCaseKt;
import com.huami.bloodoxygen.core.utils.BloodOxygenUtils;
import com.huami.bloodoxygen.core.utils.PackagefunctionKt;
import com.huami.bloodoxygen.service.osaevent.DifficultBreath;
import com.tekartik.sqflite.Constant;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.language.CommonLanguageSettingFragment;
import java.util.ArrayList;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Deprecated(message = "请使用GetDifficultBreathListFlowUseCase")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\r\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000fJ,\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002R\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/huami/bloodoxygen/core/usecase/osaevent/GetDifficultBreathListUseCase;", "", "", "from", "to", "splitIntervalTimeMillis", "Lcom/huami/bigdata/statistics/core/resource/Resource;", "", "Lcom/huami/bloodoxygen/service/osaevent/DifficultBreath;", Constant.METHOD_EXECUTE, "Lcom/huami/bloodoxygen/core/repository/IBloodOxygenRepo;", "a", "Lcom/huami/bloodoxygen/core/repository/IBloodOxygenRepo;", CommonLanguageSettingFragment.KEY_REPO, "<init>", "(Lcom/huami/bloodoxygen/core/repository/IBloodOxygenRepo;)V", "Companion", "core_release"}, k = 1, mv = {1, 5, 1})
public final class GetDifficultBreathListUseCase {

    @NotNull
    private static final String b = "GetDifficultBreathListUseCase";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final IBloodOxygenRepo repo;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ long a;
        public final /* synthetic */ long b;
        public final /* synthetic */ long c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j, long j2, long j3) {
            super(0);
            this.a = j;
            this.b = j2;
            this.c = j3;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "GetDifficultBreathListUseCase execute " + this.a + " " + this.b + " " + this.c;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"", "Lcom/huami/bloodoxygen/service/osaevent/DifficultBreath;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<List<? extends DifficultBreath>> {
        public final /* synthetic */ long b;
        public final /* synthetic */ long c;
        public final /* synthetic */ long d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long j, long j2, long j3) {
            super(0);
            this.b = j;
            this.c = j2;
            this.d = j3;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final List<? extends DifficultBreath> invoke() {
            List listFetchOsaEvent$default = IDataCacheDelegate.DefaultImpls.fetchOsaEvent$default(GetDifficultBreathListUseCase.this.repo, this.b, this.c, 0, false, false, false, false, 124, null);
            ArrayList arrayList = new ArrayList();
            long hourTime = this.b;
            long j = hourTime;
            while (hourTime <= this.c) {
                long jMin = Math.min(BloodOxygenUtils.INSTANCE.getHourTime(j + this.d), this.c);
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : listFetchOsaEvent$default) {
                    long timestamp = ((OsaEvent) obj).getTimestamp();
                    boolean z = false;
                    if (hourTime <= timestamp && timestamp <= jMin) {
                        z = true;
                    }
                    if (z) {
                        arrayList2.add(obj);
                    }
                }
                int size = arrayList2.size();
                if (size > 0) {
                    arrayList.add(new DifficultBreath(hourTime, jMin, size, ((OsaEvent) CollectionsKt.first(listFetchOsaEvent$default)).getVersion()));
                }
                hourTime = BloodOxygenUtils.INSTANCE.getHourTime(hourTime + this.d);
                j = jMin;
            }
            return arrayList;
        }
    }

    public GetDifficultBreathListUseCase(@NotNull IBloodOxygenRepo iBloodOxygenRepo) {
        this.repo = iBloodOxygenRepo;
    }

    public static /* synthetic */ Resource execute$default(GetDifficultBreathListUseCase getDifficultBreathListUseCase, long j, long j2, long j3, int i, Object obj) {
        if ((i & 4) != 0) {
            j3 = 3600000;
        }
        return getDifficultBreathListUseCase.execute(j, j2, j3);
    }

    @NotNull
    public final Resource<List<DifficultBreath>> execute(long from, long to, long splitIntervalTimeMillis) {
        PackagefunctionKt.bloodOxygenDebugLog$default(null, new a(from, to, splitIntervalTimeMillis), 1, null);
        return GetLocalSleepBreathScoreListUseCaseKt.mapToResourceNoSuspend(new b(from, to, splitIntervalTimeMillis));
    }
}
