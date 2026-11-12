package com.huami.health.afppg.usecase;

import android.content.Context;
import com.huami.health.afppg.PpgCoroutineScope;
import com.huami.health.afppg.data.local.PPGDataBase;
import com.huami.health.afppg.data.local.RRDataKeeper;
import com.huami.health.afppg.service.PPGFilePathService;
import com.huami.tools.analytics.DbUtils;
import com.tekartik.sqflite.Constant;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0014\u0010\u0006\u001a\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004J\u0014\u0010\u0007\u001a\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004R\u0016\u0010\n\u001a\u00020\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\tR\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/huami/health/afppg/usecase/ClearAllUserDataUseCase;", "", "", "a", "Lkotlin/Function0;", "onFinish", Constant.METHOD_EXECUTE, "executeWhenMutexLogin", "Lcom/huami/health/afppg/data/local/PPGDataBase;", "Lcom/huami/health/afppg/data/local/PPGDataBase;", "ppgDataBase", "Lcom/huami/health/afppg/PpgCoroutineScope;", "b", "Lcom/huami/health/afppg/PpgCoroutineScope;", "scope", "Landroid/content/Context;", "c", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "<init>", "(Lcom/huami/health/afppg/data/local/PPGDataBase;Lcom/huami/health/afppg/PpgCoroutineScope;Landroid/content/Context;)V", "afppg-core_release"}, k = 1, mv = {1, 5, 1})
public final class ClearAllUserDataUseCase {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final PPGDataBase ppgDataBase;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final PpgCoroutineScope scope;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    public ClearAllUserDataUseCase(@NotNull PPGDataBase pPGDataBase, @NotNull PpgCoroutineScope ppgCoroutineScope, @NotNull Context context) {
        this.ppgDataBase = pPGDataBase;
        this.scope = ppgCoroutineScope;
        this.context = context;
    }

    private final void a() {
        PPGFilePathService.INSTANCE.deleteAllFile(this.context);
    }

    public final void execute(@NotNull Function0<Unit> onFinish) {
        this.ppgDataBase.clearAllTables();
        RRDataKeeper.INSTANCE.clear();
        a();
        CoroutineScopeKt.cancel$default(this.scope, null, 1, null);
        onFinish.invoke();
    }

    public final void executeWhenMutexLogin(@NotNull Function0<Unit> onFinish) {
        this.ppgDataBase.clearAllTables();
        RRDataKeeper.INSTANCE.clear();
        a();
        onFinish.invoke();
    }
}
