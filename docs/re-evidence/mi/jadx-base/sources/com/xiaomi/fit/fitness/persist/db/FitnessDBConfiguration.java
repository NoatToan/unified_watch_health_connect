package com.xiaomi.fit.fitness.persist.db;

import android.content.Context;
import com.xiaomi.fitness.common.utils.FileUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\u0005¨\u0006\n"}, d2 = {"Lcom/xiaomi/fit/fitness/persist/db/FitnessDBConfiguration;", "", "<init>", "()V", "makeDatabasePath", "", "context", "Landroid/content/Context;", "account", "region", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FitnessDBConfiguration {

    @NotNull
    public static final FitnessDBConfiguration INSTANCE = new FitnessDBConfiguration();

    private FitnessDBConfiguration() {
    }

    @NotNull
    public final String makeDatabasePath(@NotNull Context context, @Nullable String account, @NotNull String region) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(region, "region");
        if (account == null) {
            account = FitnessDBConstants.PATH_NO_ACCOUNT;
        }
        String str = FileUtils.getDatabaseDir(context) + "/" + account + "/" + region;
        if (!FileUtils.isExists(str)) {
            FileUtils.INSTANCE.makeDirs(str);
        }
        return str;
    }
}
