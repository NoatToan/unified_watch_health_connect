package com.xiaomi.fitness.aggregation.db;

import android.content.Context;
import androidx.sqlite.db.SupportSQLiteDatabase;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.persist.db.FitnessDBConfiguration;
import com.xiaomi.fit.fitness.persist.db.FitnessDBConstants;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.manager.AccountManager;
import com.xiaomi.fitness.login.export.RegionExtKt;
import com.xiaomi.fitness.login.export.RegionManager;
import defpackage.el1;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\b\u0010\t¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/aggregation/db/FitnessSummaryCallback;", "Lel1;", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "db", "", "onAsyncCreate", "(Landroidx/sqlite/db/SupportSQLiteDatabase;)V", "", "migrationOnce", "()Z", "Landroid/content/Context;", "ctx", "<init>", "(Landroid/content/Context;)V", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class FitnessSummaryCallback extends el1 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FitnessSummaryCallback(@NotNull Context ctx) {
        super(ctx);
        Intrinsics.checkNotNullParameter(ctx, "ctx");
    }

    @Override // defpackage.el1
    public boolean migrationOnce() {
        return false;
    }

    @Override // defpackage.el1
    public void onAsyncCreate(@NotNull SupportSQLiteDatabase db) {
        String path;
        Intrinsics.checkNotNullParameter(db, "db");
        getContext().deleteDatabase("fitness_summary");
        if (AccountManagerExtKt.getInstance(AccountManager.INSTANCE).isLogin()) {
            FitnessDBConfiguration fitnessDBConfiguration = FitnessDBConfiguration.INSTANCE;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            File file = new File(fitnessDBConfiguration.makeDatabasePath(context, FitnessDBConstants.PATH_NO_ACCOUNT, RegionExtKt.getInstance(RegionManager.INSTANCE).getCurrentRegion()), "fitness_summary");
            if (!file.exists() || (path = db.getPath()) == null || StringsKt__StringsKt.contains$default((CharSequence) path, (CharSequence) FitnessDBConstants.PATH_NO_ACCOUNT, false, 2, (Object) null)) {
                return;
            }
            FitnessLogUtils.i("DB_Trans", "delete not login db");
            getContext().deleteDatabase(file.getAbsolutePath());
        }
    }
}
