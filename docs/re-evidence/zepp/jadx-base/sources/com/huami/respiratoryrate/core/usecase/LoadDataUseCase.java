package com.huami.respiratoryrate.core.usecase;

import com.huami.respiratoryrate.core.RespRateConstants;
import com.huami.respiratoryrate.core.data.local.entity.RespRateEntity;
import com.huami.respiratoryrate.core.repo.IRespRateRepo;
import com.huami.respiratoryrate.core.utils.TimeUtils;
import com.huami.respiratoryrate.core.utils.TimeUtilsKt;
import com.huami.tools.log.HMLog;
import com.tekartik.sqflite.Constant;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.language.CommonLanguageSettingFragment;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u0011\u0010\u0012J\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002R\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001c\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/huami/respiratoryrate/core/usecase/LoadDataUseCase;", "", "", "from", "to", "", "Lcom/huami/respiratoryrate/core/data/local/entity/RespRateEntity;", Constant.METHOD_EXECUTE, "Lcom/huami/respiratoryrate/core/repo/IRespRateRepo;", "a", "Lcom/huami/respiratoryrate/core/repo/IRespRateRepo;", CommonLanguageSettingFragment.KEY_REPO, "Lkotlin/Function0;", "", "b", "Lkotlin/jvm/functions/Function0;", "isSyncDataEnabled", "<init>", "(Lcom/huami/respiratoryrate/core/repo/IRespRateRepo;Lkotlin/jvm/functions/Function0;)V", "core_release"}, k = 1, mv = {1, 5, 1})
public final class LoadDataUseCase {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final IRespRateRepo repo;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Function0<Boolean> isSyncDataEnabled;

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
            return "load rawTime:" + this.a + ",adjustTime:" + this.b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ long a;
        public final /* synthetic */ long b;
        public final /* synthetic */ long c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long j, long j2, long j3) {
            super(0);
            this.a = j;
            this.b = j2;
            this.c = j3;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "load rawTimeStr:" + TimeUtilsKt.toCurDateFullString(this.a) + ",adjustTimeStr:" + TimeUtilsKt.toCurDateFullString(TimeUtilsKt.toMillis(this.b)) + ",toTimeStr:" + TimeUtilsKt.toCurDateFullString(this.c);
        }
    }

    public LoadDataUseCase(@NotNull IRespRateRepo iRespRateRepo, @NotNull Function0<Boolean> function0) {
        this.repo = iRespRateRepo;
        this.isSyncDataEnabled = function0;
    }

    @NotNull
    public final List<RespRateEntity> execute(long from, long to) {
        if (!this.isSyncDataEnabled.invoke().booleanValue()) {
            return this.repo.getRespRateList(TimeUtilsKt.toSecond(from), TimeUtilsKt.toSecond(to));
        }
        long uTC0StartTime = TimeUtils.INSTANCE.toUTC0StartTime(TimeUtilsKt.toSecond(from));
        HMLog.info(RespRateConstants.TAG, new a(from, uTC0StartTime));
        HMLog.info(RespRateConstants.TAG, new b(from, uTC0StartTime, to));
        List<RespRateEntity> listLoadRespRateList = this.repo.loadRespRateList(TimeUtilsKt.toMillis(uTC0StartTime), to);
        if (listLoadRespRateList.isEmpty()) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        Iterator<T> it2 = listLoadRespRateList.iterator();
        while (it2.hasNext()) {
            ((RespRateEntity) it2.next()).setSync(1);
        }
        this.repo.addList(listLoadRespRateList);
        return this.repo.getRespRateList(TimeUtilsKt.toSecond(from), TimeUtilsKt.toSecond(to));
    }
}
