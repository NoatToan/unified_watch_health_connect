package com.huami.respiratoryrate.core.repo;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.respiratoryrate.core.data.local.dao.RespRateDao;
import com.huami.respiratoryrate.core.data.local.entity.RespRateEntity;
import com.huami.respiratoryrate.core.data.remote.IRespRateWebApi;
import com.huami.respiratoryrate.core.data.remote.entity.RespRateEventItem;
import com.huami.respiratoryrate.core.transform.IWebTransform;
import java.util.List;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0017\u001a\u00020\u0014\u0012\u0006\u0010\u001b\u001a\u00020\u0018\u0012\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c\u0012\u0006\u0010$\u001a\u00020!¢\u0006\u0004\b%\u0010&J$\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u001e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u0010\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0005H\u0016J\u0016\u0010\u000e\u001a\u00020\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\u001e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0016\u0010\u0013\u001a\u00020\u00122\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001c\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010$\u001a\u00020!8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006'"}, d2 = {"Lcom/huami/respiratoryrate/core/repo/RespRateRepoImpl;", "Lcom/huami/respiratoryrate/core/repo/IRespRateRepo;", "", "from", "to", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/huami/respiratoryrate/core/data/local/entity/RespRateEntity;", "getRespRateListFlow", "getRespRateList", "getUnSyncList", "getLatestRespRate", "data", "", "addList", "", "clear", "loadRespRateList", "", "postRespRateData", "Lcom/huami/respiratoryrate/core/data/local/dao/RespRateDao;", "a", "Lcom/huami/respiratoryrate/core/data/local/dao/RespRateDao;", "dao", "Lcom/huami/respiratoryrate/core/data/remote/IRespRateWebApi;", "b", "Lcom/huami/respiratoryrate/core/data/remote/IRespRateWebApi;", "api", "Lcom/huami/respiratoryrate/core/transform/IWebTransform;", "Lcom/huami/respiratoryrate/core/data/remote/entity/RespRateEventItem;", "c", "Lcom/huami/respiratoryrate/core/transform/IWebTransform;", "transform", "", GoogleApiAvailabilityLight.a, "Ljava/lang/String;", "userId", "<init>", "(Lcom/huami/respiratoryrate/core/data/local/dao/RespRateDao;Lcom/huami/respiratoryrate/core/data/remote/IRespRateWebApi;Lcom/huami/respiratoryrate/core/transform/IWebTransform;Ljava/lang/String;)V", "core_release"}, k = 1, mv = {1, 5, 1})
public final class RespRateRepoImpl implements IRespRateRepo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final RespRateDao dao;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final IRespRateWebApi api;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final IWebTransform<RespRateEventItem> transform;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final String userId;

    public RespRateRepoImpl(@NotNull RespRateDao respRateDao, @NotNull IRespRateWebApi iRespRateWebApi, @NotNull IWebTransform<RespRateEventItem> iWebTransform, @NotNull String str) {
        this.dao = respRateDao;
        this.api = iRespRateWebApi;
        this.transform = iWebTransform;
        this.userId = str;
    }

    @Override // com.huami.respiratoryrate.core.repo.IRespRateRepo
    @NotNull
    public long[] addList(@NotNull List<RespRateEntity> data) {
        return this.dao.insertOrReplace(data);
    }

    @Override // com.huami.respiratoryrate.core.repo.IRespRateRepo
    public void clear() {
        this.dao.clear(this.userId);
    }

    @Override // com.huami.respiratoryrate.core.repo.IRespRateRepo
    @NotNull
    public Flow<RespRateEntity> getLatestRespRate() {
        return this.dao.getLatestFlow(this.userId);
    }

    @Override // com.huami.respiratoryrate.core.repo.IRespRateRepo
    @NotNull
    public List<RespRateEntity> getRespRateList(long from, long to) {
        return this.dao.getRangeList(this.userId, from, to);
    }

    @Override // com.huami.respiratoryrate.core.repo.IRespRateRepo
    @NotNull
    public Flow<List<RespRateEntity>> getRespRateListFlow(long from, long to) {
        return this.dao.getRangeListFlow(this.userId, from, to);
    }

    @Override // com.huami.respiratoryrate.core.repo.IRespRateRepo
    @NotNull
    public List<RespRateEntity> getUnSyncList() {
        return this.dao.getUnSyncList(this.userId);
    }

    @Override // com.huami.respiratoryrate.core.repo.IRespRateRepo
    @NotNull
    public List<RespRateEntity> loadRespRateList(long from, long to) {
        return this.transform.fromWebEntity(this.api.getEventList(from, to), this.userId);
    }

    @Override // com.huami.respiratoryrate.core.repo.IRespRateRepo
    public boolean postRespRateData(@NotNull List<RespRateEntity> data) {
        return this.api.postEventList(this.transform.toWebEntity(data));
    }
}
