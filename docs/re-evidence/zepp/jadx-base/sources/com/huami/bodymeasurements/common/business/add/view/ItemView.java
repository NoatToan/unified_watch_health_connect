package com.huami.bodymeasurements.common.business.add.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.huami.bodymeasurements.common.business.add.ItemViewApi;
import com.huami.tools.analytics.DbUtils;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u000b"}, d2 = {"Lcom/huami/bodymeasurements/common/business/add/view/ItemView;", "Landroid/widget/FrameLayout;", "Lcom/huami/bodymeasurements/common/business/add/ItemViewApi;", "", "saveEnable", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "common_release"}, k = 1, mv = {1, 5, 1})
public class ItemView extends FrameLayout implements ItemViewApi {
    public ItemView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void _$_clearFindViewByIdCache() {
    }

    public boolean saveEnable() {
        return false;
    }
}
