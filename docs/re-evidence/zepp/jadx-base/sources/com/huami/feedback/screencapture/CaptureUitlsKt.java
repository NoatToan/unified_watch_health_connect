package com.huami.feedback.screencapture;

import android.content.Context;
import android.graphics.Point;
import android.view.WindowManager;
import com.huami.tools.analytics.DbUtils;
import java.util.Objects;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u000e\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¨\u0006\u0004"}, d2 = {"Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/graphics/Point;", "getScreeSize", "feedback-impl_release"}, k = 2, mv = {1, 5, 1})
public final class CaptureUitlsKt {
    @NotNull
    public static final Point getScreeSize(@NotNull Context context) {
        Point point = new Point();
        Object systemService = context.getSystemService("window");
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        ((WindowManager) systemService).getDefaultDisplay().getRealSize(point);
        return point;
    }
}
