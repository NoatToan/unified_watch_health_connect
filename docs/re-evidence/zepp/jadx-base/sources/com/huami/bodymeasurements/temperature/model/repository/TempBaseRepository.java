package com.huami.bodymeasurements.temperature.model.repository;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.bodymeasurements.temperature.model.koin.ScopesKt;
import com.huami.bodymeasurements.temperature.model.koin.api.TempExternalApi;
import com.huami.bodymeasurements.temperature.view.vo.TemperatureVo;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\bf\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016J\b\u0010\u0003\u001a\u00020\u0002H\u0016J1\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u000e\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0007\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\rJ\u0010\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u000fH&J\u001b\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\rJ\u001b\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\rJ\u0013\u0010\u0014\u001a\u00020\u0011H¦@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"Lcom/huami/bodymeasurements/temperature/model/repository/TempBaseRepository;", "Lorg/koin/core/component/KoinComponent;", "", "getAppName", "", "start", "end", "userId", "", "Lcom/huami/bodymeasurements/temperature/view/vo/TemperatureVo;", "getLocalTempBetweenTime", "(JJLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllLocalTemp", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getLatestTemp", "Lkotlinx/coroutines/flow/Flow;", "getLatestTempFlow", "", "fetchTempFromServer", "uploadUnSyncTempToServer", "cleanLocalTemp", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "temperature_release"}, k = 1, mv = {1, 5, 1})
public interface TempBaseRepository extends KoinComponent {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.a;
    public static final int DATA_LOAD_SIZE = 1000;
    public static final int DATA_UPLOAD_LIMIT = 600;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/huami/bodymeasurements/temperature/model/repository/TempBaseRepository$Companion;", "", "", "DATA_LOAD_SIZE", LogUtil.I, "DATA_UPLOAD_LIMIT", "<init>", "()V", "temperature_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public static final int DATA_LOAD_SIZE = 1000;
        public static final int DATA_UPLOAD_LIMIT = 600;
        public static final /* synthetic */ Companion a = new Companion();

        private Companion() {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        @NotNull
        public static String getAppName(@NotNull TempBaseRepository tempBaseRepository) {
            String appName;
            TempExternalApi tempExternalApi = ScopesKt.tempExternalApi(tempBaseRepository.getKoin());
            return (tempExternalApi == null || (appName = tempExternalApi.getAppName()) == null) ? "" : appName;
        }

        @NotNull
        public static Koin getKoin(@NotNull TempBaseRepository tempBaseRepository) {
            return KoinComponent.DefaultImpls.getKoin(tempBaseRepository);
        }
    }

    @Nullable
    Object cleanLocalTemp(@NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object fetchTempFromServer(@NotNull String str, @NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object getAllLocalTemp(@NotNull String str, @NotNull Continuation<? super List<TemperatureVo>> continuation);

    @NotNull
    String getAppName();

    @Nullable
    Object getLatestTemp(@NotNull String str, @NotNull Continuation<? super TemperatureVo> continuation);

    @NotNull
    Flow<TemperatureVo> getLatestTempFlow();

    @Nullable
    Object getLocalTempBetweenTime(long j, long j2, @NotNull String str, @NotNull Continuation<? super List<TemperatureVo>> continuation);

    @Nullable
    Object uploadUnSyncTempToServer(@NotNull String str, @NotNull Continuation<? super Unit> continuation);
}
