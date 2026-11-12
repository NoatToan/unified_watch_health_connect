package com.huami.respiratoryrate.core.repo;

import com.huami.respiratoryrate.core.RespRateConstants;
import com.huami.respiratoryrate.core.synctime.RespRateSyncTime;
import com.huami.tools.log.HMLog;
import com.huami.userproperty.UserPropertyManager;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"Lcom/huami/respiratoryrate/core/repo/SyncTimeRepoImpl;", "Lcom/huami/respiratoryrate/core/repo/ISyncTimeRepo;", "", "getSyncTime", "timeInMillis", "", "saveSyncTime", "<init>", "()V", "core_release"}, k = 1, mv = {1, 5, 1})
public final class SyncTimeRepoImpl implements ISyncTimeRepo {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "save synctime error";
        }
    }

    @Override // com.huami.respiratoryrate.core.repo.ISyncTimeRepo
    public long getSyncTime() {
        Long l = RespRateSyncTime.INSTANCE.getRespSyncTime().get();
        if (l == null) {
            return 0L;
        }
        return l.longValue();
    }

    @Override // com.huami.respiratoryrate.core.repo.ISyncTimeRepo
    public boolean saveSyncTime(long timeInMillis) {
        if (timeInMillis <= getSyncTime()) {
            HMLog.error$default(RespRateConstants.TAG, null, null, a.a, 6, null);
            return true;
        }
        RespRateSyncTime.INSTANCE.getRespSyncTime().set(Long.valueOf(timeInMillis));
        UserPropertyManager.INSTANCE.schedulePushAll();
        return true;
    }
}
