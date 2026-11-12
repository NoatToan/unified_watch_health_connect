package com.huami.sky.lib.repo;

import com.huami.sky.lib.api.SkyAppSettingApi;
import com.huami.tools.log.HMLog;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016R\u0016\u0010\u0007\u001a\u00020\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/huami/sky/lib/repo/SkyAppSettingRepoImpl;", "Lcom/huami/sky/lib/repo/SkyAppSettingRepo;", "", "getPlaybackParam", "Lcom/huami/sky/lib/api/SkyAppSettingApi;", "a", "Lcom/huami/sky/lib/api/SkyAppSettingApi;", "appSettingApi", "<init>", "(Lcom/huami/sky/lib/api/SkyAppSettingApi;)V", "sky-lib_release"}, k = 1, mv = {1, 5, 1})
public final class SkyAppSettingRepoImpl implements SkyAppSettingRepo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final SkyAppSettingApi appSettingApi;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ Throwable a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Throwable th) {
            super(0);
            this.a = th;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "获取播放控制参数接口失败：" + this.a;
        }
    }

    public SkyAppSettingRepoImpl(@NotNull SkyAppSettingApi skyAppSettingApi) {
        this.appSettingApi = skyAppSettingApi;
    }

    @Override // com.huami.sky.lib.repo.SkyAppSettingRepo
    @Nullable
    public String getPlaybackParam() {
        Object objM3845constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(this.appSettingApi.getPlaybackParam().getFadeInOut());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
        if (thM3848exceptionOrNullimpl != null) {
            HMLog.info("SkyAppSettingRepoImpl", new a(thM3848exceptionOrNullimpl));
        }
        if (Result.m3850isFailureimpl(objM3845constructorimpl)) {
            objM3845constructorimpl = null;
        }
        return (String) objM3845constructorimpl;
    }
}
