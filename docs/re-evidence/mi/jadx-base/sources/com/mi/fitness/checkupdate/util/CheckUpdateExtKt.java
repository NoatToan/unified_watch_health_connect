package com.mi.fitness.checkupdate.util;

import com.xiaomi.fitness.common.app.AppManager;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.main.export.MainHelper;
import dagger.hilt.android.EntryPointAccessors;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0011\u0010\u0000\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"appManager", "Lcom/xiaomi/fitness/common/app/AppManager;", "getAppManager", "()Lcom/xiaomi/fitness/common/app/AppManager;", "mainHelper", "Lcom/xiaomi/fitness/main/export/MainHelper;", "getMainHelper", "()Lcom/xiaomi/fitness/main/export/MainHelper;", "checkupdate_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class CheckUpdateExtKt {

    @NotNull
    private static final AppManager appManager = ((CheckupdateInterface) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), CheckupdateInterface.class)).getAppManager();

    @NotNull
    private static final MainHelper mainHelper = ((CheckupdateInterface) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), CheckupdateInterface.class)).getMainHelper();

    @NotNull
    public static final AppManager getAppManager() {
        return appManager;
    }

    @NotNull
    public static final MainHelper getMainHelper() {
        return mainHelper;
    }
}
