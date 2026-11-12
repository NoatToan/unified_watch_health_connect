package com.huami.applet.jsengine.plugin;

import android.content.Context;
import com.huami.tools.analytics.DbUtils;
import com.xmlywind.sdk.common.mta.PointCategory;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0007\u001a\u00020\u0006H&R\u0016\u0010\n\u001a\u00020\u00028&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/huami/applet/jsengine/plugin/JavascriptExecuteInterface;", "", "", "message", "", PointCategory.COMPLETE, "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "getName", "()Ljava/lang/String;", "name", "applet_release"}, k = 1, mv = {1, 5, 1})
public interface JavascriptExecuteInterface {
    void complete(@NotNull String message);

    @NotNull
    Context context();

    @NotNull
    String getName();
}
