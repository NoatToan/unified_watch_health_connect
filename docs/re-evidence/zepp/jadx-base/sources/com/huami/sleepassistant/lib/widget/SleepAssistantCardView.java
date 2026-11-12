package com.huami.sleepassistant.lib.widget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.cardview.widget.CardView;
import com.huami.sleepassistant.lib.R;
import com.huami.tools.analytics.DbUtils;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/huami/sleepassistant/lib/widget/SleepAssistantCardView;", "Landroidx/cardview/widget/CardView;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class SleepAssistantCardView extends CardView {
    public SleepAssistantCardView(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        super(context, attributeSet);
        setRadius(context.getResources().getDimension(R.dimen.sls_card_radius));
        setCardElevation(context.getResources().getDimension(R.dimen.sls_card_elevation));
        setPreventCornerOverlap(false);
        setUseCompatPadding(true);
    }

    public void _$_clearFindViewByIdCache() {
    }
}
