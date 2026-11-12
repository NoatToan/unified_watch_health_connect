package com.xiaomi.fitness.migration;

import android.content.Context;
import androidx.sqlite.db.SupportSQLiteDatabase;
import com.xiaomi.fitness.common.utils.FileUtils;
import defpackage.frc;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fitness/migration/OtherTransformation;", "Lfrc;", "", "name", "", "deleteDb", "(Ljava/lang/String;)V", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "db", "doTransformation", "(Landroidx/sqlite/db/SupportSQLiteDatabase;)V", "Landroid/content/Context;", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class OtherTransformation implements frc {

    @NotNull
    private final Context context;

    public OtherTransformation(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    private final void deleteDb(String name) {
        deleteDbFile(FileUtils.getDatabaseDir(this.context).getAbsolutePath() + File.separator + name);
    }

    @Override // defpackage.frc
    public /* bridge */ /* synthetic */ void deleteDbFile(String str) {
        super.deleteDbFile(str);
    }

    @Override // defpackage.frc
    public void doTransformation(@NotNull SupportSQLiteDatabase db) {
        Intrinsics.checkNotNullParameter(db, "db");
        deleteDb("health_data_source");
        deleteDb("health_survey");
        deleteDb("mistat_ev");
        deleteDb("mistat_pf");
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }
}
