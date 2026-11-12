package com.huami.phn.coach.usecase.impl;

import com.huami.phn.coach.usecase.PostLocalDailyAnalysisUseCase;
import com.huami.phn.core.model.PHNDailyAnalysisResult;
import com.huami.phn.core.source.LocalDataSource;
import com.huami.phn.core.source.RemoteDataSource;
import com.huami.phn.core.webapi.RemoteResult;
import com.huami.tools.log.HMLog;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\u0005B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0016\u0010\u0007\u001a\u00020\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/huami/phn/coach/usecase/impl/PostLocalDailyAnalysisUseCaseImpl;", "Lcom/huami/phn/coach/usecase/PostLocalDailyAnalysisUseCase;", "", "exec", "Lcom/huami/phn/core/source/LocalDataSource;", "a", "Lcom/huami/phn/core/source/LocalDataSource;", "localDataSource", "Lcom/huami/phn/core/source/RemoteDataSource;", "b", "Lcom/huami/phn/core/source/RemoteDataSource;", "remoteDataSource", "<init>", "(Lcom/huami/phn/core/source/LocalDataSource;Lcom/huami/phn/core/source/RemoteDataSource;)V", "c", "phn_coach_release"}, k = 1, mv = {1, 5, 1})
public final class PostLocalDailyAnalysisUseCaseImpl implements PostLocalDailyAnalysisUseCase {

    @Deprecated
    @NotNull
    public static final String TAG = "PostLocalDailyAnalysisUseCaseImpl";

    @NotNull
    private static final a c = new a(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final LocalDataSource localDataSource;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final RemoteDataSource remoteDataSource;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"com/huami/phn/coach/usecase/impl/PostLocalDailyAnalysisUseCaseImpl$a", "", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "phn_coach_release"}, k = 1, mv = {1, 5, 1})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ RemoteResult<Boolean> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(RemoteResult<Boolean> remoteResult) {
            super(0);
            this.a = remoteResult;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "Post daily result success! - " + ((RemoteResult.Success) this.a).getData();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ RemoteResult<Boolean> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(RemoteResult<Boolean> remoteResult) {
            super(0);
            this.a = remoteResult;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "post daily result failed! - " + ((RemoteResult.Failed) this.a).getCode();
        }
    }

    public PostLocalDailyAnalysisUseCaseImpl(@NotNull LocalDataSource localDataSource, @NotNull RemoteDataSource remoteDataSource) {
        this.localDataSource = localDataSource;
        this.remoteDataSource = remoteDataSource;
    }

    @Override // com.huami.phn.coach.usecase.PostLocalDailyAnalysisUseCase
    public boolean exec() {
        List<PHNDailyAnalysisResult> listQueryUnSyncedDailyResult = this.localDataSource.queryUnSyncedDailyResult();
        if (listQueryUnSyncedDailyResult.isEmpty()) {
            return true;
        }
        RemoteResult<Boolean> remoteResultPushPHNDailyAnalysis = this.remoteDataSource.pushPHNDailyAnalysis(listQueryUnSyncedDailyResult);
        if (remoteResultPushPHNDailyAnalysis instanceof RemoteResult.Success) {
            HMLog.info(TAG, new b(remoteResultPushPHNDailyAnalysis));
            this.localDataSource.saveDailyResultFromWeb(listQueryUnSyncedDailyResult);
            return true;
        }
        if (!(remoteResultPushPHNDailyAnalysis instanceof RemoteResult.Failed)) {
            throw new NoWhenBranchMatchedException();
        }
        HMLog.error$default(TAG, null, null, new c(remoteResultPushPHNDailyAnalysis), 6, null);
        return false;
    }
}
