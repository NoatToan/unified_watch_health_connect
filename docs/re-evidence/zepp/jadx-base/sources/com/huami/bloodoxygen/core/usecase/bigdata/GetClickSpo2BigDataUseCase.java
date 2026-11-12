package com.huami.bloodoxygen.core.usecase.bigdata;

import com.huami.bigdata.statistics.bloodoxygen.BloodOxygenBigDataUseCase;
import com.huami.bigdata.statistics.common.CommonSingleData;
import com.huami.bigdata.statistics.core.api.IBigDataExportedApi;
import com.huami.bloodoxygen.core.local.database.entity.ClickMeasuredSpo2;
import com.huami.bloodoxygen.core.local.kvkit.KvKey;
import com.huami.bloodoxygen.core.repository.IBloodOxygenRepo;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.language.CommonLanguageSettingFragment;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B#\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0013\u0010\u0014J)\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0094@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"Lcom/huami/bloodoxygen/core/usecase/bigdata/GetClickSpo2BigDataUseCase;", "Lcom/huami/bigdata/statistics/bloodoxygen/BloodOxygenBigDataUseCase;", "", "from", "to", "", "Lcom/huami/bigdata/statistics/common/CommonSingleData;", "getLocalDataList", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/bloodoxygen/core/repository/IBloodOxygenRepo;", "f", "Lcom/huami/bloodoxygen/core/repository/IBloodOxygenRepo;", CommonLanguageSettingFragment.KEY_REPO, "Lcom/huami/bloodoxygen/core/local/kvkit/KvKey;", "g", "Lcom/huami/bloodoxygen/core/local/kvkit/KvKey;", "kvKey", "Lcom/huami/bigdata/statistics/core/api/IBigDataExportedApi;", "iBigDataExportedApi", "<init>", "(Lcom/huami/bloodoxygen/core/repository/IBloodOxygenRepo;Lcom/huami/bigdata/statistics/core/api/IBigDataExportedApi;Lcom/huami/bloodoxygen/core/local/kvkit/KvKey;)V", "Companion", "core_release"}, k = 1, mv = {1, 5, 1})
public final class GetClickSpo2BigDataUseCase extends BloodOxygenBigDataUseCase {

    @NotNull
    private static final String h = "GetClickSpo2BigDataUseCase";

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final IBloodOxygenRepo repo;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    private final KvKey kvKey;

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
            return "GetClickSpo2BigDataUseCase getLocalDataList " + this.a + " " + this.b;
        }
    }

    public /* synthetic */ GetClickSpo2BigDataUseCase(IBloodOxygenRepo iBloodOxygenRepo, IBigDataExportedApi iBigDataExportedApi, KvKey kvKey, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(iBloodOxygenRepo, iBigDataExportedApi, (i & 4) != 0 ? null : kvKey);
    }

    @Override // com.huami.bigdata.statistics.core.usecase.DefaultMapSingleDataUseCase
    @Nullable
    public Object getLocalDataList(long j, long j2, @NotNull Continuation<? super List<CommonSingleData>> continuation) {
        HMLog.info$default(null, new a(j, j2), 1, null);
        List<ClickMeasuredSpo2> localClickSpo2s = this.repo.getLocalClickSpo2s(j, j2);
        ArrayList arrayList = new ArrayList();
        for (ClickMeasuredSpo2 clickMeasuredSpo2 : localClickSpo2s) {
            Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone(clickMeasuredSpo2.getTimeZoneId()));
            calendar.setTimeInMillis(clickMeasuredSpo2.getUtcTimestamp());
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            Unit unit = Unit.INSTANCE;
            arrayList.add(new CommonSingleData(calendar.getTimeInMillis(), clickMeasuredSpo2.getTimeZoneId(), clickMeasuredSpo2.getSpo2()));
        }
        return arrayList;
    }

    public GetClickSpo2BigDataUseCase(@NotNull IBloodOxygenRepo iBloodOxygenRepo, @NotNull final IBigDataExportedApi iBigDataExportedApi, @Nullable final KvKey kvKey) {
        super(new IBigDataExportedApi() { // from class: com.huami.bloodoxygen.core.usecase.bigdata.GetClickSpo2BigDataUseCase.1
            @Override // com.huami.bigdata.statistics.core.api.IBigDataExportedApi
            @Nullable
            public <T> T getData(@NotNull String exportKey, @NotNull String date, @NotNull Class<T> clazz) {
                KvKey kvKey2 = kvKey;
                if (kvKey2 == null ? false : Intrinsics.areEqual(kvKey2.getClickSpo2AllFetched(), Boolean.TRUE)) {
                    return null;
                }
                return (T) iBigDataExportedApi.getData(exportKey, date, clazz);
            }
        });
        this.repo = iBloodOxygenRepo;
        this.kvKey = kvKey;
    }
}
