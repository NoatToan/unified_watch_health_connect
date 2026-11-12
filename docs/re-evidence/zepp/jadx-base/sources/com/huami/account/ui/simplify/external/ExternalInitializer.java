package com.huami.account.ui.simplify.external;

import android.app.Application;
import android.content.Context;
import com.google.android.exoplayer2.util.MimeTypes;
import com.huami.tools.analytics.DbUtils;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J(\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&J\u0010\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH&J\u0018\u0010\u000f\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0004H&J\u0010\u0010\u0010\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH&J \u0010\u0014\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0004H&J\b\u0010\u0015\u001a\u00020\tH&¨\u0006\u0016"}, d2 = {"Lcom/huami/account/ui/simplify/external/ExternalInitializer;", "", "Landroid/app/Application;", MimeTypes.BASE_TYPE_APPLICATION, "", "flavorProduction", "flavorChannel", "", "isDebug", "", "initGlobalUtil", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "initLog", "name", "initWebKeeper", "initHttp", "", "miAppId", "appName", "initAppConfig", "initWebContainer", "accountui-simplify_release"}, k = 1, mv = {1, 4, 1})
public interface ExternalInitializer {
    void initAppConfig(@NotNull Context context, long miAppId, @NotNull String appName);

    void initGlobalUtil(@NotNull Application application, @NotNull String flavorProduction, @NotNull String flavorChannel, boolean isDebug);

    void initHttp(@NotNull Context context);

    void initLog(@NotNull Context context);

    void initWebContainer();

    void initWebKeeper(@NotNull Context context, @NotNull String name);
}
