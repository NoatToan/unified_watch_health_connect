package com.mi.fitness.checkupdate.export;

import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import dagger.hilt.android.EntryPointAccessors;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0011\u0010\u0000\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"checkUpdateManager", "Lcom/mi/fitness/checkupdate/export/CheckUpdateManager;", "getCheckUpdateManager", "()Lcom/mi/fitness/checkupdate/export/CheckUpdateManager;", "checkupdate-export_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class CheckUpdateExtKt {

    @NotNull
    private static final CheckUpdateManager checkUpdateManager = ((CheckupdateManagerPoint) EntryPointAccessors.fromApplication(ApplicationExtKt.getApplication(), CheckupdateManagerPoint.class)).getCheckUpdateManager();

    @NotNull
    public static final CheckUpdateManager getCheckUpdateManager() {
        return checkUpdateManager;
    }
}
