package com.huami.bloodoxygen.core.usecase.other;

import com.huami.bloodoxygen.core.local.config.BloodOxygenCoroutineScope;
import com.huami.bloodoxygen.core.remote.upload.IUploader;
import com.huami.bloodoxygen.core.usecase.clickspo2.ClearInvalidClickSpo2UseCase;
import com.huami.bloodoxygen.core.utils.PackagefunctionKt;
import com.xmlywind.sdk.common.mta.PointCategory;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B#\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0011\u0010\u0012J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0014"}, d2 = {"Lcom/huami/bloodoxygen/core/usecase/other/BloodOxygenLifecycleUseCase;", "", "", PointCategory.LOAD, "unLoad", "Lcom/huami/bloodoxygen/core/usecase/clickspo2/ClearInvalidClickSpo2UseCase;", "a", "Lcom/huami/bloodoxygen/core/usecase/clickspo2/ClearInvalidClickSpo2UseCase;", "clearInvalidClickSpo2UseCase", "Lcom/huami/bloodoxygen/core/remote/upload/IUploader;", "b", "Lcom/huami/bloodoxygen/core/remote/upload/IUploader;", "uploader", "Lcom/huami/bloodoxygen/core/local/config/BloodOxygenCoroutineScope;", "c", "Lcom/huami/bloodoxygen/core/local/config/BloodOxygenCoroutineScope;", "scope", "<init>", "(Lcom/huami/bloodoxygen/core/usecase/clickspo2/ClearInvalidClickSpo2UseCase;Lcom/huami/bloodoxygen/core/remote/upload/IUploader;Lcom/huami/bloodoxygen/core/local/config/BloodOxygenCoroutineScope;)V", "Companion", "core_release"}, k = 1, mv = {1, 5, 1})
public final class BloodOxygenLifecycleUseCase {

    @NotNull
    private static final String d = "BloodOxygenLifecycleUseCase";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private final ClearInvalidClickSpo2UseCase clearInvalidClickSpo2UseCase;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final IUploader uploader;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final BloodOxygenCoroutineScope scope;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "BloodOxygenLifecycleUseCase load";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "BloodOxygenLifecycleUseCase unload";
        }
    }

    public BloodOxygenLifecycleUseCase(@Nullable ClearInvalidClickSpo2UseCase clearInvalidClickSpo2UseCase, @NotNull IUploader iUploader, @NotNull BloodOxygenCoroutineScope bloodOxygenCoroutineScope) {
        this.clearInvalidClickSpo2UseCase = clearInvalidClickSpo2UseCase;
        this.uploader = iUploader;
        this.scope = bloodOxygenCoroutineScope;
    }

    public final void load() {
        PackagefunctionKt.bloodOxygenDebugLog$default(null, a.a, 1, null);
        ClearInvalidClickSpo2UseCase clearInvalidClickSpo2UseCase = this.clearInvalidClickSpo2UseCase;
        if (clearInvalidClickSpo2UseCase != null) {
            clearInvalidClickSpo2UseCase.execute();
        }
        this.uploader.register();
    }

    public final void unLoad() {
        PackagefunctionKt.bloodOxygenDebugLog$default(null, b.a, 1, null);
        this.uploader.unregister();
        CoroutineScopeKt.cancel$default(this.scope, null, 1, null);
    }

    public /* synthetic */ BloodOxygenLifecycleUseCase(ClearInvalidClickSpo2UseCase clearInvalidClickSpo2UseCase, IUploader iUploader, BloodOxygenCoroutineScope bloodOxygenCoroutineScope, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : clearInvalidClickSpo2UseCase, iUploader, bloodOxygenCoroutineScope);
    }
}
