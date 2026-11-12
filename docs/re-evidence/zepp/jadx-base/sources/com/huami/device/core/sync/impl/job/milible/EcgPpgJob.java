package com.huami.device.core.sync.impl.job.milible;

import com.huami.device.core.sync.api.type.JobType;
import com.xiaomi.hm.health.bt.profile.gdsp.raw.HmGdspRawData;
import kotlin.Metadata;
import kotlin.Pair;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b'\u0018\u00002\u0018\u0012\u0014\u0012\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ\u0006\u0010\u0005\u001a\u00020\u0004R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/huami/device/core/sync/impl/job/milible/EcgPpgJob;", "Lcom/huami/device/core/sync/impl/job/milible/BaseJob;", "Lkotlin/Pair;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/raw/HmGdspRawData;", "Lcom/huami/device/core/sync/api/type/JobType;", "findType", "", "tag", "Ljava/lang/String;", "<init>", "()V", "sync-center_release"}, k = 1, mv = {1, 5, 1})
@ExperimentalCoroutinesApi
public abstract class EcgPpgJob extends BaseJob<Pair<? extends HmGdspRawData, ? extends HmGdspRawData>> {

    @NotNull
    private final String tag = "SyncCenter-EcgPpgJob";

    @Override // com.huami.device.core.sync.api.type.SyncJob
    @NotNull
    public final JobType findType() {
        return JobType.INSTANCE.getECG();
    }
}
