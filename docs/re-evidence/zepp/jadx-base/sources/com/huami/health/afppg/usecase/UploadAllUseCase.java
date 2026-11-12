package com.huami.health.afppg.usecase;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.tools.log.HMLog;
import com.tekartik.sqflite.Constant;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u0007\u001a\u00020\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\u000f\u001a\u00020\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u00148\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, d2 = {"Lcom/huami/health/afppg/usecase/UploadAllUseCase;", "", "", Constant.METHOD_EXECUTE, "", "a", "Ljava/lang/String;", "userId", "Lcom/huami/health/afppg/usecase/PostAFibUseCase;", "b", "Lcom/huami/health/afppg/usecase/PostAFibUseCase;", "postAFibUseCase", "Lcom/huami/health/afppg/usecase/PostRRPeakUseCase;", "c", "Lcom/huami/health/afppg/usecase/PostRRPeakUseCase;", "postRRPeakUseCase", "Lcom/huami/health/afppg/usecase/PostHRUseCase;", GoogleApiAvailabilityLight.a, "Lcom/huami/health/afppg/usecase/PostHRUseCase;", "postHRUseCase", "Lkotlin/Function0;", "e", "Lkotlin/jvm/functions/Function0;", "isSyncDataEnabled", "<init>", "(Ljava/lang/String;Lcom/huami/health/afppg/usecase/PostAFibUseCase;Lcom/huami/health/afppg/usecase/PostRRPeakUseCase;Lcom/huami/health/afppg/usecase/PostHRUseCase;Lkotlin/jvm/functions/Function0;)V", "afppg-core_release"}, k = 1, mv = {1, 5, 1})
public final class UploadAllUseCase {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String userId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final PostAFibUseCase postAFibUseCase;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final PostRRPeakUseCase postRRPeakUseCase;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final PostHRUseCase postHRUseCase;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Function0<Boolean> isSyncDataEnabled;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ boolean a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ boolean c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z, boolean z2, boolean z3) {
            super(0);
            this.a = z;
            this.b = z2;
            this.c = z3;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "af_ppg uploadAll: rr: " + this.a + ", af: " + this.b + ", hr: " + this.c;
        }
    }

    public UploadAllUseCase(@NotNull String str, @NotNull PostAFibUseCase postAFibUseCase, @NotNull PostRRPeakUseCase postRRPeakUseCase, @NotNull PostHRUseCase postHRUseCase, @NotNull Function0<Boolean> function0) {
        this.userId = str;
        this.postAFibUseCase = postAFibUseCase;
        this.postRRPeakUseCase = postRRPeakUseCase;
        this.postHRUseCase = postHRUseCase;
        this.isSyncDataEnabled = function0;
    }

    public final boolean execute() {
        if (!this.isSyncDataEnabled.invoke().booleanValue()) {
            return true;
        }
        boolean zUploadRRPeak = this.postRRPeakUseCase.uploadRRPeak();
        boolean zPostAF = this.postAFibUseCase.postAF(this.userId);
        boolean zExecute = this.postHRUseCase.execute();
        HMLog.info$default(null, new a(zUploadRRPeak, zPostAF, zExecute), 1, null);
        return zUploadRRPeak && zPostAF && zExecute;
    }
}
