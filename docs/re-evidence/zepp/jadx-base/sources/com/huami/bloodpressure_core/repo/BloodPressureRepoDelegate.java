package com.huami.bloodpressure_core.repo;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bloodpressure_core.dc.local.BloodPressureDbVo;
import com.huami.bloodpressure_core.ext.UserEx;
import com.huami.bloodpressure_core.p002const.BloodPressureConst;
import com.huami.ecg.core.db.entity.EcgData;
import com.huami.tools.log.HMLog;
import com.huami.watch.companion.ecg.media.MediaRecorderHelper;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0096\u0001J\u0017\u0010\u0007\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0096\u0001J#\u0010\f\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0096Aø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000e\u001a\u00020\u0005H\u0016J\b\u0010\u000f\u001a\u00020\u0005H\u0016R\u0016\u0010\u0012\u001a\u00020\u00018\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0018\u001a\u00020\u00138\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015R\u0016\u0010\u001b\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001e"}, d2 = {"Lcom/huami/bloodpressure_core/repo/BloodPressureRepoDelegate;", "Lcom/huami/bloodpressure_core/repo/IBloodPressureRepo;", "", "Lcom/huami/bloodpressure_core/dc/local/BloodPressureDbVo;", "list", "", "saveAndPostData", "saveAndPostNightData", "", "dateString", "", "days", "getRemoteNightData", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUserData", "cleanData", "a", "Lcom/huami/bloodpressure_core/repo/IBloodPressureRepo;", "iBloodPressureRepo", "", "b", "J", "lastToTime", "c", "TIME_INTERVAL", GoogleApiAvailabilityLight.a, "Ljava/lang/String;", "lastUserId", "<init>", "(Lcom/huami/bloodpressure_core/repo/IBloodPressureRepo;)V", "bloodpressure-core_release"}, k = 1, mv = {1, 5, 1})
public final class BloodPressureRepoDelegate implements IBloodPressureRepo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final IBloodPressureRepo iBloodPressureRepo;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private long lastToTime;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final long TIME_INTERVAL = MediaRecorderHelper.MAX_RECORD_TIME;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private String lastUserId = EcgData.DEFAULT_DIGIT_VALUE;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "getUserDataInInterval";
        }
    }

    public BloodPressureRepoDelegate(@NotNull IBloodPressureRepo iBloodPressureRepo) {
        this.iBloodPressureRepo = iBloodPressureRepo;
    }

    @Override // com.huami.bloodpressure_core.repo.IBloodPressureRepo
    public void cleanData() {
        this.lastToTime = 0L;
        this.iBloodPressureRepo.cleanData();
    }

    @Override // com.huami.bloodpressure_core.repo.IBloodPressureRepo
    @Nullable
    public Object getRemoteNightData(@NotNull String str, int i, @NotNull Continuation<? super Unit> continuation) {
        return this.iBloodPressureRepo.getRemoteNightData(str, i, continuation);
    }

    @Override // com.huami.bloodpressure_core.repo.IBloodPressureRepo
    public void getUserData() {
        if (!this.lastUserId.equals(UserEx.getUserId())) {
            this.iBloodPressureRepo.getUserData();
            this.lastUserId = UserEx.getUserId();
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.lastToTime < this.TIME_INTERVAL) {
            HMLog.debug(BloodPressureConst.INSTANCE.getTAG(), a.a);
            return;
        }
        this.iBloodPressureRepo.getUserData();
        this.lastUserId = UserEx.getUserId();
        this.lastToTime = jCurrentTimeMillis;
    }

    @Override // com.huami.bloodpressure_core.repo.IBloodPressureRepo
    public void saveAndPostData(@NotNull List<BloodPressureDbVo> list) {
        this.iBloodPressureRepo.saveAndPostData(list);
    }

    @Override // com.huami.bloodpressure_core.repo.IBloodPressureRepo
    public void saveAndPostNightData(@NotNull List<BloodPressureDbVo> list) {
        this.iBloodPressureRepo.saveAndPostNightData(list);
    }
}
