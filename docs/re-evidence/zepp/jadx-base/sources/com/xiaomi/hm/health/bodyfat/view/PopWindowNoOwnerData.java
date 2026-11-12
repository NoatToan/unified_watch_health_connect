package com.xiaomi.hm.health.bodyfat.view;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.PopupWindow;
import com.huami.tools.analytics.DbUtils;
import com.xiaomi.hm.health.bodyfat.R;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/hm/health/bodyfat/view/PopWindowNoOwnerData;", "Landroid/widget/PopupWindow;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "<init>", "(Landroid/content/Context;)V", "bodyfat_midongRelease"}, k = 1, mv = {1, 5, 1})
public final class PopWindowNoOwnerData extends PopupWindow {
    public PopWindowNoOwnerData(@NotNull Context context) {
        super(context);
        setContentView(View.inflate(context, R.layout.popwindow_no_owner_data, null));
        setBackgroundDrawable(new ColorDrawable());
    }
}
