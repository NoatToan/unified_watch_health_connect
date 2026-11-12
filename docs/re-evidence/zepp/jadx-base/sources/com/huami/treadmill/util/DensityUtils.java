package com.huami.treadmill.util;

import android.content.Context;
import com.huami.tools.analytics.DbUtils;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0016\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0004¨\u0006\f"}, d2 = {"Lcom/huami/treadmill/util/DensityUtils;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "dpValue", "", "dip2px", "pxValue", "px2dip", "<init>", "()V", "treadmill_release"}, k = 1, mv = {1, 5, 1})
public final class DensityUtils {

    @NotNull
    public static final DensityUtils INSTANCE = new DensityUtils();

    private DensityUtils() {
    }

    public final int dip2px(@NotNull Context context, float dpValue) {
        return (int) ((dpValue * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public final int px2dip(@NotNull Context context, float pxValue) {
        return (int) ((pxValue / context.getResources().getDisplayMetrics().density) + 0.5f);
    }
}
