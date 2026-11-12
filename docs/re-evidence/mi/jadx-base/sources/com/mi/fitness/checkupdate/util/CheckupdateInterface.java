package com.mi.fitness.checkupdate.util;

import com.xiaomi.fitness.common.app.AppManager;
import com.xiaomi.fitness.main.export.MainHelper;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/mi/fitness/checkupdate/util/CheckupdateInterface;", "", "getAppManager", "Lcom/xiaomi/fitness/common/app/AppManager;", "getMainHelper", "Lcom/xiaomi/fitness/main/export/MainHelper;", "checkupdate_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface CheckupdateInterface {
    @NotNull
    AppManager getAppManager();

    @NotNull
    MainHelper getMainHelper();
}
