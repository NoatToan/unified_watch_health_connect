package com.huami.phn.coach.usecase.impl;

import com.huami.phn.coach.usecase.PostLocalPlanDetailUseCase;
import com.huami.phn.core.model.PHNProjectRecord;
import com.huami.phn.core.source.LocalDataSource;
import com.huami.tools.log.HMLog;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.e;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\u0011\u001a\u00020\f\u0012\u0006\u0010\u0017\u001a\u00020\u0012¢\u0006\u0004\b\u001c\u0010\u001dJ \u0010\u0005\u001a\u00020\u00012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H\u0084\bø\u0001\u0000R\u001c\u0010\u000b\u001a\u00020\u00068\u0004@\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0011\u001a\u00020\f8\u0004@\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0017\u001a\u00020\u00128\u0004@\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001b\u001a\u00020\u00188$@$X¤\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001e"}, d2 = {"Lcom/huami/phn/coach/usecase/impl/UpdateLocalPlan;", "", "Lkotlin/Function1;", "Lcom/huami/phn/core/model/PHNProjectRecord;", "update", "updateLocal", "", "a", "J", "getId", "()J", "id", "Lcom/huami/phn/core/source/LocalDataSource;", "b", "Lcom/huami/phn/core/source/LocalDataSource;", "getLocal", "()Lcom/huami/phn/core/source/LocalDataSource;", "local", "Lcom/huami/phn/coach/usecase/PostLocalPlanDetailUseCase;", "c", "Lcom/huami/phn/coach/usecase/PostLocalPlanDetailUseCase;", "getPostPlan", "()Lcom/huami/phn/coach/usecase/PostLocalPlanDetailUseCase;", "postPlan", "", "getTag", "()Ljava/lang/String;", "tag", "<init>", "(JLcom/huami/phn/core/source/LocalDataSource;Lcom/huami/phn/coach/usecase/PostLocalPlanDetailUseCase;)V", "phn_coach_release"}, k = 1, mv = {1, 5, 1})
public abstract class UpdateLocalPlan {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final long id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final LocalDataSource local;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final PostLocalPlanDetailUseCase postPlan;

    /* JADX INFO: renamed from: com.huami.phn.coach.usecase.impl.UpdateLocalPlan$updateLocal$2, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class AnonymousClass2 extends Lambda implements Function0<String> {
        public AnonymousClass2() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "No local phn(" + UpdateLocalPlan.this.getId() + ") to update!";
        }
    }

    public UpdateLocalPlan(long j, @NotNull LocalDataSource localDataSource, @NotNull PostLocalPlanDetailUseCase postLocalPlanDetailUseCase) {
        this.id = j;
        this.local = localDataSource;
        this.postPlan = postLocalPlanDetailUseCase;
    }

    public final long getId() {
        return this.id;
    }

    @NotNull
    public final LocalDataSource getLocal() {
        return this.local;
    }

    @NotNull
    public final PostLocalPlanDetailUseCase getPostPlan() {
        return this.postPlan;
    }

    @NotNull
    public abstract String getTag();

    @NotNull
    public final Object updateLocal(@NotNull Function1<? super PHNProjectRecord, PHNProjectRecord> update) {
        PHNProjectRecord pHNProjectRecordQueryProject = this.local.queryProject(this.id);
        if (pHNProjectRecordQueryProject == null) {
            pHNProjectRecordQueryProject = null;
        } else {
            HMLog.info(getTag(), new UpdateLocalPlan$updateLocal$1$1$1(this, this.local.saveOrUpdateProject(e.listOf(update.invoke(pHNProjectRecordQueryProject)))));
            this.postPlan.exec();
        }
        if (pHNProjectRecordQueryProject != null) {
            return pHNProjectRecordQueryProject;
        }
        HMLog.warn$default(getTag(), null, new AnonymousClass2(), 2, null);
        return Unit.INSTANCE;
    }
}
