package com.huami.respiratoryrate.core.usecase;

import com.huami.respiratoryrate.core.RespRateConstants;
import com.huami.respiratoryrate.core.data.local.entity.RespRateEntity;
import com.huami.respiratoryrate.core.repo.IRespRateRepo;
import com.huami.respiratoryrate.core.utils.TimeUtils;
import com.huami.tools.log.HMLog;
import com.tekartik.sqflite.Constant;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.language.CommonLanguageSettingFragment;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\b¢\u0006\u0004\b\f\u0010\rJ\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u0007\u001a\u00020\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/huami/respiratoryrate/core/usecase/PostDataUseCase;", "", "", Constant.METHOD_EXECUTE, "Lcom/huami/respiratoryrate/core/repo/IRespRateRepo;", "a", "Lcom/huami/respiratoryrate/core/repo/IRespRateRepo;", CommonLanguageSettingFragment.KEY_REPO, "Lkotlin/Function0;", "b", "Lkotlin/jvm/functions/Function0;", "isSyncDataEnabled", "<init>", "(Lcom/huami/respiratoryrate/core/repo/IRespRateRepo;Lkotlin/jvm/functions/Function0;)V", "core_release"}, k = 1, mv = {1, 5, 1})
public final class PostDataUseCase {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final IRespRateRepo repo;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Function0<Boolean> isSyncDataEnabled;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ List<RespRateEntity> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(List<RespRateEntity> list) {
            super(0);
            this.a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("unsync data list size:", Integer.valueOf(this.a.size()));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ List<RespRateEntity> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(List<RespRateEntity> list) {
            super(0);
            this.a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("unsync data block list size:", Integer.valueOf(this.a.size()));
        }
    }

    public PostDataUseCase(@NotNull IRespRateRepo iRespRateRepo, @NotNull Function0<Boolean> function0) {
        this.repo = iRespRateRepo;
        this.isSyncDataEnabled = function0;
    }

    public final boolean execute() {
        if (!this.isSyncDataEnabled.invoke().booleanValue()) {
            return true;
        }
        List<RespRateEntity> unSyncList = this.repo.getUnSyncList();
        if (unSyncList.isEmpty()) {
            return true;
        }
        HMLog.info(RespRateConstants.TAG, new a(unSyncList));
        long respRateTime = ((RespRateEntity) CollectionsKt.first((List) unSyncList)).getRespRateTime();
        long respRateTime2 = ((RespRateEntity) CollectionsKt.last((List) unSyncList)).getRespRateTime();
        TimeUtils timeUtils = TimeUtils.INSTANCE;
        List<RespRateEntity> respRateList = this.repo.getRespRateList(timeUtils.toUTC0StartTime(respRateTime), timeUtils.toUTC0EndTime(respRateTime2));
        HMLog.info(RespRateConstants.TAG, new b(respRateList));
        boolean zPostRespRateData = this.repo.postRespRateData(respRateList);
        if (zPostRespRateData) {
            Iterator<T> it2 = unSyncList.iterator();
            while (it2.hasNext()) {
                ((RespRateEntity) it2.next()).setSync(1);
            }
            this.repo.addList(unSyncList);
        }
        return zPostRespRateData;
    }
}
