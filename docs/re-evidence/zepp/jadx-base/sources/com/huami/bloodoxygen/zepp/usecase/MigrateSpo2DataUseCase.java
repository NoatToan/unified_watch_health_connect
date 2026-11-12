package com.huami.bloodoxygen.zepp.usecase;

import com.huami.bloodoxygen.core.local.database.entity.ClickMeasuredSpo2;
import com.huami.bloodoxygen.core.local.database.entity.Odi;
import com.huami.bloodoxygen.core.local.database.entity.OsaEvent;
import com.huami.bloodoxygen.core.local.kvkit.KvKey;
import com.huami.bloodoxygen.core.remote.upload.IUploader;
import com.huami.tools.log.HMLog;
import com.tekartik.sqflite.Constant;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B%\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\u0013¢\u0006\u0004\b\u0017\u0010\u0018J6\u0010\n\u001a\u00020\t2\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002R\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\u00138\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u001a"}, d2 = {"Lcom/huami/bloodoxygen/zepp/usecase/MigrateSpo2DataUseCase;", "", "", "Lcom/huami/bloodoxygen/core/local/database/entity/ClickMeasuredSpo2;", "clickMeasuredSpo2s", "Lcom/huami/bloodoxygen/core/local/database/entity/Odi;", "odis", "Lcom/huami/bloodoxygen/core/local/database/entity/OsaEvent;", "osaEvents", "", Constant.METHOD_EXECUTE, "Lcom/huami/bloodoxygen/core/local/kvkit/KvKey;", "a", "Lcom/huami/bloodoxygen/core/local/kvkit/KvKey;", "kvKey", "Lcom/huami/bloodoxygen/core/remote/upload/IUploader;", "b", "Lcom/huami/bloodoxygen/core/remote/upload/IUploader;", "uploader", "Lkotlin/Function0;", "c", "Lkotlin/jvm/functions/Function0;", "isSyncDataEnable", "<init>", "(Lcom/huami/bloodoxygen/core/local/kvkit/KvKey;Lcom/huami/bloodoxygen/core/remote/upload/IUploader;Lkotlin/jvm/functions/Function0;)V", "Companion", "zepp_release"}, k = 1, mv = {1, 5, 1})
public final class MigrateSpo2DataUseCase {

    @NotNull
    private static final String d = "MigrateDataUseCase";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final KvKey kvKey;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final IUploader uploader;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Function0<Boolean> isSyncDataEnable;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "MigrateDataUseCase isSyncDataEnable false";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ List<ClickMeasuredSpo2> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(List<ClickMeasuredSpo2> list) {
            super(0);
            this.a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            int size = this.a.size();
            ClickMeasuredSpo2 clickMeasuredSpo2 = (ClickMeasuredSpo2) CollectionsKt.firstOrNull((List) this.a);
            Long lValueOf = clickMeasuredSpo2 == null ? null : Long.valueOf(clickMeasuredSpo2.getTimestamp());
            ClickMeasuredSpo2 clickMeasuredSpo3 = (ClickMeasuredSpo2) CollectionsKt.lastOrNull((List) this.a);
            return "execute clickSpo2s " + size + " " + lValueOf + " " + (clickMeasuredSpo3 != null ? Long.valueOf(clickMeasuredSpo3.getTimestamp()) : null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ List<OsaEvent> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(List<OsaEvent> list) {
            super(0);
            this.a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            int size = this.a.size();
            OsaEvent osaEvent = (OsaEvent) CollectionsKt.firstOrNull((List) this.a);
            Long lValueOf = osaEvent == null ? null : Long.valueOf(osaEvent.getTimestamp());
            OsaEvent osaEvent2 = (OsaEvent) CollectionsKt.lastOrNull((List) this.a);
            return "execute osaEvents " + size + " " + lValueOf + " " + (osaEvent2 != null ? Long.valueOf(osaEvent2.getTimestamp()) : null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ List<Odi> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(List<Odi> list) {
            super(0);
            this.a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            int size = this.a.size();
            Odi odi = (Odi) CollectionsKt.firstOrNull((List) this.a);
            Long lValueOf = odi == null ? null : Long.valueOf(odi.getTimestamp());
            Odi odi2 = (Odi) CollectionsKt.lastOrNull((List) this.a);
            return "execute odis " + size + " " + lValueOf + " " + (odi2 != null ? Long.valueOf(odi2.getTimestamp()) : null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public static final e a = new e();

        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "migrateSuccess is true";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<String> {
        public final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(boolean z) {
            super(0);
            this.a = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "result " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<String> {
        public final /* synthetic */ Throwable a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Throwable th) {
            super(0);
            this.a = th;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "error " + this.a.getMessage();
        }
    }

    public MigrateSpo2DataUseCase(@NotNull KvKey kvKey, @NotNull IUploader iUploader, @NotNull Function0<Boolean> function0) {
        this.kvKey = kvKey;
        this.uploader = iUploader;
        this.isSyncDataEnable = function0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean execute$default(MigrateSpo2DataUseCase migrateSpo2DataUseCase, List list, List list2, List list3, int i, Object obj) {
        if ((i & 1) != 0) {
            list = CollectionsKt__CollectionsKt.emptyList();
        }
        if ((i & 2) != 0) {
            list2 = CollectionsKt__CollectionsKt.emptyList();
        }
        if ((i & 4) != 0) {
            list3 = CollectionsKt__CollectionsKt.emptyList();
        }
        return migrateSpo2DataUseCase.execute(list, list2, list3);
    }

    public final boolean execute(@NotNull List<ClickMeasuredSpo2> clickMeasuredSpo2s, @NotNull List<Odi> odis, @NotNull List<OsaEvent> osaEvents) {
        Object objM3845constructorimpl;
        boolean z = true;
        if (!this.isSyncDataEnable.invoke().booleanValue()) {
            HMLog.info(d, a.a);
            return true;
        }
        HMLog.info(d, new b(clickMeasuredSpo2s));
        HMLog.info(d, new c(osaEvents));
        HMLog.info(d, new d(odis));
        try {
            Result.Companion companion = Result.Companion;
            Boolean migrateSuccess = this.kvKey.getMigrateSuccess();
            Boolean bool = Boolean.TRUE;
            if (Intrinsics.areEqual(migrateSuccess, bool)) {
                HMLog.info(d, e.a);
                return true;
            }
            if (!this.uploader.uploadClickSpo2s(clickMeasuredSpo2s) || !this.uploader.uploadOdis(odis) || !this.uploader.uploadOsaEvents(osaEvents)) {
                z = false;
            }
            HMLog.info(d, new f(z));
            if (z) {
                this.kvKey.setMigrateSuccess(bool);
            }
            objM3845constructorimpl = Result.m3845constructorimpl(Boolean.valueOf(z));
            Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
            if (thM3848exceptionOrNullimpl != null) {
                HMLog.info(d, new g(thM3848exceptionOrNullimpl));
            }
            Boolean bool2 = Boolean.FALSE;
            if (Result.m3850isFailureimpl(objM3845constructorimpl)) {
                objM3845constructorimpl = bool2;
            }
            return ((Boolean) objM3845constructorimpl).booleanValue();
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
    }
}
