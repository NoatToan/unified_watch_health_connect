package com.huami.bloodoxygen.core.usecase.clickspo2;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bloodoxygen.core.local.database.entity.ClickMeasuredSpo2;
import com.huami.bloodoxygen.core.remote.upload.IUploader;
import com.huami.bloodoxygen.core.repository.IBloodOxygenRepo;
import com.huami.tools.log.HMLog;
import com.tekartik.sqflite.Constant;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.language.CommonLanguageSettingFragment;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.e;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB-\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u0011\u0012\u0006\u0010\u0018\u001a\u00020\u0015¢\u0006\u0004\b\u0019\u0010\u001aJ#\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u00118\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c"}, d2 = {"Lcom/huami/bloodoxygen/core/usecase/clickspo2/SaveManualClickSpo2UseCase;", "", "", "spo2", "", "timestamp", "", Constant.METHOD_EXECUTE, "(IJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "a", "Ljava/lang/String;", "userId", "Lcom/huami/bloodoxygen/core/remote/upload/IUploader;", "b", "Lcom/huami/bloodoxygen/core/remote/upload/IUploader;", "uploader", "Lkotlin/Function0;", "c", "Lkotlin/jvm/functions/Function0;", "isSyncDataEnable", "Lcom/huami/bloodoxygen/core/repository/IBloodOxygenRepo;", GoogleApiAvailabilityLight.a, "Lcom/huami/bloodoxygen/core/repository/IBloodOxygenRepo;", CommonLanguageSettingFragment.KEY_REPO, "<init>", "(Ljava/lang/String;Lcom/huami/bloodoxygen/core/remote/upload/IUploader;Lkotlin/jvm/functions/Function0;Lcom/huami/bloodoxygen/core/repository/IBloodOxygenRepo;)V", "Companion", "core_release"}, k = 1, mv = {1, 5, 1})
public final class SaveManualClickSpo2UseCase {

    @NotNull
    private static final String e = "SaveClickSpo2UseCase";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String userId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final IUploader uploader;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Function0<Boolean> isSyncDataEnable;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final IBloodOxygenRepo repo;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "SaveClickSpo2UseCase isSyncDataEnable false";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ int a;
        public final /* synthetic */ long b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i, long j) {
            super(0);
            this.a = i;
            this.b = j;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return this.a + " " + this.b;
        }
    }

    public SaveManualClickSpo2UseCase(@NotNull String str, @NotNull IUploader iUploader, @NotNull Function0<Boolean> function0, @NotNull IBloodOxygenRepo iBloodOxygenRepo) {
        this.userId = str;
        this.uploader = iUploader;
        this.isSyncDataEnable = function0;
        this.repo = iBloodOxygenRepo;
    }

    @Nullable
    public final Object execute(int i, long j, @NotNull Continuation<? super Boolean> continuation) {
        List<ClickMeasuredSpo2> listListOf = e.listOf(new ClickMeasuredSpo2(this.userId, j, i, 0, null, null, null, null, null, false, 1016, null));
        if (this.isSyncDataEnable.invoke().booleanValue()) {
            HMLog.info(e, new b(i, j));
            return Boxing.boxBoolean(this.uploader.uploadClickSpo2s(listListOf));
        }
        HMLog.info$default(null, a.a, 1, null);
        this.repo.addLocalClickSpo2s(listListOf);
        return Boxing.boxBoolean(true);
    }
}
