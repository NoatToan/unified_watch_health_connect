package com.huami.phn.coach.usecase;

import com.huami.phn.core.model.PHNDailyAnalysisResult;
import com.huami.phn.core.source.LocalDataSource;
import com.huami.phn.core.source.RemoteDataSource;
import com.huami.phn.core.webapi.RemoteResult;
import com.huami.tools.log.HMLog;
import com.xmlywind.sdk.common.mta.PointCategory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0017\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0014"}, d2 = {"Lcom/huami/phn/coach/usecase/GetPHNDailyAnalysisResultUseCase;", "", "", "time", "", "size", "", PointCategory.LOAD, "(Ljava/lang/Long;I)V", "Lcom/huami/phn/core/source/LocalDataSource;", "a", "Lcom/huami/phn/core/source/LocalDataSource;", "localDataSource", "Lcom/huami/phn/core/source/RemoteDataSource;", "b", "Lcom/huami/phn/core/source/RemoteDataSource;", "remote", "<init>", "(Lcom/huami/phn/core/source/LocalDataSource;Lcom/huami/phn/core/source/RemoteDataSource;)V", "Companion", "phn_coach_release"}, k = 1, mv = {1, 5, 1})
public final class GetPHNDailyAnalysisResultUseCase {

    @NotNull
    private static final String c = "GetPHNDailyAnalysisResultUseCase";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final LocalDataSource localDataSource;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final RemoteDataSource remote;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ RemoteResult<List<PHNDailyAnalysisResult>> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(RemoteResult<List<PHNDailyAnalysisResult>> remoteResult) {
            super(0);
            this.a = remoteResult;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "Fetch remote phn daily result success! - " + ((List) ((RemoteResult.Success) this.a).getData()).size();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ RemoteResult<List<PHNDailyAnalysisResult>> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(RemoteResult<List<PHNDailyAnalysisResult>> remoteResult) {
            super(0);
            this.a = remoteResult;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "Fetch remote phn daily result  failed! - " + ((RemoteResult.Failed) this.a).getCode();
        }
    }

    public GetPHNDailyAnalysisResultUseCase(@NotNull LocalDataSource localDataSource, @NotNull RemoteDataSource remoteDataSource) {
        this.localDataSource = localDataSource;
        this.remote = remoteDataSource;
    }

    public final void load(@Nullable Long time, int size) {
        RemoteResult<List<PHNDailyAnalysisResult>> pHNDailyAnalysis = this.remote.getPHNDailyAnalysis(time, size);
        if (!(pHNDailyAnalysis instanceof RemoteResult.Success)) {
            if (pHNDailyAnalysis instanceof RemoteResult.Failed) {
                HMLog.error$default(c, null, null, new b(pHNDailyAnalysis), 6, null);
            }
        } else {
            HMLog.info(c, new a(pHNDailyAnalysis));
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((Collection) ((RemoteResult.Success) pHNDailyAnalysis).getData());
            if (!arrayList.isEmpty()) {
                this.localDataSource.saveDailyResultFromWeb(CollectionsKt___CollectionsKt.toList(arrayList));
            }
        }
    }
}
